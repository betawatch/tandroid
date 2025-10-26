package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompat$$ExternalSyntheticBackport2;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Consumer;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
abstract class FontRequestWorker {
    static final LruCache sTypefaceCache = new LruCache(16);
    private static final ExecutorService DEFAULT_EXECUTOR_SERVICE = RequestExecutor.createDefaultExecutor("fonts-androidx", 10, 10000);
    static final Object LOCK = new Object();
    static final SimpleArrayMap PENDING_REPLIES = new SimpleArrayMap();

    static Typeface requestFontSync(final Context context, final FontRequest fontRequest, CallbackWrapper callbackWrapper, final int i, int i2) {
        List m;
        List m2;
        m = TypefaceCompat$$ExternalSyntheticBackport2.m(new Object[]{fontRequest});
        final String createCacheId = createCacheId(m, i);
        Typeface typeface = (Typeface) sTypefaceCache.get(createCacheId);
        if (typeface != null) {
            callbackWrapper.onTypefaceResult(new TypefaceResult(typeface));
            return typeface;
        }
        if (i2 == -1) {
            m2 = TypefaceCompat$$ExternalSyntheticBackport2.m(new Object[]{fontRequest});
            TypefaceResult fontSync = getFontSync(createCacheId, context, m2, i);
            callbackWrapper.onTypefaceResult(fontSync);
            return fontSync.mTypeface;
        }
        try {
            TypefaceResult typefaceResult = (TypefaceResult) RequestExecutor.submit(DEFAULT_EXECUTOR_SERVICE, new Callable() { // from class: androidx.core.provider.FontRequestWorker.1
                @Override // java.util.concurrent.Callable
                public TypefaceResult call() {
                    List m3;
                    String str = createCacheId;
                    Context context2 = context;
                    m3 = TypefaceCompat$$ExternalSyntheticBackport2.m(new Object[]{fontRequest});
                    return FontRequestWorker.getFontSync(str, context2, m3, i);
                }
            }, i2);
            callbackWrapper.onTypefaceResult(typefaceResult);
            return typefaceResult.mTypeface;
        } catch (InterruptedException unused) {
            callbackWrapper.onTypefaceResult(new TypefaceResult(-3));
            return null;
        }
    }

    static Typeface requestFontAsync(final Context context, final List list, final int i, Executor executor, final CallbackWrapper callbackWrapper) {
        final String createCacheId = createCacheId(list, i);
        Typeface typeface = (Typeface) sTypefaceCache.get(createCacheId);
        if (typeface != null) {
            callbackWrapper.onTypefaceResult(new TypefaceResult(typeface));
            return typeface;
        }
        Consumer consumer = new Consumer() { // from class: androidx.core.provider.FontRequestWorker.2
            @Override // androidx.core.util.Consumer
            public void accept(TypefaceResult typefaceResult) {
                if (typefaceResult == null) {
                    typefaceResult = new TypefaceResult(-3);
                }
                CallbackWrapper.this.onTypefaceResult(typefaceResult);
            }
        };
        synchronized (LOCK) {
            try {
                SimpleArrayMap simpleArrayMap = PENDING_REPLIES;
                ArrayList arrayList = (ArrayList) simpleArrayMap.get(createCacheId);
                if (arrayList != null) {
                    arrayList.add(consumer);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(consumer);
                simpleArrayMap.put(createCacheId, arrayList2);
                Callable callable = new Callable() { // from class: androidx.core.provider.FontRequestWorker.3
                    @Override // java.util.concurrent.Callable
                    public TypefaceResult call() {
                        try {
                            return FontRequestWorker.getFontSync(createCacheId, context, list, i);
                        } catch (Throwable unused) {
                            return new TypefaceResult(-3);
                        }
                    }
                };
                if (executor == null) {
                    executor = DEFAULT_EXECUTOR_SERVICE;
                }
                RequestExecutor.execute(executor, callable, new Consumer() { // from class: androidx.core.provider.FontRequestWorker.4
                    @Override // androidx.core.util.Consumer
                    public void accept(TypefaceResult typefaceResult) {
                        synchronized (FontRequestWorker.LOCK) {
                            try {
                                SimpleArrayMap simpleArrayMap2 = FontRequestWorker.PENDING_REPLIES;
                                ArrayList arrayList3 = (ArrayList) simpleArrayMap2.get(createCacheId);
                                if (arrayList3 == null) {
                                    return;
                                }
                                simpleArrayMap2.remove(createCacheId);
                                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                                    ((Consumer) arrayList3.get(i2)).accept(typefaceResult);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                });
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String createCacheId(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((FontRequest) list.get(i2)).getId());
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    static TypefaceResult getFontSync(String str, Context context, List list, int i) {
        Trace.beginSection("getFontSync");
        try {
            LruCache lruCache = sTypefaceCache;
            Typeface typeface = (Typeface) lruCache.get(str);
            if (typeface != null) {
                return new TypefaceResult(typeface);
            }
            FontsContractCompat.FontFamilyResult fontFamilyResult = FontProvider.getFontFamilyResult(context, list, null);
            int fontFamilyResultStatus = getFontFamilyResultStatus(fontFamilyResult);
            if (fontFamilyResultStatus != 0) {
                return new TypefaceResult(fontFamilyResultStatus);
            }
            Typeface createFromFontInfo = (!fontFamilyResult.hasFallback() || Build.VERSION.SDK_INT < 29) ? TypefaceCompat.createFromFontInfo(context, null, fontFamilyResult.getFonts(), i) : TypefaceCompat.createFromFontInfoWithFallback(context, null, fontFamilyResult.getFontsWithFallbacks(), i);
            if (createFromFontInfo == null) {
                return new TypefaceResult(-3);
            }
            lruCache.put(str, createFromFontInfo);
            return new TypefaceResult(createFromFontInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            return new TypefaceResult(-1);
        } finally {
            Trace.endSection();
        }
    }

    private static int getFontFamilyResultStatus(FontsContractCompat.FontFamilyResult fontFamilyResult) {
        int i = 1;
        if (fontFamilyResult.getStatusCode() != 0) {
            return fontFamilyResult.getStatusCode() != 1 ? -3 : -2;
        }
        FontsContractCompat.FontInfo[] fonts = fontFamilyResult.getFonts();
        if (fonts != null && fonts.length != 0) {
            i = 0;
            for (FontsContractCompat.FontInfo fontInfo : fonts) {
                int resultCode = fontInfo.getResultCode();
                if (resultCode != 0) {
                    if (resultCode < 0) {
                        return -3;
                    }
                    return resultCode;
                }
            }
        }
        return i;
    }

    static final class TypefaceResult {
        final int mResult;
        final Typeface mTypeface;

        TypefaceResult(int i) {
            this.mTypeface = null;
            this.mResult = i;
        }

        TypefaceResult(Typeface typeface) {
            this.mTypeface = typeface;
            this.mResult = 0;
        }

        boolean isSuccess() {
            return this.mResult == 0;
        }
    }
}
