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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c50 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, org.telegram.ui.Components.l30 {
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
    public org.telegram.ui.Components.m30 O;
    public String P;
    public final int Q;
    public final boolean R;
    public org.telegram.ui.Components.ch0 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public org.telegram.ui.Components.qy Y;
    public b50 Z;
    public a50 a;
    public org.telegram.ui.Components.uj0 b;
    public org.telegram.ui.Components.rt c;
    public fi.v3 d;
    public hi.n5 e;
    public xc f;
    public AnimatorSet h;
    public yc n;
    public final org.telegram.ui.Components.t8 r;
    public FrameLayout s;
    public org.telegram.ui.Components.t00 w;
    public org.telegram.ui.ActionBar.g1 x;
    public Drawable y;

    public c50(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void Z(c50 c50Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.vr.a0(c50Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.l30
    public final void I(float f10) {
        yc ycVar = this.n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.l30
    public final void O(boolean z10, boolean z11) {
        yc ycVar = this.n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.l30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new li.j(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0358  */
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i7;
        org.telegram.ui.Components.rt rtVar = this.c;
        if (rtVar != null) {
            rtVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748273, null));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        org.telegram.ui.ActionBar.q6.h(i11, kVar, getResourceProvider());
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 6));
        int i13 = 2;
        wc wcVar = new wc(i13, context, this);
        org.telegram.ui.ActionBar.q6.h(i11, wcVar, getResourceProvider());
        this.fragmentView = wcVar;
        wcVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new gi.a(i13));
        this.y = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        z51 z51Var = new z51(20, context, this);
        z51Var.setOrientation(1);
        wcVar.addView(z51Var, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i14 = org.telegram.ui.ActionBar.j6.d6;
        InsetDrawable f02 = org.telegram.ui.ActionBar.j6.f0(L, getThemedColor(i14));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(f02);
        org.telegram.ui.ActionBar.q6.j(frameLayout, f02, M, null, resourceProvider);
        z51Var.addView(this.s, c8.ja.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        fi.v3 v3Var = new fi.v3(9, context, this);
        this.d = v3Var;
        int i15 = this.Q;
        v3Var.setRoundRadius(org.telegram.messenger.g0.L(i15 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.t8 t8Var = this.r;
        t8Var.k(5L, null, null, null);
        this.d.setImageDrawable(t8Var);
        this.d.setContentDescription(org.telegram.messenger.hd.M0(2131752123, null));
        FrameLayout frameLayout2 = this.s;
        fi.v3 v3Var2 = this.d;
        boolean z10 = org.telegram.messenger.hd.a0;
        int i16 = 3;
        frameLayout2.addView(v3Var2, c8.ja.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        hi.n5 n5Var = new hi.n5(this, context, paint, 12);
        this.e = n5Var;
        FrameLayout frameLayout3 = this.s;
        boolean z11 = org.telegram.messenger.hd.a0;
        frameLayout3.addView(n5Var, c8.ja.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 16.0f, z11 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x40
            public final /* synthetic */ c50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        c50 c50Var = this.b;
                        c50Var.O.n(c50Var.E != null, new iz(c50Var, 9), new q5(c50Var, 7), 0);
                        c50Var.S.M(0);
                        c50Var.S.P(43);
                        c50Var.f.d();
                        break;
                    default:
                        c50 c50Var2 = this.b;
                        if (!c50Var2.N) {
                            if (c50Var2.c.a.length() != 0) {
                                c50Var2.N = true;
                                org.telegram.messenger.g0.v1(c50Var2.c);
                                c50Var2.c.setEnabled(false);
                                if (!c50Var2.O.g()) {
                                    org.telegram.ui.Components.t00 t00Var = c50Var2.w;
                                    if (t00Var != null) {
                                        t00Var.f(true, true);
                                    }
                                    c50Var2.W = c50Var2.getMessagesController().U(c50Var2.c.getText().toString(), c50Var2.L, null, c50Var2.Q, c50Var2.T, c50Var2.V, c50Var2.U, c50Var2.X, c50Var2);
                                    break;
                                } else {
                                    c50Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) c50Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.E3(c50Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.S = new org.telegram.ui.Components.ch0(R.raw.camera, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
        xc xcVar = new xc(i16, context, this);
        this.f = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.S);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(org.telegram.messenger.g0.L(0.0f), 0, 0, org.telegram.messenger.g0.L(1.0f));
        FrameLayout frameLayout4 = this.s;
        xc xcVar2 = this.f;
        boolean z12 = org.telegram.messenger.hd.a0;
        frameLayout4.addView(xcVar2, c8.ja.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 16.0f, z12 ? 15.0f : 0.0f, 16.0f));
        yc ycVar = new yc(this, context, i10);
        this.n = ycVar;
        ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        yc ycVar2 = this.n;
        boolean z13 = org.telegram.messenger.hd.a0;
        frameLayout5.addView(ycVar2, c8.ja.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 16.0f, z13 ? 16.0f : 0.0f, 16.0f));
        e0(false, false);
        org.telegram.ui.Components.rt rtVar2 = new org.telegram.ui.Components.rt(context, wcVar, this, 0, false, null);
        this.c = rtVar2;
        rtVar2.setHint(org.telegram.messenger.hd.M0((i15 == 0 || i15 == 4 || i15 == 5) ? 2131751122 : 2131751121, null));
        String str = this.P;
        if (str != null) {
            this.c.setText(str);
            org.telegram.ui.Components.rt rtVar3 = this.c;
            rtVar3.setSelection(rtVar3.getText().length());
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
                        str2 = org.telegram.messenger.hd.a0("GroupCreateMembersThree", null, 2131749451, f10.first_name, d0(0), d0(1));
                    } else if (size == 4) {
                        str2 = org.telegram.messenger.hd.a0("GroupCreateMembersFour", null, 2131749452, f10.first_name, d0(0), d0(1), d0(2));
                    } else if (size == 5) {
                        str2 = org.telegram.messenger.hd.a0("GroupCreateMembersFive", null, 2131749453, f10.first_name, d0(0), d0(1), d0(2), d0(3));
                    }
                    i7 = 2;
                } else {
                    i7 = 2;
                    try {
                        str2 = org.telegram.messenger.hd.a0("GroupCreateMembersTwo", null, 2131749450, f10.first_name, d0(0));
                    } catch (Exception e10) {
                        e = e10;
                        org.telegram.messenger.a8.g(e, true);
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
                        FrameLayout frameLayout6 = this.s;
                        org.telegram.ui.Components.rt rtVar4 = this.c;
                        boolean z14 = org.telegram.messenger.hd.a0;
                        frameLayout6.addView(rtVar4, c8.ja.d(-1, -2.0f, 16, !z14 ? 5.0f : 96.0f, 0.0f, !z14 ? 96.0f : 5.0f, 0.0f));
                        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
                        this.b = uj0Var;
                        uj0Var.r1();
                        this.Y = new org.telegram.ui.Components.qy(1, this.b);
                        org.telegram.ui.Components.uj0 uj0Var2 = this.b;
                        a50 a50Var = new a50(this, context);
                        this.a = a50Var;
                        uj0Var2.setAdapter(a50Var);
                        this.b.setLayoutManager(this.Y);
                        this.b.setVerticalScrollBarEnabled(false);
                        this.b.setVerticalScrollbarPosition(!org.telegram.messenger.hd.a0 ? 1 : i7);
                        z51Var.addView(this.b, c8.ja.o(-1, -1));
                        this.b.setOnScrollListener(new g3(this, 15));
                        this.b.setOnItemClickListener(new y40(this));
                        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
                        this.w = t00Var;
                        h6.m.g(t00Var);
                        wcVar.addView(this.w, org.telegram.ui.Components.t00.b());
                        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x40
                            public final /* synthetic */ c50 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        c50 c50Var = this.b;
                                        c50Var.O.n(c50Var.E != null, new iz(c50Var, 9), new q5(c50Var, 7), 0);
                                        c50Var.S.M(0);
                                        c50Var.S.P(43);
                                        c50Var.f.d();
                                        break;
                                    default:
                                        c50 c50Var2 = this.b;
                                        if (!c50Var2.N) {
                                            if (c50Var2.c.a.length() != 0) {
                                                c50Var2.N = true;
                                                org.telegram.messenger.g0.v1(c50Var2.c);
                                                c50Var2.c.setEnabled(false);
                                                if (!c50Var2.O.g()) {
                                                    org.telegram.ui.Components.t00 t00Var2 = c50Var2.w;
                                                    if (t00Var2 != null) {
                                                        t00Var2.f(true, true);
                                                    }
                                                    c50Var2.W = c50Var2.getMessagesController().U(c50Var2.c.getText().toString(), c50Var2.L, null, c50Var2.Q, c50Var2.T, c50Var2.V, c50Var2.U, c50Var2.X, c50Var2);
                                                    break;
                                                } else {
                                                    c50Var2.M = true;
                                                    break;
                                                }
                                            } else {
                                                Vibrator vibrator = (Vibrator) c50Var2.getParentActivity().getSystemService("vibrator");
                                                if (vibrator != null) {
                                                    vibrator.vibrate(200L);
                                                }
                                                org.telegram.messenger.g0.E3(c50Var2.c);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        this.w.setContentDescription(org.telegram.messenger.hd.M0(2131751354, null));
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
                org.telegram.ui.Components.rt rtVar5 = this.c;
                rtVar5.w(0, rtVar5.getText().length());
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout62 = this.s;
        org.telegram.ui.Components.rt rtVar42 = this.c;
        boolean z142 = org.telegram.messenger.hd.a0;
        frameLayout62.addView(rtVar42, c8.ja.d(-1, -2.0f, 16, !z142 ? 5.0f : 96.0f, 0.0f, !z142 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.uj0 uj0Var3 = new org.telegram.ui.Components.uj0(context, null);
        this.b = uj0Var3;
        uj0Var3.r1();
        this.Y = new org.telegram.ui.Components.qy(1, this.b);
        org.telegram.ui.Components.uj0 uj0Var22 = this.b;
        a50 a50Var2 = new a50(this, context);
        this.a = a50Var2;
        uj0Var22.setAdapter(a50Var2);
        this.b.setLayoutManager(this.Y);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(!org.telegram.messenger.hd.a0 ? 1 : i7);
        z51Var.addView(this.b, c8.ja.o(-1, -1));
        this.b.setOnScrollListener(new g3(this, 15));
        this.b.setOnItemClickListener(new y40(this));
        org.telegram.ui.Components.t00 t00Var2 = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
        this.w = t00Var2;
        h6.m.g(t00Var2);
        wcVar.addView(this.w, org.telegram.ui.Components.t00.b());
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x40
            public final /* synthetic */ c50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        c50 c50Var = this.b;
                        c50Var.O.n(c50Var.E != null, new iz(c50Var, 9), new q5(c50Var, 7), 0);
                        c50Var.S.M(0);
                        c50Var.S.P(43);
                        c50Var.f.d();
                        break;
                    default:
                        c50 c50Var2 = this.b;
                        if (!c50Var2.N) {
                            if (c50Var2.c.a.length() != 0) {
                                c50Var2.N = true;
                                org.telegram.messenger.g0.v1(c50Var2.c);
                                c50Var2.c.setEnabled(false);
                                if (!c50Var2.O.g()) {
                                    org.telegram.ui.Components.t00 t00Var22 = c50Var2.w;
                                    if (t00Var22 != null) {
                                        t00Var22.f(true, true);
                                    }
                                    c50Var2.W = c50Var2.getMessagesController().U(c50Var2.c.getText().toString(), c50Var2.L, null, c50Var2.Q, c50Var2.T, c50Var2.V, c50Var2.U, c50Var2.X, c50Var2);
                                    break;
                                } else {
                                    c50Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) c50Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.E3(c50Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.w.setContentDescription(org.telegram.messenger.hd.M0(2131751354, null));
        this.w.c.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    public final String d0(int i7) {
        return getMessagesController().a2((Long) this.L.get(i7)).first_name;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.r) {
            if (this.b == null) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.D8;
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
        if (i7 == org.telegram.messenger.ns.S) {
            this.W = 0;
            this.N = false;
            org.telegram.ui.Components.t00 t00Var = this.w;
            if (t00Var != null) {
                t00Var.f(false, true);
            }
            org.telegram.ui.Components.rt rtVar = this.c;
            if (rtVar != null) {
                rtVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.R) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            b50 b50Var = this.Z;
            if (b50Var != null) {
                b50Var.c(this, longValue);
            } else {
                org.telegram.messenger.ns.f(this.currentAccount).k(org.telegram.messenger.ns.t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new an(bundle), true);
            }
            if (this.G == null && this.H == null && this.I == null) {
                return;
            }
            getMessagesController().B(longValue, null, this.G, this.H, this.I, this.K, this.J, this.E, this.F, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void dismissCurrentDialog() {
        if (this.O.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.O.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean e() {
        return true;
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
        this.h.addListener(new z20(i7, this, z10));
        this.h.start();
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ uq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.l30
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ri));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.O.h(i7, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.rt rtVar = this.c;
        if (rtVar == null || !rtVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        rtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        c50 c50Var;
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.r);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.R);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.S);
        org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(2, true, true);
        this.O = m30Var;
        m30Var.a = this;
        m30Var.b = this;
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
            if (getMessagesController().a2(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (arrayList.isEmpty()) {
            c50Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            c50Var = this;
            org.telegram.messenger.vr.a0(this.currentAccount).a.c(new org.telegram.ui.Components.u80((Object) c50Var, arrayList2, arrayList, (Object) countDownLatch, 14));
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
        c50Var.X = getUserConfig().q0 * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.r);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.R);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.S);
        this.O.d();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        org.telegram.ui.Components.rt rtVar = this.c;
        if (rtVar != null) {
            rtVar.o();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.rt rtVar = this.c;
        if (rtVar != null) {
            rtVar.r();
        }
        this.O.i();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.O.j(i7, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.rt rtVar = this.c;
        if (rtVar != null) {
            rtVar.s();
        }
        a50 a50Var = this.a;
        if (a50Var != null) {
            a50Var.f();
        }
        this.O.k();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.t00 t00Var = this.w;
            if (t00Var != null) {
                t00Var.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.Components.uj0 uj0Var = this.b;
            if (uj0Var != null) {
                uj0Var.x1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.rt rtVar = this.c;
            if (rtVar == null || rtVar.getEditText() == null) {
                return;
            }
            this.c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            this.c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.j6.k6), getThemedColor(org.telegram.ui.ActionBar.j6.l6), getThemedColor(org.telegram.ui.ActionBar.j6.p7));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.mt mtVar = this.c.a;
            mtVar.requestFocus();
            org.telegram.messenger.g0.J3(mtVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.m30 m30Var = this.O;
        if (m30Var != null) {
            m30Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.rt rtVar = this.c;
            if (rtVar != null) {
                rtVar.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.m30 m30Var = this.O;
        if (m30Var != null && (str = m30Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.rt rtVar = this.c;
        if (rtVar != null) {
            String obj = rtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ void U() {
    }
}
