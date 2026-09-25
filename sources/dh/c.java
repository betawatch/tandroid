package dh;

import b2.z0;
import e2.h;
import e2.m;
import m4.e1;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements d, m, h {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((e1) obj).M(this.b, this.c);
                break;
            default:
                ((e1) obj).q0(this.b, this.c);
                break;
        }
    }

    @Override // dh.d
    public int g(d6 d6Var, boolean z10) {
        return z10 ? this.b : this.c;
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
        }
    }
}
