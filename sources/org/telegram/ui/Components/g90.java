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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class g90 {
    public static final Pattern a = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    public static final Pattern b = Pattern.compile("\\[\\^([^\\]]+)\\]");
    public static final Pattern c = Pattern.compile("^(\\d+)[.)]\\s");

    public static TL_iv.RichText a(df.c cVar, TL_iv.PageBlock pageBlock) {
        d90 d90Var = new d90(pageBlock);
        cVar.a(d90Var);
        return k(l(d90.x(d90Var.c)));
    }

    public static List b(TL_iv.RichText richText) {
        int i10;
        if (richText == null) {
            return Collections.singletonList(n(""));
        }
        if (o(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String p5 = p(richText);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < p5.length()) {
            if (p5.length() - i11 <= 8192) {
                arrayList.add(n(p5.substring(i11)));
                return arrayList;
            }
            int i12 = i11 + TLObject.FLAG_13;
            int i13 = i11 + 8191;
            int lastIndexOf = p5.lastIndexOf(10, i13);
            if (lastIndexOf <= i11) {
                lastIndexOf = p5.lastIndexOf(32, i13);
            }
            if (lastIndexOf <= i11) {
                i10 = 0;
            } else {
                i10 = 1;
                i12 = lastIndexOf;
            }
            arrayList.add(n(p5.substring(i11, i12)));
            i11 = i12 + i10;
        }
        return arrayList;
    }

    public static TL_iv.textMath c(String str) {
        TL_iv.textMath textmath = new TL_iv.textMath();
        String trim = str == null ? "" : str.trim();
        textmath.source = trim;
        textmath.tried = true;
        bi.u a2 = bi.u.a(trim, org.telegram.messenger.i0.L(20.0f), true);
        if (a2 != null) {
            textmath.w = a2.b;
            textmath.h = a2.c;
            textmath.depth = a2.d;
            textmath.bitmap = a2.a;
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
            case org.telegram.messenger.zs.p1 /* 104 */:
                if (lowerCase.equals("h")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case org.telegram.messenger.zs.u1 /* 109 */:
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
        String p5 = p(richText);
        return n(p5.substring(0, Math.min(p5.length(), TLObject.FLAG_13)));
    }

    public static void f(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uc.a aVar = (uc.a) it.next();
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
    public static TLRPC.TL_webPage g(org.telegram.messenger.jj jjVar) {
        String str;
        TLRPC.Document F0;
        File i10;
        TLRPC.Document F02;
        File i11;
        boolean z10;
        int i12;
        str = "";
        if (j(jjVar)) {
            if (jjVar.k != null && (F02 = jjVar.F0()) != null && (i11 = i(jjVar)) != null && i11.length() <= 2097152) {
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) org.telegram.messenger.i0.V(TLRPC.TL_documentAttributeFilename.class, F02.attributes);
                String str2 = tL_documentAttributeFilename != null ? tL_documentAttributeFilename.file_name : null;
                TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                tL_webPage.url = str2 == null ? "" : str2;
                tL_webPage.display_url = str2 == null ? "" : str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_webPage.flags |= 4;
                    tL_webPage.title = str2;
                }
                TL_iv.TL_page tL_page = new TL_iv.TL_page();
                tL_page.local = i11;
                tL_page.url = tL_webPage.url;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(i11), StandardCharsets.UTF_8));
                    int i13 = 0;
                    int i14 = 0;
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
                                z10 = false;
                                boolean startsWith = readLine.startsWith("@@");
                                if (i13 > 0 && (z10 || i13 >= 160 || (i13 >= 80 && startsWith))) {
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
                                    i13 = 0;
                                    pageblockpreformatted = pageblockpreformatted2;
                                }
                                if (!z10) {
                                    str = d(readLine);
                                } else if (readLine.startsWith("+++ ") && !readLine.startsWith("+++ /dev/null")) {
                                    str = d(readLine);
                                }
                                if (i13 > 0) {
                                    sb2.append('\n');
                                }
                                sb2.append(readLine);
                                i13++;
                                int length = readLine.length();
                                for (i12 = 0; i12 < readLine.length(); i12++) {
                                    if (readLine.charAt(i12) == '\t') {
                                        length += 3;
                                    }
                                }
                                i14 = Math.max(i14, length);
                            }
                            z10 = true;
                            boolean startsWith2 = readLine.startsWith("@@");
                            if (i13 > 0) {
                                ArrayList<TL_iv.PageBlock> arrayList2 = tL_page.blocks;
                                TL_iv.pageBlockPreformatted pageblockpreformatted22 = new TL_iv.pageBlockPreformatted();
                                pageblockpreformatted22.text = n(sb2.toString());
                                pageblockpreformatted22.language = str;
                                pageblockpreformatted22.diff = true;
                                if (pageblockpreformatted != null) {
                                }
                                arrayList2.add(pageblockpreformatted22);
                                sb2.setLength(0);
                                i13 = 0;
                                pageblockpreformatted = pageblockpreformatted22;
                            }
                            if (!z10) {
                            }
                            if (i13 > 0) {
                            }
                            sb2.append(readLine);
                            i13++;
                            int length2 = readLine.length();
                            while (i12 < readLine.length()) {
                            }
                            i14 = Math.max(i14, length2);
                        } finally {
                        }
                    }
                    bufferedReader.close();
                    if (i13 > 0) {
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
                        int i15 = 0;
                        for (int i16 = 0; i16 < tL_page.blocks.size(); i16++) {
                            i15 += p(tL_page.blocks.get(i16).text).length();
                        }
                        for (int i17 = 0; i17 < tL_page.blocks.size(); i17++) {
                            ((TL_iv.pageBlockPreformatted) tL_page.blocks.get(i17)).codeLength = i15;
                            ((TL_iv.pageBlockPreformatted) tL_page.blocks.get(i17)).diffColumns = i14;
                        }
                        tL_webPage.flags |= 1024;
                        tL_webPage.cached_page = tL_page;
                        return tL_webPage;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return null;
                }
            }
        } else if (jjVar.k != null && (F0 = jjVar.F0()) != null && (i10 = i(jjVar)) != null && i10.length() <= 65536) {
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename2 = (TLRPC.TL_documentAttributeFilename) org.telegram.messenger.i0.V(TLRPC.TL_documentAttributeFilename.class, F0.attributes);
            String str3 = tL_documentAttributeFilename2 != null ? tL_documentAttributeFilename2.file_name : null;
            TLRPC.TL_webPage tL_webPage2 = new TLRPC.TL_webPage();
            tL_webPage2.url = str3 == null ? "" : str3;
            tL_webPage2.display_url = str3 != null ? str3 : "";
            if (!TextUtils.isEmpty(str3)) {
                tL_webPage2.flags |= 4;
                tL_webPage2.title = str3;
            }
            TL_iv.TL_page tL_page2 = new TL_iv.TL_page();
            tL_page2.local = i10;
            tL_page2.url = tL_webPage2.url;
            try {
                FileInputStream fileInputStream = new FileInputStream(i10);
                try {
                    byte[] bArr = new byte[(int) i10.length()];
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
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        return null;
    }

    public static int h(int i10, CharSequence charSequence) {
        char charAt;
        if (i10 >= charSequence.length() || (charAt = charSequence.charAt(i10)) == '\n' || charAt == ' ') {
            return 0;
        }
        if (charAt != '+' && charAt != '-') {
            return 3;
        }
        int i11 = i10 + 3;
        if (i11 < charSequence.length() && charSequence.charAt(i10 + 1) == charAt && charSequence.charAt(i10 + 2) == charAt && charSequence.charAt(i11) == ' ') {
            return 3;
        }
        return charAt == '+' ? 1 : 2;
    }

    public static File i(org.telegram.messenger.jj jjVar) {
        TLRPC.Message message = jjVar.k;
        int i10 = jjVar.I1;
        File file = !TextUtils.isEmpty(message.attachPath) ? new File(jjVar.k.attachPath) : null;
        if (file == null || !file.exists()) {
            org.telegram.messenger.b8.G(i10);
            file = org.telegram.messenger.b8.N(jjVar.k, false, true);
        }
        if (file == null || !file.exists()) {
            org.telegram.messenger.b8.G(i10);
            file = org.telegram.messenger.b8.N(jjVar.k, true, true);
        }
        if (file == null || !file.exists()) {
            return null;
        }
        return file;
    }

    public static boolean j(org.telegram.messenger.jj jjVar) {
        String Q0 = jjVar.Q0();
        if ("diff".equalsIgnoreCase(Q0) || "patch".equalsIgnoreCase(Q0)) {
            return true;
        }
        String u12 = jjVar.u1();
        if (u12 == null) {
            return false;
        }
        String lowerCase = u12.toLowerCase();
        return lowerCase.startsWith("text/x-diff") || lowerCase.startsWith("text/x-patch");
    }

    public static TL_iv.RichText k(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i10 = 0; i10 < textconcat.texts.size(); i10++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i10, k(arrayList.get(i10)));
            }
            return textconcat;
        }
        if (!(richText instanceof f90)) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                richText.text = k(richText2);
            }
            return richText;
        }
        f90 f90Var = (f90) richText;
        TL_iv.RichText k10 = k(f90Var.text);
        int i11 = f90Var.a;
        if ((i11 & 4) != 0) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = k10;
            k10 = textfixed;
        }
        if ((i11 & 32) != 0) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = k10;
            k10 = textstrike;
        }
        if ((i11 & 16) != 0) {
            TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
            textunderline.text = k10;
            k10 = textunderline;
        }
        if ((i11 & 64) != 0) {
            TL_iv.textMarked textmarked = new TL_iv.textMarked();
            textmarked.text = k10;
            k10 = textmarked;
        }
        if ((i11 & 128) != 0) {
            TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
            textsubscript.text = k10;
            k10 = textsubscript;
        }
        if ((i11 & 256) != 0) {
            TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = k10;
            k10 = textsuperscript;
        }
        if ((i11 & 2) != 0) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = k10;
            k10 = textitalic;
        }
        if ((i11 & 1) == 0) {
            return k10;
        }
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = k10;
        return textbold;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ab A[LOOP:6: B:108:0x02a9->B:109:0x02ab, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.RichText l(TL_iv.RichText richText) {
        TL_iv.RichText textconcat;
        int i10;
        char c10;
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat2 = (TL_iv.textConcat) richText;
            for (int i11 = 0; i11 < textconcat2.texts.size(); i11++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat2.texts;
                arrayList.set(i11, l(arrayList.get(i11)));
            }
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            uc.d dVar = new uc.d(new jb.b(22), new kb.a(22));
            ArrayList<TL_iv.RichText> arrayList4 = textconcat2.texts;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                TL_iv.RichText richText2 = arrayList4.get(i12);
                if ((richText2 instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText2).text) != null && str.length() >= 2 && str.charAt(0) == '<' && str.charAt(str.length() - 1) == '>') {
                    int length = sb2.length();
                    try {
                        dVar.b(sb2, ((TL_iv.textPlain) richText2).text);
                    } catch (Throwable th2) {
                        org.telegram.messenger.f8.g(th2, true);
                        sb2.append(textplain.text);
                    }
                    int length2 = sb2.length();
                    if (length2 > length) {
                        arrayList2.add(n(sb2.substring(length, length2)));
                        arrayList3.add(new int[]{length, length2});
                    }
                } else {
                    String p5 = p(richText2);
                    int length3 = sb2.length();
                    sb2.append(p5);
                    int length4 = sb2.length();
                    arrayList2.add(richText2);
                    arrayList3.add(new int[]{length3, length4});
                }
                i12 = i13;
            }
            ArrayList arrayList5 = new ArrayList();
            int i14 = -1;
            try {
                int length5 = sb2.length();
                ArrayList arrayList6 = dVar.c;
                if (arrayList6.size() > 0) {
                    if (length5 > -1) {
                        int size2 = arrayList6.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj = arrayList6.get(i15);
                            i15++;
                            uc.b bVar = (uc.b) obj;
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
                org.telegram.messenger.f8.g(th3, true);
            }
            try {
                int length6 = sb2.length();
                uc.a aVar = dVar.d;
                while (true) {
                    uc.a aVar2 = aVar.e;
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
                dVar.d = new uc.a("", 0, Collections.EMPTY_MAP, null);
            } catch (Throwable th4) {
                org.telegram.messenger.f8.g(th4, true);
            }
            Collections.sort(arrayList5, Comparator$-CC.comparingInt(new bi.t6(10)));
            int size3 = arrayList5.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj2 = arrayList5.get(i16);
                i16++;
                uc.c cVar = (uc.c) obj2;
                int i17 = cVar.d;
                if (i17 > i14) {
                    int i18 = cVar.b;
                    int i19 = i14;
                    int i20 = i19;
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
                                case org.telegram.messenger.zs.j1 /* 98 */:
                                    if (lowerCase.equals("b")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case org.telegram.messenger.zs.q1 /* 105 */:
                                    if (lowerCase.equals("i")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case org.telegram.messenger.zs.A1 /* 115 */:
                                    if (lowerCase.equals("s")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case org.telegram.messenger.zs.C1 /* 117 */:
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
                                if (textconcat instanceof f90) {
                                    ((f90) textconcat).a |= i10;
                                } else {
                                    f90 f90Var = new f90();
                                    f90Var.a = i10;
                                    f90Var.text = textconcat;
                                    textconcat = f90Var;
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
        int i10 = 0;
        while (i10 < split.length) {
            Matcher matcher = a.matcher(split[i10]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                StringBuilder sb3 = new StringBuilder(matcher.group(2));
                i10++;
                while (i10 < split.length) {
                    String str2 = split[i10];
                    if (str2.startsWith("    ") || str2.startsWith("\t")) {
                        sb3.append('\n');
                        sb3.append(str2.startsWith("\t") ? str2.substring(1) : str2.substring(4));
                        i10++;
                    } else {
                        if (!str2.trim().isEmpty()) {
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
                        sb3.append('\n');
                        i10 = i11;
                    }
                }
                linkedHashMap.put(group, sb3.toString().trim());
            } else {
                sb2.append(split[i10]);
                if (i10 < split.length - 1) {
                    sb2.append('\n');
                }
                i10++;
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
        List<ne.a> asList = Arrays.asList(new oe.b(0), new oe.b(1));
        Pattern pattern = yc.i.j;
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList2.addAll(Arrays.asList(new yc.a(), new yc.b(), new yc.c(), new yc.d(0), new yc.e(), new yc.f(), new yc.g(), new yc.j(), new yc.d(1)));
        arrayList3.addAll(Arrays.asList(new te.a(0), new te.a(1)));
        org.telegram.messenger.i0.L(18.0f);
        Executors.newCachedThreadPool();
        new Handler(Looper.getMainLooper());
        new HashMap(3);
        arrayList2.add(new tc.c());
        arrayList2.add(new e90());
        bh.d dVar = new bh.d();
        dVar.a = new ArrayList();
        dVar.b = new ArrayList();
        dVar.c = new ArrayList();
        dVar.d = se.d.p;
        if (asList == null) {
            throw new NullPointerException("extensions must not be null");
        }
        for (ne.a aVar : asList) {
            if (aVar instanceof oe.b) {
                switch (((oe.b) aVar).a) {
                    case 0:
                        ((ArrayList) dVar.b).add(new pe.a());
                        break;
                    default:
                        ((ArrayList) dVar.a).add(new re.a(0));
                        break;
                }
            }
        }
        dVar.e = new u9.b(9, arrayList2, arrayList3);
        ((ArrayList) dVar.a).add(new re.a(8));
        ji.f fVar = new ji.f(dVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        String str3 = null;
        boolean z10 = false;
        for (String str4 : stringBuffer2.split("\n", -1)) {
            int i13 = 0;
            while (i13 < str4.length() && i13 < 3 && str4.charAt(i13) == ' ') {
                i13++;
            }
            String substring = str4.substring(i13);
            if (!z10) {
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
                z10 = true;
                str3 = str5;
            } else if (substring.startsWith(str3)) {
                str3 = null;
                z10 = false;
            }
        }
        c90 c90Var = new c90(arrayList, arrayDeque);
        c90Var.v(fVar.p(stringBuffer2));
        c90Var.y();
        if (!linkedHashMap.isEmpty()) {
            TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
            String L0 = org.telegram.messenger.cd.L0(2131749200, null);
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = n(L0);
            pageblockdetails.title = textbold;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                ArrayList arrayList4 = new ArrayList();
                c90 c90Var2 = new c90(arrayList4, new ArrayDeque());
                c90Var2.v(fVar.p(str7));
                c90Var2.y();
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
                TL_iv.RichText e = e(textconcat);
                TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                textanchor.name = sc.e.h("fn-", str6);
                textanchor.text = e;
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                String A = sc.e.A(str6, ". ");
                TL_iv.textBold textbold2 = new TL_iv.textBold();
                textbold2.text = n(A);
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
        TL_iv.RichText richText2 = c90Var.b;
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
            return o(richText.text);
        }
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            TL_iv.RichText richText2 = arrayList.get(i11);
            i11++;
            i10 += o(richText2);
        }
        return i10;
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
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            sb2.append(p(richText2));
        }
        return sb2.toString();
    }
}
