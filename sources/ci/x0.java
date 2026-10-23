package ci;

import ai.ja;
import ai.me;
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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w10;
import org.telegram.ui.xa1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public abstract class x0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public a0 E;
    public int F;
    public boolean G;
    public long H;
    public final w10 I;
    public boolean J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public TLRPC.InputGroupCall O;
    public h1 P;
    public long Q;
    public long R;
    public boolean S;
    public ArrayList T;
    public boolean U;
    public final b0 V;
    public qc W;
    public final View a;
    public kc a0;
    public final FrameLayout b;
    public oc b0;
    public final ai.u1 c;
    public jc c0;
    public final s4.b0 d;
    public final b0 d0;
    public final h0 e;
    public ValueAnimator e0;
    public final xa1 f;
    public boolean f0;
    public final b0 g0;
    public final s4.b0 h;
    public final b71 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap v;
    public long w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r6v3, types: [ci.f0] */
    public x0(Context context, z9 z9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new w10();
        int i10 = UserConfig.selectedAccount;
        this.N = i10;
        this.T = new ArrayList();
        final m2 m2Var = (m2) this;
        this.V = new b0(m2Var, 0);
        this.d0 = new b0(m2Var, 1);
        this.f0 = false;
        this.g0 = new b0(m2Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        ai.u1 u1Var = new ai.u1(m2Var, context, 1);
        this.c = u1Var;
        u1Var.setWillNotDraw(false);
        s4.b0 b0Var = new s4.b0(1, true);
        this.d = b0Var;
        u1Var.setLayoutManager(b0Var);
        final int i11 = 0;
        h0 h0Var = new h0(m2Var, u1Var, context, i10, new Utilities.Callback2() { // from class: ci.f0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                m2 m2Var2 = m2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = m2Var2.r;
                        h1 h1Var = m2Var2.P;
                        long j10 = h1Var == null ? 0L : h1Var.j();
                        m2Var2.H = j10;
                        while (i13 < arrayList2.size()) {
                            v0 v0Var = (v0) arrayList2.get(i13);
                            if (v0Var.b || !v0Var.e || v0Var.g >= j10) {
                                int i14 = p0.a;
                                m61 J = m61.J(p0.class);
                                J.G = v0Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = m2Var2.s;
                        while (i13 < arrayList3.size()) {
                            w0 w0Var = (w0) arrayList3.get(i13);
                            int i15 = t0.a;
                            m61 J2 = m61.J(t0.class);
                            J2.G = w0Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, new b());
        this.e = h0Var;
        u1Var.setAdapter(h0Var);
        h0Var.r = false;
        u1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        u1Var.setClipToPadding(false);
        addView(u1Var, w7.z5.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        u1Var.setOnItemClickListener(new g0(m2Var, viewGroup, z9Var, 0));
        i0 i0Var = new i0(m2Var);
        i0Var.m = false;
        i0Var.C = false;
        bs bsVar = bs.h;
        i0Var.o(bsVar);
        i0Var.n(280L);
        i0Var.D = 14L;
        u1Var.setItemAnimator(i0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new ah.g0(m2Var, 12));
        final int i12 = 1;
        xa1 xa1Var = new xa1(context, i12, null);
        this.f = xa1Var;
        xa1Var.setWillNotDraw(false);
        s4.b0 b0Var2 = new s4.b0(0, false);
        this.h = b0Var2;
        xa1Var.setLayoutManager(b0Var2);
        b71 b71Var = new b71(xa1Var, context, i10, 0, false, new Utilities.Callback2() { // from class: ci.f0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i122 = i12;
                int i13 = 0;
                m2 m2Var2 = m2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i122) {
                    case 0:
                        ArrayList arrayList2 = m2Var2.r;
                        h1 h1Var = m2Var2.P;
                        long j10 = h1Var == null ? 0L : h1Var.j();
                        m2Var2.H = j10;
                        while (i13 < arrayList2.size()) {
                            v0 v0Var = (v0) arrayList2.get(i13);
                            if (v0Var.b || !v0Var.e || v0Var.g >= j10) {
                                int i14 = p0.a;
                                m61 J = m61.J(p0.class);
                                J.G = v0Var;
                                arrayList.add(J);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = m2Var2.s;
                        while (i13 < arrayList3.size()) {
                            w0 w0Var = (w0) arrayList3.get(i13);
                            int i15 = t0.a;
                            m61 J2 = m61.J(t0.class);
                            J2.G = w0Var;
                            arrayList.add(J2);
                            i13++;
                        }
                        break;
                }
            }
        }, null);
        this.n = b71Var;
        xa1Var.setAdapter(b71Var);
        b71Var.r = false;
        xa1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        xa1Var.setClipToPadding(false);
        addView(xa1Var, w7.z5.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        xa1Var.setOnItemClickListener(new a1.c(m2Var, 15));
        j0 j0Var = new j0();
        j0Var.m = false;
        j0Var.C = false;
        j0Var.o(bsVar);
        j0Var.n(350L);
        xa1Var.setItemAnimator(j0Var);
        u(false);
    }

    public static Integer a(x0 x0Var, Long l4) {
        x0Var.d0.run();
        x0Var.R = l4.longValue();
        qc M = new xc(x0Var.b, new b()).M(x0Var.getStarsToastTitle(), x0Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.r = false;
        M.k(true);
        x0Var.R = 0L;
        x0Var.S = true;
        int o10 = x0Var.o(new TLRPC.TL_textWithEntities(), l4.longValue());
        h1 h1Var = x0Var.P;
        long j10 = h1Var != null ? h1Var.j() : 0L;
        if (x0Var.getDefaultPeerId() == x0Var.M && x0Var.f()) {
            z10 = true;
        }
        return (l4.longValue() >= j10 || z10) ? Integer.valueOf(o10) : Integer.valueOf(TLObject.FLAG_31);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        h1 h1Var = this.P;
        if (h1Var != null && h1Var.l()) {
            if (this.P.v == null ? false : !r1.messages_enabled) {
                return this.M;
            }
        }
        return defaultSendAs == null ? UserConfig.getInstance(this.N).getClientUserId() : DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        ai.u1 u1Var = this.c;
        int height = u1Var.getHeight();
        for (int i10 = 0; i10 < u1Var.getChildCount(); i10++) {
            height = Math.min(u1Var.getChildAt(i10).getTop(), height);
        }
        return u1Var.getHeight() - height;
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
        x1 x1Var = ((m2) this).i0.Z1;
        w1 w1Var = x1Var.a;
        w1Var.c(x1Var);
        w1Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        v0 v0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.r;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                v0Var = null;
                break;
            } else {
                if (((v0) arrayList.get(i11)).a == i10) {
                    v0Var = (v0) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (v0Var == null) {
            return;
        }
        if (v0Var.a < 0 && v0Var.e) {
            long j10 = v0Var.g;
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
            if (((w0) arrayList2.get(i12)).f.contains(v0Var)) {
                ((w0) arrayList2.get(i12)).f.remove(v0Var);
                if (((w0) arrayList2.get(i12)).f.isEmpty()) {
                    arrayList2.remove(i12);
                    z10 = true;
                } else {
                    ((w0) arrayList2.get(i12)).c();
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
            Collections.sort(arrayList2, new a4.d(this, 10));
            this.n.N(true);
            t();
            u(true);
        }
    }

    public final q0 d(int i10) {
        q0 q0Var;
        v0 v0Var;
        int i11 = 0;
        while (true) {
            ai.u1 u1Var = this.c;
            if (i11 >= u1Var.getChildCount()) {
                return null;
            }
            View childAt = u1Var.getChildAt(i11);
            if ((childAt instanceof q0) && (v0Var = (q0Var = (q0) childAt).K) != null && v0Var.a == i10) {
                return q0Var;
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
        ai.u1 u1Var = this.c;
        if (view != u1Var) {
            return super.drawChild(canvas, view, j10);
        }
        if (u1Var.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.K - u1Var.getTop()) + u1Var.getY();
        canvas.saveLayerAlpha(u1Var.getX(), u1Var.getY(), u1Var.getX() + u1Var.getWidth(), u1Var.getY() + u1Var.getHeight(), 255, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((u1Var.getY() + u1Var.getHeight()) - max, getListViewTop()) * (1.0f - u1Var.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
        w10 w10Var = this.I;
        w10Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (u1Var.getY() + u1Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), u1Var.getHeight() + u1Var.getBottom());
        w10Var.b(canvas, rectF, 3, 1.0f);
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
        h1 h1Var = this.P;
        if (h1Var == null || (inputGroupCall = this.O) == null || inputGroupCall.id != h1Var.g() || (groupCall = this.P.v) == null || !groupCall.creator) {
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
        ai.u1 u1Var = this.c;
        int height = u1Var.getHeight();
        for (int i10 = 0; i10 < u1Var.getChildCount(); i10++) {
            height = Math.min(u1Var.getChildAt(i10).getTop(), height);
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
        h1 h1Var = this.P;
        long j10 = h1Var == null ? 0L : h1Var.j();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            v0 v0Var = (v0) arrayList.get(i10);
            int i12 = v0Var.a;
            if (i12 >= 0 && i12 > this.F && (v0Var.b || !v0Var.e || v0Var.g >= j10)) {
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
        k0 k0Var = new k0(0);
        me meVar = new me(getContext(), this.N, this.M, null, null, arrayList, !z10, true, clientUserId, k0Var);
        m2 m2Var = (m2) this;
        meVar.P = m2Var;
        meVar.R = new a1.c(m2Var, 14);
        meVar.show();
    }

    public final void l(int i10, int i11, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z11) {
        long j12;
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        w0 w0Var;
        boolean z12;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i13 >= arrayList.size()) {
                int i14 = this.N;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                v0 v0Var = new v0();
                v0Var.d = i10;
                v0Var.b = z10;
                v0Var.c = j10;
                v0Var.f = tL_textWithEntities;
                v0Var.g = j11;
                v0Var.a = i11;
                v0Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = u.b(i14, (int) v0Var.g, 0);
                long j13 = v0Var.g;
                long j14 = 0;
                ArrayList arrayList2 = this.s;
                if (j13 <= 0 || b10 <= 0 || currentTime - v0Var.d > b10) {
                    j12 = 0;
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            j12 = j14;
                            w0Var = null;
                            break;
                        }
                        j12 = j14;
                        if (((w0) arrayList2.get(i15)).b == j10) {
                            w0Var = (w0) arrayList2.get(i15);
                            break;
                        } else {
                            i15++;
                            j14 = j12;
                        }
                    }
                    if (w0Var == null) {
                        w0Var = new w0();
                        ArrayList arrayList3 = new ArrayList();
                        w0Var.f = arrayList3;
                        w0Var.a = i14;
                        w0Var.b = j10;
                        arrayList3.add(v0Var);
                        arrayList2.add(0, w0Var);
                        z12 = true;
                    } else {
                        w0Var.f.add(v0Var);
                        this.f.g1();
                        z12 = false;
                    }
                    w0Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a4.d(this, 10));
                    if (!z11) {
                        this.n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && v0Var.e) {
                    long j15 = v0Var.g;
                    if (j15 > j12) {
                        this.Q += j15;
                        j();
                    }
                }
                if (v0Var.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (v0Var.a < ((v0) arrayList.get(size)).a) {
                            i12 = size + 1;
                            break;
                        }
                    }
                }
                i12 = 0;
                arrayList.add(i12, v0Var);
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.N(true);
                }
                if (i12 <= 0 && !z11 && (!this.c.canScrollVertically(1) || v0Var.a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i16 = v0Var.a;
                    if (i16 > 0) {
                        this.F = i16;
                    }
                }
                invalidate();
                m2 m2Var = (m2) this;
                a aVar = m2Var.i0.X1;
                if (aVar != null) {
                    aVar.setCount(m2Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && v0Var.g > j12) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= this.T.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.T.get(i17)).peer_id) == v0Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i17);
                                break;
                            }
                            i17++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = UserConfig.getInstance(i14).getClientUserId() == v0Var.c;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(v0Var.c);
                        groupcalldonor.stars = j12;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((w0) arrayList2.get(i18)).b == v0Var.c) {
                                ((w0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((w0) arrayList2.get(i18)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j16 = groupcalldonor.stars;
                    long j17 = v0Var.g;
                    long j18 = j16 + j17;
                    groupcalldonor.stars = j18;
                    i((int) j18, (int) j17, v0Var.c);
                }
                t();
                if (z11) {
                    b0 b0Var = this.g0;
                    AndroidUtilities.cancelRunOnUIThread(b0Var);
                    AndroidUtilities.runOnUIThread(b0Var, 100L);
                }
                h1 h1Var = this.P;
                if (h1Var != null) {
                    h1Var.U = arrayList;
                    h1Var.V = arrayList2;
                    return;
                }
                return;
            }
            if (((v0) arrayList.get(i13)).a == i11) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void m() {
        int i10;
        a0 a0Var = this.E;
        if (a0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a0Var);
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
            w0 w0Var = (w0) obj;
            ArrayList arrayList2 = w0Var.f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                v0 v0Var = (v0) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (v0Var.g > 0) {
                    i12 = Math.min(i12, v0Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, u.b(w0Var.a, (int) v0Var.g, 0) + v0Var.d);
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
        a0 a0Var2 = new a0(this, 1);
        this.E = a0Var2;
        AndroidUtilities.runOnUIThread(a0Var2, j10);
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
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: ci.z
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                x0 x0Var = x0.this;
                int i12 = newMessageId;
                if (!z11) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new ja(x0Var, i12, tL_error, j11, j10, tL_textWithEntities));
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
                        ArrayList arrayList = x0Var.r;
                        int size2 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj2 = arrayList.get(i15);
                                i15++;
                                v0 v0Var = (v0) obj2;
                                if (v0Var.a == i12) {
                                    v0Var.a = i14;
                                    break;
                                }
                            }
                        }
                    }
                }
                MessagesController.getInstance(x0Var.N).lambda$processUpdates$377(updates, false);
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
            b0 b0Var = this.V;
            AndroidUtilities.cancelRunOnUIThread(b0Var);
            AndroidUtilities.runOnUIThread(b0Var);
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
        qc qcVar = this.W;
        b0 b0Var = this.d0;
        if (qcVar == null || !qcVar.l) {
            b bVar = new b();
            kc kcVar = new kc(getContext(), bVar);
            this.a0 = kcVar;
            kcVar.c(R.raw.stars_topup, new String[0]);
            this.a0.b.setText(getStarsToastTitle());
            oc ocVar = new oc(getContext(), bVar, true, false);
            this.b0 = ocVar;
            ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.b0.b = new a0((m2) this, 0);
            jc jcVar = new jc(getContext(), bVar);
            this.c0 = jcVar;
            jcVar.b = 5000L;
            jcVar.setColor(bVar.g(org.telegram.ui.ActionBar.k6.Gi));
            this.b0.addView(this.c0, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.b0.e.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.a0.setButton(this.b0);
            qc f7 = qc.f(this.b, this.a0, -1);
            this.W = f7;
            f7.r = false;
            f7.k(true);
            this.W.v = b0Var;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.a0.b.setText(getStarsToastTitle());
        this.a0.c.setText(getStarsToastSubtitle());
        this.c0.b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(b0Var);
        AndroidUtilities.runOnUIThread(b0Var, 5000L);
        long j10 = this.R;
        x1 x1Var = ((m2) this).i0.Z1;
        w1 w1Var = x1Var.a;
        w1Var.c(x1Var);
        if (w1Var.s) {
            w1Var.s = false;
            w1Var.a(1.0f, null);
        }
        ArrayList arrayList = w1Var.e;
        while (arrayList.size() > 4) {
            ((yj0) arrayList.remove(0)).C(true);
        }
        int[] iArr = w1Var.f;
        yj0 yj0Var = new yj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        yj0Var.R(w1Var);
        yj0Var.J(true);
        yj0Var.K(0);
        yj0Var.start();
        arrayList.add(yj0Var);
        w1Var.invalidate();
        org.telegram.ui.Components.p6 p6Var = w1Var.c;
        p6Var.a();
        p6Var.t(i2.o1.m(j10, ',', new StringBuilder("+")), true, true);
        u1 u1Var = w1Var.d;
        AndroidUtilities.cancelRunOnUIThread(u1Var);
        AndroidUtilities.runOnUIThread(u1Var, 1500L);
        x1Var.getLocationInWindow(x1Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - x1Var.y < 100) {
            x1Var.E += 0.5f;
        } else {
            x1Var.E = Utilities.clamp(1.0f - ((r10 - 100) / 200.0f), 1.0f, 0.0f) * x1Var.E;
            LaunchActivity.c0((x1Var.getWidth() / 2.0f) + r0[0], (x1Var.getHeight() / 2.0f) + r0[1], Utilities.clamp(x1Var.E, 0.9f, 0.3f));
            x1Var.E = 0.0f;
            x1Var.y = currentTimeMillis;
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
            b0 b0Var = this.V;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(b0Var);
                return z10;
            }
            b0Var.run();
        }
        return z10;
    }

    public final float s() {
        return Math.max(Math.max(0.0f, this.K - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.G = z10;
    }

    public void setLivePlayer(h1 h1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z10 = this.P == null;
        this.P = h1Var;
        if (!z10 || h1Var == null || (arrayList = h1Var.U) == null || (arrayList2 = h1Var.V) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(h1Var.U);
        arrayList4.addAll(h1Var.V);
        this.e.N(true);
        ConnectionsManager.getInstance(this.N).getCurrentTime();
        Collections.sort(arrayList4, new a4.d(this, 10));
        this.n.N(true);
        u(false);
    }

    public final void t() {
        u0 u0Var;
        w0 w0Var;
        q0 q0Var;
        v0 v0Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a4.d(11));
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
            ai.u1 u1Var = this.c;
            if (i15 >= u1Var.getChildCount()) {
                break;
            }
            View childAt = u1Var.getChildAt(i15);
            if ((childAt instanceof q0) && (v0Var = (q0Var = (q0) childAt).K) != null) {
                int e = e(v0Var.c);
                v0 v0Var2 = q0Var.K;
                if (e != v0Var2.h) {
                    v0Var2.h = e;
                    q0Var.set(v0Var2);
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
            v0 v0Var3 = (v0) arrayList3.get(i16);
            int e7 = e(v0Var3.c);
            if (e7 != v0Var3.h) {
                v0Var3.h = e7;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            xa1 xa1Var = this.f;
            if (i17 >= xa1Var.getChildCount()) {
                break;
            }
            View childAt2 = xa1Var.getChildAt(i17);
            if ((childAt2 instanceof u0) && (w0Var = (u0Var = (u0) childAt2).f) != null) {
                int e10 = e(w0Var.b);
                w0 w0Var2 = u0Var.f;
                if (e10 != w0Var2.e) {
                    w0Var2.e = e10;
                    u0Var.set(w0Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i10 >= arrayList4.size()) {
                return;
            }
            w0 w0Var3 = (w0) arrayList4.get(i10);
            int e11 = e(w0Var3.b);
            if (e11 != w0Var3.e) {
                w0Var3.e = e11;
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
        ai.u1 u1Var = this.c;
        xa1 xa1Var = this.f;
        if (z10) {
            ViewPropertyAnimator translationY = u1Var.animate().translationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f));
            bs bsVar = bs.h;
            translationY.setInterpolator(bsVar).setUpdateListener(new ah.c0(this, 10)).setDuration(420L).start();
            xa1Var.animate().translationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.J ? 1.0f : 0.0f).setInterpolator(bsVar).setDuration(420L).start();
            return;
        }
        u1Var.setTranslationY(!isEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        xa1Var.setTranslationY(this.J ? 0.0f : AndroidUtilities.dp(35.0f));
        xa1Var.setAlpha(this.J ? 1.0f : 0.0f);
        invalidate();
    }
}
