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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class bz extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public TL_chatlists.TL_exportedChatlistInvite E;
    public final org.telegram.ui.ActionBar.e2 a;
    public final int b;
    public final int c;
    public final Drawable d;
    public final Drawable e;
    public final org.telegram.ui.Components.h6 f;
    public final org.telegram.ui.Components.h6 h;
    public final Paint n;
    public final Paint r;
    public float s;
    public boolean w;
    public ValueAnimator x;
    public String y;

    public bz(Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, int i10) {
        super(context);
        this.a = e2Var;
        this.b = i7;
        this.c = i10;
        setImportantForAccessibility(1);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, false);
        this.f = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.66f));
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.G6, null);
        h6Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        h6Var.setEllipsizeByGradient(true);
        boolean z10 = org.telegram.messenger.hd.a0;
        addView(h6Var, c8.ja.d(-1, 20.0f, 55, z10 ? 56.0f : 64.0f, 10.33f, z10 ? 64.0f : 56.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.h = h6Var2;
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.z6, null);
        h6Var2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        boolean z11 = org.telegram.messenger.hd.a0;
        addView(h6Var2, c8.ja.d(-1, 16.0f, 55, z11 ? 56.0f : 64.0f, 33.33f, z11 ? 64.0f : 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, null);
        int i12 = org.telegram.ui.ActionBar.j6.Li;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(imageView, i12, null, mode);
        imageView.setOnClickListener(new a(this, 24));
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        boolean z12 = org.telegram.messenger.hd.a0;
        addView(imageView, c8.ja.d(40, 40.0f, (z12 ? 3 : 5) | 16, z12 ? 8.0f : 4.0f, 4.0f, z12 ? 4.0f : 8.0f, 4.0f));
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false));
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.nk, false));
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
        az azVar = new az(this, 2);
        ConnectionsManager.getInstance(this.b).sendRequest(tL_chatlists_deleteExportedInvite, new v7(29, this, azVar));
        org.telegram.messenger.g0.i3(azVar, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        if (e2Var instanceof hz) {
            ct ctVar = ((hz) e2Var).a;
            org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(e2Var, this);
            H.W(ctVar.U0(this, false));
            H.c(R.drawable.msg_qrcode, org.telegram.messenger.hd.M0(2131750472, null), new az(this, 0), false);
            H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751534, null), new az(this, 1), true);
            if (org.telegram.messenger.hd.a0) {
                H.i = 3;
            }
            H.Z();
        }
    }

    public final void d() {
        if (this.y == null) {
            return;
        }
        org.telegram.ui.Components.og0 og0Var = new org.telegram.ui.Components.og0(getContext(), org.telegram.messenger.hd.M0(2131749170, null), this.y, org.telegram.messenger.hd.M0(2131746506, null), false);
        og0Var.I0();
        og0Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z10) {
        boolean z11 = this.E == tL_exportedChatlistInvite;
        this.E = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.y = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        org.telegram.ui.Components.h6 h6Var = this.f;
        if (isEmpty) {
            h6Var.c(str, z11, true);
        } else {
            h6Var.c(tL_exportedChatlistInvite.title, z11, true);
        }
        this.h.c(org.telegram.messenger.hd.G(tL_exportedChatlistInvite.peers.size(), "FilterInviteChats", new Object[0]), z11, true);
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
            this.x.addListener(new nn(29, this, z12));
            this.x.setInterpolator(org.telegram.ui.Components.er.h);
            this.x.setDuration(350L);
            this.x.start();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = org.telegram.messenger.hd.a0 ? getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f) : org.telegram.messenger.g0.L(32.0f);
        float f10 = measuredWidth;
        canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), this.n);
        if (this.s > 0.0f) {
            canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * this.s, this.r);
        }
        float f11 = this.s;
        if (f11 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f11) * 255.0f));
            drawable.setBounds(measuredWidth - org.telegram.messenger.g0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + measuredWidth, org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f12 = this.s;
        if (f12 > 0.0f) {
            Drawable drawable2 = this.e;
            drawable2.setAlpha((int) (f12 * 255.0f));
            drawable2.setBounds(measuredWidth - org.telegram.messenger.g0.L(14.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + measuredWidth, org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.w) {
            canvas.drawRect(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(64.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.E;
        String str = "";
        sb2.append((tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) ? "" : a8.p0.s(new StringBuilder(), this.E.title, "\n "));
        sb2.append(org.telegram.messenger.hd.M0(2131749149, null));
        sb2.append(", ");
        sb2.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.E;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str = "\n\n" + this.E.url;
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.n.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false));
            this.r.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.nk, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
