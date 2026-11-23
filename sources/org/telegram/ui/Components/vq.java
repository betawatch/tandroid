package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vq implements Runnable {
    public final /* synthetic */ boolean[] E;
    public final /* synthetic */ org.telegram.messenger.w10 F;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 G;
    public final /* synthetic */ org.telegram.ui.ii H;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 I;
    public final /* synthetic */ org.telegram.ui.Cells.z8 J;
    public final /* synthetic */ Context K;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.ui.Cells.l3 c;
    public final /* synthetic */ TreeSet d;
    public final /* synthetic */ String[] e;
    public final /* synthetic */ uq f;
    public final /* synthetic */ org.telegram.ui.Cells.l3 h;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ ai.x0 r;
    public final /* synthetic */ hi.e s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ TLRPC.User y;

    public /* synthetic */ vq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.l3 l3Var, TreeSet treeSet, String[] strArr, uq uqVar, org.telegram.ui.Cells.l3 l3Var2, int[] iArr2, ai.x0 x0Var, hi.e eVar, boolean z10, int i7, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.w10 w10Var, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ii iiVar, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Cells.z8 z8Var, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = l3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = uqVar;
        this.h = l3Var2;
        this.n = iArr2;
        this.r = x0Var;
        this.s = eVar;
        this.w = z10;
        this.x = i7;
        this.y = user;
        this.E = zArr2;
        this.F = w10Var;
        this.G = w2Var;
        this.H = iiVar;
        this.I = i6Var;
        this.J = z8Var;
        this.K = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final org.telegram.ui.Cells.l3 l3Var = this.h;
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        final boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        final int[] iArr = this.b;
        if (iArr[0] >= 0) {
            return;
        }
        final org.telegram.ui.Cells.l3 l3Var2 = this.c;
        String charSequence = l3Var2.getText().toString();
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(charSequence);
        boolean a10 = yq.a(charSequence, "bot");
        final TreeSet treeSet = this.d;
        m10.append((a10 || yq.c(charSequence, treeSet) != null) ? "" : "bot");
        String sb2 = m10.toString();
        final String[] strArr = this.e;
        if (!TextUtils.equals(strArr[0], sb2)) {
            this.f.run();
            return;
        }
        String trim = j3Var.getText().toString().trim();
        boolean isEmpty = TextUtils.isEmpty(trim);
        final int[] iArr2 = this.n;
        if (isEmpty) {
            int i7 = -iArr2[0];
            iArr2[0] = i7;
            org.telegram.messenger.g0.E3(i7, l3Var, null);
            return;
        }
        this.r.run();
        final hi.e eVar = this.s;
        eVar.setLoading(true);
        eVar.setEnabled(false);
        j3Var.setEnabled(false);
        l3Var2.d.setEnabled(false);
        final TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.w;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i10 = this.x;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
        final TLRPC.User user = this.y;
        createbot.manager_id = u12.s1(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        d3.b bVar = new d3.b(1);
        final boolean[] zArr2 = this.E;
        final org.telegram.messenger.w10 w10Var = this.F;
        final org.telegram.ui.ActionBar.w2 w2Var = this.G;
        final org.telegram.ui.ii iiVar = this.H;
        final org.telegram.ui.ActionBar.i6 i6Var = this.I;
        final org.telegram.ui.Cells.z8 z8Var = this.J;
        final Context context = this.K;
        iArr[0] = connectionsManager.sendRequestTyped(createbot, bVar, new org.telegram.messenger.p10() { // from class: org.telegram.ui.Components.sq
            @Override // org.telegram.messenger.p10
            public final void a(Object obj, Object obj2) {
                String q10;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (zArr[0]) {
                    return;
                }
                iArr[0] = -1;
                hi.e eVar2 = eVar;
                eVar2.setLoading(false);
                eVar2.setEnabled(true);
                l3Var.d.setEnabled(true);
                l3Var2.d.setEnabled(true);
                int i11 = i10;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                if (user2 != null) {
                    zArr2[0] = true;
                    org.telegram.messenger.mp.u1(i11).e4(user2, false, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    org.telegram.messenger.tr.a0(i11).m1(arrayList, null, false, false);
                    w10Var.a(user2);
                    w2Var2.dismiss();
                    return;
                }
                if (tL_error != null) {
                    String str = createbot.username;
                    String str2 = tL_error.text;
                    TreeSet treeSet2 = treeSet;
                    org.telegram.ui.ii iiVar2 = iiVar;
                    org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                    CharSequence d = yq.d(i11, str, treeSet2, str2, iiVar2, i6Var2);
                    if (d != null) {
                        strArr[0] = null;
                        eVar2.setEnabled(false);
                        org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                        z8Var2.setText(d);
                        org.telegram.ui.ActionBar.u6.U(z8Var2.getTextView(), org.telegram.ui.ActionBar.n6.q7, i6Var2);
                        int[] iArr3 = iArr2;
                        int i12 = -iArr3[0];
                        iArr3[0] = i12;
                        org.telegram.messenger.g0.E3(i12, z8Var2, null);
                    } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.p0 p0Var = org.telegram.messenger.mp.u1(i11).A7;
                        boolean q11 = org.telegram.messenger.i10.i(i11).q();
                        kc kcVar = new kc(w2Var2.F, i6Var2);
                        String N0 = org.telegram.messenger.gd.N0(2131751723, null);
                        SpannableStringBuilder O2 = org.telegram.messenger.g0.O2(q11 ? org.telegram.messenger.gd.a0(null, null, 2131751726, Integer.valueOf(((org.telegram.messenger.j0) p0Var.R.b).c)) : org.telegram.messenger.gd.a0(null, null, 2131751725, Integer.valueOf(((org.telegram.messenger.j0) p0Var.R.b).c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.Q.b).c)), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var2), new lo(w2Var2, 4));
                        xd xdVar = new xd(24, w2Var2, context);
                        int t6 = org.telegram.messenger.g0.t(O2, "@BotFather");
                        if (t6 >= 0) {
                            O2.setSpan(new org.telegram.ui.Cells.h(i6Var2, xdVar, 6), t6, t6 + 10, 33);
                        }
                        fc I = kcVar.I(R.raw.error, N0, O2);
                        I.j = 8000;
                        I.j();
                    } else {
                        String str3 = tL_error.text;
                        if (str3 != null && str3.startsWith("FLOOD_WAIT_")) {
                            new kc(w2Var2.F, i6Var2).I(R.raw.error, org.telegram.messenger.gd.N0(2131751723, null), org.telegram.messenger.gd.a0(null, null, 2131751724, org.telegram.messenger.gd.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(org.telegram.messenger.n10.o(user3))) {
                                q10 = org.telegram.messenger.n10.q(user3);
                            } else {
                                q10 = "@" + org.telegram.messenger.n10.o(user3);
                            }
                            new kc(w2Var2.F, i6Var2).Q(R.raw.error, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var2), org.telegram.messenger.gd.a0(null, null, 2131751718, q10))).j();
                        } else {
                            org.telegram.ui.Cells.c0.t(w2Var2.F, i6Var2, tL_error, false);
                        }
                    }
                    org.telegram.messenger.g0.v1(w2Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
