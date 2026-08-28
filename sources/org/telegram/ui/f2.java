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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.m9 {
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
    public final a70 a;
    public final j4 b;
    public e3 c;
    public e3 d;
    public final ImageReceiver e;
    public final RadialProgress2 f;
    public final f1 h;
    public final int n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public f2(Context context, a70 a70Var, j4 j4Var, int i9) {
        super(context);
        this.a = a70Var;
        this.b = j4Var;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        f1 f1Var = new f1(context, a70Var, j4Var, 1);
        this.h = f1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.I = DownloadController.getInstance(((l4) a70Var).T).generateObserverTag();
        addView(f1Var, g7.e6.c(-2.0f, -1));
        this.n = i9;
    }

    private int getIconForCurrentState() {
        int i9 = this.B;
        if (i9 == 0) {
            return 2;
        }
        return i9 == 1 ? 3 : 4;
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
            TLRPC.Photo d = i4.d(pageblockphoto2.photo_id, this.K);
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
        int i9 = ((l4) this.a).T;
        String attachFileName = FileLoader.getAttachFileName(this.D);
        File pathToAttach = FileLoader.getInstance(i9).getPathToAttach(this.D, true);
        File pathToAttach2 = FileLoader.getInstance(i9).getPathToAttach(this.D, false);
        boolean z11 = pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists());
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i9).removeLoadingFileObserver(this);
            this.B = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, null, this);
            float f10 = 0.0f;
            if (this.P || FileLoader.getInstance(i9).isLoadingFile(attachFileName)) {
                this.B = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f10 = fileProgress.floatValue();
                }
            } else {
                this.B = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            radialProgress2.o(f10, false);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
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
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        DownloadController.getInstance(((l4) this.a).T).removeLoadingFileObserver(this);
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.detach(this);
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
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), l4.k1);
        }
        imageReceiver.draw(canvas2);
        if (imageReceiver.getVisible()) {
            this.f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.J.url) && !(this.H instanceof org.telegram.ui.web.c2)) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            int imageY = (int) (imageReceiver.getImageY() + AndroidUtilities.dp(11.0f));
            this.O.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
            this.O.draw(canvas2);
        }
        e3 e3Var = this.c;
        a70 a70Var = this.a;
        int i9 = 0;
        if (e3Var != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v);
            l4.v(a70Var, canvas2, this, 0);
            this.c.draw(canvas2, this);
            canvas2.restore();
            i9 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v + this.w);
            l4.v(a70Var, canvas2, this, i9);
            this.d.draw(canvas2, this);
            canvas2.restore();
        }
        l4.u(canvas2, a70Var, this.J, getMeasuredHeight());
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        TL_iv.pageBlockPhoto pageblockphoto;
        int dp;
        int i13;
        int i14;
        int i15;
        j4 j4Var;
        ArrayList arrayList;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int size = View.MeasureSpec.getSize(i9);
        int i22 = this.n;
        int i23 = 1;
        if (i22 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i12 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i22 != 2) {
                i11 = size;
                i12 = 0;
                pageblockphoto = this.J;
                ImageReceiver imageReceiver = this.e;
                if (pageblockphoto != null) {
                    this.H = i4.d(pageblockphoto.photo_id, this.K);
                    int dp2 = AndroidUtilities.dp(48.0f);
                    if (i22 != 0 || (i21 = this.J.level) <= 0) {
                        this.s = AndroidUtilities.dp(18.0f);
                        dp = i11 - AndroidUtilities.dp(36.0f);
                        i13 = i11;
                        i14 = 0;
                    } else {
                        i14 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i21 * 14);
                        this.s = i14;
                        i13 = org.telegram.messenger.ll.w(18.0f, i14, i11);
                        dp = i13;
                    }
                    TLRPC.Photo photo = this.H;
                    j4 j4Var2 = this.b;
                    if (photo == null || (this.D == null && !(photo instanceof org.telegram.ui.web.c2))) {
                        i15 = i12;
                    } else {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40, true);
                        this.F = closestPhotoSizeWithSize;
                        TLRPC.PhotoSize photoSize = this.D;
                        if (photoSize == closestPhotoSizeWithSize) {
                            this.F = null;
                        }
                        TLRPC.Photo photo2 = this.H;
                        if (photo2 instanceof org.telegram.ui.web.c2) {
                            org.telegram.ui.web.c2 c2Var = (org.telegram.ui.web.c2) photo2;
                            i16 = c2Var.d;
                            i17 = c2Var.e;
                        } else {
                            int i24 = photoSize.w;
                            int i25 = photoSize.h;
                            i16 = i24;
                            i17 = i25;
                        }
                        if (i22 == 0) {
                            float f10 = i16;
                            float f11 = i17;
                            i12 = (int) ((i13 / f10) * f11);
                            if (this.L instanceof TL_iv.pageBlockCover) {
                                i12 = Math.min(i12, i13);
                            } else {
                                Point point = AndroidUtilities.displaySize;
                                int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i12 > max) {
                                    i13 = (int) ((max / f11) * f10);
                                    i14 += ((i11 - i14) - i13) / 2;
                                    i12 = max;
                                }
                            }
                        } else if (i22 == 2) {
                            if ((this.N.flags & 2) == 0) {
                                i13 -= AndroidUtilities.dp(2.0f);
                            }
                            int dp3 = (this.N.flags & 8) == 0 ? i12 - AndroidUtilities.dp(2.0f) : i12;
                            if (this.N.leftSpanOffset != 0) {
                                int ceil = (int) Math.ceil((r7 * i11) / 1000.0f);
                                i13 -= ceil;
                                i14 += ceil;
                            }
                            int i26 = i13;
                            i18 = i12;
                            i12 = dp3;
                            i19 = i14;
                            i20 = i26;
                            imageReceiver.setImageCoords(i19, (!this.r || i22 == 1 || i22 == 2 || this.J.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i20, i12);
                            if (i22 != 0) {
                                this.E = null;
                            } else {
                                Locale locale = Locale.US;
                                this.E = e2.c.l(i20, "_", i12);
                            }
                            this.G = "80_80_b";
                            l4 l4Var = (l4) this.a;
                            this.P = (DownloadController.getInstance(l4Var.T).getCurrentDownloadMask() & 1) == 0;
                            if (!this.M) {
                                if (this.H instanceof org.telegram.ui.web.c2) {
                                    this.P = true;
                                    imageReceiver.setStrippedLocation(null);
                                    org.telegram.ui.web.d2.g((org.telegram.ui.web.c2) this.H, imageReceiver, new kt0(this, 9));
                                } else {
                                    File pathToAttach = FileLoader.getInstance(l4Var.T).getPathToAttach(this.D, true);
                                    if (this.P || pathToAttach.exists()) {
                                        imageReceiver.setStrippedLocation(null);
                                        imageReceiver.setImage(ImageLocation.getForPhoto(this.D, this.H), this.E, ImageLocation.getForPhoto(this.F, this.H), this.G, this.D.size, null, j4Var2 != null ? j4Var2.A : null, 1);
                                    } else {
                                        imageReceiver.setStrippedLocation(ImageLocation.getForPhoto(this.D, this.H));
                                        imageReceiver.setImage(null, this.E, ImageLocation.getForPhoto(this.F, this.H), this.G, this.D.size, null, j4Var2 != null ? j4Var2.A : null, 1);
                                    }
                                }
                            }
                            float f12 = dp2;
                            this.x = (int) e2.c.A(imageReceiver.getImageWidth(), f12, 2.0f, imageReceiver.getImageX());
                            int imageHeight = (int) (((imageReceiver.getImageHeight() - f12) / 2.0f) + imageReceiver.getImageY());
                            this.y = imageHeight;
                            int i27 = this.x;
                            this.f.q(i27, imageHeight, i27 + dp2, dp2 + imageHeight);
                            i15 = i18;
                        }
                        i19 = i14;
                        i20 = i13;
                        i18 = i12;
                        imageReceiver.setImageCoords(i19, (!this.r || i22 == 1 || i22 == 2 || this.J.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i20, i12);
                        if (i22 != 0) {
                        }
                        this.G = "80_80_b";
                        l4 l4Var2 = (l4) this.a;
                        this.P = (DownloadController.getInstance(l4Var2.T).getCurrentDownloadMask() & 1) == 0;
                        if (!this.M) {
                        }
                        float f122 = dp2;
                        this.x = (int) e2.c.A(imageReceiver.getImageWidth(), f122, 2.0f, imageReceiver.getImageX());
                        int imageHeight2 = (int) (((imageReceiver.getImageHeight() - f122) / 2.0f) + imageReceiver.getImageY());
                        this.y = imageHeight2;
                        int i272 = this.x;
                        this.f.q(i272, imageHeight2, i272 + dp2, dp2 + imageHeight2);
                        i15 = i18;
                    }
                    int imageHeight3 = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
                    this.v = imageHeight3;
                    if (i22 == 0) {
                        TL_iv.pageBlockPhoto pageblockphoto2 = this.J;
                        e3 q10 = l4.q(this.a, this, null, pageblockphoto2.caption.text, dp, imageHeight3, pageblockphoto2, this.b);
                        this.c = q10;
                        if (q10 != null) {
                            int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                            this.w = height;
                            i15 = org.telegram.messenger.l0.C(4.0f, height, i15);
                        }
                        int i28 = i15;
                        TL_iv.pageBlockPhoto pageblockphoto3 = this.J;
                        j4Var = j4Var2;
                        e3 p6 = l4.p(this.a, this, null, pageblockphoto3.caption.credit, dp, this.v + this.w, pageblockphoto3, (j4Var2 == null || !j4Var2.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.rv0.a(), 0, this.b);
                        this.d = p6;
                        i15 = p6 != null ? this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i28 : i28;
                    } else {
                        j4Var = j4Var2;
                    }
                    if (!this.r && i22 == 0 && this.J.level <= 0) {
                        i15 += AndroidUtilities.dp(8.0f);
                    }
                    i23 = (i22 == 2 || ((this.L instanceof TL_iv.pageBlockCover) && j4Var != null && (arrayList = j4Var.e) != null && arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel))) ? i15 : AndroidUtilities.dp(8.0f) + i15;
                    e3 e3Var = this.c;
                    if (e3Var != null) {
                        e3Var.s = this.s;
                        e3Var.v = this.v;
                    }
                    e3 e3Var2 = this.d;
                    if (e3Var2 != null) {
                        e3Var2.s = this.s;
                        e3Var2.v = this.v + this.w;
                    }
                }
                f1 f1Var = this.h;
                f1Var.measure(i9, i10);
                f1Var.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
                setMeasuredDimension(i11, i23);
            }
            float f13 = this.N.ph;
            Point point2 = AndroidUtilities.displaySize;
            i12 = (int) Math.ceil(f13 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i11 = size;
        pageblockphoto = this.J;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockphoto != null) {
        }
        f1 f1Var2 = this.h;
        f1Var2.measure(i9, i10);
        f1Var2.setTranslationY(imageReceiver2.getImageHeight() - AndroidUtilities.dp(39.0f));
        setMeasuredDimension(i11, i23);
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
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        f1 f1Var = this.h;
        int visibility = f1Var.getVisibility();
        j4 j4Var = this.b;
        if (visibility != 0 || y10 <= f1Var.getTranslationY() || y10 >= f1Var.getTranslationY() + AndroidUtilities.dp(39.0f)) {
            int action = motionEvent.getAction();
            ImageReceiver imageReceiver = this.e;
            if (action == 0 && imageReceiver.isInsideImage(x10, y10)) {
                if (this.B != -1) {
                    if (x10 >= this.x && x10 <= AndroidUtilities.dp(48.0f) + r2) {
                        if (y10 >= this.y) {
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
                    this.a.d(this.J, j4Var);
                } else if (this.C == 1) {
                    this.C = 0;
                    playSoundEffect(0);
                    if (this.D != null) {
                        int i9 = this.B;
                        RadialProgress2 radialProgress2 = this.f;
                        if (i9 == 0) {
                            radialProgress2.o(0.0f, true);
                            imageReceiver.setImage(ImageLocation.getForPhoto(this.D, this.H), this.E, ImageLocation.getForPhoto(this.F, this.H), this.G, this.D.size, null, this.K, 1);
                            this.B = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i9 == 1) {
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
                if (!l4.l(this.a, this.b, motionEvent, this, this.c, this.s, this.v)) {
                    if (!l4.l(this.a, this.b, motionEvent, this, this.d, this.s, this.v + this.w) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (j4Var != null && j4Var.B != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.L = pageBlock;
        j4 j4Var = this.b;
        if (j4Var == null || (pageblockchannel = j4Var.B) == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
            return;
        }
        f1 f1Var = this.h;
        f1Var.setBlock(pageblockchannel);
        f1Var.setVisibility(0);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
