package c3;

import b2.t0;
import b2.u0;
import e2.m0;
import e9.l0;
import e9.n0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class w {
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
            String str2 = m0.a;
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
    public final void b(u0 u0Var) {
        t0 t0Var;
        u0Var.getClass();
        e9.k0 t10 = n0.t();
        t0[] t0VarArr = u0Var.a;
        int length = t0VarArr.length;
        int i10 = 0;
        while (true) {
            t0 t0Var2 = null;
            if (i10 >= length) {
                break;
            }
            t0 t0Var3 = t0VarArr[i10];
            if (q3.e.class.isAssignableFrom(t0Var3.getClass())) {
                t0 t0Var4 = (t0) q3.e.class.cast(t0Var3);
                if (((q3.e) t0Var4).c.equals("iTunSMPB")) {
                    t0Var2 = t0Var4;
                }
            }
            if (t0Var2 != null) {
                t10.c(t0Var2);
            }
            i10++;
        }
        l0 listIterator = t10.f().listIterator(0);
        while (listIterator.hasNext()) {
            if (a(((q3.e) listIterator.next()).d)) {
                return;
            }
        }
        e9.k0 t11 = n0.t();
        for (t0 t0Var5 : t0VarArr) {
            if (q3.k.class.isAssignableFrom(t0Var5.getClass())) {
                t0Var = (t0) q3.k.class.cast(t0Var5);
                q3.k kVar = (q3.k) t0Var;
            }
            t0Var = null;
            if (t0Var != null) {
                t11.c(t0Var);
            }
        }
        l0 listIterator2 = t11.f().listIterator(0);
        while (listIterator2.hasNext() && !a(((q3.k) listIterator2.next()).d)) {
        }
    }
}
