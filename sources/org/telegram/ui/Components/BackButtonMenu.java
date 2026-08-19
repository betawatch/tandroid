package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BackButtonMenu;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TopicsFragment;

/* loaded from: classes5.dex */
public abstract class BackButtonMenu {

    public static class PulledDialog {
        Class activity;
        TLRPC.Chat chat;
        long dialogId;
        int filterId;
        int folderId;
        int stackIndex;
        TLRPC.TL_forumTopic topic;
        TLRPC.User user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0275  */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r1v24, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ActionBarPopupWindow show(final BaseFragment baseFragment, View view, long j, long j2, Theme.ResourcesProvider resourcesProvider) {
        ArrayList stackedHistoryDialogs;
        ArrayList arrayList;
        TLRPC.TL_forumTopic tL_forumTopic;
        boolean z;
        Drawable drawable;
        String str;
        ?? r1;
        if (baseFragment == null) {
            return null;
        }
        INavigationLayout parentLayout = baseFragment.getParentLayout();
        Activity parentActivity = baseFragment.getParentActivity();
        View fragmentView = baseFragment.getFragmentView();
        if (parentLayout == null || parentActivity == null || fragmentView == null) {
            return null;
        }
        long j3 = 0;
        if (j2 != 0 && !ChatObject.isMonoForum(baseFragment.getCurrentAccount(), j)) {
            stackedHistoryDialogs = getStackedHistoryForTopic(baseFragment, j, j2);
        } else {
            stackedHistoryDialogs = getStackedHistoryDialogs(baseFragment, j);
        }
        ArrayList arrayList2 = stackedHistoryDialogs;
        if (arrayList2.size() <= 0) {
            return null;
        }
        int i = R.drawable.popup_fixed_alert4;
        ?? actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(parentActivity, i, resourcesProvider);
        Rect rect = new Rect();
        baseFragment.getParentActivity().getResources().getDrawable(i).mutate().getPadding(rect);
        actionBarPopupWindowLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
        final AtomicReference atomicReference = new AtomicReference();
        int size = arrayList2.size();
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            long j4 = j3;
            if (i2 >= size) {
                break;
            }
            boolean z3 = i2 == 0;
            boolean z4 = i2 == size + (-1);
            final PulledDialog pulledDialog = (PulledDialog) arrayList2.get(i2);
            TLRPC.Chat chat = pulledDialog.chat;
            AtomicReference atomicReference2 = atomicReference;
            TLRPC.User user = pulledDialog.user;
            boolean z5 = z2;
            final INavigationLayout iNavigationLayout = parentLayout;
            TLRPC.TL_forumTopic tL_forumTopic2 = pulledDialog.topic;
            boolean z6 = z4;
            ?? frameLayout = new FrameLayout(parentActivity);
            int i3 = i2;
            frameLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            BackupImageView backupImageView = new BackupImageView(parentActivity);
            if (chat == null && user == null) {
                backupImageView.setRoundRadius(0);
            } else {
                backupImageView.setRoundRadius((chat == null || !chat.forum) ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f));
            }
            frameLayout.addView(backupImageView, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(parentActivity);
            textView.setLines(1);
            boolean z7 = z3;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388627, 52.0f, 0.0f, 8.0f, 0.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setScaleSize(0.8f);
            if (tL_forumTopic2 != null) {
                if (tL_forumTopic2.id == 1) {
                    backupImageView.setImageDrawable(ForumUtilities.createGeneralTopicDrawable(fragmentView.getContext(), 1.0f, Theme.getColor(Theme.key_chat_inMenu, resourcesProvider), false));
                    arrayList = arrayList2;
                } else if (tL_forumTopic2.icon_emoji_id != j4) {
                    arrayList = arrayList2;
                    backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(10, baseFragment.getCurrentAccount(), tL_forumTopic2.icon_emoji_id));
                } else {
                    arrayList = arrayList2;
                    backupImageView.setImageDrawable(ForumUtilities.createTopicDrawable(tL_forumTopic2, false));
                }
                textView.setText(tL_forumTopic2.title);
            } else {
                arrayList = arrayList2;
                if (chat != null) {
                    avatarDrawable.setInfo(baseFragment.getCurrentAccount(), chat);
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null && (r1 = chatPhoto.strippedBitmap) != 0) {
                        avatarDrawable = r1;
                    }
                    backupImageView.setImage(ImageLocation.getForChat(baseFragment.getCurrentAccount(), chat, 1), "50_50", avatarDrawable, chat);
                    textView.setText(chat.title);
                } else if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto == null || (drawable = userProfilePhoto.strippedBitmap) == null) {
                        drawable = avatarDrawable;
                    }
                    tL_forumTopic = tL_forumTopic2;
                    if (pulledDialog.activity == ChatActivity.class && UserObject.isUserSelf(user)) {
                        str = LocaleController.getString(R.string.SavedMessages);
                        avatarDrawable.setAvatarType(1);
                        backupImageView.setImageDrawable(avatarDrawable);
                    } else if (UserObject.isReplyUser(user)) {
                        str = LocaleController.getString(R.string.RepliesTitle);
                        avatarDrawable.setAvatarType(12);
                        backupImageView.setImageDrawable(avatarDrawable);
                    } else if (UserObject.isDeleted(user)) {
                        str = LocaleController.getString(R.string.HiddenName);
                        avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                        backupImageView.setImage(ImageLocation.getForUser(baseFragment.getCurrentAccount(), user, 1), "50_50", avatarDrawable, user);
                    } else {
                        String userName = UserObject.getUserName(user);
                        avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                        backupImageView.setImage(ImageLocation.getForUser(baseFragment.getCurrentAccount(), user, 1), "50_50", drawable, user);
                        str = userName;
                    }
                    textView.setText(str);
                    z = false;
                    z5 = true;
                    frameLayout.setBackground(Theme.getSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), false));
                    atomicReference = atomicReference2;
                    final TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                    frameLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.BackButtonMenu$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            BackButtonMenu.$r8$lambda$LjwJnyIy4aTYeceLn6PSUidUlns(atomicReference, pulledDialog, iNavigationLayout, tL_forumTopic3, baseFragment, view2);
                        }
                    });
                    actionBarPopupWindowLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 44, 0.0f, 0, 0, z7 ? 3 : 0, 0, z6 ? 3 : 0));
                    if (z) {
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        frameLayout2.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
                        frameLayout2.setTag(R.id.fit_width_tag, 1);
                        actionBarPopupWindowLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, 8));
                    }
                    i2 = i3 + 1;
                    parentLayout = iNavigationLayout;
                    j3 = j4;
                    z2 = z5;
                    arrayList2 = arrayList;
                } else {
                    tL_forumTopic = tL_forumTopic2;
                    backupImageView.setImageDrawable(ContextCompat.getDrawable(parentActivity, R.drawable.msg_viewchats).mutate());
                    backupImageView.setSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    backupImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                    textView.setText(LocaleController.getString(R.string.AllChats));
                    z = true;
                    frameLayout.setBackground(Theme.getSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), false));
                    atomicReference = atomicReference2;
                    final TLRPC.TL_forumTopic tL_forumTopic32 = tL_forumTopic;
                    frameLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.BackButtonMenu$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            BackButtonMenu.$r8$lambda$LjwJnyIy4aTYeceLn6PSUidUlns(atomicReference, pulledDialog, iNavigationLayout, tL_forumTopic32, baseFragment, view2);
                        }
                    });
                    actionBarPopupWindowLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 44, 0.0f, 0, 0, z7 ? 3 : 0, 0, z6 ? 3 : 0));
                    if (z) {
                    }
                    i2 = i3 + 1;
                    parentLayout = iNavigationLayout;
                    j3 = j4;
                    z2 = z5;
                    arrayList2 = arrayList;
                }
            }
            tL_forumTopic = tL_forumTopic2;
            z = false;
            z5 = true;
            frameLayout.setBackground(Theme.getSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), false));
            atomicReference = atomicReference2;
            final TLRPC.TL_forumTopic tL_forumTopic322 = tL_forumTopic;
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.BackButtonMenu$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BackButtonMenu.$r8$lambda$LjwJnyIy4aTYeceLn6PSUidUlns(atomicReference, pulledDialog, iNavigationLayout, tL_forumTopic322, baseFragment, view2);
                }
            });
            actionBarPopupWindowLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 44, 0.0f, 0, 0, z7 ? 3 : 0, 0, z6 ? 3 : 0));
            if (z) {
            }
            i2 = i3 + 1;
            parentLayout = iNavigationLayout;
            j3 = j4;
            z2 = z5;
            arrayList2 = arrayList;
        }
        if (!z2) {
            return null;
        }
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
        atomicReference.set(actionBarPopupWindow);
        actionBarPopupWindow.setPauseNotifications(true);
        actionBarPopupWindow.setDismissAnimationDuration(NotificationCenter.starGiveawayOptionsLoaded);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.setSoftInputMode(0);
        actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindowLayout.setFitItems(true);
        int dp = AndroidUtilities.dp(7.0f) - rect.left;
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            fragmentView.getLocationInWindow(iArr);
            dp += iArr[0];
        }
        actionBarPopupWindow.showAtLocation(fragmentView, 51, dp, (view.getBottom() - rect.top) - AndroidUtilities.dp(1.0f));
        return actionBarPopupWindow;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[LOOP:1: B:30:0x00aa->B:32:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba A[EDGE_INSN: B:33:0x00ba->B:34:0x00ba BREAK  A[LOOP:1: B:30:0x00aa->B:32:0x00ae], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$LjwJnyIy4aTYeceLn6PSUidUlns(AtomicReference atomicReference, PulledDialog pulledDialog, INavigationLayout iNavigationLayout, TLRPC.TL_forumTopic tL_forumTopic, BaseFragment baseFragment, View view) {
        Long l;
        ArrayList arrayList;
        int size;
        int i;
        Long l2 = null;
        if (atomicReference.get() != null) {
            ((ActionBarPopupWindow) atomicReference.getAndSet(null)).dismiss();
        }
        if (pulledDialog.stackIndex >= 0) {
            if (iNavigationLayout != null && iNavigationLayout.getFragmentStack() != null && pulledDialog.stackIndex < iNavigationLayout.getFragmentStack().size()) {
                BaseFragment baseFragment2 = (BaseFragment) iNavigationLayout.getFragmentStack().get(pulledDialog.stackIndex);
                if (baseFragment2 instanceof ChatActivity) {
                    ChatActivity chatActivity = (ChatActivity) baseFragment2;
                    l2 = Long.valueOf(chatActivity.getDialogId());
                    l = Long.valueOf(chatActivity.getTopicId());
                } else if (baseFragment2 instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) baseFragment2;
                    l2 = Long.valueOf(profileActivity.getDialogId());
                    l = Long.valueOf(profileActivity.getTopicId());
                }
                if ((l2 == null && l2.longValue() != pulledDialog.dialogId) || !(tL_forumTopic == null || l == null || tL_forumTopic.id == l.longValue())) {
                    for (int size2 = iNavigationLayout.getFragmentStack().size() - 2; size2 > pulledDialog.stackIndex; size2--) {
                        iNavigationLayout.removeFragmentFromStack(size2);
                    }
                } else if (iNavigationLayout != null && iNavigationLayout.getFragmentStack() != null) {
                    arrayList = new ArrayList(iNavigationLayout.getFragmentStack());
                    size = arrayList.size() - 2;
                    while (true) {
                        i = pulledDialog.stackIndex;
                        if (size > i) {
                            break;
                        }
                        ((BaseFragment) arrayList.get(size)).removeSelfFromStack();
                        size--;
                    }
                    if (i < iNavigationLayout.getFragmentStack().size()) {
                        iNavigationLayout.closeLastFragment(true);
                        return;
                    }
                }
            }
            l = null;
            if (l2 == null) {
            }
            if (iNavigationLayout != null) {
                arrayList = new ArrayList(iNavigationLayout.getFragmentStack());
                size = arrayList.size() - 2;
                while (true) {
                    i = pulledDialog.stackIndex;
                    if (size > i) {
                    }
                    ((BaseFragment) arrayList.get(size)).removeSelfFromStack();
                    size--;
                }
                if (i < iNavigationLayout.getFragmentStack().size()) {
                }
            }
        }
        goToPulledDialog(baseFragment, pulledDialog);
    }

    private static ArrayList getStackedHistoryForTopic(BaseFragment baseFragment, long j, long j2) {
        INavigationLayout parentLayout;
        int i;
        ArrayList arrayList = new ArrayList();
        if (baseFragment == null || (parentLayout = baseFragment.getParentLayout()) == null) {
            return arrayList;
        }
        List pulledDialogs = parentLayout.getPulledDialogs();
        if (pulledDialogs != null) {
            i = -1;
            for (int i2 = 0; i2 < pulledDialogs.size(); i2++) {
                PulledDialog pulledDialog = (PulledDialog) pulledDialogs.get(i2);
                if (pulledDialog.topic != null && r7.id != j2) {
                    int i3 = pulledDialog.stackIndex;
                    if (i3 >= i) {
                        i = i3;
                    }
                    arrayList.add(pulledDialog);
                }
            }
        } else {
            i = -1;
        }
        if (parentLayout.getFragmentStack().size() > 1 && (parentLayout.getFragmentStack().get(parentLayout.getFragmentStack().size() - 2) instanceof TopicsFragment)) {
            PulledDialog pulledDialog2 = new PulledDialog();
            arrayList.add(pulledDialog2);
            pulledDialog2.stackIndex = i + 1;
            pulledDialog2.activity = DialogsActivity.class;
            PulledDialog pulledDialog3 = new PulledDialog();
            arrayList.add(pulledDialog3);
            pulledDialog3.stackIndex = -1;
            pulledDialog3.activity = TopicsFragment.class;
            pulledDialog3.chat = MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(-j));
        } else {
            PulledDialog pulledDialog4 = new PulledDialog();
            arrayList.add(pulledDialog4);
            pulledDialog4.stackIndex = -1;
            pulledDialog4.activity = TopicsFragment.class;
            pulledDialog4.chat = MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(-j));
        }
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.Components.BackButtonMenu$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BackButtonMenu.$r8$lambda$zwJbf49aukFzohFh_mJM0GlNr8Q((BackButtonMenu.PulledDialog) obj, (BackButtonMenu.PulledDialog) obj2);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int $r8$lambda$zwJbf49aukFzohFh_mJM0GlNr8Q(PulledDialog pulledDialog, PulledDialog pulledDialog2) {
        return pulledDialog2.stackIndex - pulledDialog.stackIndex;
    }

    public static void goToPulledDialog(BaseFragment baseFragment, PulledDialog pulledDialog) {
        BaseFragment baseFragment2;
        if (pulledDialog == null) {
            return;
        }
        Class cls = pulledDialog.activity;
        if (cls == ChatActivity.class) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = pulledDialog.chat;
            if (chat != null) {
                bundle.putLong("chat_id", chat.id);
            } else {
                TLRPC.User user = pulledDialog.user;
                if (user != null) {
                    bundle.putLong("user_id", user.id);
                }
            }
            bundle.putInt("dialog_folder_id", pulledDialog.folderId);
            bundle.putInt("dialog_filter_id", pulledDialog.filterId);
            TLRPC.TL_forumTopic tL_forumTopic = pulledDialog.topic;
            if (tL_forumTopic != null) {
                baseFragment2 = baseFragment;
                baseFragment2.presentFragment(ForumUtilities.getChatActivityForTopic(baseFragment2, pulledDialog.chat.id, tL_forumTopic, 0, bundle), true);
            } else {
                baseFragment2 = baseFragment;
                baseFragment2.presentFragment(new ChatActivity(bundle), true);
            }
        } else {
            baseFragment2 = baseFragment;
            if (cls == ProfileActivity.class) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("dialog_id", pulledDialog.dialogId);
                baseFragment2.presentFragment(new ProfileActivity(bundle2), true);
            }
        }
        if (pulledDialog.activity == TopicsFragment.class) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", pulledDialog.chat.id);
            baseFragment2.presentFragment(new TopicsFragment(bundle3), true);
        }
        if (pulledDialog.activity == DialogsActivity.class) {
            baseFragment2.presentFragment(new DialogsActivity(null), true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList getStackedHistoryDialogs(BaseFragment baseFragment, long j) {
        INavigationLayout parentLayout;
        TLRPC.Chat currentChat;
        TLRPC.User user;
        long dialogId;
        Class cls;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        if (baseFragment == null || (parentLayout = baseFragment.getParentLayout()) == null) {
            return arrayList;
        }
        List fragmentStack = parentLayout.getFragmentStack();
        List pulledDialogs = parentLayout.getPulledDialogs();
        if (fragmentStack != null) {
            int size = fragmentStack.size();
            for (int i4 = 0; i4 < size; i4++) {
                BaseFragment baseFragment2 = (BaseFragment) fragmentStack.get(i4);
                if (baseFragment2 instanceof ChatActivity) {
                    ChatActivity chatActivity = (ChatActivity) baseFragment2;
                    if (chatActivity.getChatMode() == 0 && !chatActivity.isReport()) {
                        currentChat = chatActivity.getCurrentChat();
                        user = chatActivity.getCurrentUser();
                        dialogId = chatActivity.getDialogId();
                        i2 = chatActivity.getDialogFolderId();
                        i = chatActivity.getDialogFilterId();
                        cls = ChatActivity.class;
                        if (dialogId != j && (j != 0 || !UserObject.isUserSelf(user))) {
                            i3 = 0;
                            while (true) {
                                if (i3 < arrayList.size()) {
                                    PulledDialog pulledDialog = new PulledDialog();
                                    pulledDialog.activity = cls;
                                    pulledDialog.stackIndex = i4;
                                    pulledDialog.chat = currentChat;
                                    pulledDialog.user = user;
                                    pulledDialog.dialogId = dialogId;
                                    pulledDialog.folderId = i2;
                                    pulledDialog.filterId = i;
                                    if (currentChat != null || user != null) {
                                        arrayList.add(pulledDialog);
                                    }
                                } else {
                                    if (((PulledDialog) arrayList.get(i3)).dialogId == dialogId) {
                                        break;
                                    }
                                    i3++;
                                }
                            }
                        }
                    }
                } else if (baseFragment2 instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) baseFragment2;
                    currentChat = profileActivity.getCurrentChat();
                    try {
                        user = profileActivity.getUserInfo().user;
                    } catch (Exception unused) {
                        user = null;
                    }
                    dialogId = profileActivity.getDialogId();
                    cls = ProfileActivity.class;
                    i = 0;
                    i2 = 0;
                    if (dialogId != j) {
                        i3 = 0;
                        while (true) {
                            if (i3 < arrayList.size()) {
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        if (pulledDialogs != null) {
            for (int size2 = pulledDialogs.size() - 1; size2 >= 0; size2--) {
                PulledDialog pulledDialog2 = (PulledDialog) pulledDialogs.get(size2);
                if (pulledDialog2.dialogId != j) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList.size()) {
                            arrayList.add(pulledDialog2);
                            break;
                        }
                        if (((PulledDialog) arrayList.get(i5)).dialogId == pulledDialog2.dialogId) {
                            break;
                        }
                        i5++;
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.Components.BackButtonMenu$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BackButtonMenu.$r8$lambda$sPUzo9otFwawnC1-lMMb0CzYuf8((BackButtonMenu.PulledDialog) obj, (BackButtonMenu.PulledDialog) obj2);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int $r8$lambda$sPUzo9otFwawnC1-lMMb0CzYuf8(PulledDialog pulledDialog, PulledDialog pulledDialog2) {
        return pulledDialog2.stackIndex - pulledDialog.stackIndex;
    }

    public static void addToPulledDialogs(BaseFragment baseFragment, int i, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2, int i3) {
        INavigationLayout parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat == null && user == null) || baseFragment == null || (parentLayout = baseFragment.getParentLayout()) == null) {
            return;
        }
        if (parentLayout.getPulledDialogs() == null) {
            parentLayout.setPulledDialogs(new ArrayList());
        }
        for (PulledDialog pulledDialog : parentLayout.getPulledDialogs()) {
            if (tL_forumTopic == null && pulledDialog.dialogId == j) {
                return;
            }
            if (tL_forumTopic != null && (tL_forumTopic2 = pulledDialog.topic) != null && tL_forumTopic2.id == tL_forumTopic.id) {
                return;
            }
        }
        PulledDialog pulledDialog2 = new PulledDialog();
        pulledDialog2.activity = ChatActivity.class;
        pulledDialog2.stackIndex = i;
        pulledDialog2.dialogId = j;
        pulledDialog2.filterId = i3;
        pulledDialog2.folderId = i2;
        pulledDialog2.chat = chat;
        pulledDialog2.user = user;
        pulledDialog2.topic = tL_forumTopic;
        parentLayout.getPulledDialogs().add(pulledDialog2);
    }

    public static void clearPulledDialogs(BaseFragment baseFragment, int i) {
        INavigationLayout parentLayout;
        if (baseFragment == null || (parentLayout = baseFragment.getParentLayout()) == null || parentLayout.getPulledDialogs() == null) {
            return;
        }
        int i2 = 0;
        while (i2 < parentLayout.getPulledDialogs().size()) {
            if (((PulledDialog) parentLayout.getPulledDialogs().get(i2)).stackIndex > i) {
                parentLayout.getPulledDialogs().remove(i2);
                i2--;
            }
            i2++;
        }
    }
}
