package ne;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public static volatile b j;
    public final byte[] a;
    public final boolean b;
    public final ByteBuffer c;
    public final String d;
    public final String e;
    public final HashMap f;
    public final HashMap g;
    public final HashMap h;
    public final HashMap i;

    public b() {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        this.b = false;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            inputStream = ApplicationLoader.applicationContext.getAssets().open("PhoneFormats.dat");
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e11) {
            e = e11;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.a = byteArray;
            ByteBuffer wrap = ByteBuffer.wrap(byteArray);
            this.c = wrap;
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            try {
                byteArrayOutputStream.close();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            try {
                inputStream.close();
            } catch (Exception e13) {
                FileLog.e(e13);
            }
            this.d = Locale.getDefault().getCountry().toLowerCase();
            this.f = new HashMap(255);
            this.g = new HashMap(255);
            this.h = new HashMap(10);
            this.i = new HashMap(255);
            int f10 = f(0);
            int i9 = 4;
            int i10 = (f10 * 12) + 4;
            for (int i11 = 0; i11 < f10; i11++) {
                String g10 = g(i9);
                String g11 = g(i9 + 4);
                int f11 = f(i9 + 8) + i10;
                i9 += 12;
                if (g11.equals(this.d)) {
                    this.e = g10;
                }
                this.i.put(g11, g10);
                this.f.put(g10, Integer.valueOf(f11));
                ArrayList arrayList = (ArrayList) this.g.get(g10);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.g.put(g10, arrayList);
                }
                arrayList.add(g11);
            }
            String str = this.e;
            if (str != null) {
                a(str);
            }
            this.b = true;
        } catch (Exception e14) {
            e = e14;
            byteArrayOutputStream2 = byteArrayOutputStream;
            e.printStackTrace();
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e17) {
                    FileLog.e(e17);
                }
            }
            if (inputStream == null) {
                throw th;
            }
            try {
                inputStream.close();
                throw th;
            } catch (Exception e18) {
                FileLog.e(e18);
                throw th;
            }
        }
    }

    public static b c() {
        b bVar;
        b bVar2 = j;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = j;
                if (bVar == null) {
                    bVar = new b();
                    j = bVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static String d(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        String str2 = z10 ? "0123456789+" : "0123456789";
        for (int length = sb2.length() - 1; length >= 0; length--) {
            if (!str2.contains(sb2.substring(length, length + 1))) {
                sb2.deleteCharAt(length);
            }
        }
        return sb2.toString();
    }

    public final a a(String str) {
        Integer num;
        b bVar = this;
        a aVar = (a) bVar.h.get(str);
        if (aVar != null || (num = (Integer) bVar.f.get(str)) == null) {
            return aVar;
        }
        int intValue = num.intValue();
        a aVar2 = new a();
        new ArrayList();
        aVar2.a = "";
        aVar2.b = new ArrayList();
        aVar2.c = new ArrayList();
        aVar2.d = new ArrayList();
        aVar2.a = str;
        bVar.h.put(str, aVar2);
        short e10 = bVar.e(intValue);
        short e11 = bVar.e(intValue + 4);
        short e12 = bVar.e(intValue + 8);
        int i9 = intValue + 12;
        ArrayList arrayList = new ArrayList(5);
        while (true) {
            String g10 = bVar.g(i9);
            if (g10.length() == 0) {
                break;
            }
            arrayList.add(g10);
            i9 += g10.length() + 1;
        }
        aVar2.b = arrayList;
        int i10 = i9 + 1;
        ArrayList arrayList2 = new ArrayList(5);
        while (true) {
            String g11 = bVar.g(i10);
            if (g11.length() == 0) {
                break;
            }
            arrayList2.add(g11);
            i10 += g11.length() + 1;
        }
        aVar2.c = arrayList2;
        ArrayList arrayList3 = new ArrayList(e12);
        int i11 = intValue + e10;
        int i12 = i11;
        int i13 = 0;
        while (i13 < e12) {
            d dVar = new d();
            dVar.b = new ArrayList();
            dVar.a = bVar.e(i12);
            short e13 = bVar.e(i12 + 2);
            i12 += 4;
            ArrayList arrayList4 = new ArrayList(e13);
            int i14 = 0;
            while (i14 < e13) {
                c cVar = new c();
                cVar.a = bVar.f(i12);
                cVar.b = bVar.f(i12 + 4);
                byte[] bArr = bVar.a;
                byte b10 = bArr[i12 + 8];
                cVar.c = bArr[i12 + 9];
                byte b11 = bArr[i12 + 10];
                byte b12 = bArr[i12 + 11];
                cVar.d = bArr[i12 + 12];
                byte b13 = bArr[i12 + 13];
                short e14 = bVar.e(i12 + 14);
                i12 += 16;
                String g12 = bVar.g(i11 + e11 + e14);
                cVar.e = g12;
                int indexOf = g12.indexOf("[[");
                if (indexOf != -1) {
                    cVar.e = ta.b.j(cVar.e.substring(0, indexOf), cVar.e.substring(cVar.e.indexOf("]]") + 2));
                }
                arrayList4.add(cVar);
                i14++;
                bVar = this;
            }
            dVar.b = arrayList4;
            arrayList3.add(dVar);
            i13++;
            bVar = this;
        }
        aVar2.d = arrayList3;
        return aVar2;
    }

    public final String b(String str) {
        String str2;
        if (this.b) {
            try {
                StringBuilder sb2 = new StringBuilder(str);
                for (int length = sb2.length() - 1; length >= 0; length--) {
                    if (!"0123456789+*#".contains(sb2.substring(length, length + 1))) {
                        sb2.deleteCharAt(length);
                    }
                }
                String sb3 = sb2.toString();
                a aVar = null;
                if (sb3.startsWith("+")) {
                    String substring = sb3.substring(1);
                    int i9 = 0;
                    while (i9 < 3 && i9 < substring.length()) {
                        i9++;
                        aVar = a(substring.substring(0, i9));
                        if (aVar != null) {
                            break;
                        }
                    }
                    if (aVar != null) {
                        return "+" + aVar.a(substring);
                    }
                } else {
                    a a2 = a(this.e);
                    if (a2 != null) {
                        ArrayList arrayList = a2.c;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                str2 = null;
                                break;
                            }
                            Object obj = arrayList.get(i10);
                            i10++;
                            str2 = (String) obj;
                            if (sb3.startsWith(str2)) {
                                break;
                            }
                        }
                        if (str2 == null) {
                            return a2.a(sb3);
                        }
                        String substring2 = sb3.substring(str2.length());
                        int i11 = 0;
                        while (i11 < 3 && i11 < substring2.length()) {
                            i11++;
                            aVar = a(substring2.substring(0, i11));
                            if (aVar != null) {
                                break;
                            }
                        }
                        if (aVar != null) {
                            substring2 = aVar.a(substring2);
                        }
                        if (substring2.length() == 0) {
                            return str2;
                        }
                        return str2 + " " + substring2;
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return str;
            }
        }
        return str;
    }

    public final short e(int i9) {
        if (i9 + 2 > this.a.length) {
            return (short) 0;
        }
        this.c.position(i9);
        return this.c.getShort();
    }

    public final int f(int i9) {
        if (i9 + 4 > this.a.length) {
            return 0;
        }
        this.c.position(i9);
        return this.c.getInt();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r5 != r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
    
        return new java.lang.String(r2, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000c, code lost:
    
        r1 = r1 - r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String g(int i9) {
        int i10 = i9;
        while (true) {
            try {
                byte[] bArr = this.a;
                if (i10 >= bArr.length) {
                    return "";
                }
                if (bArr[i10] == 0) {
                    break;
                }
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }
    }
}
