package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class PopupNotificationActivity extends Activity implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int X = 0;
    public lv0 A;
    public int G;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public CharSequence L;
    public boolean V;
    public org.telegram.ui.ActionBar.k a;
    public ChatActivityEnterView b;
    public org.telegram.ui.Components.o9 c;
    public TextView d;
    public TextView e;
    public FrameLayout f;
    public TextView h;
    public m0 n;
    public ViewGroup r;
    public ViewGroup s;
    public ViewGroup v;
    public LinearLayout w;
    public LinearLayout x;
    public LinearLayout y;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public final ArrayList D = new ArrayList();
    public VelocityTracker E = null;
    public final org.telegram.ui.Components.tv0[] F = new org.telegram.ui.Components.tv0[5];
    public int H = -1;
    public boolean K = false;
    public MessageObject M = null;
    public final MessageObject[] N = new MessageObject[3];
    public int O = 0;
    public PowerManager.WakeLock P = null;
    public boolean Q = false;
    public long R = 0;
    public float S = -1.0f;
    public boolean T = false;
    public Runnable U = null;
    public final ArrayList W = new ArrayList();

    public final void a(int i9) {
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != dp) {
                layoutParams.width = dp;
                this.s.setLayoutParams(layoutParams);
            }
            this.s.setTranslationX((-dp) + i9);
        }
        LinearLayout linearLayout = this.x;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-dp) + i9);
        }
        ViewGroup viewGroup2 = this.r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != dp) {
                layoutParams2.width = dp;
                this.r.setLayoutParams(layoutParams2);
            }
            this.r.setTranslationX(i9);
        }
        LinearLayout linearLayout2 = this.w;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i9);
        }
        ViewGroup viewGroup3 = this.v;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != dp) {
                layoutParams3.width = dp;
                this.v.setLayoutParams(layoutParams3);
            }
            this.v.setTranslationX(dp + i9);
        }
        LinearLayout linearLayout3 = this.y;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(dp + i9);
        }
        this.n.invalidate();
    }

    public final void b() {
        TLRPC.User user;
        MessageObject messageObject = this.M;
        if (messageObject == null) {
            return;
        }
        if (this.J != null) {
            TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(this.J.id));
            if (chat == null) {
                return;
            }
            this.J = chat;
            if (this.c != null) {
                this.c.e(chat, new org.telegram.ui.Components.z8(this.J));
                return;
            }
            return;
        }
        if (this.I == null || (user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(this.I.id))) == null) {
            return;
        }
        this.I = user;
        if (this.c != null) {
            this.c.e(user, new org.telegram.ui.Components.z8(0, this.I));
        }
    }

    public final boolean c() {
        if (this.Q && this.R < System.currentTimeMillis() - 400) {
            this.Q = false;
            Runnable runnable = this.U;
            if (runnable != null) {
                runnable.run();
                this.U = null;
            }
        }
        return this.Q;
    }

    public final void d() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new nv0(this, 0));
        }
        m0 m0Var = this.n;
        if (m0Var != null) {
            m0Var.getViewTreeObserver().addOnPreDrawListener(new nv0(this, 1));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.bg0 bg0Var;
        MessageObject messageObject;
        org.telegram.ui.Components.bg0 bg0Var2;
        MessageObject messageObject2;
        MessageObject messageObject3;
        if (i9 == NotificationCenter.appDidLogout) {
            if (i10 == this.H) {
                i();
                finish();
                return;
            }
            return;
        }
        int i11 = 0;
        if (i9 == NotificationCenter.pushMessagesUpdated) {
            if (this.V) {
                return;
            }
            ArrayList arrayList = this.W;
            arrayList.clear();
            for (int i12 = 0; i12 < 4; i12++) {
                if (UserConfig.getInstance(i12).isClientActivated()) {
                    arrayList.addAll(NotificationsController.getInstance(i12).popupMessages);
                }
            }
            f();
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = (this.O - 1) + i13;
                if (arrayList.size() != 1 || (i14 >= 0 && i14 < arrayList.size())) {
                    if (i14 == -1) {
                        i14 = arrayList.size() - 1;
                    } else if (i14 == arrayList.size()) {
                        i14 = 0;
                    }
                    messageObject3 = (MessageObject) arrayList.get(i14);
                } else {
                    messageObject3 = null;
                }
                if (this.N[i13] != messageObject3) {
                    q(0);
                }
            }
            return;
        }
        if (i9 == NotificationCenter.updateInterfaces) {
            if (this.M == null || i10 != this.H) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0) {
                r();
            }
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0) {
                b();
            }
            if ((intValue & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                CharSequence printingString = MessagesController.getInstance(this.M.currentAccount).getPrintingString(this.M.getDialogId(), 0L, false);
                CharSequence charSequence = this.L;
                if ((charSequence == null || printingString != null) && ((charSequence != null || printingString == null) && (charSequence == null || charSequence.equals(printingString)))) {
                    return;
                }
                r();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.messagePlayingDidReset) {
            Integer num = (Integer) objArr[0];
            m0 m0Var = this.n;
            if (m0Var != null) {
                int childCount = m0Var.getChildCount();
                while (i11 < childCount) {
                    View childAt = this.n.getChildAt(i11);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (bg0Var2 = (org.telegram.ui.Components.bg0) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.currentAccount == i10 && messageObject2.getId() == num.intValue()) {
                        bg0Var2.r();
                        return;
                    }
                    i11++;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num2 = (Integer) objArr[0];
            m0 m0Var2 = this.n;
            if (m0Var2 != null) {
                int childCount2 = m0Var2.getChildCount();
                while (i11 < childCount2) {
                    View childAt2 = this.n.getChildAt(i11);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (bg0Var = (org.telegram.ui.Components.bg0) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.currentAccount == i10 && messageObject.getId() == num2.intValue()) {
                        bg0Var.s();
                        return;
                    }
                    i11++;
                }
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.emojiLoaded) {
            if (i9 == NotificationCenter.contactsDidLoad && i10 == this.H) {
                r();
                return;
            }
            return;
        }
        m0 m0Var3 = this.n;
        if (m0Var3 != null) {
            int childCount3 = m0Var3.getChildCount();
            while (i11 < childCount3) {
                View childAt3 = this.n.getChildAt(i11);
                if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                    textView.invalidate();
                }
                i11++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.view.View, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final LinearLayout e(int i9, boolean z10) {
        int i10;
        LinearLayout linearLayout;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i11;
        Object obj;
        int i12 = i9;
        ArrayList arrayList2 = this.W;
        Object obj2 = null;
        if (arrayList2.size() == 1 && (i12 < 0 || i12 >= arrayList2.size())) {
            return null;
        }
        boolean z11 = false;
        if (i12 == -1) {
            i12 = arrayList2.size() - 1;
        } else if (i12 == arrayList2.size()) {
            i12 = 0;
        }
        MessageObject messageObject = (MessageObject) arrayList2.get(i12);
        TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
        if (messageObject.getDialogId() == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size = arrayList3.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i13);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    if (gf.c.c(keyboardInlineButtonRow.buttons.get(i14), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i10++;
                    }
                }
            }
        } else {
            i10 = 0;
        }
        int i15 = messageObject.currentAccount;
        if (i10 <= 0 || !(replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            linearLayout = null;
        } else {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size3 = arrayList4.size();
            LinearLayout linearLayout2 = null;
            int i16 = 0;
            while (i16 < size3) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList4.get(i16);
                int size4 = keyboardInlineButtonRow2.buttons.size();
                int i17 = 0;
                ?? r62 = z11;
                ?? r10 = linearLayout2;
                while (i17 < size4) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i17);
                    if (gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (r10 == 0) {
                            ?? linearLayout3 = new LinearLayout(this);
                            linearLayout3.setOrientation(r62);
                            arrayList = arrayList4;
                            linearLayout3.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, r62));
                            linearLayout3.setWeightSum(100.0f);
                            linearLayout3.setTag("b");
                            linearLayout3.setOnTouchListener(new jh.d(29));
                            r10 = linearLayout3;
                        } else {
                            arrayList = arrayList4;
                            r10 = r10;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        i11 = size3;
                        obj = null;
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.n6, false));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                        r10.addView(textView, g7.e6.l(100.0f / i10, -1, -1));
                        textView.setOnClickListener(new gh.z0(messageObject, i15));
                    } else {
                        arrayList = arrayList4;
                        i11 = size3;
                        obj = obj2;
                    }
                    i17++;
                    obj2 = obj;
                    size3 = i11;
                    arrayList4 = arrayList;
                    r62 = 0;
                    r10 = r10;
                }
                i16++;
                size3 = size3;
                arrayList4 = arrayList4;
                z11 = false;
                linearLayout2 = r10;
            }
            linearLayout = linearLayout2;
        }
        if (linearLayout != null) {
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z10) {
                int i18 = this.O;
                if (i12 == i18) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i12 == i18 - 1) {
                    linearLayout.setTranslationX(-dp);
                } else if (i12 == i18 + 1) {
                    linearLayout.setTranslationX(dp);
                }
            }
            this.A.addView(linearLayout, layoutParams);
        }
        return linearLayout;
    }

    public final void f() {
        ArrayList arrayList = this.W;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.O != 0 || this.b.j0() || this.T) && this.M != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i9);
                if (messageObject.currentAccount == this.M.currentAccount && messageObject.getDialogId() == this.M.getDialogId() && messageObject.getId() == this.M.getId()) {
                    this.O = i9;
                    if (this.T) {
                        if (i9 == arrayList.size() - 1) {
                            l(3);
                        } else if (this.O == 1) {
                            l(4);
                        }
                    }
                    this.h.setText(String.format("%d/%d", Integer.valueOf(this.O + 1), Integer.valueOf(arrayList.size())));
                }
            }
        }
        this.O = 0;
        this.M = (MessageObject) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.O + 1), Integer.valueOf(arrayList.size())));
    }

    public final ViewGroup g(int i9, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        org.telegram.ui.Components.bg0 bg0Var;
        int i10 = i9;
        ArrayList arrayList = this.W;
        if (arrayList.size() == 1 && (i10 < 0 || i10 >= arrayList.size())) {
            return null;
        }
        if (i10 == -1) {
            i10 = arrayList.size() - 1;
        } else if (i10 == arrayList.size()) {
            i10 = 0;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(i10);
        int i11 = messageObject.type;
        if ((i11 == 1 || i11 == 4) && !messageObject.isSecretMedia()) {
            ArrayList arrayList2 = this.C;
            if (arrayList2.size() > 0) {
                ViewGroup viewGroup5 = (ViewGroup) arrayList2.get(0);
                arrayList2.remove(0);
                viewGroup = viewGroup5;
            } else {
                FrameLayout frameLayout = new FrameLayout(this);
                FrameLayout frameLayout2 = new FrameLayout(this);
                frameLayout2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                frameLayout.addView(frameLayout2, g7.e6.c(-1.0f, -1));
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(this);
                o9Var.setTag(311);
                frameLayout2.addView(o9Var, g7.e6.c(-1.0f, -1));
                TextView textView = new TextView(this);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setGravity(17);
                textView.setTag(312);
                frameLayout2.addView(textView, g7.e6.e(-1, -2, 17));
                frameLayout.setTag(2);
                final int i12 = 0;
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kv0
                    public final /* synthetic */ PopupNotificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13 = i12;
                        PopupNotificationActivity popupNotificationActivity = this.b;
                        switch (i13) {
                            case 0:
                                int i14 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i15 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i16 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                viewGroup = frameLayout;
            }
            TextView textView2 = (TextView) viewGroup.findViewWithTag(312);
            org.telegram.ui.Components.o9 o9Var2 = (org.telegram.ui.Components.o9) viewGroup.findViewWithTag(311);
            o9Var2.setAspectFit(true);
            int i13 = messageObject.type;
            if (i13 == 1) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 100);
                if (closestPhotoSizeWithSize != null) {
                    boolean z11 = messageObject.type != 1 || FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(messageObject.messageOwner).exists();
                    if (!messageObject.needDrawBluredPreview()) {
                        if (z11 || DownloadController.getInstance(messageObject.currentAccount).canDownloadMedia(messageObject)) {
                            o9Var2.j(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "100_100", ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "100_100_b", closestPhotoSizeWithSize.size, messageObject);
                        } else if (closestPhotoSizeWithSize2 != null) {
                            o9Var2.i(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "100_100_b", null, null, messageObject);
                        }
                        o9Var2.setVisibility(0);
                        textView2.setVisibility(8);
                        viewGroup2 = viewGroup;
                    }
                }
                o9Var2.setVisibility(8);
                textView2.setVisibility(0);
                textView2.setTextSize(2, SharedConfig.fontSize);
                textView2.setText(messageObject.messageText);
                viewGroup2 = viewGroup;
            } else {
                viewGroup2 = viewGroup;
                if (i13 == 4) {
                    textView2.setVisibility(8);
                    textView2.setText(messageObject.messageText);
                    o9Var2.setVisibility(0);
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    double d = geoPoint.lat;
                    double d9 = geoPoint._long;
                    if (MessagesController.getInstance(messageObject.currentAccount).mapProvider == 2) {
                        o9Var2.i(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 100, 100, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, messageObject);
                        viewGroup2 = viewGroup;
                    } else {
                        o9Var2.f(AndroidUtilities.formapMapUrl(messageObject.currentAccount, d, d9, 100, 100, true, 15, -1), null, null);
                        viewGroup2 = viewGroup;
                    }
                }
            }
        } else if (messageObject.type == 2) {
            ArrayList arrayList3 = this.D;
            if (arrayList3.size() > 0) {
                ViewGroup viewGroup6 = (ViewGroup) arrayList3.get(0);
                arrayList3.remove(0);
                bg0Var = (org.telegram.ui.Components.bg0) viewGroup6.findViewWithTag(300);
                viewGroup4 = viewGroup6;
            } else {
                FrameLayout frameLayout3 = new FrameLayout(this);
                FrameLayout frameLayout4 = new FrameLayout(this);
                frameLayout4.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                frameLayout3.addView(frameLayout4, g7.e6.c(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(this);
                frameLayout4.addView(frameLayout5, g7.e6.d(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                org.telegram.ui.Components.bg0 bg0Var2 = new org.telegram.ui.Components.bg0(this);
                bg0Var2.f = false;
                bg0Var2.y = 0;
                bg0Var2.C = 0;
                bg0Var2.F = 0;
                TextPaint textPaint = new TextPaint(1);
                bg0Var2.r = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                bg0Var2.G = DownloadController.getInstance(bg0Var2.n).generateObserverTag();
                org.telegram.ui.Components.ln0 ln0Var = new org.telegram.ui.Components.ln0(bg0Var2);
                bg0Var2.s = ln0Var;
                ln0Var.h = bg0Var2;
                org.telegram.ui.Components.kh0 kh0Var = new org.telegram.ui.Components.kh0();
                kh0Var.c = 0.0f;
                kh0Var.f = AndroidUtilities.dp(2.0f);
                kh0Var.a = new Paint();
                kh0Var.b = new Paint();
                bg0Var2.v = kh0Var;
                bg0Var2.setTag(300);
                frameLayout5.addView(bg0Var2);
                frameLayout3.setTag(3);
                final int i14 = 1;
                frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kv0
                    public final /* synthetic */ PopupNotificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i132 = i14;
                        PopupNotificationActivity popupNotificationActivity = this.b;
                        switch (i132) {
                            case 0:
                                int i142 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i15 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i16 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                viewGroup4 = frameLayout3;
                bg0Var = bg0Var2;
            }
            bg0Var.setMessageObject(messageObject);
            viewGroup2 = viewGroup4;
            if (DownloadController.getInstance(messageObject.currentAccount).canDownloadMedia(messageObject)) {
                viewGroup2 = viewGroup4;
                if (bg0Var.y == 2) {
                    FileLoader.getInstance(bg0Var.n).loadFile(bg0Var.h.getDocument(), bg0Var.h, 1, 0);
                    bg0Var.y = 3;
                    bg0Var.invalidate();
                    viewGroup2 = viewGroup4;
                }
            }
        } else {
            ArrayList arrayList4 = this.B;
            if (arrayList4.size() > 0) {
                ViewGroup viewGroup7 = (ViewGroup) arrayList4.get(0);
                arrayList4.remove(0);
                viewGroup3 = viewGroup7;
            } else {
                FrameLayout frameLayout6 = new FrameLayout(this);
                ScrollView scrollView = new ScrollView(this);
                scrollView.setFillViewport(true);
                frameLayout6.addView(scrollView, g7.e6.c(-1.0f, -1));
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(0);
                linearLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                scrollView.addView(linearLayout, g7.e6.x(-1, -2, 1));
                linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                final int i15 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kv0
                    public final /* synthetic */ PopupNotificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i132 = i15;
                        PopupNotificationActivity popupNotificationActivity = this.b;
                        switch (i132) {
                            case 0:
                                int i142 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i152 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i16 = PopupNotificationActivity.X;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                TextView textView3 = new TextView(this);
                textView3.setTextSize(1, 16.0f);
                textView3.setTag(301);
                int i16 = org.telegram.ui.ActionBar.f6.G6;
                textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                textView3.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                textView3.setGravity(17);
                linearLayout.addView(textView3, g7.e6.q(-1, -2, 17));
                frameLayout6.setTag(1);
                viewGroup3 = frameLayout6;
            }
            TextView textView4 = (TextView) viewGroup3.findViewWithTag(301);
            textView4.setTextSize(2, SharedConfig.fontSize);
            textView4.setText(messageObject.messageText);
            viewGroup2 = viewGroup3;
        }
        if (viewGroup2.getParent() == null) {
            this.n.addView(viewGroup2);
        }
        viewGroup2.setVisibility(0);
        if (z10) {
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.height = -1;
            layoutParams.width = dp;
            int i17 = this.O;
            if (i10 == i17) {
                viewGroup2.setTranslationX(0.0f);
            } else if (i10 == i17 - 1) {
                viewGroup2.setTranslationX(-dp);
            } else if (i10 == i17 + 1) {
                viewGroup2.setTranslationX(dp);
            }
            viewGroup2.setLayoutParams(layoutParams);
            viewGroup2.invalidate();
        }
        return viewGroup2;
    }

    public final void h(Intent intent) {
        this.V = intent != null && intent.getBooleanExtra("force", false);
        this.W.clear();
        if (this.V) {
            int intExtra = intent != null ? intent.getIntExtra("currentAccount", UserConfig.selectedAccount) : UserConfig.selectedAccount;
            if (!UserConfig.isValidAccount(intExtra)) {
                return;
            } else {
                this.W.addAll(NotificationsController.getInstance(intExtra).popupReplyMessages);
            }
        } else {
            for (int i9 = 0; i9 < 4; i9++) {
                if (UserConfig.getInstance(i9).isClientActivated()) {
                    this.W.addAll(NotificationsController.getInstance(i9).popupMessages);
                }
            }
        }
        if (((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() || !ApplicationLoader.isScreenOn) {
            getWindow().addFlags(2623490);
        } else {
            getWindow().addFlags(2623488);
            getWindow().clearFlags(2);
        }
        if (this.M == null) {
            this.O = 0;
        }
        f();
    }

    public final void i() {
        if (this.K) {
            return;
        }
        this.K = true;
        if (this.V) {
            this.W.clear();
        }
        for (int i9 = 0; i9 < 4; i9++) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.appDidLogout);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.updateInterfaces);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.contactsDidLoad);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.A0();
        }
        if (this.P.isHeld()) {
            this.P.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(MotionEvent motionEvent) {
        char c10;
        float translationX;
        ViewGroup viewGroup;
        LinearLayout linearLayout;
        if (c()) {
            return false;
        }
        if (motionEvent == null || motionEvent.getAction() != 0) {
            final int i9 = 2;
            final int i10 = 1;
            if (motionEvent != null && motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX();
                float f10 = this.S;
                int i11 = (int) (x10 - f10);
                if (f10 != -1.0f && !this.T && Math.abs(i11) > AndroidUtilities.dp(10.0f)) {
                    this.T = true;
                    this.S = x10;
                    AndroidUtilities.lockOrientation(this);
                    VelocityTracker velocityTracker = this.E;
                    if (velocityTracker == null) {
                        this.E = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    i11 = 0;
                }
                if (this.T) {
                    if (this.s == null && i11 > 0) {
                        i11 = 0;
                    }
                    r1 = (this.v != null || i11 >= 0) ? i11 : 0;
                    VelocityTracker velocityTracker2 = this.E;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    a(r1);
                }
            } else if (motionEvent == null || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent == null || !this.T) {
                    a(0);
                } else {
                    int x11 = (int) (motionEvent.getX() - this.S);
                    int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
                    VelocityTracker velocityTracker3 = this.E;
                    if (velocityTracker3 != null) {
                        velocityTracker3.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (this.E.getXVelocity() >= 3500.0f) {
                            c10 = 1;
                        } else if (this.E.getXVelocity() <= -3500.0f) {
                            c10 = 2;
                        }
                        if ((c10 != 1 || x11 > dp / 3) && this.s != null) {
                            translationX = dp - this.r.getTranslationX();
                            viewGroup = this.s;
                            linearLayout = this.x;
                            this.U = new Runnable(this) { // from class: org.telegram.ui.jv0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = r2;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i12) {
                                        case 0:
                                            popupNotificationActivity.Q = false;
                                            ArrayList arrayList = popupNotificationActivity.W;
                                            if (arrayList.size() > 1) {
                                                int i13 = popupNotificationActivity.O;
                                                if (i13 > 0) {
                                                    popupNotificationActivity.O = i13 - 1;
                                                } else {
                                                    popupNotificationActivity.O = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.M = (MessageObject) arrayList.get(popupNotificationActivity.O);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.O + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.Q = false;
                                            popupNotificationActivity.p();
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.Q = false;
                                            popupNotificationActivity.a(0);
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                        } else if ((c10 == 2 || x11 < (-dp) / 3) && this.v != null) {
                            translationX = (-dp) - this.r.getTranslationX();
                            viewGroup = this.v;
                            linearLayout = this.y;
                            this.U = new Runnable(this) { // from class: org.telegram.ui.jv0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = i10;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i12) {
                                        case 0:
                                            popupNotificationActivity.Q = false;
                                            ArrayList arrayList = popupNotificationActivity.W;
                                            if (arrayList.size() > 1) {
                                                int i13 = popupNotificationActivity.O;
                                                if (i13 > 0) {
                                                    popupNotificationActivity.O = i13 - 1;
                                                } else {
                                                    popupNotificationActivity.O = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.M = (MessageObject) arrayList.get(popupNotificationActivity.O);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.O + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.Q = false;
                                            popupNotificationActivity.p();
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.Q = false;
                                            popupNotificationActivity.a(0);
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                        } else if (this.r.getTranslationX() != 0.0f) {
                            float f11 = -this.r.getTranslationX();
                            ViewGroup viewGroup2 = x11 > 0 ? this.s : this.v;
                            LinearLayout linearLayout2 = x11 > 0 ? this.x : this.y;
                            this.U = new Runnable(this) { // from class: org.telegram.ui.jv0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = i9;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i12) {
                                        case 0:
                                            popupNotificationActivity.Q = false;
                                            ArrayList arrayList = popupNotificationActivity.W;
                                            if (arrayList.size() > 1) {
                                                int i13 = popupNotificationActivity.O;
                                                if (i13 > 0) {
                                                    popupNotificationActivity.O = i13 - 1;
                                                } else {
                                                    popupNotificationActivity.O = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.M = (MessageObject) arrayList.get(popupNotificationActivity.O);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.O + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.Q = false;
                                            popupNotificationActivity.p();
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.Q = false;
                                            popupNotificationActivity.a(0);
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                            linearLayout = linearLayout2;
                            translationX = f11;
                            viewGroup = viewGroup2;
                        } else {
                            viewGroup = null;
                            linearLayout = null;
                            translationX = 0.0f;
                        }
                        if (translationX != 0.0f) {
                            int abs = (int) (Math.abs(translationX / dp) * 200.0f);
                            ArrayList arrayList = new ArrayList();
                            ViewGroup viewGroup3 = this.r;
                            arrayList.add(ObjectAnimator.ofFloat(viewGroup3, "translationX", viewGroup3.getTranslationX() + translationX));
                            LinearLayout linearLayout3 = this.w;
                            if (linearLayout3 != null) {
                                arrayList.add(ObjectAnimator.ofFloat(linearLayout3, "translationX", linearLayout3.getTranslationX() + translationX));
                            }
                            if (viewGroup != null) {
                                arrayList.add(ObjectAnimator.ofFloat(viewGroup, "translationX", viewGroup.getTranslationX() + translationX));
                            }
                            if (linearLayout != null) {
                                arrayList.add(ObjectAnimator.ofFloat(linearLayout, "translationX", linearLayout.getTranslationX() + translationX));
                            }
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(arrayList);
                            animatorSet.setDuration(abs);
                            animatorSet.addListener(new bc0(this, 17));
                            animatorSet.start();
                            this.Q = true;
                            this.R = System.currentTimeMillis();
                        }
                    }
                    c10 = 0;
                    if (c10 != 1) {
                    }
                    translationX = dp - this.r.getTranslationX();
                    viewGroup = this.s;
                    linearLayout = this.x;
                    this.U = new Runnable(this) { // from class: org.telegram.ui.jv0
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = r2;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (i12) {
                                case 0:
                                    popupNotificationActivity.Q = false;
                                    ArrayList arrayList2 = popupNotificationActivity.W;
                                    if (arrayList2.size() > 1) {
                                        int i13 = popupNotificationActivity.O;
                                        if (i13 > 0) {
                                            popupNotificationActivity.O = i13 - 1;
                                        } else {
                                            popupNotificationActivity.O = arrayList2.size() - 1;
                                        }
                                        popupNotificationActivity.M = (MessageObject) arrayList2.get(popupNotificationActivity.O);
                                        popupNotificationActivity.q(1);
                                        popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.O + 1), Integer.valueOf(arrayList2.size())));
                                    }
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                                case 1:
                                    popupNotificationActivity.Q = false;
                                    popupNotificationActivity.p();
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                                default:
                                    popupNotificationActivity.Q = false;
                                    popupNotificationActivity.a(0);
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                            }
                        }
                    };
                    if (translationX != 0.0f) {
                    }
                }
                VelocityTracker velocityTracker4 = this.E;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.E = null;
                }
                this.T = false;
                this.S = -1.0f;
            }
        } else {
            this.S = motionEvent.getX();
        }
        return this.T;
    }

    public final void k() {
        if (this.M == null) {
            return;
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
        long dialogId = this.M.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            intent.putExtra("encId", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            intent.putExtra("userId", dialogId);
        } else if (DialogObject.isChatDialog(dialogId)) {
            intent.putExtra("chatId", -dialogId);
        }
        intent.putExtra("currentAccount", this.M.currentAccount);
        intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i9) {
        MessageObject messageObject;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        if (i9 == 0) {
            n(this.r);
            n(this.s);
            n(this.v);
            m(this.w);
            m(this.x);
            m(this.y);
            int i10 = this.O - 1;
            while (true) {
                int i11 = this.O;
                if (i10 >= i11 + 2) {
                    break;
                }
                if (i10 == i11 - 1) {
                    this.s = g(i10, true);
                    this.x = e(i10, true);
                } else if (i10 == i11) {
                    this.r = g(i10, true);
                    this.w = e(i10, true);
                } else if (i10 == i11 + 1) {
                    this.v = g(i10, true);
                    this.y = e(i10, true);
                }
                i10++;
            }
        } else if (i9 == 1) {
            n(this.v);
            m(this.y);
            this.v = this.r;
            this.r = this.s;
            this.s = g(this.O - 1, true);
            this.y = this.w;
            this.w = this.x;
            this.x = e(this.O - 1, true);
        } else if (i9 == 2) {
            n(this.s);
            m(this.x);
            this.s = this.r;
            this.r = this.v;
            this.v = g(this.O + 1, true);
            this.x = this.w;
            this.w = this.y;
            this.y = e(this.O + 1, true);
        } else if (i9 == 3) {
            ViewGroup viewGroup = this.v;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.v);
                ViewGroup g10 = g(this.O + 1, false);
                this.v = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g10.getLayoutParams();
                    layoutParams.width = dp;
                    this.v.setLayoutParams(layoutParams);
                    this.v.setTranslationX(translationX);
                    this.v.invalidate();
                }
            }
            LinearLayout linearLayout = this.y;
            if (linearLayout != null) {
                float translationX2 = linearLayout.getTranslationX();
                m(this.y);
                LinearLayout e10 = e(this.O + 1, false);
                this.y = e10;
                if (e10 != null) {
                    e10.setTranslationX(translationX2);
                }
            }
        } else if (i9 == 4) {
            ViewGroup viewGroup2 = this.s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.s);
                ViewGroup g11 = g(0, false);
                this.s = g11;
                if (g11 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g11.getLayoutParams();
                    layoutParams2.width = dp;
                    this.s.setLayoutParams(layoutParams2);
                    this.s.setTranslationX(translationX3);
                    this.s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.x;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.x);
                LinearLayout e11 = e(0, false);
                this.x = e11;
                if (e11 != null) {
                    e11.setTranslationX(translationX4);
                }
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = (this.O - 1) + i12;
            ArrayList arrayList = this.W;
            if (arrayList.size() != 1 || (i13 >= 0 && i13 < arrayList.size())) {
                if (i13 == -1) {
                    i13 = arrayList.size() - 1;
                } else if (i13 == arrayList.size()) {
                    i13 = 0;
                }
                messageObject = (MessageObject) arrayList.get(i13);
            } else {
                messageObject = null;
            }
            this.N[i12] = messageObject;
        }
    }

    public final void m(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        this.A.removeView(linearLayout);
    }

    public final void n(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int intValue = ((Integer) viewGroup.getTag()).intValue();
        viewGroup.setVisibility(8);
        if (intValue == 1) {
            this.B.add(viewGroup);
        } else if (intValue == 2) {
            this.C.add(viewGroup);
        } else if (intValue == 3) {
            this.D.add(viewGroup);
        }
    }

    public final void o(boolean z10) {
        if (this.a == null) {
            return;
        }
        int i9 = 0;
        org.telegram.ui.Components.tv0[] tv0VarArr = this.F;
        if (!z10) {
            this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(0);
            while (i9 < tv0VarArr.length) {
                tv0VarArr[i9].e();
                i9++;
            }
            return;
        }
        try {
            Integer printingStringType = MessagesController.getInstance(this.M.currentAccount).getPrintingStringType(this.M.getDialogId(), 0L);
            this.e.setCompoundDrawablesWithIntrinsicBounds(tv0VarArr[printingStringType.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            while (i9 < tv0VarArr.length) {
                if (i9 == printingStringType.intValue()) {
                    tv0VarArr[i9].d();
                } else {
                    tv0VarArr[i9].e();
                }
                i9++;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.b.s0()) {
            this.b.l0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        d();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.f6.R(this);
        org.telegram.ui.ActionBar.f6.J(this, false);
        AndroidUtilities.fillStatusBarHeight(this, false);
        for (int i9 = 0; i9 < 4; i9++) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.appDidLogout);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.updateInterfaces);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.contactsDidLoad);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.G = ConnectionsManager.generateClassGuid();
        this.F[0] = new org.telegram.ui.Components.j41(false);
        this.F[1] = new org.telegram.ui.Components.hp(false);
        this.F[2] = new org.telegram.ui.Components.go0(false);
        this.F[3] = new org.telegram.ui.Components.rf0(null, false);
        this.F[4] = new org.telegram.ui.Components.gl0(false);
        fh.x4 x4Var = new fh.x4(this, this, 7);
        setContentView(x4Var);
        x4Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        x4Var.addView(relativeLayout, g7.e6.c(-1.0f, -1));
        lv0 lv0Var = new lv0(this, this);
        this.A = lv0Var;
        lv0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        float f10 = -1;
        relativeLayout.addView(this.A, g7.e6.v(12, f10, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.A0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, x4Var, null, false, null);
        this.b = chatActivityEnterView2;
        chatActivityEnterView2.setId(MediaDataController.MAX_STYLE_RUNS_COUNT);
        this.A.addView(this.b, g7.e6.v(0, f10, 0, -2, 12));
        this.b.setDelegate(new mv0(this));
        m0 m0Var = new m0(this, this, 19);
        this.n = m0Var;
        this.A.addView(m0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setBackButtonImage(R.drawable.ic_close_white);
        this.a.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.s8, false));
        this.a.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.t8, false), false);
        this.A.addView(this.a);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = -1;
        this.a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.w0 g10 = this.a.n().g(2, 0, AndroidUtilities.dp(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i10 = org.telegram.ui.ActionBar.f6.B8;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g10.addView(this.h, g7.e6.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        this.a.addView(this.f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = AndroidUtilities.dp(48.0f);
        layoutParams2.leftMargin = AndroidUtilities.dp(60.0f);
        layoutParams2.gravity = 51;
        this.f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(this);
        this.c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f.addView(this.c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.width = AndroidUtilities.dp(42.0f);
        layoutParams3.height = AndroidUtilities.dp(42.0f);
        layoutParams3.topMargin = AndroidUtilities.dp(3.0f);
        this.c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A8, false));
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams4.bottomMargin = AndroidUtilities.dp(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.e = textView4;
        textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.e.setTextSize(1, 14.0f);
        this.e.setLines(1);
        this.e.setMaxLines(1);
        this.e.setSingleLine(true);
        this.e.setEllipsize(truncateAt);
        this.e.setGravity(3);
        this.f.addView(this.e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams5.bottomMargin = AndroidUtilities.dp(4.0f);
        layoutParams5.gravity = 80;
        this.e.setLayoutParams(layoutParams5);
        this.a.setActionBarMenuOnItemClick(new cd0(this, 12));
        PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(268435462, "screen");
        this.P = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController.getInstance().setFeedbackView(this.b, false);
        if (this.P.isHeld()) {
            this.P.release();
        }
        org.telegram.ui.Components.o9 o9Var = this.c;
        if (o9Var != null) {
            o9Var.setImageDrawable(null);
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        h(intent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.l0(false);
            this.b.setFieldFocused(false);
        }
        int i9 = this.H;
        if (i9 >= 0) {
            ConnectionsManager.getInstance(i9).setAppPaused(true, false);
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (i9 != 3 || iArr[0] == 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.PermissionNoAudioWithHint);
        alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new dl0(this, 7));
        org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        MediaController.getInstance().setFeedbackView(this.b, true);
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.P.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.W;
        if (arrayList.size() > 1) {
            if (this.O < arrayList.size() - 1) {
                this.O++;
            } else {
                this.O = 0;
            }
            this.M = (MessageObject) arrayList.get(this.O);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.O + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i9) {
        if (this.a == null) {
            return;
        }
        int i10 = this.H;
        if (i10 != this.M.currentAccount) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(i10).setAppPaused(true, false);
            }
            int i11 = this.M.currentAccount;
            this.H = i11;
            ConnectionsManager.getInstance(i11).setAppPaused(false, false);
        }
        this.J = null;
        this.I = null;
        long dialogId = this.M.getDialogId();
        this.b.b1(this.M.currentAccount, dialogId);
        if (DialogObject.isEncryptedDialog(dialogId)) {
            this.I = MessagesController.getInstance(this.M.currentAccount).getUser(Long.valueOf(org.telegram.messenger.l0.l(MessagesController.getInstance(this.M.currentAccount), dialogId).user_id));
        } else if (DialogObject.isUserDialog(dialogId)) {
            this.I = MessagesController.getInstance(this.M.currentAccount).getUser(Long.valueOf(dialogId));
        } else if (DialogObject.isChatDialog(dialogId)) {
            this.J = MessagesController.getInstance(this.M.currentAccount).getChat(Long.valueOf(-dialogId));
            if (this.M.isFromUser()) {
                this.I = MessagesController.getInstance(this.M.currentAccount).getUser(Long.valueOf(this.M.messageOwner.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.J;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.I;
            if (user != null) {
                this.e.setText(UserObject.getUserName(user));
            } else {
                this.e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.I;
            if (user2 != null) {
                this.d.setText(UserObject.getUserName(user2));
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_white, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                } else {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(0);
                }
            }
        }
        l(i9);
        r();
        b();
        a(0);
    }

    public final void r() {
        MessageObject messageObject;
        TLRPC.User user;
        if (this.a == null || (messageObject = this.M) == null || this.J != null || (user = this.I) == null) {
            return;
        }
        long j10 = user.id;
        if (j10 / 1000 == 777 || j10 / 1000 == 333 || ContactsController.getInstance(messageObject.currentAccount).contactsDict.get(Long.valueOf(this.I.id)) != null || (ContactsController.getInstance(this.M.currentAccount).contactsDict.size() == 0 && ContactsController.getInstance(this.M.currentAccount).isLoadingContacts())) {
            this.d.setText(UserObject.getUserName(this.I));
        } else {
            String str = this.I.phone;
            if (str == null || str.length() == 0) {
                this.d.setText(UserObject.getUserName(this.I));
            } else {
                this.d.setText(ne.b.c().b("+" + this.I.phone));
            }
        }
        TLRPC.User user2 = this.I;
        if (user2 != null && user2.id == UserObject.VERIFY) {
            this.e.setText(LocaleController.getString(R.string.VerifyCodesNotifications));
            return;
        }
        if (user2 != null && user2.id == 777000) {
            this.e.setText(LocaleController.getString(R.string.ServiceNotifications));
            return;
        }
        CharSequence printingString = MessagesController.getInstance(this.M.currentAccount).getPrintingString(this.M.getDialogId(), 0L, false);
        if (printingString != null && printingString.length() != 0) {
            this.L = printingString;
            this.e.setText(printingString);
            o(true);
        } else {
            this.L = null;
            o(false);
            TLRPC.User user3 = MessagesController.getInstance(this.M.currentAccount).getUser(Long.valueOf(this.I.id));
            if (user3 != null) {
                this.I = user3;
            }
            this.e.setText(LocaleController.formatUserStatus(this.M.currentAccount, this.I));
        }
    }
}
