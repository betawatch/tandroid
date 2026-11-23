package org.telegram.messenger;

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class x9 implements OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0.a b;

    public /* synthetic */ x9(q0.a aVar, int i7) {
        this.a = i7;
        this.b = aVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
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
                } catch (com.google.android.gms.common.api.f e10) {
                    int statusCode = e10.getStatusCode();
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
