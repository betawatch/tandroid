package org.telegram.ui.Components.Premium;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.GLIconSettingsView;
/* loaded from: classes3.dex */
public class StarParticlesView extends View {
    private LinearGradient clipGradient;
    private Matrix clipGradientMatrix;
    private Paint clipGradientPaint;
    public boolean doNotFling;
    public Drawable drawable;
    int size;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StarParticlesView(Context context) {
        this(context, r0);
        int i;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            i = NotificationCenter.storyQualityUpdate;
        } else {
            i = SharedConfig.getDevicePerformanceClass() == 1 ? 100 : 50;
        }
    }

    public StarParticlesView(Context context, int i) {
        super(context);
        this.drawable = new Drawable(i);
        configure();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void configure() {
        Drawable drawable = this.drawable;
        drawable.type = 100;
        drawable.roundEffect = true;
        drawable.useRotate = true;
        drawable.useBlur = true;
        drawable.checkBounds = true;
        drawable.size1 = 4;
        drawable.k3 = 0.98f;
        drawable.k2 = 0.98f;
        drawable.k1 = 0.98f;
        drawable.init();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        this.drawable.rect.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.drawable.rect.offset((getMeasuredWidth() - this.drawable.rect.width()) / 2.0f, (getMeasuredHeight() - this.drawable.rect.height()) / 2.0f);
        this.drawable.rect2.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), getMeasuredWidth() + AndroidUtilities.dp(15.0f), getMeasuredHeight() + AndroidUtilities.dp(15.0f));
        if (this.size != measuredWidth) {
            this.size = measuredWidth;
            this.drawable.resetPositions();
        }
    }

    protected int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    public void setClipWithGradient() {
        Paint paint = new Paint(1);
        this.clipGradientPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.clipGradient = linearGradient;
        this.clipGradientPaint.setShader(linearGradient);
        this.clipGradientMatrix = new Matrix();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.clipGradientPaint != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), NotificationCenter.voipServiceCreated, 31);
        }
        this.drawable.onDraw(canvas);
        if (this.clipGradientPaint != null) {
            canvas.save();
            this.clipGradientMatrix.reset();
            this.clipGradientMatrix.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
            this.clipGradient.setLocalMatrix(this.clipGradientMatrix);
            canvas.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.clipGradientPaint);
            this.clipGradientMatrix.reset();
            this.clipGradientMatrix.postRotate(180.0f);
            this.clipGradientMatrix.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
            this.clipGradient.setLocalMatrix(this.clipGradientMatrix);
            canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.clipGradientPaint);
            canvas.restore();
            canvas.restore();
        }
        if (this.drawable.paused) {
            return;
        }
        invalidate();
    }

    public void flingParticles(float f) {
        if (this.doNotFling) {
            return;
        }
        float f2 = f < 60.0f ? 5.0f : f < 180.0f ? 9.0f : 15.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.Premium.StarParticlesView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StarParticlesView.this.lambda$flingParticles$0(valueAnimator);
            }
        };
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f2);
        ofFloat.addUpdateListener(animatorUpdateListener);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, 1.0f);
        ofFloat2.addUpdateListener(animatorUpdateListener);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flingParticles$0(ValueAnimator valueAnimator) {
        this.drawable.speedScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    /* loaded from: classes3.dex */
    public static class Drawable {
        float a;
        float a1;
        float a2;
        public final int count;
        public boolean distributionAlgorithm;
        public Utilities.CallbackReturn<Integer, Paint> getPaint;
        private int lastColor;
        public Paint overridePaint;
        public boolean paused;
        public long pausedTime;
        float[] points1;
        float[] points2;
        float[] points3;
        int pointsCount1;
        int pointsCount2;
        int pointsCount3;
        private long prevTime;
        public Theme.ResourcesProvider resourcesProvider;
        public boolean startFromCenter;
        public boolean useGradient;
        public boolean useRotate;
        public boolean useScale;
        public RectF rect = new RectF();
        public RectF rect2 = new RectF();
        public RectF excludeRect = new RectF();
        private final Bitmap[] stars = new Bitmap[3];
        public Paint paint = new Paint();
        public float excludeRadius = 0.0f;
        public float centerOffsetX = 0.0f;
        public float centerOffsetY = 0.0f;
        public ArrayList<Particle> particles = new ArrayList<>();
        public float speedScale = 1.0f;
        public int size1 = 14;
        public int size2 = 12;
        public int size3 = 10;
        public float k1 = 0.85f;
        public float k2 = 0.85f;
        public float k3 = 0.9f;
        public long minLifeTime = 2000;
        public int randLifeTime = 1000;
        private final float dt = 1000.0f / AndroidUtilities.screenRefreshRate;
        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix matrix3 = new Matrix();
        public boolean checkBounds = false;
        public boolean checkTime = true;
        public boolean isCircle = true;
        public boolean useBlur = false;
        public boolean forceMaxAlpha = false;
        public boolean roundEffect = true;
        public int type = -1;
        public int colorKey = Theme.key_premiumStartSmallStarsColor;
        public final boolean[] svg = new boolean[3];
        public final boolean[] flip = new boolean[3];
        private int lastParticleI = 0;

        static /* synthetic */ int access$208(Drawable drawable) {
            int i = drawable.lastParticleI;
            drawable.lastParticleI = i + 1;
            return i;
        }

        public Drawable(int i) {
            this.count = i;
            this.distributionAlgorithm = i < 50;
        }

        public void init() {
            if (this.useRotate) {
                int i = this.count * 2;
                this.points1 = new float[i];
                this.points2 = new float[i];
                this.points3 = new float[i];
            }
            generateBitmaps();
            if (this.particles.isEmpty()) {
                for (int i2 = 0; i2 < this.count; i2++) {
                    this.particles.add(new Particle());
                }
            }
        }

        public void updateColors() {
            int color = Theme.getColor(this.colorKey, this.resourcesProvider);
            if (this.lastColor != color) {
                this.lastColor = color;
                generateBitmaps();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x02a5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x027d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void generateBitmaps() {
            int dp;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            for (int i7 = 0; i7 < 3; i7++) {
                float f = this.k1;
                if (i7 == 0) {
                    dp = AndroidUtilities.dp(this.size1);
                } else if (i7 == 1) {
                    f = this.k2;
                    dp = AndroidUtilities.dp(this.size2);
                } else {
                    f = this.k3;
                    dp = AndroidUtilities.dp(this.size3);
                }
                int i8 = dp;
                int i9 = this.type;
                if (i9 == 9) {
                    if (i7 == 0) {
                        i6 = R.raw.premium_object_folder;
                    } else if (i7 == 1) {
                        i6 = R.raw.premium_object_bubble;
                    } else {
                        i6 = R.raw.premium_object_settings;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i6, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 11 || i9 == 4) {
                    if (i7 == 0) {
                        i = R.raw.premium_object_smile1;
                    } else if (i7 == 1) {
                        i = R.raw.premium_object_smile2;
                    } else {
                        i = R.raw.premium_object_like;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 22) {
                    if (i7 == 0) {
                        i5 = R.raw.premium_object_user;
                    } else if (i7 == 1) {
                        i5 = R.raw.cache_photos;
                    } else {
                        i5 = R.raw.cache_profile_photos;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i5, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 3) {
                    if (i7 == 0) {
                        i4 = R.raw.premium_object_adsbubble;
                    } else if (i7 == 1) {
                        i4 = R.raw.premium_object_like;
                    } else {
                        i4 = R.raw.premium_object_noads;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i4, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 7) {
                    if (i7 == 0) {
                        i3 = R.raw.premium_object_video2;
                    } else if (i7 == 1) {
                        i3 = R.raw.premium_object_video;
                    } else {
                        i3 = R.raw.premium_object_user;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i3, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 1001) {
                    this.stars[i7] = SvgHelper.getBitmap(R.raw.premium_object_fire, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 1002) {
                    this.stars[i7] = SvgHelper.getBitmap(R.raw.premium_object_star2, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 24) {
                    if (i7 == 0) {
                        i2 = R.raw.premium_object_tag;
                    } else if (i7 == 1) {
                        i2 = R.raw.premium_object_check;
                    } else {
                        i2 = R.raw.premium_object_star;
                    }
                    this.stars[i7] = SvgHelper.getBitmap(i2, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), 30));
                    this.svg[i7] = true;
                } else if (i9 == 28) {
                    if (i7 == 0) {
                        this.stars[i7] = SvgHelper.getBitmap(R.raw.filled_premium_dollar, i8, i8, ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), NotificationCenter.voipServiceCreated));
                        this.flip[i7] = true;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(i8, i8, Bitmap.Config.ARGB_8888);
                    this.stars[i7] = createBitmap;
                    Canvas canvas = new Canvas(createBitmap);
                    if (this.type != 6 && (i7 == 1 || i7 == 2)) {
                        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_premium_liststar);
                        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(this.colorKey, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        drawable.setBounds(0, 0, i8, i8);
                        drawable.draw(canvas);
                    } else {
                        Path path = new Path();
                        float f2 = i8 >> 1;
                        int i10 = (int) (f * f2);
                        path.moveTo(0.0f, f2);
                        float f3 = i10;
                        path.lineTo(f3, f3);
                        path.lineTo(f2, 0.0f);
                        float f4 = i8 - i10;
                        path.lineTo(f4, f3);
                        float f5 = i8;
                        path.lineTo(f5, f2);
                        path.lineTo(f4, f4);
                        path.lineTo(f2, f5);
                        path.lineTo(f3, f4);
                        path.lineTo(0.0f, f2);
                        path.close();
                        Paint paint = new Paint();
                        if (!this.useGradient) {
                            if (i8 >= AndroidUtilities.dp(10.0f)) {
                                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i8, i8, i8 * (-2), 0.0f);
                            } else {
                                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, i8, i8, i8 * (-4), 0.0f);
                            }
                            Paint mainGradientPaint = PremiumGradient.getInstance().getMainGradientPaint();
                            if (this.roundEffect) {
                                mainGradientPaint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            if (this.forceMaxAlpha) {
                                mainGradientPaint.setAlpha(NotificationCenter.voipServiceCreated);
                            } else if (this.useBlur) {
                                mainGradientPaint.setAlpha(60);
                            } else {
                                mainGradientPaint.setAlpha(120);
                            }
                            canvas.drawPath(path, mainGradientPaint);
                            mainGradientPaint.setPathEffect(null);
                            mainGradientPaint.setAlpha(NotificationCenter.voipServiceCreated);
                        } else {
                            paint.setColor(getPathColor(i7));
                            if (this.roundEffect) {
                                paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.size1 / 5.0f)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if (!this.useBlur) {
                            Utilities.stackBlurBitmap(createBitmap, 2);
                        }
                    }
                } else {
                    if (i9 == 105 && i7 == 0) {
                        this.stars[i7] = SvgHelper.getBitmap(R.raw.premium_object_star2, i8, i8, getPathColor(i7));
                    }
                    Bitmap createBitmap2 = Bitmap.createBitmap(i8, i8, Bitmap.Config.ARGB_8888);
                    this.stars[i7] = createBitmap2;
                    Canvas canvas2 = new Canvas(createBitmap2);
                    if (this.type != 6) {
                    }
                    Path path2 = new Path();
                    float f22 = i8 >> 1;
                    int i102 = (int) (f * f22);
                    path2.moveTo(0.0f, f22);
                    float f32 = i102;
                    path2.lineTo(f32, f32);
                    path2.lineTo(f22, 0.0f);
                    float f42 = i8 - i102;
                    path2.lineTo(f42, f32);
                    float f52 = i8;
                    path2.lineTo(f52, f22);
                    path2.lineTo(f42, f42);
                    path2.lineTo(f22, f52);
                    path2.lineTo(f32, f42);
                    path2.lineTo(0.0f, f22);
                    path2.close();
                    Paint paint2 = new Paint();
                    if (!this.useGradient) {
                    }
                    if (!this.useBlur) {
                    }
                }
            }
        }

        protected int getPathColor(int i) {
            if (this.type == 100) {
                return ColorUtils.setAlphaComponent(Theme.getColor(this.colorKey, this.resourcesProvider), NotificationCenter.storyQualityUpdate);
            }
            return Theme.getColor(this.colorKey, this.resourcesProvider);
        }

        public void resetPositions() {
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < this.particles.size(); i++) {
                this.particles.get(i).genPosition(currentTimeMillis);
            }
        }

        public void onDraw(Canvas canvas) {
            onDraw(canvas, 1.0f);
        }

        public void onDraw(Canvas canvas, float f) {
            long currentTimeMillis = System.currentTimeMillis();
            long clamp = MathUtils.clamp(currentTimeMillis - this.prevTime, 4L, 50L);
            if (this.useRotate) {
                this.matrix.reset();
                float f2 = (float) clamp;
                float f3 = this.a + ((f2 / 40000.0f) * 360.0f);
                this.a = f3;
                this.a1 += (f2 / 50000.0f) * 360.0f;
                this.a2 += (f2 / 60000.0f) * 360.0f;
                this.matrix.setRotate(f3, this.rect.centerX() + this.centerOffsetX, this.rect.centerY() + this.centerOffsetY);
                this.matrix2.setRotate(this.a1, this.rect.centerX() + this.centerOffsetX, this.rect.centerY() + this.centerOffsetY);
                this.matrix3.setRotate(this.a2, this.rect.centerX() + this.centerOffsetX, this.rect.centerY() + this.centerOffsetY);
                this.pointsCount1 = 0;
                this.pointsCount2 = 0;
                this.pointsCount3 = 0;
                for (int i = 0; i < this.particles.size(); i++) {
                    this.particles.get(i).updatePoint();
                }
                Matrix matrix = this.matrix;
                float[] fArr = this.points1;
                matrix.mapPoints(fArr, 0, fArr, 0, this.pointsCount1);
                Matrix matrix2 = this.matrix2;
                float[] fArr2 = this.points2;
                matrix2.mapPoints(fArr2, 0, fArr2, 0, this.pointsCount2);
                Matrix matrix3 = this.matrix3;
                float[] fArr3 = this.points3;
                matrix3.mapPoints(fArr3, 0, fArr3, 0, this.pointsCount3);
                this.pointsCount1 = 0;
                this.pointsCount2 = 0;
                this.pointsCount3 = 0;
            }
            for (int i2 = 0; i2 < this.particles.size(); i2++) {
                Particle particle = this.particles.get(i2);
                if (this.paused) {
                    particle.draw(canvas, this.pausedTime, f);
                } else {
                    particle.draw(canvas, currentTimeMillis, f);
                }
                if (this.checkTime && currentTimeMillis > particle.lifeTime) {
                    particle.genPosition(currentTimeMillis);
                }
                if (this.checkBounds && !this.rect2.contains(particle.drawingX, particle.drawingY)) {
                    particle.genPosition(currentTimeMillis);
                }
            }
            this.prevTime = currentTimeMillis;
        }

        /* loaded from: classes3.dex */
        public class Particle {
            private int alpha;
            private float drawingX;
            private float drawingY;
            float flipProgress;
            private int i;
            float inProgress;
            public long lifeTime;
            private float randomRotate;
            private int starIndex;
            private float vecX;
            private float vecY;
            private float x;
            private float x2;
            private float y;
            private float y2;
            private float scale = 1.0f;
            private boolean first = true;

            public Particle() {
                this.i = Drawable.access$208(Drawable.this);
            }

            public void updatePoint() {
                int i = this.starIndex;
                if (i == 0) {
                    Drawable drawable = Drawable.this;
                    float[] fArr = drawable.points1;
                    int i2 = drawable.pointsCount1;
                    int i3 = i2 * 2;
                    fArr[i3] = this.x;
                    fArr[i3 + 1] = this.y;
                    drawable.pointsCount1 = i2 + 1;
                } else if (i == 1) {
                    Drawable drawable2 = Drawable.this;
                    float[] fArr2 = drawable2.points2;
                    int i4 = drawable2.pointsCount2;
                    int i5 = i4 * 2;
                    fArr2[i5] = this.x;
                    fArr2[i5 + 1] = this.y;
                    drawable2.pointsCount2 = i4 + 1;
                } else if (i == 2) {
                    Drawable drawable3 = Drawable.this;
                    float[] fArr3 = drawable3.points3;
                    int i6 = drawable3.pointsCount3;
                    int i7 = i6 * 2;
                    fArr3[i7] = this.x;
                    fArr3[i7 + 1] = this.y;
                    drawable3.pointsCount3 = i6 + 1;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0142  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void draw(Canvas canvas, long j, float f) {
                float f2;
                float f3;
                Drawable drawable;
                Paint paint;
                float f4;
                Drawable drawable2 = Drawable.this;
                if (drawable2.useRotate) {
                    int i = this.starIndex;
                    if (i == 0) {
                        float[] fArr = drawable2.points1;
                        int i2 = drawable2.pointsCount1;
                        int i3 = i2 * 2;
                        this.drawingX = fArr[i3];
                        this.drawingY = fArr[i3 + 1];
                        drawable2.pointsCount1 = i2 + 1;
                    } else if (i == 1) {
                        float[] fArr2 = drawable2.points2;
                        int i4 = drawable2.pointsCount2;
                        int i5 = i4 * 2;
                        this.drawingX = fArr2[i5];
                        this.drawingY = fArr2[i5 + 1];
                        drawable2.pointsCount2 = i4 + 1;
                    } else if (i == 2) {
                        float[] fArr3 = drawable2.points3;
                        int i6 = drawable2.pointsCount3;
                        int i7 = i6 * 2;
                        this.drawingX = fArr3[i7];
                        this.drawingY = fArr3[i7 + 1];
                        drawable2.pointsCount3 = i6 + 1;
                    }
                } else {
                    this.drawingX = this.x;
                    this.drawingY = this.y;
                }
                if (drawable2.excludeRect.isEmpty() || !Drawable.this.excludeRect.contains(this.drawingX, this.drawingY)) {
                    canvas.save();
                    canvas.translate(this.drawingX, this.drawingY);
                    float f5 = this.randomRotate;
                    if (f5 != 0.0f) {
                        canvas.rotate(f5, Drawable.this.stars[this.starIndex].getWidth() / 2.0f, Drawable.this.stars[this.starIndex].getHeight() / 2.0f);
                    }
                    if (Drawable.this.checkTime) {
                        long j2 = this.lifeTime - j;
                        if (j2 < 200) {
                            f2 = Utilities.clamp(1.0f - (((float) j2) / 150.0f), 1.0f, 0.0f);
                            f3 = this.inProgress;
                            if (f3 >= 1.0f || GLIconSettingsView.smallStarsSize != 1.0f) {
                                float interpolation = AndroidUtilities.overshootInterpolator.getInterpolation(f3) * GLIconSettingsView.smallStarsSize;
                                canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
                            }
                            drawable = Drawable.this;
                            if (drawable.flip[this.starIndex]) {
                                float min = this.flipProgress + ((drawable.dt / 1000.0f) * Math.min(Drawable.this.speedScale, 3.5f));
                                this.flipProgress = min;
                                double d = min;
                                Double.isNaN(d);
                                canvas.scale((float) Math.cos(d * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
                            }
                            Drawable drawable3 = Drawable.this;
                            paint = drawable3.overridePaint;
                            if (paint == null) {
                                Utilities.CallbackReturn<Integer, Paint> callbackReturn = drawable3.getPaint;
                                if (callbackReturn != null) {
                                    paint = callbackReturn.run(Integer.valueOf(this.i));
                                } else {
                                    paint = drawable3.paint;
                                }
                            }
                            float f6 = 1.0f - f2;
                            paint.setAlpha((int) (this.alpha * f6 * f));
                            Bitmap bitmap = Drawable.this.stars[this.starIndex];
                            if (Drawable.this.useScale) {
                                float f7 = this.scale * f6 * f * this.inProgress;
                                canvas.scale(f7, f7);
                            }
                            canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
                            canvas.restore();
                        }
                    }
                    f2 = 0.0f;
                    f3 = this.inProgress;
                    if (f3 >= 1.0f) {
                    }
                    float interpolation2 = AndroidUtilities.overshootInterpolator.getInterpolation(f3) * GLIconSettingsView.smallStarsSize;
                    canvas.scale(interpolation2, interpolation2, 0.0f, 0.0f);
                    drawable = Drawable.this;
                    if (drawable.flip[this.starIndex]) {
                    }
                    Drawable drawable32 = Drawable.this;
                    paint = drawable32.overridePaint;
                    if (paint == null) {
                    }
                    float f62 = 1.0f - f2;
                    paint.setAlpha((int) (this.alpha * f62 * f));
                    Bitmap bitmap2 = Drawable.this.stars[this.starIndex];
                    if (Drawable.this.useScale) {
                    }
                    canvas.drawBitmap(bitmap2, -(bitmap2.getWidth() >> 1), -(bitmap2.getHeight() >> 1), paint);
                    canvas.restore();
                }
                if (Drawable.this.paused) {
                    return;
                }
                float dp = AndroidUtilities.dp(4.0f) * (Drawable.this.dt / 660.0f);
                Drawable drawable4 = Drawable.this;
                if (drawable4.flip[this.starIndex]) {
                    f4 = dp * Math.min(drawable4.speedScale, 3.5f) * 4.0f;
                } else {
                    f4 = dp * drawable4.speedScale;
                }
                this.x += this.vecX * f4;
                this.y += this.vecY * f4;
                float f8 = this.inProgress;
                if (f8 != 1.0f) {
                    float f9 = f8 + (Drawable.this.dt / 200.0f);
                    this.inProgress = f9;
                    if (f9 > 1.0f) {
                        this.inProgress = 1.0f;
                    }
                }
            }

            public void genPosition(long j) {
                float f;
                double atan2;
                int i;
                float f2;
                float f3;
                float nextFloat;
                if (Drawable.this.type != 28) {
                    this.starIndex = Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.stars.length);
                } else {
                    if (Utilities.fastRandom.nextFloat() >= 0.13f) {
                        this.starIndex = (int) Math.floor((nextFloat * (Drawable.this.stars.length - 1)) + 1.0f);
                    } else {
                        this.starIndex = 0;
                    }
                }
                Drawable drawable = Drawable.this;
                this.lifeTime = j + drawable.minLifeTime + Utilities.fastRandom.nextInt(drawable.randLifeTime * (drawable.flip[this.starIndex] ? 3 : 1));
                this.randomRotate = 0.0f;
                if (Drawable.this.useScale) {
                    this.scale = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
                }
                Drawable drawable2 = Drawable.this;
                if (drawable2.distributionAlgorithm) {
                    float abs = drawable2.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                    float abs2 = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                    float f4 = 0.0f;
                    for (int i2 = 0; i2 < 10; i2++) {
                        float abs3 = Drawable.this.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                        float abs4 = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                        float f5 = 2.14748365E9f;
                        for (int i3 = 0; i3 < Drawable.this.particles.size(); i3++) {
                            Drawable drawable3 = Drawable.this;
                            if (drawable3.startFromCenter) {
                                f2 = drawable3.particles.get(i3).x2 - abs3;
                                f3 = Drawable.this.particles.get(i3).y2;
                            } else {
                                f2 = drawable3.particles.get(i3).x - abs3;
                                f3 = Drawable.this.particles.get(i3).y;
                            }
                            float f6 = f3 - abs4;
                            float f7 = (f2 * f2) + (f6 * f6);
                            if (f7 < f5) {
                                f5 = f7;
                            }
                        }
                        if (f5 > f4) {
                            abs = abs3;
                            abs2 = abs4;
                            f4 = f5;
                        }
                    }
                    this.x = abs;
                    this.y = abs2;
                } else if (drawable2.isCircle) {
                    float width = Drawable.this.rect.width();
                    float f8 = Drawable.this.excludeRadius;
                    float abs5 = ((Math.abs(Utilities.fastRandom.nextInt() % 1000) / 1000.0f) * (width - f8)) + f8;
                    float abs6 = Math.abs(Utilities.fastRandom.nextInt() % 360);
                    if (!Drawable.this.flip[this.starIndex] || this.first) {
                        f = 0.0f;
                    } else {
                        abs5 = Math.min(abs5, AndroidUtilities.dp(10.0f));
                        f = AndroidUtilities.dp(30.0f) + 0.0f;
                    }
                    float centerX = Drawable.this.rect.centerX() + Drawable.this.centerOffsetX;
                    double d = abs5;
                    double d2 = abs6;
                    double sin = Math.sin(Math.toRadians(d2));
                    Double.isNaN(d);
                    this.x = centerX + ((float) (sin * d));
                    double cos = Math.cos(Math.toRadians(d2));
                    Double.isNaN(d);
                    this.y = Drawable.this.rect.centerY() + f + Drawable.this.centerOffsetY + ((float) (d * cos));
                } else {
                    this.x = drawable2.rect.left + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.width());
                    this.y = Drawable.this.rect.top + Math.abs(Utilities.fastRandom.nextInt() % Drawable.this.rect.height());
                }
                if (Drawable.this.flip[this.starIndex]) {
                    this.flipProgress = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
                }
                Drawable drawable4 = Drawable.this;
                if (drawable4.flip[this.starIndex]) {
                    atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
                } else if (drawable4.startFromCenter) {
                    atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
                } else {
                    float f9 = this.y;
                    float centerY = drawable4.rect.centerY();
                    Drawable drawable5 = Drawable.this;
                    atan2 = Math.atan2(f9 - (centerY + drawable5.centerOffsetY), this.x - (drawable5.rect.centerX() + Drawable.this.centerOffsetX));
                }
                this.vecX = (float) Math.cos(atan2);
                this.vecY = (float) Math.sin(atan2);
                if (Drawable.this.svg[this.starIndex]) {
                    this.alpha = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
                } else {
                    this.alpha = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
                }
                int i4 = Drawable.this.type;
                if ((i4 == 6 && ((i = this.starIndex) == 1 || i == 2)) || i4 == 9 || i4 == 3 || i4 == 7 || i4 == 24 || i4 == 11 || i4 == 22 || i4 == 4) {
                    this.randomRotate = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
                }
                Drawable drawable6 = Drawable.this;
                if (drawable6.type != 101) {
                    this.inProgress = 0.0f;
                }
                if (drawable6.startFromCenter) {
                    float nextFloat2 = (((Utilities.fastRandom.nextFloat() * 1.2f) + 0.6f) * Math.min(Drawable.this.rect.width(), Drawable.this.rect.height())) / 2.0f;
                    float centerX2 = Drawable.this.rect.centerX() + Drawable.this.centerOffsetX + (((float) Math.cos(atan2)) * nextFloat2);
                    this.x = centerX2;
                    this.x2 = centerX2;
                    float centerY2 = Drawable.this.rect.centerY() + Drawable.this.centerOffsetY + (((float) Math.sin(atan2)) * nextFloat2);
                    this.y = centerY2;
                    this.y2 = centerY2;
                }
                this.first = false;
            }
        }
    }

    public void setPaused(boolean z) {
        Drawable drawable = this.drawable;
        if (z == drawable.paused) {
            return;
        }
        drawable.paused = z;
        if (z) {
            drawable.pausedTime = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < this.drawable.particles.size(); i++) {
            this.drawable.particles.get(i).lifeTime += System.currentTimeMillis() - this.drawable.pausedTime;
        }
        invalidate();
    }
}
