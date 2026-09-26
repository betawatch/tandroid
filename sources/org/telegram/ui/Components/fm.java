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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class fm extends s4.n0 implements bh.a {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final ul d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, ul ulVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = ulVar;
        this.c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        e(null, this.d, aVar, rectF);
    }

    @Override // s4.n0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        e(canvas, recyclerView, null, null);
    }

    public final void e(Canvas canvas, RecyclerView recyclerView, ah.a aVar, RectF rectF) {
        int top;
        em emVar;
        em emVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (chatAttachAlertPhotoLayout.d0 || chatAttachAlertPhotoLayout.b0 || !chatAttachAlertPhotoLayout.G.e || chatAttachAlertPhotoLayout.O0 || chatAttachAlertPhotoLayout.P0) {
            if (aVar != null) {
                aVar.a = true;
                return;
            }
            return;
        }
        s4.c1 K = recyclerView.K(0);
        if (K != null) {
            top = K.a.getTop();
        } else {
            K = recyclerView.K(chatAttachAlertPhotoLayout.M0);
            if (K == null) {
                if (aVar != null) {
                    aVar.a = true;
                    return;
                }
                return;
            }
            top = (K.a.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.K0;
        }
        int left = K.a.getLeft();
        int i10 = chatAttachAlertPhotoLayout.K0;
        int i11 = left + i10;
        int dp = AndroidUtilities.dp(2.0f) + (i10 * 2) + top;
        if (aVar != null) {
            aVar.a(left);
            aVar.a(top);
            aVar.a(i11);
            aVar.a(dp);
        }
        if (rectF == null || rectF.intersects(left, top, i11, dp)) {
            Drawable drawable = this.c;
            if (aVar != null) {
                aVar.b(this.a != null && ((emVar2 = chatAttachAlertPhotoLayout.P) == null || !emVar2.isInited() || chatAttachAlertPhotoLayout.N));
                aVar.b(chatAttachAlertPhotoLayout.P != null);
                aVar.b(drawable != null);
            }
            if (canvas == null) {
                return;
            }
            float dp2 = AndroidUtilities.dp(16.0f);
            Path path = this.b;
            path.rewind();
            float f7 = left;
            float f10 = top;
            path.addRoundRect(f7, f10, i11 + dp2, dp + dp2, dp2, dp2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (this.a != null && ((emVar = chatAttachAlertPhotoLayout.P) == null || !emVar.isInited() || chatAttachAlertPhotoLayout.N)) {
                this.a.setBounds(left, top, i11, dp);
                this.a.draw(canvas);
            }
            em emVar3 = chatAttachAlertPhotoLayout.P;
            if (emVar3 != null) {
                emVar3.b = true;
                canvas.save();
                canvas.clipRect(left, top, i11, dp);
                canvas.translate(f7, f10);
                chatAttachAlertPhotoLayout.P.draw(canvas);
                canvas.restore();
                chatAttachAlertPhotoLayout.P.b = false;
            }
            if (drawable != null) {
                int dp3 = AndroidUtilities.dp(24.0f);
                int B = org.telegram.messenger.f0.B(7.0f, i11, dp3);
                int dp4 = AndroidUtilities.dp(7.0f) + top;
                drawable.setBounds(B, dp4, B + dp3, dp3 + dp4);
                drawable.draw(canvas);
            }
            canvas.restore();
            chatAttachAlertPhotoLayout.E.invalidate();
        }
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        e(canvas, this.d, null, rectF);
    }

    public final void g() {
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
        ul ulVar = chatAttachAlertPhotoLayout.E;
        if (ulVar != null) {
            ulVar.invalidate();
        }
    }
}
