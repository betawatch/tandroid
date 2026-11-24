// default package

import android.graphics.Point;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bac implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ vk9 c;

    public bac(vk9 vk9Var, View view) {
        this.c = vk9Var;
        yla ylaVar = new yla((Object) view, (ri4) yla.p, 0.0f);
        vk9Var.c = ylaVar;
        ylaVar.m.a(1.0f);
        ((yla) vk9Var.c).m.b(350.0f);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Point point = gl.q;
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
        vk9 vk9Var = this.c;
        ((yla) vk9Var.c).d();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((yla) vk9Var.c).m.i = 0.0d;
        view.setTranslationY((i6 - i2) + 0.0f);
        ((yla) vk9Var.c).h();
    }
}
