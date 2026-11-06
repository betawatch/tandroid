package d3;

import a8.ua;
import e2.t0;
import h9.t1;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import org.telegram.messenger.a8;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class x {
    public long a;
    public long b;

    public /* synthetic */ x(long j3, long j10) {
        this.a = j3;
        this.b = j10;
    }

    public static boolean a(int i7) {
        return i7 == 0 || i7 == 4 || i7 == 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x00a8, code lost:
    
        r23 = r10;
        r25 = 8;
        r19 = null;
        r20 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x b(File file) {
        long j3;
        long j10;
        long j11;
        x xVar;
        long j12;
        long j13;
        String str;
        ua uaVar;
        long j14;
        RandomAccessFile randomAccessFile;
        t1 t1Var;
        int i7;
        int i10;
        long length = file.length();
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
        int i11 = 0;
        long j15 = 0;
        ByteBuffer byteBuffer = null;
        while (true) {
            if (i11 >= 64 || j15 + 8 > length) {
                break;
            }
            try {
                randomAccessFile2.seek(j15);
                xVar = null;
                j12 = 0;
                long readInt = randomAccessFile2.readInt() & 4294967295L;
                int readInt2 = randomAccessFile2.readInt();
                if (readInt != 1) {
                    if (readInt == 0) {
                        readInt = length - j15;
                    }
                    i10 = 8;
                } else {
                    if (16 + j15 > length) {
                        j10 = j15;
                        break;
                    }
                    readInt = randomAccessFile2.readLong();
                    i10 = 16;
                }
                if (j15 == 0 && readInt2 != 1718909296) {
                    randomAccessFile2.close();
                    return null;
                }
                j10 = j15;
                long j16 = i10;
                if (readInt < j16 || readInt > length - j10) {
                    break;
                }
                if (readInt2 == 1835365473 && byteBuffer == null) {
                    j11 = 8;
                    long j17 = readInt - j16;
                    if (j17 <= 1048576) {
                        byte[] bArr = new byte[(int) j17];
                        randomAccessFile2.readFully(bArr);
                        byteBuffer = ByteBuffer.wrap(bArr);
                        j15 = j10 + readInt;
                        i11++;
                    }
                } else {
                    j11 = 8;
                }
                if (readInt2 != 1836086884) {
                    j15 = j10 + readInt;
                    i11++;
                } else if (readInt > j16) {
                    j13 = j10 + j16;
                }
            } finally {
            }
        }
        j11 = 8;
        j13 = -1;
        if (j10 == j12) {
            randomAccessFile2.close();
            return xVar;
        }
        if (byteBuffer != null) {
            try {
                str = d(randomAccessFile2, byteBuffer, length);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            randomAccessFile2.close();
            if (str != 0) {
                try {
                    uaVar = n3.d.a(str);
                } catch (t0 | NumberFormatException | XmlPullParserException unused) {
                    h2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                }
                if (j13 <= j12 && uaVar != 0) {
                    t1Var = (t1) uaVar.c;
                    for (i7 = 0; i7 < t1Var.d; i7++) {
                        n3.c cVar = (n3.c) t1Var.get(i7);
                        if ("MotionPhoto".equalsIgnoreCase(cVar.b)) {
                            long j18 = cVar.c;
                            if (j18 > j12 && j18 < length) {
                                j13 = length - j18;
                            }
                        }
                    }
                }
                if (j13 > j12 && j13 + j11 <= length) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        randomAccessFile.seek(4 + j13);
                        j3 = randomAccessFile.readInt() == 1718909296 ? j13 : -1L;
                        randomAccessFile.close();
                    } finally {
                    }
                }
                long j19 = j3;
                if (uaVar != 0) {
                    long j20 = uaVar.b;
                    if (j20 >= j12) {
                        j14 = j20;
                        return new x(j19, j14);
                    }
                }
                j14 = j12;
                return new x(j19, j14);
            }
            uaVar = xVar;
            if (j13 <= j12) {
                t1Var = (t1) uaVar.c;
                while (i7 < t1Var.d) {
                }
            }
            if (j13 > j12) {
                randomAccessFile = new RandomAccessFile(file, "r");
                randomAccessFile.seek(4 + j13);
                if (randomAccessFile.readInt() == 1718909296) {
                }
                randomAccessFile.close();
            }
            long j192 = j3;
            if (uaVar != 0) {
            }
            j14 = j12;
            return new x(j192, j14);
        }
        str = xVar;
        randomAccessFile2.close();
        if (str != 0) {
        }
        uaVar = xVar;
        if (j13 <= j12) {
        }
        if (j13 > j12) {
        }
        long j1922 = j3;
        if (uaVar != 0) {
        }
        j14 = j12;
        return new x(j1922, j14);
    }

    public static long c(int i7, ByteBuffer byteBuffer) {
        if (i7 == 4) {
            return byteBuffer.getInt() & 4294967295L;
        }
        if (i7 != 8) {
            return 0L;
        }
        return byteBuffer.getLong();
    }

    public static String d(RandomAccessFile randomAccessFile, ByteBuffer byteBuffer, long j3) {
        long j10;
        int i7;
        String str;
        long j11;
        int i10;
        int i11;
        long j12;
        char c10 = 4;
        byteBuffer.position(4);
        int i12 = -1;
        ByteBuffer byteBuffer2 = null;
        while (true) {
            char c11 = c10;
            int i13 = 2;
            if (byteBuffer.remaining() < 8) {
                j10 = 4294967295L;
                i7 = 0;
                str = null;
                j11 = 1;
                break;
            }
            int position = byteBuffer.position();
            str = null;
            j11 = 1;
            long j13 = byteBuffer.getInt() & 4294967295L;
            int i14 = byteBuffer.getInt();
            if (j13 < 8) {
                j10 = 4294967295L;
                break;
            }
            j10 = 4294967295L;
            if (j13 > byteBuffer.limit() - position) {
                break;
            }
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.duplicate().position(position + 8);
            int i15 = position + ((int) j13);
            ByteBuffer byteBuffer4 = (ByteBuffer) byteBuffer3.limit(i15);
            if (i14 == 1768517222) {
                int i16 = byteBuffer4.get() & 255;
                byteBuffer4.position(byteBuffer4.position() + 3);
                long j14 = i16 == 0 ? byteBuffer4.getShort() & 65535 : byteBuffer4.getInt() & 4294967295L;
                long j15 = 0;
                for (int i17 = 8; j15 < j14 && byteBuffer4.remaining() >= i17 && i12 < 0; i17 = 8) {
                    int position2 = byteBuffer4.position();
                    long j16 = j15;
                    long j17 = byteBuffer4.getInt() & 4294967295L;
                    int i18 = byteBuffer4.getInt();
                    if (j17 < 8 || j17 > byteBuffer4.limit() - position2) {
                        break;
                    }
                    if (i18 == 1768842853 && byteBuffer4.remaining() >= 12) {
                        int i19 = byteBuffer4.get() & 255;
                        byteBuffer4.position(byteBuffer4.position() + 3);
                        if (i19 >= i13) {
                            int i20 = i19 == i13 ? byteBuffer4.getShort() & 65535 : byteBuffer4.getInt();
                            byteBuffer4.getShort();
                            if (byteBuffer4.getInt() == 1835625829) {
                                int i21 = ((int) j17) + position2;
                                String[] strArr = new String[i13];
                                int i22 = 0;
                                while (i22 < i13 && byteBuffer4.position() < i21) {
                                    int position3 = byteBuffer4.position();
                                    while (byteBuffer4.position() < i21 && byteBuffer4.get() != 0) {
                                    }
                                    strArr[i22] = new String(byteBuffer4.array(), byteBuffer4.arrayOffset() + position3, Math.max(0, (byteBuffer4.position() - position3) - (byteBuffer4.get(byteBuffer4.position() + (-1)) == 0 ? 1 : 0)));
                                    i22++;
                                    i12 = i12;
                                    position2 = position2;
                                    j14 = j14;
                                    i13 = 2;
                                }
                                i10 = i12;
                                i11 = position2;
                                j12 = j14;
                                if ("application/rdf+xml".equalsIgnoreCase(strArr[1])) {
                                    i12 = i20;
                                    byteBuffer4.position(i11 + ((int) j17));
                                    j15 = j16 + 1;
                                    j14 = j12;
                                    i13 = 2;
                                }
                                i12 = i10;
                                byteBuffer4.position(i11 + ((int) j17));
                                j15 = j16 + 1;
                                j14 = j12;
                                i13 = 2;
                            }
                        }
                    }
                    i10 = i12;
                    i11 = position2;
                    j12 = j14;
                    i12 = i10;
                    byteBuffer4.position(i11 + ((int) j17));
                    j15 = j16 + 1;
                    j14 = j12;
                    i13 = 2;
                }
                i12 = i12;
            } else if (i14 == 1768714083) {
                byteBuffer2 = byteBuffer4;
            }
            byteBuffer.position(i15);
            c10 = c11;
        }
        i7 = 0;
        if (i12 >= 0 && byteBuffer2 != null) {
            int i23 = byteBuffer2.get() & 255;
            byteBuffer2.position(byteBuffer2.position() + 3);
            short s5 = byteBuffer2.getShort();
            int i24 = s5 & 65535;
            int i25 = (i24 >> 12) & 15;
            int i26 = (i24 >> 8) & 15;
            int i27 = (i24 >> 4) & 15;
            int i28 = (i23 == 1 || i23 == 2) ? s5 & 15 : i7;
            if (a(i25) && a(i26) && a(i27) && a(i28)) {
                int i29 = i28 + i25 + i26;
                long j18 = i23 < 2 ? byteBuffer2.getShort() & 65535 : byteBuffer2.getInt() & j10;
                long j19 = 0;
                while (true) {
                    if (j19 >= j18) {
                        break;
                    }
                    int i30 = i23 < 2 ? byteBuffer2.getShort() & 65535 : byteBuffer2.getInt();
                    int i31 = (i23 == 1 || i23 == 2) ? byteBuffer2.getShort() & 15 : 0;
                    byteBuffer2.getShort();
                    long c12 = c(i27, byteBuffer2);
                    int i32 = byteBuffer2.getShort() & 65535;
                    long j20 = j19;
                    long j21 = j18;
                    if (i32 * i29 > byteBuffer2.remaining()) {
                        break;
                    }
                    if (i30 != i12) {
                        byteBuffer2.position((i32 * i29) + byteBuffer2.position());
                        j19 = j20 + j11;
                        j18 = j21;
                    } else if (i31 == 0 && i32 != 0 && i32 <= 64) {
                        long[] jArr = new long[i32];
                        long[] jArr2 = new long[i32];
                        long j22 = 0;
                        int i33 = 0;
                        while (true) {
                            if (i33 < i32) {
                                c(i28, byteBuffer2);
                                jArr[i33] = c(i25, byteBuffer2) + c12;
                                long c13 = c(i26, byteBuffer2);
                                jArr2[i33] = c13;
                                long j23 = jArr[i33];
                                if (j23 < 0 || c13 <= 0 || c13 > j3 - j23) {
                                    break;
                                }
                                j22 += c13;
                                i33++;
                            } else if (j22 <= 1048576) {
                                byte[] bArr = new byte[(int) j22];
                                int i34 = 0;
                                for (int i35 = 0; i35 < i32; i35++) {
                                    randomAccessFile.seek(jArr[i35]);
                                    randomAccessFile.readFully(bArr, i34, (int) jArr2[i35]);
                                    i34 += (int) jArr2[i35];
                                }
                                return new String(bArr, "UTF-8");
                            }
                        }
                    }
                }
            }
        }
        return str;
    }

    public x() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }
}
