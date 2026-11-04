package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class za {
    public static String a(com.google.android.gms.internal.play_billing.l1 l1Var) {
        StringBuilder sb2 = new StringBuilder(l1Var.j());
        for (int i3 = 0; i3 < l1Var.j(); i3++) {
            byte h = l1Var.h(i3);
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
