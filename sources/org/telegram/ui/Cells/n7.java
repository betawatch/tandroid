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
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.op;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class n7 extends FrameLayout {
    public final org.telegram.ui.Components.q9 a;
    public final TextView b;
    public final p5 c;
    public final View d;
    public final op e;
    public final FrameLayout f;
    public AnimatorSet h;
    public gj n;
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
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
        addView(view, c8.ma.c(-1.0f, -1));
        op opVar = new op(21, context, null);
        this.e = opVar;
        opVar.setVisibility(4);
        opVar.b(-1, org.telegram.ui.ActionBar.m6.Ci, org.telegram.ui.ActionBar.m6.k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(1);
        addView(opVar, c8.ma.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
            accessibilityNodeInfo.setText(hd.N0(2131753959, null));
        } else if (gj.L4(this.n.k)) {
            StringBuilder sb2 = new StringBuilder();
            c0.u(null, 2131753930, sb2, ", ");
            sb2.append(hd.z((int) this.n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(hd.N0(2131753945, null));
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

    public void setMessageObject(gj gjVar) {
        TLRPC.PhotoSize photoSize;
        this.n = gjVar;
        this.a.getImageReceiver().O0(!PhotoViewer.L1(gjVar), false);
        if (!TextUtils.isEmpty(np.u1(this.r.s).H1(gjVar.k.restriction_reason))) {
            this.c.setVisibility(4);
            this.a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        if (gj.L4(gjVar.k)) {
            this.c.setVisibility(0);
            this.b.setText(org.telegram.messenger.g0.g0((int) gjVar.L0(), false, false));
            TLRPC.Document F0 = gjVar.F0();
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, ls.r5, false, null, false);
            photoSize = w10 != w11 ? w11 : null;
            if (w10 == null) {
                this.a.setImageResource(R.drawable.photo_placeholder_in);
                return;
            } else if (gjVar.I1 != null) {
                this.a.k(gc.c(photoSize, F0), "100_100", null, gjVar.I1, gjVar);
                return;
            } else {
                this.a.n(gc.c(photoSize, F0), "100_100", gc.c(w10, F0), "b", org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, gjVar);
                return;
            }
        }
        TLRPC.MessageMedia messageMedia = gjVar.k.media;
        if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || messageMedia.photo == null || gjVar.p0.isEmpty()) {
            this.c.setVisibility(4);
            this.a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        this.c.setVisibility(4);
        TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(gjVar.p0, 50, false, null, false);
        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(gjVar.p0, ls.r5, false, w12, false);
        if (!gjVar.z0 && !org.telegram.messenger.a6.q(this.r.s).d(gjVar)) {
            BitmapDrawable bitmapDrawable = gjVar.I1;
            if (bitmapDrawable != null) {
                this.a.n(null, null, null, null, bitmapDrawable, null, 0, gjVar);
                return;
            } else {
                this.a.n(null, null, gc.f(w12, gjVar.n0), "b", org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, gjVar);
                return;
            }
        }
        photoSize = w13 != w12 ? w12 : null;
        if (gjVar.I1 == null) {
            this.a.getImageReceiver().r0(gc.f(w13, gjVar.n0), "100_100", gc.f(photoSize, gjVar.n0), "b", null, w13 != null ? w13.size : 0L, null, gjVar, gj.R5(gjVar.k) ? 2 : 1);
            return;
        }
        ImageReceiver imageReceiver = this.a.getImageReceiver();
        gc f10 = gc.f(w13, gjVar.n0);
        long j3 = 0;
        BitmapDrawable bitmapDrawable2 = gjVar.I1;
        if (w13 != null) {
            j3 = w13.size;
        }
        imageReceiver.r0(f10, "100_100", null, null, bitmapDrawable2, j3, null, gjVar, gj.R5(gjVar.k) ? 2 : 1);
    }
}
