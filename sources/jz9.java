// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jz9 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new jz9());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        kz9 kz9Var = (kz9) view;
        kz9Var.setUser((TLRPC.User) c4cVar.H);
        kz9Var.c(c4cVar.e, false);
        kz9Var.setDivider(z);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new kz9(context, true, false, wjbVar, false);
    }
}
