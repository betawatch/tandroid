package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.y61;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class j1 extends y61 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ j2 c;

    public j1(j2 j2Var, boolean z10, Context context) {
        this.c = j2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.y61
    public final void b(View view, int i7, int i10) {
        v1 v1Var = (v1) view;
        if (this.a) {
            i7 = 1;
        }
        v1Var.a(i7);
    }

    @Override // org.telegram.ui.Components.y61
    public final View d(int i7) {
        Context context = this.b;
        j2 j2Var = this.c;
        return i7 == 1 ? new u1(j2Var, context) : new z1(j2Var, context);
    }

    @Override // org.telegram.ui.Components.y61
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.y61
    public final int h(int i7) {
        return (i7 == 0 || i7 == 1) ? 0 : 1;
    }
}
