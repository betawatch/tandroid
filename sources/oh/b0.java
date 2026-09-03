package oh;

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
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.nq0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b30;
import org.telegram.ui.cr0;
import org.telegram.ui.jd1;
import org.telegram.ui.mt;
import org.telegram.ui.ot;
import org.telegram.ui.py;
import org.telegram.ui.qb1;
import org.telegram.ui.qt;
import org.telegram.ui.sf1;
import org.telegram.ui.t31;
import org.telegram.ui.wk;
import org.telegram.ui.wk0;
import org.telegram.ui.xf0;
import org.telegram.ui.xn;
import org.telegram.ui.yt0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        boolean z4;
        TLRPC.Chat chat;
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User user;
        Long l10;
        Long l11;
        int i10 = 8;
        SpannableStringBuilder spannableStringBuilder = null;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.b;
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) this.c;
                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) this.d;
                z zVar = (z) this.e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f;
                zVar.run(Boolean.valueOf(z1Var.b()), Boolean.valueOf(z1Var2.b()), Boolean.valueOf(z1Var3.b()));
                h3Var.dismiss();
                break;
            case 1:
                f4 f4Var = (f4) this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                i9 i9Var = (i9) this.d;
                Context context = (Context) this.e;
                c4 c4Var = (c4) this.f;
                d4 d4Var = f4Var.L1;
                ((z8) f4Var.N1).g(true);
                f4Var.p1 = null;
                boolean[] zArr = {false};
                if (f4Var.z1) {
                    t6 storiesController = MessagesController.getInstance(f4Var.z2).getStoriesController();
                    j10 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(f4Var.z2).getStoriesController().R();
                    qh.t0 t0Var = MessagesController.getInstance(f4Var.z2).getStoriesController().w;
                    if (!t0Var.c && !t0Var.d) {
                        t0Var.d = true;
                        qh.q0 q0Var = new qh.q0(t0Var, i11);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(t0Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new cr0(messagesStorage, z11, q0Var, i10));
                    }
                } else {
                    j10 = 0;
                }
                if (!f4Var.z1) {
                    t6 storiesController2 = MessagesController.getInstance(f4Var.z2).getStoriesController();
                    TL_stories.StoryItem storyItem = d4Var.a;
                    int i12 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i12).getClientUserId() || ((storyItem.dialogId <= j10 || (user = MessagesController.getInstance(i12).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j10 || (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z10 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z10 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z4 = false;
                        y3 y3Var = new y3(f4Var, f4Var.getContext(), g6Var, g6Var, i9Var, d4Var.e, !f4Var.z1 || ((f4Var.A1 || f4Var.I0()) && z4), z4, context, c4Var, zArr);
                        f4Var.q1 = y3Var;
                        ImageView imageView = f4Var.t0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        y3Var.b = true;
                        y3Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z4 = true;
                y3 y3Var2 = new y3(f4Var, f4Var.getContext(), g6Var, g6Var, i9Var, d4Var.e, !f4Var.z1 || ((f4Var.A1 || f4Var.I0()) && z4), z4, context, c4Var, zArr);
                f4Var.q1 = y3Var2;
                ImageView imageView2 = f4Var.t0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                y3Var2.b = true;
                y3Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                y3 y3Var3 = (y3) this.b;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.c;
                Context context2 = (Context) this.d;
                i9 i9Var2 = (i9) this.e;
                c4 c4Var2 = (c4) this.f;
                f4 f4Var2 = y3Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i13 = -f4Var2.o1;
                    f4Var2.o1 = i13;
                    AndroidUtilities.shakeViewSpring(view, i13);
                    new qc(f4Var2.Z0, g6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        y3Var3.c = true;
                        y3 y3Var4 = f4Var2.q1;
                        if (y3Var4 != null) {
                            y3Var4.a();
                        }
                        androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(y3Var3, findActivity, i9Var2, c4Var2, 14);
                        i9 i9Var3 = ((z8) f4Var2.N1).d;
                        h9 h9Var = i9Var3.w0;
                        if (h9Var != null) {
                            z11 = h9Var.release(cVar);
                            i9Var3.w0 = null;
                        }
                        if (!z11) {
                            cVar.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                y3 y3Var5 = (y3) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                i9 i9Var4 = (i9) this.e;
                c4 c4Var3 = (c4) this.f;
                f4 f4Var3 = y3Var5.l;
                File h = f4Var3.L1.h();
                if (h == null || !h.exists()) {
                    f4Var3.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        y3Var5.c = true;
                        y3 y3Var6 = f4Var3.q1;
                        if (y3Var6 != null) {
                            y3Var6.a();
                        }
                        hg.j0 j0Var = new hg.j0(y3Var5, findActivity2, storyItem2, i9Var4, c4Var3, 15);
                        i9 i9Var5 = ((z8) f4Var3.N1).d;
                        h9 h9Var2 = i9Var5.w0;
                        if (h9Var2 != null) {
                            z12 = h9Var2.release(j0Var);
                            i9Var5.w0 = null;
                        }
                        if (!z12) {
                            j0Var.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.g7 g7Var = (org.telegram.ui.g7) this.b;
                org.telegram.ui.o7 o7Var = (org.telegram.ui.o7) this.c;
                org.telegram.ui.h7 h7Var = (org.telegram.ui.h7) this.d;
                sl0 sl0Var = (sl0) this.e;
                org.telegram.ui.u7.a(g7Var.d, o7Var, (org.telegram.ui.q7) h7Var, sl0Var);
                org.telegram.ui.ActionBar.p1 p1Var = g7Var.a;
                if (p1Var != null) {
                    p1Var.d(true);
                    break;
                }
                break;
            case 5:
                new org.telegram.ui.d9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.g6) this.e, (org.telegram.ui.ActionBar.h3) this.f).show();
                break;
            case 6:
                xn xnVar = (xn) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(xnVar.getParentActivity(), null);
                Drawable mutate = xnVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(xnVar.getParentActivity(), true, true);
                g1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                g1Var.setOnClickListener(new b0(xnVar, str, str2, charSequence, r12, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new yt0(p1Var2, 27)};
                p1Var2.e = true;
                p1Var2.c = 220;
                p1Var2.setOutsideTouchable(true);
                p1Var2.setClippingEnabled(true);
                p1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                p1Var2.setFocusable(true);
                p1Var2.showAsDropDown(h0Var, (h0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 7:
                xn xnVar2 = (xn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                v31.J(xnVar2.getParentActivity(), xnVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.e;
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
                        if (p2Var instanceof jd1) {
                            org.telegram.ui.ActionBar.k6.o();
                            p2Var.finishFragment();
                        }
                        if (i6Var != null) {
                            j6Var.u(i6Var.a);
                            org.telegram.ui.ActionBar.k6.n1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.p0(editTextBoldCursor, d2Var, p2Var, z11 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.z4.e0(editTextBoldCursor, d2Var, p2Var);
                            break;
                        }
                    }
                }
                break;
            case 9:
                AtomicReference atomicReference = (AtomicReference) this.b;
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) this.c;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.p1) atomicReference.getAndSet(null)).dismiss();
                }
                if (g9Var.b >= 0) {
                    if (f5Var.getFragmentStack() != null && g9Var.b < f5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) f5Var.getFragmentStack().get(g9Var.b);
                        if (p2Var3 instanceof xn) {
                            xn xnVar3 = (xn) p2Var3;
                            l11 = Long.valueOf(xnVar3.a());
                            l10 = Long.valueOf(xnVar3.b());
                        } else if (p2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) p2Var3;
                            l11 = Long.valueOf(profileActivity.a());
                            l10 = Long.valueOf(profileActivity.d1);
                        }
                        if ((l11 == null && l11.longValue() != g9Var.f) || !(tL_forumTopic == null || l10 == null || tL_forumTopic.id == l10.longValue())) {
                            for (int size = f5Var.getFragmentStack().size() - 2; size > g9Var.b; size--) {
                                ((ActionBarLayout) f5Var).Y(size);
                            }
                        } else if (f5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(f5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i14 = g9Var.b;
                                if (size2 > i14) {
                                    ((org.telegram.ui.ActionBar.p2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i14 < f5Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) f5Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l10 = null;
                    l11 = null;
                    if (l11 == null) {
                    }
                    if (f5Var.getFragmentStack() != null) {
                    }
                }
                Class cls = g9Var.a;
                if (cls == xn.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat2 = g9Var.c;
                    if (chat2 != null) {
                        bundle.putLong("chat_id", chat2.id);
                    } else {
                        TLRPC.User user2 = g9Var.d;
                        if (user2 != null) {
                            bundle.putLong("user_id", user2.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", g9Var.g);
                    bundle.putInt("dialog_filter_id", g9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = g9Var.e;
                    if (tL_forumTopic2 != null) {
                        p2Var2.presentFragment(bg.e.g(p2Var2, g9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        p2Var2.presentFragment(new xn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", g9Var.f);
                    p2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (g9Var.a == sf1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", g9Var.c.id);
                    p2Var2.presentFragment(new sf1(bundle3), true);
                }
                if (g9Var.a == py.class) {
                    p2Var2.presentFragment(new py(null), true);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.p1 p1Var3 = (org.telegram.ui.ActionBar.p1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) this.e;
                org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                p1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    dy0.a(tL_messages_stickerSet, p2Var4, g6Var3);
                    break;
                } else {
                    ((xn) p2Var4).Y9();
                    qt.q().T = tL_messages_stickerSet;
                    break;
                }
            case 11:
                wk wkVar = (wk) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.p1 p1Var4 = (org.telegram.ui.ActionBar.p1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet Y = t31.Y();
                    Y.add(lowerCase);
                    if (Y.size() == 1 && Y.contains(currentLocaleInfo.pluralLangCode)) {
                        t31.a0(null, Boolean.FALSE);
                    } else {
                        t31.a0(Y, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(wkVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(wkVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr = v31.O;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                qc.a0(wkVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new nq0(wkVar, 24)).j();
                p1Var4.d(true);
                break;
            case 12:
                mt mtVar = (mt) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                qb1 qb1Var = (qb1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                qt qtVar = mtVar.a;
                if (qtVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = qtVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            qb1Var.requestLayout();
                            linearLayout.requestLayout();
                            qb1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            ot otVar = qtVar.l;
                            if (otVar != null) {
                                otVar.u(tL_messages_stickerSet2.set, TextUtils.join("", qtVar.o));
                            }
                            qtVar.p();
                            break;
                        }
                    } else {
                        if (qtVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                qtVar.l.O(TextUtils.join("", qtVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (qtVar.l.A()) {
                                    qtVar.l.m(TextUtils.join("", qtVar.o));
                                } else {
                                    qtVar.l.x(TextUtils.join("", qtVar.o));
                                }
                            }
                        }
                        qtVar.p();
                        break;
                    }
                }
                break;
            case 13:
                xf0 xf0Var = (xf0) this.b;
                p2.m mVar = (p2.m) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                qh.d dVar = xf0Var.b;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    org.telegram.ui.w3 w3Var = new org.telegram.ui.w3(xf0Var, i10);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new f1.a(xf0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new b30(xf0Var, mVar, w3Var, tL_inputStorePaymentAuthCode, 13)));
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                wk0 wk0Var = (wk0) this.e;
                q70 F = q70.F(h3Var2.container, h3Var2.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList4.get(i15);
                    i15++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new im(wk0Var, intValue3, 18));
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
                qh.d dVar2 = (qh.d) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String[] strArr2 = (String[]) this.e;
                org.telegram.ui.ActionBar.h3 h3Var3 = (org.telegram.ui.ActionBar.h3) this.f;
                if (dVar2.T) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        callback.run(strArr2[0]);
                    }
                    h3Var3.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b0(org.telegram.ui.ActionBar.h3 h3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, wk0 wk0Var) {
        this.a = 14;
        this.f = h3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = wk0Var;
    }
}
