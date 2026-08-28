package ih;

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
import gh.jb;
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
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s10;
import org.telegram.ui.va1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class w0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public z A;
    public int B;
    public boolean C;
    public long D;
    public final s10 E;
    public boolean F;
    public float G;
    public float H;
    public long I;
    public final int J;
    public TLRPC.InputGroupCall K;
    public f1 L;
    public long M;
    public long N;
    public boolean O;
    public ArrayList P;
    public boolean Q;
    public final a0 R;
    public gc S;
    public ac T;
    public ec U;
    public zb V;
    public final a0 W;
    public final View a;
    public ValueAnimator a0;
    public final FrameLayout b;
    public boolean b0;
    public final gh.f1 c;
    public final a0 c0;
    public final f2.m0 d;
    public final g0 e;
    public final va1 f;
    public final f2.m0 h;
    public final z41 n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap v;
    public long w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r6v3, types: [ih.e0] */
    public w0(Context context, m9 m9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = new HashMap();
        this.B = -1;
        this.C = true;
        this.E = new s10();
        int i9 = UserConfig.selectedAccount;
        this.J = i9;
        this.P = new ArrayList();
        final h2 h2Var = (h2) this;
        this.R = new a0(h2Var, 0);
        this.W = new a0(h2Var, 1);
        this.b0 = false;
        this.c0 = new a0(h2Var, 2);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        gh.f1 f1Var = new gh.f1(h2Var, context, 1);
        this.c = f1Var;
        f1Var.setWillNotDraw(false);
        f2.m0 m0Var = new f2.m0(1, true);
        this.d = m0Var;
        f1Var.setLayoutManager(m0Var);
        final int i10 = 0;
        g0 g0Var = new g0(h2Var, f1Var, context, i9, new Utilities.Callback2() { // from class: ih.e0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i11 = i10;
                int i12 = 0;
                h2 h2Var2 = h2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = h2Var2.r;
                        f1 f1Var2 = h2Var2.L;
                        long j10 = f1Var2 == null ? 0L : f1Var2.j();
                        h2Var2.D = j10;
                        while (i12 < arrayList2.size()) {
                            u0 u0Var = (u0) arrayList2.get(i12);
                            if (u0Var.b || !u0Var.e || u0Var.g >= j10) {
                                int i13 = o0.a;
                                l41 J = l41.J(o0.class);
                                J.G = u0Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = h2Var2.s;
                        while (i12 < arrayList3.size()) {
                            v0 v0Var = (v0) arrayList3.get(i12);
                            int i14 = s0.a;
                            l41 J2 = l41.J(s0.class);
                            J2.G = v0Var;
                            arrayList.add(J2);
                            i12++;
                        }
                        break;
                }
            }
        }, new b());
        this.e = g0Var;
        f1Var.setAdapter(g0Var);
        g0Var.r = false;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        f1Var.setClipToPadding(false);
        addView(f1Var, g7.e6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        f1Var.setOnItemClickListener(new f0(h2Var, viewGroup, m9Var, 0));
        h0 h0Var = new h0(h2Var);
        h0Var.m = false;
        h0Var.C = false;
        gr grVar = gr.h;
        h0Var.o(grVar);
        h0Var.n(280L);
        h0Var.D = 14L;
        f1Var.setItemAnimator(h0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new androidx.mediarouter.app.c(h2Var, 19));
        final int i11 = 1;
        va1 va1Var = new va1(context, i11, null);
        this.f = va1Var;
        va1Var.setWillNotDraw(false);
        f2.m0 m0Var2 = new f2.m0(0, false);
        this.h = m0Var2;
        va1Var.setLayoutManager(m0Var2);
        z41 z41Var = new z41(va1Var, context, i9, 0, false, new Utilities.Callback2() { // from class: ih.e0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i112 = i11;
                int i12 = 0;
                h2 h2Var2 = h2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i112) {
                    case 0:
                        ArrayList arrayList2 = h2Var2.r;
                        f1 f1Var2 = h2Var2.L;
                        long j10 = f1Var2 == null ? 0L : f1Var2.j();
                        h2Var2.D = j10;
                        while (i12 < arrayList2.size()) {
                            u0 u0Var = (u0) arrayList2.get(i12);
                            if (u0Var.b || !u0Var.e || u0Var.g >= j10) {
                                int i13 = o0.a;
                                l41 J = l41.J(o0.class);
                                J.G = u0Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = h2Var2.s;
                        while (i12 < arrayList3.size()) {
                            v0 v0Var = (v0) arrayList3.get(i12);
                            int i14 = s0.a;
                            l41 J2 = l41.J(s0.class);
                            J2.G = v0Var;
                            arrayList.add(J2);
                            i12++;
                        }
                        break;
                }
            }
        }, null);
        this.n = z41Var;
        va1Var.setAdapter(z41Var);
        z41Var.r = false;
        va1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        va1Var.setClipToPadding(false);
        addView(va1Var, g7.e6.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        va1Var.setOnItemClickListener(new gh.i3(h2Var, 20));
        i0 i0Var = new i0();
        i0Var.m = false;
        i0Var.C = false;
        i0Var.o(grVar);
        i0Var.n(350L);
        va1Var.setItemAnimator(i0Var);
        u(false);
    }

    public static Integer a(w0 w0Var, Long l10) {
        w0Var.W.run();
        w0Var.N = l10.longValue();
        gc M = new oc(w0Var.b, new b()).M(w0Var.getStarsToastTitle(), w0Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.r = false;
        M.k(true);
        w0Var.N = 0L;
        w0Var.O = true;
        int o6 = w0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        f1 f1Var = w0Var.L;
        long j10 = f1Var != null ? f1Var.j() : 0L;
        if (w0Var.getDefaultPeerId() == w0Var.I && w0Var.f()) {
            z10 = true;
        }
        return (l10.longValue() >= j10 || z10) ? Integer.valueOf(o6) : Integer.valueOf(TLObject.FLAG_31);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        f1 f1Var = this.L;
        if (f1Var != null && f1Var.l()) {
            if (this.L.v == null ? false : !r1.messages_enabled) {
                return this.I;
            }
        }
        return defaultSendAs == null ? UserConfig.getInstance(this.J).getClientUserId() : DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        gh.f1 f1Var = this.c;
        int height = f1Var.getHeight();
        for (int i9 = 0; i9 < f1Var.getChildCount(); i9++) {
            height = Math.min(f1Var.getChildAt(i9).getTop(), height);
        }
        return f1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.N)));
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private int getTotalMyStars() {
        int i9 = (int) (0 + this.N);
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            if (((TL_phone.groupCallDonor) this.P.get(i10)).my) {
                i9 = (int) (i9 + ((TL_phone.groupCallDonor) this.P.get(i10)).stars);
            }
        }
        return i9;
    }

    public final void b() {
        this.N = 0L;
        h(getDefaultPeerId());
        t1 t1Var = ((h2) this).e0.V1;
        s1 s1Var = t1Var.a;
        s1Var.c(t1Var);
        s1Var.b();
        j();
    }

    public final void c(int i9) {
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
                if (((u0) arrayList.get(i10)).a == i9) {
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
                this.M -= j10;
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
        this.e.N(true);
        if (z10) {
            ConnectionsManager.getInstance(this.J).getCurrentTime();
            Collections.sort(arrayList2, new a5.e(this, 23));
            this.n.N(true);
            t();
            u(true);
        }
    }

    public final p0 d(int i9) {
        p0 p0Var;
        u0 u0Var;
        int i10 = 0;
        while (true) {
            gh.f1 f1Var = this.c;
            if (i10 >= f1Var.getChildCount()) {
                return null;
            }
            View childAt = f1Var.getChildAt(i10);
            if ((childAt instanceof p0) && (u0Var = (p0Var = (p0) childAt).G) != null && u0Var.a == i9) {
                return p0Var;
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.liveStoryMessageUpdate) {
            int i11 = 0;
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
            TLRPC.InputGroupCall inputGroupCall2 = this.K;
            if (inputGroupCall2 != null && inputGroupCall2.id == longValue) {
                TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                int i12 = groupCallMessage.date;
                int i13 = groupCallMessage.id;
                boolean z10 = groupCallMessage.from_admin;
                long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                l(i12, i13, z10, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
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
        gh.f1 f1Var = this.c;
        if (view != f1Var) {
            return super.drawChild(canvas, view, j10);
        }
        if (f1Var.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.G - f1Var.getTop()) + f1Var.getY();
        canvas.saveLayerAlpha(f1Var.getX(), f1Var.getY(), f1Var.getX() + f1Var.getWidth(), f1Var.getY() + f1Var.getHeight(), 255, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((f1Var.getY() + f1Var.getHeight()) - max, getListViewTop()) * (1.0f - f1Var.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
        s10 s10Var = this.E;
        s10Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (f1Var.getY() + f1Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), f1Var.getHeight() + f1Var.getBottom());
        s10Var.b(canvas, rectF, 3, 1.0f);
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
        int i9 = this.J;
        if (j10 >= 0) {
            return j10 == UserConfig.getInstance(i9).getClientUserId();
        }
        f1 f1Var = this.L;
        if (f1Var == null || (inputGroupCall = this.K) == null || inputGroupCall.id != f1Var.g() || (groupCall = this.L.v) == null || !groupCall.creator) {
            return ChatObject.canManageCalls(MessagesController.getInstance(i9).getChat(Long.valueOf(-this.I)));
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
        gh.f1 f1Var = this.c;
        int height = f1Var.getHeight();
        for (int i9 = 0; i9 < f1Var.getChildCount(); i9++) {
            height = Math.min(f1Var.getChildAt(i9).getTop(), height);
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
        int i9 = 0;
        if (this.B < 0) {
            return 0;
        }
        f1 f1Var = this.L;
        long j10 = f1Var == null ? 0L : f1Var.j();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i9 >= arrayList.size()) {
                return i10;
            }
            u0 u0Var = (u0) arrayList.get(i9);
            int i11 = u0Var.a;
            if (i11 >= 0 && i11 > this.B && (u0Var.b || !u0Var.e || u0Var.g >= j10)) {
                i10++;
            }
            i9++;
        }
    }

    public abstract void h(long j10);

    public abstract void i(int i9, int i10, long j10);

    public abstract void j();

    public final void k(boolean z10) {
        this.W.run();
        ArrayList arrayList = new ArrayList();
        if (this.P != null) {
            for (int i9 = 0; i9 < this.P.size(); i9++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i9);
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
        j0 j0Var = new j0(0);
        jb jbVar = new jb(getContext(), this.J, this.I, null, null, arrayList, !z10, true, clientUserId, j0Var);
        h2 h2Var = (h2) this;
        jbVar.J = h2Var;
        jbVar.L = new gh.i3(h2Var, 19);
        jbVar.show();
    }

    public final void l(int i9, int i10, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z11) {
        int i11;
        TL_phone.groupCallDonor groupcalldonor;
        v0 v0Var;
        boolean z12;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i12 >= arrayList.size()) {
                int i13 = this.J;
                int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                u0 u0Var = new u0();
                u0Var.d = i9;
                u0Var.b = z10;
                u0Var.c = j10;
                u0Var.f = tL_textWithEntities;
                u0Var.g = j11;
                u0Var.a = i10;
                u0Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = u.b(i13, (int) u0Var.g, 0);
                long j12 = u0Var.g;
                ArrayList arrayList2 = this.s;
                if (j12 > 0 && b10 > 0 && currentTime - u0Var.d <= b10) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            v0Var = null;
                            break;
                        } else {
                            if (((v0) arrayList2.get(i14)).b == j10) {
                                v0Var = (v0) arrayList2.get(i14);
                                break;
                            }
                            i14++;
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
                        this.f.f1();
                        z12 = false;
                    }
                    v0Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a5.e(this, 23));
                    if (!z11) {
                        this.n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && u0Var.e) {
                    long j13 = u0Var.g;
                    if (j13 > 0) {
                        this.M += j13;
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
                    this.e.N(true);
                }
                if (i11 <= 0 && !z11 && (!this.c.canScrollVertically(1) || u0Var.a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i15 = u0Var.a;
                    if (i15 > 0) {
                        this.B = i15;
                    }
                }
                invalidate();
                h2 h2Var = (h2) this;
                a aVar = h2Var.e0.T1;
                if (aVar != null) {
                    aVar.setCount(h2Var.getUnreadMessagesCount());
                }
                if (!z11 && i10 > 0 && u0Var.g > 0) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= this.P.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.P.get(i16)).peer_id) == u0Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i16);
                                break;
                            }
                            i16++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = UserConfig.getInstance(i13).getClientUserId() == u0Var.c;
                        groupcalldonor.peer_id = MessagesController.getInstance(i13).getPeer(u0Var.c);
                        groupcalldonor.stars = 0L;
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            if (((v0) arrayList2.get(i17)).b == u0Var.c) {
                                ((v0) arrayList2.get(i17)).b();
                                groupcalldonor.stars += ((v0) arrayList2.get(i17)).d;
                            }
                        }
                        this.P.add(groupcalldonor);
                    }
                    long j14 = groupcalldonor.stars;
                    long j15 = u0Var.g;
                    long j16 = j14 + j15;
                    groupcalldonor.stars = j16;
                    i((int) j16, (int) j15, u0Var.c);
                }
                t();
                if (z11) {
                    a0 a0Var = this.c0;
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    AndroidUtilities.runOnUIThread(a0Var, 100L);
                }
                f1 f1Var = this.L;
                if (f1Var != null) {
                    f1Var.Q = arrayList;
                    f1Var.R = arrayList2;
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
        int i9;
        z zVar = this.A;
        if (zVar != null) {
            AndroidUtilities.cancelRunOnUIThread(zVar);
            this.A = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.J).getCurrentTime();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
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
                    i9 = i14;
                    i12 = Math.max(i12, u.b(v0Var.a, (int) u0Var.g, 0) + u0Var.d);
                } else {
                    i9 = i14;
                }
                arrayList = arrayList3;
                currentTime = i9;
            }
            j10 = Math.min(j10, Math.max(0, i12 - r19) * 1000);
            arrayList = arrayList;
            currentTime = currentTime;
        }
        if (j10 >= Long.MAX_VALUE) {
            return;
        }
        z zVar2 = new z(this, 1);
        this.A = zVar2;
        AndroidUtilities.runOnUIThread(zVar2, j10);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        int i9;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i10 = this.J;
        final int newMessageId = UserConfig.getInstance(i10).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.K;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j11 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j11;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: ih.y
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                w0 w0Var = w0.this;
                int i11 = newMessageId;
                if (!z11) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new gh.w7(w0Var, i11, tL_error, j11, j10, tL_textWithEntities));
                        return;
                    }
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateMessageID.class);
                int size = findUpdatesAndRemove.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = findUpdatesAndRemove.get(i12);
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
                MessagesController.getInstance(w0Var.J).processUpdates(updates, false);
            }
        });
        if (this.P != null && j11 > 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.P.size()) {
                    groupcalldonor = null;
                    break;
                }
                if (((TL_phone.groupCallDonor) this.P.get(i11)).my) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i11);
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
                groupcalldonor2.peer_id = MessagesController.getInstance(i10).getPeer(j10);
                groupcalldonor2.stars = j11;
                this.P.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j10 == this.I || f()) {
            i9 = newMessageId;
            z10 = true;
        } else {
            i9 = newMessageId;
            z10 = false;
        }
        l(currentTime, i9, z10, j10, tL_textWithEntities, j11, false);
        int i12 = i9;
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
        if (this.K != null) {
            a0 a0Var = this.R;
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            AndroidUtilities.runOnUIThread(a0Var);
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
        gc gcVar = this.S;
        a0 a0Var = this.W;
        if (gcVar == null || !gcVar.l) {
            b bVar = new b();
            ac acVar = new ac(getContext(), bVar);
            this.T = acVar;
            acVar.c(R.raw.stars_topup, new String[0]);
            this.T.b.setText(getStarsToastTitle());
            ec ecVar = new ec(getContext(), bVar, true, false);
            this.U = ecVar;
            ecVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.U.a = new z((h2) this, 0);
            zb zbVar = new zb(getContext(), bVar);
            this.V = zbVar;
            zbVar.b = 5000L;
            zbVar.setColor(bVar.N0(org.telegram.ui.ActionBar.f6.Gi));
            this.U.addView(this.V, g7.e6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.U.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.T.setButton(this.U);
            gc f10 = gc.f(this.b, this.T, -1);
            this.S = f10;
            f10.r = false;
            f10.k(true);
            this.S.v = a0Var;
        }
        this.N++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.N, getDefaultPeerId());
        this.T.b.setText(getStarsToastTitle());
        this.T.c.setText(getStarsToastSubtitle());
        this.V.b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        AndroidUtilities.runOnUIThread(a0Var, 5000L);
        long j10 = this.N;
        t1 t1Var = ((h2) this).e0.V1;
        s1 s1Var = t1Var.a;
        s1Var.c(t1Var);
        if (s1Var.s) {
            s1Var.s = false;
            s1Var.a(1.0f, null);
        }
        ArrayList arrayList = s1Var.e;
        while (arrayList.size() > 4) {
            ((mi0) arrayList.remove(0)).A(true);
        }
        int[] iArr = s1Var.f;
        int i9 = iArr[Utilities.fastRandom.nextInt(iArr.length)];
        mi0 mi0Var = new mi0(i9, AndroidUtilities.dp(70.0f), j3.r0.l(i9, ""), AndroidUtilities.dp(70.0f));
        mi0Var.r0 = s1Var;
        mi0Var.H(true);
        mi0Var.I(0);
        mi0Var.start();
        arrayList.add(mi0Var);
        s1Var.invalidate();
        org.telegram.ui.Components.i6 i6Var = s1Var.c;
        i6Var.b();
        i6Var.q(j3.r0.n(j10, ',', new StringBuilder("+")), true, true);
        q1 q1Var = s1Var.d;
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, 1500L);
        t1Var.getLocationInWindow(t1Var.B);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - t1Var.y < 100) {
            t1Var.A += 0.5f;
        } else {
            t1Var.A = Utilities.clamp(1.0f - ((r10 - 100) / 200.0f), 1.0f, 0.0f) * t1Var.A;
            LaunchActivity.b0((t1Var.getWidth() / 2.0f) + r0[0], (t1Var.getHeight() / 2.0f) + r0[1], Utilities.clamp(t1Var.A, 0.9f, 0.3f));
            t1Var.A = 0.0f;
            t1Var.y = currentTimeMillis;
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
        int i9 = this.J;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.I = j10;
        this.K = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z10) {
            this.W.run();
            a0 a0Var = this.R;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                return z10;
            }
            a0Var.run();
        }
        return z10;
    }

    public final float s() {
        return Math.max(Math.max(0.0f, this.G - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.C = z10;
    }

    public void setLivePlayer(f1 f1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z10 = this.L == null;
        this.L = f1Var;
        if (!z10 || f1Var == null || (arrayList = f1Var.Q) == null || (arrayList2 = f1Var.R) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(f1Var.Q);
        arrayList4.addAll(f1Var.R);
        this.e.N(true);
        ConnectionsManager.getInstance(this.J).getCurrentTime();
        Collections.sort(arrayList4, new a5.e(this, 23));
        this.n.N(true);
        u(false);
    }

    public final void t() {
        t0 t0Var;
        v0 v0Var;
        p0 p0Var;
        u0 u0Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.P;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a5.e(24));
        int size = arrayList.size();
        int i9 = 0;
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
                hashMap.put(Long.valueOf(DialogObject.getPeerDialogId(groupcalldonor.peer_id)), Integer.valueOf(i11));
            }
        }
        int i14 = 0;
        while (true) {
            gh.f1 f1Var = this.c;
            if (i14 >= f1Var.getChildCount()) {
                break;
            }
            View childAt = f1Var.getChildAt(i14);
            if ((childAt instanceof p0) && (u0Var = (p0Var = (p0) childAt).G) != null) {
                int e10 = e(u0Var.c);
                u0 u0Var2 = p0Var.G;
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
            va1 va1Var = this.f;
            if (i16 >= va1Var.getChildCount()) {
                break;
            }
            View childAt2 = va1Var.getChildAt(i16);
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
            if (i9 >= arrayList4.size()) {
                return;
            }
            v0 v0Var3 = (v0) arrayList4.get(i9);
            int e13 = e(v0Var3.b);
            if (e13 != v0Var3.e) {
                v0Var3.e = e13;
            }
            i9++;
        }
    }

    public final void u(boolean z10) {
        ArrayList arrayList = this.s;
        if (z10 && this.F == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.F = !isEmpty;
        gh.f1 f1Var = this.c;
        va1 va1Var = this.f;
        if (z10) {
            ViewPropertyAnimator translationY = f1Var.animate().translationY(this.F ? 0.0f : AndroidUtilities.dp(35.0f));
            gr grVar = gr.h;
            translationY.setInterpolator(grVar).setUpdateListener(new bg.b(this, 12)).setDuration(420L).start();
            va1Var.animate().translationY(this.F ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.F ? 1.0f : 0.0f).setInterpolator(grVar).setDuration(420L).start();
            return;
        }
        f1Var.setTranslationY(!isEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        va1Var.setTranslationY(this.F ? 0.0f : AndroidUtilities.dp(35.0f));
        va1Var.setAlpha(this.F ? 1.0f : 0.0f);
        invalidate();
    }
}
