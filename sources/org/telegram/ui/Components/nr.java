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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements Runnable {
    public final /* synthetic */ o8 E;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 F;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ bi.n8 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ di.d e;
    public final /* synthetic */ org.telegram.ui.Cells.j3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ n2.h n;
    public final /* synthetic */ org.telegram.ui.Cells.e9 r;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 s;
    public final /* synthetic */ int[] v;
    public final /* synthetic */ Runnable[] w;
    public final /* synthetic */ int[] x;
    public final /* synthetic */ int y;

    public /* synthetic */ nr(boolean[] zArr, int[] iArr, bi.n8 n8Var, String[] strArr, di.d dVar, org.telegram.ui.Cells.j3 j3Var, TreeSet treeSet, n2.h hVar, org.telegram.ui.Cells.e9 e9Var, org.telegram.ui.ActionBar.c6 c6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i10, o8 o8Var, org.telegram.ui.ActionBar.e3 e3Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = n8Var;
        this.d = strArr;
        this.e = dVar;
        this.f = j3Var;
        this.h = treeSet;
        this.n = hVar;
        this.r = e9Var;
        this.s = c6Var;
        this.v = iArr2;
        this.w = runnableArr;
        this.x = iArr3;
        this.y = i10;
        this.E = o8Var;
        this.F = e3Var;
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
        final di.d dVar = this.e;
        dVar.setLoading(false);
        dVar.setEnabled(false);
        String charSequence = this.f.getText().toString();
        StringBuilder u10 = a1.g.u(charSequence);
        boolean a2 = qr.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        u10.append((a2 || qr.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb2 = u10.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final n2.h hVar = this.n;
        if (isEmpty) {
            hVar.run();
            return;
        }
        int length = sb2.length();
        final org.telegram.ui.Cells.e9 e9Var = this.r;
        final org.telegram.ui.ActionBar.c6 c6Var = this.s;
        if (length < 4 || sb2.length() > 32) {
            e9Var.setText(LocaleController.getString(sb2.length() < 4 ? R.string.UsernameInvalidShort : R.string.UsernameInvalidLong));
            e9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q7, c6Var));
            return;
        }
        e9Var.setText(LocaleController.getString(R.string.UsernameChecking));
        e9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B6, c6Var));
        final int[] iArr = this.v;
        final int i10 = iArr[0];
        final Runnable[] runnableArr = this.w;
        final int[] iArr2 = this.x;
        final int i11 = this.y;
        final o8 o8Var = this.E;
        final org.telegram.ui.ActionBar.e3 e3Var = this.F;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.kr
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
                final di.d dVar2 = dVar;
                final n2.h hVar2 = hVar;
                final TreeSet treeSet2 = treeSet;
                final o8 o8Var2 = o8Var;
                final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                final org.telegram.ui.Cells.e9 e9Var2 = e9Var;
                final org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.mr
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
                        di.d dVar3 = dVar2;
                        if (z10) {
                            strArr2[0] = str2;
                            dVar3.setEnabled(true);
                            hVar2.run();
                            return;
                        }
                        String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                        int i15 = i14;
                        TreeSet treeSet3 = treeSet2;
                        o8 o8Var3 = o8Var2;
                        org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
                        CharSequence d = qr.d(i15, str2, treeSet3, str3, o8Var3, c6Var3);
                        CharSequence string = d != null ? d : LocaleController.getString(R.string.CreateManagedBotUsernameCheckFailed);
                        org.telegram.ui.Cells.e9 e9Var3 = e9Var2;
                        e9Var3.setText(string);
                        e9Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q7, c6Var3));
                        if (d != null || tL_error == null) {
                            return;
                        }
                        dVar3.setEnabled(true);
                        org.telegram.ui.Cells.d0.r(e3Var2.topBulletinContainer, c6Var3, tL_error, false);
                    }
                });
            }
        };
        runnableArr[0] = runnable;
        AndroidUtilities.runOnUIThread(runnable, 300L);
    }
}
