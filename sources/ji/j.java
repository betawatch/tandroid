package ji;

import android.util.Log;
import org.telegram.messenger.g0;
import ru.noties.jlatexmath.android.BuildConfig;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ j(o oVar, int i7) {
        this.a = i7;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o oVar = this.b;
                if (oVar.c == 3) {
                    if (oVar.b.c()) {
                        g0.h3(this, 300L);
                        break;
                    } else {
                        oVar.g("draft gone", true);
                        break;
                    }
                }
                break;
            case 1:
                o oVar2 = this.b;
                float[] fArr = oVar2.V;
                if (oVar2.c == 4) {
                    if (oVar2.b.b(fArr)) {
                        float f10 = fArr[0];
                        float f11 = fArr[1];
                        boolean z10 = fArr[2] > 0.5f;
                        if (Math.abs(f10 - oVar2.P) > 5.0E-4f || Math.abs(f11 - oVar2.Q) > 5.0E-4f || z10 != oVar2.T) {
                            if (z10 && !oVar2.T) {
                                oVar2.R = oVar2.P;
                                oVar2.S = oVar2.Q;
                            }
                            if (z10 != oVar2.T) {
                                StringBuilder sb2 = new StringBuilder("field: trim ");
                                sb2.append(z10 ? "drag" : BuildConfig.BUILD_TYPE);
                                sb2.append(" l=");
                                sb2.append(f10);
                                sb2.append(" r=");
                                sb2.append(f11);
                                sb2.append(" total=");
                                sb2.append(oVar2.O);
                                sb2.append(" frozen=");
                                sb2.append(oVar2.e0 != null);
                                Log.d("VoiceLive", sb2.toString());
                            }
                            oVar2.P = f10;
                            oVar2.Q = f11;
                            oVar2.T = z10;
                            oVar2.o();
                            if (!z10) {
                                int i7 = 0;
                                for (boolean z11 : oVar2.f(oVar2.c(), oVar2.P, oVar2.Q)) {
                                    if (z11) {
                                        i7++;
                                    }
                                }
                                StringBuilder m10 = i5.c.m(i7, "field: trim applied, ", " of ");
                                m10.append(oVar2.c().size());
                                m10.append(" words cut, text ");
                                m10.append(oVar2.n.length());
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
                o oVar3 = this.b;
                if (oVar3.c != 0) {
                    oVar3.s();
                    if (oVar3.c != 0) {
                        g0.h3(this, 250L);
                        break;
                    }
                }
                break;
        }
    }
}
