package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class in0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ hn0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] d;
    public final /* synthetic */ View e;

    public in0(hn0 hn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.a = hn0Var;
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
        hn0 hn0Var = this.a;
        String obj = hn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(hn0Var);
            return true;
        }
        MessagesController.getInstance(this.b).renameSavedReactionTag(mg.q0.d(this.c), obj);
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
        if (d2VarArr[0] == nn0.E) {
            nn0.E = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
