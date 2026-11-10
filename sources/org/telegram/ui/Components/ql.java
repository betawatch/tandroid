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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ql extends v4.m0 implements eh.a {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final il d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, il ilVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = ilVar;
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

    @Override // v4.m0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        h(canvas, recyclerView, null, null);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, dh.a aVar, RectF rectF) {
        int top;
        pl plVar;
        pl plVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (chatAttachAlertPhotoLayout.d0 || chatAttachAlertPhotoLayout.b0 || !chatAttachAlertPhotoLayout.G.e || chatAttachAlertPhotoLayout.O0 || chatAttachAlertPhotoLayout.P0) {
            if (aVar != null) {
                aVar.a = true;
                return;
            }
            return;
        }
        v4.d1 K = recyclerView.K(0);
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
            top = (K.a.getTop() - org.telegram.messenger.g0.L(2.0f)) - chatAttachAlertPhotoLayout.K0;
        }
        int left = K.a.getLeft();
        int i7 = chatAttachAlertPhotoLayout.K0;
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
                aVar.b(this.a != null && ((plVar2 = chatAttachAlertPhotoLayout.P) == null || !plVar2.isInited() || chatAttachAlertPhotoLayout.N));
                aVar.b(chatAttachAlertPhotoLayout.P != null);
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
            if (this.a != null && ((plVar = chatAttachAlertPhotoLayout.P) == null || !plVar.isInited() || chatAttachAlertPhotoLayout.N)) {
                this.a.setBounds(left, top, i10, L);
                this.a.draw(canvas);
            }
            pl plVar3 = chatAttachAlertPhotoLayout.P;
            if (plVar3 != null) {
                plVar3.b = true;
                canvas.save();
                canvas.clipRect(left, top, i10, L);
                canvas.translate(f10, f11);
                chatAttachAlertPhotoLayout.P.draw(canvas);
                canvas.restore();
                chatAttachAlertPhotoLayout.P.b = false;
            }
            if (drawable != null) {
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int z9 = org.telegram.messenger.k5.z(7.0f, i10, L3);
                int L4 = org.telegram.messenger.g0.L(7.0f) + top;
                drawable.setBounds(z9, L4, z9 + L3, L3 + L4);
                drawable.draw(canvas);
            }
            canvas.restore();
            chatAttachAlertPhotoLayout.E.invalidate();
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
        il ilVar = chatAttachAlertPhotoLayout.E;
        if (ilVar != null) {
            ilVar.invalidate();
        }
    }
}
