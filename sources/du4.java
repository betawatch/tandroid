// default package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class du4 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = gcc.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r0.apply(r6) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(vf7 vf7Var) {
        tf7 tf7Var;
        vf7Var.getClass();
        mo5 p = po5.p();
        tf7[] tf7VarArr = vf7Var.a;
        int length = tf7VarArr.length;
        int i = 0;
        while (true) {
            tf7 tf7Var2 = null;
            if (i >= length) {
                break;
            }
            tf7 tf7Var3 = tf7VarArr[i];
            if (en2.class.isAssignableFrom(tf7Var3.getClass())) {
                tf7 tf7Var4 = (tf7) en2.class.cast(tf7Var3);
                if (((en2) tf7Var4).c.equals("iTunSMPB")) {
                    tf7Var2 = tf7Var4;
                }
            }
            if (tf7Var2 != null) {
                p.c(tf7Var2);
            }
            i++;
        }
        no5 listIterator = p.f().listIterator(0);
        while (listIterator.hasNext()) {
            if (a(((en2) listIterator.next()).d)) {
                return;
            }
        }
        nb3 nb3Var = new nb3((byte) 2);
        mo5 p2 = po5.p();
        for (tf7 tf7Var5 : vf7Var.a) {
            if (qr5.class.isAssignableFrom(tf7Var5.getClass())) {
                tf7Var = (tf7) qr5.class.cast(tf7Var5);
            }
            tf7Var = null;
            if (tf7Var != null) {
                p2.c(tf7Var);
            }
        }
        no5 listIterator2 = p2.f().listIterator(0);
        while (listIterator2.hasNext() && !a(((qr5) listIterator2.next()).d)) {
        }
    }
}
