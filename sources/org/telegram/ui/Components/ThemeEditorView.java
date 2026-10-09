package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class ThemeEditorView {
    public static volatile ThemeEditorView n;
    public d21 a;
    public Activity b;
    public ArrayList c;
    public int d;
    public final int e = AndroidUtilities.dp(54.0f);
    public final int f = AndroidUtilities.dp(54.0f);
    public WindowManager.LayoutParams g;
    public WindowManager h;
    public DecelerateInterpolator i;
    public SharedPreferences j;
    public v91 k;
    public EditorAlert l;
    public org.telegram.ui.ActionBar.h6 m;

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public class EditorAlert extends org.telegram.ui.ActionBar.f3 {
        public static final /* synthetic */ int M = 0;
        public int E;
        public int F;
        public int G;
        public boolean H;
        public AnimatorSet I;
        public boolean J;
        public boolean K;
        public final o21 b;
        public final i21 c;
        public final FrameLayout d;
        public final c00 e;
        public final u21 f;
        public final s4.d0 h;
        public final p21 n;
        public final q21 r;
        public final FrameLayout s;
        public final FrameLayout v;
        public final View[] w;
        public final AnimatorSet[] x;
        public final Drawable y;

        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            this.w = new View[2];
            this.x = new AnimatorSet[2];
            this.y = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            h21 h21Var = new h21(this, context);
            this.containerView = h21Var;
            h21Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i10 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            u21 u21Var = new u21(this, context);
            this.f = u21Var;
            frameLayout.addView(u21Var, w7.x5.e(-1, -1, 51));
            i21 i21Var = new i21(this, context);
            this.c = i21Var;
            i21Var.setSelectorDrawableColor(251658240);
            i21Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            i21Var.setClipToPadding(false);
            getContext();
            s4.d0 d0Var = new s4.d0();
            this.h = d0Var;
            i21Var.setLayoutManager(d0Var);
            i21Var.setHorizontalScrollBarEnabled(false);
            i21Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(i21Var, w7.x5.e(-1, -1, 51));
            p21 p21Var = new p21();
            p21Var.d = new ArrayList();
            p21Var.c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) arrayList.get(i11);
                int i12 = k6Var.f;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i12));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i12), arrayList2);
                    p21Var.d.add(arrayList2);
                }
                arrayList2.add(k6Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i13 = org.telegram.ui.ActionBar.i6.a7;
                if (!hashMap.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, i13));
                    p21Var.d.add(arrayList3);
                }
            }
            this.n = p21Var;
            i21Var.setAdapter(p21Var);
            this.r = new q21(this, context);
            this.c.setGlowColor(-657673);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            this.c.setOnItemClickListener(new j(this, 18));
            this.c.setOnScrollListener(new j21(this));
            c00 c00Var = new c00(context, null);
            this.e = c00Var;
            c00Var.setShowAtCenter(true);
            c00Var.c();
            c00Var.setText(LocaleController.getString(R.string.NoResult));
            this.c.setEmptyView(c00Var);
            this.containerView.addView(c00Var, w7.x5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.w[0] = new View(context);
            this.w[0].setBackgroundColor(301989888);
            this.w[0].setAlpha(0.0f);
            this.w[0].setTag(1);
            this.containerView.addView(this.w[0], layoutParams);
            this.containerView.addView(this.d, w7.x5.e(-1, 58, 51));
            o21 o21Var = new o21(this, context);
            this.b = o21Var;
            o21Var.setVisibility(8);
            this.containerView.addView(o21Var, w7.x5.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.w[1] = new View(context);
            this.w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, w7.x5.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, w7.x5.e(-2, -1, 51));
            final int i14 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g21
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = i14;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i15) {
                        case 0:
                            int i16 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.i6.s1(themeEditorView.m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.b = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView2.c.size(); i17++) {
                                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) themeEditorView2.c.get(i17);
                                k6Var2.e(k6Var2.i, k6Var2.j[0], true);
                            }
                            editorAlert.M(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.c.size(); i18++) {
                                org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) themeEditorView3.c.get(i18);
                                k6Var3.e(org.telegram.ui.ActionBar.i6.D0(k6Var3.f), true, true);
                            }
                            editorAlert.M(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.M;
                            editorAlert.M(false);
                            break;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, w7.x5.e(-2, -1, 53));
            final int i15 = 1;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g21
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i15;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i152) {
                        case 0:
                            int i16 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.i6.s1(themeEditorView.m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.b = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView2.c.size(); i17++) {
                                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) themeEditorView2.c.get(i17);
                                k6Var2.e(k6Var2.i, k6Var2.j[0], true);
                            }
                            editorAlert.M(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.c.size(); i18++) {
                                org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) themeEditorView3.c.get(i18);
                                k6Var3.e(org.telegram.ui.ActionBar.i6.D0(k6Var3.f), true, true);
                            }
                            editorAlert.M(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.M;
                            editorAlert.M(false);
                            break;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.v = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.containerView.addView(frameLayout3, w7.x5.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, w7.x5.e(-2, -1, 51));
            final int i16 = 2;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g21
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i16;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i152) {
                        case 0:
                            int i162 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.i6.s1(themeEditorView.m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.b = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView2.c.size(); i17++) {
                                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) themeEditorView2.c.get(i17);
                                k6Var2.e(k6Var2.i, k6Var2.j[0], true);
                            }
                            editorAlert.M(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.c.size(); i18++) {
                                org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) themeEditorView3.c.get(i18);
                                k6Var3.e(org.telegram.ui.ActionBar.i6.D0(k6Var3.f), true, true);
                            }
                            editorAlert.M(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.M;
                            editorAlert.M(false);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, w7.x5.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, w7.x5.e(-2, -1, 51));
            final int i17 = 3;
            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g21
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i17;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i152) {
                        case 0:
                            int i162 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.i6.s1(themeEditorView.m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.b = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i172 = 0; i172 < themeEditorView2.c.size(); i172++) {
                                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) themeEditorView2.c.get(i172);
                                k6Var2.e(k6Var2.i, k6Var2.j[0], true);
                            }
                            editorAlert.M(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.c.size(); i18++) {
                                org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) themeEditorView3.c.get(i18);
                                k6Var3.e(org.telegram.ui.ActionBar.i6.D0(k6Var3.f), true, true);
                            }
                            editorAlert.M(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.M;
                            editorAlert.M(false);
                            break;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, w7.x5.e(-2, -1, 51));
            final int i18 = 4;
            textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g21
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i18;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i152) {
                        case 0:
                            int i162 = ThemeEditorView.EditorAlert.M;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.i6.s1(themeEditorView.m, true, false, false);
                            editorAlert.setOnDismissListener((DialogInterface.OnDismissListener) null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.h.removeView(themeEditorView.a);
                            } catch (Exception unused) {
                            }
                            themeEditorView.b = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i172 = 0; i172 < themeEditorView2.c.size(); i172++) {
                                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) themeEditorView2.c.get(i172);
                                k6Var2.e(k6Var2.i, k6Var2.j[0], true);
                            }
                            editorAlert.M(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i182 = 0; i182 < themeEditorView3.c.size(); i182++) {
                                org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) themeEditorView3.c.get(i182);
                                k6Var3.e(org.telegram.ui.ActionBar.i6.D0(k6Var3.f), true, true);
                            }
                            editorAlert.M(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.M;
                            editorAlert.M(false);
                            break;
                    }
                }
            });
        }

        public static int K(EditorAlert editorAlert) {
            i21 i21Var = editorAlert.c;
            if (i21Var.getChildCount() == 0) {
                return -1000;
            }
            int i10 = 0;
            View childAt = i21Var.getChildAt(0);
            am0 am0Var = (am0) i21Var.G(childAt);
            if (am0Var == null) {
                return -1000;
            }
            int paddingTop = i21Var.getPaddingTop();
            if (am0Var.b() == 0 && childAt.getTop() >= 0) {
                i10 = childAt.getTop();
            }
            return paddingTop - i10;
        }

        public static void u(EditorAlert editorAlert) {
            i21 i21Var = editorAlert.c;
            if (i21Var.getChildCount() <= 0 || i21Var.getVisibility() != 0 || editorAlert.H) {
                return;
            }
            int i10 = 0;
            View childAt = i21Var.getChildAt(0);
            am0 am0Var = (am0) i21Var.G(childAt);
            int paddingTop = (i21Var.getVisibility() != 0 || editorAlert.H) ? i21Var.getPaddingTop() : childAt.getTop() - AndroidUtilities.dp(8.0f);
            if (paddingTop <= (-AndroidUtilities.dp(1.0f)) || am0Var == null || am0Var.b() != 0) {
                editorAlert.L(true);
            } else {
                editorAlert.L(false);
                i10 = paddingTop;
            }
            if (editorAlert.E != i10) {
                editorAlert.setScrollOffsetY(i10);
            }
        }

        public final void L(boolean z10) {
            View[] viewArr = this.w;
            if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
                return;
            }
            viewArr[0].setTag(z10 ? null : 1);
            if (z10) {
                viewArr[0].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.x;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new k21(this, z10));
            animatorSetArr[0].start();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v5 */
        public final void M(boolean z10) {
            ?? r62;
            c00 c00Var = this.e;
            View[] viewArr = this.w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.s;
            FrameLayout frameLayout3 = this.v;
            o21 o21Var = this.b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            i21 i21Var = this.c;
            if (z10) {
                this.H = true;
                o21Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                o21Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.G = this.E;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(o21Var, (Property<o21, Float>) property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property, 1.0f), ObjectAnimator.ofFloat(i21Var, (Property<i21, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(c00Var, (Property<c00, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", i21Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.i);
                animatorSet.addListener(new l21(this));
                animatorSet.start();
                return;
            }
            float f7 = 0.0f;
            Activity activity = themeEditorView.b;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).u0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.i6.s1(themeEditorView.m, r62, r62, r62);
            if (i21Var.getAdapter() == this.n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.H = true;
            i21Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f.setVisibility(r62);
            i21Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o21Var, (Property<o21, Float>) property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(i21Var, (Property<i21, Float>) property2, fArr3);
            char c10 = r62;
            float[] fArr4 = new float[1];
            fArr4[c10] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, fArr4);
            View view = viewArr[c10];
            if (view.getTag() == null) {
                f7 = 1.0f;
            }
            float[] fArr5 = new float[1];
            fArr5[c10] = f7;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr5);
            float[] fArr6 = new float[1];
            fArr6[c10] = 1.0f;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c00Var, (Property<c00, Float>) property2, fArr6);
            float[] fArr7 = new float[1];
            fArr7[c10] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, fArr7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollOffsetY", this.G);
            Animator[] animatorArr = new Animator[8];
            animatorArr[c10] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofFloat4;
            animatorArr[4] = ofFloat5;
            animatorArr[5] = ofFloat6;
            animatorArr[6] = ofFloat7;
            animatorArr[7] = ofInt;
            animatorSet2.playTogether(animatorArr);
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.i);
            animatorSet2.addListener(new m21(this));
            animatorSet2.start();
            i21Var.getAdapter().m(themeEditorView.d);
        }

        @Override // org.telegram.ui.ActionBar.f3
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override // org.telegram.ui.ActionBar.f3
        public final void dismissInternal() {
            super.dismissInternal();
            u21 u21Var = this.f;
            if (u21Var.b.isFocused()) {
                AndroidUtilities.hideKeyboard(u21Var.b);
            }
        }

        public int getScrollOffsetY() {
            return this.E;
        }

        public void setScrollOffsetY(int i10) {
            this.E = i10;
            this.c.setTopGlowOffset(i10);
            this.d.setTranslationY(this.E);
            this.b.setTranslationY(this.E);
            this.e.setTranslationY(this.E);
            this.containerView.invalidate();
        }
    }

    public static int b(boolean z10, int i10, float f7, int i11) {
        int i12;
        if (z10) {
            i12 = AndroidUtilities.displaySize.x;
        } else {
            i12 = AndroidUtilities.displaySize.y - i11;
            i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int dp = i10 == 0 ? AndroidUtilities.dp(10.0f) : i10 == 1 ? (i12 - i11) - AndroidUtilities.dp(10.0f) : Math.round((r0 - AndroidUtilities.dp(20.0f)) * f7) + AndroidUtilities.dp(10.0f);
        return !z10 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + dp : dp;
    }

    public final void a() {
        d21 d21Var;
        this.k.getClass();
        if (this.b == null || (d21Var = this.a) == null) {
            return;
        }
        try {
            this.h.removeViewImmediate(d21Var);
            this.a = null;
        } catch (Exception e7) {
            FileLog.e((Throwable) e7, false);
        }
        try {
            EditorAlert editorAlert = this.l;
            if (editorAlert != null) {
                editorAlert.dismiss();
                this.l = null;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.b = null;
        n = null;
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        if (n != null) {
            n.a();
        }
        this.m = h6Var;
        this.a = new d21(this, activity);
        this.h = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.j = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.j.getInt("sidey", 0);
        float f7 = this.j.getFloat("px", 0.0f);
        float f10 = this.j.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.g = layoutParams;
            int i12 = this.e;
            layoutParams.width = i12;
            layoutParams.height = this.f;
            layoutParams.x = b(true, i10, f7, i12);
            this.g.y = b(false, i11, f10, this.f);
            WindowManager.LayoutParams layoutParams2 = this.g;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.h, this.a, layoutParams2);
            this.h.addView(this.a, this.g);
            this.k = new v91(activity, null, new e21(this));
            n = this;
            this.b = activity;
            d();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void d() {
        this.a.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<d21, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a, (Property<d21, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a, (Property<d21, Float>) View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.i);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.g.x;
    }

    public int getY() {
        return this.g.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.g;
        layoutParams.x = i10;
        this.h.updateViewLayout(this.a, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.g;
        layoutParams.y = i10;
        this.h.updateViewLayout(this.a, layoutParams);
    }
}
