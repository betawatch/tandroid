package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class hr extends sa {
    public final boolean T1;
    public final e70 U1;
    public TLRPC.InputPeer V1;
    public final boolean W1;
    public String X1;
    public String Y1;
    public SpannableStringBuilder Z1;
    public z41 a2;
    public final boolean b2;
    public ai.r2 c2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.telegram.ui.ActionBar.x2, org.telegram.ui.Components.hr, org.telegram.ui.Components.sa] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.ActionBar.x2] */
    public hr(Context context, int i7, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.v1 v1Var, fi.b bVar) {
        int i10;
        TLRPC.Chat O0;
        hr saVar = new sa(context, null, false, false, bVar);
        saVar.T1 = true;
        saVar.v1 = 0.126f;
        saVar.U1 = null;
        saVar.W1 = false;
        long n10 = org.telegram.messenger.n5.n(getgroupcallstreamrtmpurl.peer);
        boolean z10 = v1Var != null && (n10 >= 0 || ((O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-n10))) != null && O0.creator));
        if (v1Var != null) {
            saVar.b2 = true;
            hi.d dVar = new hi.d(context, bVar, true);
            dVar.i(org.telegram.messenger.gd.M0(2131748610, null), false, true);
            saVar.b.addView(dVar, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new ah.h((Object) saVar, v1Var, dVar, 27));
            if (z10) {
                hi.d dVar2 = new hi.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.r7, false));
                dVar2.d.x(org.telegram.messenger.g0.o());
                dVar2.i(org.telegram.messenger.gd.M0(2131748608, null), false, true);
                saVar = this;
                dVar2.setOnClickListener(new di.y9(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i7));
                saVar.b.addView(dVar2, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        saVar.o1.setItemAnimator(kVar);
        ck0 ck0Var = saVar.o1;
        int i11 = saVar.u0;
        if (saVar.b2) {
            i10 = org.telegram.messenger.g0.L(z10 ? 124.0f : 72.0f);
        } else {
            i10 = 0;
        }
        ck0Var.setPadding(i11, 0, i11, i10);
        saVar.O();
        saVar.c1();
        saVar.X1 = groupcallstreamrtmpurl.url;
        saVar.Y1 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(saVar.Y1);
        saVar.Z1 = spannableStringBuilder;
        dz0 dz0Var = new dz0();
        dz0Var.a |= 256;
        dz0Var.b = 0;
        dz0Var.c = spannableStringBuilder.length();
        saVar.Z1.setSpan(new ez0(dz0Var, 0), 0, saVar.Z1.length(), 0);
        saVar.a2.O(false);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        TLRPC.InputPeer inputPeer;
        super.L();
        e70 e70Var = this.U1;
        if (e70Var == null || (inputPeer = this.V1) == null) {
            return;
        }
        e70Var.a(inputPeer, this.W1, false, true);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.a, 0, true, new d(this, 8), this.J0);
        this.a2 = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return org.telegram.messenger.gd.M0(2131744203, null);
    }

    public hr(org.telegram.ui.ActionBar.h2 h2Var, TLRPC.Peer peer, long j3, boolean z10, e70 e70Var) {
        super(h2Var, false);
        this.T1 = false;
        this.v1 = 0.26f;
        this.U1 = e70Var;
        this.W1 = z10;
        Context context = this.b.getContext();
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-j3));
        boolean z11 = O0 != null && O0.creator;
        this.b2 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.gd.M0(2131743219, null));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, this.J0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, this.J0);
        int i10 = org.telegram.ui.ActionBar.n6.d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i10, 120);
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView, k02, M, g10, i6Var);
        this.b.addView(textView, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z11 ? 52 : 0) + 12));
        textView.setOnClickListener(new y7(7, this, peer));
        if (z11) {
            hi.d dVar = new hi.d(context, this.J0, false);
            dVar.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.r7, false));
            dVar.d.x(org.telegram.messenger.g0.o());
            dVar.i(org.telegram.messenger.gd.M0(2131748608, null), false, true);
            dVar.setOnClickListener(new fr(this, context, dVar, j3, 0));
            this.b.addView(dVar, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        ck0 ck0Var = this.o1;
        int i11 = this.u0;
        ck0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L((z11 ? 52 : 0) + 72));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        O();
        c1();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = org.telegram.messenger.mp.u1(this.a).l1(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.a).sendRequest(getgroupcallstreamrtmpurl, new e2(this, 1));
    }
}
