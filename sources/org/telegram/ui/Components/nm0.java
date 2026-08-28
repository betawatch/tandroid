package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nm0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ mm0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] d;
    public final /* synthetic */ View e;

    public nm0(mm0 mm0Var, int i9, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.a = mm0Var;
        this.b = i9;
        this.c = reaction;
        this.d = c2VarArr;
        this.e = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        if (i9 != 6) {
            return false;
        }
        mm0 mm0Var = this.a;
        String obj = mm0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(mm0Var);
            return true;
        }
        MessagesController.getInstance(this.b).renameSavedReactionTag(hg.r0.d(this.c), obj);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (c2VarArr[0] == sm0.D) {
            sm0.D = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
