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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ol extends tl {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean A() {
        ki kiVar = this.b.b;
        return kiVar != null && kiVar.Y;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.l0();
        AndroidUtilities.runOnUIThread(new fg(this, 23), 150L);
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.o1.size());
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final org.telegram.ui.bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        ct ctVar;
        org.telegram.ui.bu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (ctVar = kiVar.N0) != null && (closeIntoObject = ((d40) ctVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i9);
        if (K == null) {
            return null;
        }
        int[] iArr = new int[2];
        K.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - kiVar.getLeftInset();
        }
        org.telegram.ui.bu0 bu0Var = new org.telegram.ui.bu0();
        bu0Var.b = iArr[0];
        bu0Var.c = iArr[1];
        bu0Var.d = chatAttachAlertPhotoLayout.A;
        ImageReceiver imageReceiver = K.getImageView().getImageReceiver();
        bu0Var.a = imageReceiver;
        bu0Var.e = imageReceiver.getBitmapSafe();
        bu0Var.k = K.getScale();
        bu0Var.i = (int) kiVar.l1();
        K.g(false);
        return bu0Var;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (kiVar == null || kiVar.Y == z10) {
            return;
        }
        kiVar.H1(z10, true);
        chatAttachAlertPhotoLayout.Z0.a(!chatAttachAlertPhotoLayout.b.Y, true);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void G() {
        kl klVar = this.b.A;
        int childCount = klVar.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = klVar.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void W(int i9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i9);
        if (K != null) {
            K.getImageView().q(0, true);
            MediaController.PhotoEntry a02 = chatAttachAlertPhotoLayout.a0(i9);
            if (a02 == null) {
                return;
            }
            if (a02.coverPath != null) {
                K.getImageView().f(a02.coverPath, null, org.telegram.ui.ActionBar.f6.R4);
                return;
            }
            if (a02.thumbPath != null) {
                K.getImageView().f(a02.thumbPath, null, org.telegram.ui.ActionBar.f6.R4);
                return;
            }
            if (a02.path == null) {
                K.getImageView().setImageDrawable(org.telegram.ui.ActionBar.f6.R4);
                return;
            }
            K.getImageView().p(a02.orientation, a02.invert, true);
            if (a02.isVideo) {
                K.getImageView().f("vthumb://" + a02.imageId + ":" + a02.path, null, org.telegram.ui.ActionBar.f6.R4);
                return;
            }
            K.getImageView().f("thumb://" + a02.imageId + ":" + a02.path, null, org.telegram.ui.ActionBar.f6.R4);
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void Z(int i9) {
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(this.b, i9);
        if (K != null) {
            K.g(true);
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final long a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b.b.b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) o2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.j0();
        chatAttachAlertPhotoLayout.o0(-1, true);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
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

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final ImageReceiver.BitmapHolder j(int i9) {
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(this.b, i9);
        if (K != null) {
            return K.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean l() {
        ki kiVar = this.b.b;
        return kiVar != null && (kiVar.b0 instanceof org.telegram.ui.qn);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        kiVar.o2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.m1;
        MediaController.PhotoEntry a02 = chatAttachAlertPhotoLayout.a0(i9);
        if (a02 != null) {
            a02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
        if (hashMap.isEmpty() && a02 != null) {
            chatAttachAlertPhotoLayout.P(a02, -1);
        }
        if (kiVar.b1(kiVar.m1().getText())) {
            return;
        }
        kiVar.Y0();
        if (PhotoViewer.t1().l7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.p1;
            if (!hashMap.isEmpty()) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Object obj = hashMap.get(arrayList.get(i12));
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (i12 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.t1().m7};
                            photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                            CharSequence charSequence = charSequenceArr[0];
                            photoEntry.caption = charSequence;
                            if (kiVar.b1(charSequence)) {
                                return;
                            }
                        } else {
                            photoEntry.caption = null;
                        }
                    }
                }
            }
        }
        if (kiVar != null) {
            kiVar.E1 = false;
        }
        PhotoViewer.t1();
        PhotoViewer.t1().K = false;
        PhotoViewer.t1().q2 = false;
        y4.a0(kiVar.F1, kiVar.j1() + ChatAttachAlertPhotoLayout.o1.size(), kiVar.n1(), new gl(this, z10, i10, z11));
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean q() {
        ki kiVar = this.b.b;
        return (kiVar == null || kiVar.D1 == null) ? false : true;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        this.b.o0(-1, false);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean w() {
        MessageObject messageObject;
        ki kiVar = this.b.b;
        return (kiVar == null || (messageObject = kiVar.D1) == null || !messageObject.needResendWhenEdit()) ? false : true;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean z() {
        ki kiVar = this.b.b;
        return (kiVar.B || kiVar.D) ? false : true;
    }
}
