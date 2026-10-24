package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.e5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] c;
    public final /* synthetic */ View d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.c2[] c2VarArr, View view, int i11) {
        this.a = i11;
        this.e = editTextBoldCursor;
        this.b = i10;
        this.f = obj;
        this.c = c2VarArr;
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
                    if (obj.length() > 32) {
                        AndroidUtilities.shakeView(sVar);
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
                        org.telegram.ui.ActionBar.c2[] c2VarArr = this.c;
                        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                        if (c2Var != null) {
                            c2Var.dismiss();
                        }
                        if (c2VarArr[0] == v.d) {
                            v.d = null;
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
                e5 e5Var = (e5) this.e;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f;
                if (i10 == 6) {
                    String obj2 = e5Var.getText().toString();
                    if (obj2.length() > this.b) {
                        AndroidUtilities.shakeView(e5Var);
                    } else {
                        stringCallback.run(obj2);
                        org.telegram.ui.ActionBar.c2 c2Var2 = this.c[0];
                        if (c2Var2 != null) {
                            c2Var2.dismiss();
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
