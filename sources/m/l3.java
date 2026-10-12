package m;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class l3 implements View.OnClickListener {
    public final l.a a;
    public final /* synthetic */ m3 b;

    public l3(m3 m3Var) {
        this.b = m3Var;
        Context context = m3Var.a.getContext();
        CharSequence charSequence = m3Var.h;
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
        m3 m3Var = this.b;
        Window.Callback callback = m3Var.k;
        if (callback == null || !m3Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
