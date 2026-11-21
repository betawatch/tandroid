package di;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yb0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class sa implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ yb0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ hi.e h;
    public final /* synthetic */ TextView n;

    public sa(EditTextBoldCursor editTextBoldCursor, yb0 yb0Var, long j3, boolean z10, hi.e eVar, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = yb0Var;
        this.e = j3;
        this.f = z10;
        this.h = eVar;
        this.n = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        long j3;
        yb0 yb0Var = this.d;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (this.a) {
            return;
        }
        try {
            j3 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
            try {
                if (j3 > mp.u1(j10.t0).V5) {
                    this.a = true;
                    j3 = mp.u1(j10.t0).V5;
                    editTextBoldCursor.setText(Long.toString(j3));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i7 = -this.b;
                    this.b = i7;
                    org.telegram.messenger.g0.E3(i7, yb0Var, null);
                }
            } catch (Exception unused) {
                this.a = true;
                long j10 = this.e;
                editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                this.a = false;
                if (!this.f) {
                }
                yb0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
                TextView textView = this.n;
                if (j3 != 0) {
                }
            }
        } catch (Exception unused2) {
            j3 = 0;
        }
        this.a = false;
        if (!this.f) {
            this.h.setEnabled(j3 > 0);
        }
        yb0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView2 = this.n;
        if (j3 != 0) {
            textView2.animate().alpha(0.0f).start();
            textView2.setText("");
        } else {
            textView2.animate().alpha(1.0f).start();
            textView2.setText("≈" + org.telegram.messenger.r1.i().f((long) ((j3 / 1000.0d) * mp.u1(j10.t0).f6), "USD"));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
