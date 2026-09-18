package hg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.uc;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ml0;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i1 extends o2 {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public uc f;
    public gg.x1 h;
    public f61 n;
    public boolean r;

    public i1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
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
        return arrayList.size() == 1 && ((f1) arrayList.get(0)).a == 0 && ((f1) arrayList.get(0)).b == 1439;
    }

    public final boolean V() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        return arrayList.isEmpty() || U() || ((f1) k0.h(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.a);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.a7, false));
        f61 f61Var = new f61(this, new bi.v(this, 28), new d5(this, 4), null);
        this.n = f61Var;
        f61Var.q1();
        frameLayout.addView(this.n, x5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ml0 getListViewForSimpleGlass() {
        return this.n;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        gg.x1 x1Var = this.h;
        if (x1Var != null) {
            x1Var.run();
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
        uc ucVar = this.f;
        if (ucVar != null) {
            ucVar.run();
        }
    }
}
