package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lv0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.ls e;

    /* JADX WARN: Multi-variable type inference failed */
    public lv0(yv0 yv0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = yv0Var;
        this.c = iArr;
        this.d = textView;
        this.b = editTextBoldCursor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                break;
            default:
                org.telegram.ui.bk0 bk0Var = (org.telegram.ui.bk0) this.e;
                String str = (String) this.c;
                boolean z9 = ((HashMap) this.d) == bk0Var.t1;
                EditTextBoldCursor editTextBoldCursor = this.b;
                org.telegram.ui.bk0.N0(bk0Var, editTextBoldCursor, str, editable, z9);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = bk0Var.Y[intValue];
                if (intValue == 6) {
                    bk0Var.c1(true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 0:
                if (((int[]) this.c)[0] == 2) {
                    ((yv0) this.e).K0((TextView) this.d, this.b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public lv0(org.telegram.ui.bk0 bk0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = bk0Var;
        this.b = editTextBoldCursor;
        this.c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
