package org.telegram.messenger;

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class z9 implements OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0.a b;

    public /* synthetic */ z9(q0.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 0:
                if (task.getException() == null) {
                    this.b.accept((Location) task.getResult());
                    break;
                }
                break;
            default:
                q0.a aVar = this.b;
                try {
                    task.getResult(com.google.android.gms.common.api.f.class);
                    aVar.accept(0);
                    break;
                } catch (com.google.android.gms.common.api.f e) {
                    int statusCode = e.getStatusCode();
                    if (statusCode == 6) {
                        aVar.accept(1);
                    } else {
                        if (statusCode != 8502) {
                            return;
                        }
                        aVar.accept(2);
                        return;
                    }
                }
        }
    }
}
