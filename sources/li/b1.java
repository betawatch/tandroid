package li;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class b1 implements ActionMode.Callback {
    public final /* synthetic */ g1 a;

    public b1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.a.length() != 0) {
            return false;
        }
        for (int size = menu.size() - 1; size >= 0; size--) {
            int itemId = menu.getItem(size).getItemId();
            if (itemId != 16908322 && itemId != 16908337) {
                menu.removeItem(itemId);
            }
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
