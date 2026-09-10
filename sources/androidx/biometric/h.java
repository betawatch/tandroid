package androidx.biometric;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ h(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // androidx.lifecycle.a0
    public final void r0(Object obj) {
        int i10 = this.a;
        CharSequence charSequence = null;
        p pVar = this.b;
        switch (i10) {
            case 0:
                t tVar = (t) obj;
                if (tVar != null) {
                    pVar.V(tVar);
                    y yVar = pVar.l0;
                    if (yVar.r == null) {
                        yVar.r = new androidx.lifecycle.z();
                    }
                    y.h(yVar.r, null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.Q()) {
                        pVar.S();
                    } else {
                        y yVar2 = pVar.l0;
                        String str = yVar2.k;
                        if (str != null) {
                            charSequence = str;
                        } else {
                            j6.l lVar = yVar2.f;
                            if (lVar != null && (charSequence = (CharSequence) lVar.d) == null) {
                                charSequence = "";
                            }
                        }
                        if (charSequence == null) {
                            charSequence = pVar.q(R.string.default_error_msg);
                        }
                        pVar.T(13, charSequence);
                        pVar.N(2);
                    }
                    pVar.l0.g(false);
                    break;
                }
                break;
        }
    }
}
