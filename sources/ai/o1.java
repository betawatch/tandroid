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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fc1;
import org.telegram.ui.l20;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public abstract class o1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public n0 E;
    public int F;
    public boolean G;
    public long H;
    public final l20 I;
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
    public org.telegram.ui.Components.pc W;
    public final View a;
    public org.telegram.ui.Components.jc a0;
    public final FrameLayout b;
    public org.telegram.ui.Components.nc b0;
    public final w0 c;
    public org.telegram.ui.Components.ic c0;
    public final s4.c0 d;
    public final o0 d0;
    public final x0 e;
    public ValueAnimator e0;
    public final fc1 f;
    public boolean f0;
    public final o0 g0;
    public final s4.c0 h;
    public final k61 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap v;
    public long w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r6v3, types: [ai.t0] */
    public o1(Context context, jc jcVar, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new l20();
        int i10 = UserConfig.selectedAccount;
        this.N = i10;
        this.T = new ArrayList();
        final r3 r3Var = (r3) this;
        this.V = new o0(r3Var, 0);
        this.d0 = new o0(r3Var, 1);
        this.f0 = false;
        this.g0 = new o0(r3Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        w0 w0Var = new w0(r3Var, context, 0);
        this.c = w0Var;
        w0Var.setWillNotDraw(false);
        s4.c0 c0Var = new s4.c0(1, true);
        this.d = c0Var;
        w0Var.setLayoutManager(c0Var);
        final int i11 = 0;
        x0 x0Var = new x0(r3Var, w0Var, context, i10, new Utilities.Callback2() { // from class: ai.t0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                r3 r3Var2 = r3Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = r3Var2.r;
                        d2 d2Var = r3Var2.P;
                        long j3 = d2Var == null ? 0L : d2Var.j();
                        r3Var2.H = j3;
                        while (i13 < arrayList2.size()) {
                            m1 m1Var = (m1) arrayList2.get(i13);
                            if (m1Var.b || !m1Var.e || m1Var.g >= j3) {
                                int i14 = g1.a;
                                w51 J = w51.J(g1.class);
                                J.G = m1Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = r3Var2.s;
                        while (i13 < arrayList3.size()) {
                            n1 n1Var = (n1) arrayList3.get(i13);
                            int i15 = k1.a;
                            w51 J2 = w51.J(k1.class);
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
        addView(w0Var, w7.y5.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        w0Var.setOnItemClickListener(new u0(r3Var, viewGroup, jcVar, 0));
        y0 y0Var = new y0(r3Var);
        y0Var.m = false;
        y0Var.C = false;
        qr qrVar = qr.h;
        y0Var.o(qrVar);
        y0Var.n(280L);
        y0Var.D = 14L;
        w0Var.setItemAnimator(y0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new v0(r3Var, 0));
        final int i12 = 1;
        fc1 fc1Var = new fc1(context, i12, null);
        this.f = fc1Var;
        fc1Var.setWillNotDraw(false);
        s4.c0 c0Var2 = new s4.c0(0, false);
        this.h = c0Var2;
        fc1Var.setLayoutManager(c0Var2);
        k61 k61Var = new k61(fc1Var, context, i10, 0, false, new Utilities.Callback2() { // from class: ai.t0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i122 = i12;
                int i13 = 0;
                r3 r3Var2 = r3Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i122) {
                    case 0:
                        ArrayList arrayList2 = r3Var2.r;
                        d2 d2Var = r3Var2.P;
                        long j3 = d2Var == null ? 0L : d2Var.j();
                        r3Var2.H = j3;
                        while (i13 < arrayList2.size()) {
                            m1 m1Var = (m1) arrayList2.get(i13);
                            if (m1Var.b || !m1Var.e || m1Var.g >= j3) {
                                int i14 = g1.a;
                                w51 J = w51.J(g1.class);
                                J.G = m1Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = r3Var2.s;
                        while (i13 < arrayList3.size()) {
                            n1 n1Var = (n1) arrayList3.get(i13);
                            int i15 = k1.a;
                            w51 J2 = w51.J(k1.class);
                            J2.G = n1Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, null);
        this.n = k61Var;
        fc1Var.setAdapter(k61Var);
        k61Var.r = false;
        fc1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        fc1Var.setClipToPadding(false);
        addView(fc1Var, w7.y5.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        fc1Var.setOnItemClickListener(new a1.c(r3Var, 4));
        z0 z0Var = new z0();
        z0Var.m = false;
        z0Var.C = false;
        z0Var.o(qrVar);
        z0Var.n(350L);
        fc1Var.setItemAnimator(z0Var);
        u(false);
    }

    public static Integer a(o1 o1Var, Long l4) {
        o1Var.d0.run();
        o1Var.R = l4.longValue();
        org.telegram.ui.Components.pc M = new xc(o1Var.b, new d()).M(o1Var.getStarsToastTitle(), o1Var.getStarsToastSubtitle(), R.raw.stars_topup);
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
        x2 x2Var = ((r3) this).i0.Z1;
        w2 w2Var = x2Var.a;
        w2Var.c(x2Var);
        w2Var.b();
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
            Collections.sort(arrayList2, new a4.e(this, 2));
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
        l20 l20Var = this.I;
        l20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (w0Var.getY() + w0Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), w0Var.getHeight() + w0Var.getBottom());
        l20Var.b(canvas, rectF, 3, 1.0f);
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
        yh.o8 o8Var = new yh.o8(getContext(), this.N, this.M, null, null, arrayList, !z10, true, clientUserId, a1Var);
        r3 r3Var = (r3) this;
        o8Var.N = r3Var;
        o8Var.P = new a1.c(r3Var, 3);
        o8Var.show();
    }

    public final void l(int i10, int i11, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z11) {
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
                long j11 = m1Var.g;
                ArrayList arrayList2 = this.s;
                if (j11 > 0 && b10 > 0 && currentTime - m1Var.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            n1Var = null;
                            break;
                        } else {
                            if (((n1) arrayList2.get(i15)).b == j3) {
                                n1Var = (n1) arrayList2.get(i15);
                                break;
                            }
                            i15++;
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
                        this.f.g1();
                        z12 = false;
                    }
                    n1Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a4.e(this, 2));
                    if (!z11) {
                        this.n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && m1Var.e) {
                    long j12 = m1Var.g;
                    if (j12 > 0) {
                        this.Q += j12;
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
                r3 r3Var = (r3) this;
                c cVar = r3Var.i0.X1;
                if (cVar != null) {
                    cVar.setCount(r3Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && m1Var.g > 0) {
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
                        groupcalldonor.stars = 0L;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((n1) arrayList2.get(i18)).b == m1Var.c) {
                                ((n1) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((n1) arrayList2.get(i18)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j13 = groupcalldonor.stars;
                    long j14 = m1Var.g;
                    long j15 = j13 + j14;
                    groupcalldonor.stars = j15;
                    i((int) j15, (int) j14, m1Var.c);
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
        long j3 = Long.MAX_VALUE;
        int i11 = 0;
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
                MessagesController.getInstance(o1Var.N).processUpdates(updates, false);
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
        org.telegram.ui.Components.pc pcVar = this.W;
        o0 o0Var = this.d0;
        if (pcVar == null || !pcVar.l) {
            d dVar = new d();
            org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(getContext(), dVar);
            this.a0 = jcVar;
            jcVar.c(R.raw.stars_topup, new String[0]);
            this.a0.b.setText(getStarsToastTitle());
            org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(getContext(), dVar, true, false);
            this.b0 = ncVar;
            ncVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.b0.a = new n0((r3) this, 0);
            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(getContext(), dVar);
            this.c0 = icVar;
            icVar.b = 5000L;
            icVar.setColor(dVar.F0(org.telegram.ui.ActionBar.j6.Gi));
            this.b0.addView(this.c0, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.b0.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.a0.setButton(this.b0);
            org.telegram.ui.Components.pc f7 = org.telegram.ui.Components.pc.f(this.b, this.a0, -1);
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
        x2 x2Var = ((r3) this).i0.Z1;
        w2 w2Var = x2Var.a;
        w2Var.c(x2Var);
        if (w2Var.s) {
            w2Var.s = false;
            w2Var.a(1.0f, null);
        }
        ArrayList arrayList = w2Var.e;
        while (arrayList.size() > 4) {
            ((hj0) arrayList.remove(0)).C(true);
        }
        int[] iArr = w2Var.f;
        hj0 hj0Var = new hj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        hj0Var.R(w2Var);
        hj0Var.J(true);
        hj0Var.K(0);
        hj0Var.start();
        arrayList.add(hj0Var);
        w2Var.invalidate();
        org.telegram.ui.Components.n6 n6Var = w2Var.c;
        n6Var.b();
        n6Var.q(hg.k0.j(j3, ',', new StringBuilder("+")), true, true);
        s2 s2Var = w2Var.d;
        AndroidUtilities.cancelRunOnUIThread(s2Var);
        AndroidUtilities.runOnUIThread(s2Var, 1500L);
        x2Var.getLocationInWindow(x2Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - x2Var.y < 100) {
            x2Var.E += 0.5f;
        } else {
            x2Var.E = Utilities.clamp(1.0f - ((r10 - 100) / 200.0f), 1.0f, 0.0f) * x2Var.E;
            LaunchActivity.b0((x2Var.getWidth() / 2.0f) + r0[0], (x2Var.getHeight() / 2.0f) + r0[1], Utilities.clamp(x2Var.E, 0.9f, 0.3f));
            x2Var.E = 0.0f;
            x2Var.y = currentTimeMillis;
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
        Collections.sort(arrayList4, new a4.e(this, 2));
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
        Collections.sort(arrayList, new a4.e(3));
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
                int e = e(m1Var.c);
                m1 m1Var2 = h1Var.K;
                if (e != m1Var2.h) {
                    m1Var2.h = e;
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
            int e7 = e(m1Var3.c);
            if (e7 != m1Var3.h) {
                m1Var3.h = e7;
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
                int e10 = e(n1Var.b);
                n1 n1Var2 = l1Var.f;
                if (e10 != n1Var2.e) {
                    n1Var2.e = e10;
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
            int e11 = e(n1Var3.b);
            if (e11 != n1Var3.e) {
                n1Var3.e = e11;
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
            qr qrVar = qr.h;
            translationY.setInterpolator(qrVar).setUpdateListener(new a(this, 2)).setDuration(420L).start();
            fc1Var.animate().translationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.J ? 1.0f : 0.0f).setInterpolator(qrVar).setDuration(420L).start();
            return;
        }
        w0Var.setTranslationY(!isEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        fc1Var.setTranslationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f));
        fc1Var.setAlpha(this.J ? 1.0f : 0.0f);
        invalidate();
    }
}
