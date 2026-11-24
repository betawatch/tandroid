// default package

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class n2c {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final r2c f;
    public final String[] g;
    public final String h;
    public final String i;
    public final n2c j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public n2c(String str, String str2, long j, long j2, r2c r2cVar, String[] strArr, String str3, String str4, n2c n2cVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = r2cVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = n2cVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static n2c a(String str) {
        return new n2c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            t33 t33Var = new t33();
            t33Var.a = new SpannableStringBuilder();
            t33Var.b = null;
            treeMap.put(str, t33Var);
        }
        CharSequence charSequence = ((t33) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final n2c b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (n2c) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                ((n2c) this.m.get(i)).d(treeSet, z || equals);
            }
        }
    }

    public final boolean f(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        n2c n2cVar;
        int i2;
        r2c a;
        int i3;
        float f;
        int i4;
        byte b;
        int i5;
        Map map2 = map;
        if (f(j)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    t33 t33Var = (t33) treeMap.get(str4);
                    t33Var.getClass();
                    q2c q2cVar = (q2c) hashMap.get(str3);
                    q2cVar.getClass();
                    int i6 = q2cVar.j;
                    r2c a2 = awe.a(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) t33Var.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        t33Var.a = spannableStringBuilder;
                        t33Var.b = null;
                    }
                    if (a2 != null) {
                        int i7 = a2.h;
                        int i8 = 1;
                        if (((i7 == -1 && a2.i == -1) ? -1 : (i7 == 1 ? (char) 1 : (char) 0) | (a2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i9 = a2.h;
                            if (i9 == -1) {
                                if (a2.i == -1) {
                                    i5 = -1;
                                    i8 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i5);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i8 = 1;
                                }
                            }
                            i5 = (i9 == i8 ? i8 : 0) | (a2.i == i8 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i5);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (a2.f == i8) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (a2.g == i8) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (a2.c) {
                            if (!a2.c) {
                                sc8.j("Font color has not been defined.");
                                return;
                            }
                            iue.a(spannableStringBuilder, new ForegroundColorSpan(a2.b), intValue, intValue2);
                        }
                        if (a2.e) {
                            if (!a2.e) {
                                sc8.j("Background color has not been defined.");
                                return;
                            }
                            iue.a(spannableStringBuilder, new BackgroundColorSpan(a2.d), intValue, intValue2);
                        }
                        if (a2.a != null) {
                            iue.a(spannableStringBuilder, new TypefaceSpan(a2.a), intValue, intValue2);
                        }
                        jhb jhbVar = a2.r;
                        if (jhbVar != null) {
                            int i10 = jhbVar.a;
                            if (i10 == -1) {
                                i10 = (i6 == 2 || i6 == 1) ? 3 : 1;
                                b = 1;
                            } else {
                                b = jhbVar.b;
                            }
                            int i11 = jhbVar.c;
                            if (i11 == -2) {
                                i11 = 1;
                            }
                            iue.a(spannableStringBuilder, new khb(i10, b, i11), intValue, intValue2);
                        }
                        int i12 = a2.m;
                        if (i12 == 2) {
                            n2c n2cVar2 = this.j;
                            while (true) {
                                if (n2cVar2 == null) {
                                    n2cVar2 = null;
                                    break;
                                }
                                r2c a3 = awe.a(n2cVar2.f, n2cVar2.g, map2);
                                if (a3 != null && a3.m == 1) {
                                    break;
                                } else {
                                    n2cVar2 = n2cVar2.j;
                                }
                            }
                            if (n2cVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(n2cVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        n2cVar = null;
                                        break;
                                    }
                                    n2c n2cVar3 = (n2c) arrayDeque.pop();
                                    r2c a4 = awe.a(n2cVar3.f, n2cVar3.g, map2);
                                    if (a4 != null && a4.m == 3) {
                                        n2cVar = n2cVar3;
                                        break;
                                    }
                                    for (int c = n2cVar3.c() - 1; c >= 0; c--) {
                                        arrayDeque.push(n2cVar3.b(c));
                                    }
                                }
                                if (n2cVar != null) {
                                    if (n2cVar.c() == 1) {
                                        i2 = 0;
                                        if (n2cVar.b(0).b != null) {
                                            String str5 = n2cVar.b(0).b;
                                            String str6 = g8c.a;
                                            r2c a5 = awe.a(n2cVar.f, n2cVar.g, map2);
                                            int i13 = a5 != null ? a5.n : -1;
                                            if (i13 == -1 && (a = awe.a(n2cVar2.f, n2cVar2.g, map2)) != null) {
                                                i13 = a.n;
                                            }
                                            spannableStringBuilder.setSpan(new co9(str5, i13), intValue, intValue2, 33);
                                            if (a2.q == 1) {
                                                iue.a(spannableStringBuilder, new yf5(), intValue, intValue2);
                                            }
                                            i3 = a2.j;
                                            float f2 = 100.0f;
                                            if (i3 == 1) {
                                                it = it2;
                                                f = 100.0f;
                                                iue.a(spannableStringBuilder, new AbsoluteSizeSpan((int) a2.k, true), intValue, intValue2);
                                            } else if (i3 == 2) {
                                                it = it2;
                                                f = 100.0f;
                                                iue.a(spannableStringBuilder, new RelativeSizeSpan(a2.k), intValue, intValue2);
                                            } else if (i3 != 3) {
                                                it = it2;
                                                f = 100.0f;
                                            } else {
                                                float f3 = a2.k / 100.0f;
                                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                                int length = relativeSizeSpanArr.length;
                                                int i14 = i2;
                                                float f4 = f3;
                                                int i15 = i14;
                                                while (i15 < length) {
                                                    float f5 = f2;
                                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i15];
                                                    Iterator it3 = it2;
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                        f4 = relativeSizeSpan.getSizeChange() * f4;
                                                    }
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                        i4 = i15;
                                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                        }
                                                    } else {
                                                        i4 = i15;
                                                    }
                                                    i15 = i4 + 1;
                                                    f2 = f5;
                                                    it2 = it3;
                                                }
                                                it = it2;
                                                f = f2;
                                                spannableStringBuilder.setSpan(new RelativeSizeSpan(f4), intValue, intValue2, 33);
                                            }
                                            if ("p".equals(this.a)) {
                                                float f6 = a2.s;
                                                if (f6 != Float.MAX_VALUE) {
                                                    t33Var.q = (f6 * (-90.0f)) / f;
                                                }
                                                Layout.Alignment alignment = a2.o;
                                                if (alignment != null) {
                                                    t33Var.c = alignment;
                                                }
                                                Layout.Alignment alignment2 = a2.p;
                                                if (alignment2 != null) {
                                                    t33Var.d = alignment2;
                                                }
                                            }
                                            it2 = it;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    lad.e("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    if (a2.q == 1) {
                                    }
                                    i3 = a2.j;
                                    float f22 = 100.0f;
                                    if (i3 == 1) {
                                    }
                                    if ("p".equals(this.a)) {
                                    }
                                    it2 = it;
                                }
                            }
                        } else if (i12 == 3 || i12 == 4) {
                            spannableStringBuilder.setSpan(new td3(), intValue, intValue2, 33);
                        }
                        i2 = 0;
                        if (a2.q == 1) {
                        }
                        i3 = a2.j;
                        float f222 = 100.0f;
                        if (i3 == 1) {
                        }
                        if ("p".equals(this.a)) {
                        }
                        it2 = it;
                    }
                }
                it = it2;
                it2 = it;
            }
            int i16 = 0;
            while (i16 < c()) {
                b(i16).h(j, map2, hashMap, str3, treeMap);
                i16++;
                map2 = map;
            }
        }
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap hashMap = this.k;
        hashMap.clear();
        HashMap hashMap2 = this.l;
        hashMap2.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.c && z) {
            SpannableStringBuilder e = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((t33) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i = 0; i < c(); i++) {
                b(i).i(j, z || equals, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e2 = e(str4, treeMap);
                int length = e2.length() - 1;
                while (true) {
                    if (length < 0) {
                        break;
                    }
                    if (e2.charAt(length) == ' ') {
                        length--;
                    } else if (e2.charAt(length) != '\n') {
                        e2.append('\n');
                    }
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((t33) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
