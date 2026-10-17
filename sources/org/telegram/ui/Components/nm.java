package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class nm extends org.telegram.ui.bu0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public nm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final int H() {
        return ChatAttachAlertPhotoLayout.s1.size();
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean O() {
        ti tiVar = this.a.b;
        return tiVar != null && tiVar.i0;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final int S(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        em emVar = chatAttachAlertPhotoLayout.r;
        em emVar2 = chatAttachAlertPhotoLayout.E;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (tiVar.V1 < 0 || ChatAttachAlertPhotoLayout.s1.size() < tiVar.V1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.q1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                if (ChatAttachAlertPhotoLayout.s1.size() + 1 <= ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(b02.imageId));
                        z10 = true;
                    } else {
                        b02.editedInfo = null;
                        z10 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = emVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = emVar2.getChildAt(i11);
                        if (!(childAt instanceof org.telegram.ui.Cells.s5) || ((Integer) childAt.getTag()).intValue() != i10) {
                            i11++;
                        } else if ((tiVar.f0 instanceof org.telegram.ui.sn) && tiVar.W1) {
                            ((org.telegram.ui.Cells.s5) childAt).b(Q, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.s5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = emVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = emVar.getChildAt(i12);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.s5) || ((Integer) childAt2.getTag()).intValue() != i10) {
                            i12++;
                        } else if ((tiVar.f0 instanceof org.telegram.ui.sn) && tiVar.W1) {
                            ((org.telegram.ui.Cells.s5) childAt2).b(Q, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.s5) childAt2).b(-1, z10, false);
                        }
                    }
                    tiVar.Z1(z10 ? 1 : 2);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.a.v0();
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.s1;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        return b02 != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(b02.imageId));
    }
}
