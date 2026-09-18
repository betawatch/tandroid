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
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dc1;
import org.telegram.ui.dg1;
import org.telegram.ui.e41;
import org.telegram.ui.gg0;
import org.telegram.ui.il0;
import org.telegram.ui.mu0;
import org.telegram.ui.ot;
import org.telegram.ui.qt;
import org.telegram.ui.st;
import org.telegram.ui.uy;
import org.telegram.ui.vd1;
import org.telegram.ui.yk;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                q0Var.run(Boolean.valueOf(a2Var.b()), Boolean.valueOf(a2Var2.b()), Boolean.valueOf(a2Var3.b()));
                f3Var.dismiss();
                break;
            case 1:
                f6 f6Var = (f6) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
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
                        w5 w5Var = new w5(f6Var, f6Var.getContext(), e6Var, e6Var, jcVar, d6Var.e, !f6Var.C1 || ((f6Var.D1 || f6Var.I0()) && z10), z10, context, c6Var, zArr);
                        f6Var.t1 = w5Var;
                        ImageView imageView = f6Var.w0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        w5Var.b = true;
                        w5Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z10 = true;
                w5 w5Var2 = new w5(f6Var, f6Var.getContext(), e6Var, e6Var, jcVar, d6Var.e, !f6Var.C1 || ((f6Var.D1 || f6Var.I0()) && z10), z10, context, c6Var, zArr);
                f6Var.t1 = w5Var2;
                ImageView imageView2 = f6Var.w0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                w5Var2.b = true;
                w5Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                w5 w5Var3 = (w5) this.b;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.c;
                Context context2 = (Context) this.d;
                jc jcVar2 = (jc) this.e;
                c6 c6Var2 = (c6) this.f;
                f6 f6Var2 = w5Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i12 = -f6Var2.r1;
                    f6Var2.r1 = i12;
                    AndroidUtilities.shakeViewSpring(view, i12);
                    new xc(f6Var2.c1, e6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        w5Var3.c = true;
                        w5 w5Var4 = f6Var2.t1;
                        if (w5Var4 != null) {
                            w5Var4.a();
                        }
                        i5 i5Var = new i5(w5Var3, findActivity, jcVar2, c6Var2, 1);
                        jc jcVar3 = ((ac) f6Var2.Q1).d;
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
                f6 f6Var3 = w5Var5.l;
                File h = f6Var3.O1.h();
                if (h == null || !h.exists()) {
                    f6Var3.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        w5Var5.c = true;
                        w5 w5Var6 = f6Var3.t1;
                        if (w5Var6 != null) {
                            w5Var6.a();
                        }
                        m3 m3Var = new m3(w5Var5, findActivity2, storyItem2, jcVar4, c6Var3, 2);
                        jc jcVar5 = ((ac) f6Var3.Q1).d;
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
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f;
                if (dVar.W) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        callback.run(strArr[0]);
                    }
                    f3Var2.dismiss();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) this.b;
                org.telegram.ui.n7 n7Var = (org.telegram.ui.n7) this.c;
                org.telegram.ui.g7 g7Var = (org.telegram.ui.g7) this.d;
                wl0 wl0Var = (wl0) this.e;
                org.telegram.ui.t7.a(e7Var.e, n7Var, (org.telegram.ui.p7) g7Var, wl0Var);
                org.telegram.ui.ActionBar.n1 n1Var = e7Var.a;
                if (n1Var != null) {
                    n1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.d9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.e6) this.e, (org.telegram.ui.ActionBar.f3) this.f).show();
                break;
            case 7:
                zn znVar = (zn) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(znVar.getParentActivity(), null);
                Drawable mutate = znVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(znVar.getParentActivity(), true, true);
                f1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                f1Var.setOnClickListener(new s0(znVar, str, str2, charSequence, r11, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new mu0(n1Var2, 27)};
                n1Var2.e = true;
                n1Var2.c = 220;
                n1Var2.setOutsideTouchable(true);
                n1Var2.setClippingEnabled(true);
                n1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                n1Var2.setFocusable(true);
                n1Var2.showAsDropDown(h0Var, (h0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 8:
                zn znVar2 = (zn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                k41.K(znVar2.getParentActivity(), znVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
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
                        if (n2Var instanceof vd1) {
                            org.telegram.ui.ActionBar.j6.o();
                            n2Var.finishFragment();
                        }
                        if (g6Var != null) {
                            i6Var.u(g6Var.a);
                            org.telegram.ui.ActionBar.j6.n1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.p0(editTextBoldCursor, b2Var, n2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.e5.e0(editTextBoldCursor, b2Var, n2Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.n9 n9Var = (org.telegram.ui.Components.n9) this.c;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.n1) atomicReference.getAndSet(null)).dismiss();
                }
                if (n9Var.b >= 0) {
                    if (d5Var.getFragmentStack() != null && n9Var.b < d5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) d5Var.getFragmentStack().get(n9Var.b);
                        if (n2Var3 instanceof zn) {
                            zn znVar3 = (zn) n2Var3;
                            l10 = Long.valueOf(znVar3.a());
                            l4 = Long.valueOf(znVar3.d());
                        } else if (n2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) n2Var3;
                            l10 = Long.valueOf(profileActivity.a());
                            l4 = Long.valueOf(profileActivity.g1);
                        }
                        if ((l10 == null && l10.longValue() != n9Var.f) || !(tL_forumTopic == null || l4 == null || tL_forumTopic.id == l4.longValue())) {
                            for (int size = d5Var.getFragmentStack().size() - 2; size > n9Var.b; size--) {
                                ((ActionBarLayout) d5Var).Y(size);
                            }
                        } else if (d5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(d5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i13 = n9Var.b;
                                if (size2 > i13) {
                                    ((org.telegram.ui.ActionBar.n2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i13 < d5Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) d5Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l4 = null;
                    l10 = null;
                    if (l10 == null) {
                    }
                    if (d5Var.getFragmentStack() != null) {
                    }
                }
                Class cls = n9Var.a;
                if (cls == zn.class) {
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
                        n2Var2.presentFragment(ng.d.g(n2Var2, n9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        n2Var2.presentFragment(new zn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", n9Var.f);
                    n2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (n9Var.a == dg1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", n9Var.c.id);
                    n2Var2.presentFragment(new dg1(bundle3), true);
                }
                if (n9Var.a == uy.class) {
                    n2Var2.presentFragment(new uy(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.n1 n1Var3 = (org.telegram.ui.ActionBar.n1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) this.e;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                n1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    ny0.a(tL_messages_stickerSet, n2Var4, e6Var3);
                    break;
                } else {
                    ((zn) n2Var4).Y9();
                    st.q().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                yk ykVar = (yk) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.n1 n1Var4 = (org.telegram.ui.ActionBar.n1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet Y = e41.Y();
                    Y.add(lowerCase);
                    if (Y.size() == 1 && Y.contains(currentLocaleInfo.pluralLangCode)) {
                        e41.a0(null, Boolean.FALSE);
                    } else {
                        e41.a0(Y, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(ykVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(ykVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr2 = k41.R;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                xc.a0(ykVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new xq0(ykVar, 24)).j();
                n1Var4.d(true);
                break;
            case 13:
                ot otVar = (ot) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                dc1 dc1Var = (dc1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                st stVar = otVar.a;
                if (stVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            dc1Var.requestLayout();
                            linearLayout.requestLayout();
                            dc1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            qt qtVar = stVar.l;
                            if (qtVar != null) {
                                qtVar.w(tL_messages_stickerSet2.set, TextUtils.join("", stVar.o));
                            }
                            stVar.p();
                            break;
                        }
                    } else {
                        if (stVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                stVar.l.O(TextUtils.join("", stVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (stVar.l.B()) {
                                    stVar.l.n(TextUtils.join("", stVar.o));
                                } else {
                                    stVar.l.z(TextUtils.join("", stVar.o));
                                }
                            }
                        }
                        stVar.p();
                        break;
                    }
                }
                break;
            case 14:
                gg0 gg0Var = (gg0) this.b;
                c5.o oVar = (c5.o) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                ci.d dVar2 = gg0Var.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.s3 s3Var = new org.telegram.ui.s3(gg0Var, 8);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new h6(gg0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new wn0(gg0Var, oVar, s3Var, tL_inputStorePaymentAuthCode, 22)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var3 = (org.telegram.ui.ActionBar.f3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                il0 il0Var = (il0) this.e;
                w70 F = w70.F(f3Var3.container, f3Var3.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new org.telegram.ui.Components.x2(il0Var, intValue3, 22));
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

    public /* synthetic */ s0(org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, il0 il0Var) {
        this.a = 15;
        this.f = f3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = il0Var;
    }
}
