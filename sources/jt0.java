// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jt0 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ EditTextBoldCursor c;

    public /* synthetic */ jt0(Object obj, EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = obj;
        this.c = editTextBoldCursor;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((er7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                break;
            case 1:
                ((er7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                break;
            case 2:
                ((er7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.w.setEditText((sj2) editTextBoldCursor);
                passcodeActivity.w.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
