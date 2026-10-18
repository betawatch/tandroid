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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr implements Runnable {
    public final /* synthetic */ e2 E;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 F;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ ai.cb c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ ei.d e;
    public final /* synthetic */ org.telegram.ui.Cells.i3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ lg n;
    public final /* synthetic */ org.telegram.ui.Cells.d9 r;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 s;
    public final /* synthetic */ int[] v;
    public final /* synthetic */ Runnable[] w;
    public final /* synthetic */ int[] x;
    public final /* synthetic */ int y;

    public /* synthetic */ kr(boolean[] zArr, int[] iArr, ai.cb cbVar, String[] strArr, ei.d dVar, org.telegram.ui.Cells.i3 i3Var, TreeSet treeSet, lg lgVar, org.telegram.ui.Cells.d9 d9Var, org.telegram.ui.ActionBar.d6 d6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i10, e2 e2Var, org.telegram.ui.ActionBar.f3 f3Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = cbVar;
        this.d = strArr;
        this.e = dVar;
        this.f = i3Var;
        this.h = treeSet;
        this.n = lgVar;
        this.r = d9Var;
        this.s = d6Var;
        this.v = iArr2;
        this.w = runnableArr;
        this.x = iArr3;
        this.y = i10;
        this.E = e2Var;
        this.F = f3Var;
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
        final ei.d dVar = this.e;
        dVar.setLoading(false);
        dVar.setEnabled(false);
        String charSequence = this.f.getText().toString();
        StringBuilder u10 = a1.g.u(charSequence);
        boolean a2 = nr.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        u10.append((a2 || nr.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb2 = u10.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final lg lgVar = this.n;
        if (isEmpty) {
            lgVar.run();
            return;
        }
        int length = sb2.length();
        final org.telegram.ui.Cells.d9 d9Var = this.r;
        final org.telegram.ui.ActionBar.d6 d6Var = this.s;
        if (length < 4 || sb2.length() > 32) {
            d9Var.setText(LocaleController.getString(sb2.length() < 4 ? R.string.UsernameInvalidShort : R.string.UsernameInvalidLong));
            d9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q7, d6Var));
            return;
        }
        d9Var.setText(LocaleController.getString(R.string.UsernameChecking));
        d9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, d6Var));
        final int[] iArr = this.v;
        final int i10 = iArr[0];
        final Runnable[] runnableArr = this.w;
        final int[] iArr2 = this.x;
        final int i11 = this.y;
        final e2 e2Var = this.E;
        final org.telegram.ui.ActionBar.f3 f3Var = this.F;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.hr
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
                final ei.d dVar2 = dVar;
                final lg lgVar2 = lgVar;
                final TreeSet treeSet2 = treeSet;
                final e2 e2Var2 = e2Var;
                final org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                final org.telegram.ui.Cells.d9 d9Var2 = d9Var;
                final org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.jr
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
                        ei.d dVar3 = dVar2;
                        if (z10) {
                            strArr2[0] = str2;
                            dVar3.setEnabled(true);
                            lgVar2.run();
                            return;
                        }
                        String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                        int i15 = i14;
                        TreeSet treeSet3 = treeSet2;
                        e2 e2Var3 = e2Var2;
                        org.telegram.ui.ActionBar.d6 d6Var3 = d6Var2;
                        CharSequence d = nr.d(i15, str2, treeSet3, str3, e2Var3, d6Var3);
                        CharSequence string = d != null ? d : LocaleController.getString(R.string.CreateManagedBotUsernameCheckFailed);
                        org.telegram.ui.Cells.d9 d9Var3 = d9Var2;
                        d9Var3.setText(string);
                        d9Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q7, d6Var3));
                        if (d != null || tL_error == null) {
                            return;
                        }
                        dVar3.setEnabled(true);
                        org.telegram.ui.Cells.c1.t(f3Var2.topBulletinContainer, d6Var3, tL_error, false);
                    }
                });
            }
        };
        runnableArr[0] = runnable;
        AndroidUtilities.runOnUIThread(runnable, 300L);
    }
}
