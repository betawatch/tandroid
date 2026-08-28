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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final int[] A;
    public final int[] B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public org.telegram.ui.Components.wk0 a;
    public int addExceptionRow;
    public zj0 b;
    public org.telegram.ui.Components.yy c;
    public bk0 d;
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

    public NotificationsCustomSettingsActivity(int i9, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.x = new HashMap();
        this.y = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.A = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i10 = R.string.NotificationsPriorityHigh;
        int i11 = R.string.NotificationsPriorityUrgent;
        int i12 = R.string.NotificationsPriorityMedium;
        this.B = new int[]{i10, i11, i11, i12, R.string.NotificationsPriorityLow, i12};
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
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.s = i9;
        this.v = arrayList2;
        this.w = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ek0 ek0Var = (ek0) this.w.get(i13);
                this.x.put(Long.valueOf(ek0Var.d), ek0Var);
            }
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                ek0 ek0Var2 = (ek0) this.v.get(i14);
                this.x.put(Long.valueOf(ek0Var2.d), ek0Var2);
            }
        }
        if (z10) {
            i0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void T(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context, View view, int i9, float f10, float f11) {
        HashMap hashMap;
        ek0 ek0Var;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        String[] strArr;
        Drawable drawable;
        boolean z13;
        boolean z14;
        ek0 ek0Var2;
        boolean z15;
        ek0 ek0Var3;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
        ArrayList arrayList2 = notificationsCustomSettingsActivity2.E;
        HashMap hashMap2 = notificationsCustomSettingsActivity2.x;
        int i11 = notificationsCustomSettingsActivity2.s;
        if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
            return;
        }
        yj0 yj0Var = (notificationsCustomSettingsActivity2.a.getAdapter() != notificationsCustomSettingsActivity2.b || i9 < 0 || i9 >= arrayList2.size()) ? null : (yj0) arrayList2.get(i9);
        if (yj0Var != null && yj0Var.a == 8) {
            notificationsCustomSettingsActivity2.C = !notificationsCustomSettingsActivity2.C;
            notificationsCustomSettingsActivity2.k0(true);
            return;
        }
        if (i11 != 3 || yj0Var == null) {
            hashMap = hashMap2;
        } else {
            hashMap = hashMap2;
            ek0 ek0Var4 = yj0Var.g;
            if (ek0Var4 != null) {
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(notificationsCustomSettingsActivity2, view);
                H.i = 3;
                H.m(ek0Var4.c <= 0 || ek0Var4.f, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute), false, new rj0(notificationsCustomSettingsActivity2, ek0Var4, view, i9, 5));
                H.m(ek0Var4.c > 0 || ek0Var4.f, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute), false, new rj0(notificationsCustomSettingsActivity, ek0Var4, view, i9, 0));
                H.m(!ek0Var4.f, R.drawable.msg_delete, LocaleController.getString("DeleteException", R.string.DeleteException), true, new rj0(notificationsCustomSettingsActivity, ek0Var4, view, i9, 1));
                H.W(notificationsCustomSettingsActivity.a.V0(view, false));
                H.Z();
                return;
            }
        }
        if (i11 == 3) {
            f2.r0 adapter = notificationsCustomSettingsActivity2.a.getAdapter();
            bk0 bk0Var = notificationsCustomSettingsActivity2.d;
            if (adapter == bk0Var) {
                Object E = bk0Var.E(i9);
                if (E instanceof ek0) {
                    ek0Var3 = (ek0) E;
                } else {
                    boolean z16 = E instanceof TLRPC.User;
                    long j10 = z16 ? ((TLRPC.User) E).id : -((TLRPC.Chat) E).id;
                    if (!hashMap.containsKey(Long.valueOf(j10))) {
                        ek0 ek0Var5 = new ek0();
                        ek0Var5.e = true;
                        ek0Var5.d = j10;
                        if (z16) {
                            ek0Var5.d = ((TLRPC.User) E).id;
                        } else {
                            ek0Var5.d = -((TLRPC.Chat) E).id;
                        }
                        ek0Var2 = ek0Var5;
                        z15 = true;
                        if (ek0Var2 != null) {
                            return;
                        }
                        org.telegram.ui.Components.x60 H2 = org.telegram.ui.Components.x60.H(notificationsCustomSettingsActivity2, view);
                        H2.i = 3;
                        H2.m(ek0Var2.c <= 0 || ek0Var2.f, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute), false, new rj0(notificationsCustomSettingsActivity2, ek0Var2, view, z15, 2));
                        H2.m(ek0Var2.c > 0 || ek0Var2.f, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute), false, new rj0(notificationsCustomSettingsActivity, ek0Var2, view, z15, 3));
                        H2.m((z15 || ek0Var2.f) ? false : true, R.drawable.msg_delete, LocaleController.getString("DeleteException", R.string.DeleteException), true, new rj0(notificationsCustomSettingsActivity, ek0Var2, view, i9, 4));
                        H2.W(notificationsCustomSettingsActivity.a.V0(view, false));
                        H2.Z();
                        return;
                    }
                    ek0Var3 = (ek0) hashMap.get(Long.valueOf(j10));
                }
                ek0Var2 = ek0Var3;
                z15 = false;
                if (ek0Var2 != null) {
                }
            }
        }
        if (notificationsCustomSettingsActivity2.a.getAdapter() == notificationsCustomSettingsActivity2.d || !(yj0Var == null || yj0Var.g == null)) {
            f2.r0 adapter2 = notificationsCustomSettingsActivity2.a.getAdapter();
            bk0 bk0Var2 = notificationsCustomSettingsActivity2.d;
            if (adapter2 == bk0Var2) {
                Object E2 = bk0Var2.E(i9);
                if (E2 instanceof ek0) {
                    arrayList = notificationsCustomSettingsActivity2.d.d;
                    ek0Var = (ek0) E2;
                    z12 = false;
                } else {
                    boolean z17 = E2 instanceof TLRPC.User;
                    long j11 = z17 ? ((TLRPC.User) E2).id : -((TLRPC.Chat) E2).id;
                    if (hashMap.containsKey(Long.valueOf(j11))) {
                        ek0Var = (ek0) hashMap.get(Long.valueOf(j11));
                        z11 = false;
                    } else {
                        ek0 ek0Var6 = new ek0();
                        ek0Var6.d = j11;
                        if (z17) {
                            ek0Var6.d = ((TLRPC.User) E2).id;
                        } else {
                            ek0Var6.d = -((TLRPC.Chat) E2).id;
                        }
                        ek0Var = ek0Var6;
                        z11 = true;
                    }
                    arrayList = notificationsCustomSettingsActivity2.w;
                    z12 = z11;
                }
                z10 = z12;
            } else {
                ek0Var = yj0Var.g;
                if (ek0Var.f) {
                    return;
                }
                arrayList = notificationsCustomSettingsActivity2.w;
                z10 = false;
            }
            ek0 ek0Var7 = ek0Var;
            ArrayList arrayList3 = arrayList;
            if (ek0Var7 == null) {
                return;
            }
            long j12 = ek0Var7.d;
            org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(context, notificationsCustomSettingsActivity2.currentAccount, null, true, new vj0(notificationsCustomSettingsActivity2, j12, NotificationsController.getInstance(notificationsCustomSettingsActivity2.currentAccount).isGlobalNotificationsEnabled(j12, false, false), ek0Var7, z10, i9, arrayList3), notificationsCustomSettingsActivity.getResourceProvider());
            foVar.d(j12, 0, null);
            foVar.c(notificationsCustomSettingsActivity, view, f10, f11, false);
            return;
        }
        if (yj0Var == null) {
            return;
        }
        int i12 = yj0Var.c;
        int i13 = 2;
        if (i12 == 6) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            if (i11 == 0) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            dy dyVar = new dy(bundle);
            dyVar.y2 = new sj0(notificationsCustomSettingsActivity2);
            notificationsCustomSettingsActivity2.presentFragment(dyVar);
            return;
        }
        if (i12 == 7) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            String string = LocaleController.getString("NotificationsDeleteAllExceptionTitle", R.string.NotificationsDeleteAllExceptionTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = LocaleController.getString("NotificationsDeleteAllExceptionAlert", R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new sj0(notificationsCustomSettingsActivity2));
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            notificationsCustomSettingsActivity2.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                return;
            }
            return;
        }
        if (i12 == 100 || i12 == 101) {
            boolean isGlobalNotificationsEnabled = notificationsCustomSettingsActivity2.getNotificationsController().isGlobalNotificationsEnabled(i11);
            notificationsCustomSettingsActivity2.a.K(i9);
            final int i14 = notificationsCustomSettingsActivity2.s;
            if (i14 == 3) {
                SharedPreferences.Editor edit = notificationsCustomSettingsActivity2.getNotificationsSettings().edit();
                Boolean bool = notificationsCustomSettingsActivity2.n;
                boolean z18 = bool != null && bool.booleanValue();
                if (notificationsCustomSettingsActivity2.r && z18) {
                    edit.remove("EnableAllStories");
                    notificationsCustomSettingsActivity2.n = null;
                } else {
                    boolean z19 = !z18;
                    edit.putBoolean("EnableAllStories", z19);
                    notificationsCustomSettingsActivity2.n = Boolean.valueOf(z19);
                }
                edit.apply();
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i11);
                notificationsCustomSettingsActivity2.k0(true);
                boolean z20 = notificationsCustomSettingsActivity2.h;
                if (z20 != (notificationsCustomSettingsActivity2.n == null) && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z20;
                    notificationsCustomSettingsActivity2.k0(true);
                }
                notificationsCustomSettingsActivity2.c0();
                return;
            }
            if (!isGlobalNotificationsEnabled) {
                notificationsCustomSettingsActivity2.getNotificationsController().setGlobalNotificationsEnabled(i11, 0);
                notificationsCustomSettingsActivity2.k0(true);
                return;
            }
            final ArrayList arrayList4 = notificationsCustomSettingsActivity2.w;
            final ArrayList arrayList5 = notificationsCustomSettingsActivity2.v;
            int i15 = notificationsCustomSettingsActivity2.currentAccount;
            final qa qaVar = new qa(notificationsCustomSettingsActivity2, i13);
            Pattern pattern = org.telegram.ui.Components.y4.a;
            if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
                return;
            }
            final boolean isGlobalNotificationsEnabled2 = NotificationsController.getInstance(i15).isGlobalNotificationsEnabled(0L, false, false);
            String[] strArr2 = {LocaleController.getString(R.string.NotificationsTurnOn), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0])), null, LocaleController.getString(R.string.NotificationsTurnOff)};
            int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
            LinearLayout linearLayout = new LinearLayout(notificationsCustomSettingsActivity2.getParentActivity());
            linearLayout.setOrientation(1);
            final AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            int i16 = 0;
            while (i16 < 5) {
                if (strArr2[i16] == null) {
                    i10 = i15;
                    strArr = strArr2;
                } else {
                    TextView textView2 = new TextView(notificationsCustomSettingsActivity2.getParentActivity());
                    Drawable drawable2 = notificationsCustomSettingsActivity2.getParentActivity().getResources().getDrawable(iArr[i16]);
                    if (i16 == 4) {
                        strArr = strArr2;
                        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, r12));
                        i10 = i15;
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, r12), PorterDuff.Mode.MULTIPLY));
                        drawable = null;
                        z13 = false;
                    } else {
                        i10 = i15;
                        strArr = strArr2;
                        drawable = null;
                        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, r12));
                        z13 = false;
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J5, r12), PorterDuff.Mode.MULTIPLY));
                    }
                    textView2.setTextSize(1, 16.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, drawable, drawable);
                    textView2.setTag(Integer.valueOf(i16));
                    textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(z13));
                    textView2.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    textView2.setSingleLine(true);
                    textView2.setGravity(19);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(26.0f));
                    textView2.setText(strArr[i16]);
                    linearLayout.addView(textView2, g7.e6.q(-1, 48, 51));
                    final NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity2;
                    final int i17 = i10;
                    View.OnClickListener onClickListener = new View.OnClickListener(i17, isGlobalNotificationsEnabled2, i14, notificationsCustomSettingsActivity3, arrayList4, arrayList5, qaVar, alertDialog$Builder2) { // from class: org.telegram.ui.Components.p2
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ NotificationsCustomSettingsActivity c;
                        public final /* synthetic */ ArrayList d;
                        public final /* synthetic */ ArrayList e;
                        public final /* synthetic */ org.telegram.ui.qa f;
                        public final /* synthetic */ AlertDialog$Builder h;

                        {
                            this.b = i14;
                            this.c = notificationsCustomSettingsActivity3;
                            this.d = arrayList4;
                            this.e = arrayList5;
                            this.f = qaVar;
                            this.h = alertDialog$Builder2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i18;
                            int intValue = ((Integer) view2.getTag()).intValue();
                            int i19 = this.a;
                            int i20 = this.b;
                            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity4 = this.c;
                            int i21 = 3;
                            if (intValue == 0) {
                                NotificationsController.getInstance(i19).setGlobalNotificationsEnabled(i20, 0);
                            } else if (intValue == 3) {
                                notificationsCustomSettingsActivity4.presentFragment(new NotificationsCustomSettingsActivity(i20, this.d, this.e, false));
                            } else {
                                int currentTime = ConnectionsManager.getInstance(i19).getCurrentTime();
                                if (intValue == 1) {
                                    currentTime += 3600;
                                } else if (intValue == 2) {
                                    currentTime += 172800;
                                } else if (intValue == 4) {
                                    i18 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    NotificationsController.getInstance(i19).muteUntil(0L, 0, i18);
                                    NotificationsController.getInstance(i19).setGlobalNotificationsEnabled(i20, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                }
                                i18 = currentTime;
                                NotificationsController.getInstance(i19).muteUntil(0L, 0, i18);
                                NotificationsController.getInstance(i19).setGlobalNotificationsEnabled(i20, ConnectionsManager.DEFAULT_DATACENTER_ID);
                            }
                            this.f.run(intValue);
                            this.h.a.H0.run();
                            if (intValue == 0) {
                                i21 = 4;
                            } else if (intValue == 1) {
                                i21 = 0;
                            } else if (intValue == 2) {
                                i21 = 2;
                            } else if (intValue != 4) {
                                i21 = -1;
                            }
                            if (i21 < 0 || !oc.a(notificationsCustomSettingsActivity4)) {
                                return;
                            }
                            oc.z(notificationsCustomSettingsActivity4, i21, 0, null).j();
                        }
                    };
                    notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity3;
                    textView2.setOnClickListener(onClickListener);
                }
                i16++;
                strArr2 = strArr;
                i15 = i10;
                r12 = false;
            }
            String string2 = LocaleController.getString(R.string.Notifications);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.N = string2;
            alertDialog$Builder2.n(linearLayout);
            notificationsCustomSettingsActivity2.showDialog(c2Var2);
            return;
        }
        if (i12 == 3) {
            if (view.isEnabled()) {
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, i11);
                    notificationsCustomSettingsActivity2.presentFragment(new kk0(bundle2, notificationsCustomSettingsActivity2.getResourceProvider()));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            return;
        }
        if (yj0Var.a == 3) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.y4.u(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new tj0(notificationsCustomSettingsActivity2, view, i9, 0), null));
                return;
            }
            return;
        }
        if (i12 == 2) {
            if (view.isEnabled()) {
                Activity parentActivity = notificationsCustomSettingsActivity2.getParentActivity();
                tj0 tj0Var = new tj0(notificationsCustomSettingsActivity2, view, i9, 1);
                Pattern pattern2 = org.telegram.ui.Components.y4.a;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
                int[] iArr2 = new int[1];
                if (i11 == 1) {
                    iArr2[0] = notificationsSettings.getInt("popupAll", 0);
                } else if (i11 == 0) {
                    iArr2[0] = notificationsSettings.getInt("popupGroup", 0);
                } else {
                    iArr2[0] = notificationsSettings.getInt("popupChannel", 0);
                }
                String[] strArr3 = {LocaleController.getString(R.string.NoPopup), LocaleController.getString(R.string.OnlyWhenScreenOn), LocaleController.getString(R.string.OnlyWhenScreenOff), LocaleController.getString(R.string.AlwaysShowPopup)};
                LinearLayout f12 = org.telegram.messenger.l0.f(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity);
                int i18 = 0;
                while (i18 < 4) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(parentActivity, null);
                    k6Var.setTag(Integer.valueOf(i18));
                    k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    k6Var.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
                    k6Var.b(strArr3[i18], iArr2[0] == i18);
                    f12.addView(k6Var);
                    k6Var.setOnClickListener(new ih.p5(iArr2, i11, alertDialog$Builder3, tj0Var, 2));
                    i18++;
                }
                String string3 = LocaleController.getString(R.string.PopupNotification);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                c2Var3.N = string3;
                alertDialog$Builder3.n(f12);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Cancel), null);
                notificationsCustomSettingsActivity2.showDialog(c2Var3);
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view.isEnabled()) {
                String str = i11 == 1 ? "vibrate_messages" : i11 == 0 ? "vibrate_group" : i11 == 3 ? "vibrate_stories" : (i11 == 4 || i11 == 5) ? "vibrate_react" : "vibrate_channel";
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.y4.Y(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0L, str, new org.telegram.ui.Components.y01(notificationsCustomSettingsActivity2, view, str, i9, 5), null));
                return;
            }
            return;
        }
        if (i12 == 4) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.y4.I(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new tj0(notificationsCustomSettingsActivity2, view, i9, 2), null));
                return;
            }
            return;
        }
        if (i12 == 102) {
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
                    yj0Var.i = true;
                } else {
                    edit2.putBoolean("EnableAllStories", false);
                    notificationsCustomSettingsActivity2.n = Boolean.FALSE;
                    notificationsCustomSettingsActivity2.r = false;
                    yj0Var.i = false;
                }
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(notificationsCustomSettingsActivity2.r);
                }
                edit2.commit();
                boolean z21 = notificationsCustomSettingsActivity2.r;
                boolean z22 = notificationsCustomSettingsActivity2.h;
                if (z21 != z22 && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z22;
                    notificationsCustomSettingsActivity2.k0(true);
                }
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i11);
                notificationsCustomSettingsActivity2.c0();
                return;
            }
            return;
        }
        if (i12 == 0) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings3 = notificationsCustomSettingsActivity2.getNotificationsSettings();
                SharedPreferences.Editor edit3 = notificationsSettings3.edit();
                if (i11 == 1) {
                    z14 = notificationsSettings3.getBoolean("EnablePreviewAll", true);
                    edit3.putBoolean("EnablePreviewAll", !z14);
                } else if (i11 == 0) {
                    z14 = notificationsSettings3.getBoolean("EnablePreviewGroup", true);
                    edit3.putBoolean("EnablePreviewGroup", !z14);
                } else if (i11 == 3) {
                    z14 = !notificationsSettings3.getBoolean("EnableHideStoriesSenders", false);
                    edit3.putBoolean("EnableHideStoriesSenders", z14);
                } else if (i11 == 4 || i11 == 5) {
                    z14 = notificationsSettings3.getBoolean("EnableReactionsPreview", true);
                    edit3.putBoolean("EnableReactionsPreview", !z14);
                } else {
                    z14 = notificationsSettings3.getBoolean("EnablePreviewChannel", true);
                    edit3.putBoolean("EnablePreviewChannel", !z14);
                }
                edit3.commit();
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i11);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(!z14);
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == 103 || i12 == 104) {
            boolean z23 = !LocaleController.isRTL ? f10 <= ((float) (view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) : f10 >= ((float) AndroidUtilities.dp(76.0f));
            SharedPreferences notificationsSettings4 = notificationsCustomSettingsActivity2.getNotificationsSettings();
            if (z23) {
                String str2 = yj0Var.c == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                SharedPreferences.Editor edit4 = notificationsSettings4.edit();
                edit4.putBoolean(str2, !notificationsSettings4.getBoolean(str2, true));
                edit4.apply();
                notificationsCustomSettingsActivity2.k0(true);
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i11);
                return;
            }
            String str3 = yj0Var.c == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
            LinearLayout f13 = org.telegram.messenger.ll.f(context, 1);
            boolean[] zArr = {notificationsSettings4.getBoolean(str3, false)};
            org.telegram.ui.Cells.k6[] k6VarArr = new org.telegram.ui.Cells.k6[2];
            int i19 = 0;
            while (i19 < 2) {
                org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, notificationsCustomSettingsActivity2.getResourceProvider());
                k6VarArr[i19] = k6Var2;
                k6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                k6VarArr[i19].a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
                k6VarArr[i19].b(LocaleController.getString(i19 == 0 ? R.string.NotifyAboutReactionsFromEveryone : R.string.NotifyAboutReactionsFromContacts), i19 == 0 ? !zArr[0] : zArr[0]);
                k6VarArr[i19].setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 2, -1));
                f13.addView(k6VarArr[i19]);
                k6VarArr[i19].setOnClickListener(new fh.a3(zArr, i19, k6VarArr, 16));
                i19++;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity(), 0, notificationsCustomSettingsActivity2.resourceProvider);
            String string4 = LocaleController.getString(R.string.NotifyAboutReactionsFrom);
            org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
            c2Var4.N = string4;
            alertDialog$Builder4.n(f13);
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Save), new a1.d(notificationsCustomSettingsActivity2, notificationsSettings4, str3, zArr, 16));
            notificationsCustomSettingsActivity2.showDialog(c2Var4);
        }
    }

    public static void U(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.j0(ek0Var, view, false);
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
    public static void V(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList) {
        boolean z10;
        ArrayList<TLRPC.Chat> arrayList2;
        ArrayList<TLRPC.User> arrayList3;
        ArrayList<TLRPC.EncryptedChat> arrayList4;
        int size;
        int i9;
        int size2;
        int i10;
        int size3;
        int i11;
        int size4;
        int i12;
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
                    ek0 ek0Var = new ek0();
                    ek0Var.d = longValue2;
                    arrayList10 = arrayList21;
                    ArrayList arrayList24 = arrayList12;
                    ek0Var.b = org.telegram.messenger.l0.v(NotificationsSettingsFacade.PROPERTY_CUSTOM, longValue2, notificationsSettings, false);
                    int intValue = ((Integer) next.getValue()).intValue();
                    ek0Var.c = intValue;
                    if (intValue != 0) {
                        Integer num = (Integer) all.get(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + replace);
                        if (num != null) {
                            ek0Var.a = num.intValue();
                        }
                    }
                    if (DialogObject.isEncryptedDialog(longValue2)) {
                        int encryptedChatId = DialogObject.getEncryptedChatId(longValue2);
                        TLRPC.EncryptedChat encryptedChat = notificationsCustomSettingsActivity.getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                        if (encryptedChat == null) {
                            arrayList18.add(Integer.valueOf(encryptedChatId));
                            longSparseArray.put(longValue2, ek0Var);
                        } else {
                            TLRPC.User user = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                            if (user == null) {
                                arrayList16.add(Long.valueOf(encryptedChat.user_id));
                                longSparseArray.put(encryptedChat.user_id, ek0Var);
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
                        arrayList11.add(ek0Var);
                        arrayList12 = arrayList24;
                    } else if (DialogObject.isUserDialog(longValue2)) {
                        TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(parseLong2);
                        if (user2 == null) {
                            arrayList16.add(parseLong2);
                            longSparseArray.put(longValue2, ek0Var);
                        } else if (user2.deleted) {
                            it = it2;
                            arrayList20 = arrayList22;
                            arrayList19 = arrayList9;
                            arrayList14 = arrayList8;
                            arrayList13 = arrayList7;
                            arrayList21 = arrayList10;
                            arrayList12 = arrayList24;
                        }
                        arrayList11.add(ek0Var);
                        arrayList12 = arrayList24;
                    } else {
                        long j11 = -longValue2;
                        TLRPC.Chat chat = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(j11));
                        if (chat == null) {
                            arrayList17.add(Long.valueOf(j11));
                            longSparseArray.put(longValue2, ek0Var);
                        } else if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                                arrayList12 = arrayList24;
                                arrayList12.add(ek0Var);
                            } else {
                                arrayList15.add(ek0Var);
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
            z10 = true;
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
                    ek0 ek0Var2 = new ek0();
                    ek0Var2.d = longValue;
                    ek0Var2.e = true;
                    ek0Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(parseLong);
                        if (user3 == null) {
                            try {
                                arrayList16.add(parseLong);
                                longSparseArray.put(longValue, ek0Var2);
                            } catch (Exception unused2) {
                            }
                        } else if (user3.deleted) {
                        }
                        arrayList6 = arrayList25;
                        arrayList6.add(ek0Var2);
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
            Collections.sort(arrayList, Comparator$-CC.comparingDouble(new gh.a1(5)));
            int max = Math.max(0, arrayList.size() - 6);
            while (max < arrayList.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(max)).peer);
                if (!hashSet.contains(Long.valueOf(peerDialogId))) {
                    ek0 ek0Var3 = new ek0();
                    ek0Var3.d = peerDialogId;
                    ek0Var3.e = z10;
                    ek0Var3.c = 0;
                    ek0Var3.f = z10;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user4 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        if (user4 == null) {
                            arrayList16.add(Long.valueOf(peerDialogId));
                            longSparseArray.put(peerDialogId, ek0Var3);
                        }
                        i12 = max;
                        arrayList5 = arrayList26;
                        arrayList5.add(0, ek0Var3);
                        hashSet.add(Long.valueOf(peerDialogId));
                        arrayList26 = arrayList5;
                        max = i12 + 1;
                        z10 = true;
                    }
                }
                i12 = max;
                arrayList5 = arrayList26;
                arrayList26 = arrayList5;
                max = i12 + 1;
                z10 = true;
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
                        } catch (Exception e10) {
                            e = e10;
                            arrayList2 = arrayList28;
                            arrayList3 = arrayList27;
                            FileLog.e(e);
                            size = arrayList2.size();
                            while (i9 < size) {
                            }
                            size2 = arrayList3.size();
                            while (i10 < size2) {
                            }
                            size3 = arrayList4.size();
                            while (i11 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (r15 < size4) {
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                        }
                    } catch (Exception e11) {
                        e = e11;
                        arrayList4 = arrayList29;
                        arrayList2 = arrayList28;
                        arrayList3 = arrayList27;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i9 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i10 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i11 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (r15 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
                if (arrayList16.isEmpty()) {
                    arrayList3 = arrayList27;
                } else {
                    try {
                        arrayList3 = arrayList27;
                    } catch (Exception e12) {
                        e = e12;
                        arrayList3 = arrayList27;
                        arrayList2 = arrayList28;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i9 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i10 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i11 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (r15 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                    try {
                        notificationsCustomSettingsActivity.getMessagesStorage().getUsersInternal(arrayList16, arrayList3);
                    } catch (Exception e13) {
                        e = e13;
                        arrayList2 = arrayList28;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i9 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i10 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i11 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (r15 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
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
                    } catch (Exception e14) {
                        e = e14;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i9 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i10 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i11 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (r15 < size4) {
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
            } catch (Exception e15) {
                e = e15;
                arrayList2 = arrayList28;
                arrayList3 = arrayList27;
                arrayList4 = arrayList29;
            }
            size = arrayList2.size();
            for (i9 = 0; i9 < size; i9++) {
                TLRPC.Chat chat2 = arrayList2.get(i9);
                if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                    ek0 ek0Var4 = (ek0) longSparseArray.get(-chat2.id);
                    longSparseArray.remove(-chat2.id);
                    if (ek0Var4 != null) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            arrayList12.add(ek0Var4);
                        } else {
                            arrayList15.add(ek0Var4);
                        }
                    }
                }
            }
            size2 = arrayList3.size();
            for (i10 = 0; i10 < size2; i10++) {
                TLRPC.User user5 = arrayList3.get(i10);
                if (!user5.deleted) {
                    longSparseArray.remove(user5.id);
                }
            }
            size3 = arrayList4.size();
            for (i11 = 0; i11 < size3; i11++) {
                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i11).id));
            }
            size4 = longSparseArray.size();
            for (int i13 = 0; i13 < size4; i13++) {
                if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                    arrayList12.remove(longSparseArray.valueAt(i13));
                    arrayList15.remove(longSparseArray.valueAt(i13));
                } else {
                    arrayList11.remove(longSparseArray.valueAt(i13));
                }
            }
        } else {
            arrayList2 = arrayList28;
            arrayList3 = arrayList27;
            arrayList4 = arrayList29;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
    }

    public static void W(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view) {
        notificationsCustomSettingsActivity.actionBar.h(true);
        notificationsCustomSettingsActivity.j0(ek0Var, view, true);
    }

    public static boolean b0(int i9, long j10) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i9);
        StringBuilder sb2 = new StringBuilder(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY);
        sb2.append(j10);
        return notificationsSettings.contains(sb2.toString()) ? org.telegram.messenger.l0.v(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, j10, notificationsSettings, true) : notificationsSettings.contains("EnableAllStories") ? notificationsSettings.getBoolean("EnableAllStories", true) : h0(i9, j10);
    }

    public static boolean h0(int i9, long j10) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i9).hints);
        Collections.sort(arrayList, Comparator$-CC.comparingDouble(new gh.a1(4)));
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(i11)).peer) == j10) {
                i10 = i11;
            }
        }
        return i10 >= 0 && i10 >= arrayList.size() + (-5);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        boolean isGlobalNotificationsEnabled;
        yj0 yj0Var;
        int i9;
        int i10;
        ArrayList arrayList;
        boolean isEmpty = this.w.isEmpty();
        int i11 = this.s;
        if (isEmpty || i11 == 3) {
            int childCount = this.a.getChildCount();
            ArrayList arrayList2 = new ArrayList();
            if (i11 == 3) {
                Boolean bool = this.n;
                isGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = this.w) == null || arrayList.isEmpty());
            } else {
                isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(i11);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.a.getChildAt(i12);
                org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) this.a.T(childAt);
                this.a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList3 = this.E;
                    if (R < arrayList3.size()) {
                        yj0Var = (yj0) arrayList3.get(R);
                        boolean z10 = (yj0Var == null && ((i10 = yj0Var.c) == 102 || i10 == 101 || i10 == 100)) ? true : isGlobalNotificationsEnabled;
                        i9 = ik0Var.f;
                        View view = ik0Var.a;
                        if (i9 != 0) {
                            ((org.telegram.ui.Cells.m4) view).a(arrayList2, z10);
                        } else if (i9 == 1) {
                            ((org.telegram.ui.Cells.t8) view).e(arrayList2, z10);
                        } else if (i9 == 3) {
                            ((org.telegram.ui.Cells.v8) view).a(arrayList2, z10);
                        } else if (i9 == 5) {
                            ((org.telegram.ui.Cells.ba) view).a(arrayList2, z10);
                        }
                    }
                }
                yj0Var = null;
                if (yj0Var == null) {
                }
                i9 = ik0Var.f;
                View view2 = ik0Var.a;
                if (i9 != 0) {
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
            this.e.addListener(new bc0(this, 4));
            this.e.setDuration(150L);
            this.e.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.f = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.s == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 5));
        ArrayList arrayList = this.w;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.D = new uj0(this);
            a2.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.d = new bk0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.c = yyVar;
        yyVar.setTextSize(18);
        this.c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.c.c();
        frameLayout.addView(this.c, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.a = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setEmptyView(this.c);
        this.a.setLayoutManager(new f2.m0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var2 = this.a;
        zj0 zj0Var = new zj0(this, context);
        this.b = zj0Var;
        wk0Var2.setAdapter(zj0Var);
        this.a.setOnItemClickListener(new yr(29, this, context));
        wj0 wj0Var = new wj0(this);
        wj0Var.c = 150L;
        wj0Var.e = 350L;
        wj0Var.f = 0L;
        wj0Var.g = 0L;
        wj0Var.d = 0L;
        wj0Var.C = false;
        wj0Var.i = new OvershootInterpolator(1.1f);
        wj0Var.o = org.telegram.ui.Components.gr.h;
        wj0Var.m = false;
        this.a.setItemAnimator(wj0Var);
        this.a.setOnScrollListener(new l3(this, 22));
        return this.fragmentView;
    }

    public final void d0(ek0 ek0Var, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(ek0Var.d, 0L);
        getNotificationsSettings().edit().remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + sharedPrefKey).commit();
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(ek0Var);
        }
        ArrayList arrayList2 = this.w;
        if (arrayList2 != null) {
            arrayList2.remove(ek0Var);
        }
        if (h0(this.currentAccount, ek0Var.d)) {
            ek0Var.f = true;
            ek0Var.c = 0;
            this.v.add(ek0Var);
        }
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            vaVar.g(ek0Var, null, vaVar.O);
        }
        getNotificationsController().updateServerNotificationsSettings(ek0Var.d, 0L, false);
        k0(true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 != NotificationCenter.notificationsSettingsUpdated) {
            if (i9 == NotificationCenter.reloadHints) {
                i0();
            }
        } else {
            zj0 zj0Var = this.b;
            if (zj0Var != null) {
                zj0Var.l();
            }
        }
    }

    public final int e0() {
        int i9 = -16776961;
        int i10 = this.s;
        if (i10 == 0) {
            i9 = getNotificationsSettings().getInt("GroupLed", -16776961);
        } else if (i10 == 1) {
            i9 = getNotificationsSettings().getInt("MessagesLed", -16776961);
        } else if (i10 == 2) {
            i9 = getNotificationsSettings().getInt("ChannelLed", -16776961);
        } else if (i10 == 3) {
            i9 = getNotificationsSettings().getInt("StoriesLed", -16776961);
        } else if (i10 == 4 || i10 == 5) {
            i9 = getNotificationsSettings().getInt("ReactionsLed", -16776961);
        }
        for (int i11 = 0; i11 < 9; i11++) {
            if (org.telegram.ui.Cells.v8.f[i11] == i9) {
                return org.telegram.ui.Cells.v8.e[i11];
            }
        }
        return i9;
    }

    public final String f0() {
        int i9 = this.s;
        int i10 = i9 != 0 ? i9 != 1 ? i9 != 2 ? 0 : getNotificationsSettings().getInt("popupChannel", 0) : getNotificationsSettings().getInt("popupAll", 0) : getNotificationsSettings().getInt("popupGroup", 0);
        int[] iArr = this.A;
        return LocaleController.getString(iArr[Utilities.clamp(i10, iArr.length - 1, 0)]);
    }

    public final String g0() {
        int i9 = this.s;
        int i10 = i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? (i9 == 4 || i9 == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1 : getNotificationsSettings().getInt("priority_stories", 1) : getNotificationsSettings().getInt("priority_channel", 1) : getNotificationsSettings().getInt("priority_messages", 1) : getNotificationsSettings().getInt("priority_group", 1);
        int[] iArr = this.B;
        return LocaleController.getString(iArr[Utilities.clamp(i10, iArr.length - 1, 0)]);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 26);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.va.class, org.telegram.ui.Cells.j5.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.v6));
        return arrayList;
    }

    public final void i0() {
        ArrayList arrayList;
        if (this.s == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new cf0(10, this, arrayList));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(ek0 ek0Var, View view, boolean z10) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(ek0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean h02 = h0(this.currentAccount, ek0Var.d);
        ek0Var.c = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
        if (ek0Var.f) {
            ek0Var.f = false;
            edit.putBoolean(ta.b.d(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, sharedPrefKey), !z10).commit();
            ArrayList arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(ek0Var);
            }
            if (this.w == null) {
                this.w = new ArrayList();
            }
            this.w.add(0, ek0Var);
        } else if (h02) {
            edit.putBoolean(ta.b.d(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, sharedPrefKey), !z10).commit();
        } else {
            Boolean bool = this.n;
            if (!z10 ? bool == null || !bool.booleanValue() : bool != null && bool.booleanValue()) {
                d0(ek0Var, view);
                return;
            }
            edit.putBoolean(ta.b.d(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, sharedPrefKey), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            vaVar.g(ek0Var, null, vaVar.O);
        }
        getNotificationsController().updateServerNotificationsSettings(ek0Var.d, 0L, false);
        k0(true);
    }

    public final void k0(boolean z10) {
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
        ArrayList arrayList2 = this.D;
        arrayList2.clear();
        ArrayList arrayList3 = this.E;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i9 = this.s;
        if (i9 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            yj0 yj0Var = new yj0(0, true);
            yj0Var.e = string2;
            arrayList3.add(yj0Var);
            if (i9 == 3) {
                this.newRow = arrayList3.size();
                arrayList3.add(yj0.b(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList3.size();
                    arrayList3.add(yj0.b(102, LocaleController.getString(R.string.NotifyMeAboutImportantStories), this.r && ((bool = this.n) == null || !bool.booleanValue())));
                }
                arrayList3.add(yj0.d(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i9 == 4 || i9 == 5) {
                this.messagesRow = arrayList3.size();
                int i10 = R.drawable.msg_markunread;
                String string3 = LocaleController.getString(R.string.NotifyMeAboutMessagesReactions);
                String string4 = LocaleController.getString(!notificationsSettings.getBoolean("EnableReactionsMessages", true) ? R.string.NotifyFromNobody : notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone);
                boolean z11 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                yj0 yj0Var2 = new yj0(6, true);
                yj0Var2.c = 103;
                yj0Var2.d = i10;
                yj0Var2.e = string3;
                yj0Var2.f = string4;
                yj0Var2.i = z11;
                arrayList3.add(yj0Var2);
                this.storiesRow = arrayList3.size();
                int i11 = R.drawable.msg_stories_saved;
                String string5 = LocaleController.getString(R.string.NotifyMeAboutStoriesReactions);
                String string6 = LocaleController.getString(!notificationsSettings.getBoolean("EnableReactionsStories", true) ? R.string.NotifyFromNobody : notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone);
                boolean z12 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                yj0 yj0Var3 = new yj0(6, true);
                yj0Var3.c = 104;
                yj0Var3.d = i11;
                yj0Var3.e = string5;
                yj0Var3.f = string6;
                yj0Var3.i = z12;
                arrayList3.add(yj0Var3);
                arrayList3.add(yj0.d(-1, null));
            } else {
                int i12 = i9 == 1 ? R.string.NotifyMeAboutPrivate : i9 == 0 ? R.string.NotifyMeAboutGroups : R.string.NotifyMeAboutChannels;
                this.showRow = arrayList3.size();
                arrayList3.add(yj0.b(100, LocaleController.getString(i12), getNotificationsController().isGlobalNotificationsEnabled(i9)));
                arrayList3.add(yj0.d(-1, null));
            }
            String string7 = LocaleController.getString(R.string.SETTINGS);
            yj0 yj0Var4 = new yj0(0, true);
            yj0Var4.e = string7;
            arrayList3.add(yj0Var4);
            arrayList3.size();
            if (i9 == 3) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(yj0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i9 == 4 || i9 == 5) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(yj0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                boolean z13 = i9 != 0 ? i9 != 1 ? i9 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true) : notificationsSettings.getBoolean("EnablePreviewAll", true) : notificationsSettings.getBoolean("EnablePreviewGroup", true);
                this.previewRow = arrayList3.size();
                arrayList3.add(yj0.b(0, LocaleController.getString(R.string.MessagePreview), z13));
            }
            this.soundRow = arrayList3.size();
            String string8 = LocaleController.getString("Sound", R.string.Sound);
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String string9 = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            if (i9 == 0) {
                string = notificationsSettings2.getString("GroupSound", string9);
                j10 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            } else if (i9 == 1) {
                string = notificationsSettings2.getString("GlobalSound", string9);
                j10 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
            } else if (i9 == 3) {
                string = notificationsSettings2.getString("StoriesSound", string9);
                j10 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
            } else if (i9 == 4 || i9 == 5) {
                string = notificationsSettings2.getString("ReactionSound", string9);
                j10 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
            } else {
                string = notificationsSettings2.getString("ChannelSound", string9);
                j10 = notificationsSettings2.getLong("ChannelDocId", 0L);
            }
            if (j10 != 0) {
                TLRPC.Document c10 = getMediaDataController().ringtoneDataStore.c(j10);
                string = c10 == null ? LocaleController.getString("CustomSound", R.string.CustomSound) : kk0.Z(c10, FileLoader.getDocumentFileName(c10));
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            }
            arrayList3.add(yj0.c(3, string8, string));
            if (this.C) {
                this.lightColorRow = arrayList3.size();
                String string10 = LocaleController.getString("LedColor", R.string.LedColor);
                int e02 = e0();
                yj0 yj0Var5 = new yj0(3, true);
                yj0Var5.e = string10;
                yj0Var5.h = e02;
                arrayList3.add(yj0Var5);
                int i13 = i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? (i9 == 4 || i9 == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0 : notificationsSettings.getInt("vibrate_stories", 0) : notificationsSettings.getInt("vibrate_channel", 0) : notificationsSettings.getInt("vibrate_messages", 0) : notificationsSettings.getInt("vibrate_group", 0);
                this.vibrateRow = arrayList3.size();
                String string11 = LocaleController.getString("Vibrate", R.string.Vibrate);
                int[] iArr = this.y;
                arrayList3.add(yj0.c(1, string11, LocaleController.getString(iArr[Utilities.clamp(i13, iArr.length - 1, 0)])));
                if (i9 == 1 || i9 == 0) {
                    this.popupRow = arrayList3.size();
                    arrayList3.add(yj0.c(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), f0()));
                }
                this.priorityRow = arrayList3.size();
                arrayList3.add(yj0.c(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), g0()));
                String string12 = LocaleController.getString(R.string.NotifyLessOptions);
                yj0 yj0Var6 = new yj0(8, true);
                yj0Var6.e = string12;
                yj0Var6.d = 0;
                arrayList3.add(yj0Var6);
            } else {
                String string13 = LocaleController.getString(R.string.NotifyMoreOptions);
                yj0 yj0Var7 = new yj0(8, true);
                yj0Var7.e = string13;
                yj0Var7.d = 1;
                arrayList3.add(yj0Var7);
            }
            arrayList3.size();
            arrayList3.add(yj0.d(-2, null));
        }
        if (i9 != 4 && i9 != 5) {
            if (i9 != -1) {
                this.addExceptionRow = arrayList3.size();
                int i14 = R.drawable.msg_contact_add;
                String string14 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                yj0 yj0Var8 = new yj0(7, true);
                yj0Var8.c = 6;
                yj0Var8.d = i14;
                yj0Var8.e = string14;
                arrayList3.add(yj0Var8);
            }
            arrayList3.size();
            if (this.v != null && this.h) {
                for (int i15 = 0; i15 < this.v.size(); i15++) {
                    ek0 ek0Var = (ek0) this.v.get(i15);
                    yj0 yj0Var9 = new yj0(2, true);
                    yj0Var9.g = ek0Var;
                    arrayList3.add(yj0Var9);
                }
            }
            if (this.w != null) {
                for (int i16 = 0; i16 < this.w.size(); i16++) {
                    ek0 ek0Var2 = (ek0) this.w.get(i16);
                    yj0 yj0Var10 = new yj0(2, true);
                    yj0Var10.g = ek0Var2;
                    arrayList3.add(yj0Var10);
                }
            }
            arrayList3.size();
            if (i9 != -1 || ((arrayList = this.w) != null && !arrayList.isEmpty())) {
                arrayList3.add(yj0.d(-3, null));
            }
            ArrayList arrayList4 = this.w;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                this.deleteExceptionsRow = arrayList3.size();
                String string15 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                yj0 yj0Var11 = new yj0(7, true);
                yj0Var11.c = 7;
                yj0Var11.d = 0;
                yj0Var11.e = string15;
                arrayList3.add(yj0Var11);
            }
        }
        zj0 zj0Var = this.b;
        if (zj0Var != null) {
            if (z10) {
                zj0Var.E(arrayList2, arrayList3);
            } else {
                zj0Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                str = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? LocaleController.getString("SoundDefault", R.string.SoundDefault) : ringtone.getTitle(getParentActivity());
                ringtone.stop();
            }
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            int i11 = this.s;
            if (i11 == 1) {
                if (str == null || uri == null) {
                    edit.putString("GlobalSound", "NoSound");
                    edit.putString("GlobalSoundPath", "NoSound");
                } else {
                    edit.putString("GlobalSound", str);
                    edit.putString("GlobalSoundPath", uri.toString());
                }
            } else if (i11 == 0) {
                if (str == null || uri == null) {
                    edit.putString("GroupSound", "NoSound");
                    edit.putString("GroupSoundPath", "NoSound");
                } else {
                    edit.putString("GroupSound", str);
                    edit.putString("GroupSoundPath", uri.toString());
                }
            } else if (i11 == 2) {
                if (str == null || uri == null) {
                    edit.putString("ChannelSound", "NoSound");
                    edit.putString("ChannelSoundPath", "NoSound");
                } else {
                    edit.putString("ChannelSound", str);
                    edit.putString("ChannelSoundPath", uri.toString());
                }
            } else if (i11 == 3) {
                if (str == null || uri == null) {
                    edit.putString("StoriesSound", "NoSound");
                    edit.putString("StoriesSoundPath", "NoSound");
                } else {
                    edit.putString("StoriesSound", str);
                    edit.putString("StoriesSoundPath", uri.toString());
                }
            }
            getNotificationsController().deleteNotificationChannelGlobal(i11);
            edit.commit();
            getNotificationsController().updateServerNotificationsSettings(i11);
            f2.q1 K = this.a.K(i9);
            if (K != null) {
                this.b.v(K, i9);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        k0(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
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
        k0(true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        zj0 zj0Var = this.b;
        if (zj0Var != null) {
            zj0Var.l();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }
}
