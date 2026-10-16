package androidx.biometric;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ i(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // androidx.lifecycle.a0
    public final void n0(Object obj) {
        int i10 = this.a;
        CharSequence charSequence = null;
        q qVar = this.b;
        switch (i10) {
            case 0:
                u uVar = (u) obj;
                if (uVar != null) {
                    qVar.V(uVar);
                    z zVar = qVar.l0;
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
                        z zVar2 = qVar.l0;
                        String str = zVar2.k;
                        if (str != null) {
                            charSequence = str;
                        } else {
                            j6.l lVar = zVar2.f;
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
