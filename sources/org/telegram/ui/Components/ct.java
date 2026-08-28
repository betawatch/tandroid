package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ct(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        Editable text;
        ei0[] ei0VarArr;
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i10 = EditTextBoldCursor.a;
                return Boolean.valueOf(editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((ei0VarArr = (ei0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), ei0.class)) == null || ei0VarArr.length == 0));
            default:
                return ((d40) obj).getCloseIntoObject();
        }
    }
}
