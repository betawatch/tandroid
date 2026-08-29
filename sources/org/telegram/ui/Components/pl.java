package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pl extends xl {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z10;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.o1.size());
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void G() {
        ol olVar = this.c.A;
        int childCount = olVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = olVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                r5Var.a.getImageReceiver().setVisible(true, true);
                r5Var.g(true);
            }
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (!chatAttachAlertPhotoLayout.b.R) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.b || i10 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        this.c.k0();
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean g() {
        return this.c.b.O1 != 1;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.l0;
        chatAttachAlertPhotoLayout.p0 = false;
        if (ChatAttachAlertPhotoLayout.m1) {
            ni niVar = chatAttachAlertPhotoLayout.b;
            niVar.V1.B1(0, true, true, 0, 0, 0L, niVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.U) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ni niVar = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.n1;
        if (arrayList.isEmpty() || niVar.R) {
            return;
        }
        if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
            ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
        }
        org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
        if (!(o2Var instanceof org.telegram.ui.tn) || !((org.telegram.ui.tn) o2Var).w()) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.n1.get(i13);
                if (photoEntry.ttl <= 0) {
                    AndroidUtilities.addMediaToGallery(photoEntry.path);
                }
            }
        }
        niVar.Y0();
        PhotoViewer.t1();
        PhotoViewer.t1().K = false;
        PhotoViewer.t1().q2 = false;
        c5.a0(niVar.F1, niVar.j1() + ChatAttachAlertPhotoLayout.o1.size(), niVar.n1(), new kl(this, z11, z10, i11));
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (chatAttachAlertPhotoLayout.U && chatAttachAlertPhotoLayout.L != null) {
            AndroidUtilities.runOnUIThread(new ig(this, 24), 1000L);
            chatAttachAlertPhotoLayout.h0.b(0.0f, false);
            chatAttachAlertPhotoLayout.x0 = 0.0f;
            chatAttachAlertPhotoLayout.L.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.L.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.p0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.n1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.n1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.n1.clear();
                ChatAttachAlertPhotoLayout.p1.clear();
                ChatAttachAlertPhotoLayout.o1.clear();
                chatAttachAlertPhotoLayout.l0.setVisibility(4);
                chatAttachAlertPhotoLayout.r.setVisibility(8);
                chatAttachAlertPhotoLayout.C.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.b.V1(0);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean z() {
        ni niVar = this.c.b;
        return (niVar.B || niVar.D) ? false : true;
    }
}
