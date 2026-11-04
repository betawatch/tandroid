package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ o2 F;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2 G;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ bi.q0 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ gi.d e;
    public final /* synthetic */ org.telegram.ui.Cells.k3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ e7 n;
    public final /* synthetic */ org.telegram.ui.Cells.y8 r;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 s;
    public final /* synthetic */ int[] w;
    public final /* synthetic */ Runnable[] x;
    public final /* synthetic */ int[] y;

    public /* synthetic */ hq(boolean[] zArr, int[] iArr, bi.q0 q0Var, String[] strArr, gi.d dVar, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, e7 e7Var, org.telegram.ui.Cells.y8 y8Var, org.telegram.ui.ActionBar.e6 e6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i3, o2 o2Var, org.telegram.ui.ActionBar.t2 t2Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = q0Var;
        this.d = strArr;
        this.e = dVar;
        this.f = k3Var;
        this.h = treeSet;
        this.n = e7Var;
        this.r = y8Var;
        this.s = e6Var;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.E = i3;
        this.F = o2Var;
        this.G = t2Var;
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
        final gi.d dVar = this.e;
        dVar.setLoading(false);
        dVar.setEnabled(false);
        String charSequence = this.f.getText().toString();
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(charSequence);
        boolean a10 = lq.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        l10.append((a10 || lq.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb2 = l10.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final e7 e7Var = this.n;
        if (isEmpty) {
            e7Var.run();
            return;
        }
        int length = sb2.length();
        final org.telegram.ui.Cells.y8 y8Var = this.r;
        final org.telegram.ui.ActionBar.e6 e6Var = this.s;
        if (length < 4 || sb2.length() > 32) {
            y8Var.setText(org.telegram.messenger.bd.M0(sb2.length() < 4 ? 2131743664 : 2131743665, null));
            org.telegram.ui.ActionBar.r6.V(y8Var.getTextView(), org.telegram.ui.ActionBar.k6.q7, e6Var);
            return;
        }
        y8Var.setText(org.telegram.messenger.bd.M0(2131743676, null));
        org.telegram.ui.ActionBar.r6.V(y8Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, e6Var);
        final int[] iArr = this.w;
        final int i3 = iArr[0];
        final Runnable[] runnableArr = this.x;
        final int[] iArr2 = this.y;
        final int i10 = this.E;
        final o2 o2Var = this.F;
        final org.telegram.ui.ActionBar.t2 t2Var = this.G;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.eq
            @Override // java.lang.Runnable
            public final void run() {
                runnableArr[0] = null;
                final boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                final int[] iArr3 = iArr;
                int i11 = iArr3[0];
                final int i12 = i3;
                if (i12 != i11) {
                    return;
                }
                TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                final String str = sb2;
                checkusername.username = str;
                final int i13 = i10;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                c3.b bVar = new c3.b(1);
                final int[] iArr4 = iArr2;
                final String[] strArr2 = strArr;
                final gi.d dVar2 = dVar;
                final e7 e7Var2 = e7Var;
                final TreeSet treeSet2 = treeSet;
                final o2 o2Var2 = o2Var;
                final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                final org.telegram.ui.Cells.y8 y8Var2 = y8Var;
                final org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.n10() { // from class: org.telegram.ui.Components.gq
                    @Override // org.telegram.messenger.n10
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Bool bool = (TLRPC.Bool) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (zArr2[0]) {
                            return;
                        }
                        if (i12 != iArr3[0]) {
                            return;
                        }
                        iArr4[0] = -1;
                        boolean z10 = bool instanceof TLRPC.TL_boolTrue;
                        String str2 = str;
                        gi.d dVar3 = dVar2;
                        if (z10) {
                            strArr2[0] = str2;
                            dVar3.setEnabled(true);
                            e7Var2.run();
                            return;
                        }
                        String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                        int i14 = i13;
                        TreeSet treeSet3 = treeSet2;
                        o2 o2Var3 = o2Var2;
                        org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                        CharSequence d = lq.d(i14, str2, treeSet3, str3, o2Var3, e6Var3);
                        CharSequence M0 = d != null ? d : org.telegram.messenger.bd.M0(2131751728, null);
                        org.telegram.ui.Cells.y8 y8Var3 = y8Var2;
                        y8Var3.setText(M0);
                        org.telegram.ui.ActionBar.r6.V(y8Var3.getTextView(), org.telegram.ui.ActionBar.k6.q7, e6Var3);
                        if (d != null || tL_error == null) {
                            return;
                        }
                        dVar3.setEnabled(true);
                        org.telegram.ui.Cells.f1.v(t2Var2.F, e6Var3, tL_error, false);
                    }
                });
            }
        };
        runnableArr[0] = runnable;
        org.telegram.messenger.g0.i3(runnable, 300L);
    }
}
