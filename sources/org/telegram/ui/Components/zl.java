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
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zl extends s4.m0 implements ug.a {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final pl d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public zl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, pl plVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = plVar;
        this.c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override // ug.a
    public final void d(Canvas canvas, RectF rectF) {
        h(canvas, this.d, null, rectF);
    }

    @Override // s4.m0
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        h(canvas, recyclerView, null, null);
    }

    @Override // ug.a
    public final void g(g.y yVar, RectF rectF) {
        h(null, this.d, yVar, rectF);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, g.y yVar, RectF rectF) {
        int top;
        yl ylVar;
        yl ylVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (chatAttachAlertPhotoLayout.d0 || chatAttachAlertPhotoLayout.b0 || !chatAttachAlertPhotoLayout.G.e || chatAttachAlertPhotoLayout.O0 || chatAttachAlertPhotoLayout.P0) {
            if (yVar != null) {
                yVar.b = true;
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
                if (yVar != null) {
                    yVar.b = true;
                    return;
                }
                return;
            }
            top = (K.a.getTop() - org.telegram.messenger.i0.L(2.0f)) - chatAttachAlertPhotoLayout.K0;
        }
        int left = K.a.getLeft();
        int i10 = chatAttachAlertPhotoLayout.K0;
        int i11 = left + i10;
        int L = org.telegram.messenger.i0.L(2.0f) + (i10 * 2) + top;
        if (yVar != null) {
            yVar.a(left);
            yVar.a(top);
            yVar.a(i11);
            yVar.a(L);
        }
        if (rectF == null || rectF.intersects(left, top, i11, L)) {
            Drawable drawable = this.c;
            if (yVar != null) {
                yVar.b(this.a != null && ((ylVar2 = chatAttachAlertPhotoLayout.P) == null || !ylVar2.isInited() || chatAttachAlertPhotoLayout.N));
                yVar.b(chatAttachAlertPhotoLayout.P != null);
                yVar.b(drawable != null);
            }
            if (canvas == null) {
                return;
            }
            float L2 = org.telegram.messenger.i0.L(16.0f);
            Path path = this.b;
            path.rewind();
            float f7 = left;
            float f10 = top;
            path.addRoundRect(f7, f10, i11 + L2, L + L2, L2, L2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (this.a != null && ((ylVar = chatAttachAlertPhotoLayout.P) == null || !ylVar.isInited() || chatAttachAlertPhotoLayout.N)) {
                this.a.setBounds(left, top, i11, L);
                this.a.draw(canvas);
            }
            yl ylVar3 = chatAttachAlertPhotoLayout.P;
            if (ylVar3 != null) {
                ylVar3.b = true;
                canvas.save();
                canvas.clipRect(left, top, i11, L);
                canvas.translate(f7, f10);
                chatAttachAlertPhotoLayout.P.draw(canvas);
                canvas.restore();
                chatAttachAlertPhotoLayout.P.b = false;
            }
            if (drawable != null) {
                int L3 = org.telegram.messenger.i0.L(24.0f);
                int z10 = org.telegram.messenger.m5.z(7.0f, i11, L3);
                int L4 = org.telegram.messenger.i0.L(7.0f) + top;
                drawable.setBounds(z10, L4, z10 + L3, L3 + L4);
                drawable.draw(canvas);
            }
            canvas.restore();
            chatAttachAlertPhotoLayout.E.invalidate();
        }
    }

    public final void i() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.w0.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (bitmap != null) {
            this.a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
        }
        pl plVar = chatAttachAlertPhotoLayout.E;
        if (plVar != null) {
            plVar.invalidate();
        }
    }
}
