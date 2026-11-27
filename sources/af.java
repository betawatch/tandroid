// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class af implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ id[] c;
    public final /* synthetic */ View d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ af(EditTextBoldCursor editTextBoldCursor, int i, Object obj, id[] idVarArr, View view, byte b) {
        this.a = b;
        this.e = editTextBoldCursor;
        this.b = i;
        this.f = obj;
        this.c = idVarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        View view = this.d;
        id[] idVarArr = this.c;
        Object obj = this.f;
        int i2 = this.b;
        EditTextBoldCursor editTextBoldCursor = this.e;
        switch (b) {
            case 0:
                ij ijVar = (ij) editTextBoldCursor;
                hf7 hf7Var = (hf7) obj;
                if (i == 6) {
                    String obj2 = ijVar.getText().toString();
                    if (obj2.length() > i2) {
                        hl.z3(ijVar);
                    } else {
                        hf7Var.a(obj2);
                        id idVar = idVarArr[0];
                        if (idVar != null) {
                            idVar.dismiss();
                        }
                        if (view != null) {
                            view.requestFocus();
                        }
                    }
                    break;
                }
                break;
            default:
                k41 k41Var = (k41) editTextBoldCursor;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                if (i == 6) {
                    String obj3 = k41Var.getText().toString();
                    if (obj3.length() > 32) {
                        hl.z3(k41Var);
                    } else {
                        r41 d = r41.d(i2);
                        TL_account.TL_businessChatLink c = d.c(tL_businessChatLink.link);
                        if (c != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = c.message;
                            tL_inputBusinessChatLink.entities = c.entities;
                            tL_inputBusinessChatLink.title = obj3;
                            d.b(c, tL_inputBusinessChatLink, null);
                        }
                        id idVar2 = idVarArr[0];
                        if (idVar2 != null) {
                            idVar2.dismiss();
                        }
                        if (idVarArr[0] == n41.e) {
                            n41.e = null;
                        }
                        if (view != null) {
                            view.requestFocus();
                        }
                    }
                    break;
                }
                break;
        }
        return false;
    }
}
