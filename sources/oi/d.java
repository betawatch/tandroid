package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements RequestTimeDelegate {
    public final /* synthetic */ f a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(f fVar, e eVar) {
        this.a = fVar;
        this.b = eVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.a, this.b, j3, 9));
    }
}
