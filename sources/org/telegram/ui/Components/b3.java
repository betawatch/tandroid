package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public /* synthetic */ b3(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.t2 t2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, o4.b1 b1Var) {
        this.c = frameLayout;
        this.d = e6Var;
        this.e = t2Var;
        this.f = frameLayout2;
        this.b = iArr;
        this.h = strArr;
        this.n = iArr2;
        this.r = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        int[] iArr = this.b;
        ViewGroup viewGroup = this.f;
        KeyEvent.Callback callback = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i3) {
            case 0:
                ci.m0 m0Var = (ci.m0) obj2;
                hi.d dVar = (hi.d) obj;
                ((boolean[]) obj5)[0] = false;
                int c2 = (int) (t4.c(null, (cb0) obj4, (cb0) callback, (cb0) viewGroup, (cb0) obj3) / 1000);
                int i10 = iArr[0];
                xs xsVar = (xs) m0Var.c;
                int i11 = m0Var.a;
                int i12 = m0Var.b;
                Editable text = xsVar.getText();
                ty0 ty0Var = new ty0();
                ty0Var.a |= 128;
                ty0Var.b = i11;
                ty0Var.c = i12;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c2;
                tL_messageEntityFormattedDate.flags = i10;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new vz(text.subSequence(i11, i12).toString(), ty0Var, tL_messageEntityFormattedDate), i11, i12, 33);
                } catch (Exception unused) {
                }
                vs vsVar = xsVar.O1;
                if (vsVar != null) {
                    vsVar.m();
                }
                ((org.telegram.ui.ActionBar.t2) dVar.b).y0.run();
                break;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q()) {
                    f60 F = f60.F(t2Var.c, e6Var, frameLayout2);
                    for (int i13 = 0; i13 < iArr.length; i13++) {
                        F.c(0, strArr[i13], new u2(iArr2, iArr[i13], runnable), false);
                    }
                    F.i = 1;
                    F.Z();
                    break;
                } else {
                    new fc(frameLayout, e6Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131748505, null), new org.telegram.messenger.hc(19))).j();
                    break;
                }
        }
    }

    public /* synthetic */ b3(boolean[] zArr, cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3, cb0 cb0Var4, ci.m0 m0Var, int[] iArr, hi.d dVar) {
        this.c = zArr;
        this.d = cb0Var;
        this.e = cb0Var2;
        this.f = cb0Var3;
        this.h = cb0Var4;
        this.n = m0Var;
        this.b = iArr;
        this.r = dVar;
    }
}
