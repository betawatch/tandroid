// default package

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class c7f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final jke a(yke ykeVar) {
        try {
            wdc d = ykeVar.d();
            if (d == null) {
                throw new gje("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = d.b;
                byte b2 = d.a;
                ?? r6 = 0;
                if (b2 == Byte.MIN_VALUE) {
                    long a = ykeVar.a();
                    if (a > 1000) {
                        throw new gje("Parser being asked to read a large CBOR array");
                    }
                    b(b, a);
                    jke[] jkeVarArr = new jke[(int) a];
                    while (((long) r6) < a) {
                        jkeVarArr[r6] = a(ykeVar);
                        r6++;
                    }
                    return new oie(omd.B(jkeVarArr));
                }
                if (b2 != -96) {
                    if (b2 == -64) {
                        throw new gje("Tags are currently unsupported");
                    }
                    if (b2 == -32) {
                        return new tie(ykeVar.e());
                    }
                    if (b2 == 0 || b2 == 32) {
                        long b3 = ykeVar.b();
                        b(b, b3 > 0 ? b3 : ~b3);
                        return new lje(b3);
                    }
                    if (b2 == 64) {
                        ykeVar.h((byte) 64);
                        byte[] j = ykeVar.j();
                        int length = j.length;
                        b(b, length);
                        return new uie(gfe.o(length, j));
                    }
                    if (b2 != 96) {
                        throw new gje("Unidentifiable major type: " + ((b2 >> 5) & 7));
                    }
                    ykeVar.h((byte) 96);
                    String str = new String(ykeVar.j(), StandardCharsets.UTF_8);
                    b(b, str.length());
                    return new yje(str);
                }
                long c = ykeVar.c();
                if (c > 1000) {
                    throw new gje("Parser being asked to read a large CBOR map");
                }
                b(b, c);
                int i = (int) c;
                zhc[] zhcVarArr = new zhc[i];
                jke jkeVar = null;
                int i2 = 0;
                while (i2 < c) {
                    jke a2 = a(ykeVar);
                    if (jkeVar != null && a2.compareTo(jkeVar) <= 0) {
                        throw new wk2("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + jkeVar.toString() + "\nCurrent key: " + a2.toString());
                    }
                    zhcVarArr[i2] = new zhc(a2, a(ykeVar), r6, (byte) 15);
                    i2++;
                    jkeVar = a2;
                }
                TreeMap treeMap = new TreeMap();
                for (int i3 = 0; i3 < i; i3++) {
                    zhc zhcVar = zhcVarArr[i3];
                    if (treeMap.containsKey((jke) zhcVar.b)) {
                        throw new wk2("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put((jke) zhcVar.b, (jke) zhcVar.c);
                }
                return new uje(eod.c(treeMap));
            } catch (IOException | RuntimeException e) {
                throw new gje(e);
            }
        } catch (IOException e2) {
            throw new gje(e2);
        }
    }

    public static final void b(byte b, long j) {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new wk2(ik8.n(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new wk2(ik8.n(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new wk2(ik8.n(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new wk2(ik8.n(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
