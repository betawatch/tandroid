package androidx.biometric;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ h(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // androidx.lifecycle.a0
    public final void Q(Object obj) {
        int i10 = this.a;
        CharSequence charSequence = null;
        p pVar = this.b;
        switch (i10) {
            case 0:
                s sVar = (s) obj;
                if (sVar != null) {
                    pVar.V(sVar);
                    x xVar = pVar.l0;
                    if (xVar.r == null) {
                        xVar.r = new androidx.lifecycle.z();
                    }
                    x.h(xVar.r, null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.Q()) {
                        pVar.S();
                    } else {
                        x xVar2 = pVar.l0;
                        String str = xVar2.k;
                        if (str != null) {
                            charSequence = str;
                        } else {
                            k6.m mVar = xVar2.f;
                            if (mVar != null && (charSequence = (CharSequence) mVar.d) == null) {
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
