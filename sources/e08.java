// default package

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class e08 implements TextWatcher {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ fn7 e;

    /* JADX WARN: Multi-variable type inference failed */
    public e08(s4b s4bVar, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = s4bVar;
        this.c = iArr;
        this.d = textView;
        this.b = editTextBoldCursor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                b18 b18Var = (b18) this.e;
                String str = (String) this.c;
                boolean z = ((HashMap) this.d) == b18Var.u1;
                EditTextBoldCursor editTextBoldCursor = this.b;
                b18Var.P0(editTextBoldCursor, str, editable, z);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = b18Var.Z[intValue];
                if (intValue == 6) {
                    b18Var.R0(true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (((int[]) this.c)[0] == 2) {
                    ((s4b) this.e).F0((TextView) this.d, this.b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public e08(b18 b18Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = b18Var;
        this.b = editTextBoldCursor;
        this.c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
