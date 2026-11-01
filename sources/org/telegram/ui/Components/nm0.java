package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nm0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ mm0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1[] d;
    public final /* synthetic */ View e;

    public nm0(mm0 mm0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.x1[] x1VarArr, View view) {
        this.a = mm0Var;
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
        mm0 mm0Var = this.a;
        String obj = mm0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.i0.E3(mm0Var);
            return true;
        }
        org.telegram.messenger.wp.r1(this.b).i4(obj, sg.o0.d(this.c));
        org.telegram.ui.ActionBar.x1[] x1VarArr = this.d;
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            x1Var.dismiss();
        }
        if (x1VarArr[0] == sm0.H) {
            sm0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
