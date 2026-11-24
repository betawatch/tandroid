// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b94 implements TextView.OnEditorActionListener {
    public final /* synthetic */ a94 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ k47 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ he[] e;
    public final /* synthetic */ View f;
    public final /* synthetic */ e94 g;

    public b94(e94 e94Var, a94 a94Var, int i, k47 k47Var, boolean z, he[] heVarArr, View view) {
        this.g = e94Var;
        this.a = a94Var;
        this.b = i;
        this.c = k47Var;
        this.d = z;
        this.e = heVarArr;
        this.f = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        a94 a94Var = this.a;
        if (a94Var.getText().toString().length() > this.b) {
            gm.z3(a94Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {a94Var.getText()};
        e94 e94Var = this.g;
        tL_textWithEntities.entities = hs6.d0(e94Var.a).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        e94Var.a(this.c, tL_textWithEntities, this.d);
        he[] heVarArr = this.e;
        he heVar = heVarArr[0];
        if (heVar != null) {
            heVar.dismiss();
        }
        if (heVarArr[0] == e94.i) {
            e94.i = null;
        }
        View view = this.f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
