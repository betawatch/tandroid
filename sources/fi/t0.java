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
import c8.ma;
import di.mc;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.zb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f61;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public abstract class t0 extends FrameLayout implements gs {
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
    public c1 Q;
    public long R;
    public long S;
    public boolean T;
    public ArrayList U;
    public boolean V;
    public final a0 W;
    public final View a;
    public gc a0;
    public final FrameLayout b;
    public ac b0;
    public final di.b1 c;
    public ec c0;
    public final v4.c0 d;
    public zb d0;
    public final bi.g8 e;
    public final a0 e0;
    public final f61 f;
    public ValueAnimator f0;
    public boolean g0;
    public final v4.c0 h;
    public final a0 h0;
    public final c51 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap w;
    public long x;
    public int y;

    public t0(Context context, f9 f9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new HashMap();
        this.G = -1;
        final int i7 = 1;
        this.H = true;
        this.J = new h6.m(29);
        int i10 = k10.t0;
        this.O = i10;
        this.U = new ArrayList();
        final a2 a2Var = (a2) this;
        final int i11 = 0;
        this.W = new a0(a2Var, i11);
        this.e0 = new a0(a2Var, i7);
        this.g0 = false;
        this.h0 = new a0(a2Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        di.b1 b1Var = new di.b1(i7, context, a2Var);
        this.c = b1Var;
        b1Var.setWillNotDraw(false);
        v4.c0 c0Var = new v4.c0(1, true);
        this.d = c0Var;
        b1Var.setLayoutManager(c0Var);
        bi.g8 g8Var = new bi.g8(a2Var, b1Var, context, i10, new r10() { // from class: fi.e0
            @Override // org.telegram.messenger.r10
            public final void a(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                a2 a2Var2 = a2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = a2Var2.r;
                        c1 c1Var = a2Var2.Q;
                        long j3 = c1Var == null ? 0L : c1Var.j();
                        a2Var2.I = j3;
                        while (i13 < arrayList2.size()) {
                            r0 r0Var = (r0) arrayList2.get(i13);
                            if (r0Var.b || !r0Var.e || r0Var.g >= j3) {
                                int i14 = l0.b;
                                o41 K = o41.K(l0.class);
                                K.H = r0Var;
                                arrayList.add(K);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = a2Var2.s;
                        while (i13 < arrayList3.size()) {
                            s0 s0Var = (s0) arrayList3.get(i13);
                            int i15 = p0.b;
                            o41 K2 = o41.K(p0.class);
                            K2.H = s0Var;
                            arrayList.add(K2);
                            i13++;
                        }
                        break;
                }
            }
        }, new b(), 2);
        this.e = g8Var;
        b1Var.setAdapter(g8Var);
        g8Var.r = false;
        b1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
        b1Var.setClipToPadding(false);
        addView(b1Var, ma.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        b1Var.setOnItemClickListener(new bi.t1(a2Var, viewGroup, f9Var, i7));
        f0 f0Var = new f0(a2Var);
        f0Var.m = false;
        f0Var.C = false;
        nr nrVar = nr.h;
        f0Var.o(nrVar);
        f0Var.n(280L);
        f0Var.D = 14L;
        b1Var.setItemAnimator(f0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new ah.d(a2Var, 21));
        f61 f61Var = new f61(i7, context, null);
        this.f = f61Var;
        f61Var.setWillNotDraw(false);
        v4.c0 c0Var2 = new v4.c0(0, false);
        this.h = c0Var2;
        f61Var.setLayoutManager(c0Var2);
        c51 c51Var = new c51(f61Var, context, i10, 0, false, new r10() { // from class: fi.e0
            @Override // org.telegram.messenger.r10
            public final void a(Object obj, Object obj2) {
                int i12 = i7;
                int i13 = 0;
                a2 a2Var2 = a2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = a2Var2.r;
                        c1 c1Var = a2Var2.Q;
                        long j3 = c1Var == null ? 0L : c1Var.j();
                        a2Var2.I = j3;
                        while (i13 < arrayList2.size()) {
                            r0 r0Var = (r0) arrayList2.get(i13);
                            if (r0Var.b || !r0Var.e || r0Var.g >= j3) {
                                int i14 = l0.b;
                                o41 K = o41.K(l0.class);
                                K.H = r0Var;
                                arrayList.add(K);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = a2Var2.s;
                        while (i13 < arrayList3.size()) {
                            s0 s0Var = (s0) arrayList3.get(i13);
                            int i15 = p0.b;
                            o41 K2 = o41.K(p0.class);
                            K2.H = s0Var;
                            arrayList.add(K2);
                            i13++;
                        }
                        break;
                }
            }
        }, null);
        this.n = c51Var;
        f61Var.setAdapter(c51Var);
        c51Var.r = false;
        f61Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f61Var.setClipToPadding(false);
        addView(f61Var, ma.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        f61Var.setOnItemClickListener(new di.v6(a2Var, 7));
        g0 g0Var = new g0();
        g0Var.m = false;
        g0Var.C = false;
        g0Var.o(nrVar);
        g0Var.n(350L);
        f61Var.setItemAnimator(g0Var);
        u(false);
    }

    public static Integer a(t0 t0Var, Long l10) {
        t0Var.e0.run();
        t0Var.S = l10.longValue();
        gc I = new lc(t0Var.b, new b()).I(R.raw.stars_topup, t0Var.getStarsToastTitle(), t0Var.getStarsToastSubtitle());
        boolean z10 = false;
        I.r = false;
        I.k(true);
        t0Var.S = 0L;
        t0Var.T = true;
        int o4 = t0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        c1 c1Var = t0Var.Q;
        long j3 = c1Var != null ? c1Var.j() : 0L;
        if (t0Var.getDefaultPeerId() == t0Var.N && t0Var.f()) {
            z10 = true;
        }
        return (l10.longValue() >= j3 || z10) ? Integer.valueOf(o4) : Integer.valueOf(TLObject.FLAG_31);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        c1 c1Var = this.Q;
        if (c1Var != null && c1Var.l()) {
            if (this.Q.w == null ? false : !r1.messages_enabled) {
                return this.N;
            }
        }
        return defaultSendAs == null ? k10.i(this.O).e() : org.telegram.messenger.n5.o(defaultSendAs);
    }

    private int getListViewTop() {
        di.b1 b1Var = this.c;
        int height = b1Var.getHeight();
        for (int i7 = 0; i7 < b1Var.getChildCount(); i7++) {
            height = Math.min(b1Var.getChildAt(i7).getTop(), height);
        }
        return b1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return org.telegram.messenger.g0.W2(hd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.S)));
    }

    private String getStarsToastTitle() {
        return hd.N0(2131744782, null);
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
        n1 n1Var = ((a2) this).j0.J1;
        m1 m1Var = n1Var.a;
        m1Var.c(n1Var);
        m1Var.b();
        j();
    }

    public final void c(int i7) {
        ArrayList arrayList;
        r0 r0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            arrayList = this.r;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                r0Var = null;
                break;
            } else {
                if (((r0) arrayList.get(i10)).a == i7) {
                    r0Var = (r0) arrayList.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (r0Var == null) {
            return;
        }
        if (r0Var.a < 0 && r0Var.e) {
            long j3 = r0Var.g;
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
            if (((s0) arrayList2.get(i11)).f.contains(r0Var)) {
                ((s0) arrayList2.get(i11)).f.remove(r0Var);
                if (((s0) arrayList2.get(i11)).f.isEmpty()) {
                    arrayList2.remove(i11);
                    z10 = true;
                } else {
                    ((s0) arrayList2.get(i11)).c();
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

    public final m0 d(int i7) {
        m0 m0Var;
        r0 r0Var;
        int i10 = 0;
        while (true) {
            di.b1 b1Var = this.c;
            if (i10 >= b1Var.getChildCount()) {
                return null;
            }
            View childAt = b1Var.getChildAt(i10);
            if ((childAt instanceof m0) && (r0Var = (m0Var = (m0) childAt).L) != null && r0Var.a == i7) {
                return m0Var;
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.H2) {
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
                long o4 = org.telegram.messenger.n5.o(groupCallMessage.from_id);
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
        di.b1 b1Var = this.c;
        if (view != b1Var) {
            return super.drawChild(canvas, view, j3);
        }
        if (b1Var.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.L - b1Var.getTop()) + b1Var.getY();
        canvas.saveLayerAlpha(b1Var.getX(), b1Var.getY(), b1Var.getX() + b1Var.getWidth(), b1Var.getY() + b1Var.getHeight(), ls.e4, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((b1Var.getY() + b1Var.getHeight()) - max, getListViewTop()) * (1.0f - b1Var.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, max, getWidth(), org.telegram.messenger.g0.L(12.0f) + max);
        h6.m mVar = this.J;
        mVar.n(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (b1Var.getY() + b1Var.getHeight()) - org.telegram.messenger.g0.L(12.0f), getWidth(), b1Var.getHeight() + b1Var.getBottom());
        mVar.n(canvas, rectF, 3, 1.0f);
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
            return j3 == k10.i(i7).e();
        }
        c1 c1Var = this.Q;
        if (c1Var == null || (inputGroupCall = this.P) == null || inputGroupCall.id != c1Var.g() || (groupCall = this.Q.w) == null || !groupCall.creator) {
            return org.telegram.messenger.v3.w(14, np.u1(i7).O0(Long.valueOf(-this.N)));
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
        di.b1 b1Var = this.c;
        int height = b1Var.getHeight();
        for (int i7 = 0; i7 < b1Var.getChildCount(); i7++) {
            height = Math.min(b1Var.getChildAt(i7).getTop(), height);
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
        c1 c1Var = this.Q;
        long j3 = c1Var == null ? 0L : c1Var.j();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i7 >= arrayList.size()) {
                return i10;
            }
            r0 r0Var = (r0) arrayList.get(i7);
            int i11 = r0Var.a;
            if (i11 >= 0 && i11 > this.G && (r0Var.b || !r0Var.e || r0Var.g >= j3)) {
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
        long e10 = k10.i(this.O).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e10 = org.telegram.messenger.n5.o(defaultSendAs);
        }
        h0 h0Var = new h0(0);
        mc mcVar = new mc(getContext(), this.O, this.N, null, null, arrayList, !z10, true, e10, h0Var);
        a2 a2Var = (a2) this;
        mcVar.K1 = a2Var;
        mcVar.M1 = new di.v6(a2Var, 6);
        mcVar.show();
    }

    public final void l(int i7, int i10, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z11) {
        long j11;
        int i11;
        TL_phone.groupCallDonor groupcalldonor;
        s0 s0Var;
        boolean z12;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i12 >= arrayList.size()) {
                int i13 = this.O;
                int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                r0 r0Var = new r0();
                r0Var.d = i7;
                r0Var.b = z10;
                r0Var.c = j3;
                r0Var.f = tL_textWithEntities;
                r0Var.g = j10;
                r0Var.a = i10;
                r0Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = t.b(i13, (int) r0Var.g, 0);
                long j12 = r0Var.g;
                long j13 = 0;
                ArrayList arrayList2 = this.s;
                if (j12 <= 0 || b10 <= 0 || currentTime - r0Var.d > b10) {
                    j11 = 0;
                } else {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            j11 = j13;
                            s0Var = null;
                            break;
                        }
                        j11 = j13;
                        if (((s0) arrayList2.get(i14)).b == j3) {
                            s0Var = (s0) arrayList2.get(i14);
                            break;
                        } else {
                            i14++;
                            j13 = j11;
                        }
                    }
                    if (s0Var == null) {
                        s0Var = new s0();
                        ArrayList arrayList3 = new ArrayList();
                        s0Var.f = arrayList3;
                        s0Var.a = i13;
                        s0Var.b = j3;
                        arrayList3.add(r0Var);
                        arrayList2.add(0, s0Var);
                        z12 = true;
                    } else {
                        s0Var.f.add(r0Var);
                        this.f.g1();
                        z12 = false;
                    }
                    s0Var.c();
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
                if (!z11 && r0Var.e) {
                    long j14 = r0Var.g;
                    if (j14 > j11) {
                        this.R += j14;
                        j();
                    }
                }
                if (r0Var.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (r0Var.a < ((r0) arrayList.get(size)).a) {
                            i11 = size + 1;
                            break;
                        }
                    }
                }
                i11 = 0;
                arrayList.add(i11, r0Var);
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.O(true);
                }
                if (i11 <= 0 && !z11 && (!this.c.canScrollVertically(1) || r0Var.a < 0)) {
                    this.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                    int i15 = r0Var.a;
                    if (i15 > 0) {
                        this.G = i15;
                    }
                }
                invalidate();
                a2 a2Var = (a2) this;
                a aVar = a2Var.j0.H1;
                if (aVar != null) {
                    aVar.setCount(a2Var.getUnreadMessagesCount());
                }
                if (!z11 && i10 > 0 && r0Var.g > j11) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= this.U.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (org.telegram.messenger.n5.o(((TL_phone.groupCallDonor) this.U.get(i16)).peer_id) == r0Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i16);
                                break;
                            }
                            i16++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = k10.i(i13).e() == r0Var.c;
                        groupcalldonor.peer_id = np.u1(i13).B1(r0Var.c);
                        groupcalldonor.stars = j11;
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            if (((s0) arrayList2.get(i17)).b == r0Var.c) {
                                ((s0) arrayList2.get(i17)).b();
                                groupcalldonor.stars += ((s0) arrayList2.get(i17)).d;
                            }
                        }
                        this.U.add(groupcalldonor);
                    }
                    long j15 = groupcalldonor.stars;
                    long j16 = r0Var.g;
                    long j17 = j15 + j16;
                    groupcalldonor.stars = j17;
                    i((int) j17, (int) j16, r0Var.c);
                }
                t();
                if (z11) {
                    a0 a0Var = this.h0;
                    org.telegram.messenger.g0.r(a0Var);
                    org.telegram.messenger.g0.h3(a0Var, 100L);
                }
                c1 c1Var = this.Q;
                if (c1Var != null) {
                    c1Var.V = arrayList;
                    c1Var.W = arrayList2;
                    return;
                }
                return;
            }
            if (((r0) arrayList.get(i12)).a == i10) {
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
            s0 s0Var = (s0) obj;
            ArrayList arrayList2 = s0Var.f;
            int size2 = arrayList2.size();
            int i11 = currentTime;
            int i12 = 0;
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                r0 r0Var = (r0) obj2;
                int i14 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (r0Var.g > 0) {
                    i11 = Math.min(i11, r0Var.d);
                    i7 = i14;
                    i12 = Math.max(i12, t.b(s0Var.a, (int) r0Var.g, 0) + r0Var.d);
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
        org.telegram.messenger.g0.h3(zVar2, j3);
    }

    public final int n(final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j10) {
        int i7;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i10 = this.O;
        final int j11 = k10.i(i10).j();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.P;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j10 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j10;
        }
        sendgroupcallmessage.random_id = Utilities.b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = np.u1(i10).l1(j3);
        ConnectionsManager.getInstance(k10.t0).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: fi.y
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                t0 t0Var = t0.this;
                int i11 = j11;
                if (!z11) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.g3(new di.j9(t0Var, i11, tL_error, j10, j3, tL_textWithEntities));
                        return;
                    }
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList B0 = np.B0(updates, TL_update.TL_updateMessageID.class);
                int size = B0.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = B0.get(i12);
                    i12++;
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                    if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                        int i13 = tL_updateMessageID.id;
                        ArrayList arrayList = t0Var.r;
                        int size2 = arrayList.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size2) {
                                Object obj2 = arrayList.get(i14);
                                i14++;
                                r0 r0Var = (r0) obj2;
                                if (r0Var.a == i11) {
                                    r0Var.a = i13;
                                    break;
                                }
                            }
                        }
                    }
                }
                np.u1(t0Var.O).V3(updates, false);
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
                groupcalldonor2.peer_id = np.u1(i10).B1(j3);
                groupcalldonor2.stars = j10;
                this.U.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(k10.t0).getCurrentTime();
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
            org.telegram.messenger.g0.g3(a0Var);
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
        gc gcVar = this.a0;
        a0 a0Var = this.e0;
        int i7 = 0;
        if (gcVar == null || !gcVar.l) {
            b bVar = new b();
            ac acVar = new ac(getContext(), bVar);
            this.b0 = acVar;
            acVar.c(R.raw.stars_topup, new String[0]);
            this.b0.b.setText(getStarsToastTitle());
            ec ecVar = new ec(getContext(), bVar, true, false);
            this.c0 = ecVar;
            ecVar.e(hd.N0(2131744780, null));
            this.c0.b = new z((a2) this, i7);
            zb zbVar = new zb(getContext(), bVar);
            this.d0 = zbVar;
            zbVar.b = 5000L;
            zbVar.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, bVar));
            this.c0.addView(this.d0, ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.c0.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
            this.b0.setButton(this.c0);
            gc f10 = gc.f(this.b, this.b0, -1);
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
        org.telegram.messenger.g0.h3(a0Var, 5000L);
        long j3 = this.S;
        n1 n1Var = ((a2) this).j0.J1;
        m1 m1Var = n1Var.a;
        m1Var.c(n1Var);
        if (m1Var.s) {
            m1Var.s = false;
            m1Var.a(1.0f, null);
        }
        ArrayList arrayList = m1Var.e;
        while (arrayList.size() > 4) {
            ((oh0) arrayList.remove(0)).C(true);
        }
        int[] iArr = m1Var.f;
        oh0 oh0Var = new oh0(iArr[Utilities.c.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        oh0Var.R(m1Var);
        oh0Var.J(true);
        oh0Var.K(0);
        oh0Var.start();
        arrayList.add(oh0Var);
        m1Var.invalidate();
        org.telegram.ui.Components.n6 n6Var = m1Var.c;
        n6Var.a();
        n6Var.t(i5.c.l(j3, ',', new StringBuilder("+")), true, true);
        k1 k1Var = m1Var.d;
        org.telegram.messenger.g0.r(k1Var);
        org.telegram.messenger.g0.h3(k1Var, 1500L);
        n1Var.getLocationInWindow(n1Var.G);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - n1Var.E < 100) {
            n1Var.F += 0.5f;
        } else {
            n1Var.F = Utilities.i(1.0f - ((r9 - 100) / 200.0f), 1.0f, 0.0f) * n1Var.F;
            LaunchActivity.b0((n1Var.getWidth() / 2.0f) + r0[0], (n1Var.getHeight() / 2.0f) + r0[1], Utilities.i(n1Var.F, 0.9f, 0.3f));
            n1Var.F = 0.0f;
            n1Var.E = currentTimeMillis;
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
        int i7 = ls.H2;
        int i10 = this.O;
        if (inputGroupCall3 != null) {
            ls.f(i10).n(this, i7);
        }
        this.N = j3;
        this.P = inputGroupCall;
        if (inputGroupCall != null) {
            ls.f(i10).c(this, i7);
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

    public void setLivePlayer(c1 c1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z10 = this.Q == null;
        this.Q = c1Var;
        if (!z10 || c1Var == null || (arrayList = c1Var.V) == null || (arrayList2 = c1Var.W) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(c1Var.V);
        arrayList4.addAll(c1Var.W);
        this.e.O(true);
        ConnectionsManager.getInstance(this.O).getCurrentTime();
        Collections.sort(arrayList4, new a3.c(this, 20));
        this.n.O(true);
        u(false);
    }

    public final void t() {
        q0 q0Var;
        s0 s0Var;
        m0 m0Var;
        r0 r0Var;
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
                hashMap.put(Long.valueOf(org.telegram.messenger.n5.o(groupcalldonor.peer_id)), Integer.valueOf(i11));
            }
        }
        int i14 = 0;
        while (true) {
            di.b1 b1Var = this.c;
            if (i14 >= b1Var.getChildCount()) {
                break;
            }
            View childAt = b1Var.getChildAt(i14);
            if ((childAt instanceof m0) && (r0Var = (m0Var = (m0) childAt).L) != null) {
                int e10 = e(r0Var.c);
                r0 r0Var2 = m0Var.L;
                if (e10 != r0Var2.h) {
                    r0Var2.h = e10;
                    m0Var.set(r0Var2);
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
            r0 r0Var3 = (r0) arrayList3.get(i15);
            int e11 = e(r0Var3.c);
            if (e11 != r0Var3.h) {
                r0Var3.h = e11;
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            f61 f61Var = this.f;
            if (i16 >= f61Var.getChildCount()) {
                break;
            }
            View childAt2 = f61Var.getChildAt(i16);
            if ((childAt2 instanceof q0) && (s0Var = (q0Var = (q0) childAt2).f) != null) {
                int e12 = e(s0Var.b);
                s0 s0Var2 = q0Var.f;
                if (e12 != s0Var2.e) {
                    s0Var2.e = e12;
                    q0Var.set(s0Var2);
                }
            }
            i16++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i7 >= arrayList4.size()) {
                return;
            }
            s0 s0Var3 = (s0) arrayList4.get(i7);
            int e13 = e(s0Var3.b);
            if (e13 != s0Var3.e) {
                s0Var3.e = e13;
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
        di.b1 b1Var = this.c;
        f61 f61Var = this.f;
        if (z10) {
            ViewPropertyAnimator translationY = b1Var.animate().translationY(this.K ? 0.0f : org.telegram.messenger.g0.L(35.0f));
            nr nrVar = nr.h;
            translationY.setInterpolator(nrVar).setUpdateListener(new ah.g(this, 14)).setDuration(420L).start();
            f61Var.animate().translationY(this.K ? 0.0f : org.telegram.messenger.g0.L(35.0f)).alpha(this.K ? 1.0f : 0.0f).setInterpolator(nrVar).setDuration(420L).start();
            return;
        }
        b1Var.setTranslationY(!isEmpty ? 0.0f : org.telegram.messenger.g0.L(35.0f));
        f61Var.setTranslationY(this.K ? 0.0f : org.telegram.messenger.g0.L(35.0f));
        f61Var.setAlpha(this.K ? 1.0f : 0.0f);
        invalidate();
    }
}
