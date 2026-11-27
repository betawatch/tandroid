// default package

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class km3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm3 b;

    public /* synthetic */ km3(nm3 nm3Var, byte b) {
        this.a = b;
        this.b = nm3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nm3 nm3Var = this.b;
        switch (b) {
            case 0:
                DictationAsr.J(nm3Var);
                break;
            default:
                DictationAsr.J(nm3Var);
                break;
        }
    }
}
