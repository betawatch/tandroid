package ai;

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ j(int i7, boolean[] zArr) {
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
