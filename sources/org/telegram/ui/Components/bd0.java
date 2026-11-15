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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bd0 extends org.telegram.ui.ActionBar.u2 {
    public static final /* synthetic */ int J1 = 0;
    public final int A1;
    public final int B1;
    public final int C1;
    public final int D1;
    public final boolean E1;
    public dj F1;
    public final ArrayList G1;
    public final ArrayList H1;
    public final TLRPC.TL_userContact_old2 I1;
    public final cf m1;
    public final uc0 n1;
    public final LinearLayout o1;
    public final vc0 p1;
    public final View q1;
    public final View r1;
    public final TextView s1;
    public final org.telegram.ui.ActionBar.e2 t1;
    public boolean u1;
    public final Paint v1;
    public int w1;
    public AnimatorSet x1;
    public AnimatorSet y1;
    public final int z1;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bd0(org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.d5 d5Var, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, (Context) e2Var.getParentActivity(), e6Var, false);
        ArrayList e22;
        ArrayList<TLRPC.RestrictionReason> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i7;
        final int i10;
        this.v1 = new Paint(1);
        this.G1 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.H1 = arrayList4;
        String str4 = str2;
        String str5 = str3;
        String m10 = org.telegram.messenger.g5.m(0, str4, str5);
        ArrayList arrayList5 = new ArrayList();
        if (uri != null) {
            e22 = org.telegram.messenger.g0.e2(uri, this.a, false, arrayList5, m10);
        } else if (file != null) {
            e22 = org.telegram.messenger.g0.e2(Uri.fromFile(file), this.a, false, arrayList5, m10);
            file.delete();
            this.E1 = true;
        } else {
            if (str != null) {
                org.telegram.messenger.f0 f0Var = new org.telegram.messenger.f0();
                f0Var.c = 0;
                String concat = "TEL;MOBILE:+".concat(str);
                f0Var.b = concat;
                f0Var.a.add(concat);
                arrayList4.add(f0Var);
                this.E1 = true;
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
                        if (i12 >= this.H1.size()) {
                            this.H1.add(f0Var3);
                            break;
                        } else {
                            if (((org.telegram.messenger.f0) this.H1.get(i12)).c(false).equals(f0Var3.c(false))) {
                                f0Var3.d = false;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    this.G1.add(f0Var3);
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
                this.I1 = tL_userContact_old2;
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
                this.t1 = e2Var;
                final Activity parentActivity = e2Var.getParentActivity();
                arrayList2 = this.G1;
                this.z1 = 1;
                arrayList3 = this.H1;
                if (arrayList3.size() <= 1 || !arrayList2.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        int i13 = this.z1;
                        this.A1 = i13;
                        int size = arrayList3.size() + i13;
                        this.z1 = size;
                        this.B1 = size;
                    } else {
                        this.A1 = -1;
                        this.B1 = -1;
                    }
                    if (arrayList2.isEmpty()) {
                        int i14 = this.z1;
                        this.C1 = i14;
                        int size2 = arrayList2.size() + i14;
                        this.z1 = size2;
                        this.D1 = size2;
                    } else {
                        this.C1 = -1;
                        this.D1 = -1;
                    }
                } else {
                    this.A1 = -1;
                    this.B1 = -1;
                    this.C1 = -1;
                    this.D1 = -1;
                }
                tc0 tc0Var = new tc0(this, parentActivity, parentActivity);
                tc0Var.setWillNotDraw(false);
                this.b = tc0Var;
                this.v0 = false;
                this.w0 = false;
                this.m1 = new cf(this);
                uc0 uc0Var = new uc0(this, parentActivity);
                this.n1 = uc0Var;
                uc0Var.setClipToPadding(false);
                uc0Var.setVerticalScrollBarEnabled(false);
                tc0Var.addView(uc0Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
                LinearLayout linearLayout = new LinearLayout(parentActivity);
                this.o1 = linearLayout;
                linearLayout.setOrientation(1);
                uc0Var.addView(linearLayout, c8.ja.x(-1, -1, 51));
                uc0Var.setOnScrollChangeListener(new rc0(this));
                i7 = this.z1;
                for (i10 = 0; i10 < i7; i10++) {
                    ViewGroup n10 = this.m1.n(parentActivity, i10);
                    this.o1.addView(n10, c8.ja.o(-1, -2));
                    if ((i10 >= this.A1 && i10 < this.B1) || (i10 >= this.C1 && i10 < this.D1)) {
                        n10.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                        n10.setOnClickListener(new bi.x2(this, i10, n10, 14));
                        n10.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Components.sc0
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                org.telegram.messenger.f0 f0Var4;
                                bd0 bd0Var = bd0.this;
                                int i15 = i10;
                                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                Context context = parentActivity;
                                int i16 = bd0Var.A1;
                                if (i15 < i16 || i15 >= bd0Var.B1) {
                                    int i17 = bd0Var.C1;
                                    f0Var4 = (i15 < i17 || i15 >= bd0Var.D1) ? null : (org.telegram.messenger.f0) bd0Var.G1.get(i15 - i17);
                                } else {
                                    f0Var4 = (org.telegram.messenger.f0) bd0Var.H1.get(i15 - i16);
                                }
                                if (f0Var4 == null) {
                                    return false;
                                }
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f0Var4.c(false)));
                                if (cc.a(bd0Var.t1)) {
                                    if (f0Var4.c == 3) {
                                        new cc((FrameLayout) bd0Var.b, e6Var2).k(false).j();
                                        return true;
                                    }
                                    pb pbVar = new pb(context, e6Var2);
                                    int i18 = f0Var4.c;
                                    if (i18 == 0) {
                                        pbVar.b.setText(org.telegram.messenger.hd.M0(2131747295, null));
                                        pbVar.a.setImageResource(R.drawable.msg_calls);
                                    } else if (i18 == 1) {
                                        pbVar.b.setText(org.telegram.messenger.hd.M0(2131751203, null));
                                        pbVar.a.setImageResource(R.drawable.msg_mention);
                                    } else {
                                        pbVar.b.setText(org.telegram.messenger.hd.M0(2131744194, null));
                                        pbVar.a.setImageResource(R.drawable.msg_info);
                                    }
                                    if (org.telegram.messenger.g0.H3()) {
                                        xb.f((FrameLayout) bd0Var.b, pbVar, 1500).j();
                                    }
                                }
                                return true;
                            }
                        });
                    }
                }
                vc0 vc0Var = new vc0(this, parentActivity);
                this.p1 = vc0Var;
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, vc0Var, e6Var);
                vc0Var.setBackButtonImage(R.drawable.ic_ab_back);
                int i15 = org.telegram.ui.ActionBar.j6.j5;
                org.telegram.ui.ActionBar.q6.l(vc0Var, 1, i15, e6Var);
                org.telegram.ui.ActionBar.q6.l(vc0Var, 3, org.telegram.ui.ActionBar.j6.I5, e6Var);
                org.telegram.ui.ActionBar.q6.l(vc0Var, 5, i15, e6Var);
                vc0Var.setOccupyStatusBar(false);
                vc0Var.setAlpha(0.0f);
                if (this.E1) {
                    vc0Var.setTitle(org.telegram.messenger.hd.M0(2131745460, null));
                } else {
                    vc0Var.setTitle(org.telegram.messenger.hd.M0(2131754449, null));
                }
                this.b.addView(vc0Var, c8.ja.c(-2.0f, -1));
                vc0Var.setActionBarMenuOnItemClick(new wc0(this));
                View view = new View(parentActivity);
                this.q1 = view;
                view.setAlpha(0.0f);
                int i16 = org.telegram.ui.ActionBar.j6.V5;
                org.telegram.ui.ActionBar.q6.h(i16, view, e6Var);
                this.b.addView(view, c8.ja.c(1.0f, -1));
                View view2 = new View(parentActivity);
                this.r1 = view2;
                org.telegram.ui.ActionBar.q6.h(i16, view2, e6Var);
                view2.setAlpha(0.0f);
                this.b.addView(view2, c8.ja.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
                TextView textView = new TextView(parentActivity);
                this.s1 = textView;
                textView.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                textView.setGravity(17);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ji, this.J0));
                textView.setTextSize(1, 14.0f);
                if (this.E1) {
                    textView.setText(org.telegram.messenger.hd.M0(2131745460, null));
                } else {
                    textView.setText(org.telegram.messenger.hd.M0(2131754449, null));
                }
                textView.setTypeface(org.telegram.messenger.g0.o());
                int L = org.telegram.messenger.g0.L(8.0f);
                int i17 = org.telegram.ui.ActionBar.j6.Fi;
                int w02 = org.telegram.ui.ActionBar.j6.w0(i17, this.J0);
                int i18 = org.telegram.ui.ActionBar.j6.Hi;
                int w03 = org.telegram.ui.ActionBar.j6.w0(i18, this.J0);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, w03, w03);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i17);
                org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i18);
                textView.setBackground(k02);
                org.telegram.ui.ActionBar.q6.j(textView, k02, M, M2, e6Var);
                tc0Var.addView(textView, c8.ja.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
                textView.setOnClickListener(new n2(25, this, e6Var));
            }
        }
        arrayList = null;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        this.I1 = tL_userContact_old22;
        if (user2 == null) {
        }
        this.t1 = e2Var;
        final Activity parentActivity2 = e2Var.getParentActivity();
        arrayList2 = this.G1;
        this.z1 = 1;
        arrayList3 = this.H1;
        if (arrayList3.size() <= 1) {
        }
        if (arrayList3.isEmpty()) {
        }
        if (arrayList2.isEmpty()) {
        }
        tc0 tc0Var2 = new tc0(this, parentActivity2, parentActivity2);
        tc0Var2.setWillNotDraw(false);
        this.b = tc0Var2;
        this.v0 = false;
        this.w0 = false;
        this.m1 = new cf(this);
        uc0 uc0Var2 = new uc0(this, parentActivity2);
        this.n1 = uc0Var2;
        uc0Var2.setClipToPadding(false);
        uc0Var2.setVerticalScrollBarEnabled(false);
        tc0Var2.addView(uc0Var2, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout2 = new LinearLayout(parentActivity2);
        this.o1 = linearLayout2;
        linearLayout2.setOrientation(1);
        uc0Var2.addView(linearLayout2, c8.ja.x(-1, -1, 51));
        uc0Var2.setOnScrollChangeListener(new rc0(this));
        i7 = this.z1;
        while (i10 < i7) {
        }
        vc0 vc0Var2 = new vc0(this, parentActivity2);
        this.p1 = vc0Var2;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, vc0Var2, e6Var);
        vc0Var2.setBackButtonImage(R.drawable.ic_ab_back);
        int i152 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.l(vc0Var2, 1, i152, e6Var);
        org.telegram.ui.ActionBar.q6.l(vc0Var2, 3, org.telegram.ui.ActionBar.j6.I5, e6Var);
        org.telegram.ui.ActionBar.q6.l(vc0Var2, 5, i152, e6Var);
        vc0Var2.setOccupyStatusBar(false);
        vc0Var2.setAlpha(0.0f);
        if (this.E1) {
        }
        this.b.addView(vc0Var2, c8.ja.c(-2.0f, -1));
        vc0Var2.setActionBarMenuOnItemClick(new wc0(this));
        View view3 = new View(parentActivity2);
        this.q1 = view3;
        view3.setAlpha(0.0f);
        int i162 = org.telegram.ui.ActionBar.j6.V5;
        org.telegram.ui.ActionBar.q6.h(i162, view3, e6Var);
        this.b.addView(view3, c8.ja.c(1.0f, -1));
        View view22 = new View(parentActivity2);
        this.r1 = view22;
        org.telegram.ui.ActionBar.q6.h(i162, view22, e6Var);
        view22.setAlpha(0.0f);
        this.b.addView(view22, c8.ja.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView2 = new TextView(parentActivity2);
        this.s1 = textView2;
        textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ji, this.J0));
        textView2.setTextSize(1, 14.0f);
        if (this.E1) {
        }
        textView2.setTypeface(org.telegram.messenger.g0.o());
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int i172 = org.telegram.ui.ActionBar.j6.Fi;
        int w022 = org.telegram.ui.ActionBar.j6.w0(i172, this.J0);
        int i182 = org.telegram.ui.ActionBar.j6.Hi;
        int w032 = org.telegram.ui.ActionBar.j6.w0(i182, this.J0);
        org.telegram.ui.Cells.y k022 = org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, w022, w032, w032);
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i172);
        org.telegram.ui.ActionBar.m6 M22 = org.telegram.ui.ActionBar.q6.M(i182);
        textView2.setBackground(k022);
        org.telegram.ui.ActionBar.q6.j(textView2, k022, M3, M22, e6Var);
        tc0Var2.addView(textView2, c8.ja.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView2.setOnClickListener(new n2(25, this, e6Var));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    public final void I0() {
        TextView textView = this.s1;
        if (textView == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ji, this.J0);
        if (!textView.isEnabled()) {
            w02 &= ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (textView.getCurrentTextColor() != w02) {
            textView.setTextColor(w02);
        }
    }

    public final void J0(boolean z10) {
        uc0 uc0Var = this.n1;
        View childAt = uc0Var.getChildAt(0);
        int top = childAt.getTop() - uc0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z11 = top <= 0;
        vc0 vc0Var = this.p1;
        if ((z11 && vc0Var.getTag() == null) || (!z11 && vc0Var.getTag() != null)) {
            vc0Var.setTag(z11 ? r2 : null);
            AnimatorSet animatorSet = this.x1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.x1 = null;
            }
            View view = this.q1;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.x1 = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.x1;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(vc0Var, (Property<vc0, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
                this.x1.addListener(new yc0(this, 0));
                this.x1.start();
            } else {
                vc0Var.setAlpha(z11 ? 1.0f : 0.0f);
                view.setAlpha(z11 ? 1.0f : 0.0f);
            }
        }
        if (this.w1 != top) {
            this.w1 = top;
            this.b.invalidate();
        }
        childAt.getBottom();
        uc0Var.getMeasuredHeight();
        boolean z12 = childAt.getBottom() - uc0Var.getScrollY() > uc0Var.getMeasuredHeight();
        View view2 = this.r1;
        if (!(z12 && view2.getTag() == null) && (z12 || view2.getTag() == null)) {
            return;
        }
        view2.setTag(z12 ? 1 : null);
        AnimatorSet animatorSet4 = this.y1;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.y1 = null;
        }
        if (!z10) {
            view2.setAlpha(z12 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.y1 = animatorSet5;
        animatorSet5.setDuration(180L);
        this.y1.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, z12 ? 1.0f : 0.0f));
        this.y1.addListener(new yc0(this, 1));
        this.y1.start();
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        xb.a((FrameLayout) this.b, new bi.t(9));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        xb.h((FrameLayout) this.b);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        try {
            I0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
