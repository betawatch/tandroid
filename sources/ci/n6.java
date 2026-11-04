package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n6 {
    public float A;
    public float B;
    public ly0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final lc G;
    public final org.telegram.ui.Components.gc H;
    public final org.telegram.ui.Components.gc I;
    public final org.telegram.ui.Components.gc J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public zi R;
    public boolean S;
    public final qe.c T;
    public ai.a1 U;
    public ai.a1 V;
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.e6 c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.e5 e;
    public int g;
    public RadialGradient h;
    public final ai.t2 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public ly0 r;
    public float s;
    public ly0 t;
    public float u;
    public float v;
    public float x;
    public final ai.j1 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public n6(int i3, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        ai.j1 j1Var = new ai.j1();
        this.y = j1Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new lc(1, 25);
        this.K = new RectF();
        this.T = new qe.c(0, new a1.c(this, 15), xq.h, 320L);
        this.a = i3;
        this.b = view;
        this.c = e6Var;
        this.j = new ai.t2(view);
        this.H = new org.telegram.ui.Components.gc(view);
        this.I = new org.telegram.ui.Components.gc(view);
        this.J = new org.telegram.ui.Components.gc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(28.0f), view);
        j1Var.r = view;
        j1Var.d.H0(view);
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
        ai.t2 t2Var = this.j;
        if (z10 && t2Var != null) {
            int i3 = this.M;
            int i10 = org.telegram.ui.ActionBar.r6.b;
            if (i3 != i10) {
                this.M = i10;
                try {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, this.c);
                    Paint paint = (Paint) t2Var.b;
                    paint.setShader(null);
                    paint.setColor(w02);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        qe.c cVar = this.T;
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
        b1.a(canvas, 1, e5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
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
        ly0 ly0Var = this.r;
        ly0Var.c(f11 - (ly0Var.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = cVar.f - org.telegram.messenger.g0.L(12.0f);
        ly0 ly0Var2 = this.t;
        Canvas canvas2 = canvas;
        int i12 = i11;
        ly0Var2.c(f11 - (ly0Var2.c / 2.0f), this.s, 1.0f, i12, canvas2);
        if (this.z) {
            ai.j1 j1Var = this.y;
            int i13 = j1Var.t;
            int i14 = j1Var.u;
            int i15 = (int) (f11 - (i13 / 2.0f));
            int i16 = (int) this.x;
            int i17 = i13 + i15;
            j1Var.setBounds(i15, i16, i17, i16 + i14);
            float f13 = this.x;
            RectF rectF2 = this.K;
            rectF2.set(i15, f13, i17, i14 + f13);
            float a11 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
            j1Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f14 = 9.0f;
            float L4 = this.u + org.telegram.messenger.g0.L(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i18 = 0;
            while (i18 < size) {
                int i19 = i18 + 1;
                m6 m6Var = (m6) arrayList.get(i18);
                ly0 ly0Var3 = m6Var.b;
                float f15 = f11 - (L4 / 2.0f);
                ly0Var3.c((f15 + this.u) - ly0Var3.c, m6Var.a, 1.0f, i12, canvas2);
                canvas2 = canvas;
                m6Var.c.c(f15 + this.u + org.telegram.messenger.g0.L(r19), m6Var.a, 1.0f, -1, canvas2);
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
            t2Var.setBounds(((int) rectF.right) - org.telegram.messenger.g0.L(46.67f), ((int) rectF.top) - org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f) + ((int) rectF.right), org.telegram.messenger.g0.L(46.67f) + ((int) rectF.top));
            t2Var.y = i20;
            t2Var.draw(canvas2);
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
        lc lcVar = this.G;
        lcVar.g(rectF2);
        lcVar.d();
        lcVar.a(canvas, org.telegram.ui.ActionBar.k6.r1(0.7f, -1));
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
        boolean z10;
        int action;
        boolean z11;
        boolean contains = this.D.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        if (this.U != null && this.z && !contains) {
            if (this.K.contains(motionEvent.getX() - f10, motionEvent.getY() - f11)) {
                z10 = true;
                boolean contains2 = this.n.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
                action = motionEvent.getAction();
                org.telegram.ui.Components.gc gcVar = this.J;
                org.telegram.ui.Components.gc gcVar2 = this.H;
                org.telegram.ui.Components.gc gcVar3 = this.I;
                if (action != 0) {
                    gcVar3.c((!contains2 || contains || z10) ? false : true);
                    gcVar2.c(contains);
                    gcVar.c(z10);
                } else if (motionEvent.getAction() == 2) {
                    if (gcVar2.i && !contains) {
                        gcVar2.c(false);
                    } else if (gcVar.i && !z10) {
                        gcVar.c(false);
                    } else if (gcVar3.i && !contains2) {
                        gcVar3.c(false);
                    }
                } else {
                    if (motionEvent.getAction() == 1 && gcVar.i) {
                        gcVar.c(false);
                        this.U.run();
                        return true;
                    }
                    if (motionEvent.getAction() == 1 && ((z11 = gcVar2.i) || gcVar3.i)) {
                        ai.a1 a1Var = this.V;
                        if (a1Var != null) {
                            if (z11) {
                                a1Var.run();
                            }
                        } else if (this.L) {
                            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                            if (T != null) {
                                org.telegram.messenger.k5.o(null, 2131743890, org.telegram.ui.Components.fc.a0(T), R.raw.fire_on, 36);
                            }
                        } else {
                            l6 l6Var = new l6(this.b.getContext(), this.a, zi.B0(this.R.k), this.c, null);
                            l6Var.i2(this.R, null);
                            l6Var.show();
                        }
                        gcVar2.c(false);
                        gcVar3.c(false);
                        return true;
                    }
                    if (motionEvent.getAction() == 3 && (gcVar2.i || gcVar3.i || gcVar.i)) {
                        gcVar2.c(false);
                        gcVar3.c(false);
                        gcVar.c(false);
                        return true;
                    }
                }
                return !gcVar2.i || gcVar3.i || gcVar.i;
            }
        }
        z10 = false;
        boolean contains22 = this.n.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        action = motionEvent.getAction();
        org.telegram.ui.Components.gc gcVar4 = this.J;
        org.telegram.ui.Components.gc gcVar22 = this.H;
        org.telegram.ui.Components.gc gcVar32 = this.I;
        if (action != 0) {
        }
        if (gcVar22.i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(zi ziVar, boolean z10) {
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique;
        boolean z11;
        org.telegram.ui.Components.e5 e5Var;
        ImageReceiver imageReceiver;
        TLRPC.Message message;
        this.N = false;
        this.R = ziVar;
        if (ziVar != null && (message = ziVar.k) != null) {
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
                this.p = ziVar == null && ziVar.h2;
                if (tL_messageActionStarGiftUnique != null) {
                    return;
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                this.k = (TL_stars.starGiftAttributeBackdrop) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                this.l = (TL_stars.starGiftAttributePattern) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = this.m;
                this.m = (TL_stars.starGiftAttributeModel) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
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
                    wb.c1(imageReceiver, this.m.document, hs.v1);
                }
                boolean z12 = tL_starGiftUnique.burned;
                this.L = z12;
                ai.t2 t2Var = this.j;
                if (z12) {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, this.c);
                    Paint paint = (Paint) t2Var.b;
                    paint.setShader(null);
                    paint.setColor(w02);
                    this.M = org.telegram.ui.ActionBar.r6.b;
                    t2Var.f(11, bd.M0(2131749901, null), true);
                } else {
                    t2Var.e(this.k, true, false);
                    t2Var.f(11, bd.M0(2131749902, null), true);
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
                g(ziVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                qe.c cVar = this.T;
                if (!z10) {
                    cVar.c(this.O);
                    return;
                }
                int round = Math.round(cVar.h ? cVar.g : cVar.f);
                int i3 = this.O;
                if (round != i3) {
                    cVar.a(i3);
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
        this.p = ziVar == null && ziVar.h2;
        if (tL_messageActionStarGiftUnique != null) {
        }
    }

    public final void g(zi ziVar, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        float f10;
        int i3;
        int L;
        float f11 = this.O;
        boolean Q3 = ziVar.Q3();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i10 = this.a;
        long e10 = z10 == Q3 ? h10.i(i10).e() : zi.B0(ziVar.k);
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            e10 = org.telegram.messenger.m5.o(peer);
        }
        String t10 = org.telegram.messenger.m5.t(e10);
        float L2 = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        if (this.p) {
            this.r = new ly0(tL_starGiftUnique.title, 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.peer != null || l10.A(zi.B0(ziVar.k))) {
            this.r = new ly0(bd.M0(2131749899, null), 14.0f, org.telegram.messenger.g0.o());
        } else if (zi.B0(ziVar.k) != h10.i(i10).e()) {
            this.r = new ly0(bd.a0(null, null, 2131749900, t10), 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_starGiftUnique.crafted) {
            this.r = new ly0(bd.M0(2131750469, null), 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
            this.r = new ly0(bd.M0(2131750456, null), 14.0f, org.telegram.messenger.g0.o());
        } else {
            this.r = new ly0(bd.M0(2131750434, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.q = (this.r.i() / 2.0f) + L2;
        float i11 = this.r.i() + L2 + org.telegram.messenger.g0.L(3.0f);
        if (this.p) {
            f10 = 2.0f;
            this.t = new ly0(bd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, org.telegram.messenger.g0.o());
            i3 = i10;
        } else {
            f10 = 2.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            i3 = i10;
            this.t = new ly0(k2.p1.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.s = (this.t.i() / f10) + i11;
        float i12 = this.t.i() + i11 + org.telegram.messenger.g0.L(this.p ? 14.0f : 11.0f);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        ai.j1 j1Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = j1Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            zi.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable C5 = zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            TLObject e22 = tL_messageActionStarGiftUnique.name_hidden ? null : tL_messageActionStarGiftUnique.from_id != null ? hp.s1(i3).e2(org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.from_id)) : hp.s1(i3).e2(ziVar.Z0());
            this.z = true;
            j1Var.c(e22);
            j1Var.m = C5;
            j1Var.s = -1;
            j1Var.b(((int) f11) - org.telegram.messenger.g0.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = j1Var.n;
                if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                    this.N = true;
                    this.O = (int) ((Math.min(0.4f, ((j1Var.n != null ? r4.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                    g(ziVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L3 = i12 + org.telegram.messenger.g0.L(4.0f);
            this.x = L3;
            i12 = L3 + j1Var.u + org.telegram.messenger.g0.L(3.0f);
        } else {
            this.z = false;
            j1Var.c(null);
            j1Var.m = null;
            j1Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                m6 m6Var = new m6(i12, bd.M0(2131750395, null), this.m.name);
                arrayList.add(m6Var);
                float f12 = f11 * 0.5f;
                ly0 ly0Var = m6Var.b;
                ly0Var.p = f12;
                this.u = Math.max(this.u, ly0Var.c);
                ly0 ly0Var2 = m6Var.c;
                ly0Var2.p = f12;
                this.v = Math.max(this.v, ly0Var2.c);
                i12 += m6Var.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                m6 m6Var2 = new m6(i12, bd.M0(2131750396, null), this.k.name);
                arrayList.add(m6Var2);
                float f13 = f11 * 0.5f;
                ly0 ly0Var3 = m6Var2.b;
                ly0Var3.p = f13;
                this.u = Math.max(this.u, ly0Var3.c);
                ly0 ly0Var4 = m6Var2.c;
                ly0Var4.p = f13;
                this.v = Math.max(this.v, ly0Var4.c);
                i12 = m6Var2.a() + i12;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    i12 += org.telegram.messenger.g0.L(6.0f);
                }
                m6 m6Var3 = new m6(i12, bd.M0(2131750388, null), this.l.name);
                arrayList.add(m6Var3);
                float f14 = f11 * 0.5f;
                ly0 ly0Var5 = m6Var3.b;
                ly0Var5.p = f14;
                this.u = Math.max(this.u, ly0Var5.c);
                ly0 ly0Var6 = m6Var3.c;
                ly0Var6.p = f14;
                this.v = Math.max(this.v, ly0Var6.c);
                i12 += m6Var3.a();
            }
        }
        float L4 = i12 + org.telegram.messenger.g0.L(11.66f);
        if (this.p) {
            L = org.telegram.messenger.g0.L(10.0f);
        } else {
            this.A = L4;
            this.C = new ly0(bd.M0(2131749896, null), 14.0f, org.telegram.messenger.g0.o());
            float L5 = org.telegram.messenger.g0.L(30.0f);
            this.B = L5;
            L4 += L5;
            L = org.telegram.messenger.g0.L(11.0f);
        }
        this.P = (int) (L4 + L);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        float f10 = this.O;
        float L = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        ly0 ly0Var = new ly0(bd.a0(null, null, 2131749900, org.telegram.messenger.m5.t(j10)), 14.0f, org.telegram.messenger.g0.o());
        this.r = ly0Var;
        this.q = (ly0Var.i() / 2.0f) + L;
        float i3 = this.r.i() + L + org.telegram.messenger.g0.L(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        ly0 ly0Var2 = new ly0(k2.p1.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.t = ly0Var2;
        this.s = (ly0Var2.i() / 2.0f) + i3;
        float i10 = this.t.i() + i3 + org.telegram.messenger.g0.L(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        ai.j1 j1Var = this.y;
        TextPaint textPaint = j1Var.c;
        if (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131749756, null));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder.length(), 33);
            spanned = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            zi.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        TLObject e22 = j10 != 0 ? hp.s1(this.a).e2(j10) : null;
        this.z = true;
        j1Var.c(e22);
        j1Var.m = spanned;
        j1Var.s = -1;
        j1Var.b(((int) f10) - org.telegram.messenger.g0.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = j1Var.n;
            if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                this.N = true;
                this.O = (int) ((Math.min(0.4f, ((j1Var.n != null ? r5.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = i10 + org.telegram.messenger.g0.L(4.0f);
        this.x = L2;
        float L3 = L2 + j1Var.u + org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(11.66f);
        this.A = L3;
        this.C = new ly0(str, 14.0f, org.telegram.messenger.g0.o());
        float L4 = org.telegram.messenger.g0.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + org.telegram.messenger.g0.L(11.0f));
    }
}
