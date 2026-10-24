package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ei.bc;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.j71;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class g1 extends o2 {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public bc f;
    public hi.t h;
    public j71 n;
    public boolean r;

    public g1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.a = charSequence;
        this.b = arrayList;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.b;
        return arrayList.size() == 1 && ((d1) arrayList.get(0)).a == 0 && ((d1) arrayList.get(0)).b == 1439;
    }

    public final boolean V() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        return arrayList.isEmpty() || U() || ((d1) i2.o1.i(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.a);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.a7, frameLayout, null);
        j71 j71Var = new j71(this, new hg.o(this, 9), new e1.c(this, 21), null);
        this.n = j71Var;
        j71Var.t1();
        this.actionBar.setAdaptiveBackground(this.n);
        frameLayout.addView(this.n, z5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        hi.t tVar = this.h;
        if (tVar != null) {
            tVar.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override // org.telegram.ui.ActionBar.o2
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
        bc bcVar = this.f;
        if (bcVar != null) {
            bcVar.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.n != null) {
                for (int i10 = 0; i10 < this.n.getChildCount(); i10++) {
                    View childAt = this.n.getChildAt(i10);
                    if ((childAt instanceof w8) && ((w8) childAt).b == -1) {
                        r6.i(this.r ? k6.f6 : k6.e6, childAt, null);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
