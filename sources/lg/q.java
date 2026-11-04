package lg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.or;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.s4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1[] c;
    public final /* synthetic */ View d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q(EditTextBoldCursor editTextBoldCursor, int i3, Object obj, org.telegram.ui.ActionBar.s1[] s1VarArr, View view, int i10) {
        this.a = i10;
        this.e = editTextBoldCursor;
        this.b = i3;
        this.f = obj;
        this.c = s1VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                s sVar = (s) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f;
                if (i3 == 6) {
                    String obj = sVar.getText().toString();
                    if (obj.length() > 32) {
                        org.telegram.messenger.g0.F3(sVar);
                    } else {
                        z d = z.d(this.b);
                        TL_account.TL_businessChatLink c2 = d.c(tL_businessChatLink.link);
                        if (c2 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = c2.message;
                            tL_inputBusinessChatLink.entities = c2.entities;
                            tL_inputBusinessChatLink.title = obj;
                            d.b(c2, tL_inputBusinessChatLink, null);
                        }
                        org.telegram.ui.ActionBar.s1[] s1VarArr = this.c;
                        org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                        if (s1Var != null) {
                            s1Var.dismiss();
                        }
                        if (s1VarArr[0] == v.e) {
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
                or orVar = (or) this.f;
                if (i3 == 6) {
                    String obj2 = s4Var.getText().toString();
                    if (obj2.length() > this.b) {
                        org.telegram.messenger.g0.F3(s4Var);
                    } else {
                        orVar.a(obj2);
                        org.telegram.ui.ActionBar.s1 s1Var2 = this.c[0];
                        if (s1Var2 != null) {
                            s1Var2.dismiss();
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
