package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class w11 extends TextureView {
    public static Boolean f;
    public u11 a;
    public final o1.a b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public w11(Context context, Runnable runnable) {
        super(context);
        this.b = new o1.a(this, 1);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new ki.d(this, 3));
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
            v11 v11Var = (v11) arrayList.get(i11);
            if (v11Var.a == view) {
                Runnable runnable = v11Var.d;
                if (runnable != null) {
                    b(runnable);
                    v11Var.d = null;
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
        u11 u11Var = this.a;
        ArrayList arrayList2 = u11Var.W;
        if (u11Var.b.get()) {
            Handler handler = u11Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i10 < arrayList2.size()) {
                t11 t11Var = (t11) arrayList2.get(i10);
                if (t11Var.a.contains(view)) {
                    Runnable runnable2 = t11Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        t11Var.f = null;
                    }
                    arrayList2.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
    }
}
