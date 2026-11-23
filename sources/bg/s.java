package bg;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class s {
    public static void a(fz0 fz0Var, StringBuilder sb2) {
        if (fz0Var == null) {
            return;
        }
        if ((fz0Var.a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((fz0Var.a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((fz0Var.a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((fz0Var.a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((fz0Var.a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((fz0Var.a & 4) > 0) {
            sb2.append("<code>");
        }
        if ((fz0Var.a & 128) <= 0 || fz0Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(fz0Var.d.url);
        sb2.append("\">");
    }

    public static void b(fz0 fz0Var, StringBuilder sb2) {
        if (fz0Var == null) {
            return;
        }
        if ((fz0Var.a & 128) > 0 && fz0Var.d != null) {
            sb2.append("</a>");
        }
        if ((fz0Var.a & 4) > 0) {
            sb2.append("</code>");
        }
        if ((fz0Var.a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((fz0Var.a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((fz0Var.a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((fz0Var.a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((fz0Var.a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i14, length, jh0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            jh0[] jh0VarArr = (jh0[]) spanned.getSpans(i14, nextSpanTransition, jh0.class);
            if (jh0VarArr != null) {
                for (jh0 jh0Var : jh0VarArr) {
                    sb2.append(jh0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i14 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i14, nextSpanTransition, gz0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                gz0[] gz0VarArr = (gz0[]) spanned.getSpans(i14, nextSpanTransition2, gz0.class);
                String str3 = "<pre>";
                if (gz0VarArr != null) {
                    for (gz0 gz0Var : gz0VarArr) {
                        if (gz0Var != null) {
                            a(gz0Var.b, sb2);
                        }
                    }
                }
                while (i14 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i14, nextSpanTransition2, u41.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    u41[] u41VarArr = (u41[]) spanned.getSpans(i14, nextSpanTransition3, u41.class);
                    String str4 = "\">";
                    if (u41VarArr != null) {
                        for (u41 u41Var : u41VarArr) {
                            a(u41Var.a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(u41Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i14 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i14, nextSpanTransition3, r41.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        r41[] r41VarArr = (r41[]) spanned.getSpans(i14, nextSpanTransition4, r41.class);
                        if (r41VarArr != null) {
                            for (r41 r41Var : r41VarArr) {
                                if (r41Var != null) {
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
                                int nextSpanTransition6 = spanned.nextSpanTransition(i20, i16, y5.class);
                                int i21 = i16;
                                if (nextSpanTransition6 >= 0) {
                                    i16 = nextSpanTransition6;
                                }
                                y5[] y5VarArr = (y5[]) spanned.getSpans(i20, i16, y5.class);
                                int i22 = i20;
                                int i23 = nextSpanTransition2;
                                if (y5VarArr != null) {
                                    int i24 = 0;
                                    while (i24 < y5VarArr.length) {
                                        y5 y5Var = y5VarArr[i24];
                                        int i25 = i24;
                                        if (y5Var == null || y5Var.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb2.append("<animated-emoji data-document-id=\"" + y5Var.documentId + str4);
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
                                if (y5VarArr != null) {
                                    for (y5 y5Var2 : y5VarArr) {
                                        if (y5Var2 != null && !y5Var2.standard) {
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
                        if (r41VarArr != null) {
                            for (r41 r41Var2 : r41VarArr) {
                                if (r41Var2 != null) {
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
                    if (u41VarArr != null) {
                        for (u41 u41Var2 : u41VarArr) {
                            sb2.append("</a>");
                            b(u41Var2.a, sb2);
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
                if (gz0VarArr != null) {
                    for (gz0 gz0Var2 : gz0VarArr) {
                        if (gz0Var2 != null) {
                            b(gz0Var2.b, sb2);
                        }
                    }
                }
                length = i40;
                nextSpanTransition = i41;
                i14 = i42;
            }
            int i43 = length;
            int i44 = nextSpanTransition;
            if (jh0VarArr != null) {
                for (int length2 = jh0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i43;
            i14 = i44;
        }
        return sb2.toString();
    }
}
