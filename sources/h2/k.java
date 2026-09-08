package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                    } catch (InterruptedException e7) {
                        throw new IllegalStateException(e7);
                    }
                } while (((l) this.b).j());
                return;
            default:
                tg.e eVar = (tg.e) this.b;
                eVar.x = true;
                try {
                    tg.e.a(eVar);
                    int glGetError = ((tg.e) this.b).r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((tg.e) this.b).x) {
                        while (true) {
                            tg.e eVar2 = (tg.e) this.b;
                            tg.a aVar = eVar2.b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (eVar2.E) {
                                    synchronized (eVar2) {
                                        if (eVar2.x) {
                                            aVar.onSurfaceCreated(eVar2.r, eVar2.n);
                                            aVar.onSurfaceChanged(eVar2.r, eVar2.w, eVar2.v);
                                        }
                                    }
                                    ((tg.e) this.b).E = false;
                                }
                                try {
                                    if (!tg.e.b((tg.e) this.b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        tg.e.c((tg.e) this.b, (currentTimeMillis2 - currentTimeMillis) / 1000.0f);
                                        if (!((tg.e) this.b).P) {
                                            ((tg.e) this.b).P = true;
                                            AndroidUtilities.runOnUIThread(((tg.e) this.b).Q);
                                            ((tg.e) this.b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (tg.e.b((tg.e) this.b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((tg.e) this.b).s; currentTimeMillis3 = System.currentTimeMillis()) {
                                            }
                                        }
                                    } catch (InterruptedException unused2) {
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    ((tg.e) this.b).x = false;
                    return;
                }
        }
    }

    public k(tg.e eVar) {
        this.b = eVar;
    }
}
