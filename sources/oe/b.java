package oe;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
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
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            try {
                inputStream.close();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            this.d = Locale.getDefault().getCountry().toLowerCase();
            this.f = new HashMap(255);
            this.g = new HashMap(255);
            this.h = new HashMap(10);
            this.i = new HashMap(255);
            int f10 = f(0);
            int i10 = 4;
            int i11 = (f10 * 12) + 4;
            for (int i12 = 0; i12 < f10; i12++) {
                String g10 = g(i10);
                String g11 = g(i10 + 4);
                int f11 = f(i10 + 8) + i11;
                i10 += 12;
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
        } catch (Exception e13) {
            e = e13;
            byteArrayOutputStream2 = byteArrayOutputStream;
            e.printStackTrace();
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
            }
            if (inputStream == null) {
                throw th;
            }
            try {
                inputStream.close();
                throw th;
            } catch (Exception e17) {
                FileLog.e(e17);
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
        short e9 = bVar.e(intValue);
        short e10 = bVar.e(intValue + 4);
        short e11 = bVar.e(intValue + 8);
        int i10 = intValue + 12;
        ArrayList arrayList = new ArrayList(5);
        while (true) {
            String g10 = bVar.g(i10);
            if (g10.length() == 0) {
                break;
            }
            arrayList.add(g10);
            i10 += g10.length() + 1;
        }
        aVar2.b = arrayList;
        int i11 = i10 + 1;
        ArrayList arrayList2 = new ArrayList(5);
        while (true) {
            String g11 = bVar.g(i11);
            if (g11.length() == 0) {
                break;
            }
            arrayList2.add(g11);
            i11 += g11.length() + 1;
        }
        aVar2.c = arrayList2;
        ArrayList arrayList3 = new ArrayList(e11);
        int i12 = intValue + e9;
        int i13 = i12;
        int i14 = 0;
        while (i14 < e11) {
            d dVar = new d();
            dVar.b = new ArrayList();
            dVar.a = bVar.e(i13);
            short e12 = bVar.e(i13 + 2);
            i13 += 4;
            ArrayList arrayList4 = new ArrayList(e12);
            int i15 = 0;
            while (i15 < e12) {
                c cVar = new c();
                cVar.a = bVar.f(i13);
                cVar.b = bVar.f(i13 + 4);
                byte[] bArr = bVar.a;
                byte b10 = bArr[i13 + 8];
                cVar.c = bArr[i13 + 9];
                byte b11 = bArr[i13 + 10];
                byte b12 = bArr[i13 + 11];
                cVar.d = bArr[i13 + 12];
                byte b13 = bArr[i13 + 13];
                short e13 = bVar.e(i13 + 14);
                i13 += 16;
                String g12 = bVar.g(i12 + e10 + e13);
                cVar.e = g12;
                int indexOf = g12.indexOf("[[");
                if (indexOf != -1) {
                    cVar.e = s3.c.l(cVar.e.substring(0, indexOf), cVar.e.substring(cVar.e.indexOf("]]") + 2));
                }
                arrayList4.add(cVar);
                i15++;
                bVar = this;
            }
            dVar.b = arrayList4;
            arrayList3.add(dVar);
            i14++;
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
                    int i10 = 0;
                    while (i10 < 3 && i10 < substring.length()) {
                        i10++;
                        aVar = a(substring.substring(0, i10));
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
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                str2 = null;
                                break;
                            }
                            Object obj = arrayList.get(i11);
                            i11++;
                            str2 = (String) obj;
                            if (sb3.startsWith(str2)) {
                                break;
                            }
                        }
                        if (str2 == null) {
                            return a2.a(sb3);
                        }
                        String substring2 = sb3.substring(str2.length());
                        int i12 = 0;
                        while (i12 < 3 && i12 < substring2.length()) {
                            i12++;
                            aVar = a(substring2.substring(0, i12));
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
            } catch (Exception e9) {
                FileLog.e(e9);
                return str;
            }
        }
        return str;
    }

    public final short e(int i10) {
        if (i10 + 2 > this.a.length) {
            return (short) 0;
        }
        this.c.position(i10);
        return this.c.getShort();
    }

    public final int f(int i10) {
        if (i10 + 4 > this.a.length) {
            return 0;
        }
        this.c.position(i10);
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
    public final String g(int i10) {
        int i11 = i10;
        while (true) {
            try {
                byte[] bArr = this.a;
                if (i11 >= bArr.length) {
                    return "";
                }
                if (bArr[i11] == 0) {
                    break;
                }
                i11++;
            } catch (Exception e9) {
                e9.printStackTrace();
                return "";
            }
        }
    }
}
