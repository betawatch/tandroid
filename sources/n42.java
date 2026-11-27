// default package

import android.location.Location;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class n42 implements pt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s42 b;

    public /* synthetic */ n42(s42 s42Var, byte b) {
        this.a = b;
        this.b = s42Var;
    }

    @Override // pt2
    public final void accept(Object obj) {
        byte b = this.a;
        s42 s42Var = this.b;
        switch (b) {
            case 0:
                s42Var.S((x05) obj);
                break;
            default:
                s42Var.Z((Location) obj);
                break;
        }
    }
}
