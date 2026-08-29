package jf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class q {
    public static void a(h01 h01Var, StringBuilder sb2) {
        if (h01Var == null) {
            return;
        }
        if ((h01Var.a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((h01Var.a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((h01Var.a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((h01Var.a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((h01Var.a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((h01Var.a & 128) <= 0 || h01Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(h01Var.d.url);
        sb2.append("\">");
    }

    public static void b(h01 h01Var, StringBuilder sb2) {
        if (h01Var == null) {
            return;
        }
        if ((h01Var.a & 128) > 0 && h01Var.d != null) {
            sb2.append("</a>");
        }
        if ((h01Var.a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((h01Var.a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((h01Var.a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((h01Var.a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((h01Var.a & 768) > 0) {
            sb2.append("</spoiler>");
        }
    }

    public static String c(Spanned spanned) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i14 = 0;
        while (i14 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i14, length, qi0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            qi0[] qi0VarArr = (qi0[]) spanned.getSpans(i14, nextSpanTransition, qi0.class);
            if (qi0VarArr != null) {
                for (qi0 qi0Var : qi0VarArr) {
                    sb2.append(qi0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i14 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i14, nextSpanTransition, i01.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                i01[] i01VarArr = (i01[]) spanned.getSpans(i14, nextSpanTransition2, i01.class);
                String str3 = "<pre>";
                if (i01VarArr != null) {
                    for (i01 i01Var : i01VarArr) {
                        if (i01Var != null) {
                            a(i01Var.b, sb2);
                        }
                    }
                }
                while (i14 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i14, nextSpanTransition2, c51.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    c51[] c51VarArr = (c51[]) spanned.getSpans(i14, nextSpanTransition3, c51.class);
                    String str4 = "\">";
                    if (c51VarArr != null) {
                        for (c51 c51Var : c51VarArr) {
                            a(c51Var.a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(c51Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i14 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i14, nextSpanTransition3, z41.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        z41[] z41VarArr = (z41[]) spanned.getSpans(i14, nextSpanTransition4, z41.class);
                        if (z41VarArr != null) {
                            for (z41 z41Var : z41VarArr) {
                                if (z41Var != null) {
                                    sb2.append(str3);
                                }
                            }
                        }
                        while (i14 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i14, nextSpanTransition4, CodeHighlighting.Span.class);
                            int i15 = length;
                            int i16 = nextSpanTransition5 < 0 ? nextSpanTransition4 : nextSpanTransition5;
                            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(i14, i16, CodeHighlighting.Span.class);
                            int i17 = i14;
                            int i18 = nextSpanTransition;
                            if (spanArr != null) {
                                int i19 = 0;
                                while (i19 < spanArr.length) {
                                    CodeHighlighting.Span span = spanArr[i19];
                                    int i20 = i19;
                                    if (span != null) {
                                        if (TextUtils.isEmpty(span.lng)) {
                                            sb2.append(str3);
                                        } else {
                                            sb2.append("<pre lang=\"");
                                            sb2.append(span.lng);
                                            sb2.append(str4);
                                        }
                                    }
                                    i19 = i20 + 1;
                                }
                            }
                            int i21 = i17;
                            while (i21 < i16) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i16, y5.class);
                                int i22 = i16;
                                if (nextSpanTransition6 >= 0) {
                                    i16 = nextSpanTransition6;
                                }
                                y5[] y5VarArr = (y5[]) spanned.getSpans(i21, i16, y5.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (y5VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < y5VarArr.length) {
                                        y5 y5Var = y5VarArr[i25];
                                        int i26 = i25;
                                        if (y5Var == null || y5Var.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb2.append("<animated-emoji data-document-id=\"" + y5Var.documentId + str4);
                                        }
                                        i25 = i26 + 1;
                                        str3 = str2;
                                    }
                                }
                                String str5 = str3;
                                int i27 = i23;
                                while (i27 < i16) {
                                    char charAt = spanned.charAt(i27);
                                    if (charAt == '\n') {
                                        sb2.append("<br>");
                                    } else if (charAt == '<') {
                                        sb2.append("&lt;");
                                    } else if (charAt == '>') {
                                        sb2.append("&gt;");
                                    } else if (charAt == '&') {
                                        sb2.append("&amp;");
                                    } else {
                                        i10 = i27;
                                        i11 = nextSpanTransition3;
                                        if (charAt < 55296 || charAt > 57343) {
                                            str = str4;
                                            if (charAt > '~' || charAt < ' ') {
                                                sb2.append("&#");
                                                sb2.append((int) charAt);
                                                sb2.append(";");
                                            } else if (charAt == ' ') {
                                                i12 = i10;
                                                while (true) {
                                                    int i28 = i12 + 1;
                                                    if (i28 >= i16 || spanned.charAt(i28) != ' ') {
                                                        break;
                                                    }
                                                    sb2.append("&nbsp;");
                                                    i12 = i28;
                                                }
                                                sb2.append(' ');
                                                i27 = i12 + 1;
                                                nextSpanTransition3 = i11;
                                                str4 = str;
                                            } else {
                                                sb2.append(charAt);
                                            }
                                            i12 = i10;
                                            i27 = i12 + 1;
                                            nextSpanTransition3 = i11;
                                            str4 = str;
                                        } else {
                                            if (charAt < 56320 && (i13 = i10 + 1) < i16) {
                                                str = str4;
                                                char charAt2 = spanned.charAt(i13);
                                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                                    int i29 = ((charAt - CharacterCompat.MIN_HIGH_SURROGATE) << 10) | 65536 | (charAt2 - CharacterCompat.MIN_LOW_SURROGATE);
                                                    sb2.append("&#");
                                                    sb2.append(i29);
                                                    sb2.append(";");
                                                    i12 = i13;
                                                    i27 = i12 + 1;
                                                    nextSpanTransition3 = i11;
                                                    str4 = str;
                                                }
                                                i12 = i10;
                                                i27 = i12 + 1;
                                                nextSpanTransition3 = i11;
                                                str4 = str;
                                            }
                                            str = str4;
                                            i12 = i10;
                                            i27 = i12 + 1;
                                            nextSpanTransition3 = i11;
                                            str4 = str;
                                        }
                                    }
                                    i10 = i27;
                                    i11 = nextSpanTransition3;
                                    str = str4;
                                    i12 = i10;
                                    i27 = i12 + 1;
                                    nextSpanTransition3 = i11;
                                    str4 = str;
                                }
                                int i30 = nextSpanTransition3;
                                String str6 = str4;
                                if (y5VarArr != null) {
                                    for (y5 y5Var2 : y5VarArr) {
                                        if (y5Var2 != null && !y5Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i21 = i16;
                                i16 = i22;
                                nextSpanTransition2 = i24;
                                str3 = str5;
                                nextSpanTransition3 = i30;
                                str4 = str6;
                            }
                            int i31 = i16;
                            int i32 = nextSpanTransition2;
                            String str7 = str3;
                            int i33 = nextSpanTransition3;
                            String str8 = str4;
                            if (spanArr != null) {
                                for (CodeHighlighting.Span span2 : spanArr) {
                                    if (span2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i15;
                            nextSpanTransition = i18;
                            i14 = i31;
                            nextSpanTransition2 = i32;
                            str3 = str7;
                            nextSpanTransition3 = i33;
                            str4 = str8;
                        }
                        int i34 = length;
                        int i35 = nextSpanTransition;
                        int i36 = nextSpanTransition2;
                        String str9 = str3;
                        int i37 = nextSpanTransition3;
                        String str10 = str4;
                        if (z41VarArr != null) {
                            for (z41 z41Var2 : z41VarArr) {
                                if (z41Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i14 = nextSpanTransition4;
                        length = i34;
                        nextSpanTransition = i35;
                        nextSpanTransition2 = i36;
                        str3 = str9;
                        nextSpanTransition3 = i37;
                        str4 = str10;
                    }
                    int i38 = length;
                    int i39 = nextSpanTransition;
                    int i40 = nextSpanTransition2;
                    String str11 = str3;
                    int i41 = nextSpanTransition3;
                    if (c51VarArr != null) {
                        for (c51 c51Var2 : c51VarArr) {
                            sb2.append("</a>");
                            b(c51Var2.a, sb2);
                        }
                    }
                    length = i38;
                    nextSpanTransition = i39;
                    nextSpanTransition2 = i40;
                    str3 = str11;
                    i14 = i41;
                }
                int i42 = length;
                int i43 = nextSpanTransition;
                int i44 = nextSpanTransition2;
                if (i01VarArr != null) {
                    for (i01 i01Var2 : i01VarArr) {
                        if (i01Var2 != null) {
                            b(i01Var2.b, sb2);
                        }
                    }
                }
                length = i42;
                nextSpanTransition = i43;
                i14 = i44;
            }
            int i45 = length;
            int i46 = nextSpanTransition;
            if (qi0VarArr != null) {
                for (int length2 = qi0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i45;
            i14 = i46;
        }
        return sb2.toString();
    }
}
