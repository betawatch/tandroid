package ai;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c2 {
    public static final HashSet h = new HashSet(Arrays.asList("a", "an", "and", "the", "but", "so", "or", "to", "of", "in", "on", "at", "for", "with", "it", "it's", "that", "this", "these", "those", "then", "than", "also", "because", "which", "who", "if", "when", "while", "just", "like", "is", "are", "was", "were", "be", "been", "we", "you", "they", "he", "she", "my", "our", "your", "their", "his", "her", "not", "as", "what", "how", "why", "where", "there", "here", "now", "do", "does", "did", "have", "has", "had", "will", "would", "can", "could", "should", "maybe", "really", "very", "too", "и", "а", "но", "что", "как", "это", "в", "во", "на", "с", "со", "к", "по", "за", "из", "у", "о", "об", "от", "до", "для", "что-то", "где", "почему", "зачем", "сейчас", "не", "ни", "же", "ли", "бы", "то", "так", "там", "тут", "вот", "ну", "или", "если", "когда", "потому", "чтобы", "мы", "вы", "он", "она", "они", "оно", "ты", "я", "мой", "моя", "мне", "меня", "его", "её", "их", "был", "была", "было", "были", "будет", "уже", "ещё", "еще", "тоже", "очень", "просто", "наверное", "может"));
    public boolean d;
    public boolean f;
    public a3.l g;
    public final StringBuilder a = new StringBuilder();
    public String b = "";
    public String c = "";
    public int e = -1;

    public static String b(String str) {
        if (str == null) {
            return "null";
        }
        return "<" + str.length() + " chars>";
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        r1 = r1 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(String str, String str2) {
        if (!str.isEmpty() && !str2.isEmpty()) {
            ArrayList n10 = n(str);
            ArrayList n11 = n(str2);
            if (!n11.isEmpty()) {
                if (n10.size() >= 2 && l(n11, n10, n10.size())) {
                    return e(n10.size(), str2);
                }
                if (n11.size() >= 3 && n11.size() <= n10.size() && n11.size() <= n10.size()) {
                    int size = n10.size() - n11.size();
                    for (int i7 = 0; i7 < n11.size(); i7++) {
                        if (((String) n10.get(size + i7)).equals(n11.get(i7))) {
                        }
                    }
                    return "";
                }
                int min = Math.min(16, Math.min(n11.size(), n10.size()));
                while (min >= 3) {
                    for (int i10 = 0; i10 < min; i10++) {
                        if (!((String) n10.get((n10.size() - min) + i10)).equals(n11.get(i10))) {
                            break;
                        }
                    }
                    return e(min, str2);
                }
            }
        }
        return str2;
    }

    public static String e(int i7, String str) {
        String[] split = str.trim().split("\\s+");
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length && i11 < i7) {
            if (!j(split[i10]).isEmpty()) {
                i11++;
            }
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 < split.length) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(split[i10]);
            i10++;
        }
        return sb2.toString();
    }

    public static String h(String str, String str2) {
        String trim = str == null ? "" : str.trim();
        String trim2 = str2 != null ? str2.trim() : "";
        if (trim.isEmpty()) {
            return trim2;
        }
        if (trim2.isEmpty()) {
            return trim;
        }
        boolean z10 = true;
        char charAt = trim.charAt(trim.length() - 1);
        if (charAt != '.' && charAt != '?' && charAt != '!' && charAt != 8230) {
            z10 = false;
        }
        int codePointAt = trim2.codePointAt(0);
        if (z10) {
            if (Character.isLowerCase(codePointAt)) {
                trim2 = new String(Character.toChars(Character.toUpperCase(codePointAt))) + trim2.substring(Character.charCount(codePointAt));
            }
        } else if (Character.isUpperCase(codePointAt)) {
            int i7 = 0;
            while (true) {
                if ((i7 >= trim2.length() || !Character.isLetter(trim2.charAt(i7))) && (i7 >= trim2.length() || trim2.charAt(i7) != '\'')) {
                    break;
                }
                i7++;
            }
            String substring = trim2.substring(0, i7);
            Locale locale = Locale.ROOT;
            String lowerCase = substring.toLowerCase(locale);
            if (trim2.substring(Character.charCount(codePointAt), i7).equals(trim2.substring(Character.charCount(codePointAt), i7).toLowerCase(locale)) && h.contains(lowerCase)) {
                trim2 = new String(Character.toChars(Character.toLowerCase(codePointAt))) + trim2.substring(Character.charCount(codePointAt));
            }
        }
        return a8.p0.E(trim, " ", trim2);
    }

    public static String j(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isLetterOrDigit(charAt) || charAt == '\'') {
                sb2.append(Character.toLowerCase(charAt));
            }
        }
        return sb2.toString();
    }

    public static boolean k(String str, String str2) {
        return str.length() >= 3 && str2.length() >= 3 && str.regionMatches(0, str2, 0, Math.min(3, Math.min(str.length(), str2.length()))) && Math.abs(str.length() - str2.length()) <= 4;
    }

    public static boolean l(ArrayList arrayList, ArrayList arrayList2, int i7) {
        if (i7 > 0 && arrayList.size() >= i7 && arrayList2.size() >= i7) {
            for (int i10 = 0; i10 < i7; i10++) {
                if (((String) arrayList.get(i10)).equals(arrayList2.get(i10))) {
                }
            }
            return true;
        }
        return false;
    }

    public static ArrayList n(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (String str2 : str.trim().split("\\s+")) {
                String j3 = j(str2);
                if (!j3.isEmpty()) {
                    arrayList.add(j3);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (r0.charAt(0) != ((java.lang.String) r1.get(0)).charAt(0)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0114, code lost:
    
        if (l(r0, r1, r1.size()) != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, boolean z10) {
        int i7;
        String d = d(this.a.toString(), str);
        if (d.isEmpty()) {
            return;
        }
        if (!this.b.isEmpty()) {
            ArrayList n10 = n(d);
            ArrayList n11 = n(this.b);
            if (l(n10, n11, n11.size())) {
                d = e(n11.size(), d);
                if (d.isEmpty()) {
                    this.c = "";
                    return;
                }
            } else {
                d = d(this.b, d);
                if (d.isEmpty()) {
                    return;
                }
            }
        }
        if (!this.c.isEmpty()) {
            if (!z10 || this.d) {
                ArrayList n12 = n(this.c);
                ArrayList n13 = n(d);
                if (!n12.isEmpty() && !n13.isEmpty()) {
                    if (n12.size() == 1) {
                        String str2 = (String) n12.get(0);
                        if (n13.size() >= 3) {
                            if (!n13.contains(str2)) {
                                if (!k(str2, (String) n13.get(0))) {
                                }
                            }
                        }
                    } else {
                        int min = Math.min(4, Math.min(n12.size(), n13.size()));
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < min) {
                            String str3 = (String) n12.get(i10);
                            int max = Math.max(0, i10 - 1);
                            while (true) {
                                i7 = i10 + 1;
                                if (max > Math.min(n13.size() - 1, i7)) {
                                    break;
                                }
                                if (str3.equals(n13.get(max)) || k(str3, (String) n13.get(max))) {
                                    break;
                                } else {
                                    max++;
                                }
                            }
                            i11++;
                            i10 = i7;
                        }
                        if (i11 < Math.max(1, (min + 1) / 2)) {
                            if (n13.size() < n12.size()) {
                            }
                        }
                    }
                }
            }
            i("session " + this.e + " phrase reset: kept \"" + b(this.c) + "\", new \"" + b(d) + "\"");
            String h7 = h(this.b, this.c);
            this.b = h7;
            d = d(h7, d);
        }
        this.c = d;
        this.d = z10;
    }

    public final void c(String str) {
        String h7 = h(this.b, this.c);
        this.b = "";
        this.c = "";
        this.d = false;
        this.f = false;
        if (h7.isEmpty()) {
            i("session " + this.e + " close(" + str + ") empty");
            return;
        }
        StringBuilder sb2 = this.a;
        String d = d(sb2.toString(), h7);
        if (!d.isEmpty()) {
            String h10 = h(sb2.toString(), d);
            sb2.setLength(0);
            sb2.append(h10);
        }
        i("session " + this.e + " close(" + str + ") +\"" + b(d) + "\" → " + sb2.length() + " chars");
    }

    public final void f(int i7, String str) {
        if (g(i7)) {
            c(str);
            return;
        }
        i("session " + i7 + " end(" + str + ") for a closed session ignored");
    }

    public final boolean g(int i7) {
        return this.f && i7 == this.e;
    }

    public final void i(String str) {
        a3.l lVar = this.g;
        if (lVar != null) {
            lVar.getClass();
            Log.d("Dictation", str);
        }
    }

    public final String m() {
        return h(h(this.a.toString(), this.b), this.c);
    }
}
