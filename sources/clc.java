// default package

import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class clc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ glc b;

    public /* synthetic */ clc(glc glcVar, byte b) {
        this.a = b;
        this.b = glcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        glc glcVar = this.b;
        switch (b) {
            case 0:
                if (glcVar.c == 3) {
                    if (glcVar.b.c()) {
                        gm.d3(this, 300L);
                        break;
                    } else {
                        glcVar.j("draft gone", true);
                        break;
                    }
                }
                break;
            case 1:
                float[] fArr = glcVar.V;
                if (glcVar.c == 4) {
                    if (glcVar.b.b(fArr)) {
                        float f = fArr[0];
                        float f2 = fArr[1];
                        boolean z = fArr[2] > 0.5f;
                        if (Math.abs(f - glcVar.P) > 5.0E-4f || Math.abs(f2 - glcVar.Q) > 5.0E-4f || z != glcVar.T) {
                            if (z && !glcVar.T) {
                                glcVar.R = glcVar.P;
                                glcVar.S = glcVar.Q;
                            }
                            if (z != glcVar.T) {
                                StringBuilder sb = new StringBuilder("field: trim ");
                                sb.append(z ? "drag" : "release");
                                sb.append(" l=");
                                sb.append(f);
                                sb.append(" r=");
                                sb.append(f2);
                                sb.append(" total=");
                                sb.append(glcVar.O);
                                sb.append(" frozen=");
                                sb.append(glcVar.e0 != null);
                                Log.d("VoiceLive", sb.toString());
                            }
                            glcVar.P = f;
                            glcVar.Q = f2;
                            glcVar.T = z;
                            glcVar.p();
                            if (!z) {
                                int i = 0;
                                for (boolean z2 : glcVar.i(glcVar.b(), glcVar.P, glcVar.Q)) {
                                    if (z2) {
                                        i++;
                                    }
                                }
                                StringBuilder l = hg9.l(i, "field: trim applied, ", " of ");
                                l.append(glcVar.b().size());
                                l.append(" words cut, text ");
                                l.append(glcVar.n.length());
                                l.append(" chars");
                                Log.d("VoiceLive", l.toString());
                            }
                        }
                    }
                    gm.d3(this, 50L);
                    break;
                }
                break;
            default:
                if (glcVar.c != 0) {
                    glcVar.t();
                    if (glcVar.c != 0) {
                        gm.d3(this, 250L);
                        break;
                    }
                }
                break;
        }
    }
}
