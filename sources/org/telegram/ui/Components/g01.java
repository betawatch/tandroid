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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g01 extends LinearLayout {
    public final int a;
    public final long b;
    public final org.telegram.ui.ActionBar.g6 c;
    public final eu0 d;
    public final z8 e;
    public final p9 f;
    public final org.telegram.ui.Cells.c6 h;
    public final k6 n;
    public MessageObject r;
    public boolean s;
    public boolean v;
    public Utilities.Callback w;
    public boolean x;
    public float y;

    public g01(int i10, long j10, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.y = -6.0f;
        this.a = i10;
        this.b = j10;
        this.c = g6Var;
        setOrientation(1);
        lh.j4 j4Var = new lh.j4(this, context, 3);
        j4Var.V(qh.j5.e(null, i10, j10, org.telegram.ui.ActionBar.k6.I.q()));
        eu0 eu0Var = new eu0(context, i10);
        this.d = eu0Var;
        j4Var.addView(eu0Var, k7.c6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new z8((org.telegram.ui.ActionBar.g6) null);
        p9 p9Var = new p9(context);
        this.f = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        j4Var.addView(p9Var, k7.c6.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(j4Var, k7.c6.q(-1, -2, 7));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context, 0, null, g6Var);
        this.h = c6Var;
        EditTextBoldCursor textView = c6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        c6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.y6, g6Var), PorterDuff.Mode.SRC_IN));
        c6Var.addView(imageView, k7.c6.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        k7.e6.a(imageView);
        imageView.setOnClickListener(new b80(textView, 20));
        k6 k6Var = new k6(context, false, true, false);
        this.n = k6Var;
        k6Var.n = false;
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, g6Var));
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setGravity(17);
        k6Var.setAllowCancel(true);
        k6Var.setScaleProperty(0.6f);
        c6Var.addView(k6Var, k7.c6.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new zz0(this));
        addView(c6Var, k7.c6.q(-1, -2, 7));
        eu0Var.setDelegate(new n7.qa(this, textView, false, 13));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z4, final boolean z10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var) {
        String str2;
        org.telegram.ui.ActionBar.h3 h3Var;
        int i11;
        int i12 = i10;
        long j11 = j10;
        final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j11));
        if (chat == null) {
            return;
        }
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var2, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        o10.customView = linearLayout;
        int i13 = z10 ? -6988581 : z4 ? -12539616 : -6905171;
        p9 p9Var = new p9(context);
        p9Var.setImageResource(R.drawable.large_user_tag);
        p9Var.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), i13));
        linearLayout.addView(p9Var, k7.c6.t(80, 80, 49, 0, 18, 0, 0));
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = k7.g6.b(context, 20.0f, i14, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(z10 ? R.string.TagInfoOwnerTitle : z4 ? R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle));
        linearLayout.addView(b10, k7.c6.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = k7.g6.b(context, 14.0f, i14, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (str == null) {
            if (z10) {
                i11 = R.string.ChatTagOwner;
            } else if (z4) {
                i11 = R.string.ChatTagAdmin;
            } else {
                str2 = "";
            }
            str2 = LocaleController.getString(i11);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z10 || z4) {
            int i15 = z10 ? -6988581 : -12539616;
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.k6.l1(0.1f, i15));
            spannableStringBuilder.setSpan(new b01(i15, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.nd, false)), 0, spannableStringBuilder.length(), 33);
        }
        b11.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.TagInfoOwnerText : z4 ? R.string.TagInfoAdminText : R.string.TagInfoMemberText, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(b11, k7.c6.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, k7.c6.t(-1, -2, 7, 16, 0, 16, 16));
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            c01 c01Var = new c01(context, i12);
            c01Var.setDelegate(new d01(i16 == 1, z10));
            e01 e01Var = new e01(context, g6Var2, c01Var);
            e01Var.V(qh.j5.e(null, i12, j11, org.telegram.ui.ActionBar.k6.I.q()));
            e01Var.addView(c01Var, k7.c6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout2.addView(e01Var, k7.c6.p(0, -1, 1.0f, 119, i16 == 1 ? 6 : 0, 0, i16 == 0 ? 6 : 0, 0));
            e01Var.setClipToOutline(true);
            e01Var.setOutlineProvider(new yz0());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout3 = linearLayout2;
            org.telegram.ui.ActionBar.h3 h3Var2 = o10;
            tL_message.from_id = MessagesController.getInstance(i12).getPeer(user.id);
            tL_message.peer_id = MessagesController.getInstance(i12).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i12).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i12, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new f01(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new f01(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            c01Var.K7 = true;
            c01Var.P7 = ChatObject.isChannel(chat) && chat.megagroup;
            messageObject.generateLayout(null);
            c01Var.X3(messageObject, null, false, false, false, false);
            c01Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i16++;
            i12 = i10;
            j11 = j10;
            o10 = h3Var2;
            linearLayout2 = linearLayout3;
        }
        final org.telegram.ui.ActionBar.h3 h3Var3 = o10;
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var2, true);
        boolean z12 = (ChatObject.canManageTags(chat) && (!z4 || ((!z10 && z11) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user));
        if (!z12 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z10) {
            TextView b12 = k7.g6.b(context, 12.0f, org.telegram.ui.ActionBar.k6.y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(b12, k7.c6.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(p10, k7.c6.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z12) {
            p10.setText(LocaleController.getString(UserObject.isUserSelf(user) ? TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddMyTag : R.string.TagInfoButtonEditMyTag : TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddTag : R.string.TagInfoButtonEditTag));
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Components.xz0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.h3.this.dismiss();
                    g01.c(context, i10, j10, user, str, z4, z10, g6Var2);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            };
            h3Var = h3Var3;
            g6Var2 = g6Var2;
            p10.setOnClickListener(onClickListener);
        } else {
            p10.setText(mh.g5.g2(LocaleController.getString(R.string.Understood)));
            p10.setOnClickListener(new sx0(2, h3Var3, zArr));
            h3Var = h3Var3;
        }
        h3Var.smoothKeyboardAnimationEnabled = true;
        h3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var2));
        h3Var.setOnDismissListener(new oq0(zArr, 13));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) > 0 || !z12) {
            h3Var.show();
        } else {
            c(context, i10, j10, user, str, z4, z10, g6Var2);
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z4, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j10));
        boolean z11 = false;
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        o10.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = k7.g6.b(context, 20.0f, i11, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, k7.c6.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, k7.c6.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, k7.c6.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        final boolean z12 = !TextUtils.isEmpty(str) || z4;
        p10.setText(LocaleController.getString((TextUtils.isEmpty(str) && !z4 && z12) ? R.string.MemberTagButtonRemove : z12 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd));
        final String[] strArr = {str == null ? "" : str};
        g01 g01Var = new g01(i10, j10, context, g6Var);
        g01Var.setClipToOutline(true);
        g01Var.setOutlineProvider(new a01());
        g01Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var));
        g01Var.a(user, str, z4, z10, new Utilities.Callback() { // from class: org.telegram.ui.Components.uz0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z13 = z12;
                p10.g(LocaleController.getString((isEmpty && !z4 && z13) ? R.string.MemberTagButtonRemove : z13 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd), true, true);
            }
        });
        linearLayout.addView(g01Var, k7.c6.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 22, g6Var);
        a9Var.setText(UserObject.isUserSelf(user) ? LocaleController.getString(R.string.MemberTagSelfInfo) : LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user)));
        linearLayout.addView(a9Var, k7.c6.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(p10, k7.c6.t(-1, 48, 7, 14, 19, 14, 12));
        o10.smoothKeyboardAnimationEnabled = true;
        o10.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.a7, g6Var));
        if (TextUtils.isEmpty(str) && !z4 && !z10) {
            z11 = true;
        }
        p10.setOnClickListener(new vz0(p10, g01Var, messagesController, j10, user, strArr, i10, o10, z11, g6Var));
        imageView.setOnClickListener(new a3(o10, 3));
        o10.show();
        EditTextBoldCursor textView = g01Var.h.getTextView();
        textView.post(new q1(7, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z4, boolean z10, Utilities.Callback callback) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = this.a;
        tL_message.from_id = MessagesController.getInstance(i10).getPeer(user.id);
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.b;
        tL_message.peer_id = messagesController.getPeer(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_message.out = false;
        this.s = z4;
        this.v = z10;
        MessageObject messageObject = new MessageObject(i10, tL_message, true, false);
        this.r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new f01((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new f01((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        boolean z11 = chat != null;
        eu0 eu0Var = this.d;
        eu0Var.K7 = z11;
        eu0Var.P7 = ChatObject.isChannel(chat) && chat.megagroup;
        this.r.generateLayout(null);
        this.d.X3(this.r, null, false, false, false, false);
        z8 z8Var = this.e;
        z8Var.r(user);
        this.f.e(user, z8Var);
        this.w = callback;
        this.x = true;
        this.h.n(str, LocaleController.getString((!TextUtils.isEmpty(str) || z4) ? R.string.MemberTagHintEdit : R.string.MemberTagHintAdd), false);
        this.x = false;
    }
}
