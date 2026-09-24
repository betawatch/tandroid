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
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eu0;
import org.telegram.ui.jt;
import org.telegram.ui.lt;
import org.telegram.ui.nt;
import org.telegram.ui.od1;
import org.telegram.ui.qy;
import org.telegram.ui.w31;
import org.telegram.ui.wb1;
import org.telegram.ui.wf1;
import org.telegram.ui.wk;
import org.telegram.ui.wn;
import org.telegram.ui.zf0;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.b;
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.c;
                org.telegram.ui.Cells.a2 a2Var3 = (org.telegram.ui.Cells.a2) this.d;
                q0 q0Var = (q0) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f;
                q0Var.run(Boolean.valueOf(a2Var.b()), Boolean.valueOf(a2Var2.b()), Boolean.valueOf(a2Var3.b()));
                e3Var.dismiss();
                break;
            case 1:
                e6 e6Var = (e6) this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                jc jcVar = (jc) this.d;
                Context context = (Context) this.e;
                b6 b6Var = (b6) this.f;
                c6 c6Var = e6Var.O1;
                ((ac) e6Var.Q1).g(true);
                e6Var.s1 = null;
                boolean[] zArr = {false};
                if (e6Var.C1) {
                    l9 storiesController = MessagesController.getInstance(e6Var.C2).getStoriesController();
                    j3 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(e6Var.C2).getStoriesController().R();
                    ci.b1 b1Var = MessagesController.getInstance(e6Var.C2).getStoriesController().w;
                    if (!b1Var.c && !b1Var.d) {
                        b1Var.d = true;
                        ci.x0 x0Var = new ci.x0(b1Var, i10);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(b1Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new ci.y0(messagesStorage, z12, x0Var, z12 ? 1 : 0));
                    }
                } else {
                    j3 = 0;
                }
                if (!e6Var.C1) {
                    l9 storiesController2 = MessagesController.getInstance(e6Var.C2).getStoriesController();
                    TL_stories.StoryItem storyItem = c6Var.a;
                    int i11 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i11).getClientUserId() || ((storyItem.dialogId <= j3 || (user = MessagesController.getInstance(i11).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j3 || (chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        v5 v5Var = new v5(e6Var, e6Var.getContext(), d6Var, d6Var, jcVar, c6Var.e, !e6Var.C1 || ((e6Var.D1 || e6Var.I0()) && z10), z10, context, b6Var, zArr);
                        e6Var.t1 = v5Var;
                        ImageView imageView = e6Var.w0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        v5Var.b = true;
                        v5Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z10 = true;
                v5 v5Var2 = new v5(e6Var, e6Var.getContext(), d6Var, d6Var, jcVar, c6Var.e, !e6Var.C1 || ((e6Var.D1 || e6Var.I0()) && z10), z10, context, b6Var, zArr);
                e6Var.t1 = v5Var2;
                ImageView imageView2 = e6Var.w0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                v5Var2.b = true;
                v5Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                v5 v5Var3 = (v5) this.b;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.c;
                Context context2 = (Context) this.d;
                jc jcVar2 = (jc) this.e;
                b6 b6Var2 = (b6) this.f;
                e6 e6Var2 = v5Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i12 = -e6Var2.r1;
                    e6Var2.r1 = i12;
                    AndroidUtilities.shakeViewSpring(view, i12);
                    new yc(e6Var2.c1, d6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        v5Var3.c = true;
                        v5 v5Var4 = e6Var2.t1;
                        if (v5Var4 != null) {
                            v5Var4.a();
                        }
                        h5 h5Var = new h5(v5Var3, findActivity, jcVar2, b6Var2, 1);
                        jc jcVar3 = ((ac) e6Var2.Q1).d;
                        ic icVar = jcVar3.z0;
                        if (icVar != null) {
                            z12 = icVar.release(h5Var);
                            jcVar3.z0 = null;
                        }
                        if (!z12) {
                            h5Var.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                v5 v5Var5 = (v5) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                jc jcVar4 = (jc) this.e;
                b6 b6Var3 = (b6) this.f;
                e6 e6Var3 = v5Var5.l;
                File h = e6Var3.O1.h();
                if (h == null || !h.exists()) {
                    e6Var3.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        v5Var5.c = true;
                        v5 v5Var6 = e6Var3.t1;
                        if (v5Var6 != null) {
                            v5Var6.a();
                        }
                        m3 m3Var = new m3(v5Var5, findActivity2, storyItem2, jcVar4, b6Var3, 2);
                        jc jcVar5 = ((ac) e6Var3.Q1).d;
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
                org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) this.b;
                org.telegram.ui.m7 m7Var = (org.telegram.ui.m7) this.c;
                org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) this.d;
                wl0 wl0Var = (wl0) this.e;
                org.telegram.ui.s7.a(e7Var.d, m7Var, (org.telegram.ui.o7) f7Var, wl0Var);
                org.telegram.ui.ActionBar.m1 m1Var = e7Var.a;
                if (m1Var != null) {
                    m1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.c9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.d6) this.e, (org.telegram.ui.ActionBar.e3) this.f).show();
                break;
            case 7:
                wn wnVar = (wn) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(wnVar.getParentActivity(), null);
                Drawable mutate = wnVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(wnVar.getParentActivity(), true, true);
                e1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                e1Var.setOnClickListener(new s0(wnVar, str, str2, charSequence, r11, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new eu0(m1Var2, 27)};
                m1Var2.e = true;
                m1Var2.c = 220;
                m1Var2.setOutsideTouchable(true);
                m1Var2.setClippingEnabled(true);
                m1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                m1Var2.setFocusable(true);
                m1Var2.showAsDropDown(h0Var, (h0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 8:
                wn wnVar2 = (wn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                i41.K(wnVar2.getParentActivity(), wnVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
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
                        if (m2Var instanceof od1) {
                            org.telegram.ui.ActionBar.h6.o();
                            m2Var.finishFragment();
                        }
                        if (f6Var != null) {
                            g6Var.u(f6Var.a);
                            org.telegram.ui.ActionBar.h6.n1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.p0(editTextBoldCursor, a2Var4, m2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.e5.e0(editTextBoldCursor, a2Var4, m2Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.n9 n9Var = (org.telegram.ui.Components.n9) this.c;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.m1) atomicReference.getAndSet(null)).dismiss();
                }
                if (n9Var.b >= 0) {
                    if (b5Var.getFragmentStack() != null && n9Var.b < b5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) b5Var.getFragmentStack().get(n9Var.b);
                        if (m2Var3 instanceof wn) {
                            wn wnVar3 = (wn) m2Var3;
                            l10 = Long.valueOf(wnVar3.a());
                            l4 = Long.valueOf(wnVar3.d());
                        } else if (m2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) m2Var3;
                            l10 = Long.valueOf(profileActivity.a());
                            l4 = Long.valueOf(profileActivity.g1);
                        }
                        if ((l10 == null && l10.longValue() != n9Var.f) || !(tL_forumTopic == null || l4 == null || tL_forumTopic.id == l4.longValue())) {
                            for (int size = b5Var.getFragmentStack().size() - 2; size > n9Var.b; size--) {
                                ((ActionBarLayout) b5Var).Y(size);
                            }
                        } else if (b5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(b5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i13 = n9Var.b;
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
                Class cls = n9Var.a;
                if (cls == wn.class) {
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
                        m2Var2.presentFragment(ng.d.g(m2Var2, n9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        m2Var2.presentFragment(new wn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", n9Var.f);
                    m2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (n9Var.a == wf1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", n9Var.c.id);
                    m2Var2.presentFragment(new wf1(bundle3), true);
                }
                if (n9Var.a == qy.class) {
                    m2Var2.presentFragment(new qy(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.m1 m1Var3 = (org.telegram.ui.ActionBar.m1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.m2 m2Var4 = (org.telegram.ui.ActionBar.m2) this.e;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                m1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    ly0.a(tL_messages_stickerSet, m2Var4, d6Var3);
                    break;
                } else {
                    ((wn) m2Var4).Y9();
                    nt.q().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                wk wkVar = (wk) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.m1 m1Var4 = (org.telegram.ui.ActionBar.m1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet Y = w31.Y();
                    Y.add(lowerCase);
                    if (Y.size() == 1 && Y.contains(currentLocaleInfo.pluralLangCode)) {
                        w31.a0(null, Boolean.FALSE);
                    } else {
                        w31.a0(Y, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(wkVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(wkVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr2 = i41.R;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                yc.a0(wkVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new wq0(wkVar, 25)).j();
                m1Var4.d(true);
                break;
            case 13:
                jt jtVar = (jt) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                wb1 wb1Var = (wb1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                nt ntVar = jtVar.a;
                if (ntVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ntVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            wb1Var.requestLayout();
                            linearLayout.requestLayout();
                            wb1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            lt ltVar = ntVar.l;
                            if (ltVar != null) {
                                ltVar.w(tL_messages_stickerSet2.set, TextUtils.join("", ntVar.o));
                            }
                            ntVar.p();
                            break;
                        }
                    } else {
                        if (ntVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                ntVar.l.O(TextUtils.join("", ntVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (ntVar.l.B()) {
                                    ntVar.l.o(TextUtils.join("", ntVar.o));
                                } else {
                                    ntVar.l.z(TextUtils.join("", ntVar.o));
                                }
                            }
                        }
                        ntVar.p();
                        break;
                    }
                }
                break;
            case 14:
                zf0 zf0Var = (zf0) this.b;
                c5.o oVar = (c5.o) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                ci.d dVar2 = zf0Var.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.t3 t3Var = new org.telegram.ui.t3(zf0Var, 10);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new g6(zf0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new vn0(zf0Var, oVar, t3Var, tL_inputStorePaymentAuthCode, 22)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var3 = (org.telegram.ui.ActionBar.e3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                zk0 zk0Var = (zk0) this.e;
                y70 F = y70.F(e3Var3.container, e3Var3.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new ld(zk0Var, intValue3, 20));
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

    public /* synthetic */ s0(org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, zk0 zk0Var) {
        this.a = 15;
        this.f = e3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = zk0Var;
    }
}
