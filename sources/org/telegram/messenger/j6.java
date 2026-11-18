package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.text.Spannable;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class j6 {
    public static final HashMap a = new HashMap();
    public static final int b;
    public static final int c;
    public static final Paint d;
    public static final int[] e;
    public static final Bitmap[][] f;
    public static final boolean[][] g;
    public static final HashMap h;
    public static final ArrayList i;
    public static final HashMap j;
    public static boolean k;
    public static final j2 l;
    public static float m;
    public static boolean n;
    public static final String[] o;

    static {
        String[][] strArr = k6.i;
        e = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        f = new Bitmap[8][];
        g = new boolean[8][];
        h = new HashMap();
        i = new ArrayList();
        j = new HashMap();
        l = new j2(2);
        n = true;
        o = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        b = g0.L(20.0f);
        c = g0.L(g0.Q1() ? 40.0f : 34.0f);
        int i7 = 0;
        while (true) {
            Bitmap[][] bitmapArr = f;
            if (i7 >= bitmapArr.length) {
                break;
            }
            int i10 = e[i7];
            bitmapArr[i7] = new Bitmap[i10];
            g[i7] = new boolean[i10];
            i7++;
        }
        int i11 = 0;
        while (true) {
            char[] cArr = k6.a;
            if (i11 >= 8) {
                Paint paint = new Paint();
                d = paint;
                paint.setColor(0);
                return;
            }
            int i12 = 0;
            while (true) {
                String[] strArr2 = k6.i[i11];
                if (i12 < strArr2.length) {
                    HashMap hashMap = a;
                    String str = strArr2[i12];
                    e6 e6Var = new e6();
                    e6Var.a = (byte) i11;
                    e6Var.b = (short) i12;
                    hashMap.put(str, e6Var);
                    i12++;
                }
            }
            i11++;
        }
    }

    public static void a(String str) {
        HashMap hashMap = h;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 && hashMap.size() >= 48) {
            ArrayList arrayList = i;
            hashMap.remove((String) i5.c.h(1, arrayList));
            arrayList.set(arrayList.size() - 1, str);
        }
        hashMap.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static boolean b(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 2 && charSequence.charAt(charSequence.length() - 2) == 8205 && charSequence.charAt(charSequence.length() - 1) == 10145;
    }

    public static String c(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt < 55356 || charAt > 55358) {
                if (charAt == 8419) {
                    return str;
                }
                if (charAt >= 8252 && charAt <= 12953 && k6.j.containsKey(Character.valueOf(charAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    i7++;
                    sb2.append(str.substring(0, i7));
                    sb2.append("️");
                    sb2.append(str.substring(i7));
                    str = sb2.toString();
                    length++;
                }
            } else if (charAt != 55356 || i7 >= length - 1) {
                i7++;
            } else {
                int i10 = i7 + 1;
                char charAt2 = str.charAt(i10);
                if (charAt2 == 56879 || charAt2 == 56324 || charAt2 == 56858 || charAt2 == 56703) {
                    StringBuilder sb3 = new StringBuilder();
                    i7 += 2;
                    sb3.append(str.substring(0, i7));
                    sb3.append("️");
                    sb3.append(str.substring(i7));
                    str = sb3.toString();
                    length++;
                } else {
                    i7 = i10;
                }
            }
            i7++;
        }
        return str;
    }

    public static boolean d(CharSequence charSequence) {
        int[] iArr = new int[1];
        j(charSequence, iArr);
        return iArr[0] > 0;
    }

    public static e6 e(CharSequence charSequence) {
        CharSequence charSequence2;
        if (b(charSequence)) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 2);
        }
        HashMap hashMap = a;
        e6 e6Var = (e6) hashMap.get(charSequence);
        return (e6Var != null || (charSequence2 = (CharSequence) k6.n.get(charSequence)) == null) ? e6Var : (e6) hashMap.get(charSequence2);
    }

    public static f6 f(String str) {
        CharSequence charSequence;
        f6 a10 = j4.a(str, null, null);
        if (a10 != null) {
            int i7 = b;
            a10.setBounds(0, 0, i7, i7);
        } else {
            a10 = null;
        }
        if (a10 == null) {
            a10 = g(str);
        }
        if (a10 == null && (charSequence = (CharSequence) k6.n.get(str)) != null) {
            a10 = g(charSequence);
        }
        if (a10 == null) {
            return null;
        }
        int i10 = c;
        a10.setBounds(0, 0, i10, i10);
        a10.a = true;
        return a10;
    }

    public static f6 g(CharSequence charSequence) {
        h4 a10;
        e6 e10 = e(charSequence);
        int i7 = b;
        if (e10 == null) {
            if (charSequence == null || (a10 = j4.a(charSequence.toString(), null, null)) == null) {
                return null;
            }
            a10.setBounds(0, 0, i7, i7);
            return a10;
        }
        boolean b10 = b(charSequence);
        i6 i6Var = new i6();
        i6Var.c = e10;
        i6Var.d = b10;
        i6Var.setBounds(0, 0, i7, i7);
        return i6Var;
    }

    public static boolean h(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap hashMap = a;
        e6 e6Var = (e6) hashMap.get(charSequence);
        if (e6Var == null && (charSequence2 = (CharSequence) k6.n.get(charSequence)) != null) {
            e6Var = (e6) hashMap.get(charSequence2);
        }
        return e6Var != null;
    }

    public static void i(final byte b10, final short s5) {
        if (f[b10][s5] == null) {
            boolean[] zArr = g[b10];
            if (zArr[s5]) {
                return;
            }
            zArr[s5] = true;
            Utilities.e.c(new Runnable() { // from class: org.telegram.messenger.d6
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap bitmap;
                    byte b11 = b10;
                    short s9 = s5;
                    try {
                        bitmap = l6.a.h(b11, s9);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        j6.f[b11][s9] = bitmap;
                        j2 j2Var = j6.l;
                        g0.r(j2Var);
                        g0.g3(j2Var);
                    }
                    j6.g[b11][s9] = false;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ab A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:9:0x002e, B:24:0x0127, B:36:0x01ab, B:38:0x01af, B:42:0x01bc, B:44:0x01c2, B:46:0x021f, B:63:0x01f1, B:65:0x01f5, B:76:0x020a, B:78:0x020e, B:91:0x022a, B:93:0x0232, B:95:0x0236, B:97:0x0241, B:101:0x024f, B:104:0x025f, B:106:0x0269, B:108:0x026c, B:109:0x0283, B:115:0x014d, B:117:0x0154, B:119:0x0160, B:123:0x0170, B:125:0x0176, B:126:0x0182, B:128:0x018a, B:129:0x0191, B:131:0x019b, B:157:0x007d, B:203:0x00e0), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0228 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0232 A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:9:0x002e, B:24:0x0127, B:36:0x01ab, B:38:0x01af, B:42:0x01bc, B:44:0x01c2, B:46:0x021f, B:63:0x01f1, B:65:0x01f5, B:76:0x020a, B:78:0x020e, B:91:0x022a, B:93:0x0232, B:95:0x0236, B:97:0x0241, B:101:0x024f, B:104:0x025f, B:106:0x0269, B:108:0x026c, B:109:0x0283, B:115:0x014d, B:117:0x0154, B:119:0x0160, B:123:0x0170, B:125:0x0176, B:126:0x0182, B:128:0x018a, B:129:0x0191, B:131:0x019b, B:157:0x007d, B:203:0x00e0), top: B:8:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList j(CharSequence charSequence, int[] iArr) {
        boolean z10;
        boolean z11;
        char charAt;
        boolean z12;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt2;
        int i15;
        int i16;
        ArrayList arrayList = new ArrayList();
        if (charSequence != null && charSequence.length() > 0) {
            StringBuilder sb2 = new StringBuilder(16);
            int length = charSequence.length();
            int i17 = -1;
            int[] iArr2 = iArr;
            int i18 = -1;
            int i19 = 0;
            int i20 = 0;
            long j3 = 0;
            int i21 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i20 < length) {
                try {
                    char charAt3 = charSequence.charAt(i20);
                    if ((charAt3 >= 55356 && charAt3 <= 55358) || (j3 != 0 && (j3 & (-4294967296L)) == 0 && (j3 & 65535) == 55356 && charAt3 >= 56806 && charAt3 <= 56831)) {
                        if (i18 == i17) {
                            i18 = i20;
                        } else if (z13) {
                            i18 = i20;
                            i21 = 0;
                            z13 = false;
                        }
                        try {
                            sb2.append(charAt3);
                            i21++;
                            j3 = (j3 << 16) | charAt3;
                        } catch (Exception e10) {
                            e = e10;
                            z10 = true;
                            a8.g(e, z10);
                            if (iArr2 != null) {
                                iArr2[0] = 0;
                            }
                            return arrayList;
                        }
                    } else if ((sb2.length() > 0 && (charAt3 == 9792 || charAt3 == 9794 || charAt3 == 9877)) || (j3 > 0 && (61440 & charAt3) == 53248)) {
                        sb2.append(charAt3);
                        i21++;
                        z14 = true;
                        j3 = 0;
                    } else if (charAt3 == 8419) {
                        if (i20 > 0 && (((charAt = charSequence.charAt(i19)) >= '0' && charAt <= '9') || charAt == '#' || charAt == '*')) {
                            i21 = (i20 - i19) + 1;
                            sb2.append(charAt);
                            sb2.append(charAt3);
                            z14 = true;
                            i18 = i19;
                            z13 = false;
                        }
                    } else if ((charAt3 == 169 || charAt3 == 174 || (charAt3 >= 8252 && charAt3 <= 12953)) && k6.k.containsKey(Character.valueOf(charAt3))) {
                        if (i18 == -1) {
                            i18 = i20;
                        } else if (z13) {
                            i18 = i20;
                            i21 = 0;
                            z13 = false;
                        }
                        i21++;
                        sb2.append(charAt3);
                        z14 = true;
                    } else {
                        if (i18 != -1) {
                            sb2.setLength(0);
                            z11 = false;
                            i18 = -1;
                            i21 = 0;
                            z13 = false;
                            z14 = false;
                        } else if (charAt3 != 65039 && charAt3 != '\n' && charAt3 != ' ' && charAt3 != '\t') {
                            z11 = true;
                        }
                        if (z14 || (i16 = i20 + 2) >= length) {
                            z12 = z11;
                        } else {
                            int i22 = i20 + 1;
                            char charAt4 = charSequence.charAt(i22);
                            z12 = z11;
                            if (charAt4 == 55356) {
                                char charAt5 = charSequence.charAt(i16);
                                if (charAt5 >= 57339 && charAt5 <= 57343) {
                                    sb2.append(charSequence.subSequence(i22, i20 + 3));
                                    i21 += 2;
                                    i7 = i16;
                                    i10 = i7;
                                    i11 = 0;
                                    while (i11 < 3) {
                                        int i23 = i10 + 1;
                                        if (i23 < length) {
                                            char charAt6 = charSequence.charAt(i23);
                                            i15 = i7;
                                            if (i11 == 1) {
                                                if (charAt6 == 8205 && sb2.length() > 0) {
                                                    sb2.append(charAt6);
                                                    i21++;
                                                    i10 = i23;
                                                    z14 = false;
                                                    z12 = false;
                                                }
                                            } else if (charAt3 == '*' || charAt3 == '#' || (charAt3 >= '0' && charAt3 <= '9')) {
                                                if (charAt6 >= 65024) {
                                                    if (charAt6 <= 65039) {
                                                        i21++;
                                                        if (!z14) {
                                                            z14 = i10 + 2 >= length;
                                                        }
                                                        i10 = i23;
                                                        i18 = i15;
                                                        z13 = true;
                                                    }
                                                }
                                            } else if (i18 != -1 && charAt6 >= 65024) {
                                                if (charAt6 <= 65039) {
                                                    i21++;
                                                    if (!z14) {
                                                        z14 = i10 + 2 >= length;
                                                    }
                                                    i10 = i23;
                                                }
                                            }
                                            i11++;
                                            i7 = i15;
                                        } else {
                                            i15 = i7;
                                        }
                                        i11++;
                                        i7 = i15;
                                    }
                                    int i24 = i7;
                                    if (z12 && iArr2 != null) {
                                        iArr2[0] = 0;
                                        iArr2 = null;
                                    }
                                    if (z14 && (i13 = i10 + 2) < length) {
                                        i14 = i10 + 1;
                                        if (charSequence.charAt(i14) == 55356 && (charAt2 = charSequence.charAt(i13)) >= 57339 && charAt2 <= 57343) {
                                            sb2.append(charSequence.subSequence(i14, i10 + 3));
                                            i21 += 2;
                                            i10 = i13;
                                        }
                                    }
                                    if (z14) {
                                        if (iArr2 != null) {
                                            iArr2[0] = iArr2[0] + 1;
                                        }
                                        if (i18 >= 0 && (i12 = i21 + i18) <= length) {
                                            CharSequence subSequence = sb2.subSequence(0, sb2.length());
                                            h6 h6Var = new h6();
                                            h6Var.a = i18;
                                            h6Var.b = i12;
                                            h6Var.c = subSequence;
                                            arrayList.add(h6Var);
                                        }
                                        sb2.setLength(0);
                                        i18 = -1;
                                        i21 = 0;
                                        z13 = false;
                                        z14 = false;
                                    }
                                    i20 = i10 + 1;
                                    i19 = i24;
                                    i17 = -1;
                                }
                            } else if (sb2.length() >= 2 && sb2.charAt(0) == 55356 && sb2.charAt(1) == 57332 && charAt4 == 56128) {
                                do {
                                    if (i22 < charSequence.length()) {
                                        sb2.append(charSequence.charAt(i22));
                                    }
                                    i20 = i22 + 1;
                                    if (i20 < charSequence.length()) {
                                        sb2.append(charSequence.charAt(i20));
                                    }
                                    i21 += 2;
                                    i22 += 2;
                                    if (i22 >= charSequence.length()) {
                                        break;
                                    }
                                } while (charSequence.charAt(i22) == 56128);
                            }
                        }
                        i7 = i20;
                        i10 = i7;
                        i11 = 0;
                        while (i11 < 3) {
                        }
                        int i242 = i7;
                        if (z12) {
                            iArr2[0] = 0;
                            iArr2 = null;
                        }
                        if (z14) {
                            i14 = i10 + 1;
                            if (charSequence.charAt(i14) == 55356) {
                                sb2.append(charSequence.subSequence(i14, i10 + 3));
                                i21 += 2;
                                i10 = i13;
                            }
                        }
                        if (z14) {
                        }
                        i20 = i10 + 1;
                        i19 = i242;
                        i17 = -1;
                    }
                    z11 = false;
                    if (z14) {
                    }
                    z12 = z11;
                    i7 = i20;
                    i10 = i7;
                    i11 = 0;
                    while (i11 < 3) {
                    }
                    int i2422 = i7;
                    if (z12) {
                    }
                    if (z14) {
                    }
                    if (z14) {
                    }
                    i20 = i10 + 1;
                    i19 = i2422;
                    i17 = -1;
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                }
            }
            if (iArr2 != null && sb2.length() != 0) {
                iArr2[0] = 0;
            }
        }
        return arrayList;
    }

    public static void k(CharSequence charSequence) {
        e6 e10 = e(charSequence);
        if (e10 != null) {
            i(e10.a, e10.b);
        }
    }

    public static CharSequence l(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return m(charSequence, fontMetricsInt, z10, null, 0);
    }

    public static CharSequence m(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i7) {
        return n(charSequence, fontMetricsInt, z10, iArr, i7, 1.0f, 0);
    }

    public static CharSequence n(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i7, float f10, int i10) {
        int i11;
        int i12;
        if (bz.U0 || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        Spannable newSpannable = (z10 || !(charSequence instanceof Spannable)) ? Spannable.Factory.getInstance().newSpannable(charSequence) : (Spannable) charSequence;
        ArrayList j3 = j(newSpannable, iArr);
        if (j3.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.x5.class);
        org.telegram.ui.Components.lq[] lqVarArr = (org.telegram.ui.Components.lq[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.lq.class);
        int i13 = (bz.o() >= 2 ? 100 : 50) - i10;
        for (int i14 = 0; i14 < j3.size(); i14++) {
            try {
                h6 h6Var = (h6) j3.get(i14);
                if (x5VarArr != null && x5VarArr.length > 0) {
                    for (org.telegram.ui.Components.x5 x5Var : x5VarArr) {
                        i12 = (x5Var != null && newSpannable.getSpanStart(x5Var) == h6Var.a && newSpannable.getSpanEnd(x5Var) == h6Var.b) ? 0 : i12 + 1;
                    }
                }
                if (lqVarArr != null && lqVarArr.length > 0) {
                    for (org.telegram.ui.Components.lq lqVar : lqVarArr) {
                        i11 = (lqVar != null && newSpannable.getSpanStart(lqVar) == h6Var.a && newSpannable.getSpanEnd(lqVar) == h6Var.b) ? 0 : i11 + 1;
                    }
                }
                f6 g10 = g(h6Var.c);
                if (g10 != null) {
                    g6 g6Var = new g6(g10, i7);
                    g6Var.b = 1.0f;
                    g6Var.c = g0.L(20.0f);
                    g6Var.a = fontMetricsInt;
                    if (fontMetricsInt != null) {
                        int abs = Math.abs(g6Var.a.ascent) + Math.abs(fontMetricsInt.descent);
                        g6Var.c = abs;
                        if (abs == 0) {
                            g6Var.c = g0.L(20.0f);
                        }
                    }
                    CharSequence charSequence2 = h6Var.c;
                    g6Var.d = charSequence2 == null ? null : charSequence2.toString();
                    g6Var.b = f10;
                    newSpannable.setSpan(g6Var, h6Var.a, h6Var.b, 33);
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (Build.VERSION.SDK_INT >= 29 && i14 + 1 >= i13) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence o(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i7, Runnable runnable) {
        h6 h6Var;
        TLRPC.Document document;
        org.telegram.ui.Components.x5 x5Var;
        int i10;
        if (bz.U0 || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i11 = j10.t0;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        TLRPC.TL_messages_stickerSet n02 = ri.d0(i11).n0(tL_inputStickerSetShortName, 0, false, true, runnable == null ? null : new a4(runnable, 1));
        Spannable newSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        ArrayList j3 = j(newSpannable, null);
        if (j3.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.x5.class);
        int i12 = bz.o() >= 2 ? 100 : 50;
        for (int i13 = 0; i13 < j3.size(); i13++) {
            try {
                h6Var = (h6) j3.get(i13);
                if (x5VarArr != null) {
                    for (org.telegram.ui.Components.x5 x5Var2 : x5VarArr) {
                        i10 = (x5Var2 != null && newSpannable.getSpanStart(x5Var2) == h6Var.a && newSpannable.getSpanEnd(x5Var2) == h6Var.b) ? 0 : i10 + 1;
                    }
                }
                if (n02 != null) {
                    ArrayList<TLRPC.Document> arrayList = n02.documents;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TLRPC.Document document2 = arrayList.get(i14);
                        i14++;
                        document = document2;
                        if (fj.V(document, null, null).contains(h6Var.c)) {
                            break;
                        }
                    }
                }
                document = null;
                x5Var = document != null ? new org.telegram.ui.Components.x5(document, fontMetricsInt) : new org.telegram.ui.Components.x5(0L, fontMetricsInt);
                x5Var.emoji = h6Var.c.toString();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                x5Var.cacheType = i7;
                newSpannable.setSpan(x5Var, h6Var.a, h6Var.b, 33);
            } catch (Exception e11) {
                e = e11;
                a8.g(e, true);
                if (Build.VERSION.SDK_INT >= 29) {
                    break;
                    return newSpannable;
                }
                continue;
            }
            if (Build.VERSION.SDK_INT >= 29 && i13 + 1 >= i12) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence p(CharSequence charSequence, TextView textView, Runnable runnable) {
        return o(charSequence, textView.getPaint().getFontMetricsInt(), 20, runnable);
    }

    public static void q() {
        SharedPreferences f12 = mp.f1();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : j.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append((String) entry.getValue());
        }
        f12.edit().putString("color", sb2.toString()).commit();
    }

    public static void r() {
        SharedPreferences f12 = mp.f1();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : h.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        f12.edit().putString("emojis2", sb2.toString()).commit();
    }

    public static void s() {
        ArrayList arrayList = i;
        arrayList.clear();
        Iterator it = h.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        Collections.sort(arrayList, new jg.w(14));
        while (arrayList.size() > 48) {
            a8.p0.z(1, arrayList);
        }
    }
}
