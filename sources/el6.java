// default package

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class el6 implements qp5 {
    public static final Pattern j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern n = Pattern.compile("\\s+");
    public final wm4 a;
    public final BitSet b;
    public final HashMap c;
    public final HashMap d;
    public ui6 e;
    public String f;
    public int g;
    public gf3 h;
    public zz0 i;

    public el6(wm4 wm4Var, ArrayList arrayList, ArrayList arrayList2) {
        soa soaVar;
        this.a = wm4Var;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            tp5 tp5Var = (tp5) obj;
            char c = tp5Var.c();
            List list = (List) hashMap.get(Character.valueOf(c));
            if (list == null) {
                list = new ArrayList(1);
                hashMap.put(Character.valueOf(c), list);
            }
            list.add(tp5Var);
        }
        this.c = hashMap;
        HashMap hashMap2 = new HashMap();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            hf3 hf3Var = (hf3) obj2;
            char e = hf3Var.e();
            char b = hf3Var.b();
            if (e == b) {
                hf3 hf3Var2 = (hf3) hashMap2.get(Character.valueOf(e));
                if (hf3Var2 == null || hf3Var2.e() != hf3Var2.b()) {
                    b(e, hf3Var, hashMap2);
                } else {
                    if (hf3Var2 instanceof soa) {
                        soaVar = (soa) hf3Var2;
                    } else {
                        soa soaVar2 = new soa(e);
                        soaVar2.f(hf3Var2);
                        soaVar = soaVar2;
                    }
                    soaVar.f(hf3Var);
                    hashMap2.put(Character.valueOf(e), soaVar);
                }
            } else {
                b(e, hf3Var, hashMap2);
                b(b, hf3Var, hashMap2);
            }
        }
        this.d = hashMap2;
        Set keySet = this.c.keySet();
        Set keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        Iterator it2 = keySet2.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        this.b = bitSet;
    }

    public static void b(char c, hf3 hf3Var, HashMap hashMap) {
        if (((hf3) hashMap.put(Character.valueOf(c), hf3Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    @Override // qp5
    public final void a(String str, ui6 ui6Var) {
        ui6 vibVar;
        boolean z;
        boolean z2;
        p02 p02Var;
        this.f = str.trim();
        this.g = 0;
        this.h = null;
        this.i = null;
        this.e = ui6Var;
        while (true) {
            char d = d();
            if (d == 0) {
                vibVar = null;
            } else {
                List list = (List) this.c.get(Character.valueOf(d));
                if (list != null) {
                    int i = this.g;
                    Iterator it = list.iterator();
                    vibVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        tp5 tp5Var = (tp5) it.next();
                        tp5Var.a = this;
                        tp5Var.b = this.e;
                        tp5Var.c = this.f;
                        tp5Var.d = this.g;
                        ui6 b = tp5Var.b();
                        this.g = tp5Var.d;
                        if (b != null) {
                            vibVar = b;
                            break;
                        } else {
                            this.g = i;
                            vibVar = b;
                        }
                    }
                } else {
                    hf3 hf3Var = (hf3) this.d.get(Character.valueOf(d));
                    int i2 = this.g;
                    if (hf3Var != null) {
                        int i3 = 0;
                        while (d() == d) {
                            i3++;
                            this.g++;
                        }
                        if (i3 < hf3Var.c()) {
                            this.g = i2;
                            p02Var = null;
                        } else {
                            String substring = i2 == 0 ? "\n" : this.f.substring(i2 - 1, i2);
                            char d2 = d();
                            String valueOf = d2 != 0 ? String.valueOf(d2) : "\n";
                            Pattern pattern = j;
                            boolean matches = pattern.matcher(substring).matches();
                            Pattern pattern2 = l;
                            boolean matches2 = pattern2.matcher(substring).matches();
                            boolean matches3 = pattern.matcher(valueOf).matches();
                            boolean matches4 = pattern2.matcher(valueOf).matches();
                            boolean z3 = !matches4 && (!matches3 || matches2 || matches);
                            boolean z4 = !matches2 && (!matches || matches4 || matches3);
                            if (d == '_') {
                                z2 = z3 && (!z4 || matches);
                                z = z4 && (!z3 || matches3);
                            } else {
                                boolean z5 = z3 && d == hf3Var.e();
                                z = z4 && d == hf3Var.b();
                                z2 = z5;
                            }
                            this.g = i2;
                            p02Var = new p02(i3, z2, z);
                        }
                        if (p02Var != null) {
                            int i4 = p02Var.a;
                            int i5 = i2 + i4;
                            this.g = i5;
                            vib vibVar2 = new vib(this.f.substring(i2, i5));
                            boolean z6 = p02Var.c;
                            boolean z7 = p02Var.b;
                            gf3 gf3Var = this.h;
                            gf3 gf3Var2 = new gf3(vibVar2, d, z6, z7, gf3Var);
                            this.h = gf3Var2;
                            gf3Var2.g = i4;
                            gf3Var2.h = i4;
                            if (gf3Var != null) {
                                gf3Var.f = gf3Var2;
                            }
                            vibVar = vibVar2;
                        }
                        vibVar = null;
                    } else {
                        int length = this.f.length();
                        while (true) {
                            int i6 = this.g;
                            if (i6 == length) {
                                break;
                            }
                            if (this.b.get(this.f.charAt(i6))) {
                                break;
                            } else {
                                this.g++;
                            }
                        }
                        int i7 = this.g;
                        if (i2 != i7) {
                            vibVar = new vib(this.f.substring(i2, i7));
                        }
                        vibVar = null;
                    }
                }
                if (vibVar == null) {
                    this.g++;
                    vibVar = new vib(String.valueOf(d));
                }
            }
            if (vibVar == null) {
                break;
            } else {
                ui6Var.b(vibVar);
            }
        }
        e(null);
        ui6 ui6Var2 = (ui6) ui6Var.c;
        ui6 ui6Var3 = (ui6) ui6Var.d;
        if (ui6Var2 == ui6Var3) {
            return;
        }
        ane.b(ui6Var2, ui6Var3);
    }

    public final String c(Pattern pattern) {
        if (this.g >= this.f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f);
        matcher.region(this.g, this.f.length());
        if (!matcher.find()) {
            return null;
        }
        this.g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.g < this.f.length()) {
            return this.f.charAt(this.g);
        }
        return (char) 0;
    }

    public final void e(gf3 gf3Var) {
        boolean z;
        ui6 ui6Var;
        HashMap hashMap = new HashMap();
        gf3 gf3Var2 = this.h;
        while (gf3Var2 != null) {
            gf3 gf3Var3 = gf3Var2.e;
            if (gf3Var3 == gf3Var) {
                break;
            } else {
                gf3Var2 = gf3Var3;
            }
        }
        while (gf3Var2 != null) {
            vib vibVar = gf3Var2.a;
            char c = gf3Var2.b;
            hf3 hf3Var = (hf3) this.d.get(Character.valueOf(c));
            if (!gf3Var2.d || hf3Var == null) {
                gf3Var2 = gf3Var2.f;
            } else {
                char e = hf3Var.e();
                gf3 gf3Var4 = gf3Var2;
                int i = 0;
                boolean z2 = false;
                while (true) {
                    gf3Var4 = gf3Var4.e;
                    if (gf3Var4 == null || gf3Var4 == gf3Var || gf3Var4 == hashMap.get(Character.valueOf(c))) {
                        break;
                    }
                    if (gf3Var4.c && gf3Var4.b == e) {
                        i = hf3Var.d(gf3Var4, gf3Var2);
                        z2 = true;
                        if (i > 0) {
                            z = true;
                            break;
                        }
                    }
                }
                z = z2;
                z2 = false;
                if (z2) {
                    vib vibVar2 = gf3Var4.a;
                    gf3Var4.g -= i;
                    gf3Var2.g -= i;
                    vibVar2.g = ts2.m(i, 0, vibVar2.g);
                    vibVar.g = ts2.m(i, 0, vibVar.g);
                    gf3 gf3Var5 = gf3Var2.e;
                    while (gf3Var5 != null && gf3Var5 != gf3Var4) {
                        gf3 gf3Var6 = gf3Var5.e;
                        f(gf3Var5);
                        gf3Var5 = gf3Var6;
                    }
                    if (vibVar2 != vibVar && (ui6Var = (ui6) vibVar2.f) != vibVar) {
                        ane.b(ui6Var, (ui6) vibVar.e);
                    }
                    hf3Var.a(vibVar2, vibVar, i);
                    if (gf3Var4.g == 0) {
                        gf3Var4.a.g();
                        f(gf3Var4);
                    }
                    if (gf3Var2.g == 0) {
                        gf3 gf3Var7 = gf3Var2.f;
                        vibVar.g();
                        f(gf3Var2);
                        gf3Var2 = gf3Var7;
                    }
                } else {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), gf3Var2.e);
                        if (!gf3Var2.c) {
                            f(gf3Var2);
                        }
                    }
                    gf3Var2 = gf3Var2.f;
                }
            }
        }
        while (true) {
            gf3 gf3Var8 = this.h;
            if (gf3Var8 == null || gf3Var8 == gf3Var) {
                return;
            } else {
                f(gf3Var8);
            }
        }
    }

    public final void f(gf3 gf3Var) {
        gf3 gf3Var2 = gf3Var.e;
        if (gf3Var2 != null) {
            gf3Var2.f = gf3Var.f;
        }
        gf3 gf3Var3 = gf3Var.f;
        if (gf3Var3 == null) {
            this.h = gf3Var2;
        } else {
            gf3Var3.e = gf3Var2;
        }
    }
}
