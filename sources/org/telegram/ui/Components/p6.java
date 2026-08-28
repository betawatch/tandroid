package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final l80 b;
    public final Runnable c;

    public p6(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, Runnable runnable, org.telegram.ui.ri riVar) {
        super(context);
        this.a = i9;
        this.c = runnable;
        ContactsController.getInstance(i9).loadGlobalPrivacySetting();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.K7, b6Var)));
        imageView.setImageResource(R.drawable.large_archive);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, g7.e6.t(80, 80, 49, 0, riVar != null ? 14 : 0, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.ArchiveHintHeader1));
        linearLayout.addView(textView, g7.e6.t(-1, -2, 1, 32, 0, 32, 9));
        l80 l80Var = new l80(context, null);
        this.b = l80Var;
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var));
        l80Var.setGravity(1);
        b();
        linearLayout.addView(l80Var, g7.e6.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(R.drawable.msg_archive_archive, LocaleController.getString("ArchiveHintSection1"), LocaleController.getString("ArchiveHintSection1Info"), b6Var), g7.e6.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_hide, LocaleController.getString("ArchiveHintSection2"), LocaleController.getString("ArchiveHintSection2Info"), b6Var), g7.e6.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_stories, LocaleController.getString("ArchiveHintSection3"), LocaleController.getString("ArchiveHintSection3Info"), b6Var), g7.e6.t(-1, -2, 7, 32, 0, 32, 16));
        if (riVar != null) {
            kh.d i10 = org.telegram.messenger.ll.i(24, context, b6Var, true);
            i10.g(LocaleController.getString("GotIt"), false, true);
            i10.setOnClickListener(new o6(0, riVar));
            linearLayout.addView(i10, g7.e6.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i9, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i10 = org.telegram.ui.ActionBar.f6.j5;
        imageView.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        imageView.setImageResource(i9);
        frameLayout.addView(imageView, g7.e6.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, g7.e6.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var));
        textView2.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, g7.e6.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, g7.e6.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.a).getGlobalPrivacySettings();
        String string = LocaleController.getString(globalPrivacySettings != null ? globalPrivacySettings.keep_archived_unmuted : true ? "ArchiveHintSubtitle" : "ArchiveHintSubtitleUnmutedMove");
        int i9 = org.telegram.ui.ActionBar.f6.gc;
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i9, 0, this.c);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
        eq eqVar = new eq(0, mutate);
        eqVar.setColorKey(i9);
        eqVar.setSize(AndroidUtilities.dp(18.0f));
        eqVar.setWidth(AndroidUtilities.dp(11.0f));
        eqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        this.b.setText(AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.privacyRulesUpdated) {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.privacyRulesUpdated);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.privacyRulesUpdated);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(400.0f), View.MeasureSpec.getSize(i9)), TLObject.FLAG_30), i10);
    }
}
