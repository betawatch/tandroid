package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class p31 {
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

    public boolean d(i31 i31Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(i31 i31Var, k kVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z9, int i7) {
    }
}
