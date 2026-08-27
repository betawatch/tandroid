package bg;

import k3.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                    return;
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
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
