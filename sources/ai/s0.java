package ai;

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
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.kq0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w31;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.al;
import org.telegram.ui.bo;
import org.telegram.ui.fc1;
import org.telegram.ui.fg1;
import org.telegram.ui.g41;
import org.telegram.ui.hg0;
import org.telegram.ui.hl0;
import org.telegram.ui.ou0;
import org.telegram.ui.qt;
import org.telegram.ui.st;
import org.telegram.ui.ut;
import org.telegram.ui.wy;
import org.telegram.ui.xd1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
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
        long j3;
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
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.b;
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) this.c;
                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) this.d;
                q0 q0Var = (q0) this.e;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f;
                q0Var.run(Boolean.valueOf(z1Var.b()), Boolean.valueOf(z1Var2.b()), Boolean.valueOf(z1Var3.b()));
                g3Var.dismiss();
                break;
            case 1:
                f6 f6Var = (f6) this.b;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.c;
                jc jcVar = (jc) this.d;
                Context context = (Context) this.e;
                c6 c6Var = (c6) this.f;
                d6 d6Var = f6Var.O1;
                ((ac) f6Var.Q1).g(true);
                f6Var.s1 = null;
                boolean[] zArr = {false};
                if (f6Var.C1) {
                    l9 storiesController = MessagesController.getInstance(f6Var.C2).getStoriesController();
                    j3 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(f6Var.C2).getStoriesController().R();
                    ci.b1 b1Var = MessagesController.getInstance(f6Var.C2).getStoriesController().w;
                    if (!b1Var.c && !b1Var.d) {
                        b1Var.d = true;
                        ci.x0 x0Var = new ci.x0(b1Var, i10);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(b1Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new ci.y0(messagesStorage, z12, x0Var, z12 ? 1 : 0));
                    }
                } else {
                    j3 = 0;
                }
                if (!f6Var.C1) {
                    l9 storiesController2 = MessagesController.getInstance(f6Var.C2).getStoriesController();
                    TL_stories.StoryItem storyItem = d6Var.a;
                    int i11 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i11).getClientUserId() || ((storyItem.dialogId <= j3 || (user = MessagesController.getInstance(i11).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j3 || (chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        w5 w5Var = new w5(f6Var, f6Var.getContext(), f6Var2, f6Var2, jcVar, d6Var.e, !f6Var.C1 || ((f6Var.D1 || f6Var.I0()) && z10), z10, context, c6Var, zArr);
                        f6Var.t1 = w5Var;
                        ImageView imageView = f6Var.w0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        w5Var.b = true;
                        w5Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z10 = true;
                w5 w5Var2 = new w5(f6Var, f6Var.getContext(), f6Var2, f6Var2, jcVar, d6Var.e, !f6Var.C1 || ((f6Var.D1 || f6Var.I0()) && z10), z10, context, c6Var, zArr);
                f6Var.t1 = w5Var2;
                ImageView imageView2 = f6Var.w0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                w5Var2.b = true;
                w5Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                w5 w5Var3 = (w5) this.b;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.c;
                Context context2 = (Context) this.d;
                jc jcVar2 = (jc) this.e;
                c6 c6Var2 = (c6) this.f;
                f6 f6Var4 = w5Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i12 = -f6Var4.r1;
                    f6Var4.r1 = i12;
                    AndroidUtilities.shakeViewSpring(view, i12);
                    new vc(f6Var4.c1, f6Var3).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        w5Var3.c = true;
                        w5 w5Var4 = f6Var4.t1;
                        if (w5Var4 != null) {
                            w5Var4.a();
                        }
                        i5 i5Var = new i5(w5Var3, findActivity, jcVar2, c6Var2, 1);
                        jc jcVar3 = ((ac) f6Var4.Q1).d;
                        ic icVar = jcVar3.z0;
                        if (icVar != null) {
                            z12 = icVar.release(i5Var);
                            jcVar3.z0 = null;
                        }
                        if (!z12) {
                            i5Var.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                w5 w5Var5 = (w5) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                jc jcVar4 = (jc) this.e;
                c6 c6Var3 = (c6) this.f;
                f6 f6Var5 = w5Var5.l;
                File h = f6Var5.O1.h();
                if (h == null || !h.exists()) {
                    f6Var5.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        w5Var5.c = true;
                        w5 w5Var6 = f6Var5.t1;
                        if (w5Var6 != null) {
                            w5Var6.a();
                        }
                        m3 m3Var = new m3(w5Var5, findActivity2, storyItem2, jcVar4, c6Var3, 2);
                        jc jcVar5 = ((ac) f6Var5.Q1).d;
                        ic icVar2 = jcVar5.z0;
                        if (icVar2 != null) {
                            z13 = icVar2.release(m3Var);
                            jcVar5.z0 = null;
                        }
                        if (!z13) {
                            m3Var.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
                ci.d dVar = (ci.d) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) this.f;
                if (dVar.W) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        callback.run(strArr[0]);
                    }
                    g3Var2.dismiss();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) this.b;
                org.telegram.ui.o7 o7Var = (org.telegram.ui.o7) this.c;
                org.telegram.ui.h7 h7Var = (org.telegram.ui.h7) this.d;
                ml0 ml0Var = (ml0) this.e;
                org.telegram.ui.u7.a(f7Var.e, o7Var, (org.telegram.ui.q7) h7Var, ml0Var);
                org.telegram.ui.ActionBar.o1 o1Var = f7Var.a;
                if (o1Var != null) {
                    o1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.e9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.f6) this.e, (org.telegram.ui.ActionBar.g3) this.f).show();
                break;
            case 7:
                bo boVar = (bo) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(boVar.getParentActivity(), null);
                Drawable mutate = boVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(boVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(boVar.getParentActivity(), true, true);
                g1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                g1Var.setOnClickListener(new s0(boVar, str, str2, charSequence, r11, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new ou0(o1Var2, 27)};
                o1Var2.e = true;
                o1Var2.c = 220;
                o1Var2.setOutsideTouchable(true);
                o1Var2.setClippingEnabled(true);
                o1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                o1Var2.setFocusable(true);
                o1Var2.showAsDropDown(h0Var, (h0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 8:
                bo boVar2 = (bo) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                w31.K(boVar2.getParentActivity(), boVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
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
                        if (o2Var instanceof xd1) {
                            org.telegram.ui.ActionBar.j6.o();
                            o2Var.finishFragment();
                        }
                        if (h6Var != null) {
                            i6Var.u(h6Var.a);
                            org.telegram.ui.ActionBar.j6.n1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.p0(editTextBoldCursor, c2Var, o2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.c5.e0(editTextBoldCursor, c2Var, o2Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.c;
                org.telegram.ui.ActionBar.e5 e5Var = (org.telegram.ui.ActionBar.e5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.o1) atomicReference.getAndSet(null)).dismiss();
                }
                if (l9Var.b >= 0) {
                    if (e5Var.getFragmentStack() != null && l9Var.b < e5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) e5Var.getFragmentStack().get(l9Var.b);
                        if (o2Var3 instanceof bo) {
                            bo boVar3 = (bo) o2Var3;
                            l10 = Long.valueOf(boVar3.a());
                            l4 = Long.valueOf(boVar3.d());
                        } else if (o2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) o2Var3;
                            l10 = Long.valueOf(profileActivity.a());
                            l4 = Long.valueOf(profileActivity.g1);
                        }
                        if ((l10 == null && l10.longValue() != l9Var.f) || !(tL_forumTopic == null || l4 == null || tL_forumTopic.id == l4.longValue())) {
                            for (int size = e5Var.getFragmentStack().size() - 2; size > l9Var.b; size--) {
                                ((ActionBarLayout) e5Var).Y(size);
                            }
                        } else if (e5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(e5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i13 = l9Var.b;
                                if (size2 > i13) {
                                    ((org.telegram.ui.ActionBar.o2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i13 < e5Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) e5Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l4 = null;
                    l10 = null;
                    if (l10 == null) {
                    }
                    if (e5Var.getFragmentStack() != null) {
                    }
                }
                Class cls = l9Var.a;
                if (cls == bo.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat2 = l9Var.c;
                    if (chat2 != null) {
                        bundle.putLong("chat_id", chat2.id);
                    } else {
                        TLRPC.User user2 = l9Var.d;
                        if (user2 != null) {
                            bundle.putLong("user_id", user2.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", l9Var.g);
                    bundle.putInt("dialog_filter_id", l9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = l9Var.e;
                    if (tL_forumTopic2 != null) {
                        o2Var2.presentFragment(ng.d.g(o2Var2, l9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        o2Var2.presentFragment(new bo(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", l9Var.f);
                    o2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (l9Var.a == fg1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", l9Var.c.id);
                    o2Var2.presentFragment(new fg1(bundle3), true);
                }
                if (l9Var.a == wy.class) {
                    o2Var2.presentFragment(new wy(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.o1 o1Var3 = (org.telegram.ui.ActionBar.o1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.o2 o2Var4 = (org.telegram.ui.ActionBar.o2) this.e;
                org.telegram.ui.ActionBar.f6 f6Var6 = (org.telegram.ui.ActionBar.f6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                o1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    cy0.a(tL_messages_stickerSet, o2Var4, f6Var6);
                    break;
                } else {
                    ((bo) o2Var4).Y9();
                    ut.q().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                al alVar = (al) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.o1 o1Var4 = (org.telegram.ui.ActionBar.o1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet Y = g41.Y();
                    Y.add(lowerCase);
                    if (Y.size() == 1 && Y.contains(currentLocaleInfo.pluralLangCode)) {
                        g41.a0(null, Boolean.FALSE);
                    } else {
                        g41.a0(Y, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(alVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(alVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr2 = w31.R;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                vc.a0(alVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new kq0(alVar, 24)).j();
                o1Var4.d(true);
                break;
            case 13:
                qt qtVar = (qt) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                fc1 fc1Var = (fc1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                ut utVar = qtVar.a;
                if (utVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = utVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            fc1Var.requestLayout();
                            linearLayout.requestLayout();
                            fc1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            st stVar = utVar.l;
                            if (stVar != null) {
                                stVar.v(tL_messages_stickerSet2.set, TextUtils.join("", utVar.o));
                            }
                            utVar.p();
                            break;
                        }
                    } else {
                        if (utVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                utVar.l.O(TextUtils.join("", utVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (utVar.l.A()) {
                                    utVar.l.n(TextUtils.join("", utVar.o));
                                } else {
                                    utVar.l.y(TextUtils.join("", utVar.o));
                                }
                            }
                        }
                        utVar.p();
                        break;
                    }
                }
                break;
            case 14:
                hg0 hg0Var = (hg0) this.b;
                c5.o oVar = (c5.o) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                ci.d dVar2 = hg0Var.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.s3 s3Var = new org.telegram.ui.s3(hg0Var, 8);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new h6(hg0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new kn0(hg0Var, oVar, s3Var, tL_inputStorePaymentAuthCode, 22)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g3 g3Var3 = (org.telegram.ui.ActionBar.g3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                hl0 hl0Var = (hl0) this.e;
                n70 F = n70.F(g3Var3.container, g3Var3.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new id(hl0Var, intValue3, 20));
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

    public /* synthetic */ s0(org.telegram.ui.ActionBar.g3 g3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, hl0 hl0Var) {
        this.a = 15;
        this.f = g3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = hl0Var;
    }
}
