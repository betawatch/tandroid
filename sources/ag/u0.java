package ag;

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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u0 {
    public static final u0 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final ze.b d;

    static {
        u0 u0Var = new u0("roboto", "PhotoEditorTypefaceRoboto", new ze.b(new a9.f(3)));
        e = u0Var;
        f = Arrays.asList(u0Var, new u0("italic", "PhotoEditorTypefaceItalic", new ze.b(new a9.f(4))), new u0("serif", "PhotoEditorTypefaceSerif", new ze.b(new a9.f(5))), new u0("condensed", "PhotoEditorTypefaceCondensed", new ze.b(new a9.f(6))), new u0("mono", "PhotoEditorTypefaceMono", new ze.b(new a9.f(7))), new u0("mw_bold", "PhotoEditorTypefaceMerriweather", new ze.b(new a9.f(8))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public u0(String str, String str2, ze.b bVar) {
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
        r0 r0Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                r0 r0Var2 = null;
                r0Var2 = null;
                r0Var2 = null;
                r0Var2 = null;
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
                                                        t0 t0Var = new t0(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(t0Var.b), t0Var);
                                                    }
                                                    r0 r0Var3 = new r0();
                                                    r0Var3.a = next;
                                                    int i12 = readInt3 + readUnsignedShort3;
                                                    r0Var3.b = e(randomAccessFile, i12, (t0) hashMap2.get(1));
                                                    r0Var3.c = e(randomAccessFile, i12, (t0) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    r0Var2 = r0Var3;
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
                            } catch (Exception e10) {
                                e = e10;
                                FileLog.e(e);
                            }
                        } catch (Exception e11) {
                            e = e11;
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
                    if (r0Var2 != null) {
                        q0 q0Var = (q0) hashMap.get(r0Var2.b);
                        if (q0Var == null) {
                            q0Var = new q0();
                            q0Var.a = new ArrayList();
                            hashMap.put(r0Var2.b, q0Var);
                        }
                        q0Var.a.add(r0Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                q0 q0Var2 = (q0) hashMap.get((String) it2.next());
                if (q0Var2 != null) {
                    ArrayList arrayList2 = q0Var2.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            r0Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((r0) arrayList2.get(i13)).c)) {
                                r0Var = (r0) arrayList2.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (r0Var == null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                r0Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((r0) arrayList2.get(i14)).c)) {
                                    r0Var = (r0) arrayList2.get(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                        if (r0Var == null && !arrayList2.isEmpty()) {
                            r0Var = (r0) arrayList2.get(0);
                        }
                    }
                    if (r0Var != null) {
                        arrayList.add(new u0(r0Var.a, ("Regular".equals(r0Var.c) || TextUtils.isEmpty(r0Var.c)) ? r0Var.b : r0Var.b + " " + r0Var.c));
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new p0(arrayList, 0));
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !i) {
            i = true;
            Utilities.themeQueue.postRunnable(new o0(0));
        }
        return f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, t0 t0Var) {
        if (t0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + t0Var.d);
        byte[] bArr = new byte[t0Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, t0Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        ze.b bVar = this.d;
        if (((Typeface) bVar.b) == null) {
            bVar.b = ((s0) bVar.a).a();
        }
        return (Typeface) bVar.b;
    }

    public u0(Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new ze.b(new a1.c(font, 3));
    }
}
