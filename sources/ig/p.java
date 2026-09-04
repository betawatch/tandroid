package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] c;
    public final /* synthetic */ View d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.b2[] b2VarArr, View view, int i11) {
        this.a = i11;
        this.e = editTextBoldCursor;
        this.b = i10;
        this.f = obj;
        this.c = b2VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                s sVar = (s) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f;
                if (i10 == 6) {
                    String obj = sVar.getText().toString();
                    if (obj.length() <= 32) {
                        y d = y.d(this.b);
                        TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = c10.message;
                            tL_inputBusinessChatLink.entities = c10.entities;
                            tL_inputBusinessChatLink.title = obj;
                            d.b(c10, tL_inputBusinessChatLink, null);
                        }
                        org.telegram.ui.ActionBar.b2[] b2VarArr = this.c;
                        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                        if (b2Var != null) {
                            b2Var.dismiss();
                        }
                        if (b2VarArr[0] == v.d) {
                            v.d = null;
                        }
                        View view = this.d;
                        if (view != null) {
                            view.requestFocus();
                            break;
                        }
                    } else {
                        AndroidUtilities.shakeView(sVar);
                        break;
                    }
                }
                break;
            default:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f;
                if (i10 == 6) {
                    EditTextBoldCursor editTextBoldCursor = this.e;
                    String obj2 = editTextBoldCursor.getText().toString();
                    if (obj2.length() <= this.b) {
                        stringCallback.run(obj2);
                        org.telegram.ui.ActionBar.b2 b2Var2 = this.c[0];
                        if (b2Var2 != null) {
                            b2Var2.dismiss();
                        }
                        View view2 = this.d;
                        if (view2 != null) {
                            view2.requestFocus();
                            break;
                        }
                    } else {
                        AndroidUtilities.shakeView(editTextBoldCursor);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
