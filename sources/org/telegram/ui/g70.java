package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g70 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.w40 {
    public TLRPC.FileLocation B;
    public TLRPC.InputFile C;
    public TLRPC.InputFile D;
    public TLRPC.VideoSize E;
    public String F;
    public double G;
    public ArrayList H;
    public boolean I;
    public boolean J;
    public org.telegram.ui.Components.x40 K;
    public String L;
    public final int M;
    public final boolean N;
    public org.telegram.ui.Components.gj0 O;
    public final boolean P;
    public String Q;
    public final Location R;
    public int S;
    public int T;
    public org.telegram.ui.Components.pz U;
    public f70 V;
    public e70 a;
    public org.telegram.ui.Components.rl0 b;
    public org.telegram.ui.Components.cu c;
    public nh.y3 d;
    public eg.i0 e;
    public md f;
    public AnimatorSet h;
    public nd n;
    public final org.telegram.ui.Components.z8 r;
    public FrameLayout s;
    public org.telegram.ui.Components.a20 v;
    public org.telegram.ui.ActionBar.p1 w;
    public Drawable x;
    public TLRPC.FileLocation y;

    public g70(Bundle bundle) {
        super(bundle);
        this.M = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.Q = bundle.getString("address");
        this.R = (Location) bundle.getParcelable("location");
        this.P = bundle.getBoolean("forImport", false);
        this.L = bundle.getString("title", null);
        this.N = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void U(g70 g70Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(g70Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.w40
    public final void D(float f10) {
        nd ndVar = this.n;
        if (ndVar == null) {
            return;
        }
        ndVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.w40
    public final void K(boolean z4, boolean z10) {
        nd ndVar = this.n;
        if (ndVar == null) {
            return;
        }
        ndVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.w40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ed(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 3));
    }

    public final String Y(int i10) {
        return getMessagesController().getUser((Long) this.H.get(i10)).first_name;
    }

    public final void Z(boolean z4, boolean z10) {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z10) {
            if (z4) {
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
        if (z4) {
            this.n.setVisibility(0);
            AnimatorSet animatorSet2 = this.h;
            md mdVar = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(mdVar, (Property<md, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<nd, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            md mdVar2 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(mdVar2, (Property<md, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<nd, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new org.telegram.ui.Components.m00(22, this, z4));
        this.h.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x02fb  */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        org.telegram.ui.Components.cu cuVar = this.c;
        if (cuVar != null) {
            cuVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NewGroup));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        kVar.setBackgroundColor(getThemedColor(i11));
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 14));
        ld ldVar = new ld(2, context, this);
        ldVar.setBackgroundColor(getThemedColor(i11));
        this.fragmentView = ldVar;
        ldVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new oh.d(2));
        this.x = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        pb1 pb1Var = new pb1(this, context, 14);
        pb1Var.setOrientation(1);
        ldVar.addView(pb1Var, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.d0(AndroidUtilities.dp(16.0f), getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
        pb1Var.addView(this.s, k7.b6.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        nh.y3 y3Var = new nh.y3(this, context, 8);
        this.d = y3Var;
        int i13 = this.M;
        y3Var.setRoundRadius(AndroidUtilities.dp(i13 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.z8 z8Var = this.r;
        z8Var.n(5L, null, null);
        this.d.setImageDrawable(z8Var);
        this.d.setContentDescription(LocaleController.getString(R.string.ChoosePhoto));
        FrameLayout frameLayout2 = this.s;
        nh.y3 y3Var2 = this.d;
        boolean z4 = LocaleController.isRTL;
        frameLayout2.addView(y3Var2, k7.b6.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 16.0f, z4 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        eg.i0 i0Var = new eg.i0(this, context, paint, 9);
        this.e = i0Var;
        FrameLayout frameLayout3 = this.s;
        boolean z10 = LocaleController.isRTL;
        frameLayout3.addView(i0Var, k7.b6.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b70
            public final /* synthetic */ g70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        g70 g70Var = this.b;
                        g70Var.K.o(g70Var.y != null, new d10(g70Var, 8), new x5(g70Var, 7), 0);
                        g70Var.O.K(0);
                        g70Var.O.N(43);
                        g70Var.f.d();
                        break;
                    default:
                        g70 g70Var2 = this.b;
                        if (!g70Var2.J) {
                            if (g70Var2.c.a.length() != 0) {
                                g70Var2.J = true;
                                AndroidUtilities.hideKeyboard(g70Var2.c);
                                g70Var2.c.setEnabled(false);
                                if (!g70Var2.K.h()) {
                                    org.telegram.ui.Components.a20 a20Var = g70Var2.v;
                                    if (a20Var != null) {
                                        a20Var.f(true, true);
                                    }
                                    g70Var2.S = g70Var2.getMessagesController().createChat(g70Var2.c.getText().toString(), g70Var2.H, null, g70Var2.M, g70Var2.P, g70Var2.R, g70Var2.Q, g70Var2.T, g70Var2);
                                    break;
                                } else {
                                    g70Var2.I = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) g70Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(g70Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.O = new org.telegram.ui.Components.gj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        md mdVar = new md(this, context, 2);
        this.f = mdVar;
        mdVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.O);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
        FrameLayout frameLayout4 = this.s;
        md mdVar2 = this.f;
        boolean z11 = LocaleController.isRTL;
        frameLayout4.addView(mdVar2, k7.b6.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 16.0f, z11 ? 15.0f : 0.0f, 16.0f));
        nd ndVar = new nd(this, context, i10);
        this.n = ndVar;
        ndVar.setSize(AndroidUtilities.dp(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        nd ndVar2 = this.n;
        boolean z12 = LocaleController.isRTL;
        frameLayout5.addView(ndVar2, k7.b6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 16.0f, z12 ? 16.0f : 0.0f, 16.0f));
        Z(false, false);
        org.telegram.ui.Components.cu cuVar2 = new org.telegram.ui.Components.cu(context, ldVar, this, 0, false, null);
        this.c = cuVar2;
        cuVar2.setHint(LocaleController.getString((i13 == 0 || i13 == 4 || i13 == 5) ? R.string.EnterGroupNamePlaceholder : R.string.EnterListName));
        String str = this.L;
        if (str != null) {
            this.c.setText(str);
            org.telegram.ui.Components.cu cuVar3 = this.c;
            cuVar3.setSelection(cuVar3.getText().length());
            this.L = null;
        }
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        int size = this.H.size() + 1;
        if (size >= 2 && size <= 5 && TextUtils.isEmpty(this.c.getText())) {
            String str2 = "";
            try {
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (size == 2) {
                str2 = LocaleController.formatString("GroupCreateMembersTwo", R.string.GroupCreateMembersTwo, currentUser.first_name, Y(0));
            } else if (size == 3) {
                str2 = LocaleController.formatString("GroupCreateMembersThree", R.string.GroupCreateMembersThree, currentUser.first_name, Y(0), Y(1));
            } else if (size != 4) {
                if (size == 5) {
                    str2 = LocaleController.formatString("GroupCreateMembersFive", R.string.GroupCreateMembersFive, currentUser.first_name, Y(0), Y(1), Y(2), Y(3));
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.c.setText(str2);
                    org.telegram.ui.Components.cu cuVar4 = this.c;
                    cuVar4.w(0, cuVar4.getText().length());
                }
            } else {
                str2 = LocaleController.formatString("GroupCreateMembersFour", R.string.GroupCreateMembersFour, currentUser.first_name, Y(0), Y(1), Y(2));
            }
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.s;
        org.telegram.ui.Components.cu cuVar5 = this.c;
        boolean z13 = LocaleController.isRTL;
        frameLayout6.addView(cuVar5, k7.b6.d(-1, -2.0f, 16, z13 ? 5.0f : 96.0f, 0.0f, z13 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.b = rl0Var;
        rl0Var.o1();
        this.U = new org.telegram.ui.Components.pz(this.b, 1);
        org.telegram.ui.Components.rl0 rl0Var2 = this.b;
        e70 e70Var = new e70(this, context);
        this.a = e70Var;
        rl0Var2.setAdapter(e70Var);
        this.b.setLayoutManager(this.U);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        pb1Var.addView(this.b, k7.b6.n(-1, -1));
        this.b.setOnScrollListener(new n3(this, 14));
        this.b.setOnItemClickListener(new c70(this));
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.v = a20Var;
        n7.qa.V(a20Var);
        ldVar.addView(this.v, org.telegram.ui.Components.a20.b());
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b70
            public final /* synthetic */ g70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g70 g70Var = this.b;
                        g70Var.K.o(g70Var.y != null, new d10(g70Var, 8), new x5(g70Var, 7), 0);
                        g70Var.O.K(0);
                        g70Var.O.N(43);
                        g70Var.f.d();
                        break;
                    default:
                        g70 g70Var2 = this.b;
                        if (!g70Var2.J) {
                            if (g70Var2.c.a.length() != 0) {
                                g70Var2.J = true;
                                AndroidUtilities.hideKeyboard(g70Var2.c);
                                g70Var2.c.setEnabled(false);
                                if (!g70Var2.K.h()) {
                                    org.telegram.ui.Components.a20 a20Var2 = g70Var2.v;
                                    if (a20Var2 != null) {
                                        a20Var2.f(true, true);
                                    }
                                    g70Var2.S = g70Var2.getMessagesController().createChat(g70Var2.c.getText().toString(), g70Var2.H, null, g70Var2.M, g70Var2.P, g70Var2.R, g70Var2.Q, g70Var2.T, g70Var2);
                                    break;
                                } else {
                                    g70Var2.I = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) g70Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(g70Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.v.setContentDescription(LocaleController.getString(R.string.Done));
        this.v.c.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if (this.b == null) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0) {
                return;
            }
            int childCount = this.b.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.b.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    ((org.telegram.ui.Cells.f4) childAt).f(intValue);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidFailCreate) {
            this.S = 0;
            this.J = false;
            org.telegram.ui.Components.a20 a20Var = this.v;
            if (a20Var != null) {
                a20Var.f(false, true);
            }
            org.telegram.ui.Components.cu cuVar = this.c;
            if (cuVar != null) {
                cuVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            this.S = 0;
            long longValue = ((Long) objArr[0]).longValue();
            f70 f70Var = this.V;
            if (f70Var != null) {
                f70Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new zn(bundle), true);
            }
            if (this.C == null && this.D == null && this.E == null) {
                return;
            }
            getMessagesController().changeChatAvatar(longValue, null, this.C, this.D, this.E, this.G, this.F, this.y, this.B, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void dismissCurrentDialog() {
        if (this.K.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.K.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.w40
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        org.telegram.ui.Components.cu cuVar = this.c;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(cuVar, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 48, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.f4.class}, null, org.telegram.ui.ActionBar.j6.r0, fVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.K.i(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.cu cuVar = this.c;
        if (cuVar == null || !cuVar.e) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        cuVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        g70 g70Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.x40 x40Var = new org.telegram.ui.Components.x40(2, true, true);
        this.K = x40Var;
        x40Var.a = this;
        x40Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i10 = 0;
        if (longArray != null) {
            this.H = new ArrayList(longArray.length);
            int i11 = 0;
            while (i11 < longArray.length) {
                i11 = android.support.v4.media.a.g(longArray[i11], this.H, i11, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < this.H.size(); i12++) {
            Long l10 = (Long) this.H.get(i12);
            if (getMessagesController().getUser(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (arrayList.isEmpty()) {
            g70Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            g70Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new c30(g70Var, arrayList2, arrayList, countDownLatch, 2));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                getMessagesController().putUser((TLRPC.User) obj, true);
            }
        }
        g70Var.T = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.K.e();
        if (this.S != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.S, true);
        }
        org.telegram.ui.Components.cu cuVar = this.c;
        if (cuVar != null) {
            cuVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.cu cuVar = this.c;
        if (cuVar != null) {
            cuVar.r();
        }
        this.K.j();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.K.k(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.cu cuVar = this.c;
        if (cuVar != null) {
            cuVar.s();
        }
        e70 e70Var = this.a;
        if (e70Var != null) {
            e70Var.l();
        }
        this.K.l();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            org.telegram.ui.Components.xt xtVar = this.c.a;
            xtVar.requestFocus();
            AndroidUtilities.showKeyboard(xtVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.x40 x40Var = this.K;
        if (x40Var != null) {
            x40Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.cu cuVar = this.c;
            if (cuVar != null) {
                cuVar.setText(string);
            } else {
                this.L = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.x40 x40Var = this.K;
        if (x40Var != null && (str = x40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.cu cuVar = this.c;
        if (cuVar != null) {
            String obj = cuVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ void P() {
    }
}
