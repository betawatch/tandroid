package gi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d0 {
    public int a;
    public final org.telegram.ui.Components.u5 b;
    public final ImageReceiver c;
    public c0 d;
    public TextureView e;
    public boolean f;
    public s h;
    public boolean m;
    public f7 n;
    public ValueAnimator o;
    public final /* synthetic */ e0 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public d0(e0 e0Var) {
        this.p = e0Var;
        this.b = new org.telegram.ui.Components.u5(e0Var, 0L, 1200L, xq.g);
        this.c = new ImageReceiver(e0Var);
    }

    public final void a(f7 f7Var) {
        float f10;
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = f7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.p));
        String s6 = a1.g.s(sb2, (f7Var == null || !f7Var.K) ? "" : "_g", "_exif");
        f7 f7Var2 = this.n;
        e0 e0Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (f7Var2 == null) {
            imageReceiver.f();
        } else if (f7Var2.K) {
            Bitmap bitmap = f7Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = f7Var2.b1;
                if (bitmap2 != null) {
                    imageReceiver.v0(bitmap2);
                } else {
                    String str = f7Var2.N;
                    if (str != null) {
                        imageReceiver.o0(str, s6, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.e = textureView2;
            e0Var.addView(textureView2);
            c0 c0Var2 = new c0(this, 0);
            this.d = c0Var2;
            c0Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.w0) {
                f7 f7Var3 = this.n;
                if (!f7Var3.Y && e0Var.o0) {
                    f10 = f7Var3.P;
                    c0Var3.setVolume(f10);
                    if (e0Var.o0 || e0Var.r0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f10 = 0.0f;
            c0Var3.setVolume(f10);
            if (e0Var.o0) {
            }
            this.d.play();
        } else {
            imageReceiver.o0(f7Var2.L.getAbsolutePath(), s6, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o = null;
        }
        RectF rectF = this.k;
        e0 e0Var = this.p;
        if (z10) {
            boolean z11 = this.i;
            RectF rectF2 = this.j;
            if (z11) {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.l, rectF2);
            } else {
                e0.a(e0Var, rectF2, sVar);
            }
            if (sVar == null) {
                e0.a(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new ei.n4(this, 2));
            this.o.addListener(new ai.e1(this, 19));
            this.o.setInterpolator(xq.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.l = 1.0f;
        }
        e0Var.invalidate();
        this.i = true;
    }
}
