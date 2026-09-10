package hi;

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
import bi.od;
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
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zd;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ae1;
import org.telegram.ui.bl;
import org.telegram.ui.c9;
import org.telegram.ui.d7;
import org.telegram.ui.e7;
import org.telegram.ui.eo;
import org.telegram.ui.fg0;
import org.telegram.ui.hl0;
import org.telegram.ui.ic1;
import org.telegram.ui.ig1;
import org.telegram.ui.k41;
import org.telegram.ui.l7;
import org.telegram.ui.mu0;
import org.telegram.ui.n7;
import org.telegram.ui.pt;
import org.telegram.ui.r7;
import org.telegram.ui.rt;
import org.telegram.ui.tt;
import org.telegram.ui.wy;
import zh.t7;
import zh.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(Context context, String str, String[] strArr, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.h3 h3Var) {
        this.a = 2;
        this.b = context;
        this.c = str;
        this.e = strArr;
        this.d = f6Var;
        this.f = h3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0530  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Long l4;
        Long l10;
        long j3;
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder = null;
        boolean z12 = false;
        boolean z13 = false;
        int i10 = 1;
        switch (this.a) {
            case 0:
                bi.d dVar = (bi.d) this.b;
                boolean[] zArr = (boolean[]) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f;
                if (dVar.W) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        callback.run(strArr[0]);
                    }
                    h3Var.dismiss();
                    break;
                }
                break;
            case 1:
                d7 d7Var = (d7) this.b;
                l7 l7Var = (l7) this.c;
                e7 e7Var = (e7) this.d;
                vl0 vl0Var = (vl0) this.e;
                r7.a(d7Var.d, l7Var, (n7) e7Var, vl0Var);
                org.telegram.ui.ActionBar.p1 p1Var = d7Var.a;
                if (p1Var != null) {
                    p1Var.d(true);
                    break;
                }
                break;
            case 2:
                new c9((Context) this.b, (String) this.c, ((String[]) this.e)[0], (org.telegram.ui.ActionBar.f6) this.d, (org.telegram.ui.ActionBar.h3) this.f).show();
                break;
            case 3:
                eo eoVar = (eo) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(eoVar.getParentActivity(), null);
                Drawable mutate = eoVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(eoVar.getParentActivity(), true, true);
                g1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                g1Var.setOnClickListener(new c(eoVar, str, str2, charSequence, r11, 4));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new mu0(p1Var2, 27)};
                p1Var2.e = true;
                p1Var2.c = 220;
                p1Var2.setOutsideTouchable(true);
                p1Var2.setClippingEnabled(true);
                p1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                p1Var2.setFocusable(true);
                p1Var2.showAsDropDown(h0Var, (h0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 4:
                eo eoVar2 = (eo) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                i41.K(eoVar2.getParentActivity(), eoVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f;
                if (p2Var.getParentActivity() != null) {
                    if (editTextBoldCursor.length() == 0) {
                        Vibrator vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(editTextBoldCursor);
                        break;
                    } else {
                        if (p2Var instanceof ae1) {
                            org.telegram.ui.ActionBar.j6.o();
                            p2Var.finishFragment();
                        }
                        if (h6Var != null) {
                            i6Var.u(h6Var.a);
                            org.telegram.ui.ActionBar.j6.n1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.r0(editTextBoldCursor, d2Var, p2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.d5.e0(editTextBoldCursor, d2Var, p2Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                AtomicReference atomicReference = (AtomicReference) this.b;
                n9 n9Var = (n9) this.c;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.p1) atomicReference.getAndSet(null)).dismiss();
                }
                if (n9Var.b >= 0) {
                    if (f5Var.getFragmentStack() != null && n9Var.b < f5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) f5Var.getFragmentStack().get(n9Var.b);
                        if (p2Var3 instanceof eo) {
                            eo eoVar3 = (eo) p2Var3;
                            l10 = Long.valueOf(eoVar3.a());
                            l4 = Long.valueOf(eoVar3.d());
                        } else if (p2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) p2Var3;
                            l10 = Long.valueOf(profileActivity.a());
                            l4 = Long.valueOf(profileActivity.g1);
                        }
                        if ((l10 == null && l10.longValue() != n9Var.f) || !(tL_forumTopic == null || l4 == null || tL_forumTopic.id == l4.longValue())) {
                            for (int size = f5Var.getFragmentStack().size() - 2; size > n9Var.b; size--) {
                                ((ActionBarLayout) f5Var).Y(size);
                            }
                        } else if (f5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(f5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i11 = n9Var.b;
                                if (size2 > i11) {
                                    ((org.telegram.ui.ActionBar.p2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i11 < f5Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) f5Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l4 = null;
                    l10 = null;
                    if (l10 == null) {
                    }
                    if (f5Var.getFragmentStack() != null) {
                    }
                }
                Class cls = n9Var.a;
                if (cls == eo.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat2 = n9Var.c;
                    if (chat2 != null) {
                        bundle.putLong("chat_id", chat2.id);
                    } else {
                        TLRPC.User user2 = n9Var.d;
                        if (user2 != null) {
                            bundle.putLong("user_id", user2.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", n9Var.g);
                    bundle.putInt("dialog_filter_id", n9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = n9Var.e;
                    if (tL_forumTopic2 != null) {
                        p2Var2.presentFragment(mg.d.g(p2Var2, n9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        p2Var2.presentFragment(new eo(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", n9Var.f);
                    p2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (n9Var.a == ig1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", n9Var.c.id);
                    p2Var2.presentFragment(new ig1(bundle3), true);
                }
                if (n9Var.a == wy.class) {
                    p2Var2.presentFragment(new wy(null), true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.ActionBar.p1 p1Var3 = (org.telegram.ui.ActionBar.p1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) this.e;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                p1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    ny0.a(tL_messages_stickerSet, p2Var4, f6Var);
                    break;
                } else {
                    ((eo) p2Var4).Y9();
                    tt.q().T = tL_messages_stickerSet;
                    break;
                }
            case 8:
                bl blVar = (bl) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.p1 p1Var4 = (org.telegram.ui.ActionBar.p1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet Y = k41.Y();
                    Y.add(lowerCase);
                    if (Y.size() == 1 && Y.contains(currentLocaleInfo.pluralLangCode)) {
                        k41.a0(null, Boolean.FALSE);
                    } else {
                        k41.a0(Y, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(blVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(blVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr2 = i41.R;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                wc.a0(blVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new uq0(blVar, 24)).j();
                p1Var4.d(true);
                break;
            case 9:
                pt ptVar = (pt) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ic1 ic1Var = (ic1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                tt ttVar = ptVar.a;
                if (ttVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ttVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            ic1Var.requestLayout();
                            linearLayout.requestLayout();
                            ic1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            rt rtVar = ttVar.l;
                            if (rtVar != null) {
                                rtVar.u(tL_messages_stickerSet2.set, TextUtils.join("", ttVar.o));
                            }
                            ttVar.p();
                            break;
                        }
                    } else {
                        if (ttVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                ttVar.l.O(TextUtils.join("", ttVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (ttVar.l.z()) {
                                    ttVar.l.m(TextUtils.join("", ttVar.o));
                                } else {
                                    ttVar.l.x(TextUtils.join("", ttVar.o));
                                }
                            }
                        }
                        ttVar.p();
                        break;
                    }
                }
                break;
            case 10:
                fg0 fg0Var = (fg0) this.b;
                c5.o oVar = (c5.o) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                bi.d dVar2 = fg0Var.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.u3 u3Var = new org.telegram.ui.u3(fg0Var, 8);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new f1.a(fg0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new q01(fg0Var, oVar, u3Var, tL_inputStorePaymentAuthCode, 18)));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                hl0 hl0Var = (hl0) this.e;
                w70 F = w70.F(h3Var2.container, h3Var2.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new zd(hl0Var, intValue3, 19));
                    }
                }
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                break;
            case 12:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.b;
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) this.c;
                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) this.d;
                od odVar = (od) this.e;
                org.telegram.ui.ActionBar.h3 h3Var3 = (org.telegram.ui.ActionBar.h3) this.f;
                odVar.run(Boolean.valueOf(z1Var.b()), Boolean.valueOf(z1Var2.b()), Boolean.valueOf(z1Var3.b()));
                h3Var3.dismiss();
                break;
            case 13:
                zh.a3 a3Var = (zh.a3) this.b;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.c;
                u7 u7Var = (u7) this.d;
                Context context = (Context) this.e;
                zh.y2 y2Var = (zh.y2) this.f;
                zh.z2 z2Var = a3Var.O1;
                ((zh.l7) a3Var.Q1).g(true);
                a3Var.s1 = null;
                boolean[] zArr2 = {false};
                if (a3Var.C1) {
                    zh.i5 storiesController = MessagesController.getInstance(a3Var.C2).getStoriesController();
                    j3 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(a3Var.C2).getStoriesController().R();
                    bi.f1 f1Var = MessagesController.getInstance(a3Var.C2).getStoriesController().w;
                    if (!f1Var.c && !f1Var.d) {
                        f1Var.d = true;
                        bi.b1 b1Var = new bi.b1(f1Var, i10);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(f1Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new bi.c1(messagesStorage, z12, b1Var, z12 ? 1 : 0));
                    }
                } else {
                    j3 = 0;
                }
                if (!a3Var.C1) {
                    zh.i5 storiesController2 = MessagesController.getInstance(a3Var.C2).getStoriesController();
                    TL_stories.StoryItem storyItem = z2Var.a;
                    int i13 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i13).getClientUserId() || ((storyItem.dialogId <= j3 || (user = MessagesController.getInstance(i13).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j3 || (chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        zh.v2 v2Var = new zh.v2(a3Var, a3Var.getContext(), f6Var2, f6Var2, u7Var, z2Var.e, !a3Var.C1 || ((a3Var.D1 || a3Var.I0()) && z10), z10, context, y2Var, zArr2);
                        a3Var.t1 = v2Var;
                        ImageView imageView = a3Var.w0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                        v2Var.b = true;
                        v2Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z10 = true;
                zh.v2 v2Var2 = new zh.v2(a3Var, a3Var.getContext(), f6Var2, f6Var2, u7Var, z2Var.e, !a3Var.C1 || ((a3Var.D1 || a3Var.I0()) && z10), z10, context, y2Var, zArr2);
                a3Var.t1 = v2Var2;
                ImageView imageView2 = a3Var.w0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                v2Var2.b = true;
                v2Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 14:
                zh.v2 v2Var3 = (zh.v2) this.b;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.c;
                Context context2 = (Context) this.d;
                u7 u7Var2 = (u7) this.e;
                zh.y2 y2Var2 = (zh.y2) this.f;
                zh.a3 a3Var2 = v2Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i14 = -a3Var2.r1;
                    a3Var2.r1 = i14;
                    AndroidUtilities.shakeViewSpring(view, i14);
                    new wc(a3Var2.c1, f6Var3).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        v2Var3.c = true;
                        zh.v2 v2Var4 = a3Var2.t1;
                        if (v2Var4 != null) {
                            v2Var4.a();
                        }
                        zh.r2 r2Var = new zh.r2(v2Var3, findActivity, u7Var2, y2Var2, 0);
                        u7 u7Var3 = ((zh.l7) a3Var2.Q1).d;
                        t7 t7Var = u7Var3.z0;
                        if (t7Var != null) {
                            z12 = t7Var.release(r2Var);
                            u7Var3.z0 = null;
                        }
                        if (!z12) {
                            r2Var.run();
                            break;
                        }
                    }
                }
                break;
            default:
                zh.v2 v2Var5 = (zh.v2) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                u7 u7Var4 = (u7) this.e;
                zh.y2 y2Var3 = (zh.y2) this.f;
                zh.a3 a3Var3 = v2Var5.l;
                File h = a3Var3.O1.h();
                if (h == null || !h.exists()) {
                    a3Var3.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        v2Var5.c = true;
                        zh.v2 v2Var6 = a3Var3.t1;
                        if (v2Var6 != null) {
                            v2Var6.a();
                        }
                        xh.x4 x4Var = new xh.x4(v2Var5, findActivity2, storyItem2, u7Var4, y2Var3, 6);
                        u7 u7Var5 = ((zh.l7) a3Var3.Q1).d;
                        t7 t7Var2 = u7Var5.z0;
                        if (t7Var2 != null) {
                            z13 = t7Var2.release(x4Var);
                            u7Var5.z0 = null;
                        }
                        if (!z13) {
                            x4Var.run();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ c(org.telegram.ui.ActionBar.h3 h3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, hl0 hl0Var) {
        this.a = 11;
        this.f = h3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = hl0Var;
    }
}
