package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
/* loaded from: classes3.dex */
public class ContactAddActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private boolean addContact;
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImage;
    private CheckBoxCell checkBoxCell;
    private ContactAddActivityDelegate delegate;
    private View doneButton;
    private EditTextBoldCursor firstNameField;
    private TextView infoTextView;
    private EditTextBoldCursor lastNameField;
    private TextView nameTextView;
    private boolean needAddException;
    private TextView onlineTextView;
    boolean paused;
    private String phone;
    private Theme.ResourcesProvider resourcesProvider;
    private long user_id;

    /* loaded from: classes3.dex */
    public interface ContactAddActivityDelegate {
        void didAddToContacts();
    }

    public static /* synthetic */ boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public ContactAddActivity(Bundle bundle) {
        super(bundle);
    }

    public ContactAddActivity(Bundle bundle, Theme.ResourcesProvider resourcesProvider) {
        super(bundle);
        this.resourcesProvider = resourcesProvider;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        this.user_id = getArguments().getLong("user_id", 0L);
        this.phone = getArguments().getString("phone");
        this.addContact = getArguments().getBoolean("addContact", false);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        this.needAddException = notificationsSettings.getBoolean("dialog_bar_exception" + this.user_id, false);
        return ((this.user_id > 0L ? 1 : (this.user_id == 0L ? 0 : -1)) != 0 ? getMessagesController().getUser(Long.valueOf(this.user_id)) : null) != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        String str;
        this.actionBar.setItemsBackgroundColor(Theme.getColor("avatar_actionBarSelectorBlue", this.resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor("actionBarDefaultIcon", this.resourcesProvider), false);
        this.actionBar.setBackButtonImage(2131165449);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.addContact) {
            this.actionBar.setTitle(LocaleController.getString("NewContact", 2131626826));
        } else {
            this.actionBar.setTitle(LocaleController.getString("EditName", 2131625603));
        }
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        this.doneButton = this.actionBar.createMenu().addItem(1, LocaleController.getString("Done", 2131625541).toUpperCase());
        this.fragmentView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ((ScrollView) this.fragmentView).addView(linearLayout, LayoutHelper.createScroll(-1, -2, 51));
        linearLayout.setOnTouchListener(ContactAddActivity$$ExternalSyntheticLambda1.INSTANCE);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 24.0f, 24.0f, 24.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImage = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(this.avatarImage, LayoutHelper.createFrame(60, 60, (LocaleController.isRTL ? 5 : 3) | 48));
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", this.resourcesProvider));
        this.nameTextView.setTextSize(1, 20.0f);
        this.nameTextView.setLines(1);
        this.nameTextView.setMaxLines(1);
        this.nameTextView.setSingleLine(true);
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.nameTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.nameTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        TextView textView2 = this.nameTextView;
        boolean z = LocaleController.isRTL;
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? 0.0f : 80.0f, 3.0f, z ? 80.0f : 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.onlineTextView = textView3;
        textView3.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText3", this.resourcesProvider));
        this.onlineTextView.setTextSize(1, 14.0f);
        this.onlineTextView.setLines(1);
        this.onlineTextView.setMaxLines(1);
        this.onlineTextView.setSingleLine(true);
        this.onlineTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.onlineTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView4 = this.onlineTextView;
        boolean z2 = LocaleController.isRTL;
        frameLayout.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 80.0f, 32.0f, z2 ? 80.0f : 0.0f, 0.0f));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        this.firstNameField = anonymousClass2;
        anonymousClass2.setTextSize(1, 18.0f);
        this.firstNameField.setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText", this.resourcesProvider));
        this.firstNameField.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", this.resourcesProvider));
        this.firstNameField.setBackgroundDrawable(null);
        this.firstNameField.setLineColors(getThemedColor("windowBackgroundWhiteInputField"), getThemedColor("windowBackgroundWhiteInputFieldActivated"), getThemedColor("windowBackgroundWhiteRedText3"));
        this.firstNameField.setMaxLines(1);
        this.firstNameField.setLines(1);
        this.firstNameField.setSingleLine(true);
        this.firstNameField.setGravity(LocaleController.isRTL ? 5 : 3);
        this.firstNameField.setInputType(49152);
        this.firstNameField.setImeOptions(5);
        this.firstNameField.setHint(LocaleController.getString("FirstName", 2131625947));
        this.firstNameField.setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText", this.resourcesProvider));
        this.firstNameField.setCursorSize(AndroidUtilities.dp(20.0f));
        this.firstNameField.setCursorWidth(1.5f);
        linearLayout.addView(this.firstNameField, LayoutHelper.createLinear(-1, 36, 24.0f, 24.0f, 24.0f, 0.0f));
        this.firstNameField.setOnEditorActionListener(new ContactAddActivity$$ExternalSyntheticLambda2(this));
        this.firstNameField.setOnFocusChangeListener(new AnonymousClass3());
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context);
        this.lastNameField = anonymousClass4;
        anonymousClass4.setTextSize(1, 18.0f);
        this.lastNameField.setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText", this.resourcesProvider));
        this.lastNameField.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", this.resourcesProvider));
        this.lastNameField.setBackgroundDrawable(null);
        this.lastNameField.setLineColors(getThemedColor("windowBackgroundWhiteInputField"), getThemedColor("windowBackgroundWhiteInputFieldActivated"), getThemedColor("windowBackgroundWhiteRedText3"));
        this.lastNameField.setMaxLines(1);
        this.lastNameField.setLines(1);
        this.lastNameField.setSingleLine(true);
        this.lastNameField.setGravity(LocaleController.isRTL ? 5 : 3);
        this.lastNameField.setInputType(49152);
        this.lastNameField.setImeOptions(6);
        this.lastNameField.setHint(LocaleController.getString("LastName", 2131626415));
        this.lastNameField.setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText", this.resourcesProvider));
        this.lastNameField.setCursorSize(AndroidUtilities.dp(20.0f));
        this.lastNameField.setCursorWidth(1.5f);
        linearLayout.addView(this.lastNameField, LayoutHelper.createLinear(-1, 36, 24.0f, 16.0f, 24.0f, 0.0f));
        this.lastNameField.setOnEditorActionListener(new ContactAddActivity$$ExternalSyntheticLambda3(this));
        TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        if (user != null) {
            if (user.phone == null && (str = this.phone) != null) {
                user.phone = PhoneFormat.stripExceptNumbers(str);
            }
            this.firstNameField.setText(user.first_name);
            EditTextBoldCursor editTextBoldCursor = this.firstNameField;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            this.lastNameField.setText(user.last_name);
        }
        TextView textView5 = new TextView(context);
        this.infoTextView = textView5;
        textView5.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText4"));
        this.infoTextView.setTextSize(1, 14.0f);
        this.infoTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (this.addContact) {
            if (!this.needAddException || TextUtils.isEmpty(user.phone)) {
                linearLayout.addView(this.infoTextView, LayoutHelper.createLinear(-1, -2, 24.0f, 18.0f, 24.0f, 0.0f));
            }
            if (this.needAddException) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 0);
                this.checkBoxCell = checkBoxCell;
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                this.checkBoxCell.setText(LocaleController.formatString("SharePhoneNumberWith", 2131628344, UserObject.getFirstName(user)), "", true, false);
                this.checkBoxCell.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                this.checkBoxCell.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda0(this));
                linearLayout.addView(this.checkBoxCell, LayoutHelper.createLinear(-1, -2, 0.0f, 10.0f, 0.0f, 0.0f));
            }
        }
        return this.fragmentView;
    }

    /* renamed from: org.telegram.ui.ContactAddActivity$1 */
    /* loaded from: classes3.dex */
    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass1() {
            ContactAddActivity.this = r1;
        }

        @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
        public void onItemClick(int i) {
            if (i != -1) {
                if (i != 1 || ContactAddActivity.this.firstNameField.getText().length() == 0) {
                    return;
                }
                TLRPC$User user = ContactAddActivity.this.getMessagesController().getUser(Long.valueOf(ContactAddActivity.this.user_id));
                user.first_name = ContactAddActivity.this.firstNameField.getText().toString();
                user.last_name = ContactAddActivity.this.lastNameField.getText().toString();
                ContactAddActivity.this.getContactsController().addContact(user, ContactAddActivity.this.checkBoxCell != null && ContactAddActivity.this.checkBoxCell.isChecked());
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(((BaseFragment) ContactAddActivity.this).currentAccount).edit();
                edit.putInt("dialog_bar_vis3" + ContactAddActivity.this.user_id, 3).commit();
                ContactAddActivity.this.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ContactAddActivity.this.getNotificationCenter().postNotificationName(NotificationCenter.peerSettingsDidLoad, Long.valueOf(ContactAddActivity.this.user_id));
                ContactAddActivity.this.finishFragment();
                if (ContactAddActivity.this.delegate == null) {
                    return;
                }
                ContactAddActivity.this.delegate.didAddToContacts();
                return;
            }
            ContactAddActivity.this.finishFragment();
        }
    }

    /* renamed from: org.telegram.ui.ContactAddActivity$2 */
    /* loaded from: classes3.dex */
    class AnonymousClass2 extends EditTextBoldCursor {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context) {
            super(context);
            ContactAddActivity.this = r1;
        }

        @Override // org.telegram.ui.Components.EditTextBoldCursor
        protected Theme.ResourcesProvider getResourcesProvider() {
            return ContactAddActivity.this.resourcesProvider;
        }
    }

    public /* synthetic */ boolean lambda$createView$1(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            this.lastNameField.requestFocus();
            EditTextBoldCursor editTextBoldCursor = this.lastNameField;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            return true;
        }
        return false;
    }

    /* renamed from: org.telegram.ui.ContactAddActivity$3 */
    /* loaded from: classes3.dex */
    class AnonymousClass3 implements View.OnFocusChangeListener {
        boolean focused;

        AnonymousClass3() {
            ContactAddActivity.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (!ContactAddActivity.this.paused && !z && this.focused) {
                FileLog.d("changed");
            }
            this.focused = z;
        }
    }

    /* renamed from: org.telegram.ui.ContactAddActivity$4 */
    /* loaded from: classes3.dex */
    class AnonymousClass4 extends EditTextBoldCursor {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Context context) {
            super(context);
            ContactAddActivity.this = r1;
        }

        @Override // org.telegram.ui.Components.EditTextBoldCursor
        protected Theme.ResourcesProvider getResourcesProvider() {
            return ContactAddActivity.this.resourcesProvider;
        }
    }

    public /* synthetic */ boolean lambda$createView$2(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.doneButton.performClick();
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$createView$3(View view) {
        CheckBoxCell checkBoxCell = this.checkBoxCell;
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    public void setDelegate(ContactAddActivityDelegate contactAddActivityDelegate) {
        this.delegate = contactAddActivityDelegate;
    }

    private void updateAvatarLayout() {
        TLRPC$User user;
        if (this.nameTextView == null || (user = getMessagesController().getUser(Long.valueOf(this.user_id))) == null) {
            return;
        }
        if (TextUtils.isEmpty(user.phone)) {
            this.nameTextView.setText(LocaleController.getString("MobileHidden", 2131626779));
            this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("MobileHiddenExceptionInfo", 2131626780, UserObject.getFirstName(user))));
        } else {
            TextView textView = this.nameTextView;
            PhoneFormat phoneFormat = PhoneFormat.getInstance();
            textView.setText(phoneFormat.format("+" + user.phone));
            if (this.needAddException) {
                this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", 2131626781, UserObject.getFirstName(user))));
            }
        }
        this.onlineTextView.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        BackupImageView backupImageView = this.avatarImage;
        AvatarDrawable avatarDrawable = new AvatarDrawable(user);
        this.avatarDrawable = avatarDrawable;
        backupImageView.setForUserOrChat(user, avatarDrawable);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_STATUS) == 0) {
                return;
            }
            updateAvatarLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        super.onPause();
        this.paused = true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        updateAvatarLayout();
        EditTextBoldCursor editTextBoldCursor = this.firstNameField;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                return;
            }
            AndroidUtilities.showKeyboard(this.firstNameField);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.firstNameField.requestFocus();
            AndroidUtilities.showKeyboard(this.firstNameField);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ContactAddActivity$$ExternalSyntheticLambda4 contactAddActivity$$ExternalSyntheticLambda4 = new ContactAddActivity$$ExternalSyntheticLambda4(this);
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.nameTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.onlineTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.infoTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, contactAddActivity$$ExternalSyntheticLambda4, "avatar_text"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, contactAddActivity$$ExternalSyntheticLambda4, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, contactAddActivity$$ExternalSyntheticLambda4, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, contactAddActivity$$ExternalSyntheticLambda4, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, contactAddActivity$$ExternalSyntheticLambda4, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, contactAddActivity$$ExternalSyntheticLambda4, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, contactAddActivity$$ExternalSyntheticLambda4, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, contactAddActivity$$ExternalSyntheticLambda4, "avatar_backgroundPink"));
        return arrayList;
    }

    public /* synthetic */ void lambda$getThemeDescriptions$4() {
        TLRPC$User user;
        if (this.avatarImage == null || (user = getMessagesController().getUser(Long.valueOf(this.user_id))) == null) {
            return;
        }
        this.avatarDrawable.setInfo(user);
        this.avatarImage.invalidate();
    }
}
