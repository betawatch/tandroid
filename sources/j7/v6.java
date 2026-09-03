package j7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class v6 {
    public static String a(com.google.android.gms.internal.play_billing.l1 l1Var) {
        StringBuilder sb = new StringBuilder(l1Var.o());
        for (int i10 = 0; i10 < l1Var.o(); i10++) {
            byte i11 = l1Var.i(i10);
            if (i11 == 34) {
                sb.append("\\\"");
            } else if (i11 == 39) {
                sb.append("\\'");
            } else if (i11 != 92) {
                switch (i11) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (i11 < 32 || i11 > 126) {
                            sb.append('\\');
                            sb.append((char) (((i11 >>> 6) & 3) + 48));
                            sb.append((char) (((i11 >>> 3) & 7) + 48));
                            sb.append((char) ((i11 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) i11);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
