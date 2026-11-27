// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class fk6 {
    public final pm3 a;

    public fk6(w2d w2dVar, y2d y2dVar, jk8 jk8Var) {
        this.a = new pm3((Object) w2dVar, (Object) y2dVar, (Object) jk8Var, (byte) 15);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(pm3 pm3Var, Object obj, Object obj2) {
        int i;
        int size;
        int h;
        y2d y2dVar;
        int size2;
        int h2;
        w2d w2dVar = (w2d) pm3Var.b;
        int i2 = ta4.c;
        int i3 = 1;
        int g = xk2.g(1);
        x2d x2dVar = a3d.d;
        if (w2dVar == x2dVar) {
            g <<= 1;
        }
        switch (w2dVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i = 8;
                int i4 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g2 = xk2.g(2);
                if (y2dVar == x2dVar) {
                    g2 <<= 1;
                }
                switch (y2dVar.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i3 = 8;
                        break;
                    case 1:
                        ((Float) obj2).getClass();
                        i3 = 4;
                        break;
                    case 2:
                        i3 = xk2.i(((Long) obj2).longValue());
                        break;
                    case 3:
                        i3 = xk2.i(((Long) obj2).longValue());
                        break;
                    case 4:
                        i3 = xk2.i(((Integer) obj2).intValue());
                        break;
                    case 5:
                        ((Long) obj2).getClass();
                        i3 = 8;
                        break;
                    case 6:
                        ((Integer) obj2).getClass();
                        i3 = 4;
                        break;
                    case 7:
                        ((Boolean) obj2).getClass();
                        break;
                    case 8:
                        if (obj2 instanceof n51) {
                            size2 = ((n51) obj2).size();
                            h2 = xk2.h(size2);
                            i3 = h2 + size2;
                            break;
                        } else {
                            i3 = xk2.f((String) obj2);
                        }
                    case 9:
                        i3 = ((ju4) ((p3) obj2)).a(null);
                        break;
                    case 10:
                        size2 = ((ju4) ((p3) obj2)).a(null);
                        h2 = xk2.h(size2);
                        i3 = h2 + size2;
                        break;
                    case 11:
                        if (obj2 instanceof n51) {
                            size2 = ((n51) obj2).size();
                            h2 = xk2.h(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            h2 = xk2.h(size2);
                        }
                        i3 = h2 + size2;
                        break;
                    case 12:
                        i3 = xk2.h(((Integer) obj2).intValue());
                        break;
                    case 13:
                        i3 = xk2.i(((Integer) obj2).intValue());
                        break;
                    case 14:
                        ((Integer) obj2).getClass();
                        i3 = 4;
                        break;
                    case 15:
                        ((Long) obj2).getClass();
                        i3 = 8;
                        break;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i3 = xk2.h((intValue << 1) ^ (intValue >> 31));
                        break;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i3 = xk2.i((longValue << 1) ^ (longValue >> 63));
                        break;
                    default:
                        xi4.l("There is no way to get here, but the compiler thinks otherwise.");
                        break;
                }
            case 1:
                ((Float) obj).getClass();
                i = 4;
                int i42 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g22 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 2:
                i = xk2.i(((Long) obj).longValue());
                int i422 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 3:
                i = xk2.i(((Long) obj).longValue());
                int i4222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g2222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 4:
                i = xk2.i(((Integer) obj).intValue());
                int i42222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g22222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                i = 8;
                int i422222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                i = 4;
                int i4222222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g2222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                i = 1;
                int i42222222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g22222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 8:
                if (obj instanceof n51) {
                    size = ((n51) obj).size();
                    h = xk2.h(size);
                    i = size + h;
                    int i422222222 = i + g;
                    y2dVar = (y2d) pm3Var.c;
                    int g222222222 = xk2.g(2);
                    if (y2dVar == x2dVar) {
                    }
                    switch (y2dVar.ordinal()) {
                    }
                } else {
                    i = xk2.f((String) obj);
                    int i4222222222 = i + g;
                    y2dVar = (y2d) pm3Var.c;
                    int g2222222222 = xk2.g(2);
                    if (y2dVar == x2dVar) {
                    }
                    switch (y2dVar.ordinal()) {
                    }
                }
            case 9:
                i = ((ju4) ((p3) obj)).a(null);
                int i42222222222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g22222222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 10:
                size = ((ju4) ((p3) obj)).a(null);
                h = xk2.h(size);
                i = size + h;
                int i422222222222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g222222222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 11:
                if (obj instanceof n51) {
                    size = ((n51) obj).size();
                    h = xk2.h(size);
                } else {
                    size = ((byte[]) obj).length;
                    h = xk2.h(size);
                }
                i = size + h;
                int i4222222222222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g2222222222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 12:
                i = xk2.h(((Integer) obj).intValue());
                int i42222222222222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g22222222222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 13:
                i = xk2.i(((Integer) obj).intValue());
                int i422222222222222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g222222222222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                i = 4;
                int i4222222222222222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g2222222222222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                i = 8;
                int i42222222222222222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g22222222222222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                i = xk2.h((intValue2 << 1) ^ (intValue2 >> 31));
                int i422222222222222222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g222222222222222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                i = xk2.i((longValue2 << 1) ^ (longValue2 >> 63));
                int i4222222222222222222 = i + g;
                y2dVar = (y2d) pm3Var.c;
                int g2222222222222222222 = xk2.g(2);
                if (y2dVar == x2dVar) {
                }
                switch (y2dVar.ordinal()) {
                }
            default:
                xi4.l("There is no way to get here, but the compiler thinks otherwise.");
                break;
        }
        return 0;
    }
}
