package androidx.biometric;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ i(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // androidx.lifecycle.a0
    public final void Z(Object obj) {
        int i10 = this.a;
        CharSequence charSequence = null;
        q qVar = this.b;
        switch (i10) {
            case 0:
                t tVar = (t) obj;
                if (tVar != null) {
                    qVar.V(tVar);
                    y yVar = qVar.l0;
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
                        y yVar2 = qVar.l0;
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
                            charSequence = qVar.q(R.string.default_error_msg);
                        }
                        qVar.T(13, charSequence);
                        qVar.N(2);
                    }
                    qVar.l0.g(false);
                    break;
                }
                break;
        }
    }
}
