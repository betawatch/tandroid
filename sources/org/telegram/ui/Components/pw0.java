package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pw0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.us e;

    /* JADX WARN: Multi-variable type inference failed */
    public pw0(cx0 cx0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = cx0Var;
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
                org.telegram.ui.ll0 ll0Var = (org.telegram.ui.ll0) this.e;
                String str = (String) this.c;
                boolean z10 = ((HashMap) this.d) == ll0Var.t1;
                EditTextBoldCursor editTextBoldCursor = this.b;
                org.telegram.ui.ll0.M0(ll0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = ll0Var.Y[intValue];
                if (intValue == 6) {
                    ll0Var.b1(true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                if (((int[]) this.c)[0] == 2) {
                    ((cx0) this.e).K0((TextView) this.d, this.b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public pw0(org.telegram.ui.ll0 ll0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = ll0Var;
        this.b = editTextBoldCursor;
        this.c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
