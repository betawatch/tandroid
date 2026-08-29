package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.j9 {
    public boolean A;
    public int B;
    public int C;
    public TLRPC.PhotoSize D;
    public String E;
    public TLRPC.PhotoSize F;
    public String G;
    public TLRPC.Photo H;
    public final int I;
    public TL_iv.pageBlockPhoto J;
    public TLObject K;
    public TL_iv.PageBlock L;
    public boolean M;
    public MessageObject.GroupedMessagePosition N;
    public Drawable O;
    public boolean P;
    public final d70 a;
    public final k4 b;
    public f3 c;
    public f3 d;
    public final ImageReceiver e;
    public final RadialProgress2 f;
    public final g1 h;
    public final int n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public g2(Context context, d70 d70Var, k4 k4Var, int i10) {
        super(context);
        this.a = d70Var;
        this.b = k4Var;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        g1 g1Var = new g1(context, d70Var, k4Var, 1);
        this.h = g1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.I = DownloadController.getInstance(((m4) d70Var).T).generateObserverTag();
        addView(g1Var, i7.f6.c(-2.0f, -1));
        this.n = i10;
    }

    private int getIconForCurrentState() {
        int i10 = this.B;
        if (i10 == 0) {
            return 2;
        }
        return i10 == 1 ? 3 : 4;
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z10, boolean z11) {
        this.L = null;
        this.J = pageblockphoto;
        this.K = tLObject;
        this.M = z10;
        this.r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.J.url)) {
            this.O = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.J;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = j4.d(pageblockphoto2.photo_id, this.K);
            if (d != null) {
                this.D = FileLoader.getClosestPhotoSizeWithSize(d.sizes, AndroidUtilities.getPhotoSize());
            } else {
                this.D = null;
            }
        } else {
            this.D = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z10) {
        int i10 = ((m4) this.a).T;
        String attachFileName = FileLoader.getAttachFileName(this.D);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.D, true);
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.D, false);
        boolean z11 = pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists());
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.B = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            float f9 = 0.0f;
            if (this.P || FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.B = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f9 = fileProgress.floatValue();
                }
            } else {
                this.B = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            radialProgress2.o(f9, false);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Cells.j9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    public View getChannelCell() {
        return this.h;
    }

    public TL_iv.pageBlockPhoto getCurrentBlock() {
        return this.J;
    }

    public TLObject getCurrentPage() {
        return this.K;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.onAttachedToWindow();
        b(false);
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        DownloadController.getInstance(((m4) this.a).T).removeLoadingFileObserver(this);
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.J == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver.hasBitmapImage() && imageReceiver.getCurrentAlpha() == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), m4.k1);
        }
        imageReceiver.draw(canvas2);
        if (imageReceiver.getVisible()) {
            this.f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.J.url) && !(this.H instanceof org.telegram.ui.web.e2)) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            int imageY = (int) (imageReceiver.getImageY() + AndroidUtilities.dp(11.0f));
            this.O.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
            this.O.draw(canvas2);
        }
        f3 f3Var = this.c;
        d70 d70Var = this.a;
        int i10 = 0;
        if (f3Var != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v);
            m4.v(d70Var, canvas2, this, 0);
            this.c.draw(canvas2, this);
            canvas2.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v + this.w);
            m4.v(d70Var, canvas2, this, i10);
            this.d.draw(canvas2, this);
            canvas2.restore();
        }
        m4.u(canvas2, d70Var, this.J, getMeasuredHeight());
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        b(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AttachPhoto));
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        TL_iv.pageBlockPhoto pageblockphoto;
        int dp;
        int i14;
        int i15;
        int i16;
        k4 k4Var;
        ArrayList arrayList;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int size = View.MeasureSpec.getSize(i10);
        int i23 = this.n;
        int i24 = 1;
        if (i23 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i13 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i23 != 2) {
                i12 = size;
                i13 = 0;
                pageblockphoto = this.J;
                ImageReceiver imageReceiver = this.e;
                if (pageblockphoto != null) {
                    this.H = j4.d(pageblockphoto.photo_id, this.K);
                    int dp2 = AndroidUtilities.dp(48.0f);
                    if (i23 != 0 || (i22 = this.J.level) <= 0) {
                        this.s = AndroidUtilities.dp(18.0f);
                        dp = i12 - AndroidUtilities.dp(36.0f);
                        i14 = i12;
                        i15 = 0;
                    } else {
                        i15 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i22 * 14);
                        this.s = i15;
                        i14 = b.u(18.0f, i15, i12);
                        dp = i14;
                    }
                    TLRPC.Photo photo = this.H;
                    k4 k4Var2 = this.b;
                    if (photo == null || (this.D == null && !(photo instanceof org.telegram.ui.web.e2))) {
                        i16 = i13;
                    } else {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40, true);
                        this.F = closestPhotoSizeWithSize;
                        TLRPC.PhotoSize photoSize = this.D;
                        if (photoSize == closestPhotoSizeWithSize) {
                            this.F = null;
                        }
                        TLRPC.Photo photo2 = this.H;
                        if (photo2 instanceof org.telegram.ui.web.e2) {
                            org.telegram.ui.web.e2 e2Var = (org.telegram.ui.web.e2) photo2;
                            i17 = e2Var.d;
                            i18 = e2Var.e;
                        } else {
                            int i25 = photoSize.w;
                            int i26 = photoSize.h;
                            i17 = i25;
                            i18 = i26;
                        }
                        if (i23 == 0) {
                            float f9 = i17;
                            float f10 = i18;
                            i13 = (int) ((i14 / f9) * f10);
                            if (this.L instanceof TL_iv.pageBlockCover) {
                                i13 = Math.min(i13, i14);
                            } else {
                                Point point = AndroidUtilities.displaySize;
                                int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i13 > max) {
                                    i14 = (int) ((max / f10) * f9);
                                    i15 += ((i12 - i15) - i14) / 2;
                                    i13 = max;
                                }
                            }
                        } else if (i23 == 2) {
                            if ((this.N.flags & 2) == 0) {
                                i14 -= AndroidUtilities.dp(2.0f);
                            }
                            int dp3 = (this.N.flags & 8) == 0 ? i13 - AndroidUtilities.dp(2.0f) : i13;
                            if (this.N.leftSpanOffset != 0) {
                                int ceil = (int) Math.ceil((r7 * i12) / 1000.0f);
                                i14 -= ceil;
                                i15 += ceil;
                            }
                            int i27 = i14;
                            i19 = i13;
                            i13 = dp3;
                            i20 = i15;
                            i21 = i27;
                            imageReceiver.setImageCoords(i20, (!this.r || i23 == 1 || i23 == 2 || this.J.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i21, i13);
                            if (i23 != 0) {
                                this.E = null;
                            } else {
                                Locale locale = Locale.US;
                                this.E = com.google.android.recaptcha.internal.a.k(i21, "_", i13);
                            }
                            this.G = "80_80_b";
                            m4 m4Var = (m4) this.a;
                            this.P = (DownloadController.getInstance(m4Var.T).getCurrentDownloadMask() & 1) == 0;
                            if (!this.M) {
                                if (this.H instanceof org.telegram.ui.web.e2) {
                                    this.P = true;
                                    imageReceiver.setStrippedLocation(null);
                                    org.telegram.ui.web.f2.g((org.telegram.ui.web.e2) this.H, imageReceiver, new it0(this, 9));
                                } else {
                                    File pathToAttach = FileLoader.getInstance(m4Var.T).getPathToAttach(this.D, true);
                                    if (this.P || pathToAttach.exists()) {
                                        imageReceiver.setStrippedLocation(null);
                                        imageReceiver.setImage(ImageLocation.getForPhoto(this.D, this.H), this.E, ImageLocation.getForPhoto(this.F, this.H), this.G, this.D.size, null, k4Var2 != null ? k4Var2.A : null, 1);
                                    } else {
                                        imageReceiver.setStrippedLocation(ImageLocation.getForPhoto(this.D, this.H));
                                        imageReceiver.setImage(null, this.E, ImageLocation.getForPhoto(this.F, this.H), this.G, this.D.size, null, k4Var2 != null ? k4Var2.A : null, 1);
                                    }
                                }
                            }
                            float f11 = dp2;
                            this.x = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), f11, 2.0f, imageReceiver.getImageX());
                            int imageHeight = (int) (((imageReceiver.getImageHeight() - f11) / 2.0f) + imageReceiver.getImageY());
                            this.y = imageHeight;
                            int i28 = this.x;
                            this.f.q(i28, imageHeight, i28 + dp2, dp2 + imageHeight);
                            i16 = i19;
                        }
                        i20 = i15;
                        i21 = i14;
                        i19 = i13;
                        imageReceiver.setImageCoords(i20, (!this.r || i23 == 1 || i23 == 2 || this.J.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i21, i13);
                        if (i23 != 0) {
                        }
                        this.G = "80_80_b";
                        m4 m4Var2 = (m4) this.a;
                        this.P = (DownloadController.getInstance(m4Var2.T).getCurrentDownloadMask() & 1) == 0;
                        if (!this.M) {
                        }
                        float f112 = dp2;
                        this.x = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), f112, 2.0f, imageReceiver.getImageX());
                        int imageHeight2 = (int) (((imageReceiver.getImageHeight() - f112) / 2.0f) + imageReceiver.getImageY());
                        this.y = imageHeight2;
                        int i282 = this.x;
                        this.f.q(i282, imageHeight2, i282 + dp2, dp2 + imageHeight2);
                        i16 = i19;
                    }
                    int imageHeight3 = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
                    this.v = imageHeight3;
                    if (i23 == 0) {
                        TL_iv.pageBlockPhoto pageblockphoto2 = this.J;
                        f3 q6 = m4.q(this.a, this, null, pageblockphoto2.caption.text, dp, imageHeight3, pageblockphoto2, this.b);
                        this.c = q6;
                        if (q6 != null) {
                            int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                            this.w = height;
                            i16 = org.telegram.messenger.x3.C(4.0f, height, i16);
                        }
                        int i29 = i16;
                        TL_iv.pageBlockPhoto pageblockphoto3 = this.J;
                        k4Var = k4Var2;
                        f3 p10 = m4.p(this.a, this, null, pageblockphoto3.caption.credit, dp, this.v + this.w, pageblockphoto3, (k4Var2 == null || !k4Var2.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.bw0.a(), 0, this.b);
                        this.d = p10;
                        i16 = p10 != null ? this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i29 : i29;
                    } else {
                        k4Var = k4Var2;
                    }
                    if (!this.r && i23 == 0 && this.J.level <= 0) {
                        i16 += AndroidUtilities.dp(8.0f);
                    }
                    i24 = (i23 == 2 || ((this.L instanceof TL_iv.pageBlockCover) && k4Var != null && (arrayList = k4Var.e) != null && arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel))) ? i16 : AndroidUtilities.dp(8.0f) + i16;
                    f3 f3Var = this.c;
                    if (f3Var != null) {
                        f3Var.s = this.s;
                        f3Var.v = this.v;
                    }
                    f3 f3Var2 = this.d;
                    if (f3Var2 != null) {
                        f3Var2.s = this.s;
                        f3Var2.v = this.v + this.w;
                    }
                }
                g1 g1Var = this.h;
                g1Var.measure(i10, i11);
                g1Var.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
                setMeasuredDimension(i12, i24);
            }
            float f12 = this.N.ph;
            Point point2 = AndroidUtilities.displaySize;
            i13 = (int) Math.ceil(f12 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i12 = size;
        pageblockphoto = this.J;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockphoto != null) {
        }
        g1 g1Var2 = this.h;
        g1Var2.measure(i10, i11);
        g1Var2.setTranslationY(imageReceiver2.getImageHeight() - AndroidUtilities.dp(39.0f));
        setMeasuredDimension(i12, i24);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f.o(Math.min(1.0f, j10 / j11), true);
        if (this.B != 1) {
            b(true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.f.o(1.0f, true);
        b(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r1 <= (org.telegram.messenger.AndroidUtilities.dp(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        g1 g1Var = this.h;
        int visibility = g1Var.getVisibility();
        k4 k4Var = this.b;
        if (visibility != 0 || y8 <= g1Var.getTranslationY() || y8 >= g1Var.getTranslationY() + AndroidUtilities.dp(39.0f)) {
            int action = motionEvent.getAction();
            ImageReceiver imageReceiver = this.e;
            if (action == 0 && imageReceiver.isInsideImage(x4, y8)) {
                if (this.B != -1) {
                    if (x4 >= this.x && x4 <= AndroidUtilities.dp(48.0f) + r2) {
                        if (y8 >= this.y) {
                        }
                    }
                }
                if (this.B != 0) {
                    this.A = true;
                }
                this.C = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.A) {
                    this.A = false;
                    this.a.d(this.J, k4Var);
                } else if (this.C == 1) {
                    this.C = 0;
                    playSoundEffect(0);
                    if (this.D != null) {
                        int i10 = this.B;
                        RadialProgress2 radialProgress2 = this.f;
                        if (i10 == 0) {
                            radialProgress2.o(0.0f, true);
                            imageReceiver.setImage(ImageLocation.getForPhoto(this.D, this.H), this.E, ImageLocation.getForPhoto(this.F, this.H), this.G, this.D.size, null, this.K, 1);
                            this.B = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i10 == 1) {
                            imageReceiver.cancelLoadImage();
                            this.B = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.A = false;
                this.C = 0;
            }
            if (!this.A && this.C == 0) {
                if (!m4.l(this.a, this.b, motionEvent, this, this.c, this.s, this.v)) {
                    if (!m4.l(this.a, this.b, motionEvent, this, this.d, this.s, this.v + this.w) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (k4Var != null && k4Var.B != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.L = pageBlock;
        k4 k4Var = this.b;
        if (k4Var == null || (pageblockchannel = k4Var.B) == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
            return;
        }
        g1 g1Var = this.h;
        g1Var.setBlock(pageblockchannel);
        g1Var.setVisibility(0);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
