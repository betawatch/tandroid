package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class k5 extends ReplacementSpan {
    public final Paint a;
    public final ImageReceiver b;
    public final org.telegram.ui.Components.h9 c;
    public float d;
    public final int e;
    public View f;
    public boolean h;
    public final j5 n;
    public float r;
    public int s;
    public boolean v;

    public k5(int i10, View view) {
        this(view, 18.0f, i10);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.w8 w8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (k5 k5Var : (k5[]) spannable.getSpans(0, spannable.length(), k5.class)) {
                k5Var.d(w8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        int i10 = this.e;
        org.telegram.ui.Components.h9 h9Var = this.c;
        h9Var.k(i10, chat);
        this.b.setForUserOrChat(chat, h9Var);
    }

    public final void c(long j10) {
        int i10 = this.e;
        if (j10 >= 0) {
            e(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        } else {
            b(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)));
        }
    }

    public final void d(View view) {
        View view2 = this.f;
        if (view2 == view) {
            return;
        }
        j5 j5Var = this.n;
        ImageReceiver imageReceiver = this.b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(j5Var);
            if (this.f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                imageReceiver.onDetachedFromWindow();
            }
        }
        View view3 = this.f;
        if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        this.f = view;
        imageReceiver.setParentView(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(j5Var);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        if (this.h) {
            int i15 = this.s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.a;
            if (i15 != alpha) {
                int alpha2 = paint.getAlpha();
                this.s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.k6.o1(this.s / 255.0f, 855638016));
            }
            canvas.drawCircle((AndroidUtilities.dp(this.d) / 2.0f) + 0.0f + f7, ((i12 + i14) / 2.0f) + this.r, AndroidUtilities.dp(this.d) / 2.0f, paint2);
        }
        float f10 = 0.0f + f7;
        float dp = (((i12 + i14) / 2.0f) + this.r) - (AndroidUtilities.dp(this.d) / 2.0f);
        float dp2 = AndroidUtilities.dp(this.d);
        float dp3 = AndroidUtilities.dp(this.d);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.setImageCoords(f10, dp, dp2, dp3);
        imageReceiver.setAlpha(this.v ? paint.getAlpha() / 255.0f : 1.0f);
        imageReceiver.draw(canvas);
    }

    public final void e(TLRPC.User user) {
        int i10 = this.e;
        org.telegram.ui.Components.h9 h9Var = this.c;
        h9Var.m(i10, user);
        this.b.setForUserOrChat(user, h9Var);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.d);
    }

    public k5(View view, float f7, int i10) {
        this.h = true;
        this.n = new j5(this, 0);
        this.s = 255;
        this.v = true;
        this.e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.b = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.c = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
        this.d = f7;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        d(view);
    }
}
