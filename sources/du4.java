// default package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
    public final void b(uf7 uf7Var) {
        sf7 sf7Var;
        uf7Var.getClass();
        mo5 p = po5.p();
        sf7[] sf7VarArr = uf7Var.a;
        int length = sf7VarArr.length;
        int i = 0;
        while (true) {
            sf7 sf7Var2 = null;
            if (i >= length) {
                break;
            }
            sf7 sf7Var3 = sf7VarArr[i];
            if (en2.class.isAssignableFrom(sf7Var3.getClass())) {
                sf7 sf7Var4 = (sf7) en2.class.cast(sf7Var3);
                if (((en2) sf7Var4).c.equals("iTunSMPB")) {
                    sf7Var2 = sf7Var4;
                }
            }
            if (sf7Var2 != null) {
                p.c(sf7Var2);
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
        for (sf7 sf7Var5 : uf7Var.a) {
            if (qr5.class.isAssignableFrom(sf7Var5.getClass())) {
                sf7Var = (sf7) qr5.class.cast(sf7Var5);
            }
            sf7Var = null;
            if (sf7Var != null) {
                p2.c(sf7Var);
            }
        }
        no5 listIterator2 = p2.f().listIterator(0);
        while (listIterator2.hasNext() && !a(((qr5) listIterator2.next()).d)) {
        }
    }
}
