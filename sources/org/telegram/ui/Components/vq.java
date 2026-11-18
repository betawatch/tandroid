package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vq implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ org.telegram.ui.ii F;
    public final /* synthetic */ org.telegram.ui.ActionBar.x2 G;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ bi.t4 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ hi.d e;
    public final /* synthetic */ org.telegram.ui.Cells.l3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ k7 n;
    public final /* synthetic */ org.telegram.ui.Cells.a9 r;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 s;
    public final /* synthetic */ int[] w;
    public final /* synthetic */ Runnable[] x;
    public final /* synthetic */ int[] y;

    public /* synthetic */ vq(boolean[] zArr, int[] iArr, bi.t4 t4Var, String[] strArr, hi.d dVar, org.telegram.ui.Cells.l3 l3Var, TreeSet treeSet, k7 k7Var, org.telegram.ui.Cells.a9 a9Var, org.telegram.ui.ActionBar.i6 i6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i7, org.telegram.ui.ii iiVar, org.telegram.ui.ActionBar.x2 x2Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = t4Var;
        this.d = strArr;
        this.e = dVar;
        this.f = l3Var;
        this.h = treeSet;
        this.n = k7Var;
        this.r = a9Var;
        this.s = i6Var;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.E = i7;
        this.F = iiVar;
        this.G = x2Var;
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
        final hi.d dVar = this.e;
        dVar.setLoading(false);
        dVar.setEnabled(false);
        String charSequence = this.f.getText().toString();
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(charSequence);
        boolean a10 = zq.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        m10.append((a10 || zq.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb2 = m10.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final k7 k7Var = this.n;
        if (isEmpty) {
            k7Var.run();
            return;
        }
        int length = sb2.length();
        final org.telegram.ui.Cells.a9 a9Var = this.r;
        final org.telegram.ui.ActionBar.i6 i6Var = this.s;
        if (length < 4 || sb2.length() > 32) {
            a9Var.setText(org.telegram.messenger.gd.M0(sb2.length() < 4 ? 2131743417 : 2131743418, null));
            org.telegram.ui.ActionBar.u6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.n6.q7, i6Var);
            return;
        }
        a9Var.setText(org.telegram.messenger.gd.M0(2131743429, null));
        org.telegram.ui.ActionBar.u6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.n6.B6, i6Var);
        final int[] iArr = this.w;
        final int i7 = iArr[0];
        final Runnable[] runnableArr = this.x;
        final int[] iArr2 = this.y;
        final int i10 = this.E;
        final org.telegram.ui.ii iiVar = this.F;
        final org.telegram.ui.ActionBar.x2 x2Var = this.G;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.sq
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
                final hi.d dVar2 = dVar;
                final k7 k7Var2 = k7Var;
                final TreeSet treeSet2 = treeSet;
                final org.telegram.ui.ii iiVar2 = iiVar;
                final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                final org.telegram.ui.Cells.a9 a9Var2 = a9Var;
                final org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.q10() { // from class: org.telegram.ui.Components.uq
                    @Override // org.telegram.messenger.q10
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
                        hi.d dVar3 = dVar2;
                        if (z10) {
                            strArr2[0] = str2;
                            dVar3.setEnabled(true);
                            k7Var2.run();
                            return;
                        }
                        String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                        int i14 = i13;
                        TreeSet treeSet3 = treeSet2;
                        org.telegram.ui.ii iiVar3 = iiVar2;
                        org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                        CharSequence d = zq.d(i14, str2, treeSet3, str3, iiVar3, i6Var3);
                        CharSequence M0 = d != null ? d : org.telegram.messenger.gd.M0(2131751716, null);
                        org.telegram.ui.Cells.a9 a9Var3 = a9Var2;
                        a9Var3.setText(M0);
                        org.telegram.ui.ActionBar.u6.U(a9Var3.getTextView(), org.telegram.ui.ActionBar.n6.q7, i6Var3);
                        if (d != null || tL_error == null) {
                            return;
                        }
                        dVar3.setEnabled(true);
                        org.telegram.ui.Cells.c0.t(x2Var2.F, i6Var3, tL_error, false);
                    }
                });
            }
        };
        runnableArr[0] = runnable;
        org.telegram.messenger.g0.h3(runnable, 300L);
    }
}
