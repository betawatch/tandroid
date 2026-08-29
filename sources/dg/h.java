package dg;

import m3.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h extends Thread {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar) {
        super("ExoPlayer:SimpleDecoder");
        this.b = mVar;
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
                                if (iVar2.A) {
                                    synchronized (iVar2) {
                                        if (iVar2.x) {
                                            aVar.onSurfaceCreated(iVar2.r, iVar2.n);
                                            aVar.onSurfaceChanged(iVar2.r, iVar2.w, iVar2.v);
                                        }
                                    }
                                    ((i) this.b).A = false;
                                }
                                try {
                                    if (!i.b((i) this.b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        i.c((i) this.b, (currentTimeMillis2 - currentTimeMillis) / 1000.0f);
                                        if (!((i) this.b).L) {
                                            ((i) this.b).L = true;
                                            AndroidUtilities.runOnUIThread(((i) this.b).M);
                                            ((i) this.b).M = null;
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
                    ((i) this.b).x = false;
                    return;
                }
            default:
                m.access$000((m) this.b);
                return;
        }
    }

    public h(i iVar) {
        this.b = iVar;
    }
}
