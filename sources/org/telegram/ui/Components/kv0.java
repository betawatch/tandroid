package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kv0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.cs e;

    /* JADX WARN: Multi-variable type inference failed */
    public kv0(xv0 xv0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = xv0Var;
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
                org.telegram.ui.yj0 yj0Var = (org.telegram.ui.yj0) this.e;
                String str = (String) this.c;
                boolean z10 = ((HashMap) this.d) == yj0Var.u1;
                EditTextBoldCursor editTextBoldCursor = this.b;
                org.telegram.ui.yj0.N0(yj0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = yj0Var.Z[intValue];
                if (intValue == 6) {
                    yj0Var.c1(true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.a) {
            case 0:
                if (((int[]) this.c)[0] == 2) {
                    ((xv0) this.e).K0((TextView) this.d, this.b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public kv0(org.telegram.ui.yj0 yj0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = yj0Var;
        this.b = editTextBoldCursor;
        this.c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
