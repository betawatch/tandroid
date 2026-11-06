package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class l3 implements View.OnClickListener {
    public final l.a a;
    public final /* synthetic */ m3 b;

    public l3(m3 m3Var) {
        this.b = m3Var;
        Context context = m3Var.a.getContext();
        CharSequence charSequence = m3Var.h;
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
        m3 m3Var = this.b;
        Window.Callback callback = m3Var.k;
        if (callback == null || !m3Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
