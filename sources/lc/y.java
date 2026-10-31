package lc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public byte[] g;

    public static y a(int i10, String str) {
        y yVar = new y();
        yVar.a = true;
        yVar.e = 8;
        byte[] bArr = {(byte) ((i10 >> 8) & zs.e4), (byte) (i10 & zs.e4)};
        if (str == null || str.length() == 0) {
            yVar.c(bArr);
            return yVar;
        }
        byte[] a2 = k.a(str);
        byte[] bArr2 = new byte[a2.length + 2];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        System.arraycopy(a2, 0, bArr2, 2, a2.length);
        yVar.c(bArr2);
        return yVar;
    }

    public final int b() {
        byte[] bArr = this.g;
        if (bArr == null || bArr.length < 2) {
            return 1005;
        }
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public final void c(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.g = bArr;
    }

    public final String toString() {
        String str;
        StringBuilder t10 = a1.g.t("WebSocketFrame(FIN=");
        t10.append(this.a ? "1" : "0");
        t10.append(",RSV1=");
        t10.append(this.b ? "1" : "0");
        t10.append(",RSV2=");
        t10.append(this.c ? "1" : "0");
        t10.append(",RSV3=");
        t10.append(this.d ? "1" : "0");
        t10.append(",Opcode=");
        int i10 = this.e;
        SecureRandom secureRandom = k.a;
        if (i10 == 0) {
            str = "CONTINUATION";
        } else if (i10 == 1) {
            str = "TEXT";
        } else if (i10 != 2) {
            switch (i10) {
                case 8:
                    str = "CLOSE";
                    break;
                case 9:
                    str = "PING";
                    break;
                case 10:
                    str = "PONG";
                    break;
                default:
                    if (1 <= i10 && i10 <= 7) {
                        str = String.format("DATA(0x%X)", Integer.valueOf(i10));
                        break;
                    } else if (8 <= i10 && i10 <= 15) {
                        str = String.format("CONTROL(0x%X)", Integer.valueOf(i10));
                        break;
                    } else {
                        str = String.format("0x%X", Integer.valueOf(i10));
                        break;
                    }
                    break;
            }
        } else {
            str = "BINARY";
        }
        t10.append(str);
        t10.append(",Length=");
        byte[] bArr = this.g;
        t10.append(bArr == null ? 0 : bArr.length);
        int i11 = this.e;
        String str2 = null;
        if (i11 == 1) {
            t10.append(",Payload=");
            if (this.g == null) {
                t10.append("null");
            } else if (this.b) {
                t10.append("compressed");
            } else {
                t10.append("\"");
                byte[] bArr2 = this.g;
                if (bArr2 != null) {
                    try {
                        str2 = new String(bArr2, 0, bArr2.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                    }
                }
                t10.append(str2);
                t10.append("\"");
            }
        } else if (i11 == 2) {
            t10.append(",Payload=");
            if (this.g == null) {
                t10.append("null");
            } else if (this.b) {
                t10.append("compressed");
            } else {
                int i12 = 0;
                while (true) {
                    byte[] bArr3 = this.g;
                    if (i12 < bArr3.length) {
                        t10.append(String.format("%02X ", Integer.valueOf(bArr3[i12] & 255)));
                        i12++;
                    } else if (bArr3.length != 0) {
                        t10.setLength(t10.length() - 1);
                    }
                }
            }
        } else if (i11 == 8) {
            t10.append(",CloseCode=");
            t10.append(b());
            t10.append(",Reason=");
            byte[] bArr4 = this.g;
            if (bArr4 != null && bArr4.length >= 3) {
                try {
                    str2 = new String(bArr4, 2, bArr4.length - 2, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                }
            }
            if (str2 == null) {
                t10.append("null");
            } else {
                t10.append("\"");
                t10.append(str2);
                t10.append("\"");
            }
        }
        t10.append(")");
        return t10.toString();
    }
}
