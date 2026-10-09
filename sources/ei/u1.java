package ei;

import ai.t5;
import ai.v7;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z21;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.fg1;
import org.telegram.ui.ny;
import org.telegram.ui.ty;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements ny, org.telegram.ui.ActionBar.a2, ResultCallback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u1(int i10, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.b = i10;
        this.c = j3;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override // org.telegram.ui.ny
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ny
    public /* synthetic */ boolean K(ty tyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.a;
        Object obj = this.e;
        int i12 = this.b;
        long j3 = this.c;
        Object obj2 = this.d;
        int i13 = 0;
        switch (i11) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j3);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new q2(i12, i13), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
                MediaDataController.getInstance(i12).uninstallShortcut(j3, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j3 <= 0) {
                        long j10 = -j3;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j10));
                        String obj3 = editText.getText().toString();
                        String str = chat.title;
                        if (str != null && str.equals(obj3)) {
                            b2Var.dismiss();
                            break;
                        } else {
                            chat.title = obj3;
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                            MessagesController.getInstance(i12).changeChatTitle(j10, obj3);
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j3));
                        }
                    } else {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j3));
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
                            ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new v7(12));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j3));
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
        z21 z21Var = (z21) this.d;
        bq bqVar = (bq) this.e;
        Pair pair = (Pair) obj;
        if (pair == null || ((Long) pair.first).longValue() != this.c) {
            return;
        }
        Drawable drawable = bqVar.b;
        if (drawable instanceof cd0) {
            cd0 cd0Var = (cd0) drawable;
            cd0Var.t(z21.e((Bitmap) pair.second), this.b >= 0 ? 100 : -100);
            cd0Var.u(z21Var.L);
        }
        z21Var.invalidate();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ny
    public boolean w(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        int i12;
        String str;
        boolean z12;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i13;
        ty tyVar2 = (ty) this.d;
        final TL_bots.botVerifierSettings botverifiersettings = (TL_bots.botVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = tyVar2.getParentActivity();
        final int i14 = this.b;
        v1 v1Var = new v1(fg1Var, tyVar2, j3, i14);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i14);
        final long j10 = this.c;
        messagesController.getUser(Long.valueOf(j10));
        int i15 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i15 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user2);
            i12 = i15;
            if (user2.bot_verification_icon == botverifiersettings.icon) {
                a2.a(parentActivity, i14, j10, j3, botverifiersettings, v1Var);
                return true;
            }
            v1Var = v1Var;
            z12 = true;
            chat = null;
            user = user2;
            chat2 = user2;
        } else {
            i12 = i15;
            TLRPC.Chat chat3 = MessagesController.getInstance(i14).getChat(Long.valueOf(-j3));
            str = chat3 == null ? "" : chat3.title;
            z12 = true;
            if (chat3.bot_verification_icon == botverifiersettings.icon) {
                a2.a(parentActivity, i14, j10, j3, botverifiersettings, v1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = chat3;
            chat2 = chat3;
        }
        boolean z13 = z12;
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(z13 ? 1 : 0, parentActivity, (e6) null, z13);
        f3Var.fixNavigationBar();
        LinearLayout e7 = org.telegram.messenger.q.e(parentActivity, z13 ? 1 : 0);
        TLRPC.User user3 = user;
        TLRPC.Chat chat4 = chat;
        e7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e7.setClipChildren(false);
        e7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setBackground(i6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), i6.x0(null, i6.ci, false)));
        y9 y9Var = new y9(parentActivity);
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        j9 j9Var = new j9((e6) null);
        j9Var.p(chat2);
        y9Var.e(chat2, j9Var);
        frameLayout.addView(y9Var, x5.e(28, 28, 51));
        y9 y9Var2 = new y9(parentActivity);
        y9Var2.setEmojiColorFilter(new PorterDuffColorFilter(i6.x0(null, i6.z9, false), PorterDuff.Mode.SRC_IN));
        final v1 v1Var2 = v1Var;
        y9Var2.setAnimatedEmojiDrawable(s5.n(i14, botverifiersettings.icon, null, 3));
        frameLayout.addView(y9Var2, x5.a(20.0f, 34.0f, 0.0f, 0.0f, 0.0f, 20, 19));
        j5 j5Var = new j5(parentActivity);
        j5Var.setTextColor(i6.x0(null, i6.j5, false));
        j5Var.setTextSize(13);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(str, false);
        j5Var.setWidthWrapContent(true);
        frameLayout.addView(j5Var, x5.a(-2.0f, 57.0f, 0.0f, 10.0f, 0.0f, -2, 19));
        e7.addView(frameLayout, x5.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i16 = i6.G6;
        textView.setTextColor(i6.x0(null, i16, false));
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
        e7.addView(textView, x5.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(i6.x0(null, i16, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str)), textView2.getPaint().getFontMetricsInt(), false));
        e7.addView(textView2, x5.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i17 = MessagesController.getInstance(i14).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final zd0 zd0Var = new zd0(parentActivity, null);
        zd0Var.setForceForceUseCenter(true);
        zd0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        zd0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(i6.x0(null, i16, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(i6.x0(null, i6.uf, false));
        editTextBoldCursor.setHandlesColor(i6.x0(null, i6.vf, false));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new w1(zd0Var, editTextBoldCursor, 0));
        zd0Var.e(editTextBoldCursor);
        zd0Var.addView(editTextBoldCursor, x5.a(-2.0f, 12.0f, 4.0f, 12.0f, 4.0f, -1, 48));
        e7.addView(zd0Var, x5.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.i3());
        editTextBoldCursor.addTextChangedListener(new z1(editTextBoldCursor, i17, zd0Var));
        if (!TextUtils.isEmpty(botverifiersettings.custom_description)) {
            editTextBoldCursor.setText(botverifiersettings.custom_description);
            if (!botverifiersettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botverifiersettings.can_modify_custom_description) {
            zd0Var.setVisibility(8);
        }
        if (botverifiersettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextColor(i6.x0(null, i6.B6, false));
            textView3.setTextSize(1, 12.0f);
            textView3.setPadding(org.telegram.ui.Cells.c1.b(14.0f, i12 >= 0 ? R.string.BotVerifyDescriptionInfo : R.string.BotVerifyDescriptionInfoChat, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i13 = -1;
            e7.addView(textView3, x5.d(-2.0f, -1));
        } else {
            i13 = -1;
            e7.addView(new View(parentActivity), x5.d(12.0f, -1));
        }
        final ci.d dVar = new ci.d(parentActivity, null, true);
        dVar.g(textView.getText(), false, true);
        e7.addView(dVar, x5.n(i13, 48));
        f3Var.customView = e7;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: ei.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ci.d dVar2 = ci.d.this;
                if (dVar2.N) {
                    return;
                }
                TL_bots.botVerifierSettings botverifiersettings2 = botverifiersettings;
                boolean z14 = botverifiersettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z14 && editTextBoldCursor2.getText().length() > i17) {
                    zd0 zd0Var2 = zd0Var;
                    zd0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(zd0Var2, -6.0f);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i18 = i14;
                setcustomverification.bot = MessagesController.getInstance(i18).getInputUser(j10);
                setcustomverification.peer = MessagesController.getInstance(i18).getInputPeer(j3);
                if (botverifiersettings2.can_modify_custom_description) {
                    setcustomverification.custom_description = editTextBoldCursor2.getText().toString();
                } else {
                    setcustomverification.custom_description = botverifiersettings2.custom_description;
                }
                if (!TextUtils.isEmpty(setcustomverification.custom_description)) {
                    setcustomverification.flags |= 4;
                }
                ConnectionsManager.getInstance(i18).sendRequest(setcustomverification, new t5(dVar2, f3Var, v1Var2, 2));
            }
        });
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.smoothKeyboardByBottom = true;
        f3Var.show();
        return true;
    }

    public /* synthetic */ u1(EditText editText, long j3, int i10, EditText editText2) {
        this.d = editText;
        this.c = j3;
        this.b = i10;
        this.e = editText2;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    public /* synthetic */ u1(z21 z21Var, long j3, bq bqVar, int i10) {
        this.d = z21Var;
        this.c = j3;
        this.e = bqVar;
        this.b = i10;
    }

    public /* synthetic */ u1(ty tyVar, int i10, long j3, TL_bots.botVerifierSettings botverifiersettings) {
        this.d = tyVar;
        this.b = i10;
        this.c = j3;
        this.e = botverifiersettings;
    }
}
