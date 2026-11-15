package ai;

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float[] b;
    public final /* synthetic */ android.support.v4.media.session.a0 c;
    public final /* synthetic */ ki.r1 d;
    public final /* synthetic */ boolean[] e;

    public /* synthetic */ m(float[] fArr, android.support.v4.media.session.a0 a0Var, ki.r1 r1Var, boolean[] zArr) {
        this.b = fArr;
        this.c = a0Var;
        this.d = r1Var;
        this.e = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final boolean[] zArr = this.e;
                final android.support.v4.media.session.a0 a0Var = this.c;
                final ki.r1 r1Var = this.d;
                final float[] fArr = this.b;
                t[] tVarArr = DictationAsr.a;
                if (!zArr[0]) {
                    DictationAsr.V((t) a0Var.b, new u() { // from class: ai.n
                        @Override // ai.u
                        public final void a(boolean z10) {
                            boolean[] zArr2 = zArr;
                            ki.r1 r1Var2 = r1Var;
                            float[] fArr2 = fArr;
                            android.support.v4.media.session.a0 a0Var2 = a0Var;
                            t[] tVarArr2 = DictationAsr.a;
                            if (zArr2[0]) {
                                return;
                            }
                            if (z10) {
                                new Thread(new m(fArr2, a0Var2, r1Var2, zArr2), "DictationAsrFile").start();
                            } else {
                                r1Var2.a(null, null, true);
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                DictationAsr.b(this.b, this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ m(boolean[] zArr, android.support.v4.media.session.a0 a0Var, ki.r1 r1Var, float[] fArr) {
        this.e = zArr;
        this.c = a0Var;
        this.d = r1Var;
        this.b = fArr;
    }
}
