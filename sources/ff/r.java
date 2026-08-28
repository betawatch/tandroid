package ff;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.wz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class r {
    public static void a(vz0 vz0Var, StringBuilder sb2) {
        if (vz0Var == null) {
            return;
        }
        if ((vz0Var.a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((vz0Var.a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((vz0Var.a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((vz0Var.a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((vz0Var.a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((vz0Var.a & 128) <= 0 || vz0Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(vz0Var.d.url);
        sb2.append("\">");
    }

    public static void b(vz0 vz0Var, StringBuilder sb2) {
        if (vz0Var == null) {
            return;
        }
        if ((vz0Var.a & 128) > 0 && vz0Var.d != null) {
            sb2.append("</a>");
        }
        if ((vz0Var.a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((vz0Var.a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((vz0Var.a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((vz0Var.a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((vz0Var.a & 768) > 0) {
            sb2.append("</spoiler>");
        }
    }

    public static String c(Spanned spanned) {
        int i9;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i13 = 0;
        while (i13 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i13, length, fi0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            fi0[] fi0VarArr = (fi0[]) spanned.getSpans(i13, nextSpanTransition, fi0.class);
            if (fi0VarArr != null) {
                for (fi0 fi0Var : fi0VarArr) {
                    sb2.append(fi0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i13 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i13, nextSpanTransition, wz0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                wz0[] wz0VarArr = (wz0[]) spanned.getSpans(i13, nextSpanTransition2, wz0.class);
                String str3 = "<pre>";
                if (wz0VarArr != null) {
                    for (wz0 wz0Var : wz0VarArr) {
                        if (wz0Var != null) {
                            a(wz0Var.b, sb2);
                        }
                    }
                }
                while (i13 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i13, nextSpanTransition2, r41.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    r41[] r41VarArr = (r41[]) spanned.getSpans(i13, nextSpanTransition3, r41.class);
                    String str4 = "\">";
                    if (r41VarArr != null) {
                        for (r41 r41Var : r41VarArr) {
                            a(r41Var.a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(r41Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i13 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i13, nextSpanTransition3, o41.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        o41[] o41VarArr = (o41[]) spanned.getSpans(i13, nextSpanTransition4, o41.class);
                        if (o41VarArr != null) {
                            for (o41 o41Var : o41VarArr) {
                                if (o41Var != null) {
                                    sb2.append(str3);
                                }
                            }
                        }
                        while (i13 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i13, nextSpanTransition4, CodeHighlighting.Span.class);
                            int i14 = length;
                            int i15 = nextSpanTransition5 < 0 ? nextSpanTransition4 : nextSpanTransition5;
                            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(i13, i15, CodeHighlighting.Span.class);
                            int i16 = i13;
                            int i17 = nextSpanTransition;
                            if (spanArr != null) {
                                int i18 = 0;
                                while (i18 < spanArr.length) {
                                    CodeHighlighting.Span span = spanArr[i18];
                                    int i19 = i18;
                                    if (span != null) {
                                        if (TextUtils.isEmpty(span.lng)) {
                                            sb2.append(str3);
                                        } else {
                                            sb2.append("<pre lang=\"");
                                            sb2.append(span.lng);
                                            sb2.append(str4);
                                        }
                                    }
                                    i18 = i19 + 1;
                                }
                            }
                            int i20 = i16;
                            while (i20 < i15) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i20, i15, t5.class);
                                int i21 = i15;
                                if (nextSpanTransition6 >= 0) {
                                    i15 = nextSpanTransition6;
                                }
                                t5[] t5VarArr = (t5[]) spanned.getSpans(i20, i15, t5.class);
                                int i22 = i20;
                                int i23 = nextSpanTransition2;
                                if (t5VarArr != null) {
                                    int i24 = 0;
                                    while (i24 < t5VarArr.length) {
                                        t5 t5Var = t5VarArr[i24];
                                        int i25 = i24;
                                        if (t5Var == null || t5Var.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb2.append("<animated-emoji data-document-id=\"" + t5Var.documentId + str4);
                                        }
                                        i24 = i25 + 1;
                                        str3 = str2;
                                    }
                                }
                                String str5 = str3;
                                int i26 = i22;
                                while (i26 < i15) {
                                    char charAt = spanned.charAt(i26);
                                    if (charAt == '\n') {
                                        sb2.append("<br>");
                                    } else if (charAt == '<') {
                                        sb2.append("&lt;");
                                    } else if (charAt == '>') {
                                        sb2.append("&gt;");
                                    } else if (charAt == '&') {
                                        sb2.append("&amp;");
                                    } else {
                                        i9 = i26;
                                        i10 = nextSpanTransition3;
                                        if (charAt < 55296 || charAt > 57343) {
                                            str = str4;
                                            if (charAt > '~' || charAt < ' ') {
                                                sb2.append("&#");
                                                sb2.append((int) charAt);
                                                sb2.append(";");
                                            } else if (charAt == ' ') {
                                                i11 = i9;
                                                while (true) {
                                                    int i27 = i11 + 1;
                                                    if (i27 >= i15 || spanned.charAt(i27) != ' ') {
                                                        break;
                                                    }
                                                    sb2.append("&nbsp;");
                                                    i11 = i27;
                                                }
                                                sb2.append(' ');
                                                i26 = i11 + 1;
                                                nextSpanTransition3 = i10;
                                                str4 = str;
                                            } else {
                                                sb2.append(charAt);
                                            }
                                            i11 = i9;
                                            i26 = i11 + 1;
                                            nextSpanTransition3 = i10;
                                            str4 = str;
                                        } else {
                                            if (charAt < 56320 && (i12 = i9 + 1) < i15) {
                                                str = str4;
                                                char charAt2 = spanned.charAt(i12);
                                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                                    int i28 = ((charAt - CharacterCompat.MIN_HIGH_SURROGATE) << 10) | 65536 | (charAt2 - CharacterCompat.MIN_LOW_SURROGATE);
                                                    sb2.append("&#");
                                                    sb2.append(i28);
                                                    sb2.append(";");
                                                    i11 = i12;
                                                    i26 = i11 + 1;
                                                    nextSpanTransition3 = i10;
                                                    str4 = str;
                                                }
                                                i11 = i9;
                                                i26 = i11 + 1;
                                                nextSpanTransition3 = i10;
                                                str4 = str;
                                            }
                                            str = str4;
                                            i11 = i9;
                                            i26 = i11 + 1;
                                            nextSpanTransition3 = i10;
                                            str4 = str;
                                        }
                                    }
                                    i9 = i26;
                                    i10 = nextSpanTransition3;
                                    str = str4;
                                    i11 = i9;
                                    i26 = i11 + 1;
                                    nextSpanTransition3 = i10;
                                    str4 = str;
                                }
                                int i29 = nextSpanTransition3;
                                String str6 = str4;
                                if (t5VarArr != null) {
                                    for (t5 t5Var2 : t5VarArr) {
                                        if (t5Var2 != null && !t5Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i20 = i15;
                                i15 = i21;
                                nextSpanTransition2 = i23;
                                str3 = str5;
                                nextSpanTransition3 = i29;
                                str4 = str6;
                            }
                            int i30 = i15;
                            int i31 = nextSpanTransition2;
                            String str7 = str3;
                            int i32 = nextSpanTransition3;
                            String str8 = str4;
                            if (spanArr != null) {
                                for (CodeHighlighting.Span span2 : spanArr) {
                                    if (span2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i14;
                            nextSpanTransition = i17;
                            i13 = i30;
                            nextSpanTransition2 = i31;
                            str3 = str7;
                            nextSpanTransition3 = i32;
                            str4 = str8;
                        }
                        int i33 = length;
                        int i34 = nextSpanTransition;
                        int i35 = nextSpanTransition2;
                        String str9 = str3;
                        int i36 = nextSpanTransition3;
                        String str10 = str4;
                        if (o41VarArr != null) {
                            for (o41 o41Var2 : o41VarArr) {
                                if (o41Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i13 = nextSpanTransition4;
                        length = i33;
                        nextSpanTransition = i34;
                        nextSpanTransition2 = i35;
                        str3 = str9;
                        nextSpanTransition3 = i36;
                        str4 = str10;
                    }
                    int i37 = length;
                    int i38 = nextSpanTransition;
                    int i39 = nextSpanTransition2;
                    String str11 = str3;
                    int i40 = nextSpanTransition3;
                    if (r41VarArr != null) {
                        for (r41 r41Var2 : r41VarArr) {
                            sb2.append("</a>");
                            b(r41Var2.a, sb2);
                        }
                    }
                    length = i37;
                    nextSpanTransition = i38;
                    nextSpanTransition2 = i39;
                    str3 = str11;
                    i13 = i40;
                }
                int i41 = length;
                int i42 = nextSpanTransition;
                int i43 = nextSpanTransition2;
                if (wz0VarArr != null) {
                    for (wz0 wz0Var2 : wz0VarArr) {
                        if (wz0Var2 != null) {
                            b(wz0Var2.b, sb2);
                        }
                    }
                }
                length = i41;
                nextSpanTransition = i42;
                i13 = i43;
            }
            int i44 = length;
            int i45 = nextSpanTransition;
            if (fi0VarArr != null) {
                for (int length2 = fi0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i44;
            i13 = i45;
        }
        return sb2.toString();
    }
}
