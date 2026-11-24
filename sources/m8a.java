// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m8a extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new m8a());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        Object obj = c4cVar.H;
        if (obj instanceof so8) {
            so8 so8Var = (so8) obj;
            ((o8a) view).b(c4cVar.m, so8Var.d, so8Var.e, z);
        } else if (obj instanceof aa7) {
            ((o8a) view).a(c4cVar.m, ((aa7) obj).b, true, z);
        }
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new o8a(context);
    }
}
