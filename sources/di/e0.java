package di;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a31;
import org.telegram.ui.bb1;
import org.telegram.ui.bl0;
import org.telegram.ui.bu0;
import org.telegram.ui.cf1;
import org.telegram.ui.dt;
import org.telegram.ui.ey;
import org.telegram.ui.ft;
import org.telegram.ui.ht;
import org.telegram.ui.qf0;
import org.telegram.ui.vc1;
import org.telegram.ui.vk;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02f9  */
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
                c0 c0Var = (c0) this.e;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f;
                c0Var.run(Boolean.valueOf(y1Var.b()), Boolean.valueOf(y1Var2.b()), Boolean.valueOf(y1Var3.b()));
                k3Var.dismiss();
                break;
            case 1:
                q4 q4Var = (q4) this.b;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.c;
                y9 y9Var = (y9) this.d;
                Context context = (Context) this.e;
                n4 n4Var = (n4) this.f;
                o4 o4Var = q4Var.D1;
                ((p9) q4Var.F1).g(true);
                q4Var.h1 = null;
                boolean[] zArr = {false};
                if (q4Var.r1) {
                    h7 storiesController = MessagesController.getInstance(q4Var.r2).getStoriesController();
                    j10 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.S();
                    }
                    MessagesController.getInstance(q4Var.r2).getStoriesController().U();
                    fi.a1 a1Var = MessagesController.getInstance(q4Var.r2).getStoriesController().w;
                    if (!a1Var.c && !a1Var.d) {
                        a1Var.d = true;
                        fi.x0 x0Var = new fi.x0(a1Var, i11);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new bi.u7(messagesStorage, z12, x0Var, i10));
                    }
                } else {
                    j10 = 0;
                }
                if (!q4Var.r1) {
                    h7 storiesController2 = MessagesController.getInstance(q4Var.r2).getStoriesController();
                    TL_stories.StoryItem storyItem = o4Var.a;
                    int i12 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i12).getClientUserId() || ((storyItem.dialogId <= j10 || (user = MessagesController.getInstance(i12).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j10 || (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        h4 h4Var = new h4(q4Var, q4Var.getContext(), u6Var, u6Var, y9Var, o4Var.e, !q4Var.r1 || ((q4Var.s1 || q4Var.G0()) && z10), z10, context, n4Var, zArr);
                        q4Var.i1 = h4Var;
                        ImageView imageView = q4Var.l0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        h4Var.b = true;
                        h4Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z10 = true;
                h4 h4Var2 = new h4(q4Var, q4Var.getContext(), u6Var, u6Var, y9Var, o4Var.e, !q4Var.r1 || ((q4Var.s1 || q4Var.G0()) && z10), z10, context, n4Var, zArr);
                q4Var.i1 = h4Var2;
                ImageView imageView2 = q4Var.l0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                h4Var2.b = true;
                h4Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                h4 h4Var3 = (h4) this.b;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) this.c;
                Context context2 = (Context) this.d;
                y9 y9Var2 = (y9) this.e;
                n4 n4Var2 = (n4) this.f;
                q4 q4Var2 = h4Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i13 = -q4Var2.g1;
                    q4Var2.g1 = i13;
                    AndroidUtilities.shakeViewSpring(view, i13);
                    new wc(q4Var2.R0, u6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        h4Var3.c = true;
                        h4 h4Var4 = q4Var2.i1;
                        if (h4Var4 != null) {
                            h4Var4.a();
                        }
                        ai.e0 e0Var = new ai.e0(h4Var3, findActivity, y9Var2, n4Var2, 11);
                        y9 y9Var3 = ((p9) q4Var2.F1).d;
                        x9 x9Var = y9Var3.z0;
                        if (x9Var != null) {
                            z12 = x9Var.release(e0Var);
                            y9Var3.z0 = null;
                        }
                        if (!z12) {
                            e0Var.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                h4 h4Var5 = (h4) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                y9 y9Var4 = (y9) this.e;
                n4 n4Var3 = (n4) this.f;
                q4 q4Var3 = h4Var5.l;
                File h = q4Var3.D1.h();
                if (h == null || !h.exists()) {
                    q4Var3.Y0();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        h4Var5.c = true;
                        h4 h4Var6 = q4Var3.i1;
                        if (h4Var6 != null) {
                            h4Var6.a();
                        }
                        bi.u0 u0Var = new bi.u0(h4Var5, findActivity2, storyItem2, y9Var4, n4Var3, 10);
                        y9 y9Var5 = ((p9) q4Var3.F1).d;
                        x9 x9Var2 = y9Var5.z0;
                        if (x9Var2 != null) {
                            z13 = x9Var2.release(u0Var);
                            y9Var5.z0 = null;
                        }
                        if (!z13) {
                            u0Var.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
                fi.d dVar = (fi.d) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.ActionBar.k3 k3Var2 = (org.telegram.ui.ActionBar.k3) this.f;
                if (dVar.c0) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        callback.run(strArr[0]);
                    }
                    k3Var2.dismiss();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.h7 h7Var = (org.telegram.ui.h7) this.b;
                org.telegram.ui.q7 q7Var = (org.telegram.ui.q7) this.c;
                org.telegram.ui.j7 j7Var = (org.telegram.ui.j7) this.d;
                nm0 nm0Var = (nm0) this.e;
                org.telegram.ui.x7.a(h7Var.f, q7Var, (org.telegram.ui.s7) j7Var, nm0Var);
                org.telegram.ui.ActionBar.o1 o1Var = h7Var.a;
                if (o1Var != null) {
                    o1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.g9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.u6) this.e, (org.telegram.ui.ActionBar.k3) this.f).show();
                break;
            case 7:
                wn wnVar = (wn) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(wnVar.getParentActivity(), null);
                Drawable mutate = wnVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                org.telegram.ui.ActionBar.f7.y(actionBarPopupWindow$ActionBarPopupWindowLayout, mutate, org.telegram.ui.ActionBar.y6.G8, wnVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(wnVar.getParentActivity(), true, true);
                g1Var.j(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                g1Var.setOnClickListener(new e0(wnVar, str, str2, charSequence, r12, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new bu0(o1Var2, 28)};
                o1Var2.e = true;
                o1Var2.c = 220;
                o1Var2.setOutsideTouchable(true);
                o1Var2.setClippingEnabled(true);
                o1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                o1Var2.setFocusable(true);
                o1Var2.showAsDropDown(g0Var, (g0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 8:
                wn wnVar2 = (wn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                g51.T(wnVar2.getParentActivity(), wnVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.b;
                org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) this.c;
                org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) this.d;
                org.telegram.ui.ActionBar.x6 x6Var = (org.telegram.ui.ActionBar.x6) this.e;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f;
                if (r2Var.getParentActivity() != null) {
                    if (f5Var.length() == 0) {
                        Vibrator vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(f5Var);
                        break;
                    } else {
                        if (r2Var instanceof vc1) {
                            org.telegram.ui.ActionBar.y6.o();
                            r2Var.finishFragment();
                        }
                        if (w6Var != null) {
                            x6Var.u(w6Var.a);
                            org.telegram.ui.ActionBar.y6.q1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.h1(f5Var, e2Var, r2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.g5.d0(f5Var, e2Var, r2Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) this.c;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.o1) atomicReference.getAndSet(null)).dismiss();
                }
                if (p9Var.b >= 0) {
                    if (j5Var.getFragmentStack() != null && p9Var.b < j5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) j5Var.getFragmentStack().get(p9Var.b);
                        if (r2Var3 instanceof wn) {
                            wn wnVar3 = (wn) r2Var3;
                            l10 = Long.valueOf(wnVar3.a());
                            l4 = Long.valueOf(wnVar3.b());
                        } else if (r2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) r2Var3;
                            l10 = Long.valueOf(profileActivity.a());
                            l4 = Long.valueOf(profileActivity.g1);
                        }
                        if ((l10 == null && l10.longValue() != p9Var.f) || !(tL_forumTopic == null || l4 == null || tL_forumTopic.id == l4.longValue())) {
                            for (int size = j5Var.getFragmentStack().size() - 2; size > p9Var.b; size--) {
                                ((ActionBarLayout) j5Var).a0(size);
                            }
                        } else if (j5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(j5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i14 = p9Var.b;
                                if (size2 > i14) {
                                    ((org.telegram.ui.ActionBar.r2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i14 < j5Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) j5Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l4 = null;
                    l10 = null;
                    if (l10 == null) {
                    }
                    if (j5Var.getFragmentStack() != null) {
                    }
                }
                Class cls = p9Var.a;
                if (cls == wn.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat2 = p9Var.c;
                    if (chat2 != null) {
                        bundle.putLong("chat_id", chat2.id);
                    } else {
                        TLRPC.User user2 = p9Var.d;
                        if (user2 != null) {
                            bundle.putLong("user_id", user2.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", p9Var.g);
                    bundle.putInt("dialog_filter_id", p9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = p9Var.e;
                    if (tL_forumTopic2 != null) {
                        r2Var2.presentFragment(pg.d.g(r2Var2, p9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        r2Var2.presentFragment(new wn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", p9Var.f);
                    r2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (p9Var.a == cf1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", p9Var.c.id);
                    r2Var2.presentFragment(new cf1(bundle3), true);
                }
                if (p9Var.a == ey.class) {
                    r2Var2.presentFragment(new ey(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.o1 o1Var3 = (org.telegram.ui.ActionBar.o1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.r2 r2Var4 = (org.telegram.ui.ActionBar.r2) this.e;
                org.telegram.ui.ActionBar.u6 u6Var3 = (org.telegram.ui.ActionBar.u6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                o1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    iz0.a(tL_messages_stickerSet, r2Var4, u6Var3);
                    break;
                } else {
                    ((wn) r2Var4).la();
                    ht.o().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                vk vkVar = (vk) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.o1 o1Var4 = (org.telegram.ui.ActionBar.o1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet Z = a31.Z();
                    Z.add(lowerCase);
                    if (Z.size() == 1 && Z.contains(currentLocaleInfo.pluralLangCode)) {
                        a31.b0(null, Boolean.FALSE);
                    } else {
                        a31.b0(Z, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(vkVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(vkVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr2 = g51.X;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                wc.b0(vkVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new t51(vkVar, 0)).j();
                o1Var4.d(true);
                break;
            case 13:
                dt dtVar = (dt) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                bb1 bb1Var = (bb1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                ht htVar = dtVar.a;
                if (htVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = htVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            bb1Var.requestLayout();
                            linearLayout.requestLayout();
                            bb1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            ft ftVar = htVar.l;
                            if (ftVar != null) {
                                ftVar.v(tL_messages_stickerSet2.set, TextUtils.join("", htVar.o));
                            }
                            htVar.n();
                            break;
                        }
                    } else {
                        if (htVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                htVar.l.N(TextUtils.join("", htVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (htVar.l.A()) {
                                    htVar.l.n(TextUtils.join("", htVar.o));
                                } else {
                                    htVar.l.y(TextUtils.join("", htVar.o));
                                }
                            }
                        }
                        htVar.n();
                        break;
                    }
                }
                break;
            case 14:
                qf0 qf0Var = (qf0) this.b;
                d5.o oVar = (d5.o) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                fi.d dVar2 = qf0Var.b;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    org.telegram.ui.t3 t3Var = new org.telegram.ui.t3(qf0Var, 10);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new bi.p7(qf0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new e10(qf0Var, oVar, t3Var, tL_inputStorePaymentAuthCode, 29)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k3 k3Var3 = (org.telegram.ui.ActionBar.k3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                bl0 bl0Var = (bl0) this.e;
                l80 F = l80.F(k3Var3.container, k3Var3.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList4.get(i15);
                    i15++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new org.telegram.ui.Components.h2(bl0Var, intValue3, 23));
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

    public /* synthetic */ e0(org.telegram.ui.ActionBar.k3 k3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, bl0 bl0Var) {
        this.a = 15;
        this.f = k3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = bl0Var;
    }
}
