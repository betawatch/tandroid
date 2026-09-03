package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j3 implements l.x {
    public l.k a;
    public l.m b;
    public final /* synthetic */ Toolbar c;

    public j3(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // l.x
    public final boolean b(l.m mVar) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.n);
            }
            toolbar.addView(toolbar.n);
        }
        View actionView = mVar.getActionView();
        toolbar.r = actionView;
        this.b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.r);
            }
            k3 h = Toolbar.h();
            h.a = (toolbar.y & 112) | 8388611;
            h.b = 2;
            toolbar.r.setLayoutParams(h);
            toolbar.addView(toolbar.r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k3) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.R.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.C = true;
        mVar.n.p(false);
        KeyEvent.Callback callback = toolbar.r;
        if (callback instanceof k.b) {
            ((k.b) callback).onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // l.x
    public final boolean d() {
        return false;
    }

    @Override // l.x
    public final void e() {
        if (this.b != null) {
            l.k kVar = this.a;
            if (kVar != null) {
                int size = kVar.f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.a.getItem(i10) == this.b) {
                        return;
                    }
                }
            }
            k(this.b);
        }
    }

    @Override // l.x
    public final void i(Context context, l.k kVar) {
        l.m mVar;
        l.k kVar2 = this.a;
        if (kVar2 != null && (mVar = this.b) != null) {
            kVar2.d(mVar);
        }
        this.a = kVar;
    }

    @Override // l.x
    public final boolean j(l.d0 d0Var) {
        return false;
    }

    @Override // l.x
    public final boolean k(l.m mVar) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.r;
        if (callback instanceof k.b) {
            ((k.b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.r);
        toolbar.removeView(toolbar.n);
        toolbar.r = null;
        ArrayList arrayList = toolbar.R;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        mVar.C = false;
        mVar.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // l.x
    public final void c(l.k kVar, boolean z4) {
    }
}
