package h7;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
