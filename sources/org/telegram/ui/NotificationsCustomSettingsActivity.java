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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public final int[] D;
    public final int[] E;
    public final int[] F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.tk0 a;
    public int addExceptionRow;
    public w6 b;
    public org.telegram.ui.Components.xy c;
    public si0 d;
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
    public int vibrateRow;
    public ArrayList w;
    public ArrayList x;
    public final HashMap y;

    public NotificationsCustomSettingsActivity(int i10, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.y = new HashMap();
        this.D = new int[]{2131743639, 2131745384, 2131743638, 2131748734, 2131747837};
        this.E = new int[]{2131748193, 2131747834, 2131747835, 2131754266};
        this.F = new int[]{2131747899, 2131747895, 2131747895, 2131747897, 2131747898, 2131747897};
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
        this.w = arrayList2;
        this.x = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ui0 ui0Var = (ui0) this.x.get(i11);
                this.y.put(Long.valueOf(ui0Var.d), ui0Var);
            }
        }
        ArrayList arrayList3 = this.w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ui0 ui0Var2 = (ui0) this.w.get(i12);
                this.y.put(Long.valueOf(ui0Var2.d), ui0Var2);
            }
        }
        if (z10) {
            n0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context, View view, int i10, float f7, float f10) {
        HashMap hashMap;
        ui0 ui0Var;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        Drawable drawable;
        final ra raVar;
        final boolean z13;
        boolean z14;
        String str;
        long j10;
        ui0 ui0Var2;
        boolean z15;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
        ArrayList arrayList2 = notificationsCustomSettingsActivity2.I;
        HashMap hashMap2 = notificationsCustomSettingsActivity2.y;
        int i12 = notificationsCustomSettingsActivity2.s;
        if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
            return;
        }
        qi0 qi0Var = (notificationsCustomSettingsActivity2.a.getAdapter() != notificationsCustomSettingsActivity2.b || i10 < 0 || i10 >= arrayList2.size()) ? null : (qi0) arrayList2.get(i10);
        boolean z16 = true;
        if (qi0Var != null && qi0Var.a == 8) {
            notificationsCustomSettingsActivity2.G = !notificationsCustomSettingsActivity2.G;
            notificationsCustomSettingsActivity2.p0(true);
            return;
        }
        if (i12 != 3 || qi0Var == null) {
            hashMap = hashMap2;
        } else {
            hashMap = hashMap2;
            ui0 ui0Var3 = qi0Var.g;
            if (ui0Var3 != null) {
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(notificationsCustomSettingsActivity2, view);
                H.i = 3;
                H.m(R.drawable.msg_mute, new ki0(notificationsCustomSettingsActivity2, ui0Var3, view, i10, 5), org.telegram.messenger.cd.L0(2131747880, null), ui0Var3.c <= 0 || ui0Var3.f, false);
                H.m(R.drawable.msg_unmute, new ki0(notificationsCustomSettingsActivity, ui0Var3, view, i10, 0), org.telegram.messenger.cd.L0(2131747877, null), ui0Var3.c > 0 || ui0Var3.f, false);
                H.m(R.drawable.msg_delete, new ki0(notificationsCustomSettingsActivity, ui0Var3, view, i10, 1), org.telegram.messenger.cd.L0(2131751543, "DeleteException"), !ui0Var3.f, true);
                H.W(notificationsCustomSettingsActivity.a.U0(view, false));
                H.Z();
                return;
            }
        }
        if (i12 == 3) {
            s4.g0 adapter = notificationsCustomSettingsActivity2.a.getAdapter();
            si0 si0Var = notificationsCustomSettingsActivity2.d;
            if (adapter == si0Var) {
                Object E = si0Var.E(i10);
                if (E instanceof ui0) {
                    ui0Var2 = (ui0) E;
                    str = "DeleteException";
                } else {
                    boolean z17 = E instanceof TLRPC.User;
                    if (z17) {
                        str = "DeleteException";
                        j10 = ((TLRPC.User) E).id;
                    } else {
                        str = "DeleteException";
                        j10 = -((TLRPC.Chat) E).id;
                    }
                    if (!hashMap.containsKey(Long.valueOf(j10))) {
                        ui0 ui0Var4 = new ui0();
                        ui0Var4.e = true;
                        ui0Var4.d = j10;
                        if (z17) {
                            ui0Var4.d = ((TLRPC.User) E).id;
                        } else {
                            ui0Var4.d = -((TLRPC.Chat) E).id;
                        }
                        ui0Var2 = ui0Var4;
                        z15 = true;
                        if (ui0Var2 != null) {
                            return;
                        }
                        org.telegram.ui.Components.z60 H2 = org.telegram.ui.Components.z60.H(notificationsCustomSettingsActivity2, view);
                        H2.i = 3;
                        ui0 ui0Var5 = ui0Var2;
                        H2.m(R.drawable.msg_mute, new ki0(notificationsCustomSettingsActivity2, ui0Var5, view, z15, 2), org.telegram.messenger.cd.L0(2131747880, null), ui0Var2.c <= 0 || ui0Var2.f, false);
                        H2.m(R.drawable.msg_unmute, new ki0(notificationsCustomSettingsActivity, ui0Var5, view, z15, 3), org.telegram.messenger.cd.L0(2131747877, null), ui0Var5.c > 0 || ui0Var5.f, false);
                        H2.m(R.drawable.msg_delete, new ki0(notificationsCustomSettingsActivity, ui0Var5, view, i10, 4), org.telegram.messenger.cd.L0(2131751543, str), (z15 || ui0Var5.f) ? false : true, true);
                        H2.W(notificationsCustomSettingsActivity.a.U0(view, false));
                        H2.Z();
                        return;
                    }
                    ui0Var2 = (ui0) hashMap.get(Long.valueOf(j10));
                }
                z15 = false;
                if (ui0Var2 != null) {
                }
            }
        }
        if (notificationsCustomSettingsActivity2.a.getAdapter() == notificationsCustomSettingsActivity2.d || !(qi0Var == null || qi0Var.g == null)) {
            s4.g0 adapter2 = notificationsCustomSettingsActivity2.a.getAdapter();
            si0 si0Var2 = notificationsCustomSettingsActivity2.d;
            if (adapter2 == si0Var2) {
                Object E2 = si0Var2.E(i10);
                if (E2 instanceof ui0) {
                    ui0Var = (ui0) E2;
                    arrayList = notificationsCustomSettingsActivity2.d.d;
                    z12 = false;
                } else {
                    boolean z18 = E2 instanceof TLRPC.User;
                    long j11 = z18 ? ((TLRPC.User) E2).id : -((TLRPC.Chat) E2).id;
                    if (hashMap.containsKey(Long.valueOf(j11))) {
                        ui0Var = (ui0) hashMap.get(Long.valueOf(j11));
                        z11 = false;
                    } else {
                        ui0 ui0Var6 = new ui0();
                        ui0Var6.d = j11;
                        if (z18) {
                            ui0Var6.d = ((TLRPC.User) E2).id;
                        } else {
                            ui0Var6.d = -((TLRPC.Chat) E2).id;
                        }
                        ui0Var = ui0Var6;
                        z11 = true;
                    }
                    arrayList = notificationsCustomSettingsActivity2.x;
                    z12 = z11;
                }
                z10 = z12;
            } else {
                ui0Var = qi0Var.g;
                if (ui0Var.f) {
                    return;
                }
                arrayList = notificationsCustomSettingsActivity2.x;
                z10 = false;
            }
            ArrayList arrayList3 = arrayList;
            ui0 ui0Var7 = ui0Var;
            if (ui0Var7 == null) {
                return;
            }
            long j12 = ui0Var7.d;
            org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(context, notificationsCustomSettingsActivity2.currentAccount, null, true, new ni0(notificationsCustomSettingsActivity2, j12, org.telegram.messenger.ot.t(notificationsCustomSettingsActivity2.currentAccount).D(j12, null, false, false), ui0Var7, z10, i10, arrayList3), notificationsCustomSettingsActivity.getResourceProvider());
            goVar.e(j12, 0, null);
            goVar.d(notificationsCustomSettingsActivity, view, f7, f10, false);
            return;
        }
        if (qi0Var == null) {
            return;
        }
        int i13 = qi0Var.c;
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
            ay ayVar = new ay(bundle);
            ayVar.C2 = new li0(notificationsCustomSettingsActivity2);
            notificationsCustomSettingsActivity2.presentFragment(ayVar);
            return;
        }
        if (i13 == 7) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131747929, "NotificationsDeleteAllExceptionTitle");
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131747930, "NotificationsDeleteAllExceptionAlert");
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, "Delete"), new li0(notificationsCustomSettingsActivity2));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
            notificationsCustomSettingsActivity2.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                return;
            }
            return;
        }
        if (i13 == 100 || i13 == 101) {
            boolean B = notificationsCustomSettingsActivity2.getNotificationsController().B(i12);
            notificationsCustomSettingsActivity2.a.K(i10);
            final int i15 = notificationsCustomSettingsActivity2.s;
            if (i15 == 3) {
                SharedPreferences.Editor edit = notificationsCustomSettingsActivity2.getNotificationsSettings().edit();
                Boolean bool = notificationsCustomSettingsActivity2.n;
                boolean z19 = bool != null && bool.booleanValue();
                if (notificationsCustomSettingsActivity2.r && z19) {
                    edit.remove("EnableAllStories");
                    notificationsCustomSettingsActivity2.n = null;
                } else {
                    boolean z20 = !z19;
                    edit.putBoolean("EnableAllStories", z20);
                    notificationsCustomSettingsActivity2.n = Boolean.valueOf(z20);
                }
                edit.apply();
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i12);
                notificationsCustomSettingsActivity2.p0(true);
                boolean z21 = notificationsCustomSettingsActivity2.h;
                if (z21 != (notificationsCustomSettingsActivity2.n == null) && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z21;
                    notificationsCustomSettingsActivity2.p0(true);
                }
                notificationsCustomSettingsActivity2.h0();
                return;
            }
            if (!B) {
                notificationsCustomSettingsActivity2.getNotificationsController().U(i12, 0);
                notificationsCustomSettingsActivity2.p0(true);
                return;
            }
            final ArrayList arrayList4 = notificationsCustomSettingsActivity2.x;
            final ArrayList arrayList5 = notificationsCustomSettingsActivity2.w;
            int i16 = notificationsCustomSettingsActivity2.currentAccount;
            ra raVar2 = new ra(notificationsCustomSettingsActivity2, i14);
            Pattern pattern = org.telegram.ui.Components.s4.a;
            if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
                return;
            }
            boolean D = org.telegram.messenger.ot.t(i16).D(0L, null, false, false);
            String[] strArr = {org.telegram.messenger.cd.L0(2131747873, null), org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(1, "Hours", new Object[0])), org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(2, "Days", new Object[0])), null, org.telegram.messenger.cd.L0(2131747874, null)};
            int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
            LinearLayout linearLayout = new LinearLayout(notificationsCustomSettingsActivity2.getParentActivity());
            linearLayout.setOrientation(1);
            final AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            int i17 = 0;
            while (i17 < 5) {
                if (strArr[i17] == null) {
                    i11 = i16;
                    raVar = raVar2;
                    z13 = D;
                } else {
                    TextView textView2 = new TextView(notificationsCustomSettingsActivity2.getParentActivity());
                    Drawable drawable2 = notificationsCustomSettingsActivity2.getParentActivity().getResources().getDrawable(iArr[i17]);
                    if (i17 == 4) {
                        drawable = null;
                        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, null);
                        i11 = i16;
                        org.telegram.ui.ActionBar.a7.y(textView2, drawable2, org.telegram.ui.ActionBar.t6.p7, null, PorterDuff.Mode.MULTIPLY);
                    } else {
                        i11 = i16;
                        drawable = null;
                        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.j5, null);
                        org.telegram.ui.ActionBar.a7.y(textView2, drawable2, org.telegram.ui.ActionBar.t6.J5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    org.telegram.messenger.z20.o(textView2, 1, 16.0f, 1, 1);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, drawable, drawable);
                    textView2.setTag(Integer.valueOf(i17));
                    textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                    textView2.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
                    textView2.setSingleLine(true);
                    textView2.setGravity(19);
                    textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(26.0f));
                    textView2.setText(strArr[i17]);
                    linearLayout.addView(textView2, w7.b6.r(-1, 48, 51));
                    raVar = raVar2;
                    z13 = D;
                    final NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity2;
                    final int i18 = i11;
                    View.OnClickListener onClickListener = new View.OnClickListener(i18, z13, i15, notificationsCustomSettingsActivity3, arrayList4, arrayList5, raVar, alertDialog$Builder2) { // from class: org.telegram.ui.Components.l2
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ NotificationsCustomSettingsActivity c;
                        public final /* synthetic */ ArrayList d;
                        public final /* synthetic */ ArrayList e;
                        public final /* synthetic */ org.telegram.ui.ra f;
                        public final /* synthetic */ AlertDialog$Builder h;

                        {
                            this.b = i15;
                            this.c = notificationsCustomSettingsActivity3;
                            this.d = arrayList4;
                            this.e = arrayList5;
                            this.f = raVar;
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
                                org.telegram.messenger.ot.t(i20).U(i21, 0);
                            } else if (intValue == 3) {
                                notificationsCustomSettingsActivity4.presentFragment(new NotificationsCustomSettingsActivity(i21, this.d, this.e, false));
                            } else {
                                int currentTime = ConnectionsManager.getInstance(i20).getCurrentTime();
                                if (intValue == 1) {
                                    currentTime += 3600;
                                } else if (intValue == 2) {
                                    currentTime += 172800;
                                } else if (intValue == 4) {
                                    i19 = Integer.MAX_VALUE;
                                    org.telegram.messenger.ot.t(i20).H(0L, i19, 0);
                                    org.telegram.messenger.ot.t(i20).U(i21, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                }
                                i19 = currentTime;
                                org.telegram.messenger.ot.t(i20).H(0L, i19, 0);
                                org.telegram.messenger.ot.t(i20).U(i21, ConnectionsManager.DEFAULT_DATACENTER_ID);
                            }
                            this.f.a(intValue);
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
                            if (i22 < 0 || !cc.a(notificationsCustomSettingsActivity4)) {
                                return;
                            }
                            cc.z(notificationsCustomSettingsActivity4, i22, 0, null).j();
                        }
                    };
                    notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity3;
                    textView2.setOnClickListener(onClickListener);
                }
                i17++;
                D = z13;
                raVar2 = raVar;
                i16 = i11;
            }
            String L02 = org.telegram.messenger.cd.L0(2131747940, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
            x1Var2.R = L02;
            alertDialog$Builder2.o(linearLayout);
            notificationsCustomSettingsActivity2.showDialog(x1Var2);
            return;
        }
        if (i13 == 3) {
            if (view.isEnabled()) {
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, i12);
                    notificationsCustomSettingsActivity2.presentFragment(new yi0(bundle2, notificationsCustomSettingsActivity2.getResourceProvider()));
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            }
            return;
        }
        if (qi0Var.a == 3) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.s4.t(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new mi0(notificationsCustomSettingsActivity2, view, i10, 0), null));
                return;
            }
            return;
        }
        if (i13 == 2) {
            if (view.isEnabled()) {
                Activity parentActivity = notificationsCustomSettingsActivity2.getParentActivity();
                mi0 mi0Var = new mi0(notificationsCustomSettingsActivity2, view, i10, 1);
                Pattern pattern2 = org.telegram.ui.Components.s4.a;
                SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).e7;
                int[] iArr2 = new int[1];
                if (i12 == 1) {
                    iArr2[0] = sharedPreferences.getInt("popupAll", 0);
                } else if (i12 == 0) {
                    iArr2[0] = sharedPreferences.getInt("popupGroup", 0);
                } else {
                    iArr2[0] = sharedPreferences.getInt("popupChannel", 0);
                }
                String[] strArr2 = {org.telegram.messenger.cd.L0(2131748193, null), org.telegram.messenger.cd.L0(2131747834, null), org.telegram.messenger.cd.L0(2131747835, null), org.telegram.messenger.cd.L0(2131754266, null)};
                LinearLayout e7 = org.telegram.messenger.m5.e(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity);
                int i19 = 0;
                while (i19 < 4) {
                    org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(parentActivity, null);
                    n6Var.setTag(Integer.valueOf(i19));
                    n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                    org.telegram.ui.Components.s4.a(n6Var, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.E5, null);
                    n6Var.b(strArr2[i19], iArr2[0] == i19);
                    e7.addView(n6Var);
                    n6Var.setOnClickListener(new ya(iArr2, i12, alertDialog$Builder3, mi0Var, 1));
                    i19++;
                }
                String L03 = org.telegram.messenger.cd.L0(2131747113, null);
                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
                x1Var3.R = L03;
                alertDialog$Builder3.o(e7);
                alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131752589, null), null);
                notificationsCustomSettingsActivity2.showDialog(x1Var3);
                return;
            }
            return;
        }
        if (i13 == 1) {
            if (view.isEnabled()) {
                String str2 = i12 == 1 ? "vibrate_messages" : i12 == 0 ? "vibrate_group" : i12 == 3 ? "vibrate_stories" : (i12 == 4 || i12 == 5) ? "vibrate_react" : "vibrate_channel";
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.s4.X(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0L, str2, new org.telegram.ui.Components.c11(notificationsCustomSettingsActivity2, view, str2, i10, 5), null));
                return;
            }
            return;
        }
        if (i13 == 4) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.s4.H(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new mi0(notificationsCustomSettingsActivity2, view, i10, 2), null));
                return;
            }
            return;
        }
        if (i13 == 102) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings = notificationsCustomSettingsActivity2.getNotificationsSettings();
                if (notificationsSettings.getBoolean("EnableAllStories", false)) {
                    return;
                }
                SharedPreferences.Editor edit2 = notificationsSettings.edit();
                if (notificationsCustomSettingsActivity2.n != null) {
                    edit2.remove("EnableAllStories");
                    notificationsCustomSettingsActivity2.n = null;
                    notificationsCustomSettingsActivity2.r = true;
                    qi0Var.i = true;
                } else {
                    edit2.putBoolean("EnableAllStories", false);
                    notificationsCustomSettingsActivity2.n = Boolean.FALSE;
                    notificationsCustomSettingsActivity2.r = false;
                    qi0Var.i = false;
                }
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(notificationsCustomSettingsActivity2.r);
                }
                edit2.commit();
                boolean z22 = notificationsCustomSettingsActivity2.r;
                boolean z23 = notificationsCustomSettingsActivity2.h;
                if (z22 != z23 && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z23;
                    notificationsCustomSettingsActivity2.p0(true);
                }
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i12);
                notificationsCustomSettingsActivity2.h0();
                return;
            }
            return;
        }
        if (i13 == 0) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings2 = notificationsCustomSettingsActivity2.getNotificationsSettings();
                SharedPreferences.Editor edit3 = notificationsSettings2.edit();
                if (i12 == 1) {
                    z14 = notificationsSettings2.getBoolean("EnablePreviewAll", true);
                    edit3.putBoolean("EnablePreviewAll", !z14);
                } else if (i12 == 0) {
                    z14 = notificationsSettings2.getBoolean("EnablePreviewGroup", true);
                    edit3.putBoolean("EnablePreviewGroup", !z14);
                } else if (i12 == 3) {
                    z14 = !notificationsSettings2.getBoolean("EnableHideStoriesSenders", false);
                    edit3.putBoolean("EnableHideStoriesSenders", z14);
                } else if (i12 == 4 || i12 == 5) {
                    z14 = notificationsSettings2.getBoolean("EnableReactionsPreview", true);
                    edit3.putBoolean("EnableReactionsPreview", !z14);
                } else {
                    z14 = notificationsSettings2.getBoolean("EnablePreviewChannel", true);
                    edit3.putBoolean("EnablePreviewChannel", !z14);
                }
                edit3.commit();
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i12);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(!z14);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 103 || i13 == 104) {
            boolean z24 = !org.telegram.messenger.cd.X ? f7 <= ((float) (view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f))) : f7 >= ((float) org.telegram.messenger.i0.L(76.0f));
            SharedPreferences notificationsSettings3 = notificationsCustomSettingsActivity2.getNotificationsSettings();
            if (z24) {
                String str3 = qi0Var.c == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                SharedPreferences.Editor edit4 = notificationsSettings3.edit();
                edit4.putBoolean(str3, !notificationsSettings3.getBoolean(str3, true));
                edit4.apply();
                notificationsCustomSettingsActivity2.p0(true);
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i12);
                return;
            }
            String str4 = qi0Var.c == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
            LinearLayout f11 = org.telegram.messenger.m5.f(context, 1);
            ?? r42 = 0;
            boolean[] zArr = {notificationsSettings3.getBoolean(str4, false)};
            org.telegram.ui.Cells.n6[] n6VarArr = new org.telegram.ui.Cells.n6[2];
            int i20 = 0;
            while (i20 < 2) {
                org.telegram.ui.Cells.n6 n6Var2 = new org.telegram.ui.Cells.n6(context, notificationsCustomSettingsActivity2.getResourceProvider());
                n6VarArr[i20] = n6Var2;
                boolean z25 = z16;
                n6Var2.setPadding(org.telegram.messenger.i0.L(4.0f), r42, org.telegram.messenger.i0.L(4.0f), r42);
                n6VarArr[i20].a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.g7, r42), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E5, r42));
                n6VarArr[i20].b(org.telegram.messenger.cd.L0(i20 == 0 ? 2131747865 : 2131747866, null), i20 == 0 ? !zArr[r42] ? z25 : r42 : zArr[r42]);
                ag.j3 j3Var = n6VarArr[i20];
                int i21 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.ActionBar.a7.R(j3Var, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i21, r42), 2, -1), null, org.telegram.ui.ActionBar.a7.N(i21), null);
                f11.addView(n6VarArr[i20]);
                n6VarArr[i20].setOnClickListener(new jg.w1(zArr, i20, n6VarArr, 16));
                i20++;
                z16 = z25;
                r42 = 0;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, notificationsCustomSettingsActivity2.getParentActivity(), notificationsCustomSettingsActivity2.resourceProvider);
            String L04 = org.telegram.messenger.cd.L0(2131747867, null);
            org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.a;
            x1Var4.R = L04;
            alertDialog$Builder4.o(f11);
            alertDialog$Builder4.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131745963, null), new a1.d(notificationsCustomSettingsActivity2, notificationsSettings3, str4, zArr, 13));
            notificationsCustomSettingsActivity2.showDialog(x1Var4);
        }
    }

    public static void Z(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ui0 ui0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.j(true);
        notificationsCustomSettingsActivity.o0(ui0Var, view, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:89|(2:103|104)(2:91|(2:102|99)(1:93))|94|95|96|97|98|99) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a1, code lost:
    
        if (r11.deleted != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x038b A[LOOP:5: B:190:0x0389->B:191:0x038b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i10;
        boolean z11;
        int size;
        int i11;
        int size2;
        int i12;
        int size3;
        int i13;
        int size4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Long A;
        long longValue;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        ArrayList arrayList21 = new ArrayList();
        long j10 = notificationsCustomSettingsActivity.getUserConfig().n;
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
            ArrayList arrayList22 = arrayList20;
            if (key.startsWith("notify2_")) {
                arrayList9 = arrayList19;
                String replace = key.replace("notify2_", "");
                Long A2 = Utilities.A(replace);
                ArrayList arrayList23 = arrayList13;
                arrayList8 = arrayList14;
                long longValue2 = A2.longValue();
                if (longValue2 == 0 || longValue2 == j10) {
                    arrayList10 = arrayList21;
                    arrayList7 = arrayList23;
                } else {
                    arrayList7 = arrayList23;
                    ui0 ui0Var = new ui0();
                    ui0Var.d = longValue2;
                    arrayList10 = arrayList21;
                    ArrayList arrayList24 = arrayList12;
                    ui0Var.b = org.telegram.messenger.m5.w("custom_", longValue2, notificationsSettings, false);
                    int intValue = ((Integer) next.getValue()).intValue();
                    ui0Var.c = intValue;
                    if (intValue != 0) {
                        Integer num = (Integer) all.get("notifyuntil_" + replace);
                        if (num != null) {
                            ui0Var.a = num.intValue();
                        }
                    }
                    if (org.telegram.messenger.o5.C(longValue2)) {
                        int i14 = (int) (4294967295L & longValue2);
                        TLRPC.EncryptedChat Z0 = notificationsCustomSettingsActivity.getMessagesController().Z0(Integer.valueOf(i14));
                        if (Z0 == null) {
                            arrayList18.add(Integer.valueOf(i14));
                            longSparseArray.put(longValue2, ui0Var);
                        } else {
                            TLRPC.User Z1 = notificationsCustomSettingsActivity.getMessagesController().Z1(Long.valueOf(Z0.user_id));
                            if (Z1 == null) {
                                arrayList16.add(Long.valueOf(Z0.user_id));
                                longSparseArray.put(Z0.user_id, ui0Var);
                            } else if (Z1.deleted) {
                                it = it2;
                                arrayList20 = arrayList22;
                                arrayList19 = arrayList9;
                                arrayList14 = arrayList8;
                                arrayList13 = arrayList7;
                                arrayList21 = arrayList10;
                                arrayList12 = arrayList24;
                            }
                        }
                        arrayList11.add(ui0Var);
                        arrayList12 = arrayList24;
                    } else if (org.telegram.messenger.o5.E(longValue2)) {
                        TLRPC.User Z12 = notificationsCustomSettingsActivity.getMessagesController().Z1(A2);
                        if (Z12 == null) {
                            arrayList16.add(A2);
                            longSparseArray.put(longValue2, ui0Var);
                        } else if (Z12.deleted) {
                            it = it2;
                            arrayList20 = arrayList22;
                            arrayList19 = arrayList9;
                            arrayList14 = arrayList8;
                            arrayList13 = arrayList7;
                            arrayList21 = arrayList10;
                            arrayList12 = arrayList24;
                        }
                        arrayList11.add(ui0Var);
                        arrayList12 = arrayList24;
                    } else {
                        long j11 = -longValue2;
                        TLRPC.Chat L0 = notificationsCustomSettingsActivity.getMessagesController().L0(Long.valueOf(j11));
                        if (L0 == null) {
                            arrayList17.add(Long.valueOf(j11));
                            longSparseArray.put(longValue2, ui0Var);
                        } else if (!L0.left && !L0.kicked && L0.migrated_to == null) {
                            if (!org.telegram.messenger.w3.T(L0) || L0.megagroup) {
                                arrayList12 = arrayList24;
                                arrayList12.add(ui0Var);
                            } else {
                                arrayList15.add(ui0Var);
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
        ArrayList arrayList27 = arrayList19;
        ArrayList arrayList28 = arrayList20;
        ArrayList arrayList29 = arrayList21;
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it3 = all.entrySet().iterator();
        while (true) {
            z10 = true;
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next2 = it3.next();
            String key2 = next2.getKey();
            if (key2.startsWith("stories_")) {
                try {
                    A = Utilities.A(key2.substring(8));
                    longValue = A.longValue();
                } catch (Exception unused) {
                }
                if (longValue != 0 && longValue != j10) {
                    ui0 ui0Var2 = new ui0();
                    ui0Var2.d = longValue;
                    ui0Var2.e = true;
                    ui0Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (org.telegram.messenger.o5.E(longValue)) {
                        TLRPC.User Z13 = notificationsCustomSettingsActivity.getMessagesController().Z1(A);
                        if (Z13 == null) {
                            arrayList16.add(A);
                            longSparseArray.put(longValue, ui0Var2);
                        } else if (Z13.deleted) {
                        }
                        arrayList6 = arrayList25;
                        arrayList6.add(ui0Var2);
                        hashSet.add(A);
                        arrayList25 = arrayList6;
                    }
                }
            }
            arrayList6 = arrayList25;
            arrayList25 = arrayList6;
        }
        ArrayList arrayList30 = arrayList25;
        if (arrayList != null) {
            Collections.sort(arrayList, Comparator$-CC.comparingDouble(new org.telegram.ui.Components.y61(2)));
            int max = Math.max(0, arrayList.size() - 6);
            while (max < arrayList.size()) {
                long o10 = org.telegram.messenger.o5.o(((TLRPC.TL_topPeer) arrayList.get(max)).peer);
                if (!hashSet.contains(Long.valueOf(o10))) {
                    ui0 ui0Var3 = new ui0();
                    ui0Var3.d = o10;
                    ui0Var3.e = z10;
                    ui0Var3.c = 0;
                    ui0Var3.f = z10;
                    if (org.telegram.messenger.o5.E(o10)) {
                        TLRPC.User Z14 = notificationsCustomSettingsActivity.getMessagesController().Z1(Long.valueOf(o10));
                        if (Z14 == null) {
                            arrayList16.add(Long.valueOf(o10));
                            longSparseArray.put(o10, ui0Var3);
                        }
                        arrayList5 = arrayList26;
                        arrayList5.add(0, ui0Var3);
                        hashSet.add(Long.valueOf(o10));
                        max++;
                        arrayList26 = arrayList5;
                        z10 = true;
                    }
                }
                arrayList5 = arrayList26;
                max++;
                arrayList26 = arrayList5;
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
                    }
                    try {
                        notificationsCustomSettingsActivity.getMessagesStorage().V(TextUtils.join(",", arrayList18), arrayList4, arrayList16);
                    } catch (Exception e7) {
                        e = e7;
                        arrayList2 = arrayList28;
                        arrayList3 = arrayList27;
                        z11 = true;
                        i10 = 0;
                        org.telegram.messenger.f8.g(e, z11);
                        size = arrayList2.size();
                        while (i11 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i12 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i13 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i10 < size4) {
                        }
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.b41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
            } catch (Exception e10) {
                e = e10;
                arrayList2 = arrayList28;
                arrayList3 = arrayList27;
                arrayList4 = arrayList29;
            }
            try {
                if (arrayList16.isEmpty()) {
                    arrayList3 = arrayList27;
                    i10 = 0;
                } else {
                    try {
                        arrayList3 = arrayList27;
                        i10 = 0;
                    } catch (Exception e11) {
                        e = e11;
                        arrayList3 = arrayList27;
                        i10 = 0;
                        arrayList2 = arrayList28;
                        z11 = true;
                        org.telegram.messenger.f8.g(e, z11);
                        size = arrayList2.size();
                        while (i11 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i12 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i13 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i10 < size4) {
                        }
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.b41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                    try {
                        notificationsCustomSettingsActivity.getMessagesStorage().n0(arrayList16, arrayList3, false);
                    } catch (Exception e12) {
                        e = e12;
                        arrayList2 = arrayList28;
                        z11 = true;
                        org.telegram.messenger.f8.g(e, z11);
                        size = arrayList2.size();
                        while (i11 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i12 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i13 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i10 < size4) {
                        }
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.b41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
                if (arrayList17.isEmpty()) {
                    arrayList2 = arrayList28;
                } else {
                    org.telegram.messenger.hs messagesStorage = notificationsCustomSettingsActivity.getMessagesStorage();
                    String join = TextUtils.join(",", arrayList17);
                    arrayList2 = arrayList28;
                    try {
                        messagesStorage.Q(join, arrayList2);
                    } catch (Exception e13) {
                        e = e13;
                        z11 = true;
                        org.telegram.messenger.f8.g(e, z11);
                        size = arrayList2.size();
                        while (i11 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i12 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i13 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i10 < size4) {
                        }
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.b41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
            } catch (Exception e14) {
                e = e14;
                arrayList2 = arrayList28;
                arrayList3 = arrayList27;
                i10 = 0;
                z11 = true;
                org.telegram.messenger.f8.g(e, z11);
                size = arrayList2.size();
                while (i11 < size) {
                }
                size2 = arrayList3.size();
                while (i12 < size2) {
                }
                size3 = arrayList4.size();
                while (i13 < size3) {
                }
                size4 = longSparseArray.size();
                while (i10 < size4) {
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.b41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
            }
            size = arrayList2.size();
            for (i11 = i10; i11 < size; i11++) {
                TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                    ui0 ui0Var4 = (ui0) longSparseArray.get(-chat.id);
                    longSparseArray.remove(-chat.id);
                    if (ui0Var4 != null) {
                        if (!org.telegram.messenger.w3.T(chat) || chat.megagroup) {
                            arrayList12.add(ui0Var4);
                        } else {
                            arrayList15.add(ui0Var4);
                        }
                    }
                }
            }
            size2 = arrayList3.size();
            for (i12 = i10; i12 < size2; i12++) {
                TLRPC.User user = (TLRPC.User) arrayList3.get(i12);
                if (!user.deleted) {
                    longSparseArray.remove(user.id);
                }
            }
            size3 = arrayList4.size();
            for (i13 = i10; i13 < size3; i13++) {
                longSparseArray.remove(org.telegram.messenger.o5.F(((TLRPC.EncryptedChat) arrayList4.get(i13)).id));
            }
            size4 = longSparseArray.size();
            while (i10 < size4) {
                if (org.telegram.messenger.o5.z(longSparseArray.keyAt(i10))) {
                    arrayList12.remove(longSparseArray.valueAt(i10));
                    arrayList15.remove(longSparseArray.valueAt(i10));
                } else {
                    arrayList11.remove(longSparseArray.valueAt(i10));
                }
                i10++;
            }
        } else {
            arrayList2 = arrayList28;
            arrayList3 = arrayList27;
            arrayList4 = arrayList29;
        }
        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.b41(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
    }

    public static void b0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ui0 ui0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.j(true);
        notificationsCustomSettingsActivity.o0(ui0Var, view, true);
    }

    public static boolean g0(int i10, long j10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i10).e7;
        StringBuilder sb2 = new StringBuilder("stories_");
        sb2.append(j10);
        return sharedPreferences.contains(sb2.toString()) ? org.telegram.messenger.m5.w("stories_", j10, sharedPreferences, true) : sharedPreferences.contains("EnableAllStories") ? sharedPreferences.getBoolean("EnableAllStories", true) : m0(i10, j10);
    }

    public static boolean m0(int i10, long j10) {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(i10).i1);
        Collections.sort(arrayList, Comparator$-CC.comparingDouble(new org.telegram.ui.Components.y61(1)));
        int i11 = -1;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (org.telegram.messenger.o5.o(((TLRPC.TL_topPeer) arrayList.get(i12)).peer) == j10) {
                i11 = i12;
            }
        }
        return i11 >= 0 && i11 >= arrayList.size() + (-5);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.f = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.s == -1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747928, "NotificationsExceptions"));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747940, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 9));
        ArrayList arrayList = this.x;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
            b10.N();
            b10.B0 = new ag.l3(this, 17);
            b10.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, "Search"));
        }
        this.d = new si0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.c = xyVar;
        xyVar.setTextSize(18);
        this.c.setText(org.telegram.messenger.cd.L0(2131748228, "NoExceptions"));
        this.c.c();
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.a = tk0Var;
        tk0Var.r1();
        this.a.setEmptyView(this.c);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new s4.a0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.c, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.tk0 tk0Var2 = this.a;
        w6 w6Var = new w6(i10, context, this);
        this.b = w6Var;
        tk0Var2.setAdapter(w6Var);
        this.a.setOnItemClickListener(new rv(24, this, context));
        oi0 oi0Var = new oi0(this);
        oi0Var.c = 150L;
        oi0Var.e = 350L;
        oi0Var.f = 0L;
        oi0Var.g = 0L;
        oi0Var.d = 0L;
        oi0Var.C = false;
        oi0Var.i = new OvershootInterpolator(1.1f);
        oi0Var.o = org.telegram.ui.Components.gr.h;
        oi0Var.m = false;
        this.a.setItemAnimator(oi0Var);
        this.a.setOnScrollListener(new h3(this, 22));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.zs.f0) {
            if (i10 == org.telegram.messenger.zs.S0) {
                n0();
            }
        } else {
            w6 w6Var = this.b;
            if (w6Var != null) {
                w6Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(14, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 16, new Class[]{org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.pa.class, org.telegram.ui.Cells.l5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        int i10 = org.telegram.ui.ActionBar.t6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.v6));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0() {
        boolean B;
        qi0 qi0Var;
        int i10;
        int i11;
        ArrayList arrayList;
        boolean isEmpty = this.x.isEmpty();
        int i12 = this.s;
        if (isEmpty || i12 == 3) {
            int childCount = this.a.getChildCount();
            ArrayList arrayList2 = new ArrayList();
            if (i12 == 3) {
                Boolean bool = this.n;
                B = bool == null || bool.booleanValue() || !((arrayList = this.x) == null || arrayList.isEmpty());
            } else {
                B = getNotificationsController().B(i12);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.a.getChildAt(i13);
                org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) this.a.T(childAt);
                this.a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList3 = this.I;
                    if (R < arrayList3.size()) {
                        qi0Var = (qi0) arrayList3.get(R);
                        boolean z10 = (qi0Var == null && ((i11 = qi0Var.c) == 102 || i11 == 101 || i11 == 100)) ? true : B;
                        i10 = ck0Var.f;
                        View view = ck0Var.a;
                        if (i10 != 0) {
                            ((org.telegram.ui.Cells.p4) view).a(arrayList2, z10);
                        } else if (i10 == 1) {
                            ((org.telegram.ui.Cells.t8) view).e(arrayList2, z10);
                        } else if (i10 == 3) {
                            ((org.telegram.ui.Cells.v8) view).a(arrayList2, z10);
                        } else if (i10 == 5) {
                            ((org.telegram.ui.Cells.x9) view).a(arrayList2, z10);
                        }
                    }
                }
                qi0Var = null;
                if (qi0Var == null) {
                }
                i10 = ck0Var.f;
                View view2 = ck0Var.a;
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
            this.e.addListener(new org.telegram.ui.Components.voip.h2(this, 18));
            this.e.setDuration(150L);
            this.e.start();
        }
    }

    public final void i0(ui0 ui0Var, View view) {
        String v = org.telegram.messenger.ot.v(ui0Var.d, 0L, false);
        getNotificationsSettings().edit().remove("stories_" + v).commit();
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            arrayList.remove(ui0Var);
        }
        ArrayList arrayList2 = this.x;
        if (arrayList2 != null) {
            arrayList2.remove(ui0Var);
        }
        if (m0(this.currentAccount, ui0Var.d)) {
            ui0Var.f = true;
            ui0Var.c = 0;
            this.w.add(ui0Var);
        }
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.f(ui0Var, null, paVar.S);
        }
        getNotificationsController().c0(ui0Var.d, 0L, false);
        p0(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j0() {
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
            if (org.telegram.ui.Cells.v8.f[i12] == i10) {
                return org.telegram.ui.Cells.v8.e[i12];
            }
        }
        return i10;
    }

    public final String k0() {
        int i10 = this.s;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : getNotificationsSettings().getInt("popupChannel", 0) : getNotificationsSettings().getInt("popupAll", 0) : getNotificationsSettings().getInt("popupGroup", 0);
        int[] iArr = this.E;
        return org.telegram.messenger.cd.L0(iArr[Utilities.j(i11, iArr.length - 1, 0)], null);
    }

    public final String l0() {
        int i10 = this.s;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? (i10 == 4 || i10 == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1 : getNotificationsSettings().getInt("priority_stories", 1) : getNotificationsSettings().getInt("priority_channel", 1) : getNotificationsSettings().getInt("priority_messages", 1) : getNotificationsSettings().getInt("priority_group", 1);
        int[] iArr = this.F;
        return org.telegram.messenger.cd.L0(iArr[Utilities.j(i11, iArr.length - 1, 0)], null);
    }

    public final void n0() {
        ArrayList arrayList;
        if (this.s == 3) {
            org.telegram.messenger.ui.b0(this.currentAccount).M0(true);
            arrayList = new ArrayList(org.telegram.messenger.ui.b0(this.currentAccount).i1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().a.c(new uf0(6, this, arrayList));
    }

    public final void o0(ui0 ui0Var, View view, boolean z10) {
        String v = org.telegram.messenger.ot.v(ui0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean m0 = m0(this.currentAccount, ui0Var.d);
        ui0Var.c = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
        if (ui0Var.f) {
            ui0Var.f = false;
            edit.putBoolean(sc.e.h("stories_", v), !z10).commit();
            ArrayList arrayList = this.w;
            if (arrayList != null) {
                arrayList.remove(ui0Var);
            }
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(0, ui0Var);
        } else if (m0) {
            edit.putBoolean(sc.e.h("stories_", v), !z10).commit();
        } else {
            Boolean bool = this.n;
            if (!z10 ? bool == null || !bool.booleanValue() : bool != null && bool.booleanValue()) {
                i0(ui0Var, view);
                return;
            }
            edit.putBoolean(sc.e.h("stories_", v), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.f(ui0Var, null, paVar.S);
        }
        getNotificationsController().c0(ui0Var.d, 0L, false);
        p0(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i11 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                str = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.cd.L0(2131745298, "SoundDefault") : ringtone.getTitle(getParentActivity());
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
            getNotificationsController().m(i12);
            edit.commit();
            getNotificationsController().b0(i12);
            s4.c1 K = this.a.K(i10);
            if (K != null) {
                this.b.t(K, i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        p0(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
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
        p0(true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.zs.f0);
        getNotificationCenter().n(this, org.telegram.messenger.zs.S0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        w6 w6Var = this.b;
        if (w6Var != null) {
            w6Var.f();
        }
        getNotificationCenter().c(this, org.telegram.messenger.zs.f0);
        getNotificationCenter().c(this, org.telegram.messenger.zs.S0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            q0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
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
        ArrayList arrayList3 = this.H;
        arrayList3.clear();
        ArrayList arrayList4 = this.I;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i10 = this.s;
        if (i10 != -1) {
            String L0 = org.telegram.messenger.cd.L0(2131747860, null);
            qi0 qi0Var = new qi0(0, true);
            qi0Var.e = L0;
            arrayList4.add(qi0Var);
            if (i10 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(qi0.b(101, org.telegram.messenger.cd.L0(2131747855, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    arrayList4.add(qi0.b(org.telegram.messenger.zs.n1, org.telegram.messenger.cd.L0(2131747857, null), this.r && ((bool = this.n) == null || !bool.booleanValue())));
                }
                arrayList4.add(qi0.d(-1, org.telegram.messenger.cd.L0(2131744736, null)));
            } else if (i10 == 4 || i10 == 5) {
                this.messagesRow = arrayList4.size();
                String L02 = org.telegram.messenger.cd.L0(2131747856, null);
                String L03 = org.telegram.messenger.cd.L0(!notificationsSettings.getBoolean("EnableReactionsMessages", true) ? 2131747862 : notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? 2131747864 : 2131747863, null);
                boolean z11 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                qi0 qi0Var2 = new qi0(6, true);
                qi0Var2.c = org.telegram.messenger.zs.o1;
                qi0Var2.d = R.drawable.msg_markunread;
                qi0Var2.e = L02;
                qi0Var2.f = L03;
                qi0Var2.i = z11;
                arrayList4.add(qi0Var2);
                this.storiesRow = arrayList4.size();
                String L04 = org.telegram.messenger.cd.L0(2131747853, null);
                String L05 = org.telegram.messenger.cd.L0(!notificationsSettings.getBoolean("EnableReactionsStories", true) ? 2131747862 : notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? 2131747864 : 2131747863, null);
                boolean z12 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                qi0 qi0Var3 = new qi0(6, true);
                qi0Var3.c = org.telegram.messenger.zs.p1;
                qi0Var3.d = R.drawable.msg_stories_saved;
                qi0Var3.e = L04;
                qi0Var3.f = L05;
                qi0Var3.i = z12;
                arrayList4.add(qi0Var3);
                arrayList4.add(qi0.d(-1, null));
            } else {
                int i11 = i10 == 1 ? 2131747854 : i10 == 0 ? 2131747858 : 2131747859;
                this.showRow = arrayList4.size();
                arrayList4.add(qi0.b(100, org.telegram.messenger.cd.L0(i11, null), getNotificationsController().B(i10)));
                arrayList4.add(qi0.d(-1, null));
            }
            String L06 = org.telegram.messenger.cd.L0(2131746000, null);
            qi0 qi0Var4 = new qi0(0, true);
            qi0Var4.e = L06;
            arrayList4.add(qi0Var4);
            arrayList4.size();
            if (i10 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(qi0.b(0, org.telegram.messenger.cd.L0(2131747949, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i10 == 4 || i10 == 5) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(qi0.b(0, org.telegram.messenger.cd.L0(2131747949, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                boolean z13 = i10 != 0 ? i10 != 1 ? i10 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true) : notificationsSettings.getBoolean("EnablePreviewAll", true) : notificationsSettings.getBoolean("EnablePreviewGroup", true);
                this.previewRow = arrayList4.size();
                arrayList4.add(qi0.b(0, org.telegram.messenger.cd.L0(2131748552, null), z13));
            }
            this.soundRow = arrayList4.size();
            String L07 = org.telegram.messenger.cd.L0(2131745301, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String L08 = org.telegram.messenger.cd.L0(2131745298, "SoundDefault");
            arrayList = arrayList3;
            if (i10 == 0) {
                string = notificationsSettings2.getString("GroupSound", L08);
                j10 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            } else if (i10 == 1) {
                string = notificationsSettings2.getString("GlobalSound", L08);
                j10 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
            } else if (i10 == 3) {
                string = notificationsSettings2.getString("StoriesSound", L08);
                j10 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
            } else if (i10 == 4 || i10 == 5) {
                string = notificationsSettings2.getString("ReactionSound", L08);
                j10 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
            } else {
                string = notificationsSettings2.getString("ChannelSound", L08);
                j10 = notificationsSettings2.getLong("ChannelDocId", 0L);
            }
            long j11 = j10;
            if (j11 != 0) {
                TLRPC.Document c10 = getMediaDataController().z0.c(j11);
                string = c10 == null ? org.telegram.messenger.cd.L0(2131751680, "CustomSound") : yi0.f0(c10, org.telegram.messenger.b8.B(c10));
            } else if (string.equals("NoSound")) {
                string = org.telegram.messenger.cd.L0(2131748167, "NoSound");
            } else if (string.equals("Default")) {
                string = org.telegram.messenger.cd.L0(2131745298, "SoundDefault");
            }
            arrayList4.add(qi0.c(3, L07, string));
            if (this.G) {
                this.lightColorRow = arrayList4.size();
                String L09 = org.telegram.messenger.cd.L0(2131748999, "LedColor");
                int j02 = j0();
                qi0 qi0Var5 = new qi0(3, true);
                qi0Var5.e = L09;
                qi0Var5.h = j02;
                arrayList4.add(qi0Var5);
                int i12 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? (i10 == 4 || i10 == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0 : notificationsSettings.getInt("vibrate_stories", 0) : notificationsSettings.getInt("vibrate_channel", 0) : notificationsSettings.getInt("vibrate_messages", 0) : notificationsSettings.getInt("vibrate_group", 0);
                this.vibrateRow = arrayList4.size();
                String L010 = org.telegram.messenger.cd.L0(2131743640, "Vibrate");
                int[] iArr = this.D;
                arrayList4.add(qi0.c(1, L010, org.telegram.messenger.cd.L0(iArr[Utilities.j(i12, iArr.length - 1, 0)], null)));
                if (i10 == 1 || i10 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(qi0.c(2, org.telegram.messenger.cd.L0(2131747113, "PopupNotification"), k0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(qi0.c(4, org.telegram.messenger.cd.L0(2131747922, "NotificationsImportance"), l0()));
                String L011 = org.telegram.messenger.cd.L0(2131747861, null);
                qi0 qi0Var6 = new qi0(8, true);
                qi0Var6.e = L011;
                qi0Var6.d = 0;
                arrayList4.add(qi0Var6);
            } else {
                String L012 = org.telegram.messenger.cd.L0(2131747852, null);
                qi0 qi0Var7 = new qi0(8, true);
                qi0Var7.e = L012;
                qi0Var7.d = 1;
                arrayList4.add(qi0Var7);
            }
            arrayList4.size();
            arrayList4.add(qi0.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i10 != 4 && i10 != 5) {
            if (i10 != -1) {
                this.addExceptionRow = arrayList4.size();
                String L013 = org.telegram.messenger.cd.L0(2131747939, "NotificationsAddAnException");
                qi0 qi0Var8 = new qi0(7, true);
                qi0Var8.c = 6;
                qi0Var8.d = R.drawable.msg_contact_add;
                qi0Var8.e = L013;
                arrayList4.add(qi0Var8);
            }
            arrayList4.size();
            if (this.w != null && this.h) {
                for (int i13 = 0; i13 < this.w.size(); i13++) {
                    ui0 ui0Var = (ui0) this.w.get(i13);
                    qi0 qi0Var9 = new qi0(2, true);
                    qi0Var9.g = ui0Var;
                    arrayList4.add(qi0Var9);
                }
            }
            if (this.x != null) {
                for (int i14 = 0; i14 < this.x.size(); i14++) {
                    ui0 ui0Var2 = (ui0) this.x.get(i14);
                    qi0 qi0Var10 = new qi0(2, true);
                    qi0Var10.g = ui0Var2;
                    arrayList4.add(qi0Var10);
                }
            }
            arrayList4.size();
            if (i10 != -1 || ((arrayList2 = this.x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(qi0.d(-3, null));
            }
            ArrayList arrayList5 = this.x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String L014 = org.telegram.messenger.cd.L0(2131747931, "NotificationsDeleteAllException");
                qi0 qi0Var11 = new qi0(7, true);
                qi0Var11.c = 7;
                qi0Var11.d = 0;
                qi0Var11.e = L014;
                arrayList4.add(qi0Var11);
            }
        }
        w6 w6Var = this.b;
        if (w6Var != null) {
            if (z10) {
                w6Var.E(arrayList, arrayList4);
            } else {
                w6Var.f();
            }
        }
    }

    public final void q0() {
        try {
            if (this.a == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wl, false);
            int i10 = 0;
            while (i10 < 4) {
                int childCount = i10 == 0 ? this.a.getChildCount() : i10 == 1 ? this.a.getHiddenChildCount() : i10 == 2 ? this.a.getCachedChildCount() : this.a.getAttachedScrapChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = i10 == 0 ? this.a.getChildAt(i11) : i10 == 1 ? this.a.V(i11) : i10 == 2 ? this.a.P(i11) : this.a.O(i11);
                    if (childAt instanceof org.telegram.ui.Cells.pa) {
                        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) childAt;
                        paVar.a0 = true;
                        paVar.Q = x02;
                        paVar.R = x03;
                        if (i10 != 0) {
                            ((org.telegram.ui.Cells.pa) childAt).i(0);
                        }
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
