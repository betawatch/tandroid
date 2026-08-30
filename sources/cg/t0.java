package cg;

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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class t0 {
    public static final t0 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final bf.b d;

    static {
        int i10 = 18;
        t0 t0Var = new t0("roboto", "PhotoEditorTypefaceRoboto", new bf.b(new androidx.emoji2.text.w(9), i10));
        e = t0Var;
        f = Arrays.asList(t0Var, new t0("italic", "PhotoEditorTypefaceItalic", new bf.b(new androidx.emoji2.text.w(10), i10)), new t0("serif", "PhotoEditorTypefaceSerif", new bf.b(new androidx.emoji2.text.w(11), i10)), new t0("condensed", "PhotoEditorTypefaceCondensed", new bf.b(new androidx.emoji2.text.w(12), i10)), new t0("mono", "PhotoEditorTypefaceMono", new bf.b(new androidx.emoji2.text.w(13), i10)), new t0("mw_bold", "PhotoEditorTypefaceMerriweather", new bf.b(new androidx.emoji2.text.w(14), i10)));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public t0(String str, String str2, bf.b bVar) {
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
        q0 q0Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                q0 q0Var2 = null;
                q0Var2 = null;
                q0Var2 = null;
                q0Var2 = null;
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
                                                        s0 s0Var = new s0(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(s0Var.b), s0Var);
                                                    }
                                                    q0 q0Var3 = new q0();
                                                    q0Var3.a = next;
                                                    int i12 = readInt3 + readUnsignedShort3;
                                                    q0Var3.b = e(randomAccessFile, i12, (s0) hashMap2.get(1));
                                                    q0Var3.c = e(randomAccessFile, i12, (s0) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    q0Var2 = q0Var3;
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
                    if (q0Var2 != null) {
                        p0 p0Var = (p0) hashMap.get(q0Var2.b);
                        if (p0Var == null) {
                            p0Var = new p0();
                            p0Var.a = new ArrayList();
                            hashMap.put(q0Var2.b, p0Var);
                        }
                        p0Var.a.add(q0Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                p0 p0Var2 = (p0) hashMap.get((String) it2.next());
                if (p0Var2 != null) {
                    ArrayList arrayList2 = p0Var2.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            q0Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((q0) arrayList2.get(i13)).c)) {
                                q0Var = (q0) arrayList2.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (q0Var == null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                q0Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((q0) arrayList2.get(i14)).c)) {
                                    q0Var = (q0) arrayList2.get(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                        if (q0Var == null && !arrayList2.isEmpty()) {
                            q0Var = (q0) arrayList2.get(0);
                        }
                    }
                    if (q0Var != null) {
                        arrayList.add(new t0(q0Var.a, ("Regular".equals(q0Var.c) || TextUtils.isEmpty(q0Var.c)) ? q0Var.b : q0Var.b + " " + q0Var.c));
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new o0(arrayList, 0));
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !i) {
            i = true;
            Utilities.themeQueue.postRunnable(new n0(0));
        }
        return f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, s0 s0Var) {
        if (s0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + s0Var.d);
        byte[] bArr = new byte[s0Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, s0Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        bf.b bVar = this.d;
        if (((Typeface) bVar.c) == null) {
            bVar.c = ((r0) bVar.b).a();
        }
        return (Typeface) bVar.c;
    }

    public t0(Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new bf.b(new a1.c(font, 4), 18);
    }
}
