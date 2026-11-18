package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.vm0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class w extends x implements org.telegram.ui.ActionBar.c6, h9, i0, fs, org.telegram.messenger.y5 {
    public final int E;
    public int F;
    public final int G;
    public final int H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public StaticLayout M;
    public StaticLayout N;
    public String O;
    public m3 P;
    public fj Q;
    public TLRPC.Document R;
    public int S;
    public boolean T;
    public boolean U;
    public final h0 V;
    public boolean W;
    public final int n;
    public final i6 r;
    public final Paint s;
    public final TextPaint w;
    public final RadialProgress2 x;
    public final vm0 y;

    public w(int i7, Context context, i6 i6Var) {
        super(context);
        this.s = new Paint(1);
        this.w = new TextPaint(1);
        this.F = org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(10.0f);
        this.G = L;
        int L2 = org.telegram.messenger.g0.L(44.0f);
        this.H = L2;
        this.n = i7;
        this.r = i6Var;
        setWillNotDraw(false);
        this.E = org.telegram.messenger.a6.q(i7).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, i6Var);
        this.x = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.F;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        vm0 vm0Var = new vm0(this);
        this.y = vm0Var;
        vm0Var.h = new h9.g1(this, 17);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        h0 h0Var = new h0(context, i6Var, new hi.w4(this, 17));
        this.V = h0Var;
        addView(h0Var.a, ma.e(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        r rVar;
        a aVar = this.a;
        if (aVar == null || (rVar = aVar.g) == null) {
            return null;
        }
        TLRPC.Document document = rVar.h;
        return document != null ? document : rVar.i;
    }

    private int getIconForCurrentState() {
        if (l()) {
            return 3;
        }
        int i7 = this.S;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        return i7 == 3 ? 3 : 0;
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        n(true);
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        this.x.p(true, 1.0f);
        n(true);
    }

    @Override // oi.i0
    public final boolean a(int i7, int i10) {
        return this.V.f(i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.lg));
    }

    @Override // oi.i0
    public final void b() {
        this.V.i();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fj fjVar;
        fj fjVar2 = this.Q;
        if (fjVar2 == null || i10 != this.n) {
            return;
        }
        if (i7 == ks.h2 || i7 == ks.f2 || i7 == ks.g2) {
            n(true);
            return;
        }
        if (i7 == ks.e2) {
            if (fjVar2.e1() != ((Integer) objArr[0]).intValue() || (fjVar = MediaController.B().v0) == null) {
                return;
            }
            fj fjVar3 = this.Q;
            fjVar3.b0 = fjVar.b0;
            fjVar3.i0 = fjVar.i0;
            fjVar3.j0 = fjVar.j0;
            p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.V.c(canvas);
    }

    @Override // oi.x
    public final void e(int i7) {
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.I) {
            i7 = 0;
        }
        int i10 = L + i7;
        this.F = i10;
        int i11 = this.H;
        int i12 = this.G;
        this.x.r(i10, i12, i10 + i11, i11 + i12);
        requestLayout();
        invalidate();
    }

    public final TLRPC.TL_documentAttributeAudio g() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i7 = 0; i7 < displayDocument.attributes.size(); i7++) {
            if (displayDocument.attributes.get(i7) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i7);
            }
        }
        return null;
    }

    @Override // oi.i0
    public e1 getCaptionEditText() {
        return this.V.a;
    }

    @Override // org.telegram.messenger.y5
    public int getObserverTag() {
        return this.E;
    }

    @Override // oi.i0
    public a getRow() {
        return this.a;
    }

    public final void h(a aVar, m3 m3Var) {
        r rVar;
        this.a = aVar;
        this.P = m3Var;
        if (aVar != null && aVar.g == null) {
            aVar.g = new r();
        }
        this.I = gd.a0;
        c(aVar);
        this.V.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.R) {
            this.R = displayDocument;
            this.Q = null;
            this.O = null;
            this.N = null;
        }
        if (j() && this.Q == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Long.valueOf(displayDocument.id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i7 = this.n;
            long e10 = j10.i(i7).e();
            peer.user_id = e10;
            tL_peerUser.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.a;
            if (aVar2 != null && (rVar = aVar2.g) != null && !TextUtils.isEmpty(rVar.e)) {
                tL_message.attachPath = this.a.g.e;
            }
            this.Q = new fj(i7, tL_message, false, true);
        }
        m();
        if (this.U) {
            n(false);
        }
        requestLayout();
        invalidate();
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        this.x.p(true, Math.min(1.0f, j10 <= 0 ? 0.0f : j3 / j10));
        if (this.S != 3) {
            n(true);
        }
    }

    public final boolean j() {
        r rVar;
        a aVar = this.a;
        return (aVar == null || (rVar = aVar.g) == null || !rVar.b()) ? false : true;
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        this.V.e(arrayList);
    }

    public final boolean l() {
        r rVar;
        a aVar = this.a;
        return (aVar == null || (rVar = aVar.g) == null || !rVar.a()) ? false : true;
    }

    public final void m() {
        int L = org.telegram.messenger.g0.L(50.0f) + this.F;
        int i7 = this.H;
        this.J = L + i7;
        this.L = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.g0.q.x) - this.J) - org.telegram.messenger.g0.L(16.0f)) - (this.I ? this.c : 0));
        fj fjVar = this.Q;
        String w12 = fjVar != null ? fjVar.w1(false) : g() != null ? g().performer : null;
        fj fjVar2 = this.Q;
        String y12 = fjVar2 != null ? fjVar2.y1(false) : g() != null ? g().title : null;
        boolean isEmpty = TextUtils.isEmpty(y12);
        int i10 = this.G;
        if (isEmpty && TextUtils.isEmpty(w12)) {
            this.M = null;
            this.K = ((i7 - org.telegram.messenger.g0.L(30.0f)) / 2) + i10;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(y12) || TextUtils.isEmpty(w12)) ? !TextUtils.isEmpty(y12) ? new SpannableStringBuilder(y12) : new SpannableStringBuilder(w12) : new SpannableStringBuilder(a8.p0.E(w12, " - ", y12));
            if (!TextUtils.isEmpty(w12)) {
                spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), 0, w12.length(), 18);
            }
            float L2 = org.telegram.messenger.g0.L(16.0f);
            TextPaint textPaint = this.w;
            textPaint.setTextSize(L2);
            this.M = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.L, TextUtils.TruncateAt.END), this.w, org.telegram.messenger.g0.L(50.0f) + this.L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.K = org.telegram.messenger.g0.L(11.0f) + ((i7 - org.telegram.messenger.g0.L(30.0f)) / 2) + i10;
        }
        this.y.i(this.L, org.telegram.messenger.g0.L(30.0f));
    }

    public final void n(boolean z10) {
        File J;
        r rVar;
        int i7 = n6.Ze;
        int i10 = n6.af;
        int i11 = n6.ld;
        int i12 = n6.md;
        RadialProgress2 radialProgress2 = this.x;
        radialProgress2.g(i7, i10, i11, i12);
        radialProgress2.d = n6.w0(n6.se, this.r);
        this.W = true;
        boolean l10 = l();
        int i13 = this.n;
        if (l10) {
            org.telegram.messenger.a6.q(i13).v(this);
            radialProgress2.p(z10, this.a.g.f);
            radialProgress2.setIcon(3, false, z10);
            p();
            return;
        }
        TLRPC.Document document = j() ? this.a.g.h : null;
        String r10 = w7.r(null, document);
        a aVar = this.a;
        boolean z11 = (aVar == null || (rVar = aVar.g) == null || TextUtils.isEmpty(rVar.e) || !new File(this.a.g.e).exists()) ? false : true;
        if (document == null) {
            J = null;
        } else {
            w7.G(i13);
            J = w7.J(document, null, true, true);
        }
        boolean z12 = z11 || (J != null && J.exists());
        if (TextUtils.isEmpty(r10)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            org.telegram.messenger.a6.q(i13).v(this);
            this.S = (!MediaController.B().I(this.Q) || MediaController.B().H()) ? 0 : 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.a6.q(i13).a(r10, null, this);
            if (w7.G(i13).S(r10)) {
                this.S = 3;
                Float w10 = ec.D().w(r10);
                radialProgress2.p(z10, w10 != null ? w10.floatValue() : 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            } else {
                this.S = 2;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            }
        }
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U = true;
        this.x.n(this);
        this.y.s = this;
        n(false);
        int i7 = this.n;
        ks.f(i7).c(this, ks.h2);
        ks.f(i7).c(this, ks.f2);
        ks.f(i7).c(this, ks.g2);
        ks.f(i7).c(this, ks.e2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U = false;
        int i7 = this.n;
        org.telegram.messenger.a6.q(i7).v(this);
        ks.f(i7).n(this, ks.h2);
        ks.f(i7).n(this, ks.f2);
        ks.f(i7).n(this, ks.g2);
        ks.f(i7).n(this, ks.e2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i9 textSelectionHelper;
        if (getDisplayDocument() == null) {
            return;
        }
        this.x.draw(canvas);
        int i7 = n6.le;
        i6 i6Var = this.r;
        int w02 = n6.w0(i7, i6Var);
        int w03 = n6.w0(n6.me, i6Var);
        int i10 = n6.oe;
        int w04 = n6.w0(i10, i6Var);
        int w05 = n6.w0(i10, i6Var);
        int w06 = n6.w0(n6.ne, i6Var);
        vm0 vm0Var = this.y;
        vm0Var.g(w02, w03, w04, w05, w06);
        if (!l()) {
            canvas.save();
            canvas.translate(this.J, this.K);
            vm0Var.b(canvas);
            canvas.restore();
        }
        int w07 = n6.w0(n6.ee, i6Var);
        TextPaint textPaint = this.w;
        textPaint.setColor(w07);
        if (this.N != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.F, org.telegram.messenger.g0.L(6.0f) + this.K);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.M != null) {
            textPaint.setColor(n6.w0(n6.G6, i6Var));
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.F, this.K - org.telegram.messenger.g0.L(16.0f));
            this.M.draw(canvas);
            canvas.restore();
        }
        m3 m3Var = this.P;
        if (m3Var != null && (textSelectionHelper = m3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas.drawRoundRect(org.telegram.messenger.g0.L(8.0f) + (this.I ? 0 : this.c), org.telegram.messenger.g0.L(2.0f), (getWidth() - (this.I ? this.c : 0)) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.s);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11 = this.I;
        this.V.g(z11 ? 0 : this.c, z11 ? this.c : 0, i11 - i7, org.telegram.messenger.g0.L(66.0f));
        m();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        boolean z10 = this.I;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(66.0f) + this.V.h(z10 ? 0 : this.c, z10 ? this.c : 0, size));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (!l()) {
            if (this.y.e(x10 - this.J, y10 - this.K, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            if (x10 >= this.F) {
                int i7 = this.H;
                if (x10 <= r0 + i7) {
                    if (y10 >= this.G && y10 <= r0 + i7) {
                        this.T = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.T) {
                this.T = false;
                playSoundEffect(0);
                if (l()) {
                    m3 m3Var = this.P;
                    if (m3Var != null) {
                        a aVar = this.a;
                        s3 s3Var = m3Var.a;
                        ArrayList arrayList = s3Var.t3;
                        x4 x4Var = (x4) s3Var.h4.remove(aVar.g);
                        if (x4Var != null) {
                            x4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            e2 e2Var = s3Var.R3;
                            if (e2Var != null) {
                                e2Var.d();
                            }
                            arrayList.remove(indexOf);
                            s3Var.g3.O(true);
                            e2 e2Var2 = s3Var.R3;
                            if (e2Var2 != null) {
                                e2Var2.h();
                            }
                        }
                        s3Var.p3.onContentChanged();
                    }
                } else if (this.Q != null) {
                    TLRPC.Document document = j() ? this.a.g.h : null;
                    int i10 = this.S;
                    RadialProgress2 radialProgress2 = this.x;
                    if (i10 == 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(this.Q);
                        if (MediaController.B().o0(arrayList2, this.Q, 0L, false, null, 0L)) {
                            this.S = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i10 != 1) {
                        int i11 = this.n;
                        if (i10 == 2) {
                            radialProgress2.p(false, 0.0f);
                            w7.G(i11).W(document, this.Q, 1, 1);
                            this.S = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i10 == 3) {
                            w7.G(i11).f(document);
                            this.S = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (MediaController.B().R(this.Q, true)) {
                        this.S = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.T = false;
        }
        return this.T || super.onTouchEvent(motionEvent);
    }

    public final void p() {
        double d;
        int i7;
        fj fjVar;
        if (!l() && (fjVar = this.Q) != null) {
            vm0 vm0Var = this.y;
            if (!vm0Var.e) {
                vm0Var.h(fjVar.b0);
            }
        }
        if (l()) {
            if (g() != null) {
                d = g().duration;
                i7 = (int) d;
            }
            i7 = 0;
        } else if (this.Q == null || !MediaController.B().I(this.Q)) {
            TLRPC.TL_documentAttributeAudio g10 = g();
            if (g10 != null) {
                d = g10.duration;
                i7 = (int) d;
            }
            i7 = 0;
        } else {
            i7 = this.Q.i0;
        }
        String g02 = org.telegram.messenger.g0.g0(i7, false, false);
        String str = this.O;
        if (str == null || !str.equals(g02)) {
            this.O = g02;
            float L = org.telegram.messenger.g0.L(16.0f);
            TextPaint textPaint = this.w;
            textPaint.setTextSize(L);
            this.N = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i7 = n6.lg;
        i6 i6Var = this.r;
        this.s.setColor(n6.w0(i7, i6Var));
        h0 h0Var = this.V;
        if (h0Var != null) {
            h0Var.a();
        }
        try {
            if (this.W && (radialProgress2 = this.x) != null) {
                radialProgress2.d = n6.w0(n6.se, i6Var);
            }
            if (getBackground() instanceof w1) {
                ((w1) getBackground()).a(n6.w0(n6.d6, i6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
