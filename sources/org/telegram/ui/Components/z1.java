package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] c;
    public final /* synthetic */ View d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z1(EditTextBoldCursor editTextBoldCursor, int i9, Object obj, org.telegram.ui.ActionBar.c2[] c2VarArr, View view, int i10) {
        this.a = i10;
        this.e = editTextBoldCursor;
        this.b = i9;
        this.f = obj;
        this.c = c2VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f;
                if (i9 == 6) {
                    EditTextBoldCursor editTextBoldCursor = this.e;
                    String obj = editTextBoldCursor.getText().toString();
                    if (obj.length() <= this.b) {
                        stringCallback.run(obj);
                        org.telegram.ui.ActionBar.c2 c2Var = this.c[0];
                        if (c2Var != null) {
                            c2Var.dismiss();
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
                pf.o oVar = (pf.o) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f;
                if (i9 == 6) {
                    String obj2 = oVar.getText().toString();
                    if (obj2.length() <= 32) {
                        pf.u d = pf.u.d(this.b);
                        TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = c10.message;
                            tL_inputBusinessChatLink.entities = c10.entities;
                            tL_inputBusinessChatLink.title = obj2;
                            d.b(c10, tL_inputBusinessChatLink, null);
                        }
                        org.telegram.ui.ActionBar.c2[] c2VarArr = this.c;
                        org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                        if (c2Var2 != null) {
                            c2Var2.dismiss();
                        }
                        if (c2VarArr[0] == pf.r.d) {
                            pf.r.d = null;
                        }
                        View view2 = this.d;
                        if (view2 != null) {
                            view2.requestFocus();
                            break;
                        }
                    } else {
                        AndroidUtilities.shakeView(oVar);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
