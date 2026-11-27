// default package

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class il7 {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ yv2 c;

    public il7(yv2 yv2Var, ka3 ka3Var, Executor executor) {
        this.c = yv2Var;
        this.a = new WeakReference(ka3Var);
        this.b = executor;
    }
}
