package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class pm extends org.telegram.ui.zu0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public pm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final int H() {
        return ChatAttachAlertPhotoLayout.s1.size();
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean O() {
        vi viVar = this.a.b;
        return viVar != null && viVar.i0;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final int S(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        gm gmVar = chatAttachAlertPhotoLayout.r;
        gm gmVar2 = chatAttachAlertPhotoLayout.E;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (viVar.V1 < 0 || ChatAttachAlertPhotoLayout.s1.size() < viVar.V1 || x(i10)) {
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
                    int childCount = gmVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = gmVar2.getChildAt(i11);
                        if (!(childAt instanceof org.telegram.ui.Cells.t5) || ((Integer) childAt.getTag()).intValue() != i10) {
                            i11++;
                        } else if ((viVar.f0 instanceof org.telegram.ui.fo) && viVar.W1) {
                            ((org.telegram.ui.Cells.t5) childAt).b(Q, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.t5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = gmVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = gmVar.getChildAt(i12);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.t5) || ((Integer) childAt2.getTag()).intValue() != i10) {
                            i12++;
                        } else if ((viVar.f0 instanceof org.telegram.ui.fo) && viVar.W1) {
                            ((org.telegram.ui.Cells.t5) childAt2).b(Q, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.t5) childAt2).b(-1, z10, false);
                        }
                    }
                    viVar.Z1(z10 ? 1 : 2);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.a.v0();
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.s1;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        return b02 != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(b02.imageId));
    }
}
