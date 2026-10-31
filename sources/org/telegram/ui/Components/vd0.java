package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vd0 extends org.telegram.ui.ActionBar.z2 {
    public static final /* synthetic */ int F1 = 0;
    public final boolean A1;
    public vi B1;
    public final ArrayList C1;
    public final ArrayList D1;
    public final TLRPC.TL_userContact_old2 E1;
    public final m2.t i1;
    public final od0 j1;
    public final LinearLayout k1;
    public final pd0 l1;
    public final View m1;
    public final View n1;
    public final TextView o1;
    public final org.telegram.ui.ActionBar.k2 p1;
    public boolean q1;
    public final Paint r1;
    public int s1;
    public AnimatorSet t1;
    public AnimatorSet u1;
    public final int v1;
    public final int w1;
    public final int x1;
    public final int y1;
    public final int z1;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vd0(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.f5 f5Var, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, (Context) k2Var.getParentActivity(), p6Var, false);
        ArrayList e22;
        ArrayList<TLRPC.RestrictionReason> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10;
        final int i11;
        this.r1 = new Paint(1);
        this.C1 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.D1 = arrayList4;
        String str4 = str2;
        String str5 = str3;
        String m10 = org.telegram.messenger.i5.m(0, str4, str5);
        ArrayList arrayList5 = new ArrayList();
        if (uri != null) {
            e22 = org.telegram.messenger.i0.e2(uri, this.a, false, arrayList5, m10);
        } else if (file != null) {
            e22 = org.telegram.messenger.i0.e2(Uri.fromFile(file), this.a, false, arrayList5, m10);
            file.delete();
            this.A1 = true;
        } else {
            if (str != null) {
                org.telegram.messenger.h0 h0Var = new org.telegram.messenger.h0();
                h0Var.c = 0;
                String concat = "TEL;MOBILE:+".concat(str);
                h0Var.b = concat;
                h0Var.a.add(concat);
                arrayList4.add(h0Var);
                this.A1 = true;
            } else {
                String str6 = f5Var.b;
                if (str6 != null) {
                    e22 = org.telegram.messenger.i0.e2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str6), this.a, true, arrayList5, m10);
                } else {
                    org.telegram.messenger.h0 h0Var2 = new org.telegram.messenger.h0();
                    h0Var2.c = 0;
                    String str7 = "TEL;MOBILE:+" + f5Var.m.phone;
                    h0Var2.b = str7;
                    h0Var2.a.add(str7);
                    arrayList4.add(h0Var2);
                }
            }
            e22 = null;
        }
        TLRPC.User user2 = (user != null || f5Var == null) ? user : f5Var.m;
        if (e22 != null) {
            for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                org.telegram.messenger.h0 h0Var3 = (org.telegram.messenger.h0) arrayList5.get(i12);
                if (h0Var3.c == 0) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= this.D1.size()) {
                            this.D1.add(h0Var3);
                            break;
                        } else {
                            if (((org.telegram.messenger.h0) this.D1.get(i13)).c(false).equals(h0Var3.c(false))) {
                                h0Var3.d = false;
                                break;
                            }
                            i13++;
                        }
                    }
                } else {
                    this.C1.add(h0Var3);
                }
            }
            if (!e22.isEmpty()) {
                TLRPC.User user3 = (TLRPC.User) e22.get(0);
                arrayList = user3.restriction_reason;
                if (TextUtils.isEmpty(str4)) {
                    String str8 = user3.first_name;
                    str5 = user3.last_name;
                    str4 = str8;
                }
                TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                this.E1 = tL_userContact_old2;
                if (user2 == null) {
                    tL_userContact_old2.id = user2.id;
                    tL_userContact_old2.access_hash = user2.access_hash;
                    tL_userContact_old2.photo = user2.photo;
                    tL_userContact_old2.status = user2.status;
                    tL_userContact_old2.first_name = user2.first_name;
                    tL_userContact_old2.last_name = user2.last_name;
                    tL_userContact_old2.phone = user2.phone;
                    if (arrayList != null) {
                        tL_userContact_old2.restriction_reason = arrayList;
                    }
                } else {
                    tL_userContact_old2.first_name = str4;
                    tL_userContact_old2.last_name = str5;
                }
                this.p1 = k2Var;
                final Activity parentActivity = k2Var.getParentActivity();
                arrayList2 = this.C1;
                this.v1 = 1;
                arrayList3 = this.D1;
                if (arrayList3.size() <= 1 || !arrayList2.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        int i14 = this.v1;
                        this.w1 = i14;
                        int size = arrayList3.size() + i14;
                        this.v1 = size;
                        this.x1 = size;
                    } else {
                        this.w1 = -1;
                        this.x1 = -1;
                    }
                    if (arrayList2.isEmpty()) {
                        int i15 = this.v1;
                        this.y1 = i15;
                        int size2 = arrayList2.size() + i15;
                        this.v1 = size2;
                        this.z1 = size2;
                    } else {
                        this.y1 = -1;
                        this.z1 = -1;
                    }
                } else {
                    this.w1 = -1;
                    this.x1 = -1;
                    this.y1 = -1;
                    this.z1 = -1;
                }
                nd0 nd0Var = new nd0(this, parentActivity, parentActivity);
                nd0Var.setWillNotDraw(false);
                this.b = nd0Var;
                this.u0 = false;
                this.v0 = false;
                int i16 = 11;
                this.i1 = new m2.t(this, i16);
                od0 od0Var = new od0(this, parentActivity);
                this.j1 = od0Var;
                od0Var.setClipToPadding(false);
                od0Var.setVerticalScrollBarEnabled(false);
                nd0Var.addView(od0Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
                LinearLayout linearLayout = new LinearLayout(parentActivity);
                this.k1 = linearLayout;
                linearLayout.setOrientation(1);
                od0Var.addView(linearLayout, w7.b6.x(-1, -1, 51));
                od0Var.setOnScrollChangeListener(new ld0(this));
                i10 = this.v1;
                for (i11 = 0; i11 < i10; i11++) {
                    ViewGroup v = this.i1.v(parentActivity, i11);
                    this.k1.addView(v, w7.b6.o(-1, -2));
                    if ((i11 >= this.w1 && i11 < this.x1) || (i11 >= this.y1 && i11 < this.z1)) {
                        v.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                        v.setOnClickListener(new jg.w1(this, i11, v, i16));
                        v.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Components.md0
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                org.telegram.messenger.h0 h0Var4;
                                vd0 vd0Var = vd0.this;
                                int i17 = i11;
                                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                Context context = parentActivity;
                                int i18 = vd0Var.w1;
                                if (i17 < i18 || i17 >= vd0Var.x1) {
                                    int i19 = vd0Var.y1;
                                    h0Var4 = (i17 < i19 || i17 >= vd0Var.z1) ? null : (org.telegram.messenger.h0) vd0Var.C1.get(i17 - i19);
                                } else {
                                    h0Var4 = (org.telegram.messenger.h0) vd0Var.D1.get(i17 - i18);
                                }
                                if (h0Var4 == null) {
                                    return false;
                                }
                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", h0Var4.c(false)));
                                if (cc.a(vd0Var.p1)) {
                                    if (h0Var4.c == 3) {
                                        new cc((FrameLayout) vd0Var.b, p6Var2).k(false).j();
                                        return true;
                                    }
                                    ob obVar = new ob(context, p6Var2);
                                    int i20 = h0Var4.c;
                                    if (i20 == 0) {
                                        obVar.b.setText(org.telegram.messenger.cd.L0(2131747311, null));
                                        obVar.a.setImageResource(R.drawable.msg_calls);
                                    } else if (i20 == 1) {
                                        obVar.b.setText(org.telegram.messenger.cd.L0(2131751204, null));
                                        obVar.a.setImageResource(R.drawable.msg_mention);
                                    } else {
                                        obVar.b.setText(org.telegram.messenger.cd.L0(2131744219, null));
                                        obVar.a.setImageResource(R.drawable.msg_info);
                                    }
                                    if (org.telegram.messenger.i0.H3()) {
                                        wb.f((FrameLayout) vd0Var.b, obVar, 1500).j();
                                    }
                                }
                                return true;
                            }
                        });
                    }
                }
                pd0 pd0Var = new pd0(this, parentActivity);
                this.l1 = pd0Var;
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, pd0Var, p6Var);
                pd0Var.setBackButtonImage(R.drawable.ic_ab_back);
                int i17 = org.telegram.ui.ActionBar.t6.j5;
                org.telegram.ui.ActionBar.a7.m(pd0Var, 1, i17, p6Var);
                org.telegram.ui.ActionBar.a7.m(pd0Var, 3, org.telegram.ui.ActionBar.t6.I5, p6Var);
                org.telegram.ui.ActionBar.a7.m(pd0Var, 5, i17, p6Var);
                pd0Var.setOccupyStatusBar(false);
                pd0Var.setAlpha(0.0f);
                if (this.A1) {
                    pd0Var.setTitle(org.telegram.messenger.cd.L0(2131745478, null));
                } else {
                    pd0Var.setTitle(org.telegram.messenger.cd.L0(2131754449, null));
                }
                this.b.addView(pd0Var, w7.b6.c(-2.0f, -1));
                pd0Var.setActionBarMenuOnItemClick(new qd0(this));
                View view = new View(parentActivity);
                this.m1 = view;
                view.setAlpha(0.0f);
                int i18 = org.telegram.ui.ActionBar.t6.V5;
                org.telegram.ui.ActionBar.a7.i(i18, view, p6Var);
                this.b.addView(view, w7.b6.c(1.0f, -1));
                View view2 = new View(parentActivity);
                this.n1 = view2;
                org.telegram.ui.ActionBar.a7.i(i18, view2, p6Var);
                view2.setAlpha(0.0f);
                this.b.addView(view2, w7.b6.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
                TextView textView = new TextView(parentActivity);
                this.o1 = textView;
                textView.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                textView.setGravity(17);
                textView.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gi, this.I0));
                textView.setTextSize(1, 14.0f);
                if (this.A1) {
                    textView.setText(org.telegram.messenger.cd.L0(2131745478, null));
                } else {
                    textView.setText(org.telegram.messenger.cd.L0(2131754449, null));
                }
                textView.setTypeface(org.telegram.messenger.i0.o());
                int L = org.telegram.messenger.i0.L(8.0f);
                int i19 = org.telegram.ui.ActionBar.t6.Ci;
                int w02 = org.telegram.ui.ActionBar.t6.w0(i19, this.I0);
                int i20 = org.telegram.ui.ActionBar.t6.Ei;
                int w03 = org.telegram.ui.ActionBar.t6.w0(i20, this.I0);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, w03, w03);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i19);
                org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i20);
                textView.setBackground(k02);
                org.telegram.ui.ActionBar.a7.k(textView, k02, N, N2, p6Var);
                nd0Var.addView(textView, w7.b6.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
                textView.setOnClickListener(new sr(i16, this, p6Var));
            }
        }
        arrayList = null;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        this.E1 = tL_userContact_old22;
        if (user2 == null) {
        }
        this.p1 = k2Var;
        final Activity parentActivity2 = k2Var.getParentActivity();
        arrayList2 = this.C1;
        this.v1 = 1;
        arrayList3 = this.D1;
        if (arrayList3.size() <= 1) {
        }
        if (arrayList3.isEmpty()) {
        }
        if (arrayList2.isEmpty()) {
        }
        nd0 nd0Var2 = new nd0(this, parentActivity2, parentActivity2);
        nd0Var2.setWillNotDraw(false);
        this.b = nd0Var2;
        this.u0 = false;
        this.v0 = false;
        int i162 = 11;
        this.i1 = new m2.t(this, i162);
        od0 od0Var2 = new od0(this, parentActivity2);
        this.j1 = od0Var2;
        od0Var2.setClipToPadding(false);
        od0Var2.setVerticalScrollBarEnabled(false);
        nd0Var2.addView(od0Var2, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout2 = new LinearLayout(parentActivity2);
        this.k1 = linearLayout2;
        linearLayout2.setOrientation(1);
        od0Var2.addView(linearLayout2, w7.b6.x(-1, -1, 51));
        od0Var2.setOnScrollChangeListener(new ld0(this));
        i10 = this.v1;
        while (i11 < i10) {
        }
        pd0 pd0Var2 = new pd0(this, parentActivity2);
        this.l1 = pd0Var2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, pd0Var2, p6Var);
        pd0Var2.setBackButtonImage(R.drawable.ic_ab_back);
        int i172 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.m(pd0Var2, 1, i172, p6Var);
        org.telegram.ui.ActionBar.a7.m(pd0Var2, 3, org.telegram.ui.ActionBar.t6.I5, p6Var);
        org.telegram.ui.ActionBar.a7.m(pd0Var2, 5, i172, p6Var);
        pd0Var2.setOccupyStatusBar(false);
        pd0Var2.setAlpha(0.0f);
        if (this.A1) {
        }
        this.b.addView(pd0Var2, w7.b6.c(-2.0f, -1));
        pd0Var2.setActionBarMenuOnItemClick(new qd0(this));
        View view3 = new View(parentActivity2);
        this.m1 = view3;
        view3.setAlpha(0.0f);
        int i182 = org.telegram.ui.ActionBar.t6.V5;
        org.telegram.ui.ActionBar.a7.i(i182, view3, p6Var);
        this.b.addView(view3, w7.b6.c(1.0f, -1));
        View view22 = new View(parentActivity2);
        this.n1 = view22;
        org.telegram.ui.ActionBar.a7.i(i182, view22, p6Var);
        view22.setAlpha(0.0f);
        this.b.addView(view22, w7.b6.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView2 = new TextView(parentActivity2);
        this.o1 = textView2;
        textView2.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gi, this.I0));
        textView2.setTextSize(1, 14.0f);
        if (this.A1) {
        }
        textView2.setTypeface(org.telegram.messenger.i0.o());
        int L2 = org.telegram.messenger.i0.L(8.0f);
        int i192 = org.telegram.ui.ActionBar.t6.Ci;
        int w022 = org.telegram.ui.ActionBar.t6.w0(i192, this.I0);
        int i202 = org.telegram.ui.ActionBar.t6.Ei;
        int w032 = org.telegram.ui.ActionBar.t6.w0(i202, this.I0);
        org.telegram.ui.Cells.y k022 = org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, w022, w032, w032);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i192);
        org.telegram.ui.ActionBar.w6 N22 = org.telegram.ui.ActionBar.a7.N(i202);
        textView2.setBackground(k022);
        org.telegram.ui.ActionBar.a7.k(textView2, k022, N3, N22, p6Var);
        nd0Var2.addView(textView2, w7.b6.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView2.setOnClickListener(new sr(i162, this, p6Var));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    public final void I0() {
        TextView textView = this.o1;
        if (textView == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gi, this.I0);
        if (!textView.isEnabled()) {
            w02 &= ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (textView.getCurrentTextColor() != w02) {
            textView.setTextColor(w02);
        }
    }

    public final void J0(boolean z10) {
        od0 od0Var = this.j1;
        View childAt = od0Var.getChildAt(0);
        int top = childAt.getTop() - od0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z11 = top <= 0;
        pd0 pd0Var = this.l1;
        if ((z11 && pd0Var.getTag() == null) || (!z11 && pd0Var.getTag() != null)) {
            pd0Var.setTag(z11 ? r2 : null);
            AnimatorSet animatorSet = this.t1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.t1 = null;
            }
            View view = this.m1;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.t1 = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.t1;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(pd0Var, (Property<pd0, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
                this.t1.addListener(new sd0(this, 0));
                this.t1.start();
            } else {
                pd0Var.setAlpha(z11 ? 1.0f : 0.0f);
                view.setAlpha(z11 ? 1.0f : 0.0f);
            }
        }
        if (this.s1 != top) {
            this.s1 = top;
            this.b.invalidate();
        }
        childAt.getBottom();
        od0Var.getMeasuredHeight();
        boolean z12 = childAt.getBottom() - od0Var.getScrollY() > od0Var.getMeasuredHeight();
        View view2 = this.n1;
        if (!(z12 && view2.getTag() == null) && (z12 || view2.getTag() == null)) {
            return;
        }
        view2.setTag(z12 ? 1 : null);
        AnimatorSet animatorSet4 = this.u1;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.u1 = null;
        }
        if (!z10) {
            view2.setAlpha(z12 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.u1 = animatorSet5;
        animatorSet5.setDuration(180L);
        this.u1.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, z12 ? 1.0f : 0.0f));
        this.u1.addListener(new sd0(this, 1));
        this.u1.start();
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        wb.a((FrameLayout) this.b, new mg.u(5));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        wb.h((FrameLayout) this.b);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            I0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
