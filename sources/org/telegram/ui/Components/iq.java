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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iq implements Runnable {
    public final /* synthetic */ boolean[] E;
    public final /* synthetic */ org.telegram.messenger.u10 F;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2 G;
    public final /* synthetic */ o2 H;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 I;
    public final /* synthetic */ org.telegram.ui.Cells.y8 J;
    public final /* synthetic */ Context K;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.ui.Cells.k3 c;
    public final /* synthetic */ TreeSet d;
    public final /* synthetic */ String[] e;
    public final /* synthetic */ hq f;
    public final /* synthetic */ org.telegram.ui.Cells.k3 h;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ bi.q0 r;
    public final /* synthetic */ gi.d s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ TLRPC.User y;

    public /* synthetic */ iq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, String[] strArr, hq hqVar, org.telegram.ui.Cells.k3 k3Var2, int[] iArr2, bi.q0 q0Var, gi.d dVar, boolean z10, int i3, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.t2 t2Var, o2 o2Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Cells.y8 y8Var, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = k3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = hqVar;
        this.h = k3Var2;
        this.n = iArr2;
        this.r = q0Var;
        this.s = dVar;
        this.w = z10;
        this.x = i3;
        this.y = user;
        this.E = zArr2;
        this.F = u10Var;
        this.G = t2Var;
        this.H = o2Var;
        this.I = e6Var;
        this.J = y8Var;
        this.K = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final org.telegram.ui.Cells.k3 k3Var = this.h;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        final boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        final int[] iArr = this.b;
        if (iArr[0] >= 0) {
            return;
        }
        final org.telegram.ui.Cells.k3 k3Var2 = this.c;
        String charSequence = k3Var2.getText().toString();
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(charSequence);
        boolean a10 = lq.a(charSequence, "bot");
        final TreeSet treeSet = this.d;
        l10.append((a10 || lq.c(charSequence, treeSet) != null) ? "" : "bot");
        String sb2 = l10.toString();
        final String[] strArr = this.e;
        if (!TextUtils.equals(strArr[0], sb2)) {
            this.f.run();
            return;
        }
        String trim = i3Var.getText().toString().trim();
        boolean isEmpty = TextUtils.isEmpty(trim);
        final int[] iArr2 = this.n;
        if (isEmpty) {
            int i3 = -iArr2[0];
            iArr2[0] = i3;
            org.telegram.messenger.g0.G3(i3, k3Var, null);
            return;
        }
        this.r.run();
        final gi.d dVar = this.s;
        dVar.setLoading(true);
        dVar.setEnabled(false);
        i3Var.setEnabled(false);
        k3Var2.d.setEnabled(false);
        final TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.w;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i10 = this.x;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i10);
        final TLRPC.User user = this.y;
        createbot.manager_id = s12.q1(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        c3.b bVar = new c3.b(1);
        final boolean[] zArr2 = this.E;
        final org.telegram.messenger.u10 u10Var = this.F;
        final org.telegram.ui.ActionBar.t2 t2Var = this.G;
        final o2 o2Var = this.H;
        final org.telegram.ui.ActionBar.e6 e6Var = this.I;
        final org.telegram.ui.Cells.y8 y8Var = this.J;
        final Context context = this.K;
        iArr[0] = connectionsManager.sendRequestTyped(createbot, bVar, new org.telegram.messenger.n10() { // from class: org.telegram.ui.Components.fq
            @Override // org.telegram.messenger.n10
            public final void a(Object obj, Object obj2) {
                String p10;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (zArr[0]) {
                    return;
                }
                iArr[0] = -1;
                gi.d dVar2 = dVar;
                dVar2.setLoading(false);
                dVar2.setEnabled(true);
                k3Var.d.setEnabled(true);
                k3Var2.d.setEnabled(true);
                int i11 = i10;
                org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                if (user2 != null) {
                    zArr2[0] = true;
                    org.telegram.messenger.hp.s1(i11).X3(user2, false, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    org.telegram.messenger.qr.a0(i11).m1(arrayList, null, false, false);
                    u10Var.a(user2);
                    t2Var2.dismiss();
                    return;
                }
                if (tL_error != null) {
                    String str = createbot.username;
                    String str2 = tL_error.text;
                    TreeSet treeSet2 = treeSet;
                    o2 o2Var2 = o2Var;
                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    CharSequence d = lq.d(i11, str, treeSet2, str2, o2Var2, e6Var2);
                    if (d != null) {
                        strArr[0] = null;
                        dVar2.setEnabled(false);
                        org.telegram.ui.Cells.y8 y8Var2 = y8Var;
                        y8Var2.setText(d);
                        org.telegram.ui.ActionBar.r6.V(y8Var2.getTextView(), org.telegram.ui.ActionBar.k6.q7, e6Var2);
                        int[] iArr3 = iArr2;
                        int i12 = -iArr3[0];
                        iArr3[0] = i12;
                        org.telegram.messenger.g0.G3(i12, y8Var2, null);
                    } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.p0 p0Var = org.telegram.messenger.hp.s1(i11).x7;
                        boolean q10 = org.telegram.messenger.h10.i(i11).q();
                        fc fcVar = new fc(t2Var2.F, e6Var2);
                        String M0 = org.telegram.messenger.bd.M0(2131751736, null);
                        SpannableStringBuilder O2 = org.telegram.messenger.g0.O2(q10 ? org.telegram.messenger.bd.a0(null, null, 2131751739, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.b).c)) : org.telegram.messenger.bd.a0(null, null, 2131751738, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.b).c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.L.b).c)), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var2), new gp(t2Var2, 2));
                        cl clVar = new cl(5, t2Var2, context);
                        int t10 = org.telegram.messenger.g0.t(O2, "@BotFather");
                        if (t10 >= 0) {
                            O2.setSpan(new org.telegram.ui.Cells.h(e6Var2, clVar, 6), t10, t10 + 10, 33);
                        }
                        ac I = fcVar.I(R.raw.error, M0, O2);
                        I.j = 8000;
                        I.j();
                    } else {
                        String str3 = tL_error.text;
                        if (str3 != null && str3.startsWith("FLOOD_WAIT_")) {
                            new fc(t2Var2.F, e6Var2).I(R.raw.error, org.telegram.messenger.bd.M0(2131751736, null), org.telegram.messenger.bd.a0(null, null, 2131751737, org.telegram.messenger.bd.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(org.telegram.messenger.l10.n(user3))) {
                                p10 = org.telegram.messenger.l10.p(user3);
                            } else {
                                p10 = "@" + org.telegram.messenger.l10.n(user3);
                            }
                            new fc(t2Var2.F, e6Var2).Q(R.raw.error, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var2), org.telegram.messenger.bd.a0(null, null, 2131751731, p10))).j();
                        } else {
                            org.telegram.ui.Cells.f1.v(t2Var2.F, e6Var2, tL_error, false);
                        }
                    }
                    org.telegram.messenger.g0.v1(t2Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
