package fb;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public abstract class g {
    public static final int a;

    static {
        int i10;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]", 3);
            i10 = Integer.parseInt(split[0]);
            if (i10 == 1 && split.length > 1) {
                i10 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i10 = -1;
        }
        if (i10 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < property.length(); i11++) {
                    char charAt = property.charAt(i11);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb2.append(charAt);
                }
                i10 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i10 = -1;
            }
        }
        if (i10 == -1) {
            i10 = 6;
        }
        a = i10;
    }
}
