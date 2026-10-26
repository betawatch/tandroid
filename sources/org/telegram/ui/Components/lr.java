package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr implements Runnable {
    public final /* synthetic */ h2 E;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 F;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ ai.h1 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ fi.d e;
    public final /* synthetic */ org.telegram.ui.Cells.g3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ kg n;
    public final /* synthetic */ org.telegram.ui.Cells.i9 r;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 s;
    public final /* synthetic */ int[] v;
    public final /* synthetic */ Runnable[] w;
    public final /* synthetic */ int[] x;
    public final /* synthetic */ int y;

    public /* synthetic */ lr(boolean[] zArr, int[] iArr, ai.h1 h1Var, String[] strArr, fi.d dVar, org.telegram.ui.Cells.g3 g3Var, TreeSet treeSet, kg kgVar, org.telegram.ui.Cells.i9 i9Var, org.telegram.ui.ActionBar.u6 u6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i10, h2 h2Var, org.telegram.ui.ActionBar.k3 k3Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = h1Var;
        this.d = strArr;
        this.e = dVar;
        this.f = g3Var;
        this.h = treeSet;
        this.n = kgVar;
        this.r = i9Var;
        this.s = u6Var;
        this.v = iArr2;
        this.w = runnableArr;
        this.x = iArr3;
        this.y = i10;
        this.E = h2Var;
        this.F = k3Var;
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
        final fi.d dVar = this.e;
        dVar.setLoading(false);
        dVar.setEnabled(false);
        String charSequence = this.f.getText().toString();
        StringBuilder u10 = a1.g.u(charSequence);
        boolean a2 = pr.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        u10.append((a2 || pr.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb2 = u10.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final kg kgVar = this.n;
        if (isEmpty) {
            kgVar.run();
            return;
        }
        int length = sb2.length();
        final org.telegram.ui.Cells.i9 i9Var = this.r;
        final org.telegram.ui.ActionBar.u6 u6Var = this.s;
        if (length < 4 || sb2.length() > 32) {
            i9Var.setText(LocaleController.getString(sb2.length() < 4 ? R.string.UsernameInvalidShort : R.string.UsernameInvalidLong));
            org.telegram.ui.ActionBar.f7.V(i9Var.getTextView(), org.telegram.ui.ActionBar.y6.q7, u6Var);
            return;
        }
        i9Var.setText(LocaleController.getString(R.string.UsernameChecking));
        org.telegram.ui.ActionBar.f7.V(i9Var.getTextView(), org.telegram.ui.ActionBar.y6.B6, u6Var);
        final int[] iArr = this.v;
        final int i10 = iArr[0];
        final Runnable[] runnableArr = this.w;
        final int[] iArr2 = this.x;
        final int i11 = this.y;
        final h2 h2Var = this.E;
        final org.telegram.ui.ActionBar.k3 k3Var = this.F;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.ir
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
                org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                final int[] iArr4 = iArr2;
                final String[] strArr2 = strArr;
                final fi.d dVar2 = dVar;
                final kg kgVar2 = kgVar;
                final TreeSet treeSet2 = treeSet;
                final h2 h2Var2 = h2Var;
                final org.telegram.ui.ActionBar.u6 u6Var2 = u6Var;
                final org.telegram.ui.Cells.i9 i9Var2 = i9Var;
                final org.telegram.ui.ActionBar.k3 k3Var2 = k3Var;
                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.kr
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
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
                        fi.d dVar3 = dVar2;
                        if (z10) {
                            strArr2[0] = str2;
                            dVar3.setEnabled(true);
                            kgVar2.run();
                            return;
                        }
                        String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                        int i15 = i14;
                        TreeSet treeSet3 = treeSet2;
                        h2 h2Var3 = h2Var2;
                        org.telegram.ui.ActionBar.u6 u6Var3 = u6Var2;
                        CharSequence d = pr.d(i15, str2, treeSet3, str3, h2Var3, u6Var3);
                        CharSequence string = d != null ? d : LocaleController.getString(R.string.CreateManagedBotUsernameCheckFailed);
                        org.telegram.ui.Cells.i9 i9Var3 = i9Var2;
                        i9Var3.setText(string);
                        org.telegram.ui.ActionBar.f7.V(i9Var3.getTextView(), org.telegram.ui.ActionBar.y6.q7, u6Var3);
                        if (d != null || tL_error == null) {
                            return;
                        }
                        dVar3.setEnabled(true);
                        org.telegram.ui.d3.t(k3Var2.topBulletinContainer, u6Var3, tL_error, false);
                    }
                });
            }
        };
        runnableArr[0] = runnable;
        AndroidUtilities.runOnUIThread(runnable, 300L);
    }
}
