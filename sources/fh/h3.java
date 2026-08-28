package fh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h3 implements TextView.OnEditorActionListener {
    public final /* synthetic */ g3 a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] c;
    public final /* synthetic */ View d;

    public h3(g3 g3Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.a = g3Var;
        this.b = callback;
        this.c = c2VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        if (i9 != 6) {
            return false;
        }
        g3 g3Var = this.a;
        String obj = g3Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 12) {
            AndroidUtilities.shakeView(g3Var);
            return true;
        }
        this.b.run(obj);
        org.telegram.ui.ActionBar.c2 c2Var = this.c[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        View view = this.d;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
