package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class hm extends org.telegram.ui.tu0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public hm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final int H() {
        return ChatAttachAlertPhotoLayout.s1.size();
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean N() {
        yi yiVar = this.a.b;
        return yiVar != null && yiVar.i0;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final int R(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        yl ylVar = chatAttachAlertPhotoLayout.r;
        yl ylVar2 = chatAttachAlertPhotoLayout.E;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (yiVar.S1 < 0 || ChatAttachAlertPhotoLayout.s1.size() < yiVar.S1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.q1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                if (ChatAttachAlertPhotoLayout.s1.size() + 1 <= ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(b02.imageId));
                        z10 = true;
                    } else {
                        b02.editedInfo = null;
                        z10 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = ylVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = ylVar2.getChildAt(i11);
                        if (!(childAt instanceof org.telegram.ui.Cells.t5) || ((Integer) childAt.getTag()).intValue() != i10) {
                            i11++;
                        } else if ((yiVar.f0 instanceof org.telegram.ui.eo) && yiVar.T1) {
                            ((org.telegram.ui.Cells.t5) childAt).b(Q, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.t5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = ylVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = ylVar.getChildAt(i12);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.t5) || ((Integer) childAt2.getTag()).intValue() != i10) {
                            i12++;
                        } else if ((yiVar.f0 instanceof org.telegram.ui.eo) && yiVar.T1) {
                            ((org.telegram.ui.Cells.t5) childAt2).b(Q, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.t5) childAt2).b(-1, z10, false);
                        }
                    }
                    yiVar.V1(z10 ? 1 : 2);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.a.v0();
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.s1;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        return b02 != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(b02.imageId));
    }
}
