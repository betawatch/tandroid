package org.telegram.ui.Components;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vl extends am {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean A() {
        mi miVar = this.b.b;
        return miVar != null && miVar.Z;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void D() {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new fg(this, 23), 150L);
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.p1.size());
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ot otVar;
        org.telegram.ui.qu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        mi miVar = chatAttachAlertPhotoLayout.b;
        if (z10 && (otVar = miVar.O0) != null && (closeIntoObject = ((x40) otVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i10);
        if (K == null) {
            return null;
        }
        int[] iArr = new int[2];
        K.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - miVar.getLeftInset();
        }
        org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = chatAttachAlertPhotoLayout.B;
        ImageReceiver imageReceiver = K.getImageView().getImageReceiver();
        qu0Var.a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        qu0Var.k = K.getScale();
        qu0Var.i = (int) miVar.l1();
        K.g(false);
        return qu0Var;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void F(boolean z4) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        mi miVar = chatAttachAlertPhotoLayout.b;
        if (miVar == null || miVar.Z == z4) {
            return;
        }
        miVar.H1(z4, true);
        chatAttachAlertPhotoLayout.a1.a(!chatAttachAlertPhotoLayout.b.Z, true);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void G() {
        ql qlVar = this.b.B;
        int childCount = qlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qlVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i10);
        if (K != null) {
            K.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 == null) {
                return;
            }
            if (b02.coverPath != null) {
                K.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            if (b02.thumbPath != null) {
                K.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            if (b02.path == null) {
                K.getImageView().setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            K.getImageView().p(b02.orientation, b02.invert, true);
            if (b02.isVideo) {
                K.getImageView().f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            K.getImageView().f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.k6.R4);
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void Z(int i10) {
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(this.b, i10);
        if (K != null) {
            K.g(true);
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final long a() {
        org.telegram.ui.ActionBar.p2 p2Var = this.b.b.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) p2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void d() {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        HashMap hashMap = ChatAttachAlertPhotoLayout.p1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.q1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    charSequence2 = photoEntry.caption;
                    arrayList = photoEntry.entities;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    charSequence2 = searchImage.caption;
                    arrayList = searchImage.entities;
                }
                ArrayList<TLRPC.MessageEntity> arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    CharSequence spannableStringBuilder = !(charSequence2 instanceof Spannable) ? new SpannableStringBuilder(charSequence2) : charSequence2;
                    MessageObject.addEntitiesToText(spannableStringBuilder, arrayList3, false, false, false, false);
                    charSequence2 = spannableStringBuilder;
                }
                this.b.b.m1().setText(u5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void i() {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(this.b, i10);
        if (K != null) {
            return K.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean l() {
        mi miVar = this.b.b;
        return miVar != null && (miVar.c0 instanceof org.telegram.ui.xn);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        mi miVar = chatAttachAlertPhotoLayout.b;
        miVar.p2 = true;
        boolean z11 = ChatAttachAlertPhotoLayout.n1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.p1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (miVar.b1(miVar.m1().getText())) {
            return;
        }
        miVar.Y0();
        if (PhotoViewer.t1().m7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.q1;
            if (!hashMap.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Object obj = hashMap.get(arrayList.get(i13));
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (i13 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.t1().n7};
                            photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                            CharSequence charSequence = charSequenceArr[0];
                            photoEntry.caption = charSequence;
                            if (miVar.b1(charSequence)) {
                                return;
                            }
                        } else {
                            photoEntry.caption = null;
                        }
                    }
                }
            }
        }
        if (miVar != null) {
            miVar.F1 = false;
        }
        PhotoViewer.t1();
        PhotoViewer.t1().L = false;
        PhotoViewer.t1().r2 = false;
        z4.a0(miVar.G1, miVar.j1() + ChatAttachAlertPhotoLayout.p1.size(), miVar.n1(), new ll(this, z4, i11, z10));
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean q() {
        mi miVar = this.b.b;
        return (miVar == null || miVar.E1 == null) ? false : true;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void s() {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
        this.b.p0(-1, false);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean w() {
        MessageObject messageObject;
        mi miVar = this.b.b;
        return (miVar == null || (messageObject = miVar.E1) == null || !messageObject.needResendWhenEdit()) ? false : true;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean z() {
        mi miVar = this.b.b;
        return (miVar.C || miVar.E) ? false : true;
    }
}
