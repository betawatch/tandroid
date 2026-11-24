// default package

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cn3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gn3 b;

    public /* synthetic */ cn3(gn3 gn3Var, byte b) {
        this.a = b;
        this.b = gn3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gn3 gn3Var = this.b;
        switch (b) {
            case 0:
                DictationAsr.H(gn3Var);
                break;
            default:
                DictationAsr.H(gn3Var);
                break;
        }
    }
}
