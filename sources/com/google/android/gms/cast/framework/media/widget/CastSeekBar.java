package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0;
import com.google.android.gms.cast.framework.R$attr;
import com.google.android.gms.cast.framework.R$dimen;
import com.google.android.gms.cast.framework.R$style;
import com.google.android.gms.cast.framework.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class CastSeekBar extends View {
    public zze zza;
    public List zzc;
    private boolean zze;
    private Integer zzf;
    private final float zzg;
    private final float zzh;
    private final float zzi;
    private final float zzj;
    private final float zzk;
    private final Paint zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private int[] zzq;
    private Point zzr;
    private Runnable zzs;

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzc = new ArrayList();
        setAccessibilityDelegate(new zzg(this, null));
        Paint paint = new Paint(1);
        this.zzl = paint;
        paint.setStyle(Paint.Style.FILL);
        this.zzg = context.getResources().getDimension(R$dimen.cast_seek_bar_minimum_width);
        this.zzh = context.getResources().getDimension(R$dimen.cast_seek_bar_minimum_height);
        this.zzi = context.getResources().getDimension(R$dimen.cast_seek_bar_progress_height) / 2.0f;
        this.zzj = context.getResources().getDimension(R$dimen.cast_seek_bar_thumb_size) / 2.0f;
        this.zzk = context.getResources().getDimension(R$dimen.cast_seek_bar_ad_break_minimum_width);
        zze zzeVar = new zze();
        this.zza = zzeVar;
        zzeVar.zzb = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.CastExpandedController, R$attr.castExpandedControllerStyle, R$style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.CastExpandedController_castSeekBarProgressAndThumbColor, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.CastExpandedController_castSeekBarSecondaryProgressColor, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(R$styleable.CastExpandedController_castSeekBarUnseekableProgressColor, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(R$styleable.CastExpandedController_castAdBreakMarkerColor, 0);
        this.zzm = context.getResources().getColor(resourceId);
        this.zzn = context.getResources().getColor(resourceId2);
        this.zzo = context.getResources().getColor(resourceId3);
        this.zzp = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    private final int zzf(int i) {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        double d = this.zza.zzb;
        double d2 = i;
        double d3 = measuredWidth;
        Double.isNaN(d2);
        Double.isNaN(d3);
        Double.isNaN(d);
        return (int) ((d2 / d3) * d);
    }

    private final void zzg(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        this.zzl.setColor(i5);
        float f = i3;
        float f2 = i2 / f;
        float f3 = i / f;
        float f4 = i4;
        float f5 = this.zzi;
        canvas.drawRect(f3 * f4, -f5, f2 * f4, f5, this.zzl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(int i) {
        zze zzeVar = this.zza;
        if (zzeVar.zzf) {
            int i2 = zzeVar.zzd;
            this.zzf = Integer.valueOf(Math.min(Math.max(i, i2), zzeVar.zze));
            Runnable runnable = this.zzs;
            if (runnable == null) {
                this.zzs = new Runnable() { // from class: com.google.android.gms.cast.framework.media.widget.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        CastSeekBar.this.sendAccessibilityEvent(4);
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.zzs, 200L);
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi() {
        this.zze = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj() {
        this.zze = false;
    }

    public int getMaxProgress() {
        return this.zza.zzb;
    }

    public int getProgress() {
        Integer num = this.zzf;
        return num != null ? num.intValue() : this.zza.zza;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        Runnable runnable = this.zzs;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        CastSeekBar castSeekBar;
        Canvas canvas2;
        int i3;
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int progress = getProgress();
        int save2 = canvas.save();
        canvas.translate(0.0f, measuredHeight / 2);
        zze zzeVar = this.zza;
        if (zzeVar.zzf) {
            int i4 = zzeVar.zzd;
            if (i4 > 0) {
                zzg(canvas, 0, i4, zzeVar.zzb, measuredWidth, this.zzo);
            }
            zze zzeVar2 = this.zza;
            int i5 = zzeVar2.zzd;
            if (progress > i5) {
                zzg(canvas, i5, progress, zzeVar2.zzb, measuredWidth, this.zzm);
            }
            zze zzeVar3 = this.zza;
            int i6 = zzeVar3.zze;
            if (i6 > progress) {
                zzg(canvas, progress, i6, zzeVar3.zzb, measuredWidth, this.zzn);
            }
            zze zzeVar4 = this.zza;
            i = zzeVar4.zzb;
            i3 = zzeVar4.zze;
            if (i > i3) {
                i2 = this.zzo;
                castSeekBar = this;
                canvas2 = canvas;
                castSeekBar.zzg(canvas2, i3, i, i, measuredWidth, i2);
            }
        } else {
            int max = Math.max(zzeVar.zzc, 0);
            if (max > 0) {
                zzg(canvas, 0, max, this.zza.zzb, measuredWidth, this.zzo);
            }
            if (progress > max) {
                zzg(canvas, max, progress, this.zza.zzb, measuredWidth, this.zzm);
            }
            i = this.zza.zzb;
            if (i > progress) {
                i2 = this.zzo;
                castSeekBar = this;
                canvas2 = canvas;
                i3 = progress;
                castSeekBar.zzg(canvas2, i3, i, i, measuredWidth, i2);
            }
        }
        canvas.restoreToCount(save2);
        List list = this.zzc;
        if (list != null && !list.isEmpty()) {
            this.zzl.setColor(this.zzp);
            getMeasuredWidth();
            getPaddingLeft();
            getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int save3 = canvas.save();
            canvas.translate(0.0f, measuredHeight2 / 2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            }
            canvas.restoreToCount(save3);
        }
        if (isEnabled() && this.zza.zzf) {
            this.zzl.setColor(this.zzm);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            double progress2 = getProgress();
            double d = this.zza.zzb;
            int save4 = canvas.save();
            float f = this.zzj;
            Paint paint = this.zzl;
            Double.isNaN(progress2);
            Double.isNaN(d);
            double d2 = progress2 / d;
            Double.isNaN(measuredWidth2);
            canvas.drawCircle((int) (d2 * r5), measuredHeight3 / 2.0f, f, paint);
            canvas.restoreToCount(save4);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        setMeasuredDimension(View.resolveSizeAndState((int) (this.zzg + paddingLeft + getPaddingRight()), i, 0), View.resolveSizeAndState((int) (this.zzh + getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.zza.zzf) {
            if (this.zzr == null) {
                this.zzr = new Point();
            }
            if (this.zzq == null) {
                this.zzq = new int[2];
            }
            getLocationOnScreen(this.zzq);
            this.zzr.set((((int) motionEvent.getRawX()) - this.zzq[0]) - getPaddingLeft(), ((int) motionEvent.getRawY()) - this.zzq[1]);
            int action = motionEvent.getAction();
            if (action == 0) {
                zzi();
                zzh(zzf(this.zzr.x));
                return true;
            }
            if (action == 1) {
                zzh(zzf(this.zzr.x));
                zzj();
                return true;
            }
            if (action == 2) {
                zzh(zzf(this.zzr.x));
                return true;
            }
            if (action == 3) {
                this.zze = false;
                this.zzf = null;
                postInvalidate();
                return true;
            }
        }
        return false;
    }
}
