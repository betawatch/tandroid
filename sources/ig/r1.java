package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import ci.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class r1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ o1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ x1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ z2 e;
    public final /* synthetic */ Utilities.Callback f;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] g;
    public final /* synthetic */ View h;

    public r1(o1 o1Var, int i10, x1 x1Var, TextView textView, z2 z2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.a = o1Var;
        this.b = i10;
        this.c = x1Var;
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
        o1 o1Var = this.a;
        String obj = o1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(o1Var);
            return true;
        }
        y1 f7 = y1.f(this.b);
        x1 x1Var = this.c;
        int i11 = x1Var == null ? -1 : x1Var.a;
        x1 d = f7.d(obj);
        if (d != null && d.a != i11) {
            AndroidUtilities.shakeView(o1Var);
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
        if (b2VarArr[0] == v1.h) {
            v1.h = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
