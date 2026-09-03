package dh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j extends Drawable implements DownloadController.FileDownloadProgressListener, eo0 {
    public String B;
    public String C;
    public boolean D;
    public MessageObject E;
    public double F;
    public int G;
    public final fo0 H;
    public float I;
    public float J;
    public SvgHelper.SvgDrawable K;
    public bq L;
    public Drawable M;
    public a N;
    public boolean O;
    public boolean P;
    public TLRPC.MessageMedia Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int X;
    public int Y;
    public final xd.a a;
    public final int a0;
    public final ImageReceiver b;
    public int b0;
    public final int c;
    public int c0;
    public final s1 d;
    public int d0;
    public String e;
    public String f;
    public String h;
    public k01 n;
    public k01 r;
    public k01 s;
    public k01 v;
    public final RadialProgress2 x;
    public final boolean y;
    public final Paint w = new Paint(1);
    public int W = 0;
    public int Z = 255;

    public j(int i10, s1 s1Var, f6 f6Var, boolean z4) {
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.c = i10;
        this.y = z4;
        this.x = new RadialProgress2(s1Var, f6Var);
        this.d = s1Var;
        fo0 fo0Var = new fo0(s1Var);
        this.H = fo0Var;
        fo0Var.h = this;
        this.a = new xd.a(s1Var, wd.a.a, 180L);
        this.a0 = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a() {
        this.b.onAttachedToWindow();
        this.x.e();
    }

    @Override // org.telegram.ui.Components.eo0
    public final void b(float f10) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
            n(true);
        }
    }

    public final void c(boolean z4) {
        k01 k01Var = this.n;
        if (k01Var != null) {
            k01Var.o(j6.w0(null, z4 ? j6.Fb : j6.Dd, false));
        }
        this.w.setColor(1711276032);
        k01 k01Var2 = this.v;
        if (k01Var2 != null) {
            k01Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.K;
        if (svgDrawable != null) {
            svgDrawable.setColorKey(z4 ? j6.Pb : j6.qe);
        }
        boolean z10 = this.U;
        RadialProgress2 radialProgress2 = this.x;
        if (!z10 && !this.T) {
            radialProgress2.g(j6.le, j6.me, j6.ne, j6.oe);
            return;
        }
        fo0 fo0Var = this.H;
        if (z4) {
            int w02 = j6.w0(null, j6.wb, false);
            int w03 = j6.w0(null, j6.xb, false);
            int i10 = j6.zb;
            fo0Var.h(w02, w03, j6.w0(null, i10, false), j6.w0(null, i10, false), j6.w0(null, j6.yb, false));
            radialProgress2.g(j6.Nb, j6.Ob, j6.Pa, j6.Qa);
            return;
        }
        radialProgress2.g(j6.ie, j6.je, j6.uc, j6.vc);
        int w04 = j6.w0(null, j6.ud, false);
        int w05 = j6.w0(null, j6.vd, false);
        int i11 = j6.xd;
        fo0Var.h(w04, w05, j6.w0(null, i11, false), j6.w0(null, i11, false), j6.w0(null, j6.wd, false));
    }

    @Override // org.telegram.ui.Components.eo0
    public final void d(float f10) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f10;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f10);
            n(true);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.Z == 0 || bounds.isEmpty()) {
            return;
        }
        f(false);
        boolean z4 = this.T;
        int i10 = 2;
        RadialProgress2 radialProgress2 = this.x;
        if (z4 || this.U) {
            int i11 = bounds.left;
            boolean z10 = this.y;
            int dp = i11 + (z10 ? 0 : AndroidUtilities.dp(8.0f));
            int dp2 = bounds.top + (z10 ? 0 : AndroidUtilities.dp(3.0f));
            int dp3 = this.U ? 0 : AndroidUtilities.dp(3.0f);
            k01 k01Var = this.n;
            if (k01Var != null) {
                k01Var.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(15.0f) + dp2 + dp3);
            }
            if (this.U) {
                float f10 = this.a.e;
                if (this.r != null && f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    int i12 = dp2 + dp3;
                    canvas.scale(f11, f11, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(35.0f) + i12);
                    this.r.a.setAlpha((int) (f11 * 255.0f));
                    this.r.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(35.0f) + i12);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    fo0 fo0Var = this.H;
                    fo0Var.t = f10;
                    fo0Var.j(org.telegram.ui.b.t(56.0f, dp, bounds.right), AndroidUtilities.dp(30.0f));
                    canvas.save();
                    float dp4 = AndroidUtilities.dp(45.0f) + dp;
                    this.I = dp4;
                    float dp5 = AndroidUtilities.dp(21.0f) + dp2 + dp3;
                    this.J = dp5;
                    canvas.translate(dp4, dp5);
                    fo0Var.b(canvas);
                    canvas.restore();
                }
            }
            k01 k01Var2 = this.s;
            if (k01Var2 != null) {
                k01Var2.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp((this.U ? 20 : 2) + 34) + dp3 + dp2);
            }
            int dp6 = AndroidUtilities.dp(2.0f) + dp;
            this.X = dp6;
            int dp7 = AndroidUtilities.dp(5.0f) + dp2;
            this.Y = dp7;
            radialProgress2.q(dp6, dp7, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(2.0f) + dp, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(5.0f) + dp2);
        } else {
            ImageReceiver imageReceiver = this.b;
            imageReceiver.setAlpha(this.Z / 255.0f);
            imageReceiver.setImageCoords(bounds);
            imageReceiver.draw(canvas);
            if (this.V && (drawable = this.M) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.M.getIntrinsicHeight() * 0.8f);
                int x10 = (int) e2.c.x(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - mr.k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                this.M.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                this.M.setBounds(x10, imageHeight, intrinsicWidth + x10, intrinsicHeight + imageHeight);
                this.M.draw(canvas);
            }
            radialProgress2.q(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
            if (this.D && this.v != null) {
                canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.w);
                this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
            }
        }
        if (this.V) {
            return;
        }
        MessageObject messageObject = this.E;
        if (messageObject == null || !messageObject.isSending()) {
            a aVar = this.N;
            if (aVar == null || !aVar.g) {
                if (this.U) {
                    if (aVar != null && aVar.f) {
                        i10 = 4;
                    }
                    l(i10, true);
                } else {
                    k(g());
                }
            } else if (this.U) {
                l(3, true);
            } else {
                k(3);
            }
        } else if (ImageLoader.getInstance().getFileProgressSizes(this.C) == null) {
            radialProgress2.o(1.0f, true);
            if (this.U) {
                l(6, true);
            } else {
                k(6);
            }
        }
        if (this.U) {
            k(g());
        }
        radialProgress2.draw(canvas);
    }

    public final void e() {
        a aVar = this.N;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z4) {
        int width = getBounds().width() - AndroidUtilities.dp(this.y ? 64.0f : 72.0f);
        if (this.W != width || z4) {
            this.W = width;
            String str = this.e;
            if (str != null) {
                if (this.n == null) {
                    this.n = new k01(str, 15.0f, AndroidUtilities.bold());
                }
                k01 k01Var = this.n;
                k01Var.r(TextUtils.ellipsize(this.e, k01Var.a, width, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                if (this.r == null) {
                    this.r = new k01(str2, 14.0f, null);
                }
                k01 k01Var2 = this.r;
                k01Var2.r(TextUtils.ellipsize(this.f, k01Var2.a, width, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.s == null) {
                    this.s = new k01(str3, 12.0f, null);
                }
                k01 k01Var3 = this.s;
                k01Var3.r(TextUtils.ellipsize(this.h, k01Var3.a, width, TextUtils.TruncateAt.END));
            }
            if (this.D && this.v == null) {
                this.v = new k01(AndroidUtilities.formatLongDuration(this.G), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z4 = this.U;
        if (z4 && this.a.f) {
            return !MediaController.getInstance().isMessagePaused() ? 1 : 0;
        }
        if (this.D || z4) {
            return 0;
        }
        if (!this.T) {
            return 4;
        }
        a aVar = this.N;
        return (aVar == null || !aVar.f) ? 2 : 5;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.Z;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.a0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i10) {
        if (this.U) {
            return AndroidUtilities.dp(63.0f);
        }
        if (this.T) {
            return AndroidUtilities.dp(56.0f);
        }
        int i11 = this.R;
        if (i11 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return Math.min(Math.round((i10 / i11) * this.S), this.y ? (i10 * 4) / 5 : (i10 * 5) / 4);
    }

    public final boolean i() {
        return this.U && MediaController.getInstance().isPlayingMessage(this.E) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.y;
    }

    public final boolean j(float f10, float f11, int i10) {
        if (!this.U || this.c0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            if (f10 >= this.X + dp2 && f10 <= r4 + dp) {
                if (f11 >= this.Y + dp2 && f11 <= r7 + dp) {
                    this.O = true;
                    return true;
                }
            }
        }
        boolean z4 = this.O;
        if (z4) {
            if (i10 == 1) {
                a aVar = this.N;
                if (aVar != null) {
                    TLRPC.Document document = aVar.b;
                    int i11 = aVar.a;
                    if (aVar.g) {
                        FileLoader.getInstance(i11).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f) {
                        FileLoader.getInstance(i11).loadFile(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    e();
                }
                this.O = false;
                return true;
            }
            if (i10 == 3) {
                this.O = false;
                return true;
            }
        }
        return z4;
    }

    public final void k(int i10) {
        if (this.b0 != i10) {
            this.b0 = i10;
            this.x.setIcon(i10, true, true);
        }
    }

    public final void l(int i10, boolean z4) {
        if (this.c0 != i10) {
            this.c0 = i10;
            this.x.k(i10, true, z4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(MessageObject messageObject, TLRPC.MessageMedia messageMedia, MessageObject messageObject2, int i10, String str, boolean z4) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        int i11;
        double d;
        String str2 = this.B;
        this.R = 0;
        this.S = 0;
        this.E = messageObject;
        this.Q = messageMedia;
        this.T = false;
        this.U = false;
        this.D = false;
        this.V = false;
        this.F = 0.0d;
        this.G = 0;
        this.C = str;
        this.B = null;
        this.N = null;
        int i12 = this.c;
        RadialProgress2 radialProgress2 = this.x;
        ImageReceiver imageReceiver = this.b;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), true, closestPhotoSizeWithSize, true);
                if (closestPhotoSizeWithSize2 != null) {
                    int i13 = closestPhotoSizeWithSize2.w;
                    this.R = i13;
                    int i14 = closestPhotoSizeWithSize2.h;
                    this.S = i14;
                    Locale locale = Locale.US;
                    float f10 = AndroidUtilities.density;
                    String h = e2.c.h((int) (i13 / f10), "_", (int) (i14 / f10));
                    String concat = h.concat("_b");
                    this.B = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                    imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), h, ImageLocation.getForObject(closestPhotoSizeWithSize, photo), concat, null, closestPhotoSizeWithSize2.size, null, messageObject2, 1);
                    z10 = true;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                if (messageMedia.geo != null) {
                    if (this.K == null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, j6.Pb, (j6.I.q() ? 3 : 6) * 0.12f);
                        this.K = svgThumb;
                        svgThumb.setAspectCenter(true);
                        this.L = new bq(this.K);
                    }
                    if (this.M == null) {
                        this.M = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.V = true;
                    this.R = i10;
                    int i15 = (i10 * 9) / 16;
                    this.S = i15;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f11 = AndroidUtilities.density;
                    imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, (int) (i10 / f11), (int) (i15 / f11), 15, Math.min(2, (int) Math.ceil(f11)))), (String) null, (ImageLocation) null, (String) null, this.L, messageObject2, 0);
                    z10 = true;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                this.N = new a(i12, messageObject, document, str);
                this.B = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                if (MessageObject.isMusicDocument(document)) {
                    this.U = true;
                    this.e = MessageObject.getMusicTitle(document, true);
                    this.f = MessageObject.getMusicAuthor(document, true);
                    int i16 = 0;
                    while (true) {
                        if (i16 >= document.attributes.size()) {
                            d = 0.0d;
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i16);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            d = documentAttribute.duration;
                            break;
                        }
                        i16++;
                    }
                    if (MessageObject.isDocumentHasThumb(document)) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
                        radialProgress2.j(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize3, true), closestPhotoSizeWithSize3, document, this.E);
                    } else {
                        String artworkUrl = MessageObject.getArtworkUrl(document, true);
                        if (TextUtils.isEmpty(artworkUrl)) {
                            radialProgress2.i(null, null, null);
                        } else {
                            radialProgress2.h(artworkUrl);
                        }
                    }
                    this.F = d;
                    this.h = AndroidUtilities.formatShortDuration(i() ? MediaController.getInstance().getPlayingMessageObject().audioProgressSec : 0, (int) this.F);
                    z11 = true;
                } else if (MessageObject.isVideoDocument(document)) {
                    this.G = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(document)));
                    this.D = true;
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                    float f12 = i10;
                    TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, (int) (f12 / AndroidUtilities.density), false, closestPhotoSizeWithSize4, false);
                    ImageLocation forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize4, document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize5, document);
                    int i17 = (int) (f12 / AndroidUtilities.density);
                    if (closestPhotoSizeWithSize4 != null) {
                        int i18 = closestPhotoSizeWithSize4.w;
                        this.R = i18;
                        int i19 = closestPhotoSizeWithSize4.h;
                        this.S = i19;
                        if (i18 != 0) {
                            i11 = (i19 * i17) / i18;
                            String h9 = e2.c.h(i17, "_", i11);
                            z11 = true;
                            imageReceiver.setImage(null, h9, forDocument, h9, forDocument2, h9, null, 0L, null, messageObject2, 0);
                        }
                        i11 = i17;
                        String h92 = e2.c.h(i17, "_", i11);
                        z11 = true;
                        imageReceiver.setImage(null, h92, forDocument, h92, forDocument2, h92, null, 0L, null, messageObject2, 0);
                    } else {
                        if (closestPhotoSizeWithSize5 != null) {
                            int i20 = closestPhotoSizeWithSize5.w;
                            this.R = i20;
                            int i21 = closestPhotoSizeWithSize5.h;
                            this.S = i21;
                            if (i20 != 0) {
                                i11 = (i21 * i17) / i20;
                                String h922 = e2.c.h(i17, "_", i11);
                                z11 = true;
                                imageReceiver.setImage(null, h922, forDocument, h922, forDocument2, h922, null, 0L, null, messageObject2, 0);
                            }
                        }
                        i11 = i17;
                        String h9222 = e2.c.h(i17, "_", i11);
                        z11 = true;
                        imageReceiver.setImage(null, h9222, forDocument, h9222, forDocument2, h9222, null, 0L, null, messageObject2, 0);
                    }
                } else {
                    z11 = true;
                    this.T = true;
                    this.e = FileLoader.getDocumentFileName(document);
                    String str3 = AndroidUtilities.formatFileSize(document.size) + " " + FileLoader.getDocumentExtension(document);
                    this.h = str3;
                    this.f = str3;
                }
                f(z11);
                z10 = true;
            }
            this.P = z10;
            if (!z10) {
                imageReceiver.clearImage();
            }
            if (!TextUtils.equals(str2, this.B)) {
                if (!TextUtils.isEmpty(str2)) {
                    DownloadController.getInstance(i12).removeLoadingFileObserver(this);
                }
                if (!TextUtils.isEmpty(this.B)) {
                    DownloadController.getInstance(i12).addLoadingFileObserver(this.B, this);
                }
            }
            if (!this.U) {
                radialProgress2.i(null, null, null);
                l(4, false);
            }
            n(z4);
        }
        z10 = false;
        this.P = z10;
        if (!z10) {
        }
        if (!TextUtils.equals(str2, this.B)) {
        }
        if (!this.U) {
        }
        n(z4);
    }

    public final void n(boolean z4) {
        int i10;
        if (!this.U || this.E == null) {
            return;
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        boolean i11 = i();
        this.a.a(i11, z4);
        if (playingMessageObject == null || !i11) {
            i10 = 0;
        } else {
            i10 = playingMessageObject.audioProgressSec;
            fo0 fo0Var = this.H;
            if (!fo0Var.e) {
                fo0Var.i(playingMessageObject.audioProgress);
                fo0Var.q = playingMessageObject.bufferedProgress;
            }
            fo0Var.k(playingMessageObject);
        }
        if (this.d0 != i10) {
            this.d0 = i10;
            this.h = AndroidUtilities.formatShortDuration(i10, (int) this.F);
            f(true);
            this.d.invalidate();
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
        e();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.x.o(min, true);
        a aVar = this.N;
        if (aVar != null) {
            aVar.a();
        }
        if (this.U) {
            l(min >= 1.0f ? 4 : 3, true);
        } else {
            k(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.x.o(min, true);
        a aVar = this.N;
        if (aVar != null) {
            aVar.a();
        }
        if (this.U) {
            l(min >= 1.0f ? 4 : 3, true);
        } else {
            k(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        e();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.Z = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
