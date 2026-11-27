// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class o96 extends FrameLayout implements fn7 {
    public boolean E;
    public ea5 F;
    public int G;
    public boolean H;
    public long I;
    public final pm3 J;
    public boolean K;
    public float L;
    public float M;
    public long N;
    public final int O;
    public TLRPC.InputGroupCall P;
    public w96 Q;
    public long R;
    public long S;
    public boolean T;
    public ArrayList U;
    public boolean V;
    public final a96 W;
    public final View a;
    public v21 a0;
    public final FrameLayout b;
    public p21 b0;
    public final gu c;
    public t21 c0;
    public final x46 d;
    public o21 d0;
    public final wb e;
    public final a96 e0;
    public final qob f;
    public ValueAnimator f0;
    public boolean g0;
    public final x46 h;
    public final a96 h0;
    public final l9c n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap w;
    public long x;
    public int y;

    public o96(Context context, lcb lcbVar, zbb zbbVar, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new HashMap();
        this.G = -1;
        final byte b = 1;
        this.H = true;
        this.J = new pm3((byte) 7);
        int i = yac.t0;
        this.O = i;
        this.U = new ArrayList();
        final b58 b58Var = (b58) this;
        this.W = new a96(b58Var, b);
        byte b2 = 2;
        this.e0 = new a96(b58Var, b2);
        final byte b3 = 0;
        this.g0 = false;
        this.h0 = new a96(b58Var, (byte) 3);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        gu guVar = new gu((byte) 24, context, (Object) b58Var);
        this.c = guVar;
        guVar.setWillNotDraw(false);
        x46 x46Var = new x46(1, true);
        this.d = x46Var;
        guVar.setLayoutManager(x46Var);
        wb wbVar = new wb(b58Var, guVar, context, i, new icc() { // from class: y86
            @Override // icc
            public final void a(Object obj, Object obj2) {
                byte b4 = b3;
                int i2 = 0;
                b58 b58Var2 = b58Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (b4) {
                    case 0:
                        ArrayList arrayList2 = b58Var2.r;
                        w96 w96Var = b58Var2.Q;
                        long m = w96Var == null ? 0L : w96Var.m();
                        b58Var2.I = m;
                        while (i2 < arrayList2.size()) {
                            m96 m96Var = (m96) arrayList2.get(i2);
                            if (m96Var.b || !m96Var.e || m96Var.g >= m) {
                                int i3 = g96.b;
                                b8c K = b8c.K(g96.class);
                                K.H = m96Var;
                                arrayList.add(K);
                            }
                            i2++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = b58Var2.s;
                        while (i2 < arrayList3.size()) {
                            n96 n96Var = (n96) arrayList3.get(i2);
                            int i4 = k96.b;
                            b8c K2 = b8c.K(k96.class);
                            K2.H = n96Var;
                            arrayList.add(K2);
                            i2++;
                        }
                        break;
                }
            }
        }, new x53(), (byte) 2);
        this.e = wbVar;
        guVar.setAdapter(wbVar);
        wbVar.r = false;
        guVar.setPadding(hl.L(8.0f), hl.L(7.5f), hl.L(8.0f), hl.L(7.5f));
        guVar.setClipToPadding(false);
        addView(guVar, tre.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        guVar.setOnItemClickListener(new jr(b58Var, zbbVar, lcbVar, b2));
        c96 c96Var = new c96(b58Var);
        c96Var.m = false;
        c96Var.C = false;
        k43 k43Var = k43.h;
        c96Var.o(k43Var);
        c96Var.n(280L);
        c96Var.D = (byte) 14;
        guVar.setItemAnimator(c96Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(aob.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new sa5(b58Var, (byte) 19));
        qob qobVar = new qob(context, null, (byte) 8);
        this.f = qobVar;
        qobVar.setWillNotDraw(false);
        x46 x46Var2 = new x46(0, false);
        this.h = x46Var2;
        qobVar.setLayoutManager(x46Var2);
        l9c l9cVar = new l9c(qobVar, context, i, 0, false, new icc() { // from class: y86
            @Override // icc
            public final void a(Object obj, Object obj2) {
                byte b4 = b;
                int i2 = 0;
                b58 b58Var2 = b58Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (b4) {
                    case 0:
                        ArrayList arrayList2 = b58Var2.r;
                        w96 w96Var = b58Var2.Q;
                        long m = w96Var == null ? 0L : w96Var.m();
                        b58Var2.I = m;
                        while (i2 < arrayList2.size()) {
                            m96 m96Var = (m96) arrayList2.get(i2);
                            if (m96Var.b || !m96Var.e || m96Var.g >= m) {
                                int i3 = g96.b;
                                b8c K = b8c.K(g96.class);
                                K.H = m96Var;
                                arrayList.add(K);
                            }
                            i2++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = b58Var2.s;
                        while (i2 < arrayList3.size()) {
                            n96 n96Var = (n96) arrayList3.get(i2);
                            int i4 = k96.b;
                            b8c K2 = b8c.K(k96.class);
                            K2.H = n96Var;
                            arrayList.add(K2);
                            i2++;
                        }
                        break;
                }
            }
        }, null);
        this.n = l9cVar;
        qobVar.setAdapter(l9cVar);
        l9cVar.r = false;
        qobVar.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        qobVar.setClipToPadding(false);
        addView(qobVar, tre.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        qobVar.setOnItemClickListener(new z86(b58Var));
        d96 d96Var = new d96();
        d96Var.m = false;
        d96Var.C = false;
        d96Var.o(k43Var);
        d96Var.n(350L);
        qobVar.setItemAnimator(d96Var);
        t(false);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        w96 w96Var = this.Q;
        if (w96Var != null && w96Var.o()) {
            if (this.Q.s == null ? false : !r1.messages_enabled) {
                return this.N;
            }
        }
        return defaultSendAs == null ? yac.h(this.O).e() : wf3.n(defaultSendAs);
    }

    private int getListViewTop() {
        gu guVar = this.c;
        int height = guVar.getHeight();
        for (int i = 0; i < guVar.getChildCount(); i++) {
            height = Math.min(guVar.getChildAt(i).getTop(), height);
        }
        return guVar.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return hl.S2(ob6.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.S)));
    }

    private String getStarsToastTitle() {
        return ob6.M0(2131744682, null);
    }

    private int getTotalMyStars() {
        int i = (int) this.S;
        for (int i2 = 0; i2 < this.U.size(); i2++) {
            if (((TL_phone.groupCallDonor) this.U.get(i2)).my) {
                i = (int) (i + ((TL_phone.groupCallDonor) this.U.get(i2)).stars);
            }
        }
        return i;
    }

    public final void a() {
        this.S = 0L;
        g(getDefaultPeerId());
        cv7 cv7Var = ((b58) this).j0.J1;
        bv7 bv7Var = cv7Var.a;
        bv7Var.c(cv7Var);
        bv7Var.b();
        i();
    }

    public final void b(int i) {
        ArrayList arrayList;
        m96 m96Var;
        ArrayList arrayList2;
        boolean z = false;
        int i2 = 0;
        while (true) {
            arrayList = this.r;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                m96Var = null;
                break;
            } else {
                if (((m96) arrayList.get(i2)).a == i) {
                    m96Var = (m96) arrayList.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (m96Var != null) {
            if (m96Var.a < 0 && m96Var.e) {
                long j = m96Var.g;
                if (j > 0) {
                    this.R -= j;
                    i();
                }
            }
            int i3 = 0;
            while (true) {
                arrayList2 = this.s;
                if (i3 >= arrayList2.size()) {
                    break;
                }
                if (((n96) arrayList2.get(i3)).f.contains(m96Var)) {
                    ((n96) arrayList2.get(i3)).f.remove(m96Var);
                    if (((n96) arrayList2.get(i3)).f.isEmpty()) {
                        arrayList2.remove(i3);
                        z = true;
                    } else {
                        ((n96) arrayList2.get(i3)).c();
                        l();
                    }
                } else {
                    i3++;
                }
            }
            arrayList.remove(i2);
            this.e.O(true);
            if (z) {
                ConnectionsManager.getInstance(this.O).getCurrentTime();
                Collections.sort(arrayList2, new f03(this, (byte) 27));
                this.n.O(true);
                s();
                t(true);
            }
        }
    }

    public final h96 c(int i) {
        h96 h96Var;
        m96 m96Var;
        int i2 = 0;
        while (true) {
            gu guVar = this.c;
            if (i2 >= guVar.getChildCount()) {
                return null;
            }
            View childAt = guVar.getChildAt(i2);
            if ((childAt instanceof h96) && (m96Var = (h96Var = (h96) childAt).L) != null && m96Var.a == i) {
                return h96Var;
            }
            i2++;
        }
    }

    public final int d(long j) {
        return ((Integer) Map.-EL.getOrDefault(this.w, Long.valueOf(j), 0)).intValue();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.H2) {
            int i3 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TL_update.TL_updateGroupCallMessage) {
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.P;
                if (inputGroupCall == null || inputGroupCall.id != longValue) {
                    return;
                }
                TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                int i4 = groupCallMessage.date;
                int i5 = groupCallMessage.id;
                boolean z = groupCallMessage.from_admin;
                long n = wf3.n(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                k(i4, i5, z, n, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                return;
            }
            if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.P;
                if (inputGroupCall2 == null || inputGroupCall2.id != longValue) {
                    return;
                }
                ArrayList<Integer> arrayList = tL_updateDeleteGroupCallMessages.messages;
                int size = arrayList.size();
                while (i3 < size) {
                    Integer num = arrayList.get(i3);
                    i3++;
                    b(num.intValue());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.H) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= r()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        gu guVar = this.c;
        if (view != guVar) {
            return super.drawChild(canvas, view, j);
        }
        if (guVar.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.L - guVar.getTop()) + guVar.getY();
        canvas.saveLayerAlpha(guVar.getX(), guVar.getY(), guVar.getX() + guVar.getWidth(), guVar.getY() + guVar.getHeight(), jn7.d4, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((guVar.getY() + guVar.getHeight()) - max, getListViewTop()) * (1.0f - guVar.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        RectF rectF = hl.P;
        rectF.set(0.0f, max, getWidth(), hl.L(12.0f) + max);
        pm3 pm3Var = this.J;
        pm3Var.r(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (guVar.getY() + guVar.getHeight()) - hl.L(12.0f), getWidth(), guVar.getHeight() + guVar.getBottom());
        pm3Var.r(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return drawChild;
    }

    public final boolean e() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.N) {
            return false;
        }
        long j = this.N;
        int i = this.O;
        if (j >= 0) {
            return j == yac.h(i).e();
        }
        w96 w96Var = this.Q;
        if (w96Var == null || (inputGroupCall = this.P) == null || inputGroupCall.id != w96Var.j() || (groupCall = this.Q.s) == null || !groupCall.creator) {
            return xc2.w(14, uc7.s1(i).M0(Long.valueOf(-this.N)));
        }
        return true;
    }

    public final Integer f(Long l) {
        this.e0.run();
        this.S = l.longValue();
        v21 I = new d31(this.b, new x53()).I(R.raw.stars_topup, getStarsToastTitle(), getStarsToastSubtitle());
        boolean z = false;
        I.s = false;
        I.k(true);
        this.S = 0L;
        this.T = true;
        int n = n(new TLRPC.TL_textWithEntities(), l.longValue());
        w96 w96Var = this.Q;
        long m = w96Var != null ? w96Var.m() : 0L;
        if (getDefaultPeerId() == this.N && e()) {
            z = true;
        }
        return (l.longValue() >= m || z) ? Integer.valueOf(n) : Integer.valueOf(TLObject.FLAG_31);
    }

    public abstract void g(long j);

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        gu guVar = this.c;
        int height = guVar.getHeight();
        for (int i = 0; i < guVar.getChildCount(); i++) {
            height = Math.min(guVar.getChildAt(i).getTop(), height);
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
        int i = 0;
        if (this.G < 0) {
            return 0;
        }
        w96 w96Var = this.Q;
        long m = w96Var == null ? 0L : w96Var.m();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i >= arrayList.size()) {
                return i2;
            }
            m96 m96Var = (m96) arrayList.get(i);
            int i3 = m96Var.a;
            if (i3 >= 0 && i3 > this.G && (m96Var.b || !m96Var.e || m96Var.g >= m)) {
                i2++;
            }
            i++;
        }
    }

    public abstract void h(int i, int i2, long j);

    public abstract void i();

    public final void j(boolean z) {
        this.e0.run();
        ArrayList arrayList = new ArrayList();
        if (this.U != null) {
            for (int i = 0; i < this.U.size(); i++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long e = yac.h(this.O).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e = wf3.n(defaultSendAs);
        }
        w53 w53Var = new w53((byte) 1);
        e0b e0bVar = new e0b(getContext(), this.O, this.N, null, null, arrayList, !z, true, e, w53Var);
        b58 b58Var = (b58) this;
        e0bVar.J1 = b58Var;
        e0bVar.L1 = new z86(b58Var);
        e0bVar.show();
    }

    public final void k(int i, int i2, boolean z, long j, TLRPC.TL_textWithEntities tL_textWithEntities, long j2, boolean z2) {
        long j3;
        int i3;
        TL_phone.groupCallDonor groupcalldonor;
        n96 n96Var;
        boolean z3;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i4 >= arrayList.size()) {
                int i5 = this.O;
                int currentTime = ConnectionsManager.getInstance(i5).getCurrentTime();
                m96 m96Var = new m96();
                m96Var.d = i;
                m96Var.b = z;
                m96Var.c = j;
                m96Var.f = tL_textWithEntities;
                m96Var.g = j2;
                m96Var.a = i2;
                m96Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b = eg5.b(i5, (int) m96Var.g, 0);
                long j4 = m96Var.g;
                long j5 = 0;
                ArrayList arrayList2 = this.s;
                if (j4 <= 0 || b <= 0 || currentTime - m96Var.d > b) {
                    j3 = 0;
                } else {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            j3 = j5;
                            n96Var = null;
                            break;
                        }
                        j3 = j5;
                        if (((n96) arrayList2.get(i6)).b == j) {
                            n96Var = (n96) arrayList2.get(i6);
                            break;
                        } else {
                            i6++;
                            j5 = j3;
                        }
                    }
                    if (n96Var == null) {
                        n96Var = new n96();
                        ArrayList arrayList3 = new ArrayList();
                        n96Var.f = arrayList3;
                        n96Var.a = i5;
                        n96Var.b = j;
                        arrayList3.add(m96Var);
                        arrayList2.add(0, n96Var);
                        z3 = true;
                    } else {
                        n96Var.f.add(m96Var);
                        this.f.i1();
                        z3 = false;
                    }
                    n96Var.c();
                    t(true);
                    l();
                    Collections.sort(arrayList2, new f03(this, (byte) 27));
                    if (!z2) {
                        this.n.O(true);
                    }
                    if (z3) {
                        this.h.m0(0);
                    }
                }
                if (!z2 && m96Var.e) {
                    long j6 = m96Var.g;
                    if (j6 > j3) {
                        this.R += j6;
                        i();
                    }
                }
                if (m96Var.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (m96Var.a < ((m96) arrayList.get(size)).a) {
                            i3 = size + 1;
                            break;
                        }
                    }
                }
                i3 = 0;
                arrayList.add(i3, m96Var);
                if (!z2) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.O(true);
                }
                if (i3 <= 0 && !z2 && (!this.c.canScrollVertically(1) || m96Var.a < 0)) {
                    this.d.g1(0, hl.L(100.0f));
                    int i7 = m96Var.a;
                    if (i7 > 0) {
                        this.G = i7;
                    }
                }
                invalidate();
                b58 b58Var = (b58) this;
                dn2 dn2Var = b58Var.j0.H1;
                if (dn2Var != null) {
                    dn2Var.setCount(b58Var.getUnreadMessagesCount());
                }
                if (!z2 && i2 > 0 && m96Var.g > j3) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= this.U.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (wf3.n(((TL_phone.groupCallDonor) this.U.get(i8)).peer_id) == m96Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i8);
                                break;
                            }
                            i8++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = yac.h(i5).e() == m96Var.c;
                        groupcalldonor.peer_id = uc7.s1(i5).y1(m96Var.c);
                        groupcalldonor.stars = j3;
                        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                            if (((n96) arrayList2.get(i9)).b == m96Var.c) {
                                ((n96) arrayList2.get(i9)).b();
                                groupcalldonor.stars += ((n96) arrayList2.get(i9)).d;
                            }
                        }
                        this.U.add(groupcalldonor);
                    }
                    long j7 = groupcalldonor.stars;
                    long j8 = m96Var.g;
                    long j9 = j7 + j8;
                    groupcalldonor.stars = j9;
                    h((int) j9, (int) j8, m96Var.c);
                }
                s();
                if (z2) {
                    a96 a96Var = this.h0;
                    hl.r(a96Var);
                    hl.d3(a96Var, 100L);
                }
                w96 w96Var = this.Q;
                if (w96Var != null) {
                    w96Var.L = arrayList;
                    w96Var.M = arrayList2;
                    return;
                }
                return;
            }
            if (((m96) arrayList.get(i4)).a == i2) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void l() {
        int i;
        ea5 ea5Var = this.F;
        if (ea5Var != null) {
            hl.r(ea5Var);
            this.F = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.O).getCurrentTime();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i2 = 0;
        long j = Long.MAX_VALUE;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            n96 n96Var = (n96) obj;
            ArrayList arrayList2 = n96Var.f;
            int size2 = arrayList2.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                m96 m96Var = (m96) obj2;
                long j2 = m96Var.g;
                if (j2 > 0) {
                    i = currentTime;
                    i3 = Math.max(i3, eg5.b(n96Var.a, (int) j2, 0) + m96Var.d);
                } else {
                    i = currentTime;
                }
                currentTime = i;
            }
            j = Math.min(j, Math.max(0, i3 - r18) * 1000);
            currentTime = currentTime;
        }
        if (j >= Long.MAX_VALUE) {
            return;
        }
        ea5 ea5Var2 = new ea5(this, (byte) 29);
        this.F = ea5Var2;
        hl.d3(ea5Var2, j);
    }

    public final int m(final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j2) {
        int i;
        boolean z;
        TL_phone.groupCallDonor groupcalldonor;
        int i2 = this.O;
        final int i3 = yac.h(i2).i();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.P;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j2 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j2;
        }
        sendgroupcallmessage.random_id = Utilities.b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = uc7.s1(i2).j1(j);
        ConnectionsManager.getInstance(yac.t0).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: b96
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z2 = tLObject instanceof TLRPC.Updates;
                o96 o96Var = o96.this;
                int i4 = i3;
                if (!z2) {
                    if (tL_error != null) {
                        hl.c3(new ic2(o96Var, i4, tL_error, j2, j, tL_textWithEntities));
                        return;
                    }
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList z0 = uc7.z0(updates, TL_update.TL_updateMessageID.class);
                int size = z0.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = z0.get(i5);
                    i5++;
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                    if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                        int i6 = tL_updateMessageID.id;
                        ArrayList arrayList = o96Var.r;
                        int size2 = arrayList.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size2) {
                                Object obj2 = arrayList.get(i7);
                                i7++;
                                m96 m96Var = (m96) obj2;
                                if (m96Var.a == i4) {
                                    m96Var.a = i6;
                                    break;
                                }
                            }
                        }
                    }
                }
                uc7.s1(o96Var.O).Y3(updates, false);
            }
        });
        if (this.U != null && j2 > 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.U.size()) {
                    groupcalldonor = null;
                    break;
                }
                if (((TL_phone.groupCallDonor) this.U.get(i4)).my) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i4);
                    break;
                }
                i4++;
            }
            if (groupcalldonor != null) {
                groupcalldonor.stars += j2;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = uc7.s1(i2).y1(j);
                groupcalldonor2.stars = j2;
                this.U.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(yac.t0).getCurrentTime();
        if (j == this.N || e()) {
            i = i3;
            z = true;
        } else {
            i = i3;
            z = false;
        }
        k(currentTime, i, z, j, tL_textWithEntities, j2, false);
        int i5 = i;
        p(false, true);
        return i5;
    }

    public final int n(TLRPC.TL_textWithEntities tL_textWithEntities, long j) {
        return m(getDefaultPeerId(), tL_textWithEntities, j);
    }

    public final void o() {
        v21 v21Var = this.a0;
        a96 a96Var = this.e0;
        byte b = 0;
        if (v21Var == null || !v21Var.m) {
            x53 x53Var = new x53();
            p21 p21Var = new p21(getContext(), x53Var);
            this.b0 = p21Var;
            p21Var.a.f(R.raw.stars_topup, 32, 32, null);
            this.b0.b.setText(getStarsToastTitle());
            t21 t21Var = new t21(x53Var, getContext(), true, false);
            this.c0 = t21Var;
            t21Var.e(ob6.M0(2131744680, null));
            this.c0.b = new a96((b58) this, b);
            o21 o21Var = new o21(getContext(), x53Var);
            this.d0 = o21Var;
            o21Var.b = 5000L;
            o21Var.setColor(aob.v0(aob.xj, x53Var));
            this.c0.addView(this.d0, tre.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.c0.e.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(30.0f), hl.L(8.0f));
            this.b0.setButton(this.c0);
            v21 f = v21.f(this.b, this.b0, -1);
            this.a0 = f;
            f.s = false;
            f.k(true);
            this.a0.w = a96Var;
        }
        this.S++;
        g(getDefaultPeerId());
        h(getTotalMyStars(), (int) this.S, getDefaultPeerId());
        this.b0.b.setText(getStarsToastTitle());
        this.b0.c.setText(getStarsToastSubtitle());
        this.d0.b = 5000L;
        hl.r(a96Var);
        hl.d3(a96Var, 5000L);
        long j = this.S;
        cv7 cv7Var = ((b58) this).j0.J1;
        bv7 bv7Var = cv7Var.a;
        bv7Var.c(cv7Var);
        if (bv7Var.s) {
            bv7Var.s = false;
            bv7Var.a(1.0f, null);
        }
        ArrayList arrayList = bv7Var.e;
        while (arrayList.size() > 4) {
            ((b29) arrayList.remove(0)).x(true);
        }
        int[] iArr = bv7Var.f;
        b29 b29Var = new b29(iArr[Utilities.c.nextInt(iArr.length)], hl.L(70.0f), hl.L(70.0f));
        b29Var.M(bv7Var);
        b29Var.E(true);
        b29Var.F(0);
        b29Var.start();
        arrayList.add(b29Var);
        bv7Var.invalidate();
        hn hnVar = bv7Var.c;
        hnVar.a();
        hnVar.t("+".concat(ob6.E(j, ',')), true, true);
        zu7 zu7Var = bv7Var.d;
        hl.r(zu7Var);
        hl.d3(zu7Var, 1500L);
        cv7Var.getLocationInWindow(cv7Var.G);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - cv7Var.E;
        float f2 = cv7Var.F;
        if (j2 < 100) {
            cv7Var.F = f2 + 0.5f;
        } else {
            cv7Var.F = Utilities.i(1.0f - ((j2 - 100) / 200.0f), 1.0f, 0.0f) * f2;
            LaunchActivity.a0((cv7Var.getWidth() / 2.0f) + r0[0], (cv7Var.getHeight() / 2.0f) + r0[1], Utilities.i(cv7Var.F, 0.9f, 0.3f));
            cv7Var.F = 0.0f;
            cv7Var.E = currentTimeMillis;
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.P != null) {
            a96 a96Var = this.W;
            hl.r(a96Var);
            hl.c3(a96Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P != null) {
            hl.r(this.W);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= r()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= r()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public abstract void p(boolean z, boolean z2);

    public final boolean q(long j, TLRPC.InputGroupCall inputGroupCall) {
        boolean z;
        TLRPC.InputGroupCall inputGroupCall2 = this.P;
        if ((inputGroupCall2 == null ? 0L : inputGroupCall2.id) != (inputGroupCall != null ? inputGroupCall.id : 0L)) {
            this.r.clear();
            z = true;
            this.e.O(true);
        } else {
            z = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.P;
        int i = jn7.H2;
        int i2 = this.O;
        if (inputGroupCall3 != null) {
            jn7.f(i2).n(this, i);
        }
        this.N = j;
        this.P = inputGroupCall;
        if (inputGroupCall != null) {
            jn7.f(i2).b(this, i);
        }
        if (z) {
            this.e0.run();
            a96 a96Var = this.W;
            if (inputGroupCall == null) {
                hl.r(a96Var);
                return z;
            }
            a96Var.run();
        }
        return z;
    }

    public final float r() {
        return Math.max(Math.max(0.0f, this.L - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public final void s() {
        l96 l96Var;
        n96 n96Var;
        h96 h96Var;
        m96 m96Var;
        HashMap hashMap = this.w;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.U;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new f03((byte) 26));
        int size = arrayList.size();
        int i = 0;
        int i2 = TLObject.FLAG_31;
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) obj;
            int i5 = (int) groupcalldonor.stars;
            if (i5 != i2) {
                i3++;
                i2 = i5;
            }
            if (i3 > 3) {
                break;
            } else {
                hashMap.put(Long.valueOf(wf3.n(groupcalldonor.peer_id)), Integer.valueOf(i3));
            }
        }
        int i6 = 0;
        while (true) {
            gu guVar = this.c;
            if (i6 >= guVar.getChildCount()) {
                break;
            }
            View childAt = guVar.getChildAt(i6);
            if ((childAt instanceof h96) && (m96Var = (h96Var = (h96) childAt).L) != null) {
                int d = d(m96Var.c);
                m96 m96Var2 = h96Var.L;
                if (d != m96Var2.h) {
                    m96Var2.h = d;
                    h96Var.set(m96Var2);
                }
            }
            i6++;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList3 = this.r;
            if (i7 >= arrayList3.size()) {
                break;
            }
            m96 m96Var3 = (m96) arrayList3.get(i7);
            int d2 = d(m96Var3.c);
            if (d2 != m96Var3.h) {
                m96Var3.h = d2;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            qob qobVar = this.f;
            if (i8 >= qobVar.getChildCount()) {
                break;
            }
            View childAt2 = qobVar.getChildAt(i8);
            if ((childAt2 instanceof l96) && (n96Var = (l96Var = (l96) childAt2).f) != null) {
                int d3 = d(n96Var.b);
                n96 n96Var2 = l96Var.f;
                if (d3 != n96Var2.e) {
                    n96Var2.e = d3;
                    l96Var.set(n96Var2);
                }
            }
            i8++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i >= arrayList4.size()) {
                return;
            }
            n96 n96Var3 = (n96) arrayList4.get(i);
            int d4 = d(n96Var3.b);
            if (d4 != n96Var3.e) {
                n96Var3.e = d4;
            }
            i++;
        }
    }

    public void setAllowTouches(boolean z) {
        this.H = z;
    }

    public void setLivePlayer(w96 w96Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z = this.Q == null;
        this.Q = w96Var;
        if (!z || w96Var == null || (arrayList = w96Var.L) == null || (arrayList2 = w96Var.M) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(w96Var.L);
        arrayList4.addAll(w96Var.M);
        this.e.O(true);
        ConnectionsManager.getInstance(this.O).getCurrentTime();
        Collections.sort(arrayList4, new f03(this, (byte) 27));
        this.n.O(true);
        t(false);
    }

    public final void t(boolean z) {
        ArrayList arrayList = this.s;
        if (z && this.K == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.K = !isEmpty;
        qob qobVar = this.f;
        gu guVar = this.c;
        if (z) {
            ViewPropertyAnimator translationY = guVar.animate().translationY(this.K ? 0.0f : hl.L(35.0f));
            k43 k43Var = k43.h;
            translationY.setInterpolator(k43Var).setUpdateListener(new ch4(this, (byte) 21)).setDuration(420L).start();
            qobVar.animate().translationY(this.K ? 0.0f : hl.L(35.0f)).alpha(this.K ? 1.0f : 0.0f).setInterpolator(k43Var).setDuration(420L).start();
            return;
        }
        guVar.setTranslationY(!isEmpty ? 0.0f : hl.L(35.0f));
        qobVar.setTranslationY(this.K ? 0.0f : hl.L(35.0f));
        qobVar.setAlpha(this.K ? 1.0f : 0.0f);
        invalidate();
    }
}
