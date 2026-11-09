package org.telegram.ui;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cr implements ActionMode.Callback {
    public final /* synthetic */ dr a;

    public cr(dr drVar) {
        this.a = drVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i7;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        dr drVar = this.a;
        ar arVar = drVar.getParent() instanceof ar ? (ar) drVar.getParent() : null;
        if (arVar != null && (clipboardManager = (ClipboardManager) drVar.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i7 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i7 = -1;
            }
            if (i7 > 0) {
                arVar.c(charSequence, true);
            }
        }
        drVar.m();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, R.id.paste, 0, R.string.paste);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
