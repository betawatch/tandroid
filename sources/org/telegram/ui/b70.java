package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TextView a;
    public TextView b;
    public TextView c;
    public m0 d;
    public LinearLayout e;
    public LinearLayout f;
    public int h;
    public AnimatorSet n;
    public String r;

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        char c10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EncryptionKey));
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 25));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        this.fragmentView.setOnTouchListener(new jh.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setWeightSum(100.0f);
        frameLayout.addView(this.f, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f.addView(frameLayout2, g7.e6.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, g7.e6.c(-1.0f, -1));
        m0 m0Var = new m0(this, context, 8);
        this.d = m0Var;
        m0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        this.f.addView(this.d, g7.e6.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.d.addView(this.e, g7.e6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.b = textView;
        int i9 = org.telegram.ui.ActionBar.f6.B6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.b.setGravity(17);
        this.b.setTypeface(Typeface.MONOSPACE);
        this.b.setTextSize(1, 16.0f);
        this.e.addView(this.b, g7.e6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.a = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.a.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
        this.a.setTextSize(1, 16.0f);
        this.a.setLinksClickable(true);
        this.a.setClickable(true);
        this.a.setGravity(17);
        this.a.setMovementMethod(new org.telegram.ui.Components.bv(1));
        this.e.addView(this.a, g7.e6.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.c.setGravity(17);
        this.c.setTextSize(1, 32.0f);
        this.d.addView(this.c, g7.e6.c(-2.0f, -2));
        TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(this.h));
        if (encryptedChat != null) {
            org.telegram.ui.Components.w30 w30Var = new org.telegram.ui.Components.w30();
            imageView.setImageDrawable(w30Var);
            byte[] bArr = encryptedChat.key_hash;
            w30Var.a = bArr;
            if (bArr == null) {
                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
                w30Var.a = calcAuthKeyHash;
                encryptedChat.key_hash = calcAuthKeyHash;
            }
            w30Var.invalidateSelf();
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr2 = encryptedChat.key_hash;
            if (bArr2.length > 16) {
                String bytesToHex = Utilities.bytesToHex(bArr2);
                for (int i10 = 0; i10 < 32; i10++) {
                    if (i10 != 0) {
                        if (i10 % 8 == 0) {
                            spannableStringBuilder.append('\n');
                        } else if (i10 % 4 == 0) {
                            spannableStringBuilder.append(' ');
                        }
                    }
                    int i11 = i10 * 2;
                    spannableStringBuilder.append((CharSequence) bytesToHex.substring(i11, i11 + 2));
                    spannableStringBuilder.append(' ');
                }
                c10 = 1;
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i12 = 0; i12 < 5; i12++) {
                    byte[] bArr3 = encryptedChat.key_hash;
                    int i13 = i12 * 4;
                    int i14 = (bArr3[i13 + 19] & 255) | ((bArr3[i13 + 16] & Byte.MAX_VALUE) << 24) | ((bArr3[i13 + 17] & 255) << 16) | ((bArr3[i13 + 18] & 255) << 8);
                    if (i12 != 0) {
                        sb2.append(" ");
                    }
                    String[] strArr = EmojiData.emojiSecret;
                    sb2.append(strArr[i14 % strArr.length]);
                }
                this.r = sb2.toString();
            } else {
                c10 = 1;
            }
            this.b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            int i15 = R.string.EncryptionKeyDescription;
            String str = user.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("EncryptionKeyDescription", i15, objArr)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.r41(LocaleController.getString(R.string.EncryptionKeyLink), null), indexOf, indexOf + 12, 33);
            }
            this.a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        this.c.setAlpha(0.0f);
        this.b.setAlpha(1.0f);
        this.c.setScaleX(0.0f);
        this.c.setScaleY(0.0f);
        this.b.setScaleX(1.0f);
        this.b.setScaleY(1.0f);
        this.c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.Me));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TextView textView;
        if (i9 != NotificationCenter.emojiLoaded || (textView = this.c) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        TextView textView = this.a;
        int i9 = org.telegram.ui.ActionBar.f6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 2, null, null, null, null, org.telegram.ui.ActionBar.f6.J6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new sh(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new sh(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (!z10 || z11 || (str = this.r) == null) {
            return;
        }
        TextView textView = this.c;
        textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
    }
}
