package bg;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class r {
    public static void a(vy0 vy0Var, StringBuilder sb2) {
        if (vy0Var == null) {
            return;
        }
        if ((vy0Var.a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((vy0Var.a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((vy0Var.a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((vy0Var.a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((vy0Var.a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((vy0Var.a & 4) > 0) {
            sb2.append("<code>");
        }
        if ((vy0Var.a & 128) <= 0 || vy0Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(vy0Var.d.url);
        sb2.append("\">");
    }

    public static void b(vy0 vy0Var, StringBuilder sb2) {
        if (vy0Var == null) {
            return;
        }
        if ((vy0Var.a & 128) > 0 && vy0Var.d != null) {
            sb2.append("</a>");
        }
        if ((vy0Var.a & 4) > 0) {
            sb2.append("</code>");
        }
        if ((vy0Var.a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((vy0Var.a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((vy0Var.a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((vy0Var.a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((vy0Var.a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i14, length, vg0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            vg0[] vg0VarArr = (vg0[]) spanned.getSpans(i14, nextSpanTransition, vg0.class);
            if (vg0VarArr != null) {
                for (vg0 vg0Var : vg0VarArr) {
                    sb2.append(vg0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i14 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i14, nextSpanTransition, wy0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                wy0[] wy0VarArr = (wy0[]) spanned.getSpans(i14, nextSpanTransition2, wy0.class);
                String str3 = "<pre>";
                if (wy0VarArr != null) {
                    for (wy0 wy0Var : wy0VarArr) {
                        if (wy0Var != null) {
                            a(wy0Var.b, sb2);
                        }
                    }
                }
                while (i14 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i14, nextSpanTransition2, e41.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    e41[] e41VarArr = (e41[]) spanned.getSpans(i14, nextSpanTransition3, e41.class);
                    String str4 = "\">";
                    if (e41VarArr != null) {
                        for (e41 e41Var : e41VarArr) {
                            a(e41Var.a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(e41Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i14 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i14, nextSpanTransition3, b41.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        b41[] b41VarArr = (b41[]) spanned.getSpans(i14, nextSpanTransition4, b41.class);
                        if (b41VarArr != null) {
                            for (b41 b41Var : b41VarArr) {
                                if (b41Var != null) {
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
                        if (b41VarArr != null) {
                            for (b41 b41Var2 : b41VarArr) {
                                if (b41Var2 != null) {
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
                    if (e41VarArr != null) {
                        for (e41 e41Var2 : e41VarArr) {
                            sb2.append("</a>");
                            b(e41Var2.a, sb2);
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
                if (wy0VarArr != null) {
                    for (wy0 wy0Var2 : wy0VarArr) {
                        if (wy0Var2 != null) {
                            b(wy0Var2.b, sb2);
                        }
                    }
                }
                length = i40;
                nextSpanTransition = i41;
                i14 = i42;
            }
            int i43 = length;
            int i44 = nextSpanTransition;
            if (vg0VarArr != null) {
                for (int length2 = vg0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i43;
            i14 = i44;
        }
        return sb2.toString();
    }
}
