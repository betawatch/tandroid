package ci;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class za implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ gb0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ gi.d h;
    public final /* synthetic */ TextView n;

    public za(EditTextBoldCursor editTextBoldCursor, gb0 gb0Var, long j10, boolean z10, gi.d dVar, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = gb0Var;
        this.e = j10;
        this.f = z10;
        this.h = dVar;
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
        long j10;
        gb0 gb0Var = this.d;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (this.a) {
            return;
        }
        try {
            j10 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
            try {
                if (j10 > hp.s1(h10.t0).S5) {
                    this.a = true;
                    j10 = hp.s1(h10.t0).S5;
                    editTextBoldCursor.setText(Long.toString(j10));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i3 = -this.b;
                    this.b = i3;
                    org.telegram.messenger.g0.G3(i3, gb0Var, null);
                }
            } catch (Exception unused) {
                this.a = true;
                long j11 = this.e;
                editTextBoldCursor.setText(j11 <= 0 ? "" : Long.toString(j11));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                this.a = false;
                if (!this.f) {
                }
                gb0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
                TextView textView = this.n;
                if (j10 != 0) {
                }
            }
        } catch (Exception unused2) {
            j10 = 0;
        }
        this.a = false;
        if (!this.f) {
            this.h.setEnabled(j10 > 0);
        }
        gb0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView2 = this.n;
        if (j10 != 0) {
            textView2.animate().alpha(0.0f).start();
            textView2.setText("");
        } else {
            textView2.animate().alpha(1.0f).start();
            textView2.setText("≈" + org.telegram.messenger.r1.i().f((long) ((j10 / 1000.0d) * hp.s1(h10.t0).c6), "USD"));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
