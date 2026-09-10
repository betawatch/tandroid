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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jm extends s4.n0 implements ah.a {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final yl d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public jm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, yl ylVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = ylVar;
        this.c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override // s4.n0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        d(canvas, recyclerView, null, null);
    }

    public final void d(Canvas canvas, RecyclerView recyclerView, g.z zVar, RectF rectF) {
        int top;
        im imVar;
        im imVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (chatAttachAlertPhotoLayout.d0 || chatAttachAlertPhotoLayout.b0 || !chatAttachAlertPhotoLayout.G.e || chatAttachAlertPhotoLayout.O0 || chatAttachAlertPhotoLayout.P0) {
            if (zVar != null) {
                zVar.b = true;
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
                if (zVar != null) {
                    zVar.b = true;
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
        if (zVar != null) {
            zVar.a(left);
            zVar.a(top);
            zVar.a(i11);
            zVar.a(dp);
        }
        if (rectF == null || rectF.intersects(left, top, i11, dp)) {
            Drawable drawable = this.c;
            if (zVar != null) {
                zVar.b(this.a != null && ((imVar2 = chatAttachAlertPhotoLayout.P) == null || !imVar2.isInited() || chatAttachAlertPhotoLayout.N));
                zVar.b(chatAttachAlertPhotoLayout.P != null);
                zVar.b(drawable != null);
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
            if (this.a != null && ((imVar = chatAttachAlertPhotoLayout.P) == null || !imVar.isInited() || chatAttachAlertPhotoLayout.N)) {
                this.a.setBounds(left, top, i11, dp);
                this.a.draw(canvas);
            }
            im imVar3 = chatAttachAlertPhotoLayout.P;
            if (imVar3 != null) {
                imVar3.b = true;
                canvas.save();
                canvas.clipRect(left, top, i11, dp);
                canvas.translate(f7, f10);
                chatAttachAlertPhotoLayout.P.draw(canvas);
                canvas.restore();
                chatAttachAlertPhotoLayout.P.b = false;
            }
            if (drawable != null) {
                int dp3 = AndroidUtilities.dp(24.0f);
                int B = org.telegram.messenger.a2.B(7.0f, i11, dp3);
                int dp4 = AndroidUtilities.dp(7.0f) + top;
                drawable.setBounds(B, dp4, B + dp3, dp3 + dp4);
                drawable.draw(canvas);
            }
            canvas.restore();
            chatAttachAlertPhotoLayout.E.invalidate();
        }
    }

    @Override // ah.a
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
        yl ylVar = chatAttachAlertPhotoLayout.E;
        if (ylVar != null) {
            ylVar.invalidate();
        }
    }

    @Override // ah.a
    public final void g(g.z zVar, RectF rectF) {
        d(null, this.d, zVar, rectF);
    }
}
