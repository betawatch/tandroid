package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class pl0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ ol0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1[] d;
    public final /* synthetic */ View e;

    public pl0(ol0 ol0Var, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.a = ol0Var;
        this.b = i7;
        this.c = reaction;
        this.d = t1VarArr;
        this.e = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        ol0 ol0Var = this.a;
        String obj = ol0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.g0.E3(ol0Var);
            return true;
        }
        org.telegram.messenger.np.s1(this.b).l4(ch.p0.d(this.c), obj);
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.d;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
        }
        if (t1VarArr[0] == ul0.I) {
            ul0.I = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
