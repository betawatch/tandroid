package li;

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
import c8.ha;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.o31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class x extends y implements org.telegram.ui.ActionBar.a6, h9, k0, ls, org.telegram.messenger.x5 {
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
    public n3 O;
    public ij P;
    public TLRPC.Document Q;
    public int R;
    public boolean S;
    public boolean T;
    public final j0 U;
    public boolean V;
    public final int n;
    public final f6 r;
    public final Paint s;
    public final TextPaint w;
    public final RadialProgress2 x;
    public final jm0 y;

    public x(int i7, Context context, f6 f6Var) {
        super(context);
        this.s = new Paint(1);
        this.w = new TextPaint(1);
        this.E = org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(10.0f);
        this.F = L;
        int L2 = org.telegram.messenger.g0.L(44.0f);
        this.G = L2;
        this.n = i7;
        this.r = f6Var;
        setWillNotDraw(false);
        this.D = org.telegram.messenger.z5.q(i7).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.x = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.E;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        jm0 jm0Var = new jm0(this);
        this.y = jm0Var;
        jm0Var.h = new gf.g(this, 11);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        j0 j0Var = new j0(context, f6Var, new h9.f1(this, 9));
        this.U = j0Var;
        addView(j0Var.a, ha.e(-2, -2, 51));
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
        int i7 = this.R;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        return i7 == 3 ? 3 : 0;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        n(true);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.x.p(true, 1.0f);
        n(true);
    }

    @Override // li.k0
    public final boolean a(int i7, int i10) {
        return this.U.f(i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.ig));
    }

    @Override // li.k0
    public final void b() {
        this.U.i();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ij ijVar;
        ij ijVar2 = this.P;
        if (ijVar2 == null || i10 != this.n) {
            return;
        }
        if (i7 == qs.h2 || i7 == qs.f2 || i7 == qs.g2) {
            n(true);
            return;
        }
        if (i7 == qs.e2) {
            if (ijVar2.f1() != ((Integer) objArr[0]).intValue() || (ijVar = MediaController.B().u0) == null) {
                return;
            }
            ij ijVar3 = this.P;
            ijVar3.b0 = ijVar.b0;
            ijVar3.g0 = ijVar.g0;
            ijVar3.h0 = ijVar.h0;
            p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.U.c(canvas);
    }

    @Override // li.y
    public final void e(int i7) {
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.H) {
            i7 = 0;
        }
        int i10 = L + i7;
        this.E = i10;
        int i11 = this.G;
        int i12 = this.F;
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

    @Override // li.k0
    public g1 getCaptionEditText() {
        return this.U.a;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.D;
    }

    @Override // li.k0
    public a getRow() {
        return this.a;
    }

    public final void h(a aVar, n3 n3Var) {
        s sVar;
        this.a = aVar;
        this.O = n3Var;
        if (aVar != null && aVar.g == null) {
            aVar.g = new s();
        }
        this.H = hd.a0;
        c(aVar);
        this.U.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.Q) {
            this.Q = displayDocument;
            this.P = null;
            this.N = null;
            this.M = null;
        }
        if (j() && this.P == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Long.valueOf(displayDocument.id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i7 = this.n;
            long e10 = p10.i(i7).e();
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
            this.P = new ij(i7, tL_message, false, true);
        }
        m();
        if (this.T) {
            n(false);
        }
        requestLayout();
        invalidate();
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.x.p(true, Math.min(1.0f, j10 <= 0 ? 0.0f : j3 / j10));
        if (this.R != 3) {
            n(true);
        }
    }

    public final boolean j() {
        s sVar;
        a aVar = this.a;
        return (aVar == null || (sVar = aVar.g) == null || !sVar.b()) ? false : true;
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        this.U.e(arrayList);
    }

    public final boolean l() {
        s sVar;
        a aVar = this.a;
        return (aVar == null || (sVar = aVar.g) == null || !sVar.a()) ? false : true;
    }

    public final void m() {
        int L = org.telegram.messenger.g0.L(50.0f) + this.E;
        int i7 = this.G;
        this.I = L + i7;
        this.K = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.g0.q.x) - this.I) - org.telegram.messenger.g0.L(16.0f)) - (this.H ? this.c : 0));
        ij ijVar = this.P;
        String x12 = ijVar != null ? ijVar.x1(false) : g() != null ? g().performer : null;
        ij ijVar2 = this.P;
        String z12 = ijVar2 != null ? ijVar2.z1(false) : g() != null ? g().title : null;
        boolean isEmpty = TextUtils.isEmpty(z12);
        int i10 = this.F;
        if (isEmpty && TextUtils.isEmpty(x12)) {
            this.L = null;
            this.J = ((i7 - org.telegram.messenger.g0.L(30.0f)) / 2) + i10;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(z12) || TextUtils.isEmpty(x12)) ? !TextUtils.isEmpty(z12) ? new SpannableStringBuilder(z12) : new SpannableStringBuilder(x12) : new SpannableStringBuilder(a8.p0.D(x12, " - ", z12));
            if (!TextUtils.isEmpty(x12)) {
                spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, x12.length(), 18);
            }
            float L2 = org.telegram.messenger.g0.L(16.0f);
            TextPaint textPaint = this.w;
            textPaint.setTextSize(L2);
            this.L = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.K, TextUtils.TruncateAt.END), this.w, org.telegram.messenger.g0.L(50.0f) + this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.J = org.telegram.messenger.g0.L(11.0f) + ((i7 - org.telegram.messenger.g0.L(30.0f)) / 2) + i10;
        }
        this.y.i(this.K, org.telegram.messenger.g0.L(30.0f));
    }

    public final void n(boolean z9) {
        File K;
        s sVar;
        int i7 = k6.We;
        int i10 = k6.Xe;
        int i11 = k6.id;
        int i12 = k6.jd;
        RadialProgress2 radialProgress2 = this.x;
        radialProgress2.g(i7, i10, i11, i12);
        radialProgress2.d = k6.w0(k6.pe, this.r);
        this.V = true;
        boolean l10 = l();
        int i13 = this.n;
        if (l10) {
            org.telegram.messenger.z5.q(i13).v(this);
            radialProgress2.p(z9, this.a.g.f);
            radialProgress2.setIcon(3, false, z9);
            p();
            return;
        }
        TLRPC.Document document = j() ? this.a.g.h : null;
        String r10 = w7.r(null, document);
        a aVar = this.a;
        boolean z10 = (aVar == null || (sVar = aVar.g) == null || TextUtils.isEmpty(sVar.e) || !new File(this.a.g.e).exists()) ? false : true;
        if (document == null) {
            K = null;
        } else {
            w7.G(i13);
            K = w7.K(document, null, true, true);
        }
        boolean z11 = z10 || (K != null && K.exists());
        if (TextUtils.isEmpty(r10)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.z5.q(i13).v(this);
            this.R = (!MediaController.B().I(this.P) || MediaController.B().H()) ? 0 : 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z9);
        } else {
            org.telegram.messenger.z5.q(i13).a(r10, null, this);
            if (w7.G(i13).T(r10)) {
                this.R = 3;
                Float w10 = gc.D().w(r10);
                radialProgress2.p(z9, w10 != null ? w10.floatValue() : 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), true, z9);
            } else {
                this.R = 2;
                radialProgress2.p(z9, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z9);
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
        n(false);
        int i7 = this.n;
        qs.f(i7).c(this, qs.h2);
        qs.f(i7).c(this, qs.f2);
        qs.f(i7).c(this, qs.g2);
        qs.f(i7).c(this, qs.e2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        int i7 = this.n;
        org.telegram.messenger.z5.q(i7).v(this);
        qs.f(i7).n(this, qs.h2);
        qs.f(i7).n(this, qs.f2);
        qs.f(i7).n(this, qs.g2);
        qs.f(i7).n(this, qs.e2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i9 textSelectionHelper;
        if (getDisplayDocument() == null) {
            return;
        }
        this.x.draw(canvas);
        int i7 = k6.ie;
        f6 f6Var = this.r;
        int w02 = k6.w0(i7, f6Var);
        int w03 = k6.w0(k6.je, f6Var);
        int i10 = k6.le;
        int w04 = k6.w0(i10, f6Var);
        int w05 = k6.w0(i10, f6Var);
        int w06 = k6.w0(k6.ke, f6Var);
        jm0 jm0Var = this.y;
        jm0Var.g(w02, w03, w04, w05, w06);
        if (!l()) {
            canvas.save();
            canvas.translate(this.I, this.J);
            jm0Var.b(canvas);
            canvas.restore();
        }
        int w07 = k6.w0(k6.be, f6Var);
        TextPaint textPaint = this.w;
        textPaint.setColor(w07);
        if (this.M != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.E, org.telegram.messenger.g0.L(6.0f) + this.J);
            this.M.draw(canvas);
            canvas.restore();
        }
        if (this.L != null) {
            textPaint.setColor(k6.w0(k6.G6, f6Var));
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.E, this.J - org.telegram.messenger.g0.L(16.0f));
            this.L.draw(canvas);
            canvas.restore();
        }
        n3 n3Var = this.O;
        if (n3Var != null && (textSelectionHelper = n3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas.drawRoundRect(org.telegram.messenger.g0.L(8.0f) + (this.H ? 0 : this.c), org.telegram.messenger.g0.L(2.0f), (getWidth() - (this.H ? this.c : 0)) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.s);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10 = this.H;
        this.U.g(z10 ? 0 : this.c, z10 ? this.c : 0, i11 - i7, org.telegram.messenger.g0.L(66.0f));
        m();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        boolean z9 = this.H;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(66.0f) + this.U.h(z9 ? 0 : this.c, z9 ? this.c : 0, size));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (!l()) {
            if (this.y.e(x10 - this.I, y10 - this.J, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            if (x10 >= this.E) {
                int i7 = this.G;
                if (x10 <= r0 + i7) {
                    if (y10 >= this.F && y10 <= r0 + i7) {
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
                    n3 n3Var = this.O;
                    if (n3Var != null) {
                        a aVar = this.a;
                        t3 t3Var = n3Var.a;
                        ArrayList arrayList = t3Var.s3;
                        y4 y4Var = (y4) t3Var.g4.remove(aVar.g);
                        if (y4Var != null) {
                            y4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            f2 f2Var = t3Var.Q3;
                            if (f2Var != null) {
                                f2Var.d();
                            }
                            arrayList.remove(indexOf);
                            t3Var.f3.O(true);
                            f2 f2Var2 = t3Var.Q3;
                            if (f2Var2 != null) {
                                f2Var2.h();
                            }
                        }
                        t3Var.o3.onContentChanged();
                    }
                } else if (this.P != null) {
                    TLRPC.Document document = j() ? this.a.g.h : null;
                    int i10 = this.R;
                    RadialProgress2 radialProgress2 = this.x;
                    if (i10 == 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(this.P);
                        if (MediaController.B().o0(arrayList2, this.P, 0L, false, null, 0L)) {
                            this.R = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i10 != 1) {
                        int i11 = this.n;
                        if (i10 == 2) {
                            radialProgress2.p(false, 0.0f);
                            w7.G(i11).X(document, this.P, 1, 1);
                            this.R = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i10 == 3) {
                            w7.G(i11).f(document);
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
        int i7;
        ij ijVar;
        if (!l() && (ijVar = this.P) != null) {
            jm0 jm0Var = this.y;
            if (!jm0Var.e) {
                jm0Var.h(ijVar.b0);
            }
        }
        if (l()) {
            if (g() != null) {
                d = g().duration;
                i7 = (int) d;
            }
            i7 = 0;
        } else if (this.P == null || !MediaController.B().I(this.P)) {
            TLRPC.TL_documentAttributeAudio g10 = g();
            if (g10 != null) {
                d = g10.duration;
                i7 = (int) d;
            }
            i7 = 0;
        } else {
            i7 = this.P.g0;
        }
        String g02 = org.telegram.messenger.g0.g0(i7, false, false);
        String str = this.N;
        if (str == null || !str.equals(g02)) {
            this.N = g02;
            float L = org.telegram.messenger.g0.L(16.0f);
            TextPaint textPaint = this.w;
            textPaint.setTextSize(L);
            this.M = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i7 = k6.ig;
        f6 f6Var = this.r;
        this.s.setColor(k6.w0(i7, f6Var));
        j0 j0Var = this.U;
        if (j0Var != null) {
            j0Var.a();
        }
        try {
            if (this.V && (radialProgress2 = this.x) != null) {
                radialProgress2.d = k6.w0(k6.pe, f6Var);
            }
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(k6.w0(k6.d6, f6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
