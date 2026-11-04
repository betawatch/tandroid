package ei;

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
import b8.mf;
import ci.tc;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class w0 extends FrameLayout implements cs {
    public boolean E;
    public a0 F;
    public int G;
    public boolean H;
    public long I;
    public final k4.j J;
    public boolean K;
    public float L;
    public float M;
    public long N;
    public final int O;
    public TLRPC.InputGroupCall P;
    public g1 Q;
    public long R;
    public long S;
    public boolean T;
    public ArrayList U;
    public boolean V;
    public final c0 W;
    public final View a;
    public ac a0;
    public final FrameLayout b;
    public ub b0;
    public final ci.j1 c;
    public yb c0;
    public final u4.b0 d;
    public tb d0;
    public final ai.f6 e;
    public final c0 e0;
    public final u51 f;
    public ValueAnimator f0;
    public boolean g0;
    public final u4.b0 h;
    public final c0 h0;
    public final f41 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap w;
    public long x;
    public int y;

    public w0(Context context, r9 r9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new HashMap();
        this.G = -1;
        final int i3 = 1;
        this.H = true;
        this.J = new k4.j(24);
        int i10 = h10.t0;
        this.O = i10;
        this.U = new ArrayList();
        final k2 k2Var = (k2) this;
        final int i11 = 0;
        this.W = new c0(k2Var, i11);
        this.e0 = new c0(k2Var, i3);
        this.g0 = false;
        this.h0 = new c0(k2Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        ci.j1 j1Var = new ci.j1(i3, context, k2Var);
        this.c = j1Var;
        j1Var.setWillNotDraw(false);
        u4.b0 b0Var = new u4.b0(1, true);
        this.d = b0Var;
        j1Var.setLayoutManager(b0Var);
        ai.f6 f6Var = new ai.f6(k2Var, j1Var, context, i10, new n10() { // from class: ei.g0
            @Override // org.telegram.messenger.n10
            public final void a(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                k2 k2Var2 = k2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = k2Var2.r;
                        g1 g1Var = k2Var2.Q;
                        long j10 = g1Var == null ? 0L : g1Var.j();
                        k2Var2.I = j10;
                        while (i13 < arrayList2.size()) {
                            u0 u0Var = (u0) arrayList2.get(i13);
                            if (u0Var.b || !u0Var.e || u0Var.g >= j10) {
                                int i14 = o0.b;
                                r31 K = r31.K(o0.class);
                                K.G = u0Var;
                                arrayList.add(K);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = k2Var2.s;
                        while (i13 < arrayList3.size()) {
                            v0 v0Var = (v0) arrayList3.get(i13);
                            int i15 = s0.b;
                            r31 K2 = r31.K(s0.class);
                            K2.G = v0Var;
                            arrayList.add(K2);
                            i13++;
                        }
                        break;
                }
            }
        }, new b(), 2);
        this.e = f6Var;
        j1Var.setAdapter(f6Var);
        f6Var.r = false;
        j1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
        j1Var.setClipToPadding(false);
        addView(j1Var, mf.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        j1Var.setOnItemClickListener(new h0(k2Var, viewGroup, r9Var, i11));
        i0 i0Var = new i0(k2Var);
        i0Var.m = false;
        i0Var.C = false;
        xq xqVar = xq.h;
        i0Var.o(xqVar);
        i0Var.n(280L);
        i0Var.D = 14L;
        j1Var.setItemAnimator(i0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new ai.b(k2Var, 17));
        u51 u51Var = new u51(i3, context, null);
        this.f = u51Var;
        u51Var.setWillNotDraw(false);
        u4.b0 b0Var2 = new u4.b0(0, false);
        this.h = b0Var2;
        u51Var.setLayoutManager(b0Var2);
        f41 f41Var = new f41(u51Var, context, i10, 0, false, new n10() { // from class: ei.g0
            @Override // org.telegram.messenger.n10
            public final void a(Object obj, Object obj2) {
                int i12 = i3;
                int i13 = 0;
                k2 k2Var2 = k2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = k2Var2.r;
                        g1 g1Var = k2Var2.Q;
                        long j10 = g1Var == null ? 0L : g1Var.j();
                        k2Var2.I = j10;
                        while (i13 < arrayList2.size()) {
                            u0 u0Var = (u0) arrayList2.get(i13);
                            if (u0Var.b || !u0Var.e || u0Var.g >= j10) {
                                int i14 = o0.b;
                                r31 K = r31.K(o0.class);
                                K.G = u0Var;
                                arrayList.add(K);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = k2Var2.s;
                        while (i13 < arrayList3.size()) {
                            v0 v0Var = (v0) arrayList3.get(i13);
                            int i15 = s0.b;
                            r31 K2 = r31.K(s0.class);
                            K2.G = v0Var;
                            arrayList.add(K2);
                            i13++;
                        }
                        break;
                }
            }
        }, null);
        this.n = f41Var;
        u51Var.setAdapter(f41Var);
        f41Var.r = false;
        u51Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        u51Var.setClipToPadding(false);
        addView(u51Var, mf.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        u51Var.setOnItemClickListener(new a1.c(k2Var, 25));
        j0 j0Var = new j0();
        j0Var.m = false;
        j0Var.C = false;
        j0Var.o(xqVar);
        j0Var.n(350L);
        u51Var.setItemAnimator(j0Var);
        u(false);
    }

    public static Integer a(w0 w0Var, Long l10) {
        w0Var.e0.run();
        w0Var.S = l10.longValue();
        ac I = new fc(w0Var.b, new b()).I(R.raw.stars_topup, w0Var.getStarsToastTitle(), w0Var.getStarsToastSubtitle());
        boolean z10 = false;
        I.r = false;
        I.k(true);
        w0Var.S = 0L;
        w0Var.T = true;
        int o10 = w0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        g1 g1Var = w0Var.Q;
        long j10 = g1Var != null ? g1Var.j() : 0L;
        if (w0Var.getDefaultPeerId() == w0Var.N && w0Var.f()) {
            z10 = true;
        }
        return (l10.longValue() >= j10 || z10) ? Integer.valueOf(o10) : Integer.valueOf(TLObject.FLAG_31);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        g1 g1Var = this.Q;
        if (g1Var != null && g1Var.l()) {
            if (this.Q.w == null ? false : !r1.messages_enabled) {
                return this.N;
            }
        }
        return defaultSendAs == null ? h10.i(this.O).e() : org.telegram.messenger.m5.o(defaultSendAs);
    }

    private int getListViewTop() {
        ci.j1 j1Var = this.c;
        int height = j1Var.getHeight();
        for (int i3 = 0; i3 < j1Var.getChildCount(); i3++) {
            height = Math.min(j1Var.getChildAt(i3).getTop(), height);
        }
        return j1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return org.telegram.messenger.g0.X2(bd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.S)));
    }

    private String getStarsToastTitle() {
        return bd.M0(2131745035, null);
    }

    private int getTotalMyStars() {
        int i3 = (int) (0 + this.S);
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            if (((TL_phone.groupCallDonor) this.U.get(i10)).my) {
                i3 = (int) (i3 + ((TL_phone.groupCallDonor) this.U.get(i10)).stars);
            }
        }
        return i3;
    }

    public final void b() {
        this.S = 0L;
        h(getDefaultPeerId());
        w1 w1Var = ((k2) this).j0.J1;
        v1 v1Var = w1Var.a;
        v1Var.c(w1Var);
        v1Var.b();
        j();
    }

    public final void c(int i3) {
        ArrayList arrayList;
        u0 u0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            arrayList = this.r;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                u0Var = null;
                break;
            } else {
                if (((u0) arrayList.get(i10)).a == i3) {
                    u0Var = (u0) arrayList.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (u0Var == null) {
            return;
        }
        if (u0Var.a < 0 && u0Var.e) {
            long j10 = u0Var.g;
            if (j10 > 0) {
                this.R -= j10;
                j();
            }
        }
        int i11 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i11 >= arrayList2.size()) {
                break;
            }
            if (((v0) arrayList2.get(i11)).f.contains(u0Var)) {
                ((v0) arrayList2.get(i11)).f.remove(u0Var);
                if (((v0) arrayList2.get(i11)).f.isEmpty()) {
                    arrayList2.remove(i11);
                    z10 = true;
                } else {
                    ((v0) arrayList2.get(i11)).c();
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
            Collections.sort(arrayList2, new a3.u(this, 10));
            this.n.O(true);
            t();
            u(true);
        }
    }

    public final p0 d(int i3) {
        p0 p0Var;
        u0 u0Var;
        int i10 = 0;
        while (true) {
            ci.j1 j1Var = this.c;
            if (i10 >= j1Var.getChildCount()) {
                return null;
            }
            View childAt = j1Var.getChildAt(i10);
            if ((childAt instanceof p0) && (u0Var = (p0Var = (p0) childAt).L) != null && u0Var.a == i3) {
                return p0Var;
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.H2) {
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
                long o10 = org.telegram.messenger.m5.o(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                l(i12, i13, z10, o10, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ci.j1 j1Var = this.c;
        if (view != j1Var) {
            return super.drawChild(canvas, view, j10);
        }
        if (j1Var.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.L - j1Var.getTop()) + j1Var.getY();
        canvas.saveLayerAlpha(j1Var.getX(), j1Var.getY(), j1Var.getX() + j1Var.getWidth(), j1Var.getY() + j1Var.getHeight(), hs.e4, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((j1Var.getY() + j1Var.getHeight()) - max, getListViewTop()) * (1.0f - j1Var.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, max, getWidth(), org.telegram.messenger.g0.L(12.0f) + max);
        k4.j jVar = this.J;
        jVar.w(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (j1Var.getY() + j1Var.getHeight()) - org.telegram.messenger.g0.L(12.0f), getWidth(), j1Var.getHeight() + j1Var.getBottom());
        jVar.w(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return drawChild;
    }

    public final int e(long j10) {
        return ((Integer) Map.-EL.getOrDefault(this.w, Long.valueOf(j10), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.N) {
            return false;
        }
        long j10 = this.N;
        int i3 = this.O;
        if (j10 >= 0) {
            return j10 == h10.i(i3).e();
        }
        g1 g1Var = this.Q;
        if (g1Var == null || (inputGroupCall = this.P) == null || inputGroupCall.id != g1Var.g() || (groupCall = this.Q.w) == null || !groupCall.creator) {
            return org.telegram.messenger.t3.w(14, hp.s1(i3).M0(Long.valueOf(-this.N)));
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
        ci.j1 j1Var = this.c;
        int height = j1Var.getHeight();
        for (int i3 = 0; i3 < j1Var.getChildCount(); i3++) {
            height = Math.min(j1Var.getChildAt(i3).getTop(), height);
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
        int i3 = 0;
        if (this.G < 0) {
            return 0;
        }
        g1 g1Var = this.Q;
        long j10 = g1Var == null ? 0L : g1Var.j();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i3 >= arrayList.size()) {
                return i10;
            }
            u0 u0Var = (u0) arrayList.get(i3);
            int i11 = u0Var.a;
            if (i11 >= 0 && i11 > this.G && (u0Var.b || !u0Var.e || u0Var.g >= j10)) {
                i10++;
            }
            i3++;
        }
    }

    public abstract void h(long j10);

    public abstract void i(int i3, int i10, long j10);

    public abstract void j();

    public final void k(boolean z10) {
        this.e0.run();
        ArrayList arrayList = new ArrayList();
        if (this.U != null) {
            for (int i3 = 0; i3 < this.U.size(); i3++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i3);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long e10 = h10.i(this.O).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e10 = org.telegram.messenger.m5.o(defaultSendAs);
        }
        k0 k0Var = new k0(0);
        tc tcVar = new tc(getContext(), this.O, this.N, null, null, arrayList, !z10, true, e10, k0Var);
        k2 k2Var = (k2) this;
        tcVar.H1 = k2Var;
        tcVar.J1 = new a1.c(k2Var, 24);
        tcVar.show();
    }

    public final void l(int i3, int i10, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z11) {
        long j12;
        int i11;
        TL_phone.groupCallDonor groupcalldonor;
        v0 v0Var;
        boolean z12;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i12 >= arrayList.size()) {
                int i13 = this.O;
                int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                u0 u0Var = new u0();
                u0Var.d = i3;
                u0Var.b = z10;
                u0Var.c = j10;
                u0Var.f = tL_textWithEntities;
                u0Var.g = j11;
                u0Var.a = i10;
                u0Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = u.b(i13, (int) u0Var.g, 0);
                long j13 = u0Var.g;
                long j14 = 0;
                ArrayList arrayList2 = this.s;
                if (j13 <= 0 || b10 <= 0 || currentTime - u0Var.d > b10) {
                    j12 = 0;
                } else {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            j12 = j14;
                            v0Var = null;
                            break;
                        }
                        j12 = j14;
                        if (((v0) arrayList2.get(i14)).b == j10) {
                            v0Var = (v0) arrayList2.get(i14);
                            break;
                        } else {
                            i14++;
                            j14 = j12;
                        }
                    }
                    if (v0Var == null) {
                        v0Var = new v0();
                        ArrayList arrayList3 = new ArrayList();
                        v0Var.f = arrayList3;
                        v0Var.a = i13;
                        v0Var.b = j10;
                        arrayList3.add(u0Var);
                        arrayList2.add(0, v0Var);
                        z12 = true;
                    } else {
                        v0Var.f.add(u0Var);
                        this.f.g1();
                        z12 = false;
                    }
                    v0Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a3.u(this, 10));
                    if (!z11) {
                        this.n.O(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && u0Var.e) {
                    long j15 = u0Var.g;
                    if (j15 > j12) {
                        this.R += j15;
                        j();
                    }
                }
                if (u0Var.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (u0Var.a < ((u0) arrayList.get(size)).a) {
                            i11 = size + 1;
                            break;
                        }
                    }
                }
                i11 = 0;
                arrayList.add(i11, u0Var);
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.O(true);
                }
                if (i11 <= 0 && !z11 && (!this.c.canScrollVertically(1) || u0Var.a < 0)) {
                    this.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                    int i15 = u0Var.a;
                    if (i15 > 0) {
                        this.G = i15;
                    }
                }
                invalidate();
                k2 k2Var = (k2) this;
                a aVar = k2Var.j0.H1;
                if (aVar != null) {
                    aVar.setCount(k2Var.getUnreadMessagesCount());
                }
                if (!z11 && i10 > 0 && u0Var.g > j12) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= this.U.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (org.telegram.messenger.m5.o(((TL_phone.groupCallDonor) this.U.get(i16)).peer_id) == u0Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i16);
                                break;
                            }
                            i16++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = h10.i(i13).e() == u0Var.c;
                        groupcalldonor.peer_id = hp.s1(i13).z1(u0Var.c);
                        groupcalldonor.stars = j12;
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            if (((v0) arrayList2.get(i17)).b == u0Var.c) {
                                ((v0) arrayList2.get(i17)).b();
                                groupcalldonor.stars += ((v0) arrayList2.get(i17)).d;
                            }
                        }
                        this.U.add(groupcalldonor);
                    }
                    long j16 = groupcalldonor.stars;
                    long j17 = u0Var.g;
                    long j18 = j16 + j17;
                    groupcalldonor.stars = j18;
                    i((int) j18, (int) j17, u0Var.c);
                }
                t();
                if (z11) {
                    c0 c0Var = this.h0;
                    org.telegram.messenger.g0.r(c0Var);
                    org.telegram.messenger.g0.i3(c0Var, 100L);
                }
                g1 g1Var = this.Q;
                if (g1Var != null) {
                    g1Var.V = arrayList;
                    g1Var.W = arrayList2;
                    return;
                }
                return;
            }
            if (((u0) arrayList.get(i12)).a == i10) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void m() {
        int i3;
        a0 a0Var = this.F;
        if (a0Var != null) {
            org.telegram.messenger.g0.r(a0Var);
            this.F = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.O).getCurrentTime();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v0 v0Var = (v0) obj;
            ArrayList arrayList2 = v0Var.f;
            int size2 = arrayList2.size();
            int i11 = currentTime;
            int i12 = 0;
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                u0 u0Var = (u0) obj2;
                int i14 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (u0Var.g > 0) {
                    i11 = Math.min(i11, u0Var.d);
                    i3 = i14;
                    i12 = Math.max(i12, u.b(v0Var.a, (int) u0Var.g, 0) + u0Var.d);
                } else {
                    i3 = i14;
                }
                arrayList = arrayList3;
                currentTime = i3;
            }
            j10 = Math.min(j10, Math.max(0, i12 - r19) * 1000);
            arrayList = arrayList;
            currentTime = currentTime;
        }
        if (j10 >= Long.MAX_VALUE) {
            return;
        }
        a0 a0Var2 = new a0(this, 1);
        this.F = a0Var2;
        org.telegram.messenger.g0.i3(a0Var2, j10);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        int i3;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i10 = this.O;
        final int j12 = h10.i(i10).j();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.P;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j11 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j11;
        }
        sendgroupcallmessage.random_id = Utilities.b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = hp.s1(i10).j1(j10);
        ConnectionsManager.getInstance(h10.t0).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: ei.z
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                w0 w0Var = w0.this;
                int i11 = j12;
                if (!z11) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new ci.p9(w0Var, i11, tL_error, j11, j10, tL_textWithEntities));
                        return;
                    }
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList z02 = hp.z0(updates, TL_update.TL_updateMessageID.class);
                int size = z02.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = z02.get(i12);
                    i12++;
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                    if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                        int i13 = tL_updateMessageID.id;
                        ArrayList arrayList = w0Var.r;
                        int size2 = arrayList.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size2) {
                                Object obj2 = arrayList.get(i14);
                                i14++;
                                u0 u0Var = (u0) obj2;
                                if (u0Var.a == i11) {
                                    u0Var.a = i13;
                                    break;
                                }
                            }
                        }
                    }
                }
                hp.s1(w0Var.O).O3(updates, false);
            }
        });
        if (this.U != null && j11 > 0) {
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
                groupcalldonor.stars += j11;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = hp.s1(i10).z1(j10);
                groupcalldonor2.stars = j11;
                this.U.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(h10.t0).getCurrentTime();
        if (j10 == this.N || f()) {
            i3 = j12;
            z10 = true;
        } else {
            i3 = j12;
            z10 = false;
        }
        l(currentTime, i3, z10, j10, tL_textWithEntities, j11, false);
        int i12 = i3;
        q(false, true);
        return i12;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        return n(getDefaultPeerId(), tL_textWithEntities, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.P != null) {
            c0 c0Var = this.W;
            org.telegram.messenger.g0.r(c0Var);
            org.telegram.messenger.g0.h3(c0Var);
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
        ac acVar = this.a0;
        c0 c0Var = this.e0;
        int i3 = 0;
        if (acVar == null || !acVar.l) {
            b bVar = new b();
            ub ubVar = new ub(getContext(), bVar);
            this.b0 = ubVar;
            ubVar.c(R.raw.stars_topup, new String[0]);
            this.b0.b.setText(getStarsToastTitle());
            yb ybVar = new yb(getContext(), bVar, true, false);
            this.c0 = ybVar;
            ybVar.e(bd.M0(2131745033, null));
            this.c0.b = new a0((k2) this, i3);
            tb tbVar = new tb(getContext(), bVar);
            this.d0 = tbVar;
            tbVar.b = 5000L;
            tbVar.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, bVar));
            this.c0.addView(this.d0, mf.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.c0.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
            this.b0.setButton(this.c0);
            ac f10 = ac.f(this.b, this.b0, -1);
            this.a0 = f10;
            f10.r = false;
            f10.k(true);
            this.a0.v = c0Var;
        }
        this.S++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.S, getDefaultPeerId());
        this.b0.b.setText(getStarsToastTitle());
        this.b0.c.setText(getStarsToastSubtitle());
        this.d0.b = 5000L;
        org.telegram.messenger.g0.r(c0Var);
        org.telegram.messenger.g0.i3(c0Var, 5000L);
        long j10 = this.S;
        w1 w1Var = ((k2) this).j0.J1;
        v1 v1Var = w1Var.a;
        v1Var.c(w1Var);
        if (v1Var.s) {
            v1Var.s = false;
            v1Var.a(1.0f, null);
        }
        ArrayList arrayList = v1Var.e;
        while (arrayList.size() > 4) {
            ((ch0) arrayList.remove(0)).C(true);
        }
        int[] iArr = v1Var.f;
        ch0 ch0Var = new ch0(iArr[Utilities.c.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        ch0Var.R(v1Var);
        ch0Var.J(true);
        ch0Var.K(0);
        ch0Var.start();
        arrayList.add(ch0Var);
        v1Var.invalidate();
        org.telegram.ui.Components.g6 g6Var = v1Var.c;
        g6Var.a();
        g6Var.t(k2.p1.l(j10, ',', new StringBuilder("+")), true, true);
        t1 t1Var = v1Var.d;
        org.telegram.messenger.g0.r(t1Var);
        org.telegram.messenger.g0.i3(t1Var, 1500L);
        w1Var.getLocationInWindow(w1Var.G);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - w1Var.E < 100) {
            w1Var.F += 0.5f;
        } else {
            w1Var.F = Utilities.i(1.0f - ((r9 - 100) / 200.0f), 1.0f, 0.0f) * w1Var.F;
            LaunchActivity.b0((w1Var.getWidth() / 2.0f) + r0[0], (w1Var.getHeight() / 2.0f) + r0[1], Utilities.i(w1Var.F, 0.9f, 0.3f));
            w1Var.F = 0.0f;
            w1Var.E = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j10, TLRPC.InputGroupCall inputGroupCall) {
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
        int i3 = hs.H2;
        int i10 = this.O;
        if (inputGroupCall3 != null) {
            hs.f(i10).n(this, i3);
        }
        this.N = j10;
        this.P = inputGroupCall;
        if (inputGroupCall != null) {
            hs.f(i10).c(this, i3);
        }
        if (z10) {
            this.e0.run();
            c0 c0Var = this.W;
            if (inputGroupCall == null) {
                org.telegram.messenger.g0.r(c0Var);
                return z10;
            }
            c0Var.run();
        }
        return z10;
    }

    public final float s() {
        return Math.max(Math.max(0.0f, this.L - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.H = z10;
    }

    public void setLivePlayer(g1 g1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z10 = this.Q == null;
        this.Q = g1Var;
        if (!z10 || g1Var == null || (arrayList = g1Var.V) == null || (arrayList2 = g1Var.W) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(g1Var.V);
        arrayList4.addAll(g1Var.W);
        this.e.O(true);
        ConnectionsManager.getInstance(this.O).getCurrentTime();
        Collections.sort(arrayList4, new a3.u(this, 10));
        this.n.O(true);
        u(false);
    }

    public final void t() {
        t0 t0Var;
        v0 v0Var;
        p0 p0Var;
        u0 u0Var;
        HashMap hashMap = this.w;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.U;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a3.u(11));
        int size = arrayList.size();
        int i3 = 0;
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
            ci.j1 j1Var = this.c;
            if (i14 >= j1Var.getChildCount()) {
                break;
            }
            View childAt = j1Var.getChildAt(i14);
            if ((childAt instanceof p0) && (u0Var = (p0Var = (p0) childAt).L) != null) {
                int e10 = e(u0Var.c);
                u0 u0Var2 = p0Var.L;
                if (e10 != u0Var2.h) {
                    u0Var2.h = e10;
                    p0Var.set(u0Var2);
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
            u0 u0Var3 = (u0) arrayList3.get(i15);
            int e11 = e(u0Var3.c);
            if (e11 != u0Var3.h) {
                u0Var3.h = e11;
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            u51 u51Var = this.f;
            if (i16 >= u51Var.getChildCount()) {
                break;
            }
            View childAt2 = u51Var.getChildAt(i16);
            if ((childAt2 instanceof t0) && (v0Var = (t0Var = (t0) childAt2).f) != null) {
                int e12 = e(v0Var.b);
                v0 v0Var2 = t0Var.f;
                if (e12 != v0Var2.e) {
                    v0Var2.e = e12;
                    t0Var.set(v0Var2);
                }
            }
            i16++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i3 >= arrayList4.size()) {
                return;
            }
            v0 v0Var3 = (v0) arrayList4.get(i3);
            int e13 = e(v0Var3.b);
            if (e13 != v0Var3.e) {
                v0Var3.e = e13;
            }
            i3++;
        }
    }

    public final void u(boolean z10) {
        ArrayList arrayList = this.s;
        if (z10 && this.K == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.K = !isEmpty;
        ci.j1 j1Var = this.c;
        u51 u51Var = this.f;
        if (z10) {
            ViewPropertyAnimator translationY = j1Var.animate().translationY(this.K ? 0.0f : org.telegram.messenger.g0.L(35.0f));
            xq xqVar = xq.h;
            translationY.setInterpolator(xqVar).setUpdateListener(new bh.f(this, 13)).setDuration(420L).start();
            u51Var.animate().translationY(this.K ? 0.0f : org.telegram.messenger.g0.L(35.0f)).alpha(this.K ? 1.0f : 0.0f).setInterpolator(xqVar).setDuration(420L).start();
            return;
        }
        j1Var.setTranslationY(!isEmpty ? 0.0f : org.telegram.messenger.g0.L(35.0f));
        u51Var.setTranslationY(this.K ? 0.0f : org.telegram.messenger.g0.L(35.0f));
        u51Var.setAlpha(this.K ? 1.0f : 0.0f);
        invalidate();
    }
}
