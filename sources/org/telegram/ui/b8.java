package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ d8 b;

    public b8(d8 d8Var, Context context) {
        this.b = d8Var;
        this.a = context;
    }

    public final e8 a(float f10, float f11) {
        e8 e8Var;
        d8 d8Var = this.b;
        if (d8Var.n == null) {
            return null;
        }
        int i9 = d8Var.e;
        float measuredWidth = d8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i10 = 0;
        for (int i11 = 0; i11 < d8Var.d; i11++) {
            float f12 = (measuredWidth / 2.0f) + (i9 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i10 * dp) + AndroidUtilities.dp(44.0f);
            float f13 = dp2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= dp3 - f13 && f11 <= dp3 + f13 && (e8Var = (e8) d8Var.n.get(i11, null)) != null) {
                return e8Var;
            }
            i9++;
            if (i9 >= 7) {
                i10++;
                i9 = 0;
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
        final e8 a2;
        org.telegram.ui.ActionBar.b5 b5Var;
        super.onLongPress(motionEvent);
        d8 d8Var = this.b;
        g8 g8Var = d8Var.x;
        if (g8Var.a0 != 0 || AndroidUtilities.isTablet() || (a2 = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        try {
            d8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j10 = g8Var.x;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("start_from_date", a2.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        qn qnVar = new qn(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, g8Var.getParentActivity(), g8Var.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(g8Var.getParentActivity(), true, false);
        g1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
        g1Var.setMinimumWidth(160);
        final int i9 = 0;
        g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y7
            public final /* synthetic */ b8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.b5 b5Var2;
                org.telegram.ui.ActionBar.b5 b5Var3;
                org.telegram.ui.ActionBar.b5 b5Var4;
                org.telegram.ui.ActionBar.b5 b5Var5;
                switch (i9) {
                    case 0:
                        b8 b8Var = this.b;
                        g8 g8Var2 = b8Var.b.x;
                        b5Var2 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                        if (b5Var2 != null) {
                            b5Var3 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                            if (b5Var3.getFragmentStack().size() >= 3) {
                                b5Var4 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                List fragmentStack = b5Var4.getFragmentStack();
                                b5Var5 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var5.getFragmentStack().size() - 3);
                                if (o2Var instanceof qn) {
                                    AndroidUtilities.runOnUIThread(new t1(b8Var, (qn) o2Var, a2, 5), 300L);
                                }
                            }
                        }
                        g8Var2.finishPreviewFragment();
                        break;
                    default:
                        d8 d8Var2 = this.b.b;
                        g8 g8Var3 = d8Var2.x;
                        int i10 = a2.h;
                        g8Var3.M = i10;
                        g8Var3.L = i10;
                        g8Var3.C = true;
                        g8Var3.s0();
                        g8 g8Var4 = d8Var2.x;
                        g8Var4.n0();
                        g8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        if (g8Var.Z) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(g8Var.getParentActivity(), false, false);
            g1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
            g1Var2.setMinimumWidth(160);
            final int i10 = 1;
            g1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y7
                public final /* synthetic */ b8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    org.telegram.ui.ActionBar.b5 b5Var5;
                    switch (i10) {
                        case 0:
                            b8 b8Var = this.b;
                            g8 g8Var2 = b8Var.b.x;
                            b5Var2 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                            if (b5Var2 != null) {
                                b5Var3 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                if (b5Var3.getFragmentStack().size() >= 3) {
                                    b5Var4 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                    List fragmentStack = b5Var4.getFragmentStack();
                                    b5Var5 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var5.getFragmentStack().size() - 3);
                                    if (o2Var instanceof qn) {
                                        AndroidUtilities.runOnUIThread(new t1(b8Var, (qn) o2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            g8Var2.finishPreviewFragment();
                            break;
                        default:
                            d8 d8Var2 = this.b.b;
                            g8 g8Var3 = d8Var2.x;
                            int i102 = a2.h;
                            g8Var3.M = i102;
                            g8Var3.L = i102;
                            g8Var3.C = true;
                            g8Var3.s0();
                            g8 g8Var4 = d8Var2.x;
                            g8Var4.n0();
                            g8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(g8Var.getParentActivity(), false, true);
            g1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
            g1Var3.setMinimumWidth(160);
            final int i11 = 0;
            g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z7
                public final /* synthetic */ b8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    switch (i11) {
                        case 0:
                            b8 b8Var = this.b;
                            g8 g8Var2 = b8Var.b.x;
                            b5Var2 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                            if (b5Var2.getFragmentStack().size() >= 3) {
                                b5Var3 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                List fragmentStack = b5Var3.getFragmentStack();
                                b5Var4 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                if (o2Var instanceof qn) {
                                    org.telegram.ui.Components.y4.r(g8Var2, 1, g8Var2.getMessagesController().getUser(Long.valueOf(g8Var2.x)), null, false, new a8(b8Var, (qn) o2Var), null);
                                }
                            }
                            g8Var2.finishPreviewFragment();
                            break;
                        default:
                            this.b.b.x.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        g8Var.v = new fh.l2(this, this.a, 9);
        final int i12 = 1;
        g8Var.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z7
            public final /* synthetic */ b8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.b5 b5Var2;
                org.telegram.ui.ActionBar.b5 b5Var3;
                org.telegram.ui.ActionBar.b5 b5Var4;
                switch (i12) {
                    case 0:
                        b8 b8Var = this.b;
                        g8 g8Var2 = b8Var.b.x;
                        b5Var2 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                        if (b5Var2.getFragmentStack().size() >= 3) {
                            b5Var3 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                            List fragmentStack = b5Var3.getFragmentStack();
                            b5Var4 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                            if (o2Var instanceof qn) {
                                org.telegram.ui.Components.y4.r(g8Var2, 1, g8Var2.getMessagesController().getUser(Long.valueOf(g8Var2.x)), null, false, new a8(b8Var, (qn) o2Var), null);
                            }
                        }
                        g8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.b.b.x.finishPreviewFragment();
                        break;
                }
            }
        });
        g8Var.v.setVisibility(8);
        g8Var.v.setFitsSystemWindows(true);
        b5Var = ((org.telegram.ui.ActionBar.o2) g8Var).parentLayout;
        b5Var.getOverlayContainerView().addView(g8Var.v, g7.e6.c(-1.0f, -1));
        g8.a0(g8Var);
        g8Var.presentFragmentAsPreviewWithMenu(qnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        org.telegram.ui.ActionBar.b5 b5Var5;
        e8 a2;
        MessageObject messageObject;
        m5.c0 c0Var;
        d8 d8Var = this.b;
        g8 g8Var = d8Var.x;
        b5Var = ((org.telegram.ui.ActionBar.o2) g8Var).parentLayout;
        if (b5Var != null) {
            if (((g8Var.a0 == 1 && d8Var.n != null) || g8Var.b0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.a) != null && (c0Var = g8Var.I) != null) {
                if (g8Var.b0 != null) {
                    ih.m9 orCreateStoryViewer = g8Var.getOrCreateStoryViewer();
                    Context context = d8Var.getContext();
                    MessageObject messageObject2 = a2.a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    ih.n6 n6Var = g8Var.b0;
                    g gVar = g8Var.c0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(n6Var.d));
                    orCreateStoryViewer.L0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, n6Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i9 = a2.c;
                    org.telegram.ui.Components.eu0 eu0Var = (org.telegram.ui.Components.eu0) c0Var.b;
                    int i10 = -1;
                    for (int i11 = 0; i11 < eu0Var.p1[0].a.size(); i11++) {
                        if (((MessageObject) eu0Var.p1[0].a.get(i11)).getId() == id3) {
                            i10 = i11;
                        }
                    }
                    org.telegram.ui.Components.xs0 W = eu0Var.W(0);
                    if (i10 < 0 || W == null) {
                        eu0Var.y0(0, id3, i9, true);
                    } else {
                        W.x.h1(i10, 0);
                    }
                    if (W != null) {
                        W.F = id3;
                        W.G = false;
                    }
                    g8Var.finishFragment();
                }
            }
            if (d8Var.n != null) {
                if (g8Var.C) {
                    e8 a3 = a(motionEvent.getX(), motionEvent.getY());
                    if (a3 != null) {
                        ValueAnimator valueAnimator = g8Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            g8Var.N = null;
                        }
                        int i12 = g8Var.L;
                        if (i12 == 0 && g8Var.M == 0) {
                            int i13 = a3.h;
                            g8Var.M = i13;
                            g8Var.L = i13;
                        } else {
                            int i14 = a3.h;
                            if (i12 == i14 && g8Var.M == i14) {
                                g8Var.M = 0;
                                g8Var.L = 0;
                            } else if (i12 == i14) {
                                g8Var.L = g8Var.M;
                            } else {
                                int i15 = g8Var.M;
                                if (i15 == i14) {
                                    g8Var.M = i12;
                                } else if (i12 != i15) {
                                    g8Var.M = i14;
                                    g8Var.L = i14;
                                } else if (i14 > i15) {
                                    g8Var.M = i14;
                                } else {
                                    g8Var.L = i14;
                                }
                            }
                        }
                        g8Var.s0();
                        g8Var.n0();
                        return false;
                    }
                } else {
                    e8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.o2) g8Var).parentLayout;
                        if (b5Var2 != null) {
                            b5Var3 = ((org.telegram.ui.ActionBar.o2) g8Var).parentLayout;
                            if (b5Var3.getFragmentStack().size() >= 2) {
                                b5Var4 = ((org.telegram.ui.ActionBar.o2) g8Var).parentLayout;
                                List fragmentStack = b5Var4.getFragmentStack();
                                b5Var5 = ((org.telegram.ui.ActionBar.o2) g8Var).parentLayout;
                                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var5.getFragmentStack().size() - 2);
                                if (o2Var instanceof qn) {
                                    g8Var.finishFragment();
                                    ((qn) o2Var).G9(a10.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a10 != null && g8Var.J != null) {
                        g8Var.finishFragment();
                        g8Var.J.G9(a10.h);
                    }
                }
            }
        }
        return false;
    }
}
