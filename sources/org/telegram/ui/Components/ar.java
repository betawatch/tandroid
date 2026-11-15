package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ar extends ja {
    public final boolean T1;
    public final t60 U1;
    public TLRPC.InputPeer V1;
    public final boolean W1;
    public String X1;
    public String Y1;
    public SpannableStringBuilder Z1;
    public p41 a2;
    public final boolean b2;
    public ai.q2 c2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.telegram.ui.ActionBar.u2, org.telegram.ui.Components.ar, org.telegram.ui.Components.ja] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.ActionBar.u2] */
    public ar(Context context, int i7, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.u1 u1Var, fi.b bVar) {
        int i10;
        TLRPC.Chat M0;
        ar jaVar = new ja(context, null, false, false, bVar);
        jaVar.T1 = true;
        jaVar.v1 = 0.126f;
        jaVar.U1 = null;
        jaVar.W1 = false;
        long n10 = org.telegram.messenger.m5.n(getgroupcallstreamrtmpurl.peer);
        boolean z10 = u1Var != null && (n10 >= 0 || ((M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-n10))) != null && M0.creator));
        if (u1Var != null) {
            jaVar.b2 = true;
            hi.d dVar = new hi.d(context, bVar, true);
            dVar.i(org.telegram.messenger.hd.M0(2131748802, null), false, true);
            jaVar.b.addView(dVar, c8.ja.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new ah.g((Object) jaVar, u1Var, dVar, 27));
            if (z10) {
                hi.d dVar2 = new hi.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.r7, false));
                dVar2.d.x(org.telegram.messenger.g0.o());
                dVar2.i(org.telegram.messenger.hd.M0(2131748800, null), false, true);
                jaVar = this;
                dVar2.setOnClickListener(new di.w9(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i7));
                jaVar.b.addView(dVar2, c8.ja.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        jaVar.o1.setItemAnimator(kVar);
        uj0 uj0Var = jaVar.o1;
        int i11 = jaVar.u0;
        if (jaVar.b2) {
            i10 = org.telegram.messenger.g0.L(z10 ? 124.0f : 72.0f);
        } else {
            i10 = 0;
        }
        uj0Var.setPadding(i11, 0, i11, i10);
        jaVar.O();
        jaVar.b1();
        jaVar.X1 = groupcallstreamrtmpurl.url;
        jaVar.Y1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jaVar.Y1);
        jaVar.Z1 = spannableStringBuilder;
        wy0 wy0Var = new wy0();
        wy0Var.a |= 256;
        wy0Var.b = 0;
        wy0Var.c = spannableStringBuilder.length();
        jaVar.Z1.setSpan(new xy0(wy0Var, 0), 0, jaVar.Z1.length(), 0);
        jaVar.a2.O(false);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        TLRPC.InputPeer inputPeer;
        super.L();
        t60 t60Var = this.U1;
        if (t60Var == null || (inputPeer = this.V1) == null) {
            return;
        }
        t60Var.a(inputPeer, this.W1, false, true);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.a, 0, true, new d(this, 7), this.J0);
        this.a2 = p41Var;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131744438, null);
    }

    public ar(org.telegram.ui.ActionBar.e2 e2Var, TLRPC.Peer peer, long j3, boolean z10, t60 t60Var) {
        super(e2Var, false);
        this.T1 = false;
        this.v1 = 0.26f;
        this.U1 = t60Var;
        this.W1 = z10;
        Context context = this.b.getContext();
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.a).M0(Long.valueOf(-j3));
        boolean z11 = M0 != null && M0.creator;
        this.b2 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.M0(2131743456, null));
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, this.J0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, this.J0);
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i10, 120);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(textView, k02, M, g10, e6Var);
        this.b.addView(textView, c8.ja.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z11 ? 52 : 0) + 12));
        textView.setOnClickListener(new n2(11, this, peer));
        if (z11) {
            hi.d dVar = new hi.d(context, this.J0, false);
            dVar.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.r7, false));
            dVar.d.x(org.telegram.messenger.g0.o());
            dVar.i(org.telegram.messenger.hd.M0(2131748800, null), false, true);
            dVar.setOnClickListener(new yq(this, context, dVar, j3, 0));
            this.b.addView(dVar, c8.ja.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        uj0 uj0Var = this.o1;
        int i11 = this.u0;
        uj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L((z11 ? 52 : 0) + 72));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        O();
        b1();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = org.telegram.messenger.np.s1(this.a).j1(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.a).sendRequest(getgroupcallstreamrtmpurl, new v1(this, 1));
    }
}
