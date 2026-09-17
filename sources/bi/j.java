package bi;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ j(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                u uVar = (u) ((View) obj);
                uVar.invalidate();
                uVar.y.setTextColor(this.b);
                break;
            case 1:
                ((m4.j1) obj).f0(this.b);
                break;
            case 2:
                ((m4.j1) obj).N(this.b);
                break;
            case 3:
                ((m4.j1) obj).j(this.b);
                break;
            default:
                ((m4.j1) obj).D0(this.b);
                break;
        }
    }
}
