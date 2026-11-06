package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.i30 {
    public TLRPC.FileLocation D;
    public TLRPC.FileLocation E;
    public TLRPC.InputFile F;
    public TLRPC.InputFile G;
    public TLRPC.VideoSize H;
    public String I;
    public double J;
    public ArrayList K;
    public boolean L;
    public boolean M;
    public org.telegram.ui.Components.j30 N;
    public String O;
    public final int P;
    public final boolean Q;
    public org.telegram.ui.Components.zg0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.ly X;
    public c50 Y;
    public b50 a;
    public org.telegram.ui.Components.pj0 b;
    public org.telegram.ui.Components.kt c;
    public di.c4 d;
    public fi.p5 e;
    public yc f;
    public AnimatorSet h;
    public zc n;
    public final org.telegram.ui.Components.w8 r;
    public FrameLayout s;
    public org.telegram.ui.Components.p00 w;
    public org.telegram.ui.ActionBar.g1 x;
    public Drawable y;

    public d50(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void Z(d50 d50Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.yr.a0(d50Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.i30
    public final void H(float f10) {
        zc zcVar = this.n;
        if (zcVar == null) {
            return;
        }
        zcVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.i30
    public final void O(boolean z9, boolean z10) {
        zc zcVar = this.n;
        if (zcVar == null) {
            return;
        }
        zcVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.i30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0317  */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        org.telegram.ui.Components.kt ktVar = this.c;
        if (ktVar != null) {
            ktVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i7 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748272, null));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i10, kVar, getResourceProvider());
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new ux(this, 5));
        int i12 = 2;
        xc xcVar = new xc(i12, context, this);
        org.telegram.ui.ActionBar.r6.i(i10, xcVar, getResourceProvider());
        this.fragmentView = xcVar;
        xcVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new ei.b(i12));
        this.y = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        c61 c61Var = new c61(18, context, this);
        c61Var.setOrientation(1);
        xcVar.addView(c61Var, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.d6;
        InsetDrawable f02 = org.telegram.ui.ActionBar.k6.f0(L, getThemedColor(i13));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(f02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, f02, N, null, resourceProvider);
        c61Var.addView(this.s, c8.ha.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        di.c4 c4Var = new di.c4(9, context, this);
        this.d = c4Var;
        int i14 = this.P;
        c4Var.setRoundRadius(org.telegram.messenger.g0.L(i14 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.w8 w8Var = this.r;
        w8Var.k(5L, null, null, null);
        this.d.setImageDrawable(w8Var);
        this.d.setContentDescription(org.telegram.messenger.hd.M0(2131752123, null));
        FrameLayout frameLayout2 = this.s;
        di.c4 c4Var2 = this.d;
        boolean z9 = org.telegram.messenger.hd.a0;
        int i15 = 3;
        frameLayout2.addView(c4Var2, c8.ha.d(64, 64.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 16.0f, 16.0f, z9 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        fi.p5 p5Var = new fi.p5(this, context, paint, 12);
        this.e = p5Var;
        FrameLayout frameLayout3 = this.s;
        boolean z10 = org.telegram.messenger.hd.a0;
        frameLayout3.addView(p5Var, c8.ha.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x40
            public final /* synthetic */ d50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        d50 d50Var = this.b;
                        d50Var.N.n(d50Var.D != null, new hz(d50Var, 9), new q5(d50Var, 7), 0);
                        d50Var.R.M(0);
                        d50Var.R.P(43);
                        d50Var.f.d();
                        break;
                    default:
                        d50 d50Var2 = this.b;
                        if (!d50Var2.M) {
                            if (d50Var2.c.a.length() != 0) {
                                d50Var2.M = true;
                                org.telegram.messenger.g0.v1(d50Var2.c);
                                d50Var2.c.setEnabled(false);
                                if (!d50Var2.N.g()) {
                                    org.telegram.ui.Components.p00 p00Var = d50Var2.w;
                                    if (p00Var != null) {
                                        p00Var.f(true, true);
                                    }
                                    d50Var2.V = d50Var2.getMessagesController().U(d50Var2.c.getText().toString(), d50Var2.K, null, d50Var2.P, d50Var2.S, d50Var2.U, d50Var2.T, d50Var2.W, d50Var2);
                                    break;
                                } else {
                                    d50Var2.L = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) d50Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(d50Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.R = new org.telegram.ui.Components.zg0(R.raw.camera, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
        yc ycVar = new yc(i15, context, this);
        this.f = ycVar;
        ycVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.R);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(org.telegram.messenger.g0.L(0.0f), 0, 0, org.telegram.messenger.g0.L(1.0f));
        FrameLayout frameLayout4 = this.s;
        yc ycVar2 = this.f;
        boolean z11 = org.telegram.messenger.hd.a0;
        frameLayout4.addView(ycVar2, c8.ha.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 16.0f, z11 ? 15.0f : 0.0f, 16.0f));
        zc zcVar = new zc(this, context, i7);
        this.n = zcVar;
        zcVar.setSize(org.telegram.messenger.g0.L(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        zc zcVar2 = this.n;
        boolean z12 = org.telegram.messenger.hd.a0;
        frameLayout5.addView(zcVar2, c8.ha.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 16.0f, z12 ? 16.0f : 0.0f, 16.0f));
        e0(false, false);
        org.telegram.ui.Components.kt ktVar2 = new org.telegram.ui.Components.kt(context, xcVar, this, 0, false, null);
        this.c = ktVar2;
        ktVar2.setHint(org.telegram.messenger.hd.M0((i14 == 0 || i14 == 4 || i14 == 5) ? 2131751123 : 2131751122, null));
        String str = this.O;
        if (str != null) {
            this.c.setText(str);
            org.telegram.ui.Components.kt ktVar3 = this.c;
            ktVar3.setSelection(ktVar3.getText().length());
            this.O = null;
        }
        TLRPC.User f10 = getUserConfig().f();
        int size = this.K.size() + 1;
        if (size >= 2 && size <= 5 && TextUtils.isEmpty(this.c.getText())) {
            String str2 = "";
            try {
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (size == 2) {
                str2 = org.telegram.messenger.hd.a0("GroupCreateMembersTwo", null, 2131749449, f10.first_name, d0(0));
            } else if (size == 3) {
                str2 = org.telegram.messenger.hd.a0("GroupCreateMembersThree", null, 2131749450, f10.first_name, d0(0), d0(1));
            } else if (size != 4) {
                if (size == 5) {
                    str2 = org.telegram.messenger.hd.a0("GroupCreateMembersFive", null, 2131749452, f10.first_name, d0(0), d0(1), d0(2), d0(3));
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.c.setText(str2);
                    org.telegram.ui.Components.kt ktVar4 = this.c;
                    ktVar4.w(0, ktVar4.getText().length());
                }
            } else {
                str2 = org.telegram.messenger.hd.a0("GroupCreateMembersFour", null, 2131749451, f10.first_name, d0(0), d0(1), d0(2));
            }
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.s;
        org.telegram.ui.Components.kt ktVar5 = this.c;
        boolean z13 = org.telegram.messenger.hd.a0;
        frameLayout6.addView(ktVar5, c8.ha.d(-1, -2.0f, 16, z13 ? 5.0f : 96.0f, 0.0f, z13 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.r1();
        this.X = new org.telegram.ui.Components.ly(1, this.b);
        org.telegram.ui.Components.pj0 pj0Var2 = this.b;
        b50 b50Var = new b50(this, context);
        this.a = b50Var;
        pj0Var2.setAdapter(b50Var);
        this.b.setLayoutManager(this.X);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        c61Var.addView(this.b, c8.ha.o(-1, -1));
        this.b.setOnScrollListener(new g3(this, 15));
        this.b.setOnItemClickListener(new y40(this));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
        this.w = p00Var;
        h6.m.g(p00Var);
        xcVar.addView(this.w, org.telegram.ui.Components.p00.b());
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x40
            public final /* synthetic */ d50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        d50 d50Var = this.b;
                        d50Var.N.n(d50Var.D != null, new hz(d50Var, 9), new q5(d50Var, 7), 0);
                        d50Var.R.M(0);
                        d50Var.R.P(43);
                        d50Var.f.d();
                        break;
                    default:
                        d50 d50Var2 = this.b;
                        if (!d50Var2.M) {
                            if (d50Var2.c.a.length() != 0) {
                                d50Var2.M = true;
                                org.telegram.messenger.g0.v1(d50Var2.c);
                                d50Var2.c.setEnabled(false);
                                if (!d50Var2.N.g()) {
                                    org.telegram.ui.Components.p00 p00Var2 = d50Var2.w;
                                    if (p00Var2 != null) {
                                        p00Var2.f(true, true);
                                    }
                                    d50Var2.V = d50Var2.getMessagesController().U(d50Var2.c.getText().toString(), d50Var2.K, null, d50Var2.P, d50Var2.S, d50Var2.U, d50Var2.T, d50Var2.W, d50Var2);
                                    break;
                                } else {
                                    d50Var2.L = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) d50Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(d50Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.w.setContentDescription(org.telegram.messenger.hd.M0(2131751355, null));
        this.w.c.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    public final String d0(int i7) {
        return getMessagesController().a2((Long) this.K.get(i7)).first_name;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.r) {
            if (this.b == null) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            int childCount = this.b.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.b.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.h4) {
                    ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.S) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.p00 p00Var = this.w;
            if (p00Var != null) {
                p00Var.f(false, true);
            }
            org.telegram.ui.Components.kt ktVar = this.c;
            if (ktVar != null) {
                ktVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.R) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            c50 c50Var = this.Y;
            if (c50Var != null) {
                c50Var.e(this, longValue);
            } else {
                org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new an(bundle), true);
            }
            if (this.F == null && this.G == null && this.H == null) {
                return;
            }
            getMessagesController().B(longValue, null, this.F, this.G, this.H, this.J, this.I, this.D, this.E, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void dismissCurrentDialog() {
        if (this.N.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.N.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void e0(boolean z9, boolean z10) {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        int i7 = 0;
        if (!z10) {
            if (z9) {
                this.f.setAlpha(1.0f);
                this.f.setVisibility(4);
                this.n.setAlpha(1.0f);
                this.n.setVisibility(0);
                return;
            }
            this.f.setAlpha(1.0f);
            this.f.setVisibility(0);
            this.n.setAlpha(0.0f);
            this.n.setVisibility(4);
            return;
        }
        this.h = new AnimatorSet();
        if (z9) {
            this.n.setVisibility(0);
            AnimatorSet animatorSet2 = this.h;
            yc ycVar = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(ycVar, (Property<yc, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<zc, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            yc ycVar2 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(ycVar2, (Property<yc, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<zc, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new z40(i7, this, z9));
        this.h.start();
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ vq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.N.h(i7, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.kt ktVar = this.c;
        if (ktVar == null || !ktVar.e) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        ktVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        d50 d50Var;
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.r);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.R);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.S);
        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(2, true, true);
        this.N = j30Var;
        j30Var.a = this;
        j30Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.K = new ArrayList(longArray.length);
            int i7 = 0;
            while (i7 < longArray.length) {
                i7 = com.google.android.recaptcha.internal.a.g(i7, 1, longArray[i7], this.K);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            Long l10 = (Long) this.K.get(i10);
            if (getMessagesController().a2(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (arrayList.isEmpty()) {
            d50Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            d50Var = this;
            org.telegram.messenger.yr.a0(this.currentAccount).a.c(new org.telegram.ui.Components.kn0(d50Var, arrayList2, arrayList, countDownLatch, 10));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                getMessagesController().X3((TLRPC.User) obj, true, false);
            }
        }
        d50Var.W = getUserConfig().p0 * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.r);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.R);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.S);
        this.N.d();
        if (this.V != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.V, true);
        }
        org.telegram.ui.Components.kt ktVar = this.c;
        if (ktVar != null) {
            ktVar.o();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.kt ktVar = this.c;
        if (ktVar != null) {
            ktVar.r();
        }
        this.N.i();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.N.j(i7, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.kt ktVar = this.c;
        if (ktVar != null) {
            ktVar.s();
        }
        b50 b50Var = this.a;
        if (b50Var != null) {
            b50Var.f();
        }
        this.N.k();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.p00 p00Var = this.w;
            if (p00Var != null) {
                p00Var.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.Components.pj0 pj0Var = this.b;
            if (pj0Var != null) {
                pj0Var.x1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.kt ktVar = this.c;
            if (ktVar == null || ktVar.getEditText() == null) {
                return;
            }
            this.c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.G6));
            this.c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.k6.k6), getThemedColor(org.telegram.ui.ActionBar.k6.l6), getThemedColor(org.telegram.ui.ActionBar.k6.p7));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            org.telegram.ui.Components.et etVar = this.c.a;
            etVar.requestFocus();
            org.telegram.messenger.g0.K3(etVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.j30 j30Var = this.N;
        if (j30Var != null) {
            j30Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.kt ktVar = this.c;
            if (ktVar != null) {
                ktVar.setText(string);
            } else {
                this.O = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.j30 j30Var = this.N;
        if (j30Var != null && (str = j30Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.kt ktVar = this.c;
        if (ktVar != null) {
            String obj = ktVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ void T() {
    }
}
