// default package

import android.util.Log;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class onc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ snc b;

    public /* synthetic */ onc(snc sncVar, byte b) {
        this.a = b;
        this.b = sncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        snc sncVar = this.b;
        switch (b) {
            case 0:
                if (sncVar.c == 3) {
                    if (sncVar.b.c()) {
                        hl.d3(this, 300L);
                        break;
                    } else {
                        sncVar.k("draft gone", true);
                        break;
                    }
                }
                break;
            case 1:
                float[] fArr = sncVar.W;
                if (sncVar.c == 4) {
                    if (sncVar.b.b(fArr)) {
                        float f = fArr[0];
                        float f2 = fArr[1];
                        boolean z = fArr[2] > 0.5f;
                        if (Math.abs(f - sncVar.Q) > 5.0E-4f || Math.abs(f2 - sncVar.R) > 5.0E-4f || z != sncVar.U) {
                            if (z && !sncVar.U) {
                                sncVar.S = sncVar.Q;
                                sncVar.T = sncVar.R;
                            }
                            if (z != sncVar.U) {
                                StringBuilder sb = new StringBuilder("field: trim ");
                                sb.append(z ? "drag" : "release");
                                sb.append(" l=");
                                sb.append(f);
                                sb.append(" r=");
                                sb.append(f2);
                                sb.append(" total=");
                                sb.append(sncVar.P);
                                sb.append(" frozen=");
                                sb.append(sncVar.g0 != null);
                                Log.d("VoiceLive", sb.toString());
                            }
                            sncVar.Q = f;
                            sncVar.R = f2;
                            sncVar.U = z;
                            sncVar.q();
                            if (!z) {
                                int i = 0;
                                for (boolean z2 : sncVar.j(sncVar.b(), sncVar.Q, sncVar.R)) {
                                    if (z2) {
                                        i++;
                                    }
                                }
                                StringBuilder m = uh9.m(i, "field: trim applied, ", " of ");
                                m.append(sncVar.b().size());
                                m.append(" words cut, text ");
                                m.append(sncVar.n.length());
                                m.append(" chars");
                                Log.d("VoiceLive", m.toString());
                            }
                        }
                    }
                    hl.d3(this, 50L);
                    break;
                }
                break;
            default:
                if (sncVar.c != 0) {
                    sncVar.u();
                    if (sncVar.c != 0) {
                        hl.d3(this, 250L);
                        break;
                    }
                }
                break;
        }
    }
}
