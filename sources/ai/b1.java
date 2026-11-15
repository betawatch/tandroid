package ai;

import java.util.concurrent.ExecutorService;
import org.telegram.messenger.z10;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;
    public final /* synthetic */ int c;

    public /* synthetic */ b1(z10 z10Var, int i7, int i10) {
        this.a = i10;
        this.b = z10Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.c;
        z10 z10Var = this.b;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.a;
                z10Var.a(Integer.valueOf(i10));
                break;
            default:
                z10Var.a(Integer.valueOf(i10));
                break;
        }
    }
}
