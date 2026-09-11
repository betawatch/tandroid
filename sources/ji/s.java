package ji;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class s {
    public static volatile boolean e = false;
    public final Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public s(Bitmap bitmap, int i10, int i11, int i12) {
        this.a = bitmap;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public static s a(String str, float f7, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!e) {
                    synchronized (s.class) {
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
                    return new s(createBitmap, intrinsicWidth, intrinsicHeight, i10);
                }
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
        }
        return null;
    }
}
