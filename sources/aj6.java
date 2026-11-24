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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class aj6 {
    public static final Set e = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", MediaStreamTrack.VIDEO_TRACK_KIND)));
    public final ArrayList a = new ArrayList(0);
    public fg5 b = new fg5("", 0, Collections.EMPTY_MAP, null);
    public boolean c;
    public boolean d;

    public aj6(o5f o5fVar, vi2 vi2Var) {
    }

    public static Map a(upb upbVar) {
        fy fyVar = upbVar.m;
        int i = fyVar.a;
        if (i <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(i);
        int i2 = 0;
        while (true) {
            if (!(i2 < fyVar.a)) {
                return DesugarCollections.unmodifiableMap(hashMap);
            }
            String str = fyVar.c[i2];
            String str2 = fyVar.b[i2];
            if (str == null) {
                str = "";
            }
            ey eyVar = new ey();
            if (str2 == null) {
                w26.j("Object must not be null");
                return null;
            }
            eyVar.a = str2.trim();
            if (str2.length() == 0) {
                w26.j("String must not be empty");
                return null;
            }
            eyVar.b = str;
            eyVar.c = fyVar;
            i2++;
            hashMap.put(eyVar.a.toLowerCase(Locale.US), eyVar.b);
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
    
        sdb.b(r0);
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
    
        lmd.a(r17, '\n');
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
    
        r12 = o5f.s0(r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [fs5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Appendable appendable, String str) {
        ppb ppbVar;
        String s0;
        int length;
        aqb aqbVar = new aqb(new zj1(str), new yu7(0));
        while (true) {
            if (aqbVar.e) {
                StringBuilder sb = aqbVar.g;
                int length2 = sb.length();
                gg5 gg5Var = null;
                ppb ppbVar2 = aqbVar.l;
                if (length2 > 0) {
                    String sb2 = sb.toString();
                    sb.delete(0, sb.length());
                    aqbVar.f = null;
                    ppbVar2.e = sb2;
                    ppbVar = ppbVar2;
                } else {
                    String str2 = aqbVar.f;
                    if (str2 != null) {
                        ppbVar2.e = str2;
                        aqbVar.f = null;
                        ppbVar = ppbVar2;
                    } else {
                        aqbVar.e = false;
                        ppbVar = aqbVar.d;
                    }
                }
                int i = ppbVar.b;
                if (6 == i) {
                    return;
                }
                int F = ug8.F(i);
                Set set = g;
                ArrayList arrayList = this.a;
                Set set2 = e;
                if (F == 1) {
                    upb upbVar = (upb) ppbVar;
                    boolean contains = set2.contains(upbVar.f);
                    String str3 = upbVar.f;
                    Set set3 = f;
                    if (contains) {
                        CharSequence charSequence = (CharSequence) appendable;
                        gg5 gg5Var2 = new gg5(charSequence.length(), str3, a(upbVar));
                        if (this.d) {
                            int length3 = charSequence.length();
                            if (length3 > 0 && '\n' != charSequence.charAt(length3 - 1)) {
                                lmd.a(appendable, '\n');
                            }
                            this.d = false;
                        }
                        if (set3.contains(str3) || upbVar.l) {
                            String s02 = o5f.s0(gg5Var2);
                            if (s02 != null && s02.length() > 0) {
                                try {
                                    appendable.append(s02);
                                } catch (IOException e2) {
                                    sdb.b(e2);
                                    return;
                                }
                            }
                            int length4 = charSequence.length();
                            if (gg5Var2.d <= -1) {
                                gg5Var2.d = length4;
                            }
                        }
                        arrayList.add(gg5Var2);
                    } else {
                        if ("p".equals(this.b.a)) {
                            this.b.b(((CharSequence) appendable).length());
                            lmd.a(appendable, '\n');
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
                                lmd.a(appendable, '\n');
                            }
                        } else if (this.d) {
                            CharSequence charSequence3 = (CharSequence) appendable;
                            int length6 = charSequence3.length();
                            if (length6 > 0 && '\n' != charSequence3.charAt(length6 - 1)) {
                                lmd.a(appendable, '\n');
                            }
                            this.d = false;
                        }
                        CharSequence charSequence4 = (CharSequence) appendable;
                        int length7 = charSequence4.length();
                        Map a = a(upbVar);
                        fg5 fg5Var = this.b;
                        fg5 fg5Var2 = new fg5(str3, length7, a, fg5Var);
                        boolean z = set3.contains(str3) || upbVar.l;
                        if (z) {
                            String s03 = o5f.s0(fg5Var2);
                            if (s03 != null && s03.length() > 0) {
                                try {
                                    appendable.append(s03);
                                } catch (IOException e3) {
                                    sdb.b(e3);
                                    return;
                                }
                            }
                            fg5Var2.b(charSequence4.length());
                        }
                        ArrayList arrayList2 = fg5Var.f;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(2);
                            fg5Var.f = arrayList2;
                        }
                        arrayList2.add(fg5Var2);
                        if (!z) {
                            this.b = fg5Var2;
                        }
                    }
                } else if (F == 2) {
                    tpb tpbVar = (tpb) ppbVar;
                    boolean contains2 = set2.contains(tpbVar.f);
                    String str4 = tpbVar.f;
                    if (contains2) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size <= -1) {
                                break;
                            }
                            gg5 gg5Var3 = (gg5) arrayList.get(size);
                            if (str4.equals(gg5Var3.a) && gg5Var3.d < 0) {
                                gg5Var = gg5Var3;
                                break;
                            }
                            size--;
                        }
                        if (gg5Var != null) {
                            CharSequence charSequence5 = (CharSequence) appendable;
                            if (gg5Var.b == charSequence5.length() && (s0 = o5f.s0(gg5Var)) != null) {
                                try {
                                    appendable.append(s0);
                                } catch (IOException e4) {
                                    sdb.b(e4);
                                    return;
                                }
                            }
                            int length8 = charSequence5.length();
                            if (gg5Var.d <= -1) {
                                gg5Var.d = length8;
                            }
                        }
                    } else {
                        fg5 fg5Var3 = this.b;
                        while (fg5Var3 != null && !str4.equals(fg5Var3.a) && fg5Var3.d <= -1) {
                            fg5Var3 = fg5Var3.e;
                        }
                    }
                } else if (F == 4) {
                    ppb ppbVar3 = ppbVar;
                    if (this.c) {
                        try {
                            appendable.append(ppbVar3.e);
                        } catch (IOException e5) {
                            sdb.b(e5);
                            return;
                        }
                    } else {
                        if (this.d) {
                            CharSequence charSequence6 = (CharSequence) appendable;
                            int length9 = charSequence6.length();
                            if (length9 > 0 && '\n' != charSequence6.charAt(length9 - 1)) {
                                lmd.a(appendable, '\n');
                            }
                            this.d = false;
                        }
                        String str5 = ppbVar3.e;
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
                                    lmd.a(appendable, ' ');
                                }
                                lmd.a(appendable, charAt);
                                z2 = false;
                            }
                        }
                        if (z2 && length10 < charSequence7.length()) {
                            lmd.a(appendable, ' ');
                        }
                    }
                }
                ppbVar.s();
            } else {
                aqbVar.c.c(aqbVar, aqbVar.a);
            }
        }
    }
}
