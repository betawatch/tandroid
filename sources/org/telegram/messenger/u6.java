package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class u6 implements TextView.OnEditorActionListener {
    public final /* synthetic */ t6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ij c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1[] e;
    public final /* synthetic */ View f;
    public final /* synthetic */ x6 g;

    public u6(x6 x6Var, t6 t6Var, int i7, ij ijVar, boolean z9, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.g = x6Var;
        this.a = t6Var;
        this.b = i7;
        this.c = ijVar;
        this.d = z9;
        this.e = u1VarArr;
        this.f = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        t6 t6Var = this.a;
        if (t6Var.getText().toString().length() > this.b) {
            g0.F3(t6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        x6 x6Var = this.g;
        tL_textWithEntities.entities = ui.b0(x6Var.a).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        x6Var.a(this.c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.e;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
        }
        if (u1VarArr[0] == x6.i) {
            x6.i = null;
        }
        View view = this.f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
