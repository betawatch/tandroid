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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jm extends om {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean A() {
        ti tiVar = this.b.b;
        return tiVar != null && tiVar.c0;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.n0();
        AndroidUtilities.runOnUIThread(new pg(this, 25), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.s1.size());
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final org.telegram.ui.su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        au auVar;
        org.telegram.ui.su0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (auVar = tiVar.U0) != null && (closeIntoObject = ((f50) auVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.x5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N == null) {
            return null;
        }
        int[] iArr = new int[2];
        N.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - tiVar.getLeftInset();
        }
        org.telegram.ui.su0 su0Var = new org.telegram.ui.su0();
        su0Var.b = iArr[0];
        su0Var.c = iArr[1];
        su0Var.d = chatAttachAlertPhotoLayout.E;
        ImageReceiver imageReceiver = N.getImageView().getImageReceiver();
        su0Var.a = imageReceiver;
        su0Var.e = imageReceiver.getBitmapSafe();
        su0Var.k = N.getScale();
        su0Var.i = (int) tiVar.r1();
        N.g(false);
        return su0Var;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (tiVar == null || tiVar.c0 == z10) {
            return;
        }
        tiVar.O1(z10, true);
        chatAttachAlertPhotoLayout.d1.a(!chatAttachAlertPhotoLayout.b.c0, true);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void G() {
        fm fmVar = this.b.E;
        int childCount = fmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.x5) {
                ((org.telegram.ui.Cells.x5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void X(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.x5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            N.getImageView().q(0, true);
            MediaController.PhotoEntry c02 = chatAttachAlertPhotoLayout.c0(i10);
            if (c02 == null) {
                return;
            }
            if (c02.coverPath != null) {
                N.getImageView().g(c02.coverPath, null, org.telegram.ui.ActionBar.y6.R4);
                return;
            }
            if (c02.thumbPath != null) {
                N.getImageView().g(c02.thumbPath, null, org.telegram.ui.ActionBar.y6.R4);
                return;
            }
            if (c02.path == null) {
                N.getImageView().setImageDrawable(org.telegram.ui.ActionBar.y6.R4);
                return;
            }
            N.getImageView().p(c02.orientation, c02.invert, true);
            if (c02.isVideo) {
                N.getImageView().g("vthumb://" + c02.imageId + ":" + c02.path, null, org.telegram.ui.ActionBar.y6.R4);
                return;
            }
            N.getImageView().g("thumb://" + c02.imageId + ":" + c02.path, null, org.telegram.ui.ActionBar.y6.R4);
        }
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final long a() {
        org.telegram.ui.ActionBar.r2 r2Var = this.b.b.f0;
        if (r2Var instanceof org.telegram.ui.wn) {
            return ((org.telegram.ui.wn) r2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void a0(int i10) {
        org.telegram.ui.Cells.x5 N = ChatAttachAlertPhotoLayout.N(this.b, i10);
        if (N != null) {
            N.g(true);
        }
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.l0();
        chatAttachAlertPhotoLayout.q0(-1, true);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
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
                this.b.b.s1().setText(c6.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.x5 N = ChatAttachAlertPhotoLayout.N(this.b, i10);
        if (N != null) {
            return N.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean l() {
        ti tiVar = this.b.b;
        return tiVar != null && (tiVar.f0 instanceof org.telegram.ui.wn);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        tiVar.y2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.q1;
        MediaController.PhotoEntry c02 = chatAttachAlertPhotoLayout.c0(i10);
        if (c02 != null) {
            c02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (hashMap.isEmpty() && c02 != null) {
            chatAttachAlertPhotoLayout.R(c02, -1);
        }
        if (tiVar.g1(tiVar.s1().getText())) {
            return;
        }
        tiVar.e1();
        if (PhotoViewer.v1().p7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
            if (!hashMap.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Object obj = hashMap.get(arrayList.get(i13));
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (i13 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.v1().q7};
                            photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                            CharSequence charSequence = charSequenceArr[0];
                            photoEntry.caption = charSequence;
                            if (tiVar.g1(charSequence)) {
                                return;
                            }
                        } else {
                            photoEntry.caption = null;
                        }
                    }
                }
            }
        }
        if (tiVar != null) {
            tiVar.L1 = false;
        }
        PhotoViewer.v1();
        PhotoViewer.v1().O = false;
        PhotoViewer.v1().u2 = false;
        g5.Z(tiVar.M1, tiVar.p1() + ChatAttachAlertPhotoLayout.s1.size(), tiVar.t1(), new bm(this, z10, i11, z11));
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean q() {
        ti tiVar = this.b.b;
        return (tiVar == null || tiVar.K1 == null) ? false : true;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.b.q0(-1, false);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean w() {
        MessageObject messageObject;
        ti tiVar = this.b.b;
        return (tiVar == null || (messageObject = tiVar.K1) == null || !messageObject.needResendWhenEdit()) ? false : true;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean z() {
        ti tiVar = this.b.b;
        return (tiVar.F || tiVar.H) ? false : true;
    }
}
