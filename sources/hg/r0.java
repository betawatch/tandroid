package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ r0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.a0();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        v0.W(this.b, (i51) obj, (View) obj2);
    }
}
