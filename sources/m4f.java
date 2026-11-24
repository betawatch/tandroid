// default package

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class m4f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final the a(iie iieVar) {
        try {
            xbc d = iieVar.d();
            if (d == null) {
                throw new qge("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = d.b;
                byte b2 = d.a;
                ?? r6 = 0;
                if (b2 == Byte.MIN_VALUE) {
                    long a = iieVar.a();
                    if (a > 1000) {
                        throw new qge("Parser being asked to read a large CBOR array");
                    }
                    b(b, a);
                    the[] theVarArr = new the[(int) a];
                    while (((long) r6) < a) {
                        theVarArr[r6] = a(iieVar);
                        r6++;
                    }
                    return new yfe(yjd.B(theVarArr));
                }
                if (b2 != -96) {
                    if (b2 == -64) {
                        throw new qge("Tags are currently unsupported");
                    }
                    if (b2 == -32) {
                        return new dge(iieVar.e());
                    }
                    if (b2 == 0 || b2 == 32) {
                        long b3 = iieVar.b();
                        b(b, b3 > 0 ? b3 : ~b3);
                        return new vge(b3);
                    }
                    if (b2 == 64) {
                        iieVar.h((byte) 64);
                        byte[] j = iieVar.j();
                        int length = j.length;
                        b(b, length);
                        return new ege(rce.o(length, j));
                    }
                    if (b2 != 96) {
                        throw new qge("Unidentifiable major type: " + ((b2 >> 5) & 7));
                    }
                    iieVar.h((byte) 96);
                    String str = new String(iieVar.j(), StandardCharsets.UTF_8);
                    b(b, str.length());
                    return new ihe(str);
                }
                long c = iieVar.c();
                if (c > 1000) {
                    throw new qge("Parser being asked to read a large CBOR map");
                }
                b(b, c);
                int i = (int) c;
                rhb[] rhbVarArr = new rhb[i];
                the theVar = null;
                int i2 = 0;
                while (i2 < c) {
                    the a2 = a(iieVar);
                    if (theVar != null && a2.compareTo(theVar) <= 0) {
                        throw new ol2("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + theVar.toString() + "\nCurrent key: " + a2.toString());
                    }
                    rhbVarArr[i2] = new rhb(a2, a(iieVar), r6, (byte) 17);
                    i2++;
                    theVar = a2;
                }
                TreeMap treeMap = new TreeMap();
                for (int i3 = 0; i3 < i; i3++) {
                    rhb rhbVar = rhbVarArr[i3];
                    if (treeMap.containsKey((the) rhbVar.b)) {
                        throw new ol2("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put((the) rhbVar.b, (the) rhbVar.c);
                }
                return new ehe(pld.c(treeMap));
            } catch (IOException | RuntimeException e) {
                throw new qge(e);
            }
        } catch (IOException e2) {
            throw new qge(e2);
        }
    }

    public static final void b(byte b, long j) {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new ol2(wi8.n(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new ol2(wi8.n(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new ol2(wi8.n(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new ol2(wi8.n(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
