package mi;

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
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class x extends y implements org.telegram.ui.ActionBar.z5, g9, l0, cs, org.telegram.messenger.x5 {
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
    public n3 P;
    public zi Q;
    public TLRPC.Document R;
    public int S;
    public boolean T;
    public boolean U;
    public final k0 V;
    public boolean W;
    public final int n;
    public final org.telegram.ui.ActionBar.e6 r;
    public final Paint s;
    public final TextPaint w;
    public final RadialProgress2 x;
    public final mm0 y;

    public x(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.s = new Paint(1);
        this.w = new TextPaint(1);
        this.F = org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(10.0f);
        this.G = L;
        int L2 = org.telegram.messenger.g0.L(44.0f);
        this.H = L2;
        this.n = i3;
        this.r = e6Var;
        setWillNotDraw(false);
        this.E = org.telegram.messenger.z5.q(i3).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.x = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.F;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        mm0 mm0Var = new mm0(this);
        this.y = mm0Var;
        mm0Var.h = new gi.w5(this, 14);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        k0 k0Var = new k0(context, e6Var, new gi.v5(this, 15));
        this.V = k0Var;
        addView(k0Var.a, mf.e(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        s sVar;
        a aVar = this.a;
        if (aVar == null || (sVar = aVar.g) == null) {
            return null;
        }
        TLRPC.Document document = sVar.h;
        return document != null ? document : sVar.i;
    }

    private int getIconForCurrentState() {
        if (l()) {
            return 3;
        }
        int i3 = this.S;
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        return i3 == 3 ? 3 : 0;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        n(true);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.x.p(true, 1.0f);
        n(true);
    }

    @Override // mi.l0
    public final boolean a(int i3, int i10) {
        return this.V.f(i3, i10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.ig));
    }

    @Override // mi.l0
    public final void b() {
        this.V.i();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        zi ziVar;
        zi ziVar2 = this.Q;
        if (ziVar2 == null || i10 != this.n) {
            return;
        }
        if (i3 == hs.h2 || i3 == hs.f2 || i3 == hs.g2) {
            n(true);
            return;
        }
        if (i3 == hs.e2) {
            if (ziVar2.f1() != ((Integer) objArr[0]).intValue() || (ziVar = MediaController.B().v0) == null) {
                return;
            }
            zi ziVar3 = this.Q;
            ziVar3.b0 = ziVar.b0;
            ziVar3.g0 = ziVar.g0;
            ziVar3.h0 = ziVar.h0;
            p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.V.c(canvas);
    }

    @Override // mi.y
    public final void e(int i3) {
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.I) {
            i3 = 0;
        }
        int i10 = L + i3;
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
        for (int i3 = 0; i3 < displayDocument.attributes.size(); i3++) {
            if (displayDocument.attributes.get(i3) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i3);
            }
        }
        return null;
    }

    @Override // mi.l0
    public h1 getCaptionEditText() {
        return this.V.a;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.E;
    }

    @Override // mi.l0
    public a getRow() {
        return this.a;
    }

    public final void h(a aVar, n3 n3Var) {
        s sVar;
        this.a = aVar;
        this.P = n3Var;
        if (aVar != null && aVar.g == null) {
            aVar.g = new s();
        }
        this.I = bd.a0;
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
            int i3 = this.n;
            long e10 = h10.i(i3).e();
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
            if (aVar2 != null && (sVar = aVar2.g) != null && !TextUtils.isEmpty(sVar.e)) {
                tL_message.attachPath = this.a.g.e;
            }
            this.Q = new zi(i3, tL_message, false, true);
        }
        m();
        if (this.U) {
            n(false);
        }
        requestLayout();
        invalidate();
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.x.p(true, Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11));
        if (this.S != 3) {
            n(true);
        }
    }

    public final boolean j() {
        s sVar;
        a aVar = this.a;
        return (aVar == null || (sVar = aVar.g) == null || !sVar.b()) ? false : true;
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        this.V.e(arrayList);
    }

    public final boolean l() {
        s sVar;
        a aVar = this.a;
        return (aVar == null || (sVar = aVar.g) == null || !sVar.a()) ? false : true;
    }

    public final void m() {
        int L = org.telegram.messenger.g0.L(50.0f) + this.F;
        int i3 = this.H;
        this.J = L + i3;
        this.L = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.g0.q.x) - this.J) - org.telegram.messenger.g0.L(16.0f)) - (this.I ? this.c : 0));
        zi ziVar = this.Q;
        String x12 = ziVar != null ? ziVar.x1(false) : g() != null ? g().performer : null;
        zi ziVar2 = this.Q;
        String z12 = ziVar2 != null ? ziVar2.z1(false) : g() != null ? g().title : null;
        boolean isEmpty = TextUtils.isEmpty(z12);
        int i10 = this.G;
        if (isEmpty && TextUtils.isEmpty(x12)) {
            this.M = null;
            this.K = ((i3 - org.telegram.messenger.g0.L(30.0f)) / 2) + i10;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(z12) || TextUtils.isEmpty(x12)) ? !TextUtils.isEmpty(z12) ? new SpannableStringBuilder(z12) : new SpannableStringBuilder(x12) : new SpannableStringBuilder(a1.g.C(x12, " - ", z12));
            if (!TextUtils.isEmpty(x12)) {
                spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, x12.length(), 18);
            }
            float L2 = org.telegram.messenger.g0.L(16.0f);
            TextPaint textPaint = this.w;
            textPaint.setTextSize(L2);
            this.M = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.L, TextUtils.TruncateAt.END), this.w, org.telegram.messenger.g0.L(50.0f) + this.L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.K = org.telegram.messenger.g0.L(11.0f) + ((i3 - org.telegram.messenger.g0.L(30.0f)) / 2) + i10;
        }
        this.y.i(this.L, org.telegram.messenger.g0.L(30.0f));
    }

    public final void n(boolean z10) {
        File K;
        s sVar;
        int i3 = k6.We;
        int i10 = k6.Xe;
        int i11 = k6.id;
        int i12 = k6.jd;
        RadialProgress2 radialProgress2 = this.x;
        radialProgress2.g(i3, i10, i11, i12);
        radialProgress2.d = k6.w0(k6.pe, this.r);
        this.W = true;
        boolean l10 = l();
        int i13 = this.n;
        if (l10) {
            org.telegram.messenger.z5.q(i13).v(this);
            radialProgress2.p(z10, this.a.g.f);
            radialProgress2.setIcon(3, false, z10);
            p();
            return;
        }
        TLRPC.Document document = j() ? this.a.g.h : null;
        String r5 = w7.r(null, document);
        a aVar = this.a;
        boolean z11 = (aVar == null || (sVar = aVar.g) == null || TextUtils.isEmpty(sVar.e) || !new File(this.a.g.e).exists()) ? false : true;
        if (document == null) {
            K = null;
        } else {
            w7.G(i13);
            K = w7.K(document, null, true, true);
        }
        boolean z12 = z11 || (K != null && K.exists());
        if (TextUtils.isEmpty(r5)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            org.telegram.messenger.z5.q(i13).v(this);
            this.S = (!MediaController.B().I(this.Q) || MediaController.B().H()) ? 0 : 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.z5.q(i13).a(r5, null, this);
            if (w7.G(i13).T(r5)) {
                this.S = 3;
                Float w10 = zb.D().w(r5);
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
        int i3 = this.n;
        hs.f(i3).c(this, hs.h2);
        hs.f(i3).c(this, hs.f2);
        hs.f(i3).c(this, hs.g2);
        hs.f(i3).c(this, hs.e2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U = false;
        int i3 = this.n;
        org.telegram.messenger.z5.q(i3).v(this);
        hs.f(i3).n(this, hs.h2);
        hs.f(i3).n(this, hs.f2);
        hs.f(i3).n(this, hs.g2);
        hs.f(i3).n(this, hs.e2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h9 textSelectionHelper;
        if (getDisplayDocument() == null) {
            return;
        }
        this.x.draw(canvas);
        int i3 = k6.ie;
        org.telegram.ui.ActionBar.e6 e6Var = this.r;
        int w02 = k6.w0(i3, e6Var);
        int w03 = k6.w0(k6.je, e6Var);
        int i10 = k6.le;
        int w04 = k6.w0(i10, e6Var);
        int w05 = k6.w0(i10, e6Var);
        int w06 = k6.w0(k6.ke, e6Var);
        mm0 mm0Var = this.y;
        mm0Var.g(w02, w03, w04, w05, w06);
        if (!l()) {
            canvas.save();
            canvas.translate(this.J, this.K);
            mm0Var.b(canvas);
            canvas.restore();
        }
        int w07 = k6.w0(k6.be, e6Var);
        TextPaint textPaint = this.w;
        textPaint.setColor(w07);
        if (this.N != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.F, org.telegram.messenger.g0.L(6.0f) + this.K);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.M != null) {
            textPaint.setColor(k6.w0(k6.G6, e6Var));
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.F, this.K - org.telegram.messenger.g0.L(16.0f));
            this.M.draw(canvas);
            canvas.restore();
        }
        n3 n3Var = this.P;
        if (n3Var != null && (textSelectionHelper = n3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas.drawRoundRect(org.telegram.messenger.g0.L(8.0f) + (this.I ? 0 : this.c), org.telegram.messenger.g0.L(2.0f), (getWidth() - (this.I ? this.c : 0)) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.s);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        boolean z11 = this.I;
        this.V.g(z11 ? 0 : this.c, z11 ? this.c : 0, i11 - i3, org.telegram.messenger.g0.L(66.0f));
        m();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        boolean z10 = this.I;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(66.0f) + this.V.h(z10 ? 0 : this.c, z10 ? this.c : 0, size));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (!l()) {
            if (this.y.e(x10 - this.J, y9 - this.K, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            if (x10 >= this.F) {
                int i3 = this.H;
                if (x10 <= r0 + i3) {
                    if (y9 >= this.G && y9 <= r0 + i3) {
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
                    n3 n3Var = this.P;
                    if (n3Var != null) {
                        a aVar = this.a;
                        t3 t3Var = n3Var.a;
                        ArrayList arrayList = t3Var.t3;
                        z4 z4Var = (z4) t3Var.h4.remove(aVar.g);
                        if (z4Var != null) {
                            z4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            g2 g2Var = t3Var.R3;
                            if (g2Var != null) {
                                g2Var.d();
                            }
                            arrayList.remove(indexOf);
                            t3Var.g3.O(true);
                            g2 g2Var2 = t3Var.R3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                        }
                        t3Var.p3.onContentChanged();
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
                            w7.G(i11).X(document, this.Q, 1, 1);
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
        int i3;
        zi ziVar;
        if (!l() && (ziVar = this.Q) != null) {
            mm0 mm0Var = this.y;
            if (!mm0Var.e) {
                mm0Var.h(ziVar.b0);
            }
        }
        if (l()) {
            if (g() != null) {
                d = g().duration;
                i3 = (int) d;
            }
            i3 = 0;
        } else if (this.Q == null || !MediaController.B().I(this.Q)) {
            TLRPC.TL_documentAttributeAudio g7 = g();
            if (g7 != null) {
                d = g7.duration;
                i3 = (int) d;
            }
            i3 = 0;
        } else {
            i3 = this.Q.g0;
        }
        String g02 = org.telegram.messenger.g0.g0(i3, false, false);
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i3 = k6.ig;
        org.telegram.ui.ActionBar.e6 e6Var = this.r;
        this.s.setColor(k6.w0(i3, e6Var));
        k0 k0Var = this.V;
        if (k0Var != null) {
            k0Var.a();
        }
        try {
            if (this.W && (radialProgress2 = this.x) != null) {
                radialProgress2.d = k6.w0(k6.pe, e6Var);
            }
            if (getBackground() instanceof z1) {
                ((z1) getBackground()).a(k6.w0(k6.d6, e6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
