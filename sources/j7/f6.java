package j7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class f6 {
    public static String a(com.google.android.gms.internal.cast.x4 x4Var) {
        StringBuilder sb = new StringBuilder(x4Var.o());
        for (int i10 = 0; i10 < x4Var.o(); i10++) {
            byte i11 = x4Var.i(i10);
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
