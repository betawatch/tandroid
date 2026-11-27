// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jw9 implements TextView.OnEditorActionListener {
    public final /* synthetic */ iw9 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Reaction c;
    public final /* synthetic */ id[] d;
    public final /* synthetic */ View e;

    public jw9(iw9 iw9Var, int i, TLRPC.Reaction reaction, id[] idVarArr, View view) {
        this.a = iw9Var;
        this.b = i;
        this.c = reaction;
        this.d = idVarArr;
        this.e = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        iw9 iw9Var = this.a;
        String obj = iw9Var.getText().toString();
        if (obj.length() > 12) {
            hl.z3(iw9Var);
            return true;
        }
        uc7.s1(this.b).w4(w49.d(this.c), obj);
        id[] idVarArr = this.d;
        id idVar = idVarArr[0];
        if (idVar != null) {
            idVar.dismiss();
        }
        if (idVarArr[0] == ow9.I) {
            ow9.I = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
