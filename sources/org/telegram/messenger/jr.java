package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class jr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jr(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.a = i13;
        this.f = obj;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.e = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((yr) this.f).B1(this.b, this.c, this.d, this.e);
                break;
            case 1:
                org.telegram.ui.an.f0((org.telegram.ui.an) this.f, this.b, this.c, this.d, this.e);
                break;
            default:
                ((TextureViewRenderer) this.f).lambda$onFrameResolutionChanged$0(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
