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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vc0 extends org.telegram.ui.ActionBar.t2 {
    public static final /* synthetic */ int G1 = 0;
    public final int A1;
    public final boolean B1;
    public vi C1;
    public final ArrayList D1;
    public final ArrayList E1;
    public final TLRPC.TL_userContact_old2 F1;
    public final nh j1;
    public final oc0 k1;
    public final LinearLayout l1;
    public final pc0 m1;
    public final View n1;
    public final View o1;
    public final TextView p1;
    public final org.telegram.ui.ActionBar.d2 q1;
    public boolean r1;
    public final Paint s1;
    public int t1;
    public AnimatorSet u1;
    public AnimatorSet v1;
    public final int w1;
    public final int x1;
    public final int y1;
    public final int z1;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f1  */
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
    public vc0(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.d5 d5Var, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, (Context) d2Var.getParentActivity(), e6Var, false);
        ArrayList e22;
        ArrayList<TLRPC.RestrictionReason> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i3;
        final int i10;
        this.s1 = new Paint(1);
        this.D1 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.E1 = arrayList4;
        String str4 = str2;
        String str5 = str3;
        String m10 = org.telegram.messenger.g5.m(0, str4, str5);
        ArrayList arrayList5 = new ArrayList();
        if (uri != null) {
            e22 = org.telegram.messenger.g0.e2(uri, this.a, false, arrayList5, m10);
        } else if (file != null) {
            e22 = org.telegram.messenger.g0.e2(Uri.fromFile(file), this.a, false, arrayList5, m10);
            file.delete();
            this.B1 = true;
        } else {
            if (str != null) {
                org.telegram.messenger.f0 f0Var = new org.telegram.messenger.f0();
                f0Var.c = 0;
                String concat = "TEL;MOBILE:+".concat(str);
                f0Var.b = concat;
                f0Var.a.add(concat);
                arrayList4.add(f0Var);
                this.B1 = true;
            } else {
                String str6 = d5Var.b;
                if (str6 != null) {
                    e22 = org.telegram.messenger.g0.e2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str6), this.a, true, arrayList5, m10);
                } else {
                    org.telegram.messenger.f0 f0Var2 = new org.telegram.messenger.f0();
                    f0Var2.c = 0;
                    String str7 = "TEL;MOBILE:+" + d5Var.m.phone;
                    f0Var2.b = str7;
                    f0Var2.a.add(str7);
                    arrayList4.add(f0Var2);
                }
            }
            e22 = null;
        }
        TLRPC.User user2 = (user != null || d5Var == null) ? user : d5Var.m;
        if (e22 != null) {
            for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                org.telegram.messenger.f0 f0Var3 = (org.telegram.messenger.f0) arrayList5.get(i11);
                if (f0Var3.c == 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= this.E1.size()) {
                            this.E1.add(f0Var3);
                            break;
                        } else {
                            if (((org.telegram.messenger.f0) this.E1.get(i12)).c(false).equals(f0Var3.c(false))) {
                                f0Var3.d = false;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    this.D1.add(f0Var3);
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
                this.F1 = tL_userContact_old2;
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
                this.q1 = d2Var;
                final Activity parentActivity = d2Var.getParentActivity();
                arrayList2 = this.D1;
                this.w1 = 1;
                arrayList3 = this.E1;
                if (arrayList3.size() <= 1 || !arrayList2.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        int i13 = this.w1;
                        this.x1 = i13;
                        int size = arrayList3.size() + i13;
                        this.w1 = size;
                        this.y1 = size;
                    } else {
                        this.x1 = -1;
                        this.y1 = -1;
                    }
                    if (arrayList2.isEmpty()) {
                        int i14 = this.w1;
                        this.z1 = i14;
                        int size2 = arrayList2.size() + i14;
                        this.w1 = size2;
                        this.A1 = size2;
                    } else {
                        this.z1 = -1;
                        this.A1 = -1;
                    }
                } else {
                    this.x1 = -1;
                    this.y1 = -1;
                    this.z1 = -1;
                    this.A1 = -1;
                }
                nc0 nc0Var = new nc0(this, parentActivity, parentActivity);
                nc0Var.setWillNotDraw(false);
                this.b = nc0Var;
                this.v0 = false;
                this.w0 = false;
                this.j1 = new nh(this, 3);
                oc0 oc0Var = new oc0(this, parentActivity);
                this.k1 = oc0Var;
                oc0Var.setClipToPadding(false);
                oc0Var.setVerticalScrollBarEnabled(false);
                nc0Var.addView(oc0Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
                LinearLayout linearLayout = new LinearLayout(parentActivity);
                this.l1 = linearLayout;
                linearLayout.setOrientation(1);
                oc0Var.addView(linearLayout, b8.mf.x(-1, -1, 51));
                oc0Var.setOnScrollChangeListener(new lc0(this));
                i3 = this.w1;
                for (i10 = 0; i10 < i3; i10++) {
                    ViewGroup z10 = this.j1.z(parentActivity, i10);
                    this.l1.addView(z10, b8.mf.o(-1, -2));
                    if ((i10 >= this.x1 && i10 < this.y1) || (i10 >= this.z1 && i10 < this.A1)) {
                        z10.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                        z10.setOnClickListener(new ai.h3(this, i10, z10, 13));
                        z10.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Components.mc0
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                org.telegram.messenger.f0 f0Var4;
                                vc0 vc0Var = vc0.this;
                                int i15 = i10;
                                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                Context context = parentActivity;
                                int i16 = vc0Var.x1;
                                if (i15 < i16 || i15 >= vc0Var.y1) {
                                    int i17 = vc0Var.z1;
                                    f0Var4 = (i15 < i17 || i15 >= vc0Var.A1) ? null : (org.telegram.messenger.f0) vc0Var.D1.get(i15 - i17);
                                } else {
                                    f0Var4 = (org.telegram.messenger.f0) vc0Var.E1.get(i15 - i16);
                                }
                                if (f0Var4 == null) {
                                    return false;
                                }
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f0Var4.c(false)));
                                if (fc.a(vc0Var.q1)) {
                                    if (f0Var4.c == 3) {
                                        new fc((FrameLayout) vc0Var.b, e6Var2).k(false).j();
                                        return true;
                                    }
                                    sb sbVar = new sb(context, e6Var2);
                                    int i18 = f0Var4.c;
                                    if (i18 == 0) {
                                        sbVar.b.setText(org.telegram.messenger.bd.M0(2131747303, null));
                                        sbVar.a.setImageResource(R.drawable.msg_calls);
                                    } else if (i18 == 1) {
                                        sbVar.b.setText(org.telegram.messenger.bd.M0(2131751204, null));
                                        sbVar.a.setImageResource(R.drawable.msg_mention);
                                    } else {
                                        sbVar.b.setText(org.telegram.messenger.bd.M0(2131744204, null));
                                        sbVar.a.setImageResource(R.drawable.msg_info);
                                    }
                                    if (org.telegram.messenger.g0.I3()) {
                                        ac.f((FrameLayout) vc0Var.b, sbVar, 1500).j();
                                    }
                                }
                                return true;
                            }
                        });
                    }
                }
                pc0 pc0Var = new pc0(this, parentActivity);
                this.m1 = pc0Var;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, pc0Var, e6Var);
                pc0Var.setBackButtonImage(R.drawable.ic_ab_back);
                int i15 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.m(pc0Var, 1, i15, e6Var);
                org.telegram.ui.ActionBar.r6.m(pc0Var, 3, org.telegram.ui.ActionBar.k6.I5, e6Var);
                org.telegram.ui.ActionBar.r6.m(pc0Var, 5, i15, e6Var);
                pc0Var.setOccupyStatusBar(false);
                pc0Var.setAlpha(0.0f);
                if (this.B1) {
                    pc0Var.setTitle(org.telegram.messenger.bd.M0(2131745470, null));
                } else {
                    pc0Var.setTitle(org.telegram.messenger.bd.M0(2131754449, null));
                }
                this.b.addView(pc0Var, b8.mf.c(-2.0f, -1));
                pc0Var.setActionBarMenuOnItemClick(new qc0(this));
                View view = new View(parentActivity);
                this.n1 = view;
                view.setAlpha(0.0f);
                int i16 = org.telegram.ui.ActionBar.k6.V5;
                org.telegram.ui.ActionBar.r6.i(i16, view, e6Var);
                this.b.addView(view, b8.mf.c(1.0f, -1));
                View view2 = new View(parentActivity);
                this.o1 = view2;
                org.telegram.ui.ActionBar.r6.i(i16, view2, e6Var);
                view2.setAlpha(0.0f);
                this.b.addView(view2, b8.mf.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
                TextView textView = new TextView(parentActivity);
                this.p1 = textView;
                textView.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                textView.setGravity(17);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, this.J0));
                textView.setTextSize(1, 14.0f);
                if (this.B1) {
                    textView.setText(org.telegram.messenger.bd.M0(2131745470, null));
                } else {
                    textView.setText(org.telegram.messenger.bd.M0(2131754449, null));
                }
                textView.setTypeface(org.telegram.messenger.g0.o());
                int L = org.telegram.messenger.g0.L(8.0f);
                int i17 = org.telegram.ui.ActionBar.k6.Ci;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i17, this.J0);
                int i18 = org.telegram.ui.ActionBar.k6.Ei;
                int w03 = org.telegram.ui.ActionBar.k6.w0(i18, this.J0);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i18);
                textView.setBackground(k02);
                org.telegram.ui.ActionBar.r6.k(textView, k02, N, N2, e6Var);
                nc0Var.addView(textView, b8.mf.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
                textView.setOnClickListener(new q2(24, this, e6Var));
            }
        }
        arrayList = null;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        this.F1 = tL_userContact_old22;
        if (user2 == null) {
        }
        this.q1 = d2Var;
        final Activity parentActivity2 = d2Var.getParentActivity();
        arrayList2 = this.D1;
        this.w1 = 1;
        arrayList3 = this.E1;
        if (arrayList3.size() <= 1) {
        }
        if (arrayList3.isEmpty()) {
        }
        if (arrayList2.isEmpty()) {
        }
        nc0 nc0Var2 = new nc0(this, parentActivity2, parentActivity2);
        nc0Var2.setWillNotDraw(false);
        this.b = nc0Var2;
        this.v0 = false;
        this.w0 = false;
        this.j1 = new nh(this, 3);
        oc0 oc0Var2 = new oc0(this, parentActivity2);
        this.k1 = oc0Var2;
        oc0Var2.setClipToPadding(false);
        oc0Var2.setVerticalScrollBarEnabled(false);
        nc0Var2.addView(oc0Var2, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout2 = new LinearLayout(parentActivity2);
        this.l1 = linearLayout2;
        linearLayout2.setOrientation(1);
        oc0Var2.addView(linearLayout2, b8.mf.x(-1, -1, 51));
        oc0Var2.setOnScrollChangeListener(new lc0(this));
        i3 = this.w1;
        while (i10 < i3) {
        }
        pc0 pc0Var2 = new pc0(this, parentActivity2);
        this.m1 = pc0Var2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, pc0Var2, e6Var);
        pc0Var2.setBackButtonImage(R.drawable.ic_ab_back);
        int i152 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.m(pc0Var2, 1, i152, e6Var);
        org.telegram.ui.ActionBar.r6.m(pc0Var2, 3, org.telegram.ui.ActionBar.k6.I5, e6Var);
        org.telegram.ui.ActionBar.r6.m(pc0Var2, 5, i152, e6Var);
        pc0Var2.setOccupyStatusBar(false);
        pc0Var2.setAlpha(0.0f);
        if (this.B1) {
        }
        this.b.addView(pc0Var2, b8.mf.c(-2.0f, -1));
        pc0Var2.setActionBarMenuOnItemClick(new qc0(this));
        View view3 = new View(parentActivity2);
        this.n1 = view3;
        view3.setAlpha(0.0f);
        int i162 = org.telegram.ui.ActionBar.k6.V5;
        org.telegram.ui.ActionBar.r6.i(i162, view3, e6Var);
        this.b.addView(view3, b8.mf.c(1.0f, -1));
        View view22 = new View(parentActivity2);
        this.o1 = view22;
        org.telegram.ui.ActionBar.r6.i(i162, view22, e6Var);
        view22.setAlpha(0.0f);
        this.b.addView(view22, b8.mf.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView2 = new TextView(parentActivity2);
        this.p1 = textView2;
        textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, this.J0));
        textView2.setTextSize(1, 14.0f);
        if (this.B1) {
        }
        textView2.setTypeface(org.telegram.messenger.g0.o());
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int i172 = org.telegram.ui.ActionBar.k6.Ci;
        int w022 = org.telegram.ui.ActionBar.k6.w0(i172, this.J0);
        int i182 = org.telegram.ui.ActionBar.k6.Ei;
        int w032 = org.telegram.ui.ActionBar.k6.w0(i182, this.J0);
        org.telegram.ui.Cells.y k022 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, w022, w032, w032);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i172);
        org.telegram.ui.ActionBar.n6 N22 = org.telegram.ui.ActionBar.r6.N(i182);
        textView2.setBackground(k022);
        org.telegram.ui.ActionBar.r6.k(textView2, k022, N3, N22, e6Var);
        nc0Var2.addView(textView2, b8.mf.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView2.setOnClickListener(new q2(24, this, e6Var));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public final void I0() {
        TextView textView = this.p1;
        if (textView == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, this.J0);
        if (!textView.isEnabled()) {
            w02 &= ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (textView.getCurrentTextColor() != w02) {
            textView.setTextColor(w02);
        }
    }

    public final void J0(boolean z10) {
        oc0 oc0Var = this.k1;
        View childAt = oc0Var.getChildAt(0);
        int top = childAt.getTop() - oc0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z11 = top <= 0;
        pc0 pc0Var = this.m1;
        if ((z11 && pc0Var.getTag() == null) || (!z11 && pc0Var.getTag() != null)) {
            pc0Var.setTag(z11 ? r2 : null);
            AnimatorSet animatorSet = this.u1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.u1 = null;
            }
            View view = this.n1;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.u1 = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.u1;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(pc0Var, (Property<pc0, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
                this.u1.addListener(new sc0(this, 0));
                this.u1.start();
            } else {
                pc0Var.setAlpha(z11 ? 1.0f : 0.0f);
                view.setAlpha(z11 ? 1.0f : 0.0f);
            }
        }
        if (this.t1 != top) {
            this.t1 = top;
            this.b.invalidate();
        }
        childAt.getBottom();
        oc0Var.getMeasuredHeight();
        boolean z12 = childAt.getBottom() - oc0Var.getScrollY() > oc0Var.getMeasuredHeight();
        View view2 = this.o1;
        if (!(z12 && view2.getTag() == null) && (z12 || view2.getTag() == null)) {
            return;
        }
        view2.setTag(z12 ? 1 : null);
        AnimatorSet animatorSet4 = this.v1;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.v1 = null;
        }
        if (!z10) {
            view2.setAlpha(z12 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.v1 = animatorSet5;
        animatorSet5.setDuration(180L);
        this.v1.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, z12 ? 1.0f : 0.0f));
        this.v1.addListener(new sc0(this, 1));
        this.v1.start();
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        ac.a((FrameLayout) this.b, new ai.y(9));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        ac.h((FrameLayout) this.b);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            I0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
