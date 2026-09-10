package og;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m0 {
    public static final m0 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final n7.a1 d;

    static {
        m0 m0Var = new m0("roboto", "PhotoEditorTypefaceRoboto", new n7.a1(new n2.l(5)));
        e = m0Var;
        f = Arrays.asList(m0Var, new m0("italic", "PhotoEditorTypefaceItalic", new n7.a1(new n2.l(6))), new m0("serif", "PhotoEditorTypefaceSerif", new n7.a1(new n2.l(7))), new m0("condensed", "PhotoEditorTypefaceCondensed", new n7.a1(new n2.l(8))), new m0("mono", "PhotoEditorTypefaceMono", new n7.a1(new n2.l(9))), new m0("mw_bold", "PhotoEditorTypefaceMerriweather", new n7.a1(new n2.l(10))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public m0(String str, String str2, n7.a1 a1Var) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = a1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
    
        if (r7 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b() {
        j0 j0Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                j0 j0Var2 = null;
                j0Var2 = null;
                j0Var2 = null;
                j0Var2 = null;
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
                                                        l0 l0Var = new l0(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(l0Var.b), l0Var);
                                                    }
                                                    j0 j0Var3 = new j0();
                                                    j0Var3.a = next;
                                                    int i12 = readInt3 + readUnsignedShort3;
                                                    j0Var3.b = e(randomAccessFile, i12, (l0) hashMap2.get(1));
                                                    j0Var3.c = e(randomAccessFile, i12, (l0) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    j0Var2 = j0Var3;
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
                            } catch (Exception e7) {
                                e = e7;
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
                    if (j0Var2 != null) {
                        i0 i0Var = (i0) hashMap.get(j0Var2.b);
                        if (i0Var == null) {
                            i0Var = new i0();
                            i0Var.a = new ArrayList();
                            hashMap.put(j0Var2.b, i0Var);
                        }
                        i0Var.a.add(j0Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                i0 i0Var2 = (i0) hashMap.get((String) it2.next());
                if (i0Var2 != null) {
                    ArrayList arrayList2 = i0Var2.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            j0Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((j0) arrayList2.get(i13)).c)) {
                                j0Var = (j0) arrayList2.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (j0Var == null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                j0Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((j0) arrayList2.get(i14)).c)) {
                                    j0Var = (j0) arrayList2.get(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                        if (j0Var == null && !arrayList2.isEmpty()) {
                            j0Var = (j0) arrayList2.get(0);
                        }
                    }
                    if (j0Var != null) {
                        arrayList.add(new m0(j0Var.a, ("Regular".equals(j0Var.c) || TextUtils.isEmpty(j0Var.c)) ? j0Var.b : j0Var.b + " " + j0Var.c));
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new h0(arrayList, 0));
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !i) {
            i = true;
            Utilities.themeQueue.postRunnable(new bi.f0(10));
        }
        return f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, l0 l0Var) {
        if (l0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + l0Var.d);
        byte[] bArr = new byte[l0Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, l0Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        n7.a1 a1Var = this.d;
        if (((Typeface) a1Var.c) == null) {
            a1Var.c = ((k0) a1Var.b).a();
        }
        return (Typeface) a1Var.c;
    }

    public m0(Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new n7.a1(new hi.y1(font, 29));
    }
}
