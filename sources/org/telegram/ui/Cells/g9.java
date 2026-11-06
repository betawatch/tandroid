package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Field;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g9 extends ActionMode.Callback2 {
    public final /* synthetic */ int a = 2;
    public final ActionMode.Callback b;
    public final /* synthetic */ Object c;

    public g9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.c = editTextBoldCursor;
        this.b = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.a) {
            case 0:
                ((f9) this.b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((f9) this.b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((f9) this.b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onCreateActionMode(actionMode, menu);
            default:
                return ((f9) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        int i7 = this.a;
        ActionMode.Callback callback = this.b;
        switch (i7) {
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
                ((f9) callback).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i7;
        switch (this.a) {
            case 0:
                v9 v9Var = (v9) this.c;
                if (v9Var.x()) {
                    v9Var.O();
                    int[] l10 = v9Var.l();
                    int i10 = 1;
                    if (v9Var.W != null) {
                        int i11 = -v9Var.m();
                        int[] B = v9Var.B(v9Var.u);
                        i7 = B[0] + v9Var.a;
                        int L = ((i11 / 2) + ((B[1] + v9Var.b) + l10[1])) - org.telegram.messenger.g0.L(4.0f);
                        if (L >= 1) {
                            i10 = L;
                        }
                    } else {
                        i7 = 0;
                    }
                    int width = v9Var.F.getWidth();
                    v9Var.N();
                    if (v9Var.W != null) {
                        width = v9Var.B(v9Var.v)[0] + v9Var.a;
                    }
                    rect.set(Math.min(i7, width), i10, Math.max(i7, width), i10 + 1);
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
                ((f9) this.b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ActionMode.Callback) ((f9) this.b).b).onPrepareActionMode(actionMode, menu);
        }
    }

    public g9(f9 f9Var, ActionMode.Callback callback) {
        this.b = f9Var;
        this.c = callback;
    }

    public g9(v9 v9Var, f9 f9Var) {
        this.c = v9Var;
        this.b = f9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
