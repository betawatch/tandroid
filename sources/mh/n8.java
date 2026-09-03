package mh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.cs;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n8 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ EditTextBoldCursor c;

    public /* synthetic */ n8(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = editTextBoldCursor;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.a) {
            case 0:
                ((cd0) this.b).c(z4, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 1:
                ((cd0) this.b).c(z4, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 2:
                ((cd0) this.b).c(z4, !TextUtils.isEmpty(this.c.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                passcodeActivity.v.setEditText((cs) this.c);
                passcodeActivity.v.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
