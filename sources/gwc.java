// default package

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gwc {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public byte[] g;

    public static gwc a(int i, String str) {
        gwc gwcVar = new gwc();
        gwcVar.a = true;
        gwcVar.e = 8;
        byte[] bArr = {3, (byte) (i & nm7.d4)};
        if (str == null || str.length() == 0) {
            gwcVar.c(bArr);
            return gwcVar;
        }
        byte[] a = ag7.a(str);
        byte[] bArr2 = new byte[a.length + 2];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        System.arraycopy(a, 0, bArr2, 2, a.length);
        gwcVar.c(bArr2);
        return gwcVar;
    }

    public final int b() {
        byte[] bArr = this.g;
        if (bArr == null || bArr.length < 2) {
            return 1005;
        }
        return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
    }

    public final void c(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.g = bArr;
    }

    public final String toString() {
        String str;
        StringBuilder s = td4.s("WebSocketFrame(FIN=");
        s.append(this.a ? "1" : "0");
        s.append(",RSV1=");
        s.append(this.b ? "1" : "0");
        s.append(",RSV2=");
        s.append(this.c ? "1" : "0");
        s.append(",RSV3=");
        s.append(this.d ? "1" : "0");
        s.append(",Opcode=");
        int i = this.e;
        SecureRandom secureRandom = ag7.a;
        if (i == 0) {
            str = "CONTINUATION";
        } else if (i == 1) {
            str = "TEXT";
        } else if (i != 2) {
            switch (i) {
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
                    if (1 <= i && i <= 7) {
                        str = String.format("DATA(0x%X)", Integer.valueOf(i));
                        break;
                    } else if (8 <= i && i <= 15) {
                        str = String.format("CONTROL(0x%X)", Integer.valueOf(i));
                        break;
                    } else {
                        str = String.format("0x%X", Integer.valueOf(i));
                        break;
                    }
                    break;
            }
        } else {
            str = "BINARY";
        }
        s.append(str);
        s.append(",Length=");
        byte[] bArr = this.g;
        s.append(bArr == null ? 0 : bArr.length);
        int i2 = this.e;
        String str2 = null;
        if (i2 == 1) {
            s.append(",Payload=");
            if (this.g == null) {
                s.append("null");
            } else if (this.b) {
                s.append("compressed");
            } else {
                s.append("\"");
                byte[] bArr2 = this.g;
                if (bArr2 != null) {
                    try {
                        str2 = new String(bArr2, 0, bArr2.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                    }
                }
                s.append(str2);
                s.append("\"");
            }
        } else if (i2 == 2) {
            s.append(",Payload=");
            if (this.g == null) {
                s.append("null");
            } else if (this.b) {
                s.append("compressed");
            } else {
                int i3 = 0;
                while (true) {
                    byte[] bArr3 = this.g;
                    if (i3 < bArr3.length) {
                        s.append(String.format("%02X ", Integer.valueOf(bArr3[i3] & 255)));
                        i3++;
                    } else if (bArr3.length != 0) {
                        s.setLength(s.length() - 1);
                    }
                }
            }
        } else if (i2 == 8) {
            s.append(",CloseCode=");
            s.append(b());
            s.append(",Reason=");
            byte[] bArr4 = this.g;
            if (bArr4 != null && bArr4.length >= 3) {
                try {
                    str2 = new String(bArr4, 2, bArr4.length - 2, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                }
            }
            if (str2 == null) {
                s.append("null");
            } else {
                wi8.z("\"", str2, "\"", s);
            }
        }
        s.append(")");
        return s.toString();
    }
}
