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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class cm extends hm {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean A() {
        yi yiVar = this.b.b;
        return yiVar != null && yiVar.c0;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new rg(this, 23), 150L);
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.s1.size());
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ut utVar;
        org.telegram.ui.ev0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (utVar = yiVar.R0) != null && (closeIntoObject = ((d50) utVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (L == null) {
            return null;
        }
        int[] iArr = new int[2];
        L.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - yiVar.getLeftInset();
        }
        org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
        ev0Var.b = iArr[0];
        ev0Var.c = iArr[1];
        ev0Var.d = chatAttachAlertPhotoLayout.E;
        ImageReceiver imageReceiver = L.getImageView().getImageReceiver();
        ev0Var.a = imageReceiver;
        ev0Var.e = imageReceiver.getBitmapSafe();
        ev0Var.k = L.getScale();
        ev0Var.i = (int) yiVar.l1();
        L.g(false);
        return ev0Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (yiVar == null || yiVar.c0 == z10) {
            return;
        }
        yiVar.H1(z10, true);
        chatAttachAlertPhotoLayout.d1.a(!chatAttachAlertPhotoLayout.b.c0, true);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void G() {
        yl ylVar = this.b.E;
        int childCount = ylVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ylVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (L != null) {
            L.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 == null) {
                return;
            }
            if (b02.coverPath != null) {
                L.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            if (b02.thumbPath != null) {
                L.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            if (b02.path == null) {
                L.getImageView().setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            L.getImageView().p(b02.orientation, b02.invert, true);
            if (b02.isVideo) {
                L.getImageView().f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            L.getImageView().f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.j6.R4);
        }
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void Z(int i10) {
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(this.b, i10);
        if (L != null) {
            L.g(true);
        }
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final long a() {
        org.telegram.ui.ActionBar.p2 p2Var = this.b.b.f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            return ((org.telegram.ui.eo) p2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(this.b, i10);
        if (L != null) {
            return L.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean l() {
        yi yiVar = this.b.b;
        return yiVar != null && (yiVar.f0 instanceof org.telegram.ui.eo);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        yiVar.s2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (yiVar.b1(yiVar.m1().getText())) {
            return;
        }
        yiVar.Y0();
        if (PhotoViewer.t1().p7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
            if (!hashMap.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Object obj = hashMap.get(arrayList.get(i13));
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (i13 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.t1().q7};
                            photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                            CharSequence charSequence = charSequenceArr[0];
                            photoEntry.caption = charSequence;
                            if (yiVar.b1(charSequence)) {
                                return;
                            }
                        } else {
                            photoEntry.caption = null;
                        }
                    }
                }
            }
        }
        if (yiVar != null) {
            yiVar.I1 = false;
        }
        PhotoViewer.t1();
        PhotoViewer.t1().O = false;
        PhotoViewer.t1().u2 = false;
        d5.a0(yiVar.J1, yiVar.j1() + ChatAttachAlertPhotoLayout.s1.size(), yiVar.n1(), new ul(this, z10, i11, z11));
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean q() {
        yi yiVar = this.b.b;
        return (yiVar == null || yiVar.H1 == null) ? false : true;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.b.p0(-1, false);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean w() {
        MessageObject messageObject;
        yi yiVar = this.b.b;
        return (yiVar == null || (messageObject = yiVar.H1) == null || !messageObject.needResendWhenEdit()) ? false : true;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean z() {
        yi yiVar = this.b.b;
        return (yiVar.F || yiVar.H) ? false : true;
    }
}
