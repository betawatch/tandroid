package org.telegram.ui;

import android.animation.Animator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class me0 extends rb1 implements org.telegram.messenger.ls, te.b {
    public db1 D;
    public FrameLayout E;
    public oe0 F;
    public fh.g G;
    public View H;
    public Integer I;
    public zw J;
    public qh.b[] K;
    public int L;
    public int M;
    public int N;
    public ab.b0 O;
    public fi.m3 P;
    public boolean Q;
    public final ri.c R;
    public final ri.f S;
    public final ri.f T;
    public org.telegram.ui.Components.z41 x;
    public boolean y;
    public final te.a w = new te.a(0, this, org.telegram.ui.Components.wq.h, 380, true);
    public final RectF U = new RectF();
    public final RectF V = new RectF();
    public final ie0 W = new ie0(this, 0);

    public me0() {
        if (Build.VERSION.SDK_INT >= 31) {
            ri.f fVar = new ri.f(null);
            ca.i iVar = new ca.i(this, false);
            if (fVar.c == null) {
                fVar.c = new dh.i(fVar.b, iVar);
            }
            this.S = fVar;
            ri.f fVar2 = new ri.f(null);
            ca.i iVar2 = new ca.i(this, true);
            if (fVar2.c == null) {
                fVar2.c = new dh.i(fVar2.b, iVar2);
            }
            this.T = fVar2;
        } else {
            this.S = null;
            this.T = null;
        }
        this.R = new ri.c();
        y8 y8Var = new y8(this, 5);
        setBulletinDelegate(y8Var);
        org.telegram.ui.Components.bc.a(this.b, y8Var);
    }

    public static /* synthetic */ void d0(me0 me0Var, int i7, org.telegram.ui.Components.k60 k60Var) {
        if (me0Var.currentAccount == i7) {
            return;
        }
        k60Var.u();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.O0(i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v23 */
    public static boolean e0(me0 me0Var, View view) {
        ArrayList T0;
        boolean z9;
        int i7;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ?? r22 = 0;
        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null && (T0 = me0Var.getMessagesController().T0()) != null) {
            boolean z11 = true;
            if (T0.size() > 1) {
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(me0Var, view);
                int i10 = 0;
                while (i10 < T0.size()) {
                    org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.get(i10);
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, me0Var.getParentActivity(), me0Var.getResourceProvider(), false, false);
                    z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), r22, org.telegram.messenger.g0.L(18.0f), r22);
                    CharSequence m10 = org.telegram.messenger.i6.m(voVar.e() ? org.telegram.messenger.id.M0(2131750807, null) : voVar.b, z0Var.getTextView().getPaint().getFontMetricsInt(), r22, null, r22);
                    if (!voVar.e()) {
                        m10 = org.telegram.messenger.ij.B5(m10, voVar.c, z0Var.getTextView().getPaint().getFontMetricsInt(), r22);
                    }
                    int i11 = voVar.e() ? org.telegram.messenger.yr.a0(me0Var.currentAccount).K : voVar.d;
                    if (i11 > 0) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) String.valueOf(i11));
                        org.telegram.messenger.qp messagesController = me0Var.getMessagesController();
                        if (voVar.e()) {
                            z9 = z11;
                            arrayList = messagesController.W0(r22);
                        } else {
                            z9 = z11;
                            arrayList = messagesController.y;
                        }
                        int i12 = r22;
                        while (true) {
                            if (i12 >= arrayList.size()) {
                                i7 = i10;
                                z10 = false;
                                break;
                            }
                            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i12);
                            if (voVar.e()) {
                                arrayList2 = arrayList;
                                i7 = i10;
                            } else {
                                long j3 = dialog.id;
                                if (org.telegram.messenger.m5.C(j3)) {
                                    arrayList2 = arrayList;
                                    i7 = i10;
                                    TLRPC.EncryptedChat a12 = messagesController.a1(Integer.valueOf((int) (j3 & 4294967295L)));
                                    if (a12 != null) {
                                        j3 = a12.user_id;
                                    }
                                } else {
                                    arrayList2 = arrayList;
                                    i7 = i10;
                                }
                                if (!voVar.c(me0Var.getAccountInstance(), j3, dialog)) {
                                    continue;
                                    i12++;
                                    i10 = i7;
                                    arrayList = arrayList2;
                                }
                            }
                            if ((messagesController.V0(dialog) > 0 || dialog.unread_mark) && !messagesController.r2(dialog.id, 0L, null)) {
                                z10 = z9 ? 1 : 0;
                                break;
                            }
                            i12++;
                            i10 = i7;
                            arrayList = arrayList2;
                        }
                        spannableStringBuilder.setSpan(new ke0(me0Var, i11, z10), length, spannableStringBuilder.length(), 33);
                        String M0 = voVar.e() ? org.telegram.messenger.id.M0(2131750807, null) : voVar.b;
                        String G = org.telegram.messenger.id.G(i11, "AccDescrUnreadCount", new Object[0]);
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = M0;
                        charSequenceArr[z9 ? 1 : 0] = "\n";
                        charSequenceArr[2] = G;
                        z0Var.setContentDescription(TextUtils.concat(charSequenceArr));
                        m10 = spannableStringBuilder;
                    } else {
                        z9 = z11;
                        i7 = i10;
                    }
                    z0Var.setEmojiCacheType(voVar.n ? 26 : 0);
                    z0Var.j(m10, 0, new org.telegram.ui.Components.wz(me0Var.getParentActivity(), R.drawable.msg_folders, me0Var.getMessagesController().A7 ? voVar.m : -1));
                    z0Var.getTextView().setEmojiColor(me0Var.getThemedColor(org.telegram.ui.ActionBar.m6.Ci));
                    z0Var.setMinimumWidth(org.telegram.messenger.qs.q2);
                    z0Var.setOnClickListener(new z(me0Var, H, voVar, 11));
                    H.r(z0Var, c8.ha.o(-1, -2));
                    i10 = i7 + 1;
                    z11 = z9;
                    r22 = 0;
                }
                boolean z12 = z11;
                H.a0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(4.0f));
                H.X = org.telegram.messenger.g0.L(400.0f);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
                H.W(d02);
                H.i = 3;
                H.Z();
                return z12;
            }
        }
        return false;
    }

    public static void f0(me0 me0Var) {
        org.telegram.messenger.p10 userConfig = me0Var.getUserConfig();
        if (!userConfig.W) {
            userConfig.W = true;
            userConfig.v(false);
        }
        me0Var.m0(true, true);
        org.telegram.messenger.qs.f(me0Var.currentAccount).k(org.telegram.messenger.qs.O5, new Object[0]);
    }

    public static void g0(me0 me0Var) {
        me0Var.getClass();
        int i7 = 0;
        Integer num = null;
        for (int i10 = 3; i10 >= 0; i10--) {
            if (!org.telegram.messenger.p10.i(i10).p()) {
                i7++;
                if (num == null) {
                    num = Integer.valueOf(i10);
                }
            }
        }
        if (!org.telegram.messenger.p10.o()) {
            i7--;
        }
        if (i7 > 0 && num != null) {
            me0Var.presentFragment(new fe0(num.intValue()));
        } else {
            if (org.telegram.messenger.p10.o()) {
                return;
            }
            me0Var.showDialog(new ug.i0(7, me0Var.currentAccount, me0Var.getParentActivity(), me0Var, null));
        }
    }

    public static void h0(me0 me0Var) {
        org.telegram.messenger.p10 userConfig = me0Var.getUserConfig();
        if (userConfig.W) {
            userConfig.W = false;
            userConfig.v(false);
        }
        me0Var.m0(false, true);
        org.telegram.messenger.qs.f(me0Var.currentAccount).k(org.telegram.messenger.qs.O5, new Object[0]);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            o0();
            n0();
        }
    }

    @Override // org.telegram.ui.rb1
    public final org.telegram.ui.ActionBar.f2 a0(int i7) {
        if (i7 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i7 == 2) {
            if (!getUserConfig().W) {
                return new o31(a8.p0.k("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new i9(bundle2);
        }
        if (i7 == 0) {
            zw zwVar = new zw(a8.p0.k("hasMainTabs", true));
            this.J = zwVar;
            zwVar.J3 = new f(this, 23);
            return zwVar;
        }
        if (i7 != 3) {
            return null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("user_id", org.telegram.messenger.p10.i(this.currentAccount).e());
        bundle3.putBoolean("my_profile", true);
        bundle3.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle3, null);
    }

    @Override // org.telegram.ui.rb1, org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        return c02 != null && c02.canBeginSlide();
    }

    @Override // org.telegram.ui.rb1, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        super.createView(context);
        oe0 oe0Var = new oe0(context, this.resourceProvider);
        this.F = oe0Var;
        final int i7 = 0;
        oe0Var.setClipChildren(false);
        this.F.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.F.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        qh.b[] bVarArr = new qh.b[5];
        this.K = bVarArr;
        bVarArr[0] = qh.b.c(context, this.resourceProvider, qh.a.n, 2131748707);
        final int i10 = 1;
        this.K[1] = qh.b.c(context, this.resourceProvider, qh.a.f, 2131748706);
        final int i11 = 2;
        this.K[2] = qh.b.c(context, this.resourceProvider, qh.a.r, 2131745495);
        final int i12 = 3;
        this.K[3] = qh.b.c(context, this.resourceProvider, qh.a.h, 2131748708);
        qh.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.h6 h6Var = this.resourceProvider;
        int i13 = this.currentAccount;
        qh.b bVar = new qh.b(context);
        bVar.a.setText(org.telegram.messenger.id.M0(2131748705, null));
        bVar.b.setVisibility(8);
        TLRPC.User a22 = org.telegram.messenger.qp.s1(i13).a2(Long.valueOf(org.telegram.messenger.p10.i(i13).e()));
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8(0, a22);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.e(a22, v8Var);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        bVar.c = k9Var;
        bVar.addView(k9Var, c8.ha.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ql, h6Var);
        bVar.s = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ol, h6Var);
        bVar.w = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Pl, h6Var);
        bVar.a();
        bVarArr2[4] = bVar;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.je0
            public final /* synthetic */ me0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i7;
                int i15 = 3;
                me0 me0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(me0Var, view);
                            H.c(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(2131748283, null), new ie0(me0Var, 6), false);
                            H.c(R.drawable.msg_calls, org.telegram.messenger.id.M0(2131743439, null), new ie0(me0Var, 7), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            H.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
                            H.W(d02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.k60 H2 = org.telegram.ui.Components.k60.H(me0Var, view);
                            H2.c(R.drawable.menu_call_create, org.telegram.messenger.id.M0(2131749490, null), new ie0(me0Var, 2), false);
                            if (me0Var.getUserConfig().W) {
                                H2.c(R.drawable.msg_archive_hide, org.telegram.messenger.id.M0(2131749322, null), new ie0(me0Var, i15), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.id.M0(2131749461, null), new ie0(me0Var, 4), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
                            H2.W(d03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        me0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.je0
            public final /* synthetic */ me0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i10;
                int i15 = 3;
                me0 me0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(me0Var, view);
                            H.c(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(2131748283, null), new ie0(me0Var, 6), false);
                            H.c(R.drawable.msg_calls, org.telegram.messenger.id.M0(2131743439, null), new ie0(me0Var, 7), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            H.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
                            H.W(d02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.k60 H2 = org.telegram.ui.Components.k60.H(me0Var, view);
                            H2.c(R.drawable.menu_call_create, org.telegram.messenger.id.M0(2131749490, null), new ie0(me0Var, 2), false);
                            if (me0Var.getUserConfig().W) {
                                H2.c(R.drawable.msg_archive_hide, org.telegram.messenger.id.M0(2131749322, null), new ie0(me0Var, i15), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.id.M0(2131749461, null), new ie0(me0Var, 4), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
                            H2.W(d03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        me0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.je0
            public final /* synthetic */ me0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i11;
                int i15 = 3;
                me0 me0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(me0Var, view);
                            H.c(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(2131748283, null), new ie0(me0Var, 6), false);
                            H.c(R.drawable.msg_calls, org.telegram.messenger.id.M0(2131743439, null), new ie0(me0Var, 7), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            H.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
                            H.W(d02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.k60 H2 = org.telegram.ui.Components.k60.H(me0Var, view);
                            H2.c(R.drawable.menu_call_create, org.telegram.messenger.id.M0(2131749490, null), new ie0(me0Var, 2), false);
                            if (me0Var.getUserConfig().W) {
                                H2.c(R.drawable.msg_archive_hide, org.telegram.messenger.id.M0(2131749322, null), new ie0(me0Var, i15), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.id.M0(2131749461, null), new ie0(me0Var, 4), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
                            H2.W(d03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        me0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.K[4].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.je0
            public final /* synthetic */ me0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i12;
                int i15 = 3;
                me0 me0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(me0Var, view);
                            H.c(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(2131748283, null), new ie0(me0Var, 6), false);
                            H.c(R.drawable.msg_calls, org.telegram.messenger.id.M0(2131743439, null), new ie0(me0Var, 7), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            H.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
                            H.W(d02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.k60 H2 = org.telegram.ui.Components.k60.H(me0Var, view);
                            H2.c(R.drawable.menu_call_create, org.telegram.messenger.id.M0(2131749490, null), new ie0(me0Var, 2), false);
                            if (me0Var.getUserConfig().W) {
                                H2.c(R.drawable.msg_archive_hide, org.telegram.messenger.id.M0(2131749322, null), new ie0(me0Var, i15), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.id.M0(2131749461, null), new ie0(me0Var, 4), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
                            H2.W(d03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        me0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.F.P.add(this.K[0]);
        this.F.P.add(this.K[1]);
        this.F.P.add(this.K[4]);
        this.F.P.add(this.K[3]);
        int i14 = 0;
        while (true) {
            qh.b[] bVarArr3 = this.K;
            if (i14 >= bVarArr3.length) {
                break;
            }
            qh.b bVar2 = bVarArr3[i14];
            bVar2.setOnClickListener(new ai.v(this, i14 > 2 ? i14 - 1 : i14, 25));
            this.F.addView(this.K[i14]);
            this.F.i(bVar2, true, false);
            i14++;
        }
        m0(getUserConfig().W, false);
        s0(this.c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.d6);
        ri.c cVar = this.R;
        cVar.a(themedColor);
        jh.k kVar = new jh.k(this.b);
        ri.a aVar = this.S;
        if (aVar == null) {
            aVar = cVar;
        }
        ri.a aVar2 = this.T;
        if (aVar2 == null) {
            aVar2 = cVar;
        }
        dh.c cVar2 = new dh.c(aVar, aVar2, cVar);
        k0 k0Var = this.b;
        cVar2.h = kVar;
        cVar2.i = k0Var;
        cVar2.k = true;
        fh.g c10 = cVar2.c(this.F, c8.g0.f(this.resourceProvider), false);
        this.G = c10;
        c10.r(org.telegram.messenger.g0.L(28.0f));
        this.G.q(org.telegram.messenger.g0.L(7.666f));
        this.F.setBackground(this.G);
        dh.c cVar3 = new dh.c(cVar, cVar, cVar);
        k0 k0Var2 = this.b;
        cVar3.h = kVar;
        cVar3.i = k0Var2;
        this.H = new View(context);
        dh.d dVar = new dh.d(cVar3.c(this.H, null, false));
        dVar.b(org.telegram.messenger.g0.L(60.0f), true);
        this.H.setBackground(dVar);
        this.b.addView(this.H, c8.ha.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new bi.l1(19));
        this.E.addView(this.F, c8.ha.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.b.addView(this.E, c8.ha.e(-1, -2, 80));
        db1 db1Var = new db1(context);
        this.D = db1Var;
        this.b.addView(db1Var, c8.ha.e(-1, -2, 80));
        org.telegram.ui.Components.z41 z41Var = ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? new org.telegram.ui.Components.z41(getParentActivity(), this.D) : null;
        this.x = z41Var;
        if (z41Var != null) {
            z41Var.updateAppUpdateViews(this.currentAccount, false);
        }
        p0(false);
        return this.b;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        qh.b bVar;
        LaunchActivity launchActivity;
        boolean z9 = false;
        z9 = false;
        if (i7 == org.telegram.messenger.qs.G4 || i7 == org.telegram.messenger.qs.r) {
            View view = this.fragmentView;
            if (view != null && view.isAttachedToWindow()) {
                z9 = true;
            }
            p0(z9);
            return;
        }
        if (i7 == org.telegram.messenger.qs.R4) {
            org.telegram.ui.Components.z41 z41Var = this.x;
            if (z41Var != null) {
                z41Var.updateFileProgress(null);
                this.x.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.Y1) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.iz.j1;
            if (tL_help_appUpdate == null || tL_help_appUpdate.document == null) {
                return;
            }
            org.telegram.messenger.t0.u();
            return;
        }
        if (i7 == org.telegram.messenger.qs.Z1) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.iz.j1;
            if (tL_help_appUpdate2 == null || tL_help_appUpdate2.document == null) {
                return;
            }
            org.telegram.messenger.t0.u();
            return;
        }
        if (i7 == org.telegram.messenger.qs.X1) {
            org.telegram.ui.Components.z41 z41Var2 = this.x;
            if (z41Var2 != null) {
                z41Var2.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.Q4) {
            org.telegram.ui.Components.z41 z41Var3 = this.x;
            if (z41Var3 == null || (launchActivity = LaunchActivity.G1) == null) {
                return;
            }
            z41Var3.updateAppUpdateViews(this.currentAccount, launchActivity.d0.size() == 1);
            return;
        }
        if (i7 == org.telegram.messenger.qs.t4) {
            int currentPosition = this.c.getCurrentPosition();
            SparseArray sparseArray = this.a;
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                pb1 pb1Var = (pb1) sparseArray.valueAt(i11);
                if (sparseArray.keyAt(i11) != currentPosition && pb1Var != null) {
                    pb1Var.a.clearViews();
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.O5) {
            m0(getUserConfig().W, true);
            qb1 qb1Var = this.c;
            if (qb1Var == null || qb1Var.getCurrentPosition() != 2) {
                b0(2);
                return;
            }
            this.c.E(0);
            s0(0, true);
            this.y = true;
            return;
        }
        if (i7 != org.telegram.messenger.qs.j0) {
            if (i7 == org.telegram.messenger.qs.P5) {
                l0();
                return;
            }
            return;
        }
        qh.b[] bVarArr = this.K;
        if (bVarArr == null || (bVar = bVarArr[4]) == null) {
            return;
        }
        int i12 = this.currentAccount;
        TLRPC.User a22 = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(org.telegram.messenger.p10.i(i12).e()));
        bVar.c.e(a22, new org.telegram.ui.Components.v8(0, a22));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final Animator getCustomSlideTransition(boolean z9, boolean z10, float f10) {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null) {
            return c02.getCustomSlideTransition(z9, z10, f10);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.p3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.p3.c;
    }

    public final void i0() {
        ri.f fVar;
        View view;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31 || (fVar = this.S) == null || (view = this.fragmentView) == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = this.fragmentView.getMeasuredHeight();
        k0();
        oi.r f10 = oi.q.f();
        if (!f10.a) {
            fVar = null;
        } else if (!f10.b || i7 < 33) {
            fVar = this.T;
        }
        if (fVar != null) {
            fVar.n(measuredWidth, measuredHeight);
            fVar.c.a();
        }
    }

    public final void j0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.m6.d6);
        qb1 qb1Var = this.c;
        this.R.a(i0.a.f(qb1Var != null ? qb1Var.r(0) : 1.0f, themedColor, themedColor2));
        View view = this.H;
        if (view != null) {
            view.invalidate();
        }
        fh.g gVar = this.G;
        if (gVar != null) {
            gVar.updateColors();
        }
        i0();
        View view2 = this.H;
        if (view2 != null) {
            view2.invalidate();
        }
        oe0 oe0Var = this.F;
        if (oe0Var != null) {
            oe0Var.invalidate();
        }
        qh.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (qh.b bVar : bVarArr) {
                bVar.g();
            }
        }
    }

    public final void k0() {
        if (Build.VERSION.SDK_INT < 31 || this.S == null || this.b == null) {
            return;
        }
        db1 db1Var = this.D;
        int height = ((this.b.getHeight() - this.L) - ((db1Var == null || !db1Var.a()) ? 0 : org.telegram.messenger.g0.L(44.0f))) - org.telegram.messenger.g0.L(8.0f);
        int L = height - org.telegram.messenger.g0.L(56.0f);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.ui.ActionBar.f2 f2Var = ((pb1) sparseArray.valueAt(i7)).a;
            View view = f2Var.fragmentView;
            if (view != null && view.getWidth() > 0 && (f2Var instanceof le0)) {
                if (L >= view.getHeight()) {
                    f2Var.setParentGlass(null, null);
                } else {
                    float L2 = L - org.telegram.messenger.g0.L(1.0f);
                    float width = view.getWidth();
                    float L3 = org.telegram.messenger.g0.L(1.0f) + height;
                    RectF rectF = this.V;
                    rectF.set(0.0f, L2, width, L3);
                    f2Var.setParentGlass(rectF, this.W);
                }
            }
        }
    }

    public final void l0() {
        if (this.F == null || this.K[1] == null) {
            return;
        }
        boolean w10 = org.telegram.messenger.g5.w();
        if (w10) {
            org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts2", true).apply();
        }
        if (org.telegram.messenger.p10.i(this.currentAccount).U && !w10 && org.telegram.messenger.qp.f1().getBoolean("askAboutContacts2", true)) {
            this.K[1].e("!", true, true);
        } else {
            this.K[1].e(null, true, true);
        }
    }

    public final void m0(boolean z9, boolean z10) {
        oe0 oe0Var = this.F;
        if (oe0Var != null) {
            oe0Var.i(this.K[2], !z9, z10);
            this.F.i(this.K[3], z9, z10);
        }
    }

    public final void n0() {
        qb1 qb1Var = this.c;
        if (qb1Var == null || this.H == null) {
            return;
        }
        float a10 = 1.0f - c8.j9.a(Math.abs(3.0f - qb1Var.getPositionAnimated()), 0.0f, 1.0f);
        float T1 = (1.0f - ((1.0f - org.telegram.messenger.g0.T1(0.0f, 1.0f, org.telegram.messenger.g0.R0(this.L))) * a10)) * this.w.e;
        this.H.setAlpha(T1);
        this.H.setTranslationY(a10 * org.telegram.messenger.g0.L(48.0f));
        this.H.setVisibility(T1 > 0.0f ? 0 : 8);
    }

    public final void o0() {
        int L = org.telegram.messenger.g0.L(40.0f) + (-(this.D.a() ? org.telegram.messenger.g0.L(44.0f) : 0));
        float f10 = this.w.e;
        this.E.setTranslationY(org.telegram.messenger.g0.W1(f10, L, r0));
        this.F.setClickable(f10 > 1.0f);
        this.F.setEnabled(f10 > 1.0f);
        this.F.setAlpha(f10);
        this.F.setVisibility(f10 <= 0.0f ? 8 : 0);
    }

    @Override // org.telegram.ui.rb1, org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        boolean onBackPressed = super.onBackPressed(z9);
        if (onBackPressed && this.c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z9) {
                this.c.E(0);
            }
        }
        return onBackPressed;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null) {
            c02.onBeginSlide();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        ab.b0 b0Var = new ab.b0(org.telegram.messenger.qs.f(this.currentAccount), this);
        b0Var.c(org.telegram.messenger.qs.Y1);
        b0Var.c(org.telegram.messenger.qs.X1);
        b0Var.c(org.telegram.messenger.qs.Z1);
        b0Var.c(org.telegram.messenger.qs.G4);
        b0Var.c(org.telegram.messenger.qs.r);
        b0Var.c(org.telegram.messenger.qs.O5);
        b0Var.c(org.telegram.messenger.qs.j0);
        b0Var.c(org.telegram.messenger.qs.P5);
        b0Var.e(org.telegram.messenger.qs.Q4);
        b0Var.e(org.telegram.messenger.qs.R4);
        b0Var.e(org.telegram.messenger.qs.t4);
        this.O = b0Var;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.rb1, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.bc.h(this.b);
        ab.b0 b0Var = this.O;
        if (b0Var != null) {
            b0Var.b();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.rb1, org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        fi.m3 m3Var = this.P;
        if (m3Var != null) {
            m3Var.f(true);
        }
    }

    @Override // org.telegram.ui.rb1, org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        j0();
        l0();
        p0(true);
        if (this.Q) {
            return;
        }
        if (this.P == null && org.telegram.ui.Components.z20.r.c()) {
            org.telegram.messenger.g0.i3(new ie0(this, 8), 1500L);
        }
        this.Q = true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onSlideProgress(boolean z9, float f10) {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null) {
            c02.onSlideProgress(z9, f10);
        }
    }

    @Override // org.telegram.ui.rb1, org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z9) {
        if (this.F == null) {
            return;
        }
        int i7 = org.telegram.messenger.yr.a0(this.currentAccount).K;
        if (i7 <= 0) {
            this.K[0].e(null, false, z9);
        } else {
            this.K[0].e(org.telegram.messenger.id.E(i7, ','), false, z9);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void prepareFragmentToSlide(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null) {
            c02.prepareFragmentToSlide(z9, z10);
        }
    }

    public final void q0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.p10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new pe(27));
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
        int i10 = 1;
        if (org.telegram.messenger.p10.c() < 4) {
            H.c(R.drawable.msg_addbot, org.telegram.messenger.id.M0(2131754484, null), new ie0(this, i10), false);
        }
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                boolean z9 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i12 = org.telegram.ui.ActionBar.m6.i6;
                Drawable a02 = org.telegram.ui.ActionBar.m6.a0(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
                org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.t6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.p10.i(intValue).f();
                org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
                v8Var.r(f10);
                fi.r3 r3Var = new fi.r3(this, getParentActivity(), z9);
                linearLayout.addView(r3Var, c8.ha.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getParentActivity());
                if (z9) {
                    k9Var.setScaleX(0.833f);
                    k9Var.setScaleY(0.833f);
                }
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                k9Var.getImageReceiver().d = intValue;
                k9Var.e(f10, v8Var);
                r3Var.addView(k9Var, c8.ha.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, getResourceProvider());
                textView.setText(org.telegram.messenger.t10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ha.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.la(this, intValue, H, 15));
                H.r(linearLayout, c8.ha.o(org.telegram.messenger.qs.G3, 48));
            }
        }
        H.u = true;
        H.v = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(28.0f), getThemedColor(org.telegram.ui.ActionBar.m6.d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
        H.W(d02);
        H.Z();
        org.telegram.ui.Components.z20.r.a();
    }

    public final zw r0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        zw zwVar = new zw(bundle);
        this.J = zwVar;
        zwVar.J3 = new f(this, 23);
        this.a.put(0, new pb1(zwVar));
        return this.J;
    }

    public final void s0(int i7, boolean z9) {
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.K;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10].f((i10 > 2 ? i10 + (-1) : i10) == i7, z9);
            i10++;
        }
    }

    public final void t0(boolean z9, float f10) {
        int i7 = 0;
        while (i7 < this.K.length) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i7 > 2 ? i7 - 1 : i7) - f10));
            qh.b bVar = this.K[i7];
            bVar.J = max;
            bVar.I = z9;
            bVar.invalidate();
            i7++;
        }
        this.F.invalidate();
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
