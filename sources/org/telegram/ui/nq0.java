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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nq0 implements jt {
    public final /* synthetic */ String a;
    public final /* synthetic */ org.telegram.messenger.x20 b;
    public final /* synthetic */ org.telegram.messenger.ef c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ PhotoViewer h;

    public nq0(PhotoViewer photoViewer, String str, org.telegram.messenger.x20 x20Var, org.telegram.messenger.ef efVar, boolean z10, int i10, int i11, boolean z11) {
        this.h = photoViewer;
        this.a = str;
        this.b = x20Var;
        this.c = efVar;
        this.d = z10;
        this.e = i10;
        this.f = i11;
        this.g = z11;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ org.telegram.ui.Components.z60 D(fg.i iVar) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final boolean I() {
        return this.h.t7 != null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final void N(CharSequence charSequence, String str, org.telegram.ui.Components.vg vgVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.x1(), this.c.c, vgVar, null);
    }

    @Override // org.telegram.ui.jt
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, true, 0L, null, null, photoViewer.x1(), this.c.c, null, null);
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    public final void R() {
        lt p5 = lt.p();
        ImageReceiver imageReceiver = p5.A;
        org.telegram.messenger.ef efVar = this.c;
        if (efVar.c != null) {
            try {
                new File(efVar.c).delete();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            efVar.c = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.y0(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.h(canvas, null);
        }
        if (p5.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / p5.C.getWidth(), createBitmap.getHeight() / p5.C.getHeight());
            p5.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, p5.C.getWidth(), p5.C.getHeight());
            path.addRoundRect(rectF, p5.C.getWidth() / 8.0f, p5.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            p5.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        PhotoViewer photoViewer = this.h;
        TLRPC.PhotoSize a02 = org.telegram.messenger.hc.a0(createBitmap, photoViewer.i1(), 512.0f, 512.0f, 83);
        org.telegram.messenger.b8.G(photoViewer.T);
        efVar.c = org.telegram.messenger.b8.K(a02, null, true, true).toString();
    }

    @Override // org.telegram.ui.jt
    public final long a() {
        return this.h.E5;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ boolean k(int i10) {
        return false;
    }

    @Override // org.telegram.ui.jt
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, false, 0L, null, null, photoViewer.x1(), this.c.c, null, photoViewer.x7);
    }

    @Override // org.telegram.ui.jt
    public final boolean o() {
        return true;
    }

    @Override // org.telegram.ui.jt
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.t7, photoViewer.x1(), this.c.c, null, null);
    }

    @Override // org.telegram.ui.jt
    public final boolean w() {
        PhotoViewer photoViewer = this.h;
        es0 es0Var = photoViewer.d;
        if (es0Var != null) {
            return (es0Var.Q() && photoViewer.l4 == null) ? false : true;
        }
        return false;
    }

    @Override // org.telegram.ui.jt
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        es0 es0Var = photoViewer.d;
        if (es0Var == null) {
            return;
        }
        boolean Q = es0Var.Q();
        org.telegram.messenger.ef efVar = this.c;
        if (Q) {
            if (photoViewer.l4 == null) {
                return;
            }
            photoViewer.w7 = true;
            R();
            photoViewer.p5.p(this.a, this.b, str, null, false, photoViewer.l4.a(), null, null, photoViewer.x1(), efVar.c, null, null);
            return;
        }
        photoViewer.w7 = true;
        R();
        efVar.h = this.a;
        photoViewer.d.o(photoViewer.P4, this.b, this.d, this.e, this.f, this.g);
        org.telegram.messenger.zs.f(org.telegram.messenger.d20.s0).m(org.telegram.messenger.zs.s3, Boolean.TRUE);
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ org.telegram.messenger.jj y() {
        return null;
    }

    @Override // org.telegram.ui.jt
    public final boolean z() {
        return this.h.x7 != null;
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void A(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void i(org.telegram.messenger.jz jzVar) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.jt
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
