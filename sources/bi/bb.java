package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.br;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ EditTextBoldCursor c;

    public /* synthetic */ bb(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = editTextBoldCursor;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        switch (this.a) {
            case 0:
                ((lb0) this.b).c(z9, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 1:
                ((lb0) this.b).c(z9, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 2:
                ((lb0) this.b).c(z9, !TextUtils.isEmpty(this.c.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                passcodeActivity.w.setEditText((br) this.c);
                passcodeActivity.w.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
