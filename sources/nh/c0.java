package nh;

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
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.nq0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a30;
import org.telegram.ui.cd1;
import org.telegram.ui.jb1;
import org.telegram.ui.kf1;
import org.telegram.ui.lt;
import org.telegram.ui.n31;
import org.telegram.ui.nt;
import org.telegram.ui.oy;
import org.telegram.ui.pt;
import org.telegram.ui.rt0;
import org.telegram.ui.uk0;
import org.telegram.ui.vq0;
import org.telegram.ui.wf0;
import org.telegram.ui.wk;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
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
                a0 a0Var = (a0) this.e;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f;
                a0Var.run(Boolean.valueOf(z1Var.b()), Boolean.valueOf(z1Var2.b()), Boolean.valueOf(z1Var3.b()));
                g3Var.dismiss();
                break;
            case 1:
                d4 d4Var = (d4) this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                i9 i9Var = (i9) this.d;
                Context context = (Context) this.e;
                a4 a4Var = (a4) this.f;
                b4 b4Var = d4Var.L1;
                ((z8) d4Var.N1).g(true);
                d4Var.p1 = null;
                boolean[] zArr = {false};
                if (d4Var.z1) {
                    t6 storiesController = MessagesController.getInstance(d4Var.z2).getStoriesController();
                    j10 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(d4Var.z2).getStoriesController().R();
                    ph.t0 t0Var = MessagesController.getInstance(d4Var.z2).getStoriesController().w;
                    if (!t0Var.c && !t0Var.d) {
                        t0Var.d = true;
                        ph.q0 q0Var = new ph.q0(t0Var, i11);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(t0Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new vq0(messagesStorage, z11, q0Var, i10));
                    }
                } else {
                    j10 = 0;
                }
                if (!d4Var.z1) {
                    t6 storiesController2 = MessagesController.getInstance(d4Var.z2).getStoriesController();
                    TL_stories.StoryItem storyItem = b4Var.a;
                    int i12 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i12).getClientUserId() || ((storyItem.dialogId <= j10 || (user = MessagesController.getInstance(i12).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j10 || (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z10 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z10 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z4 = false;
                        w3 w3Var = new w3(d4Var, d4Var.getContext(), f6Var, f6Var, i9Var, b4Var.e, !d4Var.z1 || ((d4Var.A1 || d4Var.I0()) && z4), z4, context, a4Var, zArr);
                        d4Var.q1 = w3Var;
                        ImageView imageView = d4Var.t0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        w3Var.b = true;
                        w3Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z4 = true;
                w3 w3Var2 = new w3(d4Var, d4Var.getContext(), f6Var, f6Var, i9Var, b4Var.e, !d4Var.z1 || ((d4Var.A1 || d4Var.I0()) && z4), z4, context, a4Var, zArr);
                d4Var.q1 = w3Var2;
                ImageView imageView2 = d4Var.t0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                w3Var2.b = true;
                w3Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                w3 w3Var3 = (w3) this.b;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.c;
                Context context2 = (Context) this.d;
                i9 i9Var2 = (i9) this.e;
                a4 a4Var2 = (a4) this.f;
                d4 d4Var2 = w3Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i13 = -d4Var2.o1;
                    d4Var2.o1 = i13;
                    AndroidUtilities.shakeViewSpring(view, i13);
                    new qc(d4Var2.Z0, f6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        w3Var3.c = true;
                        w3 w3Var4 = d4Var2.q1;
                        if (w3Var4 != null) {
                            w3Var4.a();
                        }
                        androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(w3Var3, findActivity, i9Var2, a4Var2, 13);
                        i9 i9Var3 = ((z8) d4Var2.N1).d;
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
                w3 w3Var5 = (w3) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                i9 i9Var4 = (i9) this.e;
                a4 a4Var3 = (a4) this.f;
                d4 d4Var3 = w3Var5.l;
                File h = d4Var3.L1.h();
                if (h == null || !h.exists()) {
                    d4Var3.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        w3Var5.c = true;
                        w3 w3Var6 = d4Var3.q1;
                        if (w3Var6 != null) {
                            w3Var6.a();
                        }
                        gg.j0 j0Var = new gg.j0(w3Var5, findActivity2, storyItem2, i9Var4, a4Var3, 15);
                        i9 i9Var5 = ((z8) d4Var3.N1).d;
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
                new org.telegram.ui.d9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.f6) this.e, (org.telegram.ui.ActionBar.g3) this.f).show();
                break;
            case 6:
                xn xnVar = (xn) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(xnVar.getParentActivity(), null);
                Drawable mutate = xnVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(xnVar.getParentActivity(), true, true);
                g1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                g1Var.setOnClickListener(new c0(xnVar, str, str2, charSequence, r12, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new rt0(p1Var2, 27)};
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
                        if (p2Var instanceof cd1) {
                            org.telegram.ui.ActionBar.j6.o();
                            p2Var.finishFragment();
                        }
                        if (h6Var != null) {
                            i6Var.u(h6Var.a);
                            org.telegram.ui.ActionBar.j6.n1(false, false);
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
                org.telegram.ui.ActionBar.e5 e5Var = (org.telegram.ui.ActionBar.e5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.p1) atomicReference.getAndSet(null)).dismiss();
                }
                if (g9Var.b >= 0) {
                    if (e5Var.getFragmentStack() != null && g9Var.b < e5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) e5Var.getFragmentStack().get(g9Var.b);
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
                            for (int size = e5Var.getFragmentStack().size() - 2; size > g9Var.b; size--) {
                                ((ActionBarLayout) e5Var).Y(size);
                            }
                        } else if (e5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(e5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i14 = g9Var.b;
                                if (size2 > i14) {
                                    ((org.telegram.ui.ActionBar.p2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i14 < e5Var.getFragmentStack().size()) {
                                    ((ActionBarLayout) e5Var).l(true, false);
                                    break;
                                }
                            }
                        }
                    }
                    l10 = null;
                    l11 = null;
                    if (l11 == null) {
                    }
                    if (e5Var.getFragmentStack() != null) {
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
                        p2Var2.presentFragment(ag.f.g(p2Var2, g9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        p2Var2.presentFragment(new xn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", g9Var.f);
                    p2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (g9Var.a == kf1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", g9Var.c.id);
                    p2Var2.presentFragment(new kf1(bundle3), true);
                }
                if (g9Var.a == oy.class) {
                    p2Var2.presentFragment(new oy(null), true);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.p1 p1Var3 = (org.telegram.ui.ActionBar.p1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) this.e;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                p1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    dy0.a(tL_messages_stickerSet, p2Var4, f6Var3);
                    break;
                } else {
                    ((xn) p2Var4).Y9();
                    pt.q().T = tL_messages_stickerSet;
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
                    HashSet Y = n31.Y();
                    Y.add(lowerCase);
                    if (Y.size() == 1 && Y.contains(currentLocaleInfo.pluralLangCode)) {
                        n31.a0(null, Boolean.FALSE);
                    } else {
                        n31.a0(Y, Boolean.FALSE);
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
                lt ltVar = (lt) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                jb1 jb1Var = (jb1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                pt ptVar = ltVar.a;
                if (ptVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ptVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            jb1Var.requestLayout();
                            linearLayout.requestLayout();
                            jb1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            nt ntVar = ptVar.l;
                            if (ntVar != null) {
                                ntVar.v(tL_messages_stickerSet2.set, TextUtils.join("", ptVar.o));
                            }
                            ptVar.p();
                            break;
                        }
                    } else {
                        if (ptVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                ptVar.l.O(TextUtils.join("", ptVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (ptVar.l.B()) {
                                    ptVar.l.n(TextUtils.join("", ptVar.o));
                                } else {
                                    ptVar.l.y(TextUtils.join("", ptVar.o));
                                }
                            }
                        }
                        ptVar.p();
                        break;
                    }
                }
                break;
            case 13:
                wf0 wf0Var = (wf0) this.b;
                p2.n nVar = (p2.n) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                ph.d dVar = wf0Var.b;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    org.telegram.ui.w3 w3Var7 = new org.telegram.ui.w3(wf0Var, i10);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new f1.a(wf0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new a30(wf0Var, nVar, w3Var7, tL_inputStorePaymentAuthCode, 13)));
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                uk0 uk0Var = (uk0) this.e;
                o70 F = o70.F(g3Var2.container, g3Var2.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList4.get(i15);
                    i15++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new hm(uk0Var, intValue3, 18));
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
                ph.d dVar2 = (ph.d) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String[] strArr2 = (String[]) this.e;
                org.telegram.ui.ActionBar.g3 g3Var3 = (org.telegram.ui.ActionBar.g3) this.f;
                if (dVar2.T) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        callback.run(strArr2[0]);
                    }
                    g3Var3.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c0(org.telegram.ui.ActionBar.g3 g3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, uk0 uk0Var) {
        this.a = 14;
        this.f = g3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = uk0Var;
    }
}
