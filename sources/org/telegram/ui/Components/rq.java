package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq implements Runnable {
    public final /* synthetic */ int D;
    public final /* synthetic */ qq E;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 F;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ ag.g3 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ vh.d e;
    public final /* synthetic */ org.telegram.ui.Cells.m3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ jg n;
    public final /* synthetic */ org.telegram.ui.Cells.b9 r;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 s;
    public final /* synthetic */ int[] w;
    public final /* synthetic */ Runnable[] x;
    public final /* synthetic */ int[] y;

    public /* synthetic */ rq(boolean[] zArr, int[] iArr, ag.g3 g3Var, String[] strArr, vh.d dVar, org.telegram.ui.Cells.m3 m3Var, TreeSet treeSet, jg jgVar, org.telegram.ui.Cells.b9 b9Var, org.telegram.ui.ActionBar.p6 p6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i10, qq qqVar, org.telegram.ui.ActionBar.z2 z2Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = g3Var;
        this.d = strArr;
        this.e = dVar;
        this.f = m3Var;
        this.h = treeSet;
        this.n = jgVar;
        this.r = b9Var;
        this.s = p6Var;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.D = i10;
        this.E = qqVar;
        this.F = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean[] zArr = this.a;
        if (zArr[0] || this.b[0] >= 0) {
            return;
        }
        this.c.run();
        final String[] strArr = this.d;
        strArr[0] = null;
        final vh.d dVar = this.e;
        dVar.setLoading(false);
        dVar.setEnabled(false);
        String charSequence = this.f.getText().toString();
        StringBuilder t10 = a1.g.t(charSequence);
        boolean a2 = vq.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        t10.append((a2 || vq.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb2 = t10.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final jg jgVar = this.n;
        if (isEmpty) {
            jgVar.run();
            return;
        }
        int length = sb2.length();
        final org.telegram.ui.Cells.b9 b9Var = this.r;
        final org.telegram.ui.ActionBar.p6 p6Var = this.s;
        if (length < 4 || sb2.length() > 32) {
            b9Var.setText(org.telegram.messenger.cd.L0(sb2.length() < 4 ? 2131743680 : 2131743681, null));
            org.telegram.ui.ActionBar.a7.V(b9Var.getTextView(), org.telegram.ui.ActionBar.t6.q7, p6Var);
            return;
        }
        b9Var.setText(org.telegram.messenger.cd.L0(2131743692, null));
        org.telegram.ui.ActionBar.a7.V(b9Var.getTextView(), org.telegram.ui.ActionBar.t6.B6, p6Var);
        final int[] iArr = this.w;
        final int i10 = iArr[0];
        final Runnable[] runnableArr = this.x;
        final int[] iArr2 = this.y;
        final int i11 = this.D;
        final qq qqVar = this.E;
        final org.telegram.ui.ActionBar.z2 z2Var = this.F;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.mq
            @Override // java.lang.Runnable
            public final void run() {
                runnableArr[0] = null;
                final boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                final int[] iArr3 = iArr;
                int i12 = iArr3[0];
                final int i13 = i10;
                if (i13 != i12) {
                    return;
                }
                TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                final String str = sb2;
                checkusername.username = str;
                final int i14 = i11;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
                a3.b bVar = new a3.b(1);
                final int[] iArr4 = iArr2;
                final String[] strArr2 = strArr;
                final vh.d dVar2 = dVar;
                final jg jgVar2 = jgVar;
                final TreeSet treeSet2 = treeSet;
                final qq qqVar2 = qqVar;
                final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                final org.telegram.ui.Cells.b9 b9Var2 = b9Var;
                final org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.j20() { // from class: org.telegram.ui.Components.oq
                    @Override // org.telegram.messenger.j20
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Bool bool = (TLRPC.Bool) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (zArr2[0]) {
                            return;
                        }
                        if (i13 != iArr3[0]) {
                            return;
                        }
                        iArr4[0] = -1;
                        boolean z10 = bool instanceof TLRPC.TL_boolTrue;
                        String str2 = str;
                        vh.d dVar3 = dVar2;
                        if (z10) {
                            strArr2[0] = str2;
                            dVar3.setEnabled(true);
                            jgVar2.run();
                            return;
                        }
                        String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                        int i15 = i14;
                        TreeSet treeSet3 = treeSet2;
                        qq qqVar3 = qqVar2;
                        org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
                        CharSequence d = vq.d(i15, str2, treeSet3, str3, qqVar3, p6Var3);
                        CharSequence L0 = d != null ? d : org.telegram.messenger.cd.L0(2131751728, null);
                        org.telegram.ui.Cells.b9 b9Var3 = b9Var2;
                        b9Var3.setText(L0);
                        org.telegram.ui.ActionBar.a7.V(b9Var3.getTextView(), org.telegram.ui.ActionBar.t6.q7, p6Var3);
                        if (d != null || tL_error == null) {
                            return;
                        }
                        dVar3.setEnabled(true);
                        org.telegram.ui.Cells.f1.s(z2Var2.E, p6Var3, tL_error, false);
                    }
                });
            }
        };
        runnableArr[0] = runnable;
        org.telegram.messenger.i0.h3(runnable, 300L);
    }
}
