package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pn0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ on0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2[] d;
    public final /* synthetic */ View e;

    public pn0(on0 on0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.a = on0Var;
        this.b = i10;
        this.c = reaction;
        this.d = a2VarArr;
        this.e = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        on0 on0Var = this.a;
        String obj = on0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(on0Var);
            return true;
        }
        MessagesController.getInstance(this.b).renameSavedReactionTag(zg.o0.d(this.c), obj);
        org.telegram.ui.ActionBar.a2[] a2VarArr = this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var != null) {
            a2Var.dismiss();
        }
        if (a2VarArr[0] == un0.H) {
            un0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
