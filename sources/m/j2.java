package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j2 extends s1 {
    public f2 A;
    public l.m B;
    public final int x;
    public final int y;

    public j2(Context context, boolean z10) {
        super(context, z10);
        if (1 == i2.a(context.getResources().getConfiguration())) {
            this.x = 21;
            this.y = 22;
        } else {
            this.x = 22;
            this.y = 21;
        }
    }

    @Override // m.s1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.h hVar;
        int i10;
        int pointToPosition;
        int i11;
        if (this.A != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i10 = headerViewListAdapter.getHeadersCount();
                hVar = (l.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (l.h) adapter;
                i10 = 0;
            }
            l.m item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i11 = pointToPosition - i10) < 0 || i11 >= hVar.getCount()) ? null : hVar.getItem(i11);
            l.m mVar = this.B;
            if (mVar != item) {
                l.k kVar = hVar.a;
                if (mVar != null) {
                    this.A.g(kVar, mVar);
                }
                this.B = item;
                if (item != null) {
                    this.A.o(kVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.x) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.y) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (l.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (l.h) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(f2 f2Var) {
        this.A = f2Var;
    }

    @Override // m.s1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
