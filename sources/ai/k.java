package ai;

import android.util.Log;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float[] b;
    public final /* synthetic */ android.support.v4.media.session.a0 c;
    public final /* synthetic */ ii.h d;
    public final /* synthetic */ boolean[] e;

    public /* synthetic */ k(float[] fArr, android.support.v4.media.session.a0 a0Var, ii.h hVar, boolean[] zArr) {
        this.b = fArr;
        this.c = a0Var;
        this.d = hVar;
        this.e = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final boolean[] zArr = this.e;
                final android.support.v4.media.session.a0 a0Var = this.c;
                final ii.h hVar = this.d;
                final float[] fArr = this.b;
                t[] tVarArr = DictationAsr.a;
                if (!zArr[0]) {
                    DictationAsr.Y((t) a0Var.b, new u() { // from class: ai.m
                        @Override // ai.u
                        public final void a(boolean z10) {
                            boolean[] zArr2 = zArr;
                            ii.h hVar2 = hVar;
                            float[] fArr2 = fArr;
                            android.support.v4.media.session.a0 a0Var2 = a0Var;
                            t[] tVarArr2 = DictationAsr.a;
                            if (zArr2[0]) {
                                return;
                            }
                            if (z10) {
                                new Thread(new k(fArr2, a0Var2, hVar2, zArr2), "DictationAsrFile").start();
                            } else {
                                hVar2.a(null, null, true);
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                float[] fArr2 = this.b;
                android.support.v4.media.session.a0 a0Var2 = this.c;
                ii.h hVar2 = this.d;
                boolean[] zArr2 = this.e;
                try {
                    DictationAsr.V(fArr2, a0Var2, hVar2, zArr2);
                    break;
                } catch (Throwable th2) {
                    Log.e("Dictation", "tinyasr: transcription failed", th2);
                    org.telegram.messenger.g0.g3(new i(zArr2, hVar2, 2));
                }
        }
    }

    public /* synthetic */ k(boolean[] zArr, android.support.v4.media.session.a0 a0Var, ii.h hVar, float[] fArr) {
        this.e = zArr;
        this.c = a0Var;
        this.d = hVar;
        this.b = fArr;
    }
}
