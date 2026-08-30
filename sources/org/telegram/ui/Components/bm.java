package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bm extends f2.u0 implements og.a {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final pl d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public bm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, pl plVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = plVar;
        this.c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override // f2.u0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        d(canvas, recyclerView, null, null);
    }

    public final void d(Canvas canvas, RecyclerView recyclerView, g.x xVar, RectF rectF) {
        int top;
        am amVar;
        am amVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (chatAttachAlertPhotoLayout.a0 || chatAttachAlertPhotoLayout.V || !chatAttachAlertPhotoLayout.D.e || chatAttachAlertPhotoLayout.L0 || chatAttachAlertPhotoLayout.M0) {
            if (xVar != null) {
                xVar.b = true;
                return;
            }
            return;
        }
        f2.l1 K = recyclerView.K(0);
        if (K != null) {
            top = K.a.getTop();
        } else {
            K = recyclerView.K(chatAttachAlertPhotoLayout.J0);
            if (K == null) {
                if (xVar != null) {
                    xVar.b = true;
                    return;
                }
                return;
            }
            top = (K.a.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.H0;
        }
        int left = K.a.getLeft();
        int i10 = chatAttachAlertPhotoLayout.H0;
        int i11 = left + i10;
        int dp = AndroidUtilities.dp(2.0f) + (i10 * 2) + top;
        if (xVar != null) {
            xVar.a(left);
            xVar.a(top);
            xVar.a(i11);
            xVar.a(dp);
        }
        if (rectF == null || rectF.intersects(left, top, i11, dp)) {
            Drawable drawable = this.c;
            if (xVar != null) {
                xVar.b(this.a != null && ((amVar2 = chatAttachAlertPhotoLayout.M) == null || !amVar2.isInited() || chatAttachAlertPhotoLayout.K));
                xVar.b(chatAttachAlertPhotoLayout.M != null);
                xVar.b(drawable != null);
            }
            if (canvas == null) {
                return;
            }
            float dp2 = AndroidUtilities.dp(16.0f);
            Path path = this.b;
            path.rewind();
            float f10 = left;
            float f11 = top;
            path.addRoundRect(f10, f11, i11 + dp2, dp + dp2, dp2, dp2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (this.a != null && ((amVar = chatAttachAlertPhotoLayout.M) == null || !amVar.isInited() || chatAttachAlertPhotoLayout.K)) {
                this.a.setBounds(left, top, i11, dp);
                this.a.draw(canvas);
            }
            am amVar3 = chatAttachAlertPhotoLayout.M;
            if (amVar3 != null) {
                amVar3.b = true;
                canvas.save();
                canvas.clipRect(left, top, i11, dp);
                canvas.translate(f10, f11);
                chatAttachAlertPhotoLayout.M.draw(canvas);
                canvas.restore();
                chatAttachAlertPhotoLayout.M.b = false;
            }
            if (drawable != null) {
                int dp3 = AndroidUtilities.dp(24.0f);
                int B = org.telegram.messenger.y3.B(7.0f, i11, dp3);
                int dp4 = AndroidUtilities.dp(7.0f) + top;
                drawable.setBounds(B, dp4, B + dp3, dp3 + dp4);
                drawable.draw(canvas);
            }
            canvas.restore();
            chatAttachAlertPhotoLayout.B.invalidate();
        }
    }

    @Override // og.a
    public final void e(Canvas canvas, RectF rectF) {
        d(canvas, this.d, null, rectF);
    }

    public final void f() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (bitmap != null) {
            this.a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
        }
        pl plVar = chatAttachAlertPhotoLayout.B;
        if (plVar != null) {
            plVar.invalidate();
        }
    }

    @Override // og.a
    public final void g(g.x xVar, RectF rectF) {
        d(null, this.d, xVar, rectF);
    }
}
