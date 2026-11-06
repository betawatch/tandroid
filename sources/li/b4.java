package li;

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
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vy0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public abstract class b4 {
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
        int i7;
        int i10;
        int i11;
        int i12;
        TL_keyboard.InlineButtonType v;
        String str;
        CharSequence w10;
        int i13;
        String str2;
        int i14;
        a4 a4Var;
        CharSequence w11;
        int size = arrayList.size();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            SpannableStringBuilder spannableStringBuilder = null;
            while (i16 < size) {
                Object obj = arrayList.get(i16);
                i16++;
                a4 a4Var2 = (a4) obj;
                boolean z9 = a4Var2.b;
                ArrayList arrayList3 = a4Var2.e;
                if (!z9) {
                    String str3 = a4Var2.a;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -1999048254:
                            if (str3.equals("spoiler")) {
                                i7 = i15;
                                break;
                            }
                            i7 = -1;
                            break;
                        case -1377687758:
                            if (str3.equals("button")) {
                                i7 = 1;
                                break;
                            }
                            i7 = -1;
                            break;
                        case -891985998:
                            if (str3.equals("strike")) {
                                i7 = 2;
                                break;
                            }
                            i7 = -1;
                            break;
                        case -891980137:
                            if (str3.equals("strong")) {
                                i7 = 3;
                                break;
                            }
                            i7 = -1;
                            break;
                        case qs.i1 /* 97 */:
                            if (str3.equals("a")) {
                                i7 = 4;
                                break;
                            }
                            i7 = -1;
                            break;
                        case qs.j1 /* 98 */:
                            if (str3.equals("b")) {
                                i7 = 5;
                                break;
                            }
                            i7 = -1;
                            break;
                        case qs.q1 /* 105 */:
                            if (str3.equals("i")) {
                                i7 = 6;
                                break;
                            }
                            i7 = -1;
                            break;
                        case qs.A1 /* 115 */:
                            if (str3.equals("s")) {
                                i7 = 7;
                                break;
                            }
                            i7 = -1;
                            break;
                        case qs.C1 /* 117 */:
                            if (str3.equals("u")) {
                                i7 = 8;
                                break;
                            }
                            i7 = -1;
                            break;
                        case 3152:
                            if (str3.equals("br")) {
                                i7 = 9;
                                break;
                            }
                            i7 = -1;
                            break;
                        case 3240:
                            if (str3.equals("em")) {
                                i7 = 10;
                                break;
                            }
                            i7 = -1;
                            break;
                        case 3712:
                            if (str3.equals("tt")) {
                                i7 = 11;
                                break;
                            }
                            i7 = -1;
                            break;
                        case 99339:
                            if (str3.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                i7 = 12;
                                break;
                            }
                            i7 = -1;
                            break;
                        case 114240:
                            if (str3.equals("sub")) {
                                i7 = 13;
                                break;
                            }
                            i7 = -1;
                            break;
                        case 114254:
                            if (str3.equals("sup")) {
                                i7 = 14;
                                break;
                            }
                            i7 = -1;
                            break;
                        case 3059181:
                            if (str3.equals("code")) {
                                i7 = 15;
                                break;
                            }
                            i7 = -1;
                            break;
                        case 3148879:
                            if (str3.equals("font")) {
                                i7 = 16;
                                break;
                            }
                            i7 = -1;
                            break;
                        case 3536714:
                            if (str3.equals("span")) {
                                i7 = 17;
                                break;
                            }
                            i7 = -1;
                            break;
                        case 1438365596:
                            if (str3.equals("animated-emoji")) {
                                i7 = 18;
                                break;
                            }
                            i7 = -1;
                            break;
                        default:
                            i7 = -1;
                            break;
                    }
                    switch (i7) {
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
                            int i17 = i15;
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                            h(spannableStringBuilder2, a4Var2, 0, null, 0L);
                            i15 = i17;
                            spannableStringBuilder = spannableStringBuilder2;
                            break;
                        default:
                            t(arrayList2, spannableStringBuilder);
                            switch (str3.hashCode()) {
                                case -1857640538:
                                    if (str3.equals("summary")) {
                                        i10 = i15;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case -1274639644:
                                    if (str3.equals("figure")) {
                                        i10 = 1;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case -1268861541:
                                    if (str3.equals("footer")) {
                                        i10 = 2;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case qs.x1 /* 112 */:
                                    if (str3.equals("p")) {
                                        i10 = 3;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3273:
                                    if (str3.equals("h1")) {
                                        i10 = 4;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3274:
                                    if (str3.equals("h2")) {
                                        i10 = 5;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3275:
                                    if (str3.equals("h3")) {
                                        i10 = 6;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3276:
                                    if (str3.equals("h4")) {
                                        i10 = 7;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3277:
                                    if (str3.equals("h5")) {
                                        i10 = 8;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3278:
                                    if (str3.equals("h6")) {
                                        i10 = 9;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3338:
                                    if (str3.equals("hr")) {
                                        i10 = 10;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3549:
                                    if (str3.equals("ol")) {
                                        i10 = 11;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3696:
                                    if (str3.equals("td")) {
                                        i10 = 12;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3700:
                                    if (str3.equals("th")) {
                                        i10 = 13;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3710:
                                    if (str3.equals("tr")) {
                                        i10 = 14;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 3735:
                                    if (str3.equals("ul")) {
                                        i10 = 15;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 99473:
                                    if (str3.equals("div")) {
                                        i10 = 16;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 104387:
                                    if (str3.equals("img")) {
                                        i10 = 17;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 111267:
                                    if (str3.equals("pre")) {
                                        i10 = 18;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 93166550:
                                    if (str3.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                        i10 = 19;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 110115790:
                                    if (str3.equals("table")) {
                                        i10 = 20;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 110157846:
                                    if (str3.equals("tbody")) {
                                        i10 = 21;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 110326868:
                                    if (str3.equals("thead")) {
                                        i10 = 22;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 112202875:
                                    if (str3.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                        i10 = 23;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 1303202319:
                                    if (str3.equals("blockquote")) {
                                        i10 = 24;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 1557721666:
                                    if (str3.equals("details")) {
                                        i10 = 25;
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                case 1901043637:
                                    if (str3.equals("location")) {
                                        i10 = 26;
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
                                    i11 = i15;
                                    b(arrayList2, new TL_iv.pageBlockParagraph(), a4Var2);
                                    break;
                                case 1:
                                    int size2 = arrayList3.size();
                                    int i18 = 0;
                                    a aVar = null;
                                    CharSequence charSequence = null;
                                    while (i18 < size2) {
                                        Object obj2 = arrayList3.get(i18);
                                        i18++;
                                        a4 a4Var3 = (a4) obj2;
                                        if (!a4Var3.b) {
                                            if ("figcaption".equals(a4Var3.a)) {
                                                charSequence = w(a4Var3);
                                            } else if (aVar == null) {
                                                aVar = m(a4Var3);
                                            }
                                        }
                                    }
                                    if (aVar == null) {
                                        if (charSequence != null && charSequence.length() > 0) {
                                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                            pageblockparagraph.text = c6.f(charSequence);
                                            i11 = 0;
                                            arrayList2.add(new a(pageblockparagraph, 0, 0));
                                            break;
                                        }
                                    } else {
                                        if (charSequence != null && charSequence.length() > 0) {
                                            I(aVar.b, charSequence);
                                        }
                                        arrayList2.add(aVar);
                                    }
                                    i11 = 0;
                                    break;
                                case 2:
                                    b(arrayList2, new TL_iv.pageBlockFooter(), a4Var2);
                                    i11 = 0;
                                    break;
                                case 3:
                                    b(arrayList2, new TL_iv.pageBlockParagraph(), a4Var2);
                                    i11 = 0;
                                    break;
                                case 4:
                                    b(arrayList2, new TL_iv.pageBlockHeading1(), a4Var2);
                                    i11 = 0;
                                    break;
                                case 5:
                                    b(arrayList2, new TL_iv.pageBlockHeading2(), a4Var2);
                                    i11 = 0;
                                    break;
                                case 6:
                                    b(arrayList2, new TL_iv.pageBlockHeading3(), a4Var2);
                                    i11 = 0;
                                    break;
                                case 7:
                                    b(arrayList2, new TL_iv.pageBlockHeading4(), a4Var2);
                                    i11 = 0;
                                    break;
                                case 8:
                                    b(arrayList2, new TL_iv.pageBlockHeading5(), a4Var2);
                                    i11 = 0;
                                    break;
                                case 9:
                                    b(arrayList2, new TL_iv.pageBlockHeading6(), a4Var2);
                                    i11 = 0;
                                    break;
                                case 10:
                                    int i19 = i15;
                                    arrayList2.add(new a(new TL_iv.pageBlockDivider(), i19, i19));
                                    i11 = 0;
                                    break;
                                case 11:
                                case 15:
                                    i12 = 0;
                                    D(a4Var2, arrayList2, 0, "ol".equals(str3));
                                    i11 = i12;
                                    break;
                                case 12:
                                case 13:
                                case 14:
                                case 21:
                                case 22:
                                    A(arrayList3, arrayList2, map);
                                    i11 = 0;
                                    break;
                                case 16:
                                    String a10 = a4Var2.a("class");
                                    String lowerCase = a10 == null ? "" : a10.toLowerCase();
                                    if (!lowerCase.contains("button-row")) {
                                        if (lowerCase.contains("collage")) {
                                            a(arrayList2, B(a4Var2, false));
                                        } else if (lowerCase.contains("slideshow")) {
                                            a(arrayList2, B(a4Var2, true));
                                        } else {
                                            b(arrayList2, new TL_iv.pageBlockParagraph(), a4Var2);
                                        }
                                        i11 = 0;
                                        break;
                                    } else {
                                        TL_iv.pageBlockButtonRow pageblockbuttonrow = new TL_iv.pageBlockButtonRow();
                                        String a11 = a4Var2.a("data-align");
                                        pageblockbuttonrow.align_left = "left".equalsIgnoreCase(a11);
                                        pageblockbuttonrow.align_center = "center".equalsIgnoreCase(a11);
                                        pageblockbuttonrow.align_right = "right".equalsIgnoreCase(a11);
                                        int size3 = arrayList3.size();
                                        int i20 = 0;
                                        while (i20 < size3) {
                                            Object obj3 = arrayList3.get(i20);
                                            i20++;
                                            a4 a4Var4 = (a4) obj3;
                                            if (pageblockbuttonrow.buttons.size() >= 8) {
                                                i12 = 0;
                                                arrayList2.add(new a(pageblockbuttonrow, 0, 0));
                                                i11 = i12;
                                                break;
                                            } else if (!a4Var4.b && "button".equals(a4Var4.a) && (v = v(a4Var4)) != null) {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                e(spannableStringBuilder3, a4Var4, 0, null, 0L);
                                                CharSequence L = L(spannableStringBuilder3);
                                                if (L.length() != 0) {
                                                    TL_keyboard.PageButton pageButton = new TL_keyboard.PageButton();
                                                    pageButton.text = c6.f(L);
                                                    pageButton.type = v;
                                                    pageButton.style = u(a4Var4);
                                                    pageblockbuttonrow.buttons.add(pageButton);
                                                }
                                            }
                                        }
                                        i12 = 0;
                                        arrayList2.add(new a(pageblockbuttonrow, 0, 0));
                                        i11 = i12;
                                    }
                                    break;
                                case 17:
                                    a(arrayList2, m(a4Var2));
                                    i11 = 0;
                                    break;
                                case 18:
                                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                                    String[] strArr = {"language", "lang", "lng"};
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= 3) {
                                            str = null;
                                        } else {
                                            str = a4Var2.a(strArr[i21]);
                                            if (str == null) {
                                                i21++;
                                            }
                                        }
                                    }
                                    pageblockpreformatted.language = str;
                                    b(arrayList2, pageblockpreformatted, a4Var2);
                                    i11 = 0;
                                    break;
                                case 19:
                                    a(arrayList2, m(a4Var2));
                                    i11 = 0;
                                    break;
                                case 20:
                                    TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
                                    pageblocktable.title = new TL_iv.textEmpty();
                                    pageblocktable.rows = new ArrayList<>();
                                    pageblocktable.bordered = a4Var2.b("border");
                                    String a12 = a4Var2.a("class");
                                    pageblocktable.striped = a12 != null && a12.toLowerCase().contains("striped");
                                    pageblocktable.compact = a12 != null && a12.toLowerCase().contains("compact");
                                    p(a4Var2, pageblocktable);
                                    if (pageblocktable.rows.isEmpty()) {
                                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                                        ArrayList<TL_iv.pageTableCell> arrayList4 = new ArrayList<>();
                                        pagetablerow.cells = arrayList4;
                                        arrayList4.add(e6.f());
                                        pageblocktable.rows.add(pagetablerow);
                                    }
                                    arrayList2.add(new a(pageblocktable, 0, 0));
                                    i11 = 0;
                                    break;
                                case 23:
                                    a(arrayList2, m(a4Var2));
                                    i11 = 0;
                                    break;
                                case 24:
                                    String a13 = a4Var2.a("class");
                                    if (a13 != null && a13.toLowerCase().contains("pull")) {
                                        int size4 = arrayList3.size();
                                        int i22 = i15;
                                        while (true) {
                                            if (i22 < size4) {
                                                Object obj4 = arrayList3.get(i22);
                                                i22++;
                                                a4Var = (a4) obj4;
                                                if (a4Var.b || !"cite".equals(a4Var.a)) {
                                                }
                                            } else {
                                                a4Var = null;
                                            }
                                        }
                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                        f(spannableStringBuilder4, a4Var2);
                                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                                        a6.d(pageblockpullquote, L(spannableStringBuilder4));
                                        TL_iv.RichText f10 = (a4Var == null || (w11 = w(a4Var)) == null || w11.length() == 0) ? null : c6.f(w11);
                                        if (f10 != null) {
                                            pageblockpullquote.caption = f10;
                                        }
                                        arrayList2.add(new a(pageblockpullquote, i15, i15));
                                        i11 = i15;
                                        break;
                                    } else {
                                        int size5 = arrayList3.size();
                                        int i23 = i15;
                                        int i24 = i23;
                                        a4 a4Var5 = null;
                                        while (i23 < size5) {
                                            Object obj5 = arrayList3.get(i23);
                                            i23++;
                                            a4 a4Var6 = (a4) obj5;
                                            if (!a4Var6.b && (str2 = a4Var6.a) != null) {
                                                if (!"cite".equals(str2)) {
                                                    String str4 = a4Var6.a;
                                                    str4.getClass();
                                                    switch (str4.hashCode()) {
                                                        case -1999048254:
                                                            if (str4.equals("spoiler")) {
                                                                i14 = i15;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case -1377687758:
                                                            if (str4.equals("button")) {
                                                                i14 = 1;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case -891985998:
                                                            if (str4.equals("strike")) {
                                                                i14 = 2;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case -891980137:
                                                            if (str4.equals("strong")) {
                                                                i14 = 3;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case qs.i1 /* 97 */:
                                                            if (str4.equals("a")) {
                                                                i14 = 4;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case qs.j1 /* 98 */:
                                                            if (str4.equals("b")) {
                                                                i14 = 5;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case qs.q1 /* 105 */:
                                                            if (str4.equals("i")) {
                                                                i14 = 6;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case qs.A1 /* 115 */:
                                                            if (str4.equals("s")) {
                                                                i14 = 7;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case qs.C1 /* 117 */:
                                                            if (str4.equals("u")) {
                                                                i14 = 8;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case 3152:
                                                            if (str4.equals("br")) {
                                                                i14 = 9;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case 3240:
                                                            if (str4.equals("em")) {
                                                                i14 = 10;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case 3712:
                                                            if (str4.equals("tt")) {
                                                                i14 = 11;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case 99339:
                                                            if (str4.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                                                i14 = 12;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case 114240:
                                                            if (str4.equals("sub")) {
                                                                i14 = 13;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case 114254:
                                                            if (str4.equals("sup")) {
                                                                i14 = 14;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case 3059181:
                                                            if (str4.equals("code")) {
                                                                i14 = 15;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case 3148879:
                                                            if (str4.equals("font")) {
                                                                i14 = 16;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case 3536714:
                                                            if (str4.equals("span")) {
                                                                i14 = 17;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        case 1438365596:
                                                            if (str4.equals("animated-emoji")) {
                                                                i14 = 18;
                                                                break;
                                                            }
                                                            i14 = -1;
                                                            break;
                                                        default:
                                                            i14 = -1;
                                                            break;
                                                    }
                                                    switch (i14) {
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
                                                            i24 = 1;
                                                            break;
                                                    }
                                                } else if (a4Var5 == null) {
                                                    a4Var5 = a4Var6;
                                                }
                                            }
                                        }
                                        TL_iv.RichText f11 = (a4Var5 == null || (w10 = w(a4Var5)) == null || w10.length() == 0) ? null : c6.f(w10);
                                        if (i24 == 0) {
                                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                            f(spannableStringBuilder5, a4Var2);
                                            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                            pageblockblockquote.collapsed = (a4Var2.b("data-collapsed") || a4Var2.b("collapsed")) ? 1 : i15;
                                            a6.d(pageblockblockquote, L(spannableStringBuilder5));
                                            if (f11 != null) {
                                                pageblockblockquote.caption = f11;
                                            }
                                            arrayList2.add(new a(pageblockblockquote, i15, i15));
                                        } else {
                                            long a14 = n0.a();
                                            int size6 = arrayList2.size();
                                            ArrayList arrayList5 = new ArrayList();
                                            int size7 = arrayList3.size();
                                            int i25 = i15;
                                            while (i25 < size7) {
                                                Object obj6 = arrayList3.get(i25);
                                                i25++;
                                                a4 a4Var7 = (a4) obj6;
                                                if (a4Var7.b || !"cite".equals(a4Var7.a)) {
                                                    arrayList5.add(a4Var7);
                                                }
                                            }
                                            A(arrayList5, arrayList2, map);
                                            if (arrayList2.size() == size6) {
                                                i13 = 0;
                                                arrayList2.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                                                while (size6 < arrayList2.size()) {
                                                    ((a) arrayList2.get(size6)).k.add(i13, Long.valueOf(a14));
                                                    size6++;
                                                }
                                                if (f11 != null && map != null) {
                                                    map.put(Long.valueOf(a14), f11);
                                                }
                                            }
                                            i13 = 0;
                                        }
                                        i11 = 0;
                                        break;
                                    }
                                    break;
                                case 25:
                                    TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                                    pageblockdetails.open = a4Var2.b("open");
                                    pageblockdetails.blocks = new ArrayList<>();
                                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size8 = arrayList3.size();
                                    int i26 = i15;
                                    while (i26 < size8) {
                                        Object obj7 = arrayList3.get(i26);
                                        i26++;
                                        a4 a4Var8 = (a4) obj7;
                                        if (a4Var8.b || !"summary".equals(a4Var8.a)) {
                                            arrayList6.add(a4Var8);
                                        } else {
                                            e(spannableStringBuilder6, a4Var8, 0, null, 0L);
                                        }
                                    }
                                    pageblockdetails.title = c6.f(L(spannableStringBuilder6));
                                    arrayList2.add(new a(pageblockdetails, i15, i15));
                                    int size9 = arrayList2.size();
                                    A(arrayList6, arrayList2, map);
                                    if (arrayList2.size() == size9) {
                                        arrayList2.add(new a(new TL_iv.pageBlockParagraph(), i15, i15));
                                    }
                                    a aVar2 = new a(new TL_iv.pageBlockParagraph(), i15, i15);
                                    aVar2.i = true;
                                    arrayList2.add(aVar2);
                                    i11 = i15;
                                    break;
                                case 26:
                                    a(arrayList2, m(a4Var2));
                                    i11 = i15;
                                    break;
                                default:
                                    if (!arrayList3.isEmpty()) {
                                        A(arrayList3, arrayList2, map);
                                    }
                                    i11 = i15;
                                    break;
                            }
                            i15 = i11;
                            break;
                    }
                } else if (!x(a4Var2.c)) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    spannableStringBuilder.append((CharSequence) q(a4Var2.c));
                }
            }
            t(arrayList2, spannableStringBuilder);
            return;
        }
    }

    public static a B(a4 a4Var, boolean z9) {
        TL_iv.PageBlock pageblockslideshow = z9 ? new TL_iv.pageBlockSlideshow() : new TL_iv.pageBlockCollage();
        ArrayList j3 = t3.j3(pageblockslideshow);
        ArrayList arrayList = a4Var.e;
        int size = arrayList.size();
        CharSequence charSequence = null;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            a4 a4Var2 = (a4) obj;
            if (!a4Var2.b) {
                if ("figcaption".equals(a4Var2.a)) {
                    charSequence = w(a4Var2);
                } else {
                    boolean equals = MediaStreamTrack.VIDEO_TRACK_KIND.equals(a4Var2.a);
                    if (equals || "img".equals(a4Var2.a)) {
                        long E = E(a4Var2.a("src"));
                        if (E > 0) {
                            TL_iv.PageBlock y10 = y(E, equals, a4Var2.b("data-spoiler"));
                            J(y10);
                            j3.add(y10);
                        }
                    }
                }
            }
        }
        if (j3.isEmpty()) {
            return null;
        }
        if (j3.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) j3.get(0);
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

    public static int C(int i7, String str) {
        if (str == null) {
            return i7;
        }
        try {
            return Integer.parseInt(str.trim());
        } catch (Exception unused) {
            return i7;
        }
    }

    public static void D(a4 a4Var, ArrayList arrayList, int i7, boolean z9) {
        String a10;
        ArrayList arrayList2;
        int i10;
        int i11 = i7 + 1;
        ArrayList arrayList3 = a4Var.e;
        int size = arrayList3.size();
        int i12 = 1;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList3.get(i13);
            i13++;
            a4 a4Var2 = (a4) obj;
            if (!a4Var2.b && "li".equals(a4Var2.a)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = a4Var2.e;
                int size2 = arrayList5.size();
                int i14 = 0;
                while (i14 < size2) {
                    int i15 = i14 + 1;
                    a4 a4Var3 = (a4) arrayList5.get(i14);
                    if (!a4Var3.b && ("ul".equals(a4Var3.a) || "ol".equals(a4Var3.a))) {
                        arrayList4.add(a4Var3);
                    } else if (a4Var3.b) {
                        spannableStringBuilder.append((CharSequence) q(a4Var3.c));
                    } else {
                        arrayList2 = arrayList5;
                        i10 = size2;
                        h(spannableStringBuilder, a4Var3, 0, null, 0L);
                        arrayList5 = arrayList2;
                        i14 = i15;
                        size2 = i10;
                    }
                    arrayList2 = arrayList5;
                    i10 = size2;
                    arrayList5 = arrayList2;
                    i14 = i15;
                    size2 = i10;
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = c6.f(L(spannableStringBuilder));
                a aVar = new a(pageblockparagraph, i11, z9 ? i12 : 0);
                aVar.e = a4Var2.b("data-checkbox") || ((a10 = a4Var2.a("class")) != null && a10.toLowerCase().contains("checkbox"));
                aVar.f = a4Var2.b("data-checked");
                arrayList.add(aVar);
                int size3 = arrayList4.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj2 = arrayList4.get(i16);
                    i16++;
                    a4 a4Var4 = (a4) obj2;
                    D(a4Var4, arrayList, i11, "ol".equals(a4Var4.a));
                }
                i12++;
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

    public static void F(StringBuilder sb2, List list, int[] iArr, int i7, int i10, int i11, int i12, int i13, z3 z3Var, boolean z9, int i14, Map map) {
        int i15;
        List list2;
        boolean z10;
        String str;
        String str2;
        StringBuilder sb3 = sb2;
        List list3 = list;
        int i16 = i7;
        z3 z3Var2 = z3Var;
        int i17 = i14;
        ArrayList arrayList = z3Var2.a;
        while (true) {
            int i18 = iArr[0];
            if (i18 > i16) {
                return;
            }
            a aVar = (a) list3.get(i18);
            if (!aVar.i) {
                if (aVar.k.size() > i17) {
                    z3Var2.d(sb3);
                    Long l10 = (Long) ((a) list3.get(iArr[0])).k.get(i17);
                    long longValue = l10.longValue();
                    int i19 = iArr[0];
                    while (true) {
                        int i20 = i19 + 1;
                        if (i20 > i16) {
                            break;
                        }
                        a aVar2 = (a) list3.get(i20);
                        if (aVar2.k.size() <= i17 || ((Long) aVar2.k.get(i17)).longValue() != longValue) {
                            break;
                        } else {
                            i19 = i20;
                        }
                    }
                    sb3.append("<blockquote>");
                    z3 z3Var3 = new z3(0);
                    F(sb3, list3, iArr, i19, i10, i11, i12, i13, z3Var3, z9, i17 + 1, map);
                    z3Var3.d(sb3);
                    c(sb3, map != null ? k((TL_iv.RichText) map.get(l10)) : null);
                    sb3.append("</blockquote>");
                    i16 = i7;
                    i17 = i14;
                } else {
                    if (t3.A3(aVar)) {
                        z3Var2.d(sb3);
                        a aVar3 = (a) list3.get(iArr[0]);
                        sb3.append(((TL_iv.pageBlockDetails) aVar3.b).open ? "<details open>" : "<details>");
                        sb3.append("<summary>");
                        g(sb3, K(aVar3, iArr[0], i10, i11, i12, i13));
                        sb3.append("</summary>");
                        iArr[0] = iArr[0] + 1;
                        z3 z3Var4 = new z3(0);
                        F(sb3, list3, iArr, i7, i10, i11, i12, i13, z3Var4, true, i14, map);
                        list2 = list3;
                        i15 = i7;
                        z3Var4.d(sb3);
                        int i21 = iArr[0];
                        if (i21 <= i15 && i21 < list2.size() && ((a) list2.get(iArr[0])).i) {
                            iArr[0] = iArr[0] + 1;
                        }
                        sb3.append("</details>");
                    } else {
                        i15 = i7;
                        list2 = list3;
                        boolean z11 = true;
                        if (aVar.c <= 0 || l(aVar.b) == null) {
                            z3Var2.d(sb3);
                            int i22 = iArr[0];
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
                                    int i23 = 0;
                                    while (i23 < size) {
                                        TL_keyboard.PageButton pageButton = arrayList2.get(i23);
                                        i23++;
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
                                if (t3.E3(pageBlock)) {
                                    String str4 = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
                                    sb3.append("<div class=\"");
                                    sb3.append(str4);
                                    sb3.append("\">");
                                    ArrayList j3 = t3.j3(pageBlock);
                                    if (j3 != null) {
                                        int i24 = 0;
                                        while (i24 < j3.size()) {
                                            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) j3.get(i24);
                                            ArrayList arrayList3 = aVar.h;
                                            s sVar = (arrayList3 == null || i24 >= arrayList3.size()) ? null : (s) aVar.h.get(i24);
                                            if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                                                z10 = z11;
                                                long j10 = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                                                if (j10 != 0) {
                                                    str = str3;
                                                    i(sb3, MediaStreamTrack.VIDEO_TRACK_KIND, j10, sVar, pageBlock2);
                                                } else {
                                                    str = str3;
                                                }
                                            } else {
                                                z10 = z11;
                                                str = str3;
                                                if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                                                    long j11 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                                                    if (j11 != 0) {
                                                        sb3 = sb2;
                                                        i(sb3, "img", j11, sVar, pageBlock2);
                                                        i24++;
                                                        str3 = str;
                                                        z11 = z10;
                                                    }
                                                }
                                            }
                                            sb3 = sb2;
                                            i24++;
                                            str3 = str;
                                            z11 = z10;
                                        }
                                    }
                                    String str5 = str3;
                                    SpannableStringBuilder o4 = o(pageBlock);
                                    if (o4 != null && o4.length() > 0) {
                                        sb3.append(str5);
                                        g(sb3, o4);
                                        sb3.append("</figcaption>");
                                    }
                                    sb3.append("</div>");
                                } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                                    SpannableStringBuilder o10 = o(pageblockmap);
                                    boolean z12 = o10 != null && o10.length() > 0;
                                    if (z12) {
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
                                    if (z12) {
                                        sb3.append("<figcaption>");
                                        g(sb3, o10);
                                        sb3.append("</figcaption></figure>");
                                    }
                                } else {
                                    String l11 = l(pageBlock);
                                    if (l11 == null) {
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
                                        g(sb3, K(aVar, i22, i10, i11, i12, i13));
                                        sb3.append("</pre>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                                        sb3.append("<blockquote class=\"pull\">");
                                        g(sb3, K(aVar, i22, i10, i11, i12, i13));
                                        c(sb3, k(((TL_iv.pageBlockPullquote) pageBlock).caption));
                                        sb3.append("</blockquote>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                                        if (pageblockblockquote.collapsed) {
                                            sb3.append("<blockquote collapsed>");
                                        } else {
                                            sb3.append("<blockquote>");
                                        }
                                        g(sb3, K(aVar, i22, i10, i11, i12, i13));
                                        c(sb3, k(pageblockblockquote.caption));
                                        sb3.append("</blockquote>");
                                    } else {
                                        sb3.append('<');
                                        sb3.append(l11);
                                        sb3.append('>');
                                        g(sb3, K(aVar, i22, i10, i11, i12, i13));
                                        sb3.append("</");
                                        sb3.append(l11);
                                        sb3.append('>');
                                    }
                                }
                                iArr[0] = iArr[0] + 1;
                                z3Var2 = z3Var;
                            }
                            iArr[0] = iArr[0] + 1;
                            z3Var2 = z3Var;
                        } else {
                            int i25 = aVar.c;
                            boolean z13 = aVar.d > 0;
                            while (arrayList.size() > i25) {
                                z3Var2.c(sb3);
                            }
                            while (true) {
                                str2 = "<ul>";
                                if (arrayList.size() >= i25) {
                                    break;
                                }
                                if (z13) {
                                    str2 = "<ol>";
                                }
                                sb3.append(str2);
                                arrayList.add(Boolean.valueOf(z13));
                            }
                            if (!arrayList.isEmpty() && ((Boolean) jg.g.i(1, arrayList)).booleanValue() != z13) {
                                z3Var2.c(sb3);
                                sb3.append(z13 ? "<ol>" : "<ul>");
                                arrayList.add(Boolean.valueOf(z13));
                            }
                            sb3.append("<li>");
                            g(sb3, K(aVar, iArr[0], i10, i11, i12, i13));
                            sb3.append("</li>");
                            iArr[0] = iArr[0] + 1;
                        }
                    }
                    i17 = i14;
                    list3 = list2;
                    i16 = i15;
                }
            } else if (z9) {
                return;
            } else {
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    public static void G(StringBuilder sb2, String str, long j3, s sVar, TL_iv.PageBlock pageBlock) {
        if (j3 == 0) {
            return;
        }
        SpannableStringBuilder o4 = o(pageBlock);
        boolean z9 = o4 != null && o4.length() > 0;
        if (z9) {
            sb2.append("<figure>");
        }
        i(sb2, str, j3, sVar, pageBlock);
        if (z9) {
            sb2.append("<figcaption>");
            g(sb2, o4);
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
        SpannableStringBuilder r10 = richText != null ? c6.r(richText, null, true) : null;
        if (r10 != null && r10.length() > 0) {
            sb2.append("<caption>");
            g(sb2, r10);
            sb2.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i7);
                i7++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                sb2.append("<tr>");
                if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        TL_iv.pageTableCell pagetablecell = arrayList.get(i10);
                        i10++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null) {
                            String str = pagetablecell2.header ? "th" : "td";
                            sb2.append('<');
                            sb2.append(str);
                            int i11 = pagetablecell2.colspan;
                            if (i11 <= 1) {
                                i11 = 0;
                            }
                            if (i11 > 0) {
                                sb2.append(" colspan=\"");
                                sb2.append(i11);
                                sb2.append('\"');
                            }
                            int i12 = pagetablecell2.rowspan;
                            if (i12 <= 1) {
                                i12 = 0;
                            }
                            if (i12 > 0) {
                                sb2.append(" rowspan=\"");
                                sb2.append(i12);
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
                            g(sb2, e6.h(pagetablecell2));
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
        pageCaption.text = c6.f(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static void J(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static CharSequence K(a aVar, int i7, int i10, int i11, int i12, int i13) {
        CharSequence r10 = t3.A3(aVar) ? c6.r(((TL_iv.pageBlockDetails) aVar.b).title, null, true) : a6.A(aVar.b);
        if (r10 == null) {
            r10 = "";
        }
        int length = r10.length();
        int max = i7 == i10 ? Math.max(0, Math.min(i12, length)) : 0;
        int max2 = i7 == i11 ? Math.max(0, Math.min(i13, length)) : length;
        if (max > max2) {
            int i14 = max;
            max = max2;
            max2 = i14;
        }
        return (max == 0 && max2 == length) ? r10 : r10.subSequence(max, max2);
    }

    public static CharSequence L(SpannableStringBuilder spannableStringBuilder) {
        char charAt;
        int length = spannableStringBuilder.length();
        int i7 = 0;
        while (i7 < length && ((charAt = spannableStringBuilder.charAt(i7)) == ' ' || charAt == '\n' || charAt == '\t' || charAt == '\r')) {
            i7++;
        }
        while (length > i7) {
            char charAt2 = spannableStringBuilder.charAt(length - 1);
            if (charAt2 != ' ' && charAt2 != '\n' && charAt2 != '\t' && charAt2 != '\r') {
                break;
            }
            length--;
        }
        return (i7 == 0 && length == spannableStringBuilder.length()) ? spannableStringBuilder : spannableStringBuilder.subSequence(i7, length);
    }

    public static void a(ArrayList arrayList, a aVar) {
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public static void b(ArrayList arrayList, TL_iv.PageBlock pageBlock, a4 a4Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, a4Var, 0, null, 0L);
        a6.d(pageBlock, L(spannableStringBuilder));
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
        if (i4.c(inlineButtonType)) {
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
            g(sb2, c6.r(richText, null, true));
            sb2.append("</button>");
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, a4 a4Var, int i7, String str, long j3) {
        SpannableStringBuilder spannableStringBuilder2;
        int i10;
        String str2;
        long j10;
        ArrayList arrayList = a4Var.e;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            a4 a4Var2 = (a4) obj;
            if (a4Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                i10 = i7;
                str2 = str;
                j10 = j3;
                j(spannableStringBuilder2, q(a4Var2.c), i10, str2, j10);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                i10 = i7;
                str2 = str;
                j10 = j3;
                h(spannableStringBuilder2, a4Var2, i10, str2, j10);
            }
            spannableStringBuilder = spannableStringBuilder2;
            i7 = i10;
            str = str2;
            j3 = j10;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, a4 a4Var) {
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList = a4Var.e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            a4 a4Var2 = (a4) obj;
            if (a4Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                j(spannableStringBuilder2, q(a4Var2.c), 0, null, 0L);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                if (!"cite".equals(a4Var2.a)) {
                    h(spannableStringBuilder2, a4Var2, 0, null, 0L);
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
        int i7;
        i4 i4Var;
        long j3;
        int i10;
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
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        int i21 = 0;
        if (!(charSequence instanceof Spanned)) {
            r(sb2, charSequence, 0, charSequence.length());
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        int length = charSequence.length();
        int i22 = 0;
        while (i22 < length) {
            i4[] i4VarArr = (i4[]) spanned.getSpans(i22, Math.min(length, i22 + 1), i4.class);
            int length2 = i4VarArr.length;
            int i23 = i21;
            while (true) {
                if (i23 >= length2) {
                    i7 = -1;
                    i4Var = null;
                    break;
                }
                i4Var = i4VarArr[i23];
                int spanStart = spanned.getSpanStart(i4Var);
                i7 = spanned.getSpanEnd(i4Var);
                if (spanStart <= i22 && i7 > i22) {
                    break;
                } else {
                    i23++;
                }
            }
            if (i4Var != null) {
                TL_iv.textButton textbutton = i4Var.a;
                if (textbutton != null && i4.c(textbutton.type)) {
                    d(sb2, textbutton.text, textbutton.type, textbutton.style);
                }
                i22 = Math.min(length, i7);
            } else {
                int nextSpanTransition = spanned.nextSpanTransition(i22, length, CharacterStyle.class);
                vy0[] vy0VarArr = (vy0[]) spanned.getSpans(i22, nextSpanTransition, vy0.class);
                int length3 = vy0VarArr.length;
                int i24 = i21;
                int i25 = i24;
                while (i24 < length3) {
                    uy0 uy0Var = vy0VarArr[i24].b;
                    if (uy0Var != null) {
                        i25 |= uy0Var.a;
                    }
                    i24++;
                }
                d41[] d41VarArr = (d41[]) spanned.getSpans(i22, nextSpanTransition, d41.class);
                String url = d41VarArr.length > 0 ? d41VarArr[i21].getURL() : null;
                org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spanned.getSpans(i22, nextSpanTransition, org.telegram.ui.Components.r5.class);
                if (r5VarArr.length > 0) {
                    org.telegram.ui.Components.r5 r5Var = r5VarArr[i21];
                    if (!r5Var.standard) {
                        j3 = r5Var.getDocumentId();
                        i10 = i25 & 256;
                        if (i10 != 0) {
                            sb2.append("<spoiler>");
                        }
                        i11 = i25 & 1;
                        if (i11 != 0) {
                            sb2.append("<b>");
                        }
                        i12 = i25 & 2;
                        if (i12 != 0) {
                            sb2.append("<i>");
                        }
                        i13 = i25 & 16;
                        if (i13 != 0) {
                            sb2.append("<u>");
                        }
                        i14 = i25 & 8;
                        if (i14 != 0) {
                            sb2.append("<s>");
                        }
                        i15 = i25 & 4;
                        Spanned spanned2 = spanned;
                        if (i15 != 0) {
                            sb2.append("<code>");
                        }
                        i16 = i25 & TLObject.FLAG_14;
                        if (i16 != 0) {
                            sb2.append("<sub>");
                        }
                        i17 = 32768 & i25;
                        if (i17 != 0) {
                            sb2.append("<sup>");
                        }
                        i18 = 65536 & i25;
                        if (i18 != 0) {
                            sb2.append("<mark>");
                        }
                        if (url != null) {
                            sb2.append("<a href=\"");
                            sb2.append(s(url));
                            sb2.append("\">");
                        }
                        i19 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        if (i19 == 0) {
                            i20 = i19;
                            sb2.append("<animated-emoji data-document-id=\"");
                            sb2.append(j3);
                            sb2.append("\">");
                        } else {
                            i20 = i19;
                        }
                        r(sb2, charSequence, i22, nextSpanTransition);
                        if (i20 != 0) {
                            sb2.append("</animated-emoji>");
                        }
                        if (url != null) {
                            sb2.append("</a>");
                        }
                        if (i18 != 0) {
                            sb2.append("</mark>");
                        }
                        if (i17 != 0) {
                            sb2.append("</sup>");
                        }
                        if (i16 != 0) {
                            sb2.append("</sub>");
                        }
                        if (i15 != 0) {
                            sb2.append("</code>");
                        }
                        if (i14 != 0) {
                            sb2.append("</s>");
                        }
                        if (i13 != 0) {
                            sb2.append("</u>");
                        }
                        if (i12 != 0) {
                            sb2.append("</i>");
                        }
                        if (i11 != 0) {
                            sb2.append("</b>");
                        }
                        if (i10 != 0) {
                            sb2.append("</spoiler>");
                        }
                        i22 = nextSpanTransition;
                        spanned = spanned2;
                        i21 = 0;
                    }
                }
                j3 = 0;
                i10 = i25 & 256;
                if (i10 != 0) {
                }
                i11 = i25 & 1;
                if (i11 != 0) {
                }
                i12 = i25 & 2;
                if (i12 != 0) {
                }
                i13 = i25 & 16;
                if (i13 != 0) {
                }
                i14 = i25 & 8;
                if (i14 != 0) {
                }
                i15 = i25 & 4;
                Spanned spanned22 = spanned;
                if (i15 != 0) {
                }
                i16 = i25 & TLObject.FLAG_14;
                if (i16 != 0) {
                }
                i17 = 32768 & i25;
                if (i17 != 0) {
                }
                i18 = 65536 & i25;
                if (i18 != 0) {
                }
                if (url != null) {
                }
                i19 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i19 == 0) {
                }
                r(sb2, charSequence, i22, nextSpanTransition);
                if (i20 != 0) {
                }
                if (url != null) {
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
                if (i10 != 0) {
                }
                i22 = nextSpanTransition;
                spanned = spanned22;
                i21 = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(SpannableStringBuilder spannableStringBuilder, a4 a4Var, int i7, String str, long j3) {
        int i10;
        String str2;
        int i11;
        long j10;
        TL_keyboard.InlineButtonType v;
        if ("button".equals(a4Var.a) && (v = v(a4Var)) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            e(spannableStringBuilder2, a4Var, i7, str, j3);
            if (spannableStringBuilder2.length() > 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                TL_iv.textButton textbutton = new TL_iv.textButton();
                textbutton.text = c6.f(spannableStringBuilder2);
                textbutton.type = v;
                textbutton.style = u(a4Var);
                spannableStringBuilder.setSpan(new i4(textbutton), length, spannableStringBuilder.length(), 33);
            }
            return;
        }
        String str3 = a4Var.a;
        str3.getClass();
        switch (str3) {
            case "spoiler":
                i10 = i7 | 256;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty() || a4Var.b) {
                    e(spannableStringBuilder, a4Var, i10, str2, j10);
                    break;
                }
                break;
            case "strike":
            case "s":
            case "del":
                i10 = i7 | 8;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, a4Var, i10, str2, j10);
                break;
            case "strong":
            case "b":
                i10 = i7 | 1;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, a4Var, i10, str2, j10);
                break;
            case "a":
                String a10 = a4Var.a("href");
                if (a10 != null) {
                    str2 = a10;
                    i10 = i7;
                    j10 = j3;
                    if (a4Var.e.isEmpty()) {
                    }
                    e(spannableStringBuilder, a4Var, i10, str2, j10);
                    break;
                }
                i10 = i7;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, a4Var, i10, str2, j10);
                break;
            case "i":
            case "em":
                i10 = i7 | 2;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, a4Var, i10, str2, j10);
                break;
            case "u":
                i10 = i7 | 16;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, a4Var, i10, str2, j10);
                break;
            case "br":
                j(spannableStringBuilder, "\n", i7, str, j3);
                break;
            case "tt":
            case "code":
                i10 = i7 | 4;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, a4Var, i10, str2, j10);
                break;
            case "sub":
                i10 = i7 | TLObject.FLAG_14;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, a4Var, i10, str2, j10);
                break;
            case "sup":
                i11 = 32768;
                i10 = i11 | i7;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, a4Var, i10, str2, j10);
                break;
            case "mark":
                i11 = 65536;
                i10 = i11 | i7;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, a4Var, i10, str2, j10);
                break;
            case "animated-emoji":
                String a11 = a4Var.a("data-document-id");
                if (a11 != null) {
                    try {
                        j10 = Long.parseLong(a11.trim());
                        i10 = i7;
                        str2 = str;
                    } catch (Exception unused) {
                    }
                    if (a4Var.e.isEmpty()) {
                    }
                    e(spannableStringBuilder, a4Var, i10, str2, j10);
                    break;
                }
                i10 = i7;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, a4Var, i10, str2, j10);
                break;
            default:
                i10 = i7;
                str2 = str;
                j10 = j3;
                if (a4Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, a4Var, i10, str2, j10);
                break;
        }
    }

    public static void i(StringBuilder sb2, String str, long j3, s sVar, TL_iv.PageBlock pageBlock) {
        sb2.append('<');
        sb2.append(str);
        sb2.append(" src=\"");
        sb2.append(j3);
        sb2.append('\"');
        if (sVar != null) {
            if (sVar.j > 0) {
                sb2.append(" width=\"");
                sb2.append(sVar.j);
                sb2.append('\"');
            }
            if (sVar.k > 0) {
                sb2.append(" height=\"");
                sb2.append(sVar.k);
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

    public static void j(SpannableStringBuilder spannableStringBuilder, String str, int i7, String str2, long j3) {
        if (str == null || str.length() == 0) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        if (j3 != 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.r5(j3, (Paint.FontMetricsInt) null), length, length2, 33);
        }
        if (i7 != 0) {
            uy0 uy0Var = new uy0();
            uy0Var.a = i7 & 114975;
            spannableStringBuilder.setSpan(new vy0(uy0Var, org.telegram.messenger.g0.L(iz.W0)), length, length2, 33);
        }
        if (str2 != null) {
            spannableStringBuilder.setSpan(c6.k(str2), length, length2, 33);
        }
    }

    public static SpannableStringBuilder k(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return null;
        }
        SpannableStringBuilder r10 = c6.r(richText, null, true);
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
    public static a m(a4 a4Var) {
        double parseDouble;
        String a10;
        String str = a4Var.a;
        str.getClass();
        switch (str) {
            case "div":
                String a11 = a4Var.a("class");
                String lowerCase = a11 == null ? "" : a11.toLowerCase();
                if (lowerCase.contains("slideshow")) {
                    return B(a4Var, true);
                }
                if (lowerCase.contains("collage")) {
                    return B(a4Var, false);
                }
                return null;
            case "img":
                return n(a4Var, false);
            case "audio":
                long E = E(a4Var.a("src"));
                if (E <= 0) {
                    return null;
                }
                TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
                pageblockaudio.audio_id = E;
                J(pageblockaudio);
                return new a(pageblockaudio, 0, 0);
            case "video":
                return n(a4Var, true);
            case "document":
                long E2 = E(a4Var.a("src"));
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
                String a12 = a4Var.a("lat");
                double d = 0.0d;
                if (a12 != null) {
                    try {
                        parseDouble = Double.parseDouble(a12.trim());
                    } catch (Exception unused) {
                    }
                    tL_geoPoint.lat = parseDouble;
                    a10 = a4Var.a("long");
                    if (a10 != null) {
                        try {
                            d = Double.parseDouble(a10.trim());
                        } catch (Exception unused2) {
                        }
                    }
                    tL_geoPoint._long = d;
                    tL_geoPoint.access_hash = E(a4Var.a("access"));
                    pageblockmap.geo = tL_geoPoint;
                    pageblockmap.zoom = C(15, a4Var.a("zoom"));
                    pageblockmap.w = C(600, a4Var.a("w"));
                    pageblockmap.h = C(400, a4Var.a("h"));
                    J(pageblockmap);
                    return new a(pageblockmap, 0, 0);
                }
                parseDouble = 0.0d;
                tL_geoPoint.lat = parseDouble;
                a10 = a4Var.a("long");
                if (a10 != null) {
                }
                tL_geoPoint._long = d;
                tL_geoPoint.access_hash = E(a4Var.a("access"));
                pageblockmap.geo = tL_geoPoint;
                pageblockmap.zoom = C(15, a4Var.a("zoom"));
                pageblockmap.w = C(600, a4Var.a("w"));
                pageblockmap.h = C(400, a4Var.a("h"));
                J(pageblockmap);
                return new a(pageblockmap, 0, 0);
            default:
                return null;
        }
    }

    public static a n(a4 a4Var, boolean z9) {
        long E = E(a4Var.a("src"));
        if (E <= 0) {
            return null;
        }
        TL_iv.PageBlock y10 = y(E, z9, a4Var.b("data-spoiler"));
        J(y10);
        return new a(y10, 0, 0);
    }

    public static SpannableStringBuilder o(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        if (pageBlock != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            SpannableStringBuilder r10 = c6.r(richText, null, true);
            if (r10.length() > 0) {
                return r10;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static void p(a4 a4Var, TL_iv.pageBlockTable pageblocktable) {
        String lowerCase;
        int indexOf;
        ArrayList arrayList = a4Var.e;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a4 a4Var2 = (a4) obj;
            if (!a4Var2.b) {
                String str = a4Var2.a;
                str.getClass();
                int i11 = -1;
                switch (str.hashCode()) {
                    case 3710:
                        if (str.equals("tr")) {
                            i11 = i7;
                            break;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            i11 = 1;
                            break;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            i11 = 2;
                            break;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            i11 = 3;
                            break;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            i11 = 4;
                            break;
                        }
                        break;
                }
                switch (i11) {
                    case 0:
                        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        pagetablerow.cells = new ArrayList<>();
                        ArrayList arrayList3 = a4Var2.e;
                        int size2 = arrayList3.size();
                        int i12 = i7;
                        while (i12 < size2) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            a4 a4Var3 = (a4) obj2;
                            if (!a4Var3.b) {
                                if ("td".equals(a4Var3.a) || "th".equals(a4Var3.a)) {
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    pagetablecell.colspan = C(i7, a4Var3.a("colspan"));
                                    pagetablecell.rowspan = C(i7, a4Var3.a("rowspan"));
                                    e6.d(pagetablecell, w(a4Var3));
                                    e6.l(pagetablecell, ("th".equals(a4Var3.a) || a4Var3.b("header")) ? 1 : i7);
                                    String a10 = a4Var3.a("align");
                                    if (a10 == null) {
                                        String a11 = a4Var3.a("style");
                                        if (a11 != null && (indexOf = (lowerCase = a11.toLowerCase()).indexOf("text-align")) >= 0) {
                                            if (lowerCase.indexOf("center", indexOf) >= 0) {
                                                a10 = "center";
                                            } else if (lowerCase.indexOf("right", indexOf) >= 0) {
                                                a10 = "right";
                                            }
                                        }
                                        a10 = null;
                                    }
                                    if ("center".equalsIgnoreCase(a10)) {
                                        e6.k(pagetablecell, 1);
                                    } else if ("right".equalsIgnoreCase(a10)) {
                                        e6.k(pagetablecell, 2);
                                    }
                                    String a12 = a4Var3.a("valign");
                                    if ("middle".equalsIgnoreCase(a12)) {
                                        e6.m(pagetablecell, 1);
                                    } else if ("bottom".equalsIgnoreCase(a12)) {
                                        e6.m(pagetablecell, 2);
                                        pagetablerow.cells.add(pagetablecell);
                                    }
                                    pagetablerow.cells.add(pagetablecell);
                                }
                            }
                            i7 = 0;
                        }
                        if (pagetablerow.cells.isEmpty()) {
                            pagetablerow.cells.add(e6.f());
                        }
                        arrayList2.add(pagetablerow);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        p(a4Var2, pageblocktable);
                        break;
                    case 4:
                        pageblocktable.title = c6.f(w(a4Var2));
                        break;
                }
                i7 = 0;
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
        int i7 = 0;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt != '&') {
                sb2.append(charAt);
            } else {
                int i10 = i7 + 1;
                int indexOf = str.indexOf(59, i10);
                if (indexOf < 0 || indexOf - i7 > 12) {
                    sb2.append(charAt);
                } else {
                    substring = str.substring(i10, indexOf);
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
                        i7 = indexOf;
                    } else {
                        sb2.append(charAt);
                    }
                }
            }
            i7++;
        }
        return sb2.toString();
    }

    public static void r(StringBuilder sb2, CharSequence charSequence, int i7, int i10) {
        while (i7 < i10) {
            char charAt = charSequence.charAt(i7);
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
            i7++;
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
        pageblockparagraph.text = c6.f(L(spannableStringBuilder));
        arrayList.add(new a(pageblockparagraph, 0, 0));
    }

    public static TL_keyboard.RichButtonStyle u(a4 a4Var) {
        TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
        String a10 = a4Var.a("data-style");
        richButtonStyle.bg_primary = "primary".equals(a10);
        richButtonStyle.bg_danger = "danger".equals(a10);
        richButtonStyle.bg_success = "success".equals(a10);
        return richButtonStyle;
    }

    public static TL_keyboard.InlineButtonType v(a4 a4Var) {
        String a10 = a4Var.a("data-type");
        if ("url".equals(a10)) {
            String a11 = a4Var.a("data-url");
            if (TextUtils.isEmpty(a11)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
            tL_inlineButtonTypeUrl.url = a11;
            return tL_inlineButtonTypeUrl;
        }
        if ("copy".equals(a10)) {
            String a12 = a4Var.a("data-copy-text");
            if (TextUtils.isEmpty(a12)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
            tL_inlineButtonTypeCopy.copy_text = a12;
            return tL_inlineButtonTypeCopy;
        }
        if (!"user-profile".equals(a10)) {
            return null;
        }
        long E = E(a4Var.a("data-user-id"));
        if (E <= 0) {
            return null;
        }
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = E;
        return tL_inlineButtonTypeUserProfile;
    }

    public static CharSequence w(a4 a4Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, a4Var, 0, null, 0L);
        return L(spannableStringBuilder);
    }

    public static boolean x(String str) {
        if (str == null) {
            return true;
        }
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt != ' ' && charAt != '\n' && charAt != '\t' && charAt != '\r' && charAt != 160) {
                return false;
            }
        }
        return true;
    }

    public static TL_iv.PageBlock y(long j3, boolean z9, boolean z10) {
        if (z9) {
            TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
            if (j3 <= 0) {
                j3 = 0;
            }
            pageblockvideo.video_id = j3;
            pageblockvideo.spoiler = z10;
            return pageblockvideo;
        }
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        if (j3 <= 0) {
            j3 = 0;
        }
        pageblockphoto.photo_id = j3;
        pageblockphoto.spoiler = z10;
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
        int i7;
        String str2;
        int i10;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            while (true) {
                if (i11 < str.length()) {
                    char c11 = 1;
                    if (str.charAt(i11) != '<') {
                        indexOf = str.indexOf(60, i11);
                        if (indexOf < 0) {
                            indexOf = str.length();
                        }
                        String substring = str.substring(i11, indexOf);
                        if (!substring.isEmpty()) {
                            a4 a4Var = new a4();
                            a4Var.b = true;
                            a4Var.c = substring;
                            if (arrayList3.isEmpty()) {
                                arrayList2.add(a4Var);
                            } else {
                                ((a4) jg.g.i(1, arrayList3)).e.add(a4Var);
                            }
                        }
                    } else if (str.startsWith("<!--", i11)) {
                        int indexOf2 = str.indexOf("-->", i11 + 4);
                        i11 = indexOf2 < 0 ? str.length() : indexOf2 + 3;
                    } else if (i11 + 1 < str.length() && str.charAt(i11 + 1) == '!') {
                        int indexOf3 = str.indexOf(62, i11);
                        i11 = indexOf3 < 0 ? str.length() : indexOf3 + 1;
                    } else if (i11 + 1 >= str.length() || str.charAt(i11 + 1) != '/') {
                        int i12 = i11 + 1;
                        boolean z9 = false;
                        char c12 = 0;
                        while (true) {
                            c10 = '\'';
                            if (i12 < str.length()) {
                                char charAt = str.charAt(i12);
                                if (z9) {
                                    if (charAt == c12) {
                                        z9 = false;
                                    }
                                } else if (charAt == '\"' || charAt == '\'') {
                                    z9 = true;
                                    c12 = charAt;
                                } else if (charAt == '>') {
                                }
                                i12++;
                            } else {
                                i12 = -1;
                            }
                        }
                        if (i12 >= 0) {
                            String substring2 = str.substring(i11 + 1, i12);
                            indexOf = i12 + 1;
                            boolean endsWith = substring2.endsWith("/");
                            if (endsWith) {
                                substring2 = com.google.android.recaptcha.internal.a.k(substring2, 1, 0);
                            }
                            String trim = substring2.trim();
                            a4 a4Var2 = null;
                            if (!trim.isEmpty()) {
                                int i13 = 0;
                                while (i13 < trim.length() && !c8.n1.a(trim.charAt(i13))) {
                                    i13++;
                                }
                                String lowerCase = trim.substring(0, i13).toLowerCase();
                                if (!lowerCase.isEmpty()) {
                                    a4Var2 = new a4();
                                    a4Var2.a = lowerCase;
                                    while (i13 < trim.length()) {
                                        while (i13 < trim.length() && c8.n1.a(trim.charAt(i13))) {
                                            i13++;
                                        }
                                        if (i13 < trim.length()) {
                                            int i14 = i13;
                                            while (i14 < trim.length() && trim.charAt(i14) != '=' && !c8.n1.a(trim.charAt(i14))) {
                                                i14++;
                                            }
                                            String lowerCase2 = trim.substring(i13, i14).toLowerCase();
                                            while (i14 < trim.length() && c8.n1.a(trim.charAt(i14))) {
                                                i14++;
                                            }
                                            if (i14 >= trim.length() || trim.charAt(i14) != '=') {
                                                i7 = i14;
                                                str2 = "";
                                            } else {
                                                do {
                                                    i14++;
                                                    if (i14 < trim.length()) {
                                                    }
                                                    if (i14 < trim.length() || !(trim.charAt(i14) == '\"' || trim.charAt(i14) == c10)) {
                                                        i10 = i14;
                                                        while (i10 < trim.length() && !c8.n1.a(trim.charAt(i10))) {
                                                            i10++;
                                                        }
                                                        str2 = trim.substring(i14, i10);
                                                        i7 = i10;
                                                    } else {
                                                        char charAt2 = trim.charAt(i14);
                                                        int i15 = i14 + 1;
                                                        i7 = i15;
                                                        while (i7 < trim.length() && trim.charAt(i7) != charAt2) {
                                                            i7++;
                                                        }
                                                        str2 = trim.substring(i15, Math.min(i7, trim.length()));
                                                        if (i7 < trim.length()) {
                                                            i7++;
                                                        }
                                                    }
                                                } while (c8.n1.a(trim.charAt(i14)));
                                                if (i14 < trim.length()) {
                                                }
                                                i10 = i14;
                                                while (i10 < trim.length()) {
                                                    i10++;
                                                }
                                                str2 = trim.substring(i14, i10);
                                                i7 = i10;
                                            }
                                            if (!lowerCase2.isEmpty()) {
                                                if (a4Var2.d == null) {
                                                    a4Var2.d = new HashMap();
                                                }
                                                a4Var2.d.put(lowerCase2, q(str2));
                                            }
                                            i13 = i7;
                                            c10 = '\'';
                                        }
                                    }
                                }
                            }
                            if (a4Var2 != null) {
                                if (arrayList3.isEmpty()) {
                                    arrayList2.add(a4Var2);
                                } else {
                                    ((a4) jg.g.i(1, arrayList3)).e.add(a4Var2);
                                }
                                if (!endsWith) {
                                    String str3 = a4Var2.a;
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
                                            arrayList3.add(a4Var2);
                                            break;
                                    }
                                }
                            }
                        } else {
                            String substring3 = str.substring(i11);
                            if (!substring3.isEmpty()) {
                                a4 a4Var3 = new a4();
                                a4Var3.b = true;
                                a4Var3.c = substring3;
                                if (arrayList3.isEmpty()) {
                                    arrayList2.add(a4Var3);
                                } else {
                                    ((a4) jg.g.i(1, arrayList3)).e.add(a4Var3);
                                }
                            }
                        }
                    } else {
                        int indexOf4 = str.indexOf(62, i11);
                        String lowerCase3 = str.substring(i11 + 2, indexOf4 < 0 ? str.length() : indexOf4).trim().toLowerCase();
                        indexOf = indexOf4 < 0 ? str.length() : indexOf4 + 1;
                        int size = arrayList3.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                if (((a4) arrayList3.get(size)).a.equals(lowerCase3)) {
                                    while (arrayList3.size() > size) {
                                        a8.p0.z(1, arrayList3);
                                    }
                                } else {
                                    size--;
                                }
                            }
                        }
                    }
                    i11 = indexOf;
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
