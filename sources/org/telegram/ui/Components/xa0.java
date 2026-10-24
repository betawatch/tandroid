package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xa0 extends org.telegram.ui.ActionBar.o2 implements qv0, ng.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.h2 E;
    public q6 F;
    public org.telegram.ui.ActionBar.u0 G;
    public org.telegram.ui.ActionBar.u0 H;
    public SparseArray I;
    public org.telegram.ui.ActionBar.e1 J;
    public org.telegram.ui.ActionBar.e1 K;
    public boolean L;
    public boolean M;
    public int N;
    public org.telegram.ui.ActionBar.e1 O;
    public org.telegram.ui.ActionBar.e1 P;
    public org.telegram.ui.ActionBar.e1 Q;
    public wa0 R;
    public FrameLayout S;
    public ei.d T;
    public ai.y7 U;
    public ua0 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int a;
    public final boolean[] a0;
    public pv0 b;
    public final ValueAnimator[] b0;
    public TLRPC.ChatFull c;
    public PorterDuffColorFilter c0;
    public TLRPC.UserFull d;
    public int d0;
    public long e;
    public int e0;
    public long f;
    public int f0;
    public int g0;
    public String h;
    public int h0;
    public String n;
    public int r;
    public FrameLayout s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.n5[] w;
    public final q6[] x;
    public sa0 y;

    public xa0(Bundle bundle, pv0 pv0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.w = new org.telegram.ui.ActionBar.n5[2];
        this.x = new q6[2];
        this.L = true;
        this.M = true;
        this.N = -12;
        this.Y = new boolean[2];
        this.Z = new float[2];
        this.a0 = new boolean[]{true, true};
        this.b0 = new ValueAnimator[2];
        this.b = pv0Var;
    }

    @Override // ng.b
    public final List B() {
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = qg.m1.m;
        return Arrays.asList(new ng.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new zp(this, 28)));
    }

    @Override // org.telegram.ui.Components.qv0
    public final void M() {
        pv0 pv0Var;
        ua0 ua0Var = this.V;
        if (ua0Var != null && (pv0Var = this.b) != null) {
            ua0Var.setNewMediaCounts(pv0Var.c);
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
                org.telegram.ui.ActionBar.n5[] n5VarArr = this.w;
                n5VarArr[i10].setScaleX(z10 ? 1.0f : 1.111f);
                n5VarArr[i10].setScaleY(z10 ? 1.0f : 1.111f);
                n5VarArr[i10].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                q6VarArr[i10].setAlpha(z10 ? 1.0f : 0.0f);
                q6VarArr[i10].setVisibility(z10 ? 0 : 8);
                return;
            }
            q6VarArr[i10].setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i10], z10 ? 1.0f : 0.0f);
            valueAnimatorArr[i10] = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.r2(this, i10, 5));
            valueAnimatorArr[i10].addListener(new va0(this, i10, z10, r5));
            valueAnimatorArr[i10].setDuration(320L);
            valueAnimatorArr[i10].setInterpolator(bs.h);
            valueAnimatorArr[i10].start();
        }
    }

    public final void Z() {
        if (this.V.getSearchOptionsItem() != null) {
            bk0 searchOptionsItem = this.V.getSearchOptionsItem();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G6);
            if (searchOptionsItem.getColorFilter() == null || searchOptionsItem.getColorFilter() != this.c0 || themedColor != this.d0) {
                this.d0 = themedColor;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                this.c0 = porterDuffColorFilter;
                searchOptionsItem.setColorFilter(porterDuffColorFilter);
            }
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        kVar.B(org.telegram.ui.ActionBar.k6.x0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.k6.x0(null, i10, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.w;
        org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[0];
        if (n5Var != null) {
            n5Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        }
        org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[1];
        if (n5Var2 != null) {
            n5Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        boolean z10;
        qu0 qu0Var;
        ua0 ua0Var = this.V;
        if (ua0Var != null) {
            q6[] q6VarArr = this.x;
            if (q6VarArr[0] == null) {
                return;
            }
            int closestTab = ua0Var.getClosestTab();
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
                org.telegram.ui.ActionBar.e1 e1Var = this.Q;
                if (e1Var != null) {
                    e1Var.setEnabled(this.V.F());
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.Q;
                    e1Var2.setAlpha(e1Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.e1 e1Var3 = this.P;
                if (e1Var3 != null) {
                    ua0 ua0Var2 = this.V;
                    qu0[] qu0VarArr = ua0Var2.k0;
                    if (qu0VarArr != null && (qu0Var = qu0VarArr[0]) != null) {
                        boolean r02 = xv0.r0(qu0Var.F);
                        int i12 = ua0Var2.m1[r02 ? 1 : 0];
                        if (i12 != ua0Var2.Y(r02 ? 1 : 0, i12, true)) {
                            z10 = true;
                            e1Var3.setEnabled(z10);
                            org.telegram.ui.ActionBar.e1 e1Var4 = this.P;
                            e1Var4.setAlpha(!e1Var4.isEnabled() ? 1.0f : 0.5f);
                        }
                    }
                    z10 = false;
                    e1Var3.setEnabled(z10);
                    org.telegram.ui.ActionBar.e1 e1Var42 = this.P;
                    e1Var42.setAlpha(!e1Var42.isEnabled() ? 1.0f : 0.5f);
                }
                int d02 = this.V.d0(8);
                if (d02 <= 0) {
                    Y(0, false, true);
                } else if (this.a != 3) {
                    Y(0, true, true);
                    q6VarArr[0].c(LocaleController.formatPluralString("ProfileMyStoriesCount", d02, new Object[0]), z12, true);
                } else if (TextUtils.isEmpty(q6VarArr[0].getText())) {
                    Y(0, true, true);
                    q6VarArr[0].c(LocaleController.formatPluralStringSpaced("FoundStories", d02), z12, true);
                }
                if (this.a == 1) {
                    int d03 = this.V.d0(9);
                    if (d03 > 0) {
                        Y(1, true, true);
                        q6VarArr[1].c(LocaleController.formatPluralString("ProfileStoriesArchiveCount", d03, new Object[0]), z12, true);
                    } else {
                        Y(1, false, true);
                    }
                }
                if (this.G != null) {
                    ua0 ua0Var3 = this.V;
                    boolean z13 = ua0Var3.d0(ua0Var3.getClosestTab()) <= 0;
                    if (!z13) {
                        this.G.setVisibility(0);
                    }
                    this.G.animate().alpha(z13 ? 0.0f : 1.0f).withEndAction(new b60(1, this, z13)).setDuration(220L).setInterpolator(bs.h).start();
                }
                ei.d dVar = this.T;
                if (dVar != null) {
                    boolean z14 = !z11 && this.X == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.I;
                        dVar.i(LocaleController.formatPluralString("ArchiveStories", sparseArray == null ? 0 : sparseArray.size(), new Object[0]), z14, true);
                    } else {
                        dVar.i(LocaleController.getString(R.string.SaveToProfile), z14, true);
                    }
                    this.X = closestTab;
                }
                if (this.O != null) {
                    boolean z15 = this.V.d0(closestTab) > 0;
                    this.O.setEnabled(z15);
                    this.O.setAlpha(z15 ? 1.0f : 0.5f);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        if (this.V.A0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0690  */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v49 */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        q6[] q6VarArr;
        org.telegram.ui.ActionBar.n5[] n5VarArr;
        int i10;
        TLRPC.User user;
        h9 h9Var;
        org.telegram.ui.ActionBar.n5 n5Var;
        ua0 ua0Var;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i11;
        ?? r32;
        int i12;
        h9 h9Var2;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.E = h2Var;
        kVar.setBackButtonDrawable(h2Var);
        this.E.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new qa0(this));
        FrameLayout frameLayout = new FrameLayout(context);
        ra0 ra0Var = new ra0(this, context, frameLayout, 0);
        ra0Var.N = true;
        this.fragmentView = ra0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, ra0Var, getResourceProvider());
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        int i13 = this.a;
        if (i13 == 1 || i13 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.actionBar.addView(frameLayout2, w7.z5.e(56, 56, 85));
            int i14 = org.telegram.ui.ActionBar.k6.z8;
            int themedColor = getThemedColor(i14);
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, m10, themedColor, getThemedColor(i15));
            this.H = u0Var2;
            Drawable background = u0Var2.getBackground();
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
            org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
            u0Var2.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(u0Var2, background, null, O, resourceProvider);
            this.H.setIcon(R.drawable.msg_delete);
            this.H.setVisibility(8);
            this.H.setAlpha(0.0f);
            this.H.setOnClickListener(new v80(m10, 1));
            frameLayout2.addView(this.H);
            org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, m10, getThemedColor(i14), getThemedColor(i15));
            this.G = u0Var3;
            Drawable background2 = u0Var3.getBackground();
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i14);
            org.telegram.ui.ActionBar.g6 resourceProvider2 = getResourceProvider();
            u0Var3.setBackground(background2);
            org.telegram.ui.ActionBar.r6.k(u0Var3, background2, null, O2, resourceProvider2);
            this.G.setIcon(R.drawable.ic_ab_other);
            final int i16 = 0;
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pa0
                public final /* synthetic */ xa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ci.z6 z6Var;
                    ci.z6 z6Var2;
                    ci.z6 z6Var3;
                    ci.z6 z6Var4;
                    int i17;
                    int i18 = i16;
                    xa0 xa0Var = this.b;
                    switch (i18) {
                        case 0:
                            xa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean B1 = xa0Var.V.B1(null, null);
                            if (B1 != null) {
                                boolean booleanValue = B1.booleanValue();
                                xa0Var.Q.setEnabled(true);
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(booleanValue);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean C1 = xa0Var.V.C1(null, null);
                            if (C1 != null) {
                                xa0Var.Q.setEnabled(C1.booleanValue());
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(true);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = xa0Var.L;
                            if (z10 && !xa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = xa0Var.J;
                                int i19 = -xa0Var.N;
                                xa0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(e1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = xa0Var.J;
                                boolean z11 = !z10;
                                xa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ua0 ua0Var2 = xa0Var.V;
                                boolean z12 = xa0Var.L;
                                boolean z13 = xa0Var.M;
                                fu0 fu0Var = ua0Var2.c0;
                                if (fu0Var != null && (z6Var2 = fu0Var.s) != null) {
                                    z6Var2.n = z12;
                                    z6Var2.o = z13;
                                    z6Var2.d(true);
                                }
                                ls0 ls0Var = ua0Var2.e0;
                                if (ls0Var != null && (z6Var = ls0Var.s) != null) {
                                    z6Var.n = z12;
                                    z6Var.o = z13;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = xa0Var.M;
                            if (z14 && !xa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = xa0Var.K;
                                int i20 = -xa0Var.N;
                                xa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(e1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = xa0Var.K;
                                boolean z15 = !z14;
                                xa0Var.M = z15;
                                e1Var4.setChecked(z15);
                                ua0 ua0Var3 = xa0Var.V;
                                boolean z16 = xa0Var.L;
                                boolean z17 = xa0Var.M;
                                fu0 fu0Var2 = ua0Var3.c0;
                                if (fu0Var2 != null && (z6Var4 = fu0Var2.s) != null) {
                                    z6Var4.n = z16;
                                    z6Var4.o = z17;
                                    z6Var4.d(true);
                                }
                                ls0 ls0Var2 = ua0Var3.e0;
                                if (ls0Var2 != null && (z6Var3 = ls0Var2.s) != null) {
                                    z6Var3.n = z16;
                                    z6Var3.o = z17;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            xa0 xa0Var2 = this.b;
                            ai.y7 y7Var = xa0Var2.U;
                            if (y7Var != null) {
                                y7Var.run();
                                xa0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = xa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (xa0Var2.I != null) {
                                i17 = 0;
                                for (int i21 = 0; i21 < xa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) xa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i17++;
                                    }
                                }
                            } else {
                                i17 = 0;
                            }
                            xa0Var2.V.M(false);
                            if (z18) {
                                xa0Var2.V.b1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                xa0Var2.getMessagesController().getStoriesController().n0(xa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                xa0Var2.U = new ai.y7(xa0Var2, arrayList, z18, 21);
                                j90 j90Var = new j90(xa0Var2, zArr2, arrayList, zArr, 1);
                                (z18 ? xc.a0(xa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i17, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), j90Var).j() : xc.a0(xa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i17, new Object[0]), LocaleController.getString("Undo"), 5000, false, j90Var).j()).v = new yt(22, xa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.G.setVisibility(8);
            this.G.setAlpha(0.0f);
            frameLayout2.addView(this.G);
            org.telegram.ui.ActionBar.e1 e = this.G.e(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.P = e;
            final int i17 = 1;
            e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pa0
                public final /* synthetic */ xa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ci.z6 z6Var;
                    ci.z6 z6Var2;
                    ci.z6 z6Var3;
                    ci.z6 z6Var4;
                    int i172;
                    int i18 = i17;
                    xa0 xa0Var = this.b;
                    switch (i18) {
                        case 0:
                            xa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean B1 = xa0Var.V.B1(null, null);
                            if (B1 != null) {
                                boolean booleanValue = B1.booleanValue();
                                xa0Var.Q.setEnabled(true);
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(booleanValue);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean C1 = xa0Var.V.C1(null, null);
                            if (C1 != null) {
                                xa0Var.Q.setEnabled(C1.booleanValue());
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(true);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = xa0Var.L;
                            if (z10 && !xa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = xa0Var.J;
                                int i19 = -xa0Var.N;
                                xa0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(e1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = xa0Var.J;
                                boolean z11 = !z10;
                                xa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ua0 ua0Var2 = xa0Var.V;
                                boolean z12 = xa0Var.L;
                                boolean z13 = xa0Var.M;
                                fu0 fu0Var = ua0Var2.c0;
                                if (fu0Var != null && (z6Var2 = fu0Var.s) != null) {
                                    z6Var2.n = z12;
                                    z6Var2.o = z13;
                                    z6Var2.d(true);
                                }
                                ls0 ls0Var = ua0Var2.e0;
                                if (ls0Var != null && (z6Var = ls0Var.s) != null) {
                                    z6Var.n = z12;
                                    z6Var.o = z13;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = xa0Var.M;
                            if (z14 && !xa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = xa0Var.K;
                                int i20 = -xa0Var.N;
                                xa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(e1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = xa0Var.K;
                                boolean z15 = !z14;
                                xa0Var.M = z15;
                                e1Var4.setChecked(z15);
                                ua0 ua0Var3 = xa0Var.V;
                                boolean z16 = xa0Var.L;
                                boolean z17 = xa0Var.M;
                                fu0 fu0Var2 = ua0Var3.c0;
                                if (fu0Var2 != null && (z6Var4 = fu0Var2.s) != null) {
                                    z6Var4.n = z16;
                                    z6Var4.o = z17;
                                    z6Var4.d(true);
                                }
                                ls0 ls0Var2 = ua0Var3.e0;
                                if (ls0Var2 != null && (z6Var3 = ls0Var2.s) != null) {
                                    z6Var3.n = z16;
                                    z6Var3.o = z17;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            xa0 xa0Var2 = this.b;
                            ai.y7 y7Var = xa0Var2.U;
                            if (y7Var != null) {
                                y7Var.run();
                                xa0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = xa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (xa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < xa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) xa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            xa0Var2.V.M(false);
                            if (z18) {
                                xa0Var2.V.b1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                xa0Var2.getMessagesController().getStoriesController().n0(xa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                xa0Var2.U = new ai.y7(xa0Var2, arrayList, z18, 21);
                                j90 j90Var = new j90(xa0Var2, zArr2, arrayList, zArr, 1);
                                (z18 ? xc.a0(xa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), j90Var).j() : xc.a0(xa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, j90Var).j()).v = new yt(22, xa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.e1 e7 = this.G.e(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.Q = e7;
            final int i18 = 2;
            e7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pa0
                public final /* synthetic */ xa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ci.z6 z6Var;
                    ci.z6 z6Var2;
                    ci.z6 z6Var3;
                    ci.z6 z6Var4;
                    int i172;
                    int i182 = i18;
                    xa0 xa0Var = this.b;
                    switch (i182) {
                        case 0:
                            xa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean B1 = xa0Var.V.B1(null, null);
                            if (B1 != null) {
                                boolean booleanValue = B1.booleanValue();
                                xa0Var.Q.setEnabled(true);
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(booleanValue);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean C1 = xa0Var.V.C1(null, null);
                            if (C1 != null) {
                                xa0Var.Q.setEnabled(C1.booleanValue());
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(true);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = xa0Var.L;
                            if (z10 && !xa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = xa0Var.J;
                                int i19 = -xa0Var.N;
                                xa0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(e1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = xa0Var.J;
                                boolean z11 = !z10;
                                xa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ua0 ua0Var2 = xa0Var.V;
                                boolean z12 = xa0Var.L;
                                boolean z13 = xa0Var.M;
                                fu0 fu0Var = ua0Var2.c0;
                                if (fu0Var != null && (z6Var2 = fu0Var.s) != null) {
                                    z6Var2.n = z12;
                                    z6Var2.o = z13;
                                    z6Var2.d(true);
                                }
                                ls0 ls0Var = ua0Var2.e0;
                                if (ls0Var != null && (z6Var = ls0Var.s) != null) {
                                    z6Var.n = z12;
                                    z6Var.o = z13;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = xa0Var.M;
                            if (z14 && !xa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = xa0Var.K;
                                int i20 = -xa0Var.N;
                                xa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(e1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = xa0Var.K;
                                boolean z15 = !z14;
                                xa0Var.M = z15;
                                e1Var4.setChecked(z15);
                                ua0 ua0Var3 = xa0Var.V;
                                boolean z16 = xa0Var.L;
                                boolean z17 = xa0Var.M;
                                fu0 fu0Var2 = ua0Var3.c0;
                                if (fu0Var2 != null && (z6Var4 = fu0Var2.s) != null) {
                                    z6Var4.n = z16;
                                    z6Var4.o = z17;
                                    z6Var4.d(true);
                                }
                                ls0 ls0Var2 = ua0Var3.e0;
                                if (ls0Var2 != null && (z6Var3 = ls0Var2.s) != null) {
                                    z6Var3.n = z16;
                                    z6Var3.o = z17;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            xa0 xa0Var2 = this.b;
                            ai.y7 y7Var = xa0Var2.U;
                            if (y7Var != null) {
                                y7Var.run();
                                xa0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = xa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (xa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < xa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) xa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            xa0Var2.V.M(false);
                            if (z18) {
                                xa0Var2.V.b1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                xa0Var2.getMessagesController().getStoriesController().n0(xa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                xa0Var2.U = new ai.y7(xa0Var2, arrayList, z18, 21);
                                j90 j90Var = new j90(xa0Var2, zArr2, arrayList, zArr, 1);
                                (z18 ? xc.a0(xa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), j90Var).j() : xc.a0(xa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, j90Var).j()).v = new yt(22, xa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.e1 e10 = this.G.e(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.O = e10;
            e10.setEnabled(false);
            this.O.setAlpha(0.5f);
            this.G.a(-1);
            org.telegram.ui.ActionBar.u0 u0Var4 = this.G;
            org.telegram.ui.ActionBar.e1 d = u0Var4.d(6, 0, null, LocaleController.getString(R.string.MediaShowPhotos), true, true, u0Var4.m0);
            this.J = d;
            d.setChecked(this.L);
            final int i19 = 3;
            this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pa0
                public final /* synthetic */ xa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ci.z6 z6Var;
                    ci.z6 z6Var2;
                    ci.z6 z6Var3;
                    ci.z6 z6Var4;
                    int i172;
                    int i182 = i19;
                    xa0 xa0Var = this.b;
                    switch (i182) {
                        case 0:
                            xa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean B1 = xa0Var.V.B1(null, null);
                            if (B1 != null) {
                                boolean booleanValue = B1.booleanValue();
                                xa0Var.Q.setEnabled(true);
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(booleanValue);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean C1 = xa0Var.V.C1(null, null);
                            if (C1 != null) {
                                xa0Var.Q.setEnabled(C1.booleanValue());
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(true);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = xa0Var.L;
                            if (z10 && !xa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = xa0Var.J;
                                int i192 = -xa0Var.N;
                                xa0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(e1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = xa0Var.J;
                                boolean z11 = !z10;
                                xa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ua0 ua0Var2 = xa0Var.V;
                                boolean z12 = xa0Var.L;
                                boolean z13 = xa0Var.M;
                                fu0 fu0Var = ua0Var2.c0;
                                if (fu0Var != null && (z6Var2 = fu0Var.s) != null) {
                                    z6Var2.n = z12;
                                    z6Var2.o = z13;
                                    z6Var2.d(true);
                                }
                                ls0 ls0Var = ua0Var2.e0;
                                if (ls0Var != null && (z6Var = ls0Var.s) != null) {
                                    z6Var.n = z12;
                                    z6Var.o = z13;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = xa0Var.M;
                            if (z14 && !xa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = xa0Var.K;
                                int i20 = -xa0Var.N;
                                xa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(e1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = xa0Var.K;
                                boolean z15 = !z14;
                                xa0Var.M = z15;
                                e1Var4.setChecked(z15);
                                ua0 ua0Var3 = xa0Var.V;
                                boolean z16 = xa0Var.L;
                                boolean z17 = xa0Var.M;
                                fu0 fu0Var2 = ua0Var3.c0;
                                if (fu0Var2 != null && (z6Var4 = fu0Var2.s) != null) {
                                    z6Var4.n = z16;
                                    z6Var4.o = z17;
                                    z6Var4.d(true);
                                }
                                ls0 ls0Var2 = ua0Var3.e0;
                                if (ls0Var2 != null && (z6Var3 = ls0Var2.s) != null) {
                                    z6Var3.n = z16;
                                    z6Var3.o = z17;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            xa0 xa0Var2 = this.b;
                            ai.y7 y7Var = xa0Var2.U;
                            if (y7Var != null) {
                                y7Var.run();
                                xa0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = xa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (xa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < xa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) xa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            xa0Var2.V.M(false);
                            if (z18) {
                                xa0Var2.V.b1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                xa0Var2.getMessagesController().getStoriesController().n0(xa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                xa0Var2.U = new ai.y7(xa0Var2, arrayList, z18, 21);
                                j90 j90Var = new j90(xa0Var2, zArr2, arrayList, zArr, 1);
                                (z18 ? xc.a0(xa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), j90Var).j() : xc.a0(xa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, j90Var).j()).v = new yt(22, xa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.u0 u0Var5 = this.G;
            org.telegram.ui.ActionBar.e1 d10 = u0Var5.d(7, 0, null, LocaleController.getString(R.string.MediaShowVideos), true, true, u0Var5.m0);
            this.K = d10;
            d10.setChecked(this.M);
            final int i20 = 4;
            this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pa0
                public final /* synthetic */ xa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ci.z6 z6Var;
                    ci.z6 z6Var2;
                    ci.z6 z6Var3;
                    ci.z6 z6Var4;
                    int i172;
                    int i182 = i20;
                    xa0 xa0Var = this.b;
                    switch (i182) {
                        case 0:
                            xa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean B1 = xa0Var.V.B1(null, null);
                            if (B1 != null) {
                                boolean booleanValue = B1.booleanValue();
                                xa0Var.Q.setEnabled(true);
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(booleanValue);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean C1 = xa0Var.V.C1(null, null);
                            if (C1 != null) {
                                xa0Var.Q.setEnabled(C1.booleanValue());
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(true);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = xa0Var.L;
                            if (z10 && !xa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = xa0Var.J;
                                int i192 = -xa0Var.N;
                                xa0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(e1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = xa0Var.J;
                                boolean z11 = !z10;
                                xa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ua0 ua0Var2 = xa0Var.V;
                                boolean z12 = xa0Var.L;
                                boolean z13 = xa0Var.M;
                                fu0 fu0Var = ua0Var2.c0;
                                if (fu0Var != null && (z6Var2 = fu0Var.s) != null) {
                                    z6Var2.n = z12;
                                    z6Var2.o = z13;
                                    z6Var2.d(true);
                                }
                                ls0 ls0Var = ua0Var2.e0;
                                if (ls0Var != null && (z6Var = ls0Var.s) != null) {
                                    z6Var.n = z12;
                                    z6Var.o = z13;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = xa0Var.M;
                            if (z14 && !xa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = xa0Var.K;
                                int i202 = -xa0Var.N;
                                xa0Var.N = i202;
                                AndroidUtilities.shakeViewSpring(e1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = xa0Var.K;
                                boolean z15 = !z14;
                                xa0Var.M = z15;
                                e1Var4.setChecked(z15);
                                ua0 ua0Var3 = xa0Var.V;
                                boolean z16 = xa0Var.L;
                                boolean z17 = xa0Var.M;
                                fu0 fu0Var2 = ua0Var3.c0;
                                if (fu0Var2 != null && (z6Var4 = fu0Var2.s) != null) {
                                    z6Var4.n = z16;
                                    z6Var4.o = z17;
                                    z6Var4.d(true);
                                }
                                ls0 ls0Var2 = ua0Var3.e0;
                                if (ls0Var2 != null && (z6Var3 = ls0Var2.s) != null) {
                                    z6Var3.n = z16;
                                    z6Var3.o = z17;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            xa0 xa0Var2 = this.b;
                            ai.y7 y7Var = xa0Var2.U;
                            if (y7Var != null) {
                                y7Var.run();
                                xa0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = xa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (xa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < xa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) xa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            xa0Var2.V.M(false);
                            if (z18) {
                                xa0Var2.V.b1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                xa0Var2.getMessagesController().getStoriesController().n0(xa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                xa0Var2.U = new ai.y7(xa0Var2, arrayList, z18, 21);
                                j90 j90Var = new j90(xa0Var2, zArr2, arrayList, zArr, 1);
                                (z18 ? xc.a0(xa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), j90Var).j() : xc.a0(xa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, j90Var).j()).v = new yt(22, xa0Var2, zArr2);
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
        frameLayout.addView(frameLayout3, w7.z5.e(-1, -1, 119));
        int i22 = 0;
        while (true) {
            int i23 = this.a == 1 ? 2 : 1;
            q6VarArr = this.x;
            n5VarArr = this.w;
            if (i22 >= i23) {
                break;
            }
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout[] frameLayoutArr = this.v;
            frameLayoutArr[i22] = frameLayout4;
            this.s.addView(frameLayout4, w7.z5.e(-1, -1, i21));
            org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
            n5VarArr[i22] = n5Var2;
            n5Var2.setPivotX(0.0f);
            n5VarArr[i22].setPivotY(AndroidUtilities.dp(9.0f));
            n5VarArr[i22].setTextSize(18);
            n5VarArr[i22].setGravity(3);
            n5VarArr[i22].setTypeface(AndroidUtilities.bold());
            n5VarArr[i22].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            n5VarArr[i22].setScrollNonFitText(true);
            n5VarArr[i22].setImportantForAccessibility(2);
            frameLayoutArr[i22].addView(n5VarArr[i22], w7.z5.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            q6 q6Var = new q6(context, true, true, true);
            q6VarArr[i22] = q6Var;
            q6Var.b(0.4f, 320L, bs.h);
            q6VarArr[i22].setTextSize(AndroidUtilities.dp(14.0f));
            org.telegram.ui.ActionBar.r6.a0(q6VarArr[i22], org.telegram.ui.ActionBar.k6.Pi, null);
            frameLayoutArr[i22].addView(q6VarArr[i22], w7.z5.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i22 != 0) {
                frameLayoutArr[i22].setAlpha(0.0f);
            }
            i22++;
            i21 = 119;
        }
        sa0 sa0Var = new sa0(context);
        this.y = sa0Var;
        sa0Var.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.y.setRoundRadius(AndroidUtilities.dp((this.e == getUserConfig().getClientUserId() && this.f == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.y.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        h9 h9Var3 = new h9((org.telegram.ui.ActionBar.g6) null);
        h9Var3.l = true;
        this.y.setVisibility(z10 ? 0 : 8);
        this.y.setImageDrawable(h9Var3);
        frameLayout.addView(this.y, w7.z5.d(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        q6 q6Var2 = new q6(context, true, true, true);
        this.F = q6Var2;
        q6Var2.b(0.4f, 320L, bs.h);
        this.F.setTextSize(AndroidUtilities.dp(20.0f));
        this.F.setGravity(3);
        q6 q6Var3 = this.F;
        int i24 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.a0(q6Var3, i24, getResourceProvider());
        this.F.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.F, w7.z5.d(-2, -1.0f, 23, (z10 ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.a == 1) {
            wa0 wa0Var = new wa0(context, getResourceProvider());
            this.R = wa0Var;
            wa0Var.setOnTabClick(new y2(this, 6));
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.S = frameLayout5;
            frameLayout5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.S, getResourceProvider());
            ei.d dVar = new ei.d(context, getResourceProvider(), true);
            this.T = dVar;
            dVar.i(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.T.setShowZero(true);
            this.T.b(0, false);
            this.T.setEnabled(false);
            final int i25 = 5;
            this.T.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pa0
                public final /* synthetic */ xa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ci.z6 z6Var;
                    ci.z6 z6Var2;
                    ci.z6 z6Var3;
                    ci.z6 z6Var4;
                    int i172;
                    int i182 = i25;
                    xa0 xa0Var = this.b;
                    switch (i182) {
                        case 0:
                            xa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean B1 = xa0Var.V.B1(null, null);
                            if (B1 != null) {
                                boolean booleanValue = B1.booleanValue();
                                xa0Var.Q.setEnabled(true);
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(booleanValue);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean C1 = xa0Var.V.C1(null, null);
                            if (C1 != null) {
                                xa0Var.Q.setEnabled(C1.booleanValue());
                                xa0Var.Q.animate().alpha(xa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                xa0Var.P.setEnabled(true);
                                xa0Var.P.animate().alpha(xa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z102 = xa0Var.L;
                            if (z102 && !xa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = xa0Var.J;
                                int i192 = -xa0Var.N;
                                xa0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(e1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = xa0Var.J;
                                boolean z11 = !z102;
                                xa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ua0 ua0Var2 = xa0Var.V;
                                boolean z12 = xa0Var.L;
                                boolean z13 = xa0Var.M;
                                fu0 fu0Var = ua0Var2.c0;
                                if (fu0Var != null && (z6Var2 = fu0Var.s) != null) {
                                    z6Var2.n = z12;
                                    z6Var2.o = z13;
                                    z6Var2.d(true);
                                }
                                ls0 ls0Var = ua0Var2.e0;
                                if (ls0Var != null && (z6Var = ls0Var.s) != null) {
                                    z6Var.n = z12;
                                    z6Var.o = z13;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = xa0Var.M;
                            if (z14 && !xa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = xa0Var.K;
                                int i202 = -xa0Var.N;
                                xa0Var.N = i202;
                                AndroidUtilities.shakeViewSpring(e1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = xa0Var.K;
                                boolean z15 = !z14;
                                xa0Var.M = z15;
                                e1Var4.setChecked(z15);
                                ua0 ua0Var3 = xa0Var.V;
                                boolean z16 = xa0Var.L;
                                boolean z17 = xa0Var.M;
                                fu0 fu0Var2 = ua0Var3.c0;
                                if (fu0Var2 != null && (z6Var4 = fu0Var2.s) != null) {
                                    z6Var4.n = z16;
                                    z6Var4.o = z17;
                                    z6Var4.d(true);
                                }
                                ls0 ls0Var2 = ua0Var3.e0;
                                if (ls0Var2 != null && (z6Var3 = ls0Var2.s) != null) {
                                    z6Var3.n = z16;
                                    z6Var3.o = z17;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            xa0 xa0Var2 = this.b;
                            ai.y7 y7Var = xa0Var2.U;
                            if (y7Var != null) {
                                y7Var.run();
                                xa0Var2.U = null;
                            }
                            qc.e();
                            boolean z18 = xa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (xa0Var2.I != null) {
                                i172 = 0;
                                for (int i212 = 0; i212 < xa0Var2.I.size(); i212++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) xa0Var2.I.valueAt(i212)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            xa0Var2.V.M(false);
                            if (z18) {
                                xa0Var2.V.b1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i222 = 0; i222 < arrayList.size(); i222++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i222);
                                    zArr[i222] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                xa0Var2.getMessagesController().getStoriesController().n0(xa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                xa0Var2.U = new ai.y7(xa0Var2, arrayList, z18, 21);
                                j90 j90Var = new j90(xa0Var2, zArr2, arrayList, zArr, 1);
                                (z18 ? xc.a0(xa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), j90Var).j() : xc.a0(xa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, j90Var).j()).v = new yt(22, xa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.S.addView(this.T);
            this.S.setAlpha(0.0f);
            this.S.setTranslationY(AndroidUtilities.dp(100.0f));
            setBulletinDelegate(new ei.o8(7));
        }
        if (this.a == 0 && this.e == getUserConfig().getClientUserId() && this.f == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.W = 11;
        }
        ua0 ua0Var2 = new ua0(this, context, this.e, this.b, this.c, this.d, this.W, this, new ta0(this), getResourceProvider(), frameLayout, ra0Var);
        this.V = ua0Var2;
        ua0Var2.I0.setOpen(true);
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
            ra0Var.addView(this.V, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            ra0Var.addView(this.V);
        }
        ra0Var.addView(this.actionBar);
        ra0Var.addView(frameLayout);
        ra0Var.T.add(this.V);
        if (this.a == 1) {
            Y(0, false, false);
            Y(1, false, false);
        }
        wa0 wa0Var2 = this.R;
        if (wa0Var2 != null) {
            i10 = -1;
            ra0Var.addView(wa0Var2, w7.z5.e(-1, -2, 87));
        } else {
            i10 = -1;
        }
        FrameLayout frameLayout6 = this.S;
        if (frameLayout6 != null) {
            ra0Var.addView(frameLayout6, w7.z5.e(i10, 64, 87));
        }
        long j10 = this.e;
        if (this.f != 0 && j10 == getUserConfig().getClientUserId()) {
            j10 = this.f;
        }
        int i27 = this.a;
        if (i27 == 3) {
            n5VarArr[0].k(this.h);
            int i28 = this.r;
            if (i28 != i10) {
                q6VarArr[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", i28));
            }
        } else if (i27 == 2) {
            n5VarArr[0].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        } else {
            if (i27 != 1) {
                if (j10 == UserObject.ANONYMOUS) {
                    n5VarArr[0].k(LocaleController.getString(R.string.AnonymousForward));
                    h9 h9Var4 = h9Var3;
                    h9Var4.g(21);
                    h9Var4.p = 0.75f;
                    h9Var2 = h9Var4;
                } else {
                    h9 h9Var5 = h9Var3;
                    if (this.f == 0 || j10 != getUserConfig().getClientUserId()) {
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.v0.l(getMessagesController(), j10);
                            h9Var2 = h9Var5;
                            if (l4 != null) {
                                TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(l4.user_id));
                                h9Var2 = h9Var5;
                                if (user2 != null) {
                                    n5VarArr[0].k(ContactsController.formatName(user2.first_name, user2.last_name));
                                    h9Var5.m(this.currentAccount, user2);
                                    h9Var = h9Var5;
                                    user = user2;
                                }
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                            h9Var2 = h9Var5;
                            if (user3 != null) {
                                if (user3.self) {
                                    n5VarArr[0].k(LocaleController.getString(R.string.SavedMessages));
                                    h9Var5.g(1);
                                    h9Var5.p = 0.8f;
                                    h9Var2 = h9Var5;
                                } else {
                                    n5VarArr[0].k(ContactsController.formatName(user3.first_name, user3.last_name));
                                    h9Var5.m(this.currentAccount, user3);
                                    h9Var = h9Var5;
                                    user = user3;
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                            h9Var2 = h9Var5;
                            if (chat != 0) {
                                n5VarArr[0].k(chat.title);
                                h9Var5.k(this.currentAccount, chat);
                                h9Var = h9Var5;
                                user = chat;
                            }
                        }
                        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user, 1), "50_50", h9Var, user);
                        n5Var = n5VarArr[0];
                        if (n5Var != null && TextUtils.isEmpty(n5Var.getText())) {
                            n5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                        }
                        ua0Var = this.V;
                        if (ua0Var.v0(ua0Var.k0[0].F) && this.a != 1) {
                            this.V.getSearchItem().setVisibility(0);
                        }
                        u0Var = this.V.m0;
                        if (u0Var != null) {
                            i11 = 11;
                            if (this.W != 11) {
                                u0Var.setVisibility(8);
                            }
                        } else {
                            i11 = 11;
                        }
                        if (this.V.getSearchOptionsItem() != null || this.a == 1) {
                            r32 = 0;
                        } else {
                            r32 = 0;
                            this.V.A(!r0.v0(r0.k0[0].F), false);
                            this.V.getSearchOptionsItem().setVisibility(0);
                        }
                        qu0[] qu0VarArr = this.V.k0;
                        i12 = qu0VarArr[r32].F;
                        if ((i12 != 0 || xv0.r0(i12) || qu0VarArr[r32].F == i11) && this.a != 1) {
                            this.V.r0.setVisibility(r32);
                        } else {
                            this.V.r0.setVisibility(4);
                        }
                        this.actionBar.setDrawBlurBackground(ra0Var);
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r32);
                        a0();
                        Z();
                        if (this.a == 1 && this.W == 9) {
                            this.V.P0(9.0f);
                        }
                        return ra0Var;
                    }
                    n5VarArr[0].k(LocaleController.getString(R.string.MyNotes));
                    h9Var5.g(22);
                    h9Var5.p = 0.75f;
                    h9Var2 = h9Var5;
                }
                user = null;
                h9Var = h9Var2;
                this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user, 1), "50_50", h9Var, user);
                n5Var = n5VarArr[0];
                if (n5Var != null) {
                    n5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                }
                ua0Var = this.V;
                if (ua0Var.v0(ua0Var.k0[0].F)) {
                    this.V.getSearchItem().setVisibility(0);
                }
                u0Var = this.V.m0;
                if (u0Var != null) {
                }
                if (this.V.getSearchOptionsItem() != null) {
                }
                r32 = 0;
                qu0[] qu0VarArr2 = this.V.k0;
                i12 = qu0VarArr2[r32].F;
                if (i12 != 0) {
                }
                this.V.r0.setVisibility(r32);
                this.actionBar.setDrawBlurBackground(ra0Var);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r32);
                a0();
                Z();
                if (this.a == 1) {
                    this.V.P0(9.0f);
                }
                return ra0Var;
            }
            n5VarArr[0].k(LocaleController.getString(R.string.ProfileMyStories));
            n5VarArr[1].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        }
        h9Var2 = h9Var3;
        user = null;
        h9Var = h9Var2;
        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user, 1), "50_50", h9Var, user);
        n5Var = n5VarArr[0];
        if (n5Var != null) {
        }
        ua0Var = this.V;
        if (ua0Var.v0(ua0Var.k0[0].F)) {
        }
        u0Var = this.V.m0;
        if (u0Var != null) {
        }
        if (this.V.getSearchOptionsItem() != null) {
        }
        r32 = 0;
        qu0[] qu0VarArr22 = this.V.k0;
        i12 = qu0VarArr22[r32].F;
        if (i12 != 0) {
        }
        this.V.r0.setVisibility(r32);
        this.actionBar.setDrawBlurBackground(ra0Var);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r32);
        a0();
        Z();
        if (this.a == 1) {
        }
        return ra0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            ua0 ua0Var = this.V;
            if (ua0Var != null) {
                ua0Var.setUserInfo(userFull);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.d6);
        return (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) ? themedColor : getLastStoryViewer().getNavigationBarColor(themedColor);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
            if (this.actionBar.s()) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.V.A0()) {
            return false;
        }
        ua0 ua0Var = this.V;
        return ua0Var.getSelectedTab() == ua0Var.I0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            ua0 ua0Var = this.V;
            if (!ua0Var.C1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                ua0Var.M(false);
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            this.b = new pv0(this);
        }
        this.b.x.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        ai.y7 y7Var = this.U;
        if (y7Var != null) {
            this.U = null;
            AndroidUtilities.runOnUIThread(y7Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ua0 ua0Var = this.V;
        if (ua0Var != null) {
            ua0Var.setPagesPaddingBottom(i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z8, false);
            if (this.V != null) {
                if (this.actionBar != null) {
                    if (x02 == this.f0) {
                        if (x03 == this.g0) {
                            if (x04 != this.h0) {
                            }
                        }
                    }
                    this.f0 = x02;
                    this.g0 = x03;
                    this.h0 = x04;
                    Z();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G6);
            if (themedColor == this.e0) {
                return;
            }
            this.e0 = themedColor;
            org.telegram.ui.ActionBar.u0 u0Var = this.H;
            if (u0Var != null) {
                u0Var.setIconColor(themedColor);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.G;
            if (u0Var2 != null) {
                u0Var2.setIconColor(themedColor);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
