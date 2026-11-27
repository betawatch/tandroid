// default package

import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class do1 implements qcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ do1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // qcc
    public final Object a(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj3;
                View view = (View) obj2;
                zu1Var.m6((URLSpan) obj, false, zu1Var.v5, view instanceof wb2 ? (wb2) view : null);
                return Boolean.TRUE;
            default:
                return ch8.d((View) obj, (String) obj3, (String) obj2, null, null);
        }
    }
}
