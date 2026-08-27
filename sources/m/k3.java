package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k3 implements l.y {
    public l.l a;
    public l.n b;
    public final /* synthetic */ Toolbar c;

    public k3(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // l.y
    public final boolean c(l.n nVar) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.n);
            }
            toolbar.addView(toolbar.n);
        }
        View actionView = nVar.getActionView();
        toolbar.r = actionView;
        this.b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.r);
            }
            l3 h = Toolbar.h();
            h.a = (toolbar.y & 112) | 8388611;
            h.b = 2;
            toolbar.r.setLayoutParams(h);
            toolbar.addView(toolbar.r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((l3) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.Q.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.n.p(false);
        KeyEvent.Callback callback = toolbar.r;
        if (callback instanceof k.b) {
            ((k.b) callback).onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // l.y
    public final boolean d() {
        return false;
    }

    @Override // l.y
    public final void e() {
        if (this.b != null) {
            l.l lVar = this.a;
            if (lVar != null) {
                int size = lVar.f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.a.getItem(i10) == this.b) {
                        return;
                    }
                }
            }
            k(this.b);
        }
    }

    @Override // l.y
    public final void i(Context context, l.l lVar) {
        l.n nVar;
        l.l lVar2 = this.a;
        if (lVar2 != null && (nVar = this.b) != null) {
            lVar2.d(nVar);
        }
        this.a = lVar;
    }

    @Override // l.y
    public final boolean j(l.e0 e0Var) {
        return false;
    }

    @Override // l.y
    public final boolean k(l.n nVar) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.r;
        if (callback instanceof k.b) {
            ((k.b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.r);
        toolbar.removeView(toolbar.n);
        toolbar.r = null;
        ArrayList arrayList = toolbar.Q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // l.y
    public final void b(l.l lVar, boolean z10) {
    }
}
