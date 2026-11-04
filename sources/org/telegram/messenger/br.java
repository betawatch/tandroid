package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class br implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ br(Object obj, int i3, int i10, int i11, int i12, int i13) {
        this.a = i13;
        this.f = obj;
        this.b = i3;
        this.c = i10;
        this.d = i11;
        this.e = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((qr) this.f).B1(this.b, this.c, this.d, this.e);
                break;
            case 1:
                org.telegram.ui.wm.f0((org.telegram.ui.wm) this.f, this.b, this.c, this.d, this.e);
                break;
            default:
                ((TextureViewRenderer) this.f).lambda$onFrameResolutionChanged$0(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
