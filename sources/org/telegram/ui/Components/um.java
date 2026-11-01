package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.r20 b;

    public /* synthetic */ um(org.telegram.messenger.r20 r20Var, int i10) {
        this.a = i10;
        this.b = r20Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a(new jh.e((String) obj));
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
