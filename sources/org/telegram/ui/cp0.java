package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class cp0 implements is {
    public final /* synthetic */ String a;
    public final /* synthetic */ org.telegram.messenger.j20 b;
    public final /* synthetic */ org.telegram.messenger.gf c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ PhotoViewer h;

    public cp0(PhotoViewer photoViewer, String str, org.telegram.messenger.j20 j20Var, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10) {
        this.h = photoViewer;
        this.a = str;
        this.b = j20Var;
        this.c = gfVar;
        this.d = z9;
        this.e = i7;
        this.f = i10;
        this.g = z10;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ org.telegram.messenger.ij A() {
        return null;
    }

    @Override // org.telegram.ui.is
    public final boolean B() {
        return this.h.w7 != null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean E(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ String G(boolean z9) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final boolean J() {
        return this.h.s7 != null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.v7 = true;
        R();
        photoViewer.o5.p(this.a, this.b, str, null, true, 0L, null, null, photoViewer.r1(), this.c.c, null, null);
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean Q() {
        return true;
    }

    public final void R() {
        ks p10 = ks.p();
        ImageReceiver imageReceiver = p10.A;
        org.telegram.messenger.gf gfVar = this.c;
        if (gfVar.c != null) {
            try {
                new File(gfVar.c).delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            gfVar.c = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.y0(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.h(canvas, null);
        }
        if (p10.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / p10.C.getWidth(), createBitmap.getHeight() / p10.C.getHeight());
            p10.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, p10.C.getWidth(), p10.C.getHeight());
            path.addRoundRect(rectF, p10.C.getWidth() / 8.0f, p10.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            p10.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.Y8;
        PhotoViewer photoViewer = this.h;
        TLRPC.PhotoSize a02 = org.telegram.messenger.gc.a0(createBitmap, photoViewer.b1(), 512.0f, 512.0f, 83);
        org.telegram.messenger.w7.G(photoViewer.T);
        gfVar.c = org.telegram.messenger.w7.K(a02, null, true, true).toString();
    }

    @Override // org.telegram.ui.is
    public final long a() {
        return this.h.D5;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ boolean k(int i7) {
        return false;
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ org.telegram.ui.Components.k60 m(bi.x5 x5Var) {
        return null;
    }

    @Override // org.telegram.ui.is
    public final void n(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.v7 = true;
        R();
        photoViewer.o5.p(this.a, this.b, str, null, false, 0L, null, null, photoViewer.r1(), this.c.c, null, photoViewer.w7);
    }

    @Override // org.telegram.ui.is
    public final boolean p() {
        return true;
    }

    @Override // org.telegram.ui.is
    public final void u(CharSequence charSequence, String str, org.telegram.ui.Components.ex exVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.v7 = true;
        R();
        photoViewer.o5.p(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.r1(), this.c.c, exVar, null);
    }

    @Override // org.telegram.ui.is
    public final void w(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.v7 = true;
        R();
        photoViewer.o5.p(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.s7, photoViewer.r1(), this.c.c, null, null);
    }

    @Override // org.telegram.ui.is
    public final boolean y() {
        tq0 tq0Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.h;
        an anVar = photoViewer.k4;
        if ((anVar == null || (chat = anVar.e) == null || org.telegram.messenger.t3.t(chat)) && (tq0Var = photoViewer.d) != null) {
            return (tq0Var.Q() && photoViewer.k4 == null) ? false : true;
        }
        return false;
    }

    @Override // org.telegram.ui.is
    public final void z(String str) {
        PhotoViewer photoViewer = this.h;
        tq0 tq0Var = photoViewer.d;
        if (tq0Var == null) {
            return;
        }
        boolean Q = tq0Var.Q();
        org.telegram.messenger.gf gfVar = this.c;
        if (Q) {
            if (photoViewer.k4 == null) {
                return;
            }
            photoViewer.v7 = true;
            R();
            photoViewer.o5.p(this.a, this.b, str, null, false, photoViewer.k4.a(), null, null, photoViewer.r1(), gfVar.c, null, null);
            return;
        }
        photoViewer.v7 = true;
        R();
        gfVar.h = this.a;
        photoViewer.d.o(photoViewer.O4, this.b, this.d, this.e, this.f, this.g);
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.s0).m(org.telegram.messenger.qs.s3, Boolean.TRUE);
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void C(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void i(org.telegram.messenger.zy zyVar) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void v(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void x(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.is
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}
