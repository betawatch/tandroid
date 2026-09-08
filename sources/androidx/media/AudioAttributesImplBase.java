package androidx.media;

import i2.g;
import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.b == audioAttributesImplBase.b) {
            int i11 = this.c;
            int i12 = audioAttributesImplBase.c;
            int i13 = audioAttributesImplBase.d;
            if (i13 == -1) {
                int i14 = audioAttributesImplBase.a;
                int i15 = AudioAttributesCompat.b;
                if ((i12 & 1) != 1) {
                    i10 = 4;
                    if ((i12 & 4) != 4) {
                        switch (i14) {
                            case 2:
                                i10 = 0;
                                break;
                            case 3:
                                i10 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i10 = 5;
                                break;
                            case 6:
                                i10 = 2;
                                break;
                            case 11:
                                i10 = 10;
                                break;
                            case 12:
                            default:
                                i10 = 3;
                                break;
                            case 13:
                                i10 = 1;
                                break;
                        }
                    } else {
                        i10 = 6;
                    }
                } else {
                    i10 = 7;
                }
            } else {
                i10 = i13;
            }
            if (i10 == 6) {
                i12 |= 4;
            } else if (i10 == 7) {
                i12 |= 1;
            }
            if (i11 == (i12 & 273) && this.a == audioAttributesImplBase.a && this.d == i13) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb2.append(" stream=");
            sb2.append(this.d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.a;
        int i11 = AudioAttributesCompat.b;
        switch (i10) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = g.i(i10, "unknown usage ");
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.c).toUpperCase());
        return sb2.toString();
    }
}
