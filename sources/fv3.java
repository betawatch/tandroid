// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
