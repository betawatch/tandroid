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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kl extends pl {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean A() {
        gi giVar = this.b.b;
        return giVar != null && giVar.Y;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new bg(this, 23), 150L);
        chatAttachAlertPhotoLayout.C(ChatAttachAlertPhotoLayout.o1.size());
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final org.telegram.ui.cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        bt btVar;
        org.telegram.ui.cu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        gi giVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (btVar = giVar.N0) != null && (closeIntoObject = ((i40) btVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.q5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (L == null) {
            return null;
        }
        int[] iArr = new int[2];
        L.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - giVar.getLeftInset();
        }
        org.telegram.ui.cu0 cu0Var = new org.telegram.ui.cu0();
        cu0Var.b = iArr[0];
        cu0Var.c = iArr[1];
        cu0Var.d = chatAttachAlertPhotoLayout.A;
        ImageReceiver imageReceiver = L.getImageView().getImageReceiver();
        cu0Var.a = imageReceiver;
        cu0Var.e = imageReceiver.getBitmapSafe();
        cu0Var.k = L.getScale();
        cu0Var.i = (int) giVar.l1();
        L.g(false);
        return cu0Var;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        gi giVar = chatAttachAlertPhotoLayout.b;
        if (giVar == null || giVar.Y == z10) {
            return;
        }
        giVar.H1(z10, true);
        chatAttachAlertPhotoLayout.Z0.a(!chatAttachAlertPhotoLayout.b.Y, true);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void G() {
        gl glVar = this.b.A;
        int childCount = glVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = glVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.q5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (L != null) {
            L.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 == null) {
                return;
            }
            if (b02.coverPath != null) {
                L.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            if (b02.thumbPath != null) {
                L.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            if (b02.path == null) {
                L.getImageView().setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            L.getImageView().p(b02.orientation, b02.invert, true);
            if (b02.isVideo) {
                L.getImageView().f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            L.getImageView().f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.g6.R4);
        }
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void Z(int i10) {
        org.telegram.ui.Cells.q5 L = ChatAttachAlertPhotoLayout.L(this.b, i10);
        if (L != null) {
            L.g(true);
        }
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.b.b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            return ((org.telegram.ui.rn) n2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.p1;
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
                this.b.b.m1().setText(t5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.q5 L = ChatAttachAlertPhotoLayout.L(this.b, i10);
        if (L != null) {
            return L.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean l() {
        gi giVar = this.b.b;
        return giVar != null && (giVar.b0 instanceof org.telegram.ui.rn);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        gi giVar = chatAttachAlertPhotoLayout.b;
        giVar.o2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.m1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (giVar.b1(giVar.m1().getText())) {
            return;
        }
        giVar.Y0();
        if (PhotoViewer.t1().l7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.p1;
            if (!hashMap.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Object obj = hashMap.get(arrayList.get(i13));
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (i13 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.t1().m7};
                            photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                            CharSequence charSequence = charSequenceArr[0];
                            photoEntry.caption = charSequence;
                            if (giVar.b1(charSequence)) {
                                return;
                            }
                        } else {
                            photoEntry.caption = null;
                        }
                    }
                }
            }
        }
        if (giVar != null) {
            giVar.E1 = false;
        }
        PhotoViewer.t1();
        PhotoViewer.t1().K = false;
        PhotoViewer.t1().q2 = false;
        y4.a0(giVar.F1, giVar.j1() + ChatAttachAlertPhotoLayout.o1.size(), giVar.n1(), new cl(this, z10, i11, z11));
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean q() {
        gi giVar = this.b.b;
        return (giVar == null || giVar.D1 == null) ? false : true;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        this.b.p0(-1, false);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean w() {
        MessageObject messageObject;
        gi giVar = this.b.b;
        return (giVar == null || (messageObject = giVar.D1) == null || !messageObject.needResendWhenEdit()) ? false : true;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean z() {
        gi giVar = this.b.b;
        return (giVar.B || giVar.D) ? false : true;
    }
}
