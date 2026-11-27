// default package

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class io3 {
    public static final HashSet h = new HashSet(Arrays.asList("a", "an", "and", "the", "but", "so", "or", "to", "of", "in", "on", "at", "for", "with", "it", "it's", "that", "this", "these", "those", "then", "than", "also", "because", "which", "who", "if", "when", "while", "just", "like", "is", "are", "was", "were", "be", "been", "we", "you", "they", "he", "she", "my", "our", "your", "their", "his", "her", "not", "as", "what", "how", "why", "where", "there", "here", "now", "do", "does", "did", "have", "has", "had", "will", "would", "can", "could", "should", "maybe", "really", "very", "too", "и", "а", "но", "что", "как", "это", "в", "во", "на", "с", "со", "к", "по", "за", "из", "у", "о", "об", "от", "до", "для", "что-то", "где", "почему", "зачем", "сейчас", "не", "ни", "же", "ли", "бы", "то", "так", "там", "тут", "вот", "ну", "или", "если", "когда", "потому", "чтобы", "мы", "вы", "он", "она", "они", "оно", "ты", "я", "мой", "моя", "мне", "меня", "его", "её", "их", "был", "была", "было", "были", "будет", "уже", "ещё", "еще", "тоже", "очень", "просто", "наверное", "может"));
    public boolean d;
    public boolean f;
    public da3 g;
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

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        r1 = r1 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(String str, String str2) {
        if (!str.isEmpty() && !str2.isEmpty()) {
            ArrayList n = n(str);
            ArrayList n2 = n(str2);
            if (!n2.isEmpty()) {
                if (n.size() >= 2 && l(n2, n, n.size())) {
                    return e(n.size(), str2);
                }
                if (n2.size() >= 3 && n2.size() <= n.size() && n2.size() <= n.size()) {
                    int size = n.size() - n2.size();
                    for (int i = 0; i < n2.size(); i++) {
                        if (((String) n.get(size + i)).equals(n2.get(i))) {
                        }
                    }
                    return "";
                }
                int min = Math.min(16, Math.min(n2.size(), n.size()));
                while (min >= 3) {
                    for (int i2 = 0; i2 < min; i2++) {
                        if (!((String) n.get((n.size() - min) + i2)).equals(n2.get(i2))) {
                            break;
                        }
                    }
                    return e(min, str2);
                }
            }
        }
        return str2;
    }

    public static String e(int i, String str) {
        String[] split = str.trim().split("\\s+");
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length && i3 < i) {
            if (!j(split[i2]).isEmpty()) {
                i3++;
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        while (i2 < split.length) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(split[i2]);
            i2++;
        }
        return sb.toString();
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
        boolean z = true;
        char charAt = trim.charAt(trim.length() - 1);
        if (charAt != '.' && charAt != '?' && charAt != '!' && charAt != 8230) {
            z = false;
        }
        int codePointAt = trim2.codePointAt(0);
        if (z) {
            if (Character.isLowerCase(codePointAt)) {
                trim2 = new String(Character.toChars(Character.toUpperCase(codePointAt))).concat(trim2.substring(Character.charCount(codePointAt)));
            }
        } else if (Character.isUpperCase(codePointAt)) {
            int i = 0;
            while (true) {
                if ((i >= trim2.length() || !Character.isLetter(trim2.charAt(i))) && (i >= trim2.length() || trim2.charAt(i) != '\'')) {
                    break;
                }
                i++;
            }
            String substring = trim2.substring(0, i);
            Locale locale = Locale.ROOT;
            String lowerCase = substring.toLowerCase(locale);
            if (trim2.substring(Character.charCount(codePointAt), i).equals(trim2.substring(Character.charCount(codePointAt), i).toLowerCase(locale)) && h.contains(lowerCase)) {
                trim2 = new String(Character.toChars(Character.toLowerCase(codePointAt))).concat(trim2.substring(Character.charCount(codePointAt)));
            }
        }
        return qd4.y(trim, " ", trim2);
    }

    public static String j(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isLetterOrDigit(charAt) || charAt == '\'') {
                sb.append(Character.toLowerCase(charAt));
            }
        }
        return sb.toString();
    }

    public static boolean k(String str, String str2) {
        return str.length() >= 3 && str2.length() >= 3 && str.regionMatches(0, str2, 0, Math.min(3, Math.min(str.length(), str2.length()))) && Math.abs(str.length() - str2.length()) <= 4;
    }

    public static boolean l(ArrayList arrayList, ArrayList arrayList2, int i) {
        if (i > 0 && arrayList.size() >= i && arrayList2.size() >= i) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((String) arrayList.get(i2)).equals(arrayList2.get(i2))) {
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
                String j = j(str2);
                if (!j.isEmpty()) {
                    arrayList.add(j);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r0.charAt(0) != ((java.lang.String) r1.get(0)).charAt(0)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
    
        if (l(r0, r1, r1.size()) == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, boolean z) {
        int i;
        String d = d(this.a.toString(), str);
        if (d.isEmpty()) {
            return;
        }
        if (!this.b.isEmpty()) {
            ArrayList n = n(d);
            ArrayList n2 = n(this.b);
            if (l(n, n2, n2.size())) {
                d = e(n2.size(), d);
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
            if (!z || this.d) {
                ArrayList n3 = n(this.c);
                ArrayList n4 = n(d);
                if (!n3.isEmpty() && !n4.isEmpty()) {
                    if (n3.size() == 1) {
                        String str2 = (String) n3.get(0);
                        if (n4.size() >= 3) {
                            if (!n4.contains(str2)) {
                                if (!k(str2, (String) n4.get(0))) {
                                }
                            }
                        }
                    } else {
                        int min = Math.min(4, Math.min(n3.size(), n4.size()));
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < min) {
                            String str3 = (String) n3.get(i2);
                            int max = Math.max(0, i2 - 1);
                            while (true) {
                                i = i2 + 1;
                                if (max > Math.min(n4.size() - 1, i)) {
                                    break;
                                }
                                if (str3.equals(n4.get(max)) || k(str3, (String) n4.get(max))) {
                                    break;
                                } else {
                                    max++;
                                }
                            }
                            i3++;
                            i2 = i;
                        }
                        if (i3 < Math.max(1, (min + 1) / 2)) {
                            if (n4.size() < n3.size()) {
                            }
                        }
                    }
                }
            }
            i("session " + this.e + " phrase reset: kept \"" + b(this.c) + "\", new \"" + b(d) + "\"");
            String h2 = h(this.b, this.c);
            this.b = h2;
            d = d(h2, d);
        }
        this.c = d;
        this.d = z;
    }

    public final void c(String str) {
        String h2 = h(this.b, this.c);
        this.b = "";
        this.c = "";
        this.d = false;
        this.f = false;
        if (h2.isEmpty()) {
            i("session " + this.e + " close(" + str + ") empty");
            return;
        }
        StringBuilder sb = this.a;
        String d = d(sb.toString(), h2);
        if (!d.isEmpty()) {
            String h3 = h(sb.toString(), d);
            sb.setLength(0);
            sb.append(h3);
        }
        i("session " + this.e + " close(" + str + ") +\"" + b(d) + "\" → " + sb.length() + " chars");
    }

    public final void f(int i, String str) {
        if (g(i)) {
            c(str);
            return;
        }
        i("session " + i + " end(" + str + ") for a closed session ignored");
    }

    public final boolean g(int i) {
        return this.f && i == this.e;
    }

    public final void i(String str) {
        if (this.g != null) {
            Log.d("Dictation", str);
        }
    }

    public final String m() {
        return h(h(this.a.toString(), this.b), this.c);
    }
}
