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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rl extends f2.w0 implements kg.a {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final gl d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, gl glVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = glVar;
        this.c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override // f2.w0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        d(canvas, recyclerView, null, null);
    }

    public final void d(Canvas canvas, RecyclerView recyclerView, g.y yVar, RectF rectF) {
        int top;
        ql qlVar;
        ql qlVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (chatAttachAlertPhotoLayout.W || chatAttachAlertPhotoLayout.U || !chatAttachAlertPhotoLayout.C.e || chatAttachAlertPhotoLayout.K0 || chatAttachAlertPhotoLayout.L0) {
            if (yVar != null) {
                yVar.b = true;
                return;
            }
            return;
        }
        f2.o1 K = recyclerView.K(0);
        if (K != null) {
            top = K.a.getTop();
        } else {
            K = recyclerView.K(chatAttachAlertPhotoLayout.I0);
            if (K == null) {
                if (yVar != null) {
                    yVar.b = true;
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
        if (yVar != null) {
            yVar.a(left);
            yVar.a(top);
            yVar.a(i11);
            yVar.a(dp);
        }
        if (rectF == null || rectF.intersects(left, top, i11, dp)) {
            Drawable drawable = this.c;
            if (yVar != null) {
                yVar.b(this.a != null && ((qlVar2 = chatAttachAlertPhotoLayout.L) == null || !qlVar2.isInited() || chatAttachAlertPhotoLayout.J));
                yVar.b(chatAttachAlertPhotoLayout.L != null);
                yVar.b(drawable != null);
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
            if (this.a != null && ((qlVar = chatAttachAlertPhotoLayout.L) == null || !qlVar.isInited() || chatAttachAlertPhotoLayout.J)) {
                this.a.setBounds(left, top, i11, dp);
                this.a.draw(canvas);
            }
            ql qlVar3 = chatAttachAlertPhotoLayout.L;
            if (qlVar3 != null) {
                qlVar3.b = true;
                canvas.save();
                canvas.clipRect(left, top, i11, dp);
                canvas.translate(f10, f11);
                chatAttachAlertPhotoLayout.L.draw(canvas);
                canvas.restore();
                chatAttachAlertPhotoLayout.L.b = false;
            }
            if (drawable != null) {
                int dp3 = AndroidUtilities.dp(24.0f);
                int B = org.telegram.messenger.y1.B(7.0f, i11, dp3);
                int dp4 = AndroidUtilities.dp(7.0f) + top;
                drawable.setBounds(B, dp4, B + dp3, dp3 + dp4);
                drawable.draw(canvas);
            }
            canvas.restore();
            chatAttachAlertPhotoLayout.A.invalidate();
        }
    }

    @Override // kg.a
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
        gl glVar = chatAttachAlertPhotoLayout.A;
        if (glVar != null) {
            glVar.invalidate();
        }
    }

    @Override // kg.a
    public final void g(g.y yVar, RectF rectF) {
        d(null, this.d, yVar, rectF);
    }
}
