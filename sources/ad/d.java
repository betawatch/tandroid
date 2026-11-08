package ad;

import a8.d1;
import a8.g1;
import dd.h;
import dd.i;
import dd.l;
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
import p1.g;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d extends g1 {
    public static final Set g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", MediaStreamTrack.VIDEO_TRACK_KIND)));
    public final nb.a a;
    public final pb.b b;
    public final ArrayList c = new ArrayList(0);
    public a d = new a("", 0, Collections.EMPTY_MAP, null);
    public boolean e;
    public boolean f;

    public d(nb.a aVar, pb.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public static Map a(i iVar) {
        cd.c cVar = iVar.k;
        int i7 = cVar.a;
        if (i7 <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(i7);
        int i10 = 0;
        while (true) {
            if (!(i10 < cVar.a)) {
                return DesugarCollections.unmodifiableMap(hashMap);
            }
            String str = cVar.c[i10];
            String str2 = cVar.b[i10];
            if (str == null) {
                str = "";
            }
            cd.a aVar = new cd.a();
            if (str2 == null) {
                throw new IllegalArgumentException("Object must not be null");
            }
            aVar.a = str2.trim();
            if (str2.length() == 0) {
                throw new IllegalArgumentException("String must not be empty");
            }
            aVar.b = str;
            aVar.c = cVar;
            i10++;
            hashMap.put(aVar.a.toLowerCase(Locale.US), aVar.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0178, code lost:
    
        if (r8 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017a, code lost:
    
        r17.append(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x017e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0184, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0185, code lost:
    
        r6.b(r12.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018e, code lost:
    
        if (r4 != r6.d) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0191, code lost:
    
        r16.f = r11.contains(r6.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x019d, code lost:
    
        if ("p".equals(r3) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019f, code lost:
    
        a8.d1.a(r17, '\n');
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a2, code lost:
    
        r16.d = r6.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        r4 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0164, code lost:
    
        if ("pre".equals(r3) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0166, code lost:
    
        r16.e = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0168, code lost:
    
        r12 = (java.lang.CharSequence) r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016f, code lost:
    
        if (r4 != r12.length()) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0171, code lost:
    
        r8.getClass();
        r8 = nb.a.l0(r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [dd.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Appendable appendable, String str) {
        dd.d dVar;
        b bVar;
        int length;
        l lVar = new l(new dd.a(str), new dd.b(0));
        while (true) {
            if (lVar.e) {
                StringBuilder sb2 = lVar.g;
                int length2 = sb2.length();
                dd.d dVar2 = lVar.l;
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
                int i7 = dVar.b;
                if (6 == i7) {
                    return;
                }
                int c10 = g.c(i7);
                nb.a aVar = this.a;
                Set set = i;
                ArrayList arrayList = this.c;
                Set set2 = g;
                if (c10 == 1) {
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
                                d1.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        if (set3.contains(str3) || iVar.j) {
                            aVar.getClass();
                            String l02 = nb.a.l0(bVar2);
                            if (l02 != null && l02.length() > 0) {
                                try {
                                    appendable.append(l02);
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
                            d1.a(appendable, '\n');
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
                                d1.a(appendable, '\n');
                            }
                        } else if (this.f) {
                            CharSequence charSequence3 = (CharSequence) appendable;
                            int length6 = charSequence3.length();
                            if (length6 > 0 && '\n' != charSequence3.charAt(length6 - 1)) {
                                d1.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        CharSequence charSequence4 = (CharSequence) appendable;
                        int length7 = charSequence4.length();
                        Map a10 = a(iVar);
                        a aVar2 = this.d;
                        a aVar3 = new a(str4, length7, a10, aVar2);
                        boolean z9 = set3.contains(str4) || iVar.j;
                        if (z9) {
                            aVar.getClass();
                            String l03 = nb.a.l0(aVar3);
                            if (l03 != null && l03.length() > 0) {
                                try {
                                    appendable.append(l03);
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
                        if (!z9) {
                            this.d = aVar3;
                        }
                    }
                } else if (c10 == 2) {
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
                                aVar.getClass();
                                String l04 = nb.a.l0(bVar);
                                if (l04 != null) {
                                    try {
                                        appendable.append(l04);
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
                } else if (c10 == 4) {
                    dd.d dVar3 = dVar;
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
                                d1.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        String str7 = dVar3.c;
                        this.b.getClass();
                        CharSequence charSequence7 = (CharSequence) appendable;
                        int length10 = charSequence7.length();
                        int length11 = str7.length();
                        boolean z10 = false;
                        for (int i10 = 0; i10 < length11; i10++) {
                            char charAt = str7.charAt(i10);
                            if (Character.isWhitespace(charAt)) {
                                z10 = true;
                            } else {
                                if (z10 && (length = charSequence7.length()) > 0 && !Character.isWhitespace(charSequence7.charAt(length - 1))) {
                                    d1.a(appendable, ' ');
                                }
                                d1.a(appendable, charAt);
                                z10 = false;
                            }
                        }
                        if (z10 && length10 < charSequence7.length()) {
                            d1.a(appendable, ' ');
                        }
                    }
                }
                dVar.b();
            } else {
                lVar.c.d(lVar, lVar.a);
            }
        }
    }
}
