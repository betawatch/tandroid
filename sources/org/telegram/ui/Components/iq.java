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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iq implements Runnable {
    public final /* synthetic */ boolean[] D;
    public final /* synthetic */ org.telegram.messenger.c20 E;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 F;
    public final /* synthetic */ r2 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 H;
    public final /* synthetic */ org.telegram.ui.Cells.z8 I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.ui.Cells.k3 c;
    public final /* synthetic */ TreeSet d;
    public final /* synthetic */ String[] e;
    public final /* synthetic */ hq f;
    public final /* synthetic */ org.telegram.ui.Cells.k3 h;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ ai.a1 r;
    public final /* synthetic */ fi.d s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ TLRPC.User y;

    public /* synthetic */ iq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, String[] strArr, hq hqVar, org.telegram.ui.Cells.k3 k3Var2, int[] iArr2, ai.a1 a1Var, fi.d dVar, boolean z9, int i7, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.v2 v2Var, r2 r2Var, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Cells.z8 z8Var, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = k3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = hqVar;
        this.h = k3Var2;
        this.n = iArr2;
        this.r = a1Var;
        this.s = dVar;
        this.w = z9;
        this.x = i7;
        this.y = user;
        this.D = zArr2;
        this.E = c20Var;
        this.F = v2Var;
        this.G = r2Var;
        this.H = f6Var;
        this.I = z8Var;
        this.J = context;
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
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(charSequence);
        boolean a10 = lq.a(charSequence, "bot");
        final TreeSet treeSet = this.d;
        m10.append((a10 || lq.c(charSequence, treeSet) != null) ? "" : "bot");
        String sb2 = m10.toString();
        final String[] strArr = this.e;
        if (!TextUtils.equals(strArr[0], sb2)) {
            this.f.run();
            return;
        }
        String trim = i3Var.getText().toString().trim();
        boolean isEmpty = TextUtils.isEmpty(trim);
        final int[] iArr2 = this.n;
        if (isEmpty) {
            int i7 = -iArr2[0];
            iArr2[0] = i7;
            org.telegram.messenger.g0.G3(i7, k3Var, null);
            return;
        }
        this.r.run();
        final fi.d dVar = this.s;
        dVar.setLoading(true);
        dVar.setEnabled(false);
        i3Var.setEnabled(false);
        k3Var2.d.setEnabled(false);
        final TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.w;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i10 = this.x;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
        final TLRPC.User user = this.y;
        createbot.manager_id = s12.q1(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        d3.b bVar = new d3.b(1);
        final boolean[] zArr2 = this.D;
        final org.telegram.messenger.c20 c20Var = this.E;
        final org.telegram.ui.ActionBar.v2 v2Var = this.F;
        final r2 r2Var = this.G;
        final org.telegram.ui.ActionBar.f6 f6Var = this.H;
        final org.telegram.ui.Cells.z8 z8Var = this.I;
        final Context context = this.J;
        iArr[0] = connectionsManager.sendRequestTyped(createbot, bVar, new org.telegram.messenger.v10() { // from class: org.telegram.ui.Components.eq
            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                String p10;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (zArr[0]) {
                    return;
                }
                iArr[0] = -1;
                fi.d dVar2 = dVar;
                dVar2.setLoading(false);
                dVar2.setEnabled(true);
                k3Var.d.setEnabled(true);
                k3Var2.d.setEnabled(true);
                int i11 = i10;
                org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                if (user2 != null) {
                    zArr2[0] = true;
                    org.telegram.messenger.qp.s1(i11).X3(user2, false, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    org.telegram.messenger.yr.a0(i11).m1(arrayList, null, false, false);
                    c20Var.a(user2);
                    v2Var2.dismiss();
                    return;
                }
                if (tL_error != null) {
                    String str = createbot.username;
                    String str2 = tL_error.text;
                    TreeSet treeSet2 = treeSet;
                    r2 r2Var2 = r2Var;
                    org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    CharSequence d = lq.d(i11, str, treeSet2, str2, r2Var2, f6Var2);
                    if (d != null) {
                        strArr[0] = null;
                        dVar2.setEnabled(false);
                        org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                        z8Var2.setText(d);
                        org.telegram.ui.ActionBar.r6.V(z8Var2.getTextView(), org.telegram.ui.ActionBar.k6.q7, f6Var2);
                        int[] iArr3 = iArr2;
                        int i12 = -iArr3[0];
                        iArr3[0] = i12;
                        org.telegram.messenger.g0.G3(i12, z8Var2, null);
                    } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.p0 p0Var = org.telegram.messenger.qp.s1(i11).x7;
                        boolean q10 = org.telegram.messenger.p10.i(i11).q();
                        hc hcVar = new hc(v2Var2.E, f6Var2);
                        String M0 = org.telegram.messenger.id.M0(2131751736, null);
                        SpannableStringBuilder O2 = org.telegram.messenger.g0.O2(q10 ? org.telegram.messenger.id.a0(null, null, 2131751739, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.b).c)) : org.telegram.messenger.id.a0(null, null, 2131751738, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.b).c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.L.b).c)), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, f6Var2), new gp(v2Var2, 2));
                        fq fqVar = new fq(0, v2Var2, context);
                        int t6 = org.telegram.messenger.g0.t(O2, "@BotFather");
                        if (t6 >= 0) {
                            O2.setSpan(new org.telegram.ui.Cells.h(f6Var2, fqVar, 6), t6, t6 + 10, 33);
                        }
                        cc I = hcVar.I(R.raw.error, M0, O2);
                        I.j = 8000;
                        I.j();
                    } else {
                        String str3 = tL_error.text;
                        if (str3 != null && str3.startsWith("FLOOD_WAIT_")) {
                            new hc(v2Var2.E, f6Var2).I(R.raw.error, org.telegram.messenger.id.M0(2131751736, null), org.telegram.messenger.id.a0(null, null, 2131751737, org.telegram.messenger.id.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(org.telegram.messenger.t10.n(user3))) {
                                p10 = org.telegram.messenger.t10.p(user3);
                            } else {
                                p10 = "@" + org.telegram.messenger.t10.n(user3);
                            }
                            new hc(v2Var2.E, f6Var2).Q(R.raw.error, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, f6Var2), org.telegram.messenger.id.a0(null, null, 2131751731, p10))).j();
                        } else {
                            org.telegram.ui.Cells.f1.r(v2Var2.E, f6Var2, tL_error, false);
                        }
                    }
                    org.telegram.messenger.g0.v1(v2Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
