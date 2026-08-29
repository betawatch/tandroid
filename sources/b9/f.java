package b9;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ ha.c d;

    public /* synthetic */ f(h hVar, Runnable runnable, ha.c cVar, int i10) {
        this.a = i10;
        this.b = hVar;
        this.c = runnable;
        this.d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExecutorService executorService = this.b.a;
                final int i10 = 0;
                final Runnable runnable = this.c;
                final ha.c cVar = this.d;
                executorService.execute(new Runnable() { // from class: b9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((j) cVar.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((j) cVar.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                j jVar = (j) cVar.b;
                                try {
                                    runnable2.run();
                                    jVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    jVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.b.a;
                final int i11 = 2;
                final Runnable runnable2 = this.c;
                final ha.c cVar2 = this.d;
                executorService2.execute(new Runnable() { // from class: b9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((j) cVar2.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((j) cVar2.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                j jVar = (j) cVar2.b;
                                try {
                                    runnable22.run();
                                    jVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    jVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.b.a;
                final int i12 = 1;
                final Runnable runnable3 = this.c;
                final ha.c cVar3 = this.d;
                executorService3.execute(new Runnable() { // from class: b9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((j) cVar3.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((j) cVar3.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                j jVar = (j) cVar3.b;
                                try {
                                    runnable22.run();
                                    jVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    jVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
