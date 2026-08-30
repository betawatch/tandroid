package lh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class i9 implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ ad0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ph.d h;
    public final /* synthetic */ TextView n;

    public i9(EditTextBoldCursor editTextBoldCursor, ad0 ad0Var, long j10, boolean z4, ph.d dVar, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = ad0Var;
        this.e = j10;
        this.f = z4;
        this.h = dVar;
        this.n = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        long j10;
        ad0 ad0Var = this.d;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (this.a) {
            return;
        }
        try {
            j10 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        } catch (Exception unused) {
            j10 = 0;
        }
        try {
            if (j10 > MessagesController.getInstance(UserConfig.selectedAccount).starsPaidPostAmountMax) {
                this.a = true;
                j10 = MessagesController.getInstance(UserConfig.selectedAccount).starsPaidPostAmountMax;
                editTextBoldCursor.setText(Long.toString(j10));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                int i10 = -this.b;
                this.b = i10;
                AndroidUtilities.shakeViewSpring(ad0Var, i10);
            }
        } catch (Exception unused2) {
            this.a = true;
            long j11 = this.e;
            editTextBoldCursor.setText(j11 <= 0 ? "" : Long.toString(j11));
            editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            this.a = false;
            if (!this.f) {
            }
            ad0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
            TextView textView = this.n;
            if (j10 != 0) {
            }
        }
        this.a = false;
        if (!this.f) {
            this.h.setEnabled(j10 > 0);
        }
        ad0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView2 = this.n;
        if (j10 != 0) {
            textView2.animate().alpha(0.0f).start();
            textView2.setText("");
        } else {
            textView2.animate().alpha(1.0f).start();
            textView2.setText("≈" + BillingController.getInstance().formatCurrency((long) ((j10 / 1000.0d) * MessagesController.getInstance(UserConfig.selectedAccount).starsUsdWithdrawRate1000), "USD"));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
