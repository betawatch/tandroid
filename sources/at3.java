// default package

import android.text.Editable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class at3 implements p8c {
    public final /* synthetic */ gt3 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ at3(gt3 gt3Var, int i, int i2) {
        this.a = gt3Var;
        this.b = i;
        this.c = i2;
    }

    @Override // p8c
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        gt3 gt3Var = this.a;
        Editable text = gt3Var.getText();
        int i = this.b;
        text.replace(i, this.c, charSequence);
        gt3Var.setSelection(i, charSequence.length() + i);
    }
}
