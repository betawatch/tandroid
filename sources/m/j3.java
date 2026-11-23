package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class j3 implements View.OnClickListener {
    public final l.a a;
    public final /* synthetic */ k3 b;

    public j3(k3 k3Var) {
        this.b = k3Var;
        Context context = k3Var.a.getContext();
        CharSequence charSequence = k3Var.h;
        l.a aVar = new l.a();
        aVar.e = TLObject.FLAG_12;
        aVar.g = TLObject.FLAG_12;
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
        k3 k3Var = this.b;
        Window.Callback callback = k3Var.k;
        if (callback == null || !k3Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
