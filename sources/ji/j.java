package ji;

import android.util.Log;
import org.telegram.messenger.g0;
import ru.noties.jlatexmath.android.BuildConfig;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ j(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                if (nVar.c == 3) {
                    if (nVar.b.c()) {
                        g0.h3(this, 300L);
                        break;
                    } else {
                        nVar.h("draft gone", true);
                        break;
                    }
                }
                break;
            case 1:
                n nVar2 = this.b;
                float[] fArr = nVar2.V;
                if (nVar2.c == 4) {
                    if (nVar2.b.b(fArr)) {
                        float f10 = fArr[0];
                        float f11 = fArr[1];
                        boolean z10 = fArr[2] > 0.5f;
                        if (Math.abs(f10 - nVar2.P) > 5.0E-4f || Math.abs(f11 - nVar2.Q) > 5.0E-4f || z10 != nVar2.T) {
                            if (z10 && !nVar2.T) {
                                nVar2.R = nVar2.P;
                                nVar2.S = nVar2.Q;
                            }
                            if (z10 != nVar2.T) {
                                StringBuilder sb2 = new StringBuilder("field: trim ");
                                sb2.append(z10 ? "drag" : BuildConfig.BUILD_TYPE);
                                sb2.append(" l=");
                                sb2.append(f10);
                                sb2.append(" r=");
                                sb2.append(f11);
                                sb2.append(" total=");
                                sb2.append(nVar2.O);
                                sb2.append(" frozen=");
                                sb2.append(nVar2.e0 != null);
                                Log.d("VoiceLive", sb2.toString());
                            }
                            nVar2.P = f10;
                            nVar2.Q = f11;
                            nVar2.T = z10;
                            nVar2.m();
                            if (!z10) {
                                int i7 = 0;
                                for (boolean z11 : nVar2.g(nVar2.c(), nVar2.P, nVar2.Q)) {
                                    if (z11) {
                                        i7++;
                                    }
                                }
                                StringBuilder m10 = i5.c.m(i7, "field: trim applied, ", " of ");
                                m10.append(nVar2.c().size());
                                m10.append(" words cut, text ");
                                m10.append(nVar2.n.length());
                                m10.append(" chars");
                                Log.d("VoiceLive", m10.toString());
                            }
                        }
                    }
                    g0.h3(this, 50L);
                    break;
                }
                break;
            default:
                n nVar3 = this.b;
                if (nVar3.c != 0) {
                    nVar3.q();
                    if (nVar3.c != 0) {
                        g0.h3(this, 250L);
                        break;
                    }
                }
                break;
        }
    }
}
