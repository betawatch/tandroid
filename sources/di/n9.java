package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.dr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ EditTextBoldCursor c;

    public /* synthetic */ n9(Object obj, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = editTextBoldCursor;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                ((mb0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 1:
                ((mb0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 2:
                ((mb0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                passcodeActivity.w.setEditText((dr) this.c);
                passcodeActivity.w.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
