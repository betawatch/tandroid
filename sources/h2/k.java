package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k extends Thread {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.b = lVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (((l) this.b).j());
                return;
            default:
                rg.f fVar = (rg.f) this.b;
                fVar.x = true;
                try {
                    rg.f.a(fVar);
                    int glGetError = ((rg.f) this.b).r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((rg.f) this.b).x) {
                        while (true) {
                            rg.f fVar2 = (rg.f) this.b;
                            rg.a aVar = fVar2.b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (fVar2.E) {
                                    synchronized (fVar2) {
                                        if (fVar2.x) {
                                            aVar.onSurfaceCreated(fVar2.r, fVar2.n);
                                            aVar.onSurfaceChanged(fVar2.r, fVar2.w, fVar2.v);
                                        }
                                    }
                                    ((rg.f) this.b).E = false;
                                }
                                try {
                                    if (!rg.f.b((rg.f) this.b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        rg.f.c((rg.f) this.b, (currentTimeMillis2 - currentTimeMillis) / 1000.0f);
                                        if (!((rg.f) this.b).P) {
                                            ((rg.f) this.b).P = true;
                                            AndroidUtilities.runOnUIThread(((rg.f) this.b).Q);
                                            ((rg.f) this.b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (rg.f.b((rg.f) this.b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((rg.f) this.b).s; currentTimeMillis3 = System.currentTimeMillis()) {
                                            }
                                        }
                                    } catch (InterruptedException unused2) {
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    ((rg.f) this.b).x = false;
                    return;
                }
        }
    }

    public k(rg.f fVar) {
        this.b = fVar;
    }
}
