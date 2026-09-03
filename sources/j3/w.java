package j3;

import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements h5.j, qg.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ w(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
    }

    @Override // qg.c
    public int f(f6 f6Var, boolean z4) {
        return z4 ? this.b : this.c;
    }

    @Override // h5.j
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((y1) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
            default:
                ((y1) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
        }
    }
}
