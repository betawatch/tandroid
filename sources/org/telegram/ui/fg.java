package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ fg(wn wnVar, long j10, boolean z10) {
        this.b = wnVar;
        this.d = j10;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn.u0(this.b, this.d, this.c);
                break;
            default:
                jk jkVar = this.b.Y;
                if (jkVar != null) {
                    MediaController mediaController = MediaController.getInstance();
                    if (!jkVar.Y1 && !jkVar.F2 && mediaController.isRecordingAudio() && !mediaController.isRecordingPaused() && mediaController.getRecordingGuid() == jkVar.G2) {
                        jkVar.c1 = false;
                        org.telegram.ui.Components.ve veVar = jkVar.b1;
                        if (veVar != null) {
                            veVar.j(org.telegram.ui.Components.yg.a, false);
                        }
                        jkVar.F2 = true;
                        jkVar.I1(0, true);
                        if (this.c) {
                            jkVar.O = true;
                            org.telegram.ui.Components.sg sgVar = jkVar.O1;
                            if (sgVar != null) {
                                sgVar.y.d(1, true, false);
                            }
                            MediaDataController mediaDataController = MediaDataController.getInstance(jkVar.Q);
                            long j10 = jkVar.Q2;
                            wn wnVar = jkVar.P2;
                            mediaDataController.toggleDraftVoiceOnce(j10, (wnVar == null || !wnVar.t4) ? 0L : wnVar.b(), true);
                        }
                        long j11 = this.d;
                        long currentTimeMillis = j11 > 0 ? System.currentTimeMillis() - j11 : mediaController.recordTimeCount;
                        jkVar.i1 = currentTimeMillis;
                        org.telegram.ui.Components.xg xgVar = jkVar.Y0;
                        if (xgVar != null) {
                            xgVar.a(currentTimeMillis);
                        }
                        jkVar.s4 = true;
                        jkVar.u1();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ fg(wn wnVar, boolean z10, long j10) {
        this.b = wnVar;
        this.c = z10;
        this.d = j10;
    }
}
