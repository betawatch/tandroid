// default package

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nf6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pf6 b;

    public /* synthetic */ nf6(pf6 pf6Var, byte b) {
        this.a = b;
        this.b = pf6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pf6 pf6Var = this.b;
        switch (b) {
            case 0:
                l7 l7Var = pf6Var.c;
                l7Var.requestFocus();
                String str = pf6Var.L;
                if (str != null && str.length() > 1) {
                    String obj = l7Var.getText().toString();
                    int length = obj.length();
                    int i = 0;
                    while (i < length && obj.charAt(i) <= ' ') {
                        i++;
                    }
                    int length2 = pf6Var.L.length() + i;
                    l7Var.setSelection(Utilities.j(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), l7Var.getText().length());
                    break;
                } else {
                    l7Var.setSelection(0, l7Var.getText().length());
                    break;
                }
                break;
            case 1:
                pf6Var.p(true);
                break;
            case 2:
                pf6Var.n(false);
                break;
            default:
                l7 l7Var2 = pf6Var.c;
                if (l7Var2 != null) {
                    l7Var2.requestFocus();
                    l7Var2.setSelection(l7Var2.length());
                    gm.E3(l7Var2);
                    break;
                }
                break;
        }
    }
}
