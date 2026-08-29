package kc;

import f7.v;
import i7.h;
import i7.i;
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
import m1.j;
import nc.l;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends i {
    public static final Set g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", MediaStreamTrack.VIDEO_TRACK_KIND)));
    public final bb.a a;
    public final v b;
    public final ArrayList c = new ArrayList(0);
    public a d = new a("", 0, Collections.EMPTY_MAP, null);
    public boolean e;
    public boolean f;

    public d(bb.a aVar, v vVar) {
        this.a = aVar;
        this.b = vVar;
    }

    public static Map a(nc.i iVar) {
        mc.b bVar = iVar.k;
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
            mc.a aVar = new mc.a();
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
    
        i7.h.a(r17, '\n');
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
        r8 = bb.a.B3(r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [nc.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Appendable appendable, String str) {
        nc.d dVar;
        b bVar;
        int length;
        l lVar = new l(new nc.a(str), new nc.b(0));
        while (true) {
            if (lVar.e) {
                StringBuilder sb2 = lVar.g;
                int length2 = sb2.length();
                nc.d dVar2 = lVar.l;
                if (length2 > 0) {
                    String sb3 = sb2.toString();
                    sb2.delete(0, sb2.length());
                    lVar.f = null;
                    dVar2.c = sb3;
                    dVar = dVar2;
                } else {
                    String str2 = lVar.f;
                    if (str2 != null) {
                        dVar2.c = str2;
                        lVar.f = null;
                        dVar = dVar2;
                    } else {
                        lVar.e = false;
                        dVar = lVar.d;
                    }
                }
                int i10 = dVar.b;
                if (6 == i10) {
                    return;
                }
                int b10 = j.b(i10);
                bb.a aVar = this.a;
                Set set = i;
                ArrayList arrayList = this.c;
                Set set2 = g;
                if (b10 == 1) {
                    nc.i iVar = (nc.i) dVar;
                    boolean contains = set2.contains(iVar.d);
                    Set set3 = h;
                    if (contains) {
                        String str3 = iVar.d;
                        CharSequence charSequence = (CharSequence) appendable;
                        b bVar2 = new b(charSequence.length(), str3, a(iVar));
                        if (this.f) {
                            int length3 = charSequence.length();
                            if (length3 > 0 && '\n' != charSequence.charAt(length3 - 1)) {
                                h.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        if (set3.contains(str3) || iVar.j) {
                            aVar.getClass();
                            String B3 = bb.a.B3(bVar2);
                            if (B3 != null && B3.length() > 0) {
                                try {
                                    appendable.append(B3);
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10);
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
                            h.a(appendable, '\n');
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
                                h.a(appendable, '\n');
                            }
                        } else if (this.f) {
                            CharSequence charSequence3 = (CharSequence) appendable;
                            int length6 = charSequence3.length();
                            if (length6 > 0 && '\n' != charSequence3.charAt(length6 - 1)) {
                                h.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        CharSequence charSequence4 = (CharSequence) appendable;
                        int length7 = charSequence4.length();
                        Map a2 = a(iVar);
                        a aVar2 = this.d;
                        a aVar3 = new a(str4, length7, a2, aVar2);
                        boolean z10 = set3.contains(str4) || iVar.j;
                        if (z10) {
                            aVar.getClass();
                            String B32 = bb.a.B3(aVar3);
                            if (B32 != null && B32.length() > 0) {
                                try {
                                    appendable.append(B32);
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            }
                            aVar3.b(charSequence4.length());
                        }
                        ArrayList arrayList2 = aVar2.f;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(2);
                            aVar2.f = arrayList2;
                        }
                        arrayList2.add(aVar3);
                        if (!z10) {
                            this.d = aVar3;
                        }
                    }
                } else if (b10 == 2) {
                    nc.h hVar = (nc.h) dVar;
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
                                aVar.getClass();
                                String B33 = bb.a.B3(bVar);
                                if (B33 != null) {
                                    try {
                                        appendable.append(B33);
                                    } catch (IOException e12) {
                                        throw new RuntimeException(e12);
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
                        a aVar4 = this.d;
                        while (aVar4 != null && !str6.equals(aVar4.a) && aVar4.d <= -1) {
                            aVar4 = aVar4.e;
                        }
                    }
                } else if (b10 == 4) {
                    nc.d dVar3 = dVar;
                    if (this.e) {
                        try {
                            appendable.append(dVar3.c);
                        } catch (IOException e13) {
                            throw new RuntimeException(e13);
                        }
                    } else {
                        if (this.f) {
                            CharSequence charSequence6 = (CharSequence) appendable;
                            int length9 = charSequence6.length();
                            if (length9 > 0 && '\n' != charSequence6.charAt(length9 - 1)) {
                                h.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        String str7 = dVar3.c;
                        this.b.getClass();
                        CharSequence charSequence7 = (CharSequence) appendable;
                        int length10 = charSequence7.length();
                        int length11 = str7.length();
                        boolean z11 = false;
                        for (int i11 = 0; i11 < length11; i11++) {
                            char charAt = str7.charAt(i11);
                            if (Character.isWhitespace(charAt)) {
                                z11 = true;
                            } else {
                                if (z11 && (length = charSequence7.length()) > 0 && !Character.isWhitespace(charSequence7.charAt(length - 1))) {
                                    h.a(appendable, ' ');
                                }
                                h.a(appendable, charAt);
                                z11 = false;
                            }
                        }
                        if (z11 && length10 < charSequence7.length()) {
                            h.a(appendable, ' ');
                        }
                    }
                }
                dVar.c();
            } else {
                lVar.c.d(lVar, lVar.a);
            }
        }
    }
}
