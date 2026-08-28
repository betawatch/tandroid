package org.telegram.ui.Components;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j$.util.Comparator$-CC;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class z80 {
    public static final Pattern a = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    public static final Pattern b = Pattern.compile("\\[\\^([^\\]]+)\\]");
    public static final Pattern c = Pattern.compile("^(\\d+)[.)]\\s");

    public static TL_iv.RichText a(ie.p pVar, TL_iv.PageBlock pageBlock) {
        w80 w80Var = new w80(pageBlock);
        pVar.a(w80Var);
        return g(h(w80.x(w80Var.c)));
    }

    public static List b(TL_iv.RichText richText) {
        int i9;
        if (richText == null) {
            return Collections.singletonList(j(""));
        }
        if (k(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String l10 = l(richText);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < l10.length()) {
            if (l10.length() - i10 <= 8192) {
                arrayList.add(j(l10.substring(i10)));
                return arrayList;
            }
            int i11 = i10 + 8192;
            int i12 = i10 + 8191;
            int lastIndexOf = l10.lastIndexOf(10, i12);
            if (lastIndexOf <= i10) {
                lastIndexOf = l10.lastIndexOf(32, i12);
            }
            if (lastIndexOf <= i10) {
                i9 = 0;
            } else {
                i11 = lastIndexOf;
                i9 = 1;
            }
            arrayList.add(j(l10.substring(i10, i11)));
            i10 = i11 + i9;
        }
        return arrayList;
    }

    public static TL_iv.textMath c(String str) {
        TL_iv.textMath textmath = new TL_iv.textMath();
        String trim = str == null ? "" : str.trim();
        textmath.source = trim;
        textmath.tried = true;
        qh.q a2 = qh.q.a(trim, AndroidUtilities.dp(20.0f), true);
        if (a2 != null) {
            textmath.w = a2.b;
            textmath.h = a2.c;
            textmath.depth = a2.d;
            textmath.bitmap = a2.a;
        }
        return textmath;
    }

    public static TL_iv.RichText d(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (k(richText) <= 8192) {
            return richText;
        }
        String l10 = l(richText);
        return j(l10.substring(0, Math.min(l10.length(), 8192)));
    }

    public static void e(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ic.a aVar = (ic.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f;
            e(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    public static TLRPC.TL_webPage f(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject.messageOwner != null && (document = messageObject.getDocument()) != null) {
            File file = !TextUtils.isEmpty(messageObject.messageOwner.attachPath) ? new File(messageObject.messageOwner.attachPath) : null;
            if (file == null || !file.exists()) {
                file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true);
            }
            if (file == null || !file.exists()) {
                file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true, true);
            }
            if (file != null && file.exists() && file.length() <= 65536) {
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeFilename.class);
                String str = tL_documentAttributeFilename != null ? tL_documentAttributeFilename.file_name : null;
                TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                tL_webPage.url = str == null ? "" : str;
                tL_webPage.display_url = str != null ? str : "";
                if (!TextUtils.isEmpty(str)) {
                    tL_webPage.flags |= 4;
                    tL_webPage.title = str;
                }
                TL_iv.TL_page tL_page = new TL_iv.TL_page();
                tL_page.local = file;
                tL_page.url = tL_webPage.url;
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[(int) file.length()];
                        fileInputStream.read(bArr);
                        String str2 = new String(bArr, StandardCharsets.UTF_8);
                        fileInputStream.close();
                        if (str2.length() <= 65536) {
                            String i9 = i(str2, tL_page.blocks);
                            if (!TextUtils.isEmpty(i9)) {
                                tL_webPage.flags |= 4;
                                tL_webPage.title = i9;
                            }
                            tL_webPage.flags |= 1024;
                            tL_webPage.cached_page = tL_page;
                            return tL_webPage;
                        }
                    } finally {
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        return null;
    }

    public static TL_iv.RichText g(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i9 = 0; i9 < textconcat.texts.size(); i9++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i9, g(arrayList.get(i9)));
            }
            return textconcat;
        }
        if (!(richText instanceof y80)) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                richText.text = g(richText2);
            }
            return richText;
        }
        y80 y80Var = (y80) richText;
        TL_iv.RichText g10 = g(y80Var.text);
        int i10 = y80Var.a;
        if ((i10 & 4) != 0) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = g10;
            g10 = textfixed;
        }
        if ((i10 & 32) != 0) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = g10;
            g10 = textstrike;
        }
        if ((i10 & 16) != 0) {
            TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
            textunderline.text = g10;
            g10 = textunderline;
        }
        if ((i10 & 64) != 0) {
            TL_iv.textMarked textmarked = new TL_iv.textMarked();
            textmarked.text = g10;
            g10 = textmarked;
        }
        if ((i10 & 128) != 0) {
            TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
            textsubscript.text = g10;
            g10 = textsubscript;
        }
        if ((i10 & 256) != 0) {
            TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = g10;
            g10 = textsuperscript;
        }
        if ((i10 & 2) != 0) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = g10;
            g10 = textitalic;
        }
        if ((i10 & 1) == 0) {
            return g10;
        }
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = g10;
        return textbold;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ad A[LOOP:6: B:106:0x02ab->B:107:0x02ad, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.RichText h(TL_iv.RichText richText) {
        TL_iv.RichText textconcat;
        int i9;
        char c10;
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat2 = (TL_iv.textConcat) richText;
            for (int i10 = 0; i10 < textconcat2.texts.size(); i10++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat2.texts;
                arrayList.set(i10, h(arrayList.get(i10)));
            }
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ic.d dVar = new ic.d(new wa.a(10), new ya.b(10));
            ArrayList<TL_iv.RichText> arrayList4 = textconcat2.texts;
            int size = arrayList4.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                TL_iv.RichText richText2 = arrayList4.get(i11);
                if ((richText2 instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText2).text) != null && str.length() >= 2 && str.charAt(0) == '<' && str.charAt(str.length() - 1) == '>') {
                    int length = sb2.length();
                    try {
                        dVar.b(sb2, ((TL_iv.textPlain) richText2).text);
                    } catch (Throwable th) {
                        FileLog.e(th);
                        sb2.append(textplain.text);
                    }
                    int length2 = sb2.length();
                    if (length2 > length) {
                        arrayList2.add(j(sb2.substring(length, length2)));
                        arrayList3.add(new int[]{length, length2});
                    }
                } else {
                    String l10 = l(richText2);
                    int length3 = sb2.length();
                    sb2.append(l10);
                    int length4 = sb2.length();
                    arrayList2.add(richText2);
                    arrayList3.add(new int[]{length3, length4});
                }
                i11 = i12;
            }
            ArrayList arrayList5 = new ArrayList();
            int i13 = -1;
            try {
                int length5 = sb2.length();
                ArrayList arrayList6 = dVar.c;
                if (arrayList6.size() > 0) {
                    if (length5 > -1) {
                        int size2 = arrayList6.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj = arrayList6.get(i14);
                            i14++;
                            ic.b bVar = (ic.b) obj;
                            if (bVar.d <= -1) {
                                bVar.d = length5;
                            }
                        }
                    }
                    arrayList5.addAll(DesugarCollections.unmodifiableList(arrayList6));
                    arrayList6.clear();
                } else {
                    arrayList5.addAll(Collections.EMPTY_LIST);
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
            try {
                int length6 = sb2.length();
                ic.a aVar = dVar.d;
                while (true) {
                    ic.a aVar2 = aVar.e;
                    if (aVar2 == null) {
                        break;
                    }
                    aVar = aVar2;
                }
                if (length6 > -1) {
                    aVar.b(length6);
                }
                ArrayList arrayList7 = aVar.f;
                List unmodifiableList = arrayList7 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList7);
                if (unmodifiableList.size() > 0) {
                    e(arrayList5, unmodifiableList);
                } else {
                    e(arrayList5, Collections.EMPTY_LIST);
                }
                dVar.d = new ic.a("", 0, Collections.EMPTY_MAP, null);
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
            Collections.sort(arrayList5, Comparator$-CC.comparingInt(new ff.d(16)));
            int size3 = arrayList5.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj2 = arrayList5.get(i15);
                i15++;
                ic.c cVar = (ic.c) obj2;
                int i16 = cVar.d;
                if (i16 > i13) {
                    int i17 = cVar.b;
                    int i18 = -1;
                    int i19 = -1;
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        int i21 = ((int[]) arrayList3.get(i20))[0];
                        int i22 = ((int[]) arrayList3.get(i20))[1];
                        if (i21 >= i17 && i22 <= i16) {
                            if (i18 == i13) {
                                i18 = i20;
                            }
                            i19 = i20;
                        }
                    }
                    if (i18 != i13) {
                        if (i18 == i19) {
                            textconcat = (TL_iv.RichText) arrayList2.get(i18);
                        } else {
                            textconcat = new TL_iv.textConcat();
                            for (int i23 = i18; i23 <= i19; i23++) {
                                textconcat.texts.add((TL_iv.RichText) arrayList2.get(i23));
                            }
                        }
                        String str2 = cVar.a;
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase();
                            lowerCase.getClass();
                            i9 = 4;
                            switch (lowerCase.hashCode()) {
                                case -891985998:
                                    if (lowerCase.equals("strike")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -891980137:
                                    if (lowerCase.equals("strong")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 98:
                                    if (lowerCase.equals("b")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 105:
                                    if (lowerCase.equals("i")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 115:
                                    if (lowerCase.equals("s")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 117:
                                    if (lowerCase.equals("u")) {
                                        c10 = 5;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3240:
                                    if (lowerCase.equals("em")) {
                                        c10 = 6;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3712:
                                    if (lowerCase.equals("tt")) {
                                        c10 = 7;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 99339:
                                    if (lowerCase.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                        c10 = '\b';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 104430:
                                    if (lowerCase.equals("ins")) {
                                        c10 = '\t';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 114240:
                                    if (lowerCase.equals("sub")) {
                                        c10 = '\n';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 114254:
                                    if (lowerCase.equals("sup")) {
                                        c10 = 11;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3059181:
                                    if (lowerCase.equals("code")) {
                                        c10 = '\f';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3344077:
                                    if (lowerCase.equals("mark")) {
                                        c10 = '\r';
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                case 4:
                                case '\b':
                                    i9 = 32;
                                    break;
                                case 1:
                                case 2:
                                    i9 = 1;
                                    break;
                                case 3:
                                case 6:
                                    i9 = 2;
                                    break;
                                case 5:
                                case '\t':
                                    i9 = 16;
                                    break;
                                case '\n':
                                    i9 = 128;
                                    break;
                                case 11:
                                    i9 = 256;
                                    break;
                                case '\r':
                                    i9 = 64;
                                    break;
                            }
                            if (i9 != 0) {
                                if (textconcat instanceof y80) {
                                    ((y80) textconcat).a |= i9;
                                } else {
                                    y80 y80Var = new y80();
                                    y80Var.a = i9;
                                    y80Var.text = textconcat;
                                    textconcat = y80Var;
                                }
                            }
                            while (i19 >= i18) {
                                arrayList2.remove(i19);
                                arrayList3.remove(i19);
                                i19--;
                            }
                            arrayList2.add(i18, textconcat);
                            arrayList3.add(i18, new int[]{i17, i16});
                            i13 = -1;
                        }
                        i9 = 0;
                        if (i9 != 0) {
                        }
                        while (i19 >= i18) {
                        }
                        arrayList2.add(i18, textconcat);
                        arrayList3.add(i18, new int[]{i17, i16});
                        i13 = -1;
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return new TL_iv.textEmpty();
            }
            if (arrayList2.size() == 1) {
                TL_iv.RichText richText3 = (TL_iv.RichText) arrayList2.get(0);
                if ((richText3 instanceof TL_iv.textPlain) || (richText3 instanceof TL_iv.textEmpty)) {
                    return richText3;
                }
            }
            TL_iv.textConcat textconcat3 = new TL_iv.textConcat();
            textconcat3.texts.addAll(arrayList2);
            return textconcat3;
        }
        TL_iv.RichText richText4 = richText;
        while (true) {
            TL_iv.RichText richText5 = richText4.text;
            if (richText5 == null) {
                return richText;
            }
            if (richText5 instanceof TL_iv.textConcat) {
                richText4.text = h(richText5);
                return richText;
            }
            richText4 = richText5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String i(String str, ArrayList arrayList) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split = str.split("\n", -1);
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (i9 < split.length) {
            Matcher matcher = a.matcher(split[i9]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                StringBuilder sb3 = new StringBuilder(matcher.group(2));
                i9++;
                while (i9 < split.length) {
                    String str3 = split[i9];
                    if (str3.startsWith("    ") || str3.startsWith("\t")) {
                        sb3.append('\n');
                        sb3.append(str3.startsWith("\t") ? str3.substring(1) : str3.substring(4));
                        i9++;
                    } else {
                        if (!str3.trim().isEmpty()) {
                            break;
                        }
                        int i10 = i9 + 1;
                        int i11 = i10;
                        while (i11 < split.length && split[i11].trim().isEmpty()) {
                            i11++;
                        }
                        if (i11 >= split.length || (!split[i11].startsWith("    ") && !split[i11].startsWith("\t"))) {
                            break;
                        }
                        sb3.append('\n');
                        i9 = i10;
                    }
                }
                linkedHashMap.put(group, sb3.toString().trim());
            } else {
                sb2.append(split[i9]);
                if (i9 < split.length - 1) {
                    sb2.append('\n');
                }
                i9++;
            }
        }
        Matcher matcher2 = b.matcher(sb2.toString());
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher2.find()) {
            String group2 = matcher2.group(1);
            matcher2.appendReplacement(stringBuffer, Matcher.quoteReplacement("<sup>[\\[" + group2 + "\\]](#fn-" + group2 + ")</sup>"));
        }
        matcher2.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        List<ae.a> asList = Arrays.asList(new be.b(0), new be.b(1));
        Pattern pattern = mc.i.j;
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList2.addAll(Arrays.asList(new mc.a(), new mc.b(), new mc.c(), new mc.d(0), new mc.e(), new mc.f(), new mc.g(), new mc.j(), new mc.d(1)));
        arrayList3.addAll(Arrays.asList(new ge.a(0), new ge.a(1)));
        AndroidUtilities.dp(18.0f);
        Executors.newCachedThreadPool();
        new Handler(Looper.getMainLooper());
        new HashMap(3);
        arrayList2.add(new hc.c());
        arrayList2.add(new x80());
        b3.b bVar = new b3.b();
        bVar.a = new ArrayList();
        bVar.b = new ArrayList();
        bVar.c = new ArrayList();
        bVar.d = fe.e.p;
        if (asList == null) {
            throw new NullPointerException("extensions must not be null");
        }
        for (ae.a aVar : asList) {
            if (aVar instanceof be.b) {
                switch (((be.b) aVar).a) {
                    case 0:
                        ((ArrayList) bVar.b).add(new ce.a());
                        break;
                    default:
                        ((ArrayList) bVar.a).add(new ee.a(0));
                        break;
                }
            }
        }
        bVar.e = new g5.b(22, arrayList2, arrayList3);
        ((ArrayList) bVar.a).add(new ee.a(8));
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(bVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        boolean z10 = false;
        String str4 = null;
        for (String str5 : stringBuffer2.split("\n", -1)) {
            for (int i12 = 0; i12 < str5.length() && i12 < 3; i12++) {
                str2 = null;
                if (str5.charAt(i12) != ' ') {
                    String substring = str5.substring(i12);
                    if (z10) {
                        String str6 = "```";
                        if (!substring.startsWith("```")) {
                            str6 = "~~~";
                            if (!substring.startsWith("~~~")) {
                                Matcher matcher3 = c.matcher(str5);
                                if (matcher3.find()) {
                                    arrayDeque.add(matcher3.group(1));
                                }
                            }
                        }
                        str4 = str6;
                        z10 = true;
                    } else if (substring.startsWith(str4)) {
                        str4 = str2;
                        z10 = false;
                    }
                }
            }
            str2 = null;
            String substring2 = str5.substring(i12);
            if (z10) {
            }
        }
        v80 v80Var = new v80(arrayList, arrayDeque);
        v80Var.v(tVar.H(stringBuffer2));
        v80Var.y();
        if (!linkedHashMap.isEmpty()) {
            TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
            String string = LocaleController.getString(R.string.InstantViewReferences);
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = j(string);
            pageblockdetails.title = textbold;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str7 = (String) entry.getKey();
                String str8 = (String) entry.getValue();
                ArrayList arrayList4 = new ArrayList();
                v80 v80Var2 = new v80(arrayList4, new ArrayDeque());
                v80Var2.v(tVar.H(str8));
                v80Var2.y();
                TL_iv.RichText textconcat = new TL_iv.textConcat();
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                    TL_iv.RichText richText = pageBlock instanceof TL_iv.pageBlockParagraph ? ((TL_iv.pageBlockParagraph) pageBlock).text : pageBlock instanceof TL_iv.pageBlockHeader ? ((TL_iv.pageBlockHeader) pageBlock).text : pageBlock instanceof TL_iv.pageBlockSubheader ? ((TL_iv.pageBlockSubheader) pageBlock).text : pageBlock instanceof TL_iv.pageBlockTitle ? ((TL_iv.pageBlockTitle) pageBlock).text : null;
                    if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                        if (!textconcat.texts.isEmpty()) {
                            textconcat.texts.add(j("\n\n"));
                        }
                        textconcat.texts.add(richText);
                    }
                }
                if (textconcat.texts.isEmpty()) {
                    textconcat = new TL_iv.textEmpty();
                } else if (textconcat.texts.size() == 1) {
                    textconcat = textconcat.texts.get(0);
                }
                TL_iv.RichText d = d(textconcat);
                TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                textanchor.name = ta.b.d("fn-", str7);
                textanchor.text = d;
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                String j10 = ta.b.j(str7, ". ");
                TL_iv.textBold textbold2 = new TL_iv.textBold();
                textbold2.text = j(j10);
                TL_iv.RichText[] richTextArr = {textbold2, textanchor};
                TL_iv.textConcat textconcat2 = new TL_iv.textConcat();
                for (int i14 = 0; i14 < 2; i14++) {
                    textconcat2.texts.add(richTextArr[i14]);
                }
                pageblockparagraph.text = textconcat2;
                pageblockdetails.blocks.add(pageblockparagraph);
            }
            arrayList.add(pageblockdetails);
        }
        TL_iv.RichText richText2 = v80Var.b;
        if (richText2 != null) {
            return l(richText2);
        }
        return null;
    }

    public static TL_iv.textPlain j(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        return textplain;
    }

    public static int k(TL_iv.RichText richText) {
        int i9 = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return 0;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            if (str == null) {
                return 0;
            }
            return str.length();
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return k(richText.text);
        }
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            i9 += k(richText2);
        }
        return i9;
    }

    public static String l(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return l(richText.text);
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TL_iv.RichText richText2 = arrayList.get(i9);
            i9++;
            sb2.append(l(richText2));
        }
        return sb2.toString();
    }
}
