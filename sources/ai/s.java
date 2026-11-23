package ai;

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ s(int i7, boolean[] zArr) {
        this.a = i7;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                t[] tVarArr = DictationAsr.a;
                zArr[0] = true;
                break;
            default:
                this.b[0] = true;
                break;
        }
    }
}
