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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hl extends pl {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z10;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.C(ChatAttachAlertPhotoLayout.o1.size());
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void G() {
        gl glVar = this.c.A;
        int childCount = glVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = glVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                q5Var.a.getImageReceiver().setVisible(true, true);
                q5Var.g(true);
            }
        }
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
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

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        this.c.k0();
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean g() {
        return this.c.b.O1 != 1;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.l0;
        chatAttachAlertPhotoLayout.p0 = false;
        if (ChatAttachAlertPhotoLayout.m1) {
            gi giVar = chatAttachAlertPhotoLayout.b;
            giVar.V1.n0(0, true, true, 0, 0, 0L, giVar.s1(), false, 0L);
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

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        gi giVar = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.n1;
        if (arrayList.isEmpty() || giVar.R) {
            return;
        }
        if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
            ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
        }
        org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
        if (!(n2Var instanceof org.telegram.ui.rn) || !((org.telegram.ui.rn) n2Var).x()) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.n1.get(i13);
                if (photoEntry.ttl <= 0) {
                    AndroidUtilities.addMediaToGallery(photoEntry.path);
                }
            }
        }
        giVar.Y0();
        PhotoViewer.t1();
        PhotoViewer.t1().K = false;
        PhotoViewer.t1().q2 = false;
        y4.a0(giVar.F1, giVar.j1() + ChatAttachAlertPhotoLayout.o1.size(), giVar.n1(), new cl(this, z11, z10, i11));
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (chatAttachAlertPhotoLayout.U && chatAttachAlertPhotoLayout.L != null) {
            AndroidUtilities.runOnUIThread(new bg(this, 24), 1000L);
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

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean z() {
        gi giVar = this.c.b;
        return (giVar.B || giVar.D) ? false : true;
    }
}
