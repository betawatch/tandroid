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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class e1 extends FrameLayout implements org.telegram.ui.Cells.n9, org.telegram.ui.ActionBar.b6 {
    public final int E;
    public TL_iv.pageBlockChannel F;
    public int a;
    public final f70 b;
    public final i4 c;
    public final org.telegram.ui.Components.cr d;
    public final TextView e;
    public final ImageView f;
    public int h;
    public c3 n;
    public int r;
    public final int s;
    public final int v;
    public int w;
    public final Paint x;
    public AnimatorSet y;

    public e1(Context context, f70 f70Var, i4 i4Var, int i10) {
        super(context);
        this.s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(11.0f);
        this.b = f70Var;
        this.c = i4Var;
        setWillNotDraw(false);
        this.x = new Paint();
        this.E = i10;
        TextView textView = new TextView(context);
        this.e = textView;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        org.telegram.messenger.sl.m(R.string.ChannelJoin, textView, 19);
        addView(textView, w7.z5.e(-2, 39, 53));
        textView.setOnClickListener(new org.telegram.ui.ActionBar.s1(3, this, f70Var));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.e(39, 39, 53));
        org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(context, 0);
        this.d = crVar;
        addView(crVar, w7.z5.e(39, 39, 53));
    }

    public final void a(int i10, boolean z10) {
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i10;
        ImageView imageView = this.f;
        org.telegram.ui.Components.cr crVar = this.d;
        TextView textView = this.e;
        if (!z10) {
            textView.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            textView.setScaleX(i10 == 0 ? 1.0f : 0.1f);
            textView.setScaleY(i10 == 0 ? 1.0f : 0.1f);
            crVar.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            crVar.setScaleX(i10 == 1 ? 1.0f : 0.1f);
            crVar.setScaleY(i10 == 1 ? 1.0f : 0.1f);
            imageView.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            imageView.setScaleX(i10 == 2 ? 1.0f : 0.1f);
            imageView.setScaleY(i10 == 2 ? 1.0f : 0.1f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        float[] fArr = {i10 == 0 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr);
        float[] fArr2 = {i10 == 0 ? 1.0f : 0.1f};
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr2);
        float f7 = i10 == 0 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, f7), ObjectAnimator.ofFloat(crVar, (Property<org.telegram.ui.Components.cr, Float>) property, i10 == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(crVar, (Property<org.telegram.ui.Components.cr, Float>) property2, i10 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(crVar, (Property<org.telegram.ui.Components.cr, Float>) property3, i10 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i10 == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, i10 == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i10 == 2 ? 1.0f : 0.1f));
        this.y.setDuration(150L);
        this.y.start();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.n;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.n;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.n;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.F == null) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.x);
        c3 c3Var = this.n;
        if (c3Var == null || c3Var.d.getLineCount() <= 0) {
            return;
        }
        canvas.save();
        int i10 = this.v;
        int i11 = this.s;
        i4 i4Var = this.c;
        if (i4Var == null || !i4Var.G) {
            canvas.translate(i11, i10);
        } else {
            canvas.translate((getMeasuredWidth() - this.n.d.getLineWidth(0)) - i11, i10);
        }
        if (this.E == 0) {
            k4.v(this.b, canvas, this, 0);
        }
        this.n.draw(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.n;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrChannel, k4.j(this.b, this.c, c3Var)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f.layout(((this.r / 2) + this.w) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.r / 2) + this.w, AndroidUtilities.dp(39.0f));
        this.d.layout(((this.r / 2) + this.w) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.r / 2) + this.w, AndroidUtilities.dp(39.0f));
        int i14 = this.w;
        TextView textView = this.e;
        textView.layout(i14, 0, textView.getMeasuredWidth() + i14, textView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30));
        TL_iv.pageBlockChannel pageblockchannel = this.F;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int dp = (size - AndroidUtilities.dp(52.0f)) - this.r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.F;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.ix0.a;
            this.n = k4.p(this.b, this, str, null, dp, this.v, pageblockchannel2, alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL, 1, this.c);
            int i12 = this.s;
            i4 i4Var = this.c;
            if (i4Var == null || !i4Var.G) {
                this.w = (getMeasuredWidth() - i12) - this.r;
            } else {
                this.w = i12;
            }
            c3 c3Var = this.n;
            if (c3Var != null) {
                c3Var.s = i12;
                c3Var.v = this.v;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return k4.l(this.b, this.c, motionEvent, this, this.n, this.s, this.v) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.F = pageblockchannel;
        int i10 = this.E;
        ImageView imageView = this.f;
        Paint paint = this.x;
        TextView textView = this.e;
        f70 f70Var = this.b;
        if (i10 == 0) {
            int i11 = org.telegram.ui.ActionBar.k6.M6;
            k4 k4Var = (k4) f70Var;
            k4Var.getClass();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            int red = Color.red(x02);
            int green = Color.green(x02);
            int blue = Color.blue(x02);
            k4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            this.a = f70Var.a();
            imageView.setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat chat = MessagesController.getInstance(((k4) f70Var).X).getChat(Long.valueOf(pageblockchannel.channel.id));
        if (chat == null || chat.min) {
            TLRPC.Chat chat2 = pageblockchannel.channel;
            if (!f70Var.r && ChatObject.isPublic(chat2)) {
                f70Var.r = true;
                int i12 = ((k4) f70Var).X;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat2.username;
                ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new ci.s8(f70Var, this.c, i12, this, 2));
            }
            a(1, false);
        } else {
            f70Var.n = chat;
            if (!chat.left || chat.kicked) {
                a(4, false);
            } else {
                a(0, false);
            }
        }
        requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        f70 f70Var;
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (this.E != 0 || this.F == null || (f70Var = this.b) == null || (textView = this.e) == null || (imageView = this.f) == null || (paint = this.x) == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.M6, false);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
            paint.setColor(Color.argb(34, Color.red(x02), Color.green(x02), Color.blue(x02)));
            int a2 = f70Var.a();
            if (a2 != this.a) {
                this.a = a2;
                imageView.setColorFilter(new PorterDuffColorFilter(a2, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
