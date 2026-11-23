package androidx.biometric;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class j implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ j(q qVar, int i7) {
        this.a = i7;
        this.b = qVar;
    }

    @Override // androidx.lifecycle.a0
    public final void A(Object obj) {
        switch (this.a) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    q qVar = this.b;
                    if (qVar.R()) {
                        qVar.W(charSequence);
                    }
                    qVar.m0.d(null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    q qVar2 = this.b;
                    qVar2.N(1);
                    qVar2.O();
                    z zVar = qVar2.m0;
                    if (zVar.x == null) {
                        zVar.x = new androidx.lifecycle.z();
                    }
                    z.h(zVar.x, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
