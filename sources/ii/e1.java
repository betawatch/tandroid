package ii;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class e1 implements ActionMode.Callback {
    public final /* synthetic */ i1 a;

    public e1(i1 i1Var) {
        this.a = i1Var;
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
