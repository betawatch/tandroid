package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.c20 b;

    public /* synthetic */ mm(org.telegram.messenger.c20 c20Var, int i7) {
        this.a = i7;
        this.b = c20Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a(new th.e((String) obj));
                break;
            default:
                int[] iArr = (int[]) obj;
                boolean z9 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z9 = true;
                }
                this.b.a(Boolean.valueOf(z9));
                break;
        }
    }
}
