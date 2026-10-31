package ig;

import ag.f3;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h0 {
    public static final h0 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final hf.b d;

    static {
        int i10 = 24;
        h0 h0Var = new h0("roboto", "PhotoEditorTypefaceRoboto", new hf.b(new d2.c(22), i10));
        e = h0Var;
        f = Arrays.asList(h0Var, new h0("italic", "PhotoEditorTypefaceItalic", new hf.b(new d2.c(23), i10)), new h0("serif", "PhotoEditorTypefaceSerif", new hf.b(new d2.c(i10), i10)), new h0("condensed", "PhotoEditorTypefaceCondensed", new hf.b(new d2.c(25), i10)), new h0("mono", "PhotoEditorTypefaceMono", new hf.b(new d2.c(26), i10)), new h0("mw_bold", "PhotoEditorTypefaceMerriweather", new hf.b(new d2.c(27), i10)));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public h0(String str, String str2, hf.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        if (r8 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b() {
        e0 e0Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap hashMap = new HashMap();
            while (true) {
                e0 e0Var2 = null;
                e0Var2 = null;
                e0Var2 = null;
                e0Var2 = null;
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
                                                        g0 g0Var = new g0(randomAccessFile);
                                                        hashMap2.put(Integer.valueOf(g0Var.b), g0Var);
                                                    }
                                                    e0 e0Var3 = new e0();
                                                    e0Var3.a = next;
                                                    int i12 = readInt3 + readUnsignedShort3;
                                                    e0Var3.b = e(randomAccessFile, i12, (g0) hashMap2.get(1));
                                                    e0Var3.c = e(randomAccessFile, i12, (g0) hashMap2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    e0Var2 = e0Var3;
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
                                f8.g(e, true);
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
                    if (e0Var2 != null) {
                        d0 d0Var = (d0) hashMap.get(e0Var2.b);
                        if (d0Var == null) {
                            d0Var = new d0();
                            d0Var.a = new ArrayList();
                            hashMap.put(e0Var2.b, d0Var);
                        }
                        d0Var.a.add(e0Var2);
                    }
                }
            }
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                d0 d0Var2 = (d0) hashMap.get((String) it2.next());
                if (d0Var2 != null) {
                    ArrayList arrayList2 = d0Var2.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            e0Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((e0) arrayList2.get(i13)).c)) {
                                e0Var = (e0) arrayList2.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (e0Var == null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                e0Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((e0) arrayList2.get(i14)).c)) {
                                    e0Var = (e0) arrayList2.get(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                        if (e0Var == null && !arrayList2.isEmpty()) {
                            e0Var = (e0) arrayList2.get(0);
                        }
                    }
                    if (e0Var != null) {
                        arrayList.add(new h0(e0Var.a, ("Regular".equals(e0Var.c) || TextUtils.isEmpty(e0Var.c)) ? e0Var.b : e0Var.b + " " + e0Var.c));
                    }
                }
            }
        }
        org.telegram.messenger.i0.g3(new b0(0, arrayList));
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !i) {
            i = true;
            Utilities.i.c(new f3(3));
        }
        return f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, g0 g0Var) {
        if (g0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + g0Var.d);
        byte[] bArr = new byte[g0Var.c];
        randomAccessFile.read(bArr);
        return new String(bArr, g0Var.a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        hf.b bVar = this.d;
        if (((Typeface) bVar.c) == null) {
            bVar.c = ((f0) bVar.b).b();
        }
        return (Typeface) bVar.c;
    }

    public h0(Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new hf.b(new c0(font, 0), 24);
    }
}
