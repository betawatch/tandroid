package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final int[] E;
    public final int[] F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.mm0 a;
    public int addExceptionRow;
    public jk0 b;
    public org.telegram.ui.Components.uz c;
    public lk0 d;
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

    public NotificationsCustomSettingsActivity(int i10, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.x = new HashMap();
        this.y = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.E = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i11 = R.string.NotificationsPriorityHigh;
        int i12 = R.string.NotificationsPriorityUrgent;
        int i13 = R.string.NotificationsPriorityMedium;
        this.F = new int[]{i11, i12, i12, i13, R.string.NotificationsPriorityLow, i13};
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
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.s = i10;
        this.v = arrayList2;
        this.w = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                ok0 ok0Var = (ok0) this.w.get(i14);
                this.x.put(Long.valueOf(ok0Var.d), ok0Var);
            }
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                ok0 ok0Var2 = (ok0) this.v.get(i15);
                this.x.put(Long.valueOf(ok0Var2.d), ok0Var2);
            }
        }
        if (z10) {
            k0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context, View view, int i10, float f7, float f10) {
        HashMap hashMap;
        ok0 ok0Var;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        int i11;
        Drawable drawable;
        boolean z12;
        boolean z13;
        ok0 ok0Var2;
        boolean z14;
        ok0 ok0Var3;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
        ArrayList arrayList2 = notificationsCustomSettingsActivity2.I;
        HashMap hashMap2 = notificationsCustomSettingsActivity2.x;
        int i12 = notificationsCustomSettingsActivity2.s;
        if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
            return;
        }
        ik0 ik0Var = (notificationsCustomSettingsActivity2.a.getAdapter() != notificationsCustomSettingsActivity2.b || i10 < 0 || i10 >= arrayList2.size()) ? null : (ik0) arrayList2.get(i10);
        boolean z15 = true;
        if (ik0Var != null && ik0Var.a == 8) {
            notificationsCustomSettingsActivity2.G = !notificationsCustomSettingsActivity2.G;
            notificationsCustomSettingsActivity2.m0(true);
            return;
        }
        if (i12 != 3 || ik0Var == null) {
            hashMap = hashMap2;
        } else {
            hashMap = hashMap2;
            ok0 ok0Var4 = ik0Var.g;
            if (ok0Var4 != null) {
                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(notificationsCustomSettingsActivity2, view);
                H.i = 3;
                H.m(R.drawable.msg_mute, new bk0(notificationsCustomSettingsActivity2, ok0Var4, view, i10, 5), LocaleController.getString(R.string.NotificationsStoryMute), ok0Var4.c <= 0 || ok0Var4.f, false);
                H.m(R.drawable.msg_unmute, new bk0(notificationsCustomSettingsActivity, ok0Var4, view, i10, 0), LocaleController.getString(R.string.NotificationsStoryUnmute), ok0Var4.c > 0 || ok0Var4.f, false);
                H.m(R.drawable.msg_delete, new bk0(notificationsCustomSettingsActivity, ok0Var4, view, i10, 1), LocaleController.getString("DeleteException", R.string.DeleteException), !ok0Var4.f, true);
                H.W(notificationsCustomSettingsActivity.a.V0(view, false));
                H.Z();
                return;
            }
        }
        if (i12 == 3) {
            s4.h0 adapter = notificationsCustomSettingsActivity2.a.getAdapter();
            lk0 lk0Var = notificationsCustomSettingsActivity2.d;
            if (adapter == lk0Var) {
                Object E = lk0Var.E(i10);
                if (E instanceof ok0) {
                    ok0Var3 = (ok0) E;
                } else {
                    boolean z16 = E instanceof TLRPC.User;
                    long j10 = z16 ? ((TLRPC.User) E).id : -((TLRPC.Chat) E).id;
                    if (!hashMap.containsKey(Long.valueOf(j10))) {
                        ok0 ok0Var5 = new ok0();
                        ok0Var5.e = true;
                        ok0Var5.d = j10;
                        if (z16) {
                            ok0Var5.d = ((TLRPC.User) E).id;
                        } else {
                            ok0Var5.d = -((TLRPC.Chat) E).id;
                        }
                        ok0Var2 = ok0Var5;
                        z14 = true;
                        if (ok0Var2 != null) {
                            return;
                        }
                        org.telegram.ui.Components.k80 H2 = org.telegram.ui.Components.k80.H(notificationsCustomSettingsActivity2, view);
                        H2.i = 3;
                        H2.m(R.drawable.msg_mute, new bk0(notificationsCustomSettingsActivity2, ok0Var2, view, z14, 2), LocaleController.getString(R.string.NotificationsStoryMute), ok0Var2.c <= 0 || ok0Var2.f, false);
                        H2.m(R.drawable.msg_unmute, new bk0(notificationsCustomSettingsActivity, ok0Var2, view, z14, 3), LocaleController.getString(R.string.NotificationsStoryUnmute), ok0Var2.c > 0 || ok0Var2.f, false);
                        H2.m(R.drawable.msg_delete, new bk0(notificationsCustomSettingsActivity, ok0Var2, view, i10, 4), LocaleController.getString("DeleteException", R.string.DeleteException), (z14 || ok0Var2.f) ? false : true, true);
                        H2.W(notificationsCustomSettingsActivity.a.V0(view, false));
                        H2.Z();
                        return;
                    }
                    ok0Var3 = (ok0) hashMap.get(Long.valueOf(j10));
                }
                ok0Var2 = ok0Var3;
                z14 = false;
                if (ok0Var2 != null) {
                }
            }
        }
        if (notificationsCustomSettingsActivity2.a.getAdapter() == notificationsCustomSettingsActivity2.d || !(ik0Var == null || ik0Var.g == null)) {
            s4.h0 adapter2 = notificationsCustomSettingsActivity2.a.getAdapter();
            lk0 lk0Var2 = notificationsCustomSettingsActivity2.d;
            if (adapter2 == lk0Var2) {
                Object E2 = lk0Var2.E(i10);
                if (E2 instanceof ok0) {
                    arrayList = notificationsCustomSettingsActivity2.d.d;
                    ok0Var = (ok0) E2;
                    z11 = false;
                } else {
                    boolean z17 = E2 instanceof TLRPC.User;
                    long j11 = z17 ? ((TLRPC.User) E2).id : -((TLRPC.Chat) E2).id;
                    if (hashMap.containsKey(Long.valueOf(j11))) {
                        ok0Var = (ok0) hashMap.get(Long.valueOf(j11));
                        z11 = false;
                    } else {
                        ok0 ok0Var6 = new ok0();
                        ok0Var6.d = j11;
                        if (z17) {
                            ok0Var6.d = ((TLRPC.User) E2).id;
                        } else {
                            ok0Var6.d = -((TLRPC.Chat) E2).id;
                        }
                        ok0Var = ok0Var6;
                        z11 = true;
                    }
                    arrayList = notificationsCustomSettingsActivity2.w;
                }
                z10 = z11;
            } else {
                ok0Var = ik0Var.g;
                if (ok0Var.f) {
                    return;
                }
                arrayList = notificationsCustomSettingsActivity2.w;
                z10 = false;
            }
            ok0 ok0Var7 = ok0Var;
            ArrayList arrayList3 = arrayList;
            if (ok0Var7 == null) {
                return;
            }
            long j12 = ok0Var7.d;
            org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context, notificationsCustomSettingsActivity2.currentAccount, null, true, new fk0(notificationsCustomSettingsActivity2, j12, NotificationsController.getInstance(notificationsCustomSettingsActivity2.currentAccount).isGlobalNotificationsEnabled(j12, false, false), ok0Var7, z10, i10, arrayList3), notificationsCustomSettingsActivity.getResourceProvider());
            bpVar.e(j12, 0, null);
            bpVar.d(notificationsCustomSettingsActivity, view, f7, f10, false);
            return;
        }
        if (ik0Var == null) {
            return;
        }
        int i13 = ik0Var.c;
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
            cy cyVar = new cy(bundle);
            cyVar.C2 = new ck0(notificationsCustomSettingsActivity2);
            notificationsCustomSettingsActivity2.presentFragment(cyVar);
            return;
        }
        if (i13 == 7) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            String string = LocaleController.getString("NotificationsDeleteAllExceptionTitle", R.string.NotificationsDeleteAllExceptionTitle);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = LocaleController.getString("NotificationsDeleteAllExceptionAlert", R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new ck0(notificationsCustomSettingsActivity2));
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            notificationsCustomSettingsActivity2.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
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
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i12);
                notificationsCustomSettingsActivity2.m0(true);
                boolean z20 = notificationsCustomSettingsActivity2.h;
                if (z20 != (notificationsCustomSettingsActivity2.n == null) && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z20;
                    notificationsCustomSettingsActivity2.m0(true);
                }
                notificationsCustomSettingsActivity2.e0();
                return;
            }
            if (!isGlobalNotificationsEnabled) {
                notificationsCustomSettingsActivity2.getNotificationsController().setGlobalNotificationsEnabled(i12, 0);
                notificationsCustomSettingsActivity2.m0(true);
                return;
            }
            final ArrayList arrayList4 = notificationsCustomSettingsActivity2.w;
            final ArrayList arrayList5 = notificationsCustomSettingsActivity2.v;
            int i16 = notificationsCustomSettingsActivity2.currentAccount;
            final wa waVar = new wa(notificationsCustomSettingsActivity2, i14);
            Pattern pattern = org.telegram.ui.Components.g5.a;
            if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
                return;
            }
            final boolean isGlobalNotificationsEnabled2 = NotificationsController.getInstance(i16).isGlobalNotificationsEnabled(0L, false, false);
            String[] strArr = {LocaleController.getString(R.string.NotificationsTurnOn), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0])), null, LocaleController.getString(R.string.NotificationsTurnOff)};
            int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
            LinearLayout linearLayout = new LinearLayout(notificationsCustomSettingsActivity2.getParentActivity());
            linearLayout.setOrientation(1);
            final AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            int i17 = 0;
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity2;
            while (i17 < 5) {
                if (strArr[i17] == null) {
                    i11 = i16;
                    z12 = z15;
                } else {
                    TextView textView2 = new TextView(notificationsCustomSettingsActivity3.getParentActivity());
                    boolean z21 = r12;
                    Drawable drawable2 = notificationsCustomSettingsActivity3.getParentActivity().getResources().getDrawable(iArr[i17]);
                    if (i17 == 4) {
                        drawable = null;
                        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q7, null);
                        i11 = i16;
                        org.telegram.ui.ActionBar.f7.y(textView2, drawable2, org.telegram.ui.ActionBar.y6.p7, null, PorterDuff.Mode.MULTIPLY);
                    } else {
                        i11 = i16;
                        drawable = null;
                        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.j5, null);
                        org.telegram.ui.ActionBar.f7.y(textView2, drawable2, org.telegram.ui.ActionBar.y6.J5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    z12 = true;
                    org.telegram.messenger.vh.r(textView2, 1, 16.0f, 1, 1);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, drawable, drawable);
                    textView2.setTag(Integer.valueOf(i17));
                    textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(z21));
                    textView2.setPadding(AndroidUtilities.dp(24.0f), z21 ? 1 : 0, AndroidUtilities.dp(24.0f), z21 ? 1 : 0);
                    textView2.setSingleLine(true);
                    textView2.setGravity(19);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(26.0f));
                    textView2.setText(strArr[i17]);
                    linearLayout.addView(textView2, org.telegram.ui.Components.gb1.u(-1, 48, 51));
                    final NotificationsCustomSettingsActivity notificationsCustomSettingsActivity4 = notificationsCustomSettingsActivity3;
                    final int i18 = i11;
                    View.OnClickListener onClickListener = new View.OnClickListener(i18, isGlobalNotificationsEnabled2, i15, notificationsCustomSettingsActivity4, arrayList4, arrayList5, waVar, alertDialog$Builder2) { // from class: org.telegram.ui.Components.v2
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ NotificationsCustomSettingsActivity c;
                        public final /* synthetic */ ArrayList d;
                        public final /* synthetic */ ArrayList e;
                        public final /* synthetic */ org.telegram.ui.wa f;
                        public final /* synthetic */ AlertDialog$Builder h;

                        {
                            this.b = i15;
                            this.c = notificationsCustomSettingsActivity4;
                            this.d = arrayList4;
                            this.e = arrayList5;
                            this.f = waVar;
                            this.h = alertDialog$Builder2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i19;
                            int intValue = ((Integer) view2.getTag()).intValue();
                            int i20 = this.a;
                            int i21 = this.b;
                            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity5 = this.c;
                            int i22 = 3;
                            if (intValue == 0) {
                                NotificationsController.getInstance(i20).setGlobalNotificationsEnabled(i21, 0);
                            } else if (intValue == 3) {
                                notificationsCustomSettingsActivity5.presentFragment(new NotificationsCustomSettingsActivity(i21, this.d, this.e, false));
                            } else {
                                int currentTime = ConnectionsManager.getInstance(i20).getCurrentTime();
                                if (intValue == 1) {
                                    currentTime += 3600;
                                } else if (intValue == 2) {
                                    currentTime += 172800;
                                } else if (intValue == 4) {
                                    i19 = Integer.MAX_VALUE;
                                    NotificationsController.getInstance(i20).muteUntil(0L, 0, i19);
                                    NotificationsController.getInstance(i20).setGlobalNotificationsEnabled(i21, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                }
                                i19 = currentTime;
                                NotificationsController.getInstance(i20).muteUntil(0L, 0, i19);
                                NotificationsController.getInstance(i20).setGlobalNotificationsEnabled(i21, ConnectionsManager.DEFAULT_DATACENTER_ID);
                            }
                            this.f.run(intValue);
                            this.h.a.N0.run();
                            if (intValue == 0) {
                                i22 = 4;
                            } else if (intValue == 1) {
                                i22 = 0;
                            } else if (intValue == 2) {
                                i22 = 2;
                            } else if (intValue != 4) {
                                i22 = -1;
                            }
                            if (i22 < 0 || !wc.a(notificationsCustomSettingsActivity5)) {
                                return;
                            }
                            wc.z(notificationsCustomSettingsActivity5, i22, 0, null).j();
                        }
                    };
                    notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity4;
                    textView2.setOnClickListener(onClickListener);
                }
                i17++;
                z15 = z12;
                i16 = i11;
                r12 = false;
                notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity3;
            }
            String string2 = LocaleController.getString(R.string.Notifications);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
            e2Var2.R = string2;
            alertDialog$Builder2.o(linearLayout);
            notificationsCustomSettingsActivity3.showDialog(e2Var2);
            return;
        }
        if (i13 == 3) {
            if (view.isEnabled()) {
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, i12);
                    notificationsCustomSettingsActivity2.presentFragment(new tk0(bundle2, notificationsCustomSettingsActivity2.getResourceProvider()));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (ik0Var.a == 3) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.g5.t(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new dk0(notificationsCustomSettingsActivity2, view, i10, 0), null));
                return;
            }
            return;
        }
        if (i13 == 2) {
            if (view.isEnabled()) {
                Activity parentActivity = notificationsCustomSettingsActivity2.getParentActivity();
                dk0 dk0Var = new dk0(notificationsCustomSettingsActivity2, view, i10, 1);
                Pattern pattern2 = org.telegram.ui.Components.g5.a;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
                int[] iArr2 = new int[1];
                if (i12 == 1) {
                    iArr2[0] = notificationsSettings.getInt("popupAll", 0);
                } else if (i12 == 0) {
                    iArr2[0] = notificationsSettings.getInt("popupGroup", 0);
                } else {
                    iArr2[0] = notificationsSettings.getInt("popupChannel", 0);
                }
                String[] strArr2 = {LocaleController.getString(R.string.NoPopup), LocaleController.getString(R.string.OnlyWhenScreenOn), LocaleController.getString(R.string.OnlyWhenScreenOff), LocaleController.getString(R.string.AlwaysShowPopup)};
                LinearLayout f11 = org.telegram.messenger.t.f(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity);
                int i19 = 0;
                while (i19 < 4) {
                    org.telegram.ui.Cells.p6 p6Var = new org.telegram.ui.Cells.p6(parentActivity, null);
                    p6Var.setTag(Integer.valueOf(i19));
                    p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    org.telegram.ui.Components.g5.a(p6Var, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.E5, null);
                    p6Var.b(strArr2[i19], iArr2[0] == i19);
                    f11.addView(p6Var);
                    p6Var.setOnClickListener(new di.c6(iArr2, i12, alertDialog$Builder3, dk0Var, 2));
                    i19++;
                }
                String string3 = LocaleController.getString(R.string.PopupNotification);
                org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.a;
                e2Var3.R = string3;
                alertDialog$Builder3.o(f11);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Cancel), null);
                notificationsCustomSettingsActivity2.showDialog(e2Var3);
                return;
            }
            return;
        }
        if (i13 == 1) {
            if (view.isEnabled()) {
                String str = i12 == 1 ? "vibrate_messages" : i12 == 0 ? "vibrate_group" : i12 == 3 ? "vibrate_stories" : (i12 == 4 || i12 == 5) ? "vibrate_react" : "vibrate_channel";
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.g5.X(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0L, str, new org.telegram.ui.Components.zr0(notificationsCustomSettingsActivity2, view, str, i10, 10), null));
                return;
            }
            return;
        }
        if (i13 == 4) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.g5.H(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new dk0(notificationsCustomSettingsActivity2, view, i10, 2), null));
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
                    ik0Var.i = true;
                } else {
                    edit2.putBoolean("EnableAllStories", false);
                    notificationsCustomSettingsActivity2.n = Boolean.FALSE;
                    notificationsCustomSettingsActivity2.r = false;
                    ik0Var.i = false;
                }
                if (view instanceof org.telegram.ui.Cells.a9) {
                    ((org.telegram.ui.Cells.a9) view).setChecked(notificationsCustomSettingsActivity2.r);
                }
                edit2.commit();
                boolean z22 = notificationsCustomSettingsActivity2.r;
                boolean z23 = notificationsCustomSettingsActivity2.h;
                if (z22 != z23 && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z23;
                    notificationsCustomSettingsActivity2.m0(true);
                }
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i12);
                notificationsCustomSettingsActivity2.e0();
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
                if (view instanceof org.telegram.ui.Cells.a9) {
                    ((org.telegram.ui.Cells.a9) view).setChecked(!z13);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 103 || i13 == 104) {
            boolean z24 = !LocaleController.isRTL ? f7 <= ((float) (view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) : f7 >= ((float) AndroidUtilities.dp(76.0f));
            SharedPreferences notificationsSettings4 = notificationsCustomSettingsActivity2.getNotificationsSettings();
            if (z24) {
                String str2 = ik0Var.c == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                SharedPreferences.Editor edit4 = notificationsSettings4.edit();
                edit4.putBoolean(str2, !notificationsSettings4.getBoolean(str2, true));
                edit4.apply();
                notificationsCustomSettingsActivity2.m0(true);
                notificationsCustomSettingsActivity2.getNotificationsController().updateServerNotificationsSettings(i12);
                return;
            }
            String str3 = ik0Var.c == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
            LinearLayout d = org.telegram.messenger.vh.d(context, 1);
            boolean[] zArr = {notificationsSettings4.getBoolean(str3, false)};
            org.telegram.ui.Cells.p6[] p6VarArr = new org.telegram.ui.Cells.p6[2];
            int i20 = 0;
            while (i20 < 2) {
                org.telegram.ui.Cells.p6 p6Var2 = new org.telegram.ui.Cells.p6(context, notificationsCustomSettingsActivity2.getResourceProvider());
                p6VarArr[i20] = p6Var2;
                p6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                p6VarArr[i20].a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.g7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E5, false));
                p6VarArr[i20].b(LocaleController.getString(i20 == 0 ? R.string.NotifyAboutReactionsFromEveryone : R.string.NotifyAboutReactionsFromContacts), i20 == 0 ? !zArr[0] : zArr[0]);
                org.telegram.ui.Cells.p6 p6Var3 = p6VarArr[i20];
                int i21 = org.telegram.ui.ActionBar.y6.i6;
                org.telegram.ui.ActionBar.f7.R(p6Var3, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i21, false), 2, -1), null, org.telegram.ui.ActionBar.f7.N(i21), null);
                d.addView(p6VarArr[i20]);
                p6VarArr[i20].setOnClickListener(new bi.pa(zArr, i20, p6VarArr, 16));
                i20++;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity(), 0, notificationsCustomSettingsActivity2.resourceProvider);
            String string4 = LocaleController.getString(R.string.NotifyAboutReactionsFrom);
            org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder4.a;
            e2Var4.R = string4;
            alertDialog$Builder4.o(d);
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Save), new a1.d(notificationsCustomSettingsActivity2, notificationsSettings4, str3, zArr, 16));
            notificationsCustomSettingsActivity2.showDialog(e2Var4);
        }
    }

    public static void W(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ok0 ok0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.f(true);
        notificationsCustomSettingsActivity.l0(ok0Var, view, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:89|(2:103|104)(2:91|(2:102|99)(1:93))|94|95|96|97|98|99) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029f, code lost:
    
        if (r11.deleted != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x037f A[LOOP:5: B:189:0x037d->B:190:0x037f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void X(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList) {
        boolean z10;
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
                    ok0 ok0Var = new ok0();
                    ok0Var.d = longValue2;
                    arrayList10 = arrayList21;
                    ArrayList arrayList24 = arrayList12;
                    ok0Var.b = org.telegram.messenger.t.x(NotificationsSettingsFacade.PROPERTY_CUSTOM, longValue2, notificationsSettings, false);
                    int intValue = ((Integer) next.getValue()).intValue();
                    ok0Var.c = intValue;
                    if (intValue != 0) {
                        Integer num = (Integer) all.get(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + replace);
                        if (num != null) {
                            ok0Var.a = num.intValue();
                        }
                    }
                    if (DialogObject.isEncryptedDialog(longValue2)) {
                        int encryptedChatId = DialogObject.getEncryptedChatId(longValue2);
                        TLRPC.EncryptedChat encryptedChat = notificationsCustomSettingsActivity.getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                        if (encryptedChat == null) {
                            arrayList18.add(Integer.valueOf(encryptedChatId));
                            longSparseArray.put(longValue2, ok0Var);
                        } else {
                            TLRPC.User user = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                            if (user == null) {
                                arrayList16.add(Long.valueOf(encryptedChat.user_id));
                                longSparseArray.put(encryptedChat.user_id, ok0Var);
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
                        arrayList11.add(ok0Var);
                        arrayList12 = arrayList24;
                    } else if (DialogObject.isUserDialog(longValue2)) {
                        TLRPC.User user2 = notificationsCustomSettingsActivity.getMessagesController().getUser(parseLong2);
                        if (user2 == null) {
                            arrayList16.add(parseLong2);
                            longSparseArray.put(longValue2, ok0Var);
                        } else if (user2.deleted) {
                            it = it2;
                            arrayList20 = arrayList22;
                            arrayList19 = arrayList9;
                            arrayList14 = arrayList8;
                            arrayList13 = arrayList7;
                            arrayList21 = arrayList10;
                            arrayList12 = arrayList24;
                        }
                        arrayList11.add(ok0Var);
                        arrayList12 = arrayList24;
                    } else {
                        long j11 = -longValue2;
                        TLRPC.Chat chat = notificationsCustomSettingsActivity.getMessagesController().getChat(Long.valueOf(j11));
                        if (chat == null) {
                            arrayList17.add(Long.valueOf(j11));
                            longSparseArray.put(longValue2, ok0Var);
                        } else if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                                arrayList12 = arrayList24;
                                arrayList12.add(ok0Var);
                            } else {
                                arrayList15.add(ok0Var);
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
                }
                if (longValue != 0 && longValue != j10) {
                    ok0 ok0Var2 = new ok0();
                    ok0Var2.d = longValue;
                    ok0Var2.e = true;
                    ok0Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user3 = notificationsCustomSettingsActivity.getMessagesController().getUser(parseLong);
                        if (user3 == null) {
                            arrayList16.add(parseLong);
                            longSparseArray.put(longValue, ok0Var2);
                        } else if (user3.deleted) {
                        }
                        arrayList6 = arrayList25;
                        arrayList6.add(ok0Var2);
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
            Collections.sort(arrayList, Comparator$-CC.comparingDouble(new bi.m1(5)));
            int max = Math.max(0, arrayList.size() - 6);
            while (max < arrayList.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(max)).peer);
                if (!hashSet.contains(Long.valueOf(peerDialogId))) {
                    ok0 ok0Var3 = new ok0();
                    ok0Var3.d = peerDialogId;
                    ok0Var3.e = z10;
                    ok0Var3.c = 0;
                    ok0Var3.f = z10;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user4 = notificationsCustomSettingsActivity.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        if (user4 == null) {
                            arrayList16.add(Long.valueOf(peerDialogId));
                            longSparseArray.put(peerDialogId, ok0Var3);
                        }
                        i13 = max;
                        arrayList5 = arrayList26;
                        arrayList5.add(0, ok0Var3);
                        hashSet.add(Long.valueOf(peerDialogId));
                        arrayList26 = arrayList5;
                        max = i13 + 1;
                        z10 = true;
                    }
                }
                i13 = max;
                arrayList5 = arrayList26;
                arrayList26 = arrayList5;
                max = i13 + 1;
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
                    } catch (Exception e) {
                        e = e;
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.v51(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                    try {
                        notificationsCustomSettingsActivity.getMessagesStorage().getEncryptedChatsInternal(TextUtils.join(",", arrayList18), arrayList4, arrayList16);
                    } catch (Exception e10) {
                        e = e10;
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.v51(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.v51(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.v51(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.v51(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
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
                    ok0 ok0Var4 = (ok0) longSparseArray.get(-chat2.id);
                    longSparseArray.remove(-chat2.id);
                    if (ok0Var4 != null) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            arrayList12.add(ok0Var4);
                        } else {
                            arrayList15.add(ok0Var4);
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
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.v51(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
    }

    public static void Y(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ok0 ok0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.f(true);
        notificationsCustomSettingsActivity.l0(ok0Var, view, true);
    }

    public static boolean d0(int i10, long j10) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY);
        sb2.append(j10);
        return notificationsSettings.contains(sb2.toString()) ? org.telegram.messenger.t.x(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, j10, notificationsSettings, true) : notificationsSettings.contains("EnableAllStories") ? notificationsSettings.getBoolean("EnableAllStories", true) : j0(i10, j10);
    }

    public static boolean j0(int i10, long j10) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).hints);
        Collections.sort(arrayList, Comparator$-CC.comparingDouble(new bi.m1(4)));
        int i11 = -1;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(i12)).peer) == j10) {
                i11 = i12;
            }
        }
        return i11 >= 0 && i11 >= arrayList.size() + (-5);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.s == -1) {
            this.simpleActionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 16));
        ArrayList arrayList = this.w;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
            a2.N();
            a2.z0 = new ek0(this);
            a2.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.d = new lk0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.c = uzVar;
        uzVar.setTextSize(18);
        this.c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.c.c();
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.a = mm0Var;
        mm0Var.u1();
        this.a.setEmptyView(this.c);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new s4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.c, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        org.telegram.ui.Components.mm0 mm0Var2 = this.a;
        jk0 jk0Var = new jk0(this, context);
        this.b = jk0Var;
        mm0Var2.setAdapter(jk0Var);
        this.a.setOnItemClickListener(new af0(1, this, context));
        gk0 gk0Var = new gk0(this);
        gk0Var.c = 150L;
        gk0Var.e = 350L;
        gk0Var.f = 0L;
        gk0Var.g = 0L;
        gk0Var.d = 0L;
        gk0Var.C = false;
        gk0Var.i = new OvershootInterpolator(1.1f);
        gk0Var.o = org.telegram.ui.Components.ds.h;
        gk0Var.m = false;
        this.a.setItemAnimator(gk0Var);
        this.a.setOnScrollListener(new i3(this, 23));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.notificationsSettingsUpdated) {
            if (i10 == NotificationCenter.reloadHints) {
                k0();
            }
        } else {
            jk0 jk0Var = this.b;
            if (jk0Var != null) {
                jk0Var.l();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0() {
        boolean isGlobalNotificationsEnabled;
        ik0 ik0Var;
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
                org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) this.a.T(childAt);
                this.a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList3 = this.I;
                    if (R < arrayList3.size()) {
                        ik0Var = (ik0) arrayList3.get(R);
                        boolean z10 = (ik0Var == null && ((i11 = ik0Var.c) == 102 || i11 == 101 || i11 == 100)) ? true : isGlobalNotificationsEnabled;
                        i10 = vl0Var.f;
                        View view = vl0Var.a;
                        if (i10 != 0) {
                            ((org.telegram.ui.Cells.q4) view).a(arrayList2, z10);
                        } else if (i10 == 1) {
                            ((org.telegram.ui.Cells.a9) view).e(arrayList2, z10);
                        } else if (i10 == 3) {
                            ((org.telegram.ui.Cells.c9) view).a(arrayList2, z10);
                        } else if (i10 == 5) {
                            ((org.telegram.ui.Cells.ga) view).a(arrayList2, z10);
                        }
                    }
                }
                ik0Var = null;
                if (ik0Var == null) {
                }
                i10 = vl0Var.f;
                View view2 = vl0Var.a;
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
            this.e.addListener(new i50(this, 7));
            this.e.setDuration(150L);
            this.e.start();
        }
    }

    public final void f0(ok0 ok0Var, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(ok0Var.d, 0L);
        getNotificationsSettings().edit().remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + sharedPrefKey).commit();
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(ok0Var);
        }
        ArrayList arrayList2 = this.w;
        if (arrayList2 != null) {
            arrayList2.remove(ok0Var);
        }
        if (j0(this.currentAccount, ok0Var.d)) {
            ok0Var.f = true;
            ok0Var.c = 0;
            this.v.add(ok0Var);
        }
        if (view instanceof org.telegram.ui.Cells.ab) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            abVar.f(ok0Var, null, abVar.S);
        }
        getNotificationsController().updateServerNotificationsSettings(ok0Var.d, 0L, false);
        m0(true);
    }

    public final int g0() {
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
            if (org.telegram.ui.Cells.c9.f[i12] == i10) {
                return org.telegram.ui.Cells.c9.e[i12];
            }
        }
        return i10;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(15, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 16, new Class[]{org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.a9.class, org.telegram.ui.Cells.c9.class, org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.ab.class, org.telegram.ui.Cells.n5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        int i10 = org.telegram.ui.ActionBar.y6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.v6));
        return arrayList;
    }

    public final String h0() {
        int i10 = this.s;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : getNotificationsSettings().getInt("popupChannel", 0) : getNotificationsSettings().getInt("popupAll", 0) : getNotificationsSettings().getInt("popupGroup", 0);
        int[] iArr = this.E;
        return LocaleController.getString(iArr[Utilities.clamp(i11, iArr.length - 1, 0)]);
    }

    public final String i0() {
        int i10 = this.s;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? (i10 == 4 || i10 == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1 : getNotificationsSettings().getInt("priority_stories", 1) : getNotificationsSettings().getInt("priority_channel", 1) : getNotificationsSettings().getInt("priority_messages", 1) : getNotificationsSettings().getInt("priority_group", 1);
        int[] iArr = this.F;
        return LocaleController.getString(iArr[Utilities.clamp(i11, iArr.length - 1, 0)]);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void k0() {
        ArrayList arrayList;
        if (this.s == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new wb0(24, this, arrayList));
    }

    public final void l0(ok0 ok0Var, View view, boolean z10) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(ok0Var.d, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean j02 = j0(this.currentAccount, ok0Var.d);
        ok0Var.c = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
        if (ok0Var.f) {
            ok0Var.f = false;
            edit.putBoolean(org.telegram.ui.Components.b10.j(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, sharedPrefKey), !z10).commit();
            ArrayList arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(ok0Var);
            }
            if (this.w == null) {
                this.w = new ArrayList();
            }
            this.w.add(0, ok0Var);
        } else if (j02) {
            edit.putBoolean(org.telegram.ui.Components.b10.j(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, sharedPrefKey), !z10).commit();
        } else {
            Boolean bool = this.n;
            if (!z10 ? bool == null || !bool.booleanValue() : bool != null && bool.booleanValue()) {
                f0(ok0Var, view);
                return;
            }
            edit.putBoolean(org.telegram.ui.Components.b10.j(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, sharedPrefKey), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.ab) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            abVar.f(ok0Var, null, abVar.S);
        }
        getNotificationsController().updateServerNotificationsSettings(ok0Var.d, 0L, false);
        m0(true);
    }

    public final void m0(boolean z10) {
        int i10;
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
        ArrayList arrayList2 = this.H;
        arrayList2.clear();
        ArrayList arrayList3 = this.I;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i11 = this.s;
        if (i11 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            ik0 ik0Var = new ik0(0, true);
            ik0Var.e = string2;
            arrayList3.add(ik0Var);
            if (i11 == 3) {
                this.newRow = arrayList3.size();
                arrayList3.add(ik0.b(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList3.size();
                    arrayList3.add(ik0.b(102, LocaleController.getString(R.string.NotifyMeAboutImportantStories), this.r && ((bool = this.n) == null || !bool.booleanValue())));
                }
                arrayList3.add(ik0.d(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i11 == 4 || i11 == 5) {
                this.messagesRow = arrayList3.size();
                int i12 = R.drawable.msg_markunread;
                String string3 = LocaleController.getString(R.string.NotifyMeAboutMessagesReactions);
                String string4 = LocaleController.getString(!notificationsSettings.getBoolean("EnableReactionsMessages", true) ? R.string.NotifyFromNobody : notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone);
                boolean z11 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ik0 ik0Var2 = new ik0(6, true);
                ik0Var2.c = 103;
                ik0Var2.d = i12;
                ik0Var2.e = string3;
                ik0Var2.f = string4;
                ik0Var2.i = z11;
                arrayList3.add(ik0Var2);
                this.storiesRow = arrayList3.size();
                int i13 = R.drawable.msg_stories_saved;
                String string5 = LocaleController.getString(R.string.NotifyMeAboutStoriesReactions);
                String string6 = LocaleController.getString(!notificationsSettings.getBoolean("EnableReactionsStories", true) ? R.string.NotifyFromNobody : notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone);
                boolean z12 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ik0 ik0Var3 = new ik0(6, true);
                ik0Var3.c = 104;
                ik0Var3.d = i13;
                ik0Var3.e = string5;
                ik0Var3.f = string6;
                ik0Var3.i = z12;
                arrayList3.add(ik0Var3);
                arrayList3.add(ik0.d(-1, null));
            } else {
                int i14 = i11 == 1 ? R.string.NotifyMeAboutPrivate : i11 == 0 ? R.string.NotifyMeAboutGroups : R.string.NotifyMeAboutChannels;
                this.showRow = arrayList3.size();
                arrayList3.add(ik0.b(100, LocaleController.getString(i14), getNotificationsController().isGlobalNotificationsEnabled(i11)));
                arrayList3.add(ik0.d(-1, null));
            }
            String string7 = LocaleController.getString(R.string.SETTINGS);
            ik0 ik0Var4 = new ik0(0, true);
            ik0Var4.e = string7;
            arrayList3.add(ik0Var4);
            arrayList3.size();
            if (i11 == 3) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(ik0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i11 == 4 || i11 == 5) {
                this.showSenderRow = arrayList3.size();
                arrayList3.add(ik0.b(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                boolean z13 = i11 != 0 ? i11 != 1 ? i11 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true) : notificationsSettings.getBoolean("EnablePreviewAll", true) : notificationsSettings.getBoolean("EnablePreviewGroup", true);
                this.previewRow = arrayList3.size();
                arrayList3.add(ik0.b(0, LocaleController.getString(R.string.MessagePreview), z13));
            }
            this.soundRow = arrayList3.size();
            String string8 = LocaleController.getString("Sound", R.string.Sound);
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String string9 = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            if (i11 == 0) {
                string = notificationsSettings2.getString("GroupSound", string9);
                j10 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            } else if (i11 == 1) {
                string = notificationsSettings2.getString("GlobalSound", string9);
                j10 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
            } else if (i11 == 3) {
                string = notificationsSettings2.getString("StoriesSound", string9);
                j10 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
            } else if (i11 == 4 || i11 == 5) {
                string = notificationsSettings2.getString("ReactionSound", string9);
                j10 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
            } else {
                string = notificationsSettings2.getString("ChannelSound", string9);
                j10 = notificationsSettings2.getLong("ChannelDocId", 0L);
            }
            if (j10 != 0) {
                TLRPC.Document c10 = getMediaDataController().ringtoneDataStore.c(j10);
                string = c10 == null ? LocaleController.getString("CustomSound", R.string.CustomSound) : tk0.c0(c10, FileLoader.getDocumentFileName(c10));
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", R.string.SoundDefault);
            }
            arrayList3.add(ik0.c(3, string8, string));
            if (this.G) {
                this.lightColorRow = arrayList3.size();
                String string10 = LocaleController.getString("LedColor", R.string.LedColor);
                int g02 = g0();
                ik0 ik0Var5 = new ik0(3, true);
                ik0Var5.e = string10;
                ik0Var5.h = g02;
                arrayList3.add(ik0Var5);
                int i15 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? (i11 == 4 || i11 == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0 : notificationsSettings.getInt("vibrate_stories", 0) : notificationsSettings.getInt("vibrate_channel", 0) : notificationsSettings.getInt("vibrate_messages", 0) : notificationsSettings.getInt("vibrate_group", 0);
                this.vibrateRow = arrayList3.size();
                String string11 = LocaleController.getString("Vibrate", R.string.Vibrate);
                int[] iArr = this.y;
                arrayList3.add(ik0.c(1, string11, LocaleController.getString(iArr[Utilities.clamp(i15, iArr.length - 1, 0)])));
                if (i11 == 1 || i11 == 0) {
                    this.popupRow = arrayList3.size();
                    arrayList3.add(ik0.c(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), h0()));
                }
                this.priorityRow = arrayList3.size();
                arrayList3.add(ik0.c(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), i0()));
                String string12 = LocaleController.getString(R.string.NotifyLessOptions);
                ik0 ik0Var6 = new ik0(8, true);
                ik0Var6.e = string12;
                ik0Var6.d = 0;
                arrayList3.add(ik0Var6);
            } else {
                String string13 = LocaleController.getString(R.string.NotifyMoreOptions);
                ik0 ik0Var7 = new ik0(8, true);
                ik0Var7.e = string13;
                ik0Var7.d = 1;
                arrayList3.add(ik0Var7);
            }
            arrayList3.size();
            arrayList3.add(ik0.d(-2, null));
            i10 = 4;
        } else {
            i10 = 4;
        }
        if (i11 != i10 && i11 != 5) {
            if (i11 != -1) {
                this.addExceptionRow = arrayList3.size();
                int i16 = R.drawable.msg_contact_add;
                String string14 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                ik0 ik0Var8 = new ik0(7, true);
                ik0Var8.c = 6;
                ik0Var8.d = i16;
                ik0Var8.e = string14;
                arrayList3.add(ik0Var8);
            }
            arrayList3.size();
            if (this.v != null && this.h) {
                for (int i17 = 0; i17 < this.v.size(); i17++) {
                    ok0 ok0Var = (ok0) this.v.get(i17);
                    ik0 ik0Var9 = new ik0(2, true);
                    ik0Var9.g = ok0Var;
                    arrayList3.add(ik0Var9);
                }
            }
            if (this.w != null) {
                for (int i18 = 0; i18 < this.w.size(); i18++) {
                    ok0 ok0Var2 = (ok0) this.w.get(i18);
                    ik0 ik0Var10 = new ik0(2, true);
                    ik0Var10.g = ok0Var2;
                    arrayList3.add(ik0Var10);
                }
            }
            arrayList3.size();
            if (i11 != -1 || ((arrayList = this.w) != null && !arrayList.isEmpty())) {
                arrayList3.add(ik0.d(-3, null));
            }
            ArrayList arrayList4 = this.w;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                this.deleteExceptionsRow = arrayList3.size();
                String string15 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                ik0 ik0Var11 = new ik0(7, true);
                ik0Var11.c = 7;
                ik0Var11.d = 0;
                ik0Var11.e = string15;
                arrayList3.add(ik0Var11);
            }
        }
        jk0 jk0Var = this.b;
        if (jk0Var != null) {
            if (z10) {
                jk0Var.E(arrayList2, arrayList3);
            } else {
                jk0Var.l();
            }
        }
    }

    public final void n0() {
        try {
            if (this.a == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.il, false);
            int i10 = 0;
            while (i10 < 4) {
                int childCount = i10 == 0 ? this.a.getChildCount() : i10 == 1 ? this.a.getHiddenChildCount() : i10 == 2 ? this.a.getCachedChildCount() : this.a.getAttachedScrapChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = i10 == 0 ? this.a.getChildAt(i11) : i10 == 1 ? this.a.V(i11) : i10 == 2 ? this.a.P(i11) : this.a.O(i11);
                    if (childAt instanceof org.telegram.ui.Cells.ab) {
                        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) childAt;
                        abVar.a0 = true;
                        abVar.Q = x02;
                        abVar.R = x03;
                        if (i10 != 0) {
                            ((org.telegram.ui.Cells.ab) childAt).i(0);
                        }
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
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
            s4.e1 K = this.a.K(i10);
            if (K != null) {
                this.b.v(K, i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        m0(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
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
        m0(true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        jk0 jk0Var = this.b;
        if (jk0Var != null) {
            jk0Var.l();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            n0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
