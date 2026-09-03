package oh;

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
import mh.eb;
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
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h20;
import org.telegram.ui.qb1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class v0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public x B;
    public int C;
    public boolean D;
    public long E;
    public final h20 F;
    public boolean G;
    public float H;
    public float I;
    public long J;
    public final int K;
    public TLRPC.InputGroupCall L;
    public e1 M;
    public long N;
    public long O;
    public boolean P;
    public ArrayList Q;
    public boolean R;
    public final y S;
    public ic T;
    public cc U;
    public gc V;
    public bc W;
    public final View a;
    public final y a0;
    public final FrameLayout b;
    public ValueAnimator b0;
    public final mh.d1 c;
    public boolean c0;
    public final f2.j0 d;
    public final y d0;
    public final e0 e;
    public final qb1 f;
    public final f2.j0 h;
    public final w51 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap v;
    public long w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r6v3, types: [oh.c0] */
    public v0(Context context, i9 i9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = new HashMap();
        this.C = -1;
        this.D = true;
        this.F = new h20();
        int i10 = UserConfig.selectedAccount;
        this.K = i10;
        this.Q = new ArrayList();
        final h2 h2Var = (h2) this;
        this.S = new y(h2Var, 0);
        this.a0 = new y(h2Var, 1);
        this.c0 = false;
        this.d0 = new y(h2Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        mh.d1 d1Var = new mh.d1(h2Var, context, 1);
        this.c = d1Var;
        d1Var.setWillNotDraw(false);
        f2.j0 j0Var = new f2.j0(1, true);
        this.d = j0Var;
        d1Var.setLayoutManager(j0Var);
        final int i11 = 0;
        e0 e0Var = new e0(h2Var, d1Var, context, i10, new Utilities.Callback2() { // from class: oh.c0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                h2 h2Var2 = h2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = h2Var2.r;
                        e1 e1Var = h2Var2.M;
                        long j10 = e1Var == null ? 0L : e1Var.j();
                        h2Var2.E = j10;
                        while (i13 < arrayList2.size()) {
                            t0 t0Var = (t0) arrayList2.get(i13);
                            if (t0Var.b || !t0Var.e || t0Var.g >= j10) {
                                int i14 = n0.a;
                                h51 J = h51.J(n0.class);
                                J.G = t0Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = h2Var2.s;
                        while (i13 < arrayList3.size()) {
                            u0 u0Var = (u0) arrayList3.get(i13);
                            int i15 = r0.a;
                            h51 J2 = h51.J(r0.class);
                            J2.G = u0Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, new b());
        this.e = e0Var;
        d1Var.setAdapter(e0Var);
        e0Var.r = false;
        d1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        d1Var.setClipToPadding(false);
        addView(d1Var, k7.c6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        d1Var.setOnItemClickListener(new d0(h2Var, viewGroup, i9Var, 0));
        f0 f0Var = new f0(h2Var);
        f0Var.m = false;
        f0Var.C = false;
        pr prVar = pr.h;
        f0Var.o(prVar);
        f0Var.n(280L);
        f0Var.D = 14L;
        d1Var.setItemAnimator(f0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new androidx.mediarouter.app.c(h2Var, 25));
        final int i12 = 1;
        qb1 qb1Var = new qb1(context, i12, null);
        this.f = qb1Var;
        qb1Var.setWillNotDraw(false);
        f2.j0 j0Var2 = new f2.j0(0, false);
        this.h = j0Var2;
        qb1Var.setLayoutManager(j0Var2);
        w51 w51Var = new w51(qb1Var, context, i10, 0, false, new Utilities.Callback2() { // from class: oh.c0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i122 = i12;
                int i13 = 0;
                h2 h2Var2 = h2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i122) {
                    case 0:
                        ArrayList arrayList2 = h2Var2.r;
                        e1 e1Var = h2Var2.M;
                        long j10 = e1Var == null ? 0L : e1Var.j();
                        h2Var2.E = j10;
                        while (i13 < arrayList2.size()) {
                            t0 t0Var = (t0) arrayList2.get(i13);
                            if (t0Var.b || !t0Var.e || t0Var.g >= j10) {
                                int i14 = n0.a;
                                h51 J = h51.J(n0.class);
                                J.G = t0Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = h2Var2.s;
                        while (i13 < arrayList3.size()) {
                            u0 u0Var = (u0) arrayList3.get(i13);
                            int i15 = r0.a;
                            h51 J2 = h51.J(r0.class);
                            J2.G = u0Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, null);
        this.n = w51Var;
        qb1Var.setAdapter(w51Var);
        w51Var.r = false;
        qb1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        qb1Var.setClipToPadding(false);
        addView(qb1Var, k7.c6.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        qb1Var.setOnItemClickListener(new mh.m5(h2Var, 8));
        g0 g0Var = new g0();
        g0Var.m = false;
        g0Var.C = false;
        g0Var.o(prVar);
        g0Var.n(350L);
        qb1Var.setItemAnimator(g0Var);
        u(false);
    }

    public static Integer a(v0 v0Var, Long l10) {
        v0Var.a0.run();
        v0Var.O = l10.longValue();
        ic M = new qc(v0Var.b, new b()).M(v0Var.getStarsToastTitle(), v0Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z4 = false;
        M.r = false;
        M.k(true);
        v0Var.O = 0L;
        v0Var.P = true;
        int o10 = v0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        e1 e1Var = v0Var.M;
        long j10 = e1Var != null ? e1Var.j() : 0L;
        if (v0Var.getDefaultPeerId() == v0Var.J && v0Var.f()) {
            z4 = true;
        }
        return (l10.longValue() >= j10 || z4) ? Integer.valueOf(o10) : Integer.valueOf(TLObject.FLAG_31);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        e1 e1Var = this.M;
        if (e1Var != null && e1Var.l()) {
            if (this.M.v == null ? false : !r1.messages_enabled) {
                return this.J;
            }
        }
        return defaultSendAs == null ? UserConfig.getInstance(this.K).getClientUserId() : DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        mh.d1 d1Var = this.c;
        int height = d1Var.getHeight();
        for (int i10 = 0; i10 < d1Var.getChildCount(); i10++) {
            height = Math.min(d1Var.getChildAt(i10).getTop(), height);
        }
        return d1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.O)));
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private int getTotalMyStars() {
        int i10 = (int) (0 + this.O);
        for (int i11 = 0; i11 < this.Q.size(); i11++) {
            if (((TL_phone.groupCallDonor) this.Q.get(i11)).my) {
                i10 = (int) (i10 + ((TL_phone.groupCallDonor) this.Q.get(i11)).stars);
            }
        }
        return i10;
    }

    public final void b() {
        this.O = 0L;
        h(getDefaultPeerId());
        s1 s1Var = ((h2) this).f0.W1;
        r1 r1Var = s1Var.a;
        r1Var.c(s1Var);
        r1Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        t0 t0Var;
        ArrayList arrayList2;
        boolean z4 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.r;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                t0Var = null;
                break;
            } else {
                if (((t0) arrayList.get(i11)).a == i10) {
                    t0Var = (t0) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (t0Var == null) {
            return;
        }
        if (t0Var.a < 0 && t0Var.e) {
            long j10 = t0Var.g;
            if (j10 > 0) {
                this.N -= j10;
                j();
            }
        }
        int i12 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((u0) arrayList2.get(i12)).f.contains(t0Var)) {
                ((u0) arrayList2.get(i12)).f.remove(t0Var);
                if (((u0) arrayList2.get(i12)).f.isEmpty()) {
                    arrayList2.remove(i12);
                    z4 = true;
                } else {
                    ((u0) arrayList2.get(i12)).c();
                    m();
                }
            } else {
                i12++;
            }
        }
        arrayList.remove(i11);
        this.e.N(true);
        if (z4) {
            ConnectionsManager.getInstance(this.K).getCurrentTime();
            Collections.sort(arrayList2, new e5.f(this, 27));
            this.n.N(true);
            t();
            u(true);
        }
    }

    public final o0 d(int i10) {
        o0 o0Var;
        t0 t0Var;
        int i11 = 0;
        while (true) {
            mh.d1 d1Var = this.c;
            if (i11 >= d1Var.getChildCount()) {
                return null;
            }
            View childAt = d1Var.getChildAt(i11);
            if ((childAt instanceof o0) && (t0Var = (o0Var = (o0) childAt).H) != null && t0Var.a == i10) {
                return o0Var;
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
                    TLRPC.InputGroupCall inputGroupCall = this.L;
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
            TLRPC.InputGroupCall inputGroupCall2 = this.L;
            if (inputGroupCall2 != null && inputGroupCall2.id == longValue) {
                TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                int i13 = groupCallMessage.date;
                int i14 = groupCallMessage.id;
                boolean z4 = groupCallMessage.from_admin;
                long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                l(i13, i14, z4, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.D) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mh.d1 d1Var = this.c;
        if (view != d1Var) {
            return super.drawChild(canvas, view, j10);
        }
        if (d1Var.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.H - d1Var.getTop()) + d1Var.getY();
        canvas.saveLayerAlpha(d1Var.getX(), d1Var.getY(), d1Var.getX() + d1Var.getWidth(), d1Var.getY() + d1Var.getHeight(), 255, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((d1Var.getY() + d1Var.getHeight()) - max, getListViewTop()) * (1.0f - d1Var.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
        h20 h20Var = this.F;
        h20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (d1Var.getY() + d1Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), d1Var.getHeight() + d1Var.getBottom());
        h20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return drawChild;
    }

    public final int e(long j10) {
        return ((Integer) Map.-EL.getOrDefault(this.v, Long.valueOf(j10), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.J) {
            return false;
        }
        long j10 = this.J;
        int i10 = this.K;
        if (j10 >= 0) {
            return j10 == UserConfig.getInstance(i10).getClientUserId();
        }
        e1 e1Var = this.M;
        if (e1Var == null || (inputGroupCall = this.L) == null || inputGroupCall.id != e1Var.g() || (groupCall = this.M.v) == null || !groupCall.creator) {
            return ChatObject.canManageCalls(MessagesController.getInstance(i10).getChat(Long.valueOf(-this.J)));
        }
        return true;
    }

    public final boolean g() {
        return this.c0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        mh.d1 d1Var = this.c;
        int height = d1Var.getHeight();
        for (int i10 = 0; i10 < d1Var.getChildCount(); i10++) {
            height = Math.min(d1Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.r.size();
    }

    public long getStarsCount() {
        return this.N + this.O;
    }

    public int getUnreadMessagesCount() {
        int i10 = 0;
        if (this.C < 0) {
            return 0;
        }
        e1 e1Var = this.M;
        long j10 = e1Var == null ? 0L : e1Var.j();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            t0 t0Var = (t0) arrayList.get(i10);
            int i12 = t0Var.a;
            if (i12 >= 0 && i12 > this.C && (t0Var.b || !t0Var.e || t0Var.g >= j10)) {
                i11++;
            }
            i10++;
        }
    }

    public abstract void h(long j10);

    public abstract void i(int i10, int i11, long j10);

    public abstract void j();

    public final void k(boolean z4) {
        this.a0.run();
        ArrayList arrayList = new ArrayList();
        if (this.Q != null) {
            for (int i10 = 0; i10 < this.Q.size(); i10++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.Q.get(i10);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long clientUserId = UserConfig.getInstance(this.K).getClientUserId();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        h0 h0Var = new h0(0);
        eb ebVar = new eb(getContext(), this.K, this.J, null, null, arrayList, !z4, true, clientUserId, h0Var);
        h2 h2Var = (h2) this;
        ebVar.K = h2Var;
        ebVar.M = new mh.m5(h2Var, 7);
        ebVar.show();
    }

    public final void l(int i10, int i11, boolean z4, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z10) {
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        u0 u0Var;
        boolean z11;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i13 >= arrayList.size()) {
                int i14 = this.K;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                t0 t0Var = new t0();
                t0Var.d = i10;
                t0Var.b = z4;
                t0Var.c = j10;
                t0Var.f = tL_textWithEntities;
                t0Var.g = j11;
                t0Var.a = i11;
                t0Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = s.b(i14, (int) t0Var.g, 0);
                long j12 = t0Var.g;
                ArrayList arrayList2 = this.s;
                if (j12 > 0 && b10 > 0 && currentTime - t0Var.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            u0Var = null;
                            break;
                        } else {
                            if (((u0) arrayList2.get(i15)).b == j10) {
                                u0Var = (u0) arrayList2.get(i15);
                                break;
                            }
                            i15++;
                        }
                    }
                    if (u0Var == null) {
                        u0Var = new u0();
                        ArrayList arrayList3 = new ArrayList();
                        u0Var.f = arrayList3;
                        u0Var.a = i14;
                        u0Var.b = j10;
                        arrayList3.add(t0Var);
                        arrayList2.add(0, u0Var);
                        z11 = true;
                    } else {
                        u0Var.f.add(t0Var);
                        this.f.e1();
                        z11 = false;
                    }
                    u0Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new e5.f(this, 27));
                    if (!z10) {
                        this.n.N(true);
                    }
                    if (z11) {
                        this.h.n0(0);
                    }
                }
                if (!z10 && t0Var.e) {
                    long j13 = t0Var.g;
                    if (j13 > 0) {
                        this.N += j13;
                        j();
                    }
                }
                if (t0Var.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (t0Var.a < ((t0) arrayList.get(size)).a) {
                            i12 = size + 1;
                            break;
                        }
                    }
                }
                i12 = 0;
                arrayList.add(i12, t0Var);
                if (!z10) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.N(true);
                }
                if (i12 <= 0 && !z10 && (!this.c.canScrollVertically(1) || t0Var.a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i16 = t0Var.a;
                    if (i16 > 0) {
                        this.C = i16;
                    }
                }
                invalidate();
                h2 h2Var = (h2) this;
                a aVar = h2Var.f0.U1;
                if (aVar != null) {
                    aVar.setCount(h2Var.getUnreadMessagesCount());
                }
                if (!z10 && i11 > 0 && t0Var.g > 0) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= this.Q.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.Q.get(i17)).peer_id) == t0Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.Q.get(i17);
                                break;
                            }
                            i17++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = UserConfig.getInstance(i14).getClientUserId() == t0Var.c;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(t0Var.c);
                        groupcalldonor.stars = 0L;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((u0) arrayList2.get(i18)).b == t0Var.c) {
                                ((u0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((u0) arrayList2.get(i18)).d;
                            }
                        }
                        this.Q.add(groupcalldonor);
                    }
                    long j14 = groupcalldonor.stars;
                    long j15 = t0Var.g;
                    long j16 = j14 + j15;
                    groupcalldonor.stars = j16;
                    i((int) j16, (int) j15, t0Var.c);
                }
                t();
                if (z10) {
                    y yVar = this.d0;
                    AndroidUtilities.cancelRunOnUIThread(yVar);
                    AndroidUtilities.runOnUIThread(yVar, 100L);
                }
                e1 e1Var = this.M;
                if (e1Var != null) {
                    e1Var.R = arrayList;
                    e1Var.S = arrayList2;
                    return;
                }
                return;
            }
            if (((t0) arrayList.get(i13)).a == i11) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void m() {
        int i10;
        x xVar = this.B;
        if (xVar != null) {
            AndroidUtilities.cancelRunOnUIThread(xVar);
            this.B = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.K).getCurrentTime();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            u0 u0Var = (u0) obj;
            ArrayList arrayList2 = u0Var.f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                t0 t0Var = (t0) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (t0Var.g > 0) {
                    i12 = Math.min(i12, t0Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, s.b(u0Var.a, (int) t0Var.g, 0) + t0Var.d);
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
        this.B = xVar2;
        AndroidUtilities.runOnUIThread(xVar2, j10);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        int i10;
        boolean z4;
        TL_phone.groupCallDonor groupcalldonor;
        int i11 = this.K;
        final int newMessageId = UserConfig.getInstance(i11).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.L;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j11 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j11;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i11).getInputPeer(j10);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: oh.w
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z10 = tLObject instanceof TLRPC.Updates;
                v0 v0Var = v0.this;
                int i12 = newMessageId;
                if (!z10) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new mh.u7(v0Var, i12, tL_error, j11, j10, tL_textWithEntities));
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
                        ArrayList arrayList = v0Var.r;
                        int size2 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj2 = arrayList.get(i15);
                                i15++;
                                t0 t0Var = (t0) obj2;
                                if (t0Var.a == i12) {
                                    t0Var.a = i14;
                                    break;
                                }
                            }
                        }
                    }
                }
                MessagesController.getInstance(v0Var.K).processUpdates(updates, false);
            }
        });
        if (this.Q != null && j11 > 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= this.Q.size()) {
                    groupcalldonor = null;
                    break;
                }
                if (((TL_phone.groupCallDonor) this.Q.get(i12)).my) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.Q.get(i12);
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
                this.Q.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j10 == this.J || f()) {
            i10 = newMessageId;
            z4 = true;
        } else {
            i10 = newMessageId;
            z4 = false;
        }
        l(currentTime, i10, z4, j10, tL_textWithEntities, j11, false);
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
        if (this.L != null) {
            y yVar = this.S;
            AndroidUtilities.cancelRunOnUIThread(yVar);
            AndroidUtilities.runOnUIThread(yVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.L != null) {
            AndroidUtilities.cancelRunOnUIThread(this.S);
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
        ic icVar = this.T;
        y yVar = this.a0;
        if (icVar == null || !icVar.l) {
            b bVar = new b();
            cc ccVar = new cc(getContext(), bVar);
            this.U = ccVar;
            ccVar.c(R.raw.stars_topup, new String[0]);
            this.U.b.setText(getStarsToastTitle());
            gc gcVar = new gc(getContext(), bVar, true, false);
            this.V = gcVar;
            gcVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.V.a = new x((h2) this, 0);
            bc bcVar = new bc(getContext(), bVar);
            this.W = bcVar;
            bcVar.b = 5000L;
            bcVar.setColor(bVar.B0(org.telegram.ui.ActionBar.k6.Gi));
            this.V.addView(this.W, k7.c6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.V.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.U.setButton(this.V);
            ic f10 = ic.f(this.b, this.U, -1);
            this.T = f10;
            f10.r = false;
            f10.k(true);
            this.T.v = yVar;
        }
        this.O++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.O, getDefaultPeerId());
        this.U.b.setText(getStarsToastTitle());
        this.U.c.setText(getStarsToastSubtitle());
        this.W.b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(yVar);
        AndroidUtilities.runOnUIThread(yVar, 5000L);
        long j10 = this.O;
        s1 s1Var = ((h2) this).f0.W1;
        r1 r1Var = s1Var.a;
        r1Var.c(s1Var);
        if (r1Var.s) {
            r1Var.s = false;
            r1Var.a(1.0f, null);
        }
        ArrayList arrayList = r1Var.e;
        while (arrayList.size() > 4) {
            ((hj0) arrayList.remove(0)).A(true);
        }
        int[] iArr = r1Var.f;
        hj0 hj0Var = new hj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        hj0Var.s0 = r1Var;
        hj0Var.H(true);
        hj0Var.I(0);
        hj0Var.start();
        arrayList.add(hj0Var);
        r1Var.invalidate();
        org.telegram.ui.Components.j6 j6Var = r1Var.c;
        j6Var.b();
        j6Var.q(l.d.l(j10, ',', new StringBuilder("+")), true, true);
        p1 p1Var = r1Var.d;
        AndroidUtilities.cancelRunOnUIThread(p1Var);
        AndroidUtilities.runOnUIThread(p1Var, 1500L);
        s1Var.getLocationInWindow(s1Var.C);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - s1Var.y < 100) {
            s1Var.B += 0.5f;
        } else {
            s1Var.B = Utilities.clamp(1.0f - ((r10 - 100) / 200.0f), 1.0f, 0.0f) * s1Var.B;
            LaunchActivity.b0((s1Var.getWidth() / 2.0f) + r0[0], (s1Var.getHeight() / 2.0f) + r0[1], Utilities.clamp(s1Var.B, 0.9f, 0.3f));
            s1Var.B = 0.0f;
            s1Var.y = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z4, boolean z10);

    public final boolean r(long j10, TLRPC.InputGroupCall inputGroupCall) {
        boolean z4;
        TLRPC.InputGroupCall inputGroupCall2 = this.L;
        if ((inputGroupCall2 == null ? 0L : inputGroupCall2.id) != (inputGroupCall != null ? inputGroupCall.id : 0L)) {
            this.r.clear();
            z4 = true;
            this.e.N(true);
        } else {
            z4 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.L;
        int i10 = this.K;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.J = j10;
        this.L = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z4) {
            this.a0.run();
            y yVar = this.S;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(yVar);
                return z4;
            }
            yVar.run();
        }
        return z4;
    }

    public final float s() {
        return Math.max(Math.max(0.0f, this.H - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public void setAllowTouches(boolean z4) {
        this.D = z4;
    }

    public void setLivePlayer(e1 e1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z4 = this.M == null;
        this.M = e1Var;
        if (!z4 || e1Var == null || (arrayList = e1Var.R) == null || (arrayList2 = e1Var.S) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(e1Var.R);
        arrayList4.addAll(e1Var.S);
        this.e.N(true);
        ConnectionsManager.getInstance(this.K).getCurrentTime();
        Collections.sort(arrayList4, new e5.f(this, 27));
        this.n.N(true);
        u(false);
    }

    public final void t() {
        s0 s0Var;
        u0 u0Var;
        o0 o0Var;
        t0 t0Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.Q;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new e5.f(28));
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
            mh.d1 d1Var = this.c;
            if (i15 >= d1Var.getChildCount()) {
                break;
            }
            View childAt = d1Var.getChildAt(i15);
            if ((childAt instanceof o0) && (t0Var = (o0Var = (o0) childAt).H) != null) {
                int e6 = e(t0Var.c);
                t0 t0Var2 = o0Var.H;
                if (e6 != t0Var2.h) {
                    t0Var2.h = e6;
                    o0Var.set(t0Var2);
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
            t0 t0Var3 = (t0) arrayList3.get(i16);
            int e10 = e(t0Var3.c);
            if (e10 != t0Var3.h) {
                t0Var3.h = e10;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            qb1 qb1Var = this.f;
            if (i17 >= qb1Var.getChildCount()) {
                break;
            }
            View childAt2 = qb1Var.getChildAt(i17);
            if ((childAt2 instanceof s0) && (u0Var = (s0Var = (s0) childAt2).f) != null) {
                int e11 = e(u0Var.b);
                u0 u0Var2 = s0Var.f;
                if (e11 != u0Var2.e) {
                    u0Var2.e = e11;
                    s0Var.set(u0Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i10 >= arrayList4.size()) {
                return;
            }
            u0 u0Var3 = (u0) arrayList4.get(i10);
            int e12 = e(u0Var3.b);
            if (e12 != u0Var3.e) {
                u0Var3.e = e12;
            }
            i10++;
        }
    }

    public final void u(boolean z4) {
        ArrayList arrayList = this.s;
        if (z4 && this.G == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.G = !isEmpty;
        mh.d1 d1Var = this.c;
        qb1 qb1Var = this.f;
        if (z4) {
            ViewPropertyAnimator translationY = d1Var.animate().translationY(this.G ? 0.0f : AndroidUtilities.dp(35.0f));
            pr prVar = pr.h;
            translationY.setInterpolator(prVar).setUpdateListener(new eg.m1(this, 21)).setDuration(420L).start();
            qb1Var.animate().translationY(this.G ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.G ? 1.0f : 0.0f).setInterpolator(prVar).setDuration(420L).start();
            return;
        }
        d1Var.setTranslationY(!isEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        qb1Var.setTranslationY(this.G ? 0.0f : AndroidUtilities.dp(35.0f));
        qb1Var.setAlpha(this.G ? 1.0f : 0.0f);
        invalidate();
    }
}
