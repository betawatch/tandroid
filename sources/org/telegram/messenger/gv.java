package org.telegram.messenger;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IdentityHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class gv {
    public final ArrayList a;
    public final int b;

    public gv(int i3, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i3;
    }

    public static void a(TL_iv.RichText richText, ArrayList arrayList) {
        if (richText == null || g(richText) <= 0) {
            return;
        }
        arrayList.add(richText);
    }

    public static void b(TL_iv.RichText richText, StringBuilder sb2, ArrayList arrayList) {
        TLRPC.MessageEntity messageEntity;
        int length;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textImage)) {
            return;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            if (str != null) {
                sb2.append(str);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textMath) {
            String str2 = ((TL_iv.textMath) richText).source;
            if (str2 != null) {
                sb2.append(str2);
                return;
            }
            return;
        }
        int length2 = sb2.length();
        if (richText instanceof TL_iv.textCustomEmoji) {
            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
            sb2.append(TextUtils.isEmpty(textcustomemoji.alt) ? "😀" : textcustomemoji.alt);
            if (arrayList != null) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                tL_messageEntityCustomEmoji.document_id = textcustomemoji.document_id;
                int length3 = sb2.length();
                if (length3 <= length2) {
                    return;
                }
                tL_messageEntityCustomEmoji.offset = length2;
                tL_messageEntityCustomEmoji.length = length3 - length2;
                arrayList.add(tL_messageEntityCustomEmoji);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList2 = richText.texts;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                TL_iv.RichText richText2 = arrayList2.get(i3);
                i3++;
                b(richText2, sb2, arrayList);
            }
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            b(mi.d6.j(textdiff.text) ? textdiff.old_text : textdiff.text, sb2, arrayList);
            return;
        }
        b(richText.text, sb2, arrayList);
        if (arrayList == null) {
            return;
        }
        if (richText instanceof TL_iv.textBold) {
            messageEntity = new TLRPC.TL_messageEntityBold();
        } else if (richText instanceof TL_iv.textItalic) {
            messageEntity = new TLRPC.TL_messageEntityItalic();
        } else if (richText instanceof TL_iv.textUnderline) {
            messageEntity = new TLRPC.TL_messageEntityUnderline();
        } else if (richText instanceof TL_iv.textStrike) {
            messageEntity = new TLRPC.TL_messageEntityStrike();
        } else if (richText instanceof TL_iv.textFixed) {
            messageEntity = new TLRPC.TL_messageEntityCode();
        } else if (richText instanceof TL_iv.textSpoiler) {
            messageEntity = new TLRPC.TL_messageEntitySpoiler();
        } else if (richText instanceof TL_iv.textUrl) {
            TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
            tL_messageEntityTextUrl.url = ((TL_iv.textUrl) richText).url;
            messageEntity = tL_messageEntityTextUrl;
        } else {
            messageEntity = null;
        }
        if (messageEntity == null || (length = sb2.length()) <= length2) {
            return;
        }
        messageEntity.offset = length2;
        messageEntity.length = length - length2;
        arrayList.add(messageEntity);
    }

    public static boolean c(zi ziVar) {
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        cv cvVar;
        return (ziVar == null || (message = ziVar.k) == null || (richMessage = message.rich_message) == null || (cvVar = ziVar.w2) == null || cvVar.c != richMessage) ? false : true;
    }

    public static void d(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockThinking) || (pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                a(pageBlock.text, arrayList2);
            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                String str = ((TL_iv.pageBlockMath) pageBlock).source;
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.textMath textmath = new TL_iv.textMath();
                    textmath.source = str;
                    arrayList2.add(textmath);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                a(pageBlock.text, arrayList2);
                a(((TL_iv.pageBlockBlockquote) pageBlock).caption, arrayList2);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                d(pageblockblockquoteblocks.blocks, arrayList2);
                a(pageblockblockquoteblocks.caption, arrayList2);
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                a(pageBlock.text, arrayList2);
                a(((TL_iv.pageBlockPullquote) pageBlock).caption, arrayList2);
            } else if (pageBlock instanceof TL_iv.pageBlockList) {
                ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
                int size2 = arrayList3.size();
                int i10 = 0;
                while (i10 < size2) {
                    TL_iv.PageListItem pageListItem = arrayList3.get(i10);
                    i10++;
                    TL_iv.PageListItem pageListItem2 = pageListItem;
                    if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                        a(((TL_iv.TL_pageListItemText) pageListItem2).text, arrayList2);
                    } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                        d(((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, arrayList2);
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                ArrayList<TL_iv.PageListOrderedItem> arrayList4 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
                int size3 = arrayList4.size();
                int i11 = 0;
                while (i11 < size3) {
                    TL_iv.PageListOrderedItem pageListOrderedItem = arrayList4.get(i11);
                    i11++;
                    TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                    if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                        a(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, arrayList2);
                    } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        d(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, arrayList2);
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                a(pageblocktable.title, arrayList2);
                ArrayList<TL_iv.pageTableRow> arrayList5 = pageblocktable.rows;
                int size4 = arrayList5.size();
                int i12 = 0;
                while (i12 < size4) {
                    TL_iv.pageTableRow pagetablerow = arrayList5.get(i12);
                    i12++;
                    ArrayList<TL_iv.pageTableCell> arrayList6 = pagetablerow.cells;
                    int size5 = arrayList6.size();
                    int i13 = 0;
                    while (i13 < size5) {
                        TL_iv.pageTableCell pagetablecell = arrayList6.get(i13);
                        i13++;
                        a(pagetablecell.text, arrayList2);
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                a(pageblockdetails.title, arrayList2);
                d(pageblockdetails.blocks, arrayList2);
            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockMap)) {
                TL_iv.PageCaption pageCaption = pageBlock.caption;
                if (pageCaption != null) {
                    a(pageCaption.text, arrayList2);
                    a(pageCaption.credit, arrayList2);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                d(((TL_iv.pageBlockCollage) pageBlock).items, arrayList2);
                TL_iv.PageCaption pageCaption2 = pageBlock.caption;
                if (pageCaption2 != null) {
                    a(pageCaption2.text, arrayList2);
                    a(pageCaption2.credit, arrayList2);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                d(((TL_iv.pageBlockSlideshow) pageBlock).items, arrayList2);
                TL_iv.PageCaption pageCaption3 = pageBlock.caption;
                if (pageCaption3 != null) {
                    a(pageCaption3.text, arrayList2);
                    a(pageCaption3.credit, arrayList2);
                }
            } else {
                continue;
            }
        }
    }

    public static ArrayList e(TL_iv.RichMessage richMessage) {
        ArrayList arrayList = new ArrayList();
        if (richMessage != null) {
            d(richMessage.blocks, arrayList);
        }
        return arrayList;
    }

    public static int[] f(zi ziVar, String str, int i3) {
        ArrayList arrayList;
        int[] iArr = null;
        if (ziVar == null || ziVar.w2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        cv cvVar = ziVar.w2;
        TL_iv.RichMessage richMessage = cvVar.c;
        ArrayList arrayList2 = cvVar.n;
        ArrayList e10 = e(richMessage);
        if (e10.isEmpty()) {
            return null;
        }
        int[] iArr2 = new int[e10.size()];
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (int i11 = 0; i11 < e10.size(); i11++) {
            if (i11 > 0) {
                sb2.append('\n');
            }
            iArr2[i11] = sb2.length();
            b((TL_iv.RichText) e10.get(i11), sb2, null);
        }
        int Y = zi.Y(i3, sb2.toString(), str);
        if (Y < 0) {
            return null;
        }
        int length = str.length() + Y;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        int i12 = 0;
        while (i12 < arrayList2.size()) {
            CharSequence l10 = l((org.telegram.ui.Cells.s9) arrayList2.get(i12));
            if (l10 instanceof Spanned) {
                Spanned spanned = (Spanned) l10;
                int intValue = ((Integer) cvVar.o.get(i12)).intValue();
                ut[] utVarArr = (ut[]) spanned.getSpans(i10, l10.length(), ut.class);
                int length2 = utVarArr.length;
                int i13 = i10;
                while (i13 < length2) {
                    ut utVar = utVarArr[i13];
                    int[] iArr3 = iArr;
                    if (identityHashMap.containsKey(utVar.a)) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                        identityHashMap.put(utVar.a, new int[]{spanned.getSpanStart(utVar) + intValue, spanned.getSpanEnd(utVar) + intValue, utVar.b});
                    }
                    i13++;
                    iArr = iArr3;
                    arrayList2 = arrayList;
                }
            }
            i12++;
            iArr = iArr;
            arrayList2 = arrayList2;
            i10 = 0;
        }
        int[] iArr4 = iArr;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < e10.size(); i16++) {
            int g7 = g((TL_iv.RichText) e10.get(i16)) + iArr2[i16];
            if (i14 < 0 && Y < g7 && identityHashMap.containsKey(e10.get(i16))) {
                i14 = i16;
            }
            if (iArr2[i16] < length && identityHashMap.containsKey(e10.get(i16))) {
                i15 = i16;
            }
        }
        if (i14 < 0 || i15 < 0 || i14 > i15) {
            return iArr4;
        }
        int[] iArr5 = (int[]) identityHashMap.get(e10.get(i14));
        int[] iArr6 = (int[]) identityHashMap.get(e10.get(i15));
        int i17 = i(cvVar, (TL_iv.RichText) e10.get(i14), iArr5[2], Math.max(0, Y - iArr2[i14]), false);
        int i18 = i(cvVar, (TL_iv.RichText) e10.get(i15), iArr6[2], Math.min(g((TL_iv.RichText) e10.get(i15)), length - iArr2[i15]), true);
        int i19 = iArr5[0];
        int min = Math.min(i17, iArr5[1] - i19) + i19;
        int i20 = iArr6[0];
        int min2 = Math.min(i18, iArr6[1] - i20) + i20;
        return min2 <= min ? iArr4 : new int[]{min, min2};
    }

    public static int g(TL_iv.RichText richText) {
        StringBuilder sb2 = new StringBuilder();
        b(richText, sb2, null);
        return sb2.toString().length();
    }

    public static String h(ArrayList arrayList, ArrayList arrayList2) {
        StringBuilder sb2 = new StringBuilder();
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (i3 > 0) {
                    sb2.append('\n');
                }
                b((TL_iv.RichText) arrayList.get(i3), sb2, arrayList2);
            }
        }
        return sb2.toString();
    }

    public static int i(cv cvVar, TL_iv.RichText richText, int i3, int i10, boolean z10) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        SpannableStringBuilder o10 = cvVar.o(richText, i3, identityHashMap);
        int j10 = j(richText, identityHashMap, i10, z10, new int[]{0});
        return j10 < 0 ? o10.length() : j10;
    }

    public static int j(TL_iv.RichText richText, IdentityHashMap identityHashMap, int i3, boolean z10, int[] iArr) {
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textImage)) {
            return -1;
        }
        int[] iArr2 = (int[]) identityHashMap.get(richText);
        int i10 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            int size = arrayList.size();
            while (i10 < size) {
                TL_iv.RichText richText2 = arrayList.get(i10);
                i10++;
                int j10 = j(richText2, identityHashMap, i3, z10, iArr);
                if (j10 >= 0) {
                    return j10;
                }
            }
        } else {
            if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                return j(mi.d6.j(textdiff.text) ? textdiff.old_text : textdiff.text, identityHashMap, i3, z10, iArr);
            }
            boolean z11 = richText instanceof TL_iv.textPlain;
            if (!z11 && !(richText instanceof TL_iv.textMath) && !(richText instanceof TL_iv.textCustomEmoji) && !(richText instanceof TL_iv.textButton)) {
                return j(richText.text, identityHashMap, i3, z10, iArr);
            }
            int g7 = g(richText);
            int i11 = iArr[0];
            int i12 = i3 - i11;
            iArr[0] = i11 + g7;
            if (iArr2 != null && (!z10 ? i12 < g7 : i12 <= g7)) {
                if (z11) {
                    int i13 = iArr2[1];
                    int i14 = iArr2[0];
                    if (i13 - i14 == g7) {
                        return Math.max(0, i12) + i14;
                    }
                }
                return (!z10 || i12 <= 0) ? iArr2[0] : iArr2[1];
            }
        }
        return -1;
    }

    public static gv k(int i3, int i10, zi ziVar) {
        int intValue;
        int intValue2;
        boolean z10;
        int i11;
        TL_iv.RichText b10;
        int i12;
        if (c(ziVar)) {
            cv cvVar = ziVar.w2;
            int i13 = hp.s1(ziVar.I1).o4;
            ArrayList e10 = e(cvVar.c);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            for (int i14 = 0; i14 < e10.size(); i14++) {
                identityHashMap.put((TL_iv.RichText) e10.get(i14), Integer.valueOf(i14));
            }
            boolean z11 = true;
            g2.k0 n4 = n(cvVar, Math.min(i3, i10), true, identityHashMap);
            g2.k0 n10 = n(cvVar, Math.max(i3, i10), false, identityHashMap);
            if (n4 != null) {
                int i15 = n4.a;
                if (n10 != null && (intValue = ((Integer) identityHashMap.get(((ut) n4.c).a)).intValue()) <= (intValue2 = ((Integer) identityHashMap.get(((ut) n10.c).a)).intValue()) && (intValue != intValue2 || i15 < n10.a)) {
                    fv a10 = fv.a(cvVar, n4);
                    fv a11 = intValue == intValue2 ? a10 : fv.a(cvVar, n10);
                    if (a10 != null && a11 != null) {
                        ev evVar = new ev(cvVar, e10, intValue, n4.a, a10, intValue2, n10.a, a11);
                        if ((intValue2 - intValue) + 1 > 32) {
                            int i16 = intValue + 31;
                            if (i16 != intValue2) {
                                evVar.h = null;
                            }
                            evVar.f = i16;
                            evVar.g = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        int i17 = 0;
                        loop1: while (i17 < 8 && evVar.f >= intValue) {
                            int i18 = intValue;
                            int i19 = 0;
                            while (i18 <= evVar.f) {
                                TL_iv.RichText a12 = evVar.a(i18);
                                StringBuilder sb2 = new StringBuilder();
                                b(a12, sb2, null);
                                String sb3 = sb2.toString();
                                int codePointCount = sb3.codePointCount(0, sb3.length()) + i19;
                                if (codePointCount > i13) {
                                    int i20 = i13 - i19;
                                    int i21 = evVar.d;
                                    if (i20 <= 0) {
                                        i11 = -1;
                                        z10 = z11;
                                    } else {
                                        int offsetByCodePoints = sb3.offsetByCodePoints(0, i20);
                                        z10 = z11;
                                        fv b11 = evVar.b(i18);
                                        if (i18 == intValue && i21 > 0 && (b10 = evVar.e.b(0, i21)) != null) {
                                            offsetByCodePoints += g(b10);
                                        }
                                        i11 = i(evVar.a, (TL_iv.RichText) evVar.b.get(i18), b11.d, offsetByCodePoints, false);
                                    }
                                    if (i20 > 0) {
                                        if (i18 != evVar.c) {
                                            i21 = 0;
                                        }
                                        if (i11 > i21 && (i18 != (i12 = evVar.f) || i11 < evVar.g)) {
                                            if (i18 != i12) {
                                                evVar.h = null;
                                            }
                                            evVar.f = i18;
                                            evVar.g = i11;
                                            i17++;
                                            z11 = z10;
                                        }
                                    }
                                    int i22 = i18 - 1;
                                    if (i22 != evVar.f) {
                                        evVar.h = null;
                                    }
                                    evVar.f = i22;
                                    evVar.g = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    i17++;
                                    z11 = z10;
                                } else {
                                    i18++;
                                    i19 = codePointCount;
                                }
                            }
                        }
                        if (evVar.f >= intValue) {
                            ArrayList arrayList = new ArrayList();
                            for (int i23 = intValue; i23 <= evVar.f; i23++) {
                                TL_iv.RichText o10 = o(evVar.a(i23));
                                if (o10 != null && g(o10) > 0) {
                                    arrayList.add(o10);
                                }
                            }
                            if (!arrayList.isEmpty() && arrayList.size() <= 32) {
                                int i24 = 0;
                                for (int i25 = 0; i25 < intValue; i25++) {
                                    i24 += g((TL_iv.RichText) e10.get(i25)) + 1;
                                }
                                TL_iv.RichText b12 = a10.b(0, i15);
                                if (b12 != null) {
                                    i24 += g(b12);
                                }
                                return new gv(i24, arrayList);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static CharSequence l(org.telegram.ui.Cells.s9 s9Var) {
        Layout a10 = s9Var == null ? null : s9Var.a();
        if (a10 == null) {
            return null;
        }
        return a10.getText();
    }

    public static boolean m(TL_iv.RichText richText) {
        if (richText == null) {
            return false;
        }
        if (richText instanceof TL_iv.textButton) {
            return true;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return m(richText.text);
        }
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TL_iv.RichText richText2 = arrayList.get(i3);
            i3++;
            if (m(richText2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g2.k0 n(cv cvVar, int i3, final boolean z10, IdentityHashMap identityHashMap) {
        final Spanned spanned;
        int max;
        ut utVar;
        int spanStart;
        int spanEnd;
        ArrayList arrayList = cvVar.n;
        ArrayList arrayList2 = cvVar.o;
        int size = arrayList.size();
        boolean z11 = true;
        int i10 = z10 ? 1 : -1;
        int i11 = 0;
        int i12 = z10 ? 0 : size - 1;
        while (true) {
            if (z10) {
                if (i12 >= size) {
                    break;
                }
                int intValue = ((Integer) arrayList2.get(i12)).intValue();
                CharSequence l10 = l((org.telegram.ui.Cells.s9) arrayList.get(i12));
                int length = (l10 != null ? 0 : l10.length()) + intValue;
                if (z10) {
                    if (intValue < i3) {
                        break;
                    }
                    i12 += i10;
                } else {
                    if (length > i3) {
                        break;
                    }
                    i12 += i10;
                }
            } else {
                if (i12 < 0) {
                    break;
                }
                int intValue2 = ((Integer) arrayList2.get(i12)).intValue();
                CharSequence l102 = l((org.telegram.ui.Cells.s9) arrayList.get(i12));
                int length2 = (l102 != null ? 0 : l102.length()) + intValue2;
                if (z10) {
                }
            }
        }
        loop1: while (true) {
            if (z10) {
                if (i12 >= size) {
                    return null;
                }
            } else if (i12 < 0) {
                return null;
            }
            int intValue3 = ((Integer) arrayList2.get(i12)).intValue();
            CharSequence l11 = l((org.telegram.ui.Cells.s9) arrayList.get(i12));
            if (l11 instanceof Spanned) {
                spanned = (Spanned) l11;
                max = z11 ? Math.max(i11, Math.min(l11.length(), i3 - intValue3)) : z10 ? i11 : l11.length();
                ut[] utVarArr = (ut[]) spanned.getSpans(i11, l11.length(), ut.class);
                if (utVarArr != null && utVarArr.length != 0) {
                    Arrays.sort(utVarArr, new Comparator() { // from class: org.telegram.messenger.dv
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            ut utVar2 = (ut) obj;
                            ut utVar3 = (ut) obj2;
                            boolean z12 = z10;
                            Spanned spanned2 = spanned;
                            return z12 ? spanned2.getSpanStart(utVar2) - spanned2.getSpanStart(utVar3) : spanned2.getSpanEnd(utVar3) - spanned2.getSpanEnd(utVar2);
                        }
                    });
                    int length3 = utVarArr.length;
                    for (int i13 = i11; i13 < length3; i13++) {
                        utVar = utVarArr[i13];
                        if (identityHashMap.containsKey(utVar.a)) {
                            spanStart = spanned.getSpanStart(utVar);
                            spanEnd = spanned.getSpanEnd(utVar);
                            if (!z10) {
                                if (spanStart < max) {
                                    break loop1;
                                }
                            } else {
                                if (spanEnd > max) {
                                    break loop1;
                                }
                            }
                        }
                    }
                }
            }
            i12 += i10;
            z11 = false;
            i11 = 0;
        }
        int max2 = (z10 ? Math.max(max, spanStart) : Math.min(max, spanEnd)) - spanStart;
        g2.k0 k0Var = new g2.k0();
        k0Var.c = utVar;
        k0Var.a = max2;
        k0Var.d = spanned;
        k0Var.b = spanStart;
        return k0Var;
    }

    public static TL_iv.RichText o(TL_iv.RichText richText) {
        TL_iv.RichText richText2;
        if (richText == null || !m(richText)) {
            return richText;
        }
        if (richText instanceof TL_iv.textButton) {
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = cv.x(richText.text);
            return textplain;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            try {
                richText2 = (TL_iv.RichText) TLObject.deepCopy(richText, new go(6));
            } catch (Exception e10) {
                a8.g(e10, true);
                richText2 = null;
            }
            if (richText2 == null) {
                return null;
            }
            richText2.text = o(richText.text);
            return richText2;
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TL_iv.RichText richText3 = arrayList.get(i3);
            i3++;
            textconcat.texts.add(o(richText3));
        }
        return textconcat;
    }
}
