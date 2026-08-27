package jh;

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
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a31;
import org.telegram.ui.ft;
import org.telegram.ui.gy;
import org.telegram.ui.ht;
import org.telegram.ui.kt;
import org.telegram.ui.lt0;
import org.telegram.ui.nc1;
import org.telegram.ui.pk;
import org.telegram.ui.qk0;
import org.telegram.ui.rf0;
import org.telegram.ui.rn;
import org.telegram.ui.ta1;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f;
                zVar.run(Boolean.valueOf(y1Var.b()), Boolean.valueOf(y1Var2.b()), Boolean.valueOf(y1Var3.b()));
                e3Var.dismiss();
                break;
            case 1:
                e4 e4Var = (e4) this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                i9 i9Var = (i9) this.d;
                Context context = (Context) this.e;
                b4 b4Var = (b4) this.f;
                c4 c4Var = e4Var.K1;
                ((z8) e4Var.M1).g(true);
                e4Var.o1 = null;
                boolean[] zArr = {false};
                if (e4Var.y1) {
                    s6 storiesController = MessagesController.getInstance(e4Var.y2).getStoriesController();
                    j10 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(e4Var.y2).getStoriesController().R();
                    lh.a1 a1Var = MessagesController.getInstance(e4Var.y2).getStoriesController().w;
                    if (!a1Var.c && !a1Var.d) {
                        a1Var.d = true;
                        lh.x0 x0Var = new lh.x0(a1Var, i11);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new hh.t5(messagesStorage, z12, x0Var, i10));
                    }
                } else {
                    j10 = 0;
                }
                if (!e4Var.y1) {
                    s6 storiesController2 = MessagesController.getInstance(e4Var.y2).getStoriesController();
                    TL_stories.StoryItem storyItem = c4Var.a;
                    int i12 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i12).getClientUserId() || ((storyItem.dialogId <= j10 || (user = MessagesController.getInstance(i12).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j10 || (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        x3 x3Var = new x3(e4Var, e4Var.getContext(), c6Var, c6Var, i9Var, c4Var.e, !e4Var.y1 || ((e4Var.z1 || e4Var.I0()) && z10), z10, context, b4Var, zArr);
                        e4Var.p1 = x3Var;
                        ImageView imageView = e4Var.s0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        x3Var.b = true;
                        x3Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z10 = true;
                x3 x3Var2 = new x3(e4Var, e4Var.getContext(), c6Var, c6Var, i9Var, c4Var.e, !e4Var.y1 || ((e4Var.z1 || e4Var.I0()) && z10), z10, context, b4Var, zArr);
                e4Var.p1 = x3Var2;
                ImageView imageView2 = e4Var.s0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                x3Var2.b = true;
                x3Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                x3 x3Var3 = (x3) this.b;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.c;
                Context context2 = (Context) this.d;
                i9 i9Var2 = (i9) this.e;
                b4 b4Var2 = (b4) this.f;
                e4 e4Var2 = x3Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i13 = -e4Var2.n1;
                    e4Var2.n1 = i13;
                    AndroidUtilities.shakeViewSpring(view, i13);
                    new mc(e4Var2.Y0, c6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        x3Var3.c = true;
                        x3 x3Var4 = e4Var2.p1;
                        if (x3Var4 != null) {
                            x3Var4.a();
                        }
                        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(x3Var3, findActivity, i9Var2, b4Var2, 12);
                        i9 i9Var3 = ((z8) e4Var2.M1).d;
                        h9 h9Var = i9Var3.v0;
                        if (h9Var != null) {
                            z12 = h9Var.release(bVar);
                            i9Var3.v0 = null;
                        }
                        if (!z12) {
                            bVar.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                x3 x3Var5 = (x3) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                i9 i9Var4 = (i9) this.e;
                b4 b4Var3 = (b4) this.f;
                e4 e4Var3 = x3Var5.l;
                File h = e4Var3.K1.h();
                if (h == null || !h.exists()) {
                    e4Var3.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        x3Var5.c = true;
                        x3 x3Var6 = e4Var3.p1;
                        if (x3Var6 != null) {
                            x3Var6.a();
                        }
                        cg.k0 k0Var = new cg.k0(x3Var5, findActivity2, storyItem2, i9Var4, b4Var3, 15);
                        i9 i9Var5 = ((z8) e4Var3.M1).d;
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
                org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) this.b;
                org.telegram.ui.m7 m7Var = (org.telegram.ui.m7) this.c;
                org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) this.d;
                zk0 zk0Var = (zk0) this.e;
                org.telegram.ui.s7.a(e7Var.d, m7Var, (org.telegram.ui.o7) f7Var, zk0Var);
                org.telegram.ui.ActionBar.n1 n1Var = e7Var.a;
                if (n1Var != null) {
                    n1Var.d(true);
                    break;
                }
                break;
            case 5:
                new org.telegram.ui.b9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.c6) this.e, (org.telegram.ui.ActionBar.e3) this.f).show();
                break;
            case 6:
                rn rnVar = (rn) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(rnVar.getParentActivity(), null);
                Drawable mutate = rnVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(rnVar.getParentActivity(), true, true);
                f1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                f1Var.setOnClickListener(new b0(rnVar, str, str2, charSequence, r12, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new lt0(n1Var2, 27)};
                n1Var2.e = true;
                n1Var2.c = 220;
                n1Var2.setOutsideTouchable(true);
                n1Var2.setClippingEnabled(true);
                n1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                n1Var2.setFocusable(true);
                n1Var2.showAsDropDown(h0Var, (h0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 7:
                rn rnVar2 = (rn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                b31.K(rnVar2.getParentActivity(), rnVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f;
                if (n2Var.getParentActivity() != null) {
                    if (editTextBoldCursor.length() == 0) {
                        Vibrator vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(editTextBoldCursor);
                        break;
                    } else {
                        if (n2Var instanceof nc1) {
                            org.telegram.ui.ActionBar.g6.o();
                            n2Var.finishFragment();
                        }
                        if (e6Var != null) {
                            f6Var.u(e6Var.a);
                            org.telegram.ui.ActionBar.g6.n1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.o0(editTextBoldCursor, b2Var, n2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.y4.e0(editTextBoldCursor, b2Var, n2Var);
                            break;
                        }
                    }
                }
                break;
            case 9:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) this.c;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.n1) atomicReference.getAndSet(null)).dismiss();
                }
                if (e9Var.b >= 0) {
                    if (b5Var.getFragmentStack() != null && e9Var.b < b5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) b5Var.getFragmentStack().get(e9Var.b);
                        if (n2Var3 instanceof rn) {
                            rn rnVar3 = (rn) n2Var3;
                            l11 = Long.valueOf(rnVar3.a());
                            l10 = Long.valueOf(rnVar3.b());
                        } else if (n2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) n2Var3;
                            l11 = Long.valueOf(profileActivity.a());
                            l10 = Long.valueOf(profileActivity.c1);
                        }
                        if ((l11 == null && l11.longValue() != e9Var.f) || !(tL_forumTopic == null || l10 == null || tL_forumTopic.id == l10.longValue())) {
                            for (int size = b5Var.getFragmentStack().size() - 2; size > e9Var.b; size--) {
                                ((ActionBarLayout) b5Var).Y(size);
                            }
                        } else if (b5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(b5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i14 = e9Var.b;
                                if (size2 > i14) {
                                    ((org.telegram.ui.ActionBar.n2) arrayList.get(size2)).removeSelfFromStack();
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
                Class cls = e9Var.a;
                if (cls == rn.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat2 = e9Var.c;
                    if (chat2 != null) {
                        bundle.putLong("chat_id", chat2.id);
                    } else {
                        TLRPC.User user2 = e9Var.d;
                        if (user2 != null) {
                            bundle.putLong("user_id", user2.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", e9Var.g);
                    bundle.putInt("dialog_filter_id", e9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = e9Var.e;
                    if (tL_forumTopic2 != null) {
                        n2Var2.presentFragment(wf.c.g(n2Var2, e9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        n2Var2.presentFragment(new rn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", e9Var.f);
                    n2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (e9Var.a == we1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", e9Var.c.id);
                    n2Var2.presentFragment(new we1(bundle3), true);
                }
                if (e9Var.a == gy.class) {
                    n2Var2.presentFragment(new gy(null), true);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.n1 n1Var3 = (org.telegram.ui.ActionBar.n1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) this.e;
                org.telegram.ui.ActionBar.c6 c6Var3 = (org.telegram.ui.ActionBar.c6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                n1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    kx0.a(tL_messages_stickerSet, n2Var4, c6Var3);
                    break;
                } else {
                    ((rn) n2Var4).Y9();
                    kt.q().T = tL_messages_stickerSet;
                    break;
                }
            case 11:
                pk pkVar = (pk) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.n1 n1Var4 = (org.telegram.ui.ActionBar.n1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet Y = a31.Y();
                    Y.add(lowerCase);
                    if (Y.size() == 1 && Y.contains(currentLocaleInfo.pluralLangCode)) {
                        a31.a0(null, Boolean.FALSE);
                    } else {
                        a31.a0(Y, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(pkVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(pkVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr = b31.N;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                mc.a0(pkVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new up0(pkVar, 24)).j();
                n1Var4.d(true);
                break;
            case 12:
                ft ftVar = (ft) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ta1 ta1Var = (ta1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                kt ktVar = ftVar.a;
                if (ktVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ktVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            ta1Var.requestLayout();
                            linearLayout.requestLayout();
                            ta1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            ht htVar = ktVar.l;
                            if (htVar != null) {
                                htVar.u(tL_messages_stickerSet2.set, TextUtils.join("", ktVar.o));
                            }
                            ktVar.p();
                            break;
                        }
                    } else {
                        if (ktVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                ktVar.l.O(TextUtils.join("", ktVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (ktVar.l.z()) {
                                    ktVar.l.m(TextUtils.join("", ktVar.o));
                                } else {
                                    ktVar.l.x(TextUtils.join("", ktVar.o));
                                }
                            }
                        }
                        ktVar.p();
                        break;
                    }
                }
                break;
            case 13:
                rf0 rf0Var = (rf0) this.b;
                n2.l lVar = (n2.l) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                lh.d dVar = rf0Var.b;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    org.telegram.ui.x3 x3Var7 = new org.telegram.ui.x3(rf0Var, 8);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new f1.a(rf0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new l11(rf0Var, lVar, x3Var7, tL_inputStorePaymentAuthCode, 17)));
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                qk0 qk0Var = (qk0) this.e;
                b70 F = b70.F(e3Var2.container, e3Var2.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList4.get(i15);
                    i15++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new xl(qk0Var, intValue3, 18));
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
                lh.d dVar2 = (lh.d) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String[] strArr2 = (String[]) this.e;
                org.telegram.ui.ActionBar.e3 e3Var3 = (org.telegram.ui.ActionBar.e3) this.f;
                if (dVar2.S) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        callback.run(strArr2[0]);
                    }
                    e3Var3.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b0(org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, qk0 qk0Var) {
        this.a = 14;
        this.f = e3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = qk0Var;
    }
}
