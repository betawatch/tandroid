package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f3 implements l.x {
    public l.k a;
    public l.m b;
    public final /* synthetic */ Toolbar c;

    public f3(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // l.x
    public final boolean c(l.m mVar) {
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
            g3 h = Toolbar.h();
            h.a = (toolbar.E & hs.x1) | 8388611;
            h.b = 2;
            toolbar.r.setLayoutParams(h);
            toolbar.addView(toolbar.r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((g3) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.V.add(childAt);
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
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.a.getItem(i3) == this.b) {
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
        ArrayList arrayList = toolbar.V;
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
    public final void b(l.k kVar, boolean z10) {
    }
}
