// default package

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class jk6 {
    public final dc6 a;
    public SurfaceView d;
    public Bitmap e;
    public Bitmap f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Paint c = new Paint(2);
    public final jr4 m = new jr4(this, (byte) 1);
    public final z96 n = new z96(this, (byte) 12);

    public jk6(dc6 dc6Var) {
        this.a = dc6Var;
    }

    public final void a() {
        this.l = SystemClock.uptimeMillis() + 1500;
        if (this.k) {
            this.b.removeCallbacks(this.n);
            this.k = false;
        }
        b();
    }

    public final void b() {
        if (!this.g || this.i || this.d == null || this.j || this.k) {
            return;
        }
        if (SystemClock.uptimeMillis() < this.l) {
            this.j = true;
            Choreographer.getInstance().postFrameCallback(this.m);
        } else {
            this.k = true;
            this.b.postDelayed(this.n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (!this.g || this.i) {
            return;
        }
        if (!this.h) {
            SurfaceView surfaceView = this.d;
            if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                int max = Math.max(1, surfaceView.getWidth() / 4);
                int max2 = Math.max(1, surfaceView.getHeight() / 4);
                Bitmap bitmap = this.f;
                if (bitmap == null || bitmap.getWidth() != max || this.f.getHeight() != max2) {
                    this.f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap2 = this.f;
                this.h = true;
                try {
                    PixelCopy.request(surfaceView, bitmap2, new pk(this, bitmap2, (byte) 2), this.b);
                } catch (Exception e) {
                    this.h = false;
                    cc4.g(e, true);
                }
            }
        }
        b();
    }

    public final void d() {
        if (this.j) {
            Choreographer.getInstance().removeFrameCallback(this.m);
            this.j = false;
        }
        if (this.k) {
            this.b.removeCallbacks(this.n);
            this.k = false;
        }
    }
}
