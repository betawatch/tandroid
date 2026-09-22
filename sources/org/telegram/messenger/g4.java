package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class g4 implements OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0.a b;

    public /* synthetic */ g4(q0.a aVar, int i10) {
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
