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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a01 extends LinearLayout {
    public final int a;
    public final long b;
    public final org.telegram.ui.ActionBar.f6 c;
    public final du0 d;
    public final i9 e;
    public final x9 f;
    public final org.telegram.ui.Cells.c6 h;
    public final q6 n;
    public MessageObject r;
    public boolean s;
    public boolean v;
    public Utilities.Callback w;
    public boolean x;
    public float y;

    public a01(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.y = -6.0f;
        this.a = i10;
        this.b = j3;
        this.c = f6Var;
        setOrientation(1);
        org.telegram.ui.w8 w8Var = new org.telegram.ui.w8(this, context, 2);
        w8Var.V(di.d7.e(null, i10, j3, org.telegram.ui.ActionBar.j6.I.q()));
        du0 du0Var = new du0(context, i10);
        this.d = du0Var;
        w8Var.addView(du0Var, w7.x5.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new i9((org.telegram.ui.ActionBar.f6) null);
        x9 x9Var = new x9(context);
        this.f = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        w8Var.addView(x9Var, w7.x5.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(w8Var, w7.x5.q(-1, -2, 7));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context, 0, null, f6Var);
        this.h = c6Var;
        EditTextBoldCursor textView = c6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        c6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var), PorterDuff.Mode.SRC_IN));
        c6Var.addView(imageView, w7.x5.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        w7.z5.a(imageView);
        imageView.setOnClickListener(new x70(textView, 20));
        q6 q6Var = new q6(context, false, true, false);
        this.n = q6Var;
        q6Var.n = false;
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, f6Var));
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setGravity(17);
        q6Var.setAllowCancel(true);
        q6Var.setScaleProperty(0.6f);
        c6Var.addView(q6Var, w7.x5.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new tz0(this));
        addView(c6Var, w7.x5.q(-1, -2, 7));
        du0Var.setDelegate(new o0.a(this, textView, false, 4));
    }

    public static void b(final Context context, final int i10, final long j3, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, org.telegram.ui.ActionBar.f6 f6Var) {
        String str2;
        LinearLayout linearLayout;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i11;
        int i12 = i10;
        long j10 = j3;
        final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
        if (chat == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 i13 = org.telegram.messenger.wl.i(1, context, f6Var2, true);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        i13.customView = linearLayout2;
        int i14 = z11 ? -6988581 : z10 ? -12539616 : -6905171;
        x9 x9Var = new x9(context);
        x9Var.setImageResource(R.drawable.large_user_tag);
        x9Var.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), i14));
        linearLayout2.addView(x9Var, w7.x5.t(80, 80, 49, 0, 18, 0, 0));
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = w7.b6.b(context, 20.0f, i15, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(z11 ? R.string.TagInfoOwnerTitle : z10 ? R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle));
        linearLayout2.addView(b10, w7.x5.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = w7.b6.b(context, 14.0f, i15, false, null);
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
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i16));
            spannableStringBuilder.setSpan(new vz0(i16, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.nd, false)), 0, spannableStringBuilder.length(), 33);
        }
        b11.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(z11 ? R.string.TagInfoOwnerText : z10 ? R.string.TagInfoAdminText : R.string.TagInfoMemberText, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout2.addView(b11, w7.x5.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, w7.x5.t(-1, -2, 7, 16, 0, 16, 16));
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            wz0 wz0Var = new wz0(context, i12);
            wz0Var.setDelegate(new xz0(i17 == 1, z11));
            yz0 yz0Var = new yz0(context, f6Var2, wz0Var);
            yz0Var.V(di.d7.e(null, i12, j10, org.telegram.ui.ActionBar.j6.I.q()));
            yz0Var.addView(wz0Var, w7.x5.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout3.addView(yz0Var, w7.x5.p(0, -1, 1.0f, 119, i17 == 1 ? 6 : 0, 0, i17 == 0 ? 6 : 0, 0));
            yz0Var.setClipToOutline(true);
            yz0Var.setOutlineProvider(new sz0());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            org.telegram.ui.ActionBar.f3 f3Var2 = i13;
            LinearLayout linearLayout4 = linearLayout2;
            tL_message.from_id = MessagesController.getInstance(i12).getPeer(user.id);
            tL_message.peer_id = MessagesController.getInstance(i12).getPeer(j10);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i12).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i12, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new zz0(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new zz0(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            wz0Var.N7 = true;
            wz0Var.S7 = ChatObject.isChannel(chat) && chat.megagroup;
            messageObject.generateLayout(null);
            wz0Var.X3(messageObject, null, false, false, false, false);
            wz0Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i17++;
            i12 = i10;
            j10 = j3;
            i13 = f3Var2;
            linearLayout2 = linearLayout4;
        }
        final org.telegram.ui.ActionBar.f3 f3Var3 = i13;
        LinearLayout linearLayout5 = linearLayout2;
        di.d g10 = org.telegram.messenger.wl.g(24, context, f6Var2, true);
        boolean z13 = (ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user));
        if (z13 || ChatObject.canManageTags(chat) || chat.creator || chat.admin_rights != null || z11) {
            linearLayout = linearLayout5;
        } else {
            TextView b12 = w7.b6.b(context, 12.0f, org.telegram.ui.ActionBar.j6.y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout = linearLayout5;
            linearLayout.addView(b12, w7.x5.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(g10, w7.x5.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z13) {
            g10.setText(LocaleController.getString(UserObject.isUserSelf(user) ? TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddMyTag : R.string.TagInfoButtonEditMyTag : TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddTag : R.string.TagInfoButtonEditTag));
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Components.rz0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f3.this.dismiss();
                    a01.c(context, i10, j3, user, str, z10, z11, f6Var2);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            };
            f3Var = f3Var3;
            f6Var2 = f6Var2;
            g10.setOnClickListener(onClickListener);
        } else {
            g10.setText(zh.w3.g2(LocaleController.getString(R.string.Understood)));
            g10.setOnClickListener(new ct(17, f3Var3, zArr));
            f3Var = f3Var3;
        }
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var2));
        f3Var.setOnDismissListener(new jq0(zArr, 13));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) > 0 || !z13) {
            f3Var.show();
        } else {
            c(context, i10, j3, user, str, z10, z11, f6Var2);
        }
    }

    public static void c(Context context, int i10, long j3, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j3));
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.wl.i(1, context, f6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i11.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = w7.b6.b(context, 20.0f, i12, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, w7.x5.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, w7.x5.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, w7.x5.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final di.d g10 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        final boolean z12 = !TextUtils.isEmpty(str) || z10;
        g10.setText(LocaleController.getString((TextUtils.isEmpty(str) && !z10 && z12) ? R.string.MemberTagButtonRemove : z12 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd));
        final String[] strArr = {str == null ? "" : str};
        a01 a01Var = new a01(i10, j3, context, f6Var);
        a01Var.setClipToOutline(true);
        a01Var.setOutlineProvider(new uz0());
        a01Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
        a01Var.a(user, str, z10, z11, new Utilities.Callback() { // from class: org.telegram.ui.Components.pz0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z13 = z12;
                g10.g(LocaleController.getString((isEmpty && !z10 && z13) ? R.string.MemberTagButtonRemove : z13 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd), true, true);
            }
        });
        linearLayout.addView(a01Var, w7.x5.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 22, f6Var);
        e9Var.setText(UserObject.isUserSelf(user) ? LocaleController.getString(R.string.MemberTagSelfInfo) : LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user)));
        linearLayout.addView(e9Var, w7.x5.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(g10, w7.x5.t(-1, 48, 7, 14, 19, 14, 12));
        i11.smoothKeyboardAnimationEnabled = true;
        i11.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var));
        g10.setOnClickListener(new fi.v3(g10, a01Var, messagesController, j3, user, strArr, i10, i11, (!TextUtils.isEmpty(str) || z10 || z11) ? false : true, f6Var));
        imageView.setOnClickListener(new e3(i11, 3));
        i11.show();
        EditTextBoldCursor textView = a01Var.h.getTextView();
        textView.post(new r1(7, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = this.a;
        tL_message.from_id = MessagesController.getInstance(i10).getPeer(user.id);
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j3 = this.b;
        tL_message.peer_id = messagesController.getPeer(j3);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_message.out = false;
        this.s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i10, tL_message, true, false);
        this.r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new zz0((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new zz0((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        boolean z12 = chat != null;
        du0 du0Var = this.d;
        du0Var.N7 = z12;
        du0Var.S7 = ChatObject.isChannel(chat) && chat.megagroup;
        this.r.generateLayout(null);
        this.d.X3(this.r, null, false, false, false, false);
        i9 i9Var = this.e;
        i9Var.r(user);
        this.f.e(user, i9Var);
        this.w = callback;
        this.x = true;
        this.h.n(str, LocaleController.getString((!TextUtils.isEmpty(str) || z10) ? R.string.MemberTagHintEdit : R.string.MemberTagHintAdd), false);
        this.x = false;
    }
}
