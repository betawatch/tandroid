package androidx.biometric;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ h(q qVar, int i9) {
        this.a = i9;
        this.b = qVar;
    }

    @Override // androidx.lifecycle.a0
    public final void E(Object obj) {
        int i9 = this.a;
        CharSequence charSequence = null;
        q qVar = this.b;
        switch (i9) {
            case 0:
                t tVar = (t) obj;
                if (tVar != null) {
                    qVar.V(tVar);
                    y yVar = qVar.h0;
                    if (yVar.r == null) {
                        yVar.r = new androidx.lifecycle.z();
                    }
                    y.h(yVar.r, null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.Q()) {
                        qVar.S();
                    } else {
                        y yVar2 = qVar.h0;
                        String str = yVar2.k;
                        if (str != null) {
                            charSequence = str;
                        } else {
                            t5.l lVar = yVar2.f;
                            if (lVar != null && (charSequence = (CharSequence) lVar.d) == null) {
                                charSequence = "";
                            }
                        }
                        if (charSequence == null) {
                            charSequence = qVar.q(R.string.default_error_msg);
                        }
                        qVar.T(13, charSequence);
                        qVar.N(2);
                    }
                    qVar.h0.g(false);
                    break;
                }
                break;
        }
    }
}
