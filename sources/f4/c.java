package f4;

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
import e2.d0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import v7.f7;
import v7.p6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final g f;
    public final String[] g;
    public final String h;
    public final String i;
    public final c j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public c(String str, String str2, long j3, long j10, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = gVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j3;
        this.e = j10;
        str3.getClass();
        this.h = str3;
        this.j = cVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            d2.a aVar = new d2.a();
            aVar.a = new SpannableStringBuilder();
            aVar.b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((d2.a) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i10) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (c) arrayList.get(i10);
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

    public final void d(TreeSet treeSet, boolean z10) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.i != null)) {
            long j3 = this.d;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
            long j10 = this.e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.m.size(); i10++) {
            ((c) this.m.get(i10)).d(treeSet, z10 || equals);
        }
    }

    public final boolean f(long j3) {
        long j10 = this.e;
        long j11 = this.d;
        if (j11 == -9223372036854775807L && j10 == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j3 && j10 == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j3 >= j10) {
            return j11 <= j3 && j3 < j10;
        }
        return true;
    }

    public final void g(long j3, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j3) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j3, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j3, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        Iterator it;
        int i10;
        c cVar;
        g a2;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        Map map2 = map;
        if (f(j3)) {
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
                    d2.a aVar = (d2.a) treeMap.get(str4);
                    aVar.getClass();
                    f fVar = (f) hashMap.get(str3);
                    fVar.getClass();
                    int i15 = fVar.j;
                    g a10 = f7.a(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.a = spannableStringBuilder;
                        aVar.b = null;
                    }
                    if (a10 != null) {
                        int i16 = a10.h;
                        int i17 = 1;
                        if (((i16 == -1 && a10.i == -1) ? -1 : (i16 == 1 ? (char) 1 : (char) 0) | (a10.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i18 = a10.h;
                            if (i18 == -1) {
                                if (a10.i == -1) {
                                    i17 = 1;
                                    i14 = -1;
                                    StyleSpan styleSpan = new StyleSpan(i14);
                                    i10 = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i17 = 1;
                                }
                            }
                            i14 = (i18 == i17 ? 1 : 0) | (a10.i == i17 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i14);
                            i10 = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        if (a10.f == i17) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i10);
                        }
                        if (a10.g == i17) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i10);
                        }
                        if (a10.c) {
                            if (!a10.c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            p6.a(new ForegroundColorSpan(a10.b), spannableStringBuilder, intValue, intValue2);
                        }
                        if (a10.e) {
                            if (!a10.e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            p6.a(new BackgroundColorSpan(a10.d), spannableStringBuilder, intValue, intValue2);
                        }
                        if (a10.a != null) {
                            p6.a(new TypefaceSpan(a10.a), spannableStringBuilder, intValue, intValue2);
                        }
                        b bVar = a10.r;
                        if (bVar != null) {
                            int i19 = bVar.a;
                            if (i19 == -1) {
                                i19 = (i15 == 2 || i15 == 1) ? 3 : 1;
                                i13 = 1;
                            } else {
                                i13 = bVar.b;
                            }
                            int i20 = bVar.c;
                            if (i20 == -2) {
                                i20 = 1;
                            }
                            p6.a(new d2.g(i19, i13, i20), spannableStringBuilder, intValue, intValue2);
                        }
                        int i21 = a10.m;
                        if (i21 == 2) {
                            c cVar2 = this.j;
                            while (true) {
                                if (cVar2 == null) {
                                    cVar2 = null;
                                    break;
                                }
                                g a11 = f7.a(cVar2.f, cVar2.g, map2);
                                if (a11 != null && a11.m == 1) {
                                    break;
                                } else {
                                    cVar2 = cVar2.j;
                                }
                            }
                            if (cVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(cVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        cVar = null;
                                        break;
                                    }
                                    c cVar3 = (c) arrayDeque.pop();
                                    g a12 = f7.a(cVar3.f, cVar3.g, map2);
                                    if (a12 != null && a12.m == 3) {
                                        cVar = cVar3;
                                        break;
                                    }
                                    for (int c10 = cVar3.c() - 1; c10 >= 0; c10--) {
                                        arrayDeque.push(cVar3.b(c10));
                                    }
                                }
                                if (cVar != null) {
                                    if (cVar.c() == 1 && cVar.b(0).b != null) {
                                        String str5 = cVar.b(0).b;
                                        String str6 = d0.a;
                                        g a13 = f7.a(cVar.f, cVar.g, map2);
                                        int i22 = a13 != null ? a13.n : -1;
                                        if (i22 == -1 && (a2 = f7.a(cVar2.f, cVar2.g, map2)) != null) {
                                            i22 = a2.n;
                                        }
                                        spannableStringBuilder.setSpan(new d2.f(str5, i22), intValue, intValue2, 33);
                                        if (a10.q == 1) {
                                            p6.a(new d2.e(), spannableStringBuilder, intValue, intValue2);
                                        }
                                        i11 = a10.j;
                                        if (i11 == 1) {
                                            it = it2;
                                            f7 = 100.0f;
                                            p6.a(new AbsoluteSizeSpan((int) a10.k, true), spannableStringBuilder, intValue, intValue2);
                                        } else if (i11 == 2) {
                                            it = it2;
                                            f7 = 100.0f;
                                            p6.a(new RelativeSizeSpan(a10.k), spannableStringBuilder, intValue, intValue2);
                                        } else if (i11 != 3) {
                                            it = it2;
                                            f7 = 100.0f;
                                        } else {
                                            float f10 = a10.k / 100.0f;
                                            RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                            int length = relativeSizeSpanArr.length;
                                            float f11 = f10;
                                            int i23 = 0;
                                            while (i23 < length) {
                                                RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i23];
                                                Iterator it3 = it2;
                                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                    f11 = relativeSizeSpan.getSizeChange() * f11;
                                                }
                                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                    i12 = i23;
                                                    if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                        spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                    }
                                                } else {
                                                    i12 = i23;
                                                }
                                                i23 = i12 + 1;
                                                it2 = it3;
                                            }
                                            it = it2;
                                            f7 = 100.0f;
                                            spannableStringBuilder.setSpan(new RelativeSizeSpan(f11), intValue, intValue2, 33);
                                        }
                                        if ("p".equals(this.a)) {
                                            float f12 = a10.s;
                                            if (f12 != Float.MAX_VALUE) {
                                                aVar.q = (f12 * (-90.0f)) / f7;
                                            }
                                            Layout.Alignment alignment = a10.o;
                                            if (alignment != null) {
                                                aVar.c = alignment;
                                            }
                                            Layout.Alignment alignment2 = a10.p;
                                            if (alignment2 != null) {
                                                aVar.d = alignment2;
                                            }
                                        }
                                        it2 = it;
                                    }
                                    e2.a.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    if (a10.q == 1) {
                                    }
                                    i11 = a10.j;
                                    if (i11 == 1) {
                                    }
                                    if ("p".equals(this.a)) {
                                    }
                                    it2 = it;
                                }
                            }
                        } else if (i21 == 3 || i21 == 4) {
                            spannableStringBuilder.setSpan(new a(), intValue, intValue2, 33);
                        }
                        if (a10.q == 1) {
                        }
                        i11 = a10.j;
                        if (i11 == 1) {
                        }
                        if ("p".equals(this.a)) {
                        }
                        it2 = it;
                    }
                }
                it = it2;
                it2 = it;
            }
            int i24 = 0;
            while (i24 < c()) {
                b(i24).h(j3, map2, hashMap, str3, treeMap);
                i24++;
                map2 = map;
            }
        }
    }

    public final void i(long j3, boolean z10, String str, TreeMap treeMap) {
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
        if (this.c && z10) {
            SpannableStringBuilder e7 = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            e7.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z10) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j3)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((d2.a) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i10 = 0; i10 < c(); i10++) {
                b(i10).i(j3, z10 || equals, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e10 = e(str4, treeMap);
                int length = e10.length() - 1;
                while (length >= 0 && e10.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e10.charAt(length) != '\n') {
                    e10.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((d2.a) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
