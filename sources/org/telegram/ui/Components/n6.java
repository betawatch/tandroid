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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n6 extends FrameLayout implements org.telegram.messenger.cs {
    public final int a;
    public final s70 b;
    public final Runnable c;

    public n6(Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, org.telegram.ui.xg xgVar) {
        super(context);
        this.a = i3;
        this.c = runnable;
        org.telegram.messenger.g5.r(i3).B();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.k6.K7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, e6Var);
        imageView.setImageResource(R.drawable.large_archive);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, b8.mf.t(80, 80, 49, 0, xgVar != null ? 14 : 0, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.bd.M0(2131754167, null));
        linearLayout.addView(textView, b8.mf.t(-1, -2, 1, 32, 0, 32, 9));
        s70 s70Var = new s70(context, null);
        this.b = s70Var;
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.z6, e6Var);
        s70Var.setGravity(1);
        b();
        linearLayout.addView(s70Var, b8.mf.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(R.drawable.msg_archive_archive, org.telegram.messenger.bd.N0("ArchiveHintSection1"), org.telegram.messenger.bd.N0("ArchiveHintSection1Info"), e6Var), b8.mf.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_hide, org.telegram.messenger.bd.N0("ArchiveHintSection2"), org.telegram.messenger.bd.N0("ArchiveHintSection2Info"), e6Var), b8.mf.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_stories, org.telegram.messenger.bd.N0("ArchiveHintSection3"), org.telegram.messenger.bd.N0("ArchiveHintSection3Info"), e6Var), b8.mf.t(-1, -2, 7, 32, 0, 32, 16));
        if (xgVar != null) {
            gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
            h.i(org.telegram.messenger.bd.N0("GotIt"), false, true);
            h.setOnClickListener(new m6(0, xgVar));
            linearLayout.addView(h, b8.mf.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i3, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(i3);
        frameLayout.addView(imageView, b8.mf.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(0, org.telegram.messenger.g0.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, b8.mf.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, e6Var);
        textView2.setTextSize(0, org.telegram.messenger.g0.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, b8.mf.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, b8.mf.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(this.a).Y;
        String N0 = org.telegram.messenger.bd.N0(globalPrivacySettings != null ? globalPrivacySettings.keep_archived_unmuted : true ? "ArchiveHintSubtitle" : "ArchiveHintSubtitleUnmutedMove");
        int i3 = org.telegram.ui.ActionBar.k6.Uc;
        SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(N0, i3, 0, this.c, null);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        wp wpVar = new wp(0, mutate);
        wpVar.a(i3);
        wpVar.c(org.telegram.messenger.g0.L(18.0f));
        wpVar.F = org.telegram.messenger.g0.L(11.0f);
        wpVar.r = -org.telegram.messenger.g0.L(5.0f);
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        this.b.setText(org.telegram.messenger.g0.K2(S2, spannableString, ">"));
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.k0) {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.k0);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.k0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(400.0f), View.MeasureSpec.getSize(i3)), TLObject.FLAG_30), i10);
    }
}
