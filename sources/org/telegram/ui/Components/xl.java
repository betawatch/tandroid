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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xl extends cm {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean A() {
        vi viVar = this.b.b;
        return viVar != null && viVar.c0;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new pg(this, 23), 150L);
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.s1.size());
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final org.telegram.ui.cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ot otVar;
        org.telegram.ui.cv0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (otVar = viVar.R0) != null && (closeIntoObject = ((t40) otVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.s5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (L == null) {
            return null;
        }
        int[] iArr = new int[2];
        L.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - viVar.getLeftInset();
        }
        org.telegram.ui.cv0 cv0Var = new org.telegram.ui.cv0();
        cv0Var.b = iArr[0];
        cv0Var.c = iArr[1];
        cv0Var.d = chatAttachAlertPhotoLayout.E;
        ImageReceiver imageReceiver = L.getImageView().getImageReceiver();
        cv0Var.a = imageReceiver;
        cv0Var.e = imageReceiver.getBitmapSafe();
        cv0Var.k = L.getScale();
        cv0Var.i = (int) viVar.l1();
        L.g(false);
        return cv0Var;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (viVar == null || viVar.c0 == z10) {
            return;
        }
        viVar.H1(z10, true);
        chatAttachAlertPhotoLayout.d1.a(!chatAttachAlertPhotoLayout.b.c0, true);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void G() {
        tl tlVar = this.b.E;
        int childCount = tlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tlVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.s5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
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

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void Z(int i10) {
        org.telegram.ui.Cells.s5 L = ChatAttachAlertPhotoLayout.L(this.b, i10);
        if (L != null) {
            L.g(true);
        }
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.b.f0;
        if (n2Var instanceof org.telegram.ui.co) {
            return ((org.telegram.ui.co) n2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
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
                this.b.b.m1().setText(z5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 L = ChatAttachAlertPhotoLayout.L(this.b, i10);
        if (L != null) {
            return L.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean l() {
        vi viVar = this.b.b;
        return viVar != null && (viVar.f0 instanceof org.telegram.ui.co);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        vi viVar = chatAttachAlertPhotoLayout.b;
        viVar.s2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (viVar.b1(viVar.m1().getText())) {
            return;
        }
        viVar.Y0();
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
                            if (viVar.b1(charSequence)) {
                                return;
                            }
                        } else {
                            photoEntry.caption = null;
                        }
                    }
                }
            }
        }
        if (viVar != null) {
            viVar.I1 = false;
        }
        PhotoViewer.t1();
        PhotoViewer.t1().O = false;
        PhotoViewer.t1().u2 = false;
        e5.a0(viVar.J1, viVar.j1() + ChatAttachAlertPhotoLayout.s1.size(), viVar.n1(), new pl(this, z10, i11, z11));
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean q() {
        vi viVar = this.b.b;
        return (viVar == null || viVar.H1 == null) ? false : true;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.b.p0(-1, false);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean w() {
        MessageObject messageObject;
        vi viVar = this.b.b;
        return (viVar == null || (messageObject = viVar.H1) == null || !messageObject.needResendWhenEdit()) ? false : true;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean z() {
        vi viVar = this.b.b;
        return (viVar.F || viVar.H) ? false : true;
    }
}
