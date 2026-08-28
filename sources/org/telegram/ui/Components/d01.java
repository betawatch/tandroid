package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d01 extends TextureView {
    public static Boolean f;
    public b01 a;
    public final o1.a b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public d01(Context context, Runnable runnable) {
        super(context);
        this.b = new o1.a(this, 1);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new dh.i(this, 3));
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            AndroidUtilities.runOnUIThread(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean c() {
        if (f == null) {
            f = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = f;
        return bool == null || !bool.booleanValue();
    }

    public final void a(View view) {
        int i9 = 0;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            c01 c01Var = (c01) arrayList.get(i10);
            if (c01Var.a == view) {
                Runnable runnable = c01Var.d;
                if (runnable != null) {
                    b(runnable);
                    c01Var.d = null;
                }
                arrayList.remove(i10);
                i10--;
                z10 = true;
            }
            i10++;
        }
        if (z10) {
            return;
        }
        b01 b01Var = this.a;
        ArrayList arrayList2 = b01Var.S;
        if (b01Var.b.get()) {
            Handler handler = b01Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i9 < arrayList2.size()) {
                a01 a01Var = (a01) arrayList2.get(i9);
                if (a01Var.a.contains(view)) {
                    Runnable runnable2 = a01Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        a01Var.f = null;
                    }
                    arrayList2.remove(i9);
                    i9--;
                }
                i9++;
            }
        }
    }
}
