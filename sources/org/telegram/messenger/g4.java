package org.telegram.messenger;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
