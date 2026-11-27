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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.e implements fn7 {
    public gu a;
    public ih4 b;
    public lu5 c;
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

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.k7));
        hashSet.add(Integer.valueOf(aob.N6));
        hashSet.add(Integer.valueOf(aob.o6));
        hashSet.add(Integer.valueOf(aob.Li));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final void b0(wk5 wk5Var) {
        int size = getMessagesController().T0().size();
        if ((size - 1 >= getMessagesController().k4.h1.f() && !getUserConfig().p()) || size >= getMessagesController().k4.i1.f()) {
            showDialog(new l46(3, this.currentAccount, null, getParentActivity(), this));
        } else if (wk5Var != null) {
            ((ActionBarLayout) wk5Var).S(new nf4(null, null));
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
            frameLayout.addView(undoView, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(ob6.M0(2131750656, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 18));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        gu guVar = new gu((byte) 21, context, (Object) this);
        this.a = guVar;
        guVar.s1();
        this.a.setClipChildren(false);
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.a.setItemAnimator(zb3Var);
        this.a.setSectionsDrawBackground(true);
        ((zb3) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new x46(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        lu5 lu5Var = new lu5(new eg4(this));
        this.c = lu5Var;
        lu5Var.h(this.a);
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        gu guVar2 = this.a;
        ih4 ih4Var = new ih4(this, context);
        this.b = ih4Var;
        guVar2.setAdapter(ih4Var);
        this.a.setOnItemClickListener(new u34(this, context, (byte) 2));
        if (this.f) {
            f0(false);
            this.f = false;
            this.a.x0(this.b.b() - 1);
            hl.d3(new bh4(this, b), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(Context context, View view, int i) {
        gh4 gh4Var;
        if (i >= 0) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size() || (gh4Var = (gh4) arrayList.get(i)) == null) {
                return;
            }
            int i2 = gh4Var.a;
            byte b = 4;
            if (i2 != 6) {
                if (i2 != 2) {
                    if (i2 == 4) {
                        b0(getParentLayout());
                        return;
                    }
                    return;
                }
                ac7 ac7Var = gh4Var.d;
                if (ac7Var == null || ac7Var.d()) {
                    return;
                }
                if (ac7Var.p) {
                    showDialog(new l46(3, this.currentAccount, null, context, this));
                    return;
                } else {
                    presentFragment(new nf4(ac7Var, null));
                    return;
                }
            }
            if (!getUserConfig().p()) {
                showDialog(new xk8((org.telegram.ui.ActionBar.e) this, 35, true));
                return;
            }
            TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
            tL_messages_toggleDialogFilterTags.enabled = !getMessagesController().l4;
            uc7 messagesController = getMessagesController();
            boolean z = tL_messages_toggleDialogFilterTags.enabled;
            SharedPreferences.Editor edit = messagesController.X3.edit();
            messagesController.l4 = z;
            edit.putBoolean("folderTags", z).apply();
            getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new mw3(this, tL_messages_toggleDialogFilterTags, b));
            ((wkb) view).setChecked(getMessagesController().l4);
            ih4 ih4Var = this.b;
            int i3 = this.s;
            ih4Var.l(i3, this.w - i3);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.O2) {
            f0(true);
        } else if (i == jn7.S2) {
            f0(true);
        }
    }

    public final void e0(bh4 bh4Var) {
        if (!this.e) {
            if (bh4Var != null) {
                bh4Var.run();
                return;
            }
            return;
        }
        int i = 0;
        this.e = false;
        getNotificationCenter().k(jn7.O2, new Object[0]);
        getMessagesStorage().v1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList T0 = getMessagesController().T0();
        int size = T0.size();
        while (i < size) {
            ac7 ac7Var = (ac7) T0.get(i);
            i = qd4.g(ac7Var.a, i, 1, tL_messages_updateDialogFiltersOrder.order);
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new ye(bh4Var, (byte) 28));
    }

    public final void f0(boolean z) {
        this.showTagsRow = -1;
        gu guVar = this.a;
        if (guVar != null) {
            ArrayList arrayList = guVar.L2;
            if (arrayList == null) {
                guVar.L2 = new ArrayList();
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
        ArrayList T0 = getMessagesController().T0();
        byte b = 0;
        arrayList3.add(new gh4(1, false));
        if (!arrayList4.isEmpty() && T0.size() < 10) {
            int size = arrayList3.size();
            String M0 = ob6.M0(2131750681, null);
            gh4 gh4Var = new gh4(0, false);
            gh4Var.c = M0;
            arrayList3.add(gh4Var);
            for (int i = 0; i < arrayList4.size(); i++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i);
                gh4 gh4Var2 = new gh4(5, false);
                gh4Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(gh4Var2);
            }
            gu guVar2 = this.a;
            if (guVar2 != null) {
                guVar2.L2.add(Long.valueOf(hl.u2(size, arrayList3.size() - 1)));
            }
            gh4 gh4Var3 = new gh4(3, false);
            gh4Var3.c = null;
            arrayList3.add(gh4Var3);
        }
        if (T0.isEmpty()) {
            this.w = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String M02 = ob6.M0(2131750656, null);
            gh4 gh4Var4 = new gh4(0, false);
            gh4Var4.c = M02;
            arrayList3.add(gh4Var4);
            this.r = arrayList3.size();
            for (int i2 = 0; i2 < T0.size(); i2++) {
                ac7 ac7Var = (ac7) T0.get(i2);
                gh4 gh4Var5 = new gh4(2, false);
                gh4Var5.d = ac7Var;
                arrayList3.add(gh4Var5);
                if (uc7.s1(this.currentAccount).l4 && ((ac7) T0.get(i2)).m >= 0) {
                    this.y = true;
                }
            }
            int size2 = arrayList3.size();
            this.w = size2;
            gu guVar3 = this.a;
            if (guVar3 != null) {
                guVar3.L2.add(Long.valueOf(hl.u2(this.s, (size2 - 1) + (T0.size() >= getMessagesController().k4.i1.f() ? 0 : 1))));
            }
        }
        if (T0.size() < getMessagesController().k4.i1.f()) {
            String M03 = ob6.M0(2131751681, null);
            gh4 gh4Var6 = new gh4(4, false);
            gh4Var6.c = M03;
            arrayList3.add(gh4Var6);
        }
        gh4 gh4Var7 = new gh4(3, false);
        gh4Var7.c = null;
        arrayList3.add(gh4Var7);
        this.x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M04 = ob6.M0(2131750585, null);
        gh4 gh4Var8 = new gh4(6, false);
        gh4Var8.c = M04;
        arrayList3.add(gh4Var8);
        CharSequence N2 = !getUserConfig().p() ? hl.N2(ob6.M0(2131750583, null), aob.L6, 2, new bh4(this, b), null) : ob6.M0(2131750584, null);
        gh4 gh4Var9 = new gh4(3, false);
        gh4Var9.c = N2;
        arrayList3.add(gh4Var9);
        ih4 ih4Var = this.b;
        if (ih4Var != null) {
            if (z) {
                ih4Var.E(arrayList2, arrayList3);
            } else {
                ih4Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.a, 16, new Class[]{mf5.class, kh4.class, jh4.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.a, 196608, new Class[]{eh4.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (zob) null, aob.Mi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        f0(false);
        getMessagesController().k3(true, null);
        getNotificationCenter().b(this, jn7.O2);
        getNotificationCenter().b(this, jn7.S2);
        if (getMessagesController().M0.isEmpty()) {
            getMessagesController().l3();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.O2);
        getNotificationCenter().n(this, jn7.S2);
        e0(null);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        ih4 ih4Var = this.b;
        if (ih4Var != null) {
            ih4Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
