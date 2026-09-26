package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                sg.e eVar = (sg.e) this.b;
                eVar.x = true;
                try {
                    sg.e.a(eVar);
                    int glGetError = ((sg.e) this.b).r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((sg.e) this.b).x) {
                        while (true) {
                            sg.e eVar2 = (sg.e) this.b;
                            sg.a aVar = eVar2.b;
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
                                    ((sg.e) this.b).E = false;
                                }
                                try {
                                    if (!sg.e.b((sg.e) this.b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        sg.e.c((sg.e) this.b, (currentTimeMillis2 - currentTimeMillis) / 1000.0f);
                                        if (!((sg.e) this.b).P) {
                                            ((sg.e) this.b).P = true;
                                            AndroidUtilities.runOnUIThread(((sg.e) this.b).Q);
                                            ((sg.e) this.b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (sg.e.b((sg.e) this.b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((sg.e) this.b).s; currentTimeMillis3 = System.currentTimeMillis()) {
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
                    ((sg.e) this.b).x = false;
                    return;
                }
        }
    }

    public k(sg.e eVar) {
        this.b = eVar;
    }
}
