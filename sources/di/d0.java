package di;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class d0 {
    public int a;
    public final org.telegram.ui.Components.e6 b;
    public final ImageReceiver c;
    public c0 d;
    public TextureView e;
    public boolean f;
    public s h;
    public boolean m;
    public o8 n;
    public ValueAnimator o;
    public final /* synthetic */ e0 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public d0(e0 e0Var) {
        this.p = e0Var;
        this.b = new org.telegram.ui.Components.e6(e0Var, 0L, 1200L, pr.g);
        this.c = new ImageReceiver(e0Var);
    }

    public final void a(o8 o8Var) {
        float f7;
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = o8Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        String s10 = a4.a.s(sb2, (o8Var == null || !o8Var.K) ? "" : "_g", "_exif");
        o8 o8Var2 = this.n;
        e0 e0Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (o8Var2 == null) {
            imageReceiver.clearImage();
        } else if (o8Var2.K) {
            Bitmap bitmap = o8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = o8Var2.b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str = o8Var2.N;
                    if (str != null) {
                        imageReceiver.setImage(str, s10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
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
            if (!e0Var.v0) {
                o8 o8Var3 = this.n;
                if (!o8Var3.Y && e0Var.n0) {
                    f7 = o8Var3.P;
                    c0Var3.setVolume(f7);
                    if (e0Var.n0 || e0Var.q0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (e0Var.n0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(o8Var2.L.getAbsolutePath(), s10, null, null, 0L);
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
                AndroidUtilities.lerp(rectF2, rectF, this.l, rectF2);
            } else {
                e0.b(e0Var, rectF2, sVar);
            }
            if (sVar == null) {
                e0.b(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new bi.u5(this, 2));
            this.o.addListener(new ah.b(this, 15));
            this.o.setInterpolator(pr.h);
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
