package m;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o3 implements View.OnClickListener {
    public final l.a a;
    public final /* synthetic */ p3 b;

    public o3(p3 p3Var) {
        this.b = p3Var;
        Context context = p3Var.a.getContext();
        CharSequence charSequence = p3Var.h;
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
        p3 p3Var = this.b;
        Window.Callback callback = p3Var.k;
        if (callback == null || !p3Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
