package androidx.biometric;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ h(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // androidx.lifecycle.a0
    public final void G(Object obj) {
        int i10 = this.a;
        CharSequence charSequence = null;
        q qVar = this.b;
        switch (i10) {
            case 0:
                u uVar = (u) obj;
                if (uVar != null) {
                    qVar.V(uVar);
                    z zVar = qVar.i0;
                    if (zVar.r == null) {
                        zVar.r = new androidx.lifecycle.z();
                    }
                    z.h(zVar.r, null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.Q()) {
                        qVar.S();
                    } else {
                        z zVar2 = qVar.i0;
                        String str = zVar2.k;
                        if (str != null) {
                            charSequence = str;
                        } else {
                            x5.k kVar = zVar2.f;
                            if (kVar != null && (charSequence = (CharSequence) kVar.d) == null) {
                                charSequence = "";
                            }
                        }
                        if (charSequence == null) {
                            charSequence = qVar.q(R.string.default_error_msg);
                        }
                        qVar.T(13, charSequence);
                        qVar.N(2);
                    }
                    qVar.i0.g(false);
                    break;
                }
                break;
        }
    }
}
