// default package

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class k2f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final sfe a(hge hgeVar) {
        try {
            w9c d = hgeVar.d();
            if (d == null) {
                throw new pee("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = d.b;
                byte b2 = d.a;
                ?? r6 = 0;
                if (b2 == Byte.MIN_VALUE) {
                    long a = hgeVar.a();
                    if (a > 1000) {
                        throw new pee("Parser being asked to read a large CBOR array");
                    }
                    b(b, a);
                    sfe[] sfeVarArr = new sfe[(int) a];
                    while (((long) r6) < a) {
                        sfeVarArr[r6] = a(hgeVar);
                        r6++;
                    }
                    return new xde(xhd.B(sfeVarArr));
                }
                if (b2 != -96) {
                    if (b2 == -64) {
                        throw new pee("Tags are currently unsupported");
                    }
                    if (b2 == -32) {
                        return new cee(hgeVar.e());
                    }
                    if (b2 == 0 || b2 == 32) {
                        long b3 = hgeVar.b();
                        b(b, b3 > 0 ? b3 : ~b3);
                        return new uee(b3);
                    }
                    if (b2 == 64) {
                        hgeVar.h((byte) 64);
                        byte[] j = hgeVar.j();
                        int length = j.length;
                        b(b, length);
                        return new dee(qae.o(length, j));
                    }
                    if (b2 != 96) {
                        throw new pee("Unidentifiable major type: " + ((b2 >> 5) & 7));
                    }
                    hgeVar.h((byte) 96);
                    String str = new String(hgeVar.j(), StandardCharsets.UTF_8);
                    b(b, str.length());
                    return new hfe(str);
                }
                long c = hgeVar.c();
                if (c > 1000) {
                    throw new pee("Parser being asked to read a large CBOR map");
                }
                b(b, c);
                int i = (int) c;
                aec[] aecVarArr = new aec[i];
                sfe sfeVar = null;
                int i2 = 0;
                while (i2 < c) {
                    sfe a2 = a(hgeVar);
                    if (sfeVar != null && a2.compareTo(sfeVar) <= 0) {
                        throw new bk2("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + sfeVar.toString() + "\nCurrent key: " + a2.toString());
                    }
                    aecVarArr[i2] = new aec(a2, a(hgeVar), r6, (byte) 15);
                    i2++;
                    sfeVar = a2;
                }
                TreeMap treeMap = new TreeMap();
                for (int i3 = 0; i3 < i; i3++) {
                    aec aecVar = aecVarArr[i3];
                    if (treeMap.containsKey((sfe) aecVar.b)) {
                        throw new bk2("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put((sfe) aecVar.b, (sfe) aecVar.c);
                }
                return new dfe(njd.c(treeMap));
            } catch (IOException | RuntimeException e) {
                throw new pee(e);
            }
        } catch (IOException e2) {
            throw new pee(e2);
        }
    }

    public static final void b(byte b, long j) {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new bk2(ug8.n(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new bk2(ug8.n(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new bk2(ug8.n(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new bk2(ug8.n(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
