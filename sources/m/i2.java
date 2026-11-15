package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class i2 extends r1 {
    public final int E;
    public e2 F;
    public l.m G;
    public final int y;

    public i2(Context context, boolean z10) {
        super(context, z10);
        if (1 == h2.a(context.getResources().getConfiguration())) {
            this.y = 21;
            this.E = 22;
        } else {
            this.y = 22;
            this.E = 21;
        }
    }

    @Override // m.r1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.h hVar;
        int i7;
        int pointToPosition;
        int i10;
        if (this.F != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i7 = headerViewListAdapter.getHeadersCount();
                hVar = (l.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (l.h) adapter;
                i7 = 0;
            }
            l.m item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = pointToPosition - i7) < 0 || i10 >= hVar.getCount()) ? null : hVar.getItem(i10);
            l.m mVar = this.G;
            if (mVar != item) {
                l.k kVar = hVar.a;
                if (mVar != null) {
                    this.F.j(kVar, mVar);
                }
                this.G = item;
                if (item != null) {
                    this.F.q(kVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i7 == this.y) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i7 != this.E) {
            return super.onKeyDown(i7, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (l.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (l.h) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(e2 e2Var) {
        this.F = e2Var;
    }

    @Override // m.r1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
