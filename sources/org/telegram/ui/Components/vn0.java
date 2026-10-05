package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class vn0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ un0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] d;
    public final /* synthetic */ View e;

    public vn0(un0 un0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.a = un0Var;
        this.b = i10;
        this.c = reaction;
        this.d = b2VarArr;
        this.e = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        un0 un0Var = this.a;
        String obj = un0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(un0Var);
            return true;
        }
        MessagesController.getInstance(this.b).renameSavedReactionTag(zg.m0.d(this.c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == ao0.H) {
            ao0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
