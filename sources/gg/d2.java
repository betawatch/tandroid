package gg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ a2 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ j2 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ u1 e;
    public final /* synthetic */ Utilities.Callback f;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] g;
    public final /* synthetic */ View h;

    public d2(a2 a2Var, int i10, j2 j2Var, TextView textView, u1 u1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.a = a2Var;
        this.b = i10;
        this.c = j2Var;
        this.d = textView;
        this.e = u1Var;
        this.f = callback;
        this.g = d2VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        a2 a2Var = this.a;
        String obj = a2Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(a2Var);
            return true;
        }
        k2 f7 = k2.f(this.b);
        j2 j2Var = this.c;
        int i11 = j2Var == null ? -1 : j2Var.a;
        j2 d = f7.d(obj);
        if (d != null && d.a != i11) {
            AndroidUtilities.shakeView(a2Var);
            this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            this.e.run(Boolean.TRUE);
            return true;
        }
        this.f.run(obj);
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.g;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
        if (d2VarArr[0] == h2.h) {
            h2.h = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
