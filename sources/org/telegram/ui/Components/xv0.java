package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class xv0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.fs e;

    /* JADX WARN: Multi-variable type inference failed */
    public xv0(kw0 kw0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = kw0Var;
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
                org.telegram.ui.hk0 hk0Var = (org.telegram.ui.hk0) this.e;
                String str = (String) this.c;
                boolean z10 = ((HashMap) this.d) == hk0Var.u1;
                EditTextBoldCursor editTextBoldCursor = this.b;
                org.telegram.ui.hk0.N0(hk0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = hk0Var.Z[intValue];
                if (intValue == 6) {
                    hk0Var.c1(true);
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
                    ((kw0) this.e).L0((TextView) this.d, this.b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public xv0(org.telegram.ui.hk0 hk0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = hk0Var;
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
