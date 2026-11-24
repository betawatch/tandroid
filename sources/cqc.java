// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class cqc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mqc b;

    public /* synthetic */ cqc(mqc mqcVar, byte b) {
        this.a = b;
        this.b = mqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqc j;
        byte b = this.a;
        mqc mqcVar = this.b;
        switch (b) {
            case 0:
                if (mqcVar.r0 && mqcVar.h0 != null) {
                    mqcVar.r0 = false;
                    mqcVar.q0 = true;
                    mqcVar.removeCallbacks(mqcVar.C1);
                    ((nc6) mqcVar.d.b).X();
                    mqcVar.getParent().requestDisallowInterceptTouchEvent(true);
                    mqcVar.performHapticFeedback(4);
                    aqc j2 = mqcVar.j(mqcVar.h0);
                    if (j2 != null) {
                        j2.o();
                        j2.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    mqcVar.f0();
                    break;
                }
                break;
            case 1:
                mqcVar.t0 = false;
                mqcVar.h0 = null;
                mqcVar.f0();
                break;
            case 2:
                mqcVar.Q();
                break;
            default:
                lqc lqcVar = mqcVar.h0;
                if (lqcVar != null && !mqcVar.n0) {
                    if (!mqcVar.v0) {
                        if (mqcVar.q0 && (j = mqcVar.j(lqcVar)) != null) {
                            mqcVar.S(j);
                            break;
                        }
                    } else {
                        mqcVar.o0 = true;
                        mqcVar.i0 = lqcVar;
                        mqcVar.C0 = Float.NaN;
                        mqcVar.F0 = Float.NaN;
                        mqcVar.D0 = 0.0f;
                        mqcVar.M0 = false;
                        mqcVar.E0 = lqcVar.i.b;
                        lqcVar.q.a(0.0f);
                        lqc lqcVar2 = mqcVar.h0;
                        kqc kqcVar = lqcVar2.l;
                        kqcVar.d = 260.0f;
                        kqcVar.e = 0.58f;
                        kqcVar.b = 1.0f;
                        long j3 = mqcVar.O0 + 1;
                        mqcVar.O0 = j3;
                        lqcVar2.I = j3;
                        mm mmVar = lqcVar2.c;
                        mmVar.v0 = true;
                        mmVar.w0(false);
                        mqcVar.performHapticFeedback(0);
                        mqcVar.f0();
                        break;
                    }
                }
                break;
        }
    }
}
