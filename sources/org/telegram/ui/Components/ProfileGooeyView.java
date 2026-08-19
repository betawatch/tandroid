package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* loaded from: classes5.dex */
public class ProfileGooeyView extends FrameLayout {
    private final Paint blackPaint;
    private float blurIntensity;
    private boolean enabled;
    private final Impl impl;
    private float intensity;
    public NotchInfoUtils.NotchInfo notchInfo;
    private final Path path;
    private float pullProgress;

    /* JADX INFO: Access modifiers changed from: private */
    interface Drawer {
        void draw(Canvas canvas);
    }

    private interface Impl {

        public abstract /* synthetic */ class -CC {
            public static void $default$onSizeChanged(Impl impl, int i, int i2) {
            }

            public static void $default$setBlurIntensity(Impl impl, float f) {
            }

            public static void $default$setIntensity(Impl impl, float f) {
            }
        }

        void draw(Drawer drawer, Canvas canvas);

        void onSizeChanged(int i, int i2);

        void setBlurIntensity(float f);

        void setIntensity(float f);
    }

    public ProfileGooeyView(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.blackPaint = paint;
        this.path = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            this.impl = new GPUImpl(SharedConfig.getDevicePerformanceClass() == 2 ? 1.0f : 1.5f);
        } else {
            this.impl = new CPUImpl();
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.notchInfo;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.notchInfo.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
    }

    public void setIntensity(float f) {
        this.intensity = f;
        this.impl.setIntensity(f);
        invalidate();
    }

    public void setPullProgress(float f) {
        this.pullProgress = f;
        invalidate();
    }

    public void setBlurIntensity(float f) {
        this.blurIntensity = f;
        this.impl.setBlurIntensity(f);
        invalidate();
    }

    public void setGooeyEnabled(boolean z) {
        if (this.enabled == z) {
            return;
        }
        this.enabled = z;
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.notchInfo = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.notchInfo = null;
        }
        this.impl.onSizeChanged(i, i2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.enabled) {
            super.draw(canvas);
        } else {
            this.impl.draw(new Drawer() { // from class: org.telegram.ui.Components.ProfileGooeyView$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.Components.ProfileGooeyView.Drawer
                public final void draw(Canvas canvas2) {
                    ProfileGooeyView.$r8$lambda$qmHZWXVSu8tfF83AWRtDJcRnU8Q(ProfileGooeyView.this, canvas2);
                }
            }, canvas);
        }
    }

    public static /* synthetic */ void $r8$lambda$qmHZWXVSu8tfF83AWRtDJcRnU8Q(ProfileGooeyView profileGooeyView, Canvas canvas) {
        profileGooeyView.getClass();
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    private final class CPUImpl implements Impl {
        private Bitmap bitmap;
        private Canvas bitmapCanvas;
        private int bitmapOrigH;
        private int bitmapOrigW;
        private final Paint bitmapPaint;
        private final Paint bitmapPaint2;
        private int optimizedH;
        private int optimizedW;
        private final float scaleConst;

        @Override // org.telegram.ui.Components.ProfileGooeyView.Impl
        public /* synthetic */ void setBlurIntensity(float f) {
            Impl.-CC.$default$setBlurIntensity(this, f);
        }

        @Override // org.telegram.ui.Components.ProfileGooeyView.Impl
        public /* synthetic */ void setIntensity(float f) {
            Impl.-CC.$default$setIntensity(this, f);
        }

        private CPUImpl() {
            Paint paint = new Paint();
            this.bitmapPaint = paint;
            Paint paint2 = new Paint();
            this.bitmapPaint2 = paint2;
            this.scaleConst = 6.0f;
            paint.setFlags(7);
            paint.setFilterBitmap(true);
            paint2.setFlags(7);
            paint2.setFilterBitmap(true);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            paint.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60.0f, -7500.0f}));
        }

        @Override // org.telegram.ui.Components.ProfileGooeyView.Impl
        public void onSizeChanged(int i, int i2) {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.bitmap = null;
            }
            this.optimizedW = Math.min(AndroidUtilities.dp(120.0f), i);
            int min = Math.min(AndroidUtilities.dp(220.0f), i2);
            this.optimizedH = min;
            this.bitmapOrigW = this.optimizedW;
            int dp = min + AndroidUtilities.dp(32.0f);
            this.bitmapOrigH = dp;
            this.bitmap = Bitmap.createBitmap((int) (this.bitmapOrigW / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
            this.bitmapCanvas = new Canvas(this.bitmap);
        }

        @Override // org.telegram.ui.Components.ProfileGooeyView.Impl
        public void draw(Drawer drawer, Canvas canvas) {
            int i;
            Bitmap bitmap = this.bitmap;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            int clamp = (int) ((1.0f - ((MathUtils.clamp(ProfileGooeyView.this.blurIntensity, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (ProfileGooeyView.this.getWidth() - this.optimizedW) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (clamp != 255) {
                this.bitmap.eraseColor(0);
                this.bitmapCanvas.save();
                this.bitmapCanvas.scale(this.bitmap.getWidth() / this.bitmapOrigW, this.bitmap.getHeight() / this.bitmapOrigH);
                float f = -width;
                this.bitmapCanvas.translate(f, 0.0f);
                drawer.draw(this.bitmapCanvas);
                this.bitmapCanvas.restore();
                this.bitmapCanvas.save();
                this.bitmapCanvas.scale(this.bitmap.getWidth() / this.bitmapOrigW, this.bitmap.getHeight() / this.bitmapOrigH);
                if (ProfileGooeyView.this.notchInfo == null) {
                    this.bitmapCanvas.drawRect(0.0f, 0.0f, this.optimizedW, AndroidUtilities.dp(32.0f), ProfileGooeyView.this.blackPaint);
                } else {
                    this.bitmapCanvas.save();
                    this.bitmapCanvas.translate(f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView profileGooeyView = ProfileGooeyView.this;
                    NotchInfoUtils.NotchInfo notchInfo = profileGooeyView.notchInfo;
                    if (notchInfo.isLikelyCircle) {
                        float min = Math.min(notchInfo.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                        Canvas canvas2 = this.bitmapCanvas;
                        float centerX = ProfileGooeyView.this.notchInfo.bounds.centerX();
                        RectF rectF = ProfileGooeyView.this.notchInfo.bounds;
                        canvas2.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), min, ProfileGooeyView.this.blackPaint);
                    } else if (notchInfo.isAccurate) {
                        this.bitmapCanvas.drawPath(notchInfo.path, profileGooeyView.blackPaint);
                    } else {
                        float max = Math.max(notchInfo.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                        Canvas canvas3 = this.bitmapCanvas;
                        ProfileGooeyView profileGooeyView2 = ProfileGooeyView.this;
                        canvas3.drawRoundRect(profileGooeyView2.notchInfo.bounds, max, max, profileGooeyView2.blackPaint);
                    }
                    this.bitmapCanvas.restore();
                }
                this.bitmapCanvas.restore();
                Utilities.stackBlurBitmap(this.bitmap, (int) ((ProfileGooeyView.this.intensity * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                canvas.saveLayer(0.0f, 0.0f, this.bitmapOrigW, this.bitmapOrigH, null);
                canvas.scale(this.bitmapOrigW / this.bitmap.getWidth(), this.bitmapOrigH / this.bitmap.getHeight());
                canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, this.bitmapPaint);
                canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, this.bitmapPaint2);
                canvas.restore();
                canvas.restore();
            }
            if (clamp != 0) {
                if (clamp != 255) {
                    i = clamp;
                    canvas.saveLayerAlpha(width, 0.0f, width + this.optimizedW, this.optimizedH, i);
                } else {
                    i = clamp;
                }
                drawer.draw(canvas);
                if (i != 255) {
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    private final class GPUImpl implements Impl {
        private final Paint blackNodePaint;
        private final RenderNode blurNode;
        private final RenderNode effectNode;
        private final RenderNode effectNotchNode;
        private final float factorMult;
        private final Paint filter;
        private final RenderNode node;
        private final RectF temp;
        private final RectF whole;
        private final RectF wholeOptimized;

        @Override // org.telegram.ui.Components.ProfileGooeyView.Impl
        public /* synthetic */ void onSizeChanged(int i, int i2) {
            Impl.-CC.$default$onSizeChanged(this, i, i2);
        }

        private GPUImpl(float f) {
            BlendMode blendMode;
            this.filter = new Paint(1);
            this.node = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("render");
            this.effectNotchNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("effectNotch");
            this.effectNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("effect");
            this.blurNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("blur");
            this.whole = new RectF();
            this.temp = new RectF();
            Paint paint = new Paint();
            this.blackNodePaint = paint;
            this.wholeOptimized = new RectF();
            this.factorMult = f;
            paint.setColor(-16777216);
            blendMode = BlendMode.SRC_IN;
            paint.setBlendMode(blendMode);
        }

        @Override // org.telegram.ui.Components.ProfileGooeyView.Impl
        public void setIntensity(float f) {
            RenderEffect createBlurEffect;
            RenderEffect createBlurEffect2;
            RenderNode renderNode = this.effectNode;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            createBlurEffect = RenderEffect.createBlurEffect(f, f, tileMode);
            renderNode.setRenderEffect(createBlurEffect);
            RenderNode renderNode2 = this.effectNotchNode;
            createBlurEffect2 = RenderEffect.createBlurEffect(f, f, tileMode);
            renderNode2.setRenderEffect(createBlurEffect2);
            this.filter.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
        }

        @Override // org.telegram.ui.Components.ProfileGooeyView.Impl
        public void setBlurIntensity(float f) {
            Shader.TileMode tileMode;
            RenderEffect createBlurEffect;
            if (f == 0.0f) {
                this.blurNode.setRenderEffect(null);
                return;
            }
            RenderNode renderNode = this.blurNode;
            float f2 = (ProfileGooeyView.this.intensity * f) / this.factorMult;
            float f3 = (f * ProfileGooeyView.this.intensity) / this.factorMult;
            tileMode = Shader.TileMode.DECAL;
            createBlurEffect = RenderEffect.createBlurEffect(f2, f3, tileMode);
            renderNode.setRenderEffect(createBlurEffect);
        }

        @Override // org.telegram.ui.Components.ProfileGooeyView.Impl
        public void draw(Drawer drawer, Canvas canvas) {
            RecordingCanvas beginRecording;
            RecordingCanvas beginRecording2;
            RecordingCanvas beginRecording3;
            float f;
            float f2;
            RecordingCanvas beginRecording4;
            Paint paint;
            float f3;
            if (canvas.isHardwareAccelerated()) {
                this.whole.set(0.0f, 0.0f, ProfileGooeyView.this.getWidth(), ProfileGooeyView.this.getHeight());
                if (ProfileGooeyView.this.getChildCount() > 0) {
                    View childAt = ProfileGooeyView.this.getChildAt(0);
                    float width = childAt.getWidth() * childAt.getScaleX();
                    float height = childAt.getHeight() * childAt.getScaleY();
                    float x = childAt.getX();
                    float y = childAt.getY();
                    this.wholeOptimized.set(x, y, width + x, height + y);
                    NotchInfoUtils.NotchInfo notchInfo = ProfileGooeyView.this.notchInfo;
                    if (notchInfo != null) {
                        this.wholeOptimized.union(notchInfo.bounds);
                    }
                    this.wholeOptimized.inset(-AndroidUtilities.dp(20.0f), -AndroidUtilities.dp(20.0f));
                    this.wholeOptimized.intersect(this.whole);
                    this.wholeOptimized.top = 0.0f;
                } else {
                    this.wholeOptimized.set(this.whole);
                }
                this.wholeOptimized.bottom += AndroidUtilities.dp(32.0f);
                int ceil = (int) Math.ceil(this.wholeOptimized.width());
                int ceil2 = (int) Math.ceil(this.wholeOptimized.height());
                RectF rectF = this.wholeOptimized;
                float f4 = rectF.left;
                float f5 = rectF.top;
                this.node.setPosition(0, 0, ceil, ceil2);
                this.blurNode.setPosition(0, 0, ceil, ceil2);
                this.effectNode.setPosition(0, 0, ceil, ceil2);
                this.effectNotchNode.setPosition(0, 0, ceil, ceil2);
                float f6 = ceil;
                float f7 = ceil2;
                this.wholeOptimized.set(0.0f, 0.0f, f6, f7);
                beginRecording = this.node.beginRecording();
                float f8 = -f4;
                float f9 = -f5;
                beginRecording.translate(f8, f9);
                int ilerp = (int) ((1.0f - AndroidUtilities.ilerp(ProfileGooeyView.this.pullProgress, 0.5f, 1.0f)) * 255.0f);
                int clamp = MathUtils.clamp(ilerp, 0, NotificationCenter.didReceiveSmsCode);
                drawer.draw(beginRecording);
                this.node.endRecording();
                float f10 = (this.factorMult / 4.0f) + 1.0f;
                float f11 = ProfileGooeyView.this.blurIntensity * 0.5f;
                float f12 = this.factorMult;
                float f13 = f10 + (f11 * f12) + ((f12 - 1.0f) * 2.0f);
                beginRecording2 = this.blurNode.beginRecording();
                float f14 = 1.0f / f13;
                beginRecording2.scale(f14, f14, 0.0f, 0.0f);
                beginRecording2.drawRenderNode(this.node);
                this.blurNode.endRecording();
                float f15 = this.factorMult + 2.0f;
                beginRecording3 = this.effectNode.beginRecording();
                float f16 = 1.0f / f15;
                beginRecording3.scale(f16, f16, 0.0f, 0.0f);
                if (clamp < 255) {
                    beginRecording3.saveLayer(this.wholeOptimized, null);
                    beginRecording3.drawRenderNode(this.node);
                    beginRecording3.drawRect(this.wholeOptimized, this.blackNodePaint);
                    beginRecording3.restore();
                }
                float lerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dp(7.0f) * f15, 0.0f, 0.5f, ProfileGooeyView.this.pullProgress);
                if (ProfileGooeyView.this.getChildCount() > 0) {
                    View childAt2 = ProfileGooeyView.this.getChildAt(0);
                    float x2 = (childAt2.getX() + ((childAt2.getWidth() * childAt2.getScaleX()) / 2.0f)) - f4;
                    float y2 = ((childAt2.getY() + ((childAt2.getHeight() * childAt2.getScaleY()) / 2.0f)) + AndroidUtilities.dp(32.0f)) - f5;
                    float width2 = (childAt2.getWidth() / 2.0f) * childAt2.getScaleX();
                    ProfileGooeyView.this.path.rewind();
                    f = f15;
                    f2 = f13;
                    ProfileGooeyView.this.path.moveTo(x2 - width2, y2 - (((float) Math.cos(0.7853981633974483d)) * width2));
                    ProfileGooeyView.this.path.lineTo(x2, (y2 - width2) - (0.25f * lerp));
                    ProfileGooeyView.this.path.lineTo(x2 + width2, y2 - (((float) Math.cos(0.7853981633974483d)) * width2));
                    ProfileGooeyView.this.path.close();
                    beginRecording3.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                } else {
                    f = f15;
                    f2 = f13;
                }
                if (clamp > 0) {
                    if (clamp != 255) {
                        beginRecording3.saveLayerAlpha(this.wholeOptimized, clamp);
                    }
                    beginRecording3.drawRenderNode(this.node);
                    if (clamp != 255) {
                        beginRecording3.restore();
                    }
                }
                this.effectNode.endRecording();
                beginRecording4 = this.effectNotchNode.beginRecording();
                beginRecording4.scale(f16, f16, 0.0f, 0.0f);
                if (ProfileGooeyView.this.notchInfo == null) {
                    paint = null;
                    beginRecording4.drawRect(0.0f, 0.0f, f6, AndroidUtilities.dp(32.0f), ProfileGooeyView.this.blackPaint);
                    ProfileGooeyView.this.path.rewind();
                    ProfileGooeyView.this.path.moveTo((f6 - lerp) / 2.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView.this.path.lineTo(f6 / 2.0f, AndroidUtilities.dp(32.0f) + lerp);
                    ProfileGooeyView.this.path.lineTo((f6 + lerp) / 2.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView.this.path.close();
                    beginRecording4.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                } else {
                    beginRecording4.translate(f8, f9);
                    beginRecording4.translate(0.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView profileGooeyView = ProfileGooeyView.this;
                    NotchInfoUtils.NotchInfo notchInfo2 = profileGooeyView.notchInfo;
                    if (notchInfo2.isLikelyCircle) {
                        float min = Math.min(notchInfo2.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                        RectF rectF2 = ProfileGooeyView.this.notchInfo.bounds;
                        float width3 = rectF2.bottom - (rectF2.width() / 2.0f);
                        beginRecording4.drawCircle(ProfileGooeyView.this.notchInfo.bounds.centerX(), width3, min, ProfileGooeyView.this.blackPaint);
                        ProfileGooeyView.this.path.rewind();
                        float f17 = lerp / 2.0f;
                        ProfileGooeyView.this.path.moveTo(ProfileGooeyView.this.notchInfo.bounds.centerX() - f17, width3);
                        ProfileGooeyView.this.path.lineTo(ProfileGooeyView.this.notchInfo.bounds.centerX(), min + width3 + lerp);
                        ProfileGooeyView.this.path.lineTo(ProfileGooeyView.this.notchInfo.bounds.centerX() + f17, width3);
                        ProfileGooeyView.this.path.close();
                        beginRecording4.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                    } else if (notchInfo2.isAccurate) {
                        beginRecording4.drawPath(notchInfo2.path, profileGooeyView.blackPaint);
                    } else {
                        float max = Math.max(notchInfo2.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                        this.temp.set(ProfileGooeyView.this.notchInfo.bounds);
                        beginRecording4.drawRoundRect(this.temp, max, max, ProfileGooeyView.this.blackPaint);
                        ProfileGooeyView.this.path.rewind();
                        float f18 = lerp / 2.0f;
                        ProfileGooeyView.this.path.moveTo(this.temp.centerX() - f18, this.temp.bottom);
                        ProfileGooeyView.this.path.lineTo(this.temp.centerX(), this.temp.bottom + lerp);
                        ProfileGooeyView.this.path.lineTo(this.temp.centerX() + f18, this.temp.bottom);
                        ProfileGooeyView.this.path.close();
                        beginRecording4.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                    }
                    paint = null;
                }
                this.effectNotchNode.endRecording();
                canvas.save();
                canvas.translate(f4, f5 - AndroidUtilities.dp(32.0f));
                NotchInfoUtils.NotchInfo notchInfo3 = ProfileGooeyView.this.notchInfo;
                if (notchInfo3 != null) {
                    canvas.clipRect(0.0f, notchInfo3.bounds.top, f6, f7);
                }
                canvas.saveLayer(this.wholeOptimized, this.filter);
                float f19 = f;
                canvas.scale(f19, f19);
                canvas.drawRenderNode(this.effectNotchNode);
                canvas.drawRenderNode(this.effectNode);
                canvas.restore();
                int clamp2 = MathUtils.clamp((ilerp * 3) / 4, 0, NotificationCenter.didReceiveSmsCode);
                if (clamp2 < 255) {
                    canvas.saveLayer(this.wholeOptimized, paint);
                    if (ProfileGooeyView.this.blurIntensity != 0.0f) {
                        canvas.saveLayer(this.wholeOptimized, this.filter);
                        f3 = f2;
                        canvas.scale(f3, f3);
                        canvas.drawRenderNode(this.blurNode);
                        canvas.restore();
                    } else {
                        f3 = f2;
                        canvas.drawRenderNode(this.node);
                    }
                    canvas.drawRect(this.wholeOptimized, this.blackNodePaint);
                    canvas.restore();
                } else {
                    f3 = f2;
                }
                if (clamp2 > 0) {
                    if (clamp2 != 255) {
                        canvas.saveLayerAlpha(this.wholeOptimized, clamp2);
                    }
                    if (ProfileGooeyView.this.blurIntensity != 0.0f) {
                        canvas.saveLayer(this.wholeOptimized, this.filter);
                        canvas.scale(f3, f3);
                        canvas.drawRenderNode(this.blurNode);
                        canvas.restore();
                    } else {
                        canvas.drawRenderNode(this.node);
                    }
                    if (clamp2 != 255) {
                        canvas.restore();
                    }
                }
                canvas.restore();
            }
        }
    }
}
