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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ls0 implements ot {
    public final /* synthetic */ String a;
    public final /* synthetic */ VideoEditedInfo b;
    public final /* synthetic */ MediaController.PhotoEntry c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ PhotoViewer h;

    public ls0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z4, int i10, int i11, boolean z10) {
        this.h = photoViewer;
        this.a = str;
        this.b = videoEditedInfo;
        this.c = photoEntry;
        this.d = z4;
        this.e = i10;
        this.f = i11;
        this.g = z10;
    }

    @Override // org.telegram.ui.ot
    public final boolean A() {
        return this.h.u7 != null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ String F(boolean z4) {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ org.telegram.ui.Components.q70 I(ag.l lVar) {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final boolean J() {
        return this.h.q7 != null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.t7 = true;
        R();
        photoViewer.m5.p(this.a, this.b, str, null, true, 0L, null, null, photoViewer.v1(), this.c.thumbPath, null, null);
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean Q() {
        return true;
    }

    public final void R() {
        qt q10 = qt.q();
        ImageReceiver imageReceiver = q10.A;
        MediaController.PhotoEntry photoEntry = this.c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e6) {
                FileLog.e(e6);
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
        Drawable[] drawableArr = PhotoViewer.Q8;
        PhotoViewer photoViewer = this.h;
        photoEntry.thumbPath = FileLoader.getInstance(photoViewer.Q).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, photoViewer.g1(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
    }

    @Override // org.telegram.ui.ot
    public final long a() {
        return this.h.B5;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ boolean k(int i10) {
        return false;
    }

    @Override // org.telegram.ui.ot
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.t7 = true;
        R();
        photoViewer.m5.p(this.a, this.b, str, null, false, 0L, null, null, photoViewer.v1(), this.c.thumbPath, null, photoViewer.u7);
    }

    @Override // org.telegram.ui.ot
    public final boolean o() {
        return true;
    }

    @Override // org.telegram.ui.ot
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.t7 = true;
        R();
        photoViewer.m5.p(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.q7, photoViewer.v1(), this.c.thumbPath, null, null);
    }

    @Override // org.telegram.ui.ot
    public final boolean w() {
        PhotoViewer photoViewer = this.h;
        ju0 ju0Var = photoViewer.d;
        if (ju0Var != null) {
            return (ju0Var.P() && photoViewer.i4 == null) ? false : true;
        }
        return false;
    }

    @Override // org.telegram.ui.ot
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        ju0 ju0Var = photoViewer.d;
        if (ju0Var == null) {
            return;
        }
        boolean P = ju0Var.P();
        MediaController.PhotoEntry photoEntry = this.c;
        if (P) {
            if (photoViewer.i4 == null) {
                return;
            }
            photoViewer.t7 = true;
            R();
            photoViewer.m5.p(this.a, this.b, str, null, false, photoViewer.i4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
            return;
        }
        photoViewer.t7 = true;
        R();
        photoEntry.imagePath = this.a;
        photoViewer.d.o(photoViewer.M4, this.b, this.d, this.e, this.f, this.g);
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ MessageObject y() {
        return null;
    }

    @Override // org.telegram.ui.ot
    public final void z(CharSequence charSequence, String str, org.telegram.ui.Components.xk xkVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.t7 = true;
        R();
        photoViewer.m5.p(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.c.thumbPath, xkVar, null);
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.ot
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
