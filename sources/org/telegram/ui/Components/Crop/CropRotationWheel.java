package org.telegram.ui.Components.Crop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

/* loaded from: classes5.dex */
public class CropRotationWheel extends FrameLayout {
    private ImageView aspectRatioButton;
    private Paint bluePaint;
    private String degreesText;
    private TextPaint degreesTextPaint;
    private ImageView mirrorButton;
    private float prevX;
    protected float rotation;
    private ImageView rotation90Button;
    private RotationWheelListener rotationListener;
    private RectF tempRect;
    private Paint whitePaint;

    public interface RotationWheelListener {
        void aspectRatioPressed();

        boolean mirror();

        void onChange(float f);

        void onEnd(float f);

        void onStart();

        boolean rotate90Pressed();
    }

    public void setFreeform(boolean z) {
    }

    public CropRotationWheel(Context context) {
        super(context);
        this.tempRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.whitePaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.whitePaint.setColor(-1);
        this.whitePaint.setAlpha(NotificationCenter.didReceiveSmsCode);
        this.whitePaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.bluePaint = paint2;
        paint2.setStyle(style);
        this.bluePaint.setColor(-11420173);
        this.bluePaint.setAlpha(NotificationCenter.didReceiveSmsCode);
        this.bluePaint.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.mirrorButton = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        this.mirrorButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        ImageView imageView2 = this.mirrorButton;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        this.mirrorButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Crop.CropRotationWheel$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CropRotationWheel.$r8$lambda$_kKv5ZU5duqWNkbW-St-PVNLUqE(CropRotationWheel.this, view);
            }
        });
        this.mirrorButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Components.Crop.CropRotationWheel$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return CropRotationWheel.$r8$lambda$ii_mKFpdpuRx_6Yi9woLN9t_7Hc(CropRotationWheel.this, view);
            }
        });
        this.mirrorButton.setContentDescription(LocaleController.getString(R.string.AccDescrMirror));
        addView(this.mirrorButton, LayoutHelper.createFrame(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.aspectRatioButton = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_cropfix);
        this.aspectRatioButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.aspectRatioButton.setScaleType(scaleType);
        this.aspectRatioButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Crop.CropRotationWheel$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CropRotationWheel.$r8$lambda$rGAw4KW_FOPaf2ISMFirYQDucMg(CropRotationWheel.this, view);
            }
        });
        this.aspectRatioButton.setVisibility(8);
        this.aspectRatioButton.setContentDescription(LocaleController.getString(R.string.AccDescrAspectRatio));
        addView(this.aspectRatioButton, LayoutHelper.createFrame(70, 64, 19));
        ImageView imageView4 = new ImageView(context);
        this.rotation90Button = imageView4;
        imageView4.setImageResource(R.drawable.msg_photo_rotate);
        this.rotation90Button.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.rotation90Button.setScaleType(scaleType);
        this.rotation90Button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Crop.CropRotationWheel$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CropRotationWheel.$r8$lambda$4p-WpcLGhBIA87ldncOPMZyJpZQ(CropRotationWheel.this, view);
            }
        });
        this.rotation90Button.setContentDescription(LocaleController.getString(R.string.AccDescrRotate));
        addView(this.rotation90Button, LayoutHelper.createFrame(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.degreesTextPaint = textPaint;
        textPaint.setColor(-1);
        this.degreesTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        setRotation(0.0f, false);
    }

    public static /* synthetic */ void $r8$lambda$_kKv5ZU5duqWNkbW-St-PVNLUqE(CropRotationWheel cropRotationWheel, View view) {
        RotationWheelListener rotationWheelListener = cropRotationWheel.rotationListener;
        if (rotationWheelListener != null) {
            cropRotationWheel.setMirrored(rotationWheelListener.mirror());
        }
    }

    public static /* synthetic */ boolean $r8$lambda$ii_mKFpdpuRx_6Yi9woLN9t_7Hc(CropRotationWheel cropRotationWheel, View view) {
        cropRotationWheel.aspectRatioButton.callOnClick();
        return true;
    }

    public static /* synthetic */ void $r8$lambda$rGAw4KW_FOPaf2ISMFirYQDucMg(CropRotationWheel cropRotationWheel, View view) {
        RotationWheelListener rotationWheelListener = cropRotationWheel.rotationListener;
        if (rotationWheelListener != null) {
            rotationWheelListener.aspectRatioPressed();
        }
    }

    public static /* synthetic */ void $r8$lambda$4p-WpcLGhBIA87ldncOPMZyJpZQ(CropRotationWheel cropRotationWheel, View view) {
        RotationWheelListener rotationWheelListener = cropRotationWheel.rotationListener;
        if (rotationWheelListener != null) {
            cropRotationWheel.setRotated(rotationWheelListener.rotate90Pressed());
        }
    }

    public void setMirrored(boolean z) {
        this.mirrorButton.setColorFilter(z ? new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setRotated(boolean z) {
        this.rotation90Button.setColorFilter(z ? new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY) : null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), AndroidUtilities.dp(400.0f)), TLObject.FLAG_30), i2);
    }

    public void reset(boolean z) {
        setRotation(0.0f, false);
        if (z) {
            setMirrored(false);
        }
        setRotated(false);
    }

    public void setListener(RotationWheelListener rotationWheelListener) {
        this.rotationListener = rotationWheelListener;
    }

    public void setRotation(float f, boolean z) {
        this.rotation = f;
        if (Math.abs(f) < 0.099d) {
            f = Math.abs(f);
        }
        this.degreesText = String.format("%.1fº", Float.valueOf(f));
        invalidate();
    }

    @Override // android.view.View
    public float getRotation() {
        return this.rotation;
    }

    public void setAspectLock(boolean z) {
        this.aspectRatioButton.setColorFilter(z ? new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY) : null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        if (actionMasked == 0) {
            this.prevX = x;
            RotationWheelListener rotationWheelListener = this.rotationListener;
            if (rotationWheelListener != null) {
                rotationWheelListener.onStart();
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            RotationWheelListener rotationWheelListener2 = this.rotationListener;
            if (rotationWheelListener2 != null) {
                rotationWheelListener2.onEnd(this.rotation);
            }
            AndroidUtilities.makeAccessibilityAnnouncement(String.format("%.1f°", Float.valueOf(this.rotation)));
        } else if (actionMasked == 2) {
            float max = Math.max(-45.0f, Math.min(45.0f, this.rotation + ((float) ((((this.prevX - x) / AndroidUtilities.density) / 3.141592653589793d) / 1.649999976158142d))));
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    if (Math.abs(max - 45.0f) < 0.001f) {
                        if (Math.abs(this.rotation - 45.0f) < 0.001f) {
                        }
                        performHapticFeedback(3, 1);
                    }
                    if (Math.abs(max - (-45.0f)) >= 0.001f || Math.abs(this.rotation - (-45.0f)) < 0.001f) {
                        if (Math.floor(this.rotation / 2.5f) != Math.floor(max / 2.5f)) {
                            AndroidUtilities.vibrateCursor(this);
                        }
                    }
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
            if (Math.abs(max - this.rotation) > 0.001d) {
                if (Math.abs(max) < 0.05d) {
                    max = 0.0f;
                }
                setRotation(max, false);
                RotationWheelListener rotationWheelListener3 = this.rotationListener;
                if (rotationWheelListener3 != null) {
                    rotationWheelListener3.onChange(this.rotation);
                }
                this.prevX = x;
            }
        }
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f = ((-this.rotation) * 2.0f) % 5.0f;
        int floor = (int) Math.floor(r0 / 5.0f);
        int i = 0;
        while (i < 16) {
            Paint paint = this.whitePaint;
            if (i < floor || (i == 0 && f < 0.0f)) {
                paint = this.bluePaint;
            }
            Canvas canvas2 = canvas;
            drawLine(canvas2, i, f, width, height, i == floor || (i == 0 && floor == -1), paint);
            int i2 = i;
            if (i2 != 0) {
                int i3 = -i2;
                drawLine(canvas2, i3, f, width, height, i3 == floor + 1, i3 > floor ? this.bluePaint : this.whitePaint);
            }
            i = i2 + 1;
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.bluePaint.setAlpha(NotificationCenter.didReceiveSmsCode);
        this.tempRect.left = (width - AndroidUtilities.dp(2.5f)) / 2;
        this.tempRect.top = (height - AndroidUtilities.dp(22.0f)) / 2;
        this.tempRect.right = (AndroidUtilities.dp(2.5f) + width) / 2;
        this.tempRect.bottom = (height + AndroidUtilities.dp(22.0f)) / 2;
        canvas3.drawRoundRect(this.tempRect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.bluePaint);
        canvas3.drawText(this.degreesText, (width - this.degreesTextPaint.measureText(this.degreesText)) / 2.0f, AndroidUtilities.dp(14.0f), this.degreesTextPaint);
    }

    protected void drawLine(Canvas canvas, int i, float f, int i2, int i3, boolean z, Paint paint) {
        int dp = (int) ((i2 / 2.0f) - AndroidUtilities.dp(70.0f));
        int cos = (i2 / 2) + ((int) (dp * Math.cos(Math.toRadians(90.0f - ((i * 5) + f)))));
        float abs = Math.abs(r8) / dp;
        int min = Math.min(NotificationCenter.didReceiveSmsCode, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z) {
            paint = this.bluePaint;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        int i4 = z ? 4 : 2;
        int dp2 = AndroidUtilities.dp(z ? 16.0f : 12.0f);
        int i5 = i4 / 2;
        canvas.drawRect(cos - i5, (i3 - dp2) / 2, cos + i5, (i3 + dp2) / 2, paint2);
    }
}
