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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dl6 {
    public static final Set e = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", MediaStreamTrack.VIDEO_TRACK_KIND)));
    public final ArrayList a = new ArrayList(0);
    public ei5 b = new ei5("", 0, Collections.EMPTY_MAP, null);
    public boolean c;
    public boolean d;

    public dl6(q7f q7fVar, jk2 jk2Var) {
    }

    public static Map a(vrb vrbVar) {
        fz fzVar = vrbVar.m;
        int i = fzVar.a;
        if (i <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(i);
        int i2 = 0;
        while (true) {
            if (!(i2 < fzVar.a)) {
                return DesugarCollections.unmodifiableMap(hashMap);
            }
            String str = fzVar.c[i2];
            String str2 = fzVar.b[i2];
            if (str == null) {
                str = "";
            }
            ez ezVar = new ez();
            if (str2 == null) {
                u36.j("Object must not be null");
                return null;
            }
            ezVar.a = str2.trim();
            if (str2.length() == 0) {
                u36.j("String must not be empty");
                return null;
            }
            ezVar.b = str;
            ezVar.c = fzVar;
            i2++;
            hashMap.put(ezVar.a.toLowerCase(Locale.US), ezVar.b);
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
    
        rjb.m(r0);
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
    
        ood.a(r17, '\n');
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
    
        r12 = q7f.B0(r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eu5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Appendable appendable, String str) {
        qrb qrbVar;
        String B0;
        int length;
        bsb bsbVar = new bsb(new hl1(str), new zw7(0));
        while (true) {
            if (bsbVar.e) {
                StringBuilder sb = bsbVar.g;
                int length2 = sb.length();
                fi5 fi5Var = null;
                qrb qrbVar2 = bsbVar.l;
                if (length2 > 0) {
                    String sb2 = sb.toString();
                    sb.delete(0, sb.length());
                    bsbVar.f = null;
                    qrbVar2.e = sb2;
                    qrbVar = qrbVar2;
                } else {
                    String str2 = bsbVar.f;
                    if (str2 != null) {
                        qrbVar2.e = str2;
                        bsbVar.f = null;
                        qrbVar = qrbVar2;
                    } else {
                        bsbVar.e = false;
                        qrbVar = bsbVar.d;
                    }
                }
                int i = qrbVar.b;
                if (6 == i) {
                    return;
                }
                int F = wi8.F(i);
                Set set = g;
                ArrayList arrayList = this.a;
                Set set2 = e;
                if (F == 1) {
                    vrb vrbVar = (vrb) qrbVar;
                    boolean contains = set2.contains(vrbVar.f);
                    String str3 = vrbVar.f;
                    Set set3 = f;
                    if (contains) {
                        CharSequence charSequence = (CharSequence) appendable;
                        fi5 fi5Var2 = new fi5(charSequence.length(), str3, a(vrbVar));
                        if (this.d) {
                            int length3 = charSequence.length();
                            if (length3 > 0 && '\n' != charSequence.charAt(length3 - 1)) {
                                ood.a(appendable, '\n');
                            }
                            this.d = false;
                        }
                        if (set3.contains(str3) || vrbVar.l) {
                            String B02 = q7f.B0(fi5Var2);
                            if (B02 != null && B02.length() > 0) {
                                try {
                                    appendable.append(B02);
                                } catch (IOException e2) {
                                    rjb.m(e2);
                                    return;
                                }
                            }
                            int length4 = charSequence.length();
                            if (fi5Var2.d <= -1) {
                                fi5Var2.d = length4;
                            }
                        }
                        arrayList.add(fi5Var2);
                    } else {
                        if ("p".equals(this.b.a)) {
                            this.b.b(((CharSequence) appendable).length());
                            ood.a(appendable, '\n');
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
                                ood.a(appendable, '\n');
                            }
                        } else if (this.d) {
                            CharSequence charSequence3 = (CharSequence) appendable;
                            int length6 = charSequence3.length();
                            if (length6 > 0 && '\n' != charSequence3.charAt(length6 - 1)) {
                                ood.a(appendable, '\n');
                            }
                            this.d = false;
                        }
                        CharSequence charSequence4 = (CharSequence) appendable;
                        int length7 = charSequence4.length();
                        Map a = a(vrbVar);
                        ei5 ei5Var = this.b;
                        ei5 ei5Var2 = new ei5(str3, length7, a, ei5Var);
                        boolean z = set3.contains(str3) || vrbVar.l;
                        if (z) {
                            String B03 = q7f.B0(ei5Var2);
                            if (B03 != null && B03.length() > 0) {
                                try {
                                    appendable.append(B03);
                                } catch (IOException e3) {
                                    rjb.m(e3);
                                    return;
                                }
                            }
                            ei5Var2.b(charSequence4.length());
                        }
                        ArrayList arrayList2 = ei5Var.f;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(2);
                            ei5Var.f = arrayList2;
                        }
                        arrayList2.add(ei5Var2);
                        if (!z) {
                            this.b = ei5Var2;
                        }
                    }
                } else if (F == 2) {
                    urb urbVar = (urb) qrbVar;
                    boolean contains2 = set2.contains(urbVar.f);
                    String str4 = urbVar.f;
                    if (contains2) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size <= -1) {
                                break;
                            }
                            fi5 fi5Var3 = (fi5) arrayList.get(size);
                            if (str4.equals(fi5Var3.a) && fi5Var3.d < 0) {
                                fi5Var = fi5Var3;
                                break;
                            }
                            size--;
                        }
                        if (fi5Var != null) {
                            CharSequence charSequence5 = (CharSequence) appendable;
                            if (fi5Var.b == charSequence5.length() && (B0 = q7f.B0(fi5Var)) != null) {
                                try {
                                    appendable.append(B0);
                                } catch (IOException e4) {
                                    rjb.m(e4);
                                    return;
                                }
                            }
                            int length8 = charSequence5.length();
                            if (fi5Var.d <= -1) {
                                fi5Var.d = length8;
                            }
                        }
                    } else {
                        ei5 ei5Var3 = this.b;
                        while (ei5Var3 != null && !str4.equals(ei5Var3.a) && ei5Var3.d <= -1) {
                            ei5Var3 = ei5Var3.e;
                        }
                    }
                } else if (F == 4) {
                    qrb qrbVar3 = qrbVar;
                    if (this.c) {
                        try {
                            appendable.append(qrbVar3.e);
                        } catch (IOException e5) {
                            rjb.m(e5);
                            return;
                        }
                    } else {
                        if (this.d) {
                            CharSequence charSequence6 = (CharSequence) appendable;
                            int length9 = charSequence6.length();
                            if (length9 > 0 && '\n' != charSequence6.charAt(length9 - 1)) {
                                ood.a(appendable, '\n');
                            }
                            this.d = false;
                        }
                        String str5 = qrbVar3.e;
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
                                    ood.a(appendable, ' ');
                                }
                                ood.a(appendable, charAt);
                                z2 = false;
                            }
                        }
                        if (z2 && length10 < charSequence7.length()) {
                            ood.a(appendable, ' ');
                        }
                    }
                }
                qrbVar.s();
            } else {
                bsbVar.c.c(bsbVar, bsbVar.a);
            }
        }
    }
}
