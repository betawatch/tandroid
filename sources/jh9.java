// default package

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class jh9 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x052c, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A(ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        int i;
        int i2;
        int i3;
        int i4;
        TL_keyboard.InlineButtonType v;
        String str;
        int i5;
        CharSequence w;
        String str2;
        int i6;
        ih9 ih9Var;
        CharSequence w2;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            SpannableStringBuilder spannableStringBuilder = null;
            while (i8 < size) {
                Object obj = arrayList.get(i8);
                i8++;
                ih9 ih9Var2 = (ih9) obj;
                boolean z = ih9Var2.b;
                ArrayList arrayList3 = ih9Var2.e;
                if (!z) {
                    String str3 = ih9Var2.a;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -1999048254:
                            if (str3.equals("spoiler")) {
                                i = i7;
                                break;
                            }
                            i = -1;
                            break;
                        case -1377687758:
                            if (str3.equals("button")) {
                                i = 1;
                                break;
                            }
                            i = -1;
                            break;
                        case -891985998:
                            if (str3.equals("strike")) {
                                i = 2;
                                break;
                            }
                            i = -1;
                            break;
                        case -891980137:
                            if (str3.equals("strong")) {
                                i = 3;
                                break;
                            }
                            i = -1;
                            break;
                        case nm7.h1 /* 97 */:
                            if (str3.equals("a")) {
                                i = 4;
                                break;
                            }
                            i = -1;
                            break;
                        case nm7.i1 /* 98 */:
                            if (str3.equals("b")) {
                                i = 5;
                                break;
                            }
                            i = -1;
                            break;
                        case nm7.p1 /* 105 */:
                            if (str3.equals("i")) {
                                i = 6;
                                break;
                            }
                            i = -1;
                            break;
                        case nm7.z1 /* 115 */:
                            if (str3.equals("s")) {
                                i = 7;
                                break;
                            }
                            i = -1;
                            break;
                        case nm7.B1 /* 117 */:
                            if (str3.equals("u")) {
                                i = 8;
                                break;
                            }
                            i = -1;
                            break;
                        case 3152:
                            if (str3.equals("br")) {
                                i = 9;
                                break;
                            }
                            i = -1;
                            break;
                        case 3240:
                            if (str3.equals("em")) {
                                i = 10;
                                break;
                            }
                            i = -1;
                            break;
                        case 3712:
                            if (str3.equals("tt")) {
                                i = 11;
                                break;
                            }
                            i = -1;
                            break;
                        case 99339:
                            if (str3.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                i = 12;
                                break;
                            }
                            i = -1;
                            break;
                        case 114240:
                            if (str3.equals("sub")) {
                                i = 13;
                                break;
                            }
                            i = -1;
                            break;
                        case 114254:
                            if (str3.equals("sup")) {
                                i = 14;
                                break;
                            }
                            i = -1;
                            break;
                        case 3059181:
                            if (str3.equals("code")) {
                                i = 15;
                                break;
                            }
                            i = -1;
                            break;
                        case 3148879:
                            if (str3.equals("font")) {
                                i = 16;
                                break;
                            }
                            i = -1;
                            break;
                        case 3536714:
                            if (str3.equals("span")) {
                                i = 17;
                                break;
                            }
                            i = -1;
                            break;
                        case 1438365596:
                            if (str3.equals("animated-emoji")) {
                                i = 18;
                                break;
                            }
                            i = -1;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    switch (i) {
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
                            int i9 = i7;
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                            h(spannableStringBuilder2, ih9Var2, 0, null, 0L);
                            i7 = i9;
                            spannableStringBuilder = spannableStringBuilder2;
                            break;
                        default:
                            t(arrayList2, spannableStringBuilder);
                            switch (str3.hashCode()) {
                                case -1857640538:
                                    if (str3.equals("summary")) {
                                        i2 = i7;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case -1274639644:
                                    if (str3.equals("figure")) {
                                        i2 = 1;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case -1268861541:
                                    if (str3.equals("footer")) {
                                        i2 = 2;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case nm7.w1 /* 112 */:
                                    if (str3.equals("p")) {
                                        i2 = 3;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3273:
                                    if (str3.equals("h1")) {
                                        i2 = 4;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3274:
                                    if (str3.equals("h2")) {
                                        i2 = 5;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3275:
                                    if (str3.equals("h3")) {
                                        i2 = 6;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3276:
                                    if (str3.equals("h4")) {
                                        i2 = 7;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3277:
                                    if (str3.equals("h5")) {
                                        i2 = 8;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3278:
                                    if (str3.equals("h6")) {
                                        i2 = 9;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3338:
                                    if (str3.equals("hr")) {
                                        i2 = 10;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3549:
                                    if (str3.equals("ol")) {
                                        i2 = 11;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3696:
                                    if (str3.equals("td")) {
                                        i2 = 12;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3700:
                                    if (str3.equals("th")) {
                                        i2 = 13;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3710:
                                    if (str3.equals("tr")) {
                                        i2 = 14;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3735:
                                    if (str3.equals("ul")) {
                                        i2 = 15;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 99473:
                                    if (str3.equals("div")) {
                                        i2 = 16;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 104387:
                                    if (str3.equals("img")) {
                                        i2 = 17;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 111267:
                                    if (str3.equals("pre")) {
                                        i2 = 18;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 93166550:
                                    if (str3.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                        i2 = 19;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 110115790:
                                    if (str3.equals("table")) {
                                        i2 = 20;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 110157846:
                                    if (str3.equals("tbody")) {
                                        i2 = 21;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 110326868:
                                    if (str3.equals("thead")) {
                                        i2 = 22;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 112202875:
                                    if (str3.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                        i2 = 23;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 1303202319:
                                    if (str3.equals("blockquote")) {
                                        i2 = 24;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 1557721666:
                                    if (str3.equals("details")) {
                                        i2 = 25;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 1901043637:
                                    if (str3.equals("location")) {
                                        i2 = 26;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                default:
                                    i2 = -1;
                                    break;
                            }
                            switch (i2) {
                                case 0:
                                    i3 = i7;
                                    b(arrayList2, new TL_iv.pageBlockParagraph(), ih9Var2);
                                    break;
                                case 1:
                                    int size2 = arrayList3.size();
                                    int i10 = 0;
                                    ll0 ll0Var = null;
                                    CharSequence charSequence = null;
                                    while (i10 < size2) {
                                        Object obj2 = arrayList3.get(i10);
                                        i10++;
                                        ih9 ih9Var3 = (ih9) obj2;
                                        if (!ih9Var3.b) {
                                            if ("figcaption".equals(ih9Var3.a)) {
                                                charSequence = w(ih9Var3);
                                            } else if (ll0Var == null) {
                                                ll0Var = m(ih9Var3);
                                            }
                                        }
                                    }
                                    if (ll0Var == null) {
                                        if (charSequence != null && charSequence.length() > 0) {
                                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                            pageblockparagraph.text = zk9.f(charSequence);
                                            i3 = 0;
                                            arrayList2.add(new ll0(pageblockparagraph, 0, 0));
                                            break;
                                        }
                                    } else {
                                        if (charSequence != null && charSequence.length() > 0) {
                                            I(ll0Var.b, charSequence);
                                        }
                                        arrayList2.add(ll0Var);
                                    }
                                    i3 = 0;
                                    break;
                                case 2:
                                    b(arrayList2, new TL_iv.pageBlockFooter(), ih9Var2);
                                    i3 = 0;
                                    break;
                                case 3:
                                    b(arrayList2, new TL_iv.pageBlockParagraph(), ih9Var2);
                                    i3 = 0;
                                    break;
                                case 4:
                                    b(arrayList2, new TL_iv.pageBlockHeading1(), ih9Var2);
                                    i3 = 0;
                                    break;
                                case 5:
                                    b(arrayList2, new TL_iv.pageBlockHeading2(), ih9Var2);
                                    i3 = 0;
                                    break;
                                case 6:
                                    b(arrayList2, new TL_iv.pageBlockHeading3(), ih9Var2);
                                    i3 = 0;
                                    break;
                                case 7:
                                    b(arrayList2, new TL_iv.pageBlockHeading4(), ih9Var2);
                                    i3 = 0;
                                    break;
                                case 8:
                                    b(arrayList2, new TL_iv.pageBlockHeading5(), ih9Var2);
                                    i3 = 0;
                                    break;
                                case 9:
                                    b(arrayList2, new TL_iv.pageBlockHeading6(), ih9Var2);
                                    i3 = 0;
                                    break;
                                case 10:
                                    int i11 = i7;
                                    arrayList2.add(new ll0(new TL_iv.pageBlockDivider(), i11, i11));
                                    i3 = 0;
                                    break;
                                case 11:
                                case 15:
                                    i4 = 0;
                                    D(ih9Var2, arrayList2, 0, "ol".equals(str3));
                                    i3 = i4;
                                    break;
                                case 12:
                                case 13:
                                case 14:
                                case 21:
                                case 22:
                                    A(arrayList3, arrayList2, hashMap);
                                    i3 = 0;
                                    break;
                                case 16:
                                    String a = ih9Var2.a("class");
                                    String lowerCase = a == null ? "" : a.toLowerCase();
                                    if (!lowerCase.contains("button-row")) {
                                        if (lowerCase.contains("collage")) {
                                            a(B(ih9Var2, false), arrayList2);
                                        } else if (lowerCase.contains("slideshow")) {
                                            a(B(ih9Var2, true), arrayList2);
                                        } else {
                                            b(arrayList2, new TL_iv.pageBlockParagraph(), ih9Var2);
                                        }
                                        i3 = 0;
                                        break;
                                    } else {
                                        TL_iv.pageBlockButtonRow pageblockbuttonrow = new TL_iv.pageBlockButtonRow();
                                        String a2 = ih9Var2.a("data-align");
                                        pageblockbuttonrow.align_left = "left".equalsIgnoreCase(a2);
                                        pageblockbuttonrow.align_center = "center".equalsIgnoreCase(a2);
                                        pageblockbuttonrow.align_right = "right".equalsIgnoreCase(a2);
                                        int size3 = arrayList3.size();
                                        int i12 = 0;
                                        while (i12 < size3) {
                                            Object obj3 = arrayList3.get(i12);
                                            i12++;
                                            ih9 ih9Var4 = (ih9) obj3;
                                            if (pageblockbuttonrow.buttons.size() >= 8) {
                                                i4 = 0;
                                                arrayList2.add(new ll0(pageblockbuttonrow, 0, 0));
                                                i3 = i4;
                                                break;
                                            } else if (!ih9Var4.b && "button".equals(ih9Var4.a) && (v = v(ih9Var4)) != null) {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                e(spannableStringBuilder3, ih9Var4, 0, null, 0L);
                                                CharSequence L = L(spannableStringBuilder3);
                                                if (L.length() != 0) {
                                                    TL_keyboard.PageButton pageButton = new TL_keyboard.PageButton();
                                                    pageButton.text = zk9.f(L);
                                                    pageButton.type = v;
                                                    pageButton.style = u(ih9Var4);
                                                    pageblockbuttonrow.buttons.add(pageButton);
                                                }
                                            }
                                        }
                                        i4 = 0;
                                        arrayList2.add(new ll0(pageblockbuttonrow, 0, 0));
                                        i3 = i4;
                                    }
                                    break;
                                case 17:
                                    a(m(ih9Var2), arrayList2);
                                    i3 = 0;
                                    break;
                                case 18:
                                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                                    String[] strArr = {"language", "lang", "lng"};
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= 3) {
                                            str = null;
                                        } else {
                                            str = ih9Var2.a(strArr[i13]);
                                            if (str == null) {
                                                i13++;
                                            }
                                        }
                                    }
                                    pageblockpreformatted.language = str;
                                    b(arrayList2, pageblockpreformatted, ih9Var2);
                                    i3 = 0;
                                    break;
                                case 19:
                                    a(m(ih9Var2), arrayList2);
                                    i3 = 0;
                                    break;
                                case 20:
                                    TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
                                    pageblocktable.title = new TL_iv.textEmpty();
                                    pageblocktable.rows = new ArrayList<>();
                                    pageblocktable.bordered = ih9Var2.b("border");
                                    String a3 = ih9Var2.a("class");
                                    pageblocktable.striped = a3 != null && a3.toLowerCase().contains("striped");
                                    pageblocktable.compact = a3 != null && a3.toLowerCase().contains("compact");
                                    p(ih9Var2, pageblocktable);
                                    if (pageblocktable.rows.isEmpty()) {
                                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                                        ArrayList<TL_iv.pageTableCell> arrayList4 = new ArrayList<>();
                                        pagetablerow.cells = arrayList4;
                                        arrayList4.add(fhb.f());
                                        pageblocktable.rows.add(pagetablerow);
                                    }
                                    arrayList2.add(new ll0(pageblocktable, 0, 0));
                                    i3 = 0;
                                    break;
                                case 23:
                                    a(m(ih9Var2), arrayList2);
                                    i3 = 0;
                                    break;
                                case 24:
                                    String a4 = ih9Var2.a("class");
                                    if (a4 != null && a4.toLowerCase().contains("pull")) {
                                        int size4 = arrayList3.size();
                                        int i14 = i7;
                                        while (true) {
                                            if (i14 < size4) {
                                                Object obj4 = arrayList3.get(i14);
                                                i14++;
                                                ih9Var = (ih9) obj4;
                                                if (ih9Var.b || !"cite".equals(ih9Var.a)) {
                                                }
                                            } else {
                                                ih9Var = null;
                                            }
                                        }
                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                        f(spannableStringBuilder4, ih9Var2);
                                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                                        xk9.b(pageblockpullquote, L(spannableStringBuilder4));
                                        TL_iv.RichText f = (ih9Var == null || (w2 = w(ih9Var)) == null || w2.length() == 0) ? null : zk9.f(w2);
                                        if (f != null) {
                                            pageblockpullquote.caption = f;
                                        }
                                        arrayList2.add(new ll0(pageblockpullquote, i7, i7));
                                        i3 = i7;
                                        break;
                                    } else {
                                        int size5 = arrayList3.size();
                                        int i15 = i7;
                                        int i16 = i15;
                                        ih9 ih9Var5 = null;
                                        while (i15 < size5) {
                                            Object obj5 = arrayList3.get(i15);
                                            i15++;
                                            ih9 ih9Var6 = (ih9) obj5;
                                            if (!ih9Var6.b && (str2 = ih9Var6.a) != null) {
                                                if (!"cite".equals(str2)) {
                                                    String str4 = ih9Var6.a;
                                                    str4.getClass();
                                                    switch (str4.hashCode()) {
                                                        case -1999048254:
                                                            if (str4.equals("spoiler")) {
                                                                i6 = i7;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case -1377687758:
                                                            if (str4.equals("button")) {
                                                                i6 = 1;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case -891985998:
                                                            if (str4.equals("strike")) {
                                                                i6 = 2;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case -891980137:
                                                            if (str4.equals("strong")) {
                                                                i6 = 3;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case nm7.h1 /* 97 */:
                                                            if (str4.equals("a")) {
                                                                i6 = 4;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case nm7.i1 /* 98 */:
                                                            if (str4.equals("b")) {
                                                                i6 = 5;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case nm7.p1 /* 105 */:
                                                            if (str4.equals("i")) {
                                                                i6 = 6;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case nm7.z1 /* 115 */:
                                                            if (str4.equals("s")) {
                                                                i6 = 7;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case nm7.B1 /* 117 */:
                                                            if (str4.equals("u")) {
                                                                i6 = 8;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3152:
                                                            if (str4.equals("br")) {
                                                                i6 = 9;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3240:
                                                            if (str4.equals("em")) {
                                                                i6 = 10;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3712:
                                                            if (str4.equals("tt")) {
                                                                i6 = 11;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 99339:
                                                            if (str4.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                                                i6 = 12;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 114240:
                                                            if (str4.equals("sub")) {
                                                                i6 = 13;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 114254:
                                                            if (str4.equals("sup")) {
                                                                i6 = 14;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3059181:
                                                            if (str4.equals("code")) {
                                                                i6 = 15;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3148879:
                                                            if (str4.equals("font")) {
                                                                i6 = 16;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3536714:
                                                            if (str4.equals("span")) {
                                                                i6 = 17;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 1438365596:
                                                            if (str4.equals("animated-emoji")) {
                                                                i6 = 18;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        default:
                                                            i6 = -1;
                                                            break;
                                                    }
                                                    switch (i6) {
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
                                                            i16 = 1;
                                                            break;
                                                    }
                                                } else if (ih9Var5 == null) {
                                                    ih9Var5 = ih9Var6;
                                                }
                                            }
                                        }
                                        TL_iv.RichText f2 = (ih9Var5 == null || (w = w(ih9Var5)) == null || w.length() == 0) ? null : zk9.f(w);
                                        if (i16 == 0) {
                                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                            f(spannableStringBuilder5, ih9Var2);
                                            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                            pageblockblockquote.collapsed = (ih9Var2.b("data-collapsed") || ih9Var2.b("collapsed")) ? 1 : i7;
                                            xk9.b(pageblockblockquote, L(spannableStringBuilder5));
                                            if (f2 != null) {
                                                pageblockblockquote.caption = f2;
                                            }
                                            arrayList2.add(new ll0(pageblockblockquote, i7, i7));
                                        } else {
                                            long a5 = wd9.a();
                                            int size6 = arrayList2.size();
                                            ArrayList arrayList5 = new ArrayList();
                                            int size7 = arrayList3.size();
                                            int i17 = i7;
                                            while (i17 < size7) {
                                                Object obj6 = arrayList3.get(i17);
                                                i17++;
                                                ih9 ih9Var7 = (ih9) obj6;
                                                if (ih9Var7.b || !"cite".equals(ih9Var7.a)) {
                                                    arrayList5.add(ih9Var7);
                                                }
                                            }
                                            A(arrayList5, arrayList2, hashMap);
                                            if (arrayList2.size() == size6) {
                                                i5 = 0;
                                                arrayList2.add(new ll0(new TL_iv.pageBlockParagraph(), 0, 0));
                                                while (size6 < arrayList2.size()) {
                                                    ((ll0) arrayList2.get(size6)).k.add(i5, Long.valueOf(a5));
                                                    size6++;
                                                }
                                                if (f2 != null && hashMap != null) {
                                                    hashMap.put(Long.valueOf(a5), f2);
                                                }
                                            }
                                            i5 = 0;
                                        }
                                        i3 = 0;
                                        break;
                                    }
                                    break;
                                case 25:
                                    TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                                    pageblockdetails.open = ih9Var2.b("open");
                                    pageblockdetails.blocks = new ArrayList<>();
                                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size8 = arrayList3.size();
                                    int i18 = i7;
                                    while (i18 < size8) {
                                        Object obj7 = arrayList3.get(i18);
                                        i18++;
                                        ih9 ih9Var8 = (ih9) obj7;
                                        if (ih9Var8.b || !"summary".equals(ih9Var8.a)) {
                                            arrayList6.add(ih9Var8);
                                        } else {
                                            e(spannableStringBuilder6, ih9Var8, 0, null, 0L);
                                        }
                                    }
                                    pageblockdetails.title = zk9.f(L(spannableStringBuilder6));
                                    arrayList2.add(new ll0(pageblockdetails, i7, i7));
                                    int size9 = arrayList2.size();
                                    A(arrayList6, arrayList2, hashMap);
                                    if (arrayList2.size() == size9) {
                                        arrayList2.add(new ll0(new TL_iv.pageBlockParagraph(), i7, i7));
                                    }
                                    ll0 ll0Var2 = new ll0(new TL_iv.pageBlockParagraph(), i7, i7);
                                    ll0Var2.i = true;
                                    arrayList2.add(ll0Var2);
                                    i3 = i7;
                                    break;
                                case 26:
                                    a(m(ih9Var2), arrayList2);
                                    i3 = i7;
                                    break;
                                default:
                                    if (!arrayList3.isEmpty()) {
                                        A(arrayList3, arrayList2, hashMap);
                                    }
                                    i3 = i7;
                                    break;
                            }
                            i7 = i3;
                            break;
                    }
                } else if (!x(ih9Var2.c)) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    spannableStringBuilder.append((CharSequence) q(ih9Var2.c));
                }
            }
            t(arrayList2, spannableStringBuilder);
            return;
        }
    }

    public static ll0 B(ih9 ih9Var, boolean z) {
        TL_iv.PageBlock pageblockslideshow = z ? new TL_iv.pageBlockSlideshow() : new TL_iv.pageBlockCollage();
        ArrayList c3 = ch9.c3(pageblockslideshow);
        ArrayList arrayList = ih9Var.e;
        int size = arrayList.size();
        CharSequence charSequence = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ih9 ih9Var2 = (ih9) obj;
            if (!ih9Var2.b) {
                if ("figcaption".equals(ih9Var2.a)) {
                    charSequence = w(ih9Var2);
                } else {
                    boolean equals = MediaStreamTrack.VIDEO_TRACK_KIND.equals(ih9Var2.a);
                    if (equals || "img".equals(ih9Var2.a)) {
                        long E = E(ih9Var2.a("src"));
                        if (E > 0) {
                            TL_iv.PageBlock y = y(E, equals, ih9Var2.b("data-spoiler"));
                            J(y);
                            c3.add(y);
                        }
                    }
                }
            }
        }
        if (c3.isEmpty()) {
            return null;
        }
        if (c3.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) c3.get(0);
            if (charSequence != null && charSequence.length() > 0) {
                I(pageBlock, charSequence);
            }
            return new ll0(pageBlock, 0, 0);
        }
        J(pageblockslideshow);
        if (charSequence != null && charSequence.length() > 0) {
            I(pageblockslideshow, charSequence);
        }
        return new ll0(pageblockslideshow, 0, 0);
    }

    public static int C(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str.trim());
        } catch (Exception unused) {
            return i;
        }
    }

    public static void D(ih9 ih9Var, ArrayList arrayList, int i, boolean z) {
        String a;
        ArrayList arrayList2;
        int i2;
        int i3 = i + 1;
        ArrayList arrayList3 = ih9Var.e;
        int size = arrayList3.size();
        int i4 = 1;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList3.get(i5);
            i5++;
            ih9 ih9Var2 = (ih9) obj;
            if (!ih9Var2.b && "li".equals(ih9Var2.a)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = ih9Var2.e;
                int size2 = arrayList5.size();
                int i6 = 0;
                while (i6 < size2) {
                    int i7 = i6 + 1;
                    ih9 ih9Var3 = (ih9) arrayList5.get(i6);
                    if (!ih9Var3.b && ("ul".equals(ih9Var3.a) || "ol".equals(ih9Var3.a))) {
                        arrayList4.add(ih9Var3);
                    } else if (ih9Var3.b) {
                        spannableStringBuilder.append((CharSequence) q(ih9Var3.c));
                    } else {
                        arrayList2 = arrayList5;
                        i2 = size2;
                        h(spannableStringBuilder, ih9Var3, 0, null, 0L);
                        arrayList5 = arrayList2;
                        i6 = i7;
                        size2 = i2;
                    }
                    arrayList2 = arrayList5;
                    i2 = size2;
                    arrayList5 = arrayList2;
                    i6 = i7;
                    size2 = i2;
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = zk9.f(L(spannableStringBuilder));
                ll0 ll0Var = new ll0(pageblockparagraph, i3, z ? i4 : 0);
                ll0Var.e = ih9Var2.b("data-checkbox") || ((a = ih9Var2.a("class")) != null && a.toLowerCase().contains("checkbox"));
                ll0Var.f = ih9Var2.b("data-checked");
                arrayList.add(ll0Var);
                int size3 = arrayList4.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj2 = arrayList4.get(i8);
                    i8++;
                    ih9 ih9Var4 = (ih9) obj2;
                    D(ih9Var4, arrayList, i3, "ol".equals(ih9Var4.a));
                }
                i4++;
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

    public static void F(StringBuilder sb, ArrayList arrayList, int[] iArr, int i, int i2, int i3, int i4, int i5, mi2 mi2Var, boolean z, int i6, HashMap hashMap) {
        int i7;
        ArrayList arrayList2;
        boolean z2;
        String str;
        String str2;
        StringBuilder sb2 = sb;
        ArrayList arrayList3 = arrayList;
        int i8 = i;
        mi2 mi2Var2 = mi2Var;
        int i9 = i6;
        ArrayList arrayList4 = mi2Var2.a;
        while (true) {
            int i10 = iArr[0];
            if (i10 > i8) {
                return;
            }
            ll0 ll0Var = (ll0) arrayList3.get(i10);
            if (!ll0Var.i) {
                if (ll0Var.k.size() > i9) {
                    mi2Var2.b(sb2);
                    Long l = (Long) ((ll0) arrayList3.get(iArr[0])).k.get(i9);
                    long longValue = l.longValue();
                    int i11 = iArr[0];
                    while (true) {
                        int i12 = i11 + 1;
                        if (i12 > i8) {
                            break;
                        }
                        ll0 ll0Var2 = (ll0) arrayList3.get(i12);
                        if (ll0Var2.k.size() <= i9 || ((Long) ll0Var2.k.get(i9)).longValue() != longValue) {
                            break;
                        } else {
                            i11 = i12;
                        }
                    }
                    sb2.append("<blockquote>");
                    int i13 = i11;
                    mi2 mi2Var3 = new mi2((byte) 2);
                    F(sb2, arrayList3, iArr, i13, i2, i3, i4, i5, mi2Var3, z, i9 + 1, hashMap);
                    mi2Var3.b(sb2);
                    c(sb2, hashMap != null ? k((TL_iv.RichText) hashMap.get(l)) : null);
                    sb2.append("</blockquote>");
                    i8 = i;
                    i9 = i6;
                } else {
                    if (ch9.t3(ll0Var)) {
                        mi2Var2.b(sb2);
                        ll0 ll0Var3 = (ll0) arrayList3.get(iArr[0]);
                        sb2.append(((TL_iv.pageBlockDetails) ll0Var3.b).open ? "<details open>" : "<details>");
                        sb2.append("<summary>");
                        g(sb2, K(ll0Var3, iArr[0], i2, i3, i4, i5));
                        sb2.append("</summary>");
                        iArr[0] = iArr[0] + 1;
                        mi2 mi2Var4 = new mi2((byte) 2);
                        F(sb2, arrayList3, iArr, i, i2, i3, i4, i5, mi2Var4, true, i6, hashMap);
                        arrayList2 = arrayList3;
                        i7 = i;
                        mi2Var4.b(sb2);
                        int i14 = iArr[0];
                        if (i14 <= i7 && i14 < arrayList2.size() && ((ll0) arrayList2.get(iArr[0])).i) {
                            iArr[0] = iArr[0] + 1;
                        }
                        sb2.append("</details>");
                    } else {
                        i7 = i;
                        arrayList2 = arrayList3;
                        boolean z3 = true;
                        if (ll0Var.c <= 0 || l(ll0Var.b) == null) {
                            mi2Var2.b(sb2);
                            int i15 = iArr[0];
                            TL_iv.PageBlock pageBlock = ll0Var.b;
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                sb2.append("<hr>");
                            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                                sb2.append("<div class=\"button-row\"");
                                if (pageblockbuttonrow.align_left) {
                                    sb2.append(" data-align=\"left\"");
                                } else if (pageblockbuttonrow.align_center) {
                                    sb2.append(" data-align=\"center\"");
                                } else if (pageblockbuttonrow.align_right) {
                                    sb2.append(" data-align=\"right\"");
                                } else {
                                    sb2.append(" data-align=\"fill\"");
                                }
                                sb2.append(">");
                                ArrayList<TL_keyboard.PageButton> arrayList5 = pageblockbuttonrow.buttons;
                                if (arrayList5 != null) {
                                    int size = arrayList5.size();
                                    int i16 = 0;
                                    while (i16 < size) {
                                        TL_keyboard.PageButton pageButton = arrayList5.get(i16);
                                        i16++;
                                        TL_keyboard.PageButton pageButton2 = pageButton;
                                        if (pageButton2 != null) {
                                            d(sb2, pageButton2.text, pageButton2.type, pageButton2.style);
                                        }
                                    }
                                }
                                sb2.append("</div>");
                            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                                H(sb2, (TL_iv.pageBlockTable) pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                                G(sb2, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, ll0Var.g, pageBlock);
                                sb2 = sb;
                            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                                sb2 = sb;
                                G(sb2, MediaStreamTrack.VIDEO_TRACK_KIND, ((TL_iv.pageBlockVideo) pageBlock).video_id, ll0Var.g, pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                                sb2 = sb;
                                G(sb2, MediaStreamTrack.AUDIO_TRACK_KIND, ((TL_iv.pageBlockAudio) pageBlock).audio_id, ll0Var.g, pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                                sb2 = sb;
                                G(sb2, "document", ((TL_iv.pageBlockDocument) pageBlock).document_id, ll0Var.g, pageBlock);
                            } else {
                                sb2 = sb;
                                String str3 = "<figcaption>";
                                if (ch9.x3(pageBlock)) {
                                    String str4 = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
                                    sb2.append("<div class=\"");
                                    sb2.append(str4);
                                    sb2.append("\">");
                                    ArrayList c3 = ch9.c3(pageBlock);
                                    if (c3 != null) {
                                        int i17 = 0;
                                        while (i17 < c3.size()) {
                                            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) c3.get(i17);
                                            ArrayList arrayList6 = ll0Var.h;
                                            i07 i07Var = (arrayList6 == null || i17 >= arrayList6.size()) ? null : (i07) ll0Var.h.get(i17);
                                            if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                                                z2 = z3;
                                                long j = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                                                if (j != 0) {
                                                    str = str3;
                                                    i(sb2, MediaStreamTrack.VIDEO_TRACK_KIND, j, i07Var, pageBlock2);
                                                } else {
                                                    str = str3;
                                                }
                                            } else {
                                                z2 = z3;
                                                str = str3;
                                                if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                                                    long j2 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                                                    if (j2 != 0) {
                                                        sb2 = sb;
                                                        i(sb2, "img", j2, i07Var, pageBlock2);
                                                        i17++;
                                                        str3 = str;
                                                        z3 = z2;
                                                    }
                                                }
                                            }
                                            sb2 = sb;
                                            i17++;
                                            str3 = str;
                                            z3 = z2;
                                        }
                                    }
                                    String str5 = str3;
                                    SpannableStringBuilder o = o(pageBlock);
                                    if (o != null && o.length() > 0) {
                                        sb2.append(str5);
                                        g(sb2, o);
                                        sb2.append("</figcaption>");
                                    }
                                    sb2.append("</div>");
                                } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                                    SpannableStringBuilder o2 = o(pageblockmap);
                                    boolean z4 = o2 != null && o2.length() > 0;
                                    if (z4) {
                                        sb2.append("<figure>");
                                    }
                                    sb2.append("<location");
                                    if (pageblockmap.geo != null) {
                                        sb2.append(" lat=\"");
                                        sb2.append(pageblockmap.geo.lat);
                                        sb2.append('\"');
                                        sb2.append(" long=\"");
                                        sb2.append(pageblockmap.geo._long);
                                        sb2.append('\"');
                                        if (pageblockmap.geo.access_hash != 0) {
                                            sb2.append(" access=\"");
                                            sb2.append(pageblockmap.geo.access_hash);
                                            sb2.append('\"');
                                        }
                                    }
                                    if (pageblockmap.zoom != 0) {
                                        sb2.append(" zoom=\"");
                                        sb2.append(pageblockmap.zoom);
                                        sb2.append('\"');
                                    }
                                    if (pageblockmap.w != 0) {
                                        sb2.append(" w=\"");
                                        sb2.append(pageblockmap.w);
                                        sb2.append('\"');
                                    }
                                    if (pageblockmap.h != 0) {
                                        sb2.append(" h=\"");
                                        sb2.append(pageblockmap.h);
                                        sb2.append('\"');
                                    }
                                    sb2.append(" />");
                                    if (z4) {
                                        sb2.append("<figcaption>");
                                        g(sb2, o2);
                                        sb2.append("</figcaption></figure>");
                                    }
                                } else {
                                    String l2 = l(pageBlock);
                                    if (l2 == null) {
                                        SpannableStringBuilder o3 = o(pageBlock);
                                        if (o3 != null && o3.length() > 0) {
                                            sb2.append("<p>");
                                            g(sb2, o3);
                                            sb2.append("</p>");
                                        }
                                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                        String str6 = ((TL_iv.pageBlockPreformatted) pageBlock).language;
                                        if (TextUtils.isEmpty(str6)) {
                                            sb2.append("<pre>");
                                        } else {
                                            sb2.append("<pre language=\"");
                                            sb2.append(s(str6));
                                            sb2.append("\">");
                                        }
                                        g(sb2, K(ll0Var, i15, i2, i3, i4, i5));
                                        sb2.append("</pre>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                                        sb2.append("<blockquote class=\"pull\">");
                                        g(sb2, K(ll0Var, i15, i2, i3, i4, i5));
                                        c(sb2, k(((TL_iv.pageBlockPullquote) pageBlock).caption));
                                        sb2.append("</blockquote>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                                        if (pageblockblockquote.collapsed) {
                                            sb2.append("<blockquote collapsed>");
                                        } else {
                                            sb2.append("<blockquote>");
                                        }
                                        g(sb2, K(ll0Var, i15, i2, i3, i4, i5));
                                        c(sb2, k(pageblockblockquote.caption));
                                        sb2.append("</blockquote>");
                                    } else {
                                        sb2.append('<');
                                        sb2.append(l2);
                                        sb2.append('>');
                                        g(sb2, K(ll0Var, i15, i2, i3, i4, i5));
                                        sb2.append("</");
                                        sb2.append(l2);
                                        sb2.append('>');
                                    }
                                }
                                iArr[0] = iArr[0] + 1;
                                mi2Var2 = mi2Var;
                            }
                            iArr[0] = iArr[0] + 1;
                            mi2Var2 = mi2Var;
                        } else {
                            int i18 = ll0Var.c;
                            boolean z5 = ll0Var.d > 0;
                            while (arrayList4.size() > i18) {
                                mi2Var2.a(sb2);
                            }
                            while (true) {
                                str2 = "<ul>";
                                if (arrayList4.size() >= i18) {
                                    break;
                                }
                                if (z5) {
                                    str2 = "<ol>";
                                }
                                sb2.append(str2);
                                arrayList4.add(Boolean.valueOf(z5));
                            }
                            if (!arrayList4.isEmpty() && ((Boolean) b10.f(1, arrayList4)).booleanValue() != z5) {
                                mi2Var2.a(sb2);
                                sb2.append(z5 ? "<ol>" : "<ul>");
                                arrayList4.add(Boolean.valueOf(z5));
                            }
                            sb2.append("<li>");
                            g(sb2, K(ll0Var, iArr[0], i2, i3, i4, i5));
                            sb2.append("</li>");
                            iArr[0] = iArr[0] + 1;
                        }
                    }
                    i9 = i6;
                    arrayList3 = arrayList2;
                    i8 = i7;
                }
            } else if (z) {
                return;
            } else {
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    public static void G(StringBuilder sb, String str, long j, i07 i07Var, TL_iv.PageBlock pageBlock) {
        if (j != 0) {
            SpannableStringBuilder o = o(pageBlock);
            boolean z = o != null && o.length() > 0;
            if (z) {
                sb.append("<figure>");
            }
            i(sb, str, j, i07Var, pageBlock);
            if (z) {
                sb.append("<figcaption>");
                g(sb, o);
                sb.append("</figcaption></figure>");
            }
        }
    }

    public static void H(StringBuilder sb, TL_iv.pageBlockTable pageblocktable) {
        ArrayList<TL_iv.pageTableCell> arrayList;
        sb.append("<table");
        if (pageblocktable.bordered) {
            sb.append(" border=\"1\"");
        }
        if (pageblocktable.striped || pageblocktable.compact) {
            sb.append(" class=\"");
            if (pageblocktable.striped) {
                sb.append("striped");
            }
            if (pageblocktable.striped && pageblocktable.compact) {
                sb.append(' ');
            }
            if (pageblocktable.compact) {
                sb.append("compact");
            }
            sb.append('\"');
        }
        sb.append('>');
        TL_iv.RichText richText = pageblocktable.title;
        SpannableStringBuilder r = richText != null ? zk9.r(richText, null, true) : null;
        if (r != null && r.length() > 0) {
            sb.append("<caption>");
            g(sb, r);
            sb.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i);
                i++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                sb.append("<tr>");
                if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                    int size2 = arrayList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        TL_iv.pageTableCell pagetablecell = arrayList.get(i2);
                        i2++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null) {
                            String str = pagetablecell2.header ? "th" : "td";
                            sb.append('<');
                            sb.append(str);
                            int i3 = pagetablecell2.colspan;
                            if (i3 <= 1) {
                                i3 = 0;
                            }
                            if (i3 > 0) {
                                sb.append(" colspan=\"");
                                sb.append(i3);
                                sb.append('\"');
                            }
                            int i4 = pagetablecell2.rowspan;
                            if (i4 <= 1) {
                                i4 = 0;
                            }
                            if (i4 > 0) {
                                sb.append(" rowspan=\"");
                                sb.append(i4);
                                sb.append('\"');
                            }
                            String str2 = pagetablecell2.align_right ? "right" : pagetablecell2.align_center ? "center" : null;
                            if (str2 != null) {
                                sb.append(" align=\"");
                                sb.append(str2);
                                sb.append('\"');
                            }
                            String str3 = pagetablecell2.valign_bottom ? "bottom" : pagetablecell2.valign_middle ? "middle" : null;
                            if (str3 != null) {
                                sb.append(" valign=\"");
                                sb.append(str3);
                                sb.append('\"');
                            }
                            sb.append('>');
                            g(sb, fhb.h(pagetablecell2));
                            sb.append("</");
                            sb.append(str);
                            sb.append('>');
                        }
                    }
                }
                sb.append("</tr>");
            }
        }
        sb.append("</table>");
    }

    public static void I(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = zk9.f(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static void J(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static CharSequence K(ll0 ll0Var, int i, int i2, int i3, int i4, int i5) {
        boolean t3 = ch9.t3(ll0Var);
        TL_iv.PageBlock pageBlock = ll0Var.b;
        CharSequence r = t3 ? zk9.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true) : xk9.z(pageBlock);
        if (r == null) {
            r = "";
        }
        int length = r.length();
        int max = i == i2 ? Math.max(0, Math.min(i4, length)) : 0;
        int max2 = i == i3 ? Math.max(0, Math.min(i5, length)) : length;
        if (max > max2) {
            int i6 = max;
            max = max2;
            max2 = i6;
        }
        return (max == 0 && max2 == length) ? r : r.subSequence(max, max2);
    }

    public static CharSequence L(SpannableStringBuilder spannableStringBuilder) {
        char charAt;
        int length = spannableStringBuilder.length();
        int i = 0;
        while (i < length && ((charAt = spannableStringBuilder.charAt(i)) == ' ' || charAt == '\n' || charAt == '\t' || charAt == '\r')) {
            i++;
        }
        while (length > i) {
            char charAt2 = spannableStringBuilder.charAt(length - 1);
            if (charAt2 != ' ' && charAt2 != '\n' && charAt2 != '\t' && charAt2 != '\r') {
                break;
            }
            length--;
        }
        return (i == 0 && length == spannableStringBuilder.length()) ? spannableStringBuilder : spannableStringBuilder.subSequence(i, length);
    }

    public static void a(ll0 ll0Var, ArrayList arrayList) {
        if (ll0Var != null) {
            arrayList.add(ll0Var);
        }
    }

    public static void b(ArrayList arrayList, TL_iv.PageBlock pageBlock, ih9 ih9Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, ih9Var, 0, null, 0L);
        xk9.b(pageBlock, L(spannableStringBuilder));
        arrayList.add(new ll0(pageBlock, 0, 0));
    }

    public static void c(StringBuilder sb, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null || spannableStringBuilder.length() == 0) {
            return;
        }
        sb.append("<cite>");
        g(sb, spannableStringBuilder);
        sb.append("</cite>");
    }

    public static void d(StringBuilder sb, TL_iv.RichText richText, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle) {
        if (qh9.c(inlineButtonType)) {
            sb.append("<button");
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                sb.append(" data-type=\"url\" data-url=\"");
                sb.append(s(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url));
                sb.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                sb.append(" data-type=\"copy\" data-copy-text=\"");
                sb.append(s(((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text));
                sb.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                sb.append(" data-type=\"user-profile\" data-user-id=\"");
                sb.append(((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id);
                sb.append("\"");
            }
            if (richButtonStyle != null) {
                wi8.z(" data-style=\"", richButtonStyle.bg_primary ? "primary" : richButtonStyle.bg_danger ? "danger" : richButtonStyle.bg_success ? "success" : "default", "\"", sb);
            }
            sb.append(">");
            g(sb, zk9.r(richText, null, true));
            sb.append("</button>");
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, ih9 ih9Var, int i, String str, long j) {
        SpannableStringBuilder spannableStringBuilder2;
        int i2;
        String str2;
        long j2;
        ArrayList arrayList = ih9Var.e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ih9 ih9Var2 = (ih9) obj;
            if (ih9Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                i2 = i;
                str2 = str;
                j2 = j;
                j(spannableStringBuilder2, q(ih9Var2.c), i2, str2, j2);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                i2 = i;
                str2 = str;
                j2 = j;
                h(spannableStringBuilder2, ih9Var2, i2, str2, j2);
            }
            spannableStringBuilder = spannableStringBuilder2;
            i = i2;
            str = str2;
            j = j2;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, ih9 ih9Var) {
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList = ih9Var.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ih9 ih9Var2 = (ih9) obj;
            if (ih9Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                j(spannableStringBuilder2, q(ih9Var2.c), 0, null, 0L);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                if (!"cite".equals(ih9Var2.a)) {
                    h(spannableStringBuilder2, ih9Var2, 0, null, 0L);
                }
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(StringBuilder sb, CharSequence charSequence) {
        int i;
        qh9 qh9Var;
        long j;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        int i11 = 0;
        if (!(charSequence instanceof Spanned)) {
            r(sb, charSequence, 0, charSequence.length());
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        int length = charSequence.length();
        int i12 = 0;
        while (i12 < length) {
            qh9[] qh9VarArr = (qh9[]) spanned.getSpans(i12, Math.min(length, i12 + 1), qh9.class);
            int length2 = qh9VarArr.length;
            int i13 = i11;
            while (true) {
                if (i13 >= length2) {
                    i = -1;
                    qh9Var = null;
                    break;
                }
                qh9Var = qh9VarArr[i13];
                int spanStart = spanned.getSpanStart(qh9Var);
                i = spanned.getSpanEnd(qh9Var);
                if (spanStart <= i12 && i > i12) {
                    break;
                } else {
                    i13++;
                }
            }
            if (qh9Var != null) {
                TL_iv.textButton textbutton = qh9Var.a;
                if (textbutton != null && qh9.c(textbutton.type)) {
                    d(sb, textbutton.text, textbutton.type, textbutton.style);
                }
                i12 = Math.min(length, i);
            } else {
                int nextSpanTransition = spanned.nextSpanTransition(i12, length, CharacterStyle.class);
                xkb[] xkbVarArr = (xkb[]) spanned.getSpans(i12, nextSpanTransition, xkb.class);
                int length3 = xkbVarArr.length;
                int i14 = i11;
                int i15 = i14;
                while (i14 < length3) {
                    wkb wkbVar = xkbVarArr[i14].b;
                    if (wkbVar != null) {
                        i15 |= wkbVar.a;
                    }
                    i14++;
                }
                i6c[] i6cVarArr = (i6c[]) spanned.getSpans(i12, nextSpanTransition, i6c.class);
                String url = i6cVarArr.length > 0 ? i6cVarArr[i11].getURL() : null;
                gn[] gnVarArr = (gn[]) spanned.getSpans(i12, nextSpanTransition, gn.class);
                if (gnVarArr.length > 0) {
                    gn gnVar = gnVarArr[i11];
                    if (!gnVar.standard) {
                        j = gnVar.getDocumentId();
                        i2 = i15 & 256;
                        if (i2 != 0) {
                            sb.append("<spoiler>");
                        }
                        i3 = i15 & 1;
                        if (i3 != 0) {
                            sb.append("<b>");
                        }
                        i4 = i15 & 2;
                        if (i4 != 0) {
                            sb.append("<i>");
                        }
                        i5 = i15 & 16;
                        if (i5 != 0) {
                            sb.append("<u>");
                        }
                        i6 = i15 & 8;
                        if (i6 != 0) {
                            sb.append("<s>");
                        }
                        i7 = i15 & 4;
                        Spanned spanned2 = spanned;
                        if (i7 != 0) {
                            sb.append("<code>");
                        }
                        i8 = i15 & TLObject.FLAG_14;
                        if (i8 != 0) {
                            sb.append("<sub>");
                        }
                        i9 = 32768 & i15;
                        if (i9 != 0) {
                            sb.append("<sup>");
                        }
                        i10 = i15 & 65536;
                        if (i10 != 0) {
                            sb.append("<mark>");
                        }
                        if (url != null) {
                            sb.append("<a href=\"");
                            sb.append(s(url));
                            sb.append("\">");
                        }
                        if (j != 0) {
                            sb.append("<animated-emoji data-document-id=\"");
                            sb.append(j);
                            sb.append("\">");
                        }
                        r(sb, charSequence, i12, nextSpanTransition);
                        if (j != 0) {
                            sb.append("</animated-emoji>");
                        }
                        if (url != null) {
                            sb.append("</a>");
                        }
                        if (i10 != 0) {
                            sb.append("</mark>");
                        }
                        if (i9 != 0) {
                            sb.append("</sup>");
                        }
                        if (i8 != 0) {
                            sb.append("</sub>");
                        }
                        if (i7 != 0) {
                            sb.append("</code>");
                        }
                        if (i6 != 0) {
                            sb.append("</s>");
                        }
                        if (i5 != 0) {
                            sb.append("</u>");
                        }
                        if (i4 != 0) {
                            sb.append("</i>");
                        }
                        if (i3 != 0) {
                            sb.append("</b>");
                        }
                        if (i2 != 0) {
                            sb.append("</spoiler>");
                        }
                        i12 = nextSpanTransition;
                        spanned = spanned2;
                        i11 = 0;
                    }
                }
                j = 0;
                i2 = i15 & 256;
                if (i2 != 0) {
                }
                i3 = i15 & 1;
                if (i3 != 0) {
                }
                i4 = i15 & 2;
                if (i4 != 0) {
                }
                i5 = i15 & 16;
                if (i5 != 0) {
                }
                i6 = i15 & 8;
                if (i6 != 0) {
                }
                i7 = i15 & 4;
                Spanned spanned22 = spanned;
                if (i7 != 0) {
                }
                i8 = i15 & TLObject.FLAG_14;
                if (i8 != 0) {
                }
                i9 = 32768 & i15;
                if (i9 != 0) {
                }
                i10 = i15 & 65536;
                if (i10 != 0) {
                }
                if (url != null) {
                }
                if (j != 0) {
                }
                r(sb, charSequence, i12, nextSpanTransition);
                if (j != 0) {
                }
                if (url != null) {
                }
                if (i10 != 0) {
                }
                if (i9 != 0) {
                }
                if (i8 != 0) {
                }
                if (i7 != 0) {
                }
                if (i6 != 0) {
                }
                if (i5 != 0) {
                }
                if (i4 != 0) {
                }
                if (i3 != 0) {
                }
                if (i2 != 0) {
                }
                i12 = nextSpanTransition;
                spanned = spanned22;
                i11 = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(SpannableStringBuilder spannableStringBuilder, ih9 ih9Var, int i, String str, long j) {
        int i2;
        String str2;
        int i3;
        long j2;
        TL_keyboard.InlineButtonType v;
        if ("button".equals(ih9Var.a) && (v = v(ih9Var)) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            e(spannableStringBuilder2, ih9Var, i, str, j);
            if (spannableStringBuilder2.length() > 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                TL_iv.textButton textbutton = new TL_iv.textButton();
                textbutton.text = zk9.f(spannableStringBuilder2);
                textbutton.type = v;
                textbutton.style = u(ih9Var);
                spannableStringBuilder.setSpan(new qh9(textbutton), length, spannableStringBuilder.length(), 33);
            }
            return;
        }
        String str3 = ih9Var.a;
        str3.getClass();
        switch (str3) {
            case "spoiler":
                i2 = i | 256;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty() || ih9Var.b) {
                    e(spannableStringBuilder, ih9Var, i2, str2, j2);
                    break;
                }
                break;
            case "strike":
            case "s":
            case "del":
                i2 = i | 8;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, ih9Var, i2, str2, j2);
                break;
            case "strong":
            case "b":
                i2 = i | 1;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, ih9Var, i2, str2, j2);
                break;
            case "a":
                String a = ih9Var.a("href");
                if (a != null) {
                    str2 = a;
                    i2 = i;
                    j2 = j;
                    if (ih9Var.e.isEmpty()) {
                    }
                    e(spannableStringBuilder, ih9Var, i2, str2, j2);
                    break;
                }
                i2 = i;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, ih9Var, i2, str2, j2);
                break;
            case "i":
            case "em":
                i2 = i | 2;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, ih9Var, i2, str2, j2);
                break;
            case "u":
                i2 = i | 16;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, ih9Var, i2, str2, j2);
                break;
            case "br":
                j(spannableStringBuilder, "\n", i, str, j);
                break;
            case "tt":
            case "code":
                i2 = i | 4;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, ih9Var, i2, str2, j2);
                break;
            case "sub":
                i2 = i | TLObject.FLAG_14;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, ih9Var, i2, str2, j2);
                break;
            case "sup":
                i3 = 32768;
                i2 = i3 | i;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, ih9Var, i2, str2, j2);
                break;
            case "mark":
                i3 = 65536;
                i2 = i3 | i;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, ih9Var, i2, str2, j2);
                break;
            case "animated-emoji":
                String a2 = ih9Var.a("data-document-id");
                if (a2 != null) {
                    try {
                        j2 = Long.parseLong(a2.trim());
                        i2 = i;
                        str2 = str;
                    } catch (Exception unused) {
                    }
                    if (ih9Var.e.isEmpty()) {
                    }
                    e(spannableStringBuilder, ih9Var, i2, str2, j2);
                    break;
                }
                i2 = i;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, ih9Var, i2, str2, j2);
                break;
            default:
                i2 = i;
                str2 = str;
                j2 = j;
                if (ih9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, ih9Var, i2, str2, j2);
                break;
        }
    }

    public static void i(StringBuilder sb, String str, long j, i07 i07Var, TL_iv.PageBlock pageBlock) {
        sb.append('<');
        sb.append(str);
        sb.append(" src=\"");
        sb.append(j);
        sb.append('\"');
        if (i07Var != null) {
            if (i07Var.j > 0) {
                sb.append(" width=\"");
                sb.append(i07Var.j);
                sb.append('\"');
            }
            if (i07Var.k > 0) {
                sb.append(" height=\"");
                sb.append(i07Var.k);
                sb.append('\"');
            }
        }
        if ((pageBlock instanceof TL_iv.pageBlockPhoto) && ((TL_iv.pageBlockPhoto) pageBlock).spoiler) {
            sb.append(" data-spoiler=\"1\"");
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && ((TL_iv.pageBlockVideo) pageBlock).spoiler) {
            sb.append(" data-spoiler=\"1\"");
        }
        sb.append(" />");
    }

    public static void j(SpannableStringBuilder spannableStringBuilder, String str, int i, String str2, long j) {
        if (str.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            int length2 = spannableStringBuilder.length();
            if (j != 0) {
                spannableStringBuilder.setSpan(new gn(j, (Paint.FontMetricsInt) null), length, length2, 33);
            }
            if (i != 0) {
                wkb wkbVar = new wkb();
                wkbVar.a = i & 114975;
                spannableStringBuilder.setSpan(new xkb(wkbVar, gm.L(gda.S0)), length, length2, 33);
            }
            if (str2 != null) {
                spannableStringBuilder.setSpan(zk9.k(str2), length, length2, 33);
            }
        }
    }

    public static SpannableStringBuilder k(TL_iv.RichText richText) {
        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
            SpannableStringBuilder r = zk9.r(richText, null, true);
            if (r.length() > 0) {
                return r;
            }
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ll0 m(ih9 ih9Var) {
        double parseDouble;
        String a;
        String str = ih9Var.a;
        str.getClass();
        switch (str) {
            case "div":
                String a2 = ih9Var.a("class");
                String lowerCase = a2 == null ? "" : a2.toLowerCase();
                if (lowerCase.contains("slideshow")) {
                    return B(ih9Var, true);
                }
                if (lowerCase.contains("collage")) {
                    return B(ih9Var, false);
                }
                return null;
            case "img":
                return n(ih9Var, false);
            case "audio":
                long E = E(ih9Var.a("src"));
                if (E <= 0) {
                    return null;
                }
                TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
                pageblockaudio.audio_id = E;
                J(pageblockaudio);
                return new ll0(pageblockaudio, 0, 0);
            case "video":
                return n(ih9Var, true);
            case "document":
                long E2 = E(ih9Var.a("src"));
                if (E2 <= 0) {
                    return null;
                }
                TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
                pageblockdocument.document_id = E2;
                J(pageblockdocument);
                return new ll0(pageblockdocument, 0, 0);
            case "location":
                TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                String a3 = ih9Var.a("lat");
                double d = 0.0d;
                if (a3 != null) {
                    try {
                        parseDouble = Double.parseDouble(a3.trim());
                    } catch (Exception unused) {
                    }
                    tL_geoPoint.lat = parseDouble;
                    a = ih9Var.a("long");
                    if (a != null) {
                        try {
                            d = Double.parseDouble(a.trim());
                        } catch (Exception unused2) {
                        }
                    }
                    tL_geoPoint._long = d;
                    tL_geoPoint.access_hash = E(ih9Var.a("access"));
                    pageblockmap.geo = tL_geoPoint;
                    pageblockmap.zoom = C(15, ih9Var.a("zoom"));
                    pageblockmap.w = C(600, ih9Var.a("w"));
                    pageblockmap.h = C(400, ih9Var.a("h"));
                    J(pageblockmap);
                    return new ll0(pageblockmap, 0, 0);
                }
                parseDouble = 0.0d;
                tL_geoPoint.lat = parseDouble;
                a = ih9Var.a("long");
                if (a != null) {
                }
                tL_geoPoint._long = d;
                tL_geoPoint.access_hash = E(ih9Var.a("access"));
                pageblockmap.geo = tL_geoPoint;
                pageblockmap.zoom = C(15, ih9Var.a("zoom"));
                pageblockmap.w = C(600, ih9Var.a("w"));
                pageblockmap.h = C(400, ih9Var.a("h"));
                J(pageblockmap);
                return new ll0(pageblockmap, 0, 0);
            default:
                return null;
        }
    }

    public static ll0 n(ih9 ih9Var, boolean z) {
        long E = E(ih9Var.a("src"));
        if (E <= 0) {
            return null;
        }
        TL_iv.PageBlock y = y(E, z, ih9Var.b("data-spoiler"));
        J(y);
        return new ll0(y, 0, 0);
    }

    public static SpannableStringBuilder o(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        if (pageBlock != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            SpannableStringBuilder r = zk9.r(richText, null, true);
            if (r.length() > 0) {
                return r;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static void p(ih9 ih9Var, TL_iv.pageBlockTable pageblocktable) {
        String lowerCase;
        int indexOf;
        ArrayList arrayList = ih9Var.e;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ih9 ih9Var2 = (ih9) obj;
            if (!ih9Var2.b) {
                String str = ih9Var2.a;
                str.getClass();
                int i3 = -1;
                switch (str.hashCode()) {
                    case 3710:
                        if (str.equals("tr")) {
                            i3 = i;
                            break;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            i3 = 1;
                            break;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            i3 = 2;
                            break;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            i3 = 3;
                            break;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            i3 = 4;
                            break;
                        }
                        break;
                }
                switch (i3) {
                    case 0:
                        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        pagetablerow.cells = new ArrayList<>();
                        ArrayList arrayList3 = ih9Var2.e;
                        int size2 = arrayList3.size();
                        int i4 = i;
                        while (i4 < size2) {
                            Object obj2 = arrayList3.get(i4);
                            i4++;
                            ih9 ih9Var3 = (ih9) obj2;
                            if (!ih9Var3.b) {
                                if ("td".equals(ih9Var3.a) || "th".equals(ih9Var3.a)) {
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    pagetablecell.colspan = C(i, ih9Var3.a("colspan"));
                                    pagetablecell.rowspan = C(i, ih9Var3.a("rowspan"));
                                    fhb.d(pagetablecell, w(ih9Var3));
                                    fhb.l(pagetablecell, ("th".equals(ih9Var3.a) || ih9Var3.b("header")) ? 1 : i);
                                    String a = ih9Var3.a("align");
                                    if (a == null) {
                                        String a2 = ih9Var3.a("style");
                                        if (a2 != null && (indexOf = (lowerCase = a2.toLowerCase()).indexOf("text-align")) >= 0) {
                                            if (lowerCase.indexOf("center", indexOf) >= 0) {
                                                a = "center";
                                            } else if (lowerCase.indexOf("right", indexOf) >= 0) {
                                                a = "right";
                                            }
                                        }
                                        a = null;
                                    }
                                    if ("center".equalsIgnoreCase(a)) {
                                        fhb.k(pagetablecell, 1);
                                    } else if ("right".equalsIgnoreCase(a)) {
                                        fhb.k(pagetablecell, 2);
                                    }
                                    String a3 = ih9Var3.a("valign");
                                    if ("middle".equalsIgnoreCase(a3)) {
                                        fhb.m(pagetablecell, 1);
                                    } else if ("bottom".equalsIgnoreCase(a3)) {
                                        fhb.m(pagetablecell, 2);
                                    }
                                    pagetablerow.cells.add(pagetablecell);
                                }
                            }
                            i = 0;
                        }
                        if (pagetablerow.cells.isEmpty()) {
                            pagetablerow.cells.add(fhb.f());
                        }
                        arrayList2.add(pagetablerow);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        p(ih9Var2, pageblocktable);
                        break;
                    case 4:
                        pageblocktable.title = zk9.f(w(ih9Var2));
                        break;
                }
                i = 0;
            }
        }
    }

    public static String q(String str) {
        String substring;
        String str2;
        if (str == null) {
            return "";
        }
        if (str.indexOf(38) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '&') {
                sb.append(charAt);
            } else {
                int i2 = i + 1;
                int indexOf = str.indexOf(59, i2);
                if (indexOf < 0 || indexOf - i > 12) {
                    sb.append(charAt);
                } else {
                    substring = str.substring(i2, indexOf);
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
                                    str2 = new String(Character.toChars((substring.charAt(1) == 'x' || substring.charAt(1) == 'X') ? Integer.parseInt(substring.substring(2), 16) : Integer.parseInt(substring.substring(1))));
                                    break;
                                } catch (Exception unused) {
                                    break;
                                }
                            }
                            break;
                    }
                    if (str2 != null) {
                        sb.append(str2);
                        i = indexOf;
                    } else {
                        sb.append(charAt);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    public static void r(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\n') {
                sb.append("<br>");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else {
                sb.append(charAt);
            }
            i++;
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
        pageblockparagraph.text = zk9.f(L(spannableStringBuilder));
        arrayList.add(new ll0(pageblockparagraph, 0, 0));
    }

    public static TL_keyboard.RichButtonStyle u(ih9 ih9Var) {
        TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
        String a = ih9Var.a("data-style");
        richButtonStyle.bg_primary = "primary".equals(a);
        richButtonStyle.bg_danger = "danger".equals(a);
        richButtonStyle.bg_success = "success".equals(a);
        return richButtonStyle;
    }

    public static TL_keyboard.InlineButtonType v(ih9 ih9Var) {
        String a = ih9Var.a("data-type");
        if ("url".equals(a)) {
            String a2 = ih9Var.a("data-url");
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
            tL_inlineButtonTypeUrl.url = a2;
            return tL_inlineButtonTypeUrl;
        }
        if ("copy".equals(a)) {
            String a3 = ih9Var.a("data-copy-text");
            if (TextUtils.isEmpty(a3)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
            tL_inlineButtonTypeCopy.copy_text = a3;
            return tL_inlineButtonTypeCopy;
        }
        if (!"user-profile".equals(a)) {
            return null;
        }
        long E = E(ih9Var.a("data-user-id"));
        if (E <= 0) {
            return null;
        }
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = E;
        return tL_inlineButtonTypeUserProfile;
    }

    public static CharSequence w(ih9 ih9Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, ih9Var, 0, null, 0L);
        return L(spannableStringBuilder);
    }

    public static boolean x(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\t' && charAt != '\r' && charAt != 160) {
                return false;
            }
        }
        return true;
    }

    public static TL_iv.PageBlock y(long j, boolean z, boolean z2) {
        if (z) {
            TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
            if (j <= 0) {
                j = 0;
            }
            pageblockvideo.video_id = j;
            pageblockvideo.spoiler = z2;
            return pageblockvideo;
        }
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        if (j <= 0) {
            j = 0;
        }
        pageblockphoto.photo_id = j;
        pageblockphoto.spoiler = z2;
        return pageblockphoto;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x029d, code lost:
    
        if (r5.equals("hr") == false) goto L170;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList z(String str, HashMap hashMap) {
        int indexOf;
        char c;
        int i;
        String str2;
        int i2;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            while (true) {
                if (i3 < str.length()) {
                    char c2 = 1;
                    if (str.charAt(i3) != '<') {
                        indexOf = str.indexOf(60, i3);
                        if (indexOf < 0) {
                            indexOf = str.length();
                        }
                        String substring = str.substring(i3, indexOf);
                        if (!substring.isEmpty()) {
                            ih9 ih9Var = new ih9();
                            ih9Var.b = true;
                            ih9Var.c = substring;
                            if (arrayList3.isEmpty()) {
                                arrayList2.add(ih9Var);
                            } else {
                                ((ih9) b10.f(1, arrayList3)).e.add(ih9Var);
                            }
                        }
                    } else if (str.startsWith("<!--", i3)) {
                        int indexOf2 = str.indexOf("-->", i3 + 4);
                        i3 = indexOf2 < 0 ? str.length() : indexOf2 + 3;
                    } else if (i3 + 1 < str.length() && str.charAt(i3 + 1) == '!') {
                        int indexOf3 = str.indexOf(62, i3);
                        i3 = indexOf3 < 0 ? str.length() : indexOf3 + 1;
                    } else if (i3 + 1 >= str.length() || str.charAt(i3 + 1) != '/') {
                        int i4 = i3 + 1;
                        boolean z = false;
                        char c3 = 0;
                        while (true) {
                            c = '\'';
                            if (i4 < str.length()) {
                                char charAt = str.charAt(i4);
                                if (z) {
                                    if (charAt == c3) {
                                        z = false;
                                    }
                                } else if (charAt == '\"' || charAt == '\'') {
                                    z = true;
                                    c3 = charAt;
                                } else if (charAt == '>') {
                                }
                                i4++;
                            } else {
                                i4 = -1;
                            }
                        }
                        if (i4 >= 0) {
                            String substring2 = str.substring(i3 + 1, i4);
                            indexOf = i4 + 1;
                            boolean endsWith = substring2.endsWith("/");
                            if (endsWith) {
                                substring2 = ts2.m(1, 0, substring2);
                            }
                            String trim = substring2.trim();
                            ih9 ih9Var2 = null;
                            if (!trim.isEmpty()) {
                                int i5 = 0;
                                while (i5 < trim.length() && !ave.a(trim.charAt(i5))) {
                                    i5++;
                                }
                                String lowerCase = trim.substring(0, i5).toLowerCase();
                                if (!lowerCase.isEmpty()) {
                                    ih9Var2 = new ih9();
                                    ih9Var2.a = lowerCase;
                                    while (i5 < trim.length()) {
                                        while (i5 < trim.length() && ave.a(trim.charAt(i5))) {
                                            i5++;
                                        }
                                        if (i5 < trim.length()) {
                                            int i6 = i5;
                                            while (i6 < trim.length() && trim.charAt(i6) != '=' && !ave.a(trim.charAt(i6))) {
                                                i6++;
                                            }
                                            String lowerCase2 = trim.substring(i5, i6).toLowerCase();
                                            while (i6 < trim.length() && ave.a(trim.charAt(i6))) {
                                                i6++;
                                            }
                                            if (i6 >= trim.length() || trim.charAt(i6) != '=') {
                                                i = i6;
                                                str2 = "";
                                            } else {
                                                do {
                                                    i6++;
                                                    if (i6 < trim.length()) {
                                                    }
                                                    if (i6 < trim.length() || !(trim.charAt(i6) == '\"' || trim.charAt(i6) == c)) {
                                                        i2 = i6;
                                                        while (i2 < trim.length() && !ave.a(trim.charAt(i2))) {
                                                            i2++;
                                                        }
                                                        str2 = trim.substring(i6, i2);
                                                        i = i2;
                                                    } else {
                                                        char charAt2 = trim.charAt(i6);
                                                        int i7 = i6 + 1;
                                                        i = i7;
                                                        while (i < trim.length() && trim.charAt(i) != charAt2) {
                                                            i++;
                                                        }
                                                        str2 = trim.substring(i7, Math.min(i, trim.length()));
                                                        if (i < trim.length()) {
                                                            i++;
                                                        }
                                                    }
                                                } while (ave.a(trim.charAt(i6)));
                                                if (i6 < trim.length()) {
                                                }
                                                i2 = i6;
                                                while (i2 < trim.length()) {
                                                    i2++;
                                                }
                                                str2 = trim.substring(i6, i2);
                                                i = i2;
                                            }
                                            if (!lowerCase2.isEmpty()) {
                                                HashMap hashMap2 = ih9Var2.d;
                                                if (hashMap2 == null) {
                                                    hashMap2 = new HashMap();
                                                    ih9Var2.d = hashMap2;
                                                }
                                                hashMap2.put(lowerCase2, q(str2));
                                            }
                                            i5 = i;
                                            c = '\'';
                                        }
                                    }
                                }
                            }
                            if (ih9Var2 != null) {
                                if (arrayList3.isEmpty()) {
                                    arrayList2.add(ih9Var2);
                                } else {
                                    ((ih9) b10.f(1, arrayList3)).e.add(ih9Var2);
                                }
                                if (!endsWith) {
                                    String str3 = ih9Var2.a;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case 3152:
                                            if (str3.equals("br")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3338:
                                            break;
                                        case 104387:
                                            if (str3.equals("img")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 117511:
                                            if (str3.equals("wbr")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3321850:
                                            if (str3.equals("link")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3347973:
                                            if (str3.equals("meta")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 100358090:
                                            if (str3.equals("input")) {
                                                c2 = 6;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                            break;
                                        default:
                                            arrayList3.add(ih9Var2);
                                            break;
                                    }
                                }
                            }
                        } else {
                            String substring3 = str.substring(i3);
                            if (!substring3.isEmpty()) {
                                ih9 ih9Var3 = new ih9();
                                ih9Var3.b = true;
                                ih9Var3.c = substring3;
                                if (arrayList3.isEmpty()) {
                                    arrayList2.add(ih9Var3);
                                } else {
                                    ((ih9) b10.f(1, arrayList3)).e.add(ih9Var3);
                                }
                            }
                        }
                    } else {
                        int indexOf4 = str.indexOf(62, i3);
                        String lowerCase3 = str.substring(i3 + 2, indexOf4 < 0 ? str.length() : indexOf4).trim().toLowerCase();
                        indexOf = indexOf4 < 0 ? str.length() : indexOf4 + 1;
                        int size = arrayList3.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                if (((ih9) arrayList3.get(size)).a.equals(lowerCase3)) {
                                    while (arrayList3.size() > size) {
                                        td4.w(1, arrayList3);
                                    }
                                } else {
                                    size--;
                                }
                            }
                        }
                    }
                    i3 = indexOf;
                }
            }
            A(arrayList2, arrayList, hashMap);
            if (arrayList.isEmpty()) {
                arrayList.add(new ll0(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        }
        return arrayList;
    }
}
