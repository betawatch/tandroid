package bg;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x5;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class s {
    public static void a(dz0 dz0Var, StringBuilder sb2) {
        if (dz0Var == null) {
            return;
        }
        if ((dz0Var.a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((dz0Var.a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((dz0Var.a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((dz0Var.a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((dz0Var.a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((dz0Var.a & 4) > 0) {
            sb2.append("<code>");
        }
        if ((dz0Var.a & 128) <= 0 || dz0Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(dz0Var.d.url);
        sb2.append("\">");
    }

    public static void b(dz0 dz0Var, StringBuilder sb2) {
        if (dz0Var == null) {
            return;
        }
        if ((dz0Var.a & 128) > 0 && dz0Var.d != null) {
            sb2.append("</a>");
        }
        if ((dz0Var.a & 4) > 0) {
            sb2.append("</code>");
        }
        if ((dz0Var.a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((dz0Var.a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((dz0Var.a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((dz0Var.a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((dz0Var.a & 768) > 0) {
            sb2.append("</spoiler>");
        }
    }

    public static String c(Spanned spanned) {
        int i7;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        int i13;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i14 = 0;
        while (i14 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i14, length, hh0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            hh0[] hh0VarArr = (hh0[]) spanned.getSpans(i14, nextSpanTransition, hh0.class);
            if (hh0VarArr != null) {
                for (hh0 hh0Var : hh0VarArr) {
                    sb2.append(hh0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i14 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i14, nextSpanTransition, ez0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                ez0[] ez0VarArr = (ez0[]) spanned.getSpans(i14, nextSpanTransition2, ez0.class);
                String str3 = "<pre>";
                if (ez0VarArr != null) {
                    for (ez0 ez0Var : ez0VarArr) {
                        if (ez0Var != null) {
                            a(ez0Var.b, sb2);
                        }
                    }
                }
                while (i14 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i14, nextSpanTransition2, r41.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    r41[] r41VarArr = (r41[]) spanned.getSpans(i14, nextSpanTransition3, r41.class);
                    String str4 = "\">";
                    if (r41VarArr != null) {
                        for (r41 r41Var : r41VarArr) {
                            a(r41Var.a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(r41Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i14 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i14, nextSpanTransition3, o41.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        o41[] o41VarArr = (o41[]) spanned.getSpans(i14, nextSpanTransition4, o41.class);
                        if (o41VarArr != null) {
                            for (o41 o41Var : o41VarArr) {
                                if (o41Var != null) {
                                    sb2.append(str3);
                                }
                            }
                        }
                        while (i14 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i14, nextSpanTransition4, qi.g.class);
                            int i15 = length;
                            int i16 = nextSpanTransition5 < 0 ? nextSpanTransition4 : nextSpanTransition5;
                            qi.g[] gVarArr = (qi.g[]) spanned.getSpans(i14, i16, qi.g.class);
                            int i17 = i14;
                            int i18 = nextSpanTransition;
                            if (gVarArr != null) {
                                int i19 = 0;
                                while (i19 < gVarArr.length) {
                                    qi.g gVar = gVarArr[i19];
                                    if (gVar != null) {
                                        String str5 = gVar.a;
                                        if (TextUtils.isEmpty(str5)) {
                                            sb2.append(str3);
                                        } else {
                                            i13 = i19;
                                            sb2.append("<pre lang=\"");
                                            sb2.append(str5);
                                            sb2.append(str4);
                                            i19 = i13 + 1;
                                        }
                                    }
                                    i13 = i19;
                                    i19 = i13 + 1;
                                }
                            }
                            int i20 = i17;
                            while (i20 < i16) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i20, i16, x5.class);
                                int i21 = i16;
                                if (nextSpanTransition6 >= 0) {
                                    i16 = nextSpanTransition6;
                                }
                                x5[] x5VarArr = (x5[]) spanned.getSpans(i20, i16, x5.class);
                                int i22 = i20;
                                int i23 = nextSpanTransition2;
                                if (x5VarArr != null) {
                                    int i24 = 0;
                                    while (i24 < x5VarArr.length) {
                                        x5 x5Var = x5VarArr[i24];
                                        int i25 = i24;
                                        if (x5Var == null || x5Var.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb2.append("<animated-emoji data-document-id=\"" + x5Var.documentId + str4);
                                        }
                                        i24 = i25 + 1;
                                        str3 = str2;
                                    }
                                }
                                String str6 = str3;
                                int i26 = i22;
                                while (i26 < i16) {
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
                                        i7 = i26;
                                        i10 = nextSpanTransition3;
                                        if (charAt < 55296 || charAt > 57343) {
                                            str = str4;
                                            if (charAt > '~' || charAt < ' ') {
                                                sb2.append("&#");
                                                sb2.append((int) charAt);
                                                sb2.append(";");
                                            } else if (charAt == ' ') {
                                                i11 = i7;
                                                while (true) {
                                                    int i27 = i11 + 1;
                                                    if (i27 >= i16 || spanned.charAt(i27) != ' ') {
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
                                            i11 = i7;
                                            i26 = i11 + 1;
                                            nextSpanTransition3 = i10;
                                            str4 = str;
                                        } else {
                                            if (charAt < 56320 && (i12 = i7 + 1) < i16) {
                                                str = str4;
                                                char charAt2 = spanned.charAt(i12);
                                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                                    sb2.append("&#");
                                                    sb2.append(((charAt - 55296) << 10) | 65536 | (charAt2 - 56320));
                                                    sb2.append(";");
                                                    i11 = i12;
                                                    i26 = i11 + 1;
                                                    nextSpanTransition3 = i10;
                                                    str4 = str;
                                                }
                                                i11 = i7;
                                                i26 = i11 + 1;
                                                nextSpanTransition3 = i10;
                                                str4 = str;
                                            }
                                            str = str4;
                                            i11 = i7;
                                            i26 = i11 + 1;
                                            nextSpanTransition3 = i10;
                                            str4 = str;
                                        }
                                    }
                                    i7 = i26;
                                    i10 = nextSpanTransition3;
                                    str = str4;
                                    i11 = i7;
                                    i26 = i11 + 1;
                                    nextSpanTransition3 = i10;
                                    str4 = str;
                                }
                                int i28 = nextSpanTransition3;
                                String str7 = str4;
                                if (x5VarArr != null) {
                                    for (x5 x5Var2 : x5VarArr) {
                                        if (x5Var2 != null && !x5Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i20 = i16;
                                i16 = i21;
                                nextSpanTransition2 = i23;
                                str3 = str6;
                                nextSpanTransition3 = i28;
                                str4 = str7;
                            }
                            int i29 = i16;
                            int i30 = nextSpanTransition2;
                            String str8 = str3;
                            int i31 = nextSpanTransition3;
                            String str9 = str4;
                            if (gVarArr != null) {
                                for (qi.g gVar2 : gVarArr) {
                                    if (gVar2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i15;
                            nextSpanTransition = i18;
                            i14 = i29;
                            nextSpanTransition2 = i30;
                            str3 = str8;
                            nextSpanTransition3 = i31;
                            str4 = str9;
                        }
                        int i32 = length;
                        int i33 = nextSpanTransition;
                        int i34 = nextSpanTransition2;
                        String str10 = str3;
                        int i35 = nextSpanTransition3;
                        String str11 = str4;
                        if (o41VarArr != null) {
                            for (o41 o41Var2 : o41VarArr) {
                                if (o41Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i14 = nextSpanTransition4;
                        length = i32;
                        nextSpanTransition = i33;
                        nextSpanTransition2 = i34;
                        str3 = str10;
                        nextSpanTransition3 = i35;
                        str4 = str11;
                    }
                    int i36 = length;
                    int i37 = nextSpanTransition;
                    int i38 = nextSpanTransition2;
                    String str12 = str3;
                    int i39 = nextSpanTransition3;
                    if (r41VarArr != null) {
                        for (r41 r41Var2 : r41VarArr) {
                            sb2.append("</a>");
                            b(r41Var2.a, sb2);
                        }
                    }
                    length = i36;
                    nextSpanTransition = i37;
                    nextSpanTransition2 = i38;
                    str3 = str12;
                    i14 = i39;
                }
                int i40 = length;
                int i41 = nextSpanTransition;
                int i42 = nextSpanTransition2;
                if (ez0VarArr != null) {
                    for (ez0 ez0Var2 : ez0VarArr) {
                        if (ez0Var2 != null) {
                            b(ez0Var2.b, sb2);
                        }
                    }
                }
                length = i40;
                nextSpanTransition = i41;
                i14 = i42;
            }
            int i43 = length;
            int i44 = nextSpanTransition;
            if (hh0VarArr != null) {
                for (int length2 = hh0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i43;
            i14 = i44;
        }
        return sb2.toString();
    }
}
