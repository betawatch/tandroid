package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import bi.pb;
import bi.y8;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ob;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hz;
import org.telegram.ui.o41;
import org.telegram.ui.vl0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class n2 {
    protected k actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private ob bulletinDelegate;
    protected boolean finishing;
    protected boolean fragmentBeginToShow;
    public View fragmentView;
    private Runnable fullyVisibleListener;
    protected boolean inBubbleMode;
    protected boolean inMenuMode;
    protected boolean inPreviewMode;
    public boolean isFinished;
    private boolean isFullyVisible;
    protected Dialog parentDialog;
    protected d5 parentLayout;
    private m2 previewDelegate;
    private boolean removingFromStack;
    protected f6 resourceProvider;
    public ArrayList<j2> sheetsStack;
    public Dialog visibleDialog;
    protected int currentAccount = UserConfig.selectedAccount;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public n2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new h2(this));
    }

    public static boolean hasFullyVisibleSheets(n2 n2Var) {
        hz w10;
        if (n2Var == null) {
            return false;
        }
        if (n2Var.hasShownFullyVisibleSheet()) {
            return true;
        }
        return (n2Var.getParentLayout() instanceof ActionBarLayout) && (w10 = ((ActionBarLayout) n2Var.getParentLayout()).w()) != null && w10.hasShownFullyVisibleSheet();
    }

    public static boolean hasSheets(n2 n2Var) {
        hz w10;
        if (n2Var == null) {
            return false;
        }
        if (n2Var.hasShownSheet()) {
            return true;
        }
        return (n2Var.getParentLayout() instanceof ActionBarLayout) && (w10 = ((ActionBarLayout) n2Var.getParentLayout()).w()) != null && w10.hasShownSheet();
    }

    public boolean S(MotionEvent motionEvent, boolean z10) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void addSheet(j2 j2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        pb lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.v0 = j2Var;
            j2Var.setOnDismissListener(new bi.p4(lastStoryViewer, 3));
        }
        this.sheetsStack.add(j2Var);
        updateSheetsVisibility();
    }

    public boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return true;
    }

    public boolean allowPresentFragment() {
        return true;
    }

    public void attachSheets(w wVar) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                j2 j2Var = this.sheetsStack.get(i10);
                if (j2Var != null && j2Var.attachedToParent()) {
                    AndroidUtilities.removeFromParent(j2Var.getWindowView());
                    wVar.addView(j2Var.getWindowView());
                }
            }
        }
    }

    public boolean canBeginSlide() {
        return true;
    }

    public void checkSystemBarColors() {
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            ((LaunchActivity) parentActivity).H(true, true, true);
        }
    }

    public void clearSheets() {
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
            this.sheetsStack.get(size).dismiss(true);
        }
        this.sheetsStack.clear();
    }

    public void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            this.fragmentView = null;
        }
        k kVar = this.actionBar;
        if (kVar != null) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    public boolean closeLastFragment() {
        return false;
    }

    public boolean closeSheet() {
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (this.sheetsStack.get(size).isShown()) {
                return this.sheetsStack.get(size).onAttachedBackPressed();
            }
        }
        return false;
    }

    public k createActionBar(Context context) {
        d5 d5Var;
        k kVar = new k(context, getResourceProvider());
        kVar.setBackgroundColor(getThemedColor(j6.s8));
        kVar.B(getThemedColor(j6.t8), false);
        kVar.B(getThemedColor(j6.z8), true);
        kVar.C(getThemedColor(j6.v8), false);
        kVar.C(getThemedColor(j6.y8), true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((d5Var = this.parentLayout) == null || !((ActionBarLayout) d5Var).M0)) {
            return kVar;
        }
        kVar.setOccupyStatusBar(false);
        return kVar;
    }

    public org.telegram.ui.i4 createArticleViewer(boolean z10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z10) {
            if ((getLastSheet() instanceof org.telegram.ui.v3) && getLastSheet().isShown()) {
                return ((org.telegram.ui.v3) getLastSheet()).K;
            }
            d5 d5Var = this.parentLayout;
            if ((d5Var instanceof ActionBarLayout) && ((ActionBarLayout) d5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.v3)) {
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
                if (v3Var.isShown()) {
                    return v3Var.K;
                }
            }
        }
        org.telegram.ui.i4 i4Var = new org.telegram.ui.i4(this);
        org.telegram.ui.v3 v3Var2 = i4Var.K;
        addSheet(v3Var2);
        i3.b(v3Var2);
        return i4Var;
    }

    public pb createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        pb pbVar = new pb(this);
        d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).b) {
            pbVar.r1 = true;
        }
        this.sheetsStack.add(pbVar);
        updateSheetsVisibility();
        return pbVar;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                j2 j2Var = this.sheetsStack.get(i10);
                if (j2Var != null && j2Var.attachedToParent()) {
                    AndroidUtilities.removeFromParent(j2Var.getWindowView());
                }
            }
        }
    }

    public void dismissCurrentDialog() {
        Dialog dialog = this.visibleDialog;
        if (dialog == null) {
            return;
        }
        try {
            dialog.dismiss();
            this.visibleDialog = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public boolean dismissDialogOnPause(Dialog dialog) {
        return true;
    }

    public boolean drawEdgeNavigationBar() {
        return isSupportEdgeToEdge();
    }

    public void dumpCanvas() {
        AndroidUtilities.dumpCanvas(this.fragmentView);
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public void finishFragment() {
        m2 m2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (!this.inPreviewMode || (m2Var = this.previewDelegate) == null) {
            finishFragment(true);
        } else {
            ((o41) ((vl0) m2Var).b).a();
        }
    }

    public void finishPreviewFragment() {
        d5 d5Var = this.parentLayout;
        if (d5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) d5Var;
            if (actionBarLayout.h || actionBarLayout.a0) {
                Runnable runnable = actionBarLayout.e;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    actionBarLayout.e = null;
                }
                actionBarLayout.l(true, false);
            }
        }
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.currentAccount);
    }

    public k getActionBar() {
        return this.actionBar;
    }

    public Bundle getArguments() {
        return this.arguments;
    }

    public org.telegram.ui.i4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.v3) && getLastSheet().isShown()) {
            return ((org.telegram.ui.v3) getLastSheet()).K;
        }
        d5 d5Var = this.parentLayout;
        if (!(d5Var instanceof ActionBarLayout) || ((ActionBarLayout) d5Var).w() == null || !(((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.v3)) {
            return null;
        }
        org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
        if (v3Var.isShown()) {
            return v3Var.K;
        }
        return null;
    }

    public z4 getBackButtonState() {
        k kVar = this.actionBar;
        if (kVar != null) {
            return kVar.getBackButtonState();
        }
        return null;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public ob getBulletinDelegate() {
        return this.bulletinDelegate;
    }

    public FrameLayout getBulletinLayoutContainer() {
        return getLayoutContainer();
    }

    public int getClassGuid() {
        return this.classGuid;
    }

    public ConnectionsManager getConnectionsManager() {
        return getAccountInstance().getConnectionsManager();
    }

    public ContactsController getContactsController() {
        return getAccountInstance().getContactsController();
    }

    public Context getContext() {
        return getParentActivity();
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        return null;
    }

    public DownloadController getDownloadController() {
        return getAccountInstance().getDownloadController();
    }

    public a4 getEdgeToEdgeSupportMode() {
        return isSupportEdgeToEdge() ? a4.b : a4.a;
    }

    public FileLoader getFileLoader() {
        return getAccountInstance().getFileLoader();
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public n2 getFragmentForAlert(int i10) {
        d5 d5Var = this.parentLayout;
        return (d5Var == null || d5Var.getFragmentStack().size() <= i10 + 1) ? this : (n2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i10);
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public GiftAuctionController getGiftAuctionsController() {
        return getAccountInstance().getGiftAuctionsController();
    }

    public boolean getInPassivePreviewMode() {
        d5 d5Var = this.parentLayout;
        if (d5Var == null) {
            return false;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) d5Var;
        return (actionBarLayout.h && actionBarLayout.J == null) || actionBarLayout.a0;
    }

    public j2 getLastSheet() {
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
            if (this.sheetsStack.get(size).isShown()) {
                return this.sheetsStack.get(size);
            }
        }
        return null;
    }

    public pb getLastStoryViewer() {
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
            if ((this.sheetsStack.get(size) instanceof pb) && this.sheetsStack.get(size).isShown()) {
                return (pb) this.sheetsStack.get(size);
            }
        }
        return null;
    }

    public FrameLayout getLayoutContainer() {
        View view = this.fragmentView;
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof FrameLayout) {
            return (FrameLayout) parent;
        }
        return null;
    }

    public LocationController getLocationController() {
        return getAccountInstance().getLocationController();
    }

    public MediaController getMediaController() {
        return MediaController.getInstance();
    }

    public MediaDataController getMediaDataController() {
        return getAccountInstance().getMediaDataController();
    }

    public MessagesController getMessagesController() {
        return getAccountInstance().getMessagesController();
    }

    public MessagesStorage getMessagesStorage() {
        return getAccountInstance().getMessagesStorage();
    }

    public int getNavigationBarColor() {
        int v02 = j6.v0(j6.a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                j2 j2Var = this.sheetsStack.get(i10);
                if (j2Var.attachedToParent()) {
                    v02 = j2Var.getNavigationBarColor(v02);
                }
            }
        }
        return v02;
    }

    public NotificationCenter getNotificationCenter() {
        return getAccountInstance().getNotificationCenter();
    }

    public NotificationsController getNotificationsController() {
        return getAccountInstance().getNotificationsController();
    }

    public SharedPreferences getNotificationsSettings() {
        return getAccountInstance().getNotificationsSettings();
    }

    public pb getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        pb pbVar = (this.sheetsStack.isEmpty() || !(i2.g.h(1, this.sheetsStack) instanceof pb)) ? null : (pb) i2.g.h(1, this.sheetsStack);
        if (pbVar == null) {
            pbVar = new pb(this);
            d5 d5Var = this.parentLayout;
            if (d5Var != null && ((ActionBarLayout) d5Var).b) {
                pbVar.r1 = true;
            }
            this.sheetsStack.add(pbVar);
            updateSheetsVisibility();
        }
        return pbVar;
    }

    public Activity getParentActivity() {
        d5 d5Var = this.parentLayout;
        if (d5Var != null) {
            return d5Var.getParentActivity();
        }
        return null;
    }

    public d5 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public f6 getResourceProvider() {
        return this.resourceProvider;
    }

    public SecretChatHelper getSecretChatHelper() {
        return getAccountInstance().getSecretChatHelper();
    }

    public SendMessagesHelper getSendMessagesHelper() {
        return getAccountInstance().getSendMessagesHelper();
    }

    public ArrayList<l6> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i10) {
        return j6.v0(i10, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return j6.O0(str);
    }

    public Paint getThemedPaint(String str) {
        Paint G = getResourceProvider() != null ? getResourceProvider().G(str) : null;
        return G != null ? G : j6.S0(str);
    }

    public UserConfig getUserConfig() {
        return getAccountInstance().getUserConfig();
    }

    public Dialog getVisibleDialog() {
        return this.visibleDialog;
    }

    public boolean hasForceLightStatusBar() {
        return false;
    }

    public boolean hasOwnBackground() {
        return this.hasOwnBackground;
    }

    public boolean hasSheet() {
        ArrayList<j2> arrayList = this.sheetsStack;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public boolean hasShownFullyVisibleSheet() {
        if (!hasSheet()) {
            return false;
        }
        for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
            if (this.sheetsStack.get(size).isShown() && this.sheetsStack.get(size).isFullyVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasShownSheet() {
        if (!hasSheet()) {
            return false;
        }
        for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
            if (this.sheetsStack.get(size).isShown()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasStoryViewer() {
        return getLastStoryViewer() != null;
    }

    public boolean hideKeyboardOnShow() {
        return true;
    }

    public boolean isActionBarCrossfadeEnabled() {
        return this.actionBar != null;
    }

    public boolean isBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public boolean isBotView(View view) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                this.sheetsStack.get(i10);
            }
        }
        return false;
    }

    public boolean isFinishing() {
        return this.finishing;
    }

    public boolean isInBubbleMode() {
        return this.inBubbleMode;
    }

    public boolean isInPreviewMode() {
        return this.inPreviewMode;
    }

    public boolean isLastFragment() {
        d5 d5Var = this.parentLayout;
        return d5Var != null && d5Var.getLastFragment() == this;
    }

    public boolean isLightStatusBar() {
        if (getLastStoryViewer() != null && !getLastStoryViewer().H0) {
            return false;
        }
        if (!hasForceLightStatusBar() || j6.A0().q()) {
            f6 resourceProvider = getResourceProvider();
            int i10 = j6.s8;
            k kVar = this.actionBar;
            if (kVar != null && kVar.s()) {
                i10 = j6.w8;
            }
            if (i0.a.f(resourceProvider != null ? resourceProvider.h0(i10) : j6.w0(null, i10, true)) <= 0.699999988079071d) {
                return false;
            }
        }
        return true;
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public boolean isRemovingFromStack() {
        return this.removingFromStack;
    }

    public boolean isStoryViewer(View view) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                j2 j2Var = this.sheetsStack.get(i10);
                if ((j2Var instanceof pb) && view == ((pb) j2Var).s) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public boolean isSupportEdgeToEdge() {
        return false;
    }

    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void movePreviewFragment(float f7) {
        ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
        if (!actionBarLayout.h || actionBarLayout.J != null || actionBarLayout.a0) {
            return;
        }
        float translationY = actionBarLayout.s.getTranslationY();
        float f10 = -f7;
        if (f10 <= 0.0f) {
            if (f10 < (-AndroidUtilities.dp(60.0f))) {
                actionBarLayout.r();
            }
            if (translationY == f10) {
                actionBarLayout.s.setTranslationY(f10);
                actionBarLayout.invalidate();
                return;
            }
            return;
        }
        f10 = 0.0f;
        if (translationY == f10) {
        }
    }

    public boolean needDelayOpenAnimation() {
        return false;
    }

    public boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            return true;
        }
        if (!z10) {
            return false;
        }
        closeSheet();
        return false;
    }

    public void onBecomeFullyHidden() {
        this.isFullyVisible = false;
        updateSheetsVisibility();
    }

    public void onBecomeFullyVisible() {
        k actionBar;
        this.isFullyVisible = true;
        if (((AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility")).isEnabled() && (actionBar = getActionBar()) != null) {
            String title = actionBar.getTitle();
            if (!TextUtils.isEmpty(title)) {
                setParentActivityTitle(title);
            }
        }
        Runnable runnable = this.fullyVisibleListener;
        if (runnable != null) {
            this.fullyVisibleListener = null;
            runnable.run();
        }
        updateSheetsVisibility();
        checkSystemBarColors();
    }

    public void onBeginSlide() {
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing()) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D0 = false;
            kVar.P();
            z zVar = kVar.E;
            if (zVar != null) {
                int childCount = zVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zVar.getChildAt(i10);
                    if (childAt instanceof v0) {
                        ((v0) childAt).n();
                    }
                }
            }
        }
    }

    public AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        return null;
    }

    public boolean onFragmentCreate() {
        return true;
    }

    public void onFragmentDestroy() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.isFinished = true;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !AndroidUtilities.isTablet() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), j6.w0(null, j6.s8, false) == -1);
        }
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j2 j2Var = this.sheetsStack.get(size);
                j2Var.setLastVisible(false);
                j2Var.dismiss(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        i0.c f7 = l1Var.a.f(3);
        int i10 = f7.a;
        int i11 = f7.b;
        int i12 = f7.c;
        int i13 = f7.d;
        this.bottomInset = i13;
        onInsets(i10, i11, i12, i13);
        return r0.l1.b;
    }

    public void onPause() {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D0 = false;
            kVar.P();
            z zVar = kVar.E;
            if (zVar != null) {
                int childCount = zVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zVar.getChildAt(i10);
                    if (childAt instanceof v0) {
                        ((v0) childAt).n();
                    }
                }
            }
        }
        this.isPaused = true;
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing() && dismissDialogOnPause(this.visibleDialog)) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (getLastStoryViewer() != null) {
            pb lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.s1 = true;
            bi.ob obVar = lastStoryViewer.z0;
            if (obVar != null) {
                obVar.release(null);
                lastStoryViewer.z0 = null;
            }
            if (lastStoryViewer.E0 == null) {
                di.l4 l4Var = lastStoryViewer.D0;
                if (l4Var != null) {
                    l4Var.d(0L, null);
                }
                bi.t1 t1Var = lastStoryViewer.A0;
                if (t1Var != null) {
                    if (t1Var.n) {
                        t1Var.s(null);
                    } else {
                        t1Var.e();
                    }
                    lastStoryViewer.A0 = null;
                }
            }
            y8 y8Var = lastStoryViewer.u1;
            if (y8Var != null) {
                y8Var.b();
            }
            getLastStoryViewer().P();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        updateSheetsVisibility();
    }

    public void onResume() {
        this.isPaused = false;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D0 = true;
            kVar.P();
        }
        if (getLastStoryViewer() != null) {
            pb lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.s1 = false;
            if (!org.telegram.ui.i4.x().V && lastStoryViewer.t() != null) {
                lastStoryViewer.t().f1(false);
            }
            y8 y8Var = lastStoryViewer.u1;
            if (y8Var != null) {
                y8Var.a(false);
            }
            if (bi.a2.Z.S) {
                bi.a2.j();
            }
            getLastStoryViewer().P();
        }
    }

    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.inTransitionAnimation = false;
    }

    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.inTransitionAnimation = true;
        if (z10) {
            this.fragmentBeginToShow = true;
        }
    }

    public View performCreateView(Context context) {
        return createView(context);
    }

    public boolean presentFragment(n2 n2Var) {
        d5 d5Var;
        return allowPresentFragment() && (d5Var = this.parentLayout) != null && ((ActionBarLayout) d5Var).P(n2Var);
    }

    public boolean presentFragmentAsPreview(n2 n2Var) {
        d5 d5Var;
        if (!allowPresentFragment() || (d5Var = this.parentLayout) == null) {
            return false;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) d5Var;
        actionBarLayout.getClass();
        b5 b5Var = new b5(n2Var);
        b5Var.e = true;
        return actionBarLayout.R(b5Var);
    }

    public boolean presentFragmentAsPreviewWithMenu(n2 n2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        d5 d5Var;
        if (!allowPresentFragment() || (d5Var = this.parentLayout) == null) {
            return false;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) d5Var;
        actionBarLayout.getClass();
        b5 b5Var = new b5(n2Var);
        b5Var.e = true;
        b5Var.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        return actionBarLayout.R(b5Var);
    }

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void removeSheet(j2 j2Var) {
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(j2Var);
        updateSheetsVisibility();
    }

    public void resetFragment() {
        if (this.isFinished) {
            clearViews();
            this.isFinished = false;
            this.finishing = false;
        }
    }

    public void resumeDelayedFragmentAnimation() {
        d5 d5Var = this.parentLayout;
        if (d5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) d5Var;
            actionBarLayout.R0 = true;
            Runnable runnable = actionBarLayout.e;
            if (runnable == null || actionBarLayout.d != null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(runnable);
            actionBarLayout.e.run();
            actionBarLayout.e = null;
        }
    }

    public void setBulletinDelegate(ob obVar) {
        this.bulletinDelegate = obVar;
    }

    public void setCurrentAccount(int i10) {
        if (this.fragmentView != null) {
            throw new IllegalStateException("trying to set current account when fragment UI already created");
        }
        this.currentAccount = i10;
    }

    public void setFinishing(boolean z10) {
        this.finishing = z10;
    }

    public void setFragmentPanTranslationOffset(int i10) {
        d5 d5Var = this.parentLayout;
        if (d5Var != null) {
            d5Var.setFragmentPanTranslationOffset(i10);
        }
    }

    public void setFragmentView(View view) {
        this.fragmentView = view;
    }

    public void setHasOwnBackground(boolean z10) {
        this.hasOwnBackground = z10;
    }

    public void setInBubbleMode(boolean z10) {
        this.inBubbleMode = z10;
    }

    public void setInMenuMode(boolean z10) {
        this.inMenuMode = z10;
    }

    public void setInPreviewMode(boolean z10) {
        this.inPreviewMode = z10;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setOccupyStatusBar(!z10);
        }
    }

    public void setKeyboardHeightFromParent(int i10) {
        if (this.sheetsStack != null) {
            for (int i11 = 0; i11 < this.sheetsStack.size(); i11++) {
                j2 j2Var = this.sheetsStack.get(i11);
                if (j2Var != null) {
                    j2Var.setKeyboardHeightFromParent(i10);
                }
            }
        }
    }

    public void setNavigationBarColor(int i10) {
        if (isSupportEdgeToEdge()) {
            return;
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            ((LaunchActivity) parentActivity).z0(i10);
        } else if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            if (Build.VERSION.SDK_INT >= 26 && window != null) {
                window.getNavigationBarColor();
            }
        }
        AndroidUtilities.setLightNavigationBar(parentActivity, AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f);
        d5 d5Var = this.parentLayout;
        if (d5Var != null) {
            d5Var.setNavigationBarColor(i10);
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(n2 n2Var) {
        setParentLayout(n2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentLayout(d5 d5Var) {
        ViewGroup viewGroup;
        if (this.parentLayout != d5Var) {
            this.parentLayout = d5Var;
            boolean z10 = false;
            this.inBubbleMode = d5Var != null && ((ActionBarLayout) d5Var).f;
            View view = this.fragmentView;
            if (view != null) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2 != null) {
                    try {
                        onRemoveFromParent();
                        viewGroup2.removeViewInLayout(this.fragmentView);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                d5 d5Var2 = this.parentLayout;
                if (d5Var2 != null && d5Var2.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                d5 d5Var3 = this.parentLayout;
                if (d5Var3 != null && d5Var3.getView().getContext() != this.actionBar.getContext()) {
                    z10 = true;
                }
                k kVar = this.actionBar;
                if ((kVar.K || z10) && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (z10) {
                    this.actionBar = null;
                }
            }
            d5 d5Var4 = this.parentLayout;
            if (d5Var4 == null || this.actionBar != null) {
                return;
            }
            k createActionBar = createActionBar(d5Var4.getView().getContext());
            this.actionBar = createActionBar;
            if (createActionBar != null) {
                createActionBar.t0 = this;
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.isPaused == z10) {
            return;
        }
        if (z10) {
            onPause();
        } else {
            onResume();
        }
    }

    public void setPreviewDelegate(m2 m2Var) {
        this.previewDelegate = m2Var;
    }

    public void setRemovingFromStack(boolean z10) {
        this.removingFromStack = z10;
    }

    public void setResourceProvider(f6 f6Var) {
        this.resourceProvider = f6Var;
    }

    public void setTitleOverlayText(String str, int i10, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.K(str, i10, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar == null || !kVar.K) {
            return;
        }
        setTitleOverlayText(str, i10, runnable);
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public boolean shouldOverrideSlideTransition(boolean z10, boolean z11) {
        return false;
    }

    public d5[] showAsSheet(n2 n2Var) {
        return showAsSheet(n2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i10) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        d5 d5Var = this.parentLayout;
        if (d5Var == null || (activity = (actionBarLayout = (ActionBarLayout) d5Var).K0) == null) {
            return;
        }
        if (actionBarLayout.W) {
            AnimatorSet animatorSet = actionBarLayout.K;
            if (animatorSet != null) {
                animatorSet.cancel();
                actionBarLayout.K = null;
            }
            if (actionBarLayout.y0 != null) {
                actionBarLayout.H();
            } else if (actionBarLayout.z0 != null) {
                actionBarLayout.K();
            }
            actionBarLayout.s.invalidate();
        }
        if (intent != null) {
            activity.startActivityForResult(intent, i10);
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack == null) {
            return;
        }
        for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
            j2 j2Var = this.sheetsStack.get(i10);
            boolean z10 = true;
            if (i10 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                z10 = false;
            }
            j2Var.setLastVisible(z10);
        }
    }

    public void whenFullyVisible(Runnable runnable) {
        this.fullyVisibleListener = runnable;
    }

    public boolean presentFragment(n2 n2Var, boolean z10) {
        d5 d5Var;
        return allowPresentFragment() && (d5Var = this.parentLayout) != null && ((ActionBarLayout) d5Var).Q(n2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        d5 d5Var;
        if (this.isFinished || (d5Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) d5Var).a0(this, z10);
        }
    }

    public d5[] showAsSheet(n2 n2Var, l2 l2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        d5[] d5VarArr = {new y4(getParentActivity(), new n(r7, 5))};
        d5VarArr[0].setIsSheet(true);
        LaunchActivity.G1.P.add(d5VarArr[0]);
        n2Var.onTransitionAnimationStart(true, false);
        i2 i2Var = new i2(getParentActivity(), n2Var.getResourceProvider(), l2Var, d5VarArr, n2Var, r7);
        f3[] f3VarArr = {i2Var};
        if (l2Var != null) {
            i2Var.setAllowNestedScroll(false);
            f3VarArr[0].transitionFromRight(l2Var.a);
        }
        f3 f3Var = f3VarArr[0];
        n2Var.parentDialog = f3Var;
        f3Var.setOpenNoDelay(true);
        f3VarArr[0].show();
        return d5VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(n2 n2Var, boolean z10, boolean z11) {
        d5 d5Var;
        if (allowPresentFragment() && (d5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) d5Var;
            actionBarLayout.getClass();
            b5 b5Var = new b5(n2Var);
            b5Var.b = z10;
            b5Var.c = z11;
            b5Var.d = true;
            b5Var.e = false;
            b5Var.f = null;
            if (actionBarLayout.R(b5Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        d5 d5Var;
        if (dialog != null && (d5Var = this.parentLayout) != null && !((ActionBarLayout) d5Var).B()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.Q && (z10 || !actionBarLayout.j())) {
                ArrayList<j2> arrayList = this.sheetsStack;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (this.sheetsStack.get(size).isShown() && this.sheetsStack.get(size).showDialog(dialog)) {
                            return dialog;
                        }
                    }
                }
                try {
                    Dialog dialog2 = this.visibleDialog;
                    if (dialog2 != null) {
                        dialog2.dismiss();
                        this.visibleDialog = null;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                try {
                    this.visibleDialog = dialog;
                    dialog.setCanceledOnTouchOutside(true);
                    this.visibleDialog.setOnDismissListener(new fi.e0(3, this, onDismissListener));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        return null;
    }

    public boolean finishFragment(boolean z10) {
        d5 d5Var;
        if (this.isFinished || (d5Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) d5Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(b5 b5Var) {
        d5 d5Var;
        return allowPresentFragment() && (d5Var = this.parentLayout) != null && ((ActionBarLayout) d5Var).R(b5Var);
    }

    public pb getOrCreateStoryViewer(int i10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        pb pbVar = null;
        pb pbVar2 = (this.sheetsStack.isEmpty() || !(i2.g.h(1, this.sheetsStack) instanceof pb)) ? null : (pb) i2.g.h(1, this.sheetsStack);
        if (pbVar2 == null || pbVar2.h == i10) {
            pbVar = pbVar2;
        } else {
            pbVar2.q(true);
            removeSheet(pbVar2);
        }
        if (pbVar != null) {
            return pbVar;
        }
        pb pbVar3 = new pb(this);
        d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).b) {
            pbVar3.r1 = true;
        }
        this.sheetsStack.add(pbVar3);
        updateSheetsVisibility();
        return pbVar3;
    }

    public void onBottomSheetCreated() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDialogDismiss(Dialog dialog) {
    }

    public void onFragmentClosed() {
    }

    public void onLowMemory() {
    }

    public void onPanTransitionEnd() {
    }

    public void onPanTransitionStart() {
    }

    public void onPanTranslationUpdate(float f7) {
    }

    public void onPreviewOpenAnimationEnd() {
    }

    public void onUserLeaveHint() {
    }

    public void restoreSelfArgs(Bundle bundle) {
    }

    public void saveKeyboardPositionBeforeTransition() {
    }

    public void saveSelfArgs(Bundle bundle) {
    }

    public void setPreviewOpenedProgress(float f7) {
    }

    public void setPreviewReplaceProgress(float f7) {
    }

    public void onSlideProgress(boolean z10, float f7) {
    }

    public void onTransitionAnimationProgress(boolean z10, float f7) {
    }

    public void prepareFragmentToSlide(boolean z10, boolean z11) {
    }

    public void onActivityResultFragment(int i10, int i11, Intent intent) {
    }

    public void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
    }

    public void onInsets(int i10, int i11, int i12, int i13) {
    }
}
