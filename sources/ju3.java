// default package

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Field;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ju3 extends ActionMode.Callback2 {
    public final /* synthetic */ byte a;
    public final ActionMode.Callback b;
    public final /* synthetic */ Object c;

    public ju3(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.a = (byte) 0;
        this.c = editTextBoldCursor;
        this.b = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        byte b = this.a;
        ActionMode.Callback callback = this.b;
        switch (b) {
            case 0:
                return callback.onActionItemClicked(actionMode, menuItem);
            case 1:
                return ((nu3) this.c).onActionItemClicked(actionMode, menuItem);
            default:
                ((nu3) callback).onActionItemClicked(actionMode, menuItem);
                return true;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        byte b = this.a;
        ActionMode.Callback callback = this.b;
        switch (b) {
            case 0:
                return callback.onCreateActionMode(actionMode, menu);
            case 1:
                return ((nu3) this.c).onCreateActionMode(actionMode, menu);
            default:
                ((nu3) callback).onCreateActionMode(actionMode, menu);
                return true;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                this.b.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                Field field = EditTextBoldCursor.E1;
                editTextBoldCursor.m();
                editTextBoldCursor.Z0 = null;
                break;
            case 1:
                ((nu3) obj).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i;
        byte b = this.a;
        ActionMode.Callback callback = this.b;
        switch (b) {
            case 0:
                if (!(callback instanceof ActionMode.Callback2)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    break;
                }
            case 1:
                if (!(callback instanceof ActionMode.Callback2)) {
                    super.onGetContentRect(actionMode, view, rect);
                    break;
                } else {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    break;
                }
            default:
                skb skbVar = (skb) this.c;
                if (skbVar.w()) {
                    skbVar.N();
                    int[] k = skbVar.k();
                    int i2 = 1;
                    if (skbVar.W != null) {
                        int i3 = -skbVar.l();
                        int[] A = skbVar.A(skbVar.u);
                        i = A[0] + skbVar.a;
                        int L = ((i3 / 2) + ((A[1] + skbVar.b) + k[1])) - gm.L(4.0f);
                        if (L >= 1) {
                            i2 = L;
                        }
                    } else {
                        i = 0;
                    }
                    int width = skbVar.F.getWidth();
                    skbVar.M();
                    if (skbVar.W != null) {
                        width = skbVar.A(skbVar.v)[0] + skbVar.a;
                    }
                    rect.set(Math.min(i, width), i2, Math.max(i, width), i2 + 1);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        byte b = this.a;
        ActionMode.Callback callback = this.b;
        switch (b) {
            case 0:
                return callback.onPrepareActionMode(actionMode, menu);
            case 1:
                return ((ActionMode.Callback) ((nu3) this.c).b).onPrepareActionMode(actionMode, menu);
            default:
                ((nu3) callback).onPrepareActionMode(actionMode, menu);
                return true;
        }
    }

    public /* synthetic */ ju3(Object obj, ActionMode.Callback callback, byte b) {
        this.a = b;
        this.c = obj;
        this.b = callback;
    }

    private final void a(ActionMode actionMode) {
    }
}
