package ci;

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
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.at;
import org.telegram.ui.ct;
import org.telegram.ui.cy;
import org.telegram.ui.et;
import org.telegram.ui.kc1;
import org.telegram.ui.mf0;
import org.telegram.ui.qk0;
import org.telegram.ui.qn;
import org.telegram.ui.r21;
import org.telegram.ui.re1;
import org.telegram.ui.rk;
import org.telegram.ui.sa1;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
        int i10 = 3;
        SpannableStringBuilder spannableStringBuilder = null;
        boolean z12 = false;
        boolean z13 = false;
        int i11 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.b;
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.c;
                org.telegram.ui.Cells.a2 a2Var3 = (org.telegram.ui.Cells.a2) this.d;
                c0 c0Var = (c0) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                c0Var.run(Boolean.valueOf(a2Var.b()), Boolean.valueOf(a2Var2.b()), Boolean.valueOf(a2Var3.b()));
                f3Var.dismiss();
                break;
            case 1:
                q4 q4Var = (q4) this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                aa aaVar = (aa) this.d;
                Context context = (Context) this.e;
                n4 n4Var = (n4) this.f;
                o4 o4Var = q4Var.O1;
                ((r9) q4Var.Q1).g(true);
                q4Var.s1 = null;
                boolean[] zArr = {false};
                if (q4Var.C1) {
                    i7 storiesController = MessagesController.getInstance(q4Var.C2).getStoriesController();
                    j10 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(q4Var.C2).getStoriesController().R();
                    ei.a1 a1Var = MessagesController.getInstance(q4Var.C2).getStoriesController().w;
                    if (!a1Var.c && !a1Var.d) {
                        a1Var.d = true;
                        ei.x0 x0Var = new ei.x0(a1Var, i11);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var.a);
                        messagesStorage.getStorageQueue().postRunnable(new ai.y7(messagesStorage, z12, x0Var, i10));
                    }
                } else {
                    j10 = 0;
                }
                if (!q4Var.C1) {
                    i7 storiesController2 = MessagesController.getInstance(q4Var.C2).getStoriesController();
                    TL_stories.StoryItem storyItem = o4Var.a;
                    int i12 = storiesController2.a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i12).getClientUserId() || ((storyItem.dialogId <= j10 || (user = MessagesController.getInstance(i12).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j10 || (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && ((!(z11 = storyItem.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                        h4 h4Var = new h4(q4Var, q4Var.getContext(), d6Var, d6Var, aaVar, o4Var.e, !q4Var.C1 || ((q4Var.D1 || q4Var.I0()) && z10), z10, context, n4Var, zArr);
                        q4Var.t1 = h4Var;
                        ImageView imageView = q4Var.w0;
                        int dp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                        h4Var.b = true;
                        h4Var.a.showAsDropDown(imageView, 0, dp);
                        break;
                    }
                }
                z10 = true;
                h4 h4Var2 = new h4(q4Var, q4Var.getContext(), d6Var, d6Var, aaVar, o4Var.e, !q4Var.C1 || ((q4Var.D1 || q4Var.I0()) && z10), z10, context, n4Var, zArr);
                q4Var.t1 = h4Var2;
                ImageView imageView2 = q4Var.w0;
                int dp2 = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                h4Var2.b = true;
                h4Var2.a.showAsDropDown(imageView2, 0, dp2);
                break;
            case 2:
                h4 h4Var3 = (h4) this.b;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.c;
                Context context2 = (Context) this.d;
                aa aaVar2 = (aa) this.e;
                n4 n4Var2 = (n4) this.f;
                q4 q4Var2 = h4Var3.l;
                if (view.getAlpha() < 1.0f) {
                    int i13 = -q4Var2.r1;
                    q4Var2.r1 = i13;
                    AndroidUtilities.shakeViewSpring(view, i13);
                    new xc(q4Var2.c1, d6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(context2);
                    if (findActivity != null) {
                        h4Var3.c = true;
                        h4 h4Var4 = q4Var2.t1;
                        if (h4Var4 != null) {
                            h4Var4.a();
                        }
                        ai.y0 y0Var = new ai.y0(h4Var3, findActivity, aaVar2, n4Var2, 8);
                        aa aaVar3 = ((r9) q4Var2.Q1).d;
                        z9 z9Var = aaVar3.z0;
                        if (z9Var != null) {
                            z12 = z9Var.release(y0Var);
                            aaVar3.z0 = null;
                        }
                        if (!z12) {
                            y0Var.run();
                            break;
                        }
                    }
                }
                break;
            case 3:
                h4 h4Var5 = (h4) this.b;
                Context context3 = (Context) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                aa aaVar4 = (aa) this.e;
                n4 n4Var3 = (n4) this.f;
                q4 q4Var3 = h4Var5.l;
                File h = q4Var3.O1.h();
                if (h == null || !h.exists()) {
                    q4Var3.a1();
                    break;
                } else {
                    Activity findActivity2 = AndroidUtilities.findActivity(context3);
                    if (findActivity2 != null) {
                        h4Var5.c = true;
                        h4 h4Var6 = q4Var3.t1;
                        if (h4Var6 != null) {
                            h4Var6.a();
                        }
                        ai.t0 t0Var = new ai.t0(h4Var5, findActivity2, storyItem2, aaVar4, n4Var3, 10);
                        aa aaVar5 = ((r9) q4Var3.Q1).d;
                        z9 z9Var2 = aaVar5.z0;
                        if (z9Var2 != null) {
                            z13 = z9Var2.release(t0Var);
                            aaVar5.z0 = null;
                        }
                        if (!z13) {
                            t0Var.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
                ei.d dVar = (ei.d) this.b;
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
                org.telegram.ui.h7 h7Var = (org.telegram.ui.h7) this.b;
                org.telegram.ui.p7 p7Var = (org.telegram.ui.p7) this.c;
                org.telegram.ui.i7 i7Var = (org.telegram.ui.i7) this.d;
                jm0 jm0Var = (jm0) this.e;
                org.telegram.ui.v7.a(h7Var.d, p7Var, (org.telegram.ui.r7) i7Var, jm0Var);
                org.telegram.ui.ActionBar.m1 m1Var = h7Var.a;
                if (m1Var != null) {
                    m1Var.d(true);
                    break;
                }
                break;
            case 6:
                new org.telegram.ui.e9((Context) this.b, (String) this.c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.d6) this.e, (org.telegram.ui.ActionBar.f3) this.f).show();
                break;
            case 7:
                qn qnVar = (qn) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(qnVar.getParentActivity(), null);
                Drawable mutate = qnVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(qnVar.getParentActivity(), true, true);
                e1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                e1Var.setOnClickListener(new e0(qnVar, str, str2, charSequence, r12, 8));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new st0(m1Var2, 28)};
                m1Var2.e = true;
                m1Var2.c = 220;
                m1Var2.setOutsideTouchable(true);
                m1Var2.setClippingEnabled(true);
                m1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                m1Var2.setFocusable(true);
                m1Var2.showAsDropDown(h0Var, (h0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 8:
                qn qnVar2 = (qn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.e;
                Runnable[] runnableArr2 = (Runnable[]) this.f;
                t41.L(qnVar2.getParentActivity(), qnVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
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
                        if (n2Var instanceof kc1) {
                            org.telegram.ui.ActionBar.h6.o();
                            n2Var.finishFragment();
                        }
                        if (f6Var != null) {
                            g6Var.u(f6Var.a);
                            org.telegram.ui.ActionBar.h6.o1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.p0(editTextBoldCursor, b2Var, n2Var, z12 ? 1 : 0));
                            break;
                        } else {
                            org.telegram.ui.Components.f5.d0(editTextBoldCursor, b2Var, n2Var);
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
                    ((org.telegram.ui.ActionBar.m1) atomicReference.getAndSet(null)).dismiss();
                }
                if (n9Var.b >= 0) {
                    if (d5Var.getFragmentStack() != null && n9Var.b < d5Var.getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) d5Var.getFragmentStack().get(n9Var.b);
                        if (n2Var3 instanceof qn) {
                            qn qnVar3 = (qn) n2Var3;
                            l10 = Long.valueOf(qnVar3.a());
                            l4 = Long.valueOf(qnVar3.d());
                        } else if (n2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) n2Var3;
                            l10 = Long.valueOf(profileActivity.a());
                            l4 = Long.valueOf(profileActivity.h1);
                        }
                        if ((l10 == null && l10.longValue() != n9Var.f) || !(tL_forumTopic == null || l4 == null || tL_forumTopic.id == l4.longValue())) {
                            for (int size = d5Var.getFragmentStack().size() - 2; size > n9Var.b; size--) {
                                ((ActionBarLayout) d5Var).Y(size);
                            }
                        } else if (d5Var.getFragmentStack() != null) {
                            ArrayList arrayList = new ArrayList(d5Var.getFragmentStack());
                            int size2 = arrayList.size() - 2;
                            while (true) {
                                int i14 = n9Var.b;
                                if (size2 > i14) {
                                    ((org.telegram.ui.ActionBar.n2) arrayList.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i14 < d5Var.getFragmentStack().size()) {
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
                if (cls == qn.class) {
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
                        n2Var2.presentFragment(og.d.g(n2Var2, n9Var.c.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        n2Var2.presentFragment(new qn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", n9Var.f);
                    n2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (n9Var.a == re1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", n9Var.c.id);
                    n2Var2.presentFragment(new re1(bundle3), true);
                }
                if (n9Var.a == cy.class) {
                    n2Var2.presentFragment(new cy(null), true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.m1 m1Var3 = (org.telegram.ui.ActionBar.m1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) this.e;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.f;
                int intValue = ((Integer) view.getTag()).intValue();
                m1Var3.dismiss();
                if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                    vy0.a(tL_messages_stickerSet, n2Var4, d6Var3);
                    break;
                } else {
                    ((qn) n2Var4).da();
                    et.q().T = tL_messages_stickerSet;
                    break;
                }
            case 12:
                rk rkVar = (rk) this.b;
                String str5 = (String) this.c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.e;
                org.telegram.ui.ActionBar.m1 m1Var4 = (org.telegram.ui.ActionBar.m1) this.f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet Y = r21.Y();
                    Y.add(lowerCase);
                    if (Y.size() == 1 && Y.contains(currentLocaleInfo.pluralLangCode)) {
                        r21.a0(null, Boolean.FALSE);
                    } else {
                        r21.a0(Y, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(rkVar.b, true);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(rkVar.r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr2 = t41.R;
                if (replaceTags != null && replaceTags.length() > 0) {
                    replaceTags.replace(0, 1, (CharSequence) replaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = replaceTags;
                }
                xc.a0(rkVar.c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new hr0(rkVar, 24)).j();
                m1Var4.d(true);
                break;
            case 13:
                at atVar = (at) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                sa1 sa1Var = (sa1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f;
                et etVar = atVar.a;
                if (etVar.w != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(intValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = etVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            sa1Var.requestLayout();
                            linearLayout.requestLayout();
                            sa1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                            break;
                        } else {
                            ct ctVar = etVar.l;
                            if (ctVar != null) {
                                ctVar.w(tL_messages_stickerSet2.set, TextUtils.join("", etVar.o));
                            }
                            etVar.p();
                            break;
                        }
                    } else {
                        if (etVar.l != null) {
                            if (((Integer) arrayList3.get(intValue2)).intValue() == 1) {
                                etVar.l.O(TextUtils.join("", etVar.o));
                            } else if (((Integer) arrayList3.get(intValue2)).intValue() == 0) {
                                if (etVar.l.B()) {
                                    etVar.l.m(TextUtils.join("", etVar.o));
                                } else {
                                    etVar.l.z(TextUtils.join("", etVar.o));
                                }
                            }
                        }
                        etVar.p();
                        break;
                    }
                }
                break;
            case 14:
                mf0 mf0Var = (mf0) this.b;
                c5.p pVar = (c5.p) this.c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                ei.d dVar2 = mf0Var.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.v3 v3Var = new org.telegram.ui.v3(mf0Var, 10);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new ai.t7(mf0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new i90(mf0Var, pVar, v3Var, tL_inputStorePaymentAuthCode, 26)));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var3 = (org.telegram.ui.ActionBar.f3) this.f;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int[] iArr = (int[]) this.d;
                qk0 qk0Var = (qk0) this.e;
                i80 F = i80.F(f3Var3.container, f3Var3.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList4.get(i15);
                    i15++;
                    int intValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(intValue3).getCurrentUser() != null) {
                        F.e(intValue3, iArr[0] == intValue3, new org.telegram.ui.Components.e2(qk0Var, intValue3, 22));
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

    public /* synthetic */ e0(org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, qk0 qk0Var) {
        this.a = 15;
        this.f = f3Var;
        this.b = frameLayout;
        this.c = arrayList;
        this.d = iArr;
        this.e = qk0Var;
    }
}
