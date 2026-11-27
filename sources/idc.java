// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class idc extends Drawable implements em, zx, fn7 {
    public final o15 a;
    public final byte b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final wl h;
    public final hdc n;
    public final ImageReceiver r;
    public final int s;
    public boolean w;
    public final TLRPC.TL_videoSizeStickerMarkup x;

    /* JADX WARN: Multi-variable type inference failed */
    public idc(TLRPC.VideoSize videoSize, boolean z, int i) {
        o15 o15Var = new o15();
        this.a = o15Var;
        this.f = new HashSet();
        this.r = new ImageReceiver(null);
        this.s = yac.t0;
        this.b = i;
        this.d = z;
        o15Var.d(vm2.o(videoSize.background_colors.get(0).intValue(), jn7.d4), videoSize.background_colors.size() > 1 ? vm2.o(videoSize.background_colors.get(1).intValue(), jn7.d4) : 0, videoSize.background_colors.size() > 2 ? vm2.o(videoSize.background_colors.get(2).intValue(), jn7.d4) : 0, videoSize.background_colors.size() > 3 ? vm2.o(videoSize.background_colors.get(3).intValue(), jn7.d4) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            wl wlVar = new wl((i == 1 && z) ? 7 : i == 2 ? 15 : 8, yac.t0, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = wlVar;
            wlVar.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            hdc hdcVar = new hdc(this);
            this.n = hdcVar;
            hdcVar.K0 = true;
            if (i == 1) {
                hdcVar.N(2);
            }
            d();
        }
    }

    @Override // zx
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            wl wlVar = this.h;
            if (wlVar != null) {
                wlVar.n(this);
            }
            hdc hdcVar = this.n;
            if (hdcVar != null) {
                hdcVar.K();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.K();
            }
        }
        if (this.x != null) {
            jn7.f(this.s).n(this, jn7.B0);
        }
    }

    @Override // zx
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.c = imageReceiver.X0[0];
            HashSet hashSet = this.f;
            if (hashSet.isEmpty()) {
                wl wlVar = this.h;
                if (wlVar != null) {
                    wlVar.a(this);
                }
                hdc hdcVar = this.n;
                if (hdcVar != null) {
                    hdcVar.I();
                }
                ImageReceiver imageReceiver2 = this.r;
                if (imageReceiver2 != null) {
                    imageReceiver2.I();
                }
            }
            hashSet.add(imageReceiver);
            if (this.x != null) {
                jn7.f(this.s).b(this, jn7.B0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        TLRPC.Document document;
        String str;
        String str2;
        String str3;
        ls6 d0 = ls6.d0(this.s);
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = this.x;
        TLRPC.TL_messages_stickerSet n0 = d0.n0(tL_videoSizeStickerMarkup.stickerset, false);
        if (n0 != null) {
            this.w = true;
            for (int i = 0; i < n0.documents.size(); i++) {
                if (n0.documents.get(i).id == tL_videoSizeStickerMarkup.sticker_id) {
                    TLRPC.Document document2 = n0.documents.get(i);
                    boolean z = this.d;
                    byte b = this.b;
                    if (z && b == 1) {
                        str3 = "50_50";
                    } else {
                        if (b != 2) {
                            document = null;
                            str = null;
                            str2 = "50_50_firstframe";
                            this.n.Y(jn5.b(document2), str2, jn5.b(document), str, null, null, lp3.f(document2, aob.m6, 0.2f, null), 0L, "tgs", document2, 0);
                            if (b != 3) {
                                this.r.Z(jn5.b(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                                return;
                            }
                            return;
                        }
                        str3 = "100_100";
                    }
                    str2 = str3;
                    str = "50_50_firstframe";
                    document = document2;
                    this.n.Y(jn5.b(document2), str2, jn5.b(document), str, null, null, lp3.f(document2, aob.m6, 0.2f, null), 0L, "tgs", document2, 0);
                    if (b != 3) {
                    }
                }
            }
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != jn7.B0 || this.w) {
            return;
        }
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = getBounds().left;
        float f2 = getBounds().top;
        float f3 = getBounds().right;
        float f4 = getBounds().bottom;
        o15 o15Var = this.a;
        o15Var.b(f, f2, f3, f4);
        Paint paint = o15Var.c;
        if (this.e != null) {
            this.c = r1.X0[0];
        }
        float f5 = this.c;
        if (f5 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(o15Var.h, f5, f5, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        wl wlVar = this.h;
        if (wlVar != null) {
            nl nlVar = wlVar.k;
            if (nlVar != null) {
                nlVar.q0((int) ((width << 1) * 0.13f));
            }
            wlVar.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            wlVar.draw(canvas);
        }
        hdc hdcVar = this.n;
        if (hdcVar != null) {
            float f6 = width << 1;
            hdcVar.q0((int) (0.13f * f6));
            hdcVar.i0(centerX - width, centerY - width, f6, f6);
            hdcVar.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj == null || idc.class != obj.getClass()) {
            return false;
        }
        idc idcVar = (idc) obj;
        wl wlVar = idcVar.h;
        if (this.b != idcVar.b) {
            return false;
        }
        o15 o15Var = this.a;
        int i = o15Var.d;
        o15 o15Var2 = idcVar.a;
        if (i != o15Var2.d || o15Var.e != o15Var2.e || o15Var.f != o15Var2.f || o15Var.g != o15Var2.g) {
            return false;
        }
        wl wlVar2 = this.h;
        if (wlVar2 != null && wlVar != null) {
            return wlVar2.h() == wlVar.h();
        }
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.x;
        return tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = idcVar.x) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // em
    public final void invalidate() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.c.setAlpha(i);
        wl wlVar = this.h;
        if (wlVar != null) {
            wlVar.setAlpha(i);
        }
    }

    @Override // zx
    public final void a(e29 e29Var) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
