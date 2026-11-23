package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.sr;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                        org.telegram.messenger.g0.D3(sVar);
                    } else {
                        z d = z.d(this.b);
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
                b5 b5Var = (b5) this.e;
                sr srVar = (sr) this.f;
                if (i7 == 6) {
                    String obj2 = b5Var.getText().toString();
                    if (obj2.length() > this.b) {
                        org.telegram.messenger.g0.D3(b5Var);
                    } else {
                        srVar.a(obj2);
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
