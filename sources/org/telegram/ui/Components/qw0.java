package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qw0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.vs e;

    /* JADX WARN: Multi-variable type inference failed */
    public qw0(dx0 dx0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = dx0Var;
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
                org.telegram.ui.jl0 jl0Var = (org.telegram.ui.jl0) this.e;
                String str = (String) this.c;
                boolean z10 = ((HashMap) this.d) == jl0Var.t1;
                EditTextBoldCursor editTextBoldCursor = this.b;
                org.telegram.ui.jl0.N0(jl0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = jl0Var.Y[intValue];
                if (intValue == 6) {
                    jl0Var.c1(true);
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
                    ((dx0) this.e).K0((TextView) this.d, this.b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public qw0(org.telegram.ui.jl0 jl0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = jl0Var;
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
