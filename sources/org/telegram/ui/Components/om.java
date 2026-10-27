package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class om extends org.telegram.ui.iu0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public om(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final int H() {
        return ChatAttachAlertPhotoLayout.s1.size();
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean O() {
        ti tiVar = this.a.b;
        return tiVar != null && tiVar.i0;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final int S(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry c02 = this.a.c0(i10);
        if (c02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(c02.imageId));
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        fm fmVar = chatAttachAlertPhotoLayout.r;
        fm fmVar2 = chatAttachAlertPhotoLayout.E;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (tiVar.V1 < 0 || ChatAttachAlertPhotoLayout.s1.size() < tiVar.V1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.q1;
            MediaController.PhotoEntry c02 = chatAttachAlertPhotoLayout.c0(i10);
            if (c02 != null && !chatAttachAlertPhotoLayout.Y(c02)) {
                if (ChatAttachAlertPhotoLayout.s1.size() + 1 <= ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                    int R = chatAttachAlertPhotoLayout.R(c02, -1);
                    if (R == -1) {
                        R = ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(c02.imageId));
                        z10 = true;
                    } else {
                        c02.editedInfo = null;
                        z10 = false;
                    }
                    c02.editedInfo = videoEditedInfo;
                    int childCount = fmVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = fmVar2.getChildAt(i11);
                        if (!(childAt instanceof org.telegram.ui.Cells.x5) || ((Integer) childAt.getTag()).intValue() != i10) {
                            i11++;
                        } else if ((tiVar.f0 instanceof org.telegram.ui.wn) && tiVar.W1) {
                            ((org.telegram.ui.Cells.x5) childAt).b(R, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.x5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = fmVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = fmVar.getChildAt(i12);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.x5) || ((Integer) childAt2.getTag()).intValue() != i10) {
                            i12++;
                        } else if ((tiVar.f0 instanceof org.telegram.ui.wn) && tiVar.W1) {
                            ((org.telegram.ui.Cells.x5) childAt2).b(R, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.x5) childAt2).b(-1, z10, false);
                        }
                    }
                    tiVar.d2(z10 ? 1 : 2);
                    return R;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.a.w0();
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.s1;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry c02 = this.a.c0(i10);
        return c02 != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(c02.imageId));
    }
}
