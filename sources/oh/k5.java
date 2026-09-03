package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class k5 extends m2.a {
    public final /* synthetic */ i9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ n5 e;

    public k5(Context context, n5 n5Var, i9 i9Var) {
        this.e = n5Var;
        this.c = i9Var;
        this.d = context;
    }

    @Override // m2.a
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
        this.e.D.remove(obj);
    }

    @Override // m2.a
    public final int b() {
        return this.e.C.size();
    }

    @Override // m2.a
    public final Object e(m2.h hVar, int i10) {
        n5 n5Var = this.e;
        j5 j5Var = new j5(this, this.c, this.d, n5Var.E, new ng.i(this, 2));
        j5Var.setTag(Integer.valueOf(i10));
        j5Var.setShadowDrawable(n5Var.s);
        j5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        j5Var.g(n5Var.y, (m5) n5Var.C.get(i10));
        j5Var.setListBottomPadding(n5Var.d);
        hVar.addView(j5Var);
        n5Var.D.add(j5Var);
        return j5Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
