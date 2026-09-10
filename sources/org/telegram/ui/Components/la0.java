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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class la0 extends org.telegram.ui.ActionBar.p2 implements bv0, lg.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.i2 E;
    public o6 F;
    public org.telegram.ui.ActionBar.w0 G;
    public org.telegram.ui.ActionBar.w0 H;
    public SparseArray I;
    public org.telegram.ui.ActionBar.g1 J;
    public org.telegram.ui.ActionBar.g1 K;
    public boolean L;
    public boolean M;
    public int N;
    public org.telegram.ui.ActionBar.g1 O;
    public org.telegram.ui.ActionBar.g1 P;
    public org.telegram.ui.ActionBar.g1 Q;
    public ka0 R;
    public FrameLayout S;
    public bi.d T;
    public bi.c1 U;
    public ia0 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int a;
    public final boolean[] a0;
    public av0 b;
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
    public final org.telegram.ui.ActionBar.l5[] w;
    public final o6[] x;
    public ga0 y;

    public la0(Bundle bundle, av0 av0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.w = new org.telegram.ui.ActionBar.l5[2];
        this.x = new o6[2];
        this.L = true;
        this.M = true;
        this.N = -12;
        this.Y = new boolean[2];
        this.Z = new float[2];
        this.a0 = new boolean[]{true, true};
        this.b0 = new ValueAnimator[2];
        this.b = av0Var;
    }

    @Override // org.telegram.ui.Components.bv0
    public final void M() {
        av0 av0Var;
        ia0 ia0Var = this.V;
        if (ia0Var != null && (av0Var = this.b) != null) {
            ia0Var.setNewMediaCounts(av0Var.c);
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
            o6[] o6VarArr = this.x;
            if (!z13) {
                fArr[i10] = z10 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.l5[] l5VarArr = this.w;
                l5VarArr[i10].setScaleX(z10 ? 1.0f : 1.111f);
                l5VarArr[i10].setScaleY(z10 ? 1.0f : 1.111f);
                l5VarArr[i10].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                o6VarArr[i10].setAlpha(z10 ? 1.0f : 0.0f);
                o6VarArr[i10].setVisibility(z10 ? 0 : 8);
                return;
            }
            o6VarArr[i10].setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i10], z10 ? 1.0f : 0.0f);
            valueAnimatorArr[i10] = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.s2(this, i10, 4));
            valueAnimatorArr[i10].addListener(new ja0(this, i10, z10, 0));
            valueAnimatorArr[i10].setDuration(320L);
            valueAnimatorArr[i10].setInterpolator(wr.h);
            valueAnimatorArr[i10].start();
        }
    }

    public final void Z() {
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        lVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.w;
        org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[1];
        if (l5Var2 != null) {
            l5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        boolean z10;
        au0 au0Var;
        ia0 ia0Var = this.V;
        if (ia0Var != null) {
            o6[] o6VarArr = this.x;
            if (o6VarArr[0] == null) {
                return;
            }
            int closestTab = ia0Var.getClosestTab();
            int i10 = this.a;
            if (i10 != 3 || closestTab == 8) {
                int[] iArr = this.b.c;
                boolean z11 = LocaleController.isRTL;
                boolean z12 = !z11;
                int i11 = (i10 == 1 && closestTab != 8) ? 1 : 0;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        Y(i11, true, true);
                        o6VarArr[i11].c(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]), z12, true);
                        return;
                    }
                    if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                Y(i11, true, true);
                                if (this.V.getPhotosVideosTypeFilter() == 1) {
                                    o6VarArr[i11].c(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]), z12, true);
                                    return;
                                } else if (this.V.getPhotosVideosTypeFilter() == 2) {
                                    o6VarArr[i11].c(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]), z12, true);
                                    return;
                                } else {
                                    o6VarArr[i11].c(LocaleController.formatPluralString("Media", iArr[0], new Object[0]), z12, true);
                                    return;
                                }
                            }
                            if (closestTab == 1) {
                                Y(i11, true, true);
                                o6VarArr[i11].c(LocaleController.formatPluralString("Files", iArr[1], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 2) {
                                Y(i11, true, true);
                                o6VarArr[i11].c(LocaleController.formatPluralString("Voice", iArr[2], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 3) {
                                Y(i11, true, true);
                                o6VarArr[i11].c(LocaleController.formatPluralString("Links", iArr[3], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 4) {
                                Y(i11, true, true);
                                o6VarArr[i11].c(LocaleController.formatPluralString("MusicFiles", iArr[4], new Object[0]), z12, true);
                                return;
                            } else if (closestTab == 5) {
                                Y(i11, true, true);
                                o6VarArr[i11].c(LocaleController.formatPluralString("GIFs", iArr[5], new Object[0]), z12, true);
                                return;
                            } else {
                                if (closestTab == 10) {
                                    Y(i11, true, true);
                                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.e);
                                    o6VarArr[i11].c(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]), z12, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.Q;
                if (g1Var != null) {
                    g1Var.setEnabled(this.V.E());
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.Q;
                    g1Var2.setAlpha(g1Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = this.P;
                if (g1Var3 != null) {
                    ia0 ia0Var2 = this.V;
                    au0[] au0VarArr = ia0Var2.k0;
                    if (au0VarArr != null && (au0Var = au0VarArr[0]) != null) {
                        boolean p02 = iv0.p0(au0Var.F);
                        int i12 = ia0Var2.m1[p02 ? 1 : 0];
                        if (i12 != ia0Var2.X(p02 ? 1 : 0, i12, true)) {
                            z10 = true;
                            g1Var3.setEnabled(z10);
                            org.telegram.ui.ActionBar.g1 g1Var4 = this.P;
                            g1Var4.setAlpha(!g1Var4.isEnabled() ? 1.0f : 0.5f);
                        }
                    }
                    z10 = false;
                    g1Var3.setEnabled(z10);
                    org.telegram.ui.ActionBar.g1 g1Var42 = this.P;
                    g1Var42.setAlpha(!g1Var42.isEnabled() ? 1.0f : 0.5f);
                }
                int c02 = this.V.c0(8);
                if (c02 <= 0) {
                    Y(0, false, true);
                } else if (this.a != 3) {
                    Y(0, true, true);
                    o6VarArr[0].c(LocaleController.formatPluralString("ProfileMyStoriesCount", c02, new Object[0]), z12, true);
                } else if (TextUtils.isEmpty(o6VarArr[0].getText())) {
                    Y(0, true, true);
                    o6VarArr[0].c(LocaleController.formatPluralStringSpaced("FoundStories", c02), z12, true);
                }
                if (this.a == 1) {
                    int c03 = this.V.c0(9);
                    if (c03 > 0) {
                        Y(1, true, true);
                        o6VarArr[1].c(LocaleController.formatPluralString("ProfileStoriesArchiveCount", c03, new Object[0]), z12, true);
                    } else {
                        Y(1, false, true);
                    }
                }
                if (this.G != null) {
                    ia0 ia0Var3 = this.V;
                    boolean z13 = ia0Var3.c0(ia0Var3.getClosestTab()) <= 0;
                    if (!z13) {
                        this.G.setVisibility(0);
                    }
                    this.G.animate().alpha(z13 ? 0.0f : 1.0f).withEndAction(new ai.j(26, this, z13)).setDuration(220L).setInterpolator(wr.h).start();
                }
                bi.d dVar = this.T;
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

    @Override // org.telegram.ui.ActionBar.p2
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
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        o6[] o6VarArr;
        org.telegram.ui.ActionBar.l5[] l5VarArr;
        int i10;
        TLRPC.User user;
        TLRPC.User user2;
        g9 g9Var;
        org.telegram.ui.ActionBar.l5 l5Var;
        ia0 ia0Var;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i11;
        ?? r10;
        int i12;
        g9 g9Var2;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.E = i2Var;
        lVar.setBackButtonDrawable(i2Var);
        this.E.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ea0(this));
        FrameLayout frameLayout = new FrameLayout(context);
        fa0 fa0Var = new fa0(this, context, frameLayout, 0);
        fa0Var.N = true;
        this.fragmentView = fa0Var;
        fa0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i13 = this.a;
        if (i13 == 1 || i13 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.actionBar.addView(frameLayout2, w7.a6.e(56, 56, 85));
            int i14 = org.telegram.ui.ActionBar.j6.z8;
            int themedColor = getThemedColor(i14);
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, n10, themedColor, getThemedColor(i15));
            this.H = w0Var2;
            w0Var2.setIcon(R.drawable.msg_delete);
            this.H.setVisibility(8);
            this.H.setAlpha(0.0f);
            this.H.setOnClickListener(new g80(n10, 2));
            frameLayout2.addView(this.H);
            org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, n10, getThemedColor(i14), getThemedColor(i15));
            this.G = w0Var3;
            w0Var3.setIcon(R.drawable.ic_ab_other);
            final int i16 = 0;
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.da0
                public final /* synthetic */ la0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zh.a5 a5Var;
                    zh.a5 a5Var2;
                    zh.a5 a5Var3;
                    zh.a5 a5Var4;
                    int i17;
                    int i18 = i16;
                    la0 la0Var = this.b;
                    switch (i18) {
                        case 0:
                            la0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = la0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                la0Var.Q.setEnabled(true);
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(booleanValue);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = la0Var.V.x1(null, null);
                            if (x12 != null) {
                                la0Var.Q.setEnabled(x12.booleanValue());
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(true);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = la0Var.L;
                            if (z10 && !la0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = la0Var.J;
                                int i19 = -la0Var.N;
                                la0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(g1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = la0Var.J;
                                boolean z11 = !z10;
                                la0Var.L = z11;
                                g1Var2.setChecked(z11);
                                ia0 ia0Var2 = la0Var.V;
                                boolean z12 = la0Var.L;
                                boolean z13 = la0Var.M;
                                pt0 pt0Var = ia0Var2.c0;
                                if (pt0Var != null && (a5Var2 = pt0Var.s) != null) {
                                    a5Var2.n = z12;
                                    a5Var2.o = z13;
                                    a5Var2.d(true);
                                }
                                ur0 ur0Var = ia0Var2.e0;
                                if (ur0Var != null && (a5Var = ur0Var.s) != null) {
                                    a5Var.n = z12;
                                    a5Var.o = z13;
                                    a5Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = la0Var.M;
                            if (z14 && !la0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = la0Var.K;
                                int i20 = -la0Var.N;
                                la0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = la0Var.K;
                                boolean z15 = !z14;
                                la0Var.M = z15;
                                g1Var4.setChecked(z15);
                                ia0 ia0Var3 = la0Var.V;
                                boolean z16 = la0Var.L;
                                boolean z17 = la0Var.M;
                                pt0 pt0Var2 = ia0Var3.c0;
                                if (pt0Var2 != null && (a5Var4 = pt0Var2.s) != null) {
                                    a5Var4.n = z16;
                                    a5Var4.o = z17;
                                    a5Var4.d(true);
                                }
                                ur0 ur0Var2 = ia0Var3.e0;
                                if (ur0Var2 != null && (a5Var3 = ur0Var2.s) != null) {
                                    a5Var3.n = z16;
                                    a5Var3.o = z17;
                                    a5Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            la0 la0Var2 = this.b;
                            bi.c1 c1Var = la0Var2.U;
                            if (c1Var != null) {
                                c1Var.run();
                                la0Var2.U = null;
                            }
                            pc.e();
                            boolean z18 = la0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (la0Var2.I != null) {
                                i17 = 0;
                                for (int i21 = 0; i21 < la0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) la0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i17++;
                                    }
                                }
                            } else {
                                i17 = 0;
                            }
                            la0Var2.V.L(false);
                            if (z18) {
                                la0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                la0Var2.getMessagesController().getStoriesController().n0(la0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                la0Var2.U = new bi.c1(la0Var2, arrayList, z18, 19);
                                org.telegram.ui.da daVar = new org.telegram.ui.da(la0Var2, zArr2, arrayList, zArr, 23);
                                (z18 ? wc.a0(la0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i17, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), daVar).j() : wc.a0(la0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i17, new Object[0]), LocaleController.getString("Undo"), 5000, false, daVar).j()).v = new hy(18, la0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.G.setVisibility(8);
            this.G.setAlpha(0.0f);
            frameLayout2.addView(this.G);
            org.telegram.ui.ActionBar.g1 e = this.G.e(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.P = e;
            final int i17 = 1;
            e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.da0
                public final /* synthetic */ la0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zh.a5 a5Var;
                    zh.a5 a5Var2;
                    zh.a5 a5Var3;
                    zh.a5 a5Var4;
                    int i172;
                    int i18 = i17;
                    la0 la0Var = this.b;
                    switch (i18) {
                        case 0:
                            la0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = la0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                la0Var.Q.setEnabled(true);
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(booleanValue);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = la0Var.V.x1(null, null);
                            if (x12 != null) {
                                la0Var.Q.setEnabled(x12.booleanValue());
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(true);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = la0Var.L;
                            if (z10 && !la0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = la0Var.J;
                                int i19 = -la0Var.N;
                                la0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(g1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = la0Var.J;
                                boolean z11 = !z10;
                                la0Var.L = z11;
                                g1Var2.setChecked(z11);
                                ia0 ia0Var2 = la0Var.V;
                                boolean z12 = la0Var.L;
                                boolean z13 = la0Var.M;
                                pt0 pt0Var = ia0Var2.c0;
                                if (pt0Var != null && (a5Var2 = pt0Var.s) != null) {
                                    a5Var2.n = z12;
                                    a5Var2.o = z13;
                                    a5Var2.d(true);
                                }
                                ur0 ur0Var = ia0Var2.e0;
                                if (ur0Var != null && (a5Var = ur0Var.s) != null) {
                                    a5Var.n = z12;
                                    a5Var.o = z13;
                                    a5Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = la0Var.M;
                            if (z14 && !la0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = la0Var.K;
                                int i20 = -la0Var.N;
                                la0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = la0Var.K;
                                boolean z15 = !z14;
                                la0Var.M = z15;
                                g1Var4.setChecked(z15);
                                ia0 ia0Var3 = la0Var.V;
                                boolean z16 = la0Var.L;
                                boolean z17 = la0Var.M;
                                pt0 pt0Var2 = ia0Var3.c0;
                                if (pt0Var2 != null && (a5Var4 = pt0Var2.s) != null) {
                                    a5Var4.n = z16;
                                    a5Var4.o = z17;
                                    a5Var4.d(true);
                                }
                                ur0 ur0Var2 = ia0Var3.e0;
                                if (ur0Var2 != null && (a5Var3 = ur0Var2.s) != null) {
                                    a5Var3.n = z16;
                                    a5Var3.o = z17;
                                    a5Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            la0 la0Var2 = this.b;
                            bi.c1 c1Var = la0Var2.U;
                            if (c1Var != null) {
                                c1Var.run();
                                la0Var2.U = null;
                            }
                            pc.e();
                            boolean z18 = la0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (la0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < la0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) la0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            la0Var2.V.L(false);
                            if (z18) {
                                la0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                la0Var2.getMessagesController().getStoriesController().n0(la0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                la0Var2.U = new bi.c1(la0Var2, arrayList, z18, 19);
                                org.telegram.ui.da daVar = new org.telegram.ui.da(la0Var2, zArr2, arrayList, zArr, 23);
                                (z18 ? wc.a0(la0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), daVar).j() : wc.a0(la0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, daVar).j()).v = new hy(18, la0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.g1 e7 = this.G.e(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.Q = e7;
            final int i18 = 2;
            e7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.da0
                public final /* synthetic */ la0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zh.a5 a5Var;
                    zh.a5 a5Var2;
                    zh.a5 a5Var3;
                    zh.a5 a5Var4;
                    int i172;
                    int i182 = i18;
                    la0 la0Var = this.b;
                    switch (i182) {
                        case 0:
                            la0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = la0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                la0Var.Q.setEnabled(true);
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(booleanValue);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = la0Var.V.x1(null, null);
                            if (x12 != null) {
                                la0Var.Q.setEnabled(x12.booleanValue());
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(true);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = la0Var.L;
                            if (z10 && !la0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = la0Var.J;
                                int i19 = -la0Var.N;
                                la0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(g1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = la0Var.J;
                                boolean z11 = !z10;
                                la0Var.L = z11;
                                g1Var2.setChecked(z11);
                                ia0 ia0Var2 = la0Var.V;
                                boolean z12 = la0Var.L;
                                boolean z13 = la0Var.M;
                                pt0 pt0Var = ia0Var2.c0;
                                if (pt0Var != null && (a5Var2 = pt0Var.s) != null) {
                                    a5Var2.n = z12;
                                    a5Var2.o = z13;
                                    a5Var2.d(true);
                                }
                                ur0 ur0Var = ia0Var2.e0;
                                if (ur0Var != null && (a5Var = ur0Var.s) != null) {
                                    a5Var.n = z12;
                                    a5Var.o = z13;
                                    a5Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = la0Var.M;
                            if (z14 && !la0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = la0Var.K;
                                int i20 = -la0Var.N;
                                la0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = la0Var.K;
                                boolean z15 = !z14;
                                la0Var.M = z15;
                                g1Var4.setChecked(z15);
                                ia0 ia0Var3 = la0Var.V;
                                boolean z16 = la0Var.L;
                                boolean z17 = la0Var.M;
                                pt0 pt0Var2 = ia0Var3.c0;
                                if (pt0Var2 != null && (a5Var4 = pt0Var2.s) != null) {
                                    a5Var4.n = z16;
                                    a5Var4.o = z17;
                                    a5Var4.d(true);
                                }
                                ur0 ur0Var2 = ia0Var3.e0;
                                if (ur0Var2 != null && (a5Var3 = ur0Var2.s) != null) {
                                    a5Var3.n = z16;
                                    a5Var3.o = z17;
                                    a5Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            la0 la0Var2 = this.b;
                            bi.c1 c1Var = la0Var2.U;
                            if (c1Var != null) {
                                c1Var.run();
                                la0Var2.U = null;
                            }
                            pc.e();
                            boolean z18 = la0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (la0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < la0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) la0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            la0Var2.V.L(false);
                            if (z18) {
                                la0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                la0Var2.getMessagesController().getStoriesController().n0(la0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                la0Var2.U = new bi.c1(la0Var2, arrayList, z18, 19);
                                org.telegram.ui.da daVar = new org.telegram.ui.da(la0Var2, zArr2, arrayList, zArr, 23);
                                (z18 ? wc.a0(la0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), daVar).j() : wc.a0(la0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, daVar).j()).v = new hy(18, la0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.g1 e10 = this.G.e(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.O = e10;
            e10.setEnabled(false);
            this.O.setAlpha(0.5f);
            this.G.a(-1);
            org.telegram.ui.ActionBar.w0 w0Var4 = this.G;
            org.telegram.ui.ActionBar.g1 d = w0Var4.d(6, 0, null, LocaleController.getString(R.string.MediaShowPhotos), true, true, w0Var4.m0);
            this.J = d;
            d.setChecked(this.L);
            final int i19 = 3;
            this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.da0
                public final /* synthetic */ la0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zh.a5 a5Var;
                    zh.a5 a5Var2;
                    zh.a5 a5Var3;
                    zh.a5 a5Var4;
                    int i172;
                    int i182 = i19;
                    la0 la0Var = this.b;
                    switch (i182) {
                        case 0:
                            la0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = la0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                la0Var.Q.setEnabled(true);
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(booleanValue);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = la0Var.V.x1(null, null);
                            if (x12 != null) {
                                la0Var.Q.setEnabled(x12.booleanValue());
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(true);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = la0Var.L;
                            if (z10 && !la0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = la0Var.J;
                                int i192 = -la0Var.N;
                                la0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(g1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = la0Var.J;
                                boolean z11 = !z10;
                                la0Var.L = z11;
                                g1Var2.setChecked(z11);
                                ia0 ia0Var2 = la0Var.V;
                                boolean z12 = la0Var.L;
                                boolean z13 = la0Var.M;
                                pt0 pt0Var = ia0Var2.c0;
                                if (pt0Var != null && (a5Var2 = pt0Var.s) != null) {
                                    a5Var2.n = z12;
                                    a5Var2.o = z13;
                                    a5Var2.d(true);
                                }
                                ur0 ur0Var = ia0Var2.e0;
                                if (ur0Var != null && (a5Var = ur0Var.s) != null) {
                                    a5Var.n = z12;
                                    a5Var.o = z13;
                                    a5Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = la0Var.M;
                            if (z14 && !la0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = la0Var.K;
                                int i20 = -la0Var.N;
                                la0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = la0Var.K;
                                boolean z15 = !z14;
                                la0Var.M = z15;
                                g1Var4.setChecked(z15);
                                ia0 ia0Var3 = la0Var.V;
                                boolean z16 = la0Var.L;
                                boolean z17 = la0Var.M;
                                pt0 pt0Var2 = ia0Var3.c0;
                                if (pt0Var2 != null && (a5Var4 = pt0Var2.s) != null) {
                                    a5Var4.n = z16;
                                    a5Var4.o = z17;
                                    a5Var4.d(true);
                                }
                                ur0 ur0Var2 = ia0Var3.e0;
                                if (ur0Var2 != null && (a5Var3 = ur0Var2.s) != null) {
                                    a5Var3.n = z16;
                                    a5Var3.o = z17;
                                    a5Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            la0 la0Var2 = this.b;
                            bi.c1 c1Var = la0Var2.U;
                            if (c1Var != null) {
                                c1Var.run();
                                la0Var2.U = null;
                            }
                            pc.e();
                            boolean z18 = la0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (la0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < la0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) la0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            la0Var2.V.L(false);
                            if (z18) {
                                la0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                la0Var2.getMessagesController().getStoriesController().n0(la0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                la0Var2.U = new bi.c1(la0Var2, arrayList, z18, 19);
                                org.telegram.ui.da daVar = new org.telegram.ui.da(la0Var2, zArr2, arrayList, zArr, 23);
                                (z18 ? wc.a0(la0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), daVar).j() : wc.a0(la0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, daVar).j()).v = new hy(18, la0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.w0 w0Var5 = this.G;
            org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(7, 0, null, LocaleController.getString(R.string.MediaShowVideos), true, true, w0Var5.m0);
            this.K = d10;
            d10.setChecked(this.M);
            final int i20 = 4;
            this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.da0
                public final /* synthetic */ la0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zh.a5 a5Var;
                    zh.a5 a5Var2;
                    zh.a5 a5Var3;
                    zh.a5 a5Var4;
                    int i172;
                    int i182 = i20;
                    la0 la0Var = this.b;
                    switch (i182) {
                        case 0:
                            la0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = la0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                la0Var.Q.setEnabled(true);
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(booleanValue);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = la0Var.V.x1(null, null);
                            if (x12 != null) {
                                la0Var.Q.setEnabled(x12.booleanValue());
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(true);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = la0Var.L;
                            if (z10 && !la0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = la0Var.J;
                                int i192 = -la0Var.N;
                                la0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(g1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = la0Var.J;
                                boolean z11 = !z10;
                                la0Var.L = z11;
                                g1Var2.setChecked(z11);
                                ia0 ia0Var2 = la0Var.V;
                                boolean z12 = la0Var.L;
                                boolean z13 = la0Var.M;
                                pt0 pt0Var = ia0Var2.c0;
                                if (pt0Var != null && (a5Var2 = pt0Var.s) != null) {
                                    a5Var2.n = z12;
                                    a5Var2.o = z13;
                                    a5Var2.d(true);
                                }
                                ur0 ur0Var = ia0Var2.e0;
                                if (ur0Var != null && (a5Var = ur0Var.s) != null) {
                                    a5Var.n = z12;
                                    a5Var.o = z13;
                                    a5Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = la0Var.M;
                            if (z14 && !la0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = la0Var.K;
                                int i202 = -la0Var.N;
                                la0Var.N = i202;
                                AndroidUtilities.shakeViewSpring(g1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = la0Var.K;
                                boolean z15 = !z14;
                                la0Var.M = z15;
                                g1Var4.setChecked(z15);
                                ia0 ia0Var3 = la0Var.V;
                                boolean z16 = la0Var.L;
                                boolean z17 = la0Var.M;
                                pt0 pt0Var2 = ia0Var3.c0;
                                if (pt0Var2 != null && (a5Var4 = pt0Var2.s) != null) {
                                    a5Var4.n = z16;
                                    a5Var4.o = z17;
                                    a5Var4.d(true);
                                }
                                ur0 ur0Var2 = ia0Var3.e0;
                                if (ur0Var2 != null && (a5Var3 = ur0Var2.s) != null) {
                                    a5Var3.n = z16;
                                    a5Var3.o = z17;
                                    a5Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            la0 la0Var2 = this.b;
                            bi.c1 c1Var = la0Var2.U;
                            if (c1Var != null) {
                                c1Var.run();
                                la0Var2.U = null;
                            }
                            pc.e();
                            boolean z18 = la0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (la0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < la0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) la0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            la0Var2.V.L(false);
                            if (z18) {
                                la0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                la0Var2.getMessagesController().getStoriesController().n0(la0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                la0Var2.U = new bi.c1(la0Var2, arrayList, z18, 19);
                                org.telegram.ui.da daVar = new org.telegram.ui.da(la0Var2, zArr2, arrayList, zArr, 23);
                                (z18 ? wc.a0(la0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), daVar).j() : wc.a0(la0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, daVar).j()).v = new hy(18, la0Var2, zArr2);
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
        frameLayout.addView(frameLayout3, w7.a6.e(-1, -1, 119));
        int i22 = 0;
        while (true) {
            int i23 = this.a == 1 ? 2 : 1;
            o6VarArr = this.x;
            l5VarArr = this.w;
            if (i22 >= i23) {
                break;
            }
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout[] frameLayoutArr = this.v;
            frameLayoutArr[i22] = frameLayout4;
            this.s.addView(frameLayout4, w7.a6.e(-1, -1, i21));
            org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
            l5VarArr[i22] = l5Var2;
            l5Var2.setPivotX(0.0f);
            l5VarArr[i22].setPivotY(AndroidUtilities.dp(9.0f));
            l5VarArr[i22].setTextSize(18);
            l5VarArr[i22].setGravity(3);
            l5VarArr[i22].setTypeface(AndroidUtilities.bold());
            l5VarArr[i22].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            l5VarArr[i22].setScrollNonFitText(true);
            l5VarArr[i22].setImportantForAccessibility(2);
            frameLayoutArr[i22].addView(l5VarArr[i22], w7.a6.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            o6 o6Var = new o6(context, true, true, true);
            o6VarArr[i22] = o6Var;
            o6Var.b(0.4f, 320L, wr.h);
            o6VarArr[i22].setTextSize(AndroidUtilities.dp(14.0f));
            o6VarArr[i22].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
            frameLayoutArr[i22].addView(o6VarArr[i22], w7.a6.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i22 != 0) {
                frameLayoutArr[i22].setAlpha(0.0f);
            }
            i22++;
            i21 = 119;
        }
        ga0 ga0Var = new ga0(context);
        this.y = ga0Var;
        ga0Var.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.y.setRoundRadius(AndroidUtilities.dp((this.e == getUserConfig().getClientUserId() && this.f == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.y.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        g9 g9Var3 = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var3.l = true;
        this.y.setVisibility(z10 ? 0 : 8);
        this.y.setImageDrawable(g9Var3);
        frameLayout.addView(this.y, w7.a6.d(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        o6 o6Var2 = new o6(context, true, true, true);
        this.F = o6Var2;
        o6Var2.b(0.4f, 320L, wr.h);
        this.F.setTextSize(AndroidUtilities.dp(20.0f));
        this.F.setGravity(3);
        o6 o6Var3 = this.F;
        int i24 = org.telegram.ui.ActionBar.j6.G6;
        o6Var3.setTextColor(getThemedColor(i24));
        this.F.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.F, w7.a6.d(-2, -1.0f, 23, (z10 ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.a == 1) {
            ka0 ka0Var = new ka0(context, getResourceProvider());
            this.R = ka0Var;
            ka0Var.setOnTabClick(new y2(this, 6));
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.S = frameLayout5;
            frameLayout5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            this.S.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            bi.d dVar = new bi.d(context, getResourceProvider(), true);
            this.T = dVar;
            dVar.g(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.T.setShowZero(true);
            this.T.b(0, false);
            this.T.setEnabled(false);
            final int i25 = 5;
            this.T.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.da0
                public final /* synthetic */ la0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zh.a5 a5Var;
                    zh.a5 a5Var2;
                    zh.a5 a5Var3;
                    zh.a5 a5Var4;
                    int i172;
                    int i182 = i25;
                    la0 la0Var = this.b;
                    switch (i182) {
                        case 0:
                            la0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = la0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                la0Var.Q.setEnabled(true);
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(booleanValue);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = la0Var.V.x1(null, null);
                            if (x12 != null) {
                                la0Var.Q.setEnabled(x12.booleanValue());
                                la0Var.Q.animate().alpha(la0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                la0Var.P.setEnabled(true);
                                la0Var.P.animate().alpha(la0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z102 = la0Var.L;
                            if (z102 && !la0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = la0Var.J;
                                int i192 = -la0Var.N;
                                la0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(g1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = la0Var.J;
                                boolean z11 = !z102;
                                la0Var.L = z11;
                                g1Var2.setChecked(z11);
                                ia0 ia0Var2 = la0Var.V;
                                boolean z12 = la0Var.L;
                                boolean z13 = la0Var.M;
                                pt0 pt0Var = ia0Var2.c0;
                                if (pt0Var != null && (a5Var2 = pt0Var.s) != null) {
                                    a5Var2.n = z12;
                                    a5Var2.o = z13;
                                    a5Var2.d(true);
                                }
                                ur0 ur0Var = ia0Var2.e0;
                                if (ur0Var != null && (a5Var = ur0Var.s) != null) {
                                    a5Var.n = z12;
                                    a5Var.o = z13;
                                    a5Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = la0Var.M;
                            if (z14 && !la0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = la0Var.K;
                                int i202 = -la0Var.N;
                                la0Var.N = i202;
                                AndroidUtilities.shakeViewSpring(g1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = la0Var.K;
                                boolean z15 = !z14;
                                la0Var.M = z15;
                                g1Var4.setChecked(z15);
                                ia0 ia0Var3 = la0Var.V;
                                boolean z16 = la0Var.L;
                                boolean z17 = la0Var.M;
                                pt0 pt0Var2 = ia0Var3.c0;
                                if (pt0Var2 != null && (a5Var4 = pt0Var2.s) != null) {
                                    a5Var4.n = z16;
                                    a5Var4.o = z17;
                                    a5Var4.d(true);
                                }
                                ur0 ur0Var2 = ia0Var3.e0;
                                if (ur0Var2 != null && (a5Var3 = ur0Var2.s) != null) {
                                    a5Var3.n = z16;
                                    a5Var3.o = z17;
                                    a5Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            la0 la0Var2 = this.b;
                            bi.c1 c1Var = la0Var2.U;
                            if (c1Var != null) {
                                c1Var.run();
                                la0Var2.U = null;
                            }
                            pc.e();
                            boolean z18 = la0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (la0Var2.I != null) {
                                i172 = 0;
                                for (int i212 = 0; i212 < la0Var2.I.size(); i212++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) la0Var2.I.valueAt(i212)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            la0Var2.V.L(false);
                            if (z18) {
                                la0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i222 = 0; i222 < arrayList.size(); i222++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i222);
                                    zArr[i222] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                la0Var2.getMessagesController().getStoriesController().n0(la0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                la0Var2.U = new bi.c1(la0Var2, arrayList, z18, 19);
                                org.telegram.ui.da daVar = new org.telegram.ui.da(la0Var2, zArr2, arrayList, zArr, 23);
                                (z18 ? wc.a0(la0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), daVar).j() : wc.a0(la0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, daVar).j()).v = new hy(18, la0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.S.addView(this.T);
            this.S.setAlpha(0.0f);
            this.S.setTranslationY(AndroidUtilities.dp(100.0f));
            setBulletinDelegate(new bi.fa(7));
        }
        if (this.a == 0 && this.e == getUserConfig().getClientUserId() && this.f == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.W = 11;
        }
        ia0 ia0Var2 = new ia0(this, context, this.e, this.b, this.c, this.d, this.W, this, new ha0(this), getResourceProvider(), frameLayout, fa0Var);
        this.V = ia0Var2;
        ia0Var2.I0.setOpen(true);
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
            fa0Var.addView(this.V, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            fa0Var.addView(this.V);
        }
        fa0Var.addView(this.actionBar);
        fa0Var.addView(frameLayout);
        fa0Var.T.add(this.V);
        if (this.a == 1) {
            Y(0, false, false);
            Y(1, false, false);
        }
        ka0 ka0Var2 = this.R;
        if (ka0Var2 != null) {
            i10 = -1;
            fa0Var.addView(ka0Var2, w7.a6.e(-1, -2, 87));
        } else {
            i10 = -1;
        }
        FrameLayout frameLayout6 = this.S;
        if (frameLayout6 != null) {
            fa0Var.addView(frameLayout6, w7.a6.e(i10, 64, 87));
        }
        long j3 = this.e;
        if (this.f != 0 && j3 == getUserConfig().getClientUserId()) {
            j3 = this.f;
        }
        int i27 = this.a;
        if (i27 == 3) {
            l5VarArr[0].k(this.h);
            int i28 = this.r;
            if (i28 != i10) {
                o6VarArr[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", i28));
            }
        } else if (i27 == 2) {
            l5VarArr[0].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        } else {
            if (i27 != 1) {
                if (j3 == UserObject.ANONYMOUS) {
                    l5VarArr[0].k(LocaleController.getString(R.string.AnonymousForward));
                    g9 g9Var4 = g9Var3;
                    g9Var4.g(21);
                    g9Var4.p = 0.75f;
                    g9Var2 = g9Var4;
                } else {
                    g9 g9Var5 = g9Var3;
                    if (this.f == 0 || j3 != getUserConfig().getClientUserId()) {
                        if (DialogObject.isEncryptedDialog(j3)) {
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.a2.m(getMessagesController(), j3);
                            g9Var2 = g9Var5;
                            if (m10 != null) {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(m10.user_id));
                                g9Var2 = g9Var5;
                                if (user3 != null) {
                                    l5VarArr[0].k(ContactsController.formatName(user3.first_name, user3.last_name));
                                    g9Var5.m(this.currentAccount, user3);
                                    user = user3;
                                    user2 = user;
                                    g9Var = g9Var5;
                                }
                            }
                        } else if (DialogObject.isUserDialog(j3)) {
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
                            g9Var2 = g9Var5;
                            if (user4 != null) {
                                if (user4.self) {
                                    l5VarArr[0].k(LocaleController.getString(R.string.SavedMessages));
                                    g9Var5.g(1);
                                    g9Var5.p = 0.8f;
                                    g9Var2 = g9Var5;
                                } else {
                                    l5VarArr[0].k(ContactsController.formatName(user4.first_name, user4.last_name));
                                    g9Var5.m(this.currentAccount, user4);
                                    user = user4;
                                    user2 = user;
                                    g9Var = g9Var5;
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
                            g9Var2 = g9Var5;
                            if (chat != 0) {
                                l5VarArr[0].k(chat.title);
                                g9Var5.k(this.currentAccount, chat);
                                user = chat;
                                user2 = user;
                                g9Var = g9Var5;
                            }
                        }
                        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", g9Var, user2);
                        l5Var = l5VarArr[0];
                        if (l5Var != null && TextUtils.isEmpty(l5Var.getText())) {
                            l5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                        }
                        ia0Var = this.V;
                        if (ia0Var.s0(ia0Var.k0[0].F) && this.a != 1) {
                            this.V.getSearchItem().setVisibility(0);
                        }
                        w0Var = this.V.m0;
                        if (w0Var != null) {
                            i11 = 11;
                            if (this.W != 11) {
                                w0Var.setVisibility(8);
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
                        au0[] au0VarArr = this.V.k0;
                        i12 = au0VarArr[r10].F;
                        if ((i12 != 0 || iv0.p0(i12) || au0VarArr[r10].F == i11) && this.a != 1) {
                            this.V.r0.setVisibility(r10);
                        } else {
                            this.V.r0.setVisibility(4);
                        }
                        this.actionBar.setDrawBlurBackground(fa0Var);
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                        a0();
                        Z();
                        if (this.a == 1 && this.W == 9) {
                            this.V.M0(9.0f);
                        }
                        return fa0Var;
                    }
                    l5VarArr[0].k(LocaleController.getString(R.string.MyNotes));
                    g9Var5.g(22);
                    g9Var5.p = 0.75f;
                    g9Var2 = g9Var5;
                }
                user2 = null;
                g9Var = g9Var2;
                this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", g9Var, user2);
                l5Var = l5VarArr[0];
                if (l5Var != null) {
                    l5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                }
                ia0Var = this.V;
                if (ia0Var.s0(ia0Var.k0[0].F)) {
                    this.V.getSearchItem().setVisibility(0);
                }
                w0Var = this.V.m0;
                if (w0Var != null) {
                }
                if (this.V.getSearchOptionsItem() != null) {
                }
                r10 = 0;
                au0[] au0VarArr2 = this.V.k0;
                i12 = au0VarArr2[r10].F;
                if (i12 != 0) {
                }
                this.V.r0.setVisibility(r10);
                this.actionBar.setDrawBlurBackground(fa0Var);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                a0();
                Z();
                if (this.a == 1) {
                    this.V.M0(9.0f);
                }
                return fa0Var;
            }
            l5VarArr[0].k(LocaleController.getString(R.string.ProfileMyStories));
            l5VarArr[1].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        }
        g9Var2 = g9Var3;
        user2 = null;
        g9Var = g9Var2;
        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", g9Var, user2);
        l5Var = l5VarArr[0];
        if (l5Var != null) {
        }
        ia0Var = this.V;
        if (ia0Var.s0(ia0Var.k0[0].F)) {
        }
        w0Var = this.V.m0;
        if (w0Var != null) {
        }
        if (this.V.getSearchOptionsItem() != null) {
        }
        r10 = 0;
        au0[] au0VarArr22 = this.V.k0;
        i12 = au0VarArr22[r10].F;
        if (i12 != 0) {
        }
        this.V.r0.setVisibility(r10);
        this.actionBar.setDrawBlurBackground(fa0Var);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
        a0();
        Z();
        if (this.a == 1) {
        }
        return fa0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            ia0 ia0Var = this.V;
            if (ia0Var != null) {
                ia0Var.setUserInfo(userFull);
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
        x6 x6Var = new x6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.G6));
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
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

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.V.x0()) {
            return false;
        }
        ia0 ia0Var = this.V;
        return ia0Var.getSelectedTab() == ia0Var.I0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            ia0 ia0Var = this.V;
            if (!ia0Var.C1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                ia0Var.L(false);
            }
        } else if (z10) {
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
            this.b = new av0(this);
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
        bi.c1 c1Var = this.U;
        if (c1Var != null) {
            this.U = null;
            AndroidUtilities.runOnUIThread(c1Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ia0 ia0Var = this.V;
        if (ia0Var != null) {
            ia0Var.setPagesPaddingBottom(i13);
        }
    }

    @Override // lg.b
    public final List z() {
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = og.p1.m;
        return Arrays.asList(new lg.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new dq(this, 26)));
    }
}
