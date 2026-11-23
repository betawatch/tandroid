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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e50 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, org.telegram.ui.Components.t30 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public TLRPC.InputFile G;
    public TLRPC.InputFile H;
    public TLRPC.VideoSize I;
    public String J;
    public double K;
    public ArrayList L;
    public boolean M;
    public boolean N;
    public org.telegram.ui.Components.u30 O;
    public String P;
    public final int Q;
    public final boolean R;
    public org.telegram.ui.Components.nh0 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public org.telegram.ui.Components.vy Y;
    public d50 Z;
    public c50 a;
    public org.telegram.ui.Components.ek0 b;
    public org.telegram.ui.Components.wt c;
    public fi.t3 d;
    public hi.w5 e;
    public xc f;
    public AnimatorSet h;
    public yc n;
    public final org.telegram.ui.Components.a9 r;
    public FrameLayout s;
    public org.telegram.ui.Components.a10 w;
    public org.telegram.ui.ActionBar.g1 x;
    public Drawable y;

    public e50(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void Z(e50 e50Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.tr.a0(e50Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.t30
    public final void H(float f10) {
        yc ycVar = this.n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.t30
    public final void P(boolean z10, boolean z11) {
        yc ycVar = this.n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.t30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0359  */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i7;
        org.telegram.ui.Components.wt wtVar = this.c;
        if (wtVar != null) {
            wtVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131748080, null));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.n6.a7;
        org.telegram.ui.ActionBar.u6.h(i11, kVar, getResourceProvider());
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new cv(this, 8));
        int i13 = 2;
        wc wcVar = new wc(i13, context, this);
        org.telegram.ui.ActionBar.u6.h(i11, wcVar, getResourceProvider());
        this.fragmentView = wcVar;
        wcVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new gi.a(i13));
        this.y = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        b61 b61Var = new b61(19, context, this);
        b61Var.setOrientation(1);
        wcVar.addView(b61Var, c8.na.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i14 = org.telegram.ui.ActionBar.n6.d6;
        InsetDrawable f02 = org.telegram.ui.ActionBar.n6.f0(L, getThemedColor(i14));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(f02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, f02, M, null, resourceProvider);
        b61Var.addView(this.s, c8.na.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        fi.t3 t3Var = new fi.t3(9, context, this);
        this.d = t3Var;
        int i15 = this.Q;
        t3Var.setRoundRadius(org.telegram.messenger.g0.L(i15 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.a9 a9Var = this.r;
        a9Var.k(5L, null, null, null);
        this.d.setImageDrawable(a9Var);
        this.d.setContentDescription(org.telegram.messenger.gd.N0(2131752111, null));
        FrameLayout frameLayout2 = this.s;
        fi.t3 t3Var2 = this.d;
        boolean z10 = org.telegram.messenger.gd.a0;
        int i16 = 3;
        frameLayout2.addView(t3Var2, c8.na.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        hi.w5 w5Var = new hi.w5(this, context, paint, 12);
        this.e = w5Var;
        FrameLayout frameLayout3 = this.s;
        boolean z11 = org.telegram.messenger.gd.a0;
        frameLayout3.addView(w5Var, c8.na.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 16.0f, z11 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z40
            public final /* synthetic */ e50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        e50 e50Var = this.b;
                        e50Var.O.n(e50Var.E != null, new kz(e50Var, 9), new q5(e50Var, 7), 0);
                        e50Var.S.M(0);
                        e50Var.S.P(43);
                        e50Var.f.d();
                        break;
                    default:
                        e50 e50Var2 = this.b;
                        if (!e50Var2.N) {
                            if (e50Var2.c.a.length() != 0) {
                                e50Var2.N = true;
                                org.telegram.messenger.g0.v1(e50Var2.c);
                                e50Var2.c.setEnabled(false);
                                if (!e50Var2.O.g()) {
                                    org.telegram.ui.Components.a10 a10Var = e50Var2.w;
                                    if (a10Var != null) {
                                        a10Var.f(true, true);
                                    }
                                    e50Var2.W = e50Var2.getMessagesController().U(e50Var2.c.getText().toString(), e50Var2.L, null, e50Var2.Q, e50Var2.T, e50Var2.V, e50Var2.U, e50Var2.X, e50Var2);
                                    break;
                                } else {
                                    e50Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) e50Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.D3(e50Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.S = new org.telegram.ui.Components.nh0(R.raw.camera, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
        xc xcVar = new xc(i16, context, this);
        this.f = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.S);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(org.telegram.messenger.g0.L(0.0f), 0, 0, org.telegram.messenger.g0.L(1.0f));
        FrameLayout frameLayout4 = this.s;
        xc xcVar2 = this.f;
        boolean z12 = org.telegram.messenger.gd.a0;
        frameLayout4.addView(xcVar2, c8.na.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 16.0f, z12 ? 15.0f : 0.0f, 16.0f));
        yc ycVar = new yc(this, context, i10);
        this.n = ycVar;
        ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        yc ycVar2 = this.n;
        boolean z13 = org.telegram.messenger.gd.a0;
        frameLayout5.addView(ycVar2, c8.na.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 16.0f, z13 ? 16.0f : 0.0f, 16.0f));
        e0(false, false);
        org.telegram.ui.Components.wt wtVar2 = new org.telegram.ui.Components.wt(context, wcVar, this, 0, false, null);
        this.c = wtVar2;
        wtVar2.setHint(org.telegram.messenger.gd.N0((i15 == 0 || i15 == 4 || i15 == 5) ? 2131751110 : 2131751109, null));
        String str = this.P;
        if (str != null) {
            this.c.setText(str);
            org.telegram.ui.Components.wt wtVar3 = this.c;
            wtVar3.setSelection(wtVar3.getText().length());
            this.P = null;
        }
        TLRPC.User f10 = getUserConfig().f();
        int size = this.L.size() + 1;
        if (size < 2 || size > 5 || !TextUtils.isEmpty(this.c.getText())) {
            i7 = 2;
        } else {
            String str2 = "";
            try {
                if (size != 2) {
                    if (size == 3) {
                        str2 = org.telegram.messenger.gd.a0("GroupCreateMembersThree", null, 2131749258, f10.first_name, d0(0), d0(1));
                    } else if (size == 4) {
                        str2 = org.telegram.messenger.gd.a0("GroupCreateMembersFour", null, 2131749259, f10.first_name, d0(0), d0(1), d0(2));
                    } else if (size == 5) {
                        str2 = org.telegram.messenger.gd.a0("GroupCreateMembersFive", null, 2131749260, f10.first_name, d0(0), d0(1), d0(2), d0(3));
                    }
                    i7 = 2;
                } else {
                    i7 = 2;
                    try {
                        str2 = org.telegram.messenger.gd.a0("GroupCreateMembersTwo", null, 2131749257, f10.first_name, d0(0));
                    } catch (Exception e10) {
                        e = e10;
                        org.telegram.messenger.a8.g(e, true);
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
                        FrameLayout frameLayout6 = this.s;
                        org.telegram.ui.Components.wt wtVar4 = this.c;
                        boolean z14 = org.telegram.messenger.gd.a0;
                        frameLayout6.addView(wtVar4, c8.na.d(-1, -2.0f, 16, !z14 ? 5.0f : 96.0f, 0.0f, !z14 ? 96.0f : 5.0f, 0.0f));
                        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
                        this.b = ek0Var;
                        ek0Var.r1();
                        this.Y = new org.telegram.ui.Components.vy(1, this.b);
                        org.telegram.ui.Components.ek0 ek0Var2 = this.b;
                        c50 c50Var = new c50(this, context);
                        this.a = c50Var;
                        ek0Var2.setAdapter(c50Var);
                        this.b.setLayoutManager(this.Y);
                        this.b.setVerticalScrollBarEnabled(false);
                        this.b.setVerticalScrollbarPosition(!org.telegram.messenger.gd.a0 ? 1 : i7);
                        b61Var.addView(this.b, c8.na.o(-1, -1));
                        this.b.setOnScrollListener(new g3(this, 15));
                        this.b.setOnItemClickListener(new a50(this));
                        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
                        this.w = a10Var;
                        h6.m.s(a10Var);
                        wcVar.addView(this.w, org.telegram.ui.Components.a10.b());
                        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z40
                            public final /* synthetic */ e50 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        e50 e50Var = this.b;
                                        e50Var.O.n(e50Var.E != null, new kz(e50Var, 9), new q5(e50Var, 7), 0);
                                        e50Var.S.M(0);
                                        e50Var.S.P(43);
                                        e50Var.f.d();
                                        break;
                                    default:
                                        e50 e50Var2 = this.b;
                                        if (!e50Var2.N) {
                                            if (e50Var2.c.a.length() != 0) {
                                                e50Var2.N = true;
                                                org.telegram.messenger.g0.v1(e50Var2.c);
                                                e50Var2.c.setEnabled(false);
                                                if (!e50Var2.O.g()) {
                                                    org.telegram.ui.Components.a10 a10Var2 = e50Var2.w;
                                                    if (a10Var2 != null) {
                                                        a10Var2.f(true, true);
                                                    }
                                                    e50Var2.W = e50Var2.getMessagesController().U(e50Var2.c.getText().toString(), e50Var2.L, null, e50Var2.Q, e50Var2.T, e50Var2.V, e50Var2.U, e50Var2.X, e50Var2);
                                                    break;
                                                } else {
                                                    e50Var2.M = true;
                                                    break;
                                                }
                                            } else {
                                                Vibrator vibrator = (Vibrator) e50Var2.getParentActivity().getSystemService("vibrator");
                                                if (vibrator != null) {
                                                    vibrator.vibrate(200L);
                                                }
                                                org.telegram.messenger.g0.D3(e50Var2.c);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        this.w.setContentDescription(org.telegram.messenger.gd.N0(2131751342, null));
                        this.w.c.setImageResource(R.drawable.checkbig);
                        return this.fragmentView;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                i7 = 2;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.c.setText(str2);
                org.telegram.ui.Components.wt wtVar5 = this.c;
                wtVar5.w(0, wtVar5.getText().length());
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout62 = this.s;
        org.telegram.ui.Components.wt wtVar42 = this.c;
        boolean z142 = org.telegram.messenger.gd.a0;
        frameLayout62.addView(wtVar42, c8.na.d(-1, -2.0f, 16, !z142 ? 5.0f : 96.0f, 0.0f, !z142 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.ek0 ek0Var3 = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var3;
        ek0Var3.r1();
        this.Y = new org.telegram.ui.Components.vy(1, this.b);
        org.telegram.ui.Components.ek0 ek0Var22 = this.b;
        c50 c50Var2 = new c50(this, context);
        this.a = c50Var2;
        ek0Var22.setAdapter(c50Var2);
        this.b.setLayoutManager(this.Y);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(!org.telegram.messenger.gd.a0 ? 1 : i7);
        b61Var.addView(this.b, c8.na.o(-1, -1));
        this.b.setOnScrollListener(new g3(this, 15));
        this.b.setOnItemClickListener(new a50(this));
        org.telegram.ui.Components.a10 a10Var2 = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
        this.w = a10Var2;
        h6.m.s(a10Var2);
        wcVar.addView(this.w, org.telegram.ui.Components.a10.b());
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z40
            public final /* synthetic */ e50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e50 e50Var = this.b;
                        e50Var.O.n(e50Var.E != null, new kz(e50Var, 9), new q5(e50Var, 7), 0);
                        e50Var.S.M(0);
                        e50Var.S.P(43);
                        e50Var.f.d();
                        break;
                    default:
                        e50 e50Var2 = this.b;
                        if (!e50Var2.N) {
                            if (e50Var2.c.a.length() != 0) {
                                e50Var2.N = true;
                                org.telegram.messenger.g0.v1(e50Var2.c);
                                e50Var2.c.setEnabled(false);
                                if (!e50Var2.O.g()) {
                                    org.telegram.ui.Components.a10 a10Var22 = e50Var2.w;
                                    if (a10Var22 != null) {
                                        a10Var22.f(true, true);
                                    }
                                    e50Var2.W = e50Var2.getMessagesController().U(e50Var2.c.getText().toString(), e50Var2.L, null, e50Var2.Q, e50Var2.T, e50Var2.V, e50Var2.U, e50Var2.X, e50Var2);
                                    break;
                                } else {
                                    e50Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) e50Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.D3(e50Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.w.setContentDescription(org.telegram.messenger.gd.N0(2131751342, null));
        this.w.c.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    public final String d0(int i7) {
        return getMessagesController().c2((Long) this.L.get(i7)).first_name;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.r) {
            if (this.b == null) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.mp.I8;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            int childCount = this.b.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.b.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.i4) {
                    ((org.telegram.ui.Cells.i4) childAt).f(intValue);
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.S) {
            this.W = 0;
            this.N = false;
            org.telegram.ui.Components.a10 a10Var = this.w;
            if (a10Var != null) {
                a10Var.f(false, true);
            }
            org.telegram.ui.Components.wt wtVar = this.c;
            if (wtVar != null) {
                wtVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.R) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            d50 d50Var = this.Z;
            if (d50Var != null) {
                d50Var.d(this, longValue);
            } else {
                org.telegram.messenger.ks.f(this.currentAccount).k(org.telegram.messenger.ks.t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new bn(bundle), true);
            }
            if (this.G == null && this.H == null && this.I == null) {
                return;
            }
            getMessagesController().B(longValue, null, this.G, this.H, this.I, this.K, this.J, this.E, this.F, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void dismissCurrentDialog() {
        if (this.O.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.O.c && super.dismissDialogOnPause(dialog);
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z11) {
            if (z10) {
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
        int i7 = 1;
        if (z10) {
            this.n.setVisibility(0);
            AnimatorSet animatorSet2 = this.h;
            xc xcVar = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, (Property<xc, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<yc, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            xc xcVar2 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(xcVar2, (Property<xc, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<yc, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new b30(i7, this, z10));
        this.h.start();
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t30
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ri));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.O.h(i7, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.c;
        if (wtVar == null || !wtVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        wtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        e50 e50Var;
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.r);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.R);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.S);
        org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(2, true, true);
        this.O = u30Var;
        u30Var.a = this;
        u30Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.L = new ArrayList(longArray.length);
            int i7 = 0;
            while (i7 < longArray.length) {
                i7 = com.google.android.gms.internal.vision.e2.g(i7, 1, longArray[i7], this.L);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            Long l10 = (Long) this.L.get(i10);
            if (getMessagesController().c2(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (arrayList.isEmpty()) {
            e50Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            e50Var = this;
            org.telegram.messenger.tr.a0(this.currentAccount).a.c(new org.telegram.ui.Components.xz(e50Var, arrayList2, arrayList, countDownLatch, 18));
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
                getMessagesController().e4((TLRPC.User) obj, true, false);
            }
        }
        e50Var.X = getUserConfig().q0 * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.r);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.R);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.S);
        this.O.d();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        org.telegram.ui.Components.wt wtVar = this.c;
        if (wtVar != null) {
            wtVar.o();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wt wtVar = this.c;
        if (wtVar != null) {
            wtVar.r();
        }
        this.O.i();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.O.j(i7, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.wt wtVar = this.c;
        if (wtVar != null) {
            wtVar.s();
        }
        c50 c50Var = this.a;
        if (c50Var != null) {
            c50Var.f();
        }
        this.O.k();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.a10 a10Var = this.w;
            if (a10Var != null) {
                a10Var.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.Components.ek0 ek0Var = this.b;
            if (ek0Var != null) {
                ek0Var.x1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.wt wtVar = this.c;
            if (wtVar == null || wtVar.getEditText() == null) {
                return;
            }
            this.c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.n6.G6));
            this.c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.n6.k6), getThemedColor(org.telegram.ui.ActionBar.n6.l6), getThemedColor(org.telegram.ui.ActionBar.n6.p7));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.rt rtVar = this.c.a;
            rtVar.requestFocus();
            org.telegram.messenger.g0.I3(rtVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.u30 u30Var = this.O;
        if (u30Var != null) {
            u30Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.wt wtVar = this.c;
            if (wtVar != null) {
                wtVar.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.u30 u30Var = this.O;
        if (u30Var != null && (str = u30Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.wt wtVar = this.c;
        if (wtVar != null) {
            String obj = wtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ void U() {
    }
}
