// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class d2f {
    public static String a(qae qaeVar) {
        StringBuilder sb = new StringBuilder(qaeVar.k());
        for (int i = 0; i < qaeVar.k(); i++) {
            byte h = qaeVar.h(i);
            if (h == 34) {
                sb.append("\\\"");
            } else if (h == 39) {
                sb.append("\\'");
            } else if (h != 92) {
                switch (h) {
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
                        if (h < 32 || h > 126) {
                            sb.append('\\');
                            sb.append((char) (((h >>> 6) & 3) + 48));
                            sb.append((char) (((h >>> 3) & 7) + 48));
                            sb.append((char) ((h & 7) + 48));
                            break;
                        } else {
                            sb.append((char) h);
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
