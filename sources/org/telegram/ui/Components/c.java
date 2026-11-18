package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ c(m0 m0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout;
        int i7 = this.a;
        m0 m0Var = this.b;
        switch (i7) {
            case 0:
                m0Var.dismiss();
                break;
            case 1:
                org.telegram.ui.Cells.k3 k3Var = m0Var.y2;
                org.telegram.messenger.g0.v1(k3Var.d);
                m0Var.G2 = k3Var.getText().toString();
                m0Var.C1();
                m0Var.B1(true);
                m0Var.t1();
                break;
            case 2:
                if (m0Var.g2 != null) {
                    TL_iv.RichMessage o12 = m0Var.o1();
                    if (o12 != null) {
                        m0Var.g2.a(o12);
                    }
                } else if (m0Var.f2 != null && m0Var.p1() != null) {
                    m0Var.f2.a(m0Var.p1());
                }
                m0Var.dismiss();
                break;
            case 3:
                m0Var.dismiss();
                break;
            case 4:
                if (r0.b(m0Var.a, m0Var.h2) != null) {
                    r0.e(m0Var.a, m0Var.h2, null);
                } else {
                    q0 k12 = m0Var.k1();
                    if (k12 == null) {
                        org.telegram.messenger.g0.E3(4.0f, m0Var.R2, null);
                        break;
                    } else {
                        r0.e(m0Var.a, m0Var.h2, k12);
                    }
                }
                m0Var.A1();
                dd ddVar = m0Var.S2;
                if (ddVar != null) {
                    ddVar.run();
                    break;
                }
                break;
            case 5:
                m0Var.Q2 = false;
                m0Var.Y0();
                m0Var.P2.O(true);
                m0Var.J0();
                break;
            case 6:
                final m0 m0Var2 = this.b;
                y60 G = y60.G(m0Var2.c, m0Var2.J0, view);
                G.a0 = org.telegram.messenger.g0.L(450.0f);
                G.t = false;
                G.b0 = true;
                G.s = 51;
                G.u = false;
                G.v = true;
                ScrollView scrollView = new ScrollView(m0Var2.getContext());
                scrollView.setVerticalScrollBarEnabled(false);
                LinearLayout linearLayout2 = new LinearLayout(m0Var2.getContext());
                linearLayout2.setOrientation(1);
                scrollView.addView(linearLayout2);
                int min = Math.min(org.telegram.messenger.g0.L(468.0f), org.telegram.messenger.g0.L(48.0f) + (org.telegram.messenger.g0.q.y / 2));
                G.U = true;
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, m0Var2.J0);
                int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, m0Var2.J0);
                LinearLayout linearLayout3 = new LinearLayout(m0Var2.getContext());
                linearLayout3.setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(m0Var2.getContext());
                ImageView imageView = new ImageView(m0Var2.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(R.drawable.msg_search);
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.45f, w02);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
                frameLayout.addView(imageView, c8.ma.d(18, 18.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(m0Var2.getContext());
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(w02);
                editTextBoldCursor.setHintText(org.telegram.messenger.gd.M0(2131745641, null));
                editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.n6.r1(0.45f, w02));
                editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, m0Var2.J0));
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(18.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(0, 0, 0, 0);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(524289);
                editTextBoldCursor.setImeOptions(268435459);
                editTextBoldCursor.setGravity(19);
                editTextBoldCursor.setOnEditorActionListener(new g(editTextBoldCursor, 0));
                frameLayout.addView(editTextBoldCursor, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 42.0f, 0.0f, 40.0f, 0.0f));
                ImageView imageView2 = new ImageView(m0Var2.getContext());
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.setImageResource(R.drawable.ic_close_white);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.r1(0.75f, w03), mode));
                imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.12f, w02), 1, -1));
                imageView2.setContentDescription(org.telegram.messenger.gd.M0(2131752088, null));
                imageView2.setVisibility(8);
                imageView2.setOnClickListener(new h(editTextBoldCursor, 0));
                frameLayout.addView(imageView2, c8.ma.d(36, 36.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                linearLayout3.addView(frameLayout, c8.ma.o(-1, 48));
                View view2 = new View(m0Var2.getContext());
                view2.setBackgroundColor(org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
                linearLayout3.addView(view2, new LinearLayout.LayoutParams(-1, Math.max(1, org.telegram.messenger.g0.L(0.66f))));
                linearLayout3.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                TextView textView = new TextView(m0Var2.getContext());
                textView.setTextSize(1, 15.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.5f, w02));
                textView.setGravity(17);
                textView.setText(org.telegram.messenger.gd.M0(2131747975, null));
                textView.setVisibility(8);
                linearLayout2.addView(textView, c8.ma.o(-1, 96));
                G.r(linearLayout3, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(196.0f), min));
                G.p = new i(editTextBoldCursor, 0);
                G.o(false);
                l0 l0Var = new l0(m0Var2.getContext(), m0Var2.a, 1, true, m0Var2.J0);
                l0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                l0Var.setRoundRadius(12);
                String M0 = org.telegram.messenger.gd.M0(2131754955, null);
                j jVar = new j(m0Var2, l0Var, 0);
                j0 j0Var = l0Var.c;
                int childCount = j0Var.getChildCount();
                k0 k0Var = new k0(l0Var.a, l0Var.getContext(), l0Var.b);
                k0Var.c = l0Var.e;
                k0Var.updateColors();
                k0Var.a("❌", M0, null);
                k0Var.setOnClickListener(new ci.q(jVar, childCount, 10));
                j0Var.addView(k0Var, c8.ma.p(j0Var.getOrientation() == 0 ? 0 : -1, j0Var.getOrientation() == 1 ? 0 : -1, 1.0f, org.telegram.messenger.ks.E1));
                ArrayList arrayList = m0Var2.s2.b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    l0Var.b((TL_aicompose.AiComposeTone) obj, new j(m0Var2, l0Var, 1));
                }
                TL_aicompose.AiComposeTone aiComposeTone = m0Var2.q2;
                if (aiComposeTone != null) {
                    l0Var.d(aiComposeTone, false);
                } else {
                    l0Var.c(0, false);
                }
                G.r(l0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(84.0f), min));
                ViewParent parent = linearLayout3.getParent();
                while (parent != null && !(parent instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
                    parent = parent.getParent();
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) parent;
                ViewParent parent2 = l0Var.getParent();
                while (parent2 != null && !(parent2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
                    parent2 = parent2.getParent();
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) parent2;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.leftMargin = (org.telegram.messenger.g0.L(8.0f) - actionBarPopupWindow$ActionBarPopupWindowLayout.getPadding().right) - actionBarPopupWindow$ActionBarPopupWindowLayout2.getPadding().left;
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setLayoutParams(layoutParams);
                }
                ArrayList o4 = org.telegram.messenger.z00.o(null);
                ArrayList n10 = org.telegram.messenger.z00.n();
                int childCount2 = linearLayout2.getChildCount();
                if (TextUtils.isEmpty(m0Var2.o2)) {
                    linearLayout = linearLayout2;
                } else {
                    linearLayout = linearLayout2;
                    m0Var2.h1(G, linearLayout, true, y21.L0(y21.P0(m0Var2.o2, null, null)), null);
                }
                int size2 = o4.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = o4.get(i11);
                    i11++;
                    final org.telegram.messenger.s00 s00Var = (org.telegram.messenger.s00) obj2;
                    if (!TextUtils.equals(s00Var.a, m0Var2.o2)) {
                        final int i12 = 0;
                        m0Var2.h1(G, linearLayout, false, s00Var.b, new Runnable() { // from class: org.telegram.ui.Components.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        m0 m0Var3 = m0Var2;
                                        m0Var3.j1();
                                        m0Var3.o2 = s00Var.a;
                                        m0Var3.t1();
                                        break;
                                    default:
                                        m0 m0Var4 = m0Var2;
                                        m0Var4.j1();
                                        m0Var4.o2 = s00Var.a;
                                        m0Var4.t1();
                                        break;
                                }
                            }
                        });
                    }
                }
                View e1Var = new org.telegram.ui.ActionBar.e1(m0Var2.getContext(), m0Var2.J0);
                e1Var.setTag(R.id.fit_width_tag, 1);
                linearLayout.addView(e1Var, c8.ma.o(-1, 8));
                int childCount3 = linearLayout.getChildCount();
                int size3 = n10.size();
                int i13 = 0;
                final m0 m0Var3 = m0Var2;
                y60 y60Var = G;
                while (i13 < size3) {
                    int i14 = i13 + 1;
                    final org.telegram.messenger.s00 s00Var2 = (org.telegram.messenger.s00) n10.get(i13);
                    boolean equals = TextUtils.equals(s00Var2.a, m0Var3.o2);
                    String str = s00Var2.b;
                    int i15 = size3;
                    final int i16 = 1;
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    m0 m0Var32 = m0Var3;
                                    m0Var32.j1();
                                    m0Var32.o2 = s00Var2.a;
                                    m0Var32.t1();
                                    break;
                                default:
                                    m0 m0Var4 = m0Var3;
                                    m0Var4.j1();
                                    m0Var4.o2 = s00Var2.a;
                                    m0Var4.t1();
                                    break;
                            }
                        }
                    };
                    LinearLayout linearLayout4 = linearLayout;
                    m0 m0Var4 = m0Var3;
                    y60 y60Var2 = y60Var;
                    m0Var4.h1(y60Var2, linearLayout4, equals, str, runnable);
                    linearLayout = linearLayout4;
                    y60Var = y60Var2;
                    size3 = i15;
                    m0Var3 = m0Var4;
                    i13 = i14;
                }
                editTextBoldCursor.addTextChangedListener(new r(imageView2, childCount2, childCount3, linearLayout, n10, textView, scrollView));
                y60Var.a0();
                break;
            case 7:
                m0.e1(m0Var, view);
                break;
            case 8:
                if (!m0Var.W2) {
                    org.telegram.messenger.g0.g(m0Var.p1());
                    break;
                }
                break;
            case 9:
                m0Var.dismiss();
                break;
            default:
                m0Var.u1(0, 0, true);
                m0Var.dismiss();
                break;
        }
    }
}
