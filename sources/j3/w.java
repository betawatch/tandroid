package j3;

import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements h5.j, rg.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ w(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
    }

    @Override // rg.c
    public int g(g6 g6Var, boolean z4) {
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
