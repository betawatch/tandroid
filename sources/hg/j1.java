package hg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.rc;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.r61;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class j1 extends m2 {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public rc f;
    public gg.x1 h;
    public r61 n;
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

    public final boolean U() {
        ArrayList arrayList = this.b;
        return arrayList.size() == 1 && ((g1) arrayList.get(0)).a == 0 && ((g1) arrayList.get(0)).b == 1439;
    }

    public final boolean V() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        return arrayList.isEmpty() || U() || ((g1) c.g(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.a);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(null, h6.a7, false));
        r61 r61Var = new r61(this, new bi.v(this, 28), new d5(this, 4), null);
        this.n = r61Var;
        r61Var.p1();
        this.actionBar.setAdaptiveBackground(this.n);
        frameLayout.addView(this.n, y5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyHidden() {
        gg.x1 x1Var = this.h;
        if (x1Var != null) {
            x1Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override // org.telegram.ui.ActionBar.m2
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
        rc rcVar = this.f;
        if (rcVar != null) {
            rcVar.run();
        }
    }
}
