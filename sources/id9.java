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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class id9 extends jd9 implements vlb, fkb, td9, jm7, cr3 {
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
    public wg9 P;
    public k47 Q;
    public TLRPC.Document R;
    public byte S;
    public boolean T;
    public boolean U;
    public final sd9 V;
    public boolean W;
    public final int n;
    public final ylb r;
    public final Paint s;
    public final TextPaint w;
    public final RadialProgress2 x;
    public final ax9 y;

    public id9(int i, ylb ylbVar, Context context) {
        super(context);
        this.s = new Paint(1);
        this.w = new TextPaint(1);
        this.F = gm.L(16.0f);
        int L = gm.L(10.0f);
        this.G = L;
        int L2 = gm.L(44.0f);
        this.H = L2;
        this.n = i;
        this.r = ylbVar;
        setWillNotDraw(false);
        this.E = er3.q(i).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, ylbVar);
        this.x = radialProgress2;
        radialProgress2.setCircleRadius(gm.L(24.0f));
        int i2 = this.F;
        radialProgress2.p(i2, L, i2 + L2, L2 + L);
        ax9 ax9Var = new ax9(this);
        this.y = ax9Var;
        ax9Var.h = new x59(this, (byte) 3);
        setMinimumHeight(gm.L(66.0f));
        sd9 sd9Var = new sd9(context, ylbVar, new ai4(this, (byte) 29));
        this.V = sd9Var;
        addView(sd9Var.a, qoe.e(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        i07 i07Var;
        ll0 ll0Var = this.a;
        if (ll0Var == null || (i07Var = ll0Var.g) == null) {
            return null;
        }
        TLRPC.Document document = i07Var.h;
        return document != null ? document : i07Var.i;
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

    @Override // cr3
    public final void A(boolean z) {
        o(true);
    }

    @Override // cr3
    public final void N(String str) {
        this.x.o(true, 1.0f);
        o(true);
    }

    @Override // td9
    public final boolean a(int i, int i2) {
        return this.V.f(i, i2);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.kg));
    }

    @Override // td9
    public final void b() {
        this.V.i();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k47 k47Var;
        k47 k47Var2 = this.Q;
        if (k47Var2 == null || i2 != this.n) {
            return;
        }
        if (i == nm7.h2 || i == nm7.f2 || i == nm7.g2) {
            o(true);
            return;
        }
        if (i == nm7.e2) {
            if (k47Var2.e1() != ((Integer) objArr[0]).intValue() || (k47Var = MediaController.w().v0) == null) {
                return;
            }
            k47 k47Var3 = this.Q;
            k47Var3.b0 = k47Var.b0;
            k47Var3.i0 = k47Var.i0;
            k47Var3.j0 = k47Var.j0;
            p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.V.c(canvas);
    }

    @Override // jd9
    public final void e(int i) {
        int L = gm.L(16.0f);
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

    @Override // td9
    public ne9 getCaptionEditText() {
        return this.V.a;
    }

    @Override // cr3
    public int getObserverTag() {
        return this.E;
    }

    @Override // td9
    public ll0 getRow() {
        return this.a;
    }

    public final void h(ll0 ll0Var, wg9 wg9Var) {
        i07 i07Var;
        this.a = ll0Var;
        this.P = wg9Var;
        if (ll0Var != null && ll0Var.g == null) {
            ll0Var.g = new i07();
        }
        this.I = jb6.a0;
        c(ll0Var);
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
            long e = z8c.h(i).e();
            peer.user_id = e;
            tL_peerUser.user_id = e;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            ll0 ll0Var2 = this.a;
            if (ll0Var2 != null && (i07Var = ll0Var2.g) != null && !TextUtils.isEmpty(i07Var.e)) {
                tL_message.attachPath = this.a.g.e;
            }
            this.Q = new k47(i, tL_message, false, true);
        }
        n();
        if (this.U) {
            o(false);
        }
        requestLayout();
        invalidate();
    }

    @Override // cr3
    public final void i(long j, long j2) {
        this.x.o(true, Math.min(1.0f, j2 <= 0 ? 0.0f : j / j2));
        if (this.S != 3) {
            o(true);
        }
    }

    public final boolean j() {
        i07 i07Var;
        ll0 ll0Var = this.a;
        return (ll0Var == null || (i07Var = ll0Var.g) == null || !i07Var.b()) ? false : true;
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        this.V.e(arrayList);
    }

    public final boolean m() {
        i07 i07Var;
        ll0 ll0Var = this.a;
        return (ll0Var == null || (i07Var = ll0Var.g) == null || !i07Var.a()) ? false : true;
    }

    public final void n() {
        int L = gm.L(50.0f) + this.F;
        int i = this.H;
        this.J = L + i;
        this.L = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : gm.q.x) - this.J) - gm.L(16.0f)) - (this.I ? this.c : 0));
        k47 k47Var = this.Q;
        String w1 = k47Var != null ? k47Var.w1(false) : g() != null ? g().performer : null;
        k47 k47Var2 = this.Q;
        String y1 = k47Var2 != null ? k47Var2.y1(false) : g() != null ? g().title : null;
        boolean isEmpty = TextUtils.isEmpty(y1);
        int i2 = this.G;
        if (isEmpty && TextUtils.isEmpty(w1)) {
            this.M = null;
            this.K = ((i - gm.L(30.0f)) / 2) + i2;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(y1) || TextUtils.isEmpty(w1)) ? !TextUtils.isEmpty(y1) ? new SpannableStringBuilder(y1) : new SpannableStringBuilder(w1) : new SpannableStringBuilder(td4.q(w1, " - ", y1));
            if (!TextUtils.isEmpty(w1)) {
                spannableStringBuilder.setSpan(new z5c(gm.o()), 0, w1.length(), 18);
            }
            float L2 = gm.L(16.0f);
            TextPaint textPaint = this.w;
            textPaint.setTextSize(L2);
            this.M = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.L, TextUtils.TruncateAt.END), textPaint, gm.L(50.0f) + this.L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.K = gm.L(11.0f) + ((i - gm.L(30.0f)) / 2) + i2;
        }
        this.y.h(this.L, gm.L(30.0f));
    }

    public final void o(boolean z) {
        File J;
        i07 i07Var;
        int i = cmb.Ye;
        int i2 = cmb.Ze;
        int i3 = cmb.kd;
        int i4 = cmb.ld;
        RadialProgress2 radialProgress2 = this.x;
        radialProgress2.g(i, i2, i3, i4);
        radialProgress2.d = cmb.v0(cmb.re, this.r);
        this.W = true;
        boolean m = m();
        int i5 = this.n;
        if (m) {
            er3.q(i5).v(this);
            radialProgress2.o(z, this.a.g.f);
            radialProgress2.setIcon(3, false, z);
            p();
            return;
        }
        TLRPC.Document document = j() ? this.a.g.h : null;
        String r = bc4.r(null, document);
        ll0 ll0Var = this.a;
        boolean z2 = (ll0Var == null || (i07Var = ll0Var.g) == null || TextUtils.isEmpty(i07Var.e) || !new File(this.a.g.e).exists()) ? false : true;
        if (document == null) {
            J = null;
        } else {
            bc4.G(i5);
            J = bc4.J(document, null, true, true);
        }
        boolean z3 = z2 || (J != null && J.exists());
        if (TextUtils.isEmpty(r)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z3) {
            er3.q(i5).v(this);
            this.S = (!MediaController.w().D(this.Q) || MediaController.w().C()) ? (byte) 0 : (byte) 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z);
        } else {
            er3.q(i5).a(r, null, this);
            if (bc4.G(i5).S(r)) {
                this.S = (byte) 3;
                Float s = fn5.z().s(r);
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
        nm7.f(i).b(this, nm7.h2);
        nm7.f(i).b(this, nm7.f2);
        nm7.f(i).b(this, nm7.g2);
        nm7.f(i).b(this, nm7.e2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U = false;
        int i = this.n;
        er3.q(i).v(this);
        nm7.f(i).n(this, nm7.h2);
        nm7.f(i).n(this, nm7.f2);
        nm7.f(i).n(this, nm7.g2);
        nm7.f(i).n(this, nm7.e2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        gkb textSelectionHelper;
        if (getDisplayDocument() != null) {
            this.x.draw(canvas);
            int i = cmb.ke;
            ylb ylbVar = this.r;
            int v0 = cmb.v0(i, ylbVar);
            int v02 = cmb.v0(cmb.le, ylbVar);
            int i2 = cmb.ne;
            int v03 = cmb.v0(i2, ylbVar);
            int v04 = cmb.v0(i2, ylbVar);
            int v05 = cmb.v0(cmb.me, ylbVar);
            ax9 ax9Var = this.y;
            ax9Var.f(v0, v02, v03, v04, v05);
            if (!m()) {
                canvas.save();
                canvas.translate(this.J, this.K);
                ax9Var.b(canvas);
                canvas.restore();
            }
            int v06 = cmb.v0(cmb.de, ylbVar);
            TextPaint textPaint = this.w;
            textPaint.setColor(v06);
            if (this.N != null) {
                canvas.save();
                canvas.translate(gm.L(54.0f) + this.F, gm.L(6.0f) + this.K);
                this.N.draw(canvas);
                canvas.restore();
            }
            if (this.M != null) {
                textPaint.setColor(cmb.v0(cmb.F6, ylbVar));
                canvas.save();
                canvas.translate(gm.L(54.0f) + this.F, this.K - gm.L(16.0f));
                this.M.draw(canvas);
                canvas.restore();
            }
            wg9 wg9Var = this.P;
            if (wg9Var == null || (textSelectionHelper = wg9Var.a.getTextSelectionHelper()) == null || !textSelectionHelper.w() || !(getParent() instanceof RecyclerView)) {
                return;
            }
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R < 0 || R <= textSelectionHelper.p0 || R > textSelectionHelper.s0) {
                return;
            }
            canvas.drawRoundRect(gm.L(8.0f) + (this.I ? 0 : this.c), gm.L(2.0f), (getWidth() - (this.I ? this.c : 0)) - gm.L(8.0f), gm.L(64.0f), gm.L(8.0f), gm.L(8.0f), this.s);
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
        this.V.g(i6, i5, i3 - i, gm.L(66.0f));
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
        setMeasuredDimension(size, gm.L(66.0f) + this.V.h(i4, i3, size));
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
                    wg9 wg9Var = this.P;
                    if (wg9Var != null) {
                        ll0 ll0Var = this.a;
                        ch9 ch9Var = wg9Var.a;
                        ArrayList arrayList = ch9Var.t3;
                        fi9 fi9Var = (fi9) ch9Var.h4.remove(ll0Var.g);
                        if (fi9Var != null) {
                            fi9Var.b();
                        }
                        int indexOf = arrayList.indexOf(ll0Var);
                        if (indexOf >= 0) {
                            of9 of9Var = ch9Var.R3;
                            if (of9Var != null) {
                                of9Var.d();
                            }
                            arrayList.remove(indexOf);
                            ch9Var.g3.O(true);
                            of9 of9Var2 = ch9Var.R3;
                            if (of9Var2 != null) {
                                of9Var2.h();
                            }
                        }
                        ch9Var.p3.onContentChanged();
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
                            bc4.G(i2).X(document, this.Q, 1, 1);
                            this.S = (byte) 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (b == 3) {
                            bc4.G(i2).f(document);
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
        k47 k47Var;
        if (!m() && (k47Var = this.Q) != null) {
            ax9 ax9Var = this.y;
            if (!ax9Var.e) {
                ax9Var.g(k47Var.b0);
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
        String g0 = gm.g0(i, false, false);
        String str = this.O;
        if (str == null || !str.equals(g0)) {
            this.O = g0;
            float L = gm.L(16.0f);
            TextPaint textPaint = this.w;
            textPaint.setTextSize(L);
            this.N = new StaticLayout(g0, textPaint, (int) Math.ceil(textPaint.measureText(g0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override // vlb
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i = cmb.kg;
        ylb ylbVar = this.r;
        this.s.setColor(cmb.v0(i, ylbVar));
        sd9 sd9Var = this.V;
        if (sd9Var != null) {
            sd9Var.a();
        }
        try {
            if (this.W && (radialProgress2 = this.x) != null) {
                radialProgress2.d = cmb.v0(cmb.re, ylbVar);
            }
            if (getBackground() instanceof gf9) {
                ((gf9) getBackground()).a(cmb.v0(cmb.c6, ylbVar));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // cr3
    public final void l(long j, long j2) {
    }
}
