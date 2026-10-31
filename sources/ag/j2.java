package ag;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j2 extends org.telegram.ui.ActionBar.k2 {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public a3.d f;
    public a1.f h;
    public u51 n;
    public boolean r;

    public j2(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.a = charSequence;
        this.b = arrayList;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.r = !arrayList.isEmpty();
    }

    public final boolean Y() {
        ArrayList arrayList = this.b;
        return arrayList.size() == 1 && ((g2) arrayList.get(0)).a == 0 && ((g2) arrayList.get(0)).b == 1439;
    }

    public final boolean Z() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        return arrayList.isEmpty() || Y() || ((g2) i0.a.g(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(this.a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        u51 u51Var = new u51(this, new a(this, 7), new a1.c(this, 3), null);
        this.n = u51Var;
        u51Var.r1();
        this.n.setSectionsDrawBackground(true);
        frameLayout.addView(this.n, b6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final tk0 getListViewForSimpleGlass() {
        return this.n;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        a1.f fVar = this.h;
        if (fVar != null) {
            fVar.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override // org.telegram.ui.ActionBar.k2
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
        a3.d dVar = this.f;
        if (dVar != null) {
            dVar.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.n != null) {
                for (int i10 = 0; i10 < this.n.getChildCount(); i10++) {
                    View childAt = this.n.getChildAt(i10);
                    if ((childAt instanceof t8) && ((t8) childAt).b == -1) {
                        a7.i(this.r ? t6.f6 : t6.e6, childAt, null);
                    }
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
