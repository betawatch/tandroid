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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ThemeEditorView {
    public static volatile ThemeEditorView n;
    public e01 a;
    public Activity b;
    public ArrayList c;
    public int d;
    public final int e = AndroidUtilities.dp(54.0f);
    public final int f = AndroidUtilities.dp(54.0f);
    public WindowManager.LayoutParams g;
    public WindowManager h;
    public DecelerateInterpolator i;
    public SharedPreferences j;
    public u71 k;
    public EditorAlert l;
    public org.telegram.ui.ActionBar.e6 m;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public class EditorAlert extends org.telegram.ui.ActionBar.f3 {
        public static final /* synthetic */ int I = 0;
        public int A;
        public int B;
        public int C;
        public boolean D;
        public AnimatorSet E;
        public boolean F;
        public boolean G;
        public final p01 b;
        public final j01 c;
        public final FrameLayout d;
        public final yy e;
        public final v01 f;
        public final f2.m0 h;
        public final q01 n;
        public final r01 r;
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
            i01 i01Var = new i01(this, context);
            this.containerView = i01Var;
            i01Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i9 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i9, 0, i9, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setBackgroundColor(-1);
            v01 v01Var = new v01(this, context);
            this.f = v01Var;
            frameLayout.addView(v01Var, g7.e6.e(-1, -1, 51));
            j01 j01Var = new j01(this, context);
            this.c = j01Var;
            j01Var.setSelectorDrawableColor(251658240);
            j01Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            j01Var.setClipToPadding(false);
            getContext();
            f2.m0 m0Var = new f2.m0();
            this.h = m0Var;
            j01Var.setLayoutManager(m0Var);
            j01Var.setHorizontalScrollBarEnabled(false);
            j01Var.setVerticalScrollBarEnabled(false);
            this.containerView.addView(j01Var, g7.e6.e(-1, -1, 51));
            q01 q01Var = new q01();
            q01Var.d = new ArrayList();
            q01Var.c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) arrayList.get(i10);
                int i11 = h6Var.f;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i11));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i11), arrayList2);
                    q01Var.d.add(arrayList2);
                }
                arrayList2.add(h6Var);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                int i12 = org.telegram.ui.ActionBar.f6.a7;
                if (!hashMap.containsKey(Integer.valueOf(i12))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, i12));
                    q01Var.d.add(arrayList3);
                }
            }
            this.n = q01Var;
            j01Var.setAdapter(q01Var);
            this.r = new r01(this, context);
            this.c.setGlowColor(-657673);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            this.c.setOnItemClickListener(new j(this, 18));
            this.c.setOnScrollListener(new k01(this));
            yy yyVar = new yy(context, null);
            this.e = yyVar;
            yyVar.setShowAtCenter(true);
            yyVar.c();
            yyVar.setText(LocaleController.getString(R.string.NoResult));
            this.c.setEmptyView(yyVar);
            this.containerView.addView(yyVar, g7.e6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.w[0] = new View(context);
            this.w[0].setBackgroundColor(301989888);
            this.w[0].setAlpha(0.0f);
            this.w[0].setTag(1);
            this.containerView.addView(this.w[0], layoutParams);
            this.containerView.addView(this.d, g7.e6.e(-1, 58, 51));
            p01 p01Var = new p01(this, context);
            this.b = p01Var;
            p01Var.setVisibility(8);
            this.containerView.addView(p01Var, g7.e6.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.w[1] = new View(context);
            this.w[1].setBackgroundColor(301989888);
            this.containerView.addView(this.w[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.s = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.containerView.addView(frameLayout2, g7.e6.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView, g7.e6.e(-2, -1, 51));
            final int i13 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h01
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14 = i13;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i14) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.f6.r1(themeEditorView.m, true, false, false);
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
                            for (int i16 = 0; i16 < themeEditorView2.c.size(); i16++) {
                                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) themeEditorView2.c.get(i16);
                                h6Var2.d(h6Var2.i, h6Var2.j[0], true);
                            }
                            editorAlert.K(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.c.size(); i17++) {
                                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) themeEditorView3.c.get(i17);
                                h6Var3.d(org.telegram.ui.ActionBar.f6.C0(h6Var3.f), true, true);
                            }
                            editorAlert.K(false);
                            break;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            break;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout2.addView(textView2, g7.e6.e(-2, -1, 53));
            final int i14 = 1;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h01
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i14;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i142) {
                        case 0:
                            int i15 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.f6.r1(themeEditorView.m, true, false, false);
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
                            for (int i16 = 0; i16 < themeEditorView2.c.size(); i16++) {
                                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) themeEditorView2.c.get(i16);
                                h6Var2.d(h6Var2.i, h6Var2.j[0], true);
                            }
                            editorAlert.K(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.c.size(); i17++) {
                                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) themeEditorView3.c.get(i17);
                                h6Var3.d(org.telegram.ui.ActionBar.f6.C0(h6Var3.f), true, true);
                            }
                            editorAlert.K(false);
                            break;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            break;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.v = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.containerView.addView(frameLayout3, g7.e6.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            frameLayout3.addView(textView3, g7.e6.e(-2, -1, 51));
            final int i15 = 2;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h01
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i15;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i142) {
                        case 0:
                            int i152 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.f6.r1(themeEditorView.m, true, false, false);
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
                            for (int i16 = 0; i16 < themeEditorView2.c.size(); i16++) {
                                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) themeEditorView2.c.get(i16);
                                h6Var2.d(h6Var2.i, h6Var2.j[0], true);
                            }
                            editorAlert.K(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.c.size(); i17++) {
                                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) themeEditorView3.c.get(i17);
                                h6Var3.d(org.telegram.ui.ActionBar.f6.C0(h6Var3.f), true, true);
                            }
                            editorAlert.K(false);
                            break;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, g7.e6.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, g7.e6.e(-2, -1, 51));
            final int i16 = 3;
            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h01
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i16;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i142) {
                        case 0:
                            int i152 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.f6.r1(themeEditorView.m, true, false, false);
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
                            for (int i162 = 0; i162 < themeEditorView2.c.size(); i162++) {
                                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) themeEditorView2.c.get(i162);
                                h6Var2.d(h6Var2.i, h6Var2.j[0], true);
                            }
                            editorAlert.K(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView3.c.size(); i17++) {
                                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) themeEditorView3.c.get(i17);
                                h6Var3.d(org.telegram.ui.ActionBar.f6.C0(h6Var3.f), true, true);
                            }
                            editorAlert.K(false);
                            break;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            break;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, g7.e6.e(-2, -1, 51));
            final int i17 = 4;
            textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h01
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i17;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i142) {
                        case 0:
                            int i152 = ThemeEditorView.EditorAlert.I;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.f6.r1(themeEditorView.m, true, false, false);
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
                            for (int i162 = 0; i162 < themeEditorView2.c.size(); i162++) {
                                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) themeEditorView2.c.get(i162);
                                h6Var2.d(h6Var2.i, h6Var2.j[0], true);
                            }
                            editorAlert.K(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i172 = 0; i172 < themeEditorView3.c.size(); i172++) {
                                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) themeEditorView3.c.get(i172);
                                h6Var3.d(org.telegram.ui.ActionBar.f6.C0(h6Var3.f), true, true);
                            }
                            editorAlert.K(false);
                            break;
                        default:
                            int i18 = ThemeEditorView.EditorAlert.I;
                            editorAlert.K(false);
                            break;
                    }
                }
            });
        }

        public static int I(EditorAlert editorAlert) {
            j01 j01Var = editorAlert.c;
            if (j01Var.getChildCount() == 0) {
                return -1000;
            }
            int i9 = 0;
            View childAt = j01Var.getChildAt(0);
            ik0 ik0Var = (ik0) j01Var.G(childAt);
            if (ik0Var == null) {
                return -1000;
            }
            int paddingTop = j01Var.getPaddingTop();
            if (ik0Var.b() == 0 && childAt.getTop() >= 0) {
                i9 = childAt.getTop();
            }
            return paddingTop - i9;
        }

        public static void s(EditorAlert editorAlert) {
            j01 j01Var = editorAlert.c;
            if (j01Var.getChildCount() <= 0 || j01Var.getVisibility() != 0 || editorAlert.D) {
                return;
            }
            int i9 = 0;
            View childAt = j01Var.getChildAt(0);
            ik0 ik0Var = (ik0) j01Var.G(childAt);
            int paddingTop = (j01Var.getVisibility() != 0 || editorAlert.D) ? j01Var.getPaddingTop() : childAt.getTop() - AndroidUtilities.dp(8.0f);
            if (paddingTop <= (-AndroidUtilities.dp(1.0f)) || ik0Var == null || ik0Var.b() != 0) {
                editorAlert.J(true);
            } else {
                editorAlert.J(false);
                i9 = paddingTop;
            }
            if (editorAlert.A != i9) {
                editorAlert.setScrollOffsetY(i9);
            }
        }

        public final void J(boolean z10) {
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
            animatorSetArr[0].addListener(new l01(this, z10));
            animatorSetArr[0].start();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v5 */
        public final void K(boolean z10) {
            ?? r62;
            yy yyVar = this.e;
            View[] viewArr = this.w;
            FrameLayout frameLayout = this.d;
            FrameLayout frameLayout2 = this.s;
            FrameLayout frameLayout3 = this.v;
            p01 p01Var = this.b;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            j01 j01Var = this.c;
            if (z10) {
                this.D = true;
                p01Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                p01Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.C = this.A;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(p01Var, (Property<p01, Float>) property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property, 1.0f), ObjectAnimator.ofFloat(j01Var, (Property<j01, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(yyVar, (Property<yy, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", j01Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.i);
                animatorSet.addListener(new m01(this));
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
            org.telegram.ui.ActionBar.f6.r1(themeEditorView.m, r62, r62, r62);
            if (j01Var.getAdapter() == this.n) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.D = true;
            j01Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.f.setVisibility(r62);
            j01Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p01Var, (Property<p01, Float>) property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(j01Var, (Property<j01, Float>) property2, fArr3);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, 1.0f);
            View view = viewArr[0];
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, view.getTag() == null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(yyVar, (Property<yy, Float>) property2, 1.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, 1.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", this.C));
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.i);
            animatorSet2.addListener(new n01(this));
            animatorSet2.start();
            j01Var.getAdapter().m(themeEditorView.d);
        }

        @Override // org.telegram.ui.ActionBar.f3
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override // org.telegram.ui.ActionBar.f3
        public final void dismissInternal() {
            super.dismissInternal();
            v01 v01Var = this.f;
            if (v01Var.b.isFocused()) {
                AndroidUtilities.hideKeyboard(v01Var.b);
            }
        }

        public int getScrollOffsetY() {
            return this.A;
        }

        public void setScrollOffsetY(int i9) {
            this.A = i9;
            this.c.setTopGlowOffset(i9);
            this.d.setTranslationY(this.A);
            this.b.setTranslationY(this.A);
            this.e.setTranslationY(this.A);
            this.containerView.invalidate();
        }
    }

    public static int b(boolean z10, int i9, float f10, int i10) {
        int i11;
        if (z10) {
            i11 = AndroidUtilities.displaySize.x;
        } else {
            i11 = AndroidUtilities.displaySize.y - i10;
            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int dp = i9 == 0 ? AndroidUtilities.dp(10.0f) : i9 == 1 ? (i11 - i10) - AndroidUtilities.dp(10.0f) : Math.round((r0 - AndroidUtilities.dp(20.0f)) * f10) + AndroidUtilities.dp(10.0f);
        return !z10 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + dp : dp;
    }

    public final void a() {
        e01 e01Var;
        this.k.getClass();
        if (this.b == null || (e01Var = this.a) == null) {
            return;
        }
        try {
            this.h.removeViewImmediate(e01Var);
            this.a = null;
        } catch (Exception e10) {
            FileLog.e((Throwable) e10, false);
        }
        try {
            EditorAlert editorAlert = this.l;
            if (editorAlert != null) {
                editorAlert.dismiss();
                this.l = null;
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        this.b = null;
        n = null;
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        if (n != null) {
            n.a();
        }
        this.m = e6Var;
        this.a = new e01(this, activity);
        this.h = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.j = sharedPreferences;
        int i9 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.j.getInt("sidey", 0);
        float f10 = this.j.getFloat("px", 0.0f);
        float f11 = this.j.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.g = layoutParams;
            int i11 = this.e;
            layoutParams.width = i11;
            layoutParams.height = this.f;
            layoutParams.x = b(true, i9, f10, i11);
            this.g.y = b(false, i10, f11, this.f);
            WindowManager.LayoutParams layoutParams2 = this.g;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.h, this.a, layoutParams2);
            this.h.addView(this.a, this.g);
            this.k = new u71(activity, null, new f01(this));
            n = this;
            this.b = activity;
            d();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void d() {
        this.a.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<e01, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a, (Property<e01, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a, (Property<e01, Float>) View.SCALE_Y, 0.0f, 1.0f));
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

    public void setX(int i9) {
        WindowManager.LayoutParams layoutParams = this.g;
        layoutParams.x = i9;
        this.h.updateViewLayout(this.a, layoutParams);
    }

    public void setY(int i9) {
        WindowManager.LayoutParams layoutParams = this.g;
        layoutParams.y = i9;
        this.h.updateViewLayout(this.a, layoutParams);
    }
}
