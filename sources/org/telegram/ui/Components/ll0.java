package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ll0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ kl0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1[] d;
    public final /* synthetic */ View e;

    public ll0(kl0 kl0Var, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.a = kl0Var;
        this.b = i7;
        this.c = reaction;
        this.d = u1VarArr;
        this.e = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        kl0 kl0Var = this.a;
        String obj = kl0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.g0.F3(kl0Var);
            return true;
        }
        org.telegram.messenger.qp.s1(this.b).l4(ch.o0.d(this.c), obj);
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.d;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
        }
        if (u1VarArr[0] == ql0.H) {
            ql0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
