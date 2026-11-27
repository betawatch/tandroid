// default package

import android.location.Location;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
