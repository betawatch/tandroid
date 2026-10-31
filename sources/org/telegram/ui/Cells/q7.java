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
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ep;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q7 extends FrameLayout {
    public final org.telegram.ui.Components.g9 a;
    public final TextView b;
    public final s5 c;
    public final View d;
    public final ep e;
    public final FrameLayout f;
    public AnimatorSet h;
    public jj n;
    public final /* synthetic */ t7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(t7 t7Var, Context context) {
        super(context);
        this.r = t7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.a = g9Var;
        g9Var.getImageReceiver().F0 = true;
        g9Var.getImageReceiver().G0 = true;
        frameLayout.addView(g9Var, w7.b6.c(-1.0f, -1));
        s5 s5Var = new s5(context, 1);
        s5Var.b = new RectF();
        this.c = s5Var;
        s5Var.setWillNotDraw(false);
        s5Var.setPadding(org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f), 0);
        frameLayout.addView(s5Var, w7.b6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.play_mini_video);
        s5Var.addView(imageView, w7.b6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        s5Var.addView(textView, w7.b6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
        addView(view, w7.b6.c(-1.0f, -1));
        ep epVar = new ep(21, context, null);
        this.e = epVar;
        epVar.setVisibility(4);
        epVar.b(-1, org.telegram.ui.ActionBar.t6.zi, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(1);
        addView(epVar, w7.b6.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
            org.telegram.ui.Components.g9 g9Var = this.a;
            if (g9Var.getImageReceiver().I() && g9Var.getImageReceiver().h1 == 1.0f && !PhotoViewer.Q1(this.n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.r.n);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.n.D3()) {
            accessibilityNodeInfo.setText(cd.L0(2131753962, null));
        } else if (jj.L4(this.n.k)) {
            StringBuilder sb2 = new StringBuilder();
            z20.q(null, 2131753933, sb2, ", ");
            sb2.append(cd.z((int) this.n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(cd.L0(2131753948, null));
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

    public void setMessageObject(jj jjVar) {
        TLRPC.PhotoSize photoSize;
        this.n = jjVar;
        this.a.getImageReceiver().O0(!PhotoViewer.Q1(jjVar), false);
        if (!TextUtils.isEmpty(vp.r1(this.r.s).E1(jjVar.k.restriction_reason))) {
            this.c.setVisibility(4);
            this.a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        if (jj.L4(jjVar.k)) {
            this.c.setVisibility(0);
            this.b.setText(org.telegram.messenger.i0.g0((int) jjVar.L0(), false, false));
            TLRPC.Document F0 = jjVar.F0();
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(F0.thumbs, zs.r5, false, null, false);
            photoSize = w9 != w10 ? w10 : null;
            if (w9 == null) {
                this.a.setImageResource(R.drawable.photo_placeholder_in);
                return;
            } else if (jjVar.G1 != null) {
                this.a.k(ic.c(photoSize, F0), "100_100", null, jjVar.G1, jjVar);
                return;
            } else {
                this.a.o(ic.c(photoSize, F0), "100_100", ic.c(w9, F0), "b", org.telegram.messenger.w0.b.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, jjVar);
                return;
            }
        }
        TLRPC.MessageMedia messageMedia = jjVar.k.media;
        if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || messageMedia.photo == null || jjVar.n0.isEmpty()) {
            this.c.setVisibility(4);
            this.a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        this.c.setVisibility(4);
        TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(jjVar.n0, 50, false, null, false);
        TLRPC.PhotoSize w12 = org.telegram.messenger.b8.w(jjVar.n0, zs.r5, false, w11, false);
        if (!jjVar.x0 && !org.telegram.messenger.b6.q(this.r.s).d(jjVar)) {
            BitmapDrawable bitmapDrawable = jjVar.G1;
            if (bitmapDrawable != null) {
                this.a.o(null, null, null, null, bitmapDrawable, null, 0, jjVar);
                return;
            } else {
                this.a.o(null, null, ic.f(w11, jjVar.l0), "b", org.telegram.messenger.w0.b.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, jjVar);
                return;
            }
        }
        photoSize = w12 != w11 ? w11 : null;
        if (jjVar.G1 == null) {
            this.a.getImageReceiver().r0(ic.f(w12, jjVar.l0), "100_100", ic.f(photoSize, jjVar.l0), "b", null, w12 != null ? w12.size : 0L, null, jjVar, jj.Q5(jjVar.k) ? 2 : 1);
            return;
        }
        ImageReceiver imageReceiver = this.a.getImageReceiver();
        ic f7 = ic.f(w12, jjVar.l0);
        long j10 = 0;
        BitmapDrawable bitmapDrawable2 = jjVar.G1;
        if (w12 != null) {
            j10 = w12.size;
        }
        imageReceiver.r0(f7, "100_100", null, null, bitmapDrawable2, j10, null, jjVar, jj.Q5(jjVar.k) ? 2 : 1);
    }
}
