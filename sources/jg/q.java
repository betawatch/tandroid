package jg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2[] c;
    public final /* synthetic */ View d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.e2[] e2VarArr, View view, int i11) {
        this.a = i11;
        this.e = editTextBoldCursor;
        this.b = i10;
        this.f = obj;
        this.c = e2VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                t tVar = (t) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f;
                if (i10 == 6) {
                    String obj = tVar.getText().toString();
                    if (obj.length() > 32) {
                        AndroidUtilities.shakeView(tVar);
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
                        org.telegram.ui.ActionBar.e2[] e2VarArr = this.c;
                        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                        if (e2Var != null) {
                            e2Var.dismiss();
                        }
                        if (e2VarArr[0] == w.e) {
                            w.e = null;
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
                f5 f5Var = (f5) this.e;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f;
                if (i10 == 6) {
                    String obj2 = f5Var.getText().toString();
                    if (obj2.length() > this.b) {
                        AndroidUtilities.shakeView(f5Var);
                    } else {
                        stringCallback.run(obj2);
                        org.telegram.ui.ActionBar.e2 e2Var2 = this.c[0];
                        if (e2Var2 != null) {
                            e2Var2.dismiss();
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
