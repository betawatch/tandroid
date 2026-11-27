// default package

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jp1 extends vu7 {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ r47 g;
    public final /* synthetic */ c39 h;
    public final /* synthetic */ r47 i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ fic l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ zu1 p;

    public jp1(zu1 zu1Var, int i, SparseArray sparseArray, boolean z, List list, r47 r47Var, c39 c39Var, r47 r47Var2, SparseIntArray sparseIntArray, int i2, fic ficVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i3) {
        this.p = zu1Var;
        this.c = i;
        this.d = sparseArray;
        this.e = z;
        this.f = list;
        this.g = r47Var;
        this.h = c39Var;
        this.i = r47Var2;
        this.j = sparseIntArray;
        this.k = i2;
        this.l = ficVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i3;
    }

    @Override // vu7
    public final void a(fic ficVar, Object obj) {
        ficVar.removeView((View) obj);
    }

    @Override // vu7
    public final int b() {
        return this.c;
    }

    @Override // vu7
    public final Object e(fic ficVar, int i) {
        int i2;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            ficVar.addView(view);
            return view;
        }
        int i3 = this.e ? i - 1 : i;
        TLRPC.ReactionCount reactionCount = i3 >= 0 ? (TLRPC.ReactionCount) this.f.get(i3) : null;
        Context context = ficVar.getContext();
        zu1 zu1Var = this.p;
        xu1 xu1Var = zu1Var.Ba;
        i2 = ((e) zu1Var).currentAccount;
        o39 o39Var = new o39(context, xu1Var, i2, this.g, reactionCount, true);
        c39 c39Var = this.h;
        o39Var.d(c39Var.getSeenUsers());
        o39Var.H = new rd1(this, (byte) 7);
        o39Var.F = new h01(this, this.i, (byte) 16);
        o39Var.E = new qm0(this.j, i, this.k, this.l, this.m, this.n);
        if (i3 < 0) {
            o39Var.setPredictiveCount(this.o);
            c39Var.setSeenCallback(new hw(o39Var, (byte) 3));
        }
        ficVar.addView(o39Var);
        sparseArray.put(i, o39Var);
        return o39Var;
    }

    @Override // vu7
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
