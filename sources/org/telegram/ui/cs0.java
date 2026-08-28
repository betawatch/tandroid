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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cs0 implements ft {
    public final /* synthetic */ String a;
    public final /* synthetic */ VideoEditedInfo b;
    public final /* synthetic */ MediaController.PhotoEntry c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ PhotoViewer h;

    public cs0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z10, int i9, int i10, boolean z11) {
        this.h = photoViewer;
        this.a = str;
        this.b = videoEditedInfo;
        this.c = photoEntry;
        this.d = z10;
        this.e = i9;
        this.f = i10;
        this.g = z11;
    }

    @Override // org.telegram.ui.ft
    public final boolean A() {
        return this.h.t7 != null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void F(CharSequence charSequence, String str, df dfVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.s7 = true;
        R();
        photoViewer.l5.p(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.c.thumbPath, dfVar, null);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean J() {
        return this.h.p7 != null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.s7 = true;
        R();
        photoViewer.l5.p(this.a, this.b, str, null, true, 0L, null, null, photoViewer.v1(), this.c.thumbPath, null, null);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean Q() {
        return true;
    }

    public final void R() {
        ht q10 = ht.q();
        ImageReceiver imageReceiver = q10.A;
        MediaController.PhotoEntry photoEntry = this.c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e10) {
                FileLog.e(e10);
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
        if (q10.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / q10.C.getWidth(), createBitmap.getHeight() / q10.C.getHeight());
            q10.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, q10.C.getWidth(), q10.C.getHeight());
            path.addRoundRect(rectF, q10.C.getWidth() / 8.0f, q10.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            q10.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.P8;
        PhotoViewer photoViewer = this.h;
        photoEntry.thumbPath = FileLoader.getInstance(photoViewer.P).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, photoViewer.g1(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
    }

    @Override // org.telegram.ui.ft
    public final long a() {
        return this.h.A5;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean k(int i9) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.s7 = true;
        R();
        photoViewer.l5.p(this.a, this.b, str, null, false, 0L, null, null, photoViewer.v1(), this.c.thumbPath, null, photoViewer.t7);
    }

    @Override // org.telegram.ui.ft
    public final boolean o() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ org.telegram.ui.Components.x60 r(fh.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final void v(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.s7 = true;
        R();
        photoViewer.l5.p(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.p7, photoViewer.v1(), this.c.thumbPath, null, null);
    }

    @Override // org.telegram.ui.ft
    public final boolean x() {
        PhotoViewer photoViewer = this.h;
        zt0 zt0Var = photoViewer.d;
        if (zt0Var != null) {
            return (zt0Var.P() && photoViewer.h4 == null) ? false : true;
        }
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void y(String str) {
        PhotoViewer photoViewer = this.h;
        zt0 zt0Var = photoViewer.d;
        if (zt0Var == null) {
            return;
        }
        boolean P = zt0Var.P();
        MediaController.PhotoEntry photoEntry = this.c;
        if (P) {
            if (photoViewer.h4 == null) {
                return;
            }
            photoViewer.s7 = true;
            R();
            photoViewer.l5.p(this.a, this.b, str, null, false, photoViewer.h4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
            return;
        }
        photoViewer.s7 = true;
        R();
        photoEntry.imagePath = this.a;
        photoViewer.d.o(photoViewer.L4, this.b, this.d, this.e, this.f, this.g);
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
    }
}
