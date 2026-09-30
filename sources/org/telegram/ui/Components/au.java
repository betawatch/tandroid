package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class au implements ActionMode.Callback {
    public final /* synthetic */ ActionMode.Callback a;
    public final /* synthetic */ du b;

    public au(du duVar, ActionMode.Callback callback) {
        this.b = duVar;
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
        du duVar = this.b;
        duVar.copyPasteShowed = true;
        duVar.onContextMenuOpen();
        return this.a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        du duVar = this.b;
        duVar.copyPasteShowed = false;
        duVar.onContextMenuClose();
        this.a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.onPrepareActionMode(actionMode, menu);
    }
}
