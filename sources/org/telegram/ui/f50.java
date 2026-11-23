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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class f50 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs, org.telegram.ui.Components.w30 {
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
    public org.telegram.ui.Components.x30 O;
    public String P;
    public final int Q;
    public final boolean R;
    public org.telegram.ui.Components.oh0 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public org.telegram.ui.Components.yy Y;
    public e50 Z;
    public d50 a;
    public org.telegram.ui.Components.ek0 b;
    public org.telegram.ui.Components.yt c;
    public fi.t3 d;
    public hi.l5 e;
    public xc f;
    public AnimatorSet h;
    public yc n;
    public final org.telegram.ui.Components.b9 r;
    public FrameLayout s;
    public org.telegram.ui.Components.c10 w;
    public org.telegram.ui.ActionBar.g1 x;
    public Drawable y;

    public f50(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void Z(f50 f50Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.ur.a0(f50Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.w30
    public final void I(float f10) {
        yc ycVar = this.n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.w30
    public final void Q(boolean z10, boolean z11) {
        yc ycVar = this.n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.w30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.l(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
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
        org.telegram.ui.Components.yt ytVar = this.c;
        if (ytVar != null) {
            ytVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131748080, null));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.m6.a7;
        org.telegram.ui.ActionBar.t6.h(i11, kVar, getResourceProvider());
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 8));
        int i13 = 2;
        wc wcVar = new wc(i13, context, this);
        org.telegram.ui.ActionBar.t6.h(i11, wcVar, getResourceProvider());
        this.fragmentView = wcVar;
        wcVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new gi.a(i13));
        this.y = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        d61 d61Var = new d61(19, context, this);
        d61Var.setOrientation(1);
        wcVar.addView(d61Var, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i14 = org.telegram.ui.ActionBar.m6.d6;
        InsetDrawable f02 = org.telegram.ui.ActionBar.m6.f0(L, getThemedColor(i14));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(f02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, f02, M, null, resourceProvider);
        d61Var.addView(this.s, c8.ma.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        fi.t3 t3Var = new fi.t3(9, context, this);
        this.d = t3Var;
        int i15 = this.Q;
        t3Var.setRoundRadius(org.telegram.messenger.g0.L(i15 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.b9 b9Var = this.r;
        b9Var.k(5L, null, null, null);
        this.d.setImageDrawable(b9Var);
        this.d.setContentDescription(org.telegram.messenger.hd.N0(2131752111, null));
        FrameLayout frameLayout2 = this.s;
        fi.t3 t3Var2 = this.d;
        boolean z10 = org.telegram.messenger.hd.a0;
        int i16 = 3;
        frameLayout2.addView(t3Var2, c8.ma.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        hi.l5 l5Var = new hi.l5(this, context, paint, 12);
        this.e = l5Var;
        FrameLayout frameLayout3 = this.s;
        boolean z11 = org.telegram.messenger.hd.a0;
        frameLayout3.addView(l5Var, c8.ma.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 16.0f, z11 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a50
            public final /* synthetic */ f50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        f50 f50Var = this.b;
                        f50Var.O.n(f50Var.E != null, new lz(f50Var, 9), new q5(f50Var, 7), 0);
                        f50Var.S.M(0);
                        f50Var.S.P(43);
                        f50Var.f.d();
                        break;
                    default:
                        f50 f50Var2 = this.b;
                        if (!f50Var2.N) {
                            if (f50Var2.c.a.length() != 0) {
                                f50Var2.N = true;
                                org.telegram.messenger.g0.v1(f50Var2.c);
                                f50Var2.c.setEnabled(false);
                                if (!f50Var2.O.g()) {
                                    org.telegram.ui.Components.c10 c10Var = f50Var2.w;
                                    if (c10Var != null) {
                                        c10Var.f(true, true);
                                    }
                                    f50Var2.W = f50Var2.getMessagesController().U(f50Var2.c.getText().toString(), f50Var2.L, null, f50Var2.Q, f50Var2.T, f50Var2.V, f50Var2.U, f50Var2.X, f50Var2);
                                    break;
                                } else {
                                    f50Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) f50Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.D3(f50Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.S = new org.telegram.ui.Components.oh0(R.raw.camera, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
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
        frameLayout4.addView(xcVar2, c8.ma.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 16.0f, z12 ? 15.0f : 0.0f, 16.0f));
        yc ycVar = new yc(this, context, i10);
        this.n = ycVar;
        ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        yc ycVar2 = this.n;
        boolean z13 = org.telegram.messenger.hd.a0;
        frameLayout5.addView(ycVar2, c8.ma.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 16.0f, z13 ? 16.0f : 0.0f, 16.0f));
        e0(false, false);
        org.telegram.ui.Components.yt ytVar2 = new org.telegram.ui.Components.yt(context, wcVar, this, 0, false, null);
        this.c = ytVar2;
        ytVar2.setHint(org.telegram.messenger.hd.N0((i15 == 0 || i15 == 4 || i15 == 5) ? 2131751110 : 2131751109, null));
        String str = this.P;
        if (str != null) {
            this.c.setText(str);
            org.telegram.ui.Components.yt ytVar3 = this.c;
            ytVar3.setSelection(ytVar3.getText().length());
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
                        str2 = org.telegram.messenger.hd.a0("GroupCreateMembersThree", null, 2131749258, f10.first_name, d0(0), d0(1));
                    } else if (size == 4) {
                        str2 = org.telegram.messenger.hd.a0("GroupCreateMembersFour", null, 2131749259, f10.first_name, d0(0), d0(1), d0(2));
                    } else if (size == 5) {
                        str2 = org.telegram.messenger.hd.a0("GroupCreateMembersFive", null, 2131749260, f10.first_name, d0(0), d0(1), d0(2), d0(3));
                    }
                    i7 = 2;
                } else {
                    i7 = 2;
                    try {
                        str2 = org.telegram.messenger.hd.a0("GroupCreateMembersTwo", null, 2131749257, f10.first_name, d0(0));
                    } catch (Exception e10) {
                        e = e10;
                        org.telegram.messenger.a8.g(e, true);
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
                        FrameLayout frameLayout6 = this.s;
                        org.telegram.ui.Components.yt ytVar4 = this.c;
                        boolean z14 = org.telegram.messenger.hd.a0;
                        frameLayout6.addView(ytVar4, c8.ma.d(-1, -2.0f, 16, !z14 ? 5.0f : 96.0f, 0.0f, !z14 ? 96.0f : 5.0f, 0.0f));
                        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
                        this.b = ek0Var;
                        ek0Var.r1();
                        this.Y = new org.telegram.ui.Components.yy(1, this.b);
                        org.telegram.ui.Components.ek0 ek0Var2 = this.b;
                        d50 d50Var = new d50(this, context);
                        this.a = d50Var;
                        ek0Var2.setAdapter(d50Var);
                        this.b.setLayoutManager(this.Y);
                        this.b.setVerticalScrollBarEnabled(false);
                        this.b.setVerticalScrollbarPosition(!org.telegram.messenger.hd.a0 ? 1 : i7);
                        d61Var.addView(this.b, c8.ma.o(-1, -1));
                        this.b.setOnScrollListener(new g3(this, 15));
                        this.b.setOnItemClickListener(new b50(this));
                        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
                        this.w = c10Var;
                        h6.m.i(c10Var);
                        wcVar.addView(this.w, org.telegram.ui.Components.c10.b());
                        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a50
                            public final /* synthetic */ f50 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        f50 f50Var = this.b;
                                        f50Var.O.n(f50Var.E != null, new lz(f50Var, 9), new q5(f50Var, 7), 0);
                                        f50Var.S.M(0);
                                        f50Var.S.P(43);
                                        f50Var.f.d();
                                        break;
                                    default:
                                        f50 f50Var2 = this.b;
                                        if (!f50Var2.N) {
                                            if (f50Var2.c.a.length() != 0) {
                                                f50Var2.N = true;
                                                org.telegram.messenger.g0.v1(f50Var2.c);
                                                f50Var2.c.setEnabled(false);
                                                if (!f50Var2.O.g()) {
                                                    org.telegram.ui.Components.c10 c10Var2 = f50Var2.w;
                                                    if (c10Var2 != null) {
                                                        c10Var2.f(true, true);
                                                    }
                                                    f50Var2.W = f50Var2.getMessagesController().U(f50Var2.c.getText().toString(), f50Var2.L, null, f50Var2.Q, f50Var2.T, f50Var2.V, f50Var2.U, f50Var2.X, f50Var2);
                                                    break;
                                                } else {
                                                    f50Var2.M = true;
                                                    break;
                                                }
                                            } else {
                                                Vibrator vibrator = (Vibrator) f50Var2.getParentActivity().getSystemService("vibrator");
                                                if (vibrator != null) {
                                                    vibrator.vibrate(200L);
                                                }
                                                org.telegram.messenger.g0.D3(f50Var2.c);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        this.w.setContentDescription(org.telegram.messenger.hd.N0(2131751342, null));
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
                org.telegram.ui.Components.yt ytVar5 = this.c;
                ytVar5.w(0, ytVar5.getText().length());
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout62 = this.s;
        org.telegram.ui.Components.yt ytVar42 = this.c;
        boolean z142 = org.telegram.messenger.hd.a0;
        frameLayout62.addView(ytVar42, c8.ma.d(-1, -2.0f, 16, !z142 ? 5.0f : 96.0f, 0.0f, !z142 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.ek0 ek0Var3 = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var3;
        ek0Var3.r1();
        this.Y = new org.telegram.ui.Components.yy(1, this.b);
        org.telegram.ui.Components.ek0 ek0Var22 = this.b;
        d50 d50Var2 = new d50(this, context);
        this.a = d50Var2;
        ek0Var22.setAdapter(d50Var2);
        this.b.setLayoutManager(this.Y);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(!org.telegram.messenger.hd.a0 ? 1 : i7);
        d61Var.addView(this.b, c8.ma.o(-1, -1));
        this.b.setOnScrollListener(new g3(this, 15));
        this.b.setOnItemClickListener(new b50(this));
        org.telegram.ui.Components.c10 c10Var2 = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
        this.w = c10Var2;
        h6.m.i(c10Var2);
        wcVar.addView(this.w, org.telegram.ui.Components.c10.b());
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a50
            public final /* synthetic */ f50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        f50 f50Var = this.b;
                        f50Var.O.n(f50Var.E != null, new lz(f50Var, 9), new q5(f50Var, 7), 0);
                        f50Var.S.M(0);
                        f50Var.S.P(43);
                        f50Var.f.d();
                        break;
                    default:
                        f50 f50Var2 = this.b;
                        if (!f50Var2.N) {
                            if (f50Var2.c.a.length() != 0) {
                                f50Var2.N = true;
                                org.telegram.messenger.g0.v1(f50Var2.c);
                                f50Var2.c.setEnabled(false);
                                if (!f50Var2.O.g()) {
                                    org.telegram.ui.Components.c10 c10Var22 = f50Var2.w;
                                    if (c10Var22 != null) {
                                        c10Var22.f(true, true);
                                    }
                                    f50Var2.W = f50Var2.getMessagesController().U(f50Var2.c.getText().toString(), f50Var2.L, null, f50Var2.Q, f50Var2.T, f50Var2.V, f50Var2.U, f50Var2.X, f50Var2);
                                    break;
                                } else {
                                    f50Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) f50Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.D3(f50Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.w.setContentDescription(org.telegram.messenger.hd.N0(2131751342, null));
        this.w.c.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    public final String d0(int i7) {
        return getMessagesController().c2((Long) this.L.get(i7)).first_name;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.r) {
            if (this.b == null) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.I8;
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
        if (i7 == org.telegram.messenger.ls.S) {
            this.W = 0;
            this.N = false;
            org.telegram.ui.Components.c10 c10Var = this.w;
            if (c10Var != null) {
                c10Var.f(false, true);
            }
            org.telegram.ui.Components.yt ytVar = this.c;
            if (ytVar != null) {
                ytVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.R) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            e50 e50Var = this.Z;
            if (e50Var != null) {
                e50Var.c(this, longValue);
            } else {
                org.telegram.messenger.ls.f(this.currentAccount).k(org.telegram.messenger.ls.t, new Object[0]);
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

    @Override // org.telegram.ui.Components.w30
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
        this.h.addListener(new c30(i7, this, z10));
        this.h.start();
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.w30
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ri));
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
        org.telegram.ui.Components.yt ytVar = this.c;
        if (ytVar == null || !ytVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        ytVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        f50 f50Var;
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.r);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.R);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.S);
        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(2, true, true);
        this.O = x30Var;
        x30Var.a = this;
        x30Var.b = this;
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
            f50Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            f50Var = this;
            org.telegram.messenger.ur.a0(this.currentAccount).a.c(new org.telegram.ui.Components.q20(f50Var, arrayList2, arrayList, countDownLatch, 17));
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
        f50Var.X = getUserConfig().q0 * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.r);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.R);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.S);
        this.O.d();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        org.telegram.ui.Components.yt ytVar = this.c;
        if (ytVar != null) {
            ytVar.o();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.yt ytVar = this.c;
        if (ytVar != null) {
            ytVar.r();
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
        org.telegram.ui.Components.yt ytVar = this.c;
        if (ytVar != null) {
            ytVar.s();
        }
        d50 d50Var = this.a;
        if (d50Var != null) {
            d50Var.f();
        }
        this.O.k();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.c10 c10Var = this.w;
            if (c10Var != null) {
                c10Var.updateColors();
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
            org.telegram.ui.Components.yt ytVar = this.c;
            if (ytVar == null || ytVar.getEditText() == null) {
                return;
            }
            this.c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.m6.G6));
            this.c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.m6.k6), getThemedColor(org.telegram.ui.ActionBar.m6.l6), getThemedColor(org.telegram.ui.ActionBar.m6.p7));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.tt ttVar = this.c.a;
            ttVar.requestFocus();
            org.telegram.messenger.g0.I3(ttVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.x30 x30Var = this.O;
        if (x30Var != null) {
            x30Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.yt ytVar = this.c;
            if (ytVar != null) {
                ytVar.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.x30 x30Var = this.O;
        if (x30Var != null && (str = x30Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.yt ytVar = this.c;
        if (ytVar != null) {
            String obj = ytVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ void U() {
    }
}
