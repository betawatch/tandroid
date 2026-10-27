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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gm extends om {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z10;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.s1.size());
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void G() {
        fm fmVar = this.c.E;
        int childCount = fmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.x5) {
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                x5Var.a.getImageReceiver().setVisible(true, true);
                x5Var.g(true);
            }
        }
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (!chatAttachAlertPhotoLayout.b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.b || i10 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.c.l0();
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean g() {
        return this.c.b.V1 != 1;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        chatAttachAlertPhotoLayout.t0 = false;
        if (ChatAttachAlertPhotoLayout.q1) {
            ti tiVar = chatAttachAlertPhotoLayout.b;
            tiVar.c2.p0(0, true, true, 0, 0, 0L, tiVar.x1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.b0) {
            chatAttachAlertPhotoLayout.i0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.z0(false);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ti tiVar = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.r1;
        if (arrayList.isEmpty() || tiVar.V) {
            return;
        }
        if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
            ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
        }
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        if (!(r2Var instanceof org.telegram.ui.wn) || !((org.telegram.ui.wn) r2Var).w()) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.r1.get(i13);
                if (photoEntry.ttl <= 0) {
                    AndroidUtilities.addMediaToGallery(photoEntry.path);
                }
            }
        }
        tiVar.e1();
        PhotoViewer.v1();
        PhotoViewer.v1().O = false;
        PhotoViewer.v1().u2 = false;
        g5.Z(tiVar.M1, tiVar.p1() + ChatAttachAlertPhotoLayout.s1.size(), tiVar.t1(), new bm(this, z11, z10, i11));
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (chatAttachAlertPhotoLayout.b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new pg(this, 26), 1000L);
            chatAttachAlertPhotoLayout.l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                chatAttachAlertPhotoLayout.p0.setVisibility(4);
                chatAttachAlertPhotoLayout.r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.b.d2(0);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean z() {
        ti tiVar = this.c.b;
        return (tiVar.F || tiVar.H) ? false : true;
    }
}
