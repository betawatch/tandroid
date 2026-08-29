package j3;

import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements f5.j, og.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ z(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
    }

    @Override // og.c
    public int f(c6 c6Var, boolean z10) {
        return z10 ? this.b : this.c;
    }

    @Override // f5.j
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((a2) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
            default:
                ((a2) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
        }
    }
}
