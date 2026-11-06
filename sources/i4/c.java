package i4;

import a8.ea;
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
import c8.l0;
import g2.g;
import g2.h;
import h2.m0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final f f;
    public final String[] g;
    public final String h;
    public final String i;
    public final c j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public c(String str, String str2, long j3, long j10, f fVar, String[] strArr, String str3, String str4, c cVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = fVar;
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
            g2.a aVar = new g2.a();
            aVar.a = new SpannableStringBuilder();
            aVar.b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((g2.a) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i7) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (c) arrayList.get(i7);
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

    public final void d(TreeSet treeSet, boolean z9) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z9 || equals || (equals2 && this.i != null)) {
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
        for (int i7 = 0; i7 < this.m.size(); i7++) {
            ((c) this.m.get(i7)).d(treeSet, z9 || equals);
        }
    }

    public final boolean f(long j3) {
        long j10 = this.d;
        long j11 = this.e;
        if (j10 == -9223372036854775807L && j11 == -9223372036854775807L) {
            return true;
        }
        if (j10 <= j3 && j11 == -9223372036854775807L) {
            return true;
        }
        if (j10 != -9223372036854775807L || j3 >= j11) {
            return j10 <= j3 && j3 < j11;
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
        for (int i7 = 0; i7 < c(); i7++) {
            b(i7).g(j3, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j3, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        Iterator it;
        int i7;
        c cVar;
        int i10;
        f a10;
        int i11;
        float f10;
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
                    g2.a aVar = (g2.a) treeMap.get(str4);
                    aVar.getClass();
                    e eVar = (e) hashMap.get(str3);
                    eVar.getClass();
                    int i15 = eVar.j;
                    f a11 = l0.a(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.a = spannableStringBuilder;
                        aVar.b = null;
                    }
                    if (a11 != null) {
                        int i16 = a11.h;
                        int i17 = 1;
                        if (((i16 == -1 && a11.i == -1) ? -1 : (i16 == 1 ? (char) 1 : (char) 0) | (a11.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i18 = a11.h;
                            if (i18 == -1) {
                                if (a11.i == -1) {
                                    i14 = -1;
                                    i17 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i14);
                                    i7 = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i17 = 1;
                                }
                            }
                            i14 = (i18 == i17 ? i17 : 0) | (a11.i == i17 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i14);
                            i7 = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i7 = 33;
                        }
                        if (a11.f == i17) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i7);
                        }
                        if (a11.g == i17) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i7);
                        }
                        if (a11.c) {
                            if (!a11.c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            ea.a(spannableStringBuilder, new ForegroundColorSpan(a11.b), intValue, intValue2);
                        }
                        if (a11.e) {
                            if (!a11.e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            ea.a(spannableStringBuilder, new BackgroundColorSpan(a11.d), intValue, intValue2);
                        }
                        if (a11.a != null) {
                            ea.a(spannableStringBuilder, new TypefaceSpan(a11.a), intValue, intValue2);
                        }
                        b bVar = a11.r;
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
                            ea.a(spannableStringBuilder, new h(i19, i13, i20), intValue, intValue2);
                        }
                        int i21 = a11.m;
                        if (i21 == 2) {
                            c cVar2 = this.j;
                            while (true) {
                                if (cVar2 == null) {
                                    cVar2 = null;
                                    break;
                                }
                                f a12 = l0.a(cVar2.f, cVar2.g, map2);
                                if (a12 != null && a12.m == 1) {
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
                                    f a13 = l0.a(cVar3.f, cVar3.g, map2);
                                    if (a13 != null && a13.m == 3) {
                                        cVar = cVar3;
                                        break;
                                    }
                                    for (int c10 = cVar3.c() - 1; c10 >= 0; c10--) {
                                        arrayDeque.push(cVar3.b(c10));
                                    }
                                }
                                if (cVar != null) {
                                    if (cVar.c() == 1) {
                                        i10 = 0;
                                        if (cVar.b(0).b != null) {
                                            String str5 = cVar.b(0).b;
                                            String str6 = m0.a;
                                            f a14 = l0.a(cVar.f, cVar.g, map2);
                                            int i22 = a14 != null ? a14.n : -1;
                                            if (i22 == -1 && (a10 = l0.a(cVar2.f, cVar2.g, map2)) != null) {
                                                i22 = a10.n;
                                            }
                                            spannableStringBuilder.setSpan(new g(str5, i22), intValue, intValue2, 33);
                                            if (a11.q == 1) {
                                                ea.a(spannableStringBuilder, new g2.f(), intValue, intValue2);
                                            }
                                            i11 = a11.j;
                                            float f11 = 100.0f;
                                            if (i11 == 1) {
                                                it = it2;
                                                f10 = 100.0f;
                                                ea.a(spannableStringBuilder, new AbsoluteSizeSpan((int) a11.k, true), intValue, intValue2);
                                            } else if (i11 == 2) {
                                                it = it2;
                                                f10 = 100.0f;
                                                ea.a(spannableStringBuilder, new RelativeSizeSpan(a11.k), intValue, intValue2);
                                            } else if (i11 != 3) {
                                                it = it2;
                                                f10 = 100.0f;
                                            } else {
                                                float f12 = a11.k / 100.0f;
                                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                                int length = relativeSizeSpanArr.length;
                                                int i23 = i10;
                                                float f13 = f12;
                                                int i24 = i23;
                                                while (i24 < length) {
                                                    float f14 = f11;
                                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i24];
                                                    Iterator it3 = it2;
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                        f13 = relativeSizeSpan.getSizeChange() * f13;
                                                    }
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                        i12 = i24;
                                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                        }
                                                    } else {
                                                        i12 = i24;
                                                    }
                                                    i24 = i12 + 1;
                                                    f11 = f14;
                                                    it2 = it3;
                                                }
                                                it = it2;
                                                f10 = f11;
                                                spannableStringBuilder.setSpan(new RelativeSizeSpan(f13), intValue, intValue2, 33);
                                            }
                                            if ("p".equals(this.a)) {
                                                float f15 = a11.s;
                                                if (f15 != Float.MAX_VALUE) {
                                                    aVar.q = (f15 * (-90.0f)) / f10;
                                                }
                                                Layout.Alignment alignment = a11.o;
                                                if (alignment != null) {
                                                    aVar.c = alignment;
                                                }
                                                Layout.Alignment alignment2 = a11.p;
                                                if (alignment2 != null) {
                                                    aVar.d = alignment2;
                                                }
                                            }
                                            it2 = it;
                                        }
                                    } else {
                                        i10 = 0;
                                    }
                                    h2.a.g("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    if (a11.q == 1) {
                                    }
                                    i11 = a11.j;
                                    float f112 = 100.0f;
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
                        i10 = 0;
                        if (a11.q == 1) {
                        }
                        i11 = a11.j;
                        float f1122 = 100.0f;
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
            int i25 = 0;
            while (i25 < c()) {
                b(i25).h(j3, map2, hashMap, str3, treeMap);
                i25++;
                map2 = map;
            }
        }
    }

    public final void i(long j3, boolean z9, String str, TreeMap treeMap) {
        boolean z10;
        TreeMap treeMap2;
        long j10;
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
        if (this.c && z9) {
            SpannableStringBuilder e10 = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            e10.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z9) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j3)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((g2.a) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i7 = 0; i7 < c(); i7++) {
                c b10 = b(i7);
                if (z9 || equals) {
                    z10 = true;
                    treeMap2 = treeMap;
                    j10 = j3;
                } else {
                    z10 = false;
                    j10 = j3;
                    treeMap2 = treeMap;
                }
                b10.i(j10, z10, str4, treeMap2);
            }
            if (equals) {
                SpannableStringBuilder e11 = e(str4, treeMap);
                int length = e11.length() - 1;
                while (length >= 0 && e11.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e11.charAt(length) != '\n') {
                    e11.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((g2.a) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
