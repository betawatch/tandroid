package ai;

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ i(int i7, boolean[] zArr) {
        this.a = i7;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                q[] qVarArr = DictationAsr.a;
                zArr[0] = true;
                break;
            case 1:
                boolean[] zArr2 = this.b;
                q[] qVarArr2 = DictationAsr.a;
                zArr2[0] = true;
                break;
            default:
                this.b[0] = true;
                break;
        }
    }
}
