package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class t {
    public static volatile boolean e = false;
    public final Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public t(Bitmap bitmap, int i10, int i11, int i12) {
        this.a = bitmap;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public static t a(String str, float f7, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!e) {
                    synchronized (t.class) {
                        try {
                            if (!e) {
                                JLatexMathAndroid.init(ApplicationLoader.applicationContext);
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
                            FileLog.e(th2);
                        }
                    }
                    return new t(createBitmap, intrinsicWidth, intrinsicHeight, i10);
                }
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
        }
        return null;
    }
}
