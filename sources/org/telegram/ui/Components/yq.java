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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yq implements Runnable {
    public final /* synthetic */ boolean[] E;
    public final /* synthetic */ org.telegram.messenger.y10 F;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 G;
    public final /* synthetic */ org.telegram.ui.ii H;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 I;
    public final /* synthetic */ org.telegram.ui.Cells.a9 J;
    public final /* synthetic */ Context K;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.ui.Cells.l3 c;
    public final /* synthetic */ TreeSet d;
    public final /* synthetic */ String[] e;
    public final /* synthetic */ xq f;
    public final /* synthetic */ org.telegram.ui.Cells.l3 h;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ ai.b1 r;
    public final /* synthetic */ hi.e s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ TLRPC.User y;

    public /* synthetic */ yq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.l3 l3Var, TreeSet treeSet, String[] strArr, xq xqVar, org.telegram.ui.Cells.l3 l3Var2, int[] iArr2, ai.b1 b1Var, hi.e eVar, boolean z10, int i7, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.y10 y10Var, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ii iiVar, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Cells.a9 a9Var, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = l3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = xqVar;
        this.h = l3Var2;
        this.n = iArr2;
        this.r = b1Var;
        this.s = eVar;
        this.w = z10;
        this.x = i7;
        this.y = user;
        this.E = zArr2;
        this.F = y10Var;
        this.G = w2Var;
        this.H = iiVar;
        this.I = h6Var;
        this.J = a9Var;
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
        boolean a10 = br.a(charSequence, "bot");
        final TreeSet treeSet = this.d;
        m10.append((a10 || br.c(charSequence, treeSet) != null) ? "" : "bot");
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
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i10);
        final TLRPC.User user = this.y;
        createbot.manager_id = u12.s1(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        d3.b bVar = new d3.b(1);
        final boolean[] zArr2 = this.E;
        final org.telegram.messenger.y10 y10Var = this.F;
        final org.telegram.ui.ActionBar.w2 w2Var = this.G;
        final org.telegram.ui.ii iiVar = this.H;
        final org.telegram.ui.ActionBar.h6 h6Var = this.I;
        final org.telegram.ui.Cells.a9 a9Var = this.J;
        final Context context = this.K;
        iArr[0] = connectionsManager.sendRequestTyped(createbot, bVar, new org.telegram.messenger.r10() { // from class: org.telegram.ui.Components.vq
            @Override // org.telegram.messenger.r10
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
                    org.telegram.messenger.np.u1(i11).e4(user2, false, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    org.telegram.messenger.ur.a0(i11).m1(arrayList, null, false, false);
                    y10Var.a(user2);
                    w2Var2.dismiss();
                    return;
                }
                if (tL_error != null) {
                    String str = createbot.username;
                    String str2 = tL_error.text;
                    TreeSet treeSet2 = treeSet;
                    org.telegram.ui.ii iiVar2 = iiVar;
                    org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                    CharSequence d = br.d(i11, str, treeSet2, str2, iiVar2, h6Var2);
                    if (d != null) {
                        strArr[0] = null;
                        eVar2.setEnabled(false);
                        org.telegram.ui.Cells.a9 a9Var2 = a9Var;
                        a9Var2.setText(d);
                        org.telegram.ui.ActionBar.t6.U(a9Var2.getTextView(), org.telegram.ui.ActionBar.m6.q7, h6Var2);
                        int[] iArr3 = iArr2;
                        int i12 = -iArr3[0];
                        iArr3[0] = i12;
                        org.telegram.messenger.g0.E3(i12, a9Var2, null);
                    } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.p0 p0Var = org.telegram.messenger.np.u1(i11).A7;
                        boolean q11 = org.telegram.messenger.k10.i(i11).q();
                        lc lcVar = new lc(w2Var2.F, h6Var2);
                        String N0 = org.telegram.messenger.hd.N0(2131751723, null);
                        SpannableStringBuilder O2 = org.telegram.messenger.g0.O2(q11 ? org.telegram.messenger.hd.a0(null, null, 2131751726, Integer.valueOf(((org.telegram.messenger.j0) p0Var.R.b).c)) : org.telegram.messenger.hd.a0(null, null, 2131751725, Integer.valueOf(((org.telegram.messenger.j0) p0Var.R.b).c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.Q.b).c)), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var2), new oo(w2Var2, 4));
                        mf mfVar = new mf(22, w2Var2, context);
                        int t6 = org.telegram.messenger.g0.t(O2, "@BotFather");
                        if (t6 >= 0) {
                            O2.setSpan(new org.telegram.ui.Cells.h(h6Var2, mfVar, 6), t6, t6 + 10, 33);
                        }
                        gc I = lcVar.I(R.raw.error, N0, O2);
                        I.j = 8000;
                        I.j();
                    } else {
                        String str3 = tL_error.text;
                        if (str3 != null && str3.startsWith("FLOOD_WAIT_")) {
                            new lc(w2Var2.F, h6Var2).I(R.raw.error, org.telegram.messenger.hd.N0(2131751723, null), org.telegram.messenger.hd.a0(null, null, 2131751724, org.telegram.messenger.hd.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(org.telegram.messenger.p10.o(user3))) {
                                q10 = org.telegram.messenger.p10.q(user3);
                            } else {
                                q10 = "@" + org.telegram.messenger.p10.o(user3);
                            }
                            new lc(w2Var2.F, h6Var2).Q(R.raw.error, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var2), org.telegram.messenger.hd.a0(null, null, 2131751718, q10))).j();
                        } else {
                            org.telegram.ui.Cells.c0.t(w2Var2.F, h6Var2, tL_error, false);
                        }
                    }
                    org.telegram.messenger.g0.v1(w2Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
