// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class muc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wu b;

    public /* synthetic */ muc(wu wuVar, byte b) {
        this.a = b;
        this.b = wuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wu wuVar = this.b;
        switch (b) {
            case 0:
                wuVar.B0 = true;
                if (wuVar.getParent() != null) {
                    wuVar.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    wuVar.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                boolean z = wuVar.a0;
                vc vcVar = wuVar.c0;
                if (!z) {
                    vcVar.clearFocus();
                    gm.t1(vcVar);
                    break;
                } else {
                    vcVar.requestFocus();
                    gm.E3(vcVar);
                    break;
                }
        }
    }
}
