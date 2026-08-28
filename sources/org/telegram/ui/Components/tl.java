package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class tl extends org.telegram.ui.rt0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int H() {
        return ChatAttachAlertPhotoLayout.o1.size();
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean N() {
        ki kiVar = this.a.b;
        return kiVar != null && kiVar.e0;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int R(int i9) {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        MediaController.PhotoEntry a02 = this.a.a0(i9);
        if (a02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.p1.indexOf(Integer.valueOf(a02.imageId));
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.p1;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int k(int i9, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        kl klVar = chatAttachAlertPhotoLayout.r;
        kl klVar2 = chatAttachAlertPhotoLayout.A;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (kiVar.O1 < 0 || ChatAttachAlertPhotoLayout.o1.size() < kiVar.O1 || x(i9)) {
            boolean z11 = ChatAttachAlertPhotoLayout.m1;
            MediaController.PhotoEntry a02 = chatAttachAlertPhotoLayout.a0(i9);
            if (a02 != null && !chatAttachAlertPhotoLayout.W(a02)) {
                if (ChatAttachAlertPhotoLayout.o1.size() + 1 <= ChatAttachAlertPhotoLayout.M(chatAttachAlertPhotoLayout)) {
                    int P = chatAttachAlertPhotoLayout.P(a02, -1);
                    if (P == -1) {
                        P = ChatAttachAlertPhotoLayout.p1.indexOf(Integer.valueOf(a02.imageId));
                        z10 = true;
                    } else {
                        a02.editedInfo = null;
                        z10 = false;
                    }
                    a02.editedInfo = videoEditedInfo;
                    int childCount = klVar2.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        }
                        View childAt = klVar2.getChildAt(i10);
                        if (!(childAt instanceof org.telegram.ui.Cells.t5) || ((Integer) childAt.getTag()).intValue() != i9) {
                            i10++;
                        } else if ((kiVar.b0 instanceof org.telegram.ui.qn) && kiVar.P1) {
                            ((org.telegram.ui.Cells.t5) childAt).b(P, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.t5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = klVar.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount2) {
                            break;
                        }
                        View childAt2 = klVar.getChildAt(i11);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.t5) || ((Integer) childAt2.getTag()).intValue() != i9) {
                            i11++;
                        } else if ((kiVar.b0 instanceof org.telegram.ui.qn) && kiVar.P1) {
                            ((org.telegram.ui.Cells.t5) childAt2).b(P, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.t5) childAt2).b(-1, z10, false);
                        }
                    }
                    kiVar.V1(z10 ? 1 : 2);
                    return P;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        this.a.u0();
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.o1;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean x(int i9) {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        MediaController.PhotoEntry a02 = this.a.a0(i9);
        return a02 != null && ChatAttachAlertPhotoLayout.o1.containsKey(Integer.valueOf(a02.imageId));
    }
}
