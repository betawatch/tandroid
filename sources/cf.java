// default package

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cf implements ee, Continuation, ac7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ cf(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // ac7
    public final boolean b(TLRPC.TL_error tL_error) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 9:
                runnable.run();
                break;
            case 10:
                runnable.run();
                break;
            case 11:
                runnable.run();
                break;
            case 12:
                runnable.run();
                break;
            case 13:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
        return true;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                heVar.dismiss();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                runnable.run();
                break;
            case 6:
            default:
                runnable.run();
                break;
            case 7:
                runnable.run();
                break;
            case 8:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        this.b.run();
        return Tasks.forResult(null);
    }
}
