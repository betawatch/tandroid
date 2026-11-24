// default package

import android.util.Log;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class cjc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gjc b;

    public /* synthetic */ cjc(gjc gjcVar, byte b) {
        this.a = b;
        this.b = gjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gjc gjcVar = this.b;
        switch (b) {
            case 0:
                if (gjcVar.c == 3) {
                    if (gjcVar.b.c()) {
                        gl.d3(this, 300L);
                        break;
                    } else {
                        gjcVar.j("draft gone", true);
                        break;
                    }
                }
                break;
            case 1:
                float[] fArr = gjcVar.V;
                if (gjcVar.c == 4) {
                    if (gjcVar.b.b(fArr)) {
                        float f = fArr[0];
                        float f2 = fArr[1];
                        boolean z = fArr[2] > 0.5f;
                        if (Math.abs(f - gjcVar.P) > 5.0E-4f || Math.abs(f2 - gjcVar.Q) > 5.0E-4f || z != gjcVar.T) {
                            if (z && !gjcVar.T) {
                                gjcVar.R = gjcVar.P;
                                gjcVar.S = gjcVar.Q;
                            }
                            if (z != gjcVar.T) {
                                StringBuilder sb = new StringBuilder("field: trim ");
                                sb.append(z ? "drag" : "release");
                                sb.append(" l=");
                                sb.append(f);
                                sb.append(" r=");
                                sb.append(f2);
                                sb.append(" total=");
                                sb.append(gjcVar.O);
                                sb.append(" frozen=");
                                sb.append(gjcVar.e0 != null);
                                Log.d("VoiceLive", sb.toString());
                            }
                            gjcVar.P = f;
                            gjcVar.Q = f2;
                            gjcVar.T = z;
                            gjcVar.p();
                            if (!z) {
                                int i = 0;
                                for (boolean z2 : gjcVar.i(gjcVar.b(), gjcVar.P, gjcVar.Q)) {
                                    if (z2) {
                                        i++;
                                    }
                                }
                                StringBuilder m = de9.m(i, "field: trim applied, ", " of ");
                                m.append(gjcVar.b().size());
                                m.append(" words cut, text ");
                                m.append(gjcVar.n.length());
                                m.append(" chars");
                                Log.d("VoiceLive", m.toString());
                            }
                        }
                    }
                    gl.d3(this, 50L);
                    break;
                }
                break;
            default:
                if (gjcVar.c != 0) {
                    gjcVar.t();
                    if (gjcVar.c != 0) {
                        gl.d3(this, 250L);
                        break;
                    }
                }
                break;
        }
    }
}
