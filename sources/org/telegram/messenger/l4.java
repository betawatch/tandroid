package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class l4 implements OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0.a b;

    public /* synthetic */ l4(q0.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 0:
                GoogleLocationProvider.lambda$getLastLocation$0(this.b, task);
                break;
            default:
                GoogleLocationProvider.lambda$checkLocationSettings$1(this.b, task);
                break;
        }
    }
}
