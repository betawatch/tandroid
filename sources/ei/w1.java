package ei;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.gs;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ((yc0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 1:
                ((yc0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 2:
                ((yc0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                passcodeActivity.v.setEditText((gs) this.c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
