package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class bu implements ActionMode.Callback {
    public final /* synthetic */ ActionMode.Callback a;
    public final /* synthetic */ eu b;

    public bu(eu euVar, ActionMode.Callback callback) {
        this.b = euVar;
        this.a = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        eu euVar = this.b;
        euVar.copyPasteShowed = true;
        euVar.onContextMenuOpen();
        return this.a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        eu euVar = this.b;
        euVar.copyPasteShowed = false;
        euVar.onContextMenuClose();
        this.a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.onPrepareActionMode(actionMode, menu);
    }
}
