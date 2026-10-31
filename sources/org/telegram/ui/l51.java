package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l51 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ org.telegram.ui.Components.ec0 d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ TextView f;

    public l51(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.ec0 ec0Var, int[] iArr, TextView textView) {
        this.b = i10;
        this.c = editTextBoldCursor;
        this.d = ec0Var;
        this.e = iArr;
        this.f = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        double d;
        double d10;
        double d11;
        int[] iArr;
        org.telegram.ui.Components.ec0 ec0Var = this.d;
        int i10 = this.b;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (this.a) {
            return;
        }
        try {
            d10 = TextUtils.isEmpty(editable) ? 0.0d : Double.parseDouble(editable.toString());
            try {
                d11 = org.telegram.messenger.vp.r1(i10).b7 / 1.0E9d;
                iArr = this.e;
            } catch (Exception unused) {
                d = 0.0d;
            }
        } catch (Exception unused2) {
            d = 0.0d;
            d10 = 0.0d;
        }
        if (d10 > d11) {
            this.a = true;
            d10 = org.telegram.messenger.vp.r1(i10).b7 / 1.0E9d;
            editTextBoldCursor.setText(Double.toString(d10));
            editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            int i11 = -iArr[0];
            iArr[0] = i11;
            org.telegram.messenger.i0.F3(i11, ec0Var, null);
        } else if (d10 > 0.0d) {
            d = 0.0d;
            try {
                if (d10 < org.telegram.messenger.vp.r1(i10).a7 / 1.0E9d) {
                    this.a = true;
                    d10 = org.telegram.messenger.vp.r1(i10).a7 / 1.0E9d;
                    editTextBoldCursor.setText(Double.toString(d10));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i12 = -iArr[0];
                    iArr[0] = i12;
                    org.telegram.messenger.i0.F3(i12, ec0Var, null);
                }
            } catch (Exception unused3) {
                this.a = true;
                editTextBoldCursor.setText(d10 <= d ? "" : Double.toString(d10));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                this.a = false;
                ec0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
                TextView textView = this.f;
                if (d10 == d) {
                }
            }
            this.a = false;
            ec0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
            TextView textView2 = this.f;
            if (d10 == d) {
                textView2.animate().alpha(0.0f).start();
                textView2.setText("");
                return;
            }
            textView2.animate().alpha(1.0f).start();
            StringBuilder sb2 = new StringBuilder("≈");
            org.telegram.messenger.u1 i13 = org.telegram.messenger.u1.i();
            long j10 = (long) (d10 * ((org.telegram.messenger.k0) org.telegram.messenger.vp.r1(i10).y7.l.b).a * 100.0d);
            i13.getClass();
            sb2.append(org.telegram.messenger.u1.g("USD", 2, j10, false));
            textView2.setText(sb2.toString());
            return;
        }
        d = 0.0d;
        this.a = false;
        ec0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView22 = this.f;
        if (d10 == d) {
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
