package li;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.a8;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class q {
    public static volatile boolean e = false;
    public final Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public q(Bitmap bitmap, int i7, int i10, int i11) {
        this.a = bitmap;
        this.b = i7;
        this.c = i10;
        this.d = i11;
    }

    public static q a(String str, float f10, boolean z9) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!e) {
                    synchronized (q.class) {
                        try {
                            if (!e) {
                                JLatexMathAndroid.init(org.telegram.messenger.t0.b);
                                e = true;
                            }
                        } finally {
                        }
                    }
                }
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f10).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i7 = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z9) {
                        try {
                            i7 = build.icon().getIconDepth();
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                        }
                    }
                    return new q(createBitmap, intrinsicWidth, intrinsicHeight, i7);
                }
            } catch (Throwable th3) {
                a8.g(th3, true);
            }
        }
        return null;
    }
}
