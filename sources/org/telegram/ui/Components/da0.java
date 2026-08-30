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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class da0 extends org.telegram.ui.ActionBar.p2 implements ru0, zf.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.i2 B;
    public k6 C;
    public org.telegram.ui.ActionBar.w0 D;
    public org.telegram.ui.ActionBar.w0 E;
    public SparseArray F;
    public org.telegram.ui.ActionBar.g1 G;
    public org.telegram.ui.ActionBar.g1 H;
    public boolean I;
    public boolean J;
    public int K;
    public org.telegram.ui.ActionBar.g1 L;
    public org.telegram.ui.ActionBar.g1 M;
    public org.telegram.ui.ActionBar.g1 N;
    public ca0 O;
    public FrameLayout P;
    public ph.d Q;
    public lh.r5 R;
    public aa0 S;
    public int T;
    public int U;
    public final boolean[] V;
    public final float[] W;
    public final boolean[] X;
    public final ValueAnimator[] Y;
    public int a;
    public qu0 b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public FrameLayout s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.k5[] w;
    public final k6[] x;
    public y90 y;

    public da0(Bundle bundle, qu0 qu0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.w = new org.telegram.ui.ActionBar.k5[2];
        this.x = new k6[2];
        this.I = true;
        this.J = true;
        this.K = -12;
        this.V = new boolean[2];
        this.W = new float[2];
        this.X = new boolean[]{true, true};
        this.Y = new ValueAnimator[2];
        this.b = qu0Var;
    }

    @Override // zf.b
    public final List B() {
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = cg.z1.m;
        return Arrays.asList(new zf.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new vp(this, 26)));
    }

    @Override // org.telegram.ui.Components.ru0
    public final void M() {
        qu0 qu0Var;
        aa0 aa0Var = this.S;
        if (aa0Var != null && (qu0Var = this.b) != null) {
            aa0Var.setNewMediaCounts(qu0Var.c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.c = chatFull;
    }

    public final void Y(int i10, boolean z4, boolean z10) {
        int i11 = this.a;
        if (i11 == 3) {
            return;
        }
        if (i10 == 1 && i11 == 2) {
            return;
        }
        boolean[] zArr = this.V;
        boolean z11 = zArr[i10];
        boolean[] zArr2 = this.X;
        if (z11 != z4 || zArr2[i10]) {
            boolean z12 = !zArr2[i10] && z10;
            zArr2[i10] = false;
            zArr[i10] = z4;
            ValueAnimator[] valueAnimatorArr = this.Y;
            ValueAnimator valueAnimator = valueAnimatorArr[i10];
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimatorArr[i10] = null;
            }
            float[] fArr = this.W;
            k6[] k6VarArr = this.x;
            if (!z12) {
                fArr[i10] = z4 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.k5[] k5VarArr = this.w;
                k5VarArr[i10].setScaleX(z4 ? 1.0f : 1.111f);
                k5VarArr[i10].setScaleY(z4 ? 1.0f : 1.111f);
                k5VarArr[i10].setTranslationY(z4 ? 0.0f : AndroidUtilities.dp(8.0f));
                k6VarArr[i10].setAlpha(z4 ? 1.0f : 0.0f);
                k6VarArr[i10].setVisibility(z4 ? 0 : 8);
                return;
            }
            k6VarArr[i10].setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i10], z4 ? 1.0f : 0.0f);
            valueAnimatorArr[i10] = ofFloat;
            ofFloat.addUpdateListener(new ih.b(this, i10, 5));
            valueAnimatorArr[i10].addListener(new ba0(this, i10, z4, 0));
            valueAnimatorArr[i10].setDuration(320L);
            valueAnimatorArr[i10].setInterpolator(nr.h);
            valueAnimatorArr[i10].start();
        }
    }

    public final void Z() {
        if (this.S.getSearchOptionsItem() != null) {
            this.S.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.w;
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        boolean z4;
        qt0 qt0Var;
        aa0 aa0Var = this.S;
        if (aa0Var != null) {
            k6[] k6VarArr = this.x;
            if (k6VarArr[0] == null) {
                return;
            }
            int closestTab = aa0Var.getClosestTab();
            int i10 = this.a;
            if (i10 != 3 || closestTab == 8) {
                int[] iArr = this.b.c;
                boolean z10 = LocaleController.isRTL;
                boolean z11 = !z10;
                int i11 = (i10 == 1 && closestTab != 8) ? 1 : 0;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        Y(i11, true, true);
                        k6VarArr[i11].c(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]), z11, true);
                        return;
                    }
                    if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                Y(i11, true, true);
                                if (this.S.getPhotosVideosTypeFilter() == 1) {
                                    k6VarArr[i11].c(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]), z11, true);
                                    return;
                                } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                                    k6VarArr[i11].c(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]), z11, true);
                                    return;
                                } else {
                                    k6VarArr[i11].c(LocaleController.formatPluralString("Media", iArr[0], new Object[0]), z11, true);
                                    return;
                                }
                            }
                            if (closestTab == 1) {
                                Y(i11, true, true);
                                k6VarArr[i11].c(LocaleController.formatPluralString("Files", iArr[1], new Object[0]), z11, true);
                                return;
                            }
                            if (closestTab == 2) {
                                Y(i11, true, true);
                                k6VarArr[i11].c(LocaleController.formatPluralString("Voice", iArr[2], new Object[0]), z11, true);
                                return;
                            }
                            if (closestTab == 3) {
                                Y(i11, true, true);
                                k6VarArr[i11].c(LocaleController.formatPluralString("Links", iArr[3], new Object[0]), z11, true);
                                return;
                            }
                            if (closestTab == 4) {
                                Y(i11, true, true);
                                k6VarArr[i11].c(LocaleController.formatPluralString("MusicFiles", iArr[4], new Object[0]), z11, true);
                                return;
                            } else if (closestTab == 5) {
                                Y(i11, true, true);
                                k6VarArr[i11].c(LocaleController.formatPluralString("GIFs", iArr[5], new Object[0]), z11, true);
                                return;
                            } else {
                                if (closestTab == 10) {
                                    Y(i11, true, true);
                                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.e);
                                    k6VarArr[i11].c(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]), z11, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.N;
                if (g1Var != null) {
                    g1Var.setEnabled(this.S.E());
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.N;
                    g1Var2.setAlpha(g1Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = this.M;
                if (g1Var3 != null) {
                    aa0 aa0Var2 = this.S;
                    qt0[] qt0VarArr = aa0Var2.h0;
                    if (qt0VarArr != null && (qt0Var = qt0VarArr[0]) != null) {
                        boolean p02 = yu0.p0(qt0Var.C);
                        int i12 = aa0Var2.j1[p02 ? 1 : 0];
                        if (i12 != aa0Var2.X(p02 ? 1 : 0, i12, true)) {
                            z4 = true;
                            g1Var3.setEnabled(z4);
                            org.telegram.ui.ActionBar.g1 g1Var4 = this.M;
                            g1Var4.setAlpha(!g1Var4.isEnabled() ? 1.0f : 0.5f);
                        }
                    }
                    z4 = false;
                    g1Var3.setEnabled(z4);
                    org.telegram.ui.ActionBar.g1 g1Var42 = this.M;
                    g1Var42.setAlpha(!g1Var42.isEnabled() ? 1.0f : 0.5f);
                }
                int c02 = this.S.c0(8);
                if (c02 <= 0) {
                    Y(0, false, true);
                } else if (this.a != 3) {
                    Y(0, true, true);
                    k6VarArr[0].c(LocaleController.formatPluralString("ProfileMyStoriesCount", c02, new Object[0]), z11, true);
                } else if (TextUtils.isEmpty(k6VarArr[0].getText())) {
                    Y(0, true, true);
                    k6VarArr[0].c(LocaleController.formatPluralStringSpaced("FoundStories", c02), z11, true);
                }
                if (this.a == 1) {
                    int c03 = this.S.c0(9);
                    if (c03 > 0) {
                        Y(1, true, true);
                        k6VarArr[1].c(LocaleController.formatPluralString("ProfileStoriesArchiveCount", c03, new Object[0]), z11, true);
                    } else {
                        Y(1, false, true);
                    }
                }
                if (this.D != null) {
                    aa0 aa0Var3 = this.S;
                    boolean z12 = aa0Var3.c0(aa0Var3.getClosestTab()) <= 0;
                    if (!z12) {
                        this.D.setVisibility(0);
                    }
                    this.D.animate().alpha(z12 ? 0.0f : 1.0f).withEndAction(new jh.f(25, this, z12)).setDuration(220L).setInterpolator(nr.h).start();
                }
                ph.d dVar = this.Q;
                if (dVar != null) {
                    boolean z13 = !z10 && this.U == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.F;
                        dVar.g(LocaleController.formatPluralString("ArchiveStories", sparseArray == null ? 0 : sparseArray.size(), new Object[0]), z13, true);
                    } else {
                        dVar.g(LocaleController.getString(R.string.SaveToProfile), z13, true);
                    }
                    this.U = closestTab;
                }
                if (this.L != null) {
                    boolean z14 = this.S.c0(closestTab) > 0;
                    this.L.setEnabled(z14);
                    this.L.setAlpha(z14 ? 1.0f : 0.5f);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        if (this.S.x0()) {
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
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        k6[] k6VarArr;
        org.telegram.ui.ActionBar.k5[] k5VarArr;
        int i10;
        TLRPC.User user;
        TLRPC.User user2;
        z8 z8Var;
        org.telegram.ui.ActionBar.k5 k5Var;
        aa0 aa0Var;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i11;
        ?? r10;
        int i12;
        z8 z8Var2;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.B = i2Var;
        kVar.setBackButtonDrawable(i2Var);
        this.B.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new w90(this));
        FrameLayout frameLayout = new FrameLayout(context);
        x90 x90Var = new x90(this, context, frameLayout, 0);
        x90Var.K = true;
        this.fragmentView = x90Var;
        x90Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i13 = this.a;
        if (i13 == 1 || i13 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.actionBar.addView(frameLayout2, k7.b6.e(56, 56, 85));
            int i14 = org.telegram.ui.ActionBar.j6.z8;
            int themedColor = getThemedColor(i14);
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, n10, themedColor, getThemedColor(i15));
            this.E = w0Var2;
            w0Var2.setIcon(R.drawable.msg_delete);
            this.E.setVisibility(8);
            this.E.setAlpha(0.0f);
            this.E.setOnClickListener(new z70(n10, 2));
            frameLayout2.addView(this.E);
            org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, n10, getThemedColor(i14), getThemedColor(i15));
            this.D = w0Var3;
            w0Var3.setIcon(R.drawable.ic_ab_other);
            final int i16 = 0;
            this.D.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v90
                public final /* synthetic */ da0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nh.l6 l6Var;
                    nh.l6 l6Var2;
                    nh.l6 l6Var3;
                    nh.l6 l6Var4;
                    int i17;
                    int i18 = i16;
                    da0 da0Var = this.b;
                    switch (i18) {
                        case 0:
                            da0Var.D.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = da0Var.S.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                da0Var.N.setEnabled(true);
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(booleanValue);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = da0Var.S.x1(null, null);
                            if (x12 != null) {
                                da0Var.N.setEnabled(x12.booleanValue());
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(true);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z4 = da0Var.I;
                            if (z4 && !da0Var.J) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = da0Var.G;
                                int i19 = -da0Var.K;
                                da0Var.K = i19;
                                AndroidUtilities.shakeViewSpring(g1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = da0Var.G;
                                boolean z10 = !z4;
                                da0Var.I = z10;
                                g1Var2.setChecked(z10);
                                aa0 aa0Var2 = da0Var.S;
                                boolean z11 = da0Var.I;
                                boolean z12 = da0Var.J;
                                ft0 ft0Var = aa0Var2.W;
                                if (ft0Var != null && (l6Var2 = ft0Var.s) != null) {
                                    l6Var2.n = z11;
                                    l6Var2.o = z12;
                                    l6Var2.d(true);
                                }
                                mr0 mr0Var = aa0Var2.b0;
                                if (mr0Var != null && (l6Var = mr0Var.s) != null) {
                                    l6Var.n = z11;
                                    l6Var.o = z12;
                                    l6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z13 = da0Var.J;
                            if (z13 && !da0Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = da0Var.H;
                                int i20 = -da0Var.K;
                                da0Var.K = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = da0Var.H;
                                boolean z14 = !z13;
                                da0Var.J = z14;
                                g1Var4.setChecked(z14);
                                aa0 aa0Var3 = da0Var.S;
                                boolean z15 = da0Var.I;
                                boolean z16 = da0Var.J;
                                ft0 ft0Var2 = aa0Var3.W;
                                if (ft0Var2 != null && (l6Var4 = ft0Var2.s) != null) {
                                    l6Var4.n = z15;
                                    l6Var4.o = z16;
                                    l6Var4.d(true);
                                }
                                mr0 mr0Var2 = aa0Var3.b0;
                                if (mr0Var2 != null && (l6Var3 = mr0Var2.s) != null) {
                                    l6Var3.n = z15;
                                    l6Var3.o = z16;
                                    l6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            da0 da0Var2 = this.b;
                            lh.r5 r5Var = da0Var2.R;
                            if (r5Var != null) {
                                r5Var.run();
                                da0Var2.R = null;
                            }
                            ic.e();
                            boolean z17 = da0Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (da0Var2.F != null) {
                                i17 = 0;
                                for (int i21 = 0; i21 < da0Var2.F.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) da0Var2.F.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i17++;
                                    }
                                }
                            } else {
                                i17 = 0;
                            }
                            da0Var2.S.L(false);
                            if (z17) {
                                da0Var2.S.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z17;
                                }
                                da0Var2.getMessagesController().getStoriesController().n0(da0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                da0Var2.R = new lh.r5(da0Var2, arrayList, z17, 15);
                                org.telegram.ui.ih ihVar = new org.telegram.ui.ih(da0Var2, zArr2, arrayList, zArr, 18);
                                (z17 ? qc.a0(da0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i17, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ihVar).j() : qc.a0(da0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i17, new Object[0]), LocaleController.getString("Undo"), 5000, false, ihVar).j()).v = new i80(3, da0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.D.setVisibility(8);
            this.D.setAlpha(0.0f);
            frameLayout2.addView(this.D);
            org.telegram.ui.ActionBar.g1 e = this.D.e(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.M = e;
            final int i17 = 1;
            e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v90
                public final /* synthetic */ da0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nh.l6 l6Var;
                    nh.l6 l6Var2;
                    nh.l6 l6Var3;
                    nh.l6 l6Var4;
                    int i172;
                    int i18 = i17;
                    da0 da0Var = this.b;
                    switch (i18) {
                        case 0:
                            da0Var.D.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = da0Var.S.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                da0Var.N.setEnabled(true);
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(booleanValue);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = da0Var.S.x1(null, null);
                            if (x12 != null) {
                                da0Var.N.setEnabled(x12.booleanValue());
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(true);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z4 = da0Var.I;
                            if (z4 && !da0Var.J) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = da0Var.G;
                                int i19 = -da0Var.K;
                                da0Var.K = i19;
                                AndroidUtilities.shakeViewSpring(g1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = da0Var.G;
                                boolean z10 = !z4;
                                da0Var.I = z10;
                                g1Var2.setChecked(z10);
                                aa0 aa0Var2 = da0Var.S;
                                boolean z11 = da0Var.I;
                                boolean z12 = da0Var.J;
                                ft0 ft0Var = aa0Var2.W;
                                if (ft0Var != null && (l6Var2 = ft0Var.s) != null) {
                                    l6Var2.n = z11;
                                    l6Var2.o = z12;
                                    l6Var2.d(true);
                                }
                                mr0 mr0Var = aa0Var2.b0;
                                if (mr0Var != null && (l6Var = mr0Var.s) != null) {
                                    l6Var.n = z11;
                                    l6Var.o = z12;
                                    l6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z13 = da0Var.J;
                            if (z13 && !da0Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = da0Var.H;
                                int i20 = -da0Var.K;
                                da0Var.K = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = da0Var.H;
                                boolean z14 = !z13;
                                da0Var.J = z14;
                                g1Var4.setChecked(z14);
                                aa0 aa0Var3 = da0Var.S;
                                boolean z15 = da0Var.I;
                                boolean z16 = da0Var.J;
                                ft0 ft0Var2 = aa0Var3.W;
                                if (ft0Var2 != null && (l6Var4 = ft0Var2.s) != null) {
                                    l6Var4.n = z15;
                                    l6Var4.o = z16;
                                    l6Var4.d(true);
                                }
                                mr0 mr0Var2 = aa0Var3.b0;
                                if (mr0Var2 != null && (l6Var3 = mr0Var2.s) != null) {
                                    l6Var3.n = z15;
                                    l6Var3.o = z16;
                                    l6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            da0 da0Var2 = this.b;
                            lh.r5 r5Var = da0Var2.R;
                            if (r5Var != null) {
                                r5Var.run();
                                da0Var2.R = null;
                            }
                            ic.e();
                            boolean z17 = da0Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (da0Var2.F != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < da0Var2.F.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) da0Var2.F.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            da0Var2.S.L(false);
                            if (z17) {
                                da0Var2.S.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z17;
                                }
                                da0Var2.getMessagesController().getStoriesController().n0(da0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                da0Var2.R = new lh.r5(da0Var2, arrayList, z17, 15);
                                org.telegram.ui.ih ihVar = new org.telegram.ui.ih(da0Var2, zArr2, arrayList, zArr, 18);
                                (z17 ? qc.a0(da0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ihVar).j() : qc.a0(da0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, ihVar).j()).v = new i80(3, da0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.g1 e6 = this.D.e(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.N = e6;
            final int i18 = 2;
            e6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v90
                public final /* synthetic */ da0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nh.l6 l6Var;
                    nh.l6 l6Var2;
                    nh.l6 l6Var3;
                    nh.l6 l6Var4;
                    int i172;
                    int i182 = i18;
                    da0 da0Var = this.b;
                    switch (i182) {
                        case 0:
                            da0Var.D.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = da0Var.S.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                da0Var.N.setEnabled(true);
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(booleanValue);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = da0Var.S.x1(null, null);
                            if (x12 != null) {
                                da0Var.N.setEnabled(x12.booleanValue());
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(true);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z4 = da0Var.I;
                            if (z4 && !da0Var.J) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = da0Var.G;
                                int i19 = -da0Var.K;
                                da0Var.K = i19;
                                AndroidUtilities.shakeViewSpring(g1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = da0Var.G;
                                boolean z10 = !z4;
                                da0Var.I = z10;
                                g1Var2.setChecked(z10);
                                aa0 aa0Var2 = da0Var.S;
                                boolean z11 = da0Var.I;
                                boolean z12 = da0Var.J;
                                ft0 ft0Var = aa0Var2.W;
                                if (ft0Var != null && (l6Var2 = ft0Var.s) != null) {
                                    l6Var2.n = z11;
                                    l6Var2.o = z12;
                                    l6Var2.d(true);
                                }
                                mr0 mr0Var = aa0Var2.b0;
                                if (mr0Var != null && (l6Var = mr0Var.s) != null) {
                                    l6Var.n = z11;
                                    l6Var.o = z12;
                                    l6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z13 = da0Var.J;
                            if (z13 && !da0Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = da0Var.H;
                                int i20 = -da0Var.K;
                                da0Var.K = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = da0Var.H;
                                boolean z14 = !z13;
                                da0Var.J = z14;
                                g1Var4.setChecked(z14);
                                aa0 aa0Var3 = da0Var.S;
                                boolean z15 = da0Var.I;
                                boolean z16 = da0Var.J;
                                ft0 ft0Var2 = aa0Var3.W;
                                if (ft0Var2 != null && (l6Var4 = ft0Var2.s) != null) {
                                    l6Var4.n = z15;
                                    l6Var4.o = z16;
                                    l6Var4.d(true);
                                }
                                mr0 mr0Var2 = aa0Var3.b0;
                                if (mr0Var2 != null && (l6Var3 = mr0Var2.s) != null) {
                                    l6Var3.n = z15;
                                    l6Var3.o = z16;
                                    l6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            da0 da0Var2 = this.b;
                            lh.r5 r5Var = da0Var2.R;
                            if (r5Var != null) {
                                r5Var.run();
                                da0Var2.R = null;
                            }
                            ic.e();
                            boolean z17 = da0Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (da0Var2.F != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < da0Var2.F.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) da0Var2.F.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            da0Var2.S.L(false);
                            if (z17) {
                                da0Var2.S.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z17;
                                }
                                da0Var2.getMessagesController().getStoriesController().n0(da0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                da0Var2.R = new lh.r5(da0Var2, arrayList, z17, 15);
                                org.telegram.ui.ih ihVar = new org.telegram.ui.ih(da0Var2, zArr2, arrayList, zArr, 18);
                                (z17 ? qc.a0(da0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ihVar).j() : qc.a0(da0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, ihVar).j()).v = new i80(3, da0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.g1 e10 = this.D.e(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.L = e10;
            e10.setEnabled(false);
            this.L.setAlpha(0.5f);
            this.D.a(-1);
            org.telegram.ui.ActionBar.w0 w0Var4 = this.D;
            org.telegram.ui.ActionBar.g1 d = w0Var4.d(6, 0, null, LocaleController.getString(R.string.MediaShowPhotos), true, true, w0Var4.j0);
            this.G = d;
            d.setChecked(this.I);
            final int i19 = 3;
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v90
                public final /* synthetic */ da0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nh.l6 l6Var;
                    nh.l6 l6Var2;
                    nh.l6 l6Var3;
                    nh.l6 l6Var4;
                    int i172;
                    int i182 = i19;
                    da0 da0Var = this.b;
                    switch (i182) {
                        case 0:
                            da0Var.D.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = da0Var.S.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                da0Var.N.setEnabled(true);
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(booleanValue);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = da0Var.S.x1(null, null);
                            if (x12 != null) {
                                da0Var.N.setEnabled(x12.booleanValue());
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(true);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z4 = da0Var.I;
                            if (z4 && !da0Var.J) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = da0Var.G;
                                int i192 = -da0Var.K;
                                da0Var.K = i192;
                                AndroidUtilities.shakeViewSpring(g1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = da0Var.G;
                                boolean z10 = !z4;
                                da0Var.I = z10;
                                g1Var2.setChecked(z10);
                                aa0 aa0Var2 = da0Var.S;
                                boolean z11 = da0Var.I;
                                boolean z12 = da0Var.J;
                                ft0 ft0Var = aa0Var2.W;
                                if (ft0Var != null && (l6Var2 = ft0Var.s) != null) {
                                    l6Var2.n = z11;
                                    l6Var2.o = z12;
                                    l6Var2.d(true);
                                }
                                mr0 mr0Var = aa0Var2.b0;
                                if (mr0Var != null && (l6Var = mr0Var.s) != null) {
                                    l6Var.n = z11;
                                    l6Var.o = z12;
                                    l6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z13 = da0Var.J;
                            if (z13 && !da0Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = da0Var.H;
                                int i20 = -da0Var.K;
                                da0Var.K = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = da0Var.H;
                                boolean z14 = !z13;
                                da0Var.J = z14;
                                g1Var4.setChecked(z14);
                                aa0 aa0Var3 = da0Var.S;
                                boolean z15 = da0Var.I;
                                boolean z16 = da0Var.J;
                                ft0 ft0Var2 = aa0Var3.W;
                                if (ft0Var2 != null && (l6Var4 = ft0Var2.s) != null) {
                                    l6Var4.n = z15;
                                    l6Var4.o = z16;
                                    l6Var4.d(true);
                                }
                                mr0 mr0Var2 = aa0Var3.b0;
                                if (mr0Var2 != null && (l6Var3 = mr0Var2.s) != null) {
                                    l6Var3.n = z15;
                                    l6Var3.o = z16;
                                    l6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            da0 da0Var2 = this.b;
                            lh.r5 r5Var = da0Var2.R;
                            if (r5Var != null) {
                                r5Var.run();
                                da0Var2.R = null;
                            }
                            ic.e();
                            boolean z17 = da0Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (da0Var2.F != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < da0Var2.F.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) da0Var2.F.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            da0Var2.S.L(false);
                            if (z17) {
                                da0Var2.S.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z17;
                                }
                                da0Var2.getMessagesController().getStoriesController().n0(da0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                da0Var2.R = new lh.r5(da0Var2, arrayList, z17, 15);
                                org.telegram.ui.ih ihVar = new org.telegram.ui.ih(da0Var2, zArr2, arrayList, zArr, 18);
                                (z17 ? qc.a0(da0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ihVar).j() : qc.a0(da0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, ihVar).j()).v = new i80(3, da0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.w0 w0Var5 = this.D;
            org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(7, 0, null, LocaleController.getString(R.string.MediaShowVideos), true, true, w0Var5.j0);
            this.H = d10;
            d10.setChecked(this.J);
            final int i20 = 4;
            this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v90
                public final /* synthetic */ da0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nh.l6 l6Var;
                    nh.l6 l6Var2;
                    nh.l6 l6Var3;
                    nh.l6 l6Var4;
                    int i172;
                    int i182 = i20;
                    da0 da0Var = this.b;
                    switch (i182) {
                        case 0:
                            da0Var.D.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = da0Var.S.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                da0Var.N.setEnabled(true);
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(booleanValue);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = da0Var.S.x1(null, null);
                            if (x12 != null) {
                                da0Var.N.setEnabled(x12.booleanValue());
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(true);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z4 = da0Var.I;
                            if (z4 && !da0Var.J) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = da0Var.G;
                                int i192 = -da0Var.K;
                                da0Var.K = i192;
                                AndroidUtilities.shakeViewSpring(g1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = da0Var.G;
                                boolean z10 = !z4;
                                da0Var.I = z10;
                                g1Var2.setChecked(z10);
                                aa0 aa0Var2 = da0Var.S;
                                boolean z11 = da0Var.I;
                                boolean z12 = da0Var.J;
                                ft0 ft0Var = aa0Var2.W;
                                if (ft0Var != null && (l6Var2 = ft0Var.s) != null) {
                                    l6Var2.n = z11;
                                    l6Var2.o = z12;
                                    l6Var2.d(true);
                                }
                                mr0 mr0Var = aa0Var2.b0;
                                if (mr0Var != null && (l6Var = mr0Var.s) != null) {
                                    l6Var.n = z11;
                                    l6Var.o = z12;
                                    l6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z13 = da0Var.J;
                            if (z13 && !da0Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = da0Var.H;
                                int i202 = -da0Var.K;
                                da0Var.K = i202;
                                AndroidUtilities.shakeViewSpring(g1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = da0Var.H;
                                boolean z14 = !z13;
                                da0Var.J = z14;
                                g1Var4.setChecked(z14);
                                aa0 aa0Var3 = da0Var.S;
                                boolean z15 = da0Var.I;
                                boolean z16 = da0Var.J;
                                ft0 ft0Var2 = aa0Var3.W;
                                if (ft0Var2 != null && (l6Var4 = ft0Var2.s) != null) {
                                    l6Var4.n = z15;
                                    l6Var4.o = z16;
                                    l6Var4.d(true);
                                }
                                mr0 mr0Var2 = aa0Var3.b0;
                                if (mr0Var2 != null && (l6Var3 = mr0Var2.s) != null) {
                                    l6Var3.n = z15;
                                    l6Var3.o = z16;
                                    l6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            da0 da0Var2 = this.b;
                            lh.r5 r5Var = da0Var2.R;
                            if (r5Var != null) {
                                r5Var.run();
                                da0Var2.R = null;
                            }
                            ic.e();
                            boolean z17 = da0Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (da0Var2.F != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < da0Var2.F.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) da0Var2.F.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            da0Var2.S.L(false);
                            if (z17) {
                                da0Var2.S.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z17;
                                }
                                da0Var2.getMessagesController().getStoriesController().n0(da0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                da0Var2.R = new lh.r5(da0Var2, arrayList, z17, 15);
                                org.telegram.ui.ih ihVar = new org.telegram.ui.ih(da0Var2, zArr2, arrayList, zArr, 18);
                                (z17 ? qc.a0(da0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ihVar).j() : qc.a0(da0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, ihVar).j()).v = new i80(3, da0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        boolean z4 = this.a == 0;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        int i21 = 119;
        frameLayout.addView(frameLayout3, k7.b6.e(-1, -1, 119));
        int i22 = 0;
        while (true) {
            int i23 = this.a == 1 ? 2 : 1;
            k6VarArr = this.x;
            k5VarArr = this.w;
            if (i22 >= i23) {
                break;
            }
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout[] frameLayoutArr = this.v;
            frameLayoutArr[i22] = frameLayout4;
            this.s.addView(frameLayout4, k7.b6.e(-1, -1, i21));
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
            k5VarArr[i22] = k5Var2;
            k5Var2.setPivotX(0.0f);
            k5VarArr[i22].setPivotY(AndroidUtilities.dp(9.0f));
            k5VarArr[i22].setTextSize(18);
            k5VarArr[i22].setGravity(3);
            k5VarArr[i22].setTypeface(AndroidUtilities.bold());
            k5VarArr[i22].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            k5VarArr[i22].setScrollNonFitText(true);
            k5VarArr[i22].setImportantForAccessibility(2);
            frameLayoutArr[i22].addView(k5VarArr[i22], k7.b6.d(-2, -2.0f, 51, z4 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            k6 k6Var = new k6(context, true, true, true);
            k6VarArr[i22] = k6Var;
            k6Var.b(0.4f, 320L, nr.h);
            k6VarArr[i22].setTextSize(AndroidUtilities.dp(14.0f));
            k6VarArr[i22].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
            frameLayoutArr[i22].addView(k6VarArr[i22], k7.b6.d(-2, -2.0f, 51, z4 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i22 != 0) {
                frameLayoutArr[i22].setAlpha(0.0f);
            }
            i22++;
            i21 = 119;
        }
        y90 y90Var = new y90(context);
        this.y = y90Var;
        y90Var.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.y.setRoundRadius(AndroidUtilities.dp((this.e == getUserConfig().getClientUserId() && this.f == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.y.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        z8 z8Var3 = new z8((org.telegram.ui.ActionBar.f6) null);
        z8Var3.l = true;
        this.y.setVisibility(z4 ? 0 : 8);
        this.y.setImageDrawable(z8Var3);
        frameLayout.addView(this.y, k7.b6.d(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        k6 k6Var2 = new k6(context, true, true, true);
        this.C = k6Var2;
        k6Var2.b(0.4f, 320L, nr.h);
        this.C.setTextSize(AndroidUtilities.dp(20.0f));
        this.C.setGravity(3);
        k6 k6Var3 = this.C;
        int i24 = org.telegram.ui.ActionBar.j6.G6;
        k6Var3.setTextColor(getThemedColor(i24));
        this.C.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.C, k7.b6.d(-2, -1.0f, 23, (z4 ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.a == 1) {
            ca0 ca0Var = new ca0(context, getResourceProvider());
            this.O = ca0Var;
            ca0Var.setOnTabClick(new v2(this, 6));
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.P = frameLayout5;
            frameLayout5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            this.P.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            ph.d dVar = new ph.d(context, getResourceProvider(), true);
            this.Q = dVar;
            dVar.g(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.Q.setShowZero(true);
            this.Q.c(0, false);
            this.Q.setEnabled(false);
            final int i25 = 5;
            this.Q.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v90
                public final /* synthetic */ da0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nh.l6 l6Var;
                    nh.l6 l6Var2;
                    nh.l6 l6Var3;
                    nh.l6 l6Var4;
                    int i172;
                    int i182 = i25;
                    da0 da0Var = this.b;
                    switch (i182) {
                        case 0:
                            da0Var.D.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = da0Var.S.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                da0Var.N.setEnabled(true);
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(booleanValue);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = da0Var.S.x1(null, null);
                            if (x12 != null) {
                                da0Var.N.setEnabled(x12.booleanValue());
                                da0Var.N.animate().alpha(da0Var.N.isEnabled() ? 1.0f : 0.5f).start();
                                da0Var.M.setEnabled(true);
                                da0Var.M.animate().alpha(da0Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z42 = da0Var.I;
                            if (z42 && !da0Var.J) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = da0Var.G;
                                int i192 = -da0Var.K;
                                da0Var.K = i192;
                                AndroidUtilities.shakeViewSpring(g1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = da0Var.G;
                                boolean z10 = !z42;
                                da0Var.I = z10;
                                g1Var2.setChecked(z10);
                                aa0 aa0Var2 = da0Var.S;
                                boolean z11 = da0Var.I;
                                boolean z12 = da0Var.J;
                                ft0 ft0Var = aa0Var2.W;
                                if (ft0Var != null && (l6Var2 = ft0Var.s) != null) {
                                    l6Var2.n = z11;
                                    l6Var2.o = z12;
                                    l6Var2.d(true);
                                }
                                mr0 mr0Var = aa0Var2.b0;
                                if (mr0Var != null && (l6Var = mr0Var.s) != null) {
                                    l6Var.n = z11;
                                    l6Var.o = z12;
                                    l6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z13 = da0Var.J;
                            if (z13 && !da0Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = da0Var.H;
                                int i202 = -da0Var.K;
                                da0Var.K = i202;
                                AndroidUtilities.shakeViewSpring(g1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = da0Var.H;
                                boolean z14 = !z13;
                                da0Var.J = z14;
                                g1Var4.setChecked(z14);
                                aa0 aa0Var3 = da0Var.S;
                                boolean z15 = da0Var.I;
                                boolean z16 = da0Var.J;
                                ft0 ft0Var2 = aa0Var3.W;
                                if (ft0Var2 != null && (l6Var4 = ft0Var2.s) != null) {
                                    l6Var4.n = z15;
                                    l6Var4.o = z16;
                                    l6Var4.d(true);
                                }
                                mr0 mr0Var2 = aa0Var3.b0;
                                if (mr0Var2 != null && (l6Var3 = mr0Var2.s) != null) {
                                    l6Var3.n = z15;
                                    l6Var3.o = z16;
                                    l6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            da0 da0Var2 = this.b;
                            lh.r5 r5Var = da0Var2.R;
                            if (r5Var != null) {
                                r5Var.run();
                                da0Var2.R = null;
                            }
                            ic.e();
                            boolean z17 = da0Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (da0Var2.F != null) {
                                i172 = 0;
                                for (int i212 = 0; i212 < da0Var2.F.size(); i212++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) da0Var2.F.valueAt(i212)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            da0Var2.S.L(false);
                            if (z17) {
                                da0Var2.S.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i222 = 0; i222 < arrayList.size(); i222++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i222);
                                    zArr[i222] = storyItem2.pinned;
                                    storyItem2.pinned = z17;
                                }
                                da0Var2.getMessagesController().getStoriesController().n0(da0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                da0Var2.R = new lh.r5(da0Var2, arrayList, z17, 15);
                                org.telegram.ui.ih ihVar = new org.telegram.ui.ih(da0Var2, zArr2, arrayList, zArr, 18);
                                (z17 ? qc.a0(da0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ihVar).j() : qc.a0(da0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, ihVar).j()).v = new i80(3, da0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.P.addView(this.Q);
            this.P.setAlpha(0.0f);
            this.P.setTranslationY(AndroidUtilities.dp(100.0f));
            setBulletinDelegate(new gg.w(6));
        }
        if (this.a == 0 && this.e == getUserConfig().getClientUserId() && this.f == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.T = 11;
        }
        aa0 aa0Var2 = new aa0(this, context, this.e, this.b, this.c, this.d, this.T, this, new z90(this), getResourceProvider(), frameLayout, x90Var);
        this.S = aa0Var2;
        aa0Var2.F0.setOpen(true);
        if (this.S.getSearchOptionsItem() != null) {
            this.S.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(i24), PorterDuff.Mode.SRC_IN));
        }
        this.S.setPinnedToTop(true);
        this.S.getSearchItem().setTranslationY(0.0f);
        this.S.o0.setTranslationY(0.0f);
        if (this.S.getSearchOptionsItem() != null) {
            this.S.getSearchOptionsItem().setTranslationY(0.0f);
        }
        int i26 = this.a;
        if (i26 == 1 || i26 == 2) {
            x90Var.addView(this.S, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            x90Var.addView(this.S);
        }
        x90Var.addView(this.actionBar);
        x90Var.addView(frameLayout);
        x90Var.Q.add(this.S);
        if (this.a == 1) {
            Y(0, false, false);
            Y(1, false, false);
        }
        ca0 ca0Var2 = this.O;
        if (ca0Var2 != null) {
            i10 = -1;
            x90Var.addView(ca0Var2, k7.b6.e(-1, -2, 87));
        } else {
            i10 = -1;
        }
        FrameLayout frameLayout6 = this.P;
        if (frameLayout6 != null) {
            x90Var.addView(frameLayout6, k7.b6.e(i10, 64, 87));
        }
        long j10 = this.e;
        if (this.f != 0 && j10 == getUserConfig().getClientUserId()) {
            j10 = this.f;
        }
        int i27 = this.a;
        if (i27 == 3) {
            k5VarArr[0].k(this.h);
            int i28 = this.r;
            if (i28 != i10) {
                k6VarArr[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", i28));
            }
        } else if (i27 == 2) {
            k5VarArr[0].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        } else {
            if (i27 != 1) {
                if (j10 == UserObject.ANONYMOUS) {
                    k5VarArr[0].k(LocaleController.getString(R.string.AnonymousForward));
                    z8 z8Var4 = z8Var3;
                    z8Var4.g(21);
                    z8Var4.p = 0.75f;
                    z8Var2 = z8Var4;
                } else {
                    z8 z8Var5 = z8Var3;
                    if (this.f == 0 || j10 != getUserConfig().getClientUserId()) {
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.EncryptedChat n11 = org.telegram.messenger.y3.n(getMessagesController(), j10);
                            z8Var2 = z8Var5;
                            if (n11 != null) {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(n11.user_id));
                                z8Var2 = z8Var5;
                                if (user3 != null) {
                                    k5VarArr[0].k(ContactsController.formatName(user3.first_name, user3.last_name));
                                    z8Var5.m(this.currentAccount, user3);
                                    user = user3;
                                    user2 = user;
                                    z8Var = z8Var5;
                                }
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                            z8Var2 = z8Var5;
                            if (user4 != null) {
                                if (user4.self) {
                                    k5VarArr[0].k(LocaleController.getString(R.string.SavedMessages));
                                    z8Var5.g(1);
                                    z8Var5.p = 0.8f;
                                    z8Var2 = z8Var5;
                                } else {
                                    k5VarArr[0].k(ContactsController.formatName(user4.first_name, user4.last_name));
                                    z8Var5.m(this.currentAccount, user4);
                                    user = user4;
                                    user2 = user;
                                    z8Var = z8Var5;
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                            z8Var2 = z8Var5;
                            if (chat != 0) {
                                k5VarArr[0].k(chat.title);
                                z8Var5.k(this.currentAccount, chat);
                                user = chat;
                                user2 = user;
                                z8Var = z8Var5;
                            }
                        }
                        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", z8Var, user2);
                        k5Var = k5VarArr[0];
                        if (k5Var != null && TextUtils.isEmpty(k5Var.getText())) {
                            k5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                        }
                        aa0Var = this.S;
                        if (aa0Var.s0(aa0Var.h0[0].C) && this.a != 1) {
                            this.S.getSearchItem().setVisibility(0);
                        }
                        w0Var = this.S.j0;
                        if (w0Var != null) {
                            i11 = 11;
                            if (this.T != 11) {
                                w0Var.setVisibility(8);
                            }
                        } else {
                            i11 = 11;
                        }
                        if (this.S.getSearchOptionsItem() != null || this.a == 1) {
                            r10 = 0;
                        } else {
                            r10 = 0;
                            this.S.A(!r0.s0(r0.h0[0].C), false);
                            this.S.getSearchOptionsItem().setVisibility(0);
                        }
                        qt0[] qt0VarArr = this.S.h0;
                        i12 = qt0VarArr[r10].C;
                        if ((i12 != 0 || yu0.p0(i12) || qt0VarArr[r10].C == i11) && this.a != 1) {
                            this.S.o0.setVisibility(r10);
                        } else {
                            this.S.o0.setVisibility(4);
                        }
                        this.actionBar.setDrawBlurBackground(x90Var);
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                        a0();
                        Z();
                        if (this.a == 1 && this.T == 9) {
                            this.S.M0(9.0f);
                        }
                        return x90Var;
                    }
                    k5VarArr[0].k(LocaleController.getString(R.string.MyNotes));
                    z8Var5.g(22);
                    z8Var5.p = 0.75f;
                    z8Var2 = z8Var5;
                }
                user2 = null;
                z8Var = z8Var2;
                this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", z8Var, user2);
                k5Var = k5VarArr[0];
                if (k5Var != null) {
                    k5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                }
                aa0Var = this.S;
                if (aa0Var.s0(aa0Var.h0[0].C)) {
                    this.S.getSearchItem().setVisibility(0);
                }
                w0Var = this.S.j0;
                if (w0Var != null) {
                }
                if (this.S.getSearchOptionsItem() != null) {
                }
                r10 = 0;
                qt0[] qt0VarArr2 = this.S.h0;
                i12 = qt0VarArr2[r10].C;
                if (i12 != 0) {
                }
                this.S.o0.setVisibility(r10);
                this.actionBar.setDrawBlurBackground(x90Var);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                a0();
                Z();
                if (this.a == 1) {
                    this.S.M0(9.0f);
                }
                return x90Var;
            }
            k5VarArr[0].k(LocaleController.getString(R.string.ProfileMyStories));
            k5VarArr[1].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        }
        z8Var2 = z8Var3;
        user2 = null;
        z8Var = z8Var2;
        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", z8Var, user2);
        k5Var = k5VarArr[0];
        if (k5Var != null) {
        }
        aa0Var = this.S;
        if (aa0Var.s0(aa0Var.h0[0].C)) {
        }
        w0Var = this.S.j0;
        if (w0Var != null) {
        }
        if (this.S.getSearchOptionsItem() != null) {
        }
        r10 = 0;
        qt0[] qt0VarArr22 = this.S.h0;
        i12 = qt0VarArr22[r10].C;
        if (i12 != 0) {
        }
        this.S.o0.setVisibility(r10);
        this.actionBar.setDrawBlurBackground(x90Var);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
        a0();
        Z();
        if (this.a == 1) {
        }
        return x90Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            aa0 aa0Var = this.S;
            if (aa0Var != null) {
                aa0Var.setUserInfo(userFull);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.d6);
        return (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) ? themedColor : getLastStoryViewer().getNavigationBarColor(themedColor);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        t6 t6Var = new t6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.G6));
        arrayList.addAll(this.S.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
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

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.S.x0()) {
            return false;
        }
        aa0 aa0Var = this.S;
        return aa0Var.getSelectedTab() == aa0Var.F0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (!hasShownSheet()) {
            aa0 aa0Var = this.S;
            if (!aa0Var.z1) {
                return super.onBackPressed(z4);
            }
            if (z4) {
                aa0Var.L(false);
            }
        } else if (z4) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i10 = this.a;
        this.T = getArguments().getInt("start_from", i10 == 2 ? 9 : i10 == 1 ? 8 : 0);
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
            this.b = new qu0(this);
        }
        this.b.x.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        lh.r5 r5Var = this.R;
        if (r5Var != null) {
            this.R = null;
            AndroidUtilities.runOnUIThread(r5Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        aa0 aa0Var = this.S;
        if (aa0Var != null) {
            aa0Var.setPagesPaddingBottom(i13);
        }
    }
}
