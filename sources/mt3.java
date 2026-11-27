// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mt3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ot3 d;

    public mt3(ot3 ot3Var, int i, xt3 xt3Var, boolean z) {
        this.d = ot3Var;
        this.a = i;
        this.b = xt3Var;
        this.c = z;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ot3 ot3Var = this.d;
        boolean z = ot3Var.a;
        int i = this.a;
        if (!z) {
            if (i > 0 && editable != null && editable.length() > i) {
                ot3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i);
                xt3 xt3Var = this.b;
                xt3Var.setText(subSequence);
                xt3Var.setSelection(xt3Var.length());
                ot3Var.a = false;
            }
            ot3Var.b(editable);
        }
        if (this.c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                } else {
                    editable.delete(indexOf, indexOf + 1);
                }
            }
        }
        hn hnVar = ot3Var.y;
        if (hnVar == null || i <= 0) {
            return;
        }
        hnVar.a();
        ot3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
