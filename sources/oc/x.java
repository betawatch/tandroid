package oc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public byte[] g;

    public static x a(int i3, String str) {
        x xVar = new x();
        xVar.a = true;
        xVar.e = 8;
        byte[] bArr = {(byte) ((i3 >> 8) & hs.e4), (byte) (i3 & hs.e4)};
        if (str == null || str.length() == 0) {
            xVar.c(bArr);
            return xVar;
        }
        byte[] a10 = k.a(str);
        byte[] bArr2 = new byte[a10.length + 2];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        System.arraycopy(a10, 0, bArr2, 2, a10.length);
        xVar.c(bArr2);
        return xVar;
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
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l("WebSocketFrame(FIN=");
        l10.append(this.a ? "1" : "0");
        l10.append(",RSV1=");
        l10.append(this.b ? "1" : "0");
        l10.append(",RSV2=");
        l10.append(this.c ? "1" : "0");
        l10.append(",RSV3=");
        l10.append(this.d ? "1" : "0");
        l10.append(",Opcode=");
        int i3 = this.e;
        SecureRandom secureRandom = k.a;
        if (i3 == 0) {
            str = "CONTINUATION";
        } else if (i3 == 1) {
            str = "TEXT";
        } else if (i3 != 2) {
            switch (i3) {
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
                    if (1 <= i3 && i3 <= 7) {
                        str = String.format("DATA(0x%X)", Integer.valueOf(i3));
                        break;
                    } else if (8 <= i3 && i3 <= 15) {
                        str = String.format("CONTROL(0x%X)", Integer.valueOf(i3));
                        break;
                    } else {
                        str = String.format("0x%X", Integer.valueOf(i3));
                        break;
                    }
                    break;
            }
        } else {
            str = "BINARY";
        }
        l10.append(str);
        l10.append(",Length=");
        byte[] bArr = this.g;
        l10.append(bArr == null ? 0 : bArr.length);
        int i10 = this.e;
        String str2 = null;
        if (i10 == 1) {
            l10.append(",Payload=");
            if (this.g == null) {
                l10.append("null");
            } else if (this.b) {
                l10.append("compressed");
            } else {
                l10.append("\"");
                byte[] bArr2 = this.g;
                if (bArr2 != null) {
                    try {
                        str2 = new String(bArr2, 0, bArr2.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                    }
                }
                l10.append(str2);
                l10.append("\"");
            }
        } else if (i10 == 2) {
            l10.append(",Payload=");
            if (this.g == null) {
                l10.append("null");
            } else if (this.b) {
                l10.append("compressed");
            } else {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = this.g;
                    if (i11 < bArr3.length) {
                        l10.append(String.format("%02X ", Integer.valueOf(bArr3[i11] & 255)));
                        i11++;
                    } else if (bArr3.length != 0) {
                        l10.setLength(l10.length() - 1);
                    }
                }
            }
        } else if (i10 == 8) {
            l10.append(",CloseCode=");
            l10.append(b());
            l10.append(",Reason=");
            byte[] bArr4 = this.g;
            if (bArr4 != null && bArr4.length >= 3) {
                try {
                    str2 = new String(bArr4, 2, bArr4.length - 2, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                }
            }
            if (str2 == null) {
                l10.append("null");
            } else {
                l10.append("\"");
                l10.append(str2);
                l10.append("\"");
            }
        }
        l10.append(")");
        return l10.toString();
    }
}
