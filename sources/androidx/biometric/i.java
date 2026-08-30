package androidx.biometric;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ i(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // androidx.lifecycle.a0
    public final void m0(Object obj) {
        int i10 = this.a;
        CharSequence charSequence = null;
        r rVar = this.b;
        switch (i10) {
            case 0:
                v vVar = (v) obj;
                if (vVar != null) {
                    rVar.V(vVar);
                    a0 a0Var = rVar.i0;
                    if (a0Var.r == null) {
                        a0Var.r = new androidx.lifecycle.z();
                    }
                    a0.h(a0Var.r, null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (rVar.Q()) {
                        rVar.S();
                    } else {
                        a0 a0Var2 = rVar.i0;
                        String str = a0Var2.k;
                        if (str != null) {
                            charSequence = str;
                        } else {
                            x5.k kVar = a0Var2.f;
                            if (kVar != null && (charSequence = (CharSequence) kVar.d) == null) {
                                charSequence = "";
                            }
                        }
                        if (charSequence == null) {
                            charSequence = rVar.q(R.string.default_error_msg);
                        }
                        rVar.T(13, charSequence);
                        rVar.N(2);
                    }
                    rVar.i0.g(false);
                    break;
                }
                break;
        }
    }
}
