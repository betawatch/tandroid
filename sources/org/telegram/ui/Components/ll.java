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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ll extends tl {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z10;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.l0();
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.o1.size());
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void G() {
        kl klVar = this.c.A;
        int childCount = klVar.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = klVar.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (!chatAttachAlertPhotoLayout.b.R) {
            int i9 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.b || i9 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        this.c.j0();
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean g() {
        return this.c.b.O1 != 1;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final ImageReceiver.BitmapHolder j(int i9) {
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.l0;
        chatAttachAlertPhotoLayout.p0 = false;
        if (ChatAttachAlertPhotoLayout.m1) {
            ki kiVar = chatAttachAlertPhotoLayout.b;
            kiVar.V1.L(0, true, true, 0, 0, 0L, kiVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.U) {
            chatAttachAlertPhotoLayout.g0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.x0(false);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        ki kiVar = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.n1;
        if (arrayList.isEmpty() || kiVar.R) {
            return;
        }
        if (videoEditedInfo != null && i9 >= 0 && i9 < arrayList.size()) {
            ((MediaController.PhotoEntry) arrayList.get(i9)).editedInfo = videoEditedInfo;
        }
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        if (!(o2Var instanceof org.telegram.ui.qn) || !((org.telegram.ui.qn) o2Var).w()) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.n1.get(i12);
                if (photoEntry.ttl <= 0) {
                    AndroidUtilities.addMediaToGallery(photoEntry.path);
                }
            }
        }
        kiVar.Y0();
        PhotoViewer.t1();
        PhotoViewer.t1().K = false;
        PhotoViewer.t1().q2 = false;
        y4.a0(kiVar.F1, kiVar.j1() + ChatAttachAlertPhotoLayout.o1.size(), kiVar.n1(), new gl(this, z11, z10, i10));
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (chatAttachAlertPhotoLayout.U && chatAttachAlertPhotoLayout.L != null) {
            AndroidUtilities.runOnUIThread(new fg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.h0.b(0.0f, false);
            chatAttachAlertPhotoLayout.x0 = 0.0f;
            chatAttachAlertPhotoLayout.L.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.L.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.p0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.n1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.n1.get(i9);
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

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean z() {
        ki kiVar = this.c.b;
        return (kiVar.B || kiVar.D) ? false : true;
    }
}
