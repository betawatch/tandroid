package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mm0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ lm0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1[] d;
    public final /* synthetic */ View e;

    public mm0(lm0 lm0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.x1[] x1VarArr, View view) {
        this.a = lm0Var;
        this.b = i10;
        this.c = reaction;
        this.d = x1VarArr;
        this.e = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        lm0 lm0Var = this.a;
        String obj = lm0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.i0.E3(lm0Var);
            return true;
        }
        org.telegram.messenger.vp.r1(this.b).i4(obj, sg.o0.d(this.c));
        org.telegram.ui.ActionBar.x1[] x1VarArr = this.d;
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            x1Var.dismiss();
        }
        if (x1VarArr[0] == rm0.H) {
            rm0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
