package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.y10 b;

    public /* synthetic */ dn(org.telegram.messenger.y10 y10Var, int i7) {
        this.a = i7;
        this.b = y10Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a(new th.e((String) obj));
                break;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.b.a(Boolean.valueOf(z10));
                break;
        }
    }
}
