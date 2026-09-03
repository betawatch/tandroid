package kh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class v2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ u2 a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] c;
    public final /* synthetic */ View d;

    public v2(u2 u2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.a = u2Var;
        this.b = callback;
        this.c = d2VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        u2 u2Var = this.a;
        String obj = u2Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 12) {
            AndroidUtilities.shakeView(u2Var);
            return true;
        }
        this.b.run(obj);
        org.telegram.ui.ActionBar.d2 d2Var = this.c[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
        View view = this.d;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
