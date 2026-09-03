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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ i8 b;

    public g8(i8 i8Var, Context context) {
        this.b = i8Var;
        this.a = context;
    }

    public final j8 a(float f10, float f11) {
        j8 j8Var;
        i8 i8Var = this.b;
        if (i8Var.n == null) {
            return null;
        }
        int i10 = i8Var.e;
        float measuredWidth = i8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < i8Var.d; i12++) {
            float f12 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f13 = dp2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= dp3 - f13 && f11 <= dp3 + f13 && (j8Var = (j8) i8Var.n.get(i12, null)) != null) {
                return j8Var;
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
        final j8 a2;
        org.telegram.ui.ActionBar.e5 e5Var;
        super.onLongPress(motionEvent);
        i8 i8Var = this.b;
        l8 l8Var = i8Var.x;
        if (l8Var.b0 != 0 || AndroidUtilities.isTablet() || (a2 = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        try {
            i8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j10 = l8Var.x;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("start_from_date", a2.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        zn znVar = new zn(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, l8Var.getParentActivity(), l8Var.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(l8Var.getParentActivity(), true, false);
        g1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
        g1Var.setMinimumWidth(160);
        final int i10 = 0;
        g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d8
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e5 e5Var2;
                org.telegram.ui.ActionBar.e5 e5Var3;
                org.telegram.ui.ActionBar.e5 e5Var4;
                org.telegram.ui.ActionBar.e5 e5Var5;
                switch (i10) {
                    case 0:
                        g8 g8Var = this.b;
                        l8 l8Var2 = g8Var.b.x;
                        e5Var2 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                        if (e5Var2 != null) {
                            e5Var3 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                            if (e5Var3.getFragmentStack().size() >= 3) {
                                e5Var4 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                                List fragmentStack = e5Var4.getFragmentStack();
                                e5Var5 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var5.getFragmentStack().size() - 3);
                                if (p2Var instanceof zn) {
                                    AndroidUtilities.runOnUIThread(new u1(g8Var, (zn) p2Var, a2, 5), 300L);
                                }
                            }
                        }
                        l8Var2.finishPreviewFragment();
                        break;
                    default:
                        i8 i8Var2 = this.b.b;
                        l8 l8Var3 = i8Var2.x;
                        int i11 = a2.h;
                        l8Var3.N = i11;
                        l8Var3.M = i11;
                        l8Var3.D = true;
                        l8Var3.t0();
                        l8 l8Var4 = i8Var2.x;
                        l8Var4.o0();
                        l8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        if (l8Var.a0) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(l8Var.getParentActivity(), false, false);
            g1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
            g1Var2.setMinimumWidth(160);
            final int i11 = 1;
            g1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d8
                public final /* synthetic */ g8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.e5 e5Var2;
                    org.telegram.ui.ActionBar.e5 e5Var3;
                    org.telegram.ui.ActionBar.e5 e5Var4;
                    org.telegram.ui.ActionBar.e5 e5Var5;
                    switch (i11) {
                        case 0:
                            g8 g8Var = this.b;
                            l8 l8Var2 = g8Var.b.x;
                            e5Var2 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                            if (e5Var2 != null) {
                                e5Var3 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                                if (e5Var3.getFragmentStack().size() >= 3) {
                                    e5Var4 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                                    List fragmentStack = e5Var4.getFragmentStack();
                                    e5Var5 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var5.getFragmentStack().size() - 3);
                                    if (p2Var instanceof zn) {
                                        AndroidUtilities.runOnUIThread(new u1(g8Var, (zn) p2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            l8Var2.finishPreviewFragment();
                            break;
                        default:
                            i8 i8Var2 = this.b.b;
                            l8 l8Var3 = i8Var2.x;
                            int i112 = a2.h;
                            l8Var3.N = i112;
                            l8Var3.M = i112;
                            l8Var3.D = true;
                            l8Var3.t0();
                            l8 l8Var4 = i8Var2.x;
                            l8Var4.o0();
                            l8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(l8Var.getParentActivity(), false, true);
            g1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
            g1Var3.setMinimumWidth(160);
            final int i12 = 0;
            g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e8
                public final /* synthetic */ g8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.e5 e5Var2;
                    org.telegram.ui.ActionBar.e5 e5Var3;
                    org.telegram.ui.ActionBar.e5 e5Var4;
                    switch (i12) {
                        case 0:
                            g8 g8Var = this.b;
                            l8 l8Var2 = g8Var.b.x;
                            e5Var2 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                            if (e5Var2.getFragmentStack().size() >= 3) {
                                e5Var3 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                                List fragmentStack = e5Var3.getFragmentStack();
                                e5Var4 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var4.getFragmentStack().size() - 3);
                                if (p2Var instanceof zn) {
                                    org.telegram.ui.Components.z4.r(l8Var2, 1, l8Var2.getMessagesController().getUser(Long.valueOf(l8Var2.x)), null, false, new f8(g8Var, (zn) p2Var), null);
                                }
                            }
                            l8Var2.finishPreviewFragment();
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
        l8Var.v = new eg.h0(this, this.a, 5);
        final int i13 = 1;
        l8Var.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e8
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e5 e5Var2;
                org.telegram.ui.ActionBar.e5 e5Var3;
                org.telegram.ui.ActionBar.e5 e5Var4;
                switch (i13) {
                    case 0:
                        g8 g8Var = this.b;
                        l8 l8Var2 = g8Var.b.x;
                        e5Var2 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                        if (e5Var2.getFragmentStack().size() >= 3) {
                            e5Var3 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                            List fragmentStack = e5Var3.getFragmentStack();
                            e5Var4 = ((org.telegram.ui.ActionBar.p2) l8Var2).parentLayout;
                            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var4.getFragmentStack().size() - 3);
                            if (p2Var instanceof zn) {
                                org.telegram.ui.Components.z4.r(l8Var2, 1, l8Var2.getMessagesController().getUser(Long.valueOf(l8Var2.x)), null, false, new f8(g8Var, (zn) p2Var), null);
                            }
                        }
                        l8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.b.b.x.finishPreviewFragment();
                        break;
                }
            }
        });
        l8Var.v.setVisibility(8);
        l8Var.v.setFitsSystemWindows(true);
        e5Var = ((org.telegram.ui.ActionBar.p2) l8Var).parentLayout;
        e5Var.getOverlayContainerView().addView(l8Var.v, k7.b6.c(-1.0f, -1));
        l8.b0(l8Var);
        l8Var.presentFragmentAsPreviewWithMenu(znVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        org.telegram.ui.ActionBar.e5 e5Var4;
        org.telegram.ui.ActionBar.e5 e5Var5;
        j8 a2;
        MessageObject messageObject;
        org.telegram.ui.Components.zz zzVar;
        i8 i8Var = this.b;
        l8 l8Var = i8Var.x;
        e5Var = ((org.telegram.ui.ActionBar.p2) l8Var).parentLayout;
        if (e5Var != null) {
            if (((l8Var.b0 == 1 && i8Var.n != null) || l8Var.c0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.a) != null && (zzVar = l8Var.J) != null) {
                if (l8Var.c0 != null) {
                    nh.i9 orCreateStoryViewer = l8Var.getOrCreateStoryViewer();
                    Context context = i8Var.getContext();
                    MessageObject messageObject2 = a2.a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    nh.l6 l6Var = l8Var.c0;
                    h hVar = l8Var.d0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(l6Var.d));
                    orCreateStoryViewer.M0 = id2;
                    orCreateStoryViewer.F(context, storyItem, arrayList, 0, l6Var, null, hVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.c;
                    org.telegram.ui.Components.yu0 yu0Var = (org.telegram.ui.Components.yu0) zzVar.b;
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
                    l8Var.finishFragment();
                }
            }
            if (i8Var.n != null) {
                if (l8Var.D) {
                    j8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = l8Var.O;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            l8Var.O = null;
                        }
                        int i13 = l8Var.M;
                        if (i13 == 0 && l8Var.N == 0) {
                            int i14 = a10.h;
                            l8Var.N = i14;
                            l8Var.M = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && l8Var.N == i15) {
                                l8Var.N = 0;
                                l8Var.M = 0;
                            } else if (i13 == i15) {
                                l8Var.M = l8Var.N;
                            } else {
                                int i16 = l8Var.N;
                                if (i16 == i15) {
                                    l8Var.N = i13;
                                } else if (i13 != i16) {
                                    l8Var.N = i15;
                                    l8Var.M = i15;
                                } else if (i15 > i16) {
                                    l8Var.N = i15;
                                } else {
                                    l8Var.M = i15;
                                }
                            }
                        }
                        l8Var.t0();
                        l8Var.o0();
                        return false;
                    }
                } else {
                    j8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        e5Var2 = ((org.telegram.ui.ActionBar.p2) l8Var).parentLayout;
                        if (e5Var2 != null) {
                            e5Var3 = ((org.telegram.ui.ActionBar.p2) l8Var).parentLayout;
                            if (e5Var3.getFragmentStack().size() >= 2) {
                                e5Var4 = ((org.telegram.ui.ActionBar.p2) l8Var).parentLayout;
                                List fragmentStack = e5Var4.getFragmentStack();
                                e5Var5 = ((org.telegram.ui.ActionBar.p2) l8Var).parentLayout;
                                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var5.getFragmentStack().size() - 2);
                                if (p2Var instanceof zn) {
                                    l8Var.finishFragment();
                                    ((zn) p2Var).G9(a11.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a11 != null && l8Var.K != null) {
                        l8Var.finishFragment();
                        l8Var.K.G9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
