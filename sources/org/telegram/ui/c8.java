package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ e8 b;

    public c8(e8 e8Var, Context context) {
        this.b = e8Var;
        this.a = context;
    }

    public final f8 a(float f7, float f10) {
        f8 f8Var;
        e8 e8Var = this.b;
        if (e8Var.n == null) {
            return null;
        }
        int i10 = e8Var.e;
        float measuredWidth = e8Var.getMeasuredWidth() / 7.0f;
        float L = org.telegram.messenger.i0.L(52.0f);
        int L2 = org.telegram.messenger.i0.L(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < e8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float L3 = (L / 2.0f) + (i11 * L) + org.telegram.messenger.i0.L(44.0f);
            float f12 = L2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= L3 - f12 && f10 <= L3 + f12 && (f8Var = (f8) e8Var.n.get(i12, null)) != null) {
                return f8Var;
            }
            i10++;
            if (i10 >= 7) {
                i11++;
                i10 = 0;
            }
        }
        return null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        final f8 a2;
        org.telegram.ui.ActionBar.z4 z4Var;
        super.onLongPress(motionEvent);
        e8 e8Var = this.b;
        h8 h8Var = e8Var.y;
        if (h8Var.e0 != 0 || org.telegram.messenger.i0.Q1() || (a2 = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        final int i10 = 0;
        try {
            e8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j10 = h8Var.y;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("start_from_date", a2.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        un unVar = new un(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, h8Var.getParentActivity(), h8Var.getResourceProvider());
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, h8Var.getResourceProvider());
        final int i11 = 1;
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(h8Var.getParentActivity(), true, false);
        b1Var.j(org.telegram.messenger.cd.L0(2131749075, null), R.drawable.msg_message, null);
        b1Var.setMinimumWidth(org.telegram.messenger.zs.q2);
        b1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a8
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.z4 z4Var2;
                org.telegram.ui.ActionBar.z4 z4Var3;
                org.telegram.ui.ActionBar.z4 z4Var4;
                org.telegram.ui.ActionBar.z4 z4Var5;
                switch (i10) {
                    case 0:
                        c8 c8Var = this.b;
                        h8 h8Var2 = c8Var.b.y;
                        z4Var2 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                        if (z4Var2 != null) {
                            z4Var3 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                            if (z4Var3.getFragmentStack().size() >= 3) {
                                z4Var4 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                List fragmentStack = z4Var4.getFragmentStack();
                                z4Var5 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var5.getFragmentStack().size() - 3);
                                if (k2Var instanceof un) {
                                    org.telegram.messenger.i0.h3(new p1(c8Var, (un) k2Var, a2, 5), 300L);
                                }
                            }
                        }
                        h8Var2.finishPreviewFragment();
                        break;
                    default:
                        e8 e8Var2 = this.b.b;
                        h8 h8Var3 = e8Var2.y;
                        int i12 = a2.h;
                        h8Var3.Q = i12;
                        h8Var3.P = i12;
                        h8Var3.G = true;
                        h8Var3.A0();
                        h8 h8Var4 = e8Var2.y;
                        h8Var4.t0();
                        h8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
        if (h8Var.d0) {
            org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(h8Var.getParentActivity(), false, false);
            b1Var2.j(org.telegram.messenger.cd.L0(2131745667, null), R.drawable.msg_select, null);
            b1Var2.setMinimumWidth(org.telegram.messenger.zs.q2);
            b1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a8
                public final /* synthetic */ c8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.z4 z4Var2;
                    org.telegram.ui.ActionBar.z4 z4Var3;
                    org.telegram.ui.ActionBar.z4 z4Var4;
                    org.telegram.ui.ActionBar.z4 z4Var5;
                    switch (i11) {
                        case 0:
                            c8 c8Var = this.b;
                            h8 h8Var2 = c8Var.b.y;
                            z4Var2 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                            if (z4Var2 != null) {
                                z4Var3 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                if (z4Var3.getFragmentStack().size() >= 3) {
                                    z4Var4 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                    List fragmentStack = z4Var4.getFragmentStack();
                                    z4Var5 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var5.getFragmentStack().size() - 3);
                                    if (k2Var instanceof un) {
                                        org.telegram.messenger.i0.h3(new p1(c8Var, (un) k2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            break;
                        default:
                            e8 e8Var2 = this.b.b;
                            h8 h8Var3 = e8Var2.y;
                            int i12 = a2.h;
                            h8Var3.Q = i12;
                            h8Var3.P = i12;
                            h8Var3.G = true;
                            h8Var3.A0();
                            h8 h8Var4 = e8Var2.y;
                            h8Var4.t0();
                            h8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var2);
            org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(h8Var.getParentActivity(), false, true);
            b1Var3.j(org.telegram.messenger.cd.L0(2131752089, null), R.drawable.msg_delete, null);
            b1Var3.setMinimumWidth(org.telegram.messenger.zs.q2);
            b1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b8
                public final /* synthetic */ c8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.z4 z4Var2;
                    org.telegram.ui.ActionBar.z4 z4Var3;
                    org.telegram.ui.ActionBar.z4 z4Var4;
                    switch (i10) {
                        case 0:
                            c8 c8Var = this.b;
                            h8 h8Var2 = c8Var.b.y;
                            z4Var2 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                            if (z4Var2.getFragmentStack().size() >= 3) {
                                z4Var3 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                List fragmentStack = z4Var3.getFragmentStack();
                                z4Var4 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var4.getFragmentStack().size() - 3);
                                if (k2Var instanceof un) {
                                    org.telegram.ui.Components.s4.q(h8Var2, 1, h8Var2.getMessagesController().Z1(Long.valueOf(h8Var2.y)), null, false, new m5.e(c8Var, (un) k2Var, false, 10), null);
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            break;
                        default:
                            this.b.b.y.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var3);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        h8Var.w = new bi.t0(this, this.a, 6);
        h8Var.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b8
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.z4 z4Var2;
                org.telegram.ui.ActionBar.z4 z4Var3;
                org.telegram.ui.ActionBar.z4 z4Var4;
                switch (i11) {
                    case 0:
                        c8 c8Var = this.b;
                        h8 h8Var2 = c8Var.b.y;
                        z4Var2 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                        if (z4Var2.getFragmentStack().size() >= 3) {
                            z4Var3 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                            List fragmentStack = z4Var3.getFragmentStack();
                            z4Var4 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var4.getFragmentStack().size() - 3);
                            if (k2Var instanceof un) {
                                org.telegram.ui.Components.s4.q(h8Var2, 1, h8Var2.getMessagesController().Z1(Long.valueOf(h8Var2.y)), null, false, new m5.e(c8Var, (un) k2Var, false, 10), null);
                            }
                        }
                        h8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.b.b.y.finishPreviewFragment();
                        break;
                }
            }
        });
        h8Var.w.setVisibility(8);
        h8Var.w.setFitsSystemWindows(true);
        z4Var = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
        z4Var.getOverlayContainerView().addView(h8Var.w, w7.b6.c(-1.0f, -1));
        h8.g0(h8Var);
        h8Var.presentFragmentAsPreviewWithMenu(unVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.z4 z4Var3;
        org.telegram.ui.ActionBar.z4 z4Var4;
        org.telegram.ui.ActionBar.z4 z4Var5;
        f8 a2;
        org.telegram.messenger.jj jjVar;
        l2.f fVar;
        e8 e8Var = this.b;
        h8 h8Var = e8Var.y;
        z4Var = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
        if (z4Var != null) {
            if (((h8Var.e0 == 1 && e8Var.n != null) || h8Var.f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (jjVar = a2.a) != null && (fVar = h8Var.M) != null) {
                if (h8Var.f0 != null) {
                    th.o7 orCreateStoryViewer = h8Var.getOrCreateStoryViewer();
                    Context context = e8Var.getContext();
                    org.telegram.messenger.jj jjVar2 = a2.a;
                    TL_stories.StoryItem storyItem = jjVar2.l;
                    int f12 = jjVar2.f1();
                    th.x4 x4Var = h8Var.f0;
                    v7 v7Var = h8Var.g0;
                    orCreateStoryViewer.h = org.telegram.messenger.d20.s0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(x4Var.d));
                    orCreateStoryViewer.P0 = f12;
                    orCreateStoryViewer.T(context, storyItem, arrayList, 0, x4Var, null, v7Var, true);
                } else {
                    int f13 = jjVar.f1();
                    int i10 = a2.c;
                    org.telegram.ui.Components.zt0 zt0Var = (org.telegram.ui.Components.zt0) fVar.b;
                    org.telegram.ui.Components.ot0[] ot0VarArr = zt0Var.v1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < ot0VarArr[0].a.size(); i12++) {
                        if (((org.telegram.messenger.jj) ot0VarArr[0].a.get(i12)).f1() == f13) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.ss0 e02 = zt0Var.e0(0);
                    if (i11 < 0 || e02 == null) {
                        zt0Var.H0(0, f13, i10, true);
                    } else {
                        e02.x.h1(i11, 0);
                    }
                    if (e02 != null) {
                        e02.I = f13;
                        e02.J = false;
                    }
                    h8Var.finishFragment();
                }
            }
            if (e8Var.n != null) {
                if (h8Var.G) {
                    f8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = h8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            h8Var.R = null;
                        }
                        int i13 = h8Var.P;
                        if (i13 == 0 && h8Var.Q == 0) {
                            int i14 = a10.h;
                            h8Var.Q = i14;
                            h8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && h8Var.Q == i15) {
                                h8Var.Q = 0;
                                h8Var.P = 0;
                            } else if (i13 == i15) {
                                h8Var.P = h8Var.Q;
                            } else {
                                int i16 = h8Var.Q;
                                if (i16 == i15) {
                                    h8Var.Q = i13;
                                } else if (i13 != i16) {
                                    h8Var.Q = i15;
                                    h8Var.P = i15;
                                } else if (i15 > i16) {
                                    h8Var.Q = i15;
                                } else {
                                    h8Var.P = i15;
                                }
                            }
                        }
                        h8Var.A0();
                        h8Var.t0();
                        return false;
                    }
                } else {
                    f8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        z4Var2 = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
                        if (z4Var2 != null) {
                            z4Var3 = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
                            if (z4Var3.getFragmentStack().size() >= 2) {
                                z4Var4 = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
                                List fragmentStack = z4Var4.getFragmentStack();
                                z4Var5 = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
                                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var5.getFragmentStack().size() - 2);
                                if (k2Var instanceof un) {
                                    h8Var.finishFragment();
                                    ((un) k2Var).V9(a11.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a11 != null && h8Var.N != null) {
                        h8Var.finishFragment();
                        h8Var.N.V9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
