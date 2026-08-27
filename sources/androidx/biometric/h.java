package androidx.biometric;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ h(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // androidx.lifecycle.a0
    public final void J(Object obj) {
        switch (this.a) {
            case 0:
                t tVar = (t) obj;
                if (tVar != null) {
                    p pVar = this.b;
                    pVar.V(tVar);
                    y yVar = pVar.h0;
                    if (yVar.r == null) {
                        yVar.r = new androidx.lifecycle.z();
                    }
                    y.h(yVar.r, null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    p pVar2 = this.b;
                    if (pVar2.Q()) {
                        pVar2.S();
                    } else {
                        y yVar2 = pVar2.h0;
                        CharSequence charSequence = yVar2.k;
                        if (charSequence == null) {
                            u5.k kVar = yVar2.f;
                            if (kVar != null) {
                                charSequence = (CharSequence) kVar.d;
                                if (charSequence == null) {
                                    charSequence = "";
                                }
                            } else {
                                charSequence = null;
                            }
                        }
                        if (charSequence == null) {
                            charSequence = pVar2.q(R.string.default_error_msg);
                        }
                        pVar2.T(13, charSequence);
                        pVar2.N(2);
                    }
                    pVar2.h0.g(false);
                    break;
                }
                break;
        }
    }
}
