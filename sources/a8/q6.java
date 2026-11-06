package a8;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class q6 {
    public static String a(androidx.datastore.preferences.protobuf.h hVar) {
        StringBuilder sb2 = new StringBuilder(hVar.size());
        for (int i7 = 0; i7 < hVar.size(); i7++) {
            byte f10 = hVar.f(i7);
            if (f10 == 34) {
                sb2.append("\\\"");
            } else if (f10 == 39) {
                sb2.append("\\'");
            } else if (f10 != 92) {
                switch (f10) {
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
                        if (f10 < 32 || f10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((f10 >>> 6) & 3) + 48));
                            sb2.append((char) (((f10 >>> 3) & 7) + 48));
                            sb2.append((char) ((f10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) f10);
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
