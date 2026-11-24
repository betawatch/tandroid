// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class da8 implements fx2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ rcc b;
    public final /* synthetic */ jo6 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ PhotoViewer n;

    public da8(PhotoViewer photoViewer, String str, rcc rccVar, jo6 jo6Var, boolean z, int i, int i2, boolean z2) {
        this.n = photoViewer;
        this.a = str;
        this.b = rccVar;
        this.c = jo6Var;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.h = z2;
    }

    @Override // fx2
    public final boolean B() {
        return false;
    }

    @Override // fx2
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // fx2
    public final String E(boolean z) {
        return null;
    }

    @Override // fx2
    public final boolean H() {
        return false;
    }

    @Override // fx2
    public final bu5 I(ViewGroup viewGroup) {
        return null;
    }

    @Override // fx2
    public final boolean L() {
        return this.n.y7 != null;
    }

    @Override // fx2
    public final boolean Q(TLRPC.Document document) {
        return false;
    }

    @Override // fx2
    public final void R(String str) {
        PhotoViewer photoViewer = this.n;
        photoViewer.B7 = true;
        v();
        photoViewer.o5.o(this.a, this.b, str, null, true, 0L, null, null, photoViewer.t0(), this.c.c, null, null);
    }

    @Override // fx2
    public final Boolean S(TLRPC.Document document) {
        return null;
    }

    @Override // fx2
    public final boolean T() {
        return true;
    }

    @Override // fx2
    public final long a() {
        return this.n.D5;
    }

    @Override // fx2
    public final boolean b() {
        return false;
    }

    @Override // fx2
    public final boolean c() {
        return false;
    }

    @Override // fx2
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // fx2
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // fx2
    public final boolean f() {
        return false;
    }

    @Override // fx2
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override // fx2
    public final boolean h() {
        return true;
    }

    @Override // fx2
    public final boolean i() {
        return false;
    }

    @Override // fx2
    public final boolean j(int i) {
        return false;
    }

    @Override // fx2
    public final void l(String str) {
        PhotoViewer photoViewer = this.n;
        photoViewer.B7 = true;
        v();
        photoViewer.o5.o(this.a, this.b, str, null, false, 0L, null, null, photoViewer.t0(), this.c.c, null, photoViewer.C7);
    }

    @Override // fx2
    public final boolean n() {
        return true;
    }

    @Override // fx2
    public final void s(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.n;
        photoViewer.B7 = true;
        v();
        photoViewer.o5.o(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.y7, photoViewer.t0(), this.c.c, null, null);
    }

    @Override // fx2
    public final boolean t() {
        pb8 pb8Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.n;
        yv1 yv1Var = photoViewer.k4;
        if ((yv1Var == null || (chat = yv1Var.e) == null || sd2.t(chat)) && (pb8Var = photoViewer.d) != null) {
            return (pb8Var.R() && photoViewer.k4 == null) ? false : true;
        }
        return false;
    }

    public final void v() {
        hx2 e = hx2.e();
        ImageReceiver imageReceiver = e.A;
        jo6 jo6Var = this.c;
        if (jo6Var.c != null) {
            try {
                new File(jo6Var.c).delete();
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            jo6Var.c = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        imageReceiver.setAlpha(1.0f);
        imageReceiver.i0(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        imageReceiver.h(canvas, null);
        if (e.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / e.C.getWidth(), createBitmap.getHeight() / e.C.getHeight());
            e.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, e.C.getWidth(), e.C.getHeight());
            path.addRoundRect(rectF, e.C.getWidth() / 8.0f, e.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            e.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.n;
        TLRPC.PhotoSize V = fn5.V(createBitmap, photoViewer.e0(), 512.0f, 512.0f, 83);
        bc4.G(photoViewer.U);
        jo6Var.c = bc4.J(V, null, true, true).toString();
    }

    @Override // fx2
    public final void w(String str) {
        PhotoViewer photoViewer = this.n;
        pb8 pb8Var = photoViewer.d;
        if (pb8Var != null) {
            boolean R = pb8Var.R();
            jo6 jo6Var = this.c;
            if (R) {
                if (photoViewer.k4 == null) {
                    return;
                }
                photoViewer.B7 = true;
                v();
                photoViewer.o5.o(this.a, this.b, str, null, false, photoViewer.k4.a(), null, null, photoViewer.t0(), jo6Var.c, null, null);
                return;
            }
            photoViewer.B7 = true;
            v();
            jo6Var.h = this.a;
            photoViewer.d.M(photoViewer.O4, this.b, this.d, this.e, this.f, this.h);
            nm7.f(z8c.t0).m(nm7.u3, Boolean.TRUE);
        }
    }

    @Override // fx2
    public final k47 x() {
        return null;
    }

    @Override // fx2
    public final boolean y() {
        return this.n.C7 != null;
    }

    @Override // fx2
    public final void z(CharSequence charSequence, String str, qy1 qy1Var) {
        PhotoViewer photoViewer = this.n;
        photoViewer.B7 = true;
        v();
        photoViewer.o5.o(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.t0(), this.c.c, qy1Var, null);
    }

    @Override // fx2
    public final void A(TLRPC.Document document) {
    }

    @Override // fx2
    public final void D(TLRPC.Document document) {
    }

    @Override // fx2
    public final void G(TLRPC.Document document) {
    }

    @Override // fx2
    public final void J(t5a t5aVar) {
    }

    @Override // fx2
    public final void M() {
    }

    @Override // fx2
    public final void O() {
    }

    @Override // fx2
    public final void m(TLRPC.Document document) {
    }

    @Override // fx2
    public final void o(TLRPC.Document document) {
    }

    @Override // fx2
    public final void p() {
    }

    @Override // fx2
    public final void q() {
    }

    @Override // fx2
    public final void r(TLRPC.Document document) {
    }

    @Override // fx2
    public final void K(Object obj, Object obj2) {
    }

    @Override // fx2
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // fx2
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override // fx2
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
