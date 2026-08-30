package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b81 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.p9 a;
    public final pk b;
    public final org.telegram.ui.Components.voip.h c;
    public final /* synthetic */ SessionsActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b81(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.d = sessionsActivity;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.c = hVar;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        addView(p9Var, k7.b6.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        hVar.j = false;
        hVar.n = 1.2f;
        p9Var.setOnClickListener(new a8(this, 2));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(context, null);
        addView(e90Var, k7.b6.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        e90Var.setGravity(1);
        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        e90Var.setTextSize(1, 15.0f);
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        e90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
        String string = LocaleController.getString(R.string.AuthAnotherClientInfo4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int i13 = indexOf + 1;
        int indexOf2 = string.indexOf(42, i13);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            e90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.m51(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.s01) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i14 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i14);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            e90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i14, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.m51(LocaleController.getString(R.string.AuthAnotherWebClientUrl), (org.telegram.ui.Components.s01) null), indexOf3, indexOf4 - 1, 33);
        }
        e90Var.setText(spannableStringBuilder);
        pk pkVar = new pk(this, context, 3);
        this.b = pkVar;
        pkVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        pkVar.setGravity(17);
        pkVar.setTextSize(1, 14.0f);
        pkVar.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) LocaleController.getString(R.string.LinkDesktopDevice));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.mq(0, getContext().getDrawable(R.drawable.msg_mini_qr)), 0, 1, 0);
        pkVar.setText(spannableStringBuilder3);
        pkVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        pkVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w02, w03, w03));
        pkVar.setOnClickListener(new i31(this, 6));
        addView(pkVar, k7.b6.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        b();
    }

    public static void a(b81 b81Var) {
        SessionsActivity sessionsActivity = b81Var.d;
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            v9.e0(sessionsActivity.getParentActivity(), 2, new z71(sessionsActivity));
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12;
        SessionsActivity sessionsActivity = this.d;
        i10 = ((org.telegram.ui.ActionBar.p2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME);
        if (stickerSetByName == null) {
            i12 = ((org.telegram.ui.ActionBar.p2) sessionsActivity).currentAccount;
            stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        TLRPC.Document document = (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() <= 6) ? null : tL_messages_stickerSet.documents.get(6);
        SvgHelper.SvgDrawable svgThumb = document != null ? DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.c7, 0.2f) : null;
        if (svgThumb != null) {
            svgThumb.overrideWidthAndHeight(512, 512);
        }
        if (document == null) {
            i11 = ((org.telegram.ui.ActionBar.p2) sessionsActivity).currentAccount;
            MediaDataController.getInstance(i11).loadStickersByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, false, tL_messages_stickerSet == null);
        } else {
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            org.telegram.ui.Components.p9 p9Var = this.a;
            p9Var.i(forDocument, "130_130", "tgs", svgThumb, tL_messages_stickerSet);
            p9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad && AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME.equals((String) objArr[0])) {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        b();
        i10 = ((org.telegram.ui.ActionBar.p2) this.d).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.p2) this.d).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(276.0f), TLObject.FLAG_30));
    }
}
