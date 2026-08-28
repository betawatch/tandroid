package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j81 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ org.telegram.ui.Components.fc0 d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ TextView f;

    public j81(int i9, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.fc0 fc0Var, int[] iArr, TextView textView) {
        this.b = i9;
        this.c = editTextBoldCursor;
        this.d = fc0Var;
        this.e = iArr;
        this.f = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        double d;
        org.telegram.ui.Components.fc0 fc0Var = this.d;
        int i9 = this.b;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (this.a) {
            return;
        }
        try {
            d = TextUtils.isEmpty(editable) ? 0.0d : Double.parseDouble(editable.toString());
            try {
                double d9 = MessagesController.getInstance(i9).tonStakeddiceStakeAmountMax / 1.0E9d;
                int[] iArr = this.e;
                if (d > d9) {
                    this.a = true;
                    d = MessagesController.getInstance(i9).tonStakeddiceStakeAmountMax / 1.0E9d;
                    editTextBoldCursor.setText(Double.toString(d));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i10 = -iArr[0];
                    iArr[0] = i10;
                    AndroidUtilities.shakeViewSpring(fc0Var, i10);
                } else if (d > 0.0d && d < MessagesController.getInstance(i9).tonStakeddiceStakeAmountMin / 1.0E9d) {
                    this.a = true;
                    d = MessagesController.getInstance(i9).tonStakeddiceStakeAmountMin / 1.0E9d;
                    editTextBoldCursor.setText(Double.toString(d));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i11 = -iArr[0];
                    iArr[0] = i11;
                    AndroidUtilities.shakeViewSpring(fc0Var, i11);
                }
            } catch (Exception unused) {
                this.a = true;
                editTextBoldCursor.setText(d <= 0.0d ? "" : Double.toString(d));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                this.a = false;
                fc0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
                TextView textView = this.f;
                if (d != 0.0d) {
                }
            }
        } catch (Exception unused2) {
            d = 0.0d;
        }
        this.a = false;
        fc0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView2 = this.f;
        if (d != 0.0d) {
            textView2.animate().alpha(0.0f).start();
            textView2.setText("");
        } else {
            textView2.animate().alpha(1.0f).start();
            textView2.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i9).config.tonUsdRate.get() * d * 100.0d), "USD", 2));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
