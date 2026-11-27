// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class dda implements qs3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ fn7 c;
    public final /* synthetic */ View d;

    public /* synthetic */ dda(fn7 fn7Var, View view, int[] iArr, byte b) {
        this.a = b;
        this.c = fn7Var;
        this.d = view;
        this.b = iArr;
    }

    @Override // qs3
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        int[] iArr = this.b;
        View view = this.d;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                ((kea) fn7Var).L0((nea) view, iArr, f / 1000.0f);
                break;
            default:
                ((tda) fn7Var).d.L0(view, iArr, f / 1000.0f);
                break;
        }
    }
}
