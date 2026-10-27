package ni;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.google.android.gms.internal.play_billing.s0;
import hi.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m4.x0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class k {
    public static int c;
    public static final q a = new q(new x0(19), new x0(20));
    public static final LinkedHashMap b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    public static void a(Spannable spannable, int i10, s0 s0Var) {
        if (i10 == 0) {
            return;
        }
        boolean z10 = spannable instanceof e;
        for (d dVar : (d[]) (z10 ? e.a((e) spannable, i10, d.class) : spannable.getSpans(0, i10, d.class))) {
            d(spannable, i10, dVar);
            spannable.removeSpan(dVar);
        }
        for (i iVar : (i[]) (z10 ? e.a((e) spannable, i10, i.class) : spannable.getSpans(0, i10, i.class))) {
            d(spannable, i10, iVar);
            spannable.removeSpan(iVar);
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
                int i15 = i14 & 255;
                if (i15 != 0) {
                    spannable.setSpan(new d(i15), i12, i13, 33);
                }
                if ((i14 & 768) != 0) {
                    spannable.setSpan(new i(i14), i12, i13, 33);
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

    public static void c(Spannable spannable, int i10, String str) {
        j jVar;
        p pVar;
        if (spannable == null) {
            return;
        }
        if (i10 < 0 || i10 > spannable.length()) {
            throw new IndexOutOfBoundsException();
        }
        g gVar = new g(spannable.subSequence(0, i10).toString());
        long j10 = (0 << 32) | (i10 & 4294967295L);
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
                g gVar2 = (g) jVar.b.put(Long.valueOf(j10), gVar);
                if (gVar2 != null && (pVar = gVar2.b) != null) {
                    pVar.a = null;
                }
            } finally {
            }
        }
        j jVar2 = jVar;
        p d10 = a.d(gVar.a, str, new x1(jVar2, j10, gVar, i10));
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

    public static void d(Spannable spannable, int i10, CharacterStyle characterStyle) {
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
        if (spanEnd > i10) {
            spannable.setSpan(characterStyle instanceof d ? new d(((d) characterStyle).a) : new i(((i) characterStyle).b), Math.max(i10, spanStart), spanEnd, 33);
        }
    }
}
