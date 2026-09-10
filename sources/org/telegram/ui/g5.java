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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g5 extends ReplacementSpan {
    public final Paint a;
    public final ImageReceiver b;
    public final org.telegram.ui.Components.g9 c;
    public float d;
    public final int e;
    public View f;
    public boolean h;
    public final f5 n;
    public float r;
    public int s;
    public boolean v;

    public g5(int i10, View view) {
        this(view, 18.0f, i10);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.x8 x8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (g5 g5Var : (g5[]) spannable.getSpans(0, spannable.length(), g5.class)) {
                g5Var.d(x8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        int i10 = this.e;
        org.telegram.ui.Components.g9 g9Var = this.c;
        g9Var.k(i10, chat);
        this.b.setForUserOrChat(chat, g9Var);
    }

    public final void c(long j3) {
        int i10 = this.e;
        if (j3 >= 0) {
            e(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        } else {
            b(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)));
        }
    }

    public final void d(View view) {
        View view2 = this.f;
        if (view2 == view) {
            return;
        }
        f5 f5Var = this.n;
        ImageReceiver imageReceiver = this.b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(f5Var);
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
            view.addOnAttachStateChangeListener(f5Var);
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
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(this.s / 255.0f, 855638016));
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
        org.telegram.ui.Components.g9 g9Var = this.c;
        g9Var.m(i10, user);
        this.b.setForUserOrChat(user, g9Var);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.d);
    }

    public g5(View view, float f7, int i10) {
        this.h = true;
        this.n = new f5(this, 0);
        this.s = 255;
        this.v = true;
        this.e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.b = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.c = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
        this.d = f7;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        d(view);
    }
}
