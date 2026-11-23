package hi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class m0 {
    public int a;
    public final org.telegram.ui.Components.c6 b;
    public final ImageReceiver c;
    public l0 d;
    public TextureView e;
    public boolean f;
    public b0 h;
    public boolean m;
    public x7 n;
    public ValueAnimator o;
    public final /* synthetic */ n0 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public m0(n0 n0Var) {
        this.p = n0Var;
        this.b = new org.telegram.ui.Components.c6(n0Var, 0L, 1200L, kr.g);
        this.c = new ImageReceiver(n0Var);
    }

    public final void a(x7 x7Var) {
        float f10;
        l0 l0Var = this.d;
        if (l0Var != null) {
            l0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            org.telegram.messenger.g0.E2(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = x7Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.g0.q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.g0.p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.g0.p));
        String s5 = a8.p0.s(sb2, (x7Var == null || !x7Var.K) ? "" : "_g", "_exif");
        x7 x7Var2 = this.n;
        n0 n0Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (x7Var2 == null) {
            imageReceiver.f();
        } else if (x7Var2.K) {
            Bitmap bitmap = x7Var2.M0;
            if (bitmap != null) {
                imageReceiver.w0(bitmap);
            } else {
                Bitmap bitmap2 = x7Var2.b1;
                if (bitmap2 != null) {
                    imageReceiver.w0(bitmap2);
                } else {
                    String str = x7Var2.N;
                    if (str != null) {
                        imageReceiver.p0(str, s5, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(n0Var.getContext());
            this.e = textureView2;
            n0Var.addView(textureView2);
            l0 l0Var2 = new l0(this, 0);
            this.d = l0Var2;
            l0Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            l0 l0Var3 = this.d;
            if (!n0Var.w0) {
                x7 x7Var3 = this.n;
                if (!x7Var3.Y && n0Var.o0) {
                    f10 = x7Var3.P;
                    l0Var3.setVolume(f10);
                    if (n0Var.o0 || n0Var.r0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f10 = 0.0f;
            l0Var3.setVolume(f10);
            if (n0Var.o0) {
            }
            this.d.play();
        } else {
            imageReceiver.p0(x7Var2.L.getAbsolutePath(), s5, null, null, 0L);
        }
        n0Var.invalidate();
    }

    public final void b(b0 b0Var, boolean z10) {
        b0 b0Var2 = this.h;
        if (b0Var != null) {
            this.h = b0Var;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o = null;
        }
        RectF rectF = this.k;
        n0 n0Var = this.p;
        if (z10) {
            boolean z11 = this.i;
            RectF rectF2 = this.j;
            if (z11) {
                org.telegram.messenger.g0.Z1(rectF2, rectF, this.l, rectF2);
            } else {
                n0.a(n0Var, rectF2, b0Var);
            }
            if (b0Var == null) {
                n0.a(n0Var, rectF, b0Var2);
            } else {
                n0Var.k(rectF, b0Var);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new fi.d4(this, 2));
            this.o.addListener(new ai.g0(this, 19));
            this.o.setInterpolator(kr.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            n0Var.k(rectF, b0Var);
            this.l = 1.0f;
        }
        n0Var.invalidate();
        this.i = true;
    }
}
