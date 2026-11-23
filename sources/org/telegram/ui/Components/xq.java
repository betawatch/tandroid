package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xq implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ org.telegram.ui.ii F;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 G;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ ai.b1 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ hi.e e;
    public final /* synthetic */ org.telegram.ui.Cells.l3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ g n;
    public final /* synthetic */ org.telegram.ui.Cells.a9 r;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 s;
    public final /* synthetic */ int[] w;
    public final /* synthetic */ Runnable[] x;
    public final /* synthetic */ int[] y;

    public /* synthetic */ xq(boolean[] zArr, int[] iArr, ai.b1 b1Var, String[] strArr, hi.e eVar, org.telegram.ui.Cells.l3 l3Var, TreeSet treeSet, g gVar, org.telegram.ui.Cells.a9 a9Var, org.telegram.ui.ActionBar.h6 h6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i7, org.telegram.ui.ii iiVar, org.telegram.ui.ActionBar.w2 w2Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = b1Var;
        this.d = strArr;
        this.e = eVar;
        this.f = l3Var;
        this.h = treeSet;
        this.n = gVar;
        this.r = a9Var;
        this.s = h6Var;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.E = i7;
        this.F = iiVar;
        this.G = w2Var;
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
        final hi.e eVar = this.e;
        eVar.setLoading(false);
        eVar.setEnabled(false);
        String charSequence = this.f.getText().toString();
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(charSequence);
        boolean a10 = br.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        m10.append((a10 || br.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb2 = m10.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final g gVar = this.n;
        if (isEmpty) {
            gVar.run();
            return;
        }
        int length = sb2.length();
        final org.telegram.ui.Cells.a9 a9Var = this.r;
        final org.telegram.ui.ActionBar.h6 h6Var = this.s;
        if (length < 4 || sb2.length() > 32) {
            a9Var.setText(org.telegram.messenger.hd.N0(sb2.length() < 4 ? 2131743409 : 2131743410, null));
            org.telegram.ui.ActionBar.t6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.m6.q7, h6Var);
            return;
        }
        a9Var.setText(org.telegram.messenger.hd.N0(2131743421, null));
        org.telegram.ui.ActionBar.t6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.m6.B6, h6Var);
        final int[] iArr = this.w;
        final int i7 = iArr[0];
        final Runnable[] runnableArr = this.x;
        final int[] iArr2 = this.y;
        final int i10 = this.E;
        final org.telegram.ui.ii iiVar = this.F;
        final org.telegram.ui.ActionBar.w2 w2Var = this.G;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.uq
            @Override // java.lang.Runnable
            public final void run() {
                runnableArr[0] = null;
                final boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                final int[] iArr3 = iArr;
                int i11 = iArr3[0];
                final int i12 = i7;
                if (i12 != i11) {
                    return;
                }
                TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                final String str = sb2;
                checkusername.username = str;
                final int i13 = i10;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                d3.b bVar = new d3.b(1);
                final int[] iArr4 = iArr2;
                final String[] strArr2 = strArr;
                final hi.e eVar2 = eVar;
                final g gVar2 = gVar;
                final TreeSet treeSet2 = treeSet;
                final org.telegram.ui.ii iiVar2 = iiVar;
                final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                final org.telegram.ui.Cells.a9 a9Var2 = a9Var;
                final org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.r10() { // from class: org.telegram.ui.Components.wq
                    @Override // org.telegram.messenger.r10
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
                        hi.e eVar3 = eVar2;
                        if (z10) {
                            strArr2[0] = str2;
                            eVar3.setEnabled(true);
                            gVar2.run();
                            return;
                        }
                        String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                        int i14 = i13;
                        TreeSet treeSet3 = treeSet2;
                        org.telegram.ui.ii iiVar3 = iiVar2;
                        org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
                        CharSequence d = br.d(i14, str2, treeSet3, str3, iiVar3, h6Var3);
                        CharSequence N0 = d != null ? d : org.telegram.messenger.hd.N0(2131751715, null);
                        org.telegram.ui.Cells.a9 a9Var3 = a9Var2;
                        a9Var3.setText(N0);
                        org.telegram.ui.ActionBar.t6.U(a9Var3.getTextView(), org.telegram.ui.ActionBar.m6.q7, h6Var3);
                        if (d != null || tL_error == null) {
                            return;
                        }
                        eVar3.setEnabled(true);
                        org.telegram.ui.Cells.c0.t(w2Var2.F, h6Var3, tL_error, false);
                    }
                });
            }
        };
        runnableArr[0] = runnable;
        org.telegram.messenger.g0.h3(runnable, 300L);
    }
}
