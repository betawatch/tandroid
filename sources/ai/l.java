package ai;

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ki.r1 c;

    public /* synthetic */ l(boolean[] zArr, ki.r1 r1Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                ki.r1 r1Var = this.c;
                s[] sVarArr = DictationAsr.a;
                if (!zArr[0]) {
                    r1Var.a(null, null, true);
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                ki.r1 r1Var2 = this.c;
                s[] sVarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    r1Var2.a(null, null, true);
                    break;
                }
                break;
        }
    }
}
