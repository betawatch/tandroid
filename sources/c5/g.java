package c5;

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
import h5.d0;
import h7.u;
import j7.l0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import k7.w8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final i f;
    public final String[] g;
    public final String h;
    public final String i;
    public final g j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public g(String str, String str2, long j10, long j11, i iVar, String[] strArr, String str3, String str4, g gVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = iVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j10;
        this.e = j11;
        str3.getClass();
        this.h = str3;
        this.j = gVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static g a(String str) {
        return new g(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            v4.a aVar = new v4.a();
            aVar.a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((v4.a) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final g b(int i10) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (g) arrayList.get(i10);
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

    public final void d(TreeSet treeSet, boolean z4) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z4 || equals || (equals2 && this.i != null)) {
            long j10 = this.d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.m.size(); i10++) {
            ((g) this.m.get(i10)).d(treeSet, z4 || equals);
        }
    }

    public final boolean f(long j10) {
        long j11 = this.e;
        long j12 = this.d;
        if (j12 == -9223372036854775807L && j11 == -9223372036854775807L) {
            return true;
        }
        if (j12 <= j10 && j11 == -9223372036854775807L) {
            return true;
        }
        if (j12 != -9223372036854775807L || j10 >= j11) {
            return j12 <= j10 && j10 < j11;
        }
        return true;
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j10) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j10, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0243 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j10, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        int i10;
        g gVar;
        int i11;
        int i12;
        Map map2 = map;
        if (f(j10)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    v4.a aVar = (v4.a) treeMap.get(str4);
                    aVar.getClass();
                    h hVar = (h) hashMap.get(str3);
                    hVar.getClass();
                    int i13 = hVar.j;
                    i a2 = l0.a(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.a = spannableStringBuilder;
                    }
                    if (a2 != null) {
                        int i14 = a2.h;
                        int i15 = 1;
                        if (((i14 == -1 && a2.i == -1) ? -1 : (i14 == 1 ? (char) 1 : (char) 0) | (a2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i16 = a2.h;
                            if (i16 == -1) {
                                if (a2.i == -1) {
                                    i15 = 1;
                                    i12 = -1;
                                    StyleSpan styleSpan = new StyleSpan(i12);
                                    i10 = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i15 = 1;
                                }
                            }
                            i12 = (i16 == i15 ? 1 : 0) | (a2.i == i15 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i12);
                            i10 = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        if (a2.f == i15) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i10);
                        }
                        if (a2.g == i15) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i10);
                        }
                        if (a2.c) {
                            if (!a2.c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            w8.a(new ForegroundColorSpan(a2.b), spannableStringBuilder, intValue, intValue2);
                        }
                        if (a2.e) {
                            if (!a2.e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            w8.a(new BackgroundColorSpan(a2.d), spannableStringBuilder, intValue, intValue2);
                        }
                        if (a2.a != null) {
                            w8.a(new TypefaceSpan(a2.a), spannableStringBuilder, intValue, intValue2);
                        }
                        b bVar = a2.r;
                        if (bVar != null) {
                            if (bVar.a == -1 && i13 != 2) {
                            }
                            w8.a(new ab.a(26), spannableStringBuilder, intValue, intValue2);
                        }
                        int i17 = a2.m;
                        if (i17 == 2) {
                            g gVar2 = this.j;
                            while (true) {
                                if (gVar2 == null) {
                                    gVar2 = null;
                                    break;
                                }
                                i a10 = l0.a(gVar2.f, gVar2.g, map2);
                                if (a10 != null && a10.m == 1) {
                                    break;
                                } else {
                                    gVar2 = gVar2.j;
                                }
                            }
                            if (gVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(gVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        gVar = null;
                                        break;
                                    }
                                    gVar = (g) arrayDeque.pop();
                                    i a11 = l0.a(gVar.f, gVar.g, map2);
                                    if (a11 != null && a11.m == 3) {
                                        break;
                                    }
                                    for (int c3 = gVar.c() - 1; c3 >= 0; c3--) {
                                        arrayDeque.push(gVar.b(c3));
                                    }
                                }
                                if (gVar != null) {
                                    if (gVar.c() == 1 && gVar.b(0).b != null) {
                                        String str5 = gVar.b(0).b;
                                        int i18 = d0.a;
                                        i a12 = l0.a(gVar.f, gVar.g, map2);
                                        if ((a12 != null ? a12.n : -1) == -1) {
                                            l0.a(gVar2.f, gVar2.g, map2);
                                        }
                                        spannableStringBuilder.setSpan(new z9.d(25), intValue, intValue2, 33);
                                        if (a2.q == 1) {
                                            w8.a(new u(25), spannableStringBuilder, intValue, intValue2);
                                        }
                                        i11 = a2.j;
                                        if (i11 == 1) {
                                            w8.a(new AbsoluteSizeSpan((int) a2.k, true), spannableStringBuilder, intValue, intValue2);
                                        } else if (i11 == 2) {
                                            w8.a(new RelativeSizeSpan(a2.k), spannableStringBuilder, intValue, intValue2);
                                        } else if (i11 == 3) {
                                            w8.a(new RelativeSizeSpan(a2.k / 100.0f), spannableStringBuilder, intValue, intValue2);
                                        }
                                        if ("p".equals(this.a)) {
                                            float f10 = a2.s;
                                            if (f10 != Float.MAX_VALUE) {
                                                aVar.q = (f10 * (-90.0f)) / 100.0f;
                                            }
                                            Layout.Alignment alignment = a2.o;
                                            if (alignment != null) {
                                                aVar.c = alignment;
                                            }
                                            Layout.Alignment alignment2 = a2.p;
                                            if (alignment2 != null) {
                                                aVar.d = alignment2;
                                            }
                                        }
                                    }
                                    h5.a.v("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    if (a2.q == 1) {
                                    }
                                    i11 = a2.j;
                                    if (i11 == 1) {
                                    }
                                    if ("p".equals(this.a)) {
                                    }
                                }
                            }
                        } else if (i17 == 3 || i17 == 4) {
                            spannableStringBuilder.setSpan(new a(), intValue, intValue2, 33);
                        }
                        if (a2.q == 1) {
                        }
                        i11 = a2.j;
                        if (i11 == 1) {
                        }
                        if ("p".equals(this.a)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
            int i19 = 0;
            while (i19 < c()) {
                b(i19).h(j10, map2, hashMap, str3, treeMap);
                i19++;
                map2 = map;
            }
        }
    }

    public final void i(long j10, boolean z4, String str, TreeMap treeMap) {
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
        if (this.c && z4) {
            SpannableStringBuilder e6 = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            e6.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z4) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((v4.a) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i10 = 0; i10 < c(); i10++) {
                b(i10).i(j10, z4 || equals, str4, treeMap);
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
                CharSequence charSequence2 = ((v4.a) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
