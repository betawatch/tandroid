package di;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.google.android.gms.internal.play_billing.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public abstract class l {
    public static int c;
    public static final s a = new s(new d2.c(2), new d2.c(3));
    public static final LinkedHashMap b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    public static void a(Spannable spannable, int i10, s0 s0Var) {
        if (i10 == 0) {
            return;
        }
        boolean z10 = spannable instanceof f;
        for (e eVar : (e[]) (z10 ? f.a((f) spannable, i10, e.class) : spannable.getSpans(0, i10, e.class))) {
            d(spannable, i10, eVar);
            spannable.removeSpan(eVar);
        }
        for (j jVar : (j[]) (z10 ? f.a((f) spannable, i10, j.class) : spannable.getSpans(0, i10, j.class))) {
            d(spannable, i10, jVar);
            spannable.removeSpan(jVar);
        }
        if (s0Var == null) {
            return;
        }
        int[] b10 = s0Var.b();
        for (int i11 = 0; i11 < b10.length; i11 += 3) {
            int i12 = b10[i11];
            int i13 = b10[i11 + 1];
            int i14 = b10[i11 + 2];
            if (i12 >= 0 && i13 <= i10 && i12 < i13) {
                int i15 = i14 & zs.e4;
                if (i15 != 0) {
                    spannable.setSpan(new e(i15), i12, i13, 33);
                }
                if ((i14 & 768) != 0) {
                    spannable.setSpan(new j(i14), i12, i13, 33);
                }
            }
        }
    }

    public static SpannableString b(CharSequence charSequence, String str) {
        if (charSequence == null) {
            charSequence = "";
        }
        String b10 = s.b(str);
        if (b10.isEmpty() || charSequence.length() == 0) {
            return new SpannableString(charSequence);
        }
        String charSequence2 = charSequence.toString();
        d dVar = new d(b10, charSequence2);
        boolean z10 = !(charSequence instanceof Spanned) && charSequence2.length() <= 65536;
        LinkedHashMap linkedHashMap = b;
        synchronized (linkedHashMap) {
            if (z10) {
                try {
                    SpannableString spannableString = (SpannableString) linkedHashMap.get(dVar);
                    if (spannableString != null) {
                        return spannableString;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f fVar = new f(charSequence);
            if (z10) {
                linkedHashMap.put(dVar, fVar);
                c += charSequence2.length();
                while (true) {
                    LinkedHashMap linkedHashMap2 = b;
                    if (linkedHashMap2.size() <= 8 && c <= 65536) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                    c -= ((d) entry.getKey()).b.length();
                    linkedHashMap2.remove(entry.getKey());
                }
            }
            c(fVar, fVar.length(), b10);
            return fVar;
        }
    }

    public static void c(Spannable spannable, int i10, String str) {
        k kVar;
        k kVar2;
        r rVar;
        if (spannable == null) {
            return;
        }
        if (i10 < 0 || i10 > spannable.length()) {
            throw new IndexOutOfBoundsException();
        }
        h hVar = new h(spannable.subSequence(0, i10).toString());
        long j10 = (0 << 32) | (i10 & 4294967295L);
        synchronized (d) {
            try {
                ArrayList arrayList = e;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        kVar = new k(spannable);
                        arrayList.add(kVar);
                        break;
                    }
                    kVar = (k) it.next();
                    Spannable spannable2 = (Spannable) kVar.a.get();
                    if (spannable2 == null) {
                        it.remove();
                    } else if (spannable2 == spannable) {
                        break;
                    }
                }
                kVar2 = kVar;
                h hVar2 = (h) kVar2.b.put(Long.valueOf(j10), hVar);
                if (hVar2 != null && (rVar = hVar2.b) != null) {
                    rVar.a = null;
                }
            } finally {
            }
        }
        r d10 = a.d(hVar.a, str, new a(i10, 0, j10, kVar2, hVar));
        synchronized (d) {
            try {
                if (kVar2.b.get(Long.valueOf(j10)) == hVar) {
                    hVar.b = d10;
                } else {
                    d10.a = null;
                }
            } finally {
            }
        }
    }

    public static void d(Spannable spannable, int i10, CharacterStyle characterStyle) {
        int spanStart;
        int spanEnd;
        if (spannable instanceof f) {
            f fVar = (f) spannable;
            spanStart = f.b(fVar, characterStyle);
            spanEnd = f.c(fVar, characterStyle);
        } else {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        if (spanStart >= 0 && spanStart < 0) {
            spannable.setSpan(characterStyle instanceof e ? new e(((e) characterStyle).a) : new j(((j) characterStyle).b), spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i10) {
            spannable.setSpan(characterStyle instanceof e ? new e(((e) characterStyle).a) : new j(((j) characterStyle).b), Math.max(i10, spanStart), spanEnd, 33);
        }
    }
}
