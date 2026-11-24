// default package

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
