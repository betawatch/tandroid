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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.l9 {
    public boolean B;
    public int C;
    public int D;
    public TLRPC.PhotoSize E;
    public String F;
    public TLRPC.PhotoSize G;
    public String H;
    public TLRPC.Photo I;
    public final int J;
    public TL_iv.pageBlockPhoto K;
    public TLObject L;
    public TL_iv.PageBlock M;
    public boolean N;
    public MessageObject.GroupedMessagePosition O;
    public Drawable P;
    public boolean Q;
    public final n70 a;
    public final j4 b;
    public d3 c;
    public d3 d;
    public final ImageReceiver e;
    public final RadialProgress2 f;
    public final e1 h;
    public final int n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public e2(Context context, n70 n70Var, j4 j4Var, int i10) {
        super(context);
        this.a = n70Var;
        this.b = j4Var;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        e1 e1Var = new e1(context, n70Var, j4Var, 1);
        this.h = e1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.J = DownloadController.getInstance(((l4) n70Var).U).generateObserverTag();
        addView(e1Var, k7.b6.c(-2.0f, -1));
        this.n = i10;
    }

    private int getIconForCurrentState() {
        int i10 = this.C;
        if (i10 == 0) {
            return 2;
        }
        return i10 == 1 ? 3 : 4;
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z4, boolean z10) {
        this.M = null;
        this.K = pageblockphoto;
        this.L = tLObject;
        this.N = z4;
        this.r = z10;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.K.url)) {
            this.P = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.K;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = i4.d(pageblockphoto2.photo_id, this.L);
            if (d != null) {
                this.E = FileLoader.getClosestPhotoSizeWithSize(d.sizes, AndroidUtilities.getPhotoSize());
            } else {
                this.E = null;
            }
        } else {
            this.E = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z4) {
        int i10 = ((l4) this.a).U;
        String attachFileName = FileLoader.getAttachFileName(this.E);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.E, true);
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.E, false);
        boolean z10 = pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists());
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z10) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.C = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z4);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            float f10 = 0.0f;
            if (this.Q || FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.C = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f10 = fileProgress.floatValue();
                }
            } else {
                this.C = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z4);
            radialProgress2.o(f10, false);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    public View getChannelCell() {
        return this.h;
    }

    public TL_iv.pageBlockPhoto getCurrentBlock() {
        return this.K;
    }

    public TLObject getCurrentPage() {
        return this.L;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.onAttachedToWindow();
        b(false);
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        DownloadController.getInstance(((l4) this.a).U).removeLoadingFileObserver(this);
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.K == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver.hasBitmapImage() && imageReceiver.getCurrentAlpha() == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), l4.l1);
        }
        imageReceiver.draw(canvas2);
        if (imageReceiver.getVisible()) {
            this.f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.K.url) && !(this.I instanceof org.telegram.ui.web.f2)) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            int imageY = (int) (imageReceiver.getImageY() + AndroidUtilities.dp(11.0f));
            this.P.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
            this.P.draw(canvas2);
        }
        d3 d3Var = this.c;
        n70 n70Var = this.a;
        int i10 = 0;
        if (d3Var != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v);
            l4.v(n70Var, canvas2, this, 0);
            this.c.draw(canvas2, this);
            canvas2.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v + this.w);
            l4.v(n70Var, canvas2, this, i10);
            this.d.draw(canvas2, this);
            canvas2.restore();
        }
        l4.u(canvas2, n70Var, this.K, getMeasuredHeight());
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
        b(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AttachPhoto));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
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
        j4 j4Var;
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
                pageblockphoto = this.K;
                ImageReceiver imageReceiver = this.e;
                if (pageblockphoto != null) {
                    this.I = i4.d(pageblockphoto.photo_id, this.L);
                    int dp2 = AndroidUtilities.dp(48.0f);
                    if (i23 != 0 || (i22 = this.K.level) <= 0) {
                        this.s = AndroidUtilities.dp(18.0f);
                        dp = i12 - AndroidUtilities.dp(36.0f);
                        i14 = i12;
                        i15 = 0;
                    } else {
                        i15 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i22 * 14);
                        this.s = i15;
                        i14 = b.t(18.0f, i15, i12);
                        dp = i14;
                    }
                    TLRPC.Photo photo = this.I;
                    j4 j4Var2 = this.b;
                    if (photo == null || (this.E == null && !(photo instanceof org.telegram.ui.web.f2))) {
                        i16 = i13;
                    } else {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40, true);
                        this.G = closestPhotoSizeWithSize;
                        TLRPC.PhotoSize photoSize = this.E;
                        if (photoSize == closestPhotoSizeWithSize) {
                            this.G = null;
                        }
                        TLRPC.Photo photo2 = this.I;
                        if (photo2 instanceof org.telegram.ui.web.f2) {
                            org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) photo2;
                            i17 = f2Var.d;
                            i18 = f2Var.e;
                        } else {
                            int i25 = photoSize.w;
                            int i26 = photoSize.h;
                            i17 = i25;
                            i18 = i26;
                        }
                        if (i23 == 0) {
                            float f10 = i17;
                            float f11 = i18;
                            i13 = (int) ((i14 / f10) * f11);
                            if (this.M instanceof TL_iv.pageBlockCover) {
                                i13 = Math.min(i13, i14);
                            } else {
                                Point point = AndroidUtilities.displaySize;
                                int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i13 > max) {
                                    i14 = (int) ((max / f11) * f10);
                                    i15 += ((i12 - i15) - i14) / 2;
                                    i13 = max;
                                }
                            }
                        } else if (i23 == 2) {
                            if ((this.O.flags & 2) == 0) {
                                i14 -= AndroidUtilities.dp(2.0f);
                            }
                            int dp3 = (this.O.flags & 8) == 0 ? i13 - AndroidUtilities.dp(2.0f) : i13;
                            if (this.O.leftSpanOffset != 0) {
                                int ceil = (int) Math.ceil((r7 * i12) / 1000.0f);
                                i14 -= ceil;
                                i15 += ceil;
                            }
                            int i27 = i14;
                            i19 = i13;
                            i13 = dp3;
                            i20 = i15;
                            i21 = i27;
                            imageReceiver.setImageCoords(i20, (!this.r || i23 == 1 || i23 == 2 || this.K.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i21, i13);
                            if (i23 != 0) {
                                this.F = null;
                            } else {
                                Locale locale = Locale.US;
                                this.F = e2.c.h(i21, "_", i13);
                            }
                            this.H = "80_80_b";
                            l4 l4Var = (l4) this.a;
                            this.Q = (DownloadController.getInstance(l4Var.U).getCurrentDownloadMask() & 1) == 0;
                            if (!this.N) {
                                if (this.I instanceof org.telegram.ui.web.f2) {
                                    this.Q = true;
                                    imageReceiver.setStrippedLocation(null);
                                    org.telegram.ui.web.g2.g((org.telegram.ui.web.f2) this.I, imageReceiver, new rt0(this, 9));
                                } else {
                                    File pathToAttach = FileLoader.getInstance(l4Var.U).getPathToAttach(this.E, true);
                                    if (this.Q || pathToAttach.exists()) {
                                        imageReceiver.setStrippedLocation(null);
                                        imageReceiver.setImage(ImageLocation.getForPhoto(this.E, this.I), this.F, ImageLocation.getForPhoto(this.G, this.I), this.H, this.E.size, null, j4Var2 != null ? j4Var2.B : null, 1);
                                    } else {
                                        imageReceiver.setStrippedLocation(ImageLocation.getForPhoto(this.E, this.I));
                                        imageReceiver.setImage(null, this.F, ImageLocation.getForPhoto(this.G, this.I), this.H, this.E.size, null, j4Var2 != null ? j4Var2.B : null, 1);
                                    }
                                }
                            }
                            float f12 = dp2;
                            this.x = (int) e2.c.x(imageReceiver.getImageWidth(), f12, 2.0f, imageReceiver.getImageX());
                            int imageHeight = (int) (((imageReceiver.getImageHeight() - f12) / 2.0f) + imageReceiver.getImageY());
                            this.y = imageHeight;
                            int i28 = this.x;
                            this.f.q(i28, imageHeight, i28 + dp2, dp2 + imageHeight);
                            i16 = i19;
                        }
                        i20 = i15;
                        i21 = i14;
                        i19 = i13;
                        imageReceiver.setImageCoords(i20, (!this.r || i23 == 1 || i23 == 2 || this.K.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i21, i13);
                        if (i23 != 0) {
                        }
                        this.H = "80_80_b";
                        l4 l4Var2 = (l4) this.a;
                        this.Q = (DownloadController.getInstance(l4Var2.U).getCurrentDownloadMask() & 1) == 0;
                        if (!this.N) {
                        }
                        float f122 = dp2;
                        this.x = (int) e2.c.x(imageReceiver.getImageWidth(), f122, 2.0f, imageReceiver.getImageX());
                        int imageHeight2 = (int) (((imageReceiver.getImageHeight() - f122) / 2.0f) + imageReceiver.getImageY());
                        this.y = imageHeight2;
                        int i282 = this.x;
                        this.f.q(i282, imageHeight2, i282 + dp2, dp2 + imageHeight2);
                        i16 = i19;
                    }
                    int imageHeight3 = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
                    this.v = imageHeight3;
                    if (i23 == 0) {
                        TL_iv.pageBlockPhoto pageblockphoto2 = this.K;
                        d3 q10 = l4.q(this.a, this, null, pageblockphoto2.caption.text, dp, imageHeight3, pageblockphoto2, this.b);
                        this.c = q10;
                        if (q10 != null) {
                            int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                            this.w = height;
                            i16 = org.telegram.messenger.y3.C(4.0f, height, i16);
                        }
                        int i29 = i16;
                        TL_iv.pageBlockPhoto pageblockphoto3 = this.K;
                        j4Var = j4Var2;
                        d3 p10 = l4.p(this.a, this, null, pageblockphoto3.caption.credit, dp, this.v + this.w, pageblockphoto3, (j4Var2 == null || !j4Var2.D) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.kw0.a(), 0, this.b);
                        this.d = p10;
                        i16 = p10 != null ? this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i29 : i29;
                    } else {
                        j4Var = j4Var2;
                    }
                    if (!this.r && i23 == 0 && this.K.level <= 0) {
                        i16 += AndroidUtilities.dp(8.0f);
                    }
                    i24 = (i23 == 2 || ((this.M instanceof TL_iv.pageBlockCover) && j4Var != null && (arrayList = j4Var.e) != null && arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel))) ? i16 : AndroidUtilities.dp(8.0f) + i16;
                    d3 d3Var = this.c;
                    if (d3Var != null) {
                        d3Var.s = this.s;
                        d3Var.v = this.v;
                    }
                    d3 d3Var2 = this.d;
                    if (d3Var2 != null) {
                        d3Var2.s = this.s;
                        d3Var2.v = this.v + this.w;
                    }
                }
                e1 e1Var = this.h;
                e1Var.measure(i10, i11);
                e1Var.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
                setMeasuredDimension(i12, i24);
            }
            float f13 = this.O.ph;
            Point point2 = AndroidUtilities.displaySize;
            i13 = (int) Math.ceil(f13 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i12 = size;
        pageblockphoto = this.K;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockphoto != null) {
        }
        e1 e1Var2 = this.h;
        e1Var2.measure(i10, i11);
        e1Var2.setTranslationY(imageReceiver2.getImageHeight() - AndroidUtilities.dp(39.0f));
        setMeasuredDimension(i12, i24);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f.o(Math.min(1.0f, j10 / j11), true);
        if (this.C != 1) {
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
        e1 e1Var = this.h;
        int visibility = e1Var.getVisibility();
        j4 j4Var = this.b;
        if (visibility != 0 || y10 <= e1Var.getTranslationY() || y10 >= e1Var.getTranslationY() + AndroidUtilities.dp(39.0f)) {
            int action = motionEvent.getAction();
            ImageReceiver imageReceiver = this.e;
            if (action == 0 && imageReceiver.isInsideImage(x10, y10)) {
                if (this.C != -1) {
                    if (x10 >= this.x && x10 <= AndroidUtilities.dp(48.0f) + r2) {
                        if (y10 >= this.y) {
                        }
                    }
                }
                if (this.C != 0) {
                    this.B = true;
                }
                this.D = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.B) {
                    this.B = false;
                    this.a.d(this.K, j4Var);
                } else if (this.D == 1) {
                    this.D = 0;
                    playSoundEffect(0);
                    if (this.E != null) {
                        int i10 = this.C;
                        RadialProgress2 radialProgress2 = this.f;
                        if (i10 == 0) {
                            radialProgress2.o(0.0f, true);
                            imageReceiver.setImage(ImageLocation.getForPhoto(this.E, this.I), this.F, ImageLocation.getForPhoto(this.G, this.I), this.H, this.E.size, null, this.L, 1);
                            this.C = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i10 == 1) {
                            imageReceiver.cancelLoadImage();
                            this.C = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.B = false;
                this.D = 0;
            }
            if (!this.B && this.D == 0) {
                if (!l4.l(this.a, this.b, motionEvent, this, this.c, this.s, this.v)) {
                    if (!l4.l(this.a, this.b, motionEvent, this, this.d, this.s, this.v + this.w) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (j4Var != null && j4Var.C != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.M = pageBlock;
        j4 j4Var = this.b;
        if (j4Var == null || (pageblockchannel = j4Var.C) == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
            return;
        }
        e1 e1Var = this.h;
        e1Var.setBlock(pageblockchannel);
        e1Var.setVisibility(0);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
