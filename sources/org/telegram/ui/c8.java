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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ e8 b;

    public c8(e8 e8Var, Context context) {
        this.b = e8Var;
        this.a = context;
    }

    public final f8 a(float f10, float f11) {
        f8 f8Var;
        e8 e8Var = this.b;
        if (e8Var.n == null) {
            return null;
        }
        int i10 = e8Var.e;
        float measuredWidth = e8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < e8Var.d; i12++) {
            float f12 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f13 = dp2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= dp3 - f13 && f11 <= dp3 + f13 && (f8Var = (f8) e8Var.n.get(i12, null)) != null) {
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
        org.telegram.ui.ActionBar.b5 b5Var;
        super.onLongPress(motionEvent);
        e8 e8Var = this.b;
        h8 h8Var = e8Var.x;
        if (h8Var.a0 != 0 || AndroidUtilities.isTablet() || (a2 = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        try {
            e8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j10 = h8Var.x;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("start_from_date", a2.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        rn rnVar = new rn(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, h8Var.getParentActivity(), h8Var.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), true, false);
        f1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
        f1Var.setMinimumWidth(160);
        final int i10 = 0;
        f1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z7
            public final /* synthetic */ c8 b;

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
                        c8 c8Var = this.b;
                        h8 h8Var2 = c8Var.b.x;
                        b5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                        if (b5Var2 != null) {
                            b5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            if (b5Var3.getFragmentStack().size() >= 3) {
                                b5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                List fragmentStack = b5Var4.getFragmentStack();
                                b5Var5 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(b5Var5.getFragmentStack().size() - 3);
                                if (n2Var instanceof rn) {
                                    AndroidUtilities.runOnUIThread(new u1(c8Var, (rn) n2Var, a2, 5), 300L);
                                }
                            }
                        }
                        h8Var2.finishPreviewFragment();
                        break;
                    default:
                        e8 e8Var2 = this.b.b;
                        h8 h8Var3 = e8Var2.x;
                        int i11 = a2.h;
                        h8Var3.M = i11;
                        h8Var3.L = i11;
                        h8Var3.C = true;
                        h8Var3.t0();
                        h8 h8Var4 = e8Var2.x;
                        h8Var4.o0();
                        h8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        if (h8Var.Z) {
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), false, false);
            f1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
            f1Var2.setMinimumWidth(160);
            final int i11 = 1;
            f1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z7
                public final /* synthetic */ c8 b;

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
                            c8 c8Var = this.b;
                            h8 h8Var2 = c8Var.b.x;
                            b5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            if (b5Var2 != null) {
                                b5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                if (b5Var3.getFragmentStack().size() >= 3) {
                                    b5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                    List fragmentStack = b5Var4.getFragmentStack();
                                    b5Var5 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(b5Var5.getFragmentStack().size() - 3);
                                    if (n2Var instanceof rn) {
                                        AndroidUtilities.runOnUIThread(new u1(c8Var, (rn) n2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            break;
                        default:
                            e8 e8Var2 = this.b.b;
                            h8 h8Var3 = e8Var2.x;
                            int i112 = a2.h;
                            h8Var3.M = i112;
                            h8Var3.L = i112;
                            h8Var3.C = true;
                            h8Var3.t0();
                            h8 h8Var4 = e8Var2.x;
                            h8Var4.o0();
                            h8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), false, true);
            f1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
            f1Var3.setMinimumWidth(160);
            final int i12 = 0;
            f1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a8
                public final /* synthetic */ c8 b;

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
                            c8 c8Var = this.b;
                            h8 h8Var2 = c8Var.b.x;
                            b5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            if (b5Var2.getFragmentStack().size() >= 3) {
                                b5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                List fragmentStack = b5Var3.getFragmentStack();
                                b5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                if (n2Var instanceof rn) {
                                    org.telegram.ui.Components.y4.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.x)), null, false, new b8(c8Var, (rn) n2Var), null);
                                }
                            }
                            h8Var2.finishPreviewFragment();
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
        h8Var.v = new ag.s0(this, this.a, 9);
        final int i13 = 1;
        h8Var.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a8
            public final /* synthetic */ c8 b;

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
                        c8 c8Var = this.b;
                        h8 h8Var2 = c8Var.b.x;
                        b5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                        if (b5Var2.getFragmentStack().size() >= 3) {
                            b5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            List fragmentStack = b5Var3.getFragmentStack();
                            b5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                            if (n2Var instanceof rn) {
                                org.telegram.ui.Components.y4.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.x)), null, false, new b8(c8Var, (rn) n2Var), null);
                            }
                        }
                        h8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.b.b.x.finishPreviewFragment();
                        break;
                }
            }
        });
        h8Var.v.setVisibility(8);
        h8Var.v.setFitsSystemWindows(true);
        b5Var = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
        b5Var.getOverlayContainerView().addView(h8Var.v, h7.z5.c(-1.0f, -1));
        h8.b0(h8Var);
        h8Var.presentFragmentAsPreviewWithMenu(rnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        org.telegram.ui.ActionBar.b5 b5Var5;
        f8 a2;
        MessageObject messageObject;
        o0.b bVar;
        e8 e8Var = this.b;
        h8 h8Var = e8Var.x;
        b5Var = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
        if (b5Var != null) {
            if (((h8Var.a0 == 1 && e8Var.n != null) || h8Var.b0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.a) != null && (bVar = h8Var.I) != null) {
                if (h8Var.b0 != null) {
                    jh.i9 orCreateStoryViewer = h8Var.getOrCreateStoryViewer();
                    Context context = e8Var.getContext();
                    MessageObject messageObject2 = a2.a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    jh.j6 j6Var = h8Var.b0;
                    g gVar = h8Var.c0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(j6Var.d));
                    orCreateStoryViewer.L0 = id2;
                    orCreateStoryViewer.F(context, storyItem, arrayList, 0, j6Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.c;
                    org.telegram.ui.Components.hu0 hu0Var = (org.telegram.ui.Components.hu0) bVar.b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < hu0Var.p1[0].a.size(); i12++) {
                        if (((MessageObject) hu0Var.p1[0].a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.zs0 W = hu0Var.W(0);
                    if (i11 < 0 || W == null) {
                        hu0Var.y0(0, id3, i10, true);
                    } else {
                        W.x.h1(i11, 0);
                    }
                    if (W != null) {
                        W.F = id3;
                        W.G = false;
                    }
                    h8Var.finishFragment();
                }
            }
            if (e8Var.n != null) {
                if (h8Var.C) {
                    f8 a3 = a(motionEvent.getX(), motionEvent.getY());
                    if (a3 != null) {
                        ValueAnimator valueAnimator = h8Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            h8Var.N = null;
                        }
                        int i13 = h8Var.L;
                        if (i13 == 0 && h8Var.M == 0) {
                            int i14 = a3.h;
                            h8Var.M = i14;
                            h8Var.L = i14;
                        } else {
                            int i15 = a3.h;
                            if (i13 == i15 && h8Var.M == i15) {
                                h8Var.M = 0;
                                h8Var.L = 0;
                            } else if (i13 == i15) {
                                h8Var.L = h8Var.M;
                            } else {
                                int i16 = h8Var.M;
                                if (i16 == i15) {
                                    h8Var.M = i13;
                                } else if (i13 != i16) {
                                    h8Var.M = i15;
                                    h8Var.L = i15;
                                } else if (i15 > i16) {
                                    h8Var.M = i15;
                                } else {
                                    h8Var.L = i15;
                                }
                            }
                        }
                        h8Var.t0();
                        h8Var.o0();
                        return false;
                    }
                } else {
                    f8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                        if (b5Var2 != null) {
                            b5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                            if (b5Var3.getFragmentStack().size() >= 2) {
                                b5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                                List fragmentStack = b5Var4.getFragmentStack();
                                b5Var5 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(b5Var5.getFragmentStack().size() - 2);
                                if (n2Var instanceof rn) {
                                    h8Var.finishFragment();
                                    ((rn) n2Var).G9(a10.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a10 != null && h8Var.J != null) {
                        h8Var.finishFragment();
                        h8Var.J.G9(a10.h);
                    }
                }
            }
        }
        return false;
    }
}
