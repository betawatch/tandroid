package fi;

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
import c8.ja;
import di.jc;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b61;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class u0 extends FrameLayout implements is {
    public boolean E;
    public z F;
    public int G;
    public boolean H;
    public long I;
    public final h6.m J;
    public boolean K;
    public float L;
    public float M;
    public long N;
    public final int O;
    public TLRPC.InputGroupCall P;
    public e1 Q;
    public long R;
    public long S;
    public boolean T;
    public ArrayList U;
    public boolean V;
    public final a0 W;
    public final View a;
    public xb a0;
    public final FrameLayout b;
    public rb b0;
    public final di.c1 c;
    public vb c0;
    public final v4.b0 d;
    public qb d0;
    public final bi.x5 e;
    public final a0 e0;
    public final b61 f;
    public ValueAnimator f0;
    public boolean g0;
    public final v4.b0 h;
    public final a0 h0;
    public final p41 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap w;
    public long x;
    public int y;

    public u0(Context context, i9 i9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new HashMap();
        this.G = -1;
        final int i7 = 1;
        this.H = true;
        this.J = new h6.m(29);
        int i10 = m10.t0;
        this.O = i10;
        this.U = new ArrayList();
        final c2 c2Var = (c2) this;
        final int i11 = 0;
        this.W = new a0(c2Var, i11);
        this.e0 = new a0(c2Var, i7);
        this.g0 = false;
        this.h0 = new a0(c2Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        di.c1 c1Var = new di.c1(i7, context, c2Var);
        this.c = c1Var;
        c1Var.setWillNotDraw(false);
        v4.b0 b0Var = new v4.b0(1, true);
        this.d = b0Var;
        c1Var.setLayoutManager(b0Var);
        bi.x5 x5Var = new bi.x5(c2Var, c1Var, context, i10, new s10() { // from class: fi.e0
            @Override // org.telegram.messenger.s10
            public final void a(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                c2 c2Var2 = c2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = c2Var2.r;
                        e1 e1Var = c2Var2.Q;
                        long j3 = e1Var == null ? 0L : e1Var.j();
                        c2Var2.I = j3;
                        while (i13 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i13);
                            if (s0Var.b || !s0Var.e || s0Var.g >= j3) {
                                int i14 = m0.b;
                                b41 K = b41.K(m0.class);
                                K.G = s0Var;
                                arrayList.add(K);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = c2Var2.s;
                        while (i13 < arrayList3.size()) {
                            t0 t0Var = (t0) arrayList3.get(i13);
                            int i15 = q0.b;
                            b41 K2 = b41.K(q0.class);
                            K2.G = t0Var;
                            arrayList.add(K2);
                            i13++;
                        }
                        break;
                }
            }
        }, new b(), 2);
        this.e = x5Var;
        c1Var.setAdapter(x5Var);
        x5Var.r = false;
        c1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
        c1Var.setClipToPadding(false);
        addView(c1Var, ja.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        c1Var.setOnItemClickListener(new f0(c2Var, viewGroup, i9Var, i11));
        g0 g0Var = new g0(c2Var);
        g0Var.m = false;
        g0Var.C = false;
        er erVar = er.h;
        g0Var.o(erVar);
        g0Var.n(280L);
        g0Var.D = 14L;
        c1Var.setItemAnimator(g0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new ah.d(c2Var, 20));
        b61 b61Var = new b61(i7, context, null);
        this.f = b61Var;
        b61Var.setWillNotDraw(false);
        v4.b0 b0Var2 = new v4.b0(0, false);
        this.h = b0Var2;
        b61Var.setLayoutManager(b0Var2);
        p41 p41Var = new p41(b61Var, context, i10, 0, false, new s10() { // from class: fi.e0
            @Override // org.telegram.messenger.s10
            public final void a(Object obj, Object obj2) {
                int i12 = i7;
                int i13 = 0;
                c2 c2Var2 = c2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = c2Var2.r;
                        e1 e1Var = c2Var2.Q;
                        long j3 = e1Var == null ? 0L : e1Var.j();
                        c2Var2.I = j3;
                        while (i13 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i13);
                            if (s0Var.b || !s0Var.e || s0Var.g >= j3) {
                                int i14 = m0.b;
                                b41 K = b41.K(m0.class);
                                K.G = s0Var;
                                arrayList.add(K);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = c2Var2.s;
                        while (i13 < arrayList3.size()) {
                            t0 t0Var = (t0) arrayList3.get(i13);
                            int i15 = q0.b;
                            b41 K2 = b41.K(q0.class);
                            K2.G = t0Var;
                            arrayList.add(K2);
                            i13++;
                        }
                        break;
                }
            }
        }, null);
        this.n = p41Var;
        b61Var.setAdapter(p41Var);
        p41Var.r = false;
        b61Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        b61Var.setClipToPadding(false);
        addView(b61Var, ja.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        b61Var.setOnItemClickListener(new di.z6(c2Var, 6));
        h0 h0Var = new h0();
        h0Var.m = false;
        h0Var.C = false;
        h0Var.o(erVar);
        h0Var.n(350L);
        b61Var.setItemAnimator(h0Var);
        u(false);
    }

    public static Integer a(u0 u0Var, Long l10) {
        u0Var.e0.run();
        u0Var.S = l10.longValue();
        xb I = new cc(u0Var.b, new b()).I(R.raw.stars_topup, u0Var.getStarsToastTitle(), u0Var.getStarsToastSubtitle());
        boolean z10 = false;
        I.r = false;
        I.k(true);
        u0Var.S = 0L;
        u0Var.T = true;
        int o4 = u0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        e1 e1Var = u0Var.Q;
        long j3 = e1Var != null ? e1Var.j() : 0L;
        if (u0Var.getDefaultPeerId() == u0Var.N && u0Var.f()) {
            z10 = true;
        }
        return (l10.longValue() >= j3 || z10) ? Integer.valueOf(o4) : Integer.valueOf(TLObject.FLAG_31);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        e1 e1Var = this.Q;
        if (e1Var != null && e1Var.l()) {
            if (this.Q.w == null ? false : !r1.messages_enabled) {
                return this.N;
            }
        }
        return defaultSendAs == null ? m10.i(this.O).e() : org.telegram.messenger.m5.o(defaultSendAs);
    }

    private int getListViewTop() {
        di.c1 c1Var = this.c;
        int height = c1Var.getHeight();
        for (int i7 = 0; i7 < c1Var.getChildCount(); i7++) {
            height = Math.min(c1Var.getChildAt(i7).getTop(), height);
        }
        return c1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return org.telegram.messenger.g0.X2(hd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.S)));
    }

    private String getStarsToastTitle() {
        return hd.M0(2131745025, null);
    }

    private int getTotalMyStars() {
        int i7 = (int) (0 + this.S);
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            if (((TL_phone.groupCallDonor) this.U.get(i10)).my) {
                i7 = (int) (i7 + ((TL_phone.groupCallDonor) this.U.get(i10)).stars);
            }
        }
        return i7;
    }

    public final void b() {
        this.S = 0L;
        h(getDefaultPeerId());
        p1 p1Var = ((c2) this).j0.J1;
        o1 o1Var = p1Var.a;
        o1Var.c(p1Var);
        o1Var.b();
        j();
    }

    public final void c(int i7) {
        ArrayList arrayList;
        s0 s0Var;
        ArrayList arrayList2;
        boolean z10 = false;
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
                this.R -= j3;
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
                    z10 = true;
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
        if (z10) {
            ConnectionsManager.getInstance(this.O).getCurrentTime();
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
            di.c1 c1Var = this.c;
            if (i10 >= c1Var.getChildCount()) {
                return null;
            }
            View childAt = c1Var.getChildAt(i10);
            if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).L) != null && s0Var.a == i7) {
                return n0Var;
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.H2) {
            int i11 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (!(tLObject instanceof TL_update.TL_updateGroupCallMessage)) {
                if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                    TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                    TLRPC.InputGroupCall inputGroupCall = this.P;
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
            TLRPC.InputGroupCall inputGroupCall2 = this.P;
            if (inputGroupCall2 != null && inputGroupCall2.id == longValue) {
                TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                int i12 = groupCallMessage.date;
                int i13 = groupCallMessage.id;
                boolean z10 = groupCallMessage.from_admin;
                long o4 = org.telegram.messenger.m5.o(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                l(i12, i13, z10, o4, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.H) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        di.c1 c1Var = this.c;
        if (view != c1Var) {
            return super.drawChild(canvas, view, j3);
        }
        if (c1Var.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.L - c1Var.getTop()) + c1Var.getY();
        canvas.saveLayerAlpha(c1Var.getX(), c1Var.getY(), c1Var.getX() + c1Var.getWidth(), c1Var.getY() + c1Var.getHeight(), ns.e4, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((c1Var.getY() + c1Var.getHeight()) - max, getListViewTop()) * (1.0f - c1Var.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, max, getWidth(), org.telegram.messenger.g0.L(12.0f) + max);
        h6.m mVar = this.J;
        mVar.m(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (c1Var.getY() + c1Var.getHeight()) - org.telegram.messenger.g0.L(12.0f), getWidth(), c1Var.getHeight() + c1Var.getBottom());
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
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.N) {
            return false;
        }
        long j3 = this.N;
        int i7 = this.O;
        if (j3 >= 0) {
            return j3 == m10.i(i7).e();
        }
        e1 e1Var = this.Q;
        if (e1Var == null || (inputGroupCall = this.P) == null || inputGroupCall.id != e1Var.g() || (groupCall = this.Q.w) == null || !groupCall.creator) {
            return org.telegram.messenger.t3.w(14, np.s1(i7).M0(Long.valueOf(-this.N)));
        }
        return true;
    }

    public final boolean g() {
        return this.g0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        di.c1 c1Var = this.c;
        int height = c1Var.getHeight();
        for (int i7 = 0; i7 < c1Var.getChildCount(); i7++) {
            height = Math.min(c1Var.getChildAt(i7).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.r.size();
    }

    public long getStarsCount() {
        return this.R + this.S;
    }

    public int getUnreadMessagesCount() {
        int i7 = 0;
        if (this.G < 0) {
            return 0;
        }
        e1 e1Var = this.Q;
        long j3 = e1Var == null ? 0L : e1Var.j();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i7 >= arrayList.size()) {
                return i10;
            }
            s0 s0Var = (s0) arrayList.get(i7);
            int i11 = s0Var.a;
            if (i11 >= 0 && i11 > this.G && (s0Var.b || !s0Var.e || s0Var.g >= j3)) {
                i10++;
            }
            i7++;
        }
    }

    public abstract void h(long j3);

    public abstract void i(int i7, int i10, long j3);

    public abstract void j();

    public final void k(boolean z10) {
        this.e0.run();
        ArrayList arrayList = new ArrayList();
        if (this.U != null) {
            for (int i7 = 0; i7 < this.U.size(); i7++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i7);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long e10 = m10.i(this.O).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e10 = org.telegram.messenger.m5.o(defaultSendAs);
        }
        i0 i0Var = new i0(0);
        jc jcVar = new jc(getContext(), this.O, this.N, null, null, arrayList, !z10, true, e10, i0Var);
        c2 c2Var = (c2) this;
        jcVar.K1 = c2Var;
        jcVar.M1 = new di.z6(c2Var, 5);
        jcVar.show();
    }

    public final void l(int i7, int i10, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z11) {
        long j11;
        int i11;
        TL_phone.groupCallDonor groupcalldonor;
        t0 t0Var;
        boolean z12;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i12 >= arrayList.size()) {
                int i13 = this.O;
                int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                s0 s0Var = new s0();
                s0Var.d = i7;
                s0Var.b = z10;
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
                        z12 = true;
                    } else {
                        t0Var.f.add(s0Var);
                        this.f.g1();
                        z12 = false;
                    }
                    t0Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a3.c(this, 20));
                    if (!z11) {
                        this.n.O(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && s0Var.e) {
                    long j14 = s0Var.g;
                    if (j14 > j11) {
                        this.R += j14;
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
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.O(true);
                }
                if (i11 <= 0 && !z11 && (!this.c.canScrollVertically(1) || s0Var.a < 0)) {
                    this.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                    int i15 = s0Var.a;
                    if (i15 > 0) {
                        this.G = i15;
                    }
                }
                invalidate();
                c2 c2Var = (c2) this;
                a aVar = c2Var.j0.H1;
                if (aVar != null) {
                    aVar.setCount(c2Var.getUnreadMessagesCount());
                }
                if (!z11 && i10 > 0 && s0Var.g > j11) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= this.U.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (org.telegram.messenger.m5.o(((TL_phone.groupCallDonor) this.U.get(i16)).peer_id) == s0Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i16);
                                break;
                            }
                            i16++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = m10.i(i13).e() == s0Var.c;
                        groupcalldonor.peer_id = np.s1(i13).z1(s0Var.c);
                        groupcalldonor.stars = j11;
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            if (((t0) arrayList2.get(i17)).b == s0Var.c) {
                                ((t0) arrayList2.get(i17)).b();
                                groupcalldonor.stars += ((t0) arrayList2.get(i17)).d;
                            }
                        }
                        this.U.add(groupcalldonor);
                    }
                    long j15 = groupcalldonor.stars;
                    long j16 = s0Var.g;
                    long j17 = j15 + j16;
                    groupcalldonor.stars = j17;
                    i((int) j17, (int) j16, s0Var.c);
                }
                t();
                if (z11) {
                    a0 a0Var = this.h0;
                    org.telegram.messenger.g0.r(a0Var);
                    org.telegram.messenger.g0.i3(a0Var, 100L);
                }
                e1 e1Var = this.Q;
                if (e1Var != null) {
                    e1Var.V = arrayList;
                    e1Var.W = arrayList2;
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
        z zVar = this.F;
        if (zVar != null) {
            org.telegram.messenger.g0.r(zVar);
            this.F = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.O).getCurrentTime();
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
        this.F = zVar2;
        org.telegram.messenger.g0.i3(zVar2, j3);
    }

    public final int n(final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j10) {
        int i7;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i10 = this.O;
        final int j11 = m10.i(i10).j();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.P;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j10 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j10;
        }
        sendgroupcallmessage.random_id = Utilities.b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = np.s1(i10).j1(j3);
        ConnectionsManager.getInstance(m10.t0).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: fi.y
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                u0 u0Var = u0.this;
                int i11 = j11;
                if (!z11) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new di.g9(u0Var, i11, tL_error, j10, j3, tL_textWithEntities));
                        return;
                    }
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList z02 = np.z0(updates, TL_update.TL_updateMessageID.class);
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
                np.s1(u0Var.O).O3(updates, false);
            }
        });
        if (this.U != null && j10 > 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.U.size()) {
                    groupcalldonor = null;
                    break;
                }
                if (((TL_phone.groupCallDonor) this.U.get(i11)).my) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i11);
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
                groupcalldonor2.peer_id = np.s1(i10).z1(j3);
                groupcalldonor2.stars = j10;
                this.U.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(m10.t0).getCurrentTime();
        if (j3 == this.N || f()) {
            i7 = j11;
            z10 = true;
        } else {
            i7 = j11;
            z10 = false;
        }
        l(currentTime, i7, z10, j3, tL_textWithEntities, j10, false);
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
        if (this.P != null) {
            a0 a0Var = this.W;
            org.telegram.messenger.g0.r(a0Var);
            org.telegram.messenger.g0.h3(a0Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P != null) {
            org.telegram.messenger.g0.r(this.W);
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
        xb xbVar = this.a0;
        a0 a0Var = this.e0;
        int i7 = 0;
        if (xbVar == null || !xbVar.l) {
            b bVar = new b();
            rb rbVar = new rb(getContext(), bVar);
            this.b0 = rbVar;
            rbVar.c(R.raw.stars_topup, new String[0]);
            this.b0.b.setText(getStarsToastTitle());
            vb vbVar = new vb(getContext(), bVar, true, false);
            this.c0 = vbVar;
            vbVar.e(hd.M0(2131745023, null));
            this.c0.b = new z((c2) this, i7);
            qb qbVar = new qb(getContext(), bVar);
            this.d0 = qbVar;
            qbVar.b = 5000L;
            qbVar.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, bVar));
            this.c0.addView(this.d0, ja.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.c0.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
            this.b0.setButton(this.c0);
            xb f10 = xb.f(this.b, this.b0, -1);
            this.a0 = f10;
            f10.r = false;
            f10.k(true);
            this.a0.v = a0Var;
        }
        this.S++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.S, getDefaultPeerId());
        this.b0.b.setText(getStarsToastTitle());
        this.b0.c.setText(getStarsToastSubtitle());
        this.d0.b = 5000L;
        org.telegram.messenger.g0.r(a0Var);
        org.telegram.messenger.g0.i3(a0Var, 5000L);
        long j3 = this.S;
        p1 p1Var = ((c2) this).j0.J1;
        o1 o1Var = p1Var.a;
        o1Var.c(p1Var);
        if (o1Var.s) {
            o1Var.s = false;
            o1Var.a(1.0f, null);
        }
        ArrayList arrayList = o1Var.e;
        while (arrayList.size() > 4) {
            ((ch0) arrayList.remove(0)).C(true);
        }
        int[] iArr = o1Var.f;
        ch0 ch0Var = new ch0(iArr[Utilities.c.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        ch0Var.R(o1Var);
        ch0Var.J(true);
        ch0Var.K(0);
        ch0Var.start();
        arrayList.add(ch0Var);
        o1Var.invalidate();
        org.telegram.ui.Components.g6 g6Var = o1Var.c;
        g6Var.a();
        g6Var.t(i5.c.l(j3, ',', new StringBuilder("+")), true, true);
        m1 m1Var = o1Var.d;
        org.telegram.messenger.g0.r(m1Var);
        org.telegram.messenger.g0.i3(m1Var, 1500L);
        p1Var.getLocationInWindow(p1Var.G);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - p1Var.E < 100) {
            p1Var.F += 0.5f;
        } else {
            p1Var.F = Utilities.i(1.0f - ((r9 - 100) / 200.0f), 1.0f, 0.0f) * p1Var.F;
            LaunchActivity.b0((p1Var.getWidth() / 2.0f) + r0[0], (p1Var.getHeight() / 2.0f) + r0[1], Utilities.i(p1Var.F, 0.9f, 0.3f));
            p1Var.F = 0.0f;
            p1Var.E = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j3, TLRPC.InputGroupCall inputGroupCall) {
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.P;
        if ((inputGroupCall2 == null ? 0L : inputGroupCall2.id) != (inputGroupCall != null ? inputGroupCall.id : 0L)) {
            this.r.clear();
            z10 = true;
            this.e.O(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.P;
        int i7 = ns.H2;
        int i10 = this.O;
        if (inputGroupCall3 != null) {
            ns.f(i10).n(this, i7);
        }
        this.N = j3;
        this.P = inputGroupCall;
        if (inputGroupCall != null) {
            ns.f(i10).c(this, i7);
        }
        if (z10) {
            this.e0.run();
            a0 a0Var = this.W;
            if (inputGroupCall == null) {
                org.telegram.messenger.g0.r(a0Var);
                return z10;
            }
            a0Var.run();
        }
        return z10;
    }

    public final float s() {
        return Math.max(Math.max(0.0f, this.L - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.H = z10;
    }

    public void setLivePlayer(e1 e1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z10 = this.Q == null;
        this.Q = e1Var;
        if (!z10 || e1Var == null || (arrayList = e1Var.V) == null || (arrayList2 = e1Var.W) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(e1Var.V);
        arrayList4.addAll(e1Var.W);
        this.e.O(true);
        ConnectionsManager.getInstance(this.O).getCurrentTime();
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
        ArrayList arrayList2 = this.U;
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
            di.c1 c1Var = this.c;
            if (i14 >= c1Var.getChildCount()) {
                break;
            }
            View childAt = c1Var.getChildAt(i14);
            if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).L) != null) {
                int e10 = e(s0Var.c);
                s0 s0Var2 = n0Var.L;
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
            b61 b61Var = this.f;
            if (i16 >= b61Var.getChildCount()) {
                break;
            }
            View childAt2 = b61Var.getChildAt(i16);
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

    public final void u(boolean z10) {
        ArrayList arrayList = this.s;
        if (z10 && this.K == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.K = !isEmpty;
        di.c1 c1Var = this.c;
        b61 b61Var = this.f;
        if (z10) {
            ViewPropertyAnimator translationY = c1Var.animate().translationY(this.K ? 0.0f : org.telegram.messenger.g0.L(35.0f));
            er erVar = er.h;
            translationY.setInterpolator(erVar).setUpdateListener(new ah.h(this, 14)).setDuration(420L).start();
            b61Var.animate().translationY(this.K ? 0.0f : org.telegram.messenger.g0.L(35.0f)).alpha(this.K ? 1.0f : 0.0f).setInterpolator(erVar).setDuration(420L).start();
            return;
        }
        c1Var.setTranslationY(!isEmpty ? 0.0f : org.telegram.messenger.g0.L(35.0f));
        b61Var.setTranslationY(this.K ? 0.0f : org.telegram.messenger.g0.L(35.0f));
        b61Var.setAlpha(this.K ? 1.0f : 0.0f);
        invalidate();
    }
}
