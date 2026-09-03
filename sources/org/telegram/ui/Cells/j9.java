package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j9 extends ActionMode.Callback2 {
    public final /* synthetic */ int a = 0;
    public final ActionMode.Callback b;
    public final /* synthetic */ Object c;

    public j9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.c = editTextBoldCursor;
        this.b = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.a) {
            case 0:
                ((i9) this.b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((rt) this.b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((i9) this.b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onCreateActionMode(actionMode, menu);
            default:
                return ((rt) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                ((i9) this.b).onDestroyActionMode(actionMode);
                break;
            case 1:
                this.b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.c).f();
                ((EditTextBoldCursor) this.c).floatingActionMode = null;
                break;
            default:
                ((rt) this.b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.a) {
            case 0:
                if (((y9) this.c).y()) {
                    ((y9) this.c).P();
                    int[] m9 = ((y9) this.c).m();
                    y9 y9Var = (y9) this.c;
                    int i11 = 1;
                    if (y9Var.W != null) {
                        int i12 = -y9Var.n();
                        y9 y9Var2 = (y9) this.c;
                        int[] C = y9Var2.C(y9Var2.u);
                        int i13 = C[0];
                        y9 y9Var3 = (y9) this.c;
                        i10 = i13 + y9Var3.a;
                        int dp = ((i12 / 2) + ((C[1] + y9Var3.b) + m9[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((y9) this.c).F.getWidth();
                    ((y9) this.c).O();
                    y9 y9Var4 = (y9) this.c;
                    if (y9Var4.W != null) {
                        width = y9Var4.C(y9Var4.v)[0] + ((y9) this.c).a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    break;
                }
                break;
            case 1:
                ActionMode.Callback callback = this.b;
                if (!org.telegram.ui.Components.k2.d(callback)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    m.j0.f(callback).onGetContentRect(actionMode, view, rect);
                    break;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.c;
                if (!org.telegram.ui.Components.k2.d(callback2)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    m.j0.f(callback2).onGetContentRect(actionMode, view, rect);
                    break;
                }
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((i9) this.b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onPrepareActionMode(actionMode, menu);
            default:
                return ((rt) this.b).a.onPrepareActionMode(actionMode, menu);
        }
    }

    public j9(rt rtVar, ActionMode.Callback callback) {
        this.b = rtVar;
        this.c = callback;
    }

    public j9(y9 y9Var, i9 i9Var) {
        this.c = y9Var;
        this.b = i9Var;
    }
}
