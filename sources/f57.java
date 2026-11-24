// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ f57(na7 na7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object[] objArr = 0;
        ArrayList arrayList = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 1:
                gl.d3(new f57(na7Var, arrayList, (byte) 2));
                return;
            case 2:
                na7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 3:
                gl.d3(new f57(na7Var, arrayList, (byte) 4));
                return;
            case 4:
                na7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 5:
                break;
            case 6:
                na7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            default:
                gl.d3(new f57(na7Var, arrayList, objArr == true ? 1 : 0));
                return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            na7Var.e4(na7Var.h1(-((Long) arrayList.get(i)).longValue()), 0L);
        }
    }
}
