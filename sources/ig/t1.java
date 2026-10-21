package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import ci.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class t1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ q1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ z1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ z2 e;
    public final /* synthetic */ Utilities.Callback f;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] g;
    public final /* synthetic */ View h;

    public t1(q1 q1Var, int i10, z1 z1Var, TextView textView, z2 z2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.a = q1Var;
        this.b = i10;
        this.c = z1Var;
        this.d = textView;
        this.e = z2Var;
        this.f = callback;
        this.g = b2VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        q1 q1Var = this.a;
        String obj = q1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(q1Var);
            return true;
        }
        a2 f7 = a2.f(this.b);
        z1 z1Var = this.c;
        int i11 = z1Var == null ? -1 : z1Var.a;
        z1 d = f7.d(obj);
        if (d != null && d.a != i11) {
            AndroidUtilities.shakeView(q1Var);
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
        if (b2VarArr[0] == x1.h) {
            x1.h = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
