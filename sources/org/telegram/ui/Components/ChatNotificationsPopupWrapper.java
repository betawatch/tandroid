package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda333;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.ProfileNotificationsActivity;

/* loaded from: classes5.dex */
public class ChatNotificationsPopupWrapper {
    View backItem;
    Callback callback;
    int currentAccount;
    private final View gap;
    private final boolean isProfile;
    long lastDismissTime;
    ActionBarMenuSubItem muteForLastSelected;
    private int muteForLastSelected1Time;
    ActionBarMenuSubItem muteForLastSelected2;
    private int muteForLastSelected2Time;
    ActionBarMenuSubItem muteUnmuteButton;
    ActionBarPopupWindow popupWindow;
    ActionBarMenuSubItem soundToggle;
    private final TextView topicsExceptionsTextView;
    public int type;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout windowLayout;

    public interface Callback {

        public abstract /* synthetic */ class -CC {
            public static void $default$dismiss(Callback callback) {
            }

            public static void $default$openExceptions(Callback callback) {
            }
        }

        void dismiss();

        void muteFor(int i);

        void openExceptions();

        void showCustomize();

        void toggleMute();

        void toggleSound();
    }

    public ChatNotificationsPopupWrapper(final Context context, final int i, final PopupSwipeBackLayout popupSwipeBackLayout, boolean z, boolean z2, final Callback callback, final Theme.ResourcesProvider resourcesProvider) {
        this.currentAccount = i;
        this.callback = callback;
        this.isProfile = z2;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, z ? R.drawable.popup_fixed_alert : 0, resourcesProvider) { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper.1
            Path path = new Path();

            @Override // android.view.ViewGroup
            protected boolean drawChild(Canvas canvas, View view, long j) {
                canvas.save();
                this.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                this.path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
                canvas.clipPath(this.path);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
        };
        this.windowLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        if (popupSwipeBackLayout != null) {
            ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, resourcesProvider);
            this.backItem = addItem;
            addItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PopupSwipeBackLayout.this.closeForeground();
                }
            });
        }
        ActionBarMenuSubItem addItem2 = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, resourcesProvider);
        this.soundToggle = addItem2;
        addItem2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.$r8$lambda$hdU0es5DaVL4qd0zTA5VJOOqTlk(ChatNotificationsPopupWrapper.this, callback, view);
            }
        });
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.windowLayout;
        int i2 = R.drawable.msg_mute_1h;
        int i3 = R.string.MuteFor1h;
        ActionBarMenuSubItem addItem3 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, i2, LocaleController.getString(i3), false, resourcesProvider);
        this.muteForLastSelected = addItem3;
        addItem3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.$r8$lambda$BCifHbT070kKx60ZM0FZEguxiUk(ChatNotificationsPopupWrapper.this, callback, view);
            }
        });
        ActionBarMenuSubItem addItem4 = ActionBarMenuItem.addItem(this.windowLayout, i2, LocaleController.getString(i3), false, resourcesProvider);
        this.muteForLastSelected2 = addItem4;
        addItem4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.$r8$lambda$IUt87eeObtHRh9nlOj8Lm3A_-hQ(ChatNotificationsPopupWrapper.this, callback, view);
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.$r8$lambda$PEbOpDurCCRYUl-xQxtL_WRuezo(ChatNotificationsPopupWrapper.this, context, resourcesProvider, i, callback, view);
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.$r8$lambda$ybt8tZUW07bes1IVqFi8k5NWQ3U(ChatNotificationsPopupWrapper.this, callback, view);
            }
        });
        ActionBarMenuSubItem addItem5 = ActionBarMenuItem.addItem(this.windowLayout, 0, "", false, resourcesProvider);
        this.muteUnmuteButton = addItem5;
        addItem5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.$r8$lambda$TeJuG4RmFiN6mblwxCj699X3MFI(ChatNotificationsPopupWrapper.this, callback, view);
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.gap = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
        this.windowLayout.addView((View) frameLayout, LayoutHelper.createLinear(-1, 8));
        TextView textView = new TextView(context);
        this.topicsExceptionsTextView = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
        int i4 = R.id.fit_width_tag;
        frameLayout.setTag(i4, 1);
        textView.setTag(i4, 1);
        this.windowLayout.addView((View) textView, LayoutHelper.createLinear(-2, -2));
        textView.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider), 0, 6));
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.$r8$lambda$U4PfluN4GyVVrcQPg3HKYf3ZkvA(ChatNotificationsPopupWrapper.this, callback, view);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$hdU0es5DaVL4qd0zTA5VJOOqTlk(ChatNotificationsPopupWrapper chatNotificationsPopupWrapper, Callback callback, View view) {
        chatNotificationsPopupWrapper.dismiss();
        callback.toggleSound();
    }

    public static /* synthetic */ void $r8$lambda$BCifHbT070kKx60ZM0FZEguxiUk(ChatNotificationsPopupWrapper chatNotificationsPopupWrapper, Callback callback, View view) {
        chatNotificationsPopupWrapper.dismiss();
        callback.muteFor(chatNotificationsPopupWrapper.muteForLastSelected1Time);
    }

    public static /* synthetic */ void $r8$lambda$IUt87eeObtHRh9nlOj8Lm3A_-hQ(ChatNotificationsPopupWrapper chatNotificationsPopupWrapper, Callback callback, View view) {
        chatNotificationsPopupWrapper.dismiss();
        callback.muteFor(chatNotificationsPopupWrapper.muteForLastSelected2Time);
    }

    public static /* synthetic */ void $r8$lambda$PEbOpDurCCRYUl-xQxtL_WRuezo(ChatNotificationsPopupWrapper chatNotificationsPopupWrapper, Context context, Theme.ResourcesProvider resourcesProvider, final int i, final Callback callback, View view) {
        chatNotificationsPopupWrapper.dismiss();
        AlertsCreator.createMuteForPickerDialog(context, resourcesProvider, new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda10
            @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
            public final void didSelectDate(boolean z, int i2, int i3) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatNotificationsPopupWrapper.$r8$lambda$jhiS2GRG2Zdjm9uB5Jr-zKUjxx0(i2, r2, r3);
                    }
                }, 16L);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$jhiS2GRG2Zdjm9uB5Jr-zKUjxx0(int i, int i2, Callback callback) {
        if (i != 0) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i2);
            notificationsSettings.edit().putInt("last_selected_mute_until_time", i).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
        }
        callback.muteFor(i);
    }

    public static /* synthetic */ void $r8$lambda$ybt8tZUW07bes1IVqFi8k5NWQ3U(ChatNotificationsPopupWrapper chatNotificationsPopupWrapper, Callback callback, View view) {
        chatNotificationsPopupWrapper.dismiss();
        callback.showCustomize();
    }

    public static /* synthetic */ void $r8$lambda$TeJuG4RmFiN6mblwxCj699X3MFI(ChatNotificationsPopupWrapper chatNotificationsPopupWrapper, final Callback callback, View view) {
        chatNotificationsPopupWrapper.dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                ChatNotificationsPopupWrapper.Callback.this.toggleMute();
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$U4PfluN4GyVVrcQPg3HKYf3ZkvA(ChatNotificationsPopupWrapper chatNotificationsPopupWrapper, Callback callback, View view) {
        if (callback != null) {
            chatNotificationsPopupWrapper.getClass();
            callback.openExceptions();
        }
        chatNotificationsPopupWrapper.dismiss();
    }

    private void dismiss() {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
            this.popupWindow.dismiss();
        }
        this.callback.dismiss();
        this.lastDismissTime = System.currentTimeMillis();
    }

    public void update(final long j, final long j2, final HashSet hashSet) {
        int i;
        int i2;
        int i3;
        if (System.currentTimeMillis() - this.lastDismissTime < 200) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatNotificationsPopupWrapper.this.update(j, j2, hashSet);
                }
            });
            return;
        }
        boolean isDialogMuted = MessagesController.getInstance(this.currentAccount).isDialogMuted(j, j2);
        if (isDialogMuted) {
            this.muteUnmuteButton.setTextAndIcon(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute);
            i = Theme.getColor(Theme.key_windowBackgroundWhiteGreenText2);
            this.soundToggle.setVisibility(8);
        } else {
            this.muteUnmuteButton.setTextAndIcon(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute);
            int color = Theme.getColor(Theme.key_text_RedBold);
            this.soundToggle.setVisibility(0);
            if (MessagesController.getInstance(this.currentAccount).isDialogNotificationsSoundEnabled(j, j2)) {
                this.soundToggle.setTextAndIcon(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off);
            } else {
                this.soundToggle.setTextAndIcon(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on);
            }
            i = color;
        }
        if (this.type == 1) {
            this.backItem.setVisibility(8);
        }
        if (isDialogMuted || this.type == 1) {
            i2 = 0;
            i3 = 0;
        } else {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
            i3 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i2 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        }
        if (i3 != 0) {
            this.muteForLastSelected1Time = i3;
            this.muteForLastSelected.setVisibility(0);
            this.muteForLastSelected.getImageView().setImageDrawable(TimerDrawable.getTtlIcon(i3));
            this.muteForLastSelected.setText(formatMuteForTime(i3));
        } else {
            this.muteForLastSelected.setVisibility(8);
        }
        if (i2 != 0) {
            this.muteForLastSelected2Time = i2;
            this.muteForLastSelected2.setVisibility(0);
            this.muteForLastSelected2.getImageView().setImageDrawable(TimerDrawable.getTtlIcon(i2));
            this.muteForLastSelected2.setText(formatMuteForTime(i2));
        } else {
            this.muteForLastSelected2.setVisibility(8);
        }
        this.muteUnmuteButton.setColors(i, i);
        this.muteUnmuteButton.setSelectorColor(Theme.multAlpha(i, 0.1f));
        if (hashSet == null || hashSet.isEmpty()) {
            this.gap.setVisibility(8);
            this.topicsExceptionsTextView.setVisibility(8);
        } else {
            this.gap.setVisibility(0);
            this.topicsExceptionsTextView.setVisibility(0);
            this.topicsExceptionsTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), Theme.key_windowBackgroundWhiteBlueText, 1, null));
        }
    }

    private String formatMuteForTime(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 86400;
        int i3 = i - (86400 * i2);
        int i4 = i3 / 3600;
        int i5 = (i3 - (i4 * 3600)) / 60;
        if (i2 != 0) {
            sb.append(i2);
            sb.append(LocaleController.getString(R.string.SecretChatTimerDays));
        }
        if (i4 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i4);
            sb.append(LocaleController.getString(R.string.SecretChatTimerHours));
        }
        if (i5 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i5);
            sb.append(LocaleController.getString(R.string.SecretChatTimerMinutes));
        }
        return LocaleController.formatString("MuteForButton", R.string.MuteForButton, sb.toString());
    }

    public void showAsOptions(BaseFragment baseFragment, View view, float f, float f2, boolean z) {
        float measuredWidth;
        float measuredHeight;
        if (baseFragment == null || baseFragment.getFragmentView() == null) {
            return;
        }
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(this.windowLayout, -2, -2);
        this.popupWindow = actionBarPopupWindow;
        actionBarPopupWindow.setPauseNotifications(true);
        this.popupWindow.setDismissAnimationDuration(NotificationCenter.starGiveawayOptionsLoaded);
        this.popupWindow.setOutsideTouchable(true);
        this.popupWindow.setClippingEnabled(true);
        this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        this.popupWindow.setFocusable(true);
        this.windowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.popupWindow.setInputMethodMode(2);
        this.popupWindow.getContentView().setFocusableInTouchMode(true);
        while (view != baseFragment.getFragmentView()) {
            if (view.getParent() == null) {
                return;
            }
            f += view.getX();
            f2 += view.getY();
            view = (View) view.getParent();
        }
        if (z) {
            measuredWidth = f - AndroidUtilities.dpf2(8.0f);
            measuredHeight = AndroidUtilities.dpf2(16.0f);
        } else {
            measuredWidth = f - (this.windowLayout.getMeasuredWidth() / 2.0f);
            measuredHeight = this.windowLayout.getMeasuredHeight() / 2.0f;
        }
        this.popupWindow.showAtLocation(baseFragment.getFragmentView(), 0, (int) measuredWidth, (int) (f2 - measuredHeight));
        this.popupWindow.dimBehind();
    }

    public static ItemOptions addAsItemOptions(final BaseFragment baseFragment, final ItemOptions itemOptions, final long j, final long j2) {
        final int currentAccount = baseFragment.getCurrentAccount();
        final Theme.ResourcesProvider resourceProvider = baseFragment.getResourceProvider();
        final Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda12
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ChatNotificationsPopupWrapper.$r8$lambda$aS3nDMDQw8wnJZR5VS7dQrqJSc8(ItemOptions.this, currentAccount, j, j2, baseFragment, resourceProvider, (Integer) obj);
            }
        };
        final ItemOptions makeSwipeback = itemOptions.makeSwipeback();
        makeSwipeback.add(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda333(itemOptions));
        makeSwipeback.add(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new Runnable() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                ChatNotificationsPopupWrapper.$r8$lambda$31RerRr0yK3qaJutUXuPZrSTK8M(ItemOptions.this, currentAccount, j, j2, makeSwipeback, baseFragment, resourceProvider);
            }
        });
        final ActionBarMenuSubItem last = makeSwipeback.getLast();
        makeSwipeback.add(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new Runnable() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                AlertsCreator.createMuteForPickerDialog(ItemOptions.this.getContext(), resourceProvider, new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda18
                    @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
                    public final void didSelectDate(boolean z, int i, int i2) {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda19
                            @Override // java.lang.Runnable
                            public final void run() {
                                ChatNotificationsPopupWrapper.$r8$lambda$2E5Qdzb2TlshZLi5DNrM-yDRQJs(i, r2, r3);
                            }
                        }, 16L);
                    }
                });
            }
        });
        makeSwipeback.add(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new Runnable() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                ChatNotificationsPopupWrapper.$r8$lambda$_WHFIA39ymnz5txwO8Ws6ecXwFk(ItemOptions.this, j, j2, baseFragment, resourceProvider);
            }
        });
        makeSwipeback.add(0, "", new Runnable() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                ChatNotificationsPopupWrapper.$r8$lambda$99jwGva_EFC_FHEqFr4J7466z3Y(ItemOptions.this, currentAccount, j, j2, baseFragment, resourceProvider);
            }
        });
        final ActionBarMenuSubItem last2 = makeSwipeback.getLast();
        new Runnable() { // from class: org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                ChatNotificationsPopupWrapper.$r8$lambda$jslqYv3H4CQpj7lso-lTF0FqDk4(currentAccount, j, j2, last2, last);
            }
        }.run();
        return makeSwipeback;
    }

    public static /* synthetic */ void $r8$lambda$aS3nDMDQw8wnJZR5VS7dQrqJSc8(ItemOptions itemOptions, int i, long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, Integer num) {
        itemOptions.dismiss();
        if (num.intValue() == 0) {
            if (MessagesController.getInstance(i).isDialogMuted(j, j2)) {
                NotificationsController.getInstance(i).muteDialog(j, j2, false);
            }
            if (BulletinFactory.canShowBulletin(baseFragment)) {
                BulletinFactory.createMuteBulletin(baseFragment, 4, num.intValue(), resourcesProvider).show();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i).muteUntil(j, j2, num.intValue());
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createMuteBulletin(baseFragment, 5, num.intValue(), resourcesProvider).show();
        }
    }

    public static /* synthetic */ void $r8$lambda$31RerRr0yK3qaJutUXuPZrSTK8M(ItemOptions itemOptions, int i, long j, long j2, ItemOptions itemOptions2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        itemOptions.dismiss();
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i);
        boolean z = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(j, j2), true);
        boolean z2 = !z;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(j, j2), z2).apply();
        itemOptions2.dismiss();
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createSoundEnabledBulletin(baseFragment, z ? 1 : 0, resourcesProvider).show();
        }
    }

    public static /* synthetic */ void $r8$lambda$2E5Qdzb2TlshZLi5DNrM-yDRQJs(int i, int i2, Utilities.Callback callback) {
        if (i != 0) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i2);
            notificationsSettings.edit().putInt("last_selected_mute_until_time", i).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
        }
        callback.run(Integer.valueOf(i));
    }

    public static /* synthetic */ void $r8$lambda$_WHFIA39ymnz5txwO8Ws6ecXwFk(ItemOptions itemOptions, long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        itemOptions.dismiss();
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j);
        bundle.putLong("topic_id", j2);
        baseFragment.presentFragment(new ProfileNotificationsActivity(bundle, resourcesProvider));
    }

    public static /* synthetic */ void $r8$lambda$99jwGva_EFC_FHEqFr4J7466z3Y(ItemOptions itemOptions, int i, long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        itemOptions.dismiss();
        boolean isDialogMuted = MessagesController.getInstance(i).isDialogMuted(j, j2);
        NotificationsController.getInstance(i).muteDialog(j, j2, !isDialogMuted);
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createMuteBulletin(baseFragment, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, resourcesProvider).show();
        }
    }

    public static /* synthetic */ void $r8$lambda$jslqYv3H4CQpj7lso-lTF0FqDk4(int i, long j, long j2, ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2) {
        int i2;
        if (MessagesController.getInstance(i).isDialogMuted(j, j2)) {
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute);
            i2 = Theme.getColor(Theme.key_windowBackgroundWhiteGreenText2);
            actionBarMenuSubItem2.setVisibility(8);
        } else {
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute);
            int color = Theme.getColor(Theme.key_text_RedBold);
            actionBarMenuSubItem2.setVisibility(0);
            if (MessagesController.getInstance(i).isDialogNotificationsSoundEnabled(j, j2)) {
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off);
            } else {
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on);
            }
            i2 = color;
        }
        actionBarMenuSubItem.setColors(i2, i2);
        actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(i2, 0.1f));
    }
}
