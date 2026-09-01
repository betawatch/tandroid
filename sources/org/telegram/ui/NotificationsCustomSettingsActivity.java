package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final int[] B;
    public final int[] C;
    public boolean D;
    public final ArrayList E;
    public final ArrayList F;
    public org.telegram.ui.Components.tl0 a;
    public int addExceptionRow;
    public gk0 b;
    public org.telegram.ui.Components.oz c;
    public ik0 d;
    public int deleteExceptionsRow;
    public AnimatorSet e;
    public boolean f;
    public boolean h;
    public int importantRow;
    public int lightColorRow;
    public int messagesRow;
    public Boolean n;
    public int newRow;
    public int popupRow;
    public int previewRow;
    public int priorityRow;
    public boolean r;
    public final int s;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    public int storiesRow;
    public ArrayList v;
    public int vibrateRow;
    public ArrayList w;
    public final HashMap x;
    public final int[] y;

    public NotificationsCustomSettingsActivity(int i10, ArrayList arrayList, ArrayList arrayList2, boolean z4) {
        super(null);
        this.h = true;
        this.x = new HashMap();
        this.y = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.B = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i11 = R.string.NotificationsPriorityHigh;
        int i12 = R.string.NotificationsPriorityUrgent;
        int i13 = R.string.NotificationsPriorityMedium;
        this.C = new int[]{i11, i12, i12, i13, R.string.NotificationsPriorityLow, i13};
        this.newRow = -1;
        this.showRow = -1;
        this.importantRow = -1;
        this.messagesRow = -1;
        this.storiesRow = -1;
        this.previewRow = -1;
        this.showSenderRow = -1;
        this.soundRow = -1;
        this.addExceptionRow = -1;
        this.deleteExceptionsRow = -1;
        this.lightColorRow = -1;
        this.vibrateRow = -1;
        this.popupRow = -1;
        this.priorityRow = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.s = i10;
        this.v = arrayList2;
        this.w = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                lk0 lk0Var = (lk0) this.w.get(i14);
                this.x.put(Long.valueOf(lk0Var.d), lk0Var);
            }
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                lk0 lk0Var2 = (lk0) this.v.get(i15);
                this.x.put(Long.valueOf(lk0Var2.d), lk0Var2);
            }
        }
        if (z4) {
            j0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context, View view, int i10, float f10, float f11) {
        HashMap hashMap;
        lk0 lk0Var;
        ArrayList arrayList;
        boolean z4;
        boolean z10;
        boolean z11;
        int i11;
        String[] strArr;
        Drawable drawable;
        boolean z12;
        boolean z13;
        lk0 lk0Var2;
        boolean z14;
        lk0 lk0Var3;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
        ArrayList arrayList2 = notificationsCustomSettingsActivity2.F;
        HashMap hashMap2 = notificationsCustomSettingsActivity2.x;
        int i12 = notificationsCustomSettingsActivity2.s;
        if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
            return;
        }
        fk0 fk0Var = (notificationsCustomSettingsActivity2.a.getAdapter() != notificationsCustomSettingsActivity2.b || i10 < 0 || i10 >= arrayList2.size()) ? null : (fk0) arrayList2.get(i10);
        if (fk0Var != null && fk0Var.a == 8) {
            notificationsCustomSettingsActivity2.D = !notificationsCustomSettingsActivity2.D;
            notificationsCustomSettingsActivity2.l0(true);
            return;
        }
        if (i12 != 3 || fk0Var == null) {
            hashMap = hashMap2;
        } else {
            hashMap = hashMap2;
            lk0 lk0Var4 = fk0Var.g;
            if (lk0Var4 != null) {
                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(notificationsCustomSettingsActivity2, view);
                H.i = 3;
                H.m(lk0Var4.c <= 0 || lk0Var4.f, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute), false, new yj0(notificationsCustomSettingsActivity2, lk0Var4, view, i10, 5));
                H.m(lk0Var4.c > 0 || lk0Var4.f, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute), false, new yj0(notificationsCustomSettingsActivity, lk0Var4, view, i10, 0));
                H.m(!lk0Var4.f, R.drawable.msg_delete, LocaleController.getString("DeleteException", R.string.DeleteException), true, new yj0(notificationsCustomSettingsActivity, lk0Var4, view, i10, 1));
                H.W(notificationsCustomSettingsActivity.a.V0(view, false));
                H.Z();
                return;
            }
        }
        if (i12 == 3) {
            f2.p0 adapter = notificationsCustomSettingsActivity2.a.getAdapter();
            ik0 ik0Var = notificationsCustomSettingsActivity2.d;
            if (adapter == ik0Var) {
                Object E = ik0Var.E(i10);
                if (E instanceof lk0) {
                    lk0Var3 = (lk0) E;
                } else {
                    boolean z15 = E instanceof TLRPC.User;
                    long j10 = z15 ? ((TLRPC.User) E).id : -((TLRPC.Chat) E).id;
                    if (!hashMap.containsKey(Long.valueOf(j10))) {
                        lk0 lk0Var5 = new lk0();
                        lk0Var5.e = true;
                        lk0Var5.d = j10;
                        if (z15) {
                            lk0Var5.d = ((TLRPC.User) E).id;
                        } else {
                            lk0Var5.d = -((TLRPC.Chat) E).id;
                        }
                        lk0Var2 = lk0Var5;
                        z14 = true;
                        if (lk0Var2 != null) {
                            return;
                        }
                        org.telegram.ui.Components.q70 H2 = org.telegram.ui.Components.q70.H(notificationsCustomSettingsActivity2, view);
                        H2.i = 3;
                        H2.m(lk0Var2.c <= 0 || lk0Var2.f, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute), false, new yj0(notificationsCustomSettingsActivity2, lk0Var2, view, z14, 2));
                        H2.m(lk0Var2.c > 0 || lk0Var2.f, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute), false, new yj0(notificationsCustomSettingsActivity, lk0Var2, view, z14, 3));
                        H2.m((z14 || lk0Var2.f) ? false : true, R.drawable.msg_delete, LocaleController.getString("DeleteException", R.string.DeleteException), true, new yj0(notificationsCustomSettingsActivity, lk0Var2, view, i10, 4));
                        H2.W(notificationsCustomSettingsActivity.a.V0(view, false));
                        H2.Z();
                        return;
                    }
                    lk0Var3 = (lk0) hashMap.get(Long.valueOf(j10));
                }
                lk0Var2 = lk0Var3;
                z14 = false;
                if (lk0Var2 != null) {
                }
            }
        }
        if (notificationsCustomSettingsActivity2.a.getAdapter() == notificationsCustomSettingsActivity2.d || !(fk0Var == null || fk0Var.g == null)) {
            f2.p0 adapter2 = notificationsCustomSettingsActivity2.a.getAdapter();
            ik0 ik0Var2 = notificationsCustomSettingsActivity2.d;
            if (adapter2 == ik0Var2) {
                Object E2 = ik0Var2.E(i10);
                if (E2 instanceof lk0) {
                    arrayList = notificationsCustomSettingsActivity2.d.d;
                    lk0Var = (lk0) E2;
                    z11 = false;
                } else {
                    boolean z16 = E2 instanceof TLRPC.User;
                    long j11 = z16 ? ((TLRPC.User) E2).id : -((TLRPC.Chat) E2).id;
                    if (hashMap.containsKey(Long.valueOf(j11))) {
                        lk0Var = (lk0) hashMap.get(Long.valueOf(j11));
                        z10 = false;
                    } else {
                        lk0 lk0Var6 = new lk0();
                        lk0Var6.d = j11;
                        if (z16) {
                            lk0Var6.d = ((TLRPC.User) E2).id;
                        } else {
                            lk0Var6.d = -((TLRPC.Chat) E2).id;
                        }
                        lk0Var = lk0Var6;
                        z10 = true;
                    }
                    arrayList = notificationsCustomSettingsActivity2.w;
                    z11 = z10;
                }
                z4 = z11;
            } else {
                lk0Var = fk0Var.g;
                if (lk0Var.f) {
                    return;
                }
                arrayList = notificationsCustomSettingsActivity2.w;
                z4 = false;
            }
            lk0 lk0Var7 = lk0Var;
            ArrayList arrayList3 = arrayList;
            if (lk0Var7 == null) {
                return;
            }
            long j12 = lk0Var7.d;
            org.telegram.ui.Components.no noVar = new org.telegram.ui.Components.no(context, notificationsCustomSettingsActivity2.currentAccount, null, true, new ck0(notificationsCustomSettingsActivity2, j12, NotificationsController.getInstance(notificationsCustomSettingsActivity2.currentAccount).isGlobalNotificationsEnabled(j12, false, false), lk0Var7, z4, i10, arrayList3), notificationsCustomSettingsActivity.getResourceProvider());
            noVar.d(j12, 0, null);
            noVar.c(notificationsCustomSettingsActivity, view, f10, f11, false);
            return;
        }
        if (fk0Var == null) {
            return;
        }
        int i13 = fk0Var.c;
        int i14 = 2;
        if (i13 == 6) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            if (i12 == 0) {
                bundle.putInt("dialogsType", 6);
            } else if (i12 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            py pyVar = new py(bundle);
            pyVar.z2 = new zj0(notificationsCustomSettingsActivity2);
            notificationsCustomSettingsActivity2.presentFragment(pyVar);
            return;
        }
        if (i13 == 7) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            String string = LocaleController.getString("NotificationsDeleteAllExceptionTitle", R.string.NotificationsDeleteAllExceptionTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = LocaleController.getString("NotificationsDeleteAllExceptionAlert", R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new zj0(notificationsCustomSettingsActivity2));
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            notificationsCustomSettingsActivity2.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                return;
            }
            return;
        }
        if (i13 == 100 || i13 == 101) {
            boolean isGlobalNotificationsEnabled = notificationsCustomSettingsActivity2.getNotificationsController().isGlobalNotificationsEnabled(i12);
            notificationsCustomSettingsActivity2.a.K(i10);
            final int i15 = notificationsCustomSettingsActivity2.s;
            if (i15 == 3) {
                SharedPreferences.Editor edit = notificationsCustomSettingsActivity2.getNotificationsSettings().edit();
                Boolean bool = notificationsCustomSettingsActivity2.n;
                boolean z17 = bool != null && bool.booleanValue();
                if (notificationsCustomSettingsActivity2.r && z17) {
                    edit.remove("EnableAllStories");
                    notificationsCustomSettingsActivity2.n = null;
                } else {
                    boolean z18 = !z17;
                    edit.putBoolean("EnableAllStories", z18);
                    notificationsCustomSettingsActivity2.n = Boolean.valueOf(z18);
                }
                edit.apply();
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i12);
                notificationsCustomSettingsActivity2.l0(true);
                boolean z19 = notificationsCustomSettingsActivity2.h;
                if (z19 != (notificationsCustomSettingsActivity2.n == null) && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z19;
                    notificationsCustomSettingsActivity2.l0(true);
                }
                notificationsCustomSettingsActivity2.d0();
                return;
            }
            if (!isGlobalNotificationsEnabled) {
                notificationsCustomSettingsActivity2.getNotificationsController().setGlobalNotificationsEnabled(i12, 0);
                notificationsCustomSettingsActivity2.l0(true);
                return;
            }
            final ArrayList arrayList4 = notificationsCustomSettingsActivity2.w;
            final ArrayList arrayList5 = notificationsCustomSettingsActivity2.v;
            int i16 = notificationsCustomSettingsActivity2.currentAccount;
            final ta taVar = new ta(notificationsCustomSettingsActivity2, i14);
            Pattern pattern = org.telegram.ui.Components.z4.a;
            if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
                return;
            }
            final boolean isGlobalNotificationsEnabled2 = NotificationsController.getInstance(i16).isGlobalNotificationsEnabled(0L, false, false);
            String[] strArr2 = {LocaleController.getString(R.string.NotificationsTurnOn), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0])), null, LocaleController.getString(R.string.NotificationsTurnOff)};
            int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
            LinearLayout linearLayout = new LinearLayout(notificationsCustomSettingsActivity2.getParentActivity());
            linearLayout.setOrientation(1);
            final AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            int i17 = 0;
            while (i17 < 5) {
                if (strArr2[i17] == null) {
                    i11 = i16;
                    strArr = strArr2;
                } else {
                    TextView textView2 = new TextView(notificationsCustomSettingsActivity2.getParentActivity());
                    Drawable drawable2 = notificationsCustomSettingsActivity2.getParentActivity().getResources().getDrawable(iArr[i17]);
                    if (i17 == 4) {
                        strArr = strArr2;
                        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, r12));
                        i11 = i16;
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, r12), PorterDuff.Mode.MULTIPLY));
                        drawable = null;
                        z12 = false;
                    } else {
                        i11 = i16;
                        strArr = strArr2;
                        drawable = null;
                        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.j5, r12));
                        z12 = false;
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J5, r12), PorterDuff.Mode.MULTIPLY));
                    }
                    textView2.setTextSize(1, 16.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, drawable, drawable);
                    textView2.setTag(Integer.valueOf(i17));
                    textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(z12));
                    textView2.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    textView2.setSingleLine(true);
                    textView2.setGravity(19);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(26.0f));
                    textView2.setText(strArr[i17]);
                    linearLayout.addView(textView2, k7.c6.q(-1, 48, 51));
                    final NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity2;
                    final int i18 = i11;
                    View.OnClickListener onClickListener = new View.OnClickListener(i18, isGlobalNotificationsEnabled2, i15, notificationsCustomSettingsActivity3, arrayList4, arrayList5, taVar, alertDialog$Builder2) { // from class: org.telegram.ui.Components.q2
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ NotificationsCustomSettingsActivity c;
                        public final /* synthetic */ ArrayList d;
                        public final /* synthetic */ ArrayList e;
                        public final /* synthetic */ org.telegram.ui.ta f;
                        public final /* synthetic */ AlertDialog$Builder h;

                        {
                            this.b = i15;
                            this.c = notificationsCustomSettingsActivity3;
                            this.d = arrayList4;
                            this.e = arrayList5;
                            this.f = taVar;
                            this.h = alertDialog$Builder2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i19;
                            int intValue = ((Integer) view2.getTag()).intValue();
                            int i20 = this.a;
                            int i21 = this.b;
                            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity4 = this.c;
                            int i22 = 3;
                            if (intValue == 0) {
                                NotificationsController.getInstance(i20).setGlobalNotificationsEnabled(i21, 0);
                            } else if (intValue == 3) {
                                notificationsCustomSettingsActivity4.presentFragment(new NotificationsCustomSettingsActivity(i21, this.d, this.e, false));
                            } else {
                                int currentTime = ConnectionsManager.getInstance(i20).getCurrentTime();
                                if (intValue == 1) {
                                    currentTime += 3600;
                                } else if (intValue == 2) {
                                    currentTime += 172800;
                                } else if (intValue == 4) {
                                    i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    NotificationsController.getInstance(i20).muteUntil(0L, 0, i19);
                                    NotificationsController.getInstance(i20).setGlobalNotificationsEnabled(i21, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                }
                                i19 = currentTime;
                                NotificationsController.getInstance(i20).muteUntil(0L, 0, i19);
                                NotificationsController.getInstance(i20).setGlobalNotificationsEnabled(i21, ConnectionsManager.DEFAULT_DATACENTER_ID);
                            }
                            this.f.run(intValue);
                            this.h.a.I0.run();
                            if (intValue == 0) {
                                i22 = 4;
                            } else if (intValue == 1) {
                                i22 = 0;
                            } else if (intValue == 2) {
                                i22 = 2;
                            } else if (intValue != 4) {
                                i22 = -1;
                            }
                            if (i22 < 0 || !qc.a(notificationsCustomSettingsActivity4)) {
                                return;
                            }
                            qc.z(notificationsCustomSettingsActivity4, i22, 0, null).j();
                        }
                    };
                    notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity3;
                    textView2.setOnClickListener(onClickListener);
                }
                i17++;
                strArr2 = strArr;
                i16 = i11;
                r12 = false;
            }
            String string2 = LocaleController.getString(R.string.Notifications);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.O = string2;
            alertDialog$Builder2.n(linearLayout);
            notificationsCustomSettingsActivity2.showDialog(d2Var2);
            return;
        }
        if (i13 == 3) {
            if (view.isEnabled()) {
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, i12);
                    notificationsCustomSettingsActivity2.presentFragment(new qk0(bundle2, notificationsCustomSettingsActivity2.getResourceProvider()));
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            }
            return;
        }
        if (fk0Var.a == 3) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.z4.u(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new ak0(notificationsCustomSettingsActivity2, view, i10, 0), null));
                return;
            }
            return;
        }
        if (i13 == 2) {
            if (view.isEnabled()) {
                Activity parentActivity = notificationsCustomSettingsActivity2.getParentActivity();
                ak0 ak0Var = new ak0(notificationsCustomSettingsActivity2, view, i10, 1);
                Pattern pattern2 = org.telegram.ui.Components.z4.a;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
                int[] iArr2 = new int[1];
                if (i12 == 1) {
                    iArr2[0] = notificationsSettings.getInt("popupAll", 0);
                } else if (i12 == 0) {
                    iArr2[0] = notificationsSettings.getInt("popupGroup", 0);
                } else {
                    iArr2[0] = notificationsSettings.getInt("popupChannel", 0);
                }
                String[] strArr3 = {LocaleController.getString(R.string.NoPopup), LocaleController.getString(R.string.OnlyWhenScreenOn), LocaleController.getString(R.string.OnlyWhenScreenOff), LocaleController.getString(R.string.AlwaysShowPopup)};
                LinearLayout h = l.d.h(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity);
                int i19 = 0;
                while (i19 < 4) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(parentActivity, null);
                    k6Var.setTag(Integer.valueOf(i19));
                    k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    k6Var.a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.g7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E5, false));
                    k6Var.b(strArr3[i19], iArr2[0] == i19);
                    h.addView(k6Var);
                    k6Var.setOnClickListener(new oh.o5(iArr2, i12, alertDialog$Builder3, ak0Var, 2));
                    i19++;
                }
                String string3 = LocaleController.getString(R.string.PopupNotification);
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                d2Var3.O = string3;
                alertDialog$Builder3.n(h);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Cancel), null);
                notificationsCustomSettingsActivity2.showDialog(d2Var3);
                return;
            }
            return;
        }
        if (i13 == 1) {
            if (view.isEnabled()) {
                String str = i12 == 1 ? "vibrate_messages" : i12 == 0 ? "vibrate_group" : i12 == 3 ? "vibrate_stories" : (i12 == 4 || i12 == 5) ? "vibrate_react" : "vibrate_channel";
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.z4.Y(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0L, str, new dt(notificationsCustomSettingsActivity2, view, str, i10, 4), null));
                return;
            }
            return;
        }
        if (i13 == 4) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.z4.I(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new ak0(notificationsCustomSettingsActivity2, view, i10, 2), null));
                return;
            }
            return;
        }
        if (i13 == 102) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings2 = notificationsCustomSettingsActivity2.getNotificationsSettings();
                if (notificationsSettings2.getBoolean("EnableAllStories", false)) {
                    return;
                }
                SharedPreferences.Editor edit2 = notificationsSettings2.edit();
                if (notificationsCustomSettingsActivity2.n != null) {
                    edit2.remove("EnableAllStories");
                    notificationsCustomSettingsActivity2.n = null;
                    notificationsCustomSettingsActivity2.r = true;
                    fk0Var.i = true;
                } else {
                    edit2.putBoolean("EnableAllStories", false);
                    notificationsCustomSettingsActivity2.n = Boolean.FALSE;
                    notificationsCustomSettingsActivity2.r = false;
                    fk0Var.i = false;
                }
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(notificationsCustomSettingsActivity2.r);
                }
                edit2.commit();
                boolean z20 = notificationsCustomSettingsActivity2.r;
                boolean z21 = notificationsCustomSettingsActivity2.h;
                if (z20 != z21 && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z21;
                    notificationsCustomSettingsActivity2.l0(true);
                }
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i12);
                notificationsCustomSettingsActivity2.d0();
                return;
            }
            return;
        }
        if (i13 == 0) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings3 = notificationsCustomSettingsActivity2.getNotificationsSettings();
                SharedPreferences.Editor edit3 = notificationsSettings3.edit();
                if (i12 == 1) {
                    z13 = notificationsSettings3.getBoolean("EnablePreviewAll", true);
                    edit3.putBoolean("EnablePreviewAll", !z13);
                } else if (i12 == 0) {
                    z13 = notificationsSettings3.getBoolean("EnablePreviewGroup", true);
                    edit3.putBoolean("EnablePreviewGroup", !z13);
                } else if (i12 == 3) {
                    z13 = !notificationsSettings3.getBoolean("EnableHideStoriesSenders", false);
                    edit3.putBoolean("EnableHideStoriesSenders", z13);
                } else if (i12 == 4 || i12 == 5) {
                    z13 = notificationsSettings3.getBoolean("EnableReactionsPreview", true);
                    edit3.putBoolean("EnableReactionsPreview", !z13);
                } else {
                    z13 = notificationsSettings3.getBoolean("EnablePreviewChannel", true);
                    edit3.putBoolean("EnablePreviewChannel", !z13);
                }
                edit3.commit();
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i12);
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(!z13);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 103 || i13 == 104) {
            boolean z22 = !LocaleController.isRTL ? f10 <= ((float) (view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) : f10 >= ((float) AndroidUtilities.dp(76.0f));
            SharedPreferences notificationsSettings4 = notificationsCustomSettingsActivity2.getNotificationsSettings();
            if (z22) {
                String str2 = fk0Var.c == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                SharedPreferences.Editor edit4 = notificationsSettings4.edit();
                edit4.putBoolean(str2, !notificationsSettings4.getBoolean(str2, true));
                edit4.apply();
                notificationsCustomSettingsActivity2.l0(true);
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i12);
                return;
            }
            String str3 = fk0Var.c == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
            LinearLayout f12 = org.telegram.messenger.y3.f(context, 1);
            boolean[] zArr = {notificationsSettings4.getBoolean(str3, false)};
            org.telegram.ui.Cells.k6[] k6VarArr = new org.telegram.ui.Cells.k6[2];
            int i20 = 0;
            while (i20 < 2) {
                org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, notificationsCustomSettingsActivity2.getResourceProvider());
                k6VarArr[i20] = k6Var2;
                k6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                k6VarArr[i20].a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.g7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E5, false));
                k6VarArr[i20].b(LocaleController.getString(i20 == 0 ? R.string.NotifyAboutReactionsFromEveryone : R.string.NotifyAboutReactionsFromContacts), i20 == 0 ? !zArr[0] : zArr[0]);
                k6VarArr[i20].setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false), 2, -1));
                f12.addView(k6VarArr[i20]);
                k6VarArr[i20].setOnClickListener(new eg.k2(zArr, i20, k6VarArr, 17));
                i20++;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity(), 0, notificationsCustomSettingsActivity2.resourceProvider);
            String string4 = LocaleController.getString(R.string.NotifyAboutReactionsFrom);
            org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
            d2Var4.O = string4;
            alertDialog$Builder4.n(f12);
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Save), new a1.d(notificationsCustomSettingsActivity2, notificationsSettings4, str3, zArr, 15));
            notificationsCustomSettingsActivity2.showDialog(d2Var4);
        }
    }

    public static void V(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lk0 lk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(lk0Var, view, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:89|(2:104|105)(2:91|(2:103|99)(1:93))|94|95|96|97|98|99) */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02a6, code lost:
    
        if (r11.deleted != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0386 A[LOOP:5: B:192:0x0384->B:193:0x0386, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x039f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList) {
        boolean z4;
        ArrayList<TLRPC.Chat> arrayList2;
        ArrayList<TLRPC.User> arrayList3;
        ArrayList<TLRPC.EncryptedChat> arrayList4;
        int size;
        int i10;
        int size2;
        int i11;
        int size3;
        int i12;
        int size4;
        int i13;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Long parseLong;
        long longValue;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList<TLRPC.User> arrayList9;
        ArrayList<TLRPC.EncryptedChat> arrayList10;
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList<Long> arrayList16 = new ArrayList<>();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList<TLRPC.User> arrayList19 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList20 = new ArrayList<>();
        ArrayList<TLRPC.EncryptedChat> arrayList21 = new ArrayList<>();
        long j10 = notificationsCustomSettingsActivity.getUserConfig().clientUserId;
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        Map<String, ?> all = notificationsSettings.getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            Iterator<Map.Entry<String, ?>> it2 = it;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            ArrayList<TLRPC.Chat> arrayList22 = arrayList20;
            if (key.startsWith(NotificationsSettingsFacade.PROPERTY_NOTIFY)) {
                arrayList9 = arrayList19;
                String replace = key.replace(NotificationsSettingsFacade.PROPERTY_NOTIFY, "");
                Long parseLong2 = Utilities.parseLong(replace);
                ArrayList arrayList23 = arrayList13;
                arrayList8 = arrayList14;
                long longValue2 = parseLong2.longValue();
                if (longValue2 == 0 || longValue2 == j10) {
                    arrayList10 = arrayList21;
                    arrayList7 = arrayList23;
                } else {
                    arrayList7 = arrayList23;
                    lk0 lk0Var = new lk0();
                    lk0Var.d = longValue2;
                    arrayList10 = arrayList21;
                    ArrayList arrayList24 = arrayList12;
                    lk0Var.b = org.telegram.messenger.y3.v(NotificationsSettingsFacade.PROPERTY_CUSTOM, longValue2, notificationsSettings, false);
                    int intValue = ((Integer) next.getValue()).intValue();
                    lk0Var.c = intValue;
                    if (intValue != 0) {
                        Integer num = (Integer) all.get(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + replace);
                        if (num != null) {
                            lk0Var.a = num.intValue();
                        }
                    }
                    if (DialogObject.isEncryptedDialog(longValue2)) {
                        int encryptedChatId = DialogObject.getEncryptedChatId(longValue2);
                        TLRPC.EncryptedChat encryptedChat = notificationsCustomSettingsActivity.getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                        if (encryptedChat == null) {
                            arrayList18.add(Integer.valueOf(encryptedChatId));
                            longSparseArray.put(longValue2, lk0Var);
                        } else {
                            TLRPC.User user = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                            if (user == null) {
                                arrayList16.add(Long.valueOf(encryptedChat.user_id));
                                longSparseArray.put(encryptedChat.user_id, lk0Var);
                            } else if (user.deleted) {
                                it = it2;
                                arrayList20 = arrayList22;
                                arrayList19 = arrayList9;
                                arrayList14 = arrayList8;
                                arrayList13 = arrayList7;
                                arrayList21 = arrayList10;
                                arrayList12 = arrayList24;
                            }
                        }
                        arrayList11.add(lk0Var);
                        arrayList12 = arrayList24;
                    } else if (DialogObject.isUserDialog(longValue2)) {
                        TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(parseLong2);
                        if (user2 == null) {
                            arrayList16.add(parseLong2);
                            longSparseArray.put(longValue2, lk0Var);
                        } else if (user2.deleted) {
                            it = it2;
                            arrayList20 = arrayList22;
                            arrayList19 = arrayList9;
                            arrayList14 = arrayList8;
                            arrayList13 = arrayList7;
                            arrayList21 = arrayList10;
                            arrayList12 = arrayList24;
                        }
                        arrayList11.add(lk0Var);
                        arrayList12 = arrayList24;
                    } else {
                        long j11 = -longValue2;
                        TLRPC.Chat chat = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(j11));
                        if (chat == null) {
                            arrayList17.add(Long.valueOf(j11));
                            longSparseArray.put(longValue2, lk0Var);
                        } else if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                                arrayList12 = arrayList24;
                                arrayList12.add(lk0Var);
                            } else {
                                arrayList15.add(lk0Var);
                                arrayList12 = arrayList24;
                            }
                        }
                        it = it2;
                        arrayList20 = arrayList22;
                        arrayList19 = arrayList9;
                        arrayList14 = arrayList8;
                        arrayList13 = arrayList7;
                        arrayList21 = arrayList10;
                        arrayList12 = arrayList24;
                    }
                }
            } else {
                arrayList7 = arrayList13;
                arrayList8 = arrayList14;
                arrayList9 = arrayList19;
                arrayList10 = arrayList21;
            }
            it = it2;
            arrayList20 = arrayList22;
            arrayList19 = arrayList9;
            arrayList14 = arrayList8;
            arrayList13 = arrayList7;
            arrayList21 = arrayList10;
        }
        ArrayList arrayList25 = arrayList13;
        ArrayList arrayList26 = arrayList14;
        ArrayList<TLRPC.User> arrayList27 = arrayList19;
        ArrayList<TLRPC.Chat> arrayList28 = arrayList20;
        ArrayList<TLRPC.EncryptedChat> arrayList29 = arrayList21;
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it3 = all.entrySet().iterator();
        while (true) {
            z4 = true;
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next2 = it3.next();
            String key2 = next2.getKey();
            if (key2.startsWith(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY)) {
                try {
                    parseLong = Utilities.parseLong(key2.substring(8));
                    longValue = parseLong.longValue();
                } catch (Exception unused) {
                    arrayList6 = arrayList25;
                }
                if (longValue != 0 && longValue != j10) {
                    lk0 lk0Var2 = new lk0();
                    lk0Var2.d = longValue;
                    lk0Var2.e = true;
                    lk0Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(parseLong);
                        if (user3 == null) {
                            try {
                                arrayList16.add(parseLong);
                                longSparseArray.put(longValue, lk0Var2);
                            } catch (Exception unused2) {
                            }
                        } else if (user3.deleted) {
                        }
                        arrayList6 = arrayList25;
                        arrayList6.add(lk0Var2);
                        hashSet.add(parseLong);
                        arrayList25 = arrayList6;
                    }
                }
            }
            arrayList6 = arrayList25;
            arrayList25 = arrayList6;
        }
        ArrayList arrayList30 = arrayList25;
        if (arrayList != null) {
            Collections.sort(arrayList, Comparator$-CC.comparingDouble(new mh.y0(5)));
            int max = Math.max(0, arrayList.size() - 6);
            while (max < arrayList.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(max)).peer);
                if (!hashSet.contains(Long.valueOf(peerDialogId))) {
                    lk0 lk0Var3 = new lk0();
                    lk0Var3.d = peerDialogId;
                    lk0Var3.e = z4;
                    lk0Var3.c = 0;
                    lk0Var3.f = z4;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user4 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        if (user4 == null) {
                            arrayList16.add(Long.valueOf(peerDialogId));
                            longSparseArray.put(peerDialogId, lk0Var3);
                        }
                        i13 = max;
                        arrayList5 = arrayList26;
                        arrayList5.add(0, lk0Var3);
                        hashSet.add(Long.valueOf(peerDialogId));
                        arrayList26 = arrayList5;
                        max = i13 + 1;
                        z4 = true;
                    }
                }
                i13 = max;
                arrayList5 = arrayList26;
                arrayList26 = arrayList5;
                max = i13 + 1;
                z4 = true;
            }
        }
        ArrayList arrayList31 = arrayList26;
        if (longSparseArray.size() != 0) {
            try {
                if (arrayList18.isEmpty()) {
                    arrayList4 = arrayList29;
                } else {
                    try {
                        arrayList4 = arrayList29;
                        try {
                            notificationsCustomSettingsActivity.getMessagesStorage().getEncryptedChatsInternal(TextUtils.join(",", arrayList18), arrayList4, arrayList16);
                        } catch (Exception e6) {
                            e = e6;
                            arrayList2 = arrayList28;
                            arrayList3 = arrayList27;
                            FileLog.e(e);
                            size = arrayList2.size();
                            while (i10 < size) {
                            }
                            size2 = arrayList3.size();
                            while (i11 < size2) {
                            }
                            size3 = arrayList4.size();
                            while (i12 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (r15 < size4) {
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                        }
                    } catch (Exception e10) {
                        e = e10;
                        arrayList4 = arrayList29;
                        arrayList2 = arrayList28;
                        arrayList3 = arrayList27;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i10 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i11 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i12 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (r15 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
                if (arrayList16.isEmpty()) {
                    arrayList3 = arrayList27;
                } else {
                    try {
                        arrayList3 = arrayList27;
                    } catch (Exception e11) {
                        e = e11;
                        arrayList3 = arrayList27;
                        arrayList2 = arrayList28;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i10 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i11 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i12 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (r15 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                    try {
                        notificationsCustomSettingsActivity.getMessagesStorage().getUsersInternal(arrayList16, arrayList3);
                    } catch (Exception e12) {
                        e = e12;
                        arrayList2 = arrayList28;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i10 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i11 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i12 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (r15 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
                if (arrayList17.isEmpty()) {
                    arrayList2 = arrayList28;
                } else {
                    MessagesStorage messagesStorage = notificationsCustomSettingsActivity.getMessagesStorage();
                    String join = TextUtils.join(",", arrayList17);
                    arrayList2 = arrayList28;
                    try {
                        messagesStorage.getChatsInternal(join, arrayList2);
                    } catch (Exception e13) {
                        e = e13;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i10 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i11 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i12 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (r15 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
            } catch (Exception e14) {
                e = e14;
                arrayList2 = arrayList28;
                arrayList3 = arrayList27;
                arrayList4 = arrayList29;
            }
            size = arrayList2.size();
            for (i10 = 0; i10 < size; i10++) {
                TLRPC.Chat chat2 = arrayList2.get(i10);
                if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                    lk0 lk0Var4 = (lk0) longSparseArray.get(-chat2.id);
                    longSparseArray.remove(-chat2.id);
                    if (lk0Var4 != null) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            arrayList12.add(lk0Var4);
                        } else {
                            arrayList15.add(lk0Var4);
                        }
                    }
                }
            }
            size2 = arrayList3.size();
            for (i11 = 0; i11 < size2; i11++) {
                TLRPC.User user5 = arrayList3.get(i11);
                if (!user5.deleted) {
                    longSparseArray.remove(user5.id);
                }
            }
            size3 = arrayList4.size();
            for (i12 = 0; i12 < size3; i12++) {
                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i12).id));
            }
            size4 = longSparseArray.size();
            for (int i14 = 0; i14 < size4; i14++) {
                if (DialogObject.isChatDialog(longSparseArray.keyAt(i14))) {
                    arrayList12.remove(longSparseArray.valueAt(i14));
                    arrayList15.remove(longSparseArray.valueAt(i14));
                } else {
                    arrayList11.remove(longSparseArray.valueAt(i14));
                }
            }
        } else {
            arrayList2 = arrayList28;
            arrayList3 = arrayList27;
            arrayList4 = arrayList29;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
    }

    public static void X(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lk0 lk0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.k0(lk0Var, view, true);
    }

    public static boolean c0(int i10, long j10) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb = new StringBuilder(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY);
        sb.append(j10);
        return notificationsSettings.contains(sb.toString()) ? org.telegram.messenger.y3.v(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, j10, notificationsSettings, true) : notificationsSettings.contains("EnableAllStories") ? notificationsSettings.getBoolean("EnableAllStories", true) : i0(i10, j10);
    }

    public static boolean i0(int i10, long j10) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).hints);
        Collections.sort(arrayList, Comparator$-CC.comparingDouble(new mh.y0(4)));
        int i11 = -1;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(i12)).peer) == j10) {
                i11 = i12;
            }
        }
        return i11 >= 0 && i11 >= arrayList.size() + (-5);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.f = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.s == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 27));
        ArrayList arrayList = this.w;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.E = new bk0(this);
            a2.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.d = new ik0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.c = ozVar;
        ozVar.setTextSize(18);
        this.c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.c.c();
        frameLayout.addView(this.c, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.a = tl0Var;
        tl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setEmptyView(this.c);
        this.a.setLayoutManager(new f2.j0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.tl0 tl0Var2 = this.a;
        gk0 gk0Var = new gk0(this, context);
        this.b = gk0Var;
        tl0Var2.setAdapter(gk0Var);
        this.a.setOnItemClickListener(new rs(28, this, context));
        dk0 dk0Var = new dk0(this);
        dk0Var.c = 150L;
        dk0Var.e = 350L;
        dk0Var.f = 0L;
        dk0Var.g = 0L;
        dk0Var.d = 0L;
        dk0Var.C = false;
        dk0Var.i = new OvershootInterpolator(1.1f);
        dk0Var.o = org.telegram.ui.Components.pr.h;
        dk0Var.m = false;
        this.a.setItemAnimator(dk0Var);
        this.a.setOnScrollListener(new l3(this, 22));
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0() {
        boolean isGlobalNotificationsEnabled;
        fk0 fk0Var;
        int i10;
        int i11;
        ArrayList arrayList;
        boolean isEmpty = this.w.isEmpty();
        int i12 = this.s;
        if (isEmpty || i12 == 3) {
            int childCount = this.a.getChildCount();
            ArrayList arrayList2 = new ArrayList();
            if (i12 == 3) {
                Boolean bool = this.n;
                isGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = this.w) == null || arrayList.isEmpty());
            } else {
                isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(i12);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.a.getChildAt(i13);
                org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) this.a.T(childAt);
                this.a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList3 = this.F;
                    if (R < arrayList3.size()) {
                        fk0Var = (fk0) arrayList3.get(R);
                        boolean z4 = (fk0Var == null && ((i11 = fk0Var.c) == 102 || i11 == 101 || i11 == 100)) ? true : isGlobalNotificationsEnabled;
                        i10 = fl0Var.f;
                        View view = fl0Var.a;
                        if (i10 != 0) {
                            ((org.telegram.ui.Cells.m4) view).a(arrayList2, z4);
                        } else if (i10 == 1) {
                            ((org.telegram.ui.Cells.s8) view).e(arrayList2, z4);
                        } else if (i10 == 3) {
                            ((org.telegram.ui.Cells.u8) view).a(arrayList2, z4);
                        } else if (i10 == 5) {
                            ((org.telegram.ui.Cells.aa) view).a(arrayList2, z4);
                        }
                    }
                }
                fk0Var = null;
                if (fk0Var == null) {
                }
                i10 = fl0Var.f;
                View view2 = fl0Var.a;
                if (i10 != 0) {
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            AnimatorSet animatorSet = this.e;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.e = animatorSet2;
            animatorSet2.playTogether(arrayList2);
            this.e.addListener(new org.telegram.ui.Components.g91(this, 27));
            this.e.setDuration(150L);
            this.e.start();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.notificationsSettingsUpdated) {
            if (i10 == NotificationCenter.reloadHints) {
                j0();
            }
        } else {
            gk0 gk0Var = this.b;
            if (gk0Var != null) {
                gk0Var.l();
            }
        }
    }

    public final void e0(lk0 lk0Var, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(lk0Var.d, 0L);
        getNotificationsSettings().edit().remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + sharedPrefKey).commit();
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(lk0Var);
        }
        ArrayList arrayList2 = this.w;
        if (arrayList2 != null) {
            arrayList2.remove(lk0Var);
        }
        if (i0(this.currentAccount, lk0Var.d)) {
            lk0Var.f = true;
            lk0Var.c = 0;
            this.v.add(lk0Var);
        }
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            vaVar.g(lk0Var, null, vaVar.P);
        }
        getNotificationsController().updateServerNotificationsSettings(lk0Var.d, 0L, false);
        l0(true);
    }

    public final int f0() {
        int i10 = -16776961;
        int i11 = this.s;
        if (i11 == 0) {
            i10 = getNotificationsSettings().getInt("GroupLed", -16776961);
        } else if (i11 == 1) {
            i10 = getNotificationsSettings().getInt("MessagesLed", -16776961);
        } else if (i11 == 2) {
            i10 = getNotificationsSettings().getInt("ChannelLed", -16776961);
        } else if (i11 == 3) {
            i10 = getNotificationsSettings().getInt("StoriesLed", -16776961);
        } else if (i11 == 4 || i11 == 5) {
            i10 = getNotificationsSettings().getInt("ReactionsLed", -16776961);
        }
        for (int i12 = 0; i12 < 9; i12++) {
            if (org.telegram.ui.Cells.u8.f[i12] == i10) {
                return org.telegram.ui.Cells.u8.e[i12];
            }
        }
        return i10;
    }

    public final String g0() {
        int i10 = this.s;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : getNotificationsSettings().getInt("popupChannel", 0) : getNotificationsSettings().getInt("popupAll", 0) : getNotificationsSettings().getInt("popupGroup", 0);
        int[] iArr = this.B;
        return LocaleController.getString(iArr[Utilities.clamp(i11, iArr.length - 1, 0)]);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 26);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.u8.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.va.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.k6.r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.u8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.v6));
        return arrayList;
    }

    public final String h0() {
        int i10 = this.s;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? (i10 == 4 || i10 == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1 : getNotificationsSettings().getInt("priority_stories", 1) : getNotificationsSettings().getInt("priority_channel", 1) : getNotificationsSettings().getInt("priority_messages", 1) : getNotificationsSettings().getInt("priority_group", 1);
        int[] iArr = this.C;
        return LocaleController.getString(iArr[Utilities.clamp(i11, iArr.length - 1, 0)]);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ArrayList arrayList;
        if (this.s == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new he0(15, this, arrayList));
    }

    public final void k0(lk0 lk0Var, View view, boolean z4) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(lk0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean i02 = i0(this.currentAccount, lk0Var.d);
        lk0Var.c = z4 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
        if (lk0Var.f) {
            lk0Var.f = false;
            edit.putBoolean(yh.k(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, sharedPrefKey), !z4).commit();
            ArrayList arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(lk0Var);
            }
            if (this.w == null) {
                this.w = new ArrayList();
            }
            this.w.add(0, lk0Var);
        } else if (i02) {
            edit.putBoolean(yh.k(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, sharedPrefKey), !z4).commit();
        } else {
            Boolean bool = this.n;
            if (!z4 ? bool == null || !bool.booleanValue() : bool != null && bool.booleanValue()) {
                e0(lk0Var, view);
                return;
            }
            edit.putBoolean(yh.k(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, sharedPrefKey), !z4).commit();
        }
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            vaVar.g(lk0Var, null, vaVar.P);
        }
        getNotificationsController().updateServerNotificationsSettings(lk0Var.d, 0L, false);
        l0(true);
    }

    public final void l0(boolean z4) {
        ArrayList arrayList;
        String string;
        long j10;
        Boolean bool;
        this.newRow = -1;
        this.showRow = -1;
        this.importantRow = -1;
        this.messagesRow = -1;
        this.storiesRow = -1;
        this.previewRow = -1;
        this.showSenderRow = -1;
        this.soundRow = -1;
        this.addExceptionRow = -1;
        this.deleteExceptionsRow = -1;
        this.lightColorRow = -1;
        this.popupRow = -1;
        this.vibrateRow = -1;
        this.priorityRow = -1;
        ArrayList arrayList2 = this.E;
        arrayList2.clear();
        ArrayList arrayList3 = this.F;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i10 = this.s;
        if (i10 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            fk0 fk0Var = new fk0(0, true);
            fk0Var.e = string2;
            arrayList3.add(fk0Var);
            if (i10 == 3) {
                this.newRow = arrayList3.size();
                arrayList3.add(fk0.b(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList3.size();
                    arrayList3.add(fk0.b(102, LocaleController.getString(R.string.NotifyMeAboutImportantStories), this.r && ((bool = this.n) == null || !bool.booleanValue())));
                }
                arrayList3.add(fk0.d(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i10 == 4 || i10 == 5) {
                this.messagesRow = arrayList3.size();
                int i11 = R.drawable.msg_markunread;
                String string3 = LocaleController.getString(R.string.NotifyMeAboutMessagesReactions);
                String string4 = LocaleController.getString(!notificationsSettings.getBoolean("EnableReactionsMessages", true) ? R.string.NotifyFromNobody : notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone);
                boolean z10 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                fk0 fk0Var2 = new fk0(6, true);
                fk0Var2.c = 103;
                fk0Var2.d = i11;
                fk0Var2.e = string3;
                fk0Var2.f = string4;
                fk0Var2.i = z10;
                arrayList3.add(fk0Var2);
                this.storiesRow = arrayList3.size();
                int i12 = R.drawable.msg_stories_saved;
                String string5 = LocaleController.getString(R.string.NotifyMeAboutStoriesReactions);
                String string6 = LocaleController.getString(!notificationsSettings.getBoolean("EnableReactionsStories", true) ? R.string.NotifyFromNobody : notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone);
                boolean z11 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                fk0 fk0Var3 = new fk0(6, true);
                fk0Var3.c = 104;
                fk0Var3.d = i12;
                fk0Var3.e = string5;
                fk0Var3.f = string6;
                fk0Var3.i = z11;
                arrayList3.add(fk0Var3);
                arrayList3.add(fk0.d(-1, null));
            } else {
                int i13 = i10 == 1 ? R.string.NotifyMeAboutPrivate : i10 == 0 ? R.string.NotifyMeAboutGroups : R.string.NotifyMeAboutChannels;
                this.showRow = arrayList3.size();
                arrayList3.add(fk0.b(100, LocaleController.getString(i13), getNotificationsController().isGlobalNotificationsEnabled(i10)));
                arrayList3.add(fk0.d(-1, null));
            }
            String string7 = LocaleController.getString(R.string.SETTINGS);
            fk0 fk0Var4 = new fk0(0, true);
            fk0Var4.e = string7;
            arrayList3.add(fk0Var4);
            arrayList3.size();
            if (i10 == 3) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(fk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i10 == 4 || i10 == 5) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(fk0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                boolean z12 = i10 != 0 ? i10 != 1 ? i10 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true) : notificationsSettings.getBoolean("EnablePreviewAll", true) : notificationsSettings.getBoolean("EnablePreviewGroup", true);
                this.previewRow = arrayList3.size();
                arrayList3.add(fk0.b(0, LocaleController.getString(R.string.MessagePreview), z12));
            }
            this.soundRow = arrayList3.size();
            String string8 = LocaleController.getString("Sound", R.string.Sound);
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String string9 = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            if (i10 == 0) {
                string = notificationsSettings2.getString("GroupSound", string9);
                j10 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            } else if (i10 == 1) {
                string = notificationsSettings2.getString("GlobalSound", string9);
                j10 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
            } else if (i10 == 3) {
                string = notificationsSettings2.getString("StoriesSound", string9);
                j10 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
            } else if (i10 == 4 || i10 == 5) {
                string = notificationsSettings2.getString("ReactionSound", string9);
                j10 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
            } else {
                string = notificationsSettings2.getString("ChannelSound", string9);
                j10 = notificationsSettings2.getLong("ChannelDocId", 0L);
            }
            if (j10 != 0) {
                TLRPC.Document c3 = getMediaDataController().ringtoneDataStore.c(j10);
                string = c3 == null ? LocaleController.getString("CustomSound", R.string.CustomSound) : qk0.a0(c3, FileLoader.getDocumentFileName(c3));
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            }
            arrayList3.add(fk0.c(3, string8, string));
            if (this.D) {
                this.lightColorRow = arrayList3.size();
                String string10 = LocaleController.getString("LedColor", R.string.LedColor);
                int f02 = f0();
                fk0 fk0Var5 = new fk0(3, true);
                fk0Var5.e = string10;
                fk0Var5.h = f02;
                arrayList3.add(fk0Var5);
                int i14 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? (i10 == 4 || i10 == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0 : notificationsSettings.getInt("vibrate_stories", 0) : notificationsSettings.getInt("vibrate_channel", 0) : notificationsSettings.getInt("vibrate_messages", 0) : notificationsSettings.getInt("vibrate_group", 0);
                this.vibrateRow = arrayList3.size();
                String string11 = LocaleController.getString("Vibrate", R.string.Vibrate);
                int[] iArr = this.y;
                arrayList3.add(fk0.c(1, string11, LocaleController.getString(iArr[Utilities.clamp(i14, iArr.length - 1, 0)])));
                if (i10 == 1 || i10 == 0) {
                    this.popupRow = arrayList3.size();
                    arrayList3.add(fk0.c(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), g0()));
                }
                this.priorityRow = arrayList3.size();
                arrayList3.add(fk0.c(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), h0()));
                String string12 = LocaleController.getString(R.string.NotifyLessOptions);
                fk0 fk0Var6 = new fk0(8, true);
                fk0Var6.e = string12;
                fk0Var6.d = 0;
                arrayList3.add(fk0Var6);
            } else {
                String string13 = LocaleController.getString(R.string.NotifyMoreOptions);
                fk0 fk0Var7 = new fk0(8, true);
                fk0Var7.e = string13;
                fk0Var7.d = 1;
                arrayList3.add(fk0Var7);
            }
            arrayList3.size();
            arrayList3.add(fk0.d(-2, null));
        }
        if (i10 != 4 && i10 != 5) {
            if (i10 != -1) {
                this.addExceptionRow = arrayList3.size();
                int i15 = R.drawable.msg_contact_add;
                String string14 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                fk0 fk0Var8 = new fk0(7, true);
                fk0Var8.c = 6;
                fk0Var8.d = i15;
                fk0Var8.e = string14;
                arrayList3.add(fk0Var8);
            }
            arrayList3.size();
            if (this.v != null && this.h) {
                for (int i16 = 0; i16 < this.v.size(); i16++) {
                    lk0 lk0Var = (lk0) this.v.get(i16);
                    fk0 fk0Var9 = new fk0(2, true);
                    fk0Var9.g = lk0Var;
                    arrayList3.add(fk0Var9);
                }
            }
            if (this.w != null) {
                for (int i17 = 0; i17 < this.w.size(); i17++) {
                    lk0 lk0Var2 = (lk0) this.w.get(i17);
                    fk0 fk0Var10 = new fk0(2, true);
                    fk0Var10.g = lk0Var2;
                    arrayList3.add(fk0Var10);
                }
            }
            arrayList3.size();
            if (i10 != -1 || ((arrayList = this.w) != null && !arrayList.isEmpty())) {
                arrayList3.add(fk0.d(-3, null));
            }
            ArrayList arrayList4 = this.w;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                this.deleteExceptionsRow = arrayList3.size();
                String string15 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                fk0 fk0Var11 = new fk0(7, true);
                fk0Var11.c = 7;
                fk0Var11.d = 0;
                fk0Var11.e = string15;
                arrayList3.add(fk0Var11);
            }
        }
        gk0 gk0Var = this.b;
        if (gk0Var != null) {
            if (z4) {
                gk0Var.E(arrayList2, arrayList3);
            } else {
                gk0Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i11 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                str = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? LocaleController.getString("SoundDefault", R.string.SoundDefault) : ringtone.getTitle(getParentActivity());
                ringtone.stop();
            }
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            int i12 = this.s;
            if (i12 == 1) {
                if (str == null || uri == null) {
                    edit.putString("GlobalSound", "NoSound");
                    edit.putString("GlobalSoundPath", "NoSound");
                } else {
                    edit.putString("GlobalSound", str);
                    edit.putString("GlobalSoundPath", uri.toString());
                }
            } else if (i12 == 0) {
                if (str == null || uri == null) {
                    edit.putString("GroupSound", "NoSound");
                    edit.putString("GroupSoundPath", "NoSound");
                } else {
                    edit.putString("GroupSound", str);
                    edit.putString("GroupSoundPath", uri.toString());
                }
            } else if (i12 == 2) {
                if (str == null || uri == null) {
                    edit.putString("ChannelSound", "NoSound");
                    edit.putString("ChannelSoundPath", "NoSound");
                } else {
                    edit.putString("ChannelSound", str);
                    edit.putString("ChannelSoundPath", uri.toString());
                }
            } else if (i12 == 3) {
                if (str == null || uri == null) {
                    edit.putString("StoriesSound", "NoSound");
                    edit.putString("StoriesSoundPath", "NoSound");
                } else {
                    edit.putString("StoriesSound", str);
                    edit.putString("StoriesSoundPath", uri.toString());
                }
            }
            getNotificationsController().deleteNotificationChannelGlobal(i12);
            edit.commit();
            getNotificationsController().updateServerNotificationsSettings(i12);
            f2.m1 K = this.a.K(i10);
            if (K != null) {
                this.b.v(K, i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        l0(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        if (this.s == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.n = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.r = false;
                this.h = false;
            } else {
                this.n = null;
                this.r = true;
                this.h = true;
            }
        }
        l0(true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        gk0 gk0Var = this.b;
        if (gk0Var != null) {
            gk0Var.l();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }
}
