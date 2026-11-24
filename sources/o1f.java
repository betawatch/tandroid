// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class o1f {
    public static String a(cdd cddVar) {
        String str;
        StringBuilder sb = new StringBuilder(cddVar.size());
        for (int i = 0; i < cddVar.size(); i++) {
            int j = cddVar.j(i);
            if (j == 34) {
                str = "\\\"";
            } else if (j == 39) {
                str = "\\'";
            } else if (j != 92) {
                switch (j) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (j < 32 || j > 126) {
                            sb.append('\\');
                            sb.append((char) (((j >>> 6) & 3) + 48));
                            sb.append((char) (((j >>> 3) & 7) + 48));
                            j = (j & 7) + 48;
                        }
                        sb.append((char) j);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
