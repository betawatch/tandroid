package org.telegram.ui.iv;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichInlineButtonEditor;

/* loaded from: classes5.dex */
public abstract class RichInlineButtonEditor {

    /* JADX INFO: Access modifiers changed from: private */
    interface BlockApply {
        void run(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface UserPicked {
        void run(long j);
    }

    public static ItemOptions show(ItemOptions itemOptions, BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.InlineButtonEdit inlineButtonEdit) {
        return show(itemOptions, baseFragment, context, resourcesProvider, inlineButtonEdit, false);
    }

    public static ItemOptions show(ItemOptions itemOptions, final BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, final RichEditorListView.InlineButtonEdit inlineButtonEdit, final boolean z) {
        TL_keyboard.InlineButtonType type = inlineButtonEdit.getType();
        if (type != null) {
            editExisting(baseFragment, inlineButtonEdit, type, z);
            return null;
        }
        itemOptions.add(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RichInlineButtonEditor.showInlineLinkDialog(RichEditorListView.InlineButtonEdit.this, z);
            }
        }).add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RichInlineButtonEditor.showInlineCopyDialog(RichEditorListView.InlineButtonEdit.this, z);
            }
        }).add(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new Runnable() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RichInlineButtonEditor.showInlineUserPicker(BaseFragment.this, inlineButtonEdit, z);
            }
        });
        return itemOptions.show();
    }

    public static ItemOptions showBlock(ItemOptions itemOptions, BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.BlockButtonEdit blockButtonEdit) {
        return showBlock(itemOptions, baseFragment, context, resourcesProvider, blockButtonEdit, false);
    }

    public static ItemOptions showBlock(ItemOptions itemOptions, final BaseFragment baseFragment, final Context context, final Theme.ResourcesProvider resourcesProvider, final RichEditorListView.BlockButtonEdit blockButtonEdit, final boolean z) {
        TL_keyboard.InlineButtonType type = blockButtonEdit.getType();
        if (type != null) {
            editExistingBlock(baseFragment, context, resourcesProvider, blockButtonEdit, type, z);
            return null;
        }
        itemOptions.add(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                RichInlineButtonEditor.showBlockLinkDialog(context, resourcesProvider, blockButtonEdit, z);
            }
        }).add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                RichInlineButtonEditor.showBlockCopyDialog(context, resourcesProvider, blockButtonEdit, z);
            }
        }).add(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new Runnable() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                RichInlineButtonEditor.showBlockProfileDialog(BaseFragment.this, context, resourcesProvider, blockButtonEdit, z);
            }
        });
        return itemOptions.show();
    }

    private static void editExisting(BaseFragment baseFragment, RichEditorListView.InlineButtonEdit inlineButtonEdit, TL_keyboard.InlineButtonType inlineButtonType, boolean z) {
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            showInlineLinkDialog(inlineButtonEdit, z);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            showInlineCopyDialog(inlineButtonEdit, z);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            showInlineUserPicker(baseFragment, inlineButtonEdit, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showInlineLinkDialog(final RichEditorListView.InlineButtonEdit inlineButtonEdit, boolean z) {
        TL_keyboard.InlineButtonType type = inlineButtonEdit.getType();
        boolean z2 = type instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z2 ? ((TL_keyboard.TL_inlineButtonTypeUrl) type).url : "http://";
        inlineButtonEdit.hideSelectionUi();
        inlineButtonEdit.showInputDialog(LocaleController.getString(z2 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z, new EditTextCaption.InputDialogCallback() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda4
            @Override // org.telegram.ui.Components.EditTextCaption.InputDialogCallback
            public final void run(String str2) {
                RichInlineButtonEditor.lambda$showInlineLinkDialog$6(RichEditorListView.InlineButtonEdit.this, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showInlineLinkDialog$6(RichEditorListView.InlineButtonEdit inlineButtonEdit, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
        tL_inlineButtonTypeUrl.url = str;
        inlineButtonEdit.apply(tL_inlineButtonTypeUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showInlineCopyDialog(final RichEditorListView.InlineButtonEdit inlineButtonEdit, boolean z) {
        TL_keyboard.InlineButtonType type = inlineButtonEdit.getType();
        boolean z2 = type instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String label = z2 ? ((TL_keyboard.TL_inlineButtonTypeCopy) type).copy_text : inlineButtonEdit.getLabel();
        inlineButtonEdit.hideSelectionUi();
        inlineButtonEdit.showInputDialog(LocaleController.getString(z2 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), label, false, !z, new EditTextCaption.InputDialogCallback() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda5
            @Override // org.telegram.ui.Components.EditTextCaption.InputDialogCallback
            public final void run(String str) {
                RichInlineButtonEditor.lambda$showInlineCopyDialog$7(RichEditorListView.InlineButtonEdit.this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showInlineCopyDialog$7(RichEditorListView.InlineButtonEdit inlineButtonEdit, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
        tL_inlineButtonTypeCopy.copy_text = str;
        inlineButtonEdit.apply(tL_inlineButtonTypeCopy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showInlineUserPicker(BaseFragment baseFragment, final RichEditorListView.InlineButtonEdit inlineButtonEdit, boolean z) {
        inlineButtonEdit.dismissSelectionUi();
        showUserPicker(baseFragment, z, new UserPicked() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda6
            @Override // org.telegram.ui.iv.RichInlineButtonEditor.UserPicked
            public final void run(long j) {
                RichInlineButtonEditor.lambda$showInlineUserPicker$8(RichEditorListView.InlineButtonEdit.this, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showInlineUserPicker$8(RichEditorListView.InlineButtonEdit inlineButtonEdit, long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        inlineButtonEdit.apply(tL_inlineButtonTypeUserProfile);
    }

    private static void editExistingBlock(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.BlockButtonEdit blockButtonEdit, TL_keyboard.InlineButtonType inlineButtonType, boolean z) {
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            showBlockLinkDialog(context, resourcesProvider, blockButtonEdit, z);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            showBlockCopyDialog(context, resourcesProvider, blockButtonEdit, z);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            showBlockProfileDialog(baseFragment, context, resourcesProvider, blockButtonEdit, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showBlockLinkDialog(Context context, Theme.ResourcesProvider resourcesProvider, final RichEditorListView.BlockButtonEdit blockButtonEdit, boolean z) {
        boolean exists = blockButtonEdit.exists();
        TL_keyboard.InlineButtonType type = blockButtonEdit.getType();
        showBlockTextAndValueDialog(context, resourcesProvider, blockButtonEdit, z, LocaleController.getString(exists ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), type instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) type).url : "http://", new BlockApply() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda11
            @Override // org.telegram.ui.iv.RichInlineButtonEditor.BlockApply
            public final void run(String str, String str2) {
                RichInlineButtonEditor.lambda$showBlockLinkDialog$9(RichEditorListView.BlockButtonEdit.this, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBlockLinkDialog$9(RichEditorListView.BlockButtonEdit blockButtonEdit, String str, String str2) {
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
        tL_inlineButtonTypeUrl.url = str2;
        blockButtonEdit.apply(str, tL_inlineButtonTypeUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showBlockCopyDialog(Context context, Theme.ResourcesProvider resourcesProvider, final RichEditorListView.BlockButtonEdit blockButtonEdit, boolean z) {
        boolean exists = blockButtonEdit.exists();
        TL_keyboard.InlineButtonType type = blockButtonEdit.getType();
        showBlockTextAndValueDialog(context, resourcesProvider, blockButtonEdit, z, LocaleController.getString(exists ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), type instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) type).copy_text : "", new BlockApply() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda16
            @Override // org.telegram.ui.iv.RichInlineButtonEditor.BlockApply
            public final void run(String str, String str2) {
                RichInlineButtonEditor.lambda$showBlockCopyDialog$10(RichEditorListView.BlockButtonEdit.this, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBlockCopyDialog$10(RichEditorListView.BlockButtonEdit blockButtonEdit, String str, String str2) {
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
        tL_inlineButtonTypeCopy.copy_text = str2;
        blockButtonEdit.apply(str, tL_inlineButtonTypeCopy);
    }

    private static void showBlockTextAndValueDialog(Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.BlockButtonEdit blockButtonEdit, boolean z, String str, String str2, String str3, final BlockApply blockApply) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        final EditTextBoldCursor createField = createField(context, resourcesProvider, LocaleController.getString(R.string.RichEditorButtonText), blockButtonEdit.getLabel());
        final EditTextBoldCursor createField2 = createField(context, resourcesProvider, str2, str3);
        linearLayout.addView(createField, LayoutHelper.createLinear(-1, 64));
        linearLayout.addView(createField2, LayoutHelper.createLinear(-1, 64));
        AlertDialog.Builder createInputDialogBuilder = createInputDialogBuilder(context, resourcesProvider, z);
        createInputDialogBuilder.setTitle(str).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda19
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                RichInlineButtonEditor.lambda$showBlockTextAndValueDialog$11(EditTextBoldCursor.this, createField2, blockApply, alertDialog, i);
            }
        });
        addCancelAndDelete(createInputDialogBuilder, blockButtonEdit);
        if (!TextUtils.isEmpty(createField.getText())) {
            createField = createField2;
        }
        showInputDialog(createInputDialogBuilder, createField, blockButtonEdit.exists() ? -3 : 0, resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBlockTextAndValueDialog$11(EditTextBoldCursor editTextBoldCursor, EditTextBoldCursor editTextBoldCursor2, BlockApply blockApply, AlertDialog alertDialog, int i) {
        String trim = editTextBoldCursor.getText().toString().trim();
        String trim2 = editTextBoldCursor2.getText().toString().trim();
        if (TextUtils.isEmpty(trim) || TextUtils.isEmpty(trim2)) {
            return;
        }
        blockApply.run(trim, trim2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showBlockProfileDialog(final BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, final RichEditorListView.BlockButtonEdit blockButtonEdit, final boolean z) {
        final boolean exists = blockButtonEdit.exists();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int i = 0;
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        final EditTextBoldCursor createField = createField(context, resourcesProvider, LocaleController.getString(R.string.RichEditorButtonText), blockButtonEdit.getLabel());
        linearLayout.addView(createField, LayoutHelper.createLinear(-1, 64));
        final Runnable runnable = new Runnable() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                RichInlineButtonEditor.lambda$showBlockProfileDialog$13(EditTextBoldCursor.this, baseFragment, z, blockButtonEdit);
            }
        };
        AlertDialog.Builder createInputDialogBuilder = createInputDialogBuilder(context, resourcesProvider, z);
        createInputDialogBuilder.setTitle(LocaleController.getString(exists ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton)).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda13
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i2) {
                RichInlineButtonEditor.lambda$showBlockProfileDialog$14(exists, runnable, createField, blockButtonEdit, alertDialog, i2);
            }
        });
        if (exists) {
            i = -4;
            createInputDialogBuilder.setNeutralButton(LocaleController.getString(R.string.RichEditorChangeUser), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda14
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i2) {
                    runnable.run();
                }
            }).setButton(-4, LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda15
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i2) {
                    RichEditorListView.BlockButtonEdit.this.delete();
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).twoRowsButtonsWhenNeeded();
        } else {
            createInputDialogBuilder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        }
        showInputDialog(createInputDialogBuilder, createField, i, resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBlockProfileDialog$13(EditTextBoldCursor editTextBoldCursor, BaseFragment baseFragment, boolean z, final RichEditorListView.BlockButtonEdit blockButtonEdit) {
        final String trim = editTextBoldCursor.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        showUserPicker(baseFragment, z, new UserPicked() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda18
            @Override // org.telegram.ui.iv.RichInlineButtonEditor.UserPicked
            public final void run(long j) {
                RichInlineButtonEditor.lambda$showBlockProfileDialog$12(RichEditorListView.BlockButtonEdit.this, trim, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBlockProfileDialog$12(RichEditorListView.BlockButtonEdit blockButtonEdit, String str, long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        blockButtonEdit.apply(str, tL_inlineButtonTypeUserProfile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBlockProfileDialog$14(boolean z, Runnable runnable, EditTextBoldCursor editTextBoldCursor, RichEditorListView.BlockButtonEdit blockButtonEdit, AlertDialog alertDialog, int i) {
        if (!z) {
            runnable.run();
            return;
        }
        String trim = editTextBoldCursor.getText().toString().trim();
        if (TextUtils.isEmpty(trim) || blockButtonEdit.getUserId() <= 0) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = blockButtonEdit.getUserId();
        blockButtonEdit.apply(trim, tL_inlineButtonTypeUserProfile);
    }

    private static AlertDialog.Builder createInputDialogBuilder(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        if (z) {
            return new AlertDialog.Builder(context, resourcesProvider);
        }
        return new AlertDialogDecor.Builder(context, resourcesProvider);
    }

    private static void addCancelAndDelete(AlertDialog.Builder builder, final RichEditorListView.BlockButtonEdit blockButtonEdit) {
        if (blockButtonEdit.exists()) {
            builder.setNeutralButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    RichEditorListView.BlockButtonEdit.this.delete();
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        } else {
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        }
    }

    private static EditTextBoldCursor createField(Context context, Theme.ResourcesProvider resourcesProvider, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        editTextBoldCursor.setHeaderHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
        editTextBoldCursor.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
        return editTextBoldCursor;
    }

    private static AlertDialog showInputDialog(AlertDialog.Builder builder, final EditTextBoldCursor editTextBoldCursor, int i, Theme.ResourcesProvider resourcesProvider) {
        AlertDialog create = builder.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda17
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                RichInlineButtonEditor.lambda$showInputDialog$18(EditTextBoldCursor.this, dialogInterface);
            }
        });
        create.showDelayed(250L);
        if (i != 0 && (create.getButton(i) instanceof TextView)) {
            ((TextView) create.getButton(i)).setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
        }
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showInputDialog$18(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
        editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
    }

    private static void showUserPicker(BaseFragment baseFragment, boolean z, final UserPicked userPicked) {
        if (baseFragment == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() { // from class: org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda7
            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
            public /* synthetic */ boolean canSelectStories() {
                return DialogsActivity.DialogsActivityDelegate.-CC.$default$canSelectStories(this);
            }

            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
            public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z2, boolean z3, int i, int i2, TopicsFragment topicsFragment) {
                boolean lambda$showUserPicker$19;
                lambda$showUserPicker$19 = RichInlineButtonEditor.lambda$showUserPicker$19(RichInlineButtonEditor.UserPicked.this, dialogsActivity2, arrayList, charSequence, z2, z3, i, i2, topicsFragment);
                return lambda$showUserPicker$19;
            }

            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
            public /* synthetic */ boolean didSelectStories(DialogsActivity dialogsActivity2) {
                return DialogsActivity.DialogsActivityDelegate.-CC.$default$didSelectStories(this, dialogsActivity2);
            }
        });
        if (z) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            baseFragment.showAsSheet(dialogsActivity, bottomSheetParams);
            return;
        }
        baseFragment.presentFragment(dialogsActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showUserPicker$19(UserPicked userPicked, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        if (arrayList == null || arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        userPicked.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        dialogsActivity.finishFragment();
        return true;
    }
}
