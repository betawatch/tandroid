// default package

import android.graphics.Point;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bec implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ ko9 c;

    public bec(ko9 ko9Var, View view) {
        this.c = ko9Var;
        vpa vpaVar = new vpa((Object) view, (vk4) vpa.p, 0.0f);
        ko9Var.c = vpaVar;
        vpaVar.m.a(1.0f);
        ((vpa) ko9Var.c).m.b(350.0f);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Point point = hl.q;
        boolean z = point.x > point.y;
        Boolean bool = this.a;
        if (bool == null || bool.booleanValue() != z) {
            this.a = Boolean.valueOf(z);
            this.b = true;
        }
        if (i6 == 0 || i6 == i2 || this.b) {
            this.b = false;
            return;
        }
        ko9 ko9Var = this.c;
        ((vpa) ko9Var.c).d();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((vpa) ko9Var.c).m.i = 0.0d;
        view.setTranslationY((i6 - i2) + 0.0f);
        ((vpa) ko9Var.c).h();
    }
}
