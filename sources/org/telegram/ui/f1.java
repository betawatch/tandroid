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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f1 extends FrameLayout implements org.telegram.ui.Cells.m9 {
    public TL_iv.pageBlockChannel A;
    public final a70 a;
    public final j4 b;
    public final org.telegram.ui.Components.jq c;
    public final TextView d;
    public final ImageView e;
    public int f;
    public e3 h;
    public int n;
    public final int r;
    public final int s;
    public int v;
    public final Paint w;
    public AnimatorSet x;
    public final int y;

    public f1(Context context, a70 a70Var, j4 j4Var, int i9) {
        super(context);
        this.r = AndroidUtilities.dp(18.0f);
        this.s = AndroidUtilities.dp(11.0f);
        this.a = a70Var;
        this.b = j4Var;
        setWillNotDraw(false);
        this.w = new Paint();
        this.y = i9;
        TextView textView = new TextView(context);
        this.d = textView;
        j3.r0.u(14.0f, 1, textView);
        org.telegram.messenger.ll.l(R.string.ChannelJoin, textView, 19);
        addView(textView, g7.e6.e(-2, 39, 53));
        textView.setOnClickListener(new mh.k3(10, this, a70Var));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, g7.e6.e(39, 39, 53));
        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(context, 0);
        this.c = jqVar;
        addView(jqVar, g7.e6.e(39, 39, 53));
    }

    public final void a(int i9, boolean z10) {
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f = i9;
        ImageView imageView = this.e;
        org.telegram.ui.Components.jq jqVar = this.c;
        TextView textView = this.d;
        if (!z10) {
            textView.setAlpha(i9 == 0 ? 1.0f : 0.0f);
            textView.setScaleX(i9 == 0 ? 1.0f : 0.1f);
            textView.setScaleY(i9 == 0 ? 1.0f : 0.1f);
            jqVar.setAlpha(i9 == 1 ? 1.0f : 0.0f);
            jqVar.setScaleX(i9 == 1 ? 1.0f : 0.1f);
            jqVar.setScaleY(i9 == 1 ? 1.0f : 0.1f);
            imageView.setAlpha(i9 == 2 ? 1.0f : 0.0f);
            imageView.setScaleX(i9 == 2 ? 1.0f : 0.1f);
            imageView.setScaleY(i9 == 2 ? 1.0f : 0.1f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        float[] fArr = {i9 == 0 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr);
        float[] fArr2 = {i9 == 0 ? 1.0f : 0.1f};
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr2);
        float f10 = i9 == 0 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, f10), ObjectAnimator.ofFloat(jqVar, (Property<org.telegram.ui.Components.jq, Float>) property, i9 == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(jqVar, (Property<org.telegram.ui.Components.jq, Float>) property2, i9 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(jqVar, (Property<org.telegram.ui.Components.jq, Float>) property3, i9 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i9 == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, i9 == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i9 == 2 ? 1.0f : 0.1f));
        this.x.setDuration(150L);
        this.x.start();
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.h;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A == null) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.w);
        e3 e3Var = this.h;
        if (e3Var == null || e3Var.d.getLineCount() <= 0) {
            return;
        }
        canvas.save();
        int i9 = this.s;
        int i10 = this.r;
        j4 j4Var = this.b;
        if (j4Var == null || !j4Var.C) {
            canvas.translate(i10, i9);
        } else {
            canvas.translate((getMeasuredWidth() - this.h.d.getLineWidth(0)) - i10, i9);
        }
        if (this.y == 0) {
            l4.v(this.a, canvas, this, 0);
        }
        this.h.draw(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        e3 e3Var = this.h;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrChannel, l4.j(this.a, this.b, e3Var)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        this.e.layout(((this.n / 2) + this.v) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.n / 2) + this.v, AndroidUtilities.dp(39.0f));
        this.c.layout(((this.n / 2) + this.v) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.n / 2) + this.v, AndroidUtilities.dp(39.0f));
        int i13 = this.v;
        TextView textView = this.d;
        textView.layout(i13, 0, textView.getMeasuredWidth() + i13, textView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30);
        TextView textView = this.d;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.n = textView.getMeasuredWidth();
        this.c.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30));
        TL_iv.pageBlockChannel pageblockchannel = this.A;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int dp = (size - AndroidUtilities.dp(52.0f)) - this.n;
            TL_iv.pageBlockChannel pageblockchannel2 = this.A;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.rv0.a;
            this.h = l4.p(this.a, this, str, null, dp, this.s, pageblockchannel2, alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL, 1, this.b);
            int i11 = this.r;
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.C) {
                this.v = (getMeasuredWidth() - i11) - this.n;
            } else {
                this.v = i11;
            }
            e3 e3Var = this.h;
            if (e3Var != null) {
                e3Var.s = i11;
                e3Var.v = this.s;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.y != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return l4.l(this.a, this.b, motionEvent, this, this.h, this.r, this.s) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.A = pageblockchannel;
        int i9 = this.y;
        ImageView imageView = this.e;
        Paint paint = this.w;
        TextView textView = this.d;
        a70 a70Var = this.a;
        if (i9 == 0) {
            int i10 = org.telegram.ui.ActionBar.f6.M6;
            l4 l4Var = (l4) a70Var;
            l4Var.getClass();
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
            int red = Color.red(w02);
            int green = Color.green(w02);
            int blue = Color.blue(w02);
            l4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            imageView.setColorFilter(new PorterDuffColorFilter(a70Var.a(), PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat chat = MessagesController.getInstance(((l4) a70Var).T).getChat(Long.valueOf(pageblockchannel.channel.id));
        if (chat == null || chat.min) {
            TLRPC.Chat chat2 = pageblockchannel.channel;
            if (!a70Var.r && ChatObject.isPublic(chat2)) {
                a70Var.r = true;
                int i11 = ((l4) a70Var).T;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat2.username;
                ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new ih.f8(a70Var, this.b, i11, this, 2));
            }
            a(1, false);
        } else {
            a70Var.n = chat;
            if (!chat.left || chat.kicked) {
                a(4, false);
            } else {
                a(0, false);
            }
        }
        requestLayout();
    }
}
