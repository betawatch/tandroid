package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gy extends View implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public int E;
    public final Paint a;
    public final Paint b;
    public final int c;
    public final ArrayList d;
    public float e;
    public float f;
    public float h;
    public final ImageReceiver n;
    public final ImageReceiver r;
    public final org.telegram.ui.Components.yj0 s;
    public final org.telegram.ui.Components.yj0 v;
    public boolean w;
    public int x;
    public boolean y;

    public gy(Context context, int i10) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.r = imageReceiver2;
        this.c = i10;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.download_progress, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.s = yj0Var;
        org.telegram.ui.Components.yj0 yj0Var2 = new org.telegram.ui.Components.yj0(R.raw.download_finish, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = yj0Var2;
        imageReceiver.setImageBitmap(yj0Var);
        imageReceiver2.setImageBitmap(yj0Var2);
        imageReceiver.setAutoRepeat(1);
        yj0Var.K(1);
        yj0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i10 = this.c;
        DownloadController downloadController = DownloadController.getInstance(i10);
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((fy) arrayList.get(i11)).c, (fy) arrayList.get(i11));
            DownloadController.getInstance(i10).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < downloadController.downloadingFiles.size(); i12++) {
            String fileName = downloadController.downloadingFiles.get(i12).getFileName();
            if (FileLoader.getInstance(i10).isLoadingFile(fileName)) {
                fy fyVar = (fy) hashMap.get(fileName);
                if (fyVar == null) {
                    fyVar = new fy(this, fileName);
                }
                DownloadController.getInstance(i10).addLoadingFileObserver(fileName, fyVar);
                arrayList.add(fyVar);
            }
        }
        if (arrayList.size() != 0 || this.y) {
            return;
        }
        if (DownloadController.getInstance(i10).hasUnviewedDownloads()) {
            this.e = 1.0f;
            this.f = 1.0f;
            this.w = true;
        } else {
            this.e = 0.0f;
            this.f = 0.0f;
            this.w = false;
        }
    }

    public final void b() {
        MessagesStorage.getInstance(this.c);
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j10 += ((fy) arrayList.get(i10)).a;
            j11 += ((fy) arrayList.get(i10)).b;
            i10++;
        }
        if (j10 == 0) {
            this.e = 1.0f;
        } else {
            this.e = j11 / j10;
        }
        float f7 = this.e;
        if (f7 > 1.0f) {
            this.e = 1.0f;
        } else if (f7 < 0.0f) {
            this.e = 0.0f;
        }
        this.h = ((this.e - this.f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.onDownloadingFilesChanged) {
            a();
            b();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        NotificationCenter.getInstance(this.c).addWeakObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.n.onAttachedToWindow();
        this.r.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.c;
            if (i10 >= size) {
                arrayList.clear();
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.n.onDetachedFromWindow();
                this.r.onDetachedFromWindow();
                return;
            }
            DownloadController.getInstance(i11).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i10 = this.x;
        int i11 = org.telegram.ui.ActionBar.y6.v8;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        ImageReceiver imageReceiver = this.r;
        ImageReceiver imageReceiver2 = this.n;
        Paint paint = this.a;
        Paint paint2 = this.b;
        if (i10 != x02) {
            this.x = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageReceiver2.setColorFilter(new PorterDuffColorFilter(x03, mode));
            imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, i11, false), mode));
            paint2.setAlpha(100);
        }
        float f7 = this.f;
        float f10 = this.e;
        if (f7 != f10) {
            float f11 = this.h;
            float f12 = f7 + f11;
            this.f = f12;
            if (f11 > 0.0f && f12 > f10) {
                this.f = f10;
            } else if (f11 >= 0.0f || f12 >= f10) {
                invalidate();
            } else {
                this.f = f10;
            }
        }
        int dp = AndroidUtilities.dp(8.0f) + (getMeasuredHeight() / 2);
        float dp2 = AndroidUtilities.dp(1.0f);
        float dp3 = AndroidUtilities.dp(16.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f13 = dp;
        float f14 = f13 - dp2;
        float f15 = f13 + dp2;
        rectF.set(dp3, f14, getMeasuredWidth() - dp3, f15);
        canvas.drawRoundRect(rectF, dp2, dp2, paint2);
        rectF.set(dp3, f14, ((getMeasuredWidth() - (2.0f * dp3)) * this.f) + dp3, f15);
        canvas.drawRoundRect(rectF, dp2, dp2, paint);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f14);
        if (this.e != 1.0f) {
            this.w = false;
        }
        if (this.w) {
            imageReceiver.draw(canvas);
        } else {
            imageReceiver2.draw(canvas);
        }
        if (this.e == 1.0f && !this.w && this.s.a0 == 0) {
            org.telegram.ui.Components.yj0 yj0Var = this.v;
            yj0Var.N(0, false, false);
            yj0Var.start();
            this.w = true;
        }
        canvas.restore();
        if (getAlpha() != 0.0f) {
            this.y = true;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
        int dp = AndroidUtilities.dp(15.0f);
        float f7 = dp;
        int i12 = dp * 2;
        this.n.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.r.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        if (f7 == 0.0f) {
            this.y = false;
        }
        super.setAlpha(f7);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.y = false;
        }
        super.setVisibility(i10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.Components.yj0 yj0Var;
        org.telegram.ui.Components.yj0 yj0Var2 = this.s;
        if (yj0Var2 == null || (yj0Var = this.v) == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.v8, false);
        if (x02 != this.E || yj0Var2.getColorFilter() == null) {
            this.E = x02;
            yj0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            yj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
