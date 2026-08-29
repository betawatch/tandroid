package org.telegram.messenger;

import org.telegram.ui.tn;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class hf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.a = i14;
        this.f = obj;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesStorage) this.f).lambda$saveDiffParams$35(this.b, this.c, this.d, this.e);
                break;
            case 1:
                tn.r1((tn) this.f, this.b, this.c, this.d, this.e);
                break;
            default:
                ((TextureViewRenderer) this.f).lambda$onFrameResolutionChanged$0(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
