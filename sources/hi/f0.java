package hi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class f0 {
    public int a;
    public final org.telegram.ui.Components.d6 b;
    public final ImageReceiver c;
    public e0 d;
    public TextureView e;
    public boolean f;
    public u h;
    public boolean m;
    public c7 n;
    public ValueAnimator o;
    public final /* synthetic */ g0 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public f0(g0 g0Var) {
        this.p = g0Var;
        this.b = new org.telegram.ui.Components.d6(g0Var, 0L, 1200L, nr.g);
        this.c = new ImageReceiver(g0Var);
    }

    public final void a(c7 c7Var) {
        float f10;
        e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = c7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.p));
        String s5 = a8.p0.s(sb2, (c7Var == null || !c7Var.K) ? "" : "_g", "_exif");
        c7 c7Var2 = this.n;
        g0 g0Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (c7Var2 == null) {
            imageReceiver.f();
        } else if (c7Var2.K) {
            Bitmap bitmap = c7Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = c7Var2.b1;
                if (bitmap2 != null) {
                    imageReceiver.v0(bitmap2);
                } else {
                    String str = c7Var2.N;
                    if (str != null) {
                        imageReceiver.o0(str, s5, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(g0Var.getContext());
            this.e = textureView2;
            g0Var.addView(textureView2);
            e0 e0Var2 = new e0(this, 0);
            this.d = e0Var2;
            e0Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            e0 e0Var3 = this.d;
            if (!g0Var.w0) {
                c7 c7Var3 = this.n;
                if (!c7Var3.Y && g0Var.o0) {
                    f10 = c7Var3.P;
                    e0Var3.setVolume(f10);
                    if (g0Var.o0 || g0Var.r0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f10 = 0.0f;
            e0Var3.setVolume(f10);
            if (g0Var.o0) {
            }
            this.d.play();
        } else {
            imageReceiver.o0(c7Var2.L.getAbsolutePath(), s5, null, null, 0L);
        }
        g0Var.invalidate();
    }

    public final void b(u uVar, boolean z10) {
        u uVar2 = this.h;
        if (uVar != null) {
            this.h = uVar;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o = null;
        }
        RectF rectF = this.k;
        g0 g0Var = this.p;
        if (z10) {
            boolean z11 = this.i;
            RectF rectF2 = this.j;
            if (z11) {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.l, rectF2);
            } else {
                g0.a(g0Var, rectF2, uVar);
            }
            if (uVar == null) {
                g0.a(g0Var, rectF, uVar2);
            } else {
                g0Var.k(rectF, uVar);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new fi.d4(this, 2));
            this.o.addListener(new ai.k0(this, 19));
            this.o.setInterpolator(nr.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            g0Var.k(rectF, uVar);
            this.l = 1.0f;
        }
        g0Var.invalidate();
        this.i = true;
    }
}
