package org.telegram.ui.Components;

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
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class o80 {
    public static final Pattern a = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    public static final Pattern b = Pattern.compile("\\[\\^([^\\]]+)\\]");
    public static final Pattern c = Pattern.compile("^(\\d+)[.)]\\s");

    public static TL_iv.RichText a(kf.p pVar, TL_iv.PageBlock pageBlock) {
        l80 l80Var = new l80(pageBlock);
        pVar.a(l80Var);
        return k(l(l80.x(l80Var.c)));
    }

    public static List b(TL_iv.RichText richText) {
        int i7;
        if (richText == null) {
            return Collections.singletonList(n(""));
        }
        if (o(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String p10 = p(richText);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < p10.length()) {
            if (p10.length() - i10 <= 8192) {
                arrayList.add(n(p10.substring(i10)));
                return arrayList;
            }
            int i11 = i10 + TLObject.FLAG_13;
            int i12 = i10 + 8191;
            int lastIndexOf = p10.lastIndexOf(10, i12);
            if (lastIndexOf <= i10) {
                lastIndexOf = p10.lastIndexOf(32, i12);
            }
            if (lastIndexOf <= i10) {
                i7 = 0;
            } else {
                i7 = 1;
                i11 = lastIndexOf;
            }
            arrayList.add(n(p10.substring(i10, i11)));
            i10 = i11 + i7;
        }
        return arrayList;
    }

    public static TL_iv.textMath c(String str) {
        TL_iv.textMath textmath = new TL_iv.textMath();
        String trim = str == null ? "" : str.trim();
        textmath.source = trim;
        textmath.tried = true;
        li.q a10 = li.q.a(trim, org.telegram.messenger.g0.L(20.0f), true);
        if (a10 != null) {
            textmath.w = a10.b;
            textmath.h = a10.c;
            textmath.depth = a10.d;
            textmath.bitmap = a10.a;
        }
        return textmath;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
    
        if (r5.equals("py") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(String str) {
        char c10 = '\t';
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
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case org.telegram.messenger.qs.p1 /* 104 */:
                if (lowerCase.equals("h")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case org.telegram.messenger.qs.u1 /* 109 */:
                if (lowerCase.equals("m")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3168:
                if (lowerCase.equals("cc")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3184:
                if (lowerCase.equals("cs")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 3328:
                if (lowerCase.equals("hh")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3433:
                if (lowerCase.equals("kt")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3479:
                if (lowerCase.equals("md")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 3488:
                if (lowerCase.equals("mm")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 3593:
                break;
            case 3632:
                if (lowerCase.equals("rb")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 3649:
                if (lowerCase.equals("rs")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 3669:
                if (lowerCase.equals("sh")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 98979:
                if (lowerCase.equals("cxx")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 103528:
                if (lowerCase.equals("hpp")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 103649:
                if (lowerCase.equals("htm")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 106538:
                if (lowerCase.equals("kts")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 119768:
                if (lowerCase.equals("yml")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 120911:
                if (lowerCase.equals("zsh")) {
                    c10 = 18;
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

    public static TL_iv.RichText e(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (o(richText) <= 8192) {
            return richText;
        }
        String p10 = p(richText);
        return n(p10.substring(0, Math.min(p10.length(), TLObject.FLAG_13)));
    }

    public static void f(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ad.a aVar = (ad.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f;
            f(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[Catch: all -> 0x00a5, TryCatch #3 {all -> 0x00a5, blocks: (B:28:0x0081, B:30:0x0087, B:32:0x008f, B:33:0x00a8, B:35:0x00b0, B:39:0x00bc, B:47:0x00d0, B:49:0x00e7, B:50:0x00eb, B:52:0x00f5, B:54:0x0110, B:55:0x0115, B:56:0x011f, B:58:0x0125, B:60:0x012d, B:62:0x012f, B:65:0x0132, B:66:0x00fa, B:68:0x0102, B:70:0x010a), top: B:27:0x0081, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5 A[Catch: all -> 0x00a5, TryCatch #3 {all -> 0x00a5, blocks: (B:28:0x0081, B:30:0x0087, B:32:0x008f, B:33:0x00a8, B:35:0x00b0, B:39:0x00bc, B:47:0x00d0, B:49:0x00e7, B:50:0x00eb, B:52:0x00f5, B:54:0x0110, B:55:0x0115, B:56:0x011f, B:58:0x0125, B:60:0x012d, B:62:0x012f, B:65:0x0132, B:66:0x00fa, B:68:0x0102, B:70:0x010a), top: B:27:0x0081, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110 A[Catch: all -> 0x00a5, TryCatch #3 {all -> 0x00a5, blocks: (B:28:0x0081, B:30:0x0087, B:32:0x008f, B:33:0x00a8, B:35:0x00b0, B:39:0x00bc, B:47:0x00d0, B:49:0x00e7, B:50:0x00eb, B:52:0x00f5, B:54:0x0110, B:55:0x0115, B:56:0x011f, B:58:0x0125, B:60:0x012d, B:62:0x012f, B:65:0x0132, B:66:0x00fa, B:68:0x0102, B:70:0x010a), top: B:27:0x0081, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125 A[Catch: all -> 0x00a5, TryCatch #3 {all -> 0x00a5, blocks: (B:28:0x0081, B:30:0x0087, B:32:0x008f, B:33:0x00a8, B:35:0x00b0, B:39:0x00bc, B:47:0x00d0, B:49:0x00e7, B:50:0x00eb, B:52:0x00f5, B:54:0x0110, B:55:0x0115, B:56:0x011f, B:58:0x0125, B:60:0x012d, B:62:0x012f, B:65:0x0132, B:66:0x00fa, B:68:0x0102, B:70:0x010a), top: B:27:0x0081, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa A[Catch: all -> 0x00a5, TryCatch #3 {all -> 0x00a5, blocks: (B:28:0x0081, B:30:0x0087, B:32:0x008f, B:33:0x00a8, B:35:0x00b0, B:39:0x00bc, B:47:0x00d0, B:49:0x00e7, B:50:0x00eb, B:52:0x00f5, B:54:0x0110, B:55:0x0115, B:56:0x011f, B:58:0x0125, B:60:0x012d, B:62:0x012f, B:65:0x0132, B:66:0x00fa, B:68:0x0102, B:70:0x010a), top: B:27:0x0081, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.TL_webPage g(org.telegram.messenger.ij ijVar) {
        String str;
        TLRPC.Document F0;
        File i7;
        TLRPC.Document F02;
        File i10;
        boolean z9;
        int i11;
        str = "";
        if (j(ijVar)) {
            if (ijVar.k != null && (F02 = ijVar.F0()) != null && (i10 = i(ijVar)) != null && i10.length() <= 2097152) {
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeFilename.class, F02.attributes);
                String str2 = tL_documentAttributeFilename != null ? tL_documentAttributeFilename.file_name : null;
                TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                tL_webPage.url = str2 == null ? "" : str2;
                tL_webPage.display_url = str2 == null ? "" : str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_webPage.flags |= 4;
                    tL_webPage.title = str2;
                }
                TL_iv.TL_page tL_page = new TL_iv.TL_page();
                tL_page.local = i10;
                tL_page.url = tL_webPage.url;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(i10), StandardCharsets.UTF_8));
                    int i12 = 0;
                    int i13 = 0;
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
                            if (!readLine.startsWith("diff ") && !readLine.startsWith("Index: ")) {
                                z9 = false;
                                boolean startsWith = readLine.startsWith("@@");
                                if (i12 > 0 && (z9 || i12 >= 160 || (i12 >= 80 && startsWith))) {
                                    ArrayList<TL_iv.PageBlock> arrayList = tL_page.blocks;
                                    TL_iv.pageBlockPreformatted pageblockpreformatted2 = new TL_iv.pageBlockPreformatted();
                                    pageblockpreformatted2.text = n(sb2.toString());
                                    pageblockpreformatted2.language = str;
                                    pageblockpreformatted2.diff = true;
                                    if (pageblockpreformatted != null) {
                                        pageblockpreformatted.continuesNext = true;
                                        pageblockpreformatted2.continuesPrev = true;
                                    }
                                    arrayList.add(pageblockpreformatted2);
                                    sb2.setLength(0);
                                    i12 = 0;
                                    pageblockpreformatted = pageblockpreformatted2;
                                }
                                if (!z9) {
                                    str = d(readLine);
                                } else if (readLine.startsWith("+++ ") && !readLine.startsWith("+++ /dev/null")) {
                                    str = d(readLine);
                                }
                                if (i12 > 0) {
                                    sb2.append('\n');
                                }
                                sb2.append(readLine);
                                i12++;
                                int length = readLine.length();
                                for (i11 = 0; i11 < readLine.length(); i11++) {
                                    if (readLine.charAt(i11) == '\t') {
                                        length += 3;
                                    }
                                }
                                i13 = Math.max(i13, length);
                            }
                            z9 = true;
                            boolean startsWith2 = readLine.startsWith("@@");
                            if (i12 > 0) {
                                ArrayList<TL_iv.PageBlock> arrayList2 = tL_page.blocks;
                                TL_iv.pageBlockPreformatted pageblockpreformatted22 = new TL_iv.pageBlockPreformatted();
                                pageblockpreformatted22.text = n(sb2.toString());
                                pageblockpreformatted22.language = str;
                                pageblockpreformatted22.diff = true;
                                if (pageblockpreformatted != null) {
                                }
                                arrayList2.add(pageblockpreformatted22);
                                sb2.setLength(0);
                                i12 = 0;
                                pageblockpreformatted = pageblockpreformatted22;
                            }
                            if (!z9) {
                            }
                            if (i12 > 0) {
                            }
                            sb2.append(readLine);
                            i12++;
                            int length2 = readLine.length();
                            while (i11 < readLine.length()) {
                            }
                            i13 = Math.max(i13, length2);
                        } finally {
                        }
                    }
                    bufferedReader.close();
                    if (i12 > 0) {
                        ArrayList<TL_iv.PageBlock> arrayList3 = tL_page.blocks;
                        TL_iv.pageBlockPreformatted pageblockpreformatted3 = new TL_iv.pageBlockPreformatted();
                        pageblockpreformatted3.text = n(sb2.toString());
                        pageblockpreformatted3.language = str;
                        pageblockpreformatted3.diff = true;
                        if (pageblockpreformatted != null) {
                            pageblockpreformatted.continuesNext = true;
                            pageblockpreformatted3.continuesPrev = true;
                        }
                        arrayList3.add(pageblockpreformatted3);
                    }
                    if (!tL_page.blocks.isEmpty()) {
                        int i14 = 0;
                        for (int i15 = 0; i15 < tL_page.blocks.size(); i15++) {
                            i14 += p(tL_page.blocks.get(i15).text).length();
                        }
                        for (int i16 = 0; i16 < tL_page.blocks.size(); i16++) {
                            ((TL_iv.pageBlockPreformatted) tL_page.blocks.get(i16)).codeLength = i14;
                            ((TL_iv.pageBlockPreformatted) tL_page.blocks.get(i16)).diffColumns = i13;
                        }
                        tL_webPage.flags |= 1024;
                        tL_webPage.cached_page = tL_page;
                        return tL_webPage;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return null;
                }
            }
        } else if (ijVar.k != null && (F0 = ijVar.F0()) != null && (i7 = i(ijVar)) != null && i7.length() <= 65536) {
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename2 = (TLRPC.TL_documentAttributeFilename) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeFilename.class, F0.attributes);
            String str3 = tL_documentAttributeFilename2 != null ? tL_documentAttributeFilename2.file_name : null;
            TLRPC.TL_webPage tL_webPage2 = new TLRPC.TL_webPage();
            tL_webPage2.url = str3 == null ? "" : str3;
            tL_webPage2.display_url = str3 != null ? str3 : "";
            if (!TextUtils.isEmpty(str3)) {
                tL_webPage2.flags |= 4;
                tL_webPage2.title = str3;
            }
            TL_iv.TL_page tL_page2 = new TL_iv.TL_page();
            tL_page2.local = i7;
            tL_page2.url = tL_webPage2.url;
            try {
                FileInputStream fileInputStream = new FileInputStream(i7);
                try {
                    byte[] bArr = new byte[(int) i7.length()];
                    fileInputStream.read(bArr);
                    String str4 = new String(bArr, StandardCharsets.UTF_8);
                    fileInputStream.close();
                    if (str4.length() <= 65536) {
                        String m10 = m(str4, tL_page2.blocks);
                        if (!TextUtils.isEmpty(m10)) {
                            tL_webPage2.flags |= 4;
                            tL_webPage2.title = m10;
                        }
                        tL_webPage2.flags |= 1024;
                        tL_webPage2.cached_page = tL_page2;
                        return tL_webPage2;
                    }
                } finally {
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        return null;
    }

    public static int h(int i7, CharSequence charSequence) {
        char charAt;
        if (i7 >= charSequence.length() || (charAt = charSequence.charAt(i7)) == '\n' || charAt == ' ') {
            return 0;
        }
        if (charAt != '+' && charAt != '-') {
            return 3;
        }
        int i10 = i7 + 3;
        if (i10 < charSequence.length() && charSequence.charAt(i7 + 1) == charAt && charSequence.charAt(i7 + 2) == charAt && charSequence.charAt(i10) == ' ') {
            return 3;
        }
        return charAt == '+' ? 1 : 2;
    }

    public static File i(org.telegram.messenger.ij ijVar) {
        TLRPC.Message message = ijVar.k;
        int i7 = ijVar.I1;
        File file = !TextUtils.isEmpty(message.attachPath) ? new File(ijVar.k.attachPath) : null;
        if (file == null || !file.exists()) {
            org.telegram.messenger.w7.G(i7);
            file = org.telegram.messenger.w7.M(ijVar.k, false, true);
        }
        if (file == null || !file.exists()) {
            org.telegram.messenger.w7.G(i7);
            file = org.telegram.messenger.w7.M(ijVar.k, true, true);
        }
        if (file == null || !file.exists()) {
            return null;
        }
        return file;
    }

    public static boolean j(org.telegram.messenger.ij ijVar) {
        String Q0 = ijVar.Q0();
        if ("diff".equalsIgnoreCase(Q0) || "patch".equalsIgnoreCase(Q0)) {
            return true;
        }
        String t12 = ijVar.t1();
        if (t12 == null) {
            return false;
        }
        String lowerCase = t12.toLowerCase();
        return lowerCase.startsWith("text/x-diff") || lowerCase.startsWith("text/x-patch");
    }

    public static TL_iv.RichText k(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i7 = 0; i7 < textconcat.texts.size(); i7++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i7, k(arrayList.get(i7)));
            }
            return textconcat;
        }
        if (!(richText instanceof n80)) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                richText.text = k(richText2);
            }
            return richText;
        }
        n80 n80Var = (n80) richText;
        TL_iv.RichText k10 = k(n80Var.text);
        int i10 = n80Var.a;
        if ((i10 & 4) != 0) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = k10;
            k10 = textfixed;
        }
        if ((i10 & 32) != 0) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = k10;
            k10 = textstrike;
        }
        if ((i10 & 16) != 0) {
            TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
            textunderline.text = k10;
            k10 = textunderline;
        }
        if ((i10 & 64) != 0) {
            TL_iv.textMarked textmarked = new TL_iv.textMarked();
            textmarked.text = k10;
            k10 = textmarked;
        }
        if ((i10 & 128) != 0) {
            TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
            textsubscript.text = k10;
            k10 = textsubscript;
        }
        if ((i10 & 256) != 0) {
            TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = k10;
            k10 = textsuperscript;
        }
        if ((i10 & 2) != 0) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = k10;
            k10 = textitalic;
        }
        if ((i10 & 1) == 0) {
            return k10;
        }
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = k10;
        return textbold;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:6: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.RichText l(TL_iv.RichText richText) {
        TL_iv.RichText textconcat;
        int i7;
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
                arrayList.set(i10, l(arrayList.get(i10)));
            }
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ad.d dVar = new ad.d(new nb.a(2), new pb.b(2));
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
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                        sb2.append(textplain.text);
                    }
                    int length2 = sb2.length();
                    if (length2 > length) {
                        arrayList2.add(n(sb2.substring(length, length2)));
                        arrayList3.add(new int[]{length, length2});
                    }
                } else {
                    String p10 = p(richText2);
                    int length3 = sb2.length();
                    sb2.append(p10);
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
                            ad.b bVar = (ad.b) obj;
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
                org.telegram.messenger.a8.g(th3, true);
            }
            try {
                int length6 = sb2.length();
                ad.a aVar = dVar.d;
                while (true) {
                    ad.a aVar2 = aVar.e;
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
                    f(arrayList5, unmodifiableList);
                } else {
                    f(arrayList5, Collections.EMPTY_LIST);
                }
                dVar.d = new ad.a("", 0, Collections.EMPTY_MAP, null);
            } catch (Throwable th4) {
                org.telegram.messenger.a8.g(th4, true);
            }
            Collections.sort(arrayList5, Comparator$-CC.comparingInt(new bg.d(19)));
            int size3 = arrayList5.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj2 = arrayList5.get(i15);
                i15++;
                ad.c cVar = (ad.c) obj2;
                int i16 = cVar.d;
                if (i16 > i13) {
                    int i17 = cVar.b;
                    int i18 = i13;
                    int i19 = i18;
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
                            i7 = 4;
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
                                case org.telegram.messenger.qs.j1 /* 98 */:
                                    if (lowerCase.equals("b")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case org.telegram.messenger.qs.q1 /* 105 */:
                                    if (lowerCase.equals("i")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case org.telegram.messenger.qs.A1 /* 115 */:
                                    if (lowerCase.equals("s")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case org.telegram.messenger.qs.C1 /* 117 */:
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
                                    i7 = 32;
                                    break;
                                case 1:
                                case 2:
                                    i7 = 1;
                                    break;
                                case 3:
                                case 6:
                                    i7 = 2;
                                    break;
                                case 5:
                                case '\t':
                                    i7 = 16;
                                    break;
                                case '\n':
                                    i7 = 128;
                                    break;
                                case 11:
                                    i7 = 256;
                                    break;
                                case '\r':
                                    i7 = 64;
                                    break;
                            }
                            if (i7 != 0) {
                                if (textconcat instanceof n80) {
                                    ((n80) textconcat).a |= i7;
                                } else {
                                    n80 n80Var = new n80();
                                    n80Var.a = i7;
                                    n80Var.text = textconcat;
                                    textconcat = n80Var;
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
                        i7 = 0;
                        if (i7 != 0) {
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
                richText4.text = l(richText5);
                return richText;
            }
            richText4 = richText5;
        }
    }

    public static String m(String str, ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split = str.split("\n", -1);
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (i7 < split.length) {
            Matcher matcher = a.matcher(split[i7]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                StringBuilder sb3 = new StringBuilder(matcher.group(2));
                i7++;
                while (i7 < split.length) {
                    String str2 = split[i7];
                    if (str2.startsWith("    ") || str2.startsWith("\t")) {
                        sb3.append('\n');
                        sb3.append(str2.startsWith("\t") ? str2.substring(1) : str2.substring(4));
                        i7++;
                    } else {
                        if (!str2.trim().isEmpty()) {
                            break;
                        }
                        int i10 = i7 + 1;
                        int i11 = i10;
                        while (i11 < split.length && split[i11].trim().isEmpty()) {
                            i11++;
                        }
                        if (i11 >= split.length || (!split[i11].startsWith("    ") && !split[i11].startsWith("\t"))) {
                            break;
                        }
                        sb3.append('\n');
                        i7 = i10;
                    }
                }
                linkedHashMap.put(group, sb3.toString().trim());
            } else {
                sb2.append(split[i7]);
                if (i7 < split.length - 1) {
                    sb2.append('\n');
                }
                i7++;
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
        List<bf.a> asList = Arrays.asList(new cf.b(0), new cf.b(1));
        Pattern pattern = ed.i.j;
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList2.addAll(Arrays.asList(new ed.a(), new ed.b(), new ed.c(), new ed.d(0), new ed.e(), new ed.f(), new ed.g(), new ed.j(), new ed.d(1)));
        arrayList3.addAll(Arrays.asList(new hf.a(0), new hf.a(1)));
        org.telegram.messenger.g0.L(18.0f);
        Executors.newCachedThreadPool();
        new Handler(Looper.getMainLooper());
        new HashMap(3);
        arrayList2.add(new zc.c());
        arrayList2.add(new m80());
        a8.r7 r7Var = new a8.r7();
        if (asList == null) {
            throw new NullPointerException("extensions must not be null");
        }
        for (bf.a aVar : asList) {
            if (aVar instanceof cf.b) {
                switch (((cf.b) aVar).a) {
                    case 0:
                        ((ArrayList) r7Var.c).add(new df.a());
                        break;
                    default:
                        ((ArrayList) r7Var.b).add(new ff.a(0));
                        break;
                }
            }
        }
        r7Var.f = new q4.q(arrayList2, arrayList3, false, 18);
        ((ArrayList) r7Var.b).add(new ff.a(8));
        ab.b0 b0Var = new ab.b0(r7Var);
        ArrayDeque arrayDeque = new ArrayDeque();
        String str3 = null;
        boolean z9 = false;
        for (String str4 : stringBuffer2.split("\n", -1)) {
            int i12 = 0;
            while (i12 < str4.length() && i12 < 3 && str4.charAt(i12) == ' ') {
                i12++;
            }
            String substring = str4.substring(i12);
            if (!z9) {
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
                z9 = true;
                str3 = str5;
            } else if (substring.startsWith(str3)) {
                str3 = null;
                z9 = false;
            }
        }
        k80 k80Var = new k80(arrayList, arrayDeque);
        k80Var.v(b0Var.p(stringBuffer2));
        k80Var.y();
        if (!linkedHashMap.isEmpty()) {
            TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
            String M0 = org.telegram.messenger.id.M0(2131749191, null);
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = n(M0);
            pageblockdetails.title = textbold;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                ArrayList arrayList4 = new ArrayList();
                k80 k80Var2 = new k80(arrayList4, new ArrayDeque());
                k80Var2.v(b0Var.p(str7));
                k80Var2.y();
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
                            textconcat.texts.add(n("\n\n"));
                        }
                        textconcat.texts.add(richText);
                    }
                }
                if (textconcat.texts.isEmpty()) {
                    textconcat = new TL_iv.textEmpty();
                } else if (textconcat.texts.size() == 1) {
                    textconcat = textconcat.texts.get(0);
                }
                TL_iv.RichText e10 = e(textconcat);
                TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                textanchor.name = rf.b.i("fn-", str6);
                textanchor.text = e10;
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                String r10 = rf.b.r(str6, ". ");
                TL_iv.textBold textbold2 = new TL_iv.textBold();
                textbold2.text = n(r10);
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
        TL_iv.RichText richText2 = k80Var.b;
        if (richText2 != null) {
            return p(richText2);
        }
        return null;
    }

    public static TL_iv.textPlain n(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        return textplain;
    }

    public static int o(TL_iv.RichText richText) {
        int i7 = 0;
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
            return o(richText.text);
        }
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            i7 += o(richText2);
        }
        return i7;
    }

    public static String p(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return p(richText.text);
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_iv.RichText richText2 = arrayList.get(i7);
            i7++;
            sb2.append(p(richText2));
        }
        return sb2.toString();
    }
}
