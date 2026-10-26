package jg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import di.y2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ s1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ b2 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ y2 e;
    public final /* synthetic */ Utilities.Callback f;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2[] g;
    public final /* synthetic */ View h;

    public v1(s1 s1Var, int i10, b2 b2Var, TextView textView, y2 y2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.e2[] e2VarArr, View view) {
        this.a = s1Var;
        this.b = i10;
        this.c = b2Var;
        this.d = textView;
        this.e = y2Var;
        this.f = callback;
        this.g = e2VarArr;
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
        org.telegram.ui.ActionBar.e2[] e2VarArr = this.g;
        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
        if (e2Var != null) {
            e2Var.dismiss();
        }
        if (e2VarArr[0] == z1.f) {
            z1.f = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
