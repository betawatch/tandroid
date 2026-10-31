package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.f8;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class u {
    public static volatile boolean e = false;
    public final Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public u(Bitmap bitmap, int i10, int i11, int i12) {
        this.a = bitmap;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public static u a(String str, float f7, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!e) {
                    synchronized (u.class) {
                        try {
                            if (!e) {
                                JLatexMathAndroid.init(org.telegram.messenger.w0.b);
                                e = true;
                            }
                        } finally {
                        }
                    }
                }
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f7).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i10 = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z10) {
                        try {
                            i10 = build.icon().getIconDepth();
                        } catch (Throwable th2) {
                            f8.g(th2, true);
                        }
                    }
                    return new u(createBitmap, intrinsicWidth, intrinsicHeight, i10);
                }
            } catch (Throwable th3) {
                f8.g(th3, true);
            }
        }
        return null;
    }
}
