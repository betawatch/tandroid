package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
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
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ThemeEditorView {
    public static volatile ThemeEditorView p;
    public boolean a;
    public i01 c;
    public Activity d;
    public ArrayList e;
    public int f;
    public WindowManager.LayoutParams i;
    public WindowManager j;
    public DecelerateInterpolator k;
    public SharedPreferences l;
    public bh.d m;
    public EditorAlert n;
    public org.telegram.ui.ActionBar.s6 o;
    public final ew b = new ew(this, 14);
    public final int g = org.telegram.messenger.i0.L(54.0f);
    public final int h = org.telegram.messenger.i0.L(54.0f);

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public class EditorAlert extends org.telegram.ui.ActionBar.z2 {
        public static final /* synthetic */ int D1 = 0;
        public boolean A1;
        public boolean B1;
        public final t01 i1;
        public final n01 j1;
        public final FrameLayout k1;
        public final xy l1;
        public final z01 m1;
        public final s4.a0 n1;
        public final u01 o1;
        public final v01 p1;
        public final FrameLayout q1;
        public final FrameLayout r1;
        public final View[] s1;
        public final AnimatorSet[] t1;
        public final Drawable u1;
        public int v1;
        public int w1;
        public int x1;
        public boolean y1;
        public AnimatorSet z1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            final int i10 = 1;
            this.s1 = new View[2];
            this.t1 = new AnimatorSet[2];
            this.u1 = i0.a.f(context, R.drawable.sheet_shadow_round);
            m01 m01Var = new m01(this, context);
            this.b = m01Var;
            final int i11 = 0;
            m01Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.b;
            int i12 = this.t0;
            viewGroup.setPadding(i12, 0, i12, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.k1 = frameLayout;
            frameLayout.setBackgroundColor(-1);
            z01 z01Var = new z01(this, context);
            this.m1 = z01Var;
            frameLayout.addView(z01Var, w7.b6.e(-1, -1, 51));
            n01 n01Var = new n01(this, context);
            this.j1 = n01Var;
            n01Var.setSelectorDrawableColor(251658240);
            float f7 = 48.0f;
            n01Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(48.0f));
            n01Var.setClipToPadding(false);
            getContext();
            s4.a0 a0Var = new s4.a0();
            this.n1 = a0Var;
            n01Var.setLayoutManager(a0Var);
            n01Var.setHorizontalScrollBarEnabled(false);
            n01Var.setVerticalScrollBarEnabled(false);
            this.b.addView(n01Var, w7.b6.e(-1, -1, 51));
            u01 u01Var = new u01();
            u01Var.d = new ArrayList();
            u01Var.c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) arrayList.get(i13);
                int i14 = c7Var.e;
                float f10 = f7;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i14));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i14), arrayList2);
                    u01Var.d.add(arrayList2);
                }
                arrayList2.add(c7Var);
                i13++;
                f7 = f10;
            }
            float f11 = f7;
            if (Build.VERSION.SDK_INT >= 26) {
                int i15 = org.telegram.ui.ActionBar.t6.a7;
                if (!hashMap.containsKey(Integer.valueOf(i15))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
                    u01Var.d.add(arrayList3);
                }
            }
            this.o1 = u01Var;
            n01Var.setAdapter(u01Var);
            this.p1 = new v01(this, context);
            this.j1.setGlowColor(-657673);
            this.j1.setItemAnimator(null);
            this.j1.setLayoutAnimation(null);
            this.j1.setOnItemClickListener(new k(this, 18));
            this.j1.setOnScrollListener(new o01(this));
            xy xyVar = new xy(context, null);
            this.l1 = xyVar;
            xyVar.setShowAtCenter(true);
            xyVar.c();
            xyVar.setText(org.telegram.messenger.cd.L0(2131748183, null));
            this.j1.setEmptyView(xyVar);
            this.b.addView(xyVar, w7.b6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 51);
            layoutParams.topMargin = org.telegram.messenger.i0.L(58.0f);
            this.s1[0] = new View(context);
            this.s1[0].setBackgroundColor(301989888);
            this.s1[0].setAlpha(0.0f);
            this.s1[0].setTag(1);
            this.b.addView(this.s1[0], layoutParams);
            this.b.addView(this.k1, w7.b6.e(-1, 58, 51));
            t01 t01Var = new t01(this, context);
            this.i1 = t01Var;
            t01Var.setVisibility(8);
            this.b.addView(t01Var, w7.b6.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83);
            layoutParams2.bottomMargin = org.telegram.messenger.i0.L(f11);
            this.s1[1] = new View(context);
            this.s1[1].setBackgroundColor(301989888);
            this.b.addView(this.s1[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.q1 = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.b.addView(frameLayout2, w7.b6.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(788529152, 0, -1));
            textView.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView.setText(org.telegram.messenger.cd.L0(2131752040, null).toUpperCase());
            textView.setTypeface(org.telegram.messenger.i0.o());
            frameLayout2.addView(textView, w7.b6.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l01
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = i11;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i16) {
                        case 0:
                            int i17 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.t6.x1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView2.e.size(); i18++) {
                                org.telegram.ui.ActionBar.c7 c7Var2 = (org.telegram.ui.ActionBar.c7) themeEditorView2.e.get(i18);
                                c7Var2.e(c7Var2.h, c7Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i19 = 0; i19 < themeEditorView3.e.size(); i19++) {
                                org.telegram.ui.ActionBar.c7 c7Var3 = (org.telegram.ui.ActionBar.c7) themeEditorView3.e.get(i19);
                                c7Var3.e(org.telegram.ui.ActionBar.t6.F0(c7Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            break;
                        default:
                            int i20 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            break;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(788529152, 0, -1));
            textView2.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView2.setText(org.telegram.messenger.cd.L0(2131745949, null).toUpperCase());
            textView2.setTypeface(org.telegram.messenger.i0.o());
            frameLayout2.addView(textView2, w7.b6.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l01
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = i10;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i16) {
                        case 0:
                            int i17 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.t6.x1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView2.e.size(); i18++) {
                                org.telegram.ui.ActionBar.c7 c7Var2 = (org.telegram.ui.ActionBar.c7) themeEditorView2.e.get(i18);
                                c7Var2.e(c7Var2.h, c7Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i19 = 0; i19 < themeEditorView3.e.size(); i19++) {
                                org.telegram.ui.ActionBar.c7 c7Var3 = (org.telegram.ui.ActionBar.c7) themeEditorView3.e.get(i19);
                                c7Var3.e(org.telegram.ui.ActionBar.t6.F0(c7Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            break;
                        default:
                            int i20 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            break;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.r1 = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.b.addView(frameLayout3, w7.b6.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(788529152, 0, -1));
            textView3.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView3.setText(org.telegram.messenger.cd.L0(2131752589, null).toUpperCase());
            textView3.setTypeface(org.telegram.messenger.i0.o());
            frameLayout3.addView(textView3, w7.b6.e(-2, -1, 51));
            final int i16 = 2;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l01
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162 = i16;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i162) {
                        case 0:
                            int i17 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.t6.x1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView2.e.size(); i18++) {
                                org.telegram.ui.ActionBar.c7 c7Var2 = (org.telegram.ui.ActionBar.c7) themeEditorView2.e.get(i18);
                                c7Var2.e(c7Var2.h, c7Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i19 = 0; i19 < themeEditorView3.e.size(); i19++) {
                                org.telegram.ui.ActionBar.c7 c7Var3 = (org.telegram.ui.ActionBar.c7) themeEditorView3.e.get(i19);
                                c7Var3.e(org.telegram.ui.ActionBar.t6.F0(c7Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            break;
                        default:
                            int i20 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, w7.b6.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(788529152, 0, -1));
            textView4.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView4.setText(org.telegram.messenger.cd.L0(2131751601, null).toUpperCase());
            textView4.setTypeface(org.telegram.messenger.i0.o());
            linearLayout.addView(textView4, w7.b6.e(-2, -1, 51));
            final int i17 = 3;
            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l01
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162 = i17;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i162) {
                        case 0:
                            int i172 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.t6.x1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView2.e.size(); i18++) {
                                org.telegram.ui.ActionBar.c7 c7Var2 = (org.telegram.ui.ActionBar.c7) themeEditorView2.e.get(i18);
                                c7Var2.e(c7Var2.h, c7Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i19 = 0; i19 < themeEditorView3.e.size(); i19++) {
                                org.telegram.ui.ActionBar.c7 c7Var3 = (org.telegram.ui.ActionBar.c7) themeEditorView3.e.get(i19);
                                c7Var3.e(org.telegram.ui.ActionBar.t6.F0(c7Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            break;
                        default:
                            int i20 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            break;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(788529152, 0, -1));
            textView5.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView5.setText(org.telegram.messenger.cd.L0(2131745963, null).toUpperCase());
            textView5.setTypeface(org.telegram.messenger.i0.o());
            linearLayout.addView(textView5, w7.b6.e(-2, -1, 51));
            final int i18 = 4;
            textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l01
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162 = i18;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i162) {
                        case 0:
                            int i172 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.t6.x1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i182 = 0; i182 < themeEditorView2.e.size(); i182++) {
                                org.telegram.ui.ActionBar.c7 c7Var2 = (org.telegram.ui.ActionBar.c7) themeEditorView2.e.get(i182);
                                c7Var2.e(c7Var2.h, c7Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i19 = 0; i19 < themeEditorView3.e.size(); i19++) {
                                org.telegram.ui.ActionBar.c7 c7Var3 = (org.telegram.ui.ActionBar.c7) themeEditorView3.e.get(i19);
                                c7Var3.e(org.telegram.ui.ActionBar.t6.F0(c7Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            break;
                        default:
                            int i20 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            break;
                    }
                }
            });
        }

        public static void I0(EditorAlert editorAlert) {
            n01 n01Var = editorAlert.j1;
            if (n01Var.getChildCount() <= 0 || n01Var.getVisibility() != 0 || editorAlert.y1) {
                return;
            }
            int i10 = 0;
            View childAt = n01Var.getChildAt(0);
            ck0 ck0Var = (ck0) n01Var.G(childAt);
            int paddingTop = (n01Var.getVisibility() != 0 || editorAlert.y1) ? n01Var.getPaddingTop() : childAt.getTop() - org.telegram.messenger.i0.L(8.0f);
            if (paddingTop <= (-org.telegram.messenger.i0.L(1.0f)) || ck0Var == null || ck0Var.b() != 0) {
                editorAlert.K0(true);
            } else {
                editorAlert.K0(false);
                i10 = paddingTop;
            }
            if (editorAlert.v1 != i10) {
                editorAlert.setScrollOffsetY(i10);
            }
        }

        public static int J0(EditorAlert editorAlert) {
            n01 n01Var = editorAlert.j1;
            if (n01Var.getChildCount() == 0) {
                return -1000;
            }
            int i10 = 0;
            View childAt = n01Var.getChildAt(0);
            ck0 ck0Var = (ck0) n01Var.G(childAt);
            if (ck0Var == null) {
                return -1000;
            }
            int paddingTop = n01Var.getPaddingTop();
            if (ck0Var.b() == 0 && childAt.getTop() >= 0) {
                i10 = childAt.getTop();
            }
            return paddingTop - i10;
        }

        @Override // org.telegram.ui.ActionBar.z2
        public final boolean H() {
            return false;
        }

        public final void K0(boolean z10) {
            View[] viewArr = this.s1;
            if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
                return;
            }
            viewArr[0].setTag(z10 ? null : 1);
            if (z10) {
                viewArr[0].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.t1;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new p01(this, z10));
            animatorSetArr[0].start();
        }

        @Override // org.telegram.ui.ActionBar.z2
        public final void L() {
            super.L();
            z01 z01Var = this.m1;
            if (z01Var.b.isFocused()) {
                org.telegram.messenger.i0.v1(z01Var.b);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v5 */
        public final void L0(boolean z10) {
            ?? r62;
            xy xyVar = this.l1;
            View[] viewArr = this.s1;
            FrameLayout frameLayout = this.k1;
            FrameLayout frameLayout2 = this.q1;
            FrameLayout frameLayout3 = this.r1;
            t01 t01Var = this.i1;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            n01 n01Var = this.j1;
            if (z10) {
                this.y1 = true;
                t01Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                t01Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.x1 = this.v1;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(t01Var, (Property<t01, Float>) property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property, 1.0f), ObjectAnimator.ofFloat(n01Var, (Property<n01, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(xyVar, (Property<xy, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", n01Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.k);
                animatorSet.addListener(new q01(this));
                animatorSet.start();
                return;
            }
            float f7 = 0.0f;
            Activity activity = themeEditorView.d;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).y0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.t6.x1(themeEditorView.o, r62, r62, r62);
            if (n01Var.getAdapter() == this.o1) {
                org.telegram.messenger.i0.v1(getCurrentFocus());
            }
            this.y1 = true;
            n01Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.m1.setVisibility(r62);
            n01Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t01Var, (Property<t01, Float>) property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n01Var, (Property<n01, Float>) property2, fArr3);
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
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(xyVar, (Property<xy, Float>) property2, fArr6);
            float[] fArr7 = new float[1];
            fArr7[c10] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, fArr7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollOffsetY", this.x1);
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
            animatorSet2.setInterpolator(themeEditorView.k);
            animatorSet2.addListener(new r01(this));
            animatorSet2.start();
            n01Var.getAdapter().g(themeEditorView.f);
        }

        public int getScrollOffsetY() {
            return this.v1;
        }

        public void setScrollOffsetY(int i10) {
            this.v1 = i10;
            this.j1.setTopGlowOffset(i10);
            this.k1.setTranslationY(this.v1);
            this.i1.setTranslationY(this.v1);
            this.l1.setTranslationY(this.v1);
            this.b.invalidate();
        }
    }

    public static void a(ThemeEditorView themeEditorView) {
        if (themeEditorView.a) {
            return;
        }
        themeEditorView.a = true;
        org.telegram.messenger.i0.g3(themeEditorView.b);
    }

    public static int c(float f7, int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i12 = org.telegram.messenger.i0.q.x;
        } else {
            i12 = org.telegram.messenger.i0.q.y - i11;
            i11 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        int L = i10 == 0 ? org.telegram.messenger.i0.L(10.0f) : i10 == 1 ? (i12 - i11) - org.telegram.messenger.i0.L(10.0f) : Math.round((r0 - org.telegram.messenger.i0.L(20.0f)) * f7) + org.telegram.messenger.i0.L(10.0f);
        return !z10 ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + L : L;
    }

    public final void b() {
        i01 i01Var;
        this.m.getClass();
        if (this.d == null || (i01Var = this.c) == null) {
            return;
        }
        try {
            this.j.removeViewImmediate(i01Var);
            this.c = null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, false);
        }
        try {
            EditorAlert editorAlert = this.n;
            if (editorAlert != null) {
                editorAlert.dismiss();
                this.n = null;
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        this.d = null;
        p = null;
    }

    public final void d(Activity activity, org.telegram.ui.ActionBar.s6 s6Var) {
        if (p != null) {
            p.b();
        }
        this.o = s6Var;
        this.c = new i01(this, activity);
        this.j = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
        this.l = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.l.getInt("sidey", 0);
        float f7 = this.l.getFloat("px", 0.0f);
        float f10 = this.l.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.i = layoutParams;
            int i12 = this.g;
            layoutParams.width = i12;
            layoutParams.height = this.h;
            layoutParams.x = c(f7, i10, i12, true);
            this.i.y = c(f10, i11, this.h, false);
            WindowManager.LayoutParams layoutParams2 = this.i;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.i0.x3(this.j, this.c, layoutParams2);
            this.j.addView(this.c, this.i);
            this.m = new bh.d(activity, null, new j01(this));
            p = this;
            this.d = activity;
            e();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void e() {
        this.c.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.c, (Property<i01, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.c, (Property<i01, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.c, (Property<i01, Float>) View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.k);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.i.x;
    }

    public int getY() {
        return this.i.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.i;
        layoutParams.x = i10;
        this.j.updateViewLayout(this.c, layoutParams);
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.i;
        layoutParams.y = i10;
        this.j.updateViewLayout(this.c, layoutParams);
    }
}
