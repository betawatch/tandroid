package di;

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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e6 {
    public float A;
    public float B;
    public oy0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final ac G;
    public final org.telegram.ui.Components.dc H;
    public final org.telegram.ui.Components.dc I;
    public final org.telegram.ui.Components.dc J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public gj R;
    public boolean S;
    public final te.c T;
    public bi.y0 U;
    public bi.y0 V;
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.e6 c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.e5 e;
    public int g;
    public RadialGradient h;
    public final bi.l2 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public oy0 r;
    public float s;
    public oy0 t;
    public float u;
    public float v;
    public float x;
    public final bi.g1 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public e6(int i7, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        bi.g1 g1Var = new bi.g1();
        this.y = g1Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new ac(1, 25);
        this.K = new RectF();
        this.T = new te.c(0, new a1.c(this, 26), er.h, 320L);
        this.a = i7;
        this.b = view;
        this.c = e6Var;
        this.j = new bi.l2(view);
        this.H = new org.telegram.ui.Components.dc(view);
        this.I = new org.telegram.ui.Components.dc(view);
        this.J = new org.telegram.ui.Components.dc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(28.0f), view);
        g1Var.r = view;
        g1Var.d.H0(view);
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
        boolean z10 = this.L;
        bi.l2 l2Var = this.j;
        if (z10 && l2Var != null) {
            int i7 = this.M;
            int i10 = org.telegram.ui.ActionBar.q6.b;
            if (i7 != i10) {
                this.M = i10;
                try {
                    int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q7, this.c);
                    Paint paint = (Paint) l2Var.b;
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
        org.telegram.ui.Components.e5 e5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            e5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        w0.a(canvas, 1, e5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        float L = org.telegram.messenger.g0.L(10.0f);
        float L2 = org.telegram.messenger.g0.L(110.0f);
        float L3 = org.telegram.messenger.g0.L(110.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(f11 - (org.telegram.messenger.g0.L(110.0f) / 2.0f), L, L2, L3);
        imageReceiver.h(canvas, null);
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.k;
        if (stargiftattributebackdrop3 != null) {
            r12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i11 = r12;
        this.r.p = cVar.f - org.telegram.messenger.g0.L(12.0f);
        oy0 oy0Var = this.r;
        oy0Var.c(f11 - (oy0Var.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = cVar.f - org.telegram.messenger.g0.L(12.0f);
        oy0 oy0Var2 = this.t;
        Canvas canvas2 = canvas;
        int i12 = i11;
        oy0Var2.c(f11 - (oy0Var2.c / 2.0f), this.s, 1.0f, i12, canvas2);
        if (this.z) {
            bi.g1 g1Var = this.y;
            int i13 = g1Var.t;
            int i14 = g1Var.u;
            int i15 = (int) (f11 - (i13 / 2.0f));
            int i16 = (int) this.x;
            int i17 = i13 + i15;
            g1Var.setBounds(i15, i16, i17, i16 + i14);
            float f13 = this.x;
            RectF rectF2 = this.K;
            rectF2.set(i15, f13, i17, i14 + f13);
            float a11 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
            g1Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f14 = 9.0f;
            float L4 = this.u + org.telegram.messenger.g0.L(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i18 = 0;
            while (i18 < size) {
                int i19 = i18 + 1;
                d6 d6Var = (d6) arrayList.get(i18);
                oy0 oy0Var3 = d6Var.b;
                float f15 = f11 - (L4 / 2.0f);
                oy0Var3.c((f15 + this.u) - oy0Var3.c, d6Var.a, 1.0f, i12, canvas2);
                canvas2 = canvas;
                d6Var.c.c(f15 + this.u + org.telegram.messenger.g0.L(r19), d6Var.a, 1.0f, -1, canvas2);
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
            int r13 = org.telegram.ui.ActionBar.j6.r1(0.13f, -16777216);
            Paint paint3 = this.F;
            paint3.setColor(r13);
            float a13 = this.H.a(0.075f);
            canvas2.scale(a13, a13, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint3);
            canvas2.restore();
            l2Var.setBounds(((int) rectF.right) - org.telegram.messenger.g0.L(46.67f), ((int) rectF.top) - org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f) + ((int) rectF.right), org.telegram.messenger.g0.L(46.67f) + ((int) rectF.top));
            l2Var.y = i20;
            l2Var.draw(canvas2);
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
        ac acVar = this.G;
        acVar.g(rectF2);
        acVar.d();
        acVar.a(canvas, org.telegram.ui.ActionBar.j6.r1(0.7f, -1));
        this.C.c(rectF2.left + org.telegram.messenger.g0.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.b;
        if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).W();
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
        boolean z10;
        int action;
        boolean z11;
        boolean contains = this.D.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        if (this.U != null && this.z && !contains) {
            if (this.K.contains(motionEvent.getX() - f10, motionEvent.getY() - f11)) {
                z10 = true;
                boolean contains2 = this.n.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
                action = motionEvent.getAction();
                org.telegram.ui.Components.dc dcVar = this.J;
                org.telegram.ui.Components.dc dcVar2 = this.H;
                org.telegram.ui.Components.dc dcVar3 = this.I;
                if (action != 0) {
                    dcVar3.c((!contains2 || contains || z10) ? false : true);
                    dcVar2.c(contains);
                    dcVar.c(z10);
                } else if (motionEvent.getAction() == 2) {
                    if (dcVar2.i && !contains) {
                        dcVar2.c(false);
                    } else if (dcVar.i && !z10) {
                        dcVar.c(false);
                    } else if (dcVar3.i && !contains2) {
                        dcVar3.c(false);
                    }
                } else {
                    if (motionEvent.getAction() == 1 && dcVar.i) {
                        dcVar.c(false);
                        this.U.run();
                        return true;
                    }
                    if (motionEvent.getAction() == 1 && ((z11 = dcVar2.i) || dcVar3.i)) {
                        bi.y0 y0Var = this.V;
                        if (y0Var != null) {
                            if (z11) {
                                y0Var.run();
                            }
                        } else if (this.L) {
                            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                            if (T != null) {
                                org.telegram.messenger.k5.n(null, 2131743880, org.telegram.ui.Components.cc.a0(T), R.raw.fire_on, 36);
                            }
                        } else {
                            c6 c6Var = new c6(this.b.getContext(), this.a, gj.B0(this.R.k), this.c, null);
                            c6Var.j2(this.R, null);
                            c6Var.show();
                        }
                        dcVar2.c(false);
                        dcVar3.c(false);
                        return true;
                    }
                    if (motionEvent.getAction() == 3 && (dcVar2.i || dcVar3.i || dcVar.i)) {
                        dcVar2.c(false);
                        dcVar3.c(false);
                        dcVar.c(false);
                        return true;
                    }
                }
                return !dcVar2.i || dcVar3.i || dcVar.i;
            }
        }
        z10 = false;
        boolean contains22 = this.n.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        action = motionEvent.getAction();
        org.telegram.ui.Components.dc dcVar4 = this.J;
        org.telegram.ui.Components.dc dcVar22 = this.H;
        org.telegram.ui.Components.dc dcVar32 = this.I;
        if (action != 0) {
        }
        if (dcVar22.i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(gj gjVar, boolean z10) {
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique;
        boolean z11;
        org.telegram.ui.Components.e5 e5Var;
        ImageReceiver imageReceiver;
        TLRPC.Message message;
        this.N = false;
        this.R = gjVar;
        if (gjVar != null && (message = gjVar.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if (tL_messageActionStarGiftUnique != null || tL_messageActionStarGiftUnique.refunded || !(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                    tL_messageActionStarGiftUnique = null;
                }
                z11 = this.S;
                e5Var = this.e;
                imageReceiver = this.d;
                if (z11 && tL_messageActionStarGiftUnique != null && this.Q == null) {
                    imageReceiver.P();
                    e5Var.a();
                    this.y.d.P();
                }
                this.Q = tL_messageActionStarGiftUnique;
                this.p = gjVar == null && gjVar.j2;
                if (tL_messageActionStarGiftUnique != null) {
                    return;
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                this.k = (TL_stars.starGiftAttributeBackdrop) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                this.l = (TL_stars.starGiftAttributePattern) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = this.m;
                this.m = (TL_stars.starGiftAttributeModel) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                this.h = null;
                this.f.setShader(null);
                TL_stars.starGiftAttributePattern stargiftattributepattern = this.l;
                if (stargiftattributepattern != null) {
                    e5Var.i(stargiftattributepattern.document, z10);
                } else {
                    e5Var.g(null, z10);
                }
                TL_stars.starGiftAttributeModel stargiftattributemodel2 = this.m;
                if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
                    if (this.p) {
                        imageReceiver.v0 = true;
                        imageReceiver.u0 = true;
                        imageReceiver.W(1);
                    } else {
                        imageReceiver.X(0);
                        imageReceiver.e();
                        imageReceiver.W(0);
                    }
                    lb.c1(imageReceiver, this.m.document, ns.v1);
                }
                boolean z12 = tL_starGiftUnique.burned;
                this.L = z12;
                bi.l2 l2Var = this.j;
                if (z12) {
                    int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q7, this.c);
                    Paint paint = (Paint) l2Var.b;
                    paint.setShader(null);
                    paint.setColor(w02);
                    this.M = org.telegram.ui.ActionBar.q6.b;
                    l2Var.f(11, hd.M0(2131749893, null), true);
                } else {
                    l2Var.e(this.k, true, false);
                    l2Var.f(11, hd.M0(2131749894, null), true);
                }
                if (this.p) {
                    this.O = org.telegram.messenger.g0.L(200.0f);
                } else {
                    this.O = i20.C(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
                    if (!org.telegram.messenger.g0.Q1()) {
                        this.O = (int) (this.O * 1.2f);
                    }
                    this.O -= org.telegram.messenger.g0.L(8.0f);
                }
                g(gjVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                te.c cVar = this.T;
                if (!z10) {
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
        z11 = this.S;
        e5Var = this.e;
        imageReceiver = this.d;
        if (z11) {
            imageReceiver.P();
            e5Var.a();
            this.y.d.P();
        }
        this.Q = tL_messageActionStarGiftUnique;
        this.p = gjVar == null && gjVar.j2;
        if (tL_messageActionStarGiftUnique != null) {
        }
    }

    public final void g(gj gjVar, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        float f10;
        int i7;
        int L;
        float f11 = this.O;
        boolean P3 = gjVar.P3();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i10 = this.a;
        long e10 = z10 == P3 ? m10.i(i10).e() : gj.B0(gjVar.k);
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            e10 = org.telegram.messenger.m5.o(peer);
        }
        String t6 = org.telegram.messenger.m5.t(e10);
        float L2 = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        if (this.p) {
            this.r = new oy0(tL_starGiftUnique.title, 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.peer != null || q10.A(gj.B0(gjVar.k))) {
            this.r = new oy0(hd.M0(2131749891, null), 14.0f, org.telegram.messenger.g0.o());
        } else if (gj.B0(gjVar.k) != m10.i(i10).e()) {
            this.r = new oy0(hd.a0(null, null, 2131749892, t6), 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_starGiftUnique.crafted) {
            this.r = new oy0(hd.M0(2131750461, null), 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
            this.r = new oy0(hd.M0(2131750448, null), 14.0f, org.telegram.messenger.g0.o());
        } else {
            this.r = new oy0(hd.M0(2131750426, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.q = (this.r.i() / 2.0f) + L2;
        float i11 = this.r.i() + L2 + org.telegram.messenger.g0.L(3.0f);
        if (this.p) {
            f10 = 2.0f;
            this.t = new oy0(hd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, org.telegram.messenger.g0.o());
            i7 = i10;
        } else {
            f10 = 2.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            i7 = i10;
            this.t = new oy0(i5.c.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.s = (this.t.i() / f10) + i11;
        float i12 = this.t.i() + i11 + org.telegram.messenger.g0.L(this.p ? 14.0f : 11.0f);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        bi.g1 g1Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = g1Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            gj.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable B5 = gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            TLObject e22 = tL_messageActionStarGiftUnique.name_hidden ? null : tL_messageActionStarGiftUnique.from_id != null ? np.s1(i7).e2(org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.from_id)) : np.s1(i7).e2(gjVar.Z0());
            this.z = true;
            g1Var.c(e22);
            g1Var.m = B5;
            g1Var.s = -1;
            g1Var.b(((int) f11) - org.telegram.messenger.g0.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = g1Var.n;
                if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                    this.N = true;
                    this.O = (int) ((Math.min(0.4f, ((g1Var.n != null ? r4.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                    g(gjVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L3 = i12 + org.telegram.messenger.g0.L(4.0f);
            this.x = L3;
            i12 = L3 + g1Var.u + org.telegram.messenger.g0.L(3.0f);
        } else {
            this.z = false;
            g1Var.c(null);
            g1Var.m = null;
            g1Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                d6 d6Var = new d6(i12, hd.M0(2131750387, null), this.m.name);
                arrayList.add(d6Var);
                float f12 = f11 * 0.5f;
                oy0 oy0Var = d6Var.b;
                oy0Var.p = f12;
                this.u = Math.max(this.u, oy0Var.c);
                oy0 oy0Var2 = d6Var.c;
                oy0Var2.p = f12;
                this.v = Math.max(this.v, oy0Var2.c);
                i12 += d6Var.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                d6 d6Var2 = new d6(i12, hd.M0(2131750388, null), this.k.name);
                arrayList.add(d6Var2);
                float f13 = f11 * 0.5f;
                oy0 oy0Var3 = d6Var2.b;
                oy0Var3.p = f13;
                this.u = Math.max(this.u, oy0Var3.c);
                oy0 oy0Var4 = d6Var2.c;
                oy0Var4.p = f13;
                this.v = Math.max(this.v, oy0Var4.c);
                i12 = d6Var2.a() + i12;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                d6 d6Var3 = new d6(i12, hd.M0(2131750380, null), this.l.name);
                arrayList.add(d6Var3);
                float f14 = f11 * 0.5f;
                oy0 oy0Var5 = d6Var3.b;
                oy0Var5.p = f14;
                this.u = Math.max(this.u, oy0Var5.c);
                oy0 oy0Var6 = d6Var3.c;
                oy0Var6.p = f14;
                this.v = Math.max(this.v, oy0Var6.c);
                i12 += d6Var3.a();
            }
        }
        float L4 = i12 + org.telegram.messenger.g0.L(11.66f);
        if (this.p) {
            L = org.telegram.messenger.g0.L(10.0f);
        } else {
            this.A = L4;
            this.C = new oy0(hd.M0(2131749888, null), 14.0f, org.telegram.messenger.g0.o());
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
        oy0 oy0Var = new oy0(hd.a0(null, null, 2131749892, org.telegram.messenger.m5.t(j3)), 14.0f, org.telegram.messenger.g0.o());
        this.r = oy0Var;
        this.q = (oy0Var.i() / 2.0f) + L;
        float i7 = this.r.i() + L + org.telegram.messenger.g0.L(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        oy0 oy0Var2 = new oy0(i5.c.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.t = oy0Var2;
        this.s = (oy0Var2.i() / 2.0f) + i7;
        float i10 = this.t.i() + i7 + org.telegram.messenger.g0.L(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        bi.g1 g1Var = this.y;
        TextPaint textPaint = g1Var.c;
        if (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131749748, null));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder.length(), 33);
            spanned = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            gj.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        TLObject e22 = j3 != 0 ? np.s1(this.a).e2(j3) : null;
        this.z = true;
        g1Var.c(e22);
        g1Var.m = spanned;
        g1Var.s = -1;
        g1Var.b(((int) f10) - org.telegram.messenger.g0.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = g1Var.n;
            if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                this.N = true;
                this.O = (int) ((Math.min(0.4f, ((g1Var.n != null ? r5.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j3, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = i10 + org.telegram.messenger.g0.L(4.0f);
        this.x = L2;
        float L3 = L2 + g1Var.u + org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(11.66f);
        this.A = L3;
        this.C = new oy0(str, 14.0f, org.telegram.messenger.g0.o());
        float L4 = org.telegram.messenger.g0.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + org.telegram.messenger.g0.L(11.0f));
    }
}
