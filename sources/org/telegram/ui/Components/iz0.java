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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class iz0 extends LinearLayout {
    public final int a;
    public final long b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final kt0 d;
    public final z8 e;
    public final o9 f;
    public final org.telegram.ui.Cells.c6 h;
    public final j6 n;
    public MessageObject r;
    public boolean s;
    public boolean v;
    public Utilities.Callback w;
    public boolean x;
    public float y;

    public iz0(int i9, long j10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.y = -6.0f;
        this.a = i9;
        this.b = j10;
        this.c = b6Var;
        setOrientation(1);
        fh.x4 x4Var = new fh.x4(this, context, 3);
        x4Var.V(kh.r6.e(null, i9, j10, org.telegram.ui.ActionBar.f6.I.q()));
        kt0 kt0Var = new kt0(context, i9);
        this.d = kt0Var;
        x4Var.addView(kt0Var, g7.e6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new z8((org.telegram.ui.ActionBar.b6) null);
        o9 o9Var = new o9(context);
        this.f = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        x4Var.addView(o9Var, g7.e6.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(x4Var, g7.e6.q(-1, -2, 7));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context, 0, null, b6Var);
        this.h = c6Var;
        EditTextBoldCursor textView = c6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        c6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var), PorterDuff.Mode.SRC_IN));
        c6Var.addView(imageView, g7.e6.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        g7.g6.a(imageView);
        imageView.setOnClickListener(new h70(textView, 20));
        j6 j6Var = new j6(context, false, true, false);
        this.n = j6Var;
        j6Var.n = false;
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, b6Var));
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setGravity(17);
        j6Var.setAllowCancel(true);
        j6Var.setScaleProperty(0.6f);
        c6Var.addView(j6Var, g7.e6.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new bz0(this));
        addView(c6Var, g7.e6.q(-1, -2, 7));
        kt0Var.setDelegate(new org.telegram.ui.Cells.e3(3, this, textView));
    }

    public static void b(final Context context, final int i9, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, org.telegram.ui.ActionBar.b6 b6Var) {
        String str2;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i10;
        int i11 = i9;
        long j11 = j10;
        final org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j11));
        if (chat == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 j12 = org.telegram.messenger.ll.j(context, b6Var2, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j12.customView = linearLayout;
        int i12 = z11 ? -6988581 : z10 ? -12539616 : -6905171;
        o9 o9Var = new o9(context);
        o9Var.setImageResource(R.drawable.large_user_tag);
        o9Var.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), i12));
        linearLayout.addView(o9Var, g7.e6.t(80, 80, 49, 0, 18, 0, 0));
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        TextView b10 = g7.i6.b(context, 20.0f, i13, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(z11 ? R.string.TagInfoOwnerTitle : z10 ? R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle));
        linearLayout.addView(b10, g7.e6.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = g7.i6.b(context, 14.0f, i13, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (str == null) {
            if (z11) {
                i10 = R.string.ChatTagOwner;
            } else if (z10) {
                i10 = R.string.ChatTagAdmin;
            } else {
                str2 = "";
            }
            str2 = LocaleController.getString(i10);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z11 || z10) {
            int i14 = z11 ? -6988581 : -12539616;
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, i14));
            spannableStringBuilder.setSpan(new dz0(i14, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.nd, false)), 0, spannableStringBuilder.length(), 33);
        }
        b11.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(z11 ? R.string.TagInfoOwnerText : z10 ? R.string.TagInfoAdminText : R.string.TagInfoMemberText, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(b11, g7.e6.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, g7.e6.t(-1, -2, 7, 16, 0, 16, 16));
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            ez0 ez0Var = new ez0(context, i11);
            ez0Var.setDelegate(new fz0(i15 == 1, z11));
            gz0 gz0Var = new gz0(context, b6Var2, ez0Var);
            gz0Var.V(kh.r6.e(null, i11, j11, org.telegram.ui.ActionBar.f6.I.q()));
            gz0Var.addView(ez0Var, g7.e6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout2.addView(gz0Var, g7.e6.p(0, -1, 1.0f, 119, i15 == 1 ? 6 : 0, 0, i15 == 0 ? 6 : 0, 0));
            gz0Var.setClipToOutline(true);
            gz0Var.setOutlineProvider(new az0());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout3 = linearLayout2;
            org.telegram.ui.ActionBar.f3 f3Var2 = j12;
            tL_message.from_id = MessagesController.getInstance(i11).getPeer(user.id);
            tL_message.peer_id = MessagesController.getInstance(i11).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i11, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new hz0(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new hz0(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            ez0Var.J7 = true;
            ez0Var.O7 = ChatObject.isChannel(chat) && chat.megagroup;
            messageObject.generateLayout(null);
            ez0Var.X3(messageObject, null, false, false, false, false);
            ez0Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i15++;
            i11 = i9;
            j11 = j10;
            j12 = f3Var2;
            linearLayout2 = linearLayout3;
        }
        final org.telegram.ui.ActionBar.f3 f3Var3 = j12;
        kh.d i17 = org.telegram.messenger.ll.i(24, context, b6Var2, true);
        boolean z13 = (ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user));
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView b12 = g7.i6.b(context, 12.0f, org.telegram.ui.ActionBar.f6.y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(b12, g7.e6.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(i17, g7.e6.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z13) {
            i17.setText(LocaleController.getString(UserObject.isUserSelf(user) ? TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddMyTag : R.string.TagInfoButtonEditMyTag : TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddTag : R.string.TagInfoButtonEditTag));
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Components.zy0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f3.this.dismiss();
                    iz0.c(context, i9, j10, user, str, z10, z11, b6Var2);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            };
            f3Var = f3Var3;
            b6Var2 = b6Var2;
            i17.setOnClickListener(onClickListener);
        } else {
            i17.setText(gh.k5.g2(LocaleController.getString(R.string.Understood)));
            i17.setOnClickListener(new vh0(4, f3Var3, zArr));
            f3Var = f3Var3;
        }
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var2));
        f3Var.setOnDismissListener(new tp0(zArr, 13));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) > 0 || !z13) {
            f3Var.show();
        } else {
            c(context, i9, j10, user, str, z10, z11, b6Var2);
        }
    }

    public static void c(Context context, int i9, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var) {
        MessagesController messagesController = MessagesController.getInstance(i9);
        messagesController.getChat(Long.valueOf(-j10));
        boolean z12 = false;
        org.telegram.ui.ActionBar.f3 j11 = org.telegram.messenger.ll.j(context, b6Var, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j11.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        TextView b10 = g7.i6.b(context, 20.0f, i10, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, g7.e6.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, g7.e6.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, g7.e6.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final kh.d i11 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        final boolean z13 = !TextUtils.isEmpty(str) || z10;
        i11.setText(LocaleController.getString((TextUtils.isEmpty(str) && !z10 && z13) ? R.string.MemberTagButtonRemove : z13 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd));
        final String[] strArr = {str == null ? "" : str};
        iz0 iz0Var = new iz0(i9, j10, context, b6Var);
        iz0Var.setClipToOutline(true);
        iz0Var.setOutlineProvider(new cz0());
        iz0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
        iz0Var.a(user, str, z10, z11, new Utilities.Callback() { // from class: org.telegram.ui.Components.xy0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z14 = z13;
                i11.g(LocaleController.getString((isEmpty && !z10 && z14) ? R.string.MemberTagButtonRemove : z14 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd), true, true);
            }
        });
        linearLayout.addView(iz0Var, g7.e6.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 22, b6Var);
        b9Var.setText(UserObject.isUserSelf(user) ? LocaleController.getString(R.string.MemberTagSelfInfo) : LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user)));
        linearLayout.addView(b9Var, g7.e6.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(i11, g7.e6.t(-1, 48, 7, 14, 19, 14, 12));
        j11.smoothKeyboardAnimationEnabled = true;
        j11.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, b6Var));
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z12 = true;
        }
        i11.setOnClickListener(new mh.l3(i11, iz0Var, messagesController, j10, user, strArr, i9, j11, z12, b6Var));
        imageView.setOnClickListener(new z2(j11, 3));
        j11.show();
        EditTextBoldCursor textView = iz0Var.h.getTextView();
        textView.post(new p1(7, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i9 = this.a;
        tL_message.from_id = MessagesController.getInstance(i9).getPeer(user.id);
        MessagesController messagesController = MessagesController.getInstance(i9);
        long j10 = this.b;
        tL_message.peer_id = messagesController.getPeer(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i9).getCurrentTime();
        tL_message.out = false;
        this.s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i9, tL_message, true, false);
        this.r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new hz0((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new hz0((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
        boolean z12 = chat != null;
        kt0 kt0Var = this.d;
        kt0Var.J7 = z12;
        kt0Var.O7 = ChatObject.isChannel(chat) && chat.megagroup;
        this.r.generateLayout(null);
        this.d.X3(this.r, null, false, false, false, false);
        z8 z8Var = this.e;
        z8Var.r(user);
        this.f.e(user, z8Var);
        this.w = callback;
        this.x = true;
        this.h.n(str, LocaleController.getString((!TextUtils.isEmpty(str) || z10) ? R.string.MemberTagHintEdit : R.string.MemberTagHintAdd), false);
        this.x = false;
    }
}
