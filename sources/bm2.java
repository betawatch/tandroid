// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class bm2 {
    public int a;
    public final ln b;
    public final ImageReceiver c;
    public am2 d;
    public TextureView e;
    public boolean f;
    public rl2 h;
    public boolean m;
    public g6b n;
    public ValueAnimator o;
    public final /* synthetic */ cm2 p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public bm2(cm2 cm2Var) {
        this.p = cm2Var;
        this.b = new ln(cm2Var, 0L, 1200L, d53.g);
        this.c = new ImageReceiver(cm2Var);
    }

    public final void a(g6b g6bVar) {
        float f;
        am2 am2Var = this.d;
        if (am2Var != null) {
            am2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            gm.B2(textureView);
            this.e = null;
        }
        byte b = 0;
        this.f = false;
        this.n = g6bVar;
        StringBuilder sb = new StringBuilder();
        Point point = gm.q;
        sb.append((int) Math.ceil(point.x / gm.p));
        sb.append("_");
        sb.append((int) Math.ceil(point.y / gm.p));
        String j = b10.j(sb, (g6bVar == null || !g6bVar.K) ? "" : "_g", "_exif");
        g6b g6bVar2 = this.n;
        cm2 cm2Var = this.p;
        ImageReceiver imageReceiver = this.c;
        if (g6bVar2 == null) {
            imageReceiver.f();
        } else if (g6bVar2.K) {
            Bitmap bitmap = g6bVar2.M0;
            if (bitmap != null) {
                imageReceiver.f0(bitmap);
            } else {
                Bitmap bitmap2 = g6bVar2.b1;
                if (bitmap2 != null) {
                    imageReceiver.f0(bitmap2);
                } else {
                    String str = g6bVar2.N;
                    if (str != null) {
                        imageReceiver.e0(str, j, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(cm2Var.getContext());
            this.e = textureView2;
            cm2Var.addView(textureView2);
            am2 am2Var2 = new am2(this, b);
            this.d = am2Var2;
            am2Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            am2 am2Var3 = this.d;
            if (!cm2Var.w0) {
                g6b g6bVar3 = this.n;
                if (!g6bVar3.Y && cm2Var.o0) {
                    f = g6bVar3.P;
                    am2Var3.setVolume(f);
                    if (cm2Var.o0 || cm2Var.r0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f = 0.0f;
            am2Var3.setVolume(f);
            if (cm2Var.o0) {
            }
            this.d.play();
        } else {
            imageReceiver.e0(g6bVar2.L.getAbsolutePath(), j, null, null, 0L);
        }
        cm2Var.invalidate();
    }

    public final void b(rl2 rl2Var, boolean z) {
        rl2 rl2Var2 = this.h;
        if (rl2Var != null) {
            this.h = rl2Var;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o = null;
        }
        byte b = 1;
        RectF rectF = this.k;
        cm2 cm2Var = this.p;
        if (z) {
            boolean z2 = this.i;
            RectF rectF2 = this.j;
            if (z2) {
                gm.X1(rectF2, rectF, this.l, rectF2);
            } else {
                cm2Var.k(rectF2, rl2Var);
            }
            if (rl2Var == null) {
                cm2Var.k(rectF, rl2Var2);
            } else {
                cm2Var.j(rectF, rl2Var);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new af0(this, (byte) 3));
            this.o.addListener(new kh2(this, b));
            this.o.setInterpolator(d53.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            cm2Var.j(rectF, rl2Var);
            this.l = 1.0f;
        }
        cm2Var.invalidate();
        this.i = true;
    }
}
