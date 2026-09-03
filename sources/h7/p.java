package h7;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb.l b;

    public /* synthetic */ p(cb.l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
