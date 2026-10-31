package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Field;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i9 extends ActionMode.Callback2 {
    public final /* synthetic */ int a = 2;
    public final ActionMode.Callback b;
    public final /* synthetic */ Object c;

    public i9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.c = editTextBoldCursor;
        this.b = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.a) {
            case 0:
                ((h9) this.b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((h9) this.b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((h9) this.b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onCreateActionMode(actionMode, menu);
            default:
                return ((h9) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        int i10 = this.a;
        ActionMode.Callback callback = this.b;
        switch (i10) {
            case 0:
                break;
            case 1:
                callback.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                Field field = EditTextBoldCursor.y1;
                editTextBoldCursor.m();
                editTextBoldCursor.Y0 = null;
                break;
            default:
                ((h9) callback).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.a) {
            case 0:
                w9 w9Var = (w9) this.c;
                if (w9Var.x()) {
                    w9Var.O();
                    int[] l4 = w9Var.l();
                    int i11 = 1;
                    if (w9Var.W != null) {
                        int i12 = -w9Var.m();
                        int[] B = w9Var.B(w9Var.u);
                        i10 = B[0] + w9Var.a;
                        int L = ((i12 / 2) + ((B[1] + w9Var.b) + l4[1])) - org.telegram.messenger.i0.L(4.0f);
                        if (L >= 1) {
                            i11 = L;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = w9Var.F.getWidth();
                    w9Var.N();
                    if (w9Var.W != null) {
                        width = w9Var.B(w9Var.v)[0] + w9Var.a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    break;
                }
                break;
            case 1:
                ActionMode.Callback callback = this.b;
                if (!(callback instanceof ActionMode.Callback2)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    break;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.c;
                if (!(callback2 instanceof ActionMode.Callback2)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    ((ActionMode.Callback2) callback2).onGetContentRect(actionMode, view, rect);
                    break;
                }
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((h9) this.b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ActionMode.Callback) ((h9) this.b).b).onPrepareActionMode(actionMode, menu);
        }
    }

    public i9(h9 h9Var, ActionMode.Callback callback) {
        this.b = h9Var;
        this.c = callback;
    }

    public i9(w9 w9Var, h9 h9Var) {
        this.c = w9Var;
        this.b = h9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
