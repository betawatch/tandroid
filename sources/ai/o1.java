package ai;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.p61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fc1;
import org.telegram.ui.j20;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class o1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public n0 E;
    public int F;
    public boolean G;
    public long H;
    public final j20 I;
    public boolean J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public TLRPC.InputGroupCall O;
    public d2 P;
    public long Q;
    public long R;
    public boolean S;
    public ArrayList T;
    public boolean U;
    public final o0 V;
    public org.telegram.ui.Components.tc W;
    public final View a;
    public org.telegram.ui.Components.nc a0;
    public final FrameLayout b;
    public org.telegram.ui.Components.rc b0;
    public final w0 c;
    public org.telegram.ui.Components.mc c0;
    public final s4.d0 d;
    public final o0 d0;
    public final x0 e;
    public ValueAnimator e0;
    public final fc1 f;
    public boolean f0;
    public final o0 g0;
    public final s4.d0 h;
    public final c71 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap v;
    public long w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r6v3, types: [ai.t0] */
    public o1(Context context, kc kcVar, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new j20();
        int i10 = UserConfig.selectedAccount;
        this.N = i10;
        this.T = new ArrayList();
        final s3 s3Var = (s3) this;
        this.V = new o0(s3Var, 0);
        this.d0 = new o0(s3Var, 1);
        this.f0 = false;
        this.g0 = new o0(s3Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        w0 w0Var = new w0(s3Var, context, 0);
        this.c = w0Var;
        w0Var.setWillNotDraw(false);
        s4.d0 d0Var = new s4.d0(1, true);
        this.d = d0Var;
        w0Var.setLayoutManager(d0Var);
        final int i11 = 0;
        x0 x0Var = new x0(s3Var, w0Var, context, i10, new Utilities.Callback2() { // from class: ai.t0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                s3 s3Var2 = s3Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = s3Var2.r;
                        d2 d2Var = s3Var2.P;
                        long j3 = d2Var == null ? 0L : d2Var.j();
                        s3Var2.H = j3;
                        while (i13 < arrayList2.size()) {
                            m1 m1Var = (m1) arrayList2.get(i13);
                            if (m1Var.b || !m1Var.e || m1Var.g >= j3) {
                                int i14 = g1.a;
                                p61 J = p61.J(g1.class);
                                J.G = m1Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = s3Var2.s;
                        while (i13 < arrayList3.size()) {
                            n1 n1Var = (n1) arrayList3.get(i13);
                            int i15 = k1.a;
                            p61 J2 = p61.J(k1.class);
                            J2.G = n1Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, new d());
        this.e = x0Var;
        w0Var.setAdapter(x0Var);
        x0Var.r = false;
        w0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        w0Var.setClipToPadding(false);
        addView(w0Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 34.0f, -1, 87));
        w0Var.setOnItemClickListener(new u0(s3Var, viewGroup, kcVar, 0));
        y0 y0Var = new y0(s3Var);
        y0Var.m = false;
        y0Var.C = false;
        hs hsVar = hs.h;
        y0Var.o(hsVar);
        y0Var.n(280L);
        y0Var.D = 14L;
        w0Var.setItemAnimator(y0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new v0(s3Var, 0));
        final int i12 = 1;
        fc1 fc1Var = new fc1(context, i12, null);
        this.f = fc1Var;
        fc1Var.setWillNotDraw(false);
        s4.d0 d0Var2 = new s4.d0(0, false);
        this.h = d0Var2;
        fc1Var.setLayoutManager(d0Var2);
        c71 c71Var = new c71(fc1Var, context, i10, 0, false, new Utilities.Callback2() { // from class: ai.t0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i122 = i12;
                int i13 = 0;
                s3 s3Var2 = s3Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i122) {
                    case 0:
                        ArrayList arrayList2 = s3Var2.r;
                        d2 d2Var = s3Var2.P;
                        long j3 = d2Var == null ? 0L : d2Var.j();
                        s3Var2.H = j3;
                        while (i13 < arrayList2.size()) {
                            m1 m1Var = (m1) arrayList2.get(i13);
                            if (m1Var.b || !m1Var.e || m1Var.g >= j3) {
                                int i14 = g1.a;
                                p61 J = p61.J(g1.class);
                                J.G = m1Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = s3Var2.s;
                        while (i13 < arrayList3.size()) {
                            n1 n1Var = (n1) arrayList3.get(i13);
                            int i15 = k1.a;
                            p61 J2 = p61.J(k1.class);
                            J2.G = n1Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, null);
        this.n = c71Var;
        fc1Var.setAdapter(c71Var);
        c71Var.r = false;
        fc1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        fc1Var.setClipToPadding(false);
        addView(fc1Var, w7.x5.a(26.0f, 0.0f, 0.0f, 0.0f, 9.66f, -1, 87));
        fc1Var.setOnItemClickListener(new a1.c(s3Var, 4));
        z0 z0Var = new z0();
        z0Var.m = false;
        z0Var.C = false;
        z0Var.o(hsVar);
        z0Var.n(350L);
        fc1Var.setItemAnimator(z0Var);
        u(false);
    }

    public static Integer a(o1 o1Var, Long l4) {
        o1Var.d0.run();
        o1Var.R = l4.longValue();
        org.telegram.ui.Components.tc M = new ad(o1Var.b, new d()).M(o1Var.getStarsToastTitle(), o1Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.r = false;
        M.k(true);
        o1Var.R = 0L;
        o1Var.S = true;
        int o9 = o1Var.o(new TLRPC.TL_textWithEntities(), l4.longValue());
        d2 d2Var = o1Var.P;
        long j3 = d2Var != null ? d2Var.j() : 0L;
        if (o1Var.getDefaultPeerId() == o1Var.M && o1Var.f()) {
            z10 = true;
        }
        return (l4.longValue() >= j3 || z10) ? Integer.valueOf(o9) : Integer.valueOf(TLObject.FLAG_31);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        d2 d2Var = this.P;
        if (d2Var != null && d2Var.l()) {
            if (this.P.v == null ? false : !r1.messages_enabled) {
                return this.M;
            }
        }
        return defaultSendAs == null ? UserConfig.getInstance(this.N).getClientUserId() : DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        w0 w0Var = this.c;
        int height = w0Var.getHeight();
        for (int i10 = 0; i10 < w0Var.getChildCount(); i10++) {
            height = Math.min(w0Var.getChildAt(i10).getTop(), height);
        }
        return w0Var.getHeight() - height;
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
        y2 y2Var = ((s3) this).i0.Z1;
        x2 x2Var = y2Var.a;
        x2Var.c(y2Var);
        x2Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        m1 m1Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.r;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                m1Var = null;
                break;
            } else {
                if (((m1) arrayList.get(i11)).a == i10) {
                    m1Var = (m1) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (m1Var == null) {
            return;
        }
        if (m1Var.a < 0 && m1Var.e) {
            long j3 = m1Var.g;
            if (j3 > 0) {
                this.Q -= j3;
                j();
            }
        }
        int i12 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((n1) arrayList2.get(i12)).f.contains(m1Var)) {
                ((n1) arrayList2.get(i12)).f.remove(m1Var);
                if (((n1) arrayList2.get(i12)).f.isEmpty()) {
                    arrayList2.remove(i12);
                    z10 = true;
                } else {
                    ((n1) arrayList2.get(i12)).c();
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
            Collections.sort(arrayList2, new a4.d(this, 2));
            this.n.N(true);
            t();
            u(true);
        }
    }

    public final h1 d(int i10) {
        h1 h1Var;
        m1 m1Var;
        int i11 = 0;
        while (true) {
            w0 w0Var = this.c;
            if (i11 >= w0Var.getChildCount()) {
                return null;
            }
            View childAt = w0Var.getChildAt(i11);
            if ((childAt instanceof h1) && (m1Var = (h1Var = (h1) childAt).K) != null && m1Var.a == i10) {
                return h1Var;
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        w0 w0Var = this.c;
        if (view != w0Var) {
            return super.drawChild(canvas, view, j3);
        }
        if (w0Var.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.K - w0Var.getTop()) + w0Var.getY();
        canvas.saveLayerAlpha(w0Var.getX(), w0Var.getY(), w0Var.getX() + w0Var.getWidth(), w0Var.getY() + w0Var.getHeight(), 255, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((w0Var.getY() + w0Var.getHeight()) - max, getListViewTop()) * (1.0f - w0Var.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
        j20 j20Var = this.I;
        j20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (w0Var.getY() + w0Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), w0Var.getHeight() + w0Var.getBottom());
        j20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return drawChild;
    }

    public final int e(long j3) {
        return ((Integer) Map.-EL.getOrDefault(this.v, Long.valueOf(j3), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.M) {
            return false;
        }
        long j3 = this.M;
        int i10 = this.N;
        if (j3 >= 0) {
            return j3 == UserConfig.getInstance(i10).getClientUserId();
        }
        d2 d2Var = this.P;
        if (d2Var == null || (inputGroupCall = this.O) == null || inputGroupCall.id != d2Var.g() || (groupCall = this.P.v) == null || !groupCall.creator) {
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
        w0 w0Var = this.c;
        int height = w0Var.getHeight();
        for (int i10 = 0; i10 < w0Var.getChildCount(); i10++) {
            height = Math.min(w0Var.getChildAt(i10).getTop(), height);
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
        d2 d2Var = this.P;
        long j3 = d2Var == null ? 0L : d2Var.j();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            m1 m1Var = (m1) arrayList.get(i10);
            int i12 = m1Var.a;
            if (i12 >= 0 && i12 > this.F && (m1Var.b || !m1Var.e || m1Var.g >= j3)) {
                i11++;
            }
            i10++;
        }
    }

    public abstract void h(long j3);

    public abstract void i(int i10, int i11, long j3);

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
        a1 a1Var = new a1(0);
        yh.h8 h8Var = new yh.h8(getContext(), this.N, this.M, null, null, arrayList, !z10, true, clientUserId, a1Var);
        s3 s3Var = (s3) this;
        h8Var.O = s3Var;
        h8Var.Q = new a1.c(s3Var, 3);
        h8Var.show();
    }

    public final void l(int i10, int i11, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z11) {
        long j11;
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        n1 n1Var;
        boolean z12;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i13 >= arrayList.size()) {
                int i14 = this.N;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                m1 m1Var = new m1();
                m1Var.d = i10;
                m1Var.b = z10;
                m1Var.c = j3;
                m1Var.f = tL_textWithEntities;
                m1Var.g = j10;
                m1Var.a = i11;
                m1Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = g0.b(i14, (int) m1Var.g, 0);
                long j12 = m1Var.g;
                long j13 = 0;
                ArrayList arrayList2 = this.s;
                if (j12 <= 0 || b10 <= 0 || currentTime - m1Var.d > b10) {
                    j11 = 0;
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            j11 = j13;
                            n1Var = null;
                            break;
                        }
                        j11 = j13;
                        if (((n1) arrayList2.get(i15)).b == j3) {
                            n1Var = (n1) arrayList2.get(i15);
                            break;
                        } else {
                            i15++;
                            j13 = j11;
                        }
                    }
                    if (n1Var == null) {
                        n1Var = new n1();
                        ArrayList arrayList3 = new ArrayList();
                        n1Var.f = arrayList3;
                        n1Var.a = i14;
                        n1Var.b = j3;
                        arrayList3.add(m1Var);
                        arrayList2.add(0, n1Var);
                        z12 = true;
                    } else {
                        n1Var.f.add(m1Var);
                        this.f.f1();
                        z12 = false;
                    }
                    n1Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a4.d(this, 2));
                    if (!z11) {
                        this.n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && m1Var.e) {
                    long j14 = m1Var.g;
                    if (j14 > j11) {
                        this.Q += j14;
                        j();
                    }
                }
                if (m1Var.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (m1Var.a < ((m1) arrayList.get(size)).a) {
                            i12 = size + 1;
                            break;
                        }
                    }
                }
                i12 = 0;
                arrayList.add(i12, m1Var);
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.N(true);
                }
                if (i12 <= 0 && !z11 && (!this.c.canScrollVertically(1) || m1Var.a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i16 = m1Var.a;
                    if (i16 > 0) {
                        this.F = i16;
                    }
                }
                invalidate();
                s3 s3Var = (s3) this;
                c cVar = s3Var.i0.X1;
                if (cVar != null) {
                    cVar.setCount(s3Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && m1Var.g > j11) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= this.T.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.T.get(i17)).peer_id) == m1Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i17);
                                break;
                            }
                            i17++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = UserConfig.getInstance(i14).getClientUserId() == m1Var.c;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(m1Var.c);
                        groupcalldonor.stars = j11;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((n1) arrayList2.get(i18)).b == m1Var.c) {
                                ((n1) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((n1) arrayList2.get(i18)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j15 = groupcalldonor.stars;
                    long j16 = m1Var.g;
                    long j17 = j15 + j16;
                    groupcalldonor.stars = j17;
                    i((int) j17, (int) j16, m1Var.c);
                }
                t();
                if (z11) {
                    o0 o0Var = this.g0;
                    AndroidUtilities.cancelRunOnUIThread(o0Var);
                    AndroidUtilities.runOnUIThread(o0Var, 100L);
                }
                d2 d2Var = this.P;
                if (d2Var != null) {
                    d2Var.U = arrayList;
                    d2Var.V = arrayList2;
                    return;
                }
                return;
            }
            if (((m1) arrayList.get(i13)).a == i11) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void m() {
        int i10;
        n0 n0Var = this.E;
        if (n0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n0Var);
            this.E = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i11 = 0;
        long j3 = Long.MAX_VALUE;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            n1 n1Var = (n1) obj;
            ArrayList arrayList2 = n1Var.f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                m1 m1Var = (m1) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (m1Var.g > 0) {
                    i12 = Math.min(i12, m1Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, g0.b(n1Var.a, (int) m1Var.g, 0) + m1Var.d);
                } else {
                    i10 = i15;
                }
                arrayList = arrayList3;
                currentTime = i10;
            }
            j3 = Math.min(j3, Math.max(0, i13 - r19) * 1000);
            arrayList = arrayList;
            currentTime = currentTime;
        }
        if (j3 >= Long.MAX_VALUE) {
            return;
        }
        n0 n0Var2 = new n0(this, 1);
        this.E = n0Var2;
        AndroidUtilities.runOnUIThread(n0Var2, j3);
    }

    public final int n(final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j10) {
        int i10;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i11 = this.N;
        final int newMessageId = UserConfig.getInstance(i11).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.O;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j10 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j10;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i11).getInputPeer(j3);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: ai.l0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                o1 o1Var = o1.this;
                int i12 = newMessageId;
                if (!z11) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new p0(o1Var, i12, tL_error, j10, j3, tL_textWithEntities));
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
                        ArrayList arrayList = o1Var.r;
                        int size2 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj2 = arrayList.get(i15);
                                i15++;
                                m1 m1Var = (m1) obj2;
                                if (m1Var.a == i12) {
                                    m1Var.a = i14;
                                    break;
                                }
                            }
                        }
                    }
                }
                MessagesController.getInstance(o1Var.N).lambda$processUpdates$377(updates, false);
            }
        });
        if (this.T != null && j10 > 0) {
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
                groupcalldonor.stars += j10;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = MessagesController.getInstance(i11).getPeer(j3);
                groupcalldonor2.stars = j10;
                this.T.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j3 == this.M || f()) {
            i10 = newMessageId;
            z10 = true;
        } else {
            i10 = newMessageId;
            z10 = false;
        }
        l(currentTime, i10, z10, j3, tL_textWithEntities, j10, false);
        int i13 = i10;
        q(false, true);
        return i13;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j3) {
        return n(getDefaultPeerId(), tL_textWithEntities, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.O != null) {
            o0 o0Var = this.V;
            AndroidUtilities.cancelRunOnUIThread(o0Var);
            AndroidUtilities.runOnUIThread(o0Var);
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
        org.telegram.ui.Components.tc tcVar = this.W;
        o0 o0Var = this.d0;
        if (tcVar == null || !tcVar.l) {
            d dVar = new d();
            org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(getContext(), dVar);
            this.a0 = ncVar;
            ncVar.c(R.raw.stars_topup, new String[0]);
            this.a0.b.setText(getStarsToastTitle());
            org.telegram.ui.Components.rc rcVar = new org.telegram.ui.Components.rc(getContext(), dVar, true, false);
            this.b0 = rcVar;
            rcVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.b0.a = new n0((s3) this, 0);
            org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(getContext(), dVar);
            this.c0 = mcVar;
            mcVar.b = 5000L;
            mcVar.setColor(dVar.x0(org.telegram.ui.ActionBar.i6.Gi));
            this.b0.addView(this.c0, w7.x5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
            this.b0.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.a0.setButton(this.b0);
            org.telegram.ui.Components.tc f7 = org.telegram.ui.Components.tc.f(this.b, this.a0, -1);
            this.W = f7;
            f7.r = false;
            f7.k(true);
            this.W.v = o0Var;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.a0.b.setText(getStarsToastTitle());
        this.a0.c.setText(getStarsToastSubtitle());
        this.c0.b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(o0Var);
        AndroidUtilities.runOnUIThread(o0Var, 5000L);
        long j3 = this.R;
        y2 y2Var = ((s3) this).i0.Z1;
        x2 x2Var = y2Var.a;
        x2Var.c(y2Var);
        if (x2Var.s) {
            x2Var.s = false;
            x2Var.a(1.0f, null);
        }
        ArrayList arrayList = x2Var.e;
        while (arrayList.size() > 4) {
            ((ck0) arrayList.remove(0)).C(true);
        }
        int[] iArr = x2Var.f;
        ck0 ck0Var = new ck0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        ck0Var.R(x2Var);
        ck0Var.J(true);
        ck0Var.K(0);
        ck0Var.start();
        arrayList.add(ck0Var);
        x2Var.invalidate();
        org.telegram.ui.Components.q6 q6Var = x2Var.c;
        q6Var.a();
        q6Var.t(org.telegram.messenger.q.h(j3, ',', new StringBuilder("+")), true, true);
        t2 t2Var = x2Var.d;
        AndroidUtilities.cancelRunOnUIThread(t2Var);
        AndroidUtilities.runOnUIThread(t2Var, 1500L);
        y2Var.getLocationInWindow(y2Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - y2Var.y < 100) {
            y2Var.E += 0.5f;
        } else {
            y2Var.E = Utilities.clamp(1.0f - ((r10 - 100) / 200.0f), 1.0f, 0.0f) * y2Var.E;
            LaunchActivity.b0((y2Var.getWidth() / 2.0f) + r0[0], (y2Var.getHeight() / 2.0f) + r0[1], Utilities.clamp(y2Var.E, 0.9f, 0.3f));
            y2Var.E = 0.0f;
            y2Var.y = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j3, TLRPC.InputGroupCall inputGroupCall) {
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
        this.M = j3;
        this.O = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z10) {
            this.d0.run();
            o0 o0Var = this.V;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(o0Var);
                return z10;
            }
            o0Var.run();
        }
        return z10;
    }

    public final float s() {
        return Math.max(Math.max(0.0f, this.K - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.G = z10;
    }

    public void setLivePlayer(d2 d2Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z10 = this.P == null;
        this.P = d2Var;
        if (!z10 || d2Var == null || (arrayList = d2Var.U) == null || (arrayList2 = d2Var.V) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(d2Var.U);
        arrayList4.addAll(d2Var.V);
        this.e.N(true);
        ConnectionsManager.getInstance(this.N).getCurrentTime();
        Collections.sort(arrayList4, new a4.d(this, 2));
        this.n.N(true);
        u(false);
    }

    public final void t() {
        l1 l1Var;
        n1 n1Var;
        h1 h1Var;
        m1 m1Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a4.d(3));
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
            w0 w0Var = this.c;
            if (i15 >= w0Var.getChildCount()) {
                break;
            }
            View childAt = w0Var.getChildAt(i15);
            if ((childAt instanceof h1) && (m1Var = (h1Var = (h1) childAt).K) != null) {
                int e7 = e(m1Var.c);
                m1 m1Var2 = h1Var.K;
                if (e7 != m1Var2.h) {
                    m1Var2.h = e7;
                    h1Var.set(m1Var2);
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
            m1 m1Var3 = (m1) arrayList3.get(i16);
            int e10 = e(m1Var3.c);
            if (e10 != m1Var3.h) {
                m1Var3.h = e10;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            fc1 fc1Var = this.f;
            if (i17 >= fc1Var.getChildCount()) {
                break;
            }
            View childAt2 = fc1Var.getChildAt(i17);
            if ((childAt2 instanceof l1) && (n1Var = (l1Var = (l1) childAt2).f) != null) {
                int e11 = e(n1Var.b);
                n1 n1Var2 = l1Var.f;
                if (e11 != n1Var2.e) {
                    n1Var2.e = e11;
                    l1Var.set(n1Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i10 >= arrayList4.size()) {
                return;
            }
            n1 n1Var3 = (n1) arrayList4.get(i10);
            int e12 = e(n1Var3.b);
            if (e12 != n1Var3.e) {
                n1Var3.e = e12;
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
        w0 w0Var = this.c;
        fc1 fc1Var = this.f;
        if (z10) {
            ViewPropertyAnimator translationY = w0Var.animate().translationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f));
            hs hsVar = hs.h;
            translationY.setInterpolator(hsVar).setUpdateListener(new a(this, 2)).setDuration(420L).start();
            fc1Var.animate().translationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.J ? 1.0f : 0.0f).setInterpolator(hsVar).setDuration(420L).start();
            return;
        }
        w0Var.setTranslationY(!isEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        fc1Var.setTranslationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f));
        fc1Var.setAlpha(this.J ? 1.0f : 0.0f);
        invalidate();
    }
}
