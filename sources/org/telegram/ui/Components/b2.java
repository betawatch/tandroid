package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] c;
    public final /* synthetic */ View d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b2(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.d2[] d2VarArr, View view, int i11) {
        this.a = i11;
        this.e = editTextBoldCursor;
        this.b = i10;
        this.f = obj;
        this.c = d2VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f;
                if (i10 == 6) {
                    EditTextBoldCursor editTextBoldCursor = this.e;
                    String obj = editTextBoldCursor.getText().toString();
                    if (obj.length() <= this.b) {
                        stringCallback.run(obj);
                        org.telegram.ui.ActionBar.d2 d2Var = this.c[0];
                        if (d2Var != null) {
                            d2Var.dismiss();
                        }
                        View view = this.d;
                        if (view != null) {
                            view.requestFocus();
                            break;
                        }
                    } else {
                        AndroidUtilities.shakeView(editTextBoldCursor);
                        break;
                    }
                }
                break;
            default:
                uf.n nVar = (uf.n) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f;
                if (i10 == 6) {
                    String obj2 = nVar.getText().toString();
                    if (obj2.length() <= 32) {
                        uf.t d = uf.t.d(this.b);
                        TL_account.TL_businessChatLink c3 = d.c(tL_businessChatLink.link);
                        if (c3 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = c3.message;
                            tL_inputBusinessChatLink.entities = c3.entities;
                            tL_inputBusinessChatLink.title = obj2;
                            d.b(c3, tL_inputBusinessChatLink, null);
                        }
                        org.telegram.ui.ActionBar.d2[] d2VarArr = this.c;
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                        if (d2Var2 != null) {
                            d2Var2.dismiss();
                        }
                        if (d2VarArr[0] == uf.q.d) {
                            uf.q.d = null;
                        }
                        View view2 = this.d;
                        if (view2 != null) {
                            view2.requestFocus();
                            break;
                        }
                    } else {
                        AndroidUtilities.shakeView(nVar);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
