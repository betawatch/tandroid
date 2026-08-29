package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.pt;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i9 extends ActionMode.Callback2 {
    public final /* synthetic */ int a = 0;
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
                return ((pt) this.b).onActionItemClicked(actionMode, menuItem);
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
                return ((pt) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                ((h9) this.b).onDestroyActionMode(actionMode);
                break;
            case 1:
                this.b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.c).f();
                ((EditTextBoldCursor) this.c).floatingActionMode = null;
                break;
            default:
                ((pt) this.b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.a) {
            case 0:
                if (((x9) this.c).y()) {
                    ((x9) this.c).P();
                    int[] m10 = ((x9) this.c).m();
                    x9 x9Var = (x9) this.c;
                    int i11 = 1;
                    if (x9Var.W != null) {
                        int i12 = -x9Var.n();
                        x9 x9Var2 = (x9) this.c;
                        int[] C = x9Var2.C(x9Var2.u);
                        int i13 = C[0];
                        x9 x9Var3 = (x9) this.c;
                        i10 = i13 + x9Var3.a;
                        int dp = ((i12 / 2) + ((C[1] + x9Var3.b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((x9) this.c).F.getWidth();
                    ((x9) this.c).O();
                    x9 x9Var4 = (x9) this.c;
                    if (x9Var4.W != null) {
                        width = x9Var4.C(x9Var4.v)[0] + ((x9) this.c).a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    break;
                }
                break;
            case 1:
                ActionMode.Callback callback = this.b;
                if (!org.telegram.ui.Components.r2.d(callback)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    m4.a.i(callback).onGetContentRect(actionMode, view, rect);
                    break;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.c;
                if (!org.telegram.ui.Components.r2.d(callback2)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    m4.a.i(callback2).onGetContentRect(actionMode, view, rect);
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
                return ((pt) this.b).a.onPrepareActionMode(actionMode, menu);
        }
    }

    public i9(pt ptVar, ActionMode.Callback callback) {
        this.b = ptVar;
        this.c = callback;
    }

    public i9(x9 x9Var, h9 h9Var) {
        this.c = x9Var;
        this.b = h9Var;
    }
}
