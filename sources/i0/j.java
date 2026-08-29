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
import h7.f8;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends f8 {
    public static Font g(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int i11 = i(fontStyle, font.getStyle());
        for (int i12 = 1; i12 < fontFamily.getSize(); i12++) {
            Font font2 = fontFamily.getFont(i12);
            int i13 = i(fontStyle, font2.getStyle());
            if (i13 < i11) {
                font = font2;
                i11 = i13;
            }
        }
        return font;
    }

    public static FontFamily h(o0.j[] jVarArr, ContentResolver contentResolver) {
        int i10;
        ParcelFileDescriptor openFileDescriptor;
        int length = jVarArr.length;
        FontFamily.Builder builder = null;
        while (i10 < length) {
            o0.j jVar = jVarArr[i10];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(jVar.a, "r", null);
            } catch (IOException e10) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            }
            if (openFileDescriptor == null) {
                i10 = openFileDescriptor == null ? i10 + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(jVar.c).setSlant(jVar.d ? 1 : 0).setTtcIndex(jVar.b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th2) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
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

    @Override // h7.f8
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i10) {
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // h7.f8
    public final Typeface b(Context context, o0.j[] jVarArr, int i10) {
        try {
            FontFamily h = h(jVarArr, context.getContentResolver());
            if (h == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(h).setStyle(g(h, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // h7.f8
    public final Typeface c(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily h = h((o0.j[]) list.get(0), contentResolver);
            if (h == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(h);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily h10 = h((o0.j[]) list.get(i11), contentResolver);
                if (h10 != null) {
                    customFallbackBuilder.addCustomFallback(h10);
                }
            }
            return customFallbackBuilder.setStyle(g(h, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // h7.f8
    public final Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // h7.f8
    public final Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // h7.f8
    public final o0.j f(o0.j[] jVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
