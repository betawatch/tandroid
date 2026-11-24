// default package

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fl2 implements ActionMode.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ fl2(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i;
        switch (this.a) {
            case 0:
                gl2 gl2Var = (gl2) this.b;
                if (menuItem.getItemId() == 16908322) {
                    tk2 tk2Var = gl2Var.getParent() instanceof tk2 ? (tk2) gl2Var.getParent() : null;
                    if (tk2Var != null && (clipboardManager = (ClipboardManager) gl2Var.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
                        String charSequence = primaryClip.getItemAt(0).getText().toString();
                        try {
                            i = Integer.parseInt(charSequence);
                        } catch (Exception unused) {
                            i = -1;
                        }
                        if (i > 0) {
                            tk2Var.c(charSequence, true);
                        }
                    }
                    gl2Var.m();
                }
                return true;
            default:
                return false;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                menu.add(0, R.id.paste, 0, R.string.paste);
                break;
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        byte b = this.a;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (((ne9) this.b).length() == 0) {
                    for (int size = menu.size() - 1; size >= 0; size--) {
                        int itemId = menu.getItem(size).getItemId();
                        if (itemId != 16908322 && itemId != 16908337) {
                            menu.removeItem(itemId);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    private final void a(ActionMode actionMode) {
    }

    private final void b(ActionMode actionMode) {
    }
}
