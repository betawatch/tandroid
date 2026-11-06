package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.ce;
import bi.hc;
import bi.ra;
import c8.ha;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e61;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class u0 extends FrameLayout implements ls {
    public boolean D;
    public z E;
    public int F;
    public boolean G;
    public long H;
    public final h6.m I;
    public boolean J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public TLRPC.InputGroupCall O;
    public g1 P;
    public long Q;
    public long R;
    public boolean S;
    public ArrayList T;
    public boolean U;
    public final a0 V;
    public cc W;
    public final View a;
    public wb a0;
    public final FrameLayout b;
    public ac b0;
    public final bi.q1 c;
    public vb c0;
    public final v4.b0 d;
    public final a0 d0;
    public final hc e;
    public ValueAnimator e0;
    public final e61 f;
    public boolean f0;
    public final a0 g0;
    public final v4.b0 h;
    public final f41 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap w;
    public long x;
    public int y;

    public u0(Context context, p9 p9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new HashMap();
        this.F = -1;
        final int i7 = 1;
        this.G = true;
        this.I = new h6.m(28);
        int i10 = p10.s0;
        this.N = i10;
        this.T = new ArrayList();
        final g2 g2Var = (g2) this;
        final int i11 = 0;
        this.V = new a0(g2Var, i11);
        this.d0 = new a0(g2Var, i7);
        this.f0 = false;
        this.g0 = new a0(g2Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        bi.q1 q1Var = new bi.q1(i7, context, g2Var);
        this.c = q1Var;
        q1Var.setWillNotDraw(false);
        v4.b0 b0Var = new v4.b0(1, true);
        this.d = b0Var;
        q1Var.setLayoutManager(b0Var);
        hc hcVar = new hc(g2Var, q1Var, context, i10, new v10() { // from class: di.e0
            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                g2 g2Var2 = g2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = g2Var2.r;
                        g1 g1Var = g2Var2.P;
                        long j3 = g1Var == null ? 0L : g1Var.j();
                        g2Var2.H = j3;
                        while (i13 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i13);
                            if (s0Var.b || !s0Var.e || s0Var.g >= j3) {
                                int i14 = m0.b;
                                r31 K = r31.K(m0.class);
                                K.G = s0Var;
                                arrayList.add(K);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = g2Var2.s;
                        while (i13 < arrayList3.size()) {
                            t0 t0Var = (t0) arrayList3.get(i13);
                            int i15 = q0.b;
                            r31 K2 = r31.K(q0.class);
                            K2.G = t0Var;
                            arrayList.add(K2);
                            i13++;
                        }
                        break;
                }
            }
        }, new b(), 1);
        this.e = hcVar;
        q1Var.setAdapter(hcVar);
        hcVar.r = false;
        q1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
        q1Var.setClipToPadding(false);
        addView(q1Var, ha.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        q1Var.setOnItemClickListener(new f0(g2Var, viewGroup, p9Var, i11));
        g0 g0Var = new g0(g2Var);
        g0Var.m = false;
        g0Var.C = false;
        xq xqVar = xq.h;
        g0Var.o(xqVar);
        g0Var.n(280L);
        g0Var.D = 14L;
        q1Var.setItemAnimator(g0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new ah.d(g2Var, 14));
        e61 e61Var = new e61(i7, context, null);
        this.f = e61Var;
        e61Var.setWillNotDraw(false);
        v4.b0 b0Var2 = new v4.b0(0, false);
        this.h = b0Var2;
        e61Var.setLayoutManager(b0Var2);
        f41 f41Var = new f41(e61Var, context, i10, 0, false, new v10() { // from class: di.e0
            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                int i12 = i7;
                int i13 = 0;
                g2 g2Var2 = g2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = g2Var2.r;
                        g1 g1Var = g2Var2.P;
                        long j3 = g1Var == null ? 0L : g1Var.j();
                        g2Var2.H = j3;
                        while (i13 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i13);
                            if (s0Var.b || !s0Var.e || s0Var.g >= j3) {
                                int i14 = m0.b;
                                r31 K = r31.K(m0.class);
                                K.G = s0Var;
                                arrayList.add(K);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = g2Var2.s;
                        while (i13 < arrayList3.size()) {
                            t0 t0Var = (t0) arrayList3.get(i13);
                            int i15 = q0.b;
                            r31 K2 = r31.K(q0.class);
                            K2.G = t0Var;
                            arrayList.add(K2);
                            i13++;
                        }
                        break;
                }
            }
        }, null);
        this.n = f41Var;
        e61Var.setAdapter(f41Var);
        f41Var.r = false;
        e61Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        e61Var.setClipToPadding(false);
        addView(e61Var, ha.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        e61Var.setOnItemClickListener(new a1.c(g2Var, 29));
        h0 h0Var = new h0();
        h0Var.m = false;
        h0Var.C = false;
        h0Var.o(xqVar);
        h0Var.n(350L);
        e61Var.setItemAnimator(h0Var);
        u(false);
    }

    public static Integer a(u0 u0Var, Long l10) {
        u0Var.d0.run();
        u0Var.R = l10.longValue();
        cc I = new org.telegram.ui.Components.hc(u0Var.b, new b()).I(R.raw.stars_topup, u0Var.getStarsToastTitle(), u0Var.getStarsToastSubtitle());
        boolean z9 = false;
        I.r = false;
        I.k(true);
        u0Var.R = 0L;
        u0Var.S = true;
        int o4 = u0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        g1 g1Var = u0Var.P;
        long j3 = g1Var != null ? g1Var.j() : 0L;
        if (u0Var.getDefaultPeerId() == u0Var.M && u0Var.f()) {
            z9 = true;
        }
        return (l10.longValue() >= j3 || z9) ? Integer.valueOf(o4) : Integer.valueOf(TLObject.FLAG_31);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        g1 g1Var = this.P;
        if (g1Var != null && g1Var.l()) {
            if (this.P.w == null ? false : !r1.messages_enabled) {
                return this.M;
            }
        }
        return defaultSendAs == null ? p10.i(this.N).e() : org.telegram.messenger.m5.o(defaultSendAs);
    }

    private int getListViewTop() {
        bi.q1 q1Var = this.c;
        int height = q1Var.getHeight();
        for (int i7 = 0; i7 < q1Var.getChildCount(); i7++) {
            height = Math.min(q1Var.getChildAt(i7).getTop(), height);
        }
        return q1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return org.telegram.messenger.g0.X2(hd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.R)));
    }

    private String getStarsToastTitle() {
        return hd.M0(2131745026, null);
    }

    private int getTotalMyStars() {
        int i7 = (int) (0 + this.R);
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            if (((TL_phone.groupCallDonor) this.T.get(i10)).my) {
                i7 = (int) (i7 + ((TL_phone.groupCallDonor) this.T.get(i10)).stars);
            }
        }
        return i7;
    }

    public final void b() {
        this.R = 0L;
        h(getDefaultPeerId());
        r1 r1Var = ((g2) this).i0.I1;
        q1 q1Var = r1Var.a;
        q1Var.c(r1Var);
        q1Var.b();
        j();
    }

    public final void c(int i7) {
        ArrayList arrayList;
        s0 s0Var;
        ArrayList arrayList2;
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            arrayList = this.r;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                s0Var = null;
                break;
            } else {
                if (((s0) arrayList.get(i10)).a == i7) {
                    s0Var = (s0) arrayList.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (s0Var == null) {
            return;
        }
        if (s0Var.a < 0 && s0Var.e) {
            long j3 = s0Var.g;
            if (j3 > 0) {
                this.Q -= j3;
                j();
            }
        }
        int i11 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i11 >= arrayList2.size()) {
                break;
            }
            if (((t0) arrayList2.get(i11)).f.contains(s0Var)) {
                ((t0) arrayList2.get(i11)).f.remove(s0Var);
                if (((t0) arrayList2.get(i11)).f.isEmpty()) {
                    arrayList2.remove(i11);
                    z9 = true;
                } else {
                    ((t0) arrayList2.get(i11)).c();
                    m();
                }
            } else {
                i11++;
            }
        }
        arrayList.remove(i10);
        this.e.O(true);
        if (z9) {
            ConnectionsManager.getInstance(this.N).getCurrentTime();
            Collections.sort(arrayList2, new a3.c(this, 20));
            this.n.O(true);
            t();
            u(true);
        }
    }

    public final n0 d(int i7) {
        n0 n0Var;
        s0 s0Var;
        int i10 = 0;
        while (true) {
            bi.q1 q1Var = this.c;
            if (i10 >= q1Var.getChildCount()) {
                return null;
            }
            View childAt = q1Var.getChildAt(i10);
            if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).K) != null && s0Var.a == i7) {
                return n0Var;
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.H2) {
            int i11 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (!(tLObject instanceof TL_update.TL_updateGroupCallMessage)) {
                if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                    TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                    TLRPC.InputGroupCall inputGroupCall = this.O;
                    if (inputGroupCall == null || inputGroupCall.id != longValue) {
                        return;
                    }
                    ArrayList<Integer> arrayList = tL_updateDeleteGroupCallMessages.messages;
                    int size = arrayList.size();
                    while (i11 < size) {
                        Integer num = arrayList.get(i11);
                        i11++;
                        c(num.intValue());
                    }
                    return;
                }
                return;
            }
            TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
            TLRPC.InputGroupCall inputGroupCall2 = this.O;
            if (inputGroupCall2 != null && inputGroupCall2.id == longValue) {
                TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                int i12 = groupCallMessage.date;
                int i13 = groupCallMessage.id;
                boolean z9 = groupCallMessage.from_admin;
                long o4 = org.telegram.messenger.m5.o(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                l(i12, i13, z9, o4, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.G) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        bi.q1 q1Var = this.c;
        if (view != q1Var) {
            return super.drawChild(canvas, view, j3);
        }
        if (q1Var.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.K - q1Var.getTop()) + q1Var.getY();
        canvas.saveLayerAlpha(q1Var.getX(), q1Var.getY(), q1Var.getX() + q1Var.getWidth(), q1Var.getY() + q1Var.getHeight(), qs.e4, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((q1Var.getY() + q1Var.getHeight()) - max, getListViewTop()) * (1.0f - q1Var.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, max, getWidth(), org.telegram.messenger.g0.L(12.0f) + max);
        h6.m mVar = this.I;
        mVar.m(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (q1Var.getY() + q1Var.getHeight()) - org.telegram.messenger.g0.L(12.0f), getWidth(), q1Var.getHeight() + q1Var.getBottom());
        mVar.m(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return drawChild;
    }

    public final int e(long j3) {
        return ((Integer) Map.-EL.getOrDefault(this.w, Long.valueOf(j3), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.M) {
            return false;
        }
        long j3 = this.M;
        int i7 = this.N;
        if (j3 >= 0) {
            return j3 == p10.i(i7).e();
        }
        g1 g1Var = this.P;
        if (g1Var == null || (inputGroupCall = this.O) == null || inputGroupCall.id != g1Var.g() || (groupCall = this.P.w) == null || !groupCall.creator) {
            return org.telegram.messenger.t3.w(14, qp.s1(i7).M0(Long.valueOf(-this.M)));
        }
        return true;
    }

    public final boolean g() {
        return this.f0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        bi.q1 q1Var = this.c;
        int height = q1Var.getHeight();
        for (int i7 = 0; i7 < q1Var.getChildCount(); i7++) {
            height = Math.min(q1Var.getChildAt(i7).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.r.size();
    }

    public long getStarsCount() {
        return this.Q + this.R;
    }

    public int getUnreadMessagesCount() {
        int i7 = 0;
        if (this.F < 0) {
            return 0;
        }
        g1 g1Var = this.P;
        long j3 = g1Var == null ? 0L : g1Var.j();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i7 >= arrayList.size()) {
                return i10;
            }
            s0 s0Var = (s0) arrayList.get(i7);
            int i11 = s0Var.a;
            if (i11 >= 0 && i11 > this.F && (s0Var.b || !s0Var.e || s0Var.g >= j3)) {
                i10++;
            }
            i7++;
        }
    }

    public abstract void h(long j3);

    public abstract void i(int i7, int i10, long j3);

    public abstract void j();

    public final void k(boolean z9) {
        this.d0.run();
        ArrayList arrayList = new ArrayList();
        if (this.T != null) {
            for (int i7 = 0; i7 < this.T.size(); i7++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i7);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long e10 = p10.i(this.N).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e10 = org.telegram.messenger.m5.o(defaultSendAs);
        }
        i0 i0Var = new i0(0);
        ce ceVar = new ce(getContext(), this.N, this.M, null, null, arrayList, !z9, true, e10, i0Var);
        g2 g2Var = (g2) this;
        ceVar.G1 = g2Var;
        ceVar.I1 = new a1.c(g2Var, 28);
        ceVar.show();
    }

    public final void l(int i7, int i10, boolean z9, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z10) {
        long j11;
        int i11;
        TL_phone.groupCallDonor groupcalldonor;
        t0 t0Var;
        boolean z11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i12 >= arrayList.size()) {
                int i13 = this.N;
                int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                s0 s0Var = new s0();
                s0Var.d = i7;
                s0Var.b = z9;
                s0Var.c = j3;
                s0Var.f = tL_textWithEntities;
                s0Var.g = j10;
                s0Var.a = i10;
                s0Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = t.b(i13, (int) s0Var.g, 0);
                long j12 = s0Var.g;
                long j13 = 0;
                ArrayList arrayList2 = this.s;
                if (j12 <= 0 || b10 <= 0 || currentTime - s0Var.d > b10) {
                    j11 = 0;
                } else {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            j11 = j13;
                            t0Var = null;
                            break;
                        }
                        j11 = j13;
                        if (((t0) arrayList2.get(i14)).b == j3) {
                            t0Var = (t0) arrayList2.get(i14);
                            break;
                        } else {
                            i14++;
                            j13 = j11;
                        }
                    }
                    if (t0Var == null) {
                        t0Var = new t0();
                        ArrayList arrayList3 = new ArrayList();
                        t0Var.f = arrayList3;
                        t0Var.a = i13;
                        t0Var.b = j3;
                        arrayList3.add(s0Var);
                        arrayList2.add(0, t0Var);
                        z11 = true;
                    } else {
                        t0Var.f.add(s0Var);
                        this.f.g1();
                        z11 = false;
                    }
                    t0Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a3.c(this, 20));
                    if (!z10) {
                        this.n.O(true);
                    }
                    if (z11) {
                        this.h.n0(0);
                    }
                }
                if (!z10 && s0Var.e) {
                    long j14 = s0Var.g;
                    if (j14 > j11) {
                        this.Q += j14;
                        j();
                    }
                }
                if (s0Var.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (s0Var.a < ((s0) arrayList.get(size)).a) {
                            i11 = size + 1;
                            break;
                        }
                    }
                }
                i11 = 0;
                arrayList.add(i11, s0Var);
                if (!z10) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.O(true);
                }
                if (i11 <= 0 && !z10 && (!this.c.canScrollVertically(1) || s0Var.a < 0)) {
                    this.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                    int i15 = s0Var.a;
                    if (i15 > 0) {
                        this.F = i15;
                    }
                }
                invalidate();
                g2 g2Var = (g2) this;
                a aVar = g2Var.i0.G1;
                if (aVar != null) {
                    aVar.setCount(g2Var.getUnreadMessagesCount());
                }
                if (!z10 && i10 > 0 && s0Var.g > j11) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= this.T.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (org.telegram.messenger.m5.o(((TL_phone.groupCallDonor) this.T.get(i16)).peer_id) == s0Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i16);
                                break;
                            }
                            i16++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = p10.i(i13).e() == s0Var.c;
                        groupcalldonor.peer_id = qp.s1(i13).z1(s0Var.c);
                        groupcalldonor.stars = j11;
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            if (((t0) arrayList2.get(i17)).b == s0Var.c) {
                                ((t0) arrayList2.get(i17)).b();
                                groupcalldonor.stars += ((t0) arrayList2.get(i17)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j15 = groupcalldonor.stars;
                    long j16 = s0Var.g;
                    long j17 = j15 + j16;
                    groupcalldonor.stars = j17;
                    i((int) j17, (int) j16, s0Var.c);
                }
                t();
                if (z10) {
                    a0 a0Var = this.g0;
                    org.telegram.messenger.g0.r(a0Var);
                    org.telegram.messenger.g0.i3(a0Var, 100L);
                }
                g1 g1Var = this.P;
                if (g1Var != null) {
                    g1Var.U = arrayList;
                    g1Var.V = arrayList2;
                    return;
                }
                return;
            }
            if (((s0) arrayList.get(i12)).a == i10) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void m() {
        int i7;
        z zVar = this.E;
        if (zVar != null) {
            org.telegram.messenger.g0.r(zVar);
            this.E = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i10 = 0;
        long j3 = Long.MAX_VALUE;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t0 t0Var = (t0) obj;
            ArrayList arrayList2 = t0Var.f;
            int size2 = arrayList2.size();
            int i11 = currentTime;
            int i12 = 0;
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                s0 s0Var = (s0) obj2;
                int i14 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (s0Var.g > 0) {
                    i11 = Math.min(i11, s0Var.d);
                    i7 = i14;
                    i12 = Math.max(i12, t.b(t0Var.a, (int) s0Var.g, 0) + s0Var.d);
                } else {
                    i7 = i14;
                }
                arrayList = arrayList3;
                currentTime = i7;
            }
            j3 = Math.min(j3, Math.max(0, i12 - r19) * 1000);
            arrayList = arrayList;
            currentTime = currentTime;
        }
        if (j3 >= Long.MAX_VALUE) {
            return;
        }
        z zVar2 = new z(this, 1);
        this.E = zVar2;
        org.telegram.messenger.g0.i3(zVar2, j3);
    }

    public final int n(final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j10) {
        int i7;
        boolean z9;
        TL_phone.groupCallDonor groupcalldonor;
        int i10 = this.N;
        final int j11 = p10.i(i10).j();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.O;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j10 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j10;
        }
        sendgroupcallmessage.random_id = Utilities.b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = qp.s1(i10).j1(j3);
        ConnectionsManager.getInstance(p10.s0).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: di.y
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z10 = tLObject instanceof TLRPC.Updates;
                u0 u0Var = u0.this;
                int i11 = j11;
                if (!z10) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new ra(u0Var, i11, tL_error, j10, j3, tL_textWithEntities));
                        return;
                    }
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList z02 = qp.z0(updates, TL_update.TL_updateMessageID.class);
                int size = z02.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = z02.get(i12);
                    i12++;
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                    if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                        int i13 = tL_updateMessageID.id;
                        ArrayList arrayList = u0Var.r;
                        int size2 = arrayList.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size2) {
                                Object obj2 = arrayList.get(i14);
                                i14++;
                                s0 s0Var = (s0) obj2;
                                if (s0Var.a == i11) {
                                    s0Var.a = i13;
                                    break;
                                }
                            }
                        }
                    }
                }
                qp.s1(u0Var.N).O3(updates, false);
            }
        });
        if (this.T != null && j10 > 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.T.size()) {
                    groupcalldonor = null;
                    break;
                }
                if (((TL_phone.groupCallDonor) this.T.get(i11)).my) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i11);
                    break;
                }
                i11++;
            }
            if (groupcalldonor != null) {
                groupcalldonor.stars += j10;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = qp.s1(i10).z1(j3);
                groupcalldonor2.stars = j10;
                this.T.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(p10.s0).getCurrentTime();
        if (j3 == this.M || f()) {
            i7 = j11;
            z9 = true;
        } else {
            i7 = j11;
            z9 = false;
        }
        l(currentTime, i7, z9, j3, tL_textWithEntities, j10, false);
        int i12 = i7;
        q(false, true);
        return i12;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j3) {
        return n(getDefaultPeerId(), tL_textWithEntities, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.O != null) {
            a0 a0Var = this.V;
            org.telegram.messenger.g0.r(a0Var);
            org.telegram.messenger.g0.h3(a0Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.O != null) {
            org.telegram.messenger.g0.r(this.V);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p() {
        cc ccVar = this.W;
        a0 a0Var = this.d0;
        int i7 = 0;
        if (ccVar == null || !ccVar.l) {
            b bVar = new b();
            wb wbVar = new wb(getContext(), bVar);
            this.a0 = wbVar;
            wbVar.c(R.raw.stars_topup, new String[0]);
            this.a0.b.setText(getStarsToastTitle());
            ac acVar = new ac(getContext(), bVar, true, false);
            this.b0 = acVar;
            acVar.e(hd.M0(2131745024, null));
            this.b0.b = new z((g2) this, i7);
            vb vbVar = new vb(getContext(), bVar);
            this.c0 = vbVar;
            vbVar.b = 5000L;
            vbVar.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, bVar));
            this.b0.addView(this.c0, ha.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.b0.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
            this.a0.setButton(this.b0);
            cc f10 = cc.f(this.b, this.a0, -1);
            this.W = f10;
            f10.r = false;
            f10.k(true);
            this.W.v = a0Var;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.a0.b.setText(getStarsToastTitle());
        this.a0.c.setText(getStarsToastSubtitle());
        this.c0.b = 5000L;
        org.telegram.messenger.g0.r(a0Var);
        org.telegram.messenger.g0.i3(a0Var, 5000L);
        long j3 = this.R;
        r1 r1Var = ((g2) this).i0.I1;
        q1 q1Var = r1Var.a;
        q1Var.c(r1Var);
        if (q1Var.s) {
            q1Var.s = false;
            q1Var.a(1.0f, null);
        }
        ArrayList arrayList = q1Var.e;
        while (arrayList.size() > 4) {
            ((zg0) arrayList.remove(0)).C(true);
        }
        int[] iArr = q1Var.f;
        zg0 zg0Var = new zg0(iArr[Utilities.c.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        zg0Var.R(q1Var);
        zg0Var.J(true);
        zg0Var.K(0);
        zg0Var.start();
        arrayList.add(zg0Var);
        q1Var.invalidate();
        org.telegram.ui.Components.i6 i6Var = q1Var.c;
        i6Var.a();
        i6Var.t(jg.g.m(j3, ',', new StringBuilder("+")), true, true);
        o1 o1Var = q1Var.d;
        org.telegram.messenger.g0.r(o1Var);
        org.telegram.messenger.g0.i3(o1Var, 1500L);
        r1Var.getLocationInWindow(r1Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - r1Var.D < 100) {
            r1Var.E += 0.5f;
        } else {
            r1Var.E = Utilities.i(1.0f - ((r9 - 100) / 200.0f), 1.0f, 0.0f) * r1Var.E;
            LaunchActivity.b0((r1Var.getWidth() / 2.0f) + r0[0], (r1Var.getHeight() / 2.0f) + r0[1], Utilities.i(r1Var.E, 0.9f, 0.3f));
            r1Var.E = 0.0f;
            r1Var.D = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z9, boolean z10);

    public final boolean r(long j3, TLRPC.InputGroupCall inputGroupCall) {
        boolean z9;
        TLRPC.InputGroupCall inputGroupCall2 = this.O;
        if ((inputGroupCall2 == null ? 0L : inputGroupCall2.id) != (inputGroupCall != null ? inputGroupCall.id : 0L)) {
            this.r.clear();
            z9 = true;
            this.e.O(true);
        } else {
            z9 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.O;
        int i7 = qs.H2;
        int i10 = this.N;
        if (inputGroupCall3 != null) {
            qs.f(i10).n(this, i7);
        }
        this.M = j3;
        this.O = inputGroupCall;
        if (inputGroupCall != null) {
            qs.f(i10).c(this, i7);
        }
        if (z9) {
            this.d0.run();
            a0 a0Var = this.V;
            if (inputGroupCall == null) {
                org.telegram.messenger.g0.r(a0Var);
                return z9;
            }
            a0Var.run();
        }
        return z9;
    }

    public final float s() {
        return Math.max(Math.max(0.0f, this.K - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public void setAllowTouches(boolean z9) {
        this.G = z9;
    }

    public void setLivePlayer(g1 g1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z9 = this.P == null;
        this.P = g1Var;
        if (!z9 || g1Var == null || (arrayList = g1Var.U) == null || (arrayList2 = g1Var.V) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(g1Var.U);
        arrayList4.addAll(g1Var.V);
        this.e.O(true);
        ConnectionsManager.getInstance(this.N).getCurrentTime();
        Collections.sort(arrayList4, new a3.c(this, 20));
        this.n.O(true);
        u(false);
    }

    public final void t() {
        r0 r0Var;
        t0 t0Var;
        n0 n0Var;
        s0 s0Var;
        HashMap hashMap = this.w;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a3.c(21));
        int size = arrayList.size();
        int i7 = 0;
        int i10 = TLObject.FLAG_31;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) obj;
            int i13 = (int) groupcalldonor.stars;
            if (i13 != i10) {
                i11++;
                i10 = i13;
            }
            if (i11 > 3) {
                break;
            } else {
                hashMap.put(Long.valueOf(org.telegram.messenger.m5.o(groupcalldonor.peer_id)), Integer.valueOf(i11));
            }
        }
        int i14 = 0;
        while (true) {
            bi.q1 q1Var = this.c;
            if (i14 >= q1Var.getChildCount()) {
                break;
            }
            View childAt = q1Var.getChildAt(i14);
            if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).K) != null) {
                int e10 = e(s0Var.c);
                s0 s0Var2 = n0Var.K;
                if (e10 != s0Var2.h) {
                    s0Var2.h = e10;
                    n0Var.set(s0Var2);
                }
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList3 = this.r;
            if (i15 >= arrayList3.size()) {
                break;
            }
            s0 s0Var3 = (s0) arrayList3.get(i15);
            int e11 = e(s0Var3.c);
            if (e11 != s0Var3.h) {
                s0Var3.h = e11;
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            e61 e61Var = this.f;
            if (i16 >= e61Var.getChildCount()) {
                break;
            }
            View childAt2 = e61Var.getChildAt(i16);
            if ((childAt2 instanceof r0) && (t0Var = (r0Var = (r0) childAt2).f) != null) {
                int e12 = e(t0Var.b);
                t0 t0Var2 = r0Var.f;
                if (e12 != t0Var2.e) {
                    t0Var2.e = e12;
                    r0Var.set(t0Var2);
                }
            }
            i16++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i7 >= arrayList4.size()) {
                return;
            }
            t0 t0Var3 = (t0) arrayList4.get(i7);
            int e13 = e(t0Var3.b);
            if (e13 != t0Var3.e) {
                t0Var3.e = e13;
            }
            i7++;
        }
    }

    public final void u(boolean z9) {
        ArrayList arrayList = this.s;
        if (z9 && this.J == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.J = !isEmpty;
        bi.q1 q1Var = this.c;
        e61 e61Var = this.f;
        if (z9) {
            ViewPropertyAnimator translationY = q1Var.animate().translationY(this.J ? 0.0f : org.telegram.messenger.g0.L(35.0f));
            xq xqVar = xq.h;
            translationY.setInterpolator(xqVar).setUpdateListener(new ah.h(this, 13)).setDuration(420L).start();
            e61Var.animate().translationY(this.J ? 0.0f : org.telegram.messenger.g0.L(35.0f)).alpha(this.J ? 1.0f : 0.0f).setInterpolator(xqVar).setDuration(420L).start();
            return;
        }
        q1Var.setTranslationY(!isEmpty ? 0.0f : org.telegram.messenger.g0.L(35.0f));
        e61Var.setTranslationY(this.J ? 0.0f : org.telegram.messenger.g0.L(35.0f));
        e61Var.setAlpha(this.J ? 1.0f : 0.0f);
        invalidate();
    }
}
