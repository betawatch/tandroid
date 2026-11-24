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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class NotificationsCustomSettingsActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public final int[] E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public r59 a;
    public int addExceptionRow;
    public w71 b;
    public r34 c;
    public wo7 d;
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
        this.E = new int[]{2131743300, 2131745100, 2131743299, 2131748480, 2131747554};
        this.F = new int[]{2131747911, 2131747551, 2131747552, 2131754231};
        this.G = new int[]{2131747616, 2131747612, 2131747612, 2131747614, 2131747615, 2131747614};
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
                zo7 zo7Var = (zo7) this.x.get(i2);
                this.y.put(Long.valueOf(zo7Var.d), zo7Var);
            }
        }
        ArrayList arrayList3 = this.w;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zo7 zo7Var2 = (zo7) this.w.get(i3);
                this.y.put(Long.valueOf(zo7Var2.d), zo7Var2);
            }
        }
        if (z) {
            o0();
        }
    }

    public static boolean d0(int i, long j) {
        SharedPreferences sharedPreferences = oc7.r1(i).W3;
        StringBuilder sb = new StringBuilder("stories_");
        sb.append(j);
        return sharedPreferences.contains(sb.toString()) ? kt6.w("stories_", j, sharedPreferences, true) : sharedPreferences.contains("EnableAllStories") ? sharedPreferences.getBoolean("EnableAllStories", true) : j0(i, j);
    }

    public static boolean j0(int i, long j) {
        ArrayList arrayList = new ArrayList(hs6.d0(i).j1);
        Collections.sort(arrayList, Comparator$-CC.comparingDouble(new po7((byte) 0)));
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (pg3.n(((TLRPC.TL_topPeer) arrayList.get(i3)).peer) == j) {
                i2 = i3;
            }
        }
        return i2 >= 0 && i2 >= arrayList.size() + (-5);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        byte b2 = 0;
        this.f = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        rja rjaVar = this.simpleActionBar;
        if (this.s == -1) {
            rjaVar.setTitle(jb6.M0(2131747645, "NotificationsExceptions"));
        } else {
            rjaVar.setTitle(jb6.M0(2131747657, "Notifications"));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 12));
        ArrayList arrayList = this.x;
        if (arrayList != null && !arrayList.isEmpty()) {
            zja a = this.simpleActionBar.t().a(0, R.drawable.outline_header_search);
            a.N();
            a.C0 = new q20(this, (byte) 17);
            a.setSearchFieldHint(jb6.M0(2131745570, "Search"));
        }
        this.d = new wo7(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r34 r34Var = new r34(context, null);
        this.c = r34Var;
        r34Var.setTextSize(18);
        this.c.setText(jb6.M0(2131747945, "NoExceptions"));
        this.c.c();
        r59 r59Var = new r59(context, null);
        this.a = r59Var;
        r59Var.r1();
        this.a.setEmptyView(this.c);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutManager(new u46(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        frameLayout.addView(this.c, qoe.c(-1.0f, -1));
        r59 r59Var2 = this.a;
        w71 w71Var = new w71(this, context, b);
        this.b = w71Var;
        r59Var2.setAdapter(w71Var);
        this.a.setOnItemClickListener(new cz6((Object) this, (Object) context, (byte) 6));
        ro7 ro7Var = new ro7(this);
        ro7Var.c = (short) 150;
        ro7Var.e = (short) 350;
        ro7Var.f = (short) 0;
        ro7Var.g = (short) 0;
        ro7Var.d = (short) 0;
        ro7Var.C = false;
        ro7Var.i = new OvershootInterpolator(1.1f);
        ro7Var.o = d53.h;
        ro7Var.m = false;
        this.a.setItemAnimator(ro7Var);
        this.a.setOnScrollListener(new so7(this, b2));
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != nm7.f0) {
            if (i == nm7.S0) {
                o0();
            }
        } else {
            w71 w71Var = this.b;
            if (w71Var != null) {
                w71Var.f();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0() {
        boolean v;
        uo7 uo7Var;
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
                b59 b59Var = (b59) this.a.T(childAt);
                this.a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList3 = this.J;
                    if (R < arrayList3.size()) {
                        uo7Var = (uo7) arrayList3.get(R);
                        boolean z = (uo7Var == null && ((i2 = uo7Var.c) == 102 || i2 == 101 || i2 == 100)) ? true : v;
                        i = b59Var.f;
                        View view = b59Var.a;
                        if (i != 0) {
                            ((jf5) view).a(arrayList2, z);
                        } else if (i == 1) {
                            ((bjb) view).e(arrayList2, z);
                        } else if (i == 3) {
                            ((djb) view).a(arrayList2, z);
                        } else if (i == 5) {
                            ((vkb) view).a(arrayList2, z);
                        }
                    }
                }
                uo7Var = null;
                if (uo7Var == null) {
                }
                i = b59Var.f;
                View view2 = b59Var.a;
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
            this.e.addListener(new v85(this, (byte) 22));
            this.e.setDuration(150L);
            this.e.start();
        }
    }

    public final void f0(zo7 zo7Var, View view) {
        String p = lo7.p(zo7Var.d, 0L, false);
        getNotificationsSettings().edit().remove("stories_" + p).commit();
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            arrayList.remove(zo7Var);
        }
        ArrayList arrayList2 = this.x;
        if (arrayList2 != null) {
            arrayList2.remove(zo7Var);
        }
        if (j0(this.currentAccount, zo7Var.d)) {
            zo7Var.f = true;
            zo7Var.c = 0;
            this.w.add(zo7Var);
        }
        if (view instanceof w8c) {
            w8c w8cVar = (w8c) view;
            w8cVar.f(zo7Var, null, w8cVar.T);
        }
        getNotificationsController().c0(zo7Var.d, 0L, false);
        q0(true);
    }

    public final int g0() {
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
            if (djb.f[i3] == i) {
                return djb.e[i3];
            }
        }
        return i;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        za2 za2Var = new za2(this, (byte) 5);
        arrayList.add(new cnb(this.a, 16, new Class[]{jf5.class, bjb.class, djb.class, vkb.class, w8c.class, yn7.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        int i = cmb.L6;
        arrayList.add(new cnb(this.a, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.M6;
        arrayList.add(new cnb(this.a, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.a, 0, new Class[]{w8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, za2Var, cmb.m6));
        arrayList.add(new cnb(this.a, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.a, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.t6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.u6));
        return arrayList;
    }

    public final String h0() {
        int i = this.s;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : getNotificationsSettings().getInt("popupChannel", 0) : getNotificationsSettings().getInt("popupAll", 0) : getNotificationsSettings().getInt("popupGroup", 0);
        int[] iArr = this.F;
        return jb6.M0(iArr[Utilities.j(i2, iArr.length - 1, 0)], null);
    }

    public final String i0() {
        int i = this.s;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? (i == 4 || i == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1 : getNotificationsSettings().getInt("priority_stories", 1) : getNotificationsSettings().getInt("priority_channel", 1) : getNotificationsSettings().getInt("priority_messages", 1) : getNotificationsSettings().getInt("priority_group", 1);
        int[] iArr = this.G;
        return jb6.M0(iArr[Utilities.j(i2, iArr.length - 1, 0)], null);
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
    public final void k0(Context context, View view, int i, float f, float f2) {
        uo7 uo7Var;
        int i2;
        y59 adapter;
        wo7 wo7Var;
        zo7 zo7Var;
        ArrayList arrayList;
        boolean z;
        zo7 zo7Var2;
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
        zo7 zo7Var3;
        boolean z8;
        zo7 zo7Var4;
        if (getParentActivity() == null) {
            return;
        }
        if (this.a.getAdapter() == this.b && i >= 0) {
            ArrayList arrayList4 = this.J;
            if (i < arrayList4.size()) {
                uo7Var = (uo7) arrayList4.get(i);
                boolean z9 = true;
                if (uo7Var == null && uo7Var.a == 8) {
                    this.H = !this.H;
                    q0(true);
                    return;
                }
                byte b = 3;
                i2 = this.s;
                if (i2 != 3 && uo7Var != null && (zo7Var4 = uo7Var.g) != null) {
                    bu5 I = bu5.I(this, view);
                    I.i = (byte) 3;
                    I.l(R.drawable.msg_mute, new mo7(this, zo7Var4, view, i, (byte) 5), jb6.M0(2131747597, null), zo7Var4.c <= 0 || zo7Var4.f, false);
                    I.l(R.drawable.msg_unmute, new mo7(this, zo7Var4, view, i, (byte) 0), jb6.M0(2131747594, null), zo7Var4.c > 0 || zo7Var4.f, false);
                    I.l(R.drawable.msg_delete, new mo7(this, zo7Var4, view, i, (byte) 1), jb6.M0(2131751479, "DeleteException"), !zo7Var4.f, true);
                    I.X(this.a.V0(view, false));
                    I.a0();
                    return;
                }
                HashMap hashMap = this.y;
                if (i2 == 3) {
                    y59 adapter2 = this.a.getAdapter();
                    wo7 wo7Var2 = this.d;
                    if (adapter2 == wo7Var2) {
                        Object E = wo7Var2.E(i);
                        if (E instanceof zo7) {
                            zo7Var3 = (zo7) E;
                        } else {
                            boolean z10 = E instanceof TLRPC.User;
                            long j = z10 ? ((TLRPC.User) E).id : -((TLRPC.Chat) E).id;
                            if (!hashMap.containsKey(Long.valueOf(j))) {
                                zo7 zo7Var5 = new zo7();
                                zo7Var5.e = true;
                                zo7Var5.d = j;
                                if (z10) {
                                    zo7Var5.d = ((TLRPC.User) E).id;
                                } else {
                                    zo7Var5.d = -((TLRPC.Chat) E).id;
                                }
                                zo7Var3 = zo7Var5;
                                z8 = true;
                                if (zo7Var3 == null) {
                                    bu5 I2 = bu5.I(this, view);
                                    I2.i = (byte) 3;
                                    zo7 zo7Var6 = zo7Var3;
                                    I2.l(R.drawable.msg_mute, new mo7(this, zo7Var6, view, z8, (byte) 2), jb6.M0(2131747597, null), zo7Var3.c <= 0 || zo7Var3.f, false);
                                    I2.l(R.drawable.msg_unmute, new mo7(this, zo7Var6, view, z8, (byte) 3), jb6.M0(2131747594, null), zo7Var6.c > 0 || zo7Var6.f, false);
                                    I2.l(R.drawable.msg_delete, new mo7(this, zo7Var6, view, i, (byte) 4), jb6.M0(2131751479, "DeleteException"), (z8 || zo7Var6.f) ? false : true, true);
                                    I2.X(this.a.V0(view, false));
                                    I2.a0();
                                    return;
                                }
                                return;
                            }
                            zo7Var3 = (zo7) hashMap.get(Long.valueOf(j));
                        }
                        z8 = false;
                        if (zo7Var3 == null) {
                        }
                    }
                }
                if (this.a.getAdapter() != this.d) {
                    if (uo7Var == null) {
                        return;
                    }
                    if (uo7Var.g == null) {
                        int i4 = uo7Var.c;
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
                            nk3 nk3Var = new nk3(bundle);
                            nk3Var.E2 = new no7(this);
                            presentFragment(nk3Var);
                            return;
                        }
                        if (i4 == 7) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                            String M0 = jb6.M0(2131747646, "NotificationsDeleteAllExceptionTitle");
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            heVar.U = jb6.M0(2131747647, "NotificationsDeleteAllExceptionAlert");
                            alertDialog$Builder.j(jb6.M0(2131751535, "Delete"), new no7(this));
                            alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                            showDialog(heVar);
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, null);
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
                                q0(true);
                                boolean z14 = this.h;
                                if (z14 != (this.n == null) && this.a != null && this.b != null) {
                                    this.h = !z14;
                                    q0(true);
                                }
                                e0();
                                return;
                            }
                            if (!v) {
                                getNotificationsController().U(i2, 0);
                                q0(true);
                                return;
                            }
                            ArrayList arrayList5 = this.x;
                            ArrayList arrayList6 = this.w;
                            final int i6 = this.currentAccount;
                            final zf1 zf1Var = new zf1(this, b);
                            Pattern pattern = ik.a;
                            if (getParentActivity() != null) {
                                boolean x = lo7.n(i6).x(0L, null, false, false);
                                String[] strArr = {jb6.M0(2131747590, null), jb6.a0("MuteFor", null, 2131748069, jb6.G(1, "Hours", new Object[0])), jb6.a0("MuteFor", null, 2131748069, jb6.G(2, "Days", new Object[0])), null, jb6.M0(2131747591, null)};
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
                                            anb.X(textView2, cmb.p7, null);
                                            arrayList2 = arrayList5;
                                            anb.x(textView2, drawable2, cmb.o7, null, PorterDuff.Mode.MULTIPLY);
                                        } else {
                                            arrayList2 = arrayList5;
                                            z4 = z11;
                                            drawable = null;
                                            anb.X(textView2, cmb.i5, null);
                                            anb.x(textView2, drawable2, cmb.I5, null, PorterDuff.Mode.MULTIPLY);
                                        }
                                        wi8.w(textView2, 1, 16.0f, 1, 1);
                                        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, drawable, drawable);
                                        textView2.setTag(Integer.valueOf(i7));
                                        textView2.setBackgroundDrawable(cmb.L0(z4));
                                        int L = gm.L(24.0f);
                                        int L2 = gm.L(24.0f);
                                        int i8 = z4 ? 1 : 0;
                                        textView2.setPadding(L, i8, L2, i8);
                                        textView2.setSingleLine(true);
                                        textView2.setGravity(19);
                                        textView2.setCompoundDrawablePadding(gm.L(26.0f));
                                        textView2.setText(strArr[i7]);
                                        linearLayout.addView(textView2, qoe.r(-1, 48, 51));
                                        final ArrayList arrayList7 = arrayList6;
                                        final boolean z16 = x;
                                        arrayList3 = arrayList2;
                                        View.OnClickListener onClickListener = new View.OnClickListener(i6, z16, i5, this, arrayList3, arrayList7, zf1Var, alertDialog$Builder2) { // from class: qh
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ int b;
                                            public final /* synthetic */ NotificationsCustomSettingsActivity c;
                                            public final /* synthetic */ ArrayList d;
                                            public final /* synthetic */ ArrayList e;
                                            public final /* synthetic */ zf1 f;
                                            public final /* synthetic */ AlertDialog$Builder h;

                                            {
                                                this.b = i5;
                                                this.c = this;
                                                this.d = arrayList3;
                                                this.e = arrayList7;
                                                this.f = zf1Var;
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
                                                    lo7.n(i10).U(i11, 0);
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
                                                        lo7.n(i10).H(0L, i9, 0L);
                                                        lo7.n(i10).U(i11, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                    }
                                                    i9 = currentTime;
                                                    lo7.n(i10).H(0L, i9, 0L);
                                                    lo7.n(i10).U(i11, ConnectionsManager.DEFAULT_DATACENTER_ID);
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
                                                if (i12 < 0 || !c41.a(notificationsCustomSettingsActivity)) {
                                                    return;
                                                }
                                                c41.z(notificationsCustomSettingsActivity, i12, 0, null).j();
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
                                String M02 = jb6.M0(2131747657, null);
                                he heVar2 = alertDialog$Builder2.a;
                                heVar2.S = M02;
                                alertDialog$Builder2.n(linearLayout);
                                showDialog(heVar2);
                                return;
                            }
                            return;
                        }
                        if (i4 == 3) {
                            if (view.isEnabled()) {
                                try {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, i2);
                                    presentFragment(new ep7(bundle2, getResourceProvider()));
                                    return;
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    return;
                                }
                            }
                            return;
                        }
                        if (uo7Var.a == 3) {
                            if (view.isEnabled()) {
                                showDialog(ik.t(getParentActivity(), 0L, 0L, this.s, new oo7(this, view, i, (byte) 0), null));
                                return;
                            }
                            return;
                        }
                        float f3 = 4.0f;
                        if (i4 == 2) {
                            if (view.isEnabled()) {
                                Activity parentActivity = getParentActivity();
                                oo7 oo7Var = new oo7(this, view, i, (byte) 1);
                                Pattern pattern2 = ik.a;
                                SharedPreferences sharedPreferences = oc7.r1(z8c.t0).W3;
                                int[] iArr2 = new int[1];
                                if (i2 == 1) {
                                    iArr2[0] = sharedPreferences.getInt("popupAll", 0);
                                } else if (i2 == 0) {
                                    iArr2[0] = sharedPreferences.getInt("popupGroup", 0);
                                } else {
                                    iArr2[0] = sharedPreferences.getInt("popupChannel", 0);
                                }
                                String[] strArr2 = {jb6.M0(2131747911, null), jb6.M0(2131747551, null), jb6.M0(2131747552, null), jb6.M0(2131754231, null)};
                                LinearLayout l = td4.l(parentActivity, 1);
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity);
                                int i9 = 0;
                                for (int i10 = 4; i9 < i10; i10 = 4) {
                                    x09 x09Var = new x09(parentActivity, null);
                                    x09Var.setTag(Integer.valueOf(i9));
                                    float f4 = f3;
                                    x09Var.setPadding(gm.L(f3), 0, gm.L(f4), 0);
                                    ik.a(x09Var, cmb.f7, cmb.D5, null);
                                    x09Var.b(strArr2[i9], iArr2[0] == i9);
                                    l.addView(x09Var);
                                    x09Var.setOnClickListener(new ph((Object) iArr2, i2, (Object) alertDialog$Builder3, (Object) oo7Var, (byte) 0));
                                    i9++;
                                    f3 = f4;
                                }
                                String M03 = jb6.M0(2131746831, null);
                                he heVar3 = alertDialog$Builder3.a;
                                heVar3.S = M03;
                                alertDialog$Builder3.n(l);
                                alertDialog$Builder3.j(jb6.M0(2131752542, null), null);
                                showDialog(heVar3);
                                return;
                            }
                            return;
                        }
                        if (i4 == 1) {
                            if (view.isEnabled()) {
                                String str = i2 == 1 ? "vibrate_messages" : i2 == 0 ? "vibrate_group" : i2 == 3 ? "vibrate_stories" : (i2 == 4 || i2 == 5) ? "vibrate_react" : "vibrate_channel";
                                showDialog(ik.V(getParentActivity(), 0L, 0L, str, new v36((Object) this, (Object) view, (Object) str, i, (byte) 13), null));
                                return;
                            }
                            return;
                        }
                        if (i4 == 4) {
                            if (view.isEnabled()) {
                                showDialog(ik.F(getParentActivity(), 0L, 0L, this.s, new oo7(this, view, i, (byte) 2), null));
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
                                    uo7Var.i = true;
                                    z7 = true;
                                } else {
                                    edit2.putBoolean("EnableAllStories", false);
                                    this.n = Boolean.FALSE;
                                    this.r = false;
                                    uo7Var.i = false;
                                    z7 = false;
                                }
                                if (view instanceof bjb) {
                                    ((bjb) view).setChecked(z7);
                                }
                                edit2.commit();
                                boolean z17 = this.r;
                                boolean z18 = this.h;
                                if (z17 != z18 && this.a != null && this.b != null) {
                                    this.h = !z18;
                                    q0(true);
                                }
                                getNotificationsController().b0(i2);
                                e0();
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
                                if (view instanceof bjb) {
                                    ((bjb) view).setChecked(!z6);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (i4 == 103 || i4 == 104) {
                            Object[] objArr = !jb6.a0 ? f <= ((float) (view.getMeasuredWidth() - gm.L(76.0f))) : f >= ((float) gm.L(76.0f));
                            SharedPreferences notificationsSettings3 = getNotificationsSettings();
                            int i11 = uo7Var.c;
                            if (objArr == true) {
                                String str2 = i11 == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                                SharedPreferences.Editor edit4 = notificationsSettings3.edit();
                                edit4.putBoolean(str2, !notificationsSettings3.getBoolean(str2, true));
                                edit4.apply();
                                q0(true);
                                getNotificationsController().b0(i2);
                                return;
                            }
                            String str3 = i11 == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
                            LinearLayout i12 = hg9.i(context, 1);
                            boolean[] zArr = {notificationsSettings3.getBoolean(str3, false)};
                            x09[] x09VarArr = new x09[2];
                            int i13 = 0;
                            while (i13 < 2) {
                                x09 x09Var2 = new x09(context, getResourceProvider());
                                x09VarArr[i13] = x09Var2;
                                x09Var2.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                                x09VarArr[i13].a(cmb.w0(null, cmb.f7, false), cmb.w0(null, cmb.D5, false));
                                x09VarArr[i13].b(jb6.M0(i13 == 0 ? 2131747582 : 2131747583, null), i13 == 0 ? !zArr[0] ? z9 : false : zArr[0]);
                                x09 x09Var3 = x09VarArr[i13];
                                int i14 = cmb.h6;
                                anb.R(x09Var3, cmb.f0(cmb.w0(null, i14, false), 2, -1), null, anb.M(i14), null);
                                i12.addView(x09VarArr[i13]);
                                x09VarArr[i13].setOnClickListener(new wh((Object) zArr, i13, (Object) x09VarArr, (byte) 10));
                                i13++;
                                z9 = z9;
                            }
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                            String M04 = jb6.M0(2131747584, null);
                            he heVar4 = alertDialog$Builder4.a;
                            heVar4.S = M04;
                            alertDialog$Builder4.n(i12);
                            alertDialog$Builder4.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder4.j(jb6.M0(2131745680, null), new lu((Object) this, (Object) notificationsSettings3, (Object) zArr, str3, (byte) 16));
                            showDialog(heVar4);
                            return;
                        }
                        return;
                    }
                }
                adapter = this.a.getAdapter();
                wo7Var = this.d;
                if (adapter != wo7Var) {
                    Object E2 = wo7Var.E(i);
                    if (E2 instanceof zo7) {
                        arrayList = this.d.d;
                        zo7Var = (zo7) E2;
                        z3 = false;
                    } else {
                        boolean z19 = E2 instanceof TLRPC.User;
                        long j2 = z19 ? ((TLRPC.User) E2).id : -((TLRPC.Chat) E2).id;
                        if (hashMap.containsKey(Long.valueOf(j2))) {
                            zo7Var = (zo7) hashMap.get(Long.valueOf(j2));
                            z2 = false;
                        } else {
                            zo7 zo7Var7 = new zo7();
                            zo7Var7.d = j2;
                            if (z19) {
                                zo7Var7.d = ((TLRPC.User) E2).id;
                            } else {
                                zo7Var7.d = -((TLRPC.Chat) E2).id;
                            }
                            zo7Var = zo7Var7;
                            z2 = true;
                        }
                        arrayList = this.x;
                        z3 = z2;
                    }
                    z = z3;
                } else {
                    zo7Var = uo7Var.g;
                    if (zo7Var.f) {
                        return;
                    }
                    arrayList = this.x;
                    z = false;
                }
                zo7Var2 = zo7Var;
                ArrayList arrayList9 = arrayList;
                if (zo7Var2 != null) {
                    return;
                }
                long j3 = zo7Var2.d;
                jd2 jd2Var = new jd2(context, this.currentAccount, null, true, new qo7(this, j3, lo7.n(this.currentAccount).x(j3, null, false, false), zo7Var2, z, i, arrayList9), getResourceProvider());
                jd2Var.e(j3, 0L, null);
                jd2Var.d(this, view, f, f2, false);
                return;
            }
        }
        uo7Var = null;
        boolean z92 = true;
        if (uo7Var == null) {
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
        wo7Var = this.d;
        if (adapter != wo7Var) {
        }
        zo7Var2 = zo7Var;
        ArrayList arrayList92 = arrayList;
        if (zo7Var2 != null) {
        }
    }

    public final void l0(zo7 zo7Var, View view) {
        this.simpleActionBar.o(true);
        p0(zo7Var, view, true);
    }

    public final void m0(zo7 zo7Var, View view) {
        this.simpleActionBar.o(true);
        p0(zo7Var, view, false);
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
    public final void n0(ArrayList arrayList) {
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
                    zo7 zo7Var = new zo7();
                    zo7Var.d = longValue2;
                    arrayList10 = arrayList21;
                    ArrayList arrayList24 = arrayList12;
                    zo7Var.b = kt6.w("custom_", longValue2, notificationsSettings, false);
                    int intValue = ((Integer) next.getValue()).intValue();
                    zo7Var.c = intValue;
                    if (intValue != 0) {
                        Integer num = (Integer) all.get("notifyuntil_" + replace);
                        if (num != null) {
                            zo7Var.a = num.intValue();
                        }
                    }
                    if (pg3.B(longValue2)) {
                        int i5 = (int) (4294967295L & longValue2);
                        TLRPC.EncryptedChat Z0 = getMessagesController().Z0(Integer.valueOf(i5));
                        if (Z0 == null) {
                            arrayList18.add(Integer.valueOf(i5));
                            longSparseArray.put(longValue2, zo7Var);
                        } else {
                            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(Z0.user_id));
                            if (W1 == null) {
                                arrayList16.add(Long.valueOf(Z0.user_id));
                                longSparseArray.put(Z0.user_id, zo7Var);
                            } else if (W1.deleted) {
                                it = it2;
                                arrayList20 = arrayList22;
                                arrayList19 = arrayList9;
                                arrayList14 = arrayList8;
                                arrayList13 = arrayList7;
                                arrayList21 = arrayList10;
                                arrayList12 = arrayList24;
                            }
                        }
                        arrayList11.add(zo7Var);
                        arrayList12 = arrayList24;
                    } else if (pg3.D(longValue2)) {
                        TLRPC.User W12 = getMessagesController().W1(A2);
                        if (W12 == null) {
                            arrayList16.add(A2);
                            longSparseArray.put(longValue2, zo7Var);
                        } else if (W12.deleted) {
                            it = it2;
                            arrayList20 = arrayList22;
                            arrayList19 = arrayList9;
                            arrayList14 = arrayList8;
                            arrayList13 = arrayList7;
                            arrayList21 = arrayList10;
                            arrayList12 = arrayList24;
                        }
                        arrayList11.add(zo7Var);
                        arrayList12 = arrayList24;
                    } else {
                        long j2 = -longValue2;
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j2));
                        if (L0 == null) {
                            arrayList17.add(Long.valueOf(j2));
                            longSparseArray.put(longValue2, zo7Var);
                        } else if (!L0.left && !L0.kicked && L0.migrated_to == null) {
                            if (!sd2.T(L0) || L0.megagroup) {
                                arrayList12 = arrayList24;
                                arrayList12.add(zo7Var);
                            } else {
                                arrayList15.add(zo7Var);
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
                    zo7 zo7Var2 = new zo7();
                    zo7Var2.d = longValue;
                    zo7Var2.e = true;
                    zo7Var2.c = ((Boolean) next2.getValue()).booleanValue() ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (pg3.D(longValue)) {
                        TLRPC.User W13 = getMessagesController().W1(A);
                        if (W13 == null) {
                            arrayList16.add(A);
                            longSparseArray.put(longValue, zo7Var2);
                        } else if (!W13.deleted) {
                        }
                        arrayList6 = arrayList25;
                        arrayList6.add(zo7Var2);
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
            Collections.sort(arrayList, Comparator$-CC.comparingDouble(new po7((byte) 1)));
            int max = Math.max(0, arrayList.size() - 6);
            while (max < arrayList.size()) {
                long n = pg3.n(((TLRPC.TL_topPeer) arrayList.get(max)).peer);
                if (!hashSet.contains(Long.valueOf(n))) {
                    zo7 zo7Var3 = new zo7();
                    zo7Var3.d = n;
                    zo7Var3.e = z;
                    zo7Var3.c = 0;
                    zo7Var3.f = z;
                    if (pg3.D(n)) {
                        TLRPC.User W14 = getMessagesController().W1(Long.valueOf(n));
                        if (W14 == null) {
                            arrayList16.add(Long.valueOf(n));
                            longSparseArray.put(n, zo7Var3);
                        }
                        arrayList5 = arrayList26;
                        arrayList5.add(0, zo7Var3);
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
                            fc4.g(e, z2);
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
                            gm.c3(new r35(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
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
                        fc4.g(e, z2);
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
                        gm.c3(new r35(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
                    }
                    try {
                        getMessagesStorage().k0(arrayList16, arrayList3, false);
                    } catch (Exception e5) {
                        e = e5;
                        arrayList2 = arrayList28;
                        z2 = true;
                        fc4.g(e, z2);
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
                        gm.c3(new r35(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
                    }
                }
                if (arrayList17.isEmpty()) {
                    arrayList2 = arrayList28;
                } else {
                    cf7 messagesStorage = getMessagesStorage();
                    String join = TextUtils.join(",", arrayList17);
                    arrayList2 = arrayList28;
                    try {
                        messagesStorage.P(join, arrayList2);
                    } catch (Exception e6) {
                        e = e6;
                        z2 = true;
                        fc4.g(e, z2);
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
                        gm.c3(new r35(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
                    }
                }
            } catch (Exception e7) {
                e = e7;
                arrayList2 = arrayList28;
                arrayList3 = arrayList27;
                i = 0;
                z2 = true;
                fc4.g(e, z2);
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
                gm.c3(new r35(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
            }
            size = arrayList2.size();
            for (i2 = i; i2 < size; i2++) {
                TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i2);
                if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                    zo7 zo7Var4 = (zo7) longSparseArray.get(-chat.id);
                    longSparseArray.remove(-chat.id);
                    if (zo7Var4 != null) {
                        if (!sd2.T(chat) || chat.megagroup) {
                            arrayList12.add(zo7Var4);
                        } else {
                            arrayList15.add(zo7Var4);
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
                longSparseArray.remove(pg3.E(((TLRPC.EncryptedChat) arrayList4.get(i4)).id));
            }
            size4 = longSparseArray.size();
            while (i < size4) {
                if (pg3.y(longSparseArray.keyAt(i))) {
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
        gm.c3(new r35(this, arrayList3, arrayList2, arrayList4, arrayList11, arrayList12, arrayList30, arrayList31, arrayList15, (byte) 2));
    }

    public final void o0() {
        ArrayList arrayList;
        if (this.s == 3) {
            hs6.d0(this.currentAccount).O0(true);
            arrayList = new ArrayList(hs6.d0(this.currentAccount).j1);
        } else {
            arrayList = null;
        }
        getMessagesStorage().a.c(new bl7(this, arrayList, (byte) 11));
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
                str = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? jb6.M0(2131745014, "SoundDefault") : ringtone.getTitle(getParentActivity());
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
            u69 K = this.a.K(i);
            if (K != null) {
                this.b.t(K, i);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        q0(true);
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
        q0(true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, nm7.f0);
        getNotificationCenter().n(this, nm7.S0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        w71 w71Var = this.b;
        if (w71Var != null) {
            w71Var.f();
        }
        getNotificationCenter().b(this, nm7.f0);
        getNotificationCenter().b(this, nm7.S0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p0(zo7 zo7Var, View view, boolean z) {
        String p = lo7.p(zo7Var.d, 0L, false);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean j0 = j0(this.currentAccount, zo7Var.d);
        zo7Var.c = z ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
        if (zo7Var.f) {
            zo7Var.f = false;
            edit.putBoolean(b10.h("stories_", p), !z).commit();
            ArrayList arrayList = this.w;
            if (arrayList != null) {
                arrayList.remove(zo7Var);
            }
            ArrayList arrayList2 = this.x;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.x = arrayList2;
            }
            arrayList2.add(0, zo7Var);
        } else if (j0) {
            edit.putBoolean(b10.h("stories_", p), !z).commit();
        } else {
            Boolean bool = this.n;
            if (!z ? bool == null || !bool.booleanValue() : bool != null && bool.booleanValue()) {
                f0(zo7Var, view);
                return;
            }
            edit.putBoolean(b10.h("stories_", p), !z).commit();
        }
        if (view instanceof w8c) {
            w8c w8cVar = (w8c) view;
            w8cVar.f(zo7Var, null, w8cVar.T);
        }
        getNotificationsController().c0(zo7Var.d, 0L, false);
        q0(true);
    }

    public final void q0(boolean z) {
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
            String M0 = jb6.M0(2131747577, null);
            uo7 uo7Var = new uo7(0, true);
            uo7Var.e = M0;
            arrayList4.add(uo7Var);
            if (i == 3) {
                this.newRow = arrayList4.size();
                arrayList4.add(uo7.b(101, jb6.M0(2131747572, null), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = arrayList4.size();
                    arrayList4.add(uo7.b(nm7.m1, jb6.M0(2131747574, null), this.r && ((bool = this.n) == null || !bool.booleanValue())));
                }
                arrayList4.add(uo7.d(-1, jb6.M0(2131744407, null)));
            } else if (i == 4 || i == 5) {
                this.messagesRow = arrayList4.size();
                String M02 = jb6.M0(2131747573, null);
                String M03 = jb6.M0(!notificationsSettings.getBoolean("EnableReactionsMessages", true) ? 2131747579 : notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? 2131747581 : 2131747580, null);
                boolean z2 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                uo7 uo7Var2 = new uo7(6, true);
                uo7Var2.c = nm7.n1;
                uo7Var2.d = R.drawable.msg_markunread;
                uo7Var2.e = M02;
                uo7Var2.f = M03;
                uo7Var2.i = z2;
                arrayList4.add(uo7Var2);
                this.storiesRow = arrayList4.size();
                String M04 = jb6.M0(2131747570, null);
                String M05 = jb6.M0(!notificationsSettings.getBoolean("EnableReactionsStories", true) ? 2131747579 : notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? 2131747581 : 2131747580, null);
                boolean z3 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                uo7 uo7Var3 = new uo7(6, true);
                uo7Var3.c = nm7.o1;
                uo7Var3.d = R.drawable.msg_stories_saved;
                uo7Var3.e = M04;
                uo7Var3.f = M05;
                uo7Var3.i = z3;
                arrayList4.add(uo7Var3);
                arrayList4.add(uo7.d(-1, null));
            } else {
                int i2 = i == 1 ? 2131747571 : i == 0 ? 2131747575 : 2131747576;
                this.showRow = arrayList4.size();
                arrayList4.add(uo7.b(100, jb6.M0(i2, null), getNotificationsController().v(i)));
                arrayList4.add(uo7.d(-1, null));
            }
            String M06 = jb6.M0(2131745717, null);
            uo7 uo7Var4 = new uo7(0, true);
            uo7Var4.e = M06;
            arrayList4.add(uo7Var4);
            arrayList4.size();
            if (i == 3) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(uo7.b(0, jb6.M0(2131747666, null), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i == 4 || i == 5) {
                this.showSenderRow = arrayList4.size();
                arrayList4.add(uo7.b(0, jb6.M0(2131747666, null), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                boolean z4 = i != 0 ? i != 1 ? i != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true) : notificationsSettings.getBoolean("EnablePreviewAll", true) : notificationsSettings.getBoolean("EnablePreviewGroup", true);
                this.previewRow = arrayList4.size();
                arrayList4.add(uo7.b(0, jb6.M0(2131748294, null), z4));
            }
            this.soundRow = arrayList4.size();
            String M07 = jb6.M0(2131745017, "Sound");
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            String M08 = jb6.M0(2131745014, "SoundDefault");
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
                string = c == null ? jb6.M0(2131751616, "CustomSound") : ep7.g0(c, bc4.B(c));
            } else if (string.equals("NoSound")) {
                string = jb6.M0(2131747885, "NoSound");
            } else if (string.equals("Default")) {
                string = jb6.M0(2131745014, "SoundDefault");
            }
            arrayList4.add(uo7.c(3, M07, string));
            if (this.H) {
                this.lightColorRow = arrayList4.size();
                String M09 = jb6.M0(2131748746, "LedColor");
                int g0 = g0();
                uo7 uo7Var5 = new uo7(3, true);
                uo7Var5.e = M09;
                uo7Var5.h = g0;
                arrayList4.add(uo7Var5);
                int i3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? (i == 4 || i == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0 : notificationsSettings.getInt("vibrate_stories", 0) : notificationsSettings.getInt("vibrate_channel", 0) : notificationsSettings.getInt("vibrate_messages", 0) : notificationsSettings.getInt("vibrate_group", 0);
                this.vibrateRow = arrayList4.size();
                String M010 = jb6.M0(2131743301, "Vibrate");
                int[] iArr = this.E;
                arrayList4.add(uo7.c(1, M010, jb6.M0(iArr[Utilities.j(i3, iArr.length - 1, 0)], null)));
                if (i == 1 || i == 0) {
                    this.popupRow = arrayList4.size();
                    arrayList4.add(uo7.c(2, jb6.M0(2131746831, "PopupNotification"), h0()));
                }
                this.priorityRow = arrayList4.size();
                arrayList4.add(uo7.c(4, jb6.M0(2131747639, "NotificationsImportance"), i0()));
                String M011 = jb6.M0(2131747578, null);
                uo7 uo7Var6 = new uo7(8, true);
                uo7Var6.e = M011;
                uo7Var6.d = 0;
                arrayList4.add(uo7Var6);
            } else {
                String M012 = jb6.M0(2131747569, null);
                uo7 uo7Var7 = new uo7(8, true);
                uo7Var7.e = M012;
                uo7Var7.d = 1;
                arrayList4.add(uo7Var7);
            }
            arrayList4.size();
            arrayList4.add(uo7.d(-2, null));
        } else {
            arrayList = arrayList3;
        }
        if (i != 4 && i != 5) {
            if (i != -1) {
                this.addExceptionRow = arrayList4.size();
                String M013 = jb6.M0(2131747656, "NotificationsAddAnException");
                uo7 uo7Var8 = new uo7(7, true);
                uo7Var8.c = 6;
                uo7Var8.d = R.drawable.msg_contact_add;
                uo7Var8.e = M013;
                arrayList4.add(uo7Var8);
            }
            arrayList4.size();
            if (this.w != null && this.h) {
                for (int i4 = 0; i4 < this.w.size(); i4++) {
                    zo7 zo7Var = (zo7) this.w.get(i4);
                    uo7 uo7Var9 = new uo7(2, true);
                    uo7Var9.g = zo7Var;
                    arrayList4.add(uo7Var9);
                }
            }
            if (this.x != null) {
                for (int i5 = 0; i5 < this.x.size(); i5++) {
                    zo7 zo7Var2 = (zo7) this.x.get(i5);
                    uo7 uo7Var10 = new uo7(2, true);
                    uo7Var10.g = zo7Var2;
                    arrayList4.add(uo7Var10);
                }
            }
            arrayList4.size();
            if (i != -1 || ((arrayList2 = this.x) != null && !arrayList2.isEmpty())) {
                arrayList4.add(uo7.d(-3, null));
            }
            ArrayList arrayList5 = this.x;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = arrayList4.size();
                String M014 = jb6.M0(2131747648, "NotificationsDeleteAllException");
                uo7 uo7Var11 = new uo7(7, true);
                uo7Var11.c = 7;
                uo7Var11.d = 0;
                uo7Var11.e = M014;
                arrayList4.add(uo7Var11);
            }
        }
        w71 w71Var = this.b;
        if (w71Var != null) {
            if (z) {
                w71Var.E(arrayList, arrayList4);
            } else {
                w71Var.f();
            }
        }
    }

    public final void r0() {
        int hiddenChildCount;
        View W;
        try {
            if (this.a != null) {
                int w0 = cmb.w0(null, cmb.x6, false);
                int w02 = cmb.w0(null, cmb.Yl, false);
                int i = 0;
                while (i < 4) {
                    if (i == 0) {
                        hiddenChildCount = this.a.getChildCount();
                    } else {
                        r59 r59Var = this.a;
                        hiddenChildCount = i == 1 ? r59Var.getHiddenChildCount() : i == 2 ? r59Var.getCachedChildCount() : r59Var.getAttachedScrapChildCount();
                    }
                    for (int i2 = 0; i2 < hiddenChildCount; i2++) {
                        if (i == 0) {
                            W = this.a.getChildAt(i2);
                        } else {
                            r59 r59Var2 = this.a;
                            W = i == 1 ? r59Var2.W(i2) : i == 2 ? r59Var2.P(i2) : r59Var2.O(i2);
                        }
                        if (W instanceof w8c) {
                            w8c w8cVar = (w8c) W;
                            w8cVar.b0 = true;
                            w8cVar.R = w0;
                            w8cVar.S = w02;
                            if (i != 0) {
                                ((w8c) W).i(0);
                            }
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
