package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ a3(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.u2 u2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.m5 m5Var) {
        this.c = frameLayout;
        this.d = e6Var;
        this.e = u2Var;
        this.f = frameLayout2;
        this.b = iArr;
        this.h = strArr;
        this.n = iArr2;
        this.r = m5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        int[] iArr = this.b;
        ViewGroup viewGroup = this.f;
        KeyEvent.Callback callback = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i7) {
            case 0:
                di.i0 i0Var = (di.i0) obj2;
                org.telegram.messenger.ou ouVar = (org.telegram.messenger.ou) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (t4.c(null, (ib0) obj4, (ib0) callback, (ib0) viewGroup, (ib0) obj3) / 1000);
                int i10 = iArr[0];
                ft ftVar = (ft) i0Var.c;
                int i11 = i0Var.a;
                int i12 = i0Var.b;
                Editable text = ftVar.getText();
                wy0 wy0Var = new wy0();
                wy0Var.a |= 128;
                wy0Var.b = i11;
                wy0Var.c = i12;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c10;
                tL_messageEntityFormattedDate.flags = i10;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new d00(text.subSequence(i11, i12).toString(), wy0Var, tL_messageEntityFormattedDate), i11, i12, 33);
                } catch (Exception unused) {
                }
                dt dtVar = ftVar.T1;
                if (dtVar != null) {
                    dtVar.E();
                }
                ((org.telegram.ui.ActionBar.u2) ouVar.b).y0.run();
                break;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q()) {
                    m60 F = m60.F(u2Var.c, e6Var, frameLayout2);
                    for (int i13 = 0; i13 < iArr.length; i13++) {
                        F.c(0, strArr[i13], new u2(iArr2, iArr[i13], runnable), false);
                    }
                    F.i = 1;
                    F.Z();
                    break;
                } else {
                    new cc(frameLayout, e6Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131748497, null), new org.telegram.messenger.c6(21))).j();
                    break;
                }
        }
    }

    public /* synthetic */ a3(boolean[] zArr, ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, ib0 ib0Var4, di.i0 i0Var, int[] iArr, org.telegram.messenger.ou ouVar) {
        this.c = zArr;
        this.d = ib0Var;
        this.e = ib0Var2;
        this.f = ib0Var3;
        this.h = ib0Var4;
        this.n = i0Var;
        this.b = iArr;
        this.r = ouVar;
    }
}
