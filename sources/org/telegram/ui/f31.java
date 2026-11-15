package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f31 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final org.telegram.ui.Components.t8 b;
    public final org.telegram.ui.Components.i9 c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final TextView e;
    public final ImageView f;
    public final org.telegram.ui.Components.e5 h;
    public final org.telegram.ui.Components.e5 n;
    public int r;

    public f31(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = e6Var;
        setOrientation(0);
        this.b = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        j5Var.setTextSize(15);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        this.h = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 7, j5Var, false);
        this.n = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 7, j5Var, false);
        j5Var.addOnAttachStateChangeListener(new e5(this, 5));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, e6Var);
        int L = org.telegram.messenger.g0.L(10.0f);
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(textView, d02, M, null, e6Var);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.m6, e6Var, PorterDuff.Mode.SRC_IN);
        if (!org.telegram.messenger.hd.a0) {
            j5Var.setGravity(19);
            addView(i9Var, c8.ja.t(28, 28, 19, 18, 0, 18, 0));
            addView(j5Var, c8.ja.q(0, -1, 1.0f, org.telegram.messenger.ns.E1, 0, 0, 18, 0));
            addView(textView, c8.ja.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, c8.ja.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        j5Var.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, c8.ja.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, c8.ja.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(j5Var, c8.ja.q(0, -1, 1.0f, org.telegram.messenger.ns.E1, 18, 0, 0, 0));
        addView(i9Var, c8.ja.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.qi));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(int i7) {
        Long h;
        TLRPC.User f10 = org.telegram.messenger.m10.i(i7).f();
        org.telegram.ui.Components.t8 t8Var = this.b;
        t8Var.r(f10);
        org.telegram.ui.Components.i9 i9Var = this.c;
        i9Var.getImageReceiver().d = i7;
        i9Var.f(f10, t8Var);
        String p10 = org.telegram.messenger.q10.p(f10);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.l(p10, false);
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.Components.e5 e5Var = this.h;
        e5Var.y = valueOf;
        Integer valueOf2 = Integer.valueOf(i7);
        org.telegram.ui.Components.e5 e5Var2 = this.n;
        e5Var2.y = valueOf2;
        int i10 = org.telegram.ui.ActionBar.j6.qi;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
        if (f10 != null) {
            long j3 = f10.bot_verification_icon;
            if (j3 != 0) {
                e5Var.j(j3, false);
                h = org.telegram.messenger.q10.h(f10);
                e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
                if (h == null) {
                    e5Var2.j(h.longValue(), false);
                } else if (f10 == null || !f10.premium) {
                    e5Var2.g(null, false);
                } else {
                    e5Var2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (e5Var.d()) {
                    e5Var = null;
                }
                j5Var.setLeftDrawable(e5Var);
                if (e5Var2.d()) {
                    e5Var2 = null;
                }
                j5Var.i(e5Var2);
                int i11 = org.telegram.messenger.vr.a0(i7).L;
                int i12 = i11 <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i12);
                textView.setText(org.telegram.messenger.hd.E(i11, ','));
            }
        }
        e5Var.g(null, false);
        h = org.telegram.messenger.q10.h(f10);
        e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
        if (h == null) {
        }
        if (e5Var.d()) {
        }
        j5Var.setLeftDrawable(e5Var);
        if (e5Var2.d()) {
        }
        j5Var.i(e5Var2);
        int i112 = org.telegram.messenger.vr.a0(i7).L;
        if (i112 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i12);
        textView2.setText(org.telegram.messenger.hd.E(i112, ','));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.setTextColor(w02);
        TextView textView = this.e;
        org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.m6, e6Var);
        int i10 = this.r;
        ImageView imageView = this.f;
        if (w03 != i10 || imageView.getColorFilter() == null) {
            this.r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i11 = org.telegram.ui.ActionBar.j6.qi;
        this.n.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i11, e6Var)));
        try {
            org.telegram.ui.Components.e5 e5Var = this.h;
            if (e5Var != null) {
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i11, e6Var)));
                j5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
