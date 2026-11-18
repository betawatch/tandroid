package ji;

import android.util.Log;
import org.telegram.messenger.g0;
import ru.noties.jlatexmath.android.BuildConfig;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ i(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                if (mVar.c == 3) {
                    if (mVar.b.c()) {
                        g0.h3(this, 300L);
                        break;
                    } else {
                        mVar.g("draft gone", true);
                        break;
                    }
                }
                break;
            case 1:
                m mVar2 = this.b;
                float[] fArr = mVar2.V;
                if (mVar2.c == 4) {
                    if (mVar2.b.b(fArr)) {
                        float f10 = fArr[0];
                        float f11 = fArr[1];
                        boolean z10 = fArr[2] > 0.5f;
                        if (Math.abs(f10 - mVar2.P) > 5.0E-4f || Math.abs(f11 - mVar2.Q) > 5.0E-4f || z10 != mVar2.T) {
                            if (z10 && !mVar2.T) {
                                mVar2.R = mVar2.P;
                                mVar2.S = mVar2.Q;
                            }
                            if (z10 != mVar2.T) {
                                StringBuilder sb2 = new StringBuilder("field: trim ");
                                sb2.append(z10 ? "drag" : BuildConfig.BUILD_TYPE);
                                sb2.append(" l=");
                                sb2.append(f10);
                                sb2.append(" r=");
                                sb2.append(f11);
                                sb2.append(" total=");
                                sb2.append(mVar2.O);
                                sb2.append(" frozen=");
                                sb2.append(mVar2.e0 != null);
                                Log.d("VoiceLive", sb2.toString());
                            }
                            mVar2.P = f10;
                            mVar2.Q = f11;
                            mVar2.T = z10;
                            mVar2.p();
                            if (!z10) {
                                int i7 = 0;
                                for (boolean z11 : mVar2.f(mVar2.c(), mVar2.P, mVar2.Q)) {
                                    if (z11) {
                                        i7++;
                                    }
                                }
                                StringBuilder m10 = i5.c.m(i7, "field: trim applied, ", " of ");
                                m10.append(mVar2.c().size());
                                m10.append(" words cut, text ");
                                m10.append(mVar2.n.length());
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
                m mVar3 = this.b;
                if (mVar3.c != 0) {
                    mVar3.t();
                    if (mVar3.c != 0) {
                        g0.h3(this, 250L);
                        break;
                    }
                }
                break;
        }
    }
}
