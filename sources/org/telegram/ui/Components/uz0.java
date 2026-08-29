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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uz0 extends LinearLayout {
    public final int a;
    public final long b;
    public final org.telegram.ui.ActionBar.c6 c;
    public final vt0 d;
    public final e9 e;
    public final t9 f;
    public final org.telegram.ui.Cells.a6 h;
    public final o6 n;
    public MessageObject r;
    public boolean s;
    public boolean v;
    public Utilities.Callback w;
    public boolean x;
    public float y;

    public uz0(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.y = -6.0f;
        this.a = i10;
        this.b = j10;
        this.c = c6Var;
        setOrientation(1);
        ih.j4 j4Var = new ih.j4(this, context, 3);
        j4Var.V(nh.f6.e(null, i10, j10, org.telegram.ui.ActionBar.g6.I.q()));
        vt0 vt0Var = new vt0(context, i10);
        this.d = vt0Var;
        j4Var.addView(vt0Var, i7.f6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new e9((org.telegram.ui.ActionBar.c6) null);
        t9 t9Var = new t9(context);
        this.f = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        j4Var.addView(t9Var, i7.f6.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(j4Var, i7.f6.q(-1, -2, 7));
        org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, 0, null, c6Var);
        this.h = a6Var;
        EditTextBoldCursor textView = a6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        a6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var), PorterDuff.Mode.SRC_IN));
        a6Var.addView(imageView, i7.f6.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        i7.h6.a(imageView);
        imageView.setOnClickListener(new u70(textView, 20));
        o6 o6Var = new o6(context, false, true, false);
        this.n = o6Var;
        o6Var.n = false;
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var));
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setGravity(17);
        o6Var.setAllowCancel(true);
        o6Var.setScaleProperty(0.6f);
        a6Var.addView(o6Var, i7.f6.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new nz0(this));
        addView(a6Var, i7.f6.q(-1, -2, 7));
        vt0Var.setDelegate(new oc.i(this, textView, false, 6));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, org.telegram.ui.ActionBar.c6 c6Var) {
        String str2;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i11;
        int i12 = i10;
        long j11 = j10;
        final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j11));
        if (chat == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var2, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        q6.customView = linearLayout;
        int i13 = z11 ? -6988581 : z10 ? -12539616 : -6905171;
        t9 t9Var = new t9(context);
        t9Var.setImageResource(R.drawable.large_user_tag);
        t9Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), i13));
        linearLayout.addView(t9Var, i7.f6.t(80, 80, 49, 0, 18, 0, 0));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        TextView b10 = i7.j6.b(context, 20.0f, i14, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(z11 ? R.string.TagInfoOwnerTitle : z10 ? R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle));
        linearLayout.addView(b10, i7.f6.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = i7.j6.b(context, 14.0f, i14, false, null);
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
            int i15 = z11 ? -6988581 : -12539616;
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, i15));
            spannableStringBuilder.setSpan(new pz0(i15, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.nd, false)), 0, spannableStringBuilder.length(), 33);
        }
        b11.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(z11 ? R.string.TagInfoOwnerText : z10 ? R.string.TagInfoAdminText : R.string.TagInfoMemberText, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(b11, i7.f6.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, i7.f6.t(-1, -2, 7, 16, 0, 16, 16));
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            qz0 qz0Var = new qz0(context, i12);
            qz0Var.setDelegate(new rz0(i16 == 1, z11));
            sz0 sz0Var = new sz0(context, c6Var2, qz0Var);
            sz0Var.V(nh.f6.e(null, i12, j11, org.telegram.ui.ActionBar.g6.I.q()));
            sz0Var.addView(qz0Var, i7.f6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout2.addView(sz0Var, i7.f6.p(0, -1, 1.0f, 119, i16 == 1 ? 6 : 0, 0, i16 == 0 ? 6 : 0, 0));
            sz0Var.setClipToOutline(true);
            sz0Var.setOutlineProvider(new mz0());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout3 = linearLayout2;
            org.telegram.ui.ActionBar.f3 f3Var2 = q6;
            tL_message.from_id = MessagesController.getInstance(i12).getPeer(user.id);
            tL_message.peer_id = MessagesController.getInstance(i12).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i12).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i12, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new tz0(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new tz0(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            qz0Var.J7 = true;
            qz0Var.O7 = ChatObject.isChannel(chat) && chat.megagroup;
            messageObject.generateLayout(null);
            qz0Var.X3(messageObject, null, false, false, false, false);
            qz0Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i16++;
            i12 = i10;
            j11 = j10;
            q6 = f3Var2;
            linearLayout2 = linearLayout3;
        }
        final org.telegram.ui.ActionBar.f3 f3Var3 = q6;
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var2, true);
        boolean z13 = (ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user));
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView b12 = i7.j6.b(context, 12.0f, org.telegram.ui.ActionBar.g6.y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(b12, i7.f6.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(o10, i7.f6.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z13) {
            o10.setText(LocaleController.getString(UserObject.isUserSelf(user) ? TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddMyTag : R.string.TagInfoButtonEditMyTag : TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddTag : R.string.TagInfoButtonEditTag));
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Components.lz0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f3.this.dismiss();
                    uz0.c(context, i10, j10, user, str, z10, z11, c6Var2);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            };
            f3Var = f3Var3;
            c6Var2 = c6Var2;
            o10.setOnClickListener(onClickListener);
        } else {
            o10.setText(jh.h5.g2(LocaleController.getString(R.string.Understood)));
            o10.setOnClickListener(new fi0(5, f3Var3, zArr));
            f3Var = f3Var3;
        }
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var2));
        f3Var.setOnDismissListener(new fq0(zArr, 13));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) > 0 || !z13) {
            f3Var.show();
        } else {
            c(context, i10, j10, user, str, z10, z11, c6Var2);
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j10));
        boolean z12 = false;
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        q6.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        TextView b10 = i7.j6.b(context, 20.0f, i11, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, i7.f6.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, i7.f6.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, i7.f6.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        final boolean z13 = !TextUtils.isEmpty(str) || z10;
        o10.setText(LocaleController.getString((TextUtils.isEmpty(str) && !z10 && z13) ? R.string.MemberTagButtonRemove : z13 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd));
        final String[] strArr = {str == null ? "" : str};
        uz0 uz0Var = new uz0(i10, j10, context, c6Var);
        uz0Var.setClipToOutline(true);
        uz0Var.setOutlineProvider(new oz0());
        uz0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
        uz0Var.a(user, str, z10, z11, new Utilities.Callback() { // from class: org.telegram.ui.Components.iz0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z14 = z13;
                o10.g(LocaleController.getString((isEmpty && !z10 && z14) ? R.string.MemberTagButtonRemove : z14 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd), true, true);
            }
        });
        linearLayout.addView(uz0Var, i7.f6.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, 22, c6Var);
        y8Var.setText(UserObject.isUserSelf(user) ? LocaleController.getString(R.string.MemberTagSelfInfo) : LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user)));
        linearLayout.addView(y8Var, i7.f6.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(o10, i7.f6.t(-1, 48, 7, 14, 19, 14, 12));
        q6.smoothKeyboardAnimationEnabled = true;
        q6.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, c6Var));
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z12 = true;
        }
        o10.setOnClickListener(new jz0(o10, uz0Var, messagesController, j10, user, strArr, i10, q6, z12, c6Var));
        imageView.setOnClickListener(new d3(q6, 3));
        q6.show();
        EditTextBoldCursor textView = uz0Var.h.getTextView();
        textView.post(new s1(7, textView));
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
        spannableStringBuilder.setSpan(new tz0((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new tz0((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        boolean z12 = chat != null;
        vt0 vt0Var = this.d;
        vt0Var.J7 = z12;
        vt0Var.O7 = ChatObject.isChannel(chat) && chat.megagroup;
        this.r.generateLayout(null);
        this.d.X3(this.r, null, false, false, false, false);
        e9 e9Var = this.e;
        e9Var.r(user);
        this.f.e(user, e9Var);
        this.w = callback;
        this.x = true;
        this.h.n(str, LocaleController.getString((!TextUtils.isEmpty(str) || z10) ? R.string.MemberTagHintEdit : R.string.MemberTagHintAdd), false);
        this.x = false;
    }
}
