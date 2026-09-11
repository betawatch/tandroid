package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class u1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ r1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ a2 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ r3 e;
    public final /* synthetic */ Utilities.Callback f;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] g;
    public final /* synthetic */ View h;

    public u1(r1 r1Var, int i10, a2 a2Var, TextView textView, r3 r3Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.a = r1Var;
        this.b = i10;
        this.c = a2Var;
        this.d = textView;
        this.e = r3Var;
        this.f = callback;
        this.g = b2VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        r1 r1Var = this.a;
        String obj = r1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(r1Var);
            return true;
        }
        b2 f7 = b2.f(this.b);
        a2 a2Var = this.c;
        int i11 = a2Var == null ? -1 : a2Var.a;
        a2 d = f7.d(obj);
        if (d != null && d.a != i11) {
            AndroidUtilities.shakeView(r1Var);
            this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            this.e.run(Boolean.TRUE);
            return true;
        }
        this.f.run(obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.g;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == y1.h) {
            y1.h = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
