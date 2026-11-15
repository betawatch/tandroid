package ai;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h2 {
    public static final HashSet h = new HashSet(Arrays.asList("a", "an", "and", "the", "but", "so", "or", "to", "of", "in", "on", "at", "for", "with", "it", "it's", "that", "this", "these", "those", "then", "than", "also", "because", "which", "who", "if", "when", "while", "just", "like", "is", "are", "was", "were", "be", "been", "we", "you", "they", "he", "she", "my", "our", "your", "their", "his", "her", "not", "as", "what", "how", "why", "where", "there", "here", "now", "do", "does", "did", "have", "has", "had", "will", "would", "can", "could", "should", "maybe", "really", "very", "too", "и", "а", "но", "что", "как", "это", "в", "во", "на", "с", "со", "к", "по", "за", "из", "у", "о", "об", "от", "до", "для", "что-то", "где", "почему", "зачем", "сейчас", "не", "ни", "же", "ли", "бы", "то", "так", "там", "тут", "вот", "ну", "или", "если", "когда", "потому", "чтобы", "мы", "вы", "он", "она", "они", "оно", "ты", "я", "мой", "моя", "мне", "меня", "его", "её", "их", "был", "была", "было", "были", "будет", "уже", "ещё", "еще", "тоже", "очень", "просто", "наверное", "может"));
    public boolean d;
    public boolean f;
    public a3.l g;
    public final StringBuilder a = new StringBuilder();
    public String b = "";
    public String c = "";
    public int e = -1;

    public static String c(String str) {
        if (str == null) {
            return "null";
        }
        if (str.length() <= 48) {
            return str;
        }
        return "…" + str.substring(str.length() - 46);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        r1 = r1 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String e(String str, String str2) {
        if (!str.isEmpty() && !str2.isEmpty()) {
            ArrayList o4 = o(str);
            ArrayList o10 = o(str2);
            if (!o10.isEmpty()) {
                if (o4.size() >= 2 && m(o10, o4, o4.size())) {
                    return f(o4.size(), str2);
                }
                if (o10.size() >= 3 && o10.size() <= o4.size() && o10.size() <= o4.size()) {
                    int size = o4.size() - o10.size();
                    for (int i7 = 0; i7 < o10.size(); i7++) {
                        if (((String) o4.get(size + i7)).equals(o10.get(i7))) {
                        }
                    }
                    return "";
                }
                int min = Math.min(16, Math.min(o10.size(), o4.size()));
                while (min >= 3) {
                    for (int i10 = 0; i10 < min; i10++) {
                        if (!((String) o4.get((o4.size() - min) + i10)).equals(o10.get(i10))) {
                            break;
                        }
                    }
                    return f(min, str2);
                }
            }
        }
        return str2;
    }

    public static String f(int i7, String str) {
        String[] split = str.trim().split("\\s+");
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length && i11 < i7) {
            if (!k(split[i10]).isEmpty()) {
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

    public static String i(String str, String str2) {
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

    public static String k(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isLetterOrDigit(charAt) || charAt == '\'') {
                sb2.append(Character.toLowerCase(charAt));
            }
        }
        return sb2.toString();
    }

    public static boolean l(String str, String str2) {
        return str.length() >= 3 && str2.length() >= 3 && str.regionMatches(0, str2, 0, Math.min(3, Math.min(str.length(), str2.length()))) && Math.abs(str.length() - str2.length()) <= 4;
    }

    public static boolean m(ArrayList arrayList, ArrayList arrayList2, int i7) {
        if (i7 > 0 && arrayList.size() >= i7 && arrayList2.size() >= i7) {
            for (int i10 = 0; i10 < i7; i10++) {
                if (((String) arrayList.get(i10)).equals(arrayList2.get(i10))) {
                }
            }
            return true;
        }
        return false;
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (String str2 : str.trim().split("\\s+")) {
                String k10 = k(str2);
                if (!k10.isEmpty()) {
                    arrayList.add(k10);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (r0.charAt(0) != ((java.lang.String) r1.get(0)).charAt(0)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0114, code lost:
    
        if (m(r0, r1, r1.size()) != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, boolean z10) {
        int i7;
        String e10 = e(this.a.toString(), str);
        if (e10.isEmpty()) {
            return;
        }
        if (!this.b.isEmpty()) {
            ArrayList o4 = o(e10);
            ArrayList o10 = o(this.b);
            if (m(o4, o10, o10.size())) {
                e10 = f(o10.size(), e10);
                if (e10.isEmpty()) {
                    this.c = "";
                    return;
                }
            } else {
                e10 = e(this.b, e10);
                if (e10.isEmpty()) {
                    return;
                }
            }
        }
        if (!this.c.isEmpty()) {
            if (!z10 || this.d) {
                ArrayList o11 = o(this.c);
                ArrayList o12 = o(e10);
                if (!o11.isEmpty() && !o12.isEmpty()) {
                    if (o11.size() == 1) {
                        String str2 = (String) o11.get(0);
                        if (o12.size() >= 3) {
                            if (!o12.contains(str2)) {
                                if (!l(str2, (String) o12.get(0))) {
                                }
                            }
                        }
                    } else {
                        int min = Math.min(4, Math.min(o11.size(), o12.size()));
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < min) {
                            String str3 = (String) o11.get(i10);
                            int max = Math.max(0, i10 - 1);
                            while (true) {
                                i7 = i10 + 1;
                                if (max > Math.min(o12.size() - 1, i7)) {
                                    break;
                                }
                                if (str3.equals(o12.get(max)) || l(str3, (String) o12.get(max))) {
                                    break;
                                } else {
                                    max++;
                                }
                            }
                            i11++;
                            i10 = i7;
                        }
                        if (i11 < Math.max(1, (min + 1) / 2)) {
                            if (o12.size() < o11.size()) {
                            }
                        }
                    }
                }
            }
            j("session " + this.e + " phrase reset: kept \"" + c(this.c) + "\", new \"" + c(e10) + "\"");
            String i12 = i(this.b, this.c);
            this.b = i12;
            e10 = e(i12, e10);
        }
        this.c = e10;
        this.d = z10;
    }

    public final void b(int i7) {
        if (this.f) {
            d("superseded");
        }
        this.e = i7;
        this.f = true;
        this.b = "";
        this.c = "";
        this.d = false;
        j("session " + i7 + " begin");
    }

    public final void d(String str) {
        String i7 = i(this.b, this.c);
        this.b = "";
        this.c = "";
        this.d = false;
        this.f = false;
        if (i7.isEmpty()) {
            j("session " + this.e + " close(" + str + ") empty");
            return;
        }
        StringBuilder sb2 = this.a;
        String e10 = e(sb2.toString(), i7);
        if (!e10.isEmpty()) {
            String i10 = i(sb2.toString(), e10);
            sb2.setLength(0);
            sb2.append(i10);
        }
        j("session " + this.e + " close(" + str + ") +\"" + c(e10) + "\" → " + sb2.length() + " chars");
    }

    public final void g(int i7, String str) {
        if (h(i7)) {
            d(str);
            return;
        }
        j("session " + i7 + " end(" + str + ") for a closed session ignored");
    }

    public final boolean h(int i7) {
        return this.f && i7 == this.e;
    }

    public final void j(String str) {
        a3.l lVar = this.g;
        if (lVar != null) {
            lVar.getClass();
            Log.d("Dictation", str);
        }
    }

    public final String n() {
        return i(i(this.a.toString(), this.b), this.c);
    }
}
