package m;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m3 implements View.OnClickListener {
    public final l.a a;
    public final /* synthetic */ n3 b;

    public m3(n3 n3Var) {
        this.b = n3Var;
        Context context = n3Var.a.getContext();
        CharSequence charSequence = n3Var.h;
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
        n3 n3Var = this.b;
        Window.Callback callback = n3Var.k;
        if (callback == null || !n3Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
