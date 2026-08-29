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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sl extends xl {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean A() {
        ni niVar = this.b.b;
        return niVar != null && niVar.Y;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new ig(this, 23), 150L);
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.o1.size());
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final org.telegram.ui.zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        jt jtVar;
        org.telegram.ui.zt0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ni niVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (jtVar = niVar.N0) != null && (closeIntoObject = ((r40) jtVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.r5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i10);
        if (K == null) {
            return null;
        }
        int[] iArr = new int[2];
        K.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - niVar.getLeftInset();
        }
        org.telegram.ui.zt0 zt0Var = new org.telegram.ui.zt0();
        zt0Var.b = iArr[0];
        zt0Var.c = iArr[1];
        zt0Var.d = chatAttachAlertPhotoLayout.A;
        ImageReceiver imageReceiver = K.getImageView().getImageReceiver();
        zt0Var.a = imageReceiver;
        zt0Var.e = imageReceiver.getBitmapSafe();
        zt0Var.k = K.getScale();
        zt0Var.i = (int) niVar.l1();
        K.g(false);
        return zt0Var;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ni niVar = chatAttachAlertPhotoLayout.b;
        if (niVar == null || niVar.Y == z10) {
            return;
        }
        niVar.H1(z10, true);
        chatAttachAlertPhotoLayout.Z0.a(!chatAttachAlertPhotoLayout.b.Y, true);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void G() {
        ol olVar = this.b.A;
        int childCount = olVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = olVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                ((org.telegram.ui.Cells.r5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.r5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i10);
        if (K != null) {
            K.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 == null) {
                return;
            }
            if (b02.coverPath != null) {
                K.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            if (b02.thumbPath != null) {
                K.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            if (b02.path == null) {
                K.getImageView().setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            K.getImageView().p(b02.orientation, b02.invert, true);
            if (b02.isVideo) {
                K.getImageView().f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            K.getImageView().f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.g6.R4);
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void Z(int i10) {
        org.telegram.ui.Cells.r5 K = ChatAttachAlertPhotoLayout.K(this.b, i10);
        if (K != null) {
            K.g(true);
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final long a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b.b.b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            return ((org.telegram.ui.tn) o2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
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
                this.b.b.m1().setText(y5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.r5 K = ChatAttachAlertPhotoLayout.K(this.b, i10);
        if (K != null) {
            return K.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean l() {
        ni niVar = this.b.b;
        return niVar != null && (niVar.b0 instanceof org.telegram.ui.tn);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ni niVar = chatAttachAlertPhotoLayout.b;
        niVar.o2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.m1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (niVar.b1(niVar.m1().getText())) {
            return;
        }
        niVar.Y0();
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
                            if (niVar.b1(charSequence)) {
                                return;
                            }
                        } else {
                            photoEntry.caption = null;
                        }
                    }
                }
            }
        }
        if (niVar != null) {
            niVar.E1 = false;
        }
        PhotoViewer.t1();
        PhotoViewer.t1().K = false;
        PhotoViewer.t1().q2 = false;
        c5.a0(niVar.F1, niVar.j1() + ChatAttachAlertPhotoLayout.o1.size(), niVar.n1(), new kl(this, z10, i11, z11));
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean q() {
        ni niVar = this.b.b;
        return (niVar == null || niVar.D1 == null) ? false : true;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        this.b.p0(-1, false);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean w() {
        MessageObject messageObject;
        ni niVar = this.b.b;
        return (niVar == null || (messageObject = niVar.D1) == null || !messageObject.needResendWhenEdit()) ? false : true;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean z() {
        ni niVar = this.b.b;
        return (niVar.B || niVar.D) ? false : true;
    }
}
