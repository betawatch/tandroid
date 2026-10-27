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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qm extends s4.n0 implements dh.a {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final fm d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public qm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, fm fmVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = fmVar;
        this.c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override // dh.a
    public final void b(ch.a aVar, RectF rectF) {
        h(null, this.d, aVar, rectF);
    }

    @Override // s4.n0
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        h(canvas, recyclerView, null, null);
    }

    @Override // dh.a
    public final void f(Canvas canvas, RectF rectF) {
        h(canvas, this.d, null, rectF);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, ch.a aVar, RectF rectF) {
        int top;
        pm pmVar;
        pm pmVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (chatAttachAlertPhotoLayout.d0 || chatAttachAlertPhotoLayout.b0 || !chatAttachAlertPhotoLayout.G.e || chatAttachAlertPhotoLayout.O0 || chatAttachAlertPhotoLayout.P0) {
            if (aVar != null) {
                aVar.a = true;
                return;
            }
            return;
        }
        s4.e1 K = recyclerView.K(0);
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
                aVar.b(this.a != null && ((pmVar2 = chatAttachAlertPhotoLayout.P) == null || !pmVar2.isInited() || chatAttachAlertPhotoLayout.N));
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
            if (this.a != null && ((pmVar = chatAttachAlertPhotoLayout.P) == null || !pmVar.isInited() || chatAttachAlertPhotoLayout.N)) {
                this.a.setBounds(left, top, i11, dp);
                this.a.draw(canvas);
            }
            pm pmVar3 = chatAttachAlertPhotoLayout.P;
            if (pmVar3 != null) {
                pmVar3.b = true;
                canvas.save();
                canvas.clipRect(left, top, i11, dp);
                canvas.translate(f7, f10);
                chatAttachAlertPhotoLayout.P.draw(canvas);
                canvas.restore();
                chatAttachAlertPhotoLayout.P.b = false;
            }
            if (drawable != null) {
                int dp3 = AndroidUtilities.dp(24.0f);
                int C = org.telegram.messenger.t.C(7.0f, i11, dp3);
                int dp4 = AndroidUtilities.dp(7.0f) + top;
                drawable.setBounds(C, dp4, C + dp3, dp3 + dp4);
                drawable.draw(canvas);
            }
            canvas.restore();
            chatAttachAlertPhotoLayout.E.invalidate();
        }
    }

    public final void i() {
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
        fm fmVar = chatAttachAlertPhotoLayout.E;
        if (fmVar != null) {
            fmVar.invalidate();
        }
    }
}
