// default package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class au4 {
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
            String str2 = hac.a;
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
    public final void b(nf7 nf7Var) {
        lf7 lf7Var;
        nf7Var.getClass();
        jo5 p = mo5.p();
        lf7[] lf7VarArr = nf7Var.a;
        int length = lf7VarArr.length;
        int i = 0;
        while (true) {
            lf7 lf7Var2 = null;
            if (i >= length) {
                break;
            }
            lf7 lf7Var3 = lf7VarArr[i];
            if (wn2.class.isAssignableFrom(lf7Var3.getClass())) {
                lf7 lf7Var4 = (lf7) wn2.class.cast(lf7Var3);
                if (((wn2) lf7Var4).c.equals("iTunSMPB")) {
                    lf7Var2 = lf7Var4;
                }
            }
            if (lf7Var2 != null) {
                p.c(lf7Var2);
            }
            i++;
        }
        ko5 listIterator = p.f().listIterator(0);
        while (listIterator.hasNext()) {
            if (a(((wn2) listIterator.next()).d)) {
                return;
            }
        }
        gc3 gc3Var = new gc3((byte) 2);
        jo5 p2 = mo5.p();
        for (lf7 lf7Var5 : nf7Var.a) {
            if (nr5.class.isAssignableFrom(lf7Var5.getClass())) {
                lf7Var = (lf7) nr5.class.cast(lf7Var5);
            }
            lf7Var = null;
            if (lf7Var != null) {
                p2.c(lf7Var);
            }
        }
        ko5 listIterator2 = p2.f().listIterator(0);
        while (listIterator2.hasNext() && !a(((nr5) listIterator2.next()).d)) {
        }
    }
}
