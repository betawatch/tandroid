package mc;

import h7.u;
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
import k7.s;
import k7.t;
import m1.j;
import org.webrtc.MediaStreamTrack;
import pc.h;
import pc.i;
import pc.k;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d extends t {
    public static final Set g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", MediaStreamTrack.VIDEO_TRACK_KIND)));
    public final u a;
    public final z9.d b;
    public final ArrayList c = new ArrayList(0);
    public a d = new a("", 0, Collections.EMPTY_MAP, null);
    public boolean e;
    public boolean f;

    public d(u uVar, z9.d dVar) {
        this.a = uVar;
        this.b = dVar;
    }

    public static Map a(i iVar) {
        oc.b bVar = iVar.v;
        int i10 = bVar.a;
        if (i10 <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(i10);
        int i11 = 0;
        while (true) {
            if (!(i11 < bVar.a)) {
                return DesugarCollections.unmodifiableMap(hashMap);
            }
            String str = bVar.c[i11];
            String str2 = bVar.b[i11];
            if (str == null) {
                str = "";
            }
            oc.a aVar = new oc.a();
            if (str2 == null) {
                throw new IllegalArgumentException("Object must not be null");
            }
            aVar.a = str2.trim();
            if (str2.length() == 0) {
                throw new IllegalArgumentException("String must not be empty");
            }
            aVar.b = str;
            aVar.c = bVar;
            i11++;
            hashMap.put(aVar.a.toLowerCase(Locale.US), aVar.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017a, code lost:
    
        if (r8 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        r17.append(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0180, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0186, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0187, code lost:
    
        r6.b(r12.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0190, code lost:
    
        if (r4 != r6.d) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0193, code lost:
    
        r16.f = r11.contains(r6.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x019f, code lost:
    
        if ("p".equals(r3) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a1, code lost:
    
        k7.s.a(r17, '\n');
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a4, code lost:
    
        r16.d = r6.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0160, code lost:
    
        r4 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0166, code lost:
    
        if ("pre".equals(r3) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0168, code lost:
    
        r16.e = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016a, code lost:
    
        r12 = (java.lang.CharSequence) r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0171, code lost:
    
        if (r4 != r12.length()) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0173, code lost:
    
        r8.getClass();
        r8 = h7.u.L2(r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [n3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Appendable appendable, String str) {
        pc.d dVar;
        b bVar;
        int length;
        k kVar = new k(new pc.a(str), new pc.b(0));
        while (true) {
            if (kVar.e) {
                StringBuilder sb = kVar.g;
                int length2 = sb.length();
                pc.d dVar2 = kVar.l;
                if (length2 > 0) {
                    String sb2 = sb.toString();
                    sb.delete(0, sb.length());
                    kVar.f = null;
                    dVar2.c = sb2;
                    dVar = dVar2;
                } else {
                    String str2 = kVar.f;
                    if (str2 != null) {
                        dVar2.c = str2;
                        kVar.f = null;
                        dVar = dVar2;
                    } else {
                        kVar.e = false;
                        dVar = kVar.d;
                    }
                }
                int i10 = dVar.b;
                if (6 == i10) {
                    return;
                }
                int c3 = j.c(i10);
                u uVar = this.a;
                Set set = i;
                ArrayList arrayList = this.c;
                Set set2 = g;
                if (c3 == 1) {
                    i iVar = (i) dVar;
                    boolean contains = set2.contains(iVar.d);
                    Set set3 = h;
                    if (contains) {
                        String str3 = iVar.d;
                        CharSequence charSequence = (CharSequence) appendable;
                        b bVar2 = new b(charSequence.length(), str3, a(iVar));
                        if (this.f) {
                            int length3 = charSequence.length();
                            if (length3 > 0 && '\n' != charSequence.charAt(length3 - 1)) {
                                s.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        if (set3.contains(str3) || iVar.s) {
                            uVar.getClass();
                            String L2 = u.L2(bVar2);
                            if (L2 != null && L2.length() > 0) {
                                try {
                                    appendable.append(L2);
                                } catch (IOException e6) {
                                    throw new RuntimeException(e6);
                                }
                            }
                            int length4 = charSequence.length();
                            if (bVar2.d <= -1) {
                                bVar2.d = length4;
                            }
                        }
                        arrayList.add(bVar2);
                    } else {
                        String str4 = iVar.d;
                        if ("p".equals(this.d.a)) {
                            this.d.b(((CharSequence) appendable).length());
                            s.a(appendable, '\n');
                            this.d = this.d.e;
                        } else if ("li".equals(str4) && "li".equals(this.d.a)) {
                            this.d.b(((CharSequence) appendable).length());
                            this.d = this.d.e;
                        }
                        if (set.contains(str4)) {
                            this.e = "pre".equals(str4);
                            CharSequence charSequence2 = (CharSequence) appendable;
                            int length5 = charSequence2.length();
                            if (length5 > 0 && '\n' != charSequence2.charAt(length5 - 1)) {
                                s.a(appendable, '\n');
                            }
                        } else if (this.f) {
                            CharSequence charSequence3 = (CharSequence) appendable;
                            int length6 = charSequence3.length();
                            if (length6 > 0 && '\n' != charSequence3.charAt(length6 - 1)) {
                                s.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        CharSequence charSequence4 = (CharSequence) appendable;
                        int length7 = charSequence4.length();
                        Map a2 = a(iVar);
                        a aVar = this.d;
                        a aVar2 = new a(str4, length7, a2, aVar);
                        boolean z4 = set3.contains(str4) || iVar.s;
                        if (z4) {
                            uVar.getClass();
                            String L22 = u.L2(aVar2);
                            if (L22 != null && L22.length() > 0) {
                                try {
                                    appendable.append(L22);
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10);
                                }
                            }
                            aVar2.b(charSequence4.length());
                        }
                        ArrayList arrayList2 = aVar.f;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(2);
                            aVar.f = arrayList2;
                        }
                        arrayList2.add(aVar2);
                        if (!z4) {
                            this.d = aVar2;
                        }
                    }
                } else if (c3 == 2) {
                    h hVar = (h) dVar;
                    if (set2.contains(hVar.d)) {
                        String str5 = hVar.d;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size <= -1) {
                                bVar = null;
                                break;
                            }
                            bVar = (b) arrayList.get(size);
                            if (str5.equals(bVar.a) && bVar.d < 0) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        if (bVar != null) {
                            CharSequence charSequence5 = (CharSequence) appendable;
                            if (bVar.b == charSequence5.length()) {
                                uVar.getClass();
                                String L23 = u.L2(bVar);
                                if (L23 != null) {
                                    try {
                                        appendable.append(L23);
                                    } catch (IOException e11) {
                                        throw new RuntimeException(e11);
                                    }
                                }
                            }
                            int length8 = charSequence5.length();
                            if (bVar.d <= -1) {
                                bVar.d = length8;
                            }
                        }
                    } else {
                        String str6 = hVar.d;
                        a aVar3 = this.d;
                        while (aVar3 != null && !str6.equals(aVar3.a) && aVar3.d <= -1) {
                            aVar3 = aVar3.e;
                        }
                    }
                } else if (c3 == 4) {
                    pc.d dVar3 = dVar;
                    if (this.e) {
                        try {
                            appendable.append(dVar3.c);
                        } catch (IOException e12) {
                            throw new RuntimeException(e12);
                        }
                    } else {
                        if (this.f) {
                            CharSequence charSequence6 = (CharSequence) appendable;
                            int length9 = charSequence6.length();
                            if (length9 > 0 && '\n' != charSequence6.charAt(length9 - 1)) {
                                s.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        String str7 = dVar3.c;
                        this.b.getClass();
                        CharSequence charSequence7 = (CharSequence) appendable;
                        int length10 = charSequence7.length();
                        int length11 = str7.length();
                        boolean z10 = false;
                        for (int i11 = 0; i11 < length11; i11++) {
                            char charAt = str7.charAt(i11);
                            if (Character.isWhitespace(charAt)) {
                                z10 = true;
                            } else {
                                if (z10 && (length = charSequence7.length()) > 0 && !Character.isWhitespace(charSequence7.charAt(length - 1))) {
                                    s.a(appendable, ' ');
                                }
                                s.a(appendable, charAt);
                                z10 = false;
                            }
                        }
                        if (z10 && length10 < charSequence7.length()) {
                            s.a(appendable, ' ');
                        }
                    }
                }
                dVar.g();
            } else {
                kVar.c.d(kVar, kVar.a);
            }
        }
    }
}
