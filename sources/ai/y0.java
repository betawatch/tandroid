package ai;

import java.util.concurrent.ExecutorService;
import org.telegram.messenger.y10;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y10 b;
    public final /* synthetic */ int c;

    public /* synthetic */ y0(y10 y10Var, int i7, int i10) {
        this.a = i10;
        this.b = y10Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.c;
        y10 y10Var = this.b;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.a;
                y10Var.a(Integer.valueOf(i10));
                break;
            default:
                y10Var.a(Integer.valueOf(i10));
                break;
        }
    }
}
