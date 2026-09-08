package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ot(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        Editable text;
        ri0[] ri0VarArr;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.a;
                return Boolean.valueOf(editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((ri0VarArr = (ri0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), ri0.class)) == null || ri0VarArr.length == 0));
            default:
                return ((t40) obj).getCloseIntoObject();
        }
    }
}
