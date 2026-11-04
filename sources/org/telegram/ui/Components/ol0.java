package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ol0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ nl0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1[] d;
    public final /* synthetic */ View e;

    public ol0(nl0 nl0Var, int i3, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.s1[] s1VarArr, View view) {
        this.a = nl0Var;
        this.b = i3;
        this.c = reaction;
        this.d = s1VarArr;
        this.e = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        if (i3 != 6) {
            return false;
        }
        nl0 nl0Var = this.a;
        String obj = nl0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.g0.F3(nl0Var);
            return true;
        }
        org.telegram.messenger.hp.s1(this.b).l4(dh.n0.d(this.c), obj);
        org.telegram.ui.ActionBar.s1[] s1VarArr = this.d;
        org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
        if (s1Var != null) {
            s1Var.dismiss();
        }
        if (s1VarArr[0] == tl0.I) {
            tl0.I = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
