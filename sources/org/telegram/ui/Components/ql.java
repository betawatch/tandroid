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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ql extends zl {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z4) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z4;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void D() {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.p1.size());
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void G() {
        pl plVar = this.c.B;
        int childCount = plVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = plVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (!chatAttachAlertPhotoLayout.b.S) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.b || i10 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void d() {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
        this.c.k0();
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean g() {
        return this.c.b.P1 != 1;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void i() {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.m0;
        chatAttachAlertPhotoLayout.q0 = false;
        if (ChatAttachAlertPhotoLayout.n1) {
            li liVar = chatAttachAlertPhotoLayout.b;
            liVar.W1.H(0, true, true, 0, 0, 0L, liVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.V) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        li liVar = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.o1;
        if (arrayList.isEmpty() || liVar.S) {
            return;
        }
        if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
            ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
        }
        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
        if (!(p2Var instanceof org.telegram.ui.xn) || !((org.telegram.ui.xn) p2Var).v()) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.o1.get(i13);
                if (photoEntry.ttl <= 0) {
                    AndroidUtilities.addMediaToGallery(photoEntry.path);
                }
            }
        }
        liVar.Y0();
        PhotoViewer.t1();
        PhotoViewer.t1().L = false;
        PhotoViewer.t1().r2 = false;
        z4.a0(liVar.G1, liVar.j1() + ChatAttachAlertPhotoLayout.p1.size(), liVar.n1(), new kl(this, z10, z4, i11));
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (chatAttachAlertPhotoLayout.V && chatAttachAlertPhotoLayout.M != null) {
            AndroidUtilities.runOnUIThread(new fg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.i0.b(0.0f, false);
            chatAttachAlertPhotoLayout.y0 = 0.0f;
            chatAttachAlertPhotoLayout.M.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.M.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.q0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.o1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.o1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.o1.clear();
                ChatAttachAlertPhotoLayout.q1.clear();
                ChatAttachAlertPhotoLayout.p1.clear();
                chatAttachAlertPhotoLayout.m0.setVisibility(4);
                chatAttachAlertPhotoLayout.r.setVisibility(8);
                chatAttachAlertPhotoLayout.D.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.b.V1(0);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean z() {
        li liVar = this.c.b;
        return (liVar.C || liVar.E) ? false : true;
    }
}
