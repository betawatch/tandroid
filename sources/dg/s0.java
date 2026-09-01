package dg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.SystemFonts;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class s0 {
    public static final s0 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final bf.b d;

    static {
        int i10 = 24;
        s0 s0Var = new s0("roboto", "PhotoEditorTypefaceRoboto", new bf.b(new androidx.emoji2.text.w(19), i10));
        e = s0Var;
        f = Arrays.asList(s0Var, new s0("italic", "PhotoEditorTypefaceItalic", new bf.b(new androidx.emoji2.text.w(20), i10)), new s0("serif", "PhotoEditorTypefaceSerif", new bf.b(new androidx.emoji2.text.w(21), i10)), new s0("condensed", "PhotoEditorTypefaceCondensed", new bf.b(new androidx.emoji2.text.w(22), i10)), new s0("mono", "PhotoEditorTypefaceMono", new bf.b(new androidx.emoji2.text.w(23), i10)), new s0("mw_bold", "PhotoEditorTypefaceMerriweather", new bf.b(new androidx.emoji2.text.w(i10), i10)));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public s0(String str, String str2, bf.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
    
        if (r7 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b() {
        p0 p0Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                p0 p0Var2 = null;
                p0Var2 = null;
                p0Var2 = null;
                p0Var2 = null;
                RandomAccessFile randomAccessFile2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Font next = it.next();
                if (!next.getFile().getName().contains("Noto")) {
                    File file = next.getFile();
                    if (file != null) {
                        try {
                            randomAccessFile = new RandomAccessFile(file, "r");
                            try {
                                try {
                                    int readInt = randomAccessFile.readInt();
                                    if (readInt == 65536 || readInt == 1330926671) {
                                        int readUnsignedShort = randomAccessFile.readUnsignedShort();
                                        randomAccessFile.skipBytes(6);
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 < readUnsignedShort) {
                                                int readInt2 = randomAccessFile.readInt();
                                                randomAccessFile.skipBytes(4);
                                                int readInt3 = randomAccessFile.readInt();
                                                randomAccessFile.readInt();
                                                if (readInt2 == 1851878757) {
                                                    randomAccessFile.seek(readInt3 + 2);
                                                    int readUnsignedShort2 = randomAccessFile.readUnsignedShort();
                                                    int readUnsignedShort3 = randomAccessFile.readUnsignedShort();
                                                    HashMap hashMap2 = new HashMap();
                                                    for (int i11 = 0; i11 < readUnsignedShort2; i11++) {
                                                        r0 r0Var = new r0(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(r0Var.b), r0Var);
                                                    }
                                                    p0 p0Var3 = new p0();
                                                    p0Var3.a = next;
                                                    int i12 = readInt3 + readUnsignedShort3;
                                                    p0Var3.b = e(randomAccessFile, i12, (r0) hashMap2.get(1));
                                                    p0Var3.c = e(randomAccessFile, i12, (r0) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    p0Var2 = p0Var3;
                                                } else {
                                                    i10++;
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    randomAccessFile2 = randomAccessFile;
                                    if (randomAccessFile2 != null) {
                                        try {
                                            randomAccessFile2.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                FileLog.e(e);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            randomAccessFile = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            randomAccessFile.close();
                            break;
                        } catch (Exception unused3) {
                        }
                    }
                    if (p0Var2 != null) {
                        o0 o0Var = (o0) hashMap.get(p0Var2.b);
                        if (o0Var == null) {
                            o0Var = new o0();
                            o0Var.a = new ArrayList();
                            hashMap.put(p0Var2.b, o0Var);
                        }
                        o0Var.a.add(p0Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                o0 o0Var2 = (o0) hashMap.get((String) it2.next());
                if (o0Var2 != null) {
                    ArrayList arrayList2 = o0Var2.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            p0Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((p0) arrayList2.get(i13)).c)) {
                                p0Var = (p0) arrayList2.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (p0Var == null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                p0Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((p0) arrayList2.get(i14)).c)) {
                                    p0Var = (p0) arrayList2.get(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                        if (p0Var == null && !arrayList2.isEmpty()) {
                            p0Var = (p0) arrayList2.get(0);
                        }
                    }
                    if (p0Var != null) {
                        arrayList.add(new s0(p0Var.a, ("Regular".equals(p0Var.c) || TextUtils.isEmpty(p0Var.c)) ? p0Var.b : p0Var.b + " " + p0Var.c));
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new n0(arrayList, 0));
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !i) {
            i = true;
            Utilities.themeQueue.postRunnable(new ag.f(2));
        }
        return f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, r0 r0Var) {
        if (r0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + r0Var.d);
        byte[] bArr = new byte[r0Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, r0Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        bf.b bVar = this.d;
        if (((Typeface) bVar.c) == null) {
            bVar.c = ((q0) bVar.b).a();
        }
        return (Typeface) bVar.c;
    }

    public s0(Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new bf.b(new a1.c(font, 11), 24);
    }
}
