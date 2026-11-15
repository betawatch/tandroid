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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ f8 b;

    public d8(f8 f8Var, Context context) {
        this.b = f8Var;
        this.a = context;
    }

    public final g8 a(float f10, float f11) {
        g8 g8Var;
        f8 f8Var = this.b;
        if (f8Var.n == null) {
            return null;
        }
        int i7 = f8Var.e;
        float measuredWidth = f8Var.getMeasuredWidth() / 7.0f;
        float L = org.telegram.messenger.g0.L(52.0f);
        int L2 = org.telegram.messenger.g0.L(44.0f) / 2;
        int i10 = 0;
        for (int i11 = 0; i11 < f8Var.d; i11++) {
            float f12 = (measuredWidth / 2.0f) + (i7 * measuredWidth);
            float L3 = (L / 2.0f) + (i10 * L) + org.telegram.messenger.g0.L(44.0f);
            float f13 = L2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= L3 - f13 && f11 <= L3 + f13 && (g8Var = (g8) f8Var.n.get(i11, null)) != null) {
                return g8Var;
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
        final g8 a10;
        org.telegram.ui.ActionBar.o4 o4Var;
        super.onLongPress(motionEvent);
        f8 f8Var = this.b;
        i8 i8Var = f8Var.y;
        if (i8Var.f0 != 0 || org.telegram.messenger.g0.Q1() || (a10 = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        final int i7 = 0;
        try {
            f8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j3 = i8Var.y;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("start_from_date", a10.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        an anVar = new an(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, i8Var.getParentActivity(), i8Var.getResourceProvider());
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, i8Var.getResourceProvider());
        final int i10 = 1;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(i8Var.getParentActivity(), true, false);
        z0Var.j(org.telegram.messenger.hd.M0(2131749065, null), R.drawable.msg_message, null);
        z0Var.setMinimumWidth(org.telegram.messenger.ns.q2);
        z0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b8
            public final /* synthetic */ d8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.o4 o4Var2;
                org.telegram.ui.ActionBar.o4 o4Var3;
                org.telegram.ui.ActionBar.o4 o4Var4;
                org.telegram.ui.ActionBar.o4 o4Var5;
                switch (i7) {
                    case 0:
                        d8 d8Var = this.b;
                        i8 i8Var2 = d8Var.b.y;
                        o4Var2 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                        if (o4Var2 != null) {
                            o4Var3 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                            if (o4Var3.getFragmentStack().size() >= 3) {
                                o4Var4 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                                List fragmentStack = o4Var4.getFragmentStack();
                                o4Var5 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(o4Var5.getFragmentStack().size() - 3);
                                if (e2Var instanceof an) {
                                    org.telegram.messenger.g0.i3(new o1(d8Var, (an) e2Var, a10, 5), 300L);
                                }
                            }
                        }
                        i8Var2.finishPreviewFragment();
                        break;
                    default:
                        f8 f8Var2 = this.b.b;
                        i8 i8Var3 = f8Var2.y;
                        int i11 = a10.h;
                        i8Var3.R = i11;
                        i8Var3.Q = i11;
                        i8Var3.H = true;
                        i8Var3.B0();
                        i8 i8Var4 = f8Var2.y;
                        i8Var4.u0();
                        i8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
        if (i8Var.e0) {
            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(i8Var.getParentActivity(), false, false);
            z0Var2.j(org.telegram.messenger.hd.M0(2131745650, null), R.drawable.msg_select, null);
            z0Var2.setMinimumWidth(org.telegram.messenger.ns.q2);
            z0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b8
                public final /* synthetic */ d8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.o4 o4Var2;
                    org.telegram.ui.ActionBar.o4 o4Var3;
                    org.telegram.ui.ActionBar.o4 o4Var4;
                    org.telegram.ui.ActionBar.o4 o4Var5;
                    switch (i10) {
                        case 0:
                            d8 d8Var = this.b;
                            i8 i8Var2 = d8Var.b.y;
                            o4Var2 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                            if (o4Var2 != null) {
                                o4Var3 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                                if (o4Var3.getFragmentStack().size() >= 3) {
                                    o4Var4 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                                    List fragmentStack = o4Var4.getFragmentStack();
                                    o4Var5 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(o4Var5.getFragmentStack().size() - 3);
                                    if (e2Var instanceof an) {
                                        org.telegram.messenger.g0.i3(new o1(d8Var, (an) e2Var, a10, 5), 300L);
                                    }
                                }
                            }
                            i8Var2.finishPreviewFragment();
                            break;
                        default:
                            f8 f8Var2 = this.b.b;
                            i8 i8Var3 = f8Var2.y;
                            int i11 = a10.h;
                            i8Var3.R = i11;
                            i8Var3.Q = i11;
                            i8Var3.H = true;
                            i8Var3.B0();
                            i8 i8Var4 = f8Var2.y;
                            i8Var4.u0();
                            i8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(i8Var.getParentActivity(), false, true);
            z0Var3.j(org.telegram.messenger.hd.M0(2131752089, null), R.drawable.msg_delete, null);
            z0Var3.setMinimumWidth(org.telegram.messenger.ns.q2);
            z0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c8
                public final /* synthetic */ d8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.o4 o4Var2;
                    org.telegram.ui.ActionBar.o4 o4Var3;
                    org.telegram.ui.ActionBar.o4 o4Var4;
                    switch (i7) {
                        case 0:
                            d8 d8Var = this.b;
                            i8 i8Var2 = d8Var.b.y;
                            o4Var2 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                            if (o4Var2.getFragmentStack().size() >= 3) {
                                o4Var3 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                                List fragmentStack = o4Var3.getFragmentStack();
                                o4Var4 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(o4Var4.getFragmentStack().size() - 3);
                                if (e2Var instanceof an) {
                                    org.telegram.ui.Components.t4.q(i8Var2, 1, i8Var2.getMessagesController().a2(Long.valueOf(i8Var2.y)), null, false, new ji.j(d8Var, (an) e2Var, false, 13), null);
                                }
                            }
                            i8Var2.finishPreviewFragment();
                            break;
                        default:
                            this.b.b.y.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        i8Var.w = new bi.o2(12, this.a, this);
        i8Var.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c8
            public final /* synthetic */ d8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.o4 o4Var2;
                org.telegram.ui.ActionBar.o4 o4Var3;
                org.telegram.ui.ActionBar.o4 o4Var4;
                switch (i10) {
                    case 0:
                        d8 d8Var = this.b;
                        i8 i8Var2 = d8Var.b.y;
                        o4Var2 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                        if (o4Var2.getFragmentStack().size() >= 3) {
                            o4Var3 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                            List fragmentStack = o4Var3.getFragmentStack();
                            o4Var4 = ((org.telegram.ui.ActionBar.e2) i8Var2).parentLayout;
                            org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(o4Var4.getFragmentStack().size() - 3);
                            if (e2Var instanceof an) {
                                org.telegram.ui.Components.t4.q(i8Var2, 1, i8Var2.getMessagesController().a2(Long.valueOf(i8Var2.y)), null, false, new ji.j(d8Var, (an) e2Var, false, 13), null);
                            }
                        }
                        i8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.b.b.y.finishPreviewFragment();
                        break;
                }
            }
        });
        i8Var.w.setVisibility(8);
        i8Var.w.setFitsSystemWindows(true);
        o4Var = ((org.telegram.ui.ActionBar.e2) i8Var).parentLayout;
        o4Var.getOverlayContainerView().addView(i8Var.w, c8.ja.c(-1.0f, -1));
        i8.h0(i8Var);
        i8Var.presentFragmentAsPreviewWithMenu(anVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        org.telegram.ui.ActionBar.o4 o4Var3;
        org.telegram.ui.ActionBar.o4 o4Var4;
        org.telegram.ui.ActionBar.o4 o4Var5;
        g8 a10;
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.ou ouVar;
        f8 f8Var = this.b;
        i8 i8Var = f8Var.y;
        o4Var = ((org.telegram.ui.ActionBar.e2) i8Var).parentLayout;
        if (o4Var != null) {
            if (((i8Var.f0 == 1 && f8Var.n != null) || i8Var.g0 != null) && (a10 = a(motionEvent.getX(), motionEvent.getY())) != null && (gjVar = a10.a) != null && (ouVar = i8Var.N) != null) {
                if (i8Var.g0 != null) {
                    fi.i9 orCreateStoryViewer = i8Var.getOrCreateStoryViewer();
                    Context context = f8Var.getContext();
                    org.telegram.messenger.gj gjVar2 = a10.a;
                    TL_stories.StoryItem storyItem = gjVar2.l;
                    int e12 = gjVar2.e1();
                    fi.k6 k6Var = i8Var.g0;
                    w7 w7Var = i8Var.h0;
                    orCreateStoryViewer.h = org.telegram.messenger.m10.t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(k6Var.d));
                    orCreateStoryViewer.P0 = e12;
                    orCreateStoryViewer.M(context, storyItem, arrayList, 0, k6Var, null, w7Var, true);
                } else {
                    int e13 = gjVar.e1();
                    int i7 = a10.c;
                    org.telegram.ui.Components.ys0 ys0Var = (org.telegram.ui.Components.ys0) ouVar.b;
                    org.telegram.ui.Components.ns0[] ns0VarArr = ys0Var.w1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < ns0VarArr[0].a.size(); i11++) {
                        if (((org.telegram.messenger.gj) ns0VarArr[0].a.get(i11)).e1() == e13) {
                            i10 = i11;
                        }
                    }
                    org.telegram.ui.Components.tr0 g02 = ys0Var.g0(0);
                    if (i10 < 0 || g02 == null) {
                        ys0Var.L0(0, e13, i7, true);
                    } else {
                        g02.x.h1(i10, 0);
                    }
                    if (g02 != null) {
                        g02.J = e13;
                        g02.K = false;
                    }
                    i8Var.finishFragment();
                }
            }
            if (f8Var.n != null) {
                if (i8Var.H) {
                    g8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        ValueAnimator valueAnimator = i8Var.S;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            i8Var.S = null;
                        }
                        int i12 = i8Var.Q;
                        if (i12 == 0 && i8Var.R == 0) {
                            int i13 = a11.h;
                            i8Var.R = i13;
                            i8Var.Q = i13;
                        } else {
                            int i14 = a11.h;
                            if (i12 == i14 && i8Var.R == i14) {
                                i8Var.R = 0;
                                i8Var.Q = 0;
                            } else if (i12 == i14) {
                                i8Var.Q = i8Var.R;
                            } else {
                                int i15 = i8Var.R;
                                if (i15 == i14) {
                                    i8Var.R = i12;
                                } else if (i12 != i15) {
                                    i8Var.R = i14;
                                    i8Var.Q = i14;
                                } else if (i14 > i15) {
                                    i8Var.R = i14;
                                } else {
                                    i8Var.Q = i14;
                                }
                            }
                        }
                        i8Var.B0();
                        i8Var.u0();
                        return false;
                    }
                } else {
                    g8 a12 = a(motionEvent.getX(), motionEvent.getY());
                    if (a12 != null) {
                        o4Var2 = ((org.telegram.ui.ActionBar.e2) i8Var).parentLayout;
                        if (o4Var2 != null) {
                            o4Var3 = ((org.telegram.ui.ActionBar.e2) i8Var).parentLayout;
                            if (o4Var3.getFragmentStack().size() >= 2) {
                                o4Var4 = ((org.telegram.ui.ActionBar.e2) i8Var).parentLayout;
                                List fragmentStack = o4Var4.getFragmentStack();
                                o4Var5 = ((org.telegram.ui.ActionBar.e2) i8Var).parentLayout;
                                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(o4Var5.getFragmentStack().size() - 2);
                                if (e2Var instanceof an) {
                                    i8Var.finishFragment();
                                    ((an) e2Var).ha(a12.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a12 != null && i8Var.O != null) {
                        i8Var.finishFragment();
                        i8Var.O.ha(a12.h);
                    }
                }
            }
        }
        return false;
    }
}
