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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq implements Runnable {
    public final /* synthetic */ boolean[] E;
    public final /* synthetic */ org.telegram.messenger.z10 F;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2 G;
    public final /* synthetic */ a2 H;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 I;
    public final /* synthetic */ org.telegram.ui.Cells.y8 J;
    public final /* synthetic */ Context K;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.ui.Cells.k3 c;
    public final /* synthetic */ TreeSet d;
    public final /* synthetic */ String[] e;
    public final /* synthetic */ oq f;
    public final /* synthetic */ org.telegram.ui.Cells.k3 h;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ ci.p0 r;
    public final /* synthetic */ hi.d s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ TLRPC.User y;

    public /* synthetic */ pq(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, String[] strArr, oq oqVar, org.telegram.ui.Cells.k3 k3Var2, int[] iArr2, ci.p0 p0Var, hi.d dVar, boolean z10, int i7, TLRPC.User user, boolean[] zArr2, org.telegram.messenger.z10 z10Var, org.telegram.ui.ActionBar.u2 u2Var, a2 a2Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Cells.y8 y8Var, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = k3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = oqVar;
        this.h = k3Var2;
        this.n = iArr2;
        this.r = p0Var;
        this.s = dVar;
        this.w = z10;
        this.x = i7;
        this.y = user;
        this.E = zArr2;
        this.F = z10Var;
        this.G = u2Var;
        this.H = a2Var;
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
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(charSequence);
        boolean a10 = sq.a(charSequence, "bot");
        final TreeSet treeSet = this.d;
        m10.append((a10 || sq.c(charSequence, treeSet) != null) ? "" : "bot");
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
            org.telegram.messenger.g0.F3(i7, k3Var, null);
            return;
        }
        this.r.run();
        final hi.d dVar = this.s;
        dVar.setLoading(true);
        dVar.setEnabled(false);
        i3Var.setEnabled(false);
        k3Var2.d.setEnabled(false);
        final TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.w;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i10 = this.x;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i10);
        final TLRPC.User user = this.y;
        createbot.manager_id = s12.q1(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        d3.b bVar = new d3.b(1);
        final boolean[] zArr2 = this.E;
        final org.telegram.messenger.z10 z10Var = this.F;
        final org.telegram.ui.ActionBar.u2 u2Var = this.G;
        final a2 a2Var = this.H;
        final org.telegram.ui.ActionBar.e6 e6Var = this.I;
        final org.telegram.ui.Cells.y8 y8Var = this.J;
        final Context context = this.K;
        iArr[0] = connectionsManager.sendRequestTyped(createbot, bVar, new org.telegram.messenger.s10() { // from class: org.telegram.ui.Components.mq
            @Override // org.telegram.messenger.s10
            public final void a(Object obj, Object obj2) {
                String p10;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (zArr[0]) {
                    return;
                }
                iArr[0] = -1;
                hi.d dVar2 = dVar;
                dVar2.setLoading(false);
                dVar2.setEnabled(true);
                k3Var.d.setEnabled(true);
                k3Var2.d.setEnabled(true);
                int i11 = i10;
                org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                if (user2 != null) {
                    zArr2[0] = true;
                    org.telegram.messenger.np.s1(i11).X3(user2, false, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    org.telegram.messenger.vr.a0(i11).m1(arrayList, null, false, false);
                    z10Var.a(user2);
                    u2Var2.dismiss();
                    return;
                }
                if (tL_error != null) {
                    String str = createbot.username;
                    String str2 = tL_error.text;
                    TreeSet treeSet2 = treeSet;
                    a2 a2Var2 = a2Var;
                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    CharSequence d = sq.d(i11, str, treeSet2, str2, a2Var2, e6Var2);
                    if (d != null) {
                        strArr[0] = null;
                        dVar2.setEnabled(false);
                        org.telegram.ui.Cells.y8 y8Var2 = y8Var;
                        y8Var2.setText(d);
                        org.telegram.ui.ActionBar.q6.U(y8Var2.getTextView(), org.telegram.ui.ActionBar.j6.q7, e6Var2);
                        int[] iArr3 = iArr2;
                        int i12 = -iArr3[0];
                        iArr3[0] = i12;
                        org.telegram.messenger.g0.F3(i12, y8Var2, null);
                    } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.p0 p0Var = org.telegram.messenger.np.s1(i11).y7;
                        boolean q10 = org.telegram.messenger.m10.i(i11).q();
                        cc ccVar = new cc(u2Var2.F, e6Var2);
                        String M0 = org.telegram.messenger.hd.M0(2131751735, null);
                        SpannableStringBuilder O2 = org.telegram.messenger.g0.O2(q10 ? org.telegram.messenger.hd.a0(null, null, 2131751738, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.b).c)) : org.telegram.messenger.hd.a0(null, null, 2131751737, Integer.valueOf(((org.telegram.messenger.j0) p0Var.M.b).c), Integer.valueOf(((org.telegram.messenger.j0) p0Var.L.b).c)), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var2), new fo(u2Var2, 4));
                        od odVar = new od(24, u2Var2, context);
                        int t6 = org.telegram.messenger.g0.t(O2, "@BotFather");
                        if (t6 >= 0) {
                            O2.setSpan(new org.telegram.ui.Cells.h(e6Var2, odVar, 6), t6, t6 + 10, 33);
                        }
                        xb I = ccVar.I(R.raw.error, M0, O2);
                        I.j = 8000;
                        I.j();
                    } else {
                        String str3 = tL_error.text;
                        if (str3 != null && str3.startsWith("FLOOD_WAIT_")) {
                            new cc(u2Var2.F, e6Var2).I(R.raw.error, org.telegram.messenger.hd.M0(2131751735, null), org.telegram.messenger.hd.a0(null, null, 2131751736, org.telegram.messenger.hd.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(org.telegram.messenger.q10.n(user3))) {
                                p10 = org.telegram.messenger.q10.p(user3);
                            } else {
                                p10 = "@" + org.telegram.messenger.q10.n(user3);
                            }
                            new cc(u2Var2.F, e6Var2).Q(R.raw.error, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var2), org.telegram.messenger.hd.a0(null, null, 2131751730, p10))).j();
                        } else {
                            org.telegram.ui.Cells.y0.q(u2Var2.F, e6Var2, tL_error, false);
                        }
                    }
                    org.telegram.messenger.g0.v1(u2Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
