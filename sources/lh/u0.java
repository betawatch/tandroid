package lh;

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
import jh.db;
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
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u10;
import org.telegram.ui.wa1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class u0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public x A;
    public int B;
    public boolean C;
    public long D;
    public final u10 E;
    public boolean F;
    public float G;
    public float H;
    public long I;
    public final int J;
    public TLRPC.InputGroupCall K;
    public d1 L;
    public long M;
    public long N;
    public boolean O;
    public ArrayList P;
    public boolean Q;
    public final y R;
    public mc S;
    public gc T;
    public kc U;
    public fc V;
    public final y W;
    public final View a;
    public ValueAnimator a0;
    public final FrameLayout b;
    public boolean b0;
    public final jh.e1 c;
    public final y c0;
    public final f2.j0 d;
    public final e0 e;
    public final wa1 f;
    public final f2.j0 h;
    public final k51 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap v;
    public long w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r6v3, types: [lh.c0] */
    public u0(Context context, i9 i9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = new HashMap();
        this.B = -1;
        this.C = true;
        this.E = new u10();
        int i10 = UserConfig.selectedAccount;
        this.J = i10;
        this.P = new ArrayList();
        final f2 f2Var = (f2) this;
        this.R = new y(f2Var, 0);
        this.W = new y(f2Var, 1);
        this.b0 = false;
        this.c0 = new y(f2Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        jh.e1 e1Var = new jh.e1(f2Var, context, 1);
        this.c = e1Var;
        e1Var.setWillNotDraw(false);
        f2.j0 j0Var = new f2.j0(1, true);
        this.d = j0Var;
        e1Var.setLayoutManager(j0Var);
        final int i11 = 0;
        e0 e0Var = new e0(f2Var, e1Var, context, i10, new Utilities.Callback2() { // from class: lh.c0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                f2 f2Var2 = f2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = f2Var2.r;
                        d1 d1Var = f2Var2.L;
                        long j10 = d1Var == null ? 0L : d1Var.j();
                        f2Var2.D = j10;
                        while (i13 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i13);
                            if (s0Var.b || !s0Var.e || s0Var.g >= j10) {
                                int i14 = m0.a;
                                w41 J = w41.J(m0.class);
                                J.G = s0Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = f2Var2.s;
                        while (i13 < arrayList3.size()) {
                            t0 t0Var = (t0) arrayList3.get(i13);
                            int i15 = q0.a;
                            w41 J2 = w41.J(q0.class);
                            J2.G = t0Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, new b());
        this.e = e0Var;
        e1Var.setAdapter(e0Var);
        e0Var.r = false;
        e1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        e1Var.setClipToPadding(false);
        addView(e1Var, i7.f6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        e1Var.setOnItemClickListener(new d0(f2Var, viewGroup, i9Var, 0));
        f0 f0Var = new f0(f2Var);
        f0Var.m = false;
        f0Var.C = false;
        jr jrVar = jr.h;
        f0Var.o(jrVar);
        f0Var.n(280L);
        f0Var.D = 14L;
        e1Var.setItemAnimator(f0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new ag.o(f2Var, 25));
        final int i12 = 1;
        wa1 wa1Var = new wa1(context, i12, null);
        this.f = wa1Var;
        wa1Var.setWillNotDraw(false);
        f2.j0 j0Var2 = new f2.j0(0, false);
        this.h = j0Var2;
        wa1Var.setLayoutManager(j0Var2);
        k51 k51Var = new k51(wa1Var, context, i10, 0, false, new Utilities.Callback2() { // from class: lh.c0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i122 = i12;
                int i13 = 0;
                f2 f2Var2 = f2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i122) {
                    case 0:
                        ArrayList arrayList2 = f2Var2.r;
                        d1 d1Var = f2Var2.L;
                        long j10 = d1Var == null ? 0L : d1Var.j();
                        f2Var2.D = j10;
                        while (i13 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i13);
                            if (s0Var.b || !s0Var.e || s0Var.g >= j10) {
                                int i14 = m0.a;
                                w41 J = w41.J(m0.class);
                                J.G = s0Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = f2Var2.s;
                        while (i13 < arrayList3.size()) {
                            t0 t0Var = (t0) arrayList3.get(i13);
                            int i15 = q0.a;
                            w41 J2 = w41.J(q0.class);
                            J2.G = t0Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, null);
        this.n = k51Var;
        wa1Var.setAdapter(k51Var);
        k51Var.r = false;
        wa1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        wa1Var.setClipToPadding(false);
        addView(wa1Var, i7.f6.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        wa1Var.setOnItemClickListener(new l4.s0(f2Var, 3));
        g0 g0Var = new g0();
        g0Var.m = false;
        g0Var.C = false;
        g0Var.o(jrVar);
        g0Var.n(350L);
        wa1Var.setItemAnimator(g0Var);
        u(false);
    }

    public static Integer a(u0 u0Var, Long l10) {
        u0Var.W.run();
        u0Var.N = l10.longValue();
        mc M = new tc(u0Var.b, new b()).M(u0Var.getStarsToastTitle(), u0Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.r = false;
        M.k(true);
        u0Var.N = 0L;
        u0Var.O = true;
        int o10 = u0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        d1 d1Var = u0Var.L;
        long j10 = d1Var != null ? d1Var.j() : 0L;
        if (u0Var.getDefaultPeerId() == u0Var.I && u0Var.f()) {
            z10 = true;
        }
        return (l10.longValue() >= j10 || z10) ? Integer.valueOf(o10) : Integer.valueOf(TLObject.FLAG_31);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        d1 d1Var = this.L;
        if (d1Var != null && d1Var.l()) {
            if (this.L.v == null ? false : !r1.messages_enabled) {
                return this.I;
            }
        }
        return defaultSendAs == null ? UserConfig.getInstance(this.J).getClientUserId() : DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        jh.e1 e1Var = this.c;
        int height = e1Var.getHeight();
        for (int i10 = 0; i10 < e1Var.getChildCount(); i10++) {
            height = Math.min(e1Var.getChildAt(i10).getTop(), height);
        }
        return e1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.N)));
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private int getTotalMyStars() {
        int i10 = (int) (0 + this.N);
        for (int i11 = 0; i11 < this.P.size(); i11++) {
            if (((TL_phone.groupCallDonor) this.P.get(i11)).my) {
                i10 = (int) (i10 + ((TL_phone.groupCallDonor) this.P.get(i11)).stars);
            }
        }
        return i10;
    }

    public final void b() {
        this.N = 0L;
        h(getDefaultPeerId());
        r1 r1Var = ((f2) this).e0.V1;
        q1 q1Var = r1Var.a;
        q1Var.c(r1Var);
        q1Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        s0 s0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.r;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                s0Var = null;
                break;
            } else {
                if (((s0) arrayList.get(i11)).a == i10) {
                    s0Var = (s0) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (s0Var == null) {
            return;
        }
        if (s0Var.a < 0 && s0Var.e) {
            long j10 = s0Var.g;
            if (j10 > 0) {
                this.M -= j10;
                j();
            }
        }
        int i12 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((t0) arrayList2.get(i12)).f.contains(s0Var)) {
                ((t0) arrayList2.get(i12)).f.remove(s0Var);
                if (((t0) arrayList2.get(i12)).f.isEmpty()) {
                    arrayList2.remove(i12);
                    z10 = true;
                } else {
                    ((t0) arrayList2.get(i12)).c();
                    m();
                }
            } else {
                i12++;
            }
        }
        arrayList.remove(i11);
        this.e.N(true);
        if (z10) {
            ConnectionsManager.getInstance(this.J).getCurrentTime();
            Collections.sort(arrayList2, new c5.e(this, 26));
            this.n.N(true);
            t();
            u(true);
        }
    }

    public final n0 d(int i10) {
        n0 n0Var;
        s0 s0Var;
        int i11 = 0;
        while (true) {
            jh.e1 e1Var = this.c;
            if (i11 >= e1Var.getChildCount()) {
                return null;
            }
            View childAt = e1Var.getChildAt(i11);
            if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).G) != null && s0Var.a == i10) {
                return n0Var;
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
                    TLRPC.InputGroupCall inputGroupCall = this.K;
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
            TLRPC.InputGroupCall inputGroupCall2 = this.K;
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
        if (!this.C) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        jh.e1 e1Var = this.c;
        if (view != e1Var) {
            return super.drawChild(canvas, view, j10);
        }
        if (e1Var.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.G - e1Var.getTop()) + e1Var.getY();
        canvas.saveLayerAlpha(e1Var.getX(), e1Var.getY(), e1Var.getX() + e1Var.getWidth(), e1Var.getY() + e1Var.getHeight(), 255, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((e1Var.getY() + e1Var.getHeight()) - max, getListViewTop()) * (1.0f - e1Var.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
        u10 u10Var = this.E;
        u10Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (e1Var.getY() + e1Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), e1Var.getHeight() + e1Var.getBottom());
        u10Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return drawChild;
    }

    public final int e(long j10) {
        return ((Integer) Map.-EL.getOrDefault(this.v, Long.valueOf(j10), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.I) {
            return false;
        }
        long j10 = this.I;
        int i10 = this.J;
        if (j10 >= 0) {
            return j10 == UserConfig.getInstance(i10).getClientUserId();
        }
        d1 d1Var = this.L;
        if (d1Var == null || (inputGroupCall = this.K) == null || inputGroupCall.id != d1Var.g() || (groupCall = this.L.v) == null || !groupCall.creator) {
            return ChatObject.canManageCalls(MessagesController.getInstance(i10).getChat(Long.valueOf(-this.I)));
        }
        return true;
    }

    public final boolean g() {
        return this.b0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        jh.e1 e1Var = this.c;
        int height = e1Var.getHeight();
        for (int i10 = 0; i10 < e1Var.getChildCount(); i10++) {
            height = Math.min(e1Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.r.size();
    }

    public long getStarsCount() {
        return this.M + this.N;
    }

    public int getUnreadMessagesCount() {
        int i10 = 0;
        if (this.B < 0) {
            return 0;
        }
        d1 d1Var = this.L;
        long j10 = d1Var == null ? 0L : d1Var.j();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            s0 s0Var = (s0) arrayList.get(i10);
            int i12 = s0Var.a;
            if (i12 >= 0 && i12 > this.B && (s0Var.b || !s0Var.e || s0Var.g >= j10)) {
                i11++;
            }
            i10++;
        }
    }

    public abstract void h(long j10);

    public abstract void i(int i10, int i11, long j10);

    public abstract void j();

    public final void k(boolean z10) {
        this.W.run();
        ArrayList arrayList = new ArrayList();
        if (this.P != null) {
            for (int i10 = 0; i10 < this.P.size(); i10++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i10);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long clientUserId = UserConfig.getInstance(this.J).getClientUserId();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        h0 h0Var = new h0(0);
        db dbVar = new db(getContext(), this.J, this.I, null, null, arrayList, !z10, true, clientUserId, h0Var);
        f2 f2Var = (f2) this;
        dbVar.J = f2Var;
        dbVar.L = new l4.s0(f2Var, 2);
        dbVar.show();
    }

    public final void l(int i10, int i11, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z11) {
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        t0 t0Var;
        boolean z12;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i13 >= arrayList.size()) {
                int i14 = this.J;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                s0 s0Var = new s0();
                s0Var.d = i10;
                s0Var.b = z10;
                s0Var.c = j10;
                s0Var.f = tL_textWithEntities;
                s0Var.g = j11;
                s0Var.a = i11;
                s0Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = s.b(i14, (int) s0Var.g, 0);
                long j12 = s0Var.g;
                ArrayList arrayList2 = this.s;
                if (j12 > 0 && b10 > 0 && currentTime - s0Var.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            t0Var = null;
                            break;
                        } else {
                            if (((t0) arrayList2.get(i15)).b == j10) {
                                t0Var = (t0) arrayList2.get(i15);
                                break;
                            }
                            i15++;
                        }
                    }
                    if (t0Var == null) {
                        t0Var = new t0();
                        ArrayList arrayList3 = new ArrayList();
                        t0Var.f = arrayList3;
                        t0Var.a = i14;
                        t0Var.b = j10;
                        arrayList3.add(s0Var);
                        arrayList2.add(0, t0Var);
                        z12 = true;
                    } else {
                        t0Var.f.add(s0Var);
                        this.f.f1();
                        z12 = false;
                    }
                    t0Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new c5.e(this, 26));
                    if (!z11) {
                        this.n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && s0Var.e) {
                    long j13 = s0Var.g;
                    if (j13 > 0) {
                        this.M += j13;
                        j();
                    }
                }
                if (s0Var.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (s0Var.a < ((s0) arrayList.get(size)).a) {
                            i12 = size + 1;
                            break;
                        }
                    }
                }
                i12 = 0;
                arrayList.add(i12, s0Var);
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.N(true);
                }
                if (i12 <= 0 && !z11 && (!this.c.canScrollVertically(1) || s0Var.a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i16 = s0Var.a;
                    if (i16 > 0) {
                        this.B = i16;
                    }
                }
                invalidate();
                f2 f2Var = (f2) this;
                a aVar = f2Var.e0.T1;
                if (aVar != null) {
                    aVar.setCount(f2Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && s0Var.g > 0) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= this.P.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.P.get(i17)).peer_id) == s0Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i17);
                                break;
                            }
                            i17++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = UserConfig.getInstance(i14).getClientUserId() == s0Var.c;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(s0Var.c);
                        groupcalldonor.stars = 0L;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((t0) arrayList2.get(i18)).b == s0Var.c) {
                                ((t0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((t0) arrayList2.get(i18)).d;
                            }
                        }
                        this.P.add(groupcalldonor);
                    }
                    long j14 = groupcalldonor.stars;
                    long j15 = s0Var.g;
                    long j16 = j14 + j15;
                    groupcalldonor.stars = j16;
                    i((int) j16, (int) j15, s0Var.c);
                }
                t();
                if (z11) {
                    y yVar = this.c0;
                    AndroidUtilities.cancelRunOnUIThread(yVar);
                    AndroidUtilities.runOnUIThread(yVar, 100L);
                }
                d1 d1Var = this.L;
                if (d1Var != null) {
                    d1Var.Q = arrayList;
                    d1Var.R = arrayList2;
                    return;
                }
                return;
            }
            if (((s0) arrayList.get(i13)).a == i11) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void m() {
        int i10;
        x xVar = this.A;
        if (xVar != null) {
            AndroidUtilities.cancelRunOnUIThread(xVar);
            this.A = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.J).getCurrentTime();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t0 t0Var = (t0) obj;
            ArrayList arrayList2 = t0Var.f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                s0 s0Var = (s0) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (s0Var.g > 0) {
                    i12 = Math.min(i12, s0Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, s.b(t0Var.a, (int) s0Var.g, 0) + s0Var.d);
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
        x xVar2 = new x(this, 1);
        this.A = xVar2;
        AndroidUtilities.runOnUIThread(xVar2, j10);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        int i10;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i11 = this.J;
        final int newMessageId = UserConfig.getInstance(i11).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.K;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j11 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j11;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i11).getInputPeer(j10);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: lh.w
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                u0 u0Var = u0.this;
                int i12 = newMessageId;
                if (!z11) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new jh.t7(u0Var, i12, tL_error, j11, j10, tL_textWithEntities));
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
                        ArrayList arrayList = u0Var.r;
                        int size2 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj2 = arrayList.get(i15);
                                i15++;
                                s0 s0Var = (s0) obj2;
                                if (s0Var.a == i12) {
                                    s0Var.a = i14;
                                    break;
                                }
                            }
                        }
                    }
                }
                MessagesController.getInstance(u0Var.J).processUpdates(updates, false);
            }
        });
        if (this.P != null && j11 > 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= this.P.size()) {
                    groupcalldonor = null;
                    break;
                }
                if (((TL_phone.groupCallDonor) this.P.get(i12)).my) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i12);
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
                this.P.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j10 == this.I || f()) {
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
        if (this.K != null) {
            y yVar = this.R;
            AndroidUtilities.cancelRunOnUIThread(yVar);
            AndroidUtilities.runOnUIThread(yVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.K != null) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
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
        mc mcVar = this.S;
        y yVar = this.W;
        if (mcVar == null || !mcVar.l) {
            b bVar = new b();
            gc gcVar = new gc(getContext(), bVar);
            this.T = gcVar;
            gcVar.c(R.raw.stars_topup, new String[0]);
            this.T.b.setText(getStarsToastTitle());
            kc kcVar = new kc(getContext(), bVar, true, false);
            this.U = kcVar;
            kcVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.U.a = new x((f2) this, 0);
            fc fcVar = new fc(getContext(), bVar);
            this.V = fcVar;
            fcVar.b = 5000L;
            fcVar.setColor(bVar.C0(org.telegram.ui.ActionBar.g6.Gi));
            this.U.addView(this.V, i7.f6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.U.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.T.setButton(this.U);
            mc f9 = mc.f(this.b, this.T, -1);
            this.S = f9;
            f9.r = false;
            f9.k(true);
            this.S.v = yVar;
        }
        this.N++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.N, getDefaultPeerId());
        this.T.b.setText(getStarsToastTitle());
        this.T.c.setText(getStarsToastSubtitle());
        this.V.b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(yVar);
        AndroidUtilities.runOnUIThread(yVar, 5000L);
        long j10 = this.N;
        r1 r1Var = ((f2) this).e0.V1;
        q1 q1Var = r1Var.a;
        q1Var.c(r1Var);
        if (q1Var.s) {
            q1Var.s = false;
            q1Var.a(1.0f, null);
        }
        ArrayList arrayList = q1Var.e;
        while (arrayList.size() > 4) {
            ((xi0) arrayList.remove(0)).A(true);
        }
        int[] iArr = q1Var.f;
        int i10 = iArr[Utilities.fastRandom.nextInt(iArr.length)];
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(70.0f), j7.l1.k(i10, ""), AndroidUtilities.dp(70.0f));
        xi0Var.r0 = q1Var;
        xi0Var.H(true);
        xi0Var.I(0);
        xi0Var.start();
        arrayList.add(xi0Var);
        q1Var.invalidate();
        org.telegram.ui.Components.n6 n6Var = q1Var.c;
        n6Var.b();
        n6Var.q(j7.l1.m(j10, ',', new StringBuilder("+")), true, true);
        o1 o1Var = q1Var.d;
        AndroidUtilities.cancelRunOnUIThread(o1Var);
        AndroidUtilities.runOnUIThread(o1Var, 1500L);
        r1Var.getLocationInWindow(r1Var.B);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - r1Var.y < 100) {
            r1Var.A += 0.5f;
        } else {
            r1Var.A = Utilities.clamp(1.0f - ((r10 - 100) / 200.0f), 1.0f, 0.0f) * r1Var.A;
            LaunchActivity.b0((r1Var.getWidth() / 2.0f) + r0[0], (r1Var.getHeight() / 2.0f) + r0[1], Utilities.clamp(r1Var.A, 0.9f, 0.3f));
            r1Var.A = 0.0f;
            r1Var.y = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j10, TLRPC.InputGroupCall inputGroupCall) {
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.K;
        if ((inputGroupCall2 == null ? 0L : inputGroupCall2.id) != (inputGroupCall != null ? inputGroupCall.id : 0L)) {
            this.r.clear();
            z10 = true;
            this.e.N(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.K;
        int i10 = this.J;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.I = j10;
        this.K = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z10) {
            this.W.run();
            y yVar = this.R;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(yVar);
                return z10;
            }
            yVar.run();
        }
        return z10;
    }

    public final float s() {
        return Math.max(Math.max(0.0f, this.G - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.C = z10;
    }

    public void setLivePlayer(d1 d1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z10 = this.L == null;
        this.L = d1Var;
        if (!z10 || d1Var == null || (arrayList = d1Var.Q) == null || (arrayList2 = d1Var.R) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(d1Var.Q);
        arrayList4.addAll(d1Var.R);
        this.e.N(true);
        ConnectionsManager.getInstance(this.J).getCurrentTime();
        Collections.sort(arrayList4, new c5.e(this, 26));
        this.n.N(true);
        u(false);
    }

    public final void t() {
        r0 r0Var;
        t0 t0Var;
        n0 n0Var;
        s0 s0Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.P;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new c5.e(27));
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
            jh.e1 e1Var = this.c;
            if (i15 >= e1Var.getChildCount()) {
                break;
            }
            View childAt = e1Var.getChildAt(i15);
            if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).G) != null) {
                int e10 = e(s0Var.c);
                s0 s0Var2 = n0Var.G;
                if (e10 != s0Var2.h) {
                    s0Var2.h = e10;
                    n0Var.set(s0Var2);
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
            s0 s0Var3 = (s0) arrayList3.get(i16);
            int e11 = e(s0Var3.c);
            if (e11 != s0Var3.h) {
                s0Var3.h = e11;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            wa1 wa1Var = this.f;
            if (i17 >= wa1Var.getChildCount()) {
                break;
            }
            View childAt2 = wa1Var.getChildAt(i17);
            if ((childAt2 instanceof r0) && (t0Var = (r0Var = (r0) childAt2).f) != null) {
                int e12 = e(t0Var.b);
                t0 t0Var2 = r0Var.f;
                if (e12 != t0Var2.e) {
                    t0Var2.e = e12;
                    r0Var.set(t0Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i10 >= arrayList4.size()) {
                return;
            }
            t0 t0Var3 = (t0) arrayList4.get(i10);
            int e13 = e(t0Var3.b);
            if (e13 != t0Var3.e) {
                t0Var3.e = e13;
            }
            i10++;
        }
    }

    public final void u(boolean z10) {
        ArrayList arrayList = this.s;
        if (z10 && this.F == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.F = !isEmpty;
        jh.e1 e1Var = this.c;
        wa1 wa1Var = this.f;
        if (z10) {
            ViewPropertyAnimator translationY = e1Var.animate().translationY(this.F ? 0.0f : AndroidUtilities.dp(35.0f));
            jr jrVar = jr.h;
            translationY.setInterpolator(jrVar).setUpdateListener(new bg.q1(this, 21)).setDuration(420L).start();
            wa1Var.animate().translationY(this.F ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.F ? 1.0f : 0.0f).setInterpolator(jrVar).setDuration(420L).start();
            return;
        }
        e1Var.setTranslationY(!isEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        wa1Var.setTranslationY(this.F ? 0.0f : AndroidUtilities.dp(35.0f));
        wa1Var.setAlpha(this.F ? 1.0f : 0.0f);
        invalidate();
    }
}
