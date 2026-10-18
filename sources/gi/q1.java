package gi;

import ai.hb;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.d6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.ey;
import org.telegram.ui.te1;
import org.telegram.ui.xx;
import w7.z5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements xx, org.telegram.ui.ActionBar.a2, mi.n, ResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q1(int i10, long j10, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.a = 1;
        this.b = i10;
        this.c = j10;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        return false;
    }

    @Override // mi.n
    public void a(mi.q qVar) {
        boolean z10;
        mi.j jVar = (mi.j) this.d;
        long j10 = this.c;
        mi.g gVar = (mi.g) this.e;
        int i10 = this.b;
        synchronized (mi.k.d) {
            try {
                Spannable spannable = (Spannable) jVar.a.get();
                if (spannable != null && jVar.b.get(Long.valueOf(j10)) == gVar) {
                    if (!(spannable instanceof mi.e) || ((mi.e) spannable).a) {
                        z10 = false;
                    } else {
                        mi.k.a(spannable, i10, (com.google.android.gms.internal.play_billing.s0) qVar.b);
                        z10 = true;
                    }
                    AndroidUtilities.runOnUIThread(new mi.a(jVar, j10, gVar, i10, z10, qVar));
                }
            } finally {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.a;
        Object obj = this.e;
        int i12 = this.b;
        long j10 = this.c;
        Object obj2 = this.d;
        int i13 = 0;
        switch (i11) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j10);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new k2(i12, i13), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
                MediaDataController.getInstance(i12).uninstallShortcut(j10, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j10 <= 0) {
                        long j11 = -j10;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j11));
                        String obj3 = editText.getText().toString();
                        String str = chat.title;
                        if (str != null && str.equals(obj3)) {
                            b2Var.dismiss();
                            break;
                        } else {
                            chat.title = obj3;
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                            MessagesController.getInstance(i12).changeChatTitle(j11, obj3);
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                        }
                    } else {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                        String obj4 = editText.getText().toString();
                        String obj5 = editText2.getText().toString();
                        String str2 = user.first_name;
                        String str3 = user.last_name;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str2.equals(obj4) && str3.equals(obj5)) {
                            b2Var.dismiss();
                            break;
                        } else {
                            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                            updateprofile.flags = 3;
                            updateprofile.first_name = obj4;
                            user.first_name = obj4;
                            updateprofile.last_name = obj5;
                            user.last_name = obj5;
                            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(UserConfig.getInstance(i12).getClientUserId()));
                            if (user2 != null) {
                                user2.first_name = updateprofile.first_name;
                                user2.last_name = updateprofile.last_name;
                            }
                            UserConfig.getInstance(i12).saveConfig(true);
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                            ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new d6(12));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                        }
                    }
                    b2Var.dismiss();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        p21 p21Var = (p21) this.d;
        vp vpVar = (vp) this.e;
        Pair pair = (Pair) obj;
        if (pair == null || ((Long) pair.first).longValue() != this.c) {
            return;
        }
        Drawable drawable = vpVar.b;
        if (drawable instanceof wc0) {
            wc0 wc0Var = (wc0) drawable;
            wc0Var.s(p21.e((Bitmap) pair.second), this.b >= 0 ? 100 : -100);
            wc0Var.t(p21Var.L);
        }
        p21Var.invalidate();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        int i12;
        String str;
        boolean z12;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i13;
        ey eyVar2 = (ey) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = eyVar2.getParentActivity();
        final int i14 = this.b;
        r1 r1Var = new r1(te1Var, eyVar2, j10, i14);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i14);
        final long j11 = this.c;
        messagesController.getUser(Long.valueOf(j11));
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i15 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user2);
            i12 = i15;
            if (user2.bot_verification_icon == botVerifierSettings.icon) {
                v1.a(parentActivity, i14, j11, j10, botVerifierSettings, r1Var);
                return true;
            }
            r1Var = r1Var;
            z12 = true;
            chat = null;
            user = user2;
            chat2 = user2;
        } else {
            i12 = i15;
            TLRPC.Chat chat3 = MessagesController.getInstance(i14).getChat(Long.valueOf(-j10));
            str = chat3 == null ? "" : chat3.title;
            z12 = true;
            if (chat3.bot_verification_icon == botVerifierSettings.icon) {
                v1.a(parentActivity, i14, j11, j10, botVerifierSettings, r1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = chat3;
            chat2 = chat3;
        }
        boolean z13 = z12;
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(z13 ? 1 : 0, parentActivity, (org.telegram.ui.ActionBar.d6) null, z13);
        f3Var.fixNavigationBar();
        LinearLayout e = org.telegram.messenger.g0.e(parentActivity, z13 ? 1 : 0);
        TLRPC.User user3 = user;
        TLRPC.Chat chat4 = chat;
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setBackground(h6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), h6.x0(null, h6.ci, false)));
        w9 w9Var = new w9(parentActivity);
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(chat2);
        w9Var.e(chat2, h9Var);
        frameLayout.addView(w9Var, z5.e(28, 28, 51));
        w9 w9Var2 = new w9(parentActivity);
        w9Var2.setEmojiColorFilter(new PorterDuffColorFilter(h6.x0(null, h6.z9, false), PorterDuff.Mode.SRC_IN));
        final r1 r1Var2 = r1Var;
        w9Var2.setAnimatedEmojiDrawable(r5.n(i14, botVerifierSettings.icon, null, 3));
        frameLayout.addView(w9Var2, z5.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        j5 j5Var = new j5(parentActivity);
        j5Var.setTextColor(h6.x0(null, h6.j5, false));
        j5Var.setTextSize(13);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(str, false);
        j5Var.setWidthWrapContent(true);
        frameLayout.addView(j5Var, z5.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        e.addView(frameLayout, z5.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i16 = h6.G6;
        textView.setTextColor(h6.x0(null, i16, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (UserObject.isBot(user3)) {
            textView.setText(LocaleController.getString(R.string.BotVerifyBotTitle));
        } else if (user3 != null) {
            textView.setText(LocaleController.getString(R.string.BotVerifyUserTitle));
        } else if (ChatObject.isChannelAndNotMegaGroup(chat4)) {
            textView.setText(LocaleController.getString(R.string.BotVerifyChannelTitle));
        } else {
            textView.setText(LocaleController.getString(R.string.BotVerifyGroupTitle));
        }
        textView.setTypeface(AndroidUtilities.bold());
        e.addView(textView, z5.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(h6.x0(null, i16, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str)), textView2.getPaint().getFontMetricsInt(), false));
        e.addView(textView2, z5.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i17 = MessagesController.getInstance(i14).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final sd0 sd0Var = new sd0(parentActivity, null);
        sd0Var.setForceForceUseCenter(true);
        sd0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        sd0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(h6.x0(null, i16, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(h6.x0(null, h6.uf, false));
        editTextBoldCursor.setHandlesColor(h6.x0(null, h6.vf, false));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new hb(sd0Var, editTextBoldCursor, 1));
        sd0Var.e(editTextBoldCursor);
        sd0Var.addView(editTextBoldCursor, z5.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        e.addView(sd0Var, z5.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.h3());
        editTextBoldCursor.addTextChangedListener(new u1(editTextBoldCursor, i17, sd0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            sd0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextColor(h6.x0(null, h6.B6, false));
            textView3.setTextSize(1, 12.0f);
            textView3.setPadding(org.telegram.ui.Cells.c1.e(14.0f, i12 >= 0 ? R.string.BotVerifyDescriptionInfo : R.string.BotVerifyDescriptionInfoChat, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i13 = -1;
            e.addView(textView3, z5.c(-2.0f, -1));
        } else {
            i13 = -1;
            e.addView(new View(parentActivity), z5.c(12.0f, -1));
        }
        final ei.d dVar = new ei.d(parentActivity, null, true);
        dVar.g(textView.getText(), false, true);
        e.addView(dVar, z5.n(i13, 48));
        f3Var.customView = e;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: gi.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.d dVar2 = ei.d.this;
                if (dVar2.N) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z14 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z14 && editTextBoldCursor2.getText().length() > i17) {
                    sd0 sd0Var2 = sd0Var;
                    sd0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(sd0Var2, -6.0f);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i18 = i14;
                setcustomverification.bot = MessagesController.getInstance(i18).getInputUser(j11);
                setcustomverification.peer = MessagesController.getInstance(i18).getInputPeer(j10);
                if (botVerifierSettings2.can_modify_custom_description) {
                    String obj = editTextBoldCursor2.getText().toString();
                    if (!TextUtils.isEmpty(obj)) {
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        setcustomverification.custom_description = tL_textWithEntities2;
                        tL_textWithEntities2.text = obj;
                    }
                } else {
                    setcustomverification.custom_description = botVerifierSettings2.custom_description;
                }
                ConnectionsManager.getInstance(i18).sendRequest(setcustomverification, new ai.k2(dVar2, f3Var, r1Var2, 7));
            }
        });
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.smoothKeyboardByBottom = true;
        f3Var.show();
        return true;
    }

    public /* synthetic */ q1(EditText editText, long j10, int i10, EditText editText2) {
        this.a = 3;
        this.d = editText;
        this.c = j10;
        this.b = i10;
        this.e = editText2;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public /* synthetic */ q1(Object obj, long j10, Object obj2, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = j10;
        this.e = obj2;
        this.b = i10;
    }

    public /* synthetic */ q1(ey eyVar, int i10, long j10, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.a = 0;
        this.d = eyVar;
        this.b = i10;
        this.c = j10;
        this.e = botVerifierSettings;
    }
}
