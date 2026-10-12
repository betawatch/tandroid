package bi;

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
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kc1;
import org.telegram.ui.p20;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public abstract class g1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public g0 E;
    public int F;
    public boolean G;
    public long H;
    public final p20 I;
    public boolean J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public TLRPC.InputGroupCall O;
    public t1 P;
    public long Q;
    public long R;
    public boolean S;
    public ArrayList T;
    public boolean U;
    public final h0 V;
    public sc W;
    public final View a;
    public mc a0;
    public final FrameLayout b;
    public qc b0;
    public final o0 c;
    public lc c0;
    public final s4.b0 d;
    public final h0 d0;
    public final p0 e;
    public ValueAnimator e0;
    public final kc1 f;
    public boolean f0;
    public final h0 g0;
    public final s4.b0 h;
    public final z61 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap v;
    public long w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r6v3, types: [bi.m0] */
    public g1(Context context, sb sbVar, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new p20();
        int i10 = UserConfig.selectedAccount;
        this.N = i10;
        this.T = new ArrayList();
        final h3 h3Var = (h3) this;
        this.V = new h0(h3Var, 0);
        this.d0 = new h0(h3Var, 1);
        this.f0 = false;
        this.g0 = new h0(h3Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        o0 o0Var = new o0(h3Var, context, 0);
        this.c = o0Var;
        o0Var.setWillNotDraw(false);
        s4.b0 b0Var = new s4.b0(1, true);
        this.d = b0Var;
        o0Var.setLayoutManager(b0Var);
        final int i11 = 0;
        p0 p0Var = new p0(h3Var, o0Var, context, i10, new Utilities.Callback2() { // from class: bi.m0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                h3 h3Var2 = h3Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = h3Var2.r;
                        t1 t1Var = h3Var2.P;
                        long j10 = t1Var == null ? 0L : t1Var.j();
                        h3Var2.H = j10;
                        while (i13 < arrayList2.size()) {
                            e1 e1Var = (e1) arrayList2.get(i13);
                            if (e1Var.b || !e1Var.e || e1Var.g >= j10) {
                                int i14 = y0.a;
                                l61 J = l61.J(y0.class);
                                J.G = e1Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = h3Var2.s;
                        while (i13 < arrayList3.size()) {
                            f1 f1Var = (f1) arrayList3.get(i13);
                            int i15 = c1.a;
                            l61 J2 = l61.J(c1.class);
                            J2.G = f1Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, new b());
        this.e = p0Var;
        o0Var.setAdapter(p0Var);
        p0Var.r = false;
        o0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        o0Var.setClipToPadding(false);
        addView(o0Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 34.0f, -1, 87));
        o0Var.setOnItemClickListener(new n0(h3Var, viewGroup, sbVar, 0));
        q0 q0Var = new q0(h3Var);
        q0Var.m = false;
        q0Var.C = false;
        es esVar = es.h;
        q0Var.o(esVar);
        q0Var.n(280L);
        q0Var.D = 14L;
        o0Var.setItemAnimator(q0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new ah.g0(h3Var, 2));
        final int i12 = 1;
        kc1 kc1Var = new kc1(context, i12, null);
        this.f = kc1Var;
        kc1Var.setWillNotDraw(false);
        s4.b0 b0Var2 = new s4.b0(0, false);
        this.h = b0Var2;
        kc1Var.setLayoutManager(b0Var2);
        z61 z61Var = new z61(kc1Var, context, i10, 0, false, new Utilities.Callback2() { // from class: bi.m0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i122 = i12;
                int i13 = 0;
                h3 h3Var2 = h3Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i122) {
                    case 0:
                        ArrayList arrayList2 = h3Var2.r;
                        t1 t1Var = h3Var2.P;
                        long j10 = t1Var == null ? 0L : t1Var.j();
                        h3Var2.H = j10;
                        while (i13 < arrayList2.size()) {
                            e1 e1Var = (e1) arrayList2.get(i13);
                            if (e1Var.b || !e1Var.e || e1Var.g >= j10) {
                                int i14 = y0.a;
                                l61 J = l61.J(y0.class);
                                J.G = e1Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = h3Var2.s;
                        while (i13 < arrayList3.size()) {
                            f1 f1Var = (f1) arrayList3.get(i13);
                            int i15 = c1.a;
                            l61 J2 = l61.J(c1.class);
                            J2.G = f1Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, null);
        this.n = z61Var;
        kc1Var.setAdapter(z61Var);
        z61Var.r = false;
        kc1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        kc1Var.setClipToPadding(false);
        addView(kc1Var, w7.a6.a(26.0f, 0.0f, 0.0f, 0.0f, 9.66f, -1, 87));
        kc1Var.setOnItemClickListener(new a1.c(h3Var, 5));
        r0 r0Var = new r0();
        r0Var.m = false;
        r0Var.C = false;
        r0Var.o(esVar);
        r0Var.n(350L);
        kc1Var.setItemAnimator(r0Var);
        u(false);
    }

    public static Integer a(g1 g1Var, Long l4) {
        g1Var.d0.run();
        g1Var.R = l4.longValue();
        sc M = new zc(g1Var.b, new b()).M(g1Var.getStarsToastTitle(), g1Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.r = false;
        M.k(true);
        g1Var.R = 0L;
        g1Var.S = true;
        int o10 = g1Var.o(new TLRPC.TL_textWithEntities(), l4.longValue());
        t1 t1Var = g1Var.P;
        long j10 = t1Var != null ? t1Var.j() : 0L;
        if (g1Var.getDefaultPeerId() == g1Var.M && g1Var.f()) {
            z10 = true;
        }
        return (l4.longValue() >= j10 || z10) ? Integer.valueOf(o10) : Integer.valueOf(TLObject.FLAG_31);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        t1 t1Var = this.P;
        if (t1Var != null && t1Var.l()) {
            if (this.P.v == null ? false : !r1.messages_enabled) {
                return this.M;
            }
        }
        return defaultSendAs == null ? UserConfig.getInstance(this.N).getClientUserId() : DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        o0 o0Var = this.c;
        int height = o0Var.getHeight();
        for (int i10 = 0; i10 < o0Var.getChildCount(); i10++) {
            height = Math.min(o0Var.getChildAt(i10).getTop(), height);
        }
        return o0Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.R)));
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private int getTotalMyStars() {
        int i10 = (int) (0 + this.R);
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            if (((TL_phone.groupCallDonor) this.T.get(i11)).my) {
                i10 = (int) (i10 + ((TL_phone.groupCallDonor) this.T.get(i11)).stars);
            }
        }
        return i10;
    }

    public final void b() {
        this.R = 0L;
        h(getDefaultPeerId());
        m2 m2Var = ((h3) this).i0.Z1;
        l2 l2Var = m2Var.a;
        l2Var.c(m2Var);
        l2Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        e1 e1Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.r;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                e1Var = null;
                break;
            } else {
                if (((e1) arrayList.get(i11)).a == i10) {
                    e1Var = (e1) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (e1Var == null) {
            return;
        }
        if (e1Var.a < 0 && e1Var.e) {
            long j10 = e1Var.g;
            if (j10 > 0) {
                this.Q -= j10;
                j();
            }
        }
        int i12 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((f1) arrayList2.get(i12)).f.contains(e1Var)) {
                ((f1) arrayList2.get(i12)).f.remove(e1Var);
                if (((f1) arrayList2.get(i12)).f.isEmpty()) {
                    arrayList2.remove(i12);
                    z10 = true;
                } else {
                    ((f1) arrayList2.get(i12)).c();
                    m();
                }
            } else {
                i12++;
            }
        }
        arrayList.remove(i11);
        this.e.N(true);
        if (z10) {
            ConnectionsManager.getInstance(this.N).getCurrentTime();
            Collections.sort(arrayList2, new a4.d(this, 5));
            this.n.N(true);
            t();
            u(true);
        }
    }

    public final z0 d(int i10) {
        z0 z0Var;
        e1 e1Var;
        int i11 = 0;
        while (true) {
            o0 o0Var = this.c;
            if (i11 >= o0Var.getChildCount()) {
                return null;
            }
            View childAt = o0Var.getChildAt(i11);
            if ((childAt instanceof z0) && (e1Var = (z0Var = (z0) childAt).K) != null && e1Var.a == i10) {
                return z0Var;
            }
            i11++;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.liveStoryMessageUpdate) {
            int i12 = 0;
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
                    while (i12 < size) {
                        Integer num = arrayList.get(i12);
                        i12++;
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
                int i13 = groupCallMessage.date;
                int i14 = groupCallMessage.id;
                boolean z10 = groupCallMessage.from_admin;
                long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                l(i13, i14, z10, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        o0 o0Var = this.c;
        if (view != o0Var) {
            return super.drawChild(canvas, view, j10);
        }
        if (o0Var.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.K - o0Var.getTop()) + o0Var.getY();
        canvas.saveLayerAlpha(o0Var.getX(), o0Var.getY(), o0Var.getX() + o0Var.getWidth(), o0Var.getY() + o0Var.getHeight(), 255, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((o0Var.getY() + o0Var.getHeight()) - max, getListViewTop()) * (1.0f - o0Var.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
        p20 p20Var = this.I;
        p20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (o0Var.getY() + o0Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), o0Var.getHeight() + o0Var.getBottom());
        p20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return drawChild;
    }

    public final int e(long j10) {
        return ((Integer) Map.-EL.getOrDefault(this.v, Long.valueOf(j10), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.M) {
            return false;
        }
        long j10 = this.M;
        int i10 = this.N;
        if (j10 >= 0) {
            return j10 == UserConfig.getInstance(i10).getClientUserId();
        }
        t1 t1Var = this.P;
        if (t1Var == null || (inputGroupCall = this.O) == null || inputGroupCall.id != t1Var.g() || (groupCall = this.P.v) == null || !groupCall.creator) {
            return ChatObject.canManageCalls(MessagesController.getInstance(i10).getChat(Long.valueOf(-this.M)));
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
        o0 o0Var = this.c;
        int height = o0Var.getHeight();
        for (int i10 = 0; i10 < o0Var.getChildCount(); i10++) {
            height = Math.min(o0Var.getChildAt(i10).getTop(), height);
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
        int i10 = 0;
        if (this.F < 0) {
            return 0;
        }
        t1 t1Var = this.P;
        long j10 = t1Var == null ? 0L : t1Var.j();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            e1 e1Var = (e1) arrayList.get(i10);
            int i12 = e1Var.a;
            if (i12 >= 0 && i12 > this.F && (e1Var.b || !e1Var.e || e1Var.g >= j10)) {
                i11++;
            }
            i10++;
        }
    }

    public abstract void h(long j10);

    public abstract void i(int i10, int i11, long j10);

    public abstract void j();

    public final void k(boolean z10) {
        this.d0.run();
        ArrayList arrayList = new ArrayList();
        if (this.T != null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i10);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long clientUserId = UserConfig.getInstance(this.N).getClientUserId();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        s0 s0Var = new s0(0);
        zh.h8 h8Var = new zh.h8(getContext(), this.N, this.M, null, null, arrayList, !z10, true, clientUserId, s0Var);
        h3 h3Var = (h3) this;
        h8Var.O = h3Var;
        h8Var.Q = new a1.c(h3Var, 4);
        h8Var.show();
    }

    public final void l(int i10, int i11, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z11) {
        long j12;
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        f1 f1Var;
        boolean z12;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i13 >= arrayList.size()) {
                int i14 = this.N;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                e1 e1Var = new e1();
                e1Var.d = i10;
                e1Var.b = z10;
                e1Var.c = j10;
                e1Var.f = tL_textWithEntities;
                e1Var.g = j11;
                e1Var.a = i11;
                e1Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = z.b(i14, (int) e1Var.g, 0);
                long j13 = e1Var.g;
                long j14 = 0;
                ArrayList arrayList2 = this.s;
                if (j13 <= 0 || b10 <= 0 || currentTime - e1Var.d > b10) {
                    j12 = 0;
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            j12 = j14;
                            f1Var = null;
                            break;
                        }
                        j12 = j14;
                        if (((f1) arrayList2.get(i15)).b == j10) {
                            f1Var = (f1) arrayList2.get(i15);
                            break;
                        } else {
                            i15++;
                            j14 = j12;
                        }
                    }
                    if (f1Var == null) {
                        f1Var = new f1();
                        ArrayList arrayList3 = new ArrayList();
                        f1Var.f = arrayList3;
                        f1Var.a = i14;
                        f1Var.b = j10;
                        arrayList3.add(e1Var);
                        arrayList2.add(0, f1Var);
                        z12 = true;
                    } else {
                        f1Var.f.add(e1Var);
                        this.f.f1();
                        z12 = false;
                    }
                    f1Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a4.d(this, 5));
                    if (!z11) {
                        this.n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && e1Var.e) {
                    long j15 = e1Var.g;
                    if (j15 > j12) {
                        this.Q += j15;
                        j();
                    }
                }
                if (e1Var.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (e1Var.a < ((e1) arrayList.get(size)).a) {
                            i12 = size + 1;
                            break;
                        }
                    }
                }
                i12 = 0;
                arrayList.add(i12, e1Var);
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.N(true);
                }
                if (i12 <= 0 && !z11 && (!this.c.canScrollVertically(1) || e1Var.a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i16 = e1Var.a;
                    if (i16 > 0) {
                        this.F = i16;
                    }
                }
                invalidate();
                h3 h3Var = (h3) this;
                a aVar = h3Var.i0.X1;
                if (aVar != null) {
                    aVar.setCount(h3Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && e1Var.g > j12) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= this.T.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.T.get(i17)).peer_id) == e1Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i17);
                                break;
                            }
                            i17++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = UserConfig.getInstance(i14).getClientUserId() == e1Var.c;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(e1Var.c);
                        groupcalldonor.stars = j12;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((f1) arrayList2.get(i18)).b == e1Var.c) {
                                ((f1) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((f1) arrayList2.get(i18)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j16 = groupcalldonor.stars;
                    long j17 = e1Var.g;
                    long j18 = j16 + j17;
                    groupcalldonor.stars = j18;
                    i((int) j18, (int) j17, e1Var.c);
                }
                t();
                if (z11) {
                    h0 h0Var = this.g0;
                    AndroidUtilities.cancelRunOnUIThread(h0Var);
                    AndroidUtilities.runOnUIThread(h0Var, 100L);
                }
                t1 t1Var = this.P;
                if (t1Var != null) {
                    t1Var.U = arrayList;
                    t1Var.V = arrayList2;
                    return;
                }
                return;
            }
            if (((e1) arrayList.get(i13)).a == i11) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void m() {
        int i10;
        g0 g0Var = this.E;
        if (g0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g0Var);
            this.E = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i11 = 0;
        long j10 = Long.MAX_VALUE;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            f1 f1Var = (f1) obj;
            ArrayList arrayList2 = f1Var.f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                e1 e1Var = (e1) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (e1Var.g > 0) {
                    i12 = Math.min(i12, e1Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, z.b(f1Var.a, (int) e1Var.g, 0) + e1Var.d);
                } else {
                    i10 = i15;
                }
                arrayList = arrayList3;
                currentTime = i10;
            }
            j10 = Math.min(j10, Math.max(0, i13 - r19) * 1000);
            arrayList = arrayList;
            currentTime = currentTime;
        }
        if (j10 >= Long.MAX_VALUE) {
            return;
        }
        g0 g0Var2 = new g0(this, 1);
        this.E = g0Var2;
        AndroidUtilities.runOnUIThread(g0Var2, j10);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        int i10;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i11 = this.N;
        final int newMessageId = UserConfig.getInstance(i11).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.O;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j11 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j11;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i11).getInputPeer(j10);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: bi.e0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                g1 g1Var = g1.this;
                int i12 = newMessageId;
                if (!z11) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new i0(g1Var, i12, tL_error, j11, j10, tL_textWithEntities));
                        return;
                    }
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateMessageID.class);
                int size = findUpdatesAndRemove.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = findUpdatesAndRemove.get(i13);
                    i13++;
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                    if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                        int i14 = tL_updateMessageID.id;
                        ArrayList arrayList = g1Var.r;
                        int size2 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj2 = arrayList.get(i15);
                                i15++;
                                e1 e1Var = (e1) obj2;
                                if (e1Var.a == i12) {
                                    e1Var.a = i14;
                                    break;
                                }
                            }
                        }
                    }
                }
                MessagesController.getInstance(g1Var.N).lambda$processUpdates$377(updates, false);
            }
        });
        if (this.T != null && j11 > 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= this.T.size()) {
                    groupcalldonor = null;
                    break;
                }
                if (((TL_phone.groupCallDonor) this.T.get(i12)).my) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i12);
                    break;
                }
                i12++;
            }
            if (groupcalldonor != null) {
                groupcalldonor.stars += j11;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = MessagesController.getInstance(i11).getPeer(j10);
                groupcalldonor2.stars = j11;
                this.T.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j10 == this.M || f()) {
            i10 = newMessageId;
            z10 = true;
        } else {
            i10 = newMessageId;
            z10 = false;
        }
        l(currentTime, i10, z10, j10, tL_textWithEntities, j11, false);
        int i13 = i10;
        q(false, true);
        return i13;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        return n(getDefaultPeerId(), tL_textWithEntities, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.O != null) {
            h0 h0Var = this.V;
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            AndroidUtilities.runOnUIThread(h0Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.O != null) {
            AndroidUtilities.cancelRunOnUIThread(this.V);
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
        sc scVar = this.W;
        h0 h0Var = this.d0;
        if (scVar == null || !scVar.l) {
            b bVar = new b();
            mc mcVar = new mc(getContext(), bVar);
            this.a0 = mcVar;
            mcVar.c(R.raw.stars_topup, new String[0]);
            this.a0.b.setText(getStarsToastTitle());
            qc qcVar = new qc(getContext(), bVar, true, false);
            this.b0 = qcVar;
            qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.b0.a = new g0((h3) this, 0);
            lc lcVar = new lc(getContext(), bVar);
            this.c0 = lcVar;
            lcVar.b = 5000L;
            lcVar.setColor(bVar.F0(org.telegram.ui.ActionBar.g6.Gi));
            this.b0.addView(this.c0, w7.a6.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
            this.b0.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.a0.setButton(this.b0);
            sc f7 = sc.f(this.b, this.a0, -1);
            this.W = f7;
            f7.r = false;
            f7.k(true);
            this.W.v = h0Var;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.a0.b.setText(getStarsToastTitle());
        this.a0.c.setText(getStarsToastSubtitle());
        this.c0.b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(h0Var);
        AndroidUtilities.runOnUIThread(h0Var, 5000L);
        long j10 = this.R;
        m2 m2Var = ((h3) this).i0.Z1;
        l2 l2Var = m2Var.a;
        l2Var.c(m2Var);
        if (l2Var.s) {
            l2Var.s = false;
            l2Var.a(1.0f, null);
        }
        ArrayList arrayList = l2Var.e;
        while (arrayList.size() > 4) {
            ((yj0) arrayList.remove(0)).C(true);
        }
        int[] iArr = l2Var.f;
        yj0 yj0Var = new yj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        yj0Var.R(l2Var);
        yj0Var.J(true);
        yj0Var.K(0);
        yj0Var.start();
        arrayList.add(yj0Var);
        l2Var.invalidate();
        org.telegram.ui.Components.r6 r6Var = l2Var.c;
        r6Var.a();
        r6Var.t(org.telegram.messenger.q.i(j10, ',', new StringBuilder("+")), true, true);
        h2 h2Var = l2Var.d;
        AndroidUtilities.cancelRunOnUIThread(h2Var);
        AndroidUtilities.runOnUIThread(h2Var, 1500L);
        m2Var.getLocationInWindow(m2Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - m2Var.y < 100) {
            m2Var.E += 0.5f;
        } else {
            m2Var.E = Utilities.clamp(1.0f - ((r10 - 100) / 200.0f), 1.0f, 0.0f) * m2Var.E;
            LaunchActivity.b0((m2Var.getWidth() / 2.0f) + r0[0], (m2Var.getHeight() / 2.0f) + r0[1], Utilities.clamp(m2Var.E, 0.9f, 0.3f));
            m2Var.E = 0.0f;
            m2Var.y = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j10, TLRPC.InputGroupCall inputGroupCall) {
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.O;
        if ((inputGroupCall2 == null ? 0L : inputGroupCall2.id) != (inputGroupCall != null ? inputGroupCall.id : 0L)) {
            this.r.clear();
            z10 = true;
            this.e.N(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.O;
        int i10 = this.N;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.M = j10;
        this.O = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z10) {
            this.d0.run();
            h0 h0Var = this.V;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(h0Var);
                return z10;
            }
            h0Var.run();
        }
        return z10;
    }

    public final float s() {
        return Math.max(Math.max(0.0f, this.K - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.G = z10;
    }

    public void setLivePlayer(t1 t1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z10 = this.P == null;
        this.P = t1Var;
        if (!z10 || t1Var == null || (arrayList = t1Var.U) == null || (arrayList2 = t1Var.V) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(t1Var.U);
        arrayList4.addAll(t1Var.V);
        this.e.N(true);
        ConnectionsManager.getInstance(this.N).getCurrentTime();
        Collections.sort(arrayList4, new a4.d(this, 5));
        this.n.N(true);
        u(false);
    }

    public final void t() {
        d1 d1Var;
        f1 f1Var;
        z0 z0Var;
        e1 e1Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a4.d(6));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = TLObject.FLAG_31;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) obj;
            int i14 = (int) groupcalldonor.stars;
            if (i14 != i11) {
                i12++;
                i11 = i14;
            }
            if (i12 > 3) {
                break;
            } else {
                hashMap.put(Long.valueOf(DialogObject.getPeerDialogId(groupcalldonor.peer_id)), Integer.valueOf(i12));
            }
        }
        int i15 = 0;
        while (true) {
            o0 o0Var = this.c;
            if (i15 >= o0Var.getChildCount()) {
                break;
            }
            View childAt = o0Var.getChildAt(i15);
            if ((childAt instanceof z0) && (e1Var = (z0Var = (z0) childAt).K) != null) {
                int e = e(e1Var.c);
                e1 e1Var2 = z0Var.K;
                if (e != e1Var2.h) {
                    e1Var2.h = e;
                    z0Var.set(e1Var2);
                }
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList3 = this.r;
            if (i16 >= arrayList3.size()) {
                break;
            }
            e1 e1Var3 = (e1) arrayList3.get(i16);
            int e7 = e(e1Var3.c);
            if (e7 != e1Var3.h) {
                e1Var3.h = e7;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            kc1 kc1Var = this.f;
            if (i17 >= kc1Var.getChildCount()) {
                break;
            }
            View childAt2 = kc1Var.getChildAt(i17);
            if ((childAt2 instanceof d1) && (f1Var = (d1Var = (d1) childAt2).f) != null) {
                int e10 = e(f1Var.b);
                f1 f1Var2 = d1Var.f;
                if (e10 != f1Var2.e) {
                    f1Var2.e = e10;
                    d1Var.set(f1Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i10 >= arrayList4.size()) {
                return;
            }
            f1 f1Var3 = (f1) arrayList4.get(i10);
            int e11 = e(f1Var3.b);
            if (e11 != f1Var3.e) {
                f1Var3.e = e11;
            }
            i10++;
        }
    }

    public final void u(boolean z10) {
        ArrayList arrayList = this.s;
        if (z10 && this.J == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.J = !isEmpty;
        o0 o0Var = this.c;
        kc1 kc1Var = this.f;
        if (z10) {
            ViewPropertyAnimator translationY = o0Var.animate().translationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f));
            es esVar = es.h;
            translationY.setInterpolator(esVar).setUpdateListener(new ah.c0(this, 3)).setDuration(420L).start();
            kc1Var.animate().translationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.J ? 1.0f : 0.0f).setInterpolator(esVar).setDuration(420L).start();
            return;
        }
        o0Var.setTranslationY(!isEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        kc1Var.setTranslationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f));
        kc1Var.setAlpha(this.J ? 1.0f : 0.0f);
        invalidate();
    }
}
