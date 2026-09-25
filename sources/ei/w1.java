package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.as;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                ((jd0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 1:
                ((jd0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 2:
                ((jd0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                passcodeActivity.v.setEditText((as) this.c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
