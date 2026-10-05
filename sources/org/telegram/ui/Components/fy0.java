package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fy0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    /* JADX WARN: Multi-variable type inference failed */
    public fy0(ry0 ry0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = ry0Var;
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
                org.telegram.ui.kn0 kn0Var = (org.telegram.ui.kn0) this.e;
                String str = (String) this.c;
                boolean z10 = ((HashMap) this.d) == kn0Var.t1;
                EditTextBoldCursor editTextBoldCursor = this.b;
                org.telegram.ui.kn0.J0(kn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = kn0Var.Y[intValue];
                if (intValue == 6) {
                    kn0Var.Y0(true);
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
                    ((ry0) this.e).m0((TextView) this.d, this.b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public fy0(org.telegram.ui.kn0 kn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = kn0Var;
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
