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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.p9 {
    public boolean E;
    public int F;
    public int G;
    public TLRPC.PhotoSize H;
    public String I;
    public TLRPC.PhotoSize J;
    public String K;
    public TLRPC.Photo L;
    public final int M;
    public TL_iv.pageBlockPhoto N;
    public TLObject O;
    public TL_iv.PageBlock P;
    public boolean Q;
    public MessageObject.GroupedMessagePosition R;
    public Drawable S;
    public boolean T;
    public final v70 a;
    public final g4 b;
    public b3 c;
    public b3 d;
    public final ImageReceiver e;
    public final RadialProgress2 f;
    public final d1 h;
    public final int n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public d2(Context context, v70 v70Var, g4 g4Var, int i10) {
        super(context);
        this.a = v70Var;
        this.b = g4Var;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        d1 d1Var = new d1(context, v70Var, g4Var, 1);
        this.h = d1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.M = DownloadController.getInstance(((i4) v70Var).X).generateObserverTag();
        addView(d1Var, w7.x5.c(-2.0f, -1));
        this.n = i10;
    }

    private int getIconForCurrentState() {
        int i10 = this.F;
        if (i10 == 0) {
            return 2;
        }
        return i10 == 1 ? 3 : 4;
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z10, boolean z11) {
        this.P = null;
        this.N = pageblockphoto;
        this.O = tLObject;
        this.Q = z10;
        this.r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.N.url)) {
            this.S = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.N;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = f4.d(pageblockphoto2.photo_id, this.O);
            if (d != null) {
                this.H = FileLoader.getClosestPhotoSizeWithSize(d.sizes, AndroidUtilities.getPhotoSize());
            } else {
                this.H = null;
            }
        } else {
            this.H = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z10) {
        int i10 = ((i4) this.a).X;
        String attachFileName = FileLoader.getAttachFileName(this.H);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.H, true);
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.H, false);
        boolean z11 = pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists());
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.F = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            float f7 = 0.0f;
            if (this.T || FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.F = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f7 = fileProgress.floatValue();
                }
            } else {
                this.F = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            radialProgress2.o(f7, false);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    public View getChannelCell() {
        return this.h;
    }

    public TL_iv.pageBlockPhoto getCurrentBlock() {
        return this.N;
    }

    public TLObject getCurrentPage() {
        return this.O;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.onAttachedToWindow();
        b(false);
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        DownloadController.getInstance(((i4) this.a).X).removeLoadingFileObserver(this);
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.N == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver.hasBitmapImage() && imageReceiver.getCurrentAlpha() == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), i4.o1);
        }
        imageReceiver.draw(canvas2);
        if (imageReceiver.getVisible()) {
            this.f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.N.url) && !(this.L instanceof org.telegram.ui.web.i2)) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            int imageY = (int) (imageReceiver.getImageY() + AndroidUtilities.dp(11.0f));
            this.S.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
            this.S.draw(canvas2);
        }
        b3 b3Var = this.c;
        v70 v70Var = this.a;
        int i10 = 0;
        if (b3Var != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v);
            i4.v(v70Var, canvas2, this, 0);
            this.c.draw(canvas2, this);
            canvas2.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v + this.w);
            i4.v(v70Var, canvas2, this, i10);
            this.d.draw(canvas2, this);
            canvas2.restore();
        }
        i4.u(canvas2, v70Var, this.N, getMeasuredHeight());
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
        g4 g4Var;
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
                pageblockphoto = this.N;
                ImageReceiver imageReceiver = this.e;
                if (pageblockphoto != null) {
                    this.L = f4.d(pageblockphoto.photo_id, this.O);
                    int dp2 = AndroidUtilities.dp(48.0f);
                    if (i23 != 0 || (i22 = this.N.level) <= 0) {
                        this.s = AndroidUtilities.dp(18.0f);
                        dp = i12 - AndroidUtilities.dp(36.0f);
                        i14 = i12;
                        i15 = 0;
                    } else {
                        i15 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i22 * 14);
                        this.s = i15;
                        i14 = org.telegram.messenger.vl.v(18.0f, i15, i12);
                        dp = i14;
                    }
                    TLRPC.Photo photo = this.L;
                    g4 g4Var2 = this.b;
                    if (photo == null || (this.H == null && !(photo instanceof org.telegram.ui.web.i2))) {
                        i16 = i13;
                    } else {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40, true);
                        this.J = closestPhotoSizeWithSize;
                        TLRPC.PhotoSize photoSize = this.H;
                        if (photoSize == closestPhotoSizeWithSize) {
                            this.J = null;
                        }
                        TLRPC.Photo photo2 = this.L;
                        if (photo2 instanceof org.telegram.ui.web.i2) {
                            org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) photo2;
                            i17 = i2Var.d;
                            i18 = i2Var.e;
                        } else {
                            int i25 = photoSize.w;
                            int i26 = photoSize.h;
                            i17 = i25;
                            i18 = i26;
                        }
                        if (i23 == 0) {
                            float f7 = i17;
                            float f10 = i18;
                            i13 = (int) ((i14 / f7) * f10);
                            if (this.P instanceof TL_iv.pageBlockCover) {
                                i13 = Math.min(i13, i14);
                            } else {
                                Point point = AndroidUtilities.displaySize;
                                int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i13 > max) {
                                    i14 = (int) ((max / f10) * f7);
                                    i15 += ((i12 - i15) - i14) / 2;
                                    i13 = max;
                                }
                            }
                        } else if (i23 == 2) {
                            if ((this.R.flags & 2) == 0) {
                                i14 -= AndroidUtilities.dp(2.0f);
                            }
                            int dp3 = (this.R.flags & 8) == 0 ? i13 - AndroidUtilities.dp(2.0f) : i13;
                            if (this.R.leftSpanOffset != 0) {
                                int ceil = (int) Math.ceil((r7 * i12) / 1000.0f);
                                i14 -= ceil;
                                i15 += ceil;
                            }
                            int i27 = i14;
                            i19 = i13;
                            i13 = dp3;
                            i20 = i15;
                            i21 = i27;
                            imageReceiver.setImageCoords(i20, (!this.r || i23 == 1 || i23 == 2 || this.N.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i21, i13);
                            if (i23 != 0) {
                                this.I = null;
                            } else {
                                Locale locale = Locale.US;
                                this.I = a4.a.k(i21, i13, "_");
                            }
                            this.K = "80_80_b";
                            i4 i4Var = (i4) this.a;
                            this.T = (DownloadController.getInstance(i4Var.X).getCurrentDownloadMask() & 1) == 0;
                            if (!this.Q) {
                                if (this.L instanceof org.telegram.ui.web.i2) {
                                    this.T = true;
                                    imageReceiver.setStrippedLocation(null);
                                    org.telegram.ui.web.j2.g((org.telegram.ui.web.i2) this.L, imageReceiver, new lu0(this, 9));
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i4Var.X).getPathToAttach(this.H, true);
                                    if (this.T || pathToAttach.exists()) {
                                        imageReceiver.setStrippedLocation(null);
                                        imageReceiver.setImage(ImageLocation.getForPhoto(this.H, this.L), this.I, ImageLocation.getForPhoto(this.J, this.L), this.K, this.H.size, null, g4Var2 != null ? g4Var2.E : null, 1);
                                    } else {
                                        imageReceiver.setStrippedLocation(ImageLocation.getForPhoto(this.H, this.L));
                                        imageReceiver.setImage(null, this.I, ImageLocation.getForPhoto(this.J, this.L), this.K, this.H.size, null, g4Var2 != null ? g4Var2.E : null, 1);
                                    }
                                }
                            }
                            float f11 = dp2;
                            this.x = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageWidth(), f11, 2.0f, imageReceiver.getImageX());
                            int imageHeight = (int) (((imageReceiver.getImageHeight() - f11) / 2.0f) + imageReceiver.getImageY());
                            this.y = imageHeight;
                            int i28 = this.x;
                            this.f.q(i28, imageHeight, i28 + dp2, dp2 + imageHeight);
                            i16 = i19;
                        }
                        i20 = i15;
                        i21 = i14;
                        i19 = i13;
                        imageReceiver.setImageCoords(i20, (!this.r || i23 == 1 || i23 == 2 || this.N.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i21, i13);
                        if (i23 != 0) {
                        }
                        this.K = "80_80_b";
                        i4 i4Var2 = (i4) this.a;
                        this.T = (DownloadController.getInstance(i4Var2.X).getCurrentDownloadMask() & 1) == 0;
                        if (!this.Q) {
                        }
                        float f112 = dp2;
                        this.x = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageWidth(), f112, 2.0f, imageReceiver.getImageX());
                        int imageHeight2 = (int) (((imageReceiver.getImageHeight() - f112) / 2.0f) + imageReceiver.getImageY());
                        this.y = imageHeight2;
                        int i282 = this.x;
                        this.f.q(i282, imageHeight2, i282 + dp2, dp2 + imageHeight2);
                        i16 = i19;
                    }
                    int imageHeight3 = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
                    this.v = imageHeight3;
                    if (i23 == 0) {
                        TL_iv.pageBlockPhoto pageblockphoto2 = this.N;
                        b3 q6 = i4.q(this.a, this, null, pageblockphoto2.caption.text, dp, imageHeight3, pageblockphoto2, this.b);
                        this.c = q6;
                        if (q6 != null) {
                            int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                            this.w = height;
                            i16 = org.telegram.messenger.w1.C(4.0f, height, i16);
                        }
                        int i29 = i16;
                        TL_iv.pageBlockPhoto pageblockphoto3 = this.N;
                        g4Var = g4Var2;
                        b3 p5 = i4.p(this.a, this, null, pageblockphoto3.caption.credit, dp, this.v + this.w, pageblockphoto3, (g4Var2 == null || !g4Var2.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.iw0.a(), 0, this.b);
                        this.d = p5;
                        i16 = p5 != null ? this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i29 : i29;
                    } else {
                        g4Var = g4Var2;
                    }
                    if (!this.r && i23 == 0 && this.N.level <= 0) {
                        i16 += AndroidUtilities.dp(8.0f);
                    }
                    i24 = (i23 == 2 || ((this.P instanceof TL_iv.pageBlockCover) && g4Var != null && (arrayList = g4Var.e) != null && arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel))) ? i16 : AndroidUtilities.dp(8.0f) + i16;
                    b3 b3Var = this.c;
                    if (b3Var != null) {
                        b3Var.s = this.s;
                        b3Var.v = this.v;
                    }
                    b3 b3Var2 = this.d;
                    if (b3Var2 != null) {
                        b3Var2.s = this.s;
                        b3Var2.v = this.v + this.w;
                    }
                }
                d1 d1Var = this.h;
                d1Var.measure(i10, i11);
                d1Var.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
                setMeasuredDimension(i12, i24);
            }
            float f12 = this.R.ph;
            Point point2 = AndroidUtilities.displaySize;
            i13 = (int) Math.ceil(f12 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i12 = size;
        pageblockphoto = this.N;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockphoto != null) {
        }
        d1 d1Var2 = this.h;
        d1Var2.measure(i10, i11);
        d1Var2.setTranslationY(imageReceiver2.getImageHeight() - AndroidUtilities.dp(39.0f));
        setMeasuredDimension(i12, i24);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f.o(Math.min(1.0f, j3 / j10), true);
        if (this.F != 1) {
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
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        d1 d1Var = this.h;
        int visibility = d1Var.getVisibility();
        g4 g4Var = this.b;
        if (visibility != 0 || y3 <= d1Var.getTranslationY() || y3 >= d1Var.getTranslationY() + AndroidUtilities.dp(39.0f)) {
            int action = motionEvent.getAction();
            ImageReceiver imageReceiver = this.e;
            if (action == 0 && imageReceiver.isInsideImage(x10, y3)) {
                if (this.F != -1) {
                    if (x10 >= this.x && x10 <= AndroidUtilities.dp(48.0f) + r2) {
                        if (y3 >= this.y) {
                        }
                    }
                }
                if (this.F != 0) {
                    this.E = true;
                }
                this.G = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.E) {
                    this.E = false;
                    this.a.d(this.N, g4Var);
                } else if (this.G == 1) {
                    this.G = 0;
                    playSoundEffect(0);
                    if (this.H != null) {
                        int i10 = this.F;
                        RadialProgress2 radialProgress2 = this.f;
                        if (i10 == 0) {
                            radialProgress2.o(0.0f, true);
                            imageReceiver.setImage(ImageLocation.getForPhoto(this.H, this.L), this.I, ImageLocation.getForPhoto(this.J, this.L), this.K, this.H.size, null, this.O, 1);
                            this.F = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i10 == 1) {
                            imageReceiver.cancelLoadImage();
                            this.F = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.E = false;
                this.G = 0;
            }
            if (!this.E && this.G == 0) {
                if (!i4.l(this.a, this.b, motionEvent, this, this.c, this.s, this.v)) {
                    if (!i4.l(this.a, this.b, motionEvent, this, this.d, this.s, this.v + this.w) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (g4Var != null && g4Var.F != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.P = pageBlock;
        g4 g4Var = this.b;
        if (g4Var == null || (pageblockchannel = g4Var.F) == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
            return;
        }
        d1 d1Var = this.h;
        d1Var.setBlock(pageblockchannel);
        d1Var.setVisibility(0);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
