package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t6 extends FrameLayout implements org.telegram.messenger.fs {
    public final int a;
    public final k80 b;
    public final Runnable c;

    public t6(Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable, org.telegram.ui.bh bhVar) {
        super(context);
        this.a = i7;
        this.c = runnable;
        org.telegram.messenger.i5.r(i7).B();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.n6.K7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(imageView, L2, M, null, i6Var);
        imageView.setImageResource(R.drawable.large_archive);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, c8.ma.t(80, 80, 49, 0, bhVar != null ? 14 : 0, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.gd.M0(2131754165, null));
        linearLayout.addView(textView, c8.ma.t(-1, -2, 1, 32, 0, 32, 9));
        k80 k80Var = new k80(context, null);
        this.b = k80Var;
        k80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.z6, i6Var);
        k80Var.setGravity(1);
        b();
        linearLayout.addView(k80Var, c8.ma.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(R.drawable.msg_archive_archive, org.telegram.messenger.gd.N0("ArchiveHintSection1"), org.telegram.messenger.gd.N0("ArchiveHintSection1Info"), i6Var), c8.ma.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_hide, org.telegram.messenger.gd.N0("ArchiveHintSection2"), org.telegram.messenger.gd.N0("ArchiveHintSection2Info"), i6Var), c8.ma.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_stories, org.telegram.messenger.gd.N0("ArchiveHintSection3"), org.telegram.messenger.gd.N0("ArchiveHintSection3Info"), i6Var), c8.ma.t(-1, -2, 7, 32, 0, 32, 16));
        if (bhVar != null) {
            hi.d g10 = org.telegram.messenger.n10.g(24, context, i6Var, true);
            g10.i(org.telegram.messenger.gd.N0("GotIt"), false, true);
            g10.setOnClickListener(new s6(0, bhVar));
            linearLayout.addView(g10, c8.ma.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i7, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i10 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(i7);
        frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(0, org.telegram.messenger.g0.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, c8.ma.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.z6, i6Var);
        textView2.setTextSize(0, org.telegram.messenger.g0.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, c8.ma.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, c8.ma.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(this.a).Y;
        String N0 = org.telegram.messenger.gd.N0(globalPrivacySettings != null ? globalPrivacySettings.keep_archived_unmuted : true ? "ArchiveHintSubtitle" : "ArchiveHintSubtitleUnmutedMove");
        int i7 = org.telegram.ui.ActionBar.n6.Xc;
        SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(N0, i7, 0, this.c, null);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        lq lqVar = new lq(0, mutate);
        lqVar.a(i7);
        lqVar.c(org.telegram.messenger.g0.L(18.0f));
        lqVar.F = org.telegram.messenger.g0.L(11.0f);
        lqVar.r = -org.telegram.messenger.g0.L(5.0f);
        spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
        this.b.setText(org.telegram.messenger.g0.K2(R2, spannableString, ">"));
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.k0) {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.k0);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.k0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(400.0f), View.MeasureSpec.getSize(i7)), TLObject.FLAG_30), i10);
    }
}
