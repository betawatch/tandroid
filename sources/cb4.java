// default package

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cb4 extends vw5 implements qp4 {
    public static final cb4 c;
    public static final cb4 d;
    public static final cb4 e;
    public final /* synthetic */ byte b;

    static {
        int i = 1;
        c = new cb4(i, (byte) 0);
        d = new cb4(i, (byte) 1);
        e = new cb4(i, (byte) 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb4(int i, byte b) {
        super(i);
        this.b = b;
    }

    @Override // qp4
    public final Object invoke(Object obj) {
        String valueOf;
        int i;
        switch (this.b) {
            case 0:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new pia(absolutePath);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i2 = 0;
                    for (byte b : (byte[]) value) {
                        i2++;
                        if (i2 > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    valueOf = sb.toString();
                } else {
                    valueOf = String.valueOf(entry.getValue());
                }
                return ls6.o(((lg8) entry.getKey()).a, " = ", valueOf, new StringBuilder("  "));
            default:
                ArrayList arrayList = ((f0d) obj).a;
                ArrayList arrayList2 = new ArrayList(al2.c(arrayList, 10));
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    b0d b0dVar = (b0d) obj2;
                    int i4 = b0dVar.c;
                    if (i4 == 0) {
                        i = 0;
                    } else if (i4 != 1) {
                        i = 2;
                        if (i4 != 2) {
                            i = 3;
                            if (i4 != 3) {
                                i = 4;
                                if (i4 != 4) {
                                    fvc.d(b0dVar.c, "Unknown capability status: ");
                                    return null;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i = 1;
                    }
                    arrayList2.add(new v9c(b0dVar.a, i, b0dVar.b));
                }
                return arrayList2;
        }
    }
}
