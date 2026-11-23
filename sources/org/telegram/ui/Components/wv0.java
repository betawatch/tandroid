package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wv0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.fs e;

    /* JADX WARN: Multi-variable type inference failed */
    public wv0(jw0 jw0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = jw0Var;
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
                org.telegram.ui.fk0 fk0Var = (org.telegram.ui.fk0) this.e;
                String str = (String) this.c;
                boolean z10 = ((HashMap) this.d) == fk0Var.u1;
                EditTextBoldCursor editTextBoldCursor = this.b;
                org.telegram.ui.fk0.N0(fk0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = fk0Var.Z[intValue];
                if (intValue == 6) {
                    fk0Var.c1(true);
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
                    ((jw0) this.e).L0((TextView) this.d, this.b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public wv0(org.telegram.ui.fk0 fk0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = fk0Var;
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
