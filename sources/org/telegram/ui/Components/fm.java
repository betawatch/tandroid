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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fm extends v4.o0 implements eh.a {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final xl d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, xl xlVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = xlVar;
        this.c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override // eh.a
    public final void c(dh.a aVar, RectF rectF) {
        h(null, this.d, aVar, rectF);
    }

    @Override // eh.a
    public final void d(Canvas canvas, RectF rectF) {
        h(canvas, this.d, null, rectF);
    }

    @Override // v4.o0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        h(canvas, recyclerView, null, null);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, dh.a aVar, RectF rectF) {
        int top;
        em emVar;
        em emVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (chatAttachAlertPhotoLayout.e0 || chatAttachAlertPhotoLayout.c0 || !chatAttachAlertPhotoLayout.H.e || chatAttachAlertPhotoLayout.P0 || chatAttachAlertPhotoLayout.Q0) {
            if (aVar != null) {
                aVar.a = true;
                return;
            }
            return;
        }
        v4.f1 K = recyclerView.K(0);
        if (K != null) {
            top = K.a.getTop();
        } else {
            K = recyclerView.K(chatAttachAlertPhotoLayout.N0);
            if (K == null) {
                if (aVar != null) {
                    aVar.a = true;
                    return;
                }
                return;
            }
            top = (K.a.getTop() - org.telegram.messenger.g0.L(2.0f)) - chatAttachAlertPhotoLayout.L0;
        }
        int left = K.a.getLeft();
        int i7 = chatAttachAlertPhotoLayout.L0;
        int i10 = left + i7;
        int L = org.telegram.messenger.g0.L(2.0f) + (i7 * 2) + top;
        if (aVar != null) {
            aVar.a(left);
            aVar.a(top);
            aVar.a(i10);
            aVar.a(L);
        }
        if (rectF == null || rectF.intersects(left, top, i10, L)) {
            Drawable drawable = this.c;
            if (aVar != null) {
                aVar.b(this.a != null && ((emVar2 = chatAttachAlertPhotoLayout.Q) == null || !emVar2.isInited() || chatAttachAlertPhotoLayout.O));
                aVar.b(chatAttachAlertPhotoLayout.Q != null);
                aVar.b(drawable != null);
            }
            if (canvas == null) {
                return;
            }
            float L2 = org.telegram.messenger.g0.L(16.0f);
            Path path = this.b;
            path.rewind();
            float f10 = left;
            float f11 = top;
            path.addRoundRect(f10, f11, i10 + L2, L + L2, L2, L2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (this.a != null && ((emVar = chatAttachAlertPhotoLayout.Q) == null || !emVar.isInited() || chatAttachAlertPhotoLayout.O)) {
                this.a.setBounds(left, top, i10, L);
                this.a.draw(canvas);
            }
            em emVar3 = chatAttachAlertPhotoLayout.Q;
            if (emVar3 != null) {
                emVar3.b = true;
                canvas.save();
                canvas.clipRect(left, top, i10, L);
                canvas.translate(f10, f11);
                chatAttachAlertPhotoLayout.Q.draw(canvas);
                canvas.restore();
                chatAttachAlertPhotoLayout.Q.b = false;
            }
            if (drawable != null) {
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int z10 = org.telegram.messenger.f3.z(7.0f, i10, L3);
                int L4 = org.telegram.messenger.g0.L(7.0f) + top;
                drawable.setBounds(z10, L4, z10 + L3, L3 + L4);
                drawable.draw(canvas);
            }
            canvas.restore();
            chatAttachAlertPhotoLayout.F.invalidate();
        }
    }

    public final void i() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (bitmap != null) {
            this.a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
        }
        xl xlVar = chatAttachAlertPhotoLayout.F;
        if (xlVar != null) {
            xlVar.invalidate();
        }
    }
}
