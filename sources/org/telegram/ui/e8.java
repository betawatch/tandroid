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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ g8 b;

    public e8(g8 g8Var, Context context) {
        this.b = g8Var;
        this.a = context;
    }

    public final h8 a(float f10, float f11) {
        h8 h8Var;
        g8 g8Var = this.b;
        if (g8Var.n == null) {
            return null;
        }
        int i7 = g8Var.e;
        float measuredWidth = g8Var.getMeasuredWidth() / 7.0f;
        float L = org.telegram.messenger.g0.L(52.0f);
        int L2 = org.telegram.messenger.g0.L(44.0f) / 2;
        int i10 = 0;
        for (int i11 = 0; i11 < g8Var.d; i11++) {
            float f12 = (measuredWidth / 2.0f) + (i7 * measuredWidth);
            float L3 = (L / 2.0f) + (i10 * L) + org.telegram.messenger.g0.L(44.0f);
            float f13 = L2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= L3 - f13 && f11 <= L3 + f13 && (h8Var = (h8) g8Var.n.get(i11, null)) != null) {
                return h8Var;
            }
            i7++;
            if (i7 >= 7) {
                i10++;
                i7 = 0;
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
        final h8 a10;
        org.telegram.ui.ActionBar.r4 r4Var;
        super.onLongPress(motionEvent);
        g8 g8Var = this.b;
        j8 j8Var = g8Var.y;
        if (j8Var.f0 != 0 || org.telegram.messenger.g0.Q1() || (a10 = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        final int i7 = 0;
        try {
            g8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j3 = j8Var.y;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("start_from_date", a10.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        bn bnVar = new bn(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, j8Var.getParentActivity(), j8Var.getResourceProvider());
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, j8Var.getResourceProvider());
        final int i10 = 1;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(j8Var.getParentActivity(), true, false);
        y0Var.j(org.telegram.messenger.gd.N0(2131748872, null), R.drawable.msg_message, null);
        y0Var.setMinimumWidth(org.telegram.messenger.ks.q2);
        y0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c8
            public final /* synthetic */ e8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r4 r4Var2;
                org.telegram.ui.ActionBar.r4 r4Var3;
                org.telegram.ui.ActionBar.r4 r4Var4;
                org.telegram.ui.ActionBar.r4 r4Var5;
                switch (i7) {
                    case 0:
                        e8 e8Var = this.b;
                        j8 j8Var2 = e8Var.b.y;
                        r4Var2 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                        if (r4Var2 != null) {
                            r4Var3 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                            if (r4Var3.getFragmentStack().size() >= 3) {
                                r4Var4 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                List fragmentStack = r4Var4.getFragmentStack();
                                r4Var5 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var5.getFragmentStack().size() - 3);
                                if (g2Var instanceof bn) {
                                    org.telegram.messenger.g0.h3(new o1(e8Var, (bn) g2Var, a10, 5), 300L);
                                }
                            }
                        }
                        j8Var2.finishPreviewFragment();
                        break;
                    default:
                        g8 g8Var2 = this.b.b;
                        j8 j8Var3 = g8Var2.y;
                        int i11 = a10.h;
                        j8Var3.R = i11;
                        j8Var3.Q = i11;
                        j8Var3.H = true;
                        j8Var3.B0();
                        j8 j8Var4 = g8Var2.y;
                        j8Var4.u0();
                        j8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
        if (j8Var.e0) {
            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(j8Var.getParentActivity(), false, false);
            y0Var2.j(org.telegram.messenger.gd.N0(2131745454, null), R.drawable.msg_select, null);
            y0Var2.setMinimumWidth(org.telegram.messenger.ks.q2);
            y0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c8
                public final /* synthetic */ e8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.r4 r4Var2;
                    org.telegram.ui.ActionBar.r4 r4Var3;
                    org.telegram.ui.ActionBar.r4 r4Var4;
                    org.telegram.ui.ActionBar.r4 r4Var5;
                    switch (i10) {
                        case 0:
                            e8 e8Var = this.b;
                            j8 j8Var2 = e8Var.b.y;
                            r4Var2 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                            if (r4Var2 != null) {
                                r4Var3 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                if (r4Var3.getFragmentStack().size() >= 3) {
                                    r4Var4 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                    List fragmentStack = r4Var4.getFragmentStack();
                                    r4Var5 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var5.getFragmentStack().size() - 3);
                                    if (g2Var instanceof bn) {
                                        org.telegram.messenger.g0.h3(new o1(e8Var, (bn) g2Var, a10, 5), 300L);
                                    }
                                }
                            }
                            j8Var2.finishPreviewFragment();
                            break;
                        default:
                            g8 g8Var2 = this.b.b;
                            j8 j8Var3 = g8Var2.y;
                            int i11 = a10.h;
                            j8Var3.R = i11;
                            j8Var3.Q = i11;
                            j8Var3.H = true;
                            j8Var3.B0();
                            j8 j8Var4 = g8Var2.y;
                            j8Var4.u0();
                            j8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(j8Var.getParentActivity(), false, true);
            y0Var3.j(org.telegram.messenger.gd.N0(2131752077, null), R.drawable.msg_delete, null);
            y0Var3.setMinimumWidth(org.telegram.messenger.ks.q2);
            y0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d8
                public final /* synthetic */ e8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.r4 r4Var2;
                    org.telegram.ui.ActionBar.r4 r4Var3;
                    org.telegram.ui.ActionBar.r4 r4Var4;
                    switch (i7) {
                        case 0:
                            e8 e8Var = this.b;
                            j8 j8Var2 = e8Var.b.y;
                            r4Var2 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                            if (r4Var2.getFragmentStack().size() >= 3) {
                                r4Var3 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                List fragmentStack = r4Var3.getFragmentStack();
                                r4Var4 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var4.getFragmentStack().size() - 3);
                                if (g2Var instanceof bn) {
                                    org.telegram.ui.Components.b5.q(j8Var2, 1, j8Var2.getMessagesController().c2(Long.valueOf(j8Var2.y)), null, false, new j6.k(14, e8Var, (bn) g2Var), null);
                                }
                            }
                            j8Var2.finishPreviewFragment();
                            break;
                        default:
                            this.b.b.y.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var3);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        j8Var.w = new bi.o3(12, this.a, this);
        j8Var.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d8
            public final /* synthetic */ e8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r4 r4Var2;
                org.telegram.ui.ActionBar.r4 r4Var3;
                org.telegram.ui.ActionBar.r4 r4Var4;
                switch (i10) {
                    case 0:
                        e8 e8Var = this.b;
                        j8 j8Var2 = e8Var.b.y;
                        r4Var2 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                        if (r4Var2.getFragmentStack().size() >= 3) {
                            r4Var3 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                            List fragmentStack = r4Var3.getFragmentStack();
                            r4Var4 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var4.getFragmentStack().size() - 3);
                            if (g2Var instanceof bn) {
                                org.telegram.ui.Components.b5.q(j8Var2, 1, j8Var2.getMessagesController().c2(Long.valueOf(j8Var2.y)), null, false, new j6.k(14, e8Var, (bn) g2Var), null);
                            }
                        }
                        j8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.b.b.y.finishPreviewFragment();
                        break;
                }
            }
        });
        j8Var.w.setVisibility(8);
        j8Var.w.setFitsSystemWindows(true);
        r4Var = ((org.telegram.ui.ActionBar.g2) j8Var).parentLayout;
        r4Var.getOverlayContainerView().addView(j8Var.w, c8.na.c(-1.0f, -1));
        j8.h0(j8Var);
        j8Var.presentFragmentAsPreviewWithMenu(bnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        org.telegram.ui.ActionBar.r4 r4Var4;
        org.telegram.ui.ActionBar.r4 r4Var5;
        h8 a10;
        org.telegram.messenger.fj fjVar;
        org.telegram.ui.Components.nd0 nd0Var;
        g8 g8Var = this.b;
        j8 j8Var = g8Var.y;
        r4Var = ((org.telegram.ui.ActionBar.g2) j8Var).parentLayout;
        if (r4Var != null) {
            if (((j8Var.f0 == 1 && g8Var.n != null) || j8Var.g0 != null) && (a10 = a(motionEvent.getX(), motionEvent.getY())) != null && (fjVar = a10.a) != null && (nd0Var = j8Var.N) != null) {
                if (j8Var.g0 != null) {
                    fi.f9 orCreateStoryViewer = j8Var.getOrCreateStoryViewer();
                    Context context = g8Var.getContext();
                    org.telegram.messenger.fj fjVar2 = a10.a;
                    TL_stories.StoryItem storyItem = fjVar2.l;
                    int e12 = fjVar2.e1();
                    fi.h6 h6Var = j8Var.g0;
                    w7 w7Var = j8Var.h0;
                    orCreateStoryViewer.h = org.telegram.messenger.i10.t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(h6Var.d));
                    orCreateStoryViewer.P0 = e12;
                    orCreateStoryViewer.M(context, storyItem, arrayList, 0, h6Var, null, w7Var, true);
                } else {
                    int e13 = fjVar.e1();
                    int i7 = a10.c;
                    org.telegram.ui.Components.it0 it0Var = (org.telegram.ui.Components.it0) nd0Var.b;
                    org.telegram.ui.Components.xs0[] xs0VarArr = it0Var.w1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < xs0VarArr[0].a.size(); i11++) {
                        if (((org.telegram.messenger.fj) xs0VarArr[0].a.get(i11)).e1() == e13) {
                            i10 = i11;
                        }
                    }
                    org.telegram.ui.Components.ds0 g02 = it0Var.g0(0);
                    if (i10 < 0 || g02 == null) {
                        it0Var.L0(0, e13, i7, true);
                    } else {
                        g02.x.h1(i10, 0);
                    }
                    if (g02 != null) {
                        g02.J = e13;
                        g02.K = false;
                    }
                    j8Var.finishFragment();
                }
            }
            if (g8Var.n != null) {
                if (j8Var.H) {
                    h8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        ValueAnimator valueAnimator = j8Var.S;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            j8Var.S = null;
                        }
                        int i12 = j8Var.Q;
                        if (i12 == 0 && j8Var.R == 0) {
                            int i13 = a11.h;
                            j8Var.R = i13;
                            j8Var.Q = i13;
                        } else {
                            int i14 = a11.h;
                            if (i12 == i14 && j8Var.R == i14) {
                                j8Var.R = 0;
                                j8Var.Q = 0;
                            } else if (i12 == i14) {
                                j8Var.Q = j8Var.R;
                            } else {
                                int i15 = j8Var.R;
                                if (i15 == i14) {
                                    j8Var.R = i12;
                                } else if (i12 != i15) {
                                    j8Var.R = i14;
                                    j8Var.Q = i14;
                                } else if (i14 > i15) {
                                    j8Var.R = i14;
                                } else {
                                    j8Var.Q = i14;
                                }
                            }
                        }
                        j8Var.B0();
                        j8Var.u0();
                        return false;
                    }
                } else {
                    h8 a12 = a(motionEvent.getX(), motionEvent.getY());
                    if (a12 != null) {
                        r4Var2 = ((org.telegram.ui.ActionBar.g2) j8Var).parentLayout;
                        if (r4Var2 != null) {
                            r4Var3 = ((org.telegram.ui.ActionBar.g2) j8Var).parentLayout;
                            if (r4Var3.getFragmentStack().size() >= 2) {
                                r4Var4 = ((org.telegram.ui.ActionBar.g2) j8Var).parentLayout;
                                List fragmentStack = r4Var4.getFragmentStack();
                                r4Var5 = ((org.telegram.ui.ActionBar.g2) j8Var).parentLayout;
                                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var5.getFragmentStack().size() - 2);
                                if (g2Var instanceof bn) {
                                    j8Var.finishFragment();
                                    ((bn) g2Var).ha(a12.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a12 != null && j8Var.O != null) {
                        j8Var.finishFragment();
                        j8Var.O.ha(a12.h);
                    }
                }
            }
        }
        return false;
    }
}
