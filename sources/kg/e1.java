package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import di.q4;
import fi.h9;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e1 extends f2 {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public h9 f;
    public ha.b h;
    public q41 n;
    public boolean r;

    public e1(CharSequence charSequence, ArrayList arrayList, int i7, int i10, int i11) {
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
        return arrayList.size() == 1 && ((b1) arrayList.get(0)).a == 0 && ((b1) arrayList.get(0)).b == 1439;
    }

    public final boolean a0() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        return arrayList.isEmpty() || Z() || ((b1) jg.g.i(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(this.a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        q41 q41Var = new q41(this, new hi.u1(this, 12), new q4(this, 25), null);
        this.n = q41Var;
        q41Var.r1();
        this.n.setSectionsDrawBackground(true);
        frameLayout.addView(this.n, ha.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final pj0 getListViewForSimpleGlass() {
        return this.n;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        ha.b bVar = this.h;
        if (bVar != null) {
            bVar.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override // org.telegram.ui.ActionBar.f2
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
        h9 h9Var = this.f;
        if (h9Var != null) {
            h9Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.n != null) {
                for (int i7 = 0; i7 < this.n.getChildCount(); i7++) {
                    View childAt = this.n.getChildAt(i7);
                    if ((childAt instanceof r8) && ((r8) childAt).b == -1) {
                        r6.i(this.r ? k6.f6 : k6.e6, childAt, null);
                    }
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
