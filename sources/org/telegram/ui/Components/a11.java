package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class a11 extends LinearLayout {
    public final int a;
    public final long b;
    public final org.telegram.ui.ActionBar.c6 c;
    public final dv0 d;
    public final k9 e;
    public final z9 f;
    public final org.telegram.ui.Cells.d6 h;
    public final s6 n;
    public MessageObject r;
    public boolean s;
    public boolean v;
    public Utilities.Callback w;
    public boolean x;
    public float y;

    public a11(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.y = -6.0f;
        this.a = i10;
        this.b = j10;
        this.c = c6Var;
        setOrientation(1);
        org.telegram.ui.z8 z8Var = new org.telegram.ui.z8(this, context, 2);
        z8Var.V(di.a7.e(null, i10, j10, org.telegram.ui.ActionBar.g6.I.q()));
        dv0 dv0Var = new dv0(context, i10);
        this.d = dv0Var;
        z8Var.addView(dv0Var, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 12.0f, -1, 87));
        this.e = new k9((org.telegram.ui.ActionBar.c6) null);
        z9 z9Var = new z9(context);
        this.f = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        z8Var.addView(z9Var, w7.z5.a(42.0f, 8.0f, 0.0f, 0.0f, 12.0f, 42, 83));
        addView(z8Var, w7.z5.q(-1, -2, 7));
        org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(context, 0, null, c6Var);
        this.h = d6Var;
        EditTextBoldCursor textView = d6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        d6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.y6, c6Var), PorterDuff.Mode.SRC_IN));
        d6Var.addView(imageView, w7.z5.a(24.0f, 0.0f, 0.0f, 20.0f, 0.0f, 24, 21));
        w7.b6.a(imageView);
        imageView.setOnClickListener(new y80(textView, 19));
        s6 s6Var = new s6(context, false, true, false);
        this.n = s6Var;
        s6Var.n = false;
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q7, c6Var));
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setGravity(17);
        s6Var.setAllowCancel(true);
        s6Var.setScaleProperty(0.6f);
        d6Var.addView(s6Var, w7.z5.a(50.0f, 0.0f, 0.0f, 44.0f, 0.0f, 56, 117));
        textView.addTextChangedListener(new t01(this));
        addView(d6Var, w7.z5.q(-1, -2, 7));
        dv0Var.setDelegate(new n3.b(this, textView, false, 7));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, org.telegram.ui.ActionBar.c6 c6Var) {
        String str2;
        LinearLayout linearLayout;
        org.telegram.ui.ActionBar.e3 e3Var;
        int i11;
        int i12 = i10;
        long j11 = j10;
        final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j11));
        if (chat == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 i13 = org.telegram.messenger.sk.i(1, context, c6Var2, true);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        i13.customView = linearLayout2;
        int i14 = z11 ? -6988581 : z10 ? -12539616 : -6905171;
        z9 z9Var = new z9(context);
        z9Var.setImageResource(R.drawable.large_user_tag);
        z9Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), i14));
        linearLayout2.addView(z9Var, w7.z5.t(80, 80, 49, 0, 18, 0, 0));
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        TextView b10 = w7.d6.b(context, 20.0f, i15, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(z11 ? R.string.TagInfoOwnerTitle : z10 ? R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle));
        linearLayout2.addView(b10, w7.z5.a(-2.0f, 32.0f, 15.0f, 32.0f, 0.0f, -1, 49));
        TextView b11 = w7.d6.b(context, 14.0f, i15, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (str == null) {
            if (z11) {
                i11 = R.string.ChatTagOwner;
            } else if (z10) {
                i11 = R.string.ChatTagAdmin;
            } else {
                str2 = "";
            }
            str2 = LocaleController.getString(i11);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z11 || z10) {
            int i16 = z11 ? -6988581 : -12539616;
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.g6.m1(0.1f, i16));
            spannableStringBuilder.setSpan(new v01(i16, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.nd, false)), 0, spannableStringBuilder.length(), 33);
        }
        int i17 = 2;
        b11.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(z11 ? R.string.TagInfoOwnerText : z10 ? R.string.TagInfoAdminText : R.string.TagInfoMemberText, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout2.addView(b11, w7.z5.a(-2.0f, 32.0f, 10.0f, 32.0f, 25.0f, -1, 49));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, w7.z5.t(-1, -2, 7, 16, 0, 16, 16));
        int i18 = 0;
        while (i18 < i17) {
            w01 w01Var = new w01(context, i12);
            w01Var.setDelegate(new x01(i18 == 1, z11));
            y01 y01Var = new y01(context, c6Var2, w01Var);
            y01Var.V(di.a7.e(null, i12, j11, org.telegram.ui.ActionBar.g6.I.q()));
            y01Var.addView(w01Var, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 12.0f, -1, 87));
            linearLayout3.addView(y01Var, w7.z5.p(0, -1, 1.0f, 119, i18 == 1 ? 6 : 0, 0, i18 == 0 ? 6 : 0, 0));
            y01Var.setClipToOutline(true);
            y01Var.setOutlineProvider(new s01());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            org.telegram.ui.ActionBar.e3 e3Var2 = i13;
            LinearLayout linearLayout4 = linearLayout2;
            tL_message.from_id = MessagesController.getInstance(i12).getPeer(user.id);
            tL_message.peer_id = MessagesController.getInstance(i12).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i12).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i12, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new z01(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new z01(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            w01Var.N7 = true;
            w01Var.S7 = ChatObject.isChannel(chat) && chat.megagroup;
            messageObject.generateLayout(null);
            w01Var.X3(messageObject, null, false, false, false, false);
            w01Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i18++;
            i12 = i10;
            j11 = j10;
            i17 = 2;
            i13 = e3Var2;
            linearLayout2 = linearLayout4;
        }
        final org.telegram.ui.ActionBar.e3 e3Var3 = i13;
        LinearLayout linearLayout5 = linearLayout2;
        di.d f7 = org.telegram.messenger.sk.f(24, context, c6Var2, true);
        boolean z13 = (ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user));
        if (z13 || ChatObject.canManageTags(chat) || chat.creator || chat.admin_rights != null || z11) {
            linearLayout = linearLayout5;
        } else {
            TextView b12 = w7.d6.b(context, 12.0f, org.telegram.ui.ActionBar.g6.y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout = linearLayout5;
            linearLayout.addView(b12, w7.z5.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(f7, w7.z5.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z13) {
            f7.setText(LocaleController.getString(UserObject.isUserSelf(user) ? TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddMyTag : R.string.TagInfoButtonEditMyTag : TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddTag : R.string.TagInfoButtonEditTag));
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Components.r01
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.e3.this.dismiss();
                    a11.c(context, i10, j10, user, str, z10, z11, c6Var2);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            };
            e3Var = e3Var3;
            c6Var2 = c6Var2;
            f7.setOnClickListener(onClickListener);
        } else {
            f7.setText(zh.r3.i2(LocaleController.getString(R.string.Understood)));
            f7.setOnClickListener(new rt(17, e3Var3, zArr));
            e3Var = e3Var3;
        }
        e3Var.smoothKeyboardAnimationEnabled = true;
        e3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var2));
        e3Var.setOnDismissListener(new kr0(zArr, 14));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) > 0 || !z13) {
            e3Var.show();
        } else {
            c(context, i10, j10, user, str, z10, z11, c6Var2);
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j10));
        org.telegram.ui.ActionBar.e3 i11 = org.telegram.messenger.sk.i(1, context, c6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i11.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        TextView b10 = w7.d6.b(context, 20.0f, i12, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, w7.z5.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i12, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, w7.z5.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final di.d f7 = org.telegram.messenger.sk.f(24, context, c6Var, true);
        final boolean z12 = !TextUtils.isEmpty(str) || z10;
        f7.setText(LocaleController.getString((TextUtils.isEmpty(str) && !z10 && z12) ? R.string.MemberTagButtonRemove : z12 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd));
        final String[] strArr = {str == null ? "" : str};
        a11 a11Var = new a11(i10, j10, context, c6Var);
        a11Var.setClipToOutline(true);
        a11Var.setOutlineProvider(new u01());
        a11Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var));
        a11Var.a(user, str, z10, z11, new Utilities.Callback() { // from class: org.telegram.ui.Components.p01
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z13 = z12;
                f7.g(LocaleController.getString((isEmpty && !z10 && z13) ? R.string.MemberTagButtonRemove : z13 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd), true, true);
            }
        });
        linearLayout.addView(a11Var, w7.z5.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 22, c6Var);
        e9Var.setText(UserObject.isUserSelf(user) ? LocaleController.getString(R.string.MemberTagSelfInfo) : LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user)));
        linearLayout.addView(e9Var, w7.z5.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(f7, w7.z5.t(-1, 48, 7, 14, 19, 14, 12));
        i11.smoothKeyboardAnimationEnabled = true;
        i11.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.a7, c6Var));
        f7.setOnClickListener(new fi.w3(f7, a11Var, messagesController, j10, user, strArr, i10, i11, (!TextUtils.isEmpty(str) || z10 || z11) ? false : true, c6Var));
        imageView.setOnClickListener(new g3(i11, 3));
        i11.show();
        EditTextBoldCursor textView = a11Var.h.getTextView();
        textView.post(new r1(6, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = this.a;
        tL_message.from_id = MessagesController.getInstance(i10).getPeer(user.id);
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.b;
        tL_message.peer_id = messagesController.getPeer(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_message.out = false;
        this.s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i10, tL_message, true, false);
        this.r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new z01((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new z01((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        boolean z12 = chat != null;
        dv0 dv0Var = this.d;
        dv0Var.N7 = z12;
        dv0Var.S7 = ChatObject.isChannel(chat) && chat.megagroup;
        this.r.generateLayout(null);
        this.d.X3(this.r, null, false, false, false, false);
        k9 k9Var = this.e;
        k9Var.r(user);
        this.f.e(user, k9Var);
        this.w = callback;
        this.x = true;
        this.h.n(str, LocaleController.getString((!TextUtils.isEmpty(str) || z10) ? R.string.MemberTagHintEdit : R.string.MemberTagHintAdd), false);
        this.x = false;
    }
}
