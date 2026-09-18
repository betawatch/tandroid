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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class d8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ f8 b;

    public d8(f8 f8Var, Context context) {
        this.b = f8Var;
        this.a = context;
    }

    public final g8 a(float f7, float f10) {
        g8 g8Var;
        f8 f8Var = this.b;
        if (f8Var.n == null) {
            return null;
        }
        int i10 = f8Var.e;
        float measuredWidth = f8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < f8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (g8Var = (g8) f8Var.n.get(i12, null)) != null) {
                return g8Var;
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
        final g8 a2;
        org.telegram.ui.ActionBar.d5 d5Var;
        super.onLongPress(motionEvent);
        f8 f8Var = this.b;
        i8 i8Var = f8Var.x;
        if (i8Var.e0 != 0 || AndroidUtilities.isTablet() || (a2 = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        try {
            f8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j3 = i8Var.x;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("start_from_date", a2.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        zn znVar = new zn(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, i8Var.getParentActivity(), i8Var.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(i8Var.getParentActivity(), true, false);
        f1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
        f1Var.setMinimumWidth(160);
        final int i10 = 0;
        f1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a8
            public final /* synthetic */ d8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d5 d5Var2;
                org.telegram.ui.ActionBar.d5 d5Var3;
                org.telegram.ui.ActionBar.d5 d5Var4;
                org.telegram.ui.ActionBar.d5 d5Var5;
                switch (i10) {
                    case 0:
                        d8 d8Var = this.b;
                        i8 i8Var2 = d8Var.b.x;
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                        if (d5Var2 != null) {
                            d5Var3 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                            if (d5Var3.getFragmentStack().size() >= 3) {
                                d5Var4 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                                List fragmentStack = d5Var4.getFragmentStack();
                                d5Var5 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var5.getFragmentStack().size() - 3);
                                if (n2Var instanceof zn) {
                                    AndroidUtilities.runOnUIThread(new q1(d8Var, (zn) n2Var, a2, 5), 300L);
                                }
                            }
                        }
                        i8Var2.finishPreviewFragment();
                        break;
                    default:
                        f8 f8Var2 = this.b.b;
                        i8 i8Var3 = f8Var2.x;
                        int i11 = a2.h;
                        i8Var3.Q = i11;
                        i8Var3.P = i11;
                        i8Var3.G = true;
                        i8Var3.t0();
                        i8 i8Var4 = f8Var2.x;
                        i8Var4.o0();
                        i8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        if (i8Var.d0) {
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(i8Var.getParentActivity(), false, false);
            f1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
            f1Var2.setMinimumWidth(160);
            final int i11 = 1;
            f1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a8
                public final /* synthetic */ d8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    org.telegram.ui.ActionBar.d5 d5Var4;
                    org.telegram.ui.ActionBar.d5 d5Var5;
                    switch (i11) {
                        case 0:
                            d8 d8Var = this.b;
                            i8 i8Var2 = d8Var.b.x;
                            d5Var2 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                            if (d5Var2 != null) {
                                d5Var3 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                                if (d5Var3.getFragmentStack().size() >= 3) {
                                    d5Var4 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                                    List fragmentStack = d5Var4.getFragmentStack();
                                    d5Var5 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var5.getFragmentStack().size() - 3);
                                    if (n2Var instanceof zn) {
                                        AndroidUtilities.runOnUIThread(new q1(d8Var, (zn) n2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            i8Var2.finishPreviewFragment();
                            break;
                        default:
                            f8 f8Var2 = this.b.b;
                            i8 i8Var3 = f8Var2.x;
                            int i112 = a2.h;
                            i8Var3.Q = i112;
                            i8Var3.P = i112;
                            i8Var3.G = true;
                            i8Var3.t0();
                            i8 i8Var4 = f8Var2.x;
                            i8Var4.o0();
                            i8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(i8Var.getParentActivity(), false, true);
            f1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
            f1Var3.setMinimumWidth(160);
            final int i12 = 0;
            f1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b8
                public final /* synthetic */ d8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    org.telegram.ui.ActionBar.d5 d5Var4;
                    switch (i12) {
                        case 0:
                            d8 d8Var = this.b;
                            i8 i8Var2 = d8Var.b.x;
                            d5Var2 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                            if (d5Var2.getFragmentStack().size() >= 3) {
                                d5Var3 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                                List fragmentStack = d5Var3.getFragmentStack();
                                d5Var4 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 3);
                                if (n2Var instanceof zn) {
                                    org.telegram.ui.Components.e5.r(i8Var2, 1, i8Var2.getMessagesController().getUser(Long.valueOf(i8Var2.x)), null, false, new c8(d8Var, (zn) n2Var), null);
                                }
                            }
                            i8Var2.finishPreviewFragment();
                            break;
                        default:
                            this.b.b.x.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        i8Var.v = new ci.eb(this, this.a, 10);
        final int i13 = 1;
        i8Var.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b8
            public final /* synthetic */ d8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d5 d5Var2;
                org.telegram.ui.ActionBar.d5 d5Var3;
                org.telegram.ui.ActionBar.d5 d5Var4;
                switch (i13) {
                    case 0:
                        d8 d8Var = this.b;
                        i8 i8Var2 = d8Var.b.x;
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                        if (d5Var2.getFragmentStack().size() >= 3) {
                            d5Var3 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                            List fragmentStack = d5Var3.getFragmentStack();
                            d5Var4 = ((org.telegram.ui.ActionBar.n2) i8Var2).parentLayout;
                            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 3);
                            if (n2Var instanceof zn) {
                                org.telegram.ui.Components.e5.r(i8Var2, 1, i8Var2.getMessagesController().getUser(Long.valueOf(i8Var2.x)), null, false, new c8(d8Var, (zn) n2Var), null);
                            }
                        }
                        i8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.b.b.x.finishPreviewFragment();
                        break;
                }
            }
        });
        i8Var.v.setVisibility(8);
        i8Var.v.setFitsSystemWindows(true);
        d5Var = ((org.telegram.ui.ActionBar.n2) i8Var).parentLayout;
        d5Var.getOverlayContainerView().addView(i8Var.v, w7.y5.c(-1.0f, -1));
        i8.b0(i8Var);
        i8Var.presentFragmentAsPreviewWithMenu(znVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        org.telegram.ui.ActionBar.d5 d5Var5;
        g8 a2;
        MessageObject messageObject;
        ka.c cVar;
        f8 f8Var = this.b;
        i8 i8Var = f8Var.x;
        d5Var = ((org.telegram.ui.ActionBar.n2) i8Var).parentLayout;
        if (d5Var != null) {
            if (((i8Var.e0 == 1 && f8Var.n != null) || i8Var.f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.a) != null && (cVar = i8Var.M) != null) {
                if (i8Var.f0 != null) {
                    ai.jc orCreateStoryViewer = i8Var.getOrCreateStoryViewer();
                    Context context = f8Var.getContext();
                    MessageObject messageObject2 = a2.a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    ai.d9 d9Var = i8Var.f0;
                    g gVar = i8Var.g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(d9Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, d9Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.c;
                    org.telegram.ui.Components.kv0 kv0Var = (org.telegram.ui.Components.kv0) cVar.b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < kv0Var.t1[0].a.size(); i12++) {
                        if (((MessageObject) kv0Var.t1[0].a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.du0 W = kv0Var.W(0);
                    if (i11 < 0 || W == null) {
                        kv0Var.y0(0, id3, i10, true);
                    } else {
                        W.x.h1(i11, 0);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    i8Var.finishFragment();
                }
            }
            if (f8Var.n != null) {
                if (i8Var.G) {
                    g8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = i8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            i8Var.R = null;
                        }
                        int i13 = i8Var.P;
                        if (i13 == 0 && i8Var.Q == 0) {
                            int i14 = a10.h;
                            i8Var.Q = i14;
                            i8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && i8Var.Q == i15) {
                                i8Var.Q = 0;
                                i8Var.P = 0;
                            } else if (i13 == i15) {
                                i8Var.P = i8Var.Q;
                            } else {
                                int i16 = i8Var.Q;
                                if (i16 == i15) {
                                    i8Var.Q = i13;
                                } else if (i13 != i16) {
                                    i8Var.Q = i15;
                                    i8Var.P = i15;
                                } else if (i15 > i16) {
                                    i8Var.Q = i15;
                                } else {
                                    i8Var.P = i15;
                                }
                            }
                        }
                        i8Var.t0();
                        i8Var.o0();
                        return false;
                    }
                } else {
                    g8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) i8Var).parentLayout;
                        if (d5Var2 != null) {
                            d5Var3 = ((org.telegram.ui.ActionBar.n2) i8Var).parentLayout;
                            if (d5Var3.getFragmentStack().size() >= 2) {
                                d5Var4 = ((org.telegram.ui.ActionBar.n2) i8Var).parentLayout;
                                List fragmentStack = d5Var4.getFragmentStack();
                                d5Var5 = ((org.telegram.ui.ActionBar.n2) i8Var).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var5.getFragmentStack().size() - 2);
                                if (n2Var instanceof zn) {
                                    i8Var.finishFragment();
                                    ((zn) n2Var).G9(a11.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a11 != null && i8Var.N != null) {
                        i8Var.finishFragment();
                        i8Var.N.G9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
