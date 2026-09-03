package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class a51 {
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

    public boolean d(t41 t41Var, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(t41 t41Var, k kVar, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z4);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.a = strArr;
    }

    public void f(TLRPC.Document document, Object obj, boolean z4, int i10) {
    }
}
