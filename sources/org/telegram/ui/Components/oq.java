package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ a2 F;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2 G;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ ci.p0 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ hi.d e;
    public final /* synthetic */ org.telegram.ui.Cells.k3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ yf n;
    public final /* synthetic */ org.telegram.ui.Cells.y8 r;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 s;
    public final /* synthetic */ int[] w;
    public final /* synthetic */ Runnable[] x;
    public final /* synthetic */ int[] y;

    public /* synthetic */ oq(boolean[] zArr, int[] iArr, ci.p0 p0Var, String[] strArr, hi.d dVar, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, yf yfVar, org.telegram.ui.Cells.y8 y8Var, org.telegram.ui.ActionBar.e6 e6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i7, a2 a2Var, org.telegram.ui.ActionBar.u2 u2Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = p0Var;
        this.d = strArr;
        this.e = dVar;
        this.f = k3Var;
        this.h = treeSet;
        this.n = yfVar;
        this.r = y8Var;
        this.s = e6Var;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.E = i7;
        this.F = a2Var;
        this.G = u2Var;
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
        boolean a10 = sq.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        m10.append((a10 || sq.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb2 = m10.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final yf yfVar = this.n;
        if (isEmpty) {
            yfVar.run();
            return;
        }
        int length = sb2.length();
        final org.telegram.ui.Cells.y8 y8Var = this.r;
        final org.telegram.ui.ActionBar.e6 e6Var = this.s;
        if (length < 4 || sb2.length() > 32) {
            y8Var.setText(org.telegram.messenger.hd.M0(sb2.length() < 4 ? 2131743654 : 2131743655, null));
            org.telegram.ui.ActionBar.q6.U(y8Var.getTextView(), org.telegram.ui.ActionBar.j6.q7, e6Var);
            return;
        }
        y8Var.setText(org.telegram.messenger.hd.M0(2131743666, null));
        org.telegram.ui.ActionBar.q6.U(y8Var.getTextView(), org.telegram.ui.ActionBar.j6.B6, e6Var);
        final int[] iArr = this.w;
        final int i7 = iArr[0];
        final Runnable[] runnableArr = this.x;
        final int[] iArr2 = this.y;
        final int i10 = this.E;
        final a2 a2Var = this.F;
        final org.telegram.ui.ActionBar.u2 u2Var = this.G;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.lq
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
                final yf yfVar2 = yfVar;
                final TreeSet treeSet2 = treeSet;
                final a2 a2Var2 = a2Var;
                final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                final org.telegram.ui.Cells.y8 y8Var2 = y8Var;
                final org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.s10() { // from class: org.telegram.ui.Components.nq
                    @Override // org.telegram.messenger.s10
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
                            yfVar2.run();
                            return;
                        }
                        String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                        int i14 = i13;
                        TreeSet treeSet3 = treeSet2;
                        a2 a2Var3 = a2Var2;
                        org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                        CharSequence d = sq.d(i14, str2, treeSet3, str3, a2Var3, e6Var3);
                        CharSequence M0 = d != null ? d : org.telegram.messenger.hd.M0(2131751727, null);
                        org.telegram.ui.Cells.y8 y8Var3 = y8Var2;
                        y8Var3.setText(M0);
                        org.telegram.ui.ActionBar.q6.U(y8Var3.getTextView(), org.telegram.ui.ActionBar.j6.q7, e6Var3);
                        if (d != null || tL_error == null) {
                            return;
                        }
                        dVar3.setEnabled(true);
                        org.telegram.ui.Cells.y0.q(u2Var2.F, e6Var3, tL_error, false);
                    }
                });
            }
        };
        runnableArr[0] = runnable;
        org.telegram.messenger.g0.i3(runnable, 300L);
    }
}
