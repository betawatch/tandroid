// default package

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cd4 extends vy5 implements rr4 {
    public static final cd4 c;
    public static final cd4 d;
    public static final cd4 e;
    public final /* synthetic */ byte b;

    static {
        int i = 1;
        c = new cd4(i, (byte) 0);
        d = new cd4(i, (byte) 1);
        e = new cd4(i, (byte) 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd4(int i, byte b) {
        super(i);
        this.b = b;
    }

    @Override // rr4
    public final Object invoke(Object obj) {
        String valueOf;
        int i;
        switch (this.b) {
            case 0:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new rka(absolutePath);
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
                return kt6.p(((ni8) entry.getKey()).a, " = ", valueOf, new StringBuilder("  "));
            default:
                ArrayList arrayList = ((g2d) obj).a;
                ArrayList arrayList2 = new ArrayList(mm2.c(arrayList, 10));
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    c2d c2dVar = (c2d) obj2;
                    int i4 = c2dVar.c;
                    if (i4 == 0) {
                        i = 0;
                    } else if (i4 != 1) {
                        i = 2;
                        if (i4 != 2) {
                            i = 3;
                            if (i4 != 3) {
                                i = 4;
                                if (i4 != 4) {
                                    i2d.e(c2dVar.c, "Unknown capability status: ");
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
                    arrayList2.add(new wbc(c2dVar.a, i, c2dVar.b));
                }
                return arrayList2;
        }
    }
}
