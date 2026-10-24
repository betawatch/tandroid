package m;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class n3 implements View.OnClickListener {
    public final l.a a;
    public final /* synthetic */ o3 b;

    public n3(o3 o3Var) {
        this.b = o3Var;
        Context context = o3Var.a.getContext();
        CharSequence charSequence = o3Var.h;
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
        o3 o3Var = this.b;
        Window.Callback callback = o3Var.k;
        if (callback == null || !o3Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
