// default package

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class l05 implements OnCompleteListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gu2 b;

    public /* synthetic */ l05(gu2 gu2Var, byte b) {
        this.a = b;
        this.b = gu2Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        byte b = this.a;
        gu2 gu2Var = this.b;
        switch (b) {
            case 0:
                if (task.getException() == null) {
                    gu2Var.accept((Location) task.getResult());
                    break;
                }
                break;
            default:
                try {
                    task.getResult(ap.class);
                    gu2Var.accept(0);
                    break;
                } catch (ap e) {
                    int statusCode = e.getStatusCode();
                    if (statusCode == 6) {
                        gu2Var.accept(1);
                        return;
                    } else {
                        if (statusCode == 8502) {
                            gu2Var.accept(2);
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
