package org.telegram.messenger;

import java.io.File;
import org.telegram.messenger.AudioRecorderV2Controller;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioRecorderV2Controller.2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ AudioRecorderV2Controller.Listener d;
    public final /* synthetic */ File e;

    public /* synthetic */ q(AudioRecorderV2Controller.2 r12, long j10, AudioRecorderV2Controller.Listener listener, File file, int i10) {
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
