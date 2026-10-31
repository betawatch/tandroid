package bi;

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
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hc;
import org.telegram.messenger.jj;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.x41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class b0 extends c0 implements org.telegram.ui.ActionBar.k6, j9, o0, us, org.telegram.messenger.z5 {
    public final int D;
    public int E;
    public final int F;
    public final int G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public StaticLayout L;
    public StaticLayout M;
    public String N;
    public x3 O;
    public jj P;
    public TLRPC.Document Q;
    public int R;
    public boolean S;
    public boolean T;
    public final n0 U;
    public boolean V;
    public final int n;
    public final org.telegram.ui.ActionBar.p6 r;
    public final Paint s;
    public final TextPaint w;
    public final RadialProgress2 x;
    public final kn0 y;

    public b0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.s = new Paint(1);
        this.w = new TextPaint(1);
        this.E = org.telegram.messenger.i0.L(16.0f);
        int L = org.telegram.messenger.i0.L(10.0f);
        this.F = L;
        int L2 = org.telegram.messenger.i0.L(44.0f);
        this.G = L2;
        this.n = i10;
        this.r = p6Var;
        setWillNotDraw(false);
        this.D = org.telegram.messenger.b6.q(i10).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.x = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.i0.L(24.0f));
        int i11 = this.E;
        radialProgress2.r(i11, L, i11 + L2, L2 + L);
        kn0 kn0Var = new kn0(this);
        this.y = kn0Var;
        kn0Var.h = new za.c(this, 8);
        setMinimumHeight(org.telegram.messenger.i0.L(66.0f));
        n0 n0Var = new n0(context, p6Var, new a6.i(this, 9));
        this.U = n0Var;
        addView(n0Var.a, w7.b6.e(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        w wVar;
        a aVar = this.a;
        if (aVar == null || (wVar = aVar.g) == null) {
            return null;
        }
        TLRPC.Document document = wVar.h;
        return document != null ? document : wVar.i;
    }

    private int getIconForCurrentState() {
        if (l()) {
            return 3;
        }
        int i10 = this.R;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 3 ? 3 : 0;
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        o(true);
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.x.p(true, 1.0f);
        o(true);
    }

    @Override // bi.o0
    public final boolean a(int i10, int i11) {
        return this.U.f(i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ig));
    }

    @Override // bi.o0
    public final void b() {
        this.U.i();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jj jjVar;
        jj jjVar2 = this.P;
        if (jjVar2 == null || i11 != this.n) {
            return;
        }
        if (i10 == zs.h2 || i10 == zs.f2 || i10 == zs.g2) {
            o(true);
            return;
        }
        if (i10 == zs.e2) {
            if (jjVar2.f1() != ((Integer) objArr[0]).intValue() || (jjVar = MediaController.B().u0) == null) {
                return;
            }
            jj jjVar3 = this.P;
            jjVar3.b0 = jjVar.b0;
            jjVar3.g0 = jjVar.g0;
            jjVar3.h0 = jjVar.h0;
            p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.U.c(canvas);
    }

    @Override // bi.c0
    public final void e(int i10) {
        int L = org.telegram.messenger.i0.L(16.0f);
        if (this.H) {
            i10 = 0;
        }
        int i11 = L + i10;
        this.E = i11;
        int i12 = this.G;
        int i13 = this.F;
        this.x.r(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    public final TLRPC.TL_documentAttributeAudio g() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i10 = 0; i10 < displayDocument.attributes.size(); i10++) {
            if (displayDocument.attributes.get(i10) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i10);
            }
        }
        return null;
    }

    @Override // bi.o0
    public n1 getCaptionEditText() {
        return this.U.a;
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.D;
    }

    @Override // bi.o0
    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        this.U.e(arrayList);
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.x.p(true, Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11));
        if (this.R != 3) {
            o(true);
        }
    }

    public final void j(a aVar, x3 x3Var) {
        w wVar;
        this.a = aVar;
        this.O = x3Var;
        if (aVar != null && aVar.g == null) {
            aVar.g = new w();
        }
        this.H = cd.X;
        c(aVar);
        this.U.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.Q) {
            this.Q = displayDocument;
            this.P = null;
            this.N = null;
            this.M = null;
        }
        if (k() && this.P == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Long.valueOf(displayDocument.id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.n;
            long e = d20.i(i10).e();
            peer.user_id = e;
            tL_peerUser.user_id = e;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.a;
            if (aVar2 != null && (wVar = aVar2.g) != null && !TextUtils.isEmpty(wVar.e)) {
                tL_message.attachPath = this.a.g.e;
            }
            this.P = new jj(i10, tL_message, false, true);
        }
        m();
        if (this.T) {
            o(false);
        }
        requestLayout();
        invalidate();
    }

    public final boolean k() {
        w wVar;
        a aVar = this.a;
        return (aVar == null || (wVar = aVar.g) == null || !wVar.b()) ? false : true;
    }

    public final boolean l() {
        w wVar;
        a aVar = this.a;
        return (aVar == null || (wVar = aVar.g) == null || !wVar.a()) ? false : true;
    }

    public final void m() {
        int L = org.telegram.messenger.i0.L(50.0f) + this.E;
        int i10 = this.G;
        this.I = L + i10;
        this.K = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.i0.q.x) - this.I) - org.telegram.messenger.i0.L(16.0f)) - (this.H ? this.c : 0));
        jj jjVar = this.P;
        String x12 = jjVar != null ? jjVar.x1(false) : g() != null ? g().performer : null;
        jj jjVar2 = this.P;
        String z12 = jjVar2 != null ? jjVar2.z1(false) : g() != null ? g().title : null;
        boolean isEmpty = TextUtils.isEmpty(z12);
        int i11 = this.F;
        if (isEmpty && TextUtils.isEmpty(x12)) {
            this.L = null;
            this.J = ((i10 - org.telegram.messenger.i0.L(30.0f)) / 2) + i11;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(z12) || TextUtils.isEmpty(x12)) ? !TextUtils.isEmpty(z12) ? new SpannableStringBuilder(z12) : new SpannableStringBuilder(x12) : new SpannableStringBuilder(a1.g.C(x12, " - ", z12));
            if (!TextUtils.isEmpty(x12)) {
                spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, x12.length(), 18);
            }
            float L2 = org.telegram.messenger.i0.L(16.0f);
            TextPaint textPaint = this.w;
            textPaint.setTextSize(L2);
            this.L = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.K, TextUtils.TruncateAt.END), this.w, org.telegram.messenger.i0.L(50.0f) + this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.J = org.telegram.messenger.i0.L(11.0f) + ((i10 - org.telegram.messenger.i0.L(30.0f)) / 2) + i11;
        }
        this.y.i(this.K, org.telegram.messenger.i0.L(30.0f));
    }

    public final void o(boolean z10) {
        File K;
        w wVar;
        int i10 = org.telegram.ui.ActionBar.t6.We;
        int i11 = org.telegram.ui.ActionBar.t6.Xe;
        int i12 = org.telegram.ui.ActionBar.t6.id;
        int i13 = org.telegram.ui.ActionBar.t6.jd;
        RadialProgress2 radialProgress2 = this.x;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.pe, this.r);
        this.V = true;
        boolean l4 = l();
        int i14 = this.n;
        if (l4) {
            org.telegram.messenger.b6.q(i14).v(this);
            radialProgress2.p(z10, this.a.g.f);
            radialProgress2.setIcon(3, false, z10);
            p();
            return;
        }
        TLRPC.Document document = k() ? this.a.g.h : null;
        String r10 = b8.r(null, document);
        a aVar = this.a;
        boolean z11 = (aVar == null || (wVar = aVar.g) == null || TextUtils.isEmpty(wVar.e) || !new File(this.a.g.e).exists()) ? false : true;
        if (document == null) {
            K = null;
        } else {
            b8.G(i14);
            K = b8.K(document, null, true, true);
        }
        boolean z12 = z11 || (K != null && K.exists());
        if (TextUtils.isEmpty(r10)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            org.telegram.messenger.b6.q(i14).v(this);
            this.R = (!MediaController.B().I(this.P) || MediaController.B().H()) ? 0 : 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.b6.q(i14).a(r10, null, this);
            if (b8.G(i14).T(r10)) {
                this.R = 3;
                Float w9 = hc.D().w(r10);
                radialProgress2.p(z10, w9 != null ? w9.floatValue() : 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            } else {
                this.R = 2;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            }
        }
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        this.x.n(this);
        this.y.s = this;
        o(false);
        int i10 = this.n;
        zs.f(i10).c(this, zs.h2);
        zs.f(i10).c(this, zs.f2);
        zs.f(i10).c(this, zs.g2);
        zs.f(i10).c(this, zs.e2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        int i10 = this.n;
        org.telegram.messenger.b6.q(i10).v(this);
        zs.f(i10).n(this, zs.h2);
        zs.f(i10).n(this, zs.f2);
        zs.f(i10).n(this, zs.g2);
        zs.f(i10).n(this, zs.e2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k9 textSelectionHelper;
        if (getDisplayDocument() == null) {
            return;
        }
        this.x.draw(canvas);
        int i10 = org.telegram.ui.ActionBar.t6.ie;
        org.telegram.ui.ActionBar.p6 p6Var = this.r;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.je, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.le;
        int w04 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        int w05 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ke, p6Var);
        kn0 kn0Var = this.y;
        kn0Var.g(w02, w03, w04, w05, w06);
        if (!l()) {
            canvas.save();
            canvas.translate(this.I, this.J);
            kn0Var.b(canvas);
            canvas.restore();
        }
        int w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.be, p6Var);
        TextPaint textPaint = this.w;
        textPaint.setColor(w07);
        if (this.M != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(54.0f) + this.E, org.telegram.messenger.i0.L(6.0f) + this.J);
            this.M.draw(canvas);
            canvas.restore();
        }
        if (this.L != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(54.0f) + this.E, this.J - org.telegram.messenger.i0.L(16.0f));
            this.L.draw(canvas);
            canvas.restore();
        }
        x3 x3Var = this.O;
        if (x3Var != null && (textSelectionHelper = x3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas.drawRoundRect(org.telegram.messenger.i0.L(8.0f) + (this.H ? 0 : this.c), org.telegram.messenger.i0.L(2.0f), (getWidth() - (this.H ? this.c : 0)) - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(64.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.s);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = this.H;
        this.U.g(z11 ? 0 : this.c, z11 ? this.c : 0, i12 - i10, org.telegram.messenger.i0.L(66.0f));
        m();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.H;
        setMeasuredDimension(size, org.telegram.messenger.i0.L(66.0f) + this.U.h(z10 ? 0 : this.c, z10 ? this.c : 0, size));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (!l()) {
            if (this.y.e(x10 - this.I, y3 - this.J, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            if (x10 >= this.E) {
                int i10 = this.G;
                if (x10 <= r0 + i10) {
                    if (y3 >= this.F && y3 <= r0 + i10) {
                        this.S = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.S) {
                this.S = false;
                playSoundEffect(0);
                if (l()) {
                    x3 x3Var = this.O;
                    if (x3Var != null) {
                        a aVar = this.a;
                        d4 d4Var = x3Var.a;
                        ArrayList arrayList = d4Var.s3;
                        l5 l5Var = (l5) d4Var.g4.remove(aVar.g);
                        if (l5Var != null) {
                            l5Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            o2 o2Var = d4Var.Q3;
                            if (o2Var != null) {
                                o2Var.d();
                            }
                            arrayList.remove(indexOf);
                            d4Var.f3.O(true);
                            o2 o2Var2 = d4Var.Q3;
                            if (o2Var2 != null) {
                                o2Var2.h();
                            }
                        }
                        d4Var.o3.onContentChanged();
                    }
                } else if (this.P != null) {
                    TLRPC.Document document = k() ? this.a.g.h : null;
                    int i11 = this.R;
                    RadialProgress2 radialProgress2 = this.x;
                    if (i11 == 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(this.P);
                        if (MediaController.B().o0(arrayList2, this.P, 0L, false, null)) {
                            this.R = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i11 != 1) {
                        int i12 = this.n;
                        if (i11 == 2) {
                            radialProgress2.p(false, 0.0f);
                            b8.G(i12).X(document, this.P, 1, 1);
                            this.R = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i11 == 3) {
                            b8.G(i12).f(document);
                            this.R = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (MediaController.B().R(this.P, true)) {
                        this.R = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.S = false;
        }
        return this.S || super.onTouchEvent(motionEvent);
    }

    public final void p() {
        double d;
        int i10;
        jj jjVar;
        if (!l() && (jjVar = this.P) != null) {
            kn0 kn0Var = this.y;
            if (!kn0Var.e) {
                kn0Var.h(jjVar.b0);
            }
        }
        if (l()) {
            if (g() != null) {
                d = g().duration;
                i10 = (int) d;
            }
            i10 = 0;
        } else if (this.P == null || !MediaController.B().I(this.P)) {
            TLRPC.TL_documentAttributeAudio g10 = g();
            if (g10 != null) {
                d = g10.duration;
                i10 = (int) d;
            }
            i10 = 0;
        } else {
            i10 = this.P.g0;
        }
        String g02 = org.telegram.messenger.i0.g0(i10, false, false);
        String str = this.N;
        if (str == null || !str.equals(g02)) {
            this.N = g02;
            float L = org.telegram.messenger.i0.L(16.0f);
            TextPaint textPaint = this.w;
            textPaint.setTextSize(L);
            this.M = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i10 = org.telegram.ui.ActionBar.t6.ig;
        org.telegram.ui.ActionBar.p6 p6Var = this.r;
        this.s.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        n0 n0Var = this.U;
        if (n0Var != null) {
            n0Var.a();
        }
        try {
            if (this.V && (radialProgress2 = this.x) != null) {
                radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.pe, p6Var);
            }
            if (getBackground() instanceof h2) {
                ((h2) getBackground()).a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
