package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p01 extends TextureView {
    public static Boolean f;
    public n01 a;
    public final o1.b b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public p01(Context context, Runnable runnable) {
        super(context);
        this.b = new o1.b(this, 1);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new gh.h(this, 3));
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
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i11 >= arrayList.size()) {
                break;
            }
            o01 o01Var = (o01) arrayList.get(i11);
            if (o01Var.a == view) {
                Runnable runnable = o01Var.d;
                if (runnable != null) {
                    b(runnable);
                    o01Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (z10) {
            return;
        }
        n01 n01Var = this.a;
        ArrayList arrayList2 = n01Var.S;
        if (n01Var.b.get()) {
            Handler handler = n01Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i10 < arrayList2.size()) {
                m01 m01Var = (m01) arrayList2.get(i10);
                if (m01Var.a.contains(view)) {
                    Runnable runnable2 = m01Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        m01Var.f = null;
                    }
                    arrayList2.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
    }
}
