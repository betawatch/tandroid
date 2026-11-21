package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class al implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml b;

    public /* synthetic */ al(ml mlVar, int i7) {
        this.a = i7;
        this.b = mlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                ml.T(this.b);
                break;
            case 1:
                ml.V(this.b);
                break;
            case 2:
                ml mlVar = this.b;
                double[] dArr = mlVar.b.y4;
                mlVar.h0(dArr[0], dArr[1]);
                break;
            case 3:
                org.telegram.messenger.g0.g3(new al(this.b, 6));
                break;
            case 4:
                ml mlVar2 = this.b;
                jg.r0 r0Var = mlVar2.L;
                if (!mlVar2.l0) {
                    org.telegram.messenger.da daVar = mlVar2.E;
                    if (daVar != null && (location = mlVar2.j0) != null) {
                        location.setLatitude(((org.telegram.messenger.ab) daVar.d().b).a);
                        mlVar2.j0.setLongitude(((org.telegram.messenger.ab) mlVar2.E.d().b).b);
                    }
                    r0Var.L(mlVar2.j0);
                    r0Var.H();
                    break;
                } else {
                    mlVar2.l0 = false;
                    break;
                }
                break;
            case 5:
                View view = this.b.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    break;
                }
                break;
            case 6:
                View view2 = this.b.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                break;
            default:
                this.b.h0(0.0d, 0.0d);
                break;
        }
    }
}
