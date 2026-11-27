// default package

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class mk2 {
    public static int c;
    public static final wm8 a = new wm8(new c22(13), new c22(14));
    public static final LinkedHashMap b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    public static void a(Spannable spannable, int i, j26 j26Var) {
        Object[] spans;
        Object[] spans2;
        if (i != 0) {
            boolean z = spannable instanceof gk2;
            if (z) {
                int i2 = gk2.b;
                spans = ((gk2) spannable).c(fk2.class, i);
            } else {
                spans = spannable.getSpans(0, i, fk2.class);
            }
            for (fk2 fk2Var : (fk2[]) spans) {
                d(spannable, i, fk2Var);
                spannable.removeSpan(fk2Var);
            }
            if (z) {
                int i3 = gk2.b;
                spans2 = ((gk2) spannable).c(kk2.class, i);
            } else {
                spans2 = spannable.getSpans(0, i, kk2.class);
            }
            for (kk2 kk2Var : (kk2[]) spans2) {
                d(spannable, i, kk2Var);
                spannable.removeSpan(kk2Var);
            }
            if (j26Var != null) {
                int[] b2 = j26Var.b();
                for (int i4 = 0; i4 < b2.length; i4 += 3) {
                    int i5 = b2[i4];
                    int i6 = b2[i4 + 1];
                    int i7 = b2[i4 + 2];
                    if (i5 >= 0 && i6 <= i && i5 < i6) {
                        int i8 = i7 & jn7.d4;
                        if (i8 != 0) {
                            spannable.setSpan(new fk2(i8), i5, i6, 33);
                        }
                        if ((i7 & 768) != 0) {
                            spannable.setSpan(new kk2(i7), i5, i6, 33);
                        }
                    }
                }
            }
        }
    }

    public static SpannableString b(CharSequence charSequence, String str) {
        if (charSequence == null) {
            charSequence = "";
        }
        String b2 = wm8.b(str);
        if (b2.isEmpty() || charSequence.length() == 0) {
            return new SpannableString(charSequence);
        }
        String charSequence2 = charSequence.toString();
        ek2 ek2Var = new ek2(b2, charSequence2);
        boolean z = !(charSequence instanceof Spanned) && charSequence2.length() <= 65536;
        LinkedHashMap linkedHashMap = b;
        synchronized (linkedHashMap) {
            if (z) {
                SpannableString spannableString = (SpannableString) linkedHashMap.get(ek2Var);
                if (spannableString != null) {
                    return spannableString;
                }
            }
            gk2 gk2Var = new gk2(charSequence);
            if (z) {
                linkedHashMap.put(ek2Var, gk2Var);
                c += charSequence2.length();
                while (true) {
                    LinkedHashMap linkedHashMap2 = b;
                    if (linkedHashMap2.size() <= 8 && c <= 65536) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                    c -= ((ek2) entry.getKey()).b.length();
                    linkedHashMap2.remove(entry.getKey());
                }
            }
            c(gk2Var, gk2Var.length(), b2);
            return gk2Var;
        }
    }

    public static void c(Spannable spannable, int i, String str) {
        lk2 lk2Var;
        vm8 vm8Var;
        if (spannable == null) {
            return;
        }
        if (i < 0 || i > spannable.length()) {
            throw new IndexOutOfBoundsException();
        }
        ik2 ik2Var = new ik2(spannable.subSequence(0, i).toString());
        long j = i & 4294967295L;
        synchronized (d) {
            ArrayList arrayList = e;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    lk2Var = new lk2(spannable);
                    arrayList.add(lk2Var);
                    break;
                }
                lk2Var = (lk2) it.next();
                Spannable spannable2 = (Spannable) lk2Var.a.get();
                if (spannable2 == null) {
                    it.remove();
                } else if (spannable2 == spannable) {
                    break;
                }
            }
            ik2 ik2Var2 = (ik2) lk2Var.b.put(Long.valueOf(j), ik2Var);
            if (ik2Var2 != null && (vm8Var = ik2Var2.b) != null) {
                vm8Var.a = null;
            }
        }
        lk2 lk2Var2 = lk2Var;
        vm8 d2 = a.d(ik2Var.a, str, new ff(lk2Var2, j, ik2Var, i, (byte) 3));
        synchronized (d) {
            if (lk2Var2.b.get(Long.valueOf(j)) == ik2Var) {
                ik2Var.b = d2;
            } else {
                d2.a = null;
            }
        }
    }

    public static void d(Spannable spannable, int i, CharacterStyle characterStyle) {
        int spanStart;
        int spanEnd;
        if (spannable instanceof gk2) {
            gk2 gk2Var = (gk2) spannable;
            int i2 = gk2.b;
            spanStart = gk2Var.b(characterStyle);
            spanEnd = gk2Var.a(characterStyle);
        } else {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        if (spanStart >= 0 && spanStart < 0) {
            spannable.setSpan(characterStyle instanceof fk2 ? new fk2(((fk2) characterStyle).a) : new kk2(((kk2) characterStyle).b), spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i) {
            spannable.setSpan(characterStyle instanceof fk2 ? new fk2(((fk2) characterStyle).a) : new kk2(((kk2) characterStyle).b), Math.max(i, spanStart), spanEnd, 33);
        }
    }
}
