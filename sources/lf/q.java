package lf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.zi0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class q {
    public static void a(s01 s01Var, StringBuilder sb) {
        if (s01Var == null) {
            return;
        }
        if ((s01Var.a & 768) > 0) {
            sb.append("<spoiler>");
        }
        if ((s01Var.a & 1) > 0) {
            sb.append("<b>");
        }
        if ((s01Var.a & 2) > 0) {
            sb.append("<i>");
        }
        if ((s01Var.a & 16) > 0) {
            sb.append("<u>");
        }
        if ((s01Var.a & 8) > 0) {
            sb.append("<s>");
        }
        if ((s01Var.a & 128) <= 0 || s01Var.d == null) {
            return;
        }
        sb.append("<a href=\"");
        sb.append(s01Var.d.url);
        sb.append("\">");
    }

    public static void b(s01 s01Var, StringBuilder sb) {
        if (s01Var == null) {
            return;
        }
        if ((s01Var.a & 128) > 0 && s01Var.d != null) {
            sb.append("</a>");
        }
        if ((s01Var.a & 8) > 0) {
            sb.append("</s>");
        }
        if ((s01Var.a & 16) > 0) {
            sb.append("</u>");
        }
        if ((s01Var.a & 2) > 0) {
            sb.append("</i>");
        }
        if ((s01Var.a & 1) > 0) {
            sb.append("</b>");
        }
        if ((s01Var.a & 768) > 0) {
            sb.append("</spoiler>");
        }
    }

    public static String c(Spanned spanned) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        String str2;
        StringBuilder sb = new StringBuilder();
        int length = spanned.length();
        int i14 = 0;
        while (i14 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i14, length, zi0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            zi0[] zi0VarArr = (zi0[]) spanned.getSpans(i14, nextSpanTransition, zi0.class);
            if (zi0VarArr != null) {
                for (zi0 zi0Var : zi0VarArr) {
                    sb.append(zi0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i14 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i14, nextSpanTransition, t01.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                t01[] t01VarArr = (t01[]) spanned.getSpans(i14, nextSpanTransition2, t01.class);
                String str3 = "<pre>";
                if (t01VarArr != null) {
                    for (t01 t01Var : t01VarArr) {
                        if (t01Var != null) {
                            a(t01Var.b, sb);
                        }
                    }
                }
                while (i14 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i14, nextSpanTransition2, o51.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    o51[] o51VarArr = (o51[]) spanned.getSpans(i14, nextSpanTransition3, o51.class);
                    String str4 = "\">";
                    if (o51VarArr != null) {
                        for (o51 o51Var : o51VarArr) {
                            a(o51Var.a, sb);
                            sb.append("<a href=\"");
                            sb.append(o51Var.getURL());
                            sb.append("\">");
                        }
                    }
                    while (i14 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i14, nextSpanTransition3, l51.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        l51[] l51VarArr = (l51[]) spanned.getSpans(i14, nextSpanTransition4, l51.class);
                        if (l51VarArr != null) {
                            for (l51 l51Var : l51VarArr) {
                                if (l51Var != null) {
                                    sb.append(str3);
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
                                            sb.append(str3);
                                        } else {
                                            sb.append("<pre lang=\"");
                                            sb.append(span.lng);
                                            sb.append(str4);
                                        }
                                    }
                                    i19 = i20 + 1;
                                }
                            }
                            int i21 = i17;
                            while (i21 < i16) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i16, u5.class);
                                int i22 = i16;
                                if (nextSpanTransition6 >= 0) {
                                    i16 = nextSpanTransition6;
                                }
                                u5[] u5VarArr = (u5[]) spanned.getSpans(i21, i16, u5.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (u5VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < u5VarArr.length) {
                                        u5 u5Var = u5VarArr[i25];
                                        int i26 = i25;
                                        if (u5Var == null || u5Var.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb.append("<animated-emoji data-document-id=\"" + u5Var.documentId + str4);
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
                                        sb.append("<br>");
                                    } else if (charAt == '<') {
                                        sb.append("&lt;");
                                    } else if (charAt == '>') {
                                        sb.append("&gt;");
                                    } else if (charAt == '&') {
                                        sb.append("&amp;");
                                    } else {
                                        i10 = i27;
                                        i11 = nextSpanTransition3;
                                        if (charAt < 55296 || charAt > 57343) {
                                            str = str4;
                                            if (charAt > '~' || charAt < ' ') {
                                                sb.append("&#");
                                                sb.append((int) charAt);
                                                sb.append(";");
                                            } else if (charAt == ' ') {
                                                i12 = i10;
                                                while (true) {
                                                    int i28 = i12 + 1;
                                                    if (i28 >= i16 || spanned.charAt(i28) != ' ') {
                                                        break;
                                                    }
                                                    sb.append("&nbsp;");
                                                    i12 = i28;
                                                }
                                                sb.append(' ');
                                                i27 = i12 + 1;
                                                nextSpanTransition3 = i11;
                                                str4 = str;
                                            } else {
                                                sb.append(charAt);
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
                                                    sb.append("&#");
                                                    sb.append(i29);
                                                    sb.append(";");
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
                                if (u5VarArr != null) {
                                    for (u5 u5Var2 : u5VarArr) {
                                        if (u5Var2 != null && !u5Var2.standard) {
                                            sb.append("</animated-emoji>");
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
                                        sb.append("</pre>");
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
                        if (l51VarArr != null) {
                            for (l51 l51Var2 : l51VarArr) {
                                if (l51Var2 != null) {
                                    sb.append("</pre>");
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
                    if (o51VarArr != null) {
                        for (o51 o51Var2 : o51VarArr) {
                            sb.append("</a>");
                            b(o51Var2.a, sb);
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
                if (t01VarArr != null) {
                    for (t01 t01Var2 : t01VarArr) {
                        if (t01Var2 != null) {
                            b(t01Var2.b, sb);
                        }
                    }
                }
                length = i42;
                nextSpanTransition = i43;
                i14 = i44;
            }
            int i45 = length;
            int i46 = nextSpanTransition;
            if (zi0VarArr != null) {
                for (int length2 = zi0VarArr.length - 1; length2 >= 0; length2--) {
                    sb.append("</blockquote>");
                }
            }
            length = i45;
            i14 = i46;
        }
        return sb.toString();
    }
}
