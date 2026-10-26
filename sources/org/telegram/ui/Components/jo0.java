package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jo0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ io0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2[] d;
    public final /* synthetic */ View e;

    public jo0(io0 io0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.e2[] e2VarArr, View view) {
        this.a = io0Var;
        this.b = i10;
        this.c = reaction;
        this.d = e2VarArr;
        this.e = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        io0 io0Var = this.a;
        String obj = io0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(io0Var);
            return true;
        }
        MessagesController.getInstance(this.b).renameSavedReactionTag(bh.x0.d(this.c), obj);
        org.telegram.ui.ActionBar.e2[] e2VarArr = this.d;
        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
        if (e2Var != null) {
            e2Var.dismiss();
        }
        if (e2VarArr[0] == oo0.H) {
            oo0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
