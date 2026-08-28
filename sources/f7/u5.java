package f7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class u5 {
    public static String a(com.google.android.gms.internal.cast.x4 x4Var) {
        StringBuilder sb2 = new StringBuilder(x4Var.o());
        for (int i9 = 0; i9 < x4Var.o(); i9++) {
            byte i10 = x4Var.i(i9);
            if (i10 == 34) {
                sb2.append("\\\"");
            } else if (i10 == 39) {
                sb2.append("\\'");
            } else if (i10 != 92) {
                switch (i10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (i10 < 32 || i10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((i10 >>> 6) & 3) + 48));
                            sb2.append((char) (((i10 >>> 3) & 7) + 48));
                            sb2.append((char) ((i10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) i10);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
