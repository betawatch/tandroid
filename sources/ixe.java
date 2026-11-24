// default package

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ixe implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sfa b;

    public /* synthetic */ ixe(sfa sfaVar, byte b) {
        this.a = b;
        this.b = sfaVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
