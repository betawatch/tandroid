package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mf mfVar;
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z10 = this.c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.t1.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.r5;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z10) {
                    chatActivityEnterView.u1.setVisibility(8);
                    break;
                } else {
                    int i12 = ChatActivityEnterView.r5;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                sd sdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView2.Q0(0, false, 0, true, 0L);
                if (!z10 && (mfVar = chatActivityEnterView2.L0) != null) {
                    mfVar.g(!Q0);
                    chatActivityEnterView2.L0 = null;
                    break;
                } else {
                    chatActivityEnterView2.E4 = !Q0;
                    AndroidUtilities.cancelRunOnUIThread(sdVar);
                    AndroidUtilities.runOnUIThread(sdVar, 500L);
                    break;
                }
        }
    }
}
