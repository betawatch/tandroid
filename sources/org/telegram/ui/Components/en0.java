package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class en0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ dn0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] d;
    public final /* synthetic */ View e;

    public en0(dn0 dn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.a = dn0Var;
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
        dn0 dn0Var = this.a;
        String obj = dn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(dn0Var);
            return true;
        }
        MessagesController.getInstance(this.b).renameSavedReactionTag(zg.p0.d(this.c), obj);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (c2VarArr[0] == jn0.H) {
            jn0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
