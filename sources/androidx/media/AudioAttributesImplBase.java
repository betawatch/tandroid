package androidx.media;

import j3.r0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;

    public final boolean equals(Object obj) {
        int i9;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.b == audioAttributesImplBase.b) {
            int i10 = this.c;
            int i11 = audioAttributesImplBase.c;
            int i12 = audioAttributesImplBase.d;
            if (i12 == -1) {
                int i13 = audioAttributesImplBase.a;
                int i14 = AudioAttributesCompat.b;
                if ((i11 & 1) != 1) {
                    i9 = 4;
                    if ((i11 & 4) != 4) {
                        switch (i13) {
                            case 2:
                                i9 = 0;
                                break;
                            case 3:
                                i9 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i9 = 5;
                                break;
                            case 6:
                                i9 = 2;
                                break;
                            case 11:
                                i9 = 10;
                                break;
                            case 12:
                            default:
                                i9 = 3;
                                break;
                            case 13:
                                i9 = 1;
                                break;
                        }
                    } else {
                        i9 = 6;
                    }
                } else {
                    i9 = 7;
                }
            } else {
                i9 = i12;
            }
            if (i9 == 6) {
                i11 |= 4;
            } else if (i9 == 7) {
                i11 |= 1;
            }
            if (i10 == (i11 & 273) && this.a == audioAttributesImplBase.a && this.d == i12) {
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
        int i9 = this.a;
        int i10 = AudioAttributesCompat.b;
        switch (i9) {
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
                str = r0.l(i9, "unknown usage ");
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
