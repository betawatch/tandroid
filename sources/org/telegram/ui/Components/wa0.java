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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class wa0 extends org.telegram.ui.ActionBar.n2 implements lv0, ng.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.g2 E;
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
    public va0 R;
    public FrameLayout S;
    public ei.d T;
    public ai.x7 U;
    public ta0 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int a;
    public final boolean[] a0;
    public kv0 b;
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
    public ra0 y;

    public wa0(Bundle bundle, kv0 kv0Var) {
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
        this.b = kv0Var;
    }

    @Override // ng.b
    public final List B() {
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = qg.m1.m;
        return Arrays.asList(new ng.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new hq(this, 27)));
    }

    @Override // org.telegram.ui.Components.lv0
    public final void M() {
        kv0 kv0Var;
        ta0 ta0Var = this.V;
        if (ta0Var != null && (kv0Var = this.b) != null) {
            ta0Var.setNewMediaCounts(kv0Var.c);
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
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, i10, 5));
            valueAnimatorArr[i10].addListener(new ua0(this, i10, z10, r5));
            valueAnimatorArr[i10].setDuration(320L);
            valueAnimatorArr[i10].setInterpolator(bs.h);
            valueAnimatorArr[i10].start();
        }
    }

    public final void Z() {
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.w;
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[1];
        if (j5Var2 != null) {
            j5Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        boolean z10;
        lu0 lu0Var;
        ta0 ta0Var = this.V;
        if (ta0Var != null) {
            q6[] q6VarArr = this.x;
            if (q6VarArr[0] == null) {
                return;
            }
            int closestTab = ta0Var.getClosestTab();
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
                    e1Var.setEnabled(this.V.E());
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.Q;
                    e1Var2.setAlpha(e1Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.e1 e1Var3 = this.P;
                if (e1Var3 != null) {
                    ta0 ta0Var2 = this.V;
                    lu0[] lu0VarArr = ta0Var2.k0;
                    if (lu0VarArr != null && (lu0Var = lu0VarArr[0]) != null) {
                        boolean q02 = sv0.q0(lu0Var.F);
                        int i12 = ta0Var2.m1[q02 ? 1 : 0];
                        if (i12 != ta0Var2.X(q02 ? 1 : 0, i12, true)) {
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
                    ta0 ta0Var3 = this.V;
                    boolean z13 = ta0Var3.c0(ta0Var3.getClosestTab()) <= 0;
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
        if (this.V.z0()) {
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
        h9 h9Var;
        org.telegram.ui.ActionBar.j5 j5Var;
        ta0 ta0Var;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i11;
        ?? r10;
        int i12;
        h9 h9Var2;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.E = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.E.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new pa0(this));
        FrameLayout frameLayout = new FrameLayout(context);
        qa0 qa0Var = new qa0(this, context, frameLayout, 0);
        qa0Var.N = true;
        this.fragmentView = qa0Var;
        qa0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.a7));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        int i13 = this.a;
        if (i13 == 1 || i13 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.actionBar.addView(frameLayout2, w7.z5.e(56, 56, 85));
            int i14 = org.telegram.ui.ActionBar.h6.z8;
            int themedColor = getThemedColor(i14);
            int i15 = org.telegram.ui.ActionBar.h6.G6;
            org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, n10, themedColor, getThemedColor(i15));
            this.H = u0Var2;
            u0Var2.setIcon(R.drawable.msg_delete);
            this.H.setVisibility(8);
            this.H.setAlpha(0.0f);
            this.H.setOnClickListener(new u80(n10, 1));
            frameLayout2.addView(this.H);
            org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, n10, getThemedColor(i14), getThemedColor(i15));
            this.G = u0Var3;
            u0Var3.setIcon(R.drawable.ic_ab_other);
            final int i16 = 0;
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oa0
                public final /* synthetic */ wa0 b;

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
                    wa0 wa0Var = this.b;
                    switch (i18) {
                        case 0:
                            wa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean z12 = wa0Var.V.z1(null, null);
                            if (z12 != null) {
                                boolean booleanValue = z12.booleanValue();
                                wa0Var.Q.setEnabled(true);
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(booleanValue);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean A1 = wa0Var.V.A1(null, null);
                            if (A1 != null) {
                                wa0Var.Q.setEnabled(A1.booleanValue());
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(true);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = wa0Var.L;
                            if (z10 && !wa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = wa0Var.J;
                                int i19 = -wa0Var.N;
                                wa0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(e1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = wa0Var.J;
                                boolean z11 = !z10;
                                wa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ta0 ta0Var2 = wa0Var.V;
                                boolean z13 = wa0Var.L;
                                boolean z14 = wa0Var.M;
                                au0 au0Var = ta0Var2.c0;
                                if (au0Var != null && (z6Var2 = au0Var.s) != null) {
                                    z6Var2.n = z13;
                                    z6Var2.o = z14;
                                    z6Var2.d(true);
                                }
                                gs0 gs0Var = ta0Var2.e0;
                                if (gs0Var != null && (z6Var = gs0Var.s) != null) {
                                    z6Var.n = z13;
                                    z6Var.o = z14;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z15 = wa0Var.M;
                            if (z15 && !wa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = wa0Var.K;
                                int i20 = -wa0Var.N;
                                wa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(e1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = wa0Var.K;
                                boolean z16 = !z15;
                                wa0Var.M = z16;
                                e1Var4.setChecked(z16);
                                ta0 ta0Var3 = wa0Var.V;
                                boolean z17 = wa0Var.L;
                                boolean z18 = wa0Var.M;
                                au0 au0Var2 = ta0Var3.c0;
                                if (au0Var2 != null && (z6Var4 = au0Var2.s) != null) {
                                    z6Var4.n = z17;
                                    z6Var4.o = z18;
                                    z6Var4.d(true);
                                }
                                gs0 gs0Var2 = ta0Var3.e0;
                                if (gs0Var2 != null && (z6Var3 = gs0Var2.s) != null) {
                                    z6Var3.n = z17;
                                    z6Var3.o = z18;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            wa0 wa0Var2 = this.b;
                            ai.x7 x7Var = wa0Var2.U;
                            if (x7Var != null) {
                                x7Var.run();
                                wa0Var2.U = null;
                            }
                            qc.e();
                            boolean z19 = wa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (wa0Var2.I != null) {
                                i17 = 0;
                                for (int i21 = 0; i21 < wa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) wa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i17++;
                                    }
                                }
                            } else {
                                i17 = 0;
                            }
                            wa0Var2.V.L(false);
                            if (z19) {
                                wa0Var2.V.a1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z19;
                                }
                                wa0Var2.getMessagesController().getStoriesController().n0(wa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                int i23 = 22;
                                wa0Var2.U = new ai.x7(wa0Var2, arrayList, z19, i23);
                                i90 i90Var = new i90(wa0Var2, zArr2, arrayList, zArr, 1);
                                (z19 ? xc.a0(wa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i17, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), i90Var).j() : xc.a0(wa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i17, new Object[0]), LocaleController.getString("Undo"), 5000, false, i90Var).j()).v = new yt(i23, wa0Var2, zArr2);
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
            e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oa0
                public final /* synthetic */ wa0 b;

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
                    wa0 wa0Var = this.b;
                    switch (i18) {
                        case 0:
                            wa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean z12 = wa0Var.V.z1(null, null);
                            if (z12 != null) {
                                boolean booleanValue = z12.booleanValue();
                                wa0Var.Q.setEnabled(true);
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(booleanValue);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean A1 = wa0Var.V.A1(null, null);
                            if (A1 != null) {
                                wa0Var.Q.setEnabled(A1.booleanValue());
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(true);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = wa0Var.L;
                            if (z10 && !wa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = wa0Var.J;
                                int i19 = -wa0Var.N;
                                wa0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(e1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = wa0Var.J;
                                boolean z11 = !z10;
                                wa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ta0 ta0Var2 = wa0Var.V;
                                boolean z13 = wa0Var.L;
                                boolean z14 = wa0Var.M;
                                au0 au0Var = ta0Var2.c0;
                                if (au0Var != null && (z6Var2 = au0Var.s) != null) {
                                    z6Var2.n = z13;
                                    z6Var2.o = z14;
                                    z6Var2.d(true);
                                }
                                gs0 gs0Var = ta0Var2.e0;
                                if (gs0Var != null && (z6Var = gs0Var.s) != null) {
                                    z6Var.n = z13;
                                    z6Var.o = z14;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z15 = wa0Var.M;
                            if (z15 && !wa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = wa0Var.K;
                                int i20 = -wa0Var.N;
                                wa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(e1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = wa0Var.K;
                                boolean z16 = !z15;
                                wa0Var.M = z16;
                                e1Var4.setChecked(z16);
                                ta0 ta0Var3 = wa0Var.V;
                                boolean z17 = wa0Var.L;
                                boolean z18 = wa0Var.M;
                                au0 au0Var2 = ta0Var3.c0;
                                if (au0Var2 != null && (z6Var4 = au0Var2.s) != null) {
                                    z6Var4.n = z17;
                                    z6Var4.o = z18;
                                    z6Var4.d(true);
                                }
                                gs0 gs0Var2 = ta0Var3.e0;
                                if (gs0Var2 != null && (z6Var3 = gs0Var2.s) != null) {
                                    z6Var3.n = z17;
                                    z6Var3.o = z18;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            wa0 wa0Var2 = this.b;
                            ai.x7 x7Var = wa0Var2.U;
                            if (x7Var != null) {
                                x7Var.run();
                                wa0Var2.U = null;
                            }
                            qc.e();
                            boolean z19 = wa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (wa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < wa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) wa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            wa0Var2.V.L(false);
                            if (z19) {
                                wa0Var2.V.a1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z19;
                                }
                                wa0Var2.getMessagesController().getStoriesController().n0(wa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                int i23 = 22;
                                wa0Var2.U = new ai.x7(wa0Var2, arrayList, z19, i23);
                                i90 i90Var = new i90(wa0Var2, zArr2, arrayList, zArr, 1);
                                (z19 ? xc.a0(wa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), i90Var).j() : xc.a0(wa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, i90Var).j()).v = new yt(i23, wa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.e1 e7 = this.G.e(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.Q = e7;
            final int i18 = 2;
            e7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oa0
                public final /* synthetic */ wa0 b;

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
                    wa0 wa0Var = this.b;
                    switch (i182) {
                        case 0:
                            wa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean z12 = wa0Var.V.z1(null, null);
                            if (z12 != null) {
                                boolean booleanValue = z12.booleanValue();
                                wa0Var.Q.setEnabled(true);
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(booleanValue);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean A1 = wa0Var.V.A1(null, null);
                            if (A1 != null) {
                                wa0Var.Q.setEnabled(A1.booleanValue());
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(true);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = wa0Var.L;
                            if (z10 && !wa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = wa0Var.J;
                                int i19 = -wa0Var.N;
                                wa0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(e1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = wa0Var.J;
                                boolean z11 = !z10;
                                wa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ta0 ta0Var2 = wa0Var.V;
                                boolean z13 = wa0Var.L;
                                boolean z14 = wa0Var.M;
                                au0 au0Var = ta0Var2.c0;
                                if (au0Var != null && (z6Var2 = au0Var.s) != null) {
                                    z6Var2.n = z13;
                                    z6Var2.o = z14;
                                    z6Var2.d(true);
                                }
                                gs0 gs0Var = ta0Var2.e0;
                                if (gs0Var != null && (z6Var = gs0Var.s) != null) {
                                    z6Var.n = z13;
                                    z6Var.o = z14;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z15 = wa0Var.M;
                            if (z15 && !wa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = wa0Var.K;
                                int i20 = -wa0Var.N;
                                wa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(e1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = wa0Var.K;
                                boolean z16 = !z15;
                                wa0Var.M = z16;
                                e1Var4.setChecked(z16);
                                ta0 ta0Var3 = wa0Var.V;
                                boolean z17 = wa0Var.L;
                                boolean z18 = wa0Var.M;
                                au0 au0Var2 = ta0Var3.c0;
                                if (au0Var2 != null && (z6Var4 = au0Var2.s) != null) {
                                    z6Var4.n = z17;
                                    z6Var4.o = z18;
                                    z6Var4.d(true);
                                }
                                gs0 gs0Var2 = ta0Var3.e0;
                                if (gs0Var2 != null && (z6Var3 = gs0Var2.s) != null) {
                                    z6Var3.n = z17;
                                    z6Var3.o = z18;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            wa0 wa0Var2 = this.b;
                            ai.x7 x7Var = wa0Var2.U;
                            if (x7Var != null) {
                                x7Var.run();
                                wa0Var2.U = null;
                            }
                            qc.e();
                            boolean z19 = wa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (wa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < wa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) wa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            wa0Var2.V.L(false);
                            if (z19) {
                                wa0Var2.V.a1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z19;
                                }
                                wa0Var2.getMessagesController().getStoriesController().n0(wa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                int i23 = 22;
                                wa0Var2.U = new ai.x7(wa0Var2, arrayList, z19, i23);
                                i90 i90Var = new i90(wa0Var2, zArr2, arrayList, zArr, 1);
                                (z19 ? xc.a0(wa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), i90Var).j() : xc.a0(wa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, i90Var).j()).v = new yt(i23, wa0Var2, zArr2);
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
            this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oa0
                public final /* synthetic */ wa0 b;

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
                    wa0 wa0Var = this.b;
                    switch (i182) {
                        case 0:
                            wa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean z12 = wa0Var.V.z1(null, null);
                            if (z12 != null) {
                                boolean booleanValue = z12.booleanValue();
                                wa0Var.Q.setEnabled(true);
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(booleanValue);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean A1 = wa0Var.V.A1(null, null);
                            if (A1 != null) {
                                wa0Var.Q.setEnabled(A1.booleanValue());
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(true);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = wa0Var.L;
                            if (z10 && !wa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = wa0Var.J;
                                int i192 = -wa0Var.N;
                                wa0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(e1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = wa0Var.J;
                                boolean z11 = !z10;
                                wa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ta0 ta0Var2 = wa0Var.V;
                                boolean z13 = wa0Var.L;
                                boolean z14 = wa0Var.M;
                                au0 au0Var = ta0Var2.c0;
                                if (au0Var != null && (z6Var2 = au0Var.s) != null) {
                                    z6Var2.n = z13;
                                    z6Var2.o = z14;
                                    z6Var2.d(true);
                                }
                                gs0 gs0Var = ta0Var2.e0;
                                if (gs0Var != null && (z6Var = gs0Var.s) != null) {
                                    z6Var.n = z13;
                                    z6Var.o = z14;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z15 = wa0Var.M;
                            if (z15 && !wa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = wa0Var.K;
                                int i20 = -wa0Var.N;
                                wa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(e1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = wa0Var.K;
                                boolean z16 = !z15;
                                wa0Var.M = z16;
                                e1Var4.setChecked(z16);
                                ta0 ta0Var3 = wa0Var.V;
                                boolean z17 = wa0Var.L;
                                boolean z18 = wa0Var.M;
                                au0 au0Var2 = ta0Var3.c0;
                                if (au0Var2 != null && (z6Var4 = au0Var2.s) != null) {
                                    z6Var4.n = z17;
                                    z6Var4.o = z18;
                                    z6Var4.d(true);
                                }
                                gs0 gs0Var2 = ta0Var3.e0;
                                if (gs0Var2 != null && (z6Var3 = gs0Var2.s) != null) {
                                    z6Var3.n = z17;
                                    z6Var3.o = z18;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            wa0 wa0Var2 = this.b;
                            ai.x7 x7Var = wa0Var2.U;
                            if (x7Var != null) {
                                x7Var.run();
                                wa0Var2.U = null;
                            }
                            qc.e();
                            boolean z19 = wa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (wa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < wa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) wa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            wa0Var2.V.L(false);
                            if (z19) {
                                wa0Var2.V.a1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z19;
                                }
                                wa0Var2.getMessagesController().getStoriesController().n0(wa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                int i23 = 22;
                                wa0Var2.U = new ai.x7(wa0Var2, arrayList, z19, i23);
                                i90 i90Var = new i90(wa0Var2, zArr2, arrayList, zArr, 1);
                                (z19 ? xc.a0(wa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), i90Var).j() : xc.a0(wa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, i90Var).j()).v = new yt(i23, wa0Var2, zArr2);
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
            this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oa0
                public final /* synthetic */ wa0 b;

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
                    wa0 wa0Var = this.b;
                    switch (i182) {
                        case 0:
                            wa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean z12 = wa0Var.V.z1(null, null);
                            if (z12 != null) {
                                boolean booleanValue = z12.booleanValue();
                                wa0Var.Q.setEnabled(true);
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(booleanValue);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean A1 = wa0Var.V.A1(null, null);
                            if (A1 != null) {
                                wa0Var.Q.setEnabled(A1.booleanValue());
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(true);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = wa0Var.L;
                            if (z10 && !wa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = wa0Var.J;
                                int i192 = -wa0Var.N;
                                wa0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(e1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = wa0Var.J;
                                boolean z11 = !z10;
                                wa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ta0 ta0Var2 = wa0Var.V;
                                boolean z13 = wa0Var.L;
                                boolean z14 = wa0Var.M;
                                au0 au0Var = ta0Var2.c0;
                                if (au0Var != null && (z6Var2 = au0Var.s) != null) {
                                    z6Var2.n = z13;
                                    z6Var2.o = z14;
                                    z6Var2.d(true);
                                }
                                gs0 gs0Var = ta0Var2.e0;
                                if (gs0Var != null && (z6Var = gs0Var.s) != null) {
                                    z6Var.n = z13;
                                    z6Var.o = z14;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z15 = wa0Var.M;
                            if (z15 && !wa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = wa0Var.K;
                                int i202 = -wa0Var.N;
                                wa0Var.N = i202;
                                AndroidUtilities.shakeViewSpring(e1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = wa0Var.K;
                                boolean z16 = !z15;
                                wa0Var.M = z16;
                                e1Var4.setChecked(z16);
                                ta0 ta0Var3 = wa0Var.V;
                                boolean z17 = wa0Var.L;
                                boolean z18 = wa0Var.M;
                                au0 au0Var2 = ta0Var3.c0;
                                if (au0Var2 != null && (z6Var4 = au0Var2.s) != null) {
                                    z6Var4.n = z17;
                                    z6Var4.o = z18;
                                    z6Var4.d(true);
                                }
                                gs0 gs0Var2 = ta0Var3.e0;
                                if (gs0Var2 != null && (z6Var3 = gs0Var2.s) != null) {
                                    z6Var3.n = z17;
                                    z6Var3.o = z18;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            wa0 wa0Var2 = this.b;
                            ai.x7 x7Var = wa0Var2.U;
                            if (x7Var != null) {
                                x7Var.run();
                                wa0Var2.U = null;
                            }
                            qc.e();
                            boolean z19 = wa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (wa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < wa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) wa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            wa0Var2.V.L(false);
                            if (z19) {
                                wa0Var2.V.a1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z19;
                                }
                                wa0Var2.getMessagesController().getStoriesController().n0(wa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                int i23 = 22;
                                wa0Var2.U = new ai.x7(wa0Var2, arrayList, z19, i23);
                                i90 i90Var = new i90(wa0Var2, zArr2, arrayList, zArr, 1);
                                (z19 ? xc.a0(wa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), i90Var).j() : xc.a0(wa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, i90Var).j()).v = new yt(i23, wa0Var2, zArr2);
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
            j5VarArr = this.w;
            if (i22 >= i23) {
                break;
            }
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout[] frameLayoutArr = this.v;
            frameLayoutArr[i22] = frameLayout4;
            this.s.addView(frameLayout4, w7.z5.e(-1, -1, i21));
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
            frameLayoutArr[i22].addView(j5VarArr[i22], w7.z5.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            q6 q6Var = new q6(context, true, true, true);
            q6VarArr[i22] = q6Var;
            q6Var.b(0.4f, 320L, bs.h);
            q6VarArr[i22].setTextSize(AndroidUtilities.dp(14.0f));
            q6VarArr[i22].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pi, false));
            frameLayoutArr[i22].addView(q6VarArr[i22], w7.z5.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i22 != 0) {
                frameLayoutArr[i22].setAlpha(0.0f);
            }
            i22++;
            i21 = 119;
        }
        ra0 ra0Var = new ra0(context);
        this.y = ra0Var;
        ra0Var.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.y.setRoundRadius(AndroidUtilities.dp((this.e == getUserConfig().getClientUserId() && this.f == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.y.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        h9 h9Var3 = new h9((org.telegram.ui.ActionBar.d6) null);
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
        int i24 = org.telegram.ui.ActionBar.h6.G6;
        q6Var3.setTextColor(getThemedColor(i24));
        this.F.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.F, w7.z5.d(-2, -1.0f, 23, (z10 ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.a == 1) {
            va0 va0Var = new va0(context, getResourceProvider());
            this.R = va0Var;
            va0Var.setOnTabClick(new z2(this, 6));
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.S = frameLayout5;
            frameLayout5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            this.S.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            ei.d dVar = new ei.d(context, getResourceProvider(), true);
            this.T = dVar;
            dVar.g(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.T.setShowZero(true);
            this.T.b(0, false);
            this.T.setEnabled(false);
            final int i25 = 5;
            this.T.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oa0
                public final /* synthetic */ wa0 b;

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
                    wa0 wa0Var = this.b;
                    switch (i182) {
                        case 0:
                            wa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean z12 = wa0Var.V.z1(null, null);
                            if (z12 != null) {
                                boolean booleanValue = z12.booleanValue();
                                wa0Var.Q.setEnabled(true);
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(booleanValue);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean A1 = wa0Var.V.A1(null, null);
                            if (A1 != null) {
                                wa0Var.Q.setEnabled(A1.booleanValue());
                                wa0Var.Q.animate().alpha(wa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                wa0Var.P.setEnabled(true);
                                wa0Var.P.animate().alpha(wa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z102 = wa0Var.L;
                            if (z102 && !wa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var = wa0Var.J;
                                int i192 = -wa0Var.N;
                                wa0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(e1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var2 = wa0Var.J;
                                boolean z11 = !z102;
                                wa0Var.L = z11;
                                e1Var2.setChecked(z11);
                                ta0 ta0Var2 = wa0Var.V;
                                boolean z13 = wa0Var.L;
                                boolean z14 = wa0Var.M;
                                au0 au0Var = ta0Var2.c0;
                                if (au0Var != null && (z6Var2 = au0Var.s) != null) {
                                    z6Var2.n = z13;
                                    z6Var2.o = z14;
                                    z6Var2.d(true);
                                }
                                gs0 gs0Var = ta0Var2.e0;
                                if (gs0Var != null && (z6Var = gs0Var.s) != null) {
                                    z6Var.n = z13;
                                    z6Var.o = z14;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z15 = wa0Var.M;
                            if (z15 && !wa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.e1 e1Var3 = wa0Var.K;
                                int i202 = -wa0Var.N;
                                wa0Var.N = i202;
                                AndroidUtilities.shakeViewSpring(e1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.e1 e1Var4 = wa0Var.K;
                                boolean z16 = !z15;
                                wa0Var.M = z16;
                                e1Var4.setChecked(z16);
                                ta0 ta0Var3 = wa0Var.V;
                                boolean z17 = wa0Var.L;
                                boolean z18 = wa0Var.M;
                                au0 au0Var2 = ta0Var3.c0;
                                if (au0Var2 != null && (z6Var4 = au0Var2.s) != null) {
                                    z6Var4.n = z17;
                                    z6Var4.o = z18;
                                    z6Var4.d(true);
                                }
                                gs0 gs0Var2 = ta0Var3.e0;
                                if (gs0Var2 != null && (z6Var3 = gs0Var2.s) != null) {
                                    z6Var3.n = z17;
                                    z6Var3.o = z18;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            wa0 wa0Var2 = this.b;
                            ai.x7 x7Var = wa0Var2.U;
                            if (x7Var != null) {
                                x7Var.run();
                                wa0Var2.U = null;
                            }
                            qc.e();
                            boolean z19 = wa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (wa0Var2.I != null) {
                                i172 = 0;
                                for (int i212 = 0; i212 < wa0Var2.I.size(); i212++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) wa0Var2.I.valueAt(i212)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            wa0Var2.V.L(false);
                            if (z19) {
                                wa0Var2.V.a1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i222 = 0; i222 < arrayList.size(); i222++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i222);
                                    zArr[i222] = storyItem2.pinned;
                                    storyItem2.pinned = z19;
                                }
                                wa0Var2.getMessagesController().getStoriesController().n0(wa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                int i232 = 22;
                                wa0Var2.U = new ai.x7(wa0Var2, arrayList, z19, i232);
                                i90 i90Var = new i90(wa0Var2, zArr2, arrayList, zArr, 1);
                                (z19 ? xc.a0(wa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), i90Var).j() : xc.a0(wa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, i90Var).j()).v = new yt(i232, wa0Var2, zArr2);
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
        ta0 ta0Var2 = new ta0(this, context, this.e, this.b, this.c, this.d, this.W, this, new sa0(this), getResourceProvider(), frameLayout, qa0Var);
        this.V = ta0Var2;
        ta0Var2.I0.setOpen(true);
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
            qa0Var.addView(this.V, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            qa0Var.addView(this.V);
        }
        qa0Var.addView(this.actionBar);
        qa0Var.addView(frameLayout);
        qa0Var.T.add(this.V);
        if (this.a == 1) {
            Y(0, false, false);
            Y(1, false, false);
        }
        va0 va0Var2 = this.R;
        if (va0Var2 != null) {
            i10 = -1;
            qa0Var.addView(va0Var2, w7.z5.e(-1, -2, 87));
        } else {
            i10 = -1;
        }
        FrameLayout frameLayout6 = this.S;
        if (frameLayout6 != null) {
            qa0Var.addView(frameLayout6, w7.z5.e(i10, 64, 87));
        }
        long j10 = this.e;
        if (this.f != 0 && j10 == getUserConfig().getClientUserId()) {
            j10 = this.f;
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
                if (j10 == UserObject.ANONYMOUS) {
                    j5VarArr[0].k(LocaleController.getString(R.string.AnonymousForward));
                    h9 h9Var4 = h9Var3;
                    h9Var4.g(21);
                    h9Var4.p = 0.75f;
                    h9Var2 = h9Var4;
                } else {
                    h9 h9Var5 = h9Var3;
                    if (this.f == 0 || j10 != getUserConfig().getClientUserId()) {
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.g0.l(getMessagesController(), j10);
                            h9Var2 = h9Var5;
                            if (l4 != null) {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(l4.user_id));
                                h9Var2 = h9Var5;
                                if (user3 != null) {
                                    j5VarArr[0].k(ContactsController.formatName(user3.first_name, user3.last_name));
                                    h9Var5.m(this.currentAccount, user3);
                                    user = user3;
                                    user2 = user;
                                    h9Var = h9Var5;
                                }
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                            h9Var2 = h9Var5;
                            if (user4 != null) {
                                if (user4.self) {
                                    j5VarArr[0].k(LocaleController.getString(R.string.SavedMessages));
                                    h9Var5.g(1);
                                    h9Var5.p = 0.8f;
                                    h9Var2 = h9Var5;
                                } else {
                                    j5VarArr[0].k(ContactsController.formatName(user4.first_name, user4.last_name));
                                    h9Var5.m(this.currentAccount, user4);
                                    user = user4;
                                    user2 = user;
                                    h9Var = h9Var5;
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                            h9Var2 = h9Var5;
                            if (chat != 0) {
                                j5VarArr[0].k(chat.title);
                                h9Var5.k(this.currentAccount, chat);
                                user = chat;
                                user2 = user;
                                h9Var = h9Var5;
                            }
                        }
                        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", h9Var, user2);
                        j5Var = j5VarArr[0];
                        if (j5Var != null && TextUtils.isEmpty(j5Var.getText())) {
                            j5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                        }
                        ta0Var = this.V;
                        if (ta0Var.u0(ta0Var.k0[0].F) && this.a != 1) {
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
                            r10 = 0;
                        } else {
                            r10 = 0;
                            this.V.A(!r0.u0(r0.k0[0].F), false);
                            this.V.getSearchOptionsItem().setVisibility(0);
                        }
                        lu0[] lu0VarArr = this.V.k0;
                        i12 = lu0VarArr[r10].F;
                        if ((i12 != 0 || sv0.q0(i12) || lu0VarArr[r10].F == i11) && this.a != 1) {
                            this.V.r0.setVisibility(r10);
                        } else {
                            this.V.r0.setVisibility(4);
                        }
                        this.actionBar.setDrawBlurBackground(qa0Var);
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                        a0();
                        Z();
                        if (this.a == 1 && this.W == 9) {
                            this.V.O0(9.0f);
                        }
                        return qa0Var;
                    }
                    j5VarArr[0].k(LocaleController.getString(R.string.MyNotes));
                    h9Var5.g(22);
                    h9Var5.p = 0.75f;
                    h9Var2 = h9Var5;
                }
                user2 = null;
                h9Var = h9Var2;
                this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", h9Var, user2);
                j5Var = j5VarArr[0];
                if (j5Var != null) {
                    j5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                }
                ta0Var = this.V;
                if (ta0Var.u0(ta0Var.k0[0].F)) {
                    this.V.getSearchItem().setVisibility(0);
                }
                u0Var = this.V.m0;
                if (u0Var != null) {
                }
                if (this.V.getSearchOptionsItem() != null) {
                }
                r10 = 0;
                lu0[] lu0VarArr2 = this.V.k0;
                i12 = lu0VarArr2[r10].F;
                if (i12 != 0) {
                }
                this.V.r0.setVisibility(r10);
                this.actionBar.setDrawBlurBackground(qa0Var);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                a0();
                Z();
                if (this.a == 1) {
                    this.V.O0(9.0f);
                }
                return qa0Var;
            }
            j5VarArr[0].k(LocaleController.getString(R.string.ProfileMyStories));
            j5VarArr[1].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        }
        h9Var2 = h9Var3;
        user2 = null;
        h9Var = h9Var2;
        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", h9Var, user2);
        j5Var = j5VarArr[0];
        if (j5Var != null) {
        }
        ta0Var = this.V;
        if (ta0Var.u0(ta0Var.k0[0].F)) {
        }
        u0Var = this.V.m0;
        if (u0Var != null) {
        }
        if (this.V.getSearchOptionsItem() != null) {
        }
        r10 = 0;
        lu0[] lu0VarArr22 = this.V.k0;
        i12 = lu0VarArr22[r10].F;
        if (i12 != 0) {
        }
        this.V.r0.setVisibility(r10);
        this.actionBar.setDrawBlurBackground(qa0Var);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
        a0();
        Z();
        if (this.a == 1) {
        }
        return qa0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            ta0 ta0Var = this.V;
            if (ta0Var != null) {
                ta0Var.setUserInfo(userFull);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.d6);
        return (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) ? themedColor : getLastStoryViewer().getNavigationBarColor(themedColor);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        z6 z6Var = new z6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.G6));
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false);
            if (this.actionBar.s()) {
                x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
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
        if (!this.V.z0()) {
            return false;
        }
        ta0 ta0Var = this.V;
        return ta0Var.getSelectedTab() == ta0Var.I0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            ta0 ta0Var = this.V;
            if (!ta0Var.C1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                ta0Var.L(false);
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
            this.b = new kv0(this);
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
        ai.x7 x7Var = this.U;
        if (x7Var != null) {
            this.U = null;
            AndroidUtilities.runOnUIThread(x7Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ta0 ta0Var = this.V;
        if (ta0Var != null) {
            ta0Var.setPagesPaddingBottom(i13);
        }
    }
}
