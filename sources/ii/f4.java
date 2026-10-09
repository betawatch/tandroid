package ii;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.v61;
import org.webrtc.MediaStreamTrack;
import v7.p8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class f4 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0598, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A(ArrayList arrayList, ArrayList arrayList2, Map map) {
        int i10;
        int i11;
        int i12;
        int i13;
        TL_keyboard.InlineButtonType v;
        String str;
        CharSequence w10;
        int i14;
        String str2;
        int i15;
        e4 e4Var;
        CharSequence w11;
        int size = arrayList.size();
        int i16 = 0;
        int i17 = 0;
        while (true) {
            SpannableStringBuilder spannableStringBuilder = null;
            while (i17 < size) {
                Object obj = arrayList.get(i17);
                i17++;
                e4 e4Var2 = (e4) obj;
                boolean z10 = e4Var2.b;
                ArrayList arrayList3 = e4Var2.e;
                if (!z10) {
                    String str3 = e4Var2.a;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -1999048254:
                            if (str3.equals("spoiler")) {
                                i10 = i16;
                                break;
                            }
                            i10 = -1;
                            break;
                        case -1377687758:
                            if (str3.equals("button")) {
                                i10 = 1;
                                break;
                            }
                            i10 = -1;
                            break;
                        case -891985998:
                            if (str3.equals("strike")) {
                                i10 = 2;
                                break;
                            }
                            i10 = -1;
                            break;
                        case -891980137:
                            if (str3.equals("strong")) {
                                i10 = 3;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 97:
                            if (str3.equals("a")) {
                                i10 = 4;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 98:
                            if (str3.equals("b")) {
                                i10 = 5;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 105:
                            if (str3.equals("i")) {
                                i10 = 6;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 115:
                            if (str3.equals("s")) {
                                i10 = 7;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 117:
                            if (str3.equals("u")) {
                                i10 = 8;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 3152:
                            if (str3.equals("br")) {
                                i10 = 9;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 3240:
                            if (str3.equals("em")) {
                                i10 = 10;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 3712:
                            if (str3.equals("tt")) {
                                i10 = 11;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 99339:
                            if (str3.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                i10 = 12;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 114240:
                            if (str3.equals("sub")) {
                                i10 = 13;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 114254:
                            if (str3.equals("sup")) {
                                i10 = 14;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 3059181:
                            if (str3.equals("code")) {
                                i10 = 15;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 3148879:
                            if (str3.equals("font")) {
                                i10 = 16;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 3536714:
                            if (str3.equals("span")) {
                                i10 = 17;
                                break;
                            }
                            i10 = -1;
                            break;
                        case 1438365596:
                            if (str3.equals("animated-emoji")) {
                                i10 = 18;
                                break;
                            }
                            i10 = -1;
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                    switch (i10) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            int i18 = i16;
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                            h(spannableStringBuilder2, e4Var2, 0, null, 0L);
                            i16 = i18;
                            spannableStringBuilder = spannableStringBuilder2;
                            break;
                        default:
                            t(arrayList2, spannableStringBuilder);
                            switch (str3.hashCode()) {
                                case -1857640538:
                                    if (str3.equals("summary")) {
                                        i11 = i16;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case -1274639644:
                                    if (str3.equals("figure")) {
                                        i11 = 1;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case -1268861541:
                                    if (str3.equals("footer")) {
                                        i11 = 2;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 112:
                                    if (str3.equals("p")) {
                                        i11 = 3;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3273:
                                    if (str3.equals("h1")) {
                                        i11 = 4;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3274:
                                    if (str3.equals("h2")) {
                                        i11 = 5;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3275:
                                    if (str3.equals("h3")) {
                                        i11 = 6;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3276:
                                    if (str3.equals("h4")) {
                                        i11 = 7;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3277:
                                    if (str3.equals("h5")) {
                                        i11 = 8;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3278:
                                    if (str3.equals("h6")) {
                                        i11 = 9;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3338:
                                    if (str3.equals("hr")) {
                                        i11 = 10;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3549:
                                    if (str3.equals("ol")) {
                                        i11 = 11;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3696:
                                    if (str3.equals("td")) {
                                        i11 = 12;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3700:
                                    if (str3.equals("th")) {
                                        i11 = 13;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3710:
                                    if (str3.equals("tr")) {
                                        i11 = 14;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 3735:
                                    if (str3.equals("ul")) {
                                        i11 = 15;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 99473:
                                    if (str3.equals("div")) {
                                        i11 = 16;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 104387:
                                    if (str3.equals("img")) {
                                        i11 = 17;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 111267:
                                    if (str3.equals("pre")) {
                                        i11 = 18;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 93166550:
                                    if (str3.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                        i11 = 19;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 110115790:
                                    if (str3.equals("table")) {
                                        i11 = 20;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 110157846:
                                    if (str3.equals("tbody")) {
                                        i11 = 21;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 110326868:
                                    if (str3.equals("thead")) {
                                        i11 = 22;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 112202875:
                                    if (str3.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                        i11 = 23;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 1303202319:
                                    if (str3.equals("blockquote")) {
                                        i11 = 24;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 1557721666:
                                    if (str3.equals("details")) {
                                        i11 = 25;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 1901043637:
                                    if (str3.equals("location")) {
                                        i11 = 26;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                default:
                                    i11 = -1;
                                    break;
                            }
                            switch (i11) {
                                case 0:
                                    i12 = i16;
                                    b(arrayList2, new TL_iv.pageBlockParagraph(), e4Var2);
                                    break;
                                case 1:
                                    int size2 = arrayList3.size();
                                    int i19 = 0;
                                    a aVar = null;
                                    CharSequence charSequence = null;
                                    while (i19 < size2) {
                                        Object obj2 = arrayList3.get(i19);
                                        i19++;
                                        e4 e4Var3 = (e4) obj2;
                                        if (!e4Var3.b) {
                                            if ("figcaption".equals(e4Var3.a)) {
                                                charSequence = w(e4Var3);
                                            } else if (aVar == null) {
                                                aVar = m(e4Var3);
                                            }
                                        }
                                    }
                                    if (aVar == null) {
                                        if (charSequence != null && charSequence.length() > 0) {
                                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                            pageblockparagraph.text = h6.f(charSequence);
                                            i12 = 0;
                                            arrayList2.add(new a(pageblockparagraph, 0, 0));
                                            break;
                                        }
                                    } else {
                                        if (charSequence != null && charSequence.length() > 0) {
                                            I(aVar.b, charSequence);
                                        }
                                        arrayList2.add(aVar);
                                    }
                                    i12 = 0;
                                    break;
                                case 2:
                                    b(arrayList2, new TL_iv.pageBlockFooter(), e4Var2);
                                    i12 = 0;
                                    break;
                                case 3:
                                    b(arrayList2, new TL_iv.pageBlockParagraph(), e4Var2);
                                    i12 = 0;
                                    break;
                                case 4:
                                    b(arrayList2, new TL_iv.pageBlockHeading1(), e4Var2);
                                    i12 = 0;
                                    break;
                                case 5:
                                    b(arrayList2, new TL_iv.pageBlockHeading2(), e4Var2);
                                    i12 = 0;
                                    break;
                                case 6:
                                    b(arrayList2, new TL_iv.pageBlockHeading3(), e4Var2);
                                    i12 = 0;
                                    break;
                                case 7:
                                    b(arrayList2, new TL_iv.pageBlockHeading4(), e4Var2);
                                    i12 = 0;
                                    break;
                                case 8:
                                    b(arrayList2, new TL_iv.pageBlockHeading5(), e4Var2);
                                    i12 = 0;
                                    break;
                                case 9:
                                    b(arrayList2, new TL_iv.pageBlockHeading6(), e4Var2);
                                    i12 = 0;
                                    break;
                                case 10:
                                    int i20 = i16;
                                    arrayList2.add(new a(new TL_iv.pageBlockDivider(), i20, i20));
                                    i12 = 0;
                                    break;
                                case 11:
                                case 15:
                                    i13 = 0;
                                    D(e4Var2, arrayList2, 0, "ol".equals(str3));
                                    i12 = i13;
                                    break;
                                case 12:
                                case 13:
                                case 14:
                                case 21:
                                case 22:
                                    A(arrayList3, arrayList2, map);
                                    i12 = 0;
                                    break;
                                case 16:
                                    String a2 = e4Var2.a("class");
                                    String lowerCase = a2 == null ? "" : a2.toLowerCase();
                                    if (!lowerCase.contains("button-row")) {
                                        if (lowerCase.contains("collage")) {
                                            a(B(e4Var2, false), arrayList2);
                                        } else if (lowerCase.contains("slideshow")) {
                                            a(B(e4Var2, true), arrayList2);
                                        } else {
                                            b(arrayList2, new TL_iv.pageBlockParagraph(), e4Var2);
                                        }
                                        i12 = 0;
                                        break;
                                    } else {
                                        TL_iv.pageBlockButtonRow pageblockbuttonrow = new TL_iv.pageBlockButtonRow();
                                        String a10 = e4Var2.a("data-align");
                                        pageblockbuttonrow.align_left = "left".equalsIgnoreCase(a10);
                                        pageblockbuttonrow.align_center = "center".equalsIgnoreCase(a10);
                                        pageblockbuttonrow.align_right = "right".equalsIgnoreCase(a10);
                                        int size3 = arrayList3.size();
                                        int i21 = 0;
                                        while (i21 < size3) {
                                            Object obj3 = arrayList3.get(i21);
                                            i21++;
                                            e4 e4Var4 = (e4) obj3;
                                            if (pageblockbuttonrow.buttons.size() >= 8) {
                                                i13 = 0;
                                                arrayList2.add(new a(pageblockbuttonrow, 0, 0));
                                                i12 = i13;
                                                break;
                                            } else if (!e4Var4.b && "button".equals(e4Var4.a) && (v = v(e4Var4)) != null) {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                e(spannableStringBuilder3, e4Var4, 0, null, 0L);
                                                CharSequence L = L(spannableStringBuilder3);
                                                if (L.length() != 0) {
                                                    TL_keyboard.PageButton pageButton = new TL_keyboard.PageButton();
                                                    pageButton.text = h6.f(L);
                                                    pageButton.type = v;
                                                    pageButton.style = u(e4Var4);
                                                    pageblockbuttonrow.buttons.add(pageButton);
                                                }
                                            }
                                        }
                                        i13 = 0;
                                        arrayList2.add(new a(pageblockbuttonrow, 0, 0));
                                        i12 = i13;
                                    }
                                    break;
                                case 17:
                                    a(m(e4Var2), arrayList2);
                                    i12 = 0;
                                    break;
                                case 18:
                                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                                    String[] strArr = {"language", "lang", "lng"};
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 >= 3) {
                                            str = null;
                                        } else {
                                            str = e4Var2.a(strArr[i22]);
                                            if (str == null) {
                                                i22++;
                                            }
                                        }
                                    }
                                    pageblockpreformatted.language = str;
                                    b(arrayList2, pageblockpreformatted, e4Var2);
                                    i12 = 0;
                                    break;
                                case 19:
                                    a(m(e4Var2), arrayList2);
                                    i12 = 0;
                                    break;
                                case 20:
                                    TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
                                    pageblocktable.title = new TL_iv.textEmpty();
                                    pageblocktable.rows = new ArrayList<>();
                                    pageblocktable.bordered = e4Var2.b("border");
                                    String a11 = e4Var2.a("class");
                                    pageblocktable.striped = a11 != null && a11.toLowerCase().contains("striped");
                                    pageblocktable.compact = a11 != null && a11.toLowerCase().contains("compact");
                                    p(e4Var2, pageblocktable);
                                    if (pageblocktable.rows.isEmpty()) {
                                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                                        ArrayList<TL_iv.pageTableCell> arrayList4 = new ArrayList<>();
                                        pagetablerow.cells = arrayList4;
                                        arrayList4.add(j6.f());
                                        pageblocktable.rows.add(pagetablerow);
                                    }
                                    arrayList2.add(new a(pageblocktable, 0, 0));
                                    i12 = 0;
                                    break;
                                case 23:
                                    a(m(e4Var2), arrayList2);
                                    i12 = 0;
                                    break;
                                case 24:
                                    String a12 = e4Var2.a("class");
                                    if (a12 != null && a12.toLowerCase().contains("pull")) {
                                        int size4 = arrayList3.size();
                                        int i23 = i16;
                                        while (true) {
                                            if (i23 < size4) {
                                                Object obj4 = arrayList3.get(i23);
                                                i23++;
                                                e4Var = (e4) obj4;
                                                if (e4Var.b || !"cite".equals(e4Var.a)) {
                                                }
                                            } else {
                                                e4Var = null;
                                            }
                                        }
                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                        f(spannableStringBuilder4, e4Var2);
                                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                                        f6.d(pageblockpullquote, L(spannableStringBuilder4));
                                        TL_iv.RichText f7 = (e4Var == null || (w11 = w(e4Var)) == null || w11.length() == 0) ? null : h6.f(w11);
                                        if (f7 != null) {
                                            pageblockpullquote.caption = f7;
                                        }
                                        arrayList2.add(new a(pageblockpullquote, i16, i16));
                                        i12 = i16;
                                        break;
                                    } else {
                                        int size5 = arrayList3.size();
                                        int i24 = i16;
                                        int i25 = i24;
                                        e4 e4Var5 = null;
                                        while (i24 < size5) {
                                            Object obj5 = arrayList3.get(i24);
                                            i24++;
                                            e4 e4Var6 = (e4) obj5;
                                            if (!e4Var6.b && (str2 = e4Var6.a) != null) {
                                                if (!"cite".equals(str2)) {
                                                    String str4 = e4Var6.a;
                                                    str4.getClass();
                                                    switch (str4.hashCode()) {
                                                        case -1999048254:
                                                            if (str4.equals("spoiler")) {
                                                                i15 = i16;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case -1377687758:
                                                            if (str4.equals("button")) {
                                                                i15 = 1;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case -891985998:
                                                            if (str4.equals("strike")) {
                                                                i15 = 2;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case -891980137:
                                                            if (str4.equals("strong")) {
                                                                i15 = 3;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 97:
                                                            if (str4.equals("a")) {
                                                                i15 = 4;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 98:
                                                            if (str4.equals("b")) {
                                                                i15 = 5;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 105:
                                                            if (str4.equals("i")) {
                                                                i15 = 6;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 115:
                                                            if (str4.equals("s")) {
                                                                i15 = 7;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 117:
                                                            if (str4.equals("u")) {
                                                                i15 = 8;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 3152:
                                                            if (str4.equals("br")) {
                                                                i15 = 9;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 3240:
                                                            if (str4.equals("em")) {
                                                                i15 = 10;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 3712:
                                                            if (str4.equals("tt")) {
                                                                i15 = 11;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 99339:
                                                            if (str4.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                                                i15 = 12;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 114240:
                                                            if (str4.equals("sub")) {
                                                                i15 = 13;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 114254:
                                                            if (str4.equals("sup")) {
                                                                i15 = 14;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 3059181:
                                                            if (str4.equals("code")) {
                                                                i15 = 15;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 3148879:
                                                            if (str4.equals("font")) {
                                                                i15 = 16;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 3536714:
                                                            if (str4.equals("span")) {
                                                                i15 = 17;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        case 1438365596:
                                                            if (str4.equals("animated-emoji")) {
                                                                i15 = 18;
                                                                break;
                                                            }
                                                            i15 = -1;
                                                            break;
                                                        default:
                                                            i15 = -1;
                                                            break;
                                                    }
                                                    switch (i15) {
                                                        case 0:
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                        case 14:
                                                        case 15:
                                                        case 16:
                                                        case 17:
                                                        case 18:
                                                            break;
                                                        default:
                                                            i25 = 1;
                                                            break;
                                                    }
                                                } else if (e4Var5 == null) {
                                                    e4Var5 = e4Var6;
                                                }
                                            }
                                        }
                                        TL_iv.RichText f10 = (e4Var5 == null || (w10 = w(e4Var5)) == null || w10.length() == 0) ? null : h6.f(w10);
                                        if (i25 == 0) {
                                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                            f(spannableStringBuilder5, e4Var2);
                                            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                            pageblockblockquote.collapsed = (e4Var2.b("data-collapsed") || e4Var2.b("collapsed")) ? 1 : i16;
                                            f6.d(pageblockblockquote, L(spannableStringBuilder5));
                                            if (f10 != null) {
                                                pageblockblockquote.caption = f10;
                                            }
                                            arrayList2.add(new a(pageblockblockquote, i16, i16));
                                        } else {
                                            long a13 = q0.a();
                                            int size6 = arrayList2.size();
                                            ArrayList arrayList5 = new ArrayList();
                                            int size7 = arrayList3.size();
                                            int i26 = i16;
                                            while (i26 < size7) {
                                                Object obj6 = arrayList3.get(i26);
                                                i26++;
                                                e4 e4Var7 = (e4) obj6;
                                                if (e4Var7.b || !"cite".equals(e4Var7.a)) {
                                                    arrayList5.add(e4Var7);
                                                }
                                            }
                                            A(arrayList5, arrayList2, map);
                                            if (arrayList2.size() == size6) {
                                                i14 = 0;
                                                arrayList2.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                                                while (size6 < arrayList2.size()) {
                                                    ((a) arrayList2.get(size6)).k.add(i14, Long.valueOf(a13));
                                                    size6++;
                                                }
                                                if (f10 != null && map != null) {
                                                    map.put(Long.valueOf(a13), f10);
                                                }
                                            }
                                            i14 = 0;
                                        }
                                        i12 = 0;
                                        break;
                                    }
                                    break;
                                case 25:
                                    TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                                    pageblockdetails.open = e4Var2.b("open");
                                    pageblockdetails.blocks = new ArrayList<>();
                                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size8 = arrayList3.size();
                                    int i27 = i16;
                                    while (i27 < size8) {
                                        Object obj7 = arrayList3.get(i27);
                                        i27++;
                                        e4 e4Var8 = (e4) obj7;
                                        if (e4Var8.b || !"summary".equals(e4Var8.a)) {
                                            arrayList6.add(e4Var8);
                                        } else {
                                            e(spannableStringBuilder6, e4Var8, 0, null, 0L);
                                        }
                                    }
                                    pageblockdetails.title = h6.f(L(spannableStringBuilder6));
                                    arrayList2.add(new a(pageblockdetails, i16, i16));
                                    int size9 = arrayList2.size();
                                    A(arrayList6, arrayList2, map);
                                    if (arrayList2.size() == size9) {
                                        arrayList2.add(new a(new TL_iv.pageBlockParagraph(), i16, i16));
                                    }
                                    a aVar2 = new a(new TL_iv.pageBlockParagraph(), i16, i16);
                                    aVar2.i = true;
                                    arrayList2.add(aVar2);
                                    i12 = i16;
                                    break;
                                case 26:
                                    a(m(e4Var2), arrayList2);
                                    i12 = i16;
                                    break;
                                default:
                                    if (!arrayList3.isEmpty()) {
                                        A(arrayList3, arrayList2, map);
                                    }
                                    i12 = i16;
                                    break;
                            }
                            i16 = i12;
                            break;
                    }
                } else if (!x(e4Var2.c)) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    spannableStringBuilder.append((CharSequence) q(e4Var2.c));
                }
            }
            t(arrayList2, spannableStringBuilder);
            return;
        }
    }

    public static a B(e4 e4Var, boolean z10) {
        TL_iv.PageBlock pageblockslideshow = z10 ? new TL_iv.pageBlockSlideshow() : new TL_iv.pageBlockCollage();
        ArrayList h32 = x3.h3(pageblockslideshow);
        ArrayList arrayList = e4Var.e;
        int size = arrayList.size();
        CharSequence charSequence = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e4 e4Var2 = (e4) obj;
            if (!e4Var2.b) {
                if ("figcaption".equals(e4Var2.a)) {
                    charSequence = w(e4Var2);
                } else {
                    boolean equals = MediaStreamTrack.VIDEO_TRACK_KIND.equals(e4Var2.a);
                    if (equals || "img".equals(e4Var2.a)) {
                        long E = E(e4Var2.a("src"));
                        if (E > 0) {
                            TL_iv.PageBlock y3 = y(E, equals, e4Var2.b("data-spoiler"));
                            J(y3);
                            h32.add(y3);
                        }
                    }
                }
            }
        }
        if (h32.isEmpty()) {
            return null;
        }
        if (h32.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) h32.get(0);
            if (charSequence != null && charSequence.length() > 0) {
                I(pageBlock, charSequence);
            }
            return new a(pageBlock, 0, 0);
        }
        J(pageblockslideshow);
        if (charSequence != null && charSequence.length() > 0) {
            I(pageblockslideshow, charSequence);
        }
        return new a(pageblockslideshow, 0, 0);
    }

    public static int C(int i10, String str) {
        if (str == null) {
            return i10;
        }
        try {
            return Integer.parseInt(str.trim());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static void D(e4 e4Var, ArrayList arrayList, int i10, boolean z10) {
        String a2;
        ArrayList arrayList2;
        int i11;
        int i12 = i10 + 1;
        ArrayList arrayList3 = e4Var.e;
        int size = arrayList3.size();
        int i13 = 1;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList3.get(i14);
            i14++;
            e4 e4Var2 = (e4) obj;
            if (!e4Var2.b && "li".equals(e4Var2.a)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = e4Var2.e;
                int size2 = arrayList5.size();
                int i15 = 0;
                while (i15 < size2) {
                    int i16 = i15 + 1;
                    e4 e4Var3 = (e4) arrayList5.get(i15);
                    if (!e4Var3.b && ("ul".equals(e4Var3.a) || "ol".equals(e4Var3.a))) {
                        arrayList4.add(e4Var3);
                    } else if (e4Var3.b) {
                        spannableStringBuilder.append((CharSequence) q(e4Var3.c));
                    } else {
                        arrayList2 = arrayList5;
                        i11 = size2;
                        h(spannableStringBuilder, e4Var3, 0, null, 0L);
                        arrayList5 = arrayList2;
                        i15 = i16;
                        size2 = i11;
                    }
                    arrayList2 = arrayList5;
                    i11 = size2;
                    arrayList5 = arrayList2;
                    i15 = i16;
                    size2 = i11;
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = h6.f(L(spannableStringBuilder));
                a aVar = new a(pageblockparagraph, i12, z10 ? i13 : 0);
                aVar.e = e4Var2.b("data-checkbox") || ((a2 = e4Var2.a("class")) != null && a2.toLowerCase().contains("checkbox"));
                aVar.f = e4Var2.b("data-checked");
                arrayList.add(aVar);
                int size3 = arrayList4.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj2 = arrayList4.get(i17);
                    i17++;
                    e4 e4Var4 = (e4) obj2;
                    D(e4Var4, arrayList, i12, "ol".equals(e4Var4.a));
                }
                i13++;
            }
        }
    }

    public static long E(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str.trim());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void F(StringBuilder sb2, List list, int[] iArr, int i10, int i11, int i12, int i13, int i14, d4 d4Var, boolean z10, int i15, Map map) {
        int i16;
        List list2;
        boolean z11;
        String str;
        String str2;
        StringBuilder sb3 = sb2;
        List list3 = list;
        int i17 = i10;
        d4 d4Var2 = d4Var;
        int i18 = i15;
        ArrayList arrayList = d4Var2.a;
        while (true) {
            int i19 = iArr[0];
            if (i19 > i17) {
                return;
            }
            a aVar = (a) list3.get(i19);
            if (!aVar.i) {
                if (aVar.k.size() > i18) {
                    d4Var2.c(sb3);
                    Long l4 = (Long) ((a) list3.get(iArr[0])).k.get(i18);
                    long longValue = l4.longValue();
                    int i20 = iArr[0];
                    while (true) {
                        int i21 = i20 + 1;
                        if (i21 > i17) {
                            break;
                        }
                        a aVar2 = (a) list3.get(i21);
                        if (aVar2.k.size() <= i18 || ((Long) aVar2.k.get(i18)).longValue() != longValue) {
                            break;
                        } else {
                            i20 = i21;
                        }
                    }
                    sb3.append("<blockquote>");
                    d4 d4Var3 = new d4();
                    F(sb3, list3, iArr, i20, i11, i12, i13, i14, d4Var3, z10, i18 + 1, map);
                    d4Var3.c(sb3);
                    c(sb3, map != null ? k((TL_iv.RichText) map.get(l4)) : null);
                    sb3.append("</blockquote>");
                    i17 = i10;
                    i18 = i15;
                } else {
                    if (x3.y3(aVar)) {
                        d4Var2.c(sb3);
                        a aVar3 = (a) list3.get(iArr[0]);
                        sb3.append(((TL_iv.pageBlockDetails) aVar3.b).open ? "<details open>" : "<details>");
                        sb3.append("<summary>");
                        g(sb3, K(aVar3, iArr[0], i11, i12, i13, i14));
                        sb3.append("</summary>");
                        iArr[0] = iArr[0] + 1;
                        d4 d4Var4 = new d4();
                        F(sb3, list3, iArr, i10, i11, i12, i13, i14, d4Var4, true, i15, map);
                        list2 = list3;
                        i16 = i10;
                        d4Var4.c(sb3);
                        int i22 = iArr[0];
                        if (i22 <= i16 && i22 < list2.size() && ((a) list2.get(iArr[0])).i) {
                            iArr[0] = iArr[0] + 1;
                        }
                        sb3.append("</details>");
                    } else {
                        i16 = i10;
                        list2 = list3;
                        boolean z12 = true;
                        if (aVar.c <= 0 || l(aVar.b) == null) {
                            d4Var2.c(sb3);
                            int i23 = iArr[0];
                            TL_iv.PageBlock pageBlock = aVar.b;
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                sb3.append("<hr>");
                            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                                sb3.append("<div class=\"button-row\"");
                                if (pageblockbuttonrow.align_left) {
                                    sb3.append(" data-align=\"left\"");
                                } else if (pageblockbuttonrow.align_center) {
                                    sb3.append(" data-align=\"center\"");
                                } else if (pageblockbuttonrow.align_right) {
                                    sb3.append(" data-align=\"right\"");
                                } else {
                                    sb3.append(" data-align=\"fill\"");
                                }
                                sb3.append(">");
                                ArrayList<TL_keyboard.PageButton> arrayList2 = pageblockbuttonrow.buttons;
                                if (arrayList2 != null) {
                                    int size = arrayList2.size();
                                    int i24 = 0;
                                    while (i24 < size) {
                                        TL_keyboard.PageButton pageButton = arrayList2.get(i24);
                                        i24++;
                                        TL_keyboard.PageButton pageButton2 = pageButton;
                                        if (pageButton2 != null) {
                                            d(sb3, pageButton2.text, pageButton2.type, pageButton2.style);
                                        }
                                    }
                                }
                                sb3.append("</div>");
                            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                                H(sb3, (TL_iv.pageBlockTable) pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                                G(sb3, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, aVar.g, pageBlock);
                                sb3 = sb2;
                            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                                sb3 = sb2;
                                G(sb3, MediaStreamTrack.VIDEO_TRACK_KIND, ((TL_iv.pageBlockVideo) pageBlock).video_id, aVar.g, pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                                sb3 = sb2;
                                G(sb3, MediaStreamTrack.AUDIO_TRACK_KIND, ((TL_iv.pageBlockAudio) pageBlock).audio_id, aVar.g, pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                                sb3 = sb2;
                                G(sb3, "document", ((TL_iv.pageBlockDocument) pageBlock).document_id, aVar.g, pageBlock);
                            } else {
                                sb3 = sb2;
                                String str3 = "<figcaption>";
                                if (x3.C3(pageBlock)) {
                                    String str4 = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
                                    sb3.append("<div class=\"");
                                    sb3.append(str4);
                                    sb3.append("\">");
                                    ArrayList h32 = x3.h3(pageBlock);
                                    if (h32 != null) {
                                        int i25 = 0;
                                        while (i25 < h32.size()) {
                                            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) h32.get(i25);
                                            ArrayList arrayList3 = aVar.h;
                                            u uVar = (arrayList3 == null || i25 >= arrayList3.size()) ? null : (u) aVar.h.get(i25);
                                            if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                                                z11 = z12;
                                                long j3 = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                                                if (j3 != 0) {
                                                    str = str3;
                                                    i(sb3, MediaStreamTrack.VIDEO_TRACK_KIND, j3, uVar, pageBlock2);
                                                } else {
                                                    str = str3;
                                                }
                                            } else {
                                                z11 = z12;
                                                str = str3;
                                                if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                                                    long j10 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                                                    if (j10 != 0) {
                                                        sb3 = sb2;
                                                        i(sb3, "img", j10, uVar, pageBlock2);
                                                        i25++;
                                                        str3 = str;
                                                        z12 = z11;
                                                    }
                                                }
                                            }
                                            sb3 = sb2;
                                            i25++;
                                            str3 = str;
                                            z12 = z11;
                                        }
                                    }
                                    String str5 = str3;
                                    SpannableStringBuilder o9 = o(pageBlock);
                                    if (o9 != null && o9.length() > 0) {
                                        sb3.append(str5);
                                        g(sb3, o9);
                                        sb3.append("</figcaption>");
                                    }
                                    sb3.append("</div>");
                                } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                                    SpannableStringBuilder o10 = o(pageblockmap);
                                    boolean z13 = o10 != null && o10.length() > 0;
                                    if (z13) {
                                        sb3.append("<figure>");
                                    }
                                    sb3.append("<location");
                                    if (pageblockmap.geo != null) {
                                        sb3.append(" lat=\"");
                                        sb3.append(pageblockmap.geo.lat);
                                        sb3.append('\"');
                                        sb3.append(" long=\"");
                                        sb3.append(pageblockmap.geo._long);
                                        sb3.append('\"');
                                        if (pageblockmap.geo.access_hash != 0) {
                                            sb3.append(" access=\"");
                                            sb3.append(pageblockmap.geo.access_hash);
                                            sb3.append('\"');
                                        }
                                    }
                                    if (pageblockmap.zoom != 0) {
                                        sb3.append(" zoom=\"");
                                        sb3.append(pageblockmap.zoom);
                                        sb3.append('\"');
                                    }
                                    if (pageblockmap.w != 0) {
                                        sb3.append(" w=\"");
                                        sb3.append(pageblockmap.w);
                                        sb3.append('\"');
                                    }
                                    if (pageblockmap.h != 0) {
                                        sb3.append(" h=\"");
                                        sb3.append(pageblockmap.h);
                                        sb3.append('\"');
                                    }
                                    sb3.append(" />");
                                    if (z13) {
                                        sb3.append("<figcaption>");
                                        g(sb3, o10);
                                        sb3.append("</figcaption></figure>");
                                    }
                                } else {
                                    String l10 = l(pageBlock);
                                    if (l10 == null) {
                                        SpannableStringBuilder o11 = o(pageBlock);
                                        if (o11 != null && o11.length() > 0) {
                                            sb3.append("<p>");
                                            g(sb3, o11);
                                            sb3.append("</p>");
                                        }
                                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                        String str6 = ((TL_iv.pageBlockPreformatted) pageBlock).language;
                                        if (TextUtils.isEmpty(str6)) {
                                            sb3.append("<pre>");
                                        } else {
                                            sb3.append("<pre language=\"");
                                            sb3.append(s(str6));
                                            sb3.append("\">");
                                        }
                                        g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                        sb3.append("</pre>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                                        sb3.append("<blockquote class=\"pull\">");
                                        g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                        c(sb3, k(((TL_iv.pageBlockPullquote) pageBlock).caption));
                                        sb3.append("</blockquote>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                                        if (pageblockblockquote.collapsed) {
                                            sb3.append("<blockquote collapsed>");
                                        } else {
                                            sb3.append("<blockquote>");
                                        }
                                        g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                        c(sb3, k(pageblockblockquote.caption));
                                        sb3.append("</blockquote>");
                                    } else {
                                        sb3.append('<');
                                        sb3.append(l10);
                                        sb3.append('>');
                                        g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                        sb3.append("</");
                                        sb3.append(l10);
                                        sb3.append('>');
                                    }
                                }
                                iArr[0] = iArr[0] + 1;
                                d4Var2 = d4Var;
                            }
                            iArr[0] = iArr[0] + 1;
                            d4Var2 = d4Var;
                        } else {
                            int i26 = aVar.c;
                            boolean z14 = aVar.d > 0;
                            while (arrayList.size() > i26) {
                                d4Var2.b(sb3);
                            }
                            while (true) {
                                str2 = "<ul>";
                                if (arrayList.size() >= i26) {
                                    break;
                                }
                                if (z14) {
                                    str2 = "<ol>";
                                }
                                sb3.append(str2);
                                arrayList.add(Boolean.valueOf(z14));
                            }
                            if (!arrayList.isEmpty() && ((Boolean) hg.c.g(1, arrayList)).booleanValue() != z14) {
                                d4Var2.b(sb3);
                                sb3.append(z14 ? "<ol>" : "<ul>");
                                arrayList.add(Boolean.valueOf(z14));
                            }
                            sb3.append("<li>");
                            g(sb3, K(aVar, iArr[0], i11, i12, i13, i14));
                            sb3.append("</li>");
                            iArr[0] = iArr[0] + 1;
                        }
                    }
                    i18 = i15;
                    list3 = list2;
                    i17 = i16;
                }
            } else if (z10) {
                return;
            } else {
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    public static void G(StringBuilder sb2, String str, long j3, u uVar, TL_iv.PageBlock pageBlock) {
        if (j3 == 0) {
            return;
        }
        SpannableStringBuilder o9 = o(pageBlock);
        boolean z10 = o9 != null && o9.length() > 0;
        if (z10) {
            sb2.append("<figure>");
        }
        i(sb2, str, j3, uVar, pageBlock);
        if (z10) {
            sb2.append("<figcaption>");
            g(sb2, o9);
            sb2.append("</figcaption></figure>");
        }
    }

    public static void H(StringBuilder sb2, TL_iv.pageBlockTable pageblocktable) {
        ArrayList<TL_iv.pageTableCell> arrayList;
        sb2.append("<table");
        if (pageblocktable.bordered) {
            sb2.append(" border=\"1\"");
        }
        if (pageblocktable.striped || pageblocktable.compact) {
            sb2.append(" class=\"");
            if (pageblocktable.striped) {
                sb2.append("striped");
            }
            if (pageblocktable.striped && pageblocktable.compact) {
                sb2.append(' ');
            }
            if (pageblocktable.compact) {
                sb2.append("compact");
            }
            sb2.append('\"');
        }
        sb2.append('>');
        TL_iv.RichText richText = pageblocktable.title;
        SpannableStringBuilder r10 = richText != null ? h6.r(richText, null, true) : null;
        if (r10 != null && r10.length() > 0) {
            sb2.append("<caption>");
            g(sb2, r10);
            sb2.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i10);
                i10++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                sb2.append("<tr>");
                if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_iv.pageTableCell pagetablecell = arrayList.get(i11);
                        i11++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null) {
                            String str = pagetablecell2.header ? "th" : "td";
                            sb2.append('<');
                            sb2.append(str);
                            int i12 = pagetablecell2.colspan;
                            if (i12 <= 1) {
                                i12 = 0;
                            }
                            if (i12 > 0) {
                                sb2.append(" colspan=\"");
                                sb2.append(i12);
                                sb2.append('\"');
                            }
                            int i13 = pagetablecell2.rowspan;
                            if (i13 <= 1) {
                                i13 = 0;
                            }
                            if (i13 > 0) {
                                sb2.append(" rowspan=\"");
                                sb2.append(i13);
                                sb2.append('\"');
                            }
                            String str2 = pagetablecell2.align_right ? "right" : pagetablecell2.align_center ? "center" : null;
                            if (str2 != null) {
                                sb2.append(" align=\"");
                                sb2.append(str2);
                                sb2.append('\"');
                            }
                            String str3 = pagetablecell2.valign_bottom ? "bottom" : pagetablecell2.valign_middle ? "middle" : null;
                            if (str3 != null) {
                                sb2.append(" valign=\"");
                                sb2.append(str3);
                                sb2.append('\"');
                            }
                            sb2.append('>');
                            g(sb2, j6.h(pagetablecell2));
                            sb2.append("</");
                            sb2.append(str);
                            sb2.append('>');
                        }
                    }
                }
                sb2.append("</tr>");
            }
        }
        sb2.append("</table>");
    }

    public static void I(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = h6.f(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static void J(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static CharSequence K(a aVar, int i10, int i11, int i12, int i13, int i14) {
        CharSequence r10 = x3.y3(aVar) ? h6.r(((TL_iv.pageBlockDetails) aVar.b).title, null, true) : f6.A(aVar.b);
        if (r10 == null) {
            r10 = "";
        }
        int length = r10.length();
        int max = i10 == i11 ? Math.max(0, Math.min(i13, length)) : 0;
        int max2 = i10 == i12 ? Math.max(0, Math.min(i14, length)) : length;
        if (max > max2) {
            int i15 = max;
            max = max2;
            max2 = i15;
        }
        return (max == 0 && max2 == length) ? r10 : r10.subSequence(max, max2);
    }

    public static CharSequence L(SpannableStringBuilder spannableStringBuilder) {
        char charAt;
        int length = spannableStringBuilder.length();
        int i10 = 0;
        while (i10 < length && ((charAt = spannableStringBuilder.charAt(i10)) == ' ' || charAt == '\n' || charAt == '\t' || charAt == '\r')) {
            i10++;
        }
        while (length > i10) {
            char charAt2 = spannableStringBuilder.charAt(length - 1);
            if (charAt2 != ' ' && charAt2 != '\n' && charAt2 != '\t' && charAt2 != '\r') {
                break;
            }
            length--;
        }
        return (i10 == 0 && length == spannableStringBuilder.length()) ? spannableStringBuilder : spannableStringBuilder.subSequence(i10, length);
    }

    public static void a(a aVar, ArrayList arrayList) {
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public static void b(ArrayList arrayList, TL_iv.PageBlock pageBlock, e4 e4Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, e4Var, 0, null, 0L);
        f6.d(pageBlock, L(spannableStringBuilder));
        arrayList.add(new a(pageBlock, 0, 0));
    }

    public static void c(StringBuilder sb2, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null || spannableStringBuilder.length() == 0) {
            return;
        }
        sb2.append("<cite>");
        g(sb2, spannableStringBuilder);
        sb2.append("</cite>");
    }

    public static void d(StringBuilder sb2, TL_iv.RichText richText, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle) {
        if (m4.c(inlineButtonType)) {
            sb2.append("<button");
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                sb2.append(" data-type=\"url\" data-url=\"");
                sb2.append(s(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url));
                sb2.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                sb2.append(" data-type=\"copy\" data-copy-text=\"");
                sb2.append(s(((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text));
                sb2.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                sb2.append(" data-type=\"user-profile\" data-user-id=\"");
                sb2.append(((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id);
                sb2.append("\"");
            }
            if (richButtonStyle != null) {
                String str = richButtonStyle.bg_primary ? "primary" : richButtonStyle.bg_danger ? "danger" : richButtonStyle.bg_success ? "success" : "default";
                sb2.append(" data-style=\"");
                sb2.append(str);
                sb2.append("\"");
            }
            sb2.append(">");
            g(sb2, h6.r(richText, null, true));
            sb2.append("</button>");
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, e4 e4Var, int i10, String str, long j3) {
        SpannableStringBuilder spannableStringBuilder2;
        int i11;
        String str2;
        long j10;
        ArrayList arrayList = e4Var.e;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            e4 e4Var2 = (e4) obj;
            if (e4Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                i11 = i10;
                str2 = str;
                j10 = j3;
                j(spannableStringBuilder2, q(e4Var2.c), i11, str2, j10);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                i11 = i10;
                str2 = str;
                j10 = j3;
                h(spannableStringBuilder2, e4Var2, i11, str2, j10);
            }
            spannableStringBuilder = spannableStringBuilder2;
            i10 = i11;
            str = str2;
            j3 = j10;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, e4 e4Var) {
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList = e4Var.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e4 e4Var2 = (e4) obj;
            if (e4Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                j(spannableStringBuilder2, q(e4Var2.c), 0, null, 0L);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                if (!"cite".equals(e4Var2.a)) {
                    h(spannableStringBuilder2, e4Var2, 0, null, 0L);
                }
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(StringBuilder sb2, CharSequence charSequence) {
        int i10;
        m4 m4Var;
        long j3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        int i22 = 0;
        if (!(charSequence instanceof Spanned)) {
            r(sb2, charSequence, 0, charSequence.length());
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        int length = charSequence.length();
        int i23 = 0;
        while (i23 < length) {
            m4[] m4VarArr = (m4[]) spanned.getSpans(i23, Math.min(length, i23 + 1), m4.class);
            int length2 = m4VarArr.length;
            int i24 = i22;
            while (true) {
                if (i24 >= length2) {
                    i10 = -1;
                    m4Var = null;
                    break;
                }
                m4Var = m4VarArr[i24];
                int spanStart = spanned.getSpanStart(m4Var);
                i10 = spanned.getSpanEnd(m4Var);
                if (spanStart <= i23 && i10 > i23) {
                    break;
                } else {
                    i24++;
                }
            }
            if (m4Var != null) {
                TL_iv.textButton textbutton = m4Var.a;
                if (textbutton != null && m4.c(textbutton.type)) {
                    d(sb2, textbutton.text, textbutton.type, textbutton.style);
                }
                i23 = Math.min(length, i10);
            } else {
                int nextSpanTransition = spanned.nextSpanTransition(i23, length, CharacterStyle.class);
                u11[] u11VarArr = (u11[]) spanned.getSpans(i23, nextSpanTransition, u11.class);
                int length3 = u11VarArr.length;
                int i25 = i22;
                int i26 = i25;
                while (i25 < length3) {
                    t11 t11Var = u11VarArr[i25].b;
                    if (t11Var != null) {
                        i26 |= t11Var.a;
                    }
                    i25++;
                }
                v61[] v61VarArr = (v61[]) spanned.getSpans(i23, nextSpanTransition, v61.class);
                String url = v61VarArr.length > 0 ? v61VarArr[i22].getURL() : null;
                org.telegram.ui.Components.b6[] b6VarArr = (org.telegram.ui.Components.b6[]) spanned.getSpans(i23, nextSpanTransition, org.telegram.ui.Components.b6.class);
                if (b6VarArr.length > 0) {
                    org.telegram.ui.Components.b6 b6Var = b6VarArr[i22];
                    if (!b6Var.standard) {
                        j3 = b6Var.getDocumentId();
                        i11 = i26 & 256;
                        if (i11 != 0) {
                            sb2.append("<spoiler>");
                        }
                        i12 = i26 & 1;
                        if (i12 != 0) {
                            sb2.append("<b>");
                        }
                        i13 = i26 & 2;
                        if (i13 != 0) {
                            sb2.append("<i>");
                        }
                        i14 = i26 & 16;
                        if (i14 != 0) {
                            sb2.append("<u>");
                        }
                        i15 = i26 & 8;
                        if (i15 != 0) {
                            sb2.append("<s>");
                        }
                        i16 = i26 & 4;
                        Spanned spanned2 = spanned;
                        if (i16 != 0) {
                            sb2.append("<code>");
                        }
                        i17 = i26 & 16384;
                        if (i17 != 0) {
                            sb2.append("<sub>");
                        }
                        i18 = 32768 & i26;
                        if (i18 != 0) {
                            sb2.append("<sup>");
                        }
                        i19 = 65536 & i26;
                        if (i19 != 0) {
                            sb2.append("<mark>");
                        }
                        if (url != null) {
                            sb2.append("<a href=\"");
                            sb2.append(s(url));
                            sb2.append("\">");
                        }
                        i20 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        if (i20 == 0) {
                            i21 = i20;
                            sb2.append("<animated-emoji data-document-id=\"");
                            sb2.append(j3);
                            sb2.append("\">");
                        } else {
                            i21 = i20;
                        }
                        r(sb2, charSequence, i23, nextSpanTransition);
                        if (i21 != 0) {
                            sb2.append("</animated-emoji>");
                        }
                        if (url != null) {
                            sb2.append("</a>");
                        }
                        if (i19 != 0) {
                            sb2.append("</mark>");
                        }
                        if (i18 != 0) {
                            sb2.append("</sup>");
                        }
                        if (i17 != 0) {
                            sb2.append("</sub>");
                        }
                        if (i16 != 0) {
                            sb2.append("</code>");
                        }
                        if (i15 != 0) {
                            sb2.append("</s>");
                        }
                        if (i14 != 0) {
                            sb2.append("</u>");
                        }
                        if (i13 != 0) {
                            sb2.append("</i>");
                        }
                        if (i12 != 0) {
                            sb2.append("</b>");
                        }
                        if (i11 != 0) {
                            sb2.append("</spoiler>");
                        }
                        i23 = nextSpanTransition;
                        spanned = spanned2;
                        i22 = 0;
                    }
                }
                j3 = 0;
                i11 = i26 & 256;
                if (i11 != 0) {
                }
                i12 = i26 & 1;
                if (i12 != 0) {
                }
                i13 = i26 & 2;
                if (i13 != 0) {
                }
                i14 = i26 & 16;
                if (i14 != 0) {
                }
                i15 = i26 & 8;
                if (i15 != 0) {
                }
                i16 = i26 & 4;
                Spanned spanned22 = spanned;
                if (i16 != 0) {
                }
                i17 = i26 & 16384;
                if (i17 != 0) {
                }
                i18 = 32768 & i26;
                if (i18 != 0) {
                }
                i19 = 65536 & i26;
                if (i19 != 0) {
                }
                if (url != null) {
                }
                i20 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i20 == 0) {
                }
                r(sb2, charSequence, i23, nextSpanTransition);
                if (i21 != 0) {
                }
                if (url != null) {
                }
                if (i19 != 0) {
                }
                if (i18 != 0) {
                }
                if (i17 != 0) {
                }
                if (i16 != 0) {
                }
                if (i15 != 0) {
                }
                if (i14 != 0) {
                }
                if (i13 != 0) {
                }
                if (i12 != 0) {
                }
                if (i11 != 0) {
                }
                i23 = nextSpanTransition;
                spanned = spanned22;
                i22 = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(SpannableStringBuilder spannableStringBuilder, e4 e4Var, int i10, String str, long j3) {
        int i11;
        String str2;
        int i12;
        long j10;
        TL_keyboard.InlineButtonType v;
        if ("button".equals(e4Var.a) && (v = v(e4Var)) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            e(spannableStringBuilder2, e4Var, i10, str, j3);
            if (spannableStringBuilder2.length() > 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                TL_iv.textButton textbutton = new TL_iv.textButton();
                textbutton.text = h6.f(spannableStringBuilder2);
                textbutton.type = v;
                textbutton.style = u(e4Var);
                spannableStringBuilder.setSpan(new m4(textbutton), length, spannableStringBuilder.length(), 33);
            }
            return;
        }
        String str3 = e4Var.a;
        str3.getClass();
        switch (str3) {
            case "spoiler":
                i11 = i10 | 256;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty() || e4Var.b) {
                    e(spannableStringBuilder, e4Var, i11, str2, j10);
                    break;
                }
                break;
            case "strike":
            case "s":
            case "del":
                i11 = i10 | 8;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, e4Var, i11, str2, j10);
                break;
            case "strong":
            case "b":
                i11 = i10 | 1;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, e4Var, i11, str2, j10);
                break;
            case "a":
                String a2 = e4Var.a("href");
                if (a2 != null) {
                    str2 = a2;
                    i11 = i10;
                    j10 = j3;
                    if (e4Var.e.isEmpty()) {
                    }
                    e(spannableStringBuilder, e4Var, i11, str2, j10);
                    break;
                }
                i11 = i10;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, e4Var, i11, str2, j10);
                break;
            case "i":
            case "em":
                i11 = i10 | 2;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, e4Var, i11, str2, j10);
                break;
            case "u":
                i11 = i10 | 16;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, e4Var, i11, str2, j10);
                break;
            case "br":
                j(spannableStringBuilder, "\n", i10, str, j3);
                break;
            case "tt":
            case "code":
                i11 = i10 | 4;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, e4Var, i11, str2, j10);
                break;
            case "sub":
                i11 = i10 | 16384;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, e4Var, i11, str2, j10);
                break;
            case "sup":
                i12 = 32768;
                i11 = i12 | i10;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, e4Var, i11, str2, j10);
                break;
            case "mark":
                i12 = 65536;
                i11 = i12 | i10;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, e4Var, i11, str2, j10);
                break;
            case "animated-emoji":
                String a10 = e4Var.a("data-document-id");
                if (a10 != null) {
                    try {
                        j10 = Long.parseLong(a10.trim());
                        i11 = i10;
                        str2 = str;
                    } catch (Exception unused) {
                    }
                    if (e4Var.e.isEmpty()) {
                    }
                    e(spannableStringBuilder, e4Var, i11, str2, j10);
                    break;
                }
                i11 = i10;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, e4Var, i11, str2, j10);
                break;
            default:
                i11 = i10;
                str2 = str;
                j10 = j3;
                if (e4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, e4Var, i11, str2, j10);
                break;
        }
    }

    public static void i(StringBuilder sb2, String str, long j3, u uVar, TL_iv.PageBlock pageBlock) {
        sb2.append('<');
        sb2.append(str);
        sb2.append(" src=\"");
        sb2.append(j3);
        sb2.append('\"');
        if (uVar != null) {
            if (uVar.j > 0) {
                sb2.append(" width=\"");
                sb2.append(uVar.j);
                sb2.append('\"');
            }
            if (uVar.k > 0) {
                sb2.append(" height=\"");
                sb2.append(uVar.k);
                sb2.append('\"');
            }
        }
        if ((pageBlock instanceof TL_iv.pageBlockPhoto) && ((TL_iv.pageBlockPhoto) pageBlock).spoiler) {
            sb2.append(" data-spoiler=\"1\"");
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && ((TL_iv.pageBlockVideo) pageBlock).spoiler) {
            sb2.append(" data-spoiler=\"1\"");
        }
        sb2.append(" />");
    }

    public static void j(SpannableStringBuilder spannableStringBuilder, String str, int i10, String str2, long j3) {
        if (str == null || str.length() == 0) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        if (j3 != 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.b6(j3, (Paint.FontMetricsInt) null), length, length2, 33);
        }
        if (i10 != 0) {
            t11 t11Var = new t11();
            t11Var.a = i10 & 114975;
            spannableStringBuilder.setSpan(new u11(t11Var, AndroidUtilities.dp(SharedConfig.fontSize)), length, length2, 33);
        }
        if (str2 != null) {
            spannableStringBuilder.setSpan(h6.k(str2), length, length2, 33);
        }
    }

    public static SpannableStringBuilder k(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return null;
        }
        SpannableStringBuilder r10 = h6.r(richText, null, true);
        if (r10.length() > 0) {
            return r10;
        }
        return null;
    }

    public static String l(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return "h1";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return "h2";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return "h3";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return "h4";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return "h5";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return "h6";
        }
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return "blockquote";
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return "pre";
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return "footer";
        }
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return "p";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a m(e4 e4Var) {
        double parseDouble;
        String a2;
        String str = e4Var.a;
        str.getClass();
        switch (str) {
            case "div":
                String a10 = e4Var.a("class");
                String lowerCase = a10 == null ? "" : a10.toLowerCase();
                if (lowerCase.contains("slideshow")) {
                    return B(e4Var, true);
                }
                if (lowerCase.contains("collage")) {
                    return B(e4Var, false);
                }
                return null;
            case "img":
                return n(e4Var, false);
            case "audio":
                long E = E(e4Var.a("src"));
                if (E <= 0) {
                    return null;
                }
                TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
                pageblockaudio.audio_id = E;
                J(pageblockaudio);
                return new a(pageblockaudio, 0, 0);
            case "video":
                return n(e4Var, true);
            case "document":
                long E2 = E(e4Var.a("src"));
                if (E2 <= 0) {
                    return null;
                }
                TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
                pageblockdocument.document_id = E2;
                J(pageblockdocument);
                return new a(pageblockdocument, 0, 0);
            case "location":
                TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                String a11 = e4Var.a("lat");
                double d = 0.0d;
                if (a11 != null) {
                    try {
                        parseDouble = Double.parseDouble(a11.trim());
                    } catch (Exception unused) {
                    }
                    tL_geoPoint.lat = parseDouble;
                    a2 = e4Var.a("long");
                    if (a2 != null) {
                        try {
                            d = Double.parseDouble(a2.trim());
                        } catch (Exception unused2) {
                        }
                    }
                    tL_geoPoint._long = d;
                    tL_geoPoint.access_hash = E(e4Var.a("access"));
                    pageblockmap.geo = tL_geoPoint;
                    pageblockmap.zoom = C(15, e4Var.a("zoom"));
                    pageblockmap.w = C(600, e4Var.a("w"));
                    pageblockmap.h = C(400, e4Var.a("h"));
                    J(pageblockmap);
                    return new a(pageblockmap, 0, 0);
                }
                parseDouble = 0.0d;
                tL_geoPoint.lat = parseDouble;
                a2 = e4Var.a("long");
                if (a2 != null) {
                }
                tL_geoPoint._long = d;
                tL_geoPoint.access_hash = E(e4Var.a("access"));
                pageblockmap.geo = tL_geoPoint;
                pageblockmap.zoom = C(15, e4Var.a("zoom"));
                pageblockmap.w = C(600, e4Var.a("w"));
                pageblockmap.h = C(400, e4Var.a("h"));
                J(pageblockmap);
                return new a(pageblockmap, 0, 0);
            default:
                return null;
        }
    }

    public static a n(e4 e4Var, boolean z10) {
        long E = E(e4Var.a("src"));
        if (E <= 0) {
            return null;
        }
        TL_iv.PageBlock y3 = y(E, z10, e4Var.b("data-spoiler"));
        J(y3);
        return new a(y3, 0, 0);
    }

    public static SpannableStringBuilder o(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        if (pageBlock != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            SpannableStringBuilder r10 = h6.r(richText, null, true);
            if (r10.length() > 0) {
                return r10;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static void p(e4 e4Var, TL_iv.pageBlockTable pageblocktable) {
        String lowerCase;
        int indexOf;
        ArrayList arrayList = e4Var.e;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            e4 e4Var2 = (e4) obj;
            if (!e4Var2.b) {
                String str = e4Var2.a;
                str.getClass();
                int i12 = -1;
                switch (str.hashCode()) {
                    case 3710:
                        if (str.equals("tr")) {
                            i12 = i10;
                            break;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            i12 = 1;
                            break;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            i12 = 2;
                            break;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            i12 = 3;
                            break;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            i12 = 4;
                            break;
                        }
                        break;
                }
                switch (i12) {
                    case 0:
                        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        pagetablerow.cells = new ArrayList<>();
                        ArrayList arrayList3 = e4Var2.e;
                        int size2 = arrayList3.size();
                        int i13 = i10;
                        while (i13 < size2) {
                            Object obj2 = arrayList3.get(i13);
                            i13++;
                            e4 e4Var3 = (e4) obj2;
                            if (!e4Var3.b) {
                                if ("td".equals(e4Var3.a) || "th".equals(e4Var3.a)) {
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    pagetablecell.colspan = C(i10, e4Var3.a("colspan"));
                                    pagetablecell.rowspan = C(i10, e4Var3.a("rowspan"));
                                    j6.d(pagetablecell, w(e4Var3));
                                    j6.l(pagetablecell, ("th".equals(e4Var3.a) || e4Var3.b("header")) ? 1 : i10);
                                    String a2 = e4Var3.a("align");
                                    if (a2 == null) {
                                        String a10 = e4Var3.a("style");
                                        if (a10 != null && (indexOf = (lowerCase = a10.toLowerCase()).indexOf("text-align")) >= 0) {
                                            if (lowerCase.indexOf("center", indexOf) >= 0) {
                                                a2 = "center";
                                            } else if (lowerCase.indexOf("right", indexOf) >= 0) {
                                                a2 = "right";
                                            }
                                        }
                                        a2 = null;
                                    }
                                    if ("center".equalsIgnoreCase(a2)) {
                                        j6.k(pagetablecell, 1);
                                    } else if ("right".equalsIgnoreCase(a2)) {
                                        j6.k(pagetablecell, 2);
                                    }
                                    String a11 = e4Var3.a("valign");
                                    if ("middle".equalsIgnoreCase(a11)) {
                                        j6.m(pagetablecell, 1);
                                    } else if ("bottom".equalsIgnoreCase(a11)) {
                                        j6.m(pagetablecell, 2);
                                        pagetablerow.cells.add(pagetablecell);
                                    }
                                    pagetablerow.cells.add(pagetablecell);
                                }
                            }
                            i10 = 0;
                        }
                        if (pagetablerow.cells.isEmpty()) {
                            pagetablerow.cells.add(j6.f());
                        }
                        arrayList2.add(pagetablerow);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        p(e4Var2, pageblocktable);
                        break;
                    case 4:
                        pageblocktable.title = h6.f(w(e4Var2));
                        break;
                }
                i10 = 0;
            }
        }
    }

    public static String q(String str) {
        String substring;
        String str2;
        int parseInt;
        if (str == null) {
            return "";
        }
        if (str.indexOf(38) < 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int i10 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt != '&') {
                sb2.append(charAt);
            } else {
                int i11 = i10 + 1;
                int indexOf = str.indexOf(59, i11);
                if (indexOf < 0 || indexOf - i10 > 12) {
                    sb2.append(charAt);
                } else {
                    substring = str.substring(i11, indexOf);
                    substring.getClass();
                    switch (substring) {
                        case "gt":
                            str2 = ">";
                            break;
                        case "lt":
                            str2 = "<";
                            break;
                        case "amp":
                            str2 = "&";
                            break;
                        case "apos":
                            str2 = "'";
                            break;
                        case "nbsp":
                            str2 = " ";
                            break;
                        case "quot":
                            str2 = "\"";
                            break;
                        default:
                            str2 = null;
                            if (substring.length() > 1 && substring.charAt(0) == '#') {
                                try {
                                    if (substring.charAt(1) != 'x' && substring.charAt(1) != 'X') {
                                        parseInt = Integer.parseInt(substring.substring(1));
                                        str2 = new String(Character.toChars(parseInt));
                                        break;
                                    }
                                    parseInt = Integer.parseInt(substring.substring(2), 16);
                                    str2 = new String(Character.toChars(parseInt));
                                } catch (Exception unused) {
                                    break;
                                }
                            }
                            break;
                    }
                    if (str2 != null) {
                        sb2.append(str2);
                        i10 = indexOf;
                    } else {
                        sb2.append(charAt);
                    }
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    public static void r(StringBuilder sb2, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '\n') {
                sb2.append("<br>");
            } else if (charAt == '<') {
                sb2.append("&lt;");
            } else if (charAt == '>') {
                sb2.append("&gt;");
            } else if (charAt == '&') {
                sb2.append("&amp;");
            } else {
                sb2.append(charAt);
            }
            i10++;
        }
    }

    public static String s(String str) {
        return str == null ? "" : str.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static void t(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null || x(spannableStringBuilder.toString())) {
            return;
        }
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = h6.f(L(spannableStringBuilder));
        arrayList.add(new a(pageblockparagraph, 0, 0));
    }

    public static TL_keyboard.RichButtonStyle u(e4 e4Var) {
        TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
        String a2 = e4Var.a("data-style");
        richButtonStyle.bg_primary = "primary".equals(a2);
        richButtonStyle.bg_danger = "danger".equals(a2);
        richButtonStyle.bg_success = "success".equals(a2);
        return richButtonStyle;
    }

    public static TL_keyboard.InlineButtonType v(e4 e4Var) {
        String a2 = e4Var.a("data-type");
        if ("url".equals(a2)) {
            String a10 = e4Var.a("data-url");
            if (TextUtils.isEmpty(a10)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
            tL_inlineButtonTypeUrl.url = a10;
            return tL_inlineButtonTypeUrl;
        }
        if ("copy".equals(a2)) {
            String a11 = e4Var.a("data-copy-text");
            if (TextUtils.isEmpty(a11)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
            tL_inlineButtonTypeCopy.copy_text = a11;
            return tL_inlineButtonTypeCopy;
        }
        if (!"user-profile".equals(a2)) {
            return null;
        }
        long E = E(e4Var.a("data-user-id"));
        if (E <= 0) {
            return null;
        }
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = E;
        return tL_inlineButtonTypeUserProfile;
    }

    public static CharSequence w(e4 e4Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, e4Var, 0, null, 0L);
        return L(spannableStringBuilder);
    }

    public static boolean x(String str) {
        if (str == null) {
            return true;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\t' && charAt != '\r' && charAt != 160) {
                return false;
            }
        }
        return true;
    }

    public static TL_iv.PageBlock y(long j3, boolean z10, boolean z11) {
        if (z10) {
            TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
            if (j3 <= 0) {
                j3 = 0;
            }
            pageblockvideo.video_id = j3;
            pageblockvideo.spoiler = z11;
            return pageblockvideo;
        }
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        if (j3 <= 0) {
            j3 = 0;
        }
        pageblockphoto.photo_id = j3;
        pageblockphoto.spoiler = z11;
        return pageblockphoto;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02b4, code lost:
    
        if (r5.equals("hr") == false) goto L157;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList z(String str, HashMap hashMap) {
        int indexOf;
        char c10;
        int i10;
        String str2;
        int i11;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            while (true) {
                if (i12 < str.length()) {
                    char c11 = 1;
                    if (str.charAt(i12) != '<') {
                        indexOf = str.indexOf(60, i12);
                        if (indexOf < 0) {
                            indexOf = str.length();
                        }
                        String substring = str.substring(i12, indexOf);
                        if (!substring.isEmpty()) {
                            e4 e4Var = new e4();
                            e4Var.b = true;
                            e4Var.c = substring;
                            if (arrayList3.isEmpty()) {
                                arrayList2.add(e4Var);
                            } else {
                                ((e4) hg.c.g(1, arrayList3)).e.add(e4Var);
                            }
                        }
                    } else if (str.startsWith("<!--", i12)) {
                        int indexOf2 = str.indexOf("-->", i12 + 4);
                        i12 = indexOf2 < 0 ? str.length() : indexOf2 + 3;
                    } else if (i12 + 1 < str.length() && str.charAt(i12 + 1) == '!') {
                        int indexOf3 = str.indexOf(62, i12);
                        i12 = indexOf3 < 0 ? str.length() : indexOf3 + 1;
                    } else if (i12 + 1 >= str.length() || str.charAt(i12 + 1) != '/') {
                        int i13 = i12 + 1;
                        boolean z10 = false;
                        char c12 = 0;
                        while (true) {
                            c10 = '\'';
                            if (i13 < str.length()) {
                                char charAt = str.charAt(i13);
                                if (z10) {
                                    if (charAt == c12) {
                                        z10 = false;
                                    }
                                } else if (charAt == '\"' || charAt == '\'') {
                                    z10 = true;
                                    c12 = charAt;
                                } else if (charAt == '>') {
                                }
                                i13++;
                            } else {
                                i13 = -1;
                            }
                        }
                        if (i13 >= 0) {
                            String substring2 = str.substring(i12 + 1, i13);
                            indexOf = i13 + 1;
                            boolean endsWith = substring2.endsWith("/");
                            if (endsWith) {
                                substring2 = com.google.android.gms.internal.vision.e2.i(1, 0, substring2);
                            }
                            String trim = substring2.trim();
                            e4 e4Var2 = null;
                            if (!trim.isEmpty()) {
                                int i14 = 0;
                                while (i14 < trim.length() && !p8.a(trim.charAt(i14))) {
                                    i14++;
                                }
                                String lowerCase = trim.substring(0, i14).toLowerCase();
                                if (!lowerCase.isEmpty()) {
                                    e4Var2 = new e4();
                                    e4Var2.a = lowerCase;
                                    while (i14 < trim.length()) {
                                        while (i14 < trim.length() && p8.a(trim.charAt(i14))) {
                                            i14++;
                                        }
                                        if (i14 < trim.length()) {
                                            int i15 = i14;
                                            while (i15 < trim.length() && trim.charAt(i15) != '=' && !p8.a(trim.charAt(i15))) {
                                                i15++;
                                            }
                                            String lowerCase2 = trim.substring(i14, i15).toLowerCase();
                                            while (i15 < trim.length() && p8.a(trim.charAt(i15))) {
                                                i15++;
                                            }
                                            if (i15 >= trim.length() || trim.charAt(i15) != '=') {
                                                i10 = i15;
                                                str2 = "";
                                            } else {
                                                do {
                                                    i15++;
                                                    if (i15 < trim.length()) {
                                                    }
                                                    if (i15 < trim.length() || !(trim.charAt(i15) == '\"' || trim.charAt(i15) == c10)) {
                                                        i11 = i15;
                                                        while (i11 < trim.length() && !p8.a(trim.charAt(i11))) {
                                                            i11++;
                                                        }
                                                        str2 = trim.substring(i15, i11);
                                                        i10 = i11;
                                                    } else {
                                                        char charAt2 = trim.charAt(i15);
                                                        int i16 = i15 + 1;
                                                        i10 = i16;
                                                        while (i10 < trim.length() && trim.charAt(i10) != charAt2) {
                                                            i10++;
                                                        }
                                                        str2 = trim.substring(i16, Math.min(i10, trim.length()));
                                                        if (i10 < trim.length()) {
                                                            i10++;
                                                        }
                                                    }
                                                } while (p8.a(trim.charAt(i15)));
                                                if (i15 < trim.length()) {
                                                }
                                                i11 = i15;
                                                while (i11 < trim.length()) {
                                                    i11++;
                                                }
                                                str2 = trim.substring(i15, i11);
                                                i10 = i11;
                                            }
                                            if (!lowerCase2.isEmpty()) {
                                                if (e4Var2.d == null) {
                                                    e4Var2.d = new HashMap();
                                                }
                                                e4Var2.d.put(lowerCase2, q(str2));
                                            }
                                            i14 = i10;
                                            c10 = '\'';
                                        }
                                    }
                                }
                            }
                            if (e4Var2 != null) {
                                if (arrayList3.isEmpty()) {
                                    arrayList2.add(e4Var2);
                                } else {
                                    ((e4) hg.c.g(1, arrayList3)).e.add(e4Var2);
                                }
                                if (!endsWith) {
                                    String str3 = e4Var2.a;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case 3152:
                                            if (str3.equals("br")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3338:
                                            break;
                                        case 104387:
                                            if (str3.equals("img")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 117511:
                                            if (str3.equals("wbr")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3321850:
                                            if (str3.equals("link")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3347973:
                                            if (str3.equals("meta")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 100358090:
                                            if (str3.equals("input")) {
                                                c11 = 6;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                            break;
                                        default:
                                            arrayList3.add(e4Var2);
                                            break;
                                    }
                                }
                            }
                        } else {
                            String substring3 = str.substring(i12);
                            if (!substring3.isEmpty()) {
                                e4 e4Var3 = new e4();
                                e4Var3.b = true;
                                e4Var3.c = substring3;
                                if (arrayList3.isEmpty()) {
                                    arrayList2.add(e4Var3);
                                } else {
                                    ((e4) hg.c.g(1, arrayList3)).e.add(e4Var3);
                                }
                            }
                        }
                    } else {
                        int indexOf4 = str.indexOf(62, i12);
                        String lowerCase3 = str.substring(i12 + 2, indexOf4 < 0 ? str.length() : indexOf4).trim().toLowerCase();
                        indexOf = indexOf4 < 0 ? str.length() : indexOf4 + 1;
                        int size = arrayList3.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                if (((e4) arrayList3.get(size)).a.equals(lowerCase3)) {
                                    while (arrayList3.size() > size) {
                                        a1.g.y(1, arrayList3);
                                    }
                                } else {
                                    size--;
                                }
                            }
                        }
                    }
                    i12 = indexOf;
                }
            }
            A(arrayList2, arrayList, hashMap);
            if (arrayList.isEmpty()) {
                arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        }
        return arrayList;
    }
}
