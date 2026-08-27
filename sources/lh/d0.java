package lh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d0 {
    public int a;
    public final org.telegram.ui.Components.y5 b;
    public final ImageReceiver c;
    public ag.o3 d;
    public TextureView e;
    public boolean f;
    public t h;
    public boolean m;
    public z7 n;
    public ValueAnimator o;
    public final /* synthetic */ e0 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public d0(e0 e0Var) {
        this.p = e0Var;
        this.b = new org.telegram.ui.Components.y5(e0Var, 0L, 1200L, er.g);
        this.c = new ImageReceiver(e0Var);
    }

    public final void a(z7 z7Var) {
        float f10;
        ag.o3 o3Var = this.d;
        if (o3Var != null) {
            o3Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = z7Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        String p6 = a9.p.p(sb2, (z7Var == null || !z7Var.K) ? "" : "_g", "_exif");
        z7 z7Var2 = this.n;
        e0 e0Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (z7Var2 == null) {
            imageReceiver.clearImage();
        } else if (z7Var2.K) {
            Bitmap bitmap = z7Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = z7Var2.b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str = z7Var2.N;
                    if (str != null) {
                        imageReceiver.setImage(str, p6, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.e = textureView2;
            e0Var.addView(textureView2);
            ag.o3 o3Var2 = new ag.o3(this, 1);
            this.d = o3Var2;
            o3Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            ag.o3 o3Var3 = this.d;
            if (!e0Var.r0) {
                z7 z7Var3 = this.n;
                if (!z7Var3.Y && e0Var.j0) {
                    f10 = z7Var3.P;
                    o3Var3.setVolume(f10);
                    if (e0Var.j0 || e0Var.m0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f10 = 0.0f;
            o3Var3.setVolume(f10);
            if (e0Var.j0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(z7Var2.L.getAbsolutePath(), p6, null, null, 0L);
        }
        e0Var.invalidate();
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
        e0 e0Var = this.p;
        if (z10) {
            boolean z11 = this.i;
            RectF rectF2 = this.j;
            if (z11) {
                AndroidUtilities.lerp(rectF2, rectF, this.l, rectF2);
            } else {
                e0.b(e0Var, rectF2, tVar);
            }
            if (tVar == null) {
                e0.b(e0Var, rectF, tVar2);
            } else {
                e0Var.k(rectF, tVar);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new ag.q1(this, 5));
            this.o.addListener(new ag.r1(this, 23));
            this.o.setInterpolator(er.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            e0Var.k(rectF, tVar);
            this.l = 1.0f;
        }
        e0Var.invalidate();
        this.i = true;
    }
}
