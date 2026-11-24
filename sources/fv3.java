// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fv3 extends kse {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ fv3(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // kse
    public final void a() {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                ((jv3) viewGroup).j3 = false;
                break;
            case 1:
                ((ew8) viewGroup).w = false;
                break;
            default:
                ((tx9) viewGroup).y1 = false;
                break;
        }
    }

    @Override // kse
    public final void b() {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                ((jv3) viewGroup).j3 = true;
                break;
            case 2:
                ((tx9) viewGroup).y1 = true;
                break;
        }
    }
}
