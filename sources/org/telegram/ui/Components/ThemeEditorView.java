package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class ThemeEditorView {
    public static volatile ThemeEditorView n;
    public b11 a;
    public Activity b;
    public ArrayList c;
    public int d;
    public final int e = AndroidUtilities.dp(54.0f);
    public final int f = AndroidUtilities.dp(54.0f);
    public WindowManager.LayoutParams g;
    public WindowManager h;
    public DecelerateInterpolator i;
    public SharedPreferences j;
    public s81 k;
    public EditorAlert l;
    public org.telegram.ui.ActionBar.j6 m;

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public class EditorAlert extends org.telegram.ui.ActionBar.h3 {
        public static final /* synthetic */ int J = 0;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public AnimatorSet F;
        public boolean G;
        public boolean H;
        public final m11 b;
        public final g11 c;
        public final FrameLayout d;
        public final oz e;
        public final s11 f;
        public final f2.j0 h;
        public final n11 n;
        public final o11 r;
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
            f11 f11Var = new f11(this, context);
            this.containerView = f11Var;
            f11Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i10 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            s11 s11Var = new s11(this, context);
            this.f = s11Var;
            frameLayout.addView(s11Var, k7.c6.e(-1, -1, 51));
            g11 g11Var = new g11(this, context);
            this.c = g11Var;
            g11Var.setSelectorDrawableColor(251658240);
            g11Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            g11Var.setClipToPadding(false);
            getContext();
            f2.j0 j0Var = new f2.j0();
            this.h = j0Var;
            g11Var.setLayoutManager(j0Var);
            g11Var.setHorizontalScrollBarEnabled(false);
            g11Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(g11Var, k7.c6.e(-1, -1, 51));
            n11 n11Var = new n11();
            n11Var.d = new ArrayList();
            n11Var.c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) arrayList.get(i11);
                int i12 = m6Var.f;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i12));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i12), arrayList2);
                    n11Var.d.add(arrayList2);
                }
                arrayList2.add(m6Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i13 = org.telegram.ui.ActionBar.k6.a7;
                if (!hashMap.containsKey(Integer.valueOf(i13))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, i13));
                    n11Var.d.add(arrayList3);
                }
            }
            this.n = n11Var;
            g11Var.setAdapter(n11Var);
            this.r = new o11(this, context);
            this.c.setGlowColor(-657673);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            this.c.setOnItemClickListener(new k(this, 18));
            this.c.setOnScrollListener(new h11(this));
            oz ozVar = new oz(context, null);
            this.e = ozVar;
            ozVar.setShowAtCenter(true);
            ozVar.c();
            ozVar.setText(LocaleController.getString(R.string.NoResult));
            this.c.setEmptyView(ozVar);
            this.containerView.addView(ozVar, k7.c6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.w[0] = new View(context);
            this.w[0].setBackgroundColor(301989888);
            this.w[0].setAlpha(0.0f);
            this.w[0].setTag(1);
            this.containerView.addView(this.w[0], layoutParams);
            this.containerView.addView(this.d, k7.c6.e(-1, 58, 51));
            m11 m11Var = new m11(this, context);
            this.b = m11Var;
            m11Var.setVisibility(8);
            this.containerView.addView(m11Var, k7.c6.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.w[1] = new View(context);
            this.w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, k7.c6.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, k7.c6.e(-2, -1, 51));
            final int i14 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e11
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
                            int i16 = ThemeEditorView.EditorAlert.J;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.r1(themeEditorView.m, true, false, false);
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
                                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) themeEditorView2.c.get(i17);
                                m6Var2.d(m6Var2.i, m6Var2.j[0], true);
                            }
                            editorAlert.K(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.c.size(); i18++) {
                                org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) themeEditorView3.c.get(i18);
                                m6Var3.d(org.telegram.ui.ActionBar.k6.C0(m6Var3.f), true, true);
                            }
                            editorAlert.K(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.J;
                            editorAlert.K(false);
                            break;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, k7.c6.e(-2, -1, 53));
            final int i15 = 1;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e11
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
                            int i16 = ThemeEditorView.EditorAlert.J;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.r1(themeEditorView.m, true, false, false);
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
                                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) themeEditorView2.c.get(i17);
                                m6Var2.d(m6Var2.i, m6Var2.j[0], true);
                            }
                            editorAlert.K(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.c.size(); i18++) {
                                org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) themeEditorView3.c.get(i18);
                                m6Var3.d(org.telegram.ui.ActionBar.k6.C0(m6Var3.f), true, true);
                            }
                            editorAlert.K(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.J;
                            editorAlert.K(false);
                            break;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.v = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.containerView.addView(frameLayout3, k7.c6.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, k7.c6.e(-2, -1, 51));
            final int i16 = 2;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e11
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
                            int i162 = ThemeEditorView.EditorAlert.J;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.r1(themeEditorView.m, true, false, false);
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
                                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) themeEditorView2.c.get(i17);
                                m6Var2.d(m6Var2.i, m6Var2.j[0], true);
                            }
                            editorAlert.K(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.c.size(); i18++) {
                                org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) themeEditorView3.c.get(i18);
                                m6Var3.d(org.telegram.ui.ActionBar.k6.C0(m6Var3.f), true, true);
                            }
                            editorAlert.K(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.J;
                            editorAlert.K(false);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, k7.c6.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, k7.c6.e(-2, -1, 51));
            final int i17 = 3;
            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e11
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
                            int i162 = ThemeEditorView.EditorAlert.J;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.r1(themeEditorView.m, true, false, false);
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
                                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) themeEditorView2.c.get(i172);
                                m6Var2.d(m6Var2.i, m6Var2.j[0], true);
                            }
                            editorAlert.K(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.c.size(); i18++) {
                                org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) themeEditorView3.c.get(i18);
                                m6Var3.d(org.telegram.ui.ActionBar.k6.C0(m6Var3.f), true, true);
                            }
                            editorAlert.K(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.J;
                            editorAlert.K(false);
                            break;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, k7.c6.e(-2, -1, 51));
            final int i18 = 4;
            textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e11
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
                            int i162 = ThemeEditorView.EditorAlert.J;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.r1(themeEditorView.m, true, false, false);
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
                                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) themeEditorView2.c.get(i172);
                                m6Var2.d(m6Var2.i, m6Var2.j[0], true);
                            }
                            editorAlert.K(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i182 = 0; i182 < themeEditorView3.c.size(); i182++) {
                                org.telegram.ui.ActionBar.m6 m6Var3 = (org.telegram.ui.ActionBar.m6) themeEditorView3.c.get(i182);
                                m6Var3.d(org.telegram.ui.ActionBar.k6.C0(m6Var3.f), true, true);
                            }
                            editorAlert.K(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.J;
                            editorAlert.K(false);
                            break;
                    }
                }
            });
        }

        public static int I(EditorAlert editorAlert) {
            g11 g11Var = editorAlert.c;
            if (g11Var.getChildCount() == 0) {
                return -1000;
            }
            int i10 = 0;
            View childAt = g11Var.getChildAt(0);
            el0 el0Var = (el0) g11Var.G(childAt);
            if (el0Var == null) {
                return -1000;
            }
            int paddingTop = g11Var.getPaddingTop();
            if (el0Var.b() == 0 && childAt.getTop() >= 0) {
                i10 = childAt.getTop();
            }
            return paddingTop - i10;
        }

        public static void s(EditorAlert editorAlert) {
            g11 g11Var = editorAlert.c;
            if (g11Var.getChildCount() <= 0 || g11Var.getVisibility() != 0 || editorAlert.E) {
                return;
            }
            int i10 = 0;
            View childAt = g11Var.getChildAt(0);
            el0 el0Var = (el0) g11Var.G(childAt);
            int paddingTop = (g11Var.getVisibility() != 0 || editorAlert.E) ? g11Var.getPaddingTop() : childAt.getTop() - AndroidUtilities.dp(8.0f);
            if (paddingTop <= (-AndroidUtilities.dp(1.0f)) || el0Var == null || el0Var.b() != 0) {
                editorAlert.J(true);
            } else {
                editorAlert.J(false);
                i10 = paddingTop;
            }
            if (editorAlert.B != i10) {
                editorAlert.setScrollOffsetY(i10);
            }
        }

        public final void J(boolean z4) {
            View[] viewArr = this.w;
            if ((!z4 || viewArr[0].getTag() == null) && (z4 || viewArr[0].getTag() != null)) {
                return;
            }
            viewArr[0].setTag(z4 ? null : 1);
            if (z4) {
                viewArr[0].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.x;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new i11(this, z4));
            animatorSetArr[0].start();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v5 */
        public final void K(boolean z4) {
            ?? r62;
            oz ozVar = this.e;
            View[] viewArr = this.w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.s;
            FrameLayout frameLayout3 = this.v;
            m11 m11Var = this.b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            g11 g11Var = this.c;
            if (z4) {
                this.E = true;
                m11Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                m11Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.D = this.B;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(m11Var, (Property<m11, Float>) property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property, 1.0f), ObjectAnimator.ofFloat(g11Var, (Property<g11, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(ozVar, (Property<oz, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", g11Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.i);
                animatorSet.addListener(new j11(this));
                animatorSet.start();
                return;
            }
            Activity activity = themeEditorView.b;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).u0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.k6.r1(themeEditorView.m, r62, r62, r62);
            if (g11Var.getAdapter() == this.n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.E = true;
            g11Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f.setVisibility(r62);
            g11Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m11Var, (Property<m11, Float>) property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(g11Var, (Property<g11, Float>) property2, fArr3);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, 1.0f);
            View view = viewArr[0];
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, view.getTag() == null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(ozVar, (Property<oz, Float>) property2, 1.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, 1.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", this.D));
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.i);
            animatorSet2.addListener(new k11(this));
            animatorSet2.start();
            g11Var.getAdapter().m(themeEditorView.d);
        }

        @Override // org.telegram.ui.ActionBar.h3
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override // org.telegram.ui.ActionBar.h3
        public final void dismissInternal() {
            super.dismissInternal();
            s11 s11Var = this.f;
            if (s11Var.b.isFocused()) {
                AndroidUtilities.hideKeyboard(s11Var.b);
            }
        }

        public int getScrollOffsetY() {
            return this.B;
        }

        public void setScrollOffsetY(int i10) {
            this.B = i10;
            this.c.setTopGlowOffset(i10);
            this.d.setTranslationY(this.B);
            this.b.setTranslationY(this.B);
            this.e.setTranslationY(this.B);
            this.containerView.invalidate();
        }
    }

    public static int b(boolean z4, int i10, float f10, int i11) {
        int i12;
        if (z4) {
            i12 = AndroidUtilities.displaySize.x;
        } else {
            i12 = AndroidUtilities.displaySize.y - i11;
            i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int dp = i10 == 0 ? AndroidUtilities.dp(10.0f) : i10 == 1 ? (i12 - i11) - AndroidUtilities.dp(10.0f) : Math.round((r0 - AndroidUtilities.dp(20.0f)) * f10) + AndroidUtilities.dp(10.0f);
        return !z4 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + dp : dp;
    }

    public final void a() {
        b11 b11Var;
        this.k.getClass();
        if (this.b == null || (b11Var = this.a) == null) {
            return;
        }
        try {
            this.h.removeViewImmediate(b11Var);
            this.a = null;
        } catch (Exception e6) {
            FileLog.e((Throwable) e6, false);
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

    public final void c(Activity activity, org.telegram.ui.ActionBar.j6 j6Var) {
        if (n != null) {
            n.a();
        }
        this.m = j6Var;
        this.a = new b11(this, activity);
        this.h = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.j = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.j.getInt("sidey", 0);
        float f10 = this.j.getFloat("px", 0.0f);
        float f11 = this.j.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.g = layoutParams;
            int i12 = this.e;
            layoutParams.width = i12;
            layoutParams.height = this.f;
            layoutParams.x = b(true, i10, f10, i12);
            this.g.y = b(false, i11, f11, this.f);
            WindowManager.LayoutParams layoutParams2 = this.g;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.h, this.a, layoutParams2);
            this.h.addView(this.a, this.g);
            this.k = new s81(activity, null, new c11(this));
            n = this;
            this.b = activity;
            d();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void d() {
        this.a.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<b11, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a, (Property<b11, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a, (Property<b11, Float>) View.SCALE_Y, 0.0f, 1.0f));
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
