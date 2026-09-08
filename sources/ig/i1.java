package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import fi.j4;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class i1 extends n2 {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public t0 f;
    public j4 h;
    public d61 n;
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
        return arrayList.isEmpty() || U() || ((f1) i2.g.h(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.a);
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.a7, false));
        d61 d61Var = new d61(this, new ci.u(this, 28), new fi.f(this, 12), null);
        this.n = d61Var;
        d61Var.o1();
        this.actionBar.setAdaptiveBackground(this.n);
        frameLayout.addView(this.n, x5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        j4 j4Var = this.h;
        if (j4Var != null) {
            j4Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        t0 t0Var = this.f;
        if (t0Var != null) {
            t0Var.run();
        }
    }
}
