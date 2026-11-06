package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class s implements b0, x, AdapterView.OnItemClickListener {
    public Rect a;

    public static int m(ListAdapter listAdapter, Context context, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i10 = 0;
        int i11 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    @Override // l.x
    public final boolean b(m mVar) {
        return false;
    }

    @Override // l.x
    public final boolean k(m mVar) {
        return false;
    }

    public abstract void l(k kVar);

    public abstract void n(View view);

    public abstract void o(boolean z9);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (h) listAdapter).a.q((MenuItem) listAdapter.getItem(i7), this, !(this instanceof e) ? 0 : 4);
    }

    public abstract void p(int i7);

    public abstract void q(int i7);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z9);

    public abstract void t(int i7);

    @Override // l.x
    public final void i(Context context, k kVar) {
    }
}
