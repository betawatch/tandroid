package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public fu a;
    public kf4 b;
    public is5 c;
    public UndoView d;
    public boolean e;
    public boolean f;
    public final ArrayList h;
    public final ArrayList n;
    public int r;
    public int s;
    private int showTagsRow;
    public int w;
    public int x;
    public boolean y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.w = -1;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.j7));
        hashSet.add(Integer.valueOf(bkb.M6));
        hashSet.add(Integer.valueOf(bkb.n6));
        hashSet.add(Integer.valueOf(bkb.Ki));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final void b0(ui5 ui5Var) {
        int size = getMessagesController().R0().size();
        if ((size - 1 >= getMessagesController().k4.Z0.f() && !getUserConfig().p()) || size >= getMessagesController().k4.a1.f()) {
            showDialog(new h26(3, this.currentAccount, null, getParentActivity(), this));
        } else if (ui5Var != null) {
            ((ActionBarLayout) ui5Var).S(new pd4(null, null));
        }
    }

    public final UndoView c0() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            FrameLayout frameLayout = (FrameLayout) this.fragmentView;
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            frameLayout.addView(undoView, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(k96.M0(2131750679, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 17));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        fu fuVar = new fu((byte) 21, context, (Object) this);
        this.a = fuVar;
        fuVar.r1();
        this.a.setClipChildren(false);
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.a.setItemAnimator(gb3Var);
        this.a.setSectionsDrawBackground(true);
        ((gb3) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new t26(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        is5 is5Var = new is5(new ge4(this));
        this.c = is5Var;
        is5Var.h(this.a);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        fu fuVar2 = this.a;
        kf4 kf4Var = new kf4(this, context);
        this.b = kf4Var;
        fuVar2.setAdapter(kf4Var);
        this.a.setOnItemClickListener(new v82((Object) this, (Object) context, (byte) 27));
        if (this.f) {
            f0(false);
            this.f = false;
            this.a.w0(this.b.b() - 1);
            gl.d3(new df4(this, b), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(Context context, View view, int i) {
        hf4 hf4Var;
        if (i >= 0) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size() || (hf4Var = (hf4) arrayList.get(i)) == null) {
                return;
            }
            int i2 = hf4Var.a;
            byte b = 4;
            if (i2 != 6) {
                if (i2 != 2) {
                    if (i2 == 4) {
                        b0(getParentLayout());
                        return;
                    }
                    return;
                }
                t97 t97Var = hf4Var.d;
                if (t97Var == null || t97Var.d()) {
                    return;
                }
                if (t97Var.p) {
                    showDialog(new h26(3, this.currentAccount, null, context, this));
                    return;
                } else {
                    presentFragment(new pd4(t97Var, null));
                    return;
                }
            }
            if (!getUserConfig().p()) {
                showDialog(new jh8((org.telegram.ui.ActionBar.d) this, 35, true));
                return;
            }
            TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
            tL_messages_toggleDialogFilterTags.enabled = !getMessagesController().l4;
            na7 messagesController = getMessagesController();
            boolean z = tL_messages_toggleDialogFilterTags.enabled;
            SharedPreferences.Editor edit = messagesController.X3.edit();
            messagesController.l4 = z;
            edit.putBoolean("folderTags", z).apply();
            getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new rv3(this, tL_messages_toggleDialogFilterTags, b));
            ((ahb) view).setChecked(getMessagesController().l4);
            kf4 kf4Var = this.b;
            int i3 = this.s;
            kf4Var.l(i3, this.w - i3);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.N2) {
            f0(true);
        } else if (i == kk7.R2) {
            f0(true);
        }
    }

    public final void e0(df4 df4Var) {
        if (!this.e) {
            if (df4Var != null) {
                df4Var.run();
                return;
            }
            return;
        }
        int i = 0;
        this.e = false;
        getNotificationCenter().k(kk7.N2, new Object[0]);
        getMessagesStorage().v1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList R0 = getMessagesController().R0();
        int size = R0.size();
        while (i < size) {
            t97 t97Var = (t97) R0.get(i);
            i = tb4.g(t97Var.a, i, 1, tL_messages_updateDialogFiltersOrder.order);
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new tf(df4Var, (byte) 27));
    }

    public final void f0(boolean z) {
        this.showTagsRow = -1;
        fu fuVar = this.a;
        if (fuVar != null) {
            ArrayList arrayList = fuVar.L2;
            if (arrayList == null) {
                fuVar.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().M0;
        ArrayList R0 = getMessagesController().R0();
        byte b = 0;
        arrayList3.add(new hf4(1, false));
        if (!arrayList4.isEmpty() && R0.size() < 10) {
            int size = arrayList3.size();
            String M0 = k96.M0(2131750704, null);
            hf4 hf4Var = new hf4(0, false);
            hf4Var.c = M0;
            arrayList3.add(hf4Var);
            for (int i = 0; i < arrayList4.size(); i++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i);
                hf4 hf4Var2 = new hf4(5, false);
                hf4Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(hf4Var2);
            }
            fu fuVar2 = this.a;
            if (fuVar2 != null) {
                fuVar2.L2.add(Long.valueOf(gl.u2(size, arrayList3.size() - 1)));
            }
            hf4 hf4Var3 = new hf4(3, false);
            hf4Var3.c = null;
            arrayList3.add(hf4Var3);
        }
        if (R0.isEmpty()) {
            this.w = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String M02 = k96.M0(2131750679, null);
            hf4 hf4Var4 = new hf4(0, false);
            hf4Var4.c = M02;
            arrayList3.add(hf4Var4);
            this.r = arrayList3.size();
            for (int i2 = 0; i2 < R0.size(); i2++) {
                t97 t97Var = (t97) R0.get(i2);
                hf4 hf4Var5 = new hf4(2, false);
                hf4Var5.d = t97Var;
                arrayList3.add(hf4Var5);
                if (na7.q1(this.currentAccount).l4 && ((t97) R0.get(i2)).m >= 0) {
                    this.y = true;
                }
            }
            int size2 = arrayList3.size();
            this.w = size2;
            fu fuVar3 = this.a;
            if (fuVar3 != null) {
                fuVar3.L2.add(Long.valueOf(gl.u2(this.s, (size2 - 1) + (R0.size() >= getMessagesController().k4.a1.f() ? 0 : 1))));
            }
        }
        if (R0.size() < getMessagesController().k4.a1.f()) {
            String M03 = k96.M0(2131751704, null);
            hf4 hf4Var6 = new hf4(4, false);
            hf4Var6.c = M03;
            arrayList3.add(hf4Var6);
        }
        hf4 hf4Var7 = new hf4(3, false);
        hf4Var7.c = null;
        arrayList3.add(hf4Var7);
        this.x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M04 = k96.M0(2131750608, null);
        hf4 hf4Var8 = new hf4(6, false);
        hf4Var8.c = M04;
        arrayList3.add(hf4Var8);
        CharSequence N2 = !getUserConfig().p() ? gl.N2(k96.M0(2131750606, null), bkb.K6, 2, new df4(this, b), null) : k96.M0(2131750607, null);
        hf4 hf4Var9 = new hf4(3, false);
        hf4Var9.c = N2;
        arrayList3.add(hf4Var9);
        kf4 kf4Var = this.b;
        if (kf4Var != null) {
            if (z) {
                kf4Var.E(arrayList2, arrayList3);
            } else {
                kf4Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.a, 16, new Class[]{ld5.class, mf4.class, lf4.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.a, 196608, new Class[]{ff4.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (alb) null, bkb.Li));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        f0(false);
        getMessagesController().e3(true, null);
        getNotificationCenter().b(this, kk7.N2);
        getNotificationCenter().b(this, kk7.R2);
        if (getMessagesController().M0.isEmpty()) {
            getMessagesController().f3();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.N2);
        getNotificationCenter().n(this, kk7.R2);
        e0(null);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        kf4 kf4Var = this.b;
        if (kf4Var != null) {
            kf4Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
