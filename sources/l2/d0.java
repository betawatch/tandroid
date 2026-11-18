package l2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((h2.i0) this.b).d(runnable);
                break;
            case 1:
                ((Handler) this.b).post(runnable);
                break;
            case 2:
                h2.l0.W(((p4.d0) this.b).l, runnable);
                break;
            default:
                ((s4.b) this.b).post(runnable);
                break;
        }
    }
}
