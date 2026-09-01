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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class u90 {
    public static final Pattern a = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    public static final Pattern b = Pattern.compile("\\[\\^([^\\]]+)\\]");
    public static final Pattern c = Pattern.compile("^(\\d+)[.)]\\s");

    public static TL_iv.RichText a(ne.p pVar, TL_iv.PageBlock pageBlock) {
        r90 r90Var = new r90(pageBlock);
        pVar.a(r90Var);
        return g(h(r90.x(r90Var.c)));
    }

    public static List b(TL_iv.RichText richText) {
        int i10;
        if (richText == null) {
            return Collections.singletonList(j(""));
        }
        if (k(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String l10 = l(richText);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < l10.length()) {
            if (l10.length() - i11 <= 8192) {
                arrayList.add(j(l10.substring(i11)));
                return arrayList;
            }
            int i12 = i11 + 8192;
            int i13 = i11 + 8191;
            int lastIndexOf = l10.lastIndexOf(10, i13);
            if (lastIndexOf <= i11) {
                lastIndexOf = l10.lastIndexOf(32, i13);
            }
            if (lastIndexOf <= i11) {
                i10 = 0;
            } else {
                i12 = lastIndexOf;
                i10 = 1;
            }
            arrayList.add(j(l10.substring(i11, i12)));
            i11 = i12 + i10;
        }
        return arrayList;
    }

    public static TL_iv.textMath c(String str) {
        TL_iv.textMath textmath = new TL_iv.textMath();
        String trim = str == null ? "" : str.trim();
        textmath.source = trim;
        textmath.tried = true;
        wh.r a2 = wh.r.a(trim, AndroidUtilities.dp(20.0f), true);
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
            mc.a aVar = (mc.a) it.next();
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
                            String i10 = i(str2, tL_page.blocks);
                            if (!TextUtils.isEmpty(i10)) {
                                tL_webPage.flags |= 4;
                                tL_webPage.title = i10;
                            }
                            tL_webPage.flags |= 1024;
                            tL_webPage.cached_page = tL_page;
                            return tL_webPage;
                        }
                    } finally {
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
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
            for (int i10 = 0; i10 < textconcat.texts.size(); i10++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i10, g(arrayList.get(i10)));
            }
            return textconcat;
        }
        if (!(richText instanceof t90)) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                richText.text = g(richText2);
            }
            return richText;
        }
        t90 t90Var = (t90) richText;
        TL_iv.RichText g10 = g(t90Var.text);
        int i11 = t90Var.a;
        if ((i11 & 4) != 0) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = g10;
            g10 = textfixed;
        }
        if ((i11 & 32) != 0) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = g10;
            g10 = textstrike;
        }
        if ((i11 & 16) != 0) {
            TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
            textunderline.text = g10;
            g10 = textunderline;
        }
        if ((i11 & 64) != 0) {
            TL_iv.textMarked textmarked = new TL_iv.textMarked();
            textmarked.text = g10;
            g10 = textmarked;
        }
        if ((i11 & 128) != 0) {
            TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
            textsubscript.text = g10;
            g10 = textsubscript;
        }
        if ((i11 & 256) != 0) {
            TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = g10;
            g10 = textsuperscript;
        }
        if ((i11 & 2) != 0) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = g10;
            g10 = textitalic;
        }
        if ((i11 & 1) == 0) {
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
        int i10;
        char c3;
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat2 = (TL_iv.textConcat) richText;
            for (int i11 = 0; i11 < textconcat2.texts.size(); i11++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat2.texts;
                arrayList.set(i11, h(arrayList.get(i11)));
            }
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            mc.d dVar = new mc.d(new h7.u(12), new z9.d(12));
            ArrayList<TL_iv.RichText> arrayList4 = textconcat2.texts;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                TL_iv.RichText richText2 = arrayList4.get(i12);
                if ((richText2 instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText2).text) != null && str.length() >= 2 && str.charAt(0) == '<' && str.charAt(str.length() - 1) == '>') {
                    int length = sb.length();
                    try {
                        dVar.b(sb, ((TL_iv.textPlain) richText2).text);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        sb.append(textplain.text);
                    }
                    int length2 = sb.length();
                    if (length2 > length) {
                        arrayList2.add(j(sb.substring(length, length2)));
                        arrayList3.add(new int[]{length, length2});
                    }
                } else {
                    String l10 = l(richText2);
                    int length3 = sb.length();
                    sb.append(l10);
                    int length4 = sb.length();
                    arrayList2.add(richText2);
                    arrayList3.add(new int[]{length3, length4});
                }
                i12 = i13;
            }
            ArrayList arrayList5 = new ArrayList();
            int i14 = -1;
            try {
                int length5 = sb.length();
                ArrayList arrayList6 = dVar.c;
                if (arrayList6.size() > 0) {
                    if (length5 > -1) {
                        int size2 = arrayList6.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj = arrayList6.get(i15);
                            i15++;
                            mc.b bVar = (mc.b) obj;
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
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
            try {
                int length6 = sb.length();
                mc.a aVar = dVar.d;
                while (true) {
                    mc.a aVar2 = aVar.e;
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
                dVar.d = new mc.a("", 0, Collections.EMPTY_MAP, null);
            } catch (Throwable th4) {
                FileLog.e(th4);
            }
            Collections.sort(arrayList5, Comparator$-CC.comparingInt(new lf.d(16)));
            int size3 = arrayList5.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj2 = arrayList5.get(i16);
                i16++;
                mc.c cVar = (mc.c) obj2;
                int i17 = cVar.d;
                if (i17 > i14) {
                    int i18 = cVar.b;
                    int i19 = -1;
                    int i20 = -1;
                    for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                        int i22 = ((int[]) arrayList3.get(i21))[0];
                        int i23 = ((int[]) arrayList3.get(i21))[1];
                        if (i22 >= i18 && i23 <= i17) {
                            if (i19 == i14) {
                                i19 = i21;
                            }
                            i20 = i21;
                        }
                    }
                    if (i19 != i14) {
                        if (i19 == i20) {
                            textconcat = (TL_iv.RichText) arrayList2.get(i19);
                        } else {
                            textconcat = new TL_iv.textConcat();
                            for (int i24 = i19; i24 <= i20; i24++) {
                                textconcat.texts.add((TL_iv.RichText) arrayList2.get(i24));
                            }
                        }
                        String str2 = cVar.a;
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase();
                            lowerCase.getClass();
                            i10 = 4;
                            switch (lowerCase.hashCode()) {
                                case -891985998:
                                    if (lowerCase.equals("strike")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -891980137:
                                    if (lowerCase.equals("strong")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 98:
                                    if (lowerCase.equals("b")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 105:
                                    if (lowerCase.equals("i")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 115:
                                    if (lowerCase.equals("s")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 117:
                                    if (lowerCase.equals("u")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3240:
                                    if (lowerCase.equals("em")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3712:
                                    if (lowerCase.equals("tt")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 99339:
                                    if (lowerCase.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 104430:
                                    if (lowerCase.equals("ins")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 114240:
                                    if (lowerCase.equals("sub")) {
                                        c3 = '\n';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 114254:
                                    if (lowerCase.equals("sup")) {
                                        c3 = 11;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3059181:
                                    if (lowerCase.equals("code")) {
                                        c3 = '\f';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3344077:
                                    if (lowerCase.equals("mark")) {
                                        c3 = '\r';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                case 4:
                                case '\b':
                                    i10 = 32;
                                    break;
                                case 1:
                                case 2:
                                    i10 = 1;
                                    break;
                                case 3:
                                case 6:
                                    i10 = 2;
                                    break;
                                case 5:
                                case '\t':
                                    i10 = 16;
                                    break;
                                case '\n':
                                    i10 = 128;
                                    break;
                                case 11:
                                    i10 = 256;
                                    break;
                                case '\r':
                                    i10 = 64;
                                    break;
                            }
                            if (i10 != 0) {
                                if (textconcat instanceof t90) {
                                    ((t90) textconcat).a |= i10;
                                } else {
                                    t90 t90Var = new t90();
                                    t90Var.a = i10;
                                    t90Var.text = textconcat;
                                    textconcat = t90Var;
                                }
                            }
                            while (i20 >= i19) {
                                arrayList2.remove(i20);
                                arrayList3.remove(i20);
                                i20--;
                            }
                            arrayList2.add(i19, textconcat);
                            arrayList3.add(i19, new int[]{i18, i17});
                            i14 = -1;
                        }
                        i10 = 0;
                        if (i10 != 0) {
                        }
                        while (i20 >= i19) {
                        }
                        arrayList2.add(i19, textconcat);
                        arrayList3.add(i19, new int[]{i18, i17});
                        i14 = -1;
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

    /* JADX WARN: Removed duplicated region for block: B:88:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String i(String str, ArrayList arrayList) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split = str.split("\n", -1);
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (i10 < split.length) {
            Matcher matcher = a.matcher(split[i10]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                StringBuilder sb2 = new StringBuilder(matcher.group(2));
                i10++;
                while (i10 < split.length) {
                    String str3 = split[i10];
                    if (str3.startsWith("    ") || str3.startsWith("\t")) {
                        sb2.append('\n');
                        sb2.append(str3.startsWith("\t") ? str3.substring(1) : str3.substring(4));
                        i10++;
                    } else {
                        if (!str3.trim().isEmpty()) {
                            break;
                        }
                        int i11 = i10 + 1;
                        int i12 = i11;
                        while (i12 < split.length && split[i12].trim().isEmpty()) {
                            i12++;
                        }
                        if (i12 >= split.length || (!split[i12].startsWith("    ") && !split[i12].startsWith("\t"))) {
                            break;
                        }
                        sb2.append('\n');
                        i10 = i11;
                    }
                }
                linkedHashMap.put(group, sb2.toString().trim());
            } else {
                sb.append(split[i10]);
                if (i10 < split.length - 1) {
                    sb.append('\n');
                }
                i10++;
            }
        }
        Matcher matcher2 = b.matcher(sb.toString());
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher2.find()) {
            String group2 = matcher2.group(1);
            matcher2.appendReplacement(stringBuffer, Matcher.quoteReplacement("<sup>[\\[" + group2 + "\\]](#fn-" + group2 + ")</sup>"));
        }
        matcher2.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        List<fe.a> asList = Arrays.asList(new ge.b(0), new ge.b(1));
        Pattern pattern = qc.i.j;
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList2.addAll(Arrays.asList(new qc.a(), new qc.b(), new qc.c(), new qc.d(0), new qc.e(), new qc.f(), new qc.g(), new qc.j(), new qc.d(1)));
        arrayList3.addAll(Arrays.asList(new le.a(0), new le.a(1)));
        AndroidUtilities.dp(18.0f);
        Executors.newCachedThreadPool();
        new Handler(Looper.getMainLooper());
        new HashMap(3);
        arrayList2.add(new lc.c());
        arrayList2.add(new s90());
        c5.j jVar = new c5.j();
        jVar.a = new ArrayList();
        jVar.b = new ArrayList();
        jVar.c = new ArrayList();
        jVar.d = ke.e.p;
        if (asList == null) {
            throw new NullPointerException("extensions must not be null");
        }
        for (fe.a aVar : asList) {
            if (aVar instanceof ge.b) {
                switch (((ge.b) aVar).a) {
                    case 0:
                        ((ArrayList) jVar.b).add(new he.a());
                        break;
                    default:
                        ((ArrayList) jVar.a).add(new je.a(0));
                        break;
                }
            }
        }
        jVar.e = new q5.g0(2, arrayList2, arrayList3);
        ((ArrayList) jVar.a).add(new je.a(8));
        sf.e eVar = new sf.e(jVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        boolean z4 = false;
        String str4 = null;
        for (String str5 : stringBuffer2.split("\n", -1)) {
            for (int i13 = 0; i13 < str5.length() && i13 < 3; i13++) {
                str2 = null;
                if (str5.charAt(i13) != ' ') {
                    String substring = str5.substring(i13);
                    if (z4) {
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
                        z4 = true;
                    } else if (substring.startsWith(str4)) {
                        str4 = str2;
                        z4 = false;
                    }
                }
            }
            str2 = null;
            String substring2 = str5.substring(i13);
            if (z4) {
            }
        }
        q90 q90Var = new q90(arrayList, arrayDeque);
        q90Var.v(eVar.C(stringBuffer2));
        q90Var.y();
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
                q90 q90Var2 = new q90(arrayList4, new ArrayDeque());
                q90Var2.v(eVar.C(str8));
                q90Var2.y();
                TL_iv.RichText textconcat = new TL_iv.textConcat();
                int size = arrayList4.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList4.get(i14);
                    i14++;
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
                textanchor.name = org.telegram.ui.yh.k("fn-", str7);
                textanchor.text = d;
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                String e6 = w.c.e(str7, ". ");
                TL_iv.textBold textbold2 = new TL_iv.textBold();
                textbold2.text = j(e6);
                TL_iv.RichText[] richTextArr = {textbold2, textanchor};
                TL_iv.textConcat textconcat2 = new TL_iv.textConcat();
                for (int i15 = 0; i15 < 2; i15++) {
                    textconcat2.texts.add(richTextArr[i15]);
                }
                pageblockparagraph.text = textconcat2;
                pageblockdetails.blocks.add(pageblockparagraph);
            }
            arrayList.add(pageblockdetails);
        }
        TL_iv.RichText richText2 = q90Var.b;
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
        int i10 = 0;
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
        int i11 = 0;
        while (i11 < size) {
            TL_iv.RichText richText2 = arrayList.get(i11);
            i11++;
            i10 += k(richText2);
        }
        return i10;
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
        StringBuilder sb = new StringBuilder();
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            sb.append(l(richText2));
        }
        return sb.toString();
    }
}
