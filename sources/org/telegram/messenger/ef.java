package org.telegram.messenger;

import org.telegram.ui.co;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ef implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
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
                co.r1((co) this.f, this.b, this.c, this.d, this.e);
                break;
            default:
                ((TextureViewRenderer) this.f).lambda$onFrameResolutionChanged$0(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
