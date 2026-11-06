package bg;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class r {
    public static void a(ty0 ty0Var, StringBuilder sb2) {
        if (ty0Var == null) {
            return;
        }
        if ((ty0Var.a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((ty0Var.a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((ty0Var.a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((ty0Var.a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((ty0Var.a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((ty0Var.a & 4) > 0) {
            sb2.append("<code>");
        }
        if ((ty0Var.a & 128) <= 0 || ty0Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(ty0Var.d.url);
        sb2.append("\">");
    }

    public static void b(ty0 ty0Var, StringBuilder sb2) {
        if (ty0Var == null) {
            return;
        }
        if ((ty0Var.a & 128) > 0 && ty0Var.d != null) {
            sb2.append("</a>");
        }
        if ((ty0Var.a & 4) > 0) {
            sb2.append("</code>");
        }
        if ((ty0Var.a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((ty0Var.a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((ty0Var.a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((ty0Var.a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((ty0Var.a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i14, length, ug0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            ug0[] ug0VarArr = (ug0[]) spanned.getSpans(i14, nextSpanTransition, ug0.class);
            if (ug0VarArr != null) {
                for (ug0 ug0Var : ug0VarArr) {
                    sb2.append(ug0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i14 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i14, nextSpanTransition, uy0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                uy0[] uy0VarArr = (uy0[]) spanned.getSpans(i14, nextSpanTransition2, uy0.class);
                String str3 = "<pre>";
                if (uy0VarArr != null) {
                    for (uy0 uy0Var : uy0VarArr) {
                        if (uy0Var != null) {
                            a(uy0Var.b, sb2);
                        }
                    }
                }
                while (i14 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i14, nextSpanTransition2, x31.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    x31[] x31VarArr = (x31[]) spanned.getSpans(i14, nextSpanTransition3, x31.class);
                    String str4 = "\">";
                    if (x31VarArr != null) {
                        for (x31 x31Var : x31VarArr) {
                            a(x31Var.a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(x31Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i14 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i14, nextSpanTransition3, u31.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        u31[] u31VarArr = (u31[]) spanned.getSpans(i14, nextSpanTransition4, u31.class);
                        if (u31VarArr != null) {
                            for (u31 u31Var : u31VarArr) {
                                if (u31Var != null) {
                                    sb2.append(str3);
                                }
                            }
                        }
                        while (i14 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i14, nextSpanTransition4, ni.j.class);
                            int i15 = length;
                            int i16 = nextSpanTransition5 < 0 ? nextSpanTransition4 : nextSpanTransition5;
                            ni.j[] jVarArr = (ni.j[]) spanned.getSpans(i14, i16, ni.j.class);
                            int i17 = i14;
                            int i18 = nextSpanTransition;
                            if (jVarArr != null) {
                                int i19 = 0;
                                while (i19 < jVarArr.length) {
                                    ni.j jVar = jVarArr[i19];
                                    if (jVar != null) {
                                        String str5 = jVar.a;
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
                                int nextSpanTransition6 = spanned.nextSpanTransition(i20, i16, r5.class);
                                int i21 = i16;
                                if (nextSpanTransition6 >= 0) {
                                    i16 = nextSpanTransition6;
                                }
                                r5[] r5VarArr = (r5[]) spanned.getSpans(i20, i16, r5.class);
                                int i22 = i20;
                                int i23 = nextSpanTransition2;
                                if (r5VarArr != null) {
                                    int i24 = 0;
                                    while (i24 < r5VarArr.length) {
                                        r5 r5Var = r5VarArr[i24];
                                        int i25 = i24;
                                        if (r5Var == null || r5Var.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb2.append("<animated-emoji data-document-id=\"" + r5Var.documentId + str4);
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
                                if (r5VarArr != null) {
                                    for (r5 r5Var2 : r5VarArr) {
                                        if (r5Var2 != null && !r5Var2.standard) {
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
                            if (jVarArr != null) {
                                for (ni.j jVar2 : jVarArr) {
                                    if (jVar2 != null) {
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
                        if (u31VarArr != null) {
                            for (u31 u31Var2 : u31VarArr) {
                                if (u31Var2 != null) {
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
                    if (x31VarArr != null) {
                        for (x31 x31Var2 : x31VarArr) {
                            sb2.append("</a>");
                            b(x31Var2.a, sb2);
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
                if (uy0VarArr != null) {
                    for (uy0 uy0Var2 : uy0VarArr) {
                        if (uy0Var2 != null) {
                            b(uy0Var2.b, sb2);
                        }
                    }
                }
                length = i40;
                nextSpanTransition = i41;
                i14 = i42;
            }
            int i43 = length;
            int i44 = nextSpanTransition;
            if (ug0VarArr != null) {
                for (int length2 = ug0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i43;
            i14 = i44;
        }
        return sb2.toString();
    }
}
