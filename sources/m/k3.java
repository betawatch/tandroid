package m;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k3 implements View.OnClickListener {
    public final l.a a;
    public final /* synthetic */ l3 b;

    public k3(l3 l3Var) {
        this.b = l3Var;
        Context context = l3Var.a.getContext();
        CharSequence charSequence = l3Var.h;
        l.a aVar = new l.a();
        aVar.e = 4096;
        aVar.g = 4096;
        aVar.l = null;
        aVar.m = null;
        aVar.n = false;
        aVar.o = false;
        aVar.p = 16;
        aVar.i = context;
        aVar.a = charSequence;
        this.a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l3 l3Var = this.b;
        Window.Callback callback = l3Var.k;
        if (callback == null || !l3Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
