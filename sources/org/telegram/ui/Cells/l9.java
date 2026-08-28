package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l9 extends ActionMode.Callback2 {
    public final /* synthetic */ int a = 0;
    public final ActionMode.Callback b;
    public final /* synthetic */ Object c;

    public l9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.c = editTextBoldCursor;
        this.b = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.a) {
            case 0:
                ((k9) this.b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((jt) this.b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((k9) this.b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onCreateActionMode(actionMode, menu);
            default:
                return ((jt) this.b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                ((k9) this.b).onDestroyActionMode(actionMode);
                break;
            case 1:
                this.b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.c).f();
                ((EditTextBoldCursor) this.c).floatingActionMode = null;
                break;
            default:
                ((jt) this.b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i9;
        switch (this.a) {
            case 0:
                if (((aa) this.c).y()) {
                    ((aa) this.c).P();
                    int[] m10 = ((aa) this.c).m();
                    aa aaVar = (aa) this.c;
                    int i10 = 1;
                    if (aaVar.W != null) {
                        int i11 = -aaVar.n();
                        aa aaVar2 = (aa) this.c;
                        int[] C = aaVar2.C(aaVar2.u);
                        int i12 = C[0];
                        aa aaVar3 = (aa) this.c;
                        i9 = i12 + aaVar3.a;
                        int dp = ((i11 / 2) + ((C[1] + aaVar3.b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i10 = dp;
                        }
                    } else {
                        i9 = 0;
                    }
                    int width = ((aa) this.c).F.getWidth();
                    ((aa) this.c).O();
                    aa aaVar4 = (aa) this.c;
                    if (aaVar4.W != null) {
                        width = aaVar4.C(aaVar4.v)[0] + ((aa) this.c).a;
                    }
                    rect.set(Math.min(i9, width), i10, Math.max(i9, width), i10 + 1);
                    break;
                }
                break;
            case 1:
                ActionMode.Callback callback = this.b;
                if (!org.telegram.ui.Components.g2.d(callback)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    mg.b.d(callback).onGetContentRect(actionMode, view, rect);
                    break;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.c;
                if (!org.telegram.ui.Components.g2.d(callback2)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    mg.b.d(callback2).onGetContentRect(actionMode, view, rect);
                    break;
                }
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((k9) this.b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.b.onPrepareActionMode(actionMode, menu);
            default:
                return ((jt) this.b).a.onPrepareActionMode(actionMode, menu);
        }
    }

    public l9(jt jtVar, ActionMode.Callback callback) {
        this.b = jtVar;
        this.c = callback;
    }

    public l9(aa aaVar, k9 k9Var) {
        this.c = aaVar;
        this.b = k9Var;
    }
}
