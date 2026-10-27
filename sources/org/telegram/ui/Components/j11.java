package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j11 extends LinearLayout {
    public final int a;
    public final long b;
    public final org.telegram.ui.ActionBar.u6 c;
    public final iv0 d;
    public final j9 e;
    public final y9 f;
    public final org.telegram.ui.Cells.h6 h;
    public final s6 n;
    public MessageObject r;
    public boolean s;
    public boolean v;
    public Utilities.Callback w;
    public boolean x;
    public float y;

    public j11(int i10, long j10, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.y = -6.0f;
        this.a = i10;
        this.b = j10;
        this.c = u6Var;
        setOrientation(1);
        org.telegram.ui.a9 a9Var = new org.telegram.ui.a9(this, context, 2);
        a9Var.U(fi.o6.e(null, i10, j10, org.telegram.ui.ActionBar.y6.I.q()));
        iv0 iv0Var = new iv0(context, i10);
        this.d = iv0Var;
        a9Var.addView(iv0Var, kb1.h(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new j9((org.telegram.ui.ActionBar.u6) null);
        y9 y9Var = new y9(context);
        this.f = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        a9Var.addView(y9Var, kb1.h(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(a9Var, kb1.u(-1, -2, 7));
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, 0, null, u6Var);
        this.h = h6Var;
        EditTextBoldCursor textView = h6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        h6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.y6, u6Var, PorterDuff.Mode.SRC_IN);
        h6Var.addView(imageView, kb1.h(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        kb1.b(imageView);
        imageView.setOnClickListener(new x80(textView, 18));
        s6 s6Var = new s6(context, false, true, false);
        this.n = s6Var;
        s6Var.n = false;
        s6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.Z(s6Var, org.telegram.ui.ActionBar.y6.q7, u6Var);
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setGravity(17);
        s6Var.setAllowCancel(true);
        s6Var.setScaleProperty(0.6f);
        h6Var.addView(s6Var, kb1.h(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new c11(this));
        addView(h6Var, kb1.u(-1, -2, 7));
        iv0Var.setDelegate(new m4.c(this, textView, false, 10));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, final org.telegram.ui.ActionBar.u6 u6Var) {
        String str2;
        org.telegram.ui.ActionBar.k3 k3Var;
        int i11;
        int i12 = i10;
        long j11 = j10;
        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j11));
        if (chat == null) {
            return;
        }
        final org.telegram.ui.ActionBar.k3 i13 = org.telegram.messenger.wh.i(1, context, u6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i13.customView = linearLayout;
        int i14 = z11 ? -6988581 : z10 ? -12539616 : -6905171;
        y9 y9Var = new y9(context);
        y9Var.setImageResource(R.drawable.large_user_tag);
        y9Var.setBackground(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(80.0f), i14));
        linearLayout.addView(y9Var, kb1.x(80, 80, 49, 0, 18, 0, 0));
        int i15 = org.telegram.ui.ActionBar.y6.G6;
        TextView L = kb1.L(context, 20.0f, i15, true, null);
        L.setGravity(17);
        L.setText(LocaleController.getString(z11 ? R.string.TagInfoOwnerTitle : z10 ? R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle));
        linearLayout.addView(L, kb1.h(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView L2 = kb1.L(context, 14.0f, i15, false, null);
        L2.setGravity(17);
        L2.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
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
            paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, i16));
            spannableStringBuilder.setSpan(new e11(i16, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.nd, null), 0, spannableStringBuilder.length(), 33);
        }
        int i17 = 2;
        L2.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(z11 ? R.string.TagInfoOwnerText : z10 ? R.string.TagInfoAdminText : R.string.TagInfoMemberText, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(L2, kb1.h(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, kb1.x(-1, -2, 7, 16, 0, 16, 16));
        int i18 = 0;
        while (i18 < i17) {
            f11 f11Var = new f11(context, i12);
            f11Var.setDelegate(new g11(i18 == 1, z11));
            h11 h11Var = new h11(context, u6Var, f11Var);
            h11Var.U(fi.o6.e(null, i12, j11, org.telegram.ui.ActionBar.y6.I.q()));
            h11Var.addView(f11Var, kb1.h(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout2.addView(h11Var, kb1.t(0, -1, 1.0f, 119, i18 == 1 ? 6 : 0, 0, i18 == 0 ? 6 : 0, 0));
            h11Var.setClipToOutline(true);
            h11Var.setOutlineProvider(new b11());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout3 = linearLayout2;
            int i19 = i18;
            tL_message.from_id = MessagesController.getInstance(i12).getPeer(user.id);
            tL_message.peer_id = MessagesController.getInstance(i12).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i12).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i12, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new i11(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new i11(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            f11Var.N7 = true;
            f11Var.S7 = ChatObject.isChannel(chat) && chat.megagroup;
            messageObject.generateLayout(null);
            f11Var.Z3(messageObject, null, false, false, false, false);
            f11Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i12 = i10;
            i17 = 2;
            linearLayout2 = linearLayout3;
            i18 = i19 + 1;
            j11 = j10;
        }
        fi.d f7 = org.telegram.messenger.wh.f(24, context, u6Var, true);
        boolean z13 = (ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user));
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView L3 = kb1.L(context, 12.0f, org.telegram.ui.ActionBar.y6.y6, false, null);
            L3.setGravity(1);
            L3.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(L3, kb1.o(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(f7, kb1.x(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z13) {
            f7.setText(LocaleController.getString(UserObject.isUserSelf(user) ? TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddMyTag : R.string.TagInfoButtonEditMyTag : TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddTag : R.string.TagInfoButtonEditTag));
            k3Var = i13;
            f7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.a11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.k3.this.dismiss();
                    j11.c(context, i10, j10, user, str, z10, z11, u6Var);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            });
        } else {
            f7.setText(bi.h7.H2(LocaleController.getString(R.string.Understood)));
            f7.setOnClickListener(new ga(28, i13, zArr));
            k3Var = i13;
        }
        k3Var.smoothKeyboardAnimationEnabled = true;
        k3Var.setBackgroundColorKey(org.telegram.ui.ActionBar.y6.d6);
        k3Var.setOnDismissListener(new np0(zArr, 19));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) > 0 || !z13) {
            k3Var.show();
        } else {
            c(context, i10, j10, user, str, z10, z11, u6Var);
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j10));
        org.telegram.ui.ActionBar.k3 i11 = org.telegram.messenger.wh.i(1, context, u6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i11.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        TextView L = kb1.L(context, 20.0f, i12, true, null);
        L.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(L, kb1.t(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.f7.t(imageView, i12, u6Var, PorterDuff.Mode.SRC_IN);
        int i13 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), 1, AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var);
        linearLayout2.addView(imageView, kb1.x(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, kb1.o(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final fi.d f7 = org.telegram.messenger.wh.f(24, context, u6Var, true);
        final boolean z12 = !TextUtils.isEmpty(str) || z10;
        f7.setText(LocaleController.getString((TextUtils.isEmpty(str) && !z10 && z12) ? R.string.MemberTagButtonRemove : z12 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd));
        final String[] strArr = {str == null ? "" : str};
        j11 j11Var = new j11(i10, j10, context, u6Var);
        j11Var.setClipToOutline(true);
        j11Var.setOutlineProvider(new d11());
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, j11Var, u6Var);
        j11Var.a(user, str, z10, z11, new Utilities.Callback() { // from class: org.telegram.ui.Components.y01
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z13 = z12;
                f7.i(LocaleController.getString((isEmpty && !z10 && z13) ? R.string.MemberTagButtonRemove : z13 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd), true, true);
            }
        });
        linearLayout.addView(j11Var, kb1.v(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 22, u6Var);
        i9Var.setText(UserObject.isUserSelf(user) ? LocaleController.getString(R.string.MemberTagSelfInfo) : LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user)));
        linearLayout.addView(i9Var, kb1.x(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(f7, kb1.x(-1, 48, 7, 14, 19, 14, 12));
        i11.smoothKeyboardAnimationEnabled = true;
        i11.setBackgroundColorKey(org.telegram.ui.ActionBar.y6.a7);
        f7.setOnClickListener(new hi.u3(f7, j11Var, messagesController, j10, user, strArr, i10, i11, (!TextUtils.isEmpty(str) || z10 || z11) ? false : true, u6Var));
        imageView.setOnClickListener(new g3(i11, 3));
        i11.show();
        EditTextBoldCursor textView = j11Var.h.getTextView();
        textView.post(new p70(textView, 5));
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
        spannableStringBuilder.setSpan(new i11((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new i11((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        boolean z12 = chat != null;
        iv0 iv0Var = this.d;
        iv0Var.N7 = z12;
        iv0Var.S7 = ChatObject.isChannel(chat) && chat.megagroup;
        this.r.generateLayout(null);
        iv0Var.Z3(this.r, null, false, false, false, false);
        j9 j9Var = this.e;
        j9Var.r(user);
        this.f.f(user, j9Var);
        this.w = callback;
        this.x = true;
        this.h.n(str, LocaleController.getString((!TextUtils.isEmpty(str) || z10) ? R.string.MemberTagHintEdit : R.string.MemberTagHintAdd), false);
        this.x = false;
    }
}
