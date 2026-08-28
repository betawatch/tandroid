package ag;

import k3.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i extends Thread {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar) {
        super("ExoPlayer:SimpleDecoder");
        this.b = mVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                jVar.x = true;
                try {
                    j.a(jVar);
                    int glGetError = ((j) this.b).r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((j) this.b).x) {
                        while (true) {
                            j jVar2 = (j) this.b;
                            a aVar = jVar2.b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (jVar2.A) {
                                    synchronized (jVar2) {
                                        if (jVar2.x) {
                                            aVar.onSurfaceCreated(jVar2.r, jVar2.n);
                                            aVar.onSurfaceChanged(jVar2.r, jVar2.w, jVar2.v);
                                        }
                                    }
                                    ((j) this.b).A = false;
                                }
                                try {
                                    if (!j.b((j) this.b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        j.c((j) this.b, (currentTimeMillis2 - currentTimeMillis) / 1000.0f);
                                        if (!((j) this.b).L) {
                                            ((j) this.b).L = true;
                                            AndroidUtilities.runOnUIThread(((j) this.b).M);
                                            ((j) this.b).M = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (j.b((j) this.b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((j) this.b).s; currentTimeMillis3 = System.currentTimeMillis()) {
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
                    ((j) this.b).x = false;
                    return;
                }
            default:
                m.access$000((m) this.b);
                return;
        }
    }

    public i(j jVar) {
        this.b = jVar;
    }
}
