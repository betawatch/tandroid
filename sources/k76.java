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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class k76 extends FrameLayout implements gk7 {
    public boolean E;
    public tp5 F;
    public int G;
    public boolean H;
    public long I;
    public final xl3 J;
    public boolean K;
    public float L;
    public float M;
    public long N;
    public final int O;
    public TLRPC.InputGroupCall P;
    public t76 Q;
    public long R;
    public long S;
    public boolean T;
    public ArrayList U;
    public boolean V;
    public final w66 W;
    public final View a;
    public m21 a0;
    public final FrameLayout b;
    public g21 b0;
    public final fu c;
    public k21 c0;
    public final t26 d;
    public f21 d0;
    public final vb e;
    public final w66 e0;
    public final rkb f;
    public ValueAnimator f0;
    public boolean g0;
    public final t26 h;
    public final w66 h0;
    public final l5c n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap w;
    public long x;
    public int y;

    public k76(Context context, m8b m8bVar, b8b b8bVar, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new HashMap();
        this.G = -1;
        final byte b = 1;
        this.H = true;
        this.J = new xl3((byte) 7);
        int i = y6c.t0;
        this.O = i;
        this.U = new ArrayList();
        final l18 l18Var = (l18) this;
        this.W = new w66(l18Var, b);
        byte b2 = 2;
        this.e0 = new w66(l18Var, b2);
        final byte b3 = 0;
        this.g0 = false;
        this.h0 = new w66(l18Var, (byte) 3);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        fu fuVar = new fu((byte) 24, context, (Object) l18Var);
        this.c = fuVar;
        fuVar.setWillNotDraw(false);
        t26 t26Var = new t26(1, true);
        this.d = t26Var;
        fuVar.setLayoutManager(t26Var);
        vb vbVar = new vb(l18Var, fuVar, context, i, new i8c() { // from class: x66
            @Override // i8c
            public final void a(Object obj, Object obj2) {
                byte b4 = b3;
                int i2 = 0;
                l18 l18Var2 = l18Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (b4) {
                    case 0:
                        ArrayList arrayList2 = l18Var2.r;
                        t76 t76Var = l18Var2.Q;
                        long m = t76Var == null ? 0L : t76Var.m();
                        l18Var2.I = m;
                        while (i2 < arrayList2.size()) {
                            i76 i76Var = (i76) arrayList2.get(i2);
                            if (i76Var.b || !i76Var.e || i76Var.g >= m) {
                                int i3 = c76.b;
                                c4c K = c4c.K(c76.class);
                                K.H = i76Var;
                                arrayList.add(K);
                            }
                            i2++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = l18Var2.s;
                        while (i2 < arrayList3.size()) {
                            j76 j76Var = (j76) arrayList3.get(i2);
                            int i4 = g76.b;
                            c4c K2 = c4c.K(g76.class);
                            K2.H = j76Var;
                            arrayList.add(K2);
                            i2++;
                        }
                        break;
                }
            }
        }, new f53(), (byte) 2);
        this.e = vbVar;
        fuVar.setAdapter(vbVar);
        vbVar.r = false;
        fuVar.setPadding(gl.L(8.0f), gl.L(7.5f), gl.L(8.0f), gl.L(7.5f));
        fuVar.setClipToPadding(false);
        addView(fuVar, nme.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        fuVar.setOnItemClickListener(new ir(l18Var, b8bVar, m8bVar, b2));
        y66 y66Var = new y66(l18Var);
        y66Var.m = false;
        y66Var.C = false;
        s33 s33Var = s33.h;
        y66Var.o(s33Var);
        y66Var.n(280L);
        y66Var.D = (byte) 14;
        fuVar.setItemAnimator(y66Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(bkb.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new b95(l18Var, (byte) 18));
        rkb rkbVar = new rkb(context, null, (byte) 8);
        this.f = rkbVar;
        rkbVar.setWillNotDraw(false);
        t26 t26Var2 = new t26(0, false);
        this.h = t26Var2;
        rkbVar.setLayoutManager(t26Var2);
        l5c l5cVar = new l5c(rkbVar, context, i, 0, false, new i8c() { // from class: x66
            @Override // i8c
            public final void a(Object obj, Object obj2) {
                byte b4 = b;
                int i2 = 0;
                l18 l18Var2 = l18Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (b4) {
                    case 0:
                        ArrayList arrayList2 = l18Var2.r;
                        t76 t76Var = l18Var2.Q;
                        long m = t76Var == null ? 0L : t76Var.m();
                        l18Var2.I = m;
                        while (i2 < arrayList2.size()) {
                            i76 i76Var = (i76) arrayList2.get(i2);
                            if (i76Var.b || !i76Var.e || i76Var.g >= m) {
                                int i3 = c76.b;
                                c4c K = c4c.K(c76.class);
                                K.H = i76Var;
                                arrayList.add(K);
                            }
                            i2++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = l18Var2.s;
                        while (i2 < arrayList3.size()) {
                            j76 j76Var = (j76) arrayList3.get(i2);
                            int i4 = g76.b;
                            c4c K2 = c4c.K(g76.class);
                            K2.H = j76Var;
                            arrayList.add(K2);
                            i2++;
                        }
                        break;
                }
            }
        }, null);
        this.n = l5cVar;
        rkbVar.setAdapter(l5cVar);
        l5cVar.r = false;
        rkbVar.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        rkbVar.setClipToPadding(false);
        addView(rkbVar, nme.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        rkbVar.setOnItemClickListener(new v66(l18Var));
        z66 z66Var = new z66();
        z66Var.m = false;
        z66Var.C = false;
        z66Var.o(s33Var);
        z66Var.n(350L);
        rkbVar.setItemAnimator(z66Var);
        t(false);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        t76 t76Var = this.Q;
        if (t76Var != null && t76Var.o()) {
            if (this.Q.s == null ? false : !r1.messages_enabled) {
                return this.N;
            }
        }
        return defaultSendAs == null ? y6c.h(this.O).e() : cf3.n(defaultSendAs);
    }

    private int getListViewTop() {
        fu fuVar = this.c;
        int height = fuVar.getHeight();
        for (int i = 0; i < fuVar.getChildCount(); i++) {
            height = Math.min(fuVar.getChildAt(i).getTop(), height);
        }
        return fuVar.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return gl.T2(k96.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.S)));
    }

    private String getStarsToastTitle() {
        return k96.M0(2131744788, null);
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
        wr7 wr7Var = ((l18) this).j0.P1;
        vr7 vr7Var = wr7Var.a;
        vr7Var.c(wr7Var);
        vr7Var.b();
        i();
    }

    public final void b(int i) {
        ArrayList arrayList;
        i76 i76Var;
        ArrayList arrayList2;
        boolean z = false;
        int i2 = 0;
        while (true) {
            arrayList = this.r;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                i76Var = null;
                break;
            } else {
                if (((i76) arrayList.get(i2)).a == i) {
                    i76Var = (i76) arrayList.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (i76Var != null) {
            if (i76Var.a < 0 && i76Var.e) {
                long j = i76Var.g;
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
                if (((j76) arrayList2.get(i3)).f.contains(i76Var)) {
                    ((j76) arrayList2.get(i3)).f.remove(i76Var);
                    if (((j76) arrayList2.get(i3)).f.isEmpty()) {
                        arrayList2.remove(i3);
                        z = true;
                    } else {
                        ((j76) arrayList2.get(i3)).c();
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
                Collections.sort(arrayList2, new mz2(this, (byte) 24));
                this.n.O(true);
                s();
                t(true);
            }
        }
    }

    public final d76 c(int i) {
        d76 d76Var;
        i76 i76Var;
        int i2 = 0;
        while (true) {
            fu fuVar = this.c;
            if (i2 >= fuVar.getChildCount()) {
                return null;
            }
            View childAt = fuVar.getChildAt(i2);
            if ((childAt instanceof d76) && (i76Var = (d76Var = (d76) childAt).L) != null && i76Var.a == i) {
                return d76Var;
            }
            i2++;
        }
    }

    public final int d(long j) {
        return ((Integer) Map.-EL.getOrDefault(this.w, Long.valueOf(j), 0)).intValue();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.G2) {
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
                long n = cf3.n(groupCallMessage.from_id);
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
        fu fuVar = this.c;
        if (view != fuVar) {
            return super.drawChild(canvas, view, j);
        }
        if (fuVar.getAlpha() <= 0.0f) {
            return true;
        }
        float max = Math.max(0.0f, this.L - fuVar.getTop()) + fuVar.getY();
        canvas.saveLayerAlpha(fuVar.getX(), fuVar.getY(), fuVar.getX() + fuVar.getWidth(), fuVar.getY() + fuVar.getHeight(), kk7.d4, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((fuVar.getY() + fuVar.getHeight()) - max, getListViewTop()) * (1.0f - fuVar.getAlpha()));
        canvas.clipRect(0.0f, max, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        RectF rectF = gl.P;
        rectF.set(0.0f, max, getWidth(), gl.L(12.0f) + max);
        xl3 xl3Var = this.J;
        xl3Var.s(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (fuVar.getY() + fuVar.getHeight()) - gl.L(12.0f), getWidth(), fuVar.getHeight() + fuVar.getBottom());
        xl3Var.s(canvas, rectF, 3, 1.0f);
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
            return j == y6c.h(i).e();
        }
        t76 t76Var = this.Q;
        if (t76Var == null || (inputGroupCall = this.P) == null || inputGroupCall.id != t76Var.j() || (groupCall = this.Q.s) == null || !groupCall.creator) {
            return hc2.w(14, na7.q1(i).K0(Long.valueOf(-this.N)));
        }
        return true;
    }

    public final Integer f(Long l) {
        this.e0.run();
        this.S = l.longValue();
        m21 I = new u21(this.b, new f53()).I(R.raw.stars_topup, getStarsToastTitle(), getStarsToastSubtitle());
        boolean z = false;
        I.r = false;
        I.k(true);
        this.S = 0L;
        this.T = true;
        int n = n(new TLRPC.TL_textWithEntities(), l.longValue());
        t76 t76Var = this.Q;
        long m = t76Var != null ? t76Var.m() : 0L;
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
        fu fuVar = this.c;
        int height = fuVar.getHeight();
        for (int i = 0; i < fuVar.getChildCount(); i++) {
            height = Math.min(fuVar.getChildAt(i).getTop(), height);
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
        t76 t76Var = this.Q;
        long m = t76Var == null ? 0L : t76Var.m();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i >= arrayList.size()) {
                return i2;
            }
            i76 i76Var = (i76) arrayList.get(i);
            int i3 = i76Var.a;
            if (i3 >= 0 && i3 > this.G && (i76Var.b || !i76Var.e || i76Var.g >= m)) {
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
        long e = y6c.h(this.O).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e = cf3.n(defaultSendAs);
        }
        e53 e53Var = new e53((byte) 1);
        bwa bwaVar = new bwa(getContext(), this.O, this.N, null, null, arrayList, !z, true, e, e53Var);
        l18 l18Var = (l18) this;
        bwaVar.J1 = l18Var;
        bwaVar.L1 = new v66(l18Var);
        bwaVar.show();
    }

    public final void k(int i, int i2, boolean z, long j, TLRPC.TL_textWithEntities tL_textWithEntities, long j2, boolean z2) {
        long j3;
        int i3;
        TL_phone.groupCallDonor groupcalldonor;
        j76 j76Var;
        boolean z3;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i4 >= arrayList.size()) {
                int i5 = this.O;
                int currentTime = ConnectionsManager.getInstance(i5).getCurrentTime();
                i76 i76Var = new i76();
                i76Var.d = i;
                i76Var.b = z;
                i76Var.c = j;
                i76Var.f = tL_textWithEntities;
                i76Var.g = j2;
                i76Var.a = i2;
                i76Var.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b = de5.b(i5, (int) i76Var.g, 0);
                long j4 = i76Var.g;
                long j5 = 0;
                ArrayList arrayList2 = this.s;
                if (j4 <= 0 || b <= 0 || currentTime - i76Var.d > b) {
                    j3 = 0;
                } else {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            j3 = j5;
                            j76Var = null;
                            break;
                        }
                        j3 = j5;
                        if (((j76) arrayList2.get(i6)).b == j) {
                            j76Var = (j76) arrayList2.get(i6);
                            break;
                        } else {
                            i6++;
                            j5 = j3;
                        }
                    }
                    if (j76Var == null) {
                        j76Var = new j76();
                        ArrayList arrayList3 = new ArrayList();
                        j76Var.f = arrayList3;
                        j76Var.a = i5;
                        j76Var.b = j;
                        arrayList3.add(i76Var);
                        arrayList2.add(0, j76Var);
                        z3 = true;
                    } else {
                        j76Var.f.add(i76Var);
                        this.f.h1();
                        z3 = false;
                    }
                    j76Var.c();
                    t(true);
                    l();
                    Collections.sort(arrayList2, new mz2(this, (byte) 24));
                    if (!z2) {
                        this.n.O(true);
                    }
                    if (z3) {
                        this.h.m0(0);
                    }
                }
                if (!z2 && i76Var.e) {
                    long j6 = i76Var.g;
                    if (j6 > j3) {
                        this.R += j6;
                        i();
                    }
                }
                if (i76Var.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (i76Var.a < ((i76) arrayList.get(size)).a) {
                            i3 = size + 1;
                            break;
                        }
                    }
                }
                i3 = 0;
                arrayList.add(i3, i76Var);
                if (!z2) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.O(true);
                }
                if (i3 <= 0 && !z2 && (!this.c.canScrollVertically(1) || i76Var.a < 0)) {
                    this.d.g1(0, gl.L(100.0f));
                    int i7 = i76Var.a;
                    if (i7 > 0) {
                        this.G = i7;
                    }
                }
                invalidate();
                l18 l18Var = (l18) this;
                jm2 jm2Var = l18Var.j0.N1;
                if (jm2Var != null) {
                    jm2Var.setCount(l18Var.getUnreadMessagesCount());
                }
                if (!z2 && i2 > 0 && i76Var.g > j3) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= this.U.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (cf3.n(((TL_phone.groupCallDonor) this.U.get(i8)).peer_id) == i76Var.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i8);
                                break;
                            }
                            i8++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = y6c.h(i5).e() == i76Var.c;
                        groupcalldonor.peer_id = na7.q1(i5).w1(i76Var.c);
                        groupcalldonor.stars = j3;
                        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                            if (((j76) arrayList2.get(i9)).b == i76Var.c) {
                                ((j76) arrayList2.get(i9)).b();
                                groupcalldonor.stars += ((j76) arrayList2.get(i9)).d;
                            }
                        }
                        this.U.add(groupcalldonor);
                    }
                    long j7 = groupcalldonor.stars;
                    long j8 = i76Var.g;
                    long j9 = j7 + j8;
                    groupcalldonor.stars = j9;
                    h((int) j9, (int) j8, i76Var.c);
                }
                s();
                if (z2) {
                    w66 w66Var = this.h0;
                    gl.r(w66Var);
                    gl.e3(w66Var, 100L);
                }
                t76 t76Var = this.Q;
                if (t76Var != null) {
                    t76Var.L = arrayList;
                    t76Var.M = arrayList2;
                    return;
                }
                return;
            }
            if (((i76) arrayList.get(i4)).a == i2) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void l() {
        int i;
        tp5 tp5Var = this.F;
        if (tp5Var != null) {
            gl.r(tp5Var);
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
            j76 j76Var = (j76) obj;
            ArrayList arrayList2 = j76Var.f;
            int size2 = arrayList2.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                i76 i76Var = (i76) obj2;
                long j2 = i76Var.g;
                if (j2 > 0) {
                    i = currentTime;
                    i3 = Math.max(i3, de5.b(j76Var.a, (int) j2, 0) + i76Var.d);
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
        tp5 tp5Var2 = new tp5(this, (byte) 14);
        this.F = tp5Var2;
        gl.e3(tp5Var2, j);
    }

    public final int m(final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j2) {
        int i;
        boolean z;
        TL_phone.groupCallDonor groupcalldonor;
        int i2 = this.O;
        final int i3 = y6c.h(i2).i();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.P;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j2 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j2;
        }
        sendgroupcallmessage.random_id = Utilities.b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = na7.q1(i2).h1(j);
        ConnectionsManager.getInstance(y6c.t0).sendRequest(sendgroupcallmessage, new RequestDelegate() { // from class: u66
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z2 = tLObject instanceof TLRPC.Updates;
                k76 k76Var = k76.this;
                int i4 = i3;
                if (!z2) {
                    if (tL_error != null) {
                        gl.d3(new sb2(k76Var, i4, tL_error, j2, j, tL_textWithEntities));
                        return;
                    }
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList x0 = na7.x0(updates, TL_update.TL_updateMessageID.class);
                int size = x0.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = x0.get(i5);
                    i5++;
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                    if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                        int i6 = tL_updateMessageID.id;
                        ArrayList arrayList = k76Var.r;
                        int size2 = arrayList.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size2) {
                                Object obj2 = arrayList.get(i7);
                                i7++;
                                i76 i76Var = (i76) obj2;
                                if (i76Var.a == i4) {
                                    i76Var.a = i6;
                                    break;
                                }
                            }
                        }
                    }
                }
                na7.q1(k76Var.O).Q3(updates, false);
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
                groupcalldonor2.peer_id = na7.q1(i2).w1(j);
                groupcalldonor2.stars = j2;
                this.U.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(y6c.t0).getCurrentTime();
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
        m21 m21Var = this.a0;
        w66 w66Var = this.e0;
        byte b = 0;
        if (m21Var == null || !m21Var.l) {
            f53 f53Var = new f53();
            g21 g21Var = new g21(getContext(), f53Var);
            this.b0 = g21Var;
            g21Var.a.f(R.raw.stars_topup, 32, 32, null);
            this.b0.b.setText(getStarsToastTitle());
            k21 k21Var = new k21(f53Var, getContext(), true, false);
            this.c0 = k21Var;
            k21Var.e(k96.M0(2131744786, null));
            this.c0.b = new w66((l18) this, b);
            f21 f21Var = new f21(getContext(), f53Var);
            this.d0 = f21Var;
            f21Var.b = 5000L;
            f21Var.setColor(bkb.v0(bkb.wj, f53Var));
            this.c0.addView(this.d0, nme.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.c0.e.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(30.0f), gl.L(8.0f));
            this.b0.setButton(this.c0);
            m21 f = m21.f(this.b, this.b0, -1);
            this.a0 = f;
            f.r = false;
            f.k(true);
            this.a0.v = w66Var;
        }
        this.S++;
        g(getDefaultPeerId());
        h(getTotalMyStars(), (int) this.S, getDefaultPeerId());
        this.b0.b.setText(getStarsToastTitle());
        this.b0.c.setText(getStarsToastSubtitle());
        this.d0.b = 5000L;
        gl.r(w66Var);
        gl.e3(w66Var, 5000L);
        long j = this.S;
        wr7 wr7Var = ((l18) this).j0.P1;
        vr7 vr7Var = wr7Var.a;
        vr7Var.c(wr7Var);
        if (vr7Var.s) {
            vr7Var.s = false;
            vr7Var.a(1.0f, null);
        }
        ArrayList arrayList = vr7Var.e;
        while (arrayList.size() > 4) {
            ((oy8) arrayList.remove(0)).x(true);
        }
        int[] iArr = vr7Var.f;
        oy8 oy8Var = new oy8(iArr[Utilities.c.nextInt(iArr.length)], gl.L(70.0f), gl.L(70.0f));
        oy8Var.M(vr7Var);
        oy8Var.E(true);
        oy8Var.F(0);
        oy8Var.start();
        arrayList.add(oy8Var);
        vr7Var.invalidate();
        gn gnVar = vr7Var.c;
        gnVar.a();
        gnVar.t("+".concat(k96.E(j, ',')), true, true);
        tr7 tr7Var = vr7Var.d;
        gl.r(tr7Var);
        gl.e3(tr7Var, 1500L);
        wr7Var.getLocationInWindow(wr7Var.G);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - wr7Var.E;
        float f2 = wr7Var.F;
        if (j2 < 100) {
            wr7Var.F = f2 + 0.5f;
        } else {
            wr7Var.F = Utilities.i(1.0f - ((j2 - 100) / 200.0f), 1.0f, 0.0f) * f2;
            LaunchActivity.a0((wr7Var.getWidth() / 2.0f) + r0[0], (wr7Var.getHeight() / 2.0f) + r0[1], Utilities.i(wr7Var.F, 0.9f, 0.3f));
            wr7Var.F = 0.0f;
            wr7Var.E = currentTimeMillis;
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.P != null) {
            w66 w66Var = this.W;
            gl.r(w66Var);
            gl.d3(w66Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P != null) {
            gl.r(this.W);
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
        int i = kk7.G2;
        int i2 = this.O;
        if (inputGroupCall3 != null) {
            kk7.f(i2).n(this, i);
        }
        this.N = j;
        this.P = inputGroupCall;
        if (inputGroupCall != null) {
            kk7.f(i2).b(this, i);
        }
        if (z) {
            this.e0.run();
            w66 w66Var = this.W;
            if (inputGroupCall == null) {
                gl.r(w66Var);
                return z;
            }
            w66Var.run();
        }
        return z;
    }

    public final float r() {
        return Math.max(Math.max(0.0f, this.L - r0.getTop()), getListViewContentTop()) + this.c.getY();
    }

    public final void s() {
        h76 h76Var;
        j76 j76Var;
        d76 d76Var;
        i76 i76Var;
        HashMap hashMap = this.w;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.U;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new mz2((byte) 25));
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
                hashMap.put(Long.valueOf(cf3.n(groupcalldonor.peer_id)), Integer.valueOf(i3));
            }
        }
        int i6 = 0;
        while (true) {
            fu fuVar = this.c;
            if (i6 >= fuVar.getChildCount()) {
                break;
            }
            View childAt = fuVar.getChildAt(i6);
            if ((childAt instanceof d76) && (i76Var = (d76Var = (d76) childAt).L) != null) {
                int d = d(i76Var.c);
                i76 i76Var2 = d76Var.L;
                if (d != i76Var2.h) {
                    i76Var2.h = d;
                    d76Var.set(i76Var2);
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
            i76 i76Var3 = (i76) arrayList3.get(i7);
            int d2 = d(i76Var3.c);
            if (d2 != i76Var3.h) {
                i76Var3.h = d2;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            rkb rkbVar = this.f;
            if (i8 >= rkbVar.getChildCount()) {
                break;
            }
            View childAt2 = rkbVar.getChildAt(i8);
            if ((childAt2 instanceof h76) && (j76Var = (h76Var = (h76) childAt2).f) != null) {
                int d3 = d(j76Var.b);
                j76 j76Var2 = h76Var.f;
                if (d3 != j76Var2.e) {
                    j76Var2.e = d3;
                    h76Var.set(j76Var2);
                }
            }
            i8++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i >= arrayList4.size()) {
                return;
            }
            j76 j76Var3 = (j76) arrayList4.get(i);
            int d4 = d(j76Var3.b);
            if (d4 != j76Var3.e) {
                j76Var3.e = d4;
            }
            i++;
        }
    }

    public void setAllowTouches(boolean z) {
        this.H = z;
    }

    public void setLivePlayer(t76 t76Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z = this.Q == null;
        this.Q = t76Var;
        if (!z || t76Var == null || (arrayList = t76Var.L) == null || (arrayList2 = t76Var.M) == null || arrayList == (arrayList3 = this.r) || arrayList2 == (arrayList4 = this.s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(t76Var.L);
        arrayList4.addAll(t76Var.M);
        this.e.O(true);
        ConnectionsManager.getInstance(this.O).getCurrentTime();
        Collections.sort(arrayList4, new mz2(this, (byte) 24));
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
        rkb rkbVar = this.f;
        fu fuVar = this.c;
        if (z) {
            ViewPropertyAnimator translationY = fuVar.animate().translationY(this.K ? 0.0f : gl.L(35.0f));
            s33 s33Var = s33.h;
            translationY.setInterpolator(s33Var).setUpdateListener(new ni4(this, (byte) 18)).setDuration(420L).start();
            rkbVar.animate().translationY(this.K ? 0.0f : gl.L(35.0f)).alpha(this.K ? 1.0f : 0.0f).setInterpolator(s33Var).setDuration(420L).start();
            return;
        }
        fuVar.setTranslationY(!isEmpty ? 0.0f : gl.L(35.0f));
        rkbVar.setTranslationY(this.K ? 0.0f : gl.L(35.0f));
        rkbVar.setAlpha(this.K ? 1.0f : 0.0f);
        invalidate();
    }
}
