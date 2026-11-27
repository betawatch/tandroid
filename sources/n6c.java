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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class n6c {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final r6c f;
    public final String[] g;
    public final String h;
    public final String i;
    public final n6c j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public n6c(String str, String str2, long j, long j2, r6c r6cVar, String[] strArr, String str3, String str4, n6c n6cVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = r6cVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = n6cVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static n6c a(String str) {
        return new n6c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            l43 l43Var = new l43();
            l43Var.a = new SpannableStringBuilder();
            l43Var.b = null;
            treeMap.put(str, l43Var);
        }
        CharSequence charSequence = ((l43) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final n6c b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (n6c) arrayList.get(i);
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
                ((n6c) this.m.get(i)).d(treeSet, z || equals);
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
        n6c n6cVar;
        int i2;
        r6c a;
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
                    l43 l43Var = (l43) treeMap.get(str4);
                    l43Var.getClass();
                    q6c q6cVar = (q6c) hashMap.get(str3);
                    q6cVar.getClass();
                    int i6 = q6cVar.j;
                    r6c a2 = s0f.a(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) l43Var.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        l43Var.a = spannableStringBuilder;
                        l43Var.b = null;
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
                                grb.i("Font color has not been defined.");
                                return;
                            }
                            aze.a(spannableStringBuilder, new ForegroundColorSpan(a2.b), intValue, intValue2);
                        }
                        if (a2.e) {
                            if (!a2.e) {
                                grb.i("Background color has not been defined.");
                                return;
                            }
                            aze.a(spannableStringBuilder, new BackgroundColorSpan(a2.d), intValue, intValue2);
                        }
                        if (a2.a != null) {
                            aze.a(spannableStringBuilder, new TypefaceSpan(a2.a), intValue, intValue2);
                        }
                        flb flbVar = a2.r;
                        if (flbVar != null) {
                            int i10 = flbVar.a;
                            if (i10 == -1) {
                                i10 = (i6 == 2 || i6 == 1) ? 3 : 1;
                                b = 1;
                            } else {
                                b = flbVar.b;
                            }
                            int i11 = flbVar.c;
                            if (i11 == -2) {
                                i11 = 1;
                            }
                            aze.a(spannableStringBuilder, new glb(i10, b, i11), intValue, intValue2);
                        }
                        int i12 = a2.m;
                        if (i12 == 2) {
                            n6c n6cVar2 = this.j;
                            while (true) {
                                if (n6cVar2 == null) {
                                    n6cVar2 = null;
                                    break;
                                }
                                r6c a3 = s0f.a(n6cVar2.f, n6cVar2.g, map2);
                                if (a3 != null && a3.m == 1) {
                                    break;
                                } else {
                                    n6cVar2 = n6cVar2.j;
                                }
                            }
                            if (n6cVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(n6cVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        n6cVar = null;
                                        break;
                                    }
                                    n6c n6cVar3 = (n6c) arrayDeque.pop();
                                    r6c a4 = s0f.a(n6cVar3.f, n6cVar3.g, map2);
                                    if (a4 != null && a4.m == 3) {
                                        n6cVar = n6cVar3;
                                        break;
                                    }
                                    for (int c = n6cVar3.c() - 1; c >= 0; c--) {
                                        arrayDeque.push(n6cVar3.b(c));
                                    }
                                }
                                if (n6cVar != null) {
                                    if (n6cVar.c() == 1) {
                                        i2 = 0;
                                        if (n6cVar.b(0).b != null) {
                                            String str5 = n6cVar.b(0).b;
                                            String str6 = gcc.a;
                                            r6c a5 = s0f.a(n6cVar.f, n6cVar.g, map2);
                                            int i13 = a5 != null ? a5.n : -1;
                                            if (i13 == -1 && (a = s0f.a(n6cVar2.f, n6cVar2.g, map2)) != null) {
                                                i13 = a.n;
                                            }
                                            spannableStringBuilder.setSpan(new wr9(str5, i13), intValue, intValue2, 33);
                                            if (a2.q == 1) {
                                                aze.a(spannableStringBuilder, new ai5(), intValue, intValue2);
                                            }
                                            i3 = a2.j;
                                            float f2 = 100.0f;
                                            if (i3 == 1) {
                                                it = it2;
                                                f = 100.0f;
                                                aze.a(spannableStringBuilder, new AbsoluteSizeSpan((int) a2.k, true), intValue, intValue2);
                                            } else if (i3 == 2) {
                                                it = it2;
                                                f = 100.0f;
                                                aze.a(spannableStringBuilder, new RelativeSizeSpan(a2.k), intValue, intValue2);
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
                                                    l43Var.q = (f6 * (-90.0f)) / f;
                                                }
                                                Layout.Alignment alignment = a2.o;
                                                if (alignment != null) {
                                                    l43Var.c = alignment;
                                                }
                                                Layout.Alignment alignment2 = a2.p;
                                                if (alignment2 != null) {
                                                    l43Var.d = alignment2;
                                                }
                                            }
                                            it2 = it;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    efd.e("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
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
                            spannableStringBuilder.setSpan(new ne3(), intValue, intValue2, 33);
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
                CharSequence charSequence = ((l43) entry.getValue()).a;
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
                CharSequence charSequence2 = ((l43) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
