// default package

import android.text.Spanned;
import android.text.TextUtils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class n43 {
    public static void a(vib vibVar, StringBuilder sb) {
        if (vibVar != null) {
            if ((vibVar.a & 768) > 0) {
                sb.append("<spoiler>");
            }
            if ((vibVar.a & 1) > 0) {
                sb.append("<b>");
            }
            if ((vibVar.a & 2) > 0) {
                sb.append("<i>");
            }
            if ((vibVar.a & 16) > 0) {
                sb.append("<u>");
            }
            if ((vibVar.a & 8) > 0) {
                sb.append("<s>");
            }
            if ((vibVar.a & 4) > 0) {
                sb.append("<code>");
            }
            if ((vibVar.a & 128) <= 0 || vibVar.d == null) {
                return;
            }
            sb.append("<a href=\"");
            sb.append(vibVar.d.url);
            sb.append("\">");
        }
    }

    public static void b(vib vibVar, StringBuilder sb) {
        if (vibVar != null) {
            if ((vibVar.a & 128) > 0 && vibVar.d != null) {
                sb.append("</a>");
            }
            if ((vibVar.a & 4) > 0) {
                sb.append("</code>");
            }
            if ((vibVar.a & 8) > 0) {
                sb.append("</s>");
            }
            if ((vibVar.a & 16) > 0) {
                sb.append("</u>");
            }
            if ((vibVar.a & 2) > 0) {
                sb.append("</i>");
            }
            if ((vibVar.a & 1) > 0) {
                sb.append("</b>");
            }
            if ((vibVar.a & 768) > 0) {
                sb.append("</spoiler>");
            }
        }
    }

    public static String c(Spanned spanned) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        int i5;
        StringBuilder sb = new StringBuilder();
        int length = spanned.length();
        int i6 = 0;
        while (i6 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i6, length, ey8.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            ey8[] ey8VarArr = (ey8[]) spanned.getSpans(i6, nextSpanTransition, ey8.class);
            if (ey8VarArr != null) {
                for (ey8 ey8Var : ey8VarArr) {
                    sb.append(ey8Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i6 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i6, nextSpanTransition, wib.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                wib[] wibVarArr = (wib[]) spanned.getSpans(i6, nextSpanTransition2, wib.class);
                String str3 = "<pre>";
                if (wibVarArr != null) {
                    for (wib wibVar : wibVarArr) {
                        if (wibVar != null) {
                            a(wibVar.b, sb);
                        }
                    }
                }
                while (i6 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i6, nextSpanTransition2, i4c.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    i4c[] i4cVarArr = (i4c[]) spanned.getSpans(i6, nextSpanTransition3, i4c.class);
                    String str4 = "\">";
                    if (i4cVarArr != null) {
                        for (i4c i4cVar : i4cVarArr) {
                            a(i4cVar.a, sb);
                            sb.append("<a href=\"");
                            sb.append(i4cVar.getURL());
                            sb.append("\">");
                        }
                    }
                    while (i6 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i6, nextSpanTransition3, f4c.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        f4c[] f4cVarArr = (f4c[]) spanned.getSpans(i6, nextSpanTransition4, f4c.class);
                        if (f4cVarArr != null) {
                            for (f4c f4cVar : f4cVarArr) {
                                if (f4cVar != null) {
                                    sb.append(str3);
                                }
                            }
                        }
                        while (i6 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i6, nextSpanTransition4, nj2.class);
                            int i7 = length;
                            int i8 = nextSpanTransition5 < 0 ? nextSpanTransition4 : nextSpanTransition5;
                            nj2[] nj2VarArr = (nj2[]) spanned.getSpans(i6, i8, nj2.class);
                            int i9 = i6;
                            int i10 = nextSpanTransition;
                            if (nj2VarArr != null) {
                                int i11 = 0;
                                while (i11 < nj2VarArr.length) {
                                    nj2 nj2Var = nj2VarArr[i11];
                                    if (nj2Var != null) {
                                        String str5 = nj2Var.a;
                                        if (TextUtils.isEmpty(str5)) {
                                            sb.append(str3);
                                        } else {
                                            i5 = i11;
                                            ug8.z("<pre lang=\"", str5, str4, sb);
                                            i11 = i5 + 1;
                                        }
                                    }
                                    i5 = i11;
                                    i11 = i5 + 1;
                                }
                            }
                            int i12 = i9;
                            while (i12 < i8) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i12, i8, gm.class);
                                int i13 = i8;
                                if (nextSpanTransition6 >= 0) {
                                    i8 = nextSpanTransition6;
                                }
                                gm[] gmVarArr = (gm[]) spanned.getSpans(i12, i8, gm.class);
                                int i14 = i12;
                                int i15 = nextSpanTransition2;
                                if (gmVarArr != null) {
                                    int i16 = 0;
                                    while (i16 < gmVarArr.length) {
                                        gm gmVar = gmVarArr[i16];
                                        int i17 = i16;
                                        if (gmVar == null || gmVar.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb.append("<animated-emoji data-document-id=\"" + gmVar.documentId + str4);
                                        }
                                        i16 = i17 + 1;
                                        str3 = str2;
                                    }
                                }
                                String str6 = str3;
                                int i18 = i14;
                                while (i18 < i8) {
                                    char charAt = spanned.charAt(i18);
                                    if (charAt == '\n') {
                                        sb.append("<br>");
                                    } else if (charAt == '<') {
                                        sb.append("&lt;");
                                    } else if (charAt == '>') {
                                        sb.append("&gt;");
                                    } else if (charAt == '&') {
                                        sb.append("&amp;");
                                    } else {
                                        i = i18;
                                        i2 = nextSpanTransition3;
                                        if (charAt < 55296 || charAt > 57343) {
                                            str = str4;
                                            if (charAt > '~' || charAt < ' ') {
                                                sb.append("&#");
                                                sb.append((int) charAt);
                                                sb.append(";");
                                            } else if (charAt == ' ') {
                                                i3 = i;
                                                while (true) {
                                                    int i19 = i3 + 1;
                                                    if (i19 >= i8 || spanned.charAt(i19) != ' ') {
                                                        break;
                                                    }
                                                    sb.append("&nbsp;");
                                                    i3 = i19;
                                                }
                                                sb.append(' ');
                                                i18 = i3 + 1;
                                                nextSpanTransition3 = i2;
                                                str4 = str;
                                            } else {
                                                sb.append(charAt);
                                            }
                                            i3 = i;
                                            i18 = i3 + 1;
                                            nextSpanTransition3 = i2;
                                            str4 = str;
                                        } else {
                                            if (charAt < 56320 && (i4 = i + 1) < i8) {
                                                str = str4;
                                                char charAt2 = spanned.charAt(i4);
                                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                                    sb.append("&#");
                                                    sb.append(((charAt - 55296) << 10) | 65536 | (charAt2 - 56320));
                                                    sb.append(";");
                                                    i3 = i4;
                                                    i18 = i3 + 1;
                                                    nextSpanTransition3 = i2;
                                                    str4 = str;
                                                }
                                                i3 = i;
                                                i18 = i3 + 1;
                                                nextSpanTransition3 = i2;
                                                str4 = str;
                                            }
                                            str = str4;
                                            i3 = i;
                                            i18 = i3 + 1;
                                            nextSpanTransition3 = i2;
                                            str4 = str;
                                        }
                                    }
                                    i = i18;
                                    i2 = nextSpanTransition3;
                                    str = str4;
                                    i3 = i;
                                    i18 = i3 + 1;
                                    nextSpanTransition3 = i2;
                                    str4 = str;
                                }
                                int i20 = nextSpanTransition3;
                                String str7 = str4;
                                if (gmVarArr != null) {
                                    for (gm gmVar2 : gmVarArr) {
                                        if (gmVar2 != null && !gmVar2.standard) {
                                            sb.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i12 = i8;
                                i8 = i13;
                                nextSpanTransition2 = i15;
                                str3 = str6;
                                nextSpanTransition3 = i20;
                                str4 = str7;
                            }
                            int i21 = i8;
                            int i22 = nextSpanTransition2;
                            String str8 = str3;
                            int i23 = nextSpanTransition3;
                            String str9 = str4;
                            if (nj2VarArr != null) {
                                for (nj2 nj2Var2 : nj2VarArr) {
                                    if (nj2Var2 != null) {
                                        sb.append("</pre>");
                                    }
                                }
                            }
                            length = i7;
                            nextSpanTransition = i10;
                            i6 = i21;
                            nextSpanTransition2 = i22;
                            str3 = str8;
                            nextSpanTransition3 = i23;
                            str4 = str9;
                        }
                        int i24 = length;
                        int i25 = nextSpanTransition;
                        int i26 = nextSpanTransition2;
                        String str10 = str3;
                        int i27 = nextSpanTransition3;
                        String str11 = str4;
                        if (f4cVarArr != null) {
                            for (f4c f4cVar2 : f4cVarArr) {
                                if (f4cVar2 != null) {
                                    sb.append("</pre>");
                                }
                            }
                        }
                        i6 = nextSpanTransition4;
                        length = i24;
                        nextSpanTransition = i25;
                        nextSpanTransition2 = i26;
                        str3 = str10;
                        nextSpanTransition3 = i27;
                        str4 = str11;
                    }
                    int i28 = length;
                    int i29 = nextSpanTransition;
                    int i30 = nextSpanTransition2;
                    String str12 = str3;
                    int i31 = nextSpanTransition3;
                    if (i4cVarArr != null) {
                        for (i4c i4cVar2 : i4cVarArr) {
                            sb.append("</a>");
                            b(i4cVar2.a, sb);
                        }
                    }
                    length = i28;
                    nextSpanTransition = i29;
                    nextSpanTransition2 = i30;
                    str3 = str12;
                    i6 = i31;
                }
                int i32 = length;
                int i33 = nextSpanTransition;
                int i34 = nextSpanTransition2;
                if (wibVarArr != null) {
                    for (wib wibVar2 : wibVarArr) {
                        if (wibVar2 != null) {
                            b(wibVar2.b, sb);
                        }
                    }
                }
                length = i32;
                nextSpanTransition = i33;
                i6 = i34;
            }
            int i35 = length;
            int i36 = nextSpanTransition;
            if (ey8VarArr != null) {
                for (int length2 = ey8VarArr.length - 1; length2 >= 0; length2--) {
                    sb.append("</blockquote>");
                }
            }
            length = i35;
            i6 = i36;
        }
        return sb.toString();
    }
}
