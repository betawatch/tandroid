package ni;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.google.android.gms.internal.play_billing.s0;
import hi.n1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public abstract class m {
    public static int c;
    public static final s a = new s(new a(0), new a(1));
    public static final LinkedHashMap b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    public static void a(Spannable spannable, int i7, s0 s0Var) {
        if (i7 == 0) {
            return;
        }
        boolean z9 = spannable instanceof g;
        for (f fVar : (f[]) (z9 ? g.a((g) spannable, i7, f.class) : spannable.getSpans(0, i7, f.class))) {
            d(spannable, i7, fVar);
            spannable.removeSpan(fVar);
        }
        for (k kVar : (k[]) (z9 ? g.a((g) spannable, i7, k.class) : spannable.getSpans(0, i7, k.class))) {
            d(spannable, i7, kVar);
            spannable.removeSpan(kVar);
        }
        if (s0Var == null) {
            return;
        }
        int[] b10 = s0Var.b();
        for (int i10 = 0; i10 < b10.length; i10 += 3) {
            int i11 = b10[i10];
            int i12 = b10[i10 + 1];
            int i13 = b10[i10 + 2];
            if (i11 >= 0 && i12 <= i7 && i11 < i12) {
                int i14 = i13 & qs.e4;
                if (i14 != 0) {
                    spannable.setSpan(new f(i14), i11, i12, 33);
                }
                if ((i13 & 768) != 0) {
                    spannable.setSpan(new k(i13), i11, i12, 33);
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
        e eVar = new e(b10, charSequence2);
        boolean z9 = !(charSequence instanceof Spanned) && charSequence2.length() <= 65536;
        LinkedHashMap linkedHashMap = b;
        synchronized (linkedHashMap) {
            if (z9) {
                try {
                    SpannableString spannableString = (SpannableString) linkedHashMap.get(eVar);
                    if (spannableString != null) {
                        return spannableString;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g gVar = new g(charSequence);
            if (z9) {
                linkedHashMap.put(eVar, gVar);
                c += charSequence2.length();
                while (true) {
                    LinkedHashMap linkedHashMap2 = b;
                    if (linkedHashMap2.size() <= 8 && c <= 65536) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                    c -= ((e) entry.getKey()).b.length();
                    linkedHashMap2.remove(entry.getKey());
                }
            }
            c(gVar, gVar.length(), b10);
            return gVar;
        }
    }

    public static void c(Spannable spannable, int i7, String str) {
        l lVar;
        l lVar2;
        r rVar;
        if (spannable == null) {
            return;
        }
        if (i7 < 0 || i7 > spannable.length()) {
            throw new IndexOutOfBoundsException();
        }
        i iVar = new i(spannable.subSequence(0, i7).toString());
        long j3 = (0 << 32) | (i7 & 4294967295L);
        synchronized (d) {
            try {
                ArrayList arrayList = e;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        lVar = new l(spannable);
                        arrayList.add(lVar);
                        break;
                    }
                    lVar = (l) it.next();
                    Spannable spannable2 = (Spannable) lVar.a.get();
                    if (spannable2 == null) {
                        it.remove();
                    } else if (spannable2 == spannable) {
                        break;
                    }
                }
                lVar2 = lVar;
                i iVar2 = (i) lVar2.b.put(Long.valueOf(j3), iVar);
                if (iVar2 != null && (rVar = iVar2.b) != null) {
                    rVar.a = null;
                }
            } finally {
            }
        }
        r d2 = a.d(iVar.a, str, new n1(i7, 2, j3, lVar2, iVar));
        synchronized (d) {
            try {
                if (lVar2.b.get(Long.valueOf(j3)) == iVar) {
                    iVar.b = d2;
                } else {
                    d2.a = null;
                }
            } finally {
            }
        }
    }

    public static void d(Spannable spannable, int i7, CharacterStyle characterStyle) {
        int spanStart;
        int spanEnd;
        if (spannable instanceof g) {
            g gVar = (g) spannable;
            spanStart = g.b(gVar, characterStyle);
            spanEnd = g.c(gVar, characterStyle);
        } else {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        if (spanStart >= 0 && spanStart < 0) {
            spannable.setSpan(characterStyle instanceof f ? new f(((f) characterStyle).a) : new k(((k) characterStyle).b), spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i7) {
            spannable.setSpan(characterStyle instanceof f ? new f(((f) characterStyle).a) : new k(((k) characterStyle).b), Math.max(i7, spanStart), spanEnd, 33);
        }
    }
}
