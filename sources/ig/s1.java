package ig;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import ci.y2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class s1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ p1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ y1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ y2 e;
    public final /* synthetic */ Utilities.Callback f;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] g;
    public final /* synthetic */ View h;

    public s1(p1 p1Var, int i10, y1 y1Var, TextView textView, y2 y2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.a = p1Var;
        this.b = i10;
        this.c = y1Var;
        this.d = textView;
        this.e = y2Var;
        this.f = callback;
        this.g = c2VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        p1 p1Var = this.a;
        String obj = p1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(p1Var);
            return true;
        }
        z1 f7 = z1.f(this.b);
        y1 y1Var = this.c;
        int i11 = y1Var == null ? -1 : y1Var.a;
        y1 d = f7.d(obj);
        if (d != null && d.a != i11) {
            AndroidUtilities.shakeView(p1Var);
            this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            this.e.run(Boolean.TRUE);
            return true;
        }
        this.f.run(obj);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.g;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (c2VarArr[0] == w1.h) {
            w1.h = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
