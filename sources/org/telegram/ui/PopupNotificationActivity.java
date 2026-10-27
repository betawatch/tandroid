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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class PopupNotificationActivity extends Activity implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int b0 = 0;
    public dw0 E;
    public int K;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public CharSequence P;
    public boolean Z;
    public org.telegram.ui.ActionBar.k a;
    public ChatActivityEnterView b;
    public org.telegram.ui.Components.y9 c;
    public TextView d;
    public TextView e;
    public FrameLayout f;
    public TextView h;
    public k0 n;
    public ViewGroup r;
    public ViewGroup s;
    public ViewGroup v;
    public LinearLayout w;
    public LinearLayout x;
    public LinearLayout y;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public VelocityTracker I = null;
    public final org.telegram.ui.Components.sx0[] J = new org.telegram.ui.Components.sx0[5];
    public int L = -1;
    public boolean O = false;
    public MessageObject Q = null;
    public final MessageObject[] R = new MessageObject[3];
    public int S = 0;
    public PowerManager.WakeLock T = null;
    public boolean U = false;
    public long V = 0;
    public float W = -1.0f;
    public boolean X = false;
    public Runnable Y = null;
    public final ArrayList a0 = new ArrayList();

    public final void a(int i10) {
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != dp) {
                layoutParams.width = dp;
                this.s.setLayoutParams(layoutParams);
            }
            this.s.setTranslationX((-dp) + i10);
        }
        LinearLayout linearLayout = this.x;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-dp) + i10);
        }
        ViewGroup viewGroup2 = this.r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != dp) {
                layoutParams2.width = dp;
                this.r.setLayoutParams(layoutParams2);
            }
            this.r.setTranslationX(i10);
        }
        LinearLayout linearLayout2 = this.w;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i10);
        }
        ViewGroup viewGroup3 = this.v;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != dp) {
                layoutParams3.width = dp;
                this.v.setLayoutParams(layoutParams3);
            }
            this.v.setTranslationX(dp + i10);
        }
        LinearLayout linearLayout3 = this.y;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(dp + i10);
        }
        this.n.invalidate();
    }

    public final void b() {
        TLRPC.User user;
        MessageObject messageObject = this.Q;
        if (messageObject == null) {
            return;
        }
        if (this.N != null) {
            TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(this.N.id));
            if (chat == null) {
                return;
            }
            this.N = chat;
            if (this.c != null) {
                this.c.f(chat, new org.telegram.ui.Components.j9(this.N));
                return;
            }
            return;
        }
        if (this.M == null || (user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(this.M.id))) == null) {
            return;
        }
        this.M = user;
        if (this.c != null) {
            this.c.f(user, new org.telegram.ui.Components.j9(0, this.M));
        }
    }

    public final boolean c() {
        if (this.U && this.V < System.currentTimeMillis() - 400) {
            this.U = false;
            Runnable runnable = this.Y;
            if (runnable != null) {
                runnable.run();
                this.Y = null;
            }
        }
        return this.U;
    }

    public final void d() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new fw0(this, 0));
        }
        k0 k0Var = this.n;
        if (k0Var != null) {
            k0Var.getViewTreeObserver().addOnPreDrawListener(new fw0(this, 1));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.ph0 ph0Var;
        MessageObject messageObject;
        org.telegram.ui.Components.ph0 ph0Var2;
        MessageObject messageObject2;
        MessageObject messageObject3;
        if (i10 == NotificationCenter.appDidLogout) {
            if (i11 == this.L) {
                i();
                finish();
                return;
            }
            return;
        }
        int i12 = 0;
        if (i10 == NotificationCenter.pushMessagesUpdated) {
            if (this.Z) {
                return;
            }
            ArrayList arrayList = this.a0;
            arrayList.clear();
            for (int i13 = 0; i13 < 4; i13++) {
                if (UserConfig.getInstance(i13).isClientActivated()) {
                    arrayList.addAll(NotificationsController.getInstance(i13).popupMessages);
                }
            }
            f();
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i14 = 0; i14 < 3; i14++) {
                int i15 = (this.S - 1) + i14;
                if (arrayList.size() != 1 || (i15 >= 0 && i15 < arrayList.size())) {
                    if (i15 == -1) {
                        i15 = arrayList.size() - 1;
                    } else if (i15 == arrayList.size()) {
                        i15 = 0;
                    }
                    messageObject3 = (MessageObject) arrayList.get(i15);
                } else {
                    messageObject3 = null;
                }
                if (this.R[i14] != messageObject3) {
                    q(0);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            if (this.Q == null || i11 != this.L) {
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
                CharSequence printingString = MessagesController.getInstance(this.Q.currentAccount).getPrintingString(this.Q.getDialogId(), 0L, false);
                CharSequence charSequence = this.P;
                if ((charSequence == null || printingString != null) && ((charSequence != null || printingString == null) && (charSequence == null || charSequence.equals(printingString)))) {
                    return;
                }
                r();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidReset) {
            Integer num = (Integer) objArr[0];
            k0 k0Var = this.n;
            if (k0Var != null) {
                int childCount = k0Var.getChildCount();
                while (i12 < childCount) {
                    View childAt = this.n.getChildAt(i12);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (ph0Var2 = (org.telegram.ui.Components.ph0) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.currentAccount == i11 && messageObject2.getId() == num.intValue()) {
                        ph0Var2.q();
                        return;
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num2 = (Integer) objArr[0];
            k0 k0Var2 = this.n;
            if (k0Var2 != null) {
                int childCount2 = k0Var2.getChildCount();
                while (i12 < childCount2) {
                    View childAt2 = this.n.getChildAt(i12);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (ph0Var = (org.telegram.ui.Components.ph0) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.currentAccount == i11 && messageObject.getId() == num2.intValue()) {
                        ph0Var.r();
                        return;
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.contactsDidLoad && i11 == this.L) {
                r();
                return;
            }
            return;
        }
        k0 k0Var3 = this.n;
        if (k0Var3 != null) {
            int childCount3 = k0Var3.getChildCount();
            while (i12 < childCount3) {
                View childAt3 = this.n.getChildAt(i12);
                if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                    textView.invalidate();
                }
                i12++;
            }
        }
    }

    public final LinearLayout e(int i10, boolean z10) {
        int i11;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i12 = i10;
        ArrayList arrayList2 = this.a0;
        LinearLayout linearLayout = null;
        if (arrayList2.size() == 1 && (i12 < 0 || i12 >= arrayList2.size())) {
            return null;
        }
        int i13 = 0;
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
            i11 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i14);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (bg.c.c(keyboardInlineButtonRow.buttons.get(i15), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i11++;
                    }
                }
            }
        } else {
            i11 = 0;
        }
        int i16 = messageObject.currentAccount;
        if (i11 > 0 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size3 = arrayList4.size();
            LinearLayout linearLayout2 = null;
            int i17 = 0;
            while (i17 < size3) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList4.get(i17);
                int size4 = keyboardInlineButtonRow2.buttons.size();
                int i18 = i13;
                while (i18 < size4) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i18);
                    if (bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(i13);
                            arrayList = arrayList4;
                            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, linearLayout2, null);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new de1(1));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.n6, null);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(true));
                        linearLayout2.addView(textView, org.telegram.ui.Components.kb1.p(100.0f / i11, -1, -1));
                        textView.setOnClickListener(new bw0(messageObject, i16));
                    } else {
                        arrayList = arrayList4;
                    }
                    i18++;
                    arrayList4 = arrayList;
                    i13 = 0;
                }
                i17++;
                i13 = 0;
            }
            linearLayout = linearLayout2;
        }
        if (linearLayout != null) {
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z10) {
                int i19 = this.S;
                if (i12 == i19) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i12 == i19 - 1) {
                    linearLayout.setTranslationX(-dp);
                } else if (i12 == i19 + 1) {
                    linearLayout.setTranslationX(dp);
                }
            }
            this.E.addView(linearLayout, layoutParams);
        }
        return linearLayout;
    }

    public final void f() {
        ArrayList arrayList = this.a0;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.S != 0 || this.b.g0() || this.X) && this.Q != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject.currentAccount == this.Q.currentAccount && messageObject.getDialogId() == this.Q.getDialogId() && messageObject.getId() == this.Q.getId()) {
                    this.S = i10;
                    if (this.X) {
                        if (i10 == arrayList.size() - 1) {
                            l(3);
                        } else if (this.S == 1) {
                            l(4);
                        }
                    }
                    this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
                }
            }
        }
        this.S = 0;
        this.Q = (MessageObject) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
    }

    public final ViewGroup g(int i10, boolean z10) {
        int i11;
        int i12;
        ViewGroup viewGroup;
        MessageObject messageObject;
        int i13;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        org.telegram.ui.Components.ph0 ph0Var;
        int i14 = i10;
        ArrayList arrayList = this.a0;
        if (arrayList.size() == 1 && (i14 < 0 || i14 >= arrayList.size())) {
            return null;
        }
        if (i14 == -1) {
            i14 = arrayList.size() - 1;
        } else if (i14 == arrayList.size()) {
            i14 = 0;
        }
        MessageObject messageObject2 = (MessageObject) arrayList.get(i14);
        int i15 = messageObject2.type;
        if ((i15 == 1 || i15 == 4) && !messageObject2.isSecretMedia()) {
            ArrayList arrayList2 = this.G;
            if (arrayList2.size() > 0) {
                ViewGroup viewGroup5 = (ViewGroup) arrayList2.get(0);
                arrayList2.remove(0);
                i12 = 0;
                i11 = 2;
                viewGroup = viewGroup5;
            } else {
                FrameLayout frameLayout = new FrameLayout(this);
                FrameLayout frameLayout2 = new FrameLayout(this);
                i11 = 2;
                i12 = 0;
                frameLayout2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout2.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                frameLayout.addView(frameLayout2, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(this);
                y9Var.setTag(311);
                frameLayout2.addView(y9Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                TextView textView = new TextView(this);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
                textView.setTextSize(1, 16.0f);
                textView.setGravity(17);
                textView.setTag(312);
                frameLayout2.addView(textView, org.telegram.ui.Components.kb1.i(-1, -2, 17));
                frameLayout.setTag(2);
                final int i16 = 0;
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cw0
                    public final /* synthetic */ PopupNotificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i17 = i16;
                        PopupNotificationActivity popupNotificationActivity = this.b;
                        switch (i17) {
                            case 0:
                                int i18 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i19 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i20 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                viewGroup = frameLayout;
            }
            TextView textView2 = (TextView) viewGroup.findViewWithTag(312);
            org.telegram.ui.Components.y9 y9Var2 = (org.telegram.ui.Components.y9) viewGroup.findViewWithTag(311);
            y9Var2.setAspectFit(true);
            int i17 = messageObject2.type;
            if (i17 == 1) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, 100);
                if (closestPhotoSizeWithSize != null) {
                    int i18 = (messageObject2.type != 1 || FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(messageObject2.messageOwner).exists()) ? 1 : i12;
                    if (!messageObject2.needDrawBluredPreview()) {
                        if (i18 != 0 || DownloadController.getInstance(messageObject2.currentAccount).canDownloadMedia(messageObject2)) {
                            y9Var2.j(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject2.photoThumbsObject), "100_100", ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject2.photoThumbsObject), "100_100_b", closestPhotoSizeWithSize.size, messageObject2);
                        } else if (closestPhotoSizeWithSize2 != null) {
                            y9Var2.i(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject2.photoThumbsObject), "100_100_b", null, null, messageObject2);
                        } else {
                            messageObject = messageObject2;
                            i13 = i12;
                            y9Var2.setVisibility(8);
                            textView2.setVisibility(i13);
                            textView2.setTextSize(i11, SharedConfig.fontSize);
                            textView2.setText(messageObject.messageText);
                            viewGroup2 = viewGroup;
                        }
                        y9Var2.setVisibility(i12);
                        textView2.setVisibility(8);
                        viewGroup2 = viewGroup;
                    }
                }
                messageObject = messageObject2;
                i13 = i12;
                y9Var2.setVisibility(8);
                textView2.setVisibility(i13);
                textView2.setTextSize(i11, SharedConfig.fontSize);
                textView2.setText(messageObject.messageText);
                viewGroup2 = viewGroup;
            } else {
                viewGroup2 = viewGroup;
                if (i17 == 4) {
                    textView2.setVisibility(8);
                    textView2.setText(messageObject2.messageText);
                    y9Var2.setVisibility(0);
                    TLRPC.GeoPoint geoPoint = messageObject2.messageOwner.media.geo;
                    double d = geoPoint.lat;
                    double d10 = geoPoint._long;
                    if (MessagesController.getInstance(messageObject2.currentAccount).mapProvider == 2) {
                        y9Var2.i(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 100, 100, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, messageObject2);
                        viewGroup2 = viewGroup;
                    } else {
                        y9Var2.g(AndroidUtilities.formapMapUrl(messageObject2.currentAccount, d, d10, 100, 100, true, 15, -1), null, null);
                        viewGroup2 = viewGroup;
                    }
                }
            }
        } else if (messageObject2.type == 2) {
            ArrayList arrayList3 = this.H;
            if (arrayList3.size() > 0) {
                ViewGroup viewGroup6 = (ViewGroup) arrayList3.get(0);
                arrayList3.remove(0);
                ph0Var = (org.telegram.ui.Components.ph0) viewGroup6.findViewWithTag(300);
                viewGroup4 = viewGroup6;
            } else {
                FrameLayout frameLayout3 = new FrameLayout(this);
                FrameLayout frameLayout4 = new FrameLayout(this);
                frameLayout4.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout4.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                frameLayout3.addView(frameLayout4, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(this);
                frameLayout4.addView(frameLayout5, org.telegram.ui.Components.kb1.h(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                org.telegram.ui.Components.ph0 ph0Var2 = new org.telegram.ui.Components.ph0(this);
                ph0Var2.f = false;
                ph0Var2.y = 0;
                ph0Var2.G = 0;
                ph0Var2.J = 0;
                TextPaint textPaint = new TextPaint(1);
                ph0Var2.r = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                ph0Var2.K = DownloadController.getInstance(ph0Var2.n).generateObserverTag();
                org.telegram.ui.Components.jp0 jp0Var = new org.telegram.ui.Components.jp0(ph0Var2);
                ph0Var2.s = jp0Var;
                jp0Var.h = ph0Var2;
                org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0();
                yi0Var.c = 0.0f;
                yi0Var.f = AndroidUtilities.dp(2.0f);
                yi0Var.a = new Paint();
                yi0Var.b = new Paint();
                ph0Var2.v = yi0Var;
                ph0Var2.setTag(300);
                frameLayout5.addView(ph0Var2);
                frameLayout3.setTag(3);
                final int i19 = 1;
                frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cw0
                    public final /* synthetic */ PopupNotificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172 = i19;
                        PopupNotificationActivity popupNotificationActivity = this.b;
                        switch (i172) {
                            case 0:
                                int i182 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i192 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i20 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                viewGroup4 = frameLayout3;
                ph0Var = ph0Var2;
            }
            ph0Var.setMessageObject(messageObject2);
            if (DownloadController.getInstance(messageObject2.currentAccount).canDownloadMedia(messageObject2) && ph0Var.y == 2) {
                FileLoader.getInstance(ph0Var.n).loadFile(ph0Var.h.getDocument(), ph0Var.h, 1, 0);
                ph0Var.y = 3;
                ph0Var.invalidate();
                viewGroup2 = viewGroup4;
            } else {
                viewGroup2 = viewGroup4;
            }
        } else {
            ArrayList arrayList4 = this.F;
            if (arrayList4.size() > 0) {
                ViewGroup viewGroup7 = (ViewGroup) arrayList4.get(0);
                arrayList4.remove(0);
                viewGroup3 = viewGroup7;
            } else {
                FrameLayout frameLayout6 = new FrameLayout(this);
                ScrollView scrollView = new ScrollView(this);
                scrollView.setFillViewport(true);
                frameLayout6.addView(scrollView, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(0);
                linearLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                scrollView.addView(linearLayout, org.telegram.ui.Components.kb1.B(-1, -2, 1));
                linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                final int i20 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cw0
                    public final /* synthetic */ PopupNotificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172 = i20;
                        PopupNotificationActivity popupNotificationActivity = this.b;
                        switch (i172) {
                            case 0:
                                int i182 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i192 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i202 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                TextView textView3 = new TextView(this);
                textView3.setTextSize(1, 16.0f);
                textView3.setTag(301);
                int i21 = org.telegram.ui.ActionBar.y6.G6;
                org.telegram.ui.ActionBar.f7.V(textView3, i21, null);
                org.telegram.ui.ActionBar.f7.H(textView3, i21, null);
                textView3.setGravity(17);
                linearLayout.addView(textView3, org.telegram.ui.Components.kb1.u(-1, -2, 17));
                frameLayout6.setTag(1);
                viewGroup3 = frameLayout6;
            }
            TextView textView4 = (TextView) viewGroup3.findViewWithTag(301);
            textView4.setTextSize(2, SharedConfig.fontSize);
            textView4.setText(messageObject2.messageText);
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
            int i22 = this.S;
            if (i14 == i22) {
                viewGroup2.setTranslationX(0.0f);
            } else if (i14 == i22 - 1) {
                viewGroup2.setTranslationX(-dp);
            } else if (i14 == i22 + 1) {
                viewGroup2.setTranslationX(dp);
            }
            viewGroup2.setLayoutParams(layoutParams);
            viewGroup2.invalidate();
        }
        return viewGroup2;
    }

    public final void h(Intent intent) {
        this.Z = intent != null && intent.getBooleanExtra("force", false);
        this.a0.clear();
        if (this.Z) {
            int intExtra = intent != null ? intent.getIntExtra("currentAccount", UserConfig.selectedAccount) : UserConfig.selectedAccount;
            if (!UserConfig.isValidAccount(intExtra)) {
                return;
            } else {
                this.a0.addAll(NotificationsController.getInstance(intExtra).popupReplyMessages);
            }
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                if (UserConfig.getInstance(i10).isClientActivated()) {
                    this.a0.addAll(NotificationsController.getInstance(i10).popupMessages);
                }
            }
        }
        if (((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() || !ApplicationLoader.isScreenOn) {
            getWindow().addFlags(2623490);
        } else {
            getWindow().addFlags(2623488);
            getWindow().clearFlags(2);
        }
        if (this.Q == null) {
            this.S = 0;
        }
        f();
    }

    public final void i() {
        if (this.O) {
            return;
        }
        this.O = true;
        if (this.Z) {
            this.a0.clear();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.appDidLogout);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.contactsDidLoad);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.y0();
        }
        if (this.T.isHeld()) {
            this.T.release();
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
            final int i10 = 2;
            final int i11 = 1;
            if (motionEvent != null && motionEvent.getAction() == 2) {
                float x9 = motionEvent.getX();
                float f7 = this.W;
                int i12 = (int) (x9 - f7);
                if (f7 != -1.0f && !this.X && Math.abs(i12) > AndroidUtilities.dp(10.0f)) {
                    this.X = true;
                    this.W = x9;
                    AndroidUtilities.lockOrientation(this);
                    VelocityTracker velocityTracker = this.I;
                    if (velocityTracker == null) {
                        this.I = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    i12 = 0;
                }
                if (this.X) {
                    if (this.s == null && i12 > 0) {
                        i12 = 0;
                    }
                    r1 = (this.v != null || i12 >= 0) ? i12 : 0;
                    VelocityTracker velocityTracker2 = this.I;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    a(r1);
                }
            } else if (motionEvent == null || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent == null || !this.X) {
                    a(0);
                } else {
                    int x10 = (int) (motionEvent.getX() - this.W);
                    int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
                    VelocityTracker velocityTracker3 = this.I;
                    if (velocityTracker3 != null) {
                        velocityTracker3.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        if (this.I.getXVelocity() >= 3500.0f) {
                            c10 = 1;
                        } else if (this.I.getXVelocity() <= -3500.0f) {
                            c10 = 2;
                        }
                        if ((c10 != 1 || x10 > dp / 3) && this.s != null) {
                            translationX = dp - this.r.getTranslationX();
                            viewGroup = this.s;
                            linearLayout = this.x;
                            this.Y = new Runnable(this) { // from class: org.telegram.ui.aw0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i13 = r2;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i13) {
                                        case 0:
                                            popupNotificationActivity.U = false;
                                            ArrayList arrayList = popupNotificationActivity.a0;
                                            if (arrayList.size() > 1) {
                                                int i14 = popupNotificationActivity.S;
                                                if (i14 > 0) {
                                                    popupNotificationActivity.S = i14 - 1;
                                                } else {
                                                    popupNotificationActivity.S = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.Q = (MessageObject) arrayList.get(popupNotificationActivity.S);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.p();
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.a(0);
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                        } else if ((c10 == 2 || x10 < (-dp) / 3) && this.v != null) {
                            translationX = (-dp) - this.r.getTranslationX();
                            viewGroup = this.v;
                            linearLayout = this.y;
                            this.Y = new Runnable(this) { // from class: org.telegram.ui.aw0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i13 = i11;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i13) {
                                        case 0:
                                            popupNotificationActivity.U = false;
                                            ArrayList arrayList = popupNotificationActivity.a0;
                                            if (arrayList.size() > 1) {
                                                int i14 = popupNotificationActivity.S;
                                                if (i14 > 0) {
                                                    popupNotificationActivity.S = i14 - 1;
                                                } else {
                                                    popupNotificationActivity.S = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.Q = (MessageObject) arrayList.get(popupNotificationActivity.S);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.p();
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.a(0);
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                        } else if (this.r.getTranslationX() != 0.0f) {
                            float f10 = -this.r.getTranslationX();
                            ViewGroup viewGroup2 = x10 > 0 ? this.s : this.v;
                            LinearLayout linearLayout2 = x10 > 0 ? this.x : this.y;
                            this.Y = new Runnable(this) { // from class: org.telegram.ui.aw0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i13 = i10;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i13) {
                                        case 0:
                                            popupNotificationActivity.U = false;
                                            ArrayList arrayList = popupNotificationActivity.a0;
                                            if (arrayList.size() > 1) {
                                                int i14 = popupNotificationActivity.S;
                                                if (i14 > 0) {
                                                    popupNotificationActivity.S = i14 - 1;
                                                } else {
                                                    popupNotificationActivity.S = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.Q = (MessageObject) arrayList.get(popupNotificationActivity.S);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.p();
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.a(0);
                                            AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                            linearLayout = linearLayout2;
                            translationX = f10;
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
                            animatorSet.addListener(new k50(this, 20));
                            animatorSet.start();
                            this.U = true;
                            this.V = System.currentTimeMillis();
                        }
                    }
                    c10 = 0;
                    if (c10 != 1) {
                    }
                    translationX = dp - this.r.getTranslationX();
                    viewGroup = this.s;
                    linearLayout = this.x;
                    this.Y = new Runnable(this) { // from class: org.telegram.ui.aw0
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = r2;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (i13) {
                                case 0:
                                    popupNotificationActivity.U = false;
                                    ArrayList arrayList2 = popupNotificationActivity.a0;
                                    if (arrayList2.size() > 1) {
                                        int i14 = popupNotificationActivity.S;
                                        if (i14 > 0) {
                                            popupNotificationActivity.S = i14 - 1;
                                        } else {
                                            popupNotificationActivity.S = arrayList2.size() - 1;
                                        }
                                        popupNotificationActivity.Q = (MessageObject) arrayList2.get(popupNotificationActivity.S);
                                        popupNotificationActivity.q(1);
                                        popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList2.size())));
                                    }
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                                case 1:
                                    popupNotificationActivity.U = false;
                                    popupNotificationActivity.p();
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                                default:
                                    popupNotificationActivity.U = false;
                                    popupNotificationActivity.a(0);
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                            }
                        }
                    };
                    if (translationX != 0.0f) {
                    }
                }
                VelocityTracker velocityTracker4 = this.I;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.I = null;
                }
                this.X = false;
                this.W = -1.0f;
            }
        } else {
            this.W = motionEvent.getX();
        }
        return this.X;
    }

    public final void k() {
        if (this.Q == null) {
            return;
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
        long dialogId = this.Q.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            intent.putExtra("encId", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            intent.putExtra("userId", dialogId);
        } else if (DialogObject.isChatDialog(dialogId)) {
            intent.putExtra("chatId", -dialogId);
        }
        intent.putExtra("currentAccount", this.Q.currentAccount);
        intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i10) {
        MessageObject messageObject;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        if (i10 == 0) {
            n(this.r);
            n(this.s);
            n(this.v);
            m(this.w);
            m(this.x);
            m(this.y);
            int i11 = this.S - 1;
            while (true) {
                int i12 = this.S;
                if (i11 >= i12 + 2) {
                    break;
                }
                if (i11 == i12 - 1) {
                    this.s = g(i11, true);
                    this.x = e(i11, true);
                } else if (i11 == i12) {
                    this.r = g(i11, true);
                    this.w = e(i11, true);
                } else if (i11 == i12 + 1) {
                    this.v = g(i11, true);
                    this.y = e(i11, true);
                }
                i11++;
            }
        } else if (i10 == 1) {
            n(this.v);
            m(this.y);
            this.v = this.r;
            this.r = this.s;
            this.s = g(this.S - 1, true);
            this.y = this.w;
            this.w = this.x;
            this.x = e(this.S - 1, true);
        } else if (i10 == 2) {
            n(this.s);
            m(this.x);
            this.s = this.r;
            this.r = this.v;
            this.v = g(this.S + 1, true);
            this.x = this.w;
            this.w = this.y;
            this.y = e(this.S + 1, true);
        } else if (i10 == 3) {
            ViewGroup viewGroup = this.v;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.v);
                ViewGroup g7 = g(this.S + 1, false);
                this.v = g7;
                if (g7 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g7.getLayoutParams();
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
                LinearLayout e = e(this.S + 1, false);
                this.y = e;
                if (e != null) {
                    e.setTranslationX(translationX2);
                }
            }
        } else if (i10 == 4) {
            ViewGroup viewGroup2 = this.s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.s);
                ViewGroup g10 = g(0, false);
                this.s = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g10.getLayoutParams();
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
                LinearLayout e10 = e(0, false);
                this.x = e10;
                if (e10 != null) {
                    e10.setTranslationX(translationX4);
                }
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = (this.S - 1) + i13;
            ArrayList arrayList = this.a0;
            if (arrayList.size() != 1 || (i14 >= 0 && i14 < arrayList.size())) {
                if (i14 == -1) {
                    i14 = arrayList.size() - 1;
                } else if (i14 == arrayList.size()) {
                    i14 = 0;
                }
                messageObject = (MessageObject) arrayList.get(i14);
            } else {
                messageObject = null;
            }
            this.R[i13] = messageObject;
        }
    }

    public final void m(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        this.E.removeView(linearLayout);
    }

    public final void n(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int intValue = ((Integer) viewGroup.getTag()).intValue();
        viewGroup.setVisibility(8);
        if (intValue == 1) {
            this.F.add(viewGroup);
        } else if (intValue == 2) {
            this.G.add(viewGroup);
        } else if (intValue == 3) {
            this.H.add(viewGroup);
        }
    }

    public final void o(boolean z10) {
        if (this.a == null) {
            return;
        }
        int i10 = 0;
        org.telegram.ui.Components.sx0[] sx0VarArr = this.J;
        if (!z10) {
            this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(0);
            while (i10 < sx0VarArr.length) {
                sx0VarArr[i10].e();
                i10++;
            }
            return;
        }
        try {
            Integer printingStringType = MessagesController.getInstance(this.Q.currentAccount).getPrintingStringType(this.Q.getDialogId(), 0L);
            this.e.setCompoundDrawablesWithIntrinsicBounds(sx0VarArr[printingStringType.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            while (i10 < sx0VarArr.length) {
                if (i10 == printingStringType.intValue()) {
                    sx0VarArr[i10].d();
                } else {
                    sx0VarArr[i10].e();
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.b.p0()) {
            this.b.i0(true);
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
        org.telegram.ui.ActionBar.y6.S(this);
        org.telegram.ui.ActionBar.y6.J(this, false);
        AndroidUtilities.fillStatusBarHeight(this, false);
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.appDidLogout);
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.updateInterfaces);
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.contactsDidLoad);
        }
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        this.K = ConnectionsManager.generateClassGuid();
        this.J[0] = new org.telegram.ui.Components.s61(false);
        this.J[1] = new org.telegram.ui.Components.eq(false);
        this.J[2] = new org.telegram.ui.Components.eq0(false);
        this.J[3] = new org.telegram.ui.Components.fh0(null, false);
        this.J[4] = new org.telegram.ui.Components.cn0(false);
        a9 a9Var = new a9(this, this, 6);
        setContentView(a9Var);
        a9Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        a9Var.addView(relativeLayout, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        dw0 dw0Var = new dw0(this, this);
        this.E = dw0Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, dw0Var, null);
        float f7 = -1;
        relativeLayout.addView(this.E, org.telegram.ui.Components.kb1.z(12, f7, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.y0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, a9Var, null, false, null);
        this.b = chatActivityEnterView2;
        chatActivityEnterView2.setId(MediaDataController.MAX_STYLE_RUNS_COUNT);
        this.E.addView(this.b, org.telegram.ui.Components.kb1.z(0, f7, 0, -2, 12));
        this.b.setDelegate(new ew0(this));
        k0 k0Var = new k0(this, this, 20);
        this.n = k0Var;
        this.E.addView(k0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setBackButtonImage(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.s8, this.a, null);
        org.telegram.ui.ActionBar.f7.m(this.a, 3, org.telegram.ui.ActionBar.y6.t8, null);
        org.telegram.ui.ActionBar.f7.m(this.a, 1, org.telegram.ui.ActionBar.y6.v8, null);
        this.E.addView(this.a);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = -1;
        this.a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.w0 g7 = this.a.l().g(2, 0, AndroidUtilities.dp(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i11 = org.telegram.ui.ActionBar.y6.B8;
        org.telegram.ui.ActionBar.f7.V(textView, i11, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g7.addView(this.h, org.telegram.ui.Components.kb1.g(-1.0f, 56));
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
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(this);
        this.c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f.addView(this.c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.width = AndroidUtilities.dp(42.0f);
        layoutParams3.height = AndroidUtilities.dp(42.0f);
        layoutParams3.topMargin = AndroidUtilities.dp(3.0f);
        this.c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.A8, null);
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
        org.telegram.ui.ActionBar.f7.V(textView4, i11, null);
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
        this.a.setActionBarMenuOnItemClick(new c20(this, 23));
        PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(268435462, "screen");
        this.T = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController.getInstance().setFeedbackView(this.b, false);
        if (this.T.isHeld()) {
            this.T.release();
        }
        org.telegram.ui.Components.y9 y9Var = this.c;
        if (y9Var != null) {
            y9Var.setImageDrawable(null);
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
            chatActivityEnterView.i0(false);
            this.b.setFieldFocused(false);
        }
        int i10 = this.L;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i10).setAppPaused(true, false);
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 != 3 || iArr[0] == 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionNoAudioWithHint);
        alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new jl0(this, 8));
        org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
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
        this.T.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.a0;
        if (arrayList.size() > 1) {
            if (this.S < arrayList.size() - 1) {
                this.S++;
            } else {
                this.S = 0;
            }
            this.Q = (MessageObject) arrayList.get(this.S);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i10) {
        if (this.a == null) {
            return;
        }
        int i11 = this.L;
        if (i11 != this.Q.currentAccount) {
            if (i11 >= 0) {
                ConnectionsManager.getInstance(i11).setAppPaused(true, false);
            }
            int i12 = this.Q.currentAccount;
            this.L = i12;
            ConnectionsManager.getInstance(i12).setAppPaused(false, false);
        }
        this.N = null;
        this.M = null;
        long dialogId = this.Q.getDialogId();
        this.b.X0(this.Q.currentAccount, dialogId);
        if (DialogObject.isEncryptedDialog(dialogId)) {
            this.M = MessagesController.getInstance(this.Q.currentAccount).getUser(Long.valueOf(org.telegram.messenger.t.m(MessagesController.getInstance(this.Q.currentAccount), dialogId).user_id));
        } else if (DialogObject.isUserDialog(dialogId)) {
            this.M = MessagesController.getInstance(this.Q.currentAccount).getUser(Long.valueOf(dialogId));
        } else if (DialogObject.isChatDialog(dialogId)) {
            this.N = MessagesController.getInstance(this.Q.currentAccount).getChat(Long.valueOf(-dialogId));
            if (this.Q.isFromUser()) {
                this.M = MessagesController.getInstance(this.Q.currentAccount).getUser(Long.valueOf(this.Q.messageOwner.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.N;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.M;
            if (user != null) {
                this.e.setText(UserObject.getUserName(user));
            } else {
                this.e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.M;
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
        l(i10);
        r();
        b();
        a(0);
    }

    public final void r() {
        MessageObject messageObject;
        TLRPC.User user;
        if (this.a == null || (messageObject = this.Q) == null || this.N != null || (user = this.M) == null) {
            return;
        }
        long j10 = user.id;
        if (j10 / 1000 == 777 || j10 / 1000 == 333 || ContactsController.getInstance(messageObject.currentAccount).contactsDict.get(Long.valueOf(this.M.id)) != null || (ContactsController.getInstance(this.Q.currentAccount).contactsDict.size() == 0 && ContactsController.getInstance(this.Q.currentAccount).isLoadingContacts())) {
            this.d.setText(UserObject.getUserName(this.M));
        } else {
            String str = this.M.phone;
            if (str == null || str.length() == 0) {
                this.d.setText(UserObject.getUserName(this.M));
            } else {
                this.d.setText(kf.b.c().b("+" + this.M.phone));
            }
        }
        TLRPC.User user2 = this.M;
        if (user2 != null && user2.id == UserObject.VERIFY) {
            this.e.setText(LocaleController.getString(R.string.VerifyCodesNotifications));
            return;
        }
        if (user2 != null && user2.id == 777000) {
            this.e.setText(LocaleController.getString(R.string.ServiceNotifications));
            return;
        }
        CharSequence printingString = MessagesController.getInstance(this.Q.currentAccount).getPrintingString(this.Q.getDialogId(), 0L, false);
        if (printingString != null && printingString.length() != 0) {
            this.P = printingString;
            this.e.setText(printingString);
            o(true);
        } else {
            this.P = null;
            o(false);
            TLRPC.User user3 = MessagesController.getInstance(this.Q.currentAccount).getUser(Long.valueOf(this.M.id));
            if (user3 != null) {
                this.M = user3;
            }
            this.e.setText(LocaleController.formatUserStatus(this.Q.currentAccount, this.M));
        }
    }
}
