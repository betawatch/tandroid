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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.a40 {
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
    public org.telegram.ui.Components.b40 N;
    public String O;
    public final int P;
    public final boolean Q;
    public org.telegram.ui.Components.bi0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.az X;
    public b60 Y;
    public a60 a;
    public org.telegram.ui.Components.tk0 b;
    public org.telegram.ui.Components.wt c;
    public ag.d2 d;
    public kg.f0 e;
    public hd f;
    public AnimatorSet h;
    public id n;
    public final org.telegram.ui.Components.r8 r;
    public FrameLayout s;
    public org.telegram.ui.Components.f10 w;
    public org.telegram.ui.ActionBar.k1 x;
    public Drawable y;

    public c60(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void Y(c60 c60Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.hs.a0(c60Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.a40
    public final void H(float f7) {
        id idVar = this.n;
        if (idVar == null) {
            return;
        }
        idVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.a40
    public final void O(boolean z10, boolean z11) {
        id idVar = this.n;
        if (idVar == null) {
            return;
        }
        idVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.a40
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 3));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    public final String c0(int i10) {
        return getMessagesController().Z1((Long) this.K.get(i10)).first_name;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0359  */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        org.telegram.ui.Components.wt wtVar = this.c;
        if (wtVar != null) {
            wtVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748290, null));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.t6.a7;
        org.telegram.ui.ActionBar.a7.i(i12, lVar, getResourceProvider());
        final int i13 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 26));
        gd gdVar = new gd(2, context, this);
        org.telegram.ui.ActionBar.a7.i(i12, gdVar, getResourceProvider());
        this.fragmentView = gdVar;
        gdVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        this.y = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        u71 u71Var = new u71(this, context, 14);
        u71Var.setOrientation(1);
        gdVar.addView(u71Var, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        int L = org.telegram.messenger.i0.L(16.0f);
        int i14 = org.telegram.ui.ActionBar.t6.d6;
        InsetDrawable f02 = org.telegram.ui.ActionBar.t6.f0(L, getThemedColor(i14));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(f02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, f02, N, null, resourceProvider);
        u71Var.addView(this.s, w7.b6.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        ag.d2 d2Var = new ag.d2(this, context, 8);
        this.d = d2Var;
        int i15 = this.P;
        d2Var.setRoundRadius(org.telegram.messenger.i0.L(i15 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.r8 r8Var = this.r;
        r8Var.k(5L, null, null, null);
        this.d.setImageDrawable(r8Var);
        this.d.setContentDescription(org.telegram.messenger.cd.L0(2131752123, null));
        FrameLayout frameLayout2 = this.s;
        ag.d2 d2Var2 = this.d;
        boolean z10 = org.telegram.messenger.cd.X;
        frameLayout2.addView(d2Var2, w7.b6.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        kg.f0 f0Var = new kg.f0(this, context, paint, 11);
        this.e = f0Var;
        FrameLayout frameLayout3 = this.s;
        boolean z11 = org.telegram.messenger.cd.X;
        frameLayout3.addView(f0Var, w7.b6.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 16.0f, z11 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x50
            public final /* synthetic */ c60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        c60 c60Var = this.b;
                        c60Var.N.n(c60Var.D != null, new zy(c60Var, 9), new q5(c60Var, 7), 0);
                        c60Var.R.M(0);
                        c60Var.R.P(43);
                        c60Var.f.d();
                        break;
                    default:
                        c60 c60Var2 = this.b;
                        if (!c60Var2.M) {
                            if (c60Var2.c.a.length() != 0) {
                                c60Var2.M = true;
                                org.telegram.messenger.i0.v1(c60Var2.c);
                                c60Var2.c.setEnabled(false);
                                if (!c60Var2.N.g()) {
                                    org.telegram.ui.Components.f10 f10Var = c60Var2.w;
                                    if (f10Var != null) {
                                        f10Var.f(true, true);
                                    }
                                    c60Var2.V = c60Var2.getMessagesController().U(c60Var2.c.getText().toString(), c60Var2.K, null, c60Var2.P, c60Var2.S, c60Var2.U, c60Var2.T, c60Var2.W, c60Var2);
                                    break;
                                } else {
                                    c60Var2.L = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) c60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.i0.E3(c60Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.R = new org.telegram.ui.Components.bi0(R.raw.camera, org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f), false, null);
        hd hdVar = new hd(this, context, 3);
        this.f = hdVar;
        hdVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.R);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(org.telegram.messenger.i0.L(0.0f), 0, 0, org.telegram.messenger.i0.L(1.0f));
        FrameLayout frameLayout4 = this.s;
        hd hdVar2 = this.f;
        boolean z12 = org.telegram.messenger.cd.X;
        frameLayout4.addView(hdVar2, w7.b6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 16.0f, z12 ? 15.0f : 0.0f, 16.0f));
        id idVar = new id(this, context, i11);
        this.n = idVar;
        idVar.setSize(org.telegram.messenger.i0.L(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        id idVar2 = this.n;
        boolean z13 = org.telegram.messenger.cd.X;
        frameLayout5.addView(idVar2, w7.b6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 16.0f, z13 ? 16.0f : 0.0f, 16.0f));
        d0(false, false);
        org.telegram.ui.Components.wt wtVar2 = new org.telegram.ui.Components.wt(context, gdVar, this, 0, false, null);
        this.c = wtVar2;
        wtVar2.setHint(org.telegram.messenger.cd.L0((i15 == 0 || i15 == 4 || i15 == 5) ? 2131751123 : 2131751122, null));
        String str = this.O;
        if (str != null) {
            this.c.setText(str);
            org.telegram.ui.Components.wt wtVar3 = this.c;
            wtVar3.setSelection(wtVar3.getText().length());
            this.O = null;
        }
        TLRPC.User f7 = getUserConfig().f();
        int size = this.K.size() + 1;
        if (size < 2 || size > 5 || !TextUtils.isEmpty(this.c.getText())) {
            i10 = 2;
        } else {
            String str2 = "";
            try {
                if (size != 2) {
                    if (size == 3) {
                        str2 = org.telegram.messenger.cd.a0("GroupCreateMembersThree", null, 2131749460, f7.first_name, c0(0), c0(1));
                    } else if (size == 4) {
                        str2 = org.telegram.messenger.cd.a0("GroupCreateMembersFour", null, 2131749461, f7.first_name, c0(0), c0(1), c0(2));
                    } else if (size == 5) {
                        str2 = org.telegram.messenger.cd.a0("GroupCreateMembersFive", null, 2131749462, f7.first_name, c0(0), c0(1), c0(2), c0(3));
                    }
                    i10 = 2;
                } else {
                    i10 = 2;
                    try {
                        str2 = org.telegram.messenger.cd.a0("GroupCreateMembersTwo", null, 2131749459, f7.first_name, c0(0));
                    } catch (Exception e) {
                        e = e;
                        org.telegram.messenger.f8.g(e, true);
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
                        FrameLayout frameLayout6 = this.s;
                        org.telegram.ui.Components.wt wtVar4 = this.c;
                        boolean z14 = org.telegram.messenger.cd.X;
                        frameLayout6.addView(wtVar4, w7.b6.d(-1, -2.0f, 16, !z14 ? 5.0f : 96.0f, 0.0f, !z14 ? 96.0f : 5.0f, 0.0f));
                        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
                        this.b = tk0Var;
                        tk0Var.r1();
                        this.X = new org.telegram.ui.Components.az(1, this.b);
                        org.telegram.ui.Components.tk0 tk0Var2 = this.b;
                        a60 a60Var = new a60(this, context);
                        this.a = a60Var;
                        tk0Var2.setAdapter(a60Var);
                        this.b.setLayoutManager(this.X);
                        this.b.setVerticalScrollBarEnabled(false);
                        this.b.setVerticalScrollbarPosition(!org.telegram.messenger.cd.X ? 1 : i10);
                        u71Var.addView(this.b, w7.b6.o(-1, -1));
                        this.b.setOnScrollListener(new h3(this, 15));
                        this.b.setOnItemClickListener(new y50(this));
                        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
                        this.w = f10Var;
                        li.k.i(f10Var);
                        gdVar.addView(this.w, org.telegram.ui.Components.f10.b());
                        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x50
                            public final /* synthetic */ c60 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i11) {
                                    case 0:
                                        c60 c60Var = this.b;
                                        c60Var.N.n(c60Var.D != null, new zy(c60Var, 9), new q5(c60Var, 7), 0);
                                        c60Var.R.M(0);
                                        c60Var.R.P(43);
                                        c60Var.f.d();
                                        break;
                                    default:
                                        c60 c60Var2 = this.b;
                                        if (!c60Var2.M) {
                                            if (c60Var2.c.a.length() != 0) {
                                                c60Var2.M = true;
                                                org.telegram.messenger.i0.v1(c60Var2.c);
                                                c60Var2.c.setEnabled(false);
                                                if (!c60Var2.N.g()) {
                                                    org.telegram.ui.Components.f10 f10Var2 = c60Var2.w;
                                                    if (f10Var2 != null) {
                                                        f10Var2.f(true, true);
                                                    }
                                                    c60Var2.V = c60Var2.getMessagesController().U(c60Var2.c.getText().toString(), c60Var2.K, null, c60Var2.P, c60Var2.S, c60Var2.U, c60Var2.T, c60Var2.W, c60Var2);
                                                    break;
                                                } else {
                                                    c60Var2.L = true;
                                                    break;
                                                }
                                            } else {
                                                Vibrator vibrator = (Vibrator) c60Var2.getParentActivity().getSystemService("vibrator");
                                                if (vibrator != null) {
                                                    vibrator.vibrate(200L);
                                                }
                                                org.telegram.messenger.i0.E3(c60Var2.c);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        this.w.setContentDescription(org.telegram.messenger.cd.L0(2131751355, null));
                        this.w.c.setImageResource(R.drawable.checkbig);
                        return this.fragmentView;
                    }
                }
            } catch (Exception e7) {
                e = e7;
                i10 = 2;
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
        boolean z142 = org.telegram.messenger.cd.X;
        frameLayout62.addView(wtVar42, w7.b6.d(-1, -2.0f, 16, !z142 ? 5.0f : 96.0f, 0.0f, !z142 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.tk0 tk0Var3 = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var3;
        tk0Var3.r1();
        this.X = new org.telegram.ui.Components.az(1, this.b);
        org.telegram.ui.Components.tk0 tk0Var22 = this.b;
        a60 a60Var2 = new a60(this, context);
        this.a = a60Var2;
        tk0Var22.setAdapter(a60Var2);
        this.b.setLayoutManager(this.X);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(!org.telegram.messenger.cd.X ? 1 : i10);
        u71Var.addView(this.b, w7.b6.o(-1, -1));
        this.b.setOnScrollListener(new h3(this, 15));
        this.b.setOnItemClickListener(new y50(this));
        org.telegram.ui.Components.f10 f10Var2 = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.w = f10Var2;
        li.k.i(f10Var2);
        gdVar.addView(this.w, org.telegram.ui.Components.f10.b());
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x50
            public final /* synthetic */ c60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        c60 c60Var = this.b;
                        c60Var.N.n(c60Var.D != null, new zy(c60Var, 9), new q5(c60Var, 7), 0);
                        c60Var.R.M(0);
                        c60Var.R.P(43);
                        c60Var.f.d();
                        break;
                    default:
                        c60 c60Var2 = this.b;
                        if (!c60Var2.M) {
                            if (c60Var2.c.a.length() != 0) {
                                c60Var2.M = true;
                                org.telegram.messenger.i0.v1(c60Var2.c);
                                c60Var2.c.setEnabled(false);
                                if (!c60Var2.N.g()) {
                                    org.telegram.ui.Components.f10 f10Var22 = c60Var2.w;
                                    if (f10Var22 != null) {
                                        f10Var22.f(true, true);
                                    }
                                    c60Var2.V = c60Var2.getMessagesController().U(c60Var2.c.getText().toString(), c60Var2.K, null, c60Var2.P, c60Var2.S, c60Var2.U, c60Var2.T, c60Var2.W, c60Var2);
                                    break;
                                } else {
                                    c60Var2.L = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) c60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.i0.E3(c60Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.w.setContentDescription(org.telegram.messenger.cd.L0(2131751355, null));
        this.w.c.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    public final void d0(boolean z10, boolean z11) {
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
        if (z10) {
            this.n.setVisibility(0);
            AnimatorSet animatorSet2 = this.h;
            hd hdVar = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(hdVar, (Property<hd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<id, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            hd hdVar2 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(hdVar2, (Property<hd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<id, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new org.telegram.ui.Components.ha0(16, this, z10));
        this.h.start();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.r) {
            if (this.b == null) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.vp.D8;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            int childCount = this.b.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.b.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.j4) {
                    ((org.telegram.ui.Cells.j4) childAt).f(intValue);
                }
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.S) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.f10 f10Var = this.w;
            if (f10Var != null) {
                f10Var.f(false, true);
            }
            org.telegram.ui.Components.wt wtVar = this.c;
            if (wtVar != null) {
                wtVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.R) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            b60 b60Var = this.Y;
            if (b60Var != null) {
                b60Var.f(this, longValue);
            } else {
                org.telegram.messenger.zs.f(this.currentAccount).k(org.telegram.messenger.zs.t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new un(bundle), true);
            }
            if (this.F == null && this.G == null && this.H == null) {
                return;
            }
            getMessagesController().B(longValue, null, this.F, this.G, this.H, this.J, this.I, this.D, this.E, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void dismissCurrentDialog() {
        if (this.N.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.N.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ gs0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.a40
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Mi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.N.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.k2
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

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        c60 c60Var;
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.r);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.R);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.S);
        org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(2, true, true);
        this.N = b40Var;
        b40Var.a = this;
        b40Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.K = new ArrayList(longArray.length);
            int i10 = 0;
            while (i10 < longArray.length) {
                i10 = c3.i0.k(i10, 1, longArray[i10], this.K);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.K.size(); i11++) {
            Long l4 = (Long) this.K.get(i11);
            if (getMessagesController().Z1(l4) == null) {
                arrayList.add(l4);
            }
        }
        if (arrayList.isEmpty()) {
            c60Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            c60Var = this;
            org.telegram.messenger.hs.a0(this.currentAccount).a.c(new w50(c60Var, arrayList2, arrayList, countDownLatch, 0));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                getMessagesController().U3((TLRPC.User) obj, true, false);
            }
        }
        c60Var.W = getUserConfig().p0 * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.r);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.R);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.S);
        this.N.d();
        if (this.V != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.V, true);
        }
        org.telegram.ui.Components.wt wtVar = this.c;
        if (wtVar != null) {
            wtVar.o();
        }
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wt wtVar = this.c;
        if (wtVar != null) {
            wtVar.r();
        }
        this.N.i();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.N.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.wt wtVar = this.c;
        if (wtVar != null) {
            wtVar.s();
        }
        a60 a60Var = this.a;
        if (a60Var != null) {
            a60Var.f();
        }
        this.N.k();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.f10 f10Var = this.w;
            if (f10Var != null) {
                f10Var.updateColors();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            org.telegram.ui.Components.tk0 tk0Var = this.b;
            if (tk0Var != null) {
                tk0Var.x1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.wt wtVar = this.c;
            if (wtVar == null || wtVar.getEditText() == null) {
                return;
            }
            this.c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.G6));
            this.c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.t6.k6), getThemedColor(org.telegram.ui.ActionBar.t6.l6), getThemedColor(org.telegram.ui.ActionBar.t6.p7));
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.rt rtVar = this.c.a;
            rtVar.requestFocus();
            org.telegram.messenger.i0.J3(rtVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.b40 b40Var = this.N;
        if (b40Var != null) {
            b40Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.wt wtVar = this.c;
            if (wtVar != null) {
                wtVar.setText(string);
            } else {
                this.O = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.b40 b40Var = this.N;
        if (b40Var != null && (str = b40Var.f) != null) {
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

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ void T() {
    }
}
