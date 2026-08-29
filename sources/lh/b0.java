package lh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b31;
import org.telegram.ui.dt;
import org.telegram.ui.ft;
import org.telegram.ui.fy;
import org.telegram.ui.ht;
import org.telegram.ui.it0;
import org.telegram.ui.mk0;
import org.telegram.ui.n20;
import org.telegram.ui.of0;
import org.telegram.ui.qc1;
import org.telegram.ui.qk;
import org.telegram.ui.tn;
import org.telegram.ui.wa1;
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0323  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        long j10;
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User user;
        Long l10;
        Long l11;
        int i10 = 3;
        SpannableStringBuilder spannableStringBuilder = null;
        boolean z12 = false;
        boolean z13 = false;
        int i11 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.b;
                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) this.c;
                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) this.d;
                z zVar = (z) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                zVar.run(Boolean.valueOf(y1Var.b()), Boolean.valueOf(y1Var2.b()), Boolean.valueOf(y1Var3.b()));
                f3Var.dismiss();
                break;
            case 1:
                d4 d4Var = (d4) this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                i9 i9Var = (i9) this.d;
                Context context = (Context) this.e;
                a4 a4Var = (a4) this.f;
                b4 b4Var = d4Var.K1;
                ((z8) d4Var.M1).g(true);
                d4Var.o1 = null;
                boolean[] zArr = {false};
                if (d4Var.y1) {
                    s6 storiesController = MessagesController.getInstance(d4Var.y2).getStoriesController();
                    j10 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(d4Var.y2).getStoriesController().R();
                    nh.a1 a1Var = MessagesController.getInstance(d4Var.y2).getStoriesController().w;
                    if (!a1Var.c && !a1Var.d) {
                        a1Var.d = true;
                        nh.x0 x0Var = new nh.x0(a1Var, i11);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new jh.r5(messagesStorage, z12, x0Var, i10));
                    }
                } else {
                    j10 = 0;
                }
                if (!d4Var.y1) {
                    s6 storiesController2 = MessagesController.getInstance(d4Var.y2).getStoriesController();
                    TL_stories.StoryItem storyItem = b4Var.a;
                    int i12 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i12).getClientUserId() || ((storyItem.dialogId <= j10 || (user = MessagesController.getInstance(i12).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j10 || (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        w3 w3Var = new w3(d4Var, d4Var.getContext(), c6Var, c6Var, i9Var, b4Var.e, !d4Var.y1 || ((d4Var.z1 || d4Var.I0()) && z10), z10, context, a4Var, zArr);
                        d4Var.p1 = w3Var;
                        ImageView imageView = d4Var.s0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                        w3Var.b = true;
                        w3Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z10 = true;
                w3 w3Var2 = new w3(d4Var, d4Var.getContext(), c6Var, c6Var, i9Var, b4Var.e, !d4Var.y1 || ((d4Var.z1 || d4Var.I0()) && z10), z10, context, a4Var, zArr);
                d4Var.p1 = w3Var2;
                ImageView imageView2 = d4Var.s0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                w3Var2.b = true;
                w3Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                w3 w3Var3 = (w3) this.b;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.c;
                Context context2 = (Context) this.d;
                i9 i9Var2 = (i9) this.e;
                a4 a4Var2 = (a4) this.f;
                d4 d4Var2 = w3Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i13 = -d4Var2.n1;
                    d4Var2.n1 = i13;
                    AndroidUtilities.shakeViewSpring(view, i13);
                    new tc(d4Var2.Y0, c6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        w3Var3.c = true;
                        w3 w3Var4 = d4Var2.p1;
                        if (w3Var4 != null) {
                            w3Var4.a();
                        }
                        androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(w3Var3, findActivity, i9Var2, a4Var2, 14);
                        i9 i9Var3 = ((z8) d4Var2.M1).d;
                        h9 h9Var = i9Var3.v0;
                        if (h9Var != null) {
                            z12 = h9Var.release(cVar);
                            i9Var3.v0 = null;
                        }
                        if (!z12) {
                            cVar.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                w3 w3Var5 = (w3) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                i9 i9Var4 = (i9) this.e;
                a4 a4Var3 = (a4) this.f;
                d4 d4Var3 = w3Var5.l;
                File h = d4Var3.K1.h();
                if (h == null || !h.exists()) {
                    d4Var3.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        w3Var5.c = true;
                        w3 w3Var6 = d4Var3.p1;
                        if (w3Var6 != null) {
                            w3Var6.a();
                        }
                        eg.k0 k0Var = new eg.k0(w3Var5, findActivity2, storyItem2, i9Var4, a4Var3, 15);
                        i9 i9Var5 = ((z8) d4Var3.M1).d;
                        h9 h9Var2 = i9Var5.v0;
                        if (h9Var2 != null) {
                            z13 = h9Var2.release(k0Var);
                            i9Var5.v0 = null;
                        }
                        if (!z13) {
                            k0Var.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.c7 c7Var = (org.telegram.ui.c7) this.b;
                org.telegram.ui.k7 k7Var = (org.telegram.ui.k7) this.c;
                org.telegram.ui.d7 d7Var = (org.telegram.ui.d7) this.d;
                jl0 jl0Var = (jl0) this.e;
                org.telegram.ui.q7.a(c7Var.d, k7Var, (org.telegram.ui.m7) d7Var, jl0Var);
                org.telegram.ui.ActionBar.o1 o1Var = c7Var.a;
                if (o1Var != null) {
                    o1Var.d(true);
                    break;
                }
                break;
            case 5:
                new org.telegram.ui.z8((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.c6) this.e, (org.telegram.ui.ActionBar.f3) this.f).show();
                break;
            case 6:
                tn tnVar = (tn) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(tnVar.getParentActivity(), null);
                Drawable mutate = tnVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(tnVar.getParentActivity(), true, true);
                g1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                g1Var.setOnClickListener(new b0(tnVar, str, str2, charSequence, r12, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new it0(o1Var2, 27)};
                o1Var2.e = true;
                o1Var2.c = 220;
                o1Var2.setOutsideTouchable(true);
                o1Var2.setClippingEnabled(true);
                o1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                o1Var2.setFocusable(true);
                o1Var2.showAsDropDown(h0Var, (h0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 7:
                tn tnVar2 = (tn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                k31.J(tnVar2.getParentActivity(), tnVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f;
                if (o2Var.getParentActivity() != null) {
                    if (editTextBoldCursor.length() == 0) {
                        Vibrator vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(editTextBoldCursor);
                        break;
                    } else {
                        if (o2Var instanceof qc1) {
                            org.telegram.ui.ActionBar.g6.o();
                            o2Var.finishFragment();
                        }
                        if (e6Var != null) {
                            f6Var.u(e6Var.a);
                            org.telegram.ui.ActionBar.g6.n1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.r0(editTextBoldCursor, c2Var, o2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.c5.e0(editTextBoldCursor, c2Var, o2Var);
                            break;
                        }
                    }
                }
                break;
            case 9:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) this.c;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.o1) atomicReference.getAndSet(null)).dismiss();
                }
                if (k9Var.b >= 0) {
                    if (b5Var.getFragmentStack() != null && k9Var.b < b5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) b5Var.getFragmentStack().get(k9Var.b);
                        if (o2Var3 instanceof tn) {
                            tn tnVar3 = (tn) o2Var3;
                            l11 = Long.valueOf(tnVar3.a());
                            l10 = Long.valueOf(tnVar3.b());
                        } else if (o2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) o2Var3;
                            l11 = Long.valueOf(profileActivity.a());
                            l10 = Long.valueOf(profileActivity.c1);
                        }
                        if ((l11 == null && l11.longValue() != k9Var.f) || !(tL_forumTopic == null || l10 == null || tL_forumTopic.id == l10.longValue())) {
                            for (int size = b5Var.getFragmentStack().size() - 2; size > k9Var.b; size--) {
                                ((ActionBarLayout) b5Var).Y(size);
                            }
                        } else if (b5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(b5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i14 = k9Var.b;
                                if (size2 > i14) {
                                    ((org.telegram.ui.ActionBar.o2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i14 < b5Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) b5Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l10 = null;
                    l11 = null;
                    if (l11 == null) {
                    }
                    if (b5Var.getFragmentStack() != null) {
                    }
                }
                Class cls = k9Var.a;
                if (cls == tn.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat2 = k9Var.c;
                    if (chat2 != null) {
                        bundle.putLong("chat_id", chat2.id);
                    } else {
                        TLRPC.User user2 = k9Var.d;
                        if (user2 != null) {
                            bundle.putLong("user_id", user2.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", k9Var.g);
                    bundle.putInt("dialog_filter_id", k9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = k9Var.e;
                    if (tL_forumTopic2 != null) {
                        o2Var2.presentFragment(yf.d.g(o2Var2, k9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        o2Var2.presentFragment(new tn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", k9Var.f);
                    o2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (k9Var.a == ze1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", k9Var.c.id);
                    o2Var2.presentFragment(new ze1(bundle3), true);
                }
                if (k9Var.a == fy.class) {
                    o2Var2.presentFragment(new fy(null), true);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.o1 o1Var3 = (org.telegram.ui.ActionBar.o1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.o2 o2Var4 = (org.telegram.ui.ActionBar.o2) this.e;
                org.telegram.ui.ActionBar.c6 c6Var3 = (org.telegram.ui.ActionBar.c6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                o1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    tx0.a(tL_messages_stickerSet, o2Var4, c6Var3);
                    break;
                } else {
                    ((tn) o2Var4).Y9();
                    ht.q().T = tL_messages_stickerSet;
                    break;
                }
            case 11:
                qk qkVar = (qk) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.o1 o1Var4 = (org.telegram.ui.ActionBar.o1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet Y = b31.Y();
                    Y.add(lowerCase);
                    if (Y.size() == 1 && Y.contains(currentLocaleInfo.pluralLangCode)) {
                        b31.a0(null, Boolean.FALSE);
                    } else {
                        b31.a0(Y, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(qkVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(qkVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr = k31.N;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                tc.a0(qkVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new fq0(qkVar, 24)).j();
                o1Var4.d(true);
                break;
            case 12:
                dt dtVar = (dt) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                wa1 wa1Var = (wa1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                ht htVar = dtVar.a;
                if (htVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = htVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            wa1Var.requestLayout();
                            linearLayout.requestLayout();
                            wa1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            ft ftVar = htVar.l;
                            if (ftVar != null) {
                                ftVar.u(tL_messages_stickerSet2.set, TextUtils.join("", htVar.o));
                            }
                            htVar.p();
                            break;
                        }
                    } else {
                        if (htVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                htVar.l.O(TextUtils.join("", htVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (htVar.l.z()) {
                                    htVar.l.m(TextUtils.join("", htVar.o));
                                } else {
                                    htVar.l.x(TextUtils.join("", htVar.o));
                                }
                            }
                        }
                        htVar.p();
                        break;
                    }
                }
                break;
            case 13:
                of0 of0Var = (of0) this.b;
                p2.l lVar = (p2.l) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                nh.d dVar = of0Var.b;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    org.telegram.ui.x3 x3Var = new org.telegram.ui.x3(of0Var, 8);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new f1.a(of0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new n20(of0Var, lVar, x3Var, tL_inputStorePaymentAuthCode, 15)));
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                mk0 mk0Var = (mk0) this.e;
                j70 F = j70.F(f3Var2.container, f3Var2.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList4.get(i15);
                    i15++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new org.telegram.ui.Components.i8(mk0Var, intValue3, 21));
                    }
                }
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                break;
            default:
                nh.d dVar2 = (nh.d) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String[] strArr2 = (String[]) this.e;
                org.telegram.ui.ActionBar.f3 f3Var3 = (org.telegram.ui.ActionBar.f3) this.f;
                if (dVar2.S) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        callback.run(strArr2[0]);
                    }
                    f3Var3.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b0(org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, mk0 mk0Var) {
        this.a = 14;
        this.f = f3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = mk0Var;
    }
}
