package nh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d0 {
    public int a;
    public final org.telegram.ui.Components.d6 b;
    public final ImageReceiver c;
    public cg.v2 d;
    public TextureView e;
    public boolean f;
    public s h;
    public boolean m;
    public o7 n;
    public ValueAnimator o;
    public final /* synthetic */ e0 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public d0(e0 e0Var) {
        this.p = e0Var;
        this.b = new org.telegram.ui.Components.d6(e0Var, 0L, 1200L, jr.g);
        this.c = new ImageReceiver(e0Var);
    }

    public final void a(o7 o7Var) {
        float f9;
        cg.v2 v2Var = this.d;
        if (v2Var != null) {
            v2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = o7Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        String q6 = a4.w.q(sb2, (o7Var == null || !o7Var.K) ? "" : "_g", "_exif");
        o7 o7Var2 = this.n;
        e0 e0Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (o7Var2 == null) {
            imageReceiver.clearImage();
        } else if (o7Var2.K) {
            Bitmap bitmap = o7Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = o7Var2.b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str = o7Var2.N;
                    if (str != null) {
                        imageReceiver.setImage(str, q6, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.e = textureView2;
            e0Var.addView(textureView2);
            cg.v2 v2Var2 = new cg.v2(this, 1);
            this.d = v2Var2;
            v2Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            cg.v2 v2Var3 = this.d;
            if (!e0Var.r0) {
                o7 o7Var3 = this.n;
                if (!o7Var3.Y && e0Var.j0) {
                    f9 = o7Var3.P;
                    v2Var3.setVolume(f9);
                    if (e0Var.j0 || e0Var.m0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f9 = 0.0f;
            v2Var3.setVolume(f9);
            if (e0Var.j0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(o7Var2.L.getAbsolutePath(), q6, null, null, 0L);
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
                e0.c(e0Var, rectF2, sVar);
            }
            if (sVar == null) {
                e0.c(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new cg.c1(this, 5));
            this.o.addListener(new ag.m0(this, 27));
            this.o.setInterpolator(jr.h);
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
