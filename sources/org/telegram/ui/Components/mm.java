package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
