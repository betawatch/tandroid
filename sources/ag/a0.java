package ag;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.fs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.r4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1[] c;
    public final /* synthetic */ View d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a0(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.x1[] x1VarArr, View view, int i11) {
        this.a = i11;
        this.e = editTextBoldCursor;
        this.b = i10;
        this.f = obj;
        this.c = x1VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f;
                if (i10 == 6) {
                    String obj = f0Var.getText().toString();
                    if (obj.length() > 32) {
                        org.telegram.messenger.i0.E3(f0Var);
                    } else {
                        s0 d = s0.d(this.b);
                        TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                        if (c10 != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = c10.message;
                            tL_inputBusinessChatLink.entities = c10.entities;
                            tL_inputBusinessChatLink.title = obj;
                            d.b(c10, tL_inputBusinessChatLink, null);
                        }
                        org.telegram.ui.ActionBar.x1[] x1VarArr = this.c;
                        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                        if (x1Var != null) {
                            x1Var.dismiss();
                        }
                        if (x1VarArr[0] == i0.e) {
                            i0.e = null;
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
                r4 r4Var = (r4) this.e;
                fs fsVar = (fs) this.f;
                if (i10 == 6) {
                    String obj2 = r4Var.getText().toString();
                    if (obj2.length() > this.b) {
                        org.telegram.messenger.i0.E3(r4Var);
                    } else {
                        fsVar.a(obj2);
                        org.telegram.ui.ActionBar.x1 x1Var2 = this.c[0];
                        if (x1Var2 != null) {
                            x1Var2.dismiss();
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
