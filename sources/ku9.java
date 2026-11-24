// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ku9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu9 b;

    public /* synthetic */ ku9(qu9 qu9Var, byte b) {
        this.a = b;
        this.b = qu9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qu9 qu9Var = this.b;
        switch (b) {
            case 0:
                ku9 ku9Var = qu9Var.a0;
                if (qu9Var.x != null) {
                    qu9Var.b0 = r1.S() / qu9Var.x.U();
                    ou9 ou9Var = qu9Var.O;
                    if (ou9Var != null) {
                        ou9Var.Bc = (qu9Var.x.U() - qu9Var.x.S()) / 1000;
                        qu9Var.O.W3();
                        dv9 seekBarWaveform = qu9Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f = qu9Var.b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f;
                            gb2 gb2Var = seekBarWaveform.n;
                            if (gb2Var != null) {
                                gb2Var.invalidate();
                            }
                        }
                    }
                    if (qu9Var.x.c0()) {
                        gl.r(ku9Var);
                        gl.d3(ku9Var, 16L);
                        break;
                    }
                }
                break;
            case 1:
                qu9Var.c();
                break;
            case 2:
                qu9Var.b();
                break;
            default:
                if (qu9Var.d == null) {
                    gl.c3(new ku9(qu9Var, (byte) 2));
                    gb2 gb2Var2 = qu9Var.P;
                    if (gb2Var2 != null) {
                        gb2Var2.setVisibility(0);
                        qu9Var.P.invalidate();
                    }
                }
                MediaController.w().E0();
                break;
        }
    }
}
