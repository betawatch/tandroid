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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class am extends fm {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean A() {
        xi xiVar = this.b.b;
        return xiVar != null && xiVar.c0;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new qg(this, 23), 150L);
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.s1.size());
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        tt ttVar;
        org.telegram.ui.yu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        xi xiVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (ttVar = xiVar.R0) != null && (closeIntoObject = ((x40) ttVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 J = ChatAttachAlertPhotoLayout.J(chatAttachAlertPhotoLayout, i10);
        if (J == null) {
            return null;
        }
        int[] iArr = new int[2];
        J.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - xiVar.getLeftInset();
        }
        org.telegram.ui.yu0 yu0Var = new org.telegram.ui.yu0();
        yu0Var.b = iArr[0];
        yu0Var.c = iArr[1];
        yu0Var.d = chatAttachAlertPhotoLayout.E;
        ImageReceiver imageReceiver = J.getImageView().getImageReceiver();
        yu0Var.a = imageReceiver;
        yu0Var.e = imageReceiver.getBitmapSafe();
        yu0Var.k = J.getScale();
        yu0Var.i = (int) xiVar.j1();
        J.g(false);
        return yu0Var;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        xi xiVar = chatAttachAlertPhotoLayout.b;
        if (xiVar == null || xiVar.c0 == z10) {
            return;
        }
        xiVar.E1(z10, true);
        chatAttachAlertPhotoLayout.d1.a(!chatAttachAlertPhotoLayout.b.c0, true);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void G() {
        wl wlVar = this.b.E;
        int childCount = wlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wlVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.t5 J = ChatAttachAlertPhotoLayout.J(chatAttachAlertPhotoLayout, i10);
        if (J != null) {
            J.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 == null) {
                return;
            }
            if (b02.coverPath != null) {
                J.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.i6.R4);
                return;
            }
            if (b02.thumbPath != null) {
                J.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.i6.R4);
                return;
            }
            if (b02.path == null) {
                J.getImageView().setImageDrawable(org.telegram.ui.ActionBar.i6.R4);
                return;
            }
            J.getImageView().p(b02.orientation, b02.invert, true);
            if (b02.isVideo) {
                J.getImageView().f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.i6.R4);
                return;
            }
            J.getImageView().f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.i6.R4);
        }
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void Z(int i10) {
        org.telegram.ui.Cells.t5 J = ChatAttachAlertPhotoLayout.J(this.b, i10);
        if (J != null) {
            J.g(true);
        }
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.b.f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            return ((org.telegram.ui.yn) n2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
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
                this.b.b.k1().setText(z5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 J = ChatAttachAlertPhotoLayout.J(this.b, i10);
        if (J != null) {
            return J.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean l() {
        xi xiVar = this.b.b;
        return xiVar != null && (xiVar.f0 instanceof org.telegram.ui.yn);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        xi xiVar = chatAttachAlertPhotoLayout.b;
        xiVar.s2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.O(b02, -1);
        }
        if (xiVar.Z0(xiVar.k1().getText())) {
            return;
        }
        xiVar.X0();
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
                            if (xiVar.Z0(charSequence)) {
                                return;
                            }
                        } else {
                            photoEntry.caption = null;
                        }
                    }
                }
            }
        }
        if (xiVar != null) {
            xiVar.I1 = false;
        }
        PhotoViewer.t1();
        PhotoViewer.t1().O = false;
        PhotoViewer.t1().u2 = false;
        e5.a0(xiVar.J1, xiVar.h1() + ChatAttachAlertPhotoLayout.s1.size(), xiVar.l1(), new sl(this, z10, i11, z11));
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean q() {
        xi xiVar = this.b.b;
        return (xiVar == null || xiVar.H1 == null) ? false : true;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.b.p0(-1, false);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean w() {
        MessageObject messageObject;
        xi xiVar = this.b.b;
        return (xiVar == null || (messageObject = xiVar.H1) == null || !messageObject.needResendWhenEdit()) ? false : true;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean z() {
        xi xiVar = this.b.b;
        return (xiVar.F || xiVar.H) ? false : true;
    }
}
