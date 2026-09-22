package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rn0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ qn0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] d;
    public final /* synthetic */ View e;

    public rn0(qn0 qn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.a = qn0Var;
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
        qn0 qn0Var = this.a;
        String obj = qn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(qn0Var);
            return true;
        }
        MessagesController.getInstance(this.b).renameSavedReactionTag(zg.p0.d(this.c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == wn0.H) {
            wn0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
