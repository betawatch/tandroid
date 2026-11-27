// default package

import android.graphics.Path;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class au5 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ au5(View view, float f, float f2, byte b) {
        this.a = b;
        this.d = view;
        this.b = f;
        this.c = f2;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        float f = this.c;
        float f2 = this.b;
        View view = this.d;
        switch (b) {
            case 0:
                ((bu5) view).y.addPath((Path) obj, f2, f);
                break;
            default:
                ((jja) view).n(f2, f);
                break;
        }
    }
}
