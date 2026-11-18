package hi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class e0 {
    public int a;
    public final org.telegram.ui.Components.c6 b;
    public final ImageReceiver c;
    public d0 d;
    public TextureView e;
    public boolean f;
    public t h;
    public boolean m;
    public d7 n;
    public ValueAnimator o;
    public final /* synthetic */ f0 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public e0(f0 f0Var) {
        this.p = f0Var;
        this.b = new org.telegram.ui.Components.c6(f0Var, 0L, 1200L, lr.g);
        this.c = new ImageReceiver(f0Var);
    }

    public final void a(d7 d7Var) {
        float f10;
        d0 d0Var = this.d;
        if (d0Var != null) {
            d0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = d7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.p));
        String s5 = a8.p0.s(sb2, (d7Var == null || !d7Var.K) ? "" : "_g", "_exif");
        d7 d7Var2 = this.n;
        f0 f0Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (d7Var2 == null) {
            imageReceiver.f();
        } else if (d7Var2.K) {
            Bitmap bitmap = d7Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = d7Var2.b1;
                if (bitmap2 != null) {
                    imageReceiver.v0(bitmap2);
                } else {
                    String str = d7Var2.N;
                    if (str != null) {
                        imageReceiver.o0(str, s5, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(f0Var.getContext());
            this.e = textureView2;
            f0Var.addView(textureView2);
            d0 d0Var2 = new d0(this, 0);
            this.d = d0Var2;
            d0Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            d0 d0Var3 = this.d;
            if (!f0Var.w0) {
                d7 d7Var3 = this.n;
                if (!d7Var3.Y && f0Var.o0) {
                    f10 = d7Var3.P;
                    d0Var3.setVolume(f10);
                    if (f0Var.o0 || f0Var.r0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f10 = 0.0f;
            d0Var3.setVolume(f10);
            if (f0Var.o0) {
            }
            this.d.play();
        } else {
            imageReceiver.o0(d7Var2.L.getAbsolutePath(), s5, null, null, 0L);
        }
        f0Var.invalidate();
    }

    public final void b(t tVar, boolean z10) {
        t tVar2 = this.h;
        if (tVar != null) {
            this.h = tVar;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o = null;
        }
        RectF rectF = this.k;
        f0 f0Var = this.p;
        if (z10) {
            boolean z11 = this.i;
            RectF rectF2 = this.j;
            if (z11) {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.l, rectF2);
            } else {
                f0.a(f0Var, rectF2, tVar);
            }
            if (tVar == null) {
                f0.a(f0Var, rectF, tVar2);
            } else {
                f0Var.k(rectF, tVar);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new fi.d4(this, 2));
            this.o.addListener(new ai.j0(this, 19));
            this.o.setInterpolator(lr.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            f0Var.k(rectF, tVar);
            this.l = 1.0f;
        }
        f0Var.invalidate();
        this.i = true;
    }
}
