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
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.jq0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
import org.telegram.ui.ec1;
import org.telegram.ui.eg1;
import org.telegram.ui.fg0;
import org.telegram.ui.h41;
import org.telegram.ui.il0;
import org.telegram.ui.lu0;
import org.telegram.ui.ot;
import org.telegram.ui.qt;
import org.telegram.ui.st;
import org.telegram.ui.uy;
import org.telegram.ui.wd1;
import org.telegram.ui.zk;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                j0 j0Var = (j0) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                j0Var.run(Boolean.valueOf(z1Var.b()), Boolean.valueOf(z1Var2.b()), Boolean.valueOf(z1Var3.b()));
                f3Var.dismiss();
                break;
            case 1:
                o5 o5Var = (o5) this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                pb pbVar = (pb) this.d;
                Context context = (Context) this.e;
                l5 l5Var = (l5) this.f;
                m5 m5Var = o5Var.O1;
                ((gb) o5Var.Q1).g(true);
                o5Var.s1 = null;
                boolean[] zArr = {false};
                if (o5Var.C1) {
                    u8 storiesController = MessagesController.getInstance(o5Var.C2).getStoriesController();
                    j3 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(o5Var.C2).getStoriesController().R();
                    di.b1 b1Var = MessagesController.getInstance(o5Var.C2).getStoriesController().w;
                    if (!b1Var.c && !b1Var.d) {
                        b1Var.d = true;
                        di.x0 x0Var = new di.x0(b1Var, i10);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(b1Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new di.y0(messagesStorage, z12, x0Var, z12 ? 1 : 0));
                    }
                } else {
                    j3 = 0;
                }
                if (!o5Var.C1) {
                    u8 storiesController2 = MessagesController.getInstance(o5Var.C2).getStoriesController();
                    TL_stories.StoryItem storyItem = m5Var.a;
                    int i11 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i11).getClientUserId() || ((storyItem.dialogId <= j3 || (user = MessagesController.getInstance(i11).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j3 || (chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        f5 f5Var = new f5(o5Var, o5Var.getContext(), f6Var, f6Var, pbVar, m5Var.e, !o5Var.C1 || ((o5Var.D1 || o5Var.I0()) && z10), z10, context, l5Var, zArr);
                        o5Var.t1 = f5Var;
                        ImageView imageView = o5Var.w0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        f5Var.b = true;
                        f5Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z10 = true;
                f5 f5Var2 = new f5(o5Var, o5Var.getContext(), f6Var, f6Var, pbVar, m5Var.e, !o5Var.C1 || ((o5Var.D1 || o5Var.I0()) && z10), z10, context, l5Var, zArr);
                o5Var.t1 = f5Var2;
                ImageView imageView2 = o5Var.w0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                f5Var2.b = true;
                f5Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                f5 f5Var3 = (f5) this.b;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.c;
                Context context2 = (Context) this.d;
                pb pbVar2 = (pb) this.e;
                l5 l5Var2 = (l5) this.f;
                o5 o5Var2 = f5Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i12 = -o5Var2.r1;
                    o5Var2.r1 = i12;
                    AndroidUtilities.shakeViewSpring(view, i12);
                    new yc(o5Var2.c1, f6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        f5Var3.c = true;
                        f5 f5Var4 = o5Var2.t1;
                        if (f5Var4 != null) {
                            f5Var4.a();
                        }
                        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(f5Var3, findActivity, pbVar2, l5Var2, 2);
                        pb pbVar3 = ((gb) o5Var2.Q1).d;
                        ob obVar = pbVar3.z0;
                        if (obVar != null) {
                            z12 = obVar.release(bVar);
                            pbVar3.z0 = null;
                        }
                        if (!z12) {
                            bVar.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                f5 f5Var5 = (f5) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                pb pbVar4 = (pb) this.e;
                l5 l5Var3 = (l5) this.f;
                o5 o5Var3 = f5Var5.l;
                File h = o5Var3.O1.h();
                if (h == null || !h.exists()) {
                    o5Var3.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        f5Var5.c = true;
                        f5 f5Var6 = o5Var3.t1;
                        if (f5Var6 != null) {
                            f5Var6.a();
                        }
                        z2 z2Var = new z2(f5Var5, findActivity2, storyItem2, pbVar4, l5Var3, 2);
                        pb pbVar5 = ((gb) o5Var3.Q1).d;
                        ob obVar2 = pbVar5.z0;
                        if (obVar2 != null) {
                            z13 = obVar2.release(z2Var);
                            pbVar5.z0 = null;
                        }
                        if (!z13) {
                            z2Var.run();
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
                org.telegram.ui.m7 m7Var = (org.telegram.ui.m7) this.c;
                org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) this.d;
                ll0 ll0Var = (ll0) this.e;
                org.telegram.ui.s7.a(e7Var.d, m7Var, (org.telegram.ui.o7) f7Var, ll0Var);
                org.telegram.ui.ActionBar.n1 n1Var = e7Var.a;
                if (n1Var != null) {
                    n1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.c9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.f6) this.e, (org.telegram.ui.ActionBar.f3) this.f).show();
                break;
            case 7:
                co coVar = (co) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(coVar.getParentActivity(), null);
                Drawable mutate = coVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(coVar.getParentActivity(), true, true);
                f1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                f1Var.setOnClickListener(new l0(coVar, str, str2, charSequence, r11, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new lu0(n1Var2, 27)};
                n1Var2.e = true;
                n1Var2.c = 220;
                n1Var2.setOutsideTouchable(true);
                n1Var2.setClippingEnabled(true);
                n1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                n1Var2.setFocusable(true);
                n1Var2.showAsDropDown(h0Var, (h0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 8:
                co coVar2 = (co) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                u31.K(coVar2.getParentActivity(), coVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
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
                        if (n2Var instanceof wd1) {
                            org.telegram.ui.ActionBar.j6.o();
                            n2Var.finishFragment();
                        }
                        if (h6Var != null) {
                            i6Var.u(h6Var.a);
                            org.telegram.ui.ActionBar.j6.n1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.q0(editTextBoldCursor, b2Var, n2Var, z12 ? 1 : 0));
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
                org.telegram.ui.Components.o9 o9Var = (org.telegram.ui.Components.o9) this.c;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.n1) atomicReference.getAndSet(null)).dismiss();
                }
                if (o9Var.b >= 0) {
                    if (d5Var.getFragmentStack() != null && o9Var.b < d5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) d5Var.getFragmentStack().get(o9Var.b);
                        if (n2Var3 instanceof co) {
                            co coVar3 = (co) n2Var3;
                            l10 = Long.valueOf(coVar3.a());
                            l4 = Long.valueOf(coVar3.d());
                        } else if (n2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) n2Var3;
                            l10 = Long.valueOf(profileActivity.a());
                            l4 = Long.valueOf(profileActivity.g1);
                        }
                        if ((l10 == null && l10.longValue() != o9Var.f) || !(tL_forumTopic == null || l4 == null || tL_forumTopic.id == l4.longValue())) {
                            for (int size = d5Var.getFragmentStack().size() - 2; size > o9Var.b; size--) {
                                ((ActionBarLayout) d5Var).Y(size);
                            }
                        } else if (d5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(d5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i13 = o9Var.b;
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
                Class cls = o9Var.a;
                if (cls == co.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat2 = o9Var.c;
                    if (chat2 != null) {
                        bundle.putLong("chat_id", chat2.id);
                    } else {
                        TLRPC.User user2 = o9Var.d;
                        if (user2 != null) {
                            bundle.putLong("user_id", user2.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", o9Var.g);
                    bundle.putInt("dialog_filter_id", o9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = o9Var.e;
                    if (tL_forumTopic2 != null) {
                        n2Var2.presentFragment(og.d.g(n2Var2, o9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        n2Var2.presentFragment(new co(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", o9Var.f);
                    n2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (o9Var.a == eg1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", o9Var.c.id);
                    n2Var2.presentFragment(new eg1(bundle3), true);
                }
                if (o9Var.a == uy.class) {
                    n2Var2.presentFragment(new uy(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.n1 n1Var3 = (org.telegram.ui.ActionBar.n1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) this.e;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                n1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    ay0.a(tL_messages_stickerSet, n2Var4, f6Var3);
                    break;
                } else {
                    ((co) n2Var4).Y9();
                    st.q().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                zk zkVar = (zk) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.n1 n1Var4 = (org.telegram.ui.ActionBar.n1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet Y = h41.Y();
                    Y.add(lowerCase);
                    if (Y.size() == 1 && Y.contains(currentLocaleInfo.pluralLangCode)) {
                        h41.a0(null, Boolean.FALSE);
                    } else {
                        h41.a0(Y, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(zkVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(zkVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr2 = u31.R;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                yc.a0(zkVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new jq0(zkVar, 24)).j();
                n1Var4.d(true);
                break;
            case 13:
                ot otVar = (ot) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ec1 ec1Var = (ec1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                st stVar = otVar.a;
                if (stVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            ec1Var.requestLayout();
                            linearLayout.requestLayout();
                            ec1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            qt qtVar = stVar.l;
                            if (qtVar != null) {
                                qtVar.v(tL_messages_stickerSet2.set, TextUtils.join("", stVar.o));
                            }
                            stVar.p();
                            break;
                        }
                    } else {
                        if (stVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                stVar.l.O(TextUtils.join("", stVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (stVar.l.A()) {
                                    stVar.l.m(TextUtils.join("", stVar.o));
                                } else {
                                    stVar.l.y(TextUtils.join("", stVar.o));
                                }
                            }
                        }
                        stVar.p();
                        break;
                    }
                }
                break;
            case 14:
                fg0 fg0Var = (fg0) this.b;
                c5.o oVar = (c5.o) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                di.d dVar2 = fg0Var.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.t3 t3Var = new org.telegram.ui.t3(fg0Var, 8);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new q5(fg0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new in0(fg0Var, oVar, t3Var, tL_inputStorePaymentAuthCode, 22)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var3 = (org.telegram.ui.ActionBar.f3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                il0 il0Var = (il0) this.e;
                n70 F = n70.F(f3Var3.container, f3Var3.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new org.telegram.ui.Components.m8(il0Var, intValue3, 21));
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

    public /* synthetic */ l0(org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, il0 il0Var) {
        this.a = 15;
        this.f = f3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = il0Var;
    }
}
