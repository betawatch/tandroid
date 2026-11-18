package hi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja b;

    public /* synthetic */ o(ja jaVar, int i7) {
        this.a = i7;
        this.b = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                ja jaVar = this.b;
                jaVar.K0 = false;
                jaVar.L0 = TLObject.FLAG_31;
                jaVar.invalidate();
                jaVar.S0.setVisibility(0);
                jaVar.T0.setVisibility(0);
                break;
            default:
                ta taVar = this.b.S1;
                ha haVar = taVar.Y0;
                if (haVar != null) {
                    haVar.P = false;
                    haVar.c();
                    ha haVar2 = taVar.Y0;
                    haVar2.m(0L);
                    db dbVar = haVar2.G;
                    if (dbVar != null) {
                        dbVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
