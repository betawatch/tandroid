package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class zl extends org.telegram.ui.yt0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public zl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final int H() {
        return ChatAttachAlertPhotoLayout.p1.size();
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean N() {
        li liVar = this.a.b;
        return liVar != null && liVar.f0;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final int R(int i10) {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.q1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z4;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        pl plVar = chatAttachAlertPhotoLayout.r;
        pl plVar2 = chatAttachAlertPhotoLayout.B;
        li liVar = chatAttachAlertPhotoLayout.b;
        if (liVar.P1 < 0 || ChatAttachAlertPhotoLayout.p1.size() < liVar.P1 || x(i10)) {
            boolean z10 = ChatAttachAlertPhotoLayout.n1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                if (ChatAttachAlertPhotoLayout.p1.size() + 1 <= ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.q1.indexOf(Integer.valueOf(b02.imageId));
                        z4 = true;
                    } else {
                        b02.editedInfo = null;
                        z4 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = plVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = plVar2.getChildAt(i11);
                        if (!(childAt instanceof org.telegram.ui.Cells.t5) || ((Integer) childAt.getTag()).intValue() != i10) {
                            i11++;
                        } else if ((liVar.c0 instanceof org.telegram.ui.xn) && liVar.Q1) {
                            ((org.telegram.ui.Cells.t5) childAt).b(Q, z4, false);
                        } else {
                            ((org.telegram.ui.Cells.t5) childAt).b(-1, z4, false);
                        }
                    }
                    int childCount2 = plVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = plVar.getChildAt(i12);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.t5) || ((Integer) childAt2.getTag()).intValue() != i10) {
                            i12++;
                        } else if ((liVar.c0 instanceof org.telegram.ui.xn) && liVar.Q1) {
                            ((org.telegram.ui.Cells.t5) childAt2).b(Q, z4, false);
                        } else {
                            ((org.telegram.ui.Cells.t5) childAt2).b(-1, z4, false);
                        }
                    }
                    liVar.V1(z4 ? 1 : 2);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void m() {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
        this.a.v0();
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.p1;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean x(int i10) {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        return b02 != null && ChatAttachAlertPhotoLayout.p1.containsKey(Integer.valueOf(b02.imageId));
    }
}
