package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ z1 a;

    public /* synthetic */ n1(z1 z1Var) {
        this.a = z1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z1.W(this.a, (x51) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        x51 x51Var = (x51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (x51Var.a == 16) {
            Object obj6 = x51Var.G;
            if (!(obj6 instanceof b2) || !((b2) obj6).g) {
                this.a.e0(x51Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
