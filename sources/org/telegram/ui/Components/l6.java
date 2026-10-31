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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l6 extends FrameLayout implements org.telegram.messenger.us {
    public final int a;
    public final p80 b;
    public final Runnable c;

    public l6(Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable, org.telegram.ui.rh rhVar) {
        super(context);
        this.a = i10;
        this.c = runnable;
        org.telegram.messenger.i5.r(i10).B();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        int L = org.telegram.messenger.i0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.t6.K7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(imageView, L2, N, null, p6Var);
        imageView.setImageResource(R.drawable.large_archive);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, w7.b6.t(80, 80, 49, 0, rhVar != null ? 14 : 0, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.cd.L0(2131754167, null));
        linearLayout.addView(textView, w7.b6.t(-1, -2, 1, 32, 0, 32, 9));
        p80 p80Var = new p80(context, null);
        this.b = p80Var;
        p80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.z6, p6Var);
        p80Var.setGravity(1);
        b();
        linearLayout.addView(p80Var, w7.b6.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(R.drawable.msg_archive_archive, org.telegram.messenger.cd.M0("ArchiveHintSection1"), org.telegram.messenger.cd.M0("ArchiveHintSection1Info"), p6Var), w7.b6.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_hide, org.telegram.messenger.cd.M0("ArchiveHintSection2"), org.telegram.messenger.cd.M0("ArchiveHintSection2Info"), p6Var), w7.b6.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_stories, org.telegram.messenger.cd.M0("ArchiveHintSection3"), org.telegram.messenger.cd.M0("ArchiveHintSection3Info"), p6Var), w7.b6.t(-1, -2, 7, 32, 0, 32, 16));
        if (rhVar != null) {
            vh.d i12 = org.telegram.messenger.z20.i(24, context, p6Var, true);
            i12.i(org.telegram.messenger.cd.M0("GotIt"), false, true);
            i12.setOnClickListener(new k6(0, rhVar));
            linearLayout.addView(i12, w7.b6.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i10, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i11 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(i10);
        frameLayout.addView(imageView, w7.b6.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(0, org.telegram.messenger.i0.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, w7.b6.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, p6Var);
        textView2.setTextSize(0, org.telegram.messenger.i0.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, w7.b6.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.b6.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(this.a).X;
        String M0 = org.telegram.messenger.cd.M0(globalPrivacySettings != null ? globalPrivacySettings.keep_archived_unmuted : true ? "ArchiveHintSubtitle" : "ArchiveHintSubtitleUnmutedMove");
        int i10 = org.telegram.ui.ActionBar.t6.Uc;
        SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(M0, i10, 0, this.c, null);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        dq dqVar = new dq(0, mutate);
        dqVar.a(i10);
        dqVar.c(org.telegram.messenger.i0.L(18.0f));
        dqVar.E = org.telegram.messenger.i0.L(11.0f);
        dqVar.r = -org.telegram.messenger.i0.L(5.0f);
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        this.b.setText(org.telegram.messenger.i0.J2(R2, spannableString, ">"));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.k0) {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.k0);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.k0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(400.0f), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
    }
}
