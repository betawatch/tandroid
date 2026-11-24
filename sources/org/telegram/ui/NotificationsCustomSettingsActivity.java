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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public final int[] E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public o39 a;
    public int addExceptionRow;
    public p61 b;
    public g24 c;
    public sm7 d;
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

    public NotificationsCustomSettingsActivity(int i, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        super(null);
        this.h = true;
        this.y = new HashMap();
        this.E = new int[]{2131743374, 2131745174, 2131743373, 2131748531, 2131747628};
        this.F = new int[]{2131747985, 2131747625, 2131747626, 2131754263};
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
        this.s = i;
        this.w = arrayList2;
        this.x = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                vm7 vm7Var = (vm7) this.x.get(i2);
                this.y.put(Long.valueOf(vm7Var.d), vm7Var);
            }
        }
        ArrayList arrayList3 = this.w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                vm7 vm7Var2 = (vm7) this.w.get(i3);
                this.y.put(Long.valueOf(vm7Var2.d), vm7Var2);
            }
        }
        if (z) {
            n0();
        }
    }

    public static boolean c0(int i, long j) {
        SharedPreferences sharedPreferences = na7.q1(i).W3;
        StringBuilder sb = new StringBuilder("stories_");
        sb.append(j);
        return sharedPreferences.contains(sb.toString()) ? ls6.v("stories_", j, sharedPreferences, true) : sharedPreferences.contains("EnableAllStories") ? sharedPreferences.getBoolean("EnableAllStories", true) : i0(i, j);
    }

    public static boolean i0(int i, long j) {
        ArrayList arrayList = new ArrayList(hq6.d0(i).j1);
        Collections.sort(arrayList, Comparator$-CC.comparingDouble(new mm7((byte) 0)));
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (cf3.n(((TLRPC.TL_topPeer) arrayList.get(i3)).peer) == j) {
                i2 = i3;
            }
        }
        return i2 >= 0 && i2 >= arrayList.size() + (-5);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.f = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        pha phaVar = this.simpleActionBar;
        if (this.s == -1) {
            phaVar.setTitle(k96.M0(2131747719, "NotificationsExceptions"));
        } else {
            phaVar.setTitle(k96.M0(2131747731, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 11));
        ArrayList arrayList = this.x;
        if (arrayList != null && !arrayList.isEmpty()) {
            xha a = this.simpleActionBar.t().a(0, R.drawable.outline_header_search);
            a.N();
            a.C0 = new q10(this, (byte) 17);
            a.setSearchFieldHint(k96.M0(2131745644, "Search"));
        }
        this.d = new sm7(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.c = g24Var;
        g24Var.setTextSize(18);
        this.c.setText(k96.M0(2131748019, "NoExceptions"));
        this.c.c();
        o39 o39Var = new o39(context, null);
        this.a = o39Var;
        o39Var.r1();
        this.a.setEmptyView(this.c);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new t26(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        frameLayout.addView(this.c, nme.c(-1.0f, -1));
        o39 o39Var2 = this.a;
        p61 p61Var = new p61(this, context, b);
        this.b = p61Var;
        o39Var2.setAdapter(p61Var);
        this.a.setOnItemClickListener(new dx6((Object) this, (Object) context, (byte) 5));
        om7 om7Var = new om7(this);
        om7Var.c = (short) 150;
        om7Var.e = (short) 350;
        om7Var.f = (short) 0;
        om7Var.g = (short) 0;
        om7Var.d = (short) 0;
        om7Var.C = false;
        om7Var.i = new OvershootInterpolator(1.1f);
        om7Var.o = s33.h;
        om7Var.m = false;
        this.a.setItemAnimator(om7Var);
        this.a.setOnScrollListener(new ao2(this, (byte) 29));
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0() {
        boolean v;
        qm7 qm7Var;
        int i;
        int i2;
        ArrayList arrayList;
        boolean isEmpty = this.x.isEmpty();
        int i3 = this.s;
        if (isEmpty || i3 == 3) {
            int childCount = this.a.getChildCount();
            ArrayList arrayList2 = new ArrayList();
            if (i3 == 3) {
                Boolean bool = this.n;
                v = bool == null || bool.booleanValue() || !((arrayList = this.x) == null || arrayList.isEmpty());
            } else {
                v = getNotificationsController().v(i3);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.a.getChildAt(i4);
                y29 y29Var = (y29) this.a.T(childAt);
                this.a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList3 = this.J;
                    if (R < arrayList3.size()) {
                        qm7Var = (qm7) arrayList3.get(R);
                        boolean z = (qm7Var == null && ((i2 = qm7Var.c) == 102 || i2 == 101 || i2 == 100)) ? true : v;
                        i = y29Var.f;
                        View view = y29Var.a;
                        if (i != 0) {
                            ((ld5) view).a(arrayList2, z);
                        } else if (i == 1) {
                            ((ahb) view).e(arrayList2, z);
                        } else if (i == 3) {
                            ((chb) view).a(arrayList2, z);
                        } else if (i == 5) {
                            ((uib) view).a(arrayList2, z);
                        }
                    }
                }
                qm7Var = null;
                if (qm7Var == null) {
                }
                i = y29Var.f;
                View view2 = y29Var.a;
                if (i != 0) {
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
            this.e.addListener(new v85(this, (byte) 20));
            this.e.setDuration(150L);
            this.e.start();
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.e0) {
            if (i == kk7.R0) {
                n0();
            }
        } else {
            p61 p61Var = this.b;
            if (p61Var != null) {
                p61Var.f();
            }
        }
    }

    public final void e0(vm7 vm7Var, View view) {
        String p = im7.p(vm7Var.d, 0L, false);
        getNotificationsSettings().edit().remove("stories_" + p).commit();
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            arrayList.remove(vm7Var);
        }
        ArrayList arrayList2 = this.x;
        if (arrayList2 != null) {
            arrayList2.remove(vm7Var);
        }
        if (i0(this.currentAccount, vm7Var.d)) {
            vm7Var.f = true;
            vm7Var.c = 0;
            this.w.add(vm7Var);
        }
        if (view instanceof v6c) {
            v6c v6cVar = (v6c) view;
            v6cVar.f(vm7Var, null, v6cVar.T);
        }
        getNotificationsController().c0(vm7Var.d, 0L, false);
        p0(true);
    }

    public final int f0() {
        int i = -16776961;
        int i2 = this.s;
        if (i2 == 0) {
            i = getNotificationsSettings().getInt("GroupLed", -16776961);
        } else if (i2 == 1) {
            i = getNotificationsSettings().getInt("MessagesLed", -16776961);
        } else if (i2 == 2) {
            i = getNotificationsSettings().getInt("ChannelLed", -16776961);
        } else if (i2 == 3) {
            i = getNotificationsSettings().getInt("StoriesLed", -16776961);
        } else if (i2 == 4 || i2 == 5) {
            i = getNotificationsSettings().getInt("ReactionsLed", -16776961);
        }
        for (int i3 = 0; i3 < 9; i3++) {
            if (chb.f[i3] == i) {
                return chb.e[i3];
            }
        }
        return i;
    }

    public final String g0() {
        int i = this.s;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : getNotificationsSettings().getInt("popupChannel", 0) : getNotificationsSettings().getInt("popupAll", 0) : getNotificationsSettings().getInt("popupGroup", 0);
        int[] iArr = this.F;
        return k96.M0(iArr[Utilities.j(i2, iArr.length - 1, 0)], null);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        o92 o92Var = new o92(this, (byte) 5);
        arrayList.add(new blb(this.a, 16, new Class[]{ld5.class, ahb.class, chb.class, uib.class, v6c.class, vl7.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        int i = bkb.L6;
        arrayList.add(new blb(this.a, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.M6;
        arrayList.add(new blb(this.a, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.a, 0, new Class[]{v6c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, o92Var, bkb.m6));
        arrayList.add(new blb(this.a, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.a, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.t6));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.o7));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.u6));
        return arrayList;
    }

    public final String h0() {
        int i = this.s;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? (i == 4 || i == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1 : getNotificationsSettings().getInt("priority_stories", 1) : getNotificationsSettings().getInt("priority_channel", 1) : getNotificationsSettings().getInt("priority_messages", 1) : getNotificationsSettings().getInt("priority_group", 1);
        int[] iArr = this.G;
        return k96.M0(iArr[Utilities.j(i2, iArr.length - 1, 0)], null);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(Context context, View view, int i, float f, float f2) {
        qm7 qm7Var;
        int i2;
        w39 adapter;
        sm7 sm7Var;
        vm7 vm7Var;
        ArrayList arrayList;
        boolean z;
        vm7 vm7Var2;
        boolean z2;
        boolean z3;
        ArrayList arrayList2;
        boolean z4;
        Drawable drawable;
        final ArrayList arrayList3;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        vm7 vm7Var3;
        boolean z8;
        vm7 vm7Var4;
        if (getParentActivity() == null) {
            return;
        }
        if (this.a.getAdapter() == this.b && i >= 0) {
            ArrayList arrayList4 = this.J;
            if (i < arrayList4.size()) {
                qm7Var = (qm7) arrayList4.get(i);
                boolean z9 = true;
                if (qm7Var == null && qm7Var.a == 8) {
                    this.H = !this.H;
                    p0(true);
                    return;
                }
                byte b = 3;
                i2 = this.s;
                if (i2 != 3 && qm7Var != null && (vm7Var4 = qm7Var.g) != null) {
                    cs5 I = cs5.I(this, view);
                    I.i = (byte) 3;
                    I.l(R.drawable.msg_mute, new jm7(this, vm7Var4, view, i, (byte) 5), k96.M0(2131747671, null), vm7Var4.c <= 0 || vm7Var4.f, false);
                    I.l(R.drawable.msg_unmute, new jm7(this, vm7Var4, view, i, (byte) 0), k96.M0(2131747668, null), vm7Var4.c > 0 || vm7Var4.f, false);
                    I.l(R.drawable.msg_delete, new jm7(this, vm7Var4, view, i, (byte) 1), k96.M0(2131751530, "DeleteException"), !vm7Var4.f, true);
                    I.X(this.a.V0(view, false));
                    I.a0();
                    return;
                }
                HashMap hashMap = this.y;
                if (i2 == 3) {
                    w39 adapter2 = this.a.getAdapter();
                    sm7 sm7Var2 = this.d;
                    if (adapter2 == sm7Var2) {
                        Object E = sm7Var2.E(i);
                        if (E instanceof vm7) {
                            vm7Var3 = (vm7) E;
                        } else {
                            boolean z10 = E instanceof TLRPC.User;
                            long j = z10 ? ((TLRPC.User) E).id : -((TLRPC.Chat) E).id;
                            if (!hashMap.containsKey(Long.valueOf(j))) {
                                vm7 vm7Var5 = new vm7();
                                vm7Var5.e = true;
                                vm7Var5.d = j;
                                if (z10) {
                                    vm7Var5.d = ((TLRPC.User) E).id;
                                } else {
                                    vm7Var5.d = -((TLRPC.Chat) E).id;
                                }
                                vm7Var3 = vm7Var5;
                                z8 = true;
                                if (vm7Var3 == null) {
                                    cs5 I2 = cs5.I(this, view);
                                    I2.i = (byte) 3;
                                    vm7 vm7Var6 = vm7Var3;
                                    I2.l(R.drawable.msg_mute, new jm7(this, vm7Var6, view, z8, (byte) 2), k96.M0(2131747671, null), vm7Var3.c <= 0 || vm7Var3.f, false);
                                    I2.l(R.drawable.msg_unmute, new jm7(this, vm7Var6, view, z8, (byte) 3), k96.M0(2131747668, null), vm7Var6.c > 0 || vm7Var6.f, false);
                                    I2.l(R.drawable.msg_delete, new jm7(this, vm7Var6, view, i, (byte) 4), k96.M0(2131751530, "DeleteException"), (z8 || vm7Var6.f) ? false : true, true);
                                    I2.X(this.a.V0(view, false));
                                    I2.a0();
                                    return;
                                }
                                return;
                            }
                            vm7Var3 = (vm7) hashMap.get(Long.valueOf(j));
                        }
                        z8 = false;
                        if (vm7Var3 == null) {
                        }
                    }
                }
                if (this.a.getAdapter() != this.d) {
                    if (qm7Var == null) {
                        return;
                    }
                    if (qm7Var.g == null) {
                        int i4 = qm7Var.c;
                        if (i4 == 6) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("onlySelect", true);
                            bundle.putBoolean("checkCanWrite", false);
                            if (i2 == 0) {
                                bundle.putInt("dialogsType", 6);
                            } else if (i2 == 2) {
                                bundle.putInt("dialogsType", 5);
                            } else {
                                bundle.putInt("dialogsType", 4);
                            }
                            cj3 cj3Var = new cj3(bundle);
                            cj3Var.E2 = new km7(this);
                            presentFragment(cj3Var);
                            return;
                        }
                        if (i4 == 7) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                            String M0 = k96.M0(2131747720, "NotificationsDeleteAllExceptionTitle");
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            hdVar.U = k96.M0(2131747721, "NotificationsDeleteAllExceptionAlert");
                            alertDialog$Builder.j(k96.M0(2131751586, "Delete"), new km7(this));
                            alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                            showDialog(hdVar);
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, null);
                                return;
                            }
                            return;
                        }
                        if (i4 == 100 || i4 == 101) {
                            boolean z11 = false;
                            boolean v = getNotificationsController().v(i2);
                            this.a.K(i);
                            final int i5 = this.s;
                            if (i5 == 3) {
                                SharedPreferences.Editor edit = getNotificationsSettings().edit();
                                Boolean bool = this.n;
                                boolean z12 = bool != null && bool.booleanValue();
                                if (this.r && z12) {
                                    edit.remove("EnableAllStories");
                                    this.n = null;
                                } else {
                                    boolean z13 = !z12;
                                    edit.putBoolean("EnableAllStories", z13);
                                    this.n = Boolean.valueOf(z13);
                                }
                                edit.apply();
                                getNotificationsController().b0(i2);
                                p0(true);
                                boolean z14 = this.h;
                                if (z14 != (this.n == null) && this.a != null && this.b != null) {
                                    this.h = !z14;
                                    p0(true);
                                }
                                d0();
                                return;
                            }
                            if (!v) {
                                getNotificationsController().U(i2, 0);
                                p0(true);
                                return;
                            }
                            ArrayList arrayList5 = this.x;
                            ArrayList arrayList6 = this.w;
                            final int i6 = this.currentAccount;
                            final re1 re1Var = new re1(this, b);
                            Pattern pattern = ij.a;
                            if (getParentActivity() != null) {
                                boolean x = im7.n(i6).x(0L, null, false, false);
                                String[] strArr = {k96.M0(2131747664, null), k96.a0("MuteFor", null, 2131748120, k96.G(1, "Hours", new Object[0])), k96.a0("MuteFor", null, 2131748120, k96.G(2, "Days", new Object[0])), null, k96.M0(2131747665, null)};
                                int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
                                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                                linearLayout.setOrientation(1);
                                final AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                                int i7 = 0;
                                while (i7 < 5) {
                                    if (strArr[i7] == null) {
                                        boolean z15 = x;
                                        arrayList3 = arrayList5;
                                        z5 = z15;
                                        z4 = z11;
                                        i3 = i5;
                                    } else {
                                        TextView textView2 = new TextView(getParentActivity());
                                        Drawable drawable2 = getParentActivity().getResources().getDrawable(iArr[i7]);
                                        if (i7 == 4) {
                                            z4 = z11;
                                            drawable = null;
                                            zkb.X(textView2, bkb.p7, null);
                                            arrayList2 = arrayList5;
                                            zkb.x(textView2, drawable2, bkb.o7, null, PorterDuff.Mode.MULTIPLY);
                                        } else {
                                            arrayList2 = arrayList5;
                                            z4 = z11;
                                            drawable = null;
                                            zkb.X(textView2, bkb.i5, null);
                                            zkb.x(textView2, drawable2, bkb.I5, null, PorterDuff.Mode.MULTIPLY);
                                        }
                                        ug8.w(textView2, 1, 16.0f, 1, 1);
                                        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, drawable, drawable);
                                        textView2.setTag(Integer.valueOf(i7));
                                        textView2.setBackgroundDrawable(bkb.L0(z4));
                                        int L = gl.L(24.0f);
                                        int L2 = gl.L(24.0f);
                                        int i8 = z4 ? 1 : 0;
                                        textView2.setPadding(L, i8, L2, i8);
                                        textView2.setSingleLine(true);
                                        textView2.setGravity(19);
                                        textView2.setCompoundDrawablePadding(gl.L(26.0f));
                                        textView2.setText(strArr[i7]);
                                        linearLayout.addView(textView2, nme.r(-1, 48, 51));
                                        final ArrayList arrayList7 = arrayList6;
                                        final boolean z16 = x;
                                        arrayList3 = arrayList2;
                                        View.OnClickListener onClickListener = new View.OnClickListener(i6, z16, i5, this, arrayList3, arrayList7, re1Var, alertDialog$Builder2) { // from class: qg
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ int b;
                                            public final /* synthetic */ NotificationsCustomSettingsActivity c;
                                            public final /* synthetic */ ArrayList d;
                                            public final /* synthetic */ ArrayList e;
                                            public final /* synthetic */ re1 f;
                                            public final /* synthetic */ AlertDialog$Builder h;

                                            {
                                                this.b = i5;
                                                this.c = this;
                                                this.d = arrayList3;
                                                this.e = arrayList7;
                                                this.f = re1Var;
                                                this.h = alertDialog$Builder2;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                int i9;
                                                int intValue = ((Integer) view2.getTag()).intValue();
                                                int i10 = this.a;
                                                int i11 = this.b;
                                                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.c;
                                                int i12 = 3;
                                                if (intValue == 0) {
                                                    im7.n(i10).U(i11, 0);
                                                } else if (intValue == 3) {
                                                    notificationsCustomSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(i11, this.d, this.e, false));
                                                } else {
                                                    int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                                                    if (intValue == 1) {
                                                        currentTime += 3600;
                                                    } else if (intValue == 2) {
                                                        currentTime += 172800;
                                                    } else if (intValue == 4) {
                                                        i9 = Integer.MAX_VALUE;
                                                        im7.n(i10).H(0L, i9, 0L);
                                                        im7.n(i10).U(i11, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                    }
                                                    i9 = currentTime;
                                                    im7.n(i10).H(0L, i9, 0L);
                                                    im7.n(i10).U(i11, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                }
                                                this.f.a(intValue);
                                                this.h.a.M0.run();
                                                if (intValue == 0) {
                                                    i12 = 4;
                                                } else if (intValue == 1) {
                                                    i12 = 0;
                                                } else if (intValue == 2) {
                                                    i12 = 2;
                                                } else if (intValue != 4) {
                                                    i12 = -1;
                                                }
                                                if (i12 < 0 || !u21.a(notificationsCustomSettingsActivity)) {
                                                    return;
                                                }
                                                u21.z(notificationsCustomSettingsActivity, i12, 0, null).j();
                                            }
                                        };
                                        i3 = i5;
                                        z5 = z16;
                                        arrayList6 = arrayList7;
                                        textView2.setOnClickListener(onClickListener);
                                    }
                                    i7++;
                                    ArrayList arrayList8 = arrayList3;
                                    x = z5;
                                    arrayList5 = arrayList8;
                                    i5 = i3;
                                    z11 = z4;
                                }
                                String M02 = k96.M0(2131747731, null);
                                hd hdVar2 = alertDialog$Builder2.a;
                                hdVar2.S = M02;
                                alertDialog$Builder2.n(linearLayout);
                                showDialog(hdVar2);
                                return;
                            }
                            return;
                        }
                        if (i4 == 3) {
                            if (view.isEnabled()) {
                                try {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, i2);
                                    presentFragment(new an7(bundle2, getResourceProvider()));
                                    return;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                            }
                            return;
                        }
                        if (qm7Var.a == 3) {
                            if (view.isEnabled()) {
                                showDialog(ij.t(getParentActivity(), 0L, 0L, this.s, new lm7(this, view, i, (byte) 0), null));
                                return;
                            }
                            return;
                        }
                        float f3 = 4.0f;
                        if (i4 == 2) {
                            if (view.isEnabled()) {
                                Activity parentActivity = getParentActivity();
                                lm7 lm7Var = new lm7(this, view, i, (byte) 1);
                                Pattern pattern2 = ij.a;
                                SharedPreferences sharedPreferences = na7.q1(y6c.t0).W3;
                                int[] iArr2 = new int[1];
                                if (i2 == 1) {
                                    iArr2[0] = sharedPreferences.getInt("popupAll", 0);
                                } else if (i2 == 0) {
                                    iArr2[0] = sharedPreferences.getInt("popupGroup", 0);
                                } else {
                                    iArr2[0] = sharedPreferences.getInt("popupChannel", 0);
                                }
                                String[] strArr2 = {k96.M0(2131747985, null), k96.M0(2131747625, null), k96.M0(2131747626, null), k96.M0(2131754263, null)};
                                LinearLayout m = ir2.m(parentActivity, 1);
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity);
                                int i9 = 0;
                                for (int i10 = 4; i9 < i10; i10 = 4) {
                                    wy8 wy8Var = new wy8(parentActivity, null);
                                    wy8Var.setTag(Integer.valueOf(i9));
                                    float f4 = f3;
                                    wy8Var.setPadding(gl.L(f3), 0, gl.L(f4), 0);
                                    ij.a(wy8Var, bkb.f7, bkb.D5, null);
                                    wy8Var.b(strArr2[i9], iArr2[0] == i9);
                                    m.addView(wy8Var);
                                    wy8Var.setOnClickListener(new pg((Object) iArr2, i2, (Object) alertDialog$Builder3, (Object) lm7Var, (byte) 0));
                                    i9++;
                                    f3 = f4;
                                }
                                String M03 = k96.M0(2131746905, null);
                                hd hdVar3 = alertDialog$Builder3.a;
                                hdVar3.S = M03;
                                alertDialog$Builder3.n(m);
                                alertDialog$Builder3.j(k96.M0(2131752577, null), null);
                                showDialog(hdVar3);
                                return;
                            }
                            return;
                        }
                        if (i4 == 1) {
                            if (view.isEnabled()) {
                                String str = i2 == 1 ? "vibrate_messages" : i2 == 0 ? "vibrate_group" : i2 == 3 ? "vibrate_stories" : (i2 == 4 || i2 == 5) ? "vibrate_react" : "vibrate_channel";
                                showDialog(ij.V(getParentActivity(), 0L, 0L, str, new q76((Object) this, (Object) view, (Object) str, i, (byte) 12), null));
                                return;
                            }
                            return;
                        }
                        if (i4 == 4) {
                            if (view.isEnabled()) {
                                showDialog(ij.F(getParentActivity(), 0L, 0L, this.s, new lm7(this, view, i, (byte) 2), null));
                                return;
                            }
                            return;
                        }
                        if (i4 == 102) {
                            if (view.isEnabled()) {
                                SharedPreferences notificationsSettings = getNotificationsSettings();
                                if (notificationsSettings.getBoolean("EnableAllStories", false)) {
                                    return;
                                }
                                SharedPreferences.Editor edit2 = notificationsSettings.edit();
                                if (this.n != null) {
                                    edit2.remove("EnableAllStories");
                                    this.n = null;
                                    this.r = true;
                                    qm7Var.i = true;
                                    z7 = true;
                                } else {
                                    edit2.putBoolean("EnableAllStories", false);
                                    this.n = Boolean.FALSE;
                                    this.r = false;
                                    qm7Var.i = false;
                                    z7 = false;
                                }
                                if (view instanceof ahb) {
                                    ((ahb) view).setChecked(z7);
                                }
                                edit2.commit();
                                boolean z17 = this.r;
                                boolean z18 = this.h;
                                if (z17 != z18 && this.a != null && this.b != null) {
                                    this.h = !z18;
                                    p0(true);
                                }
                                getNotificationsController().b0(i2);
                                d0();
                                return;
                            }
                            return;
                        }
                        if (i4 == 0) {
                            if (view.isEnabled()) {
                                SharedPreferences notificationsSettings2 = getNotificationsSettings();
                                SharedPreferences.Editor edit3 = notificationsSettings2.edit();
                                if (i2 == 1) {
                                    z6 = notificationsSettings2.getBoolean("EnablePreviewAll", true);
                                    edit3.putBoolean("EnablePreviewAll", !z6);
                                } else if (i2 == 0) {
                                    z6 = notificationsSettings2.getBoolean("EnablePreviewGroup", true);
                                    edit3.putBoolean("EnablePreviewGroup", !z6);
                                } else if (i2 == 3) {
                                    z6 = !notificationsSettings2.getBoolean("EnableHideStoriesSenders", false);
                                    edit3.putBoolean("EnableHideStoriesSenders", z6);
                                } else if (i2 == 4 || i2 == 5) {
                                    z6 = notificationsSettings2.getBoolean("EnableReactionsPreview", true);
                                    edit3.putBoolean("EnableReactionsPreview", !z6);
                                } else {
                                    z6 = notificationsSettings2.getBoolean("EnablePreviewChannel", true);
                                    edit3.putBoolean("EnablePreviewChannel", !z6);
                                }
                                edit3.commit();
                                getNotificationsController().b0(i2);
                                if (view instanceof ahb) {
                                    ((ahb) view).setChecked(!z6);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (i4 == 103 || i4 == 104) {
                            Object[] objArr = !k96.a0 ? f <= ((float) (view.getMeasuredWidth() - gl.L(76.0f))) : f >= ((float) gl.L(76.0f));
                            SharedPreferences notificationsSettings3 = getNotificationsSettings();
                            int i11 = qm7Var.c;
                            if (objArr == true) {
                                String str2 = i11 == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                                SharedPreferences.Editor edit4 = notificationsSettings3.edit();
                                edit4.putBoolean(str2, !notificationsSettings3.getBoolean(str2, true));
                                edit4.apply();
                                p0(true);
                                getNotificationsController().b0(i2);
                                return;
                            }
                            String str3 = i11 == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
                            LinearLayout j2 = de9.j(context, 1);
                            boolean[] zArr = {notificationsSettings3.getBoolean(str3, false)};
                            wy8[] wy8VarArr = new wy8[2];
                            int i12 = 0;
                            while (i12 < 2) {
                                wy8 wy8Var2 = new wy8(context, getResourceProvider());
                                wy8VarArr[i12] = wy8Var2;
                                wy8Var2.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                                wy8VarArr[i12].a(bkb.w0(null, bkb.f7, false), bkb.w0(null, bkb.D5, false));
                                wy8VarArr[i12].b(k96.M0(i12 == 0 ? 2131747656 : 2131747657, null), i12 == 0 ? !zArr[0] ? z9 : false : zArr[0]);
                                wy8 wy8Var3 = wy8VarArr[i12];
                                int i13 = bkb.h6;
                                zkb.R(wy8Var3, bkb.f0(bkb.w0(null, i13, false), 2, -1), null, zkb.M(i13), null);
                                j2.addView(wy8VarArr[i12]);
                                wy8VarArr[i12].setOnClickListener(new wg((Object) zArr, i12, (Object) wy8VarArr, (byte) 10));
                                i12++;
                                z9 = z9;
                            }
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                            String M04 = k96.M0(2131747658, null);
                            hd hdVar4 = alertDialog$Builder4.a;
                            hdVar4.S = M04;
                            alertDialog$Builder4.n(j2);
                            alertDialog$Builder4.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder4.j(k96.M0(2131745754, null), new lt((Object) this, (Object) notificationsSettings3, (Object) zArr, str3, (byte) 16));
                            showDialog(hdVar4);
                            return;
                        }
                        return;
                    }
                }
                adapter = this.a.getAdapter();
                sm7Var = this.d;
                if (adapter != sm7Var) {
                    Object E2 = sm7Var.E(i);
                    if (E2 instanceof vm7) {
                        arrayList = this.d.d;
                        vm7Var = (vm7) E2;
                        z3 = false;
                    } else {
                        boolean z19 = E2 instanceof TLRPC.User;
                        long j3 = z19 ? ((TLRPC.User) E2).id : -((TLRPC.Chat) E2).id;
                        if (hashMap.containsKey(Long.valueOf(j3))) {
                            vm7Var = (vm7) hashMap.get(Long.valueOf(j3));
                            z2 = false;
                        } else {
                            vm7 vm7Var7 = new vm7();
                            vm7Var7.d = j3;
                            if (z19) {
                                vm7Var7.d = ((TLRPC.User) E2).id;
                            } else {
                                vm7Var7.d = -((TLRPC.Chat) E2).id;
                            }
                            vm7Var = vm7Var7;
                            z2 = true;
                        }
                        arrayList = this.x;
                        z3 = z2;
                    }
                    z = z3;
                } else {
                    vm7Var = qm7Var.g;
                    if (vm7Var.f) {
                        return;
                    }
                    arrayList = this.x;
                    z = false;
                }
                vm7Var2 = vm7Var;
                ArrayList arrayList9 = arrayList;
                if (vm7Var2 != null) {
                    return;
                }
                long j4 = vm7Var2.d;
                yb2 yb2Var = new yb2(context, this.currentAccount, null, true, new nm7(this, j4, im7.n(this.currentAccount).x(j4, null, false, false), vm7Var2, z, i, arrayList9), getResourceProvider());
                yb2Var.e(j4, 0L, null);
                yb2Var.d(this, view, f, f2, false);
                return;
            }
        }
        qm7Var = null;
        boolean z92 = true;
        if (qm7Var == null) {
        }
        byte b2 = 3;
        i2 = this.s;
        if (i2 != 3) {
        }
        HashMap hashMap2 = this.y;
        if (i2 == 3) {
        }
        if (this.a.getAdapter() != this.d) {
        }
        adapter = this.a.getAdapter();
        sm7Var = this.d;
        if (adapter != sm7Var) {
        }
        vm7Var2 = vm7Var;
        ArrayList arrayList92 = arrayList;
        if (vm7Var2 != null) {
        }
    }

    public final void k0(vm7 vm7Var, View view) {
        this.simpleActionBar.n(true);
        o0(vm7Var, view, true);
    }

    public final void l0(vm7 vm7Var, View view) {
        this.simpleActionBar.n(true);
        o0(vm7Var, view, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:89|(2:103|104)(2:91|(1:93)(2:102|99))|94|95|96|97|98|99) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029c, code lost:
    
        if (r11.deleted != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0385 A[LOOP:5: B:190:0x0383->B:191:0x0385, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(ArrayList arrayList) {
        boolean z;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i;
        boolean z2;
        int size;
        int i2;
        int size2;
        int i3;
        int size3;
        int i4;
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
        long j = getUserConfig().n;
        SharedPreferences notificationsSettings = getNotificationsSettings();
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
                if (longValue2 == 0 || longValue2 == j) {
                    arrayList10 = arrayList21;
                    arrayList7 = arrayList23;
                } else {
                    arrayList7 = arrayList23;
                    vm7 vm7Var = new vm7();
                    vm7Var.d = longValue2;
                    arrayList10 = arrayList21;
                    ArrayList arrayList24 = arrayList12;
                    vm7Var.b = ls6.v("custom_", longValue2, notificationsSettings, false);
                    int intValue = ((Integer) next.getValue()).intValue();
                    vm7Var.c = intValue;
                    if (intValue != 0) {
                        Integer num = (Integer) all.get("notifyuntil_" + replace);
                        if (num != null) {
                            vm7Var.a = num.intValue();
                        }
                    }
                    if (cf3.B(longValue2)) {
                        int i5 = (int) (4294967295L & longValue2);
                        TLRPC.EncryptedChat Y0 = getMessagesController().Y0(Integer.valueOf(i5));
                        if (Y0 == null) {
                            arrayList18.add(Integer.valueOf(i5));
                            longSparseArray.put(longValue2, vm7Var);
                        } else {
                            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(Y0.user_id));
                            if (V1 == null) {
                                arrayList16.add(Long.valueOf(Y0.user_id));
                                longSparseArray.put(Y0.user_id, vm7Var);
                            } else if (V1.deleted) {
                                it = it2;
                                arrayList20 = arrayList22;
                                arrayList19 = arrayList9;
                                arrayList14 = arrayList8;
                                arrayList13 = arrayList7;
                                arrayList21 = arrayList10;
                                arrayList12 = arrayList24;
                            }
                        }
                        arrayList11.add(vm7Var);
                        arrayList12 = arrayList24;
                    } else if (cf3.D(longValue2)) {
                        TLRPC.User V12 = getMessagesController().V1(A2);
                        if (V12 == null) {
                            arrayList16.add(A2);
                            longSparseArray.put(longValue2, vm7Var);
                        } else if (V12.deleted) {
                            it = it2;
                            arrayList20 = arrayList22;
                            arrayList19 = arrayList9;
                            arrayList14 = arrayList8;
                            arrayList13 = arrayList7;
                            arrayList21 = arrayList10;
                            arrayList12 = arrayList24;
                        }
                        arrayList11.add(vm7Var);
                        arrayList12 = arrayList24;
                    } else {
                        long j2 = -longValue2;
                        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j2));
                        if (K0 == null) {
                            arrayList17.add(Long.valueOf(j2));
                            longSparseArray.put(longValue2, vm7Var);
                        } else if (!K0.left && !K0.kicked && K0.migrated_to == null) {
                            if (!hc2.T(K0) || K0.megagroup) {
                                arrayList12 = arrayList24;
                                arrayList12.add(vm7Var);
                            } else {
                                arrayList15.add(vm7Var);
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
            z = true;
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
                if (longValue != 0 && longValue != j) {
                    vm7 vm7Var2 = new vm7();
                    vm7Var2.d = longValue;
                    vm7Var2.e = true;
                    vm7Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (cf3.D(longValue)) {
                        TLRPC.User V13 = getMessagesController().V1(A);
                        if (V13 == null) {
                            arrayList16.add(A);
                            longSparseArray.put(longValue, vm7Var2);
                        } else if (!V13.deleted) {
                        }
                        arrayList6 = arrayList25;
                        arrayList6.add(vm7Var2);
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
            Collections.sort(arrayList, Comparator$-CC.comparingDouble(new mm7((byte) 1)));
            int max = Math.max(0, arrayList.size() - 6);
            while (max < arrayList.size()) {
                long n = cf3.n(((TLRPC.TL_topPeer) arrayList.get(max)).peer);
                if (!hashSet.contains(Long.valueOf(n))) {
                    vm7 vm7Var3 = new vm7();
                    vm7Var3.d = n;
                    vm7Var3.e = z;
                    vm7Var3.c = 0;
                    vm7Var3.f = z;
                    if (cf3.D(n)) {
                        TLRPC.User V14 = getMessagesController().V1(Long.valueOf(n));
                        if (V14 == null) {
                            arrayList16.add(Long.valueOf(n));
                            longSparseArray.put(n, vm7Var3);
                        }
                        arrayList5 = arrayList26;
                        arrayList5.add(0, vm7Var3);
                        hashSet.add(Long.valueOf(n));
                        max++;
                        arrayList26 = arrayList5;
                        z = true;
                    }
                }
                arrayList5 = arrayList26;
                max++;
                arrayList26 = arrayList5;
                z = true;
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
                            getMessagesStorage().T(TextUtils.join(",", arrayList18), arrayList4, arrayList16);
                        } catch (Exception e) {
                            e = e;
                            arrayList2 = arrayList28;
                            arrayList3 = arrayList27;
                            z2 = true;
                            i = 0;
                            fa4.g(e, z2);
                            size = arrayList2.size();
                            while (i2 < size) {
                            }
                            size2 = arrayList3.size();
                            while (i3 < size2) {
                            }
                            size3 = arrayList4.size();
                            while (i4 < size3) {
                            }
                            size4 = longSparseArray.size();
                            while (i < size4) {
                            }
                            gl.c3(new r15(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        arrayList4 = arrayList29;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                arrayList2 = arrayList28;
                arrayList3 = arrayList27;
                arrayList4 = arrayList29;
            }
            try {
                if (arrayList16.isEmpty()) {
                    arrayList3 = arrayList27;
                    i = 0;
                } else {
                    try {
                        arrayList3 = arrayList27;
                        i = 0;
                    } catch (Exception e4) {
                        e = e4;
                        arrayList3 = arrayList27;
                        i = 0;
                        arrayList2 = arrayList28;
                        z2 = true;
                        fa4.g(e, z2);
                        size = arrayList2.size();
                        while (i2 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i3 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i4 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i < size4) {
                        }
                        gl.c3(new r15(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
                    }
                    try {
                        getMessagesStorage().k0(arrayList16, arrayList3, false);
                    } catch (Exception e5) {
                        e = e5;
                        arrayList2 = arrayList28;
                        z2 = true;
                        fa4.g(e, z2);
                        size = arrayList2.size();
                        while (i2 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i3 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i4 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i < size4) {
                        }
                        gl.c3(new r15(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
                    }
                }
                if (arrayList17.isEmpty()) {
                    arrayList2 = arrayList28;
                } else {
                    ad7 messagesStorage = getMessagesStorage();
                    String join = TextUtils.join(",", arrayList17);
                    arrayList2 = arrayList28;
                    try {
                        messagesStorage.P(join, arrayList2);
                    } catch (Exception e6) {
                        e = e6;
                        z2 = true;
                        fa4.g(e, z2);
                        size = arrayList2.size();
                        while (i2 < size) {
                        }
                        size2 = arrayList3.size();
                        while (i3 < size2) {
                        }
                        size3 = arrayList4.size();
                        while (i4 < size3) {
                        }
                        size4 = longSparseArray.size();
                        while (i < size4) {
                        }
                        gl.c3(new r15(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
                    }
                }
            } catch (Exception e7) {
                e = e7;
                arrayList2 = arrayList28;
                arrayList3 = arrayList27;
                i = 0;
                z2 = true;
                fa4.g(e, z2);
                size = arrayList2.size();
                while (i2 < size) {
                }
                size2 = arrayList3.size();
                while (i3 < size2) {
                }
                size3 = arrayList4.size();
                while (i4 < size3) {
                }
                size4 = longSparseArray.size();
                while (i < size4) {
                }
                gl.c3(new r15(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
            }
            size = arrayList2.size();
            for (i2 = i; i2 < size; i2++) {
                TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i2);
                if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                    vm7 vm7Var4 = (vm7) longSparseArray.get(-chat.id);
                    longSparseArray.remove(-chat.id);
                    if (vm7Var4 != null) {
                        if (!hc2.T(chat) || chat.megagroup) {
                            arrayList12.add(vm7Var4);
                        } else {
                            arrayList15.add(vm7Var4);
                        }
                    }
                }
            }
            size2 = arrayList3.size();
            for (i3 = i; i3 < size2; i3++) {
                TLRPC.User user = (TLRPC.User) arrayList3.get(i3);
                if (!user.deleted) {
                    longSparseArray.remove(user.id);
                }
            }
            size3 = arrayList4.size();
            for (i4 = i; i4 < size3; i4++) {
                longSparseArray.remove(cf3.E(((TLRPC.EncryptedChat) arrayList4.get(i4)).id));
            }
            size4 = longSparseArray.size();
            while (i < size4) {
                if (cf3.y(longSparseArray.keyAt(i))) {
                    arrayList12.remove(longSparseArray.valueAt(i));
                    arrayList15.remove(longSparseArray.valueAt(i));
                } else {
                    arrayList11.remove(longSparseArray.valueAt(i));
                }
                i++;
            }
        } else {
            arrayList2 = arrayList28;
            arrayList3 = arrayList27;
            arrayList4 = arrayList29;
        }
        gl.c3(new r15(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
    }

    public final void n0() {
        ArrayList arrayList;
        if (this.s == 3) {
            hq6.d0(this.currentAccount).O0(true);
            arrayList = new ArrayList(hq6.d0(this.currentAccount).j1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().a.c(new bj7(this, arrayList, (byte) 10));
    }

    public final void o0(vm7 vm7Var, View view, boolean z) {
        String p = im7.p(vm7Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean i0 = i0(this.currentAccount, vm7Var.d);
        vm7Var.c = z ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
        if (vm7Var.f) {
            vm7Var.f = false;
            edit.putBoolean(b00.h("stories_", p), !z).commit();
            ArrayList arrayList = this.w;
            if (arrayList != null) {
                arrayList.remove(vm7Var);
            }
            ArrayList arrayList2 = this.x;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.x = arrayList2;
            }
            arrayList2.add(0, vm7Var);
        } else if (i0) {
            edit.putBoolean(b00.h("stories_", p), !z).commit();
        } else {
            Boolean bool = this.n;
            if (!z ? bool == null || !bool.booleanValue() : bool != null && bool.booleanValue()) {
                e0(vm7Var, view);
                return;
            }
            edit.putBoolean(b00.h("stories_", p), !z).commit();
        }
        if (view instanceof v6c) {
            v6c v6cVar = (v6c) view;
            v6cVar.f(vm7Var, null, v6cVar.T);
        }
        getNotificationsController().c0(vm7Var.d, 0L, false);
        p0(true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                str = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? k96.M0(2131745088, "SoundDefault") : ringtone.getTitle(getParentActivity());
                ringtone.stop();
            }
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            int i3 = this.s;
            if (i3 == 1) {
                if (str == null || uri == null) {
                    edit.putString("GlobalSound", "NoSound");
                    edit.putString("GlobalSoundPath", "NoSound");
                } else {
                    edit.putString("GlobalSound", str);
                    edit.putString("GlobalSoundPath", uri.toString());
                }
            } else if (i3 == 0) {
                if (str == null || uri == null) {
                    edit.putString("GroupSound", "NoSound");
                    edit.putString("GroupSoundPath", "NoSound");
                } else {
                    edit.putString("GroupSound", str);
                    edit.putString("GroupSoundPath", uri.toString());
                }
            } else if (i3 == 2) {
                if (str == null || uri == null) {
                    edit.putString("ChannelSound", "NoSound");
                    edit.putString("ChannelSoundPath", "NoSound");
                } else {
                    edit.putString("ChannelSound", str);
                    edit.putString("ChannelSoundPath", uri.toString());
                }
            } else if (i3 == 3) {
                if (str == null || uri == null) {
                    edit.putString("StoriesSound", "NoSound");
                    edit.putString("StoriesSoundPath", "NoSound");
                } else {
                    edit.putString("StoriesSound", str);
                    edit.putString("StoriesSoundPath", uri.toString());
                }
            }
            getNotificationsController().g(i3);
            edit.commit();
            getNotificationsController().b0(i3);
            s49 K = this.a.K(i);
            if (K != null) {
                this.b.t(K, i);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        p0(true);
    }

    @Override // org.telegram.ui.ActionBar.d
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

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, kk7.e0);
        getNotificationCenter().n(this, kk7.R0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        p61 p61Var = this.b;
        if (p61Var != null) {
            p61Var.f();
        }
        getNotificationCenter().b(this, kk7.e0);
        getNotificationCenter().b(this, kk7.R0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            q0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p0(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String string;
        long j;
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
        int i = this.s;
        if (i != -1) {
            String M0 = k96.M0(2131747651, null);
            qm7 qm7Var = new qm7(0, true);
            qm7Var.e = M0;
            arrayList4.add(qm7Var);
            if (i == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(qm7.b(101, k96.M0(2131747646, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    arrayList4.add(qm7.b(kk7.m1, k96.M0(2131747648, null), this.r && ((bool = this.n) == null || !bool.booleanValue())));
                }
                arrayList4.add(qm7.d(-1, k96.M0(2131744481, null)));
            } else if (i == 4 || i == 5) {
                this.messagesRow = arrayList4.size();
                String M02 = k96.M0(2131747647, null);
                String M03 = k96.M0(!notificationsSettings.getBoolean("EnableReactionsMessages", true) ? 2131747653 : notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? 2131747655 : 2131747654, null);
                boolean z2 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                qm7 qm7Var2 = new qm7(6, true);
                qm7Var2.c = kk7.n1;
                qm7Var2.d = R.drawable.msg_markunread;
                qm7Var2.e = M02;
                qm7Var2.f = M03;
                qm7Var2.i = z2;
                arrayList4.add(qm7Var2);
                this.storiesRow = arrayList4.size();
                String M04 = k96.M0(2131747644, null);
                String M05 = k96.M0(!notificationsSettings.getBoolean("EnableReactionsStories", true) ? 2131747653 : notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? 2131747655 : 2131747654, null);
                boolean z3 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                qm7 qm7Var3 = new qm7(6, true);
                qm7Var3.c = kk7.o1;
                qm7Var3.d = R.drawable.msg_stories_saved;
                qm7Var3.e = M04;
                qm7Var3.f = M05;
                qm7Var3.i = z3;
                arrayList4.add(qm7Var3);
                arrayList4.add(qm7.d(-1, null));
            } else {
                int i2 = i == 1 ? 2131747645 : i == 0 ? 2131747649 : 2131747650;
                this.showRow = arrayList4.size();
                arrayList4.add(qm7.b(100, k96.M0(i2, null), getNotificationsController().v(i)));
                arrayList4.add(qm7.d(-1, null));
            }
            String M06 = k96.M0(2131745791, null);
            qm7 qm7Var4 = new qm7(0, true);
            qm7Var4.e = M06;
            arrayList4.add(qm7Var4);
            arrayList4.size();
            if (i == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(qm7.b(0, k96.M0(2131747740, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i == 4 || i == 5) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(qm7.b(0, k96.M0(2131747740, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                boolean z4 = i != 0 ? i != 1 ? i != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true) : notificationsSettings.getBoolean("EnablePreviewAll", true) : notificationsSettings.getBoolean("EnablePreviewGroup", true);
                this.previewRow = arrayList4.size();
                arrayList4.add(qm7.b(0, k96.M0(2131748345, null), z4));
            }
            this.soundRow = arrayList4.size();
            String M07 = k96.M0(2131745091, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String M08 = k96.M0(2131745088, "SoundDefault");
            arrayList = arrayList3;
            if (i == 0) {
                string = notificationsSettings2.getString("GroupSound", M08);
                j = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            } else if (i == 1) {
                string = notificationsSettings2.getString("GlobalSound", M08);
                j = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
            } else if (i == 3) {
                string = notificationsSettings2.getString("StoriesSound", M08);
                j = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
            } else if (i == 4 || i == 5) {
                string = notificationsSettings2.getString("ReactionSound", M08);
                j = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
            } else {
                string = notificationsSettings2.getString("ChannelSound", M08);
                j = notificationsSettings2.getLong("ChannelDocId", 0L);
            }
            long j2 = j;
            if (j2 != 0) {
                TLRPC.Document c = getMediaDataController().A0.c(j2);
                string = c == null ? k96.M0(2131751667, "CustomSound") : an7.f0(c, ba4.B(c));
            } else if (string.equals("NoSound")) {
                string = k96.M0(2131747959, "NoSound");
            } else if (string.equals("Default")) {
                string = k96.M0(2131745088, "SoundDefault");
            }
            arrayList4.add(qm7.c(3, M07, string));
            if (this.H) {
                this.lightColorRow = arrayList4.size();
                String M09 = k96.M0(2131748797, "LedColor");
                int f0 = f0();
                qm7 qm7Var5 = new qm7(3, true);
                qm7Var5.e = M09;
                qm7Var5.h = f0;
                arrayList4.add(qm7Var5);
                int i3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? (i == 4 || i == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0 : notificationsSettings.getInt("vibrate_stories", 0) : notificationsSettings.getInt("vibrate_channel", 0) : notificationsSettings.getInt("vibrate_messages", 0) : notificationsSettings.getInt("vibrate_group", 0);
                this.vibrateRow = arrayList4.size();
                String M010 = k96.M0(2131743375, "Vibrate");
                int[] iArr = this.E;
                arrayList4.add(qm7.c(1, M010, k96.M0(iArr[Utilities.j(i3, iArr.length - 1, 0)], null)));
                if (i == 1 || i == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(qm7.c(2, k96.M0(2131746905, "PopupNotification"), g0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(qm7.c(4, k96.M0(2131747713, "NotificationsImportance"), h0()));
                String M011 = k96.M0(2131747652, null);
                qm7 qm7Var6 = new qm7(8, true);
                qm7Var6.e = M011;
                qm7Var6.d = 0;
                arrayList4.add(qm7Var6);
            } else {
                String M012 = k96.M0(2131747643, null);
                qm7 qm7Var7 = new qm7(8, true);
                qm7Var7.e = M012;
                qm7Var7.d = 1;
                arrayList4.add(qm7Var7);
            }
            arrayList4.size();
            arrayList4.add(qm7.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i != 4 && i != 5) {
            if (i != -1) {
                this.addExceptionRow = arrayList4.size();
                String M013 = k96.M0(2131747730, "NotificationsAddAnException");
                qm7 qm7Var8 = new qm7(7, true);
                qm7Var8.c = 6;
                qm7Var8.d = R.drawable.msg_contact_add;
                qm7Var8.e = M013;
                arrayList4.add(qm7Var8);
            }
            arrayList4.size();
            if (this.w != null && this.h) {
                for (int i4 = 0; i4 < this.w.size(); i4++) {
                    vm7 vm7Var = (vm7) this.w.get(i4);
                    qm7 qm7Var9 = new qm7(2, true);
                    qm7Var9.g = vm7Var;
                    arrayList4.add(qm7Var9);
                }
            }
            if (this.x != null) {
                for (int i5 = 0; i5 < this.x.size(); i5++) {
                    vm7 vm7Var2 = (vm7) this.x.get(i5);
                    qm7 qm7Var10 = new qm7(2, true);
                    qm7Var10.g = vm7Var2;
                    arrayList4.add(qm7Var10);
                }
            }
            arrayList4.size();
            if (i != -1 || ((arrayList2 = this.x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(qm7.d(-3, null));
            }
            ArrayList arrayList5 = this.x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String M014 = k96.M0(2131747722, "NotificationsDeleteAllException");
                qm7 qm7Var11 = new qm7(7, true);
                qm7Var11.c = 7;
                qm7Var11.d = 0;
                qm7Var11.e = M014;
                arrayList4.add(qm7Var11);
            }
        }
        p61 p61Var = this.b;
        if (p61Var != null) {
            if (z) {
                p61Var.E(arrayList, arrayList4);
            } else {
                p61Var.f();
            }
        }
    }

    public final void q0() {
        int hiddenChildCount;
        View W;
        try {
            if (this.a != null) {
                int w0 = bkb.w0(null, bkb.x6, false);
                int w02 = bkb.w0(null, bkb.Yl, false);
                int i = 0;
                while (i < 4) {
                    if (i == 0) {
                        hiddenChildCount = this.a.getChildCount();
                    } else {
                        o39 o39Var = this.a;
                        hiddenChildCount = i == 1 ? o39Var.getHiddenChildCount() : i == 2 ? o39Var.getCachedChildCount() : o39Var.getAttachedScrapChildCount();
                    }
                    for (int i2 = 0; i2 < hiddenChildCount; i2++) {
                        if (i == 0) {
                            W = this.a.getChildAt(i2);
                        } else {
                            o39 o39Var2 = this.a;
                            W = i == 1 ? o39Var2.W(i2) : i == 2 ? o39Var2.P(i2) : o39Var2.O(i2);
                        }
                        if (W instanceof v6c) {
                            v6c v6cVar = (v6c) W;
                            v6cVar.b0 = true;
                            v6cVar.R = w0;
                            v6cVar.S = w02;
                            if (i != 0) {
                                ((v6c) W).i(0);
                            }
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
