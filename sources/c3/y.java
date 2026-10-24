package c3;

import b2.s0;
import b2.t0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class y {
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
            String str2 = e2.m0.a;
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

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if ((r7.b.equals("com.apple.iTunes") && r7.c.equals("iTunSMPB")) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(t0 t0Var) {
        s0 s0Var;
        t0Var.getClass();
        e9.k0 t10 = e9.n0.t();
        s0[] s0VarArr = t0Var.a;
        int length = s0VarArr.length;
        int i10 = 0;
        while (true) {
            s0 s0Var2 = null;
            if (i10 >= length) {
                break;
            }
            s0 s0Var3 = s0VarArr[i10];
            if (q3.e.class.isAssignableFrom(s0Var3.getClass())) {
                s0 s0Var4 = (s0) q3.e.class.cast(s0Var3);
                if (((q3.e) s0Var4).c.equals("iTunSMPB")) {
                    s0Var2 = s0Var4;
                }
            }
            if (s0Var2 != null) {
                t10.c(s0Var2);
            }
            i10++;
        }
        e9.l0 listIterator = t10.f().listIterator(0);
        while (listIterator.hasNext()) {
            if (a(((q3.e) listIterator.next()).d)) {
                return;
            }
        }
        e9.k0 t11 = e9.n0.t();
        for (s0 s0Var5 : s0VarArr) {
            if (q3.k.class.isAssignableFrom(s0Var5.getClass())) {
                s0Var = (s0) q3.k.class.cast(s0Var5);
                q3.k kVar = (q3.k) s0Var;
            }
            s0Var = null;
            if (s0Var != null) {
                t11.c(s0Var);
            }
        }
        e9.l0 listIterator2 = t11.f().listIterator(0);
        while (listIterator2.hasNext() && !a(((q3.k) listIterator2.next()).d)) {
        }
    }
}
