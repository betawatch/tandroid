package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class na {
    public static String a(com.google.android.gms.internal.cast.u4 u4Var) {
        StringBuilder sb2 = new StringBuilder(u4Var.n());
        for (int i10 = 0; i10 < u4Var.n(); i10++) {
            byte h = u4Var.h(i10);
            if (h == 34) {
                sb2.append("\\\"");
            } else if (h == 39) {
                sb2.append("\\'");
            } else if (h != 92) {
                switch (h) {
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
                        if (h < 32 || h > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((h >>> 6) & 3) + 48));
                            sb2.append((char) (((h >>> 3) & 7) + 48));
                            sb2.append((char) ((h & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) h);
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
