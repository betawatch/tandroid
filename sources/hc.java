// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class hc implements Executor {
    public final /* synthetic */ byte a;

    public /* synthetic */ hc(byte b) {
        this.a = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                gl.d3(runnable);
                break;
            case 1:
                runnable.run();
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
