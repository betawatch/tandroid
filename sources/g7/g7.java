package g7;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class g7 {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = BuildConfig.BETA_URL;
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e9) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e9);
                    StringBuilder r10 = a9.p.r("<", str2, " threw ");
                    r10.append(e9.getClass().getName());
                    r10.append(">");
                    sb2 = r10.toString();
                }
            }
            objArr[i11] = sb2;
            i11++;
        }
        StringBuilder sb3 = new StringBuilder((length * 16) + str.length());
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i12, indexOf);
            sb3.append(objArr[i10]);
            i10++;
            i12 = indexOf + 2;
        }
        sb3.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb3.append(", ");
                sb3.append(objArr[i13]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
