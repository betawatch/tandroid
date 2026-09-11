package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ca0 extends org.telegram.ui.ActionBar.n2 implements qu0, ng.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.g2 E;
    public q6 F;
    public org.telegram.ui.ActionBar.v0 G;
    public org.telegram.ui.ActionBar.v0 H;
    public SparseArray I;
    public org.telegram.ui.ActionBar.f1 J;
    public org.telegram.ui.ActionBar.f1 K;
    public boolean L;
    public boolean M;
    public int N;
    public org.telegram.ui.ActionBar.f1 O;
    public org.telegram.ui.ActionBar.f1 P;
    public org.telegram.ui.ActionBar.f1 Q;
    public ba0 R;
    public FrameLayout S;
    public di.d T;
    public di.y0 U;
    public z90 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int a;
    public final boolean[] a0;
    public pu0 b;
    public final ValueAnimator[] b0;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public FrameLayout s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.j5[] w;
    public final q6[] x;
    public x90 y;

    public ca0(Bundle bundle, pu0 pu0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.w = new org.telegram.ui.ActionBar.j5[2];
        this.x = new q6[2];
        this.L = true;
        this.M = true;
        this.N = -12;
        this.Y = new boolean[2];
        this.Z = new float[2];
        this.a0 = new boolean[]{true, true};
        this.b0 = new ValueAnimator[2];
        this.b = pu0Var;
    }

    @Override // ng.b
    public final List A() {
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = qg.k1.m;
        return Arrays.asList(new ng.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new wp(this, 26)));
    }

    @Override // org.telegram.ui.Components.qu0
    public final void M() {
        pu0 pu0Var;
        z90 z90Var = this.V;
        if (z90Var != null && (pu0Var = this.b) != null) {
            z90Var.setNewMediaCounts(pu0Var.c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.c = chatFull;
    }

    public final void Y(int i10, boolean z10, boolean z11) {
        int i11 = this.a;
        if (i11 == 3) {
            return;
        }
        if (i10 == 1 && i11 == 2) {
            return;
        }
        boolean[] zArr = this.Y;
        boolean z12 = zArr[i10];
        boolean[] zArr2 = this.a0;
        if (z12 != z10 || zArr2[i10]) {
            boolean z13 = !zArr2[i10] && z11;
            zArr2[i10] = false;
            zArr[i10] = z10;
            ValueAnimator[] valueAnimatorArr = this.b0;
            ValueAnimator valueAnimator = valueAnimatorArr[i10];
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimatorArr[i10] = null;
            }
            float[] fArr = this.Z;
            q6[] q6VarArr = this.x;
            if (!z13) {
                fArr[i10] = z10 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.j5[] j5VarArr = this.w;
                j5VarArr[i10].setScaleX(z10 ? 1.0f : 1.111f);
                j5VarArr[i10].setScaleY(z10 ? 1.0f : 1.111f);
                j5VarArr[i10].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                q6VarArr[i10].setAlpha(z10 ? 1.0f : 0.0f);
                q6VarArr[i10].setVisibility(z10 ? 0 : 8);
                return;
            }
            q6VarArr[i10].setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i10], z10 ? 1.0f : 0.0f);
            valueAnimatorArr[i10] = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, i10, 4));
            valueAnimatorArr[i10].addListener(new aa0(this, i10, z10, 0));
            valueAnimatorArr[i10].setDuration(320L);
            valueAnimatorArr[i10].setInterpolator(pr.h);
            valueAnimatorArr[i10].start();
        }
    }

    public final void Z() {
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.w;
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[1];
        if (j5Var2 != null) {
            j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        boolean z10;
        qt0 qt0Var;
        z90 z90Var = this.V;
        if (z90Var != null) {
            q6[] q6VarArr = this.x;
            if (q6VarArr[0] == null) {
                return;
            }
            int closestTab = z90Var.getClosestTab();
            int i10 = this.a;
            if (i10 != 3 || closestTab == 8) {
                int[] iArr = this.b.c;
                boolean z11 = LocaleController.isRTL;
                boolean z12 = !z11;
                int i11 = (i10 == 1 && closestTab != 8) ? 1 : 0;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        Y(i11, true, true);
                        q6VarArr[i11].c(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]), z12, true);
                        return;
                    }
                    if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                Y(i11, true, true);
                                if (this.V.getPhotosVideosTypeFilter() == 1) {
                                    q6VarArr[i11].c(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]), z12, true);
                                    return;
                                } else if (this.V.getPhotosVideosTypeFilter() == 2) {
                                    q6VarArr[i11].c(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]), z12, true);
                                    return;
                                } else {
                                    q6VarArr[i11].c(LocaleController.formatPluralString("Media", iArr[0], new Object[0]), z12, true);
                                    return;
                                }
                            }
                            if (closestTab == 1) {
                                Y(i11, true, true);
                                q6VarArr[i11].c(LocaleController.formatPluralString("Files", iArr[1], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 2) {
                                Y(i11, true, true);
                                q6VarArr[i11].c(LocaleController.formatPluralString("Voice", iArr[2], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 3) {
                                Y(i11, true, true);
                                q6VarArr[i11].c(LocaleController.formatPluralString("Links", iArr[3], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 4) {
                                Y(i11, true, true);
                                q6VarArr[i11].c(LocaleController.formatPluralString("MusicFiles", iArr[4], new Object[0]), z12, true);
                                return;
                            } else if (closestTab == 5) {
                                Y(i11, true, true);
                                q6VarArr[i11].c(LocaleController.formatPluralString("GIFs", iArr[5], new Object[0]), z12, true);
                                return;
                            } else {
                                if (closestTab == 10) {
                                    Y(i11, true, true);
                                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.e);
                                    q6VarArr[i11].c(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]), z12, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.f1 f1Var = this.Q;
                if (f1Var != null) {
                    f1Var.setEnabled(this.V.E());
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.Q;
                    f1Var2.setAlpha(f1Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.f1 f1Var3 = this.P;
                if (f1Var3 != null) {
                    z90 z90Var2 = this.V;
                    qt0[] qt0VarArr = z90Var2.k0;
                    if (qt0VarArr != null && (qt0Var = qt0VarArr[0]) != null) {
                        boolean p02 = xu0.p0(qt0Var.F);
                        int i12 = z90Var2.m1[p02 ? 1 : 0];
                        if (i12 != z90Var2.X(p02 ? 1 : 0, i12, true)) {
                            z10 = true;
                            f1Var3.setEnabled(z10);
                            org.telegram.ui.ActionBar.f1 f1Var4 = this.P;
                            f1Var4.setAlpha(!f1Var4.isEnabled() ? 1.0f : 0.5f);
                        }
                    }
                    z10 = false;
                    f1Var3.setEnabled(z10);
                    org.telegram.ui.ActionBar.f1 f1Var42 = this.P;
                    f1Var42.setAlpha(!f1Var42.isEnabled() ? 1.0f : 0.5f);
                }
                int c02 = this.V.c0(8);
                if (c02 <= 0) {
                    Y(0, false, true);
                } else if (this.a != 3) {
                    Y(0, true, true);
                    q6VarArr[0].c(LocaleController.formatPluralString("ProfileMyStoriesCount", c02, new Object[0]), z12, true);
                } else if (TextUtils.isEmpty(q6VarArr[0].getText())) {
                    Y(0, true, true);
                    q6VarArr[0].c(LocaleController.formatPluralStringSpaced("FoundStories", c02), z12, true);
                }
                if (this.a == 1) {
                    int c03 = this.V.c0(9);
                    if (c03 > 0) {
                        Y(1, true, true);
                        q6VarArr[1].c(LocaleController.formatPluralString("ProfileStoriesArchiveCount", c03, new Object[0]), z12, true);
                    } else {
                        Y(1, false, true);
                    }
                }
                if (this.G != null) {
                    z90 z90Var3 = this.V;
                    boolean z13 = z90Var3.c0(z90Var3.getClosestTab()) <= 0;
                    if (!z13) {
                        this.G.setVisibility(0);
                    }
                    this.G.animate().alpha(z13 ? 0.0f : 1.0f).withEndAction(new ah.u(27, this, z13)).setDuration(220L).setInterpolator(pr.h).start();
                }
                di.d dVar = this.T;
                if (dVar != null) {
                    boolean z14 = !z11 && this.X == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.I;
                        dVar.g(LocaleController.formatPluralString("ArchiveStories", sparseArray == null ? 0 : sparseArray.size(), new Object[0]), z14, true);
                    } else {
                        dVar.g(LocaleController.getString(R.string.SaveToProfile), z14, true);
                    }
                    this.X = closestTab;
                }
                if (this.O != null) {
                    boolean z15 = this.V.c0(closestTab) > 0;
                    this.O.setEnabled(z15);
                    this.O.setAlpha(z15 ? 1.0f : 0.5f);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        if (this.V.x0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x066f  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        q6[] q6VarArr;
        org.telegram.ui.ActionBar.j5[] j5VarArr;
        int i10;
        TLRPC.User user;
        TLRPC.User user2;
        i9 i9Var;
        org.telegram.ui.ActionBar.j5 j5Var;
        z90 z90Var;
        org.telegram.ui.ActionBar.v0 v0Var;
        int i11;
        ?? r10;
        int i12;
        i9 i9Var2;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.E = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.E.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new v90(this));
        FrameLayout frameLayout = new FrameLayout(context);
        w90 w90Var = new w90(this, context, frameLayout, 0);
        w90Var.N = true;
        this.fragmentView = w90Var;
        w90Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i13 = this.a;
        if (i13 == 1 || i13 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.actionBar.addView(frameLayout2, w7.x5.e(56, 56, 85));
            int i14 = org.telegram.ui.ActionBar.j6.z8;
            int themedColor = getThemedColor(i14);
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context, n10, themedColor, getThemedColor(i15));
            this.H = v0Var2;
            v0Var2.setIcon(R.drawable.msg_delete);
            this.H.setVisibility(8);
            this.H.setAlpha(0.0f);
            this.H.setOnClickListener(new x70(n10, 2));
            frameLayout2.addView(this.H);
            org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context, n10, getThemedColor(i14), getThemedColor(i15));
            this.G = v0Var3;
            v0Var3.setIcon(R.drawable.ic_ab_other);
            final int i16 = 0;
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u90
                public final /* synthetic */ ca0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bi.l8 l8Var;
                    bi.l8 l8Var2;
                    bi.l8 l8Var3;
                    bi.l8 l8Var4;
                    int i17;
                    int i18 = i16;
                    ca0 ca0Var = this.b;
                    switch (i18) {
                        case 0:
                            ca0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = ca0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                ca0Var.Q.setEnabled(true);
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(booleanValue);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = ca0Var.V.x1(null, null);
                            if (x12 != null) {
                                ca0Var.Q.setEnabled(x12.booleanValue());
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(true);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = ca0Var.L;
                            if (z10 && !ca0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = ca0Var.J;
                                int i19 = -ca0Var.N;
                                ca0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(f1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = ca0Var.J;
                                boolean z11 = !z10;
                                ca0Var.L = z11;
                                f1Var2.setChecked(z11);
                                z90 z90Var2 = ca0Var.V;
                                boolean z12 = ca0Var.L;
                                boolean z13 = ca0Var.M;
                                ft0 ft0Var = z90Var2.c0;
                                if (ft0Var != null && (l8Var2 = ft0Var.s) != null) {
                                    l8Var2.n = z12;
                                    l8Var2.o = z13;
                                    l8Var2.d(true);
                                }
                                kr0 kr0Var = z90Var2.e0;
                                if (kr0Var != null && (l8Var = kr0Var.s) != null) {
                                    l8Var.n = z12;
                                    l8Var.o = z13;
                                    l8Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = ca0Var.M;
                            if (z14 && !ca0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = ca0Var.K;
                                int i20 = -ca0Var.N;
                                ca0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = ca0Var.K;
                                boolean z15 = !z14;
                                ca0Var.M = z15;
                                f1Var4.setChecked(z15);
                                z90 z90Var3 = ca0Var.V;
                                boolean z16 = ca0Var.L;
                                boolean z17 = ca0Var.M;
                                ft0 ft0Var2 = z90Var3.c0;
                                if (ft0Var2 != null && (l8Var4 = ft0Var2.s) != null) {
                                    l8Var4.n = z16;
                                    l8Var4.o = z17;
                                    l8Var4.d(true);
                                }
                                kr0 kr0Var2 = z90Var3.e0;
                                if (kr0Var2 != null && (l8Var3 = kr0Var2.s) != null) {
                                    l8Var3.n = z16;
                                    l8Var3.o = z17;
                                    l8Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            ca0 ca0Var2 = this.b;
                            di.y0 y0Var = ca0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                ca0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = ca0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (ca0Var2.I != null) {
                                i17 = 0;
                                for (int i21 = 0; i21 < ca0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ca0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i17++;
                                    }
                                }
                            } else {
                                i17 = 0;
                            }
                            ca0Var2.V.L(false);
                            if (z18) {
                                ca0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                ca0Var2.getMessagesController().getStoriesController().n0(ca0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ca0Var2.U = new di.y0(ca0Var2, arrayList, z18, 19);
                                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(ca0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(ca0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i17, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), n5Var).j() : yc.a0(ca0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i17, new Object[0]), LocaleController.getString("Undo"), 5000, false, n5Var).j()).v = new zu(21, ca0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.G.setVisibility(8);
            this.G.setAlpha(0.0f);
            frameLayout2.addView(this.G);
            org.telegram.ui.ActionBar.f1 e7 = this.G.e(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.P = e7;
            final int i17 = 1;
            e7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u90
                public final /* synthetic */ ca0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bi.l8 l8Var;
                    bi.l8 l8Var2;
                    bi.l8 l8Var3;
                    bi.l8 l8Var4;
                    int i172;
                    int i18 = i17;
                    ca0 ca0Var = this.b;
                    switch (i18) {
                        case 0:
                            ca0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = ca0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                ca0Var.Q.setEnabled(true);
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(booleanValue);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = ca0Var.V.x1(null, null);
                            if (x12 != null) {
                                ca0Var.Q.setEnabled(x12.booleanValue());
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(true);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = ca0Var.L;
                            if (z10 && !ca0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = ca0Var.J;
                                int i19 = -ca0Var.N;
                                ca0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(f1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = ca0Var.J;
                                boolean z11 = !z10;
                                ca0Var.L = z11;
                                f1Var2.setChecked(z11);
                                z90 z90Var2 = ca0Var.V;
                                boolean z12 = ca0Var.L;
                                boolean z13 = ca0Var.M;
                                ft0 ft0Var = z90Var2.c0;
                                if (ft0Var != null && (l8Var2 = ft0Var.s) != null) {
                                    l8Var2.n = z12;
                                    l8Var2.o = z13;
                                    l8Var2.d(true);
                                }
                                kr0 kr0Var = z90Var2.e0;
                                if (kr0Var != null && (l8Var = kr0Var.s) != null) {
                                    l8Var.n = z12;
                                    l8Var.o = z13;
                                    l8Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = ca0Var.M;
                            if (z14 && !ca0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = ca0Var.K;
                                int i20 = -ca0Var.N;
                                ca0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = ca0Var.K;
                                boolean z15 = !z14;
                                ca0Var.M = z15;
                                f1Var4.setChecked(z15);
                                z90 z90Var3 = ca0Var.V;
                                boolean z16 = ca0Var.L;
                                boolean z17 = ca0Var.M;
                                ft0 ft0Var2 = z90Var3.c0;
                                if (ft0Var2 != null && (l8Var4 = ft0Var2.s) != null) {
                                    l8Var4.n = z16;
                                    l8Var4.o = z17;
                                    l8Var4.d(true);
                                }
                                kr0 kr0Var2 = z90Var3.e0;
                                if (kr0Var2 != null && (l8Var3 = kr0Var2.s) != null) {
                                    l8Var3.n = z16;
                                    l8Var3.o = z17;
                                    l8Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            ca0 ca0Var2 = this.b;
                            di.y0 y0Var = ca0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                ca0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = ca0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (ca0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < ca0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ca0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            ca0Var2.V.L(false);
                            if (z18) {
                                ca0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                ca0Var2.getMessagesController().getStoriesController().n0(ca0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ca0Var2.U = new di.y0(ca0Var2, arrayList, z18, 19);
                                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(ca0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(ca0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), n5Var).j() : yc.a0(ca0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, n5Var).j()).v = new zu(21, ca0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.f1 e10 = this.G.e(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.Q = e10;
            final int i18 = 2;
            e10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u90
                public final /* synthetic */ ca0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bi.l8 l8Var;
                    bi.l8 l8Var2;
                    bi.l8 l8Var3;
                    bi.l8 l8Var4;
                    int i172;
                    int i182 = i18;
                    ca0 ca0Var = this.b;
                    switch (i182) {
                        case 0:
                            ca0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = ca0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                ca0Var.Q.setEnabled(true);
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(booleanValue);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = ca0Var.V.x1(null, null);
                            if (x12 != null) {
                                ca0Var.Q.setEnabled(x12.booleanValue());
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(true);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = ca0Var.L;
                            if (z10 && !ca0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = ca0Var.J;
                                int i19 = -ca0Var.N;
                                ca0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(f1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = ca0Var.J;
                                boolean z11 = !z10;
                                ca0Var.L = z11;
                                f1Var2.setChecked(z11);
                                z90 z90Var2 = ca0Var.V;
                                boolean z12 = ca0Var.L;
                                boolean z13 = ca0Var.M;
                                ft0 ft0Var = z90Var2.c0;
                                if (ft0Var != null && (l8Var2 = ft0Var.s) != null) {
                                    l8Var2.n = z12;
                                    l8Var2.o = z13;
                                    l8Var2.d(true);
                                }
                                kr0 kr0Var = z90Var2.e0;
                                if (kr0Var != null && (l8Var = kr0Var.s) != null) {
                                    l8Var.n = z12;
                                    l8Var.o = z13;
                                    l8Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = ca0Var.M;
                            if (z14 && !ca0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = ca0Var.K;
                                int i20 = -ca0Var.N;
                                ca0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = ca0Var.K;
                                boolean z15 = !z14;
                                ca0Var.M = z15;
                                f1Var4.setChecked(z15);
                                z90 z90Var3 = ca0Var.V;
                                boolean z16 = ca0Var.L;
                                boolean z17 = ca0Var.M;
                                ft0 ft0Var2 = z90Var3.c0;
                                if (ft0Var2 != null && (l8Var4 = ft0Var2.s) != null) {
                                    l8Var4.n = z16;
                                    l8Var4.o = z17;
                                    l8Var4.d(true);
                                }
                                kr0 kr0Var2 = z90Var3.e0;
                                if (kr0Var2 != null && (l8Var3 = kr0Var2.s) != null) {
                                    l8Var3.n = z16;
                                    l8Var3.o = z17;
                                    l8Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            ca0 ca0Var2 = this.b;
                            di.y0 y0Var = ca0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                ca0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = ca0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (ca0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < ca0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ca0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            ca0Var2.V.L(false);
                            if (z18) {
                                ca0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                ca0Var2.getMessagesController().getStoriesController().n0(ca0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ca0Var2.U = new di.y0(ca0Var2, arrayList, z18, 19);
                                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(ca0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(ca0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), n5Var).j() : yc.a0(ca0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, n5Var).j()).v = new zu(21, ca0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.f1 e11 = this.G.e(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.O = e11;
            e11.setEnabled(false);
            this.O.setAlpha(0.5f);
            this.G.a(-1);
            org.telegram.ui.ActionBar.v0 v0Var4 = this.G;
            org.telegram.ui.ActionBar.f1 d = v0Var4.d(6, 0, null, LocaleController.getString(R.string.MediaShowPhotos), true, true, v0Var4.m0);
            this.J = d;
            d.setChecked(this.L);
            final int i19 = 3;
            this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u90
                public final /* synthetic */ ca0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bi.l8 l8Var;
                    bi.l8 l8Var2;
                    bi.l8 l8Var3;
                    bi.l8 l8Var4;
                    int i172;
                    int i182 = i19;
                    ca0 ca0Var = this.b;
                    switch (i182) {
                        case 0:
                            ca0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = ca0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                ca0Var.Q.setEnabled(true);
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(booleanValue);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = ca0Var.V.x1(null, null);
                            if (x12 != null) {
                                ca0Var.Q.setEnabled(x12.booleanValue());
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(true);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = ca0Var.L;
                            if (z10 && !ca0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = ca0Var.J;
                                int i192 = -ca0Var.N;
                                ca0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(f1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = ca0Var.J;
                                boolean z11 = !z10;
                                ca0Var.L = z11;
                                f1Var2.setChecked(z11);
                                z90 z90Var2 = ca0Var.V;
                                boolean z12 = ca0Var.L;
                                boolean z13 = ca0Var.M;
                                ft0 ft0Var = z90Var2.c0;
                                if (ft0Var != null && (l8Var2 = ft0Var.s) != null) {
                                    l8Var2.n = z12;
                                    l8Var2.o = z13;
                                    l8Var2.d(true);
                                }
                                kr0 kr0Var = z90Var2.e0;
                                if (kr0Var != null && (l8Var = kr0Var.s) != null) {
                                    l8Var.n = z12;
                                    l8Var.o = z13;
                                    l8Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = ca0Var.M;
                            if (z14 && !ca0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = ca0Var.K;
                                int i20 = -ca0Var.N;
                                ca0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = ca0Var.K;
                                boolean z15 = !z14;
                                ca0Var.M = z15;
                                f1Var4.setChecked(z15);
                                z90 z90Var3 = ca0Var.V;
                                boolean z16 = ca0Var.L;
                                boolean z17 = ca0Var.M;
                                ft0 ft0Var2 = z90Var3.c0;
                                if (ft0Var2 != null && (l8Var4 = ft0Var2.s) != null) {
                                    l8Var4.n = z16;
                                    l8Var4.o = z17;
                                    l8Var4.d(true);
                                }
                                kr0 kr0Var2 = z90Var3.e0;
                                if (kr0Var2 != null && (l8Var3 = kr0Var2.s) != null) {
                                    l8Var3.n = z16;
                                    l8Var3.o = z17;
                                    l8Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            ca0 ca0Var2 = this.b;
                            di.y0 y0Var = ca0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                ca0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = ca0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (ca0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < ca0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ca0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            ca0Var2.V.L(false);
                            if (z18) {
                                ca0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                ca0Var2.getMessagesController().getStoriesController().n0(ca0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ca0Var2.U = new di.y0(ca0Var2, arrayList, z18, 19);
                                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(ca0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(ca0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), n5Var).j() : yc.a0(ca0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, n5Var).j()).v = new zu(21, ca0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.v0 v0Var5 = this.G;
            org.telegram.ui.ActionBar.f1 d10 = v0Var5.d(7, 0, null, LocaleController.getString(R.string.MediaShowVideos), true, true, v0Var5.m0);
            this.K = d10;
            d10.setChecked(this.M);
            final int i20 = 4;
            this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u90
                public final /* synthetic */ ca0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bi.l8 l8Var;
                    bi.l8 l8Var2;
                    bi.l8 l8Var3;
                    bi.l8 l8Var4;
                    int i172;
                    int i182 = i20;
                    ca0 ca0Var = this.b;
                    switch (i182) {
                        case 0:
                            ca0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = ca0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                ca0Var.Q.setEnabled(true);
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(booleanValue);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = ca0Var.V.x1(null, null);
                            if (x12 != null) {
                                ca0Var.Q.setEnabled(x12.booleanValue());
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(true);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = ca0Var.L;
                            if (z10 && !ca0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = ca0Var.J;
                                int i192 = -ca0Var.N;
                                ca0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(f1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = ca0Var.J;
                                boolean z11 = !z10;
                                ca0Var.L = z11;
                                f1Var2.setChecked(z11);
                                z90 z90Var2 = ca0Var.V;
                                boolean z12 = ca0Var.L;
                                boolean z13 = ca0Var.M;
                                ft0 ft0Var = z90Var2.c0;
                                if (ft0Var != null && (l8Var2 = ft0Var.s) != null) {
                                    l8Var2.n = z12;
                                    l8Var2.o = z13;
                                    l8Var2.d(true);
                                }
                                kr0 kr0Var = z90Var2.e0;
                                if (kr0Var != null && (l8Var = kr0Var.s) != null) {
                                    l8Var.n = z12;
                                    l8Var.o = z13;
                                    l8Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = ca0Var.M;
                            if (z14 && !ca0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = ca0Var.K;
                                int i202 = -ca0Var.N;
                                ca0Var.N = i202;
                                AndroidUtilities.shakeViewSpring(f1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = ca0Var.K;
                                boolean z15 = !z14;
                                ca0Var.M = z15;
                                f1Var4.setChecked(z15);
                                z90 z90Var3 = ca0Var.V;
                                boolean z16 = ca0Var.L;
                                boolean z17 = ca0Var.M;
                                ft0 ft0Var2 = z90Var3.c0;
                                if (ft0Var2 != null && (l8Var4 = ft0Var2.s) != null) {
                                    l8Var4.n = z16;
                                    l8Var4.o = z17;
                                    l8Var4.d(true);
                                }
                                kr0 kr0Var2 = z90Var3.e0;
                                if (kr0Var2 != null && (l8Var3 = kr0Var2.s) != null) {
                                    l8Var3.n = z16;
                                    l8Var3.o = z17;
                                    l8Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            ca0 ca0Var2 = this.b;
                            di.y0 y0Var = ca0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                ca0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = ca0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (ca0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < ca0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ca0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            ca0Var2.V.L(false);
                            if (z18) {
                                ca0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                ca0Var2.getMessagesController().getStoriesController().n0(ca0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ca0Var2.U = new di.y0(ca0Var2, arrayList, z18, 19);
                                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(ca0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(ca0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), n5Var).j() : yc.a0(ca0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, n5Var).j()).v = new zu(21, ca0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        boolean z10 = this.a == 0;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        int i21 = 119;
        frameLayout.addView(frameLayout3, w7.x5.e(-1, -1, 119));
        int i22 = 0;
        while (true) {
            int i23 = this.a == 1 ? 2 : 1;
            q6VarArr = this.x;
            j5VarArr = this.w;
            if (i22 >= i23) {
                break;
            }
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout[] frameLayoutArr = this.v;
            frameLayoutArr[i22] = frameLayout4;
            this.s.addView(frameLayout4, w7.x5.e(-1, -1, i21));
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
            j5VarArr[i22] = j5Var2;
            j5Var2.setPivotX(0.0f);
            j5VarArr[i22].setPivotY(AndroidUtilities.dp(9.0f));
            j5VarArr[i22].setTextSize(18);
            j5VarArr[i22].setGravity(3);
            j5VarArr[i22].setTypeface(AndroidUtilities.bold());
            j5VarArr[i22].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            j5VarArr[i22].setScrollNonFitText(true);
            j5VarArr[i22].setImportantForAccessibility(2);
            frameLayoutArr[i22].addView(j5VarArr[i22], w7.x5.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            q6 q6Var = new q6(context, true, true, true);
            q6VarArr[i22] = q6Var;
            q6Var.b(0.4f, 320L, pr.h);
            q6VarArr[i22].setTextSize(AndroidUtilities.dp(14.0f));
            q6VarArr[i22].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
            frameLayoutArr[i22].addView(q6VarArr[i22], w7.x5.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i22 != 0) {
                frameLayoutArr[i22].setAlpha(0.0f);
            }
            i22++;
            i21 = 119;
        }
        x90 x90Var = new x90(context);
        this.y = x90Var;
        x90Var.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.y.setRoundRadius(AndroidUtilities.dp((this.e == getUserConfig().getClientUserId() && this.f == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.y.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        i9 i9Var3 = new i9((org.telegram.ui.ActionBar.f6) null);
        i9Var3.l = true;
        this.y.setVisibility(z10 ? 0 : 8);
        this.y.setImageDrawable(i9Var3);
        frameLayout.addView(this.y, w7.x5.d(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        q6 q6Var2 = new q6(context, true, true, true);
        this.F = q6Var2;
        q6Var2.b(0.4f, 320L, pr.h);
        this.F.setTextSize(AndroidUtilities.dp(20.0f));
        this.F.setGravity(3);
        q6 q6Var3 = this.F;
        int i24 = org.telegram.ui.ActionBar.j6.G6;
        q6Var3.setTextColor(getThemedColor(i24));
        this.F.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.F, w7.x5.d(-2, -1.0f, 23, (z10 ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.a == 1) {
            ba0 ba0Var = new ba0(context, getResourceProvider());
            this.R = ba0Var;
            ba0Var.setOnTabClick(new y2(this, 6));
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.S = frameLayout5;
            frameLayout5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            this.S.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            di.d dVar = new di.d(context, getResourceProvider(), true);
            this.T = dVar;
            dVar.g(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.T.setShowZero(true);
            this.T.b(0, false);
            this.T.setEnabled(false);
            final int i25 = 5;
            this.T.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u90
                public final /* synthetic */ ca0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bi.l8 l8Var;
                    bi.l8 l8Var2;
                    bi.l8 l8Var3;
                    bi.l8 l8Var4;
                    int i172;
                    int i182 = i25;
                    ca0 ca0Var = this.b;
                    switch (i182) {
                        case 0:
                            ca0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = ca0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                ca0Var.Q.setEnabled(true);
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(booleanValue);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = ca0Var.V.x1(null, null);
                            if (x12 != null) {
                                ca0Var.Q.setEnabled(x12.booleanValue());
                                ca0Var.Q.animate().alpha(ca0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                ca0Var.P.setEnabled(true);
                                ca0Var.P.animate().alpha(ca0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z102 = ca0Var.L;
                            if (z102 && !ca0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = ca0Var.J;
                                int i192 = -ca0Var.N;
                                ca0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(f1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = ca0Var.J;
                                boolean z11 = !z102;
                                ca0Var.L = z11;
                                f1Var2.setChecked(z11);
                                z90 z90Var2 = ca0Var.V;
                                boolean z12 = ca0Var.L;
                                boolean z13 = ca0Var.M;
                                ft0 ft0Var = z90Var2.c0;
                                if (ft0Var != null && (l8Var2 = ft0Var.s) != null) {
                                    l8Var2.n = z12;
                                    l8Var2.o = z13;
                                    l8Var2.d(true);
                                }
                                kr0 kr0Var = z90Var2.e0;
                                if (kr0Var != null && (l8Var = kr0Var.s) != null) {
                                    l8Var.n = z12;
                                    l8Var.o = z13;
                                    l8Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = ca0Var.M;
                            if (z14 && !ca0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = ca0Var.K;
                                int i202 = -ca0Var.N;
                                ca0Var.N = i202;
                                AndroidUtilities.shakeViewSpring(f1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = ca0Var.K;
                                boolean z15 = !z14;
                                ca0Var.M = z15;
                                f1Var4.setChecked(z15);
                                z90 z90Var3 = ca0Var.V;
                                boolean z16 = ca0Var.L;
                                boolean z17 = ca0Var.M;
                                ft0 ft0Var2 = z90Var3.c0;
                                if (ft0Var2 != null && (l8Var4 = ft0Var2.s) != null) {
                                    l8Var4.n = z16;
                                    l8Var4.o = z17;
                                    l8Var4.d(true);
                                }
                                kr0 kr0Var2 = z90Var3.e0;
                                if (kr0Var2 != null && (l8Var3 = kr0Var2.s) != null) {
                                    l8Var3.n = z16;
                                    l8Var3.o = z17;
                                    l8Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            ca0 ca0Var2 = this.b;
                            di.y0 y0Var = ca0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                ca0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = ca0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (ca0Var2.I != null) {
                                i172 = 0;
                                for (int i212 = 0; i212 < ca0Var2.I.size(); i212++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ca0Var2.I.valueAt(i212)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            ca0Var2.V.L(false);
                            if (z18) {
                                ca0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i222 = 0; i222 < arrayList.size(); i222++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i222);
                                    zArr[i222] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                ca0Var2.getMessagesController().getStoriesController().n0(ca0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ca0Var2.U = new di.y0(ca0Var2, arrayList, z18, 19);
                                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(ca0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(ca0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), n5Var).j() : yc.a0(ca0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, n5Var).j()).v = new zu(21, ca0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.S.addView(this.T);
            this.S.setAlpha(0.0f);
            this.S.setTranslationY(AndroidUtilities.dp(100.0f));
            setBulletinDelegate(new di.c9(7));
        }
        if (this.a == 0 && this.e == getUserConfig().getClientUserId() && this.f == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.W = 11;
        }
        z90 z90Var2 = new z90(this, context, this.e, this.b, this.c, this.d, this.W, this, new y90(this), getResourceProvider(), frameLayout, w90Var);
        this.V = z90Var2;
        z90Var2.I0.setOpen(true);
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(i24), PorterDuff.Mode.SRC_IN));
        }
        this.V.setPinnedToTop(true);
        this.V.getSearchItem().setTranslationY(0.0f);
        this.V.r0.setTranslationY(0.0f);
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setTranslationY(0.0f);
        }
        int i26 = this.a;
        if (i26 == 1 || i26 == 2) {
            w90Var.addView(this.V, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            w90Var.addView(this.V);
        }
        w90Var.addView(this.actionBar);
        w90Var.addView(frameLayout);
        w90Var.T.add(this.V);
        if (this.a == 1) {
            Y(0, false, false);
            Y(1, false, false);
        }
        ba0 ba0Var2 = this.R;
        if (ba0Var2 != null) {
            i10 = -1;
            w90Var.addView(ba0Var2, w7.x5.e(-1, -2, 87));
        } else {
            i10 = -1;
        }
        FrameLayout frameLayout6 = this.S;
        if (frameLayout6 != null) {
            w90Var.addView(frameLayout6, w7.x5.e(i10, 64, 87));
        }
        long j3 = this.e;
        if (this.f != 0 && j3 == getUserConfig().getClientUserId()) {
            j3 = this.f;
        }
        int i27 = this.a;
        if (i27 == 3) {
            j5VarArr[0].k(this.h);
            int i28 = this.r;
            if (i28 != i10) {
                q6VarArr[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", i28));
            }
        } else if (i27 == 2) {
            j5VarArr[0].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        } else {
            if (i27 != 1) {
                if (j3 == UserObject.ANONYMOUS) {
                    j5VarArr[0].k(LocaleController.getString(R.string.AnonymousForward));
                    i9 i9Var4 = i9Var3;
                    i9Var4.g(21);
                    i9Var4.p = 0.75f;
                    i9Var2 = i9Var4;
                } else {
                    i9 i9Var5 = i9Var3;
                    if (this.f == 0 || j3 != getUserConfig().getClientUserId()) {
                        if (DialogObject.isEncryptedDialog(j3)) {
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(getMessagesController(), j3);
                            i9Var2 = i9Var5;
                            if (m10 != null) {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(m10.user_id));
                                i9Var2 = i9Var5;
                                if (user3 != null) {
                                    j5VarArr[0].k(ContactsController.formatName(user3.first_name, user3.last_name));
                                    i9Var5.m(this.currentAccount, user3);
                                    user = user3;
                                    user2 = user;
                                    i9Var = i9Var5;
                                }
                            }
                        } else if (DialogObject.isUserDialog(j3)) {
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
                            i9Var2 = i9Var5;
                            if (user4 != null) {
                                if (user4.self) {
                                    j5VarArr[0].k(LocaleController.getString(R.string.SavedMessages));
                                    i9Var5.g(1);
                                    i9Var5.p = 0.8f;
                                    i9Var2 = i9Var5;
                                } else {
                                    j5VarArr[0].k(ContactsController.formatName(user4.first_name, user4.last_name));
                                    i9Var5.m(this.currentAccount, user4);
                                    user = user4;
                                    user2 = user;
                                    i9Var = i9Var5;
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
                            i9Var2 = i9Var5;
                            if (chat != 0) {
                                j5VarArr[0].k(chat.title);
                                i9Var5.k(this.currentAccount, chat);
                                user = chat;
                                user2 = user;
                                i9Var = i9Var5;
                            }
                        }
                        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", i9Var, user2);
                        j5Var = j5VarArr[0];
                        if (j5Var != null && TextUtils.isEmpty(j5Var.getText())) {
                            j5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                        }
                        z90Var = this.V;
                        if (z90Var.s0(z90Var.k0[0].F) && this.a != 1) {
                            this.V.getSearchItem().setVisibility(0);
                        }
                        v0Var = this.V.m0;
                        if (v0Var != null) {
                            i11 = 11;
                            if (this.W != 11) {
                                v0Var.setVisibility(8);
                            }
                        } else {
                            i11 = 11;
                        }
                        if (this.V.getSearchOptionsItem() != null || this.a == 1) {
                            r10 = 0;
                        } else {
                            r10 = 0;
                            this.V.A(!r0.s0(r0.k0[0].F), false);
                            this.V.getSearchOptionsItem().setVisibility(0);
                        }
                        qt0[] qt0VarArr = this.V.k0;
                        i12 = qt0VarArr[r10].F;
                        if ((i12 != 0 || xu0.p0(i12) || qt0VarArr[r10].F == i11) && this.a != 1) {
                            this.V.r0.setVisibility(r10);
                        } else {
                            this.V.r0.setVisibility(4);
                        }
                        this.actionBar.setDrawBlurBackground(w90Var);
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                        a0();
                        Z();
                        if (this.a == 1 && this.W == 9) {
                            this.V.M0(9.0f);
                        }
                        return w90Var;
                    }
                    j5VarArr[0].k(LocaleController.getString(R.string.MyNotes));
                    i9Var5.g(22);
                    i9Var5.p = 0.75f;
                    i9Var2 = i9Var5;
                }
                user2 = null;
                i9Var = i9Var2;
                this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", i9Var, user2);
                j5Var = j5VarArr[0];
                if (j5Var != null) {
                    j5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                }
                z90Var = this.V;
                if (z90Var.s0(z90Var.k0[0].F)) {
                    this.V.getSearchItem().setVisibility(0);
                }
                v0Var = this.V.m0;
                if (v0Var != null) {
                }
                if (this.V.getSearchOptionsItem() != null) {
                }
                r10 = 0;
                qt0[] qt0VarArr2 = this.V.k0;
                i12 = qt0VarArr2[r10].F;
                if (i12 != 0) {
                }
                this.V.r0.setVisibility(r10);
                this.actionBar.setDrawBlurBackground(w90Var);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                a0();
                Z();
                if (this.a == 1) {
                    this.V.M0(9.0f);
                }
                return w90Var;
            }
            j5VarArr[0].k(LocaleController.getString(R.string.ProfileMyStories));
            j5VarArr[1].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        }
        i9Var2 = i9Var3;
        user2 = null;
        i9Var = i9Var2;
        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", i9Var, user2);
        j5Var = j5VarArr[0];
        if (j5Var != null) {
        }
        z90Var = this.V;
        if (z90Var.s0(z90Var.k0[0].F)) {
        }
        v0Var = this.V.m0;
        if (v0Var != null) {
        }
        if (this.V.getSearchOptionsItem() != null) {
        }
        r10 = 0;
        qt0[] qt0VarArr22 = this.V.k0;
        i12 = qt0VarArr22[r10].F;
        if (i12 != 0) {
        }
        this.V.r0.setVisibility(r10);
        this.actionBar.setDrawBlurBackground(w90Var);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
        a0();
        Z();
        if (this.a == 1) {
        }
        return w90Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            z90 z90Var = this.V;
            if (z90Var != null) {
                z90Var.setUserInfo(userFull);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.d6);
        return (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) ? themedColor : getLastStoryViewer().getNavigationBarColor(themedColor);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        z6 z6Var = new z6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.G6));
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.V.x0()) {
            return false;
        }
        z90 z90Var = this.V;
        return z90Var.getSelectedTab() == z90Var.I0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            z90 z90Var = this.V;
            if (!z90Var.C1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                z90Var.L(false);
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i10 = this.a;
        this.W = getArguments().getInt("start_from", i10 == 2 ? 9 : i10 == 1 ? 8 : 0);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesEnabledUpdate);
        if (DialogObject.isUserDialog(this.e) && this.f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.e);
            }
        }
        if (this.b == null) {
            this.b = new pu0(this);
        }
        this.b.x.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        di.y0 y0Var = this.U;
        if (y0Var != null) {
            this.U = null;
            AndroidUtilities.runOnUIThread(y0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        z90 z90Var = this.V;
        if (z90Var != null) {
            z90Var.setPagesPaddingBottom(i13);
        }
    }
}
