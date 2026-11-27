// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class n84 implements TextView.OnEditorActionListener {
    public final /* synthetic */ m84 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r47 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ id[] e;
    public final /* synthetic */ View f;
    public final /* synthetic */ q84 g;

    public n84(q84 q84Var, m84 m84Var, int i, r47 r47Var, boolean z, id[] idVarArr, View view) {
        this.g = q84Var;
        this.a = m84Var;
        this.b = i;
        this.c = r47Var;
        this.d = z;
        this.e = idVarArr;
        this.f = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        m84 m84Var = this.a;
        if (m84Var.getText().toString().length() > this.b) {
            hl.z3(m84Var);
            return true;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {m84Var.getText()};
        q84 q84Var = this.g;
        tL_textWithEntities.entities = ls6.d0(q84Var.a).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        q84Var.a(this.c, tL_textWithEntities, this.d);
        id[] idVarArr = this.e;
        id idVar = idVarArr[0];
        if (idVar != null) {
            idVar.dismiss();
        }
        if (idVarArr[0] == q84.i) {
            q84.i = null;
        }
        View view = this.f;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
