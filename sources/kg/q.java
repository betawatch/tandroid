package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.tr;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.s4;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1[] c;
    public final /* synthetic */ View d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q(EditTextBoldCursor editTextBoldCursor, int i7, Object obj, org.telegram.ui.ActionBar.t1[] t1VarArr, View view, int i10) {
        this.a = i10;
        this.e = editTextBoldCursor;
        this.b = i7;
        this.f = obj;
        this.c = t1VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                s sVar = (s) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f;
                if (i7 == 6) {
                    String obj = sVar.getText().toString();
                    if (obj.length() > 32) {
                        org.telegram.messenger.g0.E3(sVar);
                    } else {
                        y d = y.d(this.b);
                        TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = c10.message;
                            tL_inputBusinessChatLink.entities = c10.entities;
                            tL_inputBusinessChatLink.title = obj;
                            d.b(c10, tL_inputBusinessChatLink, null);
                        }
                        org.telegram.ui.ActionBar.t1[] t1VarArr = this.c;
                        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                        if (t1Var != null) {
                            t1Var.dismiss();
                        }
                        if (t1VarArr[0] == v.e) {
                            v.e = null;
                        }
                        View view = this.d;
                        if (view != null) {
                            view.requestFocus();
                        }
                    }
                    break;
                }
                break;
            default:
                s4 s4Var = (s4) this.e;
                tr trVar = (tr) this.f;
                if (i7 == 6) {
                    String obj2 = s4Var.getText().toString();
                    if (obj2.length() > this.b) {
                        org.telegram.messenger.g0.E3(s4Var);
                    } else {
                        trVar.a(obj2);
                        org.telegram.ui.ActionBar.t1 t1Var2 = this.c[0];
                        if (t1Var2 != null) {
                            t1Var2.dismiss();
                        }
                        View view2 = this.d;
                        if (view2 != null) {
                            view2.requestFocus();
                        }
                    }
                    break;
                }
                break;
        }
        return false;
    }
}
