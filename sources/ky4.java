// default package

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ky4 implements OnCompleteListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vs2 b;

    public /* synthetic */ ky4(vs2 vs2Var, byte b) {
        this.a = b;
        this.b = vs2Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        byte b = this.a;
        vs2 vs2Var = this.b;
        switch (b) {
            case 0:
                if (task.getException() == null) {
                    vs2Var.accept((Location) task.getResult());
                    break;
                }
                break;
            default:
                try {
                    task.getResult(zn.class);
                    vs2Var.accept(0);
                    break;
                } catch (zn e) {
                    int statusCode = e.getStatusCode();
                    if (statusCode == 6) {
                        vs2Var.accept(1);
                        return;
                    } else {
                        if (statusCode == 8502) {
                            vs2Var.accept(2);
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
