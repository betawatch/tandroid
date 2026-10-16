package fi;

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
import bi.g7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.z9;
import org.telegram.ui.kg1;
import org.telegram.ui.sy;
import org.telegram.ui.yy;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements sy, org.telegram.ui.ActionBar.z1, li.n, ResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t1(int i10, long j10, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.a = 1;
        this.b = i10;
        this.c = j10;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean L(yy yyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new q2(i12, i13), 66);
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
                            a2Var.dismiss();
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
                            a2Var.dismiss();
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
                            ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new g7(12));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                        }
                    }
                    a2Var.dismiss();
                    break;
                }
                break;
        }
    }

    @Override // li.n
    public void i(n4.s sVar) {
        boolean z10;
        li.j jVar = (li.j) this.d;
        long j10 = this.c;
        li.g gVar = (li.g) this.e;
        int i10 = this.b;
        synchronized (li.k.d) {
            try {
                Spannable spannable = (Spannable) jVar.a.get();
                if (spannable != null && jVar.b.get(Long.valueOf(j10)) == gVar) {
                    if (!(spannable instanceof li.e) || ((li.e) spannable).a) {
                        z10 = false;
                    } else {
                        li.k.a(spannable, i10, (com.google.android.gms.internal.play_billing.s0) sVar.b);
                        z10 = true;
                    }
                    AndroidUtilities.runOnUIThread(new li.a(jVar, j10, gVar, i10, z10, sVar));
                }
            } finally {
            }
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        w21 w21Var = (w21) this.d;
        yp ypVar = (yp) this.e;
        Pair pair = (Pair) obj;
        if (pair == null || ((Long) pair.first).longValue() != this.c) {
            return;
        }
        Drawable drawable = ypVar.b;
        if (drawable instanceof cd0) {
            cd0 cd0Var = (cd0) drawable;
            cd0Var.t(w21.e((Bitmap) pair.second), this.b >= 0 ? 100 : -100);
            cd0Var.u(w21Var.L);
        }
        w21Var.invalidate();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.sy
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        int i12;
        String str;
        boolean z12;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i13;
        yy yyVar2 = (yy) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = yyVar2.getParentActivity();
        final int i14 = this.b;
        u1 u1Var = new u1(kg1Var, yyVar2, j10, i14);
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
                z1.a(parentActivity, i14, j11, j10, botVerifierSettings, u1Var);
                return true;
            }
            u1Var = u1Var;
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
                z1.a(parentActivity, i14, j11, j10, botVerifierSettings, u1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = chat3;
            chat2 = chat3;
        }
        boolean z13 = z12;
        final org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(z13 ? 1 : 0, parentActivity, (c6) null, z13);
        e3Var.fixNavigationBar();
        LinearLayout e = org.telegram.messenger.g0.e(parentActivity, z13 ? 1 : 0);
        TLRPC.User user3 = user;
        TLRPC.Chat chat4 = chat;
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setBackground(g6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), g6.x0(null, g6.ci, false)));
        z9 z9Var = new z9(parentActivity);
        z9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        k9 k9Var = new k9((c6) null);
        k9Var.p(chat2);
        z9Var.e(chat2, k9Var);
        frameLayout.addView(z9Var, z5.e(28, 28, 51));
        z9 z9Var2 = new z9(parentActivity);
        z9Var2.setEmojiColorFilter(new PorterDuffColorFilter(g6.x0(null, g6.z9, false), PorterDuff.Mode.SRC_IN));
        final u1 u1Var2 = u1Var;
        z9Var2.setAnimatedEmojiDrawable(s5.n(i14, botVerifierSettings.icon, null, 3));
        frameLayout.addView(z9Var2, z5.a(20.0f, 34.0f, 0.0f, 0.0f, 0.0f, 20, 19));
        h5 h5Var = new h5(parentActivity);
        h5Var.setTextColor(g6.x0(null, g6.j5, false));
        h5Var.setTextSize(13);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(str, false);
        h5Var.setWidthWrapContent(true);
        frameLayout.addView(h5Var, z5.a(-2.0f, 57.0f, 0.0f, 10.0f, 0.0f, -2, 19));
        e.addView(frameLayout, z5.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i16 = g6.G6;
        textView.setTextColor(g6.x0(null, i16, false));
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
        textView2.setTextColor(g6.x0(null, i16, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str)), textView2.getPaint().getFontMetricsInt(), false));
        e.addView(textView2, z5.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i17 = MessagesController.getInstance(i14).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final yd0 yd0Var = new yd0(parentActivity, null);
        yd0Var.setForceForceUseCenter(true);
        yd0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        yd0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(g6.x0(null, i16, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        int i18 = 0;
        editTextBoldCursor.setHighlightColor(g6.x0(null, g6.uf, false));
        editTextBoldCursor.setHandlesColor(g6.x0(null, g6.vf, false));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new v1(yd0Var, editTextBoldCursor, i18));
        yd0Var.e(editTextBoldCursor);
        yd0Var.addView(editTextBoldCursor, z5.a(-2.0f, 12.0f, 4.0f, 12.0f, 4.0f, -1, 48));
        e.addView(yd0Var, z5.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.i3());
        editTextBoldCursor.addTextChangedListener(new y1(editTextBoldCursor, i17, yd0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            yd0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextColor(g6.x0(null, g6.B6, false));
            textView3.setTextSize(1, 12.0f);
            textView3.setPadding(org.telegram.ui.Cells.c1.b(14.0f, i12 >= 0 ? R.string.BotVerifyDescriptionInfo : R.string.BotVerifyDescriptionInfoChat, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i13 = -1;
            e.addView(textView3, z5.d(-2.0f, -1));
        } else {
            i13 = -1;
            e.addView(new View(parentActivity), z5.d(12.0f, -1));
        }
        final di.d dVar = new di.d(parentActivity, null, true);
        dVar.g(textView.getText(), false, true);
        e.addView(dVar, z5.n(i13, 48));
        e3Var.customView = e;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: fi.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                di.d dVar2 = di.d.this;
                if (dVar2.N) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z14 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z14 && editTextBoldCursor2.getText().length() > i17) {
                    yd0 yd0Var2 = yd0Var;
                    yd0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(yd0Var2, -6.0f);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i19 = i14;
                setcustomverification.bot = MessagesController.getInstance(i19).getInputUser(j11);
                setcustomverification.peer = MessagesController.getInstance(i19).getInputPeer(j10);
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
                ConnectionsManager.getInstance(i19).sendRequest(setcustomverification, new bi.e5(dVar2, e3Var, u1Var2, 2));
            }
        });
        e3Var.smoothKeyboardAnimationEnabled = true;
        e3Var.smoothKeyboardByBottom = true;
        e3Var.show();
        return true;
    }

    public /* synthetic */ t1(EditText editText, long j10, int i10, EditText editText2) {
        this.a = 3;
        this.d = editText;
        this.c = j10;
        this.b = i10;
        this.e = editText2;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    public /* synthetic */ t1(Object obj, long j10, Object obj2, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = j10;
        this.e = obj2;
        this.b = i10;
    }

    public /* synthetic */ t1(yy yyVar, int i10, long j10, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.a = 0;
        this.d = yyVar;
        this.b = i10;
        this.c = j10;
        this.e = botVerifierSettings;
    }
}
