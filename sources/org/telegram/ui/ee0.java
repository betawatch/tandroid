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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ee0 extends gb1 implements org.telegram.messenger.cs, qe.b {
    public sa1 E;
    public FrameLayout F;
    public ge0 G;
    public gh.g H;
    public View I;
    public Integer J;
    public uw K;
    public rh.b[] L;
    public int M;
    public int N;
    public int O;
    public za.p P;
    public gi.l3 Q;
    public boolean R;
    public final si.c S;
    public final si.f T;
    public final si.f U;
    public org.telegram.ui.Components.s41 x;
    public boolean y;
    public final qe.a w = new qe.a(0, this, org.telegram.ui.Components.xq.h, 380, true);
    public final RectF V = new RectF();
    public final RectF W = new RectF();
    public final ae0 X = new ae0(this, 0);

    public ee0() {
        if (Build.VERSION.SDK_INT >= 31) {
            si.f fVar = new si.f(null);
            ba.i iVar = new ba.i(this, false);
            if (fVar.c == null) {
                fVar.c = new eh.i(fVar.b, iVar);
            }
            this.T = fVar;
            si.f fVar2 = new si.f(null);
            ba.i iVar2 = new ba.i(this, true);
            if (fVar2.c == null) {
                fVar2.c = new eh.i(fVar2.b, iVar2);
            }
            this.U = fVar2;
        } else {
            this.T = null;
            this.U = null;
        }
        this.S = new si.c();
        x8 x8Var = new x8(this, 5);
        setBulletinDelegate(x8Var);
        org.telegram.ui.Components.ac.a(this.b, x8Var);
    }

    public static /* synthetic */ void d0(ee0 ee0Var, int i3, org.telegram.ui.Components.f60 f60Var) {
        if (ee0Var.currentAccount == i3) {
            return;
        }
        f60Var.u();
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            launchActivity.O0(i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v23 */
    public static boolean e0(ee0 ee0Var, View view) {
        ArrayList T0;
        boolean z10;
        int i3;
        ArrayList arrayList;
        boolean z11;
        ArrayList arrayList2;
        ?? r22 = 0;
        if (ee0Var.getParentActivity() != null && ee0Var.getParentActivity() != null && (T0 = ee0Var.getMessagesController().T0()) != null) {
            boolean z12 = true;
            if (T0.size() > 1) {
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(ee0Var, view);
                int i10 = 0;
                while (i10 < T0.size()) {
                    org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) T0.get(i10);
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, ee0Var.getParentActivity(), ee0Var.getResourceProvider(), false, false);
                    y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), r22, org.telegram.messenger.g0.L(18.0f), r22);
                    CharSequence m10 = org.telegram.messenger.i6.m(moVar.e() ? org.telegram.messenger.bd.M0(2131750808, null) : moVar.b, y0Var.getTextView().getPaint().getFontMetricsInt(), r22, null, r22);
                    if (!moVar.e()) {
                        m10 = org.telegram.messenger.zi.C5(m10, moVar.c, y0Var.getTextView().getPaint().getFontMetricsInt(), r22);
                    }
                    int i11 = moVar.e() ? org.telegram.messenger.qr.a0(ee0Var.currentAccount).L : moVar.d;
                    if (i11 > 0) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) String.valueOf(i11));
                        org.telegram.messenger.hp messagesController = ee0Var.getMessagesController();
                        if (moVar.e()) {
                            z10 = z12;
                            arrayList = messagesController.W0(r22);
                        } else {
                            z10 = z12;
                            arrayList = messagesController.y;
                        }
                        int i12 = r22;
                        while (true) {
                            if (i12 >= arrayList.size()) {
                                i3 = i10;
                                z11 = false;
                                break;
                            }
                            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i12);
                            if (moVar.e()) {
                                arrayList2 = arrayList;
                                i3 = i10;
                            } else {
                                long j10 = dialog.id;
                                if (org.telegram.messenger.m5.C(j10)) {
                                    arrayList2 = arrayList;
                                    i3 = i10;
                                    TLRPC.EncryptedChat a12 = messagesController.a1(Integer.valueOf((int) (j10 & 4294967295L)));
                                    if (a12 != null) {
                                        j10 = a12.user_id;
                                    }
                                } else {
                                    arrayList2 = arrayList;
                                    i3 = i10;
                                }
                                if (!moVar.c(ee0Var.getAccountInstance(), j10, dialog)) {
                                    continue;
                                    i12++;
                                    i10 = i3;
                                    arrayList = arrayList2;
                                }
                            }
                            if ((messagesController.V0(dialog) > 0 || dialog.unread_mark) && !messagesController.r2(dialog.id, 0L, null)) {
                                z11 = z10 ? 1 : 0;
                                break;
                            }
                            i12++;
                            i10 = i3;
                            arrayList = arrayList2;
                        }
                        spannableStringBuilder.setSpan(new ce0(ee0Var, i11, z11), length, spannableStringBuilder.length(), 33);
                        String M0 = moVar.e() ? org.telegram.messenger.bd.M0(2131750808, null) : moVar.b;
                        String G = org.telegram.messenger.bd.G(i11, "AccDescrUnreadCount", new Object[0]);
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = M0;
                        charSequenceArr[z10 ? 1 : 0] = "\n";
                        charSequenceArr[2] = G;
                        y0Var.setContentDescription(TextUtils.concat(charSequenceArr));
                        m10 = spannableStringBuilder;
                    } else {
                        z10 = z12;
                        i3 = i10;
                    }
                    y0Var.setEmojiCacheType(moVar.n ? 26 : 0);
                    y0Var.j(m10, 0, new org.telegram.ui.Components.sz(ee0Var.getParentActivity(), R.drawable.msg_folders, ee0Var.getMessagesController().A7 ? moVar.m : -1));
                    y0Var.getTextView().setEmojiColor(ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                    y0Var.setMinimumWidth(org.telegram.messenger.hs.q2);
                    y0Var.setOnClickListener(new a0(ee0Var, H, moVar, 11));
                    H.r(y0Var, b8.mf.o(-1, -2));
                    i10 = i3 + 1;
                    z12 = z10;
                    r22 = 0;
                }
                boolean z13 = z12;
                H.a0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(4.0f));
                H.X = org.telegram.messenger.g0.L(400.0f);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                H.W(d02);
                H.i = 3;
                H.Z();
                return z13;
            }
        }
        return false;
    }

    public static void f0(ee0 ee0Var) {
        org.telegram.messenger.h10 userConfig = ee0Var.getUserConfig();
        if (!userConfig.X) {
            userConfig.X = true;
            userConfig.v(false);
        }
        ee0Var.m0(true, true);
        org.telegram.messenger.hs.f(ee0Var.currentAccount).k(org.telegram.messenger.hs.O5, new Object[0]);
    }

    public static void g0(ee0 ee0Var) {
        ee0Var.getClass();
        int i3 = 0;
        Integer num = null;
        for (int i10 = 3; i10 >= 0; i10--) {
            if (!org.telegram.messenger.h10.i(i10).p()) {
                i3++;
                if (num == null) {
                    num = Integer.valueOf(i10);
                }
            }
        }
        if (!org.telegram.messenger.h10.o()) {
            i3--;
        }
        if (i3 > 0 && num != null) {
            ee0Var.presentFragment(new xd0(num.intValue()));
        } else {
            if (org.telegram.messenger.h10.o()) {
                return;
            }
            ee0Var.showDialog(new vg.i0(7, ee0Var.currentAccount, ee0Var.getParentActivity(), ee0Var, null));
        }
    }

    public static void h0(ee0 ee0Var) {
        org.telegram.messenger.h10 userConfig = ee0Var.getUserConfig();
        if (userConfig.X) {
            userConfig.X = false;
            userConfig.v(false);
        }
        ee0Var.m0(false, true);
        org.telegram.messenger.hs.f(ee0Var.currentAccount).k(org.telegram.messenger.hs.O5, new Object[0]);
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            o0();
            n0();
        }
    }

    @Override // org.telegram.ui.gb1
    public final org.telegram.ui.ActionBar.d2 a0(int i3) {
        if (i3 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i3 == 2) {
            if (!getUserConfig().X) {
                return new c31(a1.g.k("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new h9(bundle2);
        }
        if (i3 == 0) {
            uw uwVar = new uw(a1.g.k("hasMainTabs", true));
            this.K = uwVar;
            uwVar.J3 = new f(this, 23);
            return uwVar;
        }
        if (i3 != 3) {
            return null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("user_id", org.telegram.messenger.h10.i(this.currentAccount).e());
        bundle3.putBoolean("my_profile", true);
        bundle3.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle3, null);
    }

    @Override // org.telegram.ui.gb1, org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.d2 c02 = c0();
        return c02 != null && c02.canBeginSlide();
    }

    @Override // org.telegram.ui.gb1, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3;
        super.createView(context);
        ge0 ge0Var = new ge0(context, this.resourceProvider);
        this.G = ge0Var;
        final int i10 = 0;
        ge0Var.setClipChildren(false);
        this.G.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.G.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        rh.b[] bVarArr = new rh.b[5];
        this.L = bVarArr;
        bVarArr[0] = rh.b.c(context, this.resourceProvider, rh.a.n, 2131748715);
        final int i11 = 1;
        this.L[1] = rh.b.c(context, this.resourceProvider, rh.a.f, 2131748714);
        final int i12 = 2;
        this.L[2] = rh.b.c(context, this.resourceProvider, rh.a.r, 2131745505);
        final int i13 = 3;
        this.L[3] = rh.b.c(context, this.resourceProvider, rh.a.h, 2131748716);
        rh.b[] bVarArr2 = this.L;
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        int i14 = this.currentAccount;
        rh.b bVar = new rh.b(context);
        bVar.a.setText(org.telegram.messenger.bd.M0(2131748713, null));
        bVar.b.setVisibility(8);
        TLRPC.User a22 = org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(org.telegram.messenger.h10.i(i14).e()));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(0, a22);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.e(a22, u8Var);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        bVar.c = k9Var;
        bVar.addView(k9Var, b8.mf.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ql, e6Var);
        bVar.s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ol, e6Var);
        bVar.w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Pl, e6Var);
        bVar.a();
        bVarArr2[4] = bVar;
        this.L[0].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.be0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i15 = i10;
                int i16 = 3;
                ee0 ee0Var = this.b;
                switch (i15) {
                    case 0:
                        break;
                    case 1:
                        if (ee0Var.getParentActivity() != null && ee0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(ee0Var, view);
                            H.c(R.drawable.msg_contact_add, org.telegram.messenger.bd.M0(2131748291, null), new ae0(ee0Var, 6), false);
                            H.c(R.drawable.msg_calls, org.telegram.messenger.bd.M0(2131743449, null), new ae0(ee0Var, 7), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            H.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                            H.W(d02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        if (ee0Var.getParentActivity() != null && ee0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.f60 H2 = org.telegram.ui.Components.f60.H(ee0Var, view);
                            H2.c(R.drawable.menu_call_create, org.telegram.messenger.bd.M0(2131749498, null), new ae0(ee0Var, 2), false);
                            if (ee0Var.getUserConfig().X) {
                                H2.c(R.drawable.msg_archive_hide, org.telegram.messenger.bd.M0(2131749330, null), new ae0(ee0Var, i16), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.bd.M0(2131749469, null), new ae0(ee0Var, 4), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                            H2.W(d03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        ee0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.L[1].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.be0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i15 = i11;
                int i16 = 3;
                ee0 ee0Var = this.b;
                switch (i15) {
                    case 0:
                        break;
                    case 1:
                        if (ee0Var.getParentActivity() != null && ee0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(ee0Var, view);
                            H.c(R.drawable.msg_contact_add, org.telegram.messenger.bd.M0(2131748291, null), new ae0(ee0Var, 6), false);
                            H.c(R.drawable.msg_calls, org.telegram.messenger.bd.M0(2131743449, null), new ae0(ee0Var, 7), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            H.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                            H.W(d02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        if (ee0Var.getParentActivity() != null && ee0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.f60 H2 = org.telegram.ui.Components.f60.H(ee0Var, view);
                            H2.c(R.drawable.menu_call_create, org.telegram.messenger.bd.M0(2131749498, null), new ae0(ee0Var, 2), false);
                            if (ee0Var.getUserConfig().X) {
                                H2.c(R.drawable.msg_archive_hide, org.telegram.messenger.bd.M0(2131749330, null), new ae0(ee0Var, i16), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.bd.M0(2131749469, null), new ae0(ee0Var, 4), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                            H2.W(d03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        ee0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.L[3].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.be0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i15 = i12;
                int i16 = 3;
                ee0 ee0Var = this.b;
                switch (i15) {
                    case 0:
                        break;
                    case 1:
                        if (ee0Var.getParentActivity() != null && ee0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(ee0Var, view);
                            H.c(R.drawable.msg_contact_add, org.telegram.messenger.bd.M0(2131748291, null), new ae0(ee0Var, 6), false);
                            H.c(R.drawable.msg_calls, org.telegram.messenger.bd.M0(2131743449, null), new ae0(ee0Var, 7), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            H.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                            H.W(d02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        if (ee0Var.getParentActivity() != null && ee0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.f60 H2 = org.telegram.ui.Components.f60.H(ee0Var, view);
                            H2.c(R.drawable.menu_call_create, org.telegram.messenger.bd.M0(2131749498, null), new ae0(ee0Var, 2), false);
                            if (ee0Var.getUserConfig().X) {
                                H2.c(R.drawable.msg_archive_hide, org.telegram.messenger.bd.M0(2131749330, null), new ae0(ee0Var, i16), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.bd.M0(2131749469, null), new ae0(ee0Var, 4), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                            H2.W(d03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        ee0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.L[4].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.be0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i15 = i13;
                int i16 = 3;
                ee0 ee0Var = this.b;
                switch (i15) {
                    case 0:
                        break;
                    case 1:
                        if (ee0Var.getParentActivity() != null && ee0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(ee0Var, view);
                            H.c(R.drawable.msg_contact_add, org.telegram.messenger.bd.M0(2131748291, null), new ae0(ee0Var, 6), false);
                            H.c(R.drawable.msg_calls, org.telegram.messenger.bd.M0(2131743449, null), new ae0(ee0Var, 7), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            H.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                            H.W(d02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        if (ee0Var.getParentActivity() != null && ee0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.f60 H2 = org.telegram.ui.Components.f60.H(ee0Var, view);
                            H2.c(R.drawable.menu_call_create, org.telegram.messenger.bd.M0(2131749498, null), new ae0(ee0Var, 2), false);
                            if (ee0Var.getUserConfig().X) {
                                H2.c(R.drawable.msg_archive_hide, org.telegram.messenger.bd.M0(2131749330, null), new ae0(ee0Var, i16), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.bd.M0(2131749469, null), new ae0(ee0Var, 4), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
                            H2.W(d03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        ee0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.G.Q.add(this.L[0]);
        this.G.Q.add(this.L[1]);
        this.G.Q.add(this.L[4]);
        this.G.Q.add(this.L[3]);
        int i15 = 0;
        while (true) {
            rh.b[] bVarArr3 = this.L;
            i3 = 25;
            if (i15 >= bVarArr3.length) {
                break;
            }
            rh.b bVar2 = bVarArr3[i15];
            bVar2.setOnClickListener(new bi.q(this, i15 > 2 ? i15 - 1 : i15, i3));
            this.G.addView(this.L[i15]);
            this.G.i(bVar2, true, false);
            i15++;
        }
        m0(getUserConfig().X, false);
        s0(this.c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.d6);
        si.c cVar = this.S;
        cVar.a(themedColor);
        kh.k kVar = new kh.k(this.b);
        si.a aVar = this.T;
        if (aVar == null) {
            aVar = cVar;
        }
        si.a aVar2 = this.U;
        if (aVar2 == null) {
            aVar2 = cVar;
        }
        eh.c cVar2 = new eh.c(aVar, aVar2, cVar);
        l0 l0Var = this.b;
        cVar2.h = kVar;
        cVar2.i = l0Var;
        cVar2.k = true;
        gh.g c2 = cVar2.c(this.G, b8.cd.f(this.resourceProvider), false);
        this.H = c2;
        c2.r(org.telegram.messenger.g0.L(28.0f));
        this.H.q(org.telegram.messenger.g0.L(7.666f));
        this.G.setBackground(this.H);
        eh.c cVar3 = new eh.c(cVar, cVar, cVar);
        l0 l0Var2 = this.b;
        cVar3.h = kVar;
        cVar3.i = l0Var2;
        this.I = new View(context);
        eh.d dVar = new eh.d(cVar3.c(this.I, null, false));
        dVar.b(org.telegram.messenger.g0.L(60.0f), true);
        this.I.setBackground(dVar);
        this.b.addView(this.I, b8.mf.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.setOnClickListener(new ai.t(i3));
        this.F.addView(this.G, b8.mf.e(-1, 72, 81));
        this.F.setClipToPadding(false);
        this.b.addView(this.F, b8.mf.e(-1, -2, 80));
        sa1 sa1Var = new sa1(context);
        this.E = sa1Var;
        this.b.addView(sa1Var, b8.mf.e(-1, -2, 80));
        org.telegram.ui.Components.s41 s41Var = ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? new org.telegram.ui.Components.s41(getParentActivity(), this.E) : null;
        this.x = s41Var;
        if (s41Var != null) {
            s41Var.updateAppUpdateViews(this.currentAccount, false);
        }
        p0(false);
        return this.b;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        rh.b bVar;
        LaunchActivity launchActivity;
        boolean z10 = false;
        z10 = false;
        if (i3 == org.telegram.messenger.hs.G4 || i3 == org.telegram.messenger.hs.r) {
            View view = this.fragmentView;
            if (view != null && view.isAttachedToWindow()) {
                z10 = true;
            }
            p0(z10);
            return;
        }
        if (i3 == org.telegram.messenger.hs.R4) {
            org.telegram.ui.Components.s41 s41Var = this.x;
            if (s41Var != null) {
                s41Var.updateFileProgress(null);
                this.x.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.Y1) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.az.j1;
            if (tL_help_appUpdate == null || tL_help_appUpdate.document == null) {
                return;
            }
            org.telegram.messenger.t0.u();
            return;
        }
        if (i3 == org.telegram.messenger.hs.Z1) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.az.j1;
            if (tL_help_appUpdate2 == null || tL_help_appUpdate2.document == null) {
                return;
            }
            org.telegram.messenger.t0.u();
            return;
        }
        if (i3 == org.telegram.messenger.hs.X1) {
            org.telegram.ui.Components.s41 s41Var2 = this.x;
            if (s41Var2 != null) {
                s41Var2.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.Q4) {
            org.telegram.ui.Components.s41 s41Var3 = this.x;
            if (s41Var3 == null || (launchActivity = LaunchActivity.K1) == null) {
                return;
            }
            s41Var3.updateAppUpdateViews(this.currentAccount, launchActivity.e0.size() == 1);
            return;
        }
        if (i3 == org.telegram.messenger.hs.t4) {
            int currentPosition = this.c.getCurrentPosition();
            SparseArray sparseArray = this.a;
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                eb1 eb1Var = (eb1) sparseArray.valueAt(i11);
                if (sparseArray.keyAt(i11) != currentPosition && eb1Var != null) {
                    eb1Var.a.clearViews();
                }
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.O5) {
            m0(getUserConfig().X, true);
            fb1 fb1Var = this.c;
            if (fb1Var == null || fb1Var.getCurrentPosition() != 2) {
                b0(2);
                return;
            }
            this.c.D(0);
            s0(0, true);
            this.y = true;
            return;
        }
        if (i3 != org.telegram.messenger.hs.j0) {
            if (i3 == org.telegram.messenger.hs.P5) {
                l0();
                return;
            }
            return;
        }
        rh.b[] bVarArr = this.L;
        if (bVarArr == null || (bVar = bVarArr[4]) == null) {
            return;
        }
        int i12 = this.currentAccount;
        TLRPC.User a22 = org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(org.telegram.messenger.h10.i(i12).e()));
        bVar.c.e(a22, new org.telegram.ui.Components.u8(0, a22));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        org.telegram.ui.ActionBar.d2 c02 = c0();
        if (c02 != null) {
            return c02.getCustomSlideTransition(z10, z11, f10);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.c;
    }

    public final void i0() {
        si.f fVar;
        View view;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 || (fVar = this.T) == null || (view = this.fragmentView) == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = this.fragmentView.getMeasuredHeight();
        k0();
        pi.r f10 = pi.q.f();
        if (!f10.a) {
            fVar = null;
        } else if (!f10.b || i3 < 33) {
            fVar = this.U;
        }
        if (fVar != null) {
            fVar.n(measuredWidth, measuredHeight);
            fVar.c.a();
        }
    }

    public final void j0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.d6);
        fb1 fb1Var = this.c;
        this.S.a(i0.a.f(fb1Var != null ? fb1Var.p(0) : 1.0f, themedColor, themedColor2));
        View view = this.I;
        if (view != null) {
            view.invalidate();
        }
        gh.g gVar = this.H;
        if (gVar != null) {
            gVar.updateColors();
        }
        i0();
        View view2 = this.I;
        if (view2 != null) {
            view2.invalidate();
        }
        ge0 ge0Var = this.G;
        if (ge0Var != null) {
            ge0Var.invalidate();
        }
        rh.b[] bVarArr = this.L;
        if (bVarArr != null) {
            for (rh.b bVar : bVarArr) {
                bVar.g();
            }
        }
    }

    public final void k0() {
        if (Build.VERSION.SDK_INT < 31 || this.T == null || this.b == null) {
            return;
        }
        sa1 sa1Var = this.E;
        int height = ((this.b.getHeight() - this.M) - ((sa1Var == null || !sa1Var.a()) ? 0 : org.telegram.messenger.g0.L(44.0f))) - org.telegram.messenger.g0.L(8.0f);
        int L = height - org.telegram.messenger.g0.L(56.0f);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            org.telegram.ui.ActionBar.d2 d2Var = ((eb1) sparseArray.valueAt(i3)).a;
            View view = d2Var.fragmentView;
            if (view != null && view.getWidth() > 0 && (d2Var instanceof de0)) {
                if (L >= view.getHeight()) {
                    d2Var.setParentGlass(null, null);
                } else {
                    float L2 = L - org.telegram.messenger.g0.L(1.0f);
                    float width = view.getWidth();
                    float L3 = org.telegram.messenger.g0.L(1.0f) + height;
                    RectF rectF = this.W;
                    rectF.set(0.0f, L2, width, L3);
                    d2Var.setParentGlass(rectF, this.X);
                }
            }
        }
    }

    public final void l0() {
        if (this.G == null || this.L[1] == null) {
            return;
        }
        boolean w10 = org.telegram.messenger.g5.w();
        if (w10) {
            org.telegram.messenger.hp.f1().edit().putBoolean("askAboutContacts2", true).apply();
        }
        if (org.telegram.messenger.h10.i(this.currentAccount).V && !w10 && org.telegram.messenger.hp.f1().getBoolean("askAboutContacts2", true)) {
            this.L[1].e("!", true, true);
        } else {
            this.L[1].e(null, true, true);
        }
    }

    public final void m0(boolean z10, boolean z11) {
        ge0 ge0Var = this.G;
        if (ge0Var != null) {
            ge0Var.i(this.L[2], !z10, z11);
            this.G.i(this.L[3], z10, z11);
        }
    }

    public final void n0() {
        fb1 fb1Var = this.c;
        if (fb1Var == null || this.I == null) {
            return;
        }
        float a10 = 1.0f - b8.be.a(Math.abs(3.0f - fb1Var.getPositionAnimated()), 0.0f, 1.0f);
        float T1 = (1.0f - ((1.0f - org.telegram.messenger.g0.T1(0.0f, 1.0f, org.telegram.messenger.g0.R0(this.M))) * a10)) * this.w.e;
        this.I.setAlpha(T1);
        this.I.setTranslationY(a10 * org.telegram.messenger.g0.L(48.0f));
        this.I.setVisibility(T1 > 0.0f ? 0 : 8);
    }

    public final void o0() {
        int L = org.telegram.messenger.g0.L(40.0f) + (-(this.E.a() ? org.telegram.messenger.g0.L(44.0f) : 0));
        float f10 = this.w.e;
        this.F.setTranslationY(org.telegram.messenger.g0.W1(f10, L, r0));
        this.G.setClickable(f10 > 1.0f);
        this.G.setEnabled(f10 > 1.0f);
        this.G.setAlpha(f10);
        this.G.setVisibility(f10 <= 0.0f ? 8 : 0);
    }

    @Override // org.telegram.ui.gb1, org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.c.D(0);
            }
        }
        return onBackPressed;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.d2 c02 = c0();
        if (c02 != null) {
            c02.onBeginSlide();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        za.p pVar = new za.p(org.telegram.messenger.hs.f(this.currentAccount), this);
        pVar.b(org.telegram.messenger.hs.Y1);
        pVar.b(org.telegram.messenger.hs.X1);
        pVar.b(org.telegram.messenger.hs.Z1);
        pVar.b(org.telegram.messenger.hs.G4);
        pVar.b(org.telegram.messenger.hs.r);
        pVar.b(org.telegram.messenger.hs.O5);
        pVar.b(org.telegram.messenger.hs.j0);
        pVar.b(org.telegram.messenger.hs.P5);
        pVar.d(org.telegram.messenger.hs.Q4);
        pVar.d(org.telegram.messenger.hs.R4);
        pVar.d(org.telegram.messenger.hs.t4);
        this.P = pVar;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.gb1, org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.ac.h(this.b);
        za.p pVar = this.P;
        if (pVar != null) {
            pVar.a();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.gb1, org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        gi.l3 l3Var = this.Q;
        if (l3Var != null) {
            l3Var.f(true);
        }
    }

    @Override // org.telegram.ui.gb1, org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        j0();
        l0();
        p0(true);
        if (this.R) {
            return;
        }
        if (this.Q == null && org.telegram.ui.Components.v20.r.c()) {
            org.telegram.messenger.g0.i3(new ae0(this, 8), 1500L);
        }
        this.R = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onSlideProgress(boolean z10, float f10) {
        org.telegram.ui.ActionBar.d2 c02 = c0();
        if (c02 != null) {
            c02.onSlideProgress(z10, f10);
        }
    }

    @Override // org.telegram.ui.gb1, org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z10) {
        if (this.G == null) {
            return;
        }
        int i3 = org.telegram.messenger.qr.a0(this.currentAccount).L;
        if (i3 <= 0) {
            this.L[0].e(null, false, z10);
        } else {
            this.L[0].e(org.telegram.messenger.bd.E(i3, ','), false, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.d2 c02 = c0();
        if (c02 != null) {
            c02.prepareFragmentToSlide(z10, z11);
        }
    }

    public final void q0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i3 = 0; i3 < 4; i3++) {
            if (org.telegram.messenger.h10.i(i3).p()) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.d80(14));
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view);
        int i10 = 1;
        if (org.telegram.messenger.h10.c() < 4) {
            H.c(R.drawable.msg_addbot, org.telegram.messenger.bd.M0(2131754484, null), new ae0(this, i10), false);
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
                boolean z10 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i12 = org.telegram.ui.ActionBar.k6.i6;
                Drawable a02 = org.telegram.ui.ActionBar.k6.a0(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.h10.i(intValue).f();
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                u8Var.r(f10);
                gi.q3 q3Var = new gi.q3(this, getParentActivity(), z10);
                linearLayout.addView(q3Var, b8.mf.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getParentActivity());
                if (z10) {
                    k9Var.setScaleX(0.833f);
                    k9Var.setScaleY(0.833f);
                }
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                k9Var.getImageReceiver().d = intValue;
                k9Var.e(f10, u8Var);
                q3Var.addView(k9Var, b8.mf.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, getResourceProvider());
                textView.setText(org.telegram.messenger.l10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, b8.mf.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new ai.h3(this, intValue, H, 17));
                H.r(linearLayout, b8.mf.o(org.telegram.messenger.hs.G3, 48));
            }
        }
        H.u = true;
        H.v = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(28.0f), getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
        H.W(d02);
        H.Z();
        org.telegram.ui.Components.v20.r.a();
    }

    public final uw r0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        uw uwVar = new uw(bundle);
        this.K = uwVar;
        uwVar.J3 = new f(this, 23);
        this.a.put(0, new eb1(uwVar));
        return this.K;
    }

    public final void s0(int i3, boolean z10) {
        int i10 = 0;
        while (true) {
            rh.b[] bVarArr = this.L;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10].f((i10 > 2 ? i10 + (-1) : i10) == i3, z10);
            i10++;
        }
    }

    public final void t0(boolean z10, float f10) {
        int i3 = 0;
        while (i3 < this.L.length) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i3 > 2 ? i3 - 1 : i3) - f10));
            rh.b bVar = this.L[i3];
            bVar.K = max;
            bVar.J = z10;
            bVar.invalidate();
            i3++;
        }
        this.G.invalidate();
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
