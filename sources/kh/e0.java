package kh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e0 {
    public int a;
    public final org.telegram.ui.Components.y5 b;
    public final ImageReceiver c;
    public d0 d;
    public TextureView e;
    public boolean f;
    public t h;
    public boolean m;
    public a8 n;
    public ValueAnimator o;
    public final /* synthetic */ f0 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public e0(f0 f0Var) {
        this.p = f0Var;
        this.b = new org.telegram.ui.Components.y5(f0Var, 0L, 1200L, gr.g);
        this.c = new ImageReceiver(f0Var);
    }

    public final void a(a8 a8Var) {
        float f10;
        d0 d0Var = this.d;
        if (d0Var != null) {
            d0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = a8Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        String r10 = aa.d.r(sb2, (a8Var == null || !a8Var.K) ? "" : "_g", "_exif");
        a8 a8Var2 = this.n;
        f0 f0Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (a8Var2 == null) {
            imageReceiver.clearImage();
        } else if (a8Var2.K) {
            Bitmap bitmap = a8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = a8Var2.b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str = a8Var2.N;
                    if (str != null) {
                        imageReceiver.setImage(str, r10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
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
            if (!f0Var.r0) {
                a8 a8Var3 = this.n;
                if (!a8Var3.Y && f0Var.j0) {
                    f10 = a8Var3.P;
                    d0Var3.setVolume(f10);
                    if (f0Var.j0 || f0Var.m0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f10 = 0.0f;
            d0Var3.setVolume(f10);
            if (f0Var.j0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(a8Var2.L.getAbsolutePath(), r10, null, null, 0L);
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
                AndroidUtilities.lerp(rectF2, rectF, this.l, rectF2);
            } else {
                f0.c(f0Var, rectF2, tVar);
            }
            if (tVar == null) {
                f0.c(f0Var, rectF, tVar2);
            } else {
                f0Var.k(rectF, tVar);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new f2.f0(this, 3));
            this.o.addListener(new ag.e(this, 21));
            this.o.setInterpolator(gr.h);
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
