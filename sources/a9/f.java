package a9;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ i d;

    public /* synthetic */ f(h hVar, Runnable runnable, i iVar, int i10) {
        this.a = i10;
        this.b = hVar;
        this.c = runnable;
        this.d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExecutorService executorService = this.b.a;
                final int i10 = 0;
                final Runnable runnable = this.c;
                final i iVar = this.d;
                executorService.execute(new Runnable() { // from class: a9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e9) {
                                    ((k) iVar.b).l(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((k) iVar.b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                k kVar = (k) iVar.b;
                                try {
                                    runnable2.run();
                                    kVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    kVar.l(e11);
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
                final i iVar2 = this.d;
                executorService2.execute(new Runnable() { // from class: a9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e9) {
                                    ((k) iVar2.b).l(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((k) iVar2.b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                k kVar = (k) iVar2.b;
                                try {
                                    runnable22.run();
                                    kVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    kVar.l(e11);
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
                final i iVar3 = this.d;
                executorService3.execute(new Runnable() { // from class: a9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e9) {
                                    ((k) iVar3.b).l(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((k) iVar3.b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                k kVar = (k) iVar3.b;
                                try {
                                    runnable22.run();
                                    kVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    kVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
