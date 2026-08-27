package gf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class r {
    public static void a(xz0 xz0Var, StringBuilder sb2) {
        if (xz0Var == null) {
            return;
        }
        if ((xz0Var.a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((xz0Var.a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((xz0Var.a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((xz0Var.a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((xz0Var.a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((xz0Var.a & 128) <= 0 || xz0Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(xz0Var.d.url);
        sb2.append("\">");
    }

    public static void b(xz0 xz0Var, StringBuilder sb2) {
        if (xz0Var == null) {
            return;
        }
        if ((xz0Var.a & 128) > 0 && xz0Var.d != null) {
            sb2.append("</a>");
        }
        if ((xz0Var.a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((xz0Var.a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((xz0Var.a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((xz0Var.a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((xz0Var.a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i14, length, hi0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            hi0[] hi0VarArr = (hi0[]) spanned.getSpans(i14, nextSpanTransition, hi0.class);
            if (hi0VarArr != null) {
                for (hi0 hi0Var : hi0VarArr) {
                    sb2.append(hi0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i14 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i14, nextSpanTransition, yz0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                yz0[] yz0VarArr = (yz0[]) spanned.getSpans(i14, nextSpanTransition2, yz0.class);
                String str3 = "<pre>";
                if (yz0VarArr != null) {
                    for (yz0 yz0Var : yz0VarArr) {
                        if (yz0Var != null) {
                            a(yz0Var.b, sb2);
                        }
                    }
                }
                while (i14 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i14, nextSpanTransition2, t41.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    t41[] t41VarArr = (t41[]) spanned.getSpans(i14, nextSpanTransition3, t41.class);
                    String str4 = "\">";
                    if (t41VarArr != null) {
                        for (t41 t41Var : t41VarArr) {
                            a(t41Var.a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(t41Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i14 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i14, nextSpanTransition3, q41.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        q41[] q41VarArr = (q41[]) spanned.getSpans(i14, nextSpanTransition4, q41.class);
                        if (q41VarArr != null) {
                            for (q41 q41Var : q41VarArr) {
                                if (q41Var != null) {
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
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i16, t5.class);
                                int i22 = i16;
                                if (nextSpanTransition6 >= 0) {
                                    i16 = nextSpanTransition6;
                                }
                                t5[] t5VarArr = (t5[]) spanned.getSpans(i21, i16, t5.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (t5VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < t5VarArr.length) {
                                        t5 t5Var = t5VarArr[i25];
                                        int i26 = i25;
                                        if (t5Var == null || t5Var.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb2.append("<animated-emoji data-document-id=\"" + t5Var.documentId + str4);
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
                                if (t5VarArr != null) {
                                    for (t5 t5Var2 : t5VarArr) {
                                        if (t5Var2 != null && !t5Var2.standard) {
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
                        if (q41VarArr != null) {
                            for (q41 q41Var2 : q41VarArr) {
                                if (q41Var2 != null) {
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
                    if (t41VarArr != null) {
                        for (t41 t41Var2 : t41VarArr) {
                            sb2.append("</a>");
                            b(t41Var2.a, sb2);
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
                if (yz0VarArr != null) {
                    for (yz0 yz0Var2 : yz0VarArr) {
                        if (yz0Var2 != null) {
                            b(yz0Var2.b, sb2);
                        }
                    }
                }
                length = i42;
                nextSpanTransition = i43;
                i14 = i44;
            }
            int i45 = length;
            int i46 = nextSpanTransition;
            if (hi0VarArr != null) {
                for (int length2 = hi0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i45;
            i14 = i46;
        }
        return sb2.toString();
    }
}
