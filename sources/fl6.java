// default package

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fl6 {
    public static final Set e = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", MediaStreamTrack.VIDEO_TRACK_KIND)));
    public final ArrayList a = new ArrayList(0);
    public hi5 b = new hi5("", 0, Collections.EMPTY_MAP, null);
    public boolean c;
    public boolean d;

    public fl6(faf fafVar, rj2 rj2Var) {
    }

    public static Map a(vtb vtbVar) {
        gy gyVar = vtbVar.m;
        int i = gyVar.a;
        if (i <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(i);
        int i2 = 0;
        while (true) {
            if (!(i2 < gyVar.a)) {
                return DesugarCollections.unmodifiableMap(hashMap);
            }
            String str = gyVar.c[i2];
            String str2 = gyVar.b[i2];
            if (str == null) {
                str = "";
            }
            fy fyVar = new fy();
            if (str2 == null) {
                lq5.j("Object must not be null");
                return null;
            }
            fyVar.a = str2.trim();
            if (str2.length() == 0) {
                lq5.j("String must not be empty");
                return null;
            }
            fyVar.b = str;
            fyVar.c = gyVar;
            i2++;
            hashMap.put(fyVar.a.toLowerCase(Locale.US), fyVar.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0160, code lost:
    
        if (r12 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0162, code lost:
    
        r17.append(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0166, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0167, code lost:
    
        grb.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x016a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x016b, code lost:
    
        r6.b(r11.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0174, code lost:
    
        if (r4 == r6.d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0176, code lost:
    
        r16.d = r10.contains(r6.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0182, code lost:
    
        if ("p".equals(r3) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0184, code lost:
    
        crd.a(r17, '\n');
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0187, code lost:
    
        r16.b = r6.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0149, code lost:
    
        r4 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014f, code lost:
    
        if ("pre".equals(r3) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0151, code lost:
    
        r16.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0153, code lost:
    
        r11 = (java.lang.CharSequence) r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x015a, code lost:
    
        if (r4 != r11.length()) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x015c, code lost:
    
        r12 = faf.B0(r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [iu5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Appendable appendable, String str) {
        qtb qtbVar;
        String B0;
        int length;
        bub bubVar = new bub(new ik1(str), new fy7(0));
        while (true) {
            if (bubVar.e) {
                StringBuilder sb = bubVar.g;
                int length2 = sb.length();
                ii5 ii5Var = null;
                qtb qtbVar2 = bubVar.l;
                if (length2 > 0) {
                    String sb2 = sb.toString();
                    sb.delete(0, sb.length());
                    bubVar.f = null;
                    qtbVar2.e = sb2;
                    qtbVar = qtbVar2;
                } else {
                    String str2 = bubVar.f;
                    if (str2 != null) {
                        qtbVar2.e = str2;
                        bubVar.f = null;
                        qtbVar = qtbVar2;
                    } else {
                        bubVar.e = false;
                        qtbVar = bubVar.d;
                    }
                }
                int i = qtbVar.b;
                if (6 == i) {
                    return;
                }
                int F = ik8.F(i);
                Set set = g;
                ArrayList arrayList = this.a;
                Set set2 = e;
                if (F == 1) {
                    vtb vtbVar = (vtb) qtbVar;
                    boolean contains = set2.contains(vtbVar.f);
                    String str3 = vtbVar.f;
                    Set set3 = f;
                    if (contains) {
                        CharSequence charSequence = (CharSequence) appendable;
                        ii5 ii5Var2 = new ii5(charSequence.length(), str3, a(vtbVar));
                        if (this.d) {
                            int length3 = charSequence.length();
                            if (length3 > 0 && '\n' != charSequence.charAt(length3 - 1)) {
                                crd.a(appendable, '\n');
                            }
                            this.d = false;
                        }
                        if (set3.contains(str3) || vtbVar.l) {
                            String B02 = faf.B0(ii5Var2);
                            if (B02 != null && B02.length() > 0) {
                                try {
                                    appendable.append(B02);
                                } catch (IOException e2) {
                                    grb.m(e2);
                                    return;
                                }
                            }
                            int length4 = charSequence.length();
                            if (ii5Var2.d <= -1) {
                                ii5Var2.d = length4;
                            }
                        }
                        arrayList.add(ii5Var2);
                    } else {
                        if ("p".equals(this.b.a)) {
                            this.b.b(((CharSequence) appendable).length());
                            crd.a(appendable, '\n');
                            this.b = this.b.e;
                        } else if ("li".equals(str3) && "li".equals(this.b.a)) {
                            this.b.b(((CharSequence) appendable).length());
                            this.b = this.b.e;
                        }
                        if (set.contains(str3)) {
                            this.c = "pre".equals(str3);
                            CharSequence charSequence2 = (CharSequence) appendable;
                            int length5 = charSequence2.length();
                            if (length5 > 0 && '\n' != charSequence2.charAt(length5 - 1)) {
                                crd.a(appendable, '\n');
                            }
                        } else if (this.d) {
                            CharSequence charSequence3 = (CharSequence) appendable;
                            int length6 = charSequence3.length();
                            if (length6 > 0 && '\n' != charSequence3.charAt(length6 - 1)) {
                                crd.a(appendable, '\n');
                            }
                            this.d = false;
                        }
                        CharSequence charSequence4 = (CharSequence) appendable;
                        int length7 = charSequence4.length();
                        Map a = a(vtbVar);
                        hi5 hi5Var = this.b;
                        hi5 hi5Var2 = new hi5(str3, length7, a, hi5Var);
                        boolean z = set3.contains(str3) || vtbVar.l;
                        if (z) {
                            String B03 = faf.B0(hi5Var2);
                            if (B03 != null && B03.length() > 0) {
                                try {
                                    appendable.append(B03);
                                } catch (IOException e3) {
                                    grb.m(e3);
                                    return;
                                }
                            }
                            hi5Var2.b(charSequence4.length());
                        }
                        ArrayList arrayList2 = hi5Var.f;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(2);
                            hi5Var.f = arrayList2;
                        }
                        arrayList2.add(hi5Var2);
                        if (!z) {
                            this.b = hi5Var2;
                        }
                    }
                } else if (F == 2) {
                    utb utbVar = (utb) qtbVar;
                    boolean contains2 = set2.contains(utbVar.f);
                    String str4 = utbVar.f;
                    if (contains2) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size <= -1) {
                                break;
                            }
                            ii5 ii5Var3 = (ii5) arrayList.get(size);
                            if (str4.equals(ii5Var3.a) && ii5Var3.d < 0) {
                                ii5Var = ii5Var3;
                                break;
                            }
                            size--;
                        }
                        if (ii5Var != null) {
                            CharSequence charSequence5 = (CharSequence) appendable;
                            if (ii5Var.b == charSequence5.length() && (B0 = faf.B0(ii5Var)) != null) {
                                try {
                                    appendable.append(B0);
                                } catch (IOException e4) {
                                    grb.m(e4);
                                    return;
                                }
                            }
                            int length8 = charSequence5.length();
                            if (ii5Var.d <= -1) {
                                ii5Var.d = length8;
                            }
                        }
                    } else {
                        hi5 hi5Var3 = this.b;
                        while (hi5Var3 != null && !str4.equals(hi5Var3.a) && hi5Var3.d <= -1) {
                            hi5Var3 = hi5Var3.e;
                        }
                    }
                } else if (F == 4) {
                    qtb qtbVar3 = qtbVar;
                    if (this.c) {
                        try {
                            appendable.append(qtbVar3.e);
                        } catch (IOException e5) {
                            grb.m(e5);
                            return;
                        }
                    } else {
                        if (this.d) {
                            CharSequence charSequence6 = (CharSequence) appendable;
                            int length9 = charSequence6.length();
                            if (length9 > 0 && '\n' != charSequence6.charAt(length9 - 1)) {
                                crd.a(appendable, '\n');
                            }
                            this.d = false;
                        }
                        String str5 = qtbVar3.e;
                        CharSequence charSequence7 = (CharSequence) appendable;
                        int length10 = charSequence7.length();
                        int length11 = str5.length();
                        boolean z2 = false;
                        for (int i2 = 0; i2 < length11; i2++) {
                            char charAt = str5.charAt(i2);
                            if (Character.isWhitespace(charAt)) {
                                z2 = true;
                            } else {
                                if (z2 && (length = charSequence7.length()) > 0 && !Character.isWhitespace(charSequence7.charAt(length - 1))) {
                                    crd.a(appendable, ' ');
                                }
                                crd.a(appendable, charAt);
                                z2 = false;
                            }
                        }
                        if (z2 && length10 < charSequence7.length()) {
                            crd.a(appendable, ' ');
                        }
                    }
                }
                qtbVar.s();
            } else {
                bubVar.c.c(bubVar, bubVar.a);
            }
        }
    }
}
