package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class c00 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public TL_chatlists.TL_exportedChatlistInvite D;
    public final org.telegram.ui.ActionBar.k2 a;
    public final int b;
    public final int c;
    public final Drawable d;
    public final Drawable e;
    public final org.telegram.ui.Components.f6 f;
    public final org.telegram.ui.Components.f6 h;
    public final Paint n;
    public final Paint r;
    public float s;
    public boolean w;
    public ValueAnimator x;
    public String y;

    public c00(Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, int i11) {
        super(context);
        this.a = k2Var;
        this.b = i10;
        this.c = i11;
        setImportantForAccessibility(1);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, false);
        this.f = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.66f));
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.G6, null);
        f6Var.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        f6Var.setEllipsizeByGradient(true);
        boolean z10 = org.telegram.messenger.cd.X;
        addView(f6Var, w7.b6.d(-1, 20.0f, 55, z10 ? 56.0f : 64.0f, 10.33f, z10 ? 64.0f : 56.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(context, false, false, false);
        this.h = f6Var2;
        f6Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.z6, null);
        f6Var2.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        boolean z11 = org.telegram.messenger.cd.X;
        addView(f6Var2, w7.b6.d(-1, 16.0f, 55, z11 ? 56.0f : 64.0f, 33.33f, z11 ? 64.0f : 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        int i13 = org.telegram.ui.ActionBar.t6.Ii;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView, i13, null, mode);
        imageView.setOnClickListener(new a(this, 24));
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        boolean z12 = org.telegram.messenger.cd.X;
        addView(imageView, w7.b6.d(40, 40.0f, (z12 ? 3 : 5) | 16, z12 ? 8.0f : 4.0f, 4.0f, z12 ? 4.0f : 8.0f, 4.0f));
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.kk, false));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_link_1).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_link_2).mutate();
        this.e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String str = this.y;
        String substring = str == null ? null : str.substring(str.lastIndexOf(47) + 1);
        if (substring == null) {
            return;
        }
        TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        b00 b00Var = new b00(this, 2);
        ConnectionsManager.getInstance(this.b).sendRequest(tL_chatlists_deleteExportedInvite, new org.telegram.ui.Components.t20(11, this, b00Var));
        org.telegram.messenger.i0.h3(b00Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        org.telegram.ui.ActionBar.k2 k2Var = this.a;
        if (k2Var instanceof i00) {
            ag.b1 b1Var = ((i00) k2Var).a;
            org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(k2Var, this);
            H.W(b1Var.U0(this, false));
            H.c(R.drawable.msg_qrcode, org.telegram.messenger.cd.L0(2131750481, null), new b00(this, 0), false);
            H.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751535, null), new b00(this, 1), true);
            if (org.telegram.messenger.cd.X) {
                H.i = 3;
            }
            H.Z();
        }
    }

    public final void d() {
        if (this.y == null) {
            return;
        }
        org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(getContext(), org.telegram.messenger.cd.L0(2131749180, null), this.y, org.telegram.messenger.cd.L0(2131746521, null), false);
        nh0Var.I0();
        nh0Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z10) {
        boolean z11 = this.D == tL_exportedChatlistInvite;
        this.D = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.y = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        org.telegram.ui.Components.f6 f6Var = this.f;
        if (isEmpty) {
            f6Var.c(str, z11, true);
        } else {
            f6Var.c(tL_exportedChatlistInvite.title, z11, true);
        }
        this.h.c(org.telegram.messenger.cd.G(tL_exportedChatlistInvite.peers.size(), "FilterInviteChats", new Object[0]), z11, true);
        if (this.w != z10) {
            this.w = z10;
            invalidate();
        }
        boolean z12 = tL_exportedChatlistInvite.revoked;
        if ((z12 ? 1.0f : 0.0f) != this.s) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            if (!z11) {
                this.s = z12 ? 1.0f : 0.0f;
                invalidate();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z12 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 10));
            this.x.addListener(new org.telegram.ui.Components.ha0(14, this, z12));
            this.x.setInterpolator(org.telegram.ui.Components.gr.h);
            this.x.setDuration(350L);
            this.x.start();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = org.telegram.messenger.cd.X ? getMeasuredWidth() - org.telegram.messenger.i0.L(32.0f) : org.telegram.messenger.i0.L(32.0f);
        float f7 = measuredWidth;
        canvas.drawCircle(f7, getMeasuredHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f), this.n);
        if (this.s > 0.0f) {
            canvas.drawCircle(f7, getMeasuredHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f) * this.s, this.r);
        }
        float f10 = this.s;
        if (f10 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f10) * 255.0f));
            drawable.setBounds(measuredWidth - org.telegram.messenger.i0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f) + measuredWidth, org.telegram.messenger.i0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f11 = this.s;
        if (f11 > 0.0f) {
            Drawable drawable2 = this.e;
            drawable2.setAlpha((int) (f11 * 255.0f));
            drawable2.setBounds(measuredWidth - org.telegram.messenger.i0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f) + measuredWidth, org.telegram.messenger.i0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.w) {
            canvas.drawRect(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(64.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.D;
        String str = "";
        sb2.append((tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) ? "" : a1.g.r(new StringBuilder(), this.D.title, "\n "));
        sb2.append(org.telegram.messenger.cd.L0(2131749159, null));
        sb2.append(", ");
        sb2.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.D;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str = "\n\n" + this.D.url;
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.n.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
            this.r.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.kk, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
