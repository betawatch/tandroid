package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public /* synthetic */ b3(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.w2 w2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.m6 m6Var) {
        this.c = frameLayout;
        this.d = h6Var;
        this.e = w2Var;
        this.f = frameLayout2;
        this.b = iArr;
        this.h = strArr;
        this.n = iArr2;
        this.r = m6Var;
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
                bi.r0 r0Var = (bi.r0) obj2;
                h9.f1 f1Var = (h9.f1) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (u4.c(null, (hb0) obj4, (hb0) callback, (hb0) viewGroup, (hb0) obj3) / 1000);
                int i10 = iArr[0];
                ys ysVar = (ys) r0Var.c;
                int i11 = r0Var.a;
                int i12 = r0Var.b;
                Editable text = ysVar.getText();
                uy0 uy0Var = new uy0();
                uy0Var.a |= 128;
                uy0Var.b = i11;
                uy0Var.c = i12;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c10;
                tL_messageEntityFormattedDate.flags = i10;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new zz(text.subSequence(i11, i12).toString(), uy0Var, tL_messageEntityFormattedDate), i11, i12, 33);
                } catch (Exception unused) {
                }
                ws wsVar = ysVar.N1;
                if (wsVar != null) {
                    wsVar.m();
                }
                ((org.telegram.ui.ActionBar.w2) f1Var.b).x0.run();
                break;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()) {
                    k60 F = k60.F(w2Var.c, h6Var, frameLayout2);
                    for (int i13 = 0; i13 < iArr.length; i13++) {
                        F.c(0, strArr[i13], new v2(iArr2, iArr[i13], runnable), false);
                    }
                    F.i = 1;
                    F.Z();
                    break;
                } else {
                    new gc(frameLayout, h6Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131748497, null), new org.telegram.messenger.rc(17))).j();
                    break;
                }
        }
    }

    public /* synthetic */ b3(boolean[] zArr, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, hb0 hb0Var4, bi.r0 r0Var, int[] iArr, h9.f1 f1Var) {
        this.c = zArr;
        this.d = hb0Var;
        this.e = hb0Var2;
        this.f = hb0Var3;
        this.h = hb0Var4;
        this.n = r0Var;
        this.b = iArr;
        this.r = f1Var;
    }
}
