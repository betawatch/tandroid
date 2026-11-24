// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ll4 extends fy0 {
    public static final /* synthetic */ int A2 = 0;
    public String S1;
    public int T1;
    public TL_chatlists.chatlist_ChatlistInvite U1;
    public TL_chatlists.TL_chatlists_chatlistUpdates V1;
    public final boolean W1;
    public String X1;
    public ArrayList Y1;
    public boolean Z1;
    public CharSequence a2;
    public ArrayList b2;
    public ArrayList c2;
    public ArrayList d2;
    public ArrayList e2;
    public FrameLayout f2;
    public hl4 g2;
    public View h2;
    public kl4 i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public int n2;
    public int o2;
    public int p2;
    public int q2;
    public int r2;
    public int s2;
    public il4 t2;
    public int u2;
    public boolean v2;
    public p8c w2;
    public int x2;
    public long y2;
    public long z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll4(d dVar, int i, ArrayList arrayList) {
        super(dVar, false);
        t97 t97Var;
        TLRPC.Chat K0;
        this.T1 = -1;
        this.X1 = "";
        this.Y1 = new ArrayList();
        this.a2 = "";
        this.c2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.d2 = arrayList2;
        this.u2 = -1;
        this.x2 = -5;
        this.T1 = i;
        this.W1 = true;
        this.b2 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = dVar.getMessagesController().G0;
        if (arrayList3 != null) {
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                if (((t97) arrayList3.get(i2)).a == i) {
                    t97Var = (t97) arrayList3.get(i2);
                    break;
                }
            }
        }
        t97Var = null;
        if (t97Var != null) {
            this.X1 = t97Var.b;
            this.Y1 = t97Var.c;
            this.Z1 = t97Var.n;
            for (int i3 = 0; i3 < this.d2.size(); i3++) {
                TLRPC.Peer w1 = dVar.getMessagesController().w1(((Long) this.d2.get(i3)).longValue());
                if ((w1 instanceof TLRPC.TL_peerChat) || (w1 instanceof TLRPC.TL_peerChannel)) {
                    this.b2.add(w1);
                }
            }
            for (int i4 = 0; i4 < t97Var.h.size(); i4++) {
                Long l = (Long) t97Var.h.get(i4);
                long longValue = l.longValue();
                if (!this.d2.contains(l)) {
                    TLRPC.Peer w12 = dVar.getMessagesController().w1(longValue);
                    if (((w12 instanceof TLRPC.TL_peerChat) || (w12 instanceof TLRPC.TL_peerChannel)) && ((K0 = dVar.getMessagesController().K0(Long.valueOf(-longValue))) == null || !hc2.r0(K0))) {
                        this.b2.add(w12);
                    }
                }
            }
        }
        a1();
    }

    public static void b1(d dVar, int i, p8c p8cVar) {
        t97 t97Var;
        ArrayList arrayList = dVar.getMessagesController().G0;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((t97) arrayList.get(i2)).a == i) {
                    t97Var = (t97) arrayList.get(i2);
                    break;
                }
            }
        }
        t97Var = null;
        va7 va7Var = new va7(i, (Object) dVar, (Object) p8cVar, (byte) 27);
        if (t97Var == null || !t97Var.e()) {
            va7Var.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getContext());
        String M0 = k96.M0(2131750778, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131750776, null);
        alertDialog$Builder.g(k96.M0(2131752577, null), new p52(p8cVar, (byte) 1));
        alertDialog$Builder.j(k96.M0(2131751586, null), new kx3(va7Var, (byte) 20));
        dVar.showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, null);
        }
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        return new el4(this);
    }

    @Override // fy0
    public final CharSequence J0() {
        if (this.W1) {
            return k96.M0(2131750616, null);
        }
        if (this.U1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return k96.M0(2131750619, null);
        }
        ArrayList arrayList = this.b2;
        return (arrayList == null || arrayList.isEmpty()) ? k96.M0(2131750617, null) : k96.M0(2131750618, null);
    }

    @Override // fy0
    public final void P0(cja cjaVar) {
        o39 o39Var = this.n1;
        byte b = 2;
        o39Var.setOverScrollMode(2);
        o39Var.setPadding(gl.L(6.0f), 0, gl.L(6.0f), gl.L(this.g2 != null ? 68.0f : 0.0f));
        o39Var.setOnItemClickListener(new bf4(this, b));
    }

    public final void Y0(boolean z) {
        String str;
        String G = k96.G(this.d2.size(), "FilterInviteHeaderChats", new Object[0]);
        if (!z || this.t2 == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.t2.b.getText());
        }
        gl.g2(G.concat(str));
    }

    public final void Z0(il4 il4Var, boolean z) {
        ArrayList arrayList = this.b2;
        ArrayList arrayList2 = this.d2;
        arrayList2.clear();
        arrayList2.addAll(this.c2);
        int i = 0;
        if (!z) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                long n = cf3.n((TLRPC.Peer) arrayList.get(i2));
                if (!arrayList2.contains(Long.valueOf(n))) {
                    arrayList2.add(Long.valueOf(n));
                }
            }
        }
        c1(true);
        il4Var.a(k96.M0(z ? 2131745478 : 2131751445, null), new mn6((Object) this, (Object) il4Var, z, (byte) 22));
        Y0(true);
        while (true) {
            o39 o39Var = this.n1;
            if (i >= o39Var.getChildCount()) {
                return;
            }
            View childAt = o39Var.getChildAt(i);
            if (childAt instanceof za5) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((za5) childAt).c(arrayList2.contains((Long) tag), true);
                }
            }
            i++;
        }
    }

    public final void a1() {
        boolean z;
        long j;
        boolean r0;
        ArrayList arrayList = this.e2;
        this.a2 = gl.G2(this.X1, "✱", "*");
        ArrayList arrayList2 = this.b2;
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j = peer.user_id;
                        z = false;
                    } else {
                        boolean z2 = peer instanceof TLRPC.TL_peerChat;
                        d dVar = this.r1;
                        if (z2) {
                            j = -peer.chat_id;
                            r0 = hc2.r0(dVar.getMessagesController().K0(Long.valueOf(-j)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j = -peer.channel_id;
                            r0 = hc2.r0(dVar.getMessagesController().K0(Long.valueOf(-j)));
                        } else {
                            z = false;
                            j = 0;
                        }
                        z = !r0;
                    }
                    if (j != 0 && !this.W1) {
                        if (z) {
                            this.c2.add(Long.valueOf(j));
                        }
                        this.d2.add(Long.valueOf(j));
                    }
                }
            }
        }
        this.j2 = 1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.k2 = -1;
            this.l2 = -1;
            this.m2 = -1;
            this.n2 = -1;
        } else {
            int i2 = this.j2;
            int i3 = i2 + 1;
            this.k2 = i2;
            int i4 = i2 + 2;
            this.j2 = i4;
            this.l2 = i3;
            this.m2 = i4;
            int size = arrayList2.size() + i4;
            this.j2 = size;
            this.n2 = size;
        }
        int i5 = this.j2;
        this.j2 = i5 + 1;
        this.o2 = i5;
        if (arrayList == null || arrayList.isEmpty()) {
            this.p2 = -1;
            this.q2 = -1;
            this.r2 = -1;
            this.s2 = -1;
        } else {
            int i6 = this.j2;
            int i7 = i6 + 1;
            this.j2 = i7;
            this.p2 = i6;
            this.q2 = i7;
            int size2 = arrayList.size() + i7;
            this.r2 = size2;
            this.j2 = size2 + 1;
            this.s2 = size2;
        }
        Context context = getContext();
        hl4 hl4Var = new hl4(context);
        s33 s33Var = s33.h;
        hl4Var.e = new lm(350L, s33Var);
        hl4Var.n = 0.0f;
        hl4Var.w = 1.0f;
        hl4Var.E = 1.0f;
        hl4Var.F = true;
        hl4Var.J = bkb.I.o();
        View view = new View(context);
        hl4Var.f = view;
        int i8 = bkb.Ei;
        view.setBackground(sjb.d(0, sjb.b(bkb.w0(null, i8, false)), 8.0f));
        hl4Var.addView(view, nme.c(-1.0f, -1));
        ShapeDrawable b0 = bkb.b0(gl.L(8.0f), bkb.w0(null, i8, false));
        hl4Var.h = b0;
        hl4Var.setBackground(b0);
        Paint paint = new Paint(1);
        hl4Var.a = paint;
        int i9 = bkb.Ii;
        paint.setColor(bkb.w0(null, i9, false));
        gn gnVar = new gn(true, true, false);
        hl4Var.b = gnVar;
        gnVar.n(0.3f, 250L, s33Var);
        gnVar.setCallback(hl4Var);
        gnVar.w(gl.L(14.0f));
        gnVar.x(gl.o());
        gnVar.u(bkb.w0(null, i9, false));
        gnVar.t("", true, true);
        gnVar.b = 1;
        gn gnVar2 = new gn(false, false, true);
        hl4Var.c = gnVar2;
        gnVar2.n(0.3f, 250L, s33Var);
        gnVar2.setCallback(hl4Var);
        gnVar2.w(gl.L(12.0f));
        gnVar2.x(gl.o());
        gnVar2.u(bkb.w0(null, i8, false));
        gnVar2.t("", true, true);
        gnVar2.b = 1;
        hl4Var.setWillNotDraw(false);
        this.g2 = hl4Var;
        hl4Var.setOnClickListener(new yj3(this, (byte) 17));
        this.b.addView(this.g2, nme.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.h2 = view2;
        zkb.h(bkb.Z6, null, view2);
        this.b.addView(this.h2, nme.d(-1, 1.0f / gl.p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.n1.setPadding(gl.L(6.0f), 0, gl.L(6.0f), gl.L(this.g2 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f2 = frameLayout;
        this.b.addView(frameLayout, nme.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        L(bkb.w0(null, bkb.g5, false));
        c1(false);
        this.o1.setTitle(J0());
    }

    public final void c1(boolean z) {
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.U1;
        int size = this.d2.size();
        hl4 hl4Var = this.g2;
        if (hl4Var != null) {
            if (this.W1) {
                hl4Var.b(k96.M0(size > 0 ? 2131750652 : 2131750653, null), z);
            } else {
                ArrayList arrayList = this.b2;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.g2.b(k96.M0(2131747638, null), z);
                } else {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.g2.b(k96.V(null, null, 2131750658, k27.A5(vu3.m(this.X1, this.g2.b.a.getFontMetricsInt(), false, null, 0), this.Y1, this.g2.b.a.getFontMetricsInt(), false)), z);
                        this.g2.b.p = this.Z1 ? 26 : 0;
                    } else {
                        this.g2.b(size > 0 ? k96.G(size, "FolderLinkButtonJoinPlural", new Object[0]) : k96.M0(2131750654, null), z);
                    }
                }
            }
            hl4 hl4Var2 = this.g2;
            gn gnVar = hl4Var2.c;
            if (z) {
                gnVar.a();
                int i = hl4Var2.y;
                if (size != i && size > 0 && i > 0) {
                    ValueAnimator valueAnimator = hl4Var2.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        hl4Var2.x = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    hl4Var2.x = ofFloat;
                    ofFloat.addUpdateListener(new fl4(hl4Var2, (byte) 1));
                    hl4Var2.x.addListener(new im2(hl4Var2, (byte) 23));
                    b00.n(2.0f, hl4Var2.x);
                    hl4Var2.x.setDuration(200L);
                    hl4Var2.x.start();
                }
            }
            hl4Var2.y = size;
            hl4Var2.d = size != 0 ? 1.0f : 0.0f;
            gnVar.t(String.valueOf(size), z, true);
            hl4Var2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.g2.setEnabled(!r1.isEmpty());
            }
        }
        kl4 kl4Var = this.i2;
        if (kl4Var != null) {
            kl4Var.a();
        }
    }

    public final void d1() {
        ArrayList arrayList = this.c2;
        ArrayList arrayList2 = this.b2;
        il4 il4Var = this.t2;
        if (il4Var == null) {
            return;
        }
        if (this.W1) {
            il4Var.b(k96.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            il4Var.b(k96.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.t2.a("", null);
        } else {
            boolean z = this.d2.size() >= arrayList2.size() - arrayList.size();
            this.t2.a(k96.M0(z ? 2131751445 : 2131745478, null), new x6c((byte) 20, this, z));
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        if (this.u2 >= 0) {
            this.r1.getConnectionsManager().cancelRequest(this.u2, true);
        }
        p8c p8cVar = this.w2;
        if (p8cVar != null) {
            p8cVar.a(Boolean.valueOf(this.v2));
            this.w2 = null;
        }
    }

    @Override // fx0
    public final void p0() {
        super.p0();
        try {
            int w0 = bkb.w0(null, bkb.g5, false);
            if (this.H0 != w0) {
                L(w0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
