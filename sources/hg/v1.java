package hg;

import ai.e4;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class v1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ s1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ b2 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ e4 e;
    public final /* synthetic */ Utilities.Callback f;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] g;
    public final /* synthetic */ View h;

    public v1(s1 s1Var, int i10, b2 b2Var, TextView textView, e4 e4Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.a = s1Var;
        this.b = i10;
        this.c = b2Var;
        this.d = textView;
        this.e = e4Var;
        this.f = callback;
        this.g = b2VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        s1 s1Var = this.a;
        String obj = s1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(s1Var);
            return true;
        }
        c2 f7 = c2.f(this.b);
        b2 b2Var = this.c;
        int i11 = b2Var == null ? -1 : b2Var.a;
        b2 d = f7.d(obj);
        if (d != null && d.a != i11) {
            AndroidUtilities.shakeView(s1Var);
            this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            this.e.run(Boolean.TRUE);
            return true;
        }
        this.f.run(obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.g;
        org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
        if (b2Var2 != null) {
            b2Var2.dismiss();
        }
        if (b2VarArr[0] == z1.h) {
            z1.h = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
