package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jn0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ in0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] d;
    public final /* synthetic */ View e;

    public jn0(in0 in0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.a = in0Var;
        this.b = i10;
        this.c = reaction;
        this.d = d2VarArr;
        this.e = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        in0 in0Var = this.a;
        String obj = in0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(in0Var);
            return true;
        }
        MessagesController.getInstance(this.b).renameSavedReactionTag(ng.q0.d(this.c), obj);
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
        if (d2VarArr[0] == on0.E) {
            on0.E = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
