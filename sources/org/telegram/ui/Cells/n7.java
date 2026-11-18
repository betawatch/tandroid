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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mp;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n7 extends FrameLayout {
    public final org.telegram.ui.Components.q9 a;
    public final TextView b;
    public final p5 c;
    public final View d;
    public final mp e;
    public final FrameLayout f;
    public AnimatorSet h;
    public fj n;
    public final /* synthetic */ q7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(q7 q7Var, Context context) {
        super(context);
        this.r = q7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.a = q9Var;
        q9Var.getImageReceiver().G0 = true;
        q9Var.getImageReceiver().H0 = true;
        frameLayout.addView(q9Var, c8.ma.c(-1.0f, -1));
        p5 p5Var = new p5(context, 1);
        p5Var.b = new RectF();
        this.c = p5Var;
        p5Var.setWillNotDraw(false);
        p5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        frameLayout.addView(p5Var, c8.ma.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.play_mini_video);
        p5Var.addView(imageView, c8.ma.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        p5Var.addView(textView, c8.ma.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
        addView(view, c8.ma.c(-1.0f, -1));
        mp mpVar = new mp(21, context, null);
        this.e = mpVar;
        mpVar.setVisibility(4);
        mpVar.b(-1, org.telegram.ui.ActionBar.n6.Ci, org.telegram.ui.ActionBar.n6.k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(1);
        addView(mpVar, c8.ma.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
            org.telegram.ui.Components.q9 q9Var = this.a;
            if (q9Var.getImageReceiver().I() && q9Var.getImageReceiver().i1 == 1.0f && !PhotoViewer.L1(this.n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.r.n);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.n.D3()) {
            accessibilityNodeInfo.setText(gd.M0(2131753960, null));
        } else if (fj.L4(this.n.k)) {
            StringBuilder sb2 = new StringBuilder();
            c0.u(null, 2131753931, sb2, ", ");
            sb2.append(gd.z((int) this.n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(gd.M0(2131753946, null));
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

    public void setMessageObject(fj fjVar) {
        TLRPC.PhotoSize photoSize;
        this.n = fjVar;
        this.a.getImageReceiver().O0(!PhotoViewer.L1(fjVar), false);
        if (!TextUtils.isEmpty(org.telegram.messenger.mp.u1(this.r.s).H1(fjVar.k.restriction_reason))) {
            this.c.setVisibility(4);
            this.a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        if (fj.L4(fjVar.k)) {
            this.c.setVisibility(0);
            this.b.setText(org.telegram.messenger.g0.g0((int) fjVar.L0(), false, false));
            TLRPC.Document F0 = fjVar.F0();
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, ks.r5, false, null, false);
            photoSize = w10 != w11 ? w11 : null;
            if (w10 == null) {
                this.a.setImageResource(R.drawable.photo_placeholder_in);
                return;
            } else if (fjVar.I1 != null) {
                this.a.k(fc.c(photoSize, F0), "100_100", null, fjVar.I1, fjVar);
                return;
            } else {
                this.a.n(fc.c(photoSize, F0), "100_100", fc.c(w10, F0), "b", org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, fjVar);
                return;
            }
        }
        TLRPC.MessageMedia messageMedia = fjVar.k.media;
        if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || messageMedia.photo == null || fjVar.p0.isEmpty()) {
            this.c.setVisibility(4);
            this.a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        this.c.setVisibility(4);
        TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(fjVar.p0, 50, false, null, false);
        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(fjVar.p0, ks.r5, false, w12, false);
        if (!fjVar.z0 && !org.telegram.messenger.a6.q(this.r.s).d(fjVar)) {
            BitmapDrawable bitmapDrawable = fjVar.I1;
            if (bitmapDrawable != null) {
                this.a.n(null, null, null, null, bitmapDrawable, null, 0, fjVar);
                return;
            } else {
                this.a.n(null, null, fc.f(w12, fjVar.n0), "b", org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, fjVar);
                return;
            }
        }
        photoSize = w13 != w12 ? w12 : null;
        if (fjVar.I1 == null) {
            this.a.getImageReceiver().r0(fc.f(w13, fjVar.n0), "100_100", fc.f(photoSize, fjVar.n0), "b", null, w13 != null ? w13.size : 0L, null, fjVar, fj.R5(fjVar.k) ? 2 : 1);
            return;
        }
        ImageReceiver imageReceiver = this.a.getImageReceiver();
        fc f10 = fc.f(w13, fjVar.n0);
        long j3 = 0;
        BitmapDrawable bitmapDrawable2 = fjVar.I1;
        if (w13 != null) {
            j3 = w13.size;
        }
        imageReceiver.r0(f10, "100_100", null, null, bitmapDrawable2, j3, null, fjVar, fj.R5(fjVar.k) ? 2 : 1);
    }
}
