package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class cm extends org.telegram.ui.su0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int H() {
        return ChatAttachAlertPhotoLayout.s1.size();
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean N() {
        vi viVar = this.a.b;
        return viVar != null && viVar.i0;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int R(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        tl tlVar = chatAttachAlertPhotoLayout.r;
        tl tlVar2 = chatAttachAlertPhotoLayout.E;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (viVar.S1 < 0 || ChatAttachAlertPhotoLayout.s1.size() < viVar.S1 || x(i10)) {
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
                    int childCount = tlVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = tlVar2.getChildAt(i11);
                        if (!(childAt instanceof org.telegram.ui.Cells.s5) || ((Integer) childAt.getTag()).intValue() != i10) {
                            i11++;
                        } else if ((viVar.f0 instanceof org.telegram.ui.co) && viVar.T1) {
                            ((org.telegram.ui.Cells.s5) childAt).b(Q, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.s5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = tlVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = tlVar.getChildAt(i12);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.s5) || ((Integer) childAt2.getTag()).intValue() != i10) {
                            i12++;
                        } else if ((viVar.f0 instanceof org.telegram.ui.co) && viVar.T1) {
                            ((org.telegram.ui.Cells.s5) childAt2).b(Q, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.s5) childAt2).b(-1, z10, false);
                        }
                    }
                    viVar.V1(z10 ? 1 : 2);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.a.v0();
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.s1;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        return b02 != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(b02.imageId));
    }
}
