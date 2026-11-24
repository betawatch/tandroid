// default package

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class kze implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uha b;

    public /* synthetic */ kze(uha uhaVar, byte b) {
        this.a = b;
        this.b = uhaVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
