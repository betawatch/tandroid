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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bp0 implements ls {
    public final /* synthetic */ String a;
    public final /* synthetic */ org.telegram.messenger.g20 b;
    public final /* synthetic */ org.telegram.messenger.ff c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ PhotoViewer h;

    public bp0(PhotoViewer photoViewer, String str, org.telegram.messenger.g20 g20Var, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11) {
        this.h = photoViewer;
        this.a = str;
        this.b = g20Var;
        this.c = ffVar;
        this.d = z10;
        this.e = i7;
        this.f = i10;
        this.g = z11;
    }

    @Override // org.telegram.ui.ls
    public final boolean A() {
        return this.h.x7 != null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ org.telegram.ui.Components.m60 E(ai.k0 k0Var) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final boolean J() {
        return this.h.t7 != null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, true, 0L, null, null, photoViewer.r1(), this.c.c, null, null);
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean Q() {
        return true;
    }

    public final void R() {
        ns p10 = ns.p();
        ImageReceiver imageReceiver = p10.A;
        org.telegram.messenger.ff ffVar = this.c;
        if (ffVar.c != null) {
            try {
                new File(ffVar.c).delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            ffVar.c = null;
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
        Drawable[] drawableArr = PhotoViewer.Z8;
        PhotoViewer photoViewer = this.h;
        TLRPC.PhotoSize a02 = org.telegram.messenger.fc.a0(createBitmap, photoViewer.c1(), 512.0f, 512.0f, 83);
        org.telegram.messenger.w7.G(photoViewer.U);
        ffVar.c = org.telegram.messenger.w7.J(a02, null, true, true).toString();
    }

    @Override // org.telegram.ui.ls
    public final long a() {
        return this.h.E5;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ boolean k(int i7) {
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, false, 0L, null, null, photoViewer.r1(), this.c.c, null, photoViewer.x7);
    }

    @Override // org.telegram.ui.ls
    public final boolean o() {
        return true;
    }

    @Override // org.telegram.ui.ls
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.t7, photoViewer.r1(), this.c.c, null, null);
    }

    @Override // org.telegram.ui.ls
    public final boolean w() {
        sq0 sq0Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.h;
        an anVar = photoViewer.l4;
        if ((anVar == null || (chat = anVar.e) == null || org.telegram.messenger.t3.t(chat)) && (sq0Var = photoViewer.d) != null) {
            return (sq0Var.Q() && photoViewer.l4 == null) ? false : true;
        }
        return false;
    }

    @Override // org.telegram.ui.ls
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        sq0 sq0Var = photoViewer.d;
        if (sq0Var == null) {
            return;
        }
        boolean Q = sq0Var.Q();
        org.telegram.messenger.ff ffVar = this.c;
        if (Q) {
            if (photoViewer.l4 == null) {
                return;
            }
            photoViewer.w7 = true;
            R();
            photoViewer.p5.p(this.a, this.b, str, null, false, photoViewer.l4.a(), null, null, photoViewer.r1(), ffVar.c, null, null);
            return;
        }
        photoViewer.w7 = true;
        R();
        ffVar.h = this.a;
        photoViewer.d.o(photoViewer.P4, this.b, this.d, this.e, this.f, this.g);
        org.telegram.messenger.ns.f(org.telegram.messenger.m10.t0).m(org.telegram.messenger.ns.s3, Boolean.TRUE);
    }

    @Override // org.telegram.ui.ls
    public final void y(CharSequence charSequence, String str, org.telegram.ui.Components.gh ghVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.r1(), this.c.c, ghVar, null);
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ org.telegram.messenger.gj z() {
        return null;
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void F(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void i(org.telegram.messenger.xy xyVar) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void t(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void v(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.ls
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
