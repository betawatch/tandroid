package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.wt;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class o9 extends ActionMode.Callback2 {
    public final /* synthetic */ int a = 0;
    public final ActionMode.Callback b;
    public final /* synthetic */ Object c;

    public o9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.c = editTextBoldCursor;
        this.b = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.a) {
            case 0:
                ((n9) this.b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((wt) this.b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((n9) this.b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onCreateActionMode(actionMode, menu);
            default:
                return ((wt) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                ((n9) this.b).onDestroyActionMode(actionMode);
                break;
            case 1:
                this.b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.c).f();
                ((EditTextBoldCursor) this.c).floatingActionMode = null;
                break;
            default:
                ((wt) this.b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.a) {
            case 0:
                if (((da) this.c).y()) {
                    ((da) this.c).P();
                    int[] m10 = ((da) this.c).m();
                    da daVar = (da) this.c;
                    int i11 = 1;
                    if (daVar.W != null) {
                        int i12 = -daVar.n();
                        da daVar2 = (da) this.c;
                        int[] C = daVar2.C(daVar2.u);
                        int i13 = C[0];
                        da daVar3 = (da) this.c;
                        i10 = i13 + daVar3.a;
                        int dp = ((i12 / 2) + ((C[1] + daVar3.b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((da) this.c).F.getWidth();
                    ((da) this.c).O();
                    da daVar4 = (da) this.c;
                    if (daVar4.W != null) {
                        width = daVar4.C(daVar4.v)[0] + ((da) this.c).a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    break;
                }
                break;
            case 1:
                ActionMode.Callback callback = this.b;
                if (!org.telegram.ui.Components.p2.d(callback)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    m4.t0.d(callback).onGetContentRect(actionMode, view, rect);
                    break;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.c;
                if (!org.telegram.ui.Components.p2.d(callback2)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    m4.t0.d(callback2).onGetContentRect(actionMode, view, rect);
                    break;
                }
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((n9) this.b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onPrepareActionMode(actionMode, menu);
            default:
                return ((wt) this.b).a.onPrepareActionMode(actionMode, menu);
        }
    }

    public o9(wt wtVar, ActionMode.Callback callback) {
        this.b = wtVar;
        this.c = callback;
    }

    public o9(da daVar, n9 n9Var) {
        this.c = daVar;
        this.b = n9Var;
    }
}
