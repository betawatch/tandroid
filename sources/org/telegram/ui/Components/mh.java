package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh implements r1.d {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ mh(ti tiVar, float f10, float f11, boolean z10) {
        this.e = tiVar;
        this.c = f10;
        this.d = f11;
        this.b = z10;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ti tiVar = (ti) this.e;
                LinearLayout linearLayout = tiVar.j3;
                LinearLayout linearLayout2 = tiVar.l3;
                float f12 = f10 / 500.0f;
                ei eiVar = tiVar.Z1;
                li liVar = tiVar.w2;
                Float valueOf = Float.valueOf(f12);
                eiVar.getClass();
                eiVar.a(liVar, valueOf);
                tiVar.V2.setAlpha(org.telegram.messenger.g0.T1(this.c, this.d, f12));
                tiVar.N1(tiVar.w2, 0);
                tiVar.N1(tiVar.x2, 0);
                if (!(tiVar.x2 instanceof pm) || this.b) {
                    f12 = 1.0f - f12;
                }
                float i7 = Utilities.i(f12, 1.0f, 0.0f);
                linearLayout2.setAlpha(i7);
                float f13 = 1.0f - i7;
                linearLayout.setAlpha(f13);
                linearLayout.setTranslationX(i7 * (-org.telegram.messenger.g0.L(16.0f)));
                linearLayout2.setTranslationX(f13 * org.telegram.messenger.g0.L(16.0f));
                break;
            default:
                qn0 qn0Var = (qn0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f10 > this.c / 2.0f || !qn0Var.s) {
                    }
                } else if (f10 < this.d / 2.0f || !qn0Var.r) {
                }
                qn0Var.s = !z10;
                qn0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ mh(qn0 qn0Var, boolean z10, float f10, float f11) {
        this.e = qn0Var;
        this.b = z10;
        this.c = f10;
        this.d = f11;
    }
}
