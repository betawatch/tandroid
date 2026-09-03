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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int i10 = g8Var.e;
        float measuredWidth = g8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < g8Var.d; i12++) {
            float f12 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f13 = dp2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= dp3 - f13 && f11 <= dp3 + f13 && (h8Var = (h8) g8Var.n.get(i12, null)) != null) {
                return h8Var;
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
        final h8 a2;
        org.telegram.ui.ActionBar.f5 f5Var;
        super.onLongPress(motionEvent);
        g8 g8Var = this.b;
        j8 j8Var = g8Var.x;
        if (j8Var.b0 != 0 || AndroidUtilities.isTablet() || (a2 = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        try {
            g8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j10 = j8Var.x;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("start_from_date", a2.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        xn xnVar = new xn(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, j8Var.getParentActivity(), j8Var.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(j8Var.getParentActivity(), true, false);
        g1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
        g1Var.setMinimumWidth(160);
        final int i10 = 0;
        g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b8
            public final /* synthetic */ e8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f5 f5Var2;
                org.telegram.ui.ActionBar.f5 f5Var3;
                org.telegram.ui.ActionBar.f5 f5Var4;
                org.telegram.ui.ActionBar.f5 f5Var5;
                switch (i10) {
                    case 0:
                        e8 e8Var = this.b;
                        j8 j8Var2 = e8Var.b.x;
                        f5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                        if (f5Var2 != null) {
                            f5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                            if (f5Var3.getFragmentStack().size() >= 3) {
                                f5Var4 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                List fragmentStack = f5Var4.getFragmentStack();
                                f5Var5 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var5.getFragmentStack().size() - 3);
                                if (p2Var instanceof xn) {
                                    AndroidUtilities.runOnUIThread(new s1(e8Var, (xn) p2Var, a2, 5), 300L);
                                }
                            }
                        }
                        j8Var2.finishPreviewFragment();
                        break;
                    default:
                        g8 g8Var2 = this.b.b;
                        j8 j8Var3 = g8Var2.x;
                        int i11 = a2.h;
                        j8Var3.N = i11;
                        j8Var3.M = i11;
                        j8Var3.D = true;
                        j8Var3.t0();
                        j8 j8Var4 = g8Var2.x;
                        j8Var4.o0();
                        j8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        if (j8Var.a0) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(j8Var.getParentActivity(), false, false);
            g1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
            g1Var2.setMinimumWidth(160);
            final int i11 = 1;
            g1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b8
                public final /* synthetic */ e8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f5 f5Var2;
                    org.telegram.ui.ActionBar.f5 f5Var3;
                    org.telegram.ui.ActionBar.f5 f5Var4;
                    org.telegram.ui.ActionBar.f5 f5Var5;
                    switch (i11) {
                        case 0:
                            e8 e8Var = this.b;
                            j8 j8Var2 = e8Var.b.x;
                            f5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                            if (f5Var2 != null) {
                                f5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                if (f5Var3.getFragmentStack().size() >= 3) {
                                    f5Var4 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                    List fragmentStack = f5Var4.getFragmentStack();
                                    f5Var5 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var5.getFragmentStack().size() - 3);
                                    if (p2Var instanceof xn) {
                                        AndroidUtilities.runOnUIThread(new s1(e8Var, (xn) p2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            j8Var2.finishPreviewFragment();
                            break;
                        default:
                            g8 g8Var2 = this.b.b;
                            j8 j8Var3 = g8Var2.x;
                            int i112 = a2.h;
                            j8Var3.N = i112;
                            j8Var3.M = i112;
                            j8Var3.D = true;
                            j8Var3.t0();
                            j8 j8Var4 = g8Var2.x;
                            j8Var4.o0();
                            j8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(j8Var.getParentActivity(), false, true);
            g1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
            g1Var3.setMinimumWidth(160);
            final int i12 = 0;
            g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c8
                public final /* synthetic */ e8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f5 f5Var2;
                    org.telegram.ui.ActionBar.f5 f5Var3;
                    org.telegram.ui.ActionBar.f5 f5Var4;
                    switch (i12) {
                        case 0:
                            e8 e8Var = this.b;
                            j8 j8Var2 = e8Var.b.x;
                            f5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                            if (f5Var2.getFragmentStack().size() >= 3) {
                                f5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                List fragmentStack = f5Var3.getFragmentStack();
                                f5Var4 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var4.getFragmentStack().size() - 3);
                                if (p2Var instanceof xn) {
                                    org.telegram.ui.Components.z4.r(j8Var2, 1, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.x)), null, false, new d8(e8Var, (xn) p2Var), null);
                                }
                            }
                            j8Var2.finishPreviewFragment();
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
        j8Var.v = new fg.h0(this, this.a, 5);
        final int i13 = 1;
        j8Var.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c8
            public final /* synthetic */ e8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f5 f5Var2;
                org.telegram.ui.ActionBar.f5 f5Var3;
                org.telegram.ui.ActionBar.f5 f5Var4;
                switch (i13) {
                    case 0:
                        e8 e8Var = this.b;
                        j8 j8Var2 = e8Var.b.x;
                        f5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                        if (f5Var2.getFragmentStack().size() >= 3) {
                            f5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                            List fragmentStack = f5Var3.getFragmentStack();
                            f5Var4 = ((org.telegram.ui.ActionBar.p2) j8Var2).parentLayout;
                            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var4.getFragmentStack().size() - 3);
                            if (p2Var instanceof xn) {
                                org.telegram.ui.Components.z4.r(j8Var2, 1, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.x)), null, false, new d8(e8Var, (xn) p2Var), null);
                            }
                        }
                        j8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.b.b.x.finishPreviewFragment();
                        break;
                }
            }
        });
        j8Var.v.setVisibility(8);
        j8Var.v.setFitsSystemWindows(true);
        f5Var = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
        f5Var.getOverlayContainerView().addView(j8Var.v, k7.c6.c(-1.0f, -1));
        j8.b0(j8Var);
        j8Var.presentFragmentAsPreviewWithMenu(xnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.f5 f5Var3;
        org.telegram.ui.ActionBar.f5 f5Var4;
        org.telegram.ui.ActionBar.f5 f5Var5;
        h8 a2;
        MessageObject messageObject;
        org.telegram.ui.Cells.f1 f1Var;
        g8 g8Var = this.b;
        j8 j8Var = g8Var.x;
        f5Var = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
        if (f5Var != null) {
            if (((j8Var.b0 == 1 && g8Var.n != null) || j8Var.c0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.a) != null && (f1Var = j8Var.J) != null) {
                if (j8Var.c0 != null) {
                    oh.i9 orCreateStoryViewer = j8Var.getOrCreateStoryViewer();
                    Context context = g8Var.getContext();
                    MessageObject messageObject2 = a2.a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    oh.l6 l6Var = j8Var.c0;
                    h hVar = j8Var.d0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(l6Var.d));
                    orCreateStoryViewer.M0 = id2;
                    orCreateStoryViewer.F(context, storyItem, arrayList, 0, l6Var, null, hVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.c;
                    org.telegram.ui.Components.yu0 yu0Var = (org.telegram.ui.Components.yu0) f1Var.b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < yu0Var.q1[0].a.size(); i12++) {
                        if (((MessageObject) yu0Var.q1[0].a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.qt0 W = yu0Var.W(0);
                    if (i11 < 0 || W == null) {
                        yu0Var.y0(0, id3, i10, true);
                    } else {
                        W.x.h1(i11, 0);
                    }
                    if (W != null) {
                        W.G = id3;
                        W.H = false;
                    }
                    j8Var.finishFragment();
                }
            }
            if (g8Var.n != null) {
                if (j8Var.D) {
                    h8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = j8Var.O;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            j8Var.O = null;
                        }
                        int i13 = j8Var.M;
                        if (i13 == 0 && j8Var.N == 0) {
                            int i14 = a10.h;
                            j8Var.N = i14;
                            j8Var.M = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && j8Var.N == i15) {
                                j8Var.N = 0;
                                j8Var.M = 0;
                            } else if (i13 == i15) {
                                j8Var.M = j8Var.N;
                            } else {
                                int i16 = j8Var.N;
                                if (i16 == i15) {
                                    j8Var.N = i13;
                                } else if (i13 != i16) {
                                    j8Var.N = i15;
                                    j8Var.M = i15;
                                } else if (i15 > i16) {
                                    j8Var.N = i15;
                                } else {
                                    j8Var.M = i15;
                                }
                            }
                        }
                        j8Var.t0();
                        j8Var.o0();
                        return false;
                    }
                } else {
                    h8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        f5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                        if (f5Var2 != null) {
                            f5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                            if (f5Var3.getFragmentStack().size() >= 2) {
                                f5Var4 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                                List fragmentStack = f5Var4.getFragmentStack();
                                f5Var5 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var5.getFragmentStack().size() - 2);
                                if (p2Var instanceof xn) {
                                    j8Var.finishFragment();
                                    ((xn) p2Var).G9(a11.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a11 != null && j8Var.K != null) {
                        j8Var.finishFragment();
                        j8Var.K.G9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
