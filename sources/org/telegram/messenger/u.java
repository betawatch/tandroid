package org.telegram.messenger;

import java.io.File;
import org.telegram.messenger.AudioRecorderV2Controller;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioRecorderV2Controller.2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ AudioRecorderV2Controller.Listener d;
    public final /* synthetic */ File e;

    public /* synthetic */ u(AudioRecorderV2Controller.2 r12, long j10, AudioRecorderV2Controller.Listener listener, File file, int i10) {
        this.a = i10;
        this.b = r12;
        this.c = j10;
        this.d = listener;
        this.e = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onOutputInvalidated$1(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$onOutputStarted$0(this.c, this.d, this.e);
                break;
        }
    }
}
