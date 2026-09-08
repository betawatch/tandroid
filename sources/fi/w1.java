package fi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.gs;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ EditTextBoldCursor c;

    public /* synthetic */ w1(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = editTextBoldCursor;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                ((zc0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 1:
                ((zc0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 2:
                ((zc0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                passcodeActivity.v.setEditText((gs) this.c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
