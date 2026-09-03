package fg;

import n3.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h extends Thread {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.b = lVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                iVar.x = true;
                try {
                    i.a(iVar);
                    int glGetError = ((i) this.b).r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((i) this.b).x) {
                        while (true) {
                            i iVar2 = (i) this.b;
                            a aVar = iVar2.b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (iVar2.B) {
                                    synchronized (iVar2) {
                                        if (iVar2.x) {
                                            aVar.onSurfaceCreated(iVar2.r, iVar2.n);
                                            aVar.onSurfaceChanged(iVar2.r, iVar2.w, iVar2.v);
                                        }
                                    }
                                    ((i) this.b).B = false;
                                }
                                try {
                                    if (!i.b((i) this.b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        i.c((i) this.b, (currentTimeMillis2 - currentTimeMillis) / 1000.0f);
                                        if (!((i) this.b).M) {
                                            ((i) this.b).M = true;
                                            AndroidUtilities.runOnUIThread(((i) this.b).N);
                                            ((i) this.b).N = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (i.b((i) this.b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((i) this.b).s; currentTimeMillis3 = System.currentTimeMillis()) {
                                            }
                                        }
                                    } catch (InterruptedException unused2) {
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    ((i) this.b).x = false;
                    return;
                }
            default:
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                } while (((l) this.b).i());
                return;
        }
    }

    public h(i iVar) {
        this.b = iVar;
    }
}
