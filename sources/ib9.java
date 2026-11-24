// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ib9 extends jb9 implements tjb, eib, tb9, gk7, sp3 {
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
    public se9 P;
    public k27 Q;
    public TLRPC.Document R;
    public byte S;
    public boolean T;
    public boolean U;
    public final sb9 V;
    public boolean W;
    public final int n;
    public final wjb r;
    public final Paint s;
    public final TextPaint w;
    public final RadialProgress2 x;
    public final xu9 y;

    public ib9(int i, wjb wjbVar, Context context) {
        super(context);
        this.s = new Paint(1);
        this.w = new TextPaint(1);
        this.F = gl.L(16.0f);
        int L = gl.L(10.0f);
        this.G = L;
        int L2 = gl.L(44.0f);
        this.H = L2;
        this.n = i;
        this.r = wjbVar;
        setWillNotDraw(false);
        this.E = up3.q(i).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, wjbVar);
        this.x = radialProgress2;
        radialProgress2.setCircleRadius(gl.L(24.0f));
        int i2 = this.F;
        radialProgress2.p(i2, L, i2 + L2, L2 + L);
        xu9 xu9Var = new xu9(this);
        this.y = xu9Var;
        xu9Var.h = new u39(this, (byte) 3);
        setMinimumHeight(gl.L(66.0f));
        sb9 sb9Var = new sb9(context, wjbVar, new ln8(this, (byte) 6));
        this.V = sb9Var;
        addView(sb9Var.a, nme.e(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        iy6 iy6Var;
        lk0 lk0Var = this.a;
        if (lk0Var == null || (iy6Var = lk0Var.g) == null) {
            return null;
        }
        TLRPC.Document document = iy6Var.h;
        return document != null ? document : iy6Var.i;
    }

    private int getIconForCurrentState() {
        if (!m()) {
            byte b = this.S;
            if (b == 1) {
                return 1;
            }
            if (b == 2) {
                return 2;
            }
            if (b != 3) {
                return 0;
            }
        }
        return 3;
    }

    @Override // sp3
    public final void B(boolean z) {
        o(true);
    }

    @Override // sp3
    public final void N(String str) {
        this.x.o(true, 1.0f);
        o(true);
    }

    @Override // tb9
    public final boolean a(int i, int i2) {
        return this.V.f(i, i2);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.kg));
    }

    @Override // tb9
    public final void b() {
        this.V.i();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k27 k27Var;
        k27 k27Var2 = this.Q;
        if (k27Var2 == null || i2 != this.n) {
            return;
        }
        if (i == kk7.g2 || i == kk7.e2 || i == kk7.f2) {
            o(true);
            return;
        }
        if (i == kk7.d2) {
            if (k27Var2.e1() != ((Integer) objArr[0]).intValue() || (k27Var = MediaController.w().v0) == null) {
                return;
            }
            k27 k27Var3 = this.Q;
            k27Var3.b0 = k27Var.b0;
            k27Var3.i0 = k27Var.i0;
            k27Var3.j0 = k27Var.j0;
            p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.V.c(canvas);
    }

    @Override // jb9
    public final void e(int i) {
        int L = gl.L(16.0f);
        if (this.I) {
            i = 0;
        }
        int i2 = L + i;
        this.F = i2;
        int i3 = this.H;
        int i4 = this.G;
        this.x.p(i2, i4, i2 + i3, i3 + i4);
        requestLayout();
        invalidate();
    }

    public final TLRPC.TL_documentAttributeAudio g() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i = 0; i < displayDocument.attributes.size(); i++) {
            if (displayDocument.attributes.get(i) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i);
            }
        }
        return null;
    }

    @Override // tb9
    public mc9 getCaptionEditText() {
        return this.V.a;
    }

    @Override // sp3
    public int getObserverTag() {
        return this.E;
    }

    @Override // tb9
    public lk0 getRow() {
        return this.a;
    }

    public final void h(lk0 lk0Var, se9 se9Var) {
        iy6 iy6Var;
        this.a = lk0Var;
        this.P = se9Var;
        if (lk0Var != null && lk0Var.g == null) {
            lk0Var.g = new iy6();
        }
        this.I = k96.a0;
        c(lk0Var);
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
            int i = this.n;
            long e = y6c.h(i).e();
            peer.user_id = e;
            tL_peerUser.user_id = e;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            lk0 lk0Var2 = this.a;
            if (lk0Var2 != null && (iy6Var = lk0Var2.g) != null && !TextUtils.isEmpty(iy6Var.e)) {
                tL_message.attachPath = this.a.g.e;
            }
            this.Q = new k27(i, tL_message, false, true);
        }
        n();
        if (this.U) {
            o(false);
        }
        requestLayout();
        invalidate();
    }

    @Override // sp3
    public final void i(long j, long j2) {
        this.x.o(true, Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2));
        if (this.S != 3) {
            o(true);
        }
    }

    public final boolean j() {
        iy6 iy6Var;
        lk0 lk0Var = this.a;
        return (lk0Var == null || (iy6Var = lk0Var.g) == null || !iy6Var.b()) ? false : true;
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        this.V.e(arrayList);
    }

    public final boolean m() {
        iy6 iy6Var;
        lk0 lk0Var = this.a;
        return (lk0Var == null || (iy6Var = lk0Var.g) == null || !iy6Var.a()) ? false : true;
    }

    public final void n() {
        int L = gl.L(50.0f) + this.F;
        int i = this.H;
        this.J = L + i;
        this.L = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : gl.q.x) - this.J) - gl.L(16.0f)) - (this.I ? this.c : 0));
        k27 k27Var = this.Q;
        String w1 = k27Var != null ? k27Var.w1(false) : g() != null ? g().performer : null;
        k27 k27Var2 = this.Q;
        String y1 = k27Var2 != null ? k27Var2.y1(false) : g() != null ? g().title : null;
        boolean isEmpty = TextUtils.isEmpty(y1);
        int i2 = this.G;
        if (isEmpty && TextUtils.isEmpty(w1)) {
            this.M = null;
            this.K = ((i - gl.L(30.0f)) / 2) + i2;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(y1) || TextUtils.isEmpty(w1)) ? !TextUtils.isEmpty(y1) ? new SpannableStringBuilder(y1) : new SpannableStringBuilder(w1) : new SpannableStringBuilder(tb4.p(w1, " - ", y1));
            if (!TextUtils.isEmpty(w1)) {
                spannableStringBuilder.setSpan(new z3c(gl.o()), 0, w1.length(), 18);
            }
            float L2 = gl.L(16.0f);
            TextPaint textPaint = this.w;
            textPaint.setTextSize(L2);
            this.M = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.L, TextUtils.TruncateAt.END), textPaint, gl.L(50.0f) + this.L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.K = gl.L(11.0f) + ((i - gl.L(30.0f)) / 2) + i2;
        }
        this.y.h(this.L, gl.L(30.0f));
    }

    public final void o(boolean z) {
        File J;
        iy6 iy6Var;
        int i = bkb.Ye;
        int i2 = bkb.Ze;
        int i3 = bkb.kd;
        int i4 = bkb.ld;
        RadialProgress2 radialProgress2 = this.x;
        radialProgress2.g(i, i2, i3, i4);
        radialProgress2.d = bkb.v0(bkb.re, this.r);
        this.W = true;
        boolean m = m();
        int i5 = this.n;
        if (m) {
            up3.q(i5).v(this);
            radialProgress2.o(z, this.a.g.f);
            radialProgress2.setIcon(3, false, z);
            p();
            return;
        }
        TLRPC.Document document = j() ? this.a.g.h : null;
        String r = ba4.r(null, document);
        lk0 lk0Var = this.a;
        boolean z2 = (lk0Var == null || (iy6Var = lk0Var.g) == null || TextUtils.isEmpty(iy6Var.e) || !new File(this.a.g.e).exists()) ? false : true;
        if (document == null) {
            J = null;
        } else {
            ba4.G(i5);
            J = ba4.J(document, null, true, true);
        }
        boolean z3 = z2 || (J != null && J.exists());
        if (TextUtils.isEmpty(r)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z3) {
            up3.q(i5).v(this);
            this.S = (!MediaController.w().D(this.Q) || MediaController.w().C()) ? (byte) 0 : (byte) 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z);
        } else {
            up3.q(i5).a(r, null, this);
            if (ba4.G(i5).S(r)) {
                this.S = (byte) 3;
                Float s = fl5.z().s(r);
                radialProgress2.o(z, s != null ? s.floatValue() : 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), true, z);
            } else {
                this.S = (byte) 2;
                radialProgress2.o(z, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z);
            }
        }
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U = true;
        this.x.m(this);
        this.y.s = this;
        o(false);
        int i = this.n;
        kk7.f(i).b(this, kk7.g2);
        kk7.f(i).b(this, kk7.e2);
        kk7.f(i).b(this, kk7.f2);
        kk7.f(i).b(this, kk7.d2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U = false;
        int i = this.n;
        up3.q(i).v(this);
        kk7.f(i).n(this, kk7.g2);
        kk7.f(i).n(this, kk7.e2);
        kk7.f(i).n(this, kk7.f2);
        kk7.f(i).n(this, kk7.d2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        fib textSelectionHelper;
        if (getDisplayDocument() != null) {
            this.x.draw(canvas);
            int i = bkb.ke;
            wjb wjbVar = this.r;
            int v0 = bkb.v0(i, wjbVar);
            int v02 = bkb.v0(bkb.le, wjbVar);
            int i2 = bkb.ne;
            int v03 = bkb.v0(i2, wjbVar);
            int v04 = bkb.v0(i2, wjbVar);
            int v05 = bkb.v0(bkb.me, wjbVar);
            xu9 xu9Var = this.y;
            xu9Var.f(v0, v02, v03, v04, v05);
            if (!m()) {
                canvas.save();
                canvas.translate(this.J, this.K);
                xu9Var.b(canvas);
                canvas.restore();
            }
            int v06 = bkb.v0(bkb.de, wjbVar);
            TextPaint textPaint = this.w;
            textPaint.setColor(v06);
            if (this.N != null) {
                canvas.save();
                canvas.translate(gl.L(54.0f) + this.F, gl.L(6.0f) + this.K);
                this.N.draw(canvas);
                canvas.restore();
            }
            if (this.M != null) {
                textPaint.setColor(bkb.v0(bkb.F6, wjbVar));
                canvas.save();
                canvas.translate(gl.L(54.0f) + this.F, this.K - gl.L(16.0f));
                this.M.draw(canvas);
                canvas.restore();
            }
            se9 se9Var = this.P;
            if (se9Var == null || (textSelectionHelper = se9Var.a.getTextSelectionHelper()) == null || !textSelectionHelper.w() || !(getParent() instanceof RecyclerView)) {
                return;
            }
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R < 0 || R <= textSelectionHelper.p0 || R > textSelectionHelper.s0) {
                return;
            }
            canvas.drawRoundRect(gl.L(8.0f) + (this.I ? 0 : this.c), gl.L(2.0f), (getWidth() - (this.I ? this.c : 0)) - gl.L(8.0f), gl.L(64.0f), gl.L(8.0f), gl.L(8.0f), this.s);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.I;
        int i5 = this.c;
        int i6 = 0;
        if (!z2) {
            i6 = i5;
            i5 = 0;
        }
        this.V.g(i6, i5, i3 - i, gl.L(66.0f));
        n();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.I;
        int i3 = this.c;
        int i4 = 0;
        if (!z) {
            i4 = i3;
            i3 = 0;
        }
        setMeasuredDimension(size, gl.L(66.0f) + this.V.h(i4, i3, size));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!m()) {
            if (this.y.e(x - this.J, y - this.K, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            if (x >= this.F) {
                int i = this.H;
                if (x <= r0 + i) {
                    if (y >= this.G && y <= r0 + i) {
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
                if (m()) {
                    se9 se9Var = this.P;
                    if (se9Var != null) {
                        lk0 lk0Var = this.a;
                        ye9 ye9Var = se9Var.a;
                        ArrayList arrayList = ye9Var.t3;
                        bg9 bg9Var = (bg9) ye9Var.h4.remove(lk0Var.g);
                        if (bg9Var != null) {
                            bg9Var.b();
                        }
                        int indexOf = arrayList.indexOf(lk0Var);
                        if (indexOf >= 0) {
                            ld9 ld9Var = ye9Var.R3;
                            if (ld9Var != null) {
                                ld9Var.d();
                            }
                            arrayList.remove(indexOf);
                            ye9Var.g3.O(true);
                            ld9 ld9Var2 = ye9Var.R3;
                            if (ld9Var2 != null) {
                                ld9Var2.h();
                            }
                        }
                        ye9Var.p3.onContentChanged();
                    }
                } else if (this.Q != null) {
                    TLRPC.Document document = j() ? this.a.g.h : null;
                    byte b = this.S;
                    RadialProgress2 radialProgress2 = this.x;
                    if (b == 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(this.Q);
                        if (MediaController.w().n0(arrayList2, this.Q, 0L, false, null, 0L)) {
                            this.S = (byte) 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (b != 1) {
                        int i2 = this.n;
                        if (b == 2) {
                            radialProgress2.o(false, 0.0f);
                            ba4.G(i2).X(document, this.Q, 1, 1);
                            this.S = (byte) 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (b == 3) {
                            ba4.G(i2).f(document);
                            this.S = (byte) 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (MediaController.w().Q(this.Q, true)) {
                        this.S = (byte) 0;
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
        int i;
        k27 k27Var;
        if (!m() && (k27Var = this.Q) != null) {
            xu9 xu9Var = this.y;
            if (!xu9Var.e) {
                xu9Var.g(k27Var.b0);
            }
        }
        if (m()) {
            if (g() != null) {
                d = g().duration;
                i = (int) d;
            }
            i = 0;
        } else if (this.Q == null || !MediaController.w().D(this.Q)) {
            TLRPC.TL_documentAttributeAudio g = g();
            if (g != null) {
                d = g.duration;
                i = (int) d;
            }
            i = 0;
        } else {
            i = this.Q.i0;
        }
        String g0 = gl.g0(i, false, false);
        String str = this.O;
        if (str == null || !str.equals(g0)) {
            this.O = g0;
            float L = gl.L(16.0f);
            TextPaint textPaint = this.w;
            textPaint.setTextSize(L);
            this.N = new StaticLayout(g0, textPaint, (int) Math.ceil(textPaint.measureText(g0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override // tjb
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i = bkb.kg;
        wjb wjbVar = this.r;
        this.s.setColor(bkb.v0(i, wjbVar));
        sb9 sb9Var = this.V;
        if (sb9Var != null) {
            sb9Var.a();
        }
        try {
            if (this.W && (radialProgress2 = this.x) != null) {
                radialProgress2.d = bkb.v0(bkb.re, wjbVar);
            }
            if (getBackground() instanceof ed9) {
                ((ed9) getBackground()).a(bkb.v0(bkb.c6, wjbVar));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }
}
