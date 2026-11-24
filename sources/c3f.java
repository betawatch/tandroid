// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class c3f {
    public static String a(sie sieVar) {
        StringBuilder sb = new StringBuilder(sieVar.i());
        for (int i = 0; i < sieVar.i(); i++) {
            byte h = sieVar.h(i);
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
