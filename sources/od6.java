// default package

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class od6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qd6 b;

    public /* synthetic */ od6(qd6 qd6Var, byte b) {
        this.a = b;
        this.b = qd6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qd6 qd6Var = this.b;
        switch (b) {
            case 0:
                l7 l7Var = qd6Var.c;
                l7Var.requestFocus();
                String str = qd6Var.L;
                if (str != null && str.length() > 1) {
                    String obj = l7Var.getText().toString();
                    int length = obj.length();
                    int i = 0;
                    while (i < length && obj.charAt(i) <= ' ') {
                        i++;
                    }
                    int length2 = qd6Var.L.length() + i;
                    l7Var.setSelection(Utilities.j(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), l7Var.getText().length());
                    break;
                } else {
                    l7Var.setSelection(0, l7Var.getText().length());
                    break;
                }
                break;
            case 1:
                qd6Var.p(true);
                break;
            case 2:
                qd6Var.n(false);
                break;
            default:
                l7 l7Var2 = qd6Var.c;
                if (l7Var2 != null) {
                    l7Var2.requestFocus();
                    l7Var2.setSelection(l7Var2.length());
                    gl.F3(l7Var2);
                    break;
                }
                break;
        }
    }
}
