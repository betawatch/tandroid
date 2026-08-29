package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b3 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.j9 {
    public static final /* synthetic */ int R = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public final int G;
    public TL_iv.pageBlockVideo H;
    public c3 I;
    public TL_iv.PageBlock J;
    public TLRPC.Document K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public MessageObject.GroupedMessagePosition P;
    public boolean Q;
    public final d70 a;
    public final k4 b;
    public f3 c;
    public f3 d;
    public final ImageReceiver e;
    public final FrameLayout f;
    public final e5.c h;
    public final TextureView n;
    public final RadialProgress2 r;
    public final g1 s;
    public final int v;
    public boolean w;
    public int x;
    public int y;

    public b3(Context context, d70 d70Var, k4 k4Var, int i10) {
        super(context);
        this.a = d70Var;
        this.b = k4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.G = DownloadController.getInstance(((m4) d70Var).T).generateObserverTag();
        g1 g1Var = new g1(context, d70Var, k4Var, 1);
        this.s = g1Var;
        e5.c cVar = new e5.c(context);
        this.h = cVar;
        cVar.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f = frameLayout;
        cVar.addView(textureView, i7.f6.e(-1, -2, 1));
        frameLayout.addView(cVar, i7.f6.e(-1, -1, 17));
        addView(frameLayout, i7.f6.c(-2.0f, -1));
        addView(g1Var, i7.f6.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i10 = this.E;
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 8;
        }
        return i10 == 3 ? 0 : 4;
    }

    public final void a() {
        int i10 = ((m4) this.a).T;
        int i11 = this.E;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.r;
        if (i11 == 0) {
            this.O = false;
            radialProgress2.o(0.0f, false);
            boolean z10 = this.L;
            k4 k4Var = this.b;
            if (z10) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.K), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.K.thumbs, 40), this.K), "80_80_b", this.K.size, null, k4Var.A, 1);
            } else {
                FileLoader.getInstance(i10).loadFile(this.K, k4Var.A, 1, 1);
            }
            this.E = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
            return;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                imageReceiver.setAllowStartAnimation(true);
                imageReceiver.startAnimation();
                this.E = -1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                return;
            }
            return;
        }
        this.O = true;
        if (this.L) {
            imageReceiver.cancelLoadImage();
        } else {
            FileLoader.getInstance(i10).cancelLoadFile(this.K);
        }
        this.E = 0;
        radialProgress2.setIcon(getIconForCurrentState(), false, true);
        invalidate();
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, c3 c3Var, boolean z10, boolean z11) {
        d70 d70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.H;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (d70Var = this.a).w) != null && d70Var.x == this) {
            a0.h hVar = d70Var.y;
            long j10 = pageblockvideo2.video_id;
            c3 a2 = c3.a(videoPlayerHolderBase, this);
            this.I = a2;
            hVar.k(a2, j10);
        }
        this.H = pageblockvideo;
        this.I = c3Var;
        this.J = null;
        this.M = z10;
        k4 k4Var = this.b;
        if (k4Var != null) {
            this.K = j4.a(k4Var.A, pageblockvideo.video_id);
        } else {
            this.K = null;
        }
        this.L = MessageObject.isVideoDocument(this.K) || MessageObject.isGifDocument(this.K);
        this.w = z11;
        this.s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(c3 c3Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        c3 c3Var2 = this.I;
        if (c3Var2 != null && (bitmap2 = c3Var.b) != null && (bitmap3 = c3Var2.b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.I.b = null;
        }
        c3 c3Var3 = this.I;
        if (c3Var3 != null && c3Var.b == null && (bitmap = c3Var3.b) != null) {
            c3Var.a = c3Var3.a;
            c3Var.b = bitmap;
        }
        this.I = c3Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (this.Q) {
                return;
            }
            this.Q = true;
            imageReceiver.onAttachedToWindow();
            e(false);
            return;
        }
        if (this.Q) {
            this.Q = false;
            TL_iv.pageBlockVideo pageblockvideo = this.H;
            d70 d70Var = this.a;
            if (pageblockvideo != null && (videoPlayerHolderBase = d70Var.w) != null && d70Var.x == this) {
                a0.h hVar = d70Var.y;
                long j10 = pageblockvideo.video_id;
                c3 a2 = c3.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((m4) d70Var).T).removeLoadingFileObserver(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        int i10 = ((m4) this.a).T;
        String attachFileName = FileLoader.getAttachFileName(this.K);
        boolean z11 = true;
        boolean z12 = FileLoader.getInstance(i10).getPathToAttach(this.K).exists() || FileLoader.getInstance(i10).getPathToAttach(this.K, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            if (this.L) {
                this.E = -1;
            } else {
                this.E = 3;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            c3 c3Var = this.I;
            float f9 = 0.0f;
            if (c3Var == null || c3Var.b == null) {
                if (FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                    this.E = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f9 = fileProgress.floatValue();
                    }
                } else if (!this.O && this.N && this.L) {
                    this.E = 1;
                } else {
                    this.E = 0;
                }
                radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
                radialProgress2.o(f9, false);
            } else {
                this.E = -1;
            }
            z11 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
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
        return this.s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.H;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.G;
    }

    public TextureView getTextureView() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
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
        d();
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
        if (this.H == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
            canvas.drawRect(imageReceiver.getDrawRegion(), m4.k1);
        }
        imageReceiver.draw(canvas);
        f3 f3Var = this.c;
        d70 d70Var = this.a;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.x, this.y);
            m4.v(d70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.x, this.y + this.A);
            m4.v(d70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.H, getMeasuredHeight());
        super.onDraw(canvas);
        if (imageReceiver.getVisible()) {
            this.r.draw(canvas);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        e(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AttachVideo));
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0171  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        TL_iv.pageBlockVideo pageblockvideo;
        int i14;
        int dp;
        int i15;
        int i16;
        int i17;
        k4 k4Var;
        boolean z10;
        int i18;
        int i19;
        int i20;
        boolean z11;
        float f9;
        int i21;
        int size = View.MeasureSpec.getSize(i10);
        int i22 = this.v;
        if (i22 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i13 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i22 != 2) {
                i12 = size;
                i13 = 0;
                int i23 = ((m4) this.a).T;
                pageblockvideo = this.H;
                ImageReceiver imageReceiver = this.e;
                if (pageblockvideo == null) {
                    if (i22 != 0 || (i21 = pageblockvideo.level) <= 0) {
                        this.x = AndroidUtilities.dp(18.0f);
                        dp = i12 - AndroidUtilities.dp(36.0f);
                        i15 = i12;
                        i16 = 0;
                    } else {
                        i16 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i21 * 14);
                        this.x = i16;
                        i15 = b.u(18.0f, i16, i12);
                        dp = i15;
                    }
                    TLRPC.Document document = this.K;
                    k4 k4Var2 = this.b;
                    if (document != null) {
                        int dp2 = AndroidUtilities.dp(48.0f);
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.K.thumbs, 48);
                        if (i22 == 0) {
                            int size2 = this.K.attributes.size();
                            int i24 = 0;
                            while (true) {
                                if (i24 >= size2) {
                                    z11 = false;
                                    break;
                                }
                                if (this.K.attributes.get(i24) instanceof TLRPC.TL_documentAttributeVideo) {
                                    i13 = (int) ((i15 / r13.w) * r13.h);
                                    z11 = true;
                                    break;
                                }
                                i24++;
                            }
                            float f10 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.w : 100.0f;
                            float f11 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100.0f;
                            if (!z11) {
                                i13 = (int) ((i15 / f10) * f11);
                            }
                            if (this.J instanceof TL_iv.pageBlockCover) {
                                i13 = Math.min(i13, i15);
                                f9 = 100.0f;
                            } else {
                                Point point = AndroidUtilities.displaySize;
                                f9 = 100.0f;
                                int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i13 > max) {
                                    i15 = (int) ((max / f11) * f10);
                                    i16 += ((i12 - i16) - i15) / 2;
                                    i13 = max;
                                }
                            }
                            if (i13 == 0) {
                                i13 = AndroidUtilities.dp(f9);
                            } else if (i13 < dp2) {
                                i13 = dp2;
                            }
                        } else if (i22 == 2) {
                            if ((this.P.flags & 2) == 0) {
                                i15 -= AndroidUtilities.dp(2.0f);
                            }
                            if ((this.P.flags & 8) == 0) {
                                int i25 = i15;
                                i18 = i13;
                                i13 -= AndroidUtilities.dp(2.0f);
                                i19 = i16;
                                i20 = i25;
                                imageReceiver.setQualityThumbDocument(this.K);
                                imageReceiver.setImageCoords(i19, (!this.w || i22 == 1 || i22 == 2 || this.H.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i20, i13);
                                if (!this.M) {
                                    if (this.L) {
                                        c3 c3Var = this.I;
                                        if (c3Var == null || c3Var.b == null) {
                                            this.N = DownloadController.getInstance(i23).canDownloadMedia(4, this.K.size);
                                            File pathToAttach = FileLoader.getInstance(i23).getPathToAttach(this.K);
                                            File pathToAttach2 = FileLoader.getInstance(i23).getPathToAttach(this.K, true);
                                            if (this.N || pathToAttach.exists() || pathToAttach2.exists()) {
                                                imageReceiver.setStrippedLocation(null);
                                                imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var2.A, 1);
                                            } else {
                                                imageReceiver.setStrippedLocation(ImageLocation.getForDocument(this.K));
                                                imageReceiver.setImage(null, null, null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var2.A, 1);
                                            }
                                        } else {
                                            imageReceiver.setStrippedLocation(null);
                                            imageReceiver.setImageBitmap(this.I.b);
                                        }
                                    } else {
                                        imageReceiver.setStrippedLocation(null);
                                        imageReceiver.setImage(null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", 0L, null, k4Var2 != null ? k4Var2.A : null, 1);
                                    }
                                }
                                imageReceiver.setAspectFit(true);
                                float f12 = dp2;
                                this.B = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), f12, 2.0f, imageReceiver.getImageX());
                                int imageHeight = (int) (((imageReceiver.getImageHeight() - f12) / 2.0f) + imageReceiver.getImageY());
                                this.C = imageHeight;
                                int i26 = this.B;
                                this.r.q(i26, imageHeight, i26 + dp2, dp2 + imageHeight);
                                i17 = i18;
                            }
                        }
                        i19 = i16;
                        i20 = i15;
                        i18 = i13;
                        imageReceiver.setQualityThumbDocument(this.K);
                        imageReceiver.setImageCoords(i19, (!this.w || i22 == 1 || i22 == 2 || this.H.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i20, i13);
                        if (!this.M) {
                        }
                        imageReceiver.setAspectFit(true);
                        float f122 = dp2;
                        this.B = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), f122, 2.0f, imageReceiver.getImageX());
                        int imageHeight2 = (int) (((imageReceiver.getImageHeight() - f122) / 2.0f) + imageReceiver.getImageY());
                        this.C = imageHeight2;
                        int i262 = this.B;
                        this.r.q(i262, imageHeight2, i262 + dp2, dp2 + imageHeight2);
                        i17 = i18;
                    } else {
                        i17 = i13;
                    }
                    int imageHeight3 = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
                    this.y = imageHeight3;
                    if (i22 == 0) {
                        TL_iv.pageBlockVideo pageblockvideo2 = this.H;
                        f3 q6 = m4.q(this.a, this, null, pageblockvideo2.caption.text, dp, imageHeight3, pageblockvideo2, this.b);
                        this.c = q6;
                        if (q6 != null) {
                            int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                            this.A = height;
                            i17 = org.telegram.messenger.x3.C(4.0f, height, i17);
                            f3 f3Var = this.c;
                            f3Var.s = this.x;
                            f3Var.v = this.y;
                        }
                        int i27 = i17;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.H;
                        k4Var = k4Var2;
                        f3 p10 = m4.p(this.a, this, null, pageblockvideo3.caption.credit, dp, 0, pageblockvideo3, (k4Var2 == null || !k4Var2.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.bw0.a(), 0, this.b);
                        this.d = p10;
                        if (p10 != null) {
                            i17 = this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i27;
                            f3 f3Var2 = this.d;
                            f3Var2.s = this.x;
                            f3Var2.v = this.y + this.A;
                        } else {
                            i17 = i27;
                        }
                    } else {
                        k4Var = k4Var2;
                    }
                    if (!this.w && i22 == 0 && this.H.level <= 0) {
                        i17 += AndroidUtilities.dp(8.0f);
                    }
                    if ((this.J instanceof TL_iv.pageBlockCover) && k4Var != null) {
                        ArrayList arrayList = k4Var.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z10 = true;
                            i14 = (i22 != 2 || z10) ? i17 : AndroidUtilities.dp(8.0f) + i17;
                        }
                    }
                    z10 = false;
                    if (i22 != 2) {
                    }
                } else {
                    i14 = 1;
                }
                g1 g1Var = this.s;
                g1Var.measure(i10, i11);
                g1Var.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.leftMargin = (int) imageReceiver.getImageX();
                layoutParams.topMargin = (int) imageReceiver.getImageY();
                layoutParams.width = (int) imageReceiver.getImageWidth();
                layoutParams.height = (int) imageReceiver.getImageHeight();
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
            }
            float f13 = this.P.ph;
            Point point2 = AndroidUtilities.displaySize;
            i13 = (int) Math.ceil(f13 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i12 = size;
        int i232 = ((m4) this.a).T;
        pageblockvideo = this.H;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockvideo == null) {
        }
        g1 g1Var2 = this.s;
        g1Var2.measure(i10, i11);
        g1Var2.setTranslationY(imageReceiver2.getImageHeight() - AndroidUtilities.dp(39.0f));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.leftMargin = (int) imageReceiver2.getImageX();
        layoutParams2.topMargin = (int) imageReceiver2.getImageY();
        layoutParams2.width = (int) imageReceiver2.getImageWidth();
        layoutParams2.height = (int) imageReceiver2.getImageHeight();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.r.o(Math.min(1.0f, j10 / j11), true);
        if (this.E != 1) {
            e(true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.r.o(1.0f, true);
        if (!this.L) {
            e(true);
        } else {
            this.E = 2;
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1 <= (org.telegram.messenger.AndroidUtilities.dp(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        g1 g1Var = this.s;
        int visibility = g1Var.getVisibility();
        k4 k4Var = this.b;
        if (visibility != 0 || y8 <= g1Var.getTranslationY() || y8 >= g1Var.getTranslationY() + AndroidUtilities.dp(39.0f)) {
            if (motionEvent.getAction() == 0 && this.e.isInsideImage(x4, y8)) {
                if (this.E != -1) {
                    if (x4 >= this.B && x4 <= AndroidUtilities.dp(48.0f) + r2) {
                        if (y8 >= this.C) {
                        }
                    }
                }
                if (this.E != 0) {
                    this.D = true;
                }
                this.F = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.D) {
                    this.D = false;
                    this.a.d(this.H, k4Var);
                } else if (this.F == 1) {
                    this.F = 0;
                    playSoundEffect(0);
                    a();
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.D = false;
            }
            if (!this.D && this.F == 0) {
                if (!m4.l(this.a, this.b, motionEvent, this, this.c, this.x, this.y)) {
                    if (!m4.l(this.a, this.b, motionEvent, this, this.d, this.x, this.y + this.A) && !super.onTouchEvent(motionEvent)) {
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

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
