package bi;

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
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ce1;
import org.telegram.ui.el;
import org.telegram.ui.fo;
import org.telegram.ui.kc1;
import org.telegram.ui.kg0;
import org.telegram.ui.l41;
import org.telegram.ui.lg1;
import org.telegram.ui.nl0;
import org.telegram.ui.tt;
import org.telegram.ui.tu0;
import org.telegram.ui.vt;
import org.telegram.ui.xt;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02fb  */
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
        Long l4;
        Long l10;
        SpannableStringBuilder spannableStringBuilder = null;
        boolean z12 = false;
        boolean z13 = false;
        int i10 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.b;
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.c;
                org.telegram.ui.Cells.a2 a2Var3 = (org.telegram.ui.Cells.a2) this.d;
                j0 j0Var = (j0) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f;
                j0Var.run(Boolean.valueOf(a2Var.b()), Boolean.valueOf(a2Var2.b()), Boolean.valueOf(a2Var3.b()));
                e3Var.dismiss();
                break;
            case 1:
                q5 q5Var = (q5) this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                sb sbVar = (sb) this.d;
                Context context = (Context) this.e;
                n5 n5Var = (n5) this.f;
                o5 o5Var = q5Var.O1;
                ((jb) q5Var.Q1).g(true);
                q5Var.s1 = null;
                boolean[] zArr = {false};
                if (q5Var.C1) {
                    x8 storiesController = MessagesController.getInstance(q5Var.C2).getStoriesController();
                    j10 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(q5Var.C2).getStoriesController().R();
                    di.a1 a1Var = MessagesController.getInstance(q5Var.C2).getStoriesController().w;
                    if (!a1Var.c && !a1Var.d) {
                        a1Var.d = true;
                        di.w0 w0Var = new di.w0(a1Var, i10);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new di.x0(messagesStorage, z12, w0Var, z12 ? 1 : 0));
                    }
                } else {
                    j10 = 0;
                }
                if (!q5Var.C1) {
                    x8 storiesController2 = MessagesController.getInstance(q5Var.C2).getStoriesController();
                    TL_stories.StoryItem storyItem = o5Var.a;
                    int i11 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i11).getClientUserId() || ((storyItem.dialogId <= j10 || (user = MessagesController.getInstance(i11).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j10 || (chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        h5 h5Var = new h5(q5Var, q5Var.getContext(), c6Var, c6Var, sbVar, o5Var.e, !q5Var.C1 || ((q5Var.D1 || q5Var.I0()) && z10), z10, context, n5Var, zArr);
                        q5Var.t1 = h5Var;
                        ImageView imageView = q5Var.w0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        h5Var.b = true;
                        h5Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z10 = true;
                h5 h5Var2 = new h5(q5Var, q5Var.getContext(), c6Var, c6Var, sbVar, o5Var.e, !q5Var.C1 || ((q5Var.D1 || q5Var.I0()) && z10), z10, context, n5Var, zArr);
                q5Var.t1 = h5Var2;
                ImageView imageView2 = q5Var.w0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                h5Var2.b = true;
                h5Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                h5 h5Var3 = (h5) this.b;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.c;
                Context context2 = (Context) this.d;
                sb sbVar2 = (sb) this.e;
                n5 n5Var2 = (n5) this.f;
                q5 q5Var2 = h5Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i12 = -q5Var2.r1;
                    q5Var2.r1 = i12;
                    AndroidUtilities.shakeViewSpring(view, i12);
                    new zc(q5Var2.c1, c6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        h5Var3.c = true;
                        h5 h5Var4 = q5Var2.t1;
                        if (h5Var4 != null) {
                            h5Var4.a();
                        }
                        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(h5Var3, findActivity, sbVar2, n5Var2, 2);
                        sb sbVar3 = ((jb) q5Var2.Q1).d;
                        rb rbVar = sbVar3.z0;
                        if (rbVar != null) {
                            z12 = rbVar.release(bVar);
                            sbVar3.z0 = null;
                        }
                        if (!z12) {
                            bVar.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                h5 h5Var5 = (h5) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                sb sbVar4 = (sb) this.e;
                n5 n5Var3 = (n5) this.f;
                q5 q5Var3 = h5Var5.l;
                File h = q5Var3.O1.h();
                if (h == null || !h.exists()) {
                    q5Var3.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        h5Var5.c = true;
                        h5 h5Var6 = q5Var3.t1;
                        if (h5Var6 != null) {
                            h5Var6.a();
                        }
                        c3 c3Var = new c3(h5Var5, findActivity2, storyItem2, sbVar4, n5Var3, 2);
                        sb sbVar5 = ((jb) q5Var3.Q1).d;
                        rb rbVar2 = sbVar5.z0;
                        if (rbVar2 != null) {
                            z13 = rbVar2.release(c3Var);
                            sbVar5.z0 = null;
                        }
                        if (!z13) {
                            c3Var.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
                di.d dVar = (di.d) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f;
                if (dVar.W) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        callback.run(strArr[0]);
                    }
                    e3Var2.dismiss();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.i7 i7Var = (org.telegram.ui.i7) this.b;
                org.telegram.ui.q7 q7Var = (org.telegram.ui.q7) this.c;
                org.telegram.ui.j7 j7Var = (org.telegram.ui.j7) this.d;
                mm0 mm0Var = (mm0) this.e;
                org.telegram.ui.w7.a(i7Var.d, q7Var, (org.telegram.ui.s7) j7Var, mm0Var);
                org.telegram.ui.ActionBar.m1 m1Var = i7Var.a;
                if (m1Var != null) {
                    m1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.f9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.c6) this.e, (org.telegram.ui.ActionBar.e3) this.f).show();
                break;
            case 7:
                fo foVar = (fo) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.i0 i0Var = (org.telegram.ui.Cells.i0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(foVar.getParentActivity(), null);
                Drawable mutate = foVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(foVar.getParentActivity(), true, true);
                e1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                e1Var.setOnClickListener(new l0(foVar, str, str2, charSequence, r11, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new tu0(m1Var2, 28)};
                m1Var2.e = true;
                m1Var2.c = 220;
                m1Var2.setOutsideTouchable(true);
                m1Var2.setClippingEnabled(true);
                m1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                m1Var2.setFocusable(true);
                m1Var2.showAsDropDown(i0Var, (i0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 8:
                fo foVar2 = (fo) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                x41.L(foVar2.getParentActivity(), foVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.a2 a2Var4 = (org.telegram.ui.ActionBar.a2) this.f;
                if (m2Var.getParentActivity() != null) {
                    if (editTextBoldCursor.length() == 0) {
                        Vibrator vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(editTextBoldCursor);
                        break;
                    } else {
                        if (m2Var instanceof ce1) {
                            org.telegram.ui.ActionBar.g6.o();
                            m2Var.finishFragment();
                        }
                        if (e6Var != null) {
                            f6Var.u(e6Var.a);
                            org.telegram.ui.ActionBar.g6.o1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.p0(editTextBoldCursor, a2Var4, m2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.g5.d0(editTextBoldCursor, a2Var4, m2Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) this.c;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.m1) atomicReference.getAndSet(null)).dismiss();
                }
                if (q9Var.b >= 0) {
                    if (b5Var.getFragmentStack() != null && q9Var.b < b5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) b5Var.getFragmentStack().get(q9Var.b);
                        if (m2Var3 instanceof fo) {
                            fo foVar3 = (fo) m2Var3;
                            l10 = Long.valueOf(foVar3.a());
                            l4 = Long.valueOf(foVar3.d());
                        } else if (m2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) m2Var3;
                            l10 = Long.valueOf(profileActivity.a());
                            l4 = Long.valueOf(profileActivity.g1);
                        }
                        if ((l10 == null && l10.longValue() != q9Var.f) || !(tL_forumTopic == null || l4 == null || tL_forumTopic.id == l4.longValue())) {
                            for (int size = b5Var.getFragmentStack().size() - 2; size > q9Var.b; size--) {
                                ((ActionBarLayout) b5Var).Y(size);
                            }
                        } else if (b5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(b5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i13 = q9Var.b;
                                if (size2 > i13) {
                                    ((org.telegram.ui.ActionBar.m2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i13 < b5Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) b5Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l4 = null;
                    l10 = null;
                    if (l10 == null) {
                    }
                    if (b5Var.getFragmentStack() != null) {
                    }
                }
                Class cls = q9Var.a;
                if (cls == fo.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat2 = q9Var.c;
                    if (chat2 != null) {
                        bundle.putLong("chat_id", chat2.id);
                    } else {
                        TLRPC.User user2 = q9Var.d;
                        if (user2 != null) {
                            bundle.putLong("user_id", user2.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", q9Var.g);
                    bundle.putInt("dialog_filter_id", q9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = q9Var.e;
                    if (tL_forumTopic2 != null) {
                        m2Var2.presentFragment(og.d.g(m2Var2, q9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        m2Var2.presentFragment(new fo(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", q9Var.f);
                    m2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (q9Var.a == lg1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", q9Var.c.id);
                    m2Var2.presentFragment(new lg1(bundle3), true);
                }
                if (q9Var.a == yy.class) {
                    m2Var2.presentFragment(new yy(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.m1 m1Var3 = (org.telegram.ui.ActionBar.m1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.m2 m2Var4 = (org.telegram.ui.ActionBar.m2) this.e;
                org.telegram.ui.ActionBar.c6 c6Var3 = (org.telegram.ui.ActionBar.c6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                m1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    yy0.a(tL_messages_stickerSet, m2Var4, c6Var3);
                    break;
                } else {
                    ((fo) m2Var4).da();
                    xt.q().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                el elVar = (el) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.m1 m1Var4 = (org.telegram.ui.ActionBar.m1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet Y = l41.Y();
                    Y.add(lowerCase);
                    if (Y.size() == 1 && Y.contains(currentLocaleInfo.pluralLangCode)) {
                        l41.a0(null, Boolean.FALSE);
                    } else {
                        l41.a0(Y, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(elVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(elVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr2 = x41.R;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                zc.a0(elVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new lr0(elVar, 25)).j();
                m1Var4.d(true);
                break;
            case 13:
                tt ttVar = (tt) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                kc1 kc1Var = (kc1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                xt xtVar = ttVar.a;
                if (xtVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xtVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            kc1Var.requestLayout();
                            linearLayout.requestLayout();
                            kc1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            vt vtVar = xtVar.l;
                            if (vtVar != null) {
                                vtVar.w(tL_messages_stickerSet2.set, TextUtils.join("", xtVar.o));
                            }
                            xtVar.p();
                            break;
                        }
                    } else {
                        if (xtVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                xtVar.l.O(TextUtils.join("", xtVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (xtVar.l.B()) {
                                    xtVar.l.n(TextUtils.join("", xtVar.o));
                                } else {
                                    xtVar.l.z(TextUtils.join("", xtVar.o));
                                }
                            }
                        }
                        xtVar.p();
                        break;
                    }
                }
                break;
            case 14:
                kg0 kg0Var = (kg0) this.b;
                c5.p pVar = (c5.p) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                di.d dVar2 = kg0Var.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.v3 v3Var = new org.telegram.ui.v3(kg0Var, 10);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new s5(kg0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new gq0(kg0Var, pVar, v3Var, tL_inputStorePaymentAuthCode, 21)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var3 = (org.telegram.ui.ActionBar.e3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                nl0 nl0Var = (nl0) this.e;
                m80 F = m80.F(e3Var3.container, e3Var3.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new org.telegram.ui.Components.o8(nl0Var, intValue3, 22));
                    }
                }
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                break;
        }
    }

    public /* synthetic */ l0(org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, nl0 nl0Var) {
        this.a = 15;
        this.f = e3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = nl0Var;
    }
}
