package bi;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class m7 {
    public float A;
    public float B;
    public my0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final ud G;
    public final org.telegram.ui.Components.ic H;
    public final org.telegram.ui.Components.ic I;
    public final org.telegram.ui.Components.ic J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public ij R;
    public boolean S;
    public final te.c T;
    public z3 U;
    public z3 V;
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.f6 c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.g5 e;
    public int g;
    public RadialGradient h;
    public final zh.c1 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public my0 r;
    public float s;
    public my0 t;
    public float u;
    public float v;
    public float x;
    public final zh.j0 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public m7(int i7, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        zh.j0 j0Var = new zh.j0();
        this.y = j0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new ud(1, 25);
        this.K = new RectF();
        this.T = new te.c(0, new a1.c(this, 14), xq.h, 320L);
        this.a = i7;
        this.b = view;
        this.c = f6Var;
        this.j = new zh.c1(view);
        this.H = new org.telegram.ui.Components.ic(view);
        this.I = new org.telegram.ui.Components.ic(view);
        this.J = new org.telegram.ui.Components.ic(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(28.0f), view);
        j0Var.r = view;
        j0Var.d.H0(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.P();
            this.e.a();
            this.y.d.P();
        }
    }

    public final void b(Canvas canvas) {
        boolean z9 = this.L;
        zh.c1 c1Var = this.j;
        if (z9 && c1Var != null) {
            int i7 = this.M;
            int i10 = org.telegram.ui.ActionBar.r6.b;
            if (i7 != i10) {
                this.M = i10;
                try {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, this.c);
                    Paint paint = (Paint) c1Var.b;
                    paint.setShader(null);
                    paint.setColor(w02);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        te.c cVar = this.T;
        float f10 = cVar.f;
        float f11 = f10 / 2.0f;
        float f12 = this.P;
        RectF rectF = this.n;
        rectF.set(0.0f, 0.0f, f10, f12);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.k != null && (this.h == null || this.g != height)) {
            this.g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint2 = this.f;
        if (radialGradient != null) {
            Matrix matrix = this.i;
            matrix.reset();
            matrix.postTranslate(f11, f11);
            this.h.setLocalMatrix(matrix);
            paint2.setShader(this.h);
        }
        Path path = this.o;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), Path.Direction.CW);
        canvas.save();
        float a10 = this.I.a(0.0125f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint2);
        canvas.save();
        canvas.translate(f11, org.telegram.messenger.g0.L(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.k;
        org.telegram.ui.Components.g5 g5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            g5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        i1.a(canvas, 1, g5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        float L = org.telegram.messenger.g0.L(10.0f);
        float L2 = org.telegram.messenger.g0.L(110.0f);
        float L3 = org.telegram.messenger.g0.L(110.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(f11 - (org.telegram.messenger.g0.L(110.0f) / 2.0f), L, L2, L3);
        imageReceiver.h(canvas, null);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.k;
        if (stargiftattributebackdrop3 != null) {
            r12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i11 = r12;
        this.r.p = cVar.f - org.telegram.messenger.g0.L(12.0f);
        my0 my0Var = this.r;
        my0Var.c(f11 - (my0Var.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = cVar.f - org.telegram.messenger.g0.L(12.0f);
        my0 my0Var2 = this.t;
        Canvas canvas2 = canvas;
        int i12 = i11;
        my0Var2.c(f11 - (my0Var2.c / 2.0f), this.s, 1.0f, i12, canvas2);
        if (this.z) {
            zh.j0 j0Var = this.y;
            int i13 = j0Var.t;
            int i14 = j0Var.u;
            int i15 = (int) (f11 - (i13 / 2.0f));
            int i16 = (int) this.x;
            int i17 = i13 + i15;
            j0Var.setBounds(i15, i16, i17, i16 + i14);
            float f13 = this.x;
            RectF rectF2 = this.K;
            rectF2.set(i15, f13, i17, i14 + f13);
            float a11 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
            j0Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f14 = 9.0f;
            float L4 = this.u + org.telegram.messenger.g0.L(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i18 = 0;
            while (i18 < size) {
                int i19 = i18 + 1;
                l7 l7Var = (l7) arrayList.get(i18);
                my0 my0Var3 = l7Var.b;
                float f15 = f11 - (L4 / 2.0f);
                my0Var3.c((f15 + this.u) - my0Var3.c, l7Var.a, 1.0f, i12, canvas2);
                canvas2 = canvas;
                l7Var.c.c(f15 + this.u + org.telegram.messenger.g0.L(r19), l7Var.a, 1.0f, -1, canvas2);
                i12 = i12;
                i18 = i19;
                f14 = f14;
            }
        }
        int i20 = i12;
        if (!this.p) {
            float L5 = f11 - ((this.C.c + org.telegram.messenger.g0.L(30.0f)) / 2.0f);
            float f16 = this.A;
            float a12 = org.telegram.messenger.k5.a(this.C.c, org.telegram.messenger.g0.L(30.0f), 2.0f, f11);
            float f17 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(L5, f16, a12, f17);
            Path path2 = this.E;
            path2.rewind();
            float f18 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f18, f18, Path.Direction.CW);
            int r13 = org.telegram.ui.ActionBar.k6.r1(0.13f, -16777216);
            Paint paint3 = this.F;
            paint3.setColor(r13);
            float a13 = this.H.a(0.075f);
            canvas2.scale(a13, a13, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint3);
            canvas2.restore();
            c1Var.setBounds(((int) rectF.right) - org.telegram.messenger.g0.L(46.67f), ((int) rectF.top) - org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f) + ((int) rectF.right), org.telegram.messenger.g0.L(46.67f) + ((int) rectF.top));
            c1Var.y = i20;
            c1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.p) {
            return;
        }
        canvas.save();
        float a10 = this.I.a(0.0125f);
        RectF rectF = this.n;
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float a11 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        ud udVar = this.G;
        udVar.g(rectF2);
        udVar.d();
        udVar.a(canvas, org.telegram.ui.ActionBar.k6.r1(0.7f, -1));
        this.C.c(rectF2.left + org.telegram.messenger.g0.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.b;
        if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).T();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(float f10, float f11, MotionEvent motionEvent) {
        boolean z9;
        int action;
        boolean z10;
        boolean contains = this.D.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        if (this.U != null && this.z && !contains) {
            if (this.K.contains(motionEvent.getX() - f10, motionEvent.getY() - f11)) {
                z9 = true;
                boolean contains2 = this.n.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
                action = motionEvent.getAction();
                org.telegram.ui.Components.ic icVar = this.J;
                org.telegram.ui.Components.ic icVar2 = this.H;
                org.telegram.ui.Components.ic icVar3 = this.I;
                if (action != 0) {
                    icVar3.c((!contains2 || contains || z9) ? false : true);
                    icVar2.c(contains);
                    icVar.c(z9);
                } else if (motionEvent.getAction() == 2) {
                    if (icVar2.i && !contains) {
                        icVar2.c(false);
                    } else if (icVar.i && !z9) {
                        icVar.c(false);
                    } else if (icVar3.i && !contains2) {
                        icVar3.c(false);
                    }
                } else {
                    if (motionEvent.getAction() == 1 && icVar.i) {
                        icVar.c(false);
                        this.U.run();
                        return true;
                    }
                    if (motionEvent.getAction() == 1 && ((z10 = icVar2.i) || icVar3.i)) {
                        z3 z3Var = this.V;
                        if (z3Var != null) {
                            if (z10) {
                                z3Var.run();
                            }
                        } else if (this.L) {
                            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                            if (T != null) {
                                org.telegram.messenger.k5.o(null, 2131743881, org.telegram.ui.Components.hc.a0(T), R.raw.fire_on, 36);
                            }
                        } else {
                            k7 k7Var = new k7(this.b.getContext(), this.a, ij.B0(this.R.k), this.c, null);
                            k7Var.i2(this.R, null);
                            k7Var.show();
                        }
                        icVar2.c(false);
                        icVar3.c(false);
                        return true;
                    }
                    if (motionEvent.getAction() == 3 && (icVar2.i || icVar3.i || icVar.i)) {
                        icVar2.c(false);
                        icVar3.c(false);
                        icVar.c(false);
                        return true;
                    }
                }
                return !icVar2.i || icVar3.i || icVar.i;
            }
        }
        z9 = false;
        boolean contains22 = this.n.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        action = motionEvent.getAction();
        org.telegram.ui.Components.ic icVar4 = this.J;
        org.telegram.ui.Components.ic icVar22 = this.H;
        org.telegram.ui.Components.ic icVar32 = this.I;
        if (action != 0) {
        }
        if (icVar22.i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(ij ijVar, boolean z9) {
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique;
        boolean z10;
        org.telegram.ui.Components.g5 g5Var;
        ImageReceiver imageReceiver;
        TLRPC.Message message;
        this.N = false;
        this.R = ijVar;
        if (ijVar != null && (message = ijVar.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if (tL_messageActionStarGiftUnique != null || tL_messageActionStarGiftUnique.refunded || !(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                    tL_messageActionStarGiftUnique = null;
                }
                z10 = this.S;
                g5Var = this.e;
                imageReceiver = this.d;
                if (z10 && tL_messageActionStarGiftUnique != null && this.Q == null) {
                    imageReceiver.P();
                    g5Var.a();
                    this.y.d.P();
                }
                this.Q = tL_messageActionStarGiftUnique;
                this.p = ijVar == null && ijVar.h2;
                if (tL_messageActionStarGiftUnique != null) {
                    return;
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                this.k = (TL_stars.starGiftAttributeBackdrop) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                this.l = (TL_stars.starGiftAttributePattern) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = this.m;
                this.m = (TL_stars.starGiftAttributeModel) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                this.h = null;
                this.f.setShader(null);
                TL_stars.starGiftAttributePattern stargiftattributepattern = this.l;
                if (stargiftattributepattern != null) {
                    g5Var.i(stargiftattributepattern.document, z9);
                } else {
                    g5Var.g(null, z9);
                }
                TL_stars.starGiftAttributeModel stargiftattributemodel2 = this.m;
                if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
                    if (this.p) {
                        imageReceiver.u0 = true;
                        imageReceiver.t0 = true;
                        imageReceiver.W(1);
                    } else {
                        imageReceiver.X(0);
                        imageReceiver.e();
                        imageReceiver.W(0);
                    }
                    dd.c1(imageReceiver, this.m.document, qs.v1);
                }
                boolean z11 = tL_starGiftUnique.burned;
                this.L = z11;
                zh.c1 c1Var = this.j;
                if (z11) {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, this.c);
                    Paint paint = (Paint) c1Var.b;
                    paint.setShader(null);
                    paint.setColor(w02);
                    this.M = org.telegram.ui.ActionBar.r6.b;
                    c1Var.f(11, org.telegram.messenger.hd.M0(2131749892, null), true);
                } else {
                    c1Var.e(this.k, true, false);
                    c1Var.f(11, org.telegram.messenger.hd.M0(2131749893, null), true);
                }
                if (this.p) {
                    this.O = org.telegram.messenger.g0.L(200.0f);
                } else {
                    this.O = org.telegram.messenger.camera.q.C(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
                    if (!org.telegram.messenger.g0.Q1()) {
                        this.O = (int) (this.O * 1.2f);
                    }
                    this.O -= org.telegram.messenger.g0.L(8.0f);
                }
                g(ijVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                te.c cVar = this.T;
                if (!z9) {
                    cVar.c(this.O);
                    return;
                }
                int round = Math.round(cVar.h ? cVar.g : cVar.f);
                int i7 = this.O;
                if (round != i7) {
                    cVar.a(i7);
                    return;
                }
                return;
            }
        }
        tL_messageActionStarGiftUnique = null;
        if (tL_messageActionStarGiftUnique != null) {
        }
        tL_messageActionStarGiftUnique = null;
        z10 = this.S;
        g5Var = this.e;
        imageReceiver = this.d;
        if (z10) {
            imageReceiver.P();
            g5Var.a();
            this.y.d.P();
        }
        this.Q = tL_messageActionStarGiftUnique;
        this.p = ijVar == null && ijVar.h2;
        if (tL_messageActionStarGiftUnique != null) {
        }
    }

    public final void g(ij ijVar, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        float f10;
        int i7;
        int L;
        float f11 = this.O;
        boolean Q3 = ijVar.Q3();
        boolean z9 = !tL_messageActionStarGiftUnique.upgrade;
        int i10 = this.a;
        long e10 = z9 == Q3 ? p10.i(i10).e() : ij.B0(ijVar.k);
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            e10 = org.telegram.messenger.m5.o(peer);
        }
        String t6 = org.telegram.messenger.m5.t(e10);
        float L2 = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        if (this.p) {
            this.r = new my0(tL_starGiftUnique.title, 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.peer != null || t10.A(ij.B0(ijVar.k))) {
            this.r = new my0(org.telegram.messenger.hd.M0(2131749890, null), 14.0f, org.telegram.messenger.g0.o());
        } else if (ij.B0(ijVar.k) != p10.i(i10).e()) {
            this.r = new my0(org.telegram.messenger.hd.a0(null, null, 2131749891, t6), 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_starGiftUnique.crafted) {
            this.r = new my0(org.telegram.messenger.hd.M0(2131750460, null), 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
            this.r = new my0(org.telegram.messenger.hd.M0(2131750447, null), 14.0f, org.telegram.messenger.g0.o());
        } else {
            this.r = new my0(org.telegram.messenger.hd.M0(2131750425, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.q = (this.r.i() / 2.0f) + L2;
        float i11 = this.r.i() + L2 + org.telegram.messenger.g0.L(3.0f);
        if (this.p) {
            f10 = 2.0f;
            this.t = new my0(org.telegram.messenger.hd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, org.telegram.messenger.g0.o());
            i7 = i10;
        } else {
            f10 = 2.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            i7 = i10;
            this.t = new my0(jg.g.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.s = (this.t.i() / f10) + i11;
        float i12 = this.t.i() + i11 + org.telegram.messenger.g0.L(this.p ? 14.0f : 11.0f);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        zh.j0 j0Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = j0Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            ij.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable C5 = ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            TLObject e22 = tL_messageActionStarGiftUnique.name_hidden ? null : tL_messageActionStarGiftUnique.from_id != null ? qp.s1(i7).e2(org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.from_id)) : qp.s1(i7).e2(ijVar.Z0());
            this.z = true;
            j0Var.c(e22);
            j0Var.m = C5;
            j0Var.s = -1;
            j0Var.b(((int) f11) - org.telegram.messenger.g0.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = j0Var.n;
                if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                    this.N = true;
                    this.O = (int) ((Math.min(0.4f, ((j0Var.n != null ? r4.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                    g(ijVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L3 = i12 + org.telegram.messenger.g0.L(4.0f);
            this.x = L3;
            i12 = L3 + j0Var.u + org.telegram.messenger.g0.L(3.0f);
        } else {
            this.z = false;
            j0Var.c(null);
            j0Var.m = null;
            j0Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                l7 l7Var = new l7(i12, org.telegram.messenger.hd.M0(2131750386, null), this.m.name);
                arrayList.add(l7Var);
                float f12 = f11 * 0.5f;
                my0 my0Var = l7Var.b;
                my0Var.p = f12;
                this.u = Math.max(this.u, my0Var.c);
                my0 my0Var2 = l7Var.c;
                my0Var2.p = f12;
                this.v = Math.max(this.v, my0Var2.c);
                i12 += l7Var.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                l7 l7Var2 = new l7(i12, org.telegram.messenger.hd.M0(2131750387, null), this.k.name);
                arrayList.add(l7Var2);
                float f13 = f11 * 0.5f;
                my0 my0Var3 = l7Var2.b;
                my0Var3.p = f13;
                this.u = Math.max(this.u, my0Var3.c);
                my0 my0Var4 = l7Var2.c;
                my0Var4.p = f13;
                this.v = Math.max(this.v, my0Var4.c);
                i12 = l7Var2.a() + i12;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                l7 l7Var3 = new l7(i12, org.telegram.messenger.hd.M0(2131750379, null), this.l.name);
                arrayList.add(l7Var3);
                float f14 = f11 * 0.5f;
                my0 my0Var5 = l7Var3.b;
                my0Var5.p = f14;
                this.u = Math.max(this.u, my0Var5.c);
                my0 my0Var6 = l7Var3.c;
                my0Var6.p = f14;
                this.v = Math.max(this.v, my0Var6.c);
                i12 += l7Var3.a();
            }
        }
        float L4 = i12 + org.telegram.messenger.g0.L(11.66f);
        if (this.p) {
            L = org.telegram.messenger.g0.L(10.0f);
        } else {
            this.A = L4;
            this.C = new my0(org.telegram.messenger.hd.M0(2131749887, null), 14.0f, org.telegram.messenger.g0.o());
            float L5 = org.telegram.messenger.g0.L(30.0f);
            this.B = L5;
            L4 += L5;
            L = org.telegram.messenger.g0.L(11.0f);
        }
        this.P = (int) (L4 + L);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        float f10 = this.O;
        float L = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        my0 my0Var = new my0(org.telegram.messenger.hd.a0(null, null, 2131749891, org.telegram.messenger.m5.t(j3)), 14.0f, org.telegram.messenger.g0.o());
        this.r = my0Var;
        this.q = (my0Var.i() / 2.0f) + L;
        float i7 = this.r.i() + L + org.telegram.messenger.g0.L(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        my0 my0Var2 = new my0(jg.g.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.t = my0Var2;
        this.s = (my0Var2.i() / 2.0f) + i7;
        float i10 = this.t.i() + i7 + org.telegram.messenger.g0.L(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        zh.j0 j0Var = this.y;
        TextPaint textPaint = j0Var.c;
        if (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131749747, null));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder.length(), 33);
            spanned = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            ij.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        TLObject e22 = j3 != 0 ? qp.s1(this.a).e2(j3) : null;
        this.z = true;
        j0Var.c(e22);
        j0Var.m = spanned;
        j0Var.s = -1;
        j0Var.b(((int) f10) - org.telegram.messenger.g0.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = j0Var.n;
            if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                this.N = true;
                this.O = (int) ((Math.min(0.4f, ((j0Var.n != null ? r5.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j3, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = i10 + org.telegram.messenger.g0.L(4.0f);
        this.x = L2;
        float L3 = L2 + j0Var.u + org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(11.66f);
        this.A = L3;
        this.C = new my0(str, 14.0f, org.telegram.messenger.g0.o());
        float L4 = org.telegram.messenger.g0.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + org.telegram.messenger.g0.L(11.0f));
    }
}
