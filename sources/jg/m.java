package jg;

import org.telegram.ui.cr0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ cr0 b;

    public /* synthetic */ m(cr0 cr0Var, int i10) {
        this.a = i10;
        this.b = cr0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                r0.X(this.b, (Integer) obj);
                break;
            default:
                r0.a0(this.b, (Integer) obj);
                break;
        }
    }
}
