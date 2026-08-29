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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ c8 b;

    public a8(c8 c8Var, Context context) {
        this.b = c8Var;
        this.a = context;
    }

    public final d8 a(float f9, float f10) {
        d8 d8Var;
        c8 c8Var = this.b;
        if (c8Var.n == null) {
            return null;
        }
        int i10 = c8Var.e;
        float measuredWidth = c8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < c8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f9 >= f11 - f12 && f9 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (d8Var = (d8) c8Var.n.get(i12, null)) != null) {
                return d8Var;
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
        final d8 a2;
        org.telegram.ui.ActionBar.b5 b5Var;
        super.onLongPress(motionEvent);
        c8 c8Var = this.b;
        f8 f8Var = c8Var.x;
        if (f8Var.a0 != 0 || AndroidUtilities.isTablet() || (a2 = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        try {
            c8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j10 = f8Var.x;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("start_from_date", a2.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        tn tnVar = new tn(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, f8Var.getParentActivity(), f8Var.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(f8Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(f8Var.getParentActivity(), true, false);
        g1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
        g1Var.setMinimumWidth(160);
        final int i10 = 0;
        g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x7
            public final /* synthetic */ a8 b;

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
                        a8 a8Var = this.b;
                        f8 f8Var2 = a8Var.b.x;
                        b5Var2 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                        if (b5Var2 != null) {
                            b5Var3 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                            if (b5Var3.getFragmentStack().size() >= 3) {
                                b5Var4 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                List fragmentStack = b5Var4.getFragmentStack();
                                b5Var5 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var5.getFragmentStack().size() - 3);
                                if (o2Var instanceof tn) {
                                    AndroidUtilities.runOnUIThread(new u1(a8Var, (tn) o2Var, a2, 5), 300L);
                                }
                            }
                        }
                        f8Var2.finishPreviewFragment();
                        break;
                    default:
                        c8 c8Var2 = this.b.b;
                        f8 f8Var3 = c8Var2.x;
                        int i11 = a2.h;
                        f8Var3.M = i11;
                        f8Var3.L = i11;
                        f8Var3.C = true;
                        f8Var3.t0();
                        f8 f8Var4 = c8Var2.x;
                        f8Var4.o0();
                        f8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        if (f8Var.Z) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(f8Var.getParentActivity(), false, false);
            g1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
            g1Var2.setMinimumWidth(160);
            final int i11 = 1;
            g1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x7
                public final /* synthetic */ a8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    org.telegram.ui.ActionBar.b5 b5Var5;
                    switch (i11) {
                        case 0:
                            a8 a8Var = this.b;
                            f8 f8Var2 = a8Var.b.x;
                            b5Var2 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                            if (b5Var2 != null) {
                                b5Var3 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                if (b5Var3.getFragmentStack().size() >= 3) {
                                    b5Var4 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                    List fragmentStack = b5Var4.getFragmentStack();
                                    b5Var5 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var5.getFragmentStack().size() - 3);
                                    if (o2Var instanceof tn) {
                                        AndroidUtilities.runOnUIThread(new u1(a8Var, (tn) o2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            f8Var2.finishPreviewFragment();
                            break;
                        default:
                            c8 c8Var2 = this.b.b;
                            f8 f8Var3 = c8Var2.x;
                            int i112 = a2.h;
                            f8Var3.M = i112;
                            f8Var3.L = i112;
                            f8Var3.C = true;
                            f8Var3.t0();
                            f8 f8Var4 = c8Var2.x;
                            f8Var4.o0();
                            f8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(f8Var.getParentActivity(), false, true);
            g1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
            g1Var3.setMinimumWidth(160);
            final int i12 = 0;
            g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y7
                public final /* synthetic */ a8 b;

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
                            a8 a8Var = this.b;
                            f8 f8Var2 = a8Var.b.x;
                            b5Var2 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                            if (b5Var2.getFragmentStack().size() >= 3) {
                                b5Var3 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                List fragmentStack = b5Var3.getFragmentStack();
                                b5Var4 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                if (o2Var instanceof tn) {
                                    org.telegram.ui.Components.c5.r(f8Var2, 1, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.x)), null, false, new z7(a8Var, (tn) o2Var), null);
                                }
                            }
                            f8Var2.finishPreviewFragment();
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
        f8Var.v = new cg.h0(this, this.a, 7);
        final int i13 = 1;
        f8Var.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y7
            public final /* synthetic */ a8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.b5 b5Var2;
                org.telegram.ui.ActionBar.b5 b5Var3;
                org.telegram.ui.ActionBar.b5 b5Var4;
                switch (i13) {
                    case 0:
                        a8 a8Var = this.b;
                        f8 f8Var2 = a8Var.b.x;
                        b5Var2 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                        if (b5Var2.getFragmentStack().size() >= 3) {
                            b5Var3 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                            List fragmentStack = b5Var3.getFragmentStack();
                            b5Var4 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                            if (o2Var instanceof tn) {
                                org.telegram.ui.Components.c5.r(f8Var2, 1, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.x)), null, false, new z7(a8Var, (tn) o2Var), null);
                            }
                        }
                        f8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.b.b.x.finishPreviewFragment();
                        break;
                }
            }
        });
        f8Var.v.setVisibility(8);
        f8Var.v.setFitsSystemWindows(true);
        b5Var = ((org.telegram.ui.ActionBar.o2) f8Var).parentLayout;
        b5Var.getOverlayContainerView().addView(f8Var.v, i7.f6.c(-1.0f, -1));
        f8.b0(f8Var);
        f8Var.presentFragmentAsPreviewWithMenu(tnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        org.telegram.ui.ActionBar.b5 b5Var5;
        d8 a2;
        MessageObject messageObject;
        o1.a aVar;
        c8 c8Var = this.b;
        f8 f8Var = c8Var.x;
        b5Var = ((org.telegram.ui.ActionBar.o2) f8Var).parentLayout;
        if (b5Var != null) {
            if (((f8Var.a0 == 1 && c8Var.n != null) || f8Var.b0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.a) != null && (aVar = f8Var.I) != null) {
                if (f8Var.b0 != null) {
                    lh.i9 orCreateStoryViewer = f8Var.getOrCreateStoryViewer();
                    Context context = c8Var.getContext();
                    MessageObject messageObject2 = a2.a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    lh.k6 k6Var = f8Var.b0;
                    h hVar = f8Var.c0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(k6Var.d));
                    orCreateStoryViewer.L0 = id2;
                    orCreateStoryViewer.F(context, storyItem, arrayList, 0, k6Var, null, hVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.c;
                    org.telegram.ui.Components.qu0 qu0Var = (org.telegram.ui.Components.qu0) aVar.b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < qu0Var.p1[0].a.size(); i12++) {
                        if (((MessageObject) qu0Var.p1[0].a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.it0 W = qu0Var.W(0);
                    if (i11 < 0 || W == null) {
                        qu0Var.y0(0, id3, i10, true);
                    } else {
                        W.x.h1(i11, 0);
                    }
                    if (W != null) {
                        W.F = id3;
                        W.G = false;
                    }
                    f8Var.finishFragment();
                }
            }
            if (c8Var.n != null) {
                if (f8Var.C) {
                    d8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = f8Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            f8Var.N = null;
                        }
                        int i13 = f8Var.L;
                        if (i13 == 0 && f8Var.M == 0) {
                            int i14 = a10.h;
                            f8Var.M = i14;
                            f8Var.L = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && f8Var.M == i15) {
                                f8Var.M = 0;
                                f8Var.L = 0;
                            } else if (i13 == i15) {
                                f8Var.L = f8Var.M;
                            } else {
                                int i16 = f8Var.M;
                                if (i16 == i15) {
                                    f8Var.M = i13;
                                } else if (i13 != i16) {
                                    f8Var.M = i15;
                                    f8Var.L = i15;
                                } else if (i15 > i16) {
                                    f8Var.M = i15;
                                } else {
                                    f8Var.L = i15;
                                }
                            }
                        }
                        f8Var.t0();
                        f8Var.o0();
                        return false;
                    }
                } else {
                    d8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.o2) f8Var).parentLayout;
                        if (b5Var2 != null) {
                            b5Var3 = ((org.telegram.ui.ActionBar.o2) f8Var).parentLayout;
                            if (b5Var3.getFragmentStack().size() >= 2) {
                                b5Var4 = ((org.telegram.ui.ActionBar.o2) f8Var).parentLayout;
                                List fragmentStack = b5Var4.getFragmentStack();
                                b5Var5 = ((org.telegram.ui.ActionBar.o2) f8Var).parentLayout;
                                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var5.getFragmentStack().size() - 2);
                                if (o2Var instanceof tn) {
                                    f8Var.finishFragment();
                                    ((tn) o2Var).G9(a11.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a11 != null && f8Var.J != null) {
                        f8Var.finishFragment();
                        f8Var.J.G9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
