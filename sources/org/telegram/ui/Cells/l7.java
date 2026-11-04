package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wo;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l7 extends FrameLayout {
    public final org.telegram.ui.Components.k9 a;
    public final TextView b;
    public final n5 c;
    public final View d;
    public final wo e;
    public final FrameLayout f;
    public AnimatorSet h;
    public zi n;
    public final /* synthetic */ o7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(o7 o7Var, Context context) {
        super(context);
        this.r = o7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, mf.c(-1.0f, -1));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        k9Var.getImageReceiver().G0 = true;
        k9Var.getImageReceiver().H0 = true;
        frameLayout.addView(k9Var, mf.c(-1.0f, -1));
        n5 n5Var = new n5(context, 1);
        n5Var.b = new RectF();
        this.c = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        frameLayout.addView(n5Var, mf.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.play_mini_video);
        n5Var.addView(imageView, mf.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, mf.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
        addView(view, mf.c(-1.0f, -1));
        wo woVar = new wo(21, context, null);
        this.e = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.zi, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(1);
        addView(woVar, mf.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.e.a.q) {
            org.telegram.ui.Components.k9 k9Var = this.a;
            if (k9Var.getImageReceiver().I() && k9Var.getImageReceiver().i1 == 1.0f && !PhotoViewer.Q1(this.n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.r.n);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.n.E3()) {
            accessibilityNodeInfo.setText(bd.M0(2131753962, null));
        } else if (zi.M4(this.n.k)) {
            StringBuilder sb2 = new StringBuilder();
            org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
            sb2.append(bd.z((int) this.n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(bd.M0(2131753948, null));
        }
        if (this.e.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    public void setMessageObject(zi ziVar) {
        TLRPC.PhotoSize photoSize;
        this.n = ziVar;
        this.a.getImageReceiver().O0(!PhotoViewer.Q1(ziVar), false);
        if (!TextUtils.isEmpty(hp.s1(this.r.s).F1(ziVar.k.restriction_reason))) {
            this.c.setVisibility(4);
            this.a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        if (zi.M4(ziVar.k)) {
            this.c.setVisibility(0);
            this.b.setText(org.telegram.messenger.g0.g0((int) ziVar.L0(), false, false));
            TLRPC.Document F0 = ziVar.F0();
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, hs.r5, false, null, false);
            photoSize = w10 != w11 ? w11 : null;
            if (w10 == null) {
                this.a.setImageResource(R.drawable.photo_placeholder_in);
                return;
            } else if (ziVar.G1 != null) {
                this.a.k(ac.c(photoSize, F0), "100_100", null, ziVar.G1, ziVar);
                return;
            } else {
                this.a.n(ac.c(photoSize, F0), "100_100", ac.c(w10, F0), "b", org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, ziVar);
                return;
            }
        }
        TLRPC.MessageMedia messageMedia = ziVar.k.media;
        if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || messageMedia.photo == null || ziVar.n0.isEmpty()) {
            this.c.setVisibility(4);
            this.a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        this.c.setVisibility(4);
        TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(ziVar.n0, 50, false, null, false);
        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(ziVar.n0, hs.r5, false, w12, false);
        if (!ziVar.x0 && !org.telegram.messenger.z5.q(this.r.s).d(ziVar)) {
            BitmapDrawable bitmapDrawable = ziVar.G1;
            if (bitmapDrawable != null) {
                this.a.n(null, null, null, null, bitmapDrawable, null, 0, ziVar);
                return;
            } else {
                this.a.n(null, null, ac.f(w12, ziVar.l0), "b", org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, ziVar);
                return;
            }
        }
        photoSize = w13 != w12 ? w12 : null;
        if (ziVar.G1 == null) {
            this.a.getImageReceiver().r0(ac.f(w13, ziVar.l0), "100_100", ac.f(photoSize, ziVar.l0), "b", null, w13 != null ? w13.size : 0L, null, ziVar, zi.S5(ziVar.k) ? 2 : 1);
            return;
        }
        ImageReceiver imageReceiver = this.a.getImageReceiver();
        ac f10 = ac.f(w13, ziVar.l0);
        long j10 = 0;
        BitmapDrawable bitmapDrawable2 = ziVar.G1;
        if (w13 != null) {
            j10 = w13.size;
        }
        imageReceiver.r0(f10, "100_100", null, null, bitmapDrawable2, j10, null, ziVar, zi.S5(ziVar.k) ? 2 : 1);
    }
}
