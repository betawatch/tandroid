package org.telegram.ui.Components;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ i3(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.w2 w2Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, oi.h hVar) {
        this.c = frameLayout;
        this.d = i6Var;
        this.e = w2Var;
        this.f = frameLayout2;
        this.b = iArr;
        this.h = strArr;
        this.n = iArr2;
        this.r = hVar;
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
                h6.o oVar = (h6.o) obj;
                ((boolean[]) obj5)[0] = false;
                int c10 = (int) (b5.c(null, (qb0) obj4, (qb0) callback, (qb0) viewGroup, (qb0) obj3) / 1000);
                int i10 = iArr[0];
                mt mtVar = (mt) i0Var.c;
                int i11 = i0Var.a;
                int i12 = i0Var.b;
                Editable text = mtVar.getText();
                ez0 ez0Var = new ez0();
                ez0Var.a |= 128;
                ez0Var.b = i11;
                ez0Var.c = i12;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.date = c10;
                tL_messageEntityFormattedDate.flags = i10;
                tL_messageEntityFormattedDate.applyFlags();
                try {
                    text.setSpan(new k00(text.subSequence(i11, i12).toString(), ez0Var, tL_messageEntityFormattedDate), i11, i12, 33);
                } catch (Exception unused) {
                }
                kt ktVar = mtVar.T1;
                if (ktVar != null) {
                    ktVar.u();
                }
                ((org.telegram.ui.ActionBar.w2) oVar.b).y0.run();
                break;
            default:
                FrameLayout frameLayout = (FrameLayout) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) callback;
                FrameLayout frameLayout2 = (FrameLayout) viewGroup;
                String[] strArr = (String[]) obj3;
                int[] iArr2 = (int[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q()) {
                    x60 G = x60.G(w2Var.c, i6Var, frameLayout2);
                    for (int i13 = 0; i13 < iArr.length; i13++) {
                        G.c(0, strArr[i13], new c3(iArr2, iArr[i13], runnable), false);
                    }
                    G.i = 1;
                    G.a0();
                    break;
                } else {
                    new kc(frameLayout, i6Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.gd.N0(2131748304, null), new org.telegram.messenger.j2(23))).j();
                    break;
                }
        }
    }

    public /* synthetic */ i3(boolean[] zArr, qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3, qb0 qb0Var4, di.i0 i0Var, int[] iArr, h6.o oVar) {
        this.c = zArr;
        this.d = qb0Var;
        this.e = qb0Var2;
        this.f = qb0Var3;
        this.h = qb0Var4;
        this.n = i0Var;
        this.b = iArr;
        this.r = oVar;
    }
}
