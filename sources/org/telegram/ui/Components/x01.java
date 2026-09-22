package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class x01 extends TextureView {
    public static Boolean f;
    public v01 a;
    public final o1.a b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public x01(Context context, Runnable runnable) {
        super(context);
        this.b = new o1.a(this, 1);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new j50(this, 2));
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
            w01 w01Var = (w01) arrayList.get(i11);
            if (w01Var.a == view) {
                Runnable runnable = w01Var.d;
                if (runnable != null) {
                    b(runnable);
                    w01Var.d = null;
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
        v01 v01Var = this.a;
        ArrayList arrayList2 = v01Var.W;
        if (v01Var.b.get()) {
            Handler handler = v01Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i10 < arrayList2.size()) {
                u01 u01Var = (u01) arrayList2.get(i10);
                if (u01Var.a.contains(view)) {
                    Runnable runnable2 = u01Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        u01Var.f = null;
                    }
                    arrayList2.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
    }
}
