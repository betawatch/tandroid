package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Field;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f9 extends ActionMode.Callback2 {
    public final /* synthetic */ int a = 2;
    public final ActionMode.Callback b;
    public final /* synthetic */ Object c;

    public f9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.c = editTextBoldCursor;
        this.b = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.a) {
            case 0:
                ((e9) this.b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((e9) this.b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((e9) this.b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onCreateActionMode(actionMode, menu);
            default:
                return ((e9) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        int i3 = this.a;
        ActionMode.Callback callback = this.b;
        switch (i3) {
            case 0:
                break;
            case 1:
                callback.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                Field field = EditTextBoldCursor.z1;
                editTextBoldCursor.m();
                editTextBoldCursor.Z0 = null;
                break;
            default:
                ((e9) callback).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i3;
        switch (this.a) {
            case 0:
                u9 u9Var = (u9) this.c;
                if (u9Var.x()) {
                    u9Var.O();
                    int[] l10 = u9Var.l();
                    int i10 = 1;
                    if (u9Var.W != null) {
                        int i11 = -u9Var.m();
                        int[] B = u9Var.B(u9Var.u);
                        i3 = B[0] + u9Var.a;
                        int L = ((i11 / 2) + ((B[1] + u9Var.b) + l10[1])) - org.telegram.messenger.g0.L(4.0f);
                        if (L >= 1) {
                            i10 = L;
                        }
                    } else {
                        i3 = 0;
                    }
                    int width = u9Var.F.getWidth();
                    u9Var.N();
                    if (u9Var.W != null) {
                        width = u9Var.B(u9Var.v)[0] + u9Var.a;
                    }
                    rect.set(Math.min(i3, width), i10, Math.max(i3, width), i10 + 1);
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
                ((e9) this.b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ActionMode.Callback) ((e9) this.b).b).onPrepareActionMode(actionMode, menu);
        }
    }

    public f9(e9 e9Var, ActionMode.Callback callback) {
        this.b = e9Var;
        this.c = callback;
    }

    public f9(u9 u9Var, e9 e9Var) {
        this.c = u9Var;
        this.b = e9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
