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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class i9c extends Drawable implements dm, yx, gk7 {
    public final kz4 a;
    public final byte b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final vl h;
    public final h9c n;
    public final ImageReceiver r;
    public final int s;
    public boolean w;
    public final TLRPC.TL_videoSizeStickerMarkup x;

    /* JADX WARN: Multi-variable type inference failed */
    public i9c(TLRPC.VideoSize videoSize, boolean z, int i) {
        kz4 kz4Var = new kz4();
        this.a = kz4Var;
        this.f = new HashSet();
        this.r = new ImageReceiver(null);
        this.s = y6c.t0;
        this.b = i;
        this.d = z;
        kz4Var.d(bm2.o(videoSize.background_colors.get(0).intValue(), kk7.d4), videoSize.background_colors.size() > 1 ? bm2.o(videoSize.background_colors.get(1).intValue(), kk7.d4) : 0, videoSize.background_colors.size() > 2 ? bm2.o(videoSize.background_colors.get(2).intValue(), kk7.d4) : 0, videoSize.background_colors.size() > 3 ? bm2.o(videoSize.background_colors.get(3).intValue(), kk7.d4) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            vl vlVar = new vl((i == 1 && z) ? 7 : i == 2 ? 15 : 8, y6c.t0, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = vlVar;
            vlVar.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            h9c h9cVar = new h9c(this);
            this.n = h9cVar;
            h9cVar.K0 = true;
            if (i == 1) {
                h9cVar.N(2);
            }
            d();
        }
    }

    @Override // yx
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            vl vlVar = this.h;
            if (vlVar != null) {
                vlVar.n(this);
            }
            h9c h9cVar = this.n;
            if (h9cVar != null) {
                h9cVar.K();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.K();
            }
        }
        if (this.x != null) {
            kk7.f(this.s).n(this, kk7.A0);
        }
    }

    @Override // yx
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.c = imageReceiver.X0[0];
            HashSet hashSet = this.f;
            if (hashSet.isEmpty()) {
                vl vlVar = this.h;
                if (vlVar != null) {
                    vlVar.a(this);
                }
                h9c h9cVar = this.n;
                if (h9cVar != null) {
                    h9cVar.I();
                }
                ImageReceiver imageReceiver2 = this.r;
                if (imageReceiver2 != null) {
                    imageReceiver2.I();
                }
            }
            hashSet.add(imageReceiver);
            if (this.x != null) {
                kk7.f(this.s).b(this, kk7.A0);
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
        hq6 d0 = hq6.d0(this.s);
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
                            this.n.Y(gl5.b(document2), str2, gl5.b(document), str, null, null, uo3.f(document2, bkb.l6, 0.2f, null), 0L, "tgs", document2, 0);
                            if (b != 3) {
                                this.r.Z(gl5.b(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                                return;
                            }
                            return;
                        }
                        str3 = "100_100";
                    }
                    str2 = str3;
                    str = "50_50_firstframe";
                    document = document2;
                    this.n.Y(gl5.b(document2), str2, gl5.b(document), str, null, null, uo3.f(document2, bkb.l6, 0.2f, null), 0L, "tgs", document2, 0);
                    if (b != 3) {
                    }
                }
            }
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.A0 || this.w) {
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
        kz4 kz4Var = this.a;
        kz4Var.b(f, f2, f3, f4);
        Paint paint = kz4Var.c;
        if (this.e != null) {
            this.c = r1.X0[0];
        }
        float f5 = this.c;
        if (f5 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(kz4Var.h, f5, f5, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        vl vlVar = this.h;
        if (vlVar != null) {
            ml mlVar = vlVar.k;
            if (mlVar != null) {
                mlVar.q0((int) ((width << 1) * 0.13f));
            }
            vlVar.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            vlVar.draw(canvas);
        }
        h9c h9cVar = this.n;
        if (h9cVar != null) {
            float f6 = width << 1;
            h9cVar.q0((int) (0.13f * f6));
            h9cVar.i0(centerX - width, centerY - width, f6, f6);
            h9cVar.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj == null || i9c.class != obj.getClass()) {
            return false;
        }
        i9c i9cVar = (i9c) obj;
        vl vlVar = i9cVar.h;
        if (this.b != i9cVar.b) {
            return false;
        }
        kz4 kz4Var = this.a;
        int i = kz4Var.d;
        kz4 kz4Var2 = i9cVar.a;
        if (i != kz4Var2.d || kz4Var.e != kz4Var2.e || kz4Var.f != kz4Var2.f || kz4Var.g != kz4Var2.g) {
            return false;
        }
        vl vlVar2 = this.h;
        if (vlVar2 != null && vlVar != null) {
            return vlVar2.h() == vlVar.h();
        }
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.x;
        return tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = i9cVar.x) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // dm
    public final void invalidate() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.c.setAlpha(i);
        vl vlVar = this.h;
        if (vlVar != null) {
            vlVar.setAlpha(i);
        }
    }

    @Override // yx
    public final void a(ry8 ry8Var) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
