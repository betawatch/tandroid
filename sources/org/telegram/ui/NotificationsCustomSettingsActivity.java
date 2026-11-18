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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public final int[] E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public org.telegram.ui.Components.ck0 a;
    public int addExceptionRow;
    public v6 b;
    public org.telegram.ui.Components.ty c;
    public rh0 d;
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

    public NotificationsCustomSettingsActivity(int i7, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        super(null);
        this.h = true;
        this.y = new HashMap();
        this.E = new int[]{2131743376, 2131745171, 2131743375, 2131748531, 2131747628};
        this.F = new int[]{2131747985, 2131747625, 2131747626, 2131754264};
        this.G = new int[]{2131747690, 2131747686, 2131747686, 2131747688, 2131747689, 2131747688};
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
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.s = i7;
        this.w = arrayList2;
        this.x = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                th0 th0Var = (th0) this.x.get(i10);
                this.y.put(Long.valueOf(th0Var.d), th0Var);
            }
        }
        ArrayList arrayList3 = this.w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                th0 th0Var2 = (th0) this.w.get(i11);
                this.y.put(Long.valueOf(th0Var2.d), th0Var2);
            }
        }
        if (z10) {
            o0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context, View view, int i7, float f10, float f11) {
        HashMap hashMap;
        th0 th0Var;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Drawable drawable;
        final na naVar;
        boolean z13;
        String str;
        long j3;
        th0 th0Var2;
        boolean z14;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
        ArrayList arrayList2 = notificationsCustomSettingsActivity2.J;
        HashMap hashMap2 = notificationsCustomSettingsActivity2.y;
        int i11 = notificationsCustomSettingsActivity2.s;
        if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
            return;
        }
        ph0 ph0Var = (notificationsCustomSettingsActivity2.a.getAdapter() != notificationsCustomSettingsActivity2.b || i7 < 0 || i7 >= arrayList2.size()) ? null : (ph0) arrayList2.get(i7);
        boolean z15 = true;
        boolean z16 = true;
        if (ph0Var != null && ph0Var.a == 8) {
            notificationsCustomSettingsActivity2.H = !notificationsCustomSettingsActivity2.H;
            notificationsCustomSettingsActivity2.q0(true);
            return;
        }
        if (i11 != 3 || ph0Var == null) {
            hashMap = hashMap2;
        } else {
            hashMap = hashMap2;
            th0 th0Var3 = ph0Var.g;
            if (th0Var3 != null) {
                org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(notificationsCustomSettingsActivity2, view);
                I.i = 3;
                I.m(R.drawable.msg_mute, new jh0(notificationsCustomSettingsActivity2, th0Var3, view, i7, 5), org.telegram.messenger.gd.M0(2131747671, null), th0Var3.c <= 0 || th0Var3.f, false);
                I.m(R.drawable.msg_unmute, new jh0(notificationsCustomSettingsActivity, th0Var3, view, i7, 0), org.telegram.messenger.gd.M0(2131747668, null), th0Var3.c > 0 || th0Var3.f, false);
                I.m(R.drawable.msg_delete, new jh0(notificationsCustomSettingsActivity, th0Var3, view, i7, 1), org.telegram.messenger.gd.M0(2131751531, "DeleteException"), !th0Var3.f, true);
                I.X(notificationsCustomSettingsActivity.a.U0(view, false));
                I.a0();
                return;
            }
        }
        if (i11 == 3) {
            v4.i0 adapter = notificationsCustomSettingsActivity2.a.getAdapter();
            rh0 rh0Var = notificationsCustomSettingsActivity2.d;
            if (adapter == rh0Var) {
                Object E = rh0Var.E(i7);
                if (E instanceof th0) {
                    th0Var2 = (th0) E;
                    str = "DeleteException";
                } else {
                    boolean z17 = E instanceof TLRPC.User;
                    if (z17) {
                        str = "DeleteException";
                        j3 = ((TLRPC.User) E).id;
                    } else {
                        str = "DeleteException";
                        j3 = -((TLRPC.Chat) E).id;
                    }
                    if (!hashMap.containsKey(Long.valueOf(j3))) {
                        th0 th0Var4 = new th0();
                        th0Var4.e = true;
                        th0Var4.d = j3;
                        if (z17) {
                            th0Var4.d = ((TLRPC.User) E).id;
                        } else {
                            th0Var4.d = -((TLRPC.Chat) E).id;
                        }
                        th0Var2 = th0Var4;
                        z14 = true;
                        if (th0Var2 != null) {
                            return;
                        }
                        org.telegram.ui.Components.y60 I2 = org.telegram.ui.Components.y60.I(notificationsCustomSettingsActivity2, view);
                        I2.i = 3;
                        th0 th0Var5 = th0Var2;
                        I2.m(R.drawable.msg_mute, new jh0(notificationsCustomSettingsActivity2, th0Var5, view, z14, 2), org.telegram.messenger.gd.M0(2131747671, null), th0Var2.c <= 0 || th0Var2.f, false);
                        I2.m(R.drawable.msg_unmute, new jh0(notificationsCustomSettingsActivity, th0Var5, view, z14, 3), org.telegram.messenger.gd.M0(2131747668, null), th0Var5.c > 0 || th0Var5.f, false);
                        I2.m(R.drawable.msg_delete, new jh0(notificationsCustomSettingsActivity, th0Var5, view, i7, 4), org.telegram.messenger.gd.M0(2131751531, str), (z14 || th0Var5.f) ? false : true, true);
                        I2.X(notificationsCustomSettingsActivity.a.U0(view, false));
                        I2.a0();
                        return;
                    }
                    th0Var2 = (th0) hashMap.get(Long.valueOf(j3));
                }
                z14 = false;
                if (th0Var2 != null) {
                }
            }
        }
        if (notificationsCustomSettingsActivity2.a.getAdapter() == notificationsCustomSettingsActivity2.d || !(ph0Var == null || ph0Var.g == null)) {
            v4.i0 adapter2 = notificationsCustomSettingsActivity2.a.getAdapter();
            rh0 rh0Var2 = notificationsCustomSettingsActivity2.d;
            if (adapter2 == rh0Var2) {
                Object E2 = rh0Var2.E(i7);
                if (E2 instanceof th0) {
                    th0Var = (th0) E2;
                    arrayList = notificationsCustomSettingsActivity2.d.d;
                    z12 = false;
                } else {
                    boolean z18 = E2 instanceof TLRPC.User;
                    long j10 = z18 ? ((TLRPC.User) E2).id : -((TLRPC.Chat) E2).id;
                    if (hashMap.containsKey(Long.valueOf(j10))) {
                        th0Var = (th0) hashMap.get(Long.valueOf(j10));
                        z11 = false;
                    } else {
                        th0 th0Var6 = new th0();
                        th0Var6.d = j10;
                        if (z18) {
                            th0Var6.d = ((TLRPC.User) E2).id;
                        } else {
                            th0Var6.d = -((TLRPC.Chat) E2).id;
                        }
                        th0Var = th0Var6;
                        z11 = true;
                    }
                    arrayList = notificationsCustomSettingsActivity2.x;
                    z12 = z11;
                }
                z10 = z12;
            } else {
                th0Var = ph0Var.g;
                if (th0Var.f) {
                    return;
                }
                arrayList = notificationsCustomSettingsActivity2.x;
                z10 = false;
            }
            ArrayList arrayList3 = arrayList;
            th0 th0Var7 = th0Var;
            if (th0Var7 == null) {
                return;
            }
            long j11 = th0Var7.d;
            org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(context, notificationsCustomSettingsActivity2.currentAccount, null, true, new mh0(notificationsCustomSettingsActivity2, j11, org.telegram.messenger.xs.t(notificationsCustomSettingsActivity2.currentAccount).D(j11, null, false, false), th0Var7, z10, i7, arrayList3), notificationsCustomSettingsActivity.getResourceProvider());
            poVar.e(j11, 0, null);
            poVar.d(notificationsCustomSettingsActivity, view, f10, f11, false);
            return;
        }
        if (ph0Var == null) {
            return;
        }
        int i12 = ph0Var.c;
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
            cx cxVar = new cx(bundle);
            cxVar.E2 = new kh0(notificationsCustomSettingsActivity2);
            notificationsCustomSettingsActivity2.presentFragment(cxVar);
            return;
        }
        if (i12 == 7) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            String M0 = org.telegram.messenger.gd.M0(2131747720, "NotificationsDeleteAllExceptionTitle");
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(2131747721, "NotificationsDeleteAllExceptionAlert");
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, "Delete"), new kh0(notificationsCustomSettingsActivity2));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, "Cancel"), null);
            notificationsCustomSettingsActivity2.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                return;
            }
            return;
        }
        int i13 = 19;
        if (i12 == 100 || i12 == 101) {
            boolean B = notificationsCustomSettingsActivity2.getNotificationsController().B(i11);
            notificationsCustomSettingsActivity2.a.K(i7);
            final int i14 = notificationsCustomSettingsActivity2.s;
            if (i14 == 3) {
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
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i11);
                notificationsCustomSettingsActivity2.q0(true);
                boolean z21 = notificationsCustomSettingsActivity2.h;
                if (z21 != (notificationsCustomSettingsActivity2.n == null) && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z21;
                    notificationsCustomSettingsActivity2.q0(true);
                }
                notificationsCustomSettingsActivity2.i0();
                return;
            }
            if (!B) {
                notificationsCustomSettingsActivity2.getNotificationsController().U(i11, 0);
                notificationsCustomSettingsActivity2.q0(true);
                return;
            }
            final ArrayList arrayList4 = notificationsCustomSettingsActivity2.x;
            final ArrayList arrayList5 = notificationsCustomSettingsActivity2.w;
            int i15 = notificationsCustomSettingsActivity2.currentAccount;
            na naVar2 = new na(notificationsCustomSettingsActivity2, z16 ? 1 : 0);
            Pattern pattern = org.telegram.ui.Components.b5.a;
            if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
                return;
            }
            final boolean D = org.telegram.messenger.xs.t(i15).D(0L, null, false, false);
            String[] strArr = {org.telegram.messenger.gd.M0(2131747664, null), org.telegram.messenger.gd.a0("MuteFor", null, 2131748120, org.telegram.messenger.gd.G(1, "Hours", new Object[0])), org.telegram.messenger.gd.a0("MuteFor", null, 2131748120, org.telegram.messenger.gd.G(2, "Days", new Object[0])), null, org.telegram.messenger.gd.M0(2131747665, null)};
            int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
            LinearLayout linearLayout = new LinearLayout(notificationsCustomSettingsActivity2.getParentActivity());
            linearLayout.setOrientation(1);
            final AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            int i16 = 0;
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity2;
            while (i16 < 5) {
                if (strArr[i16] == null) {
                    i10 = i15;
                    naVar = naVar2;
                } else {
                    TextView textView2 = new TextView(notificationsCustomSettingsActivity3.getParentActivity());
                    Drawable drawable2 = notificationsCustomSettingsActivity3.getParentActivity().getResources().getDrawable(iArr[i16]);
                    if (i16 == 4) {
                        drawable = null;
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q7, null);
                        i10 = i15;
                        org.telegram.ui.ActionBar.u6.x(textView2, drawable2, org.telegram.ui.ActionBar.n6.p7, null, PorterDuff.Mode.MULTIPLY);
                    } else {
                        i10 = i15;
                        drawable = null;
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.j5, null);
                        org.telegram.ui.ActionBar.u6.x(textView2, drawable2, org.telegram.ui.ActionBar.n6.J5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    org.telegram.messenger.n10.q(textView2, 1, 16.0f, 1, 1);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, drawable, drawable);
                    textView2.setTag(Integer.valueOf(i16));
                    textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                    textView2.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                    textView2.setSingleLine(true);
                    textView2.setGravity(19);
                    textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(26.0f));
                    textView2.setText(strArr[i16]);
                    linearLayout.addView(textView2, c8.ma.r(-1, 48, 51));
                    naVar = naVar2;
                    final NotificationsCustomSettingsActivity notificationsCustomSettingsActivity4 = notificationsCustomSettingsActivity3;
                    final int i17 = i10;
                    View.OnClickListener onClickListener = new View.OnClickListener(i17, D, i14, notificationsCustomSettingsActivity4, arrayList4, arrayList5, naVar, alertDialog$Builder2) { // from class: org.telegram.ui.Components.t2
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ NotificationsCustomSettingsActivity c;
                        public final /* synthetic */ ArrayList d;
                        public final /* synthetic */ ArrayList e;
                        public final /* synthetic */ org.telegram.ui.na f;
                        public final /* synthetic */ AlertDialog$Builder h;

                        {
                            this.b = i14;
                            this.c = notificationsCustomSettingsActivity4;
                            this.d = arrayList4;
                            this.e = arrayList5;
                            this.f = naVar;
                            this.h = alertDialog$Builder2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i18;
                            int intValue = ((Integer) view2.getTag()).intValue();
                            int i19 = this.a;
                            int i20 = this.b;
                            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity5 = this.c;
                            int i21 = 3;
                            if (intValue == 0) {
                                org.telegram.messenger.xs.t(i19).U(i20, 0);
                            } else if (intValue == 3) {
                                notificationsCustomSettingsActivity5.presentFragment(new NotificationsCustomSettingsActivity(i20, this.d, this.e, false));
                            } else {
                                int currentTime = ConnectionsManager.getInstance(i19).getCurrentTime();
                                if (intValue == 1) {
                                    currentTime += 3600;
                                } else if (intValue == 2) {
                                    currentTime += 172800;
                                } else if (intValue == 4) {
                                    i18 = Integer.MAX_VALUE;
                                    org.telegram.messenger.xs.t(i19).H(0L, i18, 0);
                                    org.telegram.messenger.xs.t(i19).U(i20, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                }
                                i18 = currentTime;
                                org.telegram.messenger.xs.t(i19).H(0L, i18, 0);
                                org.telegram.messenger.xs.t(i19).U(i20, ConnectionsManager.DEFAULT_DATACENTER_ID);
                            }
                            this.f.a(intValue);
                            this.h.a.M0.run();
                            if (intValue == 0) {
                                i21 = 4;
                            } else if (intValue == 1) {
                                i21 = 0;
                            } else if (intValue == 2) {
                                i21 = 2;
                            } else if (intValue != 4) {
                                i21 = -1;
                            }
                            if (i21 < 0 || !lc.a(notificationsCustomSettingsActivity5)) {
                                return;
                            }
                            lc.z(notificationsCustomSettingsActivity5, i21, 0, null).j();
                        }
                    };
                    notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity4;
                    textView2.setOnClickListener(onClickListener);
                }
                i16++;
                naVar2 = naVar;
                i15 = i10;
                notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity3;
            }
            String M02 = org.telegram.messenger.gd.M0(2131747731, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.S = M02;
            alertDialog$Builder2.o(linearLayout);
            notificationsCustomSettingsActivity3.showDialog(u1Var2);
            return;
        }
        if (i12 == 3) {
            if (view.isEnabled()) {
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, i11);
                    notificationsCustomSettingsActivity2.presentFragment(new xh0(bundle2, notificationsCustomSettingsActivity2.getResourceProvider()));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            return;
        }
        if (ph0Var.a == 3) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.b5.t(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new lh0(notificationsCustomSettingsActivity2, view, i7, 0), null));
                return;
            }
            return;
        }
        if (i12 == 2) {
            if (view.isEnabled()) {
                Activity parentActivity = notificationsCustomSettingsActivity2.getParentActivity();
                lh0 lh0Var = new lh0(notificationsCustomSettingsActivity2, view, i7, 1);
                Pattern pattern2 = org.telegram.ui.Components.b5.a;
                SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).g7;
                int[] iArr2 = new int[1];
                if (i11 == 1) {
                    iArr2[0] = sharedPreferences.getInt("popupAll", 0);
                } else if (i11 == 0) {
                    iArr2[0] = sharedPreferences.getInt("popupGroup", 0);
                } else {
                    iArr2[0] = sharedPreferences.getInt("popupChannel", 0);
                }
                String[] strArr2 = {org.telegram.messenger.gd.M0(2131747985, null), org.telegram.messenger.gd.M0(2131747625, null), org.telegram.messenger.gd.M0(2131747626, null), org.telegram.messenger.gd.M0(2131754264, null)};
                LinearLayout f12 = org.telegram.messenger.f3.f(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity);
                int i18 = 0;
                while (i18 < 4) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(parentActivity, null);
                    j6Var.setTag(Integer.valueOf(i18));
                    j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    org.telegram.ui.Components.b5.a(j6Var, org.telegram.ui.ActionBar.n6.g7, org.telegram.ui.ActionBar.n6.E5, null);
                    j6Var.b(strArr2[i18], iArr2[0] == i18);
                    f12.addView(j6Var);
                    j6Var.setOnClickListener(new fi.j5(iArr2, i11, alertDialog$Builder3, lh0Var, 2));
                    i18++;
                }
                String M03 = org.telegram.messenger.gd.M0(2131746905, null);
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                u1Var3.S = M03;
                alertDialog$Builder3.o(f12);
                alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131752578, null), null);
                notificationsCustomSettingsActivity2.showDialog(u1Var3);
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view.isEnabled()) {
                String str2 = i11 == 1 ? "vibrate_messages" : i11 == 0 ? "vibrate_group" : i11 == 3 ? "vibrate_stories" : (i11 == 4 || i11 == 5) ? "vibrate_react" : "vibrate_channel";
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.b5.V(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0L, str2, new org.telegram.ui.Components.kp0(notificationsCustomSettingsActivity2, view, str2, i7, 11), null));
                return;
            }
            return;
        }
        if (i12 == 4) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.b5.F(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new lh0(notificationsCustomSettingsActivity2, view, i7, 2), null));
                return;
            }
            return;
        }
        if (i12 == 102) {
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
                    ph0Var.i = true;
                } else {
                    edit2.putBoolean("EnableAllStories", false);
                    notificationsCustomSettingsActivity2.n = Boolean.FALSE;
                    notificationsCustomSettingsActivity2.r = false;
                    ph0Var.i = false;
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(notificationsCustomSettingsActivity2.r);
                }
                edit2.commit();
                boolean z22 = notificationsCustomSettingsActivity2.r;
                boolean z23 = notificationsCustomSettingsActivity2.h;
                if (z22 != z23 && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z23;
                    notificationsCustomSettingsActivity2.q0(true);
                }
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i11);
                notificationsCustomSettingsActivity2.i0();
                return;
            }
            return;
        }
        if (i12 == 0) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings2 = notificationsCustomSettingsActivity2.getNotificationsSettings();
                SharedPreferences.Editor edit3 = notificationsSettings2.edit();
                if (i11 == 1) {
                    z13 = notificationsSettings2.getBoolean("EnablePreviewAll", true);
                    edit3.putBoolean("EnablePreviewAll", !z13);
                } else if (i11 == 0) {
                    z13 = notificationsSettings2.getBoolean("EnablePreviewGroup", true);
                    edit3.putBoolean("EnablePreviewGroup", !z13);
                } else if (i11 == 3) {
                    z13 = !notificationsSettings2.getBoolean("EnableHideStoriesSenders", false);
                    edit3.putBoolean("EnableHideStoriesSenders", z13);
                } else if (i11 == 4 || i11 == 5) {
                    z13 = notificationsSettings2.getBoolean("EnableReactionsPreview", true);
                    edit3.putBoolean("EnableReactionsPreview", !z13);
                } else {
                    z13 = notificationsSettings2.getBoolean("EnablePreviewChannel", true);
                    edit3.putBoolean("EnablePreviewChannel", !z13);
                }
                edit3.commit();
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i11);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(!z13);
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == 103 || i12 == 104) {
            boolean z24 = !org.telegram.messenger.gd.a0 ? f10 <= ((float) (view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) : f10 >= ((float) org.telegram.messenger.g0.L(76.0f));
            SharedPreferences notificationsSettings3 = notificationsCustomSettingsActivity2.getNotificationsSettings();
            if (z24) {
                String str3 = ph0Var.c == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                SharedPreferences.Editor edit4 = notificationsSettings3.edit();
                edit4.putBoolean(str3, !notificationsSettings3.getBoolean(str3, true));
                edit4.apply();
                notificationsCustomSettingsActivity2.q0(true);
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i11);
                return;
            }
            String str4 = ph0Var.c == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
            ?? r42 = 0;
            boolean[] zArr = {notificationsSettings3.getBoolean(str4, false)};
            org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
            int i19 = 0;
            while (i19 < 2) {
                org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, notificationsCustomSettingsActivity2.getResourceProvider());
                j6VarArr[i19] = j6Var2;
                boolean z25 = z15;
                j6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), r42, org.telegram.messenger.g0.L(4.0f), r42);
                j6VarArr[i19].a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.g7, r42), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E5, r42));
                j6VarArr[i19].b(org.telegram.messenger.gd.M0(i19 == 0 ? 2131747656 : 2131747657, null), i19 == 0 ? !zArr[r42] ? z25 : r42 : zArr[r42]);
                ai.k1 k1Var = j6VarArr[i19];
                int i20 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.ActionBar.u6.Q(k1Var, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i20, r42), 2, -1), null, org.telegram.ui.ActionBar.u6.M(i20), null);
                g10.addView(j6VarArr[i19]);
                j6VarArr[i19].setOnClickListener(new bi.f5(zArr, i19, j6VarArr, i13));
                i19++;
                z15 = z25;
                r42 = 0;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, notificationsCustomSettingsActivity2.getParentActivity(), notificationsCustomSettingsActivity2.resourceProvider);
            String M04 = org.telegram.messenger.gd.M0(2131747658, null);
            org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
            u1Var4.S = M04;
            alertDialog$Builder4.o(g10);
            alertDialog$Builder4.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131745751, null), new a1.d(notificationsCustomSettingsActivity2, notificationsSettings3, str4, zArr, 17));
            notificationsCustomSettingsActivity2.showDialog(u1Var4);
        }
    }

    public static void a0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, th0 th0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.o(true);
        notificationsCustomSettingsActivity.p0(th0Var, view, false);
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
    public static void b0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i7;
        boolean z11;
        int size;
        int i10;
        int size2;
        int i11;
        int size3;
        int i12;
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
        long j3 = notificationsCustomSettingsActivity.getUserConfig().n;
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
                if (longValue2 == 0 || longValue2 == j3) {
                    arrayList10 = arrayList21;
                    arrayList7 = arrayList23;
                } else {
                    arrayList7 = arrayList23;
                    th0 th0Var = new th0();
                    th0Var.d = longValue2;
                    arrayList10 = arrayList21;
                    ArrayList arrayList24 = arrayList12;
                    th0Var.b = org.telegram.messenger.f3.w("custom_", longValue2, notificationsSettings, false);
                    int intValue = ((Integer) next.getValue()).intValue();
                    th0Var.c = intValue;
                    if (intValue != 0) {
                        Integer num = (Integer) all.get("notifyuntil_" + replace);
                        if (num != null) {
                            th0Var.a = num.intValue();
                        }
                    }
                    if (org.telegram.messenger.n5.C(longValue2)) {
                        int i13 = (int) (4294967295L & longValue2);
                        TLRPC.EncryptedChat c12 = notificationsCustomSettingsActivity.getMessagesController().c1(Integer.valueOf(i13));
                        if (c12 == null) {
                            arrayList18.add(Integer.valueOf(i13));
                            longSparseArray.put(longValue2, th0Var);
                        } else {
                            TLRPC.User c22 = notificationsCustomSettingsActivity.getMessagesController().c2(Long.valueOf(c12.user_id));
                            if (c22 == null) {
                                arrayList16.add(Long.valueOf(c12.user_id));
                                longSparseArray.put(c12.user_id, th0Var);
                            } else if (c22.deleted) {
                                it = it2;
                                arrayList20 = arrayList22;
                                arrayList19 = arrayList9;
                                arrayList14 = arrayList8;
                                arrayList13 = arrayList7;
                                arrayList21 = arrayList10;
                                arrayList12 = arrayList24;
                            }
                        }
                        arrayList11.add(th0Var);
                        arrayList12 = arrayList24;
                    } else if (org.telegram.messenger.n5.E(longValue2)) {
                        TLRPC.User c23 = notificationsCustomSettingsActivity.getMessagesController().c2(A2);
                        if (c23 == null) {
                            arrayList16.add(A2);
                            longSparseArray.put(longValue2, th0Var);
                        } else if (c23.deleted) {
                            it = it2;
                            arrayList20 = arrayList22;
                            arrayList19 = arrayList9;
                            arrayList14 = arrayList8;
                            arrayList13 = arrayList7;
                            arrayList21 = arrayList10;
                            arrayList12 = arrayList24;
                        }
                        arrayList11.add(th0Var);
                        arrayList12 = arrayList24;
                    } else {
                        long j10 = -longValue2;
                        TLRPC.Chat O0 = notificationsCustomSettingsActivity.getMessagesController().O0(Long.valueOf(j10));
                        if (O0 == null) {
                            arrayList17.add(Long.valueOf(j10));
                            longSparseArray.put(longValue2, th0Var);
                        } else if (!O0.left && !O0.kicked && O0.migrated_to == null) {
                            if (!org.telegram.messenger.v3.T(O0) || O0.megagroup) {
                                arrayList12 = arrayList24;
                                arrayList12.add(th0Var);
                            } else {
                                arrayList15.add(th0Var);
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
                if (longValue != 0 && longValue != j3) {
                    th0 th0Var2 = new th0();
                    th0Var2.d = longValue;
                    th0Var2.e = true;
                    th0Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (org.telegram.messenger.n5.E(longValue)) {
                        TLRPC.User c24 = notificationsCustomSettingsActivity.getMessagesController().c2(A);
                        if (c24 == null) {
                            arrayList16.add(A);
                            longSparseArray.put(longValue, th0Var2);
                        } else if (c24.deleted) {
                        }
                        arrayList6 = arrayList25;
                        arrayList6.add(th0Var2);
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
            Collections.sort(arrayList, Comparator$-CC.comparingDouble(new di.w0(5)));
            int max = Math.max(0, arrayList.size() - 6);
            while (max < arrayList.size()) {
                long o4 = org.telegram.messenger.n5.o(((TLRPC.TL_topPeer) arrayList.get(max)).peer);
                if (!hashSet.contains(Long.valueOf(o4))) {
                    th0 th0Var3 = new th0();
                    th0Var3.d = o4;
                    th0Var3.e = z10;
                    th0Var3.c = 0;
                    th0Var3.f = z10;
                    if (org.telegram.messenger.n5.E(o4)) {
                        TLRPC.User c25 = notificationsCustomSettingsActivity.getMessagesController().c2(Long.valueOf(o4));
                        if (c25 == null) {
                            arrayList16.add(Long.valueOf(o4));
                            longSparseArray.put(o4, th0Var3);
                        }
                        arrayList5 = arrayList26;
                        arrayList5.add(0, th0Var3);
                        hashSet.add(Long.valueOf(o4));
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
                    } catch (Exception e10) {
                        e = e10;
                        arrayList4 = arrayList29;
                    }
                    try {
                        notificationsCustomSettingsActivity.getMessagesStorage().V(TextUtils.join(",", arrayList18), arrayList4, arrayList16);
                    } catch (Exception e11) {
                        e = e11;
                        arrayList2 = arrayList28;
                        arrayList3 = arrayList27;
                        z11 = true;
                        i7 = 0;
                        org.telegram.messenger.a8.g(e, z11);
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
                        while (i7 < size4) {
                        }
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
            } catch (Exception e12) {
                e = e12;
                arrayList2 = arrayList28;
                arrayList3 = arrayList27;
                arrayList4 = arrayList29;
            }
            try {
                if (arrayList16.isEmpty()) {
                    arrayList3 = arrayList27;
                    i7 = 0;
                } else {
                    try {
                        arrayList3 = arrayList27;
                        i7 = 0;
                    } catch (Exception e13) {
                        e = e13;
                        arrayList3 = arrayList27;
                        i7 = 0;
                        arrayList2 = arrayList28;
                        z11 = true;
                        org.telegram.messenger.a8.g(e, z11);
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
                        while (i7 < size4) {
                        }
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                    try {
                        notificationsCustomSettingsActivity.getMessagesStorage().n0(arrayList16, arrayList3, false);
                    } catch (Exception e14) {
                        e = e14;
                        arrayList2 = arrayList28;
                        z11 = true;
                        org.telegram.messenger.a8.g(e, z11);
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
                        while (i7 < size4) {
                        }
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
                if (arrayList17.isEmpty()) {
                    arrayList2 = arrayList28;
                } else {
                    org.telegram.messenger.tr messagesStorage = notificationsCustomSettingsActivity.getMessagesStorage();
                    String join = TextUtils.join(",", arrayList17);
                    arrayList2 = arrayList28;
                    try {
                        messagesStorage.Q(join, arrayList2);
                    } catch (Exception e15) {
                        e = e15;
                        z11 = true;
                        org.telegram.messenger.a8.g(e, z11);
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
                        while (i7 < size4) {
                        }
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
            } catch (Exception e16) {
                e = e16;
                arrayList2 = arrayList28;
                arrayList3 = arrayList27;
                i7 = 0;
                z11 = true;
                org.telegram.messenger.a8.g(e, z11);
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
                while (i7 < size4) {
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
            }
            size = arrayList2.size();
            for (i10 = i7; i10 < size; i10++) {
                TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                    th0 th0Var4 = (th0) longSparseArray.get(-chat.id);
                    longSparseArray.remove(-chat.id);
                    if (th0Var4 != null) {
                        if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
                            arrayList12.add(th0Var4);
                        } else {
                            arrayList15.add(th0Var4);
                        }
                    }
                }
            }
            size2 = arrayList3.size();
            for (i11 = i7; i11 < size2; i11++) {
                TLRPC.User user = (TLRPC.User) arrayList3.get(i11);
                if (!user.deleted) {
                    longSparseArray.remove(user.id);
                }
            }
            size3 = arrayList4.size();
            for (i12 = i7; i12 < size3; i12++) {
                longSparseArray.remove(org.telegram.messenger.n5.F(((TLRPC.EncryptedChat) arrayList4.get(i12)).id));
            }
            size4 = longSparseArray.size();
            while (i7 < size4) {
                if (org.telegram.messenger.n5.z(longSparseArray.keyAt(i7))) {
                    arrayList12.remove(longSparseArray.valueAt(i7));
                    arrayList15.remove(longSparseArray.valueAt(i7));
                } else {
                    arrayList11.remove(longSparseArray.valueAt(i7));
                }
                i7++;
            }
        } else {
            arrayList2 = arrayList28;
            arrayList3 = arrayList27;
            arrayList4 = arrayList29;
        }
        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
    }

    public static void c0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, th0 th0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.o(true);
        notificationsCustomSettingsActivity.p0(th0Var, view, true);
    }

    public static boolean h0(int i7, long j3) {
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).g7;
        StringBuilder sb2 = new StringBuilder("stories_");
        sb2.append(j3);
        return sharedPreferences.contains(sb2.toString()) ? org.telegram.messenger.f3.w("stories_", j3, sharedPreferences, true) : sharedPreferences.contains("EnableAllStories") ? sharedPreferences.getBoolean("EnableAllStories", true) : n0(i7, j3);
    }

    public static boolean n0(int i7, long j3) {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ri.d0(i7).j1);
        Collections.sort(arrayList, Comparator$-CC.comparingDouble(new di.w0(4)));
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (org.telegram.messenger.n5.o(((TLRPC.TL_topPeer) arrayList.get(i11)).peer) == j3) {
                i10 = i11;
            }
        }
        return i10 >= 0 && i10 >= arrayList.size() + (-5);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.f = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.s == -1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747719, "NotificationsExceptions"));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747731, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 21));
        ArrayList arrayList = this.x;
        int i10 = 18;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.h5 b10 = this.simpleActionBar.t().b(0, R.drawable.outline_header_search);
            b10.O();
            b10.C0 = new bi.s1(this, i10);
            b10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, "Search"));
        }
        this.d = new rh0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(context, null);
        this.c = tyVar;
        tyVar.setTextSize(18);
        this.c.setText(org.telegram.messenger.gd.M0(2131748019, "NoExceptions"));
        this.c.c();
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.a = ck0Var;
        ck0Var.r1();
        this.a.setEmptyView(this.c);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new v4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.c, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.ck0 ck0Var2 = this.a;
        v6 v6Var = new v6(i7, context, this);
        this.b = v6Var;
        ck0Var2.setAdapter(v6Var);
        this.a.setOnItemClickListener(new at(28, this, context));
        nh0 nh0Var = new nh0(this);
        nh0Var.c = 150L;
        nh0Var.e = 350L;
        nh0Var.f = 0L;
        nh0Var.g = 0L;
        nh0Var.d = 0L;
        nh0Var.C = false;
        nh0Var.i = new OvershootInterpolator(1.1f);
        nh0Var.o = org.telegram.ui.Components.lr.h;
        nh0Var.m = false;
        this.a.setItemAnimator(nh0Var);
        this.a.setOnScrollListener(new g3(this, 22));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ks.f0) {
            if (i7 == org.telegram.messenger.ks.S0) {
                o0();
            }
        } else {
            v6 v6Var = this.b;
            if (v6Var != null) {
                v6Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(14, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.qa.class, org.telegram.ui.Cells.i5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        int i7 = org.telegram.ui.ActionBar.n6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 0, new Class[]{org.telegram.ui.Cells.qa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.v6));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0() {
        boolean B;
        ph0 ph0Var;
        int i7;
        int i10;
        ArrayList arrayList;
        boolean isEmpty = this.x.isEmpty();
        int i11 = this.s;
        if (isEmpty || i11 == 3) {
            int childCount = this.a.getChildCount();
            ArrayList arrayList2 = new ArrayList();
            if (i11 == 3) {
                Boolean bool = this.n;
                B = bool == null || bool.booleanValue() || !((arrayList = this.x) == null || arrayList.isEmpty());
            } else {
                B = getNotificationsController().B(i11);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.a.getChildAt(i12);
                org.telegram.ui.Components.kj0 kj0Var = (org.telegram.ui.Components.kj0) this.a.T(childAt);
                this.a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList3 = this.J;
                    if (R < arrayList3.size()) {
                        ph0Var = (ph0) arrayList3.get(R);
                        boolean z10 = (ph0Var == null && ((i10 = ph0Var.c) == 102 || i10 == 101 || i10 == 100)) ? true : B;
                        i7 = kj0Var.f;
                        View view = kj0Var.a;
                        if (i7 != 0) {
                            ((org.telegram.ui.Cells.n4) view).a(arrayList2, z10);
                        } else if (i7 == 1) {
                            ((org.telegram.ui.Cells.r8) view).e(arrayList2, z10);
                        } else if (i7 == 3) {
                            ((org.telegram.ui.Cells.t8) view).a(arrayList2, z10);
                        } else if (i7 == 5) {
                            ((org.telegram.ui.Cells.w9) view).a(arrayList2, z10);
                        }
                    }
                }
                ph0Var = null;
                if (ph0Var == null) {
                }
                i7 = kj0Var.f;
                View view2 = kj0Var.a;
                if (i7 != 0) {
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
            this.e.addListener(new ay(this, 8));
            this.e.setDuration(150L);
            this.e.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(th0 th0Var, View view) {
        String v = org.telegram.messenger.xs.v(th0Var.d, 0L, false);
        getNotificationsSettings().edit().remove("stories_" + v).commit();
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            arrayList.remove(th0Var);
        }
        ArrayList arrayList2 = this.x;
        if (arrayList2 != null) {
            arrayList2.remove(th0Var);
        }
        if (n0(this.currentAccount, th0Var.d)) {
            th0Var.f = true;
            th0Var.c = 0;
            this.w.add(th0Var);
        }
        if (view instanceof org.telegram.ui.Cells.qa) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.f(th0Var, null, qaVar.T);
        }
        getNotificationsController().c0(th0Var.d, 0L, false);
        q0(true);
    }

    public final int k0() {
        int i7 = -16776961;
        int i10 = this.s;
        if (i10 == 0) {
            i7 = getNotificationsSettings().getInt("GroupLed", -16776961);
        } else if (i10 == 1) {
            i7 = getNotificationsSettings().getInt("MessagesLed", -16776961);
        } else if (i10 == 2) {
            i7 = getNotificationsSettings().getInt("ChannelLed", -16776961);
        } else if (i10 == 3) {
            i7 = getNotificationsSettings().getInt("StoriesLed", -16776961);
        } else if (i10 == 4 || i10 == 5) {
            i7 = getNotificationsSettings().getInt("ReactionsLed", -16776961);
        }
        for (int i11 = 0; i11 < 9; i11++) {
            if (org.telegram.ui.Cells.t8.f[i11] == i7) {
                return org.telegram.ui.Cells.t8.e[i11];
            }
        }
        return i7;
    }

    public final String l0() {
        int i7 = this.s;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? 0 : getNotificationsSettings().getInt("popupChannel", 0) : getNotificationsSettings().getInt("popupAll", 0) : getNotificationsSettings().getInt("popupGroup", 0);
        int[] iArr = this.F;
        return org.telegram.messenger.gd.M0(iArr[Utilities.j(i10, iArr.length - 1, 0)], null);
    }

    public final String m0() {
        int i7 = this.s;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? (i7 == 4 || i7 == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1 : getNotificationsSettings().getInt("priority_stories", 1) : getNotificationsSettings().getInt("priority_channel", 1) : getNotificationsSettings().getInt("priority_messages", 1) : getNotificationsSettings().getInt("priority_group", 1);
        int[] iArr = this.G;
        return org.telegram.messenger.gd.M0(iArr[Utilities.j(i10, iArr.length - 1, 0)], null);
    }

    public final void o0() {
        ArrayList arrayList;
        if (this.s == 3) {
            org.telegram.messenger.ri.d0(this.currentAccount).P0(true);
            arrayList = new ArrayList(org.telegram.messenger.ri.d0(this.currentAccount).j1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().a.c(new ve0(5, this, arrayList));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                str = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.gd.M0(2131745085, "SoundDefault") : ringtone.getTitle(getParentActivity());
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
            getNotificationsController().m(i11);
            edit.commit();
            getNotificationsController().b0(i11);
            v4.f1 K = this.a.K(i7);
            if (K != null) {
                this.b.t(K, i7);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        q0(true);
    }

    @Override // org.telegram.ui.ActionBar.h2
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
        q0(true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.ks.f0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.S0);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        v6 v6Var = this.b;
        if (v6Var != null) {
            v6Var.f();
        }
        getNotificationCenter().c(this, org.telegram.messenger.ks.f0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.S0);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(th0 th0Var, View view, boolean z10) {
        String v = org.telegram.messenger.xs.v(th0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean n02 = n0(this.currentAccount, th0Var.d);
        th0Var.c = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
        if (th0Var.f) {
            th0Var.f = false;
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
            ArrayList arrayList = this.w;
            if (arrayList != null) {
                arrayList.remove(th0Var);
            }
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(0, th0Var);
        } else if (n02) {
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
        } else {
            Boolean bool = this.n;
            if (!z10 ? bool == null || !bool.booleanValue() : bool != null && bool.booleanValue()) {
                j0(th0Var, view);
                return;
            }
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.qa) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.f(th0Var, null, qaVar.T);
        }
        getNotificationsController().c0(th0Var.d, 0L, false);
        q0(true);
    }

    public final void q0(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String string;
        long j3;
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
        ArrayList arrayList3 = this.I;
        arrayList3.clear();
        ArrayList arrayList4 = this.J;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i7 = this.s;
        if (i7 != -1) {
            String M0 = org.telegram.messenger.gd.M0(2131747651, null);
            ph0 ph0Var = new ph0(0, true);
            ph0Var.e = M0;
            arrayList4.add(ph0Var);
            if (i7 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(ph0.b(101, org.telegram.messenger.gd.M0(2131747646, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    arrayList4.add(ph0.b(org.telegram.messenger.ks.n1, org.telegram.messenger.gd.M0(2131747648, null), this.r && ((bool = this.n) == null || !bool.booleanValue())));
                }
                arrayList4.add(ph0.d(-1, org.telegram.messenger.gd.M0(2131744483, null)));
            } else if (i7 == 4 || i7 == 5) {
                this.messagesRow = arrayList4.size();
                String M02 = org.telegram.messenger.gd.M0(2131747647, null);
                String M03 = org.telegram.messenger.gd.M0(!notificationsSettings.getBoolean("EnableReactionsMessages", true) ? 2131747653 : notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? 2131747655 : 2131747654, null);
                boolean z11 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ph0 ph0Var2 = new ph0(6, true);
                ph0Var2.c = org.telegram.messenger.ks.o1;
                ph0Var2.d = R.drawable.msg_markunread;
                ph0Var2.e = M02;
                ph0Var2.f = M03;
                ph0Var2.i = z11;
                arrayList4.add(ph0Var2);
                this.storiesRow = arrayList4.size();
                String M04 = org.telegram.messenger.gd.M0(2131747644, null);
                String M05 = org.telegram.messenger.gd.M0(!notificationsSettings.getBoolean("EnableReactionsStories", true) ? 2131747653 : notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? 2131747655 : 2131747654, null);
                boolean z12 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ph0 ph0Var3 = new ph0(6, true);
                ph0Var3.c = org.telegram.messenger.ks.p1;
                ph0Var3.d = R.drawable.msg_stories_saved;
                ph0Var3.e = M04;
                ph0Var3.f = M05;
                ph0Var3.i = z12;
                arrayList4.add(ph0Var3);
                arrayList4.add(ph0.d(-1, null));
            } else {
                int i10 = i7 == 1 ? 2131747645 : i7 == 0 ? 2131747649 : 2131747650;
                this.showRow = arrayList4.size();
                arrayList4.add(ph0.b(100, org.telegram.messenger.gd.M0(i10, null), getNotificationsController().B(i7)));
                arrayList4.add(ph0.d(-1, null));
            }
            String M06 = org.telegram.messenger.gd.M0(2131745788, null);
            ph0 ph0Var4 = new ph0(0, true);
            ph0Var4.e = M06;
            arrayList4.add(ph0Var4);
            arrayList4.size();
            if (i7 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(ph0.b(0, org.telegram.messenger.gd.M0(2131747740, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i7 == 4 || i7 == 5) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(ph0.b(0, org.telegram.messenger.gd.M0(2131747740, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                boolean z13 = i7 != 0 ? i7 != 1 ? i7 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true) : notificationsSettings.getBoolean("EnablePreviewAll", true) : notificationsSettings.getBoolean("EnablePreviewGroup", true);
                this.previewRow = arrayList4.size();
                arrayList4.add(ph0.b(0, org.telegram.messenger.gd.M0(2131748345, null), z13));
            }
            this.soundRow = arrayList4.size();
            String M07 = org.telegram.messenger.gd.M0(2131745088, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String M08 = org.telegram.messenger.gd.M0(2131745085, "SoundDefault");
            arrayList = arrayList3;
            if (i7 == 0) {
                string = notificationsSettings2.getString("GroupSound", M08);
                j3 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            } else if (i7 == 1) {
                string = notificationsSettings2.getString("GlobalSound", M08);
                j3 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
            } else if (i7 == 3) {
                string = notificationsSettings2.getString("StoriesSound", M08);
                j3 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
            } else if (i7 == 4 || i7 == 5) {
                string = notificationsSettings2.getString("ReactionSound", M08);
                j3 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
            } else {
                string = notificationsSettings2.getString("ChannelSound", M08);
                j3 = notificationsSettings2.getLong("ChannelDocId", 0L);
            }
            long j10 = j3;
            if (j10 != 0) {
                TLRPC.Document c10 = getMediaDataController().A0.c(j10);
                string = c10 == null ? org.telegram.messenger.gd.M0(2131751668, "CustomSound") : xh0.g0(c10, org.telegram.messenger.w7.B(c10));
            } else if (string.equals("NoSound")) {
                string = org.telegram.messenger.gd.M0(2131747959, "NoSound");
            } else if (string.equals("Default")) {
                string = org.telegram.messenger.gd.M0(2131745085, "SoundDefault");
            }
            arrayList4.add(ph0.c(3, M07, string));
            if (this.H) {
                this.lightColorRow = arrayList4.size();
                String M09 = org.telegram.messenger.gd.M0(2131748797, "LedColor");
                int k02 = k0();
                ph0 ph0Var5 = new ph0(3, true);
                ph0Var5.e = M09;
                ph0Var5.h = k02;
                arrayList4.add(ph0Var5);
                int i11 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? (i7 == 4 || i7 == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0 : notificationsSettings.getInt("vibrate_stories", 0) : notificationsSettings.getInt("vibrate_channel", 0) : notificationsSettings.getInt("vibrate_messages", 0) : notificationsSettings.getInt("vibrate_group", 0);
                this.vibrateRow = arrayList4.size();
                String M010 = org.telegram.messenger.gd.M0(2131743377, "Vibrate");
                int[] iArr = this.E;
                arrayList4.add(ph0.c(1, M010, org.telegram.messenger.gd.M0(iArr[Utilities.j(i11, iArr.length - 1, 0)], null)));
                if (i7 == 1 || i7 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(ph0.c(2, org.telegram.messenger.gd.M0(2131746905, "PopupNotification"), l0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(ph0.c(4, org.telegram.messenger.gd.M0(2131747713, "NotificationsImportance"), m0()));
                String M011 = org.telegram.messenger.gd.M0(2131747652, null);
                ph0 ph0Var6 = new ph0(8, true);
                ph0Var6.e = M011;
                ph0Var6.d = 0;
                arrayList4.add(ph0Var6);
            } else {
                String M012 = org.telegram.messenger.gd.M0(2131747643, null);
                ph0 ph0Var7 = new ph0(8, true);
                ph0Var7.e = M012;
                ph0Var7.d = 1;
                arrayList4.add(ph0Var7);
            }
            arrayList4.size();
            arrayList4.add(ph0.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i7 != 4 && i7 != 5) {
            if (i7 != -1) {
                this.addExceptionRow = arrayList4.size();
                String M013 = org.telegram.messenger.gd.M0(2131747730, "NotificationsAddAnException");
                ph0 ph0Var8 = new ph0(7, true);
                ph0Var8.c = 6;
                ph0Var8.d = R.drawable.msg_contact_add;
                ph0Var8.e = M013;
                arrayList4.add(ph0Var8);
            }
            arrayList4.size();
            if (this.w != null && this.h) {
                for (int i12 = 0; i12 < this.w.size(); i12++) {
                    th0 th0Var = (th0) this.w.get(i12);
                    ph0 ph0Var9 = new ph0(2, true);
                    ph0Var9.g = th0Var;
                    arrayList4.add(ph0Var9);
                }
            }
            if (this.x != null) {
                for (int i13 = 0; i13 < this.x.size(); i13++) {
                    th0 th0Var2 = (th0) this.x.get(i13);
                    ph0 ph0Var10 = new ph0(2, true);
                    ph0Var10.g = th0Var2;
                    arrayList4.add(ph0Var10);
                }
            }
            arrayList4.size();
            if (i7 != -1 || ((arrayList2 = this.x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(ph0.d(-3, null));
            }
            ArrayList arrayList5 = this.x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String M014 = org.telegram.messenger.gd.M0(2131747722, "NotificationsDeleteAllException");
                ph0 ph0Var11 = new ph0(7, true);
                ph0Var11.c = 7;
                ph0Var11.d = 0;
                ph0Var11.e = M014;
                arrayList4.add(ph0Var11);
            }
        }
        v6 v6Var = this.b;
        if (v6Var != null) {
            if (z10) {
                v6Var.E(arrayList, arrayList4);
            } else {
                v6Var.f();
            }
        }
    }

    public final void r0() {
        try {
            if (this.a == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zl, false);
            int i7 = 0;
            while (i7 < 4) {
                int childCount = i7 == 0 ? this.a.getChildCount() : i7 == 1 ? this.a.getHiddenChildCount() : i7 == 2 ? this.a.getCachedChildCount() : this.a.getAttachedScrapChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i7 == 0 ? this.a.getChildAt(i10) : i7 == 1 ? this.a.V(i10) : i7 == 2 ? this.a.P(i10) : this.a.O(i10);
                    if (childAt instanceof org.telegram.ui.Cells.qa) {
                        org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) childAt;
                        qaVar.b0 = true;
                        qaVar.R = x02;
                        qaVar.S = x03;
                        if (i7 != 0) {
                            ((org.telegram.ui.Cells.qa) childAt).i(0);
                        }
                    }
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
