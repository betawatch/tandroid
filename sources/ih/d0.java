package ih;

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
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z21;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b31;
import org.telegram.ui.dt;
import org.telegram.ui.dy;
import org.telegram.ui.ft;
import org.telegram.ui.ht;
import org.telegram.ui.kt0;
import org.telegram.ui.nk;
import org.telegram.ui.oc1;
import org.telegram.ui.of0;
import org.telegram.ui.qk0;
import org.telegram.ui.qn;
import org.telegram.ui.va1;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.a = i9;
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
        int i9 = 3;
        SpannableStringBuilder spannableStringBuilder = null;
        boolean z12 = false;
        boolean z13 = false;
        int i10 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.b;
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) this.c;
                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) this.d;
                b0 b0Var = (b0) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                b0Var.run(Boolean.valueOf(z1Var.b()), Boolean.valueOf(z1Var2.b()), Boolean.valueOf(z1Var3.b()));
                f3Var.dismiss();
                break;
            case 1:
                i4 i4Var = (i4) this.b;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                m9 m9Var = (m9) this.d;
                Context context = (Context) this.e;
                f4 f4Var = (f4) this.f;
                g4 g4Var = i4Var.K1;
                ((d9) i4Var.M1).g(true);
                i4Var.o1 = null;
                boolean[] zArr = {false};
                if (i4Var.y1) {
                    v6 storiesController = MessagesController.getInstance(i4Var.y2).getStoriesController();
                    j10 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(i4Var.y2).getStoriesController().R();
                    kh.b1 b1Var = MessagesController.getInstance(i4Var.y2).getStoriesController().w;
                    if (!b1Var.c && !b1Var.d) {
                        b1Var.d = true;
                        kh.y0 y0Var = new kh.y0(b1Var, i10);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(b1Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new gh.u5(messagesStorage, z12, y0Var, i9));
                    }
                } else {
                    j10 = 0;
                }
                if (!i4Var.y1) {
                    v6 storiesController2 = MessagesController.getInstance(i4Var.y2).getStoriesController();
                    TL_stories.StoryItem storyItem = g4Var.a;
                    int i11 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i11).getClientUserId() || ((storyItem.dialogId <= j10 || (user = MessagesController.getInstance(i11).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j10 || (chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        b4 b4Var = new b4(i4Var, i4Var.getContext(), b6Var, b6Var, m9Var, g4Var.e, !i4Var.y1 || ((i4Var.z1 || i4Var.I0()) && z10), z10, context, f4Var, zArr);
                        i4Var.p1 = b4Var;
                        ImageView imageView = i4Var.s0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        b4Var.b = true;
                        b4Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z10 = true;
                b4 b4Var2 = new b4(i4Var, i4Var.getContext(), b6Var, b6Var, m9Var, g4Var.e, !i4Var.y1 || ((i4Var.z1 || i4Var.I0()) && z10), z10, context, f4Var, zArr);
                i4Var.p1 = b4Var2;
                ImageView imageView2 = i4Var.s0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                b4Var2.b = true;
                b4Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                b4 b4Var3 = (b4) this.b;
                org.telegram.ui.ActionBar.b6 b6Var2 = (org.telegram.ui.ActionBar.b6) this.c;
                Context context2 = (Context) this.d;
                m9 m9Var2 = (m9) this.e;
                f4 f4Var2 = (f4) this.f;
                i4 i4Var2 = b4Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i12 = -i4Var2.n1;
                    i4Var2.n1 = i12;
                    AndroidUtilities.shakeViewSpring(view, i12);
                    new oc(i4Var2.Y0, b6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        b4Var3.c = true;
                        b4 b4Var4 = i4Var2.p1;
                        if (b4Var4 != null) {
                            b4Var4.a();
                        }
                        androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(b4Var3, findActivity, m9Var2, f4Var2, 11);
                        m9 m9Var3 = ((d9) i4Var2.M1).d;
                        l9 l9Var = m9Var3.v0;
                        if (l9Var != null) {
                            z12 = l9Var.release(cVar);
                            m9Var3.v0 = null;
                        }
                        if (!z12) {
                            cVar.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                b4 b4Var5 = (b4) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                m9 m9Var4 = (m9) this.e;
                f4 f4Var3 = (f4) this.f;
                i4 i4Var3 = b4Var5.l;
                File h = i4Var3.K1.h();
                if (h == null || !h.exists()) {
                    i4Var3.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        b4Var5.c = true;
                        b4 b4Var6 = i4Var3.p1;
                        if (b4Var6 != null) {
                            b4Var6.a();
                        }
                        bg.o0 o0Var = new bg.o0(b4Var5, findActivity2, storyItem2, m9Var4, f4Var3, 15);
                        m9 m9Var5 = ((d9) i4Var3.M1).d;
                        l9 l9Var2 = m9Var5.v0;
                        if (l9Var2 != null) {
                            z13 = l9Var2.release(o0Var);
                            m9Var5.v0 = null;
                        }
                        if (!z13) {
                            o0Var.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.d7 d7Var = (org.telegram.ui.d7) this.b;
                org.telegram.ui.l7 l7Var = (org.telegram.ui.l7) this.c;
                org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) this.d;
                wk0 wk0Var = (wk0) this.e;
                org.telegram.ui.r7.a(d7Var.d, l7Var, (org.telegram.ui.n7) e7Var, wk0Var);
                org.telegram.ui.ActionBar.o1 o1Var = d7Var.a;
                if (o1Var != null) {
                    o1Var.d(true);
                    break;
                }
                break;
            case 5:
                new org.telegram.ui.a9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.b6) this.e, (org.telegram.ui.ActionBar.f3) this.f).show();
                break;
            case 6:
                qn qnVar = (qn) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(qnVar.getParentActivity(), null);
                Drawable mutate = qnVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(qnVar.getParentActivity(), true, true);
                g1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                g1Var.setOnClickListener(new d0(qnVar, str, str2, charSequence, r12, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new kt0(o1Var2, 27)};
                o1Var2.e = true;
                o1Var2.c = 220;
                o1Var2.setOutsideTouchable(true);
                o1Var2.setClippingEnabled(true);
                o1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                o1Var2.setFocusable(true);
                o1Var2.showAsDropDown(h0Var, (h0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 7:
                qn qnVar2 = (qn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                z21.J(qnVar2.getParentActivity(), qnVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
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
                        if (o2Var instanceof oc1) {
                            org.telegram.ui.ActionBar.f6.o();
                            o2Var.finishFragment();
                        }
                        if (d6Var != null) {
                            e6Var.u(d6Var.a);
                            org.telegram.ui.ActionBar.f6.n1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.o0(editTextBoldCursor, c2Var, o2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.y4.e0(editTextBoldCursor, c2Var, o2Var);
                            break;
                        }
                    }
                }
                break;
            case 9:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.f9 f9Var = (org.telegram.ui.Components.f9) this.c;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.o1) atomicReference.getAndSet(null)).dismiss();
                }
                if (f9Var.b >= 0) {
                    if (b5Var.getFragmentStack() != null && f9Var.b < b5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) b5Var.getFragmentStack().get(f9Var.b);
                        if (o2Var3 instanceof qn) {
                            qn qnVar3 = (qn) o2Var3;
                            l11 = Long.valueOf(qnVar3.a());
                            l10 = Long.valueOf(qnVar3.b());
                        } else if (o2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) o2Var3;
                            l11 = Long.valueOf(profileActivity.a());
                            l10 = Long.valueOf(profileActivity.c1);
                        }
                        if ((l11 == null && l11.longValue() != f9Var.f) || !(tL_forumTopic == null || l10 == null || tL_forumTopic.id == l10.longValue())) {
                            for (int size = b5Var.getFragmentStack().size() - 2; size > f9Var.b; size--) {
                                ((ActionBarLayout) b5Var).Y(size);
                            }
                        } else if (b5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(b5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i13 = f9Var.b;
                                if (size2 > i13) {
                                    ((org.telegram.ui.ActionBar.o2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i13 < b5Var.getFragmentStack().size()) {
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
                Class cls = f9Var.a;
                if (cls == qn.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat2 = f9Var.c;
                    if (chat2 != null) {
                        bundle.putLong("chat_id", chat2.id);
                    } else {
                        TLRPC.User user2 = f9Var.d;
                        if (user2 != null) {
                            bundle.putLong("user_id", user2.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", f9Var.g);
                    bundle.putInt("dialog_filter_id", f9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = f9Var.e;
                    if (tL_forumTopic2 != null) {
                        o2Var2.presentFragment(vf.c.g(o2Var2, f9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        o2Var2.presentFragment(new qn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", f9Var.f);
                    o2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (f9Var.a == we1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", f9Var.c.id);
                    o2Var2.presentFragment(new we1(bundle3), true);
                }
                if (f9Var.a == dy.class) {
                    o2Var2.presentFragment(new dy(null), true);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.o1 o1Var3 = (org.telegram.ui.ActionBar.o1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.o2 o2Var4 = (org.telegram.ui.ActionBar.o2) this.e;
                org.telegram.ui.ActionBar.b6 b6Var3 = (org.telegram.ui.ActionBar.b6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                o1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    ix0.a(tL_messages_stickerSet, o2Var4, b6Var3);
                    break;
                } else {
                    ((qn) o2Var4).Y9();
                    ht.q().T = tL_messages_stickerSet;
                    break;
                }
            case 11:
                nk nkVar = (nk) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.o1 o1Var4 = (org.telegram.ui.ActionBar.o1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet X = b31.X();
                    X.add(lowerCase);
                    if (X.size() == 1 && X.contains(currentLocaleInfo.pluralLangCode)) {
                        b31.Z(null, Boolean.FALSE);
                    } else {
                        b31.Z(X, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(nkVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(nkVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr = z21.N;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                oc.a0(nkVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new tp0(nkVar, 24)).j();
                o1Var4.d(true);
                break;
            case 12:
                dt dtVar = (dt) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                va1 va1Var = (va1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                ht htVar = dtVar.a;
                if (htVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = htVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            va1Var.requestLayout();
                            linearLayout.requestLayout();
                            va1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            ft ftVar = htVar.l;
                            if (ftVar != null) {
                                ftVar.v(tL_messages_stickerSet2.set, TextUtils.join("", htVar.o));
                            }
                            htVar.p();
                            break;
                        }
                    } else {
                        if (htVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                htVar.l.O(TextUtils.join("", htVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (htVar.l.A()) {
                                    htVar.l.m(TextUtils.join("", htVar.o));
                                } else {
                                    htVar.l.y(TextUtils.join("", htVar.o));
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
                n2.l lVar = (n2.l) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                kh.d dVar = of0Var.b;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    org.telegram.ui.w3 w3Var = new org.telegram.ui.w3(of0Var, 8);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new f1.a(of0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new no0(of0Var, lVar, w3Var, tL_inputStorePaymentAuthCode, 21)));
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                qk0 qk0Var = (qk0) this.e;
                x60 F = x60.F(f3Var2.container, f3Var2.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new qd(qk0Var, intValue3, 19));
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
                kh.d dVar2 = (kh.d) this.b;
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

    public /* synthetic */ d0(org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, qk0 qk0Var) {
        this.a = 14;
        this.f = f3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = qk0Var;
    }
}
