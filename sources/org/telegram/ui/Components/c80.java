package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c80 {
    public final org.telegram.ui.u90 a;
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
    public final a80 m = new Choreographer.FrameCallback() { // from class: org.telegram.ui.Components.a80
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            c80 c80Var = c80.this;
            c80Var.j = false;
            c80Var.c();
        }
    };
    public final gp n = new gp(this, 23);

    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Components.a80] */
    public c80(org.telegram.ui.u90 u90Var) {
        this.a = u90Var;
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
                final Bitmap bitmap2 = this.f;
                this.h = true;
                try {
                    PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.telegram.ui.Components.b80
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i3) {
                            c80 c80Var = c80.this;
                            Bitmap bitmap3 = bitmap2;
                            c80Var.h = false;
                            if (c80Var.i || i3 != 0) {
                                return;
                            }
                            c80Var.f = c80Var.e;
                            c80Var.e = bitmap3;
                            c80Var.a.run();
                        }
                    }, this.b);
                } catch (Exception e10) {
                    this.h = false;
                    org.telegram.messenger.a8.g(e10, true);
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
