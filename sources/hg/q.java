package hg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2[] c;
    public final /* synthetic */ View d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.a2[] a2VarArr, View view, int i11) {
        this.a = i11;
        this.e = editTextBoldCursor;
        this.b = i10;
        this.f = obj;
        this.c = a2VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                u uVar = (u) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f;
                if (i10 == 6) {
                    String obj = uVar.getText().toString();
                    if (obj.length() <= 32) {
                        a0 d = a0.d(this.b);
                        TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = c10.message;
                            tL_inputBusinessChatLink.entities = c10.entities;
                            tL_inputBusinessChatLink.title = obj;
                            d.b(c10, tL_inputBusinessChatLink, null);
                        }
                        org.telegram.ui.ActionBar.a2[] a2VarArr = this.c;
                        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                        if (a2Var != null) {
                            a2Var.dismiss();
                        }
                        if (a2VarArr[0] == x.d) {
                            x.d = null;
                        }
                        View view = this.d;
                        if (view != null) {
                            view.requestFocus();
                            break;
                        }
                    } else {
                        AndroidUtilities.shakeView(uVar);
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
                        org.telegram.ui.ActionBar.a2 a2Var2 = this.c[0];
                        if (a2Var2 != null) {
                            a2Var2.dismiss();
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
