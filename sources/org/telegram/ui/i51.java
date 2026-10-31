package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i51 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ EditTextBoldCursor c;

    public /* synthetic */ i51(Object obj, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = editTextBoldCursor;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.Components.ec0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 1:
                ((org.telegram.ui.Components.ec0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            case 2:
                ((org.telegram.ui.Components.ec0) this.b).c(z10, !TextUtils.isEmpty(this.c.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                passcodeActivity.w.setEditText((bs) this.c);
                passcodeActivity.w.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
