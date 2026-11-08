package org.telegram.ui;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ar implements ActionMode.Callback {
    public final /* synthetic */ br a;

    public ar(br brVar) {
        this.a = brVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i7;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        br brVar = this.a;
        yq yqVar = brVar.getParent() instanceof yq ? (yq) brVar.getParent() : null;
        if (yqVar != null && (clipboardManager = (ClipboardManager) brVar.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i7 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i7 = -1;
            }
            if (i7 > 0) {
                yqVar.c(charSequence, true);
            }
        }
        brVar.m();
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
