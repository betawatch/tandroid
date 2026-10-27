package jg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import fi.ua;
import hi.u2;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j1 extends r2 {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public ua f;
    public u2 h;
    public s71 n;
    public boolean r;

    public j1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.a = charSequence;
        this.b = arrayList;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.r = !arrayList.isEmpty();
    }

    public final boolean V() {
        ArrayList arrayList = this.b;
        return arrayList.size() == 1 && ((g1) arrayList.get(0)).a == 0 && ((g1) arrayList.get(0)).b == 1439;
    }

    public final boolean W() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        return arrayList.isEmpty() || V() || ((g1) ic.a.g(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(this.a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        s71 s71Var = new s71(this, new hi.e2(this, 12), new e1(this, 1), null);
        this.n = s71Var;
        s71Var.u1();
        this.n.setSectionsDrawBackground(true);
        frameLayout.addView(this.n, kb1.g(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final nm0 getListViewForSimpleGlass() {
        return this.n;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyHidden() {
        u2 u2Var = this.h;
        if (u2Var != null) {
            u2Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override // org.telegram.ui.ActionBar.r2
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
        ua uaVar = this.f;
        if (uaVar != null) {
            uaVar.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.n != null) {
                for (int i10 = 0; i10 < this.n.getChildCount(); i10++) {
                    View childAt = this.n.getChildAt(i10);
                    if ((childAt instanceof a9) && ((a9) childAt).b == -1) {
                        f7.i(this.r ? y6.f6 : y6.e6, childAt, null);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
