package gh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m9 implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ fc0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ kh.d h;
    public final /* synthetic */ TextView n;

    public m9(EditTextBoldCursor editTextBoldCursor, fc0 fc0Var, long j10, boolean z10, kh.d dVar, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = fc0Var;
        this.e = j10;
        this.f = z10;
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
        fc0 fc0Var = this.d;
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
                int i9 = -this.b;
                this.b = i9;
                AndroidUtilities.shakeViewSpring(fc0Var, i9);
            }
        } catch (Exception unused2) {
            this.a = true;
            long j11 = this.e;
            editTextBoldCursor.setText(j11 <= 0 ? "" : Long.toString(j11));
            editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            this.a = false;
            if (!this.f) {
            }
            fc0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
            TextView textView = this.n;
            if (j10 != 0) {
            }
        }
        this.a = false;
        if (!this.f) {
            this.h.setEnabled(j10 > 0);
        }
        fc0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
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
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
