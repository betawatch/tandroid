// default package

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class iv0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ iv0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                if (i != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) obj4;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) obj3).confirm(((xt3) obj2).getText().toString());
                    ((id) obj).dismiss();
                }
                return true;
            default:
                pt8 pt8Var = (pt8) obj4;
                if (i != 6) {
                    return false;
                }
                String obj5 = pt8Var.getText().toString();
                if (obj5.length() <= 0 || obj5.length() > 12) {
                    hl.z3(pt8Var);
                } else {
                    ((pcc) obj3).a(obj5);
                    id idVar = ((id[]) obj2)[0];
                    if (idVar != null) {
                        idVar.dismiss();
                    }
                    View view = (View) obj;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
        }
    }
}
