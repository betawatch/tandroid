package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ko0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ jo0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2[] d;
    public final /* synthetic */ View e;

    public ko0(jo0 jo0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.e2[] e2VarArr, View view) {
        this.a = jo0Var;
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
        jo0 jo0Var = this.a;
        String obj = jo0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(jo0Var);
            return true;
        }
        MessagesController.getInstance(this.b).renameSavedReactionTag(bh.x0.d(this.c), obj);
        org.telegram.ui.ActionBar.e2[] e2VarArr = this.d;
        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
        if (e2Var != null) {
            e2Var.dismiss();
        }
        if (e2VarArr[0] == po0.H) {
            po0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
