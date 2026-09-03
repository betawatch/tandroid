package m;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
