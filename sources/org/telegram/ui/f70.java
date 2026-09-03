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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f70 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.x40 {
    public TLRPC.FileLocation B;
    public TLRPC.InputFile C;
    public TLRPC.InputFile D;
    public TLRPC.VideoSize E;
    public String F;
    public double G;
    public ArrayList H;
    public boolean I;
    public boolean J;
    public org.telegram.ui.Components.y40 K;
    public String L;
    public final int M;
    public final boolean N;
    public org.telegram.ui.Components.hj0 O;
    public final boolean P;
    public String Q;
    public final Location R;
    public int S;
    public int T;
    public org.telegram.ui.Components.rz U;
    public e70 V;
    public d70 a;
    public org.telegram.ui.Components.sl0 b;
    public org.telegram.ui.Components.fu c;
    public oh.a4 d;
    public fg.i0 e;
    public kd f;
    public AnimatorSet h;
    public ld n;
    public final org.telegram.ui.Components.z8 r;
    public FrameLayout s;
    public org.telegram.ui.Components.a20 v;
    public org.telegram.ui.ActionBar.p1 w;
    public Drawable x;
    public TLRPC.FileLocation y;

    public f70(Bundle bundle) {
        super(bundle);
        this.M = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.Q = bundle.getString("address");
        this.R = (Location) bundle.getParcelable("location");
        this.P = bundle.getBoolean("forImport", false);
        this.L = bundle.getString("title", null);
        this.N = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void U(f70 f70Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(f70Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.x40
    public final void D(float f10) {
        ld ldVar = this.n;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.x40
    public final void K(boolean z4, boolean z10) {
        ld ldVar = this.n;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.x40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 3));
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
            kd kdVar = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, (Property<kd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<ld, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            kd kdVar2 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(kdVar2, (Property<kd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<ld, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new org.telegram.ui.Components.x20(20, this, z4));
        this.h.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x02fb  */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        org.telegram.ui.Components.fu fuVar = this.c;
        if (fuVar != null) {
            fuVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NewGroup));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.a7;
        kVar.setBackgroundColor(getThemedColor(i11));
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 14));
        jd jdVar = new jd(2, context, this);
        jdVar.setBackgroundColor(getThemedColor(i11));
        this.fragmentView = jdVar;
        jdVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        this.x = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        ob1 ob1Var = new ob1(this, context, 14);
        ob1Var.setOrientation(1);
        jdVar.addView(ob1Var, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(AndroidUtilities.dp(16.0f), getThemedColor(org.telegram.ui.ActionBar.k6.d6)));
        ob1Var.addView(this.s, k7.c6.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        oh.a4 a4Var = new oh.a4(this, context, 8);
        this.d = a4Var;
        int i13 = this.M;
        a4Var.setRoundRadius(AndroidUtilities.dp(i13 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.z8 z8Var = this.r;
        z8Var.n(5L, null, null);
        this.d.setImageDrawable(z8Var);
        this.d.setContentDescription(LocaleController.getString(R.string.ChoosePhoto));
        FrameLayout frameLayout2 = this.s;
        oh.a4 a4Var2 = this.d;
        boolean z4 = LocaleController.isRTL;
        frameLayout2.addView(a4Var2, k7.c6.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 16.0f, z4 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        fg.i0 i0Var = new fg.i0(this, context, paint, 9);
        this.e = i0Var;
        FrameLayout frameLayout3 = this.s;
        boolean z10 = LocaleController.isRTL;
        frameLayout3.addView(i0Var, k7.c6.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a70
            public final /* synthetic */ f70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        f70 f70Var = this.b;
                        f70Var.K.o(f70Var.y != null, new c10(f70Var, 8), new v5(f70Var, 7), 0);
                        f70Var.O.K(0);
                        f70Var.O.N(43);
                        f70Var.f.d();
                        break;
                    default:
                        f70 f70Var2 = this.b;
                        if (!f70Var2.J) {
                            if (f70Var2.c.a.length() != 0) {
                                f70Var2.J = true;
                                AndroidUtilities.hideKeyboard(f70Var2.c);
                                f70Var2.c.setEnabled(false);
                                if (!f70Var2.K.h()) {
                                    org.telegram.ui.Components.a20 a20Var = f70Var2.v;
                                    if (a20Var != null) {
                                        a20Var.f(true, true);
                                    }
                                    f70Var2.S = f70Var2.getMessagesController().createChat(f70Var2.c.getText().toString(), f70Var2.H, null, f70Var2.M, f70Var2.P, f70Var2.R, f70Var2.Q, f70Var2.T, f70Var2);
                                    break;
                                } else {
                                    f70Var2.I = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) f70Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(f70Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.O = new org.telegram.ui.Components.hj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        kd kdVar = new kd(this, context, 2);
        this.f = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.O);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
        FrameLayout frameLayout4 = this.s;
        kd kdVar2 = this.f;
        boolean z11 = LocaleController.isRTL;
        frameLayout4.addView(kdVar2, k7.c6.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 16.0f, z11 ? 15.0f : 0.0f, 16.0f));
        ld ldVar = new ld(this, context, i10);
        this.n = ldVar;
        ldVar.setSize(AndroidUtilities.dp(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        ld ldVar2 = this.n;
        boolean z12 = LocaleController.isRTL;
        frameLayout5.addView(ldVar2, k7.c6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 16.0f, z12 ? 16.0f : 0.0f, 16.0f));
        Z(false, false);
        org.telegram.ui.Components.fu fuVar2 = new org.telegram.ui.Components.fu(context, jdVar, this, 0, false, null);
        this.c = fuVar2;
        fuVar2.setHint(LocaleController.getString((i13 == 0 || i13 == 4 || i13 == 5) ? R.string.EnterGroupNamePlaceholder : R.string.EnterListName));
        String str = this.L;
        if (str != null) {
            this.c.setText(str);
            org.telegram.ui.Components.fu fuVar3 = this.c;
            fuVar3.setSelection(fuVar3.getText().length());
            this.L = null;
        }
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        int size = this.H.size() + 1;
        if (size >= 2 && size <= 5 && TextUtils.isEmpty(this.c.getText())) {
            String str2 = "";
            try {
            } catch (Exception e6) {
                FileLog.e(e6);
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
                    org.telegram.ui.Components.fu fuVar4 = this.c;
                    fuVar4.w(0, fuVar4.getText().length());
                }
            } else {
                str2 = LocaleController.formatString("GroupCreateMembersFour", R.string.GroupCreateMembersFour, currentUser.first_name, Y(0), Y(1), Y(2));
            }
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.s;
        org.telegram.ui.Components.fu fuVar5 = this.c;
        boolean z13 = LocaleController.isRTL;
        frameLayout6.addView(fuVar5, k7.c6.d(-1, -2.0f, 16, z13 ? 5.0f : 96.0f, 0.0f, z13 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.b = sl0Var;
        sl0Var.o1();
        this.U = new org.telegram.ui.Components.rz(this.b, 1);
        org.telegram.ui.Components.sl0 sl0Var2 = this.b;
        d70 d70Var = new d70(this, context);
        this.a = d70Var;
        sl0Var2.setAdapter(d70Var);
        this.b.setLayoutManager(this.U);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        ob1Var.addView(this.b, k7.c6.n(-1, -1));
        this.b.setOnScrollListener(new l3(this, 14));
        this.b.setOnItemClickListener(new b70(this));
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.v = a20Var;
        n7.qa.M0(a20Var);
        jdVar.addView(this.v, org.telegram.ui.Components.a20.b());
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a70
            public final /* synthetic */ f70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        f70 f70Var = this.b;
                        f70Var.K.o(f70Var.y != null, new c10(f70Var, 8), new v5(f70Var, 7), 0);
                        f70Var.O.K(0);
                        f70Var.O.N(43);
                        f70Var.f.d();
                        break;
                    default:
                        f70 f70Var2 = this.b;
                        if (!f70Var2.J) {
                            if (f70Var2.c.a.length() != 0) {
                                f70Var2.J = true;
                                AndroidUtilities.hideKeyboard(f70Var2.c);
                                f70Var2.c.setEnabled(false);
                                if (!f70Var2.K.h()) {
                                    org.telegram.ui.Components.a20 a20Var2 = f70Var2.v;
                                    if (a20Var2 != null) {
                                        a20Var2.f(true, true);
                                    }
                                    f70Var2.S = f70Var2.getMessagesController().createChat(f70Var2.c.getText().toString(), f70Var2.H, null, f70Var2.M, f70Var2.P, f70Var2.R, f70Var2.Q, f70Var2.T, f70Var2);
                                    break;
                                } else {
                                    f70Var2.I = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) f70Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(f70Var2.c);
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
                if (childAt instanceof org.telegram.ui.Cells.g4) {
                    ((org.telegram.ui.Cells.g4) childAt).f(intValue);
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
            org.telegram.ui.Components.fu fuVar = this.c;
            if (fuVar != null) {
                fuVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            this.S = 0;
            long longValue = ((Long) objArr[0]).longValue();
            e70 e70Var = this.V;
            if (e70Var != null) {
                e70Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new xn(bundle), true);
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

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.x40
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        org.telegram.ui.Components.fu fuVar = this.c;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fuVar, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.k6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.k6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.k6.r0, fVar, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
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
        org.telegram.ui.Components.fu fuVar = this.c;
        if (fuVar == null || !fuVar.e) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        fuVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        f70 f70Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(2, true, true);
        this.K = y40Var;
        y40Var.a = this;
        y40Var.b = this;
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
            f70Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            f70Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new b30(f70Var, arrayList2, arrayList, countDownLatch, 2));
            try {
                countDownLatch.await();
            } catch (Exception e6) {
                FileLog.e(e6);
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
        f70Var.T = getUserConfig().getGlobalTTl() * 60;
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
        org.telegram.ui.Components.fu fuVar = this.c;
        if (fuVar != null) {
            fuVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.fu fuVar = this.c;
        if (fuVar != null) {
            fuVar.r();
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
        org.telegram.ui.Components.fu fuVar = this.c;
        if (fuVar != null) {
            fuVar.s();
        }
        d70 d70Var = this.a;
        if (d70Var != null) {
            d70Var.l();
        }
        this.K.l();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            org.telegram.ui.Components.au auVar = this.c.a;
            auVar.requestFocus();
            AndroidUtilities.showKeyboard(auVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.y40 y40Var = this.K;
        if (y40Var != null) {
            y40Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.fu fuVar = this.c;
            if (fuVar != null) {
                fuVar.setText(string);
            } else {
                this.L = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.y40 y40Var = this.K;
        if (y40Var != null && (str = y40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.fu fuVar = this.c;
        if (fuVar != null) {
            String obj = fuVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ void P() {
    }
}
