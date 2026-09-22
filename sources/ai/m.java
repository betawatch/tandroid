package ai;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) ((View) obj);
                a0Var.invalidate();
                a0Var.y.setTextColor(this.b);
                break;
            case 1:
                ((m4.k1) obj).f0(this.b);
                break;
            case 2:
                ((m4.k1) obj).N(this.b);
                break;
            case 3:
                ((m4.k1) obj).j(this.b);
                break;
            default:
                ((m4.k1) obj).D0(this.b);
                break;
        }
    }
}
