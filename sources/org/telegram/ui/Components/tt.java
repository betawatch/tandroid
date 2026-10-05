package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tt implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        Editable text;
        ej0[] ej0VarArr;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int i11 = EditTextBoldCursor.a;
                return Boolean.valueOf(editTextBoldCursor.hasSelection() && editTextBoldCursor.getSelectionStart() >= 0 && editTextBoldCursor.getSelectionEnd() >= 0 && editTextBoldCursor.getSelectionStart() != editTextBoldCursor.getSelectionEnd() && (text = editTextBoldCursor.getText()) != null && ((ej0VarArr = (ej0[]) text.getSpans(editTextBoldCursor.getSelectionStart(), editTextBoldCursor.getSelectionEnd(), ej0.class)) == null || ej0VarArr.length == 0));
            default:
                return ((x40) obj).getCloseIntoObject();
        }
    }
}
