// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ae0 extends wp5 {
    public static final Pattern e = gl6.m;

    @Override // wp5
    public final yi6 b() {
        int i = this.d + 1;
        this.d = i;
        gl6 gl6Var = this.a;
        gl6Var.g = i;
        if (gl6Var.d() == '\n') {
            p24 p24Var = new p24((byte) 1);
            this.d++;
            return p24Var;
        }
        if (this.d < this.c.length()) {
            String str = this.c;
            int i2 = this.d;
            if (e.matcher(str.substring(i2, i2 + 1)).matches()) {
                String str2 = this.c;
                int i3 = this.d;
                this.a.getClass();
                qkb qkbVar = new qkb(str2.substring(i3, i3 + 1));
                this.d++;
                return qkbVar;
            }
        }
        return e("\\");
    }

    @Override // wp5
    public final char c() {
        return '\\';
    }
}
