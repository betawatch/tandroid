package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u6 implements TextView.OnEditorActionListener {
    public final /* synthetic */ t6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zi c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1[] e;
    public final /* synthetic */ View f;
    public final /* synthetic */ x6 g;

    public u6(x6 x6Var, t6 t6Var, int i3, zi ziVar, boolean z10, org.telegram.ui.ActionBar.s1[] s1VarArr, View view) {
        this.g = x6Var;
        this.a = t6Var;
        this.b = i3;
        this.c = ziVar;
        this.d = z10;
        this.e = s1VarArr;
        this.f = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        if (i3 != 6) {
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
        tL_textWithEntities.entities = li.b0(x6Var.a).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        x6Var.a(this.c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.s1[] s1VarArr = this.e;
        org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
        if (s1Var != null) {
            s1Var.dismiss();
        }
        if (s1VarArr[0] == x6.i) {
            x6.i = null;
        }
        View view = this.f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
