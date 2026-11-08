package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq implements Runnable {
    public final /* synthetic */ int D;
    public final /* synthetic */ r2 E;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 F;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ ai.a1 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ fi.d e;
    public final /* synthetic */ org.telegram.ui.Cells.k3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ ng n;
    public final /* synthetic */ org.telegram.ui.Cells.z8 r;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 s;
    public final /* synthetic */ int[] w;
    public final /* synthetic */ Runnable[] x;
    public final /* synthetic */ int[] y;

    public /* synthetic */ hq(boolean[] zArr, int[] iArr, ai.a1 a1Var, String[] strArr, fi.d dVar, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, ng ngVar, org.telegram.ui.Cells.z8 z8Var, org.telegram.ui.ActionBar.f6 f6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i7, r2 r2Var, org.telegram.ui.ActionBar.v2 v2Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = a1Var;
        this.d = strArr;
        this.e = dVar;
        this.f = k3Var;
        this.h = treeSet;
        this.n = ngVar;
        this.r = z8Var;
        this.s = f6Var;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.D = i7;
        this.E = r2Var;
        this.F = v2Var;
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
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(charSequence);
        boolean a10 = lq.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        m10.append((a10 || lq.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb2 = m10.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final ng ngVar = this.n;
        if (isEmpty) {
            ngVar.run();
            return;
        }
        int length = sb2.length();
        final org.telegram.ui.Cells.z8 z8Var = this.r;
        final org.telegram.ui.ActionBar.f6 f6Var = this.s;
        if (length < 4 || sb2.length() > 32) {
            z8Var.setText(org.telegram.messenger.id.M0(sb2.length() < 4 ? 2131743657 : 2131743658, null));
            org.telegram.ui.ActionBar.r6.V(z8Var.getTextView(), org.telegram.ui.ActionBar.k6.q7, f6Var);
            return;
        }
        z8Var.setText(org.telegram.messenger.id.M0(2131743669, null));
        org.telegram.ui.ActionBar.r6.V(z8Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, f6Var);
        final int[] iArr = this.w;
        final int i7 = iArr[0];
        final Runnable[] runnableArr = this.x;
        final int[] iArr2 = this.y;
        final int i10 = this.D;
        final r2 r2Var = this.E;
        final org.telegram.ui.ActionBar.v2 v2Var = this.F;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.dq
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
                final fi.d dVar2 = dVar;
                final ng ngVar2 = ngVar;
                final TreeSet treeSet2 = treeSet;
                final r2 r2Var2 = r2Var;
                final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                final org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                final org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.v10() { // from class: org.telegram.ui.Components.gq
                    @Override // org.telegram.messenger.v10
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
                        boolean z9 = bool instanceof TLRPC.TL_boolTrue;
                        String str2 = str;
                        fi.d dVar3 = dVar2;
                        if (z9) {
                            strArr2[0] = str2;
                            dVar3.setEnabled(true);
                            ngVar2.run();
                            return;
                        }
                        String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                        int i14 = i13;
                        TreeSet treeSet3 = treeSet2;
                        r2 r2Var3 = r2Var2;
                        org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                        CharSequence d = lq.d(i14, str2, treeSet3, str3, r2Var3, f6Var3);
                        CharSequence M0 = d != null ? d : org.telegram.messenger.id.M0(2131751728, null);
                        org.telegram.ui.Cells.z8 z8Var3 = z8Var2;
                        z8Var3.setText(M0);
                        org.telegram.ui.ActionBar.r6.V(z8Var3.getTextView(), org.telegram.ui.ActionBar.k6.q7, f6Var3);
                        if (d != null || tL_error == null) {
                            return;
                        }
                        dVar3.setEnabled(true);
                        org.telegram.ui.Cells.f1.r(v2Var2.E, f6Var3, tL_error, false);
                    }
                });
            }
        };
        runnableArr[0] = runnable;
        org.telegram.messenger.g0.i3(runnable, 300L);
    }
}
