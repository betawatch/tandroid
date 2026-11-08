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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final int[] D;
    public final int[] E;
    public final int[] F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.pj0 a;
    public int addExceptionRow;
    public w6 b;
    public org.telegram.ui.Components.jy c;
    public mh0 d;
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

    public NotificationsCustomSettingsActivity(int i7, ArrayList arrayList, ArrayList arrayList2, boolean z9) {
        super(null);
        this.h = true;
        this.y = new HashMap();
        this.D = new int[]{2131743616, 2131745369, 2131743615, 2131748724, 2131747822};
        this.E = new int[]{2131748178, 2131747819, 2131747820, 2131754266};
        this.F = new int[]{2131747884, 2131747880, 2131747880, 2131747882, 2131747883, 2131747882};
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
        this.s = i7;
        this.w = arrayList2;
        this.x = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                oh0 oh0Var = (oh0) this.x.get(i10);
                this.y.put(Long.valueOf(oh0Var.d), oh0Var);
            }
        }
        ArrayList arrayList3 = this.w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                oh0 oh0Var2 = (oh0) this.w.get(i11);
                this.y.put(Long.valueOf(oh0Var2.d), oh0Var2);
            }
        }
        if (z9) {
            o0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context, View view, int i7, float f10, float f11) {
        HashMap hashMap;
        oh0 oh0Var;
        ArrayList arrayList;
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        Drawable drawable;
        final na naVar;
        boolean z12;
        String str;
        long j3;
        oh0 oh0Var2;
        boolean z13;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
        ArrayList arrayList2 = notificationsCustomSettingsActivity2.I;
        HashMap hashMap2 = notificationsCustomSettingsActivity2.y;
        int i11 = notificationsCustomSettingsActivity2.s;
        if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
            return;
        }
        kh0 kh0Var = (notificationsCustomSettingsActivity2.a.getAdapter() != notificationsCustomSettingsActivity2.b || i7 < 0 || i7 >= arrayList2.size()) ? null : (kh0) arrayList2.get(i7);
        boolean z14 = true;
        boolean z15 = true;
        if (kh0Var != null && kh0Var.a == 8) {
            notificationsCustomSettingsActivity2.G = !notificationsCustomSettingsActivity2.G;
            notificationsCustomSettingsActivity2.q0(true);
            return;
        }
        if (i11 != 3 || kh0Var == null) {
            hashMap = hashMap2;
        } else {
            hashMap = hashMap2;
            oh0 oh0Var3 = kh0Var.g;
            if (oh0Var3 != null) {
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(notificationsCustomSettingsActivity2, view);
                H.i = 3;
                H.m(R.drawable.msg_mute, new eh0(notificationsCustomSettingsActivity2, oh0Var3, view, i7, 5), org.telegram.messenger.id.M0(2131747865, null), oh0Var3.c <= 0 || oh0Var3.f, false);
                H.m(R.drawable.msg_unmute, new eh0(notificationsCustomSettingsActivity, oh0Var3, view, i7, 0), org.telegram.messenger.id.M0(2131747862, null), oh0Var3.c > 0 || oh0Var3.f, false);
                H.m(R.drawable.msg_delete, new eh0(notificationsCustomSettingsActivity, oh0Var3, view, i7, 1), org.telegram.messenger.id.M0(2131751543, "DeleteException"), !oh0Var3.f, true);
                H.W(notificationsCustomSettingsActivity.a.U0(view, false));
                H.Z();
                return;
            }
        }
        if (i11 == 3) {
            v4.g0 adapter = notificationsCustomSettingsActivity2.a.getAdapter();
            mh0 mh0Var = notificationsCustomSettingsActivity2.d;
            if (adapter == mh0Var) {
                Object E = mh0Var.E(i7);
                if (E instanceof oh0) {
                    oh0Var2 = (oh0) E;
                    str = "DeleteException";
                } else {
                    boolean z16 = E instanceof TLRPC.User;
                    if (z16) {
                        str = "DeleteException";
                        j3 = ((TLRPC.User) E).id;
                    } else {
                        str = "DeleteException";
                        j3 = -((TLRPC.Chat) E).id;
                    }
                    if (!hashMap.containsKey(Long.valueOf(j3))) {
                        oh0 oh0Var4 = new oh0();
                        oh0Var4.e = true;
                        oh0Var4.d = j3;
                        if (z16) {
                            oh0Var4.d = ((TLRPC.User) E).id;
                        } else {
                            oh0Var4.d = -((TLRPC.Chat) E).id;
                        }
                        oh0Var2 = oh0Var4;
                        z13 = true;
                        if (oh0Var2 != null) {
                            return;
                        }
                        org.telegram.ui.Components.k60 H2 = org.telegram.ui.Components.k60.H(notificationsCustomSettingsActivity2, view);
                        H2.i = 3;
                        oh0 oh0Var5 = oh0Var2;
                        H2.m(R.drawable.msg_mute, new eh0(notificationsCustomSettingsActivity2, oh0Var5, view, z13, 2), org.telegram.messenger.id.M0(2131747865, null), oh0Var2.c <= 0 || oh0Var2.f, false);
                        H2.m(R.drawable.msg_unmute, new eh0(notificationsCustomSettingsActivity, oh0Var5, view, z13, 3), org.telegram.messenger.id.M0(2131747862, null), oh0Var5.c > 0 || oh0Var5.f, false);
                        H2.m(R.drawable.msg_delete, new eh0(notificationsCustomSettingsActivity, oh0Var5, view, i7, 4), org.telegram.messenger.id.M0(2131751543, str), (z13 || oh0Var5.f) ? false : true, true);
                        H2.W(notificationsCustomSettingsActivity.a.U0(view, false));
                        H2.Z();
                        return;
                    }
                    oh0Var2 = (oh0) hashMap.get(Long.valueOf(j3));
                }
                z13 = false;
                if (oh0Var2 != null) {
                }
            }
        }
        if (notificationsCustomSettingsActivity2.a.getAdapter() == notificationsCustomSettingsActivity2.d || !(kh0Var == null || kh0Var.g == null)) {
            v4.g0 adapter2 = notificationsCustomSettingsActivity2.a.getAdapter();
            mh0 mh0Var2 = notificationsCustomSettingsActivity2.d;
            if (adapter2 == mh0Var2) {
                Object E2 = mh0Var2.E(i7);
                if (E2 instanceof oh0) {
                    oh0Var = (oh0) E2;
                    arrayList = notificationsCustomSettingsActivity2.d.d;
                    z11 = false;
                } else {
                    boolean z17 = E2 instanceof TLRPC.User;
                    long j10 = z17 ? ((TLRPC.User) E2).id : -((TLRPC.Chat) E2).id;
                    if (hashMap.containsKey(Long.valueOf(j10))) {
                        oh0Var = (oh0) hashMap.get(Long.valueOf(j10));
                        z10 = false;
                    } else {
                        oh0 oh0Var6 = new oh0();
                        oh0Var6.d = j10;
                        if (z17) {
                            oh0Var6.d = ((TLRPC.User) E2).id;
                        } else {
                            oh0Var6.d = -((TLRPC.Chat) E2).id;
                        }
                        oh0Var = oh0Var6;
                        z10 = true;
                    }
                    arrayList = notificationsCustomSettingsActivity2.x;
                    z11 = z10;
                }
                z9 = z11;
            } else {
                oh0Var = kh0Var.g;
                if (oh0Var.f) {
                    return;
                }
                arrayList = notificationsCustomSettingsActivity2.x;
                z9 = false;
            }
            ArrayList arrayList3 = arrayList;
            oh0 oh0Var7 = oh0Var;
            if (oh0Var7 == null) {
                return;
            }
            long j11 = oh0Var7.d;
            org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(context, notificationsCustomSettingsActivity2.currentAccount, null, true, new hh0(notificationsCustomSettingsActivity2, j11, org.telegram.messenger.dt.t(notificationsCustomSettingsActivity2.currentAccount).D(j11, null, false, false), oh0Var7, z9, i7, arrayList3), notificationsCustomSettingsActivity.getResourceProvider());
            ynVar.e(j11, 0, null);
            ynVar.d(notificationsCustomSettingsActivity, view, f10, f11, false);
            return;
        }
        if (kh0Var == null) {
            return;
        }
        int i12 = kh0Var.c;
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
            ww wwVar = new ww(bundle);
            wwVar.C2 = new fh0(notificationsCustomSettingsActivity2);
            notificationsCustomSettingsActivity2.presentFragment(wwVar);
            return;
        }
        if (i12 == 7) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131747914, "NotificationsDeleteAllExceptionTitle");
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131747915, "NotificationsDeleteAllExceptionAlert");
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, "Delete"), new fh0(notificationsCustomSettingsActivity2));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
            notificationsCustomSettingsActivity2.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i12 == 100 || i12 == 101) {
            boolean B = notificationsCustomSettingsActivity2.getNotificationsController().B(i11);
            notificationsCustomSettingsActivity2.a.K(i7);
            final int i13 = notificationsCustomSettingsActivity2.s;
            if (i13 == 3) {
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
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i11);
                notificationsCustomSettingsActivity2.q0(true);
                boolean z20 = notificationsCustomSettingsActivity2.h;
                if (z20 != (notificationsCustomSettingsActivity2.n == null) && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z20;
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
            int i14 = notificationsCustomSettingsActivity2.currentAccount;
            na naVar2 = new na(notificationsCustomSettingsActivity2, z15 ? 1 : 0);
            Pattern pattern = org.telegram.ui.Components.v4.a;
            if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
                return;
            }
            final boolean D = org.telegram.messenger.dt.t(i14).D(0L, null, false, false);
            String[] strArr = {org.telegram.messenger.id.M0(2131747858, null), org.telegram.messenger.id.a0("MuteFor", null, 2131748313, org.telegram.messenger.id.G(1, "Hours", new Object[0])), org.telegram.messenger.id.a0("MuteFor", null, 2131748313, org.telegram.messenger.id.G(2, "Days", new Object[0])), null, org.telegram.messenger.id.M0(2131747859, null)};
            int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
            LinearLayout linearLayout = new LinearLayout(notificationsCustomSettingsActivity2.getParentActivity());
            linearLayout.setOrientation(1);
            final AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            int i15 = 0;
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity2;
            while (i15 < 5) {
                if (strArr[i15] == null) {
                    i10 = i14;
                    naVar = naVar2;
                } else {
                    TextView textView2 = new TextView(notificationsCustomSettingsActivity3.getParentActivity());
                    Drawable drawable2 = notificationsCustomSettingsActivity3.getParentActivity().getResources().getDrawable(iArr[i15]);
                    if (i15 == 4) {
                        drawable = null;
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                        i10 = i14;
                        org.telegram.ui.ActionBar.r6.y(textView2, drawable2, org.telegram.ui.ActionBar.k6.p7, null, PorterDuff.Mode.MULTIPLY);
                    } else {
                        i10 = i14;
                        drawable = null;
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.j5, null);
                        org.telegram.ui.ActionBar.r6.y(textView2, drawable2, org.telegram.ui.ActionBar.k6.J5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    org.telegram.messenger.camera.q.n(textView2, 1, 16.0f, 1, 1);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, drawable, drawable);
                    textView2.setTag(Integer.valueOf(i15));
                    textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                    textView2.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                    textView2.setSingleLine(true);
                    textView2.setGravity(19);
                    textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(26.0f));
                    textView2.setText(strArr[i15]);
                    linearLayout.addView(textView2, c8.ha.r(-1, 48, 51));
                    naVar = naVar2;
                    final NotificationsCustomSettingsActivity notificationsCustomSettingsActivity4 = notificationsCustomSettingsActivity3;
                    final int i16 = i10;
                    View.OnClickListener onClickListener = new View.OnClickListener(i16, D, i13, notificationsCustomSettingsActivity4, arrayList4, arrayList5, naVar, alertDialog$Builder2) { // from class: org.telegram.ui.Components.m2
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ NotificationsCustomSettingsActivity c;
                        public final /* synthetic */ ArrayList d;
                        public final /* synthetic */ ArrayList e;
                        public final /* synthetic */ org.telegram.ui.na f;
                        public final /* synthetic */ AlertDialog$Builder h;

                        {
                            this.b = i13;
                            this.c = notificationsCustomSettingsActivity4;
                            this.d = arrayList4;
                            this.e = arrayList5;
                            this.f = naVar;
                            this.h = alertDialog$Builder2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i17;
                            int intValue = ((Integer) view2.getTag()).intValue();
                            int i18 = this.a;
                            int i19 = this.b;
                            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity5 = this.c;
                            int i20 = 3;
                            if (intValue == 0) {
                                org.telegram.messenger.dt.t(i18).U(i19, 0);
                            } else if (intValue == 3) {
                                notificationsCustomSettingsActivity5.presentFragment(new NotificationsCustomSettingsActivity(i19, this.d, this.e, false));
                            } else {
                                int currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
                                if (intValue == 1) {
                                    currentTime += 3600;
                                } else if (intValue == 2) {
                                    currentTime += 172800;
                                } else if (intValue == 4) {
                                    i17 = Integer.MAX_VALUE;
                                    org.telegram.messenger.dt.t(i18).H(0L, i17, 0);
                                    org.telegram.messenger.dt.t(i18).U(i19, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                }
                                i17 = currentTime;
                                org.telegram.messenger.dt.t(i18).H(0L, i17, 0);
                                org.telegram.messenger.dt.t(i18).U(i19, ConnectionsManager.DEFAULT_DATACENTER_ID);
                            }
                            this.f.a(intValue);
                            this.h.a.L0.run();
                            if (intValue == 0) {
                                i20 = 4;
                            } else if (intValue == 1) {
                                i20 = 0;
                            } else if (intValue == 2) {
                                i20 = 2;
                            } else if (intValue != 4) {
                                i20 = -1;
                            }
                            if (i20 < 0 || !hc.a(notificationsCustomSettingsActivity5)) {
                                return;
                            }
                            hc.z(notificationsCustomSettingsActivity5, i20, 0, null).j();
                        }
                    };
                    notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity4;
                    textView2.setOnClickListener(onClickListener);
                }
                i15++;
                naVar2 = naVar;
                i14 = i10;
                notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity3;
            }
            String M02 = org.telegram.messenger.id.M0(2131747925, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.R = M02;
            alertDialog$Builder2.o(linearLayout);
            notificationsCustomSettingsActivity3.showDialog(u1Var2);
            return;
        }
        if (i12 == 3) {
            if (view.isEnabled()) {
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, i11);
                    notificationsCustomSettingsActivity2.presentFragment(new sh0(bundle2, notificationsCustomSettingsActivity2.getResourceProvider()));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            return;
        }
        if (kh0Var.a == 3) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.v4.t(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new gh0(notificationsCustomSettingsActivity2, view, i7, 0), null));
                return;
            }
            return;
        }
        if (i12 == 2) {
            if (view.isEnabled()) {
                Activity parentActivity = notificationsCustomSettingsActivity2.getParentActivity();
                gh0 gh0Var = new gh0(notificationsCustomSettingsActivity2, view, i7, 1);
                Pattern pattern2 = org.telegram.ui.Components.v4.a;
                SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).d7;
                int[] iArr2 = new int[1];
                if (i11 == 1) {
                    iArr2[0] = sharedPreferences.getInt("popupAll", 0);
                } else if (i11 == 0) {
                    iArr2[0] = sharedPreferences.getInt("popupGroup", 0);
                } else {
                    iArr2[0] = sharedPreferences.getInt("popupChannel", 0);
                }
                String[] strArr2 = {org.telegram.messenger.id.M0(2131748178, null), org.telegram.messenger.id.M0(2131747819, null), org.telegram.messenger.id.M0(2131747820, null), org.telegram.messenger.id.M0(2131754266, null)};
                LinearLayout e11 = org.telegram.messenger.k5.e(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity);
                int i17 = 0;
                while (i17 < 4) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(parentActivity, null);
                    j6Var.setTag(Integer.valueOf(i17));
                    j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    org.telegram.ui.Components.v4.a(j6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, null);
                    j6Var.b(strArr2[i17], iArr2[0] == i17);
                    e11.addView(j6Var);
                    j6Var.setOnClickListener(new di.t5(iArr2, i11, alertDialog$Builder3, gh0Var, 2));
                    i17++;
                }
                String M03 = org.telegram.messenger.id.M0(2131747099, null);
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                u1Var3.R = M03;
                alertDialog$Builder3.o(e11);
                alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131752589, null), null);
                notificationsCustomSettingsActivity2.showDialog(u1Var3);
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view.isEnabled()) {
                String str2 = i11 == 1 ? "vibrate_messages" : i11 == 0 ? "vibrate_group" : i11 == 3 ? "vibrate_stories" : (i11 == 4 || i11 == 5) ? "vibrate_react" : "vibrate_channel";
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.v4.V(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0L, str2, new org.telegram.ui.Components.pp0(notificationsCustomSettingsActivity2, view, str2, i7, 10), null));
                return;
            }
            return;
        }
        if (i12 == 4) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.v4.F(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new gh0(notificationsCustomSettingsActivity2, view, i7, 2), null));
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
                    kh0Var.i = true;
                } else {
                    edit2.putBoolean("EnableAllStories", false);
                    notificationsCustomSettingsActivity2.n = Boolean.FALSE;
                    notificationsCustomSettingsActivity2.r = false;
                    kh0Var.i = false;
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(notificationsCustomSettingsActivity2.r);
                }
                edit2.commit();
                boolean z21 = notificationsCustomSettingsActivity2.r;
                boolean z22 = notificationsCustomSettingsActivity2.h;
                if (z21 != z22 && notificationsCustomSettingsActivity2.a != null && notificationsCustomSettingsActivity2.b != null) {
                    notificationsCustomSettingsActivity2.h = !z22;
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
                    z12 = notificationsSettings2.getBoolean("EnablePreviewAll", true);
                    edit3.putBoolean("EnablePreviewAll", !z12);
                } else if (i11 == 0) {
                    z12 = notificationsSettings2.getBoolean("EnablePreviewGroup", true);
                    edit3.putBoolean("EnablePreviewGroup", !z12);
                } else if (i11 == 3) {
                    z12 = !notificationsSettings2.getBoolean("EnableHideStoriesSenders", false);
                    edit3.putBoolean("EnableHideStoriesSenders", z12);
                } else if (i11 == 4 || i11 == 5) {
                    z12 = notificationsSettings2.getBoolean("EnableReactionsPreview", true);
                    edit3.putBoolean("EnableReactionsPreview", !z12);
                } else {
                    z12 = notificationsSettings2.getBoolean("EnablePreviewChannel", true);
                    edit3.putBoolean("EnablePreviewChannel", !z12);
                }
                edit3.commit();
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i11);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(!z12);
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == 103 || i12 == 104) {
            boolean z23 = !org.telegram.messenger.id.a0 ? f10 <= ((float) (view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) : f10 >= ((float) org.telegram.messenger.g0.L(76.0f));
            SharedPreferences notificationsSettings3 = notificationsCustomSettingsActivity2.getNotificationsSettings();
            if (z23) {
                String str3 = kh0Var.c == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                SharedPreferences.Editor edit4 = notificationsSettings3.edit();
                edit4.putBoolean(str3, !notificationsSettings3.getBoolean(str3, true));
                edit4.apply();
                notificationsCustomSettingsActivity2.q0(true);
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i11);
                return;
            }
            String str4 = kh0Var.c == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
            LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
            ?? r42 = 0;
            boolean[] zArr = {notificationsSettings3.getBoolean(str4, false)};
            org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
            int i18 = 0;
            while (i18 < 2) {
                org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, notificationsCustomSettingsActivity2.getResourceProvider());
                j6VarArr[i18] = j6Var2;
                boolean z24 = z14;
                j6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), r42, org.telegram.messenger.g0.L(4.0f), r42);
                j6VarArr[i18].a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.g7, r42), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, r42));
                j6VarArr[i18].b(org.telegram.messenger.id.M0(i18 == 0 ? 2131747850 : 2131747851, null), i18 == 0 ? !zArr[r42] ? z24 : r42 : zArr[r42]);
                ai.i0 i0Var = j6VarArr[i18];
                int i19 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.ActionBar.r6.R(i0Var, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i19, r42), 2, -1), null, org.telegram.ui.ActionBar.r6.N(i19), null);
                f12.addView(j6VarArr[i18]);
                j6VarArr[i18].setOnClickListener(new bi.la(zArr, i18, j6VarArr, 16));
                i18++;
                z14 = z24;
                r42 = 0;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, notificationsCustomSettingsActivity2.getParentActivity(), notificationsCustomSettingsActivity2.resourceProvider);
            String M04 = org.telegram.messenger.id.M0(2131747852, null);
            org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
            u1Var4.R = M04;
            alertDialog$Builder4.o(f12);
            alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
            alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131745949, null), new a1.d(notificationsCustomSettingsActivity2, notificationsSettings3, str4, zArr, 17));
            notificationsCustomSettingsActivity2.showDialog(u1Var4);
        }
    }

    public static void a0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.j(true);
        notificationsCustomSettingsActivity.p0(oh0Var, view, false);
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
        boolean z9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i7;
        boolean z10;
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
                    oh0 oh0Var = new oh0();
                    oh0Var.d = longValue2;
                    arrayList10 = arrayList21;
                    ArrayList arrayList24 = arrayList12;
                    oh0Var.b = org.telegram.messenger.k5.w("custom_", longValue2, notificationsSettings, false);
                    int intValue = ((Integer) next.getValue()).intValue();
                    oh0Var.c = intValue;
                    if (intValue != 0) {
                        Integer num = (Integer) all.get("notifyuntil_" + replace);
                        if (num != null) {
                            oh0Var.a = num.intValue();
                        }
                    }
                    if (org.telegram.messenger.m5.C(longValue2)) {
                        int i13 = (int) (4294967295L & longValue2);
                        TLRPC.EncryptedChat a12 = notificationsCustomSettingsActivity.getMessagesController().a1(Integer.valueOf(i13));
                        if (a12 == null) {
                            arrayList18.add(Integer.valueOf(i13));
                            longSparseArray.put(longValue2, oh0Var);
                        } else {
                            TLRPC.User a22 = notificationsCustomSettingsActivity.getMessagesController().a2(Long.valueOf(a12.user_id));
                            if (a22 == null) {
                                arrayList16.add(Long.valueOf(a12.user_id));
                                longSparseArray.put(a12.user_id, oh0Var);
                            } else if (a22.deleted) {
                                it = it2;
                                arrayList20 = arrayList22;
                                arrayList19 = arrayList9;
                                arrayList14 = arrayList8;
                                arrayList13 = arrayList7;
                                arrayList21 = arrayList10;
                                arrayList12 = arrayList24;
                            }
                        }
                        arrayList11.add(oh0Var);
                        arrayList12 = arrayList24;
                    } else if (org.telegram.messenger.m5.E(longValue2)) {
                        TLRPC.User a23 = notificationsCustomSettingsActivity.getMessagesController().a2(A2);
                        if (a23 == null) {
                            arrayList16.add(A2);
                            longSparseArray.put(longValue2, oh0Var);
                        } else if (a23.deleted) {
                            it = it2;
                            arrayList20 = arrayList22;
                            arrayList19 = arrayList9;
                            arrayList14 = arrayList8;
                            arrayList13 = arrayList7;
                            arrayList21 = arrayList10;
                            arrayList12 = arrayList24;
                        }
                        arrayList11.add(oh0Var);
                        arrayList12 = arrayList24;
                    } else {
                        long j10 = -longValue2;
                        TLRPC.Chat M0 = notificationsCustomSettingsActivity.getMessagesController().M0(Long.valueOf(j10));
                        if (M0 == null) {
                            arrayList17.add(Long.valueOf(j10));
                            longSparseArray.put(longValue2, oh0Var);
                        } else if (!M0.left && !M0.kicked && M0.migrated_to == null) {
                            if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                                arrayList12 = arrayList24;
                                arrayList12.add(oh0Var);
                            } else {
                                arrayList15.add(oh0Var);
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
            z9 = true;
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
                    oh0 oh0Var2 = new oh0();
                    oh0Var2.d = longValue;
                    oh0Var2.e = true;
                    oh0Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (org.telegram.messenger.m5.E(longValue)) {
                        TLRPC.User a24 = notificationsCustomSettingsActivity.getMessagesController().a2(A);
                        if (a24 == null) {
                            arrayList16.add(A);
                            longSparseArray.put(longValue, oh0Var2);
                        } else if (a24.deleted) {
                        }
                        arrayList6 = arrayList25;
                        arrayList6.add(oh0Var2);
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
            Collections.sort(arrayList, Comparator$-CC.comparingDouble(new bi.j1(5)));
            int max = Math.max(0, arrayList.size() - 6);
            while (max < arrayList.size()) {
                long o4 = org.telegram.messenger.m5.o(((TLRPC.TL_topPeer) arrayList.get(max)).peer);
                if (!hashSet.contains(Long.valueOf(o4))) {
                    oh0 oh0Var3 = new oh0();
                    oh0Var3.d = o4;
                    oh0Var3.e = z9;
                    oh0Var3.c = 0;
                    oh0Var3.f = z9;
                    if (org.telegram.messenger.m5.E(o4)) {
                        TLRPC.User a25 = notificationsCustomSettingsActivity.getMessagesController().a2(Long.valueOf(o4));
                        if (a25 == null) {
                            arrayList16.add(Long.valueOf(o4));
                            longSparseArray.put(o4, oh0Var3);
                        }
                        arrayList5 = arrayList26;
                        arrayList5.add(0, oh0Var3);
                        hashSet.add(Long.valueOf(o4));
                        max++;
                        arrayList26 = arrayList5;
                        z9 = true;
                    }
                }
                arrayList5 = arrayList26;
                max++;
                arrayList26 = arrayList5;
                z9 = true;
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
                        z10 = true;
                        i7 = 0;
                        org.telegram.messenger.a8.g(e, z10);
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
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.y21(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
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
                        z10 = true;
                        org.telegram.messenger.a8.g(e, z10);
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
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.y21(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                    try {
                        notificationsCustomSettingsActivity.getMessagesStorage().n0(arrayList16, arrayList3, false);
                    } catch (Exception e14) {
                        e = e14;
                        arrayList2 = arrayList28;
                        z10 = true;
                        org.telegram.messenger.a8.g(e, z10);
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
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.y21(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
                if (arrayList17.isEmpty()) {
                    arrayList2 = arrayList28;
                } else {
                    org.telegram.messenger.yr messagesStorage = notificationsCustomSettingsActivity.getMessagesStorage();
                    String join = TextUtils.join(",", arrayList17);
                    arrayList2 = arrayList28;
                    try {
                        messagesStorage.Q(join, arrayList2);
                    } catch (Exception e15) {
                        e = e15;
                        z10 = true;
                        org.telegram.messenger.a8.g(e, z10);
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
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.y21(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
                    }
                }
            } catch (Exception e16) {
                e = e16;
                arrayList2 = arrayList28;
                arrayList3 = arrayList27;
                i7 = 0;
                z10 = true;
                org.telegram.messenger.a8.g(e, z10);
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
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.y21(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
            }
            size = arrayList2.size();
            for (i10 = i7; i10 < size; i10++) {
                TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                    oh0 oh0Var4 = (oh0) longSparseArray.get(-chat.id);
                    longSparseArray.remove(-chat.id);
                    if (oh0Var4 != null) {
                        if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                            arrayList12.add(oh0Var4);
                        } else {
                            arrayList15.add(oh0Var4);
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
                longSparseArray.remove(org.telegram.messenger.m5.F(((TLRPC.EncryptedChat) arrayList4.get(i12)).id));
            }
            size4 = longSparseArray.size();
            while (i7 < size4) {
                if (org.telegram.messenger.m5.z(longSparseArray.keyAt(i7))) {
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
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.y21(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
    }

    public static void c0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.j(true);
        notificationsCustomSettingsActivity.p0(oh0Var, view, true);
    }

    public static boolean h0(int i7, long j3) {
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).d7;
        StringBuilder sb2 = new StringBuilder("stories_");
        sb2.append(j3);
        return sharedPreferences.contains(sb2.toString()) ? org.telegram.messenger.k5.w("stories_", j3, sharedPreferences, true) : sharedPreferences.contains("EnableAllStories") ? sharedPreferences.getBoolean("EnableAllStories", true) : n0(i7, j3);
    }

    public static boolean n0(int i7, long j3) {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(i7).i1);
        Collections.sort(arrayList, Comparator$-CC.comparingDouble(new bi.j1(4)));
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (org.telegram.messenger.m5.o(((TLRPC.TL_topPeer) arrayList.get(i11)).peer) == j3) {
                i10 = i11;
            }
        }
        return i10 >= 0 && i10 >= arrayList.size() + (-5);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.f = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.s == -1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747913, "NotificationsExceptions"));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747925, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 18));
        ArrayList arrayList = this.x;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
            b10.N();
            b10.B0 = new kg.v1(this, 17);
            b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, "Search"));
        }
        this.d = new mh0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.c = jyVar;
        jyVar.setTextSize(18);
        this.c.setText(org.telegram.messenger.id.M0(2131748212, "NoExceptions"));
        this.c.c();
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.a = pj0Var;
        pj0Var.r1();
        this.a.setEmptyView(this.c);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new v4.b0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.c, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.pj0 pj0Var2 = this.a;
        w6 w6Var = new w6(i7, context, this);
        this.b = w6Var;
        pj0Var2.setAdapter(w6Var);
        this.a.setOnItemClickListener(new pu(25, this, context));
        ih0 ih0Var = new ih0(this);
        ih0Var.c = 150L;
        ih0Var.e = 350L;
        ih0Var.f = 0L;
        ih0Var.g = 0L;
        ih0Var.d = 0L;
        ih0Var.C = false;
        ih0Var.i = new OvershootInterpolator(1.1f);
        ih0Var.o = org.telegram.ui.Components.xq.h;
        ih0Var.m = false;
        this.a.setItemAnimator(ih0Var);
        this.a.setOnScrollListener(new g3(this, 22));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.f0) {
            if (i7 == org.telegram.messenger.qs.S0) {
                o0();
            }
        } else {
            w6 w6Var = this.b;
            if (w6Var != null) {
                w6Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(14, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.pa.class, org.telegram.ui.Cells.h5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        int i7 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.v6));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0() {
        boolean B;
        kh0 kh0Var;
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
                org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) this.a.T(childAt);
                this.a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList3 = this.I;
                    if (R < arrayList3.size()) {
                        kh0Var = (kh0) arrayList3.get(R);
                        boolean z9 = (kh0Var == null && ((i10 = kh0Var.c) == 102 || i10 == 101 || i10 == 100)) ? true : B;
                        i7 = xi0Var.f;
                        View view = xi0Var.a;
                        if (i7 != 0) {
                            ((org.telegram.ui.Cells.n4) view).a(arrayList2, z9);
                        } else if (i7 == 1) {
                            ((org.telegram.ui.Cells.r8) view).e(arrayList2, z9);
                        } else if (i7 == 3) {
                            ((org.telegram.ui.Cells.t8) view).a(arrayList2, z9);
                        } else if (i7 == 5) {
                            ((org.telegram.ui.Cells.w9) view).a(arrayList2, z9);
                        }
                    }
                }
                kh0Var = null;
                if (kh0Var == null) {
                }
                i7 = xi0Var.f;
                View view2 = xi0Var.a;
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
            this.e.addListener(new d30(this, 7));
            this.e.setDuration(150L);
            this.e.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(oh0 oh0Var, View view) {
        String v = org.telegram.messenger.dt.v(oh0Var.d, 0L, false);
        getNotificationsSettings().edit().remove("stories_" + v).commit();
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            arrayList.remove(oh0Var);
        }
        ArrayList arrayList2 = this.x;
        if (arrayList2 != null) {
            arrayList2.remove(oh0Var);
        }
        if (n0(this.currentAccount, oh0Var.d)) {
            oh0Var.f = true;
            oh0Var.c = 0;
            this.w.add(oh0Var);
        }
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.f(oh0Var, null, paVar.S);
        }
        getNotificationsController().c0(oh0Var.d, 0L, false);
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
        int[] iArr = this.E;
        return org.telegram.messenger.id.M0(iArr[Utilities.j(i10, iArr.length - 1, 0)], null);
    }

    public final String m0() {
        int i7 = this.s;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? (i7 == 4 || i7 == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1 : getNotificationsSettings().getInt("priority_stories", 1) : getNotificationsSettings().getInt("priority_channel", 1) : getNotificationsSettings().getInt("priority_messages", 1) : getNotificationsSettings().getInt("priority_group", 1);
        int[] iArr = this.F;
        return org.telegram.messenger.id.M0(iArr[Utilities.j(i10, iArr.length - 1, 0)], null);
    }

    public final void o0() {
        ArrayList arrayList;
        if (this.s == 3) {
            org.telegram.messenger.ui.b0(this.currentAccount).M0(true);
            arrayList = new ArrayList(org.telegram.messenger.ui.b0(this.currentAccount).i1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().a.c(new zc0(14, this, arrayList));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                str = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.id.M0(2131745283, "SoundDefault") : ringtone.getTitle(getParentActivity());
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
            v4.d1 K = this.a.K(i7);
            if (K != null) {
                this.b.t(K, i7);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        q0(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.qs.f0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.S0);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        w6 w6Var = this.b;
        if (w6Var != null) {
            w6Var.f();
        }
        getNotificationCenter().c(this, org.telegram.messenger.qs.f0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.S0);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(oh0 oh0Var, View view, boolean z9) {
        String v = org.telegram.messenger.dt.v(oh0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean n02 = n0(this.currentAccount, oh0Var.d);
        oh0Var.c = z9 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
        if (oh0Var.f) {
            oh0Var.f = false;
            edit.putBoolean(rf.b.i("stories_", v), !z9).commit();
            ArrayList arrayList = this.w;
            if (arrayList != null) {
                arrayList.remove(oh0Var);
            }
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(0, oh0Var);
        } else if (n02) {
            edit.putBoolean(rf.b.i("stories_", v), !z9).commit();
        } else {
            Boolean bool = this.n;
            if (!z9 ? bool == null || !bool.booleanValue() : bool != null && bool.booleanValue()) {
                j0(oh0Var, view);
                return;
            }
            edit.putBoolean(rf.b.i("stories_", v), !z9).commit();
        }
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.f(oh0Var, null, paVar.S);
        }
        getNotificationsController().c0(oh0Var.d, 0L, false);
        q0(true);
    }

    public final void q0(boolean z9) {
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
        ArrayList arrayList3 = this.H;
        arrayList3.clear();
        ArrayList arrayList4 = this.I;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i7 = this.s;
        if (i7 != -1) {
            String M0 = org.telegram.messenger.id.M0(2131747845, null);
            kh0 kh0Var = new kh0(0, true);
            kh0Var.e = M0;
            arrayList4.add(kh0Var);
            if (i7 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(kh0.b(101, org.telegram.messenger.id.M0(2131747840, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    arrayList4.add(kh0.b(org.telegram.messenger.qs.n1, org.telegram.messenger.id.M0(2131747842, null), this.r && ((bool = this.n) == null || !bool.booleanValue())));
                }
                arrayList4.add(kh0.d(-1, org.telegram.messenger.id.M0(2131744721, null)));
            } else if (i7 == 4 || i7 == 5) {
                this.messagesRow = arrayList4.size();
                String M02 = org.telegram.messenger.id.M0(2131747841, null);
                String M03 = org.telegram.messenger.id.M0(!notificationsSettings.getBoolean("EnableReactionsMessages", true) ? 2131747847 : notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? 2131747849 : 2131747848, null);
                boolean z10 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                kh0 kh0Var2 = new kh0(6, true);
                kh0Var2.c = org.telegram.messenger.qs.o1;
                kh0Var2.d = R.drawable.msg_markunread;
                kh0Var2.e = M02;
                kh0Var2.f = M03;
                kh0Var2.i = z10;
                arrayList4.add(kh0Var2);
                this.storiesRow = arrayList4.size();
                String M04 = org.telegram.messenger.id.M0(2131747838, null);
                String M05 = org.telegram.messenger.id.M0(!notificationsSettings.getBoolean("EnableReactionsStories", true) ? 2131747847 : notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? 2131747849 : 2131747848, null);
                boolean z11 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                kh0 kh0Var3 = new kh0(6, true);
                kh0Var3.c = org.telegram.messenger.qs.p1;
                kh0Var3.d = R.drawable.msg_stories_saved;
                kh0Var3.e = M04;
                kh0Var3.f = M05;
                kh0Var3.i = z11;
                arrayList4.add(kh0Var3);
                arrayList4.add(kh0.d(-1, null));
            } else {
                int i10 = i7 == 1 ? 2131747839 : i7 == 0 ? 2131747843 : 2131747844;
                this.showRow = arrayList4.size();
                arrayList4.add(kh0.b(100, org.telegram.messenger.id.M0(i10, null), getNotificationsController().B(i7)));
                arrayList4.add(kh0.d(-1, null));
            }
            String M06 = org.telegram.messenger.id.M0(2131745986, null);
            kh0 kh0Var4 = new kh0(0, true);
            kh0Var4.e = M06;
            arrayList4.add(kh0Var4);
            arrayList4.size();
            if (i7 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(kh0.b(0, org.telegram.messenger.id.M0(2131747934, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i7 == 4 || i7 == 5) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(kh0.b(0, org.telegram.messenger.id.M0(2131747934, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                boolean z12 = i7 != 0 ? i7 != 1 ? i7 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true) : notificationsSettings.getBoolean("EnablePreviewAll", true) : notificationsSettings.getBoolean("EnablePreviewGroup", true);
                this.previewRow = arrayList4.size();
                arrayList4.add(kh0.b(0, org.telegram.messenger.id.M0(2131748538, null), z12));
            }
            this.soundRow = arrayList4.size();
            String M07 = org.telegram.messenger.id.M0(2131745286, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String M08 = org.telegram.messenger.id.M0(2131745283, "SoundDefault");
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
                TLRPC.Document c10 = getMediaDataController().z0.c(j10);
                string = c10 == null ? org.telegram.messenger.id.M0(2131751680, "CustomSound") : sh0.g0(c10, org.telegram.messenger.w7.B(c10));
            } else if (string.equals("NoSound")) {
                string = org.telegram.messenger.id.M0(2131748152, "NoSound");
            } else if (string.equals("Default")) {
                string = org.telegram.messenger.id.M0(2131745283, "SoundDefault");
            }
            arrayList4.add(kh0.c(3, M07, string));
            if (this.G) {
                this.lightColorRow = arrayList4.size();
                String M09 = org.telegram.messenger.id.M0(2131748990, "LedColor");
                int k02 = k0();
                kh0 kh0Var5 = new kh0(3, true);
                kh0Var5.e = M09;
                kh0Var5.h = k02;
                arrayList4.add(kh0Var5);
                int i11 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? (i7 == 4 || i7 == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0 : notificationsSettings.getInt("vibrate_stories", 0) : notificationsSettings.getInt("vibrate_channel", 0) : notificationsSettings.getInt("vibrate_messages", 0) : notificationsSettings.getInt("vibrate_group", 0);
                this.vibrateRow = arrayList4.size();
                String M010 = org.telegram.messenger.id.M0(2131743617, "Vibrate");
                int[] iArr = this.D;
                arrayList4.add(kh0.c(1, M010, org.telegram.messenger.id.M0(iArr[Utilities.j(i11, iArr.length - 1, 0)], null)));
                if (i7 == 1 || i7 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(kh0.c(2, org.telegram.messenger.id.M0(2131747099, "PopupNotification"), l0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(kh0.c(4, org.telegram.messenger.id.M0(2131747907, "NotificationsImportance"), m0()));
                String M011 = org.telegram.messenger.id.M0(2131747846, null);
                kh0 kh0Var6 = new kh0(8, true);
                kh0Var6.e = M011;
                kh0Var6.d = 0;
                arrayList4.add(kh0Var6);
            } else {
                String M012 = org.telegram.messenger.id.M0(2131747837, null);
                kh0 kh0Var7 = new kh0(8, true);
                kh0Var7.e = M012;
                kh0Var7.d = 1;
                arrayList4.add(kh0Var7);
            }
            arrayList4.size();
            arrayList4.add(kh0.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i7 != 4 && i7 != 5) {
            if (i7 != -1) {
                this.addExceptionRow = arrayList4.size();
                String M013 = org.telegram.messenger.id.M0(2131747924, "NotificationsAddAnException");
                kh0 kh0Var8 = new kh0(7, true);
                kh0Var8.c = 6;
                kh0Var8.d = R.drawable.msg_contact_add;
                kh0Var8.e = M013;
                arrayList4.add(kh0Var8);
            }
            arrayList4.size();
            if (this.w != null && this.h) {
                for (int i12 = 0; i12 < this.w.size(); i12++) {
                    oh0 oh0Var = (oh0) this.w.get(i12);
                    kh0 kh0Var9 = new kh0(2, true);
                    kh0Var9.g = oh0Var;
                    arrayList4.add(kh0Var9);
                }
            }
            if (this.x != null) {
                for (int i13 = 0; i13 < this.x.size(); i13++) {
                    oh0 oh0Var2 = (oh0) this.x.get(i13);
                    kh0 kh0Var10 = new kh0(2, true);
                    kh0Var10.g = oh0Var2;
                    arrayList4.add(kh0Var10);
                }
            }
            arrayList4.size();
            if (i7 != -1 || ((arrayList2 = this.x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(kh0.d(-3, null));
            }
            ArrayList arrayList5 = this.x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String M014 = org.telegram.messenger.id.M0(2131747916, "NotificationsDeleteAllException");
                kh0 kh0Var11 = new kh0(7, true);
                kh0Var11.c = 7;
                kh0Var11.d = 0;
                kh0Var11.e = M014;
                arrayList4.add(kh0Var11);
            }
        }
        w6 w6Var = this.b;
        if (w6Var != null) {
            if (z9) {
                w6Var.E(arrayList, arrayList4);
            } else {
                w6Var.f();
            }
        }
    }

    public final void r0() {
        try {
            if (this.a == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wl, false);
            int i7 = 0;
            while (i7 < 4) {
                int childCount = i7 == 0 ? this.a.getChildCount() : i7 == 1 ? this.a.getHiddenChildCount() : i7 == 2 ? this.a.getCachedChildCount() : this.a.getAttachedScrapChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i7 == 0 ? this.a.getChildAt(i10) : i7 == 1 ? this.a.V(i10) : i7 == 2 ? this.a.P(i10) : this.a.O(i10);
                    if (childAt instanceof org.telegram.ui.Cells.pa) {
                        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) childAt;
                        paVar.a0 = true;
                        paVar.Q = x02;
                        paVar.R = x03;
                        if (i7 != 0) {
                            ((org.telegram.ui.Cells.pa) childAt).i(0);
                        }
                    }
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
