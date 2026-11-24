// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.a;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class lx5 {
    public static volatile boolean e = false;
    public final Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public lx5(Bitmap bitmap, int i, int i2, int i3) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static lx5 a(String str, float f, boolean z) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!e) {
                    synchronized (lx5.class) {
                        try {
                            if (!e) {
                                JLatexMathAndroid.init(a.b);
                                e = true;
                            }
                        } finally {
                        }
                    }
                }
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z) {
                        try {
                            i = build.icon().getIconDepth();
                        } catch (Throwable th) {
                            fa4.g(th, true);
                        }
                    }
                    return new lx5(createBitmap, intrinsicWidth, intrinsicHeight, i);
                }
            } catch (Throwable th2) {
                fa4.g(th2, true);
            }
        }
        return null;
    }
}
