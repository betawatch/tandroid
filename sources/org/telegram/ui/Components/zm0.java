package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zm0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ ym0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] d;
    public final /* synthetic */ View e;

    public zm0(ym0 ym0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.a = ym0Var;
        this.b = i10;
        this.c = reaction;
        this.d = c2VarArr;
        this.e = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        ym0 ym0Var = this.a;
        String obj = ym0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(ym0Var);
            return true;
        }
        MessagesController.getInstance(this.b).renameSavedReactionTag(kg.q0.d(this.c), obj);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (c2VarArr[0] == en0.D) {
            en0.D = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
