package bh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import gf.s;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import ud.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b extends Drawable implements DownloadController.FileDownloadProgressListener {
    public final RadialProgress2 A;
    public MessageObject B;
    public final b6.a C;
    public String D;
    public final int E;
    public boolean F;
    public int G;
    public int H;
    public final i6 a;
    public final d9 b;
    public final ImageReceiver c;
    public final s1 d;
    public final int e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public Drawable s;
    public boolean v;
    public final Paint w;
    public final Paint x;
    public final ud.a y;

    public b(int i10, s1 s1Var) {
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Paint(1);
        this.C = new b6.a((char) 0, 18);
        this.e = i10;
        this.d = s1Var;
        this.y = new ud.a(s1Var, er.h, 380L);
        i6 i6Var = new i6(false, false, false, false);
        this.a = i6Var;
        i6Var.b = 21;
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.setCallback(s1Var);
        this.b = new d9(i10, s1Var, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dpf2(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(5.0f));
        paint.setColor(TLObject.FLAG_30);
        RadialProgress2 radialProgress2 = new RadialProgress2(s1Var, null);
        this.A = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(18.0f));
        radialProgress2.d = -1;
        this.E = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true);
        this.c.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), "36_36", ImageLocation.getForObject(closestPhotoSizeWithSize, photo), "36_36_b", null, closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, 1);
    }

    public final void b(boolean z10) {
        if (this.B.isSending() || this.B.isEditing()) {
            return;
        }
        if (TextUtils.isEmpty(this.D) || !FileLoader.getInstance(this.e).isLoadingFile(this.D)) {
            g(this.v ? 0 : 4, z10);
        } else {
            g(3, z10);
        }
    }

    public final void c(Canvas canvas) {
        int w02;
        Rect bounds = getBounds();
        int dp = AndroidUtilities.dp(this.f ? 56.33f : 19.0f);
        if (this.y.e > 0.0f) {
            g gVar = this.b.c.d;
            float f10 = gVar.c.a;
            int i10 = (int) gVar.f.a;
            int lerp = (bounds.right - dp) - AndroidUtilities.lerp(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + i10, f10);
            if (f10 > 0.0f) {
                d9 d9Var = this.b;
                d9Var.i = (int) (this.y.e * 255.0f);
                d9Var.setBounds((bounds.right - dp) - i10, bounds.bottom - AndroidUtilities.dp(31.33f), bounds.right - dp, bounds.bottom);
                this.b.c(canvas);
            }
            int dp2 = bounds.bottom - AndroidUtilities.dp(21.33f);
            i6 i6Var = this.a;
            i6Var.w = (int) (this.y.e * 255.0f);
            i6Var.setBounds(bounds.left, AndroidUtilities.dp(15.0f) + dp2, lerp, dp2 - AndroidUtilities.dp(15.0f));
            this.a.draw(canvas);
        }
        if (this.h) {
            int dp3 = AndroidUtilities.dp(36.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(y1.B(9.0f, bounds.right, dp3), y1.B(4.0f, bounds.bottom, dp3), bounds.right - AndroidUtilities.dp(9.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            this.A.a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.c.setImageCoords(rect);
            if (!this.n || this.r) {
                this.c.draw(canvas);
            }
            if (this.v || this.n) {
                if (!this.n || this.r) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.w);
                } else {
                    this.x.setColor(i0.b.k(g6.w0(null, this.B.isOutOwner() ? g6.fc : g6.ec, false), 16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.x);
                }
            }
            if (this.n) {
                if (this.s == null) {
                    this.s = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
                }
                Drawable drawable = this.s;
                b6.a aVar = this.C;
                if (this.r) {
                    w02 = -1;
                } else {
                    w02 = g6.w0(null, this.B.isOutOwner() ? g6.sb : g6.nd, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                aVar.getClass();
                if (((PorterDuffColorFilter) aVar.b) == null || aVar.c != w02 || ((PorterDuff.Mode) aVar.d) != mode) {
                    aVar.b = new PorterDuffColorFilter(w02, mode);
                    aVar.c = w02;
                    aVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) aVar.b);
                s.e(this.s, rectF.centerX(), rectF.centerY(), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
                this.s.draw(canvas);
            }
            b(true);
            if (this.F) {
                this.A.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        d9 d9Var = this.b;
        float d = this.a.d() + d9Var.c.d.f.a;
        float dp = d9Var.c.d.c.a * AndroidUtilities.dp(4.0f);
        float f11 = this.y.e;
        return (f10 * f11) + (dp * f11) + d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        return this.a.d + (this.G > 0 ? AndroidUtilities.dp((r1 * 9.34f) + 8.66f) : 0);
    }

    public final void f(boolean z10) {
        this.f = z10;
    }

    public final void g(int i10, boolean z10) {
        if (this.H != i10) {
            this.H = i10;
            this.A.setIcon(i10, true, z10);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(MessageObject messageObject, TLRPC.MessageMedia messageMedia, MessageObject messageObject2, String str, boolean z10) {
        ImageReceiver imageReceiver;
        boolean z11;
        TLRPC.GeoPoint geoPoint;
        this.B = messageObject;
        String str2 = this.D;
        this.F = false;
        this.D = null;
        ImageReceiver imageReceiver2 = this.c;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            this.r = false;
            this.n = false;
            this.v = false;
            z11 = true;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.WebPage webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                this.n = true;
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    this.r = true;
                    a(photo, messageObject2);
                } else {
                    imageReceiver2.clearImage();
                }
            } else {
                if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                        TLRPC.Document document = tL_messageMediaDocument.document;
                        if (document != null) {
                            this.D = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                            if (MessageObject.isVideoDocument(tL_messageMediaDocument.document)) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true);
                                this.v = true;
                                this.F = true;
                                ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize2, document);
                                ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize, document);
                                imageReceiver = imageReceiver2;
                                imageReceiver.setImage(forObject, "36_36", forObject2, "36_36_b", null, closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, messageObject2, 1);
                            } else {
                                imageReceiver = imageReceiver2;
                                boolean z12 = MessageObject.isStickerDocument(document) || MessageObject.isVideoSticker(document);
                                boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(document, true);
                                if (z12 || isAnimatedStickerDocument) {
                                    imageReceiver.setImage(ImageLocation.getForDocument(document), "36_36", DocumentObject.getSvgThumb(document, g6.lc, 1.0f), document.size, z12 ? "webp" : null, messageObject2, 1);
                                }
                                z11 = false;
                            }
                        }
                    } else if (((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) && (geoPoint = messageMedia.geo) != null) {
                        ImageLocation forWebFile = ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 36, 36, 13, Math.min(2, (int) Math.ceil(AndroidUtilities.density))));
                        imageReceiver = imageReceiver2;
                        imageReceiver.setImage(forWebFile, (String) null, (ImageLocation) null, (String) null, (Drawable) null, messageObject2, 0);
                    } else {
                        imageReceiver = imageReceiver2;
                        z11 = false;
                    }
                    this.h = z11;
                    if (!z11) {
                        imageReceiver.clearImage();
                    }
                    this.A.setColors(this.v ? 0 : g6.w0(null, g6.le, false), this.v ? 0 : g6.w0(null, g6.me, false), g6.w0(null, g6.ne, false), g6.w0(null, g6.oe, false));
                    if (!TextUtils.equals(str2, this.D)) {
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        int i10 = this.e;
                        if (!isEmpty) {
                            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
                        }
                        if (!TextUtils.isEmpty(this.D)) {
                            DownloadController.getInstance(i10).addLoadingFileObserver(this.D, this);
                        }
                    }
                    b(z10);
                }
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                this.F = true;
                this.D = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                a(tL_messageMediaPhoto.photo, messageObject2);
            }
            imageReceiver = imageReceiver2;
            this.h = z11;
            if (!z11) {
            }
            this.A.setColors(this.v ? 0 : g6.w0(null, g6.le, false), this.v ? 0 : g6.w0(null, g6.me, false), g6.w0(null, g6.ne, false), g6.w0(null, g6.oe, false));
            if (!TextUtils.equals(str2, this.D)) {
            }
            b(z10);
        }
        imageReceiver = imageReceiver2;
        z11 = false;
        this.h = z11;
        if (!z11) {
        }
        this.A.setColors(this.v ? 0 : g6.w0(null, g6.le, false), this.v ? 0 : g6.w0(null, g6.me, false), g6.w0(null, g6.ne, false), g6.w0(null, g6.oe, false));
        if (!TextUtils.equals(str2, this.D)) {
        }
        b(z10);
    }

    public final void i(ArrayList arrayList, boolean z10) {
        this.G = arrayList != null ? arrayList.size() : 0;
        this.b.d(arrayList, z10);
    }

    public final void j(int i10, boolean z10) {
        this.a.q(i10 > 0 ? LocaleController.formatShortNumber(i10, null) : null, z10, true);
    }

    public final void k(int i10) {
        this.a.r(i10);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.A.o(min, true);
        g(min < 1.0f ? 3 : this.v ? 0 : 4, true);
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.A.o(min, true);
        g(min < 1.0f ? 3 : this.v ? 0 : 4, true);
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }
}
