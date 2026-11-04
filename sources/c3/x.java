package c3;

import b8.ig;
import d2.v0;
import g9.s1;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import org.telegram.messenger.a8;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x {
    public long a;
    public long b;

    public /* synthetic */ x(long j10, long j11) {
        this.a = j10;
        this.b = j11;
    }

    public static boolean a(int i3) {
        return i3 == 0 || i3 == 4 || i3 == 8;
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
        long j10;
        long j11;
        long j12;
        x xVar;
        long j13;
        long j14;
        String str;
        ig igVar;
        long j15;
        RandomAccessFile randomAccessFile;
        s1 s1Var;
        int i3;
        int i10;
        long length = file.length();
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
        int i11 = 0;
        long j16 = 0;
        ByteBuffer byteBuffer = null;
        while (true) {
            if (i11 >= 64 || j16 + 8 > length) {
                break;
            }
            try {
                randomAccessFile2.seek(j16);
                xVar = null;
                j13 = 0;
                long readInt = randomAccessFile2.readInt() & 4294967295L;
                int readInt2 = randomAccessFile2.readInt();
                if (readInt != 1) {
                    if (readInt == 0) {
                        readInt = length - j16;
                    }
                    i10 = 8;
                } else {
                    if (16 + j16 > length) {
                        j11 = j16;
                        break;
                    }
                    readInt = randomAccessFile2.readLong();
                    i10 = 16;
                }
                if (j16 == 0 && readInt2 != 1718909296) {
                    randomAccessFile2.close();
                    return null;
                }
                j11 = j16;
                long j17 = i10;
                if (readInt < j17 || readInt > length - j11) {
                    break;
                }
                if (readInt2 == 1835365473 && byteBuffer == null) {
                    j12 = 8;
                    long j18 = readInt - j17;
                    if (j18 <= 1048576) {
                        byte[] bArr = new byte[(int) j18];
                        randomAccessFile2.readFully(bArr);
                        byteBuffer = ByteBuffer.wrap(bArr);
                        j16 = j11 + readInt;
                        i11++;
                    }
                } else {
                    j12 = 8;
                }
                if (readInt2 != 1836086884) {
                    j16 = j11 + readInt;
                    i11++;
                } else if (readInt > j17) {
                    j14 = j11 + j17;
                }
            } finally {
            }
        }
        j12 = 8;
        j14 = -1;
        if (j11 == j13) {
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
                    igVar = m3.d.a(str);
                } catch (v0 | NumberFormatException | XmlPullParserException unused) {
                    g2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                }
                if (j14 <= j13 && igVar != 0) {
                    s1Var = (s1) igVar.c;
                    for (i3 = 0; i3 < s1Var.d; i3++) {
                        m3.c cVar = (m3.c) s1Var.get(i3);
                        if ("MotionPhoto".equalsIgnoreCase(cVar.b)) {
                            long j19 = cVar.c;
                            if (j19 > j13 && j19 < length) {
                                j14 = length - j19;
                            }
                        }
                    }
                }
                if (j14 > j13 && j14 + j12 <= length) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        randomAccessFile.seek(4 + j14);
                        j10 = randomAccessFile.readInt() == 1718909296 ? j14 : -1L;
                        randomAccessFile.close();
                    } finally {
                    }
                }
                long j20 = j10;
                if (igVar != 0) {
                    long j21 = igVar.b;
                    if (j21 >= j13) {
                        j15 = j21;
                        return new x(j20, j15);
                    }
                }
                j15 = j13;
                return new x(j20, j15);
            }
            igVar = xVar;
            if (j14 <= j13) {
                s1Var = (s1) igVar.c;
                while (i3 < s1Var.d) {
                }
            }
            if (j14 > j13) {
                randomAccessFile = new RandomAccessFile(file, "r");
                randomAccessFile.seek(4 + j14);
                if (randomAccessFile.readInt() == 1718909296) {
                }
                randomAccessFile.close();
            }
            long j202 = j10;
            if (igVar != 0) {
            }
            j15 = j13;
            return new x(j202, j15);
        }
        str = xVar;
        randomAccessFile2.close();
        if (str != 0) {
        }
        igVar = xVar;
        if (j14 <= j13) {
        }
        if (j14 > j13) {
        }
        long j2022 = j10;
        if (igVar != 0) {
        }
        j15 = j13;
        return new x(j2022, j15);
    }

    public static long c(int i3, ByteBuffer byteBuffer) {
        if (i3 == 4) {
            return byteBuffer.getInt() & 4294967295L;
        }
        if (i3 != 8) {
            return 0L;
        }
        return byteBuffer.getLong();
    }

    public static String d(RandomAccessFile randomAccessFile, ByteBuffer byteBuffer, long j10) {
        long j11;
        int i3;
        String str;
        long j12;
        int i10;
        int i11;
        long j13;
        char c2 = 4;
        byteBuffer.position(4);
        int i12 = -1;
        ByteBuffer byteBuffer2 = null;
        while (true) {
            char c10 = c2;
            int i13 = 2;
            if (byteBuffer.remaining() < 8) {
                j11 = 4294967295L;
                i3 = 0;
                str = null;
                j12 = 1;
                break;
            }
            int position = byteBuffer.position();
            str = null;
            j12 = 1;
            long j14 = byteBuffer.getInt() & 4294967295L;
            int i14 = byteBuffer.getInt();
            if (j14 < 8) {
                j11 = 4294967295L;
                break;
            }
            j11 = 4294967295L;
            if (j14 > byteBuffer.limit() - position) {
                break;
            }
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.duplicate().position(position + 8);
            int i15 = position + ((int) j14);
            ByteBuffer byteBuffer4 = (ByteBuffer) byteBuffer3.limit(i15);
            if (i14 == 1768517222) {
                int i16 = byteBuffer4.get() & 255;
                byteBuffer4.position(byteBuffer4.position() + 3);
                long j15 = i16 == 0 ? byteBuffer4.getShort() & 65535 : byteBuffer4.getInt() & 4294967295L;
                long j16 = 0;
                for (int i17 = 8; j16 < j15 && byteBuffer4.remaining() >= i17 && i12 < 0; i17 = 8) {
                    int position2 = byteBuffer4.position();
                    long j17 = j16;
                    long j18 = byteBuffer4.getInt() & 4294967295L;
                    int i18 = byteBuffer4.getInt();
                    if (j18 < 8 || j18 > byteBuffer4.limit() - position2) {
                        break;
                    }
                    if (i18 == 1768842853 && byteBuffer4.remaining() >= 12) {
                        int i19 = byteBuffer4.get() & 255;
                        byteBuffer4.position(byteBuffer4.position() + 3);
                        if (i19 >= i13) {
                            int i20 = i19 == i13 ? byteBuffer4.getShort() & 65535 : byteBuffer4.getInt();
                            byteBuffer4.getShort();
                            if (byteBuffer4.getInt() == 1835625829) {
                                int i21 = ((int) j18) + position2;
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
                                    j15 = j15;
                                    i13 = 2;
                                }
                                i10 = i12;
                                i11 = position2;
                                j13 = j15;
                                if ("application/rdf+xml".equalsIgnoreCase(strArr[1])) {
                                    i12 = i20;
                                    byteBuffer4.position(i11 + ((int) j18));
                                    j16 = j17 + 1;
                                    j15 = j13;
                                    i13 = 2;
                                }
                                i12 = i10;
                                byteBuffer4.position(i11 + ((int) j18));
                                j16 = j17 + 1;
                                j15 = j13;
                                i13 = 2;
                            }
                        }
                    }
                    i10 = i12;
                    i11 = position2;
                    j13 = j15;
                    i12 = i10;
                    byteBuffer4.position(i11 + ((int) j18));
                    j16 = j17 + 1;
                    j15 = j13;
                    i13 = 2;
                }
                i12 = i12;
            } else if (i14 == 1768714083) {
                byteBuffer2 = byteBuffer4;
            }
            byteBuffer.position(i15);
            c2 = c10;
        }
        i3 = 0;
        if (i12 >= 0 && byteBuffer2 != null) {
            int i23 = byteBuffer2.get() & 255;
            byteBuffer2.position(byteBuffer2.position() + 3);
            short s6 = byteBuffer2.getShort();
            int i24 = s6 & 65535;
            int i25 = (i24 >> 12) & 15;
            int i26 = (i24 >> 8) & 15;
            int i27 = (i24 >> 4) & 15;
            int i28 = (i23 == 1 || i23 == 2) ? s6 & 15 : i3;
            if (a(i25) && a(i26) && a(i27) && a(i28)) {
                int i29 = i28 + i25 + i26;
                long j19 = i23 < 2 ? byteBuffer2.getShort() & 65535 : byteBuffer2.getInt() & j11;
                long j20 = 0;
                while (true) {
                    if (j20 >= j19) {
                        break;
                    }
                    int i30 = i23 < 2 ? byteBuffer2.getShort() & 65535 : byteBuffer2.getInt();
                    int i31 = (i23 == 1 || i23 == 2) ? byteBuffer2.getShort() & 15 : 0;
                    byteBuffer2.getShort();
                    long c11 = c(i27, byteBuffer2);
                    int i32 = byteBuffer2.getShort() & 65535;
                    long j21 = j20;
                    long j22 = j19;
                    if (i32 * i29 > byteBuffer2.remaining()) {
                        break;
                    }
                    if (i30 != i12) {
                        byteBuffer2.position((i32 * i29) + byteBuffer2.position());
                        j20 = j21 + j12;
                        j19 = j22;
                    } else if (i31 == 0 && i32 != 0 && i32 <= 64) {
                        long[] jArr = new long[i32];
                        long[] jArr2 = new long[i32];
                        long j23 = 0;
                        int i33 = 0;
                        while (true) {
                            if (i33 < i32) {
                                c(i28, byteBuffer2);
                                jArr[i33] = c(i25, byteBuffer2) + c11;
                                long c12 = c(i26, byteBuffer2);
                                jArr2[i33] = c12;
                                long j24 = jArr[i33];
                                if (j24 < 0 || c12 <= 0 || c12 > j10 - j24) {
                                    break;
                                }
                                j23 += c12;
                                i33++;
                            } else if (j23 <= 1048576) {
                                byte[] bArr = new byte[(int) j23];
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
