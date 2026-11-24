// default package

import android.text.Editable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ku3 implements qac {
    public final /* synthetic */ qu3 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ku3(qu3 qu3Var, int i, int i2) {
        this.a = qu3Var;
        this.b = i;
        this.c = i2;
    }

    @Override // qac
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        qu3 qu3Var = this.a;
        Editable text = qu3Var.getText();
        int i = this.b;
        text.replace(i, this.c, charSequence);
        qu3Var.setSelection(i, charSequence.length() + i);
    }
}
