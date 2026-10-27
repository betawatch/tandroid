package org.telegram.ui.Components;

import android.os.Process;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t51(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        gb1 gb1Var = null;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.vk) obj).c.presentFragment(new org.telegram.ui.a31());
                break;
            case 1:
                ((b61) obj).requestLayout();
                break;
            case 2:
                ((s61) obj).f();
                break;
            case 3:
                UndoView undoView = (UndoView) obj;
                int i11 = UndoView.i0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((v71) obj).invalidateSelf();
                break;
            case 5:
                e00 e00Var = ((i81) obj).b;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    break;
                }
                break;
            case 6:
                t81 t81Var = (t81) obj;
                i2.j0 j0Var = t81Var.d;
                if (j0Var != null) {
                    TextureView textureView = t81Var.n;
                    j0Var.F1();
                    if (textureView != null && textureView == j0Var.X) {
                        j0Var.F1();
                        j0Var.s1();
                        j0Var.x1(null);
                        j0Var.q1(0, 0);
                    }
                    t81Var.d.z1(t81Var.n);
                    ArrayList arrayList = t81Var.N;
                    if (arrayList != null) {
                        t81Var.F(arrayList, t81Var.O);
                    } else if (t81Var.U) {
                        t81Var.G(t81Var.Q, t81Var.S, t81Var.R, t81Var.T);
                    } else {
                        t81Var.D(t81Var.Q, t81Var.S);
                    }
                    t81Var.C();
                    break;
                }
                break;
            case 7:
                t81 t81Var2 = ((s81) obj).f;
                t81Var2.a0.removeCallbacksAndMessages(null);
                t81Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 8:
                ((v81) obj).g = false;
                break;
            case 9:
                ((na1) ((v50) ((org.telegram.ui.Cells.ha) obj).b).b).v.b();
                break;
            case 10:
                ((ja1) obj).d(false, true);
                break;
            case 11:
                gb1 gb1Var2 = (gb1) obj;
                gb1Var2.getClass();
                jb1.a(gb1Var2);
                break;
            case 12:
                ib1 ib1Var = (ib1) obj;
                int i12 = ib1Var.a;
                Iterator it = jb1.a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        gb1 gb1Var3 = (gb1) it.next();
                        if (gb1Var3.b == i12 && gb1Var3.l == ib1Var.b && !gb1Var3.k && gb1Var3.w > 0) {
                            gb1Var = gb1Var3;
                        }
                    }
                }
                if (gb1Var != null) {
                    TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData = new TLRPC.TL_messages_getWidgetPublicData();
                    tL_messages_getWidgetPublicData.peer = MessagesController.getInstance(gb1Var.b).getInputPeer(gb1Var.c);
                    tL_messages_getWidgetPublicData.msg_id = gb1Var.d;
                    tL_messages_getWidgetPublicData.hash = ib1Var.c;
                    ib1Var.e = ConnectionsManager.getInstance(i12).sendRequestTyped(tL_messages_getWidgetPublicData, new org.telegram.messenger.a(), new d(ib1Var, 23));
                    break;
                } else {
                    jb1.y();
                    break;
                }
            default:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                break;
        }
    }
}
