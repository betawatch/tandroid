// default package

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class a2c {
    public String[] a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(t1c t1cVar, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(t1c t1cVar, f09 f09Var, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.a = strArr;
    }

    public void f(int i, Object obj, TLRPC.Document document, boolean z) {
    }
}
