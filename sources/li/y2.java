package li;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ y2(v3 v3Var, a aVar, int i10) {
        this.a = i10;
        this.b = v3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View F1 = this.b.F1(this.c);
                if (F1 instanceof d6) {
                    d6 d6Var = (d6) F1;
                    d6Var.A();
                    d6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                this.b.j3(this.c);
                break;
            case 2:
                this.b.j3(this.c);
                break;
            case 3:
                this.b.k3(this.c);
                break;
            case 4:
                this.b.j3(this.c);
                break;
            default:
                this.b.j3(this.c);
                break;
        }
    }
}
