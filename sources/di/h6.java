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
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h6 {
    public float A;
    public float B;
    public xy0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final ec G;
    public final org.telegram.ui.Components.mc H;
    public final org.telegram.ui.Components.mc I;
    public final org.telegram.ui.Components.mc J;
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
    public bi.c1 U;
    public bi.c1 V;
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.h6 c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.n5 e;
    public int g;
    public RadialGradient h;
    public final bi.j3 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public xy0 r;
    public float s;
    public xy0 t;
    public float u;
    public float v;
    public float x;
    public final bi.l1 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public h6(int i7, View view, org.telegram.ui.ActionBar.h6 h6Var) {
        bi.l1 l1Var = new bi.l1();
        this.y = l1Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new ec(1, 25);
        this.K = new RectF();
        this.T = new te.c(0, new a1.c(this, 27), nr.h, 320L);
        this.a = i7;
        this.b = view;
        this.c = h6Var;
        this.j = new bi.j3(view, 1.0f);
        this.H = new org.telegram.ui.Components.mc(view);
        this.I = new org.telegram.ui.Components.mc(view);
        this.J = new org.telegram.ui.Components.mc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(28.0f), view);
        l1Var.r = view;
        l1Var.d.H0(view);
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
        bi.j3 j3Var = this.j;
        if (z10 && j3Var != null) {
            int i7 = this.M;
            int i10 = org.telegram.ui.ActionBar.t6.b;
            if (i7 != i10) {
                this.M = i10;
                try {
                    j3Var.f(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q7, this.c));
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
        Paint paint = this.f;
        if (radialGradient != null) {
            Matrix matrix = this.i;
            matrix.reset();
            matrix.postTranslate(f11, f11);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.o;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), Path.Direction.CW);
        canvas.save();
        float a10 = this.I.a(0.0125f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f11, org.telegram.messenger.g0.L(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.k;
        org.telegram.ui.Components.n5 n5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            n5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        v0.a(canvas, 1, n5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        float L = org.telegram.messenger.g0.L(10.0f);
        float L2 = org.telegram.messenger.g0.L(110.0f);
        float L3 = org.telegram.messenger.g0.L(110.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(f11 - (org.telegram.messenger.g0.L(110.0f) / 2.0f), L, L2, L3);
        imageReceiver.h(canvas, null);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.k;
        if (stargiftattributebackdrop3 != null) {
            r12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i11 = r12;
        this.r.p = cVar.f - org.telegram.messenger.g0.L(12.0f);
        xy0 xy0Var = this.r;
        xy0Var.c(f11 - (xy0Var.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = cVar.f - org.telegram.messenger.g0.L(12.0f);
        xy0 xy0Var2 = this.t;
        Canvas canvas2 = canvas;
        int i12 = i11;
        xy0Var2.c(f11 - (xy0Var2.c / 2.0f), this.s, 1.0f, i12, canvas2);
        if (this.z) {
            bi.l1 l1Var = this.y;
            int i13 = l1Var.t;
            int i14 = l1Var.u;
            int i15 = (int) (f11 - (i13 / 2.0f));
            int i16 = (int) this.x;
            int i17 = i13 + i15;
            l1Var.setBounds(i15, i16, i17, i16 + i14);
            float f13 = this.x;
            RectF rectF2 = this.K;
            rectF2.set(i15, f13, i17, i14 + f13);
            float a11 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
            l1Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f14 = 9.0f;
            float L4 = this.u + org.telegram.messenger.g0.L(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i18 = 0;
            while (i18 < size) {
                int i19 = i18 + 1;
                g6 g6Var = (g6) arrayList.get(i18);
                xy0 xy0Var3 = g6Var.b;
                float f15 = f11 - (L4 / 2.0f);
                xy0Var3.c((f15 + this.u) - xy0Var3.c, g6Var.a, 1.0f, i12, canvas2);
                canvas2 = canvas;
                g6Var.c.c(f15 + this.u + org.telegram.messenger.g0.L(r19), g6Var.a, 1.0f, -1, canvas2);
                i12 = i12;
                i18 = i19;
                f14 = f14;
            }
        }
        int i20 = i12;
        if (!this.p) {
            float L5 = f11 - ((this.C.c + org.telegram.messenger.g0.L(30.0f)) / 2.0f);
            float f16 = this.A;
            float a12 = org.telegram.messenger.f3.a(this.C.c, org.telegram.messenger.g0.L(30.0f), 2.0f, f11);
            float f17 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(L5, f16, a12, f17);
            Path path2 = this.E;
            path2.rewind();
            float f18 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f18, f18, Path.Direction.CW);
            int r13 = org.telegram.ui.ActionBar.m6.r1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(r13);
            float a13 = this.H.a(0.075f);
            canvas2.scale(a13, a13, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            j3Var.setBounds(((int) rectF.right) - org.telegram.messenger.g0.L(46.67f), ((int) rectF.top) - org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f) + ((int) rectF.right), org.telegram.messenger.g0.L(46.67f) + ((int) rectF.top));
            j3Var.y = i20;
            j3Var.draw(canvas2);
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
        ec ecVar = this.G;
        ecVar.g(rectF2);
        ecVar.d();
        ecVar.a(canvas, org.telegram.ui.ActionBar.m6.r1(0.7f, -1));
        this.C.c(rectF2.left + org.telegram.messenger.g0.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).U();
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
                org.telegram.ui.Components.mc mcVar = this.J;
                org.telegram.ui.Components.mc mcVar2 = this.H;
                org.telegram.ui.Components.mc mcVar3 = this.I;
                if (action != 0) {
                    mcVar3.c((!contains2 || contains || z10) ? false : true);
                    mcVar2.c(contains);
                    mcVar.c(z10);
                } else if (motionEvent.getAction() == 2) {
                    if (mcVar2.i && !contains) {
                        mcVar2.c(false);
                    } else if (mcVar.i && !z10) {
                        mcVar.c(false);
                    } else if (mcVar3.i && !contains2) {
                        mcVar3.c(false);
                    }
                } else {
                    if (motionEvent.getAction() == 1 && mcVar.i) {
                        mcVar.c(false);
                        this.U.run();
                        return true;
                    }
                    if (motionEvent.getAction() == 1 && ((z11 = mcVar2.i) || mcVar3.i)) {
                        bi.c1 c1Var = this.V;
                        if (c1Var != null) {
                            if (z11) {
                                c1Var.run();
                            }
                        } else if (this.L) {
                            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                            if (T != null) {
                                org.telegram.messenger.f3.n(null, 2131743635, org.telegram.ui.Components.lc.b0(T), R.raw.fire_on, 36);
                            }
                        } else {
                            f6 f6Var = new f6(this.b.getContext(), this.a, gj.B0(this.R.k), this.c, null);
                            f6Var.v2(this.R, null);
                            f6Var.show();
                        }
                        mcVar2.c(false);
                        mcVar3.c(false);
                        return true;
                    }
                    if (motionEvent.getAction() == 3 && (mcVar2.i || mcVar3.i || mcVar.i)) {
                        mcVar2.c(false);
                        mcVar3.c(false);
                        mcVar.c(false);
                        return true;
                    }
                }
                return !mcVar2.i || mcVar3.i || mcVar.i;
            }
        }
        z10 = false;
        boolean contains22 = this.n.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        action = motionEvent.getAction();
        org.telegram.ui.Components.mc mcVar4 = this.J;
        org.telegram.ui.Components.mc mcVar22 = this.H;
        org.telegram.ui.Components.mc mcVar32 = this.I;
        if (action != 0) {
        }
        if (mcVar22.i) {
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
        org.telegram.ui.Components.n5 n5Var;
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
                n5Var = this.e;
                imageReceiver = this.d;
                if (z11 && tL_messageActionStarGiftUnique != null && this.Q == null) {
                    imageReceiver.P();
                    n5Var.a();
                    this.y.d.P();
                }
                this.Q = tL_messageActionStarGiftUnique;
                this.p = gjVar == null && gjVar.j2;
                if (tL_messageActionStarGiftUnique != null) {
                    return;
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                this.k = (TL_stars.starGiftAttributeBackdrop) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                this.l = (TL_stars.starGiftAttributePattern) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = this.m;
                this.m = (TL_stars.starGiftAttributeModel) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                this.h = null;
                this.f.setShader(null);
                TL_stars.starGiftAttributePattern stargiftattributepattern = this.l;
                if (stargiftattributepattern != null) {
                    n5Var.i(stargiftattributepattern.document, z10);
                } else {
                    n5Var.g(null, z10);
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
                    pb.d1(imageReceiver, this.m.document, ls.v1);
                }
                boolean z12 = tL_starGiftUnique.burned;
                this.L = z12;
                bi.j3 j3Var = this.j;
                if (z12) {
                    j3Var.f(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q7, this.c));
                    this.M = org.telegram.ui.ActionBar.t6.b;
                    j3Var.g(11, hd.N0(2131749876, null), true);
                } else {
                    j3Var.e(this.k, true, false);
                    j3Var.g(11, hd.N0(2131749877, null), true);
                }
                if (this.p) {
                    this.O = org.telegram.messenger.g0.L(200.0f);
                } else {
                    this.O = o10.D(64.0f, (org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, (int) (org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() * 0.6f : (org.telegram.messenger.g0.q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f)));
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
        n5Var = this.e;
        imageReceiver = this.d;
        if (z11) {
            imageReceiver.P();
            n5Var.a();
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
        long e10 = z10 == P3 ? k10.i(i10).e() : gj.B0(gjVar.k);
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            e10 = org.telegram.messenger.n5.o(peer);
        }
        String t6 = org.telegram.messenger.n5.t(e10);
        float L2 = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        if (this.p) {
            this.r = new xy0(tL_starGiftUnique.title, 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.peer != null || p10.B(gj.B0(gjVar.k))) {
            this.r = new xy0(hd.N0(2131749874, null), 14.0f, org.telegram.messenger.g0.o());
        } else if (gj.B0(gjVar.k) != k10.i(i10).e()) {
            this.r = new xy0(hd.a0(null, null, 2131749875, t6), 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_starGiftUnique.crafted) {
            this.r = new xy0(hd.N0(2131750444, null), 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
            this.r = new xy0(hd.N0(2131750431, null), 14.0f, org.telegram.messenger.g0.o());
        } else {
            this.r = new xy0(hd.N0(2131750409, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.q = (this.r.i() / 2.0f) + L2;
        float i11 = this.r.i() + L2 + org.telegram.messenger.g0.L(3.0f);
        if (this.p) {
            f10 = 2.0f;
            this.t = new xy0(hd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, org.telegram.messenger.g0.o());
            i7 = i10;
        } else {
            f10 = 2.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            i7 = i10;
            this.t = new xy0(i5.c.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.s = (this.t.i() / f10) + i11;
        float i12 = this.t.i() + i11 + org.telegram.messenger.g0.L(this.p ? 14.0f : 11.0f);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        bi.l1 l1Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = l1Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            gj.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable B5 = gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            TLObject g22 = tL_messageActionStarGiftUnique.name_hidden ? null : tL_messageActionStarGiftUnique.from_id != null ? np.u1(i7).g2(org.telegram.messenger.n5.o(tL_messageActionStarGiftUnique.from_id)) : np.u1(i7).g2(gjVar.Z0());
            this.z = true;
            l1Var.c(g22);
            l1Var.m = B5;
            l1Var.s = -1;
            l1Var.b(((int) f11) - org.telegram.messenger.g0.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = l1Var.n;
                if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                    this.N = true;
                    this.O = (int) ((Math.min(0.4f, ((l1Var.n != null ? r4.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                    g(gjVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L3 = i12 + org.telegram.messenger.g0.L(4.0f);
            this.x = L3;
            i12 = L3 + l1Var.u + org.telegram.messenger.g0.L(3.0f);
        } else {
            this.z = false;
            l1Var.c(null);
            l1Var.m = null;
            l1Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                g6 g6Var = new g6(i12, hd.N0(2131750370, null), this.m.name);
                arrayList.add(g6Var);
                float f12 = f11 * 0.5f;
                xy0 xy0Var = g6Var.b;
                xy0Var.p = f12;
                this.u = Math.max(this.u, xy0Var.c);
                xy0 xy0Var2 = g6Var.c;
                xy0Var2.p = f12;
                this.v = Math.max(this.v, xy0Var2.c);
                i12 += g6Var.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                g6 g6Var2 = new g6(i12, hd.N0(2131750371, null), this.k.name);
                arrayList.add(g6Var2);
                float f13 = f11 * 0.5f;
                xy0 xy0Var3 = g6Var2.b;
                xy0Var3.p = f13;
                this.u = Math.max(this.u, xy0Var3.c);
                xy0 xy0Var4 = g6Var2.c;
                xy0Var4.p = f13;
                this.v = Math.max(this.v, xy0Var4.c);
                i12 = g6Var2.a() + i12;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                g6 g6Var3 = new g6(i12, hd.N0(2131750363, null), this.l.name);
                arrayList.add(g6Var3);
                float f14 = f11 * 0.5f;
                xy0 xy0Var5 = g6Var3.b;
                xy0Var5.p = f14;
                this.u = Math.max(this.u, xy0Var5.c);
                xy0 xy0Var6 = g6Var3.c;
                xy0Var6.p = f14;
                this.v = Math.max(this.v, xy0Var6.c);
                i12 += g6Var3.a();
            }
        }
        float L4 = i12 + org.telegram.messenger.g0.L(11.66f);
        if (this.p) {
            L = org.telegram.messenger.g0.L(10.0f);
        } else {
            this.A = L4;
            this.C = new xy0(hd.N0(2131749871, null), 14.0f, org.telegram.messenger.g0.o());
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
        xy0 xy0Var = new xy0(hd.a0(null, null, 2131749875, org.telegram.messenger.n5.t(j3)), 14.0f, org.telegram.messenger.g0.o());
        this.r = xy0Var;
        this.q = (xy0Var.i() / 2.0f) + L;
        float i7 = this.r.i() + L + org.telegram.messenger.g0.L(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        xy0 xy0Var2 = new xy0(i5.c.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.t = xy0Var2;
        this.s = (xy0Var2.i() / 2.0f) + i7;
        float i10 = this.t.i() + i7 + org.telegram.messenger.g0.L(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        bi.l1 l1Var = this.y;
        TextPaint textPaint = l1Var.c;
        if (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.N0(2131749730, null));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder.length(), 33);
            spanned = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            gj.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        TLObject g22 = j3 != 0 ? np.u1(this.a).g2(j3) : null;
        this.z = true;
        l1Var.c(g22);
        l1Var.m = spanned;
        l1Var.s = -1;
        l1Var.b(((int) f10) - org.telegram.messenger.g0.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = l1Var.n;
            if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                this.N = true;
                this.O = (int) ((Math.min(0.4f, ((l1Var.n != null ? r5.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j3, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = i10 + org.telegram.messenger.g0.L(4.0f);
        this.x = L2;
        float L3 = L2 + l1Var.u + org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(11.66f);
        this.A = L3;
        this.C = new xy0(str, 14.0f, org.telegram.messenger.g0.o());
        float L4 = org.telegram.messenger.g0.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + org.telegram.messenger.g0.L(11.0f));
    }
}
