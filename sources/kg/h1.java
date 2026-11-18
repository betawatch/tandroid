package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import di.c7;
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h1 extends h2 {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public j0 f;
    public h0 h;
    public e51 n;
    public boolean r;

    public h1(CharSequence charSequence, ArrayList arrayList, int i7, int i10, int i11) {
        super(null);
        this.a = charSequence;
        this.b = arrayList;
        this.c = i7;
        this.d = i10;
        this.e = i11;
        this.r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.b;
        return arrayList.size() == 1 && ((e1) arrayList.get(0)).a == 0 && ((e1) arrayList.get(0)).b == 1439;
    }

    public final boolean a0() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        return arrayList.isEmpty() || Z() || ((e1) i5.c.h(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(this.a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        e51 e51Var = new e51(this, new e7(this, 14), new c7(this, 27), null);
        this.n = e51Var;
        e51Var.r1();
        this.n.setSectionsDrawBackground(true);
        frameLayout.addView(this.n, ma.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ck0 getListViewForSimpleGlass() {
        return this.n;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onBecomeFullyHidden() {
        h0 h0Var = this.h;
        if (h0Var != null) {
            h0Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.r) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.clear();
        j0 j0Var = this.f;
        if (j0Var != null) {
            j0Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.n != null) {
                for (int i7 = 0; i7 < this.n.getChildCount(); i7++) {
                    View childAt = this.n.getChildAt(i7);
                    if ((childAt instanceof r8) && ((r8) childAt).b == -1) {
                        u6.h(this.r ? n6.f6 : n6.e6, childAt, null);
                    }
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
