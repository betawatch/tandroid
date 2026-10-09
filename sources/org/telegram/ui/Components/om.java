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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class om extends tm {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean A() {
        yi yiVar = this.b.b;
        return yiVar != null && yiVar.c0;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new rg(this, 23), 150L);
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.s1.size());
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        gu guVar;
        org.telegram.ui.ev0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (guVar = yiVar.U0) != null && (closeIntoObject = ((l50) guVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N == null) {
            return null;
        }
        int[] iArr = new int[2];
        N.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - yiVar.getLeftInset();
        }
        org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
        ev0Var.b = iArr[0];
        ev0Var.c = iArr[1];
        ev0Var.d = chatAttachAlertPhotoLayout.E;
        ImageReceiver imageReceiver = N.getImageView().getImageReceiver();
        ev0Var.a = imageReceiver;
        ev0Var.e = imageReceiver.getBitmapSafe();
        ev0Var.k = N.getScale();
        ev0Var.i = (int) yiVar.n1();
        N.g(false);
        return ev0Var;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (yiVar == null || yiVar.c0 == z10) {
            return;
        }
        yiVar.K1(z10, true);
        chatAttachAlertPhotoLayout.d1.a(!chatAttachAlertPhotoLayout.b.c0, true);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void G() {
        km kmVar = this.b.E;
        int childCount = kmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = kmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            N.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 == null) {
                return;
            }
            if (b02.coverPath != null) {
                N.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.i6.R4);
                return;
            }
            if (b02.thumbPath != null) {
                N.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.i6.R4);
                return;
            }
            if (b02.path == null) {
                N.getImageView().setImageDrawable(org.telegram.ui.ActionBar.i6.R4);
                return;
            }
            N.getImageView().p(b02.orientation, b02.invert, true);
            if (b02.isVideo) {
                N.getImageView().f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.i6.R4);
                return;
            }
            N.getImageView().f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.i6.R4);
        }
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void Z(int i10) {
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(this.b, i10);
        if (N != null) {
            N.g(true);
        }
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.b.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) n2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
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
                this.b.b.o1().setText(b6.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(this.b, i10);
        if (N != null) {
            return N.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean l() {
        yi yiVar = this.b.b;
        return yiVar != null && (yiVar.f0 instanceof org.telegram.ui.zn);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        yiVar.v2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (yiVar.d1(yiVar.o1().getText())) {
            return;
        }
        yiVar.a1();
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
                            if (yiVar.d1(charSequence)) {
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
            yiVar.L1 = false;
        }
        PhotoViewer.t1();
        PhotoViewer.t1().O = false;
        PhotoViewer.t1().u2 = false;
        g5.Z(yiVar.M1, yiVar.l1() + ChatAttachAlertPhotoLayout.s1.size(), yiVar.p1(), new gm(this, z10, i11, z11));
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean q() {
        yi yiVar = this.b.b;
        return (yiVar == null || yiVar.K1 == null) ? false : true;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.b.p0(-1, false);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean w() {
        MessageObject messageObject;
        yi yiVar = this.b.b;
        return (yiVar == null || (messageObject = yiVar.K1) == null || !messageObject.needResendWhenEdit()) ? false : true;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean z() {
        yi yiVar = this.b.b;
        return (yiVar.F || yiVar.H) ? false : true;
    }
}
