package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ b3(FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.z2 z2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.fp fpVar) {
        this.c = frameLayout;
        this.d = p6Var;
        this.e = z2Var;
        this.f = frameLayout2;
        this.b = iArr;
        this.h = strArr;
        this.n = iArr2;
        this.r = fpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        int[] iArr = this.b;
        ViewGroup viewGroup = this.f;
        KeyEvent.Callback callback = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i10) {
            case 0:
                ht htVar = (ht) obj2;
                l2.f fVar = (l2.f) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (s4.c(null, (ac0) obj4, (ac0) callback, (ac0) viewGroup, (ac0) obj3) / 1000);
                int i11 = iArr[0];
                mt mtVar = (mt) htVar.c;
                int i12 = htVar.a;
                int i13 = htVar.b;
                Editable text = mtVar.getText();
                yz0 yz0Var = new yz0();
                yz0Var.a |= 128;
                yz0Var.b = i12;
                yz0Var.c = i13;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c10;
                tL_messageEntityFormattedDate.flags = i11;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new n00(text.subSequence(i12, i13).toString(), yz0Var, tL_messageEntityFormattedDate), i12, i13, 33);
                } catch (Exception unused) {
                }
                kt ktVar = mtVar.N1;
                if (ktVar != null) {
                    ktVar.m();
                }
                ((org.telegram.ui.ActionBar.z2) fVar.b).x0.run();
                break;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj4;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q()) {
                    z60 F = z60.F(z2Var.c, p6Var, frameLayout2);
                    for (int i14 = 0; i14 < iArr.length; i14++) {
                        F.c(0, strArr[i14], new w2(iArr2, iArr[i14], runnable), false);
                    }
                    F.i = 1;
                    F.Z();
                    break;
                } else {
                    new cc(frameLayout, p6Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131748512, null), new org.telegram.messenger.rz(6))).j();
                    break;
                }
        }
    }

    public /* synthetic */ b3(boolean[] zArr, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, ac0 ac0Var4, ht htVar, int[] iArr, l2.f fVar) {
        this.c = zArr;
        this.d = ac0Var;
        this.e = ac0Var2;
        this.f = ac0Var3;
        this.h = ac0Var4;
        this.n = htVar;
        this.b = iArr;
        this.r = fVar;
    }
}
