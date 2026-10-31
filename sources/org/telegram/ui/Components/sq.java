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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq implements Runnable {
    public final /* synthetic */ boolean[] D;
    public final /* synthetic */ org.telegram.messenger.q20 E;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 F;
    public final /* synthetic */ qq G;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 H;
    public final /* synthetic */ org.telegram.ui.Cells.b9 I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.ui.Cells.m3 c;
    public final /* synthetic */ TreeSet d;
    public final /* synthetic */ String[] e;
    public final /* synthetic */ rq f;
    public final /* synthetic */ org.telegram.ui.Cells.m3 h;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ ag.g3 r;
    public final /* synthetic */ vh.d s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ TLRPC.User y;

    public /* synthetic */ sq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.m3 m3Var, TreeSet treeSet, String[] strArr, rq rqVar, org.telegram.ui.Cells.m3 m3Var2, int[] iArr2, ag.g3 g3Var, vh.d dVar, boolean z10, int i10, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.z2 z2Var, qq qqVar, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Cells.b9 b9Var, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = m3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = rqVar;
        this.h = m3Var2;
        this.n = iArr2;
        this.r = g3Var;
        this.s = dVar;
        this.w = z10;
        this.x = i10;
        this.y = user;
        this.D = zArr2;
        this.E = q20Var;
        this.F = z2Var;
        this.G = qqVar;
        this.H = p6Var;
        this.I = b9Var;
        this.J = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final org.telegram.ui.Cells.m3 m3Var = this.h;
        org.telegram.ui.Cells.k3 k3Var = m3Var.d;
        final boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        final int[] iArr = this.b;
        if (iArr[0] >= 0) {
            return;
        }
        final org.telegram.ui.Cells.m3 m3Var2 = this.c;
        String charSequence = m3Var2.getText().toString();
        StringBuilder t10 = a1.g.t(charSequence);
        boolean a2 = vq.a(charSequence, "bot");
        final TreeSet treeSet = this.d;
        t10.append((a2 || vq.c(charSequence, treeSet) != null) ? "" : "bot");
        String sb2 = t10.toString();
        final String[] strArr = this.e;
        if (!TextUtils.equals(strArr[0], sb2)) {
            this.f.run();
            return;
        }
        String trim = k3Var.getText().toString().trim();
        boolean isEmpty = TextUtils.isEmpty(trim);
        final int[] iArr2 = this.n;
        if (isEmpty) {
            int i10 = -iArr2[0];
            iArr2[0] = i10;
            org.telegram.messenger.i0.F3(i10, m3Var, null);
            return;
        }
        this.r.run();
        final vh.d dVar = this.s;
        dVar.setLoading(true);
        dVar.setEnabled(false);
        k3Var.setEnabled(false);
        m3Var2.d.setEnabled(false);
        final TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.w;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i11 = this.x;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i11);
        final TLRPC.User user = this.y;
        createbot.manager_id = r12.p1(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        a3.b bVar = new a3.b(1);
        final boolean[] zArr2 = this.D;
        final org.telegram.messenger.q20 q20Var = this.E;
        final org.telegram.ui.ActionBar.z2 z2Var = this.F;
        final qq qqVar = this.G;
        final org.telegram.ui.ActionBar.p6 p6Var = this.H;
        final org.telegram.ui.Cells.b9 b9Var = this.I;
        final Context context = this.J;
        iArr[0] = connectionsManager.sendRequestTyped(createbot, bVar, new org.telegram.messenger.j20() { // from class: org.telegram.ui.Components.nq
            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                String p5;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (zArr[0]) {
                    return;
                }
                iArr[0] = -1;
                vh.d dVar2 = dVar;
                dVar2.setLoading(false);
                dVar2.setEnabled(true);
                m3Var.d.setEnabled(true);
                m3Var2.d.setEnabled(true);
                int i12 = i11;
                org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                if (user2 != null) {
                    zArr2[0] = true;
                    org.telegram.messenger.vp.r1(i12).U3(user2, false, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    org.telegram.messenger.hs.a0(i12).m1(arrayList, null, false, false);
                    q20Var.a(user2);
                    z2Var2.dismiss();
                    return;
                }
                if (tL_error != null) {
                    String str = createbot.username;
                    String str2 = tL_error.text;
                    TreeSet treeSet2 = treeSet;
                    qq qqVar2 = qqVar;
                    org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                    CharSequence d = vq.d(i12, str, treeSet2, str2, qqVar2, p6Var2);
                    if (d != null) {
                        strArr[0] = null;
                        dVar2.setEnabled(false);
                        org.telegram.ui.Cells.b9 b9Var2 = b9Var;
                        b9Var2.setText(d);
                        org.telegram.ui.ActionBar.a7.V(b9Var2.getTextView(), org.telegram.ui.ActionBar.t6.q7, p6Var2);
                        int[] iArr3 = iArr2;
                        int i13 = -iArr3[0];
                        iArr3[0] = i13;
                        org.telegram.messenger.i0.F3(i13, b9Var2, null);
                    } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.s0 s0Var = org.telegram.messenger.vp.r1(i12).y7;
                        boolean q6 = org.telegram.messenger.d20.i(i12).q();
                        cc ccVar = new cc(z2Var2.E, p6Var2);
                        String L0 = org.telegram.messenger.cd.L0(2131751736, null);
                        SpannableStringBuilder N2 = org.telegram.messenger.i0.N2(q6 ? org.telegram.messenger.cd.a0(null, null, 2131751739, Integer.valueOf(((org.telegram.messenger.l0) s0Var.M.a).c)) : org.telegram.messenger.cd.a0(null, null, 2131751738, Integer.valueOf(((org.telegram.messenger.l0) s0Var.M.a).c), Integer.valueOf(((org.telegram.messenger.l0) s0Var.L.a).c)), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var2), new ho(z2Var2, 4));
                        cd cdVar = new cd(24, z2Var2, context);
                        int t11 = org.telegram.messenger.i0.t(N2, "@BotFather");
                        if (t11 >= 0) {
                            N2.setSpan(new org.telegram.ui.Cells.h(p6Var2, cdVar, 6), t11, t11 + 10, 33);
                        }
                        wb I = ccVar.I(R.raw.error, L0, N2);
                        I.j = 8000;
                        I.j();
                    } else {
                        String str3 = tL_error.text;
                        if (str3 != null && str3.startsWith("FLOOD_WAIT_")) {
                            new cc(z2Var2.E, p6Var2).I(R.raw.error, org.telegram.messenger.cd.L0(2131751736, null), org.telegram.messenger.cd.a0(null, null, 2131751737, org.telegram.messenger.cd.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(org.telegram.messenger.h20.n(user3))) {
                                p5 = org.telegram.messenger.h20.p(user3);
                            } else {
                                p5 = "@" + org.telegram.messenger.h20.n(user3);
                            }
                            new cc(z2Var2.E, p6Var2).Q(R.raw.error, 36, org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var2), org.telegram.messenger.cd.a0(null, null, 2131751731, p5))).j();
                        } else {
                            org.telegram.ui.Cells.f1.s(z2Var2.E, p6Var2, tL_error, false);
                        }
                    }
                    org.telegram.messenger.i0.v1(z2Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
