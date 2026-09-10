package bi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class i0 {
    public int a;
    public final org.telegram.ui.Components.d6 b;
    public final ImageReceiver c;
    public h0 d;
    public TextureView e;
    public boolean f;
    public w h;
    public boolean m;
    public r9 n;
    public ValueAnimator o;
    public final /* synthetic */ j0 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public i0(j0 j0Var) {
        this.p = j0Var;
        this.b = new org.telegram.ui.Components.d6(j0Var, 0L, 1200L, wr.g);
        this.c = new ImageReceiver(j0Var);
    }

    public final void a(r9 r9Var) {
        float f7;
        h0 h0Var = this.d;
        if (h0Var != null) {
            h0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = r9Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        String s10 = a4.a.s(sb2, (r9Var == null || !r9Var.K) ? "" : "_g", "_exif");
        r9 r9Var2 = this.n;
        j0 j0Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (r9Var2 == null) {
            imageReceiver.clearImage();
        } else if (r9Var2.K) {
            Bitmap bitmap = r9Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = r9Var2.b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str = r9Var2.N;
                    if (str != null) {
                        imageReceiver.setImage(str, s10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(j0Var.getContext());
            this.e = textureView2;
            j0Var.addView(textureView2);
            h0 h0Var2 = new h0(this, 0);
            this.d = h0Var2;
            h0Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            h0 h0Var3 = this.d;
            if (!j0Var.v0) {
                r9 r9Var3 = this.n;
                if (!r9Var3.Y && j0Var.n0) {
                    f7 = r9Var3.P;
                    h0Var3.setVolume(f7);
                    if (j0Var.n0 || j0Var.q0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f7 = 0.0f;
            h0Var3.setVolume(f7);
            if (j0Var.n0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(r9Var2.L.getAbsolutePath(), s10, null, null, 0L);
        }
        j0Var.invalidate();
    }

    public final void b(w wVar, boolean z10) {
        w wVar2 = this.h;
        if (wVar != null) {
            this.h = wVar;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o = null;
        }
        RectF rectF = this.k;
        j0 j0Var = this.p;
        if (z10) {
            boolean z11 = this.i;
            RectF rectF2 = this.j;
            if (z11) {
                AndroidUtilities.lerp(rectF2, rectF, this.l, rectF2);
            } else {
                j0.b(j0Var, rectF2, wVar);
            }
            if (wVar == null) {
                j0.b(j0Var, rectF, wVar2);
            } else {
                j0Var.k(rectF, wVar);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new ai.m(this, 1));
            this.o.addListener(new h(this, 1));
            this.o.setInterpolator(wr.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            j0Var.k(rectF, wVar);
            this.l = 1.0f;
        }
        j0Var.invalidate();
        this.i = true;
    }
}
