package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k3 implements View.OnClickListener {
    public final l.a a;
    public final /* synthetic */ l3 b;

    public k3(l3 l3Var) {
        this.b = l3Var;
        Context context = l3Var.a.getContext();
        CharSequence charSequence = l3Var.h;
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
        l3 l3Var = this.b;
        Window.Callback callback = l3Var.k;
        if (callback == null || !l3Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
