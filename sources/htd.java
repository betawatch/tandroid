// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class htd {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ htd(String str) {
        this.a = (byte) 4;
        ko9 ko9Var = new ko9((byte) 28, false);
        this.c = ko9Var;
        this.d = ko9Var;
        this.b = str;
    }

    public final String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                ko9 ko9Var = (ko9) ((ko9) this.c).d;
                String str = "";
                while (ko9Var != null) {
                    Object obj = ko9Var.c;
                    sb.append(str);
                    String str2 = (String) ko9Var.b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    ko9Var = (ko9) ko9Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
