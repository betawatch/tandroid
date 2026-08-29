package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class xl extends org.telegram.ui.pt0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int H() {
        return ChatAttachAlertPhotoLayout.o1.size();
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean N() {
        ni niVar = this.a.b;
        return niVar != null && niVar.e0;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int R(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.p1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.p1;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        ol olVar = chatAttachAlertPhotoLayout.r;
        ol olVar2 = chatAttachAlertPhotoLayout.A;
        ni niVar = chatAttachAlertPhotoLayout.b;
        if (niVar.O1 < 0 || ChatAttachAlertPhotoLayout.o1.size() < niVar.O1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.m1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                if (ChatAttachAlertPhotoLayout.o1.size() + 1 <= ChatAttachAlertPhotoLayout.M(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.p1.indexOf(Integer.valueOf(b02.imageId));
                        z10 = true;
                    } else {
                        b02.editedInfo = null;
                        z10 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = olVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = olVar2.getChildAt(i11);
                        if (!(childAt instanceof org.telegram.ui.Cells.r5) || ((Integer) childAt.getTag()).intValue() != i10) {
                            i11++;
                        } else if ((niVar.b0 instanceof org.telegram.ui.tn) && niVar.P1) {
                            ((org.telegram.ui.Cells.r5) childAt).b(Q, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.r5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = olVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = olVar.getChildAt(i12);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.r5) || ((Integer) childAt2.getTag()).intValue() != i10) {
                            i12++;
                        } else if ((niVar.b0 instanceof org.telegram.ui.tn) && niVar.P1) {
                            ((org.telegram.ui.Cells.r5) childAt2).b(Q, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.r5) childAt2).b(-1, z10, false);
                        }
                    }
                    niVar.V1(z10 ? 1 : 2);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        this.a.v0();
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.o1;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        return b02 != null && ChatAttachAlertPhotoLayout.o1.containsKey(Integer.valueOf(b02.imageId));
    }
}
