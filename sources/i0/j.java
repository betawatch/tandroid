package i0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import f7.j8;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends j8 {
    public static Font g(FontFamily fontFamily, int i9) {
        FontStyle fontStyle = new FontStyle((i9 & 1) != 0 ? 700 : 400, (i9 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int i10 = i(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int i12 = i(fontStyle, font2.getStyle());
            if (i12 < i10) {
                font = font2;
                i10 = i12;
            }
        }
        return font;
    }

    public static FontFamily h(o0.i[] iVarArr, ContentResolver contentResolver) {
        int i9;
        ParcelFileDescriptor openFileDescriptor;
        int length = iVarArr.length;
        FontFamily.Builder builder = null;
        while (i9 < length) {
            o0.i iVar = iVarArr[i9];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(iVar.a, "r", null);
            } catch (IOException e10) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            }
            if (openFileDescriptor == null) {
                i9 = openFileDescriptor == null ? i9 + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(iVar.c).setSlant(iVar.d ? 1 : 0).setTtcIndex(iVar.b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // f7.j8
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i9) {
        try {
            FontFamily.Builder builder = null;
            for (h0.f fVar : eVar.a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f).setWeight(fVar.b).setSlant(fVar.c ? 1 : 0).setTtcIndex(fVar.e).setFontVariationSettings(fVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i9).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // f7.j8
    public final Typeface b(Context context, o0.i[] iVarArr, int i9) {
        try {
            FontFamily h = h(iVarArr, context.getContentResolver());
            if (h == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(h).setStyle(g(h, i9).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // f7.j8
    public final Typeface c(Context context, List list, int i9) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily h = h((o0.i[]) list.get(0), contentResolver);
            if (h == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(h);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily h10 = h((o0.i[]) list.get(i10), contentResolver);
                if (h10 != null) {
                    customFallbackBuilder.addCustomFallback(h10);
                }
            }
            return customFallbackBuilder.setStyle(g(h, i9).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // f7.j8
    public final Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // f7.j8
    public final Typeface e(Context context, Resources resources, int i9, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i9).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // f7.j8
    public final o0.i f(o0.i[] iVarArr, int i9) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
