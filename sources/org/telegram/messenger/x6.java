package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class x6 implements TextView.OnEditorActionListener {
    public final /* synthetic */ w6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ kj c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1[] e;
    public final /* synthetic */ View f;
    public final /* synthetic */ a7 g;

    public x6(a7 a7Var, w6 w6Var, int i10, kj kjVar, boolean z10, org.telegram.ui.ActionBar.x1[] x1VarArr, View view) {
        this.g = a7Var;
        this.a = w6Var;
        this.b = i10;
        this.c = kjVar;
        this.d = z10;
        this.e = x1VarArr;
        this.f = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        w6 w6Var = this.a;
        if (w6Var.getText().toString().length() > this.b) {
            i0.E3(w6Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {w6Var.getText()};
        a7 a7Var = this.g;
        tL_textWithEntities.entities = vi.b0(a7Var.a).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        a7Var.a(this.c, tL_textWithEntities, this.d);
        org.telegram.ui.ActionBar.x1[] x1VarArr = this.e;
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            x1Var.dismiss();
        }
        if (x1VarArr[0] == a7.i) {
            a7.i = null;
        }
        View view = this.f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
