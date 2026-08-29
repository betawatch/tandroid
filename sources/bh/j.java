package bh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j extends Drawable implements DownloadController.FileDownloadProgressListener, vn0 {
    public String A;
    public String B;
    public boolean C;
    public MessageObject D;
    public double E;
    public int F;
    public final wn0 G;
    public float H;
    public float I;
    public SvgHelper.SvgDrawable J;
    public yp K;
    public Drawable L;
    public a M;
    public boolean N;
    public boolean O;
    public TLRPC.MessageMedia P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int W;
    public int X;
    public final int Z;
    public final vd.a a;
    public int a0;
    public final ImageReceiver b;
    public int b0;
    public final int c;
    public int c0;
    public final s1 d;
    public String e;
    public String f;
    public String h;
    public zz0 n;
    public zz0 r;
    public zz0 s;
    public zz0 v;
    public final RadialProgress2 x;
    public final boolean y;
    public final Paint w = new Paint(1);
    public int V = 0;
    public int Y = 255;

    public j(int i10, s1 s1Var, c6 c6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.c = i10;
        this.y = z10;
        this.x = new RadialProgress2(s1Var, c6Var);
        this.d = s1Var;
        wn0 wn0Var = new wn0(s1Var);
        this.G = wn0Var;
        wn0Var.h = this;
        this.a = new vd.a(s1Var, ud.a.a, 180L);
        this.Z = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a() {
        this.b.onAttachedToWindow();
        this.x.e();
    }

    public final void b(boolean z10) {
        zz0 zz0Var = this.n;
        if (zz0Var != null) {
            zz0Var.o(g6.w0(null, z10 ? g6.Fb : g6.Dd, false));
        }
        this.w.setColor(1711276032);
        zz0 zz0Var2 = this.v;
        if (zz0Var2 != null) {
            zz0Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.J;
        if (svgDrawable != null) {
            svgDrawable.setColorKey(z10 ? g6.Pb : g6.qe);
        }
        boolean z11 = this.T;
        RadialProgress2 radialProgress2 = this.x;
        if (!z11 && !this.S) {
            radialProgress2.g(g6.le, g6.me, g6.ne, g6.oe);
            return;
        }
        wn0 wn0Var = this.G;
        if (z10) {
            int w02 = g6.w0(null, g6.wb, false);
            int w03 = g6.w0(null, g6.xb, false);
            int i10 = g6.zb;
            wn0Var.h(w02, w03, g6.w0(null, i10, false), g6.w0(null, i10, false), g6.w0(null, g6.yb, false));
            radialProgress2.g(g6.Nb, g6.Ob, g6.Pa, g6.Qa);
            return;
        }
        radialProgress2.g(g6.ie, g6.je, g6.uc, g6.vc);
        int w04 = g6.w0(null, g6.ud, false);
        int w05 = g6.w0(null, g6.vd, false);
        int i11 = g6.xd;
        wn0Var.h(w04, w05, g6.w0(null, i11, false), g6.w0(null, i11, false), g6.w0(null, g6.wd, false));
    }

    @Override // org.telegram.ui.Components.vn0
    public final void c(float f9) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f9);
            n(true);
        }
    }

    @Override // org.telegram.ui.Components.vn0
    public final void d(float f9) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f9;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f9);
            n(true);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.Y == 0 || bounds.isEmpty()) {
            return;
        }
        f(false);
        boolean z10 = this.S;
        int i10 = 2;
        RadialProgress2 radialProgress2 = this.x;
        if (z10 || this.T) {
            int i11 = bounds.left;
            boolean z11 = this.y;
            int dp = i11 + (z11 ? 0 : AndroidUtilities.dp(8.0f));
            int dp2 = bounds.top + (z11 ? 0 : AndroidUtilities.dp(3.0f));
            int dp3 = this.T ? 0 : AndroidUtilities.dp(3.0f);
            zz0 zz0Var = this.n;
            if (zz0Var != null) {
                zz0Var.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(15.0f) + dp2 + dp3);
            }
            if (this.T) {
                float f9 = this.a.e;
                if (this.r != null && f9 < 1.0f) {
                    canvas.save();
                    float f10 = 1.0f - f9;
                    int i12 = dp2 + dp3;
                    canvas.scale(f10, f10, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(35.0f) + i12);
                    this.r.a.setAlpha((int) (f10 * 255.0f));
                    this.r.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(35.0f) + i12);
                    canvas.restore();
                }
                if (f9 > 0.0f) {
                    wn0 wn0Var = this.G;
                    wn0Var.t = f9;
                    wn0Var.j(org.telegram.ui.b.u(56.0f, dp, bounds.right), AndroidUtilities.dp(30.0f));
                    canvas.save();
                    float dp4 = AndroidUtilities.dp(45.0f) + dp;
                    this.H = dp4;
                    float dp5 = AndroidUtilities.dp(21.0f) + dp2 + dp3;
                    this.I = dp5;
                    canvas.translate(dp4, dp5);
                    wn0Var.b(canvas);
                    canvas.restore();
                }
            }
            zz0 zz0Var2 = this.s;
            if (zz0Var2 != null) {
                zz0Var2.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp((this.T ? 20 : 2) + 34) + dp3 + dp2);
            }
            int dp6 = AndroidUtilities.dp(2.0f) + dp;
            this.W = dp6;
            int dp7 = AndroidUtilities.dp(5.0f) + dp2;
            this.X = dp7;
            radialProgress2.q(dp6, dp7, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(2.0f) + dp, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(5.0f) + dp2);
        } else {
            ImageReceiver imageReceiver = this.b;
            imageReceiver.setAlpha(this.Y / 255.0f);
            imageReceiver.setImageCoords(bounds);
            imageReceiver.draw(canvas);
            if (this.U && (drawable = this.L) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.L.getIntrinsicHeight() * 0.8f);
                int A = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - jr.k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                this.L.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                this.L.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                this.L.draw(canvas);
            }
            radialProgress2.q(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
            if (this.C && this.v != null) {
                canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.w);
                this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
            }
        }
        if (this.U) {
            return;
        }
        MessageObject messageObject = this.D;
        if (messageObject == null || !messageObject.isSending()) {
            a aVar = this.M;
            if (aVar == null || !aVar.g) {
                if (this.T) {
                    if (aVar != null && aVar.f) {
                        i10 = 4;
                    }
                    l(i10, true);
                } else {
                    k(g());
                }
            } else if (this.T) {
                l(3, true);
            } else {
                k(3);
            }
        } else if (ImageLoader.getInstance().getFileProgressSizes(this.B) == null) {
            radialProgress2.o(1.0f, true);
            if (this.T) {
                l(6, true);
            } else {
                k(6);
            }
        }
        if (this.T) {
            k(g());
        }
        radialProgress2.draw(canvas);
    }

    public final void e() {
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z10) {
        int width = getBounds().width() - AndroidUtilities.dp(this.y ? 64.0f : 72.0f);
        if (this.V != width || z10) {
            this.V = width;
            String str = this.e;
            if (str != null) {
                if (this.n == null) {
                    this.n = new zz0(str, 15.0f, AndroidUtilities.bold());
                }
                zz0 zz0Var = this.n;
                zz0Var.r(TextUtils.ellipsize(this.e, zz0Var.a, width, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                if (this.r == null) {
                    this.r = new zz0(str2, 14.0f, null);
                }
                zz0 zz0Var2 = this.r;
                zz0Var2.r(TextUtils.ellipsize(this.f, zz0Var2.a, width, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.s == null) {
                    this.s = new zz0(str3, 12.0f, null);
                }
                zz0 zz0Var3 = this.s;
                zz0Var3.r(TextUtils.ellipsize(this.h, zz0Var3.a, width, TextUtils.TruncateAt.END));
            }
            if (this.C && this.v == null) {
                this.v = new zz0(AndroidUtilities.formatLongDuration(this.F), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.T;
        if (z10 && this.a.f) {
            return !MediaController.getInstance().isMessagePaused() ? 1 : 0;
        }
        if (this.C || z10) {
            return 0;
        }
        if (!this.S) {
            return 4;
        }
        a aVar = this.M;
        return (aVar == null || !aVar.f) ? 2 : 5;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.Y;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.Z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i10) {
        if (this.T) {
            return AndroidUtilities.dp(63.0f);
        }
        if (this.S) {
            return AndroidUtilities.dp(56.0f);
        }
        int i11 = this.Q;
        if (i11 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return Math.min(Math.round((i10 / i11) * this.R), this.y ? (i10 * 4) / 5 : (i10 * 5) / 4);
    }

    public final boolean i() {
        return this.T && MediaController.getInstance().isPlayingMessage(this.D) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.y;
    }

    public final boolean j(float f9, float f10, int i10) {
        if (!this.T || this.b0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            if (f9 >= this.W + dp2 && f9 <= r4 + dp) {
                if (f10 >= this.X + dp2 && f10 <= r7 + dp) {
                    this.N = true;
                    return true;
                }
            }
        }
        boolean z10 = this.N;
        if (z10) {
            if (i10 == 1) {
                a aVar = this.M;
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
                this.N = false;
                return true;
            }
            if (i10 == 3) {
                this.N = false;
                return true;
            }
        }
        return z10;
    }

    public final void k(int i10) {
        if (this.a0 != i10) {
            this.a0 = i10;
            this.x.setIcon(i10, true, true);
        }
    }

    public final void l(int i10, boolean z10) {
        if (this.b0 != i10) {
            this.b0 = i10;
            this.x.k(i10, true, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(MessageObject messageObject, TLRPC.MessageMedia messageMedia, MessageObject messageObject2, int i10, String str, boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        int i11;
        double d;
        String str2 = this.A;
        this.Q = 0;
        this.R = 0;
        this.D = messageObject;
        this.P = messageMedia;
        this.S = false;
        this.T = false;
        this.C = false;
        this.U = false;
        this.E = 0.0d;
        this.F = 0;
        this.B = str;
        this.A = null;
        this.M = null;
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
                    this.Q = i13;
                    int i14 = closestPhotoSizeWithSize2.h;
                    this.R = i14;
                    Locale locale = Locale.US;
                    float f9 = AndroidUtilities.density;
                    String k9 = com.google.android.recaptcha.internal.a.k((int) (i13 / f9), "_", (int) (i14 / f9));
                    String concat = k9.concat("_b");
                    this.A = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                    imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), k9, ImageLocation.getForObject(closestPhotoSizeWithSize, photo), concat, null, closestPhotoSizeWithSize2.size, null, messageObject2, 1);
                    z11 = true;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                if (messageMedia.geo != null) {
                    if (this.J == null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, g6.Pb, (g6.I.q() ? 3 : 6) * 0.12f);
                        this.J = svgThumb;
                        svgThumb.setAspectCenter(true);
                        this.K = new yp(this.J);
                    }
                    if (this.L == null) {
                        this.L = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.U = true;
                    this.Q = i10;
                    int i15 = (i10 * 9) / 16;
                    this.R = i15;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f10 = AndroidUtilities.density;
                    imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, (int) (i10 / f10), (int) (i15 / f10), 15, Math.min(2, (int) Math.ceil(f10)))), (String) null, (ImageLocation) null, (String) null, this.K, messageObject2, 0);
                    z11 = true;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                this.M = new a(i12, messageObject, document, str);
                this.A = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                if (MessageObject.isMusicDocument(document)) {
                    this.T = true;
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
                        radialProgress2.j(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize3, true), closestPhotoSizeWithSize3, document, this.D);
                    } else {
                        String artworkUrl = MessageObject.getArtworkUrl(document, true);
                        if (TextUtils.isEmpty(artworkUrl)) {
                            radialProgress2.i(null, null, null);
                        } else {
                            radialProgress2.h(artworkUrl);
                        }
                    }
                    this.E = d;
                    this.h = AndroidUtilities.formatShortDuration(i() ? MediaController.getInstance().getPlayingMessageObject().audioProgressSec : 0, (int) this.E);
                    z12 = true;
                } else if (MessageObject.isVideoDocument(document)) {
                    this.F = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(document)));
                    this.C = true;
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                    float f11 = i10;
                    TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, (int) (f11 / AndroidUtilities.density), false, closestPhotoSizeWithSize4, false);
                    ImageLocation forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize4, document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize5, document);
                    int i17 = (int) (f11 / AndroidUtilities.density);
                    if (closestPhotoSizeWithSize4 != null) {
                        int i18 = closestPhotoSizeWithSize4.w;
                        this.Q = i18;
                        int i19 = closestPhotoSizeWithSize4.h;
                        this.R = i19;
                        if (i18 != 0) {
                            i11 = (i19 * i17) / i18;
                            String k10 = com.google.android.recaptcha.internal.a.k(i17, "_", i11);
                            z12 = true;
                            imageReceiver.setImage(null, k10, forDocument, k10, forDocument2, k10, null, 0L, null, messageObject2, 0);
                        }
                        i11 = i17;
                        String k102 = com.google.android.recaptcha.internal.a.k(i17, "_", i11);
                        z12 = true;
                        imageReceiver.setImage(null, k102, forDocument, k102, forDocument2, k102, null, 0L, null, messageObject2, 0);
                    } else {
                        if (closestPhotoSizeWithSize5 != null) {
                            int i20 = closestPhotoSizeWithSize5.w;
                            this.Q = i20;
                            int i21 = closestPhotoSizeWithSize5.h;
                            this.R = i21;
                            if (i20 != 0) {
                                i11 = (i21 * i17) / i20;
                                String k1022 = com.google.android.recaptcha.internal.a.k(i17, "_", i11);
                                z12 = true;
                                imageReceiver.setImage(null, k1022, forDocument, k1022, forDocument2, k1022, null, 0L, null, messageObject2, 0);
                            }
                        }
                        i11 = i17;
                        String k10222 = com.google.android.recaptcha.internal.a.k(i17, "_", i11);
                        z12 = true;
                        imageReceiver.setImage(null, k10222, forDocument, k10222, forDocument2, k10222, null, 0L, null, messageObject2, 0);
                    }
                } else {
                    z12 = true;
                    this.S = true;
                    this.e = FileLoader.getDocumentFileName(document);
                    String str3 = AndroidUtilities.formatFileSize(document.size) + " " + FileLoader.getDocumentExtension(document);
                    this.h = str3;
                    this.f = str3;
                }
                f(z12);
                z11 = true;
            }
            this.O = z11;
            if (!z11) {
                imageReceiver.clearImage();
            }
            if (!TextUtils.equals(str2, this.A)) {
                if (!TextUtils.isEmpty(str2)) {
                    DownloadController.getInstance(i12).removeLoadingFileObserver(this);
                }
                if (!TextUtils.isEmpty(this.A)) {
                    DownloadController.getInstance(i12).addLoadingFileObserver(this.A, this);
                }
            }
            if (!this.T) {
                radialProgress2.i(null, null, null);
                l(4, false);
            }
            n(z10);
        }
        z11 = false;
        this.O = z11;
        if (!z11) {
        }
        if (!TextUtils.equals(str2, this.A)) {
        }
        if (!this.T) {
        }
        n(z10);
    }

    public final void n(boolean z10) {
        int i10;
        if (!this.T || this.D == null) {
            return;
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        boolean i11 = i();
        this.a.a(i11, z10);
        if (playingMessageObject == null || !i11) {
            i10 = 0;
        } else {
            i10 = playingMessageObject.audioProgressSec;
            wn0 wn0Var = this.G;
            if (!wn0Var.e) {
                wn0Var.i(playingMessageObject.audioProgress);
                wn0Var.q = playingMessageObject.bufferedProgress;
            }
            wn0Var.k(playingMessageObject);
        }
        if (this.c0 != i10) {
            this.c0 = i10;
            this.h = AndroidUtilities.formatShortDuration(i10, (int) this.E);
            f(true);
            this.d.invalidate();
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        e();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.x.o(min, true);
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        if (this.T) {
            l(min >= 1.0f ? 4 : 3, true);
        } else {
            k(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.x.o(min, true);
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        if (this.T) {
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
        this.Y = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
