package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a1 extends FrameLayout implements org.telegram.ui.Cells.g9, org.telegram.ui.ActionBar.z5 {
    public AnimatorSet E;
    public final int F;
    public TL_iv.pageBlockChannel G;
    public int a;
    public final n50 b;
    public final e4 c;
    public final org.telegram.ui.Components.hq d;
    public final TextView e;
    public final ImageView f;
    public int h;
    public z2 n;
    public int r;
    public final int s;
    public final int w;
    public int x;
    public final Paint y;

    public a1(Context context, n50 n50Var, e4 e4Var, int i7) {
        super(context);
        this.s = org.telegram.messenger.g0.L(18.0f);
        this.w = org.telegram.messenger.g0.L(11.0f);
        this.b = n50Var;
        this.c = e4Var;
        setWillNotDraw(false);
        this.y = new Paint();
        this.F = i7;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.M0(2131752397, null));
        textView.setGravity(19);
        addView(textView, c8.ja.e(-2, 39, 53));
        textView.setOnClickListener(new org.telegram.messenger.video.e(9, this, n50Var));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ja.e(39, 39, 53));
        org.telegram.ui.Components.hq hqVar = new org.telegram.ui.Components.hq(context, 0);
        this.d = hqVar;
        addView(hqVar, c8.ja.e(39, 39, 53));
    }

    public final void a(int i7, boolean z10) {
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i7;
        ImageView imageView = this.f;
        org.telegram.ui.Components.hq hqVar = this.d;
        TextView textView = this.e;
        if (!z10) {
            textView.setAlpha(i7 == 0 ? 1.0f : 0.0f);
            textView.setScaleX(i7 == 0 ? 1.0f : 0.1f);
            textView.setScaleY(i7 == 0 ? 1.0f : 0.1f);
            hqVar.setAlpha(i7 == 1 ? 1.0f : 0.0f);
            hqVar.setScaleX(i7 == 1 ? 1.0f : 0.1f);
            hqVar.setScaleY(i7 == 1 ? 1.0f : 0.1f);
            imageView.setAlpha(i7 == 2 ? 1.0f : 0.0f);
            imageView.setScaleX(i7 == 2 ? 1.0f : 0.1f);
            imageView.setScaleY(i7 == 2 ? 1.0f : 0.1f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.E = animatorSet2;
        float[] fArr = {i7 == 0 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr);
        float[] fArr2 = {i7 == 0 ? 1.0f : 0.1f};
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr2);
        float f10 = i7 == 0 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, f10), ObjectAnimator.ofFloat(hqVar, (Property<org.telegram.ui.Components.hq, Float>) property, i7 == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(hqVar, (Property<org.telegram.ui.Components.hq, Float>) property2, i7 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(hqVar, (Property<org.telegram.ui.Components.hq, Float>) property3, i7 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i7 == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, i7 == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i7 == 2 ? 1.0f : 0.1f));
        this.E.setDuration(150L);
        this.E.start();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.y6));
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.n;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.n;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.n;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.G == null) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(39.0f), this.y);
        z2 z2Var = this.n;
        if (z2Var == null || z2Var.d.getLineCount() <= 0) {
            return;
        }
        canvas.save();
        int i7 = this.w;
        int i10 = this.s;
        e4 e4Var = this.c;
        if (e4Var == null || !e4Var.H) {
            canvas.translate(i10, i7);
        } else {
            canvas.translate((getMeasuredWidth() - this.n.d.getLineWidth(0)) - i10, i7);
        }
        if (this.F == 0) {
            g4.t(this.b, canvas, this, 0);
        }
        this.n.d(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.n;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754904, g4.h(this.b, this.c, z2Var)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f.layout(((this.r / 2) + this.x) - org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(20.0f) + (this.r / 2) + this.x, org.telegram.messenger.g0.L(39.0f));
        this.d.layout(((this.r / 2) + this.x) - org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(20.0f) + (this.r / 2) + this.x, org.telegram.messenger.g0.L(39.0f));
        int i13 = this.x;
        TextView textView = this.e;
        textView.layout(i13, 0, textView.getMeasuredWidth() + i13, textView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        setMeasuredDimension(size, org.telegram.messenger.g0.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30));
        TL_iv.pageBlockChannel pageblockchannel = this.G;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - org.telegram.messenger.g0.L(52.0f)) - this.r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.G;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.ou0.a;
            this.n = g4.n(this.b, this, str, null, L, this.w, pageblockchannel2, alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL, 1, this.c);
            int i11 = this.s;
            e4 e4Var = this.c;
            if (e4Var == null || !e4Var.H) {
                this.x = (getMeasuredWidth() - i11) - this.r;
            } else {
                this.x = i11;
            }
            z2 z2Var = this.n;
            if (z2Var != null) {
                z2Var.s = i11;
                z2Var.w = this.w;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.F != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return g4.j(this.b, this.c, motionEvent, this, this.n, this.s, this.w) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.G = pageblockchannel;
        int i7 = this.F;
        ImageView imageView = this.f;
        Paint paint = this.y;
        TextView textView = this.e;
        n50 n50Var = this.b;
        if (i7 == 0) {
            int i10 = org.telegram.ui.ActionBar.j6.M6;
            g4 g4Var = (g4) n50Var;
            g4Var.getClass();
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
            int red = Color.red(x02);
            int green = Color.green(x02);
            int blue = Color.blue(x02);
            g4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            g4Var.getClass();
            this.a = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.y6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(((g4) n50Var).Y).M0(Long.valueOf(pageblockchannel.channel.id));
        if (M0 == null || M0.min) {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (!n50Var.r && org.telegram.messenger.t3.t0(chat)) {
                n50Var.r = true;
                int i11 = ((g4) n50Var).Y;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new fi.b8(n50Var, this.c, i11, this, 2));
            }
            a(1, false);
        } else {
            n50Var.n = M0;
            if (!M0.left || M0.kicked) {
                a(4, false);
            } else {
                a(0, false);
            }
        }
        requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (this.F != 0 || this.G == null || this.b == null || (textView = this.e) == null || (imageView = this.f) == null || (paint = this.y) == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.M6, false);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J6, false));
            paint.setColor(Color.argb(34, Color.red(x02), Color.green(x02), Color.blue(x02)));
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.y6, false);
            if (x03 != this.a) {
                this.a = x03;
                imageView.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
