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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ k8 b;

    public i8(k8 k8Var, Context context) {
        this.b = k8Var;
        this.a = context;
    }

    public final l8 a(float f7, float f10) {
        l8 l8Var;
        k8 k8Var = this.b;
        if (k8Var.n == null) {
            return null;
        }
        int i10 = k8Var.e;
        float measuredWidth = k8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < k8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (l8Var = (l8) k8Var.n.get(i12, null)) != null) {
                return l8Var;
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
        final l8 a2;
        org.telegram.ui.ActionBar.j5 j5Var;
        super.onLongPress(motionEvent);
        k8 k8Var = this.b;
        n8 n8Var = k8Var.x;
        if (n8Var.e0 != 0 || AndroidUtilities.isTablet() || (a2 = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        try {
            k8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j10 = n8Var.x;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("start_from_date", a2.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        wn wnVar = new wn(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, n8Var.getParentActivity(), n8Var.getResourceProvider());
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, n8Var.getResourceProvider());
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(n8Var.getParentActivity(), true, false);
        g1Var.j(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
        g1Var.setMinimumWidth(160);
        final int i10 = 0;
        g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.f8
            public final /* synthetic */ i8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.j5 j5Var2;
                org.telegram.ui.ActionBar.j5 j5Var3;
                org.telegram.ui.ActionBar.j5 j5Var4;
                org.telegram.ui.ActionBar.j5 j5Var5;
                switch (i10) {
                    case 0:
                        i8 i8Var = this.b;
                        n8 n8Var2 = i8Var.b.x;
                        j5Var2 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                        if (j5Var2 != null) {
                            j5Var3 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                            if (j5Var3.getFragmentStack().size() >= 3) {
                                j5Var4 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                List fragmentStack = j5Var4.getFragmentStack();
                                j5Var5 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var5.getFragmentStack().size() - 3);
                                if (r2Var instanceof wn) {
                                    AndroidUtilities.runOnUIThread(new q1(i8Var, (wn) r2Var, a2, 5), 300L);
                                }
                            }
                        }
                        n8Var2.finishPreviewFragment();
                        break;
                    default:
                        k8 k8Var2 = this.b.b;
                        n8 n8Var3 = k8Var2.x;
                        int i11 = a2.h;
                        n8Var3.Q = i11;
                        n8Var3.P = i11;
                        n8Var3.G = true;
                        n8Var3.x0();
                        n8 n8Var4 = k8Var2.x;
                        n8Var4.q0();
                        n8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        if (n8Var.d0) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(n8Var.getParentActivity(), false, false);
            g1Var2.j(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
            g1Var2.setMinimumWidth(160);
            final int i11 = 1;
            g1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.f8
                public final /* synthetic */ i8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.j5 j5Var2;
                    org.telegram.ui.ActionBar.j5 j5Var3;
                    org.telegram.ui.ActionBar.j5 j5Var4;
                    org.telegram.ui.ActionBar.j5 j5Var5;
                    switch (i11) {
                        case 0:
                            i8 i8Var = this.b;
                            n8 n8Var2 = i8Var.b.x;
                            j5Var2 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                            if (j5Var2 != null) {
                                j5Var3 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                if (j5Var3.getFragmentStack().size() >= 3) {
                                    j5Var4 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                    List fragmentStack = j5Var4.getFragmentStack();
                                    j5Var5 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var5.getFragmentStack().size() - 3);
                                    if (r2Var instanceof wn) {
                                        AndroidUtilities.runOnUIThread(new q1(i8Var, (wn) r2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            n8Var2.finishPreviewFragment();
                            break;
                        default:
                            k8 k8Var2 = this.b.b;
                            n8 n8Var3 = k8Var2.x;
                            int i112 = a2.h;
                            n8Var3.Q = i112;
                            n8Var3.P = i112;
                            n8Var3.G = true;
                            n8Var3.x0();
                            n8 n8Var4 = k8Var2.x;
                            n8Var4.q0();
                            n8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(n8Var.getParentActivity(), false, true);
            g1Var3.j(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
            g1Var3.setMinimumWidth(160);
            final int i12 = 0;
            g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.g8
                public final /* synthetic */ i8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.j5 j5Var2;
                    org.telegram.ui.ActionBar.j5 j5Var3;
                    org.telegram.ui.ActionBar.j5 j5Var4;
                    switch (i12) {
                        case 0:
                            i8 i8Var = this.b;
                            n8 n8Var2 = i8Var.b.x;
                            j5Var2 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                            if (j5Var2.getFragmentStack().size() >= 3) {
                                j5Var3 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                List fragmentStack = j5Var3.getFragmentStack();
                                j5Var4 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var4.getFragmentStack().size() - 3);
                                if (r2Var instanceof wn) {
                                    org.telegram.ui.Components.g5.q(n8Var2, 1, n8Var2.getMessagesController().getUser(Long.valueOf(n8Var2.x)), null, false, new h8(i8Var, (wn) r2Var), null);
                                }
                            }
                            n8Var2.finishPreviewFragment();
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
        n8Var.v = new bi.cc(this, this.a, 10);
        final int i13 = 1;
        n8Var.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.g8
            public final /* synthetic */ i8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.j5 j5Var2;
                org.telegram.ui.ActionBar.j5 j5Var3;
                org.telegram.ui.ActionBar.j5 j5Var4;
                switch (i13) {
                    case 0:
                        i8 i8Var = this.b;
                        n8 n8Var2 = i8Var.b.x;
                        j5Var2 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                        if (j5Var2.getFragmentStack().size() >= 3) {
                            j5Var3 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                            List fragmentStack = j5Var3.getFragmentStack();
                            j5Var4 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var4.getFragmentStack().size() - 3);
                            if (r2Var instanceof wn) {
                                org.telegram.ui.Components.g5.q(n8Var2, 1, n8Var2.getMessagesController().getUser(Long.valueOf(n8Var2.x)), null, false, new h8(i8Var, (wn) r2Var), null);
                            }
                        }
                        n8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.b.b.x.finishPreviewFragment();
                        break;
                }
            }
        });
        n8Var.v.setVisibility(8);
        n8Var.v.setFitsSystemWindows(true);
        j5Var = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
        j5Var.getOverlayContainerView().addView(n8Var.v, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        n8.d0(n8Var);
        n8Var.presentFragmentAsPreviewWithMenu(wnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.j5 j5Var3;
        org.telegram.ui.ActionBar.j5 j5Var4;
        org.telegram.ui.ActionBar.j5 j5Var5;
        l8 a2;
        MessageObject messageObject;
        li.h5 h5Var;
        k8 k8Var = this.b;
        n8 n8Var = k8Var.x;
        j5Var = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
        if (j5Var != null) {
            if (((n8Var.e0 == 1 && k8Var.n != null) || n8Var.f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.a) != null && (h5Var = n8Var.M) != null) {
                if (n8Var.f0 != null) {
                    di.y9 orCreateStoryViewer = n8Var.getOrCreateStoryViewer();
                    Context context = k8Var.getContext();
                    MessageObject messageObject2 = a2.a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    di.z6 z6Var = n8Var.f0;
                    f fVar = n8Var.g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(z6Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.H(context, storyItem, arrayList, 0, z6Var, null, fVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.c;
                    org.telegram.ui.Components.bw0 bw0Var = (org.telegram.ui.Components.bw0) h5Var.a;
                    org.telegram.ui.Components.qv0[] qv0VarArr = bw0Var.v1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < qv0VarArr[0].a.size(); i12++) {
                        if (((MessageObject) qv0VarArr[0].a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.uu0 d02 = bw0Var.d0(0);
                    if (i11 < 0 || d02 == null) {
                        bw0Var.G0(0, id3, i10, true);
                    } else {
                        d02.w.h1(i11, 0);
                    }
                    if (d02 != null) {
                        d02.I = id3;
                        d02.J = false;
                    }
                    n8Var.finishFragment();
                }
            }
            if (k8Var.n != null) {
                if (n8Var.G) {
                    l8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = n8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            n8Var.R = null;
                        }
                        int i13 = n8Var.P;
                        if (i13 == 0 && n8Var.Q == 0) {
                            int i14 = a10.h;
                            n8Var.Q = i14;
                            n8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && n8Var.Q == i15) {
                                n8Var.Q = 0;
                                n8Var.P = 0;
                            } else if (i13 == i15) {
                                n8Var.P = n8Var.Q;
                            } else {
                                int i16 = n8Var.Q;
                                if (i16 == i15) {
                                    n8Var.Q = i13;
                                } else if (i13 != i16) {
                                    n8Var.Q = i15;
                                    n8Var.P = i15;
                                } else if (i15 > i16) {
                                    n8Var.Q = i15;
                                } else {
                                    n8Var.P = i15;
                                }
                            }
                        }
                        n8Var.x0();
                        n8Var.q0();
                        return false;
                    }
                } else {
                    l8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        j5Var2 = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
                        if (j5Var2 != null) {
                            j5Var3 = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
                            if (j5Var3.getFragmentStack().size() >= 2) {
                                j5Var4 = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
                                List fragmentStack = j5Var4.getFragmentStack();
                                j5Var5 = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
                                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var5.getFragmentStack().size() - 2);
                                if (r2Var instanceof wn) {
                                    n8Var.finishFragment();
                                    ((wn) r2Var).S9(a11.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a11 != null && n8Var.N != null) {
                        n8Var.finishFragment();
                        n8Var.N.S9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
