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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zl extends f2.v0 implements mg.a {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final ol d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public zl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, ol olVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = olVar;
        this.c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override // f2.v0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        d(canvas, recyclerView, null, null);
    }

    public final void d(Canvas canvas, RecyclerView recyclerView, g.x xVar, RectF rectF) {
        int top;
        yl ylVar;
        yl ylVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (chatAttachAlertPhotoLayout.W || chatAttachAlertPhotoLayout.U || !chatAttachAlertPhotoLayout.C.e || chatAttachAlertPhotoLayout.K0 || chatAttachAlertPhotoLayout.L0) {
            if (xVar != null) {
                xVar.b = true;
                return;
            }
            return;
        }
        f2.n1 K = recyclerView.K(0);
        if (K != null) {
            top = K.a.getTop();
        } else {
            K = recyclerView.K(chatAttachAlertPhotoLayout.I0);
            if (K == null) {
                if (xVar != null) {
                    xVar.b = true;
                    return;
                }
                return;
            }
            top = (K.a.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.G0;
        }
        int left = K.a.getLeft();
        int i10 = chatAttachAlertPhotoLayout.G0;
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
                xVar.b(this.a != null && ((ylVar2 = chatAttachAlertPhotoLayout.L) == null || !ylVar2.isInited() || chatAttachAlertPhotoLayout.J));
                xVar.b(chatAttachAlertPhotoLayout.L != null);
                xVar.b(drawable != null);
            }
            if (canvas == null) {
                return;
            }
            float dp2 = AndroidUtilities.dp(16.0f);
            Path path = this.b;
            path.rewind();
            float f9 = left;
            float f10 = top;
            path.addRoundRect(f9, f10, i11 + dp2, dp + dp2, dp2, dp2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (this.a != null && ((ylVar = chatAttachAlertPhotoLayout.L) == null || !ylVar.isInited() || chatAttachAlertPhotoLayout.J)) {
                this.a.setBounds(left, top, i11, dp);
                this.a.draw(canvas);
            }
            yl ylVar3 = chatAttachAlertPhotoLayout.L;
            if (ylVar3 != null) {
                ylVar3.b = true;
                canvas.save();
                canvas.clipRect(left, top, i11, dp);
                canvas.translate(f9, f10);
                chatAttachAlertPhotoLayout.L.draw(canvas);
                canvas.restore();
                chatAttachAlertPhotoLayout.L.b = false;
            }
            if (drawable != null) {
                int dp3 = AndroidUtilities.dp(24.0f);
                int B = org.telegram.messenger.x3.B(7.0f, i11, dp3);
                int dp4 = AndroidUtilities.dp(7.0f) + top;
                drawable.setBounds(B, dp4, B + dp3, dp3 + dp4);
                drawable.draw(canvas);
            }
            canvas.restore();
            chatAttachAlertPhotoLayout.A.invalidate();
        }
    }

    @Override // mg.a
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
        ol olVar = chatAttachAlertPhotoLayout.A;
        if (olVar != null) {
            olVar.invalidate();
        }
    }

    @Override // mg.a
    public final void g(g.x xVar, RectF rectF) {
        d(null, this.d, xVar, rectF);
    }
}
