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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a3 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.m9 {
    public static final /* synthetic */ int R = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public final int G;
    public TL_iv.pageBlockVideo H;
    public b3 I;
    public TL_iv.PageBlock J;
    public TLRPC.Document K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public MessageObject.GroupedMessagePosition P;
    public boolean Q;
    public final a70 a;
    public final j4 b;
    public e3 c;
    public e3 d;
    public final ImageReceiver e;
    public final FrameLayout f;
    public final c5.c h;
    public final TextureView n;
    public final RadialProgress2 r;
    public final f1 s;
    public final int v;
    public boolean w;
    public int x;
    public int y;

    public a3(Context context, a70 a70Var, j4 j4Var, int i9) {
        super(context);
        this.a = a70Var;
        this.b = j4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i9;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.G = DownloadController.getInstance(((l4) a70Var).T).generateObserverTag();
        f1 f1Var = new f1(context, a70Var, j4Var, 1);
        this.s = f1Var;
        c5.c cVar = new c5.c(context);
        this.h = cVar;
        cVar.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f = frameLayout;
        cVar.addView(textureView, g7.e6.e(-1, -2, 1));
        frameLayout.addView(cVar, g7.e6.e(-1, -1, 17));
        addView(frameLayout, g7.e6.c(-2.0f, -1));
        addView(f1Var, g7.e6.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i9 = this.E;
        if (i9 == 0) {
            return 2;
        }
        if (i9 == 1) {
            return 3;
        }
        if (i9 == 2) {
            return 8;
        }
        return i9 == 3 ? 0 : 4;
    }

    public final void a() {
        int i9 = ((l4) this.a).T;
        int i10 = this.E;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.r;
        if (i10 == 0) {
            this.O = false;
            radialProgress2.o(0.0f, false);
            boolean z10 = this.L;
            j4 j4Var = this.b;
            if (z10) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.K), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.K.thumbs, 40), this.K), "80_80_b", this.K.size, null, j4Var.A, 1);
            } else {
                FileLoader.getInstance(i9).loadFile(this.K, j4Var.A, 1, 1);
            }
            this.E = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
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
            FileLoader.getInstance(i9).cancelLoadFile(this.K);
        }
        this.E = 0;
        radialProgress2.setIcon(getIconForCurrentState(), false, true);
        invalidate();
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, b3 b3Var, boolean z10, boolean z11) {
        a70 a70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.H;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (a70Var = this.a).w) != null && a70Var.x == this) {
            a0.h hVar = a70Var.y;
            long j10 = pageblockvideo2.video_id;
            b3 a2 = b3.a(videoPlayerHolderBase, this);
            this.I = a2;
            hVar.k(a2, j10);
        }
        this.H = pageblockvideo;
        this.I = b3Var;
        this.J = null;
        this.M = z10;
        j4 j4Var = this.b;
        if (j4Var != null) {
            this.K = i4.a(j4Var.A, pageblockvideo.video_id);
        } else {
            this.K = null;
        }
        this.L = MessageObject.isVideoDocument(this.K) || MessageObject.isGifDocument(this.K);
        this.w = z11;
        this.s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(b3 b3Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        b3 b3Var2 = this.I;
        if (b3Var2 != null && (bitmap2 = b3Var.b) != null && (bitmap3 = b3Var2.b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.I.b = null;
        }
        b3 b3Var3 = this.I;
        if (b3Var3 != null && b3Var.b == null && (bitmap = b3Var3.b) != null) {
            b3Var.a = b3Var3.a;
            b3Var.b = bitmap;
        }
        this.I = b3Var;
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
            a70 a70Var = this.a;
            if (pageblockvideo != null && (videoPlayerHolderBase = a70Var.w) != null && a70Var.x == this) {
                a0.h hVar = a70Var.y;
                long j10 = pageblockvideo.video_id;
                b3 a2 = b3.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((l4) a70Var).T).removeLoadingFileObserver(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        int i9 = ((l4) this.a).T;
        String attachFileName = FileLoader.getAttachFileName(this.K);
        boolean z11 = true;
        boolean z12 = FileLoader.getInstance(i9).getPathToAttach(this.K).exists() || FileLoader.getInstance(i9).getPathToAttach(this.K, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            DownloadController.getInstance(i9).removeLoadingFileObserver(this);
            if (this.L) {
                this.E = -1;
            } else {
                this.E = 3;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, null, this);
            b3 b3Var = this.I;
            float f10 = 0.0f;
            if (b3Var == null || b3Var.b == null) {
                if (FileLoader.getInstance(i9).isLoadingFile(attachFileName)) {
                    this.E = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f10 = fileProgress.floatValue();
                    }
                } else if (!this.O && this.N && this.L) {
                    this.E = 1;
                } else {
                    this.E = 0;
                }
                radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
                radialProgress2.o(f10, false);
            } else {
                this.E = -1;
            }
            z11 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
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
        d();
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
        if (this.H == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
            canvas.drawRect(imageReceiver.getDrawRegion(), l4.k1);
        }
        imageReceiver.draw(canvas);
        e3 e3Var = this.c;
        a70 a70Var = this.a;
        int i9 = 0;
        if (e3Var != null) {
            canvas.save();
            canvas.translate(this.x, this.y);
            l4.v(a70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i9 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.x, this.y + this.A);
            l4.v(a70Var, canvas, this, i9);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, a70Var, this.H, getMeasuredHeight());
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        TL_iv.pageBlockVideo pageblockvideo;
        int i13;
        int dp;
        int i14;
        int i15;
        int i16;
        j4 j4Var;
        boolean z10;
        int i17;
        int i18;
        int i19;
        boolean z11;
        float f10;
        int i20;
        int size = View.MeasureSpec.getSize(i9);
        int i21 = this.v;
        if (i21 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i12 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i21 != 2) {
                i11 = size;
                i12 = 0;
                int i22 = ((l4) this.a).T;
                pageblockvideo = this.H;
                ImageReceiver imageReceiver = this.e;
                if (pageblockvideo == null) {
                    if (i21 != 0 || (i20 = pageblockvideo.level) <= 0) {
                        this.x = AndroidUtilities.dp(18.0f);
                        dp = i11 - AndroidUtilities.dp(36.0f);
                        i14 = i11;
                        i15 = 0;
                    } else {
                        i15 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i20 * 14);
                        this.x = i15;
                        i14 = org.telegram.messenger.ll.w(18.0f, i15, i11);
                        dp = i14;
                    }
                    TLRPC.Document document = this.K;
                    j4 j4Var2 = this.b;
                    if (document != null) {
                        int dp2 = AndroidUtilities.dp(48.0f);
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.K.thumbs, 48);
                        if (i21 == 0) {
                            int size2 = this.K.attributes.size();
                            int i23 = 0;
                            while (true) {
                                if (i23 >= size2) {
                                    z11 = false;
                                    break;
                                }
                                if (this.K.attributes.get(i23) instanceof TLRPC.TL_documentAttributeVideo) {
                                    i12 = (int) ((i14 / r13.w) * r13.h);
                                    z11 = true;
                                    break;
                                }
                                i23++;
                            }
                            float f11 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.w : 100.0f;
                            float f12 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100.0f;
                            if (!z11) {
                                i12 = (int) ((i14 / f11) * f12);
                            }
                            if (this.J instanceof TL_iv.pageBlockCover) {
                                i12 = Math.min(i12, i14);
                                f10 = 100.0f;
                            } else {
                                Point point = AndroidUtilities.displaySize;
                                f10 = 100.0f;
                                int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i12 > max) {
                                    i14 = (int) ((max / f12) * f11);
                                    i15 += ((i11 - i15) - i14) / 2;
                                    i12 = max;
                                }
                            }
                            if (i12 == 0) {
                                i12 = AndroidUtilities.dp(f10);
                            } else if (i12 < dp2) {
                                i12 = dp2;
                            }
                        } else if (i21 == 2) {
                            if ((this.P.flags & 2) == 0) {
                                i14 -= AndroidUtilities.dp(2.0f);
                            }
                            if ((this.P.flags & 8) == 0) {
                                int i24 = i14;
                                i17 = i12;
                                i12 -= AndroidUtilities.dp(2.0f);
                                i18 = i15;
                                i19 = i24;
                                imageReceiver.setQualityThumbDocument(this.K);
                                imageReceiver.setImageCoords(i18, (!this.w || i21 == 1 || i21 == 2 || this.H.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i19, i12);
                                if (!this.M) {
                                    if (this.L) {
                                        b3 b3Var = this.I;
                                        if (b3Var == null || b3Var.b == null) {
                                            this.N = DownloadController.getInstance(i22).canDownloadMedia(4, this.K.size);
                                            File pathToAttach = FileLoader.getInstance(i22).getPathToAttach(this.K);
                                            File pathToAttach2 = FileLoader.getInstance(i22).getPathToAttach(this.K, true);
                                            if (this.N || pathToAttach.exists() || pathToAttach2.exists()) {
                                                imageReceiver.setStrippedLocation(null);
                                                imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, j4Var2.A, 1);
                                            } else {
                                                imageReceiver.setStrippedLocation(ImageLocation.getForDocument(this.K));
                                                imageReceiver.setImage(null, null, null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, j4Var2.A, 1);
                                            }
                                        } else {
                                            imageReceiver.setStrippedLocation(null);
                                            imageReceiver.setImageBitmap(this.I.b);
                                        }
                                    } else {
                                        imageReceiver.setStrippedLocation(null);
                                        imageReceiver.setImage(null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", 0L, null, j4Var2 != null ? j4Var2.A : null, 1);
                                    }
                                }
                                imageReceiver.setAspectFit(true);
                                float f13 = dp2;
                                this.B = (int) e2.c.A(imageReceiver.getImageWidth(), f13, 2.0f, imageReceiver.getImageX());
                                int imageHeight = (int) (((imageReceiver.getImageHeight() - f13) / 2.0f) + imageReceiver.getImageY());
                                this.C = imageHeight;
                                int i25 = this.B;
                                this.r.q(i25, imageHeight, i25 + dp2, dp2 + imageHeight);
                                i16 = i17;
                            }
                        }
                        i18 = i15;
                        i19 = i14;
                        i17 = i12;
                        imageReceiver.setQualityThumbDocument(this.K);
                        imageReceiver.setImageCoords(i18, (!this.w || i21 == 1 || i21 == 2 || this.H.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i19, i12);
                        if (!this.M) {
                        }
                        imageReceiver.setAspectFit(true);
                        float f132 = dp2;
                        this.B = (int) e2.c.A(imageReceiver.getImageWidth(), f132, 2.0f, imageReceiver.getImageX());
                        int imageHeight2 = (int) (((imageReceiver.getImageHeight() - f132) / 2.0f) + imageReceiver.getImageY());
                        this.C = imageHeight2;
                        int i252 = this.B;
                        this.r.q(i252, imageHeight2, i252 + dp2, dp2 + imageHeight2);
                        i16 = i17;
                    } else {
                        i16 = i12;
                    }
                    int imageHeight3 = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
                    this.y = imageHeight3;
                    if (i21 == 0) {
                        TL_iv.pageBlockVideo pageblockvideo2 = this.H;
                        e3 q10 = l4.q(this.a, this, null, pageblockvideo2.caption.text, dp, imageHeight3, pageblockvideo2, this.b);
                        this.c = q10;
                        if (q10 != null) {
                            int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                            this.A = height;
                            i16 = org.telegram.messenger.l0.C(4.0f, height, i16);
                            e3 e3Var = this.c;
                            e3Var.s = this.x;
                            e3Var.v = this.y;
                        }
                        int i26 = i16;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.H;
                        j4Var = j4Var2;
                        e3 p6 = l4.p(this.a, this, null, pageblockvideo3.caption.credit, dp, 0, pageblockvideo3, (j4Var2 == null || !j4Var2.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.rv0.a(), 0, this.b);
                        this.d = p6;
                        if (p6 != null) {
                            i16 = this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i26;
                            e3 e3Var2 = this.d;
                            e3Var2.s = this.x;
                            e3Var2.v = this.y + this.A;
                        } else {
                            i16 = i26;
                        }
                    } else {
                        j4Var = j4Var2;
                    }
                    if (!this.w && i21 == 0 && this.H.level <= 0) {
                        i16 += AndroidUtilities.dp(8.0f);
                    }
                    if ((this.J instanceof TL_iv.pageBlockCover) && j4Var != null) {
                        ArrayList arrayList = j4Var.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z10 = true;
                            i13 = (i21 != 2 || z10) ? i16 : AndroidUtilities.dp(8.0f) + i16;
                        }
                    }
                    z10 = false;
                    if (i21 != 2) {
                    }
                } else {
                    i13 = 1;
                }
                f1 f1Var = this.s;
                f1Var.measure(i9, i10);
                f1Var.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.leftMargin = (int) imageReceiver.getImageX();
                layoutParams.topMargin = (int) imageReceiver.getImageY();
                layoutParams.width = (int) imageReceiver.getImageWidth();
                layoutParams.height = (int) imageReceiver.getImageHeight();
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
            }
            float f14 = this.P.ph;
            Point point2 = AndroidUtilities.displaySize;
            i12 = (int) Math.ceil(f14 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i11 = size;
        int i222 = ((l4) this.a).T;
        pageblockvideo = this.H;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockvideo == null) {
        }
        f1 f1Var2 = this.s;
        f1Var2.measure(i9, i10);
        f1Var2.setTranslationY(imageReceiver2.getImageHeight() - AndroidUtilities.dp(39.0f));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.leftMargin = (int) imageReceiver2.getImageX();
        layoutParams2.topMargin = (int) imageReceiver2.getImageY();
        layoutParams2.width = (int) imageReceiver2.getImageWidth();
        layoutParams2.height = (int) imageReceiver2.getImageHeight();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
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
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        f1 f1Var = this.s;
        int visibility = f1Var.getVisibility();
        j4 j4Var = this.b;
        if (visibility != 0 || y10 <= f1Var.getTranslationY() || y10 >= f1Var.getTranslationY() + AndroidUtilities.dp(39.0f)) {
            if (motionEvent.getAction() == 0 && this.e.isInsideImage(x10, y10)) {
                if (this.E != -1) {
                    if (x10 >= this.B && x10 <= AndroidUtilities.dp(48.0f) + r2) {
                        if (y10 >= this.C) {
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
                    this.a.d(this.H, j4Var);
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
                if (!l4.l(this.a, this.b, motionEvent, this, this.c, this.x, this.y)) {
                    if (!l4.l(this.a, this.b, motionEvent, this, this.d, this.x, this.y + this.A) && !super.onTouchEvent(motionEvent)) {
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

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        d();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
