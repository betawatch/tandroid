package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class et0 implements rt {
    public final /* synthetic */ String a;
    public final /* synthetic */ VideoEditedInfo b;
    public final /* synthetic */ MediaController.PhotoEntry c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ PhotoViewer h;

    public et0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11) {
        this.h = photoViewer;
        this.a = str;
        this.b = videoEditedInfo;
        this.c = photoEntry;
        this.d = z10;
        this.e = i10;
        this.f = i11;
        this.g = z11;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ String E(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final void F(CharSequence charSequence, String str, pf pfVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.c.thumbPath, pfVar, null);
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final boolean I() {
        return this.h.t7 != null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ org.telegram.ui.Components.w70 K(bi.n7 n7Var) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, true, 0L, null, null, photoViewer.v1(), this.c.thumbPath, null, null);
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    public final void R() {
        tt q6 = tt.q();
        ImageReceiver imageReceiver = q6.A;
        MediaController.PhotoEntry photoEntry = this.c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoEntry.thumbPath = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.setImageCoords(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.draw(canvas);
        }
        if (q6.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / q6.C.getWidth(), createBitmap.getHeight() / q6.C.getHeight());
            q6.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, q6.C.getWidth(), q6.C.getHeight());
            path.addRoundRect(rectF, q6.C.getWidth() / 8.0f, q6.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            q6.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.T8;
        PhotoViewer photoViewer = this.h;
        photoEntry.thumbPath = FileLoader.getInstance(photoViewer.T).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, photoViewer.g1(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
    }

    @Override // org.telegram.ui.rt
    public final long a() {
        return this.h.E5;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ boolean k(int i10) {
        return false;
    }

    @Override // org.telegram.ui.rt
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, false, 0L, null, null, photoViewer.v1(), this.c.thumbPath, null, photoViewer.x7);
    }

    @Override // org.telegram.ui.rt
    public final boolean o() {
        return true;
    }

    @Override // org.telegram.ui.rt
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.t7, photoViewer.v1(), this.c.thumbPath, null, null);
    }

    @Override // org.telegram.ui.rt
    public final boolean w() {
        PhotoViewer photoViewer = this.h;
        cv0 cv0Var = photoViewer.d;
        if (cv0Var != null) {
            return (cv0Var.P() && photoViewer.l4 == null) ? false : true;
        }
        return false;
    }

    @Override // org.telegram.ui.rt
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        cv0 cv0Var = photoViewer.d;
        if (cv0Var == null) {
            return;
        }
        boolean P = cv0Var.P();
        MediaController.PhotoEntry photoEntry = this.c;
        if (P) {
            if (photoViewer.l4 == null) {
                return;
            }
            photoViewer.w7 = true;
            R();
            photoViewer.p5.p(this.a, this.b, str, null, false, photoViewer.l4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
            return;
        }
        photoViewer.w7 = true;
        R();
        photoEntry.imagePath = this.a;
        photoViewer.d.o(photoViewer.P4, this.b, this.d, this.e, this.f, this.g);
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.rt
    public final boolean z() {
        return this.h.x7 != null;
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void A(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void D(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.rt
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
