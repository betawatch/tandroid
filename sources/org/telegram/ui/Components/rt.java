package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rt implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        Editable text;
        cj0[] cj0VarArr;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.a;
                return Boolean.valueOf(editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((cj0VarArr = (cj0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), cj0.class)) == null || cj0VarArr.length == 0));
            default:
                return ((u40) obj).getCloseIntoObject();
        }
    }
}
