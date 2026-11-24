// default package

import android.graphics.Point;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ccc implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ wm9 c;

    public ccc(wm9 wm9Var, View view) {
        this.c = wm9Var;
        zna znaVar = new zna((Object) view, (vk4) zna.p, 0.0f);
        wm9Var.c = znaVar;
        znaVar.m.a(1.0f);
        ((zna) wm9Var.c).m.b(350.0f);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Point point = gm.q;
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
        wm9 wm9Var = this.c;
        ((zna) wm9Var.c).d();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((zna) wm9Var.c).m.i = 0.0d;
        view.setTranslationY((i6 - i2) + 0.0f);
        ((zna) wm9Var.c).h();
    }
}
