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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class g70 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.u40 {
    public TLRPC.FileLocation E;
    public TLRPC.InputFile F;
    public TLRPC.InputFile G;
    public TLRPC.VideoSize H;
    public String I;
    public double J;
    public ArrayList K;
    public boolean L;
    public boolean M;
    public org.telegram.ui.Components.v40 N;
    public String O;
    public final int P;
    public final boolean Q;
    public org.telegram.ui.Components.ij0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.qz X;
    public f70 Y;
    public e70 a;
    public org.telegram.ui.Components.wl0 b;
    public org.telegram.ui.Components.ku c;
    public ai.y5 d;
    public ci.r6 e;
    public id f;
    public AnimatorSet h;
    public jd n;
    public final org.telegram.ui.Components.h9 r;
    public FrameLayout s;
    public org.telegram.ui.Components.z10 v;
    public org.telegram.ui.ActionBar.m1 w;
    public Drawable x;
    public TLRPC.FileLocation y;

    public g70(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void U(g70 g70Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(g70Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.u40
    public final void B(float f7) {
        jd jdVar = this.n;
        if (jdVar == null) {
            return;
        }
        jdVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.u40
    public final void L(boolean z10, boolean z11) {
        jd jdVar = this.n;
        if (jdVar == null) {
            return;
        }
        jdVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.u40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    public final String Y(int i10) {
        return getMessagesController().getUser((Long) this.K.get(i10)).first_name;
    }

    public final void Z(boolean z10, boolean z11) {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        int i10 = 0;
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
            id idVar = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(idVar, (Property<id, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<jd, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            id idVar2 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(idVar2, (Property<id, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<jd, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new c70(i10, this, z10));
        this.h.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x02fc  */
    @Override // org.telegram.ui.ActionBar.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        org.telegram.ui.Components.ku kuVar = this.c;
        if (kuVar != null) {
            kuVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NewGroup));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.a7;
        kVar.setBackgroundColor(getThemedColor(i11));
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 27));
        hd hdVar = new hd(2, context, this);
        hdVar.setBackgroundColor(getThemedColor(i11));
        this.fragmentView = hdVar;
        hdVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new bi.d(2));
        this.x = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        ub1 ub1Var = new ub1(this, context, 13);
        ub1Var.setOrientation(1);
        hdVar.addView(ub1Var, w7.y5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(16.0f), getThemedColor(org.telegram.ui.ActionBar.h6.d6)));
        ub1Var.addView(this.s, w7.y5.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        ai.y5 y5Var = new ai.y5(this, context, 9);
        this.d = y5Var;
        int i13 = this.P;
        y5Var.setRoundRadius(AndroidUtilities.dp(i13 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.h9 h9Var = this.r;
        h9Var.n(5L, null, null);
        this.d.setImageDrawable(h9Var);
        this.d.setContentDescription(LocaleController.getString(R.string.ChoosePhoto));
        FrameLayout frameLayout2 = this.s;
        ai.y5 y5Var2 = this.d;
        boolean z10 = LocaleController.isRTL;
        frameLayout2.addView(y5Var2, w7.y5.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ci.r6 r6Var = new ci.r6(this, context, paint, 10);
        this.e = r6Var;
        FrameLayout frameLayout3 = this.s;
        boolean z11 = LocaleController.isRTL;
        frameLayout3.addView(r6Var, w7.y5.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 16.0f, z11 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a70
            public final /* synthetic */ g70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        g70 g70Var = this.b;
                        g70Var.N.o(g70Var.y != null, new c10(g70Var, 8), new r5(g70Var, 7), 0);
                        g70Var.R.M(0);
                        g70Var.R.P(43);
                        g70Var.f.d();
                        break;
                    default:
                        g70 g70Var2 = this.b;
                        if (!g70Var2.M) {
                            if (g70Var2.c.a.length() != 0) {
                                g70Var2.M = true;
                                AndroidUtilities.hideKeyboard(g70Var2.c);
                                g70Var2.c.setEnabled(false);
                                if (!g70Var2.N.h()) {
                                    org.telegram.ui.Components.z10 z10Var = g70Var2.v;
                                    if (z10Var != null) {
                                        z10Var.f(true, true);
                                    }
                                    g70Var2.V = g70Var2.getMessagesController().createChat(g70Var2.c.getText().toString(), g70Var2.K, null, g70Var2.P, g70Var2.S, g70Var2.U, g70Var2.T, g70Var2.W, g70Var2);
                                    break;
                                } else {
                                    g70Var2.L = true;
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
        this.R = new org.telegram.ui.Components.ij0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        id idVar = new id(this, context, 2);
        this.f = idVar;
        idVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.R);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
        FrameLayout frameLayout4 = this.s;
        id idVar2 = this.f;
        boolean z12 = LocaleController.isRTL;
        frameLayout4.addView(idVar2, w7.y5.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 16.0f, z12 ? 15.0f : 0.0f, 16.0f));
        jd jdVar = new jd(this, context, i10);
        this.n = jdVar;
        jdVar.setSize(AndroidUtilities.dp(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        jd jdVar2 = this.n;
        boolean z13 = LocaleController.isRTL;
        frameLayout5.addView(jdVar2, w7.y5.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 16.0f, z13 ? 16.0f : 0.0f, 16.0f));
        Z(false, false);
        org.telegram.ui.Components.ku kuVar2 = new org.telegram.ui.Components.ku(context, hdVar, this, 0, false, null);
        this.c = kuVar2;
        kuVar2.setHint(LocaleController.getString((i13 == 0 || i13 == 4 || i13 == 5) ? R.string.EnterGroupNamePlaceholder : R.string.EnterListName));
        String str = this.O;
        if (str != null) {
            this.c.setText(str);
            org.telegram.ui.Components.ku kuVar3 = this.c;
            kuVar3.setSelection(kuVar3.getText().length());
            this.O = null;
        }
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        int size = this.K.size() + 1;
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
                    org.telegram.ui.Components.ku kuVar4 = this.c;
                    kuVar4.w(0, kuVar4.getText().length());
                }
            } else {
                str2 = LocaleController.formatString("GroupCreateMembersFour", R.string.GroupCreateMembersFour, currentUser.first_name, Y(0), Y(1), Y(2));
            }
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.s;
        org.telegram.ui.Components.ku kuVar5 = this.c;
        boolean z14 = LocaleController.isRTL;
        frameLayout6.addView(kuVar5, w7.y5.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.b = wl0Var;
        wl0Var.p1();
        this.X = new org.telegram.ui.Components.qz(this.b, 1);
        org.telegram.ui.Components.wl0 wl0Var2 = this.b;
        e70 e70Var = new e70(this, context);
        this.a = e70Var;
        wl0Var2.setAdapter(e70Var);
        this.b.setLayoutManager(this.X);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        ub1Var.addView(this.b, w7.y5.n(-1, -1));
        this.b.setOnScrollListener(new i3(this, 14));
        this.b.setOnItemClickListener(new b70(this));
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, this.resourceProvider, false);
        this.v = z10Var;
        n7.z0.k(z10Var);
        hdVar.addView(this.v, org.telegram.ui.Components.z10.b());
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a70
            public final /* synthetic */ g70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g70 g70Var = this.b;
                        g70Var.N.o(g70Var.y != null, new c10(g70Var, 8), new r5(g70Var, 7), 0);
                        g70Var.R.M(0);
                        g70Var.R.P(43);
                        g70Var.f.d();
                        break;
                    default:
                        g70 g70Var2 = this.b;
                        if (!g70Var2.M) {
                            if (g70Var2.c.a.length() != 0) {
                                g70Var2.M = true;
                                AndroidUtilities.hideKeyboard(g70Var2.c);
                                g70Var2.c.setEnabled(false);
                                if (!g70Var2.N.h()) {
                                    org.telegram.ui.Components.z10 z10Var2 = g70Var2.v;
                                    if (z10Var2 != null) {
                                        z10Var2.f(true, true);
                                    }
                                    g70Var2.V = g70Var2.getMessagesController().createChat(g70Var2.c.getText().toString(), g70Var2.K, null, g70Var2.P, g70Var2.S, g70Var2.U, g70Var2.T, g70Var2.W, g70Var2);
                                    break;
                                } else {
                                    g70Var2.L = true;
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
                if (childAt instanceof org.telegram.ui.Cells.g4) {
                    ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidFailCreate) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.z10 z10Var = this.v;
            if (z10Var != null) {
                z10Var.f(false, true);
            }
            org.telegram.ui.Components.ku kuVar = this.c;
            if (kuVar != null) {
                kuVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            f70 f70Var = this.Y;
            if (f70Var != null) {
                f70Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new wn(bundle), true);
            }
            if (this.F == null && this.G == null && this.H == null) {
                return;
            }
            getMessagesController().changeChatAvatar(longValue, null, this.F, this.G, this.H, this.J, this.I, this.y, this.E, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void dismissCurrentDialog() {
        if (this.N.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.N.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ vu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.u40
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        org.telegram.ui.Components.ku kuVar = this.c;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kuVar, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.h6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.h6.r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.N.i(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ku kuVar = this.c;
        if (kuVar == null || !kuVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        kuVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        g70 g70Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(2, true, true);
        this.N = v40Var;
        v40Var.a = this;
        v40Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i10 = 0;
        if (longArray != null) {
            this.K = new ArrayList(longArray.length);
            int i11 = 0;
            while (i11 < longArray.length) {
                i11 = com.google.android.gms.internal.vision.e2.g(longArray[i11], this.K, i11, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < this.K.size(); i12++) {
            Long l4 = (Long) this.K.get(i12);
            if (getMessagesController().getUser(l4) == null) {
                arrayList.add(l4);
            }
        }
        if (arrayList.isEmpty()) {
            g70Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            g70Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new org.telegram.ui.Components.vn0(g70Var, arrayList2, arrayList, countDownLatch, 12));
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
        g70Var.W = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.N.e();
        if (this.V != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.V, true);
        }
        org.telegram.ui.Components.ku kuVar = this.c;
        if (kuVar != null) {
            kuVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ku kuVar = this.c;
        if (kuVar != null) {
            kuVar.r();
        }
        this.N.j();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.N.k(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ku kuVar = this.c;
        if (kuVar != null) {
            kuVar.s();
        }
        e70 e70Var = this.a;
        if (e70Var != null) {
            e70Var.l();
        }
        this.N.l();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.fu fuVar = this.c.a;
            fuVar.requestFocus();
            AndroidUtilities.showKeyboard(fuVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.v40 v40Var = this.N;
        if (v40Var != null) {
            v40Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.ku kuVar = this.c;
            if (kuVar != null) {
                kuVar.setText(string);
            } else {
                this.O = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.v40 v40Var = this.N;
        if (v40Var != null && (str = v40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.ku kuVar = this.c;
        if (kuVar != null) {
            String obj = kuVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ void P() {
    }
}
