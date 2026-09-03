package org.telegram.ui.Components;

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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.sf1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements org.telegram.ui.ActionBar.c2, ResultCallback, org.telegram.ui.ky {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s1(int i10, long j10, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.c = i10;
        this.b = j10;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean I(org.telegram.ui.qy qyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        long j10 = this.b;
        int i12 = this.c;
        switch (i11) {
            case 0:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j10 <= 0) {
                        long j11 = -j10;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j11));
                        String obj3 = editText.getText().toString();
                        String str = chat.title;
                        if (str != null && str.equals(obj3)) {
                            d2Var.dismiss();
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
                            d2Var.dismiss();
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
                            ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new nh.p5(8));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                        }
                    }
                    d2Var.dismiss();
                    break;
                }
                break;
            default:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j10);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.voip.o(i12, 6), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
                MediaDataController.getInstance(i12).uninstallShortcut(j10, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        w11 w11Var = (w11) this.d;
        ip ipVar = (ip) this.e;
        Pair pair = (Pair) obj;
        if (pair == null || ((Long) pair.first).longValue() != this.b) {
            return;
        }
        Drawable drawable = ipVar.b;
        if (drawable instanceof ec0) {
            ec0 ec0Var = (ec0) drawable;
            ec0Var.t(w11.e((Bitmap) pair.second), this.c >= 0 ? 100 : -100);
            ec0Var.u(w11Var.I);
        }
        w11Var.invalidate();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ky
    public boolean w(org.telegram.ui.qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        Activity activity;
        String str;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.Chat chat2;
        int i12;
        org.telegram.ui.qy qyVar2 = (org.telegram.ui.qy) this.d;
        final TL_bots.botVerifierSettings botverifiersettings = (TL_bots.botVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = qyVar2.getParentActivity();
        final int i13 = this.c;
        rh.j1 j1Var = new rh.j1(sf1Var, qyVar2, j10, i13);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i13);
        final long j11 = this.b;
        messagesController.getUser(Long.valueOf(j11));
        if (j10 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user2);
            if (user2.bot_verification_icon == botverifiersettings.icon) {
                rh.n1.a(parentActivity, i13, j11, j10, botverifiersettings, j1Var);
                return true;
            }
            activity = parentActivity;
            user = user2;
            chat = null;
            chat2 = user2;
        } else {
            activity = parentActivity;
            TLRPC.Chat chat3 = MessagesController.getInstance(i13).getChat(Long.valueOf(-j10));
            str = chat3 == null ? "" : chat3.title;
            if (chat3.bot_verification_icon == botverifiersettings.icon) {
                rh.n1.a(activity, i13, j11, j10, botverifiersettings, j1Var);
                return true;
            }
            j1Var = j1Var;
            chat = chat3;
            user = null;
            chat2 = chat3;
        }
        TLRPC.User user3 = user;
        final org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(activity, null, true, false);
        g3Var.fixNavigationBar();
        LinearLayout h = kf.k0.h(activity, 1);
        TLRPC.Chat chat4 = chat;
        h.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        h.setClipChildren(false);
        h.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ci, false)));
        p9 p9Var = new p9(activity);
        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.p(chat2);
        p9Var.e(chat2, z8Var);
        frameLayout.addView(p9Var, k7.b6.e(28, 28, 51));
        p9 p9Var2 = new p9(activity);
        p9Var2.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z9, false), PorterDuff.Mode.SRC_IN));
        final rh.j1 j1Var2 = j1Var;
        p9Var2.setAnimatedEmojiDrawable(l5.n(i13, botverifiersettings.icon, null, 3));
        frameLayout.addView(p9Var2, k7.b6.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        k5Var.setTextSize(13);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(str, false);
        k5Var.setWidthWrapContent(true);
        frameLayout.addView(k5Var, k7.b6.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        h.addView(frameLayout, k7.b6.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(activity);
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
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
        h.addView(textView, k7.b6.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str)), textView2.getPaint().getFontMetricsInt(), false));
        h.addView(textView2, k7.b6.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i15 = MessagesController.getInstance(i13).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        final bd0 bd0Var = new bd0(activity, null);
        bd0Var.setForceForceUseCenter(true);
        bd0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        bd0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.uf, false));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vf, false));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new lh.n8(bd0Var, editTextBoldCursor, 2));
        bd0Var.e(editTextBoldCursor);
        bd0Var.addView(editTextBoldCursor, k7.b6.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        h.addView(bd0Var, k7.b6.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.g3());
        editTextBoldCursor.addTextChangedListener(new rh.m1(editTextBoldCursor, i15, bd0Var));
        if (!TextUtils.isEmpty(botverifiersettings.custom_description)) {
            editTextBoldCursor.setText(botverifiersettings.custom_description);
            if (!botverifiersettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botverifiersettings.can_modify_custom_description) {
            bd0Var.setVisibility(8);
        }
        if (botverifiersettings.can_modify_custom_description) {
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
            textView3.setTextSize(1, 12.0f);
            textView3.setPadding(org.telegram.ui.b.e(14.0f, j10 >= 0 ? R.string.BotVerifyDescriptionInfo : R.string.BotVerifyDescriptionInfoChat, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i12 = -1;
            h.addView(textView3, k7.b6.c(-2.0f, -1));
        } else {
            i12 = -1;
            h.addView(new View(activity), k7.b6.c(12.0f, -1));
        }
        final ph.d dVar = new ph.d(activity, null, true);
        dVar.g(textView.getText(), false, true);
        h.addView(dVar, k7.b6.n(i12, 48));
        g3Var.customView = h;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: rh.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ph.d dVar2 = ph.d.this;
                if (dVar2.K) {
                    return;
                }
                TL_bots.botVerifierSettings botverifiersettings2 = botverifiersettings;
                boolean z11 = botverifiersettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z11 && editTextBoldCursor2.getText().length() > i15) {
                    bd0 bd0Var2 = bd0Var;
                    bd0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(bd0Var2, -6.0f);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i16 = i13;
                setcustomverification.bot = MessagesController.getInstance(i16).getInputUser(j11);
                setcustomverification.peer = MessagesController.getInstance(i16).getInputPeer(j10);
                if (botverifiersettings2.can_modify_custom_description) {
                    setcustomverification.custom_description = editTextBoldCursor2.getText().toString();
                } else {
                    setcustomverification.custom_description = botverifiersettings2.custom_description;
                }
                if (!TextUtils.isEmpty(setcustomverification.custom_description)) {
                    setcustomverification.flags |= 4;
                }
                ConnectionsManager.getInstance(i16).sendRequest(setcustomverification, new gg.y(dVar2, g3Var, j1Var2, 22));
            }
        });
        g3Var.smoothKeyboardAnimationEnabled = true;
        g3Var.smoothKeyboardByBottom = true;
        g3Var.show();
        return true;
    }

    public /* synthetic */ s1(EditText editText, long j10, int i10, EditText editText2) {
        this.d = editText;
        this.b = j10;
        this.c = i10;
        this.e = editText2;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public /* synthetic */ s1(w11 w11Var, long j10, ip ipVar, int i10) {
        this.d = w11Var;
        this.b = j10;
        this.e = ipVar;
        this.c = i10;
    }

    public /* synthetic */ s1(org.telegram.ui.qy qyVar, int i10, long j10, TL_bots.botVerifierSettings botverifiersettings) {
        this.d = qyVar;
        this.c = i10;
        this.b = j10;
        this.e = botverifiersettings;
    }
}
