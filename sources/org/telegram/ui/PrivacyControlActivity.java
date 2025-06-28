package org.telegram.ui;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.AffiliateProgramFragment;

/* loaded from: classes4.dex */
public class PrivacyControlActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate {
    private int alwaysShareRow;
    private TLRPC.PhotoSize avatarForRest;
    private TLRPC.Photo avatarForRestPhoto;
    private RLottieDrawable cameraDrawable;
    private boolean currentGiftIconValue;
    private boolean currentGiftLimitedValue;
    private boolean currentGiftPremiumValue;
    private boolean currentGiftUniqueValue;
    private boolean currentGiftUnlimitedValue;
    private ArrayList currentMinus;
    private int currentPhotoForRestRow;
    private ArrayList currentPlus;
    private final boolean[] currentPlusMiniapps;
    private final boolean[] currentPlusPremium;
    private boolean currentReadValue;
    private long currentStars;
    private int currentSubType;
    private int currentType;
    private int detailRow;
    private int detailRow2;
    private View doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private int everybodyRow;
    private int giftTypeLimitedRow;
    private int giftTypePremiumRow;
    private int giftTypeUniqueRow;
    private int giftTypeUnlimitedRow;
    private int giftTypesHeaderRow;
    private int giftTypesInfoRow;
    ImageUpdater imageUpdater;
    private ArrayList initialMinus;
    private ArrayList initialPlus;
    private final boolean[] initialPlusMiniapps;
    private final boolean[] initialPlusPremium;
    private int initialRulesSubType;
    private int initialRulesType;
    private long initialStars;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private CharSequence lockSpan;
    private MessageCell messageCell;
    private int messageRow;
    private int myContactsRow;
    private int neverShareRow;
    private int nobodyRow;
    private BackupImageView oldAvatarView;
    private TextCell oldPhotoCell;
    private int p2pDetailRow;
    private int p2pRow;
    private int p2pSectionRow;
    private int payRow;
    private int phoneContactsRow;
    private int phoneDetailRow;
    private int phoneEverybodyRow;
    private int phoneSectionRow;
    private int photoForRestDescriptionRow;
    private int photoForRestRow;
    private boolean prevSubtypeContacts;
    private int priceButtonRow;
    private int priceHeaderRow;
    private int priceInfoRow;
    private int priceRow;
    private int readDetailRow;
    private int readPremiumDetailRow;
    private int readPremiumRow;
    private int readRow;
    private int rowCount;
    private int rulesType;
    private int sectionRow;
    private boolean selectedGiftIconValue;
    private boolean selectedGiftLimitedValue;
    private boolean selectedGiftPremiumValue;
    private boolean selectedGiftUniqueValue;
    private boolean selectedGiftUnlimitedValue;
    private boolean selectedReadValue;
    private TextCell setAvatarCell;
    private int setBirthdayRow;
    private int shakeDp;
    private int shareDetailRow;
    private int shareSectionRow;
    private int showGiftIconInfoRow;
    private int showGiftIconRow;

    private class DiffCallback extends DiffUtil.Callback {
        SparseIntArray newPositionToItem;
        SparseIntArray oldPositionToItem;
        int oldRowCount;

        private DiffCallback() {
            this.oldPositionToItem = new SparseIntArray();
            this.newPositionToItem = new SparseIntArray();
        }

        private void put(int i, int i2, SparseIntArray sparseIntArray) {
            if (i2 >= 0) {
                sparseIntArray.put(i2, i);
            }
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            return areItemsTheSame(i, i2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            int i3 = this.oldPositionToItem.get(i, -1);
            return i3 == this.newPositionToItem.get(i2, -1) && i3 >= 0;
        }

        public void fillPositions(SparseIntArray sparseIntArray) {
            sparseIntArray.clear();
            put(1, PrivacyControlActivity.this.messageRow, sparseIntArray);
            put(2, PrivacyControlActivity.this.sectionRow, sparseIntArray);
            put(3, PrivacyControlActivity.this.everybodyRow, sparseIntArray);
            put(4, PrivacyControlActivity.this.myContactsRow, sparseIntArray);
            put(5, PrivacyControlActivity.this.nobodyRow, sparseIntArray);
            put(6, PrivacyControlActivity.this.payRow, sparseIntArray);
            put(7, PrivacyControlActivity.this.detailRow, sparseIntArray);
            put(8, PrivacyControlActivity.this.shareSectionRow, sparseIntArray);
            put(9, PrivacyControlActivity.this.alwaysShareRow, sparseIntArray);
            put(10, PrivacyControlActivity.this.neverShareRow, sparseIntArray);
            put(11, PrivacyControlActivity.this.shareDetailRow, sparseIntArray);
            put(12, PrivacyControlActivity.this.phoneSectionRow, sparseIntArray);
            put(13, PrivacyControlActivity.this.phoneEverybodyRow, sparseIntArray);
            put(14, PrivacyControlActivity.this.phoneContactsRow, sparseIntArray);
            put(15, PrivacyControlActivity.this.phoneDetailRow, sparseIntArray);
            put(16, PrivacyControlActivity.this.photoForRestRow, sparseIntArray);
            put(17, PrivacyControlActivity.this.currentPhotoForRestRow, sparseIntArray);
            put(18, PrivacyControlActivity.this.photoForRestDescriptionRow, sparseIntArray);
            put(19, PrivacyControlActivity.this.p2pSectionRow, sparseIntArray);
            put(20, PrivacyControlActivity.this.p2pRow, sparseIntArray);
            put(21, PrivacyControlActivity.this.p2pDetailRow, sparseIntArray);
            put(22, PrivacyControlActivity.this.readRow, sparseIntArray);
            put(23, PrivacyControlActivity.this.readDetailRow, sparseIntArray);
            put(24, PrivacyControlActivity.this.readPremiumRow, sparseIntArray);
            put(25, PrivacyControlActivity.this.readPremiumDetailRow, sparseIntArray);
            put(26, PrivacyControlActivity.this.priceHeaderRow, sparseIntArray);
            put(27, PrivacyControlActivity.this.priceRow, sparseIntArray);
            put(28, PrivacyControlActivity.this.priceInfoRow, sparseIntArray);
            put(29, PrivacyControlActivity.this.showGiftIconRow, sparseIntArray);
            put(30, PrivacyControlActivity.this.showGiftIconInfoRow, sparseIntArray);
            put(31, PrivacyControlActivity.this.giftTypesHeaderRow, sparseIntArray);
            put(32, PrivacyControlActivity.this.giftTypeLimitedRow, sparseIntArray);
            put(33, PrivacyControlActivity.this.giftTypeUnlimitedRow, sparseIntArray);
            put(34, PrivacyControlActivity.this.giftTypeUniqueRow, sparseIntArray);
            put(35, PrivacyControlActivity.this.giftTypePremiumRow, sparseIntArray);
            put(36, PrivacyControlActivity.this.giftTypesInfoRow, sparseIntArray);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return PrivacyControlActivity.this.rowCount;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.oldRowCount;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        private int getUsersCount(ArrayList arrayList) {
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                long longValue = ((Long) arrayList.get(i2)).longValue();
                if (longValue > 0) {
                    i++;
                } else {
                    TLRPC.Chat chat = PrivacyControlActivity.this.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null) {
                        i += chat.participants_count;
                    }
                }
            }
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$1() {
            PrivacyControlActivity.this.presentFragment(new PremiumPreviewFragment("noncontacts"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$2(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
            Bulletin createSimpleBulletin;
            String str;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                createSimpleBulletin = BulletinFactory.of(PrivacyControlActivity.this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.PrivacyBirthdaySetDone)).setDuration(5000);
            } else {
                if (userFull != null) {
                    int i = userFull.flags2;
                    userFull.flags2 = tL_birthday == null ? i & (-33) : i | 32;
                    userFull.birthday = tL_birthday;
                    PrivacyControlActivity.this.getMessagesStorage().updateUserInfo(userFull, false);
                }
                if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                    if (PrivacyControlActivity.this.getContext() != null) {
                        PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                        privacyControlActivity.showDialog(new AlertDialog.Builder(privacyControlActivity.getContext(), ((BaseFragment) PrivacyControlActivity.this).resourceProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
                        return;
                    }
                    return;
                }
                createSimpleBulletin = BulletinFactory.of(PrivacyControlActivity.this).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError));
            }
            createSimpleBulletin.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$3(final TLRPC.UserFull userFull, final TL_account.TL_birthday tL_birthday, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    PrivacyControlActivity.ListAdapter.this.lambda$onBindViewHolder$2(tLObject, userFull, tL_birthday, tL_error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$4(TL_account.TL_birthday tL_birthday) {
            TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
            updatebirthday.flags |= 1;
            updatebirthday.birthday = tL_birthday;
            final TLRPC.UserFull userFull = PrivacyControlActivity.this.getMessagesController().getUserFull(PrivacyControlActivity.this.getUserConfig().getClientUserId());
            final TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
            if (userFull != null) {
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                PrivacyControlActivity.this.getMessagesStorage().updateUserInfo(userFull, false);
            }
            PrivacyControlActivity.this.getMessagesController().invalidateContentSettings();
            PrivacyControlActivity.this.getConnectionsManager().sendRequest(updatebirthday, new RequestDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda6
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    PrivacyControlActivity.ListAdapter.this.lambda$onBindViewHolder$3(userFull, tL_birthday2, tLObject, tL_error);
                }
            }, 1024);
            MessagesController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
            NotificationCenter.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
            PrivacyControlActivity.this.updateRows(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$5() {
            PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
            privacyControlActivity.showDialog(AlertsCreator.createBirthdayPickerDialog(privacyControlActivity.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new Utilities.Callback() { // from class: org.telegram.ui.PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda5
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PrivacyControlActivity.ListAdapter.this.lambda$onBindViewHolder$4((TL_account.TL_birthday) obj);
                }
            }, null, PrivacyControlActivity.this.getResourceProvider()).create());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ CharSequence lambda$onBindViewHolder$6(Integer num, Integer num2) {
            if (num.intValue() != 0) {
                return LocaleController.formatNumber(num2.intValue(), ',');
            }
            if (PrivacyControlActivity.this.getUserConfig().isPremium()) {
                return LocaleController.formatPluralStringComma("Stars", num2.intValue());
            }
            if (PrivacyControlActivity.this.lockSpan == null) {
                SpannableString spannableString = new SpannableString("l");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
                coloredImageSpan.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                spannableString.setSpan(coloredImageSpan, 0, 1, 33);
                PrivacyControlActivity.this.lockSpan = spannableString;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(PrivacyControlActivity.this.lockSpan);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num2.intValue()));
            return spannableStringBuilder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$7(Integer num) {
            PrivacyControlActivity.this.currentStars = num.intValue();
            AndroidUtilities.updateVisibleRow(PrivacyControlActivity.this.listView, PrivacyControlActivity.this.priceInfoRow);
            PrivacyControlActivity.this.updateDoneButton();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreateViewHolder$0(View view) {
            PrivacyControlActivity.this.showDialog(new PremiumFeatureBottomSheet(PrivacyControlActivity.this, 27, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return PrivacyControlActivity.this.rowCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == PrivacyControlActivity.this.alwaysShareRow || i == PrivacyControlActivity.this.neverShareRow || i == PrivacyControlActivity.this.p2pRow || i == PrivacyControlActivity.this.readPremiumRow) {
                return 0;
            }
            if (i == PrivacyControlActivity.this.shareDetailRow || i == PrivacyControlActivity.this.detailRow || i == PrivacyControlActivity.this.detailRow2 || i == PrivacyControlActivity.this.priceInfoRow || i == PrivacyControlActivity.this.p2pDetailRow || i == PrivacyControlActivity.this.photoForRestDescriptionRow || i == PrivacyControlActivity.this.readDetailRow || i == PrivacyControlActivity.this.readPremiumDetailRow || i == PrivacyControlActivity.this.setBirthdayRow || i == PrivacyControlActivity.this.showGiftIconInfoRow || i == PrivacyControlActivity.this.giftTypesInfoRow) {
                return 1;
            }
            if (i == PrivacyControlActivity.this.sectionRow || i == PrivacyControlActivity.this.priceHeaderRow || i == PrivacyControlActivity.this.shareSectionRow || i == PrivacyControlActivity.this.p2pSectionRow || i == PrivacyControlActivity.this.phoneSectionRow || i == PrivacyControlActivity.this.giftTypesHeaderRow) {
                return 2;
            }
            if (i == PrivacyControlActivity.this.everybodyRow || i == PrivacyControlActivity.this.myContactsRow || i == PrivacyControlActivity.this.nobodyRow || i == PrivacyControlActivity.this.payRow || i == PrivacyControlActivity.this.phoneEverybodyRow || i == PrivacyControlActivity.this.phoneContactsRow) {
                return 3;
            }
            if (i == PrivacyControlActivity.this.messageRow) {
                return 4;
            }
            if (i == PrivacyControlActivity.this.phoneDetailRow) {
                return 5;
            }
            if (i == PrivacyControlActivity.this.photoForRestRow) {
                return 6;
            }
            if (i == PrivacyControlActivity.this.currentPhotoForRestRow) {
                return 7;
            }
            if (i == PrivacyControlActivity.this.readRow || i == PrivacyControlActivity.this.showGiftIconRow || i == PrivacyControlActivity.this.giftTypeUniqueRow || i == PrivacyControlActivity.this.giftTypePremiumRow || i == PrivacyControlActivity.this.giftTypeUnlimitedRow || i == PrivacyControlActivity.this.giftTypeLimitedRow) {
                return 8;
            }
            if (i == PrivacyControlActivity.this.priceRow) {
                return 9;
            }
            return i == PrivacyControlActivity.this.priceButtonRow ? 10 : 0;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return (adapterPosition == PrivacyControlActivity.this.p2pRow && !ContactsController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getLoadingPrivacyInfo(3)) || adapterPosition == PrivacyControlActivity.this.currentPhotoForRestRow || adapterPosition == PrivacyControlActivity.this.photoForRestDescriptionRow || adapterPosition == PrivacyControlActivity.this.photoForRestRow || adapterPosition == PrivacyControlActivity.this.readRow || adapterPosition == PrivacyControlActivity.this.showGiftIconRow || adapterPosition == PrivacyControlActivity.this.readPremiumRow || adapterPosition == PrivacyControlActivity.this.giftTypeUniqueRow || adapterPosition == PrivacyControlActivity.this.giftTypePremiumRow || adapterPosition == PrivacyControlActivity.this.giftTypeLimitedRow || adapterPosition == PrivacyControlActivity.this.giftTypeUnlimitedRow || (!(PrivacyControlActivity.this.rulesType == 12 && PrivacyControlActivity.this.areAllStarGiftsDisabled()) && (adapterPosition == PrivacyControlActivity.this.nobodyRow || adapterPosition == PrivacyControlActivity.this.myContactsRow || adapterPosition == PrivacyControlActivity.this.payRow || adapterPosition == PrivacyControlActivity.this.everybodyRow || adapterPosition == PrivacyControlActivity.this.neverShareRow || adapterPosition == PrivacyControlActivity.this.alwaysShareRow));
        }

        /* JADX WARN: Code restructure failed: missing block: B:105:0x021e, code lost:
        
            if (r16.this$0.currentType == 1) goto L116;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x022d, code lost:
        
            if (r16.this$0.currentType == 1) goto L116;
         */
        /* JADX WARN: Code restructure failed: missing block: B:193:0x0387, code lost:
        
            if (r16.this$0.getUserConfig().isPremium() != false) goto L180;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (r16.this$0.currentSubType == 1) goto L116;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0232, code lost:
        
            r3 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:247:0x054e, code lost:
        
            if (r16.this$0.rulesType != 0) goto L187;
         */
        /* JADX WARN: Code restructure failed: missing block: B:294:0x0587, code lost:
        
            if (r16.this$0.readPremiumDetailRow == (-1)) goto L187;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x022f, code lost:
        
            r3 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:355:0x0756, code lost:
        
            if (r16.this$0.neverShareRow != (-1)) goto L365;
         */
        /* JADX WARN: Code restructure failed: missing block: B:356:0x0768, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:358:0x0766, code lost:
        
            if (r16.this$0.neverShareRow != (-1)) goto L365;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
        
            if (r16.this$0.currentSubType == 0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
        
            r1.setText(r2, r6, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:424:0x0921, code lost:
        
            if (r16.this$0.selectedGiftUnlimitedValue != false) goto L449;
         */
        /* JADX WARN: Code restructure failed: missing block: B:425:0x09a8, code lost:
        
            r6 = org.telegram.messenger.R.drawable.permission_locked;
         */
        /* JADX WARN: Code restructure failed: missing block: B:433:0x094e, code lost:
        
            if (r16.this$0.selectedGiftLimitedValue != false) goto L449;
         */
        /* JADX WARN: Code restructure failed: missing block: B:439:0x097a, code lost:
        
            if (r16.this$0.selectedGiftUniqueValue != false) goto L449;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
        
            if (r16.this$0.currentType == 0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:445:0x09a6, code lost:
        
            if (r16.this$0.selectedGiftPremiumValue != false) goto L449;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        
            if (r16.this$0.currentType == 0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
        
            if (r16.this$0.payRow == (-1)) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0155, code lost:
        
            if (r16.this$0.payRow == (-1)) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0177, code lost:
        
            if (r16.this$0.payRow == (-1)) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x01be, code lost:
        
            if (r16.this$0.currentType == 3) goto L116;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:178:0x063d  */
        /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:246:0x0548  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            boolean z;
            String string2;
            int i2;
            CharSequence formatSpannable;
            CharSequence string3;
            int i3;
            int i4;
            CharSequence replaceTags;
            int i5;
            String str;
            int i6;
            String string4;
            boolean z2;
            String string5;
            int itemViewType = viewHolder.getItemViewType();
            int i7 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z3 = false;
            r6 = false;
            r6 = false;
            boolean z4 = false;
            r6 = 0;
            int i8 = 0;
            r6 = false;
            r6 = false;
            boolean z5 = false;
            i7 = 0;
            i7 = 0;
            i7 = 0;
            i7 = 0;
            i7 = 0;
            i7 = 0;
            i7 = 0;
            if (itemViewType == 8) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                textCheckCell.setCheckBoxIcon(0);
                if (i == PrivacyControlActivity.this.readRow) {
                    string = LocaleController.getString(R.string.HideReadTime);
                    z = PrivacyControlActivity.this.selectedReadValue;
                } else {
                    if (i != PrivacyControlActivity.this.showGiftIconRow) {
                        if (i == PrivacyControlActivity.this.giftTypeUnlimitedRow) {
                            textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeUnlimited), PrivacyControlActivity.this.selectedGiftUnlimitedValue, true);
                            if (!PrivacyControlActivity.this.getUserConfig().isPremium()) {
                            }
                            textCheckCell.setCheckBoxIcon(i7);
                            return;
                        }
                        if (i == PrivacyControlActivity.this.giftTypeLimitedRow) {
                            textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeLimited), PrivacyControlActivity.this.selectedGiftLimitedValue, true);
                            if (!PrivacyControlActivity.this.getUserConfig().isPremium()) {
                            }
                            textCheckCell.setCheckBoxIcon(i7);
                            return;
                        } else if (i == PrivacyControlActivity.this.giftTypeUniqueRow) {
                            textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeUnique), PrivacyControlActivity.this.selectedGiftUniqueValue, true);
                            if (!PrivacyControlActivity.this.getUserConfig().isPremium()) {
                            }
                            textCheckCell.setCheckBoxIcon(i7);
                            return;
                        } else {
                            if (i == PrivacyControlActivity.this.giftTypePremiumRow) {
                                textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypePremium), PrivacyControlActivity.this.selectedGiftPremiumValue, false);
                                if (!PrivacyControlActivity.this.getUserConfig().isPremium()) {
                                }
                                textCheckCell.setCheckBoxIcon(i7);
                                return;
                            }
                            return;
                        }
                    }
                    string = LocaleController.getString(R.string.PrivacyGiftsShowIcon);
                    z = PrivacyControlActivity.this.selectedGiftIconValue;
                }
                textCheckCell.setTextAndCheck(string, z, false);
                return;
            }
            if (itemViewType == 9) {
                SlideIntChooseView slideIntChooseView = (SlideIntChooseView) viewHolder.itemView;
                if (i == PrivacyControlActivity.this.priceRow) {
                    slideIntChooseView.set((int) Utilities.clamp(PrivacyControlActivity.this.currentStars, PrivacyControlActivity.this.getMessagesController().starsPaidMessageAmountMax, 1L), SlideIntChooseView.Options.make(1, SlideIntChooseView.cut(new int[]{1, 10, 50, 100, NotificationCenter.smsJobStatusUpdate, 250, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000}, (int) PrivacyControlActivity.this.getMessagesController().starsPaidMessageAmountMax), 20, new Utilities.Callback2Return() { // from class: org.telegram.ui.PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda3
                        @Override // org.telegram.messenger.Utilities.Callback2Return
                        public final Object run(Object obj, Object obj2) {
                            CharSequence lambda$onBindViewHolder$6;
                            lambda$onBindViewHolder$6 = PrivacyControlActivity.ListAdapter.this.lambda$onBindViewHolder$6((Integer) obj, (Integer) obj2);
                            return lambda$onBindViewHolder$6;
                        }
                    }), new Utilities.Callback() { // from class: org.telegram.ui.PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda4
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            PrivacyControlActivity.ListAdapter.this.lambda$onBindViewHolder$7((Integer) obj);
                        }
                    });
                    return;
                }
                return;
            }
            if (itemViewType == 0) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                textSettingsCell.setTextColor(PrivacyControlActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                if (i == PrivacyControlActivity.this.alwaysShareRow) {
                    String formatPluralString = PrivacyControlActivity.this.currentPlus.size() != 0 ? LocaleController.formatPluralString("Users", getUsersCount(PrivacyControlActivity.this.currentPlus), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
                    if (PrivacyControlActivity.this.currentPlusPremium[PrivacyControlActivity.this.currentType == 2 ? (char) 0 : (char) 1]) {
                        formatPluralString = (PrivacyControlActivity.this.currentPlus == null || PrivacyControlActivity.this.currentPlus.isEmpty()) ? LocaleController.formatString(R.string.PrivacyPremium, new Object[0]) : LocaleController.formatString(R.string.PrivacyPremiumAnd, formatPluralString);
                    }
                    if (PrivacyControlActivity.this.rulesType != 10 && PrivacyControlActivity.this.currentPlusMiniapps[PrivacyControlActivity.this.currentType] && PrivacyControlActivity.this.currentType != 0) {
                        formatPluralString = (PrivacyControlActivity.this.currentPlus == null || PrivacyControlActivity.this.currentPlus.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, formatPluralString);
                    }
                    if (PrivacyControlActivity.this.rulesType == 10) {
                        string2 = LocaleController.getString(R.string.PrivateMessagesExceptions);
                    } else if (PrivacyControlActivity.this.rulesType == 0 || PrivacyControlActivity.this.rulesType == 4 || PrivacyControlActivity.this.rulesType == 9) {
                        string2 = LocaleController.getString(R.string.AlwaysShareWith);
                    } else {
                        string2 = LocaleController.getString(R.string.AlwaysAllow);
                    }
                    textSettingsCell.setTextAndValue(string2, formatPluralString, z5);
                    if (PrivacyControlActivity.this.rulesType != 12) {
                        return;
                    }
                } else {
                    if (i != PrivacyControlActivity.this.neverShareRow) {
                        if (i == PrivacyControlActivity.this.p2pRow) {
                            textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyP2P2), ContactsController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getLoadingPrivacyInfo(3) ? LocaleController.getString(R.string.Loading) : PrivacySettingsActivity.formatRulesString(PrivacyControlActivity.this.getAccountInstance(), 3), false);
                            return;
                        } else {
                            if (i == PrivacyControlActivity.this.readPremiumRow) {
                                textSettingsCell.setText(LocaleController.getString(PrivacyControlActivity.this.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumForPremium : R.string.PrivacyLastSeenPremium), false);
                                textSettingsCell.setTextColor(PrivacyControlActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText));
                                return;
                            }
                            return;
                        }
                    }
                    String formatPluralString2 = PrivacyControlActivity.this.currentMinus.size() != 0 ? LocaleController.formatPluralString("Users", getUsersCount(PrivacyControlActivity.this.currentMinus), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
                    if (PrivacyControlActivity.this.currentPlusMiniapps[PrivacyControlActivity.this.currentType] && PrivacyControlActivity.this.currentType == 0) {
                        formatPluralString2 = (PrivacyControlActivity.this.currentMinus == null || PrivacyControlActivity.this.currentMinus.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, formatPluralString2);
                    }
                    textSettingsCell.setTextAndValue(LocaleController.getString((PrivacyControlActivity.this.rulesType == 0 || PrivacyControlActivity.this.rulesType == 4 || PrivacyControlActivity.this.rulesType == 9) ? R.string.NeverShareWith : R.string.NeverAllow), formatPluralString2, false);
                    if (PrivacyControlActivity.this.rulesType != 12) {
                        return;
                    }
                }
                textSettingsCell.setEnabled(!PrivacyControlActivity.this.areAllStarGiftsDisabled());
                return;
            }
            if (itemViewType != 1) {
                if (itemViewType == 2) {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == PrivacyControlActivity.this.sectionRow) {
                        i6 = PrivacyControlActivity.this.rulesType == 6 ? R.string.PrivacyPhoneTitle : PrivacyControlActivity.this.rulesType == 5 ? R.string.PrivacyForwardsTitle : PrivacyControlActivity.this.rulesType == 4 ? R.string.PrivacyProfilePhotoTitle : PrivacyControlActivity.this.rulesType == 9 ? R.string.PrivacyBioTitle : PrivacyControlActivity.this.rulesType == 3 ? R.string.P2PEnabledWith : PrivacyControlActivity.this.rulesType == 2 ? R.string.WhoCanCallMe : PrivacyControlActivity.this.rulesType == 1 ? R.string.WhoCanAddMe : PrivacyControlActivity.this.rulesType == 8 ? R.string.PrivacyVoiceMessagesTitle : PrivacyControlActivity.this.rulesType == 10 ? R.string.PrivacyMessagesTitle : PrivacyControlActivity.this.rulesType == 11 ? R.string.PrivacyBirthdayTitle : PrivacyControlActivity.this.rulesType == 12 ? R.string.PrivacyGiftsTitle : R.string.LastSeenTitle;
                    } else if (i == PrivacyControlActivity.this.shareSectionRow) {
                        i6 = PrivacyControlActivity.this.rulesType == 10 ? R.string.PrivateMessagesExceptionsHeader : R.string.AddExceptions;
                    } else if (i == PrivacyControlActivity.this.p2pSectionRow) {
                        i6 = R.string.PrivacyP2PHeader;
                    } else if (i == PrivacyControlActivity.this.phoneSectionRow) {
                        i6 = R.string.PrivacyPhoneTitle2;
                    } else if (i == PrivacyControlActivity.this.priceHeaderRow) {
                        i6 = R.string.PrivateMessagesPriceHeader;
                    } else if (i != PrivacyControlActivity.this.giftTypesHeaderRow) {
                        return;
                    } else {
                        i6 = R.string.PrivacyGiftsTypeHeader;
                    }
                    headerCell.setText(LocaleController.getString(i6));
                    return;
                }
                if (itemViewType != 3) {
                    return;
                }
                RadioCell radioCell = (RadioCell) viewHolder.itemView;
                radioCell.setRadioIcon(null);
                if (i == PrivacyControlActivity.this.everybodyRow || i == PrivacyControlActivity.this.myContactsRow || i == PrivacyControlActivity.this.nobodyRow || i == PrivacyControlActivity.this.payRow) {
                    if (i == PrivacyControlActivity.this.everybodyRow) {
                        if (PrivacyControlActivity.this.rulesType == 3) {
                            string5 = LocaleController.getString(R.string.P2PEverybody);
                        } else {
                            string5 = LocaleController.getString(R.string.LastSeenEverybody);
                        }
                    } else if (i == PrivacyControlActivity.this.myContactsRow) {
                        if ((PrivacyControlActivity.this.rulesType == 8 && !PrivacyControlActivity.this.getUserConfig().isPremium()) || (PrivacyControlActivity.this.rulesType == 10 && !PrivacyControlActivity.this.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !PrivacyControlActivity.this.getUserConfig().isPremium())) {
                            radioCell.setRadioIcon(PrivacyControlActivity.this.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                        }
                        if (PrivacyControlActivity.this.rulesType == 3) {
                            string4 = LocaleController.getString(R.string.P2PContacts);
                            z2 = PrivacyControlActivity.this.currentType == 2;
                            if (PrivacyControlActivity.this.nobodyRow == -1) {
                            }
                            z4 = true;
                            radioCell.setText(string4, z2, z4);
                        } else if (PrivacyControlActivity.this.rulesType == 10) {
                            string4 = LocaleController.getString(R.string.PrivacyMessagesContactsAndPremium);
                            z2 = PrivacyControlActivity.this.currentType == 2;
                            if (PrivacyControlActivity.this.nobodyRow == -1) {
                            }
                            z4 = true;
                            radioCell.setText(string4, z2, z4);
                        } else {
                            string4 = LocaleController.getString(R.string.LastSeenContacts);
                            z2 = PrivacyControlActivity.this.currentType == 2;
                            if (PrivacyControlActivity.this.nobodyRow == -1) {
                            }
                            z4 = true;
                            radioCell.setText(string4, z2, z4);
                        }
                    } else {
                        if (i == PrivacyControlActivity.this.payRow) {
                            if (PrivacyControlActivity.this.rulesType == 10 && !PrivacyControlActivity.this.getUserConfig().isPremium()) {
                                radioCell.setRadioIcon(PrivacyControlActivity.this.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                            }
                            string4 = LocaleController.getString(R.string.PrivateMessagesChargePrice);
                        } else {
                            if ((PrivacyControlActivity.this.rulesType == 8 && !PrivacyControlActivity.this.getUserConfig().isPremium()) || (PrivacyControlActivity.this.rulesType == 10 && !PrivacyControlActivity.this.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !PrivacyControlActivity.this.getUserConfig().isPremium())) {
                                radioCell.setRadioIcon(PrivacyControlActivity.this.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                            }
                            if (PrivacyControlActivity.this.rulesType == 3) {
                                string4 = LocaleController.getString(R.string.P2PNobody);
                            } else {
                                string4 = LocaleController.getString(R.string.LastSeenNobody);
                            }
                        }
                        radioCell.setText(string4, z2, z4);
                    }
                } else if (i == PrivacyControlActivity.this.phoneContactsRow) {
                    string4 = LocaleController.getString(R.string.LastSeenContacts);
                } else if (i == PrivacyControlActivity.this.phoneEverybodyRow) {
                    string5 = LocaleController.getString(R.string.LastSeenEverybody);
                }
                if (PrivacyControlActivity.this.rulesType == 12) {
                    radioCell.setEnabled(!PrivacyControlActivity.this.areAllStarGiftsDisabled(), null);
                    return;
                }
                return;
            }
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
            if (i == PrivacyControlActivity.this.detailRow2) {
                formatSpannable = LocaleController.getString(R.string.PrivateMessagesChargePriceInfo);
            } else {
                if (i != PrivacyControlActivity.this.detailRow || PrivacyControlActivity.this.rulesType != 10) {
                    if (i == PrivacyControlActivity.this.detailRow && PrivacyControlActivity.this.rulesType == 8) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo));
                    } else if (i == PrivacyControlActivity.this.setBirthdayRow) {
                        formatSpannable = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyBirthdaySet), new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda2
                            @Override // java.lang.Runnable
                            public final void run() {
                                PrivacyControlActivity.ListAdapter.this.lambda$onBindViewHolder$5();
                            }
                        }), true);
                    } else {
                        if (i == PrivacyControlActivity.this.detailRow) {
                            if (PrivacyControlActivity.this.rulesType == 6) {
                                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                                if (privacyControlActivity.prevSubtypeContacts = privacyControlActivity.currentType == 1 && PrivacyControlActivity.this.currentSubType == 1) {
                                    i5 = R.string.PrivacyPhoneInfo3;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    final String format = String.format(Locale.ENGLISH, "https://t.me/+%s", PrivacyControlActivity.this.getUserConfig().getClientPhone());
                                    SpannableString spannableString = new SpannableString(format);
                                    spannableString.setSpan(new ClickableSpan() { // from class: org.telegram.ui.PrivacyControlActivity.ListAdapter.2
                                        @Override // android.text.style.ClickableSpan
                                        public void onClick(View view) {
                                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", format));
                                            BulletinFactory.of(PrivacyControlActivity.this).createCopyLinkBulletin(LocaleController.getString(R.string.LinkCopied), PrivacyControlActivity.this.getResourceProvider()).show();
                                        }
                                    }, 0, format.length(), 33);
                                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo)).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo4)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                    str = spannableStringBuilder;
                                    textInfoPrivacyCell.setText(str);
                                }
                            } else {
                                i5 = PrivacyControlActivity.this.rulesType == 5 ? R.string.PrivacyForwardsInfo : PrivacyControlActivity.this.rulesType == 4 ? R.string.PrivacyProfilePhotoInfo : PrivacyControlActivity.this.rulesType == 9 ? R.string.PrivacyBioInfo3 : PrivacyControlActivity.this.rulesType == 11 ? R.string.PrivacyBirthdayInfo : PrivacyControlActivity.this.rulesType == 12 ? R.string.PrivacyGiftsInfo : PrivacyControlActivity.this.rulesType == 3 ? R.string.PrivacyCallsP2PHelp : PrivacyControlActivity.this.rulesType == 2 ? R.string.WhoCanCallMeInfo : PrivacyControlActivity.this.rulesType == 1 ? R.string.WhoCanAddMeInfo : R.string.CustomHelp;
                            }
                            str = LocaleController.getString(i5);
                            textInfoPrivacyCell.setText(str);
                        } else if (i == PrivacyControlActivity.this.shareDetailRow) {
                            if (PrivacyControlActivity.this.rulesType == 6) {
                                i3 = R.string.PrivacyPhoneInfo2;
                            } else if (PrivacyControlActivity.this.rulesType == 5) {
                                i3 = R.string.PrivacyForwardsInfo2;
                            } else if (PrivacyControlActivity.this.rulesType == 4) {
                                if (PrivacyControlActivity.this.currentType == 2) {
                                    i4 = R.string.PrivacyProfilePhotoInfo5;
                                } else if (PrivacyControlActivity.this.currentType == 0) {
                                    i4 = R.string.PrivacyProfilePhotoInfo3;
                                } else {
                                    i3 = R.string.PrivacyProfilePhotoInfo4;
                                }
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i4));
                                textInfoPrivacyCell.setText(replaceTags);
                                if (PrivacyControlActivity.this.rulesType != 2) {
                                }
                            } else {
                                i3 = PrivacyControlActivity.this.rulesType == 3 ? R.string.CustomP2PInfo : PrivacyControlActivity.this.rulesType == 9 ? R.string.PrivacyBioInfo : PrivacyControlActivity.this.rulesType == 11 ? R.string.PrivacyBirthdayInfo3 : PrivacyControlActivity.this.rulesType == 2 ? R.string.CustomCallInfo : PrivacyControlActivity.this.rulesType == 1 ? R.string.CustomShareInfo : PrivacyControlActivity.this.rulesType == 12 ? R.string.CustomShareGiftsInfo : PrivacyControlActivity.this.rulesType == 8 ? R.string.PrivacyVoiceMessagesInfo2 : PrivacyControlActivity.this.rulesType == 10 ? R.string.PrivateMessagesExceptionsInfo : R.string.CustomShareSettingsHelp;
                            }
                            replaceTags = LocaleController.getString(i3);
                            textInfoPrivacyCell.setText(replaceTags);
                            if (PrivacyControlActivity.this.rulesType != 2) {
                            }
                        } else {
                            if (i != PrivacyControlActivity.this.p2pDetailRow) {
                                if (i == PrivacyControlActivity.this.photoForRestDescriptionRow) {
                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PhotoForRestDescription));
                                } else if (i == PrivacyControlActivity.this.readDetailRow) {
                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.HideReadTimeInfo));
                                } else {
                                    if (i == PrivacyControlActivity.this.readPremiumDetailRow) {
                                        i2 = PrivacyControlActivity.this.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumInfoForPremium : R.string.PrivacyLastSeenPremiumInfo;
                                    } else if (i == PrivacyControlActivity.this.priceInfoRow) {
                                        double d = PrivacyControlActivity.this.currentStars * (PrivacyControlActivity.this.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f);
                                        Double.isNaN(d);
                                        double d2 = PrivacyControlActivity.this.getMessagesController().starsUsdWithdrawRate1000;
                                        Double.isNaN(d2);
                                        double d3 = (int) ((d / 1000.0d) * d2);
                                        Double.isNaN(d3);
                                        formatSpannable = LocaleController.formatString(R.string.PrivateMessagesPriceInfo, AffiliateProgramFragment.percents(PrivacyControlActivity.this.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(d3 / 100.0d));
                                    } else if (i == PrivacyControlActivity.this.showGiftIconInfoRow) {
                                        SpannableString spannableString2 = new SpannableString(ImageLoader.AUTOPLAY_FILTER);
                                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_input_gift);
                                        coloredImageSpan.setScale(0.583f, 0.583f);
                                        spannableString2.setSpan(coloredImageSpan, 0, 1, 33);
                                        formatSpannable = LocaleController.formatSpannable(R.string.PrivacyGiftsShowIconInfo, spannableString2);
                                    } else if (i == PrivacyControlActivity.this.giftTypesInfoRow) {
                                        i2 = R.string.PrivacyGiftsTypeInfo;
                                    }
                                    string3 = LocaleController.getString(i2);
                                }
                            }
                            i8 = R.drawable.greydivider_bottom;
                        }
                        i8 = R.drawable.greydivider;
                    }
                    if (i8 != 0) {
                        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, i8, Theme.key_windowBackgroundGrayShadow));
                        combinedDrawable.setFullsize(true);
                        textInfoPrivacyCell.setBackgroundDrawable(combinedDrawable);
                        return;
                    }
                    return;
                }
                string3 = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyMessagesInfo), new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrivacyControlActivity.ListAdapter.this.lambda$onBindViewHolder$1();
                    }
                });
                textInfoPrivacyCell.setText(string3);
                i8 = R.drawable.greydivider_bottom;
                if (i8 != 0) {
                }
            }
            textInfoPrivacyCell.setText(formatSpannable);
            i8 = R.drawable.greydivider;
            if (i8 != 0) {
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            BackupImageView backupImageView;
            ImageLocation forLocal;
            int i2;
            FrameLayout frameLayout;
            View view;
            switch (i) {
                case 0:
                    TextSettingsCell textSettingsCell = new TextSettingsCell(this.mContext);
                    textSettingsCell.setCanDisable(true);
                    frameLayout = textSettingsCell;
                    frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    view = frameLayout;
                    break;
                case 1:
                    view = new TextInfoPrivacyCell(this.mContext);
                    break;
                case 2:
                    frameLayout = new HeaderCell(this.mContext);
                    frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    view = frameLayout;
                    break;
                case 3:
                    frameLayout = new RadioCell(this.mContext);
                    frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    view = frameLayout;
                    break;
                case 4:
                    view = PrivacyControlActivity.this.messageCell;
                    break;
                case 5:
                default:
                    View shadowSectionCell = new ShadowSectionCell(this.mContext);
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    combinedDrawable.setFullsize(true);
                    shadowSectionCell.setBackgroundDrawable(combinedDrawable);
                    view = shadowSectionCell;
                    break;
                case 6:
                    PrivacyControlActivity.this.setAvatarCell = new TextCell(PrivacyControlActivity.this.getContext());
                    if (PrivacyControlActivity.this.avatarForRest == null) {
                        PrivacyControlActivity.this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), R.drawable.msg_addphoto, false);
                    } else {
                        PrivacyControlActivity.this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), R.drawable.msg_addphoto, true);
                    }
                    PrivacyControlActivity.this.setAvatarCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    PrivacyControlActivity.this.setAvatarCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                    int i3 = R.raw.camera_outline;
                    privacyControlActivity.cameraDrawable = new RLottieDrawable(i3, "" + i3, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    PrivacyControlActivity.this.setAvatarCell.imageView.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
                    PrivacyControlActivity.this.setAvatarCell.imageView.setAnimation(PrivacyControlActivity.this.cameraDrawable);
                    PrivacyControlActivity.this.setAvatarCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    view = PrivacyControlActivity.this.setAvatarCell;
                    break;
                case 7:
                    PrivacyControlActivity.this.oldAvatarView = new BackupImageView(PrivacyControlActivity.this.getContext());
                    PrivacyControlActivity.this.oldPhotoCell = new TextCell(PrivacyControlActivity.this.getContext()) { // from class: org.telegram.ui.PrivacyControlActivity.ListAdapter.1
                        @Override // org.telegram.ui.Cells.TextCell, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
                        protected void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                            super.onLayout(z, i4, i5, i6, i7);
                            int dp = AndroidUtilities.dp(21.0f);
                            int measuredHeight = (getMeasuredHeight() - PrivacyControlActivity.this.oldAvatarView.getMeasuredHeight()) / 2;
                            PrivacyControlActivity.this.oldAvatarView.layout(dp, measuredHeight, PrivacyControlActivity.this.oldAvatarView.getMeasuredWidth() + dp, PrivacyControlActivity.this.oldAvatarView.getMeasuredHeight() + measuredHeight);
                        }

                        @Override // org.telegram.ui.Cells.TextCell, android.widget.FrameLayout, android.view.View
                        protected void onMeasure(int i4, int i5) {
                            super.onMeasure(i4, i5);
                            PrivacyControlActivity.this.oldAvatarView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLRPC.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLRPC.FLAG_30));
                            PrivacyControlActivity.this.oldAvatarView.setRoundRadius(AndroidUtilities.dp(30.0f));
                        }
                    };
                    if (PrivacyControlActivity.this.avatarForRest != null) {
                        if (PrivacyControlActivity.this.avatarForRestPhoto != null) {
                            backupImageView = PrivacyControlActivity.this.oldAvatarView;
                            forLocal = ImageLocation.getForPhoto(PrivacyControlActivity.this.avatarForRest, PrivacyControlActivity.this.avatarForRestPhoto);
                            i2 = ((BaseFragment) PrivacyControlActivity.this).currentAccount;
                        } else {
                            backupImageView = PrivacyControlActivity.this.oldAvatarView;
                            forLocal = ImageLocation.getForLocal(PrivacyControlActivity.this.avatarForRest.location);
                            i2 = ((BaseFragment) PrivacyControlActivity.this).currentAccount;
                        }
                        backupImageView.setImage(forLocal, "50_50", (Drawable) null, UserConfig.getInstance(i2).getCurrentUser());
                    }
                    PrivacyControlActivity.this.oldPhotoCell.addView(PrivacyControlActivity.this.oldAvatarView, LayoutHelper.createFrame(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    PrivacyControlActivity.this.oldPhotoCell.setText(LocaleController.getString(R.string.RemovePublicPhoto), false);
                    PrivacyControlActivity.this.oldPhotoCell.getImageView().setVisibility(0);
                    PrivacyControlActivity.this.oldPhotoCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    TextCell textCell = PrivacyControlActivity.this.oldPhotoCell;
                    int i4 = Theme.key_text_RedRegular;
                    textCell.setColors(i4, i4);
                    PrivacyControlActivity.this.oldPhotoCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    view = PrivacyControlActivity.this.oldPhotoCell;
                    break;
                case 8:
                    View textCheckCell = new TextCheckCell(this.mContext, ((BaseFragment) PrivacyControlActivity.this).resourceProvider);
                    textCheckCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    view = textCheckCell;
                    break;
                case 9:
                    frameLayout = new SlideIntChooseView(this.mContext, ((BaseFragment) PrivacyControlActivity.this).resourceProvider);
                    frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    view = frameLayout;
                    break;
                case 10:
                    FrameLayout frameLayout2 = new FrameLayout(this.mContext);
                    ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(this.mContext, ((BaseFragment) PrivacyControlActivity.this).resourceProvider);
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                    spannableStringBuilder.append((CharSequence) " l");
                    spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    buttonWithCounterView.setText(spannableStringBuilder, false);
                    buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            PrivacyControlActivity.ListAdapter.this.lambda$onCreateViewHolder$0(view2);
                        }
                    });
                    frameLayout2.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                    frameLayout = frameLayout2;
                    frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    view = frameLayout;
                    break;
            }
            return new RecyclerListView.Holder(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class MessageCell extends FrameLayout {
        private Drawable backgroundDrawable;
        private BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
        private ChatMessageCell cell;
        private HintView hintView;
        private final Runnable invalidateRunnable;
        private MessageObject messageObject;
        private Drawable shadowDrawable;

        public MessageCell(Context context) {
            super(context);
            this.invalidateRunnable = new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$MessageCell$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PrivacyControlActivity.MessageCell.this.invalidate();
                }
            };
            setWillNotDraw(false);
            setClipToPadding(false);
            this.shadowDrawable = Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow);
            setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            TLRPC.User user = MessagesController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getUser(Long.valueOf(UserConfig.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getClientUserId()));
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(R.string.PrivacyForwardsMessageLine);
            tL_message.date = currentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = NotificationCenter.newLocationAvailable;
            tL_message.from_id = new TLRPC.TL_peerUser();
            tL_message.id = 1;
            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
            tL_message.fwd_from = tL_messageFwdHeader;
            tL_messageFwdHeader.from_name = ContactsController.formatName(user.first_name, user.last_name);
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.out = false;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getClientUserId();
            MessageObject messageObject = new MessageObject(((BaseFragment) PrivacyControlActivity.this).currentAccount, tL_message, true, false);
            this.messageObject = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            ChatMessageCell chatMessageCell = new ChatMessageCell(context, ((BaseFragment) PrivacyControlActivity.this).currentAccount);
            this.cell = chatMessageCell;
            chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() { // from class: org.telegram.ui.PrivacyControlActivity.MessageCell.1
                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$canDrawOutboundsContent(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canPerformActions() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$canPerformActions(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canPerformReply() {
                    boolean canPerformActions;
                    canPerformActions = canPerformActions();
                    return canPerformActions;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPress(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPressBotButton(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressBotButton(this, chatMessageCell2, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressChannelAvatar(this, chatMessageCell2, chat, i, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressCustomBotButton(this, chatMessageCell2, buttonCustom);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressToDoButton(this, chatMessageCell2, todoItem);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user2, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressUserAvatar(this, chatMessageCell2, user2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAboutRevenueSharingAds() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAboutRevenueSharingAds(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAnimatedEmoji(this, chatMessageCell2, animatedEmojiSpan);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBoostCounter(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressBotButton(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBotButton(this, chatMessageCell2, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCancelSendButton(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelAvatar(this, chatMessageCell2, chat, i, f, f2, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendation(this, chatMessageCell2, tLObject, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCodeCopy(this, chatMessageCell2, textLayoutBlock);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCommentButton(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCustomBotButton(this, chatMessageCell2, buttonCustom);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressEffect(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressEffect(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressExtendedMediaPreview(this, chatMessageCell2, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheck(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheckWhat(this, chatMessageCell2, i, i2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGiveawayChatButton(this, chatMessageCell2, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGroupImage(this, chatMessageCell2, imageReceiver, messageExtendedMedia, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHiddenForward(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressHint(ChatMessageCell chatMessageCell2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHint(this, chatMessageCell2, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressImage(this, chatMessageCell2, f, f2, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressInstantButton(ChatMessageCell chatMessageCell2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressInstantButton(this, chatMessageCell2, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressOther(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReaction(this, chatMessageCell2, reactionCount, z, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReplyMessage(this, chatMessageCell2, i, f, f2, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressRevealSensitiveContent(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSideButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSideButton(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredClose(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredInfo(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressTime(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressTime(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressToDoButton(this, chatMessageCell2, todoItem, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUrl(this, chatMessageCell2, characterStyle, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user2, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserAvatar(this, chatMessageCell2, user2, f, f2, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user2, TLRPC.Document document, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserStatus(this, chatMessageCell2, user2, document, str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressViaBot(ChatMessageCell chatMessageCell2, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBot(this, chatMessageCell2, str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBotNotInline(this, chatMessageCell2, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressVoteButtons(this, chatMessageCell2, arrayList, i, i2, i3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell2.getContext(), str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareEnd(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareMove(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareStart(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didStartVideoStream(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didStartVideoStream(this, messageObject2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean doNotShowLoadingReply(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$doNotShowLoadingReply(this, messageObject2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void forceUpdate(ChatMessageCell chatMessageCell2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$forceUpdate(this, chatMessageCell2, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ String getAdminRank(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getAdminRank(this, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ PinchToZoomHelper getPinchToZoomHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getPinchToZoomHelper(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingLink(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getTextSelectionHelper(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean hasSelectedMessages() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$hasSelectedMessages(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void invalidateBlur() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$invalidateBlur(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isLandscape(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isProgressLoading(this, chatMessageCell2, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isReplyOrSelf() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isReplyOrSelf(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean keyboardIsOpened() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$keyboardIsOpened(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needOpenWebView(MessageObject messageObject2, String str, String str2, String str3, String str4, int i, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needOpenWebView(this, messageObject2, str, str2, str3, str4, i, i2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject2, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needPlayMessage(this, chatMessageCell2, messageObject2, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needReloadPolls(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needShowPremiumBulletin(int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needShowPremiumBulletin(this, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean onAccessibilityAction(int i, Bundle bundle) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onAccessibilityAction(this, i, bundle);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void onDiceFinished() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onDiceFinished(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void setShouldNotRepeatSticker(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$setShouldNotRepeatSticker(this, messageObject2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldDrawThreadProgress(this, chatMessageCell2, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean shouldRepeatSticker(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldRepeatSticker(this, messageObject2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$videoTimerReached(this);
                }
            });
            ChatMessageCell chatMessageCell2 = this.cell;
            chatMessageCell2.isChat = false;
            chatMessageCell2.setFullyDraw(true);
            this.cell.setMessageObject(this.messageObject, null, false, false, false);
            addView(this.cell, LayoutHelper.createLinear(-1, -2));
            HintView hintView = new HintView(context, 1, true);
            this.hintView = hintView;
            addView(hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            this.hintView.showForMessageCell(this.cell, false);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchSetPressed(boolean z) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.View
        public void invalidate() {
            super.invalidate();
            this.cell.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
            if (disposable != null) {
                disposable.dispose();
                this.backgroundGradientDisposable = null;
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            Drawable cachedWallpaperNonBlocking = Theme.getCachedWallpaperNonBlocking();
            if (cachedWallpaperNonBlocking != null && this.backgroundDrawable != cachedWallpaperNonBlocking) {
                BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
                if (disposable != null) {
                    disposable.dispose();
                    this.backgroundGradientDisposable = null;
                }
                this.backgroundDrawable = cachedWallpaperNonBlocking;
            }
            Drawable drawable = this.backgroundDrawable;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof MotionBackgroundDrawable)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                Drawable drawable2 = this.backgroundDrawable;
                if (drawable2 instanceof BackgroundGradientDrawable) {
                    this.backgroundGradientDisposable = ((BackgroundGradientDrawable) drawable2).drawExactBoundsSize(canvas, this);
                } else {
                    drawable2.draw(canvas);
                }
            } else if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f = 2.0f / AndroidUtilities.density;
                    canvas.scale(f, f);
                    this.backgroundDrawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.backgroundDrawable.getIntrinsicWidth(), measuredHeight / this.backgroundDrawable.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.backgroundDrawable.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(this.backgroundDrawable.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i = (measuredHeight - ceil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                    this.backgroundDrawable.setBounds(measuredWidth, i, ceil + measuredWidth, ceil2 + i);
                }
                this.backgroundDrawable.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
            this.shadowDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.shadowDrawable.draw(canvas);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public PrivacyControlActivity(int i) {
        this(i, false);
    }

    public PrivacyControlActivity(int i, boolean z) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        this.initialPlus = new ArrayList();
        this.initialMinus = new ArrayList();
        this.initialPlusPremium = new boolean[4];
        this.initialPlusMiniapps = new boolean[4];
        this.currentPlusPremium = new boolean[4];
        this.currentPlusMiniapps = new boolean[4];
        this.currentStars = 10L;
        this.shakeDp = 4;
        this.rulesType = i;
        if (z) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (this.rulesType == 4) {
            ImageUpdater imageUpdater = new ImageUpdater(false, 0, true);
            this.imageUpdater = imageUpdater;
            imageUpdater.parentFragment = this;
            imageUpdater.setDelegate(this);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            if (!UserObject.hasFallbackPhoto(userFull) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(userFull.fallback_photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) {
                return;
            }
            this.avatarForRest = closestPhotoSizeWithSize;
            this.avatarForRestPhoto = userFull.fallback_photo;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void applyCurrentPrivacySettings() {
        ArrayList<TLRPC.InputPrivacyRule> arrayList;
        TLRPC.InputPrivacyRule tL_inputPrivacyValueAllowContacts;
        int i;
        boolean[] zArr;
        int i2;
        TLRPC.InputUser inputUser;
        TLRPC.InputUser inputUser2;
        ArrayList<TLRPC.InputPrivacyRule> arrayList2;
        TLRPC.InputPrivacyRule tL_inputPrivacyValueAllowContacts2;
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        TLRPC.InputUser inputUser3;
        r4 = false;
        boolean z = false;
        if (this.rulesType == 10) {
            final boolean[] zArr2 = {true, false};
            if (this.currentType == 3) {
                Collections.sort(this.initialPlus);
                Collections.sort(this.currentPlus);
                if (!this.initialPlus.equals(this.currentPlus)) {
                    zArr2[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.currentType != 0 && this.currentPlus.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i3 = 0; i3 < this.currentPlus.size(); i3++) {
                            Long l = (Long) this.currentPlus.get(i3);
                            long longValue = l.longValue();
                            if (DialogObject.isUserDialog(longValue)) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l);
                                if (user != null && (inputUser3 = MessagesController.getInstance(this.currentAccount).getInputUser(user)) != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(inputUser3);
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new RequestDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda14
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$15(zArr2, tLObject, tL_error);
                        }
                    });
                }
            }
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings2 != null) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags = globalPrivacySettings2.flags;
                globalPrivacySettings3.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                globalPrivacySettings3.archive_and_mute_new_noncontact_peers = globalPrivacySettings2.archive_and_mute_new_noncontact_peers;
                globalPrivacySettings3.noncontact_peers_paid_stars = globalPrivacySettings2.noncontact_peers_paid_stars;
                globalPrivacySettings3.keep_archived_folders = globalPrivacySettings2.keep_archived_folders;
                globalPrivacySettings3.keep_archived_unmuted = globalPrivacySettings2.keep_archived_unmuted;
                globalPrivacySettings3.hide_read_marks = globalPrivacySettings2.hide_read_marks;
            }
            int i4 = this.currentType;
            if (i4 == 3) {
                globalPrivacySettings = setglobalprivacysettings.settings;
                globalPrivacySettings.flags |= 32;
                globalPrivacySettings.noncontact_peers_paid_stars = this.currentStars;
            } else {
                globalPrivacySettings = setglobalprivacysettings.settings;
                globalPrivacySettings.flags |= 32;
                globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                if (i4 == 2) {
                    z = true;
                }
            }
            globalPrivacySettings.new_noncontact_peers_require_premium = z;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new RequestDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda15
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$17(zArr2, globalPrivacySettings2, setglobalprivacysettings, tLObject, tL_error);
                }
            });
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        int i5 = this.rulesType;
        if (i5 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.currentType == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.currentSubType == 0) {
                    arrayList2 = setprivacy3.rules;
                    tL_inputPrivacyValueAllowContacts2 = new TLRPC.TL_inputPrivacyValueAllowAll();
                } else {
                    arrayList2 = setprivacy3.rules;
                    tL_inputPrivacyValueAllowContacts2 = new TLRPC.TL_inputPrivacyValueAllowContacts();
                }
                arrayList2.add(tL_inputPrivacyValueAllowContacts2);
                atomicInteger.incrementAndGet();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda16
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$19(atomicInteger, tLObject, tL_error);
                    }
                }, 2);
            }
        } else {
            setprivacy2.key = i5 == 5 ? new TLRPC.TL_inputPrivacyKeyForwards() : i5 == 4 ? new TLRPC.TL_inputPrivacyKeyProfilePhoto() : i5 == 9 ? new TLRPC.TL_inputPrivacyKeyAbout() : i5 == 3 ? new TLRPC.TL_inputPrivacyKeyPhoneP2P() : i5 == 2 ? new TLRPC.TL_inputPrivacyKeyPhoneCall() : i5 == 1 ? new TLRPC.TL_inputPrivacyKeyChatInvite() : i5 == 8 ? new TLRPC.TL_inputPrivacyKeyVoiceMessages() : i5 == 11 ? new TLRPC.TL_inputPrivacyKeyBirthday() : i5 == 12 ? new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave() : new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.currentType != 0 && this.currentPlus.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i6 = 0; i6 < this.currentPlus.size(); i6++) {
                Long l2 = (Long) this.currentPlus.get(i6);
                long longValue2 = l2.longValue();
                if (DialogObject.isUserDialog(longValue2)) {
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(l2);
                    if (user2 != null && (inputUser2 = MessagesController.getInstance(this.currentAccount).getInputUser(user2)) != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(inputUser2);
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-longValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.currentType != 1 && this.currentMinus.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i7 = 0; i7 < this.currentMinus.size(); i7++) {
                Long l3 = (Long) this.currentMinus.get(i7);
                long longValue3 = l3.longValue();
                if (DialogObject.isUserDialog(longValue3)) {
                    TLRPC.User user3 = getMessagesController().getUser(l3);
                    if (user3 != null && (inputUser = getMessagesController().getInputUser(user3)) != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-longValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        int i8 = this.currentType;
        if (i8 == 0) {
            arrayList = setprivacy2.rules;
            tL_inputPrivacyValueAllowContacts = new TLRPC.TL_inputPrivacyValueAllowAll();
        } else {
            if (i8 != 1) {
                if (i8 == 2) {
                    arrayList = setprivacy2.rules;
                    tL_inputPrivacyValueAllowContacts = new TLRPC.TL_inputPrivacyValueAllowContacts();
                }
                i = this.currentType;
                if (i != 0) {
                    if (this.currentPlusPremium[i != 2 ? (char) 1 : (char) 0]) {
                        setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
                    }
                }
                zArr = this.currentPlusMiniapps;
                i2 = this.currentType;
                if (zArr[i2]) {
                    setprivacy2.rules.add(i2 == 0 ? new TLRPC.TL_inputPrivacyValueDisallowBots() : new TLRPC.TL_inputPrivacyValueAllowBots());
                }
                atomicInteger.incrementAndGet();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda17
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$21(atomicInteger, tLObject, tL_error);
                    }
                }, 2);
                if (this.rulesType == 0 && this.selectedReadValue != this.currentReadValue) {
                    atomicInteger.incrementAndGet();
                    final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
                    setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
                    final TLRPC.GlobalPrivacySettings globalPrivacySettings4 = getContactsController().getGlobalPrivacySettings();
                    TLRPC.GlobalPrivacySettings globalPrivacySettings5 = setglobalprivacysettings2.settings;
                    globalPrivacySettings5.archive_and_mute_new_noncontact_peers = globalPrivacySettings4.archive_and_mute_new_noncontact_peers;
                    globalPrivacySettings5.keep_archived_folders = globalPrivacySettings4.keep_archived_folders;
                    globalPrivacySettings5.keep_archived_unmuted = globalPrivacySettings4.keep_archived_unmuted;
                    globalPrivacySettings5.new_noncontact_peers_require_premium = globalPrivacySettings4.new_noncontact_peers_require_premium;
                    globalPrivacySettings5.noncontact_peers_paid_stars = globalPrivacySettings4.noncontact_peers_paid_stars;
                    globalPrivacySettings5.hide_read_marks = this.selectedReadValue;
                    globalPrivacySettings5.display_gifts_button = globalPrivacySettings4.display_gifts_button;
                    getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda18
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$23(globalPrivacySettings4, setglobalprivacysettings2, atomicInteger, tLObject, tL_error);
                        }
                    });
                }
                if (this.rulesType == 12 && (this.selectedGiftIconValue != this.currentGiftIconValue || this.selectedGiftLimitedValue != this.currentGiftLimitedValue || this.selectedGiftUnlimitedValue != this.currentGiftUnlimitedValue || this.selectedGiftUniqueValue != this.currentGiftUniqueValue || this.selectedGiftPremiumValue != this.currentGiftPremiumValue)) {
                    atomicInteger.incrementAndGet();
                    final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = new TL_account.setGlobalPrivacySettings();
                    setglobalprivacysettings3.settings = new TLRPC.TL_globalPrivacySettings();
                    final TLRPC.GlobalPrivacySettings globalPrivacySettings6 = getContactsController().getGlobalPrivacySettings();
                    TLRPC.GlobalPrivacySettings globalPrivacySettings7 = setglobalprivacysettings3.settings;
                    globalPrivacySettings7.archive_and_mute_new_noncontact_peers = globalPrivacySettings6.archive_and_mute_new_noncontact_peers;
                    globalPrivacySettings7.keep_archived_folders = globalPrivacySettings6.keep_archived_folders;
                    globalPrivacySettings7.keep_archived_unmuted = globalPrivacySettings6.keep_archived_unmuted;
                    globalPrivacySettings7.new_noncontact_peers_require_premium = globalPrivacySettings6.new_noncontact_peers_require_premium;
                    globalPrivacySettings7.noncontact_peers_paid_stars = globalPrivacySettings6.noncontact_peers_paid_stars;
                    globalPrivacySettings7.hide_read_marks = globalPrivacySettings6.hide_read_marks;
                    globalPrivacySettings7.display_gifts_button = this.selectedGiftIconValue;
                    if (getUserConfig().isPremium()) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings8 = setglobalprivacysettings3.settings;
                        globalPrivacySettings8.flags |= 64;
                        globalPrivacySettings8.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                        disallowedGiftsSettings.disallow_unlimited_stargifts = !this.selectedGiftUnlimitedValue;
                        disallowedGiftsSettings.disallow_limited_stargifts = !this.selectedGiftLimitedValue;
                        disallowedGiftsSettings.disallow_unique_stargifts = !this.selectedGiftUniqueValue;
                        disallowedGiftsSettings.disallow_premium_gifts = !this.selectedGiftPremiumValue;
                    }
                    getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda19
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$25(globalPrivacySettings6, setglobalprivacysettings3, atomicInteger, tLObject, tL_error);
                        }
                    });
                }
                if (atomicInteger.get() <= 0) {
                    this.doneButtonDrawable.animateToProgress(1.0f);
                    return;
                }
                return;
            }
            arrayList = setprivacy2.rules;
            tL_inputPrivacyValueAllowContacts = new TLRPC.TL_inputPrivacyValueDisallowAll();
        }
        arrayList.add(tL_inputPrivacyValueAllowContacts);
        i = this.currentType;
        if (i != 0) {
        }
        zArr = this.currentPlusMiniapps;
        i2 = this.currentType;
        if (zArr[i2]) {
        }
        atomicInteger.incrementAndGet();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda17
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$21(atomicInteger, tLObject, tL_error);
            }
        }, 2);
        if (this.rulesType == 0) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings22 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings22.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings42 = getContactsController().getGlobalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings52 = setglobalprivacysettings22.settings;
            globalPrivacySettings52.archive_and_mute_new_noncontact_peers = globalPrivacySettings42.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings52.keep_archived_folders = globalPrivacySettings42.keep_archived_folders;
            globalPrivacySettings52.keep_archived_unmuted = globalPrivacySettings42.keep_archived_unmuted;
            globalPrivacySettings52.new_noncontact_peers_require_premium = globalPrivacySettings42.new_noncontact_peers_require_premium;
            globalPrivacySettings52.noncontact_peers_paid_stars = globalPrivacySettings42.noncontact_peers_paid_stars;
            globalPrivacySettings52.hide_read_marks = this.selectedReadValue;
            globalPrivacySettings52.display_gifts_button = globalPrivacySettings42.display_gifts_button;
            getConnectionsManager().sendRequest(setglobalprivacysettings22, new RequestDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda18
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$23(globalPrivacySettings42, setglobalprivacysettings22, atomicInteger, tLObject, tL_error);
                }
            });
        }
        if (this.rulesType == 12) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings32 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings32.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings62 = getContactsController().getGlobalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings72 = setglobalprivacysettings32.settings;
            globalPrivacySettings72.archive_and_mute_new_noncontact_peers = globalPrivacySettings62.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings72.keep_archived_folders = globalPrivacySettings62.keep_archived_folders;
            globalPrivacySettings72.keep_archived_unmuted = globalPrivacySettings62.keep_archived_unmuted;
            globalPrivacySettings72.new_noncontact_peers_require_premium = globalPrivacySettings62.new_noncontact_peers_require_premium;
            globalPrivacySettings72.noncontact_peers_paid_stars = globalPrivacySettings62.noncontact_peers_paid_stars;
            globalPrivacySettings72.hide_read_marks = globalPrivacySettings62.hide_read_marks;
            globalPrivacySettings72.display_gifts_button = this.selectedGiftIconValue;
            if (getUserConfig().isPremium()) {
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings32, new RequestDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda19
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$25(globalPrivacySettings62, setglobalprivacysettings32, atomicInteger, tLObject, tL_error);
                }
            });
        }
        if (atomicInteger.get() <= 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean areAllStarGiftsDisabled() {
        return (this.selectedGiftUniqueValue || this.selectedGiftUnlimitedValue || this.selectedGiftLimitedValue) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkDiscard() {
        if (this.doneButton.getAlpha() != 1.0f) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.UserRestrictionsApplyChanges));
        builder.setMessage(LocaleController.getString(R.string.PrivacySettingsChangedAlert));
        builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda2
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                PrivacyControlActivity.this.lambda$checkDiscard$27(alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda3
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                PrivacyControlActivity.this.lambda$checkDiscard$28(alertDialog, i);
            }
        });
        showDialog(builder.create());
        return false;
    }

    private void checkPrivacy() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i;
        ArrayList arrayList;
        ArrayList<Long> arrayList2;
        int i2 = this.rulesType;
        if (i2 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings();
            int i3 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 2;
            this.currentType = i3;
            this.initialRulesType = i3;
            this.currentMinus = new ArrayList();
            this.currentPlus = new ArrayList();
            if (globalPrivacySettings == null || (globalPrivacySettings.flags & 32) == 0) {
                this.currentStars = 10L;
                this.initialStars = 10L;
            } else {
                long clamp = Utilities.clamp(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.currentStars = clamp;
                this.initialStars = clamp;
                this.currentType = 3;
                this.initialRulesType = 3;
            }
            ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(13);
            this.currentPlus = new ArrayList();
            if (privacyRules != null) {
                for (int i4 = 0; i4 < privacyRules.size(); i4++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i4);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            this.currentPlus.add(Long.valueOf(-tL_privacyValueAllowChatParticipants.chats.get(i5).longValue()));
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.currentPlus.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            this.initialPlus.clear();
            this.initialPlus.addAll(this.currentPlus);
            return;
        }
        boolean[] zArr = this.currentPlusPremium;
        boolean[] zArr2 = this.initialPlusPremium;
        boolean z = i2 == 1;
        zArr2[0] = z;
        zArr[0] = z;
        zArr2[1] = false;
        zArr[1] = false;
        boolean[] zArr3 = this.currentPlusMiniapps;
        boolean[] zArr4 = this.initialPlusMiniapps;
        zArr4[0] = false;
        zArr3[0] = false;
        boolean z2 = i2 == 12;
        zArr4[1] = z2;
        zArr3[1] = z2;
        zArr4[2] = false;
        zArr3[2] = false;
        zArr4[3] = false;
        zArr3[3] = false;
        this.currentPlus = new ArrayList();
        this.currentMinus = new ArrayList();
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(this.rulesType);
        if (privacyRules2 == null || privacyRules2.size() == 0) {
            this.currentType = 1;
        } else {
            Boolean bool = null;
            char c = 65535;
            boolean z3 = false;
            boolean z4 = false;
            for (int i6 = 0; i6 < privacyRules2.size(); i6++) {
                TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i6);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        this.currentPlus.add(Long.valueOf(-tL_privacyValueAllowChatParticipants2.chats.get(i7).longValue()));
                    }
                } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                    TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule2;
                    int size3 = tL_privacyValueDisallowChatParticipants.chats.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        this.currentMinus.add(Long.valueOf(-tL_privacyValueDisallowChatParticipants.chats.get(i8).longValue()));
                    }
                } else {
                    if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                        arrayList = this.currentPlus;
                        arrayList2 = ((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users;
                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        arrayList = this.currentMinus;
                        arrayList2 = ((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users;
                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                        z3 = true;
                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
                        bool = Boolean.TRUE;
                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowBots) {
                        bool = Boolean.FALSE;
                    } else {
                        boolean z5 = privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll;
                        if (!z5) {
                            boolean z6 = privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll;
                            if (!z6 || z4) {
                                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                                    c = 2;
                                    z4 = true;
                                } else if (c == 65535) {
                                    if (!z5) {
                                        if (!z6 || z4) {
                                            c = 2;
                                        }
                                    }
                                }
                            }
                            c = 1;
                        }
                        c = 0;
                    }
                    arrayList.addAll(arrayList2);
                }
            }
            if (c == 0 || (c == 65535 && (this.currentMinus.size() > 0 || !(bool == null || bool.booleanValue())))) {
                this.currentType = 0;
            } else if (c == 2 || (c == 65535 && this.currentMinus.size() > 0 && this.currentPlus.size() > 0)) {
                this.currentType = 2;
            } else {
                if (c != 1) {
                    i = (c == 65535 && (this.currentPlus.size() > 0 || (bool != null && bool.booleanValue()))) ? 1 : 1;
                }
                this.currentType = i;
            }
            int i9 = this.currentType;
            char c2 = i9 == 2 ? (char) 0 : (char) 1;
            boolean[] zArr5 = this.currentPlusPremium;
            this.initialPlusPremium[c2] = z3;
            zArr5[c2] = z3;
            boolean[] zArr6 = this.currentPlusMiniapps;
            boolean[] zArr7 = this.initialPlusMiniapps;
            boolean z7 = bool != null;
            zArr7[i9] = z7;
            zArr6[i9] = z7;
            View view = this.doneButton;
            if (view != null) {
                view.setAlpha(0.0f);
                this.doneButton.setScaleX(0.0f);
                this.doneButton.setScaleY(0.0f);
                this.doneButton.setEnabled(false);
            }
        }
        this.initialPlus.clear();
        this.initialMinus.clear();
        this.initialRulesType = this.currentType;
        this.initialPlus.addAll(this.currentPlus);
        this.initialMinus.addAll(this.currentMinus);
        if (this.rulesType == 6) {
            ArrayList<TLRPC.PrivacyRule> privacyRules3 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules3 != null && privacyRules3.size() != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= privacyRules3.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = privacyRules3.get(i10);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        break;
                    }
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.currentSubType = 2;
                        break;
                    } else {
                        if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                            this.currentSubType = 1;
                            break;
                        }
                        i10++;
                    }
                }
                this.initialRulesSubType = this.currentSubType;
            }
            this.currentSubType = 0;
            this.initialRulesSubType = this.currentSubType;
        }
        if (this.rulesType == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
            boolean z8 = globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks;
            this.currentReadValue = z8;
            this.selectedReadValue = z8;
        }
        if (this.rulesType == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().getGlobalPrivacySettings();
            boolean z9 = globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button;
            this.currentGiftIconValue = z9;
            this.selectedGiftIconValue = z9;
            if (globalPrivacySettings3 == null || (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) == null) {
                this.selectedGiftUnlimitedValue = true;
                this.currentGiftUnlimitedValue = true;
                this.selectedGiftLimitedValue = true;
                this.currentGiftLimitedValue = true;
                this.selectedGiftUniqueValue = true;
                this.currentGiftUniqueValue = true;
                this.selectedGiftPremiumValue = true;
                this.currentGiftPremiumValue = true;
            } else {
                boolean z10 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.selectedGiftUnlimitedValue = z10;
                this.currentGiftUnlimitedValue = z10;
                boolean z11 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.selectedGiftLimitedValue = z11;
                this.currentGiftLimitedValue = z11;
                boolean z12 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.selectedGiftUniqueValue = z12;
                this.currentGiftUniqueValue = z12;
                boolean z13 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.selectedGiftPremiumValue = z13;
                this.currentGiftPremiumValue = z13;
            }
        }
        updateRows(false);
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    private void finished() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        this.doneButtonDrawable.animateToProgress(0.0f);
        int i = this.rulesType;
        if ((i == 10 || i == 1 || i == 2) && this.currentType != 0 && (globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings()) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i2 = 0; i2 < 2; i2++) {
                final int i3 = iArr[i2];
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i3);
                if (i3 != this.rulesType && ContactsController.findRule(privacyRules, TLRPC.TL_privacyValueAllowAll.class) != null) {
                    new AlertDialog.Builder(getContext(), this.resourceProvider).setTitle(LocaleController.getString(i3 == 1 ? R.string.CheckPrivacyInviteTitle : R.string.CheckPrivacyCallsTitle)).setMessage(LocaleController.getString(i3 == 1 ? R.string.CheckPrivacyInviteText : R.string.CheckPrivacyCallsText)).setPositiveButton(LocaleController.getString(R.string.CheckPrivacyReview), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda27
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i4) {
                            PrivacyControlActivity.this.lambda$finished$11(i3, alertDialog, i4);
                        }
                    }).setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda28
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i4) {
                            PrivacyControlActivity.this.lambda$finished$12(alertDialog, i4);
                        }
                    }).show();
                    return;
                }
            }
        }
        lambda$onBackPressed$354();
    }

    private boolean hasChanges() {
        ArrayList arrayList;
        if (this.rulesType == 0 && ((this.currentType != 0 || ((arrayList = this.currentMinus) != null && !arrayList.isEmpty())) && this.currentReadValue != this.selectedReadValue)) {
            return true;
        }
        int i = this.rulesType;
        if (i == 12 && (this.currentGiftIconValue != this.selectedGiftIconValue || this.currentGiftLimitedValue != this.selectedGiftLimitedValue || this.currentGiftUnlimitedValue != this.selectedGiftUnlimitedValue || this.currentGiftUniqueValue != this.selectedGiftUniqueValue || this.currentGiftPremiumValue != this.selectedGiftPremiumValue)) {
            return true;
        }
        int i2 = this.initialRulesType;
        int i3 = this.currentType;
        if (i2 != i3) {
            return true;
        }
        if (i == 6 && i3 == 1 && this.initialRulesSubType != this.currentSubType) {
            return true;
        }
        if (i3 != 0) {
            if (this.initialPlusPremium[i3 == 2 ? (char) 0 : (char) 1] != this.currentPlusPremium[i3 == 2 ? (char) 0 : (char) 1]) {
                return true;
            }
        }
        if ((i == 10 && i3 == 3 && this.currentStars != this.initialStars) || this.initialPlusMiniapps[i3] != this.currentPlusMiniapps[i3] || this.initialMinus.size() != this.currentMinus.size() || this.initialPlus.size() != this.currentPlus.size()) {
            return true;
        }
        if (this.rulesType != 10 || this.currentType == 3) {
            Collections.sort(this.initialPlus);
            Collections.sort(this.currentPlus);
            if (!this.initialPlus.equals(this.currentPlus)) {
                return true;
            }
            Collections.sort(this.initialMinus);
            Collections.sort(this.currentMinus);
            if (!this.initialMinus.equals(this.currentMinus)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$13(boolean[] zArr) {
        zArr[0] = true;
        if (zArr[1]) {
            finished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$14(TLRPC.TL_error tL_error, TLObject tLObject, final boolean[] zArr) {
        if (tL_error != null) {
            showErrorAlert();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(privacyrules.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(privacyrules.chats, false);
        ContactsController.getInstance(this.currentAccount).setPrivacyRules(privacyrules.rules, 13);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$13(zArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$15(final boolean[] zArr, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$14(tL_error, tLObject, zArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$16(TLRPC.TL_error tL_error, boolean[] zArr, TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings) {
        if (tL_error != null) {
            showErrorAlert();
            return;
        }
        zArr[1] = true;
        if (globalPrivacySettings != null) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
            globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
            int i = globalPrivacySettings2.flags;
            globalPrivacySettings.flags = i;
            globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
            long j = globalPrivacySettings2.noncontact_peers_paid_stars;
            if (j > 0) {
                globalPrivacySettings.flags = i | 32;
                globalPrivacySettings.noncontact_peers_paid_stars = j;
            } else {
                globalPrivacySettings.flags = i & (-33);
                globalPrivacySettings.noncontact_peers_paid_stars = 0L;
            }
        }
        if (zArr[0]) {
            finished();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$17(final boolean[] zArr, final TLRPC.GlobalPrivacySettings globalPrivacySettings, final TL_account.setGlobalPrivacySettings setglobalprivacysettings, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$16(tL_error, zArr, globalPrivacySettings, setglobalprivacysettings);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$18(TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            BulletinFactory.of(this).showForError(tL_error);
            return;
        }
        ContactsController.getInstance(this.currentAccount).setPrivacyRules(((TL_account.privacyRules) tLObject).rules, 7);
        if (atomicInteger.decrementAndGet() == 0) {
            finished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$19(final AtomicInteger atomicInteger, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$18(tL_error, tLObject, atomicInteger);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$20(TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            showErrorAlert();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(privacyrules.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(privacyrules.chats, false);
        ContactsController.getInstance(this.currentAccount).setPrivacyRules(privacyrules.rules, this.rulesType);
        if (atomicInteger.decrementAndGet() == 0) {
            finished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$21(final AtomicInteger atomicInteger, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$20(tL_error, tLObject, atomicInteger);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$22(TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings, AtomicInteger atomicInteger) {
        boolean z = setglobalprivacysettings.settings.hide_read_marks;
        this.currentReadValue = z;
        globalPrivacySettings.hide_read_marks = z;
        if (atomicInteger.decrementAndGet() == 0) {
            finished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$23(final TLRPC.GlobalPrivacySettings globalPrivacySettings, final TL_account.setGlobalPrivacySettings setglobalprivacysettings, final AtomicInteger atomicInteger, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$22(globalPrivacySettings, setglobalprivacysettings, atomicInteger);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$24(TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings, AtomicInteger atomicInteger) {
        TLRPC.UserFull userFull;
        if (globalPrivacySettings.display_gifts_button != setglobalprivacysettings.settings.display_gifts_button && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null) {
            userFull.display_gifts_button = setglobalprivacysettings.settings.display_gifts_button;
            getMessagesStorage().updateUserInfo(userFull, false);
        }
        boolean z = setglobalprivacysettings.settings.display_gifts_button;
        this.currentGiftIconValue = z;
        globalPrivacySettings.display_gifts_button = z;
        if (globalPrivacySettings.disallowed_stargifts == null) {
            globalPrivacySettings.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings.settings.disallowed_stargifts;
        if (disallowedGiftsSettings != null) {
            globalPrivacySettings.flags |= 64;
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts;
            boolean z2 = disallowedGiftsSettings.disallow_unlimited_stargifts;
            disallowedGiftsSettings2.disallow_unlimited_stargifts = z2;
            this.currentGiftUnlimitedValue = !z2;
            boolean z3 = disallowedGiftsSettings.disallow_limited_stargifts;
            disallowedGiftsSettings2.disallow_limited_stargifts = z3;
            this.currentGiftLimitedValue = !z3;
            boolean z4 = disallowedGiftsSettings.disallow_unique_stargifts;
            disallowedGiftsSettings2.disallow_unique_stargifts = z4;
            this.currentGiftUniqueValue = !z4;
            boolean z5 = disallowedGiftsSettings.disallow_premium_gifts;
            disallowedGiftsSettings2.disallow_premium_gifts = z5;
            this.currentGiftPremiumValue = !z5;
        }
        if (atomicInteger.decrementAndGet() == 0) {
            finished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyCurrentPrivacySettings$25(final TLRPC.GlobalPrivacySettings globalPrivacySettings, final TL_account.setGlobalPrivacySettings setglobalprivacysettings, final AtomicInteger atomicInteger, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity.this.lambda$applyCurrentPrivacySettings$24(globalPrivacySettings, setglobalprivacysettings, atomicInteger);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDiscard$27(AlertDialog alertDialog, int i) {
        processDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDiscard$28(AlertDialog alertDialog, int i) {
        lambda$onBackPressed$354();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$3() {
        TLRPC.Photo photo;
        this.avatarForRest = null;
        this.avatarForRestPhoto = null;
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
        if (userFull == null || (photo = userFull.fallback_photo) == null) {
            return;
        }
        userFull.flags &= -4194305;
        userFull.fallback_photo = null;
        getMessagesStorage().updateUserInfo(userFull, true);
        updateAvatarForRestInfo();
        updateRows(true);
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        byte[] bArr = photo.file_reference;
        tL_inputPhoto.file_reference = bArr;
        if (bArr == null) {
            tL_inputPhoto.file_reference = new byte[0];
        }
        MessagesController.getInstance(this.currentAccount).deleteUserPhoto(tL_inputPhoto);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createView$4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$5(DialogInterface dialogInterface) {
        if (this.imageUpdater.isUploadingImage()) {
            this.cameraDrawable.setCurrentFrame(0, false);
        } else {
            this.cameraDrawable.setCustomEndFrame(86);
            this.setAvatarCell.imageView.playAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$6() {
        presentFragment(new PremiumPreviewFragment("noncontacts"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$7() {
        presentFragment(new PremiumPreviewFragment("settings"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$8(int i, boolean z, boolean z2, boolean z3, ArrayList arrayList) {
        int i2 = 0;
        if (i == this.neverShareRow) {
            this.currentMinus = arrayList;
            this.currentPlusMiniapps[this.currentType] = z && z3;
            while (i2 < this.currentMinus.size()) {
                this.currentPlus.remove(this.currentMinus.get(i2));
                i2++;
            }
        } else {
            boolean[] zArr = this.currentPlusPremium;
            int i3 = this.currentType;
            zArr[i3 == 2 ? (char) 0 : (char) 1] = z2;
            this.currentPlusMiniapps[i3] = z && z3;
            this.currentPlus = arrayList;
            while (i2 < this.currentPlus.size()) {
                this.currentMinus.remove(this.currentPlus.get(i2));
                i2++;
            }
        }
        updateDoneButton();
        this.listAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$9(View view, final int i) {
        boolean z;
        int i2;
        TextCheckCell textCheckCell;
        boolean z2;
        BaseFragment premiumPreviewFragment;
        BulletinFactory of;
        int i3;
        String string;
        SpannableStringBuilder replaceTags;
        String string2;
        Runnable runnable;
        if (i == this.currentPhotoForRestRow) {
            AlertDialog create = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString(R.string.RemovePublicPhoto), LocaleController.getString(R.string.RemovePhotoForRestDescription), LocaleController.getString(R.string.Remove), new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    PrivacyControlActivity.this.lambda$createView$3();
                }
            }, null).create();
            create.show();
            create.redPositive();
            return;
        }
        int i4 = 0;
        r1 = false;
        boolean z3 = false;
        if (i == this.photoForRestRow) {
            ImageUpdater imageUpdater = this.imageUpdater;
            if (imageUpdater != null) {
                imageUpdater.openMenu(false, new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrivacyControlActivity.lambda$createView$4();
                    }
                }, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda7
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        PrivacyControlActivity.this.lambda$createView$5(dialogInterface);
                    }
                }, 0);
                this.cameraDrawable.setCurrentFrame(0);
                this.cameraDrawable.setCustomEndFrame(43);
                this.setAvatarCell.imageView.playAnimation();
                return;
            }
            return;
        }
        if (this.rulesType == 10 && i == this.myContactsRow && !getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !getUserConfig().isPremium()) {
            of = BulletinFactory.of(this);
            i3 = R.raw.star_premium_2;
            string = LocaleController.getString(R.string.OptionPremiumRequiredTitle);
            replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage));
            string2 = LocaleController.getString(R.string.OptionPremiumRequiredButton);
            runnable = new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    PrivacyControlActivity.this.lambda$createView$6();
                }
            };
        } else {
            if (this.rulesType != 8 || (!(i == this.myContactsRow || i == this.nobodyRow) || getUserConfig().isPremium())) {
                if (i == this.nobodyRow || i == this.everybodyRow || i == this.myContactsRow || i == this.payRow) {
                    if (this.rulesType == 12 && areAllStarGiftsDisabled()) {
                        int i5 = -this.shakeDp;
                        this.shakeDp = i5;
                        AndroidUtilities.shakeViewSpring(view, i5);
                        return;
                    }
                    if (i == this.nobodyRow) {
                        i4 = 1;
                    } else if (i != this.everybodyRow) {
                        i4 = i == this.payRow ? 3 : 2;
                    }
                    if (i4 == this.currentType) {
                        return;
                    }
                    this.currentType = i4;
                    Bulletin.hideVisible();
                } else {
                    if (i != this.phoneContactsRow && i != this.phoneEverybodyRow) {
                        if (i == this.neverShareRow || i == this.alwaysShareRow) {
                            if (this.rulesType == 12 && areAllStarGiftsDisabled()) {
                                int i6 = -this.shakeDp;
                                this.shakeDp = i6;
                                AndroidUtilities.shakeViewSpring(view, i6);
                                return;
                            }
                            ArrayList arrayList = i == this.neverShareRow ? this.currentMinus : this.currentPlus;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean(i == this.neverShareRow ? "isNeverShare" : "isAlwaysShare", true);
                            bundle.putInt("chatAddType", this.rulesType != 0 ? 1 : 0);
                            if (i == this.alwaysShareRow && this.rulesType == 1) {
                                bundle.putBoolean("allowPremium", true);
                            }
                            final boolean z4 = this.rulesType == 12 && ((i2 = this.currentType) != 1 ? !(i2 != 2 ? !(i2 == 0 && i == this.neverShareRow) : i != this.alwaysShareRow) : i == this.alwaysShareRow);
                            bundle.putBoolean("allowMiniapps", z4);
                            GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundle);
                            if (this.rulesType == 10) {
                                groupCreateActivity.setTitle(LocaleController.getString(R.string.RemoveMessageFeeTitle));
                            }
                            if (i == this.alwaysShareRow) {
                                if (this.currentPlusPremium[this.currentType == 2 ? (char) 0 : (char) 1]) {
                                    z = true;
                                    if (z4 && this.currentPlusMiniapps[this.currentType]) {
                                        z3 = true;
                                    }
                                    groupCreateActivity.select(arrayList, z, z3);
                                    groupCreateActivity.setDelegate(new GroupCreateActivity.GroupCreateActivityDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda10
                                        @Override // org.telegram.ui.GroupCreateActivity.GroupCreateActivityDelegate
                                        public final void didSelectUsers(boolean z5, boolean z6, ArrayList arrayList2) {
                                            PrivacyControlActivity.this.lambda$createView$8(i, z4, z5, z6, arrayList2);
                                        }
                                    });
                                    groupCreateActivity.setShowDiscardConfirm(true);
                                    presentFragment(groupCreateActivity);
                                    return;
                                }
                            }
                            z = false;
                            if (z4) {
                                z3 = true;
                            }
                            groupCreateActivity.select(arrayList, z, z3);
                            groupCreateActivity.setDelegate(new GroupCreateActivity.GroupCreateActivityDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda10
                                @Override // org.telegram.ui.GroupCreateActivity.GroupCreateActivityDelegate
                                public final void didSelectUsers(boolean z5, boolean z6, ArrayList arrayList2) {
                                    PrivacyControlActivity.this.lambda$createView$8(i, z4, z5, z6, arrayList2);
                                }
                            });
                            groupCreateActivity.setShowDiscardConfirm(true);
                            presentFragment(groupCreateActivity);
                            return;
                        }
                        if (i != this.p2pRow) {
                            if (i == this.readRow) {
                                this.selectedReadValue = !this.selectedReadValue;
                                updateDoneButton();
                                textCheckCell = (TextCheckCell) view;
                                z2 = this.selectedReadValue;
                            } else if (i == this.readPremiumRow) {
                                premiumPreviewFragment = new PremiumPreviewFragment("lastseen");
                            } else {
                                if (i != this.showGiftIconRow) {
                                    if (i == this.giftTypeLimitedRow) {
                                        if (this.selectedGiftLimitedValue && !getUserConfig().isPremium()) {
                                            int i7 = -this.shakeDp;
                                            this.shakeDp = i7;
                                            AndroidUtilities.shakeViewSpring(view, i7);
                                            showPremiumBulletin();
                                            return;
                                        }
                                        boolean areAllStarGiftsDisabled = areAllStarGiftsDisabled();
                                        this.selectedGiftLimitedValue = !this.selectedGiftLimitedValue;
                                        updateDoneButton();
                                        TextCheckCell textCheckCell2 = (TextCheckCell) view;
                                        textCheckCell2.setChecked(this.selectedGiftLimitedValue);
                                        if (this.selectedGiftLimitedValue && !getUserConfig().isPremium()) {
                                            textCheckCell2.setCheckBoxIcon(R.drawable.permission_locked);
                                        }
                                        if (areAllStarGiftsDisabled == areAllStarGiftsDisabled()) {
                                            return;
                                        }
                                    } else if (i == this.giftTypeUnlimitedRow) {
                                        if (this.selectedGiftUnlimitedValue && !getUserConfig().isPremium()) {
                                            int i8 = -this.shakeDp;
                                            this.shakeDp = i8;
                                            AndroidUtilities.shakeViewSpring(view, i8);
                                            showPremiumBulletin();
                                            return;
                                        }
                                        boolean areAllStarGiftsDisabled2 = areAllStarGiftsDisabled();
                                        this.selectedGiftUnlimitedValue = !this.selectedGiftUnlimitedValue;
                                        updateDoneButton();
                                        TextCheckCell textCheckCell3 = (TextCheckCell) view;
                                        textCheckCell3.setChecked(this.selectedGiftUnlimitedValue);
                                        if (this.selectedGiftUnlimitedValue && !getUserConfig().isPremium()) {
                                            textCheckCell3.setCheckBoxIcon(R.drawable.permission_locked);
                                        }
                                        if (areAllStarGiftsDisabled2 == areAllStarGiftsDisabled()) {
                                            return;
                                        }
                                    } else if (i == this.giftTypeUniqueRow) {
                                        if (this.selectedGiftUniqueValue && !getUserConfig().isPremium()) {
                                            int i9 = -this.shakeDp;
                                            this.shakeDp = i9;
                                            AndroidUtilities.shakeViewSpring(view, i9);
                                            showPremiumBulletin();
                                            return;
                                        }
                                        boolean areAllStarGiftsDisabled3 = areAllStarGiftsDisabled();
                                        this.selectedGiftUniqueValue = !this.selectedGiftUniqueValue;
                                        updateDoneButton();
                                        TextCheckCell textCheckCell4 = (TextCheckCell) view;
                                        textCheckCell4.setChecked(this.selectedGiftUniqueValue);
                                        if (this.selectedGiftUniqueValue && !getUserConfig().isPremium()) {
                                            textCheckCell4.setCheckBoxIcon(R.drawable.permission_locked);
                                        }
                                        if (areAllStarGiftsDisabled3 == areAllStarGiftsDisabled()) {
                                            return;
                                        }
                                    } else {
                                        if (i != this.giftTypePremiumRow) {
                                            return;
                                        }
                                        if (this.selectedGiftPremiumValue && !getUserConfig().isPremium()) {
                                            int i10 = -this.shakeDp;
                                            this.shakeDp = i10;
                                            AndroidUtilities.shakeViewSpring(view, i10);
                                            showPremiumBulletin();
                                            return;
                                        }
                                        boolean areAllStarGiftsDisabled4 = areAllStarGiftsDisabled();
                                        this.selectedGiftPremiumValue = !this.selectedGiftPremiumValue;
                                        updateDoneButton();
                                        TextCheckCell textCheckCell5 = (TextCheckCell) view;
                                        textCheckCell5.setChecked(this.selectedGiftPremiumValue);
                                        if (this.selectedGiftPremiumValue && !getUserConfig().isPremium()) {
                                            textCheckCell5.setCheckBoxIcon(R.drawable.permission_locked);
                                        }
                                        if (areAllStarGiftsDisabled4 == areAllStarGiftsDisabled()) {
                                            return;
                                        }
                                    }
                                    updateRows(true);
                                    AndroidUtilities.updateVisibleRows(this.listView);
                                    return;
                                }
                                this.selectedGiftIconValue = !this.selectedGiftIconValue;
                                updateDoneButton();
                                textCheckCell = (TextCheckCell) view;
                                z2 = this.selectedGiftIconValue;
                            }
                            textCheckCell.setChecked(z2);
                            return;
                        }
                        premiumPreviewFragment = new PrivacyControlActivity(3);
                        presentFragment(premiumPreviewFragment);
                        return;
                    }
                    int i11 = i != this.phoneEverybodyRow ? 1 : 0;
                    if (i11 == this.currentSubType) {
                        return;
                    } else {
                        this.currentSubType = i11;
                    }
                }
                updateDoneButton();
                updateRows(true);
                return;
            }
            of = BulletinFactory.of(this);
            i3 = R.raw.star_premium_2;
            string = LocaleController.getString(R.string.OptionPremiumRequiredTitle);
            replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage));
            string2 = LocaleController.getString(R.string.OptionPremiumRequiredButton);
            runnable = new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    PrivacyControlActivity.this.lambda$createView$7();
                }
            };
        }
        of.createSimpleBulletin(i3, string, replaceTags, string2, runnable).show();
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        int i12 = -this.shakeDp;
        this.shakeDp = i12;
        AndroidUtilities.shakeViewSpring(view, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didUploadPhoto$0(TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            userFull.flags |= TLRPC.FLAG_22;
            userFull.fallback_photo = tL_photos_photo.photo;
            getMessagesStorage().updateUserInfo(userFull, true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (closestPhotoSizeWithSize != null && this.avatarForRest != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatarForRest, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                ImageLoader.getInstance().replaceImageInCache(this.avatarForRest.location.volume_id + "_" + this.avatarForRest.location.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForLocal(closestPhotoSizeWithSize.location), false);
            }
            if (closestPhotoSizeWithSize2 == null || this.avatarForRest == null) {
                return;
            }
            FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatarForRest.location, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didUploadPhoto$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity.this.lambda$didUploadPhoto$0(tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didUploadPhoto$2(TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2) {
        this.avatarForRest = photoSize;
        this.avatarForRestPhoto = null;
        updateAvatarForRestInfo();
        if (inputFile != null || inputFile2 != null) {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            tL_photos_uploadProfilePhoto.fallback = true;
            tL_photos_uploadProfilePhoto.flags |= 8;
            getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new RequestDelegate() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda4
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    PrivacyControlActivity.this.lambda$didUploadPhoto$1(tLObject, tL_error);
                }
            });
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            tL_user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_small = photoSize.location;
            tL_userProfilePhoto.photo_big = photoSize2.location;
            tL_user.first_name = getUserConfig().getCurrentUser().first_name;
            tL_user.last_name = getUserConfig().getCurrentUser().last_name;
            tL_user.access_hash = getUserConfig().getCurrentUser().access_hash;
            BulletinFactory.of(this).createUsersBulletin(Collections.singletonList(tL_user), LocaleController.getString(R.string.PhotoForRestTooltip)).show();
        }
        updateRows(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finished$11(int i, AlertDialog alertDialog, int i2) {
        presentFragment(new PrivacyControlActivity(i), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finished$12(AlertDialog alertDialog, int i) {
        lambda$onBackPressed$354();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDone$26(SharedPreferences sharedPreferences, AlertDialog alertDialog, int i) {
        applyCurrentPrivacySettings();
        sharedPreferences.edit().putBoolean("privacyAlertShowed", true).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPremiumBulletin$10() {
        presentFragment(new PremiumPreviewFragment("noncontacts"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processDone() {
        Dialog create;
        if (getParentActivity() == null) {
            return;
        }
        if (this.rulesType != 10 || this.currentType != 3 || getUserConfig().isPremium()) {
            if (this.currentType != 0 && this.rulesType == 0 && !getUserConfig().isPremium()) {
                final SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    builder.setMessage(LocaleController.getString(this.rulesType == 1 ? R.string.WhoCanAddMeInfo : R.string.CustomHelp));
                    builder.setTitle(LocaleController.getString(R.string.AppName));
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda11
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i) {
                            PrivacyControlActivity.this.lambda$processDone$26(globalMainSettings, alertDialog, i);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    create = builder.create();
                }
            }
            applyCurrentPrivacySettings();
            return;
        }
        create = new PremiumFeatureBottomSheet(this, 27, true);
        showDialog(create);
    }

    private void setMessageText() {
        HintView hintView;
        int i;
        TLRPC.Peer peer;
        MessageCell messageCell = this.messageCell;
        if (messageCell != null) {
            messageCell.messageObject.messageOwner.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i2 = this.currentType;
            long j = 1;
            if (i2 == 0) {
                hintView = this.messageCell.hintView;
                i = R.string.PrivacyForwardsEverybody;
            } else {
                if (i2 == 1) {
                    this.messageCell.hintView.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsNobody));
                    peer = this.messageCell.messageObject.messageOwner.fwd_from.from_id;
                    j = 0;
                    peer.user_id = j;
                    this.messageCell.cell.forceResetMessageObject();
                }
                hintView = this.messageCell.hintView;
                i = R.string.PrivacyForwardsContacts;
            }
            hintView.setOverrideText(LocaleController.getString(i));
            peer = this.messageCell.messageObject.messageOwner.fwd_from.from_id;
            peer.user_id = j;
            this.messageCell.cell.forceResetMessageObject();
        }
    }

    private void showErrorAlert() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setMessage(LocaleController.getString(R.string.PrivacyFloodControlError));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showDialog(builder.create());
    }

    private void showPremiumBulletin() {
        BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity.this.lambda$showPremiumBulletin$10();
            }
        }).show();
    }

    private void updateAvatarForRestInfo() {
        TLRPC.PhotoSize photoSize;
        TextCell textCell = this.setAvatarCell;
        if (textCell != null) {
            TLRPC.PhotoSize photoSize2 = this.avatarForRest;
            SimpleTextView textView = textCell.getTextView();
            if (photoSize2 == null) {
                textView.setText(LocaleController.formatString("SetPhotoForRest", R.string.SetPhotoForRest, new Object[0]));
                this.setAvatarCell.setNeedDivider(false);
            } else {
                textView.setText(LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]));
                this.setAvatarCell.setNeedDivider(true);
            }
        }
        BackupImageView backupImageView = this.oldAvatarView;
        if (backupImageView == null || (photoSize = this.avatarForRest) == null) {
            return;
        }
        TLRPC.Photo photo = this.avatarForRestPhoto;
        backupImageView.setImage(photo != null ? ImageLocation.getForPhoto(photoSize, photo) : ImageLocation.getForLocal(photoSize.location), "50_50", (Drawable) null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDoneButton() {
        boolean hasChanges = hasChanges();
        this.doneButton.setEnabled(hasChanges);
        this.doneButton.animate().alpha(hasChanges ? 1.0f : 0.0f).scaleX(hasChanges ? 1.0f : 0.0f).scaleY(hasChanges ? 1.0f : 0.0f).setDuration(180L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0265, code lost:
    
        if (r16.currentSubType == (r8 == r16.phoneContactsRow ? 1 : 0)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x027f, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x027d, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x027b, code lost:
    
        if (r16.currentType == (r8 == r9 ? 0 : r8 == r16.myContactsRow ? 2 : r8 == r16.nobodyRow ? 1 : 3)) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateRows(boolean z) {
        ArrayList arrayList;
        int i;
        RecyclerView.ViewHolder findContainingViewHolder;
        boolean z2;
        TLRPC.UserFull userFull;
        DiffCallback diffCallback = null;
        Object[] objArr = 0;
        if (z) {
            DiffCallback diffCallback2 = new DiffCallback();
            diffCallback2.fillPositions(diffCallback2.oldPositionToItem);
            diffCallback2.oldRowCount = this.rowCount;
            diffCallback = diffCallback2;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.photoForRestDescriptionRow = -1;
        this.messageRow = -1;
        this.setBirthdayRow = -1;
        this.phoneDetailRow = -1;
        this.phoneSectionRow = -1;
        this.phoneEverybodyRow = -1;
        this.phoneContactsRow = -1;
        this.alwaysShareRow = -1;
        this.neverShareRow = -1;
        this.p2pSectionRow = -1;
        this.p2pRow = -1;
        this.detailRow = -1;
        this.detailRow2 = -1;
        this.p2pDetailRow = -1;
        this.readDetailRow = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.shareSectionRow = -1;
        this.shareDetailRow = -1;
        this.payRow = -1;
        this.priceHeaderRow = -1;
        this.priceRow = -1;
        this.priceInfoRow = -1;
        this.priceButtonRow = -1;
        this.readPremiumRow = -1;
        this.readPremiumDetailRow = -1;
        this.showGiftIconRow = -1;
        this.showGiftIconInfoRow = -1;
        this.giftTypesHeaderRow = -1;
        this.giftTypeUnlimitedRow = -1;
        this.giftTypeLimitedRow = -1;
        this.giftTypeUniqueRow = -1;
        this.giftTypePremiumRow = -1;
        this.giftTypesInfoRow = -1;
        this.rowCount = 0;
        int i2 = this.rulesType;
        if (i2 == 12) {
            this.showGiftIconRow = 0;
            this.rowCount = 2;
            this.showGiftIconInfoRow = 1;
        }
        if (i2 == 11 && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null && userFull.birthday == null) {
            int i3 = this.rowCount;
            this.rowCount = i3 + 1;
            this.setBirthdayRow = i3;
        }
        int i4 = this.rulesType;
        if (i4 == 5) {
            int i5 = this.rowCount;
            this.rowCount = i5 + 1;
            this.messageRow = i5;
        }
        int i6 = this.rowCount;
        this.sectionRow = i6;
        this.everybodyRow = i6 + 1;
        int i7 = i6 + 3;
        this.rowCount = i7;
        this.myContactsRow = i6 + 2;
        if (i4 == 4 || i4 == 9 || i4 == 0 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6 || i4 == 8 || i4 == 1 || i4 == 11 || i4 == 12) {
            this.rowCount = i6 + 4;
            this.nobodyRow = i7;
        }
        if (getMessagesController().starsPaidMessagesAvailable && this.rulesType == 10) {
            int i8 = this.rowCount;
            this.rowCount = i8 + 1;
            this.payRow = i8;
        }
        int i9 = this.rulesType;
        if (i9 == 6 && this.currentType == 1) {
            int i10 = this.rowCount;
            this.phoneDetailRow = i10;
            this.phoneSectionRow = i10 + 1;
            this.phoneEverybodyRow = i10 + 2;
            this.rowCount = i10 + 4;
            this.phoneContactsRow = i10 + 3;
        }
        if (i9 == 10 && this.currentType == 3) {
            int i11 = this.rowCount;
            this.rowCount = i11 + 1;
            this.detailRow2 = i11;
        } else {
            int i12 = this.rowCount;
            this.rowCount = i12 + 1;
            this.detailRow = i12;
        }
        if (i9 == 10) {
            if (this.currentType == 3) {
                int i13 = this.rowCount;
                this.priceHeaderRow = i13;
                this.rowCount = i13 + 2;
                this.priceRow = i13 + 1;
                if (!getUserConfig().isPremium()) {
                    int i14 = this.rowCount;
                    this.rowCount = i14 + 1;
                    this.priceButtonRow = i14;
                }
                int i15 = this.rowCount;
                this.rowCount = i15 + 1;
                this.priceInfoRow = i15;
                if (getUserConfig().isPremium()) {
                    int i16 = this.rowCount;
                    this.shareSectionRow = i16;
                    this.alwaysShareRow = i16 + 1;
                    this.rowCount = i16 + 3;
                    this.shareDetailRow = i16 + 2;
                }
            }
        } else if (i9 != 8 || getUserConfig().isPremium()) {
            int i17 = this.rowCount;
            int i18 = i17 + 1;
            this.rowCount = i18;
            this.shareSectionRow = i17;
            int i19 = this.currentType;
            if (i19 == 1 || i19 == 2) {
                this.rowCount = i17 + 2;
                this.alwaysShareRow = i18;
            }
            if (i19 == 0 || i19 == 2) {
                int i20 = this.rowCount;
                this.rowCount = i20 + 1;
                this.neverShareRow = i20;
            }
            int i21 = this.rowCount;
            int i22 = i21 + 1;
            this.rowCount = i22;
            this.shareDetailRow = i21;
            int i23 = this.rulesType;
            if (i23 == 2) {
                this.p2pSectionRow = i22;
                this.p2pRow = i21 + 2;
                this.rowCount = i21 + 4;
                this.p2pDetailRow = i21 + 3;
            }
            if (i23 == 4 && (this.currentMinus.size() > 0 || (i = this.currentType) == 2 || i == 1)) {
                int i24 = this.rowCount;
                int i25 = i24 + 1;
                this.rowCount = i25;
                this.photoForRestRow = i24;
                if (this.avatarForRest != null) {
                    this.rowCount = i24 + 2;
                    this.currentPhotoForRestRow = i25;
                }
                int i26 = this.rowCount;
                this.rowCount = i26 + 1;
                this.photoForRestDescriptionRow = i26;
            }
            if (this.rulesType == 0 && (this.currentType != 0 || ((arrayList = this.currentMinus) != null && !arrayList.isEmpty()))) {
                int i27 = this.rowCount;
                this.readRow = i27;
                this.rowCount = i27 + 2;
                this.readDetailRow = i27 + 1;
            }
            if (this.rulesType == 0 && !getMessagesController().premiumFeaturesBlocked()) {
                int i28 = this.rowCount;
                this.readPremiumRow = i28;
                this.rowCount = i28 + 2;
                this.readPremiumDetailRow = i28 + 1;
            }
        }
        if (this.rulesType == 12) {
            int i29 = this.rowCount;
            this.giftTypesHeaderRow = i29;
            this.giftTypeLimitedRow = i29 + 1;
            this.giftTypeUnlimitedRow = i29 + 2;
            this.giftTypeUniqueRow = i29 + 3;
            this.giftTypePremiumRow = i29 + 4;
            this.rowCount = i29 + 6;
            this.giftTypesInfoRow = i29 + 5;
        }
        setMessageText();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            if (!z) {
                listAdapter.notifyDataSetChanged();
                return;
            }
            int childCount = this.listView.getChildCount();
            for (int i30 = 0; i30 < childCount; i30++) {
                View childAt = this.listView.getChildAt(i30);
                if ((childAt instanceof RadioCell) && (findContainingViewHolder = this.listView.findContainingViewHolder(childAt)) != null) {
                    int adapterPosition = findContainingViewHolder.getAdapterPosition();
                    RadioCell radioCell = (RadioCell) childAt;
                    int i31 = this.everybodyRow;
                    if (adapterPosition == i31 || adapterPosition == this.myContactsRow || adapterPosition == this.nobodyRow || adapterPosition == this.payRow) {
                    }
                    radioCell.setChecked(z2, true);
                }
            }
            diffCallback.fillPositions(diffCallback.newPositionToItem);
            DiffUtil.calculateDiff(diffCallback).dispatchUpdatesTo(this.listAdapter);
            AndroidUtilities.updateVisibleRows(this.listView);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean canBeginSlide() {
        return checkDiscard();
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public /* synthetic */ boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.-CC.$default$canFinishFragment(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    @Override // org.telegram.ui.ActionBar.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View createView(Context context) {
        ActionBar actionBar;
        int i;
        if (this.rulesType == 5) {
            this.messageCell = new MessageCell(context);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i2 = this.rulesType;
        if (i2 == 6) {
            actionBar = this.actionBar;
            i = R.string.PrivacyPhone;
        } else if (i2 == 5) {
            actionBar = this.actionBar;
            i = R.string.PrivacyForwards;
        } else if (i2 == 4) {
            actionBar = this.actionBar;
            i = R.string.PrivacyProfilePhoto;
        } else if (i2 == 9) {
            actionBar = this.actionBar;
            i = R.string.PrivacyBio;
        } else if (i2 == 3) {
            actionBar = this.actionBar;
            i = R.string.PrivacyP2P;
        } else if (i2 == 2) {
            actionBar = this.actionBar;
            i = R.string.Calls;
        } else if (i2 == 1) {
            actionBar = this.actionBar;
            i = R.string.PrivacyInvites;
        } else if (i2 == 8) {
            actionBar = this.actionBar;
            i = R.string.PrivacyVoiceMessages;
        } else if (i2 == 0) {
            actionBar = this.actionBar;
            i = R.string.PrivacyLastSeen;
        } else if (i2 == 10) {
            actionBar = this.actionBar;
            i = R.string.PrivacyMessages;
        } else {
            if (i2 != 11) {
                if (i2 == 12) {
                    actionBar = this.actionBar;
                    i = R.string.PrivacyGifts;
                }
                this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.PrivacyControlActivity.1
                    @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
                    public void onItemClick(int i3) {
                        if (i3 == -1) {
                            if (PrivacyControlActivity.this.checkDiscard()) {
                                PrivacyControlActivity.this.lambda$onBackPressed$354();
                            }
                        } else if (i3 == 1) {
                            PrivacyControlActivity.this.processDone();
                        }
                    }
                });
                ActionBarMenu createMenu = this.actionBar.createMenu();
                Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
                int i3 = Theme.key_actionBarDefaultIcon;
                mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3), PorterDuff.Mode.MULTIPLY));
                CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(mutate, new CircularProgressDrawable(Theme.getColor(i3)));
                this.doneButtonDrawable = crossfadeDrawable;
                this.doneButton = createMenu.addItemWithWidth(1, crossfadeDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
                boolean hasChanges = hasChanges();
                this.doneButton.setAlpha(!hasChanges ? 1.0f : 0.0f);
                this.doneButton.setScaleX(!hasChanges ? 1.0f : 0.0f);
                this.doneButton.setScaleY(hasChanges ? 1.0f : 0.0f);
                this.doneButton.setEnabled(hasChanges);
                this.listAdapter = new ListAdapter(context);
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
                RecyclerListView recyclerListView = new RecyclerListView(context) { // from class: org.telegram.ui.PrivacyControlActivity.2
                    @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
                    protected void dispatchDraw(Canvas canvas) {
                        drawSectionBackground(canvas, PrivacyControlActivity.this.shareSectionRow, PrivacyControlActivity.this.shareDetailRow - 1, getThemedColor(Theme.key_windowBackgroundWhite));
                        super.dispatchDraw(canvas);
                    }
                };
                this.listView = recyclerListView;
                recyclerListView.setLayoutManager(new LinearLayoutManager(context, 1, false));
                this.listView.setVerticalScrollBarEnabled(false);
                ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
                frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
                this.listView.setAdapter(this.listAdapter);
                this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda0
                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                    public final void onItemClick(View view, int i4) {
                        PrivacyControlActivity.this.lambda$createView$9(view, i4);
                    }
                });
                DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() { // from class: org.telegram.ui.PrivacyControlActivity.3
                    @Override // androidx.recyclerview.widget.DefaultItemAnimator
                    protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                        super.onMoveAnimationUpdate(viewHolder);
                        PrivacyControlActivity.this.listView.invalidate();
                    }
                };
                defaultItemAnimator.setDurations(350L);
                defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                defaultItemAnimator.setDelayAnimations(false);
                this.listView.setItemAnimator(defaultItemAnimator);
                setMessageText();
                return this.fragmentView;
            }
            actionBar = this.actionBar;
            i = R.string.PrivacyBirthday;
        }
        actionBar.setTitle(LocaleController.getString(i));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.PrivacyControlActivity.1
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i32) {
                if (i32 == -1) {
                    if (PrivacyControlActivity.this.checkDiscard()) {
                        PrivacyControlActivity.this.lambda$onBackPressed$354();
                    }
                } else if (i32 == 1) {
                    PrivacyControlActivity.this.processDone();
                }
            }
        });
        ActionBarMenu createMenu2 = this.actionBar.createMenu();
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i32 = Theme.key_actionBarDefaultIcon;
        mutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i32), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable2 = new CrossfadeDrawable(mutate2, new CircularProgressDrawable(Theme.getColor(i32)));
        this.doneButtonDrawable = crossfadeDrawable2;
        this.doneButton = createMenu2.addItemWithWidth(1, crossfadeDrawable2, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        boolean hasChanges2 = hasChanges();
        this.doneButton.setAlpha(!hasChanges2 ? 1.0f : 0.0f);
        this.doneButton.setScaleX(!hasChanges2 ? 1.0f : 0.0f);
        this.doneButton.setScaleY(hasChanges2 ? 1.0f : 0.0f);
        this.doneButton.setEnabled(hasChanges2);
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        frameLayout2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        RecyclerListView recyclerListView2 = new RecyclerListView(context) { // from class: org.telegram.ui.PrivacyControlActivity.2
            @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                drawSectionBackground(canvas, PrivacyControlActivity.this.shareSectionRow, PrivacyControlActivity.this.shareDetailRow - 1, getThemedColor(Theme.key_windowBackgroundWhite));
                super.dispatchDraw(canvas);
            }
        };
        this.listView = recyclerListView2;
        recyclerListView2.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i4) {
                PrivacyControlActivity.this.lambda$createView$9(view, i4);
            }
        });
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() { // from class: org.telegram.ui.PrivacyControlActivity.3
            @Override // androidx.recyclerview.widget.DefaultItemAnimator
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                PrivacyControlActivity.this.listView.invalidate();
            }
        };
        defaultItemAnimator2.setDurations(350L);
        defaultItemAnimator2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator2.setDelayAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator2);
        setMessageText();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageCell messageCell;
        if (i == NotificationCenter.privacyRulesUpdated) {
            checkPrivacy();
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            this.listView.invalidateViews();
        } else {
            if (i != NotificationCenter.didSetNewWallpapper || (messageCell = this.messageCell) == null) {
                return;
            }
            messageCell.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public void didStartUpload(boolean z, boolean z2) {
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public /* synthetic */ void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.-CC.$default$didUploadFailed(this);
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PrivacyControlActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity.this.lambda$didUploadPhoto$2(photoSize2, inputFile, inputFile2, d, videoSize, photoSize);
            }
        });
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public /* synthetic */ PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.-CC.$default$getCloseIntoObject(this);
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public /* synthetic */ String getInitialSearchString() {
        return ImageUpdater.ImageUpdaterDelegate.-CC.$default$getInitialSearchString(this);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextSettingsCell.class, HeaderCell.class, RadioCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i));
        ActionBar actionBar = this.actionBar;
        int i2 = ThemeDescription.FLAG_BACKGROUND;
        int i3 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i2, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        int i5 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i5));
        int i6 = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{RadioCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackground));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackgroundChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, Theme.key_chat_inBubble));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgInSelectedDrawable, Theme.chat_msgInMediaSelectedDrawable}, null, Theme.key_chat_inBubbleSelected));
        RecyclerListView recyclerListView = this.listView;
        Drawable[] shadowDrawables = Theme.chat_msgInDrawable.getShadowDrawables();
        int i7 = Theme.key_chat_inBubbleShadow;
        arrayList.add(new ThemeDescription(recyclerListView, 0, null, null, shadowDrawables, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgInMediaDrawable.getShadowDrawables(), null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubble));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient1));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient2));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient3));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, Theme.key_chat_outBubbleSelected));
        RecyclerListView recyclerListView2 = this.listView;
        Drawable[] shadowDrawables2 = Theme.chat_msgOutDrawable.getShadowDrawables();
        int i8 = Theme.key_chat_outBubbleShadow;
        arrayList.add(new ThemeDescription(recyclerListView2, 0, null, null, shadowDrawables2, null, i8));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgOutMediaDrawable.getShadowDrawables(), null, i8));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_messageTextIn));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_messageTextOut));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckDrawable}, null, Theme.key_chat_outSentCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckReadDrawable, Theme.chat_msgOutHalfCheckDrawable}, null, Theme.key_chat_outSentCheckRead));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckReadSelectedDrawable, Theme.chat_msgOutHalfCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckReadSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgMediaCheckDrawable, Theme.chat_msgMediaHalfCheckDrawable}, null, Theme.key_chat_mediaSentCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyLine));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyLine));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyNameText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyNameText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyMessageText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyMessageText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inTimeText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outTimeText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inTimeSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outTimeSelectedText));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed() {
        return checkDiscard();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        checkPrivacy();
        updateRows(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        super.onPause();
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        updateRows(false);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onResume();
        }
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public /* synthetic */ void onUploadProgressChanged(float f) {
        ImageUpdater.ImageUpdaterDelegate.-CC.$default$onUploadProgressChanged(this, f);
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public /* synthetic */ boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.-CC.$default$supportsBulletin(this);
    }
}
