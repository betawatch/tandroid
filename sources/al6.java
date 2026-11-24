// default package

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j$.util.Comparator$-CC;
import j$.util.DesugarCollections;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class al6 {
    public static final Pattern a = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    public static final Pattern b = Pattern.compile("\\[\\^([^\\]]+)\\]");
    public static final Pattern c = Pattern.compile("^(\\d+)[.)]\\s");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        if (r5.equals("py") == false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str) {
        char c2 = '\t';
        int indexOf = str.indexOf(9);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        String trim = str.trim();
        int lastIndexOf = trim.lastIndexOf(32);
        if (lastIndexOf >= 0) {
            trim = trim.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = trim.lastIndexOf(46);
        if (lastIndexOf2 < 0 || lastIndexOf2 < trim.lastIndexOf(47)) {
            return "";
        }
        String lowerCase = trim.substring(lastIndexOf2 + 1).toLowerCase();
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case -1237894073:
                if (lowerCase.equals("gradle")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case nm7.o1 /* 104 */:
                if (lowerCase.equals("h")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case nm7.t1 /* 109 */:
                if (lowerCase.equals("m")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3168:
                if (lowerCase.equals("cc")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3184:
                if (lowerCase.equals("cs")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3328:
                if (lowerCase.equals("hh")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3433:
                if (lowerCase.equals("kt")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3479:
                if (lowerCase.equals("md")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 3488:
                if (lowerCase.equals("mm")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 3593:
                break;
            case 3632:
                if (lowerCase.equals("rb")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 3649:
                if (lowerCase.equals("rs")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 3669:
                if (lowerCase.equals("sh")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 98979:
                if (lowerCase.equals("cxx")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 103528:
                if (lowerCase.equals("hpp")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 103649:
                if (lowerCase.equals("htm")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 106538:
                if (lowerCase.equals("kts")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 119768:
                if (lowerCase.equals("yml")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 120911:
                if (lowerCase.equals("zsh")) {
                    c2 = 18;
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
                return "groovy";
            case 1:
                return "c";
            case 2:
            case '\b':
                return "objectivec";
            case 3:
            case 5:
            case '\r':
            case 14:
                return "cpp";
            case 4:
                return "csharp";
            case 6:
            case 16:
                return "kotlin";
            case 7:
                return "markdown";
            case '\t':
                return "python";
            case '\n':
                return "ruby";
            case 11:
                return "rust";
            case '\f':
            case 18:
                return "bash";
            case 15:
                return "html";
            case 17:
                return "yaml";
            default:
                return lowerCase;
        }
    }

    public static TL_iv.RichText b(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (m(richText) <= 8192) {
            return richText;
        }
        String o = o(richText);
        return l(o.substring(0, Math.min(o.length(), TLObject.FLAG_13)));
    }

    public static void c(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ei5 ei5Var = (ei5) it.next();
            arrayList.add(ei5Var);
            ArrayList arrayList2 = ei5Var.f;
            c(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    public static TLRPC.TL_webPage d(k47 k47Var) {
        String str;
        TLRPC.Document F0;
        File f;
        TLRPC.Document F02;
        File f2;
        boolean g = g(k47Var);
        TLRPC.Message message = k47Var.k;
        str = "";
        if (g) {
            if (message != null && (F02 = k47Var.F0()) != null && (f2 = f(k47Var)) != null && f2.length() <= 2097152) {
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) gm.V(TLRPC.TL_documentAttributeFilename.class, F02.attributes);
                String str2 = tL_documentAttributeFilename != null ? tL_documentAttributeFilename.file_name : null;
                TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                tL_webPage.url = str2 == null ? "" : str2;
                tL_webPage.display_url = str2 == null ? "" : str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_webPage.flags |= 4;
                    tL_webPage.title = str2;
                }
                TL_iv.TL_page tL_page = new TL_iv.TL_page();
                tL_page.local = f2;
                tL_page.url = tL_webPage.url;
                try {
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(f2), StandardCharsets.UTF_8));
                    int i = 0;
                    int i2 = 0;
                    TL_iv.pageBlockPreformatted pageblockpreformatted = null;
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (readLine.length() > 400) {
                                readLine = readLine.substring(0, 400) + "…";
                            }
                            boolean z = readLine.startsWith("diff ") || readLine.startsWith("Index: ");
                            boolean startsWith = readLine.startsWith("@@");
                            if (i > 0 && (z || i >= 160 || (i >= 80 && startsWith))) {
                                ArrayList<TL_iv.PageBlock> arrayList = tL_page.blocks;
                                TL_iv.pageBlockPreformatted pageblockpreformatted2 = new TL_iv.pageBlockPreformatted();
                                pageblockpreformatted2.text = l(sb.toString());
                                pageblockpreformatted2.language = str;
                                pageblockpreformatted2.diff = true;
                                if (pageblockpreformatted != null) {
                                    pageblockpreformatted.continuesNext = true;
                                    pageblockpreformatted2.continuesPrev = true;
                                }
                                arrayList.add(pageblockpreformatted2);
                                sb.setLength(0);
                                i = 0;
                                pageblockpreformatted = pageblockpreformatted2;
                            }
                            if (z) {
                                str = a(readLine);
                            } else if (readLine.startsWith("+++ ") && !readLine.startsWith("+++ /dev/null")) {
                                str = a(readLine);
                            }
                            if (i > 0) {
                                sb.append('\n');
                            }
                            sb.append(readLine);
                            i++;
                            int length = readLine.length();
                            for (int i3 = 0; i3 < readLine.length(); i3++) {
                                if (readLine.charAt(i3) == '\t') {
                                    length += 3;
                                }
                            }
                            i2 = Math.max(i2, length);
                        } finally {
                        }
                    }
                    bufferedReader.close();
                    if (i > 0) {
                        ArrayList<TL_iv.PageBlock> arrayList2 = tL_page.blocks;
                        TL_iv.pageBlockPreformatted pageblockpreformatted3 = new TL_iv.pageBlockPreformatted();
                        pageblockpreformatted3.text = l(sb.toString());
                        pageblockpreformatted3.language = str;
                        pageblockpreformatted3.diff = true;
                        if (pageblockpreformatted != null) {
                            pageblockpreformatted.continuesNext = true;
                            pageblockpreformatted3.continuesPrev = true;
                        }
                        arrayList2.add(pageblockpreformatted3);
                    }
                    if (!tL_page.blocks.isEmpty()) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < tL_page.blocks.size(); i5++) {
                            i4 += o(tL_page.blocks.get(i5).text).length();
                        }
                        for (int i6 = 0; i6 < tL_page.blocks.size(); i6++) {
                            ((TL_iv.pageBlockPreformatted) tL_page.blocks.get(i6)).codeLength = i4;
                            ((TL_iv.pageBlockPreformatted) tL_page.blocks.get(i6)).diffColumns = i2;
                        }
                        tL_webPage.flags |= 1024;
                        tL_webPage.cached_page = tL_page;
                        return tL_webPage;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return null;
                }
            }
        } else if (message != null && (F0 = k47Var.F0()) != null && (f = f(k47Var)) != null && f.length() <= 65536) {
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename2 = (TLRPC.TL_documentAttributeFilename) gm.V(TLRPC.TL_documentAttributeFilename.class, F0.attributes);
            String str3 = tL_documentAttributeFilename2 != null ? tL_documentAttributeFilename2.file_name : null;
            TLRPC.TL_webPage tL_webPage2 = new TLRPC.TL_webPage();
            tL_webPage2.url = str3 == null ? "" : str3;
            tL_webPage2.display_url = str3 != null ? str3 : "";
            if (!TextUtils.isEmpty(str3)) {
                tL_webPage2.flags |= 4;
                tL_webPage2.title = str3;
            }
            TL_iv.TL_page tL_page2 = new TL_iv.TL_page();
            tL_page2.local = f;
            tL_page2.url = tL_webPage2.url;
            try {
                FileInputStream fileInputStream = new FileInputStream(f);
                try {
                    byte[] bArr = new byte[(int) f.length()];
                    fileInputStream.read(bArr);
                    String str4 = new String(bArr, StandardCharsets.UTF_8);
                    fileInputStream.close();
                    if (str4.length() <= 65536) {
                        String k = k(str4, tL_page2.blocks);
                        if (!TextUtils.isEmpty(k)) {
                            tL_webPage2.flags |= 4;
                            tL_webPage2.title = k;
                        }
                        tL_webPage2.flags |= 1024;
                        tL_webPage2.cached_page = tL_page2;
                        return tL_webPage2;
                    }
                } finally {
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
        return null;
    }

    public static int e(int i, CharSequence charSequence) {
        char charAt;
        if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\n' || charAt == ' ') {
            return 0;
        }
        if (charAt != '+' && charAt != '-') {
            return 3;
        }
        int i2 = i + 3;
        if (i2 < charSequence.length() && charSequence.charAt(i + 1) == charAt && charSequence.charAt(i + 2) == charAt && charSequence.charAt(i2) == ' ') {
            return 3;
        }
        return charAt == '+' ? 1 : 2;
    }

    public static File f(k47 k47Var) {
        TLRPC.Message message = k47Var.k;
        int i = k47Var.K1;
        File file = !TextUtils.isEmpty(message.attachPath) ? new File(k47Var.k.attachPath) : null;
        if (file == null || !file.exists()) {
            bc4.G(i);
            file = bc4.M(k47Var.k, false, true);
        }
        if (file == null || !file.exists()) {
            bc4.G(i);
            file = bc4.M(k47Var.k, true, true);
        }
        if (file == null || !file.exists()) {
            return null;
        }
        return file;
    }

    public static boolean g(k47 k47Var) {
        String Q0 = k47Var.Q0();
        if ("diff".equalsIgnoreCase(Q0) || "patch".equalsIgnoreCase(Q0)) {
            return true;
        }
        String t1 = k47Var.t1();
        if (t1 == null) {
            return false;
        }
        String lowerCase = t1.toLowerCase();
        return lowerCase.startsWith("text/x-diff") || lowerCase.startsWith("text/x-patch");
    }

    public static TL_iv.textMath h(String str) {
        TL_iv.textMath textmath = new TL_iv.textMath();
        String trim = str == null ? "" : str.trim();
        textmath.source = trim;
        textmath.tried = true;
        lz5 a2 = lz5.a(trim, gm.L(20.0f), true);
        if (a2 != null) {
            textmath.w = a2.b;
            textmath.h = a2.c;
            textmath.depth = a2.d;
            textmath.bitmap = a2.a;
        }
        return textmath;
    }

    public static TL_iv.RichText i(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i = 0; i < textconcat.texts.size(); i++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i, i(arrayList.get(i)));
            }
            return textconcat;
        }
        if (!(richText instanceof zk6)) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                richText.text = i(richText2);
            }
            return richText;
        }
        zk6 zk6Var = (zk6) richText;
        TL_iv.RichText i2 = i(zk6Var.text);
        int i3 = zk6Var.a;
        if ((i3 & 4) != 0) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = i2;
            i2 = textfixed;
        }
        if ((i3 & 32) != 0) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = i2;
            i2 = textstrike;
        }
        if ((i3 & 16) != 0) {
            TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
            textunderline.text = i2;
            i2 = textunderline;
        }
        if ((i3 & 64) != 0) {
            TL_iv.textMarked textmarked = new TL_iv.textMarked();
            textmarked.text = i2;
            i2 = textmarked;
        }
        if ((i3 & 128) != 0) {
            TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
            textsubscript.text = i2;
            i2 = textsubscript;
        }
        if ((i3 & 256) != 0) {
            TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = i2;
            i2 = textsuperscript;
        }
        if ((i3 & 2) != 0) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = i2;
            i2 = textitalic;
        }
        if ((i3 & 1) == 0) {
            return i2;
        }
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = i2;
        return textbold;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028e A[LOOP:6: B:115:0x028c->B:116:0x028e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.RichText j(TL_iv.RichText richText) {
        TL_iv.RichText textconcat;
        int i;
        char c2;
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat2 = (TL_iv.textConcat) richText;
            for (int i2 = 0; i2 < textconcat2.texts.size(); i2++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat2.texts;
                arrayList.set(i2, j(arrayList.get(i2)));
            }
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            dl6 dl6Var = new dl6(new q7f((byte) 20), new jk2((byte) 28));
            ArrayList<TL_iv.RichText> arrayList4 = textconcat2.texts;
            int size = arrayList4.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                TL_iv.RichText richText2 = arrayList4.get(i3);
                if ((richText2 instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText2).text) != null && str.length() >= 2 && str.charAt(0) == '<' && str.charAt(str.length() - 1) == '>') {
                    int length = sb.length();
                    try {
                        dl6Var.b(sb, ((TL_iv.textPlain) richText2).text);
                    } catch (Throwable th) {
                        fc4.g(th, true);
                        sb.append(textplain.text);
                    }
                    int length2 = sb.length();
                    if (length2 > length) {
                        arrayList2.add(l(sb.substring(length, length2)));
                        arrayList3.add(new int[]{length, length2});
                    }
                } else {
                    String o = o(richText2);
                    int length3 = sb.length();
                    sb.append(o);
                    int length4 = sb.length();
                    arrayList2.add(richText2);
                    arrayList3.add(new int[]{length3, length4});
                }
                i3 = i4;
            }
            ArrayList arrayList5 = new ArrayList();
            int i5 = -1;
            try {
                int length5 = sb.length();
                ArrayList arrayList6 = dl6Var.a;
                if (arrayList6.size() > 0) {
                    if (length5 > -1) {
                        int size2 = arrayList6.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj = arrayList6.get(i6);
                            i6++;
                            fi5 fi5Var = (fi5) obj;
                            if (fi5Var.d <= -1) {
                                fi5Var.d = length5;
                            }
                        }
                    }
                    arrayList5.addAll(DesugarCollections.unmodifiableList(arrayList6));
                    arrayList6.clear();
                } else {
                    arrayList5.addAll(Collections.EMPTY_LIST);
                }
            } catch (Throwable th2) {
                fc4.g(th2, true);
            }
            try {
                int length6 = sb.length();
                ei5 ei5Var = dl6Var.b;
                while (true) {
                    ei5 ei5Var2 = ei5Var.e;
                    if (ei5Var2 == null) {
                        break;
                    }
                    ei5Var = ei5Var2;
                }
                if (length6 > -1) {
                    ei5Var.b(length6);
                }
                ArrayList arrayList7 = ei5Var.f;
                List unmodifiableList = arrayList7 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList7);
                if (unmodifiableList.size() > 0) {
                    c(arrayList5, unmodifiableList);
                } else {
                    c(arrayList5, Collections.EMPTY_LIST);
                }
                dl6Var.b = new ei5("", 0, Collections.EMPTY_MAP, null);
            } catch (Throwable th3) {
                fc4.g(th3, true);
            }
            Collections.sort(arrayList5, Comparator$-CC.comparingInt(new mn((byte) 7)));
            int size3 = arrayList5.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj2 = arrayList5.get(i7);
                i7++;
                gi5 gi5Var = (gi5) obj2;
                int i8 = gi5Var.d;
                if (i8 > i5) {
                    int i9 = gi5Var.b;
                    int i10 = i5;
                    int i11 = i10;
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        int i13 = ((int[]) arrayList3.get(i12))[0];
                        int i14 = ((int[]) arrayList3.get(i12))[1];
                        if (i13 >= i9 && i14 <= i8) {
                            if (i10 == i5) {
                                i10 = i12;
                            }
                            i11 = i12;
                        }
                    }
                    if (i10 != i5) {
                        if (i10 == i11) {
                            textconcat = (TL_iv.RichText) arrayList2.get(i10);
                        } else {
                            textconcat = new TL_iv.textConcat();
                            for (int i15 = i10; i15 <= i11; i15++) {
                                textconcat.texts.add((TL_iv.RichText) arrayList2.get(i15));
                            }
                        }
                        String str2 = gi5Var.a;
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase();
                            lowerCase.getClass();
                            i = 4;
                            switch (lowerCase.hashCode()) {
                                case -891985998:
                                    if (lowerCase.equals("strike")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -891980137:
                                    if (lowerCase.equals("strong")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case nm7.i1 /* 98 */:
                                    if (lowerCase.equals("b")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case nm7.p1 /* 105 */:
                                    if (lowerCase.equals("i")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case nm7.z1 /* 115 */:
                                    if (lowerCase.equals("s")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case nm7.B1 /* 117 */:
                                    if (lowerCase.equals("u")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3240:
                                    if (lowerCase.equals("em")) {
                                        c2 = 6;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3712:
                                    if (lowerCase.equals("tt")) {
                                        c2 = 7;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 99339:
                                    if (lowerCase.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                        c2 = '\b';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 104430:
                                    if (lowerCase.equals("ins")) {
                                        c2 = '\t';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 114240:
                                    if (lowerCase.equals("sub")) {
                                        c2 = '\n';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 114254:
                                    if (lowerCase.equals("sup")) {
                                        c2 = 11;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3059181:
                                    if (lowerCase.equals("code")) {
                                        c2 = '\f';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3344077:
                                    if (lowerCase.equals("mark")) {
                                        c2 = '\r';
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
                                case 4:
                                case '\b':
                                    i = 32;
                                    break;
                                case 1:
                                case 2:
                                    i = 1;
                                    break;
                                case 3:
                                case 6:
                                    i = 2;
                                    break;
                                case 5:
                                case '\t':
                                    i = 16;
                                    break;
                                case '\n':
                                    i = 128;
                                    break;
                                case 11:
                                    i = 256;
                                    break;
                                case '\r':
                                    i = 64;
                                    break;
                            }
                            if (i != 0) {
                                if (textconcat instanceof zk6) {
                                    ((zk6) textconcat).a |= i;
                                } else {
                                    zk6 zk6Var = new zk6();
                                    zk6Var.a = i;
                                    zk6Var.text = textconcat;
                                    textconcat = zk6Var;
                                }
                            }
                            while (i11 >= i10) {
                                arrayList2.remove(i11);
                                arrayList3.remove(i11);
                                i11--;
                            }
                            arrayList2.add(i10, textconcat);
                            arrayList3.add(i10, new int[]{i9, i8});
                            i5 = -1;
                        }
                        i = 0;
                        if (i != 0) {
                        }
                        while (i11 >= i10) {
                        }
                        arrayList2.add(i10, textconcat);
                        arrayList3.add(i10, new int[]{i9, i8});
                        i5 = -1;
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
                richText4.text = j(richText5);
                return richText;
            }
            richText4 = richText5;
        }
    }

    public static String k(String str, ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split = str.split("\n", -1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < split.length) {
            Matcher matcher = a.matcher(split[i]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                StringBuilder sb2 = new StringBuilder(matcher.group(2));
                while (true) {
                    i++;
                    while (i < split.length) {
                        String str2 = split[i];
                        if (str2.startsWith("    ") || str2.startsWith("\t")) {
                            sb2.append('\n');
                            sb2.append(str2.startsWith("\t") ? str2.substring(1) : str2.substring(4));
                        } else {
                            if (!str2.trim().isEmpty()) {
                                break;
                            }
                            int i2 = i + 1;
                            int i3 = i2;
                            while (i3 < split.length && split[i3].trim().isEmpty()) {
                                i3++;
                            }
                            if (i3 >= split.length || (!split[i3].startsWith("    ") && !split[i3].startsWith("\t"))) {
                                break;
                            }
                            sb2.append('\n');
                            i = i2;
                        }
                    }
                    break;
                }
                linkedHashMap.put(group, sb2.toString().trim());
            } else {
                sb.append(split[i]);
                if (i < split.length - 1) {
                    sb.append('\n');
                }
                i++;
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
        List<g84> asList = Arrays.asList(new bbb((byte) 0), new bbb((byte) 1));
        Pattern pattern = el6.j;
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList2.addAll(Arrays.asList(new sb0(), new ye0(), new ze0(), new if0((byte) 0), new ik2(), new q44(), new di5(), new pl7(), new if0((byte) 1)));
        arrayList3.addAll(Arrays.asList(new my((byte) 0), new my((byte) 1)));
        gm.L(18.0f);
        Executors.newCachedThreadPool();
        new Handler(Looper.getMainLooper());
        new HashMap(3);
        arrayList2.add(new ru5());
        arrayList2.add(new yk6());
        sm2 sm2Var = new sm2((byte) 10);
        if (asList == null) {
            gxc.d("extensions must not be null");
            return null;
        }
        for (g84 g84Var : asList) {
            if (g84Var instanceof bbb) {
                switch (((bbb) g84Var).a) {
                    case 0:
                        ((ArrayList) sm2Var.b).add(new abb());
                        break;
                    default:
                        ((ArrayList) sm2Var.d).add(new jl0((byte) 7));
                        break;
                }
            }
        }
        sm2Var.f = new mj4(arrayList2, arrayList3, (byte) 8);
        ((ArrayList) sm2Var.d).add(new jl0((byte) 5));
        e7a e7aVar = new e7a();
        ArrayList arrayList4 = (ArrayList) sm2Var.d;
        LinkedHashSet linkedHashSet = (LinkedHashSet) sm2Var.e;
        LinkedHashSet linkedHashSet2 = fq3.p;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.addAll(arrayList4);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList5.add(fq3.q.get((Class) it.next()));
        }
        e7aVar.a = arrayList5;
        rp5 rp5Var = (mj4) sm2Var.f;
        if (rp5Var == null) {
            rp5Var = new jk2((byte) 23);
        }
        e7aVar.c = rp5Var;
        e7aVar.d = (ArrayList) sm2Var.c;
        ArrayList arrayList6 = (ArrayList) sm2Var.b;
        e7aVar.b = arrayList6;
        rp5Var.f1(new wm4(arrayList6, Collections.EMPTY_MAP, (byte) 5));
        ArrayDeque arrayDeque = new ArrayDeque();
        String str3 = null;
        boolean z = false;
        for (String str4 : stringBuffer2.split("\n", -1)) {
            int i4 = 0;
            while (i4 < str4.length() && i4 < 3 && str4.charAt(i4) == ' ') {
                i4++;
            }
            String substring = str4.substring(i4);
            if (!z) {
                String str5 = "```";
                if (!substring.startsWith("```")) {
                    str5 = "~~~";
                    if (!substring.startsWith("~~~")) {
                        Matcher matcher3 = c.matcher(str4);
                        if (matcher3.find()) {
                            arrayDeque.add(matcher3.group(1));
                        }
                    }
                }
                z = true;
                str3 = str5;
            } else if (substring.startsWith(str3)) {
                str3 = null;
                z = false;
            }
        }
        wk6 wk6Var = new wk6(arrayList, arrayDeque);
        wk6Var.v(e7aVar.D(stringBuffer2));
        wk6Var.y();
        if (!linkedHashMap.isEmpty()) {
            TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
            String M0 = jb6.M0(2131748948, null);
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = l(M0);
            pageblockdetails.title = textbold;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                ArrayList arrayList7 = new ArrayList();
                wk6 wk6Var2 = new wk6(arrayList7, new ArrayDeque());
                wk6Var2.v(e7aVar.D(str7));
                wk6Var2.y();
                TL_iv.RichText textconcat = new TL_iv.textConcat();
                int size = arrayList7.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList7.get(i5);
                    i5++;
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                    TL_iv.RichText richText = pageBlock instanceof TL_iv.pageBlockParagraph ? ((TL_iv.pageBlockParagraph) pageBlock).text : pageBlock instanceof TL_iv.pageBlockHeader ? ((TL_iv.pageBlockHeader) pageBlock).text : pageBlock instanceof TL_iv.pageBlockSubheader ? ((TL_iv.pageBlockSubheader) pageBlock).text : pageBlock instanceof TL_iv.pageBlockTitle ? ((TL_iv.pageBlockTitle) pageBlock).text : null;
                    if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                        if (!textconcat.texts.isEmpty()) {
                            textconcat.texts.add(l("\n\n"));
                        }
                        textconcat.texts.add(richText);
                    }
                }
                if (textconcat.texts.isEmpty()) {
                    textconcat = new TL_iv.textEmpty();
                } else if (textconcat.texts.size() == 1) {
                    textconcat = textconcat.texts.get(0);
                }
                TL_iv.RichText b2 = b(textconcat);
                TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                textanchor.name = b10.h("fn-", str6);
                textanchor.text = b2;
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                String p = td4.p(str6, ". ");
                TL_iv.textBold textbold2 = new TL_iv.textBold();
                textbold2.text = l(p);
                TL_iv.RichText[] richTextArr = {textbold2, textanchor};
                TL_iv.textConcat textconcat2 = new TL_iv.textConcat();
                for (int i6 = 0; i6 < 2; i6++) {
                    textconcat2.texts.add(richTextArr[i6]);
                }
                pageblockparagraph.text = textconcat2;
                pageblockdetails.blocks.add(pageblockparagraph);
            }
            arrayList.add(pageblockdetails);
        }
        TL_iv.RichText richText2 = wk6Var.b;
        if (richText2 != null) {
            return o(richText2);
        }
        return null;
    }

    public static TL_iv.textPlain l(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        return textplain;
    }

    public static int m(TL_iv.RichText richText) {
        int i = 0;
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
            return m(richText.text);
        }
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            TL_iv.RichText richText2 = arrayList.get(i2);
            i2++;
            i += m(richText2);
        }
        return i;
    }

    public static TL_iv.RichText n(ui6 ui6Var, TL_iv.PageBlock pageBlock) {
        xk6 xk6Var = new xk6(pageBlock);
        ui6Var.a(xk6Var);
        return i(j(xk6.x(xk6Var.c)));
    }

    public static String o(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return o(richText.text);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_iv.RichText richText2 = arrayList.get(i);
            i++;
            sb.append(o(richText2));
        }
        return sb.toString();
    }

    public static List p(TL_iv.RichText richText) {
        int i;
        if (richText == null) {
            return Collections.singletonList(l(""));
        }
        if (m(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String o = o(richText);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < o.length()) {
            if (o.length() - i2 <= 8192) {
                arrayList.add(l(o.substring(i2)));
                return arrayList;
            }
            int i3 = i2 + TLObject.FLAG_13;
            int i4 = i2 + 8191;
            int lastIndexOf = o.lastIndexOf(10, i4);
            if (lastIndexOf <= i2) {
                lastIndexOf = o.lastIndexOf(32, i4);
            }
            if (lastIndexOf <= i2) {
                i = 0;
            } else {
                i = 1;
                i3 = lastIndexOf;
            }
            arrayList.add(l(o.substring(i2, i3)));
            i2 = i3 + i;
        }
        return arrayList;
    }
}
