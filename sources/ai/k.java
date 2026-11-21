package ai;

import android.util.Log;
import java.util.HashMap;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float[] b;
    public final /* synthetic */ android.support.v4.media.session.a0 c;
    public final /* synthetic */ h21 d;
    public final /* synthetic */ boolean[] e;

    public /* synthetic */ k(float[] fArr, android.support.v4.media.session.a0 a0Var, h21 h21Var, boolean[] zArr) {
        this.b = fArr;
        this.c = a0Var;
        this.d = h21Var;
        this.e = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final boolean[] zArr = this.e;
                final android.support.v4.media.session.a0 a0Var = this.c;
                final h21 h21Var = this.d;
                final float[] fArr = this.b;
                t[] tVarArr = DictationAsr.a;
                if (!zArr[0]) {
                    DictationAsr.f0((t) a0Var.b, new u() { // from class: ai.m
                        @Override // ai.u
                        public final void a(boolean z10) {
                            boolean[] zArr2 = zArr;
                            android.support.v4.media.session.a0 a0Var2 = a0Var;
                            h21 h21Var2 = h21Var;
                            float[] fArr2 = fArr;
                            t[] tVarArr2 = DictationAsr.a;
                            if (zArr2[0]) {
                                return;
                            }
                            if (z10) {
                                new Thread(new k(fArr2, a0Var2, h21Var2, zArr2), "DictationAsrFile").start();
                                return;
                            }
                            t tVar = (t) a0Var2.b;
                            if (tVar == null || tVar.f != 0 || DictationAsr.y(tVar) || l1.b()) {
                                h21Var2.a(null, null, true);
                                return;
                            }
                            HashMap hashMap = j21.S;
                            Integer num = h21Var2.a;
                            hashMap.remove(num);
                            j21.R.remove(num);
                            j21.n(h21Var2.b);
                        }
                    });
                    break;
                }
                break;
            default:
                float[] fArr2 = this.b;
                android.support.v4.media.session.a0 a0Var2 = this.c;
                h21 h21Var2 = this.d;
                boolean[] zArr2 = this.e;
                try {
                    DictationAsr.b0(fArr2, a0Var2, h21Var2, zArr2);
                    break;
                } catch (Throwable th2) {
                    Log.e("Dictation", "tinyasr: transcription failed", th2);
                    org.telegram.messenger.g0.g3(new j(zArr2, h21Var2, 1));
                }
        }
    }

    public /* synthetic */ k(boolean[] zArr, android.support.v4.media.session.a0 a0Var, h21 h21Var, float[] fArr) {
        this.e = zArr;
        this.c = a0Var;
        this.d = h21Var;
        this.b = fArr;
    }
}
