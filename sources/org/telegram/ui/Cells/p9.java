package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yt;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class p9 extends ActionMode.Callback2 {
    public final /* synthetic */ int a = 0;
    public final ActionMode.Callback b;
    public final /* synthetic */ Object c;

    public p9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.c = editTextBoldCursor;
        this.b = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.a) {
            case 0:
                ((o9) this.b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((yt) this.b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((o9) this.b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onCreateActionMode(actionMode, menu);
            default:
                return ((yt) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                ((o9) this.b).onDestroyActionMode(actionMode);
                break;
            case 1:
                this.b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.c).f();
                ((EditTextBoldCursor) this.c).floatingActionMode = null;
                break;
            default:
                ((yt) this.b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.a) {
            case 0:
                if (((ea) this.c).y()) {
                    ((ea) this.c).P();
                    int[] m10 = ((ea) this.c).m();
                    ea eaVar = (ea) this.c;
                    int i11 = 1;
                    if (eaVar.W != null) {
                        int i12 = -eaVar.n();
                        ea eaVar2 = (ea) this.c;
                        int[] C = eaVar2.C(eaVar2.u);
                        int i13 = C[0];
                        ea eaVar3 = (ea) this.c;
                        i10 = i13 + eaVar3.a;
                        int dp = ((i12 / 2) + ((C[1] + eaVar3.b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((ea) this.c).F.getWidth();
                    ((ea) this.c).O();
                    ea eaVar4 = (ea) this.c;
                    if (eaVar4.W != null) {
                        width = eaVar4.C(eaVar4.v)[0] + ((ea) this.c).a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    break;
                }
                break;
            case 1:
                ActionMode.Callback callback = this.b;
                if (!org.telegram.ui.Components.i2.d(callback)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    m4.q0.e(callback).onGetContentRect(actionMode, view, rect);
                    break;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.c;
                if (!org.telegram.ui.Components.i2.d(callback2)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    m4.q0.e(callback2).onGetContentRect(actionMode, view, rect);
                    break;
                }
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((o9) this.b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onPrepareActionMode(actionMode, menu);
            default:
                return ((yt) this.b).a.onPrepareActionMode(actionMode, menu);
        }
    }

    public p9(yt ytVar, ActionMode.Callback callback) {
        this.b = ytVar;
        this.c = callback;
    }

    public p9(ea eaVar, o9 o9Var) {
        this.c = eaVar;
        this.b = o9Var;
    }
}
