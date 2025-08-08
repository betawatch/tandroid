package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.PhotoCropActivity;

/* loaded from: classes4.dex */
public class PhotoCropActivity extends BaseFragment {
    private String bitmapKey;
    private PhotoEditActivityDelegate delegate;
    private boolean doneButtonPressed;
    private BitmapDrawable drawable;
    private Bitmap imageToCrop;
    private boolean sameBitmap;
    private PhotoCropView view;

    public interface PhotoEditActivityDelegate {
        void didFinishEdit(Bitmap bitmap);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    class PhotoCropView extends FrameLayout {
        int bitmapHeight;
        int bitmapWidth;
        int bitmapX;
        int bitmapY;
        Paint circlePaint;
        int draggingState;
        boolean freeform;
        Paint halfPaint;
        float oldX;
        float oldY;
        Paint rectPaint;
        float rectSizeX;
        float rectSizeY;
        float rectX;
        float rectY;
        int viewHeight;
        int viewWidth;

        public PhotoCropView(Context context) {
            super(context);
            this.rectPaint = null;
            this.circlePaint = null;
            this.halfPaint = null;
            this.rectSizeX = 600.0f;
            this.rectSizeY = 600.0f;
            this.rectX = -1.0f;
            this.rectY = -1.0f;
            this.draggingState = 0;
            this.oldX = 0.0f;
            this.oldY = 0.0f;
            init();
        }

        private void init() {
            Paint paint = new Paint();
            this.rectPaint = paint;
            paint.setColor(1073412858);
            this.rectPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            this.rectPaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.circlePaint = paint2;
            paint2.setColor(-1);
            Paint paint3 = new Paint();
            this.halfPaint = paint3;
            paint3.setColor(-939524096);
            setBackgroundColor(-13421773);
            setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.PhotoCropActivity$PhotoCropView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$init$0;
                    lambda$init$0 = PhotoCropActivity.PhotoCropView.this.lambda$init$0(view, motionEvent);
                    return lambda$init$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ boolean lambda$init$0(View view, MotionEvent motionEvent) {
            int i;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int dp = AndroidUtilities.dp(14.0f);
            if (motionEvent.getAction() == 0) {
                float f = this.rectX;
                float f2 = dp;
                float f3 = f - f2;
                if (f3 < x && f + f2 > x) {
                    float f4 = this.rectY;
                    if (f4 - f2 < y && f4 + f2 > y) {
                        this.draggingState = 1;
                        if (this.draggingState != 0) {
                            requestDisallowInterceptTouchEvent(true);
                        }
                        this.oldX = x;
                        this.oldY = y;
                    }
                }
                float f5 = this.rectSizeX;
                float f6 = f3 + f5;
                if (f6 < x && f + f2 + f5 > x) {
                    float f7 = this.rectY;
                    if (f7 - f2 < y && f7 + f2 > y) {
                        this.draggingState = 2;
                        if (this.draggingState != 0) {
                        }
                        this.oldX = x;
                        this.oldY = y;
                    }
                }
                if (f3 < x && f + f2 > x) {
                    float f8 = this.rectY;
                    float f9 = this.rectSizeY;
                    if ((f8 - f2) + f9 < y && f8 + f2 + f9 > y) {
                        this.draggingState = 3;
                        if (this.draggingState != 0) {
                        }
                        this.oldX = x;
                        this.oldY = y;
                    }
                }
                if (f6 < x && f + f2 + f5 > x) {
                    float f10 = this.rectY;
                    float f11 = this.rectSizeY;
                    if ((f10 - f2) + f11 < y && f10 + f2 + f11 > y) {
                        this.draggingState = 4;
                        if (this.draggingState != 0) {
                        }
                        this.oldX = x;
                        this.oldY = y;
                    }
                }
                if (f < x && f + f5 > x) {
                    float f12 = this.rectY;
                    if (f12 < y && f12 + this.rectSizeY > y) {
                        this.draggingState = 5;
                        if (this.draggingState != 0) {
                        }
                        this.oldX = x;
                        this.oldY = y;
                    }
                }
                this.draggingState = 0;
                if (this.draggingState != 0) {
                }
                this.oldX = x;
                this.oldY = y;
            } else if (motionEvent.getAction() == 1) {
                this.draggingState = 0;
            } else if (motionEvent.getAction() == 2 && (i = this.draggingState) != 0) {
                float f13 = x - this.oldX;
                float f14 = y - this.oldY;
                if (i == 5) {
                    float f15 = this.rectX + f13;
                    this.rectX = f15;
                    float f16 = this.rectY + f14;
                    this.rectY = f16;
                    int i2 = this.bitmapX;
                    float f17 = i2;
                    if (f15 < f17) {
                        this.rectX = f17;
                    } else {
                        float f18 = this.rectSizeX;
                        float f19 = f15 + f18;
                        float f20 = i2 + this.bitmapWidth;
                        if (f19 > f20) {
                            this.rectX = f20 - f18;
                        }
                    }
                    int i3 = this.bitmapY;
                    float f21 = i3;
                    if (f16 < f21) {
                        this.rectY = f21;
                    } else {
                        float f22 = this.rectSizeY;
                        float f23 = f16 + f22;
                        float f24 = i3 + this.bitmapHeight;
                        if (f23 > f24) {
                            this.rectY = f24 - f22;
                        }
                    }
                } else if (i == 1) {
                    float f25 = this.rectSizeX;
                    if (f25 - f13 < 160.0f) {
                        f13 = f25 - 160.0f;
                    }
                    float f26 = this.rectX;
                    float f27 = f26 + f13;
                    float f28 = this.bitmapX;
                    if (f27 < f28) {
                        f13 = f28 - f26;
                    }
                    if (!this.freeform) {
                        float f29 = this.rectY;
                        float f30 = f29 + f13;
                        float f31 = this.bitmapY;
                        if (f30 < f31) {
                            f13 = f31 - f29;
                        }
                        this.rectX = f26 + f13;
                        this.rectY = f29 + f13;
                        this.rectSizeX = f25 - f13;
                        this.rectSizeY -= f13;
                    } else {
                        float f32 = this.rectSizeY;
                        if (f32 - f14 < 160.0f) {
                            f14 = f32 - 160.0f;
                        }
                        float f33 = this.rectY;
                        float f34 = f33 + f14;
                        float f35 = this.bitmapY;
                        if (f34 < f35) {
                            f14 = f35 - f33;
                        }
                        this.rectX = f26 + f13;
                        this.rectY = f33 + f14;
                        this.rectSizeX = f25 - f13;
                        this.rectSizeY = f32 - f14;
                    }
                } else if (i == 2) {
                    float f36 = this.rectSizeX;
                    if (f36 + f13 < 160.0f) {
                        f13 = -(f36 - 160.0f);
                    }
                    float f37 = this.rectX;
                    float f38 = f37 + f36 + f13;
                    float f39 = this.bitmapX + this.bitmapWidth;
                    if (f38 > f39) {
                        f13 = (f39 - f37) - f36;
                    }
                    if (!this.freeform) {
                        float f40 = this.rectY;
                        float f41 = f40 - f13;
                        float f42 = this.bitmapY;
                        if (f41 < f42) {
                            f13 = f40 - f42;
                        }
                        this.rectY = f40 - f13;
                        this.rectSizeX = f36 + f13;
                        this.rectSizeY += f13;
                    } else {
                        float f43 = this.rectSizeY;
                        if (f43 - f14 < 160.0f) {
                            f14 = f43 - 160.0f;
                        }
                        float f44 = this.rectY;
                        float f45 = f44 + f14;
                        float f46 = this.bitmapY;
                        if (f45 < f46) {
                            f14 = f46 - f44;
                        }
                        this.rectY = f44 + f14;
                        this.rectSizeX = f36 + f13;
                        this.rectSizeY = f43 - f14;
                    }
                } else if (i == 3) {
                    float f47 = this.rectSizeX;
                    if (f47 - f13 < 160.0f) {
                        f13 = f47 - 160.0f;
                    }
                    float f48 = this.rectX;
                    float f49 = f48 + f13;
                    float f50 = this.bitmapX;
                    if (f49 < f50) {
                        f13 = f50 - f48;
                    }
                    if (!this.freeform) {
                        float f51 = this.rectY + f47;
                        float f52 = f51 - f13;
                        int i4 = this.bitmapY;
                        int i5 = this.bitmapHeight;
                        if (f52 > i4 + i5) {
                            f13 = (f51 - i4) - i5;
                        }
                        this.rectX = f48 + f13;
                        this.rectSizeX = f47 - f13;
                        this.rectSizeY -= f13;
                    } else {
                        float f53 = this.rectY;
                        float f54 = this.rectSizeY;
                        float f55 = f53 + f54 + f14;
                        float f56 = this.bitmapY + this.bitmapHeight;
                        if (f55 > f56) {
                            f14 = (f56 - f53) - f54;
                        }
                        this.rectX = f48 + f13;
                        this.rectSizeX = f47 - f13;
                        float f57 = f54 + f14;
                        this.rectSizeY = f57;
                        if (f57 < 160.0f) {
                            this.rectSizeY = 160.0f;
                        }
                    }
                } else if (i == 4) {
                    float f58 = this.rectX;
                    float f59 = this.rectSizeX;
                    float f60 = f58 + f59 + f13;
                    float f61 = this.bitmapX + this.bitmapWidth;
                    if (f60 > f61) {
                        f13 = (f61 - f58) - f59;
                    }
                    if (!this.freeform) {
                        float f62 = this.rectY;
                        float f63 = f62 + f59 + f13;
                        float f64 = this.bitmapY + this.bitmapHeight;
                        if (f63 > f64) {
                            f13 = (f64 - f62) - f59;
                        }
                        this.rectSizeX = f59 + f13;
                        this.rectSizeY += f13;
                    } else {
                        float f65 = this.rectY;
                        float f66 = this.rectSizeY;
                        float f67 = f65 + f66 + f14;
                        float f68 = this.bitmapY + this.bitmapHeight;
                        if (f67 > f68) {
                            f14 = (f68 - f65) - f66;
                        }
                        this.rectSizeX = f59 + f13;
                        this.rectSizeY = f66 + f14;
                    }
                    if (this.rectSizeX < 160.0f) {
                        this.rectSizeX = 160.0f;
                    }
                    if (this.rectSizeY < 160.0f) {
                        this.rectSizeY = 160.0f;
                    }
                }
                this.oldX = x;
                this.oldY = y;
                invalidate();
            }
            return true;
        }

        private void updateBitmapSize() {
            if (this.viewWidth == 0 || this.viewHeight == 0 || PhotoCropActivity.this.imageToCrop == null) {
                return;
            }
            float f = this.rectX - this.bitmapX;
            float f2 = this.bitmapWidth;
            float f3 = f / f2;
            float f4 = this.rectY - this.bitmapY;
            float f5 = this.bitmapHeight;
            float f6 = f4 / f5;
            float f7 = this.rectSizeX / f2;
            float f8 = this.rectSizeY / f5;
            float width = PhotoCropActivity.this.imageToCrop.getWidth();
            float height = PhotoCropActivity.this.imageToCrop.getHeight();
            int i = this.viewWidth;
            float f9 = i / width;
            int i2 = this.viewHeight;
            if (f9 > i2 / height) {
                this.bitmapHeight = i2;
                this.bitmapWidth = (int) Math.ceil(width * r9);
            } else {
                this.bitmapWidth = i;
                this.bitmapHeight = (int) Math.ceil(height * f9);
            }
            this.bitmapX = ((this.viewWidth - this.bitmapWidth) / 2) + AndroidUtilities.dp(14.0f);
            int dp = ((this.viewHeight - this.bitmapHeight) / 2) + AndroidUtilities.dp(14.0f);
            this.bitmapY = dp;
            if (this.rectX == -1.0f && this.rectY == -1.0f) {
                if (this.freeform) {
                    this.rectY = dp;
                    this.rectX = this.bitmapX;
                    this.rectSizeX = this.bitmapWidth;
                    this.rectSizeY = this.bitmapHeight;
                } else {
                    if (this.bitmapWidth > this.bitmapHeight) {
                        this.rectY = dp;
                        this.rectX = ((this.viewWidth - r1) / 2) + AndroidUtilities.dp(14.0f);
                        float f10 = this.bitmapHeight;
                        this.rectSizeX = f10;
                        this.rectSizeY = f10;
                    } else {
                        this.rectX = this.bitmapX;
                        this.rectY = ((this.viewHeight - r0) / 2) + AndroidUtilities.dp(14.0f);
                        float f11 = this.bitmapWidth;
                        this.rectSizeX = f11;
                        this.rectSizeY = f11;
                    }
                }
            } else {
                float f12 = this.bitmapWidth;
                this.rectX = (f3 * f12) + this.bitmapX;
                float f13 = this.bitmapHeight;
                this.rectY = (f6 * f13) + dp;
                this.rectSizeX = f7 * f12;
                this.rectSizeY = f8 * f13;
            }
            invalidate();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.viewWidth = (i3 - i) - AndroidUtilities.dp(28.0f);
            this.viewHeight = (i4 - i2) - AndroidUtilities.dp(28.0f);
            updateBitmapSize();
        }

        public Bitmap getBitmap() {
            float f = this.rectX - this.bitmapX;
            float f2 = this.bitmapWidth;
            float f3 = (this.rectY - this.bitmapY) / this.bitmapHeight;
            float f4 = this.rectSizeX / f2;
            float f5 = this.rectSizeY / f2;
            int width = (int) ((f / f2) * PhotoCropActivity.this.imageToCrop.getWidth());
            int height = (int) (f3 * PhotoCropActivity.this.imageToCrop.getHeight());
            int width2 = (int) (f4 * PhotoCropActivity.this.imageToCrop.getWidth());
            int width3 = (int) (f5 * PhotoCropActivity.this.imageToCrop.getWidth());
            if (width < 0) {
                width = 0;
            }
            if (height < 0) {
                height = 0;
            }
            if (width + width2 > PhotoCropActivity.this.imageToCrop.getWidth()) {
                width2 = PhotoCropActivity.this.imageToCrop.getWidth() - width;
            }
            if (height + width3 > PhotoCropActivity.this.imageToCrop.getHeight()) {
                width3 = PhotoCropActivity.this.imageToCrop.getHeight() - height;
            }
            try {
                return Bitmaps.createBitmap(PhotoCropActivity.this.imageToCrop, width, height, width2, width3);
            } catch (Throwable th) {
                FileLog.e(th);
                System.gc();
                try {
                    return Bitmaps.createBitmap(PhotoCropActivity.this.imageToCrop, width, height, width2, width3);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return null;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x01a3 A[LOOP:0: B:5:0x01a1->B:6:0x01a3, LOOP_END] */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onDraw(Canvas canvas) {
            int i;
            if (PhotoCropActivity.this.drawable != null) {
                try {
                    BitmapDrawable bitmapDrawable = PhotoCropActivity.this.drawable;
                    int i2 = this.bitmapX;
                    int i3 = this.bitmapY;
                    bitmapDrawable.setBounds(i2, i3, this.bitmapWidth + i2, this.bitmapHeight + i3);
                    try {
                        PhotoCropActivity.this.drawable.draw(canvas);
                    } catch (Throwable th) {
                        th = th;
                        FileLog.e(th);
                        canvas.drawRect(this.bitmapX, this.bitmapY, r0 + this.bitmapWidth, this.rectY, this.halfPaint);
                        float f = this.bitmapX;
                        float f2 = this.rectY;
                        canvas.drawRect(f, f2, this.rectX, f2 + this.rectSizeY, this.halfPaint);
                        float f3 = this.rectX + this.rectSizeX;
                        float f4 = this.rectY;
                        canvas.drawRect(f3, f4, this.bitmapX + this.bitmapWidth, f4 + this.rectSizeY, this.halfPaint);
                        canvas.drawRect(this.bitmapX, this.rectSizeY + this.rectY, r0 + this.bitmapWidth, this.bitmapY + this.bitmapHeight, this.halfPaint);
                        float f5 = this.rectX;
                        float f6 = this.rectY;
                        canvas.drawRect(f5, f6, f5 + this.rectSizeX, f6 + this.rectSizeY, this.rectPaint);
                        int dp = AndroidUtilities.dp(1.0f);
                        float f7 = dp;
                        float f8 = this.rectX + f7;
                        float f9 = dp * 3;
                        canvas.drawRect(f8, this.rectY + f7, f8 + AndroidUtilities.dp(20.0f), this.rectY + f9, this.circlePaint);
                        float f10 = this.rectX;
                        float f11 = this.rectY + f7;
                        canvas.drawRect(f10 + f7, f11, f10 + f9, f11 + AndroidUtilities.dp(20.0f), this.circlePaint);
                        float dp2 = ((this.rectX + this.rectSizeX) - f7) - AndroidUtilities.dp(20.0f);
                        float f12 = this.rectY;
                        canvas.drawRect(dp2, f12 + f7, (this.rectX + this.rectSizeX) - f7, f12 + f9, this.circlePaint);
                        float f13 = this.rectX + this.rectSizeX;
                        float f14 = this.rectY + f7;
                        canvas.drawRect(f13 - f9, f14, f13 - f7, f14 + AndroidUtilities.dp(20.0f), this.circlePaint);
                        canvas.drawRect(this.rectX + f7, ((this.rectY + this.rectSizeY) - f7) - AndroidUtilities.dp(20.0f), this.rectX + f9, (this.rectY + this.rectSizeY) - f7, this.circlePaint);
                        float f15 = this.rectX + f7;
                        canvas.drawRect(f15, (this.rectY + this.rectSizeY) - f9, f15 + AndroidUtilities.dp(20.0f), (this.rectY + this.rectSizeY) - f7, this.circlePaint);
                        float dp3 = ((this.rectX + this.rectSizeX) - f7) - AndroidUtilities.dp(20.0f);
                        float f16 = this.rectY + this.rectSizeY;
                        canvas.drawRect(dp3, f16 - f9, (this.rectX + this.rectSizeX) - f7, f16 - f7, this.circlePaint);
                        canvas.drawRect((this.rectX + this.rectSizeX) - f9, ((this.rectY + this.rectSizeY) - f7) - AndroidUtilities.dp(20.0f), (this.rectX + this.rectSizeX) - f7, (this.rectY + this.rectSizeY) - f7, this.circlePaint);
                        while (i < 3) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            canvas.drawRect(this.bitmapX, this.bitmapY, r0 + this.bitmapWidth, this.rectY, this.halfPaint);
            float f17 = this.bitmapX;
            float f22 = this.rectY;
            canvas.drawRect(f17, f22, this.rectX, f22 + this.rectSizeY, this.halfPaint);
            float f32 = this.rectX + this.rectSizeX;
            float f42 = this.rectY;
            canvas.drawRect(f32, f42, this.bitmapX + this.bitmapWidth, f42 + this.rectSizeY, this.halfPaint);
            canvas.drawRect(this.bitmapX, this.rectSizeY + this.rectY, r0 + this.bitmapWidth, this.bitmapY + this.bitmapHeight, this.halfPaint);
            float f52 = this.rectX;
            float f62 = this.rectY;
            canvas.drawRect(f52, f62, f52 + this.rectSizeX, f62 + this.rectSizeY, this.rectPaint);
            int dp4 = AndroidUtilities.dp(1.0f);
            float f72 = dp4;
            float f82 = this.rectX + f72;
            float f92 = dp4 * 3;
            canvas.drawRect(f82, this.rectY + f72, f82 + AndroidUtilities.dp(20.0f), this.rectY + f92, this.circlePaint);
            float f102 = this.rectX;
            float f112 = this.rectY + f72;
            canvas.drawRect(f102 + f72, f112, f102 + f92, f112 + AndroidUtilities.dp(20.0f), this.circlePaint);
            float dp22 = ((this.rectX + this.rectSizeX) - f72) - AndroidUtilities.dp(20.0f);
            float f122 = this.rectY;
            canvas.drawRect(dp22, f122 + f72, (this.rectX + this.rectSizeX) - f72, f122 + f92, this.circlePaint);
            float f132 = this.rectX + this.rectSizeX;
            float f142 = this.rectY + f72;
            canvas.drawRect(f132 - f92, f142, f132 - f72, f142 + AndroidUtilities.dp(20.0f), this.circlePaint);
            canvas.drawRect(this.rectX + f72, ((this.rectY + this.rectSizeY) - f72) - AndroidUtilities.dp(20.0f), this.rectX + f92, (this.rectY + this.rectSizeY) - f72, this.circlePaint);
            float f152 = this.rectX + f72;
            canvas.drawRect(f152, (this.rectY + this.rectSizeY) - f92, f152 + AndroidUtilities.dp(20.0f), (this.rectY + this.rectSizeY) - f72, this.circlePaint);
            float dp32 = ((this.rectX + this.rectSizeX) - f72) - AndroidUtilities.dp(20.0f);
            float f162 = this.rectY + this.rectSizeY;
            canvas.drawRect(dp32, f162 - f92, (this.rectX + this.rectSizeX) - f72, f162 - f72, this.circlePaint);
            canvas.drawRect((this.rectX + this.rectSizeX) - f92, ((this.rectY + this.rectSizeY) - f72) - AndroidUtilities.dp(20.0f), (this.rectX + this.rectSizeX) - f72, (this.rectY + this.rectSizeY) - f72, this.circlePaint);
            for (i = 1; i < 3; i++) {
                float f18 = this.rectX;
                float f19 = i;
                float f20 = (this.rectSizeX / 3.0f) * f19;
                float f21 = this.rectY;
                canvas.drawRect(f18 + f20, f21 + f72, f18 + f72 + f20, (f21 + this.rectSizeY) - f72, this.circlePaint);
                float f23 = this.rectX;
                float f24 = this.rectY + ((this.rectSizeY / 3.0f) * f19);
                canvas.drawRect(f23 + f72, f24, this.rectSizeX + (f23 - f72), f24 + f72, this.circlePaint);
            }
        }
    }

    public PhotoCropActivity(Bundle bundle) {
        super(bundle);
        this.delegate = null;
        this.sameBitmap = false;
        this.doneButtonPressed = false;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        int max;
        if (this.imageToCrop == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !new File(string).exists()) {
                return false;
            }
            if (AndroidUtilities.isTablet()) {
                max = AndroidUtilities.dp(520.0f);
            } else {
                Point point = AndroidUtilities.displaySize;
                max = Math.max(point.x, point.y);
            }
            float f = max;
            Bitmap loadBitmap = ImageLoader.loadBitmap(string, uri, f, f, true);
            this.imageToCrop = loadBitmap;
            if (loadBitmap == null) {
                return false;
            }
        }
        this.drawable = new BitmapDrawable(this.imageToCrop);
        super.onFragmentCreate();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        Bitmap bitmap;
        super.onFragmentDestroy();
        if (this.bitmapKey != null && ImageLoader.getInstance().decrementUseCount(this.bitmapKey) && !ImageLoader.getInstance().isInMemCache(this.bitmapKey, false)) {
            this.bitmapKey = null;
        }
        if (this.bitmapKey == null && (bitmap = this.imageToCrop) != null && !this.sameBitmap) {
            bitmap.recycle();
            this.imageToCrop = null;
        }
        this.drawable = null;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.setItemsBackgroundColor(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.setItemsColor(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.CropImage));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.PhotoCropActivity.1
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i) {
                if (i == -1) {
                    PhotoCropActivity.this.lambda$onBackPressed$355();
                    return;
                }
                if (i == 1) {
                    if (PhotoCropActivity.this.delegate != null && !PhotoCropActivity.this.doneButtonPressed) {
                        Bitmap bitmap = PhotoCropActivity.this.view.getBitmap();
                        if (bitmap == PhotoCropActivity.this.imageToCrop) {
                            PhotoCropActivity.this.sameBitmap = true;
                        }
                        PhotoCropActivity.this.delegate.didFinishEdit(bitmap);
                        PhotoCropActivity.this.doneButtonPressed = true;
                    }
                    PhotoCropActivity.this.lambda$onBackPressed$355();
                }
            }
        });
        this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        PhotoCropView photoCropView = new PhotoCropView(context);
        this.view = photoCropView;
        this.fragmentView = photoCropView;
        photoCropView.freeform = getArguments().getBoolean("freeform", false);
        this.fragmentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.fragmentView;
    }

    public void setDelegate(PhotoEditActivityDelegate photoEditActivityDelegate) {
        this.delegate = photoEditActivityDelegate;
    }
}
