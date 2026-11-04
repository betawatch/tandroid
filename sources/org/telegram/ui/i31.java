package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i31 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ org.telegram.ui.Components.gb0 d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ TextView f;

    public i31(int i3, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.gb0 gb0Var, int[] iArr, TextView textView) {
        this.b = i3;
        this.c = editTextBoldCursor;
        this.d = gb0Var;
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
        org.telegram.ui.Components.gb0 gb0Var = this.d;
        int i3 = this.b;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (this.a) {
            return;
        }
        try {
            d10 = TextUtils.isEmpty(editable) ? 0.0d : Double.parseDouble(editable.toString());
            try {
                d11 = org.telegram.messenger.hp.s1(i3).a7 / 1.0E9d;
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
            d10 = org.telegram.messenger.hp.s1(i3).a7 / 1.0E9d;
            editTextBoldCursor.setText(Double.toString(d10));
            editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            int i10 = -iArr[0];
            iArr[0] = i10;
            org.telegram.messenger.g0.G3(i10, gb0Var, null);
        } else if (d10 > 0.0d) {
            d = 0.0d;
            try {
                if (d10 < org.telegram.messenger.hp.s1(i3).Z6 / 1.0E9d) {
                    this.a = true;
                    d10 = org.telegram.messenger.hp.s1(i3).Z6 / 1.0E9d;
                    editTextBoldCursor.setText(Double.toString(d10));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i11 = -iArr[0];
                    iArr[0] = i11;
                    org.telegram.messenger.g0.G3(i11, gb0Var, null);
                }
            } catch (Exception unused3) {
                this.a = true;
                editTextBoldCursor.setText(d10 <= d ? "" : Double.toString(d10));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                this.a = false;
                gb0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
                TextView textView = this.f;
                if (d10 == d) {
                }
            }
            this.a = false;
            gb0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
            TextView textView2 = this.f;
            if (d10 == d) {
                textView2.animate().alpha(0.0f).start();
                textView2.setText("");
                return;
            }
            textView2.animate().alpha(1.0f).start();
            StringBuilder sb2 = new StringBuilder("≈");
            org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
            long j10 = (long) (d10 * ((org.telegram.messenger.i0) org.telegram.messenger.hp.s1(i3).x7.l.b).a * 100.0d);
            i12.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, j10, false));
            textView2.setText(sb2.toString());
            return;
        }
        d = 0.0d;
        this.a = false;
        gb0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView22 = this.f;
        if (d10 == d) {
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
