package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv0 implements org.telegram.ui.Components.d5, GenericProvider, org.telegram.ui.ActionBar.a2, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.bl0, org.telegram.ui.Components.cl0, sv0, MessagesStorage.BooleanCallback, o11, OnSuccessListener, pa.a, OnFailureListener, t5.b, s5.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kv0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                lv0 lv0Var = (lv0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                tv0 tv0Var = lv0Var.a;
                tv0Var.e0.a(tL_messageMediaToDo);
                tv0Var.finishFragment();
                break;
            default:
                lv0 lv0Var2 = (lv0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                tv0 tv0Var2 = lv0Var2.a;
                tv0Var2.e0.a(tL_messageMediaPoll);
                tv0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.sv0
    public void a(TLRPC.MessageMedia messageMedia) {
        de1 de1Var = (de1) this.b;
        xn xnVar = (xn) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = de1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        de1Var.G.messageOwner.media = messageMedia;
        xnVar.getSendMessagesHelper().editMessage(de1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override // s5.e
    public Object apply(Object obj) {
        s5.g gVar = (s5.g) this.b;
        l5.i iVar = (l5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.c) {
                int size = aVar.b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).a);
            if (i10 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new s5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            s5.b bVar = (s5.b) listIterator.next();
            long j10 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                com.google.firebase.messaging.n c10 = bVar.c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(fVar.a, fVar.b);
                }
                listIterator.set(new s5.b(j10, bVar.b, c10.g()));
            }
        }
        return d;
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.b, (Context) this.c, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        final yb1 yb1Var = (yb1) this.b;
        final ac1 ac1Var = (ac1) this.c;
        ThemeActivity themeActivity = yb1Var.e;
        if (i10 >= 0 && i10 < ac1Var.e.size()) {
            final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) ac1Var.e.get(i10);
            if (f6Var.a >= 100 && !f6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = f6Var.r;
                CharSequence[] charSequenceArr = {string, string2, (tL_theme == null || !tL_theme.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.sb1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        yb1 yb1Var2 = yb1.this;
                        ThemeActivity themeActivity2 = yb1Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        if (i11 == 0) {
                            org.telegram.ui.Components.e5.W(themeActivity2, i11 != 1 ? 1 : 2, f6Var2.b, f6Var2);
                            return;
                        }
                        if (i11 == 1) {
                            if (f6Var2.r == null) {
                                themeActivity2.getMessagesController().saveThemeToServer(f6Var2.b, f6Var2);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var2.b, f6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + f6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.hq0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i11 == 2) {
                            themeActivity2.presentFragment(new td1(f6Var2.b, f6Var2, false));
                            return;
                        }
                        if (i11 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.a;
                        b2Var.R = string3;
                        b2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                        alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new b7(yb1Var2, ac1Var, f6Var2, 22));
                        alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity2.showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                        }
                    }
                };
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.P = charSequenceArr;
                b2Var.Q = iArr;
                b2Var.M = onClickListener;
                themeActivity.showDialog(b2Var);
                b2Var.l(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.c5 c5Var;
        switch (this.a) {
            case 3:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                privacyControlActivity.t0();
                sharedPreferences.edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) this.c;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new wb0(14, privacySettingsActivity, x8Var));
                break;
            case 5:
                ProfileActivity.c0((ProfileActivity) this.b, (org.telegram.ui.Cells.z1[]) this.c);
                break;
            case 6:
                a01 a01Var = (a01) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                a01Var.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                ProfileActivity profileActivity = a01Var.b;
                profileActivity.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    break;
                }
                break;
            case 7:
            case 8:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 20:
            default:
                rg.j0.Q((rg.j0) this.b, (ArrayList) this.c);
                break;
            case 9:
                j71 j71Var = (j71) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    j71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    b7 b7Var = new b7(j71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.b0 = b7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 10:
                za1.m((za1) this.b, (ry) this.c);
                break;
            case 11:
                ThemeActivity.X((ThemeActivity) this.b, (by0) this.c);
                break;
            case 14:
                yb1 yb1Var = (yb1) this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                yb1Var.getClass();
                MessagesController.getInstance(g6Var.E).saveTheme(g6Var, null, g6Var == org.telegram.ui.ActionBar.h6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.h6.H;
                if (g6Var.b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.h6.I == g6Var) {
                        org.telegram.ui.ActionBar.h6.t(org.telegram.ui.ActionBar.h6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g6Var == org.telegram.ui.ActionBar.h6.J) {
                        org.telegram.ui.ActionBar.h6.J = (org.telegram.ui.ActionBar.g6) hashMap.get("Dark Blue");
                    }
                    g6Var.t();
                    org.telegram.ui.ActionBar.h6.G.remove(g6Var);
                    hashMap.remove(g6Var.a);
                    org.telegram.ui.ActionBar.a6 a6Var = g6Var.i0;
                    if (a6Var != null) {
                        org.telegram.ui.ActionBar.a6.a(a6Var);
                    }
                    org.telegram.ui.ActionBar.h6.F.remove(g6Var);
                    new File(g6Var.b).delete();
                    org.telegram.ui.ActionBar.h6.s1(true, false);
                }
                if (z10) {
                    c5Var = ((org.telegram.ui.ActionBar.n2) yb1Var.e).parentLayout;
                    ((ActionBarLayout) c5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                break;
            case 18:
                zg1.W((zg1) this.b, (byte[]) this.c);
                break;
            case 19:
                mi1 mi1Var = (mi1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                mi1Var.getClass();
                zArr2[0] = true;
                mi1Var.p0 = 17;
                Intent intent = new Intent(mi1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", mi1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", mi1Var.a);
                try {
                    mi1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 21:
                org.telegram.ui.web.o.Y((org.telegram.ui.web.o) this.b, (HashSet) this.c);
                break;
            case 22:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(b1Var.M).getInputUser(b1Var.U);
                ConnectionsManager.getInstance(b1Var.M).sendRequest(allowsendmessage, new ai.s5(b1Var, strArr, b2Var, 15));
                break;
            case 23:
                boolean[] zArr3 = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
        }
    }

    @Override // pa.a
    public void g(pa.b bVar) {
        pa.a aVar = (pa.a) this.b;
        pa.a aVar2 = (pa.a) this.c;
        aVar.g(bVar);
        aVar2.g(bVar);
    }

    @Override // t5.b
    public Object i() {
        switch (this.a) {
            case 26:
                da.b bVar = (da.b) this.b;
                Iterable iterable = (Iterable) this.c;
                s5.g gVar = (s5.g) ((s5.d) bVar.c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    break;
                }
                break;
            default:
                da.b bVar2 = (da.b) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((s5.g) ((s5.c) bVar2.i)).e(((Integer) entry.getValue()).intValue(), o5.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        qg.a2 a2Var = (qg.a2) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        a2Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && a2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new p2.b(6, a2Var, bitmap), 2000L);
        } else {
            a2Var.C0 = true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        cf.c cVar = (cf.c) this.b;
        ci.d dVar = (ci.d) this.c;
        FileLog.d("wear-auth: /token delivered to " + ((String) cVar.d));
        dVar.setLoading(false);
        dj1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = dj1.c;
        if (f3Var != null) {
            f3Var.dismiss();
            dj1.c = null;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        bx0 bx0Var = (bx0) this.b;
        ax0 ax0Var = (ax0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = bx0Var.d.n;
        premiumPreviewFragment.n0.d(0, 0.0f, 0, ax0Var.getMeasuredWidth(), -ax0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.n0.f;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        gf1 gf1Var = (gf1) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        wf1 wf1Var = gf1Var.b;
        NotificationCenter notificationCenter = wf1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(wf1Var, i10);
        wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        wf1Var.finishFragment();
        wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z10));
    }

    @Override // org.telegram.ui.o11
    public void v(nk0 nk0Var) {
        zf1 zf1Var = (zf1) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        cg1 cg1Var = zf1Var.a;
        cg1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        cg1Var.V();
    }

    public /* synthetic */ kv0(lv0 lv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 1;
        this.b = lv0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                    if (Emoji.getEmojiDrawable(fixEmoji) != null) {
                        linkedHashSet.add(fixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // org.telegram.ui.o11
    public /* synthetic */ void c0() {
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
