// default package

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fuc {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public byte[] g;

    public static fuc a(int i, String str) {
        fuc fucVar = new fuc();
        fucVar.a = true;
        fucVar.e = 8;
        byte[] bArr = {3, (byte) (i & kk7.d4)};
        if (str == null || str.length() == 0) {
            fucVar.c(bArr);
            return fucVar;
        }
        byte[] a = yd7.a(str);
        byte[] bArr2 = new byte[a.length + 2];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        System.arraycopy(a, 0, bArr2, 2, a.length);
        fucVar.c(bArr2);
        return fucVar;
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
        StringBuilder r = tb4.r("WebSocketFrame(FIN=");
        r.append(this.a ? "1" : "0");
        r.append(",RSV1=");
        r.append(this.b ? "1" : "0");
        r.append(",RSV2=");
        r.append(this.c ? "1" : "0");
        r.append(",RSV3=");
        r.append(this.d ? "1" : "0");
        r.append(",Opcode=");
        int i = this.e;
        SecureRandom secureRandom = yd7.a;
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
        r.append(str);
        r.append(",Length=");
        byte[] bArr = this.g;
        r.append(bArr == null ? 0 : bArr.length);
        int i2 = this.e;
        String str2 = null;
        if (i2 == 1) {
            r.append(",Payload=");
            if (this.g == null) {
                r.append("null");
            } else if (this.b) {
                r.append("compressed");
            } else {
                r.append("\"");
                byte[] bArr2 = this.g;
                if (bArr2 != null) {
                    try {
                        str2 = new String(bArr2, 0, bArr2.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                    }
                }
                r.append(str2);
                r.append("\"");
            }
        } else if (i2 == 2) {
            r.append(",Payload=");
            if (this.g == null) {
                r.append("null");
            } else if (this.b) {
                r.append("compressed");
            } else {
                int i3 = 0;
                while (true) {
                    byte[] bArr3 = this.g;
                    if (i3 < bArr3.length) {
                        r.append(String.format("%02X ", Integer.valueOf(bArr3[i3] & 255)));
                        i3++;
                    } else if (bArr3.length != 0) {
                        r.setLength(r.length() - 1);
                    }
                }
            }
        } else if (i2 == 8) {
            r.append(",CloseCode=");
            r.append(b());
            r.append(",Reason=");
            byte[] bArr4 = this.g;
            if (bArr4 != null && bArr4.length >= 3) {
                try {
                    str2 = new String(bArr4, 2, bArr4.length - 2, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                }
            }
            if (str2 == null) {
                r.append("null");
            } else {
                ug8.z("\"", str2, "\"", r);
            }
        }
        r.append(")");
        return r.toString();
    }
}
