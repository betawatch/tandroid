package oi;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.google.android.gms.internal.play_billing.s0;
import ii.o1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o4.v0;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public abstract class k {
    public static int c;
    public static final q a = new q(new v0(3), new v0(4));
    public static final LinkedHashMap b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    public static void a(Spannable spannable, int i3, s0 s0Var) {
        if (i3 == 0) {
            return;
        }
        boolean z10 = spannable instanceof e;
        for (d dVar : (d[]) (z10 ? e.a((e) spannable, i3, d.class) : spannable.getSpans(0, i3, d.class))) {
            d(spannable, i3, dVar);
            spannable.removeSpan(dVar);
        }
        for (i iVar : (i[]) (z10 ? e.a((e) spannable, i3, i.class) : spannable.getSpans(0, i3, i.class))) {
            d(spannable, i3, iVar);
            spannable.removeSpan(iVar);
        }
        if (s0Var == null) {
            return;
        }
        int[] b10 = s0Var.b();
        for (int i10 = 0; i10 < b10.length; i10 += 3) {
            int i11 = b10[i10];
            int i12 = b10[i10 + 1];
            int i13 = b10[i10 + 2];
            if (i11 >= 0 && i12 <= i3 && i11 < i12) {
                int i14 = i13 & hs.e4;
                if (i14 != 0) {
                    spannable.setSpan(new d(i14), i11, i12, 33);
                }
                if ((i13 & 768) != 0) {
                    spannable.setSpan(new i(i13), i11, i12, 33);
                }
            }
        }
    }

    public static SpannableString b(CharSequence charSequence, String str) {
        if (charSequence == null) {
            charSequence = "";
        }
        String b10 = q.b(str);
        if (b10.isEmpty() || charSequence.length() == 0) {
            return new SpannableString(charSequence);
        }
        String charSequence2 = charSequence.toString();
        c cVar = new c(b10, charSequence2);
        boolean z10 = !(charSequence instanceof Spanned) && charSequence2.length() <= 65536;
        LinkedHashMap linkedHashMap = b;
        synchronized (linkedHashMap) {
            if (z10) {
                try {
                    SpannableString spannableString = (SpannableString) linkedHashMap.get(cVar);
                    if (spannableString != null) {
                        return spannableString;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            e eVar = new e(charSequence);
            if (z10) {
                linkedHashMap.put(cVar, eVar);
                c += charSequence2.length();
                while (true) {
                    LinkedHashMap linkedHashMap2 = b;
                    if (linkedHashMap2.size() <= 8 && c <= 65536) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                    c -= ((c) entry.getKey()).b.length();
                    linkedHashMap2.remove(entry.getKey());
                }
            }
            c(eVar, eVar.length(), b10);
            return eVar;
        }
    }

    public static void c(Spannable spannable, int i3, String str) {
        j jVar;
        j jVar2;
        p pVar;
        if (spannable == null) {
            return;
        }
        if (i3 < 0 || i3 > spannable.length()) {
            throw new IndexOutOfBoundsException();
        }
        g gVar = new g(spannable.subSequence(0, i3).toString());
        long j10 = (0 << 32) | (i3 & 4294967295L);
        synchronized (d) {
            try {
                ArrayList arrayList = e;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        jVar = new j(spannable);
                        arrayList.add(jVar);
                        break;
                    }
                    jVar = (j) it.next();
                    Spannable spannable2 = (Spannable) jVar.a.get();
                    if (spannable2 == null) {
                        it.remove();
                    } else if (spannable2 == spannable) {
                        break;
                    }
                }
                jVar2 = jVar;
                g gVar2 = (g) jVar2.b.put(Long.valueOf(j10), gVar);
                if (gVar2 != null && (pVar = gVar2.b) != null) {
                    pVar.a = null;
                }
            } finally {
            }
        }
        p d10 = a.d(gVar.a, str, new o1(i3, 2, j10, jVar2, gVar));
        synchronized (d) {
            try {
                if (jVar2.b.get(Long.valueOf(j10)) == gVar) {
                    gVar.b = d10;
                } else {
                    d10.a = null;
                }
            } finally {
            }
        }
    }

    public static void d(Spannable spannable, int i3, CharacterStyle characterStyle) {
        int spanStart;
        int spanEnd;
        if (spannable instanceof e) {
            e eVar = (e) spannable;
            spanStart = e.b(eVar, characterStyle);
            spanEnd = e.c(eVar, characterStyle);
        } else {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        if (spanStart >= 0 && spanStart < 0) {
            spannable.setSpan(characterStyle instanceof d ? new d(((d) characterStyle).a) : new i(((i) characterStyle).b), spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i3) {
            spannable.setSpan(characterStyle instanceof d ? new d(((d) characterStyle).a) : new i(((i) characterStyle).b), Math.max(i3, spanStart), spanEnd, 33);
        }
    }
}
