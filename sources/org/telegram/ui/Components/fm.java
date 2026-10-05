package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class fm extends org.telegram.ui.ou0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int H() {
        return ChatAttachAlertPhotoLayout.s1.size();
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean N() {
        xi xiVar = this.a.b;
        return xiVar != null && xiVar.i0;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int R(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        wl wlVar = chatAttachAlertPhotoLayout.r;
        wl wlVar2 = chatAttachAlertPhotoLayout.E;
        xi xiVar = chatAttachAlertPhotoLayout.b;
        if (xiVar.S1 < 0 || ChatAttachAlertPhotoLayout.s1.size() < xiVar.S1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.q1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.W(b02)) {
                if (ChatAttachAlertPhotoLayout.s1.size() + 1 <= ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout)) {
                    int O = chatAttachAlertPhotoLayout.O(b02, -1);
                    if (O == -1) {
                        O = ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(b02.imageId));
                        z10 = true;
                    } else {
                        b02.editedInfo = null;
                        z10 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = wlVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = wlVar2.getChildAt(i11);
                        if (!(childAt instanceof org.telegram.ui.Cells.t5) || ((Integer) childAt.getTag()).intValue() != i10) {
                            i11++;
                        } else if ((xiVar.f0 instanceof org.telegram.ui.yn) && xiVar.T1) {
                            ((org.telegram.ui.Cells.t5) childAt).b(O, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.t5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = wlVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = wlVar.getChildAt(i12);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.t5) || ((Integer) childAt2.getTag()).intValue() != i10) {
                            i12++;
                        } else if ((xiVar.f0 instanceof org.telegram.ui.yn) && xiVar.T1) {
                            ((org.telegram.ui.Cells.t5) childAt2).b(O, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.t5) childAt2).b(-1, z10, false);
                        }
                    }
                    xiVar.U1(z10 ? 1 : 2);
                    return O;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.a.v0();
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.s1;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = this.a.b0(i10);
        return b02 != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(b02.imageId));
    }
}
