package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qw0 implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    /* JADX WARN: Multi-variable type inference failed */
    public qw0(cx0 cx0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
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
                org.telegram.ui.wm0 wm0Var = (org.telegram.ui.wm0) this.e;
                String str = (String) this.c;
                boolean z10 = ((HashMap) this.d) == wm0Var.p1;
                EditTextBoldCursor editTextBoldCursor = this.b;
                org.telegram.ui.wm0.I0(wm0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = wm0Var.U[intValue];
                if (intValue == 6) {
                    wm0Var.Y0(true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.a) {
            case 0:
                if (((int[]) this.c)[0] == 2) {
                    ((cx0) this.e).l0((TextView) this.d, this.b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public qw0(org.telegram.ui.wm0 wm0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = wm0Var;
        this.b = editTextBoldCursor;
        this.c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
