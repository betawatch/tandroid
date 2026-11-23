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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public final int[] E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public org.telegram.ui.Components.ek0 a;
    public int addExceptionRow;
    public w6 b;
    public org.telegram.ui.Components.sy c;
    public qh0 d;
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
        this.E = new int[]{2131743366, 2131745170, 2131743365, 2131748530, 2131747627};
        this.F = new int[]{2131747984, 2131747624, 2131747625, 2131754263};
        this.G = new int[]{2131747689, 2131747685, 2131747685, 2131747687, 2131747688, 2131747687};
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
                sh0 sh0Var = (sh0) this.x.get(i10);
                this.y.put(Long.valueOf(sh0Var.d), sh0Var);
            }
        }
        ArrayList arrayList3 = this.w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                sh0 sh0Var2 = (sh0) this.w.get(i11);
                this.y.put(Long.valueOf(sh0Var2.d), sh0Var2);
            }
        }
        if (z10) {
            o0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context, View view, int i7, float f10, float f11) {
        HashMap hashMap;
        sh0 sh0Var;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList2;
        Drawable drawable;
        final ArrayList arrayList3;
        int i10;
        boolean z13;
        String str;
        long j3;
        sh0 sh0Var2;
        boolean z14;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
        ArrayList arrayList4 = notificationsCustomSettingsActivity2.J;
        HashMap hashMap2 = notificationsCustomSettingsActivity2.y;
        int i11 = notificationsCustomSettingsActivity2.s;
        if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
            return;
        }
        oh0 oh0Var = (notificationsCustomSettingsActivity2.a.getAdapter() != notificationsCustomSettingsActivity2.b || i7 < 0 || i7 >= arrayList4.size()) ? null : (oh0) arrayList4.get(i7);
        boolean z15 = true;
        boolean z16 = true;
        if (oh0Var != null && oh0Var.a == 8) {
            notificationsCustomSettingsActivity2.H = !notificationsCustomSettingsActivity2.H;
            notificationsCustomSettingsActivity2.q0(true);
            return;
        }
        if (i11 != 3 || oh0Var == null) {
            hashMap = hashMap2;
        } else {
            hashMap = hashMap2;
            sh0 sh0Var3 = oh0Var.g;
            if (sh0Var3 != null) {
                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(notificationsCustomSettingsActivity2, view);
                I.i = 3;
                I.m(R.drawable.msg_mute, new ih0(notificationsCustomSettingsActivity2, sh0Var3, view, i7, 5), org.telegram.messenger.gd.N0(2131747670, null), sh0Var3.c <= 0 || sh0Var3.f, false);
                I.m(R.drawable.msg_unmute, new ih0(notificationsCustomSettingsActivity, sh0Var3, view, i7, 0), org.telegram.messenger.gd.N0(2131747667, null), sh0Var3.c > 0 || sh0Var3.f, false);
                I.m(R.drawable.msg_delete, new ih0(notificationsCustomSettingsActivity, sh0Var3, view, i7, 1), org.telegram.messenger.gd.N0(2131751530, "DeleteException"), !sh0Var3.f, true);
                I.X(notificationsCustomSettingsActivity.a.U0(view, false));
                I.a0();
                return;
            }
        }
        if (i11 == 3) {
            v4.i0 adapter = notificationsCustomSettingsActivity2.a.getAdapter();
            qh0 qh0Var = notificationsCustomSettingsActivity2.d;
            if (adapter == qh0Var) {
                Object E = qh0Var.E(i7);
                if (E instanceof sh0) {
                    sh0Var2 = (sh0) E;
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
                        sh0 sh0Var4 = new sh0();
                        sh0Var4.e = true;
                        sh0Var4.d = j3;
                        if (z17) {
                            sh0Var4.d = ((TLRPC.User) E).id;
                        } else {
                            sh0Var4.d = -((TLRPC.Chat) E).id;
                        }
                        sh0Var2 = sh0Var4;
                        z14 = true;
                        if (sh0Var2 != null) {
                            return;
                        }
                        org.telegram.ui.Components.x60 I2 = org.telegram.ui.Components.x60.I(notificationsCustomSettingsActivity2, view);
                        I2.i = 3;
                        sh0 sh0Var5 = sh0Var2;
                        I2.m(R.drawable.msg_mute, new ih0(notificationsCustomSettingsActivity2, sh0Var5, view, z14, 2), org.telegram.messenger.gd.N0(2131747670, null), sh0Var2.c <= 0 || sh0Var2.f, false);
                        I2.m(R.drawable.msg_unmute, new ih0(notificationsCustomSettingsActivity, sh0Var5, view, z14, 3), org.telegram.messenger.gd.N0(2131747667, null), sh0Var5.c > 0 || sh0Var5.f, false);
                        I2.m(R.drawable.msg_delete, new ih0(notificationsCustomSettingsActivity, sh0Var5, view, i7, 4), org.telegram.messenger.gd.N0(2131751530, str), (z14 || sh0Var5.f) ? false : true, true);
                        I2.X(notificationsCustomSettingsActivity.a.U0(view, false));
                        I2.a0();
                        return;
                    }
                    sh0Var2 = (sh0) hashMap.get(Long.valueOf(j3));
                }
                z14 = false;
                if (sh0Var2 != null) {
                }
            }
        }
        if (notificationsCustomSettingsActivity2.a.getAdapter() == notificationsCustomSettingsActivity2.d || !(oh0Var == null || oh0Var.g == null)) {
            v4.i0 adapter2 = notificationsCustomSettingsActivity2.a.getAdapter();
            qh0 qh0Var2 = notificationsCustomSettingsActivity2.d;
            if (adapter2 == qh0Var2) {
                Object E2 = qh0Var2.E(i7);
                if (E2 instanceof sh0) {
                    sh0Var = (sh0) E2;
                    arrayList = notificationsCustomSettingsActivity2.d.d;
                    z12 = false;
                } else {
                    boolean z18 = E2 instanceof TLRPC.User;
                    long j10 = z18 ? ((TLRPC.User) E2).id : -((TLRPC.Chat) E2).id;
                    if (hashMap.containsKey(Long.valueOf(j10))) {
                        sh0Var = (sh0) hashMap.get(Long.valueOf(j10));
                        z11 = false;
                    } else {
                        sh0 sh0Var6 = new sh0();
                        sh0Var6.d = j10;
                        if (z18) {
                            sh0Var6.d = ((TLRPC.User) E2).id;
                        } else {
                            sh0Var6.d = -((TLRPC.Chat) E2).id;
                        }
                        sh0Var = sh0Var6;
                        z11 = true;
                    }
                    arrayList = notificationsCustomSettingsActivity2.x;
                    z12 = z11;
                }
                z10 = z12;
            } else {
                sh0Var = oh0Var.g;
                if (sh0Var.f) {
                    return;
                }
                arrayList = notificationsCustomSettingsActivity2.x;
                z10 = false;
            }
            sh0 sh0Var7 = sh0Var;
            ArrayList arrayList5 = arrayList;
            if (sh0Var7 == null) {
                return;
            }
            long j11 = sh0Var7.d;
            org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, notificationsCustomSettingsActivity2.currentAccount, null, true, new lh0(notificationsCustomSettingsActivity2, j11, org.telegram.messenger.xs.t(notificationsCustomSettingsActivity2.currentAccount).D(j11, null, false, false), sh0Var7, z10, i7, arrayList5), notificationsCustomSettingsActivity.getResourceProvider());
            ooVar.e(j11, 0, null);
            ooVar.d(notificationsCustomSettingsActivity, view, f10, f11, false);
            return;
        }
        if (oh0Var == null) {
            return;
        }
        int i12 = oh0Var.c;
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
            bx bxVar = new bx(bundle);
            bxVar.E2 = new jh0(notificationsCustomSettingsActivity2);
            notificationsCustomSettingsActivity2.presentFragment(bxVar);
            return;
        }
        if (i12 == 7) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131747719, "NotificationsDeleteAllExceptionTitle");
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131747720, "NotificationsDeleteAllExceptionAlert");
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, "Delete"), new jh0(notificationsCustomSettingsActivity2));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
            notificationsCustomSettingsActivity2.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
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
            final ArrayList arrayList6 = notificationsCustomSettingsActivity2.x;
            ArrayList arrayList7 = notificationsCustomSettingsActivity2.w;
            int i15 = notificationsCustomSettingsActivity2.currentAccount;
            final na naVar = new na(notificationsCustomSettingsActivity2, z16 ? 1 : 0);
            Pattern pattern = org.telegram.ui.Components.b5.a;
            if (notificationsCustomSettingsActivity2.getParentActivity() == null) {
                return;
            }
            final boolean D = org.telegram.messenger.xs.t(i15).D(0L, null, false, false);
            String[] strArr = {org.telegram.messenger.gd.N0(2131747663, null), org.telegram.messenger.gd.a0("MuteFor", null, 2131748119, org.telegram.messenger.gd.G(1, "Hours", new Object[0])), org.telegram.messenger.gd.a0("MuteFor", null, 2131748119, org.telegram.messenger.gd.G(2, "Days", new Object[0])), null, org.telegram.messenger.gd.N0(2131747664, null)};
            int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
            LinearLayout linearLayout = new LinearLayout(notificationsCustomSettingsActivity2.getParentActivity());
            linearLayout.setOrientation(1);
            final AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsCustomSettingsActivity2.getParentActivity());
            int i16 = 0;
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity2;
            while (i16 < 5) {
                if (strArr[i16] == null) {
                    arrayList3 = arrayList7;
                    i10 = i15;
                } else {
                    TextView textView2 = new TextView(notificationsCustomSettingsActivity3.getParentActivity());
                    Drawable drawable2 = notificationsCustomSettingsActivity3.getParentActivity().getResources().getDrawable(iArr[i16]);
                    if (i16 == 4) {
                        drawable = null;
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q7, null);
                        arrayList2 = arrayList7;
                        org.telegram.ui.ActionBar.u6.x(textView2, drawable2, org.telegram.ui.ActionBar.n6.p7, null, PorterDuff.Mode.MULTIPLY);
                    } else {
                        arrayList2 = arrayList7;
                        drawable = null;
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.j5, null);
                        org.telegram.ui.ActionBar.u6.x(textView2, drawable2, org.telegram.ui.ActionBar.n6.J5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    org.telegram.messenger.m10.q(textView2, 1, 16.0f, 1, 1);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, drawable, drawable);
                    textView2.setTag(Integer.valueOf(i16));
                    textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                    textView2.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                    textView2.setSingleLine(true);
                    textView2.setGravity(19);
                    textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(26.0f));
                    textView2.setText(strArr[i16]);
                    linearLayout.addView(textView2, c8.na.r(-1, 48, 51));
                    final int i17 = i15;
                    final NotificationsCustomSettingsActivity notificationsCustomSettingsActivity4 = notificationsCustomSettingsActivity3;
                    arrayList3 = arrayList2;
                    i10 = i17;
                    notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity4;
                    textView2.setOnClickListener(new View.OnClickListener(i17, D, i14, notificationsCustomSettingsActivity4, arrayList6, arrayList3, naVar, alertDialog$Builder2) { // from class: org.telegram.ui.Components.t2
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
                            this.d = arrayList6;
                            this.e = arrayList3;
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
                            if (i21 < 0 || !kc.a(notificationsCustomSettingsActivity5)) {
                                return;
                            }
                            kc.z(notificationsCustomSettingsActivity5, i21, 0, null).j();
                        }
                    });
                }
                i16++;
                i15 = i10;
                arrayList7 = arrayList3;
                notificationsCustomSettingsActivity3 = notificationsCustomSettingsActivity3;
            }
            String N02 = org.telegram.messenger.gd.N0(2131747730, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.S = N02;
            alertDialog$Builder2.o(linearLayout);
            notificationsCustomSettingsActivity3.showDialog(t1Var2);
            return;
        }
        if (i12 == 3) {
            if (view.isEnabled()) {
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, i11);
                    notificationsCustomSettingsActivity2.presentFragment(new wh0(bundle2, notificationsCustomSettingsActivity2.getResourceProvider()));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            return;
        }
        if (oh0Var.a == 3) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.b5.t(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new kh0(notificationsCustomSettingsActivity2, view, i7, 0), null));
                return;
            }
            return;
        }
        if (i12 == 2) {
            if (view.isEnabled()) {
                Activity parentActivity = notificationsCustomSettingsActivity2.getParentActivity();
                kh0 kh0Var = new kh0(notificationsCustomSettingsActivity2, view, i7, 1);
                Pattern pattern2 = org.telegram.ui.Components.b5.a;
                SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).g7;
                int[] iArr2 = new int[1];
                if (i11 == 1) {
                    iArr2[0] = sharedPreferences.getInt("popupAll", 0);
                } else if (i11 == 0) {
                    iArr2[0] = sharedPreferences.getInt("popupGroup", 0);
                } else {
                    iArr2[0] = sharedPreferences.getInt("popupChannel", 0);
                }
                String[] strArr2 = {org.telegram.messenger.gd.N0(2131747984, null), org.telegram.messenger.gd.N0(2131747624, null), org.telegram.messenger.gd.N0(2131747625, null), org.telegram.messenger.gd.N0(2131754263, null)};
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
                    j6Var.setOnClickListener(new fi.k5(iArr2, i11, alertDialog$Builder3, kh0Var, 2));
                    i18++;
                }
                String N03 = org.telegram.messenger.gd.N0(2131746904, null);
                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
                t1Var3.S = N03;
                alertDialog$Builder3.o(f12);
                alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131752577, null), null);
                notificationsCustomSettingsActivity2.showDialog(t1Var3);
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view.isEnabled()) {
                String str2 = i11 == 1 ? "vibrate_messages" : i11 == 0 ? "vibrate_group" : i11 == 3 ? "vibrate_stories" : (i11 == 4 || i11 == 5) ? "vibrate_react" : "vibrate_channel";
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.b5.V(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0L, str2, new org.telegram.ui.Components.kp0(notificationsCustomSettingsActivity2, view, str2, i7), null));
                return;
            }
            return;
        }
        if (i12 == 4) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity2.showDialog(org.telegram.ui.Components.b5.F(notificationsCustomSettingsActivity2.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity2.s, new kh0(notificationsCustomSettingsActivity2, view, i7, 2), null));
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
                    oh0Var.i = true;
                } else {
                    edit2.putBoolean("EnableAllStories", false);
                    notificationsCustomSettingsActivity2.n = Boolean.FALSE;
                    notificationsCustomSettingsActivity2.r = false;
                    oh0Var.i = false;
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
                String str3 = oh0Var.c == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                SharedPreferences.Editor edit4 = notificationsSettings3.edit();
                edit4.putBoolean(str3, !notificationsSettings3.getBoolean(str3, true));
                edit4.apply();
                notificationsCustomSettingsActivity2.q0(true);
                notificationsCustomSettingsActivity2.getNotificationsController().b0(i11);
                return;
            }
            String str4 = oh0Var.c == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
            ?? r14 = 0;
            boolean[] zArr = {notificationsSettings3.getBoolean(str4, false)};
            org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
            int i19 = 0;
            while (i19 < 2) {
                org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, notificationsCustomSettingsActivity2.getResourceProvider());
                j6VarArr[i19] = j6Var2;
                boolean z25 = z15;
                j6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), r14, org.telegram.messenger.g0.L(4.0f), r14);
                j6VarArr[i19].a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.g7, r14), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E5, r14));
                j6VarArr[i19].b(org.telegram.messenger.gd.N0(i19 == 0 ? 2131747655 : 2131747656, null), i19 == 0 ? !zArr[r14] ? z25 : r14 : zArr[r14]);
                ai.i0 i0Var = j6VarArr[i19];
                int i20 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.ActionBar.u6.Q(i0Var, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i20, r14), 2, -1), null, org.telegram.ui.ActionBar.u6.M(i20), null);
                g10.addView(j6VarArr[i19]);
                j6VarArr[i19].setOnClickListener(new bi.k5(zArr, i19, j6VarArr, i13));
                i19++;
                z15 = z25;
                r14 = 0;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, notificationsCustomSettingsActivity2.getParentActivity(), notificationsCustomSettingsActivity2.resourceProvider);
            String N04 = org.telegram.messenger.gd.N0(2131747657, null);
            org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.a;
            t1Var4.S = N04;
            alertDialog$Builder4.o(g10);
            alertDialog$Builder4.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131745750, null), new a1.d(notificationsCustomSettingsActivity2, notificationsSettings3, str4, zArr, 17));
            notificationsCustomSettingsActivity2.showDialog(t1Var4);
        }
    }

    public static void a0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, sh0 sh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.o(true);
        notificationsCustomSettingsActivity.p0(sh0Var, view, false);
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
                    sh0 sh0Var = new sh0();
                    sh0Var.d = longValue2;
                    arrayList10 = arrayList21;
                    ArrayList arrayList24 = arrayList12;
                    sh0Var.b = org.telegram.messenger.f3.w("custom_", longValue2, notificationsSettings, false);
                    int intValue = ((Integer) next.getValue()).intValue();
                    sh0Var.c = intValue;
                    if (intValue != 0) {
                        Integer num = (Integer) all.get("notifyuntil_" + replace);
                        if (num != null) {
                            sh0Var.a = num.intValue();
                        }
                    }
                    if (org.telegram.messenger.n5.C(longValue2)) {
                        int i13 = (int) (4294967295L & longValue2);
                        TLRPC.EncryptedChat c12 = notificationsCustomSettingsActivity.getMessagesController().c1(Integer.valueOf(i13));
                        if (c12 == null) {
                            arrayList18.add(Integer.valueOf(i13));
                            longSparseArray.put(longValue2, sh0Var);
                        } else {
                            TLRPC.User c22 = notificationsCustomSettingsActivity.getMessagesController().c2(Long.valueOf(c12.user_id));
                            if (c22 == null) {
                                arrayList16.add(Long.valueOf(c12.user_id));
                                longSparseArray.put(c12.user_id, sh0Var);
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
                        arrayList11.add(sh0Var);
                        arrayList12 = arrayList24;
                    } else if (org.telegram.messenger.n5.E(longValue2)) {
                        TLRPC.User c23 = notificationsCustomSettingsActivity.getMessagesController().c2(A2);
                        if (c23 == null) {
                            arrayList16.add(A2);
                            longSparseArray.put(longValue2, sh0Var);
                        } else if (c23.deleted) {
                            it = it2;
                            arrayList20 = arrayList22;
                            arrayList19 = arrayList9;
                            arrayList14 = arrayList8;
                            arrayList13 = arrayList7;
                            arrayList21 = arrayList10;
                            arrayList12 = arrayList24;
                        }
                        arrayList11.add(sh0Var);
                        arrayList12 = arrayList24;
                    } else {
                        long j10 = -longValue2;
                        TLRPC.Chat O0 = notificationsCustomSettingsActivity.getMessagesController().O0(Long.valueOf(j10));
                        if (O0 == null) {
                            arrayList17.add(Long.valueOf(j10));
                            longSparseArray.put(longValue2, sh0Var);
                        } else if (!O0.left && !O0.kicked && O0.migrated_to == null) {
                            if (!org.telegram.messenger.v3.T(O0) || O0.megagroup) {
                                arrayList12 = arrayList24;
                                arrayList12.add(sh0Var);
                            } else {
                                arrayList15.add(sh0Var);
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
                    sh0 sh0Var2 = new sh0();
                    sh0Var2.d = longValue;
                    sh0Var2.e = true;
                    sh0Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (org.telegram.messenger.n5.E(longValue)) {
                        TLRPC.User c24 = notificationsCustomSettingsActivity.getMessagesController().c2(A);
                        if (c24 == null) {
                            arrayList16.add(A);
                            longSparseArray.put(longValue, sh0Var2);
                        } else if (c24.deleted) {
                        }
                        arrayList6 = arrayList25;
                        arrayList6.add(sh0Var2);
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
                    sh0 sh0Var3 = new sh0();
                    sh0Var3.d = o4;
                    sh0Var3.e = z10;
                    sh0Var3.c = 0;
                    sh0Var3.f = z10;
                    if (org.telegram.messenger.n5.E(o4)) {
                        TLRPC.User c25 = notificationsCustomSettingsActivity.getMessagesController().c2(Long.valueOf(o4));
                        if (c25 == null) {
                            arrayList16.add(Long.valueOf(o4));
                            longSparseArray.put(o4, sh0Var3);
                        }
                        arrayList5 = arrayList26;
                        arrayList5.add(0, sh0Var3);
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
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.o31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
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
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.o31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
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
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.o31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
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
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.o31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
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
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.o31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
            }
            size = arrayList2.size();
            for (i10 = i7; i10 < size; i10++) {
                TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                    sh0 sh0Var4 = (sh0) longSparseArray.get(-chat.id);
                    longSparseArray.remove(-chat.id);
                    if (sh0Var4 != null) {
                        if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
                            arrayList12.add(sh0Var4);
                        } else {
                            arrayList15.add(sh0Var4);
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
        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.o31(notificationsCustomSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15));
    }

    public static void c0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, sh0 sh0Var, View view) {
        notificationsCustomSettingsActivity.simpleActionBar.o(true);
        notificationsCustomSettingsActivity.p0(sh0Var, view, true);
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

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.f = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.s == -1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747718, "NotificationsExceptions"));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747730, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 21));
        ArrayList arrayList = this.x;
        int i10 = 18;
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, R.drawable.outline_header_search);
            b10.O();
            b10.C0 = new bi.x1(this, i10);
            b10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, "Search"));
        }
        this.d = new qh0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sy syVar = new org.telegram.ui.Components.sy(context, null);
        this.c = syVar;
        syVar.setTextSize(18);
        this.c.setText(org.telegram.messenger.gd.N0(2131748018, "NoExceptions"));
        this.c.c();
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.a = ek0Var;
        ek0Var.r1();
        this.a.setEmptyView(this.c);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new v4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.c, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.ek0 ek0Var2 = this.a;
        w6 w6Var = new w6(i7, context, this);
        this.b = w6Var;
        ek0Var2.setAdapter(w6Var);
        this.a.setOnItemClickListener(new zs(28, this, context));
        mh0 mh0Var = new mh0(this);
        mh0Var.c = 150L;
        mh0Var.e = 350L;
        mh0Var.f = 0L;
        mh0Var.g = 0L;
        mh0Var.d = 0L;
        mh0Var.C = false;
        mh0Var.i = new OvershootInterpolator(1.1f);
        mh0Var.o = org.telegram.ui.Components.kr.h;
        mh0Var.m = false;
        this.a.setItemAnimator(mh0Var);
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
            w6 w6Var = this.b;
            if (w6Var != null) {
                w6Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(14, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 16, new Class[]{org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.sa.class, org.telegram.ui.Cells.i5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        int i7 = org.telegram.ui.ActionBar.n6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.n6));
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
        oh0 oh0Var;
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
                org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.a.T(childAt);
                this.a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList3 = this.J;
                    if (R < arrayList3.size()) {
                        oh0Var = (oh0) arrayList3.get(R);
                        boolean z10 = (oh0Var == null && ((i10 = oh0Var.c) == 102 || i10 == 101 || i10 == 100)) ? true : B;
                        i7 = mj0Var.f;
                        View view = mj0Var.a;
                        if (i7 != 0) {
                            ((org.telegram.ui.Cells.o4) view).a(arrayList2, z10);
                        } else if (i7 == 1) {
                            ((org.telegram.ui.Cells.r8) view).e(arrayList2, z10);
                        } else if (i7 == 3) {
                            ((org.telegram.ui.Cells.t8) view).a(arrayList2, z10);
                        } else if (i7 == 5) {
                            ((org.telegram.ui.Cells.w9) view).a(arrayList2, z10);
                        }
                    }
                }
                oh0Var = null;
                if (oh0Var == null) {
                }
                i7 = mj0Var.f;
                View view2 = mj0Var.a;
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
            this.e.addListener(new zx(this, 8));
            this.e.setDuration(150L);
            this.e.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(sh0 sh0Var, View view) {
        String v = org.telegram.messenger.xs.v(sh0Var.d, 0L, false);
        getNotificationsSettings().edit().remove("stories_" + v).commit();
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            arrayList.remove(sh0Var);
        }
        ArrayList arrayList2 = this.x;
        if (arrayList2 != null) {
            arrayList2.remove(sh0Var);
        }
        if (n0(this.currentAccount, sh0Var.d)) {
            sh0Var.f = true;
            sh0Var.c = 0;
            this.w.add(sh0Var);
        }
        if (view instanceof org.telegram.ui.Cells.sa) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.f(sh0Var, null, saVar.T);
        }
        getNotificationsController().c0(sh0Var.d, 0L, false);
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
        return org.telegram.messenger.gd.N0(iArr[Utilities.j(i10, iArr.length - 1, 0)], null);
    }

    public final String m0() {
        int i7 = this.s;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? (i7 == 4 || i7 == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1 : getNotificationsSettings().getInt("priority_stories", 1) : getNotificationsSettings().getInt("priority_channel", 1) : getNotificationsSettings().getInt("priority_messages", 1) : getNotificationsSettings().getInt("priority_group", 1);
        int[] iArr = this.G;
        return org.telegram.messenger.gd.N0(iArr[Utilities.j(i10, iArr.length - 1, 0)], null);
    }

    public final void o0() {
        ArrayList arrayList;
        if (this.s == 3) {
            org.telegram.messenger.ri.d0(this.currentAccount).P0(true);
            arrayList = new ArrayList(org.telegram.messenger.ri.d0(this.currentAccount).j1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().a.c(new bd0(11, this, arrayList));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i10 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                str = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.gd.N0(2131745084, "SoundDefault") : ringtone.getTitle(getParentActivity());
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        q0(true);
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.ks.f0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.S0);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        w6 w6Var = this.b;
        if (w6Var != null) {
            w6Var.f();
        }
        getNotificationCenter().c(this, org.telegram.messenger.ks.f0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.S0);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(sh0 sh0Var, View view, boolean z10) {
        String v = org.telegram.messenger.xs.v(sh0Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean n02 = n0(this.currentAccount, sh0Var.d);
        sh0Var.c = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
        if (sh0Var.f) {
            sh0Var.f = false;
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
            ArrayList arrayList = this.w;
            if (arrayList != null) {
                arrayList.remove(sh0Var);
            }
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(0, sh0Var);
        } else if (n02) {
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
        } else {
            Boolean bool = this.n;
            if (!z10 ? bool == null || !bool.booleanValue() : bool != null && bool.booleanValue()) {
                j0(sh0Var, view);
                return;
            }
            edit.putBoolean(p5.c.k("stories_", v), !z10).commit();
        }
        if (view instanceof org.telegram.ui.Cells.sa) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.f(sh0Var, null, saVar.T);
        }
        getNotificationsController().c0(sh0Var.d, 0L, false);
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
            String N0 = org.telegram.messenger.gd.N0(2131747650, null);
            oh0 oh0Var = new oh0(0, true);
            oh0Var.e = N0;
            arrayList4.add(oh0Var);
            if (i7 == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(oh0.b(101, org.telegram.messenger.gd.N0(2131747645, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    arrayList4.add(oh0.b(org.telegram.messenger.ks.n1, org.telegram.messenger.gd.N0(2131747647, null), this.r && ((bool = this.n) == null || !bool.booleanValue())));
                }
                arrayList4.add(oh0.d(-1, org.telegram.messenger.gd.N0(2131744477, null)));
            } else if (i7 == 4 || i7 == 5) {
                this.messagesRow = arrayList4.size();
                String N02 = org.telegram.messenger.gd.N0(2131747646, null);
                String N03 = org.telegram.messenger.gd.N0(!notificationsSettings.getBoolean("EnableReactionsMessages", true) ? 2131747652 : notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? 2131747654 : 2131747653, null);
                boolean z11 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                oh0 oh0Var2 = new oh0(6, true);
                oh0Var2.c = org.telegram.messenger.ks.o1;
                oh0Var2.d = R.drawable.msg_markunread;
                oh0Var2.e = N02;
                oh0Var2.f = N03;
                oh0Var2.i = z11;
                arrayList4.add(oh0Var2);
                this.storiesRow = arrayList4.size();
                String N04 = org.telegram.messenger.gd.N0(2131747643, null);
                String N05 = org.telegram.messenger.gd.N0(!notificationsSettings.getBoolean("EnableReactionsStories", true) ? 2131747652 : notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? 2131747654 : 2131747653, null);
                boolean z12 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                oh0 oh0Var3 = new oh0(6, true);
                oh0Var3.c = org.telegram.messenger.ks.p1;
                oh0Var3.d = R.drawable.msg_stories_saved;
                oh0Var3.e = N04;
                oh0Var3.f = N05;
                oh0Var3.i = z12;
                arrayList4.add(oh0Var3);
                arrayList4.add(oh0.d(-1, null));
            } else {
                int i10 = i7 == 1 ? 2131747644 : i7 == 0 ? 2131747648 : 2131747649;
                this.showRow = arrayList4.size();
                arrayList4.add(oh0.b(100, org.telegram.messenger.gd.N0(i10, null), getNotificationsController().B(i7)));
                arrayList4.add(oh0.d(-1, null));
            }
            String N06 = org.telegram.messenger.gd.N0(2131745787, null);
            oh0 oh0Var4 = new oh0(0, true);
            oh0Var4.e = N06;
            arrayList4.add(oh0Var4);
            arrayList4.size();
            if (i7 == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(oh0.b(0, org.telegram.messenger.gd.N0(2131747739, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i7 == 4 || i7 == 5) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(oh0.b(0, org.telegram.messenger.gd.N0(2131747739, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                boolean z13 = i7 != 0 ? i7 != 1 ? i7 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true) : notificationsSettings.getBoolean("EnablePreviewAll", true) : notificationsSettings.getBoolean("EnablePreviewGroup", true);
                this.previewRow = arrayList4.size();
                arrayList4.add(oh0.b(0, org.telegram.messenger.gd.N0(2131748344, null), z13));
            }
            this.soundRow = arrayList4.size();
            String N07 = org.telegram.messenger.gd.N0(2131745087, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String N08 = org.telegram.messenger.gd.N0(2131745084, "SoundDefault");
            arrayList = arrayList3;
            if (i7 == 0) {
                string = notificationsSettings2.getString("GroupSound", N08);
                j3 = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            } else if (i7 == 1) {
                string = notificationsSettings2.getString("GlobalSound", N08);
                j3 = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
            } else if (i7 == 3) {
                string = notificationsSettings2.getString("StoriesSound", N08);
                j3 = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
            } else if (i7 == 4 || i7 == 5) {
                string = notificationsSettings2.getString("ReactionSound", N08);
                j3 = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
            } else {
                string = notificationsSettings2.getString("ChannelSound", N08);
                j3 = notificationsSettings2.getLong("ChannelDocId", 0L);
            }
            long j10 = j3;
            if (j10 != 0) {
                TLRPC.Document c10 = getMediaDataController().A0.c(j10);
                string = c10 == null ? org.telegram.messenger.gd.N0(2131751667, "CustomSound") : wh0.g0(c10, org.telegram.messenger.w7.B(c10));
            } else if (string.equals("NoSound")) {
                string = org.telegram.messenger.gd.N0(2131747958, "NoSound");
            } else if (string.equals("Default")) {
                string = org.telegram.messenger.gd.N0(2131745084, "SoundDefault");
            }
            arrayList4.add(oh0.c(3, N07, string));
            if (this.H) {
                this.lightColorRow = arrayList4.size();
                String N09 = org.telegram.messenger.gd.N0(2131748796, "LedColor");
                int k02 = k0();
                oh0 oh0Var5 = new oh0(3, true);
                oh0Var5.e = N09;
                oh0Var5.h = k02;
                arrayList4.add(oh0Var5);
                int i11 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? (i7 == 4 || i7 == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0 : notificationsSettings.getInt("vibrate_stories", 0) : notificationsSettings.getInt("vibrate_channel", 0) : notificationsSettings.getInt("vibrate_messages", 0) : notificationsSettings.getInt("vibrate_group", 0);
                this.vibrateRow = arrayList4.size();
                String N010 = org.telegram.messenger.gd.N0(2131743367, "Vibrate");
                int[] iArr = this.E;
                arrayList4.add(oh0.c(1, N010, org.telegram.messenger.gd.N0(iArr[Utilities.j(i11, iArr.length - 1, 0)], null)));
                if (i7 == 1 || i7 == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(oh0.c(2, org.telegram.messenger.gd.N0(2131746904, "PopupNotification"), l0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(oh0.c(4, org.telegram.messenger.gd.N0(2131747712, "NotificationsImportance"), m0()));
                String N011 = org.telegram.messenger.gd.N0(2131747651, null);
                oh0 oh0Var6 = new oh0(8, true);
                oh0Var6.e = N011;
                oh0Var6.d = 0;
                arrayList4.add(oh0Var6);
            } else {
                String N012 = org.telegram.messenger.gd.N0(2131747642, null);
                oh0 oh0Var7 = new oh0(8, true);
                oh0Var7.e = N012;
                oh0Var7.d = 1;
                arrayList4.add(oh0Var7);
            }
            arrayList4.size();
            arrayList4.add(oh0.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i7 != 4 && i7 != 5) {
            if (i7 != -1) {
                this.addExceptionRow = arrayList4.size();
                String N013 = org.telegram.messenger.gd.N0(2131747729, "NotificationsAddAnException");
                oh0 oh0Var8 = new oh0(7, true);
                oh0Var8.c = 6;
                oh0Var8.d = R.drawable.msg_contact_add;
                oh0Var8.e = N013;
                arrayList4.add(oh0Var8);
            }
            arrayList4.size();
            if (this.w != null && this.h) {
                for (int i12 = 0; i12 < this.w.size(); i12++) {
                    sh0 sh0Var = (sh0) this.w.get(i12);
                    oh0 oh0Var9 = new oh0(2, true);
                    oh0Var9.g = sh0Var;
                    arrayList4.add(oh0Var9);
                }
            }
            if (this.x != null) {
                for (int i13 = 0; i13 < this.x.size(); i13++) {
                    sh0 sh0Var2 = (sh0) this.x.get(i13);
                    oh0 oh0Var10 = new oh0(2, true);
                    oh0Var10.g = sh0Var2;
                    arrayList4.add(oh0Var10);
                }
            }
            arrayList4.size();
            if (i7 != -1 || ((arrayList2 = this.x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(oh0.d(-3, null));
            }
            ArrayList arrayList5 = this.x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String N014 = org.telegram.messenger.gd.N0(2131747721, "NotificationsDeleteAllException");
                oh0 oh0Var11 = new oh0(7, true);
                oh0Var11.c = 7;
                oh0Var11.d = 0;
                oh0Var11.e = N014;
                arrayList4.add(oh0Var11);
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
                    if (childAt instanceof org.telegram.ui.Cells.sa) {
                        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) childAt;
                        saVar.b0 = true;
                        saVar.R = x02;
                        saVar.S = x03;
                        if (i7 != 0) {
                            ((org.telegram.ui.Cells.sa) childAt).i(0);
                        }
                    }
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
